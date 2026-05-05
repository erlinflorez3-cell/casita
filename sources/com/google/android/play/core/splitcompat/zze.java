package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public final class zze {
    private final long zza;
    private final Context zzb;
    private File zzc;

    public zze(Context context) throws Throwable {
        this.zzb = context;
        short sXd = (short) (Od.Xd() ^ (-2699));
        short sXd2 = (short) (Od.Xd() ^ (-29159));
        int[] iArr = new int["FTKZXSO\u001aP]]dV`g\"8eel^ro".length()];
        QB qb = new QB("FTKZXSO\u001aP]]dV`g\"8eel^ro");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("1.<\u0017'(/$)&\r ,\u001e# ,", (short) (ZN.Xd() ^ 6818)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Kd("4B9HFA=\b>KKRDNU\u0010&SSZL`]", (short) (ZN.Xd() ^ 27150))).getMethod(Wg.Zd("z^\u001a\u00038G{\u0017)\u0015\u0002AZv", (short) (C1607wl.Xd() ^ 13818), (short) (C1607wl.Xd() ^ 12422)), new Class[0]);
            try {
                method2.setAccessible(true);
                String str = (String) method2.invoke(context, objArr2);
                Class<?> cls = Class.forName(C1561oA.Xd("We\\kid`+annugqx3vt6Yknwnut]r\u0001t{z\t", (short) (C1580rY.Xd() ^ (-28385))));
                Class<?>[] clsArr = {Class.forName(Wg.vd("|t\u0007rD\u0004u\u0004q9[}\u0001xzt", (short) (C1580rY.Xd() ^ (-26524)))), Integer.TYPE};
                Object[] objArr3 = {str, 0};
                short sXd3 = (short) (FB.Xd() ^ 31409);
                short sXd4 = (short) (FB.Xd() ^ 29289);
                int[] iArr2 = new int["OLZ5EFMBGD'KBJ".length()];
                QB qb2 = new QB("OLZ5EFMBGD'KBJ");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((sXd3 + i3) + xuXd2.CK(iKK2)) - sXd4);
                    i3++;
                }
                try {
                    cls.getMethod(new String(iArr2, 0, i3), clsArr).setAccessible(true);
                    this.zza = ((PackageInfo) r1.invoke(packageManager, objArr3)).versionCode;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public static void zzl(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                zzl(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    public static void zzm(File file) {
        file.setWritable(false, true);
        file.setWritable(false, false);
    }

    public static boolean zzp(File file) {
        return !file.canWrite();
    }

    private static File zzq(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    private final File zzr() throws IOException {
        File file = new File(zzw(), "native-libraries");
        zzu(file);
        return file;
    }

    private final File zzs(String str) throws IOException {
        File fileZzq = zzq(zzr(), str);
        zzu(fileZzq);
        return fileZzq;
    }

    private final File zzt() throws IOException {
        File file = new File(zzw(), "verified-splits");
        zzu(file);
        return file;
    }

    private static File zzu(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
        file.mkdirs();
        if (file.isDirectory()) {
            return file;
        }
        throw new IOException("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
    }

    private final File zzv() throws Throwable {
        if (this.zzc == null) {
            Context context = this.zzb;
            if (context == null) {
                throw new IllegalStateException(C1561oA.yd("Vccj\\pm\u001ahqpr\u001fbf\"qss3u}uv+\u0001|.\u007f\u007f\u0002\b\u007fu\n{7\u0007\u000f\u0007\b<\u0004\b\f\u0006\u0015f\r\u0017", (short) (OY.Xd() ^ 4520)));
            }
            short sXd = (short) (OY.Xd() ^ 8290);
            short sXd2 = (short) (OY.Xd() ^ 13834);
            int[] iArr = new int["%1&3/(\"j\u001f*(-\u001d%*bv\" %\u0015'\"".length()];
            QB qb = new QB("%1&3/(\"j\u001f*(-\u001d%*bv\" %\u0015'\"");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.ud("\u001e\u001b)y\u001c\u001e\u0016#r\u0017\u001f", (short) (Od.Xd() ^ (-6219))), new Class[0]);
            try {
                method.setAccessible(true);
                this.zzc = (File) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        File file = new File(this.zzc, C1561oA.Yd("20-+7'437)=", (short) (ZN.Xd() ^ 6528)));
        zzu(file);
        return file;
    }

    private final File zzw() throws IOException {
        File file = new File(zzv(), Long.toString(this.zza));
        zzu(file);
        return file;
    }

    private static String zzx(String str) {
        return String.valueOf(str).concat(".apk");
    }

    public final File zza(String str) throws IOException {
        File file = new File(zzw(), "dex");
        zzu(file);
        File fileZzq = zzq(file, str);
        zzu(fileZzq);
        return fileZzq;
    }

    public final File zzb() throws IOException {
        File file = new File(zzw(), "unverified-splits");
        zzu(file);
        return file;
    }

    public final File zzc(String str, String str2) throws IOException {
        return zzq(zzs(str), str2);
    }

    public final File zzd() throws IOException {
        return new File(zzw(), "lock.tmp");
    }

    public final File zze(String str) throws IOException {
        return zzq(zzb(), zzx(str));
    }

    public final File zzf(File file) throws IOException {
        return zzq(zzt(), file.getName());
    }

    public final File zzg(String str) throws IOException {
        return zzq(zzt(), zzx(str));
    }

    final List zzh() throws IOException {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = zzr().listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    final Set zzi(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = zzs(str).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    final Set zzj() throws IOException {
        File fileZzt = zzt();
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = fileZzt.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && file.getName().endsWith(".apk") && zzp(file)) {
                    hashSet.add(new zzb(file, file.getName().substring(0, r1.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final void zzk() throws Throwable {
        File fileZzv = zzv();
        String[] list = fileZzv.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.zza))) {
                    File file = new File(fileZzv, str);
                    String str2 = "FileStorage: removing directory for different version code (directory = " + file.toString() + ", current version code = " + this.zza + ")";
                    zzl(file);
                }
            }
        }
    }

    final void zzn(String str) throws IOException {
        zzl(zzs(str));
    }

    final void zzo(File file) throws IOException {
        if (!file.getParentFile().getParentFile().equals(zzr())) {
            throw new IllegalStateException("File to remove is not a native library");
        }
        zzl(file);
    }
}
