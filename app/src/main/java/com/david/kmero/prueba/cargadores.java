package com.david.kmero.prueba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.view.Menu;

public class cargadores extends Activity implements OnClickListener{
    ImageView cargsam, cargi4, cargi5, visor1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cargadores);
        cargsam= (ImageView)findViewById(R.id.cargasam);
        cargi4= (ImageView)findViewById(R.id.ip4);
        cargi5= (ImageView)findViewById(R.id.ip5);
        visor1= (ImageView)findViewById(R.id.visor);
        cargsam.setOnClickListener(this);
        cargi4.setOnClickListener(this);
        cargi5.setOnClickListener(this);
        visor1.setOnClickListener(this);

            }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.cargasam:
                visor1.setImageResource(R.drawable.cargadorsam);
                startActivity(new Intent(cargadores.this,Pop.class));
                break;
            case R.id.ip4:
                visor1.setImageResource(R.drawable.cargador_iphone_4s);
                startActivity(new Intent(cargadores.this,Pop2.class));
                break;
            case R.id.ip5:
                visor1.setImageResource(R.drawable.iphone5);
                startActivity(new Intent(cargadores.this,Pop3.class));
                break;
        }

    }
}
