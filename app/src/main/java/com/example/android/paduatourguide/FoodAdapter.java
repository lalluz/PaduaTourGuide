package com.example.android.paduatourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Adapt the ArrayAdapter in order to show five textviews.
 */

public class FoodAdapter extends ArrayAdapter<Food> {

    public FoodAdapter(Activity context, ArrayList<Food> food) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for five TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, food);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.food_list_item, parent, false);
        }

        // Get the {@linkFood} object located at this position in the list
        Food currentRestaurant = getItem(position);

        // Find the TextView in the food_list_item.xml layout
        TextView restaurantNameTextView = (TextView) ListItemView.findViewById(R.id.restaurant_name);
        // Get the restaurant name from the current Food object and set the text
        restaurantNameTextView.setText(currentRestaurant.getRestaurantName());

        // Find the TextView in the list_item.xml layout
        TextView restaurantDescriptionTextView = (TextView) ListItemView.findViewById(R.id.restaurant_description);
        // Get the description from the current Food object and set the text
        restaurantDescriptionTextView.setText(currentRestaurant.getRestaurantDescription());

        // Find the TextView in the food_list_item.xml layout
        TextView restaurantAddressTextView = (TextView) ListItemView.findViewById(R.id.restaurant_address);
        // Get the address from the current Food object and set the text
        restaurantAddressTextView.setText(currentRestaurant.getRestaurantAddress());

        // Find the TextView in the food_list_item.xml layout
        TextView restaurantTelephoneTextView = (TextView) ListItemView.findViewById(R.id.restaurant_telephone);
        // Get the telephone from the current Food object and set the text
        restaurantTelephoneTextView.setText(currentRestaurant.getRestaurantTelephone());

        // Find the TextView in the food_list_item.xml layout
        TextView restaurantPriceTextView = (TextView) ListItemView.findViewById(R.id.restaurant_price);
        // Get the price from the current Food object and set the text
        restaurantPriceTextView.setText(currentRestaurant.getRestaurantPrice());

        // Return the whole list item layout (containing five TextViews)
        // so that it can be shown in the ListView
        return ListItemView;
    }
}
