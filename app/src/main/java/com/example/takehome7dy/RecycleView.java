package com.example.takehome7dy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class RecycleView extends AppCompatActivity {

    private List<Person>persons;
    private personsadapter personsadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        setTitle("RecycleView");
        RecyclerView recyclerView=findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        initialData();
        personsadapter = new personsadapter(persons,this);
        recyclerView.setAdapter(personsadapter);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persons.add(getRandomPerson());
                personsadapter.notifyDataSetChanged();
            }
        });
    }

    private Person getRandomPerson(){
        int num=(int)(Math.random()*3);
        if (num==0)
            return new Person("Bill Clinton","1993_2001",R.drawable.clinton);
        else if (num==1)
            return new Person("George W. Bush","2001-2009",R.drawable.bush);
        else
            return new Person("Barack Obama","2009-2016",R.drawable.obama);
    }

    private void initialData(){
        persons=new ArrayList<>();
        persons.add(new Person("Bill Clinton","1993_2001",R.drawable.clinton));
        persons.add(new Person("George W. Bush","2001-2009",R.drawable.bush));
        persons.add(new Person("Barack Obama","2009-2016",R.drawable.obama));
    }

}
