package o.eo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import androidx.core.view.ViewCompat;
import fr.antelop.sdk.TimePeriod;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import o.a.i;
import o.a.m;
import o.ao.b;
import o.eo.b;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends b<o.ex.b<?>> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f24368a = 0;

    /* JADX INFO: renamed from: b */
    public static int f24369b = 0;

    /* JADX INFO: renamed from: d */
    public static int f24370d = 0;

    /* JADX INFO: renamed from: f */
    private static long f24371f = 0;

    /* JADX INFO: renamed from: g */
    public static int f24372g = 0;

    /* JADX INFO: renamed from: h */
    private static int f24373h = 0;

    /* JADX INFO: renamed from: i */
    private static char f24374i = 0;

    /* JADX INFO: renamed from: j */
    public static int f24375j = 0;

    /* JADX INFO: renamed from: l */
    private static int f24376l = 0;

    /* JADX INFO: renamed from: m */
    private static int f24377m = 0;

    /* JADX INFO: renamed from: n */
    private static int f24378n = 0;

    /* JADX INFO: renamed from: o */
    private static int f24379o = 0;

    /* JADX INFO: renamed from: c */
    o.ep.d f24380c;

    /* JADX INFO: renamed from: e */
    Date f24381e = new Date();

    /* JADX INFO: renamed from: o.eo.f$2 */
    final class AnonymousClass2 implements b.a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static int f24382a = 0;

        /* JADX INFO: renamed from: b */
        private static int f24383b = 0;

        /* JADX INFO: renamed from: c */
        private static char[] f24384c = null;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ b.d f24386e;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r9, byte r10, short r11) {
            /*
                byte[] r8 = o.eo.f.AnonymousClass2.$$a
                int r0 = r9 * 2
                int r7 = 1 - r0
                int r0 = r11 * 4
                int r0 = r0 + 116
                int r1 = r10 * 2
                int r6 = 3 - r1
                byte[] r5 = new byte[r7]
                r4 = 0
                if (r8 != 0) goto L2c
                r2 = r7
                r3 = r4
            L15:
                int r0 = -r0
                int r0 = r0 + r2
                r2 = r3
            L18:
                int r3 = r2 + 1
                byte r1 = (byte) r0
                r5[r2] = r1
                if (r3 != r7) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L25:
                int r6 = r6 + 1
                r1 = r8[r6]
                r2 = r0
                r0 = r1
                goto L15
            L2c:
                r2 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eo.f.AnonymousClass2.$$c(byte, byte, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f24382a = 0;
            f24383b = 1;
            f24384c = new char[]{56506, 56561, 56553, 56553, 56553, 56552, 56536, 56532, 56555, 56553, 56530, 56530, 56554, 56554, 56530, 56536, 56557, 56560, 56563, 56561, 56558, 56537, 56536, 56558, 56556, 56558, 56555, 56546, 56554, 56560, 56551, 56553, 56547, 56481, 56537, 56558, 56561, 56563, 56560, 56557, 56543, 56548, 56556, 56547, 56548, 56556, 56563, 56521, 56486, 56486, 56506, 56548, 56558, 56555, 56554, 56515, 56521, 56555, 56548, 56548, 56551, 56559, 56557, 56548, 56514, 56513, 56553, 56558, 56561, 56563, 56560, 56557, 56559, 56562, 56555, 56549, 56556, 56555, 56556, 56557, 56516, 56486, 56486, 56519, 56558, 56538, 56534, 56556, 56548, 56547, 56553, 56551, 56560, 56554, 56546, 56555, 56558, 56556, 56558, 56575, 56439, 56433, 56440, 56439, 56440, 56441, 56400, 56370, 56370, 56403, 56442, 56422, 56418, 56440, 56432, 56431, 56437, 56435, 56444, 56438, 56430, 56439, 56442, 56440, 56442, 56420, 56421, 56442, 56445, 56447, 56444, 56441, 56427, 56432, 56440, 56431, 56432, 56440, 56447, 56405, 56370, 56370, 56390, 56432, 56442, 56439, 56438, 56399, 56398, 56432, 56433, 56431, 56439, 56444, 56444, 56406, 56397, 56437, 56442, 56445, 56447, 56444, 56441, 56443, 56564, 56485, 56498, 56485, 56557, 56568, 56554, 56567, 56555, 56554, 56567, 56485, 56498, 56485, 56554, 56567, 56570, 56561, 56558, 56550, 56523, 56561, 56564, 56567, 56569, 56563, 56564, 56520, 56563, 56564, 56558, 56569, 56552, 56550, 56568, 56563, 56550, 56567, 56537, 56569, 56554, 56524, 56563};
        }

        AnonymousClass2(b.d dVar) {
            dVar = dVar;
        }

        private static void f(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
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
            char[] cArr = f24384c;
            long j2 = 0;
            if (cArr != null) {
                int i10 = $11 + 51;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i12 = 0;
                while (i12 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i12])};
                        Object objA = o.d.d.a(-2071388435);
                        if (objA == null) {
                            byte b2 = (byte) i5;
                            byte b3 = b2;
                            objA = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 249, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(i5) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(i5) == j2 ? 0 : -1)) + 11, 1376582792, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr2[i12] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i12++;
                        i5 = 0;
                        j2 = 0;
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
                        int i13 = $10 + 123;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i14 = mVar.f19943d;
                            Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                            Object objA2 = o.d.d.a(120026474);
                            if (objA2 == null) {
                                objA2 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, (char) Color.alpha(0), 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            Object obj = null;
                            cArr4[i14] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                            obj.hashCode();
                            throw null;
                        }
                        int i15 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA3 = o.d.d.a(120026474);
                        if (objA3 == null) {
                            objA3 = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, (char) ExpandableListView.getPackedPositionGroup(0L), 10 - Color.alpha(0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    } else {
                        int i16 = mVar.f19943d;
                        Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA4 = o.d.d.a(1632715197);
                        if (objA4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0') + 837, (char) (27278 - Process.getGidForName("")), 11 - KeyEvent.keyCodeFromString(""), -1210801192, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    }
                    c2 = cArr4[mVar.f19943d];
                    Object[] objArr6 = {mVar, mVar};
                    Object objA5 = o.d.d.a(-1041906996);
                    if (objA5 == null) {
                        objA5 = o.d.d.a(21 - Color.alpha(0), (char) (Color.rgb(0, 0, 0) + 16812931), 11 - (ViewConfiguration.getPressedStateDuration() >> 16), 392175785, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                }
                cArr3 = cArr4;
            }
            if (i9 > 0) {
                char[] cArr5 = new char[i7];
                i2 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i7);
                int i17 = i7 - i9;
                System.arraycopy(cArr5, 0, cArr3, i17, i9);
                System.arraycopy(cArr5, i9, cArr3, 0, i17);
            } else {
                i2 = 0;
            }
            if (z2) {
                char[] cArr6 = new char[i7];
                mVar.f19943d = i2;
                int i18 = $10 + 9;
                $11 = i18 % 128;
                int i19 = 2;
                int i20 = i18 % 2;
                while (mVar.f19943d < i7) {
                    int i21 = $10 + 105;
                    $11 = i21 % 128;
                    if (i21 % i19 == 0) {
                        cArr6[mVar.f19943d] = cArr3[(i7 - mVar.f19943d) >>> 1];
                        i3 = mVar.f19943d >> 1;
                    } else {
                        cArr6[mVar.f19943d] = cArr3[(i7 - mVar.f19943d) - 1];
                        i3 = mVar.f19943d + 1;
                    }
                    mVar.f19943d = i3;
                    i19 = 2;
                }
                cArr3 = cArr6;
            }
            if (i8 > 0) {
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

        static void init$0() {
            $$a = new byte[]{121, -71, 80, 66};
            $$b = 158;
        }

        @Override // o.ao.b.a
        public final void b(o.ar.b bVar) throws Throwable {
            int i2 = 2 % 2;
            List<o.ex.b<?>> arrayList = new ArrayList<>();
            if (f.this.f24380c != null) {
                int i3 = f24383b + 43;
                f24382a = i3 % 128;
                int i4 = i3 % 2;
                if (bVar == null || bVar.d().isEmpty()) {
                    if (o.ea.f.a()) {
                        int i5 = f24382a + 7;
                        f24383b = i5 % 128;
                        int i6 = i5 % 2;
                        Object[] objArr = new Object[1];
                        f("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 33, 0, 0}, true, objArr);
                        String strIntern = ((String) objArr[0]).intern();
                        Object[] objArr2 = new Object[1];
                        f("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{99, 65, 140, 0}, false, objArr2);
                        o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                    }
                    arrayList = f.this.j();
                } else {
                    if (o.ea.f.a()) {
                        Object[] objArr3 = new Object[1];
                        f("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 33, 0, 0}, true, objArr3);
                        String strIntern2 = ((String) objArr3[0]).intern();
                        Object[] objArr4 = new Object[1];
                        f("\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001", new int[]{33, 66, 0, 40}, false, objArr4);
                        o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
                        int i7 = f24382a + 3;
                        f24383b = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    Map<o.ex.c, Object> mapD = bVar.d();
                    for (o.ex.c cVar : o.ex.c.values()) {
                        arrayList.add(new o.ex.b<>(mapD.get(cVar), cVar, Boolean.TRUE, f.this.f24380c));
                    }
                    f.this.d(arrayList, Long.valueOf(new Date().getTime()));
                }
                f fVar = f.this;
                Date dateA = null;
                if (bVar != null) {
                    int i9 = f24383b + 125;
                    f24382a = i9 % 128;
                    if (i9 % 2 != 0) {
                        bVar.a();
                        dateA.hashCode();
                        throw null;
                    }
                    dateA = bVar.a();
                }
                fVar.f24381e = dateA;
                dVar.c(arrayList);
            }
        }

        @Override // o.ao.b.a
        public final void e(o.bg.c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24383b + 3;
            f24382a = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                o.ea.f.a();
                obj.hashCode();
                throw null;
            }
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                f("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 33, 0, 0}, true, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                f(null, new int[]{164, 43, 5, 11}, true, objArr2);
                o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(cVar.a()).toString());
                int i4 = f24382a + 7;
                f24383b = i4 % 128;
                int i5 = i4 % 2;
            }
            dVar.a(o.by.c.b(cVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$f(short r8, byte r9, byte r10) {
        /*
            int r8 = r8 * 3
            int r1 = r8 + 1
            byte[] r7 = o.eo.f.$$d
            int r0 = r10 * 2
            int r6 = 4 - r0
            int r5 = 122 - r9
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r7 != 0) goto L29
            r1 = r6
            r2 = r3
        L13:
            int r5 = r5 + r6
            int r6 = r1 + 1
            r1 = r2
        L17:
            byte r0 = (byte) r5
            r4[r1] = r0
            int r2 = r1 + 1
            if (r1 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            r0 = r7[r6]
            r1 = r6
            r6 = r0
            goto L13
        L29:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eo.f.$$f(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24375j = -1454817644;
        f24372g = 751347484;
        f24369b = -107545399;
        f24370d = -1904593338;
        f24368a = -664373492;
        f24379o = 0;
        f24377m = 1;
        f24376l = 0;
        f24378n = 1;
        h();
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getMinimumFlingVelocity();
        KeyEvent.normalizeMetaState(0);
        ViewConfiguration.getMaximumFlingVelocity();
        TextUtils.getOffsetAfter("", 0);
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getMinimumFlingVelocity();
        ExpandableListView.getPackedPositionType(0L);
        int i2 = f24377m + 91;
        f24379o = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object c(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) throws Throwable {
        o.ef.a aVarB;
        Object obj;
        int i8 = ~i6;
        int i9 = ~((-1) - (((-1) - (~i7)) & ((-1) - i8)));
        int i10 = ~i4;
        int i11 = ~(i8 | i7);
        int i12 = (i10 + i11) - (i10 & i11);
        int i13 = (-1) - (((-1) - i7) & ((-1) - i4));
        int i14 = (i13 + i8) - (i13 & i8);
        int i15 = i4 + i6 + i2 + (1635157569 * i5) + ((-1141649966) * i3);
        int i16 = i15 * i15;
        int i17 = (((-1186836012) * i4) - 711983104) + (488484398 * i6) + (i9 * 1309823443) + (1309823443 * i12) + ((-1309823443) * i14) + (1798307840 * i2) + (1462763520 * i5) + (1566572544 * i3) + (1631846400 * i16);
        int i18 = (i4 * 1521345644) + 2088555610 + (i6 * 1521346098) + (i9 * (-227)) + (i12 * (-227)) + (i14 * 227) + (i2 * 1521345871) + (i5 * (-1382509809)) + (i3 * 37969358) + (i16 * (-671350784));
        if (i17 + (i18 * i18 * (-1069809664)) == 1) {
            return c(objArr);
        }
        f fVar = (f) objArr[0];
        int i19 = 2 % 2;
        int i20 = f24376l + 123;
        f24378n = i20 % 128;
        if (i20 % 2 == 0) {
            aVarB = super.b();
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            Process.getThreadPriority(1);
            Object[] objArr2 = new Object[1];
            p(cNormalizeMetaState, "怘ⴱ⛡ཨ\udb57柯ᜬ橏⺼ガ⏡諝", "쁶ᓣ\u0ad3\uefd6", "뱖葷\uf2e3ᒭ", 0, objArr2);
            obj = objArr2[0];
        } else {
            aVarB = super.b();
            Object[] objArr3 = new Object[1];
            p((char) KeyEvent.normalizeMetaState(0), "怘ⴱ⛡ཨ\udb57柯ᜬ橏⺼ガ⏡諝", "쁶ᓣ\u0ad3\uefd6", "뱖葷\uf2e3ᒭ", (Process.getThreadPriority(0) + 20) >> 6, objArr3);
            obj = objArr3[0];
        }
        aVarB.a(((String) obj).intern(), fVar.f24381e);
        int i21 = f24378n + 19;
        f24376l = i21 % 128;
        int i22 = i21 % 2;
        return aVarB;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        f fVar = (f) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24378n + 79;
        f24376l = i3 % 128;
        if (i3 % 2 != 0) {
            super.d();
            throw null;
        }
        List listD = super.d();
        int i4 = f24378n + 5;
        f24376l = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return listD;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.ef.a d(o.ex.b<?> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eo.f.d(o.ex.b):o.ef.a");
    }

    private o.ex.b<?> d(o.ef.a aVar) throws Throwable {
        Object[] objArr = new Object[1];
        p((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "ᙥ俿躤웼㴙\uf19f낷瘆ꤟ睢❝\ua83aꝪ벛\uf8f8듟嬆琄\uea13\udc6d⡯", "쁶ᓣ\u0ad3\uefd6", "\ue360ￂꄆ࠻", TextUtils.indexOf((CharSequence) "", '0', 0) + 117424868, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        p((char) Color.argb(0, 0, 0, 0), "䐎㛘ർ\ue021愜䫄腨聃牌\ue664鞏捻\uf764\ua97e㭅땬ⱄ䄢빆ޅ", "쁶ᓣ\u0ad3\uefd6", "偌半꼕⍎", ViewConfiguration.getWindowTouchSlop() >> 8, objArr2);
        Object[] objArr3 = {aVar, ((String) objArr2[0]).intern()};
        int i2 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i2;
        o.ex.c cVarValueOf = o.ex.c.valueOf((String) o.ef.a.a(-781664457, objArr3, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i2, Thread.currentThread().getPriority()));
        if (aVar.c(strIntern) == null) {
            return new o.ex.b<>(null, cVarValueOf, Boolean.TRUE, this.f24380c);
        }
        if (cVarValueOf.d() == Boolean.class) {
            return new o.ex.b<>(aVar.h(strIntern), cVarValueOf, Boolean.TRUE, this.f24380c);
        }
        if (cVarValueOf.d() == BigDecimal.class) {
            return new o.ex.b<>(aVar.o(strIntern), cVarValueOf, Boolean.TRUE, this.f24380c);
        }
        if (cVarValueOf.d() == String[].class) {
            return new o.ex.b<>(aVar.r(strIntern), cVarValueOf, Boolean.TRUE, this.f24380c);
        }
        if (cVarValueOf.d() == Integer[].class) {
            return new o.ex.b<>(aVar.u(strIntern), cVarValueOf, Boolean.TRUE, this.f24380c);
        }
        if (cVarValueOf.d() == TimePeriod.class) {
            int i3 = o.ef.a.f23782p * (-1576737484);
            o.ef.a.f23782p = i3;
            return new o.ex.b<>(TimePeriod.getPeriodFromString((String) o.ef.a.a(-781664457, new Object[]{aVar, strIntern}, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i3, Thread.currentThread().getPriority())), cVarValueOf, Boolean.TRUE, this.f24380c);
        }
        if (cVarValueOf.d() != TimeZone.class) {
            Object[] objArr4 = new Object[1];
            p((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 43203), "☥\u0b65뮭ി䢉읫祩陳뷗⥱輫䣦위Ⲻ륯\u0bfc쉿䜁쥿\u0b51蚈澮늧ꃇ⭽뎁\ueb87\uf06cᚍ䛻鰷嘀䶦훇置\u0b64\u20fe费犕ꊿ㚈齩呈\ue94bﳂ", "쁶ᓣ\u0ad3\uefd6", "쵂電쌌直", 211221452 - MotionEvent.axisFromString(""), objArr4);
            throw new o.ef.b(((String) objArr4[0]).intern());
        }
        int i4 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = i4;
        String str = (String) o.ef.a.a(-781664457, new Object[]{aVar, strIntern}, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i4, Thread.currentThread().getPriority());
        return new o.ex.b<>(str.equals("") ? null : TimeZone.getTimeZone(str), cVarValueOf, Boolean.TRUE, this.f24380c);
    }

    static void h() {
        f24371f = -1904689008082713184L;
        f24373h = 1564493270;
        f24374i = (char) 17878;
    }

    static void init$0() {
        $$d = new byte[]{106, 120, -13, -92};
        $$e = 6;
    }

    private static void p(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        Object charArray = str6;
        if (str6 != null) {
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            int i4 = $10 + 83;
            $11 = i4 % 128;
            int i5 = i4 % 2;
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
        int i6 = $11 + 31;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (iVar.f19932b < length3) {
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    objA = o.d.d.a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 105, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 11 - View.resolveSizeAndState(0, 0, 0), -155898465, false, $$f(b2, (byte) ((b2 + 57) - (57 & b2)), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b3 = (byte) 0;
                    objA2 = o.d.d.a(848 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (6488 - KeyEvent.keyCodeFromString("")), 12 - TextUtils.indexOf("", ""), -694521287, false, $$f(b3, (byte) ((b3 + 54) - (54 & b3)), b3), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 458, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 11, 1804962841, false, $$f(b4, (byte) ((b4 + 56) - (56 & b4)), b4), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objA4 = o.d.d.a(638 - TextUtils.lastIndexOf("", '0'), (char) (65100 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getTouchSlop() >> 8) + 12, 1636969060, false, $$f(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f24371f ^ 740602047300126166L)) ^ ((long) ((int) (((long) f24373h) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f24374i) ^ 740602047300126166L))));
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

    public final void a(Context context, String str, b.d<o.ex.b<?>> dVar) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f24378n + 125;
            f24376l = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            p((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\udf91쇺嵜ᑀ盐\ue5a3㇅됶\udfb1她媶颻减\ue716\ued0e\uda38廠勩샒\u192f\ue302\ue41a裪ﯾ㏢멞㱖㬢렌\uec10榚ϳ륀", "쁶ᓣ\u0ad3\uefd6", "\uf1b7\ueb51㋺ҭ", (-85241359) - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((char) Color.red(0), "ꂇᒮ㩴얆뭌֢馏", "쁶ᓣ\u0ad3\uefd6", "䅘巸㰿\u0089", 1063123009 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f24378n + 11;
            f24376l = i5 % 128;
            int i6 = i5 % 2;
        }
        o.en.b bVarC = o.en.b.c();
        this.f24380c = bVarC.g().get(str);
        if (bVarC.s()) {
            new o.ao.b(context, new b.a() { // from class: o.eo.f.2
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: a */
                private static int f24382a = 0;

                /* JADX INFO: renamed from: b */
                private static int f24383b = 0;

                /* JADX INFO: renamed from: c */
                private static char[] f24384c = null;

                /* JADX INFO: renamed from: e */
                private /* synthetic */ b.d f24386e;

                private static String $$c(byte v2, byte v3, short v4) {
                    /*
                        byte[] r8 = o.eo.f.AnonymousClass2.$$a
                        int r0 = r9 * 2
                        int r7 = 1 - r0
                        int r0 = r11 * 4
                        int r0 = r0 + 116
                        int r1 = r10 * 2
                        int r6 = 3 - r1
                        byte[] r5 = new byte[r7]
                        r4 = 0
                        if (r8 != 0) goto L2c
                        r2 = r7
                        r3 = r4
                    L15:
                        int r0 = -r0
                        int r0 = r0 + r2
                        r2 = r3
                    L18:
                        int r3 = r2 + 1
                        byte r1 = (byte) r0
                        r5[r2] = r1
                        if (r3 != r7) goto L25
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r5, r4)
                        return r0
                    L25:
                        int r6 = r6 + 1
                        r1 = r8[r6]
                        r2 = r0
                        r0 = r1
                        goto L15
                    L2c:
                        r2 = r4
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.eo.f.AnonymousClass2.$$c(byte, byte, short):java.lang.String");
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    f24382a = 0;
                    f24383b = 1;
                    f24384c = new char[]{56506, 56561, 56553, 56553, 56553, 56552, 56536, 56532, 56555, 56553, 56530, 56530, 56554, 56554, 56530, 56536, 56557, 56560, 56563, 56561, 56558, 56537, 56536, 56558, 56556, 56558, 56555, 56546, 56554, 56560, 56551, 56553, 56547, 56481, 56537, 56558, 56561, 56563, 56560, 56557, 56543, 56548, 56556, 56547, 56548, 56556, 56563, 56521, 56486, 56486, 56506, 56548, 56558, 56555, 56554, 56515, 56521, 56555, 56548, 56548, 56551, 56559, 56557, 56548, 56514, 56513, 56553, 56558, 56561, 56563, 56560, 56557, 56559, 56562, 56555, 56549, 56556, 56555, 56556, 56557, 56516, 56486, 56486, 56519, 56558, 56538, 56534, 56556, 56548, 56547, 56553, 56551, 56560, 56554, 56546, 56555, 56558, 56556, 56558, 56575, 56439, 56433, 56440, 56439, 56440, 56441, 56400, 56370, 56370, 56403, 56442, 56422, 56418, 56440, 56432, 56431, 56437, 56435, 56444, 56438, 56430, 56439, 56442, 56440, 56442, 56420, 56421, 56442, 56445, 56447, 56444, 56441, 56427, 56432, 56440, 56431, 56432, 56440, 56447, 56405, 56370, 56370, 56390, 56432, 56442, 56439, 56438, 56399, 56398, 56432, 56433, 56431, 56439, 56444, 56444, 56406, 56397, 56437, 56442, 56445, 56447, 56444, 56441, 56443, 56564, 56485, 56498, 56485, 56557, 56568, 56554, 56567, 56555, 56554, 56567, 56485, 56498, 56485, 56554, 56567, 56570, 56561, 56558, 56550, 56523, 56561, 56564, 56567, 56569, 56563, 56564, 56520, 56563, 56564, 56558, 56569, 56552, 56550, 56568, 56563, 56550, 56567, 56537, 56569, 56554, 56524, 56563};
                }

                AnonymousClass2(b.d dVar2) {
                    dVar = dVar2;
                }

                private static void f(String str2, int[] iArr, boolean z2, Object[] objArr3) throws Throwable {
                    int i22;
                    int i32;
                    String str22 = str2;
                    int i42 = 2 % 2;
                    Object bytes = str22;
                    if (str22 != null) {
                        bytes = str22.getBytes("ISO-8859-1");
                    }
                    byte[] bArr = (byte[]) bytes;
                    m mVar = new m();
                    int i52 = 0;
                    int i62 = iArr[0];
                    int i7 = iArr[1];
                    int i8 = iArr[2];
                    int i9 = iArr[3];
                    char[] cArr = f24384c;
                    long j2 = 0;
                    if (cArr != null) {
                        int i10 = $11 + 51;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        int length = cArr.length;
                        char[] cArr2 = new char[length];
                        int i12 = 0;
                        while (i12 < length) {
                            try {
                                Object[] objArr22 = {Integer.valueOf(cArr[i12])};
                                Object objA = o.d.d.a(-2071388435);
                                if (objA == null) {
                                    byte b2 = (byte) i52;
                                    byte b3 = b2;
                                    objA = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 249, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(i52) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(i52) == j2 ? 0 : -1)) + 11, 1376582792, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                cArr2[i12] = ((Character) ((Method) objA).invoke(null, objArr22)).charValue();
                                i12++;
                                i52 = 0;
                                j2 = 0;
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
                    System.arraycopy(cArr, i62, cArr3, 0, i7);
                    if (bArr != null) {
                        char[] cArr4 = new char[i7];
                        mVar.f19943d = 0;
                        char c2 = 0;
                        while (mVar.f19943d < i7) {
                            if (bArr[mVar.f19943d] == 1) {
                                int i13 = $10 + 123;
                                $11 = i13 % 128;
                                if (i13 % 2 == 0) {
                                    int i14 = mVar.f19943d;
                                    Object[] objArr32 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                                    Object objA2 = o.d.d.a(120026474);
                                    if (objA2 == null) {
                                        objA2 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, (char) Color.alpha(0), 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    Object obj = null;
                                    cArr4[i14] = ((Character) ((Method) objA2).invoke(null, objArr32)).charValue();
                                    obj.hashCode();
                                    throw null;
                                }
                                int i15 = mVar.f19943d;
                                Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                                Object objA3 = o.d.d.a(120026474);
                                if (objA3 == null) {
                                    objA3 = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, (char) ExpandableListView.getPackedPositionGroup(0L), 10 - Color.alpha(0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i15] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                            } else {
                                int i16 = mVar.f19943d;
                                Object[] objArr5 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                                Object objA4 = o.d.d.a(1632715197);
                                if (objA4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0') + 837, (char) (27278 - Process.getGidForName("")), 11 - KeyEvent.keyCodeFromString(""), -1210801192, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i16] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                            }
                            c2 = cArr4[mVar.f19943d];
                            Object[] objArr6 = {mVar, mVar};
                            Object objA5 = o.d.d.a(-1041906996);
                            if (objA5 == null) {
                                objA5 = o.d.d.a(21 - Color.alpha(0), (char) (Color.rgb(0, 0, 0) + 16812931), 11 - (ViewConfiguration.getPressedStateDuration() >> 16), 392175785, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA5).invoke(null, objArr6);
                        }
                        cArr3 = cArr4;
                    }
                    if (i9 > 0) {
                        char[] cArr5 = new char[i7];
                        i22 = 0;
                        System.arraycopy(cArr3, 0, cArr5, 0, i7);
                        int i17 = i7 - i9;
                        System.arraycopy(cArr5, 0, cArr3, i17, i9);
                        System.arraycopy(cArr5, i9, cArr3, 0, i17);
                    } else {
                        i22 = 0;
                    }
                    if (z2) {
                        char[] cArr6 = new char[i7];
                        mVar.f19943d = i22;
                        int i18 = $10 + 9;
                        $11 = i18 % 128;
                        int i19 = 2;
                        int i20 = i18 % 2;
                        while (mVar.f19943d < i7) {
                            int i21 = $10 + 105;
                            $11 = i21 % 128;
                            if (i21 % i19 == 0) {
                                cArr6[mVar.f19943d] = cArr3[(i7 - mVar.f19943d) >>> 1];
                                i32 = mVar.f19943d >> 1;
                            } else {
                                cArr6[mVar.f19943d] = cArr3[(i7 - mVar.f19943d) - 1];
                                i32 = mVar.f19943d + 1;
                            }
                            mVar.f19943d = i32;
                            i19 = 2;
                        }
                        cArr3 = cArr6;
                    }
                    if (i8 > 0) {
                        int i222 = 0;
                        while (true) {
                            mVar.f19943d = i222;
                            if (mVar.f19943d >= i7) {
                                break;
                            }
                            cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                            i222 = mVar.f19943d + 1;
                        }
                    }
                    objArr3[0] = new String(cArr3);
                }

                static void init$0() {
                    $$a = new byte[]{121, -71, 80, 66};
                    $$b = 158;
                }

                @Override // o.ao.b.a
                public final void b(o.ar.b bVar) throws Throwable {
                    int i22 = 2 % 2;
                    List<o.ex.b<?>> arrayList = new ArrayList<>();
                    if (f.this.f24380c != null) {
                        int i32 = f24383b + 43;
                        f24382a = i32 % 128;
                        int i42 = i32 % 2;
                        if (bVar == null || bVar.d().isEmpty()) {
                            if (o.ea.f.a()) {
                                int i52 = f24382a + 7;
                                f24383b = i52 % 128;
                                int i62 = i52 % 2;
                                Object[] objArr3 = new Object[1];
                                f("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 33, 0, 0}, true, objArr3);
                                String strIntern2 = ((String) objArr3[0]).intern();
                                Object[] objArr22 = new Object[1];
                                f("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{99, 65, 140, 0}, false, objArr22);
                                o.ea.f.c(strIntern2, ((String) objArr22[0]).intern());
                            }
                            arrayList = f.this.j();
                        } else {
                            if (o.ea.f.a()) {
                                Object[] objArr32 = new Object[1];
                                f("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 33, 0, 0}, true, objArr32);
                                String strIntern22 = ((String) objArr32[0]).intern();
                                Object[] objArr4 = new Object[1];
                                f("\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001", new int[]{33, 66, 0, 40}, false, objArr4);
                                o.ea.f.c(strIntern22, ((String) objArr4[0]).intern());
                                int i7 = f24382a + 3;
                                f24383b = i7 % 128;
                                int i8 = i7 % 2;
                            }
                            Map<o.ex.c, Object> mapD = bVar.d();
                            for (o.ex.c cVar : o.ex.c.values()) {
                                arrayList.add(new o.ex.b<>(mapD.get(cVar), cVar, Boolean.TRUE, f.this.f24380c));
                            }
                            f.this.d(arrayList, Long.valueOf(new Date().getTime()));
                        }
                        f fVar = f.this;
                        Date dateA = null;
                        if (bVar != null) {
                            int i9 = f24383b + 125;
                            f24382a = i9 % 128;
                            if (i9 % 2 != 0) {
                                bVar.a();
                                dateA.hashCode();
                                throw null;
                            }
                            dateA = bVar.a();
                        }
                        fVar.f24381e = dateA;
                        dVar.c(arrayList);
                    }
                }

                @Override // o.ao.b.a
                public final void e(o.bg.c cVar) throws Throwable {
                    int i22 = 2 % 2;
                    int i32 = f24383b + 3;
                    f24382a = i32 % 128;
                    Object obj = null;
                    if (i32 % 2 != 0) {
                        o.ea.f.a();
                        obj.hashCode();
                        throw null;
                    }
                    if (o.ea.f.a()) {
                        Object[] objArr3 = new Object[1];
                        f("\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 33, 0, 0}, true, objArr3);
                        String strIntern2 = ((String) objArr3[0]).intern();
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr22 = new Object[1];
                        f(null, new int[]{164, 43, 5, 11}, true, objArr22);
                        o.ea.f.c(strIntern2, sb.append(((String) objArr22[0]).intern()).append(cVar.a()).toString());
                        int i42 = f24382a + 7;
                        f24383b = i42 % 128;
                        int i52 = i42 % 2;
                    }
                    dVar.a(o.by.c.b(cVar));
                }
            }, o.en.b.c()).a(str);
            return;
        }
        WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
        Object[] objArr3 = new Object[1];
        p((char) (ExpandableListView.getPackedPositionType(0L) + 8779), "ᜀ\uf0f9쿢✬濘铲", "쁶ᓣ\u0ad3\uefd6", "備\u0084䯓锢", View.MeasureSpec.getMode(0), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        p((char) (27600 - TextUtils.getOffsetAfter("", 0)), "䕝爁\uec0d頤㢜ﰫ袌䘳쨐ꖴ\uec75煔侷ⶽ꩓\u0c91\u177d\uf7c0⡻컾姃뱜勉痙찶䈠훎舝\uecc0宭뭟‴䚝脿듞窥訖櫩왌ꟺ郄\uabfe", "쁶ᓣ\u0ad3\uefd6", "떭係퀸㱫", ExpandableListView.getPackedPositionChild(0L) + 1, objArr4);
        throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr4[0]).intern());
    }

    @Override // o.eo.b
    protected final /* synthetic */ o.ex.b<?> b(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24376l + 85;
        f24378n = i3 % 128;
        int i4 = i3 % 2;
        o.ex.b<?> bVarD = d(aVar);
        int i5 = f24376l + 65;
        f24378n = i5 % 128;
        if (i5 % 2 != 0) {
            return bVarD;
        }
        throw null;
    }

    @Override // o.eo.b
    final o.ef.a b() throws o.ef.b {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i2 = f24368a * 443922077;
        f24368a = i2;
        int i3 = f24370d * (-281264671);
        f24370d = i3;
        int i4 = f24369b * 2008826795;
        f24369b = i4;
        return (o.ef.a) c(i2, i4, new Object[]{this}, -828174332, i3, 828174332, iUptimeMillis);
    }

    public final void b(Date date) {
        int i2 = 2 % 2;
        int i3 = f24378n + 107;
        f24376l = i3 % 128;
        if (i3 % 2 == 0) {
            this.f24381e = date;
            return;
        }
        this.f24381e = date;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.eo.b
    public final /* bridge */ /* synthetic */ long c() {
        int i2 = 2 % 2;
        int i3 = f24376l + 65;
        f24378n = i3 % 128;
        if (i3 % 2 == 0) {
            super.c();
            throw null;
        }
        long jC = super.c();
        int i4 = f24376l + 71;
        f24378n = i4 % 128;
        int i5 = i4 % 2;
        return jC;
    }

    @Override // o.eo.b
    final void c(o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24376l + 13;
        f24378n = i3 % 128;
        int i4 = i3 % 2;
        super.c(aVar);
        Object[] objArr = new Object[1];
        p((char) TextUtils.getOffsetBefore("", 0), "怘ⴱ⛡ཨ\udb57柯ᜬ橏⺼ガ⏡諝", "쁶ᓣ\u0ad3\uefd6", "뱖葷\uf2e3ᒭ", ViewConfiguration.getDoubleTapTimeout() >> 16, objArr);
        this.f24381e = aVar.e(((String) objArr[0]).intern(), false);
        int i5 = f24376l + 77;
        f24378n = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.eo.b
    public final /* synthetic */ List<o.ex.b<?>> d() {
        int i2 = f24372g * 1769805705;
        f24372g = i2;
        int i3 = (int) Runtime.getRuntime().totalMemory();
        int iNextInt = new Random().nextInt();
        int i4 = f24375j * (-649624030);
        f24375j = i4;
        return (List) c(i3, i4, new Object[]{this}, -54820160, iNextInt, 54820161, i2);
    }

    @Override // o.eo.b
    protected final /* synthetic */ o.ef.a e(o.ex.b<?> bVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24378n + 115;
        f24376l = i3 % 128;
        Object obj = null;
        o.ex.b<?> bVar2 = bVar;
        if (i3 % 2 != 0) {
            d(bVar2);
            obj.hashCode();
            throw null;
        }
        o.ef.a aVarD = d(bVar2);
        int i4 = f24376l + 81;
        f24378n = i4 % 128;
        if (i4 % 2 != 0) {
            return aVarD;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.eo.b
    public final void e() {
        int i2 = 2 % 2;
        super.e();
        this.f24381e = new Date();
        int i3 = f24378n + 41;
        f24376l = i3 % 128;
        int i4 = i3 % 2;
    }

    public final Date f() {
        Date date;
        int i2 = 2 % 2;
        int i3 = f24378n;
        int i4 = i3 + 109;
        f24376l = i4 % 128;
        if (i4 % 2 != 0) {
            date = this.f24381e;
            int i5 = 88 / 0;
        } else {
            date = this.f24381e;
        }
        int i6 = i3 + 47;
        f24376l = i6 % 128;
        int i7 = i6 % 2;
        return date;
    }

    public final List<o.ex.b<?>> j() {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        arrayList.add(new o.ex.b(null, o.ex.c.f25549d, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25550e, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25546a, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25547b, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25548c, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25553h, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25555j, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25552g, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25554i, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25551f, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25558m, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25556k, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25557l, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25560o, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25559n, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25562q, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25564s, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25565t, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25563r, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25561p, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25570y, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25567v, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25566u, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25569x, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.f25568w, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.B, Boolean.TRUE, this.f24380c));
        arrayList.add(new o.ex.b(null, o.ex.c.A, Boolean.TRUE, this.f24380c));
        int i3 = f24376l + 17;
        f24378n = i3 % 128;
        if (i3 % 2 != 0) {
            return arrayList;
        }
        obj.hashCode();
        throw null;
    }
}
