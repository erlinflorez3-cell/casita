package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
final class zzj implements zzl {
    final /* synthetic */ Set zza;
    final /* synthetic */ zzt zzb;
    final /* synthetic */ ZipFile zzc;

    zzj(zzn zznVar, Set set, zzt zztVar, ZipFile zipFile) {
        this.zza = set;
        this.zzb = zztVar;
        this.zzc = zipFile;
    }

    @Override // com.google.android.play.core.splitcompat.zzl
    public final void zza(zzm zzmVar, File file, boolean z2) throws Throwable {
        this.zza.add(file);
        if (z2) {
            return;
        }
        String strZzb = this.zzb.zzb();
        String str = zzmVar.zza;
        String absolutePath = this.zzb.zza().getAbsolutePath();
        ZipEntry zipEntry = zzmVar.zzb;
        Class<?> cls = Class.forName(Xg.qd("E=S?\rUUKO\u0012_OW\u0016CS[1[bai", (short) (Od.Xd() ^ (-12810)), (short) (Od.Xd() ^ (-4772))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-23766));
        short sXd2 = (short) (C1580rY.Xd() ^ (-28797));
        int[] iArr = new int["Eh\u0006\r^\u0010\u001a".length()];
        QB qb = new QB("Eh\u0006\r^\u0010\u001a");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            Object[] objArr2 = {strZzb, str, absolutePath, (String) method.invoke(zipEntry, objArr), file.getAbsolutePath()};
            short sXd3 = (short) (C1580rY.Xd() ^ (-858));
            short sXd4 = (short) (C1580rY.Xd() ^ (-2464));
            int[] iArr2 = new int["DlD\u0013N@B\u0019\rk; 2c(\tJp}\u001c\u001a0KJpYXP\u00053YnZ#\u0003]b%\u0015\u0018Sx\"qH\u001f@+E\u0004\u00048\u001b\",U[\u0018\u00197`fkh\u000b&\u0016\u0012swpI\\.\u0003i=\u0014J\u000b\u001c,\rg V00L&\u0015&$'7\u0007#\u0015;fYfS\fH\u0011\u00070R<{".length()];
            QB qb2 = new QB("DlD\u0013N@B\u0019\rk; 2c(\tJp}\u001c\u001a0KJpYXP\u00053YnZ#\u0003]b%\u0015\u0018Sx\"qH\u001f@+E\u0004\u00048\u001b\",U[\u0018\u00197`fkh\u000b&\u0016\u0012swpI\\.\u0003i=\u0014J\u000b\u001c,\rg V00L&\u0015&$'7\u0007#\u0015;fYfS\fH\u0011\u00070R<{");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                i3++;
            }
            String.format(new String(iArr2, 0, i3), objArr2);
            C1626yg.Ud("\t\u00143WtK%.9KS", (short) (C1580rY.Xd() ^ (-20741)), (short) (C1580rY.Xd() ^ (-17165)));
            ZipFile zipFile = this.zzc;
            ZipEntry zipEntry2 = zzmVar.zzb;
            byte[] bArr = new byte[4096];
            if (file.exists()) {
                file.delete();
            }
            Object[] objArr3 = {zipEntry2};
            Method method2 = Class.forName(Ig.wd("u'(pb}\u0017\u000b>$r\u007f7zG\u0001.\u0012mT\u000e", (short) (FB.Xd() ^ 10058))).getMethod(C1561oA.Qd("VSa5YZ^\\:ZWIDO", (short) (FB.Xd() ^ 28992)), Class.forName(EO.Od("p\u000fTah\ra9\u000bJ\u0013&wEK~B\u0017zK\b5", (short) (ZN.Xd() ^ 6336))));
            try {
                method2.setAccessible(true);
                InputStream inputStream = (InputStream) method2.invoke(zipFile, objArr3);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        zze.zzm(file);
                        while (true) {
                            int i4 = inputStream.read(bArr);
                            if (i4 <= 0) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, i4);
                            }
                        }
                        fileOutputStream.close();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                    }
                    throw th;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
