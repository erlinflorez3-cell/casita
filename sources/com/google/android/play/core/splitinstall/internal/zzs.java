package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public abstract class zzs {
    protected final zzu zza;
    private final IntentFilter zzc;
    private final Context zzd;
    protected final Set zzb = new HashSet();
    private zzr zze = null;
    private volatile boolean zzf = false;

    protected zzs(zzu zzuVar, IntentFilter intentFilter, Context context) {
        this.zza = zzuVar;
        this.zzc = intentFilter;
        this.zzd = zzbr.zza(context);
    }

    private final void zzf() throws Throwable {
        zzr zzrVar;
        if ((this.zzf || !this.zzb.isEmpty()) && this.zze == null) {
            this.zze = new zzr(this, null);
            if (Build.VERSION.SDK_INT >= 33) {
                Context context = this.zzd;
                zzr zzrVar2 = this.zze;
                IntentFilter intentFilter = this.zzc;
                Class<?> cls = Class.forName(Qg.kd("*6+84-'o$/-2\"*/g{'%*\u001a,'", (short) (C1499aX.Xd() ^ (-20118)), (short) (C1499aX.Xd() ^ (-2908))));
                Class<?>[] clsArr = new Class[3];
                short sXd = (short) (C1580rY.Xd() ^ (-1178));
                short sXd2 = (short) (C1580rY.Xd() ^ (-14311));
                int[] iArr = new int["x\u0005y\u0007\u0003{u>r}{\u0001px}6IxtegebssPb_`co]i".length()];
                QB qb = new QB("x\u0005y\u0007\u0003{u>r}{\u0001px}6IxtegebssPb_`co]i");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                    i2++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i2));
                clsArr[1] = Class.forName(C1561oA.ud("O[P]YRL\u0015ITRWGOT\r'KP@HM\u001e@BI9E", (short) (OY.Xd() ^ 23043)));
                clsArr[2] = Integer.TYPE;
                Object[] objArr = {zzrVar2, intentFilter, 2};
                Method method = cls.getMethod(C1561oA.yd("NBADSUCQ&:58AO;I", (short) (C1580rY.Xd() ^ (-9317))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                Context context2 = this.zzd;
                zzr zzrVar3 = this.zze;
                IntentFilter intentFilter2 = this.zzc;
                Class<?> cls2 = Class.forName(C1561oA.Yd("0>5DB=9\u0004:GGN@JQ\f\"OOVH\\Y", (short) (Od.Xd() ^ (-16069))));
                Class<?>[] clsArr2 = new Class[2];
                short sXd3 = (short) (Od.Xd() ^ (-19225));
                short sXd4 = (short) (Od.Xd() ^ (-5174));
                int[] iArr2 = new int["5C:IGB>\t?LLSEOV\u0011&WUHLLK^`?SRUZhXf".length()];
                QB qb2 = new QB("5C:IGB>\t?LLSEOV\u0011&WUHLLK^`?SRUZhXf");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) + sXd4);
                    i3++;
                }
                clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
                clsArr2[1] = Class.forName(Jg.Wd(",FG^e\u0007\u000b^\u001f8arl|-o\u0016EXt\b\u0017o=I\\Zq", (short) (C1633zX.Xd() ^ (-17097)), (short) (C1633zX.Xd() ^ (-3569))));
                Object[] objArr2 = {zzrVar3, intentFilter2};
                short sXd5 = (short) (C1607wl.Xd() ^ 20740);
                short sXd6 = (short) (C1607wl.Xd() ^ 7106);
                int[] iArr3 = new int["W\u001asA2O'4Lt\u0015\u0006A\u001eGY".length()];
                QB qb3 = new QB("W\u001asA2O'4Lt\u0015\u0006A\u001eGY");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd6) + sXd5)));
                    i4++;
                }
                Method method2 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                try {
                    method2.setAccessible(true);
                    method2.invoke(context2, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }
        if (this.zzf || !this.zzb.isEmpty() || (zzrVar = this.zze) == null) {
            return;
        }
        Context context3 = this.zzd;
        short sXd7 = (short) (ZN.Xd() ^ 2904);
        short sXd8 = (short) (ZN.Xd() ^ 23666);
        int[] iArr4 = new int["9FGsqR8vG=pMa+I\u0010\u001c\u001b\tK35o".length()];
        QB qb4 = new QB("9FGsqR8vG=pMa+I\u0010\u001c\u001b\tK35o");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + (i5 * sXd8))) + xuXd4.CK(iKK4));
            i5++;
        }
        Object[] objArr3 = {zzrVar};
        Method method3 = Class.forName(new String(iArr4, 0, i5)).getMethod(EO.Od("V\u00024BD\u0014\u0006N~K%^\b\b\b6Ry", (short) (ZN.Xd() ^ 932)), Class.forName(Ig.wd("1n`MW,A\u0019\u001b\n0Np\u0006\u001en>\u000b=\u0005Ey\u0010\u001cZZ\tNt$KS\u000f", (short) (C1633zX.Xd() ^ (-10243)))));
        try {
            method3.setAccessible(true);
            method3.invoke(context3, objArr3);
            this.zze = null;
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    protected abstract void zza(Context context, Intent intent);

    public final synchronized void zzb(StateUpdatedListener stateUpdatedListener) {
        this.zza.zzd("registerListener", new Object[0]);
        zzbv.zza(stateUpdatedListener, "Registered Play Core listener should not be null.");
        this.zzb.add(stateUpdatedListener);
        zzf();
    }

    public final synchronized void zzc(boolean z2) {
        this.zzf = true;
        zzf();
    }

    public final synchronized void zzd(StateUpdatedListener stateUpdatedListener) {
        this.zza.zzd("unregisterListener", new Object[0]);
        zzbv.zza(stateUpdatedListener, "Unregistered Play Core listener should not be null.");
        this.zzb.remove(stateUpdatedListener);
        zzf();
    }

    public final synchronized void zze(Object obj) {
        Iterator it = new HashSet(this.zzb).iterator();
        while (it.hasNext()) {
            ((StateUpdatedListener) it.next()).onStateUpdate(obj);
        }
    }
}
