package com.example.sebastian.changecolor;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button changeColorBtn;
    Boolean colorChange = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeColorBtn = (Button)findViewById(R.id.changeColorBtn);
        changeColorBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (colorChange == true)
        {
            changeColorBtn.setBackgroundColor(Color.GREEN);
            colorChange = false;
        }
        else if (colorChange == false)
        {
            changeColorBtn.setBackgroundColor(Color.BLUE);
            colorChange = true;
        }
    }
}
