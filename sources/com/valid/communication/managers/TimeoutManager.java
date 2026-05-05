package com.valid.communication.managers;

/* JADX INFO: loaded from: classes5.dex */
public class TimeoutManager {
    private static TimeoutManager instance = null;
    private Integer timeoutTime;

    public class ParseException extends RuntimeException {
    }

    public static TimeoutManager getInstance() {
        try {
            TimeoutManager timeoutManager = instance;
            if (timeoutManager != null) {
                return timeoutManager;
            }
            TimeoutManager timeoutManager2 = new TimeoutManager();
            instance = timeoutManager2;
            return timeoutManager2;
        } catch (ParseException unused) {
            return null;
        }
    }

    public int getTimeout() {
        try {
            Integer num = this.timeoutTime;
            return num == null ? (1734395404 ^ 1070441620) ^ 1487767800 : num.intValue();
        } catch (ParseException unused) {
            return 0;
        }
    }

    public void setTimeout(int i2) {
        try {
            this.timeoutTime = Integer.valueOf(i2);
        } catch (ParseException unused) {
        }
    }
}
