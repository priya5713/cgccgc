package com.git.priyavidhi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.json.JSONObject;

import java.util.Collections;
import java.util.List;

/**
 * Created by Priya on 2/8/2017.
 */

class RecyclerAdapter4 extends  RecyclerView.Adapter<RecyclerViewHolder4> {

    //    String [] name={"Androidwarriors","Stackoverflow","Developer Android","AndroidHive",
//            "Slidenerd","TheNewBoston","Truiton","HmkCode","JavaTpoint","Javapeper"};
    Context context;
    LayoutInflater inflater;

    List<Data> data= Collections.emptyList();

    public RecyclerAdapter4(Context context , List<Data> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data= data;

    }



    @Override
    public RecyclerViewHolder4 onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.list_faculty, parent, false);

        RecyclerViewHolder4 viewHolder = new RecyclerViewHolder4(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder4 holder, int position) {


        RecyclerViewHolder4 myHolder= (RecyclerViewHolder4) holder;
        Data current=data.get(position);
        myHolder.fName.setText(current.fName);
        myHolder.fDesignation.setText(current.fDesignation);

        myHolder.fQualification.setText(current.fQualification);
        myHolder.fExp.setText(current.fExp);

        myHolder.fMail.setText(current.fMail);




    }


    @Override
    public int getItemCount() {

        return data.size();

    }

    class RecycleViewHolder4 extends RecyclerView.ViewHolder{

        TextView fName;


        // create constructor to get widget reference
        public RecycleViewHolder4(View itemView) {
            super(itemView);
            fName= (TextView) itemView.findViewById(R.id.fName);
//            nTitle= (TextView) itemView.findViewById(R.id.nTitle);

        }

    }


}
