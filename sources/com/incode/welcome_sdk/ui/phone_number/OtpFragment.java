package com.incode.welcome_sdk.ui.phone_number;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.commons.ui.otp.OTPListener;
import com.incode.welcome_sdk.commons.ui.otp.OtpTextView;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.b;
import com.incode.welcome_sdk.d.au;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.t;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.EmailAddressResult;
import com.incode.welcome_sdk.results.PhoneNumberResult;
import com.incode.welcome_sdk.ui.BaseFragmentActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter_Factory;
import com.incode.welcome_sdk.ui.phone_number.OtpContract;
import com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract;
import com.incode.welcome_sdk.views.IncodeTextView;
import io.reactivex.subjects.PublishSubject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class OtpFragment extends FragmentWithListener<Listener> implements OtpContract.View {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f16890e = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f16891f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f16892g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f16893h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f16894m = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SpannableString f16897c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private au f16900j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f16895a = LazyKt.lazy(new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScreenName f16896b = ScreenName.OTP;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f16898d = LazyKt.lazy(new c());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OtpFragment$otpListener$1 f16899i = new OTPListener() { // from class: com.incode.welcome_sdk.ui.phone_number.OtpFragment$otpListener$1

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16915b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16916d = 0;

        @Override // com.incode.welcome_sdk.commons.ui.otp.OTPListener
        public final void onInteractionListener() {
            int i2 = 2 % 2;
            int i3 = f16915b + 43;
            f16916d = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                au auVarAccess$getBinding$p = OtpFragment.access$getBinding$p(this.f16917c);
                if (auVarAccess$getBinding$p == null) {
                    int i4 = f16916d + 35;
                    f16915b = i4 % 128;
                    if (i4 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        auVarAccess$getBinding$p = null;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        obj.hashCode();
                        throw null;
                    }
                }
                IncodeTextView incodeTextView = auVarAccess$getBinding$p.f6957b;
                Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
                ViewExtensionsKt.visible$default(incodeTextView, false, 0, 2, null);
                return;
            }
            OtpFragment.access$getBinding$p(this.f16917c);
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.commons.ui.otp.OTPListener
        public final void onOTPComplete(String str) {
            int i2 = 2 % 2;
            int i3 = f16916d + 123;
            f16915b = i3 % 128;
            au auVar = null;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                OtpFragment.access$getBinding$p(this.f16917c);
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            au auVarAccess$getBinding$p = OtpFragment.access$getBinding$p(this.f16917c);
            if (auVarAccess$getBinding$p == null) {
                int i4 = f16916d + 87;
                f16915b = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    auVar.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = f16915b + 35;
                f16916d = i5 % 128;
                int i6 = i5 % 2;
            } else {
                auVar = auVarAccess$getBinding$p;
            }
            auVar.f6958c.setEnabled(true);
        }
    };

    public interface Listener {
        void onChangeInputClick();
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i2;
        int i9 = ~i4;
        int i10 = ~i7;
        int i11 = (~(i8 | i9 | i10)) | (~(i2 | i4));
        int i12 = ~(i7 | i4);
        int i13 = i11 | i12;
        int i14 = ~(i8 | i4);
        int i15 = i12 | i8 | (~(i9 | i10));
        int i16 = i2 + i4 + i5 + (1349231875 * i3) + (1735201104 * i6);
        int i17 = i16 * i16;
        int i18 = ((-413510627) * i2) + 1558183936 + (237349861 * i4) + (i13 * 325430244) + (325430244 * i14) + ((-325430244) * i15) + ((-88080384) * i5) + ((-1337982976) * i3) + (469762048 * i6) + (1272971264 * i17);
        int i19 = ((i2 * 236314795) - 374860141) + (i4 * 236313123) + (i13 * (-836)) + (i14 * (-836)) + (i15 * 836) + (i5 * 236313959) + (i3 * (-66979019)) + (i6 * (-1872492752)) + (i17 * (-417333248));
        return i18 + ((i19 * i19) * 639631360) != 1 ? a(objArr) : d(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$d$--V, reason: not valid java name */
    public static /* synthetic */ void m8526instrumented$1$d$V(OtpFragment otpFragment, View view) {
        Callback.onClick_enter(view);
        try {
            d(otpFragment, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static final /* synthetic */ au access$getBinding$p(OtpFragment otpFragment) {
        int i2 = 2 % 2;
        int i3 = f16892g + 99;
        f16891f = i3 % 128;
        int i4 = i3 % 2;
        au auVar = otpFragment.f16900j;
        if (i4 == 0) {
            return auVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ t access$getCommunicationChannel(OtpFragment otpFragment) {
        int i2 = 2 % 2;
        int i3 = f16892g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f16891f = i3 % 128;
        int i4 = i3 % 2;
        t tVarC = otpFragment.c();
        int i5 = f16892g + 11;
        f16891f = i5 % 128;
        int i6 = i5 % 2;
        return tVarC;
    }

    public static final /* synthetic */ Listener access$getListener(OtpFragment otpFragment) {
        int i2 = 2 % 2;
        int i3 = f16891f + 115;
        f16892g = i3 % 128;
        int i4 = i3 % 2;
        Listener listener = otpFragment.getListener();
        if (i4 == 0) {
            int i5 = 68 / 0;
        }
        return listener;
    }

    public static final /* synthetic */ OtpPresenter access$getPresenter(OtpFragment otpFragment) {
        int i2 = 2 % 2;
        int i3 = f16891f + 13;
        f16892g = i3 % 128;
        int i4 = i3 % 2;
        OtpPresenter otpPresenterA = otpFragment.a();
        if (i4 == 0) {
            int i5 = 59 / 0;
        }
        return otpPresenterA;
    }

    public static final /* synthetic */ void access$sendOtpEvent(OtpFragment otpFragment, Event event) {
        int i2 = 2 % 2;
        int i3 = f16892g + 5;
        f16891f = i3 % 128;
        int i4 = i3 % 2;
        otpFragment.b(event);
        int i5 = f16892g + 1;
        f16891f = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class a extends Lambda implements Function0<t> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16906b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16907d = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ t invoke() {
            int i2 = 2 % 2;
            int i3 = f16906b + 97;
            f16907d = i3 % 128;
            int i4 = i3 % 2;
            t tVarC = c();
            int i5 = f16906b + 101;
            f16907d = i5 % 128;
            if (i5 % 2 == 0) {
                return tVarC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private t c() {
            int i2 = 2 % 2;
            int i3 = f16907d + 107;
            f16906b = i3 % 128;
            int i4 = i3 % 2;
            String string = OtpFragment.this.requireArguments().getString("extraCommunicationChannel");
            Intrinsics.checkNotNull(string);
            t tVarValueOf = t.valueOf(string);
            int i5 = f16906b + 49;
            f16907d = i5 % 128;
            int i6 = i5 % 2;
            return tVarValueOf;
        }

        a() {
            super(0);
        }
    }

    private final t c() {
        t tVar;
        int i2 = 2 % 2;
        int i3 = f16892g + 117;
        f16891f = i3 % 128;
        if (i3 % 2 != 0) {
            tVar = (t) this.f16895a.getValue();
            int i4 = 71 / 0;
        } else {
            tVar = (t) this.f16895a.getValue();
        }
        int i5 = f16892g + 95;
        f16891f = i5 % 128;
        if (i5 % 2 == 0) {
            return tVar;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        BaseFragmentActivity baseFragmentActivity;
        int i2 = 2 % 2;
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseFragmentActivity) {
            int i3 = f16892g;
            int i4 = i3 + 89;
            f16891f = i4 % 128;
            int i5 = i4 % 2;
            baseFragmentActivity = (BaseFragmentActivity) activity;
            int i6 = i3 + 19;
            f16891f = i6 % 128;
            int i7 = i6 % 2;
        } else {
            baseFragmentActivity = null;
        }
        if (baseFragmentActivity != null) {
            int i8 = f16891f + 97;
            f16892g = i8 % 128;
            int i9 = i8 % 2;
            Modules module = baseFragmentActivity.getModule();
            if (module != null) {
                return module;
            }
        }
        return Modules.UNDEFINED;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f16892g + 61;
        f16891f = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f16896b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class c extends Lambda implements Function0<OtpPresenter> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16909a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16910c = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ OtpPresenter invoke() {
            OtpPresenter otpPresenterE;
            int i2 = 2 % 2;
            int i3 = f16909a + 45;
            f16910c = i3 % 128;
            if (i3 % 2 != 0) {
                otpPresenterE = e();
                int i4 = 97 / 0;
            } else {
                otpPresenterE = e();
            }
            int i5 = f16909a + 15;
            f16910c = i5 % 128;
            int i6 = i5 % 2;
            return otpPresenterE;
        }

        private OtpPresenter e() {
            IncodeWelcome companion = IncodeWelcome.Companion.getInstance();
            OtpFragment otpFragment = OtpFragment.this;
            OtpFragment otpFragment2 = otpFragment;
            IncodeWelcomeRepository incodeRepository = companion.getIncodeWelcomeRepositoryComponent().getIncodeRepository();
            Intrinsics.checkNotNullExpressionValue(incodeRepository, "");
            PublishSubject<PhoneNumberResult> phoneNumberBus = companion.getPhoneNumberBus();
            PublishSubject<EmailAddressResult> emailAddressBus = companion.getEmailAddressBus();
            String string = otpFragment.requireArguments().getString("extraInput");
            if (string != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                return new OtpPresenter(otpFragment2, incodeRepository, phoneNumberBus, emailAddressBus, string, OtpFragment.access$getCommunicationChannel(otpFragment));
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        c() {
            super(0);
        }
    }

    private final OtpPresenter a() {
        int i2 = 2 % 2;
        int i3 = f16892g + 59;
        f16891f = i3 % 128;
        int i4 = i3 % 2;
        OtpPresenter otpPresenter = (OtpPresenter) this.f16898d.getValue();
        int i5 = f16891f + 47;
        f16892g = i5 % 128;
        int i6 = i5 % 2;
        return otpPresenter;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f16891f + 5;
        f16892g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        au auVarE = au.e(layoutInflater, viewGroup);
        Intrinsics.checkNotNullExpressionValue(auVarE, "");
        this.f16900j = auVarE;
        if (auVarE == null) {
            int i5 = f16891f + 91;
            f16892g = i5 % 128;
            int i6 = i5 % 2;
            auVarE = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 == 0) {
                auVarE.hashCode();
                throw null;
            }
        }
        ConstraintLayout constraintLayoutD = auVarE.d();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutD, "");
        return constraintLayoutD;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public final void safeOnViewCreated(View view, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f16892g + 115;
        f16891f = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.safeOnViewCreated(view, bundle);
            d();
            a().startTryAgainTimer();
            return;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.safeOnViewCreated(view, bundle);
        d();
        a().startTryAgainTimer();
        int i4 = 94 / 0;
    }

    static final class d extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16912a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16913b = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(View view) {
            int i2 = 2 % 2;
            int i3 = f16913b + 63;
            f16912a = i3 % 128;
            int i4 = i3 % 2;
            e(view);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private void e(View view) {
            int i2 = 2 % 2;
            int i3 = f16913b + 21;
            f16912a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                OtpFragment.access$sendOtpEvent(OtpFragment.this, Event.OTP_TRY_AGAIN_CLICKED);
                OtpFragment.access$getPresenter(OtpFragment.this).sendOtp();
            } else {
                Intrinsics.checkNotNullParameter(view, "");
                OtpFragment.access$sendOtpEvent(OtpFragment.this, Event.OTP_TRY_AGAIN_CLICKED);
                OtpFragment.access$getPresenter(OtpFragment.this).sendOtp();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        d() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(au auVar, OtpFragment otpFragment, TextView textView, int i2, KeyEvent keyEvent) {
        int i3 = 2 % 2;
        int i4 = f16892g + 53;
        f16891f = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(auVar, "");
        Intrinsics.checkNotNullParameter(otpFragment, "");
        if (i2 != 4 || !auVar.f6958c.isEnabled()) {
            return false;
        }
        int i6 = f16892g + 7;
        f16891f = i6 % 128;
        int i7 = i6 % 2;
        otpFragment.e();
        int i8 = f16891f + 33;
        f16892g = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    private static final void d(OtpFragment otpFragment, View view) {
        int i2 = 2 % 2;
        int i3 = f16891f + 113;
        f16892g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(otpFragment, "");
        otpFragment.e();
        int i5 = f16891f + 13;
        f16892g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final void d() {
        int i2 = 2 % 2;
        int i3 = f16892g + 13;
        f16891f = i3 % 128;
        final au auVar = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        au auVar2 = this.f16900j;
        if (auVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            auVar = auVar2;
        }
        int i4 = WhenMappings.f16904b[c().ordinal()];
        if (i4 == 1) {
            auVar.f6962g.setText(getString(R.string.onboard_sdk_sms_otp_title));
            auVar.f6961f.setText(getString(R.string.onboard_sdk_sms_otp_subtitle));
        } else if (i4 == 2) {
            auVar.f6962g.setText(getString(R.string.onboard_sdk_email_otp_title));
            auVar.f6961f.setText(getString(R.string.onboard_sdk_email_otp_subtitle));
        }
        b bVar = b.f6439a;
        Context context = getContext();
        int iB = b();
        int iC = BaseSignatureFormContract.c();
        String string = getString(((Integer) e(-960749025, BaseSignatureFormContract.c(), 960749026, BaseSignatureFormContract.c(), BaseSignatureFormContract.c(), iC, new Object[]{this})).intValue());
        Intrinsics.checkNotNullExpressionValue(string, "");
        int iC2 = BaseSignatureFormContract.c();
        String string2 = getString(((Integer) e(-1089260911, BaseSignatureFormContract.c(), 1089260911, BaseSignatureFormContract.c(), BaseSignatureFormContract.c(), iC2, new Object[]{this})).intValue());
        Intrinsics.checkNotNullExpressionValue(string2, "");
        this.f16897c = b.e(context, iB, new b.a[]{new b.a(string, new d()), new b.a(string2, new Function1<View, Unit>() { // from class: com.incode.welcome_sdk.ui.phone_number.OtpFragment$setupLayout$1$2

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f16918c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f16919d = 1;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(View view) {
                int i5 = 2 % 2;
                int i6 = f16919d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f16918c = i6 % 128;
                int i7 = i6 % 2;
                d(view);
                Unit unit = Unit.INSTANCE;
                int i8 = f16918c + 125;
                f16919d = i8 % 128;
                int i9 = i8 % 2;
                return unit;
            }

            private void d(View view) {
                int i5 = 2 % 2;
                int i6 = f16918c + 61;
                f16919d = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.checkNotNullParameter(view, "");
                int i8 = WhenMappings.f16923d[OtpFragment.access$getCommunicationChannel(this.f16920b).ordinal()];
                if (i8 == 1) {
                    OtpFragment.access$sendOtpEvent(this.f16920b, Event.PHONE_CHANGE_CLICKED);
                } else if (i8 == 2) {
                    OtpFragment.access$sendOtpEvent(this.f16920b, Event.EMAIL_CHANGE_CLICKED);
                    int i9 = f16919d + 7;
                    f16918c = i9 % 128;
                    int i10 = i9 % 2;
                }
                OtpFragment.access$getListener(this.f16920b).onChangeInputClick();
            }

            public /* synthetic */ class WhenMappings {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f16921b = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f16922c = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ int[] f16923d;

                static {
                    int[] iArr = new int[t.values().length];
                    try {
                        iArr[t.f10057a.ordinal()] = 1;
                        int i2 = f16921b + 21;
                        f16922c = i2 % 128;
                        int i3 = i2 % 2;
                        int i4 = 2 % 2;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[t.f10059d.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f16923d = iArr;
                    int i5 = f16922c + 81;
                    f16921b = i5 % 128;
                    if (i5 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            {
                super(1);
            }
        })});
        auVar.f6960e.setImeOptions(4);
        auVar.f6960e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.incode.welcome_sdk.ui.phone_number.OtpFragment$$ExternalSyntheticLambda0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                return OtpFragment.a(auVar, this, textView, i5, keyEvent);
            }
        });
        auVar.f6960e.setOtpListener(this.f16899i);
        auVar.f6958c.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.phone_number.OtpFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtpFragment.m8526instrumented$1$d$V(this.f$0, view);
            }
        });
        auVar.f6960e.d();
        int i5 = f16891f + 121;
        f16892g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
    }

    private final void e() {
        int i2 = 2 % 2;
        b(Event.OTP_SUBMITTED);
        OtpPresenter otpPresenterA = a();
        au auVar = this.f16900j;
        if (auVar == null) {
            int i3 = f16892g + 91;
            f16891f = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            auVar = null;
        }
        Object[] objArr = {auVar.f6960e};
        int iE = BaseValidationPresenter_Factory.e();
        otpPresenterA.compareOtp((String) OtpTextView.a(-53302256, BaseValidationPresenter_Factory.e(), objArr, BaseValidationPresenter_Factory.e(), BaseValidationPresenter_Factory.e(), iE, 53302256), c());
        int i5 = f16891f + 63;
        f16892g = i5 % 128;
        int i6 = i5 % 2;
    }

    private final int b() {
        int i2 = 2 % 2;
        int i3 = f16891f + 7;
        f16892g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = WhenMappings.f16904b[c().ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    return R.string.onboard_sdk_email_otp_try_again_or_change_email;
                }
                throw new NoWhenBranchMatchedException();
            }
            int i5 = R.string.onboard_sdk_sms_otp_try_again_or_change_number;
            int i6 = f16891f + 97;
            f16892g = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }
        int i8 = WhenMappings.f16904b[c().ordinal()];
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r0 == 2) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r1 == 2) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        r2 = com.incode.welcome_sdk.R.string.onboard_sdk_email_otp_try_again;
        r1 = com.incode.welcome_sdk.ui.phone_number.OtpFragment.f16892g + 49;
        com.incode.welcome_sdk.ui.phone_number.OtpFragment.f16891f = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        return java.lang.Integer.valueOf(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object d(java.lang.Object[] r6) {
        /*
            r5 = 0
            r4 = r6[r5]
            com.incode.welcome_sdk.ui.phone_number.OtpFragment r4 = (com.incode.welcome_sdk.ui.phone_number.OtpFragment) r4
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.phone_number.OtpFragment.f16892g
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.phone_number.OtpFragment.f16891f = r0
            int r1 = r1 % r3
            r2 = 1
            if (r1 == 0) goto L37
            com.incode.welcome_sdk.data.remote.beans.t r0 = r4.c()
            int[] r1 = com.incode.welcome_sdk.ui.phone_number.OtpFragment.WhenMappings.f16904b
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 56
            int r0 = r0 / r5
            if (r1 == r2) goto L4e
            if (r1 != r3) goto L48
        L27:
            int r2 = com.incode.welcome_sdk.R.string.onboard_sdk_email_otp_try_again
            int r0 = com.incode.welcome_sdk.ui.phone_number.OtpFragment.f16892g
            int r1 = r0 + 49
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.phone_number.OtpFragment.f16891f = r0
            int r1 = r1 % r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        L37:
            com.incode.welcome_sdk.data.remote.beans.t r0 = r4.c()
            int[] r1 = com.incode.welcome_sdk.ui.phone_number.OtpFragment.WhenMappings.f16904b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L4e
            if (r0 != r3) goto L48
            goto L27
        L48:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L4e:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_sms_otp_try_again
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.phone_number.OtpFragment.d(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        OtpFragment otpFragment = (OtpFragment) objArr[0];
        int i2 = 2 % 2;
        int i3 = f16891f + 65;
        f16892g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = WhenMappings.f16904b[otpFragment.c().ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return Integer.valueOf(R.string.onboard_sdk_email_otp_change_email);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i6 = R.string.onboard_sdk_sms_otp_change_phone_number;
        int i7 = f16892g + 65;
        f16891f = i7 % 128;
        if (i7 % 2 == 0) {
            return Integer.valueOf(i6);
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.phone_number.OtpContract.View
    public final void showTryAgainOrChangeInputMessage() {
        int i2 = 2 % 2;
        int i3 = f16891f + 23;
        int i4 = i3 % 128;
        f16892g = i4;
        int i5 = i3 % 2;
        au auVar = this.f16900j;
        au auVar2 = null;
        if (auVar == null) {
            int i6 = i4 + 89;
            f16891f = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                auVar2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            auVar = null;
        }
        IncodeTextView incodeTextView = auVar.f6956a;
        SpannableString spannableString = this.f16897c;
        if (spannableString == null) {
            int i7 = f16891f + 63;
            f16892g = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            spannableString = null;
        }
        incodeTextView.setText(spannableString);
        au auVar3 = this.f16900j;
        if (auVar3 == null) {
            int i9 = f16891f + 65;
            f16892g = i9 % 128;
            if (i9 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i10 = 59 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        } else {
            auVar2 = auVar3;
        }
        auVar2.f6956a.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.incode.welcome_sdk.ui.phone_number.OtpContract.View
    public final void updateTryAgainTimer(long j2) {
        int i2 = 2 % 2;
        au auVar = this.f16900j;
        au auVar2 = null;
        if (auVar == null) {
            int i3 = f16892g + 85;
            f16891f = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            auVar = null;
        }
        IncodeTextView incodeTextView = auVar.f6956a;
        Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
        ViewExtensionsKt.visible$default(incodeTextView, true, 0, 2, null);
        au auVar3 = this.f16900j;
        if (auVar3 == null) {
            int i5 = f16891f + 47;
            f16892g = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            auVar2 = auVar3;
        }
        auVar2.f6956a.setText(getString(R.string.onboard_sdk_generic_otp_try_again_in_x_seconds, Long.valueOf(j2)));
    }

    @Override // com.incode.welcome_sdk.ui.phone_number.OtpContract.View
    public final void showProgressAndBlockInteraction() {
        int i2 = 2 % 2;
        int i3 = f16892g + 15;
        f16891f = i3 % 128;
        int i4 = i3 % 2;
        au auVar = this.f16900j;
        if (auVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            auVar = null;
        }
        LinearLayout linearLayout = auVar.f6959d;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        ViewExtensionsKt.visible$default(linearLayout, true, 0, 2, null);
        au auVar2 = this.f16900j;
        if (auVar2 == null) {
            int i5 = f16892g + 87;
            f16891f = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            auVar2 = null;
        }
        auVar2.f6958c.setEnabled(false);
        hideKeyboard();
        int i6 = f16892g + 83;
        f16891f = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.phone_number.OtpContract.View
    public final void hideProgressAndUnblockInteraction() {
        int i2 = 2 % 2;
        int i3 = f16892g + 109;
        f16891f = i3 % 128;
        au auVar = null;
        if (i3 % 2 == 0) {
            au auVar2 = this.f16900j;
            if (auVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = f16892g + 37;
                f16891f = i4 % 128;
                int i5 = i4 % 2;
                auVar2 = null;
            }
            LinearLayout linearLayout = auVar2.f6959d;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            ViewExtensionsKt.visible$default(linearLayout, false, 0, 2, null);
            au auVar3 = this.f16900j;
            if (auVar3 == null) {
                int i6 = f16892g + 47;
                f16891f = i6 % 128;
                if (i6 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i7 = 55 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
            } else {
                auVar = auVar3;
            }
            auVar.f6958c.setEnabled(true);
            return;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.phone_number.OtpContract.View
    public final void updateUiAfterWrongOtpProvided() {
        int i2 = 2 % 2;
        au auVar = this.f16900j;
        au auVar2 = null;
        if (auVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            auVar = null;
        }
        auVar.f6960e.c();
        au auVar3 = this.f16900j;
        if (auVar3 == null) {
            int i3 = f16891f + 85;
            f16892g = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = 16 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            auVar3 = null;
        }
        auVar3.f6958c.setEnabled(false);
        au auVar4 = this.f16900j;
        if (auVar4 == null) {
            int i5 = f16892g + 11;
            f16891f = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            auVar4 = null;
        }
        LinearLayout linearLayout = auVar4.f6959d;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        ViewExtensionsKt.visible$default(linearLayout, false, 0, 2, null);
        au auVar5 = this.f16900j;
        if (auVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            auVar5 = null;
        }
        IncodeTextView incodeTextView = auVar5.f6957b;
        Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
        ViewExtensionsKt.visible$default(incodeTextView, true, 0, 2, null);
        au auVar6 = this.f16900j;
        if (auVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            auVar2 = auVar6;
        }
        OtpTextView otpTextView = auVar2.f6960e;
        Intrinsics.checkNotNullExpressionValue(otpTextView, "");
        showKeyboard(otpTextView);
        b(Event.OTP_WRONG_ENTERED);
    }

    @Override // com.incode.welcome_sdk.ui.phone_number.OtpContract.View
    public final void sendCorrectOtpSubmittedEvent() {
        int i2 = 2 % 2;
        int i3 = f16891f + 3;
        f16892g = i3 % 128;
        if (i3 % 2 == 0) {
            b(Event.OTP_CORRECT_ENTERED);
            int i4 = 41 / 0;
        } else {
            b(Event.OTP_CORRECT_ENTERED);
        }
        int i5 = f16891f + 45;
        f16892g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final void b(Event event) {
        int i2 = 2 % 2;
        int i3 = f16891f + 103;
        f16892g = i3 % 128;
        if (i3 % 2 != 0) {
            EventUtils.sendEvent(getRepo(), event, getModule(), getScreenName());
            return;
        }
        EventUtils.sendEvent(getRepo(), event, getModule(), getScreenName());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f16892g + 81;
        f16891f = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnDestroy();
        a().onDestroy();
        int i5 = f16891f + 17;
        f16892g = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16901a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16902b = 0;

        private Companion() {
        }

        public final OtpFragment newInstance(t tVar, String str) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(tVar, "");
            Intrinsics.checkNotNullParameter(str, "");
            Bundle bundle = new Bundle();
            bundle.putString("extraCommunicationChannel", tVar.name());
            bundle.putString("extraInput", str);
            OtpFragment otpFragment = new OtpFragment();
            otpFragment.setArguments(bundle);
            int i3 = f16901a + 35;
            f16902b = i3 % 128;
            if (i3 % 2 == 0) {
                return otpFragment;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f16893h + 79;
        f16894m = i2 % 128;
        int i3 = i2 % 2;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16903a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f16904b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16905e = 1;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f10057a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.f10059d.ordinal()] = 2;
                int i2 = f16903a + 19;
                f16905e = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16904b = iArr;
            int i5 = f16903a + 55;
            f16905e = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
    }

    private final int h() {
        int iC = BaseSignatureFormContract.c();
        int iC2 = BaseSignatureFormContract.c();
        return ((Integer) e(-1089260911, BaseSignatureFormContract.c(), 1089260911, iC2, BaseSignatureFormContract.c(), iC, new Object[]{this})).intValue();
    }

    private final int j() {
        int iC = BaseSignatureFormContract.c();
        int iC2 = BaseSignatureFormContract.c();
        return ((Integer) e(-960749025, BaseSignatureFormContract.c(), 960749026, iC2, BaseSignatureFormContract.c(), iC, new Object[]{this})).intValue();
    }
}
