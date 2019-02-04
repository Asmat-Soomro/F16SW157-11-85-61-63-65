import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.widget.Toast;

import com.geeks.asmat.myservice.MainActivity;

public class MyService extends Service {
    @androidx.annotation.Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public int onStartCommand(Intent intent, int flags, int startId){
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_SHORT).show();
    }

    String CHANNEL_ID="";
    public  void buildNotification()
    {
        Intent notificationIntent = new Intent(this,MainActivity.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,notificationIntent,0);

        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.O);
        NotificationManager notMgr=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);

        CharSequence channelName= "Play Back Channel";
        int importance=NotificationManager.IMPORTANCE_DEFAULT;
        NotificationChannel notificationChannel=
                            new NotificationChannel(CHANNEL_ID,channelName,importance);

    }
}
