package o.dx;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.l;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements b<o.dy.c, o.dv.d, o.dz.d, Drawable> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23407a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23408b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f23409c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23410d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f23411f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o.dv.d f23412e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, byte r10, short r11) {
        /*
            int r0 = r11 * 2
            int r8 = r0 + 4
            int r7 = r10 * 2
            int r1 = r7 + 1
            byte[] r6 = o.dx.d.$$a
            int r0 = r9 * 2
            int r5 = 121 - r0
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r6 != 0) goto L2a
            r0 = r7
            r2 = r3
        L15:
            int r0 = -r0
            int r5 = r5 + r0
            int r8 = r8 + 1
            r1 = r2
        L1a:
            byte r0 = (byte) r5
            r4[r1] = r0
            int r2 = r1 + 1
            if (r1 != r7) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r0 = r6[r8]
            goto L15
        L2a:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dx.d.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23407a = 0;
        f23411f = 1;
        f23410d = 0;
        f23408b = 1;
        b();
        ExpandableListView.getPackedPositionForGroup(0);
        int i2 = f23407a + 5;
        f23411f = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public d(String str) {
        this.f23412e = new o.dv.d(str);
    }

    static void b() {
        f23409c = new int[]{-803040463, 78186168, 1043525156, -377407157, 538506124, 865972296, -1084288483, -1344927451, -2044265016, 469454426, 1420097057, -915751233, -971563862, -1632367762, 992677547, -1233184773, 1961828542, 402183230};
    }

    private static o.dy.c f() {
        int i2 = 2 % 2;
        int i3 = f23408b + 67;
        f23410d = i3 % 128;
        if (i3 % 2 != 0) {
            o.dy.c cVar = o.dy.c.f23451d;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.dy.c cVar2 = o.dy.c.f23451d;
        int i4 = f23408b + 45;
        f23410d = i4 % 128;
        int i5 = i4 % 2;
        return cVar2;
    }

    private static void g(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f23409c;
        char c2 = '0';
        int i6 = 989264422;
        int i7 = 0;
        if (iArr3 != null) {
            int i8 = $10 + 29;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i9 = $10 + 89;
                $11 = i9 % 128;
                if (i9 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                        Object objA = o.d.d.a(i6);
                        if (objA == null) {
                            byte b2 = (byte) i7;
                            byte b3 = b2;
                            objA = o.d.d.a(675 - View.MeasureSpec.makeMeasureSpec(i7, i7), (char) ((-1) - TextUtils.lastIndexOf("", c2, i7, i7)), (ViewConfiguration.getTouchSlop() >> 8) + 12, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr2[i3] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i3--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i3])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(((Process.getThreadPriority(0) + 20) >> 6) + 675, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 12 - TextUtils.getCapsMode("", 0, 0), -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i3++;
                }
                i4 = 2;
                c2 = '0';
                i6 = 989264422;
                i7 = 0;
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f23409c;
        long j2 = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $11 + 53;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(676 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -328001469, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    i10 /= 0;
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i10])};
                    Object objA4 = o.d.d.a(989264422);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA4 = o.d.d.a(675 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 13, -328001469, false, $$c(b8, b9, b9), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    i10++;
                }
                j2 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            int i12 = $11 + 113;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                int i16 = $11 + 107;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                lVar.f19942e ^= iArr4[i14];
                Object[] objArr6 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA5 = o.d.d.a(2098218801);
                if (objA5 == null) {
                    byte b10 = (byte) 1;
                    byte b11 = (byte) (b10 - 1);
                    objA5 = o.d.d.a(300 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (52697 - View.MeasureSpec.getMode(0)), TextUtils.lastIndexOf("", '0', 0, 0) + 12, -1416256172, false, $$c(b10, b11, b11), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i14++;
            }
            int i18 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i18;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i19 = lVar.f19942e;
            int i20 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr7 = {lVar, lVar};
            Object objA6 = o.d.d.a(986820978);
            if (objA6 == null) {
                byte b12 = (byte) 2;
                byte b13 = (byte) (b12 - 2);
                objA6 = o.d.d.a(229 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (TextUtils.getOffsetAfter("", 0) + 51004), 10 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -330018025, false, $$c(b12, b13, b13), new Class[]{Object.class, Object.class});
            }
            ((Method) objA6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static o.dz.d h() {
        int i2 = 2 % 2;
        int i3 = f23408b + 67;
        f23410d = i3 % 128;
        int i4 = i3 % 2;
        o.dz.d dVar = o.dz.d.f23474e;
        if (i4 != 0) {
            int i5 = 66 / 0;
        }
        return dVar;
    }

    static void init$0() {
        $$a = new byte[]{7, -110, 9, 72};
        $$b = PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
    }

    private o.dv.d j() {
        int i2 = 2 % 2;
        int i3 = f23410d + 41;
        f23408b = i3 % 128;
        int i4 = i3 % 2;
        o.dv.d dVar = this.f23412e;
        if (i4 == 0) {
            int i5 = 41 / 0;
        }
        return dVar;
    }

    @Override // o.dx.b
    public final /* synthetic */ o.dz.c a() {
        int i2 = 2 % 2;
        int i3 = f23410d + 35;
        f23408b = i3 % 128;
        int i4 = i3 % 2;
        o.dz.d dVarH = h();
        int i5 = f23408b + 33;
        f23410d = i5 % 128;
        int i6 = i5 % 2;
        return dVarH;
    }

    @Override // o.dx.b
    public final String c() {
        int i2 = 2 % 2;
        int i3 = f23410d + 33;
        int i4 = i3 % 128;
        f23408b = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 51;
        f23410d = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // o.dx.b
    public final /* synthetic */ o.dv.c d() {
        int i2 = 2 % 2;
        int i3 = f23410d + 73;
        f23408b = i3 % 128;
        int i4 = i3 % 2;
        o.dv.d dVarJ = j();
        int i5 = f23410d + 97;
        f23408b = i5 % 128;
        if (i5 % 2 != 0) {
            return dVarJ;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.dx.b
    public final /* synthetic */ o.dy.d e() {
        int i2 = 2 % 2;
        int i3 = f23410d + 75;
        f23408b = i3 % 128;
        int i4 = i3 % 2;
        o.dy.c cVarF = f();
        int i5 = f23410d + 25;
        f23408b = i5 % 128;
        if (i5 % 2 != 0) {
            return cVarF;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23410d + 33;
        int i4 = i3 % 128;
        f23408b = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        int i6 = i4 + 29;
        f23410d = i6 % 128;
        int i7 = i6 % 2;
        if (getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f23412e, ((d) obj).f23412e);
    }

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        g(new int[]{966291245, 632208624, 229352620, -185205583, -675442509, -391355520, 905969011, 1970993259, -678332945, -828749288, -1409201831, -989052313, -142665973, 1404842490, 766389467, 1373779071}, 30 - ExpandableListView.getPackedPositionType(0L), objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(f().toString());
        Object[] objArr2 = new Object[1];
        g(new int[]{1716893249, 1596639948, -1526597219, 289372006, -2101559282, 1271036883}, 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr2[0]).intern()).append(j().toString());
        Object[] objArr3 = new Object[1];
        g(new int[]{1716893249, 1596639948, -1657907055, 576864353, 1364514004, 1385887986, 166382323, 801537100}, 13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
        String string = sbAppend2.append(((String) objArr3[0]).intern()).append(h().toString()).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f23410d + 111;
        f23408b = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }
}
