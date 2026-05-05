package cl.json;

import android.net.Uri;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class ShareFile {
    public static final int BASE_64_DATA_LENGTH = 5;
    public static final int BASE_64_DATA_OFFSET = 8;
    private String filename;
    private final ReactApplicationContext reactContext;
    private String type;
    private Uri uri;
    private String url;
    private Boolean useInternalStorage;

    public ShareFile(String str, String str2, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.url = str;
        this.uri = Uri.parse(str);
        this.filename = str2;
        this.useInternalStorage = bool;
        this.reactContext = reactApplicationContext;
    }

    public ShareFile(String str, String str2, String str3, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(str, str3, bool, reactApplicationContext);
        this.type = str2;
    }

    private String getMimeType(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String getRealPathFromURI(Uri uri) {
        return RNSharePathUtil.getRealPathFromURI(this.reactContext, uri, this.useInternalStorage);
    }

    private boolean isBase64File() {
        if (this.uri.getScheme() == null || !this.uri.getScheme().equals("data")) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (char c2 : this.uri.toString().substring(5).toCharArray()) {
            if (c2 == ';') {
                break;
            }
            sb.append(c2);
        }
        this.type = sb.toString();
        return true;
    }

    private boolean isLocalFile() {
        if (this.uri.getScheme() == null || !(this.uri.getScheme().equals("content") || this.uri.getScheme().equals("file"))) {
            return false;
        }
        if (this.type != null) {
            return true;
        }
        String mimeType = getMimeType(this.uri.toString());
        this.type = mimeType;
        if (mimeType == null) {
            String realPathFromURI = getRealPathFromURI(this.uri);
            if (realPathFromURI == null) {
                return false;
            }
            this.type = getMimeType(realPathFromURI);
        }
        if (this.type == null) {
            this.type = "*/*";
        }
        return true;
    }

    public String getType() {
        String str = this.type;
        return str == null ? "*/*" : str;
    }

    public Uri getURI() {
        short sXd = (short) (C1499aX.Xd() ^ (-20844));
        short sXd2 = (short) (C1499aX.Xd() ^ (-14420));
        int[] iArr = new int["\b\u0005|\u0001\t\t4ysz|tr-{y*".length()];
        QB qb = new QB("\b\u0005|\u0001\t\t4ysz|tr-{y*");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(getType());
        if (isBase64File()) {
            String strSubstring = this.uri.toString().substring(this.type.length() + 13);
            String str2 = this.filename;
            if (str2 == null) {
                str2 = System.nanoTime() + "";
            }
            try {
                File file = new File(this.useInternalStorage.booleanValue() ? this.reactContext.getCacheDir() : this.reactContext.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException(str + file.getAbsolutePath());
                }
                File file2 = new File(file, str2 + hg.Vd(ExifInterface.GPS_MEASUREMENT_2D, (short) (C1580rY.Xd() ^ (-20145)), (short) (C1580rY.Xd() ^ (-5388))) + extensionFromMimeType);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                short sXd3 = (short) (ZN.Xd() ^ 22399);
                int[] iArr2 = new int["}\n~\f\b\u0001zC\n\b{}>Qo\u0001qA>".length()];
                QB qb2 = new QB("}\n~\f\b\u0001zC\n\b{}>Qo\u0001qA>");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1561oA.yd("\u0007|\u0015~N\f\u0004\u0010\fQy\u001a\u001b\u0011\u0019\u0011", (short) (C1499aX.Xd() ^ (-13283))));
                clsArr[1] = Integer.TYPE;
                Object[] objArr = {strSubstring, 0};
                Method declaredMethod = cls.getDeclaredMethod(C1561oA.Yd("\n\f\u000b\u0018\u000e\u0010", (short) (C1580rY.Xd() ^ (-1120))), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    fileOutputStream.write((byte[]) declaredMethod.invoke(null, objArr));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return RNSharePathUtil.compatUriFromFile(this.reactContext, file2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } else if (isLocalFile()) {
            Uri uri = Uri.parse(this.url);
            if (uri.getPath() == null) {
                return null;
            }
            return RNSharePathUtil.compatUriFromFile(this.reactContext, new File(uri.getPath()));
        }
        return null;
    }

    public boolean isFile() {
        return isBase64File() || isLocalFile();
    }
}
