package com.dynatrace.android.agent.conf;

/* JADX INFO: loaded from: classes3.dex */
public enum DataCollectionLevel {
    OFF(0),
    PERFORMANCE(1),
    USER_BEHAVIOR(2);

    private final int javaScriptValue;

    DataCollectionLevel(int i2) {
        this.javaScriptValue = i2;
    }

    public static DataCollectionLevel castJavaScriptValue(int i2) {
        DataCollectionLevel dataCollectionLevel = OFF;
        if (i2 == dataCollectionLevel.javaScriptValue) {
            return dataCollectionLevel;
        }
        DataCollectionLevel dataCollectionLevel2 = PERFORMANCE;
        return i2 == dataCollectionLevel2.javaScriptValue ? dataCollectionLevel2 : USER_BEHAVIOR;
    }

    public int getJavaScriptValue() {
        return this.javaScriptValue;
    }
}
