package com.incode.welcome_sdk.ui.id_info;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.results.IdInfoResult;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.id_info.IdInfoContract;
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
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class IdInfoPresenter extends BaseModulePresenter implements IdInfoContract.Presenter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f16349b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f16350e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompositeDisposable f16351a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdInfoContract.View f16352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IncodeWelcomeRepository f16353d;

    public final IdInfoContract.View getView() {
        int i2 = 2 % 2;
        int i3 = f16350e + 37;
        int i4 = i3 % 128;
        f16349b = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        IdInfoContract.View view = this.f16352c;
        int i5 = i4 + 105;
        f16350e = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public final IncodeWelcomeRepository getRepository() {
        IncodeWelcomeRepository incodeWelcomeRepository;
        int i2 = 2 % 2;
        int i3 = f16350e;
        int i4 = i3 + 17;
        f16349b = i4 % 128;
        if (i4 % 2 != 0) {
            incodeWelcomeRepository = this.f16353d;
            int i5 = 67 / 0;
        } else {
            incodeWelcomeRepository = this.f16353d;
        }
        int i6 = i3 + 81;
        f16349b = i6 % 128;
        int i7 = i6 % 2;
        return incodeWelcomeRepository;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public IdInfoPresenter(IdInfoContract.View view, IncodeWelcomeRepository incodeWelcomeRepository) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        this.f16352c = view;
        this.f16353d = incodeWelcomeRepository;
        this.f16351a = new CompositeDisposable();
    }

    static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16354c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16355e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f16354c + 81;
            f16355e = i3 % 128;
            int i4 = i3 % 2;
            e();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f16354c + 15;
            f16355e = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void e() {
            int i2 = 2 % 2;
            int i3 = f16354c + 107;
            f16355e = i3 % 128;
            if (i3 % 2 == 0) {
                Timber.Forest.e("An error occurred while submitting OCR data.", new Object[0]);
            } else {
                Timber.Forest.e("An error occurred while submitting OCR data.", new Object[0]);
            }
            IdInfoPresenter.this.getView().showError();
            int i4 = f16355e + 93;
            f16354c = i4 % 128;
            int i5 = i4 % 2;
        }

        b() {
            super(1);
        }
    }

    static final class d extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16357a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f16358b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16359c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16360d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16361e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f16361e + 65;
            f16357a = i3 % 128;
            int i4 = i3 % 2;
            a();
            Unit unit = Unit.INSTANCE;
            int i5 = f16357a + 59;
            f16361e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void a() {
            int i2 = 2 % 2;
            int i3 = f16357a + 81;
            f16361e = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.Forest.d("Successfully submitted OCR data.", new Object[1]);
            } else {
                Timber.Forest.d("Successfully submitted OCR data.", new Object[0]);
            }
        }

        static {
            int i2 = f16360d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f16359c = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        d() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(IdInfoPresenter idInfoPresenter, IdInfoModel idInfoModel) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(idInfoPresenter, "");
        Intrinsics.checkNotNullParameter(idInfoModel, "");
        idInfoPresenter.publishResult(new IdInfoResult(null, idInfoModel.getFullName(), idInfoModel.getDateOfBirth(), idInfoModel.getSex(), idInfoModel.getAddress(), idInfoModel.getDocumentNumber(), idInfoModel.getExpiryDate(), 1, null));
        int i3 = f16350e + 77;
        f16349b = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16350e + 59;
        f16349b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f16350e + 49;
        f16349b = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f16349b + 101;
        f16350e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f16349b + 85;
        f16350e = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.id_info.IdInfoContract.Presenter
    public final void addOcrData(final IdInfoModel idInfoModel, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(idInfoModel, "");
        CompositeDisposable compositeDisposable = this.f16351a;
        Observable<ResponseSuccess> observableDoOnComplete = this.f16353d.addOcrData(idInfoModel, z2).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnComplete(new Action() { // from class: com.incode.welcome_sdk.ui.id_info.IdInfoPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Action
            public final void run() {
                IdInfoPresenter.e(this.f$0, idInfoModel);
            }
        });
        final d dVar = d.f16358b;
        Consumer<? super ResponseSuccess> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.id_info.IdInfoPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                IdInfoPresenter.c(dVar, obj);
            }
        };
        final b bVar = new b();
        compositeDisposable.add(observableDoOnComplete.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.id_info.IdInfoPresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                IdInfoPresenter.e(bVar, obj);
            }
        }));
        int i3 = f16349b + 101;
        f16350e = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.id_info.IdInfoContract.Presenter
    public final void publishResult(IdInfoResult idInfoResult) {
        int i2 = 2 % 2;
        int i3 = f16349b + 107;
        f16350e = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(idInfoResult, "");
            publishResult(IncodeWelcome.Companion.getInstance().getIdInfoBus(), idInfoResult);
            throw null;
        }
        Intrinsics.checkNotNullParameter(idInfoResult, "");
        publishResult(IncodeWelcome.Companion.getInstance().getIdInfoBus(), idInfoResult);
        int i4 = f16349b + 123;
        f16350e = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f16350e + 109;
        f16349b = i3 % 128;
        int i4 = i3 % 2;
    }
}
