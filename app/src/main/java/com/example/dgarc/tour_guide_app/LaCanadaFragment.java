package com.example.dgarc.tour_guide_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of attractions in La Canada
 */
public class LaCanadaFragment extends Fragment {

    public LaCanadaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(
                R.string.Descanso_Gardens_Address,R.string.Descanso_Gardens,R.drawable.descanso_gardens));
        attractions.add(new Attraction(
                R.string.Brown_Dam_Address, R.string.Brown_Mountain_Dam,R.drawable.brown_dam));
        attractions.add(new Attraction(
                R.string.Lanterman_House_Address, R.string.Lanterman_House,R.drawable.lanterman_house));
        attractions.add(new Attraction(
                R.string.El_Prieto_Address, R.string.El_Prieto_Hiking_Trail,R.drawable.prieto_hiking));

        // Create an LocationAdapter, whose data source is a list of Attractions. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), attractions, R.color.attraction_Downtown);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the LocationAdapter we created above, so that the
        // ListView will display list items for each Attraction in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
