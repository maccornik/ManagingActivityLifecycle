package pl.edu.uj.managinglifecycleactivity;

import android.os.Build;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView textView;

	@SuppressLint("NewApi")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Inicjalizacja textView
        textView = (TextView) findViewById(R.id.text_message);
        
        //Sprawdzenie wersji Androida. Sprawdzamy czy mo¿emy u¿ywaæ ActionBarAPI
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
        	//Sprawdzenie czy ikona w ActionBar nie zachowuje siê jak guzik
        	ActionBar actionBar = getActionBar();
        	actionBar.setHomeButtonEnabled(false);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
