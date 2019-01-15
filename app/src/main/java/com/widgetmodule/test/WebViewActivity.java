package com.widgetmodule.test;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;

import com.tencent.smtt.export.external.interfaces.ClientCertRequest;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.HttpAuthHandler;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceError;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.sdk.ValueCallback;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebStorage;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;
import com.util.web.X5WebView;

public class WebViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_layout);
        X5WebView webView = findViewById(R.id.webView);
        webView.loadUrl("http://www.baidu.com");

        webView.setWebChromeClient(new WebChromeClient() {
            /**
             * 代表这个主机应用会创建一个新的窗口
             */
            @Override
            public void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, WebStorage.QuotaUpdater quotaUpdater) {
                super.onExceededDatabaseQuota(s, s1, l, l1, l2, quotaUpdater);
            }

            /**
             * 第一次张海报
             * @return
             */
            @Override
            public Bitmap getDefaultVideoPoster() {
                return super.getDefaultVideoPoster();
            }

            /**
             * 获得所有访问历史项目的列表，用于链接着色
             */
            @Override
            public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
                super.getVisitedHistory(valueCallback);
            }

            /**
             * 将JavaScript的调试信息提交给主机应用。ChromeClient覆写此方法来展示调试过程中的日志。
             */
            @Override
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            /**
             * 请求主机应用创建一个新窗口。如果主机应用选择响应这个请求
             */
            @Override
            public boolean onCreateWindow(WebView webView, boolean b, boolean b1, Message message) {
                return super.onCreateWindow(webView, b, b1, message);
            }

            /**
             * 当前一个调用onGeolocationPermissionsShowPrompt() 取消时，通知主机应用请求地理定位权限。隐藏相关的UI。
             */
            @Override
            public void onGeolocationPermissionsHidePrompt() {
                super.onGeolocationPermissionsHidePrompt();
            }

            @Override
            public void onGeolocationPermissionsShowPrompt(String s, GeolocationPermissionsCallback geolocationPermissionsCallback) {
                super.onGeolocationPermissionsShowPrompt(s, geolocationPermissionsCallback);
            }

            /**
             * 退出视频通知。
             */
            @Override
            public void onHideCustomView() {
                super.onHideCustomView();
            }

            /**
             * 通知应用程序显示javascript alert对话框，如果应用程序返回true内核认为应用程序处理这个消息，返回false，内核自己处理。
             */
            @Override
            public boolean onJsAlert(WebView webView, String s, String s1, JsResult jsResult) {
                return super.onJsAlert(webView, s, s1, jsResult);
            }

            /**
             * 通知应用程序显示javascript Confirm对话框，如果应用程序返回true内核认为应用程序处理这个消息，返回false，内核自己处理。
             */
            @Override
            public boolean onJsConfirm(WebView webView, String s, String s1, JsResult jsResult) {
                return super.onJsConfirm(webView, s, s1, jsResult);
            }

            /**
             * 通知应用程序显示一个prompt对话框。如果应用程序返回true内核认为应用程序处理这个消息，返回false，内核自己处理。
             */
            @Override
            public boolean onJsPrompt(WebView webView, String s, String s1, String s2, JsPromptResult jsPromptResult) {
                return super.onJsPrompt(webView, s, s1, s2, jsPromptResult);
            }

            /**
             * 通知应用程序显示一个对话框，让用户选择是否离开当前页面，这个回调是javascript中的onbeforeunload事件，如果客户端返回true，内核会认为客户端提供对话框。默认行为是return false。
             */
            @Override
            public boolean onJsBeforeUnload(WebView webView, String s, String s1, JsResult jsResult) {
                return super.onJsBeforeUnload(webView, s, s1, jsResult);
            }

            /**
             * 该方法在 API level 17 被弃用
             */
            @Override
            public boolean onJsTimeout() {
                return super.onJsTimeout();
            }

            /**
             * 通知应用网页的加载进度。
             * @param webView
             * @param i
             */
            @Override
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
            }

            /**
             * 该方法在 API level 19 被弃用
             * @param l
             * @param l1
             * @param quotaUpdater
             */
            @Override
            public void onReachedMaxAppCacheSize(long l, long l1, WebStorage.QuotaUpdater quotaUpdater) {
                super.onReachedMaxAppCacheSize(l, l1, quotaUpdater);
            }

            /**
             * 当前页面有个新的图标时候，会回调这个函数。
             * @param webView
             * @param bitmap
             */
            @Override
            public void onReceivedIcon(WebView webView, Bitmap bitmap) {
                super.onReceivedIcon(webView, bitmap);
            }

            /**
             * 通知应用程序 apple-touch-icon的 url 。
             * @param webView
             * @param s
             * @param b
             */
            @Override
            public void onReceivedTouchIconUrl(WebView webView, String s, boolean b) {
                super.onReceivedTouchIconUrl(webView, s, b);
            }

            /**
             * 当document 的title变化时，会通知应用程序
             */
            @Override
            public void onReceivedTitle(WebView webView, String s) {
                super.onReceivedTitle(webView, s);
            }

            /**
             * webview请求得到焦点，发生这个主要是当前webview不是前台状态，是后台webview。
             */
            @Override
            public void onRequestFocus(WebView webView) {
                super.onRequestFocus(webView);
            }

            /**
             * 该方法在 API level 18 被弃用
             */
            @Override
            public void onShowCustomView(View view, IX5WebChromeClient.CustomViewCallback customViewCallback) {
                super.onShowCustomView(view, customViewCallback);
            }

            /**
             * 添加自 API level 7
             * 通知主机应用webview需要显示一个custom view，主要是用在视频全屏 HTML5 Video support。
             */
            @Override
            public void onShowCustomView(View view, int i, IX5WebChromeClient.CustomViewCallback customViewCallback) {
                super.onShowCustomView(view, i, customViewCallback);
            }

            /**
             * 通知主机主机应用WebView关闭了，并在需要的时候从view系统中移除它。
             * @param webView
             */
            @Override
            public void onCloseWindow(WebView webView) {
                super.onCloseWindow(webView);
            }

            /**
             * 播放视频时，在第一帧呈现之前，需要花一定的时间来进行数据缓冲。
             * @return
             */
            @Override
            public View getVideoLoadingProgressView() {
                return super.getVideoLoadingProgressView();
            }

            @Override
            public void openFileChooser(ValueCallback<Uri> valueCallback, String s, String s1) {
                super.openFileChooser(valueCallback, s, s1);
            }

            @Override
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }
        });
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onLoadResource(WebView webView, String s) {
                super.onLoadResource(webView, s);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView webView, String s) {
                return super.shouldOverrideUrlLoading(webView, s);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }

            @Override
            public void onPageStarted(WebView webView, String s, Bitmap bitmap) {
                super.onPageStarted(webView, s, bitmap);
            }

            @Override
            public void onPageFinished(WebView webView, String s) {
                super.onPageFinished(webView, s);
            }

            @Override
            public void onReceivedError(WebView webView, int i, String s, String s1) {
                super.onReceivedError(webView, i, s, s1);
            }

            @Override
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }

            @Override
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override
            public WebResourceResponse shouldInterceptRequest(WebView webView, String s) {
                return super.shouldInterceptRequest(webView, s);
            }

            @Override
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }

            @Override
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, Bundle bundle) {
                return super.shouldInterceptRequest(webView, webResourceRequest, bundle);
            }

            @Override
            public void doUpdateVisitedHistory(WebView webView, String s, boolean b) {
                super.doUpdateVisitedHistory(webView, s, b);
            }

            @Override
            public void onFormResubmission(WebView webView, Message message, Message message1) {
                super.onFormResubmission(webView, message, message1);
            }

            @Override
            public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String s, String s1) {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, s, s1);
            }

            @Override
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override
            public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }

            @Override
            public void onScaleChanged(WebView webView, float v, float v1) {
                super.onScaleChanged(webView, v, v1);
            }

            @Override
            public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }

            @Override
            public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
                return super.shouldOverrideKeyEvent(webView, keyEvent);
            }

            @Override
            public void onTooManyRedirects(WebView webView, Message message, Message message1) {
                super.onTooManyRedirects(webView, message, message1);
            }

            @Override
            public void onReceivedLoginRequest(WebView webView, String s, String s1, String s2) {
                super.onReceivedLoginRequest(webView, s, s1, s2);
            }

            @Override
            public void onDetectedBlankScreen(String s, int i) {
                super.onDetectedBlankScreen(s, i);
            }
        });
    }
}
