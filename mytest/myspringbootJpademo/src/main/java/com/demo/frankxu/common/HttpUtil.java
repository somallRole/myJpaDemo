package com.demo.frankxu.common;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HttpUtil {
	protected static org.slf4j.Logger logger = LoggerFactory.getLogger(com.demo.frankxu.common.HttpUtil.class);

	private static final String DEFAULT_CHARSET = "UTF-8";
	 /**
	     * 发送Get请求
	     * @param url
	     * @return
	     * @throws NoSuchProviderException 
	     * @throws NoSuchAlgorithmException 
	     * @throws IOException 
	     * @throws KeyManagementException 
	     */
	    private static String get(String url) throws NoSuchAlgorithmException, NoSuchProviderException, IOException, KeyManagementException {
	        StringBuffer bufferRes = null;
	        TrustManager[] tm = { new MyX509TrustManager() };
	        SSLContext sslContext = SSLContext.getInstance("TLSv1.2", "SunJSSE");
	        sslContext.init(null, tm, new java.security.SecureRandom());  
	        // 从上述SSLContext对象中得到SSLSocketFactory对象  
	        SSLSocketFactory ssf = sslContext.getSocketFactory();
	        
	        URL urlGet = new URL(url);
	        HttpsURLConnection http = (HttpsURLConnection) urlGet.openConnection();
	        // 连接超时
	        http.setConnectTimeout(25000);
	        // 读取超时 --服务器响应比较慢，增大时间
	        http.setReadTimeout(25000);
	        http.setRequestMethod("GET");
	        http.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
	        http.setSSLSocketFactory(ssf);
	        http.setDoOutput(true);
	        http.setDoInput(true);
	        http.connect();
	        
	        InputStream in = http.getInputStream();
	        BufferedReader read = new BufferedReader(new InputStreamReader(in, DEFAULT_CHARSET));
	        String valueString = null;
	        bufferRes = new StringBuffer();
	        while ((valueString = read.readLine()) != null){
	            bufferRes.append(valueString);
	        }
	        in.close();
	        if (http != null) {
	            // 关闭连接
	            http.disconnect();
	        }
	        return bufferRes.toString();
	    }
	    
	    /**
	     * 发送Get请求
	     * @param url
	     * @return
	     * @throws NoSuchProviderException 
	     * @throws NoSuchAlgorithmException 
	     * @throws IOException 
	     * @throws KeyManagementException 
	     */
	    public static String get(String url,Boolean https) throws NoSuchAlgorithmException, NoSuchProviderException, IOException, KeyManagementException {
	     if(https != null && https){
	    	 return get(url);
	     }else{
	    	 	StringBuffer bufferRes = null;
	            URL urlGet = new URL(url);
	            HttpURLConnection http = (HttpURLConnection) urlGet.openConnection();
	            // 连接超时
	            http.setConnectTimeout(25000);
	            // 读取超时 --服务器响应比较慢，增大时间
	            http.setReadTimeout(25000);
	            http.setRequestMethod("GET");
	            http.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
	            http.setDoOutput(true);
	            http.setDoInput(true);
	            http.connect();
	            
	            InputStream in = http.getInputStream();
	            BufferedReader read = new BufferedReader(new InputStreamReader(in, DEFAULT_CHARSET));
	            String valueString = null;
	            bufferRes = new StringBuffer();
	            while ((valueString = read.readLine()) != null){
	                bufferRes.append(valueString);
	            }
	            in.close();
	            if (http != null) {
	                // 关闭连接
	                http.disconnect();
	            }
	            return bufferRes.toString();
	     }
	    }
	    
	    /**
	     *  发送Get请求
	     * @param url
	     * @param params
	     * @return
	     * @throws IOException 
	     * @throws NoSuchProviderException 
	     * @throws NoSuchAlgorithmException 
	     * @throws KeyManagementException 
	     */
	    public static String get(String url, Map<String, String> params) throws KeyManagementException, NoSuchAlgorithmException, NoSuchProviderException, IOException {
	        return get(initParams(url, params));
	    }
	    /**
	     *  发送Post请求
	     * @param url
	     * @param params
	     * @return
	     * @throws IOException 
	     * @throws NoSuchProviderException 
	     * @throws NoSuchAlgorithmException 
	     * @throws KeyManagementException 
	     */
	    private static String post(String url, String params) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, KeyManagementException {  	
	    	StringBuffer bufferRes = null;
	        TrustManager[] tm = { new MyX509TrustManager() };
	        SSLContext sslContext = SSLContext.getInstance("TLSv1.2", "SunJSSE");
	        sslContext.init(null, tm, new java.security.SecureRandom());
	        // 从上述SSLContext对象中得到SSLSocketFactory对象  
	        SSLSocketFactory ssf = sslContext.getSocketFactory();
	        URL urlGet = new URL(url);
	        HttpsURLConnection http = (HttpsURLConnection) urlGet.openConnection();
	        // 连接超时
	        http.setConnectTimeout(25000);
	        // 读取超时 --服务器响应比较慢，增大时间
	        http.setReadTimeout(25000);
	        http.setRequestMethod("POST");
	        http.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
	        http.setSSLSocketFactory(ssf);
	        http.setDoOutput(true);
	        http.setDoInput(true);
	        http.connect();
	        OutputStream out = http.getOutputStream();
	        out.write(params.getBytes(StandardCharsets.UTF_8));
	        out.flush();
	        out.close();
	        InputStream in = http.getInputStream();
	        BufferedReader read = new BufferedReader(new InputStreamReader(in, DEFAULT_CHARSET));
	        String valueString = null;
	        bufferRes = new StringBuffer();
	        while ((valueString = read.readLine()) != null){
	            bufferRes.append(valueString);
	        }
	        in.close();
	        if (http != null) {
	            // 关闭连接
	            http.disconnect();
	        }
	        return bufferRes.toString();
	    }
	    
	    /**
	     *  发送Post请求
	     * @param url
	     * @param params
	     * @return
	     * @throws IOException 
	     * @throws NoSuchProviderException 
	     * @throws NoSuchAlgorithmException 
	     * @throws KeyManagementException 
	     */
	    public static String post(String url, String params,Boolean https) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, KeyManagementException {
	    	 if(https != null && https){
	 	    	 return post(url,params);
	 	     }else{
	 	    	StringBuffer bufferRes = null;
		        URL urlPost = new URL(url);
		        HttpURLConnection http = (HttpURLConnection) urlPost.openConnection();
		        // 连接超时
		        http.setConnectTimeout(25000);
		        // 读取超时 --服务器响应比较慢，增大时间
		        http.setReadTimeout(25000);
		        http.setRequestMethod("POST");
		        http.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
		        http.setDoOutput(true);
		        http.setDoInput(true);
		        http.connect();
		        OutputStream out = http.getOutputStream();
		        out.write(params.getBytes(StandardCharsets.UTF_8));
		        out.flush();
		        out.close();
		        InputStream in = http.getInputStream();
		        BufferedReader read = new BufferedReader(new InputStreamReader(in, DEFAULT_CHARSET));
		        String valueString = null;
		        bufferRes = new StringBuffer();
		        while ((valueString = read.readLine()) != null){
		            bufferRes.append(valueString);
		        }
		        in.close();
		        if (http != null) {
		            // 关闭连接
		            http.disconnect();
		        }
		        return bufferRes.toString();
	 	     }
	    	
	    }
	    
	    /**
	     * 构造url
	     * @param url
	     * @param params
	     * @return
	     */
	    private static String initParams(String url, Map<String, String> params){
	        if (null == params || params.isEmpty()) {
	            return url;
	        }
	        StringBuilder sb = new StringBuilder(url);
	        if (url.indexOf("?") == -1) {
	            sb.append("?");
	        } else {
	            sb.append("&");
	        }
	        boolean first = true;
	        for (Entry<String, String> entry : params.entrySet()) {
	            if (first) {
	                first = false;
	            } else {
	                sb.append("&");
	            }
	            String key = entry.getKey();
	            String value = entry.getValue();
	            sb.append(key).append("=");
	            if (StringUtils.isNotEmpty(value)) {
	                try {
	                    sb.append(URLEncoder.encode(value, DEFAULT_CHARSET));
	                } catch (UnsupportedEncodingException e) {
	                    logger.error("context", e);
	                }
	            }
	        }
	        return sb.toString();
	    }

	public static String sendPost(String url, String param) {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(param);
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送 POST 请求出现异常！" + e);
			logger.error("context", e);
		}
		//使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				logger.error(ex.toString());
			}
		}
		return result;
	}

	/**
	 * 向指定URL发送GET方法的请求
	 *
	 * @param url   发送请求的URL
	 * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return URL 所代表远程资源的响应结果
	 */
	public static String sendGet(String url, String param) {
		String result = "";
		BufferedReader in = null;
		try {
			String urlNameString="";
			if(null != param && !param.equals("")) {
				urlNameString = url + "?" + param;
			}else {
				urlNameString = url;
			}
			URL realUrl = new URL(urlNameString);
			// 打开和URL之间的连接
			URLConnection connection = realUrl.openConnection();
			// 设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 建立实际的连接
			connection.connect();
			// 获取所有响应头字段
			Map<String, List<String>> map = connection.getHeaderFields();
			// 遍历所有的响应头字段
			for (String key : map.keySet()) {
				// System.out.println(key + "--->" + map.get(key));
			}
			// 定义 BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line+"\n";
			}
		} catch (Exception e) {
			System.out.println("发送GET请求出现异常！" + e);
			logger.error("context", e);
		}
		// 使用finally块来关闭输入流
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				logger.error(e2.toString());
			}
		}
		return result;
	}

	/**
	 * @param url
	 * @param object
	 * @return
	 * @方法名:StringPost
	 * @描述:
	 */
	public static String sendPostJSON(String url, JSONObject object) {
		String result = "";
		// 创建HttpClientBuilder
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		// HttpClient
		CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
		System.out.println("url:" + url);
		HttpPost httpPost = new HttpPost(url);
		// httpPost.setConfig(DEFAULT);
		StringEntity entity = null;
		try {
			entity = new StringEntity(object.toString(), "UTF-8");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			logger.error(e1.toString());
		}
		if( entity == null){
			return result;
		}
		// 解决中文乱码问题
		entity.setContentEncoding("UTF-8");
		entity.setContentType("application/json");
		httpPost.setEntity(entity);
		try {
			HttpResponse httpResponse;
			// post请求
			httpResponse = closeableHttpClient.execute(httpPost);

			HttpEntity httpEntity = httpResponse.getEntity();
			if (httpEntity != null) {
				// 打印响应内容
				result = EntityUtils.toString(httpEntity, "UTF-8");
				// 相应码
				int code = httpResponse.getStatusLine().getStatusCode();
				System.out.println("response:" + result + "code:" + code);
			}
			// 释放资源
			closeableHttpClient.close();
		} catch (Exception e) {
			logger.error("context", e);
		}
		return result;

	}

	public static String httpGet(String httpurl, Map<String, String> header) throws Exception {
		// 构建HttpClient的实例的应用
		DefaultHttpClient client = null;
		String respval = null;
		try {
			 client = new DefaultHttpClient();
			HttpGet get = new HttpGet(httpurl);
//		get.setHeader();
			if (header != null) {
				Set<String> keySet = header.keySet();
				for (String key : keySet) {
					get.setHeader(key, header.get(key));
				}
			}
			HttpResponse response2 = client.execute(get);
			HttpEntity entity = response2.getEntity();
			respval = EntityUtils.toString(entity);
		}finally {
			if(client != null) {
				client.close();
			}
		}

		return respval;
	}

	/**
	 * httpPost请求
	 *
	 * @param url http://jty.tunnel.qydev.com/chinaoil/api/test 格式
	 * @param map 参数类型
	 * @return
	 */
	public static String httpPost(String url, Map<String, String> map) {
		String result = "";
		//创建HttpClientBuilder
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		//HttpClient
		CloseableHttpClient closeableHttpClient = httpClientBuilder.build();

		HttpPost httpPost = new HttpPost(url);
//	       httpPost.setConfig(DEFAULT);
		// 创建参数队列
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		for (Entry<String, String> set : map.entrySet()) {
			formparams.add(new BasicNameValuePair(set.getKey(), set.getValue()));
		}
		UrlEncodedFormEntity entity;

		try {

			entity = new UrlEncodedFormEntity(formparams, "UTF-8");
			entity.setContentType("application/json");
			httpPost.setEntity(entity);


			HttpResponse httpResponse;
			//post请求
			httpResponse = closeableHttpClient.execute(httpPost);

			//getEntity()
			HttpEntity httpEntity = httpResponse.getEntity();
			if (httpEntity != null) {
				//打印响应内容
				result = EntityUtils.toString(httpEntity, "UTF-8");
			}
			//释放资源
			closeableHttpClient.close();
		} catch (Exception e) {
			logger.error("context", e);
		}
		return result;

	}

	public static String StringPost(String url, JSONObject object, Map<String, Object> header) {
		String result = "";
		//创建HttpClientBuilder
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		//HttpClient
		CloseableHttpClient closeableHttpClient = httpClientBuilder.build();

		HttpPost httpPost = new HttpPost(url);

		if (header != null) {
			Set<String> keySet = header.keySet();
			for (String key : keySet) {
				httpPost.setHeader(key, (String) header.get(key));
			}
		}

//	       httpPost.setConfig(DEFAULT);
		StringEntity entity = null;
		try {
			entity = new StringEntity(object.toString(), "utf-8");
			entity.setContentEncoding("UTF-8");
			entity.setContentType("application/json");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			logger.error(e1.toString());
		}//解决中文乱码问题
		httpPost.setEntity(entity);
		// 创建参数队列
//	       List<NameValuePair> formparams = new ArrayList<NameValuePair>();
//	       for (Entry<String, String> set : map.entrySet()) {
//	    	   formparams.add(new BasicNameValuePair(set.getKey(), set.getValue()));
//	    	   httpPost.addHeader(set.getKey(),set.getValue());

//	       }
//	       UrlEncodedFormEntity entity;
		try {
//	           entity = new UrlEncodedFormEntity(formparams, "UTF-8");
//	           entity.setContentType("application/json");
//	           httpPost.setEntity(entity);

			HttpResponse httpResponse;
			//post请求
			httpResponse = closeableHttpClient.execute(httpPost);

			//getEntity()
			HttpEntity httpEntity = httpResponse.getEntity();
			if (httpEntity != null) {
				//打印响应内容
				result = EntityUtils.toString(httpEntity, "UTF-8");
			}
			//释放资源
			closeableHttpClient.close();
		} catch (Exception e) {
			logger.error("context", e);
		}
		return result;

	}
}
