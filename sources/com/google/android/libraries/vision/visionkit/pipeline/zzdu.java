package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbeh;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbet;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhx;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbmz;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbsq;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbzk;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzfn;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzfw;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzgj;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzhs;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzik;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zziy;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzjb;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzjy;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzmd;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzmj;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdu extends zzbeh implements zzbft {
    private static final zzdu zzd;
    private zzby zzA;
    private zzbl zzB;
    private zzdc zzC;
    private zzec zzD;
    private boolean zzI;
    private int zzL;
    private int zzM;
    private zzbhx zzN;
    private boolean zzO;
    private boolean zzR;
    private zzdp zzS;
    private boolean zzT;
    private zzbmz zzU;
    private zzbmz zzV;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzae zzW;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbd zzX;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbg zzY;
    private zzfw zzZ;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzfb zzaa;
    private zzfn zzab;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzev zzac;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzce zzad;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzfh zzae;
    private int zzaf;
    private boolean zzag;
    private int zzah;
    private boolean zzai;
    private zzmj zzal;
    private boolean zzan;
    private int zze;
    private int zzf;
    private zzad zzi;
    private zzgj zzl;
    private zzbc zzo;
    private zzhs zzr;
    private zzer zzs;
    private zzbs zzt;
    private zzu zzu;
    private zzef zzv;
    private zzei zzw;
    private com.google.android.gms.internal.mlkit_vision_internal_vkp.zzay zzx;
    private boolean zzy;
    private zzjy zzz;
    private byte zzao = 2;
    private zzbet zzg = zzL();
    private zzbet zzh = zzL();
    private zzbet zzj = zzL();
    private zzbet zzk = zzL();
    private zzbet zzm = zzL();
    private zzbet zzn = zzL();
    private zzbet zzp = zzL();
    private zzbet zzq = zzL();
    private zzbet zzE = zzbel.zzL();
    private zzbet zzF = zzL();
    private zzbet zzG = zzL();
    private zzbet zzH = zzbel.zzL();
    private String zzJ = "";
    private int zzK = 1;
    private String zzP = "";
    private String zzQ = "";
    private String zzaj = "";
    private int zzak = 1;
    private String zzam = "";

    static {
        zzdu zzduVar = new zzdu();
        zzd = zzduVar;
        zzbel.zzR(zzdu.class, zzduVar);
    }

    private zzdu() {
    }

    public static zzdr zza() {
        return (zzdr) zzd.zzB();
    }

    static /* synthetic */ void zzd(zzdu zzduVar, zzbhx zzbhxVar) {
        zzduVar.zzN = zzbhxVar;
        int i2 = zzduVar.zze;
        zzduVar.zze = (i2 + 2097152) - (i2 & 2097152);
    }

    static /* synthetic */ void zze(zzdu zzduVar, String str) {
        int i2 = zzduVar.zze;
        zzduVar.zze = (i2 + 8388608) - (i2 & 8388608);
        zzduVar.zzP = str;
    }

    static /* synthetic */ void zzf(zzdu zzduVar, String str) {
        int i2 = zzduVar.zze;
        zzduVar.zze = (i2 + 16777216) - (i2 & 16777216);
        zzduVar.zzQ = str;
    }

    static /* synthetic */ void zzg(zzdu zzduVar, zziy zziyVar) {
        zziyVar.getClass();
        zzbet zzbetVar = zzduVar.zzg;
        if (!zzbetVar.zzc()) {
            zzduVar.zzg = zzbel.zzM(zzbetVar);
        }
        zzduVar.zzg.add(zziyVar);
    }

    static /* synthetic */ void zzh(zzdu zzduVar, zzap zzapVar) {
        zzapVar.getClass();
        zzbet zzbetVar = zzduVar.zzn;
        if (!zzbetVar.zzc()) {
            zzduVar.zzn = zzbel.zzM(zzbetVar);
        }
        zzduVar.zzn.add(zzapVar);
    }

    static /* synthetic */ void zzi(zzdu zzduVar, boolean z2) {
        zzduVar.zze = (-1) - (((-1) - zzduVar.zze) & ((-1) - 1024));
        zzduVar.zzy = true;
    }

    static /* synthetic */ void zzj(zzdu zzduVar, zzjy zzjyVar) {
        zzjyVar.getClass();
        zzduVar.zzz = zzjyVar;
        zzduVar.zze = (-1) - (((-1) - zzduVar.zze) & ((-1) - 2048));
    }

    static /* synthetic */ void zzk(zzdu zzduVar, zzby zzbyVar) {
        zzbyVar.getClass();
        zzduVar.zzA = zzbyVar;
        zzduVar.zze = (-1) - (((-1) - zzduVar.zze) & ((-1) - 4096));
    }

    static /* synthetic */ void zzl(zzdu zzduVar, zzec zzecVar) {
        zzecVar.getClass();
        zzduVar.zzD = zzecVar;
        zzduVar.zze = (-1) - (((-1) - zzduVar.zze) & ((-1) - 32768));
    }

    static /* synthetic */ void zzm(zzdu zzduVar, int i2) {
        zzduVar.zzM = i2 - 1;
        zzduVar.zze |= 1048576;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzao);
        }
        if (i3 == 2) {
            return zzO(zzd, "\u0001<\u0000\u0002\u0001I<\u0000\f\u000b\u0001\u001b\u0002Л\u0003ဉ\u0001\u0005\u001b\u0006Л\u0007ဇ\u0010\bဉ\u000f\nဉ\u000b\u000bဉ\f\fဉ\r\u000fဉ\u001f\u0010ᐉ\u0002\u0013\u001b\u0014ᐉ\u0003\u0015\u001a\u0016ဉ!\u0017ဉ\u001a\u0018ဉ\u000e\u001aᐉ\u0004\u001b\u001b\u001cဉ\u0005\u001dဉ\u0006\u001eဉ \u001f\u001b ဈ\u0011!\u001a\"ဉ\"$ဇ\u001b%ᐉ\u0007&ᐉ\b'ဉ\u0015)ဉ\u001e*\u001b+ဉ#,ဉ$-᠌\u0014.ဇ\n/ဉ&1ဉ%3᠌'4ဇ\u00165ᐉ\u001c6င\u00127င\u00138ဈ\u00179ဈ\u0018<ဇ(=ဇ\u0019>ဉ\u0000?\u001b@᠌)Aᐉ\tBင,Cဉ-Dဈ+Eဇ*FЛGဈ.Hᐉ\u001dIဇ/", new Object[]{"zze", "zzf", "zzg", zziy.class, "zzk", zzbsq.class, "zzl", "zzm", zzik.class, "zzn", zzap.class, "zzI", "zzD", "zzz", "zzA", "zzB", "zzX", "zzo", "zzp", zzjb.class, "zzr", "zzE", "zzZ", "zzS", "zzC", "zzs", "zzj", zzq.class, "zzt", "zzu", "zzY", "zzF", zzfa.class, "zzJ", "zzH", "zzaa", "zzT", "zzv", "zzw", "zzN", "zzW", "zzh", zziy.class, "zzab", "zzac", "zzM", zza.zza, "zzy", "zzae", "zzad", "zzaf", zzdt.zza, "zzO", "zzU", "zzK", "zzL", "zzP", "zzQ", "zzag", "zzR", "zzi", "zzq", zzbzk.class, "zzah", zzds.zza, "zzx", "zzak", "zzal", "zzaj", "zzai", "zzG", zzmd.class, "zzam", "zzV", "zzan"});
        }
        if (i3 == 3) {
            return new zzdu();
        }
        if (i3 == 4) {
            return new zzdr(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zzao = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
