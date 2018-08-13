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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<place> places = new ArrayList<place>();
        places.add(new place(R.string.KFC_title, R.string.KFC_location,
                R.drawable.kfc));

        places.add(new place(R.string.Cook_Door_title, R.string.Cook_Door_location,
                R.drawable.cook_door));

        places.add(new place(R.string.City_Crepe_Restaurant_title, R.string.City_Crepe_Restaurant_location,
                R.drawable.city_crepe_restaurant));

        places.add(new place(R.string.McDonald_Assiut_title, R.string.McDonald_Assiut_location,
                R.drawable.mac));
        places.add(new place(R.string.Spectra_Restaurant_Cafe_title, R.string.Spectra_Restaurant_Cafe_location,
                R.drawable.spectra_restaurant));


        placeAdapter adapter = new placeAdapter(getActivity(), places, R.color.Restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return listView;
    }

}
