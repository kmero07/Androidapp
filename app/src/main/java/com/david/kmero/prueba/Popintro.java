package com.david.kmero.prueba;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
/**
 * Created by KMERO on 25/01/2016.
 */
public class Popintro extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popupintro);
        DisplayMetrics dm3= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm3);

        int width = dm3.widthPixels;
        int height= dm3.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

    }
}
