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
 * It's the fourth tab in the viewPager.
 */
public class FoodFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of restaurants or bars (Food objects)
        final ArrayList<Food> food = new ArrayList<Food>();
        food.add(new Food(getString(R.string.pedrocchi),
                getString(R.string.descr_pedrocchi),
                getString(R.string.dumb_address1),
                getString(R.string.dumb_phone1),
                getString(R.string.three_euros)));
        food.add(new Food(getString(R.string.nazionale),
                getString(R.string.descr_nazionale),
                getString(R.string.dumb_address2),
                getString(R.string.dumb_phone2),
                getString(R.string.two_euros)));
        food.add(new Food(getString(R.string.graziati),
                getString(R.string.descr_graziati),
                getString(R.string.dumb_address3),
                getString(R.string.dumb_phone3),
                getString(R.string.two_euros)));
        food.add(new Food(getString(R.string.cavour),
                getString(R.string.descr_cavour),
                getString(R.string.dumb_address4),
                getString(R.string.dumb_phone4),
                getString(R.string.three_euros)));
        food.add(new Food(getString(R.string.orsucci),
                getString(R.string.descr_orsucci),
                getString(R.string.dumb_address1),
                getString(R.string.dumb_phone2),
                getString(R.string.one_euro)));
        food.add(new Food(getString(R.string.paccagnella),
                getString(R.string.descr_paccagnella),
                getString(R.string.dumb_address3),
                getString(R.string.dumb_phone1),
                getString(R.string.three_euros)));
        food.add(new Food(getString(R.string.calandre),
                getString(R.string.descr_calandre),
                getString(R.string.dumb_address1),
                getString(R.string.dumb_phone3),
                getString(R.string.four_euros)));
        food.add(new Food(getString(R.string.folperia),
                getString(R.string.descr_folperia),
                getString(R.string.dumb_address4),
                getString(R.string.dumb_phone4),
                getString(R.string.two_euros)));
        food.add(new Food(getString(R.string.nane),
                getString(R.string.descr_nane),
                getString(R.string.dumb_address1),
                getString(R.string.dumb_phone2),
                getString(R.string.three_euros)));
        food.add(new Food(getString(R.string.antico_forno),
                getString(R.string.descr_antico_forno),
                getString(R.string.dumb_address2),
                getString(R.string.dumb_phone4),
                getString(R.string.two_euros)));


        // TO DISCUSS
        // I don't think this is working
        // Create a FoodViewHolder object and use it
        FoodViewHolder holder = new FoodViewHolder(rootView);
        rootView.setTag(holder);


        // Create an {@link FoodAdapter}, whose data source is a list of {@link food}s. The
        // adapter knows how to create list items for each item in the list.
        FoodAdapter adapter = new FoodAdapter(getActivity(), food);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link FoodAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Food} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
