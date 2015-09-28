package com.example.drbzdream.mommemory;

import android.app.TabActivity;
import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.TextView;


public class TabFragment1 extends Fragment {

    private ListView list;
    private String[] strListview;
    private  TextView text;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.tab_fragment_1, container, false);

        list = (ListView) v.findViewById(R.id.list_of_pregnancy);
        text =  (TextView) v.findViewById(R.id.text);
        strListview = getResources().getStringArray(R.array.pregnancy_data_list);

        ArrayAdapter<String> objAdapter = new ArrayAdapter<String>(this.getActivity(), R.layout.item,R.id.data_name, strListview);
        list.setAdapter(objAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainCategories.this, "You Click" + strListview[position], 5000.0).show();
                String msg = "Clicked at position " + String.valueOf(position);
                text.setText(msg);
            }
        });
        return v;
        //ListView list = (ListView)v.findViewById(R.id.list_of_pregnancy);

        //return rootView;
       // ((TextView)v.findViewById(R.id.text)).setText("tab 1");

        //return inflater.inflate(R.layout.tab_fragment_1, container, false);
    }





       /* ListView list = (ListView)findViewById(R.id.list_of_pregnancy);

    }*/

}
