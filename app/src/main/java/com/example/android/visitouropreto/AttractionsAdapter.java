package com.example.android.visitouropreto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionsAdapter extends ArrayAdapter<Attractions> {


    /**
     * Create a new {@link AttractionsAdapter} object.
     *
     * @param context    is the current context (i.e. Activity) that the adapter is being created in.
     * @param attraction is the list of {@link Attractions}s to be displayed.
     */
    public AttractionsAdapter(Context context, ArrayList<Attractions> attraction) {
        super(context, 0, attraction);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Attraction} object located at this position in the list
        Attractions currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID attraction_title.
        TextView attractionTitleTextView = listItemView.findViewById(R.id.attraction_title);
        attractionTitleTextView.setText(currentAttraction.getTitleId());

        // Find the TextView in the list_item.xml layout with the ID attraction_text.
        TextView attractionTextTextView = listItemView.findViewById(R.id.attraction_text);
        attractionTextTextView.setText(currentAttraction.getTextId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.image);
        // Check if an image is provided for this attraction or not
        if (currentAttraction.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentAttraction.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID address.
        TextView addressTextView = listItemView.findViewById(R.id.address);
        addressTextView.setText(currentAttraction.getAddressId());

        // Find the TextView in the list_item.xml layout with the ID hours.
        TextView hoursTextView = listItemView.findViewById(R.id.hours);
        hoursTextView.setText(currentAttraction.getHoursId());

        // Return the whole list item layout so that it can be shown in
        // the ListView.
        return listItemView;
    }
}