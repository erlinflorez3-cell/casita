package com.google.android.gms.internal.auth;

import com.google.firebase.FirebaseError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhz implements zzhx {
    public static final zzdc zza;
    public static final zzdc zzb;
    public static final zzdc zzc;
    public static final zzdc zzd;
    public static final zzdc zze;
    public static final zzdc zzf;
    public static final zzdc zzg;
    public static final zzdc zzh;
    public static final zzdc zzi;
    public static final zzdc zzj;
    public static final zzdc zzk;
    public static final zzdc zzl;
    public static final zzdc zzm;

    static {
        zzcz zzczVarZza = new zzcz(zzcr.zza(Jg.Wd("MD!-F\tx,\u0010t|\u000bg9\u0007n(~7,\"b|{nI\r^!\u000eL5\n]D", (short) (OY.Xd() ^ 5337), (short) (OY.Xd() ^ FirebaseError.ERROR_INVALID_API_KEY)))).zzb().zza();
        short sXd = (short) (ZN.Xd() ^ 20161);
        short sXd2 = (short) (ZN.Xd() ^ 19640);
        int[] iArr = new int["zUMvo\u001fctx9L1RNf9<\u0012\\/n';XbR\fH;n\u0005!08p\u0002o_\u0010.q:M=n?XJ_W5R <B\n".length()];
        QB qb = new QB("zUMvo\u001fctx9L1RNf9<\u0012\\/n';XbR\fH;n\u0005!08p\u0002o_\u0010.q:M=n?XJ_W5R <B\n");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        zza = zzczVarZza.zzc(new String(iArr, 0, i2), 0.0d);
        zzb = zzczVarZza.zze(C1626yg.Ud("|\\a-&2Zao,fw{cr/Q=>}1\u0017X\u0006RmsfJ[G^\u0003?\u007f\rU\u001c\u001fgNG 5\u001c\u0001\ti\u0002|5Gyg", (short) (OY.Xd() ^ 28428), (short) (OY.Xd() ^ 29955)), true);
        zzc = zzczVarZza.zzd(Ig.wd("vEbf\"@\u001a$,\u007f\u0003\u001cNU8]%\u0017a7{`\u0005\u0002\u001c\u00073}\u001d>4\u0013\bW\u000b2#rSof:~\u0003\u00173,RS", (short) (C1607wl.Xd() ^ 5464)), 20L);
        zzd = zzczVarZza.zzd(EO.Od("P}z>I\u000b5E\u0001cf?\r\u0014\u0013o\n\u001cU\u001fL\u000epnQ\u001c\u00044)j\u0010,Ap", (short) (C1633zX.Xd() ^ (-8311))), 0L);
        String strQd = C1561oA.Qd("qn|[upiqTff`aqkmYXZceX_XVP`PQXMRO\\", (short) (OY.Xd() ^ 17892));
        String strZd = C1593ug.zd("(N5RK\u001c\u001baFE$[T_,dO9,*SQ0g^U4nDkEng87}c<D\u0003g@\b|]\u007fY\no^a\u000fzql\u0012vva\u0018\u0005\u001cX\u0019\u007f}}X\u000b\u0002`\u001b\u0011&\u001f\u0019\u000bdl)\u0002$\u001c/\u001cl 0\u0018\u0012t)$0\u0016>(x44\u00168\u0012D1\u0017\u001dF4**O9\t\u001eG;2\u0011K", (short) (C1580rY.Xd() ^ (-26895)), (short) (C1580rY.Xd() ^ (-5707)));
        short sXd3 = (short) (C1580rY.Xd() ^ (-8072));
        int[] iArr2 = new int["\u0001\r\u0002\u000f\u000b\u0004}F\r\u000b~\u0001ATr\u0004tDA".length()];
        QB qb2 = new QB("\u0001\r\u0002\u000f\u000b\u0004}F\r\u000b~\u0001ATr\u0004tDA");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr2, 0, i3));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.Kd("WOeQ\u001f^Tb\\$Jlkcic", (short) (C1607wl.Xd() ^ 21628)));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {strZd, 3};
            Method declaredMethod = cls.getDeclaredMethod(Wg.Zd("2\u0010gp?\u0019", (short) (ZN.Xd() ^ 20769), (short) (ZN.Xd() ^ 28662)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                zze = zzczVarZza.zzf(strQd, zzhs.zzp((byte[]) declaredMethod.invoke(null, objArr)), zzhy.zza);
                zzf = zzczVarZza.zze(C1561oA.Xd("|{\fl\t\u0006\u0001\u000bo\u0004\u0006\u0002\u0005\u0017\u0013\u0017\u0005\u0006\u000b\u0011\u0013\u0018\u0011\u001f\u000f\u000e\u0017\u0016&\u0012($!\u001c&\u0018\u001f1+)4$$", (short) (FB.Xd() ^ 29672)), true);
                zzg = zzczVarZza.zzd(Wg.vd("! ,\r%\"\u0019#\u0014(&\"!3+/\t\n\u000b\u0015\u000b\b\u0016\u0004&\"\u001b\u0016\u001c\u000e \u0016G@GNJ6G:ERNEQ", (short) (Od.Xd() ^ (-9604))), 20L);
                zzh = zzczVarZza.zzd(Qg.kd("\u0001}\fj\u0005\u007fx\u0001cuuop\u0001z|hgkkkexnu_s_pgZnbe\\ejhReVS^\\Q_", (short) (C1607wl.Xd() ^ 26374), (short) (C1607wl.Xd() ^ 23062)), 20L);
                short sXd4 = (short) (C1607wl.Xd() ^ 3734);
                short sXd5 = (short) (C1607wl.Xd() ^ 31935);
                int[] iArr3 = new int["\u001b\u0018&\u0005\u001f\u001a\u0013\u001b}\u0010\u0010\n\u000b\u001b\u0015\u0017\u0003\u0002\t\u0002\u0015\u000b|}~}\t\u000e\u0006\u000b\tst\u0003zot\u0005|x\u0002om".length()];
                QB qb3 = new QB("\u001b\u0018&\u0005\u001f\u001a\u0013\u001b}\u0010\u0010\n\u000b\u001b\u0015\u0017\u0003\u0002\t\u0002\u0015\u000b|}~}\t\u000e\u0006\u000b\tst\u0003zot\u0005|x\u0002om");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
                    i4++;
                }
                zzi = zzczVarZza.zze(new String(iArr3, 0, i4), false);
                zzj = zzczVarZza.zze(C1561oA.ud("\\YgF`[T\\?QQKL\\VXDCJCVL>RLG@H89G?49IA=F42", (short) (FB.Xd() ^ 8091)), false);
                short sXd6 = (short) (OY.Xd() ^ 26381);
                int[] iArr4 = new int[".+=\u001c2-*2!371.><>65@=G1ICJCO?OCJA\u0016\u001b\u001d\u0007\u0016\u0007\b\u0013\u001d\u0012$".length()];
                QB qb4 = new QB(".+=\u001c2-*2!371.><>65@=G1ICJCO?OCJA\u0016\u001b\u001d\u0007\u0016\u0007\b\u0013\u001d\u0012$");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd6 ^ i5));
                    i5++;
                }
                zzk = zzczVarZza.zzd(new String(iArr4, 0, i5), 120L);
                zzl = zzczVarZza.zze(C1561oA.Yd("dcsTpmhrWkmil~z~lmv}\u0005qtwx\u0006\r\u0007\u000ey|\u0012\u0012\u0007\u0005\u000f\u0016\f\u0007\u0006\u001a\u0016\u001a\b\u000f!\u001b\u0019$\u0014\u0014", (short) (FB.Xd() ^ 20785)), true);
                short sXd7 = (short) (ZN.Xd() ^ 21143);
                short sXd8 = (short) (ZN.Xd() ^ 12247);
                int[] iArr5 = new int["_^nOkhcmRfhdgyuyghqx\u007flors\u0001\b\u0002\ttw\r\r\u0002\u007f\n\u0011\u0007\u0002\u0001\u0015\u0011\u0015\u0003\u0018\u0007\u0014\u0018\u0015\u000f\n\u001c\u0012 \u0012\u0015\u001f&\u0014\u001b\u001a".length()];
                QB qb5 = new QB("_^nOkhcmRfhdgyuyghqx\u007flors\u0001\b\u0002\ttw\r\r\u0002\u007f\n\u0011\u0007\u0002\u0001\u0015\u0011\u0015\u0003\u0018\u0007\u0014\u0018\u0015\u000f\n\u001c\u0012 \u0012\u0015\u001f&\u0014\u001b\u001a");
                int i6 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i6] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd7 + i6)) + sXd8);
                    i6++;
                }
                zzm = zzczVarZza.zzc(new String(iArr5, 0, i6), 0.0d);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhx
    public final zzhs zza() {
        return (zzhs) zze.zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzhx
    public final boolean zzb() {
        return ((Boolean) zzi.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.auth.zzhx
    public final boolean zzc() {
        return ((Boolean) zzj.zzb()).booleanValue();
    }
}
