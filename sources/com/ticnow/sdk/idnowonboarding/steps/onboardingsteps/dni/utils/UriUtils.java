package com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.utils;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

/* JADX INFO: loaded from: classes5.dex */
public class UriUtils {
    private static Uri contentUri = null;

    private static boolean fileExists(String str) {
        return new File(str).exists();
    }

    private static String getDataColumn(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        String strWd = Ig.wd(";\u0018!RF", (short) (OY.Xd() ^ 24802));
        String[] strArr2 = {strWd};
        Cursor cursor = null;
        try {
            Class<?> cls = Class.forName(EO.Od("=\u0014WMRy\u0019\u0012'F?g$+=\u0018z\rSa\u0012l\u0013", (short) (C1499aX.Xd() ^ (-17888))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1607wl.Xd() ^ 10379);
            int[] iArr = new int["\u000e\u000b\u0019f\u0012\u0010\u0015\u0005\r\u0012n\u0001\u000e\t\u0005\u000e{\b".length()];
            QB qb = new QB("\u000e\u000b\u0019f\u0012\u0010\u0015\u0005\r\u0012n\u0001\u000e\t\u0005\u000e{\b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                Cursor cursorQuery = ((ContentResolver) method.invoke(context, objArr)).query(uri, strArr2, str, strArr, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(strWd));
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return string;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String getDriveFilePath(Uri uri, Context context) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-30429));
        short sXd2 = (short) (C1633zX.Xd() ^ (-14578));
        int[] iArr = new int["o}t\u0004\u0002|xCy\u0007\u0007\u000e\u007f\n\u0011Ka\u000f\u000f\u0016\b\u001c\u0019".length()];
        QB qb = new QB("o}t\u0004\u0002|xCy\u0007\u0007\u000e\u007f\n\u0011Ka\u000f\u000f\u0016\b\u001c\u0019");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("41?\r86;+38\u0015'4/+4\".", (short) (C1580rY.Xd() ^ (-15078))), new Class[0]);
        try {
            method.setAccessible(true);
            Cursor cursorQuery = ((ContentResolver) method.invoke(context, objArr)).query(uri, null, null, null, null);
            int columnIndex = cursorQuery.getColumnIndex(C1561oA.Kd("9?EPNKAZAQERK", (short) (FB.Xd() ^ 4191)));
            int columnIndex2 = cursorQuery.getColumnIndex(Wg.Zd("\u000e[\u0007Qq", (short) (ZN.Xd() ^ 22256), (short) (ZN.Xd() ^ 32693)));
            cursorQuery.moveToFirst();
            String string = cursorQuery.getString(columnIndex);
            Long.toString(cursorQuery.getLong(columnIndex2));
            short sXd3 = (short) (C1633zX.Xd() ^ (-9735));
            int[] iArr2 = new int["\u0019'\u001e-+&\"l#007)3:t\u000b88?1EB".length()];
            QB qb2 = new QB("\u0019'\u001e-+&\"l#007)3:t\u000b88?1EB");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr2, 0, i3));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd4 = (short) (C1633zX.Xd() ^ (-29684));
            int[] iArr3 = new int["po\u007fOnqwuEku".length()];
            QB qb3 = new QB("po\u007fOnqwuEku");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((sXd4 ^ i4) + xuXd3.CK(iKK3));
                i4++;
            }
            Method method2 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
            try {
                method2.setAccessible(true);
                File file = new File((File) method2.invoke(context, objArr2), string);
                short sXd5 = (short) (C1633zX.Xd() ^ (-25219));
                short sXd6 = (short) (C1633zX.Xd() ^ (-28494));
                int[] iArr4 = new int[".:/<81+s(316&.3k\u007f+).\u001e0+".length()];
                QB qb4 = new QB(".:/<81+s(316&.3k\u007f+).\u001e0+");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(((sXd5 + i5) + xuXd4.CK(iKK4)) - sXd6);
                    i5++;
                }
                try {
                    Class<?> cls2 = Class.forName(new String(iArr4, 0, i5));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd7 = (short) (C1499aX.Xd() ^ (-11286));
                    short sXd8 = (short) (C1499aX.Xd() ^ (-12603));
                    int[] iArr5 = new int["sp~LwuzjrwTfsnjsam".length()];
                    QB qb5 = new QB("sp~LwuzjrwTfsnjsam");
                    int i6 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i6] = xuXd5.fK(sXd7 + i6 + xuXd5.CK(iKK5) + sXd8);
                        i6++;
                    }
                    Method method3 = cls2.getMethod(new String(iArr5, 0, i6), clsArr2);
                    try {
                        method3.setAccessible(true);
                        InputStream inputStreamOpenInputStream = ((ContentResolver) method3.invoke(context, objArr3)).openInputStream(uri);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[Math.min(inputStreamOpenInputStream.available(), 1048576)];
                        while (true) {
                            int i7 = inputStreamOpenInputStream.read(bArr);
                            if (i7 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i7);
                        }
                        inputStreamOpenInputStream.close();
                        fileOutputStream.close();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (Exception unused) {
                }
                return file.getPath();
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private static String getMediaFilePathForN(Uri uri, Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("\u0007\u0013\b\u0015\u0011\n\u0004L\u0001\f\n\u000f~\u0007\fDX\u0004\u0002\u0007v\t\u0004", (short) (FB.Xd() ^ 29457))).getMethod(C1561oA.yd("\u0014\u0013#r\u0018\u0018\u001f\u0011\u0013\u001ax\r\u0014\u0011\u000f\u001a\u0002\u0010", (short) (C1499aX.Xd() ^ (-4144))), new Class[0]);
        try {
            method.setAccessible(true);
            Cursor cursorQuery = ((ContentResolver) method.invoke(context, objArr)).query(uri, null, null, null, null);
            short sXd = (short) (C1499aX.Xd() ^ (-22943));
            int[] iArr = new int["\u0001\u0007\r\u0018\u0016\u0013\t\"\t\u0019\r\u001a\u0013".length()];
            QB qb = new QB("\u0001\u0007\r\u0018\u0016\u0013\t\"\t\u0019\r\u001a\u0013");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            int columnIndex = cursorQuery.getColumnIndex(new String(iArr, 0, i2));
            int columnIndex2 = cursorQuery.getColumnIndex(Xg.qd("j\u007fv\tt", (short) (C1580rY.Xd() ^ (-9363)), (short) (C1580rY.Xd() ^ (-10487))));
            cursorQuery.moveToFirst();
            String string = cursorQuery.getString(columnIndex);
            Long.toString(cursorQuery.getLong(columnIndex2));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Jg.Wd("\u000fp\u001aG\u007f\u0015?$\u0005Pb$,p\n\u0003C\u000b9Z\u00079h", (short) (C1607wl.Xd() ^ 17104), (short) (C1607wl.Xd() ^ 11379))).getMethod(ZO.xd("&u\u0007V\u0014$\u0014bd7q", (short) (FB.Xd() ^ 3141), (short) (FB.Xd() ^ 12655)), new Class[0]);
            try {
                method2.setAccessible(true);
                File file = new File((File) method2.invoke(context, objArr2), string);
                try {
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(C1626yg.Ud("E@!+E~1%\b ~cc|fY|x\rj;\u001eC", (short) (ZN.Xd() ^ 7478), (short) (ZN.Xd() ^ 4212))).getMethod(Ig.wd("/~[\u000ej\r;c\u000e\bgX\u0018\n\u0017j1$", (short) (C1580rY.Xd() ^ (-9984))), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        InputStream inputStreamOpenInputStream = ((ContentResolver) method3.invoke(context, objArr3)).openInputStream(uri);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[Math.min(inputStreamOpenInputStream.available(), 1048576)];
                        while (true) {
                            int i3 = inputStreamOpenInputStream.read(bArr);
                            if (i3 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i3);
                        }
                        inputStreamOpenInputStream.close();
                        fileOutputStream.close();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (Exception unused) {
                }
                return file.getPath();
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private static String getPathFromExtSD(String[] strArr) {
        String str = strArr[0];
        String str2 = RemoteSettings.FORWARD_SLASH_STRING + strArr[1];
        if ("primary".equalsIgnoreCase(str)) {
            String str3 = Environment.getExternalStorageDirectory() + str2;
            if (fileExists(str3)) {
                return str3;
            }
        }
        String str4 = System.getenv("SECONDARY_STORAGE") + str2;
        if (fileExists(str4)) {
            return str4;
        }
        String str5 = System.getenv("EXTERNAL_STORAGE") + str2;
        fileExists(str5);
        return str5;
    }

    public static String getPathFromUri(Context context, Uri uri) throws Throwable {
        Uri uri2 = null;
        Cursor cursor = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            boolean zIsExternalStorageDocument = isExternalStorageDocument(uri);
            String strOd = EO.Od(")", (short) (C1499aX.Xd() ^ (-7135)));
            if (zIsExternalStorageDocument) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(strOd);
                String str = strArrSplit[0];
                String pathFromExtSD = getPathFromExtSD(strArrSplit);
                if (pathFromExtSD != "") {
                    return pathFromExtSD;
                }
                return null;
            }
            if (isDownloadsDocument(uri)) {
                short sXd = (short) (C1607wl.Xd() ^ 28525);
                int[] iArr = new int["JVKXTMG\u0010DOMRBJO\b\u001cGEJ:LG".length()];
                QB qb = new QB("JVKXTMG\u0010DOMRBJO\b\u001cGEJ:LG");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                try {
                    Class<?> cls = Class.forName(new String(iArr, 0, i2));
                    Object[] objArr = new Object[0];
                    Method method = cls.getMethod(C1593ug.zd("jiyIvv}oy\u0001_s\u0003\u007f}\tx\u0007", (short) (C1633zX.Xd() ^ (-2452)), (short) (C1633zX.Xd() ^ (-1923))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        ContentResolver contentResolver = (ContentResolver) method.invoke(context, objArr);
                        String[] strArr = new String[1];
                        strArr[0] = C1561oA.od("\u001d!%.*%\u00190\u0015#\u0015 \u0017", (short) (C1499aX.Xd() ^ (-25738)));
                        Cursor cursorQuery = contentResolver.query(uri, strArr, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    String str2 = Environment.getExternalStorageDirectory().toString() + C1561oA.Kd("\u0013)U^VUYLP\u001c", (short) (FB.Xd() ^ 6455)) + cursorQuery.getString(0);
                                    if (!TextUtils.isEmpty(str2)) {
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        return str2;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        String documentId = DocumentsContract.getDocumentId(uri);
                        if (!TextUtils.isEmpty(documentId)) {
                            String strZd = Wg.Zd("Q\t\u0007\u000b", (short) (FB.Xd() ^ 23174), (short) (FB.Xd() ^ 16267));
                            if (documentId.startsWith(strZd)) {
                                return documentId.replaceFirst(strZd, "");
                            }
                            String[] strArr2 = new String[2];
                            short sXd2 = (short) (C1499aX.Xd() ^ (-3178));
                            int[] iArr2 = new int["6CCJ<FM\u0014\n\u000bAMVNMQDHX\u0015W]KVTOLR^g_^bUYi".length()];
                            QB qb2 = new QB("6CCJ<FM\u0014\n\u000bAMVNMQDHX\u0015W]KVTOLR^g_^bUYi");
                            int i3 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                                i3++;
                            }
                            try {
                                return getDataColumn(context, ContentUris.withAppendedId(Uri.parse(new String(iArr2, 0, i3)), Long.valueOf(documentId).longValue()), null, null);
                            } catch (NumberFormatException unused) {
                                return uri.getPath().replaceFirst(Wg.vd("\u0004U\b\u0014\r \u0015\u000e\u001c#Z\u001f\u0013*i", (short) (OY.Xd() ^ 3621)), "").replaceFirst(Qg.kd(":M;P\u0012", (short) (C1633zX.Xd() ^ (-4409)), (short) (C1633zX.Xd() ^ (-5317))), "");
                            }
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                if (isMediaDocument(uri)) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(strOd);
                    String str3 = strArrSplit2[0];
                    short sXd3 = (short) (C1499aX.Xd() ^ (-2716));
                    short sXd4 = (short) (C1499aX.Xd() ^ (-2109));
                    int[] iArr3 = new int["uxkpm".length()];
                    QB qb3 = new QB("uxkpm");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(sXd3 + i4 + xuXd3.CK(iKK3) + sXd4);
                        i4++;
                    }
                    if (new String(iArr3, 0, i4).equals(str3)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if (C1561oA.ud("UGAAJ", (short) (ZN.Xd() ^ 5949)).equals(str3)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else {
                        short sXd5 = (short) (Od.Xd() ^ (-17557));
                        int[] iArr4 = new int["~\u0014\u007f\u0006\t".length()];
                        QB qb4 = new QB("~\u0014\u007f\u0006\t");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 ^ i5));
                            i5++;
                        }
                        if (new String(iArr4, 0, i5).equals(str3)) {
                            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        }
                    }
                    String[] strArr3 = {strArrSplit2[1]};
                    short sXd6 = (short) (ZN.Xd() ^ 20213);
                    int[] iArr5 = new int["\u0014\u001f\u001btw".length()];
                    QB qb5 = new QB("\u0014\u001f\u001btw");
                    int i6 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd6 + sXd6) + sXd6) + i6));
                        i6++;
                    }
                    return getDataColumn(context, uri2, new String(iArr5, 0, i6), strArr3);
                }
                if (isGoogleDriveUri(uri)) {
                    return getDriveFilePath(uri, context);
                }
            }
        } else {
            short sXd7 = (short) (Od.Xd() ^ (-28126));
            short sXd8 = (short) (Od.Xd() ^ (-16558));
            int[] iArr6 = new int["\n\u0017\u0017\u001e\u0010\u001a!".length()];
            QB qb6 = new QB("\n\u0017\u0017\u001e\u0010\u001a!");
            int i7 = 0;
            while (qb6.YK()) {
                int iKK6 = qb6.KK();
                Xu xuXd6 = Xu.Xd(iKK6);
                iArr6[i7] = xuXd6.fK((xuXd6.CK(iKK6) - (sXd7 + i7)) + sXd8);
                i7++;
            }
            if (new String(iArr6, 0, i7).equalsIgnoreCase(uri.getScheme())) {
                return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : isGoogleDriveUri(uri) ? getDriveFilePath(uri, context) : getDataColumn(context, uri, null, null);
            }
            if (Jg.Wd(",F{M", (short) (C1633zX.Xd() ^ (-20315)), (short) (C1633zX.Xd() ^ (-30903))).equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean isGoogleDriveUri(Uri uri) {
        return "com.google.android.apps.docs.storage".equals(uri.getAuthority()) || "com.google.android.apps.docs.storage.legacy".equals(uri.getAuthority());
    }

    private static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
