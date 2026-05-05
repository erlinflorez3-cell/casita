package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ak {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6403b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6404c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f6405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AccessibilityManager f6406e;

    public ak(AccessibilityManager accessibilityManager, Context context) {
        Intrinsics.checkNotNullParameter(accessibilityManager, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.f6406e = accessibilityManager;
        this.f6405d = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.utils.ak.f6403b
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.ak.f6404c = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 == 0) goto L2f
            android.view.accessibility.AccessibilityManager r0 = r4.f6406e
            boolean r1 = r0.isEnabled()
            r0 = 15
            int r0 = r0 / r2
            if (r1 == 0) goto L37
        L1a:
            android.view.accessibility.AccessibilityManager r0 = r4.f6406e
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L37
            int r0 = com.incode.welcome_sdk.commons.utils.ak.f6403b
            int r1 = r0 + 27
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.ak.f6404c = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L38
            r0 = 1
            return r0
        L2f:
            android.view.accessibility.AccessibilityManager r0 = r4.f6406e
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L1a
        L37:
            return r2
        L38:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.ak.d():boolean");
    }

    public final void e(String str) {
        AccessibilityEvent accessibilityEventObtain;
        int i2 = 2 % 2;
        int i3 = f6403b + 75;
        f6404c = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            d();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (d()) {
            int i4 = f6403b + 59;
            f6404c = i4 % 128;
            int i5 = i4 % 2;
            if (Build.VERSION.SDK_INT >= 30) {
                accessibilityEventObtain = new AccessibilityEvent();
            } else {
                accessibilityEventObtain = AccessibilityEvent.obtain();
                int i6 = f6404c + 79;
                f6403b = i6 % 128;
                int i7 = i6 % 2;
            }
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.setClassName(accessibilityEventObtain.getClass().getName());
            accessibilityEventObtain.setPackageName(this.f6405d.getPackageName());
            accessibilityEventObtain.getText().add(str);
            this.f6406e.sendAccessibilityEvent(accessibilityEventObtain);
        }
        int i8 = f6404c + 19;
        f6403b = i8 % 128;
        int i9 = i8 % 2;
    }

    public final void a(int i2) {
        int i3 = 2 % 2;
        int i4 = f6403b + 59;
        f6404c = i4 % 128;
        if (i4 % 2 != 0) {
            String string = this.f6405d.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "");
            e(string);
            int i5 = 22 / 0;
            return;
        }
        String string2 = this.f6405d.getString(i2);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        e(string2);
    }
}
