package com.incode.welcome_sdk.commons.utils;

import android.graphics.Point;
import androidx.core.util.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6485b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6486c = 0;

    public enum c {
        CROP_WIDTH,
        CROP_HEIGHT;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f6491b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f6494e = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f6495h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f6496i = 0;

        public static c valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f6491b + 97;
            f6494e = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            if (i4 != 0) {
                throw null;
            }
            int i5 = f6491b + 35;
            f6494e = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            int i2 = 2 % 2;
            int i3 = f6494e + 83;
            f6491b = i3 % 128;
            int i4 = i3 % 2;
            c[] cVarArr = (c[]) values().clone();
            int i5 = f6494e + 79;
            f6491b = i5 % 128;
            if (i5 % 2 != 0) {
                return cVarArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f6496i + 43;
            f6495h = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.utils.f$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f6487a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f6488b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f6489c;

        static {
            int[] iArr = new int[c.valuesCustom().length];
            f6489c = iArr;
            try {
                iArr[c.CROP_WIDTH.ordinal()] = 1;
                int i2 = f6488b + 67;
                f6487a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6489c[c.CROP_HEIGHT.ordinal()] = 2;
                int i5 = f6488b + 67;
                f6487a = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 76 / 0;
                }
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Rect a(int r8, int r9, int r10, int r11) {
        /*
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.commons.utils.f.f6486c
            int r1 = r0 + 25
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.f.f6485b = r0
            int r1 = r1 % r5
            java.lang.String r7 = "Child dimensions, width: %s, height: %s, aspectRatio: %s"
            r4 = 1
            r6 = 0
            if (r1 != 0) goto L41
            int[] r1 = com.incode.welcome_sdk.commons.utils.f.AnonymousClass1.f6489c
            com.incode.welcome_sdk.commons.utils.f$c r0 = b(r8, r9, r10, r11)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r4) goto L83
            if (r0 == r5) goto L53
        L22:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r1, r0}
            java.lang.String r0 = "Child position within parent, left: %s, top: %s, right: %s, bottom: %s"
            timber.log.Timber.d(r0, r1)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r6, r4, r10, r11)
            return r0
        L41:
            int[] r1 = com.incode.welcome_sdk.commons.utils.f.AnonymousClass1.f6489c
            com.incode.welcome_sdk.commons.utils.f$c r0 = b(r8, r9, r10, r11)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r4) goto L82
            if (r0 == r5) goto L53
            r4 = r6
            goto L22
        L53:
            java.lang.String r1 = "Adjusting height, matching width"
            java.lang.Object[] r0 = new java.lang.Object[r6]
            timber.log.Timber.d(r1, r0)
            int r9 = r9 * r10
            int r9 = r9 / r8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            float r1 = (float) r10
            float r0 = (float) r9
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r2, r0}
            timber.log.Timber.d(r7, r0)
            int r0 = r11 - r9
            int r4 = r0 / 2
            int r11 = r11 + r9
            int r11 = r11 / r5
            int r0 = com.incode.welcome_sdk.commons.utils.f.f6486c
            int r1 = r0 + 125
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.f.f6485b = r0
            int r1 = r1 % r5
            goto L22
        L82:
            r4 = r6
        L83:
            java.lang.String r1 = "Adjusting width, matching height"
            java.lang.Object[] r0 = new java.lang.Object[r6]
            timber.log.Timber.d(r1, r0)
            int r8 = r8 * r11
            int r8 = r8 / r9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            float r1 = (float) r8
            float r0 = (float) r11
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r2, r0}
            timber.log.Timber.d(r7, r0)
            int r0 = r10 - r8
            int r6 = r0 / 2
            int r10 = r10 + r8
            int r10 = r10 / r5
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.f.a(int, int, int, int):android.graphics.Rect");
    }

    private static float b(int i2, int i3, int i4, int i5, c cVar) {
        int i6 = 2 % 2;
        int i7 = f6485b + 87;
        f6486c = i7 % 128;
        int i8 = i7 % 2;
        int i9 = AnonymousClass1.f6489c[cVar.ordinal()];
        if (i9 == 1) {
            return i3 / i5;
        }
        if (i9 != 2) {
            return c(i2, i3, i4, i5);
        }
        float f2 = i2 / i4;
        int i10 = f6486c + 61;
        f6485b = i10 % 128;
        if (i10 % 2 != 0) {
            return f2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static float c(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = f6486c + 3;
        int i8 = i7 % 128;
        f6485b = i8;
        if (i7 % 2 != 0 ? i4 * i3 < i5 * i2 : i4 % i3 < (i5 << i2)) {
            return i3 / i5;
        }
        float f2 = i2 / i4;
        int i9 = i8 + 33;
        f6486c = i9 % 128;
        int i10 = i9 % 2;
        return f2;
    }

    public static c b(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        if (i4 * i3 < i5 * i2) {
            int i7 = f6486c + 79;
            f6485b = i7 % 128;
            int i8 = i7 % 2;
            return c.CROP_WIDTH;
        }
        c cVar = c.CROP_HEIGHT;
        int i9 = f6486c + 55;
        f6485b = i9 % 128;
        int i10 = i9 % 2;
        return cVar;
    }

    public static Point d(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = f6486c + 125;
        f6485b = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            c(i2, i3, i4, i5, null);
            obj.hashCode();
            throw null;
        }
        Point pointC = c(i2, i3, i4, i5, null);
        int i8 = f6485b + 51;
        f6486c = i8 % 128;
        if (i8 % 2 == 0) {
            return pointC;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point c(int r4, int r5, int r6, int r7, com.incode.welcome_sdk.commons.utils.f.c r8) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.utils.f.f6485b
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.f.f6486c = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L3f
            r0 = 5
            int r0 = r0 / 0
            if (r8 != 0) goto L20
        L13:
            com.incode.welcome_sdk.commons.utils.f$c r8 = b(r4, r5, r6, r7)
            int r0 = com.incode.welcome_sdk.commons.utils.f.f6485b
            int r1 = r0 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.f.f6486c = r0
            int r1 = r1 % r3
        L20:
            float r2 = b(r4, r5, r6, r7, r8)
            int[] r1 = com.incode.welcome_sdk.commons.utils.f.AnonymousClass1.f6489c
            int r0 = r8.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L3b
            if (r1 == r3) goto L37
        L31:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r6, r7)
            return r0
        L37:
            float r0 = (float) r5
            float r0 = r0 / r2
            int r7 = (int) r0
            goto L31
        L3b:
            float r0 = (float) r4
            float r0 = r0 / r2
            int r6 = (int) r0
            goto L31
        L3f:
            if (r8 != 0) goto L20
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.f.c(int, int, int, int, com.incode.welcome_sdk.commons.utils.f$c):android.graphics.Point");
    }

    private static float e(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = f6485b + 67;
        int i8 = i7 % 128;
        f6486c = i8;
        float f2 = i7 % 2 != 0 ? (i3 - i4) + (i2 - i5) : (i3 * i4) / (i2 * i5);
        int i9 = i8 + 115;
        f6485b = i9 % 128;
        int i10 = i9 % 2;
        return f2;
    }

    public static Pair<Float, Float> a(int i2, int i3, int i4, int i5, c cVar) {
        float f2;
        float f3;
        int i6 = 2 % 2;
        int i7 = f6485b + 81;
        f6486c = i7 % 128;
        if (i7 % 2 != 0) {
            f2 = 0.0f;
            if (cVar == null) {
                cVar = b(i2, i3, i4, i5);
                f3 = f2;
            } else {
                f3 = f2;
            }
        } else if (cVar == null) {
            f2 = 1.0f;
            cVar = b(i2, i3, i4, i5);
            f3 = f2;
        } else {
            f2 = 1.0f;
            f3 = f2;
        }
        float fE = e(i2, i3, i4, i5);
        int i8 = AnonymousClass1.f6489c[cVar.ordinal()];
        if (i8 == 1) {
            int i9 = f6485b + 101;
            f6486c = i9 % 128;
            int i10 = i9 % 2;
            f2 = fE;
        } else if (i8 == 2) {
            f3 = 1.0f / fE;
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f3));
    }
}
