package com.google.android.gms.internal.mlkit_common;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import androidx.core.content.ContextCompat;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
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
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzi {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] zzc;
    private static final String[] zzd;

    static {
        String[] strArr = new String[2];
        strArr[0] = "media";
        strArr[1] = (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : "";
        zzc = strArr;
        zzd = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    public static AssetFileDescriptor zza(Context context, Uri uri, String str) throws Throwable {
        zzh zzhVar = zzh.zza;
        short sXd = (short) (OY.Xd() ^ 21518);
        int[] iArr = new int["ESJYWRN\u0019O\\\\cU_f!7ddk]qn".length()];
        QB qb = new QB("ESJYWRN\u0019O\\\\cU_f!7ddk]qn");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Xg.qd("~}\u000e]\u000b\u000b\u0012\u0004\u000e\u0015s\b\u0017\u0014\u0012\u001d\r\u001b", (short) (C1499aX.Xd() ^ (-21317)), (short) (C1499aX.Xd() ^ (-13294))), new Class[0]);
        try {
            method.setAccessible(true);
            ContentResolver contentResolver = (ContentResolver) method.invoke(context, objArr);
            Uri uriZzc = zzc(uri);
            String scheme = uriZzc.getScheme();
            boolean zEquals = Jg.Wd("[\u0006z,(E?(o\u0002\u0013.3SEj", (short) (C1607wl.Xd() ^ 21293), (short) (C1607wl.Xd() ^ 26802)).equals(scheme);
            short sXd2 = (short) (C1499aX.Xd() ^ (-815));
            short sXd3 = (short) (C1499aX.Xd() ^ (-22422));
            int[] iArr2 = new int["y".length()];
            QB qb2 = new QB("y");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                i3++;
            }
            String str2 = new String(iArr2, 0, i3);
            if (zEquals) {
                return contentResolver.openAssetFileDescriptor(uriZzc, str2);
            }
            if (C1626yg.Ud("\u0006Z&n\u007f>1", (short) (FB.Xd() ^ 21185), (short) (FB.Xd() ^ 13204)).equals(scheme)) {
                if (!zzj(context, uriZzc, 1, zzhVar)) {
                    throw new FileNotFoundException(Ig.wd("\u0016\u000f,}Y0mL~)^B{r/;kyj\nD\u0005m", (short) (C1633zX.Xd() ^ (-11532))));
                }
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriZzc, str2);
                zzd(assetFileDescriptorOpenAssetFileDescriptor);
                return assetFileDescriptorOpenAssetFileDescriptor;
            }
            if (!EO.Od("c\u0014zZ", (short) (OY.Xd() ^ 17487)).equals(scheme)) {
                short sXd4 = (short) (OY.Xd() ^ 3943);
                short sXd5 = (short) (OY.Xd() ^ 16069);
                int[] iArr3 = new int["\u000e(.1-..25''c8)/-6/".length()];
                QB qb3 = new QB("\u000e(.1-..25''c8)/-6/");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) - sXd5);
                    i4++;
                }
                throw new FileNotFoundException(new String(iArr3, 0, i4));
            }
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uriZzc, str2);
            zzd(assetFileDescriptorOpenAssetFileDescriptor2);
            try {
                zzi(context, assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor(), uriZzc, zzhVar);
                return assetFileDescriptorOpenAssetFileDescriptor2;
            } catch (FileNotFoundException e2) {
                zzg(assetFileDescriptorOpenAssetFileDescriptor2, e2);
                throw e2;
            } catch (IOException e3) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException(C1561oA.Qd("{\u0006\u0010\f\u0006\u0002\u0014\b\r\u000b;\u0001z\u0002\u0004{yB", (short) (Od.Xd() ^ (-17771))));
                fileNotFoundException.initCause(e3);
                zzg(assetFileDescriptorOpenAssetFileDescriptor2, fileNotFoundException);
                throw fileNotFoundException;
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public static InputStream zzb(Context context, Uri uri, zzh zzhVar) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.od("VbWd`YS\u001cP[Y^NV[\u0014(SQVFXS", (short) (C1580rY.Xd() ^ (-26837))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 13397);
        int[] iArr = new int["VUe5bbi[elK_nkitdr".length()];
        QB qb = new QB("VUe5bbi[elK_nkitdr");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            ContentResolver contentResolver = (ContentResolver) method.invoke(context, objArr);
            Uri uriZzc = zzc(uri);
            String scheme = uriZzc.getScheme();
            if (Wg.Zd("\"@CbdowRLPkx\u0004\u0012\u0010\u001f", (short) (OY.Xd() ^ 28962), (short) (OY.Xd() ^ 489)).equals(scheme)) {
                return contentResolver.openInputStream(uriZzc);
            }
            if (C1561oA.Xd("\u0005\u0012\u0012\u0019\u000b\u0015\u001c", (short) (C1580rY.Xd() ^ (-23698))).equals(scheme)) {
                if (zzj(context, uriZzc, 1, zzhVar)) {
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uriZzc);
                    zzd(inputStreamOpenInputStream);
                    return inputStreamOpenInputStream;
                }
                short sXd2 = (short) (C1633zX.Xd() ^ (-421));
                int[] iArr2 = new int["f\u0004\u0010G\u0014>\r\r\u0001\t9{\u0007\u0005\ny\"'Q&\"\u0018[".length()];
                QB qb2 = new QB("f\u0004\u0010G\u0014>\r\r\u0001\t9{\u0007\u0005\ny\"'Q&\"\u0018[");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                    i3++;
                }
                throw new FileNotFoundException(new String(iArr2, 0, i3));
            }
            short sXd3 = (short) (C1580rY.Xd() ^ (-31444));
            short sXd4 = (short) (C1580rY.Xd() ^ (-4884));
            int[] iArr3 = new int["UWYQ".length()];
            QB qb3 = new QB("UWYQ");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(((sXd3 + i4) + xuXd3.CK(iKK3)) - sXd4);
                i4++;
            }
            if (!new String(iArr3, 0, i4).equals(scheme)) {
                throw new FileNotFoundException(C1561oA.Yd("s\u000e\u0014\u0017\u0013\u0014\u0014\u0018\u001b\r\rI\u001e\u000f\u0015\u0013\u001c\u0015", (short) (ZN.Xd() ^ 5958)));
            }
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(uriZzc.getPath()).getCanonicalFile()), hg.Vd("a", (short) (Od.Xd() ^ (-19722)), (short) (Od.Xd() ^ (-11968))));
                try {
                    zzi(context, parcelFileDescriptorOpenFileDescriptor, uriZzc, zzhVar);
                    return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
                } catch (FileNotFoundException e2) {
                    zzh(parcelFileDescriptorOpenFileDescriptor, e2);
                    throw e2;
                } catch (IOException e3) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException(C1561oA.ud(".8B>84F:?=m3-46.,t", (short) (ZN.Xd() ^ 15342)));
                    fileNotFoundException.initCause(e3);
                    zzh(parcelFileDescriptorOpenFileDescriptor, fileNotFoundException);
                    throw fileNotFoundException;
                }
            } catch (IOException e4) {
                FileNotFoundException fileNotFoundException2 = new FileNotFoundException(C1561oA.yd("7V`b^ZQPhft\\lbee$kcllfb-", (short) (C1607wl.Xd() ^ 26076)));
                fileNotFoundException2.initCause(e4);
                throw fileNotFoundException2;
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private static Uri zzc(Uri uri) {
        return Build.VERSION.SDK_INT < 30 ? Uri.parse(uri.toString()) : uri;
    }

    private static Object zzd(Object obj) throws FileNotFoundException {
        if (obj != null) {
            return obj;
        }
        throw new FileNotFoundException("Content resolver returned null value.");
    }

    private static String zze(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith(RemoteSettings.FORWARD_SLASH_STRING) ? String.valueOf(canonicalPath).concat(RemoteSettings.FORWARD_SLASH_STRING) : canonicalPath;
    }

    private static void zzf(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException {
        try {
            StructStat structStatFstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat structStatLstat = Os.lstat(str);
                if (OsConstants.S_ISLNK(structStatLstat.st_mode)) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
                if (structStatFstat.st_dev != structStatLstat.st_dev || structStatFstat.st_ino != structStatLstat.st_ino) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
            } catch (ErrnoException e2) {
                throw new IOException(e2);
            }
        } catch (ErrnoException e3) {
            throw new IOException(e3);
        }
    }

    private static void zzg(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e2) {
            fileNotFoundException.addSuppressed(e2);
        }
    }

    private static void zzh(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e2) {
            fileNotFoundException.addSuppressed(e2);
        }
    }

    private static void zzi(final Context context, ParcelFileDescriptor parcelFileDescriptor, Uri uri, zzh zzhVar) throws IOException {
        File dataDir;
        String canonicalPath = new File(uri.getPath()).getCanonicalPath();
        zzf(parcelFileDescriptor, canonicalPath);
        if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
            zzh.zza(zzhVar);
            File dataDir2 = ContextCompat.getDataDir(context);
            boolean z2 = true;
            if (dataDir2 == null ? !canonicalPath.startsWith(zze(Environment.getDataDirectory())) : !canonicalPath.startsWith(zze(dataDir2))) {
                Context contextCreateDeviceProtectedStorageContext = ContextCompat.createDeviceProtectedStorageContext(context);
                if (contextCreateDeviceProtectedStorageContext == null || (dataDir = ContextCompat.getDataDir(contextCreateDeviceProtectedStorageContext)) == null || !canonicalPath.startsWith(zze(dataDir))) {
                    File[] fileArrZzk = zzk(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i2 = zzi.zza;
                            return ContextCompat.getExternalFilesDirs(context, null);
                        }
                    });
                    int length = fileArrZzk.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            File file = fileArrZzk[i2];
                            if (file != null && canonicalPath.startsWith(zze(file))) {
                                break;
                            } else {
                                i2++;
                            }
                        } else {
                            File[] fileArrZzk2 = zzk(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzc
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    int i3 = zzi.zza;
                                    return ContextCompat.getExternalCacheDirs(context);
                                }
                            });
                            int length2 = fileArrZzk2.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length2) {
                                    File file2 = fileArrZzk2[i3];
                                    if (file2 != null && canonicalPath.startsWith(zze(file2))) {
                                        break;
                                    } else {
                                        i3++;
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (z2 == zzhVar.zzb) {
                return;
            }
        }
        throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
    }

    private static boolean zzj(Context context, Uri uri, int i2, zzh zzhVar) throws Throwable {
        String authority = uri.getAuthority();
        short sXd = (short) (OY.Xd() ^ 18833);
        short sXd2 = (short) (OY.Xd() ^ 18599);
        int[] iArr = new int["\u000e\u001c\u0013\" \u001b\u0017a\u0018%%,\u001e(/i\u007f--4&:7".length()];
        QB qb = new QB("\u000e\u001c\u0013\" \u001b\u0017a\u0018%%,\u001e(/i\u007f--4&:7");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Jg.Wd("\u001af9T\u0019Y%Z\u0014c\u000ea\"T\u001dZ\u001b", (short) (OY.Xd() ^ 5265), (short) (OY.Xd() ^ 4583)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            short sXd3 = (short) (C1633zX.Xd() ^ (-27008));
            short sXd4 = (short) (C1633zX.Xd() ^ (-13867));
            int[] iArr2 = new int["Gg/\u001fA).A\u0005UQ\u0001\u0001>!+#\u0001d\u0013\u001f\u0005]Y\u001e8>hX8\u0018mc".length()];
            QB qb2 = new QB("Gg/\u001fA).A\u0005UQ\u0001\u0001>!+#\u0001d\u0013\u001f\u0005]Y\u001e8>hX8\u0018mc");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd4) + sXd3)));
                i4++;
            }
            Object[] objArr2 = {authority, 0};
            Method method2 = Class.forName(new String(iArr2, 0, i4)).getMethod(Ig.wd("Vq2MJ(j(\u001a8<S*\u0002IQ\u0006\u001b5(n7", (short) (C1633zX.Xd() ^ (-9192))), Class.forName(C1626yg.Ud("\rx\u0014`\n4tU\\#6\"\u0019Nhd", (short) (C1607wl.Xd() ^ 31042), (short) (C1607wl.Xd() ^ 10337))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                ProviderInfo providerInfo = (ProviderInfo) method2.invoke(packageManager, objArr2);
                if (providerInfo == null) {
                    int iLastIndexOf = authority.lastIndexOf(64);
                    if (iLastIndexOf >= 0) {
                        authority = authority.substring(iLastIndexOf + 1);
                        Object[] objArr3 = new Object[0];
                        Method method3 = Class.forName(EO.Od("w4\\\u000b\u0018nEO_\u007f|!`s\u0002Y\u0013a\u00197b2L", (short) (OY.Xd() ^ 2329))).getMethod(C1561oA.Qd("EBP+;<C8=:!4@274@", (short) (C1580rY.Xd() ^ (-29325))), new Class[0]);
                        try {
                            method3.setAccessible(true);
                            PackageManager packageManager2 = (PackageManager) method3.invoke(context, objArr3);
                            Object[] objArr4 = {authority, 0};
                            Method method4 = Class.forName(C1593ug.zd("m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI\r\u000bLo\u0002\u0005\u000e\u0005\f\u000bs\t\u0017\u000b\u0012\u0011\u001f", (short) (C1633zX.Xd() ^ (-15529)), (short) (C1633zX.Xd() ^ (-14520)))).getMethod(C1561oA.Kd("k_nkitdCppwiszWzx\u0001tpr\u0001", (short) (OY.Xd() ^ 11290)), Class.forName(C1561oA.od("\\RfP\u001cYMYQ\u0017;[XNRJ", (short) (C1580rY.Xd() ^ (-17659)))), Integer.TYPE);
                            try {
                                method4.setAccessible(true);
                                providerInfo = (ProviderInfo) method4.invoke(packageManager2, objArr4);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    if (providerInfo == null) {
                        return !zzhVar.zzb;
                    }
                }
                if (zzh.zzc(zzhVar, context, new zzj(uri, providerInfo, authority)) - 1 == 1) {
                    return false;
                }
                Class<?> cls = Class.forName(Wg.Zd("$uC(xJ\u001eGH+\u0002W%\u0006J[<9\u0010m9,\u007f", (short) (FB.Xd() ^ 5492), (short) (FB.Xd() ^ 12378)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr5 = new Object[0];
                short sXd5 = (short) (Od.Xd() ^ (-23442));
                int[] iArr3 = new int["\u0004\u0003\u0013o\u0002\u0005\u000e\u0005\f\u000bt\t\u0016\u000f".length()];
                QB qb3 = new QB("\u0004\u0003\u0013o\u0002\u0005\u000e\u0005\f\u000bt\t\u0016\u000f");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd5 + i5));
                    i5++;
                }
                Method method5 = cls.getMethod(new String(iArr3, 0, i5), clsArr);
                try {
                    method5.setAccessible(true);
                    if (((String) method5.invoke(context, objArr5)).equals(providerInfo.packageName)) {
                        return zzhVar.zzb;
                    }
                    if (zzhVar.zzb) {
                        return false;
                    }
                    int iMyPid = Process.myPid();
                    int iMyUid = Process.myUid();
                    Class<?> cls2 = Class.forName(Wg.vd("w\u0004x\u0006\n\u0003|Eq|z\u007fw\u007f\u0005=i\u0015\u0013\u0018\u0010\"\u001d", (short) (OY.Xd() ^ IptcDirectory.TAG_TIME_CREATED)));
                    Class<?>[] clsArr2 = {Class.forName(Qg.kd("\u001c(\u001d*&\u001f\u0019a!\u0017%]\u0004 \u0016", (short) (C1499aX.Xd() ^ (-9215)), (short) (C1499aX.Xd() ^ (-22561)))), Integer.TYPE, Integer.TYPE, Integer.TYPE};
                    Object[] objArr6 = {uri, Integer.valueOf(iMyPid), Integer.valueOf(iMyUid), 1};
                    Method method6 = cls2.getMethod(hg.Vd("9=96=&B8\u001e2>83<;053", (short) (C1633zX.Xd() ^ (-1589)), (short) (C1633zX.Xd() ^ (-4929))), clsArr2);
                    try {
                        method6.setAccessible(true);
                        if (((Integer) method6.invoke(context, objArr6)).intValue() != 0 && providerInfo.exported) {
                            String[] strArr = zzc;
                            int length = strArr.length;
                            for (int i6 = 0; i6 < 2; i6++) {
                                if (strArr[i6].equals(authority)) {
                                    return true;
                                }
                            }
                            String[] strArr2 = zzd;
                            int length2 = strArr2.length;
                            for (int i7 = 0; i7 < 3; i7++) {
                                if (strArr2[i7].equals(authority)) {
                                    return true;
                                }
                            }
                            String[] strArr3 = zzb;
                            for (int i8 = 0; i8 < 6; i8++) {
                                String str = strArr3[i8];
                                if (str.charAt(str.length() - 1) == '.') {
                                    if (providerInfo.packageName.startsWith(str)) {
                                        return false;
                                    }
                                } else if (providerInfo.packageName.equals(str)) {
                                    return false;
                                }
                            }
                        }
                        return true;
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }

    private static File[] zzk(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
