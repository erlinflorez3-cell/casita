package androidx.core.view;

import android.view.ScaleGestureDetector;
import androidx.annotation.ReplaceWith;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes4.dex */
public final class ScaleGestureDetectorCompat {
    private ScaleGestureDetectorCompat() {
    }

    @Deprecated
    public static void setQuickScaleEnabled(Object obj, boolean z2) {
        setQuickScaleEnabled((ScaleGestureDetector) obj, z2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0017-\u0018\u001f\u0003Gb\\LR<\u001b49D$\u000e\u0004kY\u0011;\u0018e/W7\u001d\"mke]*D[:2(\u001d\b>wnM\u0005{_Yq", imports = {})
    @Deprecated
    public static void setQuickScaleEnabled(ScaleGestureDetector scaleGestureDetector, boolean z2) {
        scaleGestureDetector.setQuickScaleEnabled(z2);
    }

    @Deprecated
    public static boolean isQuickScaleEnabled(Object obj) {
        return isQuickScaleEnabled((ScaleGestureDetector) obj);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0017-\u0018\u001f\u0003Gb\\LR<\u001b49D$\u000e\u0004kY\u00111&BSK1%\n}ipV\nmN;<!\u001cK?", imports = {})
    @Deprecated
    public static boolean isQuickScaleEnabled(ScaleGestureDetector scaleGestureDetector) {
        return scaleGestureDetector.isQuickScaleEnabled();
    }
}
