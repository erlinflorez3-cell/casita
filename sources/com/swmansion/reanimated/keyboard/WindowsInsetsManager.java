package com.swmansion.reanimated.keyboard;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.R;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class WindowsInsetsManager {
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;
    private final WeakReference<ReactApplicationContext> mReactContext;
    private boolean mIsStatusBarTranslucent = false;
    private boolean mIsNavigationBarTranslucent = false;
    private final String MissingContextErrorMsg = "Unable to get reference to react activity";

    public WindowsInsetsManager(WeakReference<ReactApplicationContext> weakReference, Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction) {
        this.mReactContext = weakReference;
        this.mKeyboard = keyboard;
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
    }

    private Activity getCurrentActivity() {
        return this.mReactContext.get().getCurrentActivity();
    }

    private FrameLayout.LayoutParams getLayoutParams(int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.mIsStatusBarTranslucent) {
            i2 = 0;
        }
        if (this.mIsNavigationBarTranslucent) {
            i3 = 0;
        }
        layoutParams.setMargins(0, i2, 0, i3);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateInsets$1(int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = getLayoutParams(i2, i3);
        int i4 = R.id.action_bar_root;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.getWindow().getDecorView().findViewById(i4).setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateWindowDecor$0(boolean z2) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        WindowCompat.setDecorFitsSystemWindows(currentActivity.getWindow(), z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindowInsetsCompat onApplyWindowInsetsListener(View view, WindowInsetsCompat windowInsetsCompat) throws Throwable {
        WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
        if (this.mKeyboard.getState() == KeyboardState.OPEN) {
            this.mKeyboard.updateHeight(windowInsetsCompat, this.mIsNavigationBarTranslucent);
            this.mNotifyAboutKeyboardChange.call();
        }
        setWindowInsets(windowInsetsCompatOnApplyWindowInsets);
        return windowInsetsCompatOnApplyWindowInsets;
    }

    private void setWindowInsets(WindowInsetsCompat windowInsetsCompat) throws Throwable {
        int iSystemBars = WindowInsetsCompat.Type.systemBars();
        updateInsets(windowInsetsCompat.getInsets(iSystemBars).top, windowInsetsCompat.getInsets(iSystemBars).bottom);
    }

    private void updateInsets(final int i2, final int i3) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.yd("iun{slj3\u007f\u0003@]{z~rj", (short) (Od.Xd() ^ (-800)))).getDeclaredMethod(C1561oA.Yd("^]mG\\ekJnoqgu", (short) (C1499aX.Xd() ^ (-32475))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Object[] objArr2 = {new Runnable() { // from class: com.swmansion.reanimated.keyboard.WindowsInsetsManager$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$updateInsets$1(i2, i3);
                }
            }};
            Method method = Class.forName(Xg.qd("KYP_]XT\u001faf\"=We\\e_m", (short) (C1607wl.Xd() ^ 5623), (short) (C1607wl.Xd() ^ 31139))).getMethod(ZO.xd("5`JR", (short) (Od.Xd() ^ (-19375)), (short) (Od.Xd() ^ (-28687))), Class.forName(Jg.Wd("EG~k\\lc\u0015\u000f(p\u00151|p\u0015\"l", (short) (C1580rY.Xd() ^ (-1450)), (short) (C1580rY.Xd() ^ (-1993)))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private void updateWindowDecor(final boolean z2) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1626yg.Ud("#Pm9\nay?L.=\u0011zCdxC", (short) (C1580rY.Xd() ^ (-8749)), (short) (C1580rY.Xd() ^ (-15434)))).getDeclaredMethod(Ig.wd("o<YV\u001bE*\tP\u0001\u0004\u0017T", (short) (FB.Xd() ^ 11697)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Runnable runnable = new Runnable() { // from class: com.swmansion.reanimated.keyboard.WindowsInsetsManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$updateWindowDecor$0(z2);
                }
            };
            short sXd = (short) (FB.Xd() ^ 3459);
            int[] iArr = new int["s(N\u0003\u001ap=iy\u007f6pTqa\u000eCT".length()];
            QB qb = new QB("s(N\u0003\u001ap=iy\u007f6pTqa\u000eCT");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr2 = {runnable};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1593ug.zd("<<AC", (short) (FB.Xd() ^ 1263), (short) (FB.Xd() ^ 21161)), Class.forName(C1561oA.Qd("f\\pZ&cWc[!Df^]OOXP", (short) (C1499aX.Xd() ^ (-10922)))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public void startObservingChanges(KeyboardAnimationCallback keyboardAnimationCallback, boolean z2, boolean z3) throws Throwable {
        this.mIsStatusBarTranslucent = z2;
        this.mIsNavigationBarTranslucent = z3;
        updateWindowDecor(false);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        ViewCompat.setOnApplyWindowInsetsListener(decorView, new OnApplyWindowInsetsListener() { // from class: com.swmansion.reanimated.keyboard.WindowsInsetsManager$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.onApplyWindowInsetsListener(view, windowInsetsCompat);
            }
        });
        ViewCompat.setWindowInsetsAnimationCallback(decorView, keyboardAnimationCallback);
    }

    public void stopObservingChanges() throws Throwable {
        updateWindowDecor((this.mIsStatusBarTranslucent || this.mIsNavigationBarTranslucent) ? false : true);
        updateInsets(0, 0);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        ViewCompat.setWindowInsetsAnimationCallback(decorView, null);
        ViewCompat.setOnApplyWindowInsetsListener(decorView, null);
    }
}
