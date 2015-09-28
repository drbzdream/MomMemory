package com.example.drbzdream.mommemory;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class TabFragment3 extends Fragment {

    private ListView list;
    private String[] strListview;
    private TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_fragment_3, container, false);

        list = (ListView) v.findViewById(R.id.list_of_child2);
        text =  (TextView) v.findViewById(R.id.text);
        strListview = getResources().getStringArray(R.array.child2_data_list);

        ArrayAdapter<String> objAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, strListview);
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
        //return inflater.inflate(R.layout.tab_fragment_3, container, false);
    }
}
