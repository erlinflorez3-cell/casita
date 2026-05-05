package com.google.mlkit.vision.common.internal;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class ImageUtils {
    private static final GmsLogger zza = new GmsLogger("MLKitImageUtils", "");
    private static final ImageUtils zzb = new ImageUtils();

    private ImageUtils() {
    }

    public static ImageUtils getInstance() {
        return zzb;
    }

    public IObjectWrapper getImageDataWrapper(InputImage inputImage) throws MlKitException {
        int format = inputImage.getFormat();
        if (format == -1) {
            return ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal()));
        }
        if (format != 17) {
            if (format == 35) {
                return ObjectWrapper.wrap(inputImage.getMediaImage());
            }
            if (format != 842094169) {
                throw new MlKitException("Unsupported image format: " + inputImage.getFormat(), 3);
            }
        }
        return ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()));
    }

    public int getMobileVisionImageFormat(InputImage inputImage) {
        return inputImage.getFormat();
    }

    public int getMobileVisionImageSize(InputImage inputImage) {
        if (inputImage.getFormat() == -1) {
            return ((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal())).getAllocationByteCount();
        }
        if (inputImage.getFormat() == 17 || inputImage.getFormat() == 842094169) {
            return ((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer())).limit();
        }
        if (inputImage.getFormat() != 35) {
            return 0;
        }
        return (((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()))[0].getBuffer().limit() * 3) / 2;
    }

    public Matrix getUprightRotationMatrix(int i2, int i3, int i4) {
        if (i4 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i2) / 2.0f, (-i3) / 2.0f);
        matrix.postRotate(i4 * 90);
        int i5 = i4 % 2;
        int i6 = i5 != 0 ? i3 : i2;
        if (i5 == 0) {
            i2 = i3;
        }
        matrix.postTranslate(i6 / 2.0f, i2 / 2.0f);
        return matrix;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00d8: INVOKE (r0 I:java.lang.String) = (r5 I:java.lang.Object) STATIC call: java.lang.String.valueOf(java.lang.Object):java.lang.String A[MD:(java.lang.Object):java.lang.String (c)], block:B:115:0x00d6 */
    public final Bitmap zza(ContentResolver contentResolver, Uri uri) throws IOException {
        String strValueOf;
        ExifInterface exifInterface;
        Bitmap bitmapCreateBitmap;
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            if (bitmap == null) {
                throw new IOException("The image Uri could not be resolved.");
            }
            int attributeInt = 0;
            if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                try {
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            exifInterface = new ExifInterface(inputStreamOpenInputStream);
                        } finally {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (Throwable e2) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, e2);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    } else {
                        exifInterface = null;
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                        } catch (IOException e3) {
                            zza.e("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(String.valueOf(uri))), e);
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    exifInterface = null;
                }
                if (exifInterface != null) {
                    attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                }
            }
            Matrix matrix = new Matrix();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            switch (attributeInt) {
                case 2:
                    matrix = new Matrix();
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 3:
                    matrix.postRotate(180.0f);
                    break;
                case 4:
                    matrix.postScale(1.0f, -1.0f);
                    break;
                case 5:
                    matrix.postRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 6:
                    matrix.postRotate(90.0f);
                    break;
                case 7:
                    matrix.postRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 8:
                    matrix.postRotate(-90.0f);
                    break;
                default:
                    matrix = null;
                    break;
            }
            if (matrix == null || bitmap == (bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true))) {
                return bitmap;
            }
            bitmap.recycle();
            return bitmapCreateBitmap;
        } catch (FileNotFoundException e5) {
            zza.e("MLKitImageUtils", "Could not open file: ".concat(String.valueOf(String.valueOf(strValueOf))), e5);
            throw e5;
        }
    }
}
