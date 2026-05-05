package com.google.android.gms.internal.vision;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import com.dynatrace.android.agent.Global;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbh {
    private static zzbe zza(File file) {
        BufferedReader bufferedReader;
        HashMap map;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                map = new HashMap();
            } finally {
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                String strValueOf = String.valueOf(file);
                new StringBuilder(String.valueOf(strValueOf).length() + 7).append("Parsed ").append(strValueOf).toString();
                zzbe zzbeVar = new zzbe(map);
                bufferedReader.close();
                return zzbeVar;
            }
            String[] strArrSplit = line.split(Global.BLANK, 3);
            if (strArrSplit.length != 3) {
                String strValueOf2 = String.valueOf(line);
                if (strValueOf2.length() != 0) {
                    "Invalid: ".concat(strValueOf2);
                } else {
                    new String("Invalid: ");
                }
            } else {
                String str = strArrSplit[0];
                String strDecode = Uri.decode(strArrSplit[1]);
                String strDecode2 = Uri.decode(strArrSplit[2]);
                if (!map.containsKey(str)) {
                    map.put(str, new HashMap());
                }
                ((Map) map.get(str)).put(strDecode, strDecode2);
            }
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.vision.zzcy<com.google.android.gms.internal.vision.zzbe> zza(android.content.Context r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzbh.zza(android.content.Context):com.google.android.gms.internal.vision.zzcy");
    }

    private static zzcy<File> zzb(Context context) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            String strWd = Ig.wd("\u007f)\u0014\u0002#z\u0018\u0017=Ze\u0001?@X\u0011--", (short) (FB.Xd() ^ 17802));
            Class<?> cls = Class.forName(EO.Od("&z\u00054k\u0013[??*)\u000fNSOiSs==hV\"", (short) (FB.Xd() ^ 20270)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.Qd("\u001e\u0014(\u0012]\u001b\u000f\u001b\u0013X|\u001d\u001a\u0010\u0014\f", (short) (ZN.Xd() ^ 30736)));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {strWd, 0};
            Method method = cls.getMethod(C1593ug.zd("UTd5[e", (short) (Od.Xd() ^ (-27295)), (short) (Od.Xd() ^ (-16168))), clsArr);
            try {
                method.setAccessible(true);
                File file = new File((File) method.invoke(context, objArr), C1561oA.od("'-\u001b'&\u001c\u0016\u0016#\\\"% ", (short) (C1607wl.Xd() ^ 3134)));
                return file.exists() ? zzcy.zza(file) : zzcy.zzc();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (RuntimeException e3) {
            C1561oA.Kd("\u0002 .*#3)$\b,0*\u0015=-;<402A", (short) (OY.Xd() ^ 26133));
            short sXd = (short) (FB.Xd() ^ 21603);
            short sXd2 = (short) (FB.Xd() ^ 27575);
            int[] iArr = new int["'\u001bb\u001aNTX\n5MM".length()];
            QB qb = new QB("'\u001bb\u001aNTX\n5MM");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            new String(iArr, 0, i2);
            return zzcy.zzc();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
