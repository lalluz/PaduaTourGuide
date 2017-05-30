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
 * It's the second tab in the viewPager.
 */
public class VisitFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of places to visit
        final ArrayList<Place> visit = new ArrayList<Place>();
        visit.add(new Place(R.drawable.cappella_scrovegni,
                getString(R.string.cappella_scrovegni), getString(R.string.descr_capella_scrovegni)));
        visit.add(new Place(R.drawable.orto_botanico,
                getString(R.string.orto_botanico), getString(R.string.descr_orto_boanico)));
        visit.add(new Place(R.drawable.teatro_anatomico,
                getString(R.string.teatro_anatomico), getString(R.string.descr_teatro_anatomico)));
        visit.add(new Place(R.drawable.battistero_duomo,
                getString(R.string.battistero), getString(R.string.descr_battistero)));
        visit.add(new Place(R.drawable.santa_giustina,
                getString(R.string.santa_giustina), getString(R.string.descr_santa_giustina)));

        // Create a {@link PlaceAdapter}, whose data source is a list of {@link visit}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), visit);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above.
        listView.setAdapter(adapter);

        return rootView;
    }
}
