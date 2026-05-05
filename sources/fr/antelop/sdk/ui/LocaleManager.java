package fr.antelop.sdk.ui;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class LocaleManager {
    private static final LocaleManager ourInstance = new LocaleManager();
    private Context localizedContext = null;

    private LocaleManager() {
    }

    public static LocaleManager getInstance() {
        return ourInstance;
    }

    public final void applyLocale(Context context) {
        this.localizedContext = context;
    }

    public final Context getLocalizedContext(Context context) {
        Context context2 = this.localizedContext;
        return context2 == null ? context : context2;
    }
}
