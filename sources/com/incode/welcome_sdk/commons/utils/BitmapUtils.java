package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import android.util.Base64;
import androidx.core.util.Pair;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.recogkitandroid.Face;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class BitmapUtils {

    /* JADX INFO: renamed from: b */
    private static int f6263b = 1;

    /* JADX INFO: renamed from: c */
    private static int f6264c = 1;

    /* JADX INFO: renamed from: d */
    private static int f6265d = 0;

    /* JADX INFO: renamed from: e */
    private static int f6266e = 0;
    private static HashMap<String, Pair<Bitmap, Canvas>> staticBitmaps = new HashMap<>();

    public static Pair<Integer, Integer> getBitmapSize(Context context, Uri uri) {
        InputStream inputStreamOpenInputStream;
        int i2 = 2 % 2;
        Timber.d("getBitmapSize called", new Object[0]);
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        } catch (IOException unused) {
            inputStreamOpenInputStream = null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            inputStreamOpenInputStream.close();
            Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            int i3 = f6263b + 101;
            f6266e = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 28 / 0;
            }
            return pair;
        } catch (IOException unused2) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                    int i5 = f6263b + 15;
                    f6266e = i5 % 128;
                    int i6 = i5 % 2;
                } catch (IOException e2) {
                    Timber.e(e2, "Couldn't close the input stream", new Object[0]);
                }
            }
            return null;
        }
    }

    public static Pair<Integer, Integer> getBitmapSize(File file) {
        int i2 = 2 % 2;
        Timber.d("getBitmapSize called for photo file: %s", file);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        int i3 = f6263b + 15;
        f6266e = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 73 / 0;
        }
        return pair;
    }

    public static void saveBase64ImageToFile(String str, File file, String str2) {
        int i2 = 2 % 2;
        int i3 = f6263b + 103;
        f6266e = i3 % 128;
        int i4 = i3 % 2;
        saveBitmapToFile(getBitmapFromBase64(str), file, str2);
        int i5 = f6263b + 93;
        f6266e = i5 % 128;
        int i6 = i5 % 2;
    }

    public static File saveBitmapToFileWithUniqueFilename(Bitmap bitmap, File file, int i2) {
        int i3 = 2 % 2;
        int i4 = f6266e + 21;
        f6263b = i4 % 128;
        int i5 = i4 % 2;
        String strE = l.e();
        if (i5 != 0) {
            return saveBitmapToFile(bitmap, file, strE, i2);
        }
        saveBitmapToFile(bitmap, file, strE, i2);
        throw null;
    }

    public static File saveBitmapToFile(Bitmap bitmap, String str) {
        int i2 = 2 % 2;
        int i3 = f6266e + 81;
        f6263b = i3 % 128;
        return saveBitmapToFile(bitmap, str, i3 % 2 == 0 ? 41 : 100);
    }

    public static File saveBitmapToFile(Bitmap bitmap, File file, String str) {
        int i2 = 2 % 2;
        int i3 = f6266e + 29;
        f6263b = i3 % 128;
        int i4 = i3 % 2;
        File fileSaveBitmapToFile = saveBitmapToFile(bitmap, file, str, 100);
        int i5 = f6266e + 113;
        f6263b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return fileSaveBitmapToFile;
    }

    public static File saveBitmapToFile(Bitmap bitmap, String str, int i2) {
        File fileSaveBitmapToFile;
        int i3 = 2 % 2;
        int i4 = f6263b + 99;
        f6266e = i4 % 128;
        if (i4 % 2 != 0) {
            fileSaveBitmapToFile = saveBitmapToFile(bitmap, str, i2, Bitmap.CompressFormat.JPEG);
            int i5 = 99 / 0;
        } else {
            fileSaveBitmapToFile = saveBitmapToFile(bitmap, str, i2, Bitmap.CompressFormat.JPEG);
        }
        int i6 = f6263b + 77;
        f6266e = i6 % 128;
        int i7 = i6 % 2;
        return fileSaveBitmapToFile;
    }

    public static File saveBitmapToFile(Bitmap bitmap, File file, String str, int i2) {
        int i3 = 2 % 2;
        int i4 = f6266e + 91;
        f6263b = i4 % 128;
        int i5 = i4 % 2;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        if (i5 != 0) {
            return saveBitmapToFile(bitmap, file, str, i2, compressFormat);
        }
        saveBitmapToFile(bitmap, file, str, i2, compressFormat);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static File saveBitmapToFile(Bitmap bitmap, File file, String str, int i2, Bitmap.CompressFormat compressFormat) {
        int i3 = 2 % 2;
        File fileSaveBitmapToFile = saveBitmapToFile(bitmap, new File(file, str), i2, compressFormat);
        int i4 = f6266e + 115;
        f6263b = i4 % 128;
        if (i4 % 2 != 0) {
            return fileSaveBitmapToFile;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static File saveBitmapToFile(Bitmap bitmap, String str, int i2, Bitmap.CompressFormat compressFormat) {
        int i3 = 2 % 2;
        File fileSaveBitmapToFile = saveBitmapToFile(bitmap, new File(str), i2, compressFormat);
        int i4 = f6263b + 63;
        f6266e = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return fileSaveBitmapToFile;
    }

    public static File saveBitmapToFile(Bitmap bitmap, File file) {
        int i2 = 2 % 2;
        int i3 = f6266e + 23;
        f6263b = i3 % 128;
        File fileSaveBitmapToFile = saveBitmapToFile(bitmap, file, i3 % 2 == 0 ? 109 : 100);
        int i4 = f6266e + 45;
        f6263b = i4 % 128;
        int i5 = i4 % 2;
        return fileSaveBitmapToFile;
    }

    public static File saveBitmapToFile(Bitmap bitmap, File file, int i2) {
        int i3 = 2 % 2;
        int i4 = f6266e + 125;
        f6263b = i4 % 128;
        int i5 = i4 % 2;
        File fileSaveBitmapToFile = saveBitmapToFile(bitmap, file, i2, Bitmap.CompressFormat.JPEG);
        int i6 = f6263b + 121;
        f6266e = i6 % 128;
        int i7 = i6 % 2;
        return fileSaveBitmapToFile;
    }

    public static File saveBitmapToFile(Bitmap bitmap, File file, int i2, Bitmap.CompressFormat compressFormat) {
        int i3 = 2 % 2;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(compressFormat, i2, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            int i4 = f6263b + 33;
            f6266e = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e2) {
            Timber.e(e2, "Couldn't save bitmap to file", new Object[0]);
        }
        int i6 = f6263b + 85;
        f6266e = i6 % 128;
        int i7 = i6 % 2;
        return file;
    }

    public static Bitmap replaceAlphaWithColor(Bitmap bitmap, int i2) {
        int i3 = 2 % 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        bitmapCreateBitmap.eraseColor(i2);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        bitmap.recycle();
        int i4 = f6263b + 111;
        f6266e = i4 % 128;
        if (i4 % 2 == 0) {
            return bitmapCreateBitmap;
        }
        throw null;
    }

    public static Bitmap getNewColorBitmap(Bitmap bitmap, int i2) {
        int i3 = 2 % 2;
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        new Canvas(bitmapCopy).drawBitmap(bitmapCopy, 0.0f, 0.0f, paint);
        int i4 = f6266e + 89;
        f6263b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return bitmapCopy;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap getScaledRotatedBitmapInPlace(java.io.File r7, int r8, int r9) {
        /*
            r6 = 2
            int r0 = r6 % r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "getScaledRotatedBitmapInPlace called, targetWidth: %s, targetHeight: %s"
            timber.log.Timber.v(r0, r1)
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r5.inPreferredConfig = r0
            r0 = 1
            r5.inJustDecodeBounds = r0
            java.lang.String r0 = r7.getAbsolutePath()
            android.graphics.BitmapFactory.decodeFile(r0, r5)
            int r0 = r5.outWidth
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r5.outHeight
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Original width: %s, original height: %s"
            timber.log.Timber.v(r0, r1)
            int r4 = getRotationFromExif(r7)
            r0 = 90
            if (r4 == r0) goto L51
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b
            int r1 = r0 + 33
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e = r0
            int r1 = r1 % r6
            r0 = 270(0x10e, float:3.78E-43)
            if (r4 != r0) goto L54
        L51:
            r0 = r9
            r9 = r8
            r8 = r0
        L54:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Target after rotation: width: %s, target height: %s"
            timber.log.Timber.v(r0, r1)
            int r2 = calculateInSampleSize(r5, r8, r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "scaleFactor: %s"
            timber.log.Timber.v(r0, r1)
            r3 = 0
            r5.inJustDecodeBounds = r3
            r5.inSampleSize = r2
            java.lang.String r0 = r7.getAbsolutePath()
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r0, r5)
            if (r2 != 0) goto L8e
            java.lang.String r1 = "Could not decode file as bitmap"
            java.lang.Object[] r0 = new java.lang.Object[r3]
            timber.log.Timber.w(r1, r0)
            r0 = 0
            return r0
        L8e:
            int r0 = r2.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "End width: %s, end height: %s"
            timber.log.Timber.v(r0, r1)
            if (r4 == 0) goto Lc0
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b
            int r1 = r0 + 11
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e = r0
            int r1 = r1 % r6
            float r0 = (float) r4
            android.graphics.Bitmap r2 = rotateBitmap(r2, r0)
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b = r0
            int r1 = r1 % r6
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.BitmapUtils.getScaledRotatedBitmapInPlace(java.io.File, int, int):android.graphics.Bitmap");
    }

    public static Bitmap getRotatedBitmapInPlace(File file, float f2) {
        int i2 = 2 % 2;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), new BitmapFactory.Options());
        if (bitmapDecodeFile != null) {
            Timber.v("End width: %s, end height: %s", Integer.valueOf(bitmapDecodeFile.getWidth()), Integer.valueOf(bitmapDecodeFile.getHeight()));
            if (f2 == 0.0f) {
                return bitmapDecodeFile;
            }
            int i3 = f6263b + 115;
            f6266e = i3 % 128;
            int i4 = i3 % 2;
            return rotateBitmap(bitmapDecodeFile, f2);
        }
        int i5 = f6266e + 125;
        f6263b = i5 % 128;
        int i6 = i5 % 2;
        Timber.w("Could not decode file as bitmap", new Object[0]);
        return null;
    }

    public static int getRotationFromExif(File file) {
        int attributeInt;
        int i2 = 2 % 2;
        try {
            attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            int i3 = f6266e + 121;
            f6263b = i3 % 128;
            int i4 = i3 % 2;
        } catch (IOException e2) {
            Timber.log(6, e2);
            attributeInt = 0;
        }
        if (attributeInt == 3) {
            int i5 = f6263b + 65;
            f6266e = i5 % 128;
            int i6 = i5 % 2;
            return 180;
        }
        if (attributeInt == 6) {
            return 90;
        }
        if (attributeInt != 8) {
            return 0;
        }
        int i7 = f6263b + 95;
        f6266e = i7 % 128;
        int i8 = i7 % 2;
        return 270;
    }

    public static Bitmap getScaledRotatedBitmapThatFitsBounds(File file, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f6266e + 43;
        f6263b = i5 % 128;
        int i6 = i5 % 2;
        Timber.v("getScaledRotatedBitmapThatFitsBounds called, targetWidth: %s, targetHeight: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        Bitmap scaledBitmapThatFitsBounds = getScaledBitmapThatFitsBounds(getScaledRotatedBitmapInPlace(file, i2, i3), i2, i3);
        int i7 = f6263b + 113;
        f6266e = i7 % 128;
        int i8 = i7 % 2;
        return scaledBitmapThatFitsBounds;
    }

    public static Bitmap getScaledBitmapThatFitsBounds(Bitmap bitmap, int i2, int i3) {
        float f2;
        int i4 = 2 % 2;
        Timber.v("getScaledBitmapThatFitsBounds called, targetWidth: %s, targetHeight: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        Object obj = null;
        if (bitmap == null) {
            Timber.w("Source bitmap is null", new Object[0]);
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= i3 && height <= i3) {
            i2 = width;
            i3 = height;
        } else if (width > height) {
            int i5 = f6266e + 59;
            f6263b = i5 % 128;
            if (i5 % 2 == 0) {
                f2 = height - (width / i2);
            } else {
                f2 = height / (width / i2);
            }
            i3 = (int) f2;
        } else if (height > width) {
            int i6 = f6263b + 37;
            f6266e = i6 % 128;
            int i7 = i6 % 2;
            i2 = (int) (width / (height / i3));
        }
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, false);
        bitmap.recycle();
        int i8 = f6266e + 35;
        f6263b = i8 % 128;
        if (i8 % 2 != 0) {
            return bitmapCreateScaledBitmap;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap decodeByteArray(byte[] r6, int r7, int r8) {
        /*
            r5 = 2
            int r0 = r5 % r5
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r0 = 1
            r4.inJustDecodeBounds = r0
            int r0 = r6.length
            r3 = 0
            android.graphics.BitmapFactory.decodeByteArray(r6, r3, r0, r4)
            int r2 = r4.outWidth
            int r0 = r4.outHeight
            if (r2 > r7) goto L18
            if (r0 <= r8) goto L56
        L18:
            if (r2 <= r0) goto L47
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b
            int r1 = r0 + 5
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L43
            float r2 = (float) r2
            float r0 = (float) r7
            float r2 = r2 % r0
        L28:
            double r0 = (double) r2
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            r4.inSampleSize = r0
            r4.inJustDecodeBounds = r3
            int r0 = r6.length
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r6, r3, r0, r4)
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e
            int r1 = r0 + 115
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L59
            return r2
        L43:
            float r2 = (float) r2
            float r0 = (float) r7
            float r2 = r2 / r0
            goto L28
        L47:
            if (r0 <= r2) goto L56
            float r2 = (float) r0
            float r0 = (float) r8
            float r2 = r2 / r0
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e
            int r1 = r0 + 55
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b = r0
            int r1 = r1 % r5
            goto L28
        L56:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L28
        L59:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.BitmapUtils.decodeByteArray(byte[], int, int):android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0018 A[PHI: r2 r3 r4
  0x0018: PHI (r2v5 int) = (r2v0 int), (r2v6 int) binds: [B:46:0x003f, B:32:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0018: PHI (r3v4 int) = (r3v0 int), (r3v5 int) binds: [B:46:0x003f, B:32:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x0018: PHI (r4v4 int) = (r4v0 int), (r4v5 int) binds: [B:46:0x003f, B:32:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[PHI: r2 r3 r4
  PHI (r2v1 int) = (r2v0 int), (r2v5 int), (r2v5 int), (r2v6 int) binds: [B:46:0x003f, B:43:0x0035, B:36:0x0025, B:32:0x0016] A[DONT_GENERATE, DONT_INLINE]
  PHI (r3v1 int) = (r3v0 int), (r3v4 int), (r3v4 int), (r3v5 int) binds: [B:46:0x003f, B:43:0x0035, B:36:0x0025, B:32:0x0016] A[DONT_GENERATE, DONT_INLINE]
  PHI (r4v1 int) = (r4v0 int), (r4v4 int), (r4v4 int), (r4v5 int) binds: [B:46:0x003f, B:43:0x0035, B:36:0x0025, B:32:0x0016] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int calculateInSampleSize(android.graphics.BitmapFactory.Options r7, int r8, int r9) {
        /*
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b
            int r1 = r0 + 31
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e = r0
            int r1 = r1 % r6
            r5 = 1
            if (r1 == 0) goto L38
            int r4 = r7.outHeight
            int r3 = r7.outWidth
            int r0 = 5 - r9
            r2 = 0
            if (r4 > r0) goto L27
        L18:
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e
            int r1 = r0 + 25
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b = r0
            int r1 = r1 % r6
            if (r1 != 0) goto L33
            int r0 = r6 % r8
            if (r3 <= r0) goto L32
        L27:
            int r2 = r2 << r5
            int r4 = r4 / r6
            int r3 = r3 / r6
            int r0 = r9 * 2
            if (r4 > r0) goto L27
            int r0 = r8 * 2
            if (r3 > r0) goto L27
        L32:
            return r2
        L33:
            int r0 = r8 * 2
            if (r3 <= r0) goto L32
            goto L27
        L38:
            int r4 = r7.outHeight
            int r3 = r7.outWidth
            int r0 = r9 * 2
            r2 = r5
            if (r4 > r0) goto L27
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.BitmapUtils.calculateInSampleSize(android.graphics.BitmapFactory$Options, int, int):int");
    }

    public static int calculateRectangleEnlargementFactor(int i2, int i3, int i4, int i5) {
        int iMax;
        int i6 = 2 % 2;
        if (i4 != 0) {
            int i7 = f6263b + 123;
            f6266e = i7 % 128;
            iMax = Math.max(0, i7 % 2 != 0 ? (i5 / i2) * i4 : i4 - (i5 / i2));
            int i8 = f6266e + 63;
            f6263b = i8 % 128;
            int i9 = i8 % 2;
        } else {
            iMax = 0;
        }
        while (true) {
            int i10 = ((i5 / i2) << 1) + i5;
            if ((i4 == 0 || iMax != 0) && iMax + i10 <= i3) {
                return i2;
            }
            i2 <<= 1;
            iMax = Math.max(0, i4 - (i5 / i2));
        }
    }

    public static Bitmap getRotatedCroppedBitmapFromFrame(Context context, byte[] bArr, int i2, int i3, float f2, float f3, int i4) {
        int i5 = 2 % 2;
        int i6 = f6266e + 73;
        f6263b = i6 % 128;
        int i7 = i6 % 2;
        Bitmap bitmapCropBitmap = cropBitmap(rotateBitmap(getBitmapFromFrameData(context, bArr, i2, i3), i4), f2, f3);
        int i8 = f6263b + 125;
        f6266e = i8 % 128;
        int i9 = i8 % 2;
        return bitmapCropBitmap;
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, float f2) {
        int i2 = 2 % 2;
        int i3 = f6263b + 111;
        f6266e = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (bitmap == null || f2 == 0.0f) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        int i4 = f6263b + 31;
        f6266e = i4 % 128;
        if (i4 % 2 == 0) {
            return bitmapCreateBitmap;
        }
        throw null;
    }

    public static Bitmap cropBitmap(Bitmap bitmap, float f2, float f3) {
        int i2 = 2 % 2;
        int i3 = f6266e + 113;
        int i4 = i3 % 128;
        f6263b = i4;
        int i5 = i3 % 2;
        if (f2 >= 1.0f) {
            int i6 = i4 + 123;
            int i7 = i6 % 128;
            f6266e = i7;
            if (i6 % 2 == 0 ? f3 >= 1.0f : f3 >= 1.0f) {
                int i8 = i7 + 123;
                int i9 = i8 % 128;
                f6263b = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 3;
                f6266e = i11 % 128;
                if (i11 % 2 == 0) {
                    return bitmap;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int iCalculateTotalXCrop = calculateTotalXCrop(bitmap, f2);
        int iCalculateTotalYCrop = calculateTotalYCrop(bitmap, f3);
        return Bitmap.createBitmap(bitmap, iCalculateTotalXCrop / 2, iCalculateTotalYCrop / 2, Math.max(0, bitmap.getWidth() - iCalculateTotalXCrop), Math.max(0, bitmap.getHeight() - iCalculateTotalYCrop));
    }

    private static int calculateTotalXCrop(Bitmap bitmap, float f2) {
        int i2 = 2 % 2;
        int i3 = f6266e;
        int i4 = i3 + 101;
        f6263b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (bitmap == null || f2 <= 0.0f) {
            return 0;
        }
        int i5 = i3 + 105;
        f6263b = i5 % 128;
        if (i5 % 2 == 0) {
            if (f2 >= 2.0f) {
                return 0;
            }
        } else if (f2 >= 1.0f) {
            return 0;
        }
        return (int) ((1.0f - f2) * bitmap.getWidth());
    }

    private static int calculateTotalYCrop(Bitmap bitmap, float f2) {
        int i2 = 2 % 2;
        int i3 = f6266e + 121;
        int i4 = i3 % 128;
        f6263b = i4;
        int i5 = i3 % 2;
        if (bitmap == null) {
            return 0;
        }
        int i6 = i4 + 69;
        f6266e = i6 % 128;
        if (i6 % 2 != 0) {
            if (f2 <= 2.0f) {
                return 0;
            }
        } else if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= 1.0f) {
            return 0;
        }
        return (int) ((1.0f - f2) * bitmap.getHeight());
    }

    public static Bitmap mirror(Bitmap bitmap) {
        int i2 = 2 % 2;
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        bitmapCreateBitmap.setDensity(160);
        int i3 = f6266e + 15;
        f6263b = i3 % 128;
        int i4 = i3 % 2;
        return bitmapCreateBitmap;
    }

    public static float compareEquivalence(Bitmap bitmap, Bitmap bitmap2) {
        int i2 = 2 % 2;
        int i3 = f6263b;
        int i4 = i3 + 59;
        f6266e = i4 % 128;
        int i5 = i4 % 2;
        if (bitmap == null) {
            return 0.0f;
        }
        int i6 = i3 + 25;
        f6266e = i6 % 128;
        int i7 = i6 % 2;
        if (bitmap2 == null || bitmap.getWidth() != bitmap2.getWidth() || bitmap.getHeight() != bitmap2.getHeight()) {
            return 0.0f;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getHeight() * bitmap.getRowBytes());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bitmap2.getHeight() * bitmap2.getRowBytes());
        bitmap2.copyPixelsToBuffer(byteBufferAllocate2);
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArrArray2 = byteBufferAllocate2.array();
        int length = bArrArray.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = f6263b + 111;
            int i11 = i10 % 128;
            f6266e = i11;
            int i12 = i10 % 2;
            if (bArrArray[i9] == bArrArray2[i9]) {
                i8++;
                int i13 = i11 + 105;
                f6263b = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        return i8 / length;
    }

    public static float getTransparentPixelPercent(Bitmap bitmap) {
        int i2 = 2 % 2;
        if (bitmap == null) {
            int i3 = f6263b + 109;
            f6266e = i3 % 128;
            int i4 = i3 % 2;
            return 0.0f;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getHeight() * bitmap.getRowBytes());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        bitmap.recycle();
        byte[] bArrArray = byteBufferAllocate.array();
        int length = bArrArray.length;
        int i5 = 0;
        for (byte b2 : bArrArray) {
            if (b2 == 0) {
                int i6 = f6266e + 121;
                f6263b = i6 % 128;
                int i7 = i6 % 2;
                i5++;
            }
        }
        return i5 / length;
    }

    public static Bitmap getBitmapFromFile(File file) {
        int i2 = 2 % 2;
        int i3 = f6266e + 117;
        f6263b = i3 % 128;
        int i4 = i3 % 2;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
        if (i4 == 0) {
            int i5 = 93 / 0;
        }
        return bitmapDecodeFile;
    }

    public static Bitmap cropFaceFromBitmap(Bitmap bitmap, Face face) {
        int width;
        int height;
        int i2 = 2 % 2;
        int iMax = Math.max(0, (int) face.rect.f3644x);
        int iMax2 = Math.max(0, (int) face.rect.f3645y);
        int iMin = Math.min((int) face.rect.width, bitmap.getWidth());
        int iMin2 = Math.min((int) face.rect.height, bitmap.getHeight());
        Timber.v("google faceWidth: %s, faceHeight: %s, x: %s, y: %s, bitmapWidth: %s, bitmapHeight: %s", Integer.valueOf(iMin), Integer.valueOf(iMin2), Integer.valueOf(iMax), Integer.valueOf(iMax2), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        if (iMax + iMin >= bitmap.getWidth()) {
            width = bitmap.getWidth() - iMax;
        } else {
            int i3 = f6263b + 89;
            f6266e = i3 % 128;
            int i4 = i3 % 2;
            int iCalculateRectangleEnlargementFactor = iMin / calculateRectangleEnlargementFactor(8, bitmap.getWidth(), iMax, iMin);
            iMax = Math.max(0, iMax - iCalculateRectangleEnlargementFactor);
            width = iMin + (iCalculateRectangleEnlargementFactor << 1);
        }
        if (iMax2 + iMin2 < bitmap.getHeight()) {
            int iCalculateRectangleEnlargementFactor2 = iMin2 / calculateRectangleEnlargementFactor(8, bitmap.getHeight(), iMax2, iMin2);
            iMax2 = Math.max(0, iMax2 - iCalculateRectangleEnlargementFactor2);
            height = iMin2 + (iCalculateRectangleEnlargementFactor2 << 1);
        } else {
            height = bitmap.getHeight() - iMax2;
            int i5 = f6266e + 89;
            f6263b = i5 % 128;
            int i6 = i5 % 2;
        }
        Timber.v("google enlarged faceWidth: %s, faceHeight: %s, x: %s, y: %s, bitmap.faceWidth: %s, bitmap.faceHeight: %s", Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(iMax), Integer.valueOf(iMax2), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        return Bitmap.createBitmap(bitmap, iMax, iMax2, width, height);
    }

    public static String getBase64FromBitmap(Bitmap bitmap) {
        int i2 = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        int i3 = f6266e + 123;
        f6263b = i3 % 128;
        if (i3 % 2 != 0) {
            return strEncodeToString;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Bitmap getBitmapFromBase64(String str) {
        Bitmap bitmapDecodeByteArray;
        int i2 = 2 % 2;
        int i3 = f6263b + 41;
        f6266e = i3 % 128;
        if (i3 % 2 != 0) {
            byte[] bArrDecode = Base64.decode(str, 0);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 1, bArrDecode.length);
        } else {
            byte[] bArrDecode2 = Base64.decode(str, 0);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode2, 0, bArrDecode2.length);
        }
        int i4 = f6266e + 23;
        f6263b = i4 % 128;
        int i5 = i4 % 2;
        return bitmapDecodeByteArray;
    }

    public static String getEncryptedBase64(String str) {
        int i2 = 2 % 2;
        int i3 = f6263b + 11;
        f6266e = i3 % 128;
        int i4 = i3 % 2;
        try {
            String strE = ae.e(str, ae.c(str, ae.c()));
            int i5 = f6266e + 41;
            f6263b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 57 / 0;
            }
            return strE;
        } catch (Exception e2) {
            Timber.e(e2, "Couldn't encrypt image", new Object[0]);
            return null;
        }
    }

    public static Bitmap getBitmapFromFrameData(Context context, byte[] bArr, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f6266e + 3;
        f6263b = i5 % 128;
        int i6 = i5 % 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        renderScriptNV21ToRGBA888(context, i2, i3, bArr).copyTo(bitmapCreateBitmap);
        int i7 = f6266e + 121;
        f6263b = i7 % 128;
        if (i7 % 2 != 0) {
            return bitmapCreateBitmap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Allocation renderScriptNV21ToRGBA888(Context context, int i2, int i3, byte[] bArr) {
        int i4 = 2 % 2;
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGBCreate = ScriptIntrinsicYuvToRGB.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, new Type.Builder(renderScriptCreate, Element.U8(renderScriptCreate)).setX(bArr.length).create(), 1);
        Allocation allocationCreateTyped2 = Allocation.createTyped(renderScriptCreate, new Type.Builder(renderScriptCreate, Element.RGBA_8888(renderScriptCreate)).setX(i2).setY(i3).create(), 1);
        allocationCreateTyped.copyFrom(bArr);
        scriptIntrinsicYuvToRGBCreate.setInput(allocationCreateTyped);
        scriptIntrinsicYuvToRGBCreate.forEach(allocationCreateTyped2);
        int i5 = f6263b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f6266e = i5 % 128;
        int i6 = i5 % 2;
        return allocationCreateTyped2;
    }

    public static Bitmap cropToRect(Bitmap bitmap, Rect rect) {
        int i2 = 2 % 2;
        int i3 = f6263b + 1;
        f6266e = i3 % 128;
        int i4 = i3 % 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        int i5 = f6263b + 53;
        f6266e = i5 % 128;
        if (i5 % 2 == 0) {
            return bitmapCreateBitmap;
        }
        throw null;
    }

    public static Bitmap cropToRect(Bitmap bitmap, Rect rect, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = f6266e + 43;
        f6263b = i7 % 128;
        if (i7 % 2 == 0) {
            i4 = rect.left * i2;
            i5 = rect.top - i3;
        } else {
            i4 = rect.left + i2;
            i5 = rect.top + i3;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i4, i5, rect.width(), rect.height());
        int i8 = f6263b + 47;
        f6266e = i8 % 128;
        int i9 = i8 % 2;
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Matrix getTransformationMatrix(int r9, int r10, int r11, int r12, int r13, boolean r14) {
        /*
            r8 = 2
            int r0 = r8 % r8
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r7 = 1073741824(0x40000000, float:2.0)
            if (r13 == 0) goto L2b
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b = r0
            int r1 = r1 % r8
            int r0 = -r9
            float r1 = (float) r0
            float r1 = r1 / r7
            int r0 = -r10
            float r0 = (float) r0
            float r0 = r0 / r7
            r3.postTranslate(r1, r0)
            float r0 = (float) r13
            r3.postRotate(r0)
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b = r0
            int r1 = r1 % r8
        L2b:
            int r0 = java.lang.Math.abs(r13)
            int r0 = r0 + 90
            int r0 = r0 % 180
            r4 = 0
            if (r0 != 0) goto L9a
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b
            int r1 = r0 + 19
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e = r0
            int r1 = r1 % r8
            r4 = 1
        L40:
            r6 = 0
            if (r4 == 0) goto L98
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e
            int r1 = r0 + 125
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b = r0
            int r1 = r1 % r8
            if (r1 == 0) goto Lb3
            r5 = r10
        L4f:
            r2 = 83
            if (r4 == 0) goto L96
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b = r0
            int r1 = r1 % r8
            if (r1 != 0) goto L60
            int r0 = r2 / 0
        L60:
            if (r5 != r11) goto L6e
            int r1 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b
            int r1 = r1 + r2
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e = r0
            int r1 = r1 % r8
            if (r1 != 0) goto Laf
            if (r9 == r12) goto L88
        L6e:
            float r4 = (float) r11
            float r0 = (float) r5
            float r4 = r4 / r0
            float r2 = (float) r12
            float r0 = (float) r9
            float r2 = r2 / r0
            if (r14 == 0) goto L92
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b
            int r1 = r0 + 55
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e = r0
            int r1 = r1 % r8
            if (r1 != 0) goto La4
            float r0 = java.lang.Math.max(r4, r2)
            r3.postScale(r0, r0)
        L88:
            if (r13 == 0) goto L91
            float r1 = (float) r11
            float r1 = r1 / r7
            float r0 = (float) r12
            float r0 = r0 / r7
            r3.postTranslate(r1, r0)
        L91:
            return r3
        L92:
            r3.postScale(r4, r2)
            goto L88
        L96:
            r9 = r10
            goto L60
        L98:
            r5 = r9
            goto L4f
        L9a:
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e
            int r1 = r0 + 19
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b = r0
            int r1 = r1 % r8
            goto L40
        La4:
            float r0 = java.lang.Math.max(r4, r2)
            r3.postScale(r0, r0)
            r6.hashCode()
            throw r6
        Laf:
            r6.hashCode()
            throw r6
        Lb3:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.BitmapUtils.getTransformationMatrix(int, int, int, int, int, boolean):android.graphics.Matrix");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0016, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0018, code lost:
    
        r1 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b + 105;
        com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0021, code lost:
    
        if ((r1 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0023, code lost:
    
        r0 = 69 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0026, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002f, code lost:
    
        r3 = android.graphics.Bitmap.createBitmap(r4.getIntrinsicWidth(), r4.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        r2 = new android.graphics.Canvas(r3);
        r4.setBounds(0, 0, r2.getWidth(), r2.getHeight());
        r4.draw(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap getBitmapFromVectorDrawable(android.content.Context r6, int r7) {
        /*
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e
            int r1 = r0 + 33
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b = r0
            int r1 = r1 % r2
            r5 = 0
            if (r1 != 0) goto L28
            android.graphics.drawable.Drawable r4 = androidx.core.content.ContextCompat.getDrawable(r6, r7)
            r0 = 32
            int r0 = r0 / r5
            if (r4 != 0) goto L2f
        L18:
            int r0 = com.incode.welcome_sdk.commons.utils.BitmapUtils.f6263b
            int r1 = r0 + 105
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.BitmapUtils.f6266e = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L26
            r0 = 69
            int r0 = r0 / r5
        L26:
            r0 = 0
            return r0
        L28:
            android.graphics.drawable.Drawable r4 = androidx.core.content.ContextCompat.getDrawable(r6, r7)
            if (r4 != 0) goto L2f
            goto L18
        L2f:
            int r2 = r4.getIntrinsicWidth()
            int r1 = r4.getIntrinsicHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r3)
            int r1 = r2.getWidth()
            int r0 = r2.getHeight()
            r4.setBounds(r5, r5, r1, r0)
            r4.draw(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.BitmapUtils.getBitmapFromVectorDrawable(android.content.Context, int):android.graphics.Bitmap");
    }

    public static Bitmap getBitmapPreviewFromPdfFile(File file) {
        Bitmap bitmapCreateBitmap;
        ParcelFileDescriptor parcelFileDescriptorOpen;
        PdfRenderer pdfRenderer;
        PdfRenderer.Page pageOpenPage;
        int i2 = 2 % 2;
        Bitmap bitmap = null;
        try {
            parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
            pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
            pageOpenPage = pdfRenderer.openPage(0);
            bitmapCreateBitmap = Bitmap.createBitmap(pageOpenPage.getWidth(), pageOpenPage.getHeight(), Bitmap.Config.ARGB_8888);
        } catch (Exception e2) {
            e = e2;
        }
        try {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(-1);
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
            pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
            pageOpenPage.close();
            pdfRenderer.close();
            parcelFileDescriptorOpen.close();
            int i3 = f6266e + 67;
            f6263b = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e3) {
            e = e3;
            bitmap = bitmapCreateBitmap;
            Timber.e(e, "Couldn't load PDF preview", new Object[0]);
            bitmapCreateBitmap = bitmap;
        }
        int i5 = f6263b + 41;
        f6266e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return bitmapCreateBitmap;
    }

    public static int[] getPixels(Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = f6266e + 85;
        f6263b = i3 % 128;
        int i4 = i3 % 2;
        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int i5 = f6263b + 15;
        f6266e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return iArr;
    }

    static {
        int i2 = f6265d + 107;
        f6264c = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static Bitmap getMemoryLeakProtectedBitmap(Bitmap bitmap, String str) {
        Bitmap bitmapCopy;
        Canvas canvas;
        int i2 = 2 % 2;
        int i3 = f6266e + 97;
        f6263b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            staticBitmaps.get(str);
            obj.hashCode();
            throw null;
        }
        Pair<Bitmap, Canvas> pair = staticBitmaps.get(str);
        if (pair != null) {
            int i4 = f6266e + 117;
            f6263b = i4 % 128;
            if (i4 % 2 == 0) {
                Bitmap bitmap2 = pair.first;
                Canvas canvas2 = pair.second;
                throw null;
            }
            bitmapCopy = pair.first;
            canvas = pair.second;
        } else {
            bitmapCopy = null;
            canvas = null;
        }
        if (pair == null || bitmapCopy.isRecycled()) {
            bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
            canvas = new Canvas(bitmapCopy);
            staticBitmaps.put(str, Pair.create(bitmapCopy, canvas));
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapCopy;
    }

    public static void deleteMemoryLeakProtectedBitmap(String str) {
        int i2 = 2 % 2;
        int i3 = f6266e + 113;
        f6263b = i3 % 128;
        int i4 = i3 % 2;
        staticBitmaps.remove(str);
        int i5 = f6263b + 7;
        f6266e = i5 % 128;
        int i6 = i5 % 2;
    }
}
