package com.npmdavi.davinotification;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleRegistry;
import com.braze.Braze;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.MessageButton;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.InAppMessageCloser;
import com.braze.ui.inappmessage.InAppMessageOperation;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class MyBrazeInappsModule extends ReactContextBaseJavaModule {
    private static final String TAG = "MyBrazeInappsModule";
    private LifecycleRegistry lifecycleRegistry;
    private final ReactApplicationContext reactContext;

    private class CustomInAppMessageManagerListener extends DefaultInAppMessageManagerListener {
        private final Activity mActivity;

        public CustomInAppMessageManagerListener(Activity activity) {
            this.mActivity = activity;
        }

        @Override // com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener
        public void afterInAppMessageViewClosed(IInAppMessage iInAppMessage) {
            super.afterInAppMessageViewClosed(iInAppMessage);
            BrazeInAppMessageManager.getInstance().setBackButtonDismissesInAppMessageView(true);
        }

        @Override // com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener
        public void afterInAppMessageViewOpened(View view, IInAppMessage iInAppMessage) {
        }

        @Override // com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener, com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener
        public InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage iInAppMessage) {
            return InAppMessageOperation.DISPLAY_NOW;
        }

        @Override // com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener
        public void beforeInAppMessageViewClosed(View view, IInAppMessage iInAppMessage) {
        }

        @Override // com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener
        public void beforeInAppMessageViewOpened(View view, IInAppMessage iInAppMessage) {
            super.beforeInAppMessageViewOpened(view, iInAppMessage);
            Map<String, String> extras = iInAppMessage.getExtras();
            if (extras == null || !extras.containsKey("disable_back_button")) {
                return;
            }
            BrazeInAppMessageManager.getInstance().setBackButtonDismissesInAppMessageView(false);
        }

        @Override // com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener
        public boolean onInAppMessageButtonClicked(IInAppMessage iInAppMessage, MessageButton messageButton, InAppMessageCloser inAppMessageCloser) {
            inAppMessageCloser.close(true);
            return true;
        }

        @Override // com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener
        public boolean onInAppMessageClicked(IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser) {
            inAppMessageCloser.close(true);
            return true;
        }

        @Override // com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener
        public void onInAppMessageDismissed(IInAppMessage iInAppMessage) {
            if (iInAppMessage.getExtras() == null || iInAppMessage.getExtras().isEmpty()) {
                return;
            }
            Map<String, String> extras = iInAppMessage.getExtras();
            StringBuilder sb = new StringBuilder("Dismissed in-app message with extras payload containing [");
            for (String str : extras.keySet()) {
                sb.append(" '").append(str).append(" = ").append(extras.get(str)).append('\'');
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
    }

    public MyBrazeInappsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        getReactApplicationContext().addLifecycleEventListener(new LifecycleEventListener() { // from class: com.npmdavi.davinotification.MyBrazeInappsModule.1
            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
                if (MyBrazeInappsModule.this.getCurrentActivity() != null) {
                    BrazeInAppMessageManager.getInstance().unregisterInAppMessageManager(MyBrazeInappsModule.this.getCurrentActivity());
                }
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
                if (MyBrazeInappsModule.this.getCurrentActivity() != null) {
                    BrazeInAppMessageManager.getInstance().registerInAppMessageManager(MyBrazeInappsModule.this.getCurrentActivity());
                }
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void initializeInAppMessageManager() {
        BrazeInAppMessageManager.getInstance().ensureSubscribedToInAppMessageEvents(this.reactContext);
        BrazeInAppMessageManager.getInstance().setCustomInAppMessageManagerListener(new CustomInAppMessageManagerListener(getCurrentActivity()));
    }

    @ReactMethod
    public void logCustomBrazeEvent(String str) {
        Braze.getInstance(this.reactContext).logCustomEvent(str);
    }

    @ReactMethod
    public void logCustomBrazeEventWithProperties(String str, String str2) {
        BrazeProperties brazeProperties = new BrazeProperties();
        brazeProperties.addProperty("eventProperties", str2);
        Braze.getInstance(this.reactContext).logCustomEvent(str, brazeProperties);
    }

    @ReactMethod
    public void showInAppMessage(IInAppMessage iInAppMessage) {
        if (getCurrentActivity() == null) {
            return;
        }
        BrazeInAppMessageManager.getInstance().addInAppMessage(iInAppMessage);
    }
}
