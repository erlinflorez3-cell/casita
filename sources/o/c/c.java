package o.c;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.a.j;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21969a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f21970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f21971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f21972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21973f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ c[] f21974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21975h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static byte[] f21976i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21977j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static short[] f21978k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f21979l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f21980m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f21981n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21982o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21983b;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, int r10, byte r11) {
        /*
            byte[] r8 = o.c.c.$$a
            int r1 = 104 - r11
            int r2 = r10 + 4
            int r7 = r9 * 2
            int r0 = r7 + 1
            byte[] r6 = new byte[r0]
            r5 = 0
            if (r8 != 0) goto L28
            r4 = r7
            r0 = r2
            r3 = r5
        L12:
            int r1 = -r2
            int r1 = r1 + r4
            r2 = r0
        L15:
            byte r0 = (byte) r1
            r6[r3] = r0
            int r0 = r2 + 1
            if (r3 != r7) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L22:
            int r3 = r3 + 1
            r2 = r8[r0]
            r4 = r1
            goto L12
        L28:
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c.c.$$c(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21982o = 0;
        f21980m = 1;
        f21981n = 0;
        f21979l = 1;
        a();
        Object[] objArr = new Object[1];
        p((short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 32), 279973681 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-420888989) + (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) - 71, (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        f21972e = new c(((String) objArr[0]).intern(), 0, 0);
        Object[] objArr2 = new Object[1];
        p((short) (89 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 279973694 - View.getDefaultSize(0, 0), (-420889003) + (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-71) - View.resolveSize(0, 0), (byte) TextUtils.indexOf("", "", 0), objArr2);
        f21970c = new c(((String) objArr2[0]).intern(), 1, 2);
        Object[] objArr3 = new Object[1];
        p((short) (TextUtils.indexOf((CharSequence) "", '0', 0) - 95), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 279973699, (ViewConfiguration.getWindowTouchSlop() >> 8) - 420888991, (-70) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (Process.myPid() >> 22), objArr3);
        f21971d = new c(((String) objArr3[0]).intern(), 2, 3);
        Object[] objArr4 = new Object[1];
        p((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33), 279973708 + (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-420888991) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) - 71, (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr4);
        f21969a = new c(((String) objArr4[0]).intern(), 3, 4);
        f21974g = d();
        int i2 = f21982o + 75;
        f21980m = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
    }

    private c(String str, int i2, int i3) {
        this.f21983b = i3;
    }

    static void a() {
        f21973f = -1411515043;
        f21975h = 1150422475;
        f21977j = 1568951398;
        f21976i = new byte[]{69, 83, 91, 83, 104, 88, 100, 95, 107, 81, -116, 54, 105, -115, 77, Ascii.SUB, 56, 16, 52, 71, 78, MessagePack.Code.INT32, Ascii.VT, MessagePack.Code.BIN32, MessagePack.Code.INT32, MessagePack.Code.INT64, -19, MessagePack.Code.FIXEXT2, Ascii.SO, 77, 80, 85, 107, 95, -116};
    }

    public static c d(int i2) {
        int i3 = 2 % 2;
        c[] cVarArrValues = values();
        int length = cVarArrValues.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = f21981n;
            int i6 = i5 + 7;
            f21979l = i6 % 128;
            int i7 = i6 % 2;
            c cVar = cVarArrValues[i4];
            if (i2 == cVar.f21983b) {
                int i8 = i5 + 15;
                f21979l = i8 % 128;
                int i9 = i8 % 2;
                return cVar;
            }
            i4++;
            int i10 = i5 + 19;
            f21979l = i10 % 128;
            int i11 = i10 % 2;
        }
        return null;
    }

    private static /* synthetic */ c[] d() {
        int i2 = 2 % 2;
        int i3 = f21979l;
        int i4 = i3 + 5;
        f21981n = i4 % 128;
        int i5 = i4 % 2;
        c[] cVarArr = {f21972e, f21970c, f21971d, f21969a};
        int i6 = i3 + 73;
        f21981n = i6 % 128;
        int i7 = i6 % 2;
        return cVarArr;
    }

    static void init$0() {
        $$a = new byte[]{Base64.padSymbol, -67, -29, 104};
        $$b = 83;
    }

    private static void p(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        int length;
        byte[] bArr;
        int i5 = 2;
        int i6 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f21975h)};
            Object objA = o.d.d.a(-727631768);
            char c2 = '0';
            if (objA == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 - 1);
                objA = o.d.d.a((Process.myTid() >> 22) + 238, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 44531), 10 - TextUtils.lastIndexOf("", '0', 0), 35969549, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                int i8 = $10 + 79;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr2 = f21976i;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        int i10 = $10 + 31;
                        $11 = i10 % 128;
                        int i11 = i10 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 - 1);
                            objA2 = o.d.d.a(676 - AndroidCharacter.getMirror(c2), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28648), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, 1621469864, false, $$c(b5, b6, (byte) (-b6)), new Class[]{Integer.TYPE});
                        }
                        bArr3[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        i9++;
                        i5 = 2;
                        c2 = '0';
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = f21976i;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f21973f)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 - 1);
                        objA3 = o.d.d.a(286 - AndroidCharacter.getMirror('0'), (char) (44531 - TextUtils.getCapsMode("", 0, 0)), 11 - (ViewConfiguration.getTapTimeout() >> 16), 35969549, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f21975h) ^ (-7649639543924978291L))));
                } else {
                    iIntValue = (short) (((short) (((long) f21978k[i2 + ((int) (((long) f21973f) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f21975h) ^ (-7649639543924978291L))));
                }
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f21973f) ^ (-7649639543924978291L))) + i7;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f21977j), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a(Color.argb(0, 0, 0, 0), (char) (5359 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr5 = f21976i;
                if (bArr5 != null) {
                    int i12 = $11 + 77;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i13 = 0; i13 < length; i13++) {
                        bArr[i13] = (byte) (((long) bArr5[i13]) ^ (-7649639543924978291L));
                    }
                    bArr5 = bArr;
                }
                boolean z2 = bArr5 != null;
                jVar.f19934b = 1;
                int i14 = $11 + 55;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                while (jVar.f19934b < iIntValue) {
                    int i16 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    if (z2) {
                        byte[] bArr6 = f21976i;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f21978k;
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

    public static c valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f21981n + 17;
        f21979l = i3 % 128;
        int i4 = i3 % 2;
        c cVar = (c) Enum.valueOf(c.class, str);
        if (i4 != 0) {
            return cVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static c[] values() {
        int i2 = 2 % 2;
        int i3 = f21981n + 89;
        f21979l = i3 % 128;
        int i4 = i3 % 2;
        c[] cVarArr = (c[]) f21974g.clone();
        int i5 = f21981n + 75;
        f21979l = i5 % 128;
        int i6 = i5 % 2;
        return cVarArr;
    }

    public final int c() {
        int i2 = 2 % 2;
        int i3 = f21981n + 9;
        f21979l = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f21983b;
        }
        throw null;
    }
}
