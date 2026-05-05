package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.internal.gestures.NoOpWindowCallback;
import io.sentry.android.core.performance.WindowContentChangedCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public class FirstDrawDoneListener implements ViewTreeObserver.OnDrawListener {
    private final Runnable callback;
    private final Handler mainThreadHandler;
    private final AtomicReference<View> viewReference;

    private FirstDrawDoneListener(View view, Runnable runnable) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 3444);
        int[] iArr = new int["M[N]WRJ\u0015SX\u0010/OPNDn".length()];
        QB qb = new QB("M[N]WRJ\u0015SX\u0010/OPNDn");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Yd("dcsMbkqPtuwm{", (short) (C1607wl.Xd() ^ 12127)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.mainThreadHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.viewReference = new AtomicReference<>(view);
            this.callback = runnable;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static boolean isAliveAndAttached(View view) {
        return view.getViewTreeObserver().isAlive() && view.isAttachedToWindow();
    }

    static /* synthetic */ void lambda$registerForNextDraw$0(Window window, Window.Callback callback, Runnable runnable, BuildInfoProvider buildInfoProvider) {
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            window.setCallback(callback);
            registerForNextDraw(viewPeekDecorView, runnable, buildInfoProvider);
        }
    }

    public static void registerForNextDraw(Activity activity, final Runnable runnable, final BuildInfoProvider buildInfoProvider) {
        final Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                registerForNextDraw(viewPeekDecorView, runnable, buildInfoProvider);
            } else {
                final Window.Callback callback = window.getCallback();
                window.setCallback(new WindowContentChangedCallback(callback != null ? callback : new NoOpWindowCallback(), new Runnable() { // from class: io.sentry.android.core.internal.util.FirstDrawDoneListener$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        FirstDrawDoneListener.lambda$registerForNextDraw$0(window, callback, runnable, buildInfoProvider);
                    }
                }));
            }
        }
    }

    public static void registerForNextDraw(View view, Runnable runnable, BuildInfoProvider buildInfoProvider) {
        FirstDrawDoneListener firstDrawDoneListener = new FirstDrawDoneListener(view, runnable);
        if (buildInfoProvider.getSdkInfoVersion() >= 26 || isAliveAndAttached(view)) {
            view.getViewTreeObserver().addOnDrawListener(firstDrawDoneListener);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: io.sentry.android.core.internal.util.FirstDrawDoneListener.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view2.getViewTreeObserver().addOnDrawListener(FirstDrawDoneListener.this);
                    view2.removeOnAttachStateChangeListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$onDraw$1$io-sentry-android-core-internal-util-FirstDrawDoneListener, reason: not valid java name */
    /* synthetic */ void m8924x5598fc1d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() throws Throwable {
        final View andSet = this.viewReference.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.FirstDrawDoneListener$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f$0.m8924x5598fc1d(andSet);
            }
        });
        Handler handler = this.mainThreadHandler;
        Runnable runnable = this.callback;
        Class<?> cls = Class.forName(Xg.qd("7E<KID@\u000bMR\u000e)CQHQKY", (short) (FB.Xd() ^ 5722), (short) (FB.Xd() ^ 10053)));
        Class<?>[] clsArr = {Class.forName(Jg.Wd("YLtO\u0006G<+ne{Q\u0013t*k \u000b", (short) (Od.Xd() ^ (-18111)), (short) (Od.Xd() ^ (-16992))))};
        Object[] objArr = {runnable};
        short sXd = (short) (C1499aX.Xd() ^ (-5012));
        short sXd2 = (short) (C1499aX.Xd() ^ (-21918));
        int[] iArr = new int["[\u0019)CM7(\"{lG7\u00135Tv\u0005\u001e".length()];
        QB qb = new QB("[\u0019)CM7(\"{lG7\u00135Tv\u0005\u001e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
