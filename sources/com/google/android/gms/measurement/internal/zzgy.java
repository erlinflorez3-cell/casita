package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
class zzgy extends BroadcastReceiver {
    private final zznv zza;
    private boolean zzb;
    private boolean zzc;

    zzgy(zznv zznvVar) {
        Preconditions.checkNotNull(zznvVar);
        this.zza = zznvVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        this.zza.zzs();
        String action = intent.getAction();
        this.zza.zzj().zzp().zza("NetworkBroadcastReceiver received action", action);
        if (!BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION.equals(action)) {
            this.zza.zzj().zzu().zza("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zZzu = this.zza.zzh().zzu();
        if (this.zzc != zZzu) {
            this.zzc = zZzu;
            this.zza.zzl().zzb(new zzgx(this, zZzu));
        }
    }

    public final void zza() {
        this.zza.zzs();
        this.zza.zzl().zzt();
        if (this.zzb) {
            return;
        }
        Context contextZza = this.zza.zza();
        IntentFilter intentFilter = new IntentFilter(Jg.Wd("o\u0001\u0017E`\u000b&\u0010nu%~R\u000f.N,\u0012>]{#Ar\u0006#6a\u0005;?d{Xq\u0010", (short) (FB.Xd() ^ 23963), (short) (FB.Xd() ^ 205)));
        Class<?> cls = Class.forName(ZO.xd("T$T\u0005\"B\u0015M\u0017\u000fBjxr\u001c\u0002.%bgW8p", (short) (C1499aX.Xd() ^ (-22274)), (short) (C1499aX.Xd() ^ (-4749))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1499aX.Xd() ^ (-23830));
        short sXd2 = (short) (C1499aX.Xd() ^ (-24299));
        int[] iArr = new int["kB}=W~RM\u001e\u0003tIVJ6\u000e\u0011\u001ci`V\u0017b\u0014\u0010!\"YD2\u0004\u001bk".length()];
        QB qb = new QB("kB}=W~RM\u001e\u0003tIVJ6\u000e\u0011\u001ci`V\u0017b\u0014\u0010!\"YD2\u0004\u001bk");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Class.forName(Ig.wd("|8\u001c\n\u0016c\r='UTz\u001c)9\u0013X\nF}Kwy\u0017\u001eP]9", (short) (Od.Xd() ^ (-9297))));
        Object[] objArr = {this, intentFilter};
        Method method = cls.getMethod(EO.Od("\u000e+\u001b\u0001\u0012py&U80\u0018g\u0003]L", (short) (FB.Xd() ^ 6003)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(contextZza, objArr);
            this.zzc = this.zza.zzh().zzu();
            zzgq zzgqVarZzp = this.zza.zzj().zzp();
            Boolean boolValueOf = Boolean.valueOf(this.zzc);
            short sXd3 = (short) (C1580rY.Xd() ^ (-2972));
            int[] iArr2 = new int["\u0005\u0017\u0018\u0019\"\"\u0012\u001e\u0014\u0018\u0010G\n\u0015\u0013\u0012\b\u0005\u0015\t\u0015\u0007\u0011\u0015:|\u0001x\u0005|y3\u0005vstw\u0004q}8)Vlz|sum!cnlka^n^\\".length()];
            QB qb2 = new QB("\u0005\u0017\u0018\u0019\"\"\u0012\u001e\u0014\u0018\u0010G\n\u0015\u0013\u0012\b\u0005\u0015\t\u0015\u0007\u0011\u0015:|\u0001x\u0005|y3\u0005vstw\u0004q}8)Vlz|sum!cnlka^n^\\");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            zzgqVarZzp.zza(new String(iArr2, 0, i3), boolValueOf);
            this.zzb = true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void zzb() {
        this.zza.zzs();
        this.zza.zzl().zzt();
        this.zza.zzl().zzt();
        if (this.zzb) {
            this.zza.zzj().zzp().zza(C1593ug.zd("\u0001\u001b \u0014\u0017\u001a%'\u0019'\u001f%\u001fX\u001d**+#\"4*8,8>e*0*821l@436;I9G", (short) (ZN.Xd() ^ 31873), (short) (ZN.Xd() ^ 18614)));
            this.zzb = false;
            this.zzc = false;
            Context contextZza = this.zza.zza();
            try {
                Class<?> cls = Class.forName(C1561oA.od("|\t}\u000b\u0007\u007fyBv\u0002\u007f\u0005t|\u0002:Nyw|l~y", (short) (C1607wl.Xd() ^ 15291)));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(C1561oA.Kd("\u001b) /-($n%229+5<v\f=;.221DF%98;@N>L", (short) (C1607wl.Xd() ^ 26681)));
                Object[] objArr = {this};
                Method method = cls.getMethod(Wg.Zd("|xoE:?< \u0004\u0014f^OTK;\u001d-", (short) (C1633zX.Xd() ^ (-21438)), (short) (C1633zX.Xd() ^ (-9273))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(contextZza, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalArgumentException e3) {
                zzgq zzgqVarZzg = this.zza.zzj().zzg();
                short sXd = (short) (C1607wl.Xd() ^ 27150);
                int[] iArr = new int["\u0010,5933oEArICH<?BMOAO}SHF\u0002QIY]VZT\nM^\\OSSReg\u0014g[Z]bp`n".length()];
                QB qb = new QB("\u0010,5933oEArICH<?BMOAO}SHF\u0002QIY]VZT\nM^\\OSSReg\u0014g[Z]bp`n");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                    i2++;
                }
                zzgqVarZzg.zza(new String(iArr, 0, i2), e3);
            }
        }
    }
}
