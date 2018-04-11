package com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    LinearLayoutManager llm;
    WrittingAdapter wadapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = (RecyclerView)findViewById(R.id.article_part);
        llm = new LinearLayoutManager(this);
        rcv.setHasFixedSize(true);
        rcv.setLayoutManager(llm);

        ArrayList<ItemFrom> list = new ArrayList<>();

        list.add(new ItemFrom("seolwon",R.drawable.jjang1,"안녕하세요"));
        list.add(new ItemFrom("seol",R.drawable.jjang2,"안녕하세요1"));
        list.add(new ItemFrom("won",R.drawable.jjang3,"안녕하세요2"));
        list.add(new ItemFrom("seolwon2",R.drawable.jjang4,"안녕하세요3"));
        list.add(new ItemFrom("seolwon3",R.drawable.jjang1,"안녕"));
        list.add(new ItemFrom("seolwon4",R.drawable.jjang2,"안녕ss"));
        list.add(new ItemFrom("seolwon5",R.drawable.jjang3,"안녕서런아"));
        list.add(new ItemFrom("seolwon6",R.drawable.jjang4,"안녕하쇼"));


        wadapter = new WrittingAdapter(this, list);
        rcv.setAdapter(wadapter);



    }
}
