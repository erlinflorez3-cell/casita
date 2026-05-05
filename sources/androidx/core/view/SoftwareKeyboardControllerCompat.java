package androidx.core.view;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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

/* JADX INFO: loaded from: classes4.dex */
public final class SoftwareKeyboardControllerCompat {
    private final Impl mImpl;

    public SoftwareKeyboardControllerCompat(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new Impl30(view);
        } else {
            this.mImpl = new Impl20(view);
        }
    }

    @Deprecated
    SoftwareKeyboardControllerCompat(WindowInsetsController windowInsetsController) {
        this.mImpl = new Impl30(windowInsetsController);
    }

    public void show() {
        this.mImpl.show();
    }

    public void hide() {
        this.mImpl.hide();
    }

    private static class Impl {
        void hide() {
        }

        void show() {
        }

        Impl() {
        }
    }

    static class Impl20 extends Impl {
        private final View mView;

        Impl20(View view) {
            this.mView = view;
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void show() {
            final View viewFindViewById = this.mView;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.mView.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.SoftwareKeyboardControllerCompat$Impl20$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    SoftwareKeyboardControllerCompat.Impl20.lambda$show$0(viewFindViewById);
                }
            });
        }

        static /* synthetic */ void lambda$show$0(View view) throws Throwable {
            Context context = view.getContext();
            short sXd = (short) (OY.Xd() ^ 27823);
            int[] iArr = new int["GKLPN8E<J=C7".length()];
            QB qb = new QB("GKLPN8E<J=C7");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = {new String(iArr, 0, i2)};
            Method method = Class.forName(C1561oA.Kd("t\u0003y\t\u0007\u0002}H~\f\f\u0013\u0005\u000f\u0016Pf\u0014\u0014\u001b\r!\u001e", (short) (ZN.Xd() ^ 8699))).getMethod(C1561oA.Xd("%$4\u0014;68*3\u001a-;@4/2", (short) (C1580rY.Xd() ^ (-25797))), Class.forName(Wg.Zd("B:&'\t))SZ\u007fCmM?mL", (short) (Od.Xd() ^ (-7444)), (short) (Od.Xd() ^ (-16242)))));
            try {
                method.setAccessible(true);
                ((InputMethodManager) method.invoke(context, objArr)).showSoftInput(view, 0);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void hide() throws Throwable {
            View view = this.mView;
            if (view != null) {
                Context context = view.getContext();
                Object[] objArr = {Wg.vd("!%&*(\u0012\u001f\u0016$\u0017\u001d\u0011", (short) (OY.Xd() ^ 19240))};
                Method method = Class.forName(Qg.kd("codqmf`)]hfk[ch!5`^cSe`", (short) (FB.Xd() ^ 5707), (short) (FB.Xd() ^ 10477))).getMethod(C1561oA.ud("qn|Z\u007fxxhoTeqtf_`", (short) (C1580rY.Xd() ^ (-13483))), Class.forName(hg.Vd("f\\pZ&cWc[!EebX\\T", (short) (C1607wl.Xd() ^ 6901), (short) (C1607wl.Xd() ^ 13272))));
                try {
                    method.setAccessible(true);
                    ((InputMethodManager) method.invoke(context, objArr)).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }

    static class Impl30 extends Impl20 {
        private View mView;
        private WindowInsetsController mWindowInsetsController;

        Impl30(View view) {
            super(view);
            this.mView = view;
        }

        Impl30(WindowInsetsController windowInsetsController) {
            super(null);
            this.mWindowInsetsController = windowInsetsController;
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void show() throws Throwable {
            if (this.mView != null && Build.VERSION.SDK_INT < 33) {
                Context context = this.mView.getContext();
                Object[] objArr = {ZO.xd("%\u001aZ\u000eXF[n\u000fZKi", (short) (C1580rY.Xd() ^ (-11607)), (short) (C1580rY.Xd() ^ (-11593)))};
                Method method = Class.forName(C1626yg.Ud("l|:\u0016QDlq*5n`R6~HF{_\u001cQ]\u001e", (short) (C1607wl.Xd() ^ 20261), (short) (C1607wl.Xd() ^ 13530))).getMethod(EO.Od("J\u0013o7T\u000b Q\bR^M{|\u0013w", (short) (Od.Xd() ^ (-22851))), Class.forName(Ig.wd("3| *'\tin\t~&i\u0019\u0006\u001b\u001d", (short) (FB.Xd() ^ 27890))));
                try {
                    method.setAccessible(true);
                    ((InputMethodManager) method.invoke(context, objArr)).isActive();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            WindowInsetsController windowInsetsController = this.mWindowInsetsController;
            if (windowInsetsController == null) {
                View view = this.mView;
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.show();
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void hide() throws Throwable {
            View view;
            WindowInsetsController windowInsetsController = this.mWindowInsetsController;
            if (windowInsetsController == null) {
                View view2 = this.mView;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.SoftwareKeyboardControllerCompat$Impl30$$ExternalSyntheticLambda0
                    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i2) {
                        atomicBoolean.set((i2 & 8) != 0);
                    }
                };
                windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                if (!atomicBoolean.get() && (view = this.mView) != null) {
                    Context context = view.getContext();
                    Object[] objArr = {C1561oA.yd("rx{\u0002\u0002m|u\u0006z\u0003x", (short) (C1607wl.Xd() ^ 22570))};
                    Method method = Class.forName(C1561oA.Yd("\u001e,#20+'q(55<.8?y\u0010==D6JG", (short) (OY.Xd() ^ 2171))).getMethod(Jg.Wd("P_7C2H\u0013,\u0002wn\u0005qiLR", (short) (C1633zX.Xd() ^ (-27392)), (short) (C1633zX.Xd() ^ (-19540))), Class.forName(Xg.qd("\u001c\u0014*\u0016c#\u0019'!h\u000f10(.(", (short) (ZN.Xd() ^ 23834), (short) (ZN.Xd() ^ 22724))));
                    try {
                        method.setAccessible(true);
                        ((InputMethodManager) method.invoke(context, objArr)).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                windowInsetsController.hide(WindowInsets.Type.ime());
                return;
            }
            super.hide();
        }
    }
}
