package com.xmqn.yxsr;
import android.annotation.SuppressLint;import android.app.Activity;import android.os.Bundle;import android.webkit.*;
public class MainActivity extends Activity {
    private WebView webView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override protected void onCreate(Bundle b){super.onCreate(b);
        webView=new WebView(this);WebSettings s=webView.getSettings();
        s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setAllowFileAccess(true);
        s.setAllowFileAccessFromFileURLs(true);s.setAllowUniversalAccessFromFileURLs(true);
        s.setSupportZoom(false);s.setBuiltInZoomControls(false);s.setDisplayZoomControls(false);
        s.setMixedContentMode(0);s.setCacheMode(WebSettings.LOAD_DEFAULT);
        s.setDefaultTextEncodingName("UTF-8");s.setLoadWithOverviewMode(true);s.setUseWideViewPort(true);
        webView.setLongClickable(false);webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/index.html");setContentView(webView);}
    @Override public void onBackPressed(){if(webView!=null&&webView.canGoBack())webView.goBack();else super.onBackPressed();}
}