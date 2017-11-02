package com.example.pc.deviceinfo;

import android.accessibilityservice.AccessibilityService;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.TimeZone;

public class DeviceInfoHelper {
    public static String getDeviceId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    }

    public static String getDeviceManufacturer(Context context) {
        String deviceManufacturer = "";
        try {
            deviceManufacturer = URLEncoder.encode(Build.MANUFACTURER, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e(DeviceInfoHelper.class.getName(), "Build.MANUFACTURER: " + Build.MANUFACTURER, e);
        }
        return deviceManufacturer;
    }

    public static String getDeviceModel(Context context) {
        String deviceModel = "";
        try {
            deviceModel = URLEncoder.encode(Build.MODEL, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e(DeviceInfoHelper.class.getName(), "Build.MODEL: " + Build.MODEL, e);
        }
        return deviceModel;
    }

    public static String getDeviceSerialNumber(Context context) {
        String deviceSerial = "";
        try {
            deviceSerial = URLEncoder.encode(Build.SERIAL, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e(DeviceInfoHelper.class.getName(), "Build.SERIAL: " + Build.SERIAL, e);
        }
        return deviceSerial;
    }

    public static String getLocale(Context context) {
        return String.format("Locale: %s", context.getResources().getConfiguration().locale.getDisplayName());
    }

    public static boolean isMarshMallow() {
        return (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M);
    }

    public static String getDeviceInfo() {
        return String.format("Device: %s", Build.DEVICE);
    }



    public static String getLocalTimeZone() {
        return TimeZone.getDefault().getID().toString();
    }
}
