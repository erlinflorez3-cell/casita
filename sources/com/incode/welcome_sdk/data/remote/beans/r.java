package com.incode.welcome_sdk.data.remote.beans;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.incode.welcome_sdk.CameraFacing;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class r {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static char[] f9924a = null;

    /* JADX INFO: renamed from: b */
    private static boolean f9925b = false;

    /* JADX INFO: renamed from: c */
    private static boolean f9926c = false;

    /* JADX INFO: renamed from: d */
    private static int f9927d = 0;

    /* JADX INFO: renamed from: e */
    private static int f9928e = 0;

    /* JADX INFO: renamed from: g */
    private static int f9929g = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, short r10, byte r11) {
        /*
            int r0 = r11 * 50
            int r8 = 122 - r0
            byte[] r7 = com.incode.welcome_sdk.data.remote.beans.r.$$a
            int r0 = r9 * 4
            int r6 = r0 + 1
            int r5 = r10 + 4
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r7 != 0) goto L28
            r0 = r6
            r2 = r3
        L13:
            int r0 = -r0
            int r8 = r8 + r0
            r1 = r2
        L16:
            int r5 = r5 + 1
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r7[r5]
            goto L13
        L28:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.r.$$c(int, short, byte):java.lang.String");
    }

    public static final /* synthetic */ String c(CameraFacing cameraFacing) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f9928e + 57;
        f9929g = i3 % 128;
        if (i3 % 2 == 0) {
            d(cameraFacing);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strD = d(cameraFacing);
        int i4 = f9929g + 25;
        f9928e = i4 % 128;
        int i5 = i4 % 2;
        return strD;
    }

    static void init$0() {
        $$a = new byte[]{52, -20, 7, -120};
        $$b = 190;
    }

    private static final String d(CameraFacing cameraFacing) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f9929g + 5;
        f9928e = i3 % 128;
        int i4 = i3 % 2;
        int i5 = c.f9931c[cameraFacing.ordinal()];
        if (i5 == 1) {
            return "frontal";
        }
        if (i5 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Object[] objArr = new Object[1];
        f("\u0084\u0083\u0082\u0081", null, null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i6 = f9929g + 71;
        f9928e = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 73 / 0;
        }
        return strIntern;
    }

    private static void f(String str, String str2, int[] iArr, int i2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2;
        int i4 = 2 % 2;
        Object obj = null;
        Object charArray = str4;
        if (str4 != null) {
            int i5 = $11 + 71;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                str4.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray = str4.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object bytes = str3;
        if (str3 != null) {
            int i6 = $10 + 37;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        com.c.a.i iVar = new com.c.a.i();
        char[] cArr2 = f9924a;
        int i8 = 1;
        int i9 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 35;
                $11 = i11 % 128;
                if (i11 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                        Object objC = com.c.a.e.e.c(936178174);
                        if (objC == null) {
                            char cRed = (char) Color.red(i9);
                            int iIndexOf = 20 - TextUtils.indexOf("", "", i9);
                            int iMyPid = (Process.myPid() >> 22) + 846;
                            byte b2 = (byte) i9;
                            byte b3 = (byte) (b2 - 1);
                            String str$$c = $$c(b2, b3, (byte) (b3 + 1));
                            Class[] clsArr = new Class[i8];
                            clsArr[0] = Integer.TYPE;
                            objC = com.c.a.e.e.e(cRed, iIndexOf, iMyPid, 928445319, false, str$$c, clsArr);
                        }
                        cArr3[i10] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                        i10 >>= 1;
                        i3 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i10])};
                    Object objC2 = com.c.a.e.e.c(936178174);
                    if (objC2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objC2 = com.c.a.e.e.e((char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getOffsetAfter("", 0) + 20, ImageFormat.getBitsPerPixel(0) + 847, 928445319, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
                    i10++;
                    i3 = 2;
                    i8 = 1;
                }
                i9 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(f9927d)};
        Object objC3 = com.c.a.e.e.c(-1774242729);
        if (objC3 == null) {
            objC3 = com.c.a.e.e.e((char) (35038 - (ViewConfiguration.getPressedStateDuration() >> 16)), 16 - TextUtils.getOffsetBefore("", 0), TextUtils.indexOf("", "") + 1362, -1767557586, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objC3).invoke(null, objArr4)).intValue();
        if (!(!f9925b)) {
            iVar.f2754b = bArr.length;
            char[] cArr4 = new char[iVar.f2754b];
            iVar.f2755c = 0;
            while (iVar.f2755c < iVar.f2754b) {
                cArr4[iVar.f2755c] = (char) (cArr2[bArr[(iVar.f2754b - 1) - iVar.f2755c] + i2] - iIntValue);
                Object[] objArr5 = {iVar, iVar};
                Object objC4 = com.c.a.e.e.c(-1471606930);
                if (objC4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objC4 = com.c.a.e.e.e((char) (Process.getGidForName("") + 49814), 21 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Color.green(0) + 1342, -1462563561, false, $$c(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i12 = 0;
        if (f9926c) {
            iVar.f2754b = cArr.length;
            char[] cArr5 = new char[iVar.f2754b];
            iVar.f2755c = 0;
            while (iVar.f2755c < iVar.f2754b) {
                int i13 = $11 + 29;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = iVar.f2755c;
                    int i15 = iVar.f2754b;
                    int i16 = iVar.f2755c;
                    cArr5[i14] = (char) (cArr2[cArr[0] << i2] - iIntValue);
                    Object[] objArr6 = {iVar, iVar};
                    Object objC5 = com.c.a.e.e.c(-1471606930);
                    if (objC5 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 - 1);
                        objC5 = com.c.a.e.e.e((char) (49813 - View.resolveSize(0, 0)), 21 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 1342, -1462563561, false, $$c(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objC5).invoke(null, objArr6);
                } else {
                    cArr5[iVar.f2755c] = (char) (cArr2[cArr[(iVar.f2754b - 1) - iVar.f2755c] - i2] - iIntValue);
                    Object[] objArr7 = {iVar, iVar};
                    Object objC6 = com.c.a.e.e.c(-1471606930);
                    if (objC6 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 - 1);
                        objC6 = com.c.a.e.e.e((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49813), 20 - TextUtils.getOffsetAfter("", 0), 1343 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1462563561, false, $$c(b10, b11, (byte) (-b11)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objC6).invoke(null, objArr7);
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        iVar.f2754b = iArr.length;
        char[] cArr6 = new char[iVar.f2754b];
        while (true) {
            iVar.f2755c = i12;
            if (iVar.f2755c >= iVar.f2754b) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[iVar.f2755c] = (char) (cArr2[iArr[(iVar.f2754b - 1) - iVar.f2755c] - i2] - iIntValue);
                i12 = iVar.f2755c + 1;
            }
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: b */
        private static int f9930b = 0;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f9931c;

        /* JADX INFO: renamed from: d */
        private static int f9932d = 1;

        static {
            int[] iArr = new int[CameraFacing.values().length];
            try {
                iArr[CameraFacing.FRONT.ordinal()] = 1;
                int i2 = f9932d + 97;
                f9930b = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraFacing.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9931c = iArr;
            int i5 = f9930b + 27;
            f9932d = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f9928e = 0;
        f9929g = 1;
        f9924a = new char[]{64365, 64364, 64362, 64370};
        f9927d = -1867973873;
        f9926c = true;
        f9925b = true;
    }
}
