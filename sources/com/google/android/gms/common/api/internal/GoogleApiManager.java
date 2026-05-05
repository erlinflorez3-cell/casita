package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.collection.ArraySet;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
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
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public class GoogleApiManager implements Handler.Callback {
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status zab = new Status(4, "The user must be signed in to make this API call.");
    private static final Object zac = new Object();
    private static GoogleApiManager zad = null;
    private TelemetryData zag;
    private TelemetryLoggingClient zah;
    private final Context zai;
    private final GoogleApiAvailability zaj;
    private final com.google.android.gms.common.internal.zal zak;

    @NotOnlyInitialized
    private final Handler zar;
    private volatile boolean zas;
    private long zae = 10000;
    private boolean zaf = false;
    private final AtomicInteger zal = new AtomicInteger(1);
    private final AtomicInteger zam = new AtomicInteger(0);
    private final Map zan = new ConcurrentHashMap(5, 0.75f, 1);
    private zaae zao = null;
    private final Set zap = new ArraySet();
    private final Set zaq = new ArraySet();

    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zas = true;
        this.zai = context;
        com.google.android.gms.internal.base.zau zauVar = new com.google.android.gms.internal.base.zau(looper, this);
        this.zar = zauVar;
        this.zaj = googleApiAvailability;
        this.zak = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.zas = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void reportSignOut() {
        synchronized (zac) {
            GoogleApiManager googleApiManager = zad;
            if (googleApiManager != null) {
                googleApiManager.zam.incrementAndGet();
                Handler handler = googleApiManager.zar;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    public static Status zaF(ApiKey apiKey, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + apiKey.zaa() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    @ResultIgnorabilityUnspecified
    private final zabq zaG(GoogleApi googleApi) {
        Map map = this.zan;
        ApiKey apiKey = googleApi.getApiKey();
        zabq zabqVar = (zabq) map.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new zabq(this, googleApi);
            this.zan.put(apiKey, zabqVar);
        }
        if (zabqVar.zaA()) {
            this.zaq.add(apiKey);
        }
        zabqVar.zao();
        return zabqVar;
    }

    private final TelemetryLoggingClient zaH() {
        if (this.zah == null) {
            this.zah = TelemetryLogging.getClient(this.zai);
        }
        return this.zah;
    }

    private final void zaI() {
        TelemetryData telemetryData = this.zag;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zaD()) {
                zaH().log(telemetryData);
            }
            this.zag = null;
        }
    }

    private final void zaJ(TaskCompletionSource taskCompletionSource, int i2, GoogleApi googleApi) {
        zacd zacdVarZaa;
        if (i2 == 0 || (zacdVarZaa = zacd.zaa(this, i2, googleApi.getApiKey())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        final Handler handler = this.zar;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.zabk
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) throws Throwable {
                Handler handler2 = handler;
                Class<?> cls = Class.forName(C1561oA.Yd("\u007f\u000e\u0005\u0014\u0012\r\tS\u0016\u001bVq\f\u001a\u0011\u001a\u0014\"", (short) (C1633zX.Xd() ^ (-117))));
                Class<?>[] clsArr = {Class.forName(Xg.qd("?7M9\u0007F<JD\f1UOPDFQK", (short) (C1633zX.Xd() ^ (-16115)), (short) (C1633zX.Xd() ^ (-8363))))};
                Object[] objArr = {runnable};
                short sXd = (short) (Od.Xd() ^ (-3439));
                short sXd2 = (short) (Od.Xd() ^ (-30389));
                int[] iArr = new int["\u0004C'v".length()];
                QB qb = new QB("\u0004C'v");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler2, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }, zacdVarZaa);
    }

    public static GoogleApiManager zaj() {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            Preconditions.checkNotNull(zad, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @ResultIgnorabilityUnspecified
    public static GoogleApiManager zak(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            if (zad == null) {
                Looper looper = GmsClientSupervisor.getOrStartHandlerThread().getLooper();
                short sXd = (short) (FB.Xd() ^ 2406);
                short sXd2 = (short) (FB.Xd() ^ 10743);
                int[] iArr = new int["\u0005A\u001dr5}VO\u0003^B\u0014F\u0003bn|~]0D!\u0001".length()];
                QB qb = new QB("\u0005A\u001dr5}VO\u0003^B\u0014F\u0003bn|~]0D!\u0001");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd3 = (short) (C1607wl.Xd() ^ 6949);
                short sXd4 = (short) (C1607wl.Xd() ^ 4744);
                int[] iArr2 = new int["x|MOPQjQ*-x}ew,\u001a\u0016}R\u0016H".length()];
                QB qb2 = new QB("x|MOPQjQ*-x}ew,\u001a\u0016}R\u0016H");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    zad = new GoogleApiManager((Context) method.invoke(context, objArr), looper, GoogleApiAvailability.getInstance());
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i2 = message.what;
        long j2 = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        C1626yg.Ud("pT0\u0018x%\u0018oA+7J\u0010\u0017\u0001&", (short) (OY.Xd() ^ 11656), (short) (OY.Xd() ^ 5164));
        zabq zabqVar = null;
        switch (i2) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.zae = j2;
                this.zar.removeMessages(12);
                for (ApiKey apiKey : this.zan.keySet()) {
                    Handler handler = this.zar;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey), this.zae);
                }
                return true;
            case 2:
                zal zalVar = (zal) message.obj;
                Iterator it = zalVar.zab().iterator();
                while (true) {
                    if (it.hasNext()) {
                        ApiKey apiKey2 = (ApiKey) it.next();
                        zabq zabqVar2 = (zabq) this.zan.get(apiKey2);
                        if (zabqVar2 == null) {
                            zalVar.zac(apiKey2, new ConnectionResult(13), null);
                        } else if (zabqVar2.zaz()) {
                            zalVar.zac(apiKey2, ConnectionResult.RESULT_SUCCESS, zabqVar2.zaf().getEndpointPackageName());
                        } else {
                            ConnectionResult connectionResultZad = zabqVar2.zad();
                            if (connectionResultZad != null) {
                                zalVar.zac(apiKey2, connectionResultZad, null);
                            } else {
                                zabqVar2.zat(zalVar);
                                zabqVar2.zao();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (zabq zabqVar3 : this.zan.values()) {
                    zabqVar3.zan();
                    zabqVar3.zao();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zach zachVar = (zach) message.obj;
                zabq zabqVarZaG = (zabq) this.zan.get(zachVar.zac.getApiKey());
                if (zabqVarZaG == null) {
                    zabqVarZaG = zaG(zachVar.zac);
                }
                if (!zabqVarZaG.zaA() || this.zam.get() == zachVar.zab) {
                    zabqVarZaG.zap(zachVar.zaa);
                } else {
                    zachVar.zaa.zad(zaa);
                    zabqVarZaG.zav();
                }
                return true;
            case 5:
                int i3 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.zan.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zabq zabqVar4 = (zabq) it2.next();
                        if (zabqVar4.zab() == i3) {
                            zabqVar = zabqVar4;
                        }
                    }
                }
                if (zabqVar == null) {
                    short sXd = (short) (C1633zX.Xd() ^ (-6401));
                    int[] iArr = new int["s!( \u0019U%'-Y!%+\"^\u0001\u0011\u000bb-39;)7-0k".length()];
                    QB qb = new QB("s!( \u0019U%'-Y!%+\"^\u0001\u0011\u000bb-39;)7-0k");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd + i4));
                        i4++;
                    }
                    String str = new String(iArr, 0, i4) + i3 + Wg.vd("6\u000f\u0001\u0003\u0007\u0001<\u0012\u0001\ty\u007fy3\t\u0005&mirv+q{otevgg$h\u0018$%-h", (short) (ZN.Xd() ^ 32279));
                    new Exception();
                } else if (connectionResult.getErrorCode() == 13) {
                    zabqVar.zaE(new Status(17, C1561oA.Kd("P~\u007f}\u00020\u0004w\u0007\u0004\u0002\f\f\u0002\t\t;\u0014~\u0012?\u0004\u0003\u0011\u0007\n\u0012\f\fH\f$K!\u0016\u0014O&%\u0018&`U&*\"!$*\u001e*^%3426d3,;<+21\u0007m", (short) (C1580rY.Xd() ^ (-29854))) + this.zaj.getErrorString(connectionResult.getErrorCode()) + Wg.Zd("(R", (short) (C1633zX.Xd() ^ (-28107)), (short) (C1633zX.Xd() ^ (-30430))) + connectionResult.getErrorMessage()));
                } else {
                    zabqVar.zaE(zaF(zabqVar.zad, connectionResult));
                }
                return true;
            case 6:
                Context context = this.zai;
                Object[] objArr = new Object[0];
                Method method = Class.forName(EO.Od("}=a\u0010\rc2TXha\nE\\>\u001ak&]k\u001bVl", (short) (FB.Xd() ^ 4291))).getMethod(C1561oA.Qd("IFT NMHD=:L@EC\u0017B@E5GB", (short) (C1633zX.Xd() ^ (-12905))), new Class[0]);
                try {
                    method.setAccessible(true);
                    if (((Context) method.invoke(context, objArr)) instanceof Application) {
                        Context context2 = this.zai;
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(C1593ug.zd("UcZigb^)_llseov1Gtt{m\u0002~", (short) (ZN.Xd() ^ 9340), (short) (ZN.Xd() ^ 21160))).getMethod(C1561oA.od("\u0004\u0001\u000fZ\t\b\u0003~wt\u0007z\u007f}Q|z\u007fo\u0002|", (short) (C1499aX.Xd() ^ (-2312))), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            BackgroundDetector.initialize((Application) ((Context) method2.invoke(context2, objArr2)));
                            BackgroundDetector.getInstance().addListener(new zabl(this));
                            if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                                this.zae = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    return true;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            case 7:
                zaG((GoogleApi) message.obj);
                return true;
            case 9:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zau();
                }
                return true;
            case 10:
                Iterator it3 = this.zaq.iterator();
                while (it3.hasNext()) {
                    zabq zabqVar5 = (zabq) this.zan.remove((ApiKey) it3.next());
                    if (zabqVar5 != null) {
                        zabqVar5.zav();
                    }
                }
                this.zaq.clear();
                return true;
            case 11:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zaw();
                }
                return true;
            case 12:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zaB();
                }
                return true;
            case 14:
                zaaf zaafVar = (zaaf) message.obj;
                ApiKey apiKeyZaa = zaafVar.zaa();
                if (this.zan.containsKey(apiKeyZaa)) {
                    zaafVar.zab().setResult(Boolean.valueOf(((zabq) this.zan.get(apiKeyZaa)).zaO(false)));
                } else {
                    zaafVar.zab().setResult(false);
                }
                return true;
            case 15:
                zabs zabsVar = (zabs) message.obj;
                if (this.zan.containsKey(zabsVar.zaa)) {
                    zabq.zal((zabq) this.zan.get(zabsVar.zaa), zabsVar);
                }
                return true;
            case 16:
                zabs zabsVar2 = (zabs) message.obj;
                if (this.zan.containsKey(zabsVar2.zaa)) {
                    zabq.zam((zabq) this.zan.get(zabsVar2.zaa), zabsVar2);
                }
                return true;
            case 17:
                zaI();
                return true;
            case 18:
                zace zaceVar = (zace) message.obj;
                if (zaceVar.zac == 0) {
                    zaH().log(new TelemetryData(zaceVar.zab, Arrays.asList(zaceVar.zaa)));
                } else {
                    TelemetryData telemetryData = this.zag;
                    if (telemetryData != null) {
                        List listZab = telemetryData.zab();
                        if (telemetryData.zaa() != zaceVar.zab || (listZab != null && listZab.size() >= zaceVar.zad)) {
                            this.zar.removeMessages(17);
                            zaI();
                        } else {
                            this.zag.zac(zaceVar.zaa);
                        }
                    }
                    if (this.zag == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zaceVar.zaa);
                        this.zag = new TelemetryData(zaceVar.zab, arrayList);
                        Handler handler2 = this.zar;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zaceVar.zac);
                    }
                }
                return true;
            case 19:
                this.zaf = false;
                return true;
            default:
                String str2 = Ig.wd("5\u001fiQQ\f\u001bt\u0013O_={\b\u0006+;\u001cJ4", (short) (FB.Xd() ^ 13722)) + message.what;
                return false;
        }
    }

    public final void zaA(zaae zaaeVar) {
        synchronized (zac) {
            if (this.zao != zaaeVar) {
                this.zao = zaaeVar;
                this.zap.clear();
            }
            this.zap.addAll(zaaeVar.zaa());
        }
    }

    final void zaB(zaae zaaeVar) {
        synchronized (zac) {
            if (this.zao == zaaeVar) {
                this.zao = null;
                this.zap.clear();
            }
        }
    }

    final boolean zaD() {
        if (this.zaf) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int iZaa = this.zak.zaa(this.zai, 203400000);
        return iZaa == -1 || iZaa == 0;
    }

    @ResultIgnorabilityUnspecified
    final boolean zaE(ConnectionResult connectionResult, int i2) throws Throwable {
        return this.zaj.zah(this.zai, connectionResult, i2);
    }

    public final int zaa() {
        return this.zal.getAndIncrement();
    }

    final zabq zai(ApiKey apiKey) {
        return (zabq) this.zan.get(apiKey);
    }

    public final Task zam(Iterable iterable) {
        zal zalVar = new zal(iterable);
        this.zar.sendMessage(this.zar.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    @ResultIgnorabilityUnspecified
    public final Task zan(GoogleApi googleApi) {
        zaaf zaafVar = new zaaf(googleApi.getApiKey());
        this.zar.sendMessage(this.zar.obtainMessage(14, zaafVar));
        return zaafVar.zab().getTask();
    }

    public final Task zao(GoogleApi googleApi, RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaJ(taskCompletionSource, registerListenerMethod.zaa(), googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(8, new zach(new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource), this.zam.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final Task zap(GoogleApi googleApi, ListenerHolder.ListenerKey listenerKey, int i2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaJ(taskCompletionSource, i2, googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(13, new zach(new zah(listenerKey, taskCompletionSource), this.zam.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final void zau(GoogleApi googleApi, int i2, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.zar.sendMessage(this.zar.obtainMessage(4, new zach(new zae(i2, apiMethodImpl), this.zam.get(), googleApi)));
    }

    public final void zav(GoogleApi googleApi, int i2, TaskApiCall taskApiCall, TaskCompletionSource taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        zaJ(taskCompletionSource, taskApiCall.zaa(), googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(4, new zach(new zag(i2, taskApiCall, taskCompletionSource, statusExceptionMapper), this.zam.get(), googleApi)));
    }

    final void zaw(MethodInvocation methodInvocation, int i2, long j2, int i3) {
        this.zar.sendMessage(this.zar.obtainMessage(18, new zace(methodInvocation, i2, j2, i3)));
    }

    public final void zax(ConnectionResult connectionResult, int i2) {
        if (zaE(connectionResult, i2)) {
            return;
        }
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(5, i2, 0, connectionResult));
    }

    public final void zay() {
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaz(GoogleApi googleApi) {
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }
}
