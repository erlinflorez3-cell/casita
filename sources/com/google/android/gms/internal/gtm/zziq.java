package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
final class zziq implements zzgy {
    private final String zza;
    private final Context zzb;
    private final zzip zzc;
    private final Map zzd;
    private final Map zze;
    private final Clock zzf;
    private final zzio zzg = new zzio();

    zziq(Context context, zzip zzipVar) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 26740);
        short sXd2 = (short) (FB.Xd() ^ 4264);
        int[] iArr = new int["72\r)v\u0013\tb[#:A[I/\u0001\tF%\u001bbJ|".length()];
        QB qb = new QB("72\r)v\u0013\tb[#:A[I/\u0001\tF%\u001bbJ|");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (OY.Xd() ^ 27046);
        short sXd4 = (short) (OY.Xd() ^ 28740);
        int[] iArr2 = new int["COv69~\u001e\u000bC \u001d\fcg^jJ\u0010p&0".length()];
        QB qb2 = new QB("COv69~\u001e\u000bC \u001d\fcg^jJ\u0010p&0");
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
            this.zzb = (Context) method.invoke(context, objArr);
            this.zzc = zzipVar;
            this.zzd = new HashMap();
            this.zze = new HashMap();
            this.zzf = DefaultClock.getInstance();
            String str = Build.VERSION.RELEASE;
            Locale locale = Locale.getDefault();
            String string = null;
            if (locale != null && locale.getLanguage() != null && locale.getLanguage().length() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(locale.getLanguage().toLowerCase());
                if (locale.getCountry() != null && locale.getCountry().length() != 0) {
                    short sXd5 = (short) (Od.Xd() ^ (-17191));
                    int[] iArr3 = new int["\u000b".length()];
                    QB qb3 = new QB("\u000b");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd5 + i4)));
                        i4++;
                    }
                    sb.append(new String(iArr3, 0, i4));
                    sb.append(locale.getCountry().toLowerCase());
                }
                string = sb.toString();
            }
            this.zza = String.format(C1593ug.zd("T$`W'T]\u0003!'/3v\\\u0013y_\u00020'64/+gm=\u0006kqA\nouEr\u0016J?C<\b~N\u0005", (short) (C1607wl.Xd() ^ 28576), (short) (C1607wl.Xd() ^ 1367)), EO.Od("L&Hd*W\u001e,Tjt,MUs'", (short) (C1607wl.Xd() ^ 29101)), C1561oA.Qd("phin", (short) (C1633zX.Xd() ^ (-28313))), str, string, Build.MODEL, Build.ID);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static final URL zzc(zzhb zzhbVar) {
        try {
            return new URL(zzhbVar.zze());
        } catch (MalformedURLException unused) {
            zzho.zza("Error trying to parse the GTM url.");
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:176:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05eb A[LOOP:3: B:178:0x05e5->B:180:0x05eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0528 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e1 A[Catch: all -> 0x050e, TryCatch #10 {all -> 0x050e, blocks: (B:42:0x01da, B:44:0x01e1, B:45:0x01e9, B:47:0x01ef, B:50:0x021d, B:51:0x0238, B:54:0x0280, B:56:0x0286, B:58:0x028c, B:61:0x02a0, B:63:0x02b7, B:64:0x02bc), top: B:203:0x01da }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0238 A[Catch: all -> 0x050e, TRY_LEAVE, TryCatch #10 {all -> 0x050e, blocks: (B:42:0x01da, B:44:0x01e1, B:45:0x01e9, B:47:0x01ef, B:50:0x021d, B:51:0x0238, B:54:0x0280, B:56:0x0286, B:58:0x028c, B:61:0x02a0, B:63:0x02b7, B:64:0x02bc), top: B:203:0x01da }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bf  */
    @Override // com.google.android.gms.internal.gtm.zzgy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.util.List r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zziq.zza(java.util.List):void");
    }

    @Override // com.google.android.gms.internal.gtm.zzgy
    public final boolean zzb() throws Throwable {
        Context context = this.zzb;
        Object[] objArr = {C1561oA.yd("\u0004\u0011\r\u000e\n\t\u0017\r\u001f\u0013\u001b!", (short) (OY.Xd() ^ 18026))};
        Method method = Class.forName(C1561oA.Yd("w\u0006|\f\n\u0005\u0001K\u0002\u000f\u000f\u0016\b\u0012\u0019Si\u0017\u0017\u001e\u0010$!", (short) (FB.Xd() ^ 25201))).getMethod(Jg.Wd("B$\u000b\\Z\bdL(%;c\u001f%\u0017,", (short) (C1633zX.Xd() ^ (-4316)), (short) (C1633zX.Xd() ^ (-29614))), Class.forName(Xg.qd("\u0005|\u0013~L\f\u0002\u0010\nQw\u001a\u0019\u0011\u0017\u0011", (short) (C1499aX.Xd() ^ (-21380)), (short) (C1499aX.Xd() ^ (-19612)))));
        try {
            method.setAccessible(true);
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) method.invoke(context, objArr)).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            zzho.zzd(ZO.xd("nx\u00056\u0010)@\u0005\u0013\u001cs0\u000e\rr>$\u001bU\u0006(^q7\u001c\u001c", (short) (C1499aX.Xd() ^ (-24413)), (short) (C1499aX.Xd() ^ (-3735))));
            return false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
