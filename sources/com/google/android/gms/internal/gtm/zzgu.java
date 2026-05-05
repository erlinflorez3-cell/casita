package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.material3.internal.CalendarModelKt;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgu {
    private final Context zza;
    private final Random zzb;
    private final String zzc;

    public zzgu(Context context, String str) {
        Random random = new Random();
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzb = random;
    }

    private final long zzg(long j2, long j3) throws Throwable {
        long jMax = Math.max(0L, zzh().getLong("FORBIDDEN_COUNT", 0L));
        return (long) (this.zzb.nextFloat() * (j2 + ((long) ((jMax / ((jMax + Math.max(0L, r6.getLong("SUCCESSFUL_COUNT", 0L))) + 1)) * (j3 - j2)))));
    }

    private final SharedPreferences zzh() throws Throwable {
        String strValueOf = String.valueOf(this.zzc);
        Context context = this.zza;
        String strConcat = C1593ug.zd("?~*3A;\u0012??F4=C;I*>@MAPF/OMKF]D", (short) (Od.Xd() ^ (-23859)), (short) (Od.Xd() ^ (-3418))).concat(strValueOf);
        short sXd = (short) (FB.Xd() ^ 12969);
        int[] iArr = new int["4@5B>71y.97<,49q\u00061/4$61".length()];
        QB qb = new QB("4@5B>71y.97<,49q\u00061/4$61");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {strConcat, 0};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.Zd(")\u000f\nNJ3.\u0006lBO.\u0015xqRB\u001f\u000b}", (short) (ZN.Xd() ^ 24688), (short) (ZN.Xd() ^ 5275)), Class.forName(C1561oA.Kd("-%;'t4*82y BA9?9", (short) (C1580rY.Xd() ^ (-12216)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            return (SharedPreferences) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final long zza() {
        if (Math.max(0L, zzh().getLong("FORBIDDEN_COUNT", 0L)) == 0) {
            return 0L;
        }
        return zzg(10000L, 600000L) + 10000;
    }

    public final long zzb() {
        return zzg(7200000L, 259200000L) + 43200000;
    }

    public final long zzc() {
        return zzg(600000L, CalendarModelKt.MillisecondsIn24Hours) + 3600000;
    }

    public final void zzd() throws Throwable {
        SharedPreferences sharedPreferencesZzh = zzh();
        long j2 = sharedPreferencesZzh.getLong("FORBIDDEN_COUNT", 0L);
        long j3 = sharedPreferencesZzh.getLong("SUCCESSFUL_COUNT", 0L);
        SharedPreferences.Editor editorEdit = sharedPreferencesZzh.edit();
        long jMin = j2 == 0 ? 3L : Math.min(10L, j2 + 1);
        long jMax = Math.max(0L, Math.min(j3, 10 - jMin));
        editorEdit.putLong("FORBIDDEN_COUNT", jMin);
        editorEdit.putLong("SUCCESSFUL_COUNT", jMax);
        editorEdit.apply();
    }

    public final void zze() throws Throwable {
        SharedPreferences sharedPreferencesZzh = zzh();
        long j2 = sharedPreferencesZzh.getLong("SUCCESSFUL_COUNT", 0L);
        long j3 = sharedPreferencesZzh.getLong("FORBIDDEN_COUNT", 0L);
        long jMin = Math.min(10L, j2 + 1);
        long jMax = Math.max(0L, Math.min(j3, 10 - jMin));
        SharedPreferences.Editor editorEdit = sharedPreferencesZzh.edit();
        editorEdit.putLong("SUCCESSFUL_COUNT", jMin);
        editorEdit.putLong("FORBIDDEN_COUNT", jMax);
        editorEdit.apply();
    }

    public final boolean zzf() {
        return Math.max(0L, zzh().getLong("FORBIDDEN_COUNT", 0L)) > 0;
    }
}
