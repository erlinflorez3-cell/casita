package com.incode.welcome_sdk.ui.results.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.android.material.tabs.TabLayout;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.subjects.PublishSubject;

/* JADX INFO: loaded from: classes5.dex */
public class PersistentIconsTabLayout extends TabLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17249b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17250d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CompositeDisposable f17251a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    PublishSubject<Object> f17252e;

    public PersistentIconsTabLayout(Context context) {
        super(context);
        this.f17251a = new CompositeDisposable();
        this.f17252e = PublishSubject.create();
    }

    @Override // com.google.android.material.tabs.TabLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i2 = 2 % 2;
        int i3 = f17250d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17249b = i3 % 128;
        int i4 = i3 % 2;
        this.f17251a.clear();
        super.onDetachedFromWindow();
        int i5 = f17249b + 15;
        f17250d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public PersistentIconsTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17251a = new CompositeDisposable();
        this.f17252e = PublishSubject.create();
    }

    public PersistentIconsTabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f17251a = new CompositeDisposable();
        this.f17252e = PublishSubject.create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(ViewPager viewPager, PageIconProvider pageIconProvider, Object obj) throws Exception {
        int i2 = 2 % 2;
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter != null) {
            int i3 = f17249b + 91;
            f17250d = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 < adapter.getCount(); i5++) {
                TabLayout.Tab tabAt = getTabAt(i5);
                if (tabAt != null) {
                    int i6 = f17249b + 95;
                    f17250d = i6 % 128;
                    if (i6 % 2 != 0) {
                        tabAt.setCustomView(c(viewPager.getContext(), pageIconProvider.getPageIcon(i5)));
                    } else {
                        tabAt.setCustomView(c(viewPager.getContext(), pageIconProvider.getPageIcon(i5)));
                        throw null;
                    }
                }
            }
        }
        int i7 = f17249b + 5;
        f17250d = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setupWithViewPagerAndIconProvider(final androidx.viewpager.widget.ViewPager r6, final com.incode.welcome_sdk.ui.results.common.PageIconProvider r7) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.results.common.PersistentIconsTabLayout.f17250d
            int r1 = r0 + 37
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.results.common.PersistentIconsTabLayout.f17249b = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L5a
            r5.setupWithViewPager(r6)
            r0 = 75
            int r0 = r0 / 0
            if (r6 == 0) goto L4e
        L17:
            if (r7 == 0) goto L4e
            io.reactivex.disposables.CompositeDisposable r3 = r5.f17251a
            io.reactivex.subjects.PublishSubject<java.lang.Object> r1 = r5.f17252e
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r2 = r1.observeOn(r0)
            com.incode.welcome_sdk.ui.results.common.PersistentIconsTabLayout$$ExternalSyntheticLambda0 r1 = new com.incode.welcome_sdk.ui.results.common.PersistentIconsTabLayout$$ExternalSyntheticLambda0
            r1.<init>()
            com.incode.welcome_sdk.ui.results.common.PersistentIconsTabLayout$$ExternalSyntheticLambda1 r0 = new com.incode.welcome_sdk.ui.results.common.PersistentIconsTabLayout$$ExternalSyntheticLambda1
            r0.<init>()
            io.reactivex.disposables.Disposable r0 = r2.subscribe(r1, r0)
            r3.add(r0)
            io.reactivex.subjects.PublishSubject<java.lang.Object> r1 = r5.f17252e
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.onNext(r0)
            androidx.viewpager.widget.PagerAdapter r1 = r6.getAdapter()
            if (r1 == 0) goto L4e
            com.incode.welcome_sdk.ui.results.common.PersistentIconsTabLayout$1 r0 = new com.incode.welcome_sdk.ui.results.common.PersistentIconsTabLayout$1
            r0.<init>()
            r1.registerDataSetObserver(r0)
        L4e:
            int r0 = com.incode.welcome_sdk.ui.results.common.PersistentIconsTabLayout.f17249b
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.results.common.PersistentIconsTabLayout.f17250d = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L60
            return
        L5a:
            r5.setupWithViewPager(r6)
            if (r6 == 0) goto L4e
            goto L17
        L60:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.results.common.PersistentIconsTabLayout.setupWithViewPagerAndIconProvider(androidx.viewpager.widget.ViewPager, com.incode.welcome_sdk.ui.results.common.PageIconProvider):void");
    }

    private static View c(Context context, int i2) {
        int i3 = 2 % 2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        appCompatImageView.setImageResource(i2);
        int i4 = f17250d + 47;
        f17249b = i4 % 128;
        int i5 = i4 % 2;
        return appCompatImageView;
    }
}
