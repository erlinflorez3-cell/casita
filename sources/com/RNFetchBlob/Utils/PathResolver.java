package com.RNFetchBlob.Utils;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.RNFetchBlob.RNFetchBlobUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
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

/* JADX INFO: loaded from: classes4.dex */
public class PathResolver {
    private static String getContentName(ContentResolver contentResolver, Uri uri) {
        Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
        cursorQuery.moveToFirst();
        int columnIndex = cursorQuery.getColumnIndex("_display_name");
        if (columnIndex < 0) {
            return null;
        }
        String string = cursorQuery.getString(columnIndex);
        cursorQuery.close();
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getDataColumn(android.content.Context r16, android.net.Uri r17, java.lang.String r18, java.lang.String[] r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.Utils.PathResolver.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String getRealPathFromURI(Context context, Uri uri) throws Throwable {
        boolean zIsDocumentUri = DocumentsContract.isDocumentUri(context, uri);
        String strWd = Ig.wd("<\u0013\"MD\u0019\u0001", (short) (C1633zX.Xd() ^ (-25209)));
        Uri uri2 = null;
        if (zIsDocumentUri) {
            boolean zIsExternalStorageDocument = isExternalStorageDocument(uri);
            String strOd = EO.Od("$", (short) (OY.Xd() ^ 6274));
            if (zIsExternalStorageDocument) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(strOd);
                if (C1561oA.Qd("QRHK>NT", (short) (C1633zX.Xd() ^ (-2615))).equalsIgnoreCase(strArrSplit[0])) {
                    return Environment.getExternalStorageDirectory() + C1593ug.zd("L", (short) (FB.Xd() ^ 6909), (short) (FB.Xd() ^ 28817)) + strArrSplit[1];
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    try {
                        String documentId = DocumentsContract.getDocumentId(uri);
                        if (documentId != null) {
                            short sXd = (short) (ZN.Xd() ^ 18201);
                            int[] iArr = new int["5#8ym".length()];
                            QB qb = new QB("5#8ym");
                            int i2 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                                i2++;
                            }
                            if (documentId.startsWith(new String(iArr, 0, i2))) {
                                return Uri.parse(documentId).getPath();
                            }
                        }
                        return getDataColumn(context, ContentUris.withAppendedId(Uri.parse(C1561oA.Kd("boovhry@67my\u0003zy}pt\u0005A\u0004\nw\u0003\u0001{x~\u000b\u0014\f\u000b\u000f\u0002\u0006\u0016", (short) (FB.Xd() ^ 28303))), Long.valueOf(documentId).longValue()), null, null);
                    } catch (Exception unused) {
                        return null;
                    }
                }
                if (isMediaDocument(uri)) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(strOd);
                    String str = strArrSplit2[0];
                    short sXd2 = (short) (Od.Xd() ^ (-8059));
                    short sXd3 = (short) (Od.Xd() ^ (-9554));
                    int[] iArr2 = new int[".Me\u0014\u0006".length()];
                    QB qb2 = new QB(".Me\u0014\u0006");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                        i3++;
                    }
                    if (new String(iArr2, 0, i3).equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if (C1561oA.Xd("UIEGR", (short) (FB.Xd() ^ 26493)).equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if (Wg.vd("\u0013&\u0018\u001c%", (short) (FB.Xd() ^ 1093)).equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return getDataColumn(context, uri2, Qg.kd("nwqIJ", (short) (Od.Xd() ^ (-15466)), (short) (Od.Xd() ^ (-16386))), new String[]{strArrSplit2[1]});
                }
                if (strWd.equalsIgnoreCase(uri.getScheme())) {
                    return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getDataColumn(context, uri, null, null);
                }
                try {
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(hg.Vd("IUJWSLF\u000fCNLQAIN\u0007\u001bFDI9KF", (short) (C1607wl.Xd() ^ 5950), (short) (C1607wl.Xd() ^ 21116))).getMethod(C1561oA.ud("TQ_-XV[KSX5GTOKTBN", (short) (ZN.Xd() ^ 24225)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        InputStream inputStreamOpenInputStream = ((ContentResolver) method.invoke(context, objArr)).openInputStream(uri);
                        if (inputStreamOpenInputStream != null) {
                            Object[] objArr2 = new Object[0];
                            Method method2 = Class.forName(C1561oA.yd("[g\\ie^X!U`^cS[`\u0019Mxv{k}x", (short) (C1499aX.Xd() ^ (-25213)))).getMethod(C1561oA.Yd("[Zj:ggn`jqPdspnyiw", (short) (C1633zX.Xd() ^ (-19488))), new Class[0]);
                            try {
                                method2.setAccessible(true);
                                String contentName = getContentName((ContentResolver) method2.invoke(context, objArr2), uri);
                                if (contentName != null) {
                                    Object[] objArr3 = new Object[0];
                                    Method method3 = Class.forName(Xg.qd("CQHWUPL\u0017MZZaS]d\u001f5bbi[ol", (short) (OY.Xd() ^ 934), (short) (OY.Xd() ^ 23729))).getMethod(Jg.Wd("%Z:\u001c\u0013${\u0012!W9", (short) (OY.Xd() ^ 16056), (short) (OY.Xd() ^ 8074)), new Class[0]);
                                    try {
                                        method3.setAccessible(true);
                                        File file = new File((File) method3.invoke(context, objArr3), contentName);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        byte[] bArr = new byte[1024];
                                        while (inputStreamOpenInputStream.read(bArr) > 0) {
                                            fileOutputStream.write(bArr);
                                        }
                                        fileOutputStream.close();
                                        inputStreamOpenInputStream.close();
                                        return file.getAbsolutePath();
                                    } catch (InvocationTargetException e2) {
                                        throw e2.getCause();
                                    }
                                }
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        }
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (Exception e5) {
                    RNFetchBlobUtils.emitWarningEvent(e5.toString());
                    return null;
                }
            }
        } else {
            if (strWd.equalsIgnoreCase(uri.getScheme())) {
                return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getDataColumn(context, uri, null, null);
            }
            if (ZO.xd("\u00057:;", (short) (C1607wl.Xd() ^ 13461), (short) (C1607wl.Xd() ^ 28868)).equalsIgnoreCase(uri.getScheme())) {
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
