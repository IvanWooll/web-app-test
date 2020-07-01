package com.ivanwooll.webapptest

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Javascript required
        val settings: WebSettings = webView.settings
        settings.javaScriptEnabled = true

        webView.addJavascriptInterface(AppJavascriptInterface(this), "Android")

        webView.webViewClient = WebViewClient()
//        webView.webChromeClient = WebChromeClient()
//        webView.loadUrl(url)

        webView.loadUrl("https://ivan-wooll-website.herokuapp.com/")
    }
}