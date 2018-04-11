package com.myapplication;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by SM-PC on 2018-04-11.
 */

public class WrittingAdapter extends RecyclerView.Adapter<WrittingAdapter.MyViewholder> {



    private Activity activity;
    private ArrayList<ItemFrom> datalist;


    //getItemCount, onCreateViewHolder, MyViewHolder, onBindViewholder 순으로 들어오게 된다.
    // 뷰홀더에서 초기세팅해주고 바인드뷰홀더에서 셋텍스트해주는 값이 최종적으로 화면에 출력되는 값


    @Override
    public WrittingAdapter.MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        MyViewholder viewholder1 = new MyViewholder(view);


        return viewholder1;
    }

    @Override
    public void onBindViewHolder(WrittingAdapter.MyViewholder holder, int position) {
        ItemFrom data = datalist.get(position);
        holder.personalId.setText(data.getId());
        holder.profile.setImageResource(data.getImageNumber());
        holder.writtingTxt.setText(data.getTxt());

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }
    public class MyViewholder extends RecyclerView.ViewHolder
    {
        ImageView profile;
        TextView writtingTxt;
        TextView personalId;

        public MyViewholder(View itemview){
            super(itemview);

            profile = (ImageView) itemview.findViewById(R.id.image_jjang);
            writtingTxt = (TextView) itemview.findViewById(R.id.person_id1);
            personalId = (TextView) itemview.findViewById(R.id.person_id);
            itemview.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Toast.makeText(activity, "c",Toast.LENGTH_LONG).show();;
                }
            });

        }

    }
    public WrittingAdapter(Activity activity, ArrayList<ItemFrom> datalist){
        this.activity = activity;
        this.datalist = datalist;

    }
}
