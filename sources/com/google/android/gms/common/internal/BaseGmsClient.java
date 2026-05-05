package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
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
public abstract class BaseGmsClient<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile AttributionSourceWrapper zzB;
    private ConnectionResult zzC;
    private boolean zzD;
    private volatile zzk zzE;
    zzv zza;
    final Handler zzb;
    protected ConnectionProgressReportCallbacks zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final GmsClientSupervisor zzn;
    private final GoogleApiAvailabilityLight zzo;
    private final Object zzp;
    private final Object zzq;
    private IGmsServiceBroker zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private zze zzu;
    private int zzv;
    private final BaseConnectionCallbacks zzw;
    private final BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final String zzz;
    private static final Feature[] zze = new Feature[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public interface BaseConnectionCallbacks {
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i2);
    }

    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public interface ConnectionProgressReportCallbacks {
        void onReportServiceBinding(ConnectionResult connectionResult);
    }

    protected class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(ConnectionResult connectionResult) throws Throwable {
            if (connectionResult.isSuccess()) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
            } else if (BaseGmsClient.this.zzx != null) {
                BaseGmsClient.this.zzx.onConnectionFailed(connectionResult);
            }
        }
    }

    public interface SignOutCallbacks {
        void onSignOutComplete();
    }

    protected BaseGmsClient(Context context, Handler handler, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i2, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        Preconditions.checkNotNull(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzy = i2;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected BaseGmsClient(Context context, Looper looper, int i2, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        GmsClientSupervisor gmsClientSupervisor = GmsClientSupervisor.getInstance(context);
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
        Preconditions.checkNotNull(baseConnectionCallbacks);
        Preconditions.checkNotNull(baseOnConnectionFailedListener);
        this(context, looper, gmsClientSupervisor, googleApiAvailabilityLight, i2, baseConnectionCallbacks, baseOnConnectionFailedListener, str);
    }

    protected BaseGmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i2, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        Preconditions.checkNotNull(looper, "Looper must not be null");
        this.zzm = looper;
        Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzb = new zzb(this, looper);
        this.zzy = i2;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = str;
    }

    static /* bridge */ /* synthetic */ void zzj(BaseGmsClient baseGmsClient, zzk zzkVar) {
        baseGmsClient.zzE = zzkVar;
        if (baseGmsClient.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.zzd;
            RootTelemetryConfigManager.getInstance().zza(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.zza());
        }
    }

    static /* bridge */ /* synthetic */ void zzk(BaseGmsClient baseGmsClient, int i2) {
        int i3;
        int i4;
        synchronized (baseGmsClient.zzp) {
            i3 = baseGmsClient.zzv;
        }
        if (i3 == 3) {
            baseGmsClient.zzD = true;
            i4 = 5;
        } else {
            i4 = 4;
        }
        Handler handler = baseGmsClient.zzb;
        handler.sendMessage(handler.obtainMessage(i4, baseGmsClient.zzd.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean zzn(BaseGmsClient baseGmsClient, int i2, int i3, IInterface iInterface) {
        synchronized (baseGmsClient.zzp) {
            if (baseGmsClient.zzv != i2) {
                return false;
            }
            baseGmsClient.zzp(i3, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean zzo(BaseGmsClient baseGmsClient) {
        boolean z2 = false;
        if (baseGmsClient.zzD || TextUtils.isEmpty(baseGmsClient.getServiceDescriptor()) || TextUtils.isEmpty(baseGmsClient.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(baseGmsClient.getServiceDescriptor());
            z2 = true;
            return true;
        } catch (ClassNotFoundException unused) {
            return z2;
        }
    }

    public final void zzp(int i2, IInterface iInterface) {
        zzv zzvVar;
        zzv zzvVar2;
        String strUd = C1561oA.ud("bZLLUM\u0007ZT\u0004FQONDAQ{OIxK<HK=67\u000bo", (short) (C1499aX.Xd() ^ (-6274)));
        String strYd = C1561oA.yd("\u00198@ACI?x1>:;76Dxnf;-37-h13%).b#0deYXn`\\%\u000e\\U`e\\^X\u0006KMXMZVWCBP\u0005\u000b\u0003FP\t7", (short) (Od.Xd() ^ (-14001)));
        Preconditions.checkArgument((i2 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            this.zzv = i2;
            this.zzs = iInterface;
            Bundle bundle = null;
            if (i2 == 1) {
                zze zzeVar = this.zzu;
                if (zzeVar != null) {
                    GmsClientSupervisor gmsClientSupervisor = this.zzn;
                    String strZzb = this.zza.zzb();
                    Preconditions.checkNotNull(strZzb);
                    String str = strZzb;
                    gmsClientSupervisor.zzc(strZzb, this.zza.zza(), 4225, zzeVar, zze(), this.zza.zzc());
                    this.zzu = null;
                }
            } else if (i2 == 2 || i2 == 3) {
                zze zzeVar2 = this.zzu;
                if (zzeVar2 != null && (zzvVar2 = this.zza) != null) {
                    C1561oA.Yd("U|\u0004T~|y\u0004\u000b", (short) (FB.Xd() ^ 26896));
                    String str2 = strYd + zzvVar2.zzb() + Xg.qd("5\u0006\u00068", (short) (C1580rY.Xd() ^ (-2299)), (short) (C1580rY.Xd() ^ (-28559))) + zzvVar2.zza();
                    GmsClientSupervisor gmsClientSupervisor2 = this.zzn;
                    String strZzb2 = this.zza.zzb();
                    Preconditions.checkNotNull(strZzb2);
                    String str3 = strZzb2;
                    gmsClientSupervisor2.zzc(strZzb2, this.zza.zza(), 4225, zzeVar2, zze(), this.zza.zzc());
                    this.zzd.incrementAndGet();
                }
                zze zzeVar3 = new zze(this, this.zzd.get());
                this.zzu = zzeVar3;
                if (this.zzv != 3 || getLocalStartServiceAction() == null) {
                    zzvVar = new zzv(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup());
                } else {
                    Context context = getContext();
                    short sXd = (short) (ZN.Xd() ^ 1714);
                    short sXd2 = (short) (ZN.Xd() ^ 3185);
                    int[] iArr = new int["\u0015G`\u0016\u001e=[,\r@@m\n\u001aC\"B\u00168c_\u001a9".length()];
                    QB qb = new QB("\u0015G`\u0016\u001e=[,\r@@m\n\u001aC\"B\u00168c_\u001a9");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
                        i3++;
                    }
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(new String(iArr, 0, i3)).getMethod(ZO.xd("N]:\u00066A2~\u000bX>W\u00114", (short) (C1607wl.Xd() ^ 8793), (short) (C1607wl.Xd() ^ 2128)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        zzvVar = new zzv((String) method.invoke(context, objArr), getLocalStartServiceAction(), true, 4225, false);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                this.zza = zzvVar;
                if (zzvVar.zzc() && getMinApkVersion() < 17895000) {
                    throw new IllegalStateException(C1626yg.Ud("0H$\u0017R\\>~9rZy@(\u0017\u0013bu=D\u0004H-oEB@Lp\"~*Ncq\u0002>\u0017v\u0018FE;6\u000b`\u0010z1P\u001b6A.\u007fNoBg3&N\u0013\u0018/j\u0015i\u0004>~\n6TTt\u0001Ew(\"R^\u0002(3\fm>.C^>\f\u0012\u0005\\tN0v\u0011o%\u0010Pvs;\\jb4E;CW=,\u0006`)", (short) (OY.Xd() ^ 12862), (short) (OY.Xd() ^ 21954)).concat(String.valueOf(this.zza.zzb())));
                }
                GmsClientSupervisor gmsClientSupervisor3 = this.zzn;
                String strZzb3 = this.zza.zzb();
                Preconditions.checkNotNull(strZzb3);
                String str4 = strZzb3;
                ConnectionResult connectionResultZza = gmsClientSupervisor3.zza(new zzo(strZzb3, this.zza.zza(), 4225, this.zza.zzc()), zzeVar3, zze(), getBindServiceExecutor());
                if (!connectionResultZza.isSuccess()) {
                    Ig.wd(":\u001bS:3{c,\u0010", (short) (ZN.Xd() ^ 12095));
                    String strZzb4 = this.zza.zzb();
                    String strZza = this.zza.zza();
                    StringBuilder sb = new StringBuilder(strUd);
                    sb.append(strZzb4);
                    short sXd3 = (short) (FB.Xd() ^ 22065);
                    int[] iArr2 = new int["6>-8".length()];
                    QB qb2 = new QB("6>-8");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i4)) + xuXd2.CK(iKK2));
                        i4++;
                    }
                    sb.append(new String(iArr2, 0, i4));
                    sb.append(strZza);
                    sb.toString();
                    int errorCode = connectionResultZza.getErrorCode() == -1 ? 16 : connectionResultZza.getErrorCode();
                    if (connectionResultZza.getResolution() != null) {
                        bundle = new Bundle();
                        short sXd4 = (short) (FB.Xd() ^ 1334);
                        int[] iArr3 = new int["`T\\QUYQ2V[KSX".length()];
                        QB qb3 = new QB("`T\\QUYQ2V[KSX");
                        int i5 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i5] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i5 + xuXd3.CK(iKK3));
                            i5++;
                        }
                        bundle.putParcelable(new String(iArr3, 0, i5), connectionResultZza.getResolution());
                    }
                    zzl(errorCode, bundle, this.zzd.get());
                }
            } else if (i2 == 4) {
                Preconditions.checkNotNull(iInterface);
                onConnectedLocked(iInterface);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iIsGooglePlayServicesAvailable = this.zzo.isGooglePlayServicesAvailable(this.zzl, getMinApkVersion());
        if (iIsGooglePlayServicesAvailable == 0) {
            connect(new LegacyClientCallbackAdapter());
        } else {
            zzp(1, null);
            triggerNotAvailable(new LegacyClientCallbackAdapter(), iIsGooglePlayServicesAvailable, null);
        }
    }

    protected final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        zzp(2, null);
    }

    protected abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((zzc) this.zzt.get(i2)).zzf();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.zzp) {
            i2 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            iGmsServiceBroker = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i2 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i2 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i2 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i2 == 4) {
            printWriter.print("CONNECTED");
        } else if (i2 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.zzh;
            printWriterAppend.println(j2 + Global.BLANK + simpleDateFormat.format(new Date(j2)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i3 = this.zzf;
            if (i3 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i3 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i3 != 3) {
                printWriter.append((CharSequence) String.valueOf(i3));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.zzg;
            printWriterAppend2.println(j3 + Global.BLANK + simpleDateFormat.format(new Date(j3)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) CommonStatusCodes.getStatusCodeString(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j4 = this.zzj;
            printWriterAppend3.println(j4 + Global.BLANK + simpleDateFormat.format(new Date(j4)));
        }
    }

    protected boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return zze;
    }

    public AttributionSourceWrapper getAttributionSourceWrapper() {
        return this.zzB;
    }

    public final Feature[] getAvailableFeatures() {
        zzk zzkVar = this.zzE;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.zzb;
    }

    protected Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        zzv zzvVar;
        if (!isConnected() || (zzvVar = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return zzvVar.zza();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    protected Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    protected String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) throws Throwable {
        AttributionSource attributionSource;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.zzB == null || (attributionSource = this.zzB.getAttributionSource()) == null || attributionSource.getAttributionTag() == null) ? this.zzA : attributionSource.getAttributionTag();
        int i2 = this.zzy;
        int i3 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = GetServiceRequest.zza;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.zzb;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i2, i3, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, attributionTag);
        Context context = this.zzl;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f|**1#74", (short) (OY.Xd() ^ 16453), (short) (OY.Xd() ^ 12275))).getMethod(C1561oA.od("^[iDTU\\QVS;MXO", (short) (FB.Xd() ^ 25496)), new Class[0]);
        try {
            method.setAccessible(true);
            getServiceRequest.zzf = (String) method.invoke(context, objArr);
            getServiceRequest.zzi = getServiceRequestExtraArgs;
            if (set != null) {
                getServiceRequest.zzh = (Scope[]) set.toArray(new Scope[0]);
            }
            if (requiresSignIn()) {
                Account account = getAccount();
                if (account == null) {
                    account = new Account(C1561oA.Kd("PQz|~z\u0010\b\u0011=\u007f\u0003\u0004\u0011\u0018\u0012\u0019cd", (short) (OY.Xd() ^ 6543)), Wg.Zd("5\u0010\u0015cM`lU%(", (short) (ZN.Xd() ^ 30800), (short) (ZN.Xd() ^ 27751)));
                }
                getServiceRequest.zzj = account;
                if (iAccountAccessor != null) {
                    getServiceRequest.zzg = iAccountAccessor.asBinder();
                }
            } else if (requiresAccount()) {
                getServiceRequest.zzj = getAccount();
            }
            getServiceRequest.zzk = zze;
            getServiceRequest.zzl = getApiFeatures();
            if (usesClientTelemetry()) {
                getServiceRequest.zzo = true;
            }
            try {
                synchronized (this.zzq) {
                    IGmsServiceBroker iGmsServiceBroker = this.zzr;
                    if (iGmsServiceBroker != null) {
                        iGmsServiceBroker.getService(new zzd(this, this.zzd.get()), getServiceRequest);
                    } else {
                        short sXd = (short) (OY.Xd() ^ 15234);
                        int[] iArr = new int["\u0019@G\u0018B@=GN".length()];
                        QB qb = new QB("\u0019@G\u0018B@=GN");
                        int i4 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd + i4));
                            i4++;
                        }
                        new String(iArr, 0, i4);
                        Wg.vd("\u0007k\u0001\r\u0014\u0006\u0003\u0004S\u0003\u0003}z\u00077\u007f|(y\u007fyx;.dllgsx'j#,\u001f*,+%\"&\u0016\u0018", (short) (OY.Xd() ^ 14094));
                    }
                }
            } catch (DeadObjectException e2) {
                C1561oA.ud("\n/4\u0003+'\"*/", (short) (C1633zX.Xd() ^ (-22641)));
                C1561oA.yd("}|$+\u0004\u0017%*\u0016\u0011\u0014q\u001b\u0019\u0016\u00117s.-5\u0015(63'\"%X \u001c%A;;", (short) (C1607wl.Xd() ^ 16470));
                triggerConnectionSuspended(3);
            } catch (RemoteException e3) {
                Qg.kd("t\u001a\u001fm\u0016\u0012\r\u0015\u001a", (short) (FB.Xd() ^ 23664), (short) (FB.Xd() ^ 10363));
                hg.Vd(" \u001dBG&7CF812\u000e=94-9s,)7\u0015&25' !Z \u001a!#\u001b\u0019", (short) (OY.Xd() ^ 19108), (short) (OY.Xd() ^ 14002));
                onPostInitHandler(8, null, null, this.zzd.get());
            } catch (SecurityException e4) {
                throw e4;
            } catch (RuntimeException e5) {
                Qg.kd("t\u001a\u001fm\u0016\u0012\r\u0015\u001a", (short) (FB.Xd() ^ 23664), (short) (FB.Xd() ^ 10363));
                hg.Vd(" \u001dBG&7CF812\u000e=94-9s,)7\u0015&25' !Z \u001a!#\u001b\u0019", (short) (OY.Xd() ^ 19108), (short) (OY.Xd() ^ 14002));
                onPostInitHandler(8, null, null, this.zzd.get());
            }
        } catch (InvocationTargetException e6) {
            throw e6.getCause();
        }
    }

    protected Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public final T getService() throws DeadObjectException {
        T t2;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new DeadObjectException();
            }
            checkConnected();
            t2 = (T) this.zzs;
            Preconditions.checkNotNull(t2, "Client is connected but service is null");
        }
        return t2;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            IGmsServiceBroker iGmsServiceBroker = this.zzr;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    protected abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    protected abstract String getStartServiceAction();

    protected String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzk zzkVar = this.zzE;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.zzd;
    }

    protected boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z2;
        synchronized (this.zzp) {
            z2 = this.zzv == 4;
        }
        return z2;
    }

    public boolean isConnecting() {
        boolean z2;
        synchronized (this.zzp) {
            int i2 = this.zzv;
            z2 = true;
            if (i2 != 2 && i2 != 3) {
                z2 = false;
            }
        }
        return z2;
    }

    protected void onConnectedLocked(T t2) {
        this.zzh = System.currentTimeMillis();
    }

    protected void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzi = connectionResult.getErrorCode();
        this.zzj = System.currentTimeMillis();
    }

    protected void onConnectionSuspended(int i2) {
        this.zzf = i2;
        this.zzg = System.currentTimeMillis();
    }

    protected void onPostInitHandler(int i2, IBinder iBinder, Bundle bundle, int i3) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i3, -1, new zzf(this, i2, iBinder, bundle)));
    }

    public void onUserSignOut(SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.onSignOutComplete();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(AttributionSourceWrapper attributionSourceWrapper) {
        this.zzB = attributionSourceWrapper;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i2) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i2));
    }

    protected void triggerNotAvailable(ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i2, PendingIntent pendingIntent) {
        Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i2, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    protected final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    protected final void zzl(int i2, Bundle bundle, int i3) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i3, -1, new zzg(this, i2, bundle)));
    }
}
