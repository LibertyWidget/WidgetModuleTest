package com.widgetmodule.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.util.widget.BaseTextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BaseTextView textView = findViewById(R.id.textView);
        textView.setText("WidgetModuleTest");
        findViewById(R.id.webview).setOnClickListener(this);
        findViewById(R.id.listview).setOnClickListener(this);
        findViewById(R.id.permissionView).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.webview:
                startActivity(new Intent(this, WebViewActivity.class));
                break;
            case R.id.listview:
                startActivity(new Intent(this, ListActivity.class));
                break;
            case R.id.permissionView:
                startActivity(new Intent(this, PermissionActivity.class));
                break;
        }
    }
}
