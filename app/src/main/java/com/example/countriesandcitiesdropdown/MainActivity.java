package com.example.countriesandcitiesdropdown;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

    public class MainActivity extends AppCompatActivity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            final Spinner SpCountry = (Spinner)findViewById(R.id.sCountry);
            final Spinner SpCities = (Spinner)findViewById((R.id.sCities));

            ArrayAdapter<CharSequence> add_Countries = ArrayAdapter.createFromResource(this,
                    R.array.countryName,
                    android.R.layout.simple_spinner_dropdown_item);

            add_Countries.setDropDownViewResource(
                    android.R.layout.simple_spinner_dropdown_item);

            SpCountry.setAdapter(add_Countries);

            SpCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (adapterView.getSelectedItem().toString().equals("PAKISTAN")) {
                        ArrayAdapter<CharSequence> add_Pak_Cities =
                                ArrayAdapter.createFromResource(
                                        getApplicationContext(), R.array.citiesOfPakistan,
                                        android.R.layout.simple_spinner_dropdown_item);
                        SpCities.setAdapter(add_Pak_Cities);
                    }
                    if (adapterView.getSelectedItem().toString().equals("INDIA")) {
                        ArrayAdapter<CharSequence> add_Ind_Cities =
                                ArrayAdapter.createFromResource(
                                        getApplicationContext(), R.array.citesOfIndia,
                                        android.R.layout.simple_spinner_dropdown_item);
                        SpCities.setAdapter(add_Ind_Cities);

                    }
                    if (adapterView.getSelectedItem().toString().equals("CHINA")) {
                        ArrayAdapter<CharSequence> add_Chi_Cities =
                                ArrayAdapter.createFromResource(
                                        getApplicationContext(), R.array.citiesOfChina,
                                        android.R.layout.simple_spinner_dropdown_item);
                        SpCities.setAdapter(add_Chi_Cities);

                    }
                    if (adapterView.getSelectedItem().toString().equals("Choose a country")){

                        ArrayAdapter<CharSequence> empty =
                                ArrayAdapter.createFromResource(
                                        getApplicationContext(), R.array.empty,
                                        android.R.layout.simple_spinner_item);
                        SpCities.setAdapter(empty);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
            SpCities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (adapterView.getSelectedItem().toString().equals("ISLAMABAD")){
                        Intent intent = new Intent(MainActivity.this,ISLAMABAD.class);
                        startActivity(intent);
                    }

                    if (adapterView.getSelectedItem().toString().equals("LAHORE")) {
                        Intent intent = new Intent(MainActivity.this,LAHORE.class);
                        startActivity(intent);
                    }

                    if (adapterView.getSelectedItem().toString().equals("KARACHI")) {
                        Intent intent = new Intent(MainActivity.this,KARACHI.class);
                        startActivity(intent);
                    }
                    if (adapterView.getSelectedItem().toString().equals("NEW DELHI")) {
                        Intent intent = new Intent(MainActivity.this,NEWDELHI.class);
                        startActivity(intent);
                    }
                    if (adapterView.getSelectedItem().toString().equals("GOA")) {
                        Intent intent = new Intent(MainActivity.this,GOA.class);
                        startActivity(intent);
                    }
                    if (adapterView.getSelectedItem().toString().equals("MUMBAI")) {
                        Intent intent = new Intent(MainActivity.this,MUMBAI.class);
                        startActivity(intent);
                    }
                    if (adapterView.getSelectedItem().toString().equals("BEIJING")) {
                        Intent intent = new Intent(MainActivity.this,BEIJING.class);
                        startActivity(intent);
                    }
                    if (adapterView.getSelectedItem().toString().equals("SHANGHAI")) {
                        Intent intent = new Intent(MainActivity.this,SHANGHAI.class);
                        startActivity(intent);
                    }
                    if (adapterView.getSelectedItem().toString().equals("SHENZHEN")) {
                        Intent intent = new Intent(MainActivity.this,SHENZHEN.class);
                        startActivity(intent);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }
    }
