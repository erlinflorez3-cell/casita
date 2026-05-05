package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.core.util.AtomicFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzawr {
    private static final Object zza = new Object();
    private final Context zzb;

    public zzawr(Context context) {
        this.zzb = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [byte[]] */
    public final zzbhx zza(String str, String str2, String str3, int i2, zzawy zzawyVar, long j2) {
        File fileZzb;
        String fully = "Error reading acceleration allowlist cache file: ";
        synchronized (zza) {
            try {
                fileZzb = zzb(str, "com.google.perception", 2);
            } catch (IOException e2) {
                fileZzb = null;
            }
            try {
                fully = new AtomicFile(fileZzb).readFully();
                if (fully == 0) {
                    return null;
                }
                try {
                    zzawx zzawxVarZzd = zzawx.zzd(fully, zzbdv.zza());
                    if (zzawxVarZzd.zzk() && System.currentTimeMillis() / 1000 <= zzawxVarZzd.zze().zzc() + j2) {
                        if (!zzawxVarZzd.zzg().equals(str2)) {
                            return null;
                        }
                        return zzawxVarZzd.zzf();
                    }
                    return null;
                } catch (zzbew e3) {
                    String str4 = "Invalid cached data in file: " + fileZzb.toString();
                    zzawyVar.zzc(zzags.FILE_READ_RETURNED_MALFORMED_DATA);
                    return null;
                }
            } catch (IOException e4) {
                if (fileZzb == null) {
                    zzawyVar.zzc(zzags.FILE_READ_FAILED);
                } else if (fileZzb.exists()) {
                    String str5 = fully + fileZzb.toString();
                    zzawyVar.zzc(zzags.FILE_READ_FAILED);
                } else {
                    String str6 = "No acceleration allowlist cache file at: " + fileZzb.toString();
                }
                return null;
            }
        }
    }

    final File zzb(String str, String str2, int i2) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-6240));
        int[] iArr = new int["\nu*\u0010y\u0017y~,Mf aOBYX\u001f\\E\tW\f\u0011\u0004\u001d4nW.[\u000bH".length()];
        QB qb = new QB("\nu*\u0010y\u0017y~,Mf aOBYX\u001f\\E\tW\f\u0011\u0004\u001d4nW.[\u000bH");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
            i3++;
        }
        String str3 = new String(iArr, 0, i3);
        String strQd = C1561oA.Qd("\n\u0007~\u0003\u000b\u000b6{u|~vtI.", (short) (C1499aX.Xd() ^ (-25871)));
        short sXd2 = (short) (C1580rY.Xd() ^ (-5978));
        short sXd3 = (short) (C1580rY.Xd() ^ (-25954));
        int[] iArr2 = new int["\u0015\"!b\u001d&' & i-#1#&27-44".length()];
        QB qb2 = new QB("\u0015\"!b\u001d&' & i-#1#&27-44");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i4)) - sXd3);
            i4++;
        }
        String str4 = String.format(C1561oA.Kd("\u001b('h#,-&,&o000/;u\n-.193A1E;BB\u0016BCGP&DOQ\f\u0004S\u000f\u0007V\u0012\nY", (short) (C1607wl.Xd() ^ 1642)), str, new String(iArr2, 0, i4), C1561oA.od(";:,:2", (short) (Od.Xd() ^ (-4473))));
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(this.zzb);
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Wg.Zd("\u0014txCg\u0019RonEq\rJDL\u0001_Nx YvXU#\u0012Xs_\u0010p\u0007\b7W{&\n~\u001bL=]\u0006A\u0010\u00062W{;\u0012u,_6]\u001e;g\"r]\u0012Ac\u007f-Z", (short) (OY.Xd() ^ 1448), (short) (OY.Xd() ^ 13883));
            C1561oA.Xd("Vyz}\u0006\u007f\u000e}\u0012\b\u000f\u000fb\u000f\u0010\u0014\u001d\u0013\u0011\u001c\u001ez\u0011\u001f!\u0018#%\u0017!\u0017\u001a", (short) (FB.Xd() ^ 21678));
            Context context = this.zzb;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("8D=JJCA\nBMOTHPY\u0012\n57<0BA", (short) (Od.Xd() ^ (-26149)))).getMethod(Qg.kd("\"\u001f-} \"\u001a'v\u001b#", (short) (C1580rY.Xd() ^ (-3487)), (short) (C1580rY.Xd() ^ (-12010))), new Class[0]);
            try {
                method.setAccessible(true);
                noBackupFilesDir = (File) method.invoke(context, objArr);
                if (!noBackupFilesDir.isDirectory()) {
                    try {
                        if (!noBackupFilesDir.mkdirs()) {
                            String str5 = strQd + String.valueOf(noBackupFilesDir);
                            throw new IOException(str3 + String.valueOf(noBackupFilesDir));
                        }
                    } catch (SecurityException e2) {
                        hg.Vd("\u0011\u000e\u0006\n\u0012\u0012=\u0011\u0004\r~\u00107w\u00044x\u000btu\u007f\u0003v{yD)", (short) (C1607wl.Xd() ^ 16002), (short) (C1607wl.Xd() ^ 10347)).concat(String.valueOf(String.valueOf(noBackupFilesDir)));
                        throw new IOException(str3.concat(String.valueOf(String.valueOf(noBackupFilesDir))), e2);
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return new File(noBackupFilesDir, str4);
    }

    public final void zzc(zzbhx zzbhxVar, String str, String str2, String str3, int i2, zzawy zzawyVar) {
        File fileZzb;
        zzaww zzawwVarZza = zzawx.zza();
        zzawwVarZza.zza(zzbhxVar);
        zzbha zzbhaVarZze = zzbhb.zze();
        zzbhaVarZze.zza(System.currentTimeMillis() / 1000);
        zzawwVarZza.zzc((zzbhb) zzbhaVarZze.zzv());
        zzawwVarZza.zzb(str2);
        zzawx zzawxVar = (zzawx) zzawwVarZza.zzv();
        synchronized (zza) {
            try {
                fileZzb = zzb(str, "com.google.perception", 2);
                try {
                    String str4 = "Saving nnapi allowlist cache to: " + fileZzb.toString();
                    AtomicFile atomicFile = new AtomicFile(fileZzb);
                    FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
                    try {
                        zzawxVar.zzv(fileOutputStreamStartWrite);
                        atomicFile.finishWrite(fileOutputStreamStartWrite);
                        String str5 = "Succeeded storing allowlist to file " + fileZzb.toString();
                    } catch (Throwable th) {
                        atomicFile.failWrite(fileOutputStreamStartWrite);
                        zzawyVar.zzc(zzags.FILE_WRITE_FAILED);
                        throw th;
                    }
                } catch (IOException e2) {
                    String str6 = "Error writing to nnapi allowlist cache file " + String.valueOf(fileZzb);
                    zzawyVar.zzc(zzags.FILE_WRITE_FAILED);
                }
            } catch (IOException e3) {
                fileZzb = null;
            }
        }
    }
}
