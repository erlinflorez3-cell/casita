package com.incode.welcome_sdk.commons.utils;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import java.util.Arrays;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static int f6673u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f6674v = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f6676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f6677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f6678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f6679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f6680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f6681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f6682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f6683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f6684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f6685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f6686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f6687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f6688n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f6689o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f6690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f6691q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Bitmap f6692r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f6693s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f6694t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f6695x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Rect f6696y;

    public y(FaceProcessingUtils.FaceLandmarksState faceLandmarksState, Bitmap bitmap, boolean z2, float f2) {
        this.f6676b = faceLandmarksState.rightEye.x;
        this.f6679e = faceLandmarksState.rightEye.y;
        this.f6675a = faceLandmarksState.leftEye.x;
        float f3 = faceLandmarksState.leftEye.y;
        this.f6678d = f3;
        this.f6677c = this.f6676b - this.f6675a;
        this.f6682h = this.f6679e - f3;
        float fSqrt = (float) Math.sqrt((r1 * r1) + (r0 * r0));
        this.f6683i = fSqrt;
        float f4 = fSqrt / 0.3849f;
        this.f6681g = f4;
        this.f6680f = f4;
        float f5 = this.f6676b - (0.3075f * f4);
        this.f6684j = f5;
        float f6 = this.f6679e - (0.397f * f4);
        this.f6688n = f6;
        float f7 = f4 * 1.2f;
        this.f6686l = f7;
        float f8 = 1.2f * f4;
        this.f6687m = f8;
        this.f6685k = f5 - ((f7 - f4) / 2.0f);
        this.f6689o = f6 - ((f8 - f4) / 2.0f);
        float f9 = this.f6685k;
        float f10 = this.f6689o;
        this.f6696y = new Rect((int) f9, (int) f10, (int) (f9 + this.f6686l), (int) (f10 + this.f6687m));
        this.f6691q = z2;
        if (bitmap != null) {
            this.f6690p = true;
            this.f6693s = bitmap.getWidth();
            this.f6694t = bitmap.getHeight();
            if (z2) {
                this.f6692r = d(bitmap, (int) this.f6685k, (int) this.f6689o, (int) this.f6686l, (int) this.f6687m);
            }
        }
        this.f6695x = Math.max(f2, 270.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.utils.y.f6674v
            int r1 = r0 + 27
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.y.f6673u = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 == 0) goto L2c
            boolean r1 = r4.f6691q
            r0 = 5
            int r0 = r0 / r2
            if (r1 == 0) goto L31
        L15:
            boolean r0 = r4.f6690p
            if (r0 != 0) goto L29
            java.lang.String r1 = "Trying to getBitmap() from MagicCrop, but frame is null"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            timber.log.Timber.w(r1, r0)
            int r0 = com.incode.welcome_sdk.commons.utils.y.f6673u
            int r1 = r0 + 99
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.y.f6674v = r0
            int r1 = r1 % r3
        L29:
            android.graphics.Bitmap r0 = r4.f6692r
            return r0
        L2c:
            boolean r0 = r4.f6691q
            if (r0 == 0) goto L31
            goto L15
        L31:
            java.lang.String r1 = "Trying to getBitmap() from MagicCrop, but storeBitmap was set to false"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            timber.log.Timber.w(r1, r0)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.y.b():android.graphics.Bitmap");
    }

    public final void c() {
        int i2 = 2 % 2;
        int i3 = f6674v + 103;
        f6673u = i3 % 128;
        int i4 = i3 % 2;
        Bitmap bitmap = this.f6692r;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int i5 = f6673u + 7;
        f6674v = i5 % 128;
        int i6 = i5 % 2;
        this.f6692r.recycle();
    }

    public final FaceProcessingUtils.FaceProcessingState a() {
        int i2 = 2 % 2;
        int i3 = f6673u + 71;
        f6674v = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (!this.f6690p) {
                Timber.w("Trying to checkFaceDistance() from MagicCrop, but frame is null", new Object[0]);
            }
            float fMax = (float) Math.max(((double) this.f6693s) * 0.75d, ((double) this.f6695x) * 1.5d);
            float f2 = this.f6686l;
            if (f2 > fMax || this.f6687m > ((double) this.f6694t) * 0.66d) {
                Timber.d("Face too close", new Object[0]);
                return FaceProcessingUtils.FaceProcessingState.FACE_TOO_CLOSE;
            }
            if (f2 < this.f6695x) {
                Timber.d("Face too far", new Object[0]);
                return FaceProcessingUtils.FaceProcessingState.INSUFFICIENT_FACE_SIZE;
            }
            FaceProcessingUtils.FaceProcessingState faceProcessingState = FaceProcessingUtils.FaceProcessingState.FACE_DETECTED;
            int i4 = f6674v + 75;
            f6673u = i4 % 128;
            if (i4 % 2 == 0) {
                return faceProcessingState;
            }
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    public final Rect e() {
        int i2 = 2 % 2;
        int i3 = f6674v + 77;
        int i4 = i3 % 128;
        f6673u = i4;
        int i5 = i3 % 2;
        Rect rect = this.f6696y;
        int i6 = i4 + 3;
        f6674v = i6 % 128;
        if (i6 % 2 != 0) {
            return rect;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static Bitmap d(Bitmap bitmap, int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        if (i2 >= 0 && i3 >= 0) {
            int i7 = f6674v + 25;
            f6673u = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i2 + i4;
            if (i9 <= bitmap.getWidth()) {
                int i10 = f6673u + 55;
                f6674v = i10 % 128;
                if (i10 % 2 != 0 ? i3 + i5 <= bitmap.getHeight() : i3 * i5 <= bitmap.getHeight()) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, bitmap.getConfig());
                    int iAbs = Math.abs(Math.min(0, i2));
                    int iAbs2 = i4 - Math.abs(Math.min(0, bitmap.getWidth() - i9));
                    int iAbs3 = i5 - Math.abs(Math.min(0, bitmap.getHeight() - (i3 + i5)));
                    if (iAbs2 > 0) {
                        int i11 = f6674v + 89;
                        f6673u = i11 % 128;
                        int i12 = i11 % 2;
                        if (iAbs3 > 0) {
                            int[] iArr = new int[bitmapCreateBitmap.getWidth() * bitmapCreateBitmap.getHeight()];
                            Arrays.fill(iArr, -2147483647);
                            bitmap.getPixels(iArr, iAbs, bitmapCreateBitmap.getWidth(), i2, i3, iAbs2, iAbs3);
                            bitmapCreateBitmap.setPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                        }
                    }
                    return bitmapCreateBitmap;
                }
            }
        }
        Timber.d("Magic crop null", new Object[0]);
        return null;
    }
}
