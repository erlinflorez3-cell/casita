package com.incode.welcome_sdk.ui.results;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.c;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.commons.utils.l;
import com.incode.welcome_sdk.d.v;
import com.incode.welcome_sdk.data.ImageType;
import com.incode.welcome_sdk.data.remote.beans.ResponseGetImages;
import com.incode.welcome_sdk.data.remote.beans.af;
import com.incode.welcome_sdk.data.remote.beans.bj;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.UserScoreResult;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.government_validation.GovernmentValidationActivity;
import com.incode.welcome_sdk.ui.results.common.SlidePagerAdapter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.HttpException;
import timber.log.Timber;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
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
public class ResultsActivity extends BaseActivity {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f17233l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f17234m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f17235o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f17236b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    v f17238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f17239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f17240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private File f17241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private UserScoreResult f17242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private File f17243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private File f17244j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CompositeDisposable f17237c = new CompositeDisposable();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f17245n = IncodeWelcome.getInstance().getInternalConfig().isE2eEncryptionEnabled();

    private static String $$c(short s2, byte b2, int i2) {
        int i3 = i2 + 69;
        byte[] bArr = $$a;
        int i4 = s2 * 2;
        int i5 = 3 - (b2 * 4);
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 += i4;
        }
        while (true) {
            i6++;
            i5++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i5];
        }
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) throws Throwable {
        int i8 = ~i4;
        int i9 = ~(i8 | i3);
        int i10 = ~(i8 | i7);
        int i11 = i9 | i10;
        int i12 = ~i3;
        int i13 = (~((~i7) | i8 | i3)) | (~(i8 | i12 | i7));
        int i14 = i10 | (~(i12 | i4));
        int i15 = i4 + i3 + i2 + ((-1696018712) * i5) + (2108813197 * i6);
        int i16 = i15 * i15;
        int i17 = ((212195308 * i4) - 2121662464) + (1221732374 * i3) + (1009537066 * i11) + (i13 * (-504768533)) + ((-504768533) * i14) + (716963840 * i2) + (39845888 * i5) + (227278848 * i6) + ((-1705377792) * i16);
        int i18 = ((i4 * 362004572) - 1408384217) + (i3 * 362004174) + (i11 * (-398)) + (i13 * 199) + (i14 * 199) + (i2 * 362004373) + (i5 * (-1290304248)) + (i6 * 155295761) + (i16 * (-60686336));
        int i19 = i17 + (i18 * i18 * (-1680474112));
        if (i19 != 1) {
            return i19 != 2 ? i19 != 3 ? e(objArr) : d(objArr) : a(objArr);
        }
        final ResultsActivity resultsActivity = (ResultsActivity) objArr[0];
        Object obj = objArr[1];
        int i20 = 2 % 2;
        int i21 = f17234m + 81;
        f17235o = i21 % 128;
        int i22 = i21 % 2;
        Object[] objArr2 = new Object[1];
        z("\ufffb\u0006\u0001�￼\u0007", 3 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf("", "", 0, 0) + 6, true, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 146, objArr2);
        Observable<?> observableD = resultsActivity.d(((String) objArr2[0]).intern(), new Consumer() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda13
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) throws Exception {
                this.f$0.c((af) obj2);
            }
        });
        int i23 = f17235o + 113;
        f17234m = i23 % 128;
        int i24 = i23 % 2;
        return observableD;
    }

    static void init$0() {
        $$a = new byte[]{17, Ascii.ETB, -20, 88};
        $$b = 205;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8550instrumented$0$safeOnCreate$LandroidosBundleV(ResultsActivity resultsActivity, View view) {
        Callback.onClick_enter(view);
        try {
            resultsActivity.b(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8551instrumented$1$safeOnCreate$LandroidosBundleV(ResultsActivity resultsActivity, View view) {
        Callback.onClick_enter(view);
        try {
            resultsActivity.a(view);
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
            String strKd = Qg.kd("cP\u0016S7", (short) (C1499aX.Xd() ^ (1851872778 ^ (-1851863407))), (short) (C1499aX.Xd() ^ (1268819297 ^ (-1268820345))));
            String strVd = hg.Vd("/\u001c", (short) (OY.Xd() ^ (533071694 ^ 533079330)), (short) (OY.Xd() ^ (381826412 ^ 381833237)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("<)n,\u0010", (short) (Od.Xd() ^ (776486361 ^ (-776501421))));
                String strYd = C1561oA.yd("\u0014\u007f", (short) (ZN.Xd() ^ ((364444539 ^ 2026027390) ^ 1836740980)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    short sXd = (short) (ZN.Xd() ^ (1060322385 ^ 1060320498));
                    int[] iArr = new int[";*q1\u0017".length()];
                    QB qb = new QB(";*q1\u0017");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    String strQd = Xg.qd("A7", (short) (Od.Xd() ^ ((1878343686 ^ 1658678946) ^ (-220742243))), (short) (Od.Xd() ^ (752377861 ^ (-752357263))));
                    try {
                        Class<?> cls3 = Class.forName(str);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("\u001f0+9e", (short) (Od.Xd() ^ (1802975912 ^ (-1802983831))), (short) (Od.Xd() ^ (2085112645 ^ (-2085096443))))).getDeclaredMethod(ZO.xd(">z", (short) (ZN.Xd() ^ ((1446468150 ^ 1362826541) ^ 118243822)), (short) (ZN.Xd() ^ ((828021217 ^ 1292486550) ^ 2085828189))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd2 = C1626yg.Ud("\r>@*G\u001d", (short) (OY.Xd() ^ ((413046916 ^ 2046664538) ^ 1633898944)), (short) (OY.Xd() ^ ((1911690547 ^ 894220028) ^ 1153339487)));
                                Class<?> cls4 = Class.forName(Ig.wd("`@Bu0M*qL\u001a\u0019?a^nG8X\u001d\u0019O8T", (short) (FB.Xd() ^ (420638407 ^ 420618166))));
                                Class<?>[] clsArr = new Class[1];
                                short sXd2 = (short) (C1607wl.Xd() ^ (1216220532 ^ 1216247525));
                                int[] iArr2 = new int["0xO\u001e+\u000f,h\u0015KF\u0012_HMk".length()];
                                QB qb2 = new QB("0xO\u001e+\u000f,h\u0015KF\u0012_HMk");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
                                    i3++;
                                }
                                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                                Object[] objArr2 = {strUd2};
                                short sXd3 = (short) (OY.Xd() ^ (1968319290 ^ 1968334906));
                                int[] iArr3 = new int["daoMrkk[bGXdgYRS".length()];
                                QB qb3 = new QB("daoMrkk[bGXdgYRS");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(sXd3 + sXd3 + sXd3 + i4 + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                Method method = cls4.getMethod(new String(iArr3, 0, i4), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd4 = (short) (Od.Xd() ^ (1566586652 ^ (-1566604945)));
                                    short sXd5 = (short) (Od.Xd() ^ (475574270 ^ (-475572433)));
                                    int[] iArr4 = new int["C2y9\u001f".length()];
                                    QB qb4 = new QB("C2y9\u001f");
                                    int i5 = 0;
                                    while (qb4.YK()) {
                                        int iKK4 = qb4.KK();
                                        Xu xuXd4 = Xu.Xd(iKK4);
                                        iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd4 + i5)) - sXd5);
                                        i5++;
                                    }
                                    String str2 = new String(iArr4, 0, i5);
                                    String strOd = C1561oA.od("\u001f\u0013", (short) (C1499aX.Xd() ^ ((768151638 ^ 255204316) ^ (-587154893))));
                                    try {
                                        Class<?> cls5 = Class.forName(str2);
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
                    String strKd2 = C1561oA.Kd("aP\u0018W=", (short) (C1499aX.Xd() ^ ((521131597 ^ 807174837) ^ (-789790387))));
                    String strZd = Wg.Zd("S-", (short) (C1633zX.Xd() ^ ((397625649 ^ 780814975) ^ (-960055074))), (short) (C1633zX.Xd() ^ (1298106117 ^ (-1298106050))));
                    try {
                        Class<?> cls6 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls6.getField(strZd) : cls6.getDeclaredField(strZd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("+\u001aa!\u0007", (short) (C1607wl.Xd() ^ ((1801369881 ^ 1820610856) ^ 131789643)));
                        String strVd2 = Wg.vd("#\u0017", (short) (C1633zX.Xd() ^ ((1593024382 ^ 1498612901) ^ (-127991208))));
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
                        int i6 = (58216294 ^ 1638587315) ^ 1657967774;
                        if (x2 > i6 && x2 < displayMetrics.widthPixels - i6 && y2 > i6 && y2 < displayMetrics.heightPixels - i6) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private /* synthetic */ void b(View view) {
        int i2 = 2 % 2;
        int i3 = f17235o + 117;
        f17234m = i3 % 128;
        int i4 = i3 % 2;
        onBackButtonPressed();
        int i5 = f17235o + 51;
        f17234m = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ void a(View view) {
        int i2 = 2 % 2;
        int i3 = f17234m + 83;
        f17235o = i3 % 128;
        int i4 = i3 % 2;
        a();
        if (i4 == 0) {
            throw null;
        }
        int i5 = f17235o + 97;
        f17234m = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnCreate(Bundle bundle) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f17234m + 91;
        f17235o = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnCreate(bundle);
        v vVarC = v.c(getLayoutInflater());
        this.f17238d = vVarC;
        setContentView(vVarC.c());
        File imagesDirectory = getRepo().getImagesDirectory();
        Object[] objArr = new Object[1];
        z("\u0001\n\b\ufffa\u0007\ufff9\ufffe\ufff4\t\u0003\u0004\u0007\ufffb\ufff4\t", 5 - TextUtils.indexOf("", "", 0), 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), true, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 150, objArr);
        this.f17239e = l.b(imagesDirectory, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        z("�\u000b\r\u0004\f\ufff7\ufffa\ufff9\ufffb\u0003\ufff7\u0001￼\n", 12 - Process.getGidForName(""), 14 - TextUtils.indexOf("", "", 0, 0), false, (ViewConfiguration.getFadingEdgeLength() >> 16) + 147, objArr2);
        this.f17236b = l.b(imagesDirectory, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        z("￼\u0003�\u0000￼\n", 6 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 6 - Color.green(0), false, 148 - TextUtils.indexOf("", "", 0, 0), objArr3);
        this.f17243i = l.b(imagesDirectory, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        z("�\ufffb\ufff9\ufffe\ufff7\f\u0006\u0007\n\ufffe\ufff7￼\u0001\b\u0007\n\ufffb\ufff7", (ViewConfiguration.getFadingEdgeLength() >> 16) + 13, (Process.myTid() >> 22) + 18, true, 148 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
        this.f17244j = l.b(imagesDirectory, ((String) objArr4[0]).intern());
        if (this.f17245n) {
            int i5 = f17234m + 59;
            f17235o = i5 % 128;
            int i6 = i5 % 2;
            this.f17238d.f7375d.setVisibility(8);
            int i7 = f17234m + 115;
            f17235o = i7 % 128;
            int i8 = i7 % 2;
        }
        this.f17238d.f7373b.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultsActivity.m8550instrumented$0$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        this.f17238d.f7375d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultsActivity.m8551instrumented$1$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        c();
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f17234m + 83;
        f17235o = i3 % 128;
        int i4 = i3 % 2;
        ScreenName screenName = ScreenName.SHOW_RESULTS;
        int i5 = f17234m + 69;
        f17235o = i5 % 128;
        if (i5 % 2 != 0) {
            return screenName;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f17234m + 111;
        f17235o = i3 % 128;
        int i4 = i3 % 2;
        Modules modules = Modules.SHOW_RESULTS;
        int i5 = f17234m + 63;
        f17235o = i5 % 128;
        if (i5 % 2 != 0) {
            return modules;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource e(ImageType[] imageTypeArr, Boolean bool) throws Exception {
        int i2 = 2 % 2;
        if (bool.booleanValue()) {
            int i3 = f17235o + 57;
            f17234m = i3 % 128;
            int i4 = i3 % 2;
            return getRepo().getImages(imageTypeArr, false).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Throwable {
                    this.f$0.d((ResponseGetImages) obj);
                }
            });
        }
        Observable observableJust = Observable.just(new Object());
        int i5 = f17234m + 93;
        f17235o = i5 % 128;
        int i6 = i5 % 2;
        return observableJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(af afVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f17234m + 103;
        f17235o = i3 % 128;
        int i4 = i3 % 2;
        this.f17241g = afVar.c();
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f17235o + 113;
        f17234m = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Object obj) throws Exception {
        String strIntern;
        Consumer<af> consumer;
        int i2 = 2 % 2;
        int i3 = f17235o + 49;
        f17234m = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            z("￡￥￡\u001e\u001f\u001d", 5 - Color.green(0), 69 - KeyEvent.normalizeMetaState(0), true, KeyEvent.getDeadChar(1, 0) + 117, objArr);
            strIntern = ((String) objArr[0]).intern();
            consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) throws Exception {
                    this.f$0.e((af) obj2);
                }
            };
        } else {
            Object[] objArr2 = new Object[1];
            z("￡￥￡\u001e\u001f\u001d", 3 - Color.green(0), KeyEvent.normalizeMetaState(0) + 6, false, KeyEvent.getDeadChar(0, 0) + 123, objArr2);
            strIntern = ((String) objArr2[0]).intern();
            consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) throws Exception {
                    this.f$0.e((af) obj2);
                }
            };
        }
        return d(strIntern, consumer);
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        ResultsActivity resultsActivity = (ResultsActivity) objArr[0];
        af afVar = (af) objArr[1];
        int i2 = 2 % 2;
        int i3 = f17234m + 101;
        f17235o = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        resultsActivity.f17240f = afVar.c();
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = f17234m + 15;
        f17235o = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024 A[PHI: r3
  0x0024: PHI (r3v2 com.incode.welcome_sdk.data.IncodeWelcomeRepository) = (r3v0 com.incode.welcome_sdk.data.IncodeWelcomeRepository), (r3v3 com.incode.welcome_sdk.data.IncodeWelcomeRepository) binds: [B:10:0x0043, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ io.reactivex.ObservableSource c(java.lang.Object r7) throws java.lang.Exception {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.results.ResultsActivity.f17235o
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.results.ResultsActivity.f17234m = r0
            int r1 = r1 % r5
            r4 = 0
            if (r1 == 0) goto L33
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r3 = r6.getRepo()
            com.incode.welcome_sdk.IncodeWelcome$IDResultsFetchMode r2 = com.incode.welcome_sdk.IncodeWelcome.IDResultsFetchMode.ACCURATE
            com.incode.welcome_sdk.IncodeWelcome r0 = com.incode.welcome_sdk.IncodeWelcome.getInstance()
            com.incode.welcome_sdk.IncodeWelcome$InternalConfig r0 = r0.getInternalConfig()
            com.incode.welcome_sdk.IncodeWelcome$IDResultsFetchMode r1 = r0.idResultsFetchMode
            r0 = 11
            int r0 = r0 / r4
            if (r2 != r1) goto L25
        L24:
            r4 = 1
        L25:
            io.reactivex.Observable r2 = r3.getResults(r4)
            int r0 = com.incode.welcome_sdk.ui.results.ResultsActivity.f17234m
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.results.ResultsActivity.f17235o = r0
            int r1 = r1 % r5
            return r2
        L33:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r3 = r6.getRepo()
            com.incode.welcome_sdk.IncodeWelcome$IDResultsFetchMode r1 = com.incode.welcome_sdk.IncodeWelcome.IDResultsFetchMode.ACCURATE
            com.incode.welcome_sdk.IncodeWelcome r0 = com.incode.welcome_sdk.IncodeWelcome.getInstance()
            com.incode.welcome_sdk.IncodeWelcome$InternalConfig r0 = r0.getInternalConfig()
            com.incode.welcome_sdk.IncodeWelcome$IDResultsFetchMode r0 = r0.idResultsFetchMode
            if (r1 != r0) goto L25
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.results.ResultsActivity.c(java.lang.Object):io.reactivex.ObservableSource");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void z(java.lang.String r23, int r24, int r25, boolean r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.results.ResultsActivity.z(java.lang.String, int, int, boolean, int, java.lang.Object[]):void");
    }

    private void c() {
        int i2 = 2 % 2;
        int i3 = f17234m + 67;
        f17235o = i3 % 128;
        int i4 = i3 % 2;
        final ImageType[] imageTypeArr = {ImageType.croppedFrontID, ImageType.croppedBackID};
        this.f17237c.add(Observable.just(Boolean.valueOf(IncodeWelcome.getInstance().getInternalConfig().isDownloadImagesEnabled())).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e(imageTypeArr, (Boolean) obj);
            }
        }).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.d(obj);
            }
        }).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b(obj);
            }
        }).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.c(obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnTerminate(new Action() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda10
            @Override // io.reactivex.functions.Action
            public final void run() {
                this.f$0.d();
            }
        }).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Throwable {
                this.f$0.b((bj) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda12
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                this.f$0.a((Throwable) obj);
            }
        }));
        int i5 = f17235o + 57;
        f17234m = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private Observable<?> d(String str, Consumer<af> consumer) {
        int i2 = 2 % 2;
        int i3 = f17235o + 57;
        int i4 = i3 % 128;
        f17234m = i4;
        int i5 = i3 % 2;
        if (this.f17245n) {
            return Observable.just(new Object());
        }
        int i6 = i4 + 1;
        f17235o = i6 % 128;
        int i7 = i6 % 2;
        Observable<af> observableDoOnNext = getRepo().getEventReport(str, getRepo().getDownloadsDirectory()).doOnNext(consumer);
        int i8 = f17235o + 89;
        f17234m = i8 % 128;
        int i9 = i8 % 2;
        return observableDoOnNext;
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        ResultsActivity resultsActivity = (ResultsActivity) objArr[0];
        ResponseGetImages responseGetImages = (ResponseGetImages) objArr[1];
        int i2 = 2 % 2;
        String image = responseGetImages.getImage(ImageType.croppedFrontID);
        String image2 = responseGetImages.getImage(ImageType.croppedBackID);
        if (image != null && !image.isEmpty()) {
            File imagesDirectory = resultsActivity.getRepo().getImagesDirectory();
            Object[] objArr2 = new Object[1];
            z("\u0001\n\b\ufffa\u0007\ufff9\ufffe\ufff4\t\u0003\u0004\u0007\ufffb\ufff4\t", 6 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, true, 151 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
            BitmapUtils.saveBase64ImageToFile(image, imagesDirectory, ((String) objArr2[0]).intern());
            int i3 = f17234m + 19;
            f17235o = i3 % 128;
            int i4 = i3 % 2;
        }
        Object obj = null;
        if (image2 != null) {
            int i5 = f17235o + 19;
            f17234m = i5 % 128;
            if (i5 % 2 != 0) {
                image2.isEmpty();
                obj.hashCode();
                throw null;
            }
            if (!image2.isEmpty()) {
                File imagesDirectory2 = resultsActivity.getRepo().getImagesDirectory();
                Object[] objArr3 = new Object[1];
                z("�\u000b\r\u0004\f\ufff7\ufffa\ufff9\ufffb\u0003\ufff7\u0001￼\n", Color.argb(0, 0, 0, 0) + 13, 14 - View.MeasureSpec.getSize(0), false, ExpandableListView.getPackedPositionType(0L) + 147, objArr3);
                BitmapUtils.saveBase64ImageToFile(image2, imagesDirectory2, ((String) objArr3[0]).intern());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int i2 = 2 % 2;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f17246b = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f17247d = 0;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                int i3 = 2 % 2;
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation2.setInterpolator(new DecelerateInterpolator());
                alphaAnimation2.setDuration(1000L);
                ResultsActivity.this.f17238d.f7376e.startAnimation(alphaAnimation2);
                ResultsActivity.this.f17238d.f7376e.setVisibility(0);
                int i4 = f17247d + 55;
                f17246b = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                int i3 = 2 % 2;
                int i4 = f17246b + 33;
                f17247d = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                int i3 = 2 % 2;
                int i4 = f17247d + 89;
                f17246b = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        this.f17238d.f7378g.startAnimation(alphaAnimation);
        this.f17238d.f7378g.setVisibility(4);
        int i3 = f17234m + 49;
        f17235o = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(bj bjVar) throws Throwable {
        String strE;
        int i2 = 2 % 2;
        e(bjVar);
        Glide.with((FragmentActivity) this).load(this.f17243i).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).placeholder(R.drawable.onboard_sdk_placeholder_face).into(this.f17238d.f7374c);
        this.f17238d.f7372a.setImageResource(bjVar.c().getAvatarIconResId());
        String givenNameMrz = getRepo().getGivenNameMrz();
        if (StringUtils.isBlank(givenNameMrz)) {
            int i3 = f17234m + 111;
            f17235o = i3 % 128;
            int i4 = i3 % 2;
            strE = getRepo().getFullName();
            givenNameMrz = getRepo().getFirstName();
            if (StringUtils.isBlank(givenNameMrz)) {
                givenNameMrz = StringUtils.getFirstWord(strE);
                int i5 = f17235o + 61;
                f17234m = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 % 3;
                }
            }
        } else {
            strE = e();
        }
        this.f17238d.f7380i.setName(strE, givenNameMrz);
        this.f17238d.f7380i.showFullName();
        this.f17238d.f7379h.setTextColor(ContextCompat.getColor(this, bjVar.c().getColorResId()));
        this.f17238d.f7379h.setText(bjVar.c(this));
        this.f17242h = new UserScoreResult(ResultCode.SUCCESS, null, bjVar.c(this), bjVar.c(), bjVar.a(), bjVar.e(), bjVar.b(), bjVar.d(), bjVar.i());
        int i7 = f17235o + 113;
        f17234m = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 2 / 0;
        }
    }

    private String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f17234m + 11;
        f17235o = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        z(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - (ViewConfiguration.getEdgeSlop() >> 16), 1 - (Process.myTid() >> 22), true, (ViewConfiguration.getWindowTouchSlop() >> 8) + 75, objArr);
        String string = TextUtils.concat(getRepo().getGivenNameMrz(), ((String) objArr[0]).intern(), getRepo().getLastNameMrz()).toString();
        int i5 = f17234m + 5;
        f17235o = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return string;
    }

    private void e(bj bjVar) {
        int i2 = 2 % 2;
        SlidePagerAdapter slidePagerAdapter = new SlidePagerAdapter(bjVar, this.f17239e, this.f17236b, this.f17243i, this.f17244j, getSupportFragmentManager());
        this.f17238d.f7381j.setAdapter(slidePagerAdapter);
        this.f17238d.f7377f.setupWithViewPagerAndIconProvider(this.f17238d.f7381j, slidePagerAdapter);
        int i3 = f17234m + 47;
        f17235o = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Throwable th) {
        int i2 = 2 % 2;
        Timber.e("Couldn't fetch userScore", new Object[0]);
        if (th instanceof HttpException) {
            String string = getString(R.string.onboard_sdk_error_unknown_error);
            try {
                JSONObject jSONObject = new JSONObject(((HttpException) th).response().errorBody().string());
                if (jSONObject.optInt("status") != 401) {
                    string = jSONObject.optString("error");
                } else {
                    int i3 = f17234m + 65;
                    f17235o = i3 % 128;
                    if (i3 % 2 == 0) {
                        getString(R.string.onboard_sdk_error_token_expired);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    string = getString(R.string.onboard_sdk_error_token_expired);
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            } catch (JSONException e3) {
                Timber.e(e3, "Couldn't parse error", new Object[0]);
                string = th.getMessage();
            }
            Toast.makeText(this, string, 1).show();
        } else if (th instanceof NoConnectivityException) {
            Toast.makeText(this, R.string.onboard_sdk_no_internet_connection, 1).show();
            int i4 = f17234m + 91;
            f17235o = i4 % 128;
            int i5 = i4 % 2;
        } else {
            Toast.makeText(this, R.string.onboard_sdk_unknown_server_error, 1).show();
        }
        IncodeWelcome.getInstance().getShowResultsBus().onNext(new UserScoreResult(ResultCode.ERROR, th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) throws Throwable {
        int i3 = 2 % 2;
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            }
            e(GovernmentValidationActivity.Companion.c(), -1525525362, 1525525364, GovernmentValidationActivity.Companion.c(), new Object[]{this, this.f17240f}, GovernmentValidationActivity.Companion.c(), GovernmentValidationActivity.Companion.c());
            int i4 = f17235o + 43;
            f17234m = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        e(GovernmentValidationActivity.Companion.c(), -1525525362, 1525525364, GovernmentValidationActivity.Companion.c(), new Object[]{this, this.f17241g}, GovernmentValidationActivity.Companion.c(), GovernmentValidationActivity.Companion.c());
        int i6 = f17235o + 109;
        f17234m = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 24 / 0;
        }
    }

    private void a() {
        int i2 = 2 % 2;
        new AlertDialog.Builder(this).setTitle(R.string.onboard_sdk_choose_provider).setItems(new String[]{getString(R.string.onboard_sdk_provider_incode), getString(R.string.onboard_sdk_provider_nom151)}, new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) throws Throwable {
                this.f$0.a(dialogInterface, i3);
            }
        }).show();
        int i3 = f17234m + 125;
        f17235o = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Exception {
        ResultsActivity resultsActivity = (ResultsActivity) objArr[0];
        File file = (File) objArr[1];
        int i2 = 2 % 2;
        int i3 = f17235o + 101;
        f17234m = i3 % 128;
        int i4 = i3 % 2;
        if (file != null && file.exists()) {
            Uri uriForFile = FileProvider.getUriForFile(resultsActivity, c.f4654f, file);
            Timber.d("fileUri : %s", uriForFile);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriForFile, "application/pdf");
            intent.setFlags(67108865);
            CX.ud();
            try {
                resultsActivity.startActivity(intent);
                int i5 = f17235o + 75;
                f17234m = i5 % 128;
                if (i5 % 2 == 0) {
                    return null;
                }
                throw null;
            } catch (ActivityNotFoundException e2) {
                Timber.e(e2, "ActivityNotFoundException", new Object[0]);
                Toast.makeText(resultsActivity, resultsActivity.getString(R.string.onboard_sdk_show_report_app_unavailable), 1).show();
                return null;
            }
        }
        Toast.makeText(resultsActivity, resultsActivity.getString(R.string.onboard_sdk_report_not_available), 1);
        int i6 = f17234m + 59;
        f17235o = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        IncodeWelcome.getInstance().getShowResultsBus().onNext(new UserScoreResult(ResultCode.USER_CANCELLED));
        finish();
        int i4 = f17234m + 19;
        f17235o = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f17234m + 111;
        int i4 = i3 % 128;
        f17235o = i4;
        int i5 = i3 % 2;
        if (this.f17242h == null) {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.results.ResultsActivity$$ExternalSyntheticLambda5
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    this.f$0.b(dialogInterface, i6);
                }
            });
            return;
        }
        int i6 = i4 + 125;
        f17234m = i6 % 128;
        int i7 = i6 % 2;
        IncodeWelcome.getInstance().getShowResultsBus().onNext(this.f17242h);
        finish();
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f17234m + 115;
        f17235o = i3 % 128;
        if (i3 % 2 != 0) {
            this.f17237c.clear();
            super.safeOnDestroy();
        } else {
            this.f17237c.clear();
            super.safeOnDestroy();
            throw null;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f17234m = 0;
        f17235o = 1;
        f17233l = 1994499223;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource d(Object obj) throws Exception {
        int iC = GovernmentValidationActivity.Companion.c();
        return (ObservableSource) e(GovernmentValidationActivity.Companion.c(), -144069331, 144069332, GovernmentValidationActivity.Companion.c(), new Object[]{this, obj}, GovernmentValidationActivity.Companion.c(), iC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(af afVar) throws Exception {
        int iC = GovernmentValidationActivity.Companion.c();
        e(GovernmentValidationActivity.Companion.c(), 467575523, -467575520, GovernmentValidationActivity.Companion.c(), new Object[]{this, afVar}, GovernmentValidationActivity.Companion.c(), iC);
    }

    private void d(File file) throws Throwable {
        int iC = GovernmentValidationActivity.Companion.c();
        e(GovernmentValidationActivity.Companion.c(), -1525525362, 1525525364, GovernmentValidationActivity.Companion.c(), new Object[]{this, file}, GovernmentValidationActivity.Companion.c(), iC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ResponseGetImages responseGetImages) throws Throwable {
        int iC = GovernmentValidationActivity.Companion.c();
        e(GovernmentValidationActivity.Companion.c(), 468870333, -468870333, GovernmentValidationActivity.Companion.c(), new Object[]{this, responseGetImages}, GovernmentValidationActivity.Companion.c(), iC);
    }
}
