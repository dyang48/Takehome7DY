package com.example.takehome7dy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class personsadapter extends RecyclerView.Adapter<personviewholder> {

    private List<Person> persons;
    private Context context;

    public personsadapter(List<Person>persons,Context context){
        this.context=context;
        this.persons=persons;
    }

    @Override
    public personviewholder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewperson,parent,false);
        return  new  personviewholder(view,context);
    }

    @Override
    public void onBindViewHolder(personviewholder holder, int position) {
        Person person =persons.get(position);
        holder.personName.setText(person.name);
        holder.personInfo.setText(person.info);
        holder.personPhoto.setImageResource(person.photoID);
    }

    public int getItemCount(){
        return  persons.size();
}
}

