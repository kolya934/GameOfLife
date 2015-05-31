package com.k934.gameoflife;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View newButton = findViewById(R.id.new_button);
        newButton.setOnClickListener(this);
        View exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener(this);
        View setButton = findViewById(R.id.settings_button);
        setButton.setOnClickListener(this);

    }

        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.new_button:
                    //Toast.makeText(this, "Скоро эта кнопка будет запускать игру!:)", Toast.LENGTH_SHORT).show();
                    Intent startIntent = new Intent(this, Position.class);
                    startActivity(startIntent);
                    break;
                case R.id.exit_button:
                    //Toast.makeText(this, "Здесь выход,вроде", Toast.LENGTH_SHORT).show();
                    finish();
                    break;
                case R.id.settings_button:
                    //Intent settIntent = new Intent(this, Position.class);
                    Intent settIntent = new Intent(this, SettingsActivity.class);
                    startActivity(settIntent);

                    break;
            }
        }

    }



