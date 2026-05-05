package o.bv;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.io.encoding.Base64;
import o.a.j;
import o.a.l;
import o.ea.f;
import okio.Utf8;
import org.msgpack.core.MessagePack;
import yg.C1607wl;
import yg.Jg;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public final class h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static i f21736a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f21737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21738c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static b f21739d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21740f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f21741g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static short[] f21742h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static byte[] f21743i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int[] f21744j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f21745k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f21746l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f21747m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f21748n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21749o = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21750e;

    /* JADX INFO: renamed from: o.bv.h$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f21751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f21752d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f21753e = 1;

        static {
            int[] iArr = new int[i.values().length];
            f21751c = iArr;
            try {
                iArr[i.f21759f.ordinal()] = 1;
                int i2 = f21752d;
                int i3 = (((-1) - (((-1) - i2) & ((-1) - 63))) << 1) - (i2 ^ 63);
                f21753e = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21751c[i.f21760g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21751c[i.f21754a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21751c[i.f21756c.ordinal()] = 4;
                int i6 = f21752d + 109;
                f21753e = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21751c[i.f21757d.ordinal()] = 5;
                int i8 = f21753e;
                int i9 = (i8 ^ 1) + (((i8 + 1) - (i8 | 1)) << 1);
                f21752d = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21751c[i.f21762j.ordinal()] = 6;
                int i11 = f21753e + 19;
                f21752d = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21751c[i.f21758e.ordinal()] = 7;
                int i14 = f21753e + 73;
                f21752d = i14 % 128;
                if (i14 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r9, int r10, byte r11) {
        /*
            byte[] r8 = o.bv.h.$$c
            int r0 = r11 * 3
            int r7 = r0 + 1
            int r6 = 121 - r9
            int r0 = r10 * 3
            int r5 = 4 - r0
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r8 != 0) goto L2a
            r1 = r5
            r6 = r7
            r2 = r3
        L14:
            int r6 = r6 + r5
            int r5 = r1 + 1
            r1 = r2
        L18:
            byte r0 = (byte) r6
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r8[r5]
            r1 = r5
            r5 = r0
            goto L14
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bv.h.$$g(short, int, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f21748n = 961709757;
        init$0();
        f21745k = 0;
        f21746l = 1;
        f21747m = 0;
        f21749o = 1;
        c();
        View.MeasureSpec.getMode(0);
        f21737b = new Object();
        int i2 = f21746l + 111;
        f21745k = i2 % 128;
        int i3 = i2 % 2;
    }

    public h() throws Throwable {
        Object[] objArr = new Object[1];
        p((short) View.MeasureSpec.makeMeasureSpec(0, 0), 1180333129 - (ViewConfiguration.getEdgeSlop() >> 16), (-629735164) - ((Process.getThreadPriority(0) + 20) >> 6), (-13) - MotionEvent.axisFromString(""), (byte) (TextUtils.lastIndexOf("", '0') - 79), objArr);
        this.f21750e = ((String) objArr[0]).intern();
    }

    private static String b(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21747m + 1;
        f21749o = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        p((short) Gravity.getAbsoluteGravity(0, 0), 1180333409 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-629735142) - Process.getGidForName(""), (-12) - (ViewConfiguration.getTouchSlop() >> 8), (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 12), objArr);
        String strIntern = ((String) objArr[0]).intern();
        short sXd = (short) (ZN.Xd() ^ 15356);
        int[] iArr = new int["$2)861-w.;;B4>E\u007f\u0016CCJ<PM".length()];
        QB qb = new QB("$2)861-w.;;B4>E\u007f\u0016CCJ<PM");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i5));
            i5++;
        }
        Object[] objArr2 = {strIntern, 0};
        Method method = Class.forName(new String(iArr, 0, i5)).getMethod(Jg.Wd("5\u000f6jt\u0006lVk-FQ.$I\u0012\u0010\u001dt\u001a", (short) (ZN.Xd() ^ 160), (short) (ZN.Xd() ^ 20773)), Class.forName(Xg.qd("&\u001e4 m-#1+r\u0019;:282", (short) (C1607wl.Xd() ^ 18297), (short) (C1607wl.Xd() ^ 29078))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
            Object[] objArr3 = new Object[1];
            p((short) KeyEvent.getDeadChar(0, 0), 1180333128 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-629735164) - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getTrimmedLength("") - 12, (byte) ((-80) - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr3);
            Object obj = null;
            String string = sharedPreferences.getString(((String) objArr3[0]).intern(), null);
            int i6 = f21749o + 101;
            f21747m = i6 % 128;
            if (i6 % 2 == 0) {
                return string;
            }
            obj.hashCode();
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void c() {
        f21738c = -46692806;
        f21740f = 1150422406;
        f21741g = 1629156038;
        f21743i = new byte[]{-102, Utf8.REPLACEMENT_BYTE, MessagePack.Code.EXT8, MessagePack.Code.UINT32, 57, 48, 47, MessagePack.Code.ARRAY32, Ascii.EM, MessagePack.Code.FIXEXT4, MessagePack.Code.FALSE, MessagePack.Code.UINT8, 44, MessagePack.Code.TRUE, MessagePack.Code.BIN8, 58, MessagePack.Code.UINT64, 120, -120, 58, 62, MessagePack.Code.BIN32, 44, Utf8.REPLACEMENT_BYTE, 38, MessagePack.Code.ARRAY16, Utf8.REPLACEMENT_BYTE, MessagePack.Code.EXT8, MessagePack.Code.UINT32, 57, 48, 47, MessagePack.Code.ARRAY32, Ascii.EM, -111, -103, 97, 104, -97, -106, 105, MessagePack.Code.EXT16, 50, -119, 108, MessagePack.Code.FIXEXT2, 34, 98, -98, 116, -118, 102, MessagePack.Code.FIXARRAY_PREFIX, 99, 110, MessagePack.Code.FIXARRAY_PREFIX, 96, -98, MessagePack.Code.INT32, 104, -106, 32, -103, 97, 104, -97, -106, -119, 123, -65, 64, -108, 101, -65, -17, Ascii.SYN, -27, 3, -9, 1, -19, Ascii.ESC, -24, -27, Ascii.ESC, -21, Ascii.NAK, 89, -94, -17, -17, -21, 69, -84, -17, -31, 1, -18, -31, Ascii.US, 17, 84, -85, -18, -23, Ascii.GS, -23, Ascii.NAK, 83, -85, Ascii.DC2, -22, -29, Ascii.DC4, Ascii.GS, -30, 67, -67, Ascii.DC4, 95, -29, Ascii.GS, -85, Ascii.DC2, -22, -29, Ascii.DC4, Ascii.GS, 2, -16, 52, MessagePack.Code.FLOAT64, Ascii.US, -18, -106, MessagePack.Code.FIXSTR_PREFIX, 83, 88, -84, 90, 81, -78, 76, Ascii.CAN, -30, 91, -93, -86, 93, 84, -85, 10, -12, 93, Ascii.SYN, -24, 88, Ascii.ETB, -86, 84, -30, 91, -93, -86, 93, 84, 75, -71, 125, -126, 86, -89, -78, MessagePack.Code.INT8, MessagePack.Code.FIXEXT16, 42, 44, 46, 46, 107, -99, MessagePack.Code.INT8, MessagePack.Code.INT64, Base64.padSymbol, MessagePack.Code.INT64, MessagePack.Code.ARRAY16, 125, -120, 42, 36, MessagePack.Code.INT32, 44, 40, 46, MessagePack.Code.STR16, 44, 39, MessagePack.Code.BIN8, 58, MessagePack.Code.ARRAY16, MessagePack.Code.FIXEXT4, 122, -108, 45, MessagePack.Code.FIXEXT2, MessagePack.Code.ARRAY16, 43, 34, MessagePack.Code.ARRAY32, 124, -98, 46, 97, MessagePack.Code.EXT32, 53, -99, MessagePack.Code.INT8, MessagePack.Code.INT64, Base64.padSymbol, MessagePack.Code.INT64, 60, -10, 42, 36, MessagePack.Code.INT32, 44, 40, 46, MessagePack.Code.STR16, 44, 39, MessagePack.Code.BIN8, 58, MessagePack.Code.ARRAY16, 54, MessagePack.Code.UINT8, 34, 46, MessagePack.Code.FIXEXT1, MessagePack.Code.ARRAY16, 40, MessagePack.Code.INT32, Ascii.CR, -13, 32, MessagePack.Code.INT16, -102, -103, 101, MessagePack.Code.UINT16, -128, -125, 109, -125, 108, -90, 122, 116, -126, 124, 120, 126, -118, 124, 119, -108, 106, -116, 102, -100, 114, 126, -124, -116, 120, -126, 93, -93, 112, -127, -87, 118, 122, -115, 113, -117, 117, -121, 121, -117, 122, 105, -125, -121, -117, 105, -127, -115, 108, -98, 127, 105, -105, 104, -127, -123, 127, 122, -125, -128, 121, 123, 127, -119, 126, 117, 75, MessagePack.Code.BIN32, 121, 123, 127, -119, 126, 117, 75, MessagePack.Code.BIN8, 116, -119, 5, -7, 8, -11, -10, 1, -18, 19, 2, Ascii.SI, -2, -14, 8, -6, -24, 112, -118, -118, -119, 113, -120, 91, -94, -120, 113, -126, 102, 117, -103, 114, 122, -104, 105, MessagePack.Code.FIXARRAY_PREFIX, -114, 68, 106, MessagePack.Code.BIN32, 112, -118, -118, -119, 113, -120, 91, -87, -126, -128, 82, -111, -120, 113, -126, 102, 117, -103, 114, 122, -104, 105, 71, MessagePack.Code.BIN32, 112, -118, -118, -119, 113, -120, 91, -94, -120, 113, -126, 102, 117, -103, 114, 122, -104, 105, 81, -75, -118, -118, -119, 113, -120, 123, -126, -120, 113, -126, 102, 117, -103, 114, 122, -104, -119, 49, -67, -123, 102, -119, -128, 124, -102, 124, 117, -119, 114, 65, -76, 112, -122, 50, MessagePack.Code.EXT32, 118, 116, 112, -122, 113, 122, 68, MessagePack.Code.FLOAT64, 123};
        f21744j = new int[]{1108731254, 1660700001, 42605787, 563697546, -1452917921, 212725016, -1623722961, -1922005046, -1070966928, 609737802, -1990840684, -838869201, -1408714638, -553948648, 1140498753, -741945271, -977955305, 1854521205};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int d(String str, b bVar, b bVar2) {
        int i2 = 2 % 2;
        int i3 = f21749o + 41;
        f21747m = i3 % 128;
        int i4 = i3 % 2;
        if (bVar.e().equals(str)) {
            int i5 = f21747m + 5;
            f21749o = i5 % 128;
            if (i5 % 2 != 0) {
                return -1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (bVar2.e().equals(str)) {
            int i6 = f21749o + 69;
            f21747m = i6 % 128;
            return i6 % 2 != 0 ? 0 : 1;
        }
        int i7 = f21749o + 61;
        f21747m = i7 % 128;
        int i8 = i7 % 2;
        return 0;
    }

    private static List<b> d(Context context) throws Throwable {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (f.a()) {
            Object[] objArr = new Object[1];
            q(new int[]{-2146053942, -261933933, 1328355722, 495211651, 1025279918, 366145975, -185405343, -1432706825}, 16 - View.resolveSizeAndState(0, 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            q(new int[]{-2090065770, -690759863, 268237116, -1417852998, 1909014384, -1545549596, 1015567064, 1063763906, 537839200, 508291976, -549363092, 1154234889, -268567526, -1479905768, -1454052218, -1044242066, -275190405, -1098062662, 1408354307, 1554017449, -1829282658, -441216255, -1488885099, -535632051}, ((Process.getThreadPriority(0) + 20) >> 6) + 46, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i3 = f21747m + 71;
            f21749o = i3 % 128;
            int i4 = i3 % 2;
        }
        arrayList.add(new c());
        arrayList.add(new e());
        final String strB = b(context);
        if (strB != null) {
            int i5 = f21747m + 9;
            f21749o = i5 % 128;
            int i6 = i5 % 2;
            Collections.sort(arrayList, new Comparator() { // from class: o.bv.h$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return h.d(strB, (b) obj, (b) obj2);
                }
            });
        }
        return arrayList;
    }

    public static o.bg.a e() {
        synchronized (f21737b) {
            i iVar = f21736a;
            if (iVar == null || f21739d == null || iVar == i.f21755b) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    q(new int[]{-2146053942, -261933933, 1328355722, 495211651, 1025279918, 366145975, -185405343, -1432706825}, 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    p((short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1180333301 - View.resolveSize(0, 0), (-629735140) - TextUtils.getOffsetBefore("", 0), (-13) - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (TextUtils.getCapsMode("", 0, 0) - 94), objArr2);
                    f.d(strIntern, ((String) objArr2[0]).intern());
                }
                return o.bg.a.F;
            }
            o.bg.a aVar = o.bg.a.F;
            switch (AnonymousClass4.f21751c[f21736a.ordinal()]) {
                case 1:
                    aVar = o.bg.a.E;
                case 2:
                    b bVar = f21739d;
                    if (bVar instanceof c) {
                        aVar = o.bg.a.I;
                    } else if (bVar instanceof e) {
                        aVar = o.bg.a.K;
                    }
                    break;
                case 3:
                    b bVar2 = f21739d;
                    if (bVar2 instanceof c) {
                        aVar = o.bg.a.G;
                    } else if (bVar2 instanceof e) {
                        aVar = o.bg.a.J;
                    }
                    break;
                case 4:
                    b bVar3 = f21739d;
                    if (bVar3 instanceof c) {
                        aVar = o.bg.a.L;
                    } else if (bVar3 instanceof e) {
                        aVar = o.bg.a.S;
                    }
                    break;
                case 5:
                    if (f21739d instanceof c) {
                        aVar = o.bg.a.N;
                    }
                    break;
                case 6:
                    if (f21739d instanceof e) {
                        aVar = o.bg.a.O;
                    }
                    break;
                case 7:
                    b bVar4 = f21739d;
                    if (bVar4 instanceof c) {
                        aVar = o.bg.a.M;
                    } else if (bVar4 instanceof e) {
                        aVar = o.bg.a.P;
                    }
                    break;
            }
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                q(new int[]{-2146053942, -261933933, 1328355722, 495211651, 1025279918, 366145975, -185405343, -1432706825}, 16 - TextUtils.getOffsetAfter("", 0), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr4 = new Object[1];
                p((short) TextUtils.getTrimmedLength(""), 1180333375 + View.resolveSize(0, 0), KeyEvent.normalizeMetaState(0) - 629735140, (-11) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) (View.combineMeasuredStates(0, 0) - 14), objArr4);
                f.c(strIntern2, sb.append(((String) objArr4[0]).intern()).append(aVar.e()).toString());
            }
            return aVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0381  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(android.content.Context r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bv.h.e(android.content.Context, java.lang.String):void");
    }

    static void init$0() {
        $$a = new byte[]{42, -91, MessagePack.Code.MAP16, 103};
        $$b = 158;
    }

    static void init$1() {
        $$d = new byte[]{119, -27, 45, 98};
        $$e = 176;
    }

    static void init$2() {
        $$c = new byte[]{3, 32, 122, 114};
        $$f = 226;
    }

    private static void p(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        long j2;
        boolean z2;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f21740f)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                objA = o.d.d.a(238 - ExpandableListView.getPackedPositionGroup(0L), (char) (44530 - TextUtils.indexOf((CharSequence) "", '0', 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, 35969549, false, $$g((byte) 17, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            int i8 = iIntValue == -1 ? 1 : 0;
            if (i8 == 0) {
                j2 = -7649639543924978291L;
            } else {
                byte[] bArr2 = f21743i;
                if (bArr2 != null) {
                    int i9 = $11 + 17;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        int i12 = $11 + 71;
                        $10 = i12 % 128;
                        int i13 = i12 % i6;
                        Object[] objArr3 = {Integer.valueOf(bArr2[i11])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            objA2 = o.d.d.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28649), 11 - (ViewConfiguration.getTapTimeout() >> 16), 1621469864, false, $$g((byte) 18, b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr3[i11] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        i11++;
                        i6 = 2;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = f21743i;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f21738c)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b5 = (byte) 0;
                        objA3 = o.d.d.a(238 - TextUtils.getOffsetBefore("", 0), (char) (44531 - (KeyEvent.getMaxKeyCode() >> 16)), View.resolveSizeAndState(0, 0, 0) + 11, 35969549, false, $$g((byte) 17, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f21740f) ^ (-7649639543924978291L))));
                    j2 = -7649639543924978291L;
                } else {
                    j2 = -7649639543924978291L;
                    iIntValue = (short) (((short) (((long) f21742h[i2 + ((int) (((long) f21738c) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f21740f) ^ (-7649639543924978291L))));
                }
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f21738c) ^ j2)) + i8;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f21741g), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a(Process.myPid() >> 22, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5358), 11 - TextUtils.indexOf("", ""), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr5 = f21743i;
                if (bArr5 != null) {
                    int i14 = $10 + 89;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        int i15 = $11 + 13;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            bArr[i5] = (byte) (((long) bArr5[i5]) / (-7649639543924978291L));
                            i5 %= 1;
                        } else {
                            bArr[i5] = (byte) (((long) bArr5[i5]) ^ (-7649639543924978291L));
                            i5++;
                        }
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i16 = $10 + 113;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    z2 = true;
                } else {
                    int i18 = $11 + 81;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        int i19 = 2 % 3;
                    }
                    z2 = false;
                }
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    int i20 = $10;
                    int i21 = i20 + 21;
                    $11 = i21 % 128;
                    int i22 = i21 % 2;
                    if (z2) {
                        int i23 = i20 + 89;
                        $11 = i23 % 128;
                        int i24 = i23 % 2;
                        byte[] bArr6 = f21743i;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f21742h;
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

    private static void q(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f21744j;
        int i4 = 989264422;
        long j2 = 0;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = $11 + 59;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(ExpandableListView.getPackedPositionChild(j2) + 676, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 12 - KeyEvent.normalizeMetaState(0), -328001469, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i8++;
                    i4 = 989264422;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f21744j;
        if (iArr5 != null) {
            int i9 = $11 + 61;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i11])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) i5;
                    byte b5 = b4;
                    objA2 = o.d.d.a(((Process.getThreadPriority(i5) + 20) >> 6) + 675, (char) (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, -328001469, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i11++;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length2);
        lVar.f19941d = i5;
        while (lVar.f19941d < iArr.length) {
            cArr[i5] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                lVar.f19942e ^= iArr4[i12];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    int iMakeMeasureSpec = 301 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    char c2 = (char) (52697 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    int i14 = 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte b6 = (byte) ($$f & 15);
                    byte b7 = (byte) (b6 - 2);
                    objA3 = o.d.d.a(iMakeMeasureSpec, c2, i14, -1416256172, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i12++;
            }
            int i15 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i15;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i16 = lVar.f19942e;
            int i17 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                int iLastIndexOf = 228 - TextUtils.lastIndexOf("", '0', 0, 0);
                char c3 = (char) (51005 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int touchSlop = 9 - (ViewConfiguration.getTouchSlop() >> 8);
                byte length4 = (byte) $$c.length;
                byte b8 = (byte) (length4 - 4);
                objA4 = o.d.d.a(iLastIndexOf, c3, touchSlop, -330018025, false, $$g(length4, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i18 = $10 + 107;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void r(short r9, int r10, byte r11, java.lang.Object[] r12) {
        /*
            int r8 = 100 - r10
            int r0 = r11 * 3
            int r7 = r0 + 1
            byte[] r6 = o.bv.h.$$a
            int r0 = r9 * 4
            int r0 = 4 - r0
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L2d
            r3 = r4
            r2 = r0
        L13:
            int r1 = -r0
            int r1 = r1 + r8
            int r0 = r2 + 1
            r2 = r3
            r8 = r1
        L19:
            int r3 = r2 + 1
            byte r1 = (byte) r8
            r5[r2] = r1
            if (r3 != r7) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L28:
            r1 = r6[r0]
            r2 = r0
            r0 = r1
            goto L13
        L2d:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bv.h.r(short, int, byte, java.lang.Object[]):void");
    }

    private static void s(short s2, byte b2, int i2, Object[] objArr) {
        int i3 = (b2 * 3) + 4;
        int i4 = 97 - (s2 * 2);
        byte[] bArr = $$d;
        int i5 = i2 * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i3++;
            i4 += -i6;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3++;
                i4 += -bArr[i3];
            }
        }
    }

    public final b a(Context context) throws Throwable {
        Object[] objArr = new Object[1];
        q(new int[]{-2146053942, -261933933, 1328355722, 495211651, 1025279918, 366145975, -185405343, -1432706825}, Color.alpha(0) + 16, objArr);
        String strIntern = ((String) objArr[0]).intern();
        synchronized (f21737b) {
            if (f21736a != i.f21755b) {
                if (f.a()) {
                    Object[] objArr2 = new Object[1];
                    p((short) Color.alpha(0), 1180333163 + ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getEdgeSlop() >> 16) - 629735140, (-13) - TextUtils.indexOf((CharSequence) "", '0'), (byte) (TextUtils.getTrimmedLength("") + 22), objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                List<b> listD = d(context);
                Iterator<b> it = listD.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    b next = it.next();
                    i iVarA = next.a(context);
                    i iVar = f21736a;
                    if (iVar == null || iVar.b() > iVarA.b()) {
                        f21736a = iVarA;
                        f21739d = next;
                        if (iVarA == i.f21755b) {
                            if (f.a()) {
                                StringBuilder sb = new StringBuilder();
                                Object[] objArr3 = new Object[1];
                                q(new int[]{-2138247576, 1114211592, 196592822, -366490151, -186311164, -1168872937, 1929521132, -1950144608, 174393573, -1214491743, 1328355722, 495211651, 2100586760, -2141320191, 1482368349, 1997888634, 2101599860, -1469723984, -984894216, -184016264}, 38 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
                                f.c(strIntern, sb.append(((String) objArr3[0]).intern()).append(f21739d.e()).toString());
                            }
                            if (listD.indexOf(f21739d) != 0) {
                                if (f.a()) {
                                    Object[] objArr4 = new Object[1];
                                    p((short) Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.getSize(0) + 1180333202, (-629735140) - Color.green(0), (-12) - Color.green(0), (byte) ((-99) - TextUtils.getOffsetBefore("", 0)), objArr4);
                                    f.c(strIntern, ((String) objArr4[0]).intern());
                                }
                                e(context, f21739d.e());
                            } else if (f.a()) {
                                Object[] objArr5 = new Object[1];
                                q(new int[]{-2138247576, 1114211592, 196592822, -366490151, -186311164, -1168872937, 1015567064, 1063763906, 1716184952, -873484847, 1143473510, 726020377, -186311164, -1168872937, -1951669356, 1910697383, -108783100, -321232584, -2019191514, -526930494, -1987134657, 1841762130}, Color.blue(0) + 44, objArr5);
                                f.c(strIntern, ((String) objArr5[0]).intern());
                            }
                            if (f.a()) {
                                Object[] objArr6 = new Object[1];
                                q(new int[]{-2138247576, 1114211592, 196592822, -366490151, -186311164, -1168872937, -747175118, 940947142, 1008053871, -1403202330, -2127343691, 848158075, 890749188, -233962964, 1304043060, -566105256, 1453293089, -1043555305}, ExpandableListView.getPackedPositionType(0L) + 35, objArr6);
                                f.c(strIntern, ((String) objArr6[0]).intern());
                            }
                            f21739d.c(context);
                        }
                    }
                }
            }
            if (f21736a == i.f21755b) {
                return f21739d;
            }
            if (f.a()) {
                Object[] objArr7 = new Object[1];
                p((short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1180333263 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) - 629735140, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 12, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 43), objArr7);
                f.d(strIntern, ((String) objArr7[0]).intern());
            }
            return null;
        }
    }
}
