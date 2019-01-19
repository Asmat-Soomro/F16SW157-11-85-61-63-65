package com.geeks.asmat.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class MyReciever extends BroadcastReceiver {
    public MyReciever() {}
    public String asd;
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Telephony.Sms.Intents.SMS_RECEIVED_ACTION.equals(intent.getAction())) {
            for (SmsMessage smsmessage : Telephony.Sms.Intents.getMessagesFromIntent(intent)) {
                asd = smsmessage.getMessageBody();
            }

        }
        if (asd.equals("Hello")){
            Toast.makeText(context, "Hello", Toast.LENGTH_LONG).show();
        }
    }

}
