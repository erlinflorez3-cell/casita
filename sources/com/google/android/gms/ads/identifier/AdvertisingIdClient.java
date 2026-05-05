package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import com.dynatrace.android.agent.AdkSettings;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.imagepicker.ImagePickerModuleImpl;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
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
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
@ParametersAreNonnullByDefault
public class AdvertisingIdClient {
    BlockingServiceConnection zza;
    zzf zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzg;

    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z2) {
            this.zza = str;
            this.zzb = z2;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            String str = this.zza;
            boolean z2 = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z2);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public AdvertisingIdClient(Context context, long j2, boolean z2, boolean z3) throws Throwable {
        this.zzd = new Object();
        Preconditions.checkNotNull(context);
        if (z2) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Xd("t\u0003y\t\u0007\u0002}H~\f\f\u0013\u0005\u000f\u0016Pf\u0014\u0014\u001b\r!\u001e", (short) (C1607wl.Xd() ^ 10438))).getMethod(Wg.vd("74F\u0012DCB>+(>2;9\u0011<NSGYX", (short) (ZN.Xd() ^ 21158)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                if (context2 != null) {
                    context = context2;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j2;
    }

    public static Info getAdvertisingIdInfo(Context context) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info infoZzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(infoZzd, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return infoZzd;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, IOException {
        boolean zZzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (advertisingIdClient.zzc) {
                    Preconditions.checkNotNull(advertisingIdClient.zza);
                    Preconditions.checkNotNull(advertisingIdClient.zzb);
                    zZzd = advertisingIdClient.zzb.zzd();
                } else {
                    synchronized (advertisingIdClient.zzd) {
                        zzb zzbVar = advertisingIdClient.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.zzb(false);
                        if (!advertisingIdClient.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                        Preconditions.checkNotNull(advertisingIdClient.zza);
                        Preconditions.checkNotNull(advertisingIdClient.zzb);
                        try {
                            zZzd = advertisingIdClient.zzb.zzd();
                        } catch (RemoteException e2) {
                            throw new IOException("Remote exception");
                        }
                    } catch (Exception e3) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                    }
                }
            }
            advertisingIdClient.zze();
            return zZzd;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z2) {
    }

    private final Info zzd(int i2) throws IOException {
        Info info;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzc) {
                Preconditions.checkNotNull(this.zza);
                Preconditions.checkNotNull(this.zzb);
                info = new Info(this.zzb.zzc(), this.zzb.zze(true));
            } else {
                synchronized (this.zzd) {
                    zzb zzbVar = this.zze;
                    if (zzbVar == null || !zzbVar.zzb) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zzb(false);
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    Preconditions.checkNotNull(this.zza);
                    Preconditions.checkNotNull(this.zzb);
                    try {
                        info = new Info(this.zzb.zzc(), this.zzb.zze(true));
                    } catch (RemoteException e2) {
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j2 = this.zzf;
            if (j2 > 0) {
                this.zze = new zzb(this, j2);
            }
        }
    }

    protected final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() throws IOException {
        return zzd(-1);
    }

    public void start() throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        zzb(true);
    }

    public final void zza() {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg != null && this.zza != null) {
                try {
                    if (this.zzc) {
                        ConnectionTracker.getInstance().unbindService(this.zzg, this.zza);
                    }
                } catch (Throwable th) {
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            }
        }
    }

    protected final void zzb(boolean z2) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        Preconditions.checkNotMainThread(Qg.kd("\u001b8BA=A9pD77@k1<85f?495a.!(,\\0#,\u001e\u0019\u001bU\u0018\u0015!Q\u001d\u0015\u0010\u0012L \u001aI\r\r\b\n\u0011\u0013\u0006\r", (short) (FB.Xd() ^ 17160), (short) (FB.Xd() ^ 16930)));
        synchronized (this) {
            if (this.zzc) {
                zza();
            }
            Context context = this.zzg;
            try {
                Object[] objArr = new Object[0];
                Method method = Class.forName(hg.Vd("]i^kg`Z#Wb`eU]b\u001b/ZX]M_Z", (short) (C1633zX.Xd() ^ (-24172)), (short) (C1633zX.Xd() ^ (-10529)))).getMethod(C1561oA.ud("nkyTdelafcJ]i[`]i", (short) (Od.Xd() ^ (-16783))), new Class[0]);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    Object[] objArr2 = {C1561oA.yd("LWX\u0018NZS`PIG\u0010[IUJbfb", (short) (C1607wl.Xd() ^ 3187)), 0};
                    Method method2 = Class.forName(C1561oA.Yd("4B9HFA=\b>KKRDNU\u0010SQ\u00136HKTKRQ:O]QXWe", (short) (C1633zX.Xd() ^ (-24009)))).getMethod(Jg.Wd("%\u0014_$\u001atJA\u0004Z;!\u0007h", (short) (C1633zX.Xd() ^ (-32318)), (short) (C1633zX.Xd() ^ (-8532))), Class.forName(Xg.qd("VNdP\u001e]Sa[#Ikjbhb", (short) (FB.Xd() ^ 1790), (short) (FB.Xd() ^ ImagePickerModuleImpl.REQUEST_LAUNCH_VIDEO_CAPTURE))), Integer.TYPE);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(packageManager, objArr2);
                        int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
                        if (iIsGooglePlayServicesAvailable != 0 && iIsGooglePlayServicesAvailable != 2) {
                            short sXd = (short) (C1607wl.Xd() ^ 4002);
                            short sXd2 = (short) (C1607wl.Xd() ^ 31564);
                            int[] iArr = new int["x]\u0014Yb!E\nt\u007fdRb\u001e(y>.\u000e\u0002n\u000fmN'T\u0006\u0011\u0015A;D\u000eN".length()];
                            QB qb = new QB("x]\u0014Yb!E\nt\u007fdRb\u001e(y>.\u000e\u0002n\u000fmN'T\u0006\u0011\u0015A;D\u000eN");
                            int i2 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                                i2++;
                            }
                            throw new IOException(new String(iArr, 0, i2));
                        }
                        BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                        short sXd3 = (short) (C1607wl.Xd() ^ 23105);
                        short sXd4 = (short) (C1607wl.Xd() ^ 30369);
                        int[] iArr2 = new int["\u0005\u0015e\u0003\u0018\u0007|ko\u0001!Qh0\u007fseB&\u001bjhb\u0019PML\u0013?'\u0010dt\u0001\u0019\u001dR-:X*-%\u0002z\u0006\u0019{\u001fAG".length()];
                        QB qb2 = new QB("\u0005\u0015e\u0003\u0018\u0007|ko\u0001!Qh0\u007fseB&\u001bjhb\u0019PML\u0013?'\u0010dt\u0001\u0019\u001dR-:X*-%\u0002z\u0006\u0019{\u001fAG");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                            i3++;
                        }
                        Intent intent = new Intent(new String(iArr2, 0, i3));
                        intent.setPackage(Ig.wd(")m\u001arc.\u001ab(1{Q/\u001b9\u000116(\nP~", (short) (OY.Xd() ^ 20857)));
                        try {
                            if (!ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                                throw new IOException(C1561oA.Qd("\u0017B@?52B6;9i/)02:6(", (short) (C1499aX.Xd() ^ (-20832))));
                            }
                            this.zza = blockingServiceConnection;
                            try {
                                this.zzb = zze.zza(blockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
                                this.zzc = true;
                                if (z2) {
                                    zze();
                                }
                            } catch (InterruptedException unused) {
                                short sXd5 = (short) (C1607wl.Xd() ^ 19779);
                                int[] iArr3 = new int["\u001a\u0006 6]\u001bw\\\u001c.-\u0005y\u0019\u0019{K7\u0007r,".length()];
                                QB qb3 = new QB("\u001a\u0006 6]\u001bw\\\u001c.-\u0005y\u0019\u0019{K7\u0007r,");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i4)) + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                throw new IOException(new String(iArr3, 0, i4));
                            } catch (Throwable th) {
                                throw new IOException(th);
                            }
                        } finally {
                            IOException iOException = new IOException(th);
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new GooglePlayServicesNotAvailableException(9);
            }
        }
    }

    final boolean zzc(Info info, boolean z2, float f2, long j2, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? AdkSettings.PLATFORM_TYPE_MOBILE : "1");
            String id = info.getId();
            if (id != null) {
                map.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j2));
        new zza(this, map).start();
        return true;
    }
}
