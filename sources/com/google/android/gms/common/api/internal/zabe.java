package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zabe extends GoogleApiClient implements zabz {
    zabx zab;
    final Map zac;
    Set zad;
    final ClientSettings zae;
    final Map zaf;
    final Api.AbstractClientBuilder zag;
    Set zah;
    final zadc zai;
    private final Lock zaj;
    private final com.google.android.gms.common.internal.zak zak;
    private final int zam;
    private final Context zan;
    private final Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final zabc zas;
    private final GoogleApiAvailability zat;
    private final ListenerHolders zau;
    private final ArrayList zav;
    private Integer zaw;
    private final com.google.android.gms.common.internal.zaj zax;
    private zaca zal = null;
    final Queue zaa = new LinkedList();

    public zabe(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder abstractClientBuilder, Map map, List list, List list2, Map map2, int i2, int i3, ArrayList arrayList) {
        this.zaq = true != ClientLibraryUtils.isPackageSide() ? 120000L : 10000L;
        this.zar = 5000L;
        this.zad = new HashSet();
        this.zau = new ListenerHolders();
        this.zaw = null;
        this.zah = null;
        zaay zaayVar = new zaay(this);
        this.zax = zaayVar;
        this.zan = context;
        this.zaj = lock;
        this.zak = new com.google.android.gms.common.internal.zak(looper, zaayVar);
        this.zao = looper;
        this.zas = new zabc(this, looper);
        this.zat = googleApiAvailability;
        this.zam = i2;
        if (i2 >= 0) {
            this.zaw = Integer.valueOf(i3);
        }
        this.zaf = map;
        this.zac = map2;
        this.zav = arrayList;
        this.zai = new zadc();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.zak.zaf((GoogleApiClient.ConnectionCallbacks) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.zak.zag((GoogleApiClient.OnConnectionFailedListener) it2.next());
        }
        this.zae = clientSettings;
        this.zag = abstractClientBuilder;
    }

    public static int zad(Iterable iterable, boolean z2) {
        Iterator it = iterable.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            Api.Client client = (Api.Client) it.next();
            boolean zRequiresSignIn = client.requiresSignIn();
            i2 = (i2 + (zRequiresSignIn ? 1 : 0)) - (i2 & (zRequiresSignIn ? 1 : 0)) != 1 ? 0 : 1;
            boolean zProvidesSignIn = client.providesSignIn();
            int i4 = (i3 + (zProvidesSignIn ? 1 : 0)) - (i3 & (zProvidesSignIn ? 1 : 0));
            i3 = 1;
            if (i4 != 1) {
                i3 = 0;
            }
        }
        if (i2 != 0) {
            return (i3 == 0 || !z2) ? 1 : 2;
        }
        return 3;
    }

    static String zag(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    static /* bridge */ /* synthetic */ void zai(zabe zabeVar) {
        zabeVar.zaj.lock();
        try {
            if (zabeVar.zap) {
                zabeVar.zan();
            }
        } finally {
            zabeVar.zaj.unlock();
        }
    }

    static /* bridge */ /* synthetic */ void zaj(zabe zabeVar) {
        zabeVar.zaj.lock();
        try {
            if (zabeVar.zak()) {
                zabeVar.zan();
            }
        } finally {
            zabeVar.zaj.unlock();
        }
    }

    private final void zal(int i2) {
        Integer num = this.zaw;
        if (num == null) {
            this.zaw = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            throw new IllegalStateException("Cannot use sign-in mode: " + zag(i2) + ". Mode was already set to " + zag(this.zaw.intValue()));
        }
        if (this.zal != null) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (Api.Client client : this.zac.values()) {
            boolean zRequiresSignIn = client.requiresSignIn();
            i3 = (i3 + (zRequiresSignIn ? 1 : 0)) - (i3 & (zRequiresSignIn ? 1 : 0)) != 1 ? 0 : 1;
            int i5 = (-1) - (((-1) - i4) & ((-1) - (client.providesSignIn() ? 1 : 0)));
            i4 = 1;
            if (i5 != 1) {
                i4 = 0;
            }
        }
        int iIntValue = this.zaw.intValue();
        if (iIntValue == 1) {
            if (i3 == 0) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (i4 != 0) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (iIntValue == 2 && i3 != 0) {
            this.zal = zaaa.zag(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav);
            return;
        }
        this.zal = new zabi(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav, this);
    }

    public final void zam(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z2) {
        Common.zaa.zaa(googleApiClient).setResultCallback(new zabb(this, statusPendingResult, z2, googleApiClient));
    }

    private final void zan() {
        this.zak.zab();
        ((zaca) Preconditions.checkNotNull(this.zal)).zaq();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final ConnectionResult blockingConnect() throws Throwable {
        Looper looperMyLooper = Looper.myLooper();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(EO.Od("E(aIPo\u0011\u0004xj|C6*)E\u0018", (short) (FB.Xd() ^ 11832))).getDeclaredMethod(C1561oA.Qd("\u000b\b\u0016m\u0001\b\fh\u000b\n\n}\n", (short) (FB.Xd() ^ 23633)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Looper looper = (Looper) declaredMethod.invoke(null, objArr);
            boolean z2 = true;
            Preconditions.checkState(looperMyLooper != looper, C1593ug.zd("`kodmlrlIvvwon\u0001-{\u0005\u0004\u00062\u0002\u0004\n6y}9}|\t\n\u0004\u0004@\u0011\u0011C\u0019\u000e\fG}rJ \u0015 \u0014\u0011\u0015", (short) (Od.Xd() ^ (-14390)), (short) (Od.Xd() ^ (-18295))));
            this.zaj.lock();
            try {
                if (this.zam >= 0) {
                    if (this.zaw == null) {
                        z2 = false;
                    }
                    Preconditions.checkState(z2, C1561oA.od("~\u0014\u0011\u0017T\u0010\u0014D\u0011\u0012\u0006\u0006?\u0012\u0006\f\u0011\u0007}8\u007fw\fy3tvu}.\u0001q\u007f*n\u0001wrnglvmy\u001f`v\u001c\\omg$cVbTYV\u001e", (short) (C1633zX.Xd() ^ (-20598))));
                } else {
                    Integer num = this.zaw;
                    if (num == null) {
                        this.zaw = Integer.valueOf(zad(this.zac.values(), false));
                    } else if (num.intValue() == 2) {
                        throw new IllegalStateException(C1561oA.Kd("=\\jkms dcop%hswlutztQ~~\u007fwv\t=?7\u0010\u0002\u007f\n<\u0011\b\u0007\u000fN\f\u0012D\u0013\u0016\f\u000eI\u0014\u001fL!\u0014$P&\"S\b~}\u0006\u0018\u0003\t\u001b\n\r\u0003\u0005 \u0011\u0013\u0018\u000e\u0015\u0015\t\u0015wj\u000f.:;o4AAB:9K\u007f,#\"*<'-?.1')D57<299-9\u0017\u000fY_egYVZ%", (short) (C1580rY.Xd() ^ (-7283))));
                    }
                }
                zal(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
                this.zak.zab();
                return ((zaca) Preconditions.checkNotNull(this.zal)).zab();
            } finally {
                this.zaj.unlock();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long j2, TimeUnit timeUnit) throws Throwable {
        Looper looperMyLooper = Looper.myLooper();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.Zd("zd_\u001b)(\u007fJ)R\u000e\tANpj\u0005", (short) (Od.Xd() ^ (-5700)), (short) (Od.Xd() ^ (-19601)))).getDeclaredMethod(C1561oA.Xd("HGW1FOU4XY[Q_", (short) (FB.Xd() ^ 20816)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Preconditions.checkState(looperMyLooper != ((Looper) declaredMethod.invoke(null, objArr)), Wg.vd("P[_TUTZT9ffgWVh\u0015KTSUyIKQ\u0006IM\tEDPQ33o@8j@5;v-\"qG<G# $", (short) (C1580rY.Xd() ^ (-22294))));
            Preconditions.checkNotNull(timeUnit, Qg.kd("n\u0003\u0006|k\u0004}\b2~\u0006\u0003\u0003-zz~)jl&syon", (short) (C1633zX.Xd() ^ (-30755)), (short) (C1633zX.Xd() ^ (-2751))));
            this.zaj.lock();
            try {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zad(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException(hg.Vd("\u0004!-,,0Z\u001d\u001a$#U\u0017 \"\u0015\u001c\u0019\u001d\u0015o\u001b\u0019\u0018\u000e\u000b\u001bMMC\u001a\n\u0006\u000e>\u0011\u0006\u0003\tF\u0002\u00066\u0003\u0004ww1y\u0003.\u0001q\u007f*}w'YNKQaJN^KL@@YHHK?DB4>\u001f\u00102OYX\u000bMXVUKHX\u000b5*'-=&*:'(\u001c\u001c5$$'\u001b \u001e\u0010\u001auk48<<,')q", (short) (C1607wl.Xd() ^ 21425), (short) (C1607wl.Xd() ^ 24047)));
                }
                zal(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
                this.zak.zab();
                return ((zaca) Preconditions.checkNotNull(this.zal)).zac(j2, timeUnit);
            } finally {
                this.zaj.unlock();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.zaw;
        boolean z2 = true;
        if (num != null && num.intValue() == 2) {
            z2 = false;
        }
        Preconditions.checkState(z2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.zac.containsKey(Common.CLIENT_KEY)) {
            zam(this, statusPendingResult, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            zaaz zaazVar = new zaaz(this, atomicReference, statusPendingResult);
            zaba zabaVar = new zaba(this, statusPendingResult);
            GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.zan);
            builder.addApi(Common.API);
            builder.addConnectionCallbacks(zaazVar);
            builder.addOnConnectionFailedListener(zabaVar);
            builder.setHandler(this.zas);
            GoogleApiClient googleApiClientBuild = builder.build();
            atomicReference.set(googleApiClientBuild);
            googleApiClientBuild.connect();
        }
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        this.zaj.lock();
        try {
            int i2 = 2;
            boolean z2 = false;
            if (this.zam >= 0) {
                Preconditions.checkState(this.zaw != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zad(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int iIntValue = ((Integer) Preconditions.checkNotNull(this.zaw)).intValue();
            this.zaj.lock();
            if (iIntValue != 3 && iIntValue != 1) {
                if (iIntValue != 2) {
                    i2 = iIntValue;
                }
                Preconditions.checkArgument(z2, "Illegal sign-in mode: " + i2);
                zal(i2);
                zan();
                this.zaj.unlock();
            }
            i2 = iIntValue;
            z2 = true;
            Preconditions.checkArgument(z2, "Illegal sign-in mode: " + i2);
            zal(i2);
            zan();
            this.zaj.unlock();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i2) {
        this.zaj.lock();
        boolean z2 = true;
        if (i2 != 3 && i2 != 1) {
            if (i2 == 2) {
                i2 = 2;
            } else {
                z2 = false;
            }
        }
        try {
            Preconditions.checkArgument(z2, "Illegal sign-in mode: " + i2);
            zal(i2);
            zan();
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        this.zaj.lock();
        try {
            this.zai.zab();
            zaca zacaVar = this.zal;
            if (zacaVar != null) {
                zacaVar.zar();
            }
            this.zau.zab();
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : this.zaa) {
                apiMethodImpl.zan(null);
                apiMethodImpl.cancel();
            }
            this.zaa.clear();
            if (this.zal != null) {
                zak();
                this.zak.zaa();
            }
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.zan);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.zap);
        printWriter.append(" mWorkQueue.size()=").print(this.zaa.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zai.zab.size());
        zaca zacaVar = this.zal;
        if (zacaVar != null) {
            zacaVar.zas(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t2) {
        Api<?> api = t2.getApi();
        Preconditions.checkArgument(this.zac.containsKey(t2.getClientKey()), "GoogleApiClient is not configured to use " + (api != null ? api.zad() : "the API") + " required for this call.");
        this.zaj.lock();
        try {
            zaca zacaVar = this.zal;
            if (zacaVar == null) {
                this.zaa.add(t2);
            } else {
                t2 = (T) zacaVar.zae(t2);
            }
            return t2;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t2) {
        Map map = this.zac;
        Api<?> api = t2.getApi();
        Preconditions.checkArgument(map.containsKey(t2.getClientKey()), "GoogleApiClient is not configured to use " + (api != null ? api.zad() : "the API") + " required for this call.");
        this.zaj.lock();
        try {
            zaca zacaVar = this.zal;
            if (zacaVar == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.zap) {
                this.zaa.add(t2);
                while (!this.zaa.isEmpty()) {
                    BaseImplementation.ApiMethodImpl apiMethodImpl = (BaseImplementation.ApiMethodImpl) this.zaa.remove();
                    this.zai.zaa(apiMethodImpl);
                    apiMethodImpl.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                }
            } else {
                t2 = (T) zacaVar.zaf(t2);
            }
            return t2;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <C extends Api.Client> C getClient(Api.AnyClientKey<C> anyClientKey) {
        C c2 = (C) this.zac.get(anyClientKey);
        Preconditions.checkNotNull(c2, "Appropriate Api was not requested.");
        return c2;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult getConnectionResult(Api<?> api) {
        ConnectionResult connectionResult;
        this.zaj.lock();
        try {
            if (!isConnected() && !this.zap) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.zac.containsKey(api.zab())) {
                throw new IllegalArgumentException(api.zad() + " was never registered with GoogleApiClient");
            }
            ConnectionResult connectionResultZad = ((zaca) Preconditions.checkNotNull(this.zal)).zad(api);
            if (connectionResultZad != null) {
                return connectionResultZad;
            }
            if (this.zap) {
                connectionResult = ConnectionResult.RESULT_SUCCESS;
            } else {
                zaf();
                String str = api.zad() + " requested in getConnectionResult is not connected but is not present in the failed  connections map";
                new Exception();
                connectionResult = new ConnectionResult(8, null);
            }
            return connectionResult;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.zan;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.zao;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(Api<?> api) {
        return this.zac.containsKey(api.zab());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(Api<?> api) {
        Api.Client client;
        return isConnected() && (client = (Api.Client) this.zac.get(api.zab())) != null && client.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zaw();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zax();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zak.zaj(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zak.zak(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zay(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        zaca zacaVar = this.zal;
        if (zacaVar != null) {
            zacaVar.zau();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zaf(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zag(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> ListenerHolder<L> registerListener(L l2) {
        this.zaj.lock();
        try {
            return this.zau.zaa(l2, this.zao, "NO_TYPE");
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(FragmentActivity fragmentActivity) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
        if (this.zam < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        zak.zaa(lifecycleActivity).zae(this.zam);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zah(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zai(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        if (!this.zat.isPlayServicesPossiblyUpdating(this.zan, connectionResult.getErrorCode())) {
            zak();
        }
        if (this.zap) {
            return;
        }
        this.zak.zac(connectionResult);
        this.zak.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        while (!this.zaa.isEmpty()) {
            execute((BaseImplementation.ApiMethodImpl) this.zaa.remove());
        }
        this.zak.zad(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i2, boolean z2) throws Throwable {
        if (i2 == 1) {
            if (!z2 && !this.zap) {
                this.zap = true;
                if (this.zab == null && !ClientLibraryUtils.isPackageSide()) {
                    try {
                        GoogleApiAvailability googleApiAvailability = this.zat;
                        Context context = this.zan;
                        short sXd = (short) (Od.Xd() ^ (-11854));
                        int[] iArr = new int["myn{wpj3grpuemr+?jhm]oj".length()];
                        QB qb = new QB("myn{wpj3grpuemr+?jhm]oj");
                        int i3 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
                            i3++;
                        }
                        Class<?> cls = Class.forName(new String(iArr, 0, i3));
                        Object[] objArr = new Object[0];
                        Method method = cls.getMethod(C1561oA.yd("nk}I{zyub_uirpHsej^po", (short) (C1633zX.Xd() ^ (-17038))), new Class[0]);
                        try {
                            method.setAccessible(true);
                            this.zab = googleApiAvailability.zac((Context) method.invoke(context, objArr), new zabd(this));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (SecurityException unused) {
                    }
                }
                zabc zabcVar = this.zas;
                zabcVar.sendMessageDelayed(zabcVar.obtainMessage(1), this.zaq);
                zabc zabcVar2 = this.zas;
                zabcVar2.sendMessageDelayed(zabcVar2.obtainMessage(2), this.zar);
            }
            i2 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.zai.zab.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(zadc.zaa);
        }
        this.zak.zae(i2);
        this.zak.zaa();
        if (i2 == 2) {
            zan();
        }
    }

    final String zaf() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @ResultIgnorabilityUnspecified
    final boolean zak() {
        if (!this.zap) {
            return false;
        }
        this.zap = false;
        this.zas.removeMessages(2);
        this.zas.removeMessages(1);
        zabx zabxVar = this.zab;
        if (zabxVar != null) {
            zabxVar.zab();
            this.zab = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(zada zadaVar) {
        this.zaj.lock();
        try {
            if (this.zah == null) {
                this.zah = new HashSet();
            }
            this.zah.add(zadaVar);
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(zada zadaVar) {
        this.zaj.lock();
        try {
            Set set = this.zah;
            if (set != null && set.remove(zadaVar)) {
                this.zaj.lock();
                Set set2 = this.zah;
                if (set2 == null) {
                    this.zaj.unlock();
                } else {
                    boolean zIsEmpty = set2.isEmpty();
                    this.zaj.unlock();
                    if (zIsEmpty) {
                    }
                }
                zaca zacaVar = this.zal;
                if (zacaVar != null) {
                    zacaVar.zat();
                }
            } else {
                new Exception();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            this.zaj.unlock();
        }
    }
}
