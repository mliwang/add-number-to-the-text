package cn.itcast.callphone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class OutGoingCallRecever extends BroadcastReceiver {
	//当进行外拨电话时执行

	@Override
	public void onReceive(Context context, Intent intent) {
		//先获取保存的区号
		SharedPreferences sp = context.getSharedPreferences("config", 0);
		String ipnumber = sp.getString("number", "1547");
		//获取当前拨打电话的电话号码
		String currrentnumber = getResultData();
		if (currrentnumber.startsWith("0")) {
			setResultData(ipnumber+currrentnumber);
			
		}
		
		
	}

}
