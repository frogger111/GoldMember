package com.goldMember;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Vibrator;
import android.os.PowerManager.WakeLock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.ads.*;
public class GoldMemberActivity extends Activity {
	long[] pattern ;
	private long[] btnArray1,btnArray2,btnArray3,btnArray4,btnArray5,btnArray6,btnArray7,btnArray8;
	private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btnStop;
	private WakeLock wl;
	private Vibrator vib;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // Create the adView
        AdView adView = (AdView)findViewById(R.id.adView);
        adView.loadAd(new AdRequest());
//        AdView adView = (AdView)this.findViewById(R.id.adView);
//        adView.loadAd(new AdRequest());
        
        vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5 = (Button)findViewById(R.id.button5);
        btn6 = (Button)findViewById(R.id.button6);
        btn7 = (Button)findViewById(R.id.button7);
        btn8 = (Button)findViewById(R.id.button8);
        btnStop = (Button)findViewById(R.id.button_stop);
 
        PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
        wl = pm.newWakeLock(PowerManager.FULL_WAKE_LOCK, "DoNjfdhotDimScreen");

        
        int one = 20;
        int two = 40;
        int three = 80;
        int four = 100;
        int five = 150;
        int six = 200;
        int seven = 250;
        int eight = 500;
        int nine = 750;
        long milion = 1000000;
        pattern = new long[]{
        		0, //start
        		one, one, one, two,two,one,one,one,five,five,one,one,one,
        		three,three,one,two,three,six,eight,eight,one,one,one
        };
        btnArray1 = new long[] {0,six,two,two,two,two,two,two,four,four,four,two,two,two};
        btnArray2 = new long[] {0,three, one, one, one,one, three,three,one,one,one};
        btnArray3 = new long[] {0,six,two,one,one,four,one,one,one,four,one,one,one,six,two,one,one,four,one,one,one,four,one,one,one};
        btnArray4 = new long[] {0,nine,five, nine,five,three,two,two,two,five,six,two,two,six,two,one,two,six};
        btnArray5 = new long[] {0,one,one,one,one,two,two,two,one,one,one,two,two,three,one,three,one,three,one,one};
        btnArray6 = new long[] {0,seven,seven,seven,one,one,one,one,two,two,one,one,seven,seven,seven};
        btnArray7 = new long[] {0,six,two,six,two,five,three,two,three,two,three,four,two,four,two,four,two,four,three};
        btnArray8 = new long[] {0,milion};
      
     btn1.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			vib.cancel();
			vib.vibrate(btnArray1, 0);
			
		}
		
	});
     btn2.setOnClickListener(new OnClickListener() {
 		
 		public void onClick(View v) {
 			// TODO Auto-generated method stub
 			vib.cancel();
 			vib.vibrate(btnArray2, 0);
 			
 		}
 		
 	});
     btn3.setOnClickListener(new OnClickListener() {
 		
 		public void onClick(View v) {
 			// TODO Auto-generated method stub
 			vib.cancel();
 			vib.vibrate(btnArray3, 0);
 			
 		}
 		
 	});
     btn4.setOnClickListener(new OnClickListener() {
 		
 		public void onClick(View v) {
 			// TODO Auto-generated method stub
 			vib.cancel();
 			vib.vibrate(btnArray4, 0);
 			
 		}
 		
 	});
     btn5.setOnClickListener(new OnClickListener() {
 		
 		public void onClick(View v) {
 			// TODO Auto-generated method stub
 			vib.cancel();
 			vib.vibrate(btnArray5, 0);
 			
 		}
 		
 	});
     btn6.setOnClickListener(new OnClickListener() {
 		
 		public void onClick(View v) {
 			// TODO Auto-generated method stub
 			vib.cancel();
 			vib.vibrate(btnArray6, 0);
 			
 		}
 		
 	});
     btn7.setOnClickListener(new OnClickListener() {
 		
 		public void onClick(View v) {
 			// TODO Auto-generated method stub
 			vib.cancel();
 			vib.vibrate(btnArray7, 0);
 			
 		}
 		
 	});
     btn8.setOnClickListener(new OnClickListener() {
 		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			vib.cancel();
			vib.vibrate(btnArray8, 0);
			
		}
		
	});
     btnStop.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			vib.cancel();
		}
	});
    }
    @Override
    protected void onPause() {
        super.onPause();
        wl.release();
    }//End of onPause

    @Override
    protected void onResume() {
        super.onResume();
        wl.acquire();
    }//End of onRes
    @Override
    protected void onStop()
    {
    	super.onStop();
    	vib.cancel();
    }
}