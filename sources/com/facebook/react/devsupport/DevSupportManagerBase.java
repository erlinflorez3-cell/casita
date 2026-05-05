package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.util.Supplier;
import com.drew.metadata.mov.metadata.QuickTimeMetadataDirectory;
import com.dynatrace.android.agent.Global;
import com.facebook.common.logging.FLog;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.R;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.ShakeDetector;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.devsupport.BundleDownloader;
import com.facebook.react.devsupport.DevInternalSettings;
import com.facebook.react.devsupport.DevServerHelper;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.ErrorCustomizer;
import com.facebook.react.devsupport.interfaces.ErrorType;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.packagerconnection.Responder;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
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

/* JADX INFO: loaded from: classes3.dex */
public abstract class DevSupportManagerBase implements DevSupportManager {
    private static final String EXOPACKAGE_LOCATION_FORMAT = "/data/local/tmp/exopackage/%s//secondary-dex";
    private static final int JAVA_ERROR_COOKIE = -1;
    private static final int JSEXCEPTION_ERROR_COOKIE = -1;
    private static final String RELOAD_APP_ACTION_SUFFIX = ".RELOAD_APP_ACTION";
    private final Context mApplicationContext;
    private final DevBundleDownloadListener mBundleDownloadListener;
    private ReactContext mCurrentContext;
    private final Map<String, RequestHandler> mCustomPackagerCommandHandlers;
    private DebugOverlayController mDebugOverlayController;
    private final DefaultJSExceptionHandler mDefaultJSExceptionHandler;
    private final DevLoadingViewManager mDevLoadingViewManager;
    private AlertDialog mDevOptionsDialog;
    private final DevServerHelper mDevServerHelper;
    private final DeveloperSettings mDevSettings;
    private List<ErrorCustomizer> mErrorCustomizers;
    private boolean mIsPackagerConnected;
    private final String mJSAppBundleName;
    private final File mJSBundleDownloadedFile;
    private final File mJSSplitBundlesDir;
    private StackFrame[] mLastErrorStack;
    private String mLastErrorTitle;
    private ErrorType mLastErrorType;
    private DevSupportManager.PackagerLocationCustomizer mPackagerLocationCustomizer;
    private final PausedInDebuggerOverlayManager mPausedInDebuggerOverlayManager;
    private final ReactInstanceDevHelper mReactInstanceDevHelper;
    private final RedBoxHandler mRedBoxHandler;
    private SurfaceDelegate mRedBoxSurfaceDelegate;
    private final BroadcastReceiver mReloadAppBroadcastReceiver;
    private final ShakeDetector mShakeDetector;
    private final SurfaceDelegateFactory mSurfaceDelegateFactory;
    private final LinkedHashMap<String, DevOptionHandler> mCustomDevOptions = new LinkedHashMap<>();
    private boolean mDevLoadingViewVisible = false;
    private int mPendingJSSplitBundleRequests = 0;
    private boolean mIsReceiverRegistered = false;
    private boolean mIsShakeDetectorStarted = false;
    private boolean mIsDevSupportEnabled = false;
    private int mLastErrorCookie = 0;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.DevSupportManagerBase$6, reason: invalid class name */
    class AnonymousClass6 implements DevBundleDownloadListener {
        final /* synthetic */ File val$bundleFile;
        final /* synthetic */ String val$bundleUrl;
        final /* synthetic */ CallbackWithBundleLoader val$callback;

        AnonymousClass6(String str, File file, CallbackWithBundleLoader callbackWithBundleLoader) {
            this.val$bundleUrl = str;
            this.val$bundleFile = file;
            this.val$callback = callbackWithBundleLoader;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSuccess$0() {
            DevSupportManagerBase.this.hideSplitBundleDevLoadingView();
        }

        @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
        public void onFailure(Exception exc) {
            final DevSupportManagerBase devSupportManagerBase = DevSupportManagerBase.this;
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$6$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    devSupportManagerBase.hideSplitBundleDevLoadingView();
                }
            });
            this.val$callback.onError(this.val$bundleUrl, exc);
        }

        @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
        public void onProgress(String str, Integer num, Integer num2) {
            DevSupportManagerBase.this.mDevLoadingViewManager.updateProgress(str, num, num2);
        }

        @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
        public void onSuccess() {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$6$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onSuccess$0();
                }
            });
            ReactContext reactContext = DevSupportManagerBase.this.mCurrentContext;
            if (reactContext == null || !reactContext.hasActiveReactInstance()) {
                return;
            }
            this.val$callback.onSuccess(JSBundleLoader.createCachedSplitBundleFromNetworkLoader(this.val$bundleUrl, this.val$bundleFile.getAbsolutePath()));
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.DevSupportManagerBase$9, reason: invalid class name */
    class AnonymousClass9 implements DevServerHelper.PackagerCommandListener {
        AnonymousClass9() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureHeapCommand$2(Responder responder) throws Throwable {
            DevSupportManagerBase.this.handleCaptureHeap(responder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPackagerDevMenuCommand$1() throws Throwable {
            DevSupportManagerBase.this.showDevOptionsDialog();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPackagerReloadCommand$0() {
            DevSupportManagerBase.this.handleReloadJS();
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public Map<String, RequestHandler> customCommandHandlers() {
            return DevSupportManagerBase.this.mCustomPackagerCommandHandlers;
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onCaptureHeapCommand(final Responder responder) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$9$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.lambda$onCaptureHeapCommand$2(responder);
                }
            });
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerConnected() {
            DevSupportManagerBase.this.mIsPackagerConnected = true;
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerDevMenuCommand() {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$9$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.lambda$onPackagerDevMenuCommand$1();
                }
            });
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerDisconnected() {
            DevSupportManagerBase.this.mIsPackagerConnected = false;
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerReloadCommand() {
            if (!InspectorFlags.getFuseboxEnabled()) {
                DevSupportManagerBase.this.mDevServerHelper.disableDebugger();
            }
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$9$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onPackagerReloadCommand$0();
                }
            });
        }
    }

    public interface CallbackWithBundleLoader {
        void onError(String str, Throwable th);

        void onSuccess(JSBundleLoader jSBundleLoader);
    }

    public DevSupportManagerBase(Context context, ReactInstanceDevHelper reactInstanceDevHelper, String str, boolean z2, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i2, Map<String, RequestHandler> map, SurfaceDelegateFactory surfaceDelegateFactory, DevLoadingViewManager devLoadingViewManager, PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager) throws Throwable {
        DevLoadingViewManager devLoadingViewManager2 = devLoadingViewManager;
        PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager2 = pausedInDebuggerOverlayManager;
        this.mReactInstanceDevHelper = reactInstanceDevHelper;
        this.mApplicationContext = context;
        this.mJSAppBundleName = str;
        DevInternalSettings devInternalSettings = new DevInternalSettings(context, new DevInternalSettings.Listener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda5
            @Override // com.facebook.react.devsupport.DevInternalSettings.Listener
            public final void onInternalSettingsChanged() throws Throwable {
                this.f$0.reloadSettings();
            }
        });
        this.mDevSettings = devInternalSettings;
        this.mDevServerHelper = new DevServerHelper(devInternalSettings, context, devInternalSettings.getPackagerConnectionSettings());
        this.mBundleDownloadListener = devBundleDownloadListener;
        this.mShakeDetector = new ShakeDetector(new ShakeDetector.ShakeListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda6
            @Override // com.facebook.react.common.ShakeDetector.ShakeListener
            public final void onShake() throws Throwable {
                this.f$0.showDevOptionsDialog();
            }
        }, i2);
        this.mCustomPackagerCommandHandlers = map;
        this.mReloadAppBroadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (DevSupportManagerBase.getReloadAppAction(context2).equals(intent.getAction())) {
                    if (intent.getBooleanExtra(DevServerHelper.RELOAD_APP_EXTRA_JS_PROXY, false)) {
                        DevSupportManagerBase.this.mDevSettings.setRemoteJSDebugEnabled(true);
                        DevSupportManagerBase.this.mDevServerHelper.launchJSDevtools();
                    } else {
                        DevSupportManagerBase.this.mDevSettings.setRemoteJSDebugEnabled(false);
                    }
                    DevSupportManagerBase.this.handleReloadJS();
                }
            }
        };
        String uniqueTag = getUniqueTag();
        String str2 = uniqueTag + Jg.Wd("lhAdRE5m;q==;e\u0012b<\u0017<\u0016{\u00157", (short) (Od.Xd() ^ (-5297)), (short) (Od.Xd() ^ (-8742)));
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("fI\r\t$XnbjH\u0001.0qN\u001fNLsa\u007f]!", (short) (Od.Xd() ^ (-5921)), (short) (Od.Xd() ^ (-30833)))).getMethod(C1626yg.Ud("3J2U\u001ax\u000bUfY/", (short) (C1499aX.Xd() ^ (-2606)), (short) (C1499aX.Xd() ^ (-5796))), new Class[0]);
        try {
            method.setAccessible(true);
            this.mJSBundleDownloadedFile = new File((File) method.invoke(context, objArr), str2);
            String str3 = uniqueTag.toLowerCase(Locale.ROOT) + Ig.wd(")~MGO\u00152V\u0013\u0001v=\u0019\u0012lb2\u0012b\u0014Z", (short) (Od.Xd() ^ (-14864)));
            Class<?> cls = Class.forName(EO.Od("\u001eq;,r)B6&! \u0006%:F y\u001asS~l\t", (short) (C1580rY.Xd() ^ (-2104))));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (Od.Xd() ^ (-6375));
            int[] iArr = new int["MCWA\rJ>JB\b,LI?C;".length()];
            QB qb = new QB("MCWA\rJ>JB\b,LI?C;");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i3));
            clsArr[1] = Integer.TYPE;
            Object[] objArr2 = {str3, 0};
            Method method2 = cls.getMethod(C1593ug.zd("\u0018\u0017'w\u001e(", (short) (C1633zX.Xd() ^ (-31326)), (short) (C1633zX.Xd() ^ (-10587))), clsArr);
            try {
                method2.setAccessible(true);
                this.mJSSplitBundlesDir = (File) method2.invoke(context, objArr2);
                this.mDefaultJSExceptionHandler = new DefaultJSExceptionHandler();
                setDevSupportEnabled(z2);
                this.mRedBoxHandler = redBoxHandler;
                this.mDevLoadingViewManager = devLoadingViewManager2 == null ? new DefaultDevLoadingViewImplementation(reactInstanceDevHelper) : devLoadingViewManager2;
                this.mSurfaceDelegateFactory = surfaceDelegateFactory;
                this.mPausedInDebuggerOverlayManager = pausedInDebuggerOverlayManager2 == null ? new PausedInDebuggerOverlayDialogManager(new Supplier() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda7
                    @Override // androidx.core.util.Supplier
                    public final Object get() {
                        return this.f$0.lambda$new$0();
                    }
                }) : pausedInDebuggerOverlayManager2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private void compatRegisterReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z2) throws Throwable {
        Object obj;
        if (Build.VERSION.SDK_INT >= 34) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od(">J?LHA;\u00048CAF6>C{\u0010;9>.@;", (short) (C1633zX.Xd() ^ (-20303)))).getMethod(C1561oA.Kd("ihxFvwtrml\u0001v}}Y\u007fx\u0003", (short) (OY.Xd() ^ 13931)), new Class[0]);
            try {
                method.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
                String strZd = Wg.Zd("idP\u001aP}fcQ\u001b\u000eMih*[\u0014|v}*\u001eS>j\"1[\rE\u0016t'c", (short) (FB.Xd() ^ 8815), (short) (FB.Xd() ^ 22651));
                String strXd = C1561oA.Xd("\u0014\u0002\u0014\n\t\u0019x\u000b\u0013~\u000f\u001d\u001f\u0016\u001d\u001d", (short) (OY.Xd() ^ 28583));
                try {
                    Class<?> cls = Class.forName(strZd);
                    Field field = 1 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj = null;
                }
                if (((Integer) obj).intValue() >= 34) {
                    int i2 = z2 ? 2 : 4;
                    Class<?> cls2 = Class.forName(Wg.vd("\u0007\u0015\f\u001b\u0011\f\bR\u0011\u001e\u001e%\u000f\u0019 ZX\u0006\u0006\rv\u000b\b", (short) (C1633zX.Xd() ^ (-21344))));
                    Class<?>[] clsArr = {Class.forName(Qg.kd("?K@MIB<\u00059DBG7?D|\u0010?;,.,)::\u0017)&'*6$0", (short) (FB.Xd() ^ 14147), (short) (FB.Xd() ^ 4530))), Class.forName(hg.Vd("o{p}yrl5itrwgot-Gkp`hm>`biYe", (short) (FB.Xd() ^ 19660), (short) (FB.Xd() ^ 21766))), Integer.TYPE};
                    Object[] objArr2 = {broadcastReceiver, intentFilter, Integer.valueOf(i2)};
                    Method method2 = cls2.getMethod(C1561oA.ud("|nopyyiuTfcdgsam", (short) (C1607wl.Xd() ^ QuickTimeMetadataDirectory.TAG_COLLECTION_USER)), clsArr);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(context, objArr2);
                        return;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        Class<?> cls3 = Class.forName(C1561oA.yd("\f\u0018\r\u001a\u0016\u000f\tQ\u0006\u0011\u000f\u0014\u0004\f\u0011I})',\u001c.)", (short) (ZN.Xd() ^ 991)));
        Class<?>[] clsArr2 = new Class[2];
        short sXd = (short) (FB.Xd() ^ 3863);
        int[] iArr = new int["\u0013!\u0018'% \u001cf\u001d**1#-4n\u000453&**)<>\u001d1038F6D".length()];
        QB qb = new QB("\u0013!\u0018'% \u001cf\u001d**1#-4n\u000453&**)<>\u001d1038F6D");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
            i3++;
        }
        clsArr2[0] = Class.forName(new String(iArr, 0, i3));
        short sXd2 = (short) (C1580rY.Xd() ^ (-32109));
        short sXd3 = (short) (C1580rY.Xd() ^ (-540));
        int[] iArr2 = new int["v\u0005{\u000b\t\u0004\u007fJ\u0001\u000e\u000e\u0015\u0007\u0011\u0018Rn\u0015\u001c\u000e\u0018\u001fq\u0016\u001a#\u0015#".length()];
        QB qb2 = new QB("v\u0005{\u000b\t\u0004\u007fJ\u0001\u000e\u000e\u0015\u0007\u0011\u0018Rn\u0015\u001c\u000e\u0018\u001fq\u0016\u001a#\u0015#");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i4)) + sXd3);
            i4++;
        }
        clsArr2[1] = Class.forName(new String(iArr2, 0, i4));
        Object[] objArr3 = {broadcastReceiver, intentFilter};
        short sXd4 = (short) (C1633zX.Xd() ^ (-19195));
        short sXd5 = (short) (C1633zX.Xd() ^ (-26000));
        int[] iArr3 = new int["\u001f:{Af+[\f/\u0006c)h\u001aH\u001d".length()];
        QB qb3 = new QB("\u001f:{Af+[\f/\u0006c)h\u001aH\u001d");
        int i5 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - ((i5 * sXd5) ^ sXd4));
            i5++;
        }
        Method method3 = cls3.getMethod(new String(iArr3, 0, i5), clsArr2);
        try {
            method3.setAccessible(true);
            method3.invoke(context, objArr3);
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private String getJSExecutorDescription() {
        try {
            return getReactInstanceDevHelper().getJavaScriptExecutorFactory().toString();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getReloadAppAction(Context context) throws Throwable {
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("\u001bSg\u00016\u0012N+<\t;\u0013\u0005^\u0010hvZO\u000f\"A\u0017", (short) (ZN.Xd() ^ 1974), (short) (ZN.Xd() ^ 11578))).getMethod(C1626yg.Ud("'w\u001e%A\u007f&1o6\u001au=C", (short) (OY.Xd() ^ 25645), (short) (OY.Xd() ^ 27228)), new Class[0]);
        try {
            method.setAccessible(true);
            return sb.append((String) method.invoke(context, objArr)).append(Ig.wd("\f\u0005C9)e\u000b,f<4+][vL\u0019\b", (short) (C1499aX.Xd() ^ (-32575)))).toString();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCaptureHeap(final Responder responder) throws Throwable {
        JSCHeapCapture jSCHeapCapture;
        ReactContext reactContext = this.mCurrentContext;
        if (reactContext == null || (jSCHeapCapture = (JSCHeapCapture) reactContext.getNativeModule(JSCHeapCapture.class)) == null) {
            return;
        }
        Context context = this.mApplicationContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("P0(YFeH\u0002j\u0016k[\u001b\u0016\f,\u0006\u0018_\u0012E!\u0007", (short) (C1633zX.Xd() ^ (-21104)))).getMethod(C1561oA.Qd("\u000b\b\u0016c\u0001\u0002\u0006\u0002_\u0004\f", (short) (C1607wl.Xd() ^ 21603)), new Class[0]);
        try {
            method.setAccessible(true);
            jSCHeapCapture.captureHeap(((File) method.invoke(context, objArr)).getPath(), new JSCHeapCapture.CaptureCallback() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.7
                @Override // com.facebook.react.devsupport.JSCHeapCapture.CaptureCallback
                public void onFailure(JSCHeapCapture.CaptureException captureException) {
                    responder.error(captureException.toString());
                }

                @Override // com.facebook.react.devsupport.JSCHeapCapture.CaptureCallback
                public void onSuccess(File file) {
                    responder.respond(file.toString());
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void hideDevOptionsDialog() {
        AlertDialog alertDialog = this.mDevOptionsDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.mDevOptionsDialog = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideSplitBundleDevLoadingView() {
        int i2 = this.mPendingJSSplitBundleRequests - 1;
        this.mPendingJSSplitBundleRequests = i2;
        if (i2 == 0) {
            hideDevLoadingView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchSplitBundleAndCreateBundleLoader$10(String str, File file, CallbackWithBundleLoader callbackWithBundleLoader) throws Throwable {
        showSplitBundleDevLoadingView(str);
        this.mDevServerHelper.downloadBundleFromURL(new AnonymousClass6(str, file, callbackWithBundleLoader), file, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isPackagerRunning$11(PackagerStatusCallback packagerStatusCallback) {
        this.mDevServerHelper.isPackagerRunning(packagerStatusCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Context lambda$new$0() {
        Activity currentActivity = this.mReactInstanceDevHelper.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return null;
        }
        return currentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reportBundleLoadingFailure$12(Exception exc) throws Throwable {
        if (exc instanceof DebugServerException) {
            showNewJavaError(((DebugServerException) exc).getMessage(), exc);
            return;
        }
        Context context = this.mApplicationContext;
        int i2 = R.string.catalyst_reload_error;
        Class<?> cls = Class.forName(C1593ug.zd("<JAPNIE\u0010FSSZLV]\u0018.[[bThe", (short) (FB.Xd() ^ 24273), (short) (FB.Xd() ^ 12193)));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        short sXd = (short) (C1499aX.Xd() ^ (-10907));
        int[] iArr = new int["\u001d\u001a(\u0006&#\u0019\u001d\u0015".length()];
        QB qb = new QB("\u001d\u001a(\u0006&#\u0019\u001d\u0015");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            showNewJavaError((String) method.invoke(context, objArr), exc);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFpsDebugEnabled$15(boolean z2) {
        this.mDevSettings.setFpsDebugEnabled(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setHotModuleReplacementEnabled$13(boolean z2) {
        this.mDevSettings.setHotModuleReplacementEnabled(z2);
        handleReloadJS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRemoteJSDebugEnabled$14(boolean z2) {
        this.mDevSettings.setRemoteJSDebugEnabled(z2);
        handleReloadJS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDevOptionsDialog$4() throws Throwable {
        Activity currentActivity = this.mReactInstanceDevHelper.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            FLog.e(Wg.vd("j|wx\u0011i{\u000e\n\u0016\u0004", (short) (C1607wl.Xd() ^ 9894)), Qg.kd("D\\NNWO\t\\V\u0006QEXPDH~AE=IA>w9KC8?7p<>1.@497g)+(%85&_1#\u001e\u001f/Y\u001a\u001b+\u001f+\u001d'+P\u0019\"M\u001b\u001b\u001fI\n\u001e\b\u000f\u0011\u0005\u0005\u000e\u0006", (short) (C1607wl.Xd() ^ 8368), (short) (C1607wl.Xd() ^ 26899)));
            return;
        }
        final EditText editText = new EditText(currentActivity);
        short sXd = (short) (C1633zX.Xd() ^ (-5788));
        int[] iArr = new int["\u0019\u001d\u0012\u0011\u001d\u001a\"')ongpj".length()];
        QB qb = new QB("\u0019\u001d\u0012\u0011\u001d\u001a\"')ongpj");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        editText.setHint(new String(iArr, 0, i2));
        AlertDialog.Builder builder = new AlertDialog.Builder(currentActivity);
        Context context = this.mApplicationContext;
        int i3 = R.string.catalyst_change_bundle_location;
        short sXd2 = (short) (Od.Xd() ^ (-1523));
        short sXd3 = (short) (Od.Xd() ^ (-9140));
        int[] iArr2 = new int["+`yp\u00124Q\u0003m]D-F4\"?\b\u001c?m\u0003\u0005$".length()];
        QB qb2 = new QB("+`yp\u00124Q\u0003m]D-F4\"?\b\u001c?m\u0003\u0005$");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(((i4 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i4++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i4));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i3)};
        Method method = cls.getMethod(C1561oA.Xd("zy\ni\f\u000b\u0003\t\u0003", (short) (FB.Xd() ^ 17161)), clsArr);
        try {
            method.setAccessible(true);
            builder.setTitle((String) method.invoke(context, objArr)).setView(editText).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i5) {
                    DevSupportManagerBase.this.mDevSettings.getPackagerConnectionSettings().setDebugServerHost(editText.getText().toString());
                    DevSupportManagerBase.this.handleReloadJS();
                }
            }).create().show();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDevOptionsDialog$5() throws Throwable {
        boolean zIsHotModuleReplacementEnabled = this.mDevSettings.isHotModuleReplacementEnabled();
        this.mDevSettings.setHotModuleReplacementEnabled(!zIsHotModuleReplacementEnabled);
        ReactContext reactContext = this.mCurrentContext;
        if (reactContext != null) {
            if (zIsHotModuleReplacementEnabled) {
                ((HMRClient) reactContext.getJSModule(HMRClient.class)).disable();
            } else {
                ((HMRClient) reactContext.getJSModule(HMRClient.class)).enable();
            }
        }
        if (zIsHotModuleReplacementEnabled || this.mDevSettings.isJSDevModeEnabled()) {
            return;
        }
        Context context = this.mApplicationContext;
        int i2 = R.string.catalyst_hot_reloading_auto_enable;
        Class<?> cls = Class.forName(hg.Vd("bncple_(\\gejZbg 4_]bRd_", (short) (C1580rY.Xd() ^ (-19750)), (short) (C1580rY.Xd() ^ (-18426))));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        Method method = cls.getMethod(C1561oA.ud("85C!A>480", (short) (Od.Xd() ^ (-7318))), clsArr);
        try {
            method.setAccessible(true);
            Toast.makeText(context, (String) method.invoke(context, objArr), 1).show();
            this.mDevSettings.setJSDevModeEnabled(true);
            handleReloadJS();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDevOptionsDialog$6() throws Exception {
        if (!this.mDevSettings.isFpsDebugEnabled()) {
            Activity currentActivity = this.mReactInstanceDevHelper.getCurrentActivity();
            if (currentActivity == null) {
                FLog.e(ReactConstants.TAG, "Unable to get reference to react activity");
            } else {
                DebugOverlayController.requestPermission(currentActivity);
            }
        }
        this.mDevSettings.setFpsDebugEnabled(!r1.isFpsDebugEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDevOptionsDialog$7() throws Exception {
        Intent intent = new Intent(this.mApplicationContext, (Class<?>) DevSettingsActivity.class);
        intent.setFlags(268435456);
        Context context = this.mApplicationContext;
        CX.ud();
        Class<?> cls = Class.forName(C1561oA.yd("%1*770.v/:<A5=F~v\"$)\u001d/.", (short) (Od.Xd() ^ (-988))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Yd("3A8GE@<\u0007=JJQCMT\u000f+QXJT[", (short) (C1499aX.Xd() ^ (-18117))))};
        Object[] objArr = {intent};
        short sXd = (short) (C1633zX.Xd() ^ (-29448));
        short sXd2 = (short) (C1633zX.Xd() ^ (-14709));
        int[] iArr = new int["Y[I[^,OaWeYek".length()];
        QB qb = new QB("Y[I[^,OaWeYek");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDevOptionsDialog$8(DevOptionHandler[] devOptionHandlerArr, DialogInterface dialogInterface, int i2) {
        devOptionHandlerArr[i2].onOptionSelected();
        this.mDevOptionsDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDevOptionsDialog$9(DialogInterface dialogInterface) {
        this.mDevOptionsDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNewError$2(String str, StackFrame[] stackFrameArr, int i2, ErrorType errorType) {
        updateLastErrorInfo(str, stackFrameArr, i2, errorType);
        if (this.mRedBoxSurfaceDelegate == null) {
            SurfaceDelegate surfaceDelegateCreateSurfaceDelegate = createSurfaceDelegate(NativeRedBoxSpec.NAME);
            if (surfaceDelegateCreateSurfaceDelegate != null) {
                this.mRedBoxSurfaceDelegate = surfaceDelegateCreateSurfaceDelegate;
            } else {
                this.mRedBoxSurfaceDelegate = new RedBoxDialogSurfaceDelegate(this);
            }
            this.mRedBoxSurfaceDelegate.createContentView(NativeRedBoxSpec.NAME);
        }
        if (this.mRedBoxSurfaceDelegate.isShowing()) {
            return;
        }
        this.mRedBoxSurfaceDelegate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleElementInspector$16() {
        this.mDevSettings.setElementInspectorEnabled(!r1.isElementInspectorEnabled());
        this.mReactInstanceDevHelper.toggleElementInspector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateJSError$1(int i2, String str, ReadableArray readableArray) {
        SurfaceDelegate surfaceDelegate = this.mRedBoxSurfaceDelegate;
        if ((surfaceDelegate == null || surfaceDelegate.isShowing()) && i2 == this.mLastErrorCookie) {
            updateLastErrorInfo(str, StackTraceHelper.convertJsStackTrace(readableArray), i2, ErrorType.JS);
            this.mRedBoxSurfaceDelegate.show();
        }
    }

    private void logJSException(Exception exc) {
        StringBuilder sb = new StringBuilder(exc.getMessage() == null ? "Exception in native call from JS" : exc.getMessage());
        for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
            sb.append("\n\n").append(cause.getMessage());
        }
        if (!(exc instanceof JavascriptException)) {
            showNewJavaError(sb.toString(), exc);
        } else {
            FLog.e(ReactConstants.TAG, "Exception in native call from JS", exc);
            showNewError(exc.getMessage().toString(), new StackFrame[0], -1, ErrorType.JS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reload() throws Throwable {
        UiThreadUtil.assertOnUiThread();
        if (!this.mIsDevSupportEnabled) {
            DebugOverlayController debugOverlayController = this.mDebugOverlayController;
            if (debugOverlayController != null) {
                debugOverlayController.setFpsDebugViewVisible(false);
            }
            if (this.mIsShakeDetectorStarted) {
                this.mShakeDetector.stop();
                this.mIsShakeDetectorStarted = false;
            }
            if (this.mIsReceiverRegistered) {
                Context context = this.mApplicationContext;
                Object[] objArr = {this.mReloadAppBroadcastReceiver};
                Method method = Class.forName(C1561oA.Qd("\u000f\u001b\u0010\u001d\u0019\u0012\fT\t\u0014\u0012\u0017\u0007\u000f\u0014L`\f\n\u000f~\u0011\f", (short) (OY.Xd() ^ 32535))).getMethod(C1561oA.od("\u0015\r\u0010\u0002\u0003\u0004\r\r|\tgyvwz\u0007t\u0001", (short) (ZN.Xd() ^ 23706)), Class.forName(C1593ug.zd("O]Tca\\X#Yffm_ip+@qobffexzYmlot\u0003r\u0001", (short) (C1499aX.Xd() ^ (-3857)), (short) (C1499aX.Xd() ^ (-17990)))));
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr);
                    this.mIsReceiverRegistered = false;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            hideRedboxDialog();
            hideDevOptionsDialog();
            this.mDevLoadingViewManager.hide();
            this.mDevServerHelper.closePackagerConnection();
            return;
        }
        DebugOverlayController debugOverlayController2 = this.mDebugOverlayController;
        if (debugOverlayController2 != null) {
            debugOverlayController2.setFpsDebugViewVisible(this.mDevSettings.isFpsDebugEnabled());
        }
        if (!this.mIsShakeDetectorStarted) {
            ShakeDetector shakeDetector = this.mShakeDetector;
            Context context2 = this.mApplicationContext;
            String strWd = Jg.Wd("Q<f{\u0019l", (short) (ZN.Xd() ^ 15138), (short) (ZN.Xd() ^ 16236));
            Class<?> cls = Class.forName(ZO.xd("E_Zda]\u0016\r%Ic\u0006e\r\b\u001d~i&Zp5k", (short) (OY.Xd() ^ 28414), (short) (OY.Xd() ^ 10003)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1499aX.Xd() ^ (-18646));
            short sXd2 = (short) (C1499aX.Xd() ^ (-14617));
            int[] iArr = new int["\u001e\u001exBS)vZfwo\n\f!!\u007f".length()];
            QB qb = new QB("\u001e\u001exBS)vZfwo\n\f!!\u007f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr2 = {strWd};
            Method method2 = cls.getMethod(Ig.wd("&sR\u000fs)<b\u0014{\nz4/\u0017|", (short) (C1633zX.Xd() ^ (-2129))), clsArr);
            try {
                method2.setAccessible(true);
                shakeDetector.start((SensorManager) method2.invoke(context2, objArr2));
                this.mIsShakeDetectorStarted = true;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (!this.mIsReceiverRegistered) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(getReloadAppAction(this.mApplicationContext));
            compatRegisterReceiver(this.mApplicationContext, this.mReloadAppBroadcastReceiver, intentFilter, true);
            this.mIsReceiverRegistered = true;
        }
        if (this.mDevLoadingViewVisible) {
            this.mDevLoadingViewManager.showMessage(EO.Od("[\u0015Px\u0014d32VNNj", (short) (C1607wl.Xd() ^ 16719)));
        }
        this.mDevServerHelper.openPackagerConnection(getClass().getSimpleName(), new AnonymousClass9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportBundleLoadingFailure(final Exception exc) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.lambda$reportBundleLoadingFailure$12(exc);
            }
        });
    }

    private void resetCurrentContext(ReactContext reactContext) throws Throwable {
        if (this.mCurrentContext == reactContext) {
            return;
        }
        this.mCurrentContext = reactContext;
        DebugOverlayController debugOverlayController = this.mDebugOverlayController;
        if (debugOverlayController != null) {
            debugOverlayController.setFpsDebugViewVisible(false);
        }
        if (reactContext != null) {
            this.mDebugOverlayController = new DebugOverlayController(reactContext);
        }
        if (this.mCurrentContext != null) {
            try {
                URL url = new URL(getSourceUrl());
                ((HMRClient) this.mCurrentContext.getJSModule(HMRClient.class)).setup("android", url.getPath().substring(1), url.getHost(), url.getPort() != -1 ? url.getPort() : url.getDefaultPort(), this.mDevSettings.isHotModuleReplacementEnabled(), url.getProtocol());
            } catch (MalformedURLException e2) {
                showNewJavaError(e2.getMessage(), e2);
            }
        }
        reloadSettings();
    }

    private void showDevLoadingViewForUrl(String str) throws Throwable {
        if (this.mApplicationContext == null) {
            return;
        }
        try {
            URL url = new URL(str);
            int port = url.getPort() != -1 ? url.getPort() : url.getDefaultPort();
            DevLoadingViewManager devLoadingViewManager = this.mDevLoadingViewManager;
            Context context = this.mApplicationContext;
            int i2 = R.string.catalyst_loading_from_url;
            StringBuilder sbAppend = new StringBuilder().append(url.getHost());
            short sXd = (short) (OY.Xd() ^ 12588);
            int[] iArr = new int["+".length()];
            QB qb = new QB("+");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
                i3++;
            }
            Object[] objArr = {sbAppend.append(new String(iArr, 0, i3)).append(port).toString()};
            Class<?> cls = Class.forName(Wg.Zd("\u001bN_hAV,1\u0001\u0018Rs  !5E|WXd\u0013)", (short) (C1633zX.Xd() ^ (-4836)), (short) (C1633zX.Xd() ^ (-28100))));
            Class<?>[] clsArr = {Integer.TYPE, Object[].class};
            Object[] objArr2 = {Integer.valueOf(i2), objArr};
            Method method = cls.getMethod(C1561oA.Xd("EDT4VUMSM", (short) (ZN.Xd() ^ 29235)), clsArr);
            try {
                method.setAccessible(true);
                devLoadingViewManager.showMessage((String) method.invoke(context, objArr2));
                this.mDevLoadingViewVisible = true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (MalformedURLException e3) {
            String str2 = Wg.vd("Q\u0004{p\u007fw1\u0006\n\u00035z\u000b\r\u0007ys\u001efo#kovhrnh9*\u0013\u0012", (short) (C1580rY.Xd() ^ (-1619))) + e3.toString();
            short sXd2 = (short) (OY.Xd() ^ 16411);
            short sXd3 = (short) (OY.Xd() ^ 2234);
            int[] iArr2 = new int["\u001f1,-=\u0016(:.:(".length()];
            QB qb2 = new QB("\u001f1,-=\u0016(:.:(");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(((sXd2 + i4) + xuXd2.CK(iKK2)) - sXd3);
                i4++;
            }
            FLog.e(new String(iArr2, 0, i4), str2);
        }
    }

    private void showNewError(final String str, final StackFrame[] stackFrameArr, final int i2, final ErrorType errorType) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$showNewError$2(str, stackFrameArr, i2, errorType);
            }
        });
    }

    private void showSplitBundleDevLoadingView(String str) throws Throwable {
        showDevLoadingViewForUrl(str);
        this.mPendingJSSplitBundleRequests++;
    }

    private void updateLastErrorInfo(String str, StackFrame[] stackFrameArr, int i2, ErrorType errorType) {
        this.mLastErrorTitle = str;
        this.mLastErrorStack = stackFrameArr;
        this.mLastErrorCookie = i2;
        this.mLastErrorType = errorType;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void addCustomDevOption(String str, DevOptionHandler devOptionHandler) {
        this.mCustomDevOptions.put(str, devOptionHandler);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public View createRootView(String str) {
        return this.mReactInstanceDevHelper.createRootView(str);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public SurfaceDelegate createSurfaceDelegate(String str) {
        SurfaceDelegateFactory surfaceDelegateFactory = this.mSurfaceDelegateFactory;
        if (surfaceDelegateFactory == null) {
            return null;
        }
        return surfaceDelegateFactory.createSurfaceDelegate(str);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void destroyRootView(View view) {
        this.mReactInstanceDevHelper.destroyRootView(view);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public File downloadBundleResourceFromUrlSync(String str, File file) {
        return this.mDevServerHelper.downloadBundleResourceFromUrlSync(str, file);
    }

    public void fetchSplitBundleAndCreateBundleLoader(String str, final CallbackWithBundleLoader callbackWithBundleLoader) {
        final String devServerSplitBundleURL = this.mDevServerHelper.getDevServerSplitBundleURL(str);
        final File file = new File(this.mJSSplitBundlesDir, str.replaceAll(RemoteSettings.FORWARD_SLASH_STRING, Global.UNDERSCORE) + ".jsbundle");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.lambda$fetchSplitBundleAndCreateBundleLoader$10(devServerSplitBundleURL, file, callbackWithBundleLoader);
            }
        });
    }

    protected Context getApplicationContext() {
        return this.mApplicationContext;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public Activity getCurrentActivity() {
        return this.mReactInstanceDevHelper.getCurrentActivity();
    }

    protected ReactContext getCurrentContext() {
        return this.mCurrentContext;
    }

    public DevLoadingViewManager getDevLoadingViewManager() {
        return this.mDevLoadingViewManager;
    }

    public DevServerHelper getDevServerHelper() {
        return this.mDevServerHelper;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public DeveloperSettings getDevSettings() {
        return this.mDevSettings;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean getDevSupportEnabled() {
        return this.mIsDevSupportEnabled;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getDownloadedJSBundleFile() {
        return this.mJSBundleDownloadedFile.getAbsolutePath();
    }

    public String getJSAppBundleName() {
        return this.mJSAppBundleName;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getJSBundleURLForRemoteDebugging() {
        return this.mDevServerHelper.getJSBundleURLForRemoteDebugging((String) Assertions.assertNotNull(this.mJSAppBundleName));
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public int getLastErrorCookie() {
        return this.mLastErrorCookie;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public StackFrame[] getLastErrorStack() {
        return this.mLastErrorStack;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getLastErrorTitle() {
        return this.mLastErrorTitle;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public ErrorType getLastErrorType() {
        return this.mLastErrorType;
    }

    public ReactInstanceDevHelper getReactInstanceDevHelper() {
        return this.mReactInstanceDevHelper;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public RedBoxHandler getRedBoxHandler() {
        return this.mRedBoxHandler;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getSourceMapUrl() {
        String str = this.mJSAppBundleName;
        return str == null ? "" : this.mDevServerHelper.getSourceMapUrl((String) Assertions.assertNotNull(str));
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getSourceUrl() {
        String str = this.mJSAppBundleName;
        return str == null ? "" : this.mDevServerHelper.getSourceUrl((String) Assertions.assertNotNull(str));
    }

    protected abstract String getUniqueTag();

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception exc) {
        if (this.mIsDevSupportEnabled) {
            logJSException(exc);
        } else {
            this.mDefaultJSExceptionHandler.handleException(exc);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean hasUpToDateJSBundleInCache() throws Throwable {
        if (this.mIsDevSupportEnabled && this.mJSBundleDownloadedFile.exists()) {
            try {
                Context context = this.mApplicationContext;
                short sXd = (short) (C1607wl.Xd() ^ 31535);
                short sXd2 = (short) (C1607wl.Xd() ^ 18851);
                int[] iArr = new int["iujwslf/cnlqain';fdiYkf".length()];
                QB qb = new QB("iujwslf/cnlqain';fdiYkf");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd3 = (short) (C1633zX.Xd() ^ (-80));
                int[] iArr2 = new int["\"\u001f-\b\u0018\u0019 \u0015\u001a\u0017~\u0011\u001c\u0013".length()];
                QB qb2 = new QB("\"\u001f-\b\u0018\u0019 \u0015\u001a\u0017~\u0011\u001c\u0013");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    String str = (String) method.invoke(context, objArr);
                    Context context2 = this.mApplicationContext;
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.yd("\u0014 \u0019&\u001e\u0017\u0015]\u000e\u0019\u001b \f\u0014\u001dUe\u0011\u0013\u0018\u0004\u0016\u0015", (short) (C1607wl.Xd() ^ 6471))).getMethod(C1561oA.Yd("xw\bdvy\u0003y\u0001\u007fh}\f\u007f\u0007\u0006\u0014", (short) (Od.Xd() ^ (-23397))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        PackageManager packageManager = (PackageManager) method2.invoke(context2, objArr2);
                        Class<?> cls2 = Class.forName(Xg.qd("\u0014\"\u0019(&!\u001dg\u001e++2$.5o31r\u0016(+4+21\u001a/=187E", (short) (C1580rY.Xd() ^ (-32561)), (short) (C1580rY.Xd() ^ (-13453))));
                        Class<?>[] clsArr2 = new Class[2];
                        clsArr2[0] = Class.forName(Jg.Wd("W0\t\u0017\u0015\u0017g6bL58q,R\u000f", (short) (C1633zX.Xd() ^ (-26205)), (short) (C1633zX.Xd() ^ (-26735))));
                        clsArr2[1] = Integer.TYPE;
                        Object[] objArr3 = {str, 0};
                        Method method3 = cls2.getMethod(ZO.xd("Spj$V02\u00018?\u001e8Vq", (short) (OY.Xd() ^ 6085), (short) (OY.Xd() ^ 7983)), clsArr2);
                        try {
                            method3.setAccessible(true);
                            if (this.mJSBundleDownloadedFile.lastModified() > ((PackageInfo) method3.invoke(packageManager, objArr3)).lastUpdateTime) {
                                File file = new File(String.format(Locale.US, C1626yg.Ud("4oY\u0005ZU7_sS(`#pTh*qb\u001d\u0015{'T]\n)\u001d2P\"8j=Z`E:;f\u000fB\u007fg", (short) (C1499aX.Xd() ^ (-27963)), (short) (C1499aX.Xd() ^ (-25041))), str));
                                return !file.exists() || this.mJSBundleDownloadedFile.lastModified() > file.lastModified();
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                FLog.e(Ig.wd("Q+\u0005f/Ds>`Y2", (short) (C1633zX.Xd() ^ (-12243))), EO.Od("~OP\u0007{Djr5%Ly/[;\u00188AtwqkR\u0001\b\u0014BC\u000fPs\u0017,L\u001byb\u0018\u0015<\f:]n", (short) (Od.Xd() ^ (-17583))));
            }
        }
        return false;
    }

    protected void hideDevLoadingView() {
        this.mDevLoadingViewManager.hide();
        this.mDevLoadingViewVisible = false;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hidePausedInDebuggerOverlay() {
        this.mPausedInDebuggerOverlayManager.hidePausedInDebuggerOverlay();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hideRedboxDialog() {
        SurfaceDelegate surfaceDelegate = this.mRedBoxSurfaceDelegate;
        if (surfaceDelegate == null) {
            return;
        }
        surfaceDelegate.hide();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void isPackagerRunning(final PackagerStatusCallback packagerStatusCallback) {
        Runnable runnable = new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$isPackagerRunning$11(packagerStatusCallback);
            }
        };
        DevSupportManager.PackagerLocationCustomizer packagerLocationCustomizer = this.mPackagerLocationCustomizer;
        if (packagerLocationCustomizer != null) {
            packagerLocationCustomizer.run(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onNewReactContextCreated(ReactContext reactContext) throws Throwable {
        resetCurrentContext(reactContext);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onReactInstanceDestroyed(ReactContext reactContext) throws Throwable {
        if (reactContext == this.mCurrentContext) {
            resetCurrentContext(null);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    /* JADX INFO: renamed from: openDebugger, reason: merged with bridge method [inline-methods] */
    public void lambda$showDevOptionsDialog$3() throws Throwable {
        DevServerHelper devServerHelper = this.mDevServerHelper;
        ReactContext reactContext = this.mCurrentContext;
        Context context = this.mApplicationContext;
        int i2 = R.string.catalyst_open_debugger_error;
        Class<?> cls = Class.forName(C1561oA.Qd(",8-:6/)q&1/4$,1i})',\u001c.)", (short) (C1607wl.Xd() ^ 11366)));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        Method method = cls.getMethod(C1593ug.zd("\u0012\u0011!\u0001#\"\u001a \u001a", (short) (Od.Xd() ^ (-20382)), (short) (Od.Xd() ^ (-9249))), clsArr);
        try {
            method.setAccessible(true);
            devServerHelper.openDebugger(reactContext, (String) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public Pair<String, StackFrame[]> processErrorCustomizers(Pair<String, StackFrame[]> pair) {
        List<ErrorCustomizer> list = this.mErrorCustomizers;
        if (list != null) {
            Iterator<ErrorCustomizer> it = list.iterator();
            while (it.hasNext()) {
                Pair<String, StackFrame[]> pairCustomizeErrorInfo = it.next().customizeErrorInfo(pair);
                if (pairCustomizeErrorInfo != null) {
                    pair = pairCustomizeErrorInfo;
                }
            }
        }
        return pair;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void registerErrorCustomizer(ErrorCustomizer errorCustomizer) {
        if (this.mErrorCustomizers == null) {
            this.mErrorCustomizers = new ArrayList();
        }
        this.mErrorCustomizers.add(errorCustomizer);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadJSFromServer(String str, final BundleLoadCallback bundleLoadCallback) throws Throwable {
        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
        showDevLoadingViewForUrl(str);
        final BundleDownloader.BundleInfo bundleInfo = new BundleDownloader.BundleInfo();
        this.mDevServerHelper.downloadBundleFromURL(new DevBundleDownloadListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.8
            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onFailure(Exception exc) {
                DevSupportManagerBase.this.hideDevLoadingView();
                if (DevSupportManagerBase.this.mBundleDownloadListener != null) {
                    DevSupportManagerBase.this.mBundleDownloadListener.onFailure(exc);
                }
                FLog.e(ReactConstants.TAG, "Unable to download JS bundle", exc);
                DevSupportManagerBase.this.reportBundleLoadingFailure(exc);
                bundleLoadCallback.onError(exc);
            }

            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onProgress(String str2, Integer num, Integer num2) {
                DevSupportManagerBase.this.mDevLoadingViewManager.updateProgress(str2, num, num2);
                if (DevSupportManagerBase.this.mBundleDownloadListener != null) {
                    DevSupportManagerBase.this.mBundleDownloadListener.onProgress(str2, num, num2);
                }
            }

            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onSuccess() {
                DevSupportManagerBase.this.hideDevLoadingView();
                if (DevSupportManagerBase.this.mBundleDownloadListener != null) {
                    DevSupportManagerBase.this.mBundleDownloadListener.onSuccess();
                }
                ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_END, bundleInfo.toJSONString());
                bundleLoadCallback.onSuccess();
            }
        }, this.mJSBundleDownloadedFile, str, bundleInfo);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadSettings() throws Throwable {
        if (UiThreadUtil.isOnUiThread()) {
            reload();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.reload();
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setAdditionalOptionForPackager(String str, String str2) {
        this.mDevSettings.getPackagerConnectionSettings().setAdditionalOptionForPackager(str, str2);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setDevSupportEnabled(boolean z2) throws Throwable {
        this.mIsDevSupportEnabled = z2;
        reloadSettings();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setFpsDebugEnabled(final boolean z2) {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$setFpsDebugEnabled$15(z2);
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setHotModuleReplacementEnabled(final boolean z2) {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$setHotModuleReplacementEnabled$13(z2);
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setPackagerLocationCustomizer(DevSupportManager.PackagerLocationCustomizer packagerLocationCustomizer) {
        this.mPackagerLocationCustomizer = packagerLocationCustomizer;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setRemoteJSDebugEnabled(final boolean z2) {
        if (this.mIsDevSupportEnabled && this.mDevSettings.isRemoteJSDebugEnabled() != z2) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$setRemoteJSDebugEnabled$14(z2);
                }
            });
        }
    }

    protected void showDevLoadingViewForRemoteJSEnabled() throws Throwable {
        Context context = this.mApplicationContext;
        if (context == null) {
            return;
        }
        DevLoadingViewManager devLoadingViewManager = this.mDevLoadingViewManager;
        int i2 = R.string.catalyst_debug_connecting;
        Class<?> cls = Class.forName(C1561oA.od("\f\u0018\r\u001a\u0016\u000f\tQ\u0006\u0011\u000f\u0014\u0004\f\u0011I]\t\u0007\f{\u000e\t", (short) (C1580rY.Xd() ^ (-934))));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        Method method = cls.getMethod(C1561oA.Kd("wv\u0007f\t\b\u007f\u0006\u007f", (short) (C1633zX.Xd() ^ (-2591))), clsArr);
        try {
            method.setAccessible(true);
            devLoadingViewManager.showMessage((String) method.invoke(context, objArr));
            this.mDevLoadingViewVisible = true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showDevOptionsDialog() throws Throwable {
        String str;
        String str2;
        if (this.mDevOptionsDialog == null && this.mIsDevSupportEnabled && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            final HashSet hashSet = new HashSet();
            Context context = this.mApplicationContext;
            int i2 = R.string.catalyst_reload;
            short sXd = (short) (C1607wl.Xd() ^ 13781);
            short sXd2 = (short) (C1607wl.Xd() ^ 6295);
            int[] iArr = new int["\u0006Qmz\u001e\u001eVF\u0002-2~\r\u001cH\u0001<\u000e+WO\u0001#".length()];
            QB qb = new QB("\u0006Qmz\u001e\u001eVF\u0002-2~\r\u001cH\u0001<\u000e+WO\u0001#");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i3));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method method = cls.getMethod(C1561oA.Xd("~}\u000em\u0010\u000f\u0007\r\u0007", (short) (C1607wl.Xd() ^ 7713)), clsArr);
            try {
                method.setAccessible(true);
                linkedHashMap.put((String) method.invoke(context, objArr), new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.2
                    @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                    public void onOptionSelected() throws Throwable {
                        if (!DevSupportManagerBase.this.mDevSettings.isJSDevModeEnabled() && DevSupportManagerBase.this.mDevSettings.isHotModuleReplacementEnabled()) {
                            Context context2 = DevSupportManagerBase.this.mApplicationContext;
                            Context context3 = DevSupportManagerBase.this.mApplicationContext;
                            int i4 = R.string.catalyst_hot_reloading_auto_disable;
                            Class<?> cls2 = Class.forName(Wg.Zd("N4O\fMm\u001e%\u0010E\u0007>P#Z6\u007fr\u0017K\u00019k", (short) (C1499aX.Xd() ^ (-1242)), (short) (C1499aX.Xd() ^ (-20681))));
                            Class<?>[] clsArr2 = {Integer.TYPE};
                            Object[] objArr2 = {Integer.valueOf(i4)};
                            Method method2 = cls2.getMethod(C1561oA.Xd("VUeEgf^d^", (short) (C1633zX.Xd() ^ (-24269))), clsArr2);
                            try {
                                method2.setAccessible(true);
                                Toast.makeText(context2, (String) method2.invoke(context3, objArr2), 1).show();
                                DevSupportManagerBase.this.mDevSettings.setHotModuleReplacementEnabled(false);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        }
                        DevSupportManagerBase.this.handleReloadJS();
                    }
                });
                if (this.mDevSettings.isRemoteJSDebugEnabled()) {
                    this.mDevSettings.setRemoteJSDebugEnabled(false);
                    handleReloadJS();
                }
                if (this.mDevSettings.isDeviceDebugEnabled() && !this.mDevSettings.isRemoteJSDebugEnabled()) {
                    boolean z2 = this.mIsPackagerConnected;
                    Context context2 = this.mApplicationContext;
                    int i4 = z2 ? R.string.catalyst_debug_open : R.string.catalyst_debug_open_disabled;
                    Class<?> cls2 = Class.forName(Wg.vd("-9.;70*r7B@E5=Bz\u001fJHM=OJ", (short) (C1607wl.Xd() ^ 28386)));
                    Class<?>[] clsArr2 = {Integer.TYPE};
                    Object[] objArr2 = {Integer.valueOf(i4)};
                    Method method2 = cls2.getMethod(Qg.kd("nkyWwtjnf", (short) (FB.Xd() ^ 30688), (short) (FB.Xd() ^ 19441)), clsArr2);
                    try {
                        method2.setAccessible(true);
                        String str3 = (String) method2.invoke(context2, objArr2);
                        if (!z2) {
                            hashSet.add(str3);
                        }
                        linkedHashMap.put(str3, new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda16
                            @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                            public final void onOptionSelected() throws Throwable {
                                this.f$0.lambda$showDevOptionsDialog$3();
                            }
                        });
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Context context3 = this.mApplicationContext;
                int i5 = R.string.catalyst_change_bundle_location;
                Class<?> cls3 = Class.forName(hg.Vd("[g\\ie^X!U`^cS[`\u0019-XV[K]X", (short) (FB.Xd() ^ 22538), (short) (FB.Xd() ^ 7754)));
                Class<?>[] clsArr3 = {Integer.TYPE};
                Object[] objArr3 = {Integer.valueOf(i5)};
                Method method3 = cls3.getMethod(C1561oA.ud("HES1QNDH@", (short) (Od.Xd() ^ (-8484))), clsArr3);
                try {
                    method3.setAccessible(true);
                    linkedHashMap.put((String) method3.invoke(context3, objArr3), new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda17
                        @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                        public final void onOptionSelected() throws Throwable {
                            this.f$0.lambda$showDevOptionsDialog$4();
                        }
                    });
                    Context context4 = this.mApplicationContext;
                    int i6 = R.string.catalyst_inspector_toggle;
                    Class<?> cls4 = Class.forName(C1561oA.yd("nzs\u0001\u0001yw@x\u0004\u0006\u000b~\u0007\u0010H@kmrfxw", (short) (Od.Xd() ^ (-26204))));
                    Class<?>[] clsArr4 = {Integer.TYPE};
                    Object[] objArr4 = {Integer.valueOf(i6)};
                    short sXd3 = (short) (Od.Xd() ^ (-21426));
                    int[] iArr2 = new int["\f\u000b\u001bz\u001d\u001c\u0014\u001a\u0014".length()];
                    QB qb2 = new QB("\f\u000b\u001bz\u001d\u001c\u0014\u001a\u0014");
                    int i7 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i7] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i7));
                        i7++;
                    }
                    Method method4 = cls4.getMethod(new String(iArr2, 0, i7), clsArr4);
                    try {
                        method4.setAccessible(true);
                        linkedHashMap.put((String) method4.invoke(context4, objArr4), new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.4
                            @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                            public void onOptionSelected() {
                                DevSupportManagerBase.this.mDevSettings.setElementInspectorEnabled(!DevSupportManagerBase.this.mDevSettings.isElementInspectorEnabled());
                                DevSupportManagerBase.this.mReactInstanceDevHelper.toggleElementInspector();
                            }
                        });
                        if (this.mDevSettings.isHotModuleReplacementEnabled()) {
                            Context context5 = this.mApplicationContext;
                            int i8 = R.string.catalyst_hot_reloading_stop;
                            Class<?> cls5 = Class.forName(Xg.qd("\u001b) /-($n%229+5<v\r::A3GD", (short) (C1607wl.Xd() ^ 20440), (short) (C1607wl.Xd() ^ 24643)));
                            Class<?>[] clsArr5 = {Integer.TYPE};
                            Object[] objArr5 = {Integer.valueOf(i8)};
                            Method method5 = cls5.getMethod(Jg.Wd("HSgs\"MI\u007f\u0002", (short) (C1580rY.Xd() ^ (-15633)), (short) (C1580rY.Xd() ^ (-21642))), clsArr5);
                            try {
                                method5.setAccessible(true);
                                str = (String) method5.invoke(context5, objArr5);
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        } else {
                            Context context6 = this.mApplicationContext;
                            int i9 = R.string.catalyst_hot_reloading;
                            Class<?> cls6 = Class.forName(ZO.xd("|9\u0013\b*gvcYEZFe\u0013\u0017O:FP\u0014\b(,", (short) (C1499aX.Xd() ^ (-3798)), (short) (C1499aX.Xd() ^ (-8676))));
                            Class<?>[] clsArr6 = {Integer.TYPE};
                            Object[] objArr6 = {Integer.valueOf(i9)};
                            Method method6 = cls6.getMethod(C1626yg.Ud("k}{>obL{F", (short) (Od.Xd() ^ (-32252)), (short) (Od.Xd() ^ (-6885))), clsArr6);
                            try {
                                method6.setAccessible(true);
                                str = (String) method6.invoke(context6, objArr6);
                            } catch (InvocationTargetException e4) {
                                throw e4.getCause();
                            }
                        }
                        linkedHashMap.put(str, new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda18
                            @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                            public final void onOptionSelected() throws Throwable {
                                this.f$0.lambda$showDevOptionsDialog$5();
                            }
                        });
                        if (this.mDevSettings.isFpsDebugEnabled()) {
                            Context context7 = this.mApplicationContext;
                            int i10 = R.string.catalyst_perf_monitor_stop;
                            Class<?> cls7 = Class.forName(Ig.wd("T;|i=i~flON4u\u0003Z|X\u0005Z6gU%", (short) (OY.Xd() ^ 27841)));
                            Class<?>[] clsArr7 = {Integer.TYPE};
                            Object[] objArr7 = {Integer.valueOf(i10)};
                            Method method7 = cls7.getMethod(EO.Od("@\t*0Y\u0015gT\t", (short) (ZN.Xd() ^ 553)), clsArr7);
                            try {
                                method7.setAccessible(true);
                                str2 = (String) method7.invoke(context7, objArr7);
                            } catch (InvocationTargetException e5) {
                                throw e5.getCause();
                            }
                        } else {
                            Context context8 = this.mApplicationContext;
                            int i11 = R.string.catalyst_perf_monitor;
                            Class<?> cls8 = Class.forName(C1561oA.Qd("0<1>:3-u*538(05m\u0002-+0 2-", (short) (C1633zX.Xd() ^ (-18490))));
                            Class<?>[] clsArr8 = {Integer.TYPE};
                            Object[] objArr8 = {Integer.valueOf(i11)};
                            Method method8 = cls8.getMethod(C1593ug.zd("XWgGih`f`", (short) (ZN.Xd() ^ 13922), (short) (ZN.Xd() ^ 16186)), clsArr8);
                            try {
                                method8.setAccessible(true);
                                str2 = (String) method8.invoke(context8, objArr8);
                            } catch (InvocationTargetException e6) {
                                throw e6.getCause();
                            }
                        }
                        linkedHashMap.put(str2, new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda19
                            @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                            public final void onOptionSelected() throws Exception {
                                this.f$0.lambda$showDevOptionsDialog$6();
                            }
                        });
                        Context context9 = this.mApplicationContext;
                        int i12 = R.string.catalyst_settings;
                        Class<?> cls9 = Class.forName(C1561oA.od("S_Ta]VP\u0019MXV[KSX\u0011%PNSCUP", (short) (C1580rY.Xd() ^ (-12579))));
                        Class<?>[] clsArr9 = {Integer.TYPE};
                        Object[] objArr9 = {Integer.valueOf(i12)};
                        Method method9 = cls9.getMethod(C1561oA.Kd("_^nNpogmg", (short) (ZN.Xd() ^ 21718)), clsArr9);
                        try {
                            method9.setAccessible(true);
                            linkedHashMap.put((String) method9.invoke(context9, objArr9), new DevOptionHandler() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda1
                                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                                public final void onOptionSelected() throws Exception {
                                    this.f$0.lambda$showDevOptionsDialog$7();
                                }
                            });
                            if (this.mCustomDevOptions.size() > 0) {
                                linkedHashMap.putAll(this.mCustomDevOptions);
                            }
                            final DevOptionHandler[] devOptionHandlerArr = (DevOptionHandler[]) linkedHashMap.values().toArray(new DevOptionHandler[0]);
                            Activity currentActivity = this.mReactInstanceDevHelper.getCurrentActivity();
                            if (currentActivity == null || currentActivity.isFinishing()) {
                                String strXd = C1561oA.Xd("L`]`rMaukyi", (short) (C1580rY.Xd() ^ (-465)));
                                short sXd4 = (short) (OY.Xd() ^ 24451);
                                int[] iArr3 = new int[":THJMG\u0003X\\\u000e[Q^XNTt:<NpACHFMMSxG@Jz&imdcxwr.\u0002ujm\u007f,VYkag[gm\u001dgrn n\u001b]\u001c\b\u0011\u0015\u0003\u0005\u0010\n".length()];
                                QB qb3 = new QB(":THJMG\u0003X\\\u000e[Q^XNTt:<NpACHFMMSxG@Jz&imdcxwr.\u0002ujm\u007f,VYkag[gm\u001dgrn n\u001b]\u001c\b\u0011\u0015\u0003\u0005\u0010\n");
                                int i13 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i13] = xuXd3.fK((sXd4 ^ i13) + xuXd3.CK(iKK3));
                                    i13++;
                                }
                                FLog.e(strXd, new String(iArr3, 0, i13));
                                return;
                            }
                            LinearLayout linearLayout = new LinearLayout(currentActivity);
                            linearLayout.setOrientation(1);
                            TextView textView = new TextView(currentActivity);
                            textView.setText(currentActivity.getString(R.string.catalyst_dev_menu_header, new Object[]{getUniqueTag()}));
                            textView.setPadding(0, 50, 0, 0);
                            textView.setGravity(17);
                            textView.setTextSize(16.0f);
                            textView.setTypeface(textView.getTypeface(), 1);
                            linearLayout.addView(textView);
                            String jSExecutorDescription = getJSExecutorDescription();
                            if (jSExecutorDescription != null) {
                                TextView textView2 = new TextView(currentActivity);
                                textView2.setText(currentActivity.getString(R.string.catalyst_dev_menu_sub_header, new Object[]{jSExecutorDescription}));
                                textView2.setPadding(0, 20, 0, 0);
                                textView2.setGravity(17);
                                textView2.setTextSize(14.0f);
                                linearLayout.addView(textView2);
                            }
                            AlertDialog alertDialogCreate = new AlertDialog.Builder(currentActivity).setCustomTitle(linearLayout).setAdapter(new ArrayAdapter<String>(currentActivity, android.R.layout.simple_list_item_1, (String[]) linkedHashMap.keySet().toArray(new String[0])) { // from class: com.facebook.react.devsupport.DevSupportManagerBase.5
                                @Override // android.widget.BaseAdapter, android.widget.ListAdapter
                                public boolean areAllItemsEnabled() {
                                    return false;
                                }

                                @Override // android.widget.ArrayAdapter, android.widget.Adapter
                                public View getView(int i14, View view, ViewGroup viewGroup) {
                                    View view2 = super.getView(i14, view, viewGroup);
                                    view2.setEnabled(isEnabled(i14));
                                    return view2;
                                }

                                @Override // android.widget.BaseAdapter, android.widget.ListAdapter
                                public boolean isEnabled(int i14) {
                                    return !hashSet.contains(getItem(i14));
                                }
                            }, new DialogInterface.OnClickListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda2
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    this.f$0.lambda$showDevOptionsDialog$8(devOptionHandlerArr, dialogInterface, i14);
                                }
                            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda3
                                @Override // android.content.DialogInterface.OnCancelListener
                                public final void onCancel(DialogInterface dialogInterface) {
                                    this.f$0.lambda$showDevOptionsDialog$9(dialogInterface);
                                }
                            }).create();
                            this.mDevOptionsDialog = alertDialogCreate;
                            alertDialogCreate.show();
                            ReactContext reactContext = this.mCurrentContext;
                            if (reactContext != null) {
                                ((RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit(Wg.Zd("\u0019\rq$X,V1MW\fd}I\u0013", (short) (C1499aX.Xd() ^ (-28213)), (short) (C1499aX.Xd() ^ (-21264))), null);
                            }
                        } catch (InvocationTargetException e7) {
                            throw e7.getCause();
                        }
                    } catch (InvocationTargetException e8) {
                        throw e8.getCause();
                    }
                } catch (InvocationTargetException e9) {
                    throw e9.getCause();
                }
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJSError(String str, ReadableArray readableArray, int i2) {
        showNewError(str, StackTraceHelper.convertJsStackTrace(readableArray), i2, ErrorType.JS);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJavaError(String str, Throwable th) {
        FLog.e(ReactConstants.TAG, "Exception in native call", th);
        showNewError(str, StackTraceHelper.convertJavaStackTrace(th), -1, ErrorType.NATIVE);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showPausedInDebuggerOverlay(String str, DevSupportManager.PausedInDebuggerOverlayCommandListener pausedInDebuggerOverlayCommandListener) {
        this.mPausedInDebuggerOverlayManager.showPausedInDebuggerOverlay(str, pausedInDebuggerOverlayCommandListener);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void startInspector() {
        if (this.mIsDevSupportEnabled) {
            this.mDevServerHelper.openInspectorConnection();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void stopInspector() {
        this.mDevServerHelper.closeInspectorConnection();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void toggleElementInspector() {
        if (this.mIsDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$toggleElementInspector$16();
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void updateJSError(final String str, final ReadableArray readableArray, final int i2) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$updateJSError$1(i2, str, readableArray);
            }
        });
    }
}
