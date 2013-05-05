package com.pippin.pippind_assignment_7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomeScreen extends Activity {
    
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
        
	
	
        final Button managebutton = (Button) findViewById(R.id.managebutton);

	       managebutton.setOnClickListener( new View.OnClickListener() {
	
	    		public void onClick(View v) {
	    			try {
	    				Intent manage = new Intent(v.getContext(), ManageAssignments.class);
	    				startActivityForResult( manage,
	    				MANAGE_ASSIGNMENTS_REQUEST_CODE );    
	    			}
	    			catch (Exception e) {
	    			}}}
	    			 );

	    final Button configurebutton = (Button) findViewById(R.id.configurebutton);

	       configurebutton.setOnClickListener( new View.OnClickListener() {
	
		 		public void onClick(View v) {
		 			try {
		 				Intent manage = new Intent(v.getContext(), ConfigurePreferences.class);
		 				startActivityForResult( manage,
		 				CONFIGURE_PREFERENCES_REQUEST_CODE );    
		 			}
		 			catch (Exception e) {
		 			}}}
		 			 );
	       
        final Button retrievebutton = (Button) findViewById(R.id.retrievebutton);

		   retrievebutton.setOnClickListener( new View.OnClickListener() {
		
			    public void onClick(View v) {
			 		try {
			 			Intent manage = new Intent(v.getContext(), RetrieveAssignments.class);
						startActivityForResult( manage,
			 		    GET_JOBS_LIST_REQUEST_CODE );    
					}
			 		catch (Exception e) {
			 		}}}
			 		 );}


	
	int MANAGE_ASSIGNMENTS_REQUEST_CODE = 1;	
	int CONFIGURE_PREFERENCES_REQUEST_CODE = 2;
	int GET_JOBS_LIST_REQUEST_CODE = 3;

	@Override	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == MANAGE_ASSIGNMENTS_REQUEST_CODE) {
			out:
			break out;
		}
		else if (requestCode == CONFIGURE_PREFERENCES_REQUEST_CODE) {
			out:
			break out;
		} 
		else if (requestCode == GET_JOBS_LIST_REQUEST_CODE) {
			out:
			break out;
		}
		

}
}