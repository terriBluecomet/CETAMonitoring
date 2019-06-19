package com.practice.cetamonitoring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SelectEntity extends AppCompatActivity {
    private EditText searchFilter;
    private ListView list=(ListView)findViewById(R.id.projects);
    private Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_entities);
        searchFilter = (EditText) findViewById(R.id.searchFilter);
       // list = (ListView)findViewById(R.id.the_List);

        searchFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //(SelectEntity.this).entities().getFilter().filter(s);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private Adapter entities() {
        ArrayList<String> entity = new ArrayList<>();
        entity.add("GautengEntity");
        entity.add("TshwaneEntity");
        entity.add("MPEntity");
        entity.add("cptEntity");
        entity.add("PTAEntity");
        entity.add("limpEntity");
        mAdapter = new ArrayAdapter(this, R.layout.activity_select_entities, entity);
        list.setAdapter((ListAdapter) mAdapter);
        return mAdapter;
    }
}
