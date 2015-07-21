package com.example.makecoments;


import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CommentActivity extends AppCompatActivity {
	
	EditText insertedComment;
	Button button1;  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_comment);
		insertedComment=(EditText)findViewById(R.id.editText1);  
        button1=(Button)findViewById(R.id.btnPOSTcoment);  
       
	}

	
	public void MakeThePost(View view){
		
	Intent i=new Intent();
	Bundle backpack=new Bundle();
	backpack.putString("answer", insertedComment.getText().toString());
	i.putExtras(backpack);
	setResult(RESULT_OK,i);
	finish();
			
			
			
		
		
	}
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.comment, menu);
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
