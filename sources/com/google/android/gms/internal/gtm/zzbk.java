package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbk extends zzbu {
    public static boolean zza = false;
    private AdvertisingIdClient.Info zzb;
    private final zzfq zzc;
    private String zzd;
    private boolean zze;
    private final Object zzf;

    zzbk(zzbx zzbxVar) {
        super(zzbxVar);
        this.zze = false;
        this.zzf = new Object();
        this.zzc = new zzfq(zzbxVar.zzr());
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x03d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzc() {
        /*
            Method dump skipped, instruction units count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbk.zzc():com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    private static String zze(String str) {
        MessageDigest messageDigestZze = zzfu.zze(MessageDigestAlgorithms.MD5);
        if (messageDigestZze == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestZze.digest(str.getBytes())));
    }

    private final boolean zzf(String str) throws Throwable {
        try {
            String strZze = zze(str);
            zzN(C1561oA.od(")ICE;?7n6.?3/-g(*.(p", (short) (Od.Xd() ^ (-5683))));
            Context contextZzo = zzo();
            String strKd = C1561oA.Kd("snQ{yv\u0001\b]yZx\rz", (short) (ZN.Xd() ^ 26276));
            Class<?> cls = Class.forName(Wg.Zd("\u007fQ<k]*\u0006T\u001f*}hjh\u0002\f\u0016G5 \u0016\u001a\u001b", (short) (ZN.Xd() ^ 19079), (short) (ZN.Xd() ^ 4717)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.Xd(";3I5\u0003B8F@\b.POGMG", (short) (Od.Xd() ^ (-26849))));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {strKd, 0};
            Method method = cls.getMethod(Wg.vd(":<2<\r15/\"IIFDD", (short) (FB.Xd() ^ 21384)), clsArr);
            try {
                method.setAccessible(true);
                FileOutputStream fileOutputStream = (FileOutputStream) method.invoke(contextZzo, objArr);
                fileOutputStream.write(strZze.getBytes());
                fileOutputStream.close();
                this.zzd = strZze;
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException e3) {
            zzJ(Qg.kd("Frqmo\u001c^l^Yk_c[\u0013ZRcW\u000eSUWO", (short) (C1607wl.Xd() ^ 14922), (short) (C1607wl.Xd() ^ 28467)), e3);
            return false;
        }
    }

    public final String zza() {
        zzV();
        AdvertisingIdClient.Info infoZzc = zzc();
        String id = infoZzc != null ? infoZzc.getId() : null;
        if (TextUtils.isEmpty(id)) {
            return null;
        }
        return id;
    }

    public final boolean zzb() {
        zzV();
        AdvertisingIdClient.Info infoZzc = zzc();
        return (infoZzc == null || infoZzc.isLimitAdTrackingEnabled()) ? false : true;
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
    }
}
