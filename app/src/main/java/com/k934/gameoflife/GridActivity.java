package com.k934.gameoflife;

/**
 * Created by Nikolay on 24.04.2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class GridActivity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);
    }
}