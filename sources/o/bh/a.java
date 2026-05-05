package o.bh;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.a.j;
import o.a.o;
import o.bh.b;
import o.ea.f;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements b.d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f21129b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f21130c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f21131d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f21132e = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static char[] f21133k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f21134l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f21135m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static long f21136n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21137o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static short[] f21138p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static byte[] f21139q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f21140r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f21141s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f21142t = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f21143y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21144a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o.dd.g f21145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o.en.b f21146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f21147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC0341a f21149j;

    /* JADX INFO: renamed from: o.bh.a$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f21150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f21151c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f21152e = 1;

        static {
            int[] iArr = new int[o.f.a.values().length];
            f21150b = iArr;
            try {
                iArr[o.f.a.f25702a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21150b[o.f.a.f25705e.ordinal()] = 2;
                int i2 = f21151c;
                int i3 = (i2 ^ 101) + (((i2 + 101) - (i2 | 101)) << 1);
                f21152e = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21150b[o.f.a.f25704c.ordinal()] = 3;
                int i6 = f21152e + 7;
                f21151c = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21150b[o.f.a.f25703b.ordinal()] = 4;
                int i9 = f21152e;
                int i10 = (i9 ^ 115) + (((i9 + 115) - (i9 | 115)) << 1);
                f21151c = i10 % 128;
                int i11 = i10 % 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: o.bh.a$a, reason: collision with other inner class name */
    public interface InterfaceC0341a {
        void b(o.bg.c cVar, boolean z2, o.by.g gVar);

        void c();

        void d();

        void e(o.bg.c cVar);

        void e(o.bx.d dVar, o.j.b bVar, o.bg.c cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, short r10, short r11) {
        /*
            int r0 = r11 * 2
            int r8 = r0 + 4
            int r7 = r9 + 99
            int r0 = r10 * 4
            int r6 = r0 + 1
            byte[] r5 = o.bh.a.$$a
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r5 != 0) goto L28
            r7 = r6
            r0 = r8
            r2 = r3
        L14:
            int r8 = r8 + 1
            int r7 = r7 + r0
            r1 = r2
        L18:
            int r2 = r1 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r2 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r5[r8]
            goto L14
        L28:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.a.$$c(int, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21132e = 310155231;
        f21130c = 617425684;
        f21129b = 1774901072;
        f21131d = 1193202949;
        f21142t = 0;
        f21143y = 1;
        f21140r = 0;
        f21141s = 1;
        d();
        Process.getElapsedCpuTime();
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getZoomControlsTimeout();
        int i2 = f21143y + 117;
        f21142t = i2 % 128;
        int i3 = i2 % 2;
    }

    public a(Context context, o.en.b bVar, InterfaceC0341a interfaceC0341a, o.dd.g gVar) {
        this.f21144a = context;
        this.f21146g = bVar;
        this.f21149j = interfaceC0341a;
        this.f21145f = gVar;
    }

    private void a(boolean z2, o.f.a aVar, o.bg.c cVar) throws Throwable {
        o.j.b bVar;
        o.bx.d dVar;
        int i2 = 2 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            u((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-1) - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            v((short) (55 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1503210106 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2021515320 - KeyEvent.normalizeMetaState(0), 40 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(aVar).toString());
        }
        if (z2) {
            int i3 = f21140r + 9;
            f21141s = i3 % 128;
            int i4 = i3 % 2;
            bVar = o.j.b.f26288b;
        } else {
            bVar = null;
        }
        int i5 = AnonymousClass3.f21150b[aVar.ordinal()];
        if (i5 == 1) {
            dVar = o.bx.d.f21781d;
        } else if (i5 != 2) {
            dVar = i5 != 3 ? null : o.bx.d.f21782e;
        } else {
            dVar = o.bx.d.f21780c;
            int i6 = f21140r + 33;
            f21141s = i6 % 128;
            int i7 = i6 % 2;
        }
        if (f.a()) {
            Object[] objArr3 = new Object[1];
            u((char) (ViewConfiguration.getFadingEdgeLength() >> 16), ViewConfiguration.getKeyRepeatTimeout() >> 16, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr4 = new Object[1];
            u((char) (ViewConfiguration.getPressedStateDuration() >> 16), 128 - View.getDefaultSize(0, 0), 68 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
            f.c(strIntern2, sb2.append(((String) objArr4[0]).intern()).append(dVar).toString());
            int i8 = f21140r + 9;
            f21141s = i8 % 128;
            int i9 = i8 % 2;
        }
        this.f21149j.e(dVar, bVar, cVar);
        int i10 = f21141s + 35;
        f21140r = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private static boolean a(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21140r + 7;
        f21141s = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        u((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 52 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 47 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        short sXd = (short) (ZN.Xd() ^ 27992);
        int[] iArr = new int["2\u000eUD`\r$&\u001cdiM\u0013\u001e\b \b\u0016m\u001cM)z".length()];
        QB qb = new QB("2\u000eUD`\r$&\u001cdiM\u0013\u001e\b \b\u0016m\u001cM)z");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd + i5)));
            i5++;
        }
        Object[] objArr2 = {strIntern, 0};
        Method method = Class.forName(new String(iArr, 0, i5)).getMethod(C1561oA.Qd("ebpNbZj\\ZEfXXVbT\\PQ^", (short) (C1499aX.Xd() ^ (-26784))), Class.forName(EO.Od("~.1{_Sd!A{#\u001eGDM ", (short) (OY.Xd() ^ 7982))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
            Object[] objArr3 = new Object[1];
            u((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 98, Drawable.resolveOpacity(0, 0) + 6, objArr3);
            boolean z2 = sharedPreferences.getBoolean(((String) objArr3[0]).intern(), false);
            int i6 = f21140r + 53;
            f21141s = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object c(java.lang.Object[] r19) throws java.lang.Throwable {
        /*
            r5 = 0
            r4 = r19[r5]
            o.bh.a r4 = (o.bh.a) r4
            r8 = 1
            r3 = r19[r8]
            o.bg.c r3 = (o.bg.c) r3
            r13 = 2
            r6 = r19[r13]
            o.by.g r6 = (o.by.g) r6
            int r0 = r13 % r13
            int r0 = o.bh.a.f21140r
            int r1 = r0 + 69
            int r0 = r1 % 128
            o.bh.a.f21141s = r0
            int r1 = r1 % r13
            if (r1 != 0) goto Lad
            boolean r1 = o.ea.f.a()
            r0 = 67
            int r0 = r0 / r5
            if (r1 == 0) goto La0
        L25:
            int r0 = android.view.View.MeasureSpec.getSize(r5)
            char r9 = (char) r0
            java.lang.String r1 = ""
            int r7 = android.text.TextUtils.getOffsetAfter(r1, r5)
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            int r0 = r0 >> 16
            int r2 = 17 - r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            u(r9, r7, r2, r0)
            r0 = r0[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = r0.intern()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r0 = 48
            int r0 = android.text.TextUtils.lastIndexOf(r1, r0, r5, r5)
            int r0 = r0 + 6
            short r14 = (short) r0
            long r11 = android.os.SystemClock.elapsedRealtime()
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            r15 = 1503210042(0x59992a3a, float:5.3890125E15)
            int r15 = r15 - r0
            r0 = 2021515319(0x787de037, float:2.0596855E34)
            int r16 = android.text.TextUtils.getCapsMode(r1, r5, r5)
            int r16 = r16 + r0
            int r0 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r0 = r0 >> 16
            int r17 = r0 + (-5)
            int r0 = android.view.KeyEvent.normalizeMetaState(r5)
            byte r1 = (byte) r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r18 = r1
            r19 = r0
            v(r14, r15, r16, r17, r18, r19)
            r0 = r0[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r1 = r7.append(r0)
            o.bh.a$a r0 = r4.f21149j
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            o.ea.f.c(r2, r0)
            int r0 = o.bh.a.f21141s
            int r1 = r0 + 115
            int r0 = r1 % 128
            o.bh.a.f21140r = r0
            int r1 = r1 % r13
        La0:
            r2 = 0
            r4.f21147h = r2
            o.bh.a$a r1 = r4.f21149j
            boolean r0 = r4.f21148i
            r1.b(r3, r0, r6)
            r4.f21148i = r5
            return r2
        Lad:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto La0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.a.c(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~((i3 + i2) - (i3 & i2));
        int i9 = (~i5) | (~i2);
        int i10 = (-1) - (((-1) - (~i9)) & ((-1) - i3));
        int i11 = ~i3;
        int i12 = ~((i11 + i5) - (i11 & i5));
        int i13 = ~(i2 | i5);
        int i14 = (-1) - (((-1) - ((i13 + i12) - (i13 & i12))) & ((-1) - (~((-1) - (((-1) - i9) & ((-1) - i3))))));
        int i15 = i5 + i3 + i4 + ((-101282902) * i6) + ((-829309908) * i7);
        int i16 = i15 * i15;
        int i17 = ((i5 * 42798203) - 224002048) + (42798203 * i3) + ((-1233194106) * i8) + (1828579084 * i10) + (1233194106 * i14) + ((-1190395904) * i4) + (1710751744 * i6) + ((-1643118592) * i7) + ((-1134166016) * i16);
        int i18 = (i5 * 1745018779) + 1790267665 + (i3 * 1745018779) + (i8 * (-58)) + (i10 * (-116)) + (i14 * 58) + (i4 * 1745018721) + (i6 * (-1587019414)) + (i7 * (-1871011668)) + (i16 * 1017511936);
        return i17 + ((i18 * i18) * (-1139146752)) != 1 ? c(objArr) : d(objArr);
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        if (!(!f.a())) {
            int i3 = f21141s + 35;
            f21140r = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr2 = new Object[1];
            u((char) (ViewConfiguration.getTouchSlop() >> 8), ViewConfiguration.getMinimumFlingVelocity() >> 16, 17 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            v((short) ((-61) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1503210018 - TextUtils.lastIndexOf("", '0', 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2021515316, View.getDefaultSize(0, 0) - 6, (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
            f.c(strIntern, ((String) objArr3[0]).intern());
            int i5 = f21140r + 79;
            f21141s = i5 % 128;
            int i6 = i5 % 2;
        }
        b bVar = aVar.f21147h;
        Object obj = null;
        if (bVar != null) {
            int i7 = f21141s + 33;
            f21140r = i7 % 128;
            if (i7 % 2 != 0) {
                bVar.f();
                obj.hashCode();
                throw null;
            }
            bVar.f();
        }
        return null;
    }

    static void d() {
        f21133k = new char[]{38067, 52841, 8566, 33907, 65380, 21067, 46422, 59475, 17245, 42532, 6415, 31803, 55100, 2571, 27909, 49183, 15104, 14773, 25435, 35906, 10592, 21059, 65385, 6231, 17773, 61042, 2839, 46080, 53519, 31250, 42807, 49209, 27936, 38405, 13279, 23770, 63938, 8900, 20479, 59637, 5605, 48839, 56208, 1170, 41389, 51849, 30640, 37026, 15787, 26302, 32842, 38036, 52856, 8492, 33915, 65404, 21086, 46407, 59478, 17245, 42554, 6508, 31803, 55100, 2590, 27911, 49174, 15133, 40698, 61930, 21753, 36855, 58054, 17867, 47320, 5056, 30379, 43440, 3235, 26509, 55961, 15754, 37019, 52096, 11631, 32870, 64325, 24162, 45400, 5191, 20316, 41559, 1336, 30759, 54068, 13873, 26895, 52241, 38035, 52839, 8492, 33916, 65395, 21070, 8414, 31271, 38144, 12346, 19237, 58880, 279, 23576, 63237, 4704, 44398, 51319, 25431, 48712, 55624, 29781, 36676, 10939, 17828, 57585, 15352, 22217, 61900, 3289, 38018, 52856, 8557, 33913, 65399, 21081, 46417, 59515, 17233, 42558, 6443, 31788, 55091, 2590, 27915, 49173, 15132, 40649, 61936, 21759, 36854, 58063, 17868, 47310, 5083, 30379, 43438, 3241, 26516, 55947, 15755, 37014, 52103, 11640, 32871, 64314, 24127, 45322, 5185, 20296, 41559, 1326, 30759, 54068, 13862, 26883, 52227, 10006, 39425, 64938, 20720, 35839, 61155, 16863, 42187, 8136, 29399, 54702, 2274, 25512, 50871, 14731, 40081, 63381, 10908, 35882, 59192, 23098, 23523, 282, 60976, 19211, 12290, 40243, 31261, 10023, 35896, 26973, 54858, 45893, 6232, 50557, 41587, 3946, 62531, 20890, 16059, 39819, 16517, 11706, 35515, 30700, 56549, 47508};
        f21136n = 127284251282558474L;
        f21134l = -487270299;
        f21137o = 1150422416;
        f21135m = -1022349899;
        f21139q = new byte[]{84, 109, 66, 96, 72, 106, 66, 102, 113, 33, 104, -80, 123, -74, MessagePack.Code.UINT64, -68, MessagePack.Code.FALSE, -86, MessagePack.Code.BIN8, -68, MessagePack.Code.NIL, MessagePack.Code.INT64, -124, MessagePack.Code.UINT64, MessagePack.Code.EXT16, -94, -79, -76, -29, -98, -79, -78, -73, 99, -123, 127, 113, Base64.padSymbol, 118, -124, 112, 118, 100, MessagePack.Code.FIXARRAY_PREFIX, 109, 119, -116, 125, -125, 107, -123, 125, -127, MessagePack.Code.FIXARRAY_PREFIX, 67, 119, 48, 90, 76, 70, 0, 48, 74, 94, 64, 95, 104, 33, 68, 54, 80, 50, 92, 80, 36, 92, 88, 79, 50, 93, 94, 70, 68, 48, 116, Ascii.DC2, 68, 93, 50, 80, 56, 90, 50, 86, 97, 16, 68, 34, 110, -5, 74, 71, 81, 59, 71, -111, -5, 93, 89, 76, 51, 66, 95, 71, 69, 49, 85, -127, 8, 69, 77, 72, 75, 71, 85, 49, -106, 49, 91, 9, 49, 75, 95, 65, 92, 105, 17, 93, 89, 76, 51, 66, 95, 71, 69, 49, 117, 19, 69, 66, 51, 81, 57, 91, 51, 87, 102, Ascii.SUB, 68, 90, 70, 48, 75, 70, Ascii.SYN, 40, -24, 16, 36, 19, 65, -16, 78, 8, 46, 39, Ascii.DC4, 58, 2, 60, Ascii.DC4, 56, 75, -4, 43, 42, 38, 52, 4, 46, -115, -115, -115, -115, -115, -115};
    }

    static void e(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21141s + 75;
        f21140r = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        u((char) ((Process.getThreadPriority(0) + 20) >> 6), Color.argb(0, 0, 0, 0) + 51, 47 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        Object[] objArr2 = {((String) objArr[0]).intern(), 0};
        Method method = Class.forName(C1593ug.zd("\\japnie0fsszlv}8N{{\u0003t\t\u0006", (short) (C1633zX.Xd() ^ (-14843)), (short) (C1633zX.Xd() ^ (-2853)))).getMethod(C1561oA.Kd(">=M-C=OCC0SGIIWKUKN]", (short) (OY.Xd() ^ 6242)), Class.forName(C1561oA.od("G=Q;\u0007D8D<\u0002&FC9=5", (short) (ZN.Xd() ^ 27868))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr2)).edit();
            Object[] objArr3 = new Object[1];
            u((char) KeyEvent.normalizeMetaState(0), View.MeasureSpec.getMode(0) + 98, 6 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
            editorEdit.putBoolean(((String) objArr3[0]).intern(), true).commit();
            int i5 = f21141s + 37;
            f21140r = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void init$0() {
        $$a = new byte[]{Ascii.FF, 10, -28, MessagePack.Code.NEGFIXINT_PREFIX};
        $$b = 219;
    }

    private static void u(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = $11 + 3;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f21133k[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 742, (char) ((-1) - Process.getGidForName("")), 11 - TextUtils.lastIndexOf("", '0', 0), 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f21136n), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    int packedPositionType = 766 - ExpandableListView.getPackedPositionType(0L);
                    char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 12470);
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 12;
                    byte b4 = (byte) ($$b & 5);
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(packedPositionType, doubleTapTimeout, iCombineMeasuredStates, 1946853218, false, $$c(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(388 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1), TextUtils.lastIndexOf("", '0', 0) + 19, 39570797, false, $$c((byte) 6, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                objA4 = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 388, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), TextUtils.getTrimmedLength("") + 18, 39570797, false, $$c((byte) 6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i8 = $10 + 9;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void v(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        long j2;
        int i5 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f21137o)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 5;
                byte b4 = (byte) (b3 - 5);
                objA = o.d.d.a(Color.red(0) + 238, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 44532), 11 - TextUtils.indexOf("", "", 0), 35969549, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            char c2 = '0';
            if (i6 != 0) {
                int i7 = $11 + 33;
                int i8 = i7 % 128;
                $10 = i8;
                int i9 = i7 % 2;
                byte[] bArr = f21139q;
                if (bArr != null) {
                    int i10 = i8 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    int i11 = i10 % 128;
                    $11 = i11;
                    int i12 = i10 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i13 = i11 + 73;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = 0;
                    while (i15 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i15])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            int iLastIndexOf = 627 - TextUtils.lastIndexOf("", c2, 0, 0);
                            char maxKeyCode = (char) (28649 - (KeyEvent.getMaxKeyCode() >> 16));
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11;
                            byte length2 = (byte) $$a.length;
                            byte b5 = (byte) (length2 - 4);
                            objA2 = o.d.d.a(iLastIndexOf, maxKeyCode, scrollDefaultDelay, 1621469864, false, $$c(length2, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i15] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        i15++;
                        c2 = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f21139q;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f21134l)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b6 = (byte) 5;
                        byte b7 = (byte) (b6 - 5);
                        objA3 = o.d.d.a(ExpandableListView.getPackedPositionType(0L) + 238, (char) (Drawable.resolveOpacity(0, 0) + 44531), (ViewConfiguration.getTouchSlop() >> 8) + 11, 35969549, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f21137o) ^ (-7649639543924978291L))));
                    j2 = -7649639543924978291L;
                } else {
                    j2 = -7649639543924978291L;
                    iIntValue = (short) (((short) (((long) f21138p[i2 + ((int) (((long) f21134l) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f21137o) ^ (-7649639543924978291L))));
                }
            } else {
                j2 = -7649639543924978291L;
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f21134l) ^ j2)) + i6;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f21135m), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a((-1) - MotionEvent.axisFromString(""), (char) (5358 - View.MeasureSpec.getMode(0)), TextUtils.lastIndexOf("", '0', 0) + 12, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f21139q;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i16 = 0; i16 < length3; i16++) {
                        int i17 = $11 + 29;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        bArr5[i16] = (byte) (((long) bArr4[i16]) ^ (-7649639543924978291L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = f21139q;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        int i19 = $11 + 25;
                        $10 = i19 % 128;
                        int i20 = i19 % 2;
                    } else {
                        short[] sArr = f21138p;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    }
                    sb.append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    jVar.f19934b++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // o.bh.b.d
    public final void a() throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f21141s + 57;
            f21140r = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            u((char) (ViewConfiguration.getEdgeSlop() >> 16), ViewConfiguration.getScrollDefaultDelay() >> 16, 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u((char) (53118 - TextUtils.getCapsMode("", 0, 0)), View.resolveSizeAndState(0, 0, 0) + 196, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f21149j.d();
        int i5 = f21140r + 87;
        f21141s = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.bh.b.d
    public final void b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21140r + 103;
        f21141s = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            u((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            v((short) (92 - KeyEvent.keyCodeFromString("")), 1503210172 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2021515319 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 2, (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f21149j.c();
        int i5 = f21141s + 37;
        f21140r = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void b(o.i.d dVar, o.h.d dVar2, boolean z2, boolean z3) throws Throwable {
        int i2 = 2 % 2;
        boolean z4 = false;
        if (f.a()) {
            int i3 = f21141s + 27;
            f21140r = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            u((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ViewConfiguration.getWindowTouchSlop() >> 8, 17 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            v((short) (KeyEvent.keyCodeFromString("") + 38), 1503210008 - TextUtils.indexOf("", ""), 2021515308 - Color.red(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 17, (byte) TextUtils.getTrimmedLength(""), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f21141s + 3;
            f21140r = i5 % 128;
            int i6 = i5 % 2;
        }
        if (!a(this.f21144a)) {
            int i7 = f21141s + 125;
            f21140r = i7 % 128;
            int i8 = i7 % 2;
            z4 = true;
        }
        this.f21148i = z4;
        b bVar = new b(this.f21144a, this, this.f21146g, this.f21145f);
        this.f21147h = bVar;
        bVar.d(dVar, dVar2, z2, this.f21148i, z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    @Override // o.bh.b.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(o.bg.c r10) throws java.lang.Throwable {
        /*
            r9 = this;
            r8 = 2
            int r0 = r8 % r8
            int r0 = o.bh.a.f21140r
            int r1 = r0 + 111
            int r0 = r1 % 128
            o.bh.a.f21141s = r0
            int r1 = r1 % r8
            r6 = 0
            if (r1 != 0) goto L8c
            boolean r1 = o.ea.f.a()
            r0 = 81
            int r0 = r0 / r6
            if (r1 == 0) goto L7a
        L18:
            java.lang.String r0 = ""
            int r0 = android.text.TextUtils.indexOf(r0, r0, r6)
            char r3 = (char) r0
            float r0 = android.media.AudioTrack.getMaxVolume()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            int r2 = r0 + (-1)
            float r0 = android.media.AudioTrack.getMaxVolume()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            int r1 = r0 + 16
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            u(r3, r2, r1, r0)
            r0 = r0[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.intern()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r1 = r0 >> 16
            r0 = 46147(0xb443, float:6.4666E-41)
            int r0 = r0 - r1
            char r3 = (char) r0
            int r0 = android.view.View.resolveSize(r6, r6)
            int r2 = 104 - r0
            int r0 = android.os.Process.myTid()
            int r0 = r0 >> 22
            int r1 = r0 + 24
            java.lang.Object[] r0 = new java.lang.Object[r7]
            u(r3, r2, r1, r0)
            r0 = r0[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r1 = r5.append(r0)
            o.bh.a$a r0 = r9.f21149j
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            o.ea.f.c(r4, r0)
        L7a:
            r0 = 0
            r9.f21147h = r0
            o.bh.a$a r0 = r9.f21149j
            r0.e(r10)
            int r0 = o.bh.a.f21141s
            int r1 = r0 + 5
            int r0 = r1 % 128
            o.bh.a.f21140r = r0
            int r1 = r1 % r8
            return
        L8c:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L7a
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.a.c(o.bg.c):void");
    }

    public final void c(InterfaceC0341a interfaceC0341a, Context context) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f21141s + 113;
            f21140r = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            u((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 16 - MotionEvent.axisFromString(""), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u((char) (TextUtils.getTrimmedLength("") + 44340), 'A' - AndroidCharacter.getMirror('0'), 33 - ImageFormat.getBitsPerPixel(0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f21149j = interfaceC0341a;
        this.f21144a = context;
        b bVar = this.f21147h;
        if (bVar != null) {
            int i5 = f21141s + 19;
            f21140r = i5 % 128;
            if (i5 % 2 != 0) {
                bVar.d(context);
                throw null;
            }
            bVar.d(context);
        }
        int i6 = f21141s + 71;
        f21140r = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.bh.b.d
    public final void d(o.bg.c cVar, o.by.g gVar) {
        int i2 = f21131d * (-1985972299);
        f21131d = i2;
        int iMyTid = Process.myTid();
        int i3 = f21129b * 714840927;
        f21129b = i3;
        d(i2, -110366004, iMyTid, 110366004, new Object[]{this, cVar, gVar}, i3, (int) SystemClock.elapsedRealtime());
    }

    public final void e() {
        int i2 = f21130c * (-1080928184);
        f21130c = i2;
        int i3 = 1427279142 * f21132e;
        f21132e = i3;
        d(i2, 1038993847, i3, -1038993846, new Object[]{this}, (int) Process.getElapsedCpuTime(), Process.myTid());
    }

    @Override // o.bh.b.d
    public final void e(boolean z2, o.f.a aVar, o.bg.c cVar) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            Object[] objArr = new Object[1];
            u((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0), 17 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            v((short) ((ViewConfiguration.getTouchSlop() >> 8) + 54), 1503210064 - ((Process.getThreadPriority(0) + 20) >> 6), 57447 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, (byte) TextUtils.indexOf("", "", 0), objArr2);
            f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(this.f21149j).toString());
            int i3 = f21141s + 87;
            f21140r = i3 % 128;
            int i4 = i3 % 2;
        }
        Object obj = null;
        this.f21147h = null;
        a(z2, aVar, cVar);
        int i5 = f21140r + 7;
        f21141s = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
