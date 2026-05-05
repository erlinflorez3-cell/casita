package com.incode.welcome_sdk.ui.tutorial.adapters;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/* JADX INFO: loaded from: classes5.dex */
public class TutorialFrontAdapter extends FragmentStatePagerAdapter {

    /* JADX INFO: renamed from: c */
    private static int f17931c = 0;

    /* JADX INFO: renamed from: e */
    private static int f17932e = 1;

    /* JADX INFO: renamed from: a */
    private final int f17933a;

    /* JADX INFO: renamed from: b */
    private final boolean f17934b;

    public TutorialFrontAdapter(FragmentManager fragmentManager, boolean z2) {
        super(fragmentManager, 1);
        this.f17934b = z2;
        this.f17933a = z2 ? 5 : 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0029  */
    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.fragment.app.Fragment getItem(int r6) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r2 = com.incode.welcome_sdk.ui.tutorial.adapters.TutorialFrontAdapter.f17932e
            int r1 = r2 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.tutorial.adapters.TutorialFrontAdapter.f17931c = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L25
            boolean r1 = r5.f17934b
            r0 = 35
            int r0 = r0 / 0
            if (r1 == 0) goto L29
        L16:
            if (r6 == 0) goto L5f
            r0 = 1
            r3 = 0
            if (r6 == r0) goto L4e
            if (r6 == r4) goto L3d
            r0 = 3
            if (r6 == r0) goto L38
            r0 = 4
            if (r6 == r0) goto L33
            return r3
        L25:
            boolean r0 = r5.f17934b
            if (r0 != 0) goto L16
        L29:
            int r6 = r6 + 1
            int r1 = r2 + 55
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.tutorial.adapters.TutorialFrontAdapter.f17931c = r0
            int r1 = r1 % r4
            goto L16
        L33:
            com.incode.welcome_sdk.ui.tutorial.fragments.TutorialFront4Fragment r0 = com.incode.welcome_sdk.ui.tutorial.fragments.TutorialFront4Fragment.newInstance()
            return r0
        L38:
            com.incode.welcome_sdk.ui.tutorial.fragments.TutorialFront3Fragment r0 = com.incode.welcome_sdk.ui.tutorial.fragments.TutorialFront3Fragment.newInstance()
            return r0
        L3d:
            com.incode.welcome_sdk.ui.tutorial.fragments.TutorialFront2Fragment r2 = com.incode.welcome_sdk.ui.tutorial.fragments.TutorialFront2Fragment.newInstance()
            int r0 = com.incode.welcome_sdk.ui.tutorial.adapters.TutorialFrontAdapter.f17932e
            int r1 = r0 + 119
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.tutorial.adapters.TutorialFrontAdapter.f17931c = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L4d
            return r2
        L4d:
            throw r3
        L4e:
            com.incode.welcome_sdk.ui.tutorial.fragments.TutorialFront1Fragment r2 = com.incode.welcome_sdk.ui.tutorial.fragments.TutorialFront1Fragment.newInstance()
            int r0 = com.incode.welcome_sdk.ui.tutorial.adapters.TutorialFrontAdapter.f17931c
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.tutorial.adapters.TutorialFrontAdapter.f17932e = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L5e
            return r2
        L5e:
            throw r3
        L5f:
            com.incode.welcome_sdk.ui.tutorial.fragments.TutorialAgeAssuranceFragment r2 = com.incode.welcome_sdk.ui.tutorial.fragments.TutorialAgeAssuranceFragment.newInstance()
            int r0 = com.incode.welcome_sdk.ui.tutorial.adapters.TutorialFrontAdapter.f17931c
            int r1 = r0 + 125
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.tutorial.adapters.TutorialFrontAdapter.f17932e = r0
            int r1 = r1 % r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.tutorial.adapters.TutorialFrontAdapter.getItem(int):androidx.fragment.app.Fragment");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        int i2 = 2 % 2;
        int i3 = f17932e;
        int i4 = i3 + 41;
        f17931c = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f17933a;
        int i7 = i3 + 93;
        f17931c = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }
}
