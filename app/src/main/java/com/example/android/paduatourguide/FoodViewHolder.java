package com.example.android.paduatourguide;

import android.view.View;
import android.widget.TextView;

/**
 * ViewHolder for Food list
 */

public class FoodViewHolder {
    /** Name of the restaurant */
    private TextView restaurantNameTextView;

    /** Short description */
    private TextView restaurantDescriptionTextView;

    /** Address */
    private TextView restaurantAddressTextView;

    /** Telephone */
    private TextView restaurantTelephoneTextView;

    /** Price */
    private TextView restaurantPriceTextView;

    /** Constructor */
    public FoodViewHolder(View view) {
        this.restaurantNameTextView = (TextView)view
                .findViewById(R.id.restaurant_name);
        this.restaurantDescriptionTextView = (TextView)view
                .findViewById(R.id.restaurant_description);
        this.restaurantAddressTextView = (TextView)view
                .findViewById(R.id.restaurant_address);
        this.restaurantTelephoneTextView = (TextView)view
                .findViewById(R.id.restaurant_telephone);
        this.restaurantPriceTextView = (TextView)view
                .findViewById(R.id.restaurant_price);
    }

}
