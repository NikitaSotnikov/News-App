package com.example.nikitasotnikov.newsapp;

/**
 * Created by nikitasotnikov on 11.09.2017.
 */


public class News {

    private String mTitle;
    private String mSectionName;
    private String mDate;
    private String mUrl;


    /**
     * Constructs a new {@link News} object.
     *
     * @param title       is the title of the news
     * @param sectionName is the name of section news for website
     * @param date        is the date of the news
     * @param url         is the url of the news
     */
    public News(String title, String sectionName, String date, String url) {
        mTitle = title;
        mSectionName = sectionName;
        mDate = date;
        mUrl = url;
    }

    /**
     * @return mTitle of news
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * @return mSectionName of news
     */
    public String getSectionName() {
        return mSectionName;
    }

    /**
     * @return mDate (time) of news
     */
    public String getDate() {
        return mDate;
    }

    /**
     * @return mUrl of news
     */
    public String getUrl() {
        return mUrl;
    }

}
