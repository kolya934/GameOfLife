package com.k934.gameoflife;

/**
 * Created by Nikolay on 24.04.2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class GridActivity extends Activity {

    private GridView _gridView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);

        _gridView = (GridView)findViewById(R.id.grid_view);
        _gridView.setMode(GridView.RUNNING);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(this, "Скоро здесь будут настройки", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, SettingsActivity.class));
                return true;
            case R.id.action_exit:
                Toast.makeText(this, "Скоро здесь будет выход", Toast.LENGTH_SHORT).show();
                finishAffinity();
                return true;
        }
        return false;
    }


    @Override
    protected void onPause() {
        super.onPause();
        _gridView.setMode(GridView.PAUSE);
    }
}