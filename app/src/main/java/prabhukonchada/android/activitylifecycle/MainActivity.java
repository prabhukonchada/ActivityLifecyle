package prabhukonchada.android.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static String TAG = "ACTIVITY_LIFECYCLE";
    public static String DATA_TAG = "DATA";
    String data="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");

        if(savedInstanceState != null)
        {
            String persistedData = savedInstanceState.getString(DATA_TAG);
            Log.d(TAG,persistedData);
        }
        logLifeCycle("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
        logLifeCycle("onStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
        logLifeCycle("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
        logLifeCycle("onDestroy");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
        logLifeCycle("onPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
        logLifeCycle("onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
        logLifeCycle("onRestart");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG,"onSaveInstanceState");
        outState.putString(DATA_TAG,"persist data");
    }

    private void logLifeCycle(String lifecycleEvent)
    {
        Log.d("event",lifecycleEvent);
        data += " "+lifecycleEvent;
        Log.d("data",data);
    }
}
