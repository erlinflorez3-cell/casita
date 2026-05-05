package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.OnSuccessListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
final class ProxyNotificationPreferences {
    private static final String FCM_PREFERENCES = "com.google.firebase.messaging";

    private ProxyNotificationPreferences() {
    }

    private static SharedPreferences getPreference(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd(";G<IE>8\u00015@>C3;@x\r86;+=8", (short) (Od.Xd() ^ (-6468)), (short) (Od.Xd() ^ (-27648)))).getMethod(C1561oA.ud("\r\n\u0018c\u0012\u0011\f\b\u0001}\u0010\u0004\t\u0007Z\u0006\u0004\tx\u000b\u0006", (short) (C1499aX.Xd() ^ (-12252))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            if (context2 != null) {
                context = context2;
            }
            String strYd = C1561oA.yd("/<;|/8920*s-)3'%=PC\rE>MN5<?E7", (short) (C1499aX.Xd() ^ (-10304)));
            short sXd = (short) (C1580rY.Xd() ^ (-1308));
            int[] iArr = new int["We\\kid`+annugqx3Ivv}o\u0004\u0001".length()];
            QB qb = new QB("We\\kid`+annugqx3Ivv}o\u0004\u0001");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Object[] objArr2 = {strYd, 0};
            Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("\u0017{^_~W~wZ`|Wvsdy|Qy\u001e", (short) (FB.Xd() ^ 737), (short) (FB.Xd() ^ 17894)), Class.forName(Xg.qd("\u0013\u000b!\rZ\u001a\u0010\u001e\u0018_\u0006('\u001f%\u001f", (short) (C1607wl.Xd() ^ 11204), (short) (C1607wl.Xd() ^ 26401))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                return (SharedPreferences) method2.invoke(context, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static boolean isProxyNotificationInitialized(Context context) {
        return getPreference(context).getBoolean("proxy_notification_initialized", false);
    }

    static boolean isProxyNotificationRetentionSet(SharedPreferences sharedPreferences, boolean z2) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z2;
    }

    static void setProxyNotificationsInitialized(Context context, boolean z2) {
        SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z2);
        editorEdit.apply();
    }

    static void setProxyRetention(final Context context, GmsRpc gmsRpc, final boolean z2) {
        if (PlatformVersion.isAtLeastQ() && !isProxyNotificationRetentionSet(getPreference(context), z2)) {
            gmsRpc.setRetainProxiedNotifications(z2).addOnSuccessListener(new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), new OnSuccessListener() { // from class: com.google.firebase.messaging.ProxyNotificationPreferences$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ProxyNotificationPreferences.setProxyRetentionPreferences(context, z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setProxyRetentionPreferences(Context context, boolean z2) {
        SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putBoolean("proxy_retention", z2);
        editorEdit.apply();
    }
}
