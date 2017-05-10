package com.anirudh.android.news_application;

/**
 * Created by Anirudh on 3/1/2017.
 */

public class News_Display  {

    private String newsTitle;
    private String newsDate;

    private String mUrl;


    public News_Display(String newsTitle, String newsDate, String mUrl)
    {
        this.newsTitle=newsTitle;
        this.newsDate=newsDate;
        this.mUrl=mUrl;
    }
    public String getNewsTitle() {
        return newsTitle;
    }

    public String getNewsDate() {
        return newsDate;
    }

    public String getmUrl() {
        return mUrl;
    }


}
