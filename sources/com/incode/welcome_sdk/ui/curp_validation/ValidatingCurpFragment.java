package com.incode.welcome_sdk.ui.curp_validation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.d.av;
import com.incode.welcome_sdk.data.remote.beans.ResponseAddCurp;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.views.IncodeTextView;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Map;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class ValidatingCurpFragment extends FragmentWithListener<ValidatingCurpFragmentInterface> {

    /* JADX INFO: renamed from: b */
    private static int f13155b = 0;

    /* JADX INFO: renamed from: i */
    private static int f13156i = 1;

    /* JADX INFO: renamed from: a */
    private String f13157a;

    /* JADX INFO: renamed from: c */
    private boolean f13158c;

    /* JADX INFO: renamed from: d */
    private CompositeDisposable f13159d = new CompositeDisposable();

    /* JADX INFO: renamed from: e */
    private av f13160e;

    public interface ValidatingCurpFragmentInterface {
        void validatingCurp_onComplete(String str, boolean z2, Map<String, Object> map);
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f13155b + 21;
        f13156i = i3 % 128;
        int i4 = i3 % 2;
        ScreenName screenName = ScreenName.VALIDATE_CURP;
        int i5 = f13156i + 109;
        f13155b = i5 % 128;
        int i6 = i5 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f13156i + 31;
        f13155b = i3 % 128;
        int i4 = i3 % 2;
        Modules modules = Modules.CURP_VALIDATION;
        int i5 = f13156i + 13;
        f13155b = i5 % 128;
        int i6 = i5 % 2;
        return modules;
    }

    public static ValidatingCurpFragment newInstance(String str, boolean z2) {
        int i2 = 2 % 2;
        ValidatingCurpFragment validatingCurpFragment = new ValidatingCurpFragment();
        Bundle bundle = new Bundle();
        bundle.putString("argCurp", str);
        bundle.putBoolean("argShowFailure", z2);
        validatingCurpFragment.setArguments(bundle);
        int i3 = f13155b + 71;
        f13156i = i3 % 128;
        int i4 = i3 % 2;
        return validatingCurpFragment;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public int getSoftInputMode() {
        int i2 = 2 % 2;
        int i3 = f13155b + 49;
        int i4 = i3 % 128;
        f13156i = i4;
        int i5 = i3 % 2 == 0 ? 67 : 16;
        int i6 = i4 + 65;
        f13155b = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f13155b + 69;
        f13156i = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnCreate(bundle);
        if (getArguments() == null) {
            return;
        }
        int i5 = f13156i + 79;
        f13155b = i5 % 128;
        if (i5 % 2 != 0) {
            this.f13157a = getArguments().getString("argCurp");
            this.f13158c = getArguments().getBoolean("argShowFailure");
            int i6 = 56 / 0;
        } else {
            this.f13157a = getArguments().getString("argCurp");
            this.f13158c = getArguments().getBoolean("argShowFailure");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f13156i + 11;
        f13155b = i3 % 128;
        int i4 = i3 % 2;
        this.f13160e = av.c(layoutInflater, viewGroup);
        c();
        a(this.f13157a, this.f13158c);
        ConstraintLayout constraintLayoutC = this.f13160e.c();
        int i5 = f13155b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f13156i = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayoutC;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        int i2 = 2 % 2;
        int i3 = f13155b + 39;
        f13156i = i3 % 128;
        if (i3 % 2 == 0) {
            super.onStop();
            this.f13159d.clear();
            int i4 = 73 / 0;
        } else {
            super.onStop();
            this.f13159d.clear();
        }
    }

    private void c() {
        int i2 = 2 % 2;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.onboard_sdk_rotate);
        animationLoadAnimation.setFillAfter(true);
        animationLoadAnimation.setInterpolator(new LinearInterpolator());
        this.f13160e.f6967b.startAnimation(animationLoadAnimation);
        int i3 = f13156i + 101;
        f13155b = i3 % 128;
        int i4 = i3 % 2;
    }

    private void d() {
        int i2 = 2 % 2;
        int i3 = f13156i + 53;
        f13155b = i3 % 128;
        if (i3 % 2 != 0) {
            this.f13160e.f6967b.clearAnimation();
            int i4 = 45 / 0;
        } else {
            this.f13160e.f6967b.clearAnimation();
        }
    }

    private void a(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        d();
        this.f13160e.f6967b.setImageResource(z2 ? R.drawable.onboard_sdk_ic_success : R.drawable.onboard_sdk_ic_failure);
        IncodeTextView incodeTextView = this.f13160e.f6968d;
        Object obj = null;
        if (z2) {
            int i4 = f13155b + 21;
            f13156i = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = R.string.onboard_sdk_curp_verified;
                throw null;
            }
            i2 = R.string.onboard_sdk_curp_verified;
        } else {
            i2 = R.string.onboard_sdk_curp_not_verified;
        }
        incodeTextView.setText(i2);
        int i6 = f13155b + 85;
        f13156i = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void d(String str, boolean z2, ResponseAddCurp responseAddCurp) throws Exception {
        int i2 = 2 % 2;
        int i3 = f13156i + 85;
        f13155b = i3 % 128;
        if (i3 % 2 != 0) {
            d(str, responseAddCurp.isValid(), responseAddCurp.getData(), z2);
            int i4 = 91 / 0;
        } else {
            d(str, responseAddCurp.isValid(), responseAddCurp.getData(), z2);
        }
        int i5 = f13155b + 101;
        f13156i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
    }

    public /* synthetic */ void b(String str, boolean z2, Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f13156i + 25;
        f13155b = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th);
        Object obj = null;
        d(str, false, null, z2);
        int i5 = f13155b + 5;
        f13156i = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void a(final String str, final boolean z2) {
        int i2 = 2 % 2;
        int i3 = f13155b + 33;
        f13156i = i3 % 128;
        if (i3 % 2 != 0) {
            this.f13159d.add(getRepo().addCurp(str).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.d(str, z2, (ResponseAddCurp) obj);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.b(str, z2, (Throwable) obj);
                }
            }));
            return;
        }
        this.f13159d.add(getRepo().addCurp(str).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.d(str, z2, (ResponseAddCurp) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.b(str, z2, (Throwable) obj);
            }
        }));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void b(String str, boolean z2, Map map, Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f13156i + 33;
        f13155b = i3 % 128;
        int i4 = i3 % 2;
        getListener().validatingCurp_onComplete(str, z2, map);
        int i5 = f13156i + 91;
        f13155b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
    }

    public /* synthetic */ void c(String str, boolean z2, Map map, Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f13155b + 43;
        f13156i = i3 % 128;
        int i4 = i3 % 2;
        getListener().validatingCurp_onComplete(str, z2, map);
        int i5 = f13155b + 65;
        f13156i = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(final java.lang.String r6, final boolean r7, final java.util.Map<java.lang.String, java.lang.Object> r8, boolean r9) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            if (r7 != 0) goto L12
            int r0 = com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment.f13156i
            int r1 = r0 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment.f13155b = r0
            int r1 = r1 % r4
            r0 = 1
            r9 = r9 ^ r0
            if (r9 == r0) goto L15
        L12:
            r5.a(r7)
        L15:
            io.reactivex.disposables.CompositeDisposable r3 = r5.f13159d
            r0 = 2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.Observable r2 = io.reactivex.Observable.timer(r0, r2)
            com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment$$ExternalSyntheticLambda2 r1 = new com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment$$ExternalSyntheticLambda2
            r1.<init>()
            com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment$$ExternalSyntheticLambda3 r0 = new com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment$$ExternalSyntheticLambda3
            r0.<init>()
            io.reactivex.disposables.Disposable r0 = r2.subscribe(r1, r0)
            r3.add(r0)
            int r0 = com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment.f13156i
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment.f13155b = r0
            int r1 = r1 % r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.curp_validation.ValidatingCurpFragment.d(java.lang.String, boolean, java.util.Map, boolean):void");
    }
}
