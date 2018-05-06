package com.genesis.be.android.movielist;

/**
 * {@link Movies } should contain Movie titles as well as their genres and release dates
 * It could display an image if present
 */

public class Movies {
    //Movie Title
    private String mTitle;

    //Genre name
    private String mGenre;

    //Release date
    private String mDate;

    //Movie Image
    private int mImageResource = NO_IMAGE_FILE ;

    //Declaration for no movies with no image
    private static final int NO_IMAGE_FILE =1;

    /**
     * Constructor for movies without images
     */
    public Movies(String mTitle, String mGenre, String mDate) {
        this.mTitle = mTitle;
        this.mGenre = mGenre;
        this.mDate = mDate;
    }
    /**
     * Overloaded constructor for movies with images
     */
    public Movies(String mTitle, String mGenre, String mDate, int mImageResource) {
        this.mTitle = mTitle;
        this.mGenre = mGenre;
        this.mDate = mDate;
        this.mImageResource = mImageResource;
    }
    /**
     * Getter methods
     */
    public String getmTitle() {
        return mTitle;
    }

    public String getmGenre() {
        return mGenre;
    }

    public String getmDate() {
        return mDate;
    }

    public int getmImageResource() {
        return mImageResource;
    }
    public boolean hasImage(){
        return mImageResource != NO_IMAGE_FILE;
    }
}

