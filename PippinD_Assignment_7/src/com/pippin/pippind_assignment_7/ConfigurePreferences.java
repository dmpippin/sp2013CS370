package com.pippin.pippind_assignment_7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfigurePreferences extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure); 

	final Button savesetbutton = (Button) findViewById(R.id.saveset);

    savesetbutton.setOnClickListener( new View.OnClickListener(){
    	 public void onClick(View v) {
    
    Intent popupIntent = new Intent(v.getContext(), ShowPopUp.class);
    	 startActivity(popupIntent);    
    	 }
    	 });	


}}