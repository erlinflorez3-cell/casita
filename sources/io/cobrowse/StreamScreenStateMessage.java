package io.cobrowse;

import android.app.Activity;
import com.facebook.react.modules.appstate.AppStateModule;
import com.swmansion.rnscreens.Screen;
import io.sentry.protocol.SentryThread;

/* JADX INFO: loaded from: classes3.dex */
class StreamScreenStateMessage extends StreamMessage {
    private static final String MESSAGE_KEY = "screen";

    public StreamScreenStateMessage(Activity activity, boolean z2) {
        super(MESSAGE_KEY);
        setScreenState(activity, z2);
    }

    private void setScreenState(Activity activity, boolean z2) {
        put("type", Screen.TAG);
        if (activity != null) {
            String string = activity.getTitle().toString();
            put("class", activity.getClass().getName());
            put("title", string);
        } else {
            put("class", null);
            put("title", null);
        }
        if (z2) {
            put(SentryThread.JsonKeys.STATE, "active");
        } else {
            put(SentryThread.JsonKeys.STATE, AppStateModule.APP_STATE_BACKGROUND);
        }
    }
}
