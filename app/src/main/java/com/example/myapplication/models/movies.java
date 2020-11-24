package com.example.myapplication.models;

public class movies {

    String mtitle,mrating,mdesctiption;

    public movies(String mtitle, String mrating, String mdesctiption) {
        this.mtitle = mtitle;
        this.mrating = mrating;
        this.mdesctiption = mdesctiption;
    }

    public String getTitle() {
        return mtitle;
    }

    public void setTitle(String title) {
        this.mtitle = title;
    }

    public String getRating() {
        return mrating;
    }

    public void setRating(String rating) {
        this.mrating = rating;
    }

    public String getDesctiption() {
        return mdesctiption;
    }

    public void setDesctiption(String mdesctiption) {
        this.mdesctiption = mdesctiption;
    }

}
