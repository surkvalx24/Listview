package com.example.listv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView livtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        final String[] catNames = new String[] {
                "Albania", "Belarus", "Guam", "Democratic Republic of the Congo",
                "Italy","Jamaica", "Japan",
                "Russia","United Arab Emirates","United Kingdom", "United States","Yugoslavia","Zambia","Zimbabwe"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, catNames);

        listView.setAdapter(adapter);
    }
}
