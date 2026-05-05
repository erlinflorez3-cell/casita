package com.google.android.gms.internal.vision;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import androidx.core.content.PermissionChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
final class zzbd implements zzay {
    private static zzbd zza = null;

    @Nullable
    private final Context zzb;

    @Nullable
    private final ContentObserver zzc;

    private zzbd() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzbd(Context context) throws Throwable {
        this.zzb = context;
        zzbf zzbfVar = new zzbf(this, null);
        this.zzc = zzbfVar;
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("'\u0004\b6d\u000bi\u001c>(#\rIRRoRn77gP8", (short) (C1633zX.Xd() ^ (-11209)))).getMethod(C1561oA.Qd("30>\f75:*27\u0014&3.*3!-", (short) (C1633zX.Xd() ^ (-30874))), new Class[0]);
        try {
            method.setAccessible(true);
            ((ContentResolver) method.invoke(context, objArr)).registerContentObserver(zzaq.zza, true, zzbfVar);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static zzbd zza(Context context) {
        zzbd zzbdVar;
        synchronized (zzbd.class) {
            if (zza == null) {
                zza = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzbd(context) : new zzbd();
            }
            zzbdVar = zza;
        }
        return zzbdVar;
    }

    static synchronized void zza() {
        Context context;
        zzbd zzbdVar = zza;
        if (zzbdVar != null && (context = zzbdVar.zzb) != null && zzbdVar.zzc != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1593ug.zd("\u0002\u0010\u0007\u0016\u0014\u000f\u000bU\f\u0019\u0019 \u0012\u001c#]s!!(\u001a.+", (short) (FB.Xd() ^ 197), (short) (FB.Xd() ^ 27532))).getMethod(C1561oA.od("mjxFqotdlqN`mhdm[g", (short) (FB.Xd() ^ 16659)), new Class[0]);
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
    @Override // com.google.android.gms.internal.vision.zzay
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zza(final String str) {
        if (this.zzb == null) {
            return null;
        }
        try {
            return (String) zzbb.zza(new zzba(this, str) { // from class: com.google.android.gms.internal.vision.zzbc
                private final zzbd zza;
                private final String zzb;

                {
                    this.zza = this;
                    this.zzb = str;
                }

                @Override // com.google.android.gms.internal.vision.zzba
                public final Object zza() {
                    return this.zza.zzb(this.zzb);
                }
            });
        } catch (IllegalStateException | SecurityException e2) {
            String strValueOf = String.valueOf(str);
            if (strValueOf.length() != 0) {
                "Unable to read GServices for: ".concat(strValueOf);
            } else {
                new String("Unable to read GServices for: ");
            }
            return null;
        }
    }

    final /* synthetic */ String zzb(String str) throws Throwable {
        Context context = this.zzb;
        short sXd = (short) (C1633zX.Xd() ^ (-15439));
        int[] iArr = new int[":H?NLGC\u000eDQQXJT[\u0016,YY`Rfc".length()];
        QB qb = new QB(":H?NLGC\u000eDQQXJT[\u0016,YY`Rfc");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1580rY.Xd() ^ (-21937));
        short sXd3 = (short) (C1580rY.Xd() ^ (-9976));
        int[] iArr2 = new int["56/xOJ5$S8\u001eKb@@n;M".length()];
        QB qb2 = new QB("56/xOJ5$S8\u001eKb@@n;M");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            return zzaq.zza((ContentResolver) method.invoke(context, objArr), str, (String) null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
