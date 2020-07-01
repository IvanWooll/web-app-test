package com.ivanwooll.webapptest

import android.app.Activity
import android.util.Log
import android.webkit.JavascriptInterface
import android.widget.Toast

class AppJavascriptInterface(private val activity: Activity) {

    @JavascriptInterface
    fun androidFunction() {
        Toast.makeText(
            activity,
            "WebView javascript function called Android function!",
            Toast.LENGTH_SHORT
        ).show()
        Log.i("android function", "called")
    }
}