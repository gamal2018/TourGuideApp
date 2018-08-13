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
public class HospitalsFragment extends Fragment {


    public HospitalsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<place> placess = new ArrayList<place>();
        placess.add(new place(R.string.Alhayat_Hospital_title, R.string.Alhayat_Hospital_location,
                R.drawable.al_hayah));
        placess.add(new place(R.string.Assiut_University_Hospital_title, R.string.Assiut_University_Hospital_location,
                R.drawable.assiut_university_hospital));
        placess.add(new place(R.string.El_Zahraa_Hospital_title, R.string.El_Zahraa_Hospital_location,
                R.drawable.el_zahraa_hospital));
        placess.add(new place(R.string.Al_Eman_Hospital_title, R.string.Al_Eman_Hospital_location,
                R.drawable.al_eman_hospital));
        placess.add(new place(R.string.Archangel_Hospital_title, R.string.Archangel_Hospital_location,
                R.drawable.archangel_hospital));
        placess.add(new place(R.string.El_Mabarra_Hospital_title, R.string.El_Mabarra_Hospital_location,
                R.drawable.el_mabarra_hospital));

        placeAdapter adapter = new placeAdapter(getActivity(), placess, R.color.Hospitals);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return listView;
    }

}
