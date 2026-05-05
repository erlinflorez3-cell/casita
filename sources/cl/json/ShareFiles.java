package cl.json;

import android.net.Uri;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import com.dynatrace.android.agent.Global;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public class ShareFiles {
    private ArrayList<String> filenames;
    private String intentType;
    private final ReactApplicationContext reactContext;
    private ArrayList<Uri> uris;
    private Boolean useInternalStorage;

    public ShareFiles(ReadableArray readableArray, ArrayList<String> arrayList, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.uris = new ArrayList<>();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            String string = readableArray.getString(i2);
            if (string != null) {
                this.uris.add(Uri.parse(string));
            }
        }
        this.filenames = arrayList;
        this.useInternalStorage = bool;
        this.reactContext = reactApplicationContext;
    }

    public ShareFiles(ReadableArray readableArray, ArrayList<String> arrayList, String str, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(readableArray, arrayList, bool, reactApplicationContext);
        this.intentType = str;
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

    private boolean isBase64File(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals("data")) {
            return false;
        }
        String strSubstring = uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(Global.SEMICOLON));
        String str = this.intentType;
        if (str == null) {
            this.intentType = strSubstring;
            return true;
        }
        if (!str.equalsIgnoreCase(strSubstring) && this.intentType.split(RemoteSettings.FORWARD_SLASH_STRING)[0].equalsIgnoreCase(strSubstring.split(RemoteSettings.FORWARD_SLASH_STRING)[0])) {
            this.intentType = this.intentType.split(RemoteSettings.FORWARD_SLASH_STRING)[0].concat("/*");
            return true;
        }
        if (this.intentType.equalsIgnoreCase(strSubstring)) {
            return true;
        }
        this.intentType = "*/*";
        return true;
    }

    private boolean isLocalFile(Uri uri) {
        if ((uri.getScheme() == null || !uri.getScheme().equals("content")) && !"file".equals(uri.getScheme())) {
            return false;
        }
        String mimeType = getMimeType(uri.toString());
        if (mimeType == null) {
            mimeType = getMimeType(getRealPathFromURI(uri));
        }
        if (mimeType == null) {
            mimeType = "*/*";
        }
        String str = this.intentType;
        if (str == null) {
            this.intentType = mimeType;
            return true;
        }
        if (!str.equalsIgnoreCase(mimeType) && this.intentType.split(RemoteSettings.FORWARD_SLASH_STRING)[0].equalsIgnoreCase(mimeType.split(RemoteSettings.FORWARD_SLASH_STRING)[0])) {
            this.intentType = this.intentType.split(RemoteSettings.FORWARD_SLASH_STRING)[0].concat("/*");
            return true;
        }
        if (this.intentType.equalsIgnoreCase(mimeType)) {
            return true;
        }
        this.intentType = "*/*";
        return true;
    }

    public String getType() {
        String str = this.intentType;
        return str == null ? "*/*" : str;
    }

    public ArrayList<Uri> getURI() {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ArrayList<Uri> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < this.uris.size(); i2++) {
            Uri uri = this.uris.get(i2);
            if (isBase64File(uri)) {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(Xg.qd("5", (short) (FB.Xd() ^ 11324), (short) (FB.Xd() ^ 25266)))));
                String schemeSpecificPart = uri.getSchemeSpecificPart();
                String schemeSpecificPart2 = uri.getSchemeSpecificPart();
                short sXd = (short) (C1580rY.Xd() ^ (-1285));
                short sXd2 = (short) (C1580rY.Xd() ^ (-26493));
                int[] iArr = new int["w!3K8S_Z".length()];
                QB qb = new QB("w!3K8S_Z");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
                    i3++;
                }
                String strSubstring = schemeSpecificPart.substring(schemeSpecificPart2.indexOf(new String(iArr, 0, i3)) + 8);
                String str = this.filenames.size() >= i2 + 1 ? this.filenames.get(i2) : System.currentTimeMillis() + ZO.xd(Global.HYPHEN, (short) (Od.Xd() ^ (-20526)), (short) (Od.Xd() ^ (-11068))) + extensionFromMimeType;
                try {
                    File file = new File(this.useInternalStorage.booleanValue() ? this.reactContext.getCacheDir() : this.reactContext.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                    if (!file.exists() && !file.mkdirs()) {
                        throw new IOException(C1626yg.Ud("7?GMef\u0005H)]\u0004T>\u0018~Ai", (short) (OY.Xd() ^ 15578), (short) (OY.Xd() ^ 14376)) + file.getAbsolutePath());
                    }
                    File file2 = new File(file, str);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    Class<?> cls = Class.forName(Ig.wd("^2:g,qPi\u000b\u0015\b1HVQ\t>\u0001V", (short) (C1633zX.Xd() ^ (-13305))));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(EO.Od("[|\u0004Sv\u0002\u0007Lo7Z]\nz\u0018o", (short) (ZN.Xd() ^ 20117)));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr = {strSubstring, 0};
                    Method declaredMethod = cls.getDeclaredMethod(C1561oA.Qd("!!\u001e)\u001d\u001d", (short) (C1499aX.Xd() ^ (-8655))), clsArr);
                    try {
                        declaredMethod.setAccessible(true);
                        fileOutputStream.write((byte[]) declaredMethod.invoke(null, objArr));
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        arrayList.add(RNSharePathUtil.compatUriFromFile(this.reactContext, file2));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } else if (isLocalFile(uri) && uri.getPath() != null) {
                if (this.filenames.size() >= i2 + 1) {
                    arrayList.add(RNSharePathUtil.compatUriFromFile(this.reactContext, new File(uri.getPath(), this.filenames.get(i2))));
                } else {
                    arrayList.add(RNSharePathUtil.compatUriFromFile(this.reactContext, new File(uri.getPath())));
                }
            }
        }
        return arrayList;
    }

    public boolean isFile() {
        boolean z2 = true;
        for (Uri uri : this.uris) {
            z2 = isBase64File(uri) || isLocalFile(uri);
            if (!z2) {
                break;
            }
        }
        return z2;
    }
}
