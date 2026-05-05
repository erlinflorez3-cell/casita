package com.incode.welcome_sdk.ui.curp_validation;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.g;
import com.incode.welcome_sdk.d.ar;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeEditText;
import com.incode.welcome_sdk.views.IncodeTextView;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class EnterCurpFragment extends FragmentWithListener<EnterCurpFragmentInterface> {

    /* JADX INFO: renamed from: c */
    private static Companion f13118c = new Companion(null);

    /* JADX INFO: renamed from: d */
    private static int f13119d = 0;

    /* JADX INFO: renamed from: g */
    private static int f13120g = 1;

    /* JADX INFO: renamed from: h */
    private static int f13121h = 0;

    /* JADX INFO: renamed from: j */
    private static int f13122j = 1;

    /* JADX INFO: renamed from: a */
    private final Modules f13123a = Modules.CURP_VALIDATION;

    /* JADX INFO: renamed from: b */
    private final ScreenName f13124b = ScreenName.ENTER_CURP;

    /* JADX INFO: renamed from: e */
    private ar f13125e;

    public interface EnterCurpFragmentInterface {
        void enterCurp_onContinue(String str);

        void enterCurp_onGenerate();

        void enterCurp_onInvalid(String str);
    }

    /* JADX INFO: renamed from: instrumented$0$safeOnViewCreated$-Landroid-view-View-Landroid-os-Bundle--V */
    public static /* synthetic */ void m8430xb69a3a99(EnterCurpFragment enterCurpFragment, View view) {
        Callback.onClick_enter(view);
        try {
            c(enterCurpFragment, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$1$safeOnViewCreated$-Landroid-view-View-Landroid-os-Bundle--V */
    public static /* synthetic */ void m8431x710fdb1a(EnterCurpFragment enterCurpFragment, View view) {
        Callback.onClick_enter(view);
        try {
            b(enterCurpFragment, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static final /* synthetic */ ar access$getBinding(EnterCurpFragment enterCurpFragment) {
        int i2 = 2 % 2;
        int i3 = f13122j + 43;
        f13119d = i3 % 128;
        if (i3 % 2 == 0) {
            return enterCurpFragment.d();
        }
        enterCurpFragment.d();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$updateEditTextCurp(EnterCurpFragment enterCurpFragment, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f13119d + 29;
        f13122j = i3 % 128;
        int i4 = i3 % 2;
        enterCurpFragment.d(z2);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f13119d + 79;
        f13122j = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f13119d + 71;
        f13122j = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f13123a;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        ScreenName screenName;
        int i2 = 2 % 2;
        int i3 = f13119d;
        int i4 = i3 + 67;
        f13122j = i4 % 128;
        if (i4 % 2 == 0) {
            screenName = this.f13124b;
            int i5 = 15 / 0;
        } else {
            screenName = this.f13124b;
        }
        int i6 = i3 + 1;
        f13122j = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    private final ar d() {
        int i2 = 2 % 2;
        int i3 = f13119d + 49;
        f13122j = i3 % 128;
        int i4 = i3 % 2;
        ar arVar = this.f13125e;
        Intrinsics.checkNotNull(arVar);
        int i5 = f13119d + 79;
        f13122j = i5 % 128;
        int i6 = i5 % 2;
        return arVar;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public final int getSoftInputMode() {
        int i2 = 2 % 2;
        int i3 = f13119d + 117;
        f13122j = i3 % 128;
        return i3 % 2 == 0 ? 51 : 16;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout;
        int i2 = 2 % 2;
        int i3 = f13122j + 65;
        f13119d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            this.f13125e = ar.b(layoutInflater, viewGroup);
            ConstraintLayout constraintLayoutC = d().c();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutC, "");
            constraintLayout = constraintLayoutC;
            int i4 = 91 / 0;
        } else {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            this.f13125e = ar.b(layoutInflater, viewGroup);
            ConstraintLayout constraintLayoutC2 = d().c();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutC2, "");
            constraintLayout = constraintLayoutC2;
        }
        int i5 = f13119d + 23;
        f13122j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i2 = 2 % 2;
        int i3 = f13119d + 67;
        f13122j = i3 % 128;
        if (i3 % 2 != 0) {
            this.f13125e = null;
            super.onDestroyView();
        } else {
            this.f13125e = null;
            super.onDestroyView();
            throw null;
        }
    }

    private static final void c(EnterCurpFragment enterCurpFragment, View view) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(enterCurpFragment, "");
        IncodeButton incodeButton = enterCurpFragment.d().f6938d;
        Intrinsics.checkNotNullExpressionValue(incodeButton, "");
        ViewExtensionsKt.preventDoubleClick(incodeButton);
        String strValueOf = String.valueOf(enterCurpFragment.d().f6935a.getText());
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        boolean zA = g.a(upperCase);
        enterCurpFragment.d(zA);
        Object obj = null;
        if (!zA) {
            EnterCurpFragmentInterface listener = enterCurpFragment.getListener();
            if (listener != null) {
                int i3 = f13122j + 51;
                f13119d = i3 % 128;
                if (i3 % 2 == 0) {
                    listener.enterCurp_onInvalid(upperCase);
                    return;
                } else {
                    listener.enterCurp_onInvalid(upperCase);
                    obj.hashCode();
                    throw null;
                }
            }
            return;
        }
        EventUtils.sendScreenClosed(enterCurpFragment.getRepo(), enterCurpFragment.getScreenName(), enterCurpFragment.getModule());
        EnterCurpFragmentInterface listener2 = enterCurpFragment.getListener();
        if (listener2 != null) {
            int i4 = f13119d + 95;
            f13122j = i4 % 128;
            int i5 = i4 % 2;
            listener2.enterCurp_onContinue(upperCase);
            int i6 = f13122j + 17;
            f13119d = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
    }

    private static final void b(EnterCurpFragment enterCurpFragment, View view) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(enterCurpFragment, "");
        IncodeTextView incodeTextView = enterCurpFragment.d().f6936b;
        Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
        ViewExtensionsKt.preventDoubleClick(incodeTextView);
        EnterCurpFragmentInterface listener = enterCurpFragment.getListener();
        Object obj = null;
        if (listener == null) {
            int i3 = f13122j + 83;
            f13119d = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = f13122j + 69;
        f13119d = i4 % 128;
        if (i4 % 2 != 0) {
            listener.enterCurp_onGenerate();
            throw null;
        }
        listener.enterCurp_onGenerate();
        int i5 = f13122j + 121;
        f13119d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public final void safeOnViewCreated(View view, Bundle bundle) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.safeOnViewCreated(view, bundle);
        EventUtils.sendScreenOpened(getRepo(), getScreenName(), getModule());
        IncodeEditText incodeEditText = d().f6935a;
        Intrinsics.checkNotNullExpressionValue(incodeEditText, "");
        incodeEditText.addTextChangedListener(new TextWatcher() { // from class: com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment$safeOnViewCreated$$inlined$doOnTextChanged$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f13128a = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f13129e = 1;

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int i4 = 2 % 2;
                int i5 = f13128a + 51;
                f13129e = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                int i7 = 2 % 2;
                int i8 = f13129e + 123;
                f13128a = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
                /*
                    r6 = this;
                    r5 = 2
                    int r0 = r5 % r5
                    com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment r0 = r6.f13130c
                    com.incode.welcome_sdk.d.ar r0 = com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment.access$getBinding(r0)
                    com.incode.welcome_sdk.views.IncodeButton r4 = r0.f6938d
                    r3 = 0
                    r2 = 1
                    if (r7 == 0) goto L1e
                    int r0 = com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment$safeOnViewCreated$$inlined$doOnTextChanged$1.f13128a
                    int r1 = r0 + 19
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment$safeOnViewCreated$$inlined$doOnTextChanged$1.f13129e = r0
                    int r1 = r1 % r5
                    int r0 = r7.length()
                    if (r0 != 0) goto L3d
                L1e:
                    r0 = r2
                L1f:
                    r0 = r0 ^ r2
                    if (r0 == r2) goto L2b
                L22:
                    r4.setEnabled(r3)
                    com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment r0 = r6.f13130c
                    com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment.access$updateEditTextCurp(r0, r2)
                    return
                L2b:
                    int r1 = r7.length()
                    r0 = 18
                    if (r1 != r0) goto L22
                    int r1 = com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment$safeOnViewCreated$$inlined$doOnTextChanged$1.f13129e
                    int r1 = r1 + r2
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment$safeOnViewCreated$$inlined$doOnTextChanged$1.f13128a = r0
                    int r1 = r1 % r5
                    r3 = r2
                    goto L22
                L3d:
                    r0 = r3
                    goto L1f
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment$safeOnViewCreated$$inlined$doOnTextChanged$1.onTextChanged(java.lang.CharSequence, int, int, int):void");
            }
        });
        d().f6938d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EnterCurpFragment.m8430xb69a3a99(this.f$0, view2);
            }
        });
        d().f6936b.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EnterCurpFragment.m8431x710fdb1a(this.f$0, view2);
            }
        });
        IncodeTextView incodeTextView = d().f6937c;
        int i4 = 0;
        if (IncodeWelcome.Companion.getInstance().getInternalConfig().isValidationEnabled()) {
            int i5 = f13119d + 79;
            f13122j = i5 % 128;
            int i6 = i5 % 2;
            i2 = 0;
        } else {
            i2 = 8;
        }
        incodeTextView.setVisibility(i2);
        IncodeTextView incodeTextView2 = d().f6936b;
        if (IncodeWelcome.Companion.getInstance().getInternalConfig().isValidationEnabled()) {
            int i7 = f13122j + 53;
            f13119d = i7 % 128;
            if (i7 % 2 != 0) {
                i4 = 1;
            }
        } else {
            i4 = 8;
        }
        incodeTextView2.setVisibility(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x001e A[PHI: r1 r2
  0x001e: PHI (r1v9 com.incode.welcome_sdk.views.IncodeEditText) = (r1v2 com.incode.welcome_sdk.views.IncodeEditText), (r1v10 com.incode.welcome_sdk.views.IncodeEditText) binds: [B:42:0x0064, B:28:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x001e: PHI (r2v5 android.content.Context) = (r2v0 android.content.Context), (r2v6 android.content.Context) binds: [B:42:0x0064, B:28:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[PHI: r1 r2
  0x0066: PHI (r1v3 com.incode.welcome_sdk.views.IncodeEditText) = (r1v2 com.incode.welcome_sdk.views.IncodeEditText), (r1v10 com.incode.welcome_sdk.views.IncodeEditText) binds: [B:42:0x0064, B:28:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r2v1 android.content.Context) = (r2v0 android.content.Context), (r2v6 android.content.Context) binds: [B:42:0x0064, B:28:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(boolean r7) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment.f13119d
            int r1 = r0 + 41
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment.f13122j = r0
            int r1 = r1 % r5
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L58
            android.content.Context r2 = r6.getContext()
            com.incode.welcome_sdk.d.ar r0 = r6.d()
            com.incode.welcome_sdk.views.IncodeEditText r1 = r0.f6935a
            r0 = 5
            int r0 = r0 / r3
            if (r7 == r4) goto L66
        L1e:
            int r0 = com.incode.welcome_sdk.R.color.onboard_sdk_InputEditTextError_TextColor
        L20:
            int r0 = androidx.core.content.ContextCompat.getColor(r2, r0)
            r1.setTextColor(r0)
            com.incode.welcome_sdk.d.ar r0 = r6.d()
            com.incode.welcome_sdk.views.IncodeEditText r2 = r0.f6935a
            if (r7 == 0) goto L55
            int r0 = com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment.f13119d
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment.f13122j = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L69
            int r0 = com.incode.welcome_sdk.R.drawable.onboard_sdk_InputEditText_Background
        L3c:
            r2.setBackgroundResource(r0)
            com.incode.welcome_sdk.d.ar r0 = r6.d()
            com.incode.welcome_sdk.views.IncodeTextView r2 = r0.f6939e
            if (r7 == 0) goto L51
            int r0 = com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment.f13122j
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment.f13119d = r0
            int r1 = r1 % r5
            r3 = 4
        L51:
            r2.setVisibility(r3)
            return
        L55:
            int r0 = com.incode.welcome_sdk.R.drawable.onboard_sdk_InputEditTextError_Background
            goto L3c
        L58:
            android.content.Context r2 = r6.getContext()
            com.incode.welcome_sdk.d.ar r0 = r6.d()
            com.incode.welcome_sdk.views.IncodeEditText r1 = r0.f6935a
            r0 = r7 ^ 1
            if (r0 == r4) goto L1e
        L66:
            int r0 = com.incode.welcome_sdk.R.color.onboard_sdk_InputEditText_TextColor
            goto L20
        L69:
            int r0 = com.incode.welcome_sdk.R.drawable.onboard_sdk_InputEditText_Background
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.curp_validation.EnterCurpFragment.d(boolean):void");
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b */
        private static int f13126b = 1;

        /* JADX INFO: renamed from: c */
        private static int f13127c = 0;

        private Companion() {
        }

        @JvmStatic
        public final EnterCurpFragment newInstance() {
            int i2 = 2 % 2;
            EnterCurpFragment enterCurpFragment = new EnterCurpFragment();
            int i3 = f13126b + 97;
            f13127c = i3 % 128;
            int i4 = i3 % 2;
            return enterCurpFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f13120g + 7;
        f13121h = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
    }

    @JvmStatic
    public static final EnterCurpFragment newInstance() {
        int i2 = 2 % 2;
        int i3 = f13122j + 111;
        f13119d = i3 % 128;
        int i4 = i3 % 2;
        Companion companion = f13118c;
        if (i4 == 0) {
            return companion.newInstance();
        }
        companion.newInstance();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
