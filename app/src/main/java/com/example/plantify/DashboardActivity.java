package com.example.plantify;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class DashboardActivity extends AppCompatActivity {

    public RelativeLayout childbtnlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        childbtnlayout = (RelativeLayout) findViewById(R.id.child_add_plant);

    }

    public void child_add_plant(View view) {
        if (childbtnlayout.getVisibility() == View.GONE) {
            childbtnlayout.setVisibility(View.VISIBLE);
        }else{
            childbtnlayout.setVisibility(View.GONE);
        }
    }
}