package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClubsFragment extends Fragment {


    public ClubsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<place> places = new ArrayList<place>();
        places.add(new place(R.string.Police_Officers_Club_title, R.string.Police_Officers_Club_location,
                R.drawable.police_officers_club));

        places.add(new place(R.string.Assiut_Sports_Club_title, R.string.Assiut_Sports_Club_location,
                R.drawable.assiut_sports_club));

        places.add(new place(R.string.Paradise_Park_title, R.string.Paradise_Park_location,
                R.drawable.paradise_park));

        places.add(new place(R.string.Engineers_Club_title, R.string.Engineers_Club_location,
                R.drawable.engineers_club));

        placeAdapter adapter = new placeAdapter(getActivity(), places, R.color.Clubs);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return listView;
    }

}
