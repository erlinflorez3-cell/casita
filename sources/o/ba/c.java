package o.ba;

import android.content.Context;
import android.graphics.Color;
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
import java.lang.reflect.Method;
import java.util.Random;
import o.a.m;
import o.a.n;
import o.ab.e;
import o.ab.j;
import o.ef.a;
import o.ep.f;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends e<d> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f20812k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20813l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f20814m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20815n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f20816o = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    f f20817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f20818g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    o.ep.d f20819j;

    /* JADX INFO: renamed from: o.ba.c$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f20821b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f20822d = 0;

        static {
            int[] iArr = new int[f.values().length];
            f20820a = iArr;
            try {
                iArr[f.f24513e.ordinal()] = 1;
                int i2 = f20822d;
                int i3 = (i2 ^ 77) + (((-1) - (((-1) - i2) | ((-1) - 77))) << 1);
                f20821b = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20820a[f.f24512d.ordinal()] = 2;
                int i6 = f20821b;
                int i7 = (i6 ^ 35) + (((-1) - (((-1) - i6) | ((-1) - 35))) << 1);
                f20822d = i7 % 128;
                int i8 = i7 % 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class b extends j<c> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f20823b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f20824c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static char[] f20825d = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f20826j = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(byte r9, short r10, byte r11) {
            /*
                byte[] r8 = o.ba.c.b.$$a
                int r0 = r9 * 2
                int r7 = 2 - r0
                int r6 = r11 * 3
                int r1 = r6 + 1
                int r0 = r10 * 4
                int r0 = 120 - r0
                byte[] r5 = new byte[r1]
                r4 = 0
                if (r8 != 0) goto L29
                r3 = r7
                r2 = r4
            L15:
                int r7 = r7 + r0
                r1 = r2
            L17:
                byte r0 = (byte) r7
                r5[r1] = r0
                int r3 = r3 + 1
                int r2 = r1 + 1
                if (r1 != r6) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L26:
                r0 = r8[r3]
                goto L15
            L29:
                r1 = r4
                r3 = r7
                r7 = r0
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ba.c.b.$$d(byte, short, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20824c = 1204000690;
            f20823b = 0;
            f20826j = 1;
            f20825d = new char[]{56541, 56382, 56379, 56379, 56371, 56368, 56375, 56353, 56359, 56383, 56384, 56383, 56385, 56378, 56472, 56496, 56496, 56496, 56498, 56502, 56504, 56499, 56497, 56499, 56500, 56503, 56500, 56497, 56499, 56500, 56499, 56498, 56498, 56498, 56547, 56546, 56553, 56555, 56534, 56503, 56560, 56561, 56560, 56552, 56546, 56548, 56557, 56539, 56376, 56376, 56366, 56366, 56359, 56351, 56364, 56373, 56719, 56706, 56718, 56718, 56720, 56420, 56724, 56719, 56720, 56714, 56725, 56714, 56709, 56719, 56720, 56420, 56709, 56719, 56418, 56724, 56718, 56723, 56710, 56437, 56710, 56725, 56706, 56709, 56714, 56717, 56706, 56439, 56709, 56505, 56521, 56514, 56557, 56557, 56551, 56557, 56563, 56556, 56555, 56521, 56486, 56486, 56519, 56558, 56556, 56558, 56554, 56553, 56555, 56554, 56543, 56537, 56552, 56545, 56540, 56556, 56554, 56546, 56550, 56554, 56550, 56555, 56523, 56521, 56564, 56564, 56554, 56554, 56328, 56447, 56446, 56717, 56710, 56705, 56713, 56720, 56422, 56387, 56387, 56423, 56713, 56712, 56716, 56717, 56439, 56436, 56710, 56432, 56438, 56715, 56710, 56707, 56715, 56715, 56713, 56715, 56717, 56422, 56394, 56394, 56381, 56420, 56715, 56445, 56705, 56713, 56704, 56705, 56713, 56720, 56446, 56444, 56718, 56464, 56514, 56548, 56556, 56554, 56546, 56550, 56554, 56550, 56555, 56523, 56486, 56486, 56521, 56563, 56556, 56548, 56553, 56560, 56545, 56546, 56563, 56561, 56543, 56545, 56563, 56556, 56548, 56547, 56556, 56548, 56544, 56558};
        }

        b(c cVar) {
            super(cVar, true);
        }

        public static /* synthetic */ Object b(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
            int i8 = ~i4;
            int i9 = ~((i8 + i7) - (i8 & i7));
            int i10 = ~i7;
            int i11 = ~((i10 + i5) - (i10 & i5));
            int i12 = (-1) - (((-1) - i11) & ((-1) - i9));
            int i13 = ~i5;
            int i14 = i11 | (~((i13 + i7) - (i13 & i7)));
            int i15 = i7 + i5 + i3 + (762724209 * i2) + (1201824936 * i6);
            int i16 = i15 * i15;
            int i17 = ((-126223985) * i7) + 43253760 + (1339426419 * i5) + ((-1465650404) * i9) + (1465650404 * i12) + (1414658446 * i14) + ((-1540882432) * i3) + (1302855680 * i2) + (1514143744 * i6) + (1905524736 * i16);
            int i18 = ((i7 * 162561953) - 555857873) + (i5 * 162559997) + (i9 * 1956) + (i12 * (-1956)) + (i14 * 978) + (i3 * 162560975) + (i2 * 701011807) + (i6 * 237771736) + (i16 * (-223608832));
            if (i17 + (i18 * i18 * 703332352) != 1) {
                return d(objArr);
            }
            int i19 = 2 % 2;
            int i20 = f20826j;
            int i21 = i20 + 53;
            f20823b = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i20 + 11;
            f20823b = i23 % 128;
            int i24 = i23 % 2;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
            b bVar = (b) objArr[0];
            int i2 = 2 % 2;
            a aVar = new a();
            Object[] objArr2 = new Object[1];
            v("\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{33, 6, 0, 1}, false, objArr2);
            aVar.a(((String) objArr2[0]).intern(), (Object) ((c) bVar.e()).f20819j.b());
            Object[] objArr3 = new Object[1];
            v("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{39, 8, 0, 5}, true, objArr3);
            aVar.b(((String) objArr3[0]).intern(), ((c) bVar.e()).f20818g);
            int i3 = f20823b + 85;
            f20826j = i3 % 128;
            if (i3 % 2 != 0) {
                return aVar;
            }
            throw null;
        }

        private static o.cg.b e(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v("\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000", new int[]{14, 19, 0, 0}, true, objArr);
            o.cg.b bVar = new o.cg.b(context, 30, ((String) objArr[0]).intern());
            int i3 = f20826j + 65;
            f20823b = i3 % 128;
            if (i3 % 2 == 0) {
                return bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{32, MessagePack.Code.STR16, MessagePack.Code.NEVER_USED};
            $$b = 168;
        }

        private static void v(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
            int i2;
            int i3;
            String str2 = str;
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
            char[] cArr = f20825d;
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
                            byte b3 = (byte) (b2 + 1);
                            objA = o.d.d.a(249 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (TypedValue.complexToFloat(i5) > 0.0f ? 1 : (TypedValue.complexToFloat(i5) == 0.0f ? 0 : -1)), 10 - ((byte) KeyEvent.getModifierMetaStateMask()), 1376582792, false, $$d(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
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
                char[] cArr4 = new char[i7];
                mVar.f19943d = 0;
                char c2 = 0;
                while (mVar.f19943d < i7) {
                    if (bArr[mVar.f19943d] == 1) {
                        int i11 = $11 + 117;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = mVar.f19943d;
                            Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                            Object objA2 = o.d.d.a(120026474);
                            if (objA2 == null) {
                                objA2 = o.d.d.a(TextUtils.indexOf("", "") + 11, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 10 - (ViewConfiguration.getJumpTapTimeout() >> 16), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                            int i13 = 72 / 0;
                        } else {
                            int i14 = mVar.f19943d;
                            Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                            Object objA3 = o.d.d.a(120026474);
                            if (objA3 == null) {
                                objA3 = o.d.d.a(11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 10 - TextUtils.indexOf("", "", 0, 0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i14] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                        }
                    } else {
                        int i15 = mVar.f19943d;
                        Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA4 = o.d.d.a(1632715197);
                        if (objA4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA4 = o.d.d.a(View.getDefaultSize(0, 0) + 836, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27278), MotionEvent.axisFromString("") + 12, -1210801192, false, $$d(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    }
                    c2 = cArr4[mVar.f19943d];
                    Object[] objArr6 = {mVar, mVar};
                    Object objA5 = o.d.d.a(-1041906996);
                    if (objA5 == null) {
                        objA5 = o.d.d.a(21 - ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 35715), 10 - ExpandableListView.getPackedPositionChild(0L), 392175785, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                }
                cArr3 = cArr4;
            }
            if (i9 > 0) {
                int i16 = $10 + 15;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    char[] cArr5 = new char[i7];
                    System.arraycopy(cArr3, 1, cArr5, 1, i7);
                    i2 = 0;
                    System.arraycopy(cArr5, 0, cArr3, i7 - i9, i9);
                    System.arraycopy(cArr5, i9, cArr3, 1, i7 >>> i9);
                } else {
                    i2 = 0;
                    char[] cArr6 = new char[i7];
                    System.arraycopy(cArr3, 0, cArr6, 0, i7);
                    int i17 = i7 - i9;
                    System.arraycopy(cArr6, 0, cArr3, i17, i9);
                    System.arraycopy(cArr6, i9, cArr3, 0, i17);
                }
            } else {
                i2 = 0;
            }
            if (z2) {
                char[] cArr7 = new char[i7];
                mVar.f19943d = i2;
                while (mVar.f19943d < i7) {
                    int i18 = $10 + 107;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        cArr7[mVar.f19943d] = cArr3[i7 >>> mVar.f19943d];
                        i3 = mVar.f19943d - 1;
                    } else {
                        cArr7[mVar.f19943d] = cArr3[(i7 - mVar.f19943d) - 1];
                        i3 = mVar.f19943d + 1;
                    }
                    mVar.f19943d = i3;
                }
                cArr3 = cArr7;
            }
            if (i8 > 0) {
                int i19 = $11 + 85;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                mVar.f19943d = 0;
                int i21 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $10 = i21 % 128;
                int i22 = i21 % 2;
                while (mVar.f19943d < i7) {
                    int i23 = $11 + 37;
                    $10 = i23 % 128;
                    int i24 = i23 % 2;
                    cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                    mVar.f19943d++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        @Override // o.ab.j
        public final /* synthetic */ o.cg.f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20826j + 55;
            f20823b = i3 % 128;
            int i4 = i3 % 2;
            o.cg.b bVarE = e(context);
            int i5 = f20826j + 95;
            f20823b = i5 % 128;
            int i6 = i5 % 2;
            return bVarE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0040  */
        @Override // o.ab.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(o.ef.a r11) throws java.lang.Throwable {
            /*
                r10 = this;
                r9 = 2
                int r0 = r9 % r9
                int r0 = o.ba.c.b.f20823b
                int r2 = r0 + 99
                int r0 = r2 % 128
                o.ba.c.b.f20826j = r0
                int r2 = r2 % r9
                r3 = 0
                r8 = 68
                r1 = 9
                r0 = 47
                java.lang.String r5 = "\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000"
                r7 = 0
                r6 = 1
                if (r2 != 0) goto L9c
                o.ab.e r4 = r10.e()
                o.ba.c r4 = (o.ba.c) r4
                java.lang.Class<o.ep.f> r2 = o.ep.f.class
                int[] r1 = new int[]{r0, r1, r8, r7}
                java.lang.Object[] r0 = new java.lang.Object[r6]
                v(r5, r1, r6, r0)
                r0 = r0[r7]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                java.lang.Enum r0 = r11.c(r2, r0)
                o.ep.f r0 = (o.ep.f) r0
                r4.f20817f = r0
                boolean r0 = o.ea.f.a()
                if (r0 == 0) goto L90
            L40:
                r4 = 161(0xa1, float:2.26E-43)
                r1 = 32
                r0 = 56
                r2 = 33
                int[] r1 = new int[]{r0, r2, r4, r1}
                java.lang.Object[] r0 = new java.lang.Object[r6]
                v(r3, r1, r6, r0)
                r0 = r0[r7]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r5 = r0.intern()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r1 = 89
                r0 = 39
                int[] r2 = new int[]{r1, r0, r7, r2}
                java.lang.Object[] r1 = new java.lang.Object[r6]
                java.lang.String r0 = "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001"
                v(r0, r2, r6, r1)
                r0 = r1[r7]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                java.lang.StringBuilder r1 = r4.append(r0)
                o.ab.e r0 = r10.e()
                o.ba.c r0 = (o.ba.c) r0
                o.ep.f r0 = r0.f20817f
                java.lang.String r0 = r0.name()
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                o.ea.f.c(r5, r0)
            L90:
                int r0 = o.ba.c.b.f20826j
                int r1 = r0 + 55
                int r0 = r1 % 128
                o.ba.c.b.f20823b = r0
                int r1 = r1 % r9
                if (r1 != 0) goto Lc5
                return
            L9c:
                o.ab.e r4 = r10.e()
                o.ba.c r4 = (o.ba.c) r4
                java.lang.Class<o.ep.f> r2 = o.ep.f.class
                int[] r1 = new int[]{r0, r1, r8, r7}
                java.lang.Object[] r0 = new java.lang.Object[r6]
                v(r5, r1, r6, r0)
                r0 = r0[r7]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                java.lang.Enum r0 = r11.c(r2, r0)
                o.ep.f r0 = (o.ep.f) r0
                r4.f20817f = r0
                boolean r0 = o.ea.f.a()
                if (r0 == 0) goto L90
                goto L40
            Lc5:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ba.c.b.a(o.ef.a):void");
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            int i3 = 2 % 2;
            int i4 = f20823b + 61;
            f20826j = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (i2 == 3001) {
                return o.bg.a.aE;
            }
            if (i2 == 3002) {
                return o.bg.a.aC;
            }
            if (i2 == 5002) {
                return o.bg.a.aB;
            }
            o.bg.a aVarB = super.b(i2);
            int i5 = f20826j + 65;
            f20823b = i5 % 128;
            int i6 = i5 % 2;
            return aVarB;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20823b + 111;
            f20826j = i3 % 128;
            int i4 = i3 % 2;
            ((c) e()).g().b(cVar);
            int i5 = f20823b + 89;
            f20826j = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20823b + 89;
            f20826j = i3 % 128;
            int i4 = i3 % 2;
            ((c) e()).g().d();
            int i5 = f20823b + 45;
            f20826j = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 49 / 0;
            }
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int iMyPid = Process.myPid();
            int i2 = 1346905129 * f20824c;
            f20824c = i2;
            return (o.cg.j) b((int) Thread.currentThread().getId(), new Object[]{this}, i2, iMyPid, 2013004135, Process.myUid(), -2013004134);
        }

        @Override // o.ab.j
        public final a m() throws o.ef.b {
            int iNextInt = new Random().nextInt(669797846);
            int iMyPid = Process.myPid();
            return (a) b(Process.myPid(), new Object[]{this}, iMyPid, iNextInt, -1989765215, new Random().nextInt(400560943), 1989765215);
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20823b + 37;
            f20826j = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v("\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{0, 14, 79, 1}, false, objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f20823b + 101;
            f20826j = i5 % 128;
            int i6 = i5 % 2;
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20826j + 19;
            int i4 = i3 % 128;
            f20823b = i4;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 51;
            f20826j = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void q() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20826j + 65;
            f20823b = i3 % 128;
            int i4 = i3 % 2;
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                v(null, new int[]{56, 33, 161, 32}, true, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                v("\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000", new int[]{128, 45, 157, 33}, false, objArr2);
                o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(((c) e()).f20817f).toString());
                int i5 = f20823b + 121;
                f20826j = i5 % 128;
                int i6 = i5 % 2;
            }
            int i7 = AnonymousClass5.f20820a[((c) e()).f20817f.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    return;
                }
                j().d(h(), ((c) e()).f20819j.b());
                return;
            }
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                v(null, new int[]{56, 33, 161, 32}, true, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr4 = new Object[1];
                v("\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001", new int[]{173, 33, 0, 0}, true, objArr4);
                o.ea.f.c(strIntern2, sb2.append(((String) objArr4[0]).intern()).append(((c) e()).f20819j.b()).toString());
            }
            o.fj.e eVar = new o.fj.e();
            o.fj.b bVarB = j().e().b(h(), ((c) e()).f20819j.b());
            Object[] objArr5 = {eVar, new o.fj.c()};
            int i8 = (int) Runtime.getRuntime().totalMemory();
            int i9 = o.fj.e.f25940b * 589618332;
            o.fj.e.f25940b = i9;
            int i10 = o.fj.e.f25942d * 1486431314;
            o.fj.e.f25942d = i10;
            o.fj.e.c(1873578411, i10, -1873578410, i8, (int) Process.getElapsedCpuTime(), objArr5, i9);
            int i11 = o.fj.e.f25943e * 1313410593;
            o.fj.e.f25943e = i11;
            int i12 = o.fj.e.f25939a * (-1428871075);
            o.fj.e.f25939a = i12;
            int iMyTid = Process.myTid();
            int i13 = o.fj.e.f25944j * (-490041921);
            o.fj.e.f25944j = i13;
            o.fj.e.c(-1548073825, iMyTid, 1548073827, i11, i13, new Object[]{eVar, bVarB}, i12);
            i().e(eVar);
            j().e(h());
        }
    }

    public interface d {
        void b(o.bg.c cVar);

        void d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(short r8, byte r9, int r10) {
        /*
            int r8 = r8 + 4
            int r0 = r10 * 2
            int r7 = r0 + 113
            byte[] r6 = o.ba.c.$$d
            int r1 = r9 * 2
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r6 != 0) goto L2a
            r2 = r8
            r0 = r3
            r1 = r4
        L16:
            int r0 = -r0
            int r8 = r8 + r0
        L18:
            byte r0 = (byte) r8
            r5[r1] = r0
            if (r1 != r3) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L23:
            int r2 = r2 + 1
            int r1 = r1 + 1
            r0 = r6[r2]
            goto L16
        L2a:
            r1 = r4
            r2 = r8
            r8 = r7
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ba.c.$$j(short, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20812k = 0;
        f20814m = 1;
        f20815n = 0;
        f20816o = 1;
        m();
        ViewConfiguration.getFadingEdgeLength();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getScrollDefaultDelay();
        ViewConfiguration.getPressedStateDuration();
        TextUtils.indexOf("", "", 0, 0);
        int i2 = f20814m + 97;
        f20812k = i2 % 128;
        int i3 = i2 % 2;
    }

    public c(Context context, d dVar, o.en.b bVar) {
        super(context, dVar, bVar, o.bg.e.f21112j);
    }

    static void init$0() {
        $$d = new byte[]{7, 42, -92, 85};
        $$e = 23;
    }

    private b l() {
        int i2 = 2 % 2;
        b bVar = new b(this);
        int i3 = f20815n + 21;
        f20816o = i3 % 128;
        if (i3 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    static void m() {
        f20813l = -1270219470;
    }

    private static void q(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        int i6 = $11 + 7;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f20813l)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a(271 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - ((Process.getThreadPriority(0) + 20) >> 6), -2071844881, false, $$j(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(522 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, 627984172, false, $$j(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        if (i4 > 0) {
            int i9 = $11 + 71;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i11 = $10 + 109;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i13 = $10 + 93;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr4[nVar.f19944a] = cArr2[nVar.f19944a * i2];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objA3 = o.d.d.a((ViewConfiguration.getTapTimeout() >> 16) + 522, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 12 - Color.blue(0), 627984172, false, $$j(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = o.d.d.a(-202660535);
                    if (objA4 == null) {
                        byte b8 = (byte) (-1);
                        byte b9 = (byte) (b8 + 1);
                        objA4 = o.d.d.a(View.getDefaultSize(0, 0) + 522, (char) TextUtils.getCapsMode("", 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11, 627984172, false, $$j(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20816o + 11;
        f20815n = i3 % 128;
        if (i3 % 2 != 0) {
            l();
            throw null;
        }
        b bVarL = l();
        int i4 = f20815n + 107;
        f20816o = i4 % 128;
        int i5 = i4 % 2;
        return bVarL;
    }

    public final void d(o.ep.d dVar, boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20816o + 17;
        f20815n = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f20819j = dVar;
            this.f20818g = z2;
            a();
            obj.hashCode();
            throw null;
        }
        this.f20819j = dVar;
        this.f20818g = z2;
        a();
        int i4 = f20816o + 17;
        f20815n = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20815n + 101;
        f20816o = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        q(33 - (ViewConfiguration.getTapTimeout() >> 16), "\u000f￼\uffff\u0004\u0007￼\ufff1\uffff\t￼\b\b\n\uffde\u000e\t\n\u0004\u000f\u0004\uffff\t\n\uffde\uffff\tￜ\u000e\b\r\u0000\uffef\u0000", true, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 141, 7 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20816o + 75;
        f20815n = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }
}
