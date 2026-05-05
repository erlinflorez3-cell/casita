package com.reactnativecommunity.asyncstorage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import com.facebook.react.bridge.ReadableArray;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class AsyncLocalStorageUtil {
    static String buildKeySelection(int i2) {
        String[] strArr = new String[i2];
        Arrays.fill(strArr, Global.QUESTION);
        return "key IN (" + TextUtils.join(", ", strArr) + ")";
    }

    static String[] buildKeySelectionArgs(ReadableArray readableArray, int i2, int i3) {
        String[] strArr = new String[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            strArr[i4] = readableArray.getString(i2 + i4);
        }
        return strArr;
    }

    private static void deepMergeInto(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(next);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject2 == null) {
                jSONObject.put(next, jSONObject2.get(next));
            } else {
                deepMergeInto(jSONObjectOptJSONObject2, jSONObjectOptJSONObject);
                jSONObject.put(next, jSONObjectOptJSONObject2);
            }
        }
    }

    @Nullable
    public static String getItemImpl(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorQuery = sQLiteDatabase.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            if (cursorQuery.moveToFirst()) {
                return cursorQuery.getString(0);
            }
            cursorQuery.close();
            return null;
        } finally {
            cursorQuery.close();
        }
    }

    static boolean mergeImpl(SQLiteDatabase sQLiteDatabase, String str, String str2) throws JSONException {
        String itemImpl = getItemImpl(sQLiteDatabase, str);
        if (itemImpl != null) {
            JSONObject jSONObject = new JSONObject(itemImpl);
            deepMergeInto(jSONObject, new JSONObject(str2));
            str2 = jSONObject.toString();
        }
        return setItemImpl(sQLiteDatabase, str, str2);
    }

    static boolean setItemImpl(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("value", str2);
        return -1 != sQLiteDatabase.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5);
    }

    public static void verifyAndForceSqliteCheckpoint(Context context) throws Throwable {
        int i2 = Build.VERSION.SDK_INT;
        ZO.xd("hW\u001b9Mj;1b?4{7y\u001e\u007f\u001a", (short) (Od.Xd() ^ (-13151)), (short) (Od.Xd() ^ (-23298)));
        if (i2 < 28) {
            short sXd = (short) (Od.Xd() ^ (-29765));
            short sXd2 = (short) (Od.Xd() ^ (-20989));
            int[] iArr = new int["vxl03:'\u0014\u001d\u007f,/Xnq.Ri\u001a=]Z\u001eiZu3/\u000bCAj\t>\\S;65([m+\u0005\u0013T\u0002]K\u00163".length()];
            QB qb = new QB("vxl03:'\u0014\u001d\u007f,/Xnq.Ri\u001a=]Z\u001eiZu3/\u000bCAj\t>\\S;65([m+\u0005\u0013T\u0002]K\u00163");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
                i3++;
            }
            new String(iArr, 0, i3);
        }
        String strWd = Ig.wd("P4ly\u0017)n\u0012I\u0019\u001d\u0001", (short) (C1580rY.Xd() ^ (-11654)));
        Class<?> cls = Class.forName(EO.Od("&y\u00044j\u0011[<=)&\u000eNQOfQs:<hS!", (short) (ZN.Xd() ^ 11981)));
        Class<?>[] clsArr = {Class.forName(C1561oA.Qd("si}g3pdph.Rroeia", (short) (Od.Xd() ^ (-4526))))};
        Object[] objArr = {strWd};
        short sXd3 = (short) (Od.Xd() ^ (-14494));
        short sXd4 = (short) (Od.Xd() ^ (-25819));
        int[] iArr2 = new int["UTd5SgUWWj]I[od".length()];
        QB qb2 = new QB("UTd5SgUWWj]I[od");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i4)) - sXd4);
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            File file = (File) method.invoke(context, objArr);
            String strOd = C1561oA.od("\u001e\u0016\u001d=79',)", (short) (OY.Xd() ^ 24196));
            Class<?> cls2 = Class.forName(C1561oA.Kd(")7.=;62|3@@G9CJ\u0005\u001bHHOAUR", (short) (C1607wl.Xd() ^ 20614)));
            Class<?>[] clsArr2 = {Class.forName(Wg.Zd("\u00107-H\u0016AVTJAK-\u001cs)\u001b", (short) (C1607wl.Xd() ^ 26937), (short) (C1607wl.Xd() ^ 494)))};
            Object[] objArr2 = {strOd};
            short sXd5 = (short) (C1499aX.Xd() ^ (-15814));
            int[] iArr3 = new int["ts\u0004Tr\u0007tvv\n|hz\u000f\u0004".length()];
            QB qb3 = new QB("ts\u0004Tr\u0007tvv\n|hz\u000f\u0004");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd5 + i5));
                i5++;
            }
            Method method2 = cls2.getMethod(new String(iArr3, 0, i5), clsArr2);
            try {
                method2.setAccessible(true);
                File file2 = (File) method2.invoke(context, objArr2);
                if (file.exists() || !file2.exists()) {
                    C1561oA.ud("\b\u0005~\u001b%\u0015N\u0011\u0015\u0011\u000e\u0015\u0019\u0017\u0010\u0014\u0019C\u0011\u0011\u0015?\u0011\u0003\u000e\u0011\u0004\f}{D", (short) (Od.Xd() ^ (-1218)));
                    return;
                }
                try {
                    ReactDatabaseSupplier reactDatabaseSupplier = ReactDatabaseSupplier.getInstance(context);
                    reactDatabaseSupplier.get().rawQuery(Wg.vd("OPBGH;\u001dsXbX[[WX__]Z^_", (short) (FB.Xd() ^ 4529)), null).close();
                    reactDatabaseSupplier.closeDatabase();
                    short sXd6 = (short) (Od.Xd() ^ (-31834));
                    short sXd7 = (short) (Od.Xd() ^ (-8813));
                    int[] iArr4 = new int["}&(\u0018\u001d!\u0019P\u0003\u007fy\u0016 \u0010I\f\u0010\f\t\u0010\u0014\u0012\u000b\u000f\u0014>\u0011\u0012~}~\f\u000b|\u000b\u0001A".length()];
                    QB qb4 = new QB("}&(\u0018\u001d!\u0019P\u0003\u007fy\u0016 \u0010I\f\u0010\f\t\u0010\u0014\u0012\u000b\u000f\u0014>\u0011\u0012~}~\f\u000b|\u000b\u0001A");
                    int i6 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i6] = xuXd4.fK(((sXd6 + i6) + xuXd4.CK(iKK4)) - sXd7);
                        i6++;
                    }
                    new String(iArr4, 0, i6);
                } catch (Exception e2) {
                    String str = hg.Vd("%PUKB|JJNx>FH89r59529=;48=g64d\u0016\u000e\u00155/1\u001f$!fY- \u001cU\u0003\u0019+&P##\u001d\u001f\r\u0012\u000fH\u0015\u0010\r\r\u0018B\u0010\u0010\u0014>\u000b\u0006\u0003\rz\r|6\n|x2uq\u0004o-|}yymyr~>#", (short) (ZN.Xd() ^ 17754), (short) (ZN.Xd() ^ 3427)) + e2.getMessage();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
