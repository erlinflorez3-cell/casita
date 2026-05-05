package com.incode.welcome_sdk.data;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.c.a.l;
import com.drew.metadata.exif.makernotes.SanyoMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntriesKt;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ b[] f7595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f7596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f7597c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f7598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f7599f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static byte[] f7600g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f7601h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static short[] f7602i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f7603j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f7604k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f7605l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f7606m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f7607o = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7608d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, int r10, int r11) {
        /*
            byte[] r8 = com.incode.welcome_sdk.data.b.$$a
            int r7 = 68 - r11
            int r2 = r10 * 3
            int r0 = 1 - r2
            int r1 = r9 + 4
            byte[] r6 = new byte[r0]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2a
            r2 = r5
            r0 = r1
        L13:
            int r1 = -r1
            int r1 = r1 + r7
            r3 = r2
            r7 = r1
            r1 = r0
        L18:
            byte r2 = (byte) r7
            int r0 = r1 + 1
            r6[r3] = r2
            int r2 = r3 + 1
            if (r3 != r4) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L27:
            r1 = r8[r0]
            goto L13
        L2a:
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.b.$$c(short, int, int):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{125, 126, MessagePack.Code.INT64, -128};
        $$b = 123;
    }

    private b(String str, int i2, String str2) {
        this.f7608d = str2;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f7606m;
        int i4 = i3 + 45;
        f7607o = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f7608d;
        int i6 = i3 + 83;
        f7607o = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f7604k = 0;
        f7605l = 1;
        f7606m = 0;
        f7607o = 1;
        d();
        f7597c = new b("FRONT_ID_SCAN", 0, "frontId");
        f7596b = new b("BACK_ID_SCAN", 1, "backId");
        Object[] objArr = new Object[1];
        n(425284367 - ExpandableListView.getPackedPositionChild(0L), (byte) ((-102) - (ViewConfiguration.getLongPressTimeout() >> 16)), (short) (TextUtils.getCapsMode("", 0, 0) - 95), TextUtils.lastIndexOf("", '0', 0, 0) - 1904434000, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 41, objArr);
        f7598e = new b("SELFIE_SCAN", 2, ((String) objArr[0]).intern());
        b[] bVarArrB = b();
        f7595a = bVarArrB;
        EnumEntriesKt.enumEntries(bVarArrB);
        int i2 = f7605l + 105;
        f7604k = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void n(int i2, byte b2, short s2, int i3, int i4, Object[] objArr) throws Throwable {
        long j2;
        int i5 = 2 % 2;
        l lVar = new l();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f7599f)};
            Object objC = com.c.a.e.e.c(1394921452);
            int i6 = -1;
            if (objC == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (b3 + 1);
                objC = com.c.a.e.e.e((char) (TextUtils.getTrimmedLength("") + 7674), Color.blue(0) + 27, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + SanyoMakernoteDirectory.TAG_SEQUENTIAL_SHOT, 1405013397, false, $$c(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objC).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            long j3 = 0;
            if (i7 == 0) {
                j2 = 8033500363701343155L;
            } else {
                byte[] bArr = f7600g;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objC2 = com.c.a.e.e.c(-713221154);
                        if (objC2 == null) {
                            byte b5 = (byte) i6;
                            byte b6 = (byte) (b5 + 1);
                            objC2 = com.c.a.e.e.e((char) (View.resolveSizeAndState(0, 0, 0) + 65414), 19 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 262 - (SystemClock.uptimeMillis() > j3 ? 1 : (SystemClock.uptimeMillis() == j3 ? 0 : -1)), -706274905, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objC2).invoke(null, objArr3)).byteValue();
                        i8++;
                        i6 = -1;
                        j3 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i9 = $10 + 113;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    byte[] bArr3 = f7600g;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f7603j)};
                    Object objC3 = com.c.a.e.e.c(1394921452);
                    if (objC3 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        objC3 = com.c.a.e.e.e((char) (7674 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 27 - TextUtils.getOffsetAfter("", 0), 527 - (Process.myTid() >> 22), 1405013397, false, $$c(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objC3).invoke(null, objArr4)).intValue()]) ^ 8033500363701343155L)) + ((int) (((long) f7599f) ^ 8033500363701343155L)));
                    j2 = 8033500363701343155L;
                } else {
                    j2 = 8033500363701343155L;
                    iIntValue = (short) (((short) (((long) f7602i[i2 + ((int) (((long) f7603j) ^ 8033500363701343155L))]) ^ 8033500363701343155L)) + ((int) (((long) f7599f) ^ 8033500363701343155L)));
                }
            }
            if (iIntValue > 0) {
                lVar.f2775b = ((i2 + iIntValue) - 2) + ((int) (((long) f7603j) ^ j2)) + i7;
                Object[] objArr5 = {lVar, Integer.valueOf(i3), Integer.valueOf(f7601h), sb};
                Object objC4 = com.c.a.e.e.c(-893097792);
                if (objC4 == null) {
                    byte b9 = (byte) (-1);
                    byte b10 = (byte) (b9 + 1);
                    objC4 = com.c.a.e.e.e((char) (19417 - Color.argb(0, 0, 0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20, TextUtils.lastIndexOf("", '0', 0, 0) + 1068, -899781959, false, $$c(b9, b10, (byte) (b10 + 2)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objC4).invoke(null, objArr5)).append(lVar.f2776c);
                lVar.f2774a = lVar.f2776c;
                byte[] bArr4 = f7600g;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        int i12 = $10 + 85;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            bArr5[i11] = (byte) (((long) bArr4[i11]) ^ 8033500363701343155L);
                            i11 %= 0;
                        } else {
                            bArr5[i11] = (byte) (((long) bArr4[i11]) ^ 8033500363701343155L);
                            i11++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                lVar.f2777d = 1;
                while (lVar.f2777d < iIntValue) {
                    int i13 = $10 + 93;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    if (z2) {
                        byte[] bArr6 = f7600g;
                        lVar.f2775b = lVar.f2775b - 1;
                        lVar.f2776c = (char) (lVar.f2774a + (((byte) (((byte) (((long) bArr6[r3]) ^ 8033500363701343155L)) + s2)) ^ b2));
                    } else {
                        short[] sArr = f7602i;
                        lVar.f2775b = lVar.f2775b - 1;
                        lVar.f2776c = (char) (lVar.f2774a + (((short) (((short) (((long) sArr[r3]) ^ 8033500363701343155L)) + s2)) ^ b2));
                    }
                    sb.append(lVar.f2776c);
                    lVar.f2774a = lVar.f2776c;
                    lVar.f2777d++;
                }
            }
            String string = sb.toString();
            int i14 = $11 + 77;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            objArr[0] = string;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void d() {
        f7603j = -1614446781;
        f7599f = 2036585372;
        f7601h = 148932727;
        f7600g = new byte[]{118, 75, Ascii.FF, 79, 116, -77};
    }

    private static final /* synthetic */ b[] b() {
        b[] bVarArr;
        int i2 = 2 % 2;
        int i3 = f7606m;
        int i4 = i3 + 79;
        f7607o = i4 % 128;
        if (i4 % 2 == 0) {
            bVarArr = new b[2];
            bVarArr[0] = f7597c;
            bVarArr[0] = f7596b;
            bVarArr[5] = f7598e;
        } else {
            bVarArr = new b[]{f7597c, f7596b, f7598e};
        }
        int i5 = i3 + 51;
        f7607o = i5 % 128;
        int i6 = i5 % 2;
        return bVarArr;
    }

    public static b valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f7606m + 85;
        f7607o = i3 % 128;
        int i4 = i3 % 2;
        b bVar = (b) Enum.valueOf(b.class, str);
        if (i4 != 0) {
            return bVar;
        }
        throw null;
    }

    public static b[] values() {
        int i2 = 2 % 2;
        int i3 = f7606m + 85;
        f7607o = i3 % 128;
        int i4 = i3 % 2;
        b[] bVarArr = (b[]) f7595a.clone();
        int i5 = f7607o + 79;
        f7606m = i5 % 128;
        if (i5 % 2 == 0) {
            return bVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
