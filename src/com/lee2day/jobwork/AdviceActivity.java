package com.lee2day.jobwork;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
public class AdviceActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);
        //String[] list = {"진로교육도서", "진로교육영상물", "진로체험학습기관 및 프로그램"};
       
         ArrayAdapter<?> adapter = ArrayAdapter.createFromResource(this, R.array.advice_menu, android.R.layout.simple_list_item_1);
        
        ListView listview = (ListView) findViewById(R.id.listView1);//getListView();
        listview.setAdapter(adapter);
        
        listview.setOnItemClickListener(new OnItemClickListener() {
        	
        	public void onItemClick(AdapterView<?> prent, View view, int position, long id){
        		Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
        		Intent intent = new Intent(AdviceActivity.this, AdviceBookActivity.class);
				startActivity(intent);
        	}
        	
        });       
    }
  
   

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_advice, menu);
        return true;
    }
    
    
}
