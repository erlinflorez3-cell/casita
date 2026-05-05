package com.dynatrace.android.agent.metrics;

/* JADX INFO: loaded from: classes3.dex */
public enum ConnectionType {
    OFFLINE("o"),
    MOBILE("m"),
    WIFI("w"),
    LAN("l"),
    OTHER("");

    private String protocolValue;

    ConnectionType(String str) {
        this.protocolValue = str;
    }

    public String getProtocolValue() {
        return this.protocolValue;
    }
}
