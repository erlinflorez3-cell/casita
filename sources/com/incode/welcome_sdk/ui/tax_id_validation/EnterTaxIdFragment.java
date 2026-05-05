package com.incode.welcome_sdk.ui.tax_id_validation;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.d.ap;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.views.IncodeEditText;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class EnterTaxIdFragment extends FragmentWithListener<Listener> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f17496b = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17497d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f17498f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f17499i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f17500j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ap f17501a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Modules f17503e = Modules.TAX_ID_VALIDATION;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScreenName f17502c = ScreenName.TAX_ID_VALIDATION;

    public interface Listener {
        void onEnterTaxIdContinueClicked(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$e$--V, reason: not valid java name */
    public static /* synthetic */ void m8567instrumented$0$e$V(EnterTaxIdFragment enterTaxIdFragment, ap apVar, View view) {
        Callback.onClick_enter(view);
        try {
            d(enterTaxIdFragment, apVar, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static final /* synthetic */ ap access$getBinding$p(EnterTaxIdFragment enterTaxIdFragment) {
        int i2 = 2 % 2;
        int i3 = f17497d;
        int i4 = i3 + 25;
        f17499i = i4 % 128;
        int i5 = i4 % 2;
        ap apVar = enterTaxIdFragment.f17501a;
        int i6 = i3 + 1;
        f17499i = i6 % 128;
        int i7 = i6 % 2;
        return apVar;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f17499i + 87;
        int i4 = i3 % 128;
        f17497d = i4;
        int i5 = i3 % 2;
        Modules modules = this.f17503e;
        int i6 = i4 + 57;
        f17499i = i6 % 128;
        int i7 = i6 % 2;
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f17497d + 113;
        f17499i = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f17502c;
        }
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f17497d + 5;
        f17499i = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            ap apVarC = ap.c(layoutInflater, viewGroup);
            Intrinsics.checkNotNullExpressionValue(apVarC, "");
            this.f17501a = apVarC;
            e();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        ap apVarC2 = ap.c(layoutInflater, viewGroup);
        Intrinsics.checkNotNullExpressionValue(apVarC2, "");
        this.f17501a = apVarC2;
        e();
        ap apVar = this.f17501a;
        if (apVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            apVar = null;
        }
        ConstraintLayout constraintLayoutB = apVar.b();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "");
        ConstraintLayout constraintLayout = constraintLayoutB;
        int i4 = f17499i + 113;
        f17497d = i4 % 128;
        if (i4 % 2 == 0) {
            return constraintLayout;
        }
        obj.hashCode();
        throw null;
    }

    private static final void d(EnterTaxIdFragment enterTaxIdFragment, ap apVar, View view) {
        int i2 = 2 % 2;
        int i3 = f17499i + 105;
        f17497d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(enterTaxIdFragment, "");
            Intrinsics.checkNotNullParameter(apVar, "");
            enterTaxIdFragment.getListener().onEnterTaxIdContinueClicked(String.valueOf(apVar.f6928e.getText()));
            int i4 = 21 / 0;
        } else {
            Intrinsics.checkNotNullParameter(enterTaxIdFragment, "");
            Intrinsics.checkNotNullParameter(apVar, "");
            enterTaxIdFragment.getListener().onEnterTaxIdContinueClicked(String.valueOf(apVar.f6928e.getText()));
        }
        int i5 = f17499i + 31;
        f17497d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
    }

    private final void e() {
        int i2 = 2 % 2;
        final ap apVar = this.f17501a;
        if (apVar == null) {
            int i3 = f17497d + 71;
            f17499i = i3 % 128;
            apVar = null;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                apVar.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f17497d + 71;
            f17499i = i4 % 128;
            int i5 = i4 % 2;
        }
        IncodeEditText incodeEditText = apVar.f6928e;
        Intrinsics.checkNotNullExpressionValue(incodeEditText, "");
        incodeEditText.addTextChangedListener(new TextWatcher() { // from class: com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment$setupLayout$lambda$2$$inlined$doOnTextChanged$1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f17506c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f17507e = 1;

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int i6 = 2 % 2;
                int i7 = f17506c + 31;
                f17507e = i7 % 128;
                if (i7 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                int i9 = 2 % 2;
                int i10 = f17507e + 85;
                f17506c = i10 % 128;
                int i11 = i10 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onTextChanged(java.lang.CharSequence r6, int r7, int r8, int r9) {
                /*
                    r5 = this;
                    r4 = 2
                    int r0 = r4 % r4
                    int r0 = com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment$setupLayout$lambda$2$$inlined$doOnTextChanged$1.f17507e
                    int r1 = r0 + 37
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment$setupLayout$lambda$2$$inlined$doOnTextChanged$1.f17506c = r0
                    int r1 = r1 % r4
                    com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment r0 = r5.f17508d
                    com.incode.welcome_sdk.d.ap r0 = com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment.access$getBinding$p(r0)
                    if (r0 != 0) goto L25
                    int r0 = com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment$setupLayout$lambda$2$$inlined$doOnTextChanged$1.f17507e
                    int r2 = r0 + 65
                    int r0 = r2 % 128
                    com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment$setupLayout$lambda$2$$inlined$doOnTextChanged$1.f17506c = r0
                    int r2 = r2 % r4
                    java.lang.String r1 = ""
                    r0 = 0
                    if (r2 != 0) goto L4a
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
                L25:
                    com.incode.welcome_sdk.views.IncodeButton r3 = r0.f6925a
                    r2 = 1
                    if (r6 == 0) goto L39
                    int r0 = com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment$setupLayout$lambda$2$$inlined$doOnTextChanged$1.f17506c
                    int r1 = r0 + 35
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment$setupLayout$lambda$2$$inlined$doOnTextChanged$1.f17507e = r0
                    int r1 = r1 % r4
                    boolean r0 = kotlin.text.StringsKt.isBlank(r6)
                    if (r0 == 0) goto L3f
                L39:
                    r0 = r2
                L3a:
                    r0 = r0 ^ r2
                    r3.setEnabled(r0)
                    return
                L3f:
                    int r0 = com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment$setupLayout$lambda$2$$inlined$doOnTextChanged$1.f17506c
                    int r1 = r0 + 21
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment$setupLayout$lambda$2$$inlined$doOnTextChanged$1.f17507e = r0
                    int r1 = r1 % r4
                    r0 = 0
                    goto L3a
                L4a:
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
                    r0.hashCode()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment$setupLayout$lambda$2$$inlined$doOnTextChanged$1.onTextChanged(java.lang.CharSequence, int, int, int):void");
            }
        });
        apVar.f6925a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnterTaxIdFragment.m8567instrumented$0$e$V(this.f$0, apVar, view);
            }
        });
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        int i2 = 2 % 2;
        super.onResume();
        ap apVar = this.f17501a;
        ap apVar2 = null;
        if (apVar == null) {
            int i3 = f17499i + 27;
            f17497d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = 27 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            apVar = null;
        }
        apVar.f6928e.requestFocus();
        ap apVar3 = this.f17501a;
        if (apVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f17499i + 9;
            f17497d = i5 % 128;
            int i6 = i5 % 2;
        } else {
            apVar2 = apVar3;
        }
        IncodeEditText incodeEditText = apVar2.f6928e;
        Intrinsics.checkNotNullExpressionValue(incodeEditText, "");
        showKeyboard(incodeEditText);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int i2 = 2 % 2;
        int i3 = f17499i + 57;
        f17497d = i3 % 128;
        if (i3 % 2 != 0) {
            super.onStop();
            hideKeyboard();
            int i4 = 14 / 0;
        } else {
            super.onStop();
            hideKeyboard();
        }
        int i5 = f17497d + 51;
        f17499i = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17504a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17505d = 0;

        private Companion() {
        }

        public final EnterTaxIdFragment newInstance() {
            int i2 = 2 % 2;
            EnterTaxIdFragment enterTaxIdFragment = new EnterTaxIdFragment();
            int i3 = f17505d + 47;
            f17504a = i3 % 128;
            int i4 = i3 % 2;
            return enterTaxIdFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f17500j + 17;
        f17498f = i2 % 128;
        int i3 = i2 % 2;
    }
}
