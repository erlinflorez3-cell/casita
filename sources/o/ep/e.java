package o.ep;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Objects;
import o.a.j;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f24487a = 0;

    /* JADX INFO: renamed from: b */
    public static int f24488b = 0;

    /* JADX INFO: renamed from: e */
    public static int f24489e = 0;

    /* JADX INFO: renamed from: k */
    private static byte[] f24490k = null;

    /* JADX INFO: renamed from: m */
    private static int f24491m = 0;

    /* JADX INFO: renamed from: n */
    private static int f24492n = 0;

    /* JADX INFO: renamed from: o */
    private static int f24493o = 0;

    /* JADX INFO: renamed from: p */
    private static int f24494p = 0;

    /* JADX INFO: renamed from: q */
    public static int f24495q = 0;

    /* JADX INFO: renamed from: r */
    public static int f24496r = 0;

    /* JADX INFO: renamed from: s */
    private static short[] f24497s = null;

    /* JADX INFO: renamed from: t */
    private static int f24498t = 0;

    /* JADX INFO: renamed from: u */
    public static int f24499u = 0;

    /* JADX INFO: renamed from: v */
    public static int f24500v = 0;

    /* JADX INFO: renamed from: w */
    public static int f24501w = 0;

    /* JADX INFO: renamed from: c */
    private final String f24502c;

    /* JADX INFO: renamed from: d */
    private final String f24503d;

    /* JADX INFO: renamed from: f */
    private final String f24504f;

    /* JADX INFO: renamed from: g */
    private final o.dx.d f24505g;

    /* JADX INFO: renamed from: h */
    private final String f24506h;

    /* JADX INFO: renamed from: i */
    private final String f24507i;

    /* JADX INFO: renamed from: j */
    private final String f24508j;

    /* JADX INFO: renamed from: l */
    private b f24509l;

    private static String $$e(short s2, short s3, byte b2) {
        int i2 = s3 * 3;
        int i3 = 104 - b2;
        byte[] bArr = $$c;
        int i4 = 3 - (s2 * 2);
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + (-i3);
            i4 = i4;
        }
        while (true) {
            i5++;
            int i6 = i4 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i6];
            i4 = i6;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f24501w = -323826722;
        f24500v = -224002724;
        f24499u = 283667201;
        f24496r = -33807223;
        f24495q = 488225490;
        init$0();
        f24487a = 1153328389;
        f24489e = -940555189;
        f24488b = -771788231;
        f24498t = 0;
        f24494p = 1;
        f24492n = 317470744;
        f24491m = 1150422425;
        f24493o = 1064149765;
        f24490k = new byte[]{-114, 113, -98, 124, -117, 114, -95, -104, 55, -117, -124, 124, -117, 114, -127, -72, 71, 118, 119, 112, -125, 123, -128, 115, -124, 117, -88, 86, 114, -117, 120, -98, 115, 119, 112, 113, -115, -94, 64, -126, 115, -125, -124, 117, -88, 86, 114, -117, 120, -98, 115, 119, 112, 113, -115, -94, -98, 76, 112, MessagePack.Code.UINT64, 55, -117, -124, 124, -117, 114, -127, -72, 71, 118, 119, 112, -125, 123, -128, 124, -127, -117, 120, -117, -123, 124, MessagePack.Code.EXT32, 68, 116, -121, -116, 119, -115, 127, -98, 112, -116, -70, 68, 116, 114, -115, -80, 54, -122, 118, -120, -73, 65, 98, -126, -69, 116, 116, -121, -116, 119, -115, 127, -98, 112, -116, -69, 50, 112, 96};
    }

    public e(String str, String str2, String str3, o.dx.d dVar, String str4, String str5, String str6, b bVar) {
        this.f24502c = str;
        this.f24503d = str2;
        this.f24508j = str3;
        this.f24505g = dVar;
        this.f24506h = str4;
        this.f24504f = str5;
        this.f24507i = str6;
        this.f24509l = bVar;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24494p;
        int i4 = i3 + 75;
        f24498t = i4 % 128;
        int i5 = i4 % 2;
        b bVar = eVar.f24509l;
        int i6 = i3 + 7;
        f24498t = i6 % 128;
        if (i6 % 2 == 0) {
            return bVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0328  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] d(android.content.Context r25, int r26, int r27, int r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.e.d(android.content.Context, int, int, int):java.lang.Object[]");
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~(i7 | i3);
        int i9 = ~((-1) - (((-1) - i3) & ((-1) - i4)));
        int i10 = (-1) - (((-1) - i8) & ((-1) - i9));
        int i11 = ~i7;
        int i12 = ~i3;
        int i13 = ~((i11 + i12) - (i11 & i12));
        int i14 = ~(i11 | i4);
        int i15 = (i14 + i13) - (i14 & i13);
        int i16 = ~((i12 + i4) - (i12 & i4));
        int i17 = ~i4;
        int i18 = (-1) - (((-1) - i17) & ((-1) - i7));
        int i19 = (-1) - (((-1) - ((i15 + i16) - (i15 & i16))) & ((-1) - (~((i18 + i3) - (i18 & i3)))));
        int i20 = (-1) - (((-1) - (~((i17 + i12) - (i17 & i12)))) & ((-1) - i7));
        int i21 = (i20 + i9) - (i20 & i9);
        int i22 = i7 + i3 + i2 + (1962400304 * i5) + (1167700406 * i6);
        int i23 = i22 * i22;
        int i24 = ((i7 * (-1019457937)) - 559939584) + ((-1019457937) * i3) + (2001489518 * i10) + (i19 * (-2001489518)) + ((-2001489518) * i21) + (1274019840 * i2) + ((-1660944384) * i5) + ((-325058560) * i6) + (867827712 * i23);
        int i25 = ((i7 * (-1629562239)) - 1134582380) + (i3 * (-1629562239)) + (i10 * (-910)) + (i19 * 910) + (i21 * 910) + (i2 * (-1629561329)) + (i5 * (-1621399344)) + (i6 * (-873382486)) + (i23 * 1407582208);
        return i24 + ((i25 * i25) * (-1895432192)) != 1 ? e(objArr) : b(objArr);
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24494p + 79;
        f24498t = i3 % 128;
        int i4 = i3 % 2;
        String str = eVar.f24503d;
        if (i4 == 0) {
            return str;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{68, -115, MessagePack.Code.BIN16, -123};
        $$b = 90;
    }

    static void init$1() {
        $$c = new byte[]{37, Ascii.SUB, MessagePack.Code.FLOAT32, 10};
        $$d = 117;
    }

    private static void x(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        long j2;
        int i5;
        int i6 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f24491m)};
            Object objA = o.d.d.a(-727631768);
            long j3 = 0;
            if (objA == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objA = o.d.d.a(239 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (44531 - Color.green(0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, 35969549, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = f24490k;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA2 = o.d.d.a(629 - (ViewConfiguration.getGlobalActionKeyTimeout() > j3 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j3 ? 0 : -1)), (char) (28649 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Color.green(0) + 11, 1621469864, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        i7++;
                        j3 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i8 = $11 + 57;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    byte[] bArr3 = f24490k;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f24492n)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a(238 - KeyEvent.normalizeMetaState(0), (char) (44532 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 11 - View.MeasureSpec.makeMeasureSpec(0, 0), 35969549, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f24491m) ^ (-7649639543924978291L))));
                    j2 = -7649639543924978291L;
                } else {
                    j2 = -7649639543924978291L;
                    iIntValue = (short) (((short) (((long) f24497s[i2 + ((int) (((long) f24492n) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f24491m) ^ (-7649639543924978291L))));
                }
            } else {
                j2 = -7649639543924978291L;
            }
            if (iIntValue > 0) {
                int i10 = ((i2 + iIntValue) - 2) + ((int) (((long) f24492n) ^ j2));
                if (z2) {
                    int i11 = $11 + 99;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i5 = 1;
                } else {
                    int i13 = $10 + 99;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    i5 = 0;
                }
                jVar.f19936d = i10 + i5;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f24493o), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a((-1) - ExpandableListView.getPackedPositionChild(0L), (char) (TextUtils.indexOf((CharSequence) "", '0') + 5359), (ViewConfiguration.getTouchSlop() >> 8) + 11, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f24490k;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i15 = 0; i15 < length2; i15++) {
                        int i16 = $11 + 41;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        bArr5[i15] = (byte) (((long) bArr4[i15]) ^ (-7649639543924978291L));
                    }
                    bArr4 = bArr5;
                }
                boolean z3 = bArr4 != null;
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z3) {
                        byte[] bArr6 = f24490k;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f24497s;
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void y(short r8, int r9, byte r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 4
            int r8 = 3 - r0
            int r0 = r9 + 97
            int r7 = r10 * 2
            int r1 = r7 + 1
            byte[] r6 = o.ep.e.$$a
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r6 != 0) goto L2b
            r3 = r7
            r2 = r4
        L13:
            int r0 = -r0
            int r0 = r0 + r3
        L15:
            byte r1 = (byte) r0
            int r8 = r8 + 1
            r5[r2] = r1
            if (r2 != r7) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r11[r4] = r0
            return
        L24:
            int r2 = r2 + 1
            r1 = r6[r8]
            r3 = r0
            r0 = r1
            goto L13
        L2b:
            r2 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.e.y(short, int, byte, java.lang.Object[]):void");
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f24494p;
        int i4 = i3 + 87;
        f24498t = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f24506h;
        int i6 = i3 + 9;
        f24498t = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final o.dx.d b() {
        int i2 = 2 % 2;
        int i3 = f24494p + 3;
        int i4 = i3 % 128;
        f24498t = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        o.dx.d dVar = this.f24505g;
        int i5 = i4 + 9;
        f24494p = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }

    public final String c() {
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int iMyUid = Process.myUid();
        int i2 = 748890590 * f24488b;
        f24488b = i2;
        return (String) e(iMaxMemory, -1669259846, iFreeMemory, new Object[]{this}, iMyUid, i2, 1669259846);
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f24494p;
        int i4 = i3 + 13;
        f24498t = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f24508j;
        int i6 = i3 + 123;
        f24498t = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final void d(b bVar) {
        int i2 = 2 % 2;
        int i3 = f24498t;
        int i4 = i3 + 47;
        f24494p = i4 % 128;
        int i5 = i4 % 2;
        this.f24509l = bVar;
        int i6 = i3 + 107;
        f24494p = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f24498t;
        int i4 = i3 + 7;
        f24494p = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f24502c;
        int i6 = i3 + 97;
        f24494p = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f24494p + 51;
        int i4 = i3 % 128;
        f24498t = i4;
        int i5 = i3 % 2;
        if (!(obj instanceof e)) {
            int i6 = i4 + 37;
            f24494p = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 6 / 0;
            }
            return false;
        }
        e eVar = (e) obj;
        if (Objects.equals(this.f24502c, eVar.e())) {
            String str = this.f24503d;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int iMyUid = Process.myUid();
            int i8 = f24488b * 748890590;
            f24488b = i8;
            if (Objects.equals(str, (String) e(iMaxMemory, -1669259846, iFreeMemory, new Object[]{eVar}, iMyUid, i8, 1669259846)) && Objects.equals(this.f24508j, eVar.d())) {
                int i9 = f24494p + 47;
                f24498t = i9 % 128;
                int i10 = i9 % 2;
                if (Objects.equals(this.f24505g, eVar.b())) {
                    int i11 = f24498t + 29;
                    f24494p = i11 % 128;
                    if (i11 % 2 == 0) {
                        Objects.equals(this.f24506h, eVar.a());
                        throw null;
                    }
                    if (Objects.equals(this.f24506h, eVar.a()) && Objects.equals(this.f24504f, eVar.g()) && Objects.equals(this.f24507i, eVar.j())) {
                        b bVar = this.f24509l;
                        int iMyUid2 = Process.myUid();
                        int i12 = (-1370859174) * f24489e;
                        f24489e = i12;
                        int i13 = f24487a * (-1102038409);
                        f24487a = i13;
                        if (Objects.equals(bVar, (b) e(i12, 17017849, iMyUid2, new Object[]{eVar}, i13, (int) Runtime.getRuntime().totalMemory(), -17017848))) {
                            int i14 = f24498t + 105;
                            f24494p = i14 % 128;
                            int i15 = i14 % 2;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String g() {
        int i2 = 2 % 2;
        int i3 = f24494p + 105;
        int i4 = i3 % 128;
        f24498t = i4;
        int i5 = i3 % 2;
        String str = this.f24504f;
        int i6 = i4 + 31;
        f24494p = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f24498t + 103;
        f24494p = i3 % 128;
        int i4 = i3 % 2;
        int iHash = Objects.hash(this.f24502c, this.f24503d, this.f24508j, this.f24505g, this.f24506h, this.f24504f, this.f24507i, this.f24509l);
        int i5 = f24494p + 7;
        f24498t = i5 % 128;
        if (i5 % 2 == 0) {
            return iHash;
        }
        throw null;
    }

    public final b i() {
        int iMyUid = Process.myUid();
        int i2 = f24489e * (-1370859174);
        f24489e = i2;
        int i3 = (-1102038409) * f24487a;
        f24487a = i3;
        return (b) e(i2, 17017849, iMyUid, new Object[]{this}, i3, (int) Runtime.getRuntime().totalMemory(), -17017848);
    }

    public final String j() {
        int i2 = 2 % 2;
        int i3 = f24494p + 15;
        f24498t = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f24507i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
