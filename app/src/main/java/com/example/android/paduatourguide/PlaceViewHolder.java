package com.example.android.paduatourguide;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * ViewHolder for walking, visit and nearby lists.
 */

public class PlaceViewHolder {
    /** Image resource id */
    private ImageView imageResourceIdImageView;

    /** Name of the place */
    private TextView placeNameTextView;

    /** Short description */
    private TextView placeDescriptionTextView;

    /** Constructor */
    public PlaceViewHolder(View view) {
        this.imageResourceIdImageView = (ImageView) view
                .findViewById(R.id.place_image);
        this.placeNameTextView = (TextView)view
                .findViewById(R.id.place_name);
        this.placeDescriptionTextView = (TextView)view
                .findViewById(R.id.place_description);
    }
}
