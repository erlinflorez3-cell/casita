package com.facebook.react.runtime;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.interfaces.fabric.SurfaceHandler;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.runtime.internal.bolts.Task;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public class ReactSurfaceImpl implements ReactSurface {
    private Context mContext;
    private final AtomicReference<ReactHostImpl> mReactHost;
    private final SurfaceHandler mSurfaceHandler;
    private final AtomicReference<ReactSurfaceView> mSurfaceView;

    public ReactSurfaceImpl(Context context, String str, @Nullable Bundle bundle) throws Throwable {
        this(new SurfaceHandlerBinding(str), context);
        this.mSurfaceHandler.setProps(bundle == null ? new WritableNativeMap() : (NativeMap) Arguments.fromBundle(bundle));
        short sXd = (short) (C1580rY.Xd() ^ (-352));
        int[] iArr = new int["\nG/\u0019\u0005\\w@Q-*\u0012ReSj%o&h\u0015_=".length()];
        QB qb = new QB("\nG/\u0019\u0005\\w@Q-*\u0012ReSj%o&h\u0015_=");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("a^lI[hchdTUb", (short) (FB.Xd() ^ 24656)), new Class[0]);
        try {
            method.setAccessible(true);
            DisplayMetrics displayMetrics = ((Resources) method.invoke(context, objArr)).getDisplayMetrics();
            this.mSurfaceHandler.setLayoutConstraints(View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE), 0, 0, doRTLSwap(context), isRTL(context), getPixelDensity(context));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @VisibleForTesting
    ReactSurfaceImpl(SurfaceHandler surfaceHandler, Context context) {
        this.mSurfaceView = new AtomicReference<>(null);
        this.mReactHost = new AtomicReference<>(null);
        this.mSurfaceHandler = surfaceHandler;
        this.mContext = context;
    }

    public static ReactSurfaceImpl createWithView(Context context, String str, @Nullable Bundle bundle) {
        ReactSurfaceImpl reactSurfaceImpl = new ReactSurfaceImpl(context, str, bundle);
        reactSurfaceImpl.attachView(new ReactSurfaceView(context, reactSurfaceImpl));
        return reactSurfaceImpl;
    }

    private static boolean doRTLSwap(Context context) {
        return I18nUtil.getInstance().doLeftAndRightSwapInRTL(context);
    }

    private static float getPixelDensity(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("u\u0004z\n\b\u0003~I\u007f\r\r\u0014\u0006\u0010\u0017Qg\u0015\u0015\u001c\u000e\"\u001f", (short) (OY.Xd() ^ 2815), (short) (OY.Xd() ^ 2079))).getMethod(C1561oA.od("LIW4FSNSO?@M", (short) (C1607wl.Xd() ^ 14754)), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static boolean isRTL(Context context) {
        return I18nUtil.getInstance().isRTL(context);
    }

    public /* synthetic */ void lambda$clear$0() {
        ReactSurfaceView reactSurfaceView = (ReactSurfaceView) getView();
        if (reactSurfaceView != null) {
            reactSurfaceView.removeAllViews();
            reactSurfaceView.setId(-1);
        }
    }

    public void attach(ReactHostImpl reactHostImpl) {
        if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.mReactHost, null, reactHostImpl)) {
            throw new IllegalStateException("This surface is already attached to a host!");
        }
    }

    public void attachView(ReactSurfaceView reactSurfaceView) {
        if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.mSurfaceView, null, reactSurfaceView)) {
            throw new IllegalStateException("Trying to call ReactSurface.attachView(), but the view is already attached.");
        }
        this.mContext = reactSurfaceView.getContext();
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public void clear() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.runtime.ReactSurfaceImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$clear$0();
            }
        });
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public void detach() {
        this.mReactHost.set(null);
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public Context getContext() {
        return this.mContext;
    }

    @Nullable
    EventDispatcher getEventDispatcher() {
        ReactHostImpl reactHostImpl = this.mReactHost.get();
        if (reactHostImpl == null) {
            return null;
        }
        return reactHostImpl.getEventDispatcher();
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public String getModuleName() {
        return this.mSurfaceHandler.getModuleName();
    }

    @VisibleForTesting
    ReactHostImpl getReactHost() {
        return this.mReactHost.get();
    }

    SurfaceHandler getSurfaceHandler() {
        return this.mSurfaceHandler;
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public int getSurfaceID() {
        return this.mSurfaceHandler.getSurfaceId();
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    @Nullable
    public ViewGroup getView() {
        return this.mSurfaceView.get();
    }

    @VisibleForTesting
    boolean isAttached() {
        return this.mReactHost.get() != null;
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public boolean isRunning() {
        return this.mSurfaceHandler.isRunning();
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public TaskInterface<Void> prerender() {
        ReactHostImpl reactHostImpl = this.mReactHost.get();
        return reactHostImpl == null ? Task.forError(new IllegalStateException("Trying to call ReactSurface.prerender(), but no ReactHost is attached.")) : reactHostImpl.prerenderSurface(this);
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public TaskInterface<Void> start() {
        if (this.mSurfaceView.get() == null) {
            return Task.forError(new IllegalStateException("Trying to call ReactSurface.start(), but view is not created."));
        }
        ReactHostImpl reactHostImpl = this.mReactHost.get();
        return reactHostImpl == null ? Task.forError(new IllegalStateException("Trying to call ReactSurface.start(), but no ReactHost is attached.")) : reactHostImpl.startSurface(this);
    }

    @Override // com.facebook.react.interfaces.fabric.ReactSurface
    public TaskInterface<Void> stop() {
        ReactHostImpl reactHostImpl = this.mReactHost.get();
        return reactHostImpl == null ? Task.forError(new IllegalStateException("Trying to call ReactSurface.stop(), but no ReactHost is attached.")) : reactHostImpl.stopSurface(this);
    }

    public void updateInitProps(Bundle bundle) {
        this.mSurfaceHandler.setProps((NativeMap) Arguments.fromBundle(bundle));
    }

    synchronized void updateLayoutSpecs(int i2, int i3, int i4, int i5) {
        this.mSurfaceHandler.setLayoutConstraints(i2, i3, i4, i5, doRTLSwap(this.mContext), isRTL(this.mContext), getPixelDensity(this.mContext));
    }
}
