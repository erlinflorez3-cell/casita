package androidx.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.tracing.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
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
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ContextAware, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, MenuHost, FullyDrawnReporterOwner {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final ContextAwareHelper mContextAwareHelper;
    private ViewModelProvider.Factory mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final FullyDrawnReporter mFullyDrawnReporter;
    private final LifecycleRegistry mLifecycleRegistry;
    private final MenuHostHelper mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<Consumer<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<Consumer<MultiWindowModeChangedInfo>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<Consumer<PictureInPictureModeChangedInfo>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Integer>> mOnTrimMemoryListeners;
    final ReportFullyDrawnExecutor mReportFullyDrawnExecutor;
    final SavedStateRegistryController mSavedStateRegistryController;
    private ViewModelStore mViewModelStore;

    private interface ReportFullyDrawnExecutor extends Executor {
        void activityDestroyed();

        void viewCreated(View view);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    static final class NonConfigurationInstances {
        Object custom;
        ViewModelStore viewModelStore;

        NonConfigurationInstances() {
        }
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-activity-ComponentActivity */
    /* synthetic */ Unit m21lambda$new$0$androidxactivityComponentActivity() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$1 */
    class AnonymousClass1 extends ActivityResultRegistry {
        AnonymousClass1() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void onLaunch(int i2, ActivityResultContract<I, O> activityResultContract, I i3, ActivityOptionsCompat activityOptionsCompat) throws Throwable {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            ActivityResultContract.SynchronousResult<O> synchronousResult = activityResultContract.getSynchronousResult(componentActivity, i3);
            if (synchronousResult != null) {
                Object[] objArr = new Object[0];
                Method declaredMethod = Class.forName(C1561oA.Kd("3A8GE@<\u0007IN\n)MNPFT", (short) (Od.Xd() ^ (-704)))).getDeclaredMethod(Wg.Zd("R\u0006%/RN#s'xh32", (short) (C1499aX.Xd() ^ (-13923)), (short) (C1499aX.Xd() ^ (-3339))), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                    RunnableC00001 runnableC00001 = new Runnable() { // from class: androidx.activity.ComponentActivity.1.1
                        final /* synthetic */ int val$requestCode;
                        final /* synthetic */ ActivityResultContract.SynchronousResult val$synchronousResult;

                        RunnableC00001(int i22, ActivityResultContract.SynchronousResult synchronousResult2) {
                            i = i22;
                            synchronousResult = synchronousResult2;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1.this.dispatchResult(i, synchronousResult.getValue());
                        }
                    };
                    Class<?> cls = Class.forName(C1561oA.Xd("\u001d+\"1/*&p38s\u000f)7.71?", (short) (ZN.Xd() ^ 6040)));
                    Class<?>[] clsArr = new Class[1];
                    short sXd = (short) (C1607wl.Xd() ^ 18892);
                    int[] iArr = new int["\u001f\u0015-\u0017f$\u001c(\u0014Y\u0001#\u001f\u001e\u0014\u00141)".length()];
                    QB qb = new QB("\u001f\u0015-\u0017f$\u001c(\u0014Y\u0001#\u001f\u001e\u0014\u00141)");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK((sXd ^ i4) + xuXd.CK(iKK));
                        i4++;
                    }
                    clsArr[0] = Class.forName(new String(iArr, 0, i4));
                    Object[] objArr2 = {runnableC00001};
                    Method method = cls.getMethod(Qg.kd("PNQQ", (short) (OY.Xd() ^ 25809), (short) (OY.Xd() ^ 26490)), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr2);
                        return;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            Intent intentCreateIntent = activityResultContract.createIntent(componentActivity, i3);
            if (intentCreateIntent.getExtras() != null && intentCreateIntent.getExtras().getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            String strVd = hg.Vd("'3(51*$7k\u001e\u001f/#/!+/b&\u0018%&\u001c#[\u0010\u001b\u0019\u001e\u001b\t\n\u001aR\t\u001b\u0016\u0013\u0001L^_ocoakotccfZ_]alN`XMTL", (short) (C1580rY.Xd() ^ (-29717)), (short) (C1580rY.Xd() ^ (-16734)));
            if (intentCreateIntent.hasExtra(strVd)) {
                bundle = intentCreateIntent.getBundleExtra(strVd);
                intentCreateIntent.removeExtra(strVd);
            } else {
                bundle = activityOptionsCompat != null ? activityOptionsCompat.toBundle() : null;
            }
            if (C1561oA.ud("{\b|\n\u0006~x\f@rs\u0004w\u0004u\u007f\u00047zlyzpw0domro]^n'YZj^ca C5@C2??I9-93.76+0.2", (short) (C1607wl.Xd() ^ 32464)).equals(intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra(C1561oA.yd("KWLYUNH[ RScWcU_s'j\\ij`g0domro]^>v-?:7%p\"\u0016\"\u001c\u0017 \u001f\u0014)'+", (short) (C1633zX.Xd() ^ (-1172))));
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                ActivityCompat.requestPermissions(componentActivity, stringArrayExtra, i22);
                return;
            }
            short sXd2 = (short) (FB.Xd() ^ 5646);
            int[] iArr2 = new int["u\u0004z\n\b\u0003~\u0014J~\u0002\u0014\n\u0018\f\u0018\u001eS\u0019\r\u001c\u001f\u0017 Z\u0011\u001e\u001e%$\u0014\u0017)c\u0018\u001b-#**j\u0007\r\u0014\u0006\u0010\u0017#\u0018\u000b\u0015\f\u000e\u001c*\u001e\u0012\u001f$\u0015$&".length()];
            QB qb2 = new QB("u\u0004z\n\b\u0003~\u0014J~\u0002\u0014\n\u0018\f\u0018\u001eS\u0019\r\u001c\u001f\u0017 Z\u0011\u001e\u001e%$\u0014\u0017)c\u0018\u001b-#**j\u0007\r\u0014\u0006\u0010\u0017#\u0018\u000b\u0015\f\u000e\u001c*\u001e\u0012\u001f$\u0015$&");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i5));
                i5++;
            }
            if (!new String(iArr2, 0, i5).equals(intentCreateIntent.getAction())) {
                ActivityCompat.startActivityForResult(componentActivity, intentCreateIntent, i22, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra(Xg.qd("5C:IGB>S\n>ASIWKW]\u0013XL[^V_\u001aP]]dcSVh#[olk[)EKRDNUaVISJLZh\\P]bSbd", (short) (C1607wl.Xd() ^ 13951), (short) (C1607wl.Xd() ^ 15254)));
            try {
                ActivityCompat.startIntentSenderForResult(componentActivity, intentSenderRequest.getIntentSender(), i22, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
            } catch (IntentSender.SendIntentException e4) {
                Object[] objArr3 = new Object[0];
                Method declaredMethod2 = Class.forName(Jg.Wd("RKl'NzA6#]C-s&QrK", (short) (C1580rY.Xd() ^ (-17875)), (short) (C1580rY.Xd() ^ (-7118)))).getDeclaredMethod(ZO.xd("e+\t&a\u0018rqTI\bJ@", (short) (ZN.Xd() ^ 23236), (short) (ZN.Xd() ^ 28710)), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    Handler handler2 = new Handler((Looper) declaredMethod2.invoke(null, objArr3));
                    AnonymousClass2 anonymousClass2 = new Runnable() { // from class: androidx.activity.ComponentActivity.1.2
                        final /* synthetic */ IntentSender.SendIntentException val$e;
                        final /* synthetic */ int val$requestCode;

                        AnonymousClass2(int i22, IntentSender.SendIntentException e42) {
                            i = i22;
                            sendIntentException = e42;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1.this.dispatchResult(i, 0, new Intent().setAction(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION, sendIntentException));
                        }
                    };
                    Class<?> cls2 = Class.forName(C1626yg.Ud("m\u000bX\"\u000e\u0001J4J?\u001b19cH\u007f i", (short) (C1633zX.Xd() ^ (-5284)), (short) (C1633zX.Xd() ^ (-1901))));
                    Class<?>[] clsArr2 = {Class.forName(Ig.wd("H\u00105=\b\u0002HKmu\u0016]\f\u0014t\u0019vo", (short) (FB.Xd() ^ 9079)))};
                    Object[] objArr4 = {anonymousClass2};
                    short sXd3 = (short) (ZN.Xd() ^ 6863);
                    int[] iArr3 = new int["`/v[".length()];
                    QB qb3 = new QB("`/v[");
                    int i6 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i6] = xuXd3.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i6)) + xuXd3.CK(iKK3));
                        i6++;
                    }
                    Method method2 = cls2.getMethod(new String(iArr3, 0, i6), clsArr2);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(handler2, objArr4);
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$1$1 */
        /* JADX INFO: loaded from: classes2.dex */
        class RunnableC00001 implements Runnable {
            final /* synthetic */ int val$requestCode;
            final /* synthetic */ ActivityResultContract.SynchronousResult val$synchronousResult;

            RunnableC00001(int i22, ActivityResultContract.SynchronousResult synchronousResult2) {
                i = i22;
                synchronousResult = synchronousResult2;
            }

            @Override // java.lang.Runnable
            public void run() {
                AnonymousClass1.this.dispatchResult(i, synchronousResult.getValue());
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$1$2 */
        class AnonymousClass2 implements Runnable {
            final /* synthetic */ IntentSender.SendIntentException val$e;
            final /* synthetic */ int val$requestCode;

            AnonymousClass2(int i22, IntentSender.SendIntentException e42) {
                i = i22;
                sendIntentException = e42;
            }

            @Override // java.lang.Runnable
            public void run() {
                AnonymousClass1.this.dispatchResult(i, 0, new Intent().setAction(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION, sendIntentException));
            }
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new ContextAwareHelper();
        this.mMenuHostHelper = new MenuHostHelper(new Runnable() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        SavedStateRegistryController savedStateRegistryControllerCreate = SavedStateRegistryController.create(this);
        this.mSavedStateRegistryController = savedStateRegistryControllerCreate;
        this.mOnBackPressedDispatcher = null;
        ReportFullyDrawnExecutor reportFullyDrawnExecutorCreateFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = reportFullyDrawnExecutorCreateFullyDrawnExecutor;
        this.mFullyDrawnReporter = new FullyDrawnReporter(reportFullyDrawnExecutorCreateFullyDrawnExecutor, new Function0() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.m21lambda$new$0$androidxactivityComponentActivity();
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new ActivityResultRegistry() { // from class: androidx.activity.ComponentActivity.1
            AnonymousClass1() {
            }

            @Override // androidx.activity.result.ActivityResultRegistry
            public <I, O> void onLaunch(int i22, ActivityResultContract<I, O> activityResultContract, I i3, ActivityOptionsCompat activityOptionsCompat) throws Throwable {
                Bundle bundle;
                ComponentActivity componentActivity = ComponentActivity.this;
                ActivityResultContract.SynchronousResult synchronousResult2 = activityResultContract.getSynchronousResult(componentActivity, i3);
                if (synchronousResult2 != null) {
                    Object[] objArr = new Object[0];
                    Method declaredMethod = Class.forName(C1561oA.Kd("3A8GE@<\u0007IN\n)MNPFT", (short) (Od.Xd() ^ (-704)))).getDeclaredMethod(Wg.Zd("R\u0006%/RN#s'xh32", (short) (C1499aX.Xd() ^ (-13923)), (short) (C1499aX.Xd() ^ (-3339))), new Class[0]);
                    try {
                        declaredMethod.setAccessible(true);
                        Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                        RunnableC00001 runnableC00001 = new Runnable() { // from class: androidx.activity.ComponentActivity.1.1
                            final /* synthetic */ int val$requestCode;
                            final /* synthetic */ ActivityResultContract.SynchronousResult val$synchronousResult;

                            RunnableC00001(int i222, ActivityResultContract.SynchronousResult synchronousResult22) {
                                i = i222;
                                synchronousResult = synchronousResult22;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass1.this.dispatchResult(i, synchronousResult.getValue());
                            }
                        };
                        Class<?> cls = Class.forName(C1561oA.Xd("\u001d+\"1/*&p38s\u000f)7.71?", (short) (ZN.Xd() ^ 6040)));
                        Class<?>[] clsArr = new Class[1];
                        short sXd = (short) (C1607wl.Xd() ^ 18892);
                        int[] iArr = new int["\u001f\u0015-\u0017f$\u001c(\u0014Y\u0001#\u001f\u001e\u0014\u00141)".length()];
                        QB qb = new QB("\u001f\u0015-\u0017f$\u001c(\u0014Y\u0001#\u001f\u001e\u0014\u00141)");
                        int i4 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i4] = xuXd.fK((sXd ^ i4) + xuXd.CK(iKK));
                            i4++;
                        }
                        clsArr[0] = Class.forName(new String(iArr, 0, i4));
                        Object[] objArr2 = {runnableC00001};
                        Method method = cls.getMethod(Qg.kd("PNQQ", (short) (OY.Xd() ^ 25809), (short) (OY.Xd() ^ 26490)), clsArr);
                        try {
                            method.setAccessible(true);
                            method.invoke(handler, objArr2);
                            return;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                Intent intentCreateIntent = activityResultContract.createIntent(componentActivity, i3);
                if (intentCreateIntent.getExtras() != null && intentCreateIntent.getExtras().getClassLoader() == null) {
                    intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
                }
                String strVd = hg.Vd("'3(51*$7k\u001e\u001f/#/!+/b&\u0018%&\u001c#[\u0010\u001b\u0019\u001e\u001b\t\n\u001aR\t\u001b\u0016\u0013\u0001L^_ocoakotccfZ_]alN`XMTL", (short) (C1580rY.Xd() ^ (-29717)), (short) (C1580rY.Xd() ^ (-16734)));
                if (intentCreateIntent.hasExtra(strVd)) {
                    bundle = intentCreateIntent.getBundleExtra(strVd);
                    intentCreateIntent.removeExtra(strVd);
                } else {
                    bundle = activityOptionsCompat != null ? activityOptionsCompat.toBundle() : null;
                }
                if (C1561oA.ud("{\b|\n\u0006~x\f@rs\u0004w\u0004u\u007f\u00047zlyzpw0domro]^n'YZj^ca C5@C2??I9-93.76+0.2", (short) (C1607wl.Xd() ^ 32464)).equals(intentCreateIntent.getAction())) {
                    String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra(C1561oA.yd("KWLYUNH[ RScWcU_s'j\\ij`g0domro]^>v-?:7%p\"\u0016\"\u001c\u0017 \u001f\u0014)'+", (short) (C1633zX.Xd() ^ (-1172))));
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    ActivityCompat.requestPermissions(componentActivity, stringArrayExtra, i222);
                    return;
                }
                short sXd2 = (short) (FB.Xd() ^ 5646);
                int[] iArr2 = new int["u\u0004z\n\b\u0003~\u0014J~\u0002\u0014\n\u0018\f\u0018\u001eS\u0019\r\u001c\u001f\u0017 Z\u0011\u001e\u001e%$\u0014\u0017)c\u0018\u001b-#**j\u0007\r\u0014\u0006\u0010\u0017#\u0018\u000b\u0015\f\u000e\u001c*\u001e\u0012\u001f$\u0015$&".length()];
                QB qb2 = new QB("u\u0004z\n\b\u0003~\u0014J~\u0002\u0014\n\u0018\f\u0018\u001eS\u0019\r\u001c\u001f\u0017 Z\u0011\u001e\u001e%$\u0014\u0017)c\u0018\u001b-#**j\u0007\r\u0014\u0006\u0010\u0017#\u0018\u000b\u0015\f\u000e\u001c*\u001e\u0012\u001f$\u0015$&");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i5));
                    i5++;
                }
                if (!new String(iArr2, 0, i5).equals(intentCreateIntent.getAction())) {
                    ActivityCompat.startActivityForResult(componentActivity, intentCreateIntent, i222, bundle);
                    return;
                }
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra(Xg.qd("5C:IGB>S\n>ASIWKW]\u0013XL[^V_\u001aP]]dcSVh#[olk[)EKRDNUaVISJLZh\\P]bSbd", (short) (C1607wl.Xd() ^ 13951), (short) (C1607wl.Xd() ^ 15254)));
                try {
                    ActivityCompat.startIntentSenderForResult(componentActivity, intentSenderRequest.getIntentSender(), i222, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
                } catch (IntentSender.SendIntentException e42) {
                    Object[] objArr3 = new Object[0];
                    Method declaredMethod2 = Class.forName(Jg.Wd("RKl'NzA6#]C-s&QrK", (short) (C1580rY.Xd() ^ (-17875)), (short) (C1580rY.Xd() ^ (-7118)))).getDeclaredMethod(ZO.xd("e+\t&a\u0018rqTI\bJ@", (short) (ZN.Xd() ^ 23236), (short) (ZN.Xd() ^ 28710)), new Class[0]);
                    try {
                        declaredMethod2.setAccessible(true);
                        Handler handler2 = new Handler((Looper) declaredMethod2.invoke(null, objArr3));
                        AnonymousClass2 anonymousClass2 = new Runnable() { // from class: androidx.activity.ComponentActivity.1.2
                            final /* synthetic */ IntentSender.SendIntentException val$e;
                            final /* synthetic */ int val$requestCode;

                            AnonymousClass2(int i222, IntentSender.SendIntentException e422) {
                                i = i222;
                                sendIntentException = e422;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass1.this.dispatchResult(i, 0, new Intent().setAction(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION, sendIntentException));
                            }
                        };
                        Class<?> cls2 = Class.forName(C1626yg.Ud("m\u000bX\"\u000e\u0001J4J?\u001b19cH\u007f i", (short) (C1633zX.Xd() ^ (-5284)), (short) (C1633zX.Xd() ^ (-1901))));
                        Class<?>[] clsArr2 = {Class.forName(Ig.wd("H\u00105=\b\u0002HKmu\u0016]\f\u0014t\u0019vo", (short) (FB.Xd() ^ 9079)))};
                        Object[] objArr4 = {anonymousClass2};
                        short sXd3 = (short) (ZN.Xd() ^ 6863);
                        int[] iArr3 = new int["`/v[".length()];
                        QB qb3 = new QB("`/v[");
                        int i6 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i6] = xuXd3.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i6)) + xuXd3.CK(iKK3));
                            i6++;
                        }
                        Method method2 = cls2.getMethod(new String(iArr3, 0, i6), clsArr2);
                        try {
                            method2.setAccessible(true);
                            method2.invoke(handler2, objArr4);
                        } catch (InvocationTargetException e5) {
                            throw e5.getCause();
                        }
                    } catch (InvocationTargetException e6) {
                        throw e6.getCause();
                    }
                }
            }

            /* JADX INFO: renamed from: androidx.activity.ComponentActivity$1$1 */
            /* JADX INFO: loaded from: classes2.dex */
            class RunnableC00001 implements Runnable {
                final /* synthetic */ int val$requestCode;
                final /* synthetic */ ActivityResultContract.SynchronousResult val$synchronousResult;

                RunnableC00001(int i222, ActivityResultContract.SynchronousResult synchronousResult22) {
                    i = i222;
                    synchronousResult = synchronousResult22;
                }

                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass1.this.dispatchResult(i, synchronousResult.getValue());
                }
            }

            /* JADX INFO: renamed from: androidx.activity.ComponentActivity$1$2 */
            class AnonymousClass2 implements Runnable {
                final /* synthetic */ IntentSender.SendIntentException val$e;
                final /* synthetic */ int val$requestCode;

                AnonymousClass2(int i222, IntentSender.SendIntentException e422) {
                    i = i222;
                    sendIntentException = e422;
                }

                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass1.this.dispatchResult(i, 0, new Intent().setAction(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION, sendIntentException));
                }
            }
        };
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.2
            AnonymousClass2() {
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        Api19Impl.cancelPendingInputEvents(viewPeekDecorView);
                    }
                }
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.3
            AnonymousClass3() {
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.clearAvailableContext();
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().clear();
                    }
                    ComponentActivity.this.mReportFullyDrawnExecutor.activityDestroyed();
                }
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
            AnonymousClass4() {
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().removeObserver(this);
            }
        });
        savedStateRegistryControllerCreate.performAttach();
        SavedStateHandleSupport.enableSavedStateHandles(this);
        getSavedStateRegistry().registerSavedStateProvider(ACTIVITY_RESULT_TAG, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda2
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return this.f$0.m22lambda$new$1$androidxactivityComponentActivity();
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda3
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void onContextAvailable(Context context) {
                this.f$0.m23lambda$new$2$androidxactivityComponentActivity(context);
            }
        });
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$2 */
    class AnonymousClass2 implements LifecycleEventObserver {
        AnonymousClass2() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                Window window = ComponentActivity.this.getWindow();
                View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                if (viewPeekDecorView != null) {
                    Api19Impl.cancelPendingInputEvents(viewPeekDecorView);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$3 */
    class AnonymousClass3 implements LifecycleEventObserver {
        AnonymousClass3() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                ComponentActivity.this.mContextAwareHelper.clearAvailableContext();
                if (!ComponentActivity.this.isChangingConfigurations()) {
                    ComponentActivity.this.getViewModelStore().clear();
                }
                ComponentActivity.this.mReportFullyDrawnExecutor.activityDestroyed();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$4 */
    class AnonymousClass4 implements LifecycleEventObserver {
        AnonymousClass4() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            ComponentActivity.this.ensureViewModelStore();
            ComponentActivity.this.getLifecycle().removeObserver(this);
        }
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-activity-ComponentActivity */
    /* synthetic */ Bundle m22lambda$new$1$androidxactivityComponentActivity() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.onSaveInstanceState(bundle);
        return bundle;
    }

    /* JADX INFO: renamed from: lambda$new$2$androidx-activity-ComponentActivity */
    /* synthetic */ void m23lambda$new$2$androidxactivityComponentActivity(Context context) {
        Bundle bundleConsumeRestoredStateForKey = getSavedStateRegistry().consumeRestoredStateForKey(ACTIVITY_RESULT_TAG);
        if (bundleConsumeRestoredStateForKey != null) {
            this.mActivityResultRegistry.onRestoreInstanceState(bundleConsumeRestoredStateForKey);
        }
    }

    public ComponentActivity(int i2) {
        this();
        this.mContentLayoutId = i2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.performRestore(bundle);
        this.mContextAwareHelper.dispatchOnContextAvailable(this);
        super.onCreate(bundle);
        ReportFragment.injectIfNeededIn(this);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof LifecycleRegistry) {
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.performSave(bundle);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this.mViewModelStore;
        if (viewModelStore == null && (nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nonConfigurationInstances.viewModelStore;
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        NonConfigurationInstances nonConfigurationInstances2 = new NonConfigurationInstances();
        nonConfigurationInstances2.custom = objOnRetainCustomNonConfigurationInstance;
        nonConfigurationInstances2.viewModelStore = viewModelStore;
        return nonConfigurationInstances2;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            return nonConfigurationInstances.custom;
        }
        return null;
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.viewCreated(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public void initializeViewTreeOwners() {
        ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.set(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.set(getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.set(getWindow().getDecorView(), this);
        ViewTreeFullyDrawnReporterOwner.set(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.peekAvailableContext();
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.addOnContextAvailableListener(onContextAvailableListener);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.removeOnContextAvailableListener(onContextAvailableListener);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        this.mMenuHostHelper.onPrepareMenu(menu);
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        this.mMenuHostHelper.onCreateMenu(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.mMenuHostHelper.onMenuItemSelected(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        this.mMenuHostHelper.onMenuClosed(menu);
        super.onPanelClosed(i2, menu);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider menuProvider) {
        this.mMenuHostHelper.addMenuProvider(menuProvider);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, lifecycleOwner);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, lifecycleOwner, state);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(MenuProvider menuProvider) {
        this.mMenuHostHelper.removeMenuProvider(menuProvider);
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                this.mViewModelStore = nonConfigurationInstances.viewModelStore;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new ViewModelStore();
            }
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new SavedStateViewModelFactory(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (getApplication() != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, getApplication());
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, getIntent().getExtras());
        }
        return mutableCreationExtras;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$5 */
    class AnonymousClass5 implements Runnable {
        AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e2) {
                if (TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                } else {
                    throw e2;
                }
            } catch (NullPointerException e3) {
                if (TextUtils.equals(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                } else {
                    throw e3;
                }
            }
        }
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.ComponentActivity.5
                AnonymousClass5() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ComponentActivity.super.onBackPressed();
                    } catch (IllegalStateException e2) {
                        if (TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        } else {
                            throw e2;
                        }
                    } catch (NullPointerException e3) {
                        if (TextUtils.equals(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        } else {
                            throw e3;
                        }
                    }
                }
            });
            getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.6
                AnonymousClass6() {
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event != Lifecycle.Event.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    ComponentActivity.this.mOnBackPressedDispatcher.setOnBackInvokedDispatcher(Api33Impl.getOnBackInvokedDispatcher((ComponentActivity) lifecycleOwner));
                }
            });
        }
        return this.mOnBackPressedDispatcher;
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$6 */
    class AnonymousClass6 implements LifecycleEventObserver {
        AnonymousClass6() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event != Lifecycle.Event.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                return;
            }
            ComponentActivity.this.mOnBackPressedDispatcher.setOnBackInvokedDispatcher(Api33Impl.getOnBackInvokedDispatcher((ComponentActivity) lifecycleOwner));
        }
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.activity.FullyDrawnReporterOwner
    public FullyDrawnReporter getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    protected void onActivityResult(int i2, int i3, Intent intent) {
        if (this.mActivityResultRegistry.dispatchResult(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.dispatchResult(i2, -1, new Intent().putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS, strArr).putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS, iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultRegistry activityResultRegistry, ActivityResultCallback<O> activityResultCallback) {
        return activityResultRegistry.register("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, activityResultContract, activityResultCallback);
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback) {
        return registerForActivityResult(activityResultContract, this.mActivityResultRegistry, activityResultCallback);
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<Consumer<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(Consumer<Configuration> consumer) {
        this.mOnConfigurationChangedListeners.add(consumer);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(Consumer<Configuration> consumer) {
        this.mOnConfigurationChangedListeners.remove(consumer);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator<Consumer<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i2));
        }
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(Consumer<Integer> consumer) {
        this.mOnTrimMemoryListeners.add(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(Consumer<Integer> consumer) {
        this.mOnTrimMemoryListeners.remove(consumer);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(Consumer<Intent> consumer) {
        this.mOnNewIntentListeners.add(consumer);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(Consumer<Intent> consumer) {
        this.mOnNewIntentListeners.remove(consumer);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z2) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new MultiWindowModeChangedInfo(z2));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new MultiWindowModeChangedInfo(z2, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> consumer) {
        this.mOnMultiWindowModeChangedListeners.add(consumer);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> consumer) {
        this.mOnMultiWindowModeChangedListeners.remove(consumer);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new PictureInPictureModeChangedInfo(z2));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new PictureInPictureModeChangedInfo(z2, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> consumer) {
        this.mOnPictureInPictureModeChangedListeners.add(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> consumer) {
        this.mOnPictureInPictureModeChangedListeners.remove(consumer);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.fullyDrawnReported();
        } finally {
            Trace.endSection();
        }
    }

    private ReportFullyDrawnExecutor createFullyDrawnExecutor() {
        return new ReportFullyDrawnExecutorApi16Impl();
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static void cancelPendingInputEvents(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class Api33Impl {
        private Api33Impl() {
        }

        static OnBackInvokedDispatcher getOnBackInvokedDispatcher(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    static class ReportFullyDrawnExecutorApi1 implements ReportFullyDrawnExecutor {
        final Handler mHandler = createHandler();

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void activityDestroyed() {
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void viewCreated(View view) {
        }

        ReportFullyDrawnExecutorApi1() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) throws Throwable {
            Handler handler = this.mHandler;
            Class<?> cls = Class.forName(C1561oA.ud("[g\\ie^X!ad\u001e7O[PWO[", (short) (OY.Xd() ^ 12920)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (Od.Xd() ^ (-32648));
            int[] iArr = new int["@6N8\u007f=5A5z\"D87--RJ".length()];
            QB qb = new QB("@6N8\u007f=5A5z\"D87--RJ");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {runnable};
            Method method = cls.getMethod(C1561oA.Yd("\u0013\u0013\u0018\u001ag\u001cn\u001c\u001a\u001a!|\u0015\u0001&\u0017(\u0019", (short) (C1580rY.Xd() ^ (-1960))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private Handler createHandler() throws Throwable {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                short sXd = (short) (C1499aX.Xd() ^ (-22940));
                short sXd2 = (short) (C1499aX.Xd() ^ (-2499));
                int[] iArr = new int["\f\u0018\r\u001a\u0016\u000f\tQ\u0012\u0015Nk\u000e\r\r\u0001\r".length()];
                QB qb = new QB("\f\u0018\r\u001a\u0016\u000f\tQ\u0012\u0015Nk\u000e\r\r\u0001\r");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd3 = (short) (C1499aX.Xd() ^ (-29322));
                short sXd4 = (short) (C1499aX.Xd() ^ (-27181));
                int[] iArr2 = new int["HES+>EI&HGG;G".length()];
                QB qb2 = new QB("HES+>EI&HGG;G");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                    i3++;
                }
                Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    looperMyLooper = (Looper) declaredMethod.invoke(null, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return new Handler(looperMyLooper);
        }
    }

    class ReportFullyDrawnExecutorApi16Impl implements ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {
        final long mEndWatchTimeMillis = SystemClock.uptimeMillis() + 10000;
        boolean mOnDrawScheduled = false;
        Runnable mRunnable;

        ReportFullyDrawnExecutorApi16Impl() {
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void viewCreated(View view) {
            if (this.mOnDrawScheduled) {
                return;
            }
            this.mOnDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void activityDestroyed() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) throws Throwable {
            this.mRunnable = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (this.mOnDrawScheduled) {
                Looper looperMyLooper = Looper.myLooper();
                Object[] objArr = new Object[0];
                Method declaredMethod = Class.forName(C1561oA.Kd("u\u0004z\n\b\u0003~I\f\u0011Lk\u0010\u0011\u0013\t\u0017", (short) (ZN.Xd() ^ 31114))).getDeclaredMethod(Wg.Zd("^lKD\u0016.#V\"y\u0003Mb", (short) (Od.Xd() ^ (-25055)), (short) (Od.Xd() ^ (-29325))), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                        decorView.invalidate();
                        return;
                    } else {
                        decorView.postInvalidate();
                        return;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.ComponentActivity$ReportFullyDrawnExecutorApi16Impl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m24x96b76666();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$execute$0$androidx-activity-ComponentActivity$ReportFullyDrawnExecutorApi16Impl */
        /* synthetic */ void m24x96b76666() {
            Runnable runnable = this.mRunnable;
            if (runnable != null) {
                runnable.run();
                this.mRunnable = null;
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.mRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.mEndWatchTimeMillis) {
                    this.mOnDrawScheduled = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.mRunnable = null;
            if (ComponentActivity.this.mFullyDrawnReporter.isFullyDrawnReported()) {
                this.mOnDrawScheduled = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }
}
