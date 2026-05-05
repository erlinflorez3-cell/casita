package o.dx;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.h;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements b<o.dy.e, o.dv.d, o.dz.d, Drawable> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23400b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f23401c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f23402d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23403e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23404h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23405j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.dv.d f23406a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, int r9, short r10) {
        /*
            byte[] r7 = o.dx.c.$$a
            int r6 = r9 + 102
            int r0 = r8 * 4
            int r5 = r0 + 4
            int r1 = r10 * 2
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r7 != 0) goto L29
            r0 = r2
            r1 = r3
        L15:
            int r0 = -r0
            int r5 = r5 + 1
            int r6 = r6 + r0
        L19:
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r2) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r7[r5]
            goto L15
        L29:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dx.c.$$c(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23404h = 0;
        f23405j = 1;
        f23403e = 0;
        f23400b = 1;
        h();
        AndroidCharacter.getMirror('0');
        TextUtils.lastIndexOf("", '0', 0, 0);
        int i2 = f23405j + 71;
        f23404h = i2 % 128;
        int i3 = i2 % 2;
    }

    public c(String str) {
        this.f23406a = new o.dv.d(str);
    }

    private static void f(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        int length;
        char[] cArr;
        int i4;
        String str2 = str;
        int i5 = 2;
        int i6 = 2 % 2;
        int i7 = $10 + 69;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        h hVar = new h();
        char[] cArr3 = f23402d;
        int i9 = 421932776;
        char c2 = '0';
        if (cArr3 != null) {
            int i10 = $11 + 29;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                length = cArr3.length;
                cArr = new char[length];
                i4 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i4 = 0;
            }
            while (i4 < length) {
                int i11 = $10 + 21;
                $11 = i11 % 128;
                int i12 = i11 % i5;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objA = o.d.d.a(i9);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(AndroidCharacter.getMirror(c2) + 222, (char) (ViewConfiguration.getTapTimeout() >> 16), 11 - (Process.myTid() >> 22), -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr[i4] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i4++;
                    i5 = 2;
                    i9 = 421932776;
                    c2 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr;
        }
        Object[] objArr3 = {Integer.valueOf(f23401c)};
        Object objA2 = o.d.d.a(421932776);
        char c3 = '\f';
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(TextUtils.lastIndexOf("", '0') + 271, (char) TextUtils.indexOf("", "", 0), Process.getGidForName("") + 12, -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i13 = $11 + 63;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr2[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr2[hVar.f19926b];
                hVar.f19925a = cArr2[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[c3] = hVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
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
                        objA3 = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 825, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF, -611683395, false, $$c(b7, (byte) ((b7 + 9) - (9 & b7)), b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            objA4 = o.d.d.a(TextUtils.lastIndexOf("", '0') + 219, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 11, 212688716, false, $$c(b8, (byte) (7 | b8), b8), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr3[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr3[i15];
                    } else if (hVar.f19928d == hVar.f19929e) {
                        hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                        hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                        int i16 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                        int i17 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr3[i16];
                        cArr4[hVar.f19926b + 1] = cArr3[i17];
                        int i18 = $10 + 1;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                    } else {
                        int i20 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                        int i21 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                        cArr4[hVar.f19926b] = cArr3[i20];
                        cArr4[hVar.f19926b + 1] = cArr3[i21];
                    }
                }
                hVar.f19926b += 2;
                c3 = '\f';
            }
        }
        for (int i22 = 0; i22 < i2; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        String str3 = new String(cArr4);
        int i23 = $11 + 17;
        $10 = i23 % 128;
        if (i23 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str3;
    }

    private static o.dy.e g() {
        int i2 = 2 % 2;
        int i3 = f23400b + 47;
        f23403e = i3 % 128;
        int i4 = i3 % 2;
        o.dy.e eVar = o.dy.e.f23458c;
        if (i4 == 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void h() {
        f23402d = new char[]{64586, 64577, 64617, 64536, 64599, 65468, 64588, 64606, 64521, 64581, 64597, 64630, 64631, 64625, 64604, 64598, 64585, 64578, 64517, 64614, 64609, 64592, 64580, 64583, 65469, 65467, 64576, 65470, 64590, 64587, 64596, 64582, 65471, 64579, 64593, 64584};
        f23401c = (char) 51641;
    }

    static void init$0() {
        $$a = new byte[]{52, 50, -24, MessagePack.Code.MAP16};
        $$b = 145;
    }

    private static o.dz.d j() {
        o.dz.d dVar;
        int i2 = 2 % 2;
        int i3 = f23400b + 85;
        f23403e = i3 % 128;
        if (i3 % 2 != 0) {
            dVar = o.dz.d.f23474e;
            int i4 = 22 / 0;
        } else {
            dVar = o.dz.d.f23474e;
        }
        int i5 = f23403e + 33;
        f23400b = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }

    @Override // o.dx.b
    public final /* synthetic */ o.dz.c a() {
        int i2 = 2 % 2;
        int i3 = f23400b + 63;
        f23403e = i3 % 128;
        int i4 = i3 % 2;
        o.dz.d dVarJ = j();
        int i5 = f23400b + 7;
        f23403e = i5 % 128;
        int i6 = i5 % 2;
        return dVarJ;
    }

    public final o.dv.d b() {
        int i2 = 2 % 2;
        int i3 = f23400b;
        int i4 = i3 + 75;
        f23403e = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o.dv.d dVar = this.f23406a;
        int i5 = i3 + 113;
        f23403e = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }

    @Override // o.dx.b
    public final String c() {
        int i2 = 2 % 2;
        int i3 = f23403e + 3;
        int i4 = i3 % 128;
        f23400b = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 47;
        f23403e = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // o.dx.b
    public final /* synthetic */ o.dv.c d() {
        int i2 = 2 % 2;
        int i3 = f23403e + 125;
        f23400b = i3 % 128;
        int i4 = i3 % 2;
        o.dv.d dVarB = b();
        if (i4 == 0) {
            int i5 = 65 / 0;
        }
        return dVarB;
    }

    @Override // o.dx.b
    public final /* synthetic */ o.dy.d e() {
        int i2 = 2 % 2;
        int i3 = f23400b + 33;
        f23403e = i3 % 128;
        int i4 = i3 % 2;
        o.dy.e eVarG = g();
        int i5 = f23403e + 45;
        f23400b = i5 % 128;
        int i6 = i5 % 2;
        return eVarG;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i3 = f23403e + 41;
            f23400b = i3 % 128;
            int i4 = i3 % 2;
            if (getClass() == obj.getClass()) {
                return Objects.equals(this.f23406a, ((c) obj).f23406a);
            }
        }
        int i5 = f23403e + 99;
        f23400b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return false;
    }

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        f((ViewConfiguration.getScrollBarSize() >> 8) + 52, "\u0012\b\f\u000b\u0004\u001c\r\u0016\u001c\n\u0007\u0013\u0004\u0018\u001b\u0018\u000e\u0018!\u0012\u001b\u000e\u001e\u0004\u0005\u0003\u0005\f\u0006\u0012\u001d \u0004\u001e\u0018\u000e\u001b\u000e\u0003\u0012\u0001\"\u0019\b\u000e\u001d\u001f\u0010\u0010\b\u001b\u0002", (byte) (15 - TextUtils.getOffsetAfter("", 0)), objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(g().toString());
        Object[] objArr2 = new Object[1];
        f((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, "\u0006\u0014\u000e\u001d#\n\u0003\u0012\u0001\"\u001b\u0002", (byte) (Color.rgb(0, 0, 0) + 16777244), objArr2);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr2[0]).intern()).append(b().toString());
        Object[] objArr3 = new Object[1];
        f(13 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0006\u0014\u000e\u001d \u0016\u0019 \u0001\u0002\u001c\u0002㗫", (byte) (67 - ExpandableListView.getPackedPositionChild(0L)), objArr3);
        String string = sbAppend2.append(((String) objArr3[0]).intern()).append(j().toString()).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f23400b + 51;
        f23403e = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }
}
