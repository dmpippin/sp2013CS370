//code taken from Internet sources on StackOverflow.com
package com.pippin.pippind_assignment_7;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class ShowPopUp extends Activity {

    PopupWindow popUp;
    LinearLayout layout;
    TextView tv;
    LayoutParams params;
    LinearLayout mainLayout;
    Button but;
    boolean click = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     popUp = new PopupWindow(this);
     layout = new LinearLayout(this);
     mainLayout = new LinearLayout(this);
     tv = new TextView(this);
     but = new Button(this);
     but.setText("Proceed to Connect with Server");
     but.setOnClickListener(new OnClickListener() {

      public void onClick(View v) {
       if (click) {
        popUp.showAtLocation(layout, Gravity.BOTTOM, 10, 10);
        popUp.update(50, 50, 300, 80);
        click = false;
       } else {
        popUp.dismiss();
        click = true;
       }
      }

     });
     params = new LayoutParams(LayoutParams.WRAP_CONTENT,
       LayoutParams.WRAP_CONTENT);
     layout.setOrientation(LinearLayout.VERTICAL);
     tv.setText("Connecting to Server");
     layout.addView(tv, params);
     popUp.setContentView(layout);
     mainLayout.addView(but, params);
     setContentView(mainLayout);
    }
   }