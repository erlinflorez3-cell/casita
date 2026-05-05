package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zau;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
final class zad extends zau {
    final /* synthetic */ GoogleApiAvailability zaa;
    private final Context zab;

    /* JADX WARN: Illegal instructions before constructor call */
    public zad(GoogleApiAvailability googleApiAvailability, Context context) throws Throwable {
        Looper looperMyLooper;
        this.zaa = googleApiAvailability;
        if (Looper.myLooper() == null) {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(Xg.qd("&4+:83/y<A|\u001c@AC9G", (short) (C1499aX.Xd() ^ (-7720)), (short) (C1499aX.Xd() ^ (-4584)))).getDeclaredMethod(Jg.Wd("R]I~yZ@vpM+=1", (short) (FB.Xd() ^ 11344), (short) (FB.Xd() ^ 16462)), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                looperMyLooper = (Looper) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            looperMyLooper = Looper.myLooper();
        }
        super(looperMyLooper);
        short sXd = (short) (C1607wl.Xd() ^ 10697);
        short sXd2 = (short) (C1607wl.Xd() ^ 232);
        int[] iArr = new int["i\u001f9\u0006F!\u0004n\u000ft\bm%{\u001a#x\u0019GjFy\u0003".length()];
        QB qb = new QB("i\u001f9\u0006F!\u0004n\u000ft\bm%{\u001a#x\u0019GjFy\u0003");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr2 = new Object[0];
        short sXd3 = (short) (OY.Xd() ^ 3715);
        short sXd4 = (short) (OY.Xd() ^ 4734);
        int[] iArr2 = new int["w_\u000ffJl2+6FjWG\u0014WSg\u0015I*o".length()];
        QB qb2 = new QB("w_\u000ffJl2+6FjWG\u0014WSg\u0015I*o");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            this.zab = (Context) method.invoke(context, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (message.what != 1) {
            String str = "Don't know how to handle this message: " + message.what;
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.zaa;
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(this.zab);
        if (googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
            this.zaa.showErrorNotification(this.zab, iIsGooglePlayServicesAvailable);
        }
    }
}
