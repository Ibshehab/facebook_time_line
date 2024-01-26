package com.example.facebooktime;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView  HrecyclerView;
    List<DATACLASS> dataclassList;
    ADAPTER adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HrecyclerView=findViewById(R.id.horzRecyclerView);
        dataInfo();
        adapter= new ADAPTER(dataclassList);
        HrecyclerView.setAdapter(adapter);



    }

    private void dataInfo() {
        dataclassList=new ArrayList<>();

        dataclassList.add(new DATACLASS( R.drawable.avatar, "Ibrahim Shehab eldin","9.15 h"," سبحان الله"
        ));
        dataclassList.add(new DATACLASS( R.drawable.avatar, "Ibrahim Shehab eldin","1 h"," " + "الحمد لله"));
        dataclassList.add(new DATACLASS( R.drawable.avatar, "Ibrahim Shehab eldin","9.15 h"," الله اكبر و لله الحمد"));
        dataclassList.add(new DATACLASS( R.drawable.avatar, "mahmoud Shehab","1 h"," سبحان الله و بحمده سبحان الله العظيم  "))

        ;
        dataclassList.add(new DATACLASS( R.drawable.avatar, "Ibrahim Shehab eldin","9.15 h","استغفر الله العظيم و اتوب اليه"  ));

        dataclassList.add(new DATACLASS( R.drawable.avatar, "Ibrahim Shehab eldin","1 h","  اللهم صل و سلم علي سيدنا محمد "));

        dataclassList.add(new DATACLASS( R.drawable.avatar, "Ibrahim Shehab eldin","9.15 h"," سبحان الله"
        )); dataclassList.add(new DATACLASS( R.drawable.avatar, "Ibrahim Shehab eldin","9.15 h"," سبحان الله"
        ));
        dataclassList.add(new DATACLASS( R.drawable.avatar, "Ibrahim Shehab eldin","1 h"," " + "الحمد لله"));
        dataclassList.add(new DATACLASS( R.drawable.avatar, "Ibrahim Shehab eldin","9.15 h"," الله اكبر و لله الحمد"));
        dataclassList.add(new DATACLASS( R.drawable.avatar, "mahmoud Shehab","1 h"," سبحان الله و بحمده سبحان الله العظيم  "))

        ;
        dataclassList.add(new DATACLASS( R.drawable.avatar, "Ibrahim Shehab eldin","9.15 h","استغفر الله العظيم و اتوب اليه"  ));

        dataclassList.add(new DATACLASS( R.drawable.avatar, "Ibrahim Shehab eldin","1 h","  اللهم صل و سلم علي سيدنا محمد "));
    }
}