package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zzak {
    private SharedPreferences zzde;
    private final zzn zzdf;
    private final Map<String, zzo> zzdg;
    private Context zzl;

    public zzak(Context context) {
        this(context, new zzn());
    }

    private zzak(Context context, zzn zznVar) throws Throwable {
        String strQd = Xg.qd("&LRTBPFI.*\u0016;]Y]Q", (short) (ZN.Xd() ^ 6017), (short) (ZN.Xd() ^ 12084));
        this.zzdg = new ArrayMap();
        this.zzl = context;
        String strWd = Jg.Wd("\u0007Zg8\u0001\u0011 (<=\u0015Xtr\u0010\u001d&)\u0002K!.x;Zajt", (short) (OY.Xd() ^ 6379), (short) (OY.Xd() ^ 1991));
        Class<?> cls = Class.forName(ZO.xd("@\"Kz$I'<3PCP!\u000bs\u000f\"my=eTE", (short) (C1580rY.Xd() ^ (-14619)), (short) (C1580rY.Xd() ^ (-20893))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (Od.Xd() ^ (-1256));
        short sXd2 = (short) (Od.Xd() ^ (-18143));
        int[] iArr = new int["\u0010c\u0015\u001e\u007f/\u001e3 IYn\u000b\u001e\u0005l".length()];
        QB qb = new QB("\u0010c\u0015\u001e\u007f/\u001e3 IYn\u000b\u001e\u0005l");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {strWd, 0};
        Method method = cls.getMethod(Ig.wd("A\u001b63OjeGf\u0019;N\u007fr\"\u001d|q:}", (short) (C1499aX.Xd() ^ (-19219))), clsArr);
        try {
            method.setAccessible(true);
            this.zzde = (SharedPreferences) method.invoke(context, objArr);
            this.zzdf = zznVar;
            File file = new File(ContextCompat.getNoBackupFilesDir(this.zzl), EO.Od("$\u007f\fke+~n#?\u0002W\u0010\u0014>\\s\\~@\u0005Sg\u0017txP\u001c2b7W\\:\u0005O0\u000f", (short) (C1633zX.Xd() ^ (-26605))));
            if (file.exists()) {
                return;
            }
            try {
                if (!file.createNewFile() || isEmpty()) {
                    return;
                }
                C1561oA.Qd("5cb\u0011bTaa[]OM\u0014\u0007IQIDTJNF}PP<N>", (short) (C1580rY.Xd() ^ (-20438)));
                InstanceIDListenerService.zzd(this.zzl, this);
            } catch (IOException e2) {
                if (Log.isLoggable(strQd, 3)) {
                    String strValueOf = String.valueOf(e2.getMessage());
                    int length = strValueOf.length();
                    String strZd = C1593ug.zd("&TUSW\u0006JZNK_U[U\u000fVZ^X\u0014^d\u0017fh\u001a]]`itp!flv?&", (short) (FB.Xd() ^ 10239), (short) (FB.Xd() ^ 29300));
                    if (length != 0) {
                        strZd.concat(strValueOf);
                    } else {
                        new String(strZd);
                    }
                }
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static String zzd(String str, String str2, String str3) {
        return new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str).append("|T|").append(str2).append("|").append(str3).toString();
    }

    private static String zze(String str, String str2, String str3) {
        return new StringBuilder(String.valueOf(str).length() + 14 + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str).append("|T-timestamp|").append(str2).append("|").append(str3).toString();
    }

    static String zzh(String str, String str2) {
        return new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length()).append(str).append("|S|").append(str2).toString();
    }

    final synchronized String get(String str) {
        return this.zzde.getString(str, null);
    }

    public final boolean isEmpty() {
        return this.zzde.getAll().isEmpty();
    }

    public final synchronized void zzd(String str, String str2, String str3, String str4, String str5) {
        String strZzd = zzd(str, str2, str3);
        String strZze = zze(str, str2, str3);
        SharedPreferences.Editor editorEdit = this.zzde.edit();
        editorEdit.putString(strZzd, str4);
        editorEdit.putLong(strZze, System.currentTimeMillis());
        editorEdit.putString("appVersion", str5);
        editorEdit.commit();
    }

    public final synchronized String zzf(String str, String str2, String str3) {
        return this.zzde.getString(zzd(str, str2, str3), null);
    }

    final synchronized long zzg(String str, String str2, String str3) {
        return this.zzde.getLong(zze(str, str2, str3), -1L);
    }

    public final synchronized void zzh(String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = this.zzde.edit();
        editorEdit.remove(zzd(str, str2, str3));
        editorEdit.remove(zze(str, str2, str3));
        editorEdit.commit();
    }

    public final synchronized void zzi(String str) {
        SharedPreferences.Editor editorEdit = this.zzde.edit();
        for (String str2 : this.zzde.getAll().keySet()) {
            if (str2.startsWith(str)) {
                editorEdit.remove(str2);
            }
        }
        editorEdit.commit();
    }

    public final synchronized zzo zzj(String str) {
        zzo zzoVarZzf;
        zzo zzoVar = this.zzdg.get(str);
        if (zzoVar != null) {
            return zzoVar;
        }
        try {
            zzoVarZzf = this.zzdf.zze(this.zzl, str);
        } catch (zzp unused) {
            InstanceIDListenerService.zzd(this.zzl, this);
            zzoVarZzf = this.zzdf.zzf(this.zzl, str);
        }
        this.zzdg.put(str, zzoVarZzf);
        return zzoVarZzf;
    }

    final void zzk(String str) {
        synchronized (this) {
            this.zzdg.remove(str);
        }
        zzn.zzg(this.zzl, str);
        zzi(String.valueOf(str).concat("|"));
    }

    public final synchronized void zzz() {
        this.zzdg.clear();
        zzn.zzi(this.zzl);
        this.zzde.edit().clear().commit();
    }
}
