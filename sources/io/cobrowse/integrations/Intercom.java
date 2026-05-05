package io.cobrowse.integrations;

import android.app.Application;
import com.dynatrace.agent.events.enrichment.EventKeys;
import io.cobrowse.CobrowseIO;
import io.sentry.protocol.OperatingSystem;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class Intercom extends Integration {
    public static void configure(Application application) {
        try {
            Class<?> cls = Class.forName("io.intercom.android.sdk.UserAttributes");
            Class<?> cls2 = Class.forName("io.intercom.android.sdk.Intercom");
            Method declaredMethod = cls2.getDeclaredMethod(EventKeys.CLIENT, new Class[0]);
            Method declaredMethod2 = cls2.getDeclaredMethod("updateUser", cls);
            Class<?> cls3 = Class.forName("io.intercom.android.sdk.UserAttributes$Builder");
            declaredMethod2.invoke(declaredMethod.invoke(cls2, new Object[0]), cls3.getDeclaredMethod(OperatingSystem.JsonKeys.BUILD, new Class[0]).invoke(cls3.getDeclaredMethod("withCustomAttribute", String.class, Object.class).invoke(cls3.newInstance(), "CobrowseID", CobrowseIO.instance().deviceId()), new Object[0]));
        } catch (Exception unused) {
        }
    }

    public static boolean isAvailable() {
        try {
            Class.forName("io.intercom.android.sdk.Intercom");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static String name() {
        return "Intercom";
    }
}
