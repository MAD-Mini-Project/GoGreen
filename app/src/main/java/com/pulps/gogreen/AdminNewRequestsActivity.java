package com.pulps.gogreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.pulps.gogreen.Model.Item;
import com.pulps.gogreen.ViewHolder.RequestAdapter;

import java.util.ArrayList;

public class AdminNewRequestsActivity extends AppCompatActivity {

    private RecyclerView requestList;
    private DatabaseReference ref;
    private RequestAdapter myAdapter;
    private ArrayList<Item> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_new_requests);

        ref = FirebaseDatabase.getInstance().getReference().child("Item");
        requestList=(RecyclerView) findViewById(R.id.requests_list);
        requestList.setHasFixedSize(true);
        requestList.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        myAdapter = new RequestAdapter(list, this);
        requestList.setAdapter(myAdapter);

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot dataSnapshot : snapshot.getChildren()){
                    Item item = dataSnapshot.getValue(Item.class);
                    list.add(item);
                }

                myAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}