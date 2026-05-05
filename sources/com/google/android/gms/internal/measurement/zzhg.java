package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import androidx.collection.SimpleArrayMap;
import com.google.common.base.Optional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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

/* JADX INFO: loaded from: classes8.dex */
public final class zzhg {

    public static class zza {
        private static volatile Optional<zzhh> zza = null;

        private zza() {
        }

        public static Optional<zzhh> zza(Context context) {
            Optional<zzhh> optionalZza = zza;
            if (optionalZza == null) {
                synchronized (zza.class) {
                    optionalZza = zza;
                    if (optionalZza == null) {
                        new zzhg();
                        if (zzhk.zza(Build.TYPE, Build.TAGS)) {
                            if (zzgs.zza()) {
                                Class<?> cls = Class.forName(C1561oA.ud("htivrke.bmkp`hm&:echXje", (short) (Od.Xd() ^ (-12395))));
                                Class<?>[] clsArr = new Class[0];
                                Object[] objArr = new Object[0];
                                short sXd = (short) (C1633zX.Xd() ^ (-25786));
                                int[] iArr = new int["w\u0001Tt\u0001ropVww{gdxh\u0003p\u0015\u000f\rz\u0004\u0001".length()];
                                QB qb = new QB("w\u0001Tt\u0001ropVww{gdxh\u0003p\u0015\u000f\rz\u0004\u0001");
                                int i2 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                                    i2++;
                                }
                                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                                try {
                                    method.setAccessible(true);
                                    if (!((Boolean) method.invoke(context, objArr)).booleanValue()) {
                                        Object[] objArr2 = new Object[0];
                                        Method method2 = Class.forName(C1561oA.Yd("\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\u0010\u001d\u001d$\u0016 'aw%%,\u001e2/", (short) (Od.Xd() ^ (-26926)))).getMethod(Xg.qd("\"2&#7)\t+=1,/\u001b><B43E77'IEI9@?\u001eKKRDXU", (short) (C1607wl.Xd() ^ 23505), (short) (C1607wl.Xd() ^ 31440)), new Class[0]);
                                        try {
                                            method2.setAccessible(true);
                                            context = (Context) method2.invoke(context, objArr2);
                                        } catch (InvocationTargetException e2) {
                                            throw e2.getCause();
                                        }
                                    }
                                } catch (InvocationTargetException e3) {
                                    throw e3.getCause();
                                }
                            }
                            optionalZza = zzhg.zza(context);
                        } else {
                            optionalZza = Optional.absent();
                        }
                        zza = optionalZza;
                    }
                }
            }
            return optionalZza;
        }
    }

    private static zzhh zza(Context context, File file) {
        BufferedReader bufferedReader;
        SimpleArrayMap simpleArrayMap;
        HashMap map;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                simpleArrayMap = new SimpleArrayMap();
                map = new HashMap();
            } finally {
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
        while (true) {
            String line = bufferedReader.readLine();
            Jg.Wd("\u0016.\u0014$r^k:s4\u0010]=A\t+\u0002Uh>#", (short) (ZN.Xd() ^ 2349), (short) (ZN.Xd() ^ 20923));
            if (line == null) {
                break;
            }
            short sXd = (short) (C1607wl.Xd() ^ 4629);
            short sXd2 = (short) (C1607wl.Xd() ^ 29093);
            int[] iArr = new int["r".length()];
            QB qb = new QB("r");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            String[] strArrSplit = line.split(new String(iArr, 0, i2), 3);
            if (strArrSplit.length != 3) {
                String str = C1626yg.Ud("E#\u000f}(\u0017H?\n", (short) (ZN.Xd() ^ 2664), (short) (ZN.Xd() ^ 25492)) + line;
            } else {
                String strZza = zza(strArrSplit[0]);
                String strDecode = Uri.decode(zza(strArrSplit[1]));
                String strDecode2 = (String) map.get(strArrSplit[2]);
                if (strDecode2 == null) {
                    String strZza2 = zza(strArrSplit[2]);
                    strDecode2 = Uri.decode(strZza2);
                    if (strDecode2.length() < 1024 || strDecode2 == strZza2) {
                        map.put(strZza2, strDecode2);
                    }
                }
                SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) simpleArrayMap.get(strZza);
                if (simpleArrayMap2 == null) {
                    simpleArrayMap2 = new SimpleArrayMap();
                    simpleArrayMap.put(strZza, simpleArrayMap2);
                }
                simpleArrayMap2.put(strDecode, strDecode2);
            }
            throw new RuntimeException(e2);
        }
        String strValueOf = String.valueOf(file);
        Class<?> cls = Class.forName(Ig.wd("\u0019s{-z\u0018z,\u0013NSs\u001a\u0015O&~\u0011Wa\u0014r\u0011", (short) (ZN.Xd() ^ 17456)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (C1633zX.Xd() ^ (-26596));
        int[] iArr2 = new int["*_\u0011\fe\u001dxf\u0010A Y\u0015\u000f".length()];
        QB qb2 = new QB("*_\u0011\fe\u001dxf\u0010A Y\u0015\u000f");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            String str2 = C1561oA.Qd("[k{{lj%", (short) (C1607wl.Xd() ^ 29525)) + strValueOf + C1593ug.zd("\bOY]\f.\\Sb`[W\u0014eWZcZa`\u001c", (short) (Od.Xd() ^ (-29709)), (short) (Od.Xd() ^ (-6196))) + ((String) method.invoke(context, objArr));
            zzgy zzgyVar = new zzgy(simpleArrayMap);
            bufferedReader.close();
            return zzgyVar;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static Optional<zzhh> zza(Context context) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            Optional<File> optionalZzb = zzb(context);
            return optionalZzb.isPresent() ? Optional.of(zza(context, optionalZzb.get())) : Optional.absent();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }

    private static Optional<File> zzb(Context context) throws Throwable {
        try {
            String strOd = C1561oA.od("ulhpptxnb[c_ke\\j^W", (short) (C1607wl.Xd() ^ 6514));
            short sXd = (short) (C1633zX.Xd() ^ (-3754));
            int[] iArr = new int["IWN][VR\u001dS``gYcj%;hhoaur".length()];
            QB qb = new QB("IWN][VR\u001dS``gYcj%;hhoaur");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(Wg.Zd("\rTB}~\u000e[5\u0007\u001e\u0018\n@\u0004a+", (short) (OY.Xd() ^ 29327), (short) (OY.Xd() ^ 8682)));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {strOd, 0};
            Method method = cls.getMethod(C1561oA.Xd("\u001c\u001b+{\",", (short) (Od.Xd() ^ (-23792))), clsArr);
            try {
                method.setAccessible(true);
                File file = new File((File) method.invoke(context, objArr), Wg.vd("\u000e\u0016\u0002\u0010\r\u0005|~\u001aU\u0019\u001e\u0017", (short) (ZN.Xd() ^ 25945)));
                return file.exists() ? Optional.of(file) : Optional.absent();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (RuntimeException e3) {
            Qg.kd("\u00151=7.<0)\u000b-/'\u00106$0/%\u001f\u001f,", (short) (Od.Xd() ^ (-9713)), (short) (Od.Xd() ^ (-6391)));
            short sXd2 = (short) (OY.Xd() ^ 15809);
            short sXd3 = (short) (OY.Xd() ^ 2235);
            int[] iArr2 = new int["\u0007\u00076yu\bs1tx\u0001".length()];
            QB qb2 = new QB("\u0007\u00076yu\bs1tx\u0001");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                i3++;
            }
            new String(iArr2, 0, i3);
            return Optional.absent();
        }
    }
}
