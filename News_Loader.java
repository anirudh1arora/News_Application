package com.anirudh.android.news_application;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by Anirudh on 3/2/2017.
 */

public class News_Loader extends AsyncTaskLoader<List<News_Display>> {

    private String mUrl;

    private static final String LOG_TAG = News_Loader.class.getName();


    public News_Loader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG, "Test onStartLoading");
        forceLoad();
    }

    @Override
    public List<News_Display> loadInBackground() {
        Log.i(LOG_TAG, "Test loadInBackground");
        if (mUrl == null) {
            return null;
        }
        List<News_Display> news_displays = Utils.fetchNewsData(mUrl);
        return news_displays;
    }
}
