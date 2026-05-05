package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.measurement.internal.zzje;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class zzhy implements zzjc {
    private static volatile zzhy zzb = null;
    final long zza;
    private Boolean zzaa;
    private long zzab;
    private volatile Boolean zzac;
    private Boolean zzad;
    private Boolean zzae;
    private volatile boolean zzaf;
    private int zzag;
    private int zzah;
    private final Context zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final zzab zzh;
    private final zzag zzi;
    private final zzha zzj;
    private final zzgo zzk;
    private final zzhv zzl;
    private final zznb zzm;
    private final zzos zzn;
    private final zzgh zzo;
    private final Clock zzp;
    private final zzlj zzq;
    private final zzjq zzr;
    private final zzb zzs;
    private final zzle zzt;
    private final String zzu;
    private zzgf zzv;
    private zzls zzw;
    private zzaz zzx;
    private zzgg zzy;
    private boolean zzz = false;
    private AtomicInteger zzai = new AtomicInteger(0);

    private zzhy(zzjo zzjoVar) throws Throwable {
        boolean z2 = false;
        Preconditions.checkNotNull(zzjoVar);
        zzab zzabVar = new zzab(zzjoVar.zza);
        this.zzh = zzabVar;
        zzga.zza = zzabVar;
        Context context = zzjoVar.zza;
        this.zzc = context;
        this.zzd = zzjoVar.zzb;
        this.zze = zzjoVar.zzc;
        this.zzf = zzjoVar.zzd;
        this.zzg = zzjoVar.zzh;
        this.zzac = zzjoVar.zze;
        this.zzu = zzjoVar.zzj;
        this.zzaf = true;
        com.google.android.gms.internal.measurement.zzdw zzdwVar = zzjoVar.zzg;
        if (zzdwVar != null && zzdwVar.zzg != null) {
            Bundle bundle = zzdwVar.zzg;
            short sXd = (short) (C1580rY.Xd() ^ (-819));
            short sXd2 = (short) (C1580rY.Xd() ^ (-15280));
            int[] iArr = new int["$\u001b\u0016'($\u0016\u001d\u0014\u001c!p\u0019\u000b\u000b\u0014\f\n".length()];
            QB qb = new QB("$\u001b\u0016'($\u0016\u001d\u0014\u001c!p\u0019\u000b\u000b\u0014\f\n");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Object obj = bundle.get(new String(iArr, 0, i2));
            if (obj instanceof Boolean) {
                this.zzad = (Boolean) obj;
            }
            Object obj2 = zzdwVar.zzg.get(hg.Vd("riduvrdkbjo>^YZj^jTfVT", (short) (FB.Xd() ^ 17335), (short) (FB.Xd() ^ 25781)));
            if (obj2 instanceof Boolean) {
                this.zzae = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzhj.zzb(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzp = defaultClock;
        this.zza = zzjoVar.zzi != null ? zzjoVar.zzi.longValue() : defaultClock.currentTimeMillis();
        this.zzi = new zzag(this);
        zzha zzhaVar = new zzha(this);
        zzhaVar.zzad();
        this.zzj = zzhaVar;
        zzgo zzgoVar = new zzgo(this);
        zzgoVar.zzad();
        this.zzk = zzgoVar;
        zzos zzosVar = new zzos(this);
        zzosVar.zzad();
        this.zzn = zzosVar;
        this.zzo = new zzgh(new zzjn(zzjoVar, this));
        this.zzs = new zzb(this);
        zzlj zzljVar = new zzlj(this);
        zzljVar.zzv();
        this.zzq = zzljVar;
        zzjq zzjqVar = new zzjq(this);
        zzjqVar.zzv();
        this.zzr = zzjqVar;
        zznb zznbVar = new zznb(this);
        zznbVar.zzv();
        this.zzm = zznbVar;
        zzle zzleVar = new zzle(this);
        zzleVar.zzad();
        this.zzt = zzleVar;
        zzhv zzhvVar = new zzhv(this);
        zzhvVar.zzad();
        this.zzl = zzhvVar;
        if (zzjoVar.zzg != null && zzjoVar.zzg.zzb != 0) {
            z2 = true;
        }
        boolean z3 = !z2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("<H=JF?9\u00026A?D4<Ay\u000e97<,>9", (short) (OY.Xd() ^ 11190))).getMethod(C1561oA.yd("\u0019\u0016$o\u001e\u001d\u0018\u0014\u001d\u001a, %#v\"\u0010\u0015\u0005\u0017\u0012", (short) (C1633zX.Xd() ^ (-6148))), new Class[0]);
        try {
            method.setAccessible(true);
            if (((Context) method.invoke(context, objArr)) instanceof Application) {
                zzp().zzb(z3);
            } else {
                zzj().zzu().zza(C1561oA.Yd("9ijge`_sipp#gtt{m\u0002~+u\u0001.}\u007f\u00062t\u00035W\b\t\u0006\u0004~}\u0012\b\u000f\u000f", (short) (FB.Xd() ^ 1613)));
            }
            zzhvVar.zzb(new zzid(this, zzjoVar));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static zzhy zza(Context context, com.google.android.gms.internal.measurement.zzdw zzdwVar, Long l2) throws Throwable {
        if (zzdwVar != null && (zzdwVar.zze == null || zzdwVar.zzf == null)) {
            zzdwVar = new com.google.android.gms.internal.measurement.zzdw(zzdwVar.zza, zzdwVar.zzb, zzdwVar.zzc, zzdwVar.zzd, null, null, zzdwVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        short sXd = (short) (C1499aX.Xd() ^ (-21002));
        short sXd2 = (short) (C1499aX.Xd() ^ (-3489));
        int[] iArr = new int["\\japnie0fsszlv}8N{{\u0003t\t\u0006".length()];
        QB qb = new QB("\\japnie0fsszlv}8N{{\u0003t\t\u0006");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("\"eC9\u001f\rS\u0016J\u0016\u0010Nr7Vp\n6tr$", (short) (C1633zX.Xd() ^ (-27933)), (short) (C1633zX.Xd() ^ (-14167))), new Class[0]);
        try {
            method.setAccessible(true);
            Preconditions.checkNotNull((Context) method.invoke(context, objArr));
            if (zzb == null) {
                synchronized (zzhy.class) {
                    if (zzb == null) {
                        zzb = new zzhy(new zzjo(context, zzdwVar, l2));
                    }
                }
            } else if (zzdwVar != null && zzdwVar.zzg != null && zzdwVar.zzg.containsKey(ZO.xd("\u001eCpsx\u0003'Cp\u0005Bs\u001dI'~\\t\u001cE\n{Xv*lP\u000e", (short) (C1499aX.Xd() ^ (-20086)), (short) (C1499aX.Xd() ^ (-27084))))) {
                Preconditions.checkNotNull(zzb);
                zzb.zza(zzdwVar.zzg.getBoolean(C1626yg.Ud("&{c1#l%AM\u0003\u0001\u001ave\u0002c\u0005\u0002\u0016N\\J5\tm5&r", (short) (ZN.Xd() ^ 4661), (short) (ZN.Xd() ^ 10682))));
            }
            Preconditions.checkNotNull(zzb);
            return zzb;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void zza(zzh zzhVar) {
        if (zzhVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzhVar.zzy()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(zzhVar.getClass()));
    }

    static /* synthetic */ void zza(zzhy zzhyVar, zzjo zzjoVar) {
        zzhyVar.zzl().zzt();
        zzaz zzazVar = new zzaz(zzhyVar);
        zzazVar.zzad();
        zzhyVar.zzx = zzazVar;
        zzgg zzggVar = new zzgg(zzhyVar, zzjoVar.zzf);
        zzggVar.zzv();
        zzhyVar.zzy = zzggVar;
        zzgf zzgfVar = new zzgf(zzhyVar);
        zzgfVar.zzv();
        zzhyVar.zzv = zzgfVar;
        zzls zzlsVar = new zzls(zzhyVar);
        zzlsVar.zzv();
        zzhyVar.zzw = zzlsVar;
        zzhyVar.zzn.zzae();
        zzhyVar.zzj.zzae();
        zzhyVar.zzy.zzw();
        zzhyVar.zzj().zzo().zza("App measurement initialized, version", 106000L);
        zzhyVar.zzj().zzo().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strZzad = zzggVar.zzad();
        if (TextUtils.isEmpty(zzhyVar.zzd)) {
            if (zzhyVar.zzt().zzd(strZzad, zzhyVar.zzi.zzu())) {
                zzhyVar.zzj().zzo().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzhyVar.zzj().zzo().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + strZzad);
            }
        }
        zzhyVar.zzj().zzc().zza("Debug-level message logging enabled");
        if (zzhyVar.zzag != zzhyVar.zzai.get()) {
            zzhyVar.zzj().zzg().zza("Not all components initialized", Integer.valueOf(zzhyVar.zzag), Integer.valueOf(zzhyVar.zzai.get()));
        }
        zzhyVar.zzz = true;
    }

    private static void zza(zzja zzjaVar) {
        if (zzjaVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void zza(zzjd zzjdVar) {
        if (zzjdVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzjdVar.zzaf()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(zzjdVar.getClass()));
    }

    @Pure
    private final zzle zzai() {
        zza((zzjd) this.zzt);
        return this.zzt;
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final Context zza() {
        return this.zzc;
    }

    protected final void zza(com.google.android.gms.internal.measurement.zzdw zzdwVar) {
        zzje zzjeVarZza;
        Boolean boolZza;
        zzl().zzt();
        if (zzpn.zza() && this.zzi.zza(zzbh.zzci) && zzt().zzw()) {
            zzos zzosVarZzt = zzt();
            zzosVarZzt.zzt();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            ContextCompat.registerReceiver(zzosVarZzt.zza(), new zzp(zzosVarZzt.zzu), intentFilter, 2);
            zzosVarZzt.zzj().zzc().zza("Registered app receiver");
        }
        zzje zzjeVarZzo = zzn().zzo();
        int iZza = zzjeVarZzo.zza();
        zzjh zzjhVarZzc = this.zzi.zzc("google_analytics_default_allow_ad_storage", false);
        zzjh zzjhVarZzc2 = this.zzi.zzc("google_analytics_default_allow_analytics_storage", false);
        if (!(zzjhVarZzc == zzjh.UNINITIALIZED && zzjhVarZzc2 == zzjh.UNINITIALIZED) && zzn().zza(-10)) {
            zzjeVarZza = zzje.zza(zzjhVarZzc, zzjhVarZzc2, -10);
        } else {
            if (!TextUtils.isEmpty(zzh().zzae()) && (iZza == 0 || iZza == 30 || iZza == 10 || iZza == 30 || iZza == 30 || iZza == 40)) {
                zzp().zza(new zzje(null, null, -10), this.zza, false);
            } else if (TextUtils.isEmpty(zzh().zzae()) && zzdwVar != null && zzdwVar.zzg != null && zzn().zza(30)) {
                zzjeVarZza = zzje.zza(zzdwVar.zzg, 30);
                if (!zzjeVarZza.zzi()) {
                }
            }
            zzjeVarZza = null;
        }
        if (zzjeVarZza != null) {
            zzp().zza(zzjeVarZza, this.zza, true);
            zzjeVarZzo = zzjeVarZza;
        }
        zzp().zza(zzjeVarZzo);
        int iZza2 = zzn().zzn().zza();
        zzjh zzjhVarZzc3 = this.zzi.zzc("google_analytics_default_allow_ad_personalization_signals", true);
        if (zzjhVarZzc3 != zzjh.UNINITIALIZED) {
            zzj().zzp().zza("Default ad personalization consent from Manifest", zzjhVarZzc3);
        }
        zzjh zzjhVarZzc4 = this.zzi.zzc("google_analytics_default_allow_ad_user_data", true);
        if (zzjhVarZzc4 != zzjh.UNINITIALIZED && zzje.zza(-10, iZza2)) {
            zzp().zza(zzax.zza(zzjhVarZzc4, -10), true);
        } else if (TextUtils.isEmpty(zzh().zzae()) || !(iZza2 == 0 || iZza2 == 30)) {
            if (TextUtils.isEmpty(zzh().zzae()) && zzdwVar != null && zzdwVar.zzg != null && zzje.zza(30, iZza2)) {
                zzax zzaxVarZza = zzax.zza(zzdwVar.zzg, 30);
                if (zzaxVarZza.zzg()) {
                    zzp().zza(zzaxVarZza, true);
                }
            }
            if (TextUtils.isEmpty(zzh().zzae()) && zzdwVar != null && zzdwVar.zzg != null && zzn().zzh.zza() == null && (boolZza = zzax.zza(zzdwVar.zzg)) != null) {
                zzp().zza(zzdwVar.zze, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, (Object) boolZza.toString(), false);
            }
        } else {
            zzp().zza(new zzax(null, -10), true);
        }
        Boolean boolZze = this.zzi.zze("google_analytics_tcf_data_enabled");
        if (boolZze == null ? true : boolZze.booleanValue()) {
            zzj().zzc().zza("TCF client enabled.");
            zzp().zzat();
            zzp().zzar();
        }
        if (zzn().zzc.zza() == 0) {
            zzj().zzp().zza("Persisting first open", Long.valueOf(this.zza));
            zzn().zzc.zza(this.zza);
        }
        zzp().zza.zzb();
        if (zzaf()) {
            if (!TextUtils.isEmpty(zzh().zzae()) || !TextUtils.isEmpty(zzh().zzac())) {
                zzt();
                if (zzos.zza(zzh().zzae(), zzn().zzy(), zzh().zzac(), zzn().zzx())) {
                    zzj().zzo().zza("Rechecking which service to use due to a GMP App Id change");
                    zzn().zzz();
                    zzi().zzaa();
                    this.zzw.zzaf();
                    this.zzw.zzae();
                    zzn().zzc.zza(this.zza);
                    zzn().zze.zza(null);
                }
                zzn().zzc(zzh().zzae());
                zzn().zzb(zzh().zzac());
            }
            if (!zzn().zzo().zza(zzje.zza.ANALYTICS_STORAGE)) {
                zzn().zze.zza(null);
            }
            zzp().zzc(zzn().zze.zza());
            if (!zzt().zzx() && !TextUtils.isEmpty(zzn().zzq.zza())) {
                zzj().zzu().zza("Remote config removed with active feature rollouts");
                zzn().zzq.zza(null);
            }
            if (!TextUtils.isEmpty(zzh().zzae()) || !TextUtils.isEmpty(zzh().zzac())) {
                boolean zZzac = zzac();
                if (!zzn().zzab() && !this.zzi.zzx()) {
                    zzn().zzb(!zZzac);
                }
                if (zZzac) {
                    zzp().zzan();
                }
                zzs().zza.zza();
                zzr().zza(new AtomicReference<>());
                zzr().zza(zzn().zzt.zza());
            }
        } else if (zzac()) {
            if (!zzt().zze("android.permission.INTERNET")) {
                zzj().zzg().zza("App is missing INTERNET permission");
            }
            if (!zzt().zze("android.permission.ACCESS_NETWORK_STATE")) {
                zzj().zzg().zza("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.packageManager(this.zzc).isCallerInstantApp() && !this.zzi.zzy()) {
                if (!zzos.zza(this.zzc)) {
                    zzj().zzg().zza("AppMeasurementReceiver not registered/enabled");
                }
                if (!zzos.zza(this.zzc, false)) {
                    zzj().zzg().zza("AppMeasurementService not registered/enabled");
                }
            }
            zzj().zzg().zza("Uploading is not possible. App measurement disabled");
        }
        if (zzpn.zza() && this.zzi.zza(zzbh.zzci) && zzt().zzw()) {
            final zzjq zzjqVarZzp = zzp();
            Objects.requireNonNull(zzjqVarZzp);
            new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzib
                @Override // java.lang.Runnable
                public final void run() {
                    zzjqVarZzp.zzap();
                }
            }).start();
        }
        zzn().zzj.zza(true);
    }

    final /* synthetic */ void zza(String str, int i2, Throwable th, byte[] bArr, Map map) throws Throwable {
        String strWd = Ig.wd("\u00050c{\u000ff>\u0011Kn", (short) (ZN.Xd() ^ 6820));
        String strOd = EO.Od("\u000eX:\u0006}5", (short) (Od.Xd() ^ (-10948)));
        short sXd = (short) (C1580rY.Xd() ^ (-21890));
        int[] iArr = new int["}x\u0001|v".length()];
        QB qb = new QB("}x\u0001|v");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        String str2 = new String(iArr, 0, i3);
        if ((i2 != 200 && i2 != 204 && i2 != 304) || th != null) {
            zzj().zzu().zza(Ig.wd("\u001aZ\u001c>f\r*\u000eux\u0003l\n\u001a\u0017(\u0016-gM7\u0014~\u0006T pKTfkQ0E'\nh4gB7]\t\u001eaA\u001aHGs7hA%g4(\u000eq`d\u0018bG$)", (short) (OY.Xd() ^ 16179)), Integer.valueOf(i2), th);
            return;
        }
        zzn().zzo.zza(true);
        if (bArr == null || bArr.length == 0) {
            zzgq zzgqVarZzc = zzj().zzc();
            short sXd2 = (short) (ZN.Xd() ^ 7300);
            short sXd3 = (short) (ZN.Xd() ^ 16058);
            int[] iArr2 = new int["Qn<\u001cTB\u0006\u0016X4\r\\\fwLC.i\u00128<7D\u0005\u001c?\u001eQ\u000bLZz`U".length()];
            QB qb2 = new QB("Qn<\u001cTB\u0006\u0016X4\r\\\fwLC.i\u00128<7D\u0005\u001c?\u001eQ\u000bLZz`U");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + (i4 * sXd3))) + xuXd2.CK(iKK2));
                i4++;
            }
            zzgqVarZzc.zza(new String(iArr2, 0, i4));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString(C1593ug.zd("TVWc`^db", (short) (C1633zX.Xd() ^ (-29425)), (short) (C1633zX.Xd() ^ (-3732))), "");
            if (TextUtils.isEmpty(strOptString)) {
                zzj().zzc().zza(C1561oA.od("y\u001a\u001a\u0018$#\u0015\u0013Mp\u0011\u0010\u001aHs\u0010\u0014\u0010C\f\u0015@\u0005\f\u000e\u0011\u0015H", (short) (Od.Xd() ^ (-4232))));
                return;
            }
            String strOptString2 = jSONObject.optString(str2, "");
            String strOptString3 = jSONObject.optString(strOd, "");
            String strOptString4 = jSONObject.optString(strWd, "");
            short sXd4 = (short) (Od.Xd() ^ (-31717));
            int[] iArr3 = new int["RHMFUWERV".length()];
            QB qb3 = new QB("RHMFUWERV");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd4 + sXd4) + i5));
                i5++;
            }
            double dOptDouble = jSONObject.optDouble(new String(iArr3, 0, i5), 0.0d);
            Bundle bundle = new Bundle();
            if (zzov.zza() && this.zzi.zza(zzbh.zzct)) {
                if (!zzt().zzi(strOptString)) {
                    zzgq zzgqVarZzu = zzj().zzu();
                    short sXd5 = (short) (C1580rY.Xd() ^ (-26579));
                    short sXd6 = (short) (C1580rY.Xd() ^ (-2334));
                    int[] iArr4 = new int["\u000f7\bV#fH\u0017\u0012yjY$\u001b\u0013\u007f$((NxK8~;\u0016ZK\n\u0003\u0019_\u0007\u0011Y(-f\u001dh-q<s'2|\\ju@W\u000b\u0013\u0003R\u001d\u0014,\u0018\\!".length()];
                    QB qb4 = new QB("\u000f7\bV#fH\u0017\u0012yjY$\u001b\u0013\u007f$((NxK8~;\u0016ZK\n\u0003\u0019_\u0007\u0011Y(-f\u001dh-q<s'2|\\ju@W\u000b\u0013\u0003R\u001d\u0014,\u0018\\!");
                    int i6 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i6] = xuXd4.fK(((i6 * sXd6) ^ sXd5) + xuXd4.CK(iKK4));
                        i6++;
                    }
                    zzgqVarZzu.zza(new String(iArr4, 0, i6), strOptString2, strOptString3, strOptString);
                    return;
                }
                if (!TextUtils.isEmpty(strOptString3)) {
                    bundle.putString(strOd, strOptString3);
                }
                if (!TextUtils.isEmpty(strOptString4)) {
                    bundle.putString(strWd, strOptString4);
                }
            } else if (!zzt().zzi(strOptString)) {
                zzj().zzu().zza(C1561oA.Xd("d\u0007\t\t\u0017\u0018\f\fHm\u0010\u0011\u001dMz\u0019\u001f\u001dR*\u0016\" \u001c\u001a.$++]%!*.((re.+53/wl245Aq?=CA", (short) (Od.Xd() ^ (-11968))), strOptString2, strOptString);
                return;
            }
            if (zzov.zza()) {
                this.zzi.zza(zzbh.zzct);
            }
            bundle.putString(str2, strOptString2);
            bundle.putString(Wg.vd("&+2=", (short) (OY.Xd() ^ 7163)), Qg.kd("nmx", (short) (ZN.Xd() ^ 16476), (short) (ZN.Xd() ^ 24711)));
            this.zzr.zzc(hg.Vd("\u001f20*", (short) (C1633zX.Xd() ^ (-12915)), (short) (C1633zX.Xd() ^ (-24547))), C1561oA.ud("),57", (short) (ZN.Xd() ^ 11006)), bundle);
            zzos zzosVarZzt = zzt();
            if (TextUtils.isEmpty(strOptString) || !zzosVarZzt.zza(strOptString, dOptDouble)) {
                return;
            }
            Intent intent = new Intent(C1561oA.yd("dpivnge.bilcc['YaSamcWTc\u0019KP`PUW\u0016''*4+'/+:\u001b 0 %'", (short) (FB.Xd() ^ 19854)));
            Context contextZza = zzosVarZzt.zza();
            Class<?> cls = Class.forName(C1561oA.Yd("\u000f\u001d\u0014#!\u001c\u0018b\u0019&&-\u001f)0j\u0001..5';8", (short) (ZN.Xd() ^ 2899)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Xg.qd("\"0'64/+u,99@2<C}\u001a@G9CJ", (short) (C1499aX.Xd() ^ (-26880)), (short) (C1499aX.Xd() ^ (-3814))));
            Object[] objArr = {intent};
            Method method = cls.getMethod(Jg.Wd("K,~\u0014;\u0003IZ+@\t1\r", (short) (OY.Xd() ^ 27386), (short) (OY.Xd() ^ 6439)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(contextZza, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (JSONException e3) {
            zzj().zzg().zza(ZO.xd("-:7\u001aMU?\u001e57I\u001cA\u0005\r#\u0012FN Hy`%\u0002\\0HF`a>6Ez\f\u0001hz}9\u001f(m\u0010F\u0012O4WUEs\u000f/c)\f", (short) (C1607wl.Xd() ^ 15054), (short) (C1607wl.Xd() ^ 27674)), e3);
        }
    }

    final void zza(boolean z2) {
        this.zzac = Boolean.valueOf(z2);
    }

    final void zzaa() {
        this.zzag++;
    }

    public final boolean zzab() {
        return this.zzac != null && this.zzac.booleanValue();
    }

    public final boolean zzac() {
        return zzc() == 0;
    }

    public final boolean zzad() {
        zzl().zzt();
        return this.zzaf;
    }

    @Pure
    public final boolean zzae() {
        return TextUtils.isEmpty(this.zzd);
    }

    protected final boolean zzaf() {
        if (!this.zzz) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzl().zzt();
        Boolean bool = this.zzaa;
        if (bool == null || this.zzab == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzp.elapsedRealtime() - this.zzab) > 1000)) {
            this.zzab = this.zzp.elapsedRealtime();
            boolean z2 = true;
            Boolean boolValueOf = Boolean.valueOf(zzt().zze("android.permission.INTERNET") && zzt().zze("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzc).isCallerInstantApp() || this.zzi.zzy() || (zzos.zza(this.zzc) && zzos.zza(this.zzc, false))));
            this.zzaa = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!zzt().zza(zzh().zzae(), zzh().zzac()) && TextUtils.isEmpty(zzh().zzac())) {
                    z2 = false;
                }
                this.zzaa = Boolean.valueOf(z2);
            }
        }
        return this.zzaa.booleanValue();
    }

    @Pure
    public final boolean zzag() {
        return this.zzg;
    }

    public final boolean zzah() {
        zzl().zzt();
        zza((zzjd) zzai());
        String strZzad = zzh().zzad();
        if (!this.zzi.zzv()) {
            zzj().zzp().zza("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        Pair<String, Boolean> pairZza = zzn().zza(strZzad);
        if (((Boolean) pairZza.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairZza.first)) {
            zzj().zzp().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!zzai().zzc()) {
            zzj().zzu().zza("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        zzls zzlsVarZzr = zzr();
        zzlsVarZzr.zzt();
        zzlsVarZzr.zzu();
        if (!zzlsVarZzr.zzap() || zzlsVarZzr.zzq().zzg() >= 234200) {
            zzaj zzajVarZzab = zzp().zzab();
            Bundle bundle = zzajVarZzab != null ? zzajVarZzab.zza : null;
            if (bundle == null) {
                int i2 = this.zzah;
                this.zzah = i2 + 1;
                boolean z2 = i2 < 10;
                zzj().zzc().zza("Failed to retrieve DMA consent from the service, " + (z2 ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.zzah));
                return z2;
            }
            sb.append("&gcs=").append(zzje.zza(bundle, 100).zze());
            zzax zzaxVarZza = zzax.zza(bundle, 100);
            sb.append("&dma=").append(zzaxVarZza.zzd() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(zzaxVarZza.zze())) {
                sb.append("&dma_cps=").append(zzaxVarZza.zze());
            }
            sb.append("&npa=").append(zzax.zza(bundle) == Boolean.TRUE ? 0 : 1);
            zzj().zzp().zza("Consent query parameters to Bow", sb);
        }
        zzos zzosVarZzt = zzt();
        zzh();
        URL urlZza = zzosVarZzt.zza(106000L, strZzad, (String) pairZza.first, zzn().zzp.zza() - 1, sb.toString());
        if (urlZza != null) {
            zzle zzleVarZzai = zzai();
            zzld zzldVar = new zzld() { // from class: com.google.android.gms.measurement.internal.zzia
                @Override // com.google.android.gms.measurement.internal.zzld
                public final void zza(String str, int i3, Throwable th, byte[] bArr, Map map) throws Throwable {
                    this.zza.zza(str, i3, th, bArr, map);
                }
            };
            zzleVarZzai.zzt();
            zzleVarZzai.zzac();
            Preconditions.checkNotNull(urlZza);
            Preconditions.checkNotNull(zzldVar);
            zzleVarZzai.zzl().zza(new zzlg(zzleVarZzai, strZzad, urlZza, null, null, zzldVar));
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final Clock zzb() {
        return this.zzp;
    }

    public final void zzb(boolean z2) {
        zzl().zzt();
        this.zzaf = z2;
    }

    public final int zzc() {
        zzl().zzt();
        if (this.zzi.zzx()) {
            return 1;
        }
        Boolean bool = this.zzae;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!zzad()) {
            return 8;
        }
        Boolean boolZzv = zzn().zzv();
        if (boolZzv != null) {
            return boolZzv.booleanValue() ? 0 : 3;
        }
        Boolean boolZze = this.zzi.zze("firebase_analytics_collection_enabled");
        if (boolZze != null) {
            return boolZze.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.zzad;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.zzac == null || this.zzac.booleanValue()) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final zzab zzd() {
        return this.zzh;
    }

    @Pure
    public final zzb zze() {
        zzb zzbVar = this.zzs;
        if (zzbVar != null) {
            return zzbVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzag zzf() {
        return this.zzi;
    }

    @Pure
    public final zzaz zzg() {
        zza((zzjd) this.zzx);
        return this.zzx;
    }

    @Pure
    public final zzgg zzh() {
        zza((zzh) this.zzy);
        return this.zzy;
    }

    @Pure
    public final zzgf zzi() {
        zza((zzh) this.zzv);
        return this.zzv;
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final zzgo zzj() {
        zza((zzjd) this.zzk);
        return this.zzk;
    }

    @Pure
    public final zzgh zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final zzhv zzl() {
        zza((zzjd) this.zzl);
        return this.zzl;
    }

    public final zzgo zzm() {
        zzgo zzgoVar = this.zzk;
        if (zzgoVar == null || !zzgoVar.zzaf()) {
            return null;
        }
        return this.zzk;
    }

    @Pure
    public final zzha zzn() {
        zza((zzja) this.zzj);
        return this.zzj;
    }

    @SideEffectFree
    final zzhv zzo() {
        return this.zzl;
    }

    @Pure
    public final zzjq zzp() {
        zza((zzh) this.zzr);
        return this.zzr;
    }

    @Pure
    public final zzlj zzq() {
        zza((zzh) this.zzq);
        return this.zzq;
    }

    @Pure
    public final zzls zzr() {
        zza((zzh) this.zzw);
        return this.zzw;
    }

    @Pure
    public final zznb zzs() {
        zza((zzh) this.zzm);
        return this.zzm;
    }

    @Pure
    public final zzos zzt() {
        zza((zzja) this.zzn);
        return this.zzn;
    }

    @Pure
    public final String zzu() {
        return this.zzd;
    }

    @Pure
    public final String zzv() {
        return this.zze;
    }

    @Pure
    public final String zzw() {
        return this.zzf;
    }

    @Pure
    public final String zzx() {
        return this.zzu;
    }

    final void zzy() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void zzz() {
        this.zzai.incrementAndGet();
    }
}
