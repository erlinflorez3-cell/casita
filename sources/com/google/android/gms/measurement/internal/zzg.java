package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzg {
    private final zzhy zza;
    private Long zzaa;
    private Long zzab;
    private long zzac;
    private String zzad;
    private int zzae;
    private int zzaf;
    private long zzag;
    private String zzah;
    private byte[] zzai;
    private long zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    private String zzap;
    private boolean zzaq;
    private long zzar;
    private long zzas;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private String zzq;
    private Boolean zzr;
    private long zzs;
    private List<String> zzt;
    private String zzu;
    private boolean zzv;
    private long zzw;
    private long zzx;
    private int zzy;
    private boolean zzz;

    zzg(zzhy zzhyVar, String str) {
        Preconditions.checkNotNull(zzhyVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzhyVar;
        this.zzb = str;
        zzhyVar.zzl().zzt();
    }

    public final int zza() {
        this.zza.zzl().zzt();
        return this.zzy;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final void zza(int i2) {
        this.zza.zzl().zzt();
        boolean z2 = this.zzaq;
        int i3 = this.zzy != i2 ? 1 : 0;
        this.zzaq = ((z2 ? 1 : 0) + i3) - ((z2 ? 1 : 0) & i3);
        this.zzy = i2;
    }

    public final void zza(long j2) {
        this.zza.zzl().zzt();
        long j3 = this.zzg + j2;
        if (j3 > 2147483647L) {
            this.zza.zzj().zzu().zza("Bundle index overflow. appId", zzgo.zza(this.zzb));
            j3 = j2 - 1;
        }
        long j4 = this.zzag + 1;
        if (j4 > 2147483647L) {
            this.zza.zzj().zzu().zza("Delivery index overflow. appId", zzgo.zza(this.zzb));
            j4 = 0;
        }
        this.zzaq = true;
        this.zzg = j3;
        this.zzag = j4;
    }

    public final void zza(Boolean bool) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzr, bool);
        this.zzr = bool;
    }

    public final void zza(Long l2) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzaa, l2);
        this.zzaa = l2;
    }

    public final void zza(String str) {
        this.zza.zzl().zzt();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        boolean z2 = this.zzaq;
        int i2 = !Objects.equals(this.zzq, str) ? 1 : 0;
        this.zzaq = ((z2 ? 1 : 0) + i2) - ((z2 ? 1 : 0) & i2) == 1;
        this.zzq = str;
    }

    public final void zza(List<String> list) {
        this.zza.zzl().zzt();
        if (Objects.equals(this.zzt, list)) {
            return;
        }
        this.zzaq = true;
        this.zzt = list != null ? new ArrayList(list) : null;
    }

    public final void zza(boolean z2) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzp != z2;
        this.zzp = z2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final void zza(byte[] bArr) {
        this.zza.zzl().zzt();
        boolean z2 = this.zzaq;
        int i2 = this.zzai != bArr ? 1 : 0;
        this.zzaq = ((z2 ? 1 : 0) + i2) - ((z2 ? 1 : 0) & i2);
        this.zzai = bArr;
    }

    public final String zzaa() {
        this.zza.zzl().zzt();
        return this.zzq;
    }

    public final String zzab() {
        this.zza.zzl().zzt();
        String str = this.zzap;
        zzg((String) null);
        return str;
    }

    public final String zzac() {
        this.zza.zzl().zzt();
        return this.zzb;
    }

    public final String zzad() {
        this.zza.zzl().zzt();
        return this.zzc;
    }

    public final String zzae() {
        this.zza.zzl().zzt();
        return this.zzl;
    }

    public final String zzaf() {
        this.zza.zzl().zzt();
        return this.zzj;
    }

    public final String zzag() {
        this.zza.zzl().zzt();
        return this.zzf;
    }

    public final String zzah() {
        this.zza.zzl().zzt();
        return this.zzd;
    }

    public final String zzai() {
        this.zza.zzl().zzt();
        return this.zzap;
    }

    public final String zzaj() {
        this.zza.zzl().zzt();
        return this.zze;
    }

    public final String zzak() {
        this.zza.zzl().zzt();
        return this.zzah;
    }

    public final String zzal() {
        this.zza.zzl().zzt();
        return this.zzu;
    }

    public final String zzam() {
        this.zza.zzl().zzt();
        return this.zzad;
    }

    public final List<String> zzan() {
        this.zza.zzl().zzt();
        return this.zzt;
    }

    public final void zzao() {
        this.zza.zzl().zzt();
        this.zzaq = false;
    }

    public final void zzap() {
        this.zza.zzl().zzt();
        long j2 = this.zzg + 1;
        if (j2 > 2147483647L) {
            this.zza.zzj().zzu().zza("Bundle index overflow. appId", zzgo.zza(this.zzb));
            j2 = 0;
        }
        this.zzaq = true;
        this.zzg = j2;
    }

    public final boolean zzaq() {
        this.zza.zzl().zzt();
        return this.zzp;
    }

    public final boolean zzar() {
        this.zza.zzl().zzt();
        return this.zzo;
    }

    public final boolean zzas() {
        this.zza.zzl().zzt();
        return this.zzaq;
    }

    public final boolean zzat() {
        this.zza.zzl().zzt();
        return this.zzv;
    }

    public final boolean zzau() {
        this.zza.zzl().zzt();
        return this.zzz;
    }

    public final byte[] zzav() {
        this.zza.zzl().zzt();
        return this.zzai;
    }

    public final int zzb() {
        this.zza.zzl().zzt();
        return this.zzaf;
    }

    public final void zzb(int i2) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzaf != i2;
        this.zzaf = i2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final void zzb(long j2) {
        this.zza.zzl().zzt();
        boolean z2 = this.zzaq;
        int i2 = this.zzk != j2 ? 1 : 0;
        this.zzaq = ((z2 ? 1 : 0) + i2) - ((z2 ? 1 : 0) & i2);
        this.zzk = j2;
    }

    public final void zzb(Long l2) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzab, l2);
        this.zzab = l2;
    }

    public final void zzb(String str) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzc, str);
        this.zzc = str;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    public final void zzb(boolean z2) {
        this.zza.zzl().zzt();
        this.zzaq = (-1) - (((-1) - (this.zzaq ? 1 : 0)) & ((-1) - (this.zzo != z2 ? 1 : 0)));
        this.zzo = z2;
    }

    public final int zzc() {
        this.zza.zzl().zzt();
        return this.zzae;
    }

    public final void zzc(int i2) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzae != i2;
        this.zzae = i2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    public final void zzc(long j2) {
        this.zza.zzl().zzt();
        this.zzaq = (-1) - (((-1) - (this.zzaq ? 1 : 0)) & ((-1) - (this.zzac != j2 ? 1 : 0)));
        this.zzac = j2;
    }

    public final void zzc(String str) {
        this.zza.zzl().zzt();
        boolean z2 = this.zzaq;
        int i2 = !Objects.equals(this.zzl, str) ? 1 : 0;
        this.zzaq = ((z2 ? 1 : 0) + i2) - ((z2 ? 1 : 0) & i2) == 1;
        this.zzl = str;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final void zzc(boolean z2) {
        this.zza.zzl().zzt();
        boolean z3 = this.zzaq;
        int i2 = this.zzv != z2 ? 1 : 0;
        this.zzaq = ((z3 ? 1 : 0) + i2) - ((z3 ? 1 : 0) & i2);
        this.zzv = z2;
    }

    public final long zzd() {
        this.zza.zzl().zzt();
        return 0L;
    }

    public final void zzd(long j2) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzar != j2;
        this.zzar = j2;
    }

    public final void zzd(String str) {
        this.zza.zzl().zzt();
        this.zzaq = (-1) - (((-1) - (this.zzaq ? 1 : 0)) & ((-1) - (!Objects.equals(this.zzj, str) ? 1 : 0))) == 1;
        this.zzj = str;
    }

    public final void zzd(boolean z2) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzz != z2;
        this.zzz = z2;
    }

    public final long zze() {
        this.zza.zzl().zzt();
        return this.zzk;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    public final void zze(long j2) {
        this.zza.zzl().zzt();
        this.zzaq = (-1) - (((-1) - (this.zzaq ? 1 : 0)) & ((-1) - (this.zzam != j2 ? 1 : 0)));
        this.zzam = j2;
    }

    public final void zze(String str) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zzf, str);
        this.zzf = str;
    }

    public final long zzf() {
        this.zza.zzl().zzt();
        return this.zzac;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    public final void zzf(long j2) {
        this.zza.zzl().zzt();
        this.zzaq = (-1) - (((-1) - (this.zzaq ? 1 : 0)) & ((-1) - (this.zzan != j2 ? 1 : 0)));
        this.zzan = j2;
    }

    public final void zzf(String str) {
        this.zza.zzl().zzt();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzaq = (-1) - (((-1) - (this.zzaq ? 1 : 0)) & ((-1) - (!Objects.equals(this.zzd, str) ? 1 : 0))) == 1;
        this.zzd = str;
    }

    public final long zzg() {
        this.zza.zzl().zzt();
        return this.zzar;
    }

    public final void zzg(long j2) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzal != j2;
        this.zzal = j2;
    }

    public final void zzg(String str) {
        this.zza.zzl().zzt();
        this.zzaq = (-1) - (((-1) - (this.zzaq ? 1 : 0)) & ((-1) - (!Objects.equals(this.zzap, str) ? 1 : 0))) == 1;
        this.zzap = str;
    }

    public final long zzh() {
        this.zza.zzl().zzt();
        return this.zzam;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final void zzh(long j2) {
        this.zza.zzl().zzt();
        boolean z2 = this.zzaq;
        int i2 = this.zzak != j2 ? 1 : 0;
        this.zzaq = ((z2 ? 1 : 0) + i2) - ((z2 ? 1 : 0) & i2);
        this.zzak = j2;
    }

    public final void zzh(String str) {
        this.zza.zzl().zzt();
        this.zzaq |= !Objects.equals(this.zze, str);
        this.zze = str;
    }

    public final long zzi() {
        this.zza.zzl().zzt();
        return this.zzan;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final void zzi(long j2) {
        this.zza.zzl().zzt();
        boolean z2 = this.zzaq;
        int i2 = this.zzao != j2 ? 1 : 0;
        this.zzaq = ((z2 ? 1 : 0) + i2) - ((z2 ? 1 : 0) & i2);
        this.zzao = j2;
    }

    public final void zzi(String str) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzah != str;
        this.zzah = str;
    }

    public final long zzj() {
        this.zza.zzl().zzt();
        return this.zzal;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final void zzj(long j2) {
        this.zza.zzl().zzt();
        boolean z2 = this.zzaq;
        int i2 = this.zzaj != j2 ? 1 : 0;
        this.zzaq = ((z2 ? 1 : 0) + i2) - ((z2 ? 1 : 0) & i2);
        this.zzaj = j2;
    }

    public final void zzj(String str) {
        this.zza.zzl().zzt();
        boolean z2 = this.zzaq;
        int i2 = !Objects.equals(this.zzu, str) ? 1 : 0;
        this.zzaq = ((z2 ? 1 : 0) + i2) - ((z2 ? 1 : 0) & i2) == 1;
        this.zzu = str;
    }

    public final long zzk() {
        this.zza.zzl().zzt();
        return this.zzak;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    public final void zzk(long j2) {
        this.zza.zzl().zzt();
        this.zzaq = (-1) - (((-1) - (this.zzaq ? 1 : 0)) & ((-1) - (this.zzn != j2 ? 1 : 0)));
        this.zzn = j2;
    }

    public final void zzk(String str) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzad != str;
        this.zzad = str;
    }

    public final long zzl() {
        this.zza.zzl().zzt();
        return this.zzao;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final void zzl(long j2) {
        this.zza.zzl().zzt();
        boolean z2 = this.zzaq;
        int i2 = this.zzs != j2 ? 1 : 0;
        this.zzaq = ((z2 ? 1 : 0) + i2) - ((z2 ? 1 : 0) & i2);
        this.zzs = j2;
    }

    public final long zzm() {
        this.zza.zzl().zzt();
        return this.zzaj;
    }

    public final void zzm(long j2) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzas != j2;
        this.zzas = j2;
    }

    public final long zzn() {
        this.zza.zzl().zzt();
        return this.zzn;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    public final void zzn(long j2) {
        this.zza.zzl().zzt();
        this.zzaq = (-1) - (((-1) - (this.zzaq ? 1 : 0)) & ((-1) - (this.zzm != j2 ? 1 : 0)));
        this.zzm = j2;
    }

    public final long zzo() {
        this.zza.zzl().zzt();
        return this.zzs;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    public final void zzo(long j2) {
        this.zza.zzl().zzt();
        this.zzaq = (-1) - (((-1) - (this.zzaq ? 1 : 0)) & ((-1) - (this.zzag != j2 ? 1 : 0)));
        this.zzag = j2;
    }

    public final long zzp() {
        this.zza.zzl().zzt();
        return this.zzas;
    }

    public final void zzp(long j2) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzi != j2;
        this.zzi = j2;
    }

    public final long zzq() {
        this.zza.zzl().zzt();
        return this.zzm;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    public final void zzq(long j2) {
        Preconditions.checkArgument(j2 >= 0);
        this.zza.zzl().zzt();
        this.zzaq = (-1) - (((-1) - (this.zzaq ? 1 : 0)) & ((-1) - (this.zzg == j2 ? 0 : 1)));
        this.zzg = j2;
    }

    public final long zzr() {
        this.zza.zzl().zzt();
        return this.zzag;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final void zzr(long j2) {
        this.zza.zzl().zzt();
        boolean z2 = this.zzaq;
        int i2 = this.zzh != j2 ? 1 : 0;
        this.zzaq = ((z2 ? 1 : 0) + i2) - ((z2 ? 1 : 0) & i2);
        this.zzh = j2;
    }

    public final long zzs() {
        this.zza.zzl().zzt();
        return this.zzi;
    }

    public final void zzs(long j2) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzx != j2;
        this.zzx = j2;
    }

    public final long zzt() {
        this.zza.zzl().zzt();
        return this.zzg;
    }

    public final void zzt(long j2) {
        this.zza.zzl().zzt();
        this.zzaq |= this.zzw != j2;
        this.zzw = j2;
    }

    public final long zzu() {
        this.zza.zzl().zzt();
        return this.zzh;
    }

    public final long zzv() {
        this.zza.zzl().zzt();
        return this.zzx;
    }

    public final long zzw() {
        this.zza.zzl().zzt();
        return this.zzw;
    }

    public final Boolean zzx() {
        this.zza.zzl().zzt();
        return this.zzr;
    }

    public final Long zzy() {
        this.zza.zzl().zzt();
        return this.zzaa;
    }

    public final Long zzz() {
        this.zza.zzl().zzt();
        return this.zzab;
    }
}
