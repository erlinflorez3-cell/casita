package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.stats.WakeLock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfk {
    static final Object zza = new Object();
    static WakeLock zzb = null;
    static Boolean zzc = null;

    public static boolean zzb(Context context) throws Throwable {
        Preconditions.checkNotNull(context);
        Boolean bool = zzc;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zZzi = zzfu.zzi(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        zzc = Boolean.valueOf(zZzi);
        return zZzi;
    }

    public final void zza(Context context, Intent intent) {
        zzbx zzbxVarZzg = zzbx.zzg(context);
        zzfd zzfdVarZzm = zzbxVarZzg.zzm();
        if (intent == null) {
            zzfdVarZzm.zzQ(C1561oA.Xd("=k_kyukfwWkjmr\u0001p~-qp|}ww4\r\u007f\f\u00019\t\u0011\t\n>\t\u000f\u0016\b\u0012\u0019", (short) (C1580rY.Xd() ^ (-28848))));
            return;
        }
        String action = intent.getAction();
        zzbxVarZzg.zzj();
        short sXd = (short) (OY.Xd() ^ 16663);
        int[] iArr = new int["8\\QP\\\u00113aUaoka\\mMa`chvft#ktz".length()];
        QB qb = new QB("8\\QP\\\u00113aUaoka\\mMa`chvft#ktz");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        zzfdVarZzm.zzO(new String(iArr, 0, i2), action);
        if (Qg.kd("JUR\u0012JQPGKC\u000b=I>KG@:\u0003;@E~1=/9E?3,;t\u0007\u0013\u0005\u000f\u001b\u0015\t\u0002\u0011\u001c\u007f\u0004\r\tx\u000bx|", (short) (Od.Xd() ^ (-31019)), (short) (Od.Xd() ^ (-13672))).equals(action)) {
            boolean zZzh = zzfp.zzh(context);
            Intent intent2 = new Intent(hg.Vd(";FC\u0003;BA8<4{.:/<81+s,16o\". *60$\u001d,ew\u0004u\u007f\f\u0006yr\u0002\rpt}yi{im", (short) (Od.Xd() ^ (-25345)), (short) (Od.Xd() ^ (-31086))));
            intent2.setComponent(new ComponentName(context, C1561oA.ud("_jg'_fe\\`X R^S`\\UO\u0018PUZ\u0014FRDNZTHAP\n\u001cH:DPJ>7F%6BE701", (short) (C1607wl.Xd() ^ 24125))));
            short sXd2 = (short) (Od.Xd() ^ (-8453));
            int[] iArr2 = new int["(50q(1.')#h\u001d'\u001e)'>:\u0001;>E|1;/7E=3*;Rfpdlzrh_py_alfX\txz".length()];
            QB qb2 = new QB("(50q(1.')#h\u001d'\u001e)'>:\u0001;>E|1;/7E=3*;Rfpdlzrh_py_alfX\txz");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                i3++;
            }
            intent2.setAction(new String(iArr2, 0, i3));
            synchronized (zza) {
                Class<?> cls = Class.forName(C1561oA.Yd("v\u0005{\u000b\t\u0004\u007fJ\u0001\u000e\u000e\u0015\u0007\u0011\u0018Rh\u0016\u0016\u001d\u000f# ", (short) (C1499aX.Xd() ^ (-30195))));
                Class<?>[] clsArr = new Class[1];
                short sXd3 = (short) (C1607wl.Xd() ^ 11114);
                short sXd4 = (short) (C1607wl.Xd() ^ 16327);
                int[] iArr3 = new int["\u000e\u001c\u0013\" \u001b\u0017a\u0018%%,\u001e(/i\u0006,3%/6".length()];
                QB qb3 = new QB("\u000e\u001c\u0013\" \u001b\u0017a\u0018%%,\u001e(/i\u0006,3%/6");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) + sXd4);
                    i4++;
                }
                clsArr[0] = Class.forName(new String(iArr3, 0, i4));
                Object[] objArr = {intent2};
                Method method = cls.getMethod(Jg.Wd("1u\u001ej,>\u000bW\u0017M\u0007D", (short) (FB.Xd() ^ 4851), (short) (FB.Xd() ^ 18616)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr);
                    if (zZzh) {
                        try {
                            if (zzb == null) {
                                WakeLock wakeLock = new WakeLock(context, 1, ZO.xd("2u7rZ={/\u000b\u0010k1H*\\tL\u0010", (short) (OY.Xd() ^ 1724), (short) (OY.Xd() ^ 942)));
                                zzb = wakeLock;
                                wakeLock.setReferenceCounted(false);
                            }
                            zzb.acquire(1000L);
                        } catch (SecurityException unused) {
                            zzfdVarZzm.zzQ(C1626yg.Ud("\"\\\u001ccR(\u0018!\"v\u0006\u0017\u0013B5\u001e$fNi\u0004'a\u001bEp@\u007fwjvy$i\"f8\u0001q'X`+\u001e!W{z+Y\u0013\u0014GsD`\u0019k\u0004\u0004H/_{\u001fAo\u0017\u000b\u0010#\u0004CzO/t^$\u0005F\u0018l#RT\u001e\u0010\u001aQ\u0014\bILWZnO\u0004BdF{\b0Cy\u0006F\u0018C[]\u000e{!D!\u0013R_a[a\u001cS7f\u000eR\u0014K\bVi'\u00164$B\u001e[>HC\u0014p)\u0016.`8AI:n\r,=\u0012Y", (short) (Od.Xd() ^ (-7414)), (short) (Od.Xd() ^ (-6017))));
                        }
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }
}
