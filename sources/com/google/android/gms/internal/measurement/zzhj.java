package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.content.Context;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import yg.C1561oA;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzhj<T> {
    private static final Object zza = new Object();

    @Nullable
    private static volatile zzhu zzb = null;
    private static volatile boolean zzc = false;
    private static zzhy zzd = null;
    private static final AtomicInteger zze;
    private final zzhr zzf;
    private final String zzg;
    private Object zzh;
    private volatile int zzi;
    private volatile T zzj;
    private final boolean zzk;
    private volatile boolean zzl;

    static {
        new AtomicReference();
        zzd = new zzhy(new zzhx() { // from class: com.google.android.gms.internal.measurement.zzho
            @Override // com.google.android.gms.internal.measurement.zzhx
            public final boolean zza() {
                return zzhj.zzd();
            }
        });
        zze = new AtomicInteger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    zzhj(zzhr zzhrVar, String str, T t2, boolean z2) {
        this.zzi = -1;
        if (zzhrVar.zza == null && zzhrVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (zzhrVar.zza != null && zzhrVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzf = zzhrVar;
        this.zzg = str;
        this.zzh = t2;
        this.zzk = z2;
        this.zzl = false;
    }

    /* synthetic */ zzhj(zzhr zzhrVar, String str, Object obj, boolean z2, zzht zzhtVar) {
        this(zzhrVar, str, obj, true);
    }

    static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Boolean bool, boolean z2) {
        return new zzhq(zzhrVar, str, bool, true);
    }

    static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Double d2, boolean z2) {
        return new zzhp(zzhrVar, str, d2, true);
    }

    static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Long l2, boolean z2) {
        return new zzhn(zzhrVar, str, l2, true);
    }

    static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, String str2, boolean z2) {
        return new zzhs(zzhrVar, str, str2, true);
    }

    @Nullable
    private final T zza(zzhu zzhuVar) {
        if (!this.zzf.zze && (this.zzf.zzh == null || this.zzf.zzh.apply(zzhuVar.zza()).booleanValue())) {
            Object objZza = zzhc.zza(zzhuVar.zza()).zza(this.zzf.zze ? null : zza(this.zzf.zzc));
            if (objZza != null) {
                return zza(objZza);
            }
        }
        return null;
    }

    private final String zza(String str) {
        if (str != null && str.isEmpty()) {
            return this.zzg;
        }
        return str + this.zzg;
    }

    @Nullable
    private final T zzb(zzhu zzhuVar) throws Throwable {
        zzhb zzhbVarZza;
        Object objZza;
        if (this.zzf.zzb == null) {
            zzhbVarZza = zzhw.zza(zzhuVar.zza(), this.zzf.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
                @Override // java.lang.Runnable
                public final void run() {
                    zzhj.zzc();
                }
            });
        } else if (!zzhi.zza(zzhuVar.zza(), this.zzf.zzb)) {
            zzhbVarZza = null;
        } else if (this.zzf.zzg) {
            Context contextZza = zzhuVar.zza();
            short sXd = (short) (ZN.Xd() ^ 7902);
            short sXd2 = (short) (ZN.Xd() ^ 6188);
            int[] iArr = new int["&4+:83/y0==D6@G\u0002\u0018EEL>RO".length()];
            QB qb = new QB("&4+:83/y0==D6@G\u0002\u0018EEL>RO");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("e*=U\u0001j2(v\u0004D\u001d3qqg\u0018\f", (short) (FB.Xd() ^ 14461), (short) (FB.Xd() ^ 22908)), new Class[0]);
            try {
                method.setAccessible(true);
                zzhbVarZza = zzgu.zza((ContentResolver) method.invoke(contextZza, objArr), zzhk.zza(zzhk.zza(zzhuVar.zza(), this.zzf.zzb.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzhj.zzc();
                    }
                });
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            Context contextZza2 = zzhuVar.zza();
            short sXd3 = (short) (C1633zX.Xd() ^ (-30810));
            short sXd4 = (short) (C1633zX.Xd() ^ (-391));
            int[] iArr2 = new int["\b=h\u0014\u001eB?eojN/O\u001a\u0018`#GdUL\\\u0012".length()];
            QB qb2 = new QB("\b=h\u0014\u001eB?eojN/O\u001a\u0018`#GdUL\\\u0012");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                i3++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1626yg.Ud("4\u0014\u007f<\u0016.\u0013e\u0005ly\u0019B/&D>C", (short) (ZN.Xd() ^ 30908), (short) (ZN.Xd() ^ 29867)), new Class[0]);
            try {
                method2.setAccessible(true);
                zzhbVarZza = zzgu.zza((ContentResolver) method2.invoke(contextZza2, objArr2), this.zzf.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzhj.zzc();
                    }
                });
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (zzhbVarZza == null || (objZza = zzhbVarZza.zza(zzb())) == null) {
            return null;
        }
        return zza(objZza);
    }

    public static void zzb(final Context context) {
        if (zzb != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            if (zzb == null && context != null) {
                synchronized (obj) {
                    zzhu zzhuVar = zzb;
                    Class<?> cls = Class.forName(Ig.wd("H')]IeJ\u000b`#\"Hif~@,@\u00062cAa", (short) (ZN.Xd() ^ 19697)));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr = new Object[0];
                    short sXd = (short) (OY.Xd() ^ 31442);
                    int[] iArr = new int["'u\u0015\u0004t\u0019\u0003j\u001b7N_QF/5\u0002i2Q\u0005".length()];
                    QB qb = new QB("'u\u0015\u0004t\u0019\u0003j\u001b7N_QF/5\u0002i2Q\u0005");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                        i2++;
                    }
                    Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        method.setAccessible(true);
                        Context context2 = (Context) method.invoke(context, objArr);
                        if (context2 != null) {
                            context = context2;
                        }
                        if (zzhuVar == null || zzhuVar.zza() != context) {
                            if (zzhuVar != null) {
                                zzgu.zzc();
                                zzhw.zza();
                                zzhc.zza();
                            }
                            zzb = new zzgv(context, Suppliers.memoize(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzhl
                                @Override // com.google.common.base.Supplier
                                public final Object get() {
                                    return zzhg.zza.zza(context);
                                }
                            }));
                            zze.incrementAndGet();
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        }
    }

    public static void zzc() {
        zze.incrementAndGet();
    }

    static /* synthetic */ boolean zzd() {
        return true;
    }

    private final T zze() {
        return (T) this.zzh;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0083 A[Catch: all -> 0x009a, TryCatch #0 {, blocks: (B:57:0x001c, B:59:0x0020, B:61:0x0029, B:63:0x0039, B:67:0x0056, B:69:0x0061, B:71:0x0067, B:87:0x0090, B:86:0x008b, B:88:0x0094, B:74:0x006e, B:83:0x0083, B:77:0x0075, B:80:0x007c, B:89:0x0098), top: B:96:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T zza() {
        /*
            r8 = this;
            boolean r0 = r8.zzk
            if (r0 != 0) goto L11
            com.google.android.gms.internal.measurement.zzhy r1 = com.google.android.gms.internal.measurement.zzhj.zzd
            java.lang.String r0 = r8.zzg
            boolean r1 = r1.zza(r0)
            java.lang.String r0 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            com.google.common.base.Preconditions.checkState(r1, r0)
        L11:
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.zzhj.zze
            int r5 = r0.get()
            int r0 = r8.zzi
            if (r0 >= r5) goto L9d
            monitor-enter(r8)
            int r0 = r8.zzi     // Catch: java.lang.Throwable -> L9a
            if (r0 >= r5) goto L98
            com.google.android.gms.internal.measurement.zzhu r6 = com.google.android.gms.internal.measurement.zzhj.zzb     // Catch: java.lang.Throwable -> L9a
            com.google.common.base.Optional r4 = com.google.common.base.Optional.absent()     // Catch: java.lang.Throwable -> L9a
            r2 = 0
            if (r6 == 0) goto L51
            com.google.common.base.Supplier r0 = r6.zzb()     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> L9a
            com.google.common.base.Optional r4 = (com.google.common.base.Optional) r4     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r4.isPresent()     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L51
            java.lang.Object r7 = r4.get()     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.measurement.zzhh r7 = (com.google.android.gms.internal.measurement.zzhh) r7     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.measurement.zzhr r0 = r8.zzf     // Catch: java.lang.Throwable -> L9a
            android.net.Uri r3 = r0.zzb     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.measurement.zzhr r0 = r8.zzf     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = r0.zza     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.measurement.zzhr r0 = r8.zzf     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = r0.zzd     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = r8.zzg     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = r7.zza(r3, r2, r1, r0)     // Catch: java.lang.Throwable -> L9a
        L51:
            if (r6 == 0) goto L55
            r1 = 1
            goto L56
        L55:
            r1 = 0
        L56:
            java.lang.String r0 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            com.google.common.base.Preconditions.checkState(r1, r0)     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.internal.measurement.zzhr r0 = r8.zzf     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r0.zzf     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L75
            java.lang.Object r1 = r8.zza(r6)     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L6e
        L67:
            boolean r0 = r4.isPresent()     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L94
            goto L88
        L6e:
            java.lang.Object r1 = r8.zzb(r6)     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L83
            goto L67
        L75:
            java.lang.Object r1 = r8.zzb(r6)     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L7c
            goto L67
        L7c:
            java.lang.Object r1 = r8.zza(r6)     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L83
            goto L67
        L83:
            java.lang.Object r1 = r8.zze()     // Catch: java.lang.Throwable -> L9a
            goto L67
        L88:
            if (r2 != 0) goto L8b
            goto L90
        L8b:
            java.lang.Object r1 = r8.zza(r2)     // Catch: java.lang.Throwable -> L9a
            goto L94
        L90:
            java.lang.Object r1 = r8.zze()     // Catch: java.lang.Throwable -> L9a
        L94:
            r8.zzj = r1     // Catch: java.lang.Throwable -> L9a
            r8.zzi = r5     // Catch: java.lang.Throwable -> L9a
        L98:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9a
            goto L9d
        L9a:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9a
            throw r0
        L9d:
            T r0 = r8.zzj
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhj.zza():java.lang.Object");
    }

    abstract T zza(Object obj);

    public final String zzb() {
        return zza(this.zzf.zzd);
    }
}
