package androidx.transition;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
class ViewUtilsApi23 extends ViewUtilsApi22 {
    private static boolean sTryHiddenSetTransitionVisibility = true;

    ViewUtilsApi23() {
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void setTransitionVisibility(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.setTransitionVisibility(view, i2);
        } else if (sTryHiddenSetTransitionVisibility) {
            try {
                Api29Impl.setTransitionVisibility(view, i2);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetTransitionVisibility = false;
            }
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void setTransitionVisibility(View view, int i2) {
            view.setTransitionVisibility(i2);
        }
    }
}
