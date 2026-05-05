package o.g;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.iptc.IptcDirectory;
import java.lang.reflect.Method;
import java.util.Date;
import javax.crypto.Cipher;
import o.g.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f26197b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26198c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26199d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f26200e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f26201f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26202g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f26203h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26204i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static short[] f26205j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cipher f26206a;

    private static String $$d(short s2, int i2, byte b2) {
        byte[] bArr = $$a;
        int i3 = 104 - i2;
        int i4 = s2 + 4;
        int i5 = b2 * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i3 += -i6;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i4++;
            i3 += -bArr[i4];
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26202g = 0;
        f26203h = 1;
        f26204i = 0;
        f26201f = 1;
        k();
        Color.rgb(0, 0, 0);
        View.getDefaultSize(0, 0);
        MotionEvent.axisFromString("");
        Color.argb(0, 0, 0, 0);
        View.MeasureSpec.getSize(0);
        int i2 = f26203h + 9;
        f26202g = i2 % 128;
        int i3 = i2 % 2;
    }

    public c(a.b bVar, Date date, d dVar, Cipher cipher) {
        super(bVar, date, dVar);
        this.f26206a = cipher;
    }

    static void init$0() {
        $$a = new byte[]{42, -91, MessagePack.Code.MAP16, 103};
        $$b = 40;
    }

    static void k() {
        f26200e = -334152920;
        f26198c = 1150422410;
        f26199d = -1543559470;
        f26197b = new byte[]{-116, -115, -115};
    }

    private static void n(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        boolean z2;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        o.a.j jVar = new o.a.j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f26198c)};
            Object objA = o.d.d.a(-727631768);
            int i8 = -1;
            if (objA == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (b3 + 1);
                objA = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 237, (char) (44531 - (ViewConfiguration.getLongPressTimeout() >> 16)), Color.red(0) + 11, 35969549, false, $$d(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $10 + 103;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                byte[] bArr = f26197b;
                char c2 = '0';
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) i8;
                            byte b6 = (byte) (-b5);
                            objA2 = o.d.d.a(Color.alpha(0) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) (AndroidCharacter.getMirror(c2) + 28601), MotionEvent.axisFromString("") + 12, 1621469864, false, $$d(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        i11++;
                        i8 = -1;
                        c2 = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f26197b;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f26200e)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        objA3 = o.d.d.a(Drawable.resolveOpacity(0, 0) + 238, (char) (Color.alpha(0) + 44531), TextUtils.indexOf((CharSequence) "", '0', 0) + 12, 35969549, false, $$d(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f26198c) ^ (-7649639543924978291L))));
                    i6 = 2;
                } else {
                    iIntValue = (short) (((short) (((long) f26205j[i2 + ((int) (((long) f26200e) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f26198c) ^ (-7649639543924978291L))));
                    int i12 = $10 + 39;
                    $11 = i12 % 128;
                    i6 = 2;
                    if (i12 % 2 == 0) {
                        int i13 = 2 / 4;
                    }
                }
            }
            if (iIntValue > 0) {
                int i14 = ((i2 + iIntValue) - i6) + ((int) (((long) f26200e) ^ (-7649639543924978291L)));
                if (z2) {
                    int i15 = $10 + 39;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                jVar.f19936d = i14 + i5;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f26199d), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a(ViewConfiguration.getJumpTapTimeout() >> 16, (char) (View.MeasureSpec.getMode(0) + 5358), Process.getGidForName("") + 12, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f26197b;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        bArr5[i17] = (byte) (((long) bArr4[i17]) ^ (-7649639543924978291L));
                    }
                    bArr4 = bArr5;
                }
                boolean z3 = bArr4 != null;
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    if (z3) {
                        byte[] bArr6 = f26197b;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f26205j;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    }
                    sb.append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    jVar.f19934b++;
                    int i18 = $10 + 5;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
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

    @Override // o.g.a
    public final byte[] a() {
        int i2 = 2 % 2;
        int i3 = f26204i + 13;
        f26201f = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            m().a().d();
            throw null;
        }
        byte[] bArrD = m().a().d();
        int i4 = f26201f + 69;
        f26204i = i4 % 128;
        if (i4 % 2 == 0) {
            return bArrD;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.g.a
    public final o.m.i b() {
        int i2 = 2 % 2;
        int i3 = f26204i + 117;
        f26201f = i3 % 128;
        int i4 = i3 % 2;
        o.m.i iVar = o.m.i.f26494b;
        int i5 = f26201f + 107;
        f26204i = i5 % 128;
        int i6 = i5 % 2;
        return iVar;
    }

    @Override // o.g.a
    public final String c() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(b().toString());
        Object[] objArr = new Object[1];
        n((short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1467533659 - TextUtils.indexOf("", "", 0), 412275931 - (ViewConfiguration.getJumpTapTimeout() >> 16), (-6) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        n((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 1467533658 - TextUtils.indexOf((CharSequence) "", '0', 0), 412275921 - View.getDefaultSize(0, 0), (-5) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), objArr2);
        StringBuilder sbAppend3 = sbAppend2.append(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        n((short) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1467533659, 412275931 - Color.green(0), (-16777222) - Color.rgb(0, 0, 0), (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr3);
        String string = sbAppend3.append(((String) objArr3[0]).intern()).toString();
        int i3 = f26201f + 37;
        f26204i = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
        return string;
    }

    @Override // o.g.a
    public final byte[] d() {
        int i2 = 2 % 2;
        int i3 = f26204i + 55;
        f26201f = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrD = m().a().d();
        int i5 = f26201f + 23;
        f26204i = i5 % 128;
        int i6 = i5 % 2;
        return bArrD;
    }

    @Override // o.g.a
    public final byte[] e() {
        int i2 = 2 % 2;
        int i3 = f26201f + 77;
        f26204i = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrD = m().a().d();
        int i5 = f26204i + 77;
        f26201f = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return bArrD;
    }

    public final Cipher g() {
        int i2 = 2 % 2;
        int i3 = f26201f + 101;
        int i4 = i3 % 128;
        f26204i = i4;
        int i5 = i3 % 2;
        Cipher cipher = this.f26206a;
        int i6 = i4 + 87;
        f26201f = i6 % 128;
        int i7 = i6 % 2;
        return cipher;
    }

    @Override // o.g.a
    public final String j() {
        int i2 = 2 % 2;
        int i3 = f26201f + 9;
        f26204i = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        int i4 = 48 / 0;
        return null;
    }
}
