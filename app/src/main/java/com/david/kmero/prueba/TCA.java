package com.david.kmero.prueba;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.DialogInterface;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.view.Menu;
public class TCA extends Activity implements OnClickListener{
    ImageView logo, cargador, audifono, reproductores, cables;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tc);
        logo = (ImageView)findViewById(R.id.logolocal);
        cargador = (ImageView)findViewById(R.id.batecargada);
        audifono = (ImageView)findViewById(R.id.auriculares);
        reproductores = (ImageView)findViewById(R.id.repromp3);
        cables = (ImageView)findViewById(R.id.cableusb);
        logo.setOnClickListener(this);
        cargador.setOnClickListener(this);
        audifono.setOnClickListener(this);
        reproductores.setOnClickListener(this);
        cables.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.batecargada:
                Intent intent=new Intent(this,cargadores.class);
                startActivity(intent);
                break;
            case R.id.auriculares:
                Intent intent2=new Intent(this,AUDIFONOS.class);
                startActivity(intent2);
                break;
            case R.id.repromp3:
                Intent intent3=new Intent(this,REPRODUCTOOR.class);
                startActivity(intent3);
                break;
            case R.id.cableusb:
                Intent intent4=new Intent(this,cablesdedatos.class);
                startActivity(intent4);
                break;
            case R.id.logolocal:
                startActivity(new Intent(TCA.this,Popintro.class));
                break;
        }
    }
}
