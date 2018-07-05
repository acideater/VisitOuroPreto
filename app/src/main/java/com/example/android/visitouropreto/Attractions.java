package com.example.android.visitouropreto;

public class Attractions {

    /**
     * Constant value that represents no image was provided for this attraction
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * String resource ID for the title
     */
    private int mTitleId;

    /**
     * Image resource ID for the attraction
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * String resource ID for the text
     */
    private int mTextId;

    /**
     * String resource ID for the address
     */
    private int mAddressId;

    /**
     * String resource ID for the Open Hours or Dates
     */
    private int mHoursId;

    /**
     * Create a new attraction object.
     *
     * @param titleId         is the string resource ID for the title associated with this attraction
     * @param textId          is the string resource Id for the text associated with this attraction
     * @param imageResourceId is the resource ID for the image file associated with this attraction
     * @param addressId       is the string resource Id for the address associated with this attraction
     * @param hoursId         is the string resource Id for the open hours or dates of this attraction
     */
    public Attractions(int titleId, int textId, int imageResourceId, int addressId, int hoursId) {
        mTitleId = titleId;
        mTextId = textId;
        mImageResourceId = imageResourceId;
        mAddressId = addressId;
        mHoursId = hoursId;
    }

    /**
     * Get the string resource ID for the title.
     */
    public int getTitleId() {
        return mTitleId;
    }

    /**
     * Get the string resource ID for the text.
     */
    public int getTextId() {
        return mTextId;
    }

    /**
     * Return the image resource ID of the attraction.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this attraction.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the string resource ID for the address.
     */
    public int getAddressId() {
        return mAddressId;
    }

    /**
     * Get the string resource ID for the open hours or dates.
     */
    public int getHoursId() {
        return mHoursId;
    }
}
