package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
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
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
class DocumentsContractApi19 {
    private static final int FLAG_VIRTUAL_DOCUMENT = 512;
    private static final String TAG = "DocumentFile";

    public static boolean isVirtual(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (-1) - (((-1) - getFlags(context, uri)) | ((-1) - 512)) != 0;
    }

    public static String getName(Context context, Uri uri) {
        return queryForString(context, uri, "_display_name", null);
    }

    private static String getRawType(Context context, Uri uri) {
        return queryForString(context, uri, "mime_type", null);
    }

    public static String getType(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        if ("vnd.android.document/directory".equals(rawType)) {
            return null;
        }
        return rawType;
    }

    public static long getFlags(Context context, Uri uri) {
        return queryForLong(context, uri, "flags", 0L);
    }

    public static boolean isDirectory(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(getRawType(context, uri));
    }

    public static boolean isFile(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        return ("vnd.android.document/directory".equals(rawType) || TextUtils.isEmpty(rawType)) ? false : true;
    }

    public static long lastModified(Context context, Uri uri) {
        return queryForLong(context, uri, "last_modified", 0L);
    }

    public static long length(Context context, Uri uri) {
        return queryForLong(context, uri, "_size", 0L);
    }

    public static boolean canRead(Context context, Uri uri) throws Throwable {
        Object[] objArr = {uri, 1};
        Method method = Class.forName(EO.Od("*qUDh\u0017.(\u0004\u0015\u0016u\u0011 :N j\u0012ovbp", (short) (C1580rY.Xd() ^ (-28153)))).getMethod(C1593ug.zd("\b\u000e\f\u000b\u0014l\f\u0018\u0019\u0017\u001d\u0017\u007f$\u0006\u0019!\u001c\f*\"\n .*'23*11", (short) (ZN.Xd() ^ 27416), (short) (ZN.Xd() ^ 19028)), Class.forName(C1561oA.Qd("YeZgc\\V\u001f^Tb\u001bA]S", (short) (C1499aX.Xd() ^ (-6461)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            return ((Integer) method.invoke(context, objArr)).intValue() == 0 && !TextUtils.isEmpty(getRawType(context, uri));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean canWrite(Context context, Uri uri) throws Throwable {
        Object[] objArr = {uri, 2};
        Method method = Class.forName(C1561oA.od("\u0016\"\u0017$ \u0019\u0013[\u0010\u001b\u0019\u001e\u000e\u0016\u001bSg\u0013\u0011\u0016\u0006\u0018\u0013", (short) (C1580rY.Xd() ^ (-16550)))).getMethod(Wg.Zd("8 ~!\fE\bu*\tp\u0006O\u0015ZNiF\u0017X25,\u001cK)U:\u0012<\u001e", (short) (ZN.Xd() ^ 12152), (short) (ZN.Xd() ^ 10433)), Class.forName(C1561oA.Kd("iwn}{vr=~v\u0007Ai\b\u007f", (short) (C1499aX.Xd() ^ (-22067)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            if (((Integer) method.invoke(context, objArr)).intValue() != 0) {
                return false;
            }
            String rawType = getRawType(context, uri);
            int iQueryForInt = queryForInt(context, uri, C1561oA.Xd("\u0012\u0019\u000f\u0016#", (short) (C1607wl.Xd() ^ 14607)), 0);
            if (TextUtils.isEmpty(rawType)) {
                return false;
            }
            if ((-1) - (((-1) - iQueryForInt) | ((-1) - 4)) != 0) {
                return true;
            }
            if (!Wg.vd("6/&p%3*972.x0<1D=6@G\u00039?I=<NJNV", (short) (C1499aX.Xd() ^ (-30605))).equals(rawType) || (-1) - (((-1) - iQueryForInt) | ((-1) - 8)) == 0) {
                return (TextUtils.isEmpty(rawType) || (iQueryForInt & 2) == 0) ? false : true;
            }
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean exists(Context context, Uri uri) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 12584);
        short sXd2 = (short) (C1607wl.Xd() ^ 24338);
        int[] iArr = new int["p\u000b\u0012\u0014\f\nD\u0015\u0018\u0007\u0013\u0019X=".length()];
        QB qb = new QB("p\u000b\u0012\u0014\f\nD\u0015\u0018\u0007\u0013\u0019X=");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd3 = (short) (C1633zX.Xd() ^ (-8820));
        short sXd4 = (short) (C1633zX.Xd() ^ (-19554));
        int[] iArr2 = new int["frgtpic,`kin^fk$8cafVhc".length()];
        QB qb2 = new QB("frgtpic,`kin^fk$8cafVhc");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.ud(":7E\u0013><A19>\u001b-:51:(4", (short) (C1607wl.Xd() ^ 9626)), new Class[0]);
        try {
            method.setAccessible(true);
            ContentResolver contentResolver = (ContentResolver) method.invoke(context, objArr);
            Cursor cursorQuery = null;
            try {
                String[] strArr = new String[1];
                strArr[0] = C1561oA.yd("AKBSF=INDMK", (short) (C1607wl.Xd() ^ 8367));
                cursorQuery = contentResolver.query(uri, strArr, null, null, null);
                return cursorQuery.getCount() > 0;
            } catch (Exception e2) {
                C1561oA.Yd(",XM`YR\\c6Z^X", (short) (OY.Xd() ^ 30353));
                String str2 = str + e2;
                return false;
            } finally {
                closeQuietly(cursorQuery);
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static String queryForString(Context context, Uri uri, String str, String str2) throws Throwable {
        String strWd = Ig.wd("?\bB]'P0*fCN;0\u0010", (short) (C1499aX.Xd() ^ (-2704)));
        Class<?> cls = Class.forName(EO.Od("\u0011O7\"~EPJ*74\u001c;>\\t>\t0R}IW", (short) (C1607wl.Xd() ^ 12991)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-5330));
        int[] iArr = new int["sp~LwuzjrwTfsnjsam".length()];
        QB qb = new QB("sp~LwuzjrwTfsnjsam");
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
            Cursor cursorQuery = null;
            try {
                cursorQuery = ((ContentResolver) method.invoke(context, objArr)).query(uri, new String[]{str}, null, null, null);
                return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? str2 : cursorQuery.getString(0);
            } catch (Exception e2) {
                C1593ug.zd("q\u001e\u0013&\u001f\u0018\"){ $\u001e", (short) (C1633zX.Xd() ^ (-127)), (short) (C1633zX.Xd() ^ (-28892)));
                String str3 = strWd + e2;
                return str2;
            } finally {
                closeQuietly(cursorQuery);
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static int queryForInt(Context context, Uri uri, String str, int i2) {
        return (int) queryForLong(context, uri, str, i2);
    }

    private static long queryForLong(Context context, Uri uri, String str, long j2) throws Throwable {
        String strQd = Xg.qd("6R[_YY\u0016hm^lt6\u001d", (short) (C1580rY.Xd() ^ (-3149)), (short) (C1580rY.Xd() ^ (-15147)));
        short sXd = (short) (FB.Xd() ^ 30440);
        short sXd2 = (short) (FB.Xd() ^ 29694);
        int[] iArr = new int["p\u000ffO6Yf\u0012\u001a\u0018@W2\u0006}`\u007f\u001eg_\u0002\u0016\u0004".length()];
        QB qb = new QB("p\u000ffO6Yf\u0012\u001a\u0018@W2\u0006}`\u007f\u001eg_\u0002\u0016\u0004");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("W\u0002c/qw\fisyM7\u000b6\u0003\u0010\u0012=", (short) (C1499aX.Xd() ^ (-8945)), (short) (C1499aX.Xd() ^ (-24014))), new Class[0]);
        try {
            method.setAccessible(true);
            Cursor cursorQuery = null;
            try {
                cursorQuery = ((ContentResolver) method.invoke(context, objArr)).query(uri, new String[]{str}, null, null, null);
                return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? j2 : cursorQuery.getLong(0);
            } catch (Exception e2) {
                C1626yg.Ud("?zE,\nGM_\u001eW<B", (short) (Od.Xd() ^ (-11680)), (short) (Od.Xd() ^ (-10942)));
                String str2 = strQd + e2;
                return j2;
            } finally {
                closeQuietly(cursorQuery);
            }
            closeQuietly(cursorQuery);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static void closeQuietly(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private DocumentsContractApi19() {
    }
}
