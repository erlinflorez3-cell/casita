package io.cobrowse.integrations;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Integration {
    static final String TAG = "CobrowseIOIntegrations";

    public static void init(Application application) {
        if (Intercom.isAvailable()) {
            Intercom.configure(application);
        }
    }
}
