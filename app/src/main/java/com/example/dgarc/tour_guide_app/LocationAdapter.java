package com.example.dgarc.tour_guide_app;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * LocationAdapter is an ArrayAdapter that can provide the layout for each list item
 * based on a data source, which is a list of Attraction objects.
 */
public class LocationAdapter extends ArrayAdapter<Attraction> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param attractions           is the list of Attractions to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of attractions
     */
    public LocationAdapter(Context context, ArrayList<Attraction> attractions, int colorResourceId) {
        super(context, 0, attractions);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Attraction object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID attraction_name.
        TextView attractionname = (TextView) listItemView.findViewById(R.id.attraction_name);
        // Get the attraction_name from the currentAttraction object and set this text on
        // the attraction name TextView.
        attractionname.setText(currentAttraction.getAttractionNameId());

        // Find the TextView in the list_item.xml layout with the ID address.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.attraction_address);
        // Get the address from the currentAttraction object and set this text on
        // the address TextView.
        defaultTextView.setText(currentAttraction.getAttractionAddressId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // display the provided image based on the resource Image resource
        imageView.setImageResource(currentAttraction.getImageResourceId());
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout containing 2 TextViews and 1 imageview so that it can
        // be shown in the ListView.
        return listItemView;
    }
}