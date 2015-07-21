package com.example.makecoments;



import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
	
	static final int REQUEST_COMMENT=1;
	 ArrayAdapter<Komentar> kikoAdapter;
	 ListView buckylist;
     List<Komentar> listOfComments;
     
     
     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      listOfComments=new ArrayList<Komentar>();
        kikoAdapter=new custumAdapter(MainActivity.this,listOfComments);
        buckylist=(ListView)findViewById(R.id.listView1);
        buckylist.setAdapter(kikoAdapter);
    }

    
    public void makeAComent(View view){
    	
    	 Intent i=new  Intent(this, CommentActivity.class);
    	 startActivityForResult(i, 0);
    }

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
	    if(resultCode==RESULT_OK)  
        {  
           Bundle backpack=data.getExtras();
           String s=backpack.getString("answer");
           Komentar k =new Komentar("Kristijan", "Laskovsi", s,  "15:43 PM");
           listOfComments.add(k);
           kikoAdapter.notifyDataSetChanged();
        }  
		
		
		
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
