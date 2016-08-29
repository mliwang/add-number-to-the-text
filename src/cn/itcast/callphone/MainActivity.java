package cn.itcast.callphone;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

    private EditText et_number;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_number = (EditText) findViewById(R.id.et_number);

       
    }
    public void click(View v){
    	String number = et_number.getText().toString().trim();
    	SharedPreferences sp = getSharedPreferences("config", 0);
    	Editor editor = sp.edit();
    	 editor.putString("number", number);
    	 editor.commit();
    	 Toast.makeText(getApplicationContext(), "±£´æ³É¹¦", 1).show();
    	
    }

}
