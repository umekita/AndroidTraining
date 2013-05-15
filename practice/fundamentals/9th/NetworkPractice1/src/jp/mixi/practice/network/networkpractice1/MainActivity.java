package jp.mixi.practice.network.networkpractice1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private void disableConnectionReuseIfNecessary() {
		// HTTP connection reuse which was buggy pre-froyo
		if (Integer.parseInt(Build.VERSION.SDK) < Build.VERSION_CODES.FROYO) {
			System.setProperty("http.keepAlive", "false");
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		disableConnectionReuseIfNecessary();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		View buttonGet = findViewById(R.id.buttonGet);
		buttonGet.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// http getの処理を書く
				TextView urlText = (TextView) findViewById(R.id.accessUrl);
				URL url;
				try {
					url = new URL(urlText.getText().toString());
				} catch (MalformedURLException e) {
					Toast.makeText(v.getContext(), "無効なURLです",
							Toast.LENGTH_LONG).show();
					return;
				}
				HttpURLConnection connection = null;
				try {
					connection = (HttpURLConnection) url.openConnection();
					connection.connect();
					InputStream is = connection.getInputStream();

					StringBuilder src = new StringBuilder();
					while (true) {
						byte[] line = new byte[1024];
						int size = is.read(line);
						if (size <= 0)
							break;
						src.append(new String(line, "euc-jp"));
					}
					TextView res = (TextView) findViewById(R.id.responce);
					res.setText(src.toString());
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					connection.disconnect();
				}
			}
		});
		View buttonPost = findViewById(R.id.buttonPost);
		buttonPost.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// http postの処理を書く
				TextView urlText = (TextView) findViewById(R.id.accessUrl);
				URL url;
				try {
					url = new URL(urlText.getText().toString());
				} catch (MalformedURLException e) {
					Toast.makeText(v.getContext(), "無効なURLです",
							Toast.LENGTH_LONG).show();
					return;
				}
				HttpURLConnection connection = null;
				try {
					connection = (HttpURLConnection) url.openConnection();
					connection.setRequestMethod("POST");
					connection.setDoOutput(true);

					TextView param = (TextView) findViewById(R.id.httpBody);
					String postData = param.getText().toString();
					OutputStream os = connection.getOutputStream();
					os.write(postData.getBytes());
					os.flush();
					os.close();

					InputStream is = connection.getInputStream();

					StringBuilder src = new StringBuilder();
					while (true) {
						byte[] line = new byte[1024];
						int size = is.read(line);
						if (size <= 0)
							break;
						src.append(new String(line, "euc-jp"));
					TextView res = (TextView) findViewById(R.id.responce);
					res.setText(src.toString());
					}
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					connection.disconnect();
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
