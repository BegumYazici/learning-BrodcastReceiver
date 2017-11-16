package brodcast.begi.com.brodcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by asus1 on 16.11.2017.
 */
public class SmsReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle pudsBundle = intent.getExtras();
        Object[] pdus = (Object[]) pudsBundle.get("pdus");
        SmsMessage messages = SmsMessage.createFromPdu((byte[]) pdus[0]);
        Toast.makeText(context, "Yeni SMS: " + messages.getMessageBody(),
                Toast.LENGTH_LONG).show();
        Log.d(getClass().getName().toString(), "yeni sms geldi");
    }
}

