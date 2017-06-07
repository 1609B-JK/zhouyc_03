package com.jk.entity.movie;

import java.io.Serializable;

/**
 * Created by lx on 2017/5/27.
 */
public class Movie implements Serializable{

    private int movieID;

    private String movieTitle;

    private String movieContent;

    private String movieImgPath;

    private String movieLinkUrl;

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieContent() {
        return movieContent;
    }

    public void setMovieContent(String movieContent) {
        this.movieContent = movieContent;
    }

    public String getMovieImgPath() {
        return movieImgPath;
    }

    public void setMovieImgPath(String movieImgPath) {
        this.movieImgPath = movieImgPath;
    }

    public String getMovieLinkUrl() {
        return movieLinkUrl;
    }

    public void setMovieLinkUrl(String movieLinkUrl) {
        this.movieLinkUrl = movieLinkUrl;
    }
}
