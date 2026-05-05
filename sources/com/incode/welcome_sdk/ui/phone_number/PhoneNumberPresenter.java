package com.incode.welcome_sdk.ui.phone_number;

import android.telephony.PhoneNumberUtils;
import com.dynatrace.android.agent.AdkSettings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.results.PhoneNumberResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.phone_number.PhoneNumberContract;
import com.incode.welcome_sdk.ui.phone_number.PhoneNumberFragment;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class PhoneNumberPresenter extends BaseModulePresenter implements PhoneNumberContract.Presenter {

    /* JADX INFO: renamed from: l */
    private static int f16994l = 1;

    /* JADX INFO: renamed from: n */
    private static int f16995n = 0;

    /* JADX INFO: renamed from: a */
    private final PhoneNumberUtil f16996a;

    /* JADX INFO: renamed from: b */
    private final IncodeWelcomeRepository f16997b;

    /* JADX INFO: renamed from: c */
    private final PublishSubject<PhoneNumberResult> f16998c;

    /* JADX INFO: renamed from: d */
    private final PhoneNumberContract.View f16999d;

    /* JADX INFO: renamed from: e */
    private final PhoneNumberFragment.Listener f17000e;

    /* JADX INFO: renamed from: f */
    private final int f17001f;

    /* JADX INFO: renamed from: g */
    private final boolean f17002g;

    /* JADX INFO: renamed from: h */
    private final String f17003h;

    /* JADX INFO: renamed from: i */
    private final boolean f17004i;

    /* JADX INFO: renamed from: j */
    private final CompositeDisposable f17005j;

    public static final /* synthetic */ PhoneNumberFragment.Listener access$getListener$p(PhoneNumberPresenter phoneNumberPresenter) {
        int i2 = 2 % 2;
        int i3 = f16994l + 57;
        int i4 = i3 % 128;
        f16995n = i4;
        int i5 = i3 % 2;
        PhoneNumberFragment.Listener listener = phoneNumberPresenter.f17000e;
        int i6 = i4 + 59;
        f16994l = i6 % 128;
        int i7 = i6 % 2;
        return listener;
    }

    public static final /* synthetic */ PhoneNumberContract.View access$getView$p(PhoneNumberPresenter phoneNumberPresenter) {
        int i2 = 2 % 2;
        int i3 = f16995n + 35;
        f16994l = i3 % 128;
        int i4 = i3 % 2;
        PhoneNumberContract.View view = phoneNumberPresenter.f16999d;
        if (i4 == 0) {
            int i5 = 63 / 0;
        }
        return view;
    }

    public static final /* synthetic */ boolean access$isOtpVerificationEnabled$p(PhoneNumberPresenter phoneNumberPresenter) {
        int i2 = 2 % 2;
        int i3 = f16994l + 65;
        f16995n = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = phoneNumberPresenter.f17004i;
        if (i4 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$publishResult(PhoneNumberPresenter phoneNumberPresenter, PhoneNumberResult phoneNumberResult) {
        int i2 = 2 % 2;
        int i3 = f16994l + 63;
        f16995n = i3 % 128;
        int i4 = i3 % 2;
        phoneNumberPresenter.a(phoneNumberResult);
        if (i4 != 0) {
            throw null;
        }
        int i5 = f16994l + 49;
        f16995n = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberPresenter(IncodeWelcomeRepository incodeWelcomeRepository, PhoneNumberUtil phoneNumberUtil, PublishSubject<PhoneNumberResult> publishSubject, PhoneNumberFragment.Listener listener, PhoneNumberContract.View view, boolean z2, boolean z3, int i2, String str) {
        super(view);
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(phoneNumberUtil, "");
        Intrinsics.checkNotNullParameter(publishSubject, "");
        Intrinsics.checkNotNullParameter(listener, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f16997b = incodeWelcomeRepository;
        this.f16996a = phoneNumberUtil;
        this.f16998c = publishSubject;
        this.f17000e = listener;
        this.f16999d = view;
        this.f17002g = z2;
        this.f17004i = z3;
        this.f17001f = i2;
        this.f17003h = str;
        this.f17005j = new CompositeDisposable();
    }

    @Override // com.incode.welcome_sdk.ui.phone_number.PhoneNumberContract.Presenter
    public final void onCreateView() {
        int i2 = 2 % 2;
        int i3 = f16995n + 17;
        f16994l = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            e();
            int i4 = f16995n + 61;
            f16994l = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        e();
        obj.hashCode();
        throw null;
    }

    public final int getPhonePrefix() {
        int i2 = 2 % 2;
        int i3 = f16995n + 43;
        int i4 = i3 % 128;
        f16994l = i4;
        int i5 = i3 % 2;
        int i6 = this.f17001f;
        if (i6 >= 0) {
            int i7 = i4 + 11;
            f16995n = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 82 / 0;
            }
            return i6;
        }
        int countryCodeForRegion = this.f16996a.getCountryCodeForRegion(this.f17003h);
        int i9 = f16994l + 95;
        f16995n = i9 % 128;
        int i10 = i9 % 2;
        return countryCodeForRegion;
    }

    public final int getColorBasedOnPhoneNumber(CharSequence charSequence) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f16995n + 45;
        f16994l = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        try {
            if (this.f16996a.parse(((Object) charSequence) + AdkSettings.PLATFORM_TYPE_MOBILE, this.f17003h).hasNationalNumber()) {
                i2 = R.color.onboard_sdk_TextColorDefault;
            } else {
                i2 = R.color.onboard_sdk_TextColorPlaceholder;
                int i6 = f16995n + 11;
                f16994l = i6 % 128;
                int i7 = i6 % 2;
            }
        } catch (NumberParseException unused) {
            i2 = R.color.onboard_sdk_TextColorPlaceholder;
        }
        int i8 = f16994l + 79;
        f16995n = i8 % 128;
        if (i8 % 2 == 0) {
            return i2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isPhoneValid(CharSequence charSequence) {
        boolean zIsValidNumber;
        int i2 = 2 % 2;
        int i3 = f16995n + 25;
        f16994l = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        try {
            zIsValidNumber = this.f16996a.isValidNumber(this.f16996a.parse(charSequence, this.f17003h));
        } catch (NumberParseException unused) {
            zIsValidNumber = false;
        }
        int i5 = f16994l + 63;
        f16995n = i5 % 128;
        int i6 = i5 % 2;
        return zIsValidNumber;
    }

    static final class d extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f17006b = 1;

        /* JADX INFO: renamed from: d */
        private static int f17007d = 0;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ String f17009e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f17006b + 23;
            f17007d = i3 % 128;
            int i4 = i3 % 2;
            a(responseSuccess);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        private void a(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseSuccess, "");
            if (responseSuccess.isSuccess()) {
                if (PhoneNumberPresenter.access$isOtpVerificationEnabled$p(PhoneNumberPresenter.this)) {
                    PhoneNumberPresenter.access$getListener$p(PhoneNumberPresenter.this).onPhoneNumberProvidedOtpRequired(this.f17009e);
                    int i3 = f17007d + 109;
                    f17006b = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 50 / 0;
                        return;
                    }
                    return;
                }
                PhoneNumberPresenter.access$publishResult(PhoneNumberPresenter.this, new PhoneNumberResult(ResultCode.SUCCESS, null, this.f17009e, 2, null));
                int i5 = f17006b + 123;
                f17007d = i5 % 128;
                int i6 = i5 % 2;
            }
            int i7 = f17007d + 69;
            f17006b = i7 % 128;
            int i8 = i7 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.f17009e = str;
        }
    }

    static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f17010b = 0;

        /* JADX INFO: renamed from: e */
        private static int f17011e = 1;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ boolean f17013c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ CharSequence f17014d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f17010b + 125;
            f17011e = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            d(th);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f17011e + 71;
            f17010b = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.phone_number.PhoneNumberPresenter$e$2 */
        static final class AnonymousClass2 extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a */
            private static int f17015a = 0;

            /* JADX INFO: renamed from: c */
            private static int f17016c = 1;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ boolean f17017b;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ CharSequence f17018d;

            private void c() {
                int i2 = 2 % 2;
                int i3 = f17015a + 109;
                f17016c = i3 % 128;
                int i4 = i3 % 2;
                phoneNumberPresenter.submitPhone(charSequence, z);
                int i5 = f17016c + 9;
                f17015a = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i2 = 2 % 2;
                int i3 = f17016c + 1;
                f17015a = i3 % 128;
                int i4 = i3 % 2;
                c();
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CharSequence charSequence, boolean z2) {
                super(0);
                charSequence = charSequence;
                z = z2;
            }
        }

        private void d(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f17010b + 89;
            f17011e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            if (ThrowableExtensionsKt.isNoConnectivityException(th)) {
                Timber.Forest.e(th, "Couldn't add phone number due to failed connection.", new Object[0]);
                PhoneNumberPresenter.access$getView$p(PhoneNumberPresenter.this).showNoNetworkMessage(new Function0<Unit>() { // from class: com.incode.welcome_sdk.ui.phone_number.PhoneNumberPresenter.e.2

                    /* JADX INFO: renamed from: a */
                    private static int f17015a = 0;

                    /* JADX INFO: renamed from: c */
                    private static int f17016c = 1;

                    /* JADX INFO: renamed from: b */
                    private /* synthetic */ boolean f17017b;

                    /* JADX INFO: renamed from: d */
                    private /* synthetic */ CharSequence f17018d;

                    private void c() {
                        int i22 = 2 % 2;
                        int i32 = f17015a + 109;
                        f17016c = i32 % 128;
                        int i42 = i32 % 2;
                        phoneNumberPresenter.submitPhone(charSequence, z);
                        int i5 = f17016c + 9;
                        f17015a = i5 % 128;
                        if (i5 % 2 == 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Unit invoke() {
                        int i22 = 2 % 2;
                        int i32 = f17016c + 1;
                        f17015a = i32 % 128;
                        int i42 = i32 % 2;
                        c();
                        Unit unit = Unit.INSTANCE;
                        if (i42 == 0) {
                            return unit;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(CharSequence charSequence, boolean z2) {
                        super(0);
                        charSequence = charSequence;
                        z = z2;
                    }
                });
                return;
            }
            Timber.Forest.e(th, "Couldn't add phone number.", new Object[0]);
            PhoneNumberPresenter.access$publishResult(PhoneNumberPresenter.this, new PhoneNumberResult(ResultCode.ERROR, th, null, 4, null));
            int i5 = f17010b + 77;
            f17011e = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CharSequence charSequence, boolean z2) {
            super(1);
            this.f17014d = charSequence;
            this.f17013c = z2;
        }
    }

    public static final void a(PhoneNumberPresenter phoneNumberPresenter) {
        int i2 = 2 % 2;
        int i3 = f16994l + 33;
        f16995n = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(phoneNumberPresenter, "");
        } else {
            Intrinsics.checkNotNullParameter(phoneNumberPresenter, "");
        }
        phoneNumberPresenter.f16999d.enableContinueButton(true);
    }

    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16994l + 63;
        f16995n = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f16995n + 125;
        f16994l = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16994l + 109;
        f16995n = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 39 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        }
        int i5 = f16994l + 83;
        f16995n = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void submitPhone(CharSequence charSequence, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f16994l + 85;
        f16995n = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.f16999d.enableContinueButton(false);
        String strE = e(charSequence);
        if (this.f17002g) {
            a(new PhoneNumberResult(ResultCode.SUCCESS, null, strE, 2, null));
            return;
        }
        CompositeDisposable compositeDisposable = this.f17005j;
        Observable<ResponseSuccess> observableDoFinally = this.f16997b.addPhone(strE, z2, this.f17004i).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doFinally(new Action() { // from class: com.incode.welcome_sdk.ui.phone_number.PhoneNumberPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Action
            public final void run() {
                PhoneNumberPresenter.a(this.f$0);
            }
        });
        final d dVar = new d(strE);
        Consumer<? super ResponseSuccess> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.phone_number.PhoneNumberPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PhoneNumberPresenter.c(dVar, obj);
            }
        };
        final e eVar = new e(charSequence, z2);
        compositeDisposable.add(observableDoFinally.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.phone_number.PhoneNumberPresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PhoneNumberPresenter.b(eVar, obj);
            }
        }));
        int i5 = f16994l + 21;
        f16995n = i5 % 128;
        int i6 = i5 % 2;
    }

    private static String e(CharSequence charSequence) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder(charSequence.length());
        int i3 = f16994l + 81;
        f16995n = i3 % 128;
        int i4 = i3 % 2;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char cCharAt = charSequence.charAt(i5);
            if (PhoneNumberUtils.isNonSeparator(cCharAt)) {
                int i6 = f16995n + 61;
                f16994l = i6 % 128;
                int i7 = i6 % 2;
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final void e() {
        int i2 = 2 % 2;
        int i3 = f16995n + 87;
        f16994l = i3 % 128;
        if (i3 % 2 != 0) {
            this.f16999d.prefillPhoneNumber(this.f16997b.getPrefilledPhoneNumber());
            int i4 = f16995n + 117;
            f16994l = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 15 / 0;
                return;
            }
            return;
        }
        this.f16999d.prefillPhoneNumber(this.f16997b.getPrefilledPhoneNumber());
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f16994l + 77;
        f16995n = i3 % 128;
        if (i3 % 2 != 0) {
            this.f17005j.clear();
            throw null;
        }
        this.f17005j.clear();
        int i4 = f16994l + 17;
        f16995n = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
    }

    private final void a(PhoneNumberResult phoneNumberResult) {
        int i2 = 2 % 2;
        int i3 = f16994l + 31;
        f16995n = i3 % 128;
        if (i3 % 2 != 0) {
            publishResult(this.f16998c, phoneNumberResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        publishResult(this.f16998c, phoneNumberResult);
        int i4 = f16994l + 41;
        f16995n = i4 % 128;
        int i5 = i4 % 2;
    }
}
