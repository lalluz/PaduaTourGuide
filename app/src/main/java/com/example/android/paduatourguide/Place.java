package com.example.android.paduatourguide;

/**
 * {@link Place} represents a place information that will be visible in:
 * walking list item, visit list item and nearby list item.
 * It contains an image, the name of the place and a short description.
 */

public class Place {
    /** Image resource id */
    private int mImageResourceId;

    /** Name of the place */
    private String mPlaceName;

    /** Short description */
    private String mPlaceDescription;

    /**  Create a new Place object with 2 params
     * @param imageResourceId
     * @param placeName
     * @param placeDescription
     */
    public Place(int imageResourceId, String placeName, String placeDescription) {
        mImageResourceId = imageResourceId;
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
    }

    /**
     * Get place name.
     */
    public String getPlaceName() {return mPlaceName; }

    /**
     * Get place short description.
     */
    public String getPlaceDescription() {return mPlaceDescription; }

    /**
     * Get image resource id.
     */
    public int getImageResourceId() { return mImageResourceId; }

}
