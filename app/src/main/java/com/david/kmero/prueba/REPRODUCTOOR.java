package com.david.kmero.prueba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.view.Menu;

public class REPRODUCTOOR extends Activity implements OnClickListener{
    ImageView rep1, rep2, rep3, vista3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductoor);
        rep1=(ImageView)findViewById(R.id.repro1);
        rep2=(ImageView)findViewById(R.id.repro2);
        rep3=(ImageView)findViewById(R.id.repro3);
        vista3=(ImageView)findViewById(R.id.visor3);
        rep1.setOnClickListener(this);
        rep2.setOnClickListener(this);
        rep3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.repro1:
                vista3.setImageResource(R.drawable.reproductor1);
                startActivity(new Intent(REPRODUCTOOR.this, Poprepro1.class));
                break;
            case R.id.repro2:
                vista3.setImageResource(R.drawable.reproductor2);
                startActivity(new Intent(REPRODUCTOOR.this, Poprepro2.class));
                break;
            case R.id.repro3:
                vista3.setImageResource(R.drawable.reproductor3);
                startActivity(new Intent(REPRODUCTOOR.this, Poprepro3.class));
                break;
        }
    }
}
