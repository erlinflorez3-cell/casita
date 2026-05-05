package com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.common.base.Ascii;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.recogkitandroid.ImageProcessingKit;
import com.incode.recogkitandroid.ImageProcessingKitInvalidInputException;
import com.incode.recogkitandroid.ImageProcessingKitProcessException;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.RecogKitUtils;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.ad;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState;
import com.incode.welcome_sdk.ui.camera.video_selfie.FacePositionConstraint;
import com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult;
import com.incode.welcome_sdk.ui.camera.video_selfie.Something;
import com.incode.welcome_sdk.ui.camera.video_selfie.UiState;
import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract;
import com.incode.welcome_sdk.ui.dynamic_forms.view.components.EmojiViewKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.msgpack.core.MessagePack;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class Passport extends IScanStep<Bitmap, ValidationState> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f12298k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f12299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f12300m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f12301n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f12302o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f12303p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRecordingContract.View f12304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IncodeWelcomeRepository f12305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IdCaptureKitAndroid f12306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Scheduler f12307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CompositeDisposable f12308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<String> f12310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ValidationState f12311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f12313j;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, byte r9, short r10) {
        /*
            int r7 = r10 + 69
            byte[] r6 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.$$a
            int r5 = r8 + 4
            int r4 = r9 * 4
            int r0 = r4 + 1
            byte[] r3 = new byte[r0]
            r2 = 0
            if (r6 != 0) goto L24
            r0 = r4
            r1 = r2
        L11:
            int r7 = r7 + r0
        L12:
            int r5 = r5 + 1
            byte r0 = (byte) r7
            r3[r1] = r0
            if (r1 != r4) goto L1f
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L1f:
            r0 = r6[r5]
            int r1 = r1 + 1
            goto L11
        L24:
            r1 = r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.$$c(int, byte, short):java.lang.String");
    }

    public static /* synthetic */ Object c(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~i4;
        int i10 = ~i2;
        int i11 = (~(i9 | i10)) | i8;
        int i12 = ~(i9 | i5 | i2);
        int i13 = (~(i2 | i5)) | (~(i8 | i10)) | i9;
        int i14 = i4 + i5 + i7 + (62936680 * i6) + ((-2032430997) * i3);
        int i15 = i14 * i14;
        int i16 = ((-476632153) * i4) + 797966336 + (1756943451 * i5) + (i11 * (-1030695846)) + ((-1030695846) * i12) + (1030695846 * i13) + ((-1507328000) * i7) + ((-264241152) * i6) + ((-222822400) * i3) + (2040594432 * i15);
        int i17 = ((i4 * 1175661207) - 43826732) + (i5 * 1175659659) + (i11 * (-774)) + (i12 * (-774)) + (i13 * 774) + (i7 * 1175660433) + (i6 * 1188219112) + (i3 * (-816965221)) + (i15 * 1798373376);
        int i18 = i16 + (i17 * i17 * 914292736);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? a(objArr) : c(objArr) : e(objArr) : b(objArr);
    }

    static void init$0() {
        $$a = new byte[]{5, MessagePack.Code.STR32, 48, 84};
        $$b = 120;
    }

    public static final /* synthetic */ Observable access$compareOcr(Passport passport, String str) {
        int i2 = 2 % 2;
        int i3 = f12300m + 75;
        f12301n = i3 % 128;
        int i4 = i3 % 2;
        Observable<ScanResult> observableB = passport.b(str);
        int i5 = f12300m + 19;
        f12301n = i5 % 128;
        if (i5 % 2 == 0) {
            return observableB;
        }
        throw null;
    }

    public static final /* synthetic */ IncodeWelcomeRepository access$getMRepository$p(Passport passport) {
        int i2 = 2 % 2;
        int i3 = f12301n;
        int i4 = i3 + 71;
        f12300m = i4 % 128;
        int i5 = i4 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = passport.f12305b;
        int i6 = i3 + 1;
        f12300m = i6 % 128;
        int i7 = i6 % 2;
        return incodeWelcomeRepository;
    }

    public static final /* synthetic */ Observable access$handleError(Passport passport, c cVar, ValidationFeedback validationFeedback) {
        int i2 = 2 % 2;
        int i3 = f12300m + 63;
        f12301n = i3 % 128;
        int i4 = i3 % 2;
        Observable<ScanResult> observableA = passport.a(cVar, validationFeedback);
        int i5 = f12300m + 65;
        f12301n = i5 % 128;
        if (i5 % 2 == 0) {
            return observableA;
        }
        throw null;
    }

    public static final /* synthetic */ ScanResult access$process(Passport passport, Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = f12301n + 51;
        f12300m = i3 % 128;
        int i4 = i3 % 2;
        ScanResult scanResultA = passport.a(bitmap);
        int i5 = f12301n + 7;
        f12300m = i5 % 128;
        int i6 = i5 % 2;
        return scanResultA;
    }

    public static final /* synthetic */ void access$setIdFeedback(Passport passport, UiState uiState, ValidationFeedback validationFeedback) {
        int i2 = 2 % 2;
        int i3 = f12301n + 103;
        f12300m = i3 % 128;
        int i4 = i3 % 2;
        passport.e(uiState, validationFeedback);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f12300m + 31;
        f12301n = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$setMIdCaptureKitAndroid$p(Passport passport, IdCaptureKitAndroid idCaptureKitAndroid) {
        int i2 = 2 % 2;
        int i3 = f12301n;
        int i4 = i3 + 9;
        f12300m = i4 % 128;
        int i5 = i4 % 2;
        passport.f12306c = idCaptureKitAndroid;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 67;
        f12300m = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 18 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public final /* synthetic */ void addProcessingErrorState(ValidationState validationState) {
        int i2 = 2 % 2;
        int i3 = f12301n + 43;
        f12300m = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        addProcessingErrorState2(validationState);
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = f12301n + 11;
        f12300m = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public final /* synthetic */ void showRealtimeFeedback(ValidationState validationState) {
        int i2 = 2 % 2;
        int i3 = f12301n + 69;
        f12300m = i3 % 128;
        int i4 = i3 % 2;
        showRealtimeFeedback2(validationState);
        int i5 = f12300m + 23;
        f12301n = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Passport(VideoRecordingContract.View view, IncodeWelcomeRepository incodeWelcomeRepository, Observable<IdCaptureKitAndroid> observable, Scheduler scheduler) {
        super(0, view);
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(observable, "");
        Intrinsics.checkNotNullParameter(scheduler, "");
        this.f12304a = view;
        this.f12305b = incodeWelcomeRepository;
        this.f12307d = scheduler;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f12308e = compositeDisposable;
        this.f12310g = new ArrayList<>();
        final Function1<IdCaptureKitAndroid, Unit> function1 = new Function1<IdCaptureKitAndroid, Unit>() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f12314a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f12315d = 0;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(IdCaptureKitAndroid idCaptureKitAndroid) {
                int i2 = 2 % 2;
                int i3 = f12315d + 53;
                f12314a = i3 % 128;
                int i4 = i3 % 2;
                b(idCaptureKitAndroid);
                Unit unit = Unit.INSTANCE;
                int i5 = f12314a + 23;
                f12315d = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private void b(IdCaptureKitAndroid idCaptureKitAndroid) {
                int i2 = 2 % 2;
                int i3 = f12315d + 59;
                f12314a = i3 % 128;
                int i4 = i3 % 2;
                Passport passport = Passport.this;
                Intrinsics.checkNotNull(idCaptureKitAndroid);
                Passport.access$setMIdCaptureKitAndroid$p(passport, idCaptureKitAndroid);
                int i5 = f12314a + 45;
                f12315d = i5 % 128;
                int i6 = i5 % 2;
            }

            {
                super(1);
            }
        };
        Consumer<? super IdCaptureKitAndroid> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Passport.b(function1, obj);
            }
        };
        final AnonymousClass3 anonymousClass3 = new Function1<Throwable, Unit>() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f12318b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f12319c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f12320d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f12321e = 0;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Throwable th) {
                int i2 = 2 % 2;
                int i3 = f12319c + 109;
                f12321e = i3 % 128;
                int i4 = i3 % 2;
                e(th);
                Unit unit = Unit.INSTANCE;
                int i5 = f12319c + 33;
                f12321e = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            private static void e(Throwable th) {
                int i2 = 2 % 2;
                int i3 = f12321e + 99;
                f12319c = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(th, "");
                Timber.Forest.e(th);
                int i5 = f12319c + 87;
                f12321e = i5 % 128;
                int i6 = i5 % 2;
            }

            static {
                int i2 = f12318b + 27;
                f12320d = i2 % 128;
                int i3 = i2 % 2;
            }
        };
        Disposable disposableSubscribe = observable.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Passport.d(anonymousClass3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "");
        com.incode.welcome_sdk.commons.extensions.n.b(compositeDisposable, disposableSubscribe);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f12298k = 0;
        f12303p = 1;
        f12301n = 0;
        f12300m = 1;
        c();
        new Companion(null);
        f12299l = Passport.class.getName();
        int i2 = f12298k + 5;
        f12303p = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 32 / 0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ c[] f12334a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f12339f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f12340g = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f12341i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f12342j = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f12337d = new c("UNKNOWN", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f12336c = new c("PASSPORT_TYPE_MATCH", 1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f12338e = new c("PASSPORT_PHOTO_MATCH", 2);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f12335b = new c("OCR_MATCH", 3);

        private c(String str, int i2) {
        }

        static {
            c[] cVarArrE = e();
            f12334a = cVarArrE;
            EnumEntriesKt.enumEntries(cVarArrE);
            int i2 = f12339f + 91;
            f12341i = i2 % 128;
            int i3 = i2 % 2;
        }

        private static final /* synthetic */ c[] e() {
            int i2 = 2 % 2;
            int i3 = f12340g + 31;
            f12342j = i3 % 128;
            if (i3 % 2 != 0) {
                return new c[]{f12337d, f12336c, f12338e, f12335b};
            }
            c[] cVarArr = new c[3];
            cVarArr[1] = f12337d;
            cVarArr[1] = f12336c;
            cVarArr[3] = f12338e;
            cVarArr[5] = f12335b;
            return cVarArr;
        }

        public static c valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f12340g + 37;
            f12342j = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            int i5 = f12342j + 19;
            f12340g = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        public static c[] values() {
            int i2 = 2 % 2;
            int i3 = f12342j + 91;
            f12340g = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            c[] cVarArr = (c[]) f12334a.clone();
            int i4 = f12340g + 1;
            f12342j = i4 % 128;
            if (i4 % 2 != 0) {
                return cVarArr;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12300m + 31;
        f12301n = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12300m + 71;
        f12301n = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12301n + 115;
        f12300m = i3 % 128;
        if (i3 % 2 != 0) {
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

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public final Point getDesiredPreviewSize(boolean z2) {
        return new Point(PhotoshopDirectory.TAG_COUNT_INFORMATION, z2 ? 1440 : 1920);
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public final void start() {
        int i2 = 2 % 2;
        int i3 = f12300m + 85;
        f12301n = i3 % 128;
        int i4 = i3 % 2;
        this.f12304a.startVideoSelfieProgressStep(VideoSelfieScanState.f12199e);
        this.f12304a.showPassportOverlay();
        e(UiState.DEFAULT, ValidationFeedback.f11696a);
        a(true);
        c(true);
        int i5 = f12301n + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12300m = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public final Observable<ScanResult> findAndProcess(Bitmap bitmap, FacePositionConstraint facePositionConstraint, Runnable runnable) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        int iE = EmojiViewKt.e.e();
        int iE2 = EmojiViewKt.e.e();
        Observable observableObserveOn = Observable.just((Something) c(iE, new Object[]{this, bitmap, facePositionConstraint}, EmojiViewKt.e.e(), -546282216, 546282217, EmojiViewKt.e.e(), iE2)).observeOn(AndroidSchedulers.mainThread());
        final i iVar = new i();
        Observable observableObserveOn2 = observableObserveOn.map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Passport.a(iVar, obj);
            }
        }).observeOn(this.f12307d);
        final f fVar = new f(runnable);
        Observable observableFilter = observableObserveOn2.filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return Passport.e(fVar, obj);
            }
        });
        final g gVar = new g();
        Observable map = observableFilter.map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$$ExternalSyntheticLambda10
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Passport.c(gVar, obj);
            }
        });
        final h hVar = h.f12356a;
        Observable observableFlatMap = map.flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Passport.f(hVar, obj);
            }
        });
        final j jVar = new j(runnable);
        Observable observableFilter2 = observableFlatMap.filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$$ExternalSyntheticLambda12
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return Passport.h(jVar, obj);
            }
        });
        final l lVar = new l();
        Observable<ScanResult> map2 = observableFilter2.map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Passport.i(lVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "");
        int i3 = f12300m + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12301n = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 17 / 0;
        }
        return map2;
    }

    static final class i extends Lambda implements Function1<Something<Bitmap, ValidationState>, Something<Bitmap, ValidationState>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12361a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12362b = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Something<Bitmap, ValidationState> invoke(Something<Bitmap, ValidationState> something) {
            int i2 = 2 % 2;
            int i3 = f12362b + 37;
            f12361a = i3 % 128;
            Something<Bitmap, ValidationState> something2 = something;
            if (i3 % 2 == 0) {
                return e(something2);
            }
            e(something2);
            throw null;
        }

        private Something<Bitmap, ValidationState> e(Something<Bitmap, ValidationState> something) {
            int i2 = 2 % 2;
            int i3 = f12362b + 55;
            f12361a = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(something, "");
                Passport.this.addProcessingErrorState2(something.f12148d);
                Passport.this.showRealtimeFeedback2(something.f12148d);
                return something;
            }
            Intrinsics.checkNotNullParameter(something, "");
            Passport.this.addProcessingErrorState2(something.f12148d);
            Passport.this.showRealtimeFeedback2(something.f12148d);
            throw null;
        }

        i() {
            super(1);
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f12301n + 17;
        f12300m = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Something something = (Something) function1.invoke(obj);
        int i4 = f12300m + 65;
        f12301n = i4 % 128;
        if (i4 % 2 == 0) {
            return something;
        }
        throw null;
    }

    static final class f extends Lambda implements Function1<Something<Bitmap, ValidationState>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12350a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12351b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Runnable f12352d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(Something<Bitmap, ValidationState> something) {
            int i2 = 2 % 2;
            int i3 = f12351b + 3;
            f12350a = i3 % 128;
            Something<Bitmap, ValidationState> something2 = something;
            if (i3 % 2 != 0) {
                return d(something2);
            }
            d(something2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Boolean d(Something<Bitmap, ValidationState> something) {
            int i2 = 2 % 2;
            int i3 = f12351b + 27;
            f12350a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(something, "");
            if (something.f12146b != null) {
                return Boolean.TRUE;
            }
            Runnable runnable = this.f12352d;
            if (runnable != null) {
                int i5 = f12351b + 109;
                f12350a = i5 % 128;
                if (i5 % 2 == 0) {
                    runnable.run();
                    throw null;
                }
                runnable.run();
            }
            Boolean bool = Boolean.FALSE;
            int i6 = f12350a + 63;
            f12351b = i6 % 128;
            int i7 = i6 % 2;
            return bool;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Runnable runnable) {
            super(1);
            this.f12352d = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12301n + 17;
        f12300m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i5 = f12301n + 17;
        f12300m = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return zBooleanValue;
    }

    static final class g extends Lambda implements Function1<Something<Bitmap, ValidationState>, ScanResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12353a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12354b = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ScanResult invoke(Something<Bitmap, ValidationState> something) {
            int i2 = 2 % 2;
            int i3 = f12354b + 85;
            f12353a = i3 % 128;
            int i4 = i3 % 2;
            ScanResult scanResultD = d(something);
            int i5 = f12353a + 15;
            f12354b = i5 % 128;
            int i6 = i5 % 2;
            return scanResultD;
        }

        private ScanResult d(Something<Bitmap, ValidationState> something) {
            int i2 = 2 % 2;
            int i3 = f12353a + 49;
            f12354b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(something, "");
            Passport passport = Passport.this;
            Bitmap bitmap = something.f12147c;
            Intrinsics.checkNotNullExpressionValue(bitmap, "");
            ScanResult scanResultAccess$process = Passport.access$process(passport, bitmap);
            int i5 = f12353a + 3;
            f12354b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 59 / 0;
            }
            return scanResultAccess$process;
        }

        g() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScanResult c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12300m + 31;
        f12301n = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ScanResult scanResult = (ScanResult) function1.invoke(obj);
        int i4 = f12301n + 87;
        f12300m = i4 % 128;
        if (i4 % 2 != 0) {
            return scanResult;
        }
        throw null;
    }

    static final class h extends Lambda implements Function1<ScanResult, ObservableSource<? extends ScanResult>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f12356a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12357b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12358c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12359d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12360e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ObservableSource<? extends ScanResult> invoke(ScanResult scanResult) {
            int i2 = 2 % 2;
            int i3 = f12360e + 5;
            f12357b = i3 % 128;
            ScanResult scanResult2 = scanResult;
            if (i3 % 2 != 0) {
                b(scanResult2);
                throw null;
            }
            ObservableSource<? extends ScanResult> observableSourceB = b(scanResult2);
            int i4 = f12357b + 109;
            f12360e = i4 % 128;
            int i5 = i4 % 2;
            return observableSourceB;
        }

        private static ObservableSource<? extends ScanResult> b(ScanResult scanResult) {
            Observable observableDelay;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(scanResult, "");
            if (scanResult != ScanResult.RETRY) {
                return Observable.just(scanResult);
            }
            int i3 = f12357b + 1;
            f12360e = i3 % 128;
            if (i3 % 2 == 0) {
                observableDelay = Observable.just(scanResult).delay(2L, TimeUnit.SECONDS);
                int i4 = 50 / 0;
            } else {
                observableDelay = Observable.just(scanResult).delay(2L, TimeUnit.SECONDS);
            }
            int i5 = f12357b + 67;
            f12360e = i5 % 128;
            int i6 = i5 % 2;
            return observableDelay;
        }

        static {
            int i2 = f12359d + 15;
            f12358c = i2 % 128;
            int i3 = i2 % 2;
        }

        h() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource f(Function1 function1, Object obj) {
        ObservableSource observableSource;
        int i2 = 2 % 2;
        int i3 = f12301n + 71;
        f12300m = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            observableSource = (ObservableSource) function1.invoke(obj);
            int i4 = 27 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            observableSource = (ObservableSource) function1.invoke(obj);
        }
        int i5 = f12301n + 31;
        f12300m = i5 % 128;
        if (i5 % 2 != 0) {
            return observableSource;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void q(String str, int i2, int i3, boolean z2, int i4, Object[] objArr) throws Throwable {
        char[] cArr;
        String str2 = str;
        int i5 = 2 % 2;
        char[] cArr2 = (char[]) (str2 != null ? str2.toCharArray() : str2);
        com.c.a.n nVar = new com.c.a.n();
        char[] cArr3 = new char[i3];
        nVar.f2781b = 0;
        while (nVar.f2781b < i3) {
            int i6 = $10 + 107;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            nVar.f2782c = cArr2[nVar.f2781b];
            cArr3[nVar.f2781b] = (char) (i4 + nVar.f2782c);
            int i8 = nVar.f2781b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(f12302o)};
                Object objC = com.c.a.e.e.c(2056116162);
                if (objC == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objC = com.c.a.e.e.e((char) Drawable.resolveOpacity(0, 0), 20 - View.resolveSize(0, 0), Color.blue(0) + TypedValues.Custom.TYPE_COLOR, 2048382395, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objC2 = com.c.a.e.e.c(1507983255);
                if (objC2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objC2 = com.c.a.e.e.e((char) TextUtils.getTrimmedLength(""), 19 - View.resolveSizeAndState(0, 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.EM, 1501298158, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            nVar.f2780a = i2;
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr3, 0, cArr4, 0, i3);
            System.arraycopy(cArr4, 0, cArr3, i3 - nVar.f2780a, nVar.f2780a);
            System.arraycopy(cArr4, nVar.f2780a, cArr3, 0, i3 - nVar.f2780a);
        }
        if (z2) {
            int i9 = $11 + 113;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr = new char[i3];
                nVar.f2781b = 1;
            } else {
                cArr = new char[i3];
                nVar.f2781b = 0;
            }
            while (nVar.f2781b < i3) {
                cArr[nVar.f2781b] = cArr3[(i3 - nVar.f2781b) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objC3 = com.c.a.e.e.c(1507983255);
                if (objC3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objC3 = com.c.a.e.e.e((char) ExpandableListView.getPackedPositionGroup(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18, 280 - TextUtils.getCapsMode("", 0, 0), 1501298158, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC3).invoke(null, objArr4);
            }
            cArr3 = cArr;
        }
        objArr[0] = new String(cArr3);
    }

    static final class j extends Lambda implements Function1<ScanResult, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12364a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12365e = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Runnable f12366c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(ScanResult scanResult) {
            int i2 = 2 % 2;
            int i3 = f12365e + 95;
            f12364a = i3 % 128;
            ScanResult scanResult2 = scanResult;
            if (i3 % 2 != 0) {
                c(scanResult2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Boolean boolC = c(scanResult2);
            int i4 = f12364a + 117;
            f12365e = i4 % 128;
            int i5 = i4 % 2;
            return boolC;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.lang.Boolean c(com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r5) {
            /*
                r4 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.j.f12365e
                int r1 = r0 + 27
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.j.f12364a = r0
                int r1 = r1 % r3
                r2 = 0
                java.lang.String r0 = ""
                if (r1 != 0) goto L54
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.RETRY
                if (r5 != r0) goto L1f
                java.lang.Runnable r0 = r4.f12366c
                if (r0 == 0) goto L47
                r0.run()
            L1f:
                com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.OK
                if (r5 == r0) goto L36
                int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.j.f12365e
                int r1 = r0 + 113
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.j.f12364a = r0
                int r1 = r1 % r3
                if (r1 != 0) goto L51
                com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.ERROR
                if (r5 == r0) goto L36
                com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.FINISHED_WITH_ERROR
                if (r5 != r0) goto L3c
            L36:
                r0 = 1
            L37:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L3c:
                int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.j.f12365e
                int r1 = r0 + 97
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.j.f12364a = r0
                int r1 = r1 % r3
                r0 = 0
                goto L37
            L47:
                int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.j.f12364a
                int r1 = r0 + 89
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.j.f12365e = r0
                int r1 = r1 % r3
                goto L1f
            L51:
                com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.ERROR
                throw r2
            L54:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult r0 = com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult.RETRY
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.j.c(com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult):java.lang.Boolean");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Runnable runnable) {
            super(1);
            this.f12366c = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12301n + 59;
        f12300m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i5 = f12301n + 89;
        f12300m = i5 % 128;
        if (i5 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    static final class l extends Lambda implements Function1<ScanResult, ScanResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12367a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12368b = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ScanResult invoke(ScanResult scanResult) {
            int i2 = 2 % 2;
            int i3 = f12367a + 81;
            f12368b = i3 % 128;
            ScanResult scanResult2 = scanResult;
            if (i3 % 2 == 0) {
                return a(scanResult2);
            }
            a(scanResult2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private ScanResult a(ScanResult scanResult) {
            int i2 = 2 % 2;
            int i3 = f12368b + 43;
            f12367a = i3 % 128;
            int i4 = i3 % 2;
            Passport passport = Passport.this;
            passport.logProcessingEvents(Passport.access$getMRepository$p(passport));
            int i5 = f12368b + 113;
            f12367a = i5 % 128;
            if (i5 % 2 != 0) {
                return scanResult;
            }
            throw null;
        }

        l() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScanResult i(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12300m + 105;
        f12301n = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ScanResult scanResult = (ScanResult) function1.invoke(obj);
        int i5 = f12301n + 55;
        f12300m = i5 % 128;
        int i6 = i5 % 2;
        return scanResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb A[Catch: Exception -> 0x024a, TryCatch #2 {Exception -> 0x024a, blocks: (B:4:0x0016, B:6:0x001c, B:8:0x0024, B:11:0x002b, B:18:0x0044, B:20:0x0053, B:22:0x0068, B:27:0x0078, B:28:0x007c, B:29:0x0081, B:33:0x0086, B:35:0x009e, B:37:0x00b9, B:41:0x00eb, B:43:0x0104, B:45:0x011d, B:49:0x013e, B:51:0x0157, B:53:0x0170, B:58:0x0182, B:59:0x018a, B:62:0x018d, B:66:0x01aa, B:71:0x01e1, B:78:0x01ec, B:80:0x01fb, B:82:0x020e, B:64:0x0197), top: B:91:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.b(java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: renamed from: showRealtimeFeedback, reason: avoid collision after fix types in other method */
    public final void showRealtimeFeedback2(ValidationState validationState) {
        int i2 = 2 % 2;
        int i3 = f12301n + 37;
        f12300m = i3 % 128;
        int i4 = i3 % 2;
        int i5 = validationState == null ? -1 : WhenMappings.f12325e[validationState.ordinal()];
        if (i5 == 1) {
            e(UiState.DEFAULT, ValidationFeedback.f11706k);
            int i6 = f12301n + 39;
            f12300m = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i5 == 2) {
            e(UiState.DEFAULT, ValidationFeedback.f11708m);
        } else if (i5 == 3) {
            e(UiState.DEFAULT, ValidationFeedback.f11715t);
        } else {
            if (i5 != 4) {
                return;
            }
            e(UiState.DEFAULT, ValidationFeedback.f11713r);
        }
    }

    private final ScanResult a(Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = f12301n + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12300m = i3 % 128;
        int i4 = i3 % 2;
        if (!IncodeWelcome.Companion.getInstance().isCaptureOnlyMode()) {
            e(UiState.PROCESSING, ValidationFeedback.f11714s);
            String base64FromBitmap = BitmapUtils.getBase64FromBitmap(bitmap);
            Intrinsics.checkNotNull(base64FromBitmap);
            ScanResult scanResultBlockingFirst = c(base64FromBitmap).blockingFirst();
            Intrinsics.checkNotNullExpressionValue(scanResultBlockingFirst, "");
            return scanResultBlockingFirst;
        }
        int i5 = f12301n + 83;
        f12300m = i5 % 128;
        if (i5 % 2 != 0) {
            return ScanResult.OK;
        }
        int i6 = 69 / 0;
        return ScanResult.OK;
    }

    private final Observable<ScanResult> c(String str) {
        int i2 = 2 % 2;
        Observable<ad> observableVideoSelfieCompareFrontId = this.f12305b.videoSelfieCompareFrontId(str);
        final d dVar = new d(str);
        Observable<R> observableFlatMap = observableVideoSelfieCompareFrontId.flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Passport.j(dVar, obj);
            }
        });
        final e eVar = new e();
        Observable<ScanResult> observableOnErrorReturn = observableFlatMap.onErrorReturn(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Passport.g(eVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "");
        int i3 = f12301n + 117;
        f12300m = i3 % 128;
        if (i3 % 2 != 0) {
            return observableOnErrorReturn;
        }
        throw null;
    }

    static final class d extends Lambda implements Function1<ad, ObservableSource<? extends ScanResult>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12343a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12344b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ String f12345d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ObservableSource<? extends ScanResult> invoke(ad adVar) {
            int i2 = 2 % 2;
            int i3 = f12344b + 55;
            f12343a = i3 % 128;
            int i4 = i3 % 2;
            ObservableSource<? extends ScanResult> observableSourceE = e(adVar);
            if (i4 != 0) {
                int i5 = 67 / 0;
            }
            int i6 = f12344b + 105;
            f12343a = i6 % 128;
            if (i6 % 2 == 0) {
                return observableSourceE;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        
            if (r7.d() >= 1.0d) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            r1 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.d.f12343a + 67;
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.d.f12344b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            return com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.access$handleError(r6.f12346e, com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.c.f12338e, com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.E);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
        
            r2 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.access$compareOcr(r6.f12346e, r6.f12345d);
            r1 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.d.f12343a + 87;
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.d.f12344b = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
        
            if ((r1 % 2) == 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r7.e() == false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
        
            return com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.access$handleError(r6.f12346e, com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.c.f12336c, com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.A);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        
            if (r7.e() == false) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private io.reactivex.ObservableSource<? extends com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult> e(com.incode.welcome_sdk.data.remote.beans.ad r7) {
            /*
                r6 = this;
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.d.f12343a
                int r1 = r0 + 25
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.d.f12344b = r0
                int r1 = r1 % r5
                java.lang.String r0 = ""
                if (r1 != 0) goto L2a
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                boolean r1 = r7.e()
                r0 = 10
                int r0 = r0 / 0
                if (r1 != 0) goto L34
            L1d:
                com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport r2 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.this
                com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$c r1 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.c.f12336c
                com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.A
                io.reactivex.Observable r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.access$handleError(r2, r1, r0)
                io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0
                return r0
            L2a:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                boolean r0 = r7.e()
                if (r0 != 0) goto L34
                goto L1d
            L34:
                double r3 = r7.d()
                r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 >= 0) goto L54
                int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.d.f12343a
                int r1 = r0 + 67
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.d.f12344b = r0
                int r1 = r1 % r5
                com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport r2 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.this
                com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$c r1 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.c.f12338e
                com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.E
                io.reactivex.Observable r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.access$handleError(r2, r1, r0)
                io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0
                return r0
            L54:
                com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport r1 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.this
                java.lang.String r0 = r6.f12345d
                io.reactivex.Observable r2 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.access$compareOcr(r1, r0)
                io.reactivex.ObservableSource r2 = (io.reactivex.ObservableSource) r2
                int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.d.f12343a
                int r1 = r0 + 87
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.d.f12344b = r0
                int r1 = r1 % r5
                if (r1 == 0) goto L6a
                return r2
            L6a:
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport.d.e(com.incode.welcome_sdk.data.remote.beans.ad):io.reactivex.ObservableSource");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.f12345d = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource j(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12300m + 91;
        f12301n = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (ObservableSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        int i4 = 94 / 0;
        return (ObservableSource) function1.invoke(obj);
    }

    static final class e extends Lambda implements Function1<Throwable, ScanResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12347a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12348d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ScanResult invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12348d + 103;
            f12347a = i3 % 128;
            Throwable th2 = th;
            if (i3 % 2 != 0) {
                return b(th2);
            }
            b(th2);
            throw null;
        }

        private ScanResult b(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12347a + 83;
            f12348d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(th, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(th, "");
            ScanResult scanResult = (ScanResult) Passport.access$handleError(Passport.this, c.f12337d, ValidationFeedback.C).blockingFirst();
            int i4 = f12348d + 11;
            f12347a = i4 % 128;
            int i5 = i4 % 2;
            return scanResult;
        }

        e() {
            super(1);
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f12300m + 23;
        f12301n = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (ScanResult) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final Observable<ScanResult> b(String str) {
        int i2 = 2 % 2;
        Observable<ResponseSuccess> observableVideoSelfieCompareFrontIdOcr = this.f12305b.videoSelfieCompareFrontIdOcr(str);
        final a aVar = new a();
        Observable<R> observableFlatMap = observableVideoSelfieCompareFrontIdOcr.flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Passport.l(aVar, obj);
            }
        });
        final b bVar = new b();
        Observable<ScanResult> observableOnErrorReturn = observableFlatMap.onErrorReturn(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Passport.k(bVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "");
        int i3 = f12300m + 87;
        f12301n = i3 % 128;
        int i4 = i3 % 2;
        return observableOnErrorReturn;
    }

    static final class a extends Lambda implements Function1<ResponseSuccess, ObservableSource<? extends ScanResult>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12326a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f12327b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12328c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f12329e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ObservableSource<? extends ScanResult> invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f12326a + 87;
            f12328c = i3 % 128;
            int i4 = i3 % 2;
            ObservableSource<? extends ScanResult> observableSourceC = c(responseSuccess);
            if (i4 != 0) {
                int i5 = 78 / 0;
            }
            return observableSourceC;
        }

        private ObservableSource<? extends ScanResult> c(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseSuccess, "");
            if (responseSuccess.isSuccess()) {
                int i3 = f12326a + 25;
                f12328c = i3 % 128;
                int i4 = i3 % 2;
                return Observable.just(ScanResult.OK);
            }
            Observable observableAccess$handleError = Passport.access$handleError(Passport.this, c.f12335b, ValidationFeedback.H);
            int i5 = f12328c + 59;
            f12326a = i5 % 128;
            if (i5 % 2 != 0) {
                return observableAccess$handleError;
            }
            throw null;
        }

        public static int c() {
            int i2 = f12329e;
            int i3 = i2 % 8073486;
            f12329e = i2 + 1;
            if (i3 != 0) {
                return f12327b;
            }
            int iMyUid = Process.myUid();
            f12327b = iMyUid;
            return iMyUid;
        }

        a() {
            super(1);
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f12300m + 113;
        f12301n = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (ObservableSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static final class b extends Lambda implements Function1<Throwable, ScanResult> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12331b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12332c = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ScanResult invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12332c + 55;
            f12331b = i3 % 128;
            int i4 = i3 % 2;
            ScanResult scanResultE = e(th);
            if (i4 == 0) {
                int i5 = 71 / 0;
            }
            return scanResultE;
        }

        private ScanResult e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12332c + 27;
            f12331b = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(th, "");
            ScanResult scanResult = (ScanResult) Passport.access$handleError(Passport.this, c.f12337d, ValidationFeedback.C).blockingFirst();
            int i4 = f12331b + 15;
            f12332c = i4 % 128;
            if (i4 % 2 == 0) {
                return scanResult;
            }
            throw null;
        }

        b() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScanResult k(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12301n + 109;
        f12300m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ScanResult scanResult = (ScanResult) function1.invoke(obj);
        int i5 = f12300m + 25;
        f12301n = i5 % 128;
        if (i5 % 2 == 0) {
            return scanResult;
        }
        throw null;
    }

    private final Observable<ScanResult> a(c cVar, ValidationFeedback validationFeedback) {
        int i2 = 2 % 2;
        int i3 = f12301n + 29;
        f12300m = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.f12309f + 1;
        this.f12309f = i5;
        if (i5 < 3) {
            e(UiState.RETRY, validationFeedback);
            Observable<Long> observableTimer = Observable.timer(1000L, TimeUnit.MILLISECONDS);
            final n nVar = new n();
            Observable map = observableTimer.map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport$$ExternalSyntheticLambda7
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return Passport.n(nVar, obj);
                }
            });
            Intrinsics.checkNotNull(map);
            return map;
        }
        this.f12313j = cVar;
        Observable<ScanResult> observableJust = Observable.just(ScanResult.FINISHED_WITH_ERROR);
        Intrinsics.checkNotNull(observableJust);
        int i6 = f12300m + 83;
        f12301n = i6 % 128;
        if (i6 % 2 == 0) {
            return observableJust;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class n extends Lambda implements Function1<Long, ScanResult> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12370b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12371d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ScanResult invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f12371d + 103;
            f12370b = i3 % 128;
            int i4 = i3 % 2;
            ScanResult scanResultA = a();
            int i5 = f12370b + 95;
            f12371d = i5 % 128;
            int i6 = i5 % 2;
            return scanResultA;
        }

        private ScanResult a() {
            int i2 = 2 % 2;
            int i3 = f12371d + 73;
            f12370b = i3 % 128;
            if (i3 % 2 != 0) {
                Passport.access$setIdFeedback(Passport.this, UiState.DEFAULT, ValidationFeedback.f11696a);
                ScanResult scanResult = ScanResult.RETRY;
                int i4 = f12371d + 55;
                f12370b = i4 % 128;
                int i5 = i4 % 2;
                return scanResult;
            }
            Passport.access$setIdFeedback(Passport.this, UiState.DEFAULT, ValidationFeedback.f11696a);
            ScanResult scanResult2 = ScanResult.RETRY;
            throw null;
        }

        n() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScanResult n(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12301n + 15;
        f12300m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ScanResult scanResult = (ScanResult) function1.invoke(obj);
        int i5 = f12300m + 49;
        f12301n = i5 % 128;
        int i6 = i5 % 2;
        return scanResult;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public final boolean processesFrames() {
        int i2 = 2 % 2;
        int i3 = f12300m + 89;
        int i4 = i3 % 128;
        f12301n = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 103;
        f12300m = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 53 / 0;
        }
        return true;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public final boolean isComplete() {
        int i2 = 2 % 2;
        int i3 = f12301n;
        int i4 = i3 + 11;
        f12300m = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 43;
        f12300m = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX INFO: renamed from: addProcessingErrorState, reason: avoid collision after fix types in other method */
    public final void addProcessingErrorState2(ValidationState validationState) {
        int i2 = 2 % 2;
        if (validationState == null || validationState == this.f12311h) {
            return;
        }
        int i3 = f12300m + 59;
        f12301n = i3 % 128;
        int i4 = i3 % 2;
        String strValidationStateToEvent = EventUtils.validationStateToEvent(validationState);
        if (strValidationStateToEvent != null) {
            int i5 = f12301n + 3;
            f12300m = i5 % 128;
            int i6 = i5 % 2;
            this.f12311h = validationState;
            this.f12310g.add(strValidationStateToEvent);
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public final void logServerEventSuccess(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f12300m + 55;
        f12301n = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        EventUtils.sendVideoSelfieProcessingEvent(incodeWelcomeRepository, Event.VIDEO_SELFIE_PASSPORT_DETECTED, Modules.VIDEO_ONBOARDING, this.f12310g);
        int i5 = f12301n + 95;
        f12300m = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public final void logProcessingEvents(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f12301n + 29;
        f12300m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        EventUtils.sendVideoSelfieProcessingEvent(incodeWelcomeRepository, Event.VIDEO_SELFIE_PASSPORT_PROCESSING_STATES, Modules.VIDEO_ONBOARDING, this.f12310g);
        int i5 = f12301n + 13;
        f12300m = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public final void showWinState() {
        int i2 = 2 % 2;
        int i3 = f12301n + 1;
        f12300m = i3 % 128;
        int i4 = i3 % 2;
        e(UiState.SUCCESS, ValidationFeedback.f11703h);
        int i5 = f12301n + 39;
        f12300m = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public final void showDoneStateWithError() {
        int i2;
        int i3 = 2 % 2;
        c cVar = this.f12313j;
        if (cVar != null) {
            if (cVar != null) {
                i2 = WhenMappings.f12322a[cVar.ordinal()];
            } else {
                int i4 = f12300m + 93;
                f12301n = i4 % 128;
                i2 = -1;
                if (i4 % 2 != 0) {
                    int i5 = 32 / 0;
                }
            }
            if (i2 == 1) {
                e(UiState.ERROR, ValidationFeedback.D);
                return;
            }
            if (i2 == 2) {
                e(UiState.ERROR, ValidationFeedback.f11721z);
                return;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    return;
                }
                e(UiState.ERROR, ValidationFeedback.F);
                return;
            } else {
                e(UiState.ERROR, ValidationFeedback.I);
                int i6 = f12301n + 39;
                f12300m = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 53 / 0;
                    return;
                }
                return;
            }
        }
        e(UiState.ERROR, ValidationFeedback.D);
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public final void cleanup(Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = f12301n + 85;
        f12300m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(runnable, "");
        this.f12304a.finishVideoSelfieProgressStep(VideoSelfieScanState.f12199e);
        BitmapUtils.deleteMemoryLeakProtectedBitmap(f12299l);
        this.f12308e.clear();
        a(false);
        c(false);
        this.f12304a.hidePassportOverlay();
        runnable.run();
        int i5 = f12301n + 23;
        f12300m = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void a(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f12301n + 93;
        f12300m = i3 % 128;
        if (i3 % 2 != 0) {
            this.f12304a.setIdFrameVisible(IdScan.IdType.PASSPORT, z2, getCameraFacing());
            int i4 = f12300m + 121;
            f12301n = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.f12304a.setIdFrameVisible(IdScan.IdType.PASSPORT, z2, getCameraFacing());
        throw null;
    }

    private final void c(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f12300m + 17;
        f12301n = i3 % 128;
        if (i3 % 2 == 0) {
            this.f12304a.setFeedbackIdVisible(z2, getCameraFacing());
            int i4 = f12301n + 45;
            f12300m = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f12304a.setFeedbackIdVisible(z2, getCameraFacing());
        throw null;
    }

    private final void e(UiState uiState, ValidationFeedback validationFeedback) {
        int i2 = 2 % 2;
        int i3 = f12300m + 93;
        f12301n = i3 % 128;
        if (i3 % 2 == 0) {
            this.f12304a.setIdFrameColor(IdScan.IdType.PASSPORT, uiState, getCameraFacing());
            this.f12304a.showFeedbackId(validationFeedback, getCameraFacing());
        } else {
            this.f12304a.setIdFrameColor(IdScan.IdType.PASSPORT, uiState, getCameraFacing());
            this.f12304a.showFeedbackId(validationFeedback, getCameraFacing());
            throw null;
        }
    }

    private static boolean d(Bitmap bitmap) {
        float centerBrightnessLevel;
        int i2 = 2 % 2;
        if (RecogKitUtils.isFullRecogKitAvailable()) {
            try {
                centerBrightnessLevel = ImageProcessingKit.getCenterBrightnessLevel(bitmap);
            } catch (ImageProcessingKitInvalidInputException e2) {
                Timber.Forest.e(e2);
                centerBrightnessLevel = -1.0f;
            } catch (ImageProcessingKitProcessException e3) {
                Timber.Forest.e(e3);
                centerBrightnessLevel = -1.0f;
            }
            if (centerBrightnessLevel >= 50.0f) {
                return false;
            }
            int i3 = f12300m + 89;
            f12301n = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = f12300m + 85;
        f12301n = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    static void c() {
        f12302o = 1994499325;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource l(Function1 function1, Object obj) {
        Object[] objArr = {function1, obj};
        int iE = EmojiViewKt.e.e();
        int iE2 = EmojiViewKt.e.e();
        return (ObservableSource) c(iE, objArr, EmojiViewKt.e.e(), 1710043913, -1710043913, EmojiViewKt.e.e(), iE2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScanResult g(Function1 function1, Object obj) {
        Object[] objArr = {function1, obj};
        int iE = EmojiViewKt.e.e();
        int iE2 = EmojiViewKt.e.e();
        return (ScanResult) c(iE, objArr, EmojiViewKt.e.e(), 1884228772, -1884228769, EmojiViewKt.e.e(), iE2);
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12322a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12323c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12324d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f12325e;

        static {
            int[] iArr = new int[ValidationState.values().length];
            try {
                iArr[ValidationState.f11854n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationState.f11858r.ordinal()] = 2;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidationState.f11860t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValidationState.f11855o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f12325e = iArr;
            int[] iArr2 = new int[c.values().length];
            try {
                iArr2[c.f12337d.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[c.f12336c.ordinal()] = 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[c.f12338e.ordinal()] = 3;
                int i4 = f12323c + 55;
                f12324d = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[c.f12335b.ordinal()] = 4;
                int i6 = f12324d + 99;
                f12323c = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            f12322a = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Something a(Function1 function1, Object obj) {
        Object[] objArr = {function1, obj};
        int iE = EmojiViewKt.e.e();
        int iE2 = EmojiViewKt.e.e();
        return (Something) c(iE, objArr, EmojiViewKt.e.e(), 491261838, -491261836, EmojiViewKt.e.e(), iE2);
    }

    private final Something<Bitmap, ValidationState> a(Bitmap bitmap, FacePositionConstraint facePositionConstraint) {
        int iE = EmojiViewKt.e.e();
        int iE2 = EmojiViewKt.e.e();
        return (Something) c(iE, new Object[]{this, bitmap, facePositionConstraint}, EmojiViewKt.e.e(), -546282216, 546282217, EmojiViewKt.e.e(), iE2);
    }
}
