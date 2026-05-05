package io.cobrowse;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class ContextUtils {
    ContextUtils() {
    }

    static Context getActivityContext(View view) {
        Context context = view.getContext();
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }
}
