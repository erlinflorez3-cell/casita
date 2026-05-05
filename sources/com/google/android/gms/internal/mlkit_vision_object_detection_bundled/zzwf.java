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
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzwf {
    private static final Object zza;
    private final Context zzb;

    static {
        Component.builder(zzwf.class).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwe
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new zzwf((Context) componentContainer.get(Context.class));
            }
        }).build();
        zza = new Object();
    }

    public zzwf(Context context) {
        this.zzb = context;
    }

    private final File zzc() throws Throwable {
        String strUd = C1626yg.Ud("\\PC.\u0013vz9%1\u0001}Sr6", (short) (OY.Xd() ^ 12479), (short) (OY.Xd() ^ 30036));
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(this.zzb);
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Ig.wd("\u0011MP\tyME}1U\\uQ\u001aUyn[\fk7[wCX\u001c\u000b'!m\u0013d\u0014\u0002]\u001ex\u0017\rks_(|Ih7m\\>]4\\J\f\u001f\u0017R}~.vfu3\f5y+", (short) (C1580rY.Xd() ^ (-15698)));
            EO.Od("[-.p,.)\"V{E\u0007\u0003u[F\n]50b=", (short) (ZN.Xd() ^ 139));
            Context context = this.zzb;
            short sXd = (short) (OY.Xd() ^ 5797);
            int[] iArr = new int["CODQMF@\t=HFK;CH\u0001\u0015@>C3E@".length()];
            QB qb = new QB("CODQMF@\t=HFK;CH\u0001\u0015@>C3E@");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1593ug.zd("RQa4X\\Ve7]g", (short) (FB.Xd() ^ 8125), (short) (FB.Xd() ^ 21814)), new Class[0]);
            try {
                method.setAccessible(true);
                noBackupFilesDir = (File) method.invoke(context, objArr);
                if (noBackupFilesDir != null && !noBackupFilesDir.isDirectory()) {
                    try {
                        if (!noBackupFilesDir.mkdirs()) {
                            String str = strUd + noBackupFilesDir.toString();
                        }
                    } catch (SecurityException e2) {
                        String string = noBackupFilesDir.toString();
                        short sXd2 = (short) (OY.Xd() ^ 11064);
                        int[] iArr2 = new int["=:26>>i=09+<c$0`%7!\",/#(&pU".length()];
                        QB qb2 = new QB("=:26>>i=09+<c$0`%7!\",/#(&pU");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                            i3++;
                        }
                        new String(iArr2, 0, i3).concat(string);
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return new File(noBackupFilesDir, C1561oA.Kd("0=<}8AB;A;\u0005EEEDP\u000b0DMPVH'TTMQP", (short) (ZN.Xd() ^ 3406)));
    }

    public final zzvt zza(zzum zzumVar) {
        zzvt zzvtVar;
        synchronized (zza) {
            File fileZzc = zzc();
            zzvtVar = null;
            try {
                String str = new String(new AtomicFile(fileZzc).readFully(), Charset.forName("UTF-8"));
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    try {
                        zzvtVar = new zzvt(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"));
                    } catch (JSONException e2) {
                        zzumVar.zzc(zzsw.FILE_READ_RETURNED_INVALID_DATA);
                        "Error parsing remote config settings JSON object:\n".concat(jSONObject.toString());
                    }
                } catch (JSONException e3) {
                    zzumVar.zzc(zzsw.FILE_READ_RETURNED_MALFORMED_DATA);
                    "Error parsing remote config settings JSON string:\n".concat(str);
                }
            } catch (IOException e4) {
                if (!fileZzc.exists()) {
                    String str2 = "remote config settings file not yet present: " + fileZzc.toString();
                    return null;
                }
                zzumVar.zzc(zzsw.FILE_READ_FAILED);
                String str3 = "Error reading remote config settings file: " + fileZzc.toString();
                return null;
            }
        }
        return zzvtVar;
    }

    public final void zzb(zzvt zzvtVar, zzum zzumVar) {
        File fileZzc;
        String string = zzvtVar.toString();
        synchronized (zza) {
            try {
                fileZzc = zzc();
            } catch (IOException e2) {
                fileZzc = null;
            }
            try {
                String str = "Creating remote config settings: " + fileZzc.toString();
                AtomicFile atomicFile = new AtomicFile(fileZzc);
                FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
                try {
                    PrintWriter printWriter = new PrintWriter(fileOutputStreamStartWrite);
                    printWriter.println(string);
                    printWriter.flush();
                    atomicFile.finishWrite(fileOutputStreamStartWrite);
                    String str2 = "Succeeded writing remote config settings: " + fileZzc.toString() + ":\n" + string;
                } catch (Throwable th) {
                    atomicFile.failWrite(fileOutputStreamStartWrite);
                    throw th;
                }
            } catch (IOException e3) {
                zzumVar.zzc(zzsw.FILE_WRITE_FAILED);
                String str3 = "Error writing to remote config settings file " + String.valueOf(fileZzc);
            }
        }
    }
}
