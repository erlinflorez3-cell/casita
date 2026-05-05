package com.incode.welcome_sdk.ui.camera.id_validation;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Pair;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt;
import com.incode.welcome_sdk.commons.m;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.bb;
import com.incode.welcome_sdk.modules.g;
import com.incode.welcome_sdk.results.IdProcessResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdContract;
import com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveActivity;
import com.incode.welcome_sdk.ui.tutorial.TutorialPresenterModule;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class ProcessIdPresenter extends BaseModulePresenter implements ProcessIdContract.Presenter {

    /* JADX INFO: renamed from: f */
    private static int f11581f = 0;

    /* JADX INFO: renamed from: j */
    private static int f11582j = 1;

    /* JADX INFO: renamed from: a */
    private IdProcessResult f11583a;

    /* JADX INFO: renamed from: b */
    private final IncodeWelcomeRepository f11584b;

    /* JADX INFO: renamed from: c */
    private final CompositeDisposable f11585c;

    /* JADX INFO: renamed from: d */
    private bb f11586d;

    /* JADX INFO: renamed from: e */
    private boolean f11587e;

    public static /* synthetic */ Object d(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~(i6 | i4);
        int i9 = i7 | i8;
        int i10 = (~(i4 | (~i7))) | i6;
        int i11 = i6 + i7 + i5 + ((-1932811043) * i2) + (1521317780 * i3);
        int i12 = i11 * i11;
        int i13 = ((i6 * (-919556932)) - 154402816) + ((-919556932) * i7) + ((-1121407813) * i8) + (i9 * 1121407813) + (1121407813 * i10) + (201850880 * i5) + ((-2098724864) * i2) + ((-1398800384) * i3) + ((-1444151296) * i12);
        int i14 = (i6 * 1794637580) + 2133191799 + (i7 * 1794637580) + (i8 * (-161)) + (i9 * 161) + (i10 * 161) + (i5 * 1794637741) + (i2 * (-1844343719)) + (i3 * (-1188939004)) + (i12 * (-394526720));
        return i13 + ((i14 * i14) * 821297152) != 1 ? c(objArr) : e(objArr);
    }

    public static final /* synthetic */ void access$checkResultsAndContinue(ProcessIdPresenter processIdPresenter) {
        int i2 = 2 % 2;
        int i3 = f11582j + 11;
        f11581f = i3 % 128;
        int i4 = i3 % 2;
        processIdPresenter.b();
        int i5 = f11582j + 1;
        f11581f = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$publishResult(ProcessIdPresenter processIdPresenter, IdProcessResult idProcessResult) {
        int i2 = 2 % 2;
        int i3 = f11582j + 15;
        f11581f = i3 % 128;
        int i4 = i3 % 2;
        processIdPresenter.c(idProcessResult);
        if (i4 != 0) {
            int i5 = 62 / 0;
        }
        int i6 = f11581f + 101;
        f11582j = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$setIdProcessResult$p(ProcessIdPresenter processIdPresenter, IdProcessResult idProcessResult) {
        int i2 = 2 % 2;
        int i3 = f11582j;
        int i4 = i3 + 45;
        f11581f = i4 % 128;
        int i5 = i4 % 2;
        processIdPresenter.f11583a = idProcessResult;
        int i6 = i3 + 71;
        f11581f = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$setResponseIdSummary$p(ProcessIdPresenter processIdPresenter, bb bbVar) {
        int i2 = 2 % 2;
        int i3 = f11582j + 71;
        int i4 = i3 % 128;
        f11581f = i4;
        int i5 = i3 % 2;
        processIdPresenter.f11586d = bbVar;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 33;
        f11582j = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ProcessIdPresenter(IncodeWelcomeRepository incodeWelcomeRepository, ProcessIdContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f11584b = incodeWelcomeRepository;
        this.f11585c = new CompositeDisposable();
        this.f11587e = true;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f11582j + 47;
        f11581f = i3 % 128;
        if (i3 % 2 != 0) {
            this.f11585c.clear();
            int i4 = 45 / 0;
        } else {
            this.f11585c.clear();
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdContract.Presenter
    public final void setEnableIdSummaryScreen(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f11582j + 19;
        f11581f = i3 % 128;
        if (i3 % 2 != 0) {
            this.f11587e = z2;
            int i4 = 72 / 0;
        } else {
            this.f11587e = z2;
        }
    }

    static final class d extends Lambda implements Function1<Pair<IdProcessResult, bb>, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f11590a = 1;

        /* JADX INFO: renamed from: e */
        private static int f11591e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Pair<IdProcessResult, bb> pair) {
            int i2 = 2 % 2;
            int i3 = f11591e + 43;
            f11590a = i3 % 128;
            int i4 = i3 % 2;
            e(pair);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void e(Pair<IdProcessResult, bb> pair) {
            int i2 = 2 % 2;
            int i3 = f11591e + 19;
            f11590a = i3 % 128;
            if (i3 % 2 == 0) {
                ProcessIdPresenter.access$setIdProcessResult$p(ProcessIdPresenter.this, pair.first);
                ProcessIdPresenter.access$setResponseIdSummary$p(ProcessIdPresenter.this, pair.second);
                ProcessIdPresenter.access$checkResultsAndContinue(ProcessIdPresenter.this);
                int i4 = 8 / 0;
            } else {
                ProcessIdPresenter.access$setIdProcessResult$p(ProcessIdPresenter.this, pair.first);
                ProcessIdPresenter.access$setResponseIdSummary$p(ProcessIdPresenter.this, pair.second);
                ProcessIdPresenter.access$checkResultsAndContinue(ProcessIdPresenter.this);
            }
            int i5 = f11590a + 61;
            f11591e = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        d() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f11593a = 0;

        /* JADX INFO: renamed from: b */
        private static int f11594b = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11594b + 51;
            f11593a = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 78 / 0;
            }
            return unit;
        }

        private void c(Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Object obj = null;
            if (ThrowableExtensionsKt.isNoConnectivityException(th)) {
                ProcessIdPresenter.this.getMView().showNoNetworkMessage();
                int i3 = f11593a + 105;
                f11594b = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            Timber.Forest.e(th, "Couldn't process ID", new Object[0]);
            ProcessIdPresenter processIdPresenter = ProcessIdPresenter.this;
            IdProcessResult idProcessResult = new IdProcessResult(ResultCode.ERROR, null, 2, null);
            idProcessResult.error = th;
            ProcessIdPresenter.access$publishResult(processIdPresenter, idProcessResult);
            int i4 = f11593a + 125;
            f11594b = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        e() {
            super(1);
        }
    }

    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f11582j + 31;
        f11581f = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f11581f + 29;
        f11582j = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f11582j + 111;
        f11581f = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f11581f + 23;
        f11582j = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdContract.Presenter
    public final void processId(boolean z2) {
        int i2 = 2 % 2;
        if (!IncodeWelcome.Companion.getInstance().isTestMode()) {
            CompositeDisposable compositeDisposable = this.f11585c;
            m mVar = m.f5301d;
            Observable observableObserveOn = m.e(CollectionsKt.listOf((Object[]) new g[]{g.f10684d, g.f10682b})).andThen(this.f11584b.processId(z2)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            final d dVar = new d();
            Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdPresenter$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ProcessIdPresenter.a(dVar, obj);
                }
            };
            final e eVar = new e();
            compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdPresenter$$ExternalSyntheticLambda4
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ProcessIdPresenter.d(eVar, obj);
                }
            }));
            int i3 = f11581f + 93;
            f11582j = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = f11582j + 65;
        f11581f = i5 % 128;
        if (i5 % 2 == 0) {
            e();
            int i6 = f11581f + 95;
            f11582j = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 24 / 0;
                return;
            }
            return;
        }
        e();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f11588c = 0;

        /* JADX INFO: renamed from: d */
        private static int f11589d = 1;

        private void b(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11589d + 57;
            f11588c = i3 % 128;
            int i4 = i3 % 2;
            ((Timber.Forest) this.receiver).e(th);
            int i5 = f11589d + 63;
            f11588c = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11589d + 37;
            f11588c = i3 % 128;
            int i4 = i3 % 2;
            b(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 68 / 0;
            }
            int i6 = f11588c + 67;
            f11589d = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        c(Object obj) {
            super(1, obj, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }
    }

    public static final void c(ProcessIdPresenter processIdPresenter) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(processIdPresenter, "");
        processIdPresenter.c(new IdProcessResult(ResultCode.SUCCESS, IncodeWelcome.OCRData.Companion.createDummy()));
        int i3 = f11582j + 79;
        f11581f = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f11581f + 37;
        f11582j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f11581f + 41;
        f11582j = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final void c() {
        int i2 = 2 % 2;
        int i3 = f11582j + 125;
        f11581f = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void e() {
        int i2 = 2 % 2;
        Completable completableDoFinally = Completable.timer(2L, TimeUnit.SECONDS).doFinally(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Action
            public final void run() {
                ProcessIdPresenter.c(this.f$0);
            }
        });
        Action action = new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Action
            public final void run() {
                ProcessIdPresenter.c();
            }
        };
        final c cVar = new c(Timber.Forest);
        completableDoFinally.subscribe(action, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdPresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProcessIdPresenter.b(cVar, obj);
            }
        });
        int i3 = f11582j + 39;
        f11581f = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b() {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdPresenter.b():void");
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        ProcessIdPresenter processIdPresenter = (ProcessIdPresenter) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = f11581f + 11;
        f11582j = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (zBooleanValue || !processIdPresenter.f11587e) {
            processIdPresenter.publishResult();
            return null;
        }
        ReferredToExecutiveActivity.Companion companion = ReferredToExecutiveActivity.f11606c;
        Context context = processIdPresenter.getMView().getContext();
        Intrinsics.checkNotNull(context, "");
        companion.startForResult((Activity) context);
        int i4 = f11581f + 103;
        f11582j = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdContract.Presenter
    public final void publishResult() {
        int i2 = 2 % 2;
        int i3 = f11581f + 87;
        f11582j = i3 % 128;
        if (i3 % 2 != 0) {
            c(d());
            int i4 = f11582j + 113;
            f11581f = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        c(d());
        throw null;
    }

    private final void c(IdProcessResult idProcessResult) {
        int i2 = 2 % 2;
        int i3 = f11581f + 37;
        f11582j = i3 % 128;
        int i4 = i3 % 2;
        publishResult(IncodeWelcome.Companion.getInstance().getIdProcessBus(), idProcessResult);
        int i5 = f11581f + 45;
        f11582j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
    }

    private final IdProcessResult d() {
        int i2 = 2 % 2;
        int i3 = f11582j + 7;
        f11581f = i3 % 128;
        int i4 = i3 % 2;
        IdProcessResult idProcessResult = this.f11583a;
        if (idProcessResult == null) {
            idProcessResult = new IdProcessResult(ResultCode.ERROR, null, 2, null);
        }
        int i5 = f11581f + 87;
        f11582j = i5 % 128;
        int i6 = i5 % 2;
        return idProcessResult;
    }

    public static final void d(Function1 function1, Object obj) {
        int iB = TutorialPresenterModule.b();
        int iB2 = TutorialPresenterModule.b();
        d(TutorialPresenterModule.b(), TutorialPresenterModule.b(), iB, new Object[]{function1, obj}, iB2, -688739084, 688739084);
    }

    private final void e(boolean z2) {
        Object[] objArr = {this, Boolean.valueOf(z2)};
        d(TutorialPresenterModule.b(), TutorialPresenterModule.b(), TutorialPresenterModule.b(), objArr, TutorialPresenterModule.b(), 1814605332, -1814605331);
    }
}
