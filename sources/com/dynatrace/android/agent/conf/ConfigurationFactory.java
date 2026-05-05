package com.dynatrace.android.agent.conf;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfigurationFactory {
    public static Configuration getConfiguration() {
        return new DynatraceConfigurationBuilder("06ccf98b-94e2-4d5b-ae5e-270953510705", "https://bf52864zaf.bf.dynatrace.com/mbeacon").buildConfiguration();
    }

    public static boolean isNewSecondaryServiceEnabled() {
        return false;
    }

    public static boolean isUserInteractionEnabled() {
        return false;
    }
}
