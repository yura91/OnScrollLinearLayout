package com.linearexample.user.onscrolllinearlayout;

import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.content.Loader;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;


public class TimeLoader extends Loader<List<String>> {

    public static final String APP_PREFERENCES = "mysettings";
    SharedPreferences mSettings;
    private List<String> mGridData;
    TestModel testModel;
    public static final String APP_PREFERENCES_NAME = "Json";
    Context cxt;

    GetTimeTask getTimeTask;
    String format;
    ReQuestandParsing req;

    public TimeLoader(Context context,Bundle args) {
        super(context);
        cxt = context;
        req = new ReQuestandParsing(cxt);
        Log.d("Func", hashCode() + " create TimeLoader");

    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        Log.d("Func", hashCode() + " onStartLoading");
    }

    @Override
    protected void onStopLoading() {
        super.onStopLoading();
        Log.d("Func", hashCode() + " onStopLoading");
    }

    @Override
    protected void onForceLoad() {
        super.onForceLoad();
        Log.d("Func", hashCode() + " onForceLoad");
        if (getTimeTask != null)
            getTimeTask.cancel(true);
        getTimeTask = new GetTimeTask();
        getTimeTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, format);
    }

    @Override
    protected void onAbandon() {
        super.onAbandon();
        Log.d("Func", hashCode() + " onAbandon");
    }

    @Override
    protected void onReset() {
        super.onReset();
        Log.d("Func", hashCode() + " onReset");
    }

    void getResultFromTask(List<String> result) {
        deliverResult(result);
    }

    class GetTimeTask extends AsyncTask<String, Void, String> {


        @Override
        protected String doInBackground(String... params) {
            Log.d("Func", TimeLoader.this.hashCode() + " doInBackground");
            String json = null;
            String url = "http://api.giphy.com/v1/gifs/search?q=funny+cat&api_key=dc6zaTOxFJmzC";
            testModel = new TestModel();

            mGridData = new ArrayList<String>();
            mSettings = cxt.getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);

            try {

                if (isOnline()) {
                    json = req.getJSONObject(url);
                    Log.d("Func",  "JSON" + json);
                    if (json != null) {

                        ClearCache.deleteCache(cxt);
                        SharedPreferences.Editor editor = mSettings.edit();
                        editor.putString(APP_PREFERENCES_NAME, json);
                        editor.apply();
                    }


                } else {
                    String shjson = mSettings.getString(APP_PREFERENCES_NAME, "");
                    Log.d("Func", "WithoutInet" + shjson);

                    if (shjson != "") {
                        json = shjson;
                        Log.d("Func", "WithoutInetNotNull" + shjson);
                    }


                }
            } catch (InterruptedException e) {
                return null;
            } catch (Exception e) {
                e.printStackTrace();
            }


            return json;

        }
        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            List<String> list = req.parseResult(result);
            getResultFromTask(list);
        }

    }
    public boolean isOnline() {
        String cs = Context.CONNECTIVITY_SERVICE;
        ConnectivityManager cm = (ConnectivityManager)
                cxt.getSystemService(cs);
        if (cm.getActiveNetworkInfo() == null) {
            return false;
        }
        return     cm.getActiveNetworkInfo().isConnectedOrConnecting();
    }

}
