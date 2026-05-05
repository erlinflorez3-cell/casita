package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes9.dex */
public final class zzam {
    private final com.google.android.play.core.splitcompat.zze zza;
    private final zzah zzb;
    private final Context zzc;
    private final zzal zzd;
    private PackageInfo zze;

    public zzam(Context context, com.google.android.play.core.splitcompat.zze zzeVar, zzah zzahVar) {
        zzal zzalVar = new zzal(new com.google.android.play.core.splitcompat.zza(zzeVar));
        this.zza = zzeVar;
        this.zzb = zzahVar;
        this.zzc = context;
        this.zzd = zzalVar;
    }

    private final PackageInfo zzd() throws Throwable {
        if (this.zze == null) {
            try {
                Context context = this.zzc;
                short sXd = (short) (C1633zX.Xd() ^ (-24524));
                short sXd2 = (short) (C1633zX.Xd() ^ (-17745));
                int[] iArr = new int["q{N\u00072\fE`f\u001a}3/Ag%P.\u001f3>|4".length()];
                QB qb = new QB("q{N\u00072\fE`f\u001a}3/Ag%P.\u001f3>|4");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd3 = (short) (C1580rY.Xd() ^ (-6738));
                int[] iArr2 = new int["S\u0006EF-zl(\f\u001f\u000b;\u0016\u0001\r&z".length()];
                QB qb2 = new QB("S\u0006EF-zl(\f\u001f\u000b;\u0016\u0001\r&z");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    Context context2 = this.zzc;
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(EO.Od("\u0017um\u001f|L\u001fHA\\Q\u0002BMS2\u001d/eW\fF\\", (short) (ZN.Xd() ^ 21695))).getMethod(C1561oA.Qd("A>L'78?496\u001e0;2", (short) (C1633zX.Xd() ^ (-27795))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        String str = (String) method2.invoke(context2, objArr2);
                        Class<?> cls2 = Class.forName(C1593ug.zd("\u0013!\u0018'% \u001cf\u001d**1#-4n20q\u0015'*3*10\u0019.<076D", (short) (C1580rY.Xd() ^ (-2994)), (short) (C1580rY.Xd() ^ (-25036))));
                        Class<?>[] clsArr2 = new Class[2];
                        short sXd4 = (short) (OY.Xd() ^ 27223);
                        int[] iArr3 = new int["^ThR\u001e[O[S\u0019=]ZPTL".length()];
                        QB qb3 = new QB("^ThR\u001e[O[S\u0019=]ZPTL");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                            i4++;
                        }
                        clsArr2[0] = Class.forName(new String(iArr3, 0, i4));
                        clsArr2[1] = Integer.TYPE;
                        Object[] objArr3 = {str, 64};
                        short sXd5 = (short) (FB.Xd() ^ 3325);
                        int[] iArr4 = new int["\u0016\u0015%\u0002\u0014\u0017 \u0017\u001e\u001d\u0002(!+".length()];
                        QB qb4 = new QB("\u0016\u0015%\u0002\u0014\u0017 \u0017\u001e\u001d\u0002(!+");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd5 + sXd5) + i5));
                            i5++;
                        }
                        Method method3 = cls2.getMethod(new String(iArr4, 0, i5), clsArr2);
                        try {
                            method3.setAccessible(true);
                            this.zze = (PackageInfo) method3.invoke(packageManager, objArr3);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.zze;
    }

    private static X509Certificate zze(Signature signature) throws Throwable {
        String strZd = Wg.Zd("#/M^", (short) (C1499aX.Xd() ^ (-20695)), (short) (C1499aX.Xd() ^ (-9677)));
        short sXd = (short) (ZN.Xd() ^ 7711);
        int[] iArr = new int["\u001c\u0014*\u0016c*\u001d\u001c/-%17l#&47q\b+9<204/.B4\u001625GCGO".length()];
        QB qb = new QB("\u001c\u0014*\u0016c*\u001d\u001c/-%17l#&47q\b+9<204/.B4\u001625GCGO");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Wg.vd("\\TjV\u001c[Q_a)Oqh`f`", (short) (C1499aX.Xd() ^ (-9753))));
            Object[] objArr = {strZd};
            Method declaredMethod = cls.getDeclaredMethod(Qg.kd("[Xf:^bbNZNO", (short) (ZN.Xd() ^ 27277), (short) (ZN.Xd() ^ 11914)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
                Class<?> cls2 = Class.forName(hg.Vd("lbv`,pa^okako#WXde\u001e2S_`TPRKHZJ*DEUOQW", (short) (C1499aX.Xd() ^ (-28936)), (short) (C1499aX.Xd() ^ (-1772))));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(C1561oA.ud("\u001c\u0012&\u0010[\u0016\u001bXr\u0017\u0018\u001c\u001aw\u0018\u0015\u0007\u0002\r", (short) (FB.Xd() ^ 26510)));
                Object[] objArr2 = {byteArrayInputStream};
                Method method = cls2.getMethod(C1561oA.yd("/,4*6$6&\u00134@A513,\u0019+\u001b", (short) (C1499aX.Xd() ^ (-28453))), clsArr2);
                try {
                    method.setAccessible(true);
                    return (X509Certificate) ((Certificate) method.invoke(certificateFactory, objArr2));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (CertificateException e4) {
            C1561oA.Yd("\"@=;G\u0017DCG9M", (short) (Od.Xd() ^ (-20198)));
            short sXd2 = (short) (Od.Xd() ^ (-13157));
            short sXd3 = (short) (Od.Xd() ^ (-85));
            int[] iArr2 = new int["l\f\u001a\u001b\u001d#O\u0015\u0017\u0016#\u0019\u001bV\u001b\u001e,/%#'\"!5'p".length()];
            QB qb2 = new QB("l\f\u001a\u001b\u001d#O\u0015\u0017\u0016#\u0019\u001bV\u001b\u001e,/%#'\"!5'p");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                i3++;
            }
            new String(iArr2, 0, i3);
            return null;
        }
    }

    public final boolean zza(File[] fileArr) throws Throwable {
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? zzd().getLongVersionCode() : r2.versionCode;
        AssetManager assetManager = (AssetManager) zzbk.zzc(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.zzd.zzb(assetManager, fileArr[length]);
        } while (longVersionCode == this.zzd.zza());
        return false;
    }

    public final boolean zzb(List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.zza.zzg(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0064, code lost:
    
        r0 = "Downloaded split " + r1 + " is not signed.";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(java.io.File[] r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.String r6 = " is not signed."
            java.lang.String r5 = "Downloaded split "
            android.content.pm.PackageInfo r1 = r11.zzd()
            r9 = 0
            r10 = 0
            if (r1 == 0) goto L10
            android.content.pm.Signature[] r0 = r1.signatures
            if (r0 != 0) goto L1d
        L10:
            java.lang.String r0 = "SplitCompat"
            if (r9 == 0) goto L1a
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L36
        L1a:
            java.lang.String r0 = "No app certificates found."
            return r10
        L1d:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            android.content.pm.Signature[] r3 = r1.signatures
            int r2 = r3.length
            r1 = r10
        L26:
            if (r1 >= r2) goto L10
            r0 = r3[r1]
            java.security.cert.X509Certificate r0 = zze(r0)
            if (r0 == 0) goto L33
            r9.add(r0)
        L33:
            int r1 = r1 + 1
            goto L26
        L36:
            int r8 = r12.length
        L37:
            int r8 = r8 + (-1)
            if (r8 < 0) goto Lab
            r0 = r12[r8]
            java.lang.String r1 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> La7
            java.security.cert.X509Certificate[][] r7 = com.google.android.play.core.splitinstall.internal.zzi.zza(r1)     // Catch: java.lang.Exception -> L48
            if (r7 == 0) goto L64
            goto L5c
        L48:
            r0 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La7
            r0.<init>()     // Catch: java.lang.Exception -> La7
            r0.append(r5)     // Catch: java.lang.Exception -> La7
            r0.append(r1)     // Catch: java.lang.Exception -> La7
            r0.append(r6)     // Catch: java.lang.Exception -> La7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> La7
            goto L76
        L5c:
            int r0 = r7.length     // Catch: java.lang.Exception -> La7
            if (r0 == 0) goto L64
            r0 = r7[r10]     // Catch: java.lang.Exception -> La7
            int r0 = r0.length     // Catch: java.lang.Exception -> La7
            if (r0 != 0) goto L79
        L64:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La7
            r0.<init>()     // Catch: java.lang.Exception -> La7
            r0.append(r5)     // Catch: java.lang.Exception -> La7
            r0.append(r1)     // Catch: java.lang.Exception -> La7
            r0.append(r6)     // Catch: java.lang.Exception -> La7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> La7
        L76:
            java.lang.String r0 = "Split verification failure."
            goto La6
        L79:
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Exception -> La7
            if (r0 == 0) goto L82
            java.lang.String r0 = "No certificates found for app."
            goto L76
        L82:
            java.util.Iterator r4 = r9.iterator()     // Catch: java.lang.Exception -> La7
        L86:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Exception -> La7
            if (r0 == 0) goto L37
            java.lang.Object r3 = r4.next()     // Catch: java.lang.Exception -> La7
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch: java.lang.Exception -> La7
            int r2 = r7.length     // Catch: java.lang.Exception -> La7
            r1 = r10
        L94:
            if (r1 >= r2) goto La3
            r0 = r7[r1]     // Catch: java.lang.Exception -> La7
            r0 = r0[r10]     // Catch: java.lang.Exception -> La7
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Exception -> La7
            if (r0 != 0) goto L86
            int r1 = r1 + 1
            goto L94
        La3:
            java.lang.String r0 = "There's an app certificate that doesn't sign the split."
            goto L76
        La6:
            return r10
        La7:
            r0 = move-exception
            java.lang.String r0 = "Split verification error."
            return r10
        Lab:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.internal.zzam.zzc(java.io.File[]):boolean");
    }
}
