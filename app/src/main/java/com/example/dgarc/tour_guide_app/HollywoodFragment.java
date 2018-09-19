package com.example.dgarc.tour_guide_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of attractions in Hollywood.
 */
public class HollywoodFragment extends Fragment {


    public HollywoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction( R.string.Walk_Of_Fame_Address, R.string.Walk_Of_Fame,
                R.drawable.walk_of_fame));
        attractions.add(new Attraction( R.string.Hollywood_Bowl_Address, R.string.Hollywood_Bowl,
                R.drawable.hollywood_bowl));
        attractions.add(new Attraction( R.string.Griffith_Observatory_Address, R.string.Griffith_Park_Observatory,
                R.drawable.griffith_obs));
        attractions.add(new Attraction( R.string.Runyan_Canyon_Address, R.string.Runyan_Canyon,
                R.drawable.runyon_canyon));
        // Create an LocationAdapter, whose data source is a list of Attractions. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), attractions, R.color.attraction_La_Canada);

        // Find the ListView object in the view hierarchy of the {Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the  ListView use the LocationAdapter we created above, so that the
        // ListView will display list items for each Attraction in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
