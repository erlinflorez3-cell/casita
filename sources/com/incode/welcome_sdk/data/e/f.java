package com.incode.welcome_sdk.data.e;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.c.a.o;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public class f {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f7667a = 0;

    /* JADX INFO: renamed from: c */
    private static int f7668c = 0;

    /* JADX INFO: renamed from: d */
    private static char[] f7669d = null;

    /* JADX INFO: renamed from: e */
    private static int f7670e = 0;

    /* JADX INFO: renamed from: g */
    private static int f7671g = 0;

    /* JADX INFO: renamed from: b */
    private b f7672b;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, short r10, int r11) {
        /*
            int r8 = r10 + 102
            byte[] r7 = com.incode.welcome_sdk.data.e.f.$$a
            int r0 = r11 * 4
            int r6 = r0 + 4
            int r0 = r9 * 2
            int r5 = 1 - r0
            byte[] r4 = new byte[r5]
            r3 = 0
            if (r7 != 0) goto L2b
            r8 = r5
            r1 = r6
            r2 = r3
        L14:
            int r0 = -r6
            int r8 = r8 + r0
            int r6 = r1 + 1
            r1 = r2
        L19:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r5) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            r0 = r7[r6]
            r1 = r6
            r6 = r0
            goto L14
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.e.f.$$c(byte, short, int):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{2, -89, MessagePack.Code.MAP32, MessagePack.Code.FLOAT32};
        $$b = 253;
    }

    public f(b bVar) throws Throwable {
        this.f7672b = bVar;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            e2.printStackTrace();
        }
    }

    private static void a() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7667a + 67;
        f7670e = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f(new int[]{0, 20, 186, 18}, false, "\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000", objArr);
        Cipher.getInstance(((String) objArr[0]).intern());
        int i5 = f7670e + 101;
        f7667a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static void f(int[] iArr, boolean z2, String str, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        o oVar = new o();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = f7669d;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = $10 + 35;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 0;
            while (i12 < length) {
                int i13 = $11 + 15;
                $10 = i13 % 128;
                int i14 = i13 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i12])};
                    Object objC = com.c.a.e.e.c(-1916745907);
                    if (objC == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objC = com.c.a.e.e.e((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 27 - TextUtils.getCapsMode("", i5, i5), 961 - (Process.myTid() >> 22), -1923431116, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i12] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    i12++;
                    i3 = 2;
                    i5 = 0;
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
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i6, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            oVar.f2783d = 0;
            char c2 = 0;
            while (oVar.f2783d < i7) {
                if (bArr[oVar.f2783d] == 1) {
                    int i15 = $11 + 125;
                    $10 = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i16 = oVar.f2783d;
                        Object[] objArr3 = {Integer.valueOf(cArr3[oVar.f2783d]), Integer.valueOf(c2)};
                        Object objC2 = com.c.a.e.e.c(83881166);
                        if (objC2 == null) {
                            objC2 = com.c.a.e.e.e((char) (Color.rgb(0, 0, 0) + 16837446), TextUtils.lastIndexOf("", '0') + 18, 33 - Color.argb(0, 0, 0, 0), 73789111, false, "j", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
                        int i17 = 59 / 0;
                    } else {
                        int i18 = oVar.f2783d;
                        Object[] objArr4 = {Integer.valueOf(cArr3[oVar.f2783d]), Integer.valueOf(c2)};
                        Object objC3 = com.c.a.e.e.c(83881166);
                        if (objC3 == null) {
                            objC3 = com.c.a.e.e.e((char) (60230 - View.MeasureSpec.getMode(0)), View.combineMeasuredStates(0, 0) + 17, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33, 73789111, false, "j", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i18] = ((Character) ((Method) objC3).invoke(null, objArr4)).charValue();
                    }
                } else {
                    int i19 = oVar.f2783d;
                    Object[] objArr5 = {Integer.valueOf(cArr3[oVar.f2783d]), Integer.valueOf(c2)};
                    Object objC4 = com.c.a.e.e.c(1697816169);
                    if (objC4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objC4 = com.c.a.e.e.e((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 60520), 20 - View.MeasureSpec.getMode(0), 922 - Color.green(0), 1705548816, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i19] = ((Character) ((Method) objC4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[oVar.f2783d];
                Object[] objArr6 = {oVar, oVar};
                Object objC5 = com.c.a.e.e.c(-2143286564);
                if (objC5 == null) {
                    objC5 = com.c.a.e.e.e((char) (KeyEvent.getDeadChar(0, 0) + 48810), Color.green(0) + 16, 100 - TextUtils.lastIndexOf("", '0', 0), -2133194587, false, "h", new Class[]{Object.class, Object.class});
                }
                ((Method) objC5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            i2 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i20 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i20, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i20);
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr6 = new char[i7];
            while (true) {
                oVar.f2783d = i2;
                if (oVar.f2783d >= i7) {
                    break;
                }
                int i21 = $11 + 75;
                $10 = i21 % 128;
                int i22 = i21 % 2;
                cArr6[oVar.f2783d] = cArr3[(i7 - oVar.f2783d) - 1];
                i2 = oVar.f2783d + 1;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i23 = 0;
            while (true) {
                oVar.f2783d = i23;
                if (oVar.f2783d >= i7) {
                    break;
                }
                cArr3[oVar.f2783d] = (char) (cArr3[oVar.f2783d] - iArr[2]);
                i23 = oVar.f2783d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void b() {
        f7669d = new char[]{30942, 30883, 30891, 30884, 30884, 30891, 30881, 31071, 31065, 31069, 30886, 30884, 31066, 30884, 30886, 31064, 31069, 31068, 30886, 30885};
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f7668c = 0;
        f7671g = 1;
        f7667a = 0;
        f7670e = 1;
        b();
        int i2 = f7671g + 67;
        f7668c = i2 % 128;
        int i3 = i2 % 2;
    }
}
