package com.example.httplibraries;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import android.util.Log;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

/**
 * Created by ayush on 04/09/14.
 */
public class ResponseFetcher {
	private static final String VIDEO_LIST_URL = "http://gdata.youtube.com/feeds/api/videos?alt=jsonc&v=2";
	private YouTubeVideoList entry = null;

	public List<YouTubeEntry> responseData() {
		Gson gson = new Gson();
		HttpURLConnection urlConnection = null;
		try {
			URL url = new URL(VIDEO_LIST_URL);
			urlConnection = (HttpURLConnection) url.openConnection();
			urlConnection.setRequestMethod("GET");
			InputStreamReader isr = new InputStreamReader(
					urlConnection.getInputStream(), "UTF-8");
			entry = gson.fromJson(isr, YouTubeVideoList.class);

		} catch (ProtocolException e) {
			Log.e("errors", e.getMessage());
		} catch (UnsupportedEncodingException e) {
			Log.e("error", e.getMessage());
		} catch (IOException e) {
			Log.e("error", e.getMessage());
		}
		return entry.data.items;
	}

	public List<YouTubeEntry> responseDataUsingOkHttp() {
		Gson gson = new Gson();
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(VIDEO_LIST_URL).build();
		Response response = null;
		try {
			response = client.newCall(request).execute();
			InputStreamReader isr = new InputStreamReader(response.body()
					.byteStream(), "UTF-8");
			entry = gson.fromJson(isr, YouTubeVideoList.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// return response.body().string();
		return entry.data.items;
	}
}
