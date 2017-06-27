package com.example.abhi.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] item = {"Length", "Weight", "Temperature", "Velocity", "Mass", "Pressure", "Force", "Area", "Volume", "Time", "Energy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.List);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this,R.layout.single_row,R.id.txtv, item);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int pos = position;
                switch (pos) {
                    case 0:

                        Intent in = new Intent(MainActivity.this, Length.class);
                        startActivity(in);
                        break;
                    case 1:

                        Intent in1 = new Intent(MainActivity.this, Weight.class);
                        startActivity(in1);
                        break;
                    case 2:

                        Intent in2 = new Intent(MainActivity.this, Temperature.class);
                        startActivity(in2);
                        break;
                    case 3:

                        Intent in3 = new Intent(MainActivity.this, Velocity.class);
                        startActivity(in3);
                        break;
                    case 4:

                        Intent in5 = new Intent(MainActivity.this, Mass.class);
                        startActivity(in5);
                        break;
                    case 5:

                        Intent in6 = new Intent(MainActivity.this, Pressure.class);
                        startActivity(in6);
                        break;
                    case 6:

                        Intent in7 = new Intent(MainActivity.this, Force.class);
                        startActivity(in7);
                        break;
                    case 7:

                        Intent in8 = new Intent(MainActivity.this, Area.class);
                        startActivity(in8);
                        break;
                    case 8:

                        Intent in9 = new Intent(MainActivity.this, Volume.class);
                        startActivity(in9);
                        break;
                    case 9:

                        Intent in10 = new Intent(MainActivity.this, Time.class);
                        startActivity(in10);
                        break;
                    case 10:

                        Intent in11 = new Intent(MainActivity.this, Energy.class);
                        startActivity(in11);
                        break;
                }
            }
        });
    }

}
