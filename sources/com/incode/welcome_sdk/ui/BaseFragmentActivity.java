package com.incode.welcome_sdk.ui;

import android.os.Bundle;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.ui.BaseActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseFragmentActivity extends BaseActivity {

    /* JADX INFO: renamed from: b */
    private static int f10804b = 1;

    /* JADX INFO: renamed from: d */
    private static int f10805d = 0;

    /* JADX INFO: renamed from: f */
    private static int f10806f = 1;

    /* JADX INFO: renamed from: i */
    private static int f10807i = 0;

    /* JADX INFO: renamed from: c */
    private final BaseActivity.Config f10808c = BaseActivity.Config.copy$default(super.getConfig(), false, true, false, false, null, 29, null);

    /* JADX INFO: renamed from: e */
    private final boolean f10809e = true;

    public abstract FragmentWithListener<?> getFirstFragment();

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public BaseActivity.Config getConfig() {
        int i2 = 2 % 2;
        int i3 = f10804b;
        int i4 = i3 + 113;
        f10805d = i4 % 128;
        int i5 = i4 % 2;
        BaseActivity.Config config = this.f10808c;
        int i6 = i3 + 111;
        f10805d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 13 / 0;
        }
        return config;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnCreate(Bundle bundle) throws Exception {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        prepareFirstFragment();
        if (bundle == null) {
            int i3 = f10805d + 115;
            f10804b = i3 % 128;
            int i4 = i3 % 2;
            e();
            int i5 = f10804b + 85;
            f10805d = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void prepareFirstFragment() {
        int i2 = 2 % 2;
        int i3 = f10804b + 89;
        f10805d = i3 % 128;
        int i4 = i3 % 2;
    }

    public boolean getAddFirstFragmentToBackStack() {
        int i2 = 2 % 2;
        int i3 = f10805d;
        int i4 = i3 + 37;
        f10804b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f10809e;
        int i5 = i3 + 109;
        f10804b = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[PHI: r2
  0x005d: PHI (r2v2 androidx.fragment.app.FragmentTransaction) = (r2v1 androidx.fragment.app.FragmentTransaction), (r2v5 androidx.fragment.app.FragmentTransaction) binds: [B:20:0x005b, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e() throws java.lang.Exception {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.BaseFragmentActivity.f10804b
            int r1 = r0 + 121
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseFragmentActivity.f10805d = r0
            int r1 = r1 % r4
            java.lang.String r3 = ""
            if (r1 == 0) goto L3a
            androidx.fragment.app.FragmentManager r0 = r5.getSupportFragmentManager()
            yg.CX.ud()
            androidx.fragment.app.FragmentTransaction r2 = r0.beginTransaction()
            int r1 = com.incode.welcome_sdk.R.id.fragmentContainer
            com.incode.welcome_sdk.commons.ui.FragmentWithListener r0 = r5.getFirstFragment()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentTransaction r2 = r2.add(r1, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r1 = r5.getAddFirstFragmentToBackStack()
            r0 = 5
            int r0 = r0 / 0
            if (r1 != 0) goto L5d
        L36:
            r2.commit()
            return
        L3a:
            androidx.fragment.app.FragmentManager r0 = r5.getSupportFragmentManager()
            yg.CX.ud()
            androidx.fragment.app.FragmentTransaction r2 = r0.beginTransaction()
            int r1 = com.incode.welcome_sdk.R.id.fragmentContainer
            com.incode.welcome_sdk.commons.ui.FragmentWithListener r0 = r5.getFirstFragment()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentTransaction r2 = r2.add(r1, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r0 = r5.getAddFirstFragmentToBackStack()
            if (r0 == 0) goto L36
        L5d:
            java.lang.String r0 = "first"
            r2.addToBackStack(r0)
            int r0 = com.incode.welcome_sdk.ui.BaseFragmentActivity.f10805d
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseFragmentActivity.f10804b = r0
            int r1 = r1 % r4
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.BaseFragmentActivity.e():void");
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
        int i2 = f10807i + 67;
        f10806f = i2 % 128;
        int i3 = i2 % 2;
    }
}
