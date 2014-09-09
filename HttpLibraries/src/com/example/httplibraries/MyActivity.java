package com.example.httplibraries;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MyActivity extends Activity {

	private ListView listView = null;
	private ListAdapter customAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listView = (ListView) findViewById(R.id.video_list_view);
	}

	@Override
	protected void onResume() {
		super.onResume();
		new BackgroundAsyncTask().execute();
	}

	public class BackgroundAsyncTask extends AsyncTask<String, Void, String> {

		@Override
		protected String doInBackground(String... params) {
			ResponseFetcher fetchData = new ResponseFetcher();
			List<YouTubeEntry> jsonData = fetchData.responseDataUsingOkHttp();
			if (jsonData != null) {
				setListAdapter(jsonData);
			}
			return null;
		}

		private void setListAdapter(List<YouTubeEntry> jsonData) {
			String[] stockArr = new String[parseVideoObjects(jsonData).size()];
			stockArr = parseVideoObjects(jsonData).toArray(stockArr);
			ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_layout, stockArr);
			customAdapter = arrayAdapter;
		}

		@Override
		protected void onPostExecute(String result) {
			listView.setAdapter(customAdapter);
		}

		@Override
		protected void onPreExecute() {

		}

		@Override
		protected void onProgressUpdate(Void... values) {
		}

		private List<String> parseVideoObjects(List<YouTubeEntry> jsonData) {
			List<String> list = new ArrayList<String>();
			for (YouTubeEntry youTubeEntry : jsonData) {
				list.add(youTubeEntry.getTitle());
			}
			return list;
		}
	}
}
