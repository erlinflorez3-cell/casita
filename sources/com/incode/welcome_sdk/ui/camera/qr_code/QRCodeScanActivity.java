package com.incode.welcome_sdk.ui.camera.qr_code;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewKt;
import androidx.transition.TransitionManager;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.ui.VignetteView;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.d.bf;
import com.incode.welcome_sdk.d.u;
import com.incode.welcome_sdk.data.local.db.c.d;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.QRScanResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.camera.CameraActivity;
import com.incode.welcome_sdk.ui.camera.CameraPreview;
import com.incode.welcome_sdk.ui.camera.CameraPreviewType;
import com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract;
import com.incode.welcome_sdk.views.IncodeTextView;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import timber.log.Timber;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class QRCodeScanActivity extends CameraActivity implements QRCodeScanContract.View {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f11880l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f11881n = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Inject
    QRCodeScanPresenter f11882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private bf f11883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u f11884j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CompositeDisposable f11885o = new CompositeDisposable();

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~i7;
        int i10 = ~(i8 | i9);
        int i11 = ~i2;
        int i12 = i10 | (~(i11 | i7));
        int i13 = i9 | i4;
        int i14 = ~(i13 | i2);
        int i15 = (~(i7 | i8)) | (~(i9 | i11)) | (~i13);
        int i16 = i4 + i2 + i3 + (1650861130 * i5) + ((-924421097) * i6);
        int i17 = i16 * i16;
        int i18 = (i4 * (-405912681)) + 1474035712 + ((-405912681) * i2) + (i12 * (-1619411862)) + (1619411862 * i14) + ((-1619411862) * i15) + ((-2025324544) * i3) + (986710016 * i5) + ((-948436992) * i6) + ((-1864630272) * i17);
        int i19 = ((i4 * (-959335331)) - 587927435) + (i2 * (-959335331)) + (i12 * 462) + (i14 * (-462)) + (i15 * 462) + (i3 * (-959334869)) + (i5 * 22983790) + (i6 * 637852125) + (i17 * (-1124859904));
        int i20 = i18 + (i19 * i19 * (-1807482880));
        if (i20 != 1) {
            return i20 != 2 ? b(objArr) : d(objArr);
        }
        QRCodeScanActivity qRCodeScanActivity = (QRCodeScanActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i21 = 2 % 2;
        int i22 = f11881n + 53;
        f11880l = i22 % 128;
        int i23 = i22 % 2;
        IncodeTextView incodeTextView = qRCodeScanActivity.f11884j.f7361c;
        incodeTextView.setText(iIntValue);
        incodeTextView.setTextColor(ContextCompat.getColor(qRCodeScanActivity, iIntValue2));
        incodeTextView.setVisibility(0);
        int i24 = f11881n + 51;
        f11880l = i24 % 128;
        int i25 = i24 % 2;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8321instrumented$0$safeOnCreate$LandroidosBundleV(QRCodeScanActivity qRCodeScanActivity, View view) {
        Callback.onClick_enter(view);
        try {
            qRCodeScanActivity.d(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8322instrumented$1$safeOnCreate$LandroidosBundleV(QRCodeScanActivity qRCodeScanActivity, View view) {
        Callback.onClick_enter(view);
        try {
            qRCodeScanActivity.e(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8323instrumented$2$safeOnCreate$LandroidosBundleV(QRCodeScanActivity qRCodeScanActivity, View view) {
        Callback.onClick_enter(view);
        try {
            qRCodeScanActivity.b(view);
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
            String strKd = Qg.kd("<)n,\u0010", (short) (OY.Xd() ^ (2122768507 ^ 2122761467)), (short) (OY.Xd() ^ ((1901681217 ^ 1702888302) ^ 349765926)));
            String strVd = hg.Vd("WD", (short) (Od.Xd() ^ ((539255411 ^ 1026751038) ^ (-488020639))), (short) (Od.Xd() ^ ((617345763 ^ 1705288461) ^ (-1097796776))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                short sXd = (short) (C1580rY.Xd() ^ ((2064927710 ^ 962480885) ^ (-1112153030)));
                int[] iArr = new int["kX\u001e[?".length()];
                QB qb = new QB("kX\u001e[?");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strYd = C1561oA.yd("B0", (short) (C1607wl.Xd() ^ (2119992638 ^ 2119999544)));
                try {
                    Class<?> cls2 = Class.forName(str);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd(",\u001bb\"\b", (short) (C1607wl.Xd() ^ (1896243086 ^ 1896239445)));
                    String strQd = Xg.qd("\u000e\u0004", (short) (C1580rY.Xd() ^ ((281768652 ^ 1393052467) ^ (-1136853982))), (short) (C1580rY.Xd() ^ ((1198641326 ^ 24169786) ^ (-1174484855))));
                    try {
                        Class<?> cls3 = Class.forName(strYd2);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("8s\u000b\"S", (short) (C1633zX.Xd() ^ (1677788085 ^ (-1677801855))), (short) (C1633zX.Xd() ^ ((975486446 ^ 1141107555) ^ (-2116487801))))).getDeclaredMethod(ZO.xd("\u0007i", (short) (ZN.Xd() ^ (1751869588 ^ 1751849974)), (short) (ZN.Xd() ^ (912460315 ^ 912480344))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd = C1626yg.Ud("\u0005X0\u0015_.", (short) (ZN.Xd() ^ ((1780914984 ^ 798385385) ^ 1169199018)), (short) (ZN.Xd() ^ ((1803868452 ^ 1469003223) ^ 1007415722)));
                                Class<?> cls4 = Class.forName(Ig.wd("~e'\u0010\u0013/PP*54\u001e?<LfVz@@u[;", (short) (C1633zX.Xd() ^ (1800881988 ^ (-1800871507)))));
                                Class<?>[] clsArr = new Class[1];
                                short sXd2 = (short) (FB.Xd() ^ (1057682573 ^ 1057668196));
                                int[] iArr2 = new int["\u0016f\n\u0014I-\u000ez+\u0015<w`MF\u001a".length()];
                                QB qb2 = new QB("\u0016f\n\u0014I-\u000ez+\u0015<w`MF\u001a");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
                                    i3++;
                                }
                                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                                Object[] objArr2 = {strUd};
                                Method method = cls4.getMethod(C1561oA.Qd("85C!F??/6\u001b,8;-&'", (short) (C1633zX.Xd() ^ (780747102 ^ (-780744573)))), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("aP\u0018W=", (short) (C1607wl.Xd() ^ ((1987219615 ^ 1989182717) ^ 14825701)), (short) (C1607wl.Xd() ^ ((1759333935 ^ 1231785092) ^ 565624128)));
                                    String strOd = C1561oA.od("vj", (short) (C1633zX.Xd() ^ (107693030 ^ (-107696057))));
                                    try {
                                        Class<?> cls5 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls5.getField(strOd) : cls5.getDeclaredField(strOd);
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
                    String strKd2 = C1561oA.Kd("o^&eK", (short) (C1499aX.Xd() ^ (562029366 ^ (-562022360))));
                    String strZd2 = Wg.Zd("9'", (short) (C1633zX.Xd() ^ ((1766256829 ^ 1192828551) ^ (-778035668))), (short) (C1633zX.Xd() ^ (804145274 ^ (-804145071))));
                    try {
                        Class<?> cls6 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls6.getField(strZd2) : cls6.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("|k3rX", (short) (ZN.Xd() ^ ((867149290 ^ 656299062) ^ 347205228)));
                        String strVd2 = Wg.vd("}s", (short) (C1607wl.Xd() ^ (1905276494 ^ 1905270639)));
                        try {
                            Class<?> cls7 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls7.getField(strVd2) : cls7.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i4 = 911614333 ^ 911614262;
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

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public int getCameraFacing() {
        int i2 = 2 % 2;
        int i3 = f11881n;
        int i4 = i3 + 21;
        f11880l = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 1;
        f11880l = i6 % 128;
        if (i6 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity
    public void setContentView() {
        int i2 = 2 % 2;
        int i3 = f11880l + 41;
        f11881n = i3 % 128;
        int i4 = i3 % 2;
        u uVarE = u.e(getLayoutInflater());
        this.f11884j = uVarE;
        this.f11883i = bf.b(uVarE.f7360b);
        setContentView(this.f11884j.a());
        int i5 = f11881n + 57;
        f11880l = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private /* synthetic */ void d(View view) {
        int i2 = 2 % 2;
        int i3 = f11880l + 65;
        f11881n = i3 % 128;
        int i4 = i3 % 2;
        c();
        if (i4 == 0) {
            throw null;
        }
        int i5 = f11881n + 43;
        f11880l = i5 % 128;
        int i6 = i5 % 2;
    }

    private /* synthetic */ void e(View view) {
        int i2 = 2 % 2;
        int i3 = f11880l + 3;
        f11881n = i3 % 128;
        int i4 = i3 % 2;
        this.f11882h.onBtnNeedHelp();
        int i5 = f11880l + 15;
        f11881n = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
    }

    private /* synthetic */ void b(View view) {
        int i2 = 2 % 2;
        int i3 = f11881n + 51;
        f11880l = i3 % 128;
        int i4 = i3 % 2;
        this.f11882h.onBtnHelpContinue();
        int i5 = f11880l + 77;
        f11881n = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        DaggerQRCodeScanComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.getInstance().getIncodeWelcomeRepositoryComponent()).qRCodeScanPresenterModule(new QRCodeScanPresenterModule(this)).build().inject(this);
        super.safeOnCreate(bundle, this.f11882h);
        initializeUiBasedOnScreenDimensions();
        b();
        this.f11884j.f7362d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QRCodeScanActivity.m8321instrumented$0$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        this.f11884j.f7359a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QRCodeScanActivity.m8322instrumented$1$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        this.f11883i.f7056c.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QRCodeScanActivity.m8323instrumented$2$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        int i3 = f11880l + 55;
        f11881n = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit j() {
        int i2 = 2 % 2;
        int i3 = f11880l + 117;
        f11881n = i3 % 128;
        int i4 = i3 % 2;
        this.f11882h.retryProcessingBytes(false);
        Unit unit = Unit.INSTANCE;
        int i5 = f11881n + 13;
        f11880l = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private void b() {
        int i2 = 2 % 2;
        int i3 = f11881n + 93;
        f11880l = i3 % 128;
        int i4 = i3 % 2;
        setNoNetworkSnackbarRetryAction(new Function0() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.j();
            }
        });
        int i5 = f11881n + 5;
        f11880l = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity, com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onCameraPermissionGranted() {
        int i2 = 2 % 2;
        int i3 = f11881n + 115;
        f11880l = i3 % 128;
        int i4 = i3 % 2;
        super.onCameraPermissionGranted();
        e();
        int i5 = f11880l + 27;
        f11881n = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
    }

    private void e() {
        int i2 = 2 % 2;
        int i3 = f11881n + 61;
        f11880l = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11882h.init(getIntent());
        } else {
            this.f11882h.init(getIntent());
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002b A[PHI: r2 r3 r4
  0x002b: PHI (r2v5 int) = (r2v1 int), (r2v6 int) binds: [B:10:0x00a7, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r3v5 int) = (r3v1 int), (r3v7 int) binds: [B:10:0x00a7, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r4v5 int) = (r4v0 int), (r4v7 int) binds: [B:10:0x00a7, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initializeUiBasedOnScreenDimensions() {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity.f11881n
            int r1 = r0 + 81
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity.f11880l = r0
            int r1 = r1 % r5
            r2 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            if (r1 == 0) goto L91
            int r0 = r6.getScreenWidth()
            double r0 = (double) r0
            double r0 = r0 + r2
            int r2 = (int) r0
            int r3 = r6.getScreenWidth()
            int r0 = r5 / r2
            int r3 = r3 << r0
            int r4 = r6.getScreenHeight()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 37
            if (r1 < r0) goto L3d
        L2b:
            android.content.Context r0 = r6.getContext()
            int r0 = com.incode.welcome_sdk.commons.utils.ResourceUtils.getStatusBarHeight(r0)
            int r4 = r4 + r0
            int r0 = com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity.f11881n
            int r1 = r0 + 49
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity.f11880l = r0
            int r1 = r1 % r5
        L3d:
            int r4 = r4 - r3
            int r4 = r4 / r5
            r0 = 0
            int r1 = java.lang.Math.max(r4, r0)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r0 = r6.getScreenWidth()
            int r0 = r0 - r2
            int r3 = r3 + r1
            r4.<init>(r2, r1, r0, r3)
            com.incode.welcome_sdk.d.u r0 = r6.f11884j
            com.incode.welcome_sdk.commons.ui.VignetteView r1 = r0.f7364f
            int r0 = com.incode.welcome_sdk.R.color.onboard_sdk_qr_scan_vignette
            int r0 = androidx.core.content.ContextCompat.getColor(r6, r0)
            r1.setPaintColor(r0)
            r1 = 1098383360(0x41780000, float:15.5)
            float r0 = r6.getScreenDensity()
            float r0 = r0 * r1
            int r2 = (int) r0
            r1 = 1091567616(0x41100000, float:9.0)
            float r0 = r6.getScreenDensity()
            float r0 = r0 * r1
            int r1 = (int) r0
            com.incode.welcome_sdk.d.u r0 = r6.f11884j
            com.incode.welcome_sdk.commons.ui.VignetteView r0 = r0.f7364f
            r0.setParams(r4, r2, r1)
            r1 = 1101004800(0x41a00000, float:20.0)
            float r0 = r6.getScreenDensity()
            float r0 = r0 * r1
            int r3 = (int) r0
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r6.getScreenDensity()
            float r0 = r0 * r1
            int r2 = (int) r0
            com.incode.welcome_sdk.d.u r0 = r6.f11884j
            com.incode.welcome_sdk.commons.ui.FlashingBorderView r1 = r0.f7366h
            int r0 = com.incode.welcome_sdk.R.color.onboard_sdk_white
            int r0 = androidx.core.content.ContextCompat.getColor(r6, r0)
            r1.setParams(r4, r3, r2, r0)
            return
        L91:
            int r0 = r6.getScreenWidth()
            double r0 = (double) r0
            double r0 = r0 * r2
            int r2 = (int) r0
            int r3 = r6.getScreenWidth()
            int r0 = r2 * 2
            int r3 = r3 - r0
            int r4 = r6.getScreenHeight()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L3d
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity.initializeUiBasedOnScreenDimensions():void");
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public ScreenName getScreenName() {
        ScreenName screenName;
        int i2 = 2 % 2;
        int i3 = f11880l + 115;
        f11881n = i3 % 128;
        if (i3 % 2 == 0) {
            screenName = ScreenName.QR_SCAN;
            int i4 = 46 / 0;
        } else {
            screenName = ScreenName.QR_SCAN;
        }
        int i5 = f11880l + 61;
        f11881n = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f11880l + 45;
        f11881n = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Modules modules = Modules.QR_SCAN;
            throw null;
        }
        Modules modules2 = Modules.QR_SCAN;
        int i4 = f11881n + 21;
        f11880l = i4 % 128;
        if (i4 % 2 == 0) {
            return modules2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity
    public int getDesiredCameraZoom() {
        int i2 = 2 % 2;
        int i3 = f11881n;
        int i4 = i3 + 95;
        f11880l = i4 % 128;
        int i5 = i4 % 2 != 0 ? 21928 : 200;
        int i6 = i3 + 67;
        f11880l = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = f11881n + 61;
        f11880l = i7 % 128;
        int i8 = i7 % 2;
        this.f11884j.f7364f.layout(0, 0, i2, i3);
        this.f11884j.f7366h.layout(0, 0, i2, i3);
        this.f11884j.f7366h.setColor(ContextCompat.getColor(this, R.color.onboard_sdk_white));
        this.f11884j.f7365g.setBackgroundResource(R.drawable.onboard_sdk_qr_code_overlay_white);
        this.f11884j.f7368j.setBackgroundResource(0);
        int i9 = f11881n + 57;
        f11880l = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity, com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onCameraSourceCreated() {
        int i2 = 2 % 2;
        super.onCameraSourceCreated();
        VignetteView vignetteView = this.f11884j.f7364f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(vignetteView.getVignetteWidth(), vignetteView.getVignetteHeight());
        layoutParams.setMargins(vignetteView.getVignetteX(), vignetteView.getVignetteY(), 0, 0);
        this.f11884j.f7365g.setLayoutParams(layoutParams);
        this.f11884j.f7368j.setLayoutParams(layoutParams);
        ((CameraActivity) this).f11178d.addOnLayoutCameraPreviewListener(new CameraPreview.OnLayoutCameraPreviewListener() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity$$ExternalSyntheticLambda3
            @Override // com.incode.welcome_sdk.ui.camera.CameraPreview.OnLayoutCameraPreviewListener
            public final void layoutCameraPreview(int i3, int i4, int i5, int i6) {
                this.f$0.e(i3, i4, i5, i6);
            }
        });
        int i3 = f11881n + 37;
        f11880l = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity
    public CameraPreviewType getCameraType() {
        CameraPreviewType cameraPreviewType;
        int i2 = 2 % 2;
        int i3 = f11881n + 25;
        f11880l = i3 % 128;
        if (i3 % 2 != 0) {
            cameraPreviewType = CameraPreviewType.FULLSCREEN;
            int i4 = 50 / 0;
        } else {
            cameraPreviewType = CameraPreviewType.FULLSCREEN;
        }
        int i5 = f11881n + 37;
        f11880l = i5 % 128;
        int i6 = i5 % 2;
        return cameraPreviewType;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11886a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11887c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11888d = 0;

        static {
            int[] iArr = new int[QRScanState.values().length];
            f11886a = iArr;
            try {
                iArr[QRScanState.PROCESSING_TOO_DARK.ordinal()] = 1;
                int i2 = f11887c + 105;
                f11888d = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11886a[QRScanState.PROCESSING_BLURRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11886a[QRScanState.QR_DETECTED.ordinal()] = 3;
                int i4 = f11888d + 7;
                f11887c = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11886a[QRScanState.QR_VALIDATION_IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11886a[QRScanState.QR_VALIDATION_COMPLETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11886a[QRScanState.QR_VALIDATION_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11886a[QRScanState.QR_VALIDATION_TOTAL_FAILURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11886a[QRScanState.NOT_OPERATIONAL.ordinal()] = 8;
                int i7 = f11887c + 109;
                f11888d = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 32 / 0;
                }
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract.View
    public void onQRScanStateChanged(QRScanState qRScanState) {
        int i2 = 2 % 2;
        int i3 = f11880l + 27;
        f11881n = i3 % 128;
        int i4 = i3 % 2;
        if (qRScanState != QRScanState.NOT_OPERATIONAL) {
            int i5 = f11880l + 43;
            f11881n = i5 % 128;
            int i6 = i5 % 2;
            d(590499784, d.AnonymousClass3.b(), -590499783, d.AnonymousClass3.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_qr_scan_feedback_top), Integer.valueOf(R.color.onboard_sdk_TextColorInverted)}, d.AnonymousClass3.b(), d.AnonymousClass3.b());
        }
        switch (AnonymousClass5.f11886a[qRScanState.ordinal()]) {
            case 1:
                Timber.d("too dark", new Object[0]);
                break;
            case 2:
                Timber.d("too blurry", new Object[0]);
                break;
            case 3:
                Timber.d("QR detected", new Object[0]);
                this.f11884j.f7364f.setPaintColor(ContextCompat.getColor(this, R.color.onboard_sdk_BackgroundWindow));
                this.f11884j.f7366h.setColor(ContextCompat.getColor(this, R.color.onboard_sdk_colorPrimary));
                break;
            case 4:
                int iB = d.AnonymousClass3.b();
                d(-1340534944, d.AnonymousClass3.b(), 1340534944, d.AnonymousClass3.b(), new Object[]{this}, d.AnonymousClass3.b(), iB);
                int i7 = f11880l + 15;
                f11881n = i7 % 128;
                int i8 = i7 % 2;
                break;
            case 5:
                c(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.closeScreen();
                    }
                });
                break;
            case 6:
                a(true);
                break;
            case 7:
                d(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.closeScreen();
                    }
                });
                break;
            case 8:
                d(590499784, d.AnonymousClass3.b(), -590499783, d.AnonymousClass3.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_qr_scan_not_operational), Integer.valueOf(R.color.onboard_sdk_state_destructive)}, d.AnonymousClass3.b(), d.AnonymousClass3.b());
                break;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract.View
    public void setNeedHelpButtonVisible(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f11880l + 3;
        f11881n = i3 % 128;
        int i4 = i3 % 2;
        this.f11884j.f7359a.setEnabled(z2);
        ViewKt.setVisible(this.f11884j.f7359a, z2);
        int i5 = f11881n + 89;
        f11880l = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract.View
    public void setHelpScreenVisible(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        TransitionManager.beginDelayedTransition(this.f11884j.f7363e);
        if (!z2) {
            EventUtils.sendScreenClosed(getRepo(), ScreenName.QR_SCAN_FAILURE_COMMON_ISSUES, Modules.QR_SCAN);
        } else {
            int i4 = f11880l + 123;
            f11881n = i4 % 128;
            if (i4 % 2 != 0) {
                EventUtils.sendScreenOpened(getRepo(), ScreenName.QR_SCAN_FAILURE_COMMON_ISSUES, Modules.QR_SCAN);
            } else {
                EventUtils.sendScreenOpened(getRepo(), ScreenName.QR_SCAN_FAILURE_COMMON_ISSUES, Modules.QR_SCAN);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        FrameLayout frameLayout = this.f11883i.f7057d;
        if (z2) {
            i2 = 0;
        } else {
            int i5 = f11881n + 11;
            f11880l = i5 % 128;
            int i6 = i5 % 2;
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        QRCodeScanActivity qRCodeScanActivity = (QRCodeScanActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = f11881n + 41;
        f11880l = i3 % 128;
        if (i3 % 2 == 0) {
            qRCodeScanActivity.a(R.string.onboard_sdk_qr_scan_processing);
            return null;
        }
        qRCodeScanActivity.a(R.string.onboard_sdk_qr_scan_processing);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Runnable runnable, Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11881n + 61;
        f11880l = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        runnable.run();
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = f11880l + 89;
        f11881n = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private void c(final Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = f11881n + 65;
        f11880l = i3 % 128;
        int i4 = i3 % 2;
        a(R.string.onboard_sdk_qr_scan_success);
        this.f11884j.f7366h.setColor(ContextCompat.getColor(this, R.color.onboard_sdk_state_success));
        this.f11885o.add(Observable.timer(500L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                QRCodeScanActivity.b(runnable, (Long) obj);
            }
        }));
        int i5 = f11881n + 101;
        f11880l = i5 % 128;
        int i6 = i5 % 2;
    }

    private void a(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f11881n + 117;
        f11880l = i3 % 128;
        int i4 = i3 % 2;
        a(R.string.onboard_sdk_qr_scan_failed);
        this.f11884j.f7367i.setTextColor(ContextCompat.getColor(this, R.color.onboard_sdk_state_destructive));
        this.f11884j.f7366h.setColor(ContextCompat.getColor(this, R.color.onboard_sdk_state_destructive));
        if (z2) {
            this.f11884j.f7362d.setVisibility(0);
            int i5 = f11880l + 33;
            f11881n = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Runnable runnable, Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11880l + 35;
        f11881n = i3 % 128;
        int i4 = i3 % 2;
        runnable.run();
        int i5 = f11881n + 43;
        f11880l = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private void d(final Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = f11881n + 61;
        f11880l = i3 % 128;
        int i4 = i3 % 2;
        a(false);
        this.f11885o.add(Observable.timer(1500L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                QRCodeScanActivity.e(runnable, (Long) obj);
            }
        }));
        int i5 = f11881n + 23;
        f11880l = i5 % 128;
        int i6 = i5 % 2;
    }

    private void c() {
        int i2 = 2 % 2;
        int i3 = f11880l + 59;
        f11881n = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11884j.f7362d.setVisibility(2);
        } else {
            this.f11884j.f7362d.setVisibility(4);
        }
        f();
        int i4 = f11880l + 21;
        f11881n = i4 % 128;
        int i5 = i4 % 2;
    }

    private void a(int i2) {
        int i3 = 2 % 2;
        int i4 = f11881n + 65;
        f11880l = i4 % 128;
        int i5 = i4 % 2;
        this.f11884j.f7367i.setText(i2);
        this.f11884j.f7367i.setTextColor(ContextCompat.getColor(this, R.color.onboard_sdk_TextColorDefault));
        this.f11884j.f7367i.setVisibility(0);
        this.f11884j.f7365g.setBackgroundResource(R.drawable.onboard_sdk_qr_code_overlay_black);
        this.f11884j.f7368j.setBackgroundResource(R.color.onboard_sdk_BackgroundWindow);
        int i6 = f11881n + 117;
        f11880l = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private void a() {
        int i2 = 2 % 2;
        int i3 = f11880l + 41;
        f11881n = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11884j.f7367i.setVisibility(5);
        } else {
            this.f11884j.f7367i.setVisibility(4);
        }
        this.f11884j.f7365g.setBackgroundResource(R.drawable.onboard_sdk_qr_code_overlay_white);
        this.f11884j.f7368j.setBackgroundResource(0);
        int i4 = f11881n + 5;
        f11880l = i4 % 128;
        int i5 = i4 % 2;
    }

    private void f() {
        int i2 = 2 % 2;
        int i3 = f11880l + 117;
        f11881n = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11884j.f7364f.setPaintColor(ContextCompat.getColor(this, R.color.onboard_sdk_qr_scan_vignette));
            this.f11884j.f7366h.setColor(ContextCompat.getColor(this, R.color.onboard_sdk_white));
            a();
            this.f11882h.restartQRScan();
            int i4 = 8 / 0;
        } else {
            this.f11884j.f7364f.setPaintColor(ContextCompat.getColor(this, R.color.onboard_sdk_qr_scan_vignette));
            this.f11884j.f7366h.setColor(ContextCompat.getColor(this, R.color.onboard_sdk_white));
            a();
            this.f11882h.restartQRScan();
        }
        int i5 = f11881n + 79;
        f11880l = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, com.incode.welcome_sdk.ui.BaseView
    public void closeScreen() {
        int i2 = 2 % 2;
        int i3 = f11881n + 15;
        f11880l = i3 % 128;
        if (i3 % 2 != 0) {
            finish();
            int i4 = 50 / 0;
        } else {
            finish();
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onDetectionResult(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2 = 2 % 2;
        int i3 = f11881n + 3;
        f11880l = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity, com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f11880l + 15;
        f11881n = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11885o.clear();
            super.safeOnDestroy();
            int i4 = 83 / 0;
        } else {
            this.f11885o.clear();
            super.safeOnDestroy();
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        QRCodeScanActivity qRCodeScanActivity = (QRCodeScanActivity) objArr[0];
        ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        qRCodeScanActivity.f11882h.publishResult(new QRScanResult(ResultCode.USER_CANCELLED));
        qRCodeScanActivity.finish();
        int i3 = f11880l + 115;
        f11881n = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f11880l + 121;
        f11881n = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (this.f11883i.f7057d.getVisibility() == 0) {
            this.f11882h.onBtnHelpContinue();
            int i5 = f11881n + 45;
            f11880l = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanActivity$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                this.f$0.c(dialogInterface, i6);
            }
        });
        int i6 = f11880l + 27;
        f11881n = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity
    public void handlePermissionDenied(Exception exc) {
        int i2 = 2 % 2;
        this.f11882h.publishResult(new QRScanResult(ResultCode.ERROR, exc));
        int i3 = f11881n + 125;
        f11880l = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 34 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i2) {
        d(-2100053808, d.AnonymousClass3.b(), 2100053810, d.AnonymousClass3.b(), new Object[]{this, dialogInterface, Integer.valueOf(i2)}, d.AnonymousClass3.b(), d.AnonymousClass3.b());
    }

    private void d() {
        int iB = d.AnonymousClass3.b();
        d(-1340534944, d.AnonymousClass3.b(), 1340534944, d.AnonymousClass3.b(), new Object[]{this}, d.AnonymousClass3.b(), iB);
    }

    private void c(int i2, int i3) {
        d(590499784, d.AnonymousClass3.b(), -590499783, d.AnonymousClass3.b(), new Object[]{this, Integer.valueOf(i2), Integer.valueOf(i3)}, d.AnonymousClass3.b(), d.AnonymousClass3.b());
    }
}
