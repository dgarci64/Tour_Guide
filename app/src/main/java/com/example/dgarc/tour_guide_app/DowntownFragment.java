package com.example.dgarc.tour_guide_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays a list of attractions in Downtown Los Angeles.
 */
public class DowntownFragment extends Fragment {


    public DowntownFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction( R.string.Union_Station_Address, R.string.Union_Station,
                R.drawable.union_station));
        attractions.add(new Attraction( R.string.Grand_Central_Address, R.string.Grand_Central_Market,
                R.drawable.grand_central_market));
        attractions.add(new Attraction( R.string.Skyspace_Address, R.string.OUE_Skyspace_LA,
                R.drawable.oue_skyspace));
        attractions.add(new Attraction( R.string.Olvera_Street_Address, R.string.Olvera_Street,
                R.drawable.olvera_street));
        // Create an LocationAdapter, whose data source is a list of Attractions. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), attractions, R.color.attraction_Hollywood);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // attraction_list.xmlst.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the  ListView} use the LocationAdapter we created above, so that the
        // ListView will display list items for each  Attraction in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
