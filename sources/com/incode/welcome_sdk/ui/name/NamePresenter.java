package com.incode.welcome_sdk.ui.name;

import android.os.Process;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.results.NameResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.name.NameContract;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class NamePresenter extends BaseModulePresenter implements NameContract.Presenter {

    /* JADX INFO: renamed from: a */
    private static int f16470a = 1;

    /* JADX INFO: renamed from: c */
    private static int f16471c = 0;

    /* JADX INFO: renamed from: b */
    private final NameContract.View f16472b;

    /* JADX INFO: renamed from: d */
    private final CompositeDisposable f16473d;

    /* JADX INFO: renamed from: e */
    private final IncodeWelcomeRepository f16474e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public NamePresenter(IncodeWelcomeRepository incodeWelcomeRepository, NameContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f16474e = incodeWelcomeRepository;
        this.f16472b = view;
        this.f16473d = new CompositeDisposable();
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f16471c + 117;
        f16470a = i3 % 128;
        if (i3 % 2 == 0) {
            this.f16473d.clear();
            int i4 = 38 / 0;
        } else {
            this.f16473d.clear();
        }
        int i5 = f16471c + 111;
        f16470a = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class b extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16475a = 0;

        /* JADX INFO: renamed from: b */
        private static int f16476b = 1;

        /* JADX INFO: renamed from: c */
        public static int f16477c = 0;

        /* JADX INFO: renamed from: e */
        public static int f16478e = 0;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ IncodeWelcome.AddDataListener f16479d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f16475a + 29;
            f16476b = i3 % 128;
            int i4 = i3 % 2;
            d(responseSuccess);
            Unit unit = Unit.INSTANCE;
            int i5 = f16476b + 75;
            f16475a = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void d(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseSuccess, "");
            if (this.f16479d != null && responseSuccess.isSuccess()) {
                int i3 = f16475a + 105;
                f16476b = i3 % 128;
                int i4 = i3 % 2;
                this.f16479d.onSuccess();
            }
            int i5 = f16475a + 35;
            f16476b = i5 % 128;
            int i6 = i5 % 2;
        }

        public static int a() {
            int i2 = f16478e;
            int i3 = i2 % 8630887;
            f16478e = i2 + 1;
            if (i3 != 0) {
                return f16477c;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            f16477c = elapsedCpuTime;
            return elapsedCpuTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(IncodeWelcome.AddDataListener addDataListener) {
            super(1);
            this.f16479d = addDataListener;
        }
    }

    static final class d extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16480a = 1;

        /* JADX INFO: renamed from: c */
        private static int f16481c = 0;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ IncodeWelcome.AddDataListener f16482e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f16481c + 33;
            f16480a = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f16481c + 11;
            f16480a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
        
            if (r0 != null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
        
            r0.onError(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0025, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
        
            if (r0 != null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
        
            r1 = com.incode.welcome_sdk.ui.name.NamePresenter.d.f16481c + 103;
            com.incode.welcome_sdk.ui.name.NamePresenter.d.f16480a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
        
            if ((r1 % 2) != 0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
        
            r0 = 59 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0043, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(java.lang.Throwable r6) {
            /*
                r5 = this;
                r4 = 2
                int r0 = r4 % r4
                int r0 = com.incode.welcome_sdk.ui.name.NamePresenter.d.f16480a
                int r1 = r0 + 45
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.name.NamePresenter.d.f16481c = r0
                int r1 = r1 % r4
                r3 = 0
                java.lang.String r2 = "Couldn't add name"
                java.lang.String r0 = ""
                if (r1 == 0) goto L26
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                timber.log.Timber$Forest r1 = timber.log.Timber.Forest
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1.e(r6, r2, r0)
                com.incode.welcome_sdk.IncodeWelcome$AddDataListener r0 = r5.f16482e
                if (r0 == 0) goto L35
            L22:
                r0.onError(r6)
                return
            L26:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                timber.log.Timber$Forest r1 = timber.log.Timber.Forest
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r1.e(r6, r2, r0)
                com.incode.welcome_sdk.IncodeWelcome$AddDataListener r0 = r5.f16482e
                if (r0 == 0) goto L35
                goto L22
            L35:
                int r0 = com.incode.welcome_sdk.ui.name.NamePresenter.d.f16481c
                int r1 = r0 + 103
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.name.NamePresenter.d.f16480a = r0
                int r1 = r1 % r4
                if (r1 != 0) goto L43
                r0 = 59
                int r0 = r0 / r3
            L43:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.name.NamePresenter.d.e(java.lang.Throwable):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(IncodeWelcome.AddDataListener addDataListener) {
            super(1);
            this.f16482e = addDataListener;
        }
    }

    public static final void b(NamePresenter namePresenter) {
        int i2 = 2 % 2;
        int i3 = f16471c + 91;
        f16470a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(namePresenter, "");
            namePresenter.f16472b.enableContinueButton(false);
        } else {
            Intrinsics.checkNotNullParameter(namePresenter, "");
            namePresenter.f16472b.enableContinueButton(true);
        }
        int i4 = f16470a + 89;
        f16471c = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
    }

    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16470a + 71;
        f16471c = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
    }

    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16470a + 53;
        f16471c = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
    }

    private final void d(String str, IncodeWelcome.AddDataListener addDataListener) {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f16473d;
        Observable<ResponseSuccess> observableDoFinally = this.f16474e.addName(str).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doFinally(new Action() { // from class: com.incode.welcome_sdk.ui.name.NamePresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Action
            public final void run() {
                NamePresenter.b(this.f$0);
            }
        });
        final b bVar = new b(addDataListener);
        Consumer<? super ResponseSuccess> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.name.NamePresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NamePresenter.d(bVar, obj);
            }
        };
        final d dVar = new d(addDataListener);
        compositeDisposable.add(observableDoFinally.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.name.NamePresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NamePresenter.e(dVar, obj);
            }
        }));
        int i3 = f16471c + 89;
        f16470a = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.name.NamePresenter$submitName$1 */
    public static final class AnonymousClass1 implements IncodeWelcome.AddDataListener {

        /* JADX INFO: renamed from: a */
        private static int f16483a = 1;

        /* JADX INFO: renamed from: c */
        private static int f16484c = 0;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ String f16486e;

        AnonymousClass1(String str) {
            str = str;
        }

        @Override // com.incode.welcome_sdk.IncodeWelcome.AddDataListener
        public final void onSuccess() {
            int i2 = 2 % 2;
            NamePresenter.this.publishResult(new NameResult(ResultCode.SUCCESS, null, str, 2, null));
            int i3 = f16483a + 75;
            f16484c = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // com.incode.welcome_sdk.IncodeWelcome.AddDataListener
        public final void onError(Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            NamePresenter.this.publishResult(new NameResult(ResultCode.ERROR, th, null, 4, null));
            int i3 = f16484c + 85;
            f16483a = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
    
        if (com.incode.welcome_sdk.IncodeWelcome.Companion.getInstance().isCaptureOnlyMode() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
    
        publishResult(new com.incode.welcome_sdk.results.NameResult(com.incode.welcome_sdk.results.ResultCode.SUCCESS, null, r11, 2, null));
        r1 = com.incode.welcome_sdk.ui.name.NamePresenter.f16471c + 11;
        com.incode.welcome_sdk.ui.name.NamePresenter.f16470a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (com.incode.welcome_sdk.IncodeWelcome.Companion.getInstance().isCaptureOnlyMode() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        d(r11, new com.incode.welcome_sdk.ui.name.NamePresenter.AnonymousClass1(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        return;
     */
    @Override // com.incode.welcome_sdk.ui.name.NameContract.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void submitName(java.lang.String r11) {
        /*
            r10 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.name.NamePresenter.f16471c
            int r2 = r0 + 29
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.name.NamePresenter.f16470a = r0
            int r2 = r2 % r3
            r1 = 0
            java.lang.String r0 = ""
            r7 = r11
            if (r2 != 0) goto L3d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.incode.welcome_sdk.ui.name.NameContract$View r0 = r10.f16472b
            r0.enableContinueButton(r1)
            com.incode.welcome_sdk.IncodeWelcome$Companion r0 = com.incode.welcome_sdk.IncodeWelcome.Companion
            com.incode.welcome_sdk.IncodeWelcome r0 = r0.getInstance()
            boolean r0 = r0.isCaptureOnlyMode()
            if (r0 == 0) goto L52
        L26:
            com.incode.welcome_sdk.results.NameResult r4 = new com.incode.welcome_sdk.results.NameResult
            com.incode.welcome_sdk.results.ResultCode r5 = com.incode.welcome_sdk.results.ResultCode.SUCCESS
            r8 = 2
            r9 = 0
            r6 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r10.publishResult(r4)
            int r0 = com.incode.welcome_sdk.ui.name.NamePresenter.f16471c
            int r1 = r0 + 11
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.name.NamePresenter.f16470a = r0
            int r1 = r1 % r3
            return
        L3d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.incode.welcome_sdk.ui.name.NameContract$View r0 = r10.f16472b
            r0.enableContinueButton(r1)
            com.incode.welcome_sdk.IncodeWelcome$Companion r0 = com.incode.welcome_sdk.IncodeWelcome.Companion
            com.incode.welcome_sdk.IncodeWelcome r0 = r0.getInstance()
            boolean r0 = r0.isCaptureOnlyMode()
            if (r0 == 0) goto L52
            goto L26
        L52:
            com.incode.welcome_sdk.ui.name.NamePresenter$submitName$1 r0 = new com.incode.welcome_sdk.ui.name.NamePresenter$submitName$1
            r0.<init>()
            com.incode.welcome_sdk.IncodeWelcome$AddDataListener r0 = (com.incode.welcome_sdk.IncodeWelcome.AddDataListener) r0
            r10.d(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.name.NamePresenter.submitName(java.lang.String):void");
    }

    @Override // com.incode.welcome_sdk.ui.name.NameContract.Presenter
    public final void publishResult(NameResult nameResult) {
        int i2 = 2 % 2;
        int i3 = f16471c + 37;
        f16470a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(nameResult, "");
            publishResult(IncodeWelcome.Companion.getInstance().getNameBus(), nameResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(nameResult, "");
        publishResult(IncodeWelcome.Companion.getInstance().getNameBus(), nameResult);
        int i4 = f16471c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f16470a = i4 % 128;
        int i5 = i4 % 2;
    }
}
