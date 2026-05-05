package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;
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
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
final class zzn {
    zzn() {
    }

    private static zzo zzd(SharedPreferences sharedPreferences, String str) throws zzp {
        String string = sharedPreferences.getString(zzak.zzh(str, "|P|"), null);
        String string2 = sharedPreferences.getString(zzak.zzh(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new zzo(zzg(string, string2), zze(sharedPreferences, str));
    }

    private static zzo zzd(File file) throws zzp, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String property = properties.getProperty("pub");
            String property2 = properties.getProperty("pri");
            if (property == null || property2 == null) {
                zzd((Throwable) null, fileInputStream);
                return null;
            }
            try {
                zzo zzoVar = new zzo(zzg(property, property2), Long.parseLong(properties.getProperty("cre")));
                zzd((Throwable) null, fileInputStream);
                return zzoVar;
            } catch (NumberFormatException e2) {
                throw new zzp(e2);
            }
        } finally {
        }
    }

    private static void zzd(Context context, String str, zzo zzoVar) throws Throwable {
        try {
            if (Log.isLoggable("InstanceID", 3)) {
            }
            File fileZzj = zzj(context, str);
            fileZzj.createNewFile();
            Properties properties = new Properties();
            properties.setProperty("pub", zzoVar.zzq());
            properties.setProperty("pri", zzoVar.zzr());
            properties.setProperty("cre", String.valueOf(zzoVar.zzcc));
            FileOutputStream fileOutputStream = new FileOutputStream(fileZzj);
            try {
                properties.store(fileOutputStream, (String) null);
                zzd((Throwable) null, fileOutputStream);
            } finally {
            }
        } catch (IOException e2) {
            String strValueOf = String.valueOf(e2);
            new StringBuilder(String.valueOf(strValueOf).length() + 21).append("Failed to write key: ").append(strValueOf).toString();
        }
    }

    private static /* synthetic */ void zzd(Throwable th, FileInputStream fileInputStream) throws IOException {
        if (th == null) {
            fileInputStream.close();
            return;
        }
        try {
            fileInputStream.close();
        } catch (Throwable th2) {
            com.google.android.gms.internal.gcm.zzq.zzd(th, th2);
        }
    }

    private static /* synthetic */ void zzd(Throwable th, FileOutputStream fileOutputStream) throws IOException {
        if (th == null) {
            fileOutputStream.close();
            return;
        }
        try {
            fileOutputStream.close();
        } catch (Throwable th2) {
            com.google.android.gms.internal.gcm.zzq.zzd(th, th2);
        }
    }

    private static long zze(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(zzak.zzh(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.google.android.gms.iid.zzo] */
    private final void zze(Context context, String str, zzo zzoVar) throws Throwable {
        String strXd = ZO.xd("D\rXns3\u000f ~\u00186[\u0012>79-RQCK\u0001]h1[`~", (short) (ZN.Xd() ^ 7888), (short) (ZN.Xd() ^ 11326));
        short sXd = (short) (C1499aX.Xd() ^ (-24751));
        short sXd2 = (short) (C1499aX.Xd() ^ (-30169));
        int[] iArr = new int["H\u001c}\n\u0007.l\u001cp]\t#5MD$FF}\u001f\u0004l ".length()];
        QB qb = new QB("H\u001c}\n\u0007.l\u001cp]\t#5MD$FF}\u001f\u0004l ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        zzo cls = Class.forName(new String(iArr, 0, i2));
        Class[] clsArr = new Class[2];
        short sXd3 = (short) (C1607wl.Xd() ^ 19041);
        int[] iArr2 = new int["Z\u0002\tL\u007fa:/]Cf.YR\u0004\"".length()];
        QB qb2 = new QB("Z\u0002\tL\u007fa:/]Cf.YR\u0004\"");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {strXd, 0};
        Method method = cls.getMethod(EO.Od("\u000643o\u0006L\u007f{:(F\u0019EDK\"Xi\u0015Y", (short) (C1607wl.Xd() ^ 26206)), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            try {
                cls = zzoVar;
                if (cls.equals(zzd(sharedPreferences, str))) {
                    return;
                }
            } catch (zzp unused) {
            }
            if (Log.isLoggable(C1561oA.Qd("\u0010488$0$%\b\u0002", (short) (OY.Xd() ^ 3170)), 3)) {
                C1593ug.zd("$@8D:@:s@;PwMIzOE?QEE\u0002SVJLLZNXNQ`", (short) (C1607wl.Xd() ^ 22426), (short) (C1607wl.Xd() ^ 22576));
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(zzak.zzh(str, C1561oA.od("\u0001S~", (short) (OY.Xd() ^ 11102))), cls.zzq());
            editorEdit.putString(zzak.zzh(str, C1561oA.Kd("R\"T", (short) (FB.Xd() ^ 31118))), cls.zzr());
            editorEdit.putString(zzak.zzh(str, Wg.Zd("\u000b\u001e+", (short) (Od.Xd() ^ (-24809)), (short) (Od.Xd() ^ (-32497)))), String.valueOf(cls.zzcc));
            editorEdit.commit();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static KeyPair zzg(String str, String str2) throws Throwable {
        try {
            Class<?> cls = Class.forName(C1561oA.Xd(")7.=;62|EE;?\u0002\u00177J=\u000f\u000e", (short) (ZN.Xd() ^ 13761)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(Wg.vd("\f\u0004\u0016\u0002S\u0013\u0005\u0013\u0011Xz\u001d \u0018\u001a\u0014", (short) (OY.Xd() ^ 22741)));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str, 8};
            short sXd = (short) (OY.Xd() ^ 27228);
            short sXd2 = (short) (OY.Xd() ^ 22717);
            int[] iArr = new int["``]h\\\\".length()];
            QB qb = new QB("``]h\\\\");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                Class<?> cls2 = Class.forName(hg.Vd("P\\Q^ZSM\u0016\\ZNP\u0011$BSD\u0014\u0011", (short) (OY.Xd() ^ 14616), (short) (OY.Xd() ^ 16974)));
                Class<?>[] clsArr2 = new Class[2];
                clsArr2[0] = Class.forName(C1561oA.ud("\u0017\r!\u000bV\u0014\b\u0014\fQu\u0016\u0013\t\r\u0005", (short) (OY.Xd() ^ 27745)));
                clsArr2[1] = Integer.TYPE;
                Object[] objArr2 = {str2, 8};
                Method declaredMethod2 = cls2.getDeclaredMethod(C1561oA.yd("mmnyii", (short) (FB.Xd() ^ 27958)), clsArr2);
                try {
                    declaredMethod2.setAccessible(true);
                    byte[] bArr2 = (byte[]) declaredMethod2.invoke(null, objArr2);
                    try {
                        KeyFactory keyFactory = KeyFactory.getInstance(C1561oA.Yd("}\u007fn", (short) (C1499aX.Xd() ^ (-5616))));
                        return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(bArr)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArr2)));
                    } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
                        String strValueOf = String.valueOf(e2);
                        new StringBuilder(String.valueOf(strValueOf).length() + 19).append(Xg.qd("Bhq]igc lg|$xzvznn+", (short) (C1633zX.Xd() ^ (-7097)), (short) (C1633zX.Xd() ^ (-3468)))).append(strValueOf).toString();
                        Jg.Wd("L\u0019\u001c-Wtg\u0019\u001b\u001e", (short) (C1607wl.Xd() ^ 2452), (short) (C1607wl.Xd() ^ 1567));
                        throw new zzp(e2);
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (IllegalArgumentException e5) {
            throw new zzp(e5);
        }
    }

    static void zzg(Context context, String str) throws Throwable {
        File fileZzj = zzj(context, str);
        if (fileZzj.exists()) {
            fileZzj.delete();
        }
    }

    private final zzo zzh(Context context, String str) throws Throwable {
        Object[] objArr;
        Method method;
        try {
            zzo zzoVarZzi = zzi(context, str);
            if (zzoVarZzi != null) {
                zze(context, str, zzoVarZzi);
                return zzoVarZzi;
            }
            e = null;
        } catch (zzp e2) {
            e = e2;
        }
        String strXd = ZO.xd("h<Aw5R9{\u0013T\u001b\t=\"qJo\u0010fz*Pu\fhqN+", (short) (C1633zX.Xd() ^ (-24379)), (short) (C1633zX.Xd() ^ (-25536)));
        try {
            Class<?> cls = Class.forName(C1626yg.Ud("HU~A\u001b\f\no4ky\u0004\r7xxgd\u001f\u00061\u001dM", (short) (OY.Xd() ^ 32438), (short) (OY.Xd() ^ 11905)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(Ig.wd("\u0005X=\u0002KEX\u00139Qz{GFQ&", (short) (FB.Xd() ^ 30292)));
            clsArr[1] = Integer.TYPE;
            objArr = new Object[]{strXd, 0};
            method = cls.getMethod(EO.Od("|,\u001dd\u001aGl A\":\u0013BCP*gf\u00017", (short) (OY.Xd() ^ 11791)), clsArr);
        } catch (zzp e3) {
            e = e3;
        }
        try {
            method.setAccessible(true);
            zzo zzoVarZzd = zzd((SharedPreferences) method.invoke(context, objArr), str);
            if (zzoVarZzd != null) {
                zzd(context, str, zzoVarZzd);
                return zzoVarZzd;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private final zzo zzi(Context context, String str) throws Throwable {
        File fileZzj = zzj(context, str);
        if (!fileZzj.exists()) {
            return null;
        }
        try {
            return zzd(fileZzj);
        } catch (IOException e2) {
            if (Log.isLoggable("InstanceID", 3)) {
                String strValueOf = String.valueOf(e2);
                new StringBuilder(String.valueOf(strValueOf).length() + 40).append("Failed to read key from file, retrying: ").append(strValueOf).toString();
            }
            try {
                return zzd(fileZzj);
            } catch (IOException e3) {
                String strValueOf2 = String.valueOf(e3);
                new StringBuilder(String.valueOf(strValueOf2).length() + 45).append("IID file exists, but failed to read from it: ").append(strValueOf2).toString();
                throw new zzp(e3);
            }
        }
    }

    static void zzi(Context context) {
        for (File file : zzj(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private static File zzj(Context context) throws Throwable {
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(context);
        if (noBackupFilesDir != null && noBackupFilesDir.isDirectory()) {
            return noBackupFilesDir;
        }
        C1561oA.Qd("<`ddP\\PQ4.", (short) (FB.Xd() ^ 14361));
        C1593ug.zd("kmAadmxtKosm|Nt~-r~u\u0005\u0001:\t5{\u0010\u0002\r\u000fG<\u0013\u0012\t\u000f\tB\u0016\n\r\u001c\u0014\n\u001cJ\u0012\u0016\u001a\u0014#P\u0016\u001c&\u001a\u0019+'+3Z%+13%\"&", (short) (C1580rY.Xd() ^ (-27321)), (short) (C1580rY.Xd() ^ (-2050)));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("|\t}\u000b\u0007\u007fyBv\u0002\u007f\u0005t|\u0002:Nyw|l~y", (short) (ZN.Xd() ^ 16320))).getMethod(C1561oA.Kd("YXh;_c]l>dn", (short) (FB.Xd() ^ 29580)), new Class[0]);
        try {
            method.setAccessible(true);
            return (File) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static File zzj(Context context, String str) throws Throwable {
        String string;
        if (TextUtils.isEmpty(str)) {
            short sXd = (short) (FB.Xd() ^ 20343);
            short sXd2 = (short) (FB.Xd() ^ 17932);
            int[] iArr = new int["^aM{$\u0010\u007fdWF|\u0005\u001a\u0003rMH3$s~-]M8.\u0013\f|WA=".length()];
            QB qb = new QB("^aM{$\u0010\u007fdWF|\u0005\u001a\u0003rMH3$s~-]M8.\u0013\f|WA=");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            string = new String(iArr, 0, i2);
        } else {
            short sXd3 = (short) (C1607wl.Xd() ^ 31396);
            int[] iArr2 = new int["((\u001b\u0003\u000f".length()];
            QB qb2 = new QB("((\u001b\u0003\u000f");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
                i3++;
            }
            try {
                byte[] bytes = str.getBytes(new String(iArr2, 0, i3));
                Class<?> cls = Class.forName(Wg.vd("2>3@D=7\u007f><02z\u000e,=F\u0016\u0013", (short) (FB.Xd() ^ 13255)));
                Class<?>[] clsArr = {byte[].class, Integer.TYPE};
                Object[] objArr = {bytes, 11};
                short sXd4 = (short) (FB.Xd() ^ 8497);
                short sXd5 = (short) (FB.Xd() ^ 10962);
                int[] iArr3 = new int["4<0;//\u001d7\u001a:7-1)".length()];
                QB qb3 = new QB("4<0;//\u001d7\u001a:7-1)");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
                    i4++;
                }
                Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    String str2 = (String) declaredMethod.invoke(null, objArr);
                    StringBuilder sbAppend = new StringBuilder(String.valueOf(str2).length() + 33).append(hg.Vd("\u0015 \u001d\\\u0015\u001c\u001b\u0012\u0016\u000eUo\u0014\u0018\u0018\u0004\u0010\u0004\u0005g\u0002{", (short) (C1499aX.Xd() ^ (-9498)), (short) (C1499aX.Xd() ^ (-20548)))).append(str2);
                    short sXd6 = (short) (ZN.Xd() ^ 22611);
                    int[] iArr4 = new int["<}~zznz{ojw".length()];
                    QB qb4 = new QB("<}~zznz{ojw");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(sXd6 + i5 + xuXd4.CK(iKK4));
                        i5++;
                    }
                    string = sbAppend.append(new String(iArr4, 0, i5)).toString();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (UnsupportedEncodingException e3) {
                throw new AssertionError(e3);
            }
        }
        return new File(zzj(context), string);
    }

    final zzo zze(Context context, String str) throws Throwable {
        zzo zzoVarZzh = zzh(context, str);
        return zzoVarZzh != null ? zzoVarZzh : zzf(context, str);
    }

    final zzo zzf(Context context, String str) throws Throwable {
        zzo zzoVar = new zzo(zzd.zzl(), System.currentTimeMillis());
        try {
            zzo zzoVarZzh = zzh(context, str);
            if (zzoVarZzh != null) {
                if (Log.isLoggable("InstanceID", 3)) {
                }
                return zzoVarZzh;
            }
        } catch (zzp unused) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
        }
        zzd(context, str, zzoVar);
        zze(context, str, zzoVar);
        return zzoVar;
    }
}
