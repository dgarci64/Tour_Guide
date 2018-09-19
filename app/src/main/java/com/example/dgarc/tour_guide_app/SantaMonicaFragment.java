package com.example.dgarc.tour_guide_app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of attractions in Santa Monica
 */
public class SantaMonicaFragment extends Fragment {


    public SantaMonicaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);


        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction( R.string.Promenade_Address, R.string.Promenade,
                R.drawable.third_street_promenade));
        attractions.add(new Attraction( R.string.Pier_Address, R.string.Santa_Monica_Pier,
                R.drawable.santa_monica_pier));
        attractions.add(new Attraction( R.string.Santa_Monica_Beach_Address, R.string.Santa_Monica_Beach,
                R.drawable.santa_monica_beach));
        attractions.add(new Attraction( R.string.Aquarium_Address, R.string.Santa_Monica_Aquarium,
                R.drawable.santa_monica_pier_aquarium));

        // Create an LocationAdapter, whose data source is a list of Attractions. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), attractions, R.color.attraction_Santa_Monica);

        // Find the  ListView object in the view hierarchy of the  Activity.
        // There should be a istView with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the LocationAdapter we created above, so that the
        // ListView will display list items for each Attraction in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
