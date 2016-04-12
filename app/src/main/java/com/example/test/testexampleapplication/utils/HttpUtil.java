package com.example.test.testexampleapplication.utils;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.BinaryHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class HttpUtil {
	private static AsyncHttpClient client = new AsyncHttpClient(); // 实例话对象
	static {
		client.setTimeout(80000); // 设置链接超时，如果不设置，默认为10s
		client.addHeader("mobile-version", "android");

//		client.addHeader("Content-Type", "application/json");
//		client.getHttpClient().getParams().setParameter(ClientPNames.ALLOW_CIRCULAR_REDIRECTS, true);

	}

	public static void get1(String urlString, AsyncHttpResponseHandler res) // 用一个完整url获取一个string对象
	{
		client.get(urlString, res);
	}

	public static void get(String urlString, AsyncHttpResponseHandler res) // 用一个完整url获取一个string对象
	{
		client.get(Constants.API_BASE_URL + urlString, res);
	}

	public static void get(String urlString, RequestParams params, AsyncHttpResponseHandler res) // url里面带参数
	{
		client.get(Constants.API_BASE_URL + urlString, params, res);
	}

	public static void get(String urlString, JsonHttpResponseHandler res) // 不带参数，获取json对象或者数组
	{
		client.get(Constants.API_BASE_URL + urlString, res);
	}

	public static void get(String urlString, RequestParams params, JsonHttpResponseHandler res) // 带参数，获取json对象或者数组
	{
		client.get(Constants.API_BASE_URL + urlString, params, res);
	}

	public static void get(String uString, BinaryHttpResponseHandler bHandler) // 下载数据使用，会返回byte数据
	{
		client.get(Constants.API_BASE_URL + uString, bHandler);
	}

	public static void post(String urlString, RequestParams params, AsyncHttpResponseHandler res) { // 带参数，获取json对象或者数组

		if (params != null) {
			String temp = params.toString();
			String[] tmps = temp.split("&");
			String paras = "";
			for (int i = 0; i < tmps.length; i++) {

				String all = tmps[i];
				String key = all.substring(0, all.indexOf("="));
				if (!key.equals("summary") && (all.indexOf("=") + 1 != all.length())) {
					paras += all.substring(all.indexOf("=") + 1, all.length());
				}

			}
			// params.put("summary", GetMD5.Md5(ApiConstant.SECRETKEY + paras));
		}

		client.post(Constants.API_BASE_URL + urlString, params, res);
	}

	public static void post(String urlString, RequestParams params, JsonHttpResponseHandler res) // 带参数，获取json对象或者数组
	{
		client.post(Constants.API_BASE_URL + urlString, params, res);
	}

	public static AsyncHttpClient getClient() {
		return client;
	}




}