package com.facetec.sdk;

import android.os.Parcel;
import androidx.work.PeriodicWorkRequest;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
final class ab {
    private static final HashMap<Integer, Object> Code = new HashMap<>();
    private static Timer V = null;

    ab() {
    }

    static <T> T B(Parcel parcel) {
        int i2 = parcel.readInt();
        if (i2 != 0) {
            return (T) I(i2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized Object I(int i2) {
        Object objRemove;
        HashMap<Integer, Object> map = Code;
        objRemove = map.remove(Integer.valueOf(i2));
        if (V != null && map.isEmpty()) {
            V.cancel();
            V = null;
        }
        return objRemove;
    }

    static <T> void V(T t2, Parcel parcel) {
        if (t2 != null) {
            parcel.writeInt(Z(t2));
        } else {
            parcel.writeInt(0);
        }
    }

    private static synchronized int Z(Object obj) {
        final int iHashCode;
        iHashCode = obj.hashCode();
        if (V == null) {
            V = new Timer();
        }
        V.schedule(new TimerTask() { // from class: com.facetec.sdk.ab.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                ab.I(iHashCode);
            }
        }, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        Code.put(Integer.valueOf(iHashCode), obj);
        return iHashCode;
    }
}
