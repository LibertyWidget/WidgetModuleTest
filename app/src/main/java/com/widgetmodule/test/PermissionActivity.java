package com.widgetmodule.test;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.util.easy.Easy;
import com.util.widget.BaseTextView;

import java.util.List;

public class PermissionActivity extends AppCompatActivity implements View.OnClickListener, Easy.PermissionCallbacks {

    private int CALL_PHONE_REQUEST_CODE = 123;
    String[] mPermissionList = new String[]{Manifest.permission.CAMERA};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.permission_layout);

        if (Easy.has(this, mPermissionList)) {
            Log.e("tag", "已经有权限了");
        } else {
            Easy.request(this, "需要相机的权限", CALL_PHONE_REQUEST_CODE, mPermissionList);
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Easy.onResult(requestCode, permissions, grantResults);
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onClick(View v) {
    }

    @Override
    public void onPermissionsGranted(int requestCode, @NonNull List<String> perms) {
        Log.e("tag", "onPermissionsGranted" + requestCode);
    }

    @Override
    public void onPermissionsDenied(int requestCode, @NonNull List<String> perms) {
        Log.e("tag", "onPermissionsDenied" + requestCode);
    }
}
