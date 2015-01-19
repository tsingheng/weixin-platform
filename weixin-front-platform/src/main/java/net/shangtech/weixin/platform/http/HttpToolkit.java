
package net.shangtech.weixin.platform.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

@SuppressWarnings("deprecation")
public class HttpToolkit {
    private static HttpToolkit instance;

    private HttpClient httpClient;

    private static int timeoutSocket = 40000;

    public final static String TIMEOUT = "timeout";

    public final static String APITOKEN_INVALIDITY = "apitoken_invalidity";

    public static HttpToolkit getInstance() {
        if (instance == null) {
            instance = new HttpToolkit();
        }
        return instance;
    }

    /**
     * 重新设置useragent
     * 
     * @return
     */
    private static String getUserAgent() {
        StringBuilder sb = new StringBuilder();
//        sb.append(android.os.Build.VERSION.RELEASE);
//        sb.append(" ").append(android.os.Build.MODEL);
        return sb.toString();
    }

    public String doGet(String uri) {
        return doGet(uri, timeoutSocket);
    }

    public String doGet(String uri, int timeout) {
        HttpResponse httpResponse;
        String str = "";
        try {
            HttpGet httpGet = new HttpGet(uri);

            httpClient = SSLSocketFactoryEx.getNewHttpClient();
            httpGet.addHeader("User-Agent", getUserAgent());
            // httpClient = new DefaultHttpClient(instance.httpParameters);
            // 请求超时
            // httpClient.getParams().setParameter(CoreProtocolPNames.USER_AGENT,
            // getUserAgent());
            httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, timeout);
            // 读取超时
            httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, timeout);

            // HttpProtocolParams.setUserAgent(httpClient.getParams(),
            // getUserAgent());

            httpResponse = httpClient.execute(httpGet);
            StatusLine statusLine = httpResponse.getStatusLine();
            if (statusLine.getStatusCode() == 200) {
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                httpResponse.getEntity().writeTo(bos);
                str = new String(bos.toByteArray()).trim();
                System.out.println("request url-- >" + uri);
                bos.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            str = TIMEOUT;
        } finally {
            // 关闭连接，释放资源
            shutdownConnection();
        }

        return str;
    }

    /**
     * post网络请求
     */
    public String doPost(String url, List<NameValuePair> params) {
        return doPost(url, params, 60000);
    }

    /**
     * post网络请求
     */
    public String doPost(String url, List<NameValuePair> params, int timeout) {
        HttpPost httpRequest = new HttpPost(url);
        try {
            httpRequest.addHeader("User-Agent", getUserAgent());
            // 发出http request
            httpRequest.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            // 取得http response
            try {
                // TODO HTTPS无证书切换
                // HttpClient client = new DefaultHttpClient();
                HttpClient client = SSLSocketFactoryEx.getNewHttpClient();
                // 请求超时
                client.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, timeout);
                // 读取超时
                client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, timeout);
                HttpResponse httpResponse = client.execute(httpRequest);
                // 获取返回值
                if (httpResponse.getStatusLine().getStatusCode() == 200) {
                    // 若状态码为200，则是成功的请求,取出结果
                    String strResult = EntityUtils.toString(httpResponse.getEntity());
                    // 返回结果
                    return strResult;
                }
            } catch (ClientProtocolException e) {
                e.printStackTrace();
                return TIMEOUT;
            } catch (IOException e) {
                e.printStackTrace();
                return TIMEOUT;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return TIMEOUT;
        }
        return TIMEOUT;
    }

    /**
     * 删除BOM头
     * 
     * @param response
     * @return
     */
    public String dealwithBOM(String response) {
        long start = System.currentTimeMillis();
        String str = response;
        try {
            byte[] bytes = str.getBytes();
            byte[] newBytes = null;
            if (bytes != null && bytes.length >= 3) {
                if (bytes[0] == (byte)0xEF && bytes[1] == (byte)0xBB && bytes[2] == (byte)0xBF) {
                    newBytes = new byte[bytes.length - 3];
                    for (int i = 3, j = 0; i < bytes.length; i++, j++) {
                        newBytes[j] = bytes[i];
                    }
                }
            }
            if (newBytes != null) {
                str = new String(newBytes, "UTF-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            str = response;
        }
        long end = System.currentTimeMillis();
        System.out.println("UTF-8 无BOM的转码时间为： " + (end - start));
        return str;
    }

    public void shutdownConnection() {
        httpClient.getConnectionManager().shutdown();
    }
}
