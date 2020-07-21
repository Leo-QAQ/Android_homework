package com.example.myhomework2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "TAG";
    private RecyclerView recyclerView;
    private com.example.myhomework2.Recycler.MessageAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private GridLayoutManager gridLayoutManager;
    private ContextWrapper buf=this;
    private com.example.myhomework2.Recycler.MessageAdapter.IOnItemClickListener MyListener=new com.example.myhomework2.Recycler.MessageAdapter.IOnItemClickListener() {
        @Override
        public void onItemCLick( int position, com.example.myhomework2.Recycler.RecData data){
            Intent intent = new Intent(buf, com.example.myhomework2.MessageActivity.class);
            intent.putExtra("id",data.id);
            intent.putExtra("name",data.name);
            intent.putExtra("message",data.message);
            startActivity(intent);
        }
        @Override
        public void onItemLongCLick ( int position, com.example.myhomework2.Recycler.RecData data){
            Log.i(TAG, "longclicked");
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new com.example.myhomework2.Recycler.MessageAdapter(com.example.myhomework2.Recycler.RecDataSet.getData());
        mAdapter.setOnItemClickListener(MyListener);
        recyclerView.setAdapter(mAdapter);
        com.example.myhomework2.Recycler.RecDecoration itemDecoration = new com.example.myhomework2.Recycler.RecDecoration(Color.GRAY);
        recyclerView.addItemDecoration(itemDecoration);
    }

    @Override
    public void onClick(View v) {
        Log.i(TAG, "menuclicked");

    }
}
