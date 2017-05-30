package com.example.android.paduatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * It's the third tab in the viewPager.
 */
public class NearbyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of places nearby
        final ArrayList<Place> nearby = new ArrayList<Place>();
        nearby.add(new Place(R.drawable.colli,
                getString(R.string.colli), getString(R.string.descr_colli)));
        nearby.add(new Place(R.drawable.riviera_brenta,
                getString(R.string.riviera_brenta), getString(R.string.descr_riviera)));
        nearby.add(new Place(R.drawable.terme,
                getString(R.string.terme), getString(R.string.descr_terme)));
        nearby.add(new Place(R.drawable.burchiello,
                getString(R.string.burchiello), getString(R.string.descr_burchiello)));
        nearby.add(new Place(R.drawable.praglia,
                getString(R.string.praglia), getString(R.string.descr_praglia)));
        nearby.add(new Place(R.drawable.bike,
                getString(R.string.bike), getString(R.string.descr_bike)));
        nearby.add(new Place(R.drawable.cappeller,
                getString(R.string.cappeller), getString(R.string.descr_cappeller)));
        nearby.add(new Place(R.drawable.monselice,
                getString(R.string.monselice), getString(R.string.descr_monselice)));
        nearby.add(new Place(R.drawable.piazzola,
                getString(R.string.piazzola), getString(R.string.descr_piazzola)));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link nearby}s.
        // The adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), nearby);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above.
        listView.setAdapter(adapter);

        return rootView;
    }
}
