package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import androidx.core.content.PermissionChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
final class zzco implements zzcl {
    private static zzco zza = null;

    @Nullable
    private final Context zzb;

    @Nullable
    private final ContentObserver zzc;

    private zzco() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzco(Context context) throws Throwable {
        this.zzb = context;
        zzcn zzcnVar = new zzcn(this, null);
        this.zzc = zzcnVar;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("\u0014\"\u0019(&!\u001dg\u001e++2$.5o\u000633:,@=", (short) (ZN.Xd() ^ 30703))).getMethod(Wg.vd("GDV$KIRBV[<NWRR[5A", (short) (C1499aX.Xd() ^ (-32250))), new Class[0]);
        try {
            method.setAccessible(true);
            ((ContentResolver) method.invoke(context, objArr)).registerContentObserver(zzcb.zza, true, zzcnVar);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static zzco zza(Context context) {
        zzco zzcoVar;
        synchronized (zzco.class) {
            if (zza == null) {
                zza = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzco(context) : new zzco();
            }
            zzcoVar = zza;
        }
        return zzcoVar;
    }

    static synchronized void zze() {
        Context context;
        zzco zzcoVar = zza;
        if (zzcoVar != null && (context = zzcoVar.zzb) != null && zzcoVar.zzc != null) {
            short sXd = (short) (ZN.Xd() ^ 30053);
            short sXd2 = (short) (ZN.Xd() ^ 7437);
            int[] iArr = new int["y\u0006z\b\u0004|v?s~|\u0002qy~7Kvtyi{v".length()];
            QB qb = new QB("y\u0006z\b\u0004|v?s~|\u0002qy~7Kvtyi{v");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("_\\j8cafV^c@R_ZV_MY", (short) (ZN.Xd() ^ 32574), (short) (ZN.Xd() ^ 7582)), new Class[0]);
            try {
                method.setAccessible(true);
                ((ContentResolver) method.invoke(context, objArr)).unregisterContentObserver(zza.zzc);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        zza = null;
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    @Nullable
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        Context context = this.zzb;
        if (context != null && !zzcc.zza(context)) {
            try {
                return (String) zzcj.zza(new zzck() { // from class: com.google.android.gms.internal.auth.zzcm
                    @Override // com.google.android.gms.internal.auth.zzck
                    public final Object zza() {
                        return this.zza.zzd(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e2) {
                "Unable to read GServices for: ".concat(String.valueOf(str));
            }
        }
        return null;
    }

    final /* synthetic */ String zzd(String str) throws Throwable {
        Context context = this.zzb;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud(" ,!.*#\u001de\u001a%#(\u0018 %]q\u001d\u001b \u0010\"\u001d", (short) (C1633zX.Xd() ^ (-6903)))).getMethod(C1561oA.yd("QN`.][dT`eFXiddm_k", (short) (C1607wl.Xd() ^ 24667)), new Class[0]);
        try {
            method.setAccessible(true);
            return zzcb.zza((ContentResolver) method.invoke(context, objArr), str, null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
