package com.example.android.visitouropreto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ToSeeFragment extends Fragment {


    public ToSeeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of words
        final ArrayList<Attractions> attraction = new ArrayList<Attractions>();
        attraction.add(new Attractions(R.string.to_see_title_one, R.string.to_see_text_one,
                R.drawable.saofranciscoassis, R.string.to_see_address_one, R.string.to_see_hours_one));
        attraction.add(new Attractions(R.string.to_see_title_two, R.string.to_see_text_two,
                R.drawable.itacolomi, R.string.to_see_address_one, R.string.to_see_hours_two));
        attraction.add(new Attractions(R.string.to_see_title_three, R.string.to_see_text_three,
                R.drawable.museuinconfidencia, R.string.to_see_address_one, R.string.to_see_hours_three));
        attraction.add(new Attractions(R.string.to_see_title_four, R.string.to_see_text_four,
                R.drawable.nossasenhorapilar, R.string.to_see_address_one, R.string.to_see_hours_four));
        attraction.add(new Attractions(R.string.to_see_title_five, R.string.to_see_text_five,
                R.drawable.minapassagem2, R.string.to_see_address_one, R.string.to_see_hours_five));
        attraction.add(new Attractions(R.string.to_see_title_six, R.string.to_see_text_six,
                R.drawable.casadoscontos, R.string.to_see_address_one, R.string.to_see_hours_six));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attraction);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }

}