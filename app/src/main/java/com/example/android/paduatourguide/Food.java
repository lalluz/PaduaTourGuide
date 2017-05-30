package com.example.android.paduatourguide;

/**
 * {@link Food} represents a restaurant or bar information that will be visible in food list item.
 * It contains the name of the business, a short description about what you should eat or drink here,
 * the address and how much it costs.
 */

public class Food {

    /** Name of the restaurant */
    private String mRestaurantName;

    /** Short description */
    private String mRestaurantDescription;

    /** Address */
    private String mRestaurantAddress;

    /** Telephone */
    private String mRestaurantTelephone;

    /** Price */
    private String mRestaurantPrice;

    /**  Create a new Food object with 5 params
     * @param restaurantName
     * @param restaurantDescription
     * @param restaurantAddress
     * @param restaurantTelephone
     * @param restaurantPrice
     */
    public Food(String restaurantName, String restaurantDescription,
                String restaurantAddress, String restaurantTelephone,
                String restaurantPrice) {

        mRestaurantName = restaurantName;
        mRestaurantDescription = restaurantDescription;
        mRestaurantAddress = restaurantAddress;
        mRestaurantTelephone = restaurantTelephone;
        mRestaurantPrice = restaurantPrice;
    }

    /**
     * Get place name.
     */
    public String getRestaurantName() {return mRestaurantName; }

    /**
     * Get restaurant short description.
     */
    public String getRestaurantDescription() {return mRestaurantDescription; }

    /**
     * Get restaurant address.
     */
    public String getRestaurantAddress() {return mRestaurantAddress; }

    /**
     * Get restaurant telephone.
     */
    public String getRestaurantTelephone() {return mRestaurantTelephone; }

    /**
     * Get restaurant price.
     */
    public String getRestaurantPrice() {return mRestaurantPrice; }

}
