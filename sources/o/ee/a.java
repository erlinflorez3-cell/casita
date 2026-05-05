package o.ee;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.getface.controllers.IDGetFaceController;
import fr.antelop.sdk.R;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcessActivityCallback;
import fr.antelop.sdk.ui.LocaleManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import o.a.n;
import o.ea.f;
import o.n.a;
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

/* JADX INFO: loaded from: classes6.dex */
public final class a extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23691a = 1211435159;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static e f23692b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f23693c = 1752190522;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f23694d = 1443244946;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f23695e = -582287359;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static d f23696j = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f23697l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f23698m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static char[] f23699n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f23700o = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f23701s = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f23702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f23704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f23705i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f23706k;

    static {
        c();
        int i2 = f23700o + 83;
        f23701s = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 7 / 0;
        }
    }

    private void a() {
        String str;
        String strB;
        String strC;
        int i2 = 2 % 2;
        int i3 = f23697l + 87;
        f23698m = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Object[] objArr = {f23696j};
            int priority = Thread.currentThread().getPriority();
            int priority2 = Thread.currentThread().getPriority();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i4 = d.f23714a * (-1097789956);
            d.f23714a = i4;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {f23696j};
        int priority3 = Thread.currentThread().getPriority();
        int priority4 = Thread.currentThread().getPriority();
        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        int i5 = d.f23714a * (-1097789956);
        d.f23714a = i5;
        if (((String) d.c(432629012, i5, objArr2, priority4, iElapsedRealtime2, priority3, -432629012)) != null) {
            Object[] objArr3 = {f23696j};
            int priority5 = Thread.currentThread().getPriority();
            int priority6 = Thread.currentThread().getPriority();
            int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
            int i6 = d.f23714a * (-1097789956);
            d.f23714a = i6;
            str = (String) d.c(432629012, i6, objArr3, priority6, iElapsedRealtime3, priority5, -432629012);
        } else {
            str = this.f23705i;
        }
        if (f23696j.b() != null) {
            int i7 = f23697l + 101;
            f23698m = i7 % 128;
            if (i7 % 2 != 0) {
                f23696j.b();
                throw null;
            }
            strB = f23696j.b();
        } else {
            strB = this.f23702f;
        }
        if (f23696j.c() != null) {
            int i8 = f23698m + 107;
            f23697l = i8 % 128;
            int i9 = i8 % 2;
            strC = f23696j.c();
        } else {
            strC = this.f23704h;
        }
        ((TextView) findViewById(R.id.antelop_pin_prompt_title)).setText(str);
        ((TextView) findViewById(R.id.antelop_pin_prompt_subtitle)).setText(strB);
        TextView textView = (TextView) findViewById(R.id.antelop_pin_prompt_description);
        Object[] objArr4 = {f23696j};
        int i10 = d.f23715b * (-721725668);
        d.f23715b = i10;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i11 = d.f23716e * 756777998;
        d.f23716e = i11;
        if (((Boolean) d.c(-441459975, new Random().nextInt(), objArr4, iFreeMemory, i11, i10, 441459976)).booleanValue()) {
            textView.setText(strC);
            textView.setVisibility(0);
        } else {
            textView.setText("");
            textView.setVisibility(8);
        }
        d();
        int i12 = f23697l + 121;
        f23698m = i12 % 128;
        int i13 = i12 % 2;
    }

    static void a(Context context, e eVar, d dVar) {
        int i2 = 2 % 2;
        f23692b = eVar;
        f23696j = dVar;
        Intent intent = new Intent(context, (Class<?>) a.class);
        intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        if (!(context instanceof Activity)) {
            int i3 = f23697l + 85;
            f23698m = i3 % 128;
            if (i3 % 2 != 0) {
                intent.addFlags(268435456);
                int i4 = 35 / 0;
            } else {
                intent.addFlags(268435456);
            }
            int i5 = f23697l + 65;
            f23698m = i5 % 128;
            int i6 = i5 % 2;
        }
        CX.ud();
        Class<?> cls = Class.forName(Jg.Wd("65\u0006n\u0005Q'\f\u001bySs>\u001a9M<[tT F\u001d", (short) (FB.Xd() ^ IDGetFaceController.FACE_DATA_RESULT_MAX_REINTENTS), (short) (FB.Xd() ^ 27548)));
        Class<?>[] clsArr = {Class.forName(ZO.xd("0E\u0007B~~\u0003/O7M&!Ea\u001e~\u000fVT\u0002@", (short) (OY.Xd() ^ 9373), (short) (OY.Xd() ^ 1747)))};
        Object[] objArr = {intent};
        short sXd = (short) (C1607wl.Xd() ^ 11269);
        short sXd2 = (short) (C1607wl.Xd() ^ 10755);
        int[] iArr = new int["49eF&]u\u007f\r:9@H".length()];
        QB qb = new QB("49eF&]u\u007f\r:9@H");
        int i7 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i7] = xuXd.fK((C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i7 * sXd2))) + xuXd.CK(iKK));
            i7++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i7), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
            int i8 = f23697l + 75;
            f23698m = i8 % 128;
            int i9 = i8 % 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat) {
        int i2 = 2 % 2;
        int i3 = f23698m + 51;
        f23697l = i3 % 128;
        if (i3 % 2 == 0) {
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = insets.top;
            marginLayoutParams.bottomMargin = insets.bottom;
            view.setLayoutParams(marginLayoutParams);
            WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.CONSUMED;
            throw null;
        }
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams2.topMargin = insets2.top;
        marginLayoutParams2.bottomMargin = insets2.bottom;
        view.setLayoutParams(marginLayoutParams2);
        WindowInsetsCompat windowInsetsCompat3 = WindowInsetsCompat.CONSUMED;
        int i4 = f23698m + 87;
        f23697l = i4 % 128;
        if (i4 % 2 != 0) {
            return windowInsetsCompat3;
        }
        throw null;
    }

    public static /* synthetic */ Object b(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~i6;
        int i10 = ~i4;
        int i11 = ~(i9 | i10);
        int i12 = (i11 + i8) - (i11 & i8);
        int i13 = ~((-1) - (((-1) - ((-1) - (((-1) - i9) & ((-1) - i2)))) & ((-1) - i4)));
        int i14 = (~((-1) - (((-1) - i4) & ((-1) - i2)))) | ((-1) - (((-1) - (~((i8 + i10) - (i8 & i10)))) & ((-1) - i9)));
        int i15 = i6 + i2 + i3 + (62936680 * i7) + ((-2032430997) * i5);
        int i16 = i15 * i15;
        int i17 = ((-476632153) * i6) + 797966336 + (1756943451 * i2) + (i12 * (-1030695846)) + ((-1030695846) * i13) + (1030695846 * i14) + ((-1507328000) * i3) + ((-264241152) * i7) + ((-222822400) * i5) + (2040594432 * i16);
        int i18 = ((i6 * 1175661207) - 43826732) + (i2 * 1175659659) + (i12 * (-774)) + (i13 * (-774)) + (i14 * 774) + (i3 * 1175660433) + (i7 * 1188219112) + (i5 * (-816965221)) + (i16 * 1798373376);
        return i17 + ((i18 * i18) * 914292736) != 1 ? e(objArr) : d(objArr);
    }

    private /* synthetic */ void b(View view) {
        int i2 = f23694d * 1850947814;
        f23694d = i2;
        int iMyUid = Process.myUid();
        int i3 = f23691a * (-1899857209);
        f23691a = i3;
        b(-14121244, new Object[]{this, view}, iMyUid, i2, (int) Runtime.getRuntime().totalMemory(), 14121244, i3);
    }

    static void c() {
        f23699n = new char[]{56516, 56325, 56573, 56574, 56574, 56573, 56570, 56545, 56553, 56323, 56321, 56574, 56554, 56550, 56570, 56322, 56571, 56563, 56555, 56559, 56570, 56555};
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        a aVar = (a) objArr[0];
        Context context = (Context) objArr[1];
        int i2 = 2 % 2;
        int i3 = f23697l + 123;
        f23698m = i3 % 128;
        if (i3 % 2 != 0) {
            super.attachBaseContext(LocaleManager.getInstance().getLocalizedContext(context));
            int i4 = 73 / 0;
        } else {
            super.attachBaseContext(LocaleManager.getInstance().getLocalizedContext(context));
        }
        int i5 = f23698m + 45;
        f23697l = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c A[PHI: r2
  0x001c: PHI (r2v3 o.n.a) = (r2v1 o.n.a), (r2v5 o.n.a) binds: [B:10:0x0036, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = o.ee.a.f23698m
            int r1 = r0 + 87
            int r0 = r1 % 128
            o.ee.a.f23697l = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L2c
            int r0 = fr.antelop.sdk.R.id.antelop_pin_prompt_keypad
            android.view.View r2 = r4.findViewById(r0)
            o.n.a r2 = (o.n.a) r2
            boolean r1 = r4.f23703g
            r0 = 0
            int r0 = r0 / r0
            if (r1 == 0) goto L1f
        L1c:
            r2.scramble()
        L1f:
            r2.resetPasscode()
            int r0 = o.ee.a.f23698m
            int r1 = r0 + 89
            int r0 = r1 % 128
            o.ee.a.f23697l = r0
            int r1 = r1 % r3
            return
        L2c:
            int r0 = fr.antelop.sdk.R.id.antelop_pin_prompt_keypad
            android.view.View r2 = r4.findViewById(r0)
            o.n.a r2 = (o.n.a) r2
            boolean r0 = r4.f23703g
            if (r0 == 0) goto L1f
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ee.a.d():void");
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23698m + 69;
        f23697l = i3 % 128;
        int i4 = i3 % 2;
        aVar.finish();
        f23692b.onDisplayCancelled();
        int i5 = f23697l + 37;
        f23698m = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$onCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m10634instrumented$1$onCreate$LandroidosBundleV(a aVar, View view) {
        Callback.onClick_enter(view);
        try {
            aVar.b(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$onCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m10635instrumented$2$onCreate$LandroidosBundleV(a aVar, View view) {
        Callback.onClick_enter(view);
        try {
            aVar.b(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr = {this, context};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        Method method = Class.forName(Ig.wd("\u0004;]\"\u0005)F>* \u0018=\u0001\u001f:\u0010C>\u007fz\u000elbS\u001cx", (short) (C1633zX.Xd() ^ (-9770)))).getMethod(EO.Od("-\u0007\u0014:X\u000eu5B\u0016\fj0,+\u0002U:", (short) (FB.Xd() ^ 399)), new Class[0]);
        Context context2 = (Context) method.invoke(null, null);
        Class<?> cls = Class.forName(C1561oA.Qd("AMBOKD>\u0007;FDI9AF~\u0013><A1C>", (short) (C1499aX.Xd() ^ (-17280))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr2 = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 32610);
        short sXd2 = (short) (ZN.Xd() ^ 31852);
        int[] iArr = new int[" \u001f/\u000e\"1.53%(7".length()];
        QB qb = new QB(" \u001f/\u000e\"1.53%(7");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method2.setAccessible(true);
            int i3 = ((Resources) method2.invoke(context2, objArr2)).getDisplayMetrics().heightPixels;
            int i4 = f23693c * (-376433747);
            f23693c = i4;
            int i5 = f23695e * 1847327358;
            f23695e = i5;
            b(1394227894, objArr, i3, iMaxMemory, i5, -1394227893, i4);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void b(d dVar) {
        int i2 = 2 % 2;
        int i3 = f23697l + 79;
        f23698m = i3 % 128;
        int i4 = i3 % 2;
        f23696j = dVar;
        a();
        int i5 = f23697l + 11;
        f23698m = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
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
            short sXd = (short) (ZN.Xd() ^ (899383243 ^ 899365588));
            int[] iArr = new int["(\u0015Z\u0018{".length()];
            QB qb = new QB("(\u0015Z\u0018{");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            short sXd2 = (short) (C1607wl.Xd() ^ (1460255857 ^ 1460257716));
            int[] iArr2 = new int["hW".length()];
            QB qb2 = new QB("hW");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                i3++;
            }
            String str2 = new String(iArr2, 0, i3);
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strZd = Wg.Zd("XY+\u0014$", (short) (Od.Xd() ^ ((1455949030 ^ 572234560) ^ (-1960046050))), (short) (Od.Xd() ^ ((1563821674 ^ 563563111) ^ (-2090936880))));
                String strXd = C1561oA.Xd("\u0007t", (short) (FB.Xd() ^ (1136856179 ^ 1136859997)));
                try {
                    Class<?> cls2 = Class.forName(strZd);
                    Field field2 = 0 != 0 ? cls2.getField(strXd) : cls2.getDeclaredField(strXd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    short sXd3 = (short) (C1499aX.Xd() ^ (664053441 ^ (-664044496)));
                    int[] iArr3 = new int["WF\nI3".length()];
                    QB qb3 = new QB("WF\nI3");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((sXd3 ^ i4) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    String str3 = new String(iArr3, 0, i4);
                    String strKd = Qg.kd(", ", (short) (C1580rY.Xd() ^ (730635073 ^ (-730629250))), (short) (C1580rY.Xd() ^ ((250809133 ^ 1630074862) ^ (-1876669090))));
                    try {
                        Class<?> cls3 = Class.forName(str3);
                        Field field3 = 0 != 0 ? cls3.getField(strKd) : cls3.getDeclaredField(strKd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(hg.Vd("q^$mM", (short) (FB.Xd() ^ (826889207 ^ 826871062)), (short) (FB.Xd() ^ (1551404419 ^ 1551425256)))).getDeclaredMethod(C1561oA.ud("\u000e\u0019", (short) (C1607wl.Xd() ^ (1535600121 ^ 1535596751))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strYd = C1561oA.yd("\u0016\u0007\u000b\u007f\n\u0011", (short) (ZN.Xd() ^ (1885980387 ^ 1885968044)));
                                short sXd4 = (short) (C1633zX.Xd() ^ ((1343896596 ^ 1018777239) ^ (-1822632900)));
                                int[] iArr4 = new int["1?6EC>:\u0005;HHOAKR\r#PPWI]Z".length()];
                                QB qb4 = new QB("1?6EC>:\u0005;HHOAKR\r#PPWI]Z");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (((sXd4 + sXd4) + sXd4) + i5));
                                    i5++;
                                }
                                Object[] objArr2 = {strYd};
                                Method method = Class.forName(new String(iArr4, 0, i5)).getMethod(Jg.Wd("/tpPc.\u001c\u000e\u0003\u001e\u0019+\u0018_BI", (short) (C1580rY.Xd() ^ ((1495228253 ^ 1015034703) ^ (-1704919646))), (short) (C1580rY.Xd() ^ (283540003 ^ (-283518662)))), Class.forName(Xg.qd("\u0016\u000e$\u0010]\u001d\u0013!\u001bb\t+*\"(\"", (short) (ZN.Xd() ^ ((1076205109 ^ 1054181689) ^ 2129683434)), (short) (ZN.Xd() ^ (2061750824 ^ 2061756289)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strXd2 = ZO.xd("hI\r!\u001d", (short) (Od.Xd() ^ (884001648 ^ (-884005281))), (short) (Od.Xd() ^ (648102854 ^ (-648103689))));
                                    String strUd = C1626yg.Ud("+\u0018", (short) (C1633zX.Xd() ^ ((1290462079 ^ 197141500) ^ (-1193977772))), (short) (C1633zX.Xd() ^ ((414208556 ^ 2008575799) ^ (-1862810975))));
                                    try {
                                        Class<?> cls4 = Class.forName(strXd2);
                                        Field field4 = 0 != 0 ? cls4.getField(strUd) : cls4.getDeclaredField(strUd);
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
                    String strWd = Ig.wd("_t9X&", (short) (C1499aX.Xd() ^ ((668420705 ^ 483576352) ^ (-990233805))));
                    String strOd = EO.Od("/u", (short) (C1580rY.Xd() ^ (1537902592 ^ (-1537916744))));
                    try {
                        Class<?> cls5 = Class.forName(strWd);
                        Field field5 = 0 != 0 ? cls5.getField(strOd) : cls5.getDeclaredField(strOd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strQd = C1561oA.Qd("zg-jN", (short) (C1580rY.Xd() ^ ((315552576 ^ 1406690865) ^ (-1092013669))));
                        String strZd2 = C1593ug.zd("\f\u0002", (short) (C1607wl.Xd() ^ (1727665649 ^ 1727687028)), (short) (C1607wl.Xd() ^ (387439472 ^ 387435516)));
                        try {
                            Class<?> cls6 = Class.forName(strQd);
                            Field field6 = 0 != 0 ? cls6.getField(strZd2) : cls6.getDeclaredField(strZd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i6 = (606106805 ^ 545781580) ^ 78087090;
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) throws Throwable {
        ImageView imageView;
        View.OnClickListener onClickListener;
        int i2 = 2 % 2;
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        super.onCreate(bundle);
        if (f23692b == null) {
            finish();
            return;
        }
        setTheme(R.style.antelopSecurePinInputThemeInternal);
        if (f23696j.a() != null) {
            CustomerAuthenticatedProcessActivityCallback customerAuthenticatedProcessActivityCallbackA = f23696j.a();
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("\u0015!\u0016#\u001f\u0018\u0012Z\u000f\u001a\u0018\u001d\r\u0015\u001aRf\u0012\u0010\u0015\u0005\u0017\u0012", (short) (C1499aX.Xd() ^ (-17098)))).getMethod(C1561oA.Kd("UTd2bc`^YXlbii?llseyv", (short) (C1580rY.Xd() ^ (-24513))), new Class[0]);
            try {
                method.setAccessible(true);
                customerAuthenticatedProcessActivityCallbackA.onActivityStart((Context) method.invoke(this, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Object[] objArr2 = new Object[0];
        Method method2 = Class.forName(Wg.Zd("%CBhnx\r_-JQpi\u000e%f\u0015IYwq\u001e*", (short) (C1607wl.Xd() ^ 3675), (short) (C1607wl.Xd() ^ 7760))).getMethod(C1561oA.Xd("\"!1\u0012'%.'", (short) (C1499aX.Xd() ^ (-9249))), new Class[0]);
        try {
            method2.setAccessible(true);
            Resources.Theme theme = (Resources.Theme) method2.invoke(this, objArr2);
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_defaultTitle, typedValue, true);
            this.f23705i = getResources().getString(typedValue.resourceId);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_defaultSubTitle, typedValue, true);
            this.f23702f = getResources().getString(typedValue.resourceId);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_pinsNotMatchingErrorDescription, typedValue, true);
            this.f23704h = getResources().getString(typedValue.resourceId);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_randomizeKeyboard, typedValue, true);
            this.f23703g = getResources().getBoolean(typedValue.resourceId);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_showCloseButton, typedValue, true);
            boolean z2 = getResources().getBoolean(typedValue.resourceId);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_pinSize, typedValue, true);
            int integer = getResources().getInteger(typedValue.resourceId);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_colorPrimary, typedValue, true);
            int i3 = f23698m + 95;
            f23697l = i3 % 128;
            if (i3 % 2 == 0) {
                getResources().getColor(typedValue.resourceId, theme);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int color = getResources().getColor(typedValue.resourceId, theme);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_colorSecondary, typedValue, true);
            int i4 = f23698m + 3;
            f23697l = i4 % 128;
            int i5 = i4 % 2;
            int color2 = getResources().getColor(typedValue.resourceId, theme);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_cancelButtonAccessibilityLabel, typedValue, true);
            String string = getResources().getString(typedValue.resourceId);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_deleteButtonAccessibilityLabel, typedValue, true);
            String string2 = getResources().getString(typedValue.resourceId);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_deleteButtonAccessibilityHint, typedValue, true);
            String string3 = getResources().getString(typedValue.resourceId);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_digitsCounterAccessibilityLabel, typedValue, true);
            String string4 = getResources().getString(typedValue.resourceId);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_digitsCounterAccessibilityValueFormat, typedValue, true);
            String string5 = getResources().getString(typedValue.resourceId);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_bulletIcon, typedValue, true);
            int i6 = typedValue.resourceId;
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_deleteIcon, typedValue, true);
            int i7 = typedValue.resourceId;
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_alphaStyle, typedValue, true);
            int i8 = typedValue.resourceId;
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_displayAlpha, typedValue, true);
            boolean z3 = getResources().getBoolean(typedValue.resourceId);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_digitStyle, typedValue, true);
            int i9 = typedValue.resourceId;
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_backgroundStyle, typedValue, true);
            int i10 = typedValue.resourceId;
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_closeIcon, typedValue, true);
            int i11 = typedValue.resourceId;
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_enableOverlayProtection, typedValue, true);
            boolean z4 = getResources().getBoolean(typedValue.resourceId);
            theme.resolveAttribute(R.attr.antelopSecurePinInputThemeInternal_overlayWarningMessage, typedValue, true);
            String string6 = getResources().getString(typedValue.resourceId);
            setContentView(R.layout.antelop_pin_prompt_fragment);
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.antelop_pin_prompt_root);
            constraintLayout.setBackgroundResource(R.color.antelopSecurePinInputColorBackground);
            ViewCompat.setOnApplyWindowInsetsListener(constraintLayout, new OnApplyWindowInsetsListener() { // from class: o.ee.a$$ExternalSyntheticLambda0
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return a.b(view, windowInsetsCompat);
                }
            });
            if (o.bk.b.e()) {
                o.eb.a.c(this);
            }
            o.n.a aVar = (o.n.a) findViewById(R.id.antelop_pin_prompt_keypad);
            if (z4) {
                aVar.enableOverlayProtection(string6);
            }
            aVar.initializeView(new a.b() { // from class: o.ee.a.3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f23711b = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f23712d = 1;

                @Override // o.n.a.b
                public final void onExtraButtonPressed() {
                    int i12 = 2 % 2;
                    int i13 = f23711b + 51;
                    f23712d = i13 % 128;
                    if (i13 % 2 != 0) {
                        return;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                @Override // o.n.a.b
                public final void onKeyPressed() {
                    int i12 = 2 % 2;
                    int i13 = f23712d;
                    int i14 = (i13 ^ 71) + ((i13 & 71) << 1);
                    f23711b = i14 % 128;
                    int i15 = i14 % 2;
                }

                @Override // o.n.a.b
                public final void onPasscodeEntryDone(byte[] bArr) {
                    int i12 = 2 % 2;
                    int i13 = f23711b + 89;
                    f23712d = i13 % 128;
                    int i14 = i13 % 2;
                    if (!(!a.f23692b.c(bArr, a.this))) {
                        int i15 = f23712d;
                        int i16 = ((i15 | 23) << 1) - (i15 ^ 23);
                        f23711b = i16 % 128;
                        if (i16 % 2 != 0) {
                            a.this.finish();
                            a.f23692b.onDisplaySuccess();
                            int i17 = 58 / 0;
                        } else {
                            a.this.finish();
                            a.f23692b.onDisplaySuccess();
                        }
                        int i18 = f23711b + 7;
                        f23712d = i18 % 128;
                        int i19 = i18 % 2;
                    }
                    int i20 = f23711b;
                    int i21 = (i20 ^ 61) + (((-1) - (((-1) - i20) | ((-1) - 61))) << 1);
                    f23712d = i21 % 128;
                    int i22 = i21 % 2;
                }
            }, new a.e(integer, i6, color, color2, string4, string5, i9, i8, i10, i7, 0, null, null, string2, string3, z3));
            if (z2) {
                int i12 = f23697l + 59;
                f23698m = i12 % 128;
                if (i12 % 2 != 0) {
                    imageView = (ImageView) findViewById(R.id.antelop_pin_prompt_cancel);
                    imageView.setImageResource(i11);
                    imageView.setVisibility(1);
                    imageView.setContentDescription(string);
                    onClickListener = new View.OnClickListener() { // from class: o.ee.a$$ExternalSyntheticLambda2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            a.m10635instrumented$2$onCreate$LandroidosBundleV(this.f$0, view);
                        }
                    };
                } else {
                    imageView = (ImageView) findViewById(R.id.antelop_pin_prompt_cancel);
                    imageView.setImageResource(i11);
                    imageView.setVisibility(0);
                    imageView.setContentDescription(string);
                    onClickListener = new View.OnClickListener() { // from class: o.ee.a$$ExternalSyntheticLambda1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            a.m10634instrumented$1$onCreate$LandroidosBundleV(this.f$0, view);
                        }
                    };
                }
                imageView.setOnClickListener(onClickListener);
            }
            a();
            this.f23706k = new b();
            getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: o.ee.a.1
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f23707c = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f23708d = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f23709e = 0;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$c(short r9, short r10, int r11) {
                    /*
                        byte[] r8 = o.ee.a.AnonymousClass1.$$a
                        int r0 = r9 * 2
                        int r7 = r0 + 113
                        int r0 = r11 * 2
                        int r6 = 1 - r0
                        int r0 = r10 * 2
                        int r5 = 4 - r0
                        byte[] r4 = new byte[r6]
                        r3 = 0
                        if (r8 != 0) goto L2a
                        r7 = r5
                        r0 = r6
                        r2 = r3
                    L16:
                        int r5 = r5 + 1
                        int r7 = r7 + r0
                        r1 = r2
                    L1a:
                        int r2 = r1 + 1
                        byte r0 = (byte) r7
                        r4[r1] = r0
                        if (r2 != r6) goto L27
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r3)
                        return r0
                    L27:
                        r0 = r8[r5]
                        goto L16
                    L2a:
                        r1 = r3
                        goto L1a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.ee.a.AnonymousClass1.$$c(short, short, int):java.lang.String");
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    f23708d = 0;
                    f23709e = 1;
                    f23707c = -1270219351;
                }

                private static void a(int i13, String str, boolean z5, int i14, int i15, Object[] objArr3) throws Throwable {
                    Object charArray;
                    String str2 = str;
                    int i16 = 2 % 2;
                    if (str2 != null) {
                        int i17 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        charArray = str2.toCharArray();
                    } else {
                        charArray = str2;
                    }
                    char[] cArr = (char[]) charArray;
                    n nVar = new n();
                    char[] cArr2 = new char[i13];
                    nVar.f19944a = 0;
                    while (nVar.f19944a < i13) {
                        nVar.f19946e = cArr[nVar.f19944a];
                        cArr2[nVar.f19944a] = (char) (i14 + nVar.f19946e);
                        int i19 = nVar.f19944a;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr2[i19]), Integer.valueOf(f23707c)};
                            Object objA = o.d.d.a(1376241034);
                            if (objA == null) {
                                byte b2 = (byte) 1;
                                byte b3 = (byte) (b2 - 1);
                                objA = o.d.d.a(270 - (Process.myTid() >> 22), (char) View.MeasureSpec.getSize(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr2[i19] = ((Character) ((Method) objA).invoke(null, objArr4)).charValue();
                            Object[] objArr5 = {nVar, nVar};
                            Object objA2 = o.d.d.a(-202660535);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objA2 = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 522, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 12 - View.getDefaultSize(0, 0), 627984172, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA2).invoke(null, objArr5);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    if (i15 > 0) {
                        nVar.f19945b = i15;
                        char[] cArr3 = new char[i13];
                        System.arraycopy(cArr2, 0, cArr3, 0, i13);
                        System.arraycopy(cArr3, 0, cArr2, i13 - nVar.f19945b, nVar.f19945b);
                        System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i13 - nVar.f19945b);
                        int i20 = $11 + 41;
                        $10 = i20 % 128;
                        int i21 = i20 % 2;
                    }
                    if (z5) {
                        int i22 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                        $10 = i22 % 128;
                        int i23 = i22 % 2;
                        char[] cArr4 = new char[i13];
                        nVar.f19944a = 0;
                        while (nVar.f19944a < i13) {
                            cArr4[nVar.f19944a] = cArr2[(i13 - nVar.f19944a) - 1];
                            Object[] objArr6 = {nVar, nVar};
                            Object objA3 = o.d.d.a(-202660535);
                            if (objA3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objA3 = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 523, (char) View.MeasureSpec.getSize(0), '<' - AndroidCharacter.getMirror('0'), 627984172, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA3).invoke(null, objArr6);
                            int i24 = $11 + 101;
                            $10 = i24 % 128;
                            int i25 = i24 % 2;
                        }
                        int i26 = $11 + 53;
                        $10 = i26 % 128;
                        int i27 = i26 % 2;
                        cArr2 = cArr4;
                    }
                    objArr3[0] = new String(cArr2);
                }

                static void init$0() {
                    $$a = new byte[]{34, -117, -98, -86};
                    $$b = 182;
                }

                @Override // androidx.activity.OnBackPressedCallback
                public final void handleOnBackPressed() throws Throwable {
                    int i13 = 2 % 2;
                    int i14 = f23709e + 83;
                    f23708d = i14 % 128;
                    int i15 = i14 % 2;
                    if (f.a()) {
                        int i16 = f23708d + 77;
                        f23709e = i16 % 128;
                        int i17 = i16 % 2;
                        Object[] objArr3 = new Object[1];
                        a(23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\t\u000e\rￚ￼\r\u0002\u000f\u0002\r\u0012￩\u0002\u0007￬\ufffe￼\u000e\u000b\ufffe￢\u0007", false, TextUtils.lastIndexOf("", '0') + 282, (Process.myTid() >> 22) + 11, objArr3);
                        String strIntern = ((String) objArr3[0]).intern();
                        Object[] objArr4 = new Object[1];
                        a(TextUtils.indexOf((CharSequence) "", '0') + 14, "￫\r\u0000\u000e\u000e\u0000\uffff\n\t\uffdd￼\ufffe\u0006", false, 280 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7, objArr4);
                        f.c(strIntern, ((String) objArr4[0]).intern());
                        int i18 = f23708d + 89;
                        f23709e = i18 % 128;
                        int i19 = i18 % 2;
                    }
                    a.this.finish();
                    a.f23692b.onDisplayCancelled();
                }
            });
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f23697l + 61;
        f23698m = i3 % 128;
        int i4 = i3 % 2;
        if (f23696j.a() != null) {
            f23696j.a().onActivityStop();
        }
        super.onDestroy();
        int i5 = f23697l + 117;
        f23698m = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        int i2 = 2 % 2;
        int i3 = f23698m + 81;
        f23697l = i3 % 128;
        if (i3 % 2 != 0) {
            super.onNewIntent(intent);
            return;
        }
        super.onNewIntent(intent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onPause() {
        int i2 = 2 % 2;
        int i3 = f23698m + 49;
        f23697l = i3 % 128;
        int i4 = i3 % 2;
        super.onPause();
        int i5 = f23698m + 125;
        f23697l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onResume() {
        int i2 = 2 % 2;
        int i3 = f23697l + 73;
        f23698m = i3 % 128;
        int i4 = i3 % 2;
        super.onResume();
        int i5 = f23697l + 55;
        f23698m = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        int i2 = 2 % 2;
        int i3 = f23698m + 109;
        f23697l = i3 % 128;
        int i4 = i3 % 2;
        super.onStart();
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
