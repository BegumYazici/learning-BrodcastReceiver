package brodcast.begi.com.brodcastreceiver;

import android.content.Intent;

/**
 * Created by asus1 on 16.11.2017.
 */
public class MyReceiver {

    Intent intent = new Intent();
    intent.setAction("brodcast.begi.com.brodcastreceiver.intent.TITRESIM_INTENT");
    sendBroadcast(intent);
}
