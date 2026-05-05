package androidx.webkit.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.zip.GZIPInputStream;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
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
public class AssetHelper {
    public static final String DEFAULT_MIME_TYPE = "text/plain";
    private final Context mContext;

    public AssetHelper(Context context) {
        this.mContext = context;
    }

    private static InputStream handleSvgzStream(String str, InputStream inputStream) throws IOException {
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static String removeLeadingSlash(String str) {
        return (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
    }

    private int getFieldId(String str, String str2) throws Throwable {
        Context context = this.mContext;
        Class<?> cls = Class.forName(C1561oA.Kd("6D;JHC?\n@MMTFPW\u0012(UU\\Nb_", (short) (OY.Xd() ^ 27784)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 31143);
        short sXd2 = (short) (OY.Xd() ^ 20385);
        int[] iArr = new int["4r\u0014p\u0018\u00135$A\u001a;%q{".length()];
        QB qb = new QB("4r\u0014p\u0018\u00135$A\u001a;%q{");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            String str3 = (String) method.invoke(context, objArr);
            Context context2 = this.mContext;
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Xd("bpgvtok6lyy\u0001r|\u0004>T\u0002\u0002\tz\u000f\f", (short) (Od.Xd() ^ (-1934)))).getMethod(Wg.vd("=:H%7D?D@01>", (short) (C1499aX.Xd() ^ (-4948))), new Class[0]);
            try {
                method2.setAccessible(true);
                return ((Resources) method2.invoke(context2, objArr2)).getIdentifier(str2, str, str3);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private int getValueType(int i2) throws Throwable {
        TypedValue typedValue = new TypedValue();
        Context context = this.mContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("/;0=92,t)427'/4l\u0001,*/\u001f1,", (short) (C1499aX.Xd() ^ (-31257)), (short) (C1499aX.Xd() ^ (-10728)))).getMethod(hg.Vd("TQ_<N[V[WGHU", (short) (OY.Xd() ^ 13260), (short) (OY.Xd() ^ 9842)), new Class[0]);
        try {
            method.setAccessible(true);
            ((Resources) method.invoke(context, objArr)).getValue(i2, typedValue, true);
            return typedValue.type;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public InputStream openResource(String str) throws Throwable {
        String strRemoveLeadingSlash = removeLeadingSlash(str);
        String[] strArrSplit = strRemoveLeadingSlash.split(C1561oA.Yd("\u000e", (short) (C1633zX.Xd() ^ (-1032))), -1);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException(C1626yg.Ud("\u0017P]b]2\u001f-\u00079l\u001bu\u001dYP/\u001f_V7\u0004%}[", (short) (C1633zX.Xd() ^ (-1251)), (short) (C1633zX.Xd() ^ (-31446))) + strRemoveLeadingSlash);
        }
        String str2 = strArrSplit[0];
        String strSubstring = strArrSplit[1];
        int iLastIndexOf = strSubstring.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        int fieldId = getFieldId(str2, strSubstring);
        int valueType = getValueType(fieldId);
        if (valueType != 3) {
            throw new IOException(String.format(ZO.xd("\u0016|zf*d=\u0012\u000bJM\u007f\r\u0007\u0013bu5Brs'\bKmCt&K*QAj\u000e>]I\u0018~j]\u0002C9\rf#JYrLO", (short) (ZN.Xd() ^ 31286), (short) (ZN.Xd() ^ 4574)), strRemoveLeadingSlash, Integer.valueOf(valueType)));
        }
        Context context = this.mContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("iwn}{vr=s\u0001\u0001\by\u0004\u000bE[\t\t\u0010\u0002\u0016\u0013", (short) (ZN.Xd() ^ 22192), (short) (ZN.Xd() ^ 30082))).getMethod(Jg.Wd("\f'&svs?5\"\u0007y\u0014", (short) (FB.Xd() ^ 7050), (short) (FB.Xd() ^ 24896)), new Class[0]);
        try {
            method.setAccessible(true);
            return handleSvgzStream(strRemoveLeadingSlash, ((Resources) method.invoke(context, objArr)).openRawResource(fieldId));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public InputStream openAsset(String str) throws Throwable {
        String strRemoveLeadingSlash = removeLeadingSlash(str);
        Context context = this.mContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("~\u000b\u007f\r\t\u0002{Dx\u0004\u0002\u0007v~\u0004<P{y~n\u0001{", (short) (FB.Xd() ^ 32625))).getMethod(C1561oA.yd("\u0019\u0018$q)*\u0019)\u001d", (short) (ZN.Xd() ^ 3514)), new Class[0]);
        try {
            method.setAccessible(true);
            return handleSvgzStream(strRemoveLeadingSlash, ((AssetManager) method.invoke(context, objArr)).open(strRemoveLeadingSlash, 2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static InputStream openFile(File file) throws IOException {
        return handleSvgzStream(file.getPath(), new FileInputStream(file));
    }

    public static File getCanonicalFileIfChild(File file, String str) throws IOException {
        String canonicalDirPath = getCanonicalDirPath(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(canonicalDirPath)) {
            return new File(canonicalPath);
        }
        return null;
    }

    public static String getCanonicalDirPath(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith(RemoteSettings.FORWARD_SLASH_STRING) ? canonicalPath + RemoteSettings.FORWARD_SLASH_STRING : canonicalPath;
    }

    public static File getDataDir(Context context) {
        return ApiHelperForN.getDataDir(context);
    }

    public static String guessMimeType(String str) {
        String mimeFromFileName = MimeUtil.getMimeFromFileName(str);
        return mimeFromFileName == null ? "text/plain" : mimeFromFileName;
    }
}
