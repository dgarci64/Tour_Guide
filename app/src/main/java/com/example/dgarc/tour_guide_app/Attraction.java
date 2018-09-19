package com.example.dgarc.tour_guide_app;

/**
 * Attraction represents a site that the user may want to visit.
 * It contains resource IDs for the name , address, and image file for that attraction.
 */
public class Attraction {

    /**
     * String resource ID for the address of the attraction
     */
    private int mAttractionAddressId;

    /**
     * String resource ID for the name of the attraction
     */
    private int mAttractionNameId;

    /**
     * Image resource ID for the attraction
     */
    private int mImageResourceId;

    /**
     * Create a new Attraction object.
     *
     * @param attractionAdressId is the string resource ID for the location of the attraction
     * @param attractionNameId is the string resource Id for the name of the attraction.
     * @param imageResourceId is the drawable resource ID for the image associated with the attraction
     */
    public Attraction(int attractionAdressId, int attractionNameId, int imageResourceId) {
        mAttractionAddressId = attractionAdressId;
        mAttractionNameId = attractionNameId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the address of the attraction.
     */
    public int getAttractionAddressId() {
        return mAttractionAddressId;
    }

    /**
     * Get the string resource ID for the name of the attraction.
     */
    public int getAttractionNameId() {
        return mAttractionNameId;
    }

    /**
     * Return the image resource ID of the attraction.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }



}