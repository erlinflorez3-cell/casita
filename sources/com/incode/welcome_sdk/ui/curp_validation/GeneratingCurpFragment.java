package com.incode.welcome_sdk.ui.curp_validation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.d.aw;
import com.incode.welcome_sdk.data.remote.beans.ResponseAddCurpV2;
import com.incode.welcome_sdk.modules.Modules;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class GeneratingCurpFragment extends FragmentWithListener<GeneratingCurpFragmentInterface> {

    /* JADX INFO: renamed from: i */
    private static int f13144i = 0;

    /* JADX INFO: renamed from: l */
    private static int f13145l = 1;

    /* JADX INFO: renamed from: a */
    private CompositeDisposable f13146a = new CompositeDisposable();

    /* JADX INFO: renamed from: b */
    private String f13147b;

    /* JADX INFO: renamed from: c */
    private String f13148c;

    /* JADX INFO: renamed from: d */
    private String f13149d;

    /* JADX INFO: renamed from: e */
    private String f13150e;

    /* JADX INFO: renamed from: f */
    private aw f13151f;

    /* JADX INFO: renamed from: g */
    private String f13152g;

    /* JADX INFO: renamed from: h */
    private String f13153h;

    /* JADX INFO: renamed from: j */
    private boolean f13154j;

    public interface GeneratingCurpFragmentInterface {
        void generatingCurp_onComplete(String str, boolean z2, Map<String, Object> map);
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public ScreenName getScreenName() {
        ScreenName screenName;
        int i2 = 2 % 2;
        int i3 = f13144i + 87;
        f13145l = i3 % 128;
        if (i3 % 2 == 0) {
            screenName = ScreenName.GENERATE_CURP;
            int i4 = 5 / 0;
        } else {
            screenName = ScreenName.GENERATE_CURP;
        }
        int i5 = f13144i + 69;
        f13145l = i5 % 128;
        if (i5 % 2 != 0) {
            return screenName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f13144i + 31;
        f13145l = i3 % 128;
        int i4 = i3 % 2;
        Modules modules = Modules.CURP_VALIDATION;
        if (i4 != 0) {
            return modules;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GeneratingCurpFragment newInstance(String str, String str2, String str3, int i2, String str4, int i3, boolean z2) {
        int i4 = 2 % 2;
        GeneratingCurpFragment generatingCurpFragment = new GeneratingCurpFragment();
        Bundle bundle = new Bundle();
        bundle.putString("argName", str);
        bundle.putString("argFirstLastName", str2);
        bundle.putString("argSecondLastName", str3);
        bundle.putInt("argGender", i2);
        bundle.putString("argBirthDate", str4);
        bundle.putInt("argState", i3);
        bundle.putBoolean("argHasAttemptsLeft", z2);
        generatingCurpFragment.setArguments(bundle);
        int i5 = f13144i + 15;
        f13145l = i5 % 128;
        int i6 = i5 % 2;
        return generatingCurpFragment;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public int getSoftInputMode() {
        int i2 = 2 % 2;
        int i3 = f13144i;
        int i4 = i3 + 113;
        f13145l = i4 % 128;
        int i5 = i4 % 2 == 0 ? 23 : 16;
        int i6 = i3 + 105;
        f13145l = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f13145l + 71;
        f13144i = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnCreate(bundle);
        if (getArguments() != null) {
            int i5 = f13144i + 57;
            f13145l = i5 % 128;
            int i6 = i5 % 2;
            this.f13149d = getArguments().getString("argName");
            this.f13148c = getArguments().getString("argFirstLastName");
            this.f13147b = getArguments().getString("argSecondLastName");
            this.f13153h = getArguments().getString("argBirthDate");
            this.f13150e = getResources().getStringArray(R.array.onboard_sdk_genders_values)[getArguments().getInt("argGender") - 1];
            this.f13152g = getResources().getStringArray(R.array.onboard_sdk_mexico_states_values)[getArguments().getInt("argState") - 1];
            this.f13154j = getArguments().getBoolean("argHasAttemptsLeft");
        }
        int i7 = f13144i + 79;
        f13145l = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f13145l + 53;
        f13144i = i3 % 128;
        int i4 = i3 % 2;
        this.f13151f = aw.e(layoutInflater, viewGroup);
        e();
        c(this.f13149d, this.f13148c, this.f13147b, this.f13150e, this.f13153h, this.f13152g);
        ConstraintLayout constraintLayoutC = this.f13151f.c();
        int i5 = f13144i + 95;
        f13145l = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayoutC;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        int i2 = 2 % 2;
        int i3 = f13144i + 105;
        f13145l = i3 % 128;
        int i4 = i3 % 2;
        super.onStop();
        this.f13146a.clear();
        int i5 = f13145l + 123;
        f13144i = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void e() {
        int i2 = 2 % 2;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.onboard_sdk_rotate);
        animationLoadAnimation.setFillAfter(true);
        animationLoadAnimation.setInterpolator(new LinearInterpolator());
        this.f13151f.f6971c.startAnimation(animationLoadAnimation);
        int i3 = f13144i + 63;
        f13145l = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
        }
    }

    private void a() {
        int i2 = 2 % 2;
        int i3 = f13144i + 9;
        f13145l = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f13151f.f6971c.clearAnimation();
            int i4 = f13145l + 57;
            f13144i = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.f13151f.f6971c.clearAnimation();
        throw null;
    }

    private void e(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        a();
        ImageView imageView = this.f13151f.f6971c;
        if (z2) {
            i2 = R.drawable.onboard_sdk_ic_success;
            int i4 = f13144i + 39;
            f13145l = i4 % 128;
            int i5 = i4 % 2;
        } else {
            i2 = R.drawable.onboard_sdk_ic_failure;
        }
        imageView.setImageResource(i2);
        if (z2) {
            int i6 = f13145l + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f13144i = i6 % 128;
            int i7 = i6 % 2;
            this.f13151f.f6970a.setText(R.string.onboard_sdk_curp_verified);
            return;
        }
        this.f13151f.f6970a.setText(R.string.onboard_sdk_curp_generating_failure_title);
        if (this.f13154j) {
            int i8 = f13145l + 53;
            f13144i = i8 % 128;
            int i9 = i8 % 2;
            this.f13151f.f6973e.setVisibility(0);
        }
    }

    public /* synthetic */ void b(ResponseAddCurpV2 responseAddCurpV2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f13145l + 41;
        f13144i = i3 % 128;
        int i4 = i3 % 2;
        c(responseAddCurpV2.getCurp(), responseAddCurpV2.isValid(), responseAddCurpV2.getData());
        int i5 = f13145l + 41;
        f13144i = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void e(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f13145l + 69;
        f13144i = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th);
        c(null, false, null);
        int i5 = f13144i + 117;
        f13145l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
    }

    private void c(String str, String str2, String str3, String str4, String str5, String str6) {
        int i2 = 2 % 2;
        int i3 = f13144i + 67;
        f13145l = i3 % 128;
        int i4 = i3 % 2;
        this.f13146a.add(getRepo().addCurpV2(str, str2, str3, str4, str5, str6).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.curp_validation.GeneratingCurpFragment$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.b((ResponseAddCurpV2) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.curp_validation.GeneratingCurpFragment$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.e((Throwable) obj);
            }
        }));
        int i5 = f13145l + 25;
        f13144i = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
    }

    public /* synthetic */ void e(String str, boolean z2, Map map, Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f13145l + 69;
        f13144i = i3 % 128;
        int i4 = i3 % 2;
        getListener().generatingCurp_onComplete(str, z2, map);
        int i5 = f13144i + 103;
        f13145l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
    }

    public /* synthetic */ void d(String str, boolean z2, Map map, Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f13144i + 105;
        f13145l = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.e(th);
            getListener().generatingCurp_onComplete(str, z2, map);
            int i4 = 69 / 0;
        } else {
            Timber.e(th);
            getListener().generatingCurp_onComplete(str, z2, map);
        }
    }

    private void c(final String str, final boolean z2, final Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = f13144i + 23;
        f13145l = i3 % 128;
        if (i3 % 2 == 0) {
            e(z2);
            this.f13146a.add(Observable.timer(2L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.curp_validation.GeneratingCurpFragment$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.e(str, z2, map, (Long) obj);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.curp_validation.GeneratingCurpFragment$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.d(str, z2, map, (Throwable) obj);
                }
            }));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        e(z2);
        this.f13146a.add(Observable.timer(2L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.curp_validation.GeneratingCurpFragment$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) throws Exception {
                this.f$0.e(str, z2, map, (Long) obj2);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.curp_validation.GeneratingCurpFragment$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) throws Exception {
                this.f$0.d(str, z2, map, (Throwable) obj2);
            }
        }));
        int i4 = f13145l + 97;
        f13144i = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
    }
}
