package com.incode.welcome_sdk.ui.email_address;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.results.EmailAddressResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.email_address.EmailAddressContract;
import com.incode.welcome_sdk.ui.email_address.EmailAddressFragment;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.subjects.Subject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class EmailAddressPresenter extends BaseModulePresenter implements BasePresenter {

    /* JADX INFO: renamed from: f */
    private static int f14210f = 1;

    /* JADX INFO: renamed from: i */
    private static int f14211i = 0;

    /* JADX INFO: renamed from: a */
    private final IncodeWelcomeRepository f14212a;

    /* JADX INFO: renamed from: b */
    private final boolean f14213b;

    /* JADX INFO: renamed from: c */
    private final EmailAddressFragment.Listener f14214c;

    /* JADX INFO: renamed from: d */
    private final EmailAddressContract.View f14215d;

    /* JADX INFO: renamed from: e */
    private final Subject<EmailAddressResult> f14216e;

    /* JADX INFO: renamed from: h */
    private final boolean f14217h;

    /* JADX INFO: renamed from: j */
    private final CompositeDisposable f14218j;

    public static final /* synthetic */ EmailAddressFragment.Listener access$getListener$p(EmailAddressPresenter emailAddressPresenter) {
        int i2 = 2 % 2;
        int i3 = f14211i + 7;
        f14210f = i3 % 128;
        int i4 = i3 % 2;
        EmailAddressFragment.Listener listener = emailAddressPresenter.f14214c;
        if (i4 != 0) {
            return listener;
        }
        throw null;
    }

    public static final /* synthetic */ EmailAddressContract.View access$getView$p(EmailAddressPresenter emailAddressPresenter) {
        int i2 = 2 % 2;
        int i3 = f14210f + 57;
        int i4 = i3 % 128;
        f14211i = i4;
        int i5 = i3 % 2;
        EmailAddressContract.View view = emailAddressPresenter.f14215d;
        if (i5 != 0) {
            int i6 = 73 / 0;
        }
        int i7 = i4 + 19;
        f14210f = i7 % 128;
        int i8 = i7 % 2;
        return view;
    }

    public static final /* synthetic */ boolean access$isOtpVerificationEnabled$p(EmailAddressPresenter emailAddressPresenter) {
        int i2 = 2 % 2;
        int i3 = f14210f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14211i = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = emailAddressPresenter.f14217h;
        if (i4 != 0) {
            int i5 = 4 / 0;
        }
        return z2;
    }

    public static final /* synthetic */ void access$publishResult(EmailAddressPresenter emailAddressPresenter, EmailAddressResult emailAddressResult) {
        int i2 = 2 % 2;
        int i3 = f14211i + 41;
        f14210f = i3 % 128;
        int i4 = i3 % 2;
        emailAddressPresenter.b(emailAddressResult);
        if (i4 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailAddressPresenter(IncodeWelcomeRepository incodeWelcomeRepository, Subject<EmailAddressResult> subject, EmailAddressFragment.Listener listener, EmailAddressContract.View view, boolean z2, boolean z3) {
        super(view);
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(subject, "");
        Intrinsics.checkNotNullParameter(listener, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f14212a = incodeWelcomeRepository;
        this.f14216e = subject;
        this.f14214c = listener;
        this.f14215d = view;
        this.f14213b = z2;
        this.f14217h = z3;
        this.f14218j = new CompositeDisposable();
    }

    static final class b extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f14219c = 0;

        /* JADX INFO: renamed from: d */
        private static int f14220d = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ String f14222b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f14220d + 97;
            f14219c = i3 % 128;
            int i4 = i3 % 2;
            c(responseSuccess);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 75 / 0;
            }
            int i6 = f14219c + 117;
            f14220d = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void c(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f14219c + 27;
            f14220d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(responseSuccess, "");
            if (responseSuccess.isSuccess()) {
                int i5 = f14220d + 125;
                f14219c = i5 % 128;
                int i6 = i5 % 2;
                if (EmailAddressPresenter.access$isOtpVerificationEnabled$p(EmailAddressPresenter.this)) {
                    EmailAddressPresenter.access$getListener$p(EmailAddressPresenter.this).onEmailProvidedOtpRequired(this.f14222b);
                    return;
                }
                EmailAddressPresenter.access$publishResult(EmailAddressPresenter.this, new EmailAddressResult(ResultCode.SUCCESS, null, this.f14222b, 2, null));
                int i7 = f14219c + 105;
                f14220d = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 % 4;
                }
            }
            int i9 = f14219c + 49;
            f14220d = i9 % 128;
            int i10 = i9 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f14222b = str;
        }
    }

    static final class d extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f14223a = 0;

        /* JADX INFO: renamed from: b */
        private static int f14224b = 1;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ String f14225d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14224b + 65;
            f14223a = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            c(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f14224b + 25;
            f14223a = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter$d$3 */
        static final class AnonymousClass3 extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: a */
            private static int f14227a = 1;

            /* JADX INFO: renamed from: c */
            private static int f14228c = 0;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ String f14230e;

            private void d() {
                int i2 = 2 % 2;
                int i3 = f14227a + 101;
                f14228c = i3 % 128;
                int i4 = i3 % 2;
                emailAddressPresenter.submitEmail(str);
                int i5 = f14227a + 71;
                f14228c = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 21 / 0;
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i2 = 2 % 2;
                int i3 = f14227a + 81;
                f14228c = i3 % 128;
                int i4 = i3 % 2;
                d();
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    return unit;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(String str) {
                super(0);
                str = str;
            }
        }

        private void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14223a + 3;
            f14224b = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th, "");
                ThrowableExtensionsKt.isNoConnectivityException(th);
                throw null;
            }
            Intrinsics.checkNotNullParameter(th, "");
            if (ThrowableExtensionsKt.isNoConnectivityException(th)) {
                Timber.Forest.e(th, "Couldn't add email due to failed connection.", new Object[0]);
                EmailAddressPresenter.access$getView$p(EmailAddressPresenter.this).showNoNetworkMessage(new Function0<Unit>() { // from class: com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter.d.3

                    /* JADX INFO: renamed from: a */
                    private static int f14227a = 1;

                    /* JADX INFO: renamed from: c */
                    private static int f14228c = 0;

                    /* JADX INFO: renamed from: e */
                    private /* synthetic */ String f14230e;

                    private void d() {
                        int i22 = 2 % 2;
                        int i32 = f14227a + 101;
                        f14228c = i32 % 128;
                        int i4 = i32 % 2;
                        emailAddressPresenter.submitEmail(str);
                        int i5 = f14227a + 71;
                        f14228c = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 21 / 0;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Unit invoke() {
                        int i22 = 2 % 2;
                        int i32 = f14227a + 81;
                        f14228c = i32 % 128;
                        int i4 = i32 % 2;
                        d();
                        Unit unit = Unit.INSTANCE;
                        if (i4 == 0) {
                            return unit;
                        }
                        throw null;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(String str) {
                        super(0);
                        str = str;
                    }
                });
                return;
            }
            Timber.Forest.e(th, "Couldn't add email", new Object[0]);
            EmailAddressPresenter.access$publishResult(EmailAddressPresenter.this, new EmailAddressResult(ResultCode.ERROR, th, null, 4, null));
            int i4 = f14224b + 59;
            f14223a = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.f14225d = str;
        }
    }

    public static final void e(EmailAddressPresenter emailAddressPresenter) {
        int i2 = 2 % 2;
        int i3 = f14210f + 99;
        f14211i = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(emailAddressPresenter, "");
        } else {
            Intrinsics.checkNotNullParameter(emailAddressPresenter, "");
        }
        emailAddressPresenter.f14215d.enableContinueButton(true);
        int i4 = f14210f + 17;
        f14211i = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14210f + 97;
        f14211i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f14210f + 13;
        f14211i = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14210f + 51;
        f14211i = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x001c, code lost:
    
        if (r10.f14213b != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001e, code lost:
    
        b(new com.incode.welcome_sdk.results.EmailAddressResult(com.incode.welcome_sdk.results.ResultCode.SUCCESS, null, r11, 2, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        if (r10.f14213b != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        r5 = r10.f14218j;
        r3 = r10.f14212a.addEmail(r11, r10.f14217h).subscribeOn(io.reactivex.schedulers.Schedulers.io()).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).doFinally(new com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter$$ExternalSyntheticLambda0(r10));
        r0 = new com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter.b(r10, r11);
        r2 = new com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter$$ExternalSyntheticLambda1(r0);
        r1 = new com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter.d(r10, r11);
        r5.add(r3.subscribe(r2, new com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter$$ExternalSyntheticLambda2(r1)));
        r1 = com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter.f14210f + 125;
        com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter.f14211i = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if ((r1 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        r0 = 84 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void submitEmail(java.lang.String r11) {
        /*
            r10 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter.f14210f
            int r1 = r0 + 25
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter.f14211i = r0
            int r1 = r1 % r6
            java.lang.String r0 = ""
            r4 = 0
            r7 = r11
            if (r1 == 0) goto L2c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.incode.welcome_sdk.ui.email_address.EmailAddressContract$View r0 = r10.f14215d
            r0.enableContinueButton(r4)
            boolean r0 = r10.f14213b
            if (r0 == 0) goto L39
        L1e:
            com.incode.welcome_sdk.results.EmailAddressResult r4 = new com.incode.welcome_sdk.results.EmailAddressResult
            com.incode.welcome_sdk.results.ResultCode r5 = com.incode.welcome_sdk.results.ResultCode.SUCCESS
            r8 = 2
            r9 = 0
            r6 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r10.b(r4)
            return
        L2c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.incode.welcome_sdk.ui.email_address.EmailAddressContract$View r0 = r10.f14215d
            r0.enableContinueButton(r4)
            boolean r0 = r10.f14213b
            if (r0 == 0) goto L39
            goto L1e
        L39:
            io.reactivex.disposables.CompositeDisposable r5 = r10.f14218j
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r1 = r10.f14212a
            boolean r0 = r10.f14217h
            io.reactivex.Observable r1 = r1.addEmail(r7, r0)
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.io()
            io.reactivex.Observable r1 = r1.subscribeOn(r0)
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r1 = r1.observeOn(r0)
            com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter$$ExternalSyntheticLambda0 r0 = new com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter$$ExternalSyntheticLambda0
            r0.<init>()
            io.reactivex.Observable r3 = r1.doFinally(r0)
            com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter$b r0 = new com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter$b
            r0.<init>(r7)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter$$ExternalSyntheticLambda1 r2 = new com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter$$ExternalSyntheticLambda1
            r2.<init>()
            com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter$d r1 = new com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter$d
            r1.<init>(r7)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter$$ExternalSyntheticLambda2 r0 = new com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter$$ExternalSyntheticLambda2
            r0.<init>()
            io.reactivex.disposables.Disposable r0 = r3.subscribe(r2, r0)
            r5.add(r0)
            int r0 = com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter.f14210f
            int r1 = r0 + 125
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter.f14211i = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L89
            r0 = 84
            int r0 = r0 / r4
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.email_address.EmailAddressPresenter.submitEmail(java.lang.String):void");
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f14210f + 99;
        f14211i = i3 % 128;
        int i4 = i3 % 2;
        this.f14218j.clear();
        if (i4 != 0) {
            int i5 = 1 / 0;
        }
    }

    private final void b(EmailAddressResult emailAddressResult) {
        int i2 = 2 % 2;
        int i3 = f14211i + 23;
        f14210f = i3 % 128;
        int i4 = i3 % 2;
        publishResult(this.f14216e, emailAddressResult);
        int i5 = f14210f + 49;
        f14211i = i5 % 128;
        int i6 = i5 % 2;
    }
}
