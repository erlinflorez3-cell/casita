package com.facebook.soloader.recovery;

import com.facebook.soloader.LogUtil;
import com.facebook.soloader.SoLoader;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class BaseApkPathHistory {
    private int mCounter;
    private final String[] mPaths;

    public BaseApkPathHistory(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.mPaths = new String[i2];
        this.mCounter = 0;
    }

    public synchronized boolean recordPathIfNew(String str) {
        for (String str2 : this.mPaths) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sbAppend = new StringBuilder("Recording new base apk path: ").append(str).append("\n");
        report(sbAppend);
        LogUtil.w(SoLoader.TAG, sbAppend.toString());
        String[] strArr = this.mPaths;
        int i2 = this.mCounter;
        strArr[i2 % strArr.length] = str;
        this.mCounter = i2 + 1;
        return true;
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        report(sb);
        return sb.toString();
    }

    public synchronized void report(StringBuilder sb) {
        sb.append("Previously recorded ").append(this.mCounter).append(" base apk paths.");
        if (this.mCounter > 0) {
            sb.append(" Most recent ones:");
        }
        int i2 = 0;
        while (true) {
            String[] strArr = this.mPaths;
            if (i2 < strArr.length) {
                int i3 = (this.mCounter - i2) - 1;
                if (i3 >= 0) {
                    String str = strArr[i3 % strArr.length];
                    sb.append("\n").append(str).append(" (").append(new File(str).exists() ? "exists" : "does not exist").append(")");
                }
                i2++;
            }
        }
    }

    public synchronized int size() {
        return this.mCounter;
    }
}
