package com.example.android.paduatourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Adapt the ArrayAdapter in order to show an image and two textviews.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the ImageView in the list_item.xml layout
        ImageView imageView = (ImageView) ListItemView.findViewById(R.id.place_image);

        // Get the image id and pass it to imageView
        imageView.setImageResource(currentPlace.getImageResourceId());
        imageView.setVisibility(View.VISIBLE);

        // Find the TextView in the list_item.xml layout
        TextView placeNameTextView = (TextView) ListItemView.findViewById(R.id.place_name);
        // Get the place name from the current Place object and set the text
        placeNameTextView.setText(currentPlace.getPlaceName());

        // Find the TextView in the list_item.xml layout with the ID
        TextView placeDescriptionTextView = (TextView) ListItemView.findViewById(R.id.place_description);
        // Get the place description from the current Place object and set the text
        placeDescriptionTextView.setText(currentPlace.getPlaceDescription());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return ListItemView;
    }
}
