package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.imageutils.JfifUtil;
import com.google.android.gms.common.util.IOUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqa {
    private final Context zza;
    private final ExecutorService zzb;
    private final zzpw zzc;

    public zzqa(Context context) {
        ExecutorService executorServiceZza = zzgb.zza().zza(2);
        zzpw zzpwVar = new zzpw(context);
        this.zza = context;
        this.zzb = executorServiceZza;
        this.zzc = zzpwVar;
    }

    private static final byte[] zzh(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                IOUtils.copyStream(inputStream, byteArrayOutputStream);
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    zzho.zze("Error closing stream for reading resource from disk");
                    return null;
                }
            } catch (IOException unused2) {
                zzho.zze("Failed to read the resource from disk");
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                    zzho.zze("Error closing stream for reading resource from disk");
                    return null;
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                inputStream.close();
                throw th;
            } catch (IOException unused4) {
                zzho.zze("Error closing stream for reading resource from disk");
                return null;
            }
        }
    }

    private static final String zzi(String str) {
        return "resource_".concat(String.valueOf(str));
    }

    public final long zza(String str) {
        File fileZzb = zzb(str);
        if (fileZzb.exists()) {
            return fileZzb.lastModified();
        }
        return 0L;
    }

    final File zzb(String str) {
        Context context = this.zza;
        short sXd = (short) (C1633zX.Xd() ^ (-5866));
        int[] iArr = new int["#,)\",&\u001d3%,/$6*-,>".length()];
        QB qb = new QB("#,)\",&\u001d3%,/$6*-,>");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        Class<?> cls = Class.forName(Qg.kd("\u0015!\u0016#\u001f\u0018\u0012Z\u000f\u001a\u0018\u001d\r\u0015\u001aRf\u0012\u0010\u0015\u0005\u0017\u0012", (short) (FB.Xd() ^ 24354), (short) (FB.Xd() ^ 13789)));
        Class<?>[] clsArr = {Class.forName(hg.Vd("qg{e1nbnf,Ppmcg_", (short) (C1580rY.Xd() ^ (-32411)), (short) (C1580rY.Xd() ^ (-3315)))), Integer.TYPE};
        Object[] objArr = {str2, 0};
        short sXd2 = (short) (OY.Xd() ^ JfifUtil.MARKER_SOI);
        int[] iArr2 = new int["'$2\u0001%-".length()];
        QB qb2 = new QB("'$2\u0001%-");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            return new File((File) method.invoke(context, objArr), zzi(str));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void zzc(String str, String str2, zzpk zzpkVar) {
        this.zzb.execute(new zzpy(this, str, str2, zzpkVar));
    }

    final void zzd(String str, String str2, zzpk zzpkVar) {
        zzho.zzd(C1561oA.yd("s\u0014\u0004\u0014\u0011\u0005\r\u0005H\u001c\u001aI\u0011\u0013\b\n0p2uqqo\u0003\u0005\f:z\b\u0007{\n ekma\u001bdowt*Mmvq3", (short) (C1607wl.Xd() ^ 1711)));
        if (str2 == null) {
            zzho.zzd(C1561oA.Yd("!CEAVNW\u0004FYZM]\nQUYS\u000fYd\u0012aci\u0016jh^]dbfcc.!Prx%vywloppv|v0\t{\b|5\u000b\u007f}9\u0007\u000b}\u0002\b\u000e\b", (short) (ZN.Xd() ^ 21635)));
            zzpkVar.zzb(0, 2);
            return;
        }
        try {
            Context context = this.zzc.zza;
            short sXd = (short) (C1633zX.Xd() ^ (-3705));
            short sXd2 = (short) (C1633zX.Xd() ^ (-30723));
            int[] iArr = new int["\u0015#\u001a)'\"\u001eh\u001f,,3%/6p\u000744;-A>".length()];
            QB qb = new QB("\u0015#\u001a)'\"\u001eh\u001f,,3%/6p\u000744;-A>");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = new Object[0];
            Method method = cls.getMethod(Jg.Wd("3Fw\\1GWz ", (short) (OY.Xd() ^ 10862), (short) (OY.Xd() ^ 5260)), new Class[0]);
            try {
                method.setAccessible(true);
                InputStream inputStreamOpen = ((AssetManager) method.invoke(context, objArr)).open(str2);
                if (inputStreamOpen != null) {
                    zzpkVar.zzc(zzh(inputStreamOpen));
                } else {
                    zzpkVar.zzb(0, 2);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException unused) {
            zzho.zza(ZO.xd("(\u0012)2_if4\u0007]9oJKGM\u0003B$|sR4\u001dyE~CYZ", (short) (Od.Xd() ^ (-7773)), (short) (Od.Xd() ^ (-23317))) + str + C1626yg.Ud("*\u0017\tyO;[.TPy\u0012", (short) (C1633zX.Xd() ^ (-13)), (short) (C1633zX.Xd() ^ (-56))) + str2);
            zzpkVar.zzb(0, 2);
        }
    }

    public final void zze(String str, zzpk zzpkVar) {
        this.zzb.execute(new zzpx(this, str, zzpkVar));
    }

    final void zzf(String str, zzpk zzpkVar) {
        zzho.zzd("Starting to load a saved resource file from Disk.");
        try {
            zzpkVar.zzc(zzh(new FileInputStream(zzb(str))));
        } catch (FileNotFoundException unused) {
            zzho.zza("Saved resource not found: ".concat(zzi(str)));
            zzpkVar.zzb(0, 1);
        }
    }

    public final void zzg(String str, byte[] bArr) {
        this.zzb.execute(new zzpz(this, str, bArr));
    }
}
