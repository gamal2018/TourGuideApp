package com.example.android.tourguideapp;

public class place {

    private int mLocationId;

    private int mTitleId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public place(int title, int location) {
        mTitleId = title;
        mLocationId = location;
    }

    public place(int title, int location, int imageResourceId) {
        mTitleId = title;
        mLocationId = location;
        mImageResourceId = imageResourceId;
    }


    public int getTitleId() {
        return mTitleId;
    }

    public int getLocationId() {
        return mLocationId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

