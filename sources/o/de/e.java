package o.de;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.work.BackoffPolicy;
import java.lang.reflect.Method;
import java.util.Random;
import o.a.j;
import o.dd.g;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static short[] f22920a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f22921b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22922c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22923d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22924e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22925f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22926g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22927i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22928j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, int r8, byte r9) {
        /*
            int r9 = r9 + 103
            int r0 = r8 * 2
            int r8 = 1 - r0
            int r0 = r7 * 3
            int r7 = 3 - r0
            byte[] r6 = o.de.e.$$a
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r6 != 0) goto L2c
            r3 = r7
            r0 = r8
            r2 = r4
        L14:
            int r0 = -r0
            int r7 = r7 + r0
            r1 = r2
            r9 = r7
            r7 = r3
        L19:
            int r3 = r7 + 1
            byte r0 = (byte) r9
            int r2 = r1 + 1
            r5[r1] = r0
            if (r2 != r8) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r0 = r6[r3]
            r7 = r9
            goto L14
        L2c:
            r1 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.de.e.$$c(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22927i = 0;
        f22926g = 1;
        f22928j = 0;
        f22925f = 1;
        e();
        KeyEvent.getDeadChar(0, 0);
        KeyEvent.keyCodeFromString("");
        ViewConfiguration.getScrollDefaultDelay();
        View.getDefaultSize(0, 0);
        ViewConfiguration.getScrollBarFadeDuration();
        int i2 = f22927i + 115;
        f22926g = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean a(o.bg.c cVar) {
        int i2 = 2 % 2;
        int i3 = f22928j + 13;
        f22925f = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 1232037242 * o.bg.c.f21082a;
        o.bg.c.f21082a = i5;
        int iMyUid = Process.myUid();
        int i6 = 1942342535 * o.bg.c.f21083c;
        o.bg.c.f21083c = i6;
        if (((Boolean) o.bg.c.a(i5, i6, iMyUid, -1017985026, new Object[]{cVar}, 1017985027, new Random().nextInt())).booleanValue()) {
            int i7 = f22925f + 123;
            f22928j = i7 % 128;
            int i8 = i7 % 2;
            if (cVar.e().d()) {
                Object[] objArr = {cVar.e()};
                int i9 = o.bg.b.f21065e * 1638453650;
                o.bg.b.f21065e = i9;
                int i10 = o.bg.b.f21062b * 36621504;
                o.bg.b.f21062b = i10;
                int i11 = o.bg.b.f21068i * 241773600;
                o.bg.b.f21068i = i11;
                if (((g) o.bg.b.c(-968128923, objArr, i9, (int) Runtime.getRuntime().maxMemory(), i11, 968128924, i10)) != g.f22859d) {
                    return true;
                }
            }
        }
        return cVar.c() == o.bg.a.an;
    }

    static void e() {
        f22924e = -566711930;
        f22923d = 1150422513;
        f22922c = -811812234;
        f22921b = new byte[]{41, MessagePack.Code.EXT32, -71, -82, MessagePack.Code.EXT16, -84, -67, MessagePack.Code.MAP16, -127, -76, -67, MessagePack.Code.UINT8, MessagePack.Code.EXT16, -111, -86, MessagePack.Code.UINT16, -88, -77, -66, MessagePack.Code.EXT16, -122, MessagePack.Code.FLOAT64, MessagePack.Code.NEVER_USED, -101, -90, -70, -86, MessagePack.Code.UINT32, -67, -86, -89, -24};
    }

    private static void h(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
        int i5;
        long j2;
        int i6 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f22923d)};
            Object objA = o.d.d.a(-727631768);
            if (objA == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objA = o.d.d.a(237 - TextUtils.lastIndexOf("", '0', 0), (char) (44531 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, 35969549, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 123;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (i5 != 0) {
                byte[] bArr = f22921b;
                long j3 = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objA2 = o.d.d.a(-1239398195);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA2 = o.d.d.a(629 - (SystemClock.elapsedRealtime() > j3 ? 1 : (SystemClock.elapsedRealtime() == j3 ? 0 : -1)), (char) (28650 - (Process.getElapsedCpuTime() > j3 ? 1 : (Process.getElapsedCpuTime() == j3 ? 0 : -1))), 10 - MotionEvent.axisFromString(""), 1621469864, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        i9++;
                        j3 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f22921b;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f22924e)};
                    Object objA3 = o.d.d.a(-727631768);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA3 = o.d.d.a(239 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (44532 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 11, 35969549, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f22923d) ^ (-7649639543924978291L))));
                    j2 = -7649639543924978291L;
                } else {
                    j2 = -7649639543924978291L;
                    iIntValue = (short) (((short) (((long) f22920a[i2 + ((int) (((long) f22924e) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f22923d) ^ (-7649639543924978291L))));
                }
            } else {
                j2 = -7649639543924978291L;
            }
            if (iIntValue > 0) {
                jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f22924e) ^ j2)) + i5;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f22922c), sb};
                Object objA4 = o.d.d.a(1819197256);
                if (objA4 == null) {
                    objA4 = o.d.d.a(View.resolveSize(0, 0), (char) (5357 - TextUtils.lastIndexOf("", '0', 0)), ';' - AndroidCharacter.getMirror('0'), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f22921b;
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
                    int i11 = $11 + 49;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        throw null;
                    }
                    if (!z2) {
                        short[] sArr = f22920a;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        byte[] bArr6 = f22921b;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
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

    static void init$0() {
        $$a = new byte[]{83, -90, 91, 36};
        $$b = 130;
    }

    @Override // o.de.d
    public final int a() {
        int i2 = 2 % 2;
        int i3 = f22928j;
        int i4 = i3 + 55;
        f22925f = i4 % 128;
        int i5 = i4 % 2 == 0 ? 63 : 120;
        int i6 = i3 + 35;
        f22925f = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    @Override // o.de.d
    public final String b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f22928j + 7;
        f22925f = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        h((short) (TextUtils.indexOf((CharSequence) "", '0', 0) - 49), 1700092917 - (ViewConfiguration.getTapTimeout() >> 16), 1961969738 - (ViewConfiguration.getPressedStateDuration() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 125, (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f22928j + 113;
        f22925f = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return strIntern;
    }

    @Override // o.de.d
    public final BackoffPolicy c() {
        int i2 = 2 % 2;
        int i3 = f22925f + 77;
        f22928j = i3 % 128;
        int i4 = i3 % 2;
        BackoffPolicy backoffPolicy = BackoffPolicy.EXPONENTIAL;
        int i5 = f22928j + 91;
        f22925f = i5 % 128;
        int i6 = i5 % 2;
        return backoffPolicy;
    }

    @Override // o.de.d
    public final boolean c(g gVar) {
        int i2 = 2 % 2;
        if (gVar == g.f22870o || gVar == g.f22875t) {
            return true;
        }
        int i3 = f22928j + 53;
        f22925f = i3 % 128;
        int i4 = i3 % 2;
        if (gVar == g.f22871p) {
            return true;
        }
        int i5 = f22925f + 87;
        f22928j = i5 % 128;
        int i6 = i5 % 2;
        if (gVar == g.f22866k) {
            return true;
        }
        int i7 = f22925f + 53;
        f22928j = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 99 / 0;
        }
        return false;
    }

    @Override // o.de.d
    public final g d(o.bg.c cVar) {
        int i2 = 2 % 2;
        o.bg.e eVarB = cVar.b();
        if (eVarB == o.bg.e.f21106d) {
            int i3 = f22928j + 59;
            f22925f = i3 % 128;
            if (i3 % 2 != 0) {
                return g.f22870o;
            }
            g gVar = g.f22870o;
            throw null;
        }
        if (eVarB == o.bg.e.f21104b) {
            return g.f22875t;
        }
        if (eVarB == o.bg.e.f21115m) {
            int i4 = f22925f + 29;
            f22928j = i4 % 128;
            int i5 = i4 % 2;
            if (cVar.e().b() == g.f22859d) {
                return g.f22871p;
            }
        }
        return g.f22866k;
    }

    @Override // o.de.d
    public final int e(int i2) {
        int i3 = 2 % 2;
        int i4 = f22925f + 23;
        f22928j = i4 % 128;
        int i5 = i4 % 2;
        int iPow = ((int) Math.pow(2.0d, i2 - 1)) * 120;
        int i6 = f22925f + 117;
        f22928j = i6 % 128;
        int i7 = i6 % 2;
        return iPow;
    }

    @Override // o.de.d
    public final boolean e(o.bg.c cVar, o.dd.c cVar2) {
        int i2 = 2 % 2;
        int i3 = f22925f + 77;
        f22928j = i3 % 128;
        int i4 = i3 % 2;
        if (cVar2.e() != o.az.a.f20791b) {
            int i5 = f22925f + 97;
            f22928j = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i6 = o.bg.c.f21082a * 1232037242;
        o.bg.c.f21082a = i6;
        int iMyUid = Process.myUid();
        int i7 = o.bg.c.f21083c * 1942342535;
        o.bg.c.f21083c = i7;
        if (((Boolean) o.bg.c.a(i6, i7, iMyUid, -1017985026, new Object[]{cVar}, 1017985027, new Random().nextInt())).booleanValue()) {
            int i8 = f22925f + 91;
            f22928j = i8 % 128;
            int i9 = i8 % 2;
            if (cVar.e().d()) {
                int i10 = f22928j + 37;
                f22925f = i10 % 128;
                int i11 = i10 % 2;
                return true;
            }
        }
        return false;
    }
}
