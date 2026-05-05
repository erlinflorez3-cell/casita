package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzur {
    private final zzuq zza;

    private zzur(zzuq zzuqVar) {
        byte[] bArr = zzye.zzd;
        this.zza = zzuqVar;
        zzuqVar.zze = this;
    }

    public static zzur zza(zzuq zzuqVar) {
        zzur zzurVar = zzuqVar.zze;
        return zzurVar != null ? zzurVar : new zzur(zzuqVar);
    }

    public final void zzA(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzj(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).longValue();
            i4 += 8;
        }
        this.zza.zzu(i4);
        while (i3 < list.size()) {
            this.zza.zzk(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public final void zzB(int i2, int i3) throws IOException {
        this.zza.zzt(i2, (i3 >> 31) ^ (i3 + i3));
    }

    public final void zzC(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                zzuq zzuqVar = this.zza;
                int iIntValue = ((Integer) list.get(i3)).intValue();
                zzuqVar.zzt(i2, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int iZzD = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            iZzD += zzuq.zzD((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.zza.zzu(iZzD);
        while (i3 < list.size()) {
            zzuq zzuqVar2 = this.zza;
            int iIntValue3 = ((Integer) list.get(i3)).intValue();
            zzuqVar2.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i3++;
        }
    }

    public final void zzD(int i2, long j2) throws IOException {
        zzuq zzuqVar = this.zza;
        zzuqVar.zzv(i2, (j2 >> 63) ^ (j2 + j2));
    }

    public final void zzE(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                zzuq zzuqVar = this.zza;
                long jLongValue = ((Long) list.get(i3)).longValue();
                zzuqVar.zzv(i2, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int iZzE = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue2 = ((Long) list.get(i4)).longValue();
            iZzE += zzuq.zzE((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.zza.zzu(iZzE);
        while (i3 < list.size()) {
            zzuq zzuqVar2 = this.zza;
            long jLongValue3 = ((Long) list.get(i3)).longValue();
            zzuqVar2.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i3++;
        }
    }

    @Deprecated
    public final void zzF(int i2) throws IOException {
        this.zza.zzs(i2, 3);
    }

    public final void zzG(int i2, String str) throws IOException {
        this.zza.zzq(i2, str);
    }

    public final void zzH(int i2, List list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzyo)) {
            while (i3 < list.size()) {
                this.zza.zzq(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zzyo zzyoVar = (zzyo) list;
        while (i3 < list.size()) {
            Object objZzf = zzyoVar.zzf(i3);
            if (objZzf instanceof String) {
                this.zza.zzq(i2, (String) objZzf);
            } else {
                this.zza.zzM(i2, (zzud) objZzf);
            }
            i3++;
        }
    }

    public final void zzI(int i2, int i3) throws IOException {
        this.zza.zzt(i2, i3);
    }

    public final void zzJ(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzt(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int iZzD = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzD += zzuq.zzD(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzu(iZzD);
        while (i3 < list.size()) {
            this.zza.zzu(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public final void zzK(int i2, long j2) throws IOException {
        this.zza.zzv(i2, j2);
    }

    public final void zzL(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzv(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int iZzE = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzE += zzuq.zzE(((Long) list.get(i4)).longValue());
        }
        this.zza.zzu(iZzE);
        while (i3 < list.size()) {
            this.zza.zzw(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public final void zzb(int i2, boolean z2) throws IOException {
        this.zza.zzL(i2, z2);
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
    public final void zzc(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzL(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Boolean) list.get(i5)).booleanValue();
            i4++;
        }
        this.zza.zzu(i4);
        while (i3 < list.size()) {
            this.zza.zzK(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public final void zzd(int i2, zzud zzudVar) throws IOException {
        this.zza.zzM(i2, zzudVar);
    }

    public final void zze(int i2, List list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zzM(i2, (zzud) list.get(i3));
        }
    }

    public final void zzf(int i2, double d2) throws IOException {
        this.zza.zzj(i2, Double.doubleToRawLongBits(d2));
    }

    public final void zzg(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzj(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Double) list.get(i5)).doubleValue();
            i4 += 8;
        }
        this.zza.zzu(i4);
        while (i3 < list.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    @Deprecated
    public final void zzh(int i2) throws IOException {
        this.zza.zzs(i2, 4);
    }

    public final void zzi(int i2, int i3) throws IOException {
        this.zza.zzl(i2, i3);
    }

    public final void zzj(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzl(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int iZzz = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzz += zzuq.zzz(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzu(iZzz);
        while (i3 < list.size()) {
            this.zza.zzm(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public final void zzk(int i2, int i3) throws IOException {
        this.zza.zzh(i2, i3);
    }

    public final void zzl(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).intValue();
            i4 += 4;
        }
        this.zza.zzu(i4);
        while (i3 < list.size()) {
            this.zza.zzi(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public final void zzm(int i2, long j2) throws IOException {
        this.zza.zzj(i2, j2);
    }

    public final void zzn(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzj(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).longValue();
            i4 += 8;
        }
        this.zza.zzu(i4);
        while (i3 < list.size()) {
            this.zza.zzk(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public final void zzo(int i2, float f2) throws IOException {
        this.zza.zzh(i2, Float.floatToRawIntBits(f2));
    }

    public final void zzp(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Float) list.get(i5)).floatValue();
            i4 += 4;
        }
        this.zza.zzu(i4);
        while (i3 < list.size()) {
            this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    public final void zzq(int i2, Object obj, zzzt zzztVar) throws IOException {
        zzuq zzuqVar = this.zza;
        zzuqVar.zzs(i2, 3);
        zzztVar.zzm((zzzg) obj, zzuqVar.zze);
        zzuqVar.zzs(i2, 4);
    }

    public final void zzr(int i2, int i3) throws IOException {
        this.zza.zzl(i2, i3);
    }

    public final void zzs(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzl(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int iZzz = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzz += zzuq.zzz(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzu(iZzz);
        while (i3 < list.size()) {
            this.zza.zzm(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public final void zzt(int i2, long j2) throws IOException {
        this.zza.zzv(i2, j2);
    }

    public final void zzu(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzv(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int iZzE = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzE += zzuq.zzE(((Long) list.get(i4)).longValue());
        }
        this.zza.zzu(iZzE);
        while (i3 < list.size()) {
            this.zza.zzw(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public final void zzv(int i2, Object obj, zzzt zzztVar) throws IOException {
        this.zza.zzn(i2, (zzzg) obj, zzztVar);
    }

    public final void zzw(int i2, Object obj) throws IOException {
        if (obj instanceof zzud) {
            this.zza.zzp(i2, (zzud) obj);
        } else {
            this.zza.zzo(i2, (zzzg) obj);
        }
    }

    public final void zzx(int i2, int i3) throws IOException {
        this.zza.zzh(i2, i3);
    }

    public final void zzy(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        this.zza.zzs(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).intValue();
            i4 += 4;
        }
        this.zza.zzu(i4);
        while (i3 < list.size()) {
            this.zza.zzi(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public final void zzz(int i2, long j2) throws IOException {
        this.zza.zzj(i2, j2);
    }
}
