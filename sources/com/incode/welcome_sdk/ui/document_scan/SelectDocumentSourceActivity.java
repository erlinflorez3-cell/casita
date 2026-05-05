package com.incode.welcome_sdk.ui.document_scan;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.t;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.DocumentValidationResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.document_scan.BottomSheetDocumentValidationOptions;
import com.incode.welcome_sdk.ui.tutorial.TutorialDocumentScanActivity;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class SelectDocumentSourceActivity extends BaseActivity implements DocumentScanOptionsListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f13227d = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f13228f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f13229h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f13230i = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f13231o = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DocumentType f13232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f13233c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Class<? extends BaseValidationActivity> f13234e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScreenName f13235g = ScreenName.DOCUMENT_CAPTURE_CHOOSER;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Modules f13236j = Modules.DOCUMENT_CAPTURE;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$b$--V, reason: not valid java name */
    public static /* synthetic */ void m8446instrumented$0$b$V(SelectDocumentSourceActivity selectDocumentSourceActivity, View view) {
        Callback.onClick_enter(view);
        try {
            c(selectDocumentSourceActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$b$--V, reason: not valid java name */
    public static /* synthetic */ void m8447instrumented$1$b$V(SelectDocumentSourceActivity selectDocumentSourceActivity, View view) {
        Callback.onClick_enter(view);
        try {
            c(selectDocumentSourceActivity, view);
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
            short sXd = (short) (C1633zX.Xd() ^ ((2025718362 ^ 1225634641) ^ (-833854057)));
            short sXd2 = (short) (C1633zX.Xd() ^ (1052543004 ^ (-1052560527)));
            int[] iArr = new int["jW\u001dZ>".length()];
            QB qb = new QB("jW\u001dZ>");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strVd = hg.Vd("s`", (short) (Od.Xd() ^ ((83595715 ^ 2113062210) ^ (-2030634645))), (short) (Od.Xd() ^ ((1489496002 ^ 30029585) ^ (-1494083182))));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("\u0003o5rV", (short) (C1580rY.Xd() ^ ((955498936 ^ 960150343) ^ (-29972200))));
                String strYd = C1561oA.yd("eQ", (short) (C1607wl.Xd() ^ (1275842029 ^ 1275850298)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("?.u5\u001b", (short) (OY.Xd() ^ (2022368079 ^ 2022375115)));
                    short sXd3 = (short) (C1499aX.Xd() ^ ((1462222325 ^ 1239524820) ^ (-516293981)));
                    short sXd4 = (short) (C1499aX.Xd() ^ (1216183162 ^ (-1216184205)));
                    int[] iArr2 = new int["&\u001c".length()];
                    QB qb2 = new QB("&\u001c");
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
                        Method declaredMethod = Class.forName(Jg.Wd("M\u0018\u0004X\u001c", (short) (FB.Xd() ^ (1844713374 ^ 1844728785)), (short) (FB.Xd() ^ ((593787270 ^ 1527627075) ^ 2020196388)))).getDeclaredMethod(ZO.xd("WY", (short) (OY.Xd() ^ (710836592 ^ 710848531)), (short) (OY.Xd() ^ ((181310654 ^ 777918391) ^ 613461634))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd2 = C1626yg.Ud("14LAeQ", (short) (C1499aX.Xd() ^ (144229140 ^ (-144228447))), (short) (C1499aX.Xd() ^ ((7610658 ^ 2001238514) ^ (-2000424316))));
                                short sXd5 = (short) (C1633zX.Xd() ^ ((469994742 ^ 720460109) ^ (-921867232)));
                                int[] iArr3 = new int["v5[\u000f\u001bX=LSps\u0016\\UQ&\u001fSw\u00046rR".length()];
                                QB qb3 = new QB("v5[\u000f\u001bX=LSps\u0016\\UQ&\u001fSw\u00046rR");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd5 + i4)));
                                    i4++;
                                }
                                Object[] objArr2 = {strUd2};
                                Method method = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.Qd("UR`>c\\\\LS8IUXJCD", (short) (FB.Xd() ^ (179391531 ^ 179386582))), Class.forName(EO.Od("v=\u0014gdw\u0001.i\u001507\u0004|Q1", (short) (FB.Xd() ^ (2102985615 ^ 2102992995)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("\u0019\bO\u000ft", (short) (C1580rY.Xd() ^ (1013761868 ^ (-1013759048))), (short) (C1580rY.Xd() ^ (1128025849 ^ (-1128031959))));
                                    String strOd = C1561oA.od("*\u001e", (short) (C1633zX.Xd() ^ (778879203 ^ (-778867363))));
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
                    String strKd = C1561oA.Kd("D3z: ", (short) (C1499aX.Xd() ^ (810266160 ^ (-810270485))));
                    short sXd6 = (short) (Od.Xd() ^ (2078086090 ^ (-2078109056)));
                    short sXd7 = (short) (Od.Xd() ^ ((1923589483 ^ 1053799259) ^ (-1281903780)));
                    int[] iArr4 = new int["&u".length()];
                    QB qb4 = new QB("&u");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(((i5 * sXd7) ^ sXd6) + xuXd4.CK(iKK4));
                        i5++;
                    }
                    String str3 = new String(iArr4, 0, i5);
                    try {
                        Class<?> cls5 = Class.forName(strKd);
                        Field field5 = 0 != 0 ? cls5.getField(str3) : cls5.getDeclaredField(str3);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("jY!`F", (short) (OY.Xd() ^ ((497120946 ^ 1714460939) ^ 2073161098)));
                        short sXd8 = (short) (ZN.Xd() ^ (622355003 ^ 622330264));
                        int[] iArr5 = new int["`V".length()];
                        QB qb5 = new QB("`V");
                        int i6 = 0;
                        while (qb5.YK()) {
                            int iKK5 = qb5.KK();
                            Xu xuXd5 = Xu.Xd(iKK5);
                            iArr5[i6] = xuXd5.fK((sXd8 ^ i6) + xuXd5.CK(iKK5));
                            i6++;
                        }
                        String str4 = new String(iArr5, 0, i6);
                        try {
                            Class<?> cls6 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls6.getField(str4) : cls6.getDeclaredField(str4);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i7 = 1759248542 ^ 1759248597;
                        if (x2 > i7 && x2 < displayMetrics.widthPixels - i7 && y2 > i7 && y2 < displayMetrics.heightPixels - i7) {
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
        int i3 = f13228f + 59;
        f13229h = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f13235g;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f13229h + 7;
        int i4 = i3 % 128;
        f13228f = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Modules modules = this.f13236j;
        int i5 = i4 + 41;
        f13229h = i5 % 128;
        int i6 = i5 % 2;
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2;
        super.safeOnCreate(bundle);
        DocumentType documentTypeD = t.d(getIntent());
        Intrinsics.checkNotNullExpressionValue(documentTypeD, "");
        this.f13232b = documentTypeD;
        this.f13234e = (Class) getIntent().getSerializableExtra("extraValidationClass");
        this.f13233c = getIntent().getBooleanExtra("extraShowTutorials", false);
        DocumentType documentType = this.f13232b;
        DocumentType documentType2 = null;
        if (documentType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            documentType = null;
        }
        switch (WhenMappings.f13240c[documentType.ordinal()]) {
            case 1:
                i2 = R.layout.onboard_sdk_activity_select_address_statement_source;
                break;
            case 2:
                i2 = R.layout.onboard_sdk_activity_select_payment_proof_source;
                break;
            case 3:
                i2 = R.layout.onboard_sdk_activity_select_medical_doc_source;
                break;
            case 4:
                i2 = R.layout.onboard_sdk_activity_select_other_document_1_source;
                break;
            case 5:
                i2 = R.layout.onboard_sdk_activity_select_other_document_2_source;
                break;
            case 6:
                i2 = R.layout.onboard_sdk_activity_select_other_document_3_source;
                break;
            default:
                DocumentType documentType3 = this.f13232b;
                if (documentType3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    documentType2 = documentType3;
                }
                throw new IllegalArgumentException("Unknown document type: " + documentType2);
        }
        setContentView(i2);
        CompositeDisposable disposeOnDestroy = getDisposeOnDestroy();
        com.incode.welcome_sdk.b bVar = com.incode.welcome_sdk.b.f4421b;
        Observable<U> observableOfType = com.incode.welcome_sdk.b.d().ofType(DocumentValidationResult.class);
        Intrinsics.checkNotNullExpressionValue(observableOfType, "");
        Observable observableObserveOn = observableOfType.observeOn(AndroidSchedulers.mainThread());
        final b bVar2 = new b();
        Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.document_scan.SelectDocumentSourceActivity$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SelectDocumentSourceActivity.c(bVar2, obj);
            }
        };
        final d dVar = new d();
        disposeOnDestroy.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.document_scan.SelectDocumentSourceActivity$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SelectDocumentSourceActivity.e(dVar, obj);
            }
        }));
        b();
    }

    static final class b extends Lambda implements Function1<DocumentValidationResult, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13242a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13243c = 1;

        private void d() {
            int i2 = 2 % 2;
            int i3 = f13243c + 33;
            f13242a = i3 % 128;
            int i4 = i3 % 2;
            SelectDocumentSourceActivity.this.finish();
            int i5 = f13243c + 105;
            f13242a = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(DocumentValidationResult documentValidationResult) {
            int i2 = 2 % 2;
            int i3 = f13242a + 73;
            f13243c = i3 % 128;
            int i4 = i3 % 2;
            d();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f13242a + 115;
            f13243c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        b() {
            super(1);
        }
    }

    static final class d extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13245a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13246d = 1;

        private void b() {
            int i2 = 2 % 2;
            int i3 = f13246d + 61;
            f13245a = i3 % 128;
            if (i3 % 2 != 0) {
                SelectDocumentSourceActivity.this.finish();
                int i4 = 31 / 0;
            } else {
                SelectDocumentSourceActivity.this.finish();
            }
            int i5 = f13245a + 69;
            f13246d = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f13246d + 117;
            f13245a = i3 % 128;
            int i4 = i3 % 2;
            b();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
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
    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f13228f + 47;
        f13229h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f13229h + 123;
        f13228f = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f13228f + 1;
        f13229h = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 66 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.document_scan.DocumentScanOptionsListener
    public final void onBtnPhotoLibrary() throws Exception {
        Intent intentCreateChooser;
        int i2;
        int i3 = 2 % 2;
        a();
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        if (intent.resolveActivity(getPackageManager()) == null) {
            Toast.makeText(this, R.string.onboard_sdk_select_document_source_error, 1).show();
            return;
        }
        int i4 = f13229h + 31;
        f13228f = i4 % 128;
        if (i4 % 2 == 0) {
            intentCreateChooser = Intent.createChooser(intent, getString(R.string.onboard_sdk_select_document_source_photo_library));
            i2 = 126;
        } else {
            intentCreateChooser = Intent.createChooser(intent, getString(R.string.onboard_sdk_select_document_source_photo_library));
            i2 = 44;
        }
        CX.ud();
        startActivityForResult(intentCreateChooser, i2);
        int i5 = f13228f + 49;
        f13229h = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.document_scan.DocumentScanOptionsListener
    public final void onBtnTakePhoto() {
        int i2 = 2 % 2;
        a();
        DocumentType documentType = null;
        if (!this.f13233c) {
            SelectDocumentSourceActivity selectDocumentSourceActivity = this;
            Class<? extends BaseValidationActivity> cls = this.f13234e;
            DocumentType documentType2 = this.f13232b;
            if (documentType2 == null) {
                int i3 = f13228f + 101;
                f13229h = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                documentType2 = null;
            }
            BaseValidationActivity.startDocumentValidation(selectDocumentSourceActivity, cls, documentType2, null);
            int i5 = f13228f + 25;
            f13229h = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = f13228f + 109;
        f13229h = i7 % 128;
        if (i7 % 2 != 0) {
            TutorialDocumentScanActivity.Companion companion = TutorialDocumentScanActivity.f17800b;
            documentType.hashCode();
            throw null;
        }
        TutorialDocumentScanActivity.Companion companion2 = TutorialDocumentScanActivity.f17800b;
        SelectDocumentSourceActivity selectDocumentSourceActivity2 = this;
        Class<? extends BaseValidationActivity> cls2 = this.f13234e;
        DocumentType documentType3 = this.f13232b;
        if (documentType3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            documentType = documentType3;
        }
        companion2.start(selectDocumentSourceActivity2, cls2, documentType);
    }

    @Override // com.incode.welcome_sdk.ui.document_scan.DocumentScanOptionsListener
    public final void onBtnBrowse() throws Exception {
        int i2 = 2 % 2;
        a();
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*|application/pdf");
        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "application/pdf"});
        Intent intentCreateChooser = Intent.createChooser(intent, getString(R.string.onboard_sdk_select_document_source_browse));
        if (intentCreateChooser.resolveActivity(getPackageManager()) == null) {
            Toast.makeText(this, R.string.onboard_sdk_select_document_source_error, 1).show();
            return;
        }
        int i3 = f13229h + 85;
        f13228f = i3 % 128;
        int i4 = i3 % 2;
        CX.ud();
        startActivityForResult(intentCreateChooser, 45);
        int i5 = f13229h + 79;
        f13228f = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = 2 % 2;
        super.onActivityResult(i2, i3, intent);
        if ((i2 == 44 || i2 == 45) && i3 == -1) {
            e(intent);
            int i5 = f13228f + 57;
            f13229h = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 4;
            }
        }
        int i7 = f13228f + 23;
        f13229h = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SelectDocumentSourceActivity selectDocumentSourceActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(selectDocumentSourceActivity, "");
        selectDocumentSourceActivity.c(new DocumentValidationResult(ResultCode.USER_CANCELLED, null, null, null, null, null, 62, null));
        selectDocumentSourceActivity.finish();
        int i4 = f13229h + 35;
        f13228f = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f13228f + 33;
        f13229h = i3 % 128;
        int i4 = i3 % 2;
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.document_scan.SelectDocumentSourceActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                SelectDocumentSourceActivity.e(this.f$0, dialogInterface, i5);
            }
        });
        int i5 = f13229h + 105;
        f13228f = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void c(SelectDocumentSourceActivity selectDocumentSourceActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f13229h + 53;
        f13228f = i3 % 128;
        DocumentType documentType = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(selectDocumentSourceActivity, "");
            Intrinsics.checkNotNull(view);
            ViewExtensionsKt.preventDoubleClickShort(view);
            BottomSheetDocumentValidationOptions.Companion companion = BottomSheetDocumentValidationOptions.f13219d;
            DocumentType documentType2 = selectDocumentSourceActivity.f13232b;
            throw null;
        }
        Intrinsics.checkNotNullParameter(selectDocumentSourceActivity, "");
        Intrinsics.checkNotNull(view);
        ViewExtensionsKt.preventDoubleClickShort(view);
        BottomSheetDocumentValidationOptions.Companion companion2 = BottomSheetDocumentValidationOptions.f13219d;
        DocumentType documentType3 = selectDocumentSourceActivity.f13232b;
        if (documentType3 == null) {
            int i4 = f13229h + 103;
            f13228f = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            documentType = documentType3;
        }
        BottomSheetDocumentValidationOptions bottomSheetDocumentValidationOptionsNewInstance = companion2.newInstance(documentType.isPdfSupported());
        bottomSheetDocumentValidationOptionsNewInstance.show(selectDocumentSourceActivity.getSupportFragmentManager(), bottomSheetDocumentValidationOptionsNewInstance.getTag());
    }

    private final void b() {
        int i2 = 2 % 2;
        int i3 = f13228f + 57;
        f13229h = i3 % 128;
        if (i3 % 2 == 0) {
            ((Button) findViewById(R.id.btnContinue)).setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.document_scan.SelectDocumentSourceActivity$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectDocumentSourceActivity.m8446instrumented$0$b$V(this.f$0, view);
                }
            });
            int i4 = f13228f + 5;
            f13229h = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
                return;
            }
            return;
        }
        ((Button) findViewById(R.id.btnContinue)).setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.document_scan.SelectDocumentSourceActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectDocumentSourceActivity.m8447instrumented$1$b$V(this.f$0, view);
            }
        });
        throw null;
    }

    private final void e(Intent intent) {
        int i2 = 2 % 2;
        int i3 = f13229h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f13228f = i3 % 128;
        int i4 = i3 % 2;
        if (intent != null) {
            Uri data = intent.getData();
            SelectDocumentSourceActivity selectDocumentSourceActivity = this;
            Class<? extends BaseValidationActivity> cls = this.f13234e;
            DocumentType documentType = this.f13232b;
            if (documentType == null) {
                int i5 = f13228f + 75;
                f13229h = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = f13229h + 33;
                f13228f = i7 % 128;
                int i8 = i7 % 2;
                documentType = null;
            }
            BaseValidationActivity.startDocumentValidation(selectDocumentSourceActivity, cls, documentType, data);
            return;
        }
        Toast.makeText(this, getString(R.string.onboard_sdk_select_document_source_error_opening_file), 0).show();
    }

    private final void a() {
        int i2 = 2 % 2;
        int i3 = f13229h + 3;
        f13228f = i3 % 128;
        if (i3 % 2 != 0) {
            EventUtils.sendContinueEvent(getRepo(), this);
        } else {
            EventUtils.sendContinueEvent(getRepo(), this);
            throw null;
        }
    }

    private final void c(DocumentValidationResult documentValidationResult) {
        int i2 = 2 % 2;
        int i3 = f13229h + 85;
        f13228f = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            com.incode.welcome_sdk.b.publish(documentValidationResult);
            obj.hashCode();
            throw null;
        }
        com.incode.welcome_sdk.b.publish(documentValidationResult);
        DocumentType documentType = this.f13232b;
        if (documentType == null) {
            int i4 = f13228f + 19;
            f13229h = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            documentType = null;
        }
        if (documentType == DocumentType.ADDRESS_STATEMENT) {
            int i5 = f13228f + 69;
            f13229h = i5 % 128;
            if (i5 % 2 == 0) {
                IncodeWelcome.Companion.getInstance().getOcrDataBus().onNext(IncodeWelcome.OCRData.Companion.createEmpty());
            } else {
                IncodeWelcome.Companion.getInstance().getOcrDataBus().onNext(IncodeWelcome.OCRData.Companion.createEmpty());
                throw null;
            }
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13237c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13238d = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, Class<? extends BaseValidationActivity> cls, DocumentType documentType, boolean z2) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(documentType, "");
            Intent intent = new Intent(context, (Class<?>) SelectDocumentSourceActivity.class);
            intent.putExtra("extraDocumentType", documentType);
            intent.putExtra("extraValidationClass", cls);
            intent.putExtra("extraShowTutorials", z2);
            CX.ud();
            context.startActivity(intent);
            int i3 = f13238d + 91;
            f13237c = i3 % 128;
            int i4 = i3 % 2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13239a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f13240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13241d = 0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.ADDRESS_STATEMENT.ordinal()] = 1;
                int i2 = f13241d + 67;
                f13239a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.PAYMENT_PROOF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.MEDICAL_DOC.ordinal()] = 3;
                int i4 = f13239a + 87;
                f13241d = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.OTHER_DOCUMENT_1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.OTHER_DOCUMENT_2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.OTHER_DOCUMENT_3.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f13240c = iArr;
        }
    }

    static {
        int i2 = f13231o + 85;
        f13230i = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context, Class<? extends BaseValidationActivity> cls, DocumentType documentType, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f13228f + 59;
        f13229h = i3 % 128;
        int i4 = i3 % 2;
        f13227d.start(context, cls, documentType, z2);
        int i5 = f13229h + 49;
        f13228f = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
    }
}
