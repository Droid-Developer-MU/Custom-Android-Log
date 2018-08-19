package com.kisanthapa33.customLogMessages;

import android.util.Log;

public class LogMessages {

    public void debug(String tag, String msg) {
        Log.d(tag, msg);
    }

    public void info(String tag, String msg) {
        Log.i(tag, msg);
    }

    public void error(String tag, String msg) {
        Log.e(tag, msg);
    }

    public void verbose(String tag, String msg) {
        Log.v(tag, msg);
    }

}
