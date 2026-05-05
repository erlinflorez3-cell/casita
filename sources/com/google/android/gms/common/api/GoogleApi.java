package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {
    protected final GoogleApiManager zaa;
    private final Context zab;
    private final String zac;
    private final Api zad;
    private final Api.ApiOptions zae;
    private final ApiKey zaf;
    private final Looper zag;
    private final int zah;

    @NotOnlyInitialized
    private final GoogleApiClient zai;
    private final StatusExceptionMapper zaj;

    public static class Settings {
        public static final Settings DEFAULT_SETTINGS = new Builder().build();
        public final StatusExceptionMapper zaa;
        public final Looper zab;

        public static class Builder {
            private StatusExceptionMapper zaa;
            private Looper zab;

            public Settings build() throws Throwable {
                if (this.zaa == null) {
                    this.zaa = new ApiExceptionMapper();
                }
                if (this.zab == null) {
                    Object[] objArr = new Object[0];
                    Method declaredMethod = Class.forName(C1561oA.ud("&2'40)#k,/h\u0006(''\u001b'", (short) (C1499aX.Xd() ^ (-12090)))).getDeclaredMethod(C1561oA.yd("\u000e\u000b\u001dt\f\u0013\u001bw\u001e\u001d!\u0015%", (short) (ZN.Xd() ^ 24337)), new Class[0]);
                    try {
                        declaredMethod.setAccessible(true);
                        this.zab = (Looper) declaredMethod.invoke(null, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                return new Settings(this.zaa, this.zab);
            }

            public Builder setLooper(Looper looper) {
                Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.zab = looper;
                return this;
            }

            public Builder setMapper(StatusExceptionMapper statusExceptionMapper) {
                Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.zaa = statusExceptionMapper;
                return this;
            }
        }

        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.zaa = statusExceptionMapper;
            this.zab = looper;
        }

        /* synthetic */ Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper, zae zaeVar) {
            this(statusExceptionMapper, null, looper);
        }
    }

    public GoogleApi(Activity activity, Api<O> api, O o2, Settings settings) {
        this(activity, activity, api, o2, settings);
    }

    @Deprecated
    public GoogleApi(Activity activity, Api<O> api, O o2, StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setMapper(statusExceptionMapper);
        builder.setLooper(activity.getMainLooper());
        this(activity, (Api) api, (Api.ApiOptions) o2, builder.build());
    }

    private GoogleApi(Context context, Activity activity, Api api, Api.ApiOptions apiOptions, Settings settings) throws Throwable {
        String apiFallbackAttributionTag;
        short sXd = (short) (C1499aX.Xd() ^ (-4613));
        int[] iArr = new int["Kqgf\u0019[fdiYkf\u0011Yb\u000e[[_\nYMYSNXWGE\u000e".length()];
        QB qb = new QB("Kqgf\u0019[fdiYkf\u0011Yb\u000e[[_\nYMYSNXWGE\u000e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Preconditions.checkNotNull(context, new String(iArr, 0, i2));
        Preconditions.checkNotNull(api, C1561oA.yd("Lzv,|\u0004\u0005\u0005#ptx'hn(ioih-", (short) (ZN.Xd() ^ 30345)));
        Preconditions.checkNotNull(settings, C1561oA.Yd("{\u000f\u001f \u0016\u001c\u0016#P\u001f(')U%'-Y\u001d!\\,4,-|b98+f\u001b.>?5;5B}\u0015\u0017\u0019\u0015*\"+7,\u001f/0&,&3\u0001KQWYKHL\u0017", (short) (Od.Xd() ^ (-4418))));
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("\u0007\u0015\f\u001b\u0019\u0014\u0010Z\u0011\u001e\u001e%\u0017!(bx&&-\u001f30", (short) (OY.Xd() ^ 13269), (short) (OY.Xd() ^ 31296))).getMethod(Jg.Wd("THte2*c$\u001c\u000fB\rNc\u0017iD_Nh#", (short) (Od.Xd() ^ (-8319)), (short) (Od.Xd() ^ (-30669))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            short sXd2 = (short) (C1633zX.Xd() ^ (-10618));
            short sXd3 = (short) (C1633zX.Xd() ^ (-30153));
            int[] iArr2 = new int["=AnnN\u0005\u0001mqM\u000eQ_{UUkYF.\t@,L\u000f`\u0001V\u00172tDrk\u0005.%'6\u0007c\"~w\u001ec$rv\u007f\u001c\u001fO9n\u000eD".length()];
            QB qb2 = new QB("=AnnN\u0005\u0001mqM\u000eQ_{UUkYF.\t@,L\u000f`\u0001V\u00172tDrk\u0005.%'6\u0007c\"~w\u001ec$rv\u007f\u001c\u001fO9n\u000eD");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                i3++;
            }
            Context context3 = (Context) Preconditions.checkNotNull(context2, new String(iArr2, 0, i3));
            this.zab = context3;
            if (Build.VERSION.SDK_INT < 30 || context == null) {
                apiFallbackAttributionTag = context != null ? getApiFallbackAttributionTag(context) : null;
            } else {
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1626yg.Ud("(*sE\u0019@\u0001=|K Pc.y,\"MB\u0003N\u0003|", (short) (Od.Xd() ^ (-5234)), (short) (Od.Xd() ^ (-25111)))).getMethod(Ig.wd("\u001aG\u0015x|(\u0012h\u001fMVe\u001d\u001a0V\b", (short) (OY.Xd() ^ 12630)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    apiFallbackAttributionTag = (String) method2.invoke(context, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            this.zac = apiFallbackAttributionTag;
            this.zad = api;
            this.zae = apiOptions;
            this.zag = settings.zab;
            ApiKey sharedApiKey = ApiKey.getSharedApiKey(api, apiOptions, apiFallbackAttributionTag);
            this.zaf = sharedApiKey;
            this.zai = new zabv(this);
            GoogleApiManager googleApiManagerZak = GoogleApiManager.zak(context3);
            this.zaa = googleApiManagerZak;
            this.zah = googleApiManagerZak.zaa();
            this.zaj = settings.zaa;
            if (activity != null && !(activity instanceof GoogleApiActivity)) {
                Looper looperMyLooper = Looper.myLooper();
                Object[] objArr3 = new Object[0];
                Method declaredMethod = Class.forName(EO.Od("w4\f\u0003 ^}WkD\u0015\u0019j\\}Y\u000b", (short) (C1499aX.Xd() ^ (-28657)))).getDeclaredMethod(C1561oA.Qd("?<J\"5<@\u001d?>>2>", (short) (C1580rY.Xd() ^ (-15262))), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr3))) {
                        zaae.zad(activity, googleApiManagerZak, sharedApiKey);
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            googleApiManagerZak.zaz(this);
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Deprecated
    public GoogleApi(Context context, Api<O> api, O o2, Looper looper, StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setLooper(looper);
        builder.setMapper(statusExceptionMapper);
        this(context, api, o2, builder.build());
    }

    public GoogleApi(Context context, Api<O> api, O o2, Settings settings) {
        this(context, (Activity) null, api, o2, settings);
    }

    @Deprecated
    public GoogleApi(Context context, Api<O> api, O o2, StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setMapper(statusExceptionMapper);
        this(context, api, o2, builder.build());
    }

    private final BaseImplementation.ApiMethodImpl zad(int i2, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        this.zaa.zau(this, i2, apiMethodImpl);
        return apiMethodImpl;
    }

    private final Task zae(int i2, TaskApiCall taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.zav(this, i2, taskApiCall, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    public GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    protected ClientSettings.Builder createClientSettingsBuilder() throws Throwable {
        Account account;
        GoogleSignInAccount googleSignInAccount;
        GoogleSignInAccount googleSignInAccount2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        Api.ApiOptions apiOptions = this.zae;
        if (!(apiOptions instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).getGoogleSignInAccount()) == null) {
            Api.ApiOptions apiOptions2 = this.zae;
            account = apiOptions2 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) apiOptions2).getAccount() : null;
        } else {
            account = googleSignInAccount2.getAccount();
        }
        builder.zab(account);
        Api.ApiOptions apiOptions3 = this.zae;
        Set<Scope> setEmptySet = (!(apiOptions3 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions3).getGoogleSignInAccount()) == null) ? Collections.emptySet() : googleSignInAccount.getRequestedScopes();
        builder.zaa(setEmptySet);
        builder.zac(this.zab.getClass().getName());
        Context context = this.zab;
        short sXd = (short) (C1633zX.Xd() ^ (-11210));
        short sXd2 = (short) (C1633zX.Xd() ^ (-27629));
        int[] iArr = new int["w\u0006|\f\n\u0005\u0001K\u0002\u000f\u000f\u0016\b\u0012\u0019Si\u0017\u0017\u001e\u0010$!".length()];
        QB qb = new QB("w\u0006|\f\n\u0005\u0001K\u0002\u000f\u000f\u0016\b\u0012\u0019Si\u0017\u0017\u001e\u0010$!");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("\u0010\r\u001bu\u0006\u0007\u000e\u0003\b\u0005l~\n\u0001", (short) (C1580rY.Xd() ^ (-14993))), new Class[0]);
        try {
            method.setAccessible(true);
            builder.setRealClientPackageName((String) method.invoke(context, objArr));
            return builder;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected Task<Boolean> disconnectService() {
        return this.zaa.zan(this);
    }

    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(T t2) {
        zad(2, t2);
        return t2;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends Api.AnyClient> Task<TResult> doBestEffortWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zae(2, taskApiCall);
    }

    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(T t2) {
        zad(0, t2);
        return t2;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends Api.AnyClient> Task<TResult> doRead(TaskApiCall<A, TResult> taskApiCall) {
        return zae(0, taskApiCall);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(T t2, U u2) {
        Preconditions.checkNotNull(t2);
        Preconditions.checkNotNull(u2);
        Preconditions.checkNotNull(t2.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(u2.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(Objects.equal(t2.getListenerKey(), u2.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.zao(this, t2, u2, new Runnable() { // from class: com.google.android.gms.common.api.zad
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @ResultIgnorabilityUnspecified
    public <A extends Api.AnyClient> Task<Void> doRegisterEventListener(RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.checkNotNull(registrationMethods);
        Preconditions.checkNotNull(registrationMethods.register.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(registrationMethods.zaa.getListenerKey(), "Listener has already been released.");
        return this.zaa.zao(this, registrationMethods.register, registrationMethods.zaa, registrationMethods.zab);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(ListenerHolder.ListenerKey<?> listenerKey) {
        return doUnregisterEventListener(listenerKey, 0);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(ListenerHolder.ListenerKey<?> listenerKey, int i2) {
        Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.zaa.zap(this, listenerKey, i2);
    }

    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(T t2) {
        zad(1, t2);
        return t2;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends Api.AnyClient> Task<TResult> doWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zae(1, taskApiCall);
    }

    protected String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    public final ApiKey<O> getApiKey() {
        return this.zaf;
    }

    public O getApiOptions() {
        return (O) this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    protected String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    protected String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> ListenerHolder<L> registerListener(L l2, String str) {
        return ListenerHolders.createListenerHolder(l2, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Api.Client zab(Looper looper, zabq zabqVar) {
        ClientSettings clientSettingsBuild = createClientSettingsBuilder().build();
        Api.Client clientBuildClient = ((Api.AbstractClientBuilder) Preconditions.checkNotNull(this.zad.zaa())).buildClient(this.zab, looper, clientSettingsBuild, this.zae, (GoogleApiClient.ConnectionCallbacks) zabqVar, (GoogleApiClient.OnConnectionFailedListener) zabqVar);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (clientBuildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (clientBuildClient instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) clientBuildClient).zac(contextAttributionTag);
        }
        return clientBuildClient;
    }

    public final zact zac(Context context, Handler handler) {
        return new zact(context, handler, createClientSettingsBuilder().build());
    }
}
