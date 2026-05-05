package com.google.android.play.core.review.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
final class zzr implements ServiceConnection {
    final /* synthetic */ zzt zza;

    /* synthetic */ zzr(zzt zztVar, zzs zzsVar) {
        this.zza = zztVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        this.zza.zzc.zzc(C1561oA.od("~\u0010\u001c\u001f\u0011\n\u000bg\u0013\u0011\u0010\u0006\u0003\u0013\u0007\f\nc\u0007\t\u0004D\u0005\u0003fw\u0004\u0007xqrOzxwmjzjh+'t)", (short) (ZN.Xd() ^ 5285)), componentName);
        zzp zzpVar = new zzp(this, iBinder);
        Handler handlerZzc = this.zza.zzc();
        Class<?> cls = Class.forName(C1561oA.Kd("s\u0002x\b\u0006\u0001|G\n\u000fJe\u007f\u000e\u0005\u000e\b\u0016", (short) (C1607wl.Xd() ^ 30693)));
        Class<?>[] clsArr = {Class.forName(Wg.Zd("vf G\u0019\u00101387@ ]Vu+\u00030", (short) (Od.Xd() ^ (-25981)), (short) (Od.Xd() ^ (-20847))))};
        Object[] objArr = {zzpVar};
        short sXd = (short) (ZN.Xd() ^ 12643);
        int[] iArr = new int["##(*".length()];
        QB qb = new QB("##(*");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handlerZzc, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) throws Throwable {
        zzi zziVar = this.zza.zzc;
        Object[] objArr = {componentName};
        short sXd = (short) (C1499aX.Xd() ^ (-32542));
        int[] iArr = new int["\u0015&69/(-\n97:01A9> y!#\"b'%\r\u001e.1' %\u0003\u000b\u0014\u0007\u0012\u0014\u0013\r\n\u001e\u000e\u0010RR X".length()];
        QB qb = new QB("\u0015&69/(-\n97:01A9> y!#\"b'%\r\u001e.1' %\u0003\u000b\u0014\u0007\u0012\u0014\u0013\r\n\u001e\u000e\u0010RR X");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        zziVar.zzc(new String(iArr, 0, i2), objArr);
        zzq zzqVar = new zzq(this);
        Handler handlerZzc = this.zza.zzc();
        Class<?> cls = Class.forName(Qg.kd("VbWd`YS\u001c\\_\u00192JVKRJV", (short) (Od.Xd() ^ (-12929)), (short) (Od.Xd() ^ (-7760))));
        Class<?>[] clsArr = {Class.forName(hg.Vd("dZnX$aUaY\u001fBd\\[MMVN", (short) (Od.Xd() ^ (-18558)), (short) (Od.Xd() ^ (-13454))))};
        Object[] objArr2 = {zzqVar};
        short sXd2 = (short) (C1499aX.Xd() ^ (-1210));
        int[] iArr2 = new int["}{~~".length()];
        QB qb2 = new QB("}{~~");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handlerZzc, objArr2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
