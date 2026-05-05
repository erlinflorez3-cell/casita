package cl.json;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import androidx.exifinterface.media.ExifInterface;
import com.RNFetchBlob.RNFetchBlobConst;
import com.facebook.react.bridge.ReactContext;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public class RNSharePathUtil {
    private static final ArrayList<String> authorities = new ArrayList<>();

    public static Uri compatUriFromFile(ReactContext reactContext, File file) {
        compileAuthorities(reactContext);
        String authority = Uri.fromFile(file).getAuthority();
        if ((TextUtils.isEmpty(authority) || !authorities.contains(authority)) && !file.getAbsolutePath().startsWith(RNFetchBlobConst.FILE_PREFIX_CONTENT)) {
            Uri uriForFile = null;
            int i2 = 0;
            while (true) {
                ArrayList<String> arrayList = authorities;
                if (i2 >= arrayList.size()) {
                    break;
                }
                try {
                    uriForFile = FileProvider.getUriForFile(reactContext, arrayList.get(i2), file);
                } catch (Exception e2) {
                    System.out.println("RNSharePathUtil::compatUriFromFile ERROR " + e2.getMessage());
                }
                if (uriForFile != null) {
                    break;
                }
                i2++;
            }
            return uriForFile;
        }
        return Uri.fromFile(file);
    }

    public static void compileAuthorities(ReactContext reactContext) {
        ArrayList<String> arrayList = authorities;
        if (arrayList.size() == 0) {
            ComponentCallbacks2 componentCallbacks2 = (Application) reactContext.getApplicationContext();
            if (componentCallbacks2 instanceof ShareApplication) {
                arrayList.add(((ShareApplication) componentCallbacks2).getFileProviderAuthority());
            }
            arrayList.add(reactContext.getPackageName() + ".rnshare.fileprovider");
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0041: MOVE (r2 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:23:0x0041 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getDataColumn(android.content.Context r11, android.net.Uri r12, java.lang.String r13, java.lang.String[] r14) throws java.lang.Throwable {
        /*
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]
            r0 = 0
            java.lang.String r3 = "_data"
            r7[r0] = r3
            r2 = 0
            androidx.loader.content.CursorLoader r4 = new androidx.loader.content.CursorLoader     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L43
            r10 = 0
            r9 = r14
            r8 = r13
            r6 = r12
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L43
            android.database.Cursor r1 = r4.loadInBackground()     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L43
            if (r1 == 0) goto L2f
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L40
            if (r0 == 0) goto L2f
            int r0 = r1.getColumnIndexOrThrow(r3)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L40
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L40
            if (r1 == 0) goto L2c
            r1.close()
        L2c:
            return r0
        L2d:
            r0 = move-exception
            goto L37
        L2f:
            if (r1 == 0) goto L34
            r1.close()
        L34:
            return r2
        L35:
            r0 = move-exception
            r1 = r2
        L37:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L3f
            r1.close()
        L3f:
            return r2
        L40:
            r0 = move-exception
            r2 = r1
            goto L44
        L43:
            r0 = move-exception
        L44:
            if (r2 == 0) goto L49
            r2.close()
        L49:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.json.RNSharePathUtil.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String getRealPathFromURI(Context context, Uri uri, Boolean bool) throws Throwable {
        File file;
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            boolean zIsExternalStorageDocument = isExternalStorageDocument(uri);
            short sXd = (short) (Od.Xd() ^ (-29746));
            short sXd2 = (short) (Od.Xd() ^ (-2482));
            int[] iArr = new int["xf{".length()];
            QB qb = new QB("xf{");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            short sXd3 = (short) (OY.Xd() ^ 19462);
            short sXd4 = (short) (OY.Xd() ^ 12874);
            int[] iArr2 = new int[")".length()];
            QB qb2 = new QB(")");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                i3++;
            }
            String str2 = new String(iArr2, 0, i3);
            if (zIsExternalStorageDocument) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(str2);
                String str3 = strArrSplit[0];
                boolean zEqualsIgnoreCase = C1561oA.ud("}~twjz\u0001", (short) (Od.Xd() ^ (-30609))).equalsIgnoreCase(str3);
                String strYd = C1561oA.yd("L", (short) (FB.Xd() ^ 16755));
                if (zEqualsIgnoreCase || C1561oA.Yd(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, (short) (C1607wl.Xd() ^ 11164)).equalsIgnoreCase(str3)) {
                    if (bool.booleanValue()) {
                        short sXd5 = (short) (OY.Xd() ^ 15314);
                        short sXd6 = (short) (OY.Xd() ^ 9576);
                        int[] iArr3 = new int["\u0003fp'6Hg\ba\u0006\u0019EJ,T&_$5c)Rr".length()];
                        QB qb3 = new QB("\u0003fp'6Hg\ba\u0006\u0019EJ,T&_$5c)Rr");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd6) ^ sXd5));
                            i4++;
                        }
                        Object[] objArr = new Object[0];
                        Method method = Class.forName(new String(iArr3, 0, i4)).getMethod(ZO.xd("<6I\t\u0011\u0002T<\u0018\u0007$", (short) (FB.Xd() ^ 21743), (short) (FB.Xd() ^ 17604)), new Class[0]);
                        try {
                            method.setAccessible(true);
                            file = (File) method.invoke(context, objArr);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } else {
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(C1626yg.Ud("/W^hP8\u007fl\u007f!!\rov,g'4gc\u007f?\u0017", (short) (C1633zX.Xd() ^ (-18953)), (short) (C1633zX.Xd() ^ (-18147)))).getMethod(Ig.wd("$l\b\u000bs*p|!FI,\u001b)(Ez\u0004S", (short) (FB.Xd() ^ 13366)), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            file = (File) method2.invoke(context, objArr2);
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    return "" + file + strYd + strArrSplit[1];
                }
                if (str.equalsIgnoreCase(str3)) {
                    return "" + strArrSplit[1];
                }
                if (!TextUtils.isEmpty(str3)) {
                    return Xg.qd("@\u0006\b\u0004\bw~}H", (short) (Od.Xd() ^ (-278)), (short) (Od.Xd() ^ (-11859))) + str3 + strYd + strArrSplit[1];
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    String strOd = EO.Od("=c]}", (short) (C1607wl.Xd() ^ 14425));
                    return documentId.startsWith(strOd) ? "" + documentId.replaceFirst(strOd, "") : "" + getDataColumn(context, ContentUris.withAppendedId(Uri.parse(C1561oA.Qd("$/-2\"*/sgf\u001b%,\"\u001f!\u0012\u0014\"\\\u001d!\r\u0016\u0012\u000b\u0006\n\u0014\u001b\u0011\u000e\u0010\u0001\u0003\u0011", (short) (ZN.Xd() ^ 26775))), Long.valueOf(documentId).longValue()), null, null);
                }
                if (isMediaDocument(uri)) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(str2);
                    String str4 = strArrSplit2[0];
                    if (C1593ug.zd("bg\\cb", (short) (C1607wl.Xd() ^ 29217), (short) (C1607wl.Xd() ^ 20969)).equals(str4)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if (C1561oA.od("ykeen", (short) (Od.Xd() ^ (-28835))).equals(str4)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else {
                        short sXd7 = (short) (C1607wl.Xd() ^ 30954);
                        int[] iArr4 = new int["q\u0007v|\u0004".length()];
                        QB qb4 = new QB("q\u0007v|\u0004");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd7 + sXd7) + i5));
                            i5++;
                        }
                        if (new String(iArr4, 0, i5).equals(str4)) {
                            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        } else if (str.equalsIgnoreCase(str4)) {
                            return "" + strArrSplit2[1];
                        }
                    }
                    return "" + getDataColumn(context, uri2, Wg.Zd("\u0019\u0017:\u0010:", (short) (Od.Xd() ^ (-7796)), (short) (Od.Xd() ^ (-27164))), new String[]{strArrSplit2[1]});
                }
            }
        } else {
            if (C1561oA.Xd("\u000e\u001b\u001b\"\u0014\u001e%", (short) (C1607wl.Xd() ^ 24023)).equalsIgnoreCase(uri.getScheme())) {
                return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : "" + getDataColumn(context, uri, null, null);
            }
            if (Wg.vd("\u0007\u000b\u000f\t", (short) (OY.Xd() ^ 25455)).equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
