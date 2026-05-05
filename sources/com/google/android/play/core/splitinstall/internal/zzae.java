package com.google.android.play.core.splitinstall.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
final class zzae implements ServiceConnection {
    final /* synthetic */ zzaf zza;

    /* synthetic */ zzae(zzaf zzafVar, zzad zzadVar) {
        this.zza = zzafVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        zzu zzuVar = this.zza.zzc;
        Object[] objArr = {componentName};
        short sXd = (short) (Od.Xd() ^ (-26248));
        short sXd2 = (short) (Od.Xd() ^ (-21396));
        int[] iArr = new int["D~2lY5;\u001e^@weg}\u001d\u001bds\u0007\u000e\u001c]dfnY4n Sv\r8) \u0007~ @S_}Q\u000f".length()];
        QB qb = new QB("D~2lY5;\u001e^@weg}\u001d\u001bds\u0007\u000e\u001c]dfnY4n Sv\r8) \u0007~ @S_}Q\u000f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        zzuVar.zzd(new String(iArr, 0, i2), objArr);
        zzaf zzafVar = this.zza;
        zzab zzabVar = new zzab(this, iBinder);
        Handler handlerZzc = zzafVar.zzc();
        short sXd3 = (short) (Od.Xd() ^ (-7585));
        int[] iArr2 = new int["Y68l8dQi\u007f\u0016P\u000bt\u0006U}AB".length()];
        QB qb2 = new QB("Y68l8dQi\u007f\u0016P\u000bt\u0006U}AB");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = {Class.forName(EO.Od("\u001ba:\u0007F*E\u00040TP\u001cdX9a1\u000e", (short) (C1633zX.Xd() ^ (-19008))))};
        Object[] objArr2 = {zzabVar};
        short sXd4 = (short) (FB.Xd() ^ 1527);
        int[] iArr3 = new int["\u001f\u001d  ".length()];
        QB qb3 = new QB("\u001f\u001d  ");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handlerZzc, objArr2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) throws Throwable {
        this.zza.zzc.zzd(C1593ug.zd("h{\n\u000f\u0003}\u0001_\r\r\u000e\u0006\u0005\u0017\r\u0014\u0014o\u0015\u0019\u0016X\u001b\u001b\u0001\u0014\"'\u001b\u0016\u0019x\u001f*\u001b(()! 2$$hf6l", (short) (C1633zX.Xd() ^ (-2864)), (short) (C1633zX.Xd() ^ (-14151))), componentName);
        zzaf zzafVar = this.zza;
        zzac zzacVar = new zzac(this);
        Handler handlerZzc = zzafVar.zzc();
        short sXd = (short) (ZN.Xd() ^ 24690);
        int[] iArr = new int["`lanjc]&fi#<T`U\\T`".length()];
        QB qb = new QB("`lanjc]&fi#<T`U\\T`");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {zzacVar};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.Zd("_\u007f5g", (short) (Od.Xd() ^ (-22451)), (short) (Od.Xd() ^ (-26948))), Class.forName(C1561oA.Kd("sk\u0002m;zp~x@e\n\u0004\u0005xz\u0006\u007f", (short) (C1607wl.Xd() ^ 27673))));
        try {
            method.setAccessible(true);
            method.invoke(handlerZzc, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
