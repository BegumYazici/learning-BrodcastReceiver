package brodcast.begi.com.brodcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.util.Log;

/**
 * Created by asus1 on 16.11.2017.
 */
public class AirplaneModeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent ıntent) {

        Vibrator vibrator = (Vibrator) context
                .getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(2000);  //2sn titreme
        Log.d(getClass().getName().toString(), "Titredi");
    }
}

