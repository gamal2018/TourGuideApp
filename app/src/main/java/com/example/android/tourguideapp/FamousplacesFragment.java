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
public class FamousplacesFragment extends Fragment {


    public FamousplacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<place> placess = new ArrayList<place>();
        placess.add(new place(R.string.Assiut_University_title, R.string.Assiut_University_location,
                R.drawable.asyut_university));
        placess.add(new place(R.string.Azhar_University_title, R.string.Azhar_University_location,
                R.drawable.alazhar_university));
        placess.add(new place(R.string.Assiut_Barrage_title, R.string.Assiut_Barrage_location,
                R.drawable.assiut_barrage));
        placess.add(new place(R.string.Alexan_title, R.string.Alexan_location,
                R.drawable.alexan_pasha));
        placess.add(new place(R.string.Culvert_Antar_title, R.string.Culvert_Antar_location,
                R.drawable.culvert_antar));

        placeAdapter adapter = new placeAdapter(getActivity(), placess, R.color.places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return listView;
    }

}
