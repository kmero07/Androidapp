package com.david.kmero.prueba;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.view.Menu;

public class AUDIFONOS extends Activity implements OnClickListener{
    ImageView skullcandy,iphonea,samsunga,visor1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audifonos);
        skullcandy=(ImageView)findViewById(R.id.audiskull);
        iphonea=(ImageView)findViewById(R.id.audiiphone);
        samsunga=(ImageView)findViewById(R.id.audisam);
        visor1=(ImageView)findViewById(R.id.visoraudi);
        skullcandy.setOnClickListener(this);
        iphonea.setOnClickListener(this);
        samsunga.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.audisam:
                visor1.setImageResource(R.drawable.audifonosamsung);
                startActivity(new Intent(AUDIFONOS.this,Popaudisam.class ));
                break;
            case R.id.audiskull:
                visor1.setImageResource(R.drawable.audifonosskullcandy2);
                startActivity(new Intent(AUDIFONOS.this,Popaudiskull.class));
                break;
            case R.id.audiiphone:
                visor1.setImageResource(R.drawable.audifonosiphone4);
                startActivity(new Intent(AUDIFONOS.this,Popaudiiphone.class));
                break;
        }
    }
}
