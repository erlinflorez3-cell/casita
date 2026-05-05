package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class zzdy {
    private static volatile zzdy zzb = null;
    protected final Clock zza;
    private final String zzc;
    private final ExecutorService zzd;
    private final AppMeasurementSdk zze;
    private final List<Pair<com.google.android.gms.measurement.internal.zzjl, zzb>> zzf;
    private int zzg;
    private boolean zzh;
    private String zzi;
    private volatile zzdj zzj;

    abstract class zza implements Runnable {
        final long zza;
        final long zzb;
        private final boolean zzc;

        zza(zzdy zzdyVar) {
            this(true);
        }

        zza(boolean z2) {
            this.zza = zzdy.this.zza.currentTimeMillis();
            this.zzb = zzdy.this.zza.elapsedRealtime();
            this.zzc = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (zzdy.this.zzh) {
                zzb();
                return;
            }
            try {
                zza();
            } catch (Exception e2) {
                zzdy.this.zza(e2, false, this.zzc);
                zzb();
            }
        }

        abstract void zza() throws RemoteException;

        protected void zzb() {
        }
    }

    static class zzb extends zzds {
        private final com.google.android.gms.measurement.internal.zzjl zza;

        zzb(com.google.android.gms.measurement.internal.zzjl zzjlVar) {
            this.zza = zzjlVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzdp
        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzdp
        public final void zza(String str, String str2, Bundle bundle, long j2) {
            this.zza.onEvent(str, str2, bundle, j2);
        }
    }

    static class zzc extends zzds {
        private final com.google.android.gms.measurement.internal.zzjm zza;

        zzc(com.google.android.gms.measurement.internal.zzjm zzjmVar) {
            this.zza = zzjmVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzdp
        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzdp
        public final void zza(String str, String str2, Bundle bundle, long j2) {
            this.zza.interceptEvent(str, str2, bundle, j2);
        }
    }

    class zzd implements Application.ActivityLifecycleCallbacks {
        zzd() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            zzdy.this.zza(new zzfg(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            zzdy.this.zza(new zzfl(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            zzdy.this.zza(new zzfk(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            zzdy.this.zza(new zzfh(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            zzdk zzdkVar = new zzdk();
            zzdy.this.zza(new zzfm(this, activity, zzdkVar));
            Bundle bundleZza = zzdkVar.zza(50L);
            if (bundleZza != null) {
                bundle.putAll(bundleZza);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            zzdy.this.zza(new zzfi(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            zzdy.this.zza(new zzfj(this, activity));
        }
    }

    private zzdy(Context context, String str, String str2, String str3, Bundle bundle) throws Throwable {
        if (str == null || !zzc(str2, str3)) {
            this.zzc = C1561oA.Xd("TP", (short) (C1607wl.Xd() ^ 21850));
        } else {
            this.zzc = str;
        }
        this.zza = DefaultClock.getInstance();
        this.zzd = zzdc.zza().zza(new zzek(this), 1);
        this.zze = new AppMeasurementSdk(this);
        this.zzf = new ArrayList();
        if (zzb(context) && !zzk()) {
            this.zzi = null;
            this.zzh = true;
            String str4 = this.zzc;
            short sXd = (short) (FB.Xd() ^ 7170);
            int[] iArr = new int["+QXGEPJPF\u007fA?O=x=fda[VhZa]\u001e\r4ZaWN'otujpfa`pm]d`\u0019c\u00068\t\u000b\u0006}\u007fy\u0003>\u0006{w,k\u007f\u001bGk\u0015\u0012\u000b\r\u0007>`\u000b~\u0007\u0015\r\u0003\u001a+T\u001c\"&Pw\u0018\"\u0012\u0010\f\u001f\u000eI0;d3,74+-'j]\r!&)M=tJ;=DqE19C0k8<\u0006HHI\u0002*OPEKA|\u001bI9Eok]Xe\u0013V``\u000f2V\\PJJyl$yq#rfqtib\u001a_Ymw7w\u0005~\u007fut\u0003x{{8".length()];
            QB qb = new QB("+QXGEPJPF\u007fA?O=x=fda[VhZa]\u001e\r4ZaWN'otujpfa`pm]d`\u0019c\u00068\t\u000b\u0006}\u007fy\u0003>\u0006{w,k\u007f\u001bGk\u0015\u0012\u000b\r\u0007>`\u000b~\u0007\u0015\r\u0003\u001a+T\u001c\"&Pw\u0018\"\u0012\u0010\f\u001f\u000eI0;d3,74+-'j]\r!&)M=tJ;=DqE19C0k8<\u0006HHI\u0002*OPEKA|\u001bI9Eok]Xe\u0013V``\u000f2V\\PJJyl$yq#rfqtib\u001a_Ymw7w\u0005~\u007fut\u0003x{{8");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            new String(iArr, 0, i2);
            return;
        }
        if (zzc(str2, str3)) {
            this.zzi = str2;
        } else {
            this.zzi = Qg.kd("`Z", (short) (Od.Xd() ^ (-10498)), (short) (Od.Xd() ^ (-9512)));
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    String str5 = this.zzc;
                    C1561oA.ud("FbVSXTVQO\nXZPMNR\u0003QS\u007fBSPPJGx9GFt=7q:Cn<B87wh\n6:-c3#3!,#1!--X/ \"!S\u0015\u0017P\u0019\u0016\u001c\u001c\u001e\u0010\u000eV", (short) (Od.Xd() ^ (-1946)));
                }
            } else {
                String str6 = this.zzc;
                hg.Vd("^~~|\t\b}\u0002y1\u0005~.T{zqum'Gseo{uibq\u001dbjl\u0019>`hZVTeV\u0010U]_\fP`NV[\u0006IEWC\u0001CNJIA>NBGE\u0004t<GFAC\t|{24<.*(9*q*10'+#j\u001f*'g\u001c&\u0019(b\u0014 \u0012\u001c(\"\u0016\u000f\u001e", (short) (C1499aX.Xd() ^ (-22915)), (short) (C1499aX.Xd() ^ (-12986)));
            }
        }
        zza(new zzdx(this, str2, str3, context, bundle));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("y\u0006~\f\f\u0005\u0003K\u0004\u000f\u0011\u0016\n\u0012\u001bSKvx}q\u0004\u0003", (short) (ZN.Xd() ^ 32225))).getMethod(C1561oA.Yd("^]m;kligbaukrrHuu|n\u0003\u007f", (short) (C1499aX.Xd() ^ (-3510))), new Class[0]);
        try {
            method.setAccessible(true);
            Application application = (Application) ((Context) method.invoke(context, objArr));
            if (application != null) {
                Object[] objArr2 = {new zzd()};
                Method method2 = Class.forName(Jg.Wd("\u0019-\tmP A!z`FXQV|\u000f2\u0001dN)\u0005(", (short) (OY.Xd() ^ 15288), (short) (OY.Xd() ^ 28944))).getMethod(C1626yg.Ud(";\u0007U6W\u000f\u0017ZI:X&\u0004\u007f\u0002c_e5\u001bMBt\t:\u0006;k+,Dm\u001f>", (short) (C1607wl.Xd() ^ 13398), (short) (C1607wl.Xd() ^ 11557)), Class.forName(ZO.xd("\u0002\u001f/Q\u0018\u0002l+D7<5V&\u0001\u0002mUm}-\u000f9[IQcUT\u0017ArX\u0017XMq3>\u001ayP>\u0002\\`\u00195yl", (short) (ZN.Xd() ^ 16751), (short) (ZN.Xd() ^ 26621))));
                try {
                    method2.setAccessible(true);
                    method2.invoke(application, objArr2);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            String str7 = this.zzc;
            short sXd2 = (short) (C1607wl.Xd() ^ 6107);
            short sXd3 = (short) (C1607wl.Xd() ^ 28278);
            int[] iArr2 = new int["5OCEPJ\u0006[W\t\\PSVacUc\u0012_][[Zq\\f`\u001ckmsigkfeyovv|8+M}~{yts\b}\u0005\u00057\u0007\u000f\u0007\bJ".length()];
            QB qb2 = new QB("5OCEPJ\u0006[W\t\\PSVacUc\u0012_][[Zq\\f`\u001ckmsigkfeyovv|8+M}~{yts\b}\u0005\u00057\u0007\u000f\u0007\bJ");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                i3++;
            }
            new String(iArr2, 0, i3);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static zzdy zza(Context context) {
        return zza(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static zzdy zza(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (zzb == null) {
            synchronized (zzdy.class) {
                if (zzb == null) {
                    zzb = new zzdy(context, str, str2, str3, bundle);
                }
            }
        }
        return zzb;
    }

    public final void zza(zza zzaVar) {
        this.zzd.execute(zzaVar);
    }

    public final void zza(Exception exc, boolean z2, boolean z3) {
        this.zzh |= z2;
        if (z2) {
            String str = this.zzc;
            return;
        }
        if (z3) {
            zza(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        String str2 = this.zzc;
    }

    private final void zza(String str, String str2, Bundle bundle, boolean z2, boolean z3, Long l2) {
        zza(new zzff(this, l2, str, str2, bundle, z2, z3));
    }

    private static boolean zzb(Context context) {
        return new com.google.android.gms.measurement.internal.zzhs(context, com.google.android.gms.measurement.internal.zzhs.zza(context)).zza("google_app_id") != null;
    }

    public final boolean zzc(String str, String str2) {
        return (str2 == null || str == null || zzk()) ? false : true;
    }

    private final boolean zzk() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final int zza(String str) {
        zzdk zzdkVar = new zzdk();
        zza(new zzev(this, str, zzdkVar));
        Integer num = (Integer) zzdk.zza(zzdkVar.zza(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zza() {
        zzdk zzdkVar = new zzdk();
        zza(new zzeq(this, zzdkVar));
        Long lZzb = zzdkVar.zzb(500L);
        if (lZzb != null) {
            return lZzb.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
        int i2 = this.zzg + 1;
        this.zzg = i2;
        return jNextLong + ((long) i2);
    }

    public final Bundle zza(Bundle bundle, boolean z2) {
        zzdk zzdkVar = new zzdk();
        zza(new zzew(this, bundle, zzdkVar));
        if (z2) {
            return zzdkVar.zza(5000L);
        }
        return null;
    }

    protected final zzdj zza(Context context, boolean z2) {
        try {
            return zzdm.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e2) {
            zza((Exception) e2, true, false);
            return null;
        }
    }

    public final Object zza(int i2) {
        zzdk zzdkVar = new zzdk();
        zza(new zzfa(this, zzdkVar, i2));
        return zzdk.zza(zzdkVar.zza(15000L), Object.class);
    }

    public final List<Bundle> zza(String str, String str2) {
        zzdk zzdkVar = new zzdk();
        zza(new zzeb(this, str, str2, zzdkVar));
        List<Bundle> list = (List) zzdk.zza(zzdkVar.zza(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> zza(String str, String str2, boolean z2) {
        zzdk zzdkVar = new zzdk();
        zza(new zzer(this, str, str2, z2, zzdkVar));
        Bundle bundleZza = zzdkVar.zza(5000L);
        if (bundleZza == null || bundleZza.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleZza.size());
        for (String str3 : bundleZza.keySet()) {
            Object obj = bundleZza.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void zza(int i2, String str, Object obj, Object obj2, Object obj3) {
        zza(new zzeu(this, false, 5, str, obj, null, null));
    }

    public final void zza(long j2) {
        zza(new zzej(this, j2));
    }

    public final void zza(Activity activity, String str, String str2) {
        zza(new zzed(this, activity, str, str2));
    }

    public final void zza(Intent intent) {
        zza(new zzfb(this, intent));
    }

    public final void zza(Bundle bundle) {
        zza(new zzdz(this, bundle));
    }

    public final void zza(com.google.android.gms.measurement.internal.zzjl zzjlVar) {
        Preconditions.checkNotNull(zzjlVar);
        synchronized (this.zzf) {
            for (int i2 = 0; i2 < this.zzf.size(); i2++) {
                if (zzjlVar.equals(this.zzf.get(i2).first)) {
                    String str = this.zzc;
                    return;
                }
            }
            zzb zzbVar = new zzb(zzjlVar);
            this.zzf.add(new Pair<>(zzjlVar, zzbVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzbVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    String str2 = this.zzc;
                }
            }
            zza(new zzfe(this, zzbVar));
        }
    }

    public final void zza(com.google.android.gms.measurement.internal.zzjm zzjmVar) {
        zzc zzcVar = new zzc(zzjmVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzcVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                String str = this.zzc;
            }
        }
        zza(new zzet(this, zzcVar));
    }

    public final void zza(Boolean bool) {
        zza(new zzeg(this, bool));
    }

    public final void zza(String str, Bundle bundle) {
        zza(null, str, bundle, false, true, null);
    }

    public final void zza(String str, String str2, Bundle bundle) {
        zza(new zzec(this, str, str2, bundle));
    }

    public final void zza(String str, String str2, Bundle bundle, long j2) {
        zza(str, str2, bundle, true, false, Long.valueOf(j2));
    }

    public final void zza(String str, String str2, Object obj, boolean z2) {
        zza(new zzea(this, str, str2, obj, z2));
    }

    public final void zza(boolean z2) {
        zza(new zzez(this, z2));
    }

    public final AppMeasurementSdk zzb() {
        return this.zze;
    }

    public final void zzb(Bundle bundle) {
        zza(new zzef(this, bundle));
    }

    public final void zzb(com.google.android.gms.measurement.internal.zzjl zzjlVar) {
        Pair<com.google.android.gms.measurement.internal.zzjl, zzb> pair;
        Preconditions.checkNotNull(zzjlVar);
        synchronized (this.zzf) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.zzf.size()) {
                    pair = null;
                    break;
                } else {
                    if (zzjlVar.equals(this.zzf.get(i2).first)) {
                        pair = this.zzf.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (pair == null) {
                String str = this.zzc;
                return;
            }
            this.zzf.remove(pair);
            zzb zzbVar = (zzb) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzbVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    String str2 = this.zzc;
                }
            }
            zza(new zzfd(this, zzbVar));
        }
    }

    public final void zzb(String str) {
        zza(new zzem(this, str));
    }

    public final void zzb(String str, String str2) {
        zza((String) null, str, (Object) str2, false);
    }

    public final void zzb(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, null);
    }

    public final Long zzc() {
        zzdk zzdkVar = new zzdk();
        zza(new zzex(this, zzdkVar));
        return zzdkVar.zzb(120000L);
    }

    public final void zzc(Bundle bundle) {
        zza(new zzei(this, bundle));
    }

    public final void zzc(String str) {
        zza(new zzel(this, str));
    }

    public final String zzd() {
        return this.zzi;
    }

    public final void zzd(Bundle bundle) {
        zza(new zzfc(this, bundle));
    }

    public final void zzd(String str) {
        zza(new zzee(this, str));
    }

    public final String zze() {
        zzdk zzdkVar = new zzdk();
        zza(new zzey(this, zzdkVar));
        return zzdkVar.zzc(120000L);
    }

    public final String zzf() {
        zzdk zzdkVar = new zzdk();
        zza(new zzen(this, zzdkVar));
        return zzdkVar.zzc(50L);
    }

    public final String zzg() {
        zzdk zzdkVar = new zzdk();
        zza(new zzes(this, zzdkVar));
        return zzdkVar.zzc(500L);
    }

    public final String zzh() {
        zzdk zzdkVar = new zzdk();
        zza(new zzep(this, zzdkVar));
        return zzdkVar.zzc(500L);
    }

    public final String zzi() {
        zzdk zzdkVar = new zzdk();
        zza(new zzeo(this, zzdkVar));
        return zzdkVar.zzc(500L);
    }

    public final void zzj() {
        zza(new zzeh(this));
    }
}
