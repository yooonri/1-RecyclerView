package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> contact= new ArrayList<>();
    private RecyclerView recyclerViewContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewContact=findViewById(R.id.contact_recycler);
        for (int i = 1; i <= 20; i++) {
            contact.add("Contact "+i);
        }
        ContactAdapter contactAdapter= new ContactAdapter(contact);
        recyclerViewContact.setAdapter(contactAdapter);
    }
}