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
 *It's the first tab in the viewPager.
 */
public class WalkingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of places to see using the Place object
        final ArrayList<Place> walking = new ArrayList<Place>();
        walking.add(new Place(R.drawable.prato_della_valle,
                getString(R.string.prato_della_valle), getString(R.string.descr_prato_della_valle)));
        walking.add(new Place(R.drawable.orologio,
                getString(R.string.orologio), getString(R.string.descr_orologio)));
        walking.add(new Place(R.drawable.specola,
                getString(R.string.la_specola), getString(R.string.descr_la_specola)));
        walking.add(new Place(R.drawable.pedrocchi,
                getString(R.string.pedrocchi), getString(R.string.descr_cafe_pedrocchi)));
        walking.add(new Place(R.drawable.ghetto,
                getString(R.string.ghetto), getString(R.string.descr_ghetto)));
        walking.add(new Place(R.drawable.salone,
                getString(R.string.salone), getString(R.string.descr_salone)));
        walking.add(new Place(R.drawable.piazze,
                getString(R.string.piazze), getString(R.string.descr_piazze)));
        walking.add(new Place(R.drawable.santo,
                getString(R.string.santo), getString(R.string.descr_santo)));


        // TO DISCUSS
        // I don't think this is working
        // Create a FoodViewHolder object and use it
        FoodViewHolder holder = new FoodViewHolder(rootView);
        rootView.setTag(holder);


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link walking}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), walking);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
