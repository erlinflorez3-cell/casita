package com.dynatrace.android.agent.crash;

/* JADX INFO: loaded from: classes3.dex */
public enum PlatformType {
    JAVA("a"),
    JAVA_SCRIPT("j"),
    XAMARIN("x"),
    DART("d"),
    CUSTOM("c");

    private final String protocolValue;

    PlatformType(String str) {
        this.protocolValue = str;
    }

    public String getProtocolValue() {
        return this.protocolValue;
    }
}
