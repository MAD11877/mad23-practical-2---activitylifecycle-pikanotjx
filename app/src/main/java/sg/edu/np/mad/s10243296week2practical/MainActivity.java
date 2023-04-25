package sg.edu.np.mad.s10243296week2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG,"on create!!");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG,"on start!!");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TAG,"on pause!!");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TAG,"on stop!!");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TAG,"on destroy!!");
    }
}