package com.david.kmero.prueba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.view.Menu;

public class cablesdedatos extends Activity implements OnClickListener{
    ImageView cable1, cable2, cable3, cable4, vista4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cablesdedatos);
        cable1=(ImageView)findViewById(R.id.cabled1);
        cable2=(ImageView)findViewById(R.id.cabled2);
        cable3=(ImageView)findViewById(R.id.cabled3);
        cable4=(ImageView)findViewById(R.id.cabled4);
        vista4=(ImageView)findViewById(R.id.visor4);
        cable1.setOnClickListener(this);
        cable2.setOnClickListener(this);
        cable3.setOnClickListener(this);
        cable4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cabled1:
                vista4.setImageResource(R.drawable.cablededatos1);
                startActivity(new Intent(cablesdedatos.this, Popdatos1.class));
                break;
            case R.id.cabled2:
                vista4.setImageResource(R.drawable.cablededatos2);
                startActivity(new Intent(cablesdedatos.this, Popdatos2.class));
                break;
            case R.id.cabled3:
                vista4.setImageResource(R.drawable.cablededatos3);
                startActivity(new Intent(cablesdedatos.this, Popdatos3.class));
                break;
            case R.id.cabled4:
                vista4.setImageResource(R.drawable.cablededatos4);
                startActivity(new Intent(cablesdedatos.this, Popdatos4.class));
                break;
        }
    }
}
