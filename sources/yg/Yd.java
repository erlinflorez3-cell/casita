package yg;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class Yd extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() throws Throwable {
        Object[] objArr;
        Method declaredMethod;
        String strZd = C1593ug.zd("\u0007\u0006\nz", (short) (C1499aX.Xd() ^ (1424206882 ^ (-1424206497))), (short) (C1499aX.Xd() ^ ((342332569 ^ 489586424) ^ (-155837229))));
        short sXd = (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (1810528629 ^ 1516438916)));
        int[] iArr = new int["A.s=\u001d".length()];
        QB qb = new QB("A.s=\u001d");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd2 = (short) (C1633zX.Xd() ^ ((1006005452 ^ 345403296) ^ (-794842702)));
        int[] iArr2 = new int[";U".length()];
        QB qb2 = new QB(";U");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
            field.setAccessible(true);
            field.set(null, strZd);
        } catch (Throwable th) {
        }
        short sXd3 = (short) (FB.Xd() ^ ((76777713 ^ 750662258) ^ 674072068));
        short sXd4 = (short) (FB.Xd() ^ (967557687 ^ 967558027));
        int[] iArr3 = new int["\u00058\u001b%\ria\u0017;L8*UBDlm~j[H6'APQD#\u001b\u007fz".length()];
        QB qb3 = new QB("\u00058\u001b%\ria\u0017;L8*UBDlm~j[H6'APQD#\u001b\u007fz");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(((i4 * sXd4) ^ sXd3) + xuXd3.CK(iKK3));
            i4++;
        }
        try {
            Object objInvoke = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.Xd("\u0002\u0001\u0011`\u000e\u000e\u0015\u0007\u001b\u0018", (short) (FB.Xd() ^ (2124673445 ^ 2124670005))), new Class[0]).invoke(this, new Object[0]);
            GF.Yd(objInvoke);
            Class<?> cls2 = Class.forName(Wg.vd(",\u0019b,\b", (short) (C1607wl.Xd() ^ (624320774 ^ 624327526))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Qg.kd("cYmW#`T`X\u001e>PWQN^", (short) (C1499aX.Xd() ^ (1387309828 ^ (-1387322864))), (short) (C1499aX.Xd() ^ ((205922716 ^ 1074203710) ^ (-1279346251)))));
            objArr = new Object[]{objInvoke};
            declaredMethod = cls2.getDeclaredMethod(hg.Vd("\u001c&", (short) (C1580rY.Xd() ^ ((2134546005 ^ 557843842) ^ (-1585098936))), (short) (C1580rY.Xd() ^ ((654771768 ^ 430081715) ^ (-1051042290)))), clsArr);
        } catch (Exception e2) {
        }
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
            String strUd = C1561oA.ud("$\u0011V \u007f", (short) (C1580rY.Xd() ^ (131468663 ^ (-131493776))));
            String strYd = C1561oA.yd("AK", (short) (C1580rY.Xd() ^ (861180837 ^ (-861199127))));
            try {
                Class<?> cls3 = Class.forName(strUd);
                Field field2 = 0 != 0 ? cls3.getField(strYd) : cls3.getDeclaredField(strYd);
                field2.setAccessible(true);
                field2.set(null, strZd);
                return true;
            } catch (Throwable th2) {
                return true;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
