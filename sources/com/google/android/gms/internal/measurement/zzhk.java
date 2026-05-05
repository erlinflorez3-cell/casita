package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.collection.ArrayMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.Od;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhk {
    private static final ArrayMap<String, Uri> zza = new ArrayMap<>();

    public static synchronized Uri zza(String str) {
        Uri uri;
        ArrayMap<String, Uri> arrayMap = zza;
        uri = arrayMap.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            arrayMap.put(str, uri);
        }
        return uri;
    }

    public static String zza(Context context, String str) throws Throwable {
        String strQd = C1561oA.Qd("H", (short) (C1499aX.Xd() ^ (-27414)));
        if (str.contains(strQd)) {
            throw new IllegalArgumentException(C1561oA.Kd("l\u0002\u007f;\r~\u0012\u0013\u0006\u0006B\r\u0013E\u0017\t\f\u0015\f\u0013\u0012M\u0012\u0011\u001f \"(T\u0017#*\u001e\u001b\u001f5\\& 6&a$c8;)8*-6-43\to", (short) (Od.Xd() ^ (-18543))) + str);
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("KYP_]XT\u001fUbbi[el'=jjqcwt", (short) (C1580rY.Xd() ^ (-30928)), (short) (C1580rY.Xd() ^ (-9283)))).getMethod(C1561oA.od("khvQabi^c`HZe\\", (short) (C1580rY.Xd() ^ (-334))), new Class[0]);
        try {
            method.setAccessible(true);
            return str + strQd + ((String) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean zza(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
