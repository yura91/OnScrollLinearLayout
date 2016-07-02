package com.linearexample.user.onscrolllinearlayout;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.Context;
import android.content.Loader;
import android.os.Bundle;
import android.os.Handler;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.util.Log;

public class MainActivity extends Activity  implements LoaderManager.LoaderCallbacks<List<String>> {


    private List<String> mGridData;
    private List<String> mLoadGridData;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    static final int LOADER_TIME_ID = 1;
    private LinearLayoutManager lLayout;
    Context context;
    private int ival = 0;
    private int loadLimit = 15;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = MainActivity.this;
        handler = new Handler();
        lLayout = new LinearLayoutManager(MainActivity.this);
        mGridData = new ArrayList<String>();
        mLoadGridData = new ArrayList<String>();

        Loader<List<String>> loader;

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);


        mRecyclerView.setHasFixedSize(true);


        mRecyclerView.setLayoutManager(lLayout);

        Bundle bndl = new Bundle();
        loader = getLoaderManager().initLoader(LOADER_TIME_ID, bndl, this);

        loader.forceLoad();

        mRecyclerView.addOnScrollListener(new EndlessRecyclerOnScrollListener(
                lLayout) {
            @Override
            public void onLoadMore() {


                loadMoreData();

            }

        });

    }

    private void loadData() {


        if (ival < mGridData.size()) {

            for (int i = ival; i < loadLimit; i++) {

                mLoadGridData.add(mGridData.get(ival));

                ival++;
                Log.d("Func", "" + ival);
            }
        }
    }

    private void loadMoreData() {

        Log.d("Func", "" + "Scrolled");
        loadLimit = ival + 10;

        for (int i = ival; i < loadLimit; i++) {

            if(ival < mGridData.size()) {
                mLoadGridData.add(mGridData.get(ival));
            }

            ival++;
        }

        Log.d("Func", "" + ival);
        final Runnable r = new Runnable() {
            public void run() {
                mAdapter.notifyDataSetChanged();
            }
        };

        handler.post(r);


    }

    @Override
    public Loader<List<String>> onCreateLoader(int id, Bundle args) {

        Loader<List<String>> loader = null;
        loader = new TimeLoader(this, args);
        Log.d("Func", "onCreateLoader: " + loader.hashCode());
        return loader;
    }

    @Override
    public void onLoadFinished(Loader<List<String>> loader, List<String> data) {

        mGridData = data;
        Log.d("Func", "" + mGridData.size());
        loadData();
        Log.d("Func", "" + mLoadGridData.size());
        mAdapter = new CardViewDataAdapter(context,mLoadGridData);
        mRecyclerView.setAdapter(mAdapter);

    }

    @Override
    public void onLoaderReset(Loader<List<String>> loader) {

    }
}

