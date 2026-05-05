package com.incode.welcome_sdk.ui.email_address;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.f;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.d.ao;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.EmailAddressResult;
import com.incode.welcome_sdk.ui.email_address.EmailAddressContract;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeEditText;
import io.reactivex.subjects.PublishSubject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class EmailAddressFragment extends FragmentWithListener<Listener> implements EmailAddressContract.View {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f14193e = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f14194f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f14195g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f14196i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f14197j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ao f14200c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Modules f14199b = Modules.EMAIL;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScreenName f14198a = ScreenName.EMAIL_INPUT;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f14201d = LazyKt.lazy(new d());

    public interface Listener {
        void onEmailProvidedOtpRequired(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnViewCreated$-Landroid-view-View-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8464xb69a3a99(EmailAddressFragment emailAddressFragment, View view) {
        Callback.onClick_enter(view);
        try {
            a(emailAddressFragment, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static final /* synthetic */ Listener access$getListener(EmailAddressFragment emailAddressFragment) {
        int i2 = 2 % 2;
        int i3 = f14196i + 113;
        f14195g = i3 % 128;
        int i4 = i3 % 2;
        Listener listener = emailAddressFragment.getListener();
        int i5 = f14195g + 99;
        f14196i = i5 % 128;
        int i6 = i5 % 2;
        return listener;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f14195g + 65;
        f14196i = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f14199b;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f14196i;
        int i4 = i3 + 67;
        f14195g = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f14198a;
        int i6 = i3 + 67;
        f14195g = i6 % 128;
        if (i6 % 2 == 0) {
            return screenName;
        }
        throw null;
    }

    static final class d extends Lambda implements Function0<EmailAddressPresenter> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14204b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14205e = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ EmailAddressPresenter invoke() {
            int i2 = 2 % 2;
            int i3 = f14205e + 111;
            f14204b = i3 % 128;
            int i4 = i3 % 2;
            EmailAddressPresenter emailAddressPresenterB = b();
            int i5 = f14205e + 15;
            f14204b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 21 / 0;
            }
            return emailAddressPresenterB;
        }

        private EmailAddressPresenter b() {
            int i2 = 2 % 2;
            IncodeWelcome companion = IncodeWelcome.Companion.getInstance();
            EmailAddressFragment emailAddressFragment = EmailAddressFragment.this;
            IncodeWelcomeRepository incodeRepository = companion.getIncodeWelcomeRepositoryComponent().getIncodeRepository();
            Intrinsics.checkNotNullExpressionValue(incodeRepository, "");
            PublishSubject<EmailAddressResult> emailAddressBus = companion.getEmailAddressBus();
            Listener listenerAccess$getListener = EmailAddressFragment.access$getListener(emailAddressFragment);
            Intrinsics.checkNotNullExpressionValue(listenerAccess$getListener, "");
            EmailAddressPresenter emailAddressPresenter = new EmailAddressPresenter(incodeRepository, emailAddressBus, listenerAccess$getListener, emailAddressFragment, companion.isCaptureOnlyMode(), emailAddressFragment.requireArguments().getBoolean("extraIsOtpVerificationEnabled"));
            int i3 = f14205e + 57;
            f14204b = i3 % 128;
            int i4 = i3 % 2;
            return emailAddressPresenter;
        }

        d() {
            super(0);
        }
    }

    private final EmailAddressPresenter d() {
        int i2 = 2 % 2;
        int i3 = f14195g + 113;
        f14196i = i3 % 128;
        int i4 = i3 % 2;
        EmailAddressPresenter emailAddressPresenter = (EmailAddressPresenter) this.f14201d.getValue();
        int i5 = f14195g + 95;
        f14196i = i5 % 128;
        if (i5 % 2 != 0) {
            return emailAddressPresenter;
        }
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f14195g + 121;
        f14196i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        ao aoVarB = ao.b(layoutInflater, viewGroup);
        Intrinsics.checkNotNullExpressionValue(aoVarB, "");
        this.f14200c = aoVarB;
        if (aoVarB == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f14196i + 29;
            f14195g = i5 % 128;
            int i6 = i5 % 2;
            aoVarB = null;
        }
        ConstraintLayout constraintLayoutD = aoVarB.d();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutD, "");
        return constraintLayoutD;
    }

    private static final void a(EmailAddressFragment emailAddressFragment, View view) {
        int i2 = 2 % 2;
        int i3 = f14196i + 85;
        f14195g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(emailAddressFragment, "");
        emailAddressFragment.a();
        int i5 = f14196i + 115;
        f14195g = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(ao aoVar, EmailAddressFragment emailAddressFragment, TextView textView, int i2, KeyEvent keyEvent) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(aoVar, "");
        Intrinsics.checkNotNullParameter(emailAddressFragment, "");
        if (i2 != 4) {
            return false;
        }
        int i4 = f14196i + 21;
        f14195g = i4 % 128;
        int i5 = i4 % 2;
        if (!aoVar.f6920a.isEnabled()) {
            return false;
        }
        int i6 = f14196i + 43;
        f14195g = i6 % 128;
        int i7 = i6 % 2;
        emailAddressFragment.a();
        return true;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public final void safeOnViewCreated(View view, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f14195g + 69;
        f14196i = i3 % 128;
        final ao aoVar = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.safeOnViewCreated(view, bundle);
            aoVar.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.safeOnViewCreated(view, bundle);
        ao aoVar2 = this.f14200c;
        if (aoVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            aoVar = aoVar2;
        }
        aoVar.f6920a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.email_address.EmailAddressFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EmailAddressFragment.m8464xb69a3a99(this.f$0, view2);
            }
        });
        IncodeEditText incodeEditText = aoVar.f6924e;
        Intrinsics.checkNotNullExpressionValue(incodeEditText, "");
        incodeEditText.addTextChangedListener(new TextWatcher() { // from class: com.incode.welcome_sdk.ui.email_address.EmailAddressFragment$safeOnViewCreated$lambda$3$$inlined$doOnTextChanged$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f14207b = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f14208e = 1;

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int i4 = 2 % 2;
                int i5 = f14207b + 113;
                f14208e = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                int i7 = 2 % 2;
                int i8 = f14208e + 95;
                f14207b = i8 % 128;
                int i9 = i8 % 2;
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                int i7 = 2 % 2;
                int i8 = f14207b + 113;
                f14208e = i8 % 128;
                if (i8 % 2 == 0) {
                    IncodeButton incodeButton = aoVar.f6920a;
                    IncodeEditText incodeEditText2 = aoVar.f6924e;
                    Intrinsics.checkNotNullExpressionValue(incodeEditText2, "");
                    incodeButton.setEnabled(f.b(incodeEditText2));
                    int i9 = 80 / 0;
                    return;
                }
                IncodeButton incodeButton2 = aoVar.f6920a;
                IncodeEditText incodeEditText3 = aoVar.f6924e;
                Intrinsics.checkNotNullExpressionValue(incodeEditText3, "");
                incodeButton2.setEnabled(f.b(incodeEditText3));
            }
        });
        aoVar.f6924e.requestFocus();
        aoVar.f6924e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.incode.welcome_sdk.ui.email_address.EmailAddressFragment$$ExternalSyntheticLambda1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                return EmailAddressFragment.e(aoVar, this, textView, i4, keyEvent);
            }
        });
        int i4 = f14196i + 79;
        f14195g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
    }

    private final void a() {
        int i2 = 2 % 2;
        int i3 = f14196i + 79;
        f14195g = i3 % 128;
        ao aoVar = null;
        if (i3 % 2 != 0) {
            d();
            throw null;
        }
        EmailAddressPresenter emailAddressPresenterD = d();
        ao aoVar2 = this.f14200c;
        if (aoVar2 == null) {
            int i4 = f14196i + 1;
            f14195g = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = 25 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        } else {
            aoVar = aoVar2;
        }
        emailAddressPresenterD.submitEmail(String.valueOf(aoVar.f6924e.getText()));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @Override // com.incode.welcome_sdk.ui.email_address.EmailAddressContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void enableContinueButton(boolean r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.email_address.EmailAddressFragment.f14196i
            int r1 = r0 + 105
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.email_address.EmailAddressFragment.f14195g = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 == 0) goto L2e
            com.incode.welcome_sdk.d.ao r1 = r4.f14200c
            r0 = 22
            int r0 = r0 / 0
            if (r1 != 0) goto L1d
        L17:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r1 = r2
        L1d:
            com.incode.welcome_sdk.views.IncodeButton r0 = r1.f6920a
            r0.setEnabled(r5)
            int r0 = com.incode.welcome_sdk.ui.email_address.EmailAddressFragment.f14196i
            int r1 = r0 + 11
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.email_address.EmailAddressFragment.f14195g = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L33
            return
        L2e:
            com.incode.welcome_sdk.d.ao r1 = r4.f14200c
            if (r1 != 0) goto L1d
            goto L17
        L33:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.email_address.EmailAddressFragment.enableContinueButton(boolean):void");
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f14196i + 111;
        f14195g = i3 % 128;
        int i4 = i3 % 2;
        d().onDestroy();
        super.safeOnDestroy();
        int i5 = f14195g + 95;
        f14196i = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14202a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14203c = 0;

        private Companion() {
        }

        public final EmailAddressFragment newInstance(boolean z2) {
            int i2 = 2 % 2;
            EmailAddressFragment emailAddressFragment = new EmailAddressFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("extraIsOtpVerificationEnabled", z2);
            emailAddressFragment.setArguments(bundle);
            int i3 = f14202a + 31;
            f14203c = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 69 / 0;
            }
            return emailAddressFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f14197j + 7;
        f14194f = i2 % 128;
        int i3 = i2 % 2;
    }
}
