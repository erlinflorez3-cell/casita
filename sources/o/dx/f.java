package o.dx;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.h;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements b<o.dy.b, o.dv.d, o.dz.b, URI> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23421a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23422b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f23423c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f23424e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23425h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f23426i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o.dv.d f23427d;

    private static String $$c(short s2, short s3, byte b2) {
        byte[] bArr = $$a;
        int i2 = (s3 * 2) + 4;
        int i3 = 111 - b2;
        int i4 = s2 * 2;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = (-i2) + i4;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            int i6 = i2;
            i3 = (-bArr[i2]) + i3;
            i2 = i6 + 1;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23426i = 0;
        f23425h = 1;
        f23422b = 0;
        f23421a = 1;
        i();
        SystemClock.uptimeMillis();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        int i2 = f23425h + 101;
        f23426i = i2 % 128;
        int i3 = i2 % 2;
    }

    public f(String str) {
        this.f23427d = new o.dv.d(str);
    }

    private static o.dy.b f() {
        int i2 = 2 % 2;
        int i3 = f23421a + 87;
        f23422b = i3 % 128;
        int i4 = i3 % 2;
        o.dy.b bVar = o.dy.b.f23445e;
        int i5 = f23422b + 85;
        f23421a = i5 % 128;
        if (i5 % 2 != 0) {
            return bVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static o.dz.b g() {
        int i2 = 2 % 2;
        int i3 = f23421a + 63;
        f23422b = i3 % 128;
        if (i3 % 2 != 0) {
            o.dz.b bVar = o.dz.b.f23464a;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.dz.b bVar2 = o.dz.b.f23464a;
        int i4 = f23422b + 59;
        f23421a = i4 % 128;
        int i5 = i4 % 2;
        return bVar2;
    }

    static void i() {
        f23423c = new char[]{51646, 64612, 64586, 64609, 64630, 64521, 64606, 64577, 64587, 64536, 64584, 64604, 64592, 64625, 64588, 64598, 64597, 64576, 64614, 64582, 64578, 64517, 64599, 64593, 64631};
        f23424e = (char) 51642;
    }

    static void init$0() {
        $$a = new byte[]{6, 32, -91, MessagePack.Code.BIN16};
        $$b = 88;
    }

    private static void j(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        int i5 = $11 + 99;
        $10 = i5 % 128;
        Object charArray = str2;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f23423c;
        int i6 = 421932776;
        int i7 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objA = o.d.d.a(i6);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(270 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 11 - TextUtils.getTrimmedLength(""), -811348851, false, $$c(b3, b4, (byte) (9 | b4)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    i6 = 421932776;
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
        Object[] objArr3 = {Integer.valueOf(f23424e)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = '\n';
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(270 - Color.blue(0), (char) View.resolveSize(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, -811348851, false, $$c(b5, b6, (byte) (9 | b6)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        char c3 = 4;
        char c4 = 5;
        if (i3 > 1) {
            int i9 = $11 + 73;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i7];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + i7] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[c2] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[c4] = Integer.valueOf(cCharValue);
                    objArr4[c3] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i7] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a(825 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), 10 - ImageFormat.getBitsPerPixel(0), -611683395, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        int i11 = $10 + 57;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            c2 = '\n';
                            objA4 = o.d.d.a(219 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) TextUtils.indexOf("", "", 0), Process.getGidForName("") + 12, 212688716, false, $$c(b9, b10, (byte) (b10 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = '\n';
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i13 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i13];
                    } else {
                        c2 = '\n';
                        if (hVar.f19928d == hVar.f19929e) {
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i14 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i14];
                            cArr4[hVar.f19926b + 1] = cArr2[i15];
                        } else {
                            int i16 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i17 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i16];
                            i7 = 1;
                            cArr4[hVar.f19926b + 1] = cArr2[i17];
                        }
                    }
                    i7 = 1;
                }
                hVar.f19926b += 2;
                c3 = 4;
                c4 = 5;
            }
        }
        int i18 = 0;
        while (i18 < i2) {
            int i19 = $10 + 13;
            int i20 = i19 % 128;
            $11 = i20;
            int i21 = i19 % 2;
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            i18++;
            int i22 = i20 + 95;
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 5 / 4;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // o.dx.b
    public final /* synthetic */ o.dz.c a() {
        int i2 = 2 % 2;
        int i3 = f23421a + 13;
        f23422b = i3 % 128;
        int i4 = i3 % 2;
        o.dz.b bVarG = g();
        int i5 = f23421a + 15;
        f23422b = i5 % 128;
        if (i5 % 2 == 0) {
            return bVarG;
        }
        throw null;
    }

    public final o.dv.d b() {
        o.dv.d dVar;
        int i2 = 2 % 2;
        int i3 = f23422b;
        int i4 = i3 + 19;
        f23421a = i4 % 128;
        if (i4 % 2 == 0) {
            dVar = this.f23427d;
            int i5 = 12 / 0;
        } else {
            dVar = this.f23427d;
        }
        int i6 = i3 + 89;
        f23421a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 22 / 0;
        }
        return dVar;
    }

    @Override // o.dx.b
    public final String c() {
        int i2 = 2 % 2;
        int i3 = f23421a + 125;
        f23422b = i3 % 128;
        int i4 = i3 % 2;
        String strA = b().a();
        int i5 = f23421a + 27;
        f23422b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return strA;
    }

    @Override // o.dx.b
    public final /* synthetic */ o.dv.c d() {
        int i2 = 2 % 2;
        int i3 = f23421a + 21;
        f23422b = i3 % 128;
        int i4 = i3 % 2;
        o.dv.d dVarB = b();
        int i5 = f23422b + 83;
        f23421a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return dVarB;
    }

    @Override // o.dx.b
    public final /* synthetic */ o.dy.d e() {
        int i2 = 2 % 2;
        int i3 = f23421a + 37;
        f23422b = i3 % 128;
        if (i3 % 2 == 0) {
            return f();
        }
        f();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23422b;
        int i4 = i3 + 123;
        f23421a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        int i5 = i3 + 69;
        f23421a = i5 % 128;
        int i6 = i5 % 2;
        if (getClass() != obj.getClass()) {
            return false;
        }
        boolean zEquals = Objects.equals(this.f23427d, ((f) obj).f23427d);
        int i7 = f23421a + 23;
        f23422b = i7 % 128;
        int i8 = i7 % 2;
        return zEquals;
    }

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        j(View.MeasureSpec.getMode(0) + 41, "\f\u0012\u0014\f\u0010\u0000\t\b\u0011\u0003\t\b\r\u0018\f\u0004\u0005\u0012\u0016\u0013\f\u0000\u0016\u0012\u0016\u0013\u0011\u0000\u0011\u0002\u000f\u0012\u0005\u0015\u0012\u0016\u000e\f\u0011\u0012㘓", (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 107), objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(f().toString());
        Object[] objArr2 = new Object[1];
        j(KeyEvent.normalizeMetaState(0) + 12, "\u0006\u0014\u0016\u000f\u0018\u0003\u0007\u0011\u0018\u0011\u0013\u0007", (byte) (27 - Color.argb(0, 0, 0, 0)), objArr2);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr2[0]).intern()).append(b().toString());
        Object[] objArr3 = new Object[1];
        j(View.MeasureSpec.getSize(0) + 13, "\u0006\u0014\u0016\u000f\u0003\b\u0012\u000f\u0007\f\u0016\u0002㗺", (byte) (AndroidCharacter.getMirror('0') + '#'), objArr3);
        String string = sbAppend2.append(((String) objArr3[0]).intern()).append(g().toString()).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f23421a + 25;
        f23422b = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }
}
