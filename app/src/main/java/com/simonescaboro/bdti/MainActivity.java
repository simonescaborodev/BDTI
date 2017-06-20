package com.simonescaboro.bdti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button insertButton;
    private EditText editTextInsert;
    private ListView listView;
    private TextView itemTextView;

    private void defineWidgets(){
        insertButton = (Button) findViewById(R.id.insert_button_id);
        editTextInsert = (EditText) findViewById(R.id.insert_id);
        listView = (ListView) findViewById(R.id.list_view);
        itemTextView = (TextView) findViewById(R.id.item_text_id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineWidgets();
    }
}
