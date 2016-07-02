package com.linearexample.user.onscrolllinearlayout;

import android.content.Context;

import android.util.Log;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReQuestandParsing {

    private List<String> mGridData;
    TestModel testModel;
    Context cxt;

    ReQuestandParsing(Context context)
    {
        cxt = context;
        testModel = new TestModel();
        mGridData = new ArrayList<String>();
    }

    String getJSONObject(String _url) throws Exception {



        OkHttpClient client;
        String json = null;




        Log.d("Func", "in Online");
        try {


            Request request = new Request.Builder()
                    .url(_url)
                    .build();
            client = new OkHttpClient();


            final Call call = client.newCall(request);
            Response response = call.execute();
            if (response.isSuccessful())
                json = response.body().string();


        } catch (IOException e) {
            Log.d("TAG", "Exception: " + e.toString());
        }

        return json;
    }

    List<String> parseResult(String result) {

        if (result != null) {
            Gson gson = new Gson();
            testModel = gson.fromJson(result, TestModel.class);

            if (testModel != null) {
                for (TestModel.DataEntity entity : testModel.getData()) {

                    mGridData.add(entity.getImages().getFixed_height_downsampled().getUrl());
                    mGridData.add(entity.getImages().getFixed_height_small().getUrl());
                    mGridData.add(entity.getImages().getFixed_height_small_still().getUrl());
                    mGridData.add(entity.getImages().getFixed_height_still().getUrl());
                    mGridData.add(entity.getImages().getDownsized().getUrl());
                    mGridData.add(entity.getImages().getDownsized_large().getUrl());
                    mGridData.add(entity.getImages().getDownsized_medium().getUrl());
                    mGridData.add(entity.getImages().getDownsized_still().getUrl());
                    mGridData.add(entity.getImages().getFixed_width().getUrl());
                    mGridData.add(entity.getImages().getFixed_width_downsampled().getUrl());
                    mGridData.add(entity.getImages().getFixed_width_small().getUrl());
                    mGridData.add(entity.getImages().getFixed_width_still().getUrl());
                    mGridData.add(entity.getImages().getFixed_width_small_still().getUrl());
                    mGridData.add(entity.getImages().getOriginal().getUrl());
                    mGridData.add(entity.getImages().getOriginal_still().getUrl());


                }
            }
        }

        return mGridData;
    }


}

