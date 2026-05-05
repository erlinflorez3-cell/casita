package com.incode.welcome_sdk.ui.tutorial;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ContextExtensionsKt;
import com.incode.welcome_sdk.commons.extensions.n;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.t;
import com.incode.welcome_sdk.d.ae;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.DocumentValidationResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.views.IncodeButton;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialDocumentScanActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f17800b = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f17801l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f17802m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f17803n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f17804o = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class<? extends BaseValidationActivity> f17805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ae f17806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private DocumentType f17807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17808f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Animation f17811i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScreenName f17809g = ScreenName.DOCUMENT_CAPTURE_TUTORIAL;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Modules f17812j = Modules.DOCUMENT_CAPTURE;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8575instrumented$2$safeOnCreate$LandroidosBundleV(TutorialDocumentScanActivity tutorialDocumentScanActivity, View view) {
        Callback.onClick_enter(view);
        try {
            b(tutorialDocumentScanActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            short sXd = (short) (FB.Xd() ^ ((1123774534 ^ 1347652529) ^ 313046324));
            short sXd2 = (short) (FB.Xd() ^ ((159303987 ^ 696711932) ^ 553125965));
            int[] iArr = new int["!\u000eS\u0011t".length()];
            QB qb = new QB("!\u000eS\u0011t");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strVd = hg.Vd("G4", (short) (OY.Xd() ^ (333662240 ^ 333654028)), (short) (OY.Xd() ^ (1267540803 ^ 1267562969)));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("bO\u0015R6", (short) (OY.Xd() ^ ((2087376935 ^ 1115157412) ^ 1042095856)));
                String strYd = C1561oA.yd("/\u001b", (short) (C1633zX.Xd() ^ ((143653055 ^ 1461654814) ^ (-1603310703))));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("\u0019\bO\u000ft", (short) (C1633zX.Xd() ^ (1391339732 ^ (-1391331112))));
                    short sXd3 = (short) (C1607wl.Xd() ^ ((9462885 ^ 42117064) ^ 34791124));
                    short sXd4 = (short) (C1607wl.Xd() ^ (1153674297 ^ 1153684799));
                    int[] iArr2 = new int["|r".length()];
                    QB qb2 = new QB("|r");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) + sXd4);
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    try {
                        Class<?> cls3 = Class.forName(strYd2);
                        Field field3 = 0 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("\u007fv\u0002e\u000b", (short) (C1607wl.Xd() ^ ((2047216688 ^ 971280895) ^ 1138917875)), (short) (C1607wl.Xd() ^ ((927999504 ^ 1924037114) ^ 1174282115)))).getDeclaredMethod(ZO.xd("~J", (short) (Od.Xd() ^ (1425452853 ^ (-1425459346))), (short) (Od.Xd() ^ (1950830175 ^ (-1950831112)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("p\u0012Eo\u001dA", (short) (Od.Xd() ^ ((330364564 ^ 1687958686) ^ (-1999437364))), (short) (Od.Xd() ^ ((961997100 ^ 654805840) ^ (-508633972))))};
                                Method method = Class.forName(Ig.wd(")\u0012\u0018D`\u0015i\"\u0004&)K\t\u001a\u0006[G_5!N0<", (short) (C1633zX.Xd() ^ (1952361491 ^ (-1952376865))))).getMethod(C1561oA.Qd("LIW5ZSSCJ/@LOA:;", (short) (FB.Xd() ^ ((361474240 ^ 1565204031) ^ 1220601792))), Class.forName(EO.Od("b~\u0004Pv\u0013\u001eL\u0015\u0019:?\t\u0010\u000fk", (short) (C1633zX.Xd() ^ (1743587864 ^ (-1743612973))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("P?\u0007F,", (short) (Od.Xd() ^ ((289187879 ^ 959848797) ^ (-671797021))), (short) (Od.Xd() ^ ((1155666946 ^ 1790705200) ^ (-777648162))));
                                    String strOd = C1561oA.od("$\u0018", (short) (OY.Xd() ^ ((57142874 ^ 1209399132) ^ 1265774668)));
                                    try {
                                        Class<?> cls4 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls4.getField(strOd) : cls4.getDeclaredField(strOd);
                                        field4.setAccessible(true);
                                        field4.set(null, windowManager);
                                    } catch (Throwable th4) {
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    String strKd = C1561oA.Kd("+\u001aa!\u0007", (short) (C1633zX.Xd() ^ ((248723417 ^ 1981872508) ^ (-2029240594))));
                    String strZd2 = Wg.Zd("t1", (short) (C1633zX.Xd() ^ ((714683312 ^ 733055561) ^ (-19441093))), (short) (C1633zX.Xd() ^ ((465583193 ^ 1769537333) ^ (-1924718694))));
                    try {
                        Class<?> cls5 = Class.forName(strKd);
                        Field field5 = 0 != 0 ? cls5.getField(strZd2) : cls5.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd(".\u001dd$\n", (short) (FB.Xd() ^ (1312559994 ^ 1312580017)));
                        String strVd2 = Wg.vd("\r\u0003", (short) (C1580rY.Xd() ^ (2126168161 ^ (-2126173101))));
                        try {
                            Class<?> cls6 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls6.getField(strVd2) : cls6.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i4 = 1900947651 ^ 1900947592;
                        if (x2 > i4 && x2 < displayMetrics.widthPixels - i4 && y2 > i4 && y2 < displayMetrics.heightPixels - i4) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f17801l + 13;
        int i4 = i3 % 128;
        f17803n = i4;
        int i5 = i3 % 2;
        ScreenName screenName = this.f17809g;
        int i6 = i4 + 23;
        f17801l = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f17801l + 31;
        f17803n = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f17812j;
        }
        throw null;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17813c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17814d = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, Class<? extends BaseValidationActivity> cls, DocumentType documentType) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(documentType, "");
            Intent intent = new Intent(context, (Class<?>) TutorialDocumentScanActivity.class);
            intent.putExtra("extraDocumentType", documentType);
            intent.putExtra("extraValidationClass", cls);
            ContextExtensionsKt.startActivityChained(context, intent);
            int i3 = f17814d + 17;
            f17813c = i3 % 128;
            int i4 = i3 % 2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class b extends Lambda implements Function1<DocumentValidationResult, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17815a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17816d = 0;

        private void d() {
            int i2 = 2 % 2;
            int i3 = f17816d + 101;
            f17815a = i3 % 128;
            int i4 = i3 % 2;
            TutorialDocumentScanActivity.this.finish();
            int i5 = f17815a + 63;
            f17816d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(DocumentValidationResult documentValidationResult) {
            int i2 = 2 % 2;
            int i3 = f17816d + 89;
            f17815a = i3 % 128;
            int i4 = i3 % 2;
            d();
            Unit unit = Unit.INSTANCE;
            int i5 = f17815a + 61;
            f17816d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 65 / 0;
            }
            return unit;
        }

        b() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17818a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17819d = 0;

        private void e() {
            int i2 = 2 % 2;
            int i3 = f17819d + 91;
            f17818a = i3 % 128;
            int i4 = i3 % 2;
            TutorialDocumentScanActivity.this.finish();
            int i5 = f17818a + 55;
            f17819d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 28 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f17819d + 101;
            f17818a = i3 % 128;
            int i4 = i3 % 2;
            e();
            Unit unit = Unit.INSTANCE;
            int i5 = f17818a + 71;
            f17819d = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        e() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f17801l + 99;
        f17803n = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f17803n + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17801l = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 27 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        }
        int i5 = f17803n + 69;
        f17801l = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static final void b(TutorialDocumentScanActivity tutorialDocumentScanActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f17803n + 113;
        f17801l = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tutorialDocumentScanActivity, "");
            tutorialDocumentScanActivity.a();
            throw null;
        }
        Intrinsics.checkNotNullParameter(tutorialDocumentScanActivity, "");
        tutorialDocumentScanActivity.a();
        int i4 = f17803n + 123;
        f17801l = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f17801l + 123;
        f17803n = i3 % 128;
        ae aeVar = null;
        if (i3 % 2 == 0) {
            super.safeOnCreate(bundle);
            ae aeVarB = ae.b(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(aeVarB, "");
            this.f17806d = aeVarB;
            if (aeVarB == null) {
                int i4 = f17803n + 5;
                f17801l = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                aeVarB = null;
            }
            setContentView(aeVarB.d());
            DocumentType documentTypeD = t.d(getIntent());
            Intrinsics.checkNotNullExpressionValue(documentTypeD, "");
            this.f17807e = documentTypeD;
            this.f17805c = (Class) getIntent().getSerializableExtra("extraValidationClass");
            EventUtils.sendTutorialShownEvent$default(getRepo(), this, null, 4, null);
            this.f17810h = IncodeWelcome.Companion.getInstance().getInternalConfig().isWaitForDocumentScanTutorials();
            this.f17811i = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.onboard_sdk_slide_up);
            CompositeDisposable disposeOnDestroy = getDisposeOnDestroy();
            com.incode.welcome_sdk.b bVar = com.incode.welcome_sdk.b.f4421b;
            Observable<U> observableOfType = com.incode.welcome_sdk.b.d().ofType(DocumentValidationResult.class);
            Intrinsics.checkNotNullExpressionValue(observableOfType, "");
            Observable observableObserveOn = observableOfType.observeOn(AndroidSchedulers.mainThread());
            final b bVar2 = new b();
            Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialDocumentScanActivity$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TutorialDocumentScanActivity.b(bVar2, obj);
                }
            };
            final e eVar = new e();
            Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialDocumentScanActivity$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TutorialDocumentScanActivity.d(eVar, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "");
            n.b(disposeOnDestroy, disposableSubscribe);
            ae aeVar2 = this.f17806d;
            if (aeVar2 == null) {
                int i6 = f17801l + 1;
                f17803n = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                aeVar = aeVar2;
            }
            aeVar.f6834b.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialDocumentScanActivity$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TutorialDocumentScanActivity.m8575instrumented$2$safeOnCreate$LandroidosBundleV(this.f$0, view);
                }
            });
            return;
        }
        super.safeOnCreate(bundle);
        ae aeVarB2 = ae.b(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(aeVarB2, "");
        this.f17806d = aeVarB2;
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onStart() {
        int i2 = 2 % 2;
        int i3 = f17801l + 95;
        f17803n = i3 % 128;
        int i4 = i3 % 2;
        super.onStart();
        c();
        int i5 = f17801l + 83;
        f17803n = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int i2 = 2 % 2;
        int i3 = f17801l + 5;
        f17803n = i3 % 128;
        ae aeVar = null;
        if (i3 % 2 == 0) {
            super.onResume();
            if (this.f17808f) {
                ae aeVar2 = this.f17806d;
                if (aeVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    aeVar = aeVar2;
                }
                aeVar.f6834b.setEnabled(true);
                int i4 = f17803n + 123;
                f17801l = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        super.onResume();
        aeVar.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TutorialDocumentScanActivity tutorialDocumentScanActivity) {
        int i2 = 2 % 2;
        int i3 = f17801l + 123;
        f17803n = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tutorialDocumentScanActivity, "");
            tutorialDocumentScanActivity.e();
            throw null;
        }
        Intrinsics.checkNotNullParameter(tutorialDocumentScanActivity, "");
        tutorialDocumentScanActivity.e();
        int i4 = f17801l + 117;
        f17803n = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void c() {
        int i2 = 2 % 2;
        int i3 = f17801l + 17;
        f17803n = i3 % 128;
        int i4 = i3 % 2;
        if (this.f17810h) {
            Completable.timer(2000L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialDocumentScanActivity$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Action
                public final void run() {
                    TutorialDocumentScanActivity.b(this.f$0);
                }
            });
            return;
        }
        e();
        int i5 = f17801l + 71;
        f17803n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
    }

    private final void e() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f17801l + 57;
        int i4 = i3 % 128;
        f17803n = i4;
        int i5 = i3 % 2;
        ae aeVar = this.f17806d;
        if (aeVar == null) {
            int i6 = i4 + 77;
            f17801l = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = 39 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            aeVar = null;
        }
        IncodeButton incodeButton = aeVar.f6834b;
        Intrinsics.checkNotNull(incodeButton);
        IncodeButton incodeButton2 = incodeButton;
        if (incodeButton2.getVisibility() == 0) {
            int i8 = f17803n + 55;
            f17801l = i8 % 128;
            int i9 = i8 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            int i10 = f17801l + 3;
            f17803n = i10 % 128;
            int i11 = i10 % 2;
            incodeButton.startAnimation(this.f17811i);
            incodeButton2.setVisibility(0);
        }
        int i12 = f17801l + 85;
        f17803n = i12 % 128;
        int i13 = i12 % 2;
    }

    private final void a() {
        int i2 = 2 % 2;
        ae aeVar = this.f17806d;
        if (aeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f17803n + 45;
            f17801l = i3 % 128;
            int i4 = i3 % 2;
            aeVar = null;
        }
        aeVar.f6834b.setEnabled(false);
        EventUtils.sendContinueEvent(getRepo(), this);
        TutorialDocumentScanActivity tutorialDocumentScanActivity = this;
        Class<? extends BaseValidationActivity> cls = this.f17805c;
        DocumentType documentType = this.f17807e;
        if (documentType == null) {
            int i5 = f17803n + 21;
            f17801l = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            documentType = null;
        }
        BaseValidationActivity.startDocumentValidation(tutorialDocumentScanActivity, cls, documentType, null);
        this.f17808f = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TutorialDocumentScanActivity tutorialDocumentScanActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(tutorialDocumentScanActivity, "");
        tutorialDocumentScanActivity.e(new DocumentValidationResult(ResultCode.USER_CANCELLED, null, null, null, null, null, 62, null));
        tutorialDocumentScanActivity.finish();
        int i4 = f17801l + 125;
        f17803n = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f17803n + 57;
        f17801l = i3 % 128;
        if (i3 % 2 != 0) {
            if (isChained()) {
                finish();
                return;
            }
            int i4 = f17801l + 73;
            f17803n = i4 % 128;
            int i5 = i4 % 2;
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialDocumentScanActivity$$ExternalSyntheticLambda4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    TutorialDocumentScanActivity.a(this.f$0, dialogInterface, i6);
                }
            });
            return;
        }
        isChained();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void e(DocumentValidationResult documentValidationResult) {
        int i2 = 2 % 2;
        com.incode.welcome_sdk.b.publish(documentValidationResult);
        DocumentType documentType = this.f17807e;
        if (documentType == null) {
            int i3 = f17801l + 39;
            f17803n = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            documentType = null;
        }
        if (documentType == DocumentType.ADDRESS_STATEMENT) {
            int i5 = f17801l + 73;
            f17803n = i5 % 128;
            int i6 = i5 % 2;
            IncodeWelcome.Companion.getInstance().getOcrDataBus().onNext(IncodeWelcome.OCRData.Companion.createEmpty());
        }
    }

    static {
        int i2 = f17802m + 103;
        f17804o = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final void start(Context context, Class<? extends BaseValidationActivity> cls, DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = f17803n + 83;
        f17801l = i3 % 128;
        int i4 = i3 % 2;
        f17800b.start(context, cls, documentType);
        if (i4 == 0) {
            throw null;
        }
    }
}
