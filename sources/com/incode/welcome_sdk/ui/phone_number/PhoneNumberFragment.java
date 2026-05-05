package com.incode.welcome_sdk.ui.phone_number;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.commons.utils.v;
import com.incode.welcome_sdk.d.ax;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.PhoneNumberResult;
import com.incode.welcome_sdk.ui.phone_number.PhoneNumberContract;
import com.incode.welcome_sdk.views.IncodeEditText;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.reactivex.subjects.PublishSubject;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class PhoneNumberFragment extends FragmentWithListener<Listener> implements PhoneNumberContract.View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f16977b = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f16978f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f16979g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f16980h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f16981j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ax f16982a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Modules f16983c = Modules.PHONE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScreenName f16985e = ScreenName.PHONE_INPUT;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f16984d = LazyKt.lazy(new e());

    public interface Listener {
        void onPhoneNumberProvidedOtpRequired(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$onCreateView$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup-Landroid-os-Bundle--Landroid-view-View-, reason: not valid java name */
    public static /* synthetic */ void m8531xd0e31f79(PhoneNumberFragment phoneNumberFragment, View view) {
        Callback.onClick_enter(view);
        try {
            d(phoneNumberFragment, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static final /* synthetic */ Listener access$getListener(PhoneNumberFragment phoneNumberFragment) {
        int i2 = 2 % 2;
        int i3 = f16980h + 7;
        f16981j = i3 % 128;
        int i4 = i3 % 2;
        Listener listener = phoneNumberFragment.getListener();
        int i5 = f16981j + 71;
        f16980h = i5 % 128;
        int i6 = i5 % 2;
        return listener;
    }

    public static final /* synthetic */ void access$onPhoneNumberChanged(PhoneNumberFragment phoneNumberFragment, CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = f16981j + 31;
        f16980h = i3 % 128;
        int i4 = i3 % 2;
        phoneNumberFragment.a(charSequence);
        int i5 = f16981j + 5;
        f16980h = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f16980h;
        int i4 = i3 + 87;
        f16981j = i4 % 128;
        int i5 = i4 % 2;
        Modules modules = this.f16983c;
        int i6 = i3 + 9;
        f16981j = i6 % 128;
        if (i6 % 2 == 0) {
            return modules;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f16981j;
        int i4 = i3 + 87;
        f16980h = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        ScreenName screenName = this.f16985e;
        int i5 = i3 + 53;
        f16980h = i5 % 128;
        if (i5 % 2 != 0) {
            return screenName;
        }
        throw null;
    }

    static final class e extends Lambda implements Function0<PhoneNumberPresenter> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16988a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16989d = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ PhoneNumberPresenter invoke() throws Throwable {
            PhoneNumberPresenter phoneNumberPresenterA;
            int i2 = 2 % 2;
            int i3 = f16989d + 115;
            f16988a = i3 % 128;
            if (i3 % 2 != 0) {
                phoneNumberPresenterA = a();
                int i4 = 36 / 0;
            } else {
                phoneNumberPresenterA = a();
            }
            int i5 = f16988a + 45;
            f16989d = i5 % 128;
            int i6 = i5 % 2;
            return phoneNumberPresenterA;
        }

        private PhoneNumberPresenter a() throws Throwable {
            int i2 = 2 % 2;
            IncodeWelcomeRepository incodeRepository = IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent().getIncodeRepository();
            PhoneNumberUtil phoneNumberUtilCreateInstance = PhoneNumberUtil.createInstance(PhoneNumberFragment.this.getContext());
            PublishSubject<PhoneNumberResult> phoneNumberBus = IncodeWelcome.Companion.getInstance().getPhoneNumberBus();
            Listener listenerAccess$getListener = PhoneNumberFragment.access$getListener(PhoneNumberFragment.this);
            boolean zIsCaptureOnlyMode = IncodeWelcome.Companion.getInstance().isCaptureOnlyMode();
            boolean z2 = PhoneNumberFragment.this.requireArguments().getBoolean("extraIsOtpVerificationEnabled");
            int i3 = PhoneNumberFragment.this.requireArguments().getInt("extraDefaultRegionPrefix", -1);
            v vVar = v.f6649b;
            Context contextRequireContext = PhoneNumberFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String strE = v.e(contextRequireContext);
            Intrinsics.checkNotNull(incodeRepository);
            Intrinsics.checkNotNull(phoneNumberUtilCreateInstance);
            Intrinsics.checkNotNull(listenerAccess$getListener);
            PhoneNumberPresenter phoneNumberPresenter = new PhoneNumberPresenter(incodeRepository, phoneNumberUtilCreateInstance, phoneNumberBus, listenerAccess$getListener, PhoneNumberFragment.this, zIsCaptureOnlyMode, z2, i3, strE);
            int i4 = f16988a + 123;
            f16989d = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 19 / 0;
            }
            return phoneNumberPresenter;
        }

        e() {
            super(0);
        }
    }

    public final PhoneNumberPresenter getPresenter() {
        int i2 = 2 % 2;
        int i3 = f16980h + 13;
        f16981j = i3 % 128;
        int i4 = i3 % 2;
        PhoneNumberPresenter phoneNumberPresenter = (PhoneNumberPresenter) this.f16984d.getValue();
        int i5 = f16981j + 69;
        f16980h = i5 % 128;
        int i6 = i5 % 2;
        return phoneNumberPresenter;
    }

    private static final void d(PhoneNumberFragment phoneNumberFragment, View view) {
        int i2 = 2 % 2;
        int i3 = f16980h + 45;
        f16981j = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(phoneNumberFragment, "");
            phoneNumberFragment.e();
            int i4 = 35 / 0;
        } else {
            Intrinsics.checkNotNullParameter(phoneNumberFragment, "");
            phoneNumberFragment.e();
        }
        int i5 = f16980h + 1;
        f16981j = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        ax axVarB = ax.b(layoutInflater, viewGroup);
        Intrinsics.checkNotNullExpressionValue(axVarB, "");
        this.f16982a = axVarB;
        getPresenter().onCreateView();
        ax axVar = this.f16982a;
        ax axVar2 = null;
        if (axVar == null) {
            int i3 = f16981j + 123;
            f16980h = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f16980h + 57;
            f16981j = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 5;
            }
            axVar = null;
        }
        axVar.f6978e.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.phone_number.PhoneNumberFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneNumberFragment.m8531xd0e31f79(this.f$0, view);
            }
        });
        boolean zIsOptInEnabled = getRepo().isOptInEnabled();
        if (zIsOptInEnabled) {
            axVar.f6977d.setVisibility(0);
            axVar.f6977d.setChecked(true);
            CheckBox checkBox = axVar.f6977d;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = getString(R.string.onboard_sdk_phone_number_check_box_description);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String str = String.format(string, Arrays.copyOf(new Object[]{getRepo().getOptInCompanyName()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            checkBox.setText(str);
        } else if (!zIsOptInEnabled) {
            axVar.f6977d.setVisibility(8);
        }
        ax axVar3 = this.f16982a;
        if (axVar3 == null) {
            int i7 = f16981j + 89;
            f16980h = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i8 == 0) {
                axVar2.hashCode();
                throw null;
            }
        } else {
            axVar2 = axVar3;
        }
        ConstraintLayout constraintLayoutD = axVar2.d();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutD, "");
        ConstraintLayout constraintLayout = constraintLayoutD;
        int i9 = f16981j + 15;
        f16980h = i9 % 128;
        int i10 = i9 % 2;
        return constraintLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(ax axVar, PhoneNumberFragment phoneNumberFragment, TextView textView, int i2, KeyEvent keyEvent) {
        int i3 = 2 % 2;
        int i4 = f16981j + 125;
        f16980h = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(axVar, "");
        Intrinsics.checkNotNullParameter(phoneNumberFragment, "");
        if (i2 == 4 && !(!axVar.f6978e.isEnabled())) {
            phoneNumberFragment.e();
            return true;
        }
        int i6 = f16980h + 15;
        f16981j = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.phone_number.PhoneNumberContract.View
    public final void prefillPhoneNumber(String str) {
        int i2 = 2 % 2;
        final ax axVar = this.f16982a;
        Object obj = null;
        if (axVar == null) {
            int i3 = f16981j + 3;
            f16980h = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            axVar = null;
        }
        IncodeEditText incodeEditText = axVar.f6974a;
        Intrinsics.checkNotNullExpressionValue(incodeEditText, "");
        incodeEditText.addTextChangedListener(new TextWatcher() { // from class: com.incode.welcome_sdk.ui.phone_number.PhoneNumberFragment$prefillPhoneNumber$lambda$5$$inlined$addTextChangedListener$default$1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f16991d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f16992e = 0;

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int i4 = 2 % 2;
                int i5 = f16991d + 57;
                int i6 = i5 % 128;
                f16992e = i6;
                int i7 = i5 % 2;
                if (editable != null) {
                    int i8 = i6 + 7;
                    f16991d = i8 % 128;
                    if (i8 % 2 != 0) {
                        PhoneNumberFragment.access$onPhoneNumberChanged(this.f16993c, editable);
                        return;
                    }
                    PhoneNumberFragment.access$onPhoneNumberChanged(this.f16993c, editable);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                int i7 = 2 % 2;
                int i8 = f16992e + 95;
                f16991d = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 86 / 0;
                }
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                int i7 = 2 % 2;
                int i8 = f16992e + 101;
                f16991d = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 11 / 0;
                }
            }
        });
        axVar.f6974a.addTextChangedListener(new MyPhoneNumberFormattingTextWatcher(getContext(), null, 2, null));
        axVar.f6974a.requestFocus();
        axVar.f6974a.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.incode.welcome_sdk.ui.phone_number.PhoneNumberFragment$$ExternalSyntheticLambda0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                return PhoneNumberFragment.c(axVar, this, textView, i4, keyEvent);
            }
        });
        String str2 = str;
        if (!StringUtils.isNotBlank(str2)) {
            axVar.f6974a.setTextColor(ContextCompat.getColor(getContext(), R.color.onboard_sdk_TextColorDisabled));
            axVar.f6974a.append("+" + getPresenter().getPhonePrefix() + Global.BLANK);
            return;
        }
        int i4 = f16980h + 83;
        f16981j = i4 % 128;
        if (i4 % 2 == 0) {
            axVar.f6974a.setText(str2);
        } else {
            axVar.f6974a.setText(str2);
            throw null;
        }
    }

    private final void e() {
        int i2 = 2 % 2;
        hideKeyboard();
        EventUtils.sendContinueEvent(getRepo(), requireActivity());
        PhoneNumberPresenter presenter = getPresenter();
        ax axVar = this.f16982a;
        ax axVar2 = null;
        if (axVar == null) {
            int i3 = f16981j + 55;
            f16980h = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            axVar = null;
        }
        String strValueOf = String.valueOf(axVar.f6974a.getText());
        ax axVar3 = this.f16982a;
        if (axVar3 == null) {
            int i4 = f16980h + 113;
            f16981j = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            axVar2 = axVar3;
        }
        presenter.submitPhone(strValueOf, axVar2.f6977d.isChecked());
    }

    private final void a(CharSequence charSequence) {
        int i2 = 2 % 2;
        ax axVar = null;
        if (charSequence.length() == 0) {
            int i3 = f16981j + 21;
            f16980h = i3 % 128;
            int i4 = i3 % 2;
            ax axVar2 = this.f16982a;
            if (axVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                axVar2 = null;
            }
            axVar2.f6974a.append("+");
        } else if (charSequence.charAt(0) != '+') {
            ax axVar3 = this.f16982a;
            if (axVar3 == null) {
                int i5 = f16981j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f16980h = i5 % 128;
                if (i5 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                axVar3 = null;
            }
            Editable text = axVar3.f6974a.getText();
            if (text != null) {
                text.insert(0, "+");
            }
        }
        ax axVar4 = this.f16982a;
        if (axVar4 == null) {
            int i6 = f16981j + 125;
            f16980h = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                axVar.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            axVar = axVar4;
        }
        axVar.f6974a.setTextColor(ContextCompat.getColor(getContext(), getPresenter().getColorBasedOnPhoneNumber(charSequence)));
        enableContinueButton(getPresenter().isPhoneValid(charSequence));
    }

    @Override // com.incode.welcome_sdk.ui.phone_number.PhoneNumberContract.View
    public final void enableContinueButton(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f16981j + 81;
        int i4 = i3 % 128;
        f16980h = i4;
        int i5 = i3 % 2;
        ax axVar = this.f16982a;
        if (axVar == null) {
            int i6 = i4 + 45;
            f16981j = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            axVar = null;
        }
        axVar.f6978e.setEnabled(z2);
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f16981j + 57;
        f16980h = i3 % 128;
        if (i3 % 2 == 0) {
            getPresenter().onDestroy();
            super.safeOnDestroy();
            int i4 = 5 / 0;
        } else {
            getPresenter().onDestroy();
            super.safeOnDestroy();
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16986a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16987b = 1;

        private Companion() {
        }

        public final PhoneNumberFragment newInstance(boolean z2, int i2) {
            int i3 = 2 % 2;
            PhoneNumberFragment phoneNumberFragment = new PhoneNumberFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("extraIsOtpVerificationEnabled", z2);
            bundle.putInt("extraDefaultRegionPrefix", i2);
            phoneNumberFragment.setArguments(bundle);
            int i4 = f16987b + 85;
            f16986a = i4 % 128;
            int i5 = i4 % 2;
            return phoneNumberFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f16978f + 87;
        f16979g = i2 % 128;
        int i3 = i2 % 2;
    }
}
