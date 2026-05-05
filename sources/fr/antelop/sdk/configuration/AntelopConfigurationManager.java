package fr.antelop.sdk.configuration;

/* JADX INFO: loaded from: classes5.dex */
public final class AntelopConfigurationManager {
    private static AntelopConfiguration CONFIGURATION = null;
    private static final Object LOCK = new Object();

    public static AntelopConfiguration get() {
        AntelopConfiguration antelopConfiguration;
        synchronized (LOCK) {
            antelopConfiguration = CONFIGURATION;
        }
        return antelopConfiguration;
    }

    public static void reset() {
        synchronized (LOCK) {
            CONFIGURATION = null;
        }
    }

    public static void set(AntelopConfiguration antelopConfiguration) {
        synchronized (LOCK) {
            CONFIGURATION = antelopConfiguration;
        }
    }
}
