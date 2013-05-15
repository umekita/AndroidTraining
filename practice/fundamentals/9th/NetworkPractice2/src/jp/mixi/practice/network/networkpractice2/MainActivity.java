package jp.mixi.practice.network.networkpractice2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import jp.mixi.practice.network.networkpractice2.R;
import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View buttonGet = (Button)findViewById(R.id.buttonGet);
        buttonGet.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // http getの処理を書く
				TextView urlText = (TextView) findViewById(R.id.accessUrl);
				HttpClient client = new DefaultHttpClient();
			      try {
			          String result = client.execute(new HttpGet(urlText.getText().toString()),
			                  new ResponseHandler<String>() {
			                      public String handleResponse(HttpResponse response)
			                              throws ClientProtocolException, IOException {
			                          return EntityUtils.toString(response.getEntity());
			                      }
			                  });
						TextView res = (TextView) findViewById(R.id.responce);
						res.setText(result);
			      } catch (IOException e) {
			          e.printStackTrace();
			      }
            }
        });
        
        View buttonPost = findViewById(R.id.buttonPost);
        buttonPost.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // http postの処理を書く
				TextView urlText = (TextView) findViewById(R.id.accessUrl);
				HttpClient client = new DefaultHttpClient();
			      try {
			          String result = client.execute(new HttpPost(urlText.getText().toString()),
			                  new ResponseHandler<String>() {
			                      public String handleResponse(HttpResponse response)
			                              throws ClientProtocolException, IOException {
			                          return EntityUtils.toString(response.getEntity());
			                      }
			                  });
						TextView res = (TextView) findViewById(R.id.responce);
						res.setText(result);
			      } catch (IOException e) {
			          e.printStackTrace();
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
