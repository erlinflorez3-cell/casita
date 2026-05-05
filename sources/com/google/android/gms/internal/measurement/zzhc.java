package com.google.android.gms.internal.measurement;

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
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
final class zzhc implements zzhb {
    private static zzhc zza = null;

    @Nullable
    private final Context zzb;

    @Nullable
    private final ContentObserver zzc;

    private zzhc() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzhc(Context context) throws Throwable {
        this.zzb = context;
        zzhe zzheVar = new zzhe(this, null);
        this.zzc = zzheVar;
        Class<?> cls = Class.forName(C1561oA.Kd("\u0013!\u0018'% \u001cf\u001d**1#-4n\u0005229+?<", (short) (C1633zX.Xd() ^ (-21826))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-30656));
        short sXd2 = (short) (C1499aX.Xd() ^ (-20473));
        int[] iArr = new int["\u001a-v\u007f\u0007wx\u0003E>7\u0004L\u001e\u0015\u0019\u0003b".length()];
        QB qb = new QB("\u001a-v\u007f\u0007wx\u0003E>7\u0004L\u001e\u0015\u0019\u0003b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            ((ContentResolver) method.invoke(context, objArr)).registerContentObserver(zzgi.zza, true, zzheVar);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static zzhc zza(Context context) {
        zzhc zzhcVar;
        synchronized (zzhc.class) {
            if (zza == null) {
                zza = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzhc(context) : new zzhc();
            }
            zzhcVar = zza;
        }
        return zzhcVar;
    }

    static synchronized void zza() {
        Context context;
        zzhc zzhcVar = zza;
        if (zzhcVar != null && (context = zzhcVar.zzb) != null && zzhcVar.zzc != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Xd("\u001e,#20+'q(55<.8?y\u0010==D6JG", (short) (C1499aX.Xd() ^ (-10932)))).getMethod(Wg.vd("/,>\f31:*>C$6?::C\u001d)", (short) (C1607wl.Xd() ^ 30128)), new Class[0]);
            try {
                method.setAccessible(true);
                ((ContentResolver) method.invoke(context, objArr)).unregisterContentObserver(zza.zzc);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        zza = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzhb
    @Nullable
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zza(final String str) {
        Context context = this.zzb;
        if (context != null && !zzgs.zza(context)) {
            try {
                return (String) zzha.zza(new zzhd() { // from class: com.google.android.gms.internal.measurement.zzhf
                    @Override // com.google.android.gms.internal.measurement.zzhd
                    public final Object zza() {
                        return this.zza.zzb(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e2) {
                String str2 = "Unable to read GServices for: " + str;
            }
        }
        return null;
    }

    final /* synthetic */ String zzb(String str) throws Throwable {
        Context context = this.zzb;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("\u0005\u0011\u0006\u0013\u000f\b\u0002J~\n\b\r|\u0005\nBV\u0002\u007f\u0005t\u0007\u0002", (short) (C1633zX.Xd() ^ (-21819)), (short) (C1633zX.Xd() ^ (-5532)))).getMethod(hg.Vd(",)7\u00050.3#+0\r\u001f,'#,\u001a&", (short) (OY.Xd() ^ 22681), (short) (OY.Xd() ^ 10508)), new Class[0]);
        try {
            method.setAccessible(true);
            return zzgj.zza((ContentResolver) method.invoke(context, objArr), str, null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
