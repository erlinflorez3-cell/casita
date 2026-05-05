package o.au;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.g;
import o.a.m;
import o.a.q;
import o.ab.j;
import o.bg.a;
import o.cg.b;
import o.cg.f;
import o.ep.h;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends o.ab.e<d> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f20658l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static long f20659m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20660n = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f20661r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f20662s = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    c f20663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    o.i.d f20664g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f20665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    h f20666k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    o.ep.d f20667o;

    /* JADX INFO: renamed from: o.au.e$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f20669b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f20670d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f20671e;

        static {
            int[] iArr = new int[c.values().length];
            f20671e = iArr;
            try {
                iArr[c.f20672a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20671e[c.f20673c.ordinal()] = 2;
                int i2 = f20670d;
                int i3 = (i2 ^ 97) + ((i2 & 97) << 1);
                f20669b = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20671e[c.f20675e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[a.values().length];
            f20668a = iArr2;
            try {
                iArr2[a.aA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20668a[a.aB.ordinal()] = 2;
                int i6 = f20669b + 125;
                f20670d = i6 % 128;
                int i7 = i6 % 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c implements o.en.a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f20672a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f20673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ c[] f20674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f20675e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f20676f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static char[] f20677g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f20678h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f20679i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f20680j = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f20681b;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r8, short r9, byte r10) {
            /*
                int r7 = r9 * 2
                int r1 = r7 + 1
                byte[] r6 = o.au.e.c.$$a
                int r0 = r10 * 4
                int r5 = r0 + 116
                int r0 = r8 * 3
                int r4 = 4 - r0
                byte[] r3 = new byte[r1]
                r2 = 0
                if (r6 != 0) goto L29
                r0 = r5
                r1 = r2
                r5 = r4
            L16:
                int r4 = r4 + 1
                int r5 = r5 + r0
            L19:
                byte r0 = (byte) r5
                r3[r1] = r0
                if (r1 != r7) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                return r0
            L24:
                int r1 = r1 + 1
                r0 = r6[r4]
                goto L16
            L29:
                r1 = r2
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.au.e.c.$$c(int, short, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20679i = 0;
            f20680j = 1;
            f20676f = 0;
            f20678h = 1;
            d();
            Object[] objArr = new Object[1];
            k("\u0000\u0001\u0000\u0000\u0000\u0000", new int[]{18, 6, 142, 0}, false, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k("\u0000\u0001\u0000\u0000\u0000\u0000", new int[]{18, 6, 142, 0}, false, objArr2);
            f20672a = new c(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            k(null, new int[]{24, 7, 12, 7}, true, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            k(null, new int[]{24, 7, 12, 7}, true, objArr4);
            f20673c = new c(strIntern2, 1, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            k("\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{31, 6, 51, 0}, true, objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            k("\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{31, 6, 51, 0}, true, objArr6);
            f20675e = new c(strIntern3, 2, ((String) objArr6[0]).intern());
            f20674d = e();
            int i2 = f20679i + 79;
            f20680j = i2 % 128;
            int i3 = i2 % 2;
        }

        private c(String str, int i2, String str2) {
            this.f20681b = str2;
        }

        static void d() {
            f20677g = new char[]{56490, 56545, 56553, 56558, 56564, 56554, 56548, 56555, 56556, 56548, 56514, 56507, 56539, 56550, 56560, 56557, 56527, 56493, 56560, 56409, 56410, 56418, 56415, 56407, 56528, 56538, 56529, 56540, 56543, 56545, 56543, 56508, 56575, 56575, 56571, 56571, 56567};
        }

        private static /* synthetic */ c[] e() {
            c[] cVarArr;
            int i2 = 2 % 2;
            int i3 = f20678h + 15;
            int i4 = i3 % 128;
            f20676f = i4;
            if (i3 % 2 != 0) {
                cVarArr = new c[4];
                cVarArr[0] = f20672a;
                cVarArr[0] = f20673c;
                cVarArr[3] = f20675e;
            } else {
                cVarArr = new c[]{f20672a, f20673c, f20675e};
            }
            int i5 = i4 + 49;
            f20678h = i5 % 128;
            if (i5 % 2 != 0) {
                return cVarArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{112, 68, MessagePack.Code.BIN8, -81};
            $$b = 111;
        }

        private static void k(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
            int i2;
            int length;
            char[] cArr;
            String str2 = str;
            int i3 = 2;
            int i4 = 2 % 2;
            Object bytes = str2;
            if (str2 != null) {
                int i5 = $11 + 57;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            m mVar = new m();
            int i7 = 0;
            int i8 = iArr[0];
            int i9 = iArr[1];
            int i10 = iArr[2];
            int i11 = iArr[3];
            char[] cArr2 = f20677g;
            long j2 = 0;
            if (cArr2 != null) {
                int i12 = $11 + 29;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                }
                while (i7 < length) {
                    int i13 = $11 + 19;
                    $10 = i13 % 128;
                    if (i13 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                            Object objA = o.d.d.a(-2071388435);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = o.d.d.a(249 - TextUtils.indexOf("", ""), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) - 1), 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1376582792, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            i7 >>>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                        Object objA2 = o.d.d.a(-2071388435);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(248 - TextUtils.lastIndexOf("", '0'), (char) ExpandableListView.getPackedPositionGroup(0L), Color.blue(0) + 11, 1376582792, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        cArr[i7] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i7++;
                    }
                    i3 = 2;
                    j2 = 0;
                }
                cArr2 = cArr;
            }
            char[] cArr3 = new char[i9];
            System.arraycopy(cArr2, i8, cArr3, 0, i9);
            if (bArr != null) {
                char[] cArr4 = new char[i9];
                mVar.f19943d = 0;
                char c2 = 0;
                while (mVar.f19943d < i9) {
                    if (bArr[mVar.f19943d] == 1) {
                        int i14 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA3 = o.d.d.a(120026474);
                        if (objA3 == null) {
                            objA3 = o.d.d.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), TextUtils.getOffsetAfter("", 0) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    } else {
                        int i15 = mVar.f19943d;
                        Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA4 = o.d.d.a(1632715197);
                        if (objA4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objA4 = o.d.d.a(836 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 27279), 11 - ExpandableListView.getPackedPositionType(0L), -1210801192, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    }
                    c2 = cArr4[mVar.f19943d];
                    Object[] objArr6 = {mVar, mVar};
                    Object objA5 = o.d.d.a(-1041906996);
                    if (objA5 == null) {
                        objA5 = o.d.d.a(View.combineMeasuredStates(0, 0) + 21, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 35715), 11 - Color.blue(0), 392175785, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                }
                cArr3 = cArr4;
            }
            if (i11 > 0) {
                char[] cArr5 = new char[i9];
                i2 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i9);
                int i16 = i9 - i11;
                System.arraycopy(cArr5, 0, cArr3, i16, i11);
                System.arraycopy(cArr5, i11, cArr3, 0, i16);
            } else {
                i2 = 0;
            }
            if (z2) {
                char[] cArr6 = new char[i9];
                while (true) {
                    mVar.f19943d = i2;
                    if (mVar.f19943d >= i9) {
                        break;
                    }
                    cArr6[mVar.f19943d] = cArr3[(i9 - mVar.f19943d) - 1];
                    i2 = mVar.f19943d + 1;
                }
                int i17 = $11 + 93;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr3 = cArr6;
            }
            if (i10 > 0) {
                int i19 = 0;
                while (true) {
                    mVar.f19943d = i19;
                    if (mVar.f19943d >= i9) {
                        break;
                    }
                    cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                    i19 = mVar.f19943d + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        public static c valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f20678h + 89;
            f20676f = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            int i5 = f20678h + 69;
            f20676f = i5 % 128;
            if (i5 % 2 == 0) {
                return cVar;
            }
            throw null;
        }

        public static c[] values() {
            int i2 = 2 % 2;
            int i3 = f20678h + 39;
            f20676f = i3 % 128;
            int i4 = i3 % 2;
            c[] cVarArr = (c[]) f20674d.clone();
            int i5 = f20676f + 103;
            f20678h = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 56 / 0;
            }
            return cVarArr;
        }

        @Override // o.en.a
        public final String a() {
            String str;
            int i2 = 2 % 2;
            int i3 = f20676f;
            int i4 = i3 + 81;
            f20678h = i4 % 128;
            if (i4 % 2 == 0) {
                str = this.f20681b;
                int i5 = 44 / 0;
            } else {
                str = this.f20681b;
            }
            int i6 = i3 + 121;
            f20678h = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final h.e b() throws Throwable {
            int i2 = 2 % 2;
            int i3 = AnonymousClass1.f20671e[ordinal()];
            if (i3 == 1) {
                return h.e.f24572c;
            }
            if (i3 == 2) {
                h.e eVar = h.e.f24570a;
                int i4 = f20676f + 33;
                f20678h = i4 % 128;
                int i5 = i4 % 2;
                return eVar;
            }
            if (i3 != 3) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                k("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{0, 18, 0, 0}, false, objArr);
                throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(name()).toString());
            }
            h.e eVar2 = h.e.f24573e;
            int i6 = f20676f + 1;
            f20678h = i6 % 128;
            int i7 = i6 % 2;
            return eVar2;
        }
    }

    public interface d {
        void c(o.bg.c cVar);

        void e();
    }

    /* JADX INFO: renamed from: o.au.e$e, reason: collision with other inner class name */
    static final class C0335e extends j<e> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final byte[] $$k = null;
        private static final int $$l = 0;
        private static int $10 = 0;
        private static int $11 = 0;
        public static int A = 0;
        public static int B = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f20682b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static char[] f20683c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20684d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static char f20685f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static char f20686g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static char f20687h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static char f20688i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f20689j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f20690k = 0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static int f20691v = 0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static int f20692z = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0011). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$m(short r9, byte r10, byte r11) {
            /*
                int r0 = r10 * 3
                int r8 = r0 + 1
                byte[] r7 = o.au.e.C0335e.$$k
                int r6 = r11 + 69
                int r5 = r9 + 4
                byte[] r4 = new byte[r8]
                r3 = 0
                if (r7 != 0) goto L27
                r2 = r3
                r0 = r5
            L11:
                int r5 = r5 + r6
                r1 = r2
                r6 = r5
                r5 = r0
            L15:
                byte r0 = (byte) r6
                int r2 = r1 + 1
                r4[r1] = r0
                if (r2 != r8) goto L22
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L22:
                int r0 = r5 + 1
                r5 = r7[r0]
                goto L11
            L27:
                r1 = r3
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.au.e.C0335e.$$m(short, byte, byte):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            B = -424081824;
            A = -1323169346;
            f20692z = -31744059;
            f20691v = 120467407;
            init$0();
            f20684d = 982967331;
            f20682b = 618587695;
            f20689j = 0;
            f20690k = 1;
            f20683c = new char[]{56503, 56552, 56540, 56541, 56550, 56548, 56551, 56551, 56551, 56496, 56551, 56558, 56556, 56558, 56555, 56515, 56332, 56342, 56498, 56546, 56551, 56553, 56555, 56560, 56556, 56550, 56521, 56519, 56552, 56560, 56527, 56503, 56530, 56555, 56558, 56559, 56559, 56558, 56566, 56550, 56542, 56557, 56555, 56547, 56500, 56550, 56548, 56553, 56561, 56558, 56558, 56566, 56544, 56532, 56554, 56557, 56533, 56537, 56553, 56548};
            f20687h = (char) 42546;
            f20685f = (char) 37769;
            f20686g = (char) 6205;
            f20688i = (char) 9857;
        }

        C0335e(e eVar) {
            super(eVar, true);
        }

        private static void E(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
            int i2;
            char[] cArr;
            char[] cArr2;
            char c2;
            String str2 = str;
            int i3 = 2 % 2;
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            m mVar = new m();
            int i4 = 0;
            int i5 = iArr[0];
            byte b2 = 1;
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            char[] cArr3 = f20683c;
            long j2 = 0;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i9 = 0;
                while (i9 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i9])};
                        Object objA = o.d.d.a(-2071388435);
                        if (objA == null) {
                            int iResolveOpacity = Drawable.resolveOpacity(i4, i4) + 249;
                            char c3 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)));
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, i4) + 11;
                            byte b3 = (byte) ($$k[b2] + b2);
                            byte b4 = (byte) (b3 + 1);
                            objA = o.d.d.a(iResolveOpacity, c3, iMakeMeasureSpec, 1376582792, false, $$m(b3, b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 47)))), new Class[]{Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i9++;
                        i4 = 0;
                        b2 = 1;
                        j2 = 0;
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
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, i5, cArr5, 0, i6);
            if (bArr != null) {
                int i10 = $11 + 95;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr2 = new char[i6];
                    mVar.f19943d = 0;
                    c2 = 1;
                } else {
                    cArr2 = new char[i6];
                    mVar.f19943d = 0;
                    c2 = 0;
                }
                while (mVar.f19943d < i6) {
                    if (bArr[mVar.f19943d] == 1) {
                        int i11 = mVar.f19943d;
                        Object[] objArr3 = {Integer.valueOf(cArr5[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA2 = o.d.d.a(120026474);
                        if (objA2 == null) {
                            objA2 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 12, (char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i11] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    } else {
                        int i12 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr5[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA3 = o.d.d.a(1632715197);
                        if (objA3 == null) {
                            int offsetAfter = 836 - TextUtils.getOffsetAfter("", 0);
                            char c4 = (char) (27280 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF;
                            byte b5 = (byte) ($$k[1] + 1);
                            byte b6 = (byte) (b5 + 1);
                            objA3 = o.d.d.a(offsetAfter, c4, modifierMetaStateMask, -1210801192, false, $$m(b5, b6, (byte) (51 | b6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i12] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    }
                    c2 = cArr2[mVar.f19943d];
                    Object[] objArr5 = {mVar, mVar};
                    Object objA4 = o.d.d.a(-1041906996);
                    if (objA4 == null) {
                        objA4 = o.d.d.a(21 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (35715 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 392175785, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                cArr5 = cArr2;
            }
            if (i8 > 0) {
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr5, 0, cArr6, 0, i6);
                int i13 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr5, i13, i8);
                System.arraycopy(cArr6, i8, cArr5, 0, i13);
            }
            if (z2) {
                int i14 = $10 + 117;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr = new char[i6];
                    i2 = 0;
                } else {
                    i2 = 0;
                    cArr = new char[i6];
                }
                while (true) {
                    mVar.f19943d = i2;
                    if (mVar.f19943d >= i6) {
                        break;
                    }
                    int i15 = $10 + 125;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    cArr[mVar.f19943d] = cArr5[(i6 - mVar.f19943d) - 1];
                    i2 = mVar.f19943d + 1;
                }
                cArr5 = cArr;
            }
            if (i7 > 0) {
                int i17 = $10 + 9;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                int i19 = 0;
                while (true) {
                    mVar.f19943d = i19;
                    if (mVar.f19943d >= i6) {
                        break;
                    }
                    cArr5[mVar.f19943d] = (char) (cArr5[mVar.f19943d] - iArr[2]);
                    i19 = mVar.f19943d + 1;
                }
            }
            objArr[0] = new String(cArr5);
        }

        private static void F(String str, int i2, Object[] objArr) throws Throwable {
            int i3;
            String str2 = str;
            int i4 = 2 % 2;
            Object charArray = str2;
            if (str2 != null) {
                int i5 = $11 + 35;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    str2.toCharArray();
                    throw null;
                }
                charArray = str2.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            g gVar = new g();
            char[] cArr2 = new char[cArr.length];
            int i6 = 0;
            gVar.f19924d = 0;
            char[] cArr3 = new char[2];
            while (gVar.f19924d < cArr.length) {
                int i7 = $10 + 33;
                $11 = i7 % 128;
                int i8 = 58224;
                if (i7 % 2 == 0) {
                    cArr3[1] = cArr[gVar.f19924d];
                    cArr3[1] = cArr[gVar.f19924d];
                    i3 = 1;
                } else {
                    cArr3[i6] = cArr[gVar.f19924d];
                    cArr3[1] = cArr[gVar.f19924d + 1];
                    i3 = i6;
                }
                while (i3 < 16) {
                    char c2 = cArr3[1];
                    char c3 = cArr3[i6];
                    int i9 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) f20686g) ^ (-7511683281764982996L))));
                    int i10 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(f20688i);
                        objArr2[2] = Integer.valueOf(i10);
                        objArr2[1] = Integer.valueOf(i9);
                        objArr2[i6] = Integer.valueOf(c2);
                        Object objA = o.d.d.a(1603517628);
                        if (objA == null) {
                            int maxKeyCode = 270 - (KeyEvent.getMaxKeyCode() >> 16);
                            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11;
                            byte b2 = (byte) ($$k[1] + 1);
                            byte b3 = (byte) (b2 + 1);
                            String str$$m = $$m(b2, b3, b3);
                            Class[] clsArr = new Class[4];
                            clsArr[i6] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objA = o.d.d.a(maxKeyCode, packedPositionChild, maximumFlingVelocity, -1995022631, false, str$$m, clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f20687h) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f20685f)};
                        Object objA2 = o.d.d.a(1603517628);
                        if (objA2 == null) {
                            int mirror = AndroidCharacter.getMirror('0') + 222;
                            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int iNormalizeMetaState = 11 - KeyEvent.normalizeMetaState(0);
                            byte b4 = (byte) ($$k[1] + 1);
                            byte b5 = (byte) (b4 + 1);
                            objA2 = o.d.d.a(mirror, minimumFlingVelocity, iNormalizeMetaState, -1995022631, false, $$m(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
                        i3++;
                        i6 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[gVar.f19924d] = cArr3[0];
                cArr2[gVar.f19924d + 1] = cArr3[1];
                Object[] objArr4 = {gVar, gVar};
                Object objA3 = o.d.d.a(1390051551);
                if (objA3 == null) {
                    int maximumDrawingCacheSize = 270 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int i11 = 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b6 = (byte) ($$k[1] + 1);
                    byte b7 = (byte) (b6 + 1);
                    objA3 = o.d.d.a(maximumDrawingCacheSize, threadPriority, i11, -2074123590, false, $$m(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i12 = $11 + 103;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                i6 = 0;
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void G(short r9, byte r10, short r11, java.lang.Object[] r12) {
            /*
                byte[] r8 = o.au.e.C0335e.$$a
                int r0 = r11 * 2
                int r7 = r0 + 4
                int r0 = r10 + 99
                int r1 = r9 * 3
                int r6 = 1 - r1
                byte[] r5 = new byte[r6]
                r4 = 0
                if (r8 != 0) goto L2c
                r3 = r4
                r2 = r6
            L13:
                int r0 = -r0
                int r0 = r0 + r2
                int r7 = r7 + 1
                r2 = r3
            L18:
                byte r1 = (byte) r0
                int r3 = r2 + 1
                r5[r2] = r1
                if (r3 != r6) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r12[r4] = r0
                return
            L27:
                r1 = r8[r7]
                r2 = r0
                r0 = r1
                goto L13
            L2c:
                r2 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.au.e.C0335e.G(short, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void H(short r8, int r9, byte r10, java.lang.Object[] r11) {
            /*
                int r0 = r8 * 5
                int r1 = 8 - r0
                byte[] r8 = o.au.e.C0335e.$$d
                int r7 = 111 - r10
                int r2 = r9 * 5
                int r0 = 6 - r2
                byte[] r6 = new byte[r0]
                int r5 = 5 - r2
                r4 = 0
                if (r8 != 0) goto L2e
                r3 = r4
                r0 = r1
            L15:
                int r7 = r7 + r1
                int r7 = r7 + (-4)
                r2 = r3
                r1 = r0
            L1a:
                byte r0 = (byte) r7
                r6[r2] = r0
                int r3 = r2 + 1
                if (r2 != r5) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r4)
                r11[r4] = r0
                return
            L29:
                int r0 = r1 + 1
                r1 = r8[r0]
                goto L15
            L2e:
                r2 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.au.e.C0335e.H(short, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
            int i8 = ~((i2 + i5) - (i2 & i5));
            int i9 = (i7 + i8) - (i7 & i8);
            int i10 = (~(i5 | (~i7))) | i2;
            int i11 = i2 + i7 + i6 + ((-1932811043) * i4) + (1521317780 * i3);
            int i12 = i11 * i11;
            int i13 = ((i2 * (-919556932)) - 154402816) + ((-919556932) * i7) + ((-1121407813) * i8) + (i9 * 1121407813) + (1121407813 * i10) + (201850880 * i6) + ((-2098724864) * i4) + ((-1398800384) * i3) + ((-1444151296) * i12);
            int i14 = (i2 * 1794637580) + 2133191799 + (i7 * 1794637580) + (i8 * (-161)) + (i9 * 161) + (i10 * 161) + (i6 * 1794637741) + (i4 * (-1844343719)) + (i3 * (-1188939004)) + (i12 * (-394526720));
            if (i13 + (i14 * i14 * 821297152) != 1) {
                C0335e c0335e = (C0335e) objArr[0];
                o.bg.c cVar = (o.bg.c) objArr[1];
                int i15 = 2 % 2;
                int i16 = f20690k + 105;
                f20689j = i16 % 128;
                int i17 = i16 % 2;
                ((e) c0335e.e()).g().c(cVar);
                int i18 = f20689j + 57;
                f20690k = i18 % 128;
                int i19 = i18 % 2;
                return null;
            }
            C0335e c0335e2 = (C0335e) objArr[0];
            int i20 = 2 % 2;
            int i21 = f20689j + 71;
            f20690k = i21 % 128;
            int i22 = i21 % 2;
            ((e) c0335e2.e()).g().e();
            int i23 = f20689j + 17;
            f20690k = i23 % 128;
            int i24 = i23 % 2;
            return null;
        }

        static void init$0() {
            $$a = new byte[]{120, 46, 101, 90};
            $$b = 109;
        }

        static void init$1() {
            $$d = new byte[]{7, -110, 9, 72, MessagePack.Code.TRUE, 60, 8, MessagePack.Code.EXT16, 58};
            $$e = 226;
        }

        static void init$2() {
            $$k = new byte[]{93, -2, -4, -85};
            $$l = 136;
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            F("ﷴ먤牌Ｊ\u0891寨熭浙뫸戀뀲ᎅ뢑䶷ꕒ\uf7a8堮栒", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, objArr);
            b bVar = new b(context, 38, ((String) objArr[0]).intern());
            int i3 = f20689j + 73;
            f20690k = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 26 / 0;
            }
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20690k + 111;
            f20689j = i3 % 128;
            int i4 = i3 % 2;
            j().j().c(h(), ((e) e()).f20667o.b(), ((e) e()).f20666k, ((e) e()).f20663f.b());
            int i5 = f20689j + 113;
            f20690k = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0280 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // o.ab.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.bg.a b(int r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 946
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.au.e.C0335e.b(int):o.bg.a");
        }

        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = f20682b * (-1384745699);
            f20682b = i2;
            int iNextInt = new Random().nextInt();
            int iMyPid = Process.myPid();
            e(-1654792860, (int) Thread.currentThread().getId(), iMyPid, i2, new Object[]{this, cVar}, iNextInt, 1654792860);
        }

        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int iNextInt = new Random().nextInt();
            int i2 = f20684d * (-3386338);
            f20684d = i2;
            int priority = Thread.currentThread().getPriority();
            e(1999153011, (int) Thread.currentThread().getId(), priority, iNextInt, new Object[]{this, cVar}, i2, -1999153010);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x02d6  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0359  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x03d5  */
        @Override // o.ab.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.cg.j k() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1431
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.au.e.C0335e.k():o.cg.j");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final o.ef.a m() throws Throwable {
            int i2 = 2 % 2;
            o.ef.a aVar = new o.ef.a();
            Object[] objArr = new Object[1];
            E("\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{9, 6, 0, 1}, true, objArr);
            aVar.a(((String) objArr[0]).intern(), (Object) ((e) e()).f20663f.a());
            o.ef.a aVar2 = new o.ef.a();
            Object[] objArr2 = new Object[1];
            F("湤柂", 2 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
            aVar2.a(((String) objArr2[0]).intern(), (Object) ((e) e()).f20666k.a());
            Object[] objArr3 = new Object[1];
            F("뜬櫩ͯ猰辁칦", 6 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
            aVar2.a(((String) objArr3[0]).intern(), (Object) ((e) e()).f20667o.b());
            Object[] objArr4 = new Object[1];
            F("ݗ嫩씣땯ꃾ蛏", KeyEvent.normalizeMetaState(0) + 6, objArr4);
            aVar2.a(((String) objArr4[0]).intern(), (Object) ((e) e()).f20666k.g());
            Object[] objArr5 = new Object[1];
            E("\u0001\u0001\u0000", new int[]{15, 3, 36, 2}, false, objArr5);
            aVar.a(((String) objArr5[0]).intern(), aVar2);
            int i3 = f20690k + 81;
            f20689j = i3 % 128;
            if (i3 % 2 == 0) {
                return aVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20690k + 85;
            f20689j = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                E("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000", new int[]{0, 9, 0, 0}, false, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                E("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000", new int[]{0, 9, 0, 0}, true, objArr2);
                obj = objArr2[0];
            }
            String strIntern = ((String) obj).intern();
            int i4 = f20690k + 69;
            f20689j = i4 % 128;
            int i5 = i4 % 2;
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20690k;
            int i4 = i3 + 49;
            f20689j = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 57;
            f20689j = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void s() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20690k + 61;
            f20689j = i3 % 128;
            int i4 = i3 % 2;
            int i5 = AnonymousClass1.f20668a[f().c().ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    super.s();
                    return;
                } else {
                    j().d(h(), ((e) e()).f20667o.b());
                    return;
                }
            }
            j().c(h(), ((e) e()).f20667o.b());
            int i6 = f20690k + 71;
            f20689j = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r8, int r9, byte r10) {
        /*
            byte[] r7 = o.au.e.$$d
            int r0 = r8 * 7
            int r6 = r0 + 71
            int r1 = r10 * 3
            int r0 = 1 - r1
            int r5 = r9 + 4
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r7 != 0) goto L29
            r0 = r6
            r6 = r2
            r1 = r3
        L16:
            int r6 = r6 + r0
        L17:
            int r5 = r5 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r2) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r0 = r7[r5]
            int r1 = r1 + 1
            goto L16
        L29:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.au.e.$$j(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20662s = 0;
        f20661r = 1;
        f20660n = 0;
        f20658l = 1;
        m();
        Gravity.getAbsoluteGravity(0, 0);
        ViewConfiguration.getZoomControlsTimeout();
        int i2 = f20662s + 35;
        f20661r = i2 % 128;
        int i3 = i2 % 2;
    }

    public e(Context context, d dVar, o.en.b bVar) {
        super(context, dVar, bVar, o.bg.e.f21122t);
    }

    static void init$0() {
        $$d = new byte[]{100, 68, -66, 16};
        $$e = 10;
    }

    static void m() {
        f20659m = 7466392236121228794L;
    }

    private C0335e o() {
        int i2 = 2 % 2;
        C0335e c0335e = new C0335e(this);
        int i3 = f20660n + 21;
        f20658l = i3 % 128;
        int i4 = i3 % 2;
        return c0335e;
    }

    private static void q(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 77;
        int i5 = i4 % 128;
        $10 = i5;
        int i6 = i4 % 2;
        if (str2 != null) {
            int i7 = i5 + 103;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i9 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objA = o.d.d.a(732 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 7933), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, 355847088, false, $$j(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i9] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f20659m ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (-b4);
                    objA2 = o.d.d.a(View.resolveSize(0, 0) + 836, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27278), 11 - (KeyEvent.getMaxKeyCode() >> 16), -2145994442, false, $$j(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 1;
                byte b7 = (byte) (-b6);
                objA3 = o.d.d.a(835 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27280), 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -2145994442, false, $$j(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public final void a(o.i.d dVar, String str, c cVar, o.ep.d dVar2, h hVar) {
        int i2 = 2 % 2;
        int i3 = f20658l + 33;
        f20660n = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            q("裸緽抉垯屶䄝㘕㳉↓ᚇᭀ\u001b\uf534﯁\ue0e5햶", (-16714455) - Color.rgb(0, 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            q("裑쥱ம䷕蹷삃ː䍽薻쟕ᡵ嫌鲜\udd3aᾢ凑鉫풏ᛔ坡꧉\uebf6Ɱ溏ꃔ\ue172⎊旐꘡\uf8a9㫞筲붱ﾞ〹狴", Color.rgb(0, 0, 0) + 16794027, objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(dVar2.b()).toString());
        }
        this.f20664g = dVar;
        this.f20665j = str;
        this.f20663f = cVar;
        this.f20667o = dVar2;
        this.f20666k = hVar;
        a();
        int i5 = f20660n + 13;
        f20658l = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20660n + 105;
        f20658l = i3 % 128;
        int i4 = i3 % 2;
        C0335e c0335eO = o();
        int i5 = f20660n + 99;
        f20658l = i5 % 128;
        if (i5 % 2 != 0) {
            return c0335eO;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f20658l + 47;
        f20660n = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            q("裸緽抉垯屶䄝㘕㳉↓ᚇᭀ\u001b\uf534﯁\ue0e5햶", (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)) * 62760, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            q("裸緽抉垯屶䄝㘕㳉↓ᚇᭀ\u001b\uf534﯁\ue0e5햶", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62760, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }
}
