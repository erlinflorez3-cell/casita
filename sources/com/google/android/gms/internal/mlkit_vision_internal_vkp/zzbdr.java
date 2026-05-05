package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbdr implements zzbhs {
    private final zzbdq zza;

    private zzbdr(zzbdq zzbdqVar) {
        byte[] bArr = zzbeu.zzb;
        this.zza = zzbdqVar;
        zzbdqVar.zze = this;
    }

    public static zzbdr zza(zzbdq zzbdqVar) {
        zzbdr zzbdrVar = zzbdqVar.zze;
        return zzbdrVar != null ? zzbdrVar : new zzbdr(zzbdqVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzA(int i2, long j2) throws IOException {
        this.zza.zzl(i2, j2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzB(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbfg)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzl(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzv(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).longValue();
                i4 += 8;
            }
            this.zza.zzx(i4);
            while (i3 < list.size()) {
                this.zza.zzm(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzbfg zzbfgVar = (zzbfg) list;
        if (!z2) {
            while (i3 < zzbfgVar.size()) {
                this.zza.zzl(i2, zzbfgVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzv(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzbfgVar.size(); i7++) {
            zzbfgVar.zze(i7);
            i6 += 8;
        }
        this.zza.zzx(i6);
        while (i3 < zzbfgVar.size()) {
            this.zza.zzm(zzbfgVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzC(int i2, int i3) throws IOException {
        this.zza.zzw(i2, (i3 >> 31) ^ (i3 + i3));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzD(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbem)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zzbdq zzbdqVar = this.zza;
                    int iIntValue = ((Integer) list.get(i3)).intValue();
                    zzbdqVar.zzw(i2, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i3++;
                }
                return;
            }
            this.zza.zzv(i2, 2);
            int iZzF = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int iIntValue2 = ((Integer) list.get(i4)).intValue();
                iZzF += zzbdq.zzF((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzx(iZzF);
            while (i3 < list.size()) {
                zzbdq zzbdqVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i3)).intValue();
                zzbdqVar2.zzx((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i3++;
            }
            return;
        }
        zzbem zzbemVar = (zzbem) list;
        if (!z2) {
            while (i3 < zzbemVar.size()) {
                zzbdq zzbdqVar3 = this.zza;
                int iZze = zzbemVar.zze(i3);
                zzbdqVar3.zzw(i2, (iZze >> 31) ^ (iZze + iZze));
                i3++;
            }
            return;
        }
        this.zza.zzv(i2, 2);
        int iZzF2 = 0;
        for (int i5 = 0; i5 < zzbemVar.size(); i5++) {
            int iZze2 = zzbemVar.zze(i5);
            iZzF2 += zzbdq.zzF((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzx(iZzF2);
        while (i3 < zzbemVar.size()) {
            zzbdq zzbdqVar4 = this.zza;
            int iZze3 = zzbemVar.zze(i3);
            zzbdqVar4.zzx((iZze3 >> 31) ^ (iZze3 + iZze3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzE(int i2, long j2) throws IOException {
        zzbdq zzbdqVar = this.zza;
        zzbdqVar.zzy(i2, (j2 >> 63) ^ (j2 + j2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzF(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbfg)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zzbdq zzbdqVar = this.zza;
                    long jLongValue = ((Long) list.get(i3)).longValue();
                    zzbdqVar.zzy(i2, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i3++;
                }
                return;
            }
            this.zza.zzv(i2, 2);
            int iZzG = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long jLongValue2 = ((Long) list.get(i4)).longValue();
                iZzG += zzbdq.zzG((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzx(iZzG);
            while (i3 < list.size()) {
                zzbdq zzbdqVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i3)).longValue();
                zzbdqVar2.zzz((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i3++;
            }
            return;
        }
        zzbfg zzbfgVar = (zzbfg) list;
        if (!z2) {
            while (i3 < zzbfgVar.size()) {
                zzbdq zzbdqVar3 = this.zza;
                long jZze = zzbfgVar.zze(i3);
                zzbdqVar3.zzy(i2, (jZze >> 63) ^ (jZze + jZze));
                i3++;
            }
            return;
        }
        this.zza.zzv(i2, 2);
        int iZzG2 = 0;
        for (int i5 = 0; i5 < zzbfgVar.size(); i5++) {
            long jZze2 = zzbfgVar.zze(i5);
            iZzG2 += zzbdq.zzG((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzx(iZzG2);
        while (i3 < zzbfgVar.size()) {
            zzbdq zzbdqVar4 = this.zza;
            long jZze3 = zzbfgVar.zze(i3);
            zzbdqVar4.zzz((jZze3 >> 63) ^ (jZze3 + jZze3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    @Deprecated
    public final void zzG(int i2) throws IOException {
        this.zza.zzv(i2, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzH(int i2, String str) throws IOException {
        this.zza.zzt(i2, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzI(int i2, List list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbfd)) {
            while (i3 < list.size()) {
                this.zza.zzt(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zzbfd zzbfdVar = (zzbfd) list;
        while (i3 < list.size()) {
            Object objZzc = zzbfdVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzt(i2, (String) objZzc);
            } else {
                this.zza.zzh(i2, (zzbdd) objZzc);
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzJ(int i2, int i3) throws IOException {
        this.zza.zzw(i2, i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzK(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbem)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzw(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzv(i2, 2);
            int iZzF = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzF += zzbdq.zzF(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzx(iZzF);
            while (i3 < list.size()) {
                this.zza.zzx(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzbem zzbemVar = (zzbem) list;
        if (!z2) {
            while (i3 < zzbemVar.size()) {
                this.zza.zzw(i2, zzbemVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzv(i2, 2);
        int iZzF2 = 0;
        for (int i5 = 0; i5 < zzbemVar.size(); i5++) {
            iZzF2 += zzbdq.zzF(zzbemVar.zze(i5));
        }
        this.zza.zzx(iZzF2);
        while (i3 < zzbemVar.size()) {
            this.zza.zzx(zzbemVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzL(int i2, long j2) throws IOException {
        this.zza.zzy(i2, j2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzM(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbfg)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzy(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzv(i2, 2);
            int iZzG = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzG += zzbdq.zzG(((Long) list.get(i4)).longValue());
            }
            this.zza.zzx(iZzG);
            while (i3 < list.size()) {
                this.zza.zzz(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzbfg zzbfgVar = (zzbfg) list;
        if (!z2) {
            while (i3 < zzbfgVar.size()) {
                this.zza.zzy(i2, zzbfgVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzv(i2, 2);
        int iZzG2 = 0;
        for (int i5 = 0; i5 < zzbfgVar.size(); i5++) {
            iZzG2 += zzbdq.zzG(zzbfgVar.zze(i5));
        }
        this.zza.zzx(iZzG2);
        while (i3 < zzbfgVar.size()) {
            this.zza.zzz(zzbfgVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzb(int i2, boolean z2) throws IOException {
        this.zza.zzO(i2, z2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzc(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbct)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzO(i2, ((Boolean) list.get(i3)).booleanValue());
                    i3++;
                }
                return;
            }
            this.zza.zzv(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Boolean) list.get(i5)).booleanValue();
                i4++;
            }
            this.zza.zzx(i4);
            while (i3 < list.size()) {
                this.zza.zzN(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
                i3++;
            }
            return;
        }
        zzbct zzbctVar = (zzbct) list;
        if (!z2) {
            while (i3 < zzbctVar.size()) {
                this.zza.zzO(i2, zzbctVar.zzf(i3));
                i3++;
            }
            return;
        }
        this.zza.zzv(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzbctVar.size(); i7++) {
            zzbctVar.zzf(i7);
            i6++;
        }
        this.zza.zzx(i6);
        while (i3 < zzbctVar.size()) {
            this.zza.zzN(zzbctVar.zzf(i3) ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzd(int i2, zzbdd zzbddVar) throws IOException {
        this.zza.zzh(i2, zzbddVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zze(int i2, List list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zzh(i2, (zzbdd) list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzf(int i2, double d2) throws IOException {
        this.zza.zzl(i2, Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzg(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbds)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzl(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                    i3++;
                }
                return;
            }
            this.zza.zzv(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Double) list.get(i5)).doubleValue();
                i4 += 8;
            }
            this.zza.zzx(i4);
            while (i3 < list.size()) {
                this.zza.zzm(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        zzbds zzbdsVar = (zzbds) list;
        if (!z2) {
            while (i3 < zzbdsVar.size()) {
                this.zza.zzl(i2, Double.doubleToRawLongBits(zzbdsVar.zze(i3)));
                i3++;
            }
            return;
        }
        this.zza.zzv(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzbdsVar.size(); i7++) {
            zzbdsVar.zze(i7);
            i6 += 8;
        }
        this.zza.zzx(i6);
        while (i3 < zzbdsVar.size()) {
            this.zza.zzm(Double.doubleToRawLongBits(zzbdsVar.zze(i3)));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    @Deprecated
    public final void zzh(int i2) throws IOException {
        this.zza.zzv(i2, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzi(int i2, int i3) throws IOException {
        this.zza.zzn(i2, i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzj(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbem)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzn(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzv(i2, 2);
            int iZzG = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzG += zzbdq.zzG(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzx(iZzG);
            while (i3 < list.size()) {
                this.zza.zzo(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzbem zzbemVar = (zzbem) list;
        if (!z2) {
            while (i3 < zzbemVar.size()) {
                this.zza.zzn(i2, zzbemVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzv(i2, 2);
        int iZzG2 = 0;
        for (int i5 = 0; i5 < zzbemVar.size(); i5++) {
            iZzG2 += zzbdq.zzG(zzbemVar.zze(i5));
        }
        this.zza.zzx(iZzG2);
        while (i3 < zzbemVar.size()) {
            this.zza.zzo(zzbemVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzk(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzl(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbem)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzj(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzv(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).intValue();
                i4 += 4;
            }
            this.zza.zzx(i4);
            while (i3 < list.size()) {
                this.zza.zzk(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzbem zzbemVar = (zzbem) list;
        if (!z2) {
            while (i3 < zzbemVar.size()) {
                this.zza.zzj(i2, zzbemVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzv(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzbemVar.size(); i7++) {
            zzbemVar.zze(i7);
            i6 += 4;
        }
        this.zza.zzx(i6);
        while (i3 < zzbemVar.size()) {
            this.zza.zzk(zzbemVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzm(int i2, long j2) throws IOException {
        this.zza.zzl(i2, j2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzn(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbfg)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzl(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzv(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).longValue();
                i4 += 8;
            }
            this.zza.zzx(i4);
            while (i3 < list.size()) {
                this.zza.zzm(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzbfg zzbfgVar = (zzbfg) list;
        if (!z2) {
            while (i3 < zzbfgVar.size()) {
                this.zza.zzl(i2, zzbfgVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzv(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzbfgVar.size(); i7++) {
            zzbfgVar.zze(i7);
            i6 += 8;
        }
        this.zza.zzx(i6);
        while (i3 < zzbfgVar.size()) {
            this.zza.zzm(zzbfgVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzo(int i2, float f2) throws IOException {
        this.zza.zzj(i2, Float.floatToRawIntBits(f2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzp(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbec)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzj(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                    i3++;
                }
                return;
            }
            this.zza.zzv(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Float) list.get(i5)).floatValue();
                i4 += 4;
            }
            this.zza.zzx(i4);
            while (i3 < list.size()) {
                this.zza.zzk(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        zzbec zzbecVar = (zzbec) list;
        if (!z2) {
            while (i3 < zzbecVar.size()) {
                this.zza.zzj(i2, Float.floatToRawIntBits(zzbecVar.zze(i3)));
                i3++;
            }
            return;
        }
        this.zza.zzv(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzbecVar.size(); i7++) {
            zzbecVar.zze(i7);
            i6 += 4;
        }
        this.zza.zzx(i6);
        while (i3 < zzbecVar.size()) {
            this.zza.zzk(Float.floatToRawIntBits(zzbecVar.zze(i3)));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzq(int i2, Object obj, zzbgm zzbgmVar) throws IOException {
        zzbdq zzbdqVar = this.zza;
        zzbdqVar.zzv(i2, 3);
        zzbgmVar.zzj((zzbfs) obj, zzbdqVar.zze);
        zzbdqVar.zzv(i2, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzr(int i2, int i3) throws IOException {
        this.zza.zzn(i2, i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzs(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbem)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzn(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzv(i2, 2);
            int iZzG = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzG += zzbdq.zzG(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzx(iZzG);
            while (i3 < list.size()) {
                this.zza.zzo(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzbem zzbemVar = (zzbem) list;
        if (!z2) {
            while (i3 < zzbemVar.size()) {
                this.zza.zzn(i2, zzbemVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzv(i2, 2);
        int iZzG2 = 0;
        for (int i5 = 0; i5 < zzbemVar.size(); i5++) {
            iZzG2 += zzbdq.zzG(zzbemVar.zze(i5));
        }
        this.zza.zzx(iZzG2);
        while (i3 < zzbemVar.size()) {
            this.zza.zzo(zzbemVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzt(int i2, long j2) throws IOException {
        this.zza.zzy(i2, j2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzu(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbfg)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzy(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzv(i2, 2);
            int iZzG = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzG += zzbdq.zzG(((Long) list.get(i4)).longValue());
            }
            this.zza.zzx(iZzG);
            while (i3 < list.size()) {
                this.zza.zzz(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzbfg zzbfgVar = (zzbfg) list;
        if (!z2) {
            while (i3 < zzbfgVar.size()) {
                this.zza.zzy(i2, zzbfgVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzv(i2, 2);
        int iZzG2 = 0;
        for (int i5 = 0; i5 < zzbfgVar.size(); i5++) {
            iZzG2 += zzbdq.zzG(zzbfgVar.zze(i5));
        }
        this.zza.zzx(iZzG2);
        while (i3 < zzbfgVar.size()) {
            this.zza.zzz(zzbfgVar.zze(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzv(int i2, zzbfk zzbfkVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            this.zza.zzv(i2, 2);
            this.zza.zzx(zzbfl.zzb(zzbfkVar, entry.getKey(), entry.getValue()));
            zzbfl.zze(this.zza, zzbfkVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzw(int i2, Object obj, zzbgm zzbgmVar) throws IOException {
        this.zza.zzp(i2, (zzbfs) obj, zzbgmVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzx(int i2, Object obj) throws IOException {
        if (obj instanceof zzbdd) {
            this.zza.zzs(i2, (zzbdd) obj);
        } else {
            this.zza.zzr(i2, (zzbfs) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzy(int i2, int i3) throws IOException {
        this.zza.zzj(i2, i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbhs
    public final void zzz(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzbem)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzj(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzv(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).intValue();
                i4 += 4;
            }
            this.zza.zzx(i4);
            while (i3 < list.size()) {
                this.zza.zzk(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzbem zzbemVar = (zzbem) list;
        if (!z2) {
            while (i3 < zzbemVar.size()) {
                this.zza.zzj(i2, zzbemVar.zze(i3));
                i3++;
            }
            return;
        }
        this.zza.zzv(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzbemVar.size(); i7++) {
            zzbemVar.zze(i7);
            i6 += 4;
        }
        this.zza.zzx(i6);
        while (i3 < zzbemVar.size()) {
            this.zza.zzk(zzbemVar.zze(i3));
            i3++;
        }
    }
}
