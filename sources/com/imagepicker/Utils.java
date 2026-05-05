package com.imagepicker;

import android.app.Activity;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import androidx.core.app.ActivityCompat;
import androidx.core.content.FileProvider;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
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
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public class Utils {
    public static String cameraPermissionDescription = "This library does not require Manifest.permission.CAMERA, if you add this permission in manifest then you have to obtain the same.";
    public static String errCameraUnavailable = "camera_unavailable";
    public static String errOthers = "others";
    public static String errPermission = "permission";
    public static String fileNamePrefix = "rn_image_picker_lib_temp_";
    public static String mediaTypePhoto = "photo";
    public static String mediaTypeVideo = "video";

    static List<Uri> collectUrisFromData(Intent intent) {
        if (intent.getClipData() == null) {
            return Collections.singletonList(intent.getData());
        }
        ClipData clipData = intent.getClipData();
        ArrayList arrayList = new ArrayList(clipData.getItemCount());
        for (int i2 = 0; i2 < clipData.getItemCount(); i2++) {
            arrayList.add(clipData.getItemAt(i2).getUri());
        }
        return arrayList;
    }

    public static void copyUri(Uri uri, Uri uri2, ContentResolver contentResolver) {
        try {
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri2);
            try {
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i2 = inputStreamOpenInputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        } else {
                            outputStreamOpenOutputStream.write(bArr, 0, i2);
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static File createFile(Context context, String str) {
        try {
            StringBuilder sbAppend = new StringBuilder().append(fileNamePrefix).append(UUID.randomUUID());
            short sXd = (short) (ZN.Xd() ^ 32032);
            int[] iArr = new int["\u0007".length()];
            QB qb = new QB("\u0007");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            String string = sbAppend.append(new String(iArr, 0, i2)).append(str).toString();
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Yd("`netrmi4jww~pz\u0002<R\u007f\u007f\u0007x\r\n", (short) (ZN.Xd() ^ 7087))).getMethod(Xg.qd("VUe5TW][;ak", (short) (Od.Xd() ^ (-18595)), (short) (Od.Xd() ^ (-5064))), new Class[0]);
            try {
                method.setAccessible(true);
                File file = new File((File) method.invoke(context, objArr), string);
                file.createNewFile();
                return file;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static Uri createUri(File file, Context context) throws Throwable {
        StringBuilder sb = new StringBuilder();
        short sXd = (short) (FB.Xd() ^ 31858);
        short sXd2 = (short) (FB.Xd() ^ 12367);
        int[] iArr = new int["IE{F\u0004:u{a*i,]#i_%\u000fN\u0011B\u0012N".length()];
        QB qb = new QB("IE{F\u0004:u{a*i,]#i_%\u000fN\u0011B\u0012N");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("\u000b3|\u0019\tE$d\u001d2#C;<DL\u0005\fDMn", (short) (C1607wl.Xd() ^ 1952), (short) (C1607wl.Xd() ^ 21647)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1626yg.Ud("\u0001'@M[\u0019mhY4z\rQM^as81gh.\u0002", (short) (C1580rY.Xd() ^ (-14069)), (short) (C1580rY.Xd() ^ (-1131)))).getMethod(Ig.wd("\u001fiH\u000bi.X\\7\fpg@8", (short) (ZN.Xd() ^ 14555)), new Class[0]);
            try {
                method2.setAccessible(true);
                return FileProvider.getUriForFile(context, sb.append((String) method2.invoke(context2, objArr2)).append(EO.Od("&\u0012\nW/z\u0014>cYS@mknU}\u0005/F", (short) (C1633zX.Xd() ^ (-23346)))).toString(), file);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static void deleteFile(Uri uri) {
        new File(uri.getPath()).delete();
    }

    public static Uri getAppSpecificStorageUri(Uri uri, Context context) throws Throwable {
        String string;
        int iLastIndexOf;
        if (uri == null) {
            return null;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("\u0005\u0011\u0006\u0013\u000f\b\u0002J~\n\b\r|\u0005\nBV\u0002\u007f\u0005t\u0007\u0002", (short) (FB.Xd() ^ 17473))).getMethod(C1593ug.zd("\u000f\u000e\u001em\u001b\u001b\"\u0014\u001e%\u0004\u0018'$\"-\u001d+", (short) (FB.Xd() ^ 908), (short) (FB.Xd() ^ 25931)), new Class[0]);
        try {
            method.setAccessible(true);
            ContentResolver contentResolver = (ContentResolver) method.invoke(context, objArr);
            String fileTypeFromMime = getFileTypeFromMime(contentResolver.getType(uri));
            if (fileTypeFromMime == null) {
                Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
                if (cursorQuery.moveToFirst() && (iLastIndexOf = (string = cursorQuery.getString(cursorQuery.getColumnIndex(C1561oA.od(".26?;6*A&4&1(", (short) (OY.Xd() ^ 47))))).lastIndexOf(46)) != -1) {
                    fileTypeFromMime = string.substring(iLastIndexOf + 1);
                }
            }
            Uri uriFromFile = Uri.fromFile(createFile(context, fileTypeFromMime));
            copyUri(uri, uriFromFile, contentResolver);
            return uriFromFile;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.String getBase64String(android.net.Uri r8, android.content.Context r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.imagepicker.Utils.getBase64String(android.net.Uri, android.content.Context):java.lang.String");
    }

    static Bitmap.CompressFormat getBitmapCompressFormat(String str) {
        str.hashCode();
        if (!str.equals(ClipboardModule.MIMETYPE_JPEG) && str.equals(ClipboardModule.MIMETYPE_PNG)) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    static ReadableMap getCancelMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("didCancel", true);
        return writableMapCreateMap;
    }

    static ReadableMap getErrorMap(String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("errorCode", str);
        if (str2 != null) {
            writableMapCreateMap.putString("errorMessage", str2);
        }
        return writableMapCreateMap;
    }

    static double getFileSize(Uri uri, Context context) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-7639));
        short sXd2 = (short) (C1633zX.Xd() ^ (-25096));
        int[] iArr = new int["IUJWSLF\u000fCNLQAIN\u0007\u001bFDI9KF".length()];
        QB qb = new QB("IUJWSLF\u000fCNLQAIN\u0007\u001bFDI9KF");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("74B\u0010;9>.6;\u0018*72.7%1", (short) (FB.Xd() ^ 24380), (short) (FB.Xd() ^ 30499)), new Class[0]);
            try {
                method.setAccessible(true);
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = ((ContentResolver) method.invoke(context, objArr)).openFileDescriptor(uri, C1561oA.ud("t", (short) (C1499aX.Xd() ^ (-28995))));
                try {
                    double statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return statSize;
                } finally {
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            return 0.0d;
        }
    }

    static String getFileTypeFromMime(String str) {
        if (str == null) {
            return "jpg";
        }
        str.hashCode();
        switch (str) {
            case "image/jpeg":
                return "jpg";
            case "image/gif":
                return "gif";
            case "image/png":
                return "png";
            default:
                return MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        }
    }

    static int[] getImageDimensBasedOnConstraints(int i2, int i3, Options options) {
        if (options.maxWidth == 0 || options.maxHeight == 0) {
            return new int[]{i2, i3};
        }
        if (options.maxWidth < i2) {
            i3 = (int) ((options.maxWidth / i2) * i3);
            i2 = options.maxWidth;
        }
        if (options.maxHeight < i3) {
            i2 = (int) ((options.maxHeight / i3) * i2);
            i3 = options.maxHeight;
        }
        return new int[]{i2, i3};
    }

    public static int[] getImageDimensions(Uri uri, Context context) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ 2397);
        int[] iArr = new int["~\u000b\u0004\u0011\t\u0002\u007fHx\u0004\u0006\u000bv~\b@p\u001c\u001e#\u000f! ".length()];
        QB qb = new QB("~\u000b\u0004\u0011\t\u0002\u007fHx\u0004\u0006\u000bv~\b@p\u001c\u001e#\u000f! ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = new Object[0];
            Method method = cls.getMethod(C1561oA.Yd("\u0014\u0013#r  '\u0019#*\t\u001d,)'2\"0", (short) (C1607wl.Xd() ^ 3877)), new Class[0]);
            try {
                method.setAccessible(true);
                InputStream inputStreamOpenInputStream = ((ContentResolver) method.invoke(context, objArr)).openInputStream(uri);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    int[] iArr2 = {options.outWidth, options.outHeight};
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                    return iArr2;
                } finally {
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            return new int[]{0, 0};
        }
    }

    static ReadableMap getImageResponseMap(Uri uri, Options options, Context context) throws Throwable {
        String lastPathSegment = uri.getLastPathSegment();
        ImageMetadata imageMetadata = new ImageMetadata(uri, context);
        int[] imageDimensions = getImageDimensions(uri, context);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("uri", uri.toString());
        writableMapCreateMap.putDouble("fileSize", getFileSize(uri, context));
        writableMapCreateMap.putString("fileName", lastPathSegment);
        writableMapCreateMap.putString("type", getMimeTypeFromFileUri(uri));
        writableMapCreateMap.putInt("width", imageDimensions[0]);
        writableMapCreateMap.putInt("height", imageDimensions[1]);
        writableMapCreateMap.putString("type", getMimeType(uri, context));
        if (options.includeBase64.booleanValue()) {
            writableMapCreateMap.putString("base64", getBase64String(uri, context));
        }
        if (options.includeExtra.booleanValue()) {
            writableMapCreateMap.putString("timestamp", imageMetadata.getDateTime());
            writableMapCreateMap.putString("id", lastPathSegment);
        }
        return writableMapCreateMap;
    }

    static String getMimeType(Uri uri, Context context) throws Throwable {
        String scheme = uri.getScheme();
        short sXd = (short) (C1607wl.Xd() ^ 12887);
        short sXd2 = (short) (C1607wl.Xd() ^ 27568);
        int[] iArr = new int["Z^b\\".length()];
        QB qb = new QB("Z^b\\");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        if (scheme.equals(new String(iArr, 0, i2))) {
            return getMimeTypeFromFileUri(uri);
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("\u000e\u0004E<-\u0013f\\\u0006Z%G\t\u001d/Q*bJ\u001c\"M\u0015", (short) (C1580rY.Xd() ^ (-32718)), (short) (C1580rY.Xd() ^ (-16604)))).getMethod(ZO.xd("Z*\u0001\u0002Y\u000bB\u007f-\n\u0002\u000eI,'XG|", (short) (FB.Xd() ^ 27743), (short) (FB.Xd() ^ 19452)), new Class[0]);
        try {
            method.setAccessible(true);
            return ((ContentResolver) method.invoke(context, objArr)).getType(uri);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static String getMimeTypeFromFileUri(Uri uri) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
    }

    static String getOrientation(Uri uri, Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("T~G'\u0011@\u0014}%O\u0018+ui6`\u0018;WJPv\u0004", (short) (C1580rY.Xd() ^ (-517)), (short) (C1580rY.Xd() ^ (-5778)))).getMethod(Ig.wd("yC\"S\u001eOk\u001bHQ+&`l7&kh", (short) (FB.Xd() ^ 22544)), new Class[0]);
        try {
            method.setAccessible(true);
            return new ExifInterface(((ContentResolver) method.invoke(context, objArr)).openInputStream(uri)).getAttribute(EO.Od("a4\u001bq\u001do\u0003 SXS", (short) (C1499aX.Xd() ^ (-20024))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static ReadableMap getResponseMap(List<Uri> list, Options options, Context context) throws Throwable {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Uri appSpecificStorageUri = list.get(i2);
            if (isImageType(appSpecificStorageUri, context)) {
                if (appSpecificStorageUri.getScheme().contains("content")) {
                    appSpecificStorageUri = getAppSpecificStorageUri(appSpecificStorageUri, context);
                }
                writableArrayCreateArray.pushMap(getImageResponseMap(resizeImage(appSpecificStorageUri, context, options), options, context));
            } else {
                if (!isVideoType(appSpecificStorageUri, context)) {
                    throw new RuntimeException("Unsupported file type");
                }
                if (appSpecificStorageUri.getScheme().contains("content")) {
                    appSpecificStorageUri = getAppSpecificStorageUri(appSpecificStorageUri, context);
                }
                writableArrayCreateArray.pushMap(getVideoResponseMap(appSpecificStorageUri, options, context));
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray("assets", writableArrayCreateArray);
        return writableMapCreateMap;
    }

    static ReadableMap getVideoResponseMap(Uri uri, Options options, Context context) {
        String lastPathSegment = uri.getLastPathSegment();
        WritableMap writableMapCreateMap = Arguments.createMap();
        VideoMetadata videoMetadata = new VideoMetadata(uri, context);
        writableMapCreateMap.putString("uri", uri.toString());
        writableMapCreateMap.putDouble("fileSize", getFileSize(uri, context));
        writableMapCreateMap.putInt("duration", videoMetadata.getDuration());
        writableMapCreateMap.putInt("bitrate", videoMetadata.getBitrate());
        writableMapCreateMap.putString("fileName", lastPathSegment);
        writableMapCreateMap.putString("type", getMimeType(uri, context));
        writableMapCreateMap.putInt("width", videoMetadata.getWidth());
        writableMapCreateMap.putInt("height", videoMetadata.getHeight());
        if (options.includeExtra.booleanValue()) {
            writableMapCreateMap.putString("timestamp", videoMetadata.getDateTime());
            writableMapCreateMap.putString("id", lastPathSegment);
        }
        return writableMapCreateMap;
    }

    static boolean hasPermission(Activity activity) {
        return ActivityCompat.checkSelfPermission(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public static boolean isCameraAvailable(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("9E:GC<6~3><A19>v\u000b649);6", (short) (FB.Xd() ^ 17338))).getMethod(C1593ug.zd("54D!36?6=<%:H<CBP", (short) (FB.Xd() ^ 4566), (short) (FB.Xd() ^ 10862)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            short sXd = (short) (FB.Xd() ^ 1383);
            int[] iArr = new int["\r\u0019\u000e\u001b\u0017\u0010\nR\f\u0004\u0014\u0005\u0017\u007f\u0010\u0002I}z\u0006|\tv".length()];
            QB qb = new QB("\r\u0019\u000e\u001b\u0017\u0010\nR\f\u0004\u0014\u0005\u0017\u007f\u0010\u0002I}z\u0006|\tv");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            short sXd2 = (short) (OY.Xd() ^ 32645);
            int[] iArr2 = new int["\u001d+\"1/*&p'44;-7>x<:{\u001f14=4;:#8F:A@N".length()];
            QB qb2 = new QB("\u001d+\"1/*&p'44;-7>x<:{\u001f14=4;:#8F:A@N");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                i3++;
            }
            Object[] objArr2 = {str};
            Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Xd("\"\u001c/\u0010724&/\t)&:<:.", (short) (Od.Xd() ^ (-3139))), Class.forName(Wg.Zd("!Vc\tl3b'w\te>\u0017U\u0012\u0006", (short) (Od.Xd() ^ (-1861)), (short) (Od.Xd() ^ (-16223)))));
            try {
                method2.setAccessible(true);
                if (!((Boolean) method2.invoke(packageManager, objArr2)).booleanValue()) {
                    Class<?> cls = Class.forName(Wg.vd("htivrke.r}{\u0001px}6Z\u0006\u0004\tx\u000b\u0006", (short) (Od.Xd() ^ (-5331))));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd3 = (short) (C1633zX.Xd() ^ (-28935));
                    short sXd4 = (short) (C1633zX.Xd() ^ (-7828));
                    int[] iArr3 = new int[")&4\u000f\u001f '\u001c!\u001e\u0005\u0018$\u0016\u001b\u0018$".length()];
                    QB qb3 = new QB(")&4\u000f\u001f '\u001c!\u001e\u0005\u0018$\u0016\u001b\u0018$");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((sXd3 + i4) + xuXd3.CK(iKK3)) - sXd4);
                        i4++;
                    }
                    Method method3 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
                    try {
                        method3.setAccessible(true);
                        PackageManager packageManager2 = (PackageManager) method3.invoke(context, objArr3);
                        Object[] objArr4 = {hg.Vd("]i^kg`Z#\\TdUgP`R\u001aNKVMYG\u0013EQ[", (short) (C1580rY.Xd() ^ (-25889)), (short) (C1580rY.Xd() ^ (-31759)))};
                        Method method4 = Class.forName(C1561oA.ud("^j_lha[$XcafV^c\u001c]Y\u0019:JKRGLI0COAFCO", (short) (FB.Xd() ^ 11082))).getMethod(C1561oA.Yd("93F'NIK=F @=QSQE", (short) (ZN.Xd() ^ 25465)), Class.forName(C1561oA.yd(";1E/z8,80u\u001a:7-1)", (short) (C1580rY.Xd() ^ (-29714)))));
                        try {
                            method4.setAccessible(true);
                            if (!((Boolean) method4.invoke(packageManager2, objArr4)).booleanValue()) {
                                return false;
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                return true;
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public static boolean isCameraPermissionFulfilled(Context context, Activity activity) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-26845));
        short sXd2 = (short) (C1580rY.Xd() ^ (-4168));
        int[] iArr = new int["=KBQOJF\u0011TJXTQ\\]T[[\u001c21>7E5".length()];
        QB qb = new QB("=KBQOJF\u0011TJXTQ\\]T[[\u001c21>7E5");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("D\u000f<()`\u0013<r\u001arxIoQ\b\\HA#U(\u001b", (short) (FB.Xd() ^ 10465), (short) (FB.Xd() ^ 18746))).getMethod(ZO.xd("Hih%]4E\tW\u0001e\u0012\u000eX\u000b>1", (short) (ZN.Xd() ^ 29238), (short) (ZN.Xd() ^ 19327)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                short sXd3 = (short) (ZN.Xd() ^ 29680);
                short sXd4 = (short) (ZN.Xd() ^ 20381);
                int[] iArr2 = new int["+\u001d%M\u0017=\u001b3\u001e:\"?()b\u0004|H\\w;Fq".length()];
                QB qb2 = new QB("+\u001d%M\u0017=\u001b3\u001e:\"?()b\u0004|H\\w;Fq");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr2 = new Object[0];
                Method method2 = cls.getMethod(Ig.wd("sIj]\u0018=1\u0007>wf\u0018YC", (short) (FB.Xd() ^ 19187)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str2 = (String) method2.invoke(context, objArr2);
                    short sXd5 = (short) (OY.Xd() ^ 621);
                    int[] iArr3 = new int["-_I=d,14\u0015\u0013\u0012s\u0014\u0019E^V[EM\u001aI]Yz#.\u0010%Kk\t@".length()];
                    QB qb3 = new QB("-_I=d,14\u0015\u0013\u0012s\u0014\u0019E^V[EM\u001aI]Yz#.\u0010%Kk\t@");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i4)) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    Class<?> cls2 = Class.forName(new String(iArr3, 0, i4));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(C1561oA.Qd("vl\u0001j6sgsk1Uurhld", (short) (ZN.Xd() ^ 32394)));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {str2, 4096};
                    Method method3 = cls2.getMethod(C1593ug.zd("\u0010\u000f\u001f{\u000e\u0011\u001a\u0011\u0018\u0017{\"\u001b%", (short) (C1607wl.Xd() ^ 5043), (short) (C1607wl.Xd() ^ 32186)), clsArr);
                    try {
                        method3.setAccessible(true);
                        String[] strArr = ((PackageInfo) method3.invoke(packageManager, objArr3)).requestedPermissions;
                        return strArr == null || !Arrays.asList(strArr).contains(str) || ActivityCompat.checkSelfPermission(activity, str) == 0;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return true;
        }
    }

    static boolean isContentType(String str, Uri uri, Context context) throws Throwable {
        String mimeType = getMimeType(uri, context);
        if (mimeType != null) {
            return mimeType.contains(str);
        }
        return false;
    }

    static boolean isImageType(Uri uri, Context context) {
        return isContentType("image/", uri, context);
    }

    static boolean isValidRequestCode(int i2) {
        switch (i2) {
            case ImagePickerModuleImpl.REQUEST_LAUNCH_IMAGE_CAPTURE /* 13001 */:
            case ImagePickerModuleImpl.REQUEST_LAUNCH_VIDEO_CAPTURE /* 13002 */:
            case ImagePickerModuleImpl.REQUEST_LAUNCH_LIBRARY /* 13003 */:
                return true;
            default:
                return false;
        }
    }

    static boolean isVideoType(Uri uri, Context context) {
        return isContentType("video/", uri, context);
    }

    public static Uri resizeImage(Uri uri, Context context, Options options) throws Throwable {
        try {
            int[] imageDimensions = getImageDimensions(uri, context);
            if (!shouldResizeImage(imageDimensions[0], imageDimensions[1], options)) {
                return uri;
            }
            int[] imageDimensBasedOnConstraints = getImageDimensBasedOnConstraints(imageDimensions[0], imageDimensions[1], options);
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("#/$1-& h\u001d(&+\u001b#(`t \u001e#\u0013% ", (short) (C1499aX.Xd() ^ (-3548)))).getMethod(C1561oA.Kd("\u001a\u0019)x&&-\u001f)0\u000f#2/-8(6", (short) (C1633zX.Xd() ^ (-27344))), new Class[0]);
            try {
                method.setAccessible(true);
                InputStream inputStreamOpenInputStream = ((ContentResolver) method.invoke(context, objArr)).openInputStream(uri);
                try {
                    String mimeTypeFromFileUri = getMimeTypeFromFileUri(uri);
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream), imageDimensBasedOnConstraints[0], imageDimensBasedOnConstraints[1], true);
                    String orientation = getOrientation(uri, context);
                    File fileCreateFile = createFile(context, getFileTypeFromMime(mimeTypeFromFileUri));
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Wg.Zd("\tMx~!RCD?Cw5\fLH9\u00148l*\u0001K|", (short) (Od.Xd() ^ (-7133)), (short) (Od.Xd() ^ (-28265)))).getMethod(C1561oA.Xd("\u0010\u000f\u001fn\u001c\u001c#\u0015\u001f&\u0005\u0019(%#.\u001e,", (short) (C1607wl.Xd() ^ 10991)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        OutputStream outputStreamOpenOutputStream = ((ContentResolver) method2.invoke(context, objArr2)).openOutputStream(Uri.fromFile(fileCreateFile));
                        try {
                            bitmapCreateScaledBitmap.compress(getBitmapCompressFormat(mimeTypeFromFileUri), options.quality, outputStreamOpenOutputStream);
                            if (outputStreamOpenOutputStream != null) {
                                outputStreamOpenOutputStream.close();
                            }
                            setOrientation(fileCreateFile, orientation, context);
                            deleteFile(uri);
                            Uri uriFromFile = Uri.fromFile(fileCreateFile);
                            if (inputStreamOpenInputStream != null) {
                                inputStreamOpenInputStream.close();
                            }
                            return uriFromFile;
                        } finally {
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } finally {
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            return uri;
        }
    }

    public static void saveToPublicDirectory(Uri uri, Context context, String str) {
        Uri uriInsert;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("\u0011\u001f\u0016%\u001b\u0016\u0012\\\u001b((/\u0019#*db\u0010\u0010\u0017\u0001\u0015\u0012", (short) (C1633zX.Xd() ^ (-1600)))).getMethod(Qg.kd("zw\u0006S~|\u0002qy~[mzuqzht", (short) (C1499aX.Xd() ^ (-12550)), (short) (C1499aX.Xd() ^ (-15667))), new Class[0]);
        try {
            method.setAccessible(true);
            ContentResolver contentResolver = (ContentResolver) method.invoke(context, objArr);
            ContentValues contentValues = new ContentValues();
            boolean zEquals = str.equals(hg.Vd("]OIIR", (short) (C1607wl.Xd() ^ 21097), (short) (C1607wl.Xd() ^ 6422)));
            String strUd = C1561oA.ud("=8;2+?C9-", (short) (C1499aX.Xd() ^ (-18176)));
            String strYd = C1561oA.yd("\u000b\u0011\u0017\"\u0018\u0015\u000b$\u0003\u0013\u0007\u0014\u0005", (short) (C1633zX.Xd() ^ (-31577)));
            if (zEquals) {
                contentValues.put(strYd, UUID.randomUUID().toString());
                contentValues.put(strUd, contentResolver.getType(uri));
                uriInsert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
            } else {
                contentValues.put(strYd, UUID.randomUUID().toString());
                contentValues.put(strUd, contentResolver.getType(uri));
                uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            }
            copyUri(uri, uriInsert, contentResolver);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void setFrontCamera(Intent intent) {
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
    }

    static void setOrientation(File file, String str, Context context) throws Throwable {
        if (str.equals(String.valueOf(1)) || str.equals(String.valueOf(0))) {
            return;
        }
        ExifInterface exifInterface = new ExifInterface(file);
        exifInterface.setAttribute(ExifInterface.TAG_ORIENTATION, str);
        exifInterface.saveAttributes();
    }

    static boolean shouldResizeImage(int i2, int i3, Options options) {
        if ((options.maxWidth == 0 || options.maxHeight == 0) && options.quality == 100) {
            return false;
        }
        return options.maxWidth < i2 || options.maxHeight < i3 || options.quality != 100;
    }
}
