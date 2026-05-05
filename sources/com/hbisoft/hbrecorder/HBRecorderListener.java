package com.hbisoft.hbrecorder;

/* JADX INFO: loaded from: classes7.dex */
public interface HBRecorderListener {
    void HBRecorderOnComplete();

    void HBRecorderOnError(int i2, String str);

    void HBRecorderOnPause();

    void HBRecorderOnResume();

    void HBRecorderOnStart();
}
