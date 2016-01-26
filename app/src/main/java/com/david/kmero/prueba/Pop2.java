package com.david.kmero.prueba;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

/**
 * Created by KMERO on 25/01/2016.
 */
public class Pop2 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popupwindow2);
        DisplayMetrics dm2= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm2);

        int width = dm2.widthPixels;
        int height= dm2.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

    }
}
