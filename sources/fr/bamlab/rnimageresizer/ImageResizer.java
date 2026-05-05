package fr.bamlab.rnimageresizer;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.callback.Callback;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class ImageResizer {
    private static final String[] EXIF_TO_COPY_ROTATED = {ExifInterface.TAG_APERTURE_VALUE, ExifInterface.TAG_MAX_APERTURE_VALUE, ExifInterface.TAG_METERING_MODE, ExifInterface.TAG_ARTIST, ExifInterface.TAG_BITS_PER_SAMPLE, ExifInterface.TAG_COMPRESSION, ExifInterface.TAG_BODY_SERIAL_NUMBER, ExifInterface.TAG_BRIGHTNESS_VALUE, ExifInterface.TAG_CONTRAST, "CameraOwnerName", ExifInterface.TAG_COLOR_SPACE, ExifInterface.TAG_COPYRIGHT, ExifInterface.TAG_DATETIME, ExifInterface.TAG_DATETIME_DIGITIZED, ExifInterface.TAG_DATETIME_ORIGINAL, ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION, ExifInterface.TAG_DIGITAL_ZOOM_RATIO, ExifInterface.TAG_EXIF_VERSION, ExifInterface.TAG_EXPOSURE_BIAS_VALUE, ExifInterface.TAG_EXPOSURE_INDEX, ExifInterface.TAG_EXPOSURE_MODE, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_EXPOSURE_PROGRAM, ExifInterface.TAG_FLASH, ExifInterface.TAG_FLASH_ENERGY, ExifInterface.TAG_FOCAL_LENGTH, ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM, ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, ExifInterface.TAG_FOCAL_PLANE_X_RESOLUTION, ExifInterface.TAG_FOCAL_PLANE_Y_RESOLUTION, ExifInterface.TAG_PHOTOMETRIC_INTERPRETATION, ExifInterface.TAG_PLANAR_CONFIGURATION, ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_GAIN_CONTROL, ExifInterface.TAG_GAMMA, ExifInterface.TAG_GPS_ALTITUDE, ExifInterface.TAG_GPS_ALTITUDE_REF, ExifInterface.TAG_GPS_AREA_INFORMATION, ExifInterface.TAG_GPS_DATESTAMP, ExifInterface.TAG_GPS_DOP, ExifInterface.TAG_GPS_LATITUDE, ExifInterface.TAG_GPS_LATITUDE_REF, ExifInterface.TAG_GPS_LONGITUDE, ExifInterface.TAG_GPS_LONGITUDE_REF, ExifInterface.TAG_GPS_STATUS, ExifInterface.TAG_GPS_DEST_BEARING, ExifInterface.TAG_GPS_DEST_BEARING_REF, ExifInterface.TAG_GPS_DEST_DISTANCE, ExifInterface.TAG_GPS_DEST_DISTANCE_REF, ExifInterface.TAG_GPS_DEST_LATITUDE, ExifInterface.TAG_GPS_DEST_LATITUDE_REF, ExifInterface.TAG_GPS_DEST_LONGITUDE, ExifInterface.TAG_GPS_DEST_LONGITUDE_REF, ExifInterface.TAG_GPS_DIFFERENTIAL, ExifInterface.TAG_GPS_IMG_DIRECTION, ExifInterface.TAG_GPS_IMG_DIRECTION_REF, ExifInterface.TAG_GPS_MAP_DATUM, ExifInterface.TAG_GPS_MEASURE_MODE, ExifInterface.TAG_GPS_PROCESSING_METHOD, ExifInterface.TAG_GPS_SATELLITES, ExifInterface.TAG_GPS_SPEED, ExifInterface.TAG_GPS_SPEED_REF, ExifInterface.TAG_GPS_STATUS, ExifInterface.TAG_GPS_TIMESTAMP, ExifInterface.TAG_GPS_TRACK, ExifInterface.TAG_GPS_TRACK_REF, ExifInterface.TAG_GPS_VERSION_ID, ExifInterface.TAG_IMAGE_DESCRIPTION, ExifInterface.TAG_IMAGE_UNIQUE_ID, ExifInterface.TAG_ISO_SPEED, ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT, ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, ExifInterface.TAG_LENS_MAKE, ExifInterface.TAG_LENS_MODEL, ExifInterface.TAG_LENS_SERIAL_NUMBER, ExifInterface.TAG_LENS_SPECIFICATION, ExifInterface.TAG_LIGHT_SOURCE, ExifInterface.TAG_MAKE, ExifInterface.TAG_MAKER_NOTE, ExifInterface.TAG_MODEL, ExifInterface.TAG_SATURATION, ExifInterface.TAG_SHARPNESS, ExifInterface.TAG_SHUTTER_SPEED_VALUE, ExifInterface.TAG_SOFTWARE, ExifInterface.TAG_SUBJECT_DISTANCE, ExifInterface.TAG_SUBJECT_DISTANCE_RANGE, ExifInterface.TAG_SUBJECT_LOCATION, ExifInterface.TAG_USER_COMMENT, ExifInterface.TAG_WHITE_BALANCE};
    private static final String IMAGE_JPEG = "image/jpeg";
    private static final String IMAGE_PNG = "image/png";
    private static final String SCHEME_CONTENT = "content";
    private static final String SCHEME_DATA = "data";
    private static final String SCHEME_FILE = "file";
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";

    private static int calculateInSampleSize(BitmapFactory.Options options, int i2, int i3) {
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        int i6 = 1;
        if (i4 > i3 || i5 > i2) {
            int i7 = i4 / 2;
            int i8 = i5 / 2;
            while (i7 / i6 >= i3 && i8 / i6 >= i2) {
                i6 *= 2;
            }
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0031 A[Catch: Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:52:0x002b, B:54:0x0031, B:56:0x0039, B:57:0x003c, B:58:0x003f), top: B:65:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean copyExif(android.content.Context r8, android.net.Uri r9, java.lang.String r10) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "ImageResizer::copyExif"
            r7 = 0
            r6 = 0
            java.io.File r1 = getFileFromUri(r8, r9)     // Catch: java.lang.Exception -> L1e
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L1e
            if (r0 != 0) goto Lf
            return r7
        Lf:
            androidx.exifinterface.media.ExifInterface r5 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Exception -> L1e
            java.lang.String r0 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L1e
            r5.<init>(r0)     // Catch: java.lang.Exception -> L1e
            androidx.exifinterface.media.ExifInterface r0 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Exception -> L21
            r0.<init>(r10)     // Catch: java.lang.Exception -> L21
            goto L25
        L1e:
            r0 = move-exception
            r5 = r6
            goto L22
        L21:
            r0 = move-exception
        L22:
            java.lang.String r0 = "EXIF read failed"
            goto L26
        L25:
            r6 = r0
        L26:
            if (r5 == 0) goto L2a
            if (r6 != 0) goto L2b
        L2a:
            return r7
        L2b:
            java.lang.String[] r4 = fr.bamlab.rnimageresizer.ImageResizer.EXIF_TO_COPY_ROTATED     // Catch: java.lang.Exception -> L43
            int r3 = r4.length     // Catch: java.lang.Exception -> L43
            r2 = r7
        L2f:
            if (r2 >= r3) goto L3f
            r1 = r4[r2]     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = r5.getAttribute(r1)     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L3c
            r6.setAttribute(r1, r0)     // Catch: java.lang.Exception -> L43
        L3c:
            int r2 = r2 + 1
            goto L2f
        L3f:
            r6.saveAttributes()     // Catch: java.lang.Exception -> L43
            goto L47
        L43:
            r0 = move-exception
            java.lang.String r0 = "EXIF copy failed"
            goto L2a
        L47:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.bamlab.rnimageresizer.ImageResizer.copyExif(android.content.Context, android.net.Uri, java.lang.String):boolean");
    }

    public static Bitmap createResizedImage(Context context, Uri uri, int i2, int i3, int i4, int i5, String str, boolean z2) throws IOException {
        String scheme = uri.getScheme();
        Bitmap bitmapLoadBitmapFromFile = (scheme == null || scheme.equalsIgnoreCase("file") || scheme.equalsIgnoreCase("content")) ? loadBitmapFromFile(context, uri, i2, i3) : (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https")) ? loadBitmapFromURL(uri, i2, i3) : scheme.equalsIgnoreCase("data") ? loadBitmapFromBase64(uri) : null;
        if (bitmapLoadBitmapFromFile == null) {
            throw new IOException("Unable to load source image from path");
        }
        Bitmap bitmapRotateImage = rotateImage(bitmapLoadBitmapFromFile, getOrientation(context, uri) + i5);
        if (bitmapRotateImage == null) {
            throw new IOException("Unable to rotate image. Most likely due to not enough memory.");
        }
        Bitmap bitmapResizeImage = resizeImage(bitmapRotateImage, i2, i3, str, z2);
        if (bitmapResizeImage == null) {
            throw new IOException("Unable to resize image. Most likely due to not enough memory.");
        }
        if (bitmapResizeImage != bitmapRotateImage) {
            bitmapRotateImage.recycle();
        }
        return bitmapResizeImage;
    }

    private static File getFileFromUri(Context context, Uri uri) {
        String strXd = ZO.xd("'5~l\u0002", (short) (C1607wl.Xd() ^ 20182), (short) (C1607wl.Xd() ^ 3622));
        File file = new File(uri.getPath());
        if (file.exists()) {
            return file;
        }
        Cursor cursor = null;
        try {
            String[] strArr = {strXd};
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud("\rTTo/a(\u000e\u0004\u0016C\u001a)cvbV1#\\g<\\", (short) (C1633zX.Xd() ^ (-25885)), (short) (C1633zX.Xd() ^ (-5662)))).getMethod(Ig.wd("q\u0017VK\u001ewO\u001fp\tb\u001a<@[Jk\u0001", (short) (FB.Xd() ^ 5415)), new Class[0]);
            try {
                method.setAccessible(true);
                Cursor cursorQuery = ((ContentResolver) method.invoke(context, objArr)).query(uri, strArr, null, null, null);
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow(strXd);
                cursorQuery.moveToFirst();
                File file2 = new File(cursorQuery.getString(columnIndexOrThrow));
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return file2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception unused) {
            if (0 == 0) {
                return file;
            }
            cursor.close();
            return file;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public static int getOrientation(Context context, Uri uri) {
        try {
            File fileFromUri = getFileFromUri(context, uri);
            if (fileFromUri.exists()) {
                return getOrientation(new ExifInterface(fileFromUri.getAbsolutePath()));
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getOrientation(ExifInterface exifInterface) {
        int attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    private static Bitmap loadBitmap(Context context, Uri uri, BitmapFactory.Options options) throws Throwable {
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase(EO.Od("9ubQQ\u001fQ", (short) (Od.Xd() ^ (-13129))))) {
            try {
                return BitmapFactory.decodeFile(uri.getPath(), options);
            } catch (Exception e2) {
                e2.printStackTrace();
                throw new IOException(C1561oA.od("\u001cHGCEq552=1591h14',)b(*,$", (short) (C1580rY.Xd() ^ (-29595))));
            }
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("\u001a&\u001b($\u001d\u0017_\u0014\u001f\u001d\"\u0012\u001a\u001fWk\u0017\u0015\u001a\n\u001c\u0017", (short) (FB.Xd() ^ 19528))).getMethod(C1593ug.zd("-,<\f99@2<C\"6EB@K;I", (short) (ZN.Xd() ^ 10167), (short) (ZN.Xd() ^ 3347)), new Class[0]);
        try {
            method.setAccessible(true);
            InputStream inputStreamOpenInputStream = ((ContentResolver) method.invoke(context, objArr)).openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            inputStreamOpenInputStream.close();
            return bitmapDecodeStream;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static Bitmap loadBitmapFromBase64(Uri uri) throws Throwable {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int iIndexOf = schemeSpecificPart.indexOf(44);
        if (iIndexOf != -1) {
            String lowerCase = schemeSpecificPart.substring(0, iIndexOf).replace('\\', '/').toLowerCase();
            boolean zStartsWith = lowerCase.startsWith(C1561oA.Kd("jodkj5qxnq", (short) (C1499aX.Xd() ^ (-6228))));
            boolean z2 = !zStartsWith && lowerCase.startsWith(Wg.Zd(" !\u0012\u0015\u001dc\"\u0019\u007f", (short) (C1580rY.Xd() ^ (-29719)), (short) (C1580rY.Xd() ^ (-15533))));
            if (zStartsWith || z2) {
                Object[] objArr = {schemeSpecificPart.substring(iIndexOf + 1), 0};
                Method declaredMethod = Class.forName(C1561oA.Xd("v\u0005{\u000b\t\u0004\u007fJ\u0013\u0013\t\rOd\u0005\u0018\u000b\\[", (short) (ZN.Xd() ^ 26384))).getDeclaredMethod(Qg.kd("\u0019\u0019\u0016!\u0015\u0015", (short) (OY.Xd() ^ 26577), (short) (OY.Xd() ^ 23373)), Class.forName(Wg.vd("aWoY)f^jV\u001cDde[c[", (short) (FB.Xd() ^ 1925))), Integer.TYPE);
                try {
                    declaredMethod.setAccessible(true);
                    byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                    return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        return null;
    }

    private static Bitmap loadBitmapFromFile(Context context, Uri uri, int i2, int i3) throws Throwable {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        loadBitmap(context, uri, options);
        options.inSampleSize = calculateInSampleSize(options, i2, i3);
        options.inJustDecodeBounds = false;
        return loadBitmap(context, uri, options);
    }

    private static Bitmap loadBitmapFromURL(Uri uri, int i2, int i3) throws Throwable {
        InputStream inputStream = null;
        Bitmap bitmapDecodeByteArray = null;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
                Callback.openConnection(uRLConnectionOpenConnection);
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                Callback.connect(httpURLConnection);
                InputStream inputStream2 = Callback.getInputStream(httpURLConnection);
                if (inputStream2 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            try {
                                int i4 = inputStream2.read(bArr, 0, 1024);
                                if (i4 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i4);
                            } catch (Throwable th) {
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        }
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                        options.inSampleSize = calculateInSampleSize(options, i2, i3);
                        options.inJustDecodeBounds = false;
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        throw new IOException("Error fetching remote image file.");
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return bitmapDecodeByteArray;
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static Bitmap resizeImage(Bitmap bitmap, int i2, int i3, String str, boolean z2) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i3 <= 0 || i2 <= 0) {
            return null;
        }
        if (!str.equals("stretch")) {
            float f2 = width;
            float f3 = i2 / f2;
            float f4 = height;
            float f5 = i3 / f4;
            float fMax = str.equals("cover") ? Math.max(f3, f5) : Math.min(f3, f5);
            if (z2) {
                fMax = Math.min(fMax, 1.0f);
            }
            i2 = Math.round(f2 * fMax);
            i3 = Math.round(f4 * fMax);
        } else if (z2) {
            i2 = Math.min(width, i2);
            i3 = Math.min(height, i3);
        }
        try {
            return Bitmap.createScaledBitmap(bitmap, i2, i3, true);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static Bitmap rotateImage(Bitmap bitmap, float f2) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f2);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static File saveImage(Bitmap bitmap, File file, String str, Bitmap.CompressFormat compressFormat, int i2) throws IOException {
        if (bitmap == null) {
            throw new IOException("The bitmap couldn't be resized");
        }
        File file2 = new File(file, str + "." + compressFormat.name());
        if (!file2.createNewFile()) {
            throw new IOException("The file already exists");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i2, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        fileOutputStream.write(byteArray);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file2;
    }
}
