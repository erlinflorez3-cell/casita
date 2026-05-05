package com.google.android.gms.internal.gtm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
final class zzfe extends BroadcastReceiver {
    static final String zza = "com.google.android.gms.internal.gtm.zzfe";
    private final zzbx zzb;
    private boolean zzc;
    private boolean zzd;

    zzfe(zzbx zzbxVar) {
        Preconditions.checkNotNull(zzbxVar);
        this.zzb = zzbxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        this.zzb.zzm();
        this.zzb.zzf();
        String action = intent.getAction();
        this.zzb.zzm().zzO("NetworkBroadcastReceiver received action", action);
        if (BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION.equals(action)) {
            boolean zZze = zze();
            if (this.zzd != zZze) {
                this.zzd = zZze;
                zzbs zzbsVarZzf = this.zzb.zzf();
                zzbsVarZzf.zzO("Network connectivity status changed", Boolean.valueOf(zZze));
                zzbsVarZzf.zzq().zzi(new zzbl(zzbsVarZzf, zZze));
                return;
            }
            return;
        }
        if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.zzb.zzm().zzR("NetworkBroadcastReceiver received unknown action", action);
        } else {
            if (intent.hasExtra(zza)) {
                return;
            }
            zzbs zzbsVarZzf2 = this.zzb.zzf();
            zzbsVarZzf2.zzN("Radio powered up");
            zzbsVarZzf2.zzc();
        }
    }

    public final void zza() throws Throwable {
        this.zzb.zzm();
        this.zzb.zzf();
        if (this.zzc) {
            return;
        }
        Context contextZza = this.zzb.zza();
        ContextCompat.registerReceiver(contextZza, this, new IntentFilter(C1561oA.Yd("\\japnie0qiy4jwwx9O\\\\]UTf\\j^jpw\\b\\jdc", (short) (OY.Xd() ^ 29111))), 4);
        IntentFilter intentFilter = new IntentFilter(Xg.qd("\u0017$#d\u001f()\"(\"k .\".<8.):u\u001b\u000b\u000f\u0015\u001c-\u001f\u001f(\u0017%\u0019\u0019", (short) (C1607wl.Xd() ^ 7617), (short) (C1607wl.Xd() ^ 21678)));
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("OJym$\f0o.p`T7u]4s\rF1\\\\\"", (short) (OY.Xd() ^ 306), (short) (OY.Xd() ^ 12747))).getMethod(ZO.xd("@q1JWQm1\u0017\tgF><", (short) (C1633zX.Xd() ^ (-14896)), (short) (C1633zX.Xd() ^ (-15642))), new Class[0]);
        try {
            method.setAccessible(true);
            intentFilter.addCategory((String) method.invoke(contextZza, objArr));
            ContextCompat.registerReceiver(contextZza, this, intentFilter, 4);
            this.zzd = zze();
            this.zzb.zzm().zzO(C1626yg.Ud("\u000f\u001e<\nhj\u0001xu~R9lm?[js8\bCLI&\u0015eg);CA\u0002\"D8T\u0016g-(\u001a?AV\u0005#TSvr\r\u0018{\u001a-bq\u0002\u0011", (short) (ZN.Xd() ^ 21111), (short) (ZN.Xd() ^ 9433)), Boolean.valueOf(this.zzd));
            this.zzc = true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void zzb() throws Throwable {
        Context contextZza = this.zzb.zza();
        Intent intent = new Intent(Ig.wd("Z\u0019\u0005)2}&5{H\u0013$\u0003kf~0)Ic^)@Az\u000f?f\u0002\u001a6k\u0001$", (short) (C1633zX.Xd() ^ (-26310))));
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("A\u001e\"LJ\u0001S\u0016y&\u001fKf} {-E\u001ei\u001avJ", (short) (C1633zX.Xd() ^ (-12109)))).getMethod(C1561oA.Qd("\u000f\f\u001at\u0005\u0006\r\u0002\u0007\u0004k}\t\u007f", (short) (C1607wl.Xd() ^ 5177)), new Class[0]);
        try {
            method.setAccessible(true);
            intent.addCategory((String) method.invoke(contextZza, objArr));
            intent.putExtra(zza, true);
            Object[] objArr2 = {intent, null};
            Method method2 = Class.forName(C1593ug.zd("Vd[jhc_*`mmtfpw2Huu|n\u0003\u007f", (short) (C1607wl.Xd() ^ 28717), (short) (C1607wl.Xd() ^ 30854))).getMethod(Wg.Zd("\t\u0012:G\u0012L]5@J(\u001emARo-BtL", (short) (C1633zX.Xd() ^ (-27513)), (short) (C1633zX.Xd() ^ (-20775))), Class.forName(C1561oA.od("T`Ub^WQ\u001aNYW\\LTY\u0012,PUEMR", (short) (FB.Xd() ^ 20406))), Class.forName(C1561oA.Kd("\u0012\n \fY\u0019\u000f\u001d\u0017^\u0005'&\u001e$\u001e", (short) (ZN.Xd() ^ 6516))));
            try {
                method2.setAccessible(true);
                method2.invoke(contextZza, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void zzc() throws Throwable {
        if (this.zzc) {
            zzfd zzfdVarZzm = this.zzb.zzm();
            short sXd = (short) (OY.Xd() ^ 20034);
            int[] iArr = new int["\u000e(-!$'24&4,2,e*7780/A7E9EKr7=7E?>yMA@CHVFT".length()];
            QB qb = new QB("\u000e(-!$'24&4,2,e*7780/A7E9EKr7=7E?>yMA@CHVFT");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            zzfdVarZzm.zzN(new String(iArr, 0, i2));
            this.zzc = false;
            this.zzd = false;
            Context contextZza = this.zzb.zza();
            try {
                Class<?> cls = Class.forName(Wg.vd("2@7FD?;\u0006,99@2<C}$QQXJ^[", (short) (OY.Xd() ^ 9023)));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(Qg.kd("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[n\u001e\u001a\u000b\r\u000b\b\u0019\u0019u\b\u0005\u0006\t\u0015\u0003\u000f", (short) (ZN.Xd() ^ 13665), (short) (ZN.Xd() ^ 20981)));
                Object[] objArr = {this};
                Method method = cls.getMethod(hg.Vd("3+. !\"++\u001b'\u0006\u0018\u0015\u0016\u0019%\u0013\u001f", (short) (Od.Xd() ^ (-16108)), (short) (Od.Xd() ^ (-24726))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(contextZza, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalArgumentException e3) {
                this.zzb.zzm().zzJ(C1561oA.ud("0JQSKI\u0004WQ\u0001UMPBCDMM=IuI<8q?5CE<>6i+:6')'$55_1# !$0\u001e*", (short) (C1633zX.Xd() ^ (-14044))), e3);
            }
        }
    }

    public final boolean zzd() {
        if (!this.zzc) {
            this.zzb.zzm().zzQ("Connectivity unknown. Receiver not registered");
        }
        return this.zzd;
    }

    protected final boolean zze() throws Throwable {
        Context contextZza = this.zzb.zza();
        String strYd = C1561oA.yd("'243%\"6*2$26", (short) (C1580rY.Xd() ^ (-20116)));
        Class<?> cls = Class.forName(C1561oA.Yd("Q_Vec^Z%[hhoakr-Cppwi}z", (short) (C1499aX.Xd() ^ (-28161))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (Od.Xd() ^ (-31293));
        short sXd2 = (short) (Od.Xd() ^ (-25385));
        int[] iArr = new int["\u0011\t\u001f\u000bX\u0018\u000e\u001c\u0016]\u0004&%\u001d#\u001d".length()];
        QB qb = new QB("\u0011\t\u001f\u000bX\u0018\u000e\u001c\u0016]\u0004&%\u001d#\u001d");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strYd};
        Method method = cls.getMethod(Jg.Wd("\u001bX@?+\u0006\u001fM>D,y&v)K", (short) (OY.Xd() ^ 8044), (short) (OY.Xd() ^ 15682)), clsArr);
        try {
            method.setAccessible(true);
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) method.invoke(contextZza, objArr)).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.isConnected()) {
                        return true;
                    }
                }
            } catch (SecurityException unused) {
            }
            return false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
