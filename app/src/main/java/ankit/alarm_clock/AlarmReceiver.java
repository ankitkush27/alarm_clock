package ankit.alarm_clock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by shubhamagrawal on 27/08/17.
 */

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("AlarmReceiver", "We are in receiver");
        Intent serviceIntent = new Intent(context,RingtoneService.class);
        // serviceIntent.putExtra("extra", state);

        context.startService(serviceIntent);
    }
}
