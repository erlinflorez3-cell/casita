package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfj extends zzbu {
    private SharedPreferences zza;
    private long zzb;
    private long zzc;
    private final zzfi zzd;

    protected zzfj(zzbx zzbxVar) {
        super(zzbxVar);
        this.zzc = -1L;
        zzw();
        this.zzd = new zzfi(this, "monitoring", ((Long) zzew.zzP.zzb()).longValue(), null);
    }

    public final long zza() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        long jCurrentTimeMillis = this.zzb;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = this.zza.getLong("first_run", 0L);
            if (jCurrentTimeMillis != 0) {
                this.zzb = jCurrentTimeMillis;
            } else {
                jCurrentTimeMillis = zzC().currentTimeMillis();
                SharedPreferences.Editor editorEdit = this.zza.edit();
                editorEdit.putLong("first_run", jCurrentTimeMillis);
                if (!editorEdit.commit()) {
                    zzQ("Failed to commit first run time");
                }
                this.zzb = jCurrentTimeMillis;
            }
        }
        return jCurrentTimeMillis;
    }

    public final long zzb() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        long j2 = this.zzc;
        if (j2 != -1) {
            return j2;
        }
        long j3 = this.zza.getLong("last_dispatch", 0L);
        this.zzc = j3;
        return j3;
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() throws Throwable {
        Context contextZzo = zzo();
        short sXd = (short) (C1499aX.Xd() ^ (-8919));
        short sXd2 = (short) (C1499aX.Xd() ^ (-23998));
        int[] iArr = new int["Yfe'ajkdjd.bpgvtok6pw~:n|p|\u000b\u0007|w\tD\b\u000b~\u0001\u000f".length()];
        QB qb = new QB("Yfe'ajkdjd.bpgvtok6pw~:n|p|\u000b\u0007|w\tD\b\u000b~\u0001\u000f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd3 = (short) (C1633zX.Xd() ^ (-3123));
        int[] iArr2 = new int["2>3@<5/w,75:*27o\u0004/-2\"4/".length()];
        QB qb2 = new QB("2>3@<5/w,75:*27o\u0004/-2\"4/");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = {Class.forName(C1561oA.Kd("d\\r^,kaoi1Wyxpvp", (short) (OY.Xd() ^ 27992))), Integer.TYPE};
        Object[] objArr = {str, 0};
        short sXd4 = (short) (C1633zX.Xd() ^ (-11663));
        short sXd5 = (short) (C1633zX.Xd() ^ (-8669));
        int[] iArr3 = new int["\u0019z\u0003\u001f\r\u0003K;\u0013<W\u0004aY$\u0010u\"!h".length()];
        QB qb3 = new QB("\u0019z\u0003\u001f\r\u0003K;\u0013<W\u0004aY$\u0010u\"!h");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(((i4 * sXd5) ^ sXd4) + xuXd3.CK(iKK3));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            this.zza = (SharedPreferences) method.invoke(contextZzo, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final zzfi zze() {
        return this.zzd;
    }

    public final zzfq zzf() {
        return new zzfq(zzC(), zza());
    }

    public final String zzg() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        String string = this.zza.getString("installation_campaign", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public final void zzh(String str) {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        SharedPreferences.Editor editorEdit = this.zza.edit();
        if (TextUtils.isEmpty(str)) {
            editorEdit.remove("installation_campaign");
        } else {
            editorEdit.putString("installation_campaign", str);
        }
        if (editorEdit.commit()) {
            return;
        }
        zzQ("Failed to commit campaign data");
    }

    public final void zzi() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        long jCurrentTimeMillis = zzC().currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.zza.edit();
        editorEdit.putLong("last_dispatch", jCurrentTimeMillis);
        editorEdit.apply();
        this.zzc = jCurrentTimeMillis;
    }
}
