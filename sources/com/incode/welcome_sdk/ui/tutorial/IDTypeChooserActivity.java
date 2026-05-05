package com.incode.welcome_sdk.ui.tutorial;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.c.a.e.e;
import com.c.a.h;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.facebook.infer.annotation.ThreadConfined;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.c;
import com.incode.welcome_sdk.commons.exceptions.MissingNfcDependencyException;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.utils.LayoutUtils;
import com.incode.welcome_sdk.d.q;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase;
import com.incode.welcome_sdk.ui.tutorial.IDTypeChooserContract;
import com.incode.welcome_sdk.views.IncodeButton;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.msgpack.core.MessagePack;
import timber.log.Timber;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class IDTypeChooserActivity extends BaseActivity implements IDTypeChooserContract.View {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static char f17727r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static char f17728t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static char f17729u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static char f17730v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f17731w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static int f17732x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f17733y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f17734z = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q f17735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Inject
    public IDTypeChooserPresenter f17736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Class<? extends BaseValidationActivity> f17737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IdCategory f17739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private IdScan.AutocaptureUXMode f17740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private IdScan.ScanStep f17744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f17746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f17747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f17748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ScreenName f17749p = ScreenName.ID_TYPE_CHOOSER;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Modules f17750q = Modules.ID;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f17751s;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, int r7, byte r8) {
        /*
            int r0 = r7 * 5
            int r0 = r0 + 105
            int r1 = r8 * 4
            int r8 = r1 + 4
            int r1 = r6 * 4
            int r7 = r1 + 1
            byte[] r6 = com.incode.welcome_sdk.ui.tutorial.IDTypeChooserActivity.$$a
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L2e
            r3 = r7
            r1 = r8
            r2 = r4
        L16:
            int r0 = -r3
            int r8 = r8 + r0
            int r1 = r1 + 1
            r0 = r8
            r8 = r1
        L1c:
            byte r1 = (byte) r0
            r5[r2] = r1
            int r2 = r2 + 1
            if (r2 != r7) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L29:
            r3 = r6[r8]
            r1 = r8
            r8 = r0
            goto L16
        L2e:
            r2 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.tutorial.IDTypeChooserActivity.$$c(short, int, byte):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{70, MessagePack.Code.FLOAT32, 7, 50};
        $$b = 193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8570instrumented$1$safeOnCreate$LandroidosBundleV(IDTypeChooserActivity iDTypeChooserActivity, View view) {
        Callback.onClick_enter(view);
        try {
            e(iDTypeChooserActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8571instrumented$2$safeOnCreate$LandroidosBundleV(IDTypeChooserActivity iDTypeChooserActivity, View view) {
        Callback.onClick_enter(view);
        try {
            b(iDTypeChooserActivity, view);
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
            short sXd = (short) (ZN.Xd() ^ (712091687 ^ 712112465));
            short sXd2 = (short) (ZN.Xd() ^ (788295557 ^ 788268842));
            int[] iArr = new int[" \rR\u0010s".length()];
            QB qb = new QB(" \rR\u0010s");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strVd = hg.Vd("J7", (short) (C1499aX.Xd() ^ ((2140809192 ^ 753811988) ^ (-1400133326))), (short) (C1499aX.Xd() ^ ((1577486495 ^ 430816459) ^ (-1202401504))));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("q^$aE", (short) (FB.Xd() ^ (900263759 ^ 900240284)));
                String strYd = C1561oA.yd("B0", (short) (ZN.Xd() ^ ((1383930190 ^ 1954235210) ^ 637939796)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    short sXd3 = (short) (ZN.Xd() ^ (536239804 ^ 536215595));
                    int[] iArr2 = new int["ud,kQ".length()];
                    QB qb2 = new QB("ud,kQ");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i3));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    String strQd = Xg.qd("h^", (short) (FB.Xd() ^ ((1589572872 ^ 602934692) ^ 2102305655)), (short) (FB.Xd() ^ ((1578661253 ^ 736729234) ^ 1978777156)));
                    try {
                        Class<?> cls3 = Class.forName(str2);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Class<?> cls4 = Class.forName(Jg.Wd("q\u0017\u0017+E", (short) (Od.Xd() ^ (19135210 ^ (-19114820))), (short) (Od.Xd() ^ (685694964 ^ (-685671878)))));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr = new Object[0];
                        short sXd4 = (short) (FB.Xd() ^ (268642940 ^ 268648385));
                        short sXd5 = (short) (FB.Xd() ^ ((901807795 ^ 1171058270) ^ 1879896642));
                        int[] iArr3 = new int["]|".length()];
                        QB qb3 = new QB("]|");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                            i4++;
                        }
                        Method declaredMethod = cls4.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("\u0007g\r$#H", (short) (Od.Xd() ^ (162669138 ^ (-162670991))), (short) (Od.Xd() ^ (661957874 ^ (-661958913))))};
                                Method method = Class.forName(Ig.wd("\u0015k}1t:\u001f.ANUs6;3\u0004dtY&T\rp", (short) (C1499aX.Xd() ^ ((1649965254 ^ 1352090089) ^ (-852454515))))).getMethod(C1561oA.Qd(")&4\u0012700 '\f\u001d),\u001e\u0017\u0018", (short) (C1499aX.Xd() ^ ((1476370578 ^ 742500992) ^ (-2076072788)))), Class.forName(EO.Od("%RW!7*9x\u0018a\u000b\u0004,+\"w", (short) (OY.Xd() ^ (1750203382 ^ 1750183608)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd6 = (short) (C1633zX.Xd() ^ ((120000835 ^ 1548021074) ^ (-1533247885)));
                                    short sXd7 = (short) (C1633zX.Xd() ^ (2145874011 ^ (-2145876384)));
                                    int[] iArr4 = new int["$\u0013Z\u001a\u007f".length()];
                                    QB qb4 = new QB("$\u0013Z\u001a\u007f");
                                    int i5 = 0;
                                    while (qb4.YK()) {
                                        int iKK4 = qb4.KK();
                                        Xu xuXd4 = Xu.Xd(iKK4);
                                        iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd6 + i5)) - sXd7);
                                        i5++;
                                    }
                                    String str3 = new String(iArr4, 0, i5);
                                    String strOd = C1561oA.od(ThreadConfined.UI, (short) (C1499aX.Xd() ^ ((447967389 ^ 1375122810) ^ (-1262856841))));
                                    try {
                                        Class<?> cls5 = Class.forName(str3);
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
                    String strKd = C1561oA.Kd("\nx@\u007fe", (short) (C1499aX.Xd() ^ ((324526199 ^ 1976187364) ^ (-1721617309))));
                    short sXd8 = (short) (FB.Xd() ^ (1490520246 ^ 1490546833));
                    short sXd9 = (short) (FB.Xd() ^ (185128761 ^ 185114677));
                    int[] iArr5 = new int["-\u001b".length()];
                    QB qb5 = new QB("-\u001b");
                    int i6 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i6] = xuXd5.fK(((i6 * sXd9) ^ sXd8) + xuXd5.CK(iKK5));
                        i6++;
                    }
                    String str4 = new String(iArr5, 0, i6);
                    try {
                        Class<?> cls6 = Class.forName(strKd);
                        Field field5 = 0 != 0 ? cls6.getField(str4) : cls6.getDeclaredField(str4);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("7&m-\u0013", (short) (Od.Xd() ^ ((232758828 ^ 137144295) ^ (-99829494))));
                        String strVd2 = Wg.vd("\u0005z", (short) (C1607wl.Xd() ^ ((1626377914 ^ 817893287) ^ 1345377958)));
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
                        int i7 = 834100147 ^ 834100216;
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

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final IDTypeChooserPresenter getMPresenter() {
        int i2 = 2 % 2;
        int i3 = f17732x + 29;
        f17733y = i3 % 128;
        int i4 = i3 % 2;
        IDTypeChooserPresenter iDTypeChooserPresenter = this.f17736c;
        if (iDTypeChooserPresenter != null) {
            return iDTypeChooserPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = f17732x + 115;
        f17733y = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void setMPresenter(IDTypeChooserPresenter iDTypeChooserPresenter) {
        int i2 = 2 % 2;
        int i3 = f17733y + 105;
        f17732x = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(iDTypeChooserPresenter, "");
        this.f17736c = iDTypeChooserPresenter;
        int i5 = f17732x + 37;
        f17733y = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f17732x + 101;
        f17733y = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f17749p;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f17732x;
        int i4 = i3 + 69;
        f17733y = i4 % 128;
        int i5 = i4 % 2;
        Modules modules = this.f17750q;
        int i6 = i3 + 9;
        f17733y = i6 % 128;
        int i7 = i6 % 2;
        return modules;
    }

    public final void setModule(Modules modules) {
        int i2 = 2 % 2;
        int i3 = f17733y + 79;
        f17732x = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(modules, "");
        this.f17750q = modules;
        int i5 = f17732x + 81;
        f17733y = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IDTypeChooserActivity iDTypeChooserActivity) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(iDTypeChooserActivity, "");
        View[] viewArr = new View[2];
        q qVar = iDTypeChooserActivity.f17735b;
        if (qVar == null) {
            int i3 = f17732x + 91;
            f17733y = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            qVar = null;
        }
        viewArr[0] = qVar.f7322e;
        q qVar2 = iDTypeChooserActivity.f17735b;
        if (qVar2 == null) {
            int i5 = f17733y + 117;
            f17732x = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = f17732x + 45;
            f17733y = i7 % 128;
            int i8 = i7 % 2;
            qVar2 = null;
        }
        viewArr[1] = qVar2.f7319a;
        LayoutUtils.equalizeWidths(viewArr);
        int i9 = f17733y + 1;
        f17732x = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    private static final void e(IDTypeChooserActivity iDTypeChooserActivity, View view) throws Exception {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(iDTypeChooserActivity, "");
        q qVar = iDTypeChooserActivity.f17735b;
        if (qVar == null) {
            int i3 = f17732x + 37;
            f17733y = i3 % 128;
            qVar = null;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        IncodeButton incodeButton = qVar.f7322e;
        Intrinsics.checkNotNullExpressionValue(incodeButton, "");
        ViewExtensionsKt.preventDoubleClick(incodeButton);
        iDTypeChooserActivity.a();
        int i4 = f17732x + 43;
        f17733y = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void b(IDTypeChooserActivity iDTypeChooserActivity, View view) throws Exception {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(iDTypeChooserActivity, "");
        q qVar = iDTypeChooserActivity.f17735b;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f17733y + 35;
            f17732x = i3 % 128;
            int i4 = i3 % 2;
            qVar = null;
        }
        IncodeButton incodeButton = qVar.f7319a;
        Intrinsics.checkNotNullExpressionValue(incodeButton, "");
        ViewExtensionsKt.preventDoubleClick(incodeButton);
        iDTypeChooserActivity.c();
        int i5 = f17732x + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17733y = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        IdScan.ScanStep scanStep;
        int i2 = 2 % 2;
        int i3 = f17732x + 27;
        f17733y = i3 % 128;
        q qVar = null;
        if (i3 % 2 != 0) {
            super.safeOnCreate(bundle);
            q qVarE = q.e(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(qVarE, "");
            this.f17735b = qVarE;
            qVar.hashCode();
            throw null;
        }
        super.safeOnCreate(bundle);
        q qVarE2 = q.e(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(qVarE2, "");
        this.f17735b = qVarE2;
        if (qVarE2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f17732x + 93;
            f17733y = i4 % 128;
            int i5 = i4 % 2;
            qVarE2 = null;
        }
        setContentView(qVarE2.e());
        DaggerIDTypeChooserComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent()).iDTypeChooserPresenterModule(new IDTypeChooserPresenterModule(this)).build().inject(this);
        q qVar2 = this.f17735b;
        if (qVar2 == null) {
            int i6 = f17732x + 3;
            f17733y = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                qVar.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            qVar2 = null;
        }
        qVar2.f7322e.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.tutorial.IDTypeChooserActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                IDTypeChooserActivity.a(this.f$0);
            }
        });
        Class<? extends BaseValidationActivity> cls = (Class) getIntent().getSerializableExtra("extraValidationClass");
        this.f17737d = cls;
        if (cls == null) {
            this.f17737d = ValidationActivity.class;
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("extraIdCategory");
        Intrinsics.checkNotNull(serializableExtra, "");
        this.f17739f = (IdCategory) serializableExtra;
        this.f17738e = getIntent().getBooleanExtra("extraShowTutorials", false);
        Serializable serializableExtra2 = getIntent().getSerializableExtra("extraModule");
        Intrinsics.checkNotNull(serializableExtra2, "");
        setModule((Modules) serializableExtra2);
        this.f17743j = getIntent().getBooleanExtra("extraEnableFrontShownAsBackCheck", false);
        this.f17742i = getIntent().getBooleanExtra("extraEnableBackShownAsFrontCheck", false);
        this.f17741h = getIntent().getBooleanExtra("showIdOverlay", false);
        IdScan.AutocaptureUXMode autocaptureUXMode = (IdScan.AutocaptureUXMode) getIntent().getParcelableExtra("extraAutoCaptureUXMode");
        if (autocaptureUXMode == null) {
            int i7 = f17732x + 33;
            f17733y = i7 % 128;
            int i8 = i7 % 2;
            autocaptureUXMode = c.f4655g;
            Intrinsics.checkNotNullExpressionValue(autocaptureUXMode, "");
        }
        this.f17740g = autocaptureUXMode;
        Serializable serializableExtra3 = getIntent().getSerializableExtra("extraScanStep");
        if (serializableExtra3 instanceof IdScan.ScanStep) {
            int i9 = f17732x + 27;
            f17733y = i9 % 128;
            if (i9 % 2 != 0) {
                scanStep = (IdScan.ScanStep) serializableExtra3;
                int i10 = 70 / 0;
            } else {
                scanStep = (IdScan.ScanStep) serializableExtra3;
            }
        } else {
            scanStep = null;
        }
        this.f17744k = scanStep;
        this.f17748o = getIntent().getIntExtra("extraAutoCaptureTimeout", 25);
        this.f17745l = getIntent().getIntExtra("extraAutoCaptureNoIdTimeout", 60);
        this.f17747n = getIntent().getIntExtra("extraCaptureAttempts", 3);
        this.f17746m = getIntent().getBooleanExtra("extraStreamAudioEnabled", false);
        this.f17751s = getIntent().getBooleanExtra("extraAgeAssuranceUxEnabled", false);
        q qVar3 = this.f17735b;
        if (qVar3 == null) {
            int i11 = f17732x + 105;
            f17733y = i11 % 128;
            if (i11 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            qVar3 = null;
        }
        qVar3.f7322e.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.IDTypeChooserActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IDTypeChooserActivity.m8570instrumented$1$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        q qVar4 = this.f17735b;
        if (qVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            qVar = qVar4;
        }
        qVar.f7319a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.IDTypeChooserActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IDTypeChooserActivity.m8571instrumented$2$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final boolean isDelayedOnboardingSupported() {
        int i2 = 2 % 2;
        int i3 = f17733y;
        int i4 = i3 + 101;
        f17732x = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 37;
        f17732x = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 41 / 0;
        }
        return true;
    }

    private static void C(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $11 + 15;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        hVar.f2753d = 0;
        char[] cArr3 = new char[2];
        while (hVar.f2753d < cArr.length) {
            int i7 = $11 + 77;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr3[i6] = cArr[hVar.f2753d];
            cArr3[1] = cArr[hVar.f2753d + 1];
            int i9 = 58224;
            int i10 = i6;
            while (i10 < 16) {
                int i11 = $10 + 113;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i6];
                int i13 = (c3 + i9) ^ ((c3 << 4) + ((char) (((long) f17729u) ^ (-995256607575678378L))));
                int i14 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f17730v);
                    objArr2[2] = Integer.valueOf(i14);
                    objArr2[1] = Integer.valueOf(i13);
                    objArr2[i6] = Integer.valueOf(c2);
                    Object objC = e.c(1785266233);
                    if (objC == null) {
                        char cArgb = (char) Color.argb(i6, i6, i6, i6);
                        int iMyTid = (Process.myTid() >> 22) + 18;
                        int iResolveOpacity = 600 - Drawable.resolveOpacity(i6, i6);
                        byte b2 = (byte) i6;
                        byte b3 = b2;
                        String str$$c = $$c(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i6] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objC = e.e(cArgb, iMyTid, iResolveOpacity, 1794310720, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f17727r) ^ (-995256607575678378L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f17728t)};
                    Object objC2 = e.c(1785266233);
                    if (objC2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objC2 = e.e((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 17 - Process.getGidForName(""), 600 - (ViewConfiguration.getTouchSlop() >> 8), 1794310720, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[hVar.f2753d] = cArr3[0];
            cArr2[hVar.f2753d + 1] = cArr3[1];
            Object[] objArr4 = {hVar, hVar};
            Object objC3 = e.c(-1055823967);
            if (objC3 == null) {
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 + 1);
                objC3 = e.e((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18, 675 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1047829032, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objC3).invoke(null, objArr4);
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private final void a() throws Exception {
        int i2 = 2 % 2;
        int i3 = WhenMappings.f17754c[getModule().ordinal()];
        if (i3 == 1) {
            IDTypeChooserPresenter mPresenter = getMPresenter();
            IdScan.IdType idType = IdScan.IdType.ID;
            IdCategory idCategory = this.f17739f;
            if (idCategory == null) {
                int i4 = f17733y + 83;
                f17732x = i4 % 128;
                idCategory = null;
                if (i4 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            mPresenter.persistIdType(idType, idCategory);
            Intent intentA = a(TutorialFrontActivity.class);
            CX.ud();
            startActivity(intentA);
        } else if (i3 != 2) {
            new RuntimeException("Unsupported module passed to IDTypeChooserActivity");
            int i5 = f17732x + 31;
            f17733y = i5 % 128;
            int i6 = i5 % 2;
        } else {
            getMPresenter().persistNfcIdType(IdScan.IdType.ID);
            e();
        }
        finish();
    }

    private final void c() throws Exception {
        int i2 = 2 % 2;
        int i3 = f17733y + 109;
        f17732x = i3 % 128;
        IdCategory idCategory = null;
        if (i3 % 2 == 0) {
            int i4 = WhenMappings.f17754c[getModule().ordinal()];
            idCategory.hashCode();
            throw null;
        }
        int i5 = WhenMappings.f17754c[getModule().ordinal()];
        if (i5 == 1) {
            IDTypeChooserPresenter mPresenter = getMPresenter();
            IdScan.IdType idType = IdScan.IdType.PASSPORT;
            IdCategory idCategory2 = this.f17739f;
            if (idCategory2 == null) {
                int i6 = f17732x + 53;
                f17733y = i6 % 128;
                if (i6 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                idCategory = idCategory2;
            }
            mPresenter.persistIdType(idType, idCategory);
            Intent intentA = a(TutorialPassportActivity.class);
            intentA.putExtra("extraIdValidationPhase", ValidationPhase.SCAN_PASSPORT);
            CX.ud();
            startActivity(intentA);
        } else if (i5 != 2) {
            new RuntimeException("Unsupported module passed to IDTypeChooserActivity");
        } else {
            getMPresenter().persistNfcIdType(IdScan.IdType.PASSPORT);
            e();
            int i7 = f17733y + 11;
            f17732x = i7 % 128;
            int i8 = i7 % 2;
        }
        finish();
    }

    private final Intent a(Class<?> cls) {
        Intent intent;
        int i2 = 2 % 2;
        if (this.f17738e) {
            intent = new Intent(this, cls);
            intent.putExtra("extraValidationClass", this.f17737d);
        } else {
            intent = new Intent(this, this.f17737d);
        }
        IdCategory idCategory = this.f17739f;
        IdScan.AutocaptureUXMode autocaptureUXMode = null;
        if (idCategory == null) {
            int i3 = f17733y + 103;
            f17732x = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            idCategory = null;
        }
        intent.putExtra("extraIdCategory", idCategory);
        intent.putExtra("extraEnableFrontShownAsBackCheck", this.f17743j);
        intent.putExtra("extraEnableBackShownAsFrontCheck", this.f17742i);
        IdScan.AutocaptureUXMode autocaptureUXMode2 = this.f17740g;
        if (autocaptureUXMode2 == null) {
            int i5 = f17733y + 55;
            f17732x = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                autocaptureUXMode.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            autocaptureUXMode = autocaptureUXMode2;
        }
        intent.putExtra("extraAutoCaptureUXMode", autocaptureUXMode);
        intent.putExtra("extraScanStep", this.f17744k);
        intent.putExtra("showIdOverlay", this.f17741h);
        intent.putExtra("extraAutoCaptureTimeout", this.f17748o);
        intent.putExtra("extraAutoCaptureNoIdTimeout", this.f17745l);
        intent.putExtra("extraCaptureAttempts", this.f17747n);
        intent.putExtra("extraStreamAudioEnabled", this.f17746m);
        intent.putExtra("extraAgeAssuranceUxEnabled", this.f17751s);
        return intent;
    }

    private final void e() throws Exception {
        int i2 = 2 % 2;
        if (getRepo().isShowNfcSymbolConfirmationScreen()) {
            int i3 = f17732x + 1;
            f17733y = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                C("ퟨ➢藷唷뀈驰ퟨ➢㑣됑䡧ﱪ돃ﱟퟨ➢ᩖ辱j퐷❊\uf27e摴\u1f7f釟垯畦䈟伸ꋭ涐䊔६\ued17귧旺䚁타\udfcb┳ꨕ\ud949臝ฌ圔\ud947産椫⸆Ӆ˂鲇穥뼊ᓺꈯ♮㰤\u0bfe뷡", 71 >> View.resolveSizeAndState(0, 0, 0), objArr);
                b(((String) objArr[0]).intern());
                return;
            }
            Object[] objArr2 = new Object[1];
            C("ퟨ➢藷唷뀈驰ퟨ➢㑣됑䡧ﱪ돃ﱟퟨ➢ᩖ辱j퐷❊\uf27e摴\u1f7f釟垯畦䈟伸ꋭ涐䊔६\ued17귧旺䚁타\udfcb┳ꨕ\ud949臝ฌ圔\ud947産椫⸆Ӆ˂鲇穥뼊ᓺꈯ♮㰤\u0bfe뷡", View.resolveSizeAndState(0, 0, 0) + 59, objArr2);
            b(((String) objArr2[0]).intern());
            return;
        }
        if (getRepo().isShowNfcTutorials()) {
            int i4 = f17732x + 55;
            f17733y = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr3 = new Object[1];
            C("ퟨ➢藷唷뀈驰ퟨ➢㑣됑䡧ﱪ돃ﱟퟨ➢ᩖ辱j퐷❊\uf27e摴\u1f7f釟垯畦䈟伸ꋭ涐䊔६\ued17訬㘫뢏亠囨昧뱍\uf46b짹륇ਆ롮穥뼊ᓺꈯ♮㰤\u0bfe뷡", ((Process.getThreadPriority(0) + 20) >> 6) + 53, objArr3);
            b(((String) objArr3[0]).intern());
            return;
        }
        Object[] objArr4 = new Object[1];
        C("ퟨ➢藷唷뀈驰ퟨ➢㑣됑䡧ﱪ돃ﱟퟨ➢ᩖ辱j퐷❊\uf27e摴\u1f7f釟垯畦䈟伸ꋭ涐䊔६\ued17訬㘫麫阍뀈驰裰❅穥뼊ᓺꈯ♮㰤\u0bfe뷡", (ViewConfiguration.getTapTimeout() >> 16) + 49, objArr4);
        b(((String) objArr4[0]).intern());
        int i6 = f17732x + 59;
        f17733y = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private final void b(String str) throws Exception {
        int i2 = 2 % 2;
        int i3 = f17732x + 71;
        f17733y = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                Class.forName(str);
                Intent className = new Intent().setClassName(this, str);
                CX.ud();
                startActivity(className);
                int i4 = f17733y + 31;
                f17732x = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            Class.forName(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            MissingNfcDependencyException missingNfcDependencyException = new MissingNfcDependencyException();
            Timber.Forest.e(missingNfcDependencyException);
            throw missingNfcDependencyException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IDTypeChooserActivity iDTypeChooserActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = f17733y + 61;
        f17732x = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(iDTypeChooserActivity, "");
        int i6 = WhenMappings.f17754c[iDTypeChooserActivity.getModule().ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                new RuntimeException("Unsupported module passed to IDTypeChooserActivity");
                return;
            } else {
                iDTypeChooserActivity.getMPresenter().submitNFCCancelledResult();
                return;
            }
        }
        iDTypeChooserActivity.getMPresenter().submitCancelledResult();
        int i7 = f17733y + 105;
        f17732x = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f17732x + 31;
        f17733y = i3 % 128;
        int i4 = i3 % 2;
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.IDTypeChooserActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                IDTypeChooserActivity.a(this.f$0, dialogInterface, i5);
            }
        });
        int i5 = f17732x + 67;
        f17733y = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.tutorial.IDTypeChooserContract.View
    public final void goBack() {
        int i2 = 2 % 2;
        int i3 = f17733y + 89;
        f17732x = i3 % 128;
        if (i3 % 2 != 0) {
            finish();
            int i4 = f17732x + 97;
            f17733y = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        finish();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17752a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17753b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f17754c;

        static {
            int[] iArr = new int[Modules.values().length];
            try {
                iArr[Modules.ID.ordinal()] = 1;
                int i2 = f17753b + 101;
                f17752a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Modules.NFC_SCAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17754c = iArr;
            int i5 = f17753b + 55;
            f17752a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 83 / 0;
            }
        }
    }

    static void b() {
        f17727r = (char) 6478;
        f17728t = (char) 15482;
        f17729u = (char) 62809;
        f17730v = (char) 57622;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f17731w = 0;
        f17734z = 1;
        f17733y = 0;
        f17732x = 1;
        b();
        new Companion(null);
        int i2 = f17734z + 75;
        f17731w = i2 % 128;
        int i3 = i2 % 2;
    }
}
