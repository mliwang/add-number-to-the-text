package cn.itcast.callphone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class OutGoingCallRecever extends BroadcastReceiver {
	//�������Ⲧ�绰ʱִ��

	@Override
	public void onReceive(Context context, Intent intent) {
		//�Ȼ�ȡ���������
		SharedPreferences sp = context.getSharedPreferences("config", 0);
		String ipnumber = sp.getString("number", "1547");
		//��ȡ��ǰ����绰�ĵ绰����
		String currrentnumber = getResultData();
		if (currrentnumber.startsWith("0")) {
			setResultData(ipnumber+currrentnumber);
			
		}
		
		
	}

}
