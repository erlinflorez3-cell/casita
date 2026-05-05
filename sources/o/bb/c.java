package o.bb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.UUID;
import kotlin.jvm.internal.CharCompanionObject;
import o.a.i;
import o.a.m;
import o.a.o;
import o.az.e;
import o.cg.f;
import o.dd.g;
import o.ef.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends o.az.e {
    private static final byte[] $$k = null;
    private static final int $$l = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char[] f20827f = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f20828k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20829l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static long f20830m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20831n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f20832o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f20833g;

    public static final class b extends o.ab.c<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f20834b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f20835d = 0;

        public b(c cVar) {
            super(cVar, false);
        }

        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20834b + 97;
            f20835d = i3 % 128;
            if (i3 % 2 == 0) {
                e().g().c(cVar, i());
                return;
            }
            e().g().c(cVar, i());
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20834b;
            int i4 = (i3 & 85) + (i3 | 85);
            f20835d = i4 % 128;
            if (i4 % 2 != 0) {
                e().g().c(cVar, i());
                int i5 = 6 / 0;
            } else {
                e().g().c(cVar, i());
            }
            int i6 = f20834b + 39;
            f20835d = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // o.ab.c
        public final void g() {
            int i2 = 2 % 2;
            int i3 = f20834b + 69;
            f20835d = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final class e extends e.d<c> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final byte[] $$k = null;
        private static final int $$l = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long f20836d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f20837f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static char[] f20838g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static char f20839h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f20840i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f20841j = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$m(byte r8, byte r9, int r10) {
            /*
                int r8 = 122 - r8
                int r0 = r9 * 2
                int r7 = 1 - r0
                int r0 = r10 * 2
                int r6 = 3 - r0
                byte[] r5 = o.bb.c.e.$$k
                byte[] r4 = new byte[r7]
                r3 = 0
                if (r5 != 0) goto L28
                r0 = r7
                r2 = r3
            L13:
                int r0 = -r0
                int r8 = r8 + r0
                r1 = r2
            L16:
                byte r0 = (byte) r8
                int r2 = r1 + 1
                r4[r1] = r0
                if (r2 != r7) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L23:
                int r6 = r6 + 1
                r0 = r5[r6]
                goto L13
            L28:
                r1 = r3
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bb.c.e.$$m(byte, byte, int):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            init$0();
            f20840i = 0;
            f20841j = 1;
            f20836d = 740602047300126166L;
            f20837f = 1564493270;
            f20839h = (char) 17670;
            f20838g = new char[]{56422, 56415, 56418, 56416, 56414, 56405, 56411, 56415, 56388, 56414, 56415, 56409, 56419, 56409, 56501, 56557, 56545, 56545, 56558, 56556, 56558, 56558, 56559, 56562, 56560, 56545, 56538, 56553, 56551, 56551, 56557, 56558, 56537, 56536, 56553, 56501, 56554, 56557, 56557, 56559, 56557, 56558, 56560, 56542, 56540, 56557, 56557, 56555, 56564, 56525, 56490, 56490, 56506, 56540, 56552, 56560, 56525, 56524, 56565, 56564, 56566, 56563, 56562, 56562, 56560, 56562, 56559, 56559, 56558, 56519, 56518, 56550, 56558, 56558, 56531, 56358, 56362, 56363, 56365, 56365, 56359, 56359, 56349, 56349, 56367, 56373, 56367, 56365, 56355, 56355, 56363, 56362, 56367, 56371, 56516, 56321, 56322, 56328, CharCompanionObject.MIN_LOW_SURROGATE, CharCompanionObject.MIN_LOW_SURROGATE, CharCompanionObject.MIN_LOW_SURROGATE, 56555, 56563, 56323, 56720, 56720, 56712, 56424, 56432, 56726, 56726, 56730, 56722, 56721, 56431, 56425, 56720, 56721, 56721, 56724, 56722, 56724, 56724, 56725, 56728, 56726, 56727, 56430, 56431, 56722, 56714, 56446, 56412, 56396, 56396, 56431, 56726, 56717, 56719, 56719, 56446, 56704, 56722, 56720, 56719, 56721, 56719, 56719, 56716, 56505, 56558, 56556, 56558, 56544, 56539, 56556, 56564, 56560, 56560, 56540, 56530, 56554, 56554, 56551, 56552, 56548, 56556, 56545, 56545, 56560, 56562, 56559, 56515, 56323, 56325, 56329, 56563, 56564, 56325, 56328, 56335, 56338, 56322, 56540, 56556, 56333, 56554, 56549, 56322, 56328, 56332, 56327, 56325, 56323, 56496, 56547, 56539, 56539, 56548, 56556, 56561, 56552, 56550, 56552, 56549, 56553, 56555, 56558, 56560, 56496, 56551, 56553, 56555, 56560, 56556, 56550, 56521, 56519, 56552, 56560, 56527, 56503, 56530, 56555, 56558, 56559, 56559, 56558, 56566, 56550, 56542, 56557, 56555, 56547, 56546};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(cVar);
            ViewConfiguration.getFadingEdgeLength();
            Color.rgb(0, 0, 0);
        }

        private static void A(byte b2, int i2, byte b3, Object[] objArr) {
            int i3 = i2 * 2;
            byte[] bArr = $$a;
            int i4 = (b2 * 2) + 4;
            int i5 = 101 - (b3 * 3);
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

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0011). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void B(byte r8, short r9, byte r10, java.lang.Object[] r11) {
            /*
                int r8 = r8 + 97
                int r0 = r9 * 7
                int r7 = 8 - r0
                int r0 = r10 + 4
                byte[] r6 = o.bb.c.e.$$d
                byte[] r5 = new byte[r7]
                r4 = 0
                if (r6 != 0) goto L2b
                r1 = r0
                r3 = r4
            L11:
                int r0 = -r0
                int r8 = r8 + r0
                int r8 = r8 + (-5)
                r0 = r1
                r2 = r3
            L17:
                int r3 = r2 + 1
                byte r1 = (byte) r8
                r5[r2] = r1
                if (r3 != r7) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r11[r4] = r0
                return
            L26:
                int r1 = r0 + 1
                r0 = r6[r1]
                goto L11
            L2b:
                r2 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bb.c.e.B(byte, short, byte, java.lang.Object[]):void");
        }

        private static o.cg.b e(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            z((char) (ExpandableListView.getPackedPositionType(0L) + 36498), "\ueb02㾒臖꺜蓈磎拉ㆶᩦ씰넳ႝ휕ꩳ뎲閅诽봣狚", "\u0000\u0000\u0000\u0000", "寤锲鋯ㆎ", (-275434917) - View.resolveSizeAndState(0, 0, 0), objArr);
            o.cg.b bVar = new o.cg.b(context, 19, ((String) objArr[0]).intern());
            int i3 = f20841j + 81;
            f20840i = i3 % 128;
            if (i3 % 2 == 0) {
                return bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{123, 10, 108, -85};
            $$b = 211;
        }

        static void init$1() {
            $$d = new byte[]{123, 10, 108, -85, 60, MessagePack.Code.BIN8, -14, 59, MessagePack.Code.EXT8, 57, -19};
            $$e = 102;
        }

        static void init$2() {
            $$k = new byte[]{52, 50, -24, MessagePack.Code.MAP16};
            $$l = 148;
        }

        private static void v(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
            int i2;
            String str2 = str;
            int i3 = 2;
            int i4 = 2 % 2;
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            m mVar = new m();
            int i5 = 0;
            int i6 = iArr[0];
            int i7 = iArr[1];
            int i8 = iArr[2];
            int i9 = iArr[3];
            char[] cArr = f20838g;
            char c2 = '0';
            int i10 = 6;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                while (i5 < length) {
                    int i11 = $11 + 41;
                    $10 = i11 % 128;
                    if (i11 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i5])};
                            Object objA = o.d.d.a(-2071388435);
                            if (objA == null) {
                                byte b2 = (byte) i10;
                                byte b3 = (byte) 0;
                                objA = o.d.d.a(TextUtils.lastIndexOf("", c2) + 250, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf("", "") + 11, 1376582792, false, $$m(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr2[i5] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            i5 >>>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr[i5])};
                        Object objA2 = o.d.d.a(-2071388435);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            objA2 = o.d.d.a(249 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) Color.red(0), ImageFormat.getBitsPerPixel(0) + 12, 1376582792, false, $$m((byte) 6, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i5++;
                    }
                    i3 = 2;
                    c2 = '0';
                    i10 = 6;
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i7];
            System.arraycopy(cArr, i6, cArr3, 0, i7);
            if (bArr != null) {
                int i12 = $11 + 101;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                char[] cArr4 = new char[i7];
                mVar.f19943d = 0;
                int i14 = $10 + 65;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                char c3 = 0;
                while (mVar.f19943d < i7) {
                    if (bArr[mVar.f19943d] == 1) {
                        int i16 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c3)};
                        Object objA3 = o.d.d.a(120026474);
                        if (objA3 == null) {
                            objA3 = o.d.d.a((KeyEvent.getMaxKeyCode() >> 16) + 11, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 10 - (ViewConfiguration.getEdgeSlop() >> 16), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    } else {
                        int i17 = mVar.f19943d;
                        Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c3)};
                        Object objA4 = o.d.d.a(1632715197);
                        if (objA4 == null) {
                            byte b5 = (byte) 2;
                            byte b6 = (byte) (b5 - 2);
                            objA4 = o.d.d.a((KeyEvent.getMaxKeyCode() >> 16) + 836, (char) (27280 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1210801192, false, $$m(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i17] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    }
                    c3 = cArr4[mVar.f19943d];
                    Object[] objArr6 = {mVar, mVar};
                    Object objA5 = o.d.d.a(-1041906996);
                    if (objA5 == null) {
                        objA5 = o.d.d.a(20 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 35715), 11 - TextUtils.indexOf("", ""), 392175785, false, "v", new Class[]{Object.class, Object.class});
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
                    int i19 = $11 + 113;
                    $10 = i19 % 128;
                    if (i19 % 2 != 0) {
                        cArr6[mVar.f19943d] = cArr3[i7 % mVar.f19943d];
                        i2 = mVar.f19943d % 1;
                    } else {
                        cArr6[mVar.f19943d] = cArr3[(i7 - mVar.f19943d) - 1];
                        i2 = mVar.f19943d + 1;
                    }
                }
                cArr3 = cArr6;
            }
            if (i8 > 0) {
                int i20 = $10 + 73;
                $11 = i20 % 128;
                int i21 = i20 % 2;
                int i22 = 0;
                while (true) {
                    mVar.f19943d = i22;
                    if (mVar.f19943d >= i7) {
                        break;
                    }
                    cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                    i22 = mVar.f19943d + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        private static void z(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i3 = 2 % 2;
            Object charArray = str6;
            if (str6 != null) {
                int i4 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                charArray = str6.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str5;
            if (str5 != null) {
                int i6 = $10 + 29;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                charArray2 = str5.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object obj = null;
            Object charArray3 = str4;
            if (str4 != null) {
                int i8 = $10 + 27;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    str4.toCharArray();
                    obj.hashCode();
                    throw null;
                }
                charArray3 = str4.toCharArray();
            }
            i iVar = new i();
            int length = cArr.length;
            char[] cArr3 = new char[length];
            int length2 = cArr2.length;
            char[] cArr4 = new char[length2];
            System.arraycopy(cArr, 0, cArr3, 0, length);
            System.arraycopy(cArr2, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c2);
            cArr4[2] = (char) (cArr4[2] + ((char) i2));
            int length3 = ((char[]) charArray3).length;
            char[] cArr5 = new char[length3];
            iVar.f19932b = 0;
            while (iVar.f19932b < length3) {
                try {
                    Object[] objArr2 = {iVar};
                    Object objA = o.d.d.a(540069882);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(106 - Color.blue(0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) + 11, -155898465, false, $$m((byte) 57, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = o.d.d.a(2068572);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 846, (char) (6489 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 12 - (ViewConfiguration.getWindowTouchSlop() >> 8), -694521287, false, $$m((byte) 54, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(obj, objArr3)).intValue();
                    Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA3 = o.d.d.a(-1122996612);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(458 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) KeyEvent.getDeadChar(0, 0), 11 - KeyEvent.getDeadChar(0, 0), 1804962841, false, $$m((byte) 56, b4, b4), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = o.d.d.a(-1223178239);
                    if (objA4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objA4 = o.d.d.a(639 - Color.green(0), (char) (65100 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, 1636969060, false, $$m(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    obj = null;
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f20836d ^ 740602047300126166L)) ^ ((long) ((int) (((long) f20837f) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f20839h) ^ 740602047300126166L))));
                    iVar.f19932b++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr5);
        }

        @Override // o.ab.j
        public final /* synthetic */ f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20840i + 17;
            f20841j = i3 % 128;
            int i4 = i3 % 2;
            o.cg.b bVarE = e(context);
            int i5 = f20841j + 55;
            f20840i = i5 % 128;
            int i6 = i5 % 2;
            return bVarE;
        }

        @Override // o.ab.j
        public final void a(a aVar) throws o.ef.b {
            int i2 = 2 % 2;
            int i3 = f20841j + 109;
            f20840i = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0462  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x04e9  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x04f2  */
        @Override // o.ab.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean e(int r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1783
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bb.c.e.e(int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final a m() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20840i + 103;
            f20841j = i3 % 128;
            int i4 = i3 % 2;
            if (o.ea.f.a()) {
                int i5 = f20840i + 19;
                f20841j = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                v("\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001", new int[]{14, 21, 0, 12}, true, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                z((char) (21937 - TextUtils.getTrimmedLength("")), "\uf742扗柬\ue942㥍自獊罦\uf11c닡\u098d芶얋㊤둡\ue283ᑶ\uf8ea䷄抜湕遯纸ㅴ⼵坴ꚝඣᾟ\uf6d9ᣦ죸巈\ude88쉷磖殍ᇙ⣰ꛏ\udd10", "\u0000\u0000\u0000\u0000", "큺롖놯ཕ", (-1346873648) - View.MeasureSpec.getMode(0), objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                int i7 = f20840i + 77;
                f20841j = i7 % 128;
                int i8 = i7 % 2;
            }
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                v("\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001", new int[]{14, 21, 0, 12}, true, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                v("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{35, 39, 4, 0}, false, objArr4);
                o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            a aVar = new a();
            Object[] objArr5 = new Object[1];
            v("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{74, 20, 66, 0}, true, objArr5);
            aVar.a(((String) objArr5[0]).intern(), (Object) ((c) e()).f20833g);
            Object[] objArr6 = new Object[1];
            v("\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{94, 9, 21, 6}, true, objArr6);
            aVar.a(((String) objArr6[0]).intern(), (Object) UUID.randomUUID().toString());
            if (o.ea.f.a()) {
                Object[] objArr7 = new Object[1];
                v("\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001", new int[]{14, 21, 0, 12}, true, objArr7);
                String strIntern3 = ((String) objArr7[0]).intern();
                Object[] objArr8 = new Object[1];
                v("\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{103, 46, 166, 0}, true, objArr8);
                o.ea.f.c(strIntern3, ((String) objArr8[0]).intern());
            }
            a aVarA = c.a(((c) e()).f20833g);
            a aVar2 = new a();
            Object[] objArr9 = new Object[1];
            z((char) (ExpandableListView.getPackedPositionChild(0L) + 61087), "Ṿ᳢⒊ﵣ퓷趇\ufdec籊덕\ueef7Ḅ뒌⡌\ue8d5Ṍ␢\uf186", "\u0000\u0000\u0000\u0000", "罞\ue14d鹹姮", 2044808575 - Gravity.getAbsoluteGravity(0, 0), objArr9);
            aVar2.a(((String) objArr9[0]).intern(), aVar);
            Object[] objArr10 = new Object[1];
            v("\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001", new int[]{149, 23, 0, 14}, false, objArr10);
            aVar2.a(((String) objArr10[0]).intern(), aVarA);
            Object[] objArr11 = new Object[1];
            z((char) (64388 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), "鲍㡢폀壅쎅\ue911Ȃ⤢с\udd35涚ಔ뭠\ue774闂", "\u0000\u0000\u0000\u0000", "㊥ᔀ萸郻", ImageFormat.getBitsPerPixel(0) + 940900403, objArr11);
            aVar2.a(((String) objArr11[0]).intern(), (Object) ((c) e()).f20833g);
            if (o.ea.f.a()) {
                Object[] objArr12 = new Object[1];
                v("\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001", new int[]{14, 21, 0, 12}, true, objArr12);
                String strIntern4 = ((String) objArr12[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr13 = new Object[1];
                z((char) (614 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "蓼\udb64\ue042뮹덓䊄삋Ꝏ鏲ⴌꚿ\uf250羭ⴰ鯉䆰⫮⽴蒛", "\u0000\u0000\u0000\u0000", "⃛\ua63c旓Ă", TextUtils.lastIndexOf("", '0') - 744080351, objArr13);
                o.ea.f.c(strIntern4, sb.append(((String) objArr13[0]).intern()).append(aVar2.e()).toString());
            }
            return aVar2;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20841j + 3;
            f20840i = i3 % 128;
            int i4 = i3 % 2;
            int[] iArr = {0, 14, PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, 4};
            if (i4 != 0) {
                Object[] objArr = new Object[1];
                v(null, iArr, false, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                v(null, iArr, true, objArr2);
                obj = objArr2[0];
            }
            return ((String) obj).intern();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void q() {
            int i2 = 2 % 2;
            int i3 = f20840i + 35;
            f20841j = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {f().e()};
            int i5 = o.bg.b.f21065e * 1638453650;
            o.bg.b.f21065e = i5;
            int i6 = o.bg.b.f21062b * 36621504;
            o.bg.b.f21062b = i6;
            int i7 = o.bg.b.f21068i * 241773600;
            o.bg.b.f21068i = i7;
            if (((g) o.bg.b.c(-968128923, objArr, i5, (int) Runtime.getRuntime().maxMemory(), i7, 968128924, i6)) == null) {
                Object[] objArr2 = {f().e(), h(), j(), g.f22868m};
                int i8 = o.bg.b.f21063c * (-1736728553);
                o.bg.b.f21063c = i8;
                int i9 = o.bg.b.f21064d * 798932806;
                o.bg.b.f21064d = i9;
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i10 = o.bg.b.f21061a * 1360672158;
                o.bg.b.f21061a = i10;
                o.bg.b.c(-717841723, objArr2, i8, i10, iElapsedRealtime, 717841723, i9);
                int i11 = f20841j + 123;
                f20840i = i11 % 128;
                int i12 = i11 % 2;
            }
            if (((c) e()).f20833g != null) {
                new d(h());
                d.d(h(), ((c) e()).f20833g);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
        @Override // o.ab.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void s() {
            /*
                r3 = this;
                r2 = 2
                int r0 = r2 % r2
                o.bg.c r0 = r3.f()
                o.bg.a r1 = r0.c()
                o.bg.a r0 = o.bg.a.f21040i
                if (r1 != r0) goto L40
                int r0 = o.bb.c.e.f20841j
                int r1 = r0 + 85
                int r0 = r1 % 128
                o.bb.c.e.f20840i = r0
                int r1 = r1 % r2
                if (r1 == 0) goto L4a
                o.ab.e r0 = r3.e()
                o.bb.c r0 = (o.bb.c) r0
                java.lang.String r1 = r0.f20833g
                r0 = 62
                int r0 = r0 / 0
                if (r1 == 0) goto L40
            L28:
                o.bb.d r1 = new o.bb.d
                android.content.Context r0 = r3.h()
                r1.<init>(r0)
                android.content.Context r1 = r3.h()
                o.ab.e r0 = r3.e()
                o.bb.c r0 = (o.bb.c) r0
                java.lang.String r0 = r0.f20833g
                o.bb.d.b(r1, r0)
            L40:
                int r0 = o.bb.c.e.f20840i
                int r1 = r0 + 17
                int r0 = r1 % 128
                o.bb.c.e.f20841j = r0
                int r1 = r1 % r2
                return
            L4a:
                o.ab.e r0 = r3.e()
                o.bb.c r0 = (o.bb.c) r0
                java.lang.String r0 = r0.f20833g
                if (r0 == 0) goto L40
                goto L28
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bb.c.e.s():void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$m(short r9, short r10, byte r11) {
        /*
            int r0 = r11 * 4
            int r8 = r0 + 1
            byte[] r7 = o.bb.c.$$k
            int r0 = r10 * 4
            int r6 = 4 - r0
            int r5 = 105 - r9
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r7 != 0) goto L2b
            r1 = r6
            r5 = r8
            r2 = r3
        L14:
            int r0 = -r6
            int r5 = r5 + r0
            int r6 = r1 + 1
            r1 = r2
        L19:
            int r2 = r1 + 1
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r2 != r8) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            r0 = r7[r6]
            r1 = r6
            r6 = r0
            goto L14
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bb.c.$$m(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20831n = 0;
        f20829l = 1;
        f20832o = 0;
        f20828k = 1;
        n();
        MotionEvent.axisFromString("");
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getKeyRepeatTimeout();
        View.MeasureSpec.getSize(0);
        TextUtils.getTrimmedLength("");
        ViewConfiguration.getZoomControlsTimeout();
        int i2 = f20829l + 27;
        f20831n = i2 % 128;
        int i3 = i2 % 2;
    }

    public c(Context context, e.c cVar, o.en.b bVar, g gVar) {
        super(context, cVar, bVar, gVar);
    }

    public static a a(String str) throws Throwable {
        int i2 = 2 % 2;
        a aVar = new a();
        Object[] objArr = new Object[1];
        r((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 21, TextUtils.lastIndexOf("", '0', 0) + 21, objArr);
        aVar.a(((String) objArr[0]).intern(), (Object) str);
        Object[] objArr2 = new Object[1];
        r((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 42 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (Process.myTid() >> 22) + 9, objArr2);
        aVar.a(((String) objArr2[0]).intern(), (Object) UUID.randomUUID().toString());
        Object[] objArr3 = new Object[1];
        r((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 50, (ViewConfiguration.getFadingEdgeLength() >> 16) + 6, objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        r((char) (56795 - (ViewConfiguration.getEdgeSlop() >> 16)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 56, View.combineMeasuredStates(0, 0) + 7, objArr4);
        aVar.a(strIntern, (Object) ((String) objArr4[0]).intern());
        int i3 = f20832o + 49;
        f20828k = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    static void init$0() {
        $$k = new byte[]{Ascii.ETB, 117, 49, -107};
        $$l = 138;
    }

    static void n() {
        f20827f = new char[]{38050, 10332, 60709, 41488, 26603, 9421, 63923, 48793, 29308, 14106, 62469, 35309, 20167, 944, 49337, 33913, 22879, 7683, 54251, 37064, 21926, 38022, 10305, 60705, 41475, 26604, 9451, 63924, 48799, 29283, 14139, 62479, 35284, 20167, 952, 49311, 33892, 22871, 7680, 54249, 37059, 38016, 10315, 60731, 41491, 26599, 9421, 63918, 48831, 29302, 38016, 10315, 60729, 41491, 26606, 9418, 18810, 62880, 12498, 32766, 47644, 63798, 9298, 38018, 10332, 60709, 41488, 26603, 9421, 63923, 48793, 29308, 14106, 62469, 35309, 20167, 944};
        f20830m = -4902154038127482834L;
    }

    private static void r(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        int i5 = $10 + 99;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (oVar.f19947b < i3) {
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f20827f[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a((ViewConfiguration.getEdgeSlop() >> 16) + 742, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 11 - ImageFormat.getBitsPerPixel(0), 632508977, false, $$m((byte) 6, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f20830m), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b3 = (byte) 5;
                    byte b4 = (byte) (b3 - 5);
                    objA2 = o.d.d.a(TextUtils.getOffsetAfter("", 0) + 766, (char) (View.resolveSize(0, 0) + 12470), 11 - ((byte) KeyEvent.getModifierMetaStateMask()), 1946853218, false, $$m(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA3 = o.d.d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 386, (char) View.resolveSize(0, 0), Color.red(0) + 18, 39570797, false, $$m(b5, b6, b6), new Class[]{Object.class, Object.class});
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
            int i8 = $11 + 107;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objA4 = o.d.d.a(387 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (TextUtils.lastIndexOf("", '0') + 1), 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 39570797, false, $$m(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                throw null;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr6 = {oVar, oVar};
            Object objA5 = o.d.d.a(-723636472);
            if (objA5 == null) {
                byte b9 = (byte) 0;
                byte b10 = b9;
                objA5 = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 387, (char) KeyEvent.normalizeMetaState(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, 39570797, false, $$m(b9, b10, b10), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    @Override // o.ab.e
    public final o.ab.c<?> c() {
        int i2 = 2 % 2;
        new d(b());
        String strC = d.c(b());
        if (strC != null) {
            this.f20833g = strC;
            return new e(this);
        }
        Object[] objArr = {d().e(), b(), h(), g.f22868m};
        int i3 = o.bg.b.f21063c * (-1736728553);
        o.bg.b.f21063c = i3;
        int i4 = o.bg.b.f21064d * 798932806;
        o.bg.b.f21064d = i4;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i5 = o.bg.b.f21061a * 1360672158;
        o.bg.b.f21061a = i5;
        o.bg.b.c(-717841723, objArr, i3, i5, iElapsedRealtime, 717841723, i4);
        b bVar = new b(this);
        int i6 = f20832o + 87;
        f20828k = i6 % 128;
        int i7 = i6 % 2;
        return bVar;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f20832o + 47;
        f20828k = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            r((char) (ViewConfiguration.getTouchSlop() + 95), TextUtils.indexOf("", "", 0, 1), TextUtils.lastIndexOf("", 'g', 0) + 32, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            r((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf("", "", 0, 0), 20 - TextUtils.lastIndexOf("", '0', 0), objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f20828k + 31;
        f20832o = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return strIntern;
    }

    @Override // o.az.e
    public final boolean o() {
        int i2 = 2 % 2;
        int i3 = f20828k + 31;
        f20832o = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
