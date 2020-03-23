package com.example.takehome7dy;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class personviewholder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public TextView personName;
    public TextView personInfo;
    public ImageView personPhoto;

    public personviewholder (View itemView, final Context context){
        super(itemView);
        cardView=(CardView)itemView.findViewById(R.id.cardview);
        personName=(TextView)itemView.findViewById(R.id.name);
        personInfo=(TextView)itemView.findViewById(R.id.info);
        personPhoto=(ImageView)itemView.findViewById(R.id.photo);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,personName.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
