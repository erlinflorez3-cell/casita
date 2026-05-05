package o.i;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.h;
import o.a.l;
import o.ca.e;
import o.g.a;
import o.g.b;
import o.m.f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f26262b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f26263c = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26264g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26265i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f26266a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f26267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f26268e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, int r9, short r10) {
        /*
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r7 = o.i.c.$$a
            int r0 = r9 * 3
            int r6 = r0 + 4
            int r5 = 111 - r10
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r7 != 0) goto L2b
            r5 = r8
            r2 = r6
            r1 = r3
        L14:
            int r6 = r6 + r5
            int r0 = r2 + 1
            r5 = r6
            r6 = r0
        L19:
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r7[r6]
            r2 = r6
            r6 = r0
            goto L14
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.i.c.$$c(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26265i = 0;
        f26264g = 1;
        f26263c = new char[]{51646, 64517, 64579, 64583, 64597, 64592, 64577, 51642, 51638, 51643, 64576, 64578, 64588, 51639, 64604, 64614, 64593, 64543, 64589, 64590, 64594, 64587, 51640, 64598, 64584, 64586, 64595, 64582, 51645, 51644, 64521, 64585, 64580, 51641, 64599, 64520};
        f26262b = (char) 51641;
    }

    public c(String str, f fVar, boolean z2) {
        this.f26266a = str;
        this.f26267d = fVar;
        this.f26268e = z2;
    }

    private static void f(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        String str2 = str;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i6 = $11 + 37;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f26263c;
        float f2 = 0.0f;
        int i7 = 421932776;
        if (cArr2 != null) {
            int i8 = $10 + 13;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                    Object objA = o.d.d.a(i7);
                    if (objA == null) {
                        int iMyTid = (Process.myTid() >> 22) + 270;
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i11 = 12 - (AudioTrack.getMaxVolume() > f2 ? 1 : (AudioTrack.getMaxVolume() == f2 ? 0 : -1));
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(iMyTid, windowTouchSlop, i11, -811348851, false, $$c(b3, b4, (byte) (9 | b4)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i10++;
                    f2 = 0.0f;
                    i7 = 421932776;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f26262b)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = 11;
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a((-16776946) - Color.rgb(0, 0, 0), (char) KeyEvent.keyCodeFromString(""), 11 - (ViewConfiguration.getJumpTapTimeout() >> 16), -811348851, false, $$c(b5, b6, (byte) (9 | b6)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i4 = i2 - 1;
            cArr4[i4] = (char) (cArr[i4] - b2);
            int i12 = $11 + 33;
            $10 = i12 % 128;
            i3 = 2;
            int i13 = i12 % 2;
        } else {
            i3 = 2;
            i4 = i2;
        }
        if (i4 > 1) {
            int i14 = $11 + 73;
            $10 = i14 % 128;
            int i15 = i14 % i3;
            hVar.f19926b = 0;
            while (hVar.f19926b < i4) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[c2] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 825, (char) Color.blue(0), 11 - TextUtils.getOffsetBefore("", 0), -611683395, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        int i16 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            int iIndexOf = 218 - TextUtils.indexOf("", "", 0);
                            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int i18 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10;
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            String str$$c = $$c(b9, b10, (byte) (b10 + 2));
                            c2 = 11;
                            objA4 = o.d.d.a(iIndexOf, cIndexOf, i18, 212688716, false, str$$c, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = 11;
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i19 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i19];
                    } else {
                        c2 = 11;
                        if (hVar.f19928d == hVar.f19929e) {
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i20 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i21 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i20];
                            cArr4[hVar.f19926b + 1] = cArr2[i21];
                        } else {
                            int i22 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i23 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i22];
                            cArr4[hVar.f19926b + 1] = cArr2[i23];
                        }
                    }
                }
                hVar.f19926b += 2;
                int i24 = $11 + 65;
                $10 = i24 % 128;
                int i25 = i24 % 2;
            }
        }
        int i26 = $11 + 75;
        $10 = i26 % 128;
        int i27 = i26 % 2;
        for (int i28 = 0; i28 < i2; i28++) {
            cArr4[i28] = (char) (cArr4[i28] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void init$0() {
        $$a = new byte[]{Ascii.NAK, 117, 119, 110};
        $$b = 181;
    }

    public final b a(Context context, final d dVar, final a aVar, final e eVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26264g + 3;
        f26265i = i3 % 128;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            String str = this.f26266a;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            f(32 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0001\u001f\u001e\b\u0010!\u000b\u0007\t\u0016\u0011\r! \u0013\u0005\u001f\u0005\u001c!\u000b\u0007\t\u0016\u0011\r! \u0013\u0005\r\u0005", (byte) (TextUtils.getOffsetAfter("", 0) + 65), objArr);
            o.ea.f.c(str, sb.append(((String) objArr[0]).intern()).append(aVar.b().name()).toString());
        }
        o.m.c cVarD = o.m.c.d();
        o.m.h hVarD = cVarD.d(aVar);
        if (hVarD == null) {
            if (o.ea.f.a()) {
                String str2 = this.f26266a;
                Object[] objArr2 = new Object[1];
                f((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31, "\u0001\u001f\u001e\b\u0010!\u000b\u0007\t\u0016\u0011\r! \u0013\u0005\u001f\u0005\u0003\u0017\u0014\u0016\u001a\u0013\u0013\u0003\u001c\u0006\f\u0016\u0018\u0007", (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), objArr2);
                o.ea.f.c(str2, ((String) objArr2[0]).intern());
            }
            b bVar = b.f26183a;
            int i4 = f26264g + 9;
            f26265i = i4 % 128;
            int i5 = i4 % 2;
            return bVar;
        }
        b bVarB = hVarD.b(aVar, this.f26267d, this.f26268e);
        if (bVarB != b.f26186d) {
            int i6 = f26265i + 71;
            f26264g = i6 % 128;
            int i7 = i6 % 2;
            if (o.ea.f.a()) {
                int i8 = f26264g + 115;
                f26265i = i8 % 128;
                int i9 = i8 % 2;
                String str3 = this.f26266a;
                Object[] objArr3 = new Object[1];
                f(54 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0001\u001f\u001e\b\u0010!\u000b\u0007\t\u0016\u0011\r! \u0013\u0005\u001f\u0005\u001c!\u000b\u0007\t\u0016\u0011\r! \u0013\u0005\u000b\u001d#\b\u0007\u0004\u0001\u001a!\u0004\u0012\f\u0007\u000b\u0013\u0003\u0002\u000f\u0000\u0019\u0010\u0016\u0013\u0018㙤", (byte) (102 - (Process.myTid() >> 22)), objArr3);
                o.ea.f.d(str3, ((String) objArr3[0]).intern());
            }
            return bVarB;
        }
        if (o.ea.f.a()) {
            String str4 = this.f26266a;
            Object[] objArr4 = new Object[1];
            f(((Process.getThreadPriority(0) + 20) >> 6) + 53, "\u0001\u001f\u001e\b\u0010!\u000b\u0007\t\u0016\u0011\r! \u0013\u0005\u001f\u0005\u001c!\u000b\u0007\t\u0016\u0011\r! \u0013\u0005\u000b\u001d#\b\u0007\u0004! \u0001\u001f\u0016\b\u0007\u0000\u0002\u000f\u0000\u0019\u0010\u0016\u0013\u0018㙯", (byte) (TextUtils.indexOf("", "", 0) + 113), objArr4);
            o.ea.f.c(str4, ((String) objArr4[0]).intern());
        }
        if (aVar.f() == a.b.f26175c) {
            if (o.ea.f.a()) {
                String str5 = this.f26266a;
                Object[] objArr5 = new Object[1];
                f(69 - View.resolveSize(0, 0), "\u0001\u001f\u001e\b\u0010!\u000b\u0007\t\u0016\u0011\r! \u0013\u0005\u001f\u0005\u000f\u0012\u0016\u0010!\u0016! \u0003\u0019\u0004\u0010\u0007\u000b\u0016\u000f\u000e\u001e#\u0013\u0002\u0005\u001f\u001c\u0018\u000e\u0007\u000b\f\u0000\u0003\u0013\u001f\u0007 \u0002\u001e\r\f\u0012\u0011\u000f\u0003\u0019\u0016\u0006\u0019\u0015\u000f\u0012㘠", (byte) (35 - (ViewConfiguration.getTapTimeout() >> 16)), objArr5);
                o.ea.f.c(str5, ((String) objArr5[0]).intern());
            }
            dVar.b(aVar);
            if (eVar != null) {
                eVar.b(aVar.b());
            }
        } else {
            hVarD.d(context, aVar, new o.j.e() { // from class: o.i.c.3
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int[] f26269a = null;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static int f26270g = 0;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private static int f26271j = 0;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0016). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$c(byte r6, byte r7, short r8) {
                    /*
                        int r0 = r7 * 2
                        int r1 = r0 + 117
                        int r8 = r8 * 4
                        int r3 = r8 + 1
                        byte[] r7 = o.i.c.AnonymousClass3.$$a
                        int r0 = r6 * 2
                        int r2 = 3 - r0
                        byte[] r6 = new byte[r3]
                        r5 = 0
                        if (r7 != 0) goto L2d
                        r0 = r2
                        r3 = r8
                        r4 = r5
                    L16:
                        int r1 = -r2
                        int r1 = r1 + r3
                        r3 = r4
                        r2 = r0
                    L1a:
                        byte r0 = (byte) r1
                        r6[r3] = r0
                        int r0 = r2 + 1
                        int r4 = r3 + 1
                        if (r3 != r8) goto L29
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r6, r5)
                        return r0
                    L29:
                        r2 = r7[r0]
                        r3 = r1
                        goto L16
                    L2d:
                        r3 = r5
                        goto L1a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.i.c.AnonymousClass3.$$c(byte, byte, short):java.lang.String");
                }

                static {
                    init$0();
                    $10 = 0;
                    $11 = 1;
                    f26271j = 0;
                    f26270g = 1;
                    f26269a = new int[]{515612893, -1259955956, 855268091, 770204585, 705501138, 1174653365, 704478229, -1117126992, 2140062768, -240439692, 1047558768, 1729231980, -225462830, -75777915, 720381135, -2061678579, 1597746682, 1649735520};
                }

                private static void f(int[] iArr, int i10, Object[] objArr6) throws Throwable {
                    int length;
                    int[] iArr2;
                    int i11 = 2 % 2;
                    l lVar = new l();
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length * 2];
                    int[] iArr3 = f26269a;
                    int i12 = 989264422;
                    long j2 = 0;
                    int i13 = 0;
                    if (iArr3 != null) {
                        int i14 = $10 + 61;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            length = iArr3.length;
                            iArr2 = new int[length];
                        } else {
                            length = iArr3.length;
                            iArr2 = new int[length];
                        }
                        int i15 = 0;
                        while (i15 < length) {
                            try {
                                Object[] objArr7 = {Integer.valueOf(iArr3[i15])};
                                Object objA = o.d.d.a(i12);
                                if (objA == null) {
                                    int packedPositionChild = 674 - ExpandableListView.getPackedPositionChild(j2);
                                    char gidForName = (char) (Process.getGidForName("") + 1);
                                    int iResolveSize = 12 - View.resolveSize(i13, i13);
                                    byte b2 = (byte) i13;
                                    byte b3 = (byte) (b2 + 2);
                                    objA = o.d.d.a(packedPositionChild, gidForName, iResolveSize, -328001469, false, $$c(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                                }
                                iArr2[i15] = ((Integer) ((Method) objA).invoke(null, objArr7)).intValue();
                                i15++;
                                i12 = 989264422;
                                j2 = 0;
                                i13 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        iArr3 = iArr2;
                    }
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    int[] iArr5 = f26269a;
                    double d2 = 0.0d;
                    if (iArr5 != null) {
                        int length3 = iArr5.length;
                        int[] iArr6 = new int[length3];
                        int i16 = $11 + 63;
                        $10 = i16 % 128;
                        int i17 = 2;
                        int i18 = i16 % 2;
                        int i19 = 0;
                        while (i19 < length3) {
                            int i20 = $10 + 59;
                            $11 = i20 % 128;
                            int i21 = i20 % i17;
                            Object[] objArr8 = {Integer.valueOf(iArr5[i19])};
                            Object objA2 = o.d.d.a(989264422);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = (byte) (b4 + 2);
                                objA2 = o.d.d.a(675 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d2 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d2 ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 12 - (ViewConfiguration.getFadingEdgeLength() >> 16), -328001469, false, $$c(b4, b5, (byte) (b5 - 2)), new Class[]{Integer.TYPE});
                            }
                            iArr6[i19] = ((Integer) ((Method) objA2).invoke(null, objArr8)).intValue();
                            i19++;
                            d2 = 0.0d;
                            i17 = 2;
                        }
                        iArr5 = iArr6;
                    }
                    System.arraycopy(iArr5, 0, iArr4, 0, length2);
                    lVar.f19941d = 0;
                    while (lVar.f19941d < iArr.length) {
                        int i22 = $11 + 109;
                        $10 = i22 % 128;
                        int i23 = i22 % 2;
                        cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                        cArr[1] = (char) iArr[lVar.f19941d];
                        cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                        cArr[3] = (char) iArr[lVar.f19941d + 1];
                        lVar.f19942e = (cArr[0] << 16) + cArr[1];
                        lVar.f19940a = (cArr[2] << 16) + cArr[3];
                        l.a(iArr4);
                        int i24 = 0;
                        for (int i25 = 16; i24 < i25; i25 = 16) {
                            lVar.f19942e ^= iArr4[i24];
                            Object[] objArr9 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                            Object objA3 = o.d.d.a(2098218801);
                            if (objA3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 1);
                                objA3 = o.d.d.a(301 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 52696), KeyEvent.getDeadChar(0, 0) + 11, -1416256172, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr9)).intValue();
                            lVar.f19942e = lVar.f19940a;
                            lVar.f19940a = iIntValue;
                            i24++;
                        }
                        int i26 = lVar.f19942e;
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = i26;
                        lVar.f19940a ^= iArr4[16];
                        lVar.f19942e ^= iArr4[17];
                        int i27 = lVar.f19942e;
                        int i28 = lVar.f19940a;
                        cArr[0] = (char) (lVar.f19942e >>> 16);
                        cArr[1] = (char) lVar.f19942e;
                        cArr[2] = (char) (lVar.f19940a >>> 16);
                        cArr[3] = (char) lVar.f19940a;
                        l.a(iArr4);
                        cArr2[lVar.f19941d * 2] = cArr[0];
                        cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                        cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                        cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                        Object[] objArr10 = {lVar, lVar};
                        Object objA4 = o.d.d.a(986820978);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objA4 = o.d.d.a(KeyEvent.keyCodeFromString("") + 229, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 51004), 10 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -330018025, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA4).invoke(null, objArr10);
                    }
                    String str6 = new String(cArr2, 0, i10);
                    int i29 = $11 + 57;
                    $10 = i29 % 128;
                    int i30 = i29 % 2;
                    objArr6[0] = str6;
                }

                static void init$0() {
                    $$a = new byte[]{92, 54, -72, -111};
                    $$b = 247;
                }

                @Override // o.j.e
                public final void b(o.j.b bVar2) throws Throwable {
                    int i10 = 2 % 2;
                    if (o.ea.f.a()) {
                        String str6 = c.this.f26266a;
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr6 = new Object[1];
                        f(new int[]{-1668716225, -1443112177, 1503764619, -1102168664, -294557528, 648187792, 655270729, -1052883391, 780363104, 78650599, 2068414432, 209931388, 1315577351, 459369042, -2097744981, -921874800, -51074085, 2084715628, 688873115, 787227307, 1166385141, -1132123939, 638424707, 1062248945}, (ViewConfiguration.getEdgeSlop() >> 16) + 48, objArr6);
                        o.ea.f.c(str6, sb2.append(((String) objArr6[0]).intern()).append(bVar2.name()).toString());
                    }
                    e eVar2 = eVar;
                    if (eVar2 != null) {
                        int i11 = f26270g + 33;
                        f26271j = i11 % 128;
                        int i12 = i11 % 2;
                        eVar2.d(aVar.b(), bVar2);
                    }
                    int i13 = f26271j + 121;
                    f26270g = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                }

                @Override // o.j.e
                public final void c(a aVar2) throws Throwable {
                    int i10 = 2 % 2;
                    if (o.ea.f.a()) {
                        int i11 = f26271j + 85;
                        f26270g = i11 % 128;
                        int i12 = i11 % 2;
                        String str6 = c.this.f26266a;
                        Object[] objArr6 = new Object[1];
                        f(new int[]{-1668716225, -1443112177, 1503764619, -1102168664, -294557528, 648187792, 655270729, -1052883391, 780363104, 78650599, 2068414432, 209931388, 1315577351, 459369042, 333841406, -347245655, -1798593802, 1584845746, 833508771, -1217554778, -1485095960, 1161811562, -1967341111, -943190767, 95080860, -1675356311, 1910792181, -281086896, -1668350880, -895931428, -348551128, -848001039, 590406174, -613756789, 1446161476, 1194658692, 277167898, 432811933, 652501715, 1720636842}, TextUtils.indexOf("", "") + 79, objArr6);
                        o.ea.f.c(str6, ((String) objArr6[0]).intern());
                    }
                    dVar.b(aVar2);
                    e eVar2 = eVar;
                    if (eVar2 != null) {
                        int i13 = f26270g + 87;
                        f26271j = i13 % 128;
                        if (i13 % 2 == 0) {
                            eVar2.b(aVar2.b());
                        } else {
                            eVar2.b(aVar2.b());
                            throw null;
                        }
                    }
                }
            }, new o.m.a(cVarD, aVar.b()), this.f26268e);
        }
        return bVarB;
    }

    protected final Object clone() throws CloneNotSupportedException {
        int i2 = 2 % 2;
        throw new CloneNotSupportedException();
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f26264g + 77;
        f26265i = i3 % 128;
        int i4 = i3 % 2;
        boolean zEquals = super.equals(obj);
        int i5 = f26265i + 95;
        f26264g = i5 % 128;
        int i6 = i5 % 2;
        return zEquals;
    }

    protected final void finalize() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26264g + 93;
        f26265i = i3 % 128;
        int i4 = i3 % 2;
        super.finalize();
        int i5 = f26264g + 111;
        f26265i = i5 % 128;
        int i6 = i5 % 2;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f26264g + 13;
        f26265i = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = super.hashCode();
        int i5 = f26264g + 61;
        f26265i = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        String string;
        int i2 = 2 % 2;
        int i3 = f26264g + 75;
        f26265i = i3 % 128;
        if (i3 % 2 != 0) {
            string = super.toString();
            int i4 = 56 / 0;
        } else {
            string = super.toString();
        }
        int i5 = f26264g + 39;
        f26265i = i5 % 128;
        if (i5 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
