package o.n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.h;
import o.j.e;
import o.m.m;
import o.n.a;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
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
public final class d extends o.l.c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static final int A;
    private static final int B;
    private static final int C;
    private static final int D;
    private static final int E;
    private static final int F;
    private static final int G;
    private static final int H;
    private static final int I;
    private static final int J;
    private static final int K;
    private static final int L;
    private static final int M;
    private static final int N;
    private static final int Q;
    private static char ad = 0;
    private static int af = 0;
    private static char[] ah = null;
    public static int ai = 0;
    private static int aj = 0;
    public static int ak = 0;
    private static int al = 0;
    private static int am = 0;
    public static int an = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f26629m = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f26630p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f26631q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f26632r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f26633s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f26634t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f26635u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f26636v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f26637w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f26638x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static int f26639y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f26640z;
    private final String O;
    private o.l.a P;
    private FragmentManager R;
    private final String S;
    private String T;
    private String U;
    private String V;
    private String W;
    private String X;
    private String Y;
    private String Z;
    private final boolean aa;
    private final c ab;
    private final boolean ac;
    private final int ae;
    private final int ag;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final m f26641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    b f26642l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f26643n;

    public interface c {
        String getMessage(int i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r8, int r9, int r10) {
        /*
            int r7 = r8 + 102
            byte[] r8 = o.n.d.$$c
            int r0 = r9 * 4
            int r0 = r0 + 4
            int r2 = r10 * 4
            int r1 = 1 - r2
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2d
            r2 = r0
            r7 = r4
            r3 = r5
        L16:
            int r1 = -r0
            int r0 = r2 + 1
            int r7 = r7 + r1
            r2 = r3
        L1b:
            byte r1 = (byte) r7
            r6[r2] = r1
            int r3 = r2 + 1
            if (r2 != r4) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L28:
            r1 = r8[r0]
            r2 = r0
            r0 = r1
            goto L16
        L2d:
            r2 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n.d.$$g(short, int, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        an = -94799099;
        ak = 18649540;
        ai = -23665434;
        init$0();
        f26636v = 1236463161;
        f26639y = 889704071;
        f26637w = 76385966;
        f26635u = 1211401070;
        f26638x = 327704258;
        f26632r = -552405235;
        f26630p = -1254821804;
        f26634t = 381317579;
        f26631q = -145532047;
        f26633s = 1444932785;
        f26629m = -2128854302;
        am = 0;
        aj = 1;
        af = 0;
        al = 1;
        y();
        A = R.string.antelopPinPromptName;
        B = R.string.antelopPinPromptDefaultTitle;
        f26640z = R.string.antelopPinPromptDefaultSubtitle;
        D = R.string.antelopPinPromptDefaultPinErrorMessage;
        C = R.string.antelopPinPromptCancelButtonAccessibilityLabel;
        E = R.string.antelopPinPromptDeleteButtonAccessibilityLabel;
        G = R.string.antelopPinPromptDeleteButtonAccessibilityHint;
        F = R.string.antelopPinPromptDigitsCounterAccessibilityLabel;
        I = R.string.antelopPinPromptDigitsCounterAccessibilityValueFormat;
        H = R.string.antelopPinPromptBiometryFallbackAccessibilityLabel;
        J = R.string.antelopPinPromptBiometryFallbackAccessibilityHint;
        K = R.bool.antelopPinPromptShowCancelButton;
        M = R.drawable.antelopPinPromptIcon;
        L = R.bool.antelopPinPromptRandomizeKeyboard;
        N = R.drawable.antelopPinPromptBulletIcon;
        Q = R.integer.antelopPinPromptPinSize;
        int i2 = am + 113;
        aj = i2 % 128;
        int i3 = i2 % 2;
    }

    public d(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, c cVar, m mVar, boolean z2) {
        super(c(context), M);
        if (str == null) {
            Object[] objArr = {d(context)};
            int i2 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i2;
            int i3 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i3;
            this.O = (String) o.ea.m.c(objArr, (int) SystemClock.uptimeMillis(), i3, -327535505, i2, 327535505, Process.myUid());
        } else {
            int i4 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i4;
            int i5 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i5;
            this.O = (String) o.ea.m.c(new Object[]{str}, (int) SystemClock.uptimeMillis(), i5, -327535505, i4, 327535505, Process.myUid());
        }
        if (str2 == null) {
            int i6 = f26630p * 1262328595;
            f26630p = i6;
            int i7 = (-1040599365) * f26632r;
            f26632r = i7;
            int i8 = f26638x * (-243038071);
            f26638x = i8;
            Object[] objArr2 = {(String) e(i8, new Object[]{context}, i7, Thread.currentThread().getPriority(), i6, -1310461682, 1310461685)};
            int i9 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i9;
            int i10 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i10;
            this.S = (String) o.ea.m.c(objArr2, (int) SystemClock.uptimeMillis(), i10, -327535505, i9, 327535505, Process.myUid());
        } else {
            int i11 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i11;
            int i12 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i12;
            this.S = (String) o.ea.m.c(new Object[]{str2}, (int) SystemClock.uptimeMillis(), i12, -327535505, i11, 327535505, Process.myUid());
        }
        if (str3 == null) {
            Object[] objArr3 = {e(context)};
            int i13 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i13;
            int i14 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i14;
            this.V = (String) o.ea.m.c(objArr3, (int) SystemClock.uptimeMillis(), i14, -327535505, i13, 327535505, Process.myUid());
        } else {
            int i15 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i15;
            int i16 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i16;
            this.V = (String) o.ea.m.c(new Object[]{str3}, (int) SystemClock.uptimeMillis(), i16, -327535505, i15, 327535505, Process.myUid());
        }
        if (str4 == null) {
            Object[] objArr4 = {b(context)};
            int i17 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i17;
            int i18 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i18;
            this.T = (String) o.ea.m.c(objArr4, (int) SystemClock.uptimeMillis(), i18, -327535505, i17, 327535505, Process.myUid());
        } else {
            int i19 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i19;
            int i20 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i20;
            this.T = (String) o.ea.m.c(new Object[]{str4}, (int) SystemClock.uptimeMillis(), i20, -327535505, i19, 327535505, Process.myUid());
        }
        if (str5 == null) {
            int i21 = f26636v * (-1008110841);
            f26636v = i21;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            Object[] objArr5 = {(String) e(Process.myUid(), new Object[]{context}, iFreeMemory, Process.myPid(), i21, -497079402, 497079407)};
            int i22 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i22;
            int i23 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i23;
            this.W = (String) o.ea.m.c(objArr5, (int) SystemClock.uptimeMillis(), i23, -327535505, i22, 327535505, Process.myUid());
        } else {
            int i24 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i24;
            int i25 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i25;
            this.W = (String) o.ea.m.c(new Object[]{str5}, (int) SystemClock.uptimeMillis(), i25, -327535505, i24, 327535505, Process.myUid());
        }
        if (str6 == null) {
            Object[] objArr6 = {g(context)};
            int i26 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i26;
            int i27 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i27;
            this.U = (String) o.ea.m.c(objArr6, (int) SystemClock.uptimeMillis(), i27, -327535505, i26, 327535505, Process.myUid());
        } else {
            int i28 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i28;
            int i29 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i29;
            this.U = (String) o.ea.m.c(new Object[]{str6}, (int) SystemClock.uptimeMillis(), i29, -327535505, i28, 327535505, Process.myUid());
        }
        if (str7 == null) {
            Object[] objArr7 = {f(context)};
            int i30 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i30;
            int i31 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i31;
            this.X = (String) o.ea.m.c(objArr7, (int) SystemClock.uptimeMillis(), i31, -327535505, i30, 327535505, Process.myUid());
        } else {
            int i32 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i32;
            int i33 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i33;
            this.X = (String) o.ea.m.c(new Object[]{str7}, (int) SystemClock.uptimeMillis(), i33, -327535505, i32, 327535505, Process.myUid());
        }
        if (str8 == null) {
            int i34 = f26635u * 2006609834;
            f26635u = i34;
            int i35 = f26637w * (-1041446823);
            f26637w = i35;
            int iActiveCount = Thread.activeCount();
            int i36 = f26639y * 1264636589;
            f26639y = i36;
            Object[] objArr8 = {(String) e(iActiveCount, new Object[]{context}, i35, i36, i34, 988800632, -988800628)};
            int i37 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i37;
            int i38 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i38;
            this.Y = (String) o.ea.m.c(objArr8, (int) SystemClock.uptimeMillis(), i38, -327535505, i37, 327535505, Process.myUid());
        } else {
            int i39 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i39;
            int i40 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i40;
            this.Y = (String) o.ea.m.c(new Object[]{str8}, (int) SystemClock.uptimeMillis(), i40, -327535505, i39, 327535505, Process.myUid());
        }
        if (str9 == null) {
            Object[] objArr9 = {h(context)};
            int i41 = 691068131 * o.ea.m.f23563d;
            o.ea.m.f23563d = i41;
            int i42 = (-1916120846) * o.ea.m.f23561b;
            o.ea.m.f23561b = i42;
            this.Z = (String) o.ea.m.c(objArr9, (int) SystemClock.uptimeMillis(), i42, -327535505, i41, 327535505, Process.myUid());
        } else {
            int i43 = 691068131 * o.ea.m.f23563d;
            o.ea.m.f23563d = i43;
            int i44 = (-1916120846) * o.ea.m.f23561b;
            o.ea.m.f23561b = i44;
            this.Z = (String) o.ea.m.c(new Object[]{str9}, (int) SystemClock.uptimeMillis(), i44, -327535505, i43, 327535505, Process.myUid());
        }
        if (cVar == null) {
            this.ab = o(context);
        } else {
            this.ab = cVar;
        }
        this.ac = l(context);
        this.aa = n(context);
        this.ae = N;
        int iNextInt = new Random().nextInt();
        int i45 = f26631q * (-306534954);
        f26631q = i45;
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int i46 = f26634t * (-334871318);
        f26634t = i46;
        this.ag = ((Integer) e(iFreeMemory2, new Object[]{context}, i45, i46, iNextInt, 1878288529, -1878288527)).intValue();
        this.f26641k = mVar;
        this.f26643n = z2;
    }

    private static String a(Context context) {
        int i2 = f26630p * 1262328595;
        f26630p = i2;
        int i3 = f26632r * (-1040599365);
        f26632r = i3;
        int i4 = (-243038071) * f26638x;
        f26638x = i4;
        return (String) e(i4, new Object[]{context}, i3, Thread.currentThread().getPriority(), i2, -1310461682, 1310461685);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(String str, int i2) {
        int i3 = 2 % 2;
        int i4 = al + 27;
        af = i4 % 128;
        if (i4 % 2 == 0) {
            return String.format(str, Integer.valueOf(i2));
        }
        Object[] objArr = new Object[0];
        objArr[0] = Integer.valueOf(i2);
        return String.format(str, objArr);
    }

    private static void ao(int i2, byte b2, short s2, Object[] objArr) {
        int i3 = b2 * 4;
        byte[] bArr = $$a;
        int i4 = (s2 * 4) + 4;
        int i5 = 106 - (i2 * 5);
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 = i3 + i5;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5 += bArr[i4];
                i4++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ap(int r27, java.lang.String r28, byte r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 871
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n.d.ap(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void aq(int r8, byte r9, byte r10, java.lang.Object[] r11) {
        /*
            byte[] r7 = o.n.d.$$d
            int r0 = r8 * 2
            int r6 = 111 - r0
            int r0 = r9 + 4
            int r1 = r10 * 5
            int r5 = 6 - r1
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r7 != 0) goto L2c
            r2 = r0
            r6 = r5
            r1 = r3
        L14:
            int r6 = r6 + r0
            int r6 = r6 + (-3)
            r0 = r2
        L18:
            int r2 = r0 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            int r1 = r1 + 1
            if (r1 != r5) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r11[r3] = r0
            return
        L29:
            r0 = r7[r2]
            goto L14
        L2c:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n.d.aq(int, byte, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[0];
        int i2 = 2 % 2;
        int i3 = al + 57;
        af = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr2 = new Object[0];
        Method method = Class.forName(C1561oA.Kd("2@7FD?;\u0006<IIPBLS\u000e$QQXJ^[", (short) (Od.Xd() ^ (-29763)))).getMethod(Wg.Zd("+j\u0001-\baaryv@^", (short) (FB.Xd() ^ 16978), (short) (FB.Xd() ^ 9470)), new Class[0]);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr2)).getString(H);
            int i5 = af + 53;
            al = i5 % 128;
            if (i5 % 2 != 0) {
                return string;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String b(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = al + 23;
        af = i3 % 128;
        int i4 = i3 % 2;
        Class<?> cls = Class.forName(C1561oA.Xd("\u001f-$31,(r)66=/9@z\u0011>>E7KH", (short) (C1607wl.Xd() ^ 7159)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 6610);
        int[] iArr = new int["\u000b\b\u001av\u0005\u0012\u0011\u0016\u001e\u000e\u0013 ".length()];
        QB qb = new QB("\u000b\b\u001av\u0005\u0012\u0011\u0016\u001e\u000e\u0013 ");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK((sXd ^ i5) + xuXd.CK(iKK));
            i5++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i5), clsArr);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr)).getString(E);
            int i6 = af + 9;
            al = i6 % 128;
            int i7 = i6 % 2;
            return string;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[0];
        int i2 = 2 % 2;
        int i3 = af + 53;
        al = i3 % 128;
        int i4 = i3 % 2;
        short sXd = (short) (FB.Xd() ^ 16529);
        short sXd2 = (short) (FB.Xd() ^ 14484);
        int[] iArr = new int["7C8EA:4|1<:?/7<t\t427'94".length()];
        QB qb = new QB("7C8EA:4|1<:?/7<t\t427'94");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(((sXd + i5) + xuXd.CK(iKK)) - sXd2);
            i5++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i5));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr2 = new Object[0];
        short sXd3 = (short) (FB.Xd() ^ 21043);
        short sXd4 = (short) (FB.Xd() ^ 21839);
        int[] iArr2 = new int["zw\u0006bt\u0002|\u0002}mn{".length()];
        QB qb2 = new QB("zw\u0006bt\u0002|\u0002}mn{");
        int i6 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i6] = xuXd2.fK(sXd3 + i6 + xuXd2.CK(iKK2) + sXd4);
            i6++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i6), clsArr);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr2)).getString(f26640z);
            int i7 = af + 99;
            al = i7 % 128;
            if (i7 % 2 != 0) {
                return string;
            }
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String c(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = al + 105;
        af = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("KWLYUNH\u0011EPNSCKP\t\u001dHFK;MH", (short) (C1633zX.Xd() ^ (-23459)))).getMethod(C1561oA.yd("khzWerqvn^cp", (short) (C1633zX.Xd() ^ (-20250))), new Class[0]);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr)).getString(A);
            if (i4 != 0) {
                int i5 = 98 / 0;
            }
            return string;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = af + 45;
        al = i3 % 128;
        int i4 = i3 % 2;
        String str = dVar.O;
        if (i4 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String d(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = af + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        al = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("P^Udb]Y$Zggn`jq,Boovh|y", (short) (C1607wl.Xd() ^ 29265))).getMethod(Xg.qd("JIY8L[X_]ORa", (short) (FB.Xd() ^ 13316), (short) (FB.Xd() ^ 11572)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            int i5 = B;
            if (i4 != 0) {
                return resources.getString(i5);
            }
            resources.getString(i5);
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ Object e(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~i6;
        int i9 = ~i5;
        int i10 = ~((-1) - (((-1) - i8) & ((-1) - i9)));
        int i11 = ~((-1) - (((-1) - i8) & ((-1) - i7)));
        int i12 = ((i10 + i11) - (i10 & i11)) | (~((-1) - (((-1) - i9) & ((-1) - i7))));
        int i13 = ~i7;
        int i14 = (~((-1) - (((-1) - i13) & ((-1) - i6)))) | (~((i9 + i6) - (i9 & i6)));
        int i15 = ~((-1) - (((-1) - i9) & ((-1) - ((i8 + i13) - (i8 & i13)))));
        int i16 = i7 + i6 + i3 + ((-2109949842) * i2) + (2078889904 * i4);
        int i17 = i16 * i16;
        int i18 = ((-1963971821) * i7) + 932184064 + (61854959 * i6) + (1134570258 * i12) + (i14 * (-1134570258)) + ((-1134570258) * i15) + (1196425216 * i3) + (610271232 * i2) + (922746880 * i4) + (671350784 * i17);
        int i19 = (i7 * (-573803825)) + 196542130 + (i6 * (-573802789)) + (i12 * (-518)) + (i14 * 518) + (i15 * 518) + (i3 * (-573803307)) + (i2 * (-843101306)) + (i4 * (-1524517520)) + (i17 * 458489856);
        int i20 = i18 + (i19 * i19 * 64749568);
        if (i20 == 1) {
            d dVar = (d) objArr[0];
            int i21 = 2 % 2;
            int i22 = al;
            int i23 = i22 + 101;
            af = i23 % 128;
            int i24 = i23 % 2;
            String str = dVar.Z;
            int i25 = i22 + 33;
            af = i25 % 128;
            int i26 = i25 % 2;
            return str;
        }
        if (i20 == 2) {
            return e(objArr);
        }
        if (i20 == 3) {
            return c(objArr);
        }
        if (i20 == 4) {
            return b(objArr);
        }
        if (i20 != 5) {
            return d(objArr);
        }
        Context context = (Context) objArr[0];
        int i27 = 2 % 2;
        int i28 = al + 61;
        af = i28 % 128;
        int i29 = i28 % 2;
        Object[] objArr2 = new Object[0];
        Method method = Class.forName(Jg.Wd("&\"yyhU2m\u0015\u0013thOF3Ze\u007fdY<A\u001f", (short) (ZN.Xd() ^ 23694), (short) (ZN.Xd() ^ 2037))).getMethod(ZO.xd("\u0011,`KIA#\u007fp\u0002\u0019U", (short) (C1499aX.Xd() ^ (-25911)), (short) (C1499aX.Xd() ^ (-2434))), new Class[0]);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr2)).getString(G);
            int i30 = af + 39;
            al = i30 % 128;
            int i31 = i30 % 2;
            return string;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[0];
        int i2 = 2 % 2;
        int i3 = al + 45;
        af = i3 % 128;
        int i4 = i3 % 2;
        short sXd = (short) (FB.Xd() ^ 13735);
        short sXd2 = (short) (FB.Xd() ^ 24905);
        int[] iArr = new int["LrF\u001d!t+\u0014#iu@) 2We\u0019\u0016\u007f\u000e,2".length()];
        QB qb = new QB("LrF\u001d!t+\u0014#iu@) 2We\u0019\u0016\u007f\u000e,2");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i5 * sXd2))) + xuXd.CK(iKK));
            i5++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i5));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr2 = new Object[0];
        short sXd3 = (short) (Od.Xd() ^ (-7731));
        int[] iArr2 = new int["l aW#\u0004[2O-5!".length()];
        QB qb2 = new QB("l aW#\u0004[2O-5!");
        int i6 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ (sXd3 + i6)));
            i6++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i6), clsArr);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr2);
            if (i4 != 0) {
                resources.getInteger(Q);
                throw null;
            }
            int integer = resources.getInteger(Q);
            int i7 = al + 27;
            af = i7 % 128;
            int i8 = i7 % 2;
            return Integer.valueOf(integer);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String e(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = al + 65;
        af = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("\u001eb\u00070u%\u007f9\u0016ab\u0007#2,~Q\u0018>\u0001\tpB", (short) (FB.Xd() ^ 10853))).getMethod(C1561oA.Qd("@=K(:GBGC34A", (short) (ZN.Xd() ^ 32379)), new Class[0]);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr)).getString(C);
            if (i4 != 0) {
                int i5 = 82 / 0;
            }
            return string;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String f(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = af + 59;
        al = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("Zh_nlgc.dqqxjt{6Lyy\u0001r\u0007\u0004", (short) (ZN.Xd() ^ 26560), (short) (ZN.Xd() ^ 24227))).getMethod(C1561oA.od("\\YgDVc^c_OP]", (short) (C1633zX.Xd() ^ (-9868))), new Class[0]);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr)).getString(I);
            int i5 = af + 41;
            al = i5 % 128;
            if (i5 % 2 != 0) {
                return string;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String g(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = af + 31;
        al = i3 % 128;
        int i4 = i3 % 2;
        Class<?> cls = Class.forName(C1561oA.Kd("o}t\u0004\u0002|xCy\u0007\u0007\u000e\u007f\n\u0011Ka\u000f\u000f\u0016\b\u001c\u0019", (short) (ZN.Xd() ^ 29825)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-19529));
        short sXd2 = (short) (Od.Xd() ^ (-29828));
        int[] iArr = new int["5(\u0011BgI\u001fx\bLHj".length()];
        QB qb = new QB("5(\u0011BgI\u001fx\bLHj");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(((i5 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i5++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i5), clsArr);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr)).getString(F);
            int i6 = af + 13;
            al = i6 % 128;
            int i7 = i6 % 2;
            return string;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String h(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = al + 27;
        af = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("2@7FD?;\u0006<IIPBLS\u000e$QQXJ^[", (short) (C1499aX.Xd() ^ (-10529)))).getMethod(Wg.vd("\u0018\u0015'\u0004\u001a'&+\u001b\u000b\u0010\u001d", (short) (Od.Xd() ^ (-10141))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            int i5 = J;
            if (i4 == 0) {
                return resources.getString(i5);
            }
            resources.getString(i5);
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String i(Context context) {
        int i2 = f26635u * 2006609834;
        f26635u = i2;
        int i3 = f26637w * (-1041446823);
        f26637w = i3;
        int iActiveCount = Thread.activeCount();
        int i4 = 1264636589 * f26639y;
        f26639y = i4;
        return (String) e(iActiveCount, new Object[]{context}, i3, i4, i2, 988800632, -988800628);
    }

    static void init$0() {
        $$a = new byte[]{85, MessagePack.Code.BIN32, -28, 50};
        $$b = 161;
    }

    static void init$1() {
        $$d = new byte[]{100, 68, -66, 16, MessagePack.Code.FALSE, 58, 0, MessagePack.Code.UINT64, 62};
        $$e = 193;
    }

    static void init$2() {
        $$c = new byte[]{78, MessagePack.Code.UINT64, MessagePack.Code.NIL, -88};
        $$f = 152;
    }

    private static String j(Context context) {
        int i2 = f26636v * (-1008110841);
        f26636v = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        return (String) e(Process.myUid(), new Object[]{context}, iFreeMemory, Process.myPid(), i2, -497079402, 497079407);
    }

    private static boolean l(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = al + 113;
        af = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("*6+84-'o$/-2\"*/g{'%*\u001a,'", (short) (FB.Xd() ^ 122), (short) (FB.Xd() ^ 16545))).getMethod(hg.Vd(" \u001d+\b\u001a'\"'#\u0013\u0014!", (short) (OY.Xd() ^ 8080), (short) (OY.Xd() ^ 18679)), new Class[0]);
        try {
            method.setAccessible(true);
            boolean z2 = ((Resources) method.invoke(context, objArr)).getBoolean(L);
            int i5 = af + 115;
            al = i5 % 128;
            if (i5 % 2 != 0) {
                return z2;
            }
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static int m(Context context) {
        int iNextInt = new Random().nextInt();
        int i2 = f26631q * (-306534954);
        f26631q = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i3 = (-334871318) * f26634t;
        f26634t = i3;
        return ((Integer) e(iFreeMemory, new Object[]{context}, i2, i3, iNextInt, 1878288529, -1878288527)).intValue();
    }

    private static boolean n(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = al + 85;
        af = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("\u0007\u0013\b\u0015\u0011\n\u0004L\u0001\f\n\u000f~\u0007\fDX\u0004\u0002\u0007v\t\u0004", (short) (OY.Xd() ^ 26385))).getMethod(C1561oA.yd("43C\".=:A7),;", (short) (C1499aX.Xd() ^ (-30528))), new Class[0]);
        try {
            method.setAccessible(true);
            boolean z2 = ((Resources) method.invoke(context, objArr)).getBoolean(K);
            int i5 = af + 95;
            al = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 30 / 0;
            }
            return z2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static c o(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = af + 73;
        al = i3 % 128;
        int i4 = i3 % 2;
        Class<?> cls = Class.forName(C1561oA.Yd(")7.=;62|3@@G9CJ\u0005\u001bHHOAUR", (short) (C1607wl.Xd() ^ 21870)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-1535));
        short sXd2 = (short) (C1580rY.Xd() ^ (-23274));
        int[] iArr = new int["UTdCWfcjhZ]l".length()];
        QB qb = new QB("UTdCWfcjhZ]l");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK((xuXd.CK(iKK) - (sXd + i5)) + sXd2);
            i5++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i5), clsArr);
        try {
            method.setAccessible(true);
            final String string = ((Resources) method.invoke(context, objArr)).getString(D);
            c cVar = new c() { // from class: o.n.d$$ExternalSyntheticLambda0
                @Override // o.n.d.c
                public final String getMessage(int i6) {
                    return d.a(string, i6);
                }
            };
            int i6 = al + 41;
            af = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 7 / 0;
            }
            return cVar;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void y() {
        ah = new char[]{64576, 64598, 64614, 64523, 65466, 64591, 64608, 65464, 64630, 65469, 64587, 64580, 64588, 64577, 64595, 64592, 64578, 64605, 65468, 64604, 64586, 64631, 65467, 64579, 64621, 64597, 64585, 65470, 65471, 65465, 64593, 64599, 64582, 64590, 64584, 64589};
        ad = (char) 51641;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0327  */
    /* JADX WARN: Type inference failed for: r3v51, types: [boolean, int] */
    @Override // o.l.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n.d.a():boolean");
    }

    @Override // o.l.c
    public final void e(final FragmentActivity fragmentActivity, int i2, CancellationSignal cancellationSignal, final o.l.a aVar) throws Exception {
        int i3 = 2 % 2;
        this.f26642l = new b(this, new a.b() { // from class: o.n.d.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static char[] f26644b = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static char f26645d = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f26646f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static int f26647g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static int f26648h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static int f26649i = 0;

            /* JADX INFO: renamed from: o.n.d$5$1, reason: invalid class name */
            final class AnonymousClass1 implements e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f26653b = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f26654e = 1;

                AnonymousClass1() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void b() {
                    int i2 = 2 % 2;
                    int i3 = f26654e + 79;
                    f26653b = i3 % 128;
                    if (i3 % 2 == 0) {
                        d.this.f26642l.c(d.this.q());
                        d.this.f26642l.a();
                    } else {
                        d.this.f26642l.c(d.this.q());
                        d.this.f26642l.a();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }

                @Override // o.j.e
                public final void b(o.j.b bVar) {
                    int i2 = 2 % 2;
                    int i3 = f26654e;
                    int i4 = (i3 ^ 1) + (((i3 + 1) - (i3 | 1)) << 1);
                    f26653b = i4 % 128;
                    int i5 = i4 % 2;
                    if (bVar == o.j.b.f26288b) {
                        int i6 = f26653b;
                        int i7 = ((i6 + PanasonicMakernoteDirectory.TAG_BURST_SPEED) - (119 | i6)) + ((i6 + PanasonicMakernoteDirectory.TAG_BURST_SPEED) - (i6 & PanasonicMakernoteDirectory.TAG_BURST_SPEED));
                        f26654e = i7 % 128;
                        int i8 = i7 % 2;
                        if (d.this.f26641k.k()) {
                            int i9 = f26653b;
                            int i10 = (i9 ^ 11) + (((-1) - (((-1) - i9) | ((-1) - 11))) << 1);
                            f26654e = i10 % 128;
                            if (i10 % 2 == 0) {
                                aVar.c(o.l.d.f26355d, d.this);
                                int i11 = 40 / 0;
                            } else {
                                aVar.c(o.l.d.f26355d, d.this);
                            }
                            int i12 = f26654e;
                            int i13 = ((i12 + 83) - (83 | i12)) + (i12 | 83);
                            f26653b = i13 % 128;
                            int i14 = i13 % 2;
                            return;
                        }
                    }
                    fragmentActivity.runOnUiThread(new Runnable() { // from class: o.n.d$5$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.b();
                        }
                    });
                }

                @Override // o.j.e
                public final void c(o.g.a aVar) {
                    int i2 = 2 % 2;
                    int i3 = f26654e;
                    int i4 = (((-1) - (((-1) - i3) & ((-1) - 55))) << 1) - (i3 ^ 55);
                    f26653b = i4 % 128;
                    int i5 = i4 % 2;
                    aVar.b(aVar, d.this);
                    int i6 = f26653b + 15;
                    f26654e = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0011). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(byte r6, int r7, byte r8) {
                /*
                    int r8 = r8 + 4
                    int r0 = r6 + 102
                    int r7 = r7 * 2
                    int r1 = r7 + 1
                    byte[] r6 = o.n.d.AnonymousClass5.$$c
                    byte[] r5 = new byte[r1]
                    r4 = 0
                    if (r6 != 0) goto L28
                    r1 = r8
                    r3 = r4
                L11:
                    int r0 = -r0
                    int r0 = r0 + r1
                    r2 = r3
                L14:
                    byte r1 = (byte) r0
                    int r8 = r8 + 1
                    r5[r2] = r1
                    int r3 = r2 + 1
                    if (r2 != r7) goto L23
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L23:
                    r2 = r6[r8]
                    r1 = r0
                    r0 = r2
                    goto L11
                L28:
                    r2 = r4
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: o.n.d.AnonymousClass5.$$e(byte, int, byte):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f26649i = 1389458004;
                f26647g = 1868011070;
                init$0();
                f26648h = 0;
                f26646f = 1;
                f26644b = new char[]{64577, 65465, 64522, 65471, 64578, 64587, 64586, 64579, 65468, 64580, 64582, 64576, 64583, 64598, 64590, 65466, 64592, 64605, 64523, 64599, 65463, 64614, 64588, 64620, 64585, 65462, 64520, 65470, 65464, 64584, 65469, 64612, 64593, 64532, 65467, 64597};
                f26645d = (char) 51641;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x0322  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] e(android.content.Context r25, int r26, int r27, int r28) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1759
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.n.d.AnonymousClass5.e(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{Ascii.GS, 50, -104, 42};
                $$b = 104;
            }

            static void init$1() {
                $$c = new byte[]{65, 52, MessagePack.Code.UINT64, -121};
                $$d = 86;
            }

            private static void j(int i4, String str, byte b2, Object[] objArr) throws Throwable {
                int i5;
                String str2 = str;
                int i6 = 2;
                int i7 = 2 % 2;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                h hVar = new h();
                char[] cArr2 = f26644b;
                int i8 = 421932776;
                int i9 = 5;
                int i10 = 1;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i11 = $11 + 19;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 3 % 2;
                    }
                    int i13 = 0;
                    while (i13 < length) {
                        int i14 = $10 + i9;
                        $11 = i14 % 128;
                        if (i14 % i6 == 0) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                                Object objA = o.d.d.a(i8);
                                if (objA == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objA = o.d.d.a(270 - Drawable.resolveOpacity(0, 0), (char) Color.alpha(0), 11 - Color.blue(0), -811348851, false, $$e(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                                }
                                cArr3[i13] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                                i13 %= 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i13])};
                            Object objA2 = o.d.d.a(421932776);
                            if (objA2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA2 = o.d.d.a(Color.argb(0, 0, 0, 0) + 270, (char) View.MeasureSpec.getSize(0), 10 - Process.getGidForName(""), -811348851, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i13] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                            i13++;
                        }
                        int i15 = $11 + 67;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i16 = 4 / 2;
                        }
                        i6 = 2;
                        i8 = 421932776;
                        i9 = 5;
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr4 = {Integer.valueOf(f26645d)};
                Object objA3 = o.d.d.a(421932776);
                if (objA3 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objA3 = o.d.d.a(ExpandableListView.getPackedPositionType(0L) + 270, (char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, -811348851, false, $$e(b7, b8, (byte) (b8 - 1)), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                char[] cArr4 = new char[i4];
                if (i4 % 2 != 0) {
                    int i17 = $11 + 21;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    i5 = i4 - 1;
                    cArr4[i5] = (char) (cArr[i5] - b2);
                } else {
                    i5 = i4;
                }
                if (i5 > 1) {
                    int i19 = $10 + 45;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    hVar.f19926b = 0;
                    while (hVar.f19926b < i5) {
                        hVar.f19927c = cArr[hVar.f19926b];
                        hVar.f19925a = cArr[hVar.f19926b + i10];
                        if (hVar.f19927c == hVar.f19925a) {
                            cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                            cArr4[hVar.f19926b + i10] = (char) (hVar.f19925a - b2);
                        } else {
                            Object[] objArr5 = new Object[13];
                            objArr5[12] = hVar;
                            objArr5[11] = Integer.valueOf(cCharValue);
                            objArr5[10] = hVar;
                            objArr5[9] = hVar;
                            objArr5[8] = Integer.valueOf(cCharValue);
                            objArr5[7] = hVar;
                            objArr5[6] = hVar;
                            objArr5[5] = Integer.valueOf(cCharValue);
                            objArr5[4] = hVar;
                            objArr5[3] = hVar;
                            objArr5[2] = Integer.valueOf(cCharValue);
                            objArr5[i10] = hVar;
                            objArr5[0] = hVar;
                            Object objA4 = o.d.d.a(219124184);
                            if (objA4 == null) {
                                byte b9 = (byte) 0;
                                objA4 = o.d.d.a(Process.getGidForName("") + 826, (char) (ImageFormat.getBitsPerPixel(0) + 1), 11 - TextUtils.getOffsetAfter("", 0), -611683395, false, $$e((byte) 9, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objA4).invoke(null, objArr5)).intValue() == hVar.f19930g) {
                                int i21 = $11 + 69;
                                $10 = i21 % 128;
                                int i22 = i21 % 2;
                                Object[] objArr6 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                                Object objA5 = o.d.d.a(-634864343);
                                if (objA5 == null) {
                                    byte b10 = (byte) 0;
                                    objA5 = o.d.d.a(218 - (ViewConfiguration.getScrollBarSize() >> 8), (char) View.resolveSizeAndState(0, 0, 0), View.getDefaultSize(0, 0) + 11, 212688716, false, $$e((byte) 7, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                                int i23 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr2[iIntValue];
                                cArr4[hVar.f19926b + 1] = cArr2[i23];
                            } else if (hVar.f19928d == hVar.f19929e) {
                                hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                                hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                                int i24 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                                int i25 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr2[i24];
                                cArr4[hVar.f19926b + 1] = cArr2[i25];
                            } else {
                                int i26 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                                int i27 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                                cArr4[hVar.f19926b] = cArr2[i26];
                                i10 = 1;
                                cArr4[hVar.f19926b + 1] = cArr2[i27];
                            }
                            i10 = 1;
                        }
                        hVar.f19926b += 2;
                    }
                }
                for (int i28 = 0; i28 < i4; i28++) {
                    int i29 = $11 + 15;
                    $10 = i29 % 128;
                    int i30 = i29 % 2;
                    cArr4[i28] = (char) (cArr4[i28] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0014). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void k(int r10, int r11, int r12, java.lang.Object[] r13) {
                /*
                    byte[] r9 = o.n.d.AnonymousClass5.$$a
                    int r8 = r11 + 97
                    int r0 = r12 * 4
                    int r7 = 1 - r0
                    int r0 = r10 * 3
                    int r6 = 3 - r0
                    byte[] r5 = new byte[r7]
                    r4 = 0
                    if (r9 != 0) goto L2d
                    r3 = r6
                    r0 = r7
                    r2 = r4
                L14:
                    int r6 = r6 + r0
                    r1 = r2
                    r8 = r6
                    r6 = r3
                L18:
                    int r2 = r1 + 1
                    byte r0 = (byte) r8
                    r5[r1] = r0
                    int r3 = r6 + 1
                    if (r2 != r7) goto L29
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    r13[r4] = r0
                    return
                L29:
                    r0 = r9[r3]
                    r6 = r8
                    goto L14
                L2d:
                    r1 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.n.d.AnonymousClass5.k(int, int, int, java.lang.Object[]):void");
            }

            @Override // o.n.a.b
            public void onExtraButtonPressed() {
                int i4 = 2 % 2;
                int i5 = f26646f + 71;
                f26648h = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = {d.this};
                int i7 = o.l.c.f26343i * 1393535565;
                o.l.c.f26343i = i7;
                int iMyUid = Process.myUid();
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i8 = 1493295148 * o.l.c.f26342h;
                o.l.c.f26342h = i8;
                if (((o.l.c) o.l.c.b(iFreeMemory, i8, iMyUid, 1058468260, objArr, -1058468258, i7)) != null) {
                    aVar.c(d.this);
                }
                int i9 = f26646f + 43;
                f26648h = i9 % 128;
                int i10 = i9 % 2;
            }

            @Override // o.n.a.b
            public void onKeyPressed() {
                int i4 = 2 % 2;
                int i5 = f26648h + 7;
                f26646f = i5 % 128;
                if (i5 % 2 == 0) {
                    d.this.f26642l.c((String) null);
                    throw null;
                }
                d.this.f26642l.c((String) null);
                int i6 = f26646f + 29;
                f26648h = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
            
                if (r8.f26651c.f26643n == false) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
            
                r2.c(o.l.d.f26355d, r8.f26651c);
                r1 = o.n.d.AnonymousClass5.f26646f + 19;
                o.n.d.AnonymousClass5.f26648h = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
            
                if ((!r8.f26651c.f26643n) != true) goto L8;
             */
            @Override // o.n.a.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onPasscodeEntryDone(byte[] r9) throws java.lang.Throwable {
                /*
                    r8 = this;
                    r5 = 2
                    int r0 = r5 % r5
                    o.g.f r4 = new o.g.f
                    o.g.a$b r2 = o.g.a.b.f26175c
                    java.util.Date r1 = new java.util.Date
                    r1.<init>()
                    o.g.d r0 = new o.g.d
                    r0.<init>(r9)
                    r4.<init>(r2, r1, r0)
                    o.n.d r0 = o.n.d.this
                    o.m.m r0 = r0.f26641k
                    boolean r0 = r0.k()
                    if (r0 == 0) goto L33
                    int r0 = o.n.d.AnonymousClass5.f26648h
                    int r1 = r0 + 43
                    int r0 = r1 % 128
                    o.n.d.AnonymousClass5.f26646f = r0
                    int r1 = r1 % r5
                    if (r1 != 0) goto L5b
                    o.n.d r0 = o.n.d.this
                    boolean r2 = r0.f26643n
                    r1 = 1
                    int r0 = r1 / 0
                    r2 = r2 ^ r1
                    if (r2 == r1) goto L61
                L33:
                    o.n.d r0 = o.n.d.this
                    boolean r0 = r0.f26643n
                    if (r0 == 0) goto L74
                    o.l.a r4 = r2
                    o.g.f r3 = new o.g.f
                    o.g.a$b r2 = o.g.a.b.f26176d
                    java.util.Date r1 = new java.util.Date
                    r1.<init>()
                    o.g.d r0 = new o.g.d
                    r0.<init>(r9)
                    r3.<init>(r2, r1, r0)
                    o.n.d r0 = o.n.d.this
                    r4.b(r3, r0)
                    int r0 = o.n.d.AnonymousClass5.f26646f
                    int r1 = r0 + 125
                    int r0 = r1 % 128
                    o.n.d.AnonymousClass5.f26648h = r0
                    int r1 = r1 % r5
                    return
                L5b:
                    o.n.d r0 = o.n.d.this
                    boolean r0 = r0.f26643n
                    if (r0 != 0) goto L33
                L61:
                    o.l.a r2 = r2
                    o.l.d r1 = o.l.d.f26355d
                    o.n.d r0 = o.n.d.this
                    r2.c(r1, r0)
                    int r0 = o.n.d.AnonymousClass5.f26646f
                    int r1 = r0 + 19
                    int r0 = r1 % 128
                    o.n.d.AnonymousClass5.f26648h = r0
                    int r1 = r1 % r5
                    return
                L74:
                    o.n.d r0 = o.n.d.this
                    o.m.m r2 = r0.f26641k
                    androidx.fragment.app.FragmentActivity r3 = r3
                    o.n.d$5$1 r5 = new o.n.d$5$1
                    r5.<init>()
                    o.m.a r6 = new o.m.a
                    o.m.c r1 = o.m.c.d()
                    o.m.i r0 = r4.b()
                    r6.<init>(r1, r0)
                    o.n.d r0 = o.n.d.this
                    boolean r7 = r0.f26643n
                    r2.d(r3, r4, r5, r6, r7)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.n.d.AnonymousClass5.onPasscodeEntryDone(byte[]):void");
            }
        });
        Object obj = null;
        if (!this.f26641k.k()) {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            this.R = supportFragmentManager;
            this.P = aVar;
            CX.ud();
            FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            b bVar = this.f26642l;
            CX.ud();
            fragmentTransactionBeginTransaction.replace(i2, bVar).addToBackStack(null).commit();
            return;
        }
        int i4 = af + 53;
        al = i4 % 128;
        int i5 = i4 % 2;
        aVar.c(o.l.d.f26355d, this);
        int i6 = af + 21;
        al = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String f() {
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i2 = (-1219600928) * f26629m;
        f26629m = i2;
        return (String) e(Process.myTid(), new Object[]{this}, i2, Thread.activeCount(), iFreeMemory, -230403513, 230403513);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0286  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n.d.g():java.lang.String");
    }

    public final String h() {
        int i2 = 2 % 2;
        int i3 = af + 1;
        int i4 = i3 % 128;
        al = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.S;
        int i5 = i4 + 41;
        af = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String i() {
        int i2 = 2 % 2;
        int i3 = al + 67;
        af = i3 % 128;
        int i4 = i3 % 2;
        String str = this.W;
        if (i4 != 0) {
            int i5 = 89 / 0;
        }
        return str;
    }

    public final String j() {
        int i2 = 2 % 2;
        int i3 = al + 29;
        af = i3 % 128;
        if (i3 % 2 == 0) {
            return this.V;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String k() {
        int i2 = 2 % 2;
        int i3 = af + 95;
        int i4 = i3 % 128;
        al = i4;
        int i5 = i3 % 2;
        String str = this.U;
        int i6 = i4 + 121;
        af = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final boolean l() {
        int i2 = 2 % 2;
        int i3 = al;
        int i4 = i3 + 115;
        af = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.ac;
        int i6 = i3 + 37;
        af = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final String m() {
        String str;
        int i2 = 2 % 2;
        int i3 = al;
        int i4 = i3 + 43;
        af = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.Y;
            int i5 = 3 / 0;
        } else {
            str = this.Y;
        }
        int i6 = i3 + 45;
        af = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String n() {
        int i2 = 2 % 2;
        int i3 = af + 73;
        al = i3 % 128;
        int i4 = i3 % 2;
        String str = this.X;
        if (i4 == 0) {
            int i5 = 50 / 0;
        }
        return str;
    }

    public final String o() {
        int i2 = f26633s * 665588033;
        f26633s = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        return (String) e((int) Runtime.getRuntime().totalMemory(), new Object[]{this}, iFreeMemory, Process.myPid(), i2, -48153914, 48153915);
    }

    public final boolean p() {
        int i2 = 2 % 2;
        int i3 = af;
        int i4 = i3 + 35;
        al = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.aa;
        int i6 = i3 + 89;
        al = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 92 / 0;
        }
        return z2;
    }

    final String q() throws Throwable {
        Object objC;
        int i2 = 2 % 2;
        int i3 = al + 45;
        int i4 = i3 % 128;
        af = i4;
        int i5 = i3 % 2;
        c cVar = this.ab;
        if (cVar == null) {
            return null;
        }
        int i6 = i4 + 113;
        al = i6 % 128;
        if (i6 % 2 == 0) {
            Object[] objArr = {cVar.getMessage(this.f26641k.l() % this.f26641k.b())};
            int i7 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i7;
            int i8 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i8;
            objC = o.ea.m.c(objArr, (int) SystemClock.uptimeMillis(), i8, -327535505, i7, 327535505, Process.myUid());
        } else {
            Object[] objArr2 = {cVar.getMessage(this.f26641k.l() - this.f26641k.b())};
            int i9 = o.ea.m.f23563d * 691068131;
            o.ea.m.f23563d = i9;
            int i10 = o.ea.m.f23561b * (-1916120846);
            o.ea.m.f23561b = i10;
            objC = o.ea.m.c(objArr2, (int) SystemClock.uptimeMillis(), i10, -327535505, i9, 327535505, Process.myUid());
        }
        return (String) objC;
    }

    final void r() throws Exception {
        int i2 = 2 % 2;
        int i3 = al + 7;
        af = i3 % 128;
        int i4 = i3 % 2;
        FragmentManager fragmentManager = this.R;
        CX.ud();
        fragmentManager.beginTransaction().remove(this.f26642l).commit();
        this.P.c(o.l.d.f26353b, this);
        int i5 = af + 31;
        al = i5 % 128;
        int i6 = i5 % 2;
    }

    public final int s() {
        int i2 = 2 % 2;
        int i3 = af + 91;
        int i4 = i3 % 128;
        al = i4;
        int i5 = i3 % 2;
        int i6 = this.ae;
        int i7 = i4 + 97;
        af = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int t() {
        int i2 = 2 % 2;
        int i3 = af;
        int i4 = i3 + 55;
        al = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.ag;
        int i7 = i3 + 111;
        al = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }
}
