package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.common.logging.FLog;
import com.facebook.debug.holder.PrinterHolder;
import com.facebook.debug.tags.ReactDebugOverlayTags;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.R;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.DevSplitBundleCallback;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.packagerconnection.RequestHandler;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import yg.C1561oA;
import yg.C1580rY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public final class BridgeDevSupportManager extends DevSupportManagerBase {
    private boolean mIsSamplingProfilerEnabled;

    public BridgeDevSupportManager(Context context, ReactInstanceDevHelper reactInstanceDevHelper, String str, boolean z2, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i2, Map<String, RequestHandler> map, SurfaceDelegateFactory surfaceDelegateFactory, DevLoadingViewManager devLoadingViewManager, PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager) {
        super(context, reactInstanceDevHelper, str, z2, redBoxHandler, devBundleDownloadListener, i2, map, surfaceDelegateFactory, devLoadingViewManager, pausedInDebuggerOverlayManager);
        this.mIsSamplingProfilerEnabled = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WebsocketJavaScriptExecutor.JSExecutorConnectCallback getExecutorConnectCallback(final SimpleSettableFuture<Boolean> simpleSettableFuture) {
        return new WebsocketJavaScriptExecutor.JSExecutorConnectCallback() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.2
            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onFailure(Throwable th) throws Throwable {
                BridgeDevSupportManager.this.hideDevLoadingView();
                String strUd = C1561oA.ud("!3./?\u0018*<0<*", (short) (ZN.Xd() ^ 4385));
                short sXd = (short) (Od.Xd() ^ (-23147));
                int[] iArr = new int["j\u0007\u0010\u0014\u000e\u000eJ \u001cM\u0012\u001f\u001f \u0018\u0017)U+'X\u001e \u001e2%&%3b".length()];
                QB qb = new QB("j\u0007\u0010\u0014\u000e\u000eJ \u001cM\u0012\u001f\u001f \u0018\u0017)U+'X\u001e \u001e2%&%3b");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                FLog.e(strUd, new String(iArr, 0, i2), th);
                SimpleSettableFuture simpleSettableFuture2 = simpleSettableFuture;
                Context applicationContext = BridgeDevSupportManager.this.getApplicationContext();
                int i3 = R.string.catalyst_debug_error;
                Class<?> cls = Class.forName(C1561oA.Yd("t\u0003y\t\u0007\u0002}H~\f\f\u0013\u0005\u000f\u0016Pf\u0014\u0014\u001b\r!\u001e", (short) (C1580rY.Xd() ^ (-1189))));
                Class<?>[] clsArr = {Integer.TYPE};
                Object[] objArr = {Integer.valueOf(i3)};
                Method method = cls.getMethod(Xg.qd("IHX8ZYQWQ", (short) (Od.Xd() ^ (-31252)), (short) (Od.Xd() ^ (-1589))), clsArr);
                try {
                    method.setAccessible(true);
                    simpleSettableFuture2.setException(new IOException((String) method.invoke(applicationContext, objArr), th));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }

            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onSuccess() {
                simpleSettableFuture.set(true);
                BridgeDevSupportManager.this.hideDevLoadingView();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleReloadJS$0() {
        getReactInstanceDevHelper().onJSBundleLoadedFromServer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleReloadJS$1() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$handleReloadJS$0();
            }
        });
    }

    private void reloadJSInProxyMode() {
        getDevServerHelper().launchJSDevtools();
        getReactInstanceDevHelper().onReloadWithJSDebugger(new JavaJSExecutor.Factory() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.3
            @Override // com.facebook.react.bridge.JavaJSExecutor.Factory
            public JavaJSExecutor create() throws Exception {
                WebsocketJavaScriptExecutor websocketJavaScriptExecutor = new WebsocketJavaScriptExecutor();
                SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
                websocketJavaScriptExecutor.connect(BridgeDevSupportManager.this.getDevServerHelper().getWebsocketProxyURL(), BridgeDevSupportManager.this.getExecutorConnectCallback(simpleSettableFuture));
                try {
                    simpleSettableFuture.get(90L, TimeUnit.SECONDS);
                    return websocketJavaScriptExecutor;
                } catch (InterruptedException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                } catch (ExecutionException e3) {
                    throw ((Exception) e3.getCause());
                } catch (TimeoutException e4) {
                    e = e4;
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerBase
    protected String getUniqueTag() {
        return "Bridge";
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void handleReloadJS() {
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.RELOAD, getDevSettings().getPackagerConnectionSettings().getDebugServerHost());
        hideRedboxDialog();
        if (!getDevSettings().isRemoteJSDebugEnabled()) {
            PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.RN_CORE, "RNCore: load from Server");
            reloadJSFromServer(getDevServerHelper().getDevServerBundleURL((String) Assertions.assertNotNull(getJSAppBundleName())), new BundleLoadCallback() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager$$ExternalSyntheticLambda1
                @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
                public final void onSuccess() {
                    this.f$0.lambda$handleReloadJS$1();
                }
            });
        } else {
            PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.RN_CORE, "RNCore: load from Proxy");
            showDevLoadingViewForRemoteJSEnabled();
            reloadJSInProxyMode();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void loadSplitBundleFromServer(final String str, final DevSplitBundleCallback devSplitBundleCallback) {
        fetchSplitBundleAndCreateBundleLoader(str, new DevSupportManagerBase.CallbackWithBundleLoader() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.1
            @Override // com.facebook.react.devsupport.DevSupportManagerBase.CallbackWithBundleLoader
            public void onError(String str2, Throwable th) {
                devSplitBundleCallback.onError(str2, th);
            }

            @Override // com.facebook.react.devsupport.DevSupportManagerBase.CallbackWithBundleLoader
            public void onSuccess(JSBundleLoader jSBundleLoader) {
                jSBundleLoader.loadScript(BridgeDevSupportManager.this.getCurrentContext().getCatalystInstance());
                ((HMRClient) BridgeDevSupportManager.this.getCurrentContext().getJSModule(HMRClient.class)).registerBundle(BridgeDevSupportManager.this.getDevServerHelper().getDevServerSplitBundleURL(str));
                devSplitBundleCallback.onSuccess();
            }
        });
    }
}
