package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;

/* JADX INFO: loaded from: classes9.dex */
class ClickActionDelegate extends AccessibilityDelegateCompat {
    private final AccessibilityNodeInfoCompat.AccessibilityActionCompat clickAction;

    public ClickActionDelegate(Context context, int i2) throws Throwable {
        Class<?> cls = Class.forName(EO.Od("B}cXV\u0005\u001a\u001ey\t\fi\u0005\u0016\u000e$u6_\u001c#\u0011\u001d", (short) (C1607wl.Xd() ^ 1916)));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        Method method = cls.getMethod(C1561oA.Qd("PM[9YVLPH", (short) (C1633zX.Xd() ^ (-13755))), clsArr);
        try {
            method.setAccessible(true);
            this.clickAction = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, (String) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(this.clickAction);
    }
}
