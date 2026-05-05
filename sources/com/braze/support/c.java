package com.braze.support;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import bo.app.yl;
import bo.app.z40;
import bo.app.zl;
import com.braze.support.BrazeLogger;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f2700a = new c();

    public static final z40 a(Intent intent, ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        String action = intent.getAction();
        if (!Intrinsics.areEqual(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION, action)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f2700a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new yl(action), 6, (Object) null);
            return z40.NONE;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (activeNetworkInfo == null || booleanExtra) {
                return z40.NONE;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                return (type == 1 || type == 6) ? z40.GREAT : type != 9 ? z40.NONE : z40.GOOD;
            }
            int subtype = activeNetworkInfo.getSubtype();
            return subtype != 3 ? (subtype == 13 || subtype == 20) ? z40.GREAT : z40.BAD : z40.GOOD;
        } catch (SecurityException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f2700a, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) zl.f2405a, 4, (Object) null);
            return z40.NONE;
        }
    }

    public static final z40 a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return z40.NONE;
        }
        int iMin = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        return iMin > 14000 ? z40.GREAT : iMin > 4000 ? z40.GOOD : z40.BAD;
    }
}
