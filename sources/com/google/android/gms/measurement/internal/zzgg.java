package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.compose.material3.internal.CalendarModelKt;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.measurement.internal.zzje;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;
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
import yg.InterfaceC1492Gx;
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
public final class zzgg extends zzh {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private long zze;
    private long zzf;
    private List<String> zzg;
    private String zzh;
    private int zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private long zzm;
    private String zzn;

    zzgg(zzhy zzhyVar, long j2) {
        super(zzhyVar);
        this.zzm = 0L;
        this.zzn = null;
        this.zzf = j2;
    }

    private final String zzah() throws Throwable {
        if (zzpz.zza() && zze().zza(zzbh.zzbr)) {
            zzj().zzp().zza(Wg.vd(".T[JP[QQ\u0002,)%\u0006MSWyO=LRR\n", (short) (OY.Xd() ^ 28461)));
            return null;
        }
        try {
            Context contextZza = zza();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("T`Ub^WQ\u001aNYW\\LTY\u0012&QOTDVQ", (short) (ZN.Xd() ^ 3212), (short) (ZN.Xd() ^ 10327))).getMethod(hg.Vd("nkyGoctsKm^``l", (short) (ZN.Xd() ^ 26871), (short) (ZN.Xd() ^ 28758)), new Class[0]);
            try {
                method.setAccessible(true);
                Class<?> clsLoadClass = ((ClassLoader) method.invoke(contextZza, objArr)).loadClass(C1561oA.ud("\u0010\u001b\u0018W\u0010\u0017\u0016\r\u0011\tP\b\n\u0012\u0004\u007f}\u000f\u007fGy\u0006w\u0002\u000e\b{t\u0004=Tv~plj{lGseo{uibq", (short) (C1580rY.Xd() ^ (-12826))));
                if (clsLoadClass == null) {
                    return null;
                }
                short sXd = (short) (OY.Xd() ^ ExifDirectoryBase.TAG_PAGE_NUMBER);
                int[] iArr = new int["<9K\u001fGKO;K?D".length()];
                QB qb = new QB("<9K\u001fGKO;K?D");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                try {
                    Object objInvoke = clsLoadClass.getDeclaredMethod(new String(iArr, 0, i2), Context.class).invoke(null, zza());
                    if (objInvoke == null) {
                        return null;
                    }
                    try {
                        return (String) clsLoadClass.getDeclaredMethod(C1561oA.Yd("\u0014\u0013#u\u001a$\u0018\u0016\u0016)\u001c\u0001'-/\u001d+!$\t%", (short) (ZN.Xd() ^ 15327)), new Class[0]).invoke(objInvoke, new Object[0]);
                    } catch (Exception unused) {
                        zzj().zzv().zza(Xg.qd("@\\eicc uq#vjzyqn\u0001p,Sw\u0002uss\u0007y5_\u0006\f\u000e{\n\u007f\u0003>h\u0005", (short) (C1607wl.Xd() ^ 17352), (short) (C1607wl.Xd() ^ 30129)));
                        return null;
                    }
                } catch (Exception unused2) {
                    zzj().zzw().zza(Jg.Wd("nAAJ[P\u0014?1H3\u001d6yy\u0005NKuVCH]g_Qi\u001e(.B\u0015\u007fa\t,|XU`eXE\u001e", (short) (C1607wl.Xd() ^ 30741), (short) (C1607wl.Xd() ^ 7812)));
                    return null;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    final zzo zza(String str) throws Throwable {
        long jZzm;
        String str2;
        int iZzc;
        zzt();
        String strZzad = zzad();
        String strZzae = zzae();
        zzu();
        String str3 = this.zzb;
        long jZzab = zzab();
        zzu();
        Preconditions.checkNotNull(this.zzd);
        String str4 = this.zzd;
        zzu();
        zzt();
        if (this.zze == 0) {
            zzos zzosVarZzt = this.zzu.zzt();
            Context contextZza = zza();
            Context contextZza2 = zza();
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("W?Oc\u00153\u0017f*dN\u001e'vdm8\u001e?FM\u001e\n", (short) (C1580rY.Xd() ^ (-3874)), (short) (C1580rY.Xd() ^ (-16868)))).getMethod(C1626yg.Ud("-C\u001cQ/u\u0005\u0003CdRS0W", (short) (ZN.Xd() ^ 23590), (short) (ZN.Xd() ^ 4038)), new Class[0]);
            try {
                method.setAccessible(true);
                this.zze = zzosVarZzt.zza(contextZza, (String) method.invoke(contextZza2, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        long j2 = this.zze;
        boolean zZzac = this.zzu.zzac();
        boolean z2 = !zzk().zzm;
        zzt();
        String strZzah = !this.zzu.zzac() ? null : zzah();
        zzhy zzhyVar = this.zzu;
        long jZza = zzhyVar.zzn().zzc.zza();
        long jMin = jZza == 0 ? zzhyVar.zza : Math.min(zzhyVar.zza, jZza);
        int iZzaa = zzaa();
        boolean zZzv = zze().zzv();
        zzha zzhaVarZzk = zzk();
        zzhaVarZzk.zzt();
        boolean z3 = zzhaVarZzk.zzg().getBoolean(Ig.wd("~.]|\u001a\\3\u0013R`o\u0005`c6\u000eBPdpAbDA4\u0011d%\u0002", (short) (OY.Xd() ^ 19322)), false);
        String strZzac = zzac();
        zzag zzagVarZze = zze();
        String strOd = EO.Od(">\u0015X7]+7[+psd.'\u001f\u0018XE\u0001g%g2@\u001e\u0012\u00026\u0019u/\u0018|`\u0004Ah\u0004\u001d\u0010|2u\u0007RW\u0012Fu\r\u0013=\u0015\u00170mx", (short) (C1499aX.Xd() ^ (-32141)));
        Boolean boolValueOf = zzagVarZze.zze(strOd) == null ? null : Boolean.valueOf(!r1.booleanValue());
        long j3 = this.zzf;
        List<String> list = this.zzg;
        String strZzf = zzk().zzo().zzf();
        if (this.zzh == null) {
            this.zzh = zzq().zzp();
        }
        String str5 = this.zzh;
        if (com.google.android.gms.internal.measurement.zznm.zza() && zze().zza(zzbh.zzcx) && !zzk().zzo().zza(zzje.zza.ANALYTICS_STORAGE)) {
            jZzm = 0;
            str2 = null;
        } else {
            zzt();
            jZzm = 0;
            if (this.zzm != 0) {
                long jCurrentTimeMillis = zzb().currentTimeMillis() - this.zzm;
                if (this.zzl != null && jCurrentTimeMillis > CalendarModelKt.MillisecondsIn24Hours && this.zzn == null) {
                    zzag();
                }
            }
            if (this.zzl == null) {
                zzag();
            }
            str2 = this.zzl;
        }
        Boolean boolZze = zze().zze(C1561oA.Qd("cji`d\\UVbT^jdXQ`K^Q]UF[UPRCE?DL>>G?=", (short) (C1499aX.Xd() ^ (-31502))));
        boolean zBooleanValue = boolZze == null ? false : boolZze.booleanValue();
        long jZzc = zzq().zzc(zzad());
        int iZza = zzk().zzo().zza();
        String strZzf2 = zzk().zzn().zzf();
        if (zzpn.zza() && zze().zza(zzbh.zzci)) {
            zzq();
            iZzc = zzos.zzc();
        } else {
            iZzc = 0;
        }
        if (zzpn.zza() && zze().zza(zzbh.zzci)) {
            jZzm = zzq().zzm();
        }
        return new zzo(strZzad, strZzae, str3, jZzab, str4, 106000L, j2, str, zZzac, z2, strZzah, 0L, jMin, iZzaa, zZzv, z3, strZzac, boolValueOf, j3, list, (String) null, strZzf, str5, str2, zBooleanValue, jZzc, iZza, strZzf2, iZzc, jZzm, zze().zzu(), new zzf(zze().zzc(strOd, true)).zzb());
    }

    final int zzaa() {
        zzu();
        return this.zzi;
    }

    final int zzab() {
        zzu();
        return this.zzc;
    }

    final String zzac() {
        zzu();
        return this.zzk;
    }

    final String zzad() {
        zzu();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final String zzae() {
        zzt();
        zzu();
        Preconditions.checkNotNull(this.zzj);
        return this.zzj;
    }

    final List<String> zzaf() {
        return this.zzg;
    }

    final void zzag() {
        String str;
        String strVd;
        zzt();
        if (zzk().zzo().zza(zzje.zza.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            SecureRandom secureRandomZzv = zzq().zzv();
            Object[] objArr = {bArr};
            Method method = Class.forName(C1561oA.od("-#7!l1\"\u001f0,\",0c\b\u0019\u0016'#\u0015\u0001\u000f\u001b\u0010\u001a\u0017", (short) (ZN.Xd() ^ 19846))).getMethod(C1561oA.Kd("%\u001d1.|51#2", (short) (ZN.Xd() ^ 18907)), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandomZzv, objArr);
                str = String.format(Locale.US, Wg.Zd("ts\u00120\u0012", (short) (C1633zX.Xd() ^ (-12467)), (short) (C1633zX.Xd() ^ (-23378))), new BigInteger(1, bArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            zzj().zzc().zza(C1593ug.zd(" NBN\\XNIZ\b<^Z^NUT\u0010TaagZdk\u0018bm\u001bjlr\u001fgscqxjj", (short) (ZN.Xd() ^ 11563), (short) (ZN.Xd() ^ 28233)));
            str = null;
        }
        zzgq zzgqVarZzc = zzj().zzc();
        if (str == null) {
            short sXd = (short) (FB.Xd() ^ 4244);
            int[] iArr = new int["\u0017\u001f\u0017\u0018".length()];
            QB qb = new QB("\u0017\u001f\u0017\u0018");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            strVd = new String(iArr, 0, i2);
        } else {
            strVd = Wg.vd("\u0016\u0018\u001aF\u0012\u001a\u000e\u000f", (short) (C1499aX.Xd() ^ (-21603)));
        }
        zzgqVarZzc.zza(String.format(Qg.kd("$6C4BA591h;,98-20`33'1\u001f##'\u001fV*$\u001f\u0018 P$\u001eMQ\u001f", (short) (C1499aX.Xd() ^ (-14596)), (short) (C1499aX.Xd() ^ (-3673))), strVd));
        this.zzl = str;
        this.zzm = zzb().currentTimeMillis();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    final boolean zzb(String str) {
        String str2 = this.zzn;
        boolean z2 = (str2 == null || str2.equals(str)) ? false : true;
        this.zzn = str;
        return z2;
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgf zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzjq zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzlj zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzls zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zznb zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.measurement.internal.zzh
    @InterfaceC1492Gx
    @EnsuresNonNull({"l6hX\u0013", "l6hb#yX\u001b", "l6h]\u0010wK", "r3hP\u001fz/\u001a", "r'9\u007f\u001fSJ"})
    protected final void zzx() throws Throwable {
        String str;
        Context contextZza = zza();
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("1=2?;4.v+649)16n\u0003.,1!3.", (short) (C1633zX.Xd() ^ (-26426)), (short) (C1633zX.Xd() ^ (-5263)))).getMethod(C1561oA.ud("QN\\7GHODIF.@KB", (short) (Od.Xd() ^ (-1556))), new Class[0]);
        try {
            method.setAccessible(true);
            String str2 = (String) method.invoke(contextZza, objArr);
            Context contextZza2 = zza();
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.yd("\u001f+ -1*$l)427/7<t\u0011<:?7ID", (short) (C1607wl.Xd() ^ 3801))).getMethod(C1561oA.Yd("on~[mpypwv_t\u0003v}|\u000b", (short) (OY.Xd() ^ 4639)), new Class[0]);
            try {
                method2.setAccessible(true);
                PackageManager packageManager = (PackageManager) method2.invoke(contextZza2, objArr2);
                String strQd = Xg.qd("KECGIRJ", (short) (FB.Xd() ^ 20897), (short) (FB.Xd() ^ 23523));
                String strWd = Jg.Wd("\u001dR\u0005q(\u0018@", (short) (C1607wl.Xd() ^ 15667), (short) (C1607wl.Xd() ^ 25365));
                int i2 = Integer.MIN_VALUE;
                if (packageManager == null) {
                    zzj().zzg().zza(ZO.xd("qcQT\u001a>W=\u0007\u0018'\u0007s#y/V\u0016\u0003&\r\u0001w'\u001a\"\trEJt9@81PBZa\u0012\tzE\baKF\u000e\u0007\u000e\u00117cQ\nfb\u0013\f}$-QC\u007f{<\n,\u001b\u000bK\u0011e[", (short) (Od.Xd() ^ (-3711)), (short) (Od.Xd() ^ (-32732))), zzgo.zza(str2));
                } else {
                    try {
                        Class<?> cls = Class.forName(C1626yg.Ud("\\qLQ\u0001a\u0004Z\u0003_}YHcC\u0012YBj\u001a]]J*3&`~;T;(d", (short) (OY.Xd() ^ 10647), (short) (OY.Xd() ^ 10265)));
                        Class<?>[] clsArr = new Class[1];
                        clsArr[0] = Class.forName(Ig.wd("@\tm6\u0019\u001b2D\u0013/PU!\u0018zW", (short) (ZN.Xd() ^ 19099)));
                        Object[] objArr3 = {str2};
                        Method method3 = cls.getMethod(EO.Od("6f\u0018\u0011e/\u0018U33By\u0006\t;i\u0004\u00106K!Uw", (short) (C1499aX.Xd() ^ (-21857))), clsArr);
                        try {
                            method3.setAccessible(true);
                            strQd = (String) method3.invoke(packageManager, objArr3);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (IllegalArgumentException unused) {
                        zzgq zzgqVarZzg = zzj().zzg();
                        short sXd = (short) (FB.Xd() ^ 3150);
                        int[] iArr = new int["t! \u001c\u001eJ\u001c\u000e\u001c\u0019\u000f\n\u001a\f\u0010\b?\u007f\u000e\r;\u0004\b\f\fw\u0002\u0001x\u00051\u0001pqxmro)vhsj2#cqpHb".length()];
                        QB qb = new QB("t! \u001c\u001eJ\u001c\u000e\u001c\u0019\u000f\n\u001a\f\u0010\b?\u007f\u000e\r;\u0004\b\f\fw\u0002\u0001x\u00051\u0001pqxmro)vhsj2#cqpHb");
                        int i3 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
                            i3++;
                        }
                        zzgqVarZzg.zza(new String(iArr, 0, i3), zzgo.zza(str2));
                    }
                    if (strQd == null) {
                        strQd = C1593ug.zd("+ .6#/#.4:<*67", (short) (C1499aX.Xd() ^ (-4603)), (short) (C1499aX.Xd() ^ (-21482)));
                    } else if (C1561oA.od("4?<{.:/<81+s;)1&*.&", (short) (C1580rY.Xd() ^ (-26224))).equals(strQd)) {
                        strQd = "";
                    }
                    try {
                        Context contextZza3 = zza();
                        Object[] objArr4 = new Object[0];
                        Method method4 = Class.forName(C1561oA.Kd("\u0016$\u001b*(#\u001fi --4&07q\b55<.B?", (short) (C1607wl.Xd() ^ 30602))).getMethod(Wg.Zd("m\r<\t:]VmdBL\u0010}\u0016", (short) (ZN.Xd() ^ 11816), (short) (ZN.Xd() ^ 11515)), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            String str3 = (String) method4.invoke(contextZza3, objArr4);
                            short sXd2 = (short) (C1633zX.Xd() ^ (-5941));
                            int[] iArr2 = new int["IWN][VR\u001dS``gYcj%hf(K]`i`gfOdrfmlz".length()];
                            QB qb2 = new QB("IWN][VR\u001dS``gYcj%hf(K]`i`gfOdrfmlz");
                            int i4 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i4));
                                i4++;
                            }
                            Class<?> cls2 = Class.forName(new String(iArr2, 0, i4));
                            Class<?>[] clsArr2 = new Class[2];
                            clsArr2[0] = Class.forName(Wg.vd("#\u001b-\u0019j*\u001c*(o\u001247/1+", (short) (C1580rY.Xd() ^ (-4388))));
                            clsArr2[1] = Integer.TYPE;
                            Object[] objArr5 = {str3, 0};
                            Method method5 = cls2.getMethod(Qg.kd("C@N)9:A6;8\u001b?6>", (short) (FB.Xd() ^ 22561), (short) (FB.Xd() ^ 7755)), clsArr2);
                            try {
                                method5.setAccessible(true);
                                PackageInfo packageInfo = (PackageInfo) method5.invoke(packageManager, objArr5);
                                if (packageInfo != null) {
                                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                                    Class<?> cls3 = Class.forName(hg.Vd("\u000b\u0017\f\u0019\u0015\u000e\bP\u0005\u0010\u000e\u0013\u0003\u000b\u0010H\n\u0006Efvw~sxu\\o{mro{", (short) (FB.Xd() ^ 18962), (short) (FB.Xd() ^ 17701)));
                                    Class<?>[] clsArr3 = new Class[1];
                                    clsArr3[0] = Class.forName(C1561oA.ud("\b\u0014\t\u0016\u0012\u000b\u0005M\u0002\r\u000b\u0010\u007f\b\rE\u0007\u0003BT\u0003\u0002|xqn\u0001tywQult", (short) (C1580rY.Xd() ^ (-15205))));
                                    Object[] objArr6 = {applicationInfo};
                                    Method method6 = cls3.getMethod(C1561oA.yd("KHZ&PONJOLbVWU6J68B", (short) (C1499aX.Xd() ^ (-16391))), clsArr3);
                                    try {
                                        method6.setAccessible(true);
                                        CharSequence charSequence = (CharSequence) method6.invoke(packageManager, objArr6);
                                        String string = !TextUtils.isEmpty(charSequence) ? charSequence.toString() : strWd;
                                        try {
                                            strWd = packageInfo.versionName;
                                            i2 = packageInfo.versionCode;
                                        } catch (PackageManager.NameNotFoundException unused2) {
                                            str = strWd;
                                            strWd = string;
                                            zzj().zzg().zza(C1561oA.Yd("^\r\u000e\f\u0010>\u0012\u0006\u0016\u0015\r\n\u001c\u0010\u0016\u0010I\u001b\r\u0010\u0019\u0010\u0017\u0016Q\u001c\"\u001b%dW\u001a*+\u0005!i^!12\u0011%2+", (short) (Od.Xd() ^ (-21185))), zzgo.zza(str2), strWd);
                                            strWd = str;
                                        }
                                    } catch (InvocationTargetException e3) {
                                        throw e3.getCause();
                                    }
                                }
                            } catch (InvocationTargetException e4) {
                                throw e4.getCause();
                            }
                        } catch (InvocationTargetException e5) {
                            throw e5.getCause();
                        }
                    } catch (PackageManager.NameNotFoundException unused3) {
                        str = strWd;
                    }
                }
                this.zza = str2;
                this.zzd = strQd;
                this.zzb = strWd;
                this.zzc = i2;
                this.zze = 0L;
                byte b2 = !TextUtils.isEmpty(this.zzu.zzu()) && Xg.qd("jw", (short) (C1633zX.Xd() ^ (-19299)), (short) (C1633zX.Xd() ^ (-4469))).equals(this.zzu.zzv());
                int iZzc = this.zzu.zzc();
                switch (iZzc) {
                    case 0:
                        zzj().zzp().zza(C1561oA.Xd("\u0016FGwF?<ORPDMFPW\u0004HUSTNM_U\\\\\u000fU_SU`ZZ", (short) (C1580rY.Xd() ^ (-27467))));
                        break;
                    case 1:
                        zzj().zzo().zza(Wg.Zd("\u0014uP@W fH%R i*\u0006SIn)uR\u0014b2eZ\u0004Uhy=\u0010}=c(EK\u0012v$\nR\u0011|", (short) (OY.Xd() ^ 13008), (short) (OY.Xd() ^ 22011)));
                        break;
                    case 2:
                        zzj().zzp().zza(C1561oA.Kd(";kl\u001dkdatwuirku|)npmp\u0003x\u0007r\u0007xx5\r\u0001y9\u000f\u0004\u0002=\b\u000e\n\u0016B\u0014\u0006\u0018\b\u0015\u000e\u001e\u0010\u001e ", (short) (FB.Xd() ^ 4912)));
                        break;
                    case 3:
                        zzj().zzo().zza(C1561oA.od("\t76d1(#451#*!).X\u001c )\u0016\u0016\u001f\u0017\u0015O\u0011'L\u001f\u0010\u001ei\u0016\b\u0012\u001e\u0018\f\u0005\u0014b\u000e\n\t\u0001}\u000e\u0002\u0007\u0005Z\u0003tt}us6smw}n1", (short) (C1633zX.Xd() ^ (-21647))));
                        break;
                    case 4:
                        zzgq zzgqVarZzo = zzj().zzo();
                        short sXd3 = (short) (C1633zX.Xd() ^ (-24569));
                        short sXd4 = (short) (C1633zX.Xd() ^ (-11472));
                        int[] iArr3 = new int["\u0014DEuD=:MPNBKDNU\u0002GMXGITNN\u000bbVO\u000fdYW\u0013aVd`^^mo".length()];
                        QB qb3 = new QB("\u0014DEuD=:MPNBKDNU\u0002GMXGITNN\u000bbVO\u000fdYW\u0013aVd`^^mo");
                        int i5 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i5] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i5)) - sXd4);
                            i5++;
                        }
                        zzgqVarZzo.zza(new String(iArr3, 0, i5));
                        break;
                    case 5:
                        zzj().zzp().zza(C1561oA.Qd("Jxw&riduvrdkbjo\u001a]ajWW`XV\u0011fXO\r`SO\tQUOY\u0004SCSALCQAMM", (short) (C1633zX.Xd() ^ (-32000))));
                        break;
                    case 6:
                        zzj().zzv().zza(EO.Od("hj<G\u00049U\u0007D1\"\f3Ft=GF\u001a\u0018d1`Ge\u0007',!EM+\u0016&%n\b-'3I\u001b<~\\mlK\u0007[9\n)6@Z^p}\u000f~f\u001cnk\tR\tYS@C\u0013F\nJRQZpZ\u000f_Zjah\u000e\u0006T6V3y\u001c4ni6/\tLKh\u0014\u00157OL$G=x[(nwmO^zp=%\u0006h\u000b\r!\t\u0002\u0011\f\u0004f4<X}W1\bXbI\u000e`\u000f\u000e\u001b`x", (short) (Od.Xd() ^ (-23268))));
                        break;
                    case 7:
                        zzj().zzo().zza(Ig.wd("#\u00020\bF\u0019hS\u001e;(:bygup\u0010B8q4\u000b\u0002:L\"`x@\be\f.*o7\u001a$I\u0012wW^f:\u007fL^n\u0016Z#!E6\b \\n/Y*", (short) (C1607wl.Xd() ^ 30287)));
                        break;
                    case 8:
                        zzj().zzo().zza(C1626yg.Ud("\u0013\u0012.\u000f;Z\u0007(N9Q\u0003\u0017\u0018.L1|\u0005!\u000fU4hkqX\u001eh\u0005s\u007fz\u0017\u0016I\u001drC}U3)LIe\u0013\u000eT{\u0006E?m", (short) (OY.Xd() ^ 5173), (short) (OY.Xd() ^ 1968)));
                        break;
                    default:
                        zzj().zzo().zza(Jg.Wd("\u0014o\u0017RQu9x\u000b3N$L`\u0010g{-@Z\u000bb\u0004\u000e", (short) (FB.Xd() ^ 26481), (short) (FB.Xd() ^ 11286)));
                        zzj().zzn().zza(ZO.xd("gM\u001b0`t$dbr*\"?m;k mK^Q9i\u000e$\u0002\u0002H\u001c7\u0017", (short) (C1499aX.Xd() ^ (-26382)), (short) (C1499aX.Xd() ^ (-7434))));
                        break;
                }
                boolean z2 = iZzc == 0;
                this.zzj = "";
                this.zzk = "";
                if (b2 != false) {
                    this.zzk = this.zzu.zzu();
                }
                try {
                    String strZza = new zzhs(zza(), this.zzu.zzx()).zza(Wg.vd("?FI@@856@?1:0", (short) (C1499aX.Xd() ^ (-15714))));
                    this.zzj = TextUtils.isEmpty(strZza) ? "" : strZza;
                    if (!TextUtils.isEmpty(strZza)) {
                        this.zzk = new zzhs(zza(), this.zzu.zzx()).zza(Qg.kd("\u001f!)*\u001c\u0018\u0019'&\u0014\u001d\u0017", (short) (C1633zX.Xd() ^ (-17120)), (short) (C1633zX.Xd() ^ (-14204))));
                    }
                    if (z2) {
                        zzj().zzp().zza(hg.Vd("v%$R\u001f\u0016\u0011\"#\u001f\u0011\u0018\u000f\u0017\u001cF\u000b\u0013\u0005\u0005\u000e\u0006\u0004>\u0004\f\u000e:z\t\b6\u0006uv}rwt:-szyptl&fts\"jd", (short) (C1633zX.Xd() ^ (-17250)), (short) (C1633zX.Xd() ^ (-11687))), this.zza, TextUtils.isEmpty(this.zzj) ? this.zzk : this.zzj);
                    }
                } catch (IllegalStateException e6) {
                    zzgq zzgqVarZzg2 = zzj().zzg();
                    short sXd5 = (short) (C1499aX.Xd() ^ (-12273));
                    int[] iArr4 = new int["Pn|jnnrj\"Honeia\u001b;ih\u0017?Y\u0014YSZ\\TR\rcT^Q\bL^HISVJOM\f|=KJ\"<".length()];
                    QB qb4 = new QB("Pn|jnnrj\"Honeia\u001b;ih\u0017?Y\u0014YSZ\\TR\rcT^Q\bL^HISVJOM\f|=KJ\"<");
                    int i6 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i6] = xuXd4.fK(sXd5 + i6 + xuXd4.CK(iKK4));
                        i6++;
                    }
                    zzgqVarZzg2.zza(new String(iArr4, 0, i6), zzgo.zza(str2), e6);
                }
                this.zzg = null;
                List<String> listZzg = zze().zzg(C1561oA.yd("\u000f\u001b\u0011\u001b+%\u001d\u0016\u0019R\u001b\b\u0010\u000e\u0018\u001411%#!&:($)+", (short) (C1499aX.Xd() ^ (-1659))));
                if (listZzg == null) {
                    this.zzg = listZzg;
                } else if (listZzg.isEmpty()) {
                    zzgq zzgqVarZzv = zzj().zzv();
                    short sXd6 = (short) (C1633zX.Xd() ^ (-26568));
                    int[] iArr5 = new int["DSYYa_jl^^\u001bascmt!nlwy&p{)ox|\u0002\b=0Zy\u0002\u0004\b\u007f\u0006\u007f".length()];
                    QB qb5 = new QB("DSYYa_jl^^\u001bascmt!nlwy&p{)ox|\u0002\b=0Zy\u0002\u0004\b\u007f\u0006\u007f");
                    int i7 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i7] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd6 + sXd6) + sXd6) + i7));
                        i7++;
                    }
                    zzgqVarZzv.zza(new String(iArr5, 0, i7));
                } else {
                    Iterator<String> it = listZzg.iterator();
                    while (it.hasNext()) {
                        if (!zzq().zzb(Xg.qd("\u0019\b\u000e\u000e\u0016\u0014\u001f!\u0013\u0013O\u0016(\u0018\")", (short) (C1499aX.Xd() ^ (-18879)), (short) (C1499aX.Xd() ^ (-19231))), it.next())) {
                        }
                    }
                    this.zzg = listZzg;
                }
                if (packageManager != null) {
                    this.zzi = InstantApps.isInstantApp(zza()) ? 1 : 0;
                } else {
                    this.zzi = 0;
                }
            } catch (InvocationTargetException e7) {
                throw e7.getCause();
            }
        } catch (InvocationTargetException e8) {
            throw e8.getCause();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzh
    protected final boolean zzz() {
        return true;
    }
}
