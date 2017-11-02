package com.example.pc.deviceinfo;

import android.content.Context;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String id = DeviceInfoHelper.getDeviceId(getApplicationContext());
        String manus = DeviceInfoHelper.getDeviceManufacturer(getApplicationContext());
        String model = DeviceInfoHelper.getDeviceModel(getApplicationContext());
        String SerialNumber = DeviceInfoHelper.getDeviceSerialNumber(getApplicationContext());
        Log.e("sdfsd",id);
        Log.e("sdfsssd",manus);
        Log.e("sdfddsssd",DeviceInfoHelper.getLocale(getApplicationContext()));
        Log.e("sdfddd",DeviceInfoHelper.getDeviceInfo());
        Log.e("dd",model);
        Log.e("dsd", String.valueOf(DeviceInfoHelper.isMarshMallow()));
        Log.e("SerialNumber",SerialNumber);
        Log.e("TimeZone",DeviceInfoHelper.getLocalTimeZone());
    }
}
