package com.incode.welcome_sdk.commons.httpinterceptors;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static char f5236a = 0;

    /* JADX INFO: renamed from: c */
    private static char f5237c = 0;

    /* JADX INFO: renamed from: e */
    private static char f5238e = 0;

    /* JADX INFO: renamed from: f */
    private static int f5239f = 0;

    /* JADX INFO: renamed from: g */
    private static int f5240g = 0;

    /* JADX INFO: renamed from: h */
    private static int f5241h = 0;

    /* JADX INFO: renamed from: i */
    private static char f5242i = 0;

    /* JADX INFO: renamed from: j */
    private static int f5243j = 0;

    /* JADX INFO: renamed from: b */
    private final byte[] f5244b;

    /* JADX INFO: renamed from: d */
    private final byte[] f5245d;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, byte r9, byte r10) {
        /*
            int r0 = r10 * 4
            int r0 = 3 - r0
            int r1 = r8 * 3
            int r8 = 1 - r1
            byte[] r7 = com.incode.welcome_sdk.commons.httpinterceptors.j.$$a
            int r1 = r9 * 5
            int r6 = 110 - r1
            byte[] r5 = new byte[r8]
            r4 = 0
            if (r7 != 0) goto L2b
            r1 = r0
            r3 = r4
        L15:
            int r0 = -r0
            int r6 = r6 + r0
            r0 = r1
            r2 = r3
        L19:
            int r3 = r2 + 1
            byte r1 = (byte) r6
            r5[r2] = r1
            if (r3 != r8) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            int r1 = r0 + 1
            r0 = r7[r1]
            goto L15
        L2b:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.httpinterceptors.j.$$c(byte, byte, byte):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{34, -105, 53, -7};
        $$b = 37;
    }

    public j(byte[] bArr, byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        this.f5245d = bArr;
        this.f5244b = bArr2;
    }

    public final byte[] d() {
        int i2 = 2 % 2;
        int i3 = f5241h + 121;
        int i4 = i3 % 128;
        f5240g = i4;
        int i5 = i3 % 2;
        byte[] bArr = this.f5245d;
        int i6 = i4 + 87;
        f5241h = i6 % 128;
        if (i6 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    public final byte[] a() {
        int i2 = 2 % 2;
        int i3 = f5241h + 53;
        int i4 = i3 % 128;
        f5240g = i4;
        int i5 = i3 % 2;
        byte[] bArr = this.f5244b;
        int i6 = i4 + 99;
        f5241h = i6 % 128;
        int i7 = i6 % 2;
        return bArr;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            int i3 = f5240g + 95;
            f5241h = i3 % 128;
            int i4 = i3 % 2;
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        j jVar = (j) obj;
        if (Arrays.equals(this.f5245d, jVar.f5245d)) {
            if (!Arrays.equals(this.f5244b, jVar.f5244b)) {
                return false;
            }
            int i5 = f5241h + 15;
            f5240g = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 39 / 0;
            }
            return true;
        }
        int i7 = f5240g + 37;
        int i8 = i7 % 128;
        f5241h = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 39;
        f5240g = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 46 / 0;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f5241h + 125;
        f5240g = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (Arrays.hashCode(this.f5245d) * 31) + Arrays.hashCode(this.f5244b);
        int i5 = f5240g + 113;
        f5241h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return iHashCode;
    }

    private static void k(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        Object obj = str2;
        if (str2 != null) {
            char[] charArray = str2.toCharArray();
            int i5 = $11 + 61;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            obj = charArray;
        }
        char[] cArr = (char[]) obj;
        com.c.a.h hVar = new com.c.a.h();
        char[] cArr2 = new char[cArr.length];
        hVar.f2753d = 0;
        char[] cArr3 = new char[2];
        while (hVar.f2753d < cArr.length) {
            int i7 = $11 + 39;
            $10 = i7 % 128;
            int i8 = 58224;
            if (i7 % i3 != 0) {
                cArr3[1] = cArr[hVar.f2753d];
                cArr3[1] = cArr[hVar.f2753d - 1];
            } else {
                cArr3[0] = cArr[hVar.f2753d];
                cArr3[1] = cArr[hVar.f2753d + 1];
            }
            int i9 = 0;
            while (i9 < 16) {
                int i10 = $11 + 5;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i12 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) f5237c) ^ (-995256607575678378L))));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f5242i);
                    objArr2[i3] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objC = com.c.a.e.e.c(1785266233);
                    if (objC == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objC = com.c.a.e.e.e((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17, 600 - TextUtils.getCapsMode("", 0, 0), 1794310720, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f5238e) ^ (-995256607575678378L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f5236a)};
                    Object objC2 = com.c.a.e.e.c(1785266233);
                    if (objC2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objC2 = com.c.a.e.e.e((char) ((-1) - Process.getGidForName("")), 17 - MotionEvent.axisFromString(""), 601 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1794310720, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[hVar.f2753d] = cArr3[0];
            cArr2[hVar.f2753d + 1] = cArr3[1];
            Object[] objArr4 = {hVar, hVar};
            Object objC3 = com.c.a.e.e.c(-1055823967);
            if (objC3 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iLastIndexOf = 18 - TextUtils.lastIndexOf("", '0', 0);
                int iAlpha = Color.alpha(0) + 675;
                byte b6 = (byte) 0;
                byte b7 = b6;
                String str$$c = $$c(b6, b7, b7);
                i3 = 2;
                objC3 = com.c.a.e.e.e(doubleTapTimeout, iLastIndexOf, iAlpha, -1047829032, false, str$$c, new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objC3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void c() {
        f5238e = (char) 29452;
        f5236a = (char) 5838;
        f5237c = (char) 26560;
        f5242i = (char) 31819;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f5243j = 0;
        f5239f = 1;
        f5241h = 0;
        f5240g = 1;
        c();
        int i2 = f5239f + 101;
        f5243j = i2 % 128;
        int i3 = i2 % 2;
    }

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        String string = Arrays.toString(this.f5245d);
        String string2 = Arrays.toString(this.f5244b);
        StringBuilder sb = new StringBuilder(78);
        Object[] objArr = new Object[1];
        k("\udf3c嫨ꁥ\udef8䪽䦑佋ྱ쭷\uddfd烗阧稩碽ු쳳⒂㌒䗔㰏ꁥ\udef8䪽䦑佋ྱ禢䠓烅酛殭凞", 31 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(string);
        Object[] objArr2 = new Object[1];
        k("偷\ue6cc䗔㰏ꁥ\udef8䪽䦑佋ྱ蜦胏鳛籗", 14 - View.getDefaultSize(0, 0), objArr2);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr2[0]).intern()).append(string2);
        Object[] objArr3 = new Object[1];
        k("ꏤው", 1 - Color.blue(0), objArr3);
        String string3 = sbAppend2.append(((String) objArr3[0]).intern()).toString();
        int i3 = f5241h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f5240g = i3 % 128;
        int i4 = i3 % 2;
        return string3;
    }
}
