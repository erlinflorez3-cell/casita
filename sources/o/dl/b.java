package o.dl;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import o.a.j;
import o.a.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static byte[] f23166a = null;

    /* JADX INFO: renamed from: b */
    private static int f23167b = 0;

    /* JADX INFO: renamed from: c */
    private static int f23168c = 0;

    /* JADX INFO: renamed from: d */
    private static int f23169d = 0;

    /* JADX INFO: renamed from: e */
    private static char[] f23170e = null;

    /* JADX INFO: renamed from: f */
    private static int f23171f = 0;

    /* JADX INFO: renamed from: g */
    private static int f23172g = 0;

    /* JADX INFO: renamed from: h */
    private static int f23173h = 0;

    /* JADX INFO: renamed from: i */
    private static short[] f23174i = null;

    /* JADX INFO: renamed from: j */
    private static int f23175j = 0;

    private static String $$c(byte b2, byte b3, int i2) {
        int i3 = 120 - b3;
        byte[] bArr = $$a;
        int i4 = (b2 * 3) + 4;
        int i5 = i2 * 2;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i4 + (-i5);
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = i4;
            i3 += -bArr[i4];
            i4 = i7 + 1;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23171f = 0;
        f23175j = 1;
        f23173h = 0;
        f23172g = 1;
        e();
        ViewConfiguration.getScrollFriction();
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getScrollBarSize();
        SystemClock.elapsedRealtimeNanos();
        ViewConfiguration.getMaximumDrawingCacheSize();
        int i2 = f23175j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f23171f = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static short a(byte[] r21, byte[] r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dl.b.a(byte[], byte[]):short");
    }

    private static byte[] a(byte[]... bArr) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23172g + 33;
        f23173h = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            k("\u0001\u0000\u0000\u0001", new int[]{46, 4, 55, 0}, false, objArr);
            return c(o.ei.d.c(((String) objArr[0]).intern(), bArr));
        }
        Object[] objArr2 = new Object[1];
        k("\u0001\u0000\u0000\u0001", new int[]{46, 4, 55, 0}, false, objArr2);
        return c(o.ei.d.c(((String) objArr2[0]).intern(), bArr));
    }

    public static byte[] c(byte[] bArr) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23173h + 117;
        f23172g = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        l((short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 443709523 + (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-490435171) - TextUtils.lastIndexOf("", '0', 0), (-6) - ExpandableListView.getPackedPositionGroup(0L), (byte) (ViewConfiguration.getTouchSlop() >> 8), objArr);
        byte[] bArrC = o.ei.d.c(((String) objArr[0]).intern(), bArr);
        Object[] objArr2 = new Object[1];
        k("\u0000\u0000", new int[]{50, 2, 0, 1}, false, objArr2);
        byte[] bArrC2 = o.ei.d.c(((String) objArr2[0]).intern(), c.a());
        Object[] objArr3 = new Object[1];
        l((short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 443709527, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 490435181, TextUtils.indexOf("", "", 0) - 6, (byte) Gravity.getAbsoluteGravity(0, 0), objArr3);
        byte[] bArrC3 = o.ei.d.c(((String) objArr3[0]).intern(), bArrC2, bArrC);
        int i5 = f23172g + 39;
        f23173h = i5 % 128;
        if (i5 % 2 == 0) {
            return bArrC3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void e() {
        f23170e = new char[]{56490, 56530, 56483, 56509, 56499, 56550, 56553, 56553, 56555, 56553, 56554, 56556, 56539, 56539, 56556, 56563, 56563, 56557, 56550, 56555, 56556, 56548, 56538, 56544, 56561, 56556, 56514, 56486, 56486, 56514, 56553, 56561, 56523, 56512, 56552, 56560, 56520, 56493, 56493, 56482, 56524, 56521, 56486, 56486, 56482, 56524, 56508, 56571, 56562, 56560, 56474, 56502, 56475, 56503};
        f23169d = -1591768467;
        f23167b = 1150422408;
        f23168c = 1504280366;
        f23166a = new byte[]{-120, -128, 120, -119, -118, MessagePack.Code.FIXARRAY_PREFIX, 110, 127, -114, -83, -88, MessagePack.Code.TRUE, -120, 107, -105, 54, 127, -114, -115, MessagePack.Code.ARRAY32, 126, -128, 32, MessagePack.Code.TRUE, -120, 107, -105, Base64.padSymbol, 118, -117, 112, -122, MessagePack.Code.FLOAT32, 126, -128, 54, 127, -114, -83, 109, 118, -117, 112, -90, 111, 124, -98, 98, -128, 122, -124, 115, 112, 121, 112, -99};
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0019 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] e(o.ep.a r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dl.b.e(o.ep.a):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0107 A[PHI: r7
  0x0107: PHI (r7v6 byte[]) = (r7v4 byte[]), (r7v8 byte[]) binds: [B:54:0x0199, B:50:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] e(byte[] r22, byte[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dl.b.e(byte[], byte[]):byte[]");
    }

    static void init$0() {
        $$a = new byte[]{44, 115, -31, MessagePack.Code.FLOAT32};
        $$b = 191;
    }

    private static void k(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
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
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = f23170e;
        if (cArr != null) {
            int i9 = $11 + 107;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i11])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        int iAlpha = 249 - Color.alpha(i4);
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int iAlpha2 = 11 - Color.alpha(i4);
                        byte length2 = (byte) $$a.length;
                        objA = o.d.d.a(iAlpha, trimmedLength, iAlpha2, 1376582792, false, $$c((byte) i4, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i11++;
                    int i12 = $11 + 15;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 0;
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
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr != null) {
            int i14 = $11 + 121;
            $10 = i14 % 128;
            int i15 = 2;
            int i16 = i14 % 2;
            char[] cArr4 = new char[i6];
            mVar.f19943d = 0;
            int i17 = $10 + 115;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            char c2 = 0;
            while (mVar.f19943d < i6) {
                int i19 = $11 + 55;
                $10 = i19 % 128;
                int i20 = i19 % i15;
                if (bArr[mVar.f19943d] == 1) {
                    int i21 = mVar.f19943d;
                    char c3 = cArr3[mVar.f19943d];
                    Object[] objArr3 = new Object[i15];
                    objArr3[1] = Integer.valueOf(c2);
                    objArr3[0] = Integer.valueOf(c3);
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, (char) TextUtils.indexOf("", ""), View.resolveSize(0, 0) + 10, -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i21] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i22 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA3 = o.d.d.a(View.MeasureSpec.getSize(0) + 836, (char) (KeyEvent.normalizeMetaState(0) + 27279), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11, -1210801192, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i22] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 21, (char) (35715 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                i15 = 2;
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i23 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i23, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i23);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i6];
            while (true) {
                mVar.f19943d = i2;
                if (mVar.f19943d >= i6) {
                    break;
                }
                int i24 = $10 + 31;
                $11 = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = mVar.f19943d;
                    int i26 = mVar.f19943d;
                    cArr6[i25] = cArr3[0];
                    i2 = mVar.f19943d >> 1;
                } else {
                    cArr6[mVar.f19943d] = cArr3[(i6 - mVar.f19943d) - 1];
                    i2 = mVar.f19943d + 1;
                }
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i27 = $10 + 73;
            $11 = i27 % 128;
            int i28 = i27 % 2;
            int i29 = 0;
            while (true) {
                mVar.f19943d = i29;
                if (mVar.f19943d >= i6) {
                    break;
                }
                int i30 = $11 + 27;
                $10 = i30 % 128;
                int i31 = i30 % 2;
                cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                i29 = mVar.f19943d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void l(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        int i5;
        int i6 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f23167b)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                objA = o.d.d.a(238 - View.resolveSize(0, 0), (char) (44532 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 35969549, false, $$c(b3, (byte) ((-1) - (((-1) - b3) & ((-1) - 16))), b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                i5 = 1;
            } else {
                int i7 = $11 + 75;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i5 = 0;
            }
            if (i5 != 0) {
                byte[] bArr = f23166a;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            objA2 = o.d.d.a(627 - Process.getGidForName(""), (char) (TextUtils.indexOf("", "", 0, 0) + 28649), 11 - Color.alpha(0), 1621469864, false, $$c(b4, (byte) ((b4 + 17) - (b4 & 17)), b4), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f23166a;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f23169d)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b5 = (byte) 0;
                        objA3 = o.d.d.a(238 - View.resolveSizeAndState(0, 0, 0), (char) (44531 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 11 - TextUtils.getOffsetAfter("", 0), 35969549, false, $$c(b5, (byte) ((b5 + 16) - (16 & b5)), b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f23167b) ^ (-7649639543924978291L))));
                } else {
                    iIntValue = (short) (((short) (((long) f23174i[i2 + ((int) (((long) f23169d) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f23167b) ^ (-7649639543924978291L))));
                }
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f23169d) ^ (-7649639543924978291L))) + i5;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f23168c), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a(ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5358), 11 - Color.blue(0), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f23166a;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        bArr5[i10] = (byte) (((long) bArr4[i10]) ^ (-7649639543924978291L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    int i11 = $10 + 13;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (z2) {
                        byte[] bArr6 = f23166a;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f23174i;
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
}
