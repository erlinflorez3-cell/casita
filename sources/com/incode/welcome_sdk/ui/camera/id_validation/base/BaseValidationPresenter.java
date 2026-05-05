package com.incode.welcome_sdk.ui.camera.id_validation.base;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.util.Pair;
import com.c.a.k;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.c;
import com.incode.welcome_sdk.commons.exceptions.IncodeGenericError;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.ad;
import com.incode.welcome_sdk.commons.utils.f;
import com.incode.welcome_sdk.commons.utils.l;
import com.incode.welcome_sdk.commons.utils.t;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IdScanFrameLogs;
import com.incode.welcome_sdk.data.ImageType;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.a.e;
import com.incode.welcome_sdk.data.local.o;
import com.incode.welcome_sdk.data.remote.b.a;
import com.incode.welcome_sdk.data.remote.b.b;
import com.incode.welcome_sdk.data.remote.b.g;
import com.incode.welcome_sdk.data.remote.b.h;
import com.incode.welcome_sdk.data.remote.b.i;
import com.incode.welcome_sdk.data.remote.b.j;
import com.incode.welcome_sdk.data.remote.beans.ResponseGetImages;
import com.incode.welcome_sdk.data.remote.beans.ResponseMedicalDoc;
import com.incode.welcome_sdk.data.remote.beans.ResponseOCRData;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.bc;
import com.incode.welcome_sdk.data.remote.beans.bt;
import com.incode.welcome_sdk.data.remote.beans.z;
import com.incode.welcome_sdk.data.remote.d;
import com.incode.welcome_sdk.data.remote.j;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.DeviceStats;
import com.incode.welcome_sdk.results.DocumentValidationResult;
import com.incode.welcome_sdk.results.IdScanResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.approve.ApproveActivity;
import com.incode.welcome_sdk.ui.camera.CameraPresenter;
import com.incode.welcome_sdk.ui.camera.CameraPreview;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureChecksGate;
import com.reactnativecommunity.clipboard.ClipboardModule;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.HttpException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class BaseValidationPresenter extends CameraPresenter implements BaseValidationContract.Presenter {
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int ao = 0;
    private static long ap = 0;
    private static int ar = 0;
    private Uri A;
    private DocumentType B;
    private boolean C;
    private ValidationState D;
    private final PublishSubject<d> E;
    private final PublishSubject<Bitmap> F;
    private DocumentValidationResult G;
    private final PublishSubject<Bitmap> H;
    private Pair<Bitmap, Float> I;
    private boolean J;
    private int K;
    private boolean L;
    private IdScan.AutocaptureUXMode M;
    private boolean N;
    private int O;
    private int P;
    private ArrayList<String> Q;
    private long R;
    private int S;
    private IdScan.ScanStep T;
    private IdCategory U;
    private File V;
    private IdScan.IdType W;
    private ValidationState X;
    private int Y;
    private int Z;
    private int aa;
    private boolean ab;
    private int ac;
    private LinkedList<IdScanFrameLogs.e> ad;
    private long ae;
    private final e af;
    private boolean ag;
    private final IncodeWelcome ah;
    private Boolean ai;
    private final BehaviorSubject<Pair<Bitmap, File>> aj;
    private final BehaviorSubject<Boolean> ak;
    private final BehaviorSubject<Boolean> al;
    private float am;
    private ValidationPhase an;
    private int aq;

    /* JADX INFO: renamed from: h */
    public volatile IdValidationResult f11760h;

    /* JADX INFO: renamed from: j */
    private final String f11761j;

    /* JADX INFO: renamed from: k */
    private IdCaptureKitAndroid f11762k;

    /* JADX INFO: renamed from: l */
    private final boolean f11763l;

    /* JADX INFO: renamed from: m */
    private final IncodeWelcomeRepository f11764m;

    /* JADX INFO: renamed from: n */
    private final boolean f11765n;

    /* JADX INFO: renamed from: o */
    private final BaseValidationContract.View f11766o;

    /* JADX INFO: renamed from: p */
    private final CompositeDisposable f11767p;

    /* JADX INFO: renamed from: q */
    private final IncodeWelcome.InternalConfig f11768q;

    /* JADX INFO: renamed from: r */
    private final c f11769r;

    /* JADX INFO: renamed from: s */
    private final CompositeDisposable f11770s;

    /* JADX INFO: renamed from: t */
    private boolean f11771t;

    /* JADX INFO: renamed from: u */
    private Disposable f11772u;

    /* JADX INFO: renamed from: v */
    private boolean f11773v;

    /* JADX INFO: renamed from: w */
    private Disposable f11774w;

    /* JADX INFO: renamed from: x */
    private Disposable f11775x;

    /* JADX INFO: renamed from: y */
    private ValidationPhase f11776y;

    /* JADX INFO: renamed from: z */
    private IdScanResult f11777z;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(byte r7, short r8, short r9) {
        /*
            int r0 = r7 * 2
            int r7 = 119 - r0
            int r6 = r8 * 3
            int r2 = r6 + 1
            byte[] r5 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.$$c
            int r0 = r9 * 3
            int r1 = 3 - r0
            byte[] r4 = new byte[r2]
            r3 = 0
            if (r5 != 0) goto L29
            r2 = r1
            r0 = r3
        L15:
            int r7 = r7 + r1
            r1 = r2
        L17:
            int r2 = r1 + 1
            byte r1 = (byte) r7
            r4[r0] = r1
            if (r0 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r1 = r5[r2]
            int r0 = r0 + 1
            goto L15
        L29:
            r0 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.$$e(byte, short, short):java.lang.String");
    }

    public static /* synthetic */ Pair $r8$lambda$5e8iwffUT8XaMOUKZRl8gH4U4nQ(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        BaseValidationContract.View view;
        int i8;
        int i9 = i2 | i6 | (~i5);
        int i10 = (~((~i2) | i6)) | (~(i2 | i5));
        int i11 = (~(i5 | (~i6))) | i2;
        int i12 = i2 + i6 + i7 + ((-1069702238) * i4) + (1645725337 * i3);
        int i13 = i12 * i12;
        int i14 = ((i2 * 2084108943) - 1824784384) + (2084108943 * i6) + (i9 * (-929364622)) + (929364622 * i10) + ((-929364622) * i11) + (1154744320 * i7) + ((-1977090048) * i4) + (448004096 * i3) + (1807155200 * i13);
        int i15 = (i2 * (-999696423)) + 1136243370 + (i6 * (-999696423)) + (i9 * 830) + (i10 * (-830)) + (i11 * 830) + (i7 * (-999695593)) + (i4 * 636963214) + (i3 * (-1077364033)) + (i13 * 980484096);
        switch (i14 + (i15 * i15 * 1287192576)) {
            case 1:
                return b(objArr);
            case 2:
                return c(objArr);
            case 3:
                return a(objArr);
            case 4:
                return d(objArr);
            case 5:
                return g(objArr);
            case 6:
                return h(objArr);
            case 7:
                return i(objArr);
            case 8:
                return f(objArr);
            case 9:
                return j(objArr);
            case 10:
                return k(objArr);
            case 11:
                return l(objArr);
            case 12:
                return m(objArr);
            case 13:
                return o(objArr);
            case 14:
                return n(objArr);
            case 15:
                BaseValidationPresenter baseValidationPresenter = (BaseValidationPresenter) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                long jLongValue2 = ((Number) objArr[2]).longValue();
                int i16 = 2 % 2;
                int i17 = ar + 59;
                ao = i17 % 128;
                if (i17 % 2 != 0) {
                    int iRound = Math.round((jLongValue + 100.0f) % jLongValue2);
                    view = baseValidationPresenter.f11766o;
                    i8 = iRound << 3;
                } else {
                    int iRound2 = Math.round((jLongValue * 100.0f) / jLongValue2);
                    view = baseValidationPresenter.f11766o;
                    i8 = iRound2 / 2;
                }
                view.setUploadProgress(i8);
                return null;
            case 16:
                return q(objArr);
            case 17:
                BaseValidationPresenter baseValidationPresenter2 = (BaseValidationPresenter) objArr[0];
                Throwable th = (Throwable) objArr[1];
                int i18 = 2 % 2;
                int i19 = ar + 7;
                ao = i19 % 128;
                if (i19 % 2 != 0) {
                    Timber.e(th, "Couldn't capture", new Object[1]);
                    baseValidationPresenter2.c(th);
                    int iA = ApproveActivity.e.a();
                    int iA2 = ApproveActivity.e.a();
                    d(-1412676634, ApproveActivity.e.a(), ApproveActivity.e.a(), iA, 1412676645, new Object[]{baseValidationPresenter2}, iA2);
                    return null;
                }
                Timber.e(th, "Couldn't capture", new Object[0]);
                baseValidationPresenter2.c(th);
                int iA3 = ApproveActivity.e.a();
                int iA4 = ApproveActivity.e.a();
                d(-1412676634, ApproveActivity.e.a(), ApproveActivity.e.a(), iA3, 1412676645, new Object[]{baseValidationPresenter2}, iA4);
                return null;
            default:
                return e(objArr);
        }
    }

    static void init$0() {
        $$c = new byte[]{66, -118, -118, 77};
        $$d = 68;
    }

    private static void at(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $10 + 13;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        k kVar = new k();
        char[] cArrE = k.e(ap ^ (-3501477462694648052L), (char[]) charArray, i2);
        kVar.f2772b = 4;
        while (kVar.f2772b < cArrE.length) {
            int i6 = $11 + 29;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f2773d = kVar.f2772b - 4;
            int i8 = kVar.f2772b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrE[kVar.f2772b] ^ cArrE[kVar.f2772b % 4]), Long.valueOf(kVar.f2773d), Long.valueOf(ap)};
                Object objC = com.c.a.e.e.c(1215460496);
                if (objC == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objC = com.c.a.e.e.e((char) ((-16777124) - Color.rgb(0, 0, 0)), 20 - (ViewConfiguration.getLongPressTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1107, 1223194345, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrE[i8] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objC2 = com.c.a.e.e.c(-727400358);
                if (objC2 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (b4 - 1);
                    objC2 = com.c.a.e.e.e((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19, 1283 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -734084573, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrE, 4, cArrE.length - 4);
    }

    @Inject
    public BaseValidationPresenter(IncodeWelcomeRepository incodeWelcomeRepository, PublishSubject<d> publishSubject, Observable<IdCaptureKitAndroid> observable, BaseValidationContract.View view) {
        super(view, incodeWelcomeRepository);
        this.f11761j = BaseValidationPresenter.class.getName();
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f11767p = compositeDisposable;
        this.f11770s = new CompositeDisposable();
        this.f11769r = c.f();
        this.A = null;
        this.C = false;
        this.I = new Pair<>(null, Float.valueOf(0.0f));
        this.F = PublishSubject.create();
        this.H = PublishSubject.create();
        this.N = true;
        this.K = 0;
        this.S = 0;
        this.O = 0;
        this.P = 0;
        this.R = 750L;
        this.ag = false;
        this.ad = new LinkedList<>();
        this.ai = Boolean.FALSE;
        this.aj = BehaviorSubject.create();
        this.al = BehaviorSubject.create();
        BehaviorSubject<Boolean> behaviorSubjectCreate = BehaviorSubject.create();
        this.ak = behaviorSubjectCreate;
        this.aq = 0;
        this.f11764m = incodeWelcomeRepository;
        IncodeWelcome incodeWelcome = IncodeWelcome.getInstance();
        this.ah = incodeWelcome;
        this.af = incodeWelcome.getDelayedOnboardingRepositoryComponent().a();
        this.f11768q = incodeWelcome.getInternalConfig();
        this.E = publishSubject;
        this.f11766o = view;
        compositeDisposable.add(observable.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda48
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.a((IdCaptureKitAndroid) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda49
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.g((Throwable) obj);
            }
        }));
        enableProcessing(false);
        boolean zIsCaptureOnlyMode = incodeWelcome.isCaptureOnlyMode();
        this.f11763l = zIsCaptureOnlyMode;
        this.f11765n = incodeWelcome.isDelayedMode();
        if (zIsCaptureOnlyMode) {
            this.R = 0L;
        }
        compositeDisposable.add(behaviorSubjectCreate.flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda50
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e((Boolean) obj);
            }
        }).subscribeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda51
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.b((Pair) obj);
            }
        }, new BaseValidationPresenter$$ExternalSyntheticLambda52()));
    }

    public /* synthetic */ void a(IdCaptureKitAndroid idCaptureKitAndroid) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 95;
        int i4 = i3 % 128;
        ar = i4;
        int i5 = i3 % 2;
        this.f11762k = idCaptureKitAndroid;
        int i6 = i4 + 107;
        ao = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* synthetic */ void g(Throwable th) throws Exception {
        int i2 = 2 % 2;
        IdScanResult idScanResult = new IdScanResult();
        idScanResult.resultCode = ResultCode.ERROR;
        idScanResult.error = th;
        publishResult(idScanResult);
        int i3 = ar + 117;
        ao = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* synthetic */ ObservableSource e(Boolean bool) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 123;
        ar = i3 % 128;
        int i4 = i3 % 2;
        if (bool.booleanValue()) {
            int i5 = ar + 69;
            ao = i5 % 128;
            int i6 = i5 % 2;
            return Observable.zip(this.aj, this.al, new BiFunction() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda20
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return BaseValidationPresenter.$r8$lambda$5e8iwffUT8XaMOUKZRl8gH4U4nQ((Pair) obj, (Boolean) obj2);
                }
            });
        }
        return Observable.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void b(Pair pair) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 15;
        ar = i3 % 128;
        int i4 = i3 % 2;
        a((Bitmap) ((Pair) pair.first).first, (File) ((Pair) pair.first).second);
        int i5 = ar + 115;
        ao = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public Point getDesiredPreviewSize(boolean z2) {
        int i2 = 2 % 2;
        int i3 = ar + 1;
        ao = i3 % 128;
        int i4 = i3 % 2;
        Point desiredPreviewSize = super.getDesiredPreviewSize(z2);
        int i5 = ar + 65;
        ao = i5 % 128;
        if (i5 % 2 == 0) {
            return desiredPreviewSize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0018, code lost:
    
        if (r3.f11766o.isVoiceOverActive() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x001a, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar + 77;
        com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0023, code lost:
    
        if ((r1 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0029, code lost:
    
        return b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        if (r3.f11766o.isVoiceOverActive() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0033, code lost:
    
        b();
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003f, code lost:
    
        return e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int d() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L2a
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract$View r0 = r3.f11766o
            boolean r1 = r0.isVoiceOverActive()
            r0 = 15
            int r0 = r0 / 0
            if (r1 == 0) goto L3b
        L1a:
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L33
            int r0 = r3.b()
            return r0
        L2a:
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract$View r0 = r3.f11766o
            boolean r0 = r0.isVoiceOverActive()
            if (r0 == 0) goto L3b
            goto L1a
        L33:
            r3.b()
            r0 = 0
            r0.hashCode()
            throw r0
        L3b:
            int r0 = r3.e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.d():int");
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public void init(Intent intent) {
        boolean z2;
        int i2 = 2 % 2;
        this.f11777z = new IdScanResult();
        this.G = new DocumentValidationResult(ResultCode.ERROR);
        Uri uriE = t.e(this.f11766o.getActivity().getIntent());
        this.A = uriE;
        if (uriE != null) {
            this.C = true;
        }
        IdCategory idCategory = (IdCategory) intent.getSerializableExtra("extraIdCategory");
        this.U = idCategory;
        this.W = this.f11764m.getIdType(idCategory);
        this.f11777z.idCategory = this.U;
        this.f11777z.chosenIdType = this.W;
        IdScan.ScanStep scanStep = (IdScan.ScanStep) intent.getSerializableExtra("extraScanStep");
        this.T = scanStep;
        if (scanStep == IdScan.ScanStep.FRONT) {
            this.f11777z.isOnlyFront = true;
        } else if (this.T == IdScan.ScanStep.BACK) {
            this.f11777z.isOnlyBack = true;
        }
        this.L = intent.getBooleanExtra("extraEnableFrontShownAsBackCheck", false);
        this.J = intent.getBooleanExtra("extraEnableBackShownAsFrontCheck", false);
        this.M = (IdScan.AutocaptureUXMode) intent.getParcelableExtra("extraAutoCaptureUXMode");
        this.K = intent.getIntExtra("extraAutoCaptureTimeout", 25);
        this.S = intent.getIntExtra("extraAutoCaptureNoIdTimeout", 60);
        if (this.K <= 0) {
            int i3 = ar + 51;
            ao = i3 % 128;
            int i4 = i3 % 2;
            this.K = 1;
        }
        this.ab = intent.getBooleanExtra("showIdOverlay", false);
        if (ValidationPhase.SCAN_DOCUMENT.equals(this.f11776y)) {
            z2 = false;
        } else {
            int i5 = ao + 43;
            int i6 = i5 % 128;
            ar = i6;
            z2 = i5 % 2 != 0;
            int i7 = i6 + 69;
            ao = i7 % 128;
            int i8 = i7 % 2;
        }
        setIdAutoCaptureEnabled(z2);
        this.ag = ValidationPhase.SCAN_DOCUMENT.equals(this.f11776y);
        setIdValidationPhase(getIdValidationPhaseFromIntent(intent));
        subscribeToPictures();
        if (!(!IncodeWelcome.getInstance().isCaptureOnlyMode())) {
            p();
        }
        x();
        this.Z = intent.getIntExtra("extraCaptureAttempts", 3);
        this.Y = 0;
        this.ac = 0;
        this.aa = 0;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onCameraSizeParamsChanged(int i2, int i3, int i4, int i5, f.c cVar, int i6) {
        float f2;
        int i7 = 2 % 2;
        int i8 = ao + 79;
        ar = i8 % 128;
        if (i8 % 2 == 0) {
            super.onCameraSizeParamsChanged(i2, i3, i4, i5, cVar, i6);
            float f3 = i4;
            this.O = (int) ((f3 / this.f11263c) % 0.6f);
            f2 = (f3 % this.f11263c) / 0.95f;
        } else {
            super.onCameraSizeParamsChanged(i2, i3, i4, i5, cVar, i6);
            float f4 = i4;
            this.O = (int) (this.f11263c * f4 * 0.6f);
            f2 = f4 * this.f11263c * 0.95f;
        }
        this.P = (int) f2;
        int i9 = ao + 11;
        ar = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onResume() {
        int i2 = 2 % 2;
        int i3 = ar + 33;
        ao = i3 % 128;
        int i4 = i3 % 2;
        super.onResume();
        if (this.f11773v) {
            int i5 = ao + 49;
            ar = i5 % 128;
            int i6 = i5 % 2;
            this.f11773v = false;
            startValidation();
            int i7 = ar + 11;
            ao = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onPause() {
        int i2 = 2 % 2;
        int i3 = ar + 29;
        ao = i3 % 128;
        if (i3 % 2 == 0) {
            super.onPause();
            stopAuxAutoShutterTimer();
            stopAutoShutterTimer();
            if (!this.f11771t) {
                return;
            }
            this.f11773v = true;
            int i4 = ao + 79;
            ar = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        super.onPause();
        stopAuxAutoShutterTimer();
        stopAutoShutterTimer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onDestroy() {
        int i2 = 2 % 2;
        int i3 = ao + 33;
        ar = i3 % 128;
        int i4 = i3 % 2;
        BitmapUtils.deleteMemoryLeakProtectedBitmap(this.f11761j);
        this.f11767p.clear();
        this.f11770s.clear();
        super.onDestroy();
        int i5 = ar + 115;
        ao = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
    }

    public void startValidation() {
        int i2 = 2 % 2;
        int i3 = ao + 19;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11771t = false;
            enableProcessing(false);
            if (!isIdAutoCaptureEnabled()) {
                return;
            }
        } else {
            this.f11771t = true;
            enableProcessing(true);
            if (!isIdAutoCaptureEnabled()) {
                return;
            }
        }
        int i4 = ao + 125;
        ar = i4 % 128;
        int i5 = i4 % 2;
        a();
        int i6 = ao + 53;
        ar = i6 % 128;
        int i7 = i6 % 2;
    }

    public void stopValidation() {
        int i2 = 2 % 2;
        int i3 = ao + 23;
        ar = i3 % 128;
        int i4 = i3 % 2;
        this.f11771t = false;
        enableProcessing(false);
        int i5 = ar + 105;
        ao = i5 % 128;
        int i6 = i5 % 2;
    }

    private int e() {
        int i2 = 2 % 2;
        int i3 = ao;
        int i4 = i3 + 69;
        ar = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = this.K;
        int i6 = i3 + 13;
        ar = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        obj.hashCode();
        throw null;
    }

    private int c() {
        int i2 = 2 % 2;
        int i3 = ao + 47;
        int i4 = i3 % 128;
        ar = i4;
        int i5 = i3 % 2;
        int i6 = this.S;
        int i7 = i4 + 61;
        ao = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    private int b() {
        int i2 = 2 % 2;
        int i3 = ar + 71;
        int i4 = i3 % 128;
        ao = i4;
        int i5 = i3 % 2 != 0 ? this.K : this.K << 1;
        int i6 = i4 + 29;
        ar = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 85 / 0;
        }
        return i5;
    }

    public /* synthetic */ void c(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ar + 67;
        ao = i3 % 128;
        int i4 = i3 % 2;
        autoShutterTimerElapsed();
        int i5 = ao + 109;
        ar = i5 % 128;
        int i6 = i5 % 2;
    }

    private void a() {
        int i2 = 2 % 2;
        int i3 = ao + 47;
        ar = i3 % 128;
        int i4 = i3 % 2;
        stopAuxAutoShutterTimer();
        this.ag = false;
        this.f11774w = Observable.timer(c(), TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda24
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.c((Long) obj);
            }
        }, new BaseValidationPresenter$$ExternalSyntheticLambda52());
        int i5 = ar + 99;
        ao = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ void e(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 111;
        ar = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        autoShutterTimerElapsed();
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = ar + 53;
        ao = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void g() {
        int i2 = 2 % 2;
        int i3 = ar + 71;
        ao = i3 % 128;
        int i4 = i3 % 2;
        stopAutoShutterTimer();
        this.f11772u = Observable.timer(d(), TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda47
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.e((Long) obj);
            }
        }, new BaseValidationPresenter$$ExternalSyntheticLambda52());
        int i5 = ar + 79;
        ao = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ void b(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 59;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11766o.showCaptureHint();
            throw null;
        }
        this.f11766o.showCaptureHint();
        int i4 = ar + 67;
        ao = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void i() {
        int i2 = 2 % 2;
        int i3 = ao + 21;
        ar = i3 % 128;
        int i4 = i3 % 2;
        h();
        if (d() >= 15) {
            this.f11775x = Observable.timer((int) (((double) r1) / 2.5d), TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda44
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.b((Long) obj);
                }
            }, new BaseValidationPresenter$$ExternalSyntheticLambda52());
            return;
        }
        int i5 = ao + 77;
        ar = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void stopAuxAutoShutterTimer() {
        int i2 = 2 % 2;
        int i3 = ao;
        int i4 = i3 + 79;
        ar = i4 % 128;
        int i5 = i4 % 2;
        Disposable disposable = this.f11774w;
        if (disposable != null) {
            int i6 = i3 + 49;
            ar = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                disposable.dispose();
                this.f11774w = null;
            } else {
                disposable.dispose();
                this.f11774w = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    private void h() {
        int i2 = 2 % 2;
        int i3 = ao;
        int i4 = i3 + 63;
        ar = i4 % 128;
        int i5 = i4 % 2;
        Disposable disposable = this.f11775x;
        if (disposable != null) {
            int i6 = i3 + 81;
            ar = i6 % 128;
            if (i6 % 2 == 0) {
                disposable.dispose();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            disposable.dispose();
            int i7 = ar + 75;
            ao = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public void stopAutoShutterTimer() {
        int i2 = 2 % 2;
        int i3 = ao + 111;
        ar = i3 % 128;
        int i4 = i3 % 2;
        h();
        Disposable disposable = this.f11772u;
        if (disposable != null) {
            disposable.dispose();
            this.f11772u = null;
            int i5 = ar + 33;
            ao = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public void userSelectedManualCapture() {
        int i2 = 2 % 2;
        int i3 = ao + 57;
        ar = i3 % 128;
        int i4 = i3 % 2;
        this.Q.add("needHelp");
        autoShutterTimerElapsed();
        int i5 = ao + 97;
        ar = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public void autoShutterTimerElapsed() {
        int i2 = 2 % 2;
        int i3 = ar + 77;
        ao = i3 % 128;
        if (i3 % 2 != 0) {
            this.ag = true;
            setIdAutoCaptureEnabled(true);
        } else {
            this.ag = true;
            setIdAutoCaptureEnabled(false);
        }
        this.f11766o.enteredManualCaptureMode();
        w();
        int i4 = ao + 39;
        ar = i4 % 128;
        int i5 = i4 % 2;
    }

    public void subscribeToPictures() {
        int i2 = 2 % 2;
        int i3 = ar + 7;
        ao = i3 % 128;
        int i4 = i3 % 2;
        this.f11770s.clear();
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        int iA3 = ApproveActivity.e.a();
        d(-1412676634, ApproveActivity.e.a(), iA3, iA, 1412676645, new Object[]{this}, iA2);
        int iA4 = ApproveActivity.e.a();
        int iA5 = ApproveActivity.e.a();
        int iA6 = ApproveActivity.e.a();
        d(307238667, ApproveActivity.e.a(), iA6, iA4, -307238660, new Object[]{this}, iA5);
        int i5 = ar + 115;
        ao = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public ValidationPhase getValidationPhase() {
        int i2 = 2 % 2;
        int i3 = ao + 17;
        int i4 = i3 % 128;
        ar = i4;
        int i5 = i3 % 2;
        ValidationPhase validationPhase = this.f11776y;
        int i6 = i4 + 71;
        ao = i6 % 128;
        int i7 = i6 % 2;
        return validationPhase;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public ValidationState getCurrentValidationState() {
        int i2 = 2 % 2;
        int i3 = ar + 11;
        ao = i3 % 128;
        if (i3 % 2 == 0) {
            return this.D;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public IdCategory getIdCategory() {
        int i2 = 2 % 2;
        int i3 = ao;
        int i4 = i3 + 27;
        ar = i4 % 128;
        int i5 = i4 % 2;
        IdCategory idCategory = this.U;
        int i6 = i3 + 61;
        ar = i6 % 128;
        if (i6 % 2 != 0) {
            return idCategory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public IdScan.IdType getDetectedIdType() {
        int i2 = 2 % 2;
        if (this.f11776y == ValidationPhase.SCAN_ID_FRONT || this.f11776y == ValidationPhase.SCAN_ID_BACK) {
            IdScan.IdType idType = IdScan.IdType.ID;
            int i3 = ar + 57;
            ao = i3 % 128;
            int i4 = i3 % 2;
            return idType;
        }
        if (this.f11776y != ValidationPhase.SCAN_PASSPORT) {
            return null;
        }
        int i5 = ao + 9;
        ar = i5 % 128;
        if (i5 % 2 != 0) {
            return IdScan.IdType.PASSPORT;
        }
        IdScan.IdType idType2 = IdScan.IdType.PASSPORT;
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public IdScan.AutocaptureUXMode getAutocaptureUXMode() {
        IdScan.AutocaptureUXMode autocaptureUXMode;
        int i2 = 2 % 2;
        int i3 = ao;
        int i4 = i3 + 97;
        ar = i4 % 128;
        if (i4 % 2 == 0) {
            autocaptureUXMode = this.M;
            int i5 = 33 / 0;
        } else {
            autocaptureUXMode = this.M;
        }
        int i6 = i3 + 89;
        ar = i6 % 128;
        int i7 = i6 % 2;
        return autocaptureUXMode;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public DocumentType getDocumentType() {
        int i2 = 2 % 2;
        int i3 = ao + 47;
        ar = i3 % 128;
        int i4 = i3 % 2;
        DocumentType documentType = this.B;
        if (i4 == 0) {
            int i5 = 17 / 0;
        }
        return documentType;
    }

    protected boolean isPictureProvidedExternally() {
        int i2 = 2 % 2;
        int i3 = ar + 109;
        ao = i3 % 128;
        if (i3 % 2 == 0) {
            return this.C;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public boolean isIdAutoCaptureEnabled() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = ar + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        ao = i4;
        if (i3 % 2 != 0) {
            z2 = this.N;
            int i5 = 46 / 0;
        } else {
            z2 = this.N;
        }
        int i6 = i4 + 67;
        ar = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public void setIdAutoCaptureEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = ao + 85;
        int i4 = i3 % 128;
        ar = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.N = z2;
            int i5 = i4 + 33;
            ao = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.N = z2;
        obj.hashCode();
        throw null;
    }

    private DocumentType d(ValidationPhase validationPhase) {
        int i2 = 2 % 2;
        int i3 = ao + 59;
        ar = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass4.f11781e[validationPhase.ordinal()];
        if (i5 == 1) {
            return DocumentType.FRONT_ID;
        }
        if (i5 == 2) {
            return DocumentType.BACK_ID;
        }
        if (i5 == 3) {
            return t.d(this.f11766o.getActivity().getIntent());
        }
        if (i5 != 4) {
            throw new IllegalArgumentException("Unknown validation phase: ".concat(String.valueOf(validationPhase)));
        }
        DocumentType documentType = DocumentType.PASSPORT;
        int i6 = ao + 81;
        ar = i6 % 128;
        int i7 = i6 % 2;
        return documentType;
    }

    public void initIdValidationPhase(ValidationPhase validationPhase) {
        int i2 = 2 % 2;
        int i3 = ao + 35;
        ar = i3 % 128;
        int i4 = i3 % 2;
        this.f11776y = validationPhase;
        this.B = d(validationPhase);
        int i5 = ao + 109;
        ar = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIdValidationPhase(ValidationPhase validationPhase) {
        File fileA;
        int i2 = 2 % 2;
        this.f11776y = validationPhase;
        this.Q = new ArrayList<>();
        this.X = null;
        DocumentType documentTypeD = d(this.f11776y);
        this.B = documentTypeD;
        if (!this.f11765n) {
            fileA = l.b(this.f11764m.getImagesDirectory(), this.B.getImageFilename());
        } else {
            int i3 = ar + 13;
            ao = i3 % 128;
            if (i3 % 2 != 0) {
                fileA = this.af.a(documentTypeD.getImageFilename());
                int i4 = 58 / 0;
            } else {
                fileA = this.af.a(documentTypeD.getImageFilename());
            }
        }
        this.V = fileA;
        this.f11777z.idImagePath = fileA.getAbsolutePath();
        int i5 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
        if (i5 == 1) {
            e(ValidationState.f11842b);
            return;
        }
        if (i5 == 2) {
            e(ValidationState.f11863w);
            return;
        }
        if (i5 != 3) {
            if (i5 != 4) {
                return;
            }
            e(ValidationState.Q);
            return;
        }
        Uri uri = this.A;
        if (uri == null) {
            e(ValidationState.L);
            return;
        }
        int i6 = ao + 59;
        ar = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {this, uri};
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        d(1655648766, ApproveActivity.e.a(), ApproveActivity.e.a(), iA, -1655648761, objArr, iA2);
    }

    private void e(ValidationState validationState) {
        int i2 = 2 % 2;
        int i3 = ar + 103;
        ao = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            ValidationState validationState2 = ValidationState.S;
            throw null;
        }
        if (validationState != ValidationState.S) {
            this.D = validationState;
        } else if (this.D == ValidationState.f11841a) {
            this.D = ValidationState.f11842b;
        } else if (this.D == ValidationState.C) {
            this.D = ValidationState.f11863w;
        } else if (this.D == ValidationState.f11845e) {
            int i4 = ao + 3;
            ar = i4 % 128;
            if (i4 % 2 == 0) {
                this.D = ValidationState.Q;
                obj.hashCode();
                throw null;
            }
            this.D = ValidationState.Q;
        }
        this.f11766o.onValidationStateChanged(this.D);
        int i5 = ao + 75;
        ar = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter
    public boolean skipProcessingFrame() {
        int i2 = 2 % 2;
        if (!super.skipProcessingFrame()) {
            int i3 = ar + 35;
            ao = i3 % 128;
            int i4 = i3 % 2;
            if (this.f11776y != ValidationPhase.SCAN_DOCUMENT) {
                return false;
            }
        }
        int i5 = ar + 41;
        ao = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter
    public Observable<Object> processPreviewFrame(Observable<Bitmap> observable, final Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = ao + 105;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
            return observable.map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda43
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.e((Bitmap) obj);
                }
            }).observeOn(AndroidSchedulers.mainThread()).filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda45
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return this.f$0.e(runnable, (BaseValidationPresenter.IdValidationResult) obj);
                }
            }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda46
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.c(runnable, (BaseValidationPresenter.IdValidationResult) obj);
                }
            });
        }
        return observable.map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda43
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e((Bitmap) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda45
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return this.f$0.e(runnable, (BaseValidationPresenter.IdValidationResult) obj);
            }
        }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda46
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.c(runnable, (BaseValidationPresenter.IdValidationResult) obj);
            }
        });
    }

    public /* synthetic */ IdValidationResult e(Bitmap bitmap) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 99;
        ar = i3 % 128;
        int i4 = i3 % 2;
        IdValidationResult idValidationResult = getIdValidationResult(bitmap, true);
        int i5 = ao + 51;
        ar = i5 % 128;
        int i6 = i5 % 2;
        return idValidationResult;
    }

    public /* synthetic */ boolean e(Runnable runnable, IdValidationResult idValidationResult) throws Exception {
        int i2 = 2 % 2;
        int i3 = ar + 21;
        ao = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (!c(idValidationResult.f11786c)) {
                if (idValidationResult.f11786c != null) {
                    this.am = idValidationResult.f11786c.glare;
                    int i4 = ao + 123;
                    ar = i4 % 128;
                    int i5 = i4 % 2;
                }
                if (this.f11776y == ValidationPhase.SCAN_DOCUMENT) {
                    return false;
                }
                c(idValidationResult);
                if (idValidationResult.f11784a != null) {
                    if (idValidationResult.f11784a != this.X) {
                        int i6 = ao + 55;
                        ar = i6 % 128;
                        if (i6 % 2 != 0) {
                            String strValidationStateToEvent = EventUtils.validationStateToEvent(idValidationResult.f11784a);
                            if (strValidationStateToEvent != null) {
                                this.X = idValidationResult.f11784a;
                                this.Q.add(strValidationStateToEvent);
                            }
                        } else {
                            EventUtils.validationStateToEvent(idValidationResult.f11784a);
                            obj.hashCode();
                            throw null;
                        }
                    }
                    e(idValidationResult.f11784a);
                    runnable.run();
                    return false;
                }
                return true;
            }
            int i7 = ar + 23;
            ao = i7 % 128;
            int i8 = i7 % 2;
            runnable.run();
            return false;
        }
        c(idValidationResult.f11786c);
        throw null;
    }

    public /* synthetic */ Object c(Runnable runnable, IdValidationResult idValidationResult) throws Exception {
        int i2 = 2 % 2;
        int i3 = ar + 5;
        ao = i3 % 128;
        if (i3 % 2 == 0) {
            n();
            runnable.run();
            return idValidationResult;
        }
        n();
        runnable.run();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.IdValidationResult getIdValidationResult(android.graphics.Bitmap r20, boolean r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.getIdValidationResult(android.graphics.Bitmap, boolean):com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$IdValidationResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase b(com.incode.recogkitandroid.IdCaptureKitAndroid.Result r10) throws java.lang.Throwable {
        /*
            r9 = 2
            int r0 = r9 % r9
            r8 = 0
            if (r10 != 0) goto L7
            return r8
        L7:
            float r1 = r10.cls
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L19
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r9
            return r8
        L19:
            java.lang.String r3 = r10.idType
            int r1 = r3.hashCode()
            r0 = 3355(0xd1b, float:4.701E-42)
            r4 = 0
            r5 = 1
            if (r1 == r0) goto L4f
            r0 = 1216777234(0x48868c12, float:275552.56)
            if (r1 == r0) goto L30
        L2a:
            r0 = -1
        L2b:
            if (r0 == 0) goto L5c
            if (r0 == r5) goto L59
            return r8
        L30:
            r1 = 0
            float r0 = android.util.TypedValue.complexToFraction(r4, r1, r1)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "鷋鶻鮒揦⨁qዞ婳\ue247ݻ䠸\uda91"
            at(r0, r2, r1)
            r0 = r1[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2a
            r0 = r5
            goto L2b
        L4f:
            java.lang.String r0 = "id"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2a
            r0 = r4
            goto L2b
        L59:
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase.SCAN_PASSPORT
            return r0
        L5c:
            java.lang.String r3 = r10.side
            long r6 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            int r2 = 1 - r0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "\u0cd1ಷ긾Ãι捈ꗄ쭭끼"
            at(r0, r2, r1)
            r0 = r1[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = java.util.Objects.equals(r3, r0)
            if (r0 == 0) goto L81
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase.SCAN_ID_FRONT
            return r0
        L81:
            java.lang.String r3 = r10.side
            int r0 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r2 = r0 >> 24
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "蔌蕮↠䞄逳␃泞祣"
            at(r0, r2, r1)
            r0 = r1[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = java.util.Objects.equals(r3, r0)
            if (r0 == 0) goto Lab
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r0
            int r1 = r1 % r9
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase.SCAN_ID_BACK
            return r0
        Lab:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.b(com.incode.recogkitandroid.IdCaptureKitAndroid$Result):com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase");
    }

    private boolean c(IdCaptureKitAndroid.Result result) throws Throwable {
        int i2 = 2 % 2;
        if (this.f11776y != ValidationPhase.SCAN_ID_FRONT) {
            int i3 = ar + 117;
            ao = i3 % 128;
            int i4 = i3 % 2;
            if (this.f11776y != ValidationPhase.SCAN_PASSPORT) {
                int i5 = ao + 9;
                ar = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
        }
        ValidationPhase validationPhaseB = b(result);
        if (validationPhaseB != ValidationPhase.SCAN_ID_FRONT && validationPhaseB != ValidationPhase.SCAN_PASSPORT) {
            this.aq = 0;
            return false;
        }
        if (this.f11776y != validationPhaseB) {
            if (this.an != validationPhaseB) {
                this.an = validationPhaseB;
                this.aq = 0;
            }
            int i7 = this.aq + 1;
            this.aq = i7;
            if (i7 >= 3) {
                setIdValidationPhase(validationPhaseB);
                this.f11766o.initializeUiViews();
                return true;
            }
        } else {
            this.aq = 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0026, code lost:
    
        if ((!getRepository().isSkipGlareBackId()) != true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0028, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0031, code lost:
    
        if (getRepository().isSkipGlareBackId() != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean j() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase.SCAN_ID_BACK
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = r5.f11776y
            boolean r0 = r1.equals(r0)
            r3 = 0
            if (r0 == 0) goto L34
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r4
            r2 = 1
            if (r1 != 0) goto L29
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r5.getRepository()
            boolean r1 = r0.isSkipGlareBackId()
            r0 = 94
            int r0 = r0 / r3
            r1 = r1 ^ r2
            if (r1 == r2) goto L34
        L28:
            return r2
        L29:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r5.getRepository()
            boolean r0 = r0.isSkipGlareBackId()
            if (r0 == 0) goto L34
            goto L28
        L34:
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L40
            return r3
        L40:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.j():boolean");
    }

    private static /* synthetic */ Object f(Object[] objArr) {
        BaseValidationPresenter baseValidationPresenter = (BaseValidationPresenter) objArr[0];
        int i2 = 2 % 2;
        int i3 = ao + 7;
        ar = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            baseValidationPresenter.isIdAutoCaptureEnabled();
            obj.hashCode();
            throw null;
        }
        if (baseValidationPresenter.isIdAutoCaptureEnabled() && baseValidationPresenter.f11772u == null) {
            int i4 = ao + 1;
            ar = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = ar + 79;
        ao = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bf, code lost:
    
        if (r7.L != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c1, code lost:
    
        r1 = new java.lang.Object[1];
        at("蔌蕮↠䞄逳␃泞祣", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
    
        if (r8.equalsIgnoreCase(((java.lang.String) r1[0]).intern()) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
    
        r5 = new java.lang.Object[]{r7, com.incode.welcome_sdk.data.Event.BACK_ID_DETECTED};
        d(-2140839344, com.incode.welcome_sdk.ui.approve.ApproveActivity.e.a(), com.incode.welcome_sdk.ui.approve.ApproveActivity.e.a(), com.incode.welcome_sdk.ui.approve.ApproveActivity.e.a(), 2140839358, r5, com.incode.welcome_sdk.ui.approve.ApproveActivity.e.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
    
        if (r7.L != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0102, code lost:
    
        r5 = new java.lang.Object[]{r7, com.incode.welcome_sdk.data.Event.BACK_ID_DETECTED};
        d(-2140839344, com.incode.welcome_sdk.ui.approve.ApproveActivity.e.a(), com.incode.welcome_sdk.ui.approve.ApproveActivity.e.a(), com.incode.welcome_sdk.ui.approve.ApproveActivity.e.a(), 2140839358, r5, com.incode.welcome_sdk.ui.approve.ApproveActivity.e.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0121, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(java.lang.String r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.d(java.lang.String):void");
    }

    private static /* synthetic */ Object n(Object[] objArr) {
        BaseValidationPresenter baseValidationPresenter = (BaseValidationPresenter) objArr[0];
        Event event = (Event) objArr[1];
        int i2 = 2 % 2;
        int i3 = ao + 57;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            EventUtils.sendIdDetectedEvent(baseValidationPresenter.f11764m, baseValidationPresenter.k(), event.getValue());
            baseValidationPresenter.g();
            baseValidationPresenter.i();
            baseValidationPresenter.stopAuxAutoShutterTimer();
            int i4 = 35 / 0;
            return null;
        }
        EventUtils.sendIdDetectedEvent(baseValidationPresenter.f11764m, baseValidationPresenter.k(), event.getValue());
        baseValidationPresenter.g();
        baseValidationPresenter.i();
        baseValidationPresenter.stopAuxAutoShutterTimer();
        return null;
    }

    private ScreenName k() {
        int i2 = 2 % 2;
        int i3 = ao + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        ar = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass4.f11781e[getValidationPhase().ordinal()];
        if (i5 == 1) {
            return ScreenName.FRONT_ID_CAMERA_CAPTURE;
        }
        if (i5 == 2) {
            return ScreenName.BACK_ID_CAMERA_CAPTURE;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                return ScreenName.PASSPORT_CAMERA_CAPTURE;
            }
            return ScreenName.VALIDATION;
        }
        ScreenName screenName = ScreenName.DOCUMENT_CAMERA_CAPTURE;
        int i6 = ao + 65;
        ar = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter
    public void onDetectionError(Throwable th) {
        int i2 = 2 % 2;
        int i3 = ao + 95;
        int i4 = i3 % 128;
        ar = i4;
        int i5 = i3 % 2;
        if (th instanceof NoConnectivityException) {
            int i6 = i4 + 89;
            ao = i6 % 128;
            int i7 = i6 % 2;
            Toast.makeText(this.f11766o.getContext(), R.string.onboard_sdk_no_internet_connection, 1).show();
        }
        Timber.e(th);
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public boolean hasClassifierFoundID() {
        int i2 = 2 % 2;
        if (this.D == ValidationState.f11841a || this.D == ValidationState.C) {
            return true;
        }
        int i3 = ar + 105;
        ao = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 26 / 0;
            if (this.D == ValidationState.f11844d) {
                return true;
            }
        } else if (this.D == ValidationState.f11844d) {
            return true;
        }
        int i5 = ar + 39;
        ao = i5 % 128;
        if (i5 % 2 == 0) {
            return this.D == ValidationState.B;
        }
        ValidationState validationState = ValidationState.B;
        throw null;
    }

    private void n() {
        int i2 = 2 % 2;
        int i3 = ar + 9;
        ao = i3 % 128;
        if (i3 % 2 == 0) {
            if (isProcessingEnabled()) {
                enableProcessing(false);
                int i4 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
                if (i4 == 1) {
                    e(ValidationState.f11841a);
                } else if (i4 == 2) {
                    e(ValidationState.C);
                    int i5 = ao + 55;
                    ar = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 / 4;
                    }
                } else if (i4 == 4) {
                    e(ValidationState.f11845e);
                }
                takePicture();
                return;
            }
            return;
        }
        isProcessingEnabled();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void takePicture() {
        int i2 = 2 % 2;
        int i3 = ao + 55;
        ar = i3 % 128;
        int i4 = i3 % 2;
        stopAutoShutterTimer();
        if (!this.f11763l) {
            int i5 = ar + 99;
            ao = i5 % 128;
            if (i5 % 2 != 0) {
                p();
                throw null;
            }
            p();
        }
        if (this.D != ValidationState.f11841a) {
            int i6 = ao + 85;
            ar = i6 % 128;
            if (i6 % 2 == 0) {
                ValidationState validationState = ValidationState.C;
                throw null;
            }
            if (this.D != ValidationState.C && this.D != ValidationState.f11845e) {
                l();
                return;
            }
        }
        m();
    }

    public /* synthetic */ void a(int i2, Disposable disposable) throws Exception {
        int i3 = 2 % 2;
        int i4 = ao + 67;
        ar = i4 % 128;
        int i5 = i4 % 2;
        this.f11766o.showAutocaptureUI(i2);
        int i6 = ar + 33;
        ao = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        BaseValidationPresenter baseValidationPresenter = (BaseValidationPresenter) objArr[0];
        int i2 = 2 % 2;
        int i3 = ar + 47;
        ao = i3 % 128;
        if (i3 % 2 != 0) {
            baseValidationPresenter.f11766o.hideAutocaptureUI();
            baseValidationPresenter.l();
            int i4 = 15 / 0;
            return null;
        }
        baseValidationPresenter.f11766o.hideAutocaptureUI();
        baseValidationPresenter.l();
        return null;
    }

    public /* synthetic */ void f(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = ar + 43;
        ao = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th);
        this.f11766o.hideAutocaptureUI();
        int i5 = ar + 123;
        ao = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
    }

    private void m() {
        int i2 = 2 % 2;
        int i3 = ar + 51;
        ao = i3 % 128;
        int i4 = i3 % 2;
        final int duration = getAutocaptureUXMode().getDuration() * 1000;
        CompositeDisposable compositeDisposable = this.f11767p;
        Observable<Long> observableObserveOn = Observable.timer(duration, TimeUnit.MILLISECONDS).doOnSubscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.a(duration, (Disposable) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final BaseValidationContract.View view = this.f11766o;
        Objects.requireNonNull(view);
        compositeDisposable.add(observableObserveOn.doOnTerminate(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Action
            public final void run() {
                view.hideAutocaptureUI();
            }
        }).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.a((Long) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.f((Throwable) obj);
            }
        }));
        int i5 = ar + 5;
        ao = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void a(Bitmap bitmap) {
        boolean z2;
        int i2 = 2 % 2;
        if (bitmap != null) {
            int i3 = ar + 111;
            ao = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            int i5 = ao + 45;
            ar = i5 % 128;
            int i6 = i5 % 2;
            z2 = false;
        }
        Timber.d("Photo taken %s", Boolean.valueOf(z2));
        onPictureTaken(bitmap);
        int i7 = ao + 41;
        ar = i7 % 128;
        int i8 = i7 % 2;
    }

    private void l() {
        CameraPreview cameraPreview;
        androidx.core.util.Consumer<Bitmap> consumer;
        int i2 = 2 % 2;
        int i3 = ao + 13;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.v("obtainPictureFromCamera", new Object[0]);
            cameraPreview = this.f11766o.getCameraPreview();
            consumer = new androidx.core.util.Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda39
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f$0.a((Bitmap) obj);
                }
            };
        } else {
            Timber.v("obtainPictureFromCamera", new Object[0]);
            cameraPreview = this.f11766o.getCameraPreview();
            consumer = new androidx.core.util.Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda39
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f$0.a((Bitmap) obj);
                }
            };
        }
        cameraPreview.getSinglePreviewFrame(consumer);
        int i4 = ao + 69;
        ar = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object i(Object[] objArr) {
        BaseValidationPresenter baseValidationPresenter = (BaseValidationPresenter) objArr[0];
        int i2 = 2 % 2;
        int i3 = ar + 63;
        ao = i3 % 128;
        int i4 = i3 % 2;
        CompositeDisposable compositeDisposable = baseValidationPresenter.f11770s;
        Observable<Bitmap> observableObserveOn = baseValidationPresenter.H.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final BaseValidationContract.View view = baseValidationPresenter.f11766o;
        Objects.requireNonNull(view);
        compositeDisposable.add(observableObserveOn.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda40
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                view.onImageTaken((Bitmap) obj);
            }
        }, new BaseValidationPresenter$$ExternalSyntheticLambda52()));
        int i5 = ao + 19;
        ar = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void d(android.graphics.Bitmap r6) throws java.lang.Exception {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 27
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r4
            boolean r0 = r5.isIdAutoCaptureEnabled()
            if (r0 != 0) goto L37
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r0 = r0 + 101
            int r3 = r0 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r3
            int r0 = r0 % r4
            r2 = 0
            if (r0 != 0) goto L8c
            boolean r1 = r5.f11763l
            r0 = 1
            r1 = r1 ^ r0
            if (r1 == r0) goto L60
            int r1 = r3 + 99
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L84
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase.SCAN_DOCUMENT
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = r5.f11776y
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L60
        L37:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r5.f11764m
            boolean r2 = r0.isShowRetakeScreenForAutoCapture()
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r1 = r0 + 7
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r0
            int r1 = r1 % r4
        L46:
            r1 = 62
            if (r2 == 0) goto L5e
            r0 = 93
        L4c:
            if (r0 == r1) goto L67
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract$View r0 = r5.f11766o
            boolean r0 = r0.isVoiceOverActive()
            if (r0 != 0) goto L67
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract$View r1 = r5.f11766o
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = r5.B
            r1.showReviewActivity(r0)
            return
        L5e:
            r0 = r1
            goto L4c
        L60:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r5.f11764m
            boolean r2 = r0.isShowRetakeScreenForManualCapture()
            goto L46
        L67:
            boolean r0 = r5.f11763l
            if (r0 == 0) goto L78
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r1 = r0 + 37
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r0
            int r1 = r1 % r4
            r5.proceedCaptureOnlyIdScanResult()
            return
        L78:
            boolean r0 = r5.f11765n
            if (r0 == 0) goto L80
            r5.proceedDelayedScanResult()
            return
        L80:
            r5.uploadSavedScan()
            return
        L84:
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase.SCAN_DOCUMENT
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = r5.f11776y
            r1.equals(r0)
            throw r2
        L8c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.d(android.graphics.Bitmap):void");
    }

    private static /* synthetic */ Object l(Object[] objArr) {
        final BaseValidationPresenter baseValidationPresenter = (BaseValidationPresenter) objArr[0];
        int i2 = 2 % 2;
        int i3 = ao + 55;
        ar = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            baseValidationPresenter.f11770s.add(baseValidationPresenter.F.subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) throws Exception {
                    this.f$0.d((Bitmap) obj2);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) throws Exception {
                    this.f$0.h((Throwable) obj2);
                }
            }));
            return null;
        }
        baseValidationPresenter.f11770s.add(baseValidationPresenter.F.subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) throws Exception {
                this.f$0.d((Bitmap) obj2);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) throws Exception {
                this.f$0.h((Throwable) obj2);
            }
        }));
        obj.hashCode();
        throw null;
    }

    public void proceedCaptureOnlyIdScanResult() {
        int i2 = 2 % 2;
        int i3 = ao + 29;
        ar = i3 % 128;
        int i4 = i3 % 2;
        fillInMetadata(this.ag);
        c(this.V);
        y();
        int i5 = ar + 69;
        ao = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object h(Object[] objArr) {
        String strName;
        BaseValidationPresenter baseValidationPresenter = (BaseValidationPresenter) objArr[0];
        int i2 = 2 % 2;
        if (baseValidationPresenter.f11776y == ValidationPhase.SCAN_DOCUMENT) {
            baseValidationPresenter.G.resultCode = ResultCode.SUCCESS;
            baseValidationPresenter.f11769r.e(baseValidationPresenter.V, baseValidationPresenter.B, baseValidationPresenter.v());
        } else {
            boolean z2 = baseValidationPresenter.U == IdCategory.SECOND;
            if (baseValidationPresenter.f11777z.chosenIdType != null) {
                int i3 = ao + 125;
                ar = i3 % 128;
                if (i3 % 2 == 0) {
                    strName = baseValidationPresenter.f11777z.chosenIdType.name();
                    int i4 = 63 / 0;
                } else {
                    strName = baseValidationPresenter.f11777z.chosenIdType.name();
                }
            } else {
                int i5 = ar + 61;
                ao = i5 % 128;
                int i6 = i5 % 2;
                strName = "";
            }
            baseValidationPresenter.f11769r.d(baseValidationPresenter.f11777z.idImagePath, strName, z2, baseValidationPresenter.f11776y);
        }
        baseValidationPresenter.y();
        return null;
    }

    public void proceedDelayedScanResult() {
        int i2 = 2 % 2;
        int i3 = ar + 49;
        ao = i3 % 128;
        int i4 = i3 % 2;
        this.f11767p.add(Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda17
            @Override // io.reactivex.functions.Action
            public final void run() {
                this.f$0.s();
            }
        }).subscribeOn(AndroidSchedulers.mainThread()).delay(this.R, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread()).andThen(Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda18
            @Override // io.reactivex.functions.Action
            public final void run() {
                this.f$0.t();
            }
        })).doOnComplete(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda19
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.f$0.C();
            }
        }).subscribe());
        int i5 = ao + 99;
        ar = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s() {
        /*
            r6 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 71
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r2
            r5 = 4
            r4 = 3
            r3 = 1
            if (r1 != 0) goto L28
            int[] r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.AnonymousClass4.f11781e
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = r6.f11776y
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 79
            int r0 = r0 / 0
            if (r1 == r3) goto L56
            if (r1 == r2) goto L50
            if (r1 == r4) goto L4a
            if (r1 == r5) goto L3b
        L27:
            return
        L28:
            int[] r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.AnonymousClass4.f11781e
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = r6.f11776y
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r3) goto L56
            if (r0 == r2) goto L50
            if (r0 == r4) goto L4a
            if (r0 == r5) goto L3b
            goto L27
        L3b:
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState.R
            r6.e(r0)
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 29
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r2
            goto L27
        L4a:
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState.N
            r6.e(r0)
            return
        L50:
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState.B
            r6.e(r0)
            return
        L56:
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState.f11844d
            r6.e(r0)
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L67
            return
        L67:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.s():void");
    }

    public void t() {
        int i2 = 2 % 2;
        if (this.f11763l) {
            return;
        }
        int i3 = ao + 99;
        ar = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
        if (i5 == 1) {
            e(ValidationState.f11843c);
            return;
        }
        if (i5 == 2) {
            e(ValidationState.f11866z);
            int i6 = ao + 29;
            ar = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        if (i5 == 3) {
            e(ValidationState.M);
        } else {
            if (i5 != 4) {
                return;
            }
            e(ValidationState.P);
        }
    }

    public /* synthetic */ Bitmap b(Bitmap bitmap) throws Exception {
        float frameScore;
        int i2 = 2 % 2;
        int i3 = ar + 47;
        ao = i3 % 128;
        int i4 = i3 % 2;
        Bitmap memoryLeakProtectedBitmap = BitmapUtils.getMemoryLeakProtectedBitmap(bitmap, this.f11761j);
        if (isManualCaptureMode()) {
            this.f11760h = getIdValidationResult(memoryLeakProtectedBitmap, false);
        }
        if (ValidationPhase.SCAN_DOCUMENT.equals(this.f11776y)) {
            int i5 = ar + 87;
            ao = i5 % 128;
            if (i5 % 2 != 0) {
                this.H.onNext(memoryLeakProtectedBitmap);
                throw null;
            }
            this.H.onNext(memoryLeakProtectedBitmap);
        } else {
            this.H.onNext(this.f11766o.getCroppedBitmap(memoryLeakProtectedBitmap, 0));
        }
        if (this.f11762k != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            IdCaptureKitAndroid.Result resultCaptureId = this.f11762k.captureId(bitmap, Boolean.FALSE, Boolean.valueOf(IdCaptureChecksGate.isIdIouCheckEnabled()));
            Timber.d("onPictureTaken capture took: %s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            frameScore = IdCaptureChecksGate.useBarcodeAndTextReadabilityAlgorithm() ? 0.0f : getFrameScore(resultCaptureId);
            Timber.d("latestFrameScore: %s", Float.valueOf(frameScore));
            if (this.I.first != null) {
                int i6 = ao + 71;
                ar = i6 % 128;
                int i7 = i6 % 2;
                if (this.I.second.floatValue() < frameScore) {
                }
                this.I = new Pair<>(null, Float.valueOf(0.0f));
                d(1849492103, ApproveActivity.e.a(), ApproveActivity.e.a(), ApproveActivity.e.a(), -1849492103, new Object[]{this, Float.valueOf(frameScore)}, ApproveActivity.e.a());
                return memoryLeakProtectedBitmap;
            }
            this.am = resultCaptureId.glare;
            if (this.I.first != null) {
                int i8 = ar + 59;
                ao = i8 % 128;
                int i9 = i8 % 2;
                this.I.first.recycle();
            }
            this.I = new Pair<>(null, Float.valueOf(0.0f));
            d(1849492103, ApproveActivity.e.a(), ApproveActivity.e.a(), ApproveActivity.e.a(), -1849492103, new Object[]{this, Float.valueOf(frameScore)}, ApproveActivity.e.a());
            return memoryLeakProtectedBitmap;
        }
        Timber.w("We can't compare the latest frame as IDCaptureKitAndroid is null, so just take the first one.", new Object[0]);
        frameScore = 0.0f;
        memoryLeakProtectedBitmap = this.I.first;
        this.I = new Pair<>(null, Float.valueOf(0.0f));
        d(1849492103, ApproveActivity.e.a(), ApproveActivity.e.a(), ApproveActivity.e.a(), -1849492103, new Object[]{this, Float.valueOf(frameScore)}, ApproveActivity.e.a());
        return memoryLeakProtectedBitmap;
    }

    public /* synthetic */ void c(Bitmap bitmap, Bitmap bitmap2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 15;
        ar = i3 % 128;
        int i4 = i3 % 2;
        if (!ValidationPhase.SCAN_DOCUMENT.equals(this.f11776y)) {
            this.aj.onNext(new Pair<>(bitmap2, this.V));
            int i5 = ao + 115;
            ar = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = ar + 77;
        ao = i7 % 128;
        int i8 = i7 % 2;
        a(bitmap, this.V);
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onPictureTaken(final Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = ar + 61;
        ao = i3 % 128;
        if (i3 % 2 != 0) {
            this.f11767p.add(Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda31
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f$0.b(bitmap);
                }
            }).subscribeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda32
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.c(bitmap, (Bitmap) obj);
                }
            }, new BaseValidationPresenter$$ExternalSyntheticLambda52()));
            int i4 = 57 / 0;
        } else {
            this.f11767p.add(Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda31
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f$0.b(bitmap);
                }
            }).subscribeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda32
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.c(bitmap, (Bitmap) obj);
                }
            }, new BaseValidationPresenter$$ExternalSyntheticLambda52()));
        }
        int i5 = ar + 107;
        ao = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private void a(Bitmap bitmap, File file) {
        int i2 = 2 % 2;
        int i3 = ao + 99;
        ar = i3 % 128;
        int i4 = i3 % 2;
        BitmapUtils.saveBitmapToFile(bitmap, file);
        this.F.onNext(bitmap);
        int i5 = ar + 1;
        ao = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x002f A[PHI: r2
  0x002f: PHI (r2v6 java.lang.String) = (r2v0 java.lang.String), (r2v8 java.lang.String) binds: [B:36:0x0098, B:25:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void a(android.net.Uri r5) throws java.lang.Exception {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 125
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L7d
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract$View r0 = r4.f11766o
            android.app.Activity r0 = r0.getActivity()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.io.InputStream r0 = r0.openInputStream(r5)
            byte[] r1 = com.incode.welcome_sdk.commons.utils.l.d(r0)
            java.io.File r0 = r4.V
            com.incode.welcome_sdk.commons.utils.l.a(r1, r0)
            java.lang.String r2 = r4.v()
            r0 = 85
            int r0 = r0 / 0
            if (r2 == 0) goto L9b
        L2f:
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r1 = r0 + 27
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r0
            int r1 = r1 % r3
            java.lang.String r0 = "pdf"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L9b
            java.io.File r0 = r4.V
            android.graphics.Bitmap r2 = com.incode.welcome_sdk.commons.utils.BitmapUtils.getBitmapPreviewFromPdfFile(r0)
        L46:
            if (r2 != 0) goto L5d
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract$View r0 = r4.f11766o
            android.content.Context r1 = r0.getContext()
            int r0 = com.incode.welcome_sdk.R.drawable.onboard_sdk_document_preview_generic
            android.graphics.Bitmap r2 = com.incode.welcome_sdk.commons.utils.BitmapUtils.getBitmapFromVectorDrawable(r1, r0)
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r0
            int r1 = r1 % r3
        L5d:
            io.reactivex.subjects.PublishSubject<android.graphics.Bitmap> r1 = r4.H
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1.onNext(r0)
            io.reactivex.subjects.PublishSubject<android.graphics.Bitmap> r0 = r4.F
            r0.onNext(r2)
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r1 = r0 + 115
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L7c
            r0 = 33
            int r0 = r0 / 0
        L7c:
            return
        L7d:
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract$View r0 = r4.f11766o
            android.app.Activity r0 = r0.getActivity()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.io.InputStream r0 = r0.openInputStream(r5)
            byte[] r1 = com.incode.welcome_sdk.commons.utils.l.d(r0)
            java.io.File r0 = r4.V
            com.incode.welcome_sdk.commons.utils.l.a(r1, r0)
            java.lang.String r2 = r4.v()
            if (r2 == 0) goto L9b
            goto L2f
        L9b:
            java.io.File r2 = r4.V
            r1 = 1440(0x5a0, float:2.018E-42)
            r0 = 1920(0x780, float:2.69E-42)
            android.graphics.Bitmap r2 = com.incode.welcome_sdk.commons.utils.BitmapUtils.getScaledRotatedBitmapThatFitsBounds(r2, r1, r0)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.a(android.net.Uri):void");
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        final BaseValidationPresenter baseValidationPresenter = (BaseValidationPresenter) objArr[0];
        final Uri uri = (Uri) objArr[1];
        int i2 = 2 % 2;
        int i3 = ar + 115;
        ao = i3 % 128;
        int i4 = i3 % 2;
        baseValidationPresenter.f11767p.add(Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.f$0.a(uri);
            }
        }).subscribeOn(Schedulers.io()).subscribe());
        int i5 = ao + 65;
        ar = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private void e(int i2) {
        int i3 = 2 % 2;
        this.f11777z.scanStatus = i2;
        if (i2 == -1) {
            int i4 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
            if (i4 == 1) {
                if (getFrontIdScanAttemptsRemaining() != 0) {
                    e(ValidationState.f11849i);
                    return;
                }
                int i5 = ao + 123;
                ar = i5 % 128;
                int i6 = i5 % 2;
                e(ValidationState.f11850j);
                return;
            }
            if (i4 == 2) {
                if (getBackIdScanAttemptsRemaining() == 0) {
                    e(ValidationState.A);
                    return;
                } else {
                    e(ValidationState.E);
                    return;
                }
            }
            if (i4 == 3) {
                this.G.resultCode = ResultCode.ERROR;
                this.G.error = new IncodeGenericError("Document validation error: unknown");
                e(ValidationState.K);
                return;
            }
            if (i4 != 4) {
                return;
            }
            if (getFrontIdScanAttemptsRemaining() != 0) {
                e(ValidationState.X);
                return;
            }
            int i7 = ar + 43;
            ao = i7 % 128;
            int i8 = i7 % 2;
            e(ValidationState.V);
            return;
        }
        if (i2 == 11) {
            e(ValidationState.f11862v);
            return;
        }
        if (i2 == 13) {
            int i9 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
            if (i9 == 1) {
                e(ValidationState.f11856p);
                return;
            } else if (i9 == 2) {
                e(ValidationState.f11857q);
                return;
            } else {
                if (i9 != 4) {
                    return;
                }
                e(ValidationState.W);
                return;
            }
        }
        switch (i2) {
            case 1:
                int i10 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
                if (i10 == 1) {
                    e(ValidationState.f11848h);
                    break;
                } else if (i10 == 2) {
                    e(ValidationState.I);
                    break;
                } else if (i10 == 4) {
                    e(ValidationState.W);
                    break;
                }
                break;
            case 2:
                e(ValidationState.f11847g);
                break;
            case 3:
                int i11 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
                if (i11 == 1) {
                    e(ValidationState.f11853m);
                    break;
                } else if (i11 == 2) {
                    e(ValidationState.H);
                    break;
                } else if (i11 == 3) {
                    this.G.resultCode = ResultCode.ERROR;
                    this.G.error = new IncodeGenericError("Document validation error: glare");
                    e(ValidationState.K);
                    break;
                } else if (i11 == 4) {
                    e(ValidationState.U);
                    break;
                }
                break;
            case 4:
                int i12 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
                if (i12 == 1) {
                    e(ValidationState.f11846f);
                    break;
                } else if (i12 == 2) {
                    e(ValidationState.G);
                    break;
                } else if (i12 == 3) {
                    this.G.resultCode = ResultCode.ERROR;
                    this.G.error = new IncodeGenericError("Document validation error: sharpness");
                    e(ValidationState.K);
                    break;
                } else if (i12 == 4) {
                    e(ValidationState.T);
                    break;
                }
                break;
            case 5:
                int i13 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
                if (i13 == 1) {
                    e(ValidationState.f11852l);
                    break;
                } else if (i13 == 2) {
                    e(ValidationState.F);
                    break;
                } else if (i13 == 3) {
                    this.G.resultCode = ResultCode.ERROR;
                    this.G.error = new IncodeGenericError("Document validation error: shadow");
                    e(ValidationState.K);
                    break;
                } else if (i13 == 4) {
                    e(ValidationState.ab);
                    break;
                }
                break;
            case 6:
                e(ValidationState.W);
                break;
            case 7:
                this.G.resultCode = ResultCode.ERROR;
                this.G.error = new IncodeGenericError("Document validation error: server returned false");
                e(ValidationState.K);
                break;
            case 8:
                int i14 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
                if (i14 == 1) {
                    e(ValidationState.f11864x);
                    break;
                } else if (i14 == 2) {
                    e(ValidationState.f11861u);
                    break;
                } else if (i14 == 4) {
                    e(ValidationState.aa);
                    int i15 = ar + 9;
                    ao = i15 % 128;
                    int i16 = i15 % 2;
                    break;
                }
                break;
        }
    }

    private void c(Throwable th) {
        int i2 = 2 % 2;
        int i3 = ao + 53;
        ar = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th, "handleScanError called", new Object[0]);
        if (!(th instanceof i)) {
            if (th instanceof j) {
                e(4);
                return;
            }
            if (th instanceof com.incode.welcome_sdk.data.remote.b.f) {
                e(5);
                return;
            }
            if (th instanceof com.incode.welcome_sdk.data.remote.b.c) {
                e(8);
                return;
            }
            if (th instanceof a) {
                e(11);
                return;
            }
            if (th instanceof g) {
                int i5 = ao + 121;
                ar = i5 % 128;
                if (i5 % 2 == 0) {
                    e(33);
                    return;
                } else {
                    e(13);
                    return;
                }
            }
            if (th instanceof com.incode.welcome_sdk.data.remote.b.d) {
                com.incode.welcome_sdk.data.remote.b.d dVar = (com.incode.welcome_sdk.data.remote.b.d) th;
                if (dVar.b().equals(o.VOTER_IDENTIFICATION)) {
                    e(1);
                    return;
                }
                if (!dVar.b().equals(o.PASSPORT)) {
                    if (dVar.b().equals(o.ADDRESS_STATEMENT)) {
                        e(7);
                        return;
                    }
                    return;
                } else {
                    int i6 = ar + 93;
                    ao = i6 % 128;
                    e(i6 % 2 != 0 ? 71 : 6);
                    return;
                }
            }
            if (th instanceof HttpException) {
                HttpException httpException = (HttpException) th;
                if (httpException.code() == 400) {
                    try {
                        if (new JSONObject(httpException.response().errorBody().string()).optInt("status") == 4019) {
                            e(2);
                            return;
                        } else {
                            e(-1);
                            return;
                        }
                    } catch (Exception e2) {
                        Timber.e(e2, "Couldn't parse error", new Object[0]);
                    }
                }
                e(-1);
                return;
            }
            if (th instanceof h) {
                int i7 = ao + 53;
                ar = i7 % 128;
                int i8 = i7 % 2;
                this.f11777z.scanStatus = ((h) th).b();
                int i9 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
                if (i9 == 1) {
                    e(ValidationState.f11850j);
                    return;
                }
                if (i9 == 2) {
                    e(ValidationState.A);
                    return;
                } else if (i9 == 3) {
                    e(ValidationState.J);
                    return;
                } else {
                    if (i9 == 4) {
                        e(ValidationState.V);
                        return;
                    }
                    return;
                }
            }
            if (th instanceof NoConnectivityException) {
                this.f11766o.showNoNetworkSnackbar();
                return;
            } else {
                e(-1);
                return;
            }
        }
        int i10 = ao + 13;
        ar = i10 % 128;
        if (i10 % 2 == 0) {
            e(2);
        } else {
            e(3);
        }
    }

    private void c(File file) {
        int i2 = 2 % 2;
        int i3 = ao + 49;
        ar = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
            if (i4 != 1 && i4 != 2) {
                if (i4 == 3) {
                    this.G.documentPath = file.getPath();
                    int i5 = ao + 25;
                    ar = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                if (i4 != 4) {
                    Timber.e("Unknown validation phase", new Object[0]);
                    return;
                }
            }
            this.f11777z.idImageBase64 = BitmapUtils.getBase64FromBitmap(BitmapUtils.getBitmapFromFile(file));
            this.f11777z.idImagePath = file.getPath();
            return;
        }
        int i7 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public void uploadSavedScan() {
        int i2 = 2 % 2;
        int i3 = ar + 31;
        ao = i3 % 128;
        int i4 = i3 % 2;
        d(this.V);
        int i5 = ao + 107;
        ar = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public boolean showIdOverlay() {
        int i2 = 2 % 2;
        int i3 = ao + 3;
        int i4 = i3 % 128;
        ar = i4;
        int i5 = i3 % 2;
        boolean z2 = this.ab;
        int i6 = i4 + 45;
        ao = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public boolean isManualCaptureMode() {
        int i2 = 2 % 2;
        int i3 = ao + 13;
        ar = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.ag;
        if (i4 == 0) {
            int i5 = 99 / 0;
        }
        return z2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public void setIdCaptureStarted() {
        int i2 = 2 % 2;
        this.ae = new Date().getTime();
        int i3 = ao + 57;
        ar = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        int i2 = 2 % 2;
        ((BaseValidationPresenter) objArr[0]).s();
        Object obj = new Object();
        int i3 = ar + 97;
        ao = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
        return obj;
    }

    public /* synthetic */ ObservableSource c(File file, Object obj) throws Exception {
        int i2 = 2 % 2;
        int i3 = ar + 81;
        ao = i3 % 128;
        int i4 = i3 % 2;
        Observable<Boolean> observableC = c(this.f11776y, this.B, file);
        int i5 = ar + 111;
        ao = i5 % 128;
        if (i5 % 2 == 0) {
            return observableC;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ Boolean c(Boolean bool) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 93;
        ar = i3 % 128;
        if (i3 % 2 != 0) {
            t();
            int i4 = ar + 109;
            ao = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 47 / 0;
            }
            return bool;
        }
        t();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void b(Boolean bool) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 33;
        ar = i3 % 128;
        int i4 = i3 % 2;
        y();
        int i5 = ar + 99;
        ao = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void b(Throwable th, Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ar + 43;
        ao = i3 % 128;
        int i4 = i3 % 2;
        c(th);
        int i5 = ao + 91;
        ar = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ void i(final Throwable th) throws Exception {
        int i2 = 2 % 2;
        Timber.e(th, "Couldn't do upload", new Object[0]);
        if (com.incode.welcome_sdk.commons.httpinterceptors.e.c(this.f11766o.getContext())) {
            this.f11767p.add(Single.timer(500L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda55
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.b(th, (Long) obj);
                }
            }, new BaseValidationPresenter$$ExternalSyntheticLambda52()));
            return;
        }
        int i3 = ao + 109;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11766o.showNoNetworkMessage();
            int i4 = 47 / 0;
        } else {
            this.f11766o.showNoNetworkMessage();
        }
        int i5 = ao + 115;
        ar = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void d(final File file) {
        int i2 = 2 % 2;
        int i3 = ao + 115;
        ar = i3 % 128;
        int i4 = i3 % 2;
        this.f11767p.add(Observable.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda12
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.B();
            }
        }).subscribeOn(AndroidSchedulers.mainThread()).observeOn(AndroidSchedulers.mainThread()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda13
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.c(file, obj);
            }
        }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda14
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.c((Boolean) obj);
            }
        }).delay(this.R, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda15
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.b((Boolean) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda16
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.i((Throwable) obj);
            }
        }));
        int i5 = ar + 35;
        ao = i5 % 128;
        int i6 = i5 % 2;
    }

    private void p() {
        int i2 = 2 % 2;
        int i3 = ao + 3;
        ar = i3 % 128;
        int i4 = i3 % 2;
        CompositeDisposable compositeDisposable = this.f11767p;
        Single<Boolean> singleOnErrorReturnItem = isDeviceEnvironmentSafe(false).subscribeOn(Schedulers.io()).doOnError(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda53
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                this.f$0.handleUnsafeEnvironment((Throwable) obj);
            }
        }).onErrorReturnItem(Boolean.FALSE);
        final BehaviorSubject<Boolean> behaviorSubject = this.ak;
        Objects.requireNonNull(behaviorSubject);
        compositeDisposable.add(singleOnErrorReturnItem.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda54
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                behaviorSubject.onNext((Boolean) obj);
            }
        }, new BaseValidationPresenter$$ExternalSyntheticLambda52()));
        int i5 = ao + 29;
        ar = i5 % 128;
        int i6 = i5 % 2;
    }

    public void handleUnsafeEnvironment(Throwable th) {
        int i2 = 2 % 2;
        int i3 = ao + 41;
        ar = i3 % 128;
        int i4 = i3 % 2;
        Timber.d("Handle unsafe environment", new Object[0]);
        this.f11777z.error = th;
        this.f11777z.resultCode = ResultCode.ERROR;
        int i5 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
        if (i5 != 1 && i5 != 2) {
            if (i5 == 3) {
                publishResultOnModuleBus(new DocumentValidationResult(ResultCode.ERROR, th));
                int i6 = ar + 125;
                ao = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            if (i5 != 4) {
                Timber.d("Unknown IdValidationPhase", new Object[0]);
                int i8 = ar + 37;
                ao = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
        }
        publishResult(this.f11777z);
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onIdealCaptureEnvironmentFound() {
        int i2 = 2 % 2;
        int i3 = ao + 85;
        ar = i3 % 128;
        if (i3 % 2 != 0) {
            this.al.onNext(Boolean.TRUE);
            int i4 = ao + 15;
            ar = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 73 / 0;
                return;
            }
            return;
        }
        this.al.onNext(Boolean.TRUE);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter
    public void saveUnsafeEnvironmentResult(int i2) {
        int i3 = 2 % 2;
        int i4 = ao + 121;
        ar = i4 % 128;
        if (i4 % 2 == 0) {
            this.f11777z.idealCaptureEnvironmentTestResult = Integer.valueOf(i2);
            int i5 = 19 / 0;
        } else {
            this.f11777z.idealCaptureEnvironmentTestResult = Integer.valueOf(i2);
        }
        int i6 = ao + 13;
        ar = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void c(int r4, com.incode.welcome_sdk.data.remote.d r5) throws java.lang.Exception {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r1 = r0 + 81
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L3b
            r0 = 30
            int r0 = r0 / 0
            if (r5 == 0) goto L2b
        L14:
            int r0 = r5.f10119a
            if (r0 != r4) goto L2b
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 49
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r2
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract$View r1 = r3.f11766o
            int r0 = r5.f10120d
            int r0 = r0 / r2
            int r0 = r0 + 50
            r1.setUploadProgress(r0)
        L2b:
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r1 = r0 + 37
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L3a
            r0 = 8
            int r0 = r0 / 0
        L3a:
            return
        L3b:
            if (r5 == 0) goto L2b
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.c(int, com.incode.welcome_sdk.data.remote.d):void");
    }

    private Observable<Boolean> c(ValidationPhase validationPhase, DocumentType documentType, File file) {
        int i2 = 2 % 2;
        int i3 = ar + 37;
        ao = i3 % 128;
        int i4 = i3 % 2;
        this.f11766o.setUploadProgress(0);
        this.f11766o.onUploadStarted(validationPhase);
        j.b bVar = new j.b() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda41
            @Override // com.incode.welcome_sdk.data.remote.j.b
            public final void onRequestProgress(long j2, long j3) {
                this.f$0.d(j2, j3);
            }
        };
        final int iRandom = ((int) (Math.random() * 1000.0d)) + 1;
        this.f11767p.add(this.E.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda42
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.c(iRandom, (d) obj);
            }
        }, new BaseValidationPresenter$$ExternalSyntheticLambda52()));
        Function0<bt> function0B = b(file, iRandom, bVar);
        int i5 = AnonymousClass4.f11781e[validationPhase.ordinal()];
        if (i5 == 1) {
            Object[] objArr = {this, function0B.invoke(), o.VOTER_IDENTIFICATION};
            int iA = ApproveActivity.e.a();
            int iA2 = ApproveActivity.e.a();
            return (Observable) d(478905526, ApproveActivity.e.a(), ApproveActivity.e.a(), iA, -478905514, objArr, iA2);
        }
        if (i5 == 2) {
            return c(function0B.invoke());
        }
        if (i5 == 3) {
            Object[] objArr2 = {this, documentType, file, bVar, Integer.valueOf(iRandom)};
            int iA3 = ApproveActivity.e.a();
            int iA4 = ApproveActivity.e.a();
            return (Observable) d(-1079155756, ApproveActivity.e.a(), ApproveActivity.e.a(), iA3, 1079155760, objArr2, iA4);
        }
        if (i5 == 4) {
            Object[] objArr3 = {this, function0B.invoke(), o.PASSPORT};
            int iA5 = ApproveActivity.e.a();
            int iA6 = ApproveActivity.e.a();
            return (Observable) d(478905526, ApproveActivity.e.a(), ApproveActivity.e.a(), iA5, -478905514, objArr3, iA6);
        }
        Observable<Boolean> observableError = Observable.error(new Exception("Unknown IdValidationPhase"));
        int i6 = ao + 51;
        ar = i6 % 128;
        if (i6 % 2 != 0) {
            return observableError;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private kotlin.jvm.functions.Function0<com.incode.welcome_sdk.data.remote.beans.bt> b(final java.io.File r7, final int r8, final com.incode.welcome_sdk.data.remote.j.b r9) {
        /*
            r6 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r2
            boolean r0 = r6.isManualCaptureMode()
            if (r0 == 0) goto L5a
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 49
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r2
            r5 = 0
            if (r1 != 0) goto L55
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$IdValidationResult r1 = r6.f11760h
            r0 = 4
            int r0 = r0 / r5
            if (r1 == 0) goto L3d
        L24:
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$IdValidationResult r0 = r6.f11760h
            com.incode.recogkitandroid.IdCaptureKitAndroid$Result r0 = r0.f11786c
            if (r0 == 0) goto L3d
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r0
            int r1 = r1 % r2
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$IdValidationResult r0 = r6.f11760h
            com.incode.recogkitandroid.IdCaptureKitAndroid$Result r0 = r0.f11786c
            float r0 = r0.glare
            int r5 = b(r0)
        L3d:
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r2
        L46:
            boolean r0 = r6.ag
            r6.fillInMetadata(r0)
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda34 r0 = new com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda34
            r1 = r6
            r4 = r9
            r3 = r8
            r2 = r7
            r0.<init>()
            return r0
        L55:
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$IdValidationResult r0 = r6.f11760h
            if (r0 == 0) goto L3d
            goto L24
        L5a:
            float r0 = r6.am
            int r5 = b(r0)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.b(java.io.File, int, com.incode.welcome_sdk.data.remote.j$b):kotlin.jvm.functions.Function0");
    }

    public /* synthetic */ bt d(File file, int i2, j.b bVar, int i3) {
        return new bt(file, this.U, isIdAutoCaptureEnabled() ? com.incode.welcome_sdk.data.remote.beans.f.AUTO : com.incode.welcome_sdk.data.remote.beans.f.MANUAL, i2, bVar, r() ? Integer.valueOf(i3) : null, this.f11267g.c());
    }

    private static int b(float f2) {
        int i2 = 2 % 2;
        int i3 = ao + 3;
        ar = i3 % 128;
        return i3 % 2 == 0 ? (int) ((f2 * 2.0f) + 100.0f) : (int) ((1.0f - f2) * 100.0f);
    }

    private boolean r() {
        boolean zIsFeatureConfigEnabledForType;
        int i2 = 2 % 2;
        int i3 = ao + 113;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            zIsFeatureConfigEnabledForType = this.ah.getInternalConfig().isFeatureConfigEnabledForType(com.incode.welcome_sdk.data.e.f7632b);
            int i4 = 91 / 0;
        } else {
            zIsFeatureConfigEnabledForType = this.ah.getInternalConfig().isFeatureConfigEnabledForType(com.incode.welcome_sdk.data.e.f7632b);
        }
        int i5 = ao + 95;
        ar = i5 % 128;
        if (i5 % 2 != 0) {
            return zIsFeatureConfigEnabledForType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object m(Object[] objArr) {
        final BaseValidationPresenter baseValidationPresenter = (BaseValidationPresenter) objArr[0];
        final bt btVar = (bt) objArr[1];
        final o oVar = (o) objArr[2];
        int i2 = 2 % 2;
        int i3 = ar + 71;
        ao = i3 % 128;
        int i4 = i3 % 2;
        baseValidationPresenter.f11777z.idImagePath = btVar.b().getPath();
        baseValidationPresenter.f11777z.idImageBase64 = BitmapUtils.getBase64FromBitmap(BitmapUtils.getBitmapFromFile(btVar.b()));
        baseValidationPresenter.f11777z.idCategory = btVar.d();
        Observable observableObserveOn = baseValidationPresenter.f11764m.sendFrontIdScan(btVar).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda35
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.e(oVar, (bc) obj);
            }
        }).onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda36
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b((Throwable) obj);
            }
        }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda37
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.c((bc) obj);
            }
        }).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda38
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b(btVar, (Boolean) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        int i5 = ao + 109;
        ar = i5 % 128;
        if (i5 % 2 != 0) {
            return observableObserveOn;
        }
        throw null;
    }

    public /* synthetic */ void e(o oVar, bc bcVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = ar + 35;
        ao = i3 % 128;
        int i4 = i3 % 2;
        d(bcVar);
        getRepository().setSkipGlareBackId(bcVar.l());
        Object obj = null;
        if (!bcVar.d()) {
            int i5 = ao + 83;
            ar = i5 % 128;
            if (i5 % 2 == 0) {
                bcVar.g();
                throw null;
            }
            String strG = bcVar.g();
            if (strG == null) {
                throw Exceptions.propagate(new com.incode.welcome_sdk.data.remote.b.d(oVar));
            }
            Object[] objArr = new Object[1];
            at("\uf717\uf75e꼚෮Ậ湕\udf86ゆ훰쨄☇ៅ磒\ueed6ﻛ漡ꀌꘕ뚂Ꝿ\ue876繊躦ﺷ", ExpandableListView.getPackedPositionGroup(0L), objArr);
            if (strG.equalsIgnoreCase(((String) objArr[0]).intern())) {
                throw Exceptions.propagate(new a());
            }
            Object[] objArr2 = new Object[1];
            at("侫俼穦원쯆ꕻ\uece9蠤\u0383辰\ued38⒠쁸㮱㗩屒ᢽ獸綳鐌僂ꬰ䖑", View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
            if (!strG.equalsIgnoreCase(((String) objArr2[0]).intern())) {
                throw Exceptions.propagate(new com.incode.welcome_sdk.data.remote.b.d(oVar));
            }
            throw Exceptions.propagate(new g());
        }
        if (!bcVar.m()) {
            int i6 = ar + 13;
            ao = i6 % 128;
            if (i6 % 2 == 0 ? bcVar.b() < 20 : bcVar.b() < 79) {
                throw Exceptions.propagate(new i());
            }
        }
        if (bcVar.a() < 20) {
            throw Exceptions.propagate(new com.incode.welcome_sdk.data.remote.b.j());
        }
        if (bcVar.f9401e > 1.0d) {
            throw Exceptions.propagate(new com.incode.welcome_sdk.data.remote.b.f());
        }
        if (!bcVar.e()) {
            throw Exceptions.propagate(new com.incode.welcome_sdk.data.remote.b.c());
        }
        this.Y++;
        com.incode.welcome_sdk.data.remote.beans.d dVarI = bcVar.i();
        if (dVarI.e()) {
            int i7 = ar + 1;
            ao = i7 % 128;
            int i8 = i7 % 2;
            CompositeDisposable compositeDisposable = this.f11767p;
            Observable<z> observableObserveOn = this.f11764m.fetchBiometricConsent(dVarI.a()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            final IncodeWelcome incodeWelcome = IncodeWelcome.getInstance();
            Objects.requireNonNull(incodeWelcome);
            compositeDisposable.add(observableObserveOn.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    incodeWelcome.setBiometricConsentContent((z) obj2);
                }
            }, new BaseValidationPresenter$$ExternalSyntheticLambda52()));
        }
        int i9 = ao + 35;
        ar = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ObservableSource d(h hVar, ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 29;
        ar = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Observable.error(hVar);
            obj.hashCode();
            throw null;
        }
        Observable observableError = Observable.error(hVar);
        int i4 = ao + 67;
        ar = i4 % 128;
        if (i4 % 2 != 0) {
            return observableError;
        }
        throw null;
    }

    public /* synthetic */ ObservableSource b(Throwable th) throws Exception {
        int i2 = 2 % 2;
        if (com.incode.welcome_sdk.commons.httpinterceptors.e.c(this.f11766o.getContext())) {
            this.Y++;
        }
        if (this.Y >= this.Z) {
            final h hVar = new h();
            if (th.getCause() != null) {
                if (!(th.getCause() instanceof com.incode.welcome_sdk.data.remote.b.d)) {
                    if (!(th.getCause() instanceof i)) {
                        if (th.getCause() instanceof com.incode.welcome_sdk.data.remote.b.j) {
                            int i3 = ao + 91;
                            ar = i3 % 128;
                            if (i3 % 2 == 0) {
                                hVar.c(2);
                            } else {
                                hVar.c(4);
                            }
                        }
                    } else {
                        int i4 = ao + 25;
                        ar = i4 % 128;
                        int i5 = i4 % 2;
                        hVar.c(3);
                    }
                } else {
                    int i6 = ar + 47;
                    ao = i6 % 128;
                    int i7 = i6 % 2;
                    hVar.c(1);
                }
            } else if (th instanceof b) {
                int i8 = ar + 111;
                ao = i8 % 128;
                if (i8 % 2 == 0) {
                    hVar.c(((b) th).c());
                } else {
                    hVar.c(((b) th).c());
                    throw null;
                }
            }
            return this.f11764m.setManualIdCheckNeeded(true).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda56
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return BaseValidationPresenter.d(hVar, (ResponseSuccess) obj);
                }
            });
        }
        if (th.getCause() != null) {
            return Observable.error(th.getCause());
        }
        return Observable.error(th);
    }

    public /* synthetic */ Boolean c(bc bcVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 49;
        ar = i3 % 128;
        int i4 = i3 % 2;
        d(bcVar);
        Boolean bool = Boolean.TRUE;
        int i5 = ar + 73;
        ao = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object k(Object[] objArr) {
        BaseValidationPresenter baseValidationPresenter = (BaseValidationPresenter) objArr[0];
        bt btVar = (bt) objArr[1];
        ResponseGetImages responseGetImages = (ResponseGetImages) objArr[2];
        int i2 = 2 % 2;
        int i3 = ar + 79;
        ao = i3 % 128;
        int i4 = i3 % 2;
        baseValidationPresenter.f11777z.croppedFacePath = baseValidationPresenter.f11764m.saveFaceCrop(responseGetImages.getImage(ImageType.croppedIDFace), btVar.f9564a);
        Boolean bool = Boolean.TRUE;
        int i5 = ao + 25;
        ar = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ObservableSource b(final bt btVar, Boolean bool) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 1;
        ar = i3 % 128;
        if (i3 % 2 != 0) {
            EventUtils.sendEvent(getRepository(), Event.FRONT_ID_UPLOAD_SUCCEEDED, Modules.ID, k());
            if (this.f11768q.isDownloadImagesEnabled()) {
                return this.f11764m.getImages(new ImageType[]{ImageType.croppedIDFace}, btVar.f9564a).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda0
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return this.f$0.a(btVar, (ResponseGetImages) obj);
                    }
                });
            }
            Observable observableJust = Observable.just(Boolean.TRUE);
            int i4 = ao + 81;
            ar = i4 % 128;
            int i5 = i4 % 2;
            return observableJust;
        }
        EventUtils.sendEvent(getRepository(), Event.FRONT_ID_UPLOAD_SUCCEEDED, Modules.ID, k());
        this.f11768q.isDownloadImagesEnabled();
        throw null;
    }

    private Observable<Boolean> c(bt btVar) {
        int i2 = 2 % 2;
        int i3 = ao + 17;
        ar = i3 % 128;
        int i4 = i3 % 2;
        this.f11777z.idImagePath = btVar.b().getPath();
        this.f11777z.idImageBase64 = BitmapUtils.getBase64FromBitmap(BitmapUtils.getBitmapFromFile(btVar.b()));
        this.f11777z.idCategory = btVar.d();
        Observable<Boolean> observableObserveOn = this.f11764m.sendBackIdScan(btVar).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.a((bc) obj);
            }
        }).onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda22
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.a((Throwable) obj);
            }
        }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda33
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b((bc) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        int i5 = ar + 107;
        ao = i5 % 128;
        int i6 = i5 % 2;
        return observableObserveOn;
    }

    public /* synthetic */ void a(bc bcVar) throws Exception {
        int i2 = 2 % 2;
        d(bcVar);
        if (!bcVar.d()) {
            String strG = bcVar.g();
            if (strG == null) {
                throw Exceptions.propagate(new com.incode.welcome_sdk.data.remote.b.d(o.VOTER_IDENTIFICATION));
            }
            int i3 = ar + 21;
            ao = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            at("\uf717\uf75e꼚෮Ậ湕\udf86ゆ훰쨄☇ៅ磒\ueed6ﻛ漡ꀌꘕ뚂Ꝿ\ue876繊躦ﺷ", Color.alpha(0), objArr);
            if (strG.equalsIgnoreCase(((String) objArr[0]).intern())) {
                throw Exceptions.propagate(new a());
            }
            Object[] objArr2 = new Object[1];
            at("侫俼穦원쯆ꕻ\uece9蠤\u0383辰\ued38⒠쁸㮱㗩屒ᢽ獸綳鐌僂ꬰ䖑", View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
            if (!strG.equalsIgnoreCase(((String) objArr2[0]).intern())) {
                throw Exceptions.propagate(new com.incode.welcome_sdk.data.remote.b.d(o.VOTER_IDENTIFICATION));
            }
            throw Exceptions.propagate(new g());
        }
        if (!bcVar.l()) {
            int i5 = ao + 107;
            ar = i5 % 128;
            int i6 = i5 % 2;
            if (bcVar.b() < 20) {
                throw Exceptions.propagate(new i());
            }
        }
        if (bcVar.a() < 20) {
            throw Exceptions.propagate(new com.incode.welcome_sdk.data.remote.b.j());
        }
        if (bcVar.f9401e > 1.0d) {
            throw Exceptions.propagate(new com.incode.welcome_sdk.data.remote.b.f());
        }
        if (!bcVar.e()) {
            throw Exceptions.propagate(new com.incode.welcome_sdk.data.remote.b.c());
        }
        this.ac++;
        int i7 = ar + 85;
        ao = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 50 / 0;
        }
    }

    private static /* synthetic */ Object o(Object[] objArr) {
        h hVar = (h) objArr[0];
        int i2 = 2 % 2;
        int i3 = ar + 79;
        ao = i3 % 128;
        if (i3 % 2 == 0) {
            return Observable.error(hVar);
        }
        Observable.error(hVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object q(java.lang.Object[] r8) {
        /*
            r7 = 0
            r4 = r8[r7]
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter r4 = (com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter) r4
            r3 = 1
            r5 = r8[r3]
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r6 = 2
            int r0 = r6 % r6
            int r1 = r4.ac
            int r1 = r1 + r3
            r4.ac = r1
            int r0 = r4.Z
            if (r1 < r0) goto L7a
            com.incode.welcome_sdk.data.remote.b.h r2 = new com.incode.welcome_sdk.data.remote.b.h
            r2.<init>()
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L4e
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 93
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r6
            if (r1 != 0) goto L6d
            java.lang.Throwable r0 = r5.getCause()
            boolean r1 = r0 instanceof com.incode.welcome_sdk.data.remote.b.d
            r0 = 69
            int r0 = r0 / r7
            if (r1 == r3) goto L76
        L37:
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof com.incode.welcome_sdk.data.remote.b.j
            if (r0 == 0) goto L60
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r1 = r0 + 45
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L5e
            r0 = 5
        L4b:
            r2.c(r0)
        L4e:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r4.f11764m
            io.reactivex.Observable r1 = r0.setManualIdCheckNeeded(r3)
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda29 r0 = new com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda29
            r0.<init>()
            io.reactivex.Observable r0 = r1.flatMap(r0)
            return r0
        L5e:
            r0 = 4
            goto L4b
        L60:
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof com.incode.welcome_sdk.data.remote.b.i
            if (r0 == 0) goto L4e
            r0 = 3
            r2.c(r0)
            goto L4e
        L6d:
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof com.incode.welcome_sdk.data.remote.b.d
            if (r0 == r3) goto L76
            goto L37
        L76:
            r2.c(r3)
            goto L4e
        L7a:
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L96
            java.lang.Throwable r0 = r5.getCause()
            io.reactivex.Observable r2 = io.reactivex.Observable.error(r0)
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r1 = r0 + 27
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r0
            int r1 = r1 % r6
            if (r1 != 0) goto L94
            return r2
        L94:
            r0 = 0
            throw r0
        L96:
            io.reactivex.Observable r2 = io.reactivex.Observable.error(r5)
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao = r0
            int r1 = r1 % r6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.q(java.lang.Object[]):java.lang.Object");
    }

    public /* synthetic */ Boolean b(bc bcVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = ar + 59;
        ao = i3 % 128;
        if (i3 % 2 == 0) {
            EventUtils.sendEvent(getRepository(), Event.BACK_ID_UPLOAD_SUCCEEDED, Modules.ID, k());
            d(bcVar);
            return Boolean.TRUE;
        }
        EventUtils.sendEvent(getRepository(), Event.BACK_ID_UPLOAD_SUCCEEDED, Modules.ID, k());
        d(bcVar);
        Boolean bool = Boolean.TRUE;
        throw null;
    }

    private void d(bc bcVar) {
        int i2 = 2 % 2;
        int i3 = ao + 57;
        ar = i3 % 128;
        int i4 = i3 % 2;
        this.f11777z.classifiedIdType = bcVar.f9398b;
        this.f11777z.issueName = bcVar.c();
        this.f11777z.issueYear = Integer.valueOf(bcVar.f());
        IdScanResult idScanResult = this.f11777z;
        int iE = BaseValidationPresenter_Factory.e();
        int iE2 = BaseValidationPresenter_Factory.e();
        idScanResult.countryCode = (String) bc.e(BaseValidationPresenter_Factory.e(), new Object[]{bcVar}, -210598799, BaseValidationPresenter_Factory.e(), iE, 210598801, iE2);
        this.f11777z.failReason = bcVar.g();
        this.f11777z.skipBackIdCapture = bcVar.j();
        int i5 = ar + 83;
        ao = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public IdScanResult getIdScanResult() {
        int i2 = 2 % 2;
        int i3 = ao + 115;
        int i4 = i3 % 128;
        ar = i4;
        int i5 = i3 % 2;
        IdScanResult idScanResult = this.f11777z;
        int i6 = i4 + 27;
        ao = i6 % 128;
        int i7 = i6 % 2;
        return idScanResult;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        final BaseValidationPresenter baseValidationPresenter = (BaseValidationPresenter) objArr[0];
        final DocumentType documentType = (DocumentType) objArr[1];
        File file = (File) objArr[2];
        j.b bVar = (j.b) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i2 = 2 % 2;
        int i3 = ao + 85;
        ar = i3 % 128;
        int i4 = i3 % 2;
        baseValidationPresenter.G.documentPath = file.getPath();
        Observable observableObserveOn = baseValidationPresenter.f11764m.sendDocumentScan(documentType, file, baseValidationPresenter.v(), bVar, iIntValue).observeOn(Schedulers.io()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda21
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.d(documentType, (ResponseSuccess) obj);
            }
        }).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends R>>) new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda23
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.d((Throwable) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        int i5 = ar + 101;
        ao = i5 % 128;
        if (i5 % 2 == 0) {
            return observableObserveOn;
        }
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$4 */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a */
        private static int f11778a = 1;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f11779c;

        /* JADX INFO: renamed from: d */
        private static int f11780d = 0;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f11781e;

        static {
            int[] iArr = new int[DocumentType.values().length];
            f11779c = iArr;
            try {
                iArr[DocumentType.ADDRESS_STATEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11779c[DocumentType.MEDICAL_DOC.ordinal()] = 2;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11779c[DocumentType.PAYMENT_PROOF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11779c[DocumentType.OTHER_DOCUMENT_1.ordinal()] = 4;
                int i3 = f11780d + 35;
                f11778a = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11779c[DocumentType.OTHER_DOCUMENT_2.ordinal()] = 5;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11779c[DocumentType.OTHER_DOCUMENT_3.ordinal()] = 6;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ValidationPhase.values().length];
            f11781e = iArr2;
            try {
                iArr2[ValidationPhase.SCAN_ID_FRONT.ordinal()] = 1;
                int i7 = f11780d + 55;
                f11778a = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11781e[ValidationPhase.SCAN_ID_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11781e[ValidationPhase.SCAN_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11781e[ValidationPhase.SCAN_PASSPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public /* synthetic */ ObservableSource b(ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 79;
        ar = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = this.f11764m;
        ObservableSource map = incodeWelcomeRepository.fetchOCRData(incodeWelcomeRepository.getToken()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda30
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.a((ResponseOCRData) obj);
            }
        });
        int i5 = ao + 73;
        ar = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ Boolean a(ResponseOCRData responseOCRData) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 3;
        ar = i3 % 128;
        if (i3 % 2 != 0) {
            this.G.setResult(DocumentType.ADDRESS_STATEMENT, responseOCRData);
            return Boolean.TRUE;
        }
        this.G.setResult(DocumentType.ADDRESS_STATEMENT, responseOCRData);
        Boolean bool = Boolean.TRUE;
        throw null;
    }

    public /* synthetic */ void c(ResponseMedicalDoc responseMedicalDoc) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 63;
        ar = i3 % 128;
        int i4 = i3 % 2;
        this.G.setResult(DocumentType.MEDICAL_DOC, responseMedicalDoc);
        int i5 = ar + 25;
        ao = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object j(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = ao + 1;
        ar = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = Boolean.TRUE;
        int i5 = ar + 13;
        ao = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public /* synthetic */ ObservableSource d(DocumentType documentType, ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = ao + 47;
        ar = i3 % 128;
        if (i3 % 2 != 0) {
            if (!responseSuccess.isSuccess()) {
                return Observable.error(new com.incode.welcome_sdk.data.remote.b.d(o.ADDRESS_STATEMENT));
            }
            EventUtils.sendEvent(getRepository(), Event.DOCUMENT_UPLOAD_SUCCEEDED, Modules.DOCUMENT_CAPTURE, k());
            this.aa++;
            switch (AnonymousClass4.f11779c[documentType.ordinal()]) {
                case 1:
                    return this.f11764m.processAddressStatement().filter(new BaseValidationPresenter$$ExternalSyntheticLambda25()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda26
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            return this.f$0.b((ResponseSuccess) obj);
                        }
                    }).defaultIfEmpty(Boolean.FALSE);
                case 2:
                    return this.f11764m.processMedicalDoc().doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda27
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) throws Exception {
                            this.f$0.c((ResponseMedicalDoc) obj);
                        }
                    }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda28
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            return BaseValidationPresenter.b((ResponseMedicalDoc) obj);
                        }
                    });
                case 3:
                case 4:
                case 5:
                case 6:
                    Observable observableJust = Observable.just(Boolean.TRUE);
                    int i4 = ao + 37;
                    ar = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 87 / 0;
                    }
                    return observableJust;
                default:
                    return Observable.just(Boolean.FALSE);
            }
        }
        responseSuccess.isSuccess();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0014, code lost:
    
        if (r1 >= r4.Z) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0016, code lost:
    
        r4.ah.getOcrDataBus().onNext(com.incode.welcome_sdk.IncodeWelcome.OCRData.createEmpty());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        return io.reactivex.Observable.error(new com.incode.welcome_sdk.data.remote.b.h());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r1 >= r4.Z) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        r2 = io.reactivex.Observable.error(r5);
        r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao + 57;
        com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ io.reactivex.ObservableSource d(java.lang.Throwable r5) throws java.lang.Exception {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L2d
            int r1 = r4.aa
            r4.aa = r1
            int r0 = r4.Z
            if (r1 < r0) goto L38
        L16:
            com.incode.welcome_sdk.IncodeWelcome r0 = r4.ah
            io.reactivex.subjects.PublishSubject r1 = r0.getOcrDataBus()
            com.incode.welcome_sdk.IncodeWelcome$OCRData r0 = com.incode.welcome_sdk.IncodeWelcome.OCRData.createEmpty()
            r1.onNext(r0)
            com.incode.welcome_sdk.data.remote.b.h r0 = new com.incode.welcome_sdk.data.remote.b.h
            r0.<init>()
            io.reactivex.Observable r0 = io.reactivex.Observable.error(r0)
            return r0
        L2d:
            int r0 = r4.aa
            int r1 = r0 + 1
            r4.aa = r1
            int r0 = r4.Z
            if (r1 < r0) goto L38
            goto L16
        L38:
            io.reactivex.Observable r2 = io.reactivex.Observable.error(r5)
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.d(java.lang.Throwable):io.reactivex.ObservableSource");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void y() {
        /*
            r6 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 9
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r3
            r5 = 4
            r4 = 3
            r2 = 1
            if (r1 != 0) goto L28
            com.incode.welcome_sdk.results.IdScanResult r0 = r6.f11777z
            r0.scanStatus = r2
            int[] r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.AnonymousClass4.f11781e
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = r6.f11776y
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L88
            if (r0 == r3) goto L7b
            if (r0 == r4) goto L40
            if (r0 == r5) goto L88
        L27:
            return
        L28:
            com.incode.welcome_sdk.results.IdScanResult r1 = r6.f11777z
            r0 = 0
            r1.scanStatus = r0
            int[] r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.AnonymousClass4.f11781e
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = r6.f11776y
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L88
            if (r0 == r3) goto L7b
            if (r0 == r4) goto L40
            if (r0 == r5) goto L88
            goto L27
        L40:
            com.incode.welcome_sdk.results.DocumentValidationResult r1 = r6.G
            com.incode.welcome_sdk.results.ResultCode r0 = com.incode.welcome_sdk.results.ResultCode.SUCCESS
            r1.resultCode = r0
            boolean r0 = r6.f11763l
            if (r0 != 0) goto L69
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ao
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.ar = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L79
            boolean r0 = r6.f11765n
            if (r0 == r2) goto L69
        L59:
            com.incode.welcome_sdk.results.DocumentValidationResult r1 = r6.G
            java.lang.String r0 = r6.v()
            r1.mimeType = r0
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract$View r1 = r6.f11766o
            com.incode.welcome_sdk.results.DocumentValidationResult r0 = r6.G
            r1.onDocumentValidationCompleted(r0)
            goto L27
        L69:
            com.incode.welcome_sdk.IncodeWelcome r0 = com.incode.welcome_sdk.IncodeWelcome.getInstance()
            io.reactivex.subjects.PublishSubject r1 = r0.getOcrDataBus()
            com.incode.welcome_sdk.IncodeWelcome$OCRData r0 = com.incode.welcome_sdk.IncodeWelcome.OCRData.createEmpty()
            r1.onNext(r0)
            goto L59
        L79:
            r0 = 0
            throw r0
        L7b:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r1 = r6.f11764m
            com.incode.welcome_sdk.results.IdScanResult r0 = r6.f11777z
            r1.persistIdBackResult(r0)
            com.incode.welcome_sdk.results.IdScanResult r0 = r6.f11777z
            r6.publishResult(r0)
            return
        L88:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r1 = r6.f11764m
            com.incode.welcome_sdk.results.IdScanResult r0 = r6.f11777z
            r1.persistIdFrontResult(r0)
            com.incode.welcome_sdk.results.IdScanResult r0 = r6.f11777z
            r6.publishResult(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.y():void");
    }

    private String v() {
        int i2 = 2 % 2;
        int i3 = ar + 125;
        ao = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 50 / 0;
            if (!isPictureProvidedExternally()) {
                return ClipboardModule.MIMETYPE_JPEG;
            }
        } else if (!isPictureProvidedExternally()) {
            return ClipboardModule.MIMETYPE_JPEG;
        }
        String type = this.f11766o.getActivity().getContentResolver().getType(this.A);
        int i5 = ar + 1;
        ao = i5 % 128;
        int i6 = i5 % 2;
        return type;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.Presenter
    public void skipCurrentPhase() {
        int i2 = 2 % 2;
        int i3 = ao + 109;
        ar = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                this.f11764m.persistIdBackResult(this.f11777z);
                publishResult(this.f11777z);
                return;
            }
            if (i5 == 3) {
                this.G.resultCode = ResultCode.USER_CANCELLED;
                if (this.f11763l) {
                    int i6 = ar + 33;
                    ao = i6 % 128;
                    int i7 = i6 % 2;
                    this.ah.getOcrDataBus().onNext(IncodeWelcome.OCRData.createEmpty());
                }
                this.f11766o.onDocumentValidationCompleted(this.G);
                return;
            }
            if (i5 != 4) {
                return;
            }
        }
        this.f11764m.persistIdFrontResult(this.f11777z);
        publishResult(this.f11777z);
    }

    public static ValidationPhase getIdValidationPhaseFromIntent(Intent intent) {
        int i2 = 2 % 2;
        int i3 = ao + 15;
        ar = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            ValidationPhase validationPhase = (ValidationPhase) intent.getSerializableExtra("extraIdValidationPhase");
            if (validationPhase != null) {
                return validationPhase;
            }
            ValidationPhase validationPhase2 = ValidationPhase.SCAN_ID_FRONT;
            int i4 = ao + 55;
            ar = i4 % 128;
            if (i4 % 2 != 0) {
                return validationPhase2;
            }
            obj.hashCode();
            throw null;
        }
        throw null;
    }

    public static float getFrameScore(IdCaptureKitAndroid.Result result) {
        int i2 = 2 % 2;
        if (result.cls < 0.98f) {
            return 0.0f;
        }
        if (!(!IdCaptureChecksGate.useBarcodeAndTextReadabilityAlgorithm())) {
            if (result.barcodePass) {
                int i3 = ao + 43;
                ar = i3 % 128;
                int i4 = i3 % 2;
                if (result.textPass) {
                    int i5 = ar + 23;
                    ao = i5 % 128;
                    int i6 = i5 % 2;
                    return 1.0f;
                }
            }
            return 0.0f;
        }
        IncodeWelcome.InternalConfig internalConfig = IncodeWelcome.getInstance().getInternalConfig();
        if (result.blur > internalConfig.getIdBlurThreshold()) {
            return 0.0f;
        }
        if (result.glare > internalConfig.getIdGlareThreshold()) {
            int i7 = ar + 3;
            ao = i7 % 128;
            if (i7 % 2 == 0) {
                return 0.0f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f2 = result.cls;
        float f3 = 1.0f / (result.blur + 1.0f);
        float f4 = 1.0f / (result.glare + 1.0f);
        float f5 = f2 + f3 + f4;
        Timber.d("getFrameScore() cls: %s, blur: %s, glare: %s, component1: %s, component2: %s, component3: %s, total: %s", Float.valueOf(result.cls), Float.valueOf(result.blur), Float.valueOf(result.glare), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5));
        int i8 = ao + 37;
        ar = i8 % 128;
        int i9 = i8 % 2;
        return f5;
    }

    public static class IdValidationResult {

        /* JADX INFO: renamed from: e */
        private static int f11782e = 0;

        /* JADX INFO: renamed from: h */
        private static int f11783h = 1;

        /* JADX INFO: renamed from: a */
        public ValidationState f11784a;

        /* JADX INFO: renamed from: b */
        float f11785b;

        /* JADX INFO: renamed from: c */
        IdCaptureKitAndroid.Result f11786c;

        /* JADX INFO: renamed from: d */
        Bitmap f11787d;

        public String toString() {
            Float fValueOf;
            Float fValueOf2;
            int i2 = 2 % 2;
            StringBuilder sbAppend = new StringBuilder("IdValidationResult{bitmap=").append(this.f11787d).append(", idValidationState=").append(this.f11784a).append(", cls=");
            IdCaptureKitAndroid.Result result = this.f11786c;
            if (result != null) {
                fValueOf = Float.valueOf(result.cls);
            } else {
                int i3 = f11782e + 123;
                f11783h = i3 % 128;
                int i4 = i3 % 2;
                fValueOf = null;
            }
            StringBuilder sbAppend2 = sbAppend.append(fValueOf).append(", quad=");
            IdCaptureKitAndroid.Result result2 = this.f11786c;
            StringBuilder sbAppend3 = sbAppend2.append(result2 != null ? Arrays.toString(result2.quad) : null).append(", blur=");
            IdCaptureKitAndroid.Result result3 = this.f11786c;
            if (result3 != null) {
                fValueOf2 = Float.valueOf(result3.blur);
                int i5 = f11783h + 43;
                f11782e = i5 % 128;
                int i6 = i5 % 2;
            } else {
                int i7 = f11783h + 85;
                f11782e = i7 % 128;
                int i8 = i7 % 2;
                fValueOf2 = null;
            }
            StringBuilder sbAppend4 = sbAppend3.append(fValueOf2).append(", glare=");
            IdCaptureKitAndroid.Result result4 = this.f11786c;
            StringBuilder sbAppend5 = sbAppend4.append(result4 != null ? Float.valueOf(result4.glare) : null).append(", side=");
            IdCaptureKitAndroid.Result result5 = this.f11786c;
            return sbAppend5.append(result5 != null ? result5.side : null).append(", frameScore=").append(this.f11785b).append(AbstractJsonLexerKt.END_OBJ).toString();
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        BaseValidationPresenter baseValidationPresenter = (BaseValidationPresenter) objArr[0];
        int i2 = 2 % 2;
        int i3 = ao + 45;
        ar = i3 % 128;
        int i4 = i3 % 2;
        baseValidationPresenter.u();
        int i5 = ar + 107;
        ao = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void e(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = ar + 97;
        ao = i3 % 128;
        int i4 = i3 % 2;
        u();
        int i5 = ar + 105;
        ao = i5 % 128;
        int i6 = i5 % 2;
    }

    private void x() {
        int i2 = 2 % 2;
        int i3 = ao + 99;
        ar = i3 % 128;
        int i4 = i3 % 2;
        if (this.ah.isTestMode()) {
            int i5 = ao + 109;
            ar = i5 % 128;
            int i6 = i5 % 2;
            this.f11767p.add(Observable.timer(2000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda9
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.d((Long) obj);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda10
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.e((Throwable) obj);
                }
            }));
        }
    }

    private void u() {
        int i2 = 2 % 2;
        int i3 = ar + 7;
        ao = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11777z.resultCode = ResultCode.EMULATOR_DETECTED;
            int i4 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
            if (i4 != 1 && i4 != 2) {
                if (i4 == 3) {
                    this.G.resultCode = ResultCode.EMULATOR_DETECTED;
                    this.ah.getOcrDataBus().onNext(IncodeWelcome.OCRData.createDummy());
                    this.f11766o.onDocumentValidationCompleted(this.G);
                    int i5 = ao + 31;
                    ar = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                if (i4 != 4) {
                    return;
                }
            }
            this.f11777z.scanStatus = 9;
            publishResult(this.f11777z);
            return;
        }
        this.f11777z.resultCode = ResultCode.EMULATOR_DETECTED;
        int i7 = AnonymousClass4.f11781e[this.f11776y.ordinal()];
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void w() {
        int i2 = 2 % 2;
        int i3 = ar + 53;
        ao = i3 % 128;
        if (i3 % 2 != 0) {
            ValidationPhase validationPhase = ValidationPhase.SCAN_DOCUMENT;
            throw null;
        }
        if (this.f11776y != ValidationPhase.SCAN_DOCUMENT) {
            SwitchCapture switchCaptureSwitchCaptureOf = SwitchCaptureKt.switchCaptureOf(this.f11776y, this.U, this.W);
            HashMap<String, Object> map = switchCaptureSwitchCaptureOf.toMap();
            map.put(EventValues.ERROR_STATES.getValue(), new JSONArray((Collection) this.Q));
            EventUtils.supportSendEvent(getRepository(), switchCaptureSwitchCaptureOf.getEventValue(), Modules.ID, map);
            int i4 = ar + 15;
            ao = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = ar + 7;
        ao = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getFrontIdScanAttemptsRemaining() {
        int i2 = 2 % 2;
        int i3 = ar + 47;
        ao = i3 % 128;
        int i4 = i3 % 2;
        int iMax = Math.max(this.Z - this.Y, 0);
        int i5 = ar + 63;
        ao = i5 % 128;
        if (i5 % 2 == 0) {
            return iMax;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getBackIdScanAttemptsRemaining() {
        int i2 = 2 % 2;
        int i3 = ao + 43;
        ar = i3 % 128;
        int i4 = i3 % 2;
        int iMax = Math.max(this.Z - this.ac, 0);
        int i5 = ar + 81;
        ao = i5 % 128;
        int i6 = i5 % 2;
        return iMax;
    }

    private void c(IdValidationResult idValidationResult) {
        String strName;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        String str;
        Float fValueOf4;
        Float fValueOf5;
        Float fValueOf6;
        Float fValueOf7;
        String str2;
        Float fValueOf8;
        Float fValueOf9;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        int i4 = 2 % 2;
        Point[] pointArr = null;
        if (idValidationResult.f11784a != null) {
            int i5 = ao + 31;
            ar = i5 % 128;
            int i6 = i5 % 2;
            strName = idValidationResult.f11784a.name();
        } else {
            strName = null;
        }
        if (idValidationResult.f11786c != null) {
            fValueOf = Float.valueOf(idValidationResult.f11786c.cls);
            pointArr = idValidationResult.f11786c.quad;
            fValueOf2 = Float.valueOf(idValidationResult.f11786c.blur);
            fValueOf3 = Float.valueOf(idValidationResult.f11786c.glare);
            str = idValidationResult.f11786c.side;
            fValueOf4 = Float.valueOf(idValidationResult.f11786c.frontScore);
            fValueOf5 = Float.valueOf(idValidationResult.f11786c.backScore);
            fValueOf6 = Float.valueOf(idValidationResult.f11786c.idScore);
            fValueOf7 = Float.valueOf(idValidationResult.f11786c.passportScore);
            str2 = idValidationResult.f11786c.idType;
            i3 = idValidationResult.f11786c.textReadabilityClass;
            z3 = idValidationResult.f11786c.textPass;
            i2 = idValidationResult.f11786c.barcodeReadabilityClass;
            z2 = idValidationResult.f11786c.barcodePass;
            fValueOf8 = Float.valueOf(idValidationResult.f11786c.docAreaRatio);
            fValueOf9 = Float.valueOf(idValidationResult.f11786c.iouScore);
        } else {
            fValueOf = null;
            fValueOf2 = null;
            fValueOf3 = null;
            str = null;
            fValueOf4 = null;
            fValueOf5 = null;
            fValueOf6 = null;
            fValueOf7 = null;
            str2 = null;
            fValueOf8 = null;
            fValueOf9 = null;
            z2 = false;
            i2 = 0;
            i3 = 0;
            z3 = false;
        }
        Rect rectA = ad.a(idValidationResult.f11786c);
        boolean z5 = true;
        if (idValidationResult.f11784a == null) {
            int i7 = ar + 93;
            ao = i7 % 128;
            int i8 = i7 % 2;
            z4 = true;
        } else {
            z4 = false;
        }
        if (rectA.width() > rectA.height()) {
            int i9 = ar + 9;
            ao = i9 % 128;
            int i10 = i9 % 2;
        } else {
            z5 = false;
        }
        IdScanFrameLogs.e eVar = new IdScanFrameLogs.e(Long.valueOf(new Date().getTime()), getValidationPhase().name(), Float.valueOf(this.f11269i), fValueOf, IdScanFrameLogs.e.d(pointArr), fValueOf2, fValueOf3, str, Float.valueOf(idValidationResult.f11785b), Integer.valueOf(rectA.width()), Integer.valueOf(this.O), Integer.valueOf(this.P), strName, Boolean.valueOf(z4), Boolean.valueOf(z5), fValueOf4, fValueOf5, fValueOf6, fValueOf7, str2, Integer.valueOf(i3), Boolean.valueOf(z3), Integer.valueOf(i2), Boolean.valueOf(z2), fValueOf8, fValueOf9);
        int length = this.ad.toString().getBytes().length;
        if (length >= 51200) {
            this.ad.removeFirst();
            this.ai = Boolean.TRUE;
        }
        this.ad.add(eVar);
        Timber.d("frameLogsData size in KB: %s", Integer.valueOf(length / 1024));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter.e(java.lang.Object[]):java.lang.Object");
    }

    public void publishResult(IdScanResult idScanResult) {
        int i2 = 2 % 2;
        int i3 = ao + 107;
        int i4 = i3 % 128;
        ar = i4;
        int i5 = i3 % 2;
        if (this.f11763l) {
            int i6 = i4 + 99;
            ao = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    idScanResult.metadata = com.incode.welcome_sdk.data.e.b.e(this.f11267g.c());
                } else {
                    idScanResult.metadata = com.incode.welcome_sdk.data.e.b.e(this.f11267g.c());
                    int i7 = 31 / 0;
                }
            } catch (Exception unused) {
                Timber.w("IdScan metadata could not be encrypted!", new Object[0]);
                idScanResult.metadata = "";
            }
        }
        idScanResult.deviceStats = new DeviceStats(getMotionStatus());
        super.publishResultOnModuleBus(idScanResult);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ao = 0;
        ar = 1;
        ap = 8744379693763860222L;
    }

    public /* synthetic */ void a(Long l2) throws Exception {
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        int iA3 = ApproveActivity.e.a();
        d(-798892686, ApproveActivity.e.a(), iA3, iA, 798892689, new Object[]{this, l2}, iA2);
    }

    public /* synthetic */ void h(Throwable th) throws Exception {
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        int iA3 = ApproveActivity.e.a();
        d(-653049837, ApproveActivity.e.a(), iA3, iA, 653049854, new Object[]{this, th}, iA2);
    }

    public /* synthetic */ void C() throws Exception {
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        int iA3 = ApproveActivity.e.a();
        d(-601245725, ApproveActivity.e.a(), iA3, iA, 601245731, new Object[]{this}, iA2);
    }

    public /* synthetic */ Object B() throws Exception {
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        int iA3 = ApproveActivity.e.a();
        return d(-1471339635, ApproveActivity.e.a(), iA3, iA, 1471339637, new Object[]{this}, iA2);
    }

    public /* synthetic */ void d(long j2, long j3) {
        Object[] objArr = {this, Long.valueOf(j2), Long.valueOf(j3)};
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        d(-1082571341, ApproveActivity.e.a(), ApproveActivity.e.a(), iA, 1082571356, objArr, iA2);
    }

    public /* synthetic */ Boolean a(bt btVar, ResponseGetImages responseGetImages) throws Exception {
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        int iA3 = ApproveActivity.e.a();
        return (Boolean) d(-1664899328, ApproveActivity.e.a(), iA3, iA, 1664899338, new Object[]{this, btVar, responseGetImages}, iA2);
    }

    public static /* synthetic */ ObservableSource c(h hVar, ResponseSuccess responseSuccess) throws Exception {
        Object[] objArr = {hVar, responseSuccess};
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        return (ObservableSource) d(-1555127015, ApproveActivity.e.a(), ApproveActivity.e.a(), iA, 1555127028, objArr, iA2);
    }

    public /* synthetic */ ObservableSource a(Throwable th) throws Exception {
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        int iA3 = ApproveActivity.e.a();
        return (ObservableSource) d(-2019942908, ApproveActivity.e.a(), iA3, iA, 2019942924, new Object[]{this, th}, iA2);
    }

    public static /* synthetic */ Boolean b(ResponseMedicalDoc responseMedicalDoc) throws Exception {
        Object[] objArr = {responseMedicalDoc};
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        return (Boolean) d(875966003, ApproveActivity.e.a(), ApproveActivity.e.a(), iA, -875965994, objArr, iA2);
    }

    public /* synthetic */ void d(Long l2) throws Exception {
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        int iA3 = ApproveActivity.e.a();
        d(698073310, ApproveActivity.e.a(), iA3, iA, -698073309, new Object[]{this, l2}, iA2);
    }

    private void c(float f2) {
        Object[] objArr = {this, Float.valueOf(f2)};
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        d(1849492103, ApproveActivity.e.a(), ApproveActivity.e.a(), iA, -1849492103, objArr, iA2);
    }

    private Observable<Boolean> c(DocumentType documentType, File file, j.b bVar, int i2) {
        Object[] objArr = {this, documentType, file, bVar, Integer.valueOf(i2)};
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        return (Observable) d(-1079155756, ApproveActivity.e.a(), ApproveActivity.e.a(), iA, 1079155760, objArr, iA2);
    }

    private Observable<Boolean> c(bt btVar, o oVar) {
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        int iA3 = ApproveActivity.e.a();
        return (Observable) d(478905526, ApproveActivity.e.a(), iA3, iA, -478905514, new Object[]{this, btVar, oVar}, iA2);
    }

    private void c(Uri uri) {
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        int iA3 = ApproveActivity.e.a();
        d(1655648766, ApproveActivity.e.a(), iA3, iA, -1655648761, new Object[]{this, uri}, iA2);
    }

    private void q() {
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        int iA3 = ApproveActivity.e.a();
        d(-1412676634, ApproveActivity.e.a(), iA3, iA, 1412676645, new Object[]{this}, iA2);
    }

    private void o() {
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        int iA3 = ApproveActivity.e.a();
        d(307238667, ApproveActivity.e.a(), iA3, iA, -307238660, new Object[]{this}, iA2);
    }

    private void b(Event event) {
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        int iA3 = ApproveActivity.e.a();
        d(-2140839344, ApproveActivity.e.a(), iA3, iA, 2140839358, new Object[]{this, event}, iA2);
    }

    private boolean f() {
        int iA = ApproveActivity.e.a();
        int iA2 = ApproveActivity.e.a();
        int iA3 = ApproveActivity.e.a();
        return ((Boolean) d(-2041712705, ApproveActivity.e.a(), iA3, iA, 2041712713, new Object[]{this}, iA2)).booleanValue();
    }
}
