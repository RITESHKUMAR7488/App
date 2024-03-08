package com.example.webview

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import com.example.webview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        with(binding){

        }
         @SuppressLint("SetJavaScriptEnabled")
         @RequiresApi(Build.VERSION_CODES.O)
         fun webViewSetup(webView: WebView){
             webView.webViewClient= WebViewClient()

             webView.apply {
                 settings.javaScriptEnabled=true
                 settings.safeBrowsingEnabled=true
                 loadUrl("https://chat.openai.com/c/3e622f7b-2270-49d5-a1c5-950b8570b9ee")
             }

        }
    }
}