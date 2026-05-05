package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

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
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzup {
    private static final Object zza;
    private final Context zzb;

    static {
        Component.builder(zzup.class).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzuo
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new zzup((Context) componentContainer.get(Context.class));
            }
        }).build();
        zza = new Object();
    }

    public zzup(Context context) {
        this.zzb = context;
    }

    public final zzuq zza(zzum zzumVar) {
        zzuq zzuqVar;
        zzch zzchVarZzb;
        zzuf zzufVar;
        String strZze;
        String strZze2;
        long jZzc;
        synchronized (zza) {
            File fileZzb = zzb(zzumVar);
            try {
                String str = new String(new AtomicFile(fileZzb).readFully(), Charset.forName("UTF-8"));
                try {
                    zzchVarZzb = zzcm.zzb(str);
                } catch (zzco e2) {
                    "Error parsing installation info JSON object:\n".concat(str);
                    zzumVar.zzc(zzsw.FILE_READ_RETURNED_MALFORMED_DATA);
                }
                if (zzchVarZzb instanceof zzck) {
                    zzck zzckVarZzb = zzchVarZzb.zzb();
                    try {
                        zzufVar = new zzuf(zzckVarZzb.zzc("fid").zze());
                        strZze = zzckVarZzb.zzc("refreshToken").zze();
                        strZze2 = zzckVarZzb.zzc("temporaryToken").zze();
                        jZzc = zzckVarZzb.zzc("temporaryTokenExpiryTimestamp").zzc();
                    } catch (ClassCastException e3) {
                    } catch (IllegalStateException e4) {
                    } catch (NullPointerException e5) {
                    }
                    try {
                        String str2 = "fid: " + zzufVar.toString();
                        String str3 = "refresh_token: " + strZze;
                        String str4 = "temporary_token: " + strZze2;
                        String str5 = "temporary token expiry: " + jZzc;
                        zzuqVar = new zzuq(zzufVar, strZze, strZze2, jZzc);
                    } catch (ClassCastException e6) {
                        zzumVar.zzc(zzsw.FILE_READ_RETURNED_INVALID_DATA);
                        String str6 = "Error traversing installation info JSON object:\nraw json:\n" + str + "\nparsed json:\n" + zzckVarZzb.toString();
                        zzuqVar = null;
                    } catch (IllegalStateException e7) {
                        zzumVar.zzc(zzsw.FILE_READ_RETURNED_INVALID_DATA);
                        String str62 = "Error traversing installation info JSON object:\nraw json:\n" + str + "\nparsed json:\n" + zzckVarZzb.toString();
                        zzuqVar = null;
                    } catch (NullPointerException e8) {
                        zzumVar.zzc(zzsw.FILE_READ_RETURNED_INVALID_DATA);
                        String str622 = "Error traversing installation info JSON object:\nraw json:\n" + str + "\nparsed json:\n" + zzckVarZzb.toString();
                        zzuqVar = null;
                    }
                } else {
                    "Error parsing installation info JSON element:\n".concat(String.valueOf(String.valueOf(zzchVarZzb)));
                    zzumVar.zzc(zzsw.FILE_READ_RETURNED_MALFORMED_DATA);
                }
                zzuqVar = null;
            } catch (IOException e9) {
                if (!fileZzb.exists()) {
                    String str7 = "Installation id file not yet present: " + fileZzb.toString();
                    return null;
                }
                zzumVar.zzc(zzsw.FILE_READ_FAILED);
                String str8 = "Error reading installation id file: " + fileZzb.toString();
                return null;
            }
        }
        return zzuqVar;
    }

    final File zzb(zzum zzumVar) throws Throwable {
        short sXd = (short) (OY.Xd() ^ 28510);
        int[] iArr = new int["tsms}\u007f-tpy}wwN5".length()];
        QB qb = new QB("tsms}\u007f-tpy}wwN5");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(this.zzb);
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            short sXd2 = (short) (C1633zX.Xd() ^ (-22815));
            int[] iArr2 = new int["II\u001f=:ANH)KQIR\"JRj.<1:4o<r7M=BB|opmfj^\u0016k]jwqeq\u001egiWO`\fKO[MVfdfh\u000eZ^\u000e\u000e\u0002|z".length()];
            QB qb2 = new QB("II\u001f=:ANH)KQIR\"JRj.<1:4o<r7M=BB|opmfj^\u0016k]jwqeq\u001egiWO`\fKO[MVfdfh\u000eZ^\u000e\u000e\u0002|z");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                i3++;
            }
            new String(iArr2, 0, i3);
            Qg.kd("/-+HR&JNN:DC7I=B@\u001a4\"/C1=", (short) (Od.Xd() ^ (-24299)), (short) (Od.Xd() ^ (-30719)));
            Context context = this.zzb;
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("*6+84-'o$/-2\"*/g{'%*\u001a,'", (short) (ZN.Xd() ^ 30279), (short) (ZN.Xd() ^ 10288))).getMethod(C1561oA.ud("<9G\u0018:<4A\u00115=", (short) (C1633zX.Xd() ^ (-6277))), new Class[0]);
            try {
                method.setAccessible(true);
                noBackupFilesDir = (File) method.invoke(context, objArr);
                if (noBackupFilesDir != null && !noBackupFilesDir.isDirectory()) {
                    try {
                        if (!noBackupFilesDir.mkdirs()) {
                            String str2 = str + noBackupFilesDir.toString();
                            zzumVar.zzd(zzsw.DIRECTORY_CREATION_FAILED);
                        }
                    } catch (SecurityException e2) {
                        C1561oA.yd("\u001d\u001c\u0012\u0018\u001e I\u001f\u0010\u001b\u000b\u001eC\u0006\u0010B%9!$,1#*&rU", (short) (C1607wl.Xd() ^ 27764)).concat(noBackupFilesDir.toString());
                        zzumVar.zzd(zzsw.DIRECTORY_CREATION_FAILED);
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return new File(noBackupFilesDir, C1561oA.Yd("[hg)clmflf0pppo{6Rx~\u0001nz{q\u0006{\u0003\u0003^z", (short) (C1499aX.Xd() ^ (-8535))));
    }

    public final void zzc(zzuq zzuqVar, zzum zzumVar) {
        File fileZzb;
        String str = String.format("{\n \"fid\": \"%s\",\n \"refreshToken\": \"%s\",\n \"temporaryToken\": \"%s\",\n \"temporaryTokenExpiryTimestamp\": \"%d\"\n}\n", zzuqVar.zzb().zza(), zzuqVar.zzc(), zzuqVar.zzd(), Long.valueOf(zzuqVar.zza()));
        synchronized (zza) {
            try {
                fileZzb = zzb(zzumVar);
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
                    zzumVar.zzc(zzsw.FILE_WRITE_FAILED);
                    String str4 = "Error writing to installation id file " + String.valueOf(fileZzb);
                }
            } catch (IOException e3) {
                fileZzb = null;
            }
        }
    }
}
