package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zzag extends zzja {
    private Boolean zza;
    private String zzb;
    private zzai zzc;
    private Boolean zzd;

    zzag(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzc = new zzai() { // from class: com.google.android.gms.measurement.internal.zzaf
            @Override // com.google.android.gms.measurement.internal.zzai
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    private final String zza(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e2) {
            zzj().zzg().zza("Could not find SystemProperties class", e2);
            return str2;
        } catch (IllegalAccessException e3) {
            zzj().zzg().zza("Could not access SystemProperties.get()", e3);
            return str2;
        } catch (NoSuchMethodException e4) {
            zzj().zzg().zza("Could not find SystemProperties.get() method", e4);
            return str2;
        } catch (InvocationTargetException e5) {
            zzj().zzg().zza("SystemProperties.get() threw an exception", e5);
            return str2;
        }
    }

    private final Bundle zzaa() throws Throwable {
        try {
            Context contextZza = zza();
            Class<?> cls = Class.forName(C1593ug.zd(">LCRPKG\u0012HUU\\NX_\u001a0]]dVjg", (short) (C1607wl.Xd() ^ 10829), (short) (C1607wl.Xd() ^ 17269)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (FB.Xd() ^ 9858);
            int[] iArr = new int["\\YgBRSZOTQ8KWINKW".length()];
            QB qb = new QB("\\YgBRSZOTQ8KWINKW");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                if (((PackageManager) method.invoke(contextZza, objArr)) == null) {
                    zzj().zzg().zza(C1561oA.Kd("$@IMGG\u0004YU\u0007TXKO\fZScQUSgU/\u0016GY\\e\\cbK`nbihv%oz(w\u007fwx", (short) (ZN.Xd() ^ 32413)));
                    return null;
                }
                PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(zza());
                Context contextZza2 = zza();
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Wg.Zd("\nP\u0018R\u0001\u001ecn?\u000e@\u007f\u001fS+\tG5p8=\nW", (short) (C1607wl.Xd() ^ 30289), (short) (C1607wl.Xd() ^ 6382))).getMethod(C1561oA.Xd("87G$69B9@?)=JC", (short) (OY.Xd() ^ 30979)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    ApplicationInfo applicationInfo = packageManagerWrapperPackageManager.getApplicationInfo((String) method2.invoke(contextZza2, objArr2), 128);
                    if (applicationInfo != null) {
                        return applicationInfo.metaData;
                    }
                    zzj().zzg().zza(Wg.vd("Lfmoom({}-xzsu0|{\nuw{\u000eyQ>^\r\f\u000f\u000b\u0004\u0001\u001b\u000f\u0014\u0012s\u0018\u000f\u0017N\u0017 K!'\u001d\u001c", (short) (Od.Xd() ^ (-29975))));
                    return null;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException e4) {
            zzj().zzg().zza(Qg.kd("8RY[SQ\f_Y\tTVGI\u0004PGUAC?Q=\u0015y)9:A6;8q?1<3l::>h.6;3(", (short) (C1607wl.Xd() ^ 30911), (short) (C1607wl.Xd() ^ 16143)), e4);
            return null;
        }
    }

    public static long zzg() {
        return zzbh.zzd.zza(null).longValue();
    }

    public static long zzh() {
        return zzbh.zzk.zza(null).intValue();
    }

    public static long zzm() {
        return zzbh.zzae.zza(null).longValue();
    }

    public static long zzn() {
        return zzbh.zzz.zza(null).longValue();
    }

    public final double zza(String str, zzfz<Double> zzfzVar) {
        if (TextUtils.isEmpty(str)) {
            return zzfzVar.zza(null).doubleValue();
        }
        String strZza = this.zzc.zza(str, zzfzVar.zza());
        if (TextUtils.isEmpty(strZza)) {
            return zzfzVar.zza(null).doubleValue();
        }
        try {
            return zzfzVar.zza(Double.valueOf(Double.parseDouble(strZza))).doubleValue();
        } catch (NumberFormatException unused) {
            return zzfzVar.zza(null).doubleValue();
        }
    }

    final int zza(String str) {
        return zza(str, zzbh.zzaj, 500, 2000);
    }

    public final int zza(String str, zzfz<Integer> zzfzVar, int i2, int i3) {
        return Math.max(Math.min(zzb(str, zzfzVar), i3), i2);
    }

    final int zza(String str, boolean z2) {
        if (z2) {
            return zza(str, zzbh.zzat, 100, 500);
        }
        return 500;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    final void zza(zzai zzaiVar) {
        this.zzc = zzaiVar;
    }

    public final boolean zza(zzfz<Boolean> zzfzVar) {
        return zzf(null, zzfzVar);
    }

    public final int zzb(String str) {
        return zza(str, zzbh.zzak, 25, 100);
    }

    public final int zzb(String str, zzfz<Integer> zzfzVar) {
        if (TextUtils.isEmpty(str)) {
            return zzfzVar.zza(null).intValue();
        }
        String strZza = this.zzc.zza(str, zzfzVar.zza());
        if (TextUtils.isEmpty(strZza)) {
            return zzfzVar.zza(null).intValue();
        }
        try {
            return zzfzVar.zza(Integer.valueOf(Integer.parseInt(strZza))).intValue();
        } catch (NumberFormatException unused) {
            return zzfzVar.zza(null).intValue();
        }
    }

    final int zzb(String str, boolean z2) {
        return Math.max(zza(str, z2), 256);
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final int zzc() {
        return zzq().zza(201500000, true) ? 100 : 25;
    }

    public final int zzc(String str) {
        return zzb(str, zzbh.zzo);
    }

    public final long zzc(String str, zzfz<Long> zzfzVar) {
        if (TextUtils.isEmpty(str)) {
            return zzfzVar.zza(null).longValue();
        }
        String strZza = this.zzc.zza(str, zzfzVar.zza());
        if (TextUtils.isEmpty(strZza)) {
            return zzfzVar.zza(null).longValue();
        }
        try {
            return zzfzVar.zza(Long.valueOf(Long.parseLong(strZza))).longValue();
        } catch (NumberFormatException unused) {
            return zzfzVar.zza(null).longValue();
        }
    }

    public final zzjh zzc(String str, boolean z2) {
        Object obj;
        Preconditions.checkNotEmpty(str);
        Bundle bundleZzaa = zzaa();
        if (bundleZzaa == null) {
            zzj().zzg().zza("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleZzaa.get(str);
        }
        if (obj == null) {
            return zzjh.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzjh.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzjh.DENIED;
        }
        if (z2 && "eu_consent_policy".equals(obj)) {
            return zzjh.POLICY;
        }
        zzj().zzu().zza("Invalid manifest metadata for", str);
        return zzjh.UNINITIALIZED;
    }

    final long zzd(String str) {
        return zzc(str, zzbh.zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    public final String zzd(String str, zzfz<String> zzfzVar) {
        return TextUtils.isEmpty(str) ? zzfzVar.zza(null) : zzfzVar.zza(this.zzc.zza(str, zzfzVar.zza()));
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    final Boolean zze(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleZzaa = zzaa();
        if (bundleZzaa == null) {
            zzj().zzg().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleZzaa.containsKey(str)) {
            return Boolean.valueOf(bundleZzaa.getBoolean(str));
        }
        return null;
    }

    public final boolean zze(String str, zzfz<Boolean> zzfzVar) {
        return zzf(str, zzfzVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    final String zzf(String str) {
        return zzd(str, zzbh.zzan);
    }

    public final boolean zzf(String str, zzfz<Boolean> zzfzVar) {
        if (TextUtils.isEmpty(str)) {
            return zzfzVar.zza(null).booleanValue();
        }
        String strZza = this.zzc.zza(str, zzfzVar.zza());
        return TextUtils.isEmpty(strZza) ? zzfzVar.zza(null).booleanValue() : zzfzVar.zza(Boolean.valueOf("1".equals(strZza))).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List<java.lang.String> zzg(java.lang.String r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzag.zzg(java.lang.String):java.util.List");
    }

    public final void zzh(String str) {
        this.zzb = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    final boolean zzi(String str) {
        return zzf(str, zzbh.zzam);
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    public final boolean zzj(String str) {
        return "1".equals(this.zzc.zza(str, "gaia_collection_enabled"));
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    public final boolean zzk(String str) {
        return "1".equals(this.zzc.zza(str, "measurement.event_sampling_enabled"));
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    public final String zzo() {
        return zza("debug.firebase.analytics.app", "");
    }

    public final String zzp() {
        return zza("debug.deferred.deeplink", "");
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

    public final String zzu() {
        return this.zzb;
    }

    public final boolean zzv() {
        Boolean boolZze = zze("google_analytics_adid_collection_enabled");
        return boolZze == null || boolZze.booleanValue();
    }

    public final boolean zzw() {
        Boolean boolZze = zze("google_analytics_automatic_screen_reporting_enabled");
        return boolZze == null || boolZze.booleanValue();
    }

    public final boolean zzx() {
        Boolean boolZze = zze("firebase_analytics_collection_deactivated");
        return boolZze != null && boolZze.booleanValue();
    }

    final boolean zzy() {
        if (this.zza == null) {
            Boolean boolZze = zze("app_measurement_lite");
            this.zza = boolZze;
            if (boolZze == null) {
                this.zza = false;
            }
        }
        return this.zza.booleanValue() || !this.zzu.zzag();
    }

    @InterfaceC1492Gx
    @EnsuresNonNull({"\u007f.a\u0003\\sY\u0003d\u001c'f6=U5z\u0001"})
    public final boolean zzz() {
        Object obj;
        if (this.zzd == null) {
            synchronized (this) {
                if (this.zzd == null) {
                    Context contextZza = zza();
                    short sXd = (short) (ZN.Xd() ^ 22509);
                    short sXd2 = (short) (ZN.Xd() ^ 2043);
                    int[] iArr = new int["TbYhfa](^kkrdnu0Fsszl\u0001}".length()];
                    QB qb = new QB("TbYhfa](^kkrdnu0Fsszl\u0001}");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                        i2++;
                    }
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("hzK\u000fF\u0014RCC@7B/q\u001fJ:\u0012", (short) (Od.Xd() ^ (-257)), (short) (Od.Xd() ^ (-19070))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(contextZza, objArr);
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String strXd = ZO.xd("$`B\u001a\u000eS$Wm4OI\u0003w Pf]\u001d@Ih;D\u001b`:i\u001e\u0012^]+\u007f", (short) (Od.Xd() ^ (-13353)), (short) (Od.Xd() ^ (-27486)));
                            String strUd = C1626yg.Ud("3Yvq\u0017\u007f\u0010\u001e!JV", (short) (FB.Xd() ^ 7104), (short) (FB.Xd() ^ 2939));
                            try {
                                Class<?> cls = Class.forName(strXd);
                                Field field = 1 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                                field.setAccessible(true);
                                obj = field.get(applicationInfo);
                            } catch (Throwable th) {
                                obj = null;
                            }
                            String str = (String) obj;
                            this.zzd = Boolean.valueOf(str != null && str.equals(myProcessName));
                        }
                        if (this.zzd == null) {
                            this.zzd = Boolean.TRUE;
                            zzj().zzg().zza(Ig.wd("\u001c\u000f\u0013D]\u0015%_\u001a\u0007\u001dE\u0017*5Y9Hu\u0012KJpqX\u001dfi\u0007M<X\u0002\u001f;\n\u0018t 01L\b\fyWp", (short) (OY.Xd() ^ 23374)));
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        }
        return this.zzd.booleanValue();
    }
}
