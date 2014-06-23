//this is my source code for About Seraphic ROM apps
//Authors : Kelvin Valencio
//twitter : http://twitter.com/kelvin_valencio
//facebook : http://facebook.com/kelvin.valencio.7
//Lead Developers : SatrioDwiPrabowo @ Seraphic Development
package com.kelvinvalencio.About;

import java.util.List;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;


public class MainActivity extends Activity {

MediaPlayer mp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mp=MediaPlayer.create(MainActivity.this,R.raw.backgroundsong);
		mp.setLooping(true);
		mp.start();
	}

	
	@Override
	protected void onPause() {
		if (this.isFinishing()){
			mp.stop();
		}
		Context context = getApplicationContext();
		ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
		List<RunningTaskInfo> taskInfo = am.getRunningTasks(1);
		if (!taskInfo.isEmpty()){
			ComponentName topActivity = taskInfo.get(0).topActivity;
			if (!topActivity.getPackageName().equals(context.getPackageName())) {
				mp.stop();
			}
			else{
		}
	
	
	}
super.onPause();
}
}
