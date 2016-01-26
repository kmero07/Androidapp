package com.david.kmero.prueba;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
/**
 * Created by KMERO on 25/01/2016.
 */
public class Popaudisam extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popupaudisam);
        DisplayMetrics dm= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height= dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

    }
}