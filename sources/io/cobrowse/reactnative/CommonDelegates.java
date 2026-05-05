package io.cobrowse.reactnative;

import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerHelper;
import io.cobrowse.Session;
import io.cobrowse.reactnative.CobrowseIO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class CommonDelegates implements CobrowseIOCommonDelegates {
    private static final String SESSION_ENDED = "session.ended";
    private static final String SESSION_LOADED = "session.loaded";
    private static final String SESSION_REQUESTED = "session.requested";
    private static final String SESSION_UPDATED = "session.updated";
    private ReactApplicationContext reactApplicationContext;
    private final HashSet<Integer> unredactedTags = new HashSet<>();

    CommonDelegates(ReactApplicationContext reactApplicationContext) {
        this.reactApplicationContext = reactApplicationContext;
    }

    @Override // io.cobrowse.CobrowseIO.FullDeviceRequestDelegate
    public void handleFullDeviceRequest(Activity activity, Session session) {
    }

    @Override // io.cobrowse.CobrowseIO.RemoteControlRequestDelegate
    public void handleRemoteControlRequest(Activity activity, Session session) {
    }

    @Override // io.cobrowse.CobrowseIO.SessionRequestDelegate
    public void handleSessionRequest(Activity activity, Session session) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(SESSION_REQUESTED, Conversion.convert(session));
    }

    @Override // io.cobrowse.CobrowseIO.RedactionDelegate
    public List<View> redactedViews(Activity activity) {
        List<View> listRedactedViews;
        HashSet hashSet = new HashSet(RedactedViewManager.redactedViews.keySet());
        if ((CobrowseIOModule.delegate instanceof CobrowseIO.RedactionDelegate) && (listRedactedViews = ((CobrowseIO.RedactionDelegate) CobrowseIOModule.delegate).redactedViews(activity)) != null) {
            hashSet.addAll(listRedactedViews);
        }
        return new ArrayList(hashSet);
    }

    @Override // io.cobrowse.Session.Listener
    public void sessionDidEnd(Session session) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(SESSION_ENDED, Conversion.convert(session));
    }

    @Override // io.cobrowse.CobrowseIO.SessionLoadDelegate
    public void sessionDidLoad(Session session) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(SESSION_LOADED, Conversion.convert(session));
    }

    @Override // io.cobrowse.Session.Listener
    public void sessionDidUpdate(Session session) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(SESSION_UPDATED, Conversion.convert(session));
    }

    @Override // io.cobrowse.reactnative.CobrowseIOCommonDelegates
    public void setUnredactedTags(ReadableArray readableArray, Promise promise) {
        synchronized (this.unredactedTags) {
            this.unredactedTags.clear();
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                this.unredactedTags.add(Integer.valueOf(readableArray.getInt(i2)));
            }
            promise.resolve(null);
        }
    }

    @Override // io.cobrowse.CobrowseIO.UnredactionDelegate
    public List<View> unredactedViews(Activity activity) {
        ArrayList arrayList;
        List<View> listUnredactedViews;
        synchronized (this.unredactedTags) {
            HashSet hashSet = new HashSet();
            for (Integer num : this.unredactedTags) {
                try {
                    UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(this.reactApplicationContext, num.intValue());
                    if (uIManagerForReactTag != null) {
                        hashSet.add(uIManagerForReactTag.resolveView(num.intValue()));
                    }
                } catch (Exception e2) {
                    String str = "Failed to find unredacted view for tag " + num + ", error = " + e2.getMessage();
                }
            }
            if ((CobrowseIOModule.delegate instanceof CobrowseIO.RedactionDelegate) && (listUnredactedViews = ((CobrowseIO.RedactionDelegate) CobrowseIOModule.delegate).unredactedViews(activity)) != null) {
                hashSet.addAll(listUnredactedViews);
            }
            arrayList = new ArrayList(hashSet);
        }
        return arrayList;
    }
}
