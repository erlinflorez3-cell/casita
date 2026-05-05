package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgo extends zzjd {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzgq zzd;
    private final zzgq zze;
    private final zzgq zzf;
    private final zzgq zzg;
    private final zzgq zzh;
    private final zzgq zzi;
    private final zzgq zzj;
    private final zzgq zzk;
    private final zzgq zzl;

    zzgo(zzhy zzhyVar) {
        super(zzhyVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzgq(this, 6, false, false);
        this.zze = new zzgq(this, 6, true, false);
        this.zzf = new zzgq(this, 6, false, true);
        this.zzg = new zzgq(this, 5, false, false);
        this.zzh = new zzgq(this, 5, true, false);
        this.zzi = new zzgq(this, 5, false, true);
        this.zzj = new zzgq(this, 4, false, false);
        this.zzk = new zzgq(this, 3, false, false);
        this.zzl = new zzgq(this, 2, false, false);
    }

    protected static Object zza(String str) {
        if (str == null) {
            return null;
        }
        return new zzgp(str);
    }

    private static String zza(boolean z2, Object obj) throws Throwable {
        Object objValueOf = obj;
        if (objValueOf == null) {
            return "";
        }
        if (objValueOf instanceof Integer) {
            objValueOf = Long.valueOf(((Integer) objValueOf).intValue());
        }
        boolean z3 = objValueOf instanceof Long;
        String strOd = C1561oA.od("v", (short) (OY.Xd() ^ 12623));
        int i2 = 0;
        if (z3) {
            if (!z2) {
                return String.valueOf(objValueOf);
            }
            Long l2 = (Long) objValueOf;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(objValueOf);
            }
            String str = String.valueOf(objValueOf).charAt(0) == '-' ? strOd : "";
            String strValueOf = String.valueOf(Math.abs(l2.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + C1561oA.Kd("}~\u007f", (short) (FB.Xd() ^ 15475)) + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (objValueOf instanceof Boolean) {
            return String.valueOf(objValueOf);
        }
        if (!(objValueOf instanceof Throwable)) {
            return objValueOf instanceof zzgp ? ((zzgp) objValueOf).zza : z2 ? strOd : String.valueOf(objValueOf);
        }
        Throwable th = (Throwable) objValueOf;
        StringBuilder sb = new StringBuilder(z2 ? th.getClass().getName() : th.toString());
        String strZzb = zzb(zzhy.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            short sXd = (short) (Od.Xd() ^ (-21467));
            short sXd2 = (short) (Od.Xd() ^ (-15689));
            int[] iArr = new int["\tp\u0015\rh8:V^4h\u0019\u0013&;\u0013`\\o\u0001m$\u000e#Jbw".length()];
            QB qb = new QB("\tp\u0015\rh8:V^4h\u0019\u0013&;\u0013`\\o\u0001m$\u000e#Jbw");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i3));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd3 = (short) (OY.Xd() ^ IDStepResponseCodes.STEP_RESULT_DOCUMENT_MAX_LOCAL_ATTEMPS);
            int[] iArr2 = new int["!,\b\u001c0&4$\r&6+3)".length()];
            QB qb2 = new QB("!,\b\u001c0&4$\r&6+3)");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i4));
                i4++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                if (!((Boolean) method.invoke(stackTraceElement, objArr)).booleanValue()) {
                    Class<?> cls2 = Class.forName(Wg.vd("A9K7\u0001@2@6} B,/4\u001e9)(+\b0&/$.1", (short) (C1607wl.Xd() ^ 6139)));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr2 = new Object[0];
                    short sXd4 = (short) (C1580rY.Xd() ^ (-18201));
                    short sXd5 = (short) (C1580rY.Xd() ^ (-18141));
                    int[] iArr3 = new int["# .{$\u0018)(\u0002\u0014\u001f\u0016".length()];
                    QB qb3 = new QB("# .{$\u0018)(\u0002\u0014\u001f\u0016");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK(((sXd4 + i5) + xuXd3.CK(iKK3)) - sXd5);
                        i5++;
                    }
                    Method method2 = cls2.getMethod(new String(iArr3, 0, i5), clsArr2);
                    try {
                        method2.setAccessible(true);
                        String str2 = (String) method2.invoke(stackTraceElement, objArr2);
                        if (str2 != null && zzb(str2).equals(strZzb)) {
                            short sXd6 = (short) (FB.Xd() ^ 27387);
                            short sXd7 = (short) (FB.Xd() ^ 8781);
                            int[] iArr4 = new int["L1".length()];
                            QB qb4 = new QB("L1");
                            int i6 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i6] = xuXd4.fK(sXd6 + i6 + xuXd4.CK(iKK4) + sXd7);
                                i6++;
                            }
                            sb.append(new String(iArr4, 0, i6));
                            sb.append(stackTraceElement);
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                i2++;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return sb.toString();
    }

    static String zza(boolean z2, String str, Object obj, Object obj2, Object obj3) throws Throwable {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strZza = zza(z2, obj);
        String strZza2 = zza(z2, obj2);
        String strZza3 = zza(z2, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strZza)) {
            sb.append(str2);
            sb.append(strZza);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strZza2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strZza2);
        }
        if (!TextUtils.isEmpty(strZza3)) {
            sb.append(str3);
            sb.append(strZza3);
        }
        return sb.toString();
    }

    private static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? (com.google.android.gms.internal.measurement.zzok.zza() && zzbh.zzcg.zza(null).booleanValue()) ? "" : str : str.substring(0, iLastIndexOf);
    }

    @InterfaceC1492Gx
    @EnsuresNonNull({"w5_c\u0010q*%Q\"-k7369yr(a\u0017O"})
    private final String zzy() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                this.zzc = this.zzu.zzw() != null ? this.zzu.zzw() : "FA";
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    protected final void zza(int i2, String str) {
        zzy();
    }

    protected final void zza(int i2, boolean z2, boolean z3, String str, Object obj, Object obj2, Object obj3) {
        int i3 = i2;
        if (!z2 && zza(i3)) {
            zza(i3, zza(false, str, obj, obj2, obj3));
        }
        if (z3 || i3 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzhv zzhvVarZzo = this.zzu.zzo();
        if (zzhvVarZzo == null) {
            zza(6, "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!zzhvVarZzo.zzaf()) {
            zza(6, "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 >= 9) {
            i3 = 8;
        }
        zzhvVarZzo.zzb(new zzgn(this, i3, str, obj, obj2, obj3));
    }

    protected final boolean zza(int i2) {
        return Log.isLoggable(zzy(), i2);
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final zzgq zzc() {
        return this.zzk;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    public final zzgq zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.measurement.internal.zzjd
    protected final boolean zzh() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    public final zzgq zzm() {
        return this.zzf;
    }

    public final zzgq zzn() {
        return this.zze;
    }

    public final zzgq zzo() {
        return this.zzj;
    }

    public final zzgq zzp() {
        return this.zzl;
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final zzgq zzu() {
        return this.zzg;
    }

    public final zzgq zzv() {
        return this.zzi;
    }

    public final zzgq zzw() {
        return this.zzh;
    }

    public final String zzx() {
        Pair<String, Long> pairZza;
        if (zzk().zzb == null || (pairZza = zzk().zzb.zza()) == null || pairZza == zzha.zza) {
            return null;
        }
        return String.valueOf(pairZza.second) + Global.COLON + ((String) pairZza.first);
    }
}
