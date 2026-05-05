package o.br;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.jvm.internal.CharCompanionObject;
import o.a.f;
import o.a.m;
import o.a.q;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
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
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c */
    public static int f21539c = 0;

    /* JADX INFO: renamed from: d */
    public static int f21540d = 0;

    /* JADX INFO: renamed from: e */
    public static int f21541e = 0;

    /* JADX INFO: renamed from: f */
    private static int f21542f = 0;

    /* JADX INFO: renamed from: g */
    private static long f21543g = 0;

    /* JADX INFO: renamed from: h */
    private static int f21544h = 0;

    /* JADX INFO: renamed from: j */
    private static char[] f21545j = null;

    /* JADX INFO: renamed from: k */
    private static int f21546k = 0;

    /* JADX INFO: renamed from: m */
    private static int f21547m = 0;

    /* JADX INFO: renamed from: a */
    private o.bk.c f21548a;

    /* JADX INFO: renamed from: b */
    private o.bk.a f21549b;

    /* JADX INFO: renamed from: i */
    private b f21550i;

    public static final class b extends Enum<b> implements o.en.a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        public static final b f21551b;

        /* JADX INFO: renamed from: c */
        public static final b f21552c;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ b[] f21553d;

        /* JADX INFO: renamed from: e */
        private static b f21554e = null;

        /* JADX INFO: renamed from: f */
        private static boolean f21555f = false;

        /* JADX INFO: renamed from: g */
        private static int f21556g = 0;

        /* JADX INFO: renamed from: h */
        private static boolean f21557h = false;

        /* JADX INFO: renamed from: i */
        private static int f21558i = 0;

        /* JADX INFO: renamed from: j */
        private static char[] f21559j = null;

        /* JADX INFO: renamed from: k */
        private static int f21560k = 0;

        /* JADX INFO: renamed from: l */
        private static int f21561l = 0;

        /* JADX INFO: renamed from: m */
        private static int f21562m = 0;

        /* JADX INFO: renamed from: a */
        private final String f21563a;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r9, int r10, short r11) {
            /*
                byte[] r8 = o.br.a.b.$$a
                int r0 = r9 * 4
                int r7 = 3 - r0
                int r6 = r10 * 4
                int r1 = r6 + 1
                int r0 = r11 * 6
                int r5 = r0 + 67
                byte[] r4 = new byte[r1]
                r3 = 0
                if (r8 != 0) goto L2d
                r2 = r7
                r1 = r6
                r0 = r3
            L16:
                int r7 = r7 + r1
                r1 = r0
                r5 = r7
                r7 = r2
            L1a:
                int r2 = r7 + 1
                byte r0 = (byte) r5
                r4[r1] = r0
                int r0 = r1 + 1
                if (r1 != r6) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L29:
                r1 = r8[r2]
                r7 = r5
                goto L16
            L2d:
                r1 = r3
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.br.a.b.$$c(int, int, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f21560k = 0;
            f21562m = 1;
            f21556g = 0;
            f21561l = 1;
            d();
            Object[] objArr = new Object[1];
            n(127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), null, null, "\u0083\u0081\u0082\u0081", objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            n((ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, null, "\u0083\u0081\u0082\u0081", objArr2);
            f21552c = new b(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            n((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, null, null, "\u0089\u0083\u0086\u0088\u0087\u0084\u0086\u0085\u0083\u0084", objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            n(127 - ExpandableListView.getPackedPositionGroup(0L), null, null, "\u0089\u0083\u0086\u0088\u0087\u0084\u0086\u0085\u0083\u0084", objArr4);
            f21554e = new b(strIntern2, 1, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            n((Process.myPid() >> 22) + 127, null, null, "\u008c\u008c\u008b\u008a", objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            n(127 - (ViewConfiguration.getJumpTapTimeout() >> 16), null, null, "\u008c\u008c\u008b\u008a", objArr6);
            f21551b = new b(strIntern3, 2, ((String) objArr6[0]).intern());
            f21553d = c();
            int i2 = f21562m + 59;
            f21560k = i2 % 128;
            int i3 = i2 % 2;
        }

        private b(String str, int i2, String str2) {
            super(str, i2);
            this.f21563a = str2;
        }

        private static /* synthetic */ b[] c() {
            int i2 = 2 % 2;
            int i3 = f21561l + 115;
            int i4 = i3 % 128;
            f21556g = i4;
            int i5 = i3 % 2;
            b[] bVarArr = {f21552c, f21554e, f21551b};
            int i6 = i4 + 69;
            f21561l = i6 % 128;
            int i7 = i6 % 2;
            return bVarArr;
        }

        static void d() {
            f21559j = new char[]{2155, 2152, 2146, 2135, 2132, 2133, 2158, 2148, 2149, 2147, 2130, 2157};
            f21558i = 2040400313;
            f21557h = true;
            f21555f = true;
        }

        static void init$0() {
            $$a = new byte[]{40, 101, 74, -30};
            $$b = 252;
        }

        private static void n(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            char[] cArr;
            String str3 = str;
            String str4 = str2;
            int i3 = 2;
            int i4 = 2 % 2;
            int i5 = $10;
            int i6 = i5 + 79;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            Object bytes = str4;
            if (str4 != null) {
                int i8 = i5 + 35;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                bytes = str4.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr2 = (char[]) charArray;
            f fVar = new f();
            char[] cArr3 = f21559j;
            float f2 = 0.0f;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i10 = $10 + 65;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 0;
                while (i12 < length) {
                    int i13 = $11 + 109;
                    $10 = i13 % 128;
                    int i14 = i13 % i3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i12])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 593;
                            char c2 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13181);
                            int i15 = (TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1)) + 11;
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(windowTouchSlop, c2, i15, -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i12++;
                        i3 = 2;
                        f2 = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr4;
            }
            Object[] objArr3 = {Integer.valueOf(f21558i)};
            Object objA2 = o.d.d.a(-1503702982);
            long j2 = 0;
            if (objA2 == null) {
                objA2 = o.d.d.a(32 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 10 - MotionEvent.axisFromString(""), 1893380703, false, "F", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            char c3 = '0';
            int i16 = 1540807955;
            if (f21555f) {
                int i17 = $11 + 17;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    fVar.f19923e = bArr.length;
                    cArr = new char[fVar.f19923e];
                    fVar.f19922a = 1;
                } else {
                    fVar.f19923e = bArr.length;
                    cArr = new char[fVar.f19923e];
                    fVar.f19922a = 0;
                }
                while (fVar.f19922a < fVar.f19923e) {
                    cArr[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = o.d.d.a(1540807955);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA3 = o.d.d.a((SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)) + 457, (char) (TextUtils.lastIndexOf("", '0') + 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, -1923924106, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    j2 = 0;
                }
                objArr[0] = new String(cArr);
                return;
            }
            if (!f21557h) {
                fVar.f19923e = iArr.length;
                char[] cArr5 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    int i18 = $10 + 113;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    cArr5[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    fVar.f19922a++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            fVar.f19923e = cArr2.length;
            char[] cArr6 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i20 = $11 + 103;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    cArr6[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e + 1) - fVar.f19922a] / i2] - iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = o.d.d.a(i16);
                    if (objA4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA4 = o.d.d.a(458 - (ViewConfiguration.getScrollBarSize() >> 8), (char) Color.alpha(0), TextUtils.lastIndexOf("", c3, 0, 0) + 12, -1923924106, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                } else {
                    cArr6[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    Object[] objArr6 = {fVar, fVar};
                    Object objA5 = o.d.d.a(i16);
                    if (objA5 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA5 = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 457, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 11 - Color.green(0), -1923924106, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                    c3 = '0';
                    i16 = 1540807955;
                }
            }
            objArr[0] = new String(cArr6);
        }

        public static b valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f21556g + 93;
            f21561l = i3 % 128;
            int i4 = i3 % 2;
            b bVar = (b) Enum.valueOf(b.class, str);
            if (i4 != 0) {
                return bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static b[] values() {
            int i2 = 2 % 2;
            int i3 = f21561l + 53;
            f21556g = i3 % 128;
            int i4 = i3 % 2;
            b[] bVarArr = (b[]) f21553d.clone();
            int i5 = f21556g + 5;
            f21561l = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 58 / 0;
            }
            return bVarArr;
        }

        @Override // o.en.a
        public final String a() {
            String str;
            int i2 = 2 % 2;
            int i3 = f21561l;
            int i4 = i3 + 9;
            f21556g = i4 % 128;
            if (i4 % 2 != 0) {
                str = this.f21563a;
                int i5 = 39 / 0;
            } else {
                str = this.f21563a;
            }
            int i6 = i3 + 69;
            f21556g = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    private static String $$c(short s2, int i2, byte b2) {
        int i3 = i2 + 4;
        int i4 = s2 * 2;
        int i5 = 120 - b2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5 = i3 + i6;
            i3 = i3;
        }
        while (true) {
            int i8 = i3 + 1;
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i5 += bArr[i8];
            i3 = i8;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21540d = 1684214718;
        f21539c = -1454196748;
        f21541e = 1931379679;
        f21546k = 0;
        f21547m = 1;
        f21542f = 0;
        f21544h = 1;
        g();
        KeyEvent.normalizeMetaState(0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        Process.getThreadPriority(0);
        ExpandableListView.getPackedPositionGroup(0L);
        ViewConfiguration.getTouchSlop();
        KeyEvent.normalizeMetaState(0);
        int i2 = f21547m + 99;
        f21546k = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public a(Context context) throws Throwable {
        a(context);
    }

    private void a(Context context) throws Throwable {
        int i2 = 2 % 2;
        boolean zA = o.ea.f.a();
        String strQd = C1561oA.Qd("쬢\uecf7\uedf2\ueebd\ue7ba\ue89a\uea8f\ueb62\uf465\uf53e", (short) (C1580rY.Xd() ^ (-7889)));
        String strZd = C1593ug.zd("efghijk֞֟n֡pqrs֦֧v֩x֫z֭|ְֱ֯\u0001", (short) (C1580rY.Xd() ^ (-14504)), (short) (C1580rY.Xd() ^ (-31342)));
        if (zA) {
            Object[] objArr = new Object[1];
            l(strZd, new int[]{0, 28, 45, 0}, true, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            n(strQd, 65257 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i3 = f21542f + 107;
            f21544h = i3 % 128;
            int i4 = i3 % 2;
        }
        this.f21549b = null;
        this.f21548a = null;
        Object[] objArr3 = new Object[1];
        l(C1561oA.od("=הד:987654\u05cb210/.-,׃ׂ)('־%$#ֺ!ָ\u001f\u001e\u001d\u001cֳ\u001a\u0019ְ\u0017\u0016\u0015\u0014֫\u0012\u0011֧֨", (short) (ZN.Xd() ^ 16918)), new int[]{28, 47, 186, 0}, true, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Class<?> cls = Class.forName(C1561oA.Kd("\u0014\"\u0019(&!\u001dg\u001e++2$.5o\u000633:,@=", (short) (ZN.Xd() ^ 21324)));
        Class<?>[] clsArr = {Class.forName(Wg.Zd(")iCu\u0007\u000bH\u0011VfX={0y:", (short) (C1607wl.Xd() ^ 12577), (short) (C1607wl.Xd() ^ 25459))), Integer.TYPE};
        Object[] objArr4 = {strIntern2, 0};
        short sXd = (short) (C1633zX.Xd() ^ (-21415));
        int[] iArr = new int["ihxXnhznn[~rtt\u0003v\u0001vy\t".length()];
        QB qb = new QB("ihxXnhznn[~rtt\u0003v\u0001vy\t");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (sXd + i5));
            i5++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i5), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr4);
            Object[] objArr5 = new Object[1];
            l(Wg.vd("\u001eِ ", (short) (C1607wl.Xd() ^ 3048)), new int[]{75, 3, 0, 0}, false, objArr5);
            String strC = new o.dk.a(context).c(sharedPreferences.getString(((String) objArr5[0]).intern(), ""));
            if (strC != null) {
                int i6 = f21544h + 87;
                f21542f = i6 % 128;
                int i7 = i6 % 2;
                if (!strC.isEmpty()) {
                    try {
                        a(new o.ef.a(strC));
                        return;
                    } catch (o.ef.b e2) {
                        if (o.ea.f.a()) {
                            Object[] objArr6 = new Object[1];
                            l(strZd, new int[]{0, 28, 45, 0}, true, objArr6);
                            String strIntern3 = ((String) objArr6[0]).intern();
                            Object[] objArr7 = new Object[1];
                            n(strQd, 65257 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr7);
                            o.ea.f.e(strIntern3, ((String) objArr7[0]).intern(), e2);
                            return;
                        }
                        return;
                    }
                }
            }
            if (o.ea.f.a()) {
                Object[] objArr8 = new Object[1];
                l(strZd, new int[]{0, 28, 45, 0}, true, objArr8);
                String strIntern4 = ((String) objArr8[0]).intern();
                Object[] objArr9 = new Object[1];
                l(Qg.kd("%ڶ#\"!ڲڱڰ\u001d\u001cڭ\u001a\u0019\u0018\u0017\u0016\u0015\u0014ڥ\u0012\u0011\u0010\u000f", (short) (C1499aX.Xd() ^ (-17080)), (short) (C1499aX.Xd() ^ (-31690))), new int[]{78, 23, 0, 0}, true, objArr9);
                o.ea.f.c(strIntern4, ((String) objArr9[0]).intern());
                int i8 = f21544h + 63;
                f21542f = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 4 % 3;
                }
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private boolean a(o.ef.a aVar) throws Throwable {
        o.bk.a aVar2;
        String strIntern;
        o.bk.c cVar;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21544h + 71;
        f21542f = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        l("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{0, 28, 45, 0}, true, objArr);
        String strIntern2 = ((String) objArr[0]).intern();
        if (o.ea.f.a()) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            l("\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{101, 27, 94, 0}, true, objArr2);
            o.ea.f.c(strIntern2, sb.append(((String) objArr2[0]).intern()).append(aVar).toString());
            int i5 = f21544h + 51;
            f21542f = i5 % 128;
            int i6 = i5 % 2;
        }
        try {
            Object[] objArr3 = new Object[1];
            n("\ueb88⣯测ꆯ", 50021 - View.MeasureSpec.getSize(0), objArr3);
            b bVar = (b) ((Enum) o.ef.a.a(-303551916, new Object[]{aVar, b.class, ((String) objArr3[0]).intern()}, Process.myPid(), Process.myUid(), 303551919, (int) Thread.currentThread().getId(), (int) SystemClock.elapsedRealtime()));
            int i7 = f21544h + 55;
            f21542f = i7 % 128;
            int i8 = i7 % 2;
            boolean z2 = !Objects.equals(this.f21550i, bVar);
            if (bVar == b.f21552c) {
                this.f21550i = bVar;
                this.f21549b = null;
                this.f21548a = null;
                if (o.ea.f.a()) {
                    Object[] objArr4 = new Object[1];
                    l("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{128, 64, 95, 0}, true, objArr4);
                    o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
                }
                return z2;
            }
            Object[] objArr5 = new Object[1];
            n("\ueb83ཋ∙䗕碛鱧뜼꫱춎\ue17fэ㼌勔疌楎谨", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 58567, objArr5);
            Object[] objArr6 = new Object[1];
            l("\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001", new int[]{192, 21, 0, 1}, false, objArr6);
            Object[] objArr7 = new Object[1];
            l("\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{Mp4VideoDirectory.TAG_COLOR_TABLE, 17, 111, 0}, false, objArr7);
            Object[] objArr8 = new Object[1];
            l("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000", new int[]{230, 20, 0, 0}, false, objArr8);
            if (aVar.e(((String) objArr5[0]).intern(), ((String) objArr6[0]).intern(), ((String) objArr7[0]).intern(), ((String) objArr8[0]).intern())) {
                try {
                    Object[] objArr9 = new Object[1];
                    n("\ueb83ཋ∙䗕碛鱧뜼꫱춎\ue17fэ㼌勔疌楎谨", Color.argb(0, 0, 0, 0) + 58567, objArr9);
                    Object[] objArr10 = {aVar, ((String) objArr9[0]).intern()};
                    int i9 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i9;
                    String str = (String) o.ef.a.a(-781664457, objArr10, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i9, Thread.currentThread().getPriority());
                    Object[] objArr11 = new Object[1];
                    l("\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001", new int[]{192, 21, 0, 1}, false, objArr11);
                    Object[] objArr12 = {aVar, ((String) objArr11[0]).intern()};
                    int i10 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i10;
                    String str2 = (String) o.ef.a.a(-781664457, objArr12, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i10, Thread.currentThread().getPriority());
                    Object[] objArr13 = new Object[1];
                    l("\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{Mp4VideoDirectory.TAG_COLOR_TABLE, 17, 111, 0}, false, objArr13);
                    Object[] objArr14 = {aVar, ((String) objArr13[0]).intern()};
                    int i11 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i11;
                    String str3 = (String) o.ef.a.a(-781664457, objArr14, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i11, Thread.currentThread().getPriority());
                    Object[] objArr15 = new Object[1];
                    l("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000", new int[]{230, 20, 0, 0}, false, objArr15);
                    Object[] objArr16 = {aVar, ((String) objArr15[0]).intern()};
                    int i12 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i12;
                    String str4 = (String) o.ef.a.a(-781664457, objArr16, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i12, Thread.currentThread().getPriority());
                    if (o.ea.f.a()) {
                        int i13 = f21544h + 71;
                        f21542f = i13 % 128;
                        if (i13 % 2 != 0) {
                            Object[] objArr17 = new Object[1];
                            n("\ueb97\u2d6b晒뽀\uf00aझ䈉鯮\udcd4ᗁ⺾枎뢀\uf27eୖ䱏蔻\ude56ᝊ⢴憔몂\uf385㒝䶌蝲\ud81bᅪ⨸挈ꐊﷲ㛤保肶\ud9e4ኊ命浩ꙎＴ〡䤞苮\udbe0᳞営溯ꞛ", 50923 << (ViewConfiguration.getLongPressTimeout() >> 103), objArr17);
                            strIntern = ((String) objArr17[0]).intern();
                        } else {
                            Object[] objArr18 = new Object[1];
                            n("\ueb97\u2d6b晒뽀\uf00aझ䈉鯮\udcd4ᗁ⺾枎뢀\uf27eୖ䱏蔻\ude56ᝊ⢴憔몂\uf385㒝䶌蝲\ud81bᅪ⨸挈ꐊﷲ㛤保肶\ud9e4ኊ命浩ꙎＴ〡䤞苮\udbe0᳞営溯ꞛ", 50923 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr18);
                            strIntern = ((String) objArr18[0]).intern();
                        }
                        o.ea.f.c(strIntern2, strIntern);
                    }
                    aVar2 = new o.bk.a(str, str2, str3, str4);
                } catch (o.ef.b e2) {
                    if (o.ea.f.a()) {
                        Object[] objArr19 = new Object[1];
                        n("\ueb97㕱噦睒遢넿툭\uf314ᰄ㷻建翌飈리\udaa2ﮕқ◌䜾怦脜ꈀ쌆\uec2cജ⸎俳棫覙ꫜ쮴ᓪ㖷嚑瞆酲눡퍶ﱊᴠ㸨弞砎駭뫬\udb98\ue4c8ֵ⚻䞢悞膁ꍤ챲\ued52๖⼴䠣椑", 57073 - View.MeasureSpec.getSize(0), objArr19);
                        o.ea.f.e(strIntern2, ((String) objArr19[0]).intern(), e2);
                    }
                    throw e2;
                }
            } else {
                if (o.ea.f.a()) {
                    int i14 = f21544h + 17;
                    f21542f = i14 % 128;
                    if (i14 % 2 != 0) {
                        Object[] objArr20 = new Object[1];
                        n("\ueb97͛㨲儐䣊柍麩뙾굔쐱\uf31e\ueafeǀ㢎偶佟昻鵆뒪ꎄ\udad4\uf232\ue979'㽍囀䶲撎鱴譈ꈮ\ud913\uf0e0\ueffeڐ㹻啇䰤笎鋟覨ꂄ\ud86a\uf758\uee28\u05f5㳑", Process.myPid() + 59731, objArr20);
                        obj = objArr20[0];
                    } else {
                        Object[] objArr21 = new Object[1];
                        n("\ueb97͛㨲儐䣊柍麩뙾굔쐱\uf31e\ueafeǀ㢎偶佟昻鵆뒪ꎄ\udad4\uf232\ue979'㽍囀䶲撎鱴譈ꈮ\ud913\uf0e0\ueffeڐ㹻啇䰤笎鋟覨ꂄ\ud86a\uf758\uee28\u05f5㳑", 59611 - (Process.myPid() >> 22), objArr21);
                        obj = objArr21[0];
                    }
                    o.ea.f.c(strIntern2, ((String) obj).intern());
                }
                aVar2 = null;
            }
            if (!Objects.equals(aVar2, this.f21549b)) {
                int i15 = f21544h + 47;
                f21542f = i15 % 128;
                int i16 = i15 % 2;
                z2 = true;
            }
            Object[] objArr22 = new Object[1];
            n("\ueb8d\uddab蟐䧍㌙\ue53a꽾酴", 13859 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr22);
            Object[] objArr23 = new Object[1];
            n("\ueb8d寳譠𥉉⩹駲쥃㣝桋\udfd3ཇ练깑ᶿ䴭벙\uec31", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45179, objArr23);
            Object[] objArr24 = new Object[1];
            n("\ueb8d㞹叴缷魑Ꝡ슓\ueec0ਂ嘶牪鶝망엑\ue12f", 56369 - (ViewConfiguration.getTouchSlop() >> 8), objArr24);
            Object[] objArr25 = new Object[1];
            n("\ueb8d㕅嘌矃邿놐퍎ﰒᷢ㺠德祘騖믦쒶\ue585݁‱䇫", 57037 - TextUtils.indexOf("", "", 0), objArr25);
            if (aVar.e(((String) objArr22[0]).intern(), ((String) objArr23[0]).intern(), ((String) objArr24[0]).intern(), ((String) objArr25[0]).intern())) {
                try {
                    Object[] objArr26 = new Object[1];
                    n("\ueb8d\uddab蟐䧍㌙\ue53a꽾酴", 13859 - (Process.myTid() >> 22), objArr26);
                    Object[] objArr27 = {aVar, ((String) objArr26[0]).intern()};
                    int i17 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i17;
                    String str5 = (String) o.ef.a.a(-781664457, objArr27, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i17, Thread.currentThread().getPriority());
                    Object[] objArr28 = new Object[1];
                    n("\ueb8d寳譠𥉉⩹駲쥃㣝桋\udfd3ཇ练깑ᶿ䴭벙\uec31", ((Process.getThreadPriority(0) + 20) >> 6) + 45179, objArr28);
                    Object[] objArr29 = {aVar, ((String) objArr28[0]).intern()};
                    int i18 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i18;
                    Object[] objArr30 = new Object[1];
                    n("\ueb8d㞹叴缷魑Ꝡ슓\ueec0ਂ嘶牪鶝망엑\ue12f", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 56369, objArr30);
                    Object[] objArr31 = {aVar, ((String) objArr30[0]).intern()};
                    int i19 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i19;
                    String str6 = (String) o.ef.a.a(-781664457, objArr31, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i19, Thread.currentThread().getPriority());
                    Object[] objArr32 = new Object[1];
                    n("\ueb8d㕅嘌矃邿놐퍎ﰒᷢ㺠德祘騖믦쒶\ue585݁‱䇫", Color.blue(0) + 57037, objArr32);
                    Object[] objArr33 = {aVar, ((String) objArr32[0]).intern()};
                    int i20 = o.ef.a.f23782p * (-1576737484);
                    o.ef.a.f23782p = i20;
                    String str7 = (String) o.ef.a.a(-781664457, objArr33, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i20, Thread.currentThread().getPriority());
                    if (o.ea.f.a()) {
                        Object[] objArr34 = new Object[1];
                        l(null, new int[]{250, 44, 171, 2}, true, objArr34);
                        o.ea.f.c(strIntern2, ((String) objArr34[0]).intern());
                    }
                    cVar = new o.bk.c(str5, str6, str7);
                } catch (o.ef.b e3) {
                    if (o.ea.f.a()) {
                        Object[] objArr35 = new Object[1];
                        n("\ueb97\uddd3蜢䥸㋪\ue415깹韆夔ͩ\uf4ae븆恠⦦ጆ앗躻灎㨚\ue3ec햴鼊䂒૾ﱌꖜ濧允\u1ad1쳶똰翈⇷\ueb33\udc82蛘䡩㉒ﯺ괓霽壍Ȕ\uf47a뷇望⥨ክ쐇蹧瞧㤅\ue356풤", 13907 - Color.blue(0), objArr35);
                        o.ea.f.e(strIntern2, ((String) objArr35[0]).intern(), e3);
                        int i21 = f21542f + 31;
                        f21544h = i21 % 128;
                        if (i21 % 2 == 0) {
                            int i22 = 2 / 2;
                        }
                    }
                    throw e3;
                }
            } else {
                cVar = null;
                if (o.ea.f.a()) {
                    Object[] objArr36 = new Object[1];
                    n("\ueb97䘡냆\ue362崢辯祉哤蚄\uf12b⏚鹼절㪼镂쟥㆛汼\ude9eश筜헰}狽곝ἔ䧲ꑍᙙ䂻더\uedf4徣詍\ue4e0嚓脳\uf3c1\u2e77頋쪢╂", 44449 - TextUtils.getOffsetAfter("", 0), objArr36);
                    o.ea.f.c(strIntern2, ((String) objArr36[0]).intern());
                }
            }
            boolean z3 = Objects.equals(cVar, this.f21548a) ? z2 : true;
            this.f21550i = bVar;
            this.f21549b = aVar2;
            this.f21548a = cVar;
            return z3;
        } catch (o.ef.b e4) {
            if (o.ea.f.a()) {
                Object[] objArr37 = new Object[1];
                n("\ueb97뷱䝦\ue8d2뉢宿\ued2d뚔堄\ue27b诺嵌\ue6c8蠬冢ﬕ貛噌\uf83e膦⬜ﲀ蘆⾬\uf11c骎ⳳ\uf66b龙⅜쪴鱪▷켑邆㫲찡闝㽌삶樨㏜씙潿ュ\uda4d揎", ImageFormat.getBitsPerPixel(0) + 22130, objArr37);
                o.ea.f.e(strIntern2, ((String) objArr37[0]).intern(), e4);
            }
            throw e4;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        int i3 = f21544h + 81;
        int i4 = i3 % 128;
        f21542f = i4;
        int i5 = i3 % 2;
        b bVar = aVar.f21550i;
        int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f21544h = i6 % 128;
        if (i6 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    public static /* synthetic */ Object e(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~((-1) - (((-1) - (~i7)) & ((-1) - i8)));
        int i10 = i4 | i9;
        int i11 = ~(i5 | i7);
        int i12 = (i10 + i11) - (i10 & i11);
        int i13 = (~((i7 + i4) - (i7 & i4))) | ((-1) - (((-1) - (~((i8 + i7) - (i8 & i7)))) & ((-1) - (~((-1) - (((-1) - i8) & ((-1) - i4)))))));
        int i14 = i4 + i5 + i3 + (1351532378 * i2) + (1237199896 * i6);
        int i15 = i14 * i14;
        int i16 = ((-211156802) * i4) + 1314914304 + ((-491389116) * i5) + (2007367491 * i12) + (i13 * (-2007367491)) + ((-2007367491) * i9) + (1796210688 * i3) + ((-1818230784) * i2) + ((-914358272) * i6) + ((-2051670016) * i15);
        int i17 = ((i4 * 406040238) - 634933780) + (i5 * 406038884) + (i12 * (-677)) + (i13 * 677) + (i9 * 677) + (i3 * 406039561) + (i2 * 1283666474) + (i6 * 1712827608) + (i15 * (-77201408));
        return i16 + ((i17 * i17) * 1831469056) != 1 ? b(objArr) : e(objArr);
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21542f + 67;
        f21544h = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr2 = new Object[1];
            l("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{0, 28, 45, 0}, false, objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            l("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{0, 28, 45, 0}, true, objArr3);
            obj = objArr3[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f21542f + 65;
        f21544h = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return strIntern;
    }

    static void g() {
        f21545j = new char[]{56527, 56344, 56337, 56339, 56348, 56351, 56349, 56334, 56332, 56347, 56345, 56347, 56343, 56342, 56352, 56347, 56341, 56340, 56343, 56347, 56326, CharCompanionObject.MIN_LOW_SURROGATE, 56342, 56342, 56341, 56340, 56335, 56574, 56342, 56742, 56734, 56738, 56739, 56741, 56741, 56735, 56735, 56741, 56747, 56737, 56731, 56734, 56741, 56739, 56734, 56743, 56739, 56742, 56751, 56739, 56739, 56740, 56735, 56740, 56738, 56734, 56735, 56742, 56745, 56743, 56738, 56742, 56747, 56737, 56705, 56713, 56745, 56743, 56738, 56742, 56747, 56737, 56705, 56714, 56742, 56508, 56562, 56550, 56498, 56557, 56560, 56550, 56555, 56523, 56518, 56556, 56560, 56561, 56519, 56486, 56486, 56514, 56559, 56561, 56554, 56550, 56549, 56558, 56558, 56555, 56555, 56511, 56331, 56331, 56357, 56396, 56399, 56396, 56355, 56324, 56324, 56357, 56396, 56394, 56396, 56392, 56391, 56401, 56396, 56390, 56389, 56392, 56396, 56375, 56369, 56384, 56385, 56393, 56544, 56393, 56393, 56385, 56353, 56360, 56401, 56394, 56387, 56389, 56398, 56401, 56399, 56400, 56359, 56353, 56385, 56386, 56394, 56360, 56358, 56400, 56361, 56353, 56387, 56388, 56392, 56358, 56358, 56397, 56358, 56325, 56359, 56392, 56397, 56397, 56358, 56360, 56397, 56355, 56353, 56387, 56392, 56381, 56341, 56325, 56325, 56358, 56397, 56395, 56397, 56393, 56392, 56402, 56397, 56391, 56390, 56393, 56397, 56376, 56370, 56385, 56386, 56394, 56498, 56549, 56551, 56557, 56555, 56547, 56545, 56554, 56556, 56531, 56536, 56560, 56558, 56554, 56550, 56546, 56554, 56558, 56556, 56558, 56539, 56554, 56406, 56412, 56410, 56402, 56400, 56409, 56411, 56393, 56400, 56415, 56411, 56406, 56403, 56410, 56397, 56389, 56499, 56551, 56557, 56555, 56547, 56545, 56554, 56556, 56537, 56542, 56552, 56549, 56554, 56552, 56531, 56536, 56556, 56538, 56536, 56559, 56720, 56733, 56729, 56730, 56724, 56735, 56716, 56733, 56736, 56722, 56724, 56721, 56729, 56730, 56718, 56395, 56446, 56440, 56435, 56395, 56719, 56716, 56720, 56445, 56395, 56408, 56395, 56404, 56403, 56729, 56730, 56724, 56735, 56716, 56733, 56736, 56722, 56724, 56721, 56729, 56730, 56430, 56719, 56716, 56572, 56438, 56430, 56422, 56430, 56432, 56408, 56413, 56434, 56430, 56427, 56428};
        f21543g = 810814839504823978L;
    }

    static void init$0() {
        $$a = new byte[]{95, MessagePack.Code.FALSE, -107, -90};
        $$b = 95;
    }

    private static void l(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2 % 2;
        Object obj = null;
        Object bytes = str2;
        if (str2 != null) {
            int i4 = $10 + 21;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                str2.getBytes("ISO-8859-1");
                obj.hashCode();
                throw null;
            }
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = f21545j;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        objA = o.d.d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 248, (char) View.MeasureSpec.makeMeasureSpec(i5, i5), 11 - (ViewConfiguration.getTapTimeout() >> 16), 1376582792, false, $$c(b2, (byte) (b2 - 1), (byte) $$a.length), new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i10++;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i6, cArr3, 0, i7);
        if (bArr != null) {
            int i11 = $11 + 117;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i7];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i7) {
                if (bArr[mVar.f19943d] == 1) {
                    int i13 = $11 + 69;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = mVar.f19943d;
                        Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA2 = o.d.d.a(120026474);
                        if (objA2 == null) {
                            objA2 = o.d.d.a(11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16), 10 - KeyEvent.getDeadChar(0, 0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        int i15 = 95 / 0;
                    } else {
                        int i16 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA3 = o.d.d.a(120026474);
                        if (objA3 == null) {
                            objA3 = o.d.d.a(11 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16), 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    }
                } else {
                    int i17 = mVar.f19943d;
                    Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA4 = o.d.d.a(1632715197);
                    if (objA4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objA4 = o.d.d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 836, (char) (27279 - TextUtils.indexOf("", "", 0)), KeyEvent.getDeadChar(0, 0) + 11, -1210801192, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr6 = {mVar, mVar};
                Object objA5 = o.d.d.a(-1041906996);
                if (objA5 == null) {
                    objA5 = o.d.d.a(21 - View.getDefaultSize(0, 0), (char) (35716 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "", 0) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i18 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i18, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i18);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i7];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i7) {
                    break;
                }
                int i19 = $10 + 57;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                cArr6[mVar.f19943d] = cArr3[(i7 - mVar.f19943d) - 1];
                i2 = mVar.f19943d + 1;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i21 = $10 + 59;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 0;
            while (true) {
                mVar.f19943d = i23;
                if (mVar.f19943d >= i7) {
                    break;
                }
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i23 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void n(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 111;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i5 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 732, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7933), 11 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 355847088, false, $$c(b2, b3, (byte) ((b3 + 49) - (49 | b3))), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f21543g ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(836 - TextUtils.indexOf("", ""), (char) (27278 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 11 - (Process.myTid() >> 22), -2145994442, false, $$c(b4, b5, (byte) ((-1) - (((-1) - b5) | ((-1) - 42)))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        int i6 = $11 + 13;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 % 5;
        }
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 - 1);
                objA3 = o.d.d.a(836 - TextUtils.indexOf("", ""), (char) (27278 - TextUtils.indexOf((CharSequence) "", '0', 0)), 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -2145994442, false, $$c(b6, b7, (byte) (42 & b7)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // o.br.c
    public final String a() {
        int i2 = 2 % 2;
        int i3 = f21544h;
        int i4 = i3 + 123;
        f21542f = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 39;
        f21542f = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.br.c
    public final String b() {
        int i2 = 2 % 2;
        int i3 = f21544h + 21;
        int i4 = i3 % 128;
        f21542f = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 87;
        f21544h = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // o.br.c
    public final o.bk.c c() {
        int i2 = 2 % 2;
        int i3 = f21542f;
        int i4 = i3 + 23;
        f21544h = i4 % 128;
        int i5 = i4 % 2;
        o.bk.c cVar = this.f21548a;
        int i6 = i3 + 85;
        f21544h = i6 % 128;
        int i7 = i6 % 2;
        return cVar;
    }

    @Override // o.br.c
    public final String d() {
        int i2 = f21540d * 1694318522;
        f21540d = i2;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        return (String) e(Process.myUid(), elapsedCpuTime, new Object[]{this}, -199644072, 199644073, (int) Thread.currentThread().getId(), i2);
    }

    @Override // o.br.c
    public final void d(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f21542f + 43;
        f21544h = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        l(hg.Vd(";נן8765432ח0/.-,+*\u05cf\u05ce'&%\u05ca#\"!׆\u001fׄ\u001d\u001c\u001b\u001aֿ\u0018\u0017ּ\u0015\u0014\u0013\u0012ַ\u0010\u000fֳִ", (short) (Od.Xd() ^ (-5096)), (short) (Od.Xd() ^ (-31567))), new int[]{28, 47, 186, 0}, true, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Class<?> cls = Class.forName(C1561oA.ud("%1&3/(\"j\u001f*(-\u001d%*bv\" %\u0015'\"", (short) (C1499aX.Xd() ^ (-25122))));
        Class<?>[] clsArr = {Class.forName(C1561oA.yd("6.D0u5+9;\u0003)KB:@:", (short) (ZN.Xd() ^ 26084))), Integer.TYPE};
        Object[] objArr2 = {strIntern, 0};
        short sXd = (short) (C1580rY.Xd() ^ (-18088));
        int[] iArr = new int["\u0007\u0006\u0016u\f\u0006\u0018\f\fx\u001c\u0010\u0012\u0012 \u0014\u001e\u0014\u0017&".length()];
        QB qb = new QB("\u0007\u0006\u0016u\f\u0006\u0018\f\fx\u001c\u0010\u0012\u0012 \u0014\u001e\u0014\u0017&");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i5));
            i5++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i5), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr2)).edit();
            Object[] objArr3 = new Object[1];
            l(Xg.qd(" Þ\"", (short) (Od.Xd() ^ (-14593)), (short) (Od.Xd() ^ (-24547))), new int[]{75, 3, 0, 0}, false, objArr3);
            editorEdit.putString(((String) objArr3[0]).intern(), "").commit();
            int i6 = f21544h + 93;
            f21542f = i6 % 128;
            int i7 = i6 % 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final boolean d(Context context, o.ef.a aVar) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21542f + 35;
        f21544h = i3 % 128;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        boolean zA = o.ea.f.a();
        String strWd = Jg.Wd("I\r`C\u001fr9ވƯKΐc9\rq͑ӹcĹ\u001eܚKْ]ʢߛ҃4", (short) (C1499aX.Xd() ^ (-31129)), (short) (C1499aX.Xd() ^ (-19263)));
        if (zA) {
            int i4 = f21544h + 77;
            f21542f = i4 % 128;
            int i5 = i4 % 2;
            String strXd = ZO.xd("\u001bkÕ{'_˖ͮTׯGЗ", (short) (Od.Xd() ^ (-7426)), (short) (Od.Xd() ^ (-17403)));
            if (i5 != 0) {
                Object[] objArr = new Object[1];
                l(strWd, new int[]{0, 28, 45, 0}, true, objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                l(strXd, new int[]{294, 12, 132, 0}, false, objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                l(strWd, new int[]{0, 28, 45, 0}, true, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                l(strXd, new int[]{294, 12, 132, 0}, false, objArr4);
                obj = objArr4[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
            int i6 = f21542f + 85;
            f21544h = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 2;
            }
        }
        boolean zA2 = a(aVar);
        Object[] objArr5 = new Object[1];
        l(C1626yg.Ud(":ލ\u0093wVG:\rh\u001eΙlFDz\u001bi4լ̾Aj\"͜\u0012^\u0016є:٤>U`gטX\u0003͉Uv\u000b?З\u000e\u001a͊Â", (short) (FB.Xd() ^ 6789), (short) (FB.Xd() ^ 21421)), new int[]{28, 47, 186, 0}, true, objArr5);
        Object[] objArr6 = {((String) objArr5[0]).intern(), 0};
        Method method = Class.forName(Ig.wd("P/pm9}\u001bjxKB0qvf\u0001\\xNi\u0014Px", (short) (C1633zX.Xd() ^ (-1050)))).getMethod(C1561oA.Qd("\u0019\u0016$\u0002\u0016\u000e\u001e\u0010\u000ex\u001a\f\f\n\u0016\b\u0010\u0004\u0005\u0012", (short) (C1607wl.Xd() ^ 30102)), Class.forName(EO.Od("U\u001a?D\u0004~IQxm\u000fT|\u0004\u00130", (short) (C1499aX.Xd() ^ (-28204)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr6);
            String strE = new o.dk.a(context).e(aVar.e());
            if (o.ea.f.a()) {
                Object[] objArr7 = new Object[1];
                l(strWd, new int[]{0, 28, 45, 0}, true, objArr7);
                String strIntern2 = ((String) objArr7[0]).intern();
                Object[] objArr8 = new Object[1];
                n(C1593ug.zd("恐Ɔꋅ钊뵙꼊\udfe6\ud994ቋﰓⳐẔ侕棒娙莨ς鸬軗삲륳\ueb2c\udc29ඨ\uf66c〥䣱㪶歧唺緽٫ꂏ驘쬊볋\ue5c5흙ဒ⦉᪑䱎㔦曐", (short) (C1499aX.Xd() ^ (-28418)), (short) (C1499aX.Xd() ^ (-958))), 61120 - TextUtils.indexOf((CharSequence) "", '0'), objArr8);
                o.ea.f.c(strIntern2, ((String) objArr8[0]).intern());
                int i8 = f21542f + 7;
                f21544h = i8 % 128;
                int i9 = i8 % 2;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            Object[] objArr9 = new Object[1];
            l(C1561oA.od("uՊs", (short) (OY.Xd() ^ 7413)), new int[]{75, 3, 0, 0}, false, objArr9);
            editorEdit.putString(((String) objArr9[0]).intern(), strE).commit();
            return zA2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // o.br.c
    public final o.bk.a e() {
        int i2 = 2 % 2;
        int i3 = f21544h;
        int i4 = i3 + 17;
        f21542f = i4 % 128;
        int i5 = i4 % 2;
        o.bk.a aVar = this.f21549b;
        int i6 = i3 + 77;
        f21542f = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 69 / 0;
        }
        return aVar;
    }

    public final b i() {
        int i2 = f21541e * (-371875515);
        f21541e = i2;
        int id = (int) Thread.currentThread().getId();
        int i3 = f21539c * 248001262;
        f21539c = i3;
        return (b) e(i3, id, new Object[]{this}, -1023910309, 1023910309, (int) Thread.currentThread().getId(), i2);
    }
}
