package com.nuskin.lto2013;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
//import android.webkit.WebSettings;
//import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends Activity {
	//private WebView myWebView;
	//private WebSettings webSettings;
	private Button test, dev, prod;
	private Intent i;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		dev = (Button) findViewById(R.id.dev);
		test = (Button) findViewById(R.id.test);
		prod = (Button) findViewById(R.id.prod);
		/*myWebView = (WebView) findViewById(R.id.webView1);
		webSettings =  myWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		webSettings.setPluginsEnabled(true);
		webSettings.setBuiltInZoomControls(true);
		webSettings.setPluginState(PluginState.ON);
		//myWebView.setWebViewClient(new WebViewClient());
		myWebView.loadUrl("http://test.nuskin.com/content/lto/2013.html");*/

		dev.setOnClickListener(new View.OnClickListener()
		{
				//@Override
				public void onClick(View v) {
					String url = "http://dev.nuskin.com/content/lto/2013.html";
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse(url));
					startActivity(i);
				}
		});
		
		test.setOnClickListener(new View.OnClickListener()
		{
				//@Override
				public void onClick(View v) {
					String url = "http://test.nuskin.com/content/lto/2013.html";
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse(url));
					startActivity(i);
				}
		});
		
		prod.setOnClickListener(new View.OnClickListener()
		{
				//@Override
				public void onClick(View v) {
					String url = "http://www.nuskin.com/content/lto/2013.html";
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse(url));
					startActivity(i);
				}
		});
	}
	
	
	/*@Override
	public boolean onKeyDown(int keyCode, KeyEvent event){
		if ((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack()){
			myWebView.goBack();
			return true;
		}
		
		return super.onKeyDown(keyCode,  event);
	}*/
	
	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}*/

}
