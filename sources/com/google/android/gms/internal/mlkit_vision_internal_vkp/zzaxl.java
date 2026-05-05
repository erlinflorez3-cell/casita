package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.core.util.AtomicFile;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
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
public final class zzaxl {
    private static final Object zza;
    private final Context zzb;

    static {
        Component.builder(zzaxl.class).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaxk
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new zzaxl((Context) componentContainer.get(Context.class));
            }
        }).build();
        zza = new Object();
    }

    public zzaxl(Context context) {
        this.zzb = context;
    }

    public final zzaxm zza(zzaxi zzaxiVar) {
        zzaxm zzaxmVar;
        zzael zzaelVarZzb;
        zzaxc zzaxcVar;
        String strZze;
        String strZze2;
        long jZzc;
        synchronized (zza) {
            File fileZzb = zzb(zzaxiVar);
            try {
                String str = new String(new AtomicFile(fileZzb).readFully(), Charset.forName("UTF-8"));
                try {
                    zzaelVarZzb = zzaeq.zzb(str);
                } catch (zzaes e2) {
                    "Error parsing installation info JSON object:\n".concat(str);
                    zzaxiVar.zzc(zzave.FILE_READ_RETURNED_MALFORMED_DATA);
                }
                if (zzaelVarZzb instanceof zzaeo) {
                    zzaeo zzaeoVarZzb = zzaelVarZzb.zzb();
                    try {
                        zzaxcVar = new zzaxc(zzaeoVarZzb.zzc("fid").zze());
                        strZze = zzaeoVarZzb.zzc("refreshToken").zze();
                        strZze2 = zzaeoVarZzb.zzc("temporaryToken").zze();
                        jZzc = zzaeoVarZzb.zzc("temporaryTokenExpiryTimestamp").zzc();
                    } catch (ClassCastException e3) {
                    } catch (IllegalStateException e4) {
                    } catch (NullPointerException e5) {
                    }
                    try {
                        String str2 = "fid: " + zzaxcVar.toString();
                        String str3 = "refresh_token: " + strZze;
                        String str4 = "temporary_token: " + strZze2;
                        String str5 = "temporary token expiry: " + jZzc;
                        zzaxmVar = new zzaxm(zzaxcVar, strZze, strZze2, jZzc);
                    } catch (ClassCastException e6) {
                        zzaxiVar.zzc(zzave.FILE_READ_RETURNED_INVALID_DATA);
                        String str6 = "Error traversing installation info JSON object:\nraw json:\n" + str + "\nparsed json:\n" + zzaeoVarZzb.toString();
                        zzaxmVar = null;
                    } catch (IllegalStateException e7) {
                        zzaxiVar.zzc(zzave.FILE_READ_RETURNED_INVALID_DATA);
                        String str62 = "Error traversing installation info JSON object:\nraw json:\n" + str + "\nparsed json:\n" + zzaeoVarZzb.toString();
                        zzaxmVar = null;
                    } catch (NullPointerException e8) {
                        zzaxiVar.zzc(zzave.FILE_READ_RETURNED_INVALID_DATA);
                        String str622 = "Error traversing installation info JSON object:\nraw json:\n" + str + "\nparsed json:\n" + zzaeoVarZzb.toString();
                        zzaxmVar = null;
                    }
                } else {
                    "Error parsing installation info JSON element:\n".concat(String.valueOf(String.valueOf(zzaelVarZzb)));
                    zzaxiVar.zzc(zzave.FILE_READ_RETURNED_MALFORMED_DATA);
                }
                zzaxmVar = null;
            } catch (IOException e9) {
                if (!fileZzb.exists()) {
                    String str7 = "Installation id file not yet present: " + fileZzb.toString();
                    return null;
                }
                zzaxiVar.zzc(zzave.FILE_READ_FAILED);
                String str8 = "Error reading installation id file: " + fileZzb.toString();
                return null;
            }
        }
        return zzaxmVar;
    }

    final File zzb(zzaxi zzaxiVar) throws Throwable {
        String strVd = Wg.vd("oldhxx$ikrtlrG,", (short) (C1499aX.Xd() ^ (-3904)));
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(this.zzb);
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Qg.kd("\n\n[yz\u0002\u000b\u0005Y{}u\u0003Rv~+nxmzt,x#gyirr)\u001cpmbf^\u0016gYZg]Qa\u000eSUWO\\\bKOWIFVPRX}FJNN>9;", (short) (C1580rY.Xd() ^ (-29178)), (short) (C1580rY.Xd() ^ (-4444)));
            hg.Vd("975R\\0TXXDNMASGLJ$>,9M;G", (short) (OY.Xd() ^ 16453), (short) (OY.Xd() ^ 24001));
            Context context = this.zzb;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("\u000f\u001b\u0010\u001d\u0019\u0012\fT\t\u0014\u0012\u0017\u0007\u000f\u0014L`\f\n\u000f~\u0011\f", (short) (C1633zX.Xd() ^ (-26639)))).getMethod(C1561oA.yd("\u0019\u0016$t\u001f!\u0019&m\u0012\u001a", (short) (FB.Xd() ^ 5384)), new Class[0]);
            try {
                method.setAccessible(true);
                noBackupFilesDir = (File) method.invoke(context, objArr);
                if (noBackupFilesDir != null && !noBackupFilesDir.isDirectory()) {
                    try {
                        if (!noBackupFilesDir.mkdirs()) {
                            String str = strVd + noBackupFilesDir.toString();
                            zzaxiVar.zzd(zzave.DIRECTORY_CREATION_FAILED);
                        }
                    } catch (SecurityException e2) {
                        C1561oA.Yd("xwqw\u0002\u00041\u0007{\u0007z\u000e7y\b:\u0001\u0015\u0001\u0004\u0010\u0015\u000b\u0012\u0012^E", (short) (OY.Xd() ^ 21136)).concat(noBackupFilesDir.toString());
                        zzaxiVar.zzd(zzave.DIRECTORY_CREATION_FAILED);
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        short sXd = (short) (Od.Xd() ^ (-351));
        short sXd2 = (short) (Od.Xd() ^ (-12758));
        int[] iArr = new int["y\u0007\u0006G\u0002\u000b\f\u0005\u000b\u0005N\u000f\u000f\u000f\u000e\u001aTp\u0017\u001d\u001f\r\u0019\u001a\u0010$\u001a!!|\u0019".length()];
        QB qb = new QB("y\u0007\u0006G\u0002\u000b\f\u0005\u000b\u0005N\u000f\u000f\u000f\u000e\u001aTp\u0017\u001d\u001f\r\u0019\u001a\u0010$\u001a!!|\u0019");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        return new File(noBackupFilesDir, new String(iArr, 0, i2));
    }

    public final void zzc(zzaxm zzaxmVar, zzaxi zzaxiVar) {
        File fileZzb;
        String str = String.format("{\n \"fid\": \"%s\",\n \"refreshToken\": \"%s\",\n \"temporaryToken\": \"%s\",\n \"temporaryTokenExpiryTimestamp\": \"%d\"\n}\n", zzaxmVar.zzb().zza(), zzaxmVar.zzc(), zzaxmVar.zzd(), Long.valueOf(zzaxmVar.zza()));
        synchronized (zza) {
            try {
                fileZzb = zzb(zzaxiVar);
                try {
                    String str2 = "Creating installation id: " + fileZzb.toString();
                    AtomicFile atomicFile = new AtomicFile(fileZzb);
                    FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
                    try {
                        PrintWriter printWriter = new PrintWriter(fileOutputStreamStartWrite);
                        printWriter.println(str);
                        printWriter.flush();
                        atomicFile.finishWrite(fileOutputStreamStartWrite);
                        String str3 = "Succeeded writing installation id: " + fileZzb.toString() + ":\n" + str;
                    } catch (Throwable th) {
                        atomicFile.failWrite(fileOutputStreamStartWrite);
                        throw th;
                    }
                } catch (IOException e2) {
                    zzaxiVar.zzc(zzave.FILE_WRITE_FAILED);
                    String str4 = "Error writing to installation id file " + String.valueOf(fileZzb);
                }
            } catch (IOException e3) {
                fileZzb = null;
            }
        }
    }
}
