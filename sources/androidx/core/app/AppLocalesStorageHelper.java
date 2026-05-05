package androidx.core.app;

import android.content.Context;
import android.util.Xml;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlSerializer;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
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

/* JADX INFO: loaded from: classes4.dex */
public class AppLocalesStorageHelper {
    static final String APPLICATION_LOCALES_RECORD_FILE = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    static final boolean DEBUG = false;
    static final String LOCALE_RECORD_ATTRIBUTE_TAG = "application_locales";
    static final String LOCALE_RECORD_FILE_TAG = "locales";
    static final String TAG = "AppLocalesStorageHelper";
    private static final Object sAppLocaleStorageSync = new Object();

    private AppLocalesStorageHelper() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ec, code lost:
    
        r10 = r5.getAttributeValue(null, yg.C1561oA.yd("\u0017'$!\u001b\u0016\u0011%\u0017\u001e\u001a\f\u0016\u001a\u000b\n2,7", (short) (yg.OY.Xd() ^ 15270)));
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0134 A[Catch: all -> 0x01f4, TryCatch #2 {, blocks: (B:5:0x0005, B:6:0x0067, B:7:0x006e, B:30:0x0128, B:31:0x012b, B:33:0x0131, B:35:0x0134, B:36:0x0168, B:38:0x016e, B:39:0x0191, B:40:0x01d5, B:43:0x01e0, B:44:0x01e4, B:47:0x01e8, B:48:0x01eb, B:50:0x01ed, B:51:0x01f1, B:52:0x01f2, B:8:0x0070, B:9:0x0092, B:11:0x0098, B:12:0x00b1, B:13:0x00be, B:17:0x00c8, B:23:0x00d4, B:25:0x00ec, B:28:0x0102), top: B:63:0x0005, inners: #1, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String readLocales(android.content.Context r12) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.AppLocalesStorageHelper.readLocales(android.content.Context):java.lang.String");
    }

    public static void persistLocales(Context context, String str) {
        synchronized (sAppLocaleStorageSync) {
            if (str.equals("")) {
                String strXd = C1561oA.Xd("\u001f-$31,(=s(89-:9=/C}2BC\u0002\u0016FG\u001bHGK=Q\"DLFIDXJ\u0014HXYVTONbX__Q_cXWc]lYma`mqd`hlpj", (short) (OY.Xd() ^ 13911));
                Class<?> cls = Class.forName(Wg.vd("7E8GA<4~1>:A/9<v)VRYG[T", (short) (OY.Xd() ^ 17657)));
                Class<?>[] clsArr = {Class.forName(Qg.kd("5+?)t2&2*o\u001441'+#", (short) (OY.Xd() ^ 18250), (short) (OY.Xd() ^ 17434)))};
                Object[] objArr = {strXd};
                short sXd = (short) (Od.Xd() ^ (-8830));
                short sXd2 = (short) (Od.Xd() ^ (-20555));
                int[] iArr = new int["  &\u001e,\u001c{\u001e \u0018".length()];
                QB qb = new QB("  &\u001e,\u001c{\u001e \u0018");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            try {
                String strUd = C1561oA.ud("\".#0,%\u001f2f\u0019'&\u0018# \"\u0012$\\\u000f\u001d\u001cXj\u0019\u0018i\u0015\u0012\u0014\u0004\u0016d\u0005\u000b\u0003\u0004|\u000f~Fx\u0007\u0006\u0001|ur\u0005x}{kwyliskxcugdoqb\\bdf^", (short) (ZN.Xd() ^ 31946));
                short sXd3 = (short) (ZN.Xd() ^ LeicaMakernoteDirectory.TAG_M16_C_VERSION);
                int[] iArr2 = new int["!-\"/3,&n+64919>v\u0013><A9KF".length()];
                QB qb2 = new QB("!-\"/3,&n+64919>v\u0013><A9KF");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
                    i3++;
                }
                Object[] objArr2 = {strUd, 0};
                Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(Xg.qd("\u0016\u0018\u000e\u0018p\u0015\u0019\u0013}%%\"((", (short) (OY.Xd() ^ 12935), (short) (OY.Xd() ^ ExifDirectoryBase.TAG_TILE_LENGTH)), Class.forName(C1561oA.Yd("!\u0019/\u001bh(\u001e,&m\u001465-3-", (short) (C1607wl.Xd() ^ 27642))), Integer.TYPE);
                try {
                    method2.setAccessible(true);
                    FileOutputStream fileOutputStream = (FileOutputStream) method2.invoke(context, objArr2);
                    XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                    try {
                        try {
                            xmlSerializerNewSerializer.setOutput(fileOutputStream, null);
                            xmlSerializerNewSerializer.startDocument(Jg.Wd("\n\u000br{t", (short) (C1633zX.Xd() ^ (-19298)), (short) (C1633zX.Xd() ^ (-15658))), true);
                            short sXd4 = (short) (C1499aX.Xd() ^ (-24016));
                            short sXd5 = (short) (C1499aX.Xd() ^ (-1844));
                            int[] iArr3 = new int["?MSWcR]".length()];
                            QB qb3 = new QB("?MSWcR]");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                                i4++;
                            }
                            xmlSerializerNewSerializer.startTag(null, new String(iArr3, 0, i4));
                            short sXd6 = (short) (ZN.Xd() ^ 20021);
                            short sXd7 = (short) (ZN.Xd() ^ 1619);
                            int[] iArr4 = new int["\u0011A\u0013[?w)\u0001]D\u0005H-10?% }".length()];
                            QB qb4 = new QB("\u0011A\u0013[?w)\u0001]D\u0005H-10?% }");
                            int i5 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + (i5 * sXd7))) + xuXd4.CK(iKK4));
                                i5++;
                            }
                            xmlSerializerNewSerializer.attribute(null, new String(iArr4, 0, i5), str);
                            xmlSerializerNewSerializer.endTag(null, Ig.wd("8\u0013\u0017/a\rx", (short) (C1499aX.Xd() ^ (-1564))));
                            xmlSerializerNewSerializer.endDocument();
                        } catch (Exception e3) {
                            EO.Od("\u000f\u000f\u001f e.Fk+\u001c\u007fx>I\nlG\u001e\u0006b=lI", (short) (FB.Xd() ^ 5037));
                            C1561oA.Qd("\u001e>8:04,c\u000421_\u000b- \u001d'\u001f,WpUz\u0015\u001c\u001e\u0016\u0014N\"\u001cK\u001b\u000f\u001b\u001b\u0010\u0019\u0019C\u0004\u0012\u0011L\u000b\r\u007f|\u0007~\f7\u007f\u00044\u0007\u0007\u0001\u0003pur,", (short) (C1633zX.Xd() ^ (-14773)));
                            if (fileOutputStream != null) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (FileNotFoundException unused3) {
                C1593ug.zd("f\u0017\u0018t\u0019\u000e\r\u0019\u0013\"\u0003%!%\u0015\u001c\u001b~\u001d%* .", (short) (Od.Xd() ^ (-5538)), (short) (Od.Xd() ^ (-5771)));
                String.format(C1561oA.od("\u001b;57-1)`\u0001/.\\\b*\u001d\u001a$\u001c)TmRw\u001a\u001c\u0014{\u001c p\u0019\u001e\u0016\u000bj\u001d\u0007\b\u0012\u0015\t\u000e\fV;]z\u0007\u0006\u0006\n4\u0003\u0003v~/tvxp*.{'ltv#ysisgkc\u001b", (short) (C1607wl.Xd() ^ 24101)), C1561oA.Kd("'5,;940E{0@A5BAE7K\u0006:JK\n\u001eNO#POSEY*LTNQL`R\u001cP`a^\\WVj`ggYgk`_ketauihuylhptxr", (short) (C1580rY.Xd() ^ (-23632))));
                return;
            }
        }
    }
}
