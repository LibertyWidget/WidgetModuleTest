package com.widgetmodule.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.util.refresh.PullToRefreshBase;
import com.util.refresh.PullToRefreshListView;
import com.widgetmodule.test.adapter.PullToRefreshListViewAdapter;

public class ListActivity extends AppCompatActivity {
    private PullToRefreshListViewAdapter mPullToRefreshListViewAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        PullToRefreshListView listView = findViewById(R.id.listView);
        listView.setOrientation(LinearLayout.VERTICAL);
        mPullToRefreshListViewAdapter = new PullToRefreshListViewAdapter(this);
        listView.setAdapter(mPullToRefreshListViewAdapter);
        listView.setMode(PullToRefreshBase.Mode.BOTH);
        listView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {

            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {

            }
        });
    }
}
