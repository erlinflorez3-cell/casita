package com.incode.welcome_sdk.ui.tax_id_validation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.d.ay;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.views.IncodeTextView;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ValidatingTaxIdFragment extends FragmentWithListener<Unit> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17523d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f17524e = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f17525f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f17526g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f17527i = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ay f17530c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Modules f17529b = Modules.TAX_ID_VALIDATION;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScreenName f17528a = ScreenName.TAX_ID_VALIDATION;

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f17523d;
        int i4 = i3 + 69;
        f17526g = i4 % 128;
        int i5 = i4 % 2;
        Modules modules = this.f17529b;
        int i6 = i3 + 37;
        f17526g = i6 % 128;
        int i7 = i6 % 2;
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f17523d + 97;
        f17526g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f17528a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        ay ayVarE = ay.e(layoutInflater, viewGroup);
        Intrinsics.checkNotNullExpressionValue(ayVarE, "");
        this.f17530c = ayVarE;
        b();
        ay ayVar = this.f17530c;
        if (ayVar == null) {
            int i3 = f17523d + 15;
            f17526g = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i4 == 0) {
                int i5 = 80 / 0;
            }
            ayVar = null;
        }
        ConstraintLayout constraintLayoutE = ayVar.e();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutE, "");
        ConstraintLayout constraintLayout = constraintLayoutE;
        int i6 = f17526g + 11;
        f17523d = i6 % 128;
        if (i6 % 2 == 0) {
            return constraintLayout;
        }
        throw null;
    }

    private final void b() {
        int i2 = 2 % 2;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.onboard_sdk_rotate);
        animationLoadAnimation.setFillAfter(true);
        animationLoadAnimation.setInterpolator(new LinearInterpolator());
        ay ayVar = this.f17530c;
        if (ayVar == null) {
            int i3 = f17526g + 107;
            f17523d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f17526g + 1;
            f17523d = i4 % 128;
            int i5 = i4 % 2;
            ayVar = null;
        }
        ayVar.f6982e.startAnimation(animationLoadAnimation);
        int i6 = f17526g + 115;
        f17523d = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final void updateUiState(boolean z2) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        ay ayVar = this.f17530c;
        if (ayVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            ayVar = null;
        }
        ayVar.f6982e.clearAnimation();
        ayVar.f6982e.setImageResource(z2 ? R.drawable.onboard_sdk_ic_success : R.drawable.onboard_sdk_ic_failure);
        IncodeTextView incodeTextView = ayVar.f6980a;
        if (z2) {
            int i5 = f17526g + 91;
            f17523d = i5 % 128;
            if (i5 % 2 != 0) {
                i2 = R.string.onboard_sdk_tax_id_verified;
                int i6 = 17 / 0;
            } else {
                i2 = R.string.onboard_sdk_tax_id_verified;
            }
            i3 = f17526g + 3;
            f17523d = i3 % 128;
        } else {
            i2 = R.string.onboard_sdk_tax_id_not_verified;
            i3 = f17523d + 99;
            f17526g = i3 % 128;
        }
        int i7 = i3 % 2;
        incodeTextView.setText(i2);
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17531a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17532c = 0;

        private Companion() {
        }

        public final ValidatingTaxIdFragment newInstance() {
            int i2 = 2 % 2;
            ValidatingTaxIdFragment validatingTaxIdFragment = new ValidatingTaxIdFragment();
            int i3 = f17532c + 121;
            f17531a = i3 % 128;
            if (i3 % 2 != 0) {
                return validatingTaxIdFragment;
            }
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f17527i + 33;
        f17525f = i2 % 128;
        int i3 = i2 % 2;
    }
}
