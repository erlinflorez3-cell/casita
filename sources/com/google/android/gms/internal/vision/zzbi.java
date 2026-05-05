package com.google.android.gms.internal.vision;

import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbi<T> {

    @Nullable
    private static volatile zzbr zzb = null;
    private static volatile boolean zzc = false;
    private final zzbo zzf;
    private final String zzg;
    private final T zzh;
    private volatile int zzj;
    private volatile T zzk;
    private final boolean zzl;
    private static final Object zza = new Object();
    private static final AtomicReference<Collection<zzbi<?>>> zzd = new AtomicReference<>();
    private static zzbs zze = new zzbs(zzbk.zza);
    private static final AtomicInteger zzi = new AtomicInteger();

    private zzbi(zzbo zzboVar, String str, T t2, boolean z2) {
        this.zzj = -1;
        if (zzboVar.zza == null && zzboVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (zzboVar.zza != null && zzboVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzf = zzboVar;
        this.zzg = str;
        this.zzh = t2;
        this.zzl = z2;
    }

    /* synthetic */ zzbi(zzbo zzboVar, String str, Object obj, boolean z2, zzbn zzbnVar) {
        this(zzboVar, str, obj, z2);
    }

    @Nullable
    private final T zza(zzbr zzbrVar) throws Throwable {
        zzay zzayVarZza;
        Object objZza;
        String str;
        if (this.zzf.zzg || (str = (String) zzbd.zza(zzbrVar.zza()).zza(C1561oA.Xd("\t\u0010\u0017^\u0016\u000f\r\u0017\u0019\u001f%\u001d\u0013h \u0019\u0017!#)/'\u001d\u0018 '\u001d$w#%#7*#'?7)<=*<53=?EKC9", (short) (C1633zX.Xd() ^ (-13904))))) == null || !zzaq.zzb.matcher(str).matches()) {
            if (this.zzf.zzb == null) {
                zzayVarZza = zzbq.zza(zzbrVar.zza(), this.zzf.zza);
            } else if (!zzbg.zza(zzbrVar.zza(), this.zzf.zzb)) {
                zzayVarZza = null;
            } else if (this.zzf.zzh) {
                Context contextZza = zzbrVar.zza();
                Object[] objArr = new Object[0];
                Method method = Class.forName(hg.Vd("\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u000b\u0016\u0014\u0019\t\u0011\u0016Nb\u000e\f\u0011\u0001\u0013\u000e", (short) (ZN.Xd() ^ 17068), (short) (ZN.Xd() ^ 8881))).getMethod(C1561oA.ud("yv\u0005R}{\u0001px}Zlytpygs", (short) (C1499aX.Xd() ^ (-24653))), new Class[0]);
                try {
                    method.setAccessible(true);
                    ContentResolver contentResolver = (ContentResolver) method.invoke(contextZza, objArr);
                    String lastPathSegment = this.zzf.zzb.getLastPathSegment();
                    Context contextZza2 = zzbrVar.zza();
                    short sXd = (short) (C1580rY.Xd() ^ (-11859));
                    int[] iArr = new int["#1(7-($n\u001d**1\u001b%,f\u0015BBI3GD".length()];
                    QB qb = new QB("#1(7-($n\u001d**1\u001b%,f\u0015BBI3GD");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                        i2++;
                    }
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Yd("on~[mpypwv`t\u0002z", (short) (C1499aX.Xd() ^ (-32491))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        String str2 = (String) method2.invoke(contextZza2, objArr2);
                        StringBuilder sbAppend = new StringBuilder(String.valueOf(lastPathSegment).length() + 1 + String.valueOf(str2).length()).append(lastPathSegment);
                        short sXd2 = (short) (C1580rY.Xd() ^ (-8083));
                        short sXd3 = (short) (C1580rY.Xd() ^ (-17933));
                        int[] iArr2 = new int["\u000f".length()];
                        QB qb2 = new QB("\u000f");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                            i3++;
                        }
                        zzayVarZza = zzau.zza(contentResolver, zzbj.zza(sbAppend.append(new String(iArr2, 0, i3)).append(str2).toString()));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else {
                Context contextZza3 = zzbrVar.zza();
                short sXd4 = (short) (ZN.Xd() ^ 17862);
                short sXd5 = (short) (ZN.Xd() ^ 7470);
                int[] iArr3 = new int["\u0010\nh@*]ATz`H\u001cu8'.05\"pK\u0017\u0001".length()];
                QB qb3 = new QB("\u0010\nh@*]ATz`H\u001cu8'.05\"pK\u0017\u0001");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd5) ^ sXd4));
                    i4++;
                }
                Class<?> cls = Class.forName(new String(iArr3, 0, i4));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd6 = (short) (OY.Xd() ^ 8366);
                short sXd7 = (short) (OY.Xd() ^ 32212);
                int[] iArr4 = new int["~~tT\b'\u0017\u0010(uzx@\u0011OX]4".length()];
                QB qb4 = new QB("~~tT\b'\u0017\u0010(uzx@\u0011OX]4");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd7) + sXd6)));
                    i5++;
                }
                Method method3 = cls.getMethod(new String(iArr4, 0, i5), clsArr);
                try {
                    method3.setAccessible(true);
                    zzayVarZza = zzau.zza((ContentResolver) method3.invoke(contextZza3, objArr3), this.zzf.zzb);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            }
            if (zzayVarZza != null && (objZza = zzayVarZza.zza(zzb())) != null) {
                return zza(objZza);
            }
        } else if (Log.isLoggable(Wg.vd(",CCKGKSII)RFG", (short) (C1499aX.Xd() ^ (-11162))), 3)) {
            String strValueOf = String.valueOf(zzb());
            int length = strValueOf.length();
            String strKd = Qg.kd("d\u001b\u0011\u0001\u0012\u0011<\u000e\u007fz|\u0001\u0005|4czv~~\u0003\u0007|p*\u007fis{jw#hpr\u001fdi]b4\u0019", (short) (FB.Xd() ^ 7282), (short) (FB.Xd() ^ 17346));
            if (length != 0) {
                strKd.concat(strValueOf);
            } else {
                new String(strKd);
            }
        }
        return null;
    }

    private final String zza(String str) {
        if (str != null && str.isEmpty()) {
            return this.zzg;
        }
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf(this.zzg);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    static void zza() {
        zzi.incrementAndGet();
    }

    @Deprecated
    public static void zza(final Context context) {
        synchronized (zza) {
            zzbr zzbrVar = zzb;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud("W#\\\u0014v4:\u000bZYf\u0019\f8\u0003xev\\M\u001f\fz", (short) (C1580rY.Xd() ^ (-32564)), (short) (C1580rY.Xd() ^ (-6135)))).getMethod(Ig.wd("5\b#\u001dZ\u0016cVy=HE\u001d(F\u0012hn%\u001eS", (short) (C1633zX.Xd() ^ (-24690))), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                if (context2 != null) {
                    context = context2;
                }
                if (zzbrVar == null || zzbrVar.zza() != context) {
                    zzau.zzb();
                    zzbq.zza();
                    zzbd.zza();
                    zzb = new zzav(context, zzdi.zza(new zzdf(context) { // from class: com.google.android.gms.internal.vision.zzbl
                        private final Context zza;

                        {
                            this.zza = context;
                        }

                        @Override // com.google.android.gms.internal.vision.zzdf
                        public final Object zza() {
                            return zzbi.zzc(this.zza);
                        }
                    }));
                    zzi.incrementAndGet();
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public static <T> zzbi<T> zzb(zzbo zzboVar, String str, T t2, zzbp<T> zzbpVar, boolean z2) {
        return new zzbm(zzboVar, str, t2, true, zzbpVar);
    }

    @Nullable
    private final T zzb(zzbr zzbrVar) {
        if (!this.zzf.zze && (this.zzf.zzi == null || this.zzf.zzi.zza(zzbrVar.zza()).booleanValue())) {
            Object objZza = zzbd.zza(zzbrVar.zza()).zza(this.zzf.zze ? null : zza(this.zzf.zzc));
            if (objZza != null) {
                return zza(objZza);
            }
        }
        return null;
    }

    public static void zzb(Context context) {
        if (zzb != null) {
            return;
        }
        synchronized (zza) {
            if (zzb == null) {
                zza(context);
            }
        }
    }

    static final /* synthetic */ zzcy zzc(Context context) {
        new zzbh();
        return zzbh.zza(context);
    }

    static final /* synthetic */ boolean zzd() {
        return true;
    }

    abstract T zza(Object obj);

    public final String zzb() {
        return zza(this.zzf.zzd);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0048 A[Catch: all -> 0x0087, TryCatch #0 {, blocks: (B:52:0x001c, B:54:0x0020, B:58:0x0027, B:60:0x0032, B:62:0x0038, B:64:0x0048, B:66:0x0062, B:70:0x006a, B:67:0x0064, B:71:0x006f, B:80:0x0084, B:74:0x0076, B:77:0x007d, B:68:0x0068), top: B:86:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0084 A[Catch: all -> 0x0087, TryCatch #0 {, blocks: (B:52:0x001c, B:54:0x0020, B:58:0x0027, B:60:0x0032, B:62:0x0038, B:64:0x0048, B:66:0x0062, B:70:0x006a, B:67:0x0064, B:71:0x006f, B:80:0x0084, B:74:0x0076, B:77:0x007d, B:68:0x0068), top: B:86:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T zzc() {
        /*
            r6 = this;
            boolean r0 = r6.zzl
            if (r0 != 0) goto L11
            com.google.android.gms.internal.vision.zzbs r1 = com.google.android.gms.internal.vision.zzbi.zze
            java.lang.String r0 = r6.zzg
            boolean r1 = r1.zza(r0)
            java.lang.String r0 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            com.google.android.gms.internal.vision.zzde.zzb(r1, r0)
        L11:
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.vision.zzbi.zzi
            int r5 = r0.get()
            int r0 = r6.zzj
            if (r0 >= r5) goto L8a
            monitor-enter(r6)
            int r0 = r6.zzj     // Catch: java.lang.Throwable -> L87
            if (r0 >= r5) goto L68
            com.google.android.gms.internal.vision.zzbr r3 = com.google.android.gms.internal.vision.zzbi.zzb     // Catch: java.lang.Throwable -> L87
            if (r3 == 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            java.lang.String r0 = "Must call PhenotypeFlag.init() first"
            com.google.android.gms.internal.vision.zzde.zzb(r1, r0)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.vision.zzbo r0 = r6.zzf     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.zzf     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L76
            java.lang.Object r2 = r6.zzb(r3)     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L6f
        L38:
            com.google.android.gms.internal.vision.zzdf r0 = r3.zzb()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r1 = r0.zza()     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.vision.zzcy r1 = (com.google.android.gms.internal.vision.zzcy) r1     // Catch: java.lang.Throwable -> L87
            boolean r0 = r1.zza()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L64
            java.lang.Object r4 = r1.zzb()     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.vision.zzbe r4 = (com.google.android.gms.internal.vision.zzbe) r4     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.vision.zzbo r0 = r6.zzf     // Catch: java.lang.Throwable -> L87
            android.net.Uri r3 = r0.zzb     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.vision.zzbo r0 = r6.zzf     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = r0.zza     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.vision.zzbo r0 = r6.zzf     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r0.zzd     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = r6.zzg     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = r4.zza(r3, r2, r1, r0)     // Catch: java.lang.Throwable -> L87
            if (r0 != 0) goto L6a
            T r2 = r6.zzh     // Catch: java.lang.Throwable -> L87
        L64:
            r6.zzk = r2     // Catch: java.lang.Throwable -> L87
            r6.zzj = r5     // Catch: java.lang.Throwable -> L87
        L68:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L87
            goto L8a
        L6a:
            java.lang.Object r2 = r6.zza(r0)     // Catch: java.lang.Throwable -> L87
            goto L64
        L6f:
            java.lang.Object r2 = r6.zza(r3)     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L84
            goto L38
        L76:
            java.lang.Object r2 = r6.zza(r3)     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L7d
            goto L38
        L7d:
            java.lang.Object r2 = r6.zzb(r3)     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L84
            goto L38
        L84:
            T r2 = r6.zzh     // Catch: java.lang.Throwable -> L87
            goto L38
        L87:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L87
            throw r0
        L8a:
            T r0 = r6.zzk
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzbi.zzc():java.lang.Object");
    }
}
