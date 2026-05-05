package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzxp;
import com.google.android.gms.internal.gtm.zzxv;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzxv<MessageType extends zzxv<MessageType, BuilderType>, BuilderType extends zzxp<MessageType, BuilderType>> extends zztl<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzaal zzc = zzaal.zzc();

    public static zzxt zzaa(zzzg zzzgVar, zzzg zzzgVar2, zzxy zzxyVar, int i2, zzaba zzabaVar, boolean z2, Class cls) {
        return new zzxt(zzzgVar, Collections.emptyList(), zzzgVar2, new zzxs(null, i2, zzabaVar, true, false), cls);
    }

    public static zzxt zzab(zzzg zzzgVar, Object obj, zzzg zzzgVar2, zzxy zzxyVar, int i2, zzaba zzabaVar, Class cls) {
        return new zzxt(zzzgVar, obj, zzzgVar2, new zzxs(zzxyVar, i2, zzabaVar, false, false), cls);
    }

    static zzxv zzac(Class cls) {
        Map map = zza;
        zzxv zzxvVar = (zzxv) map.get(cls);
        if (zzxvVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzxvVar = (zzxv) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzxvVar == null) {
            zzxvVar = (zzxv) ((zzxv) zzaau.zze(cls)).zzb(6, null, null);
            if (zzxvVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzxvVar);
        }
        return zzxvVar;
    }

    protected static zzxv zzae(zzxv zzxvVar, InputStream inputStream, zzxf zzxfVar) throws zzyg {
        zzuh zzuhVar = new zzuh(inputStream, 4096, null);
        zzxv zzxvVarZzad = zzxvVar.zzad();
        try {
            zzzt zzztVarZzb = zzzp.zza().zzb(zzxvVarZzad.getClass());
            zzztVarZzb.zzh(zzxvVarZzad, zzuk.zzq(zzuhVar), zzxfVar);
            zzztVarZzb.zzf(zzxvVarZzad);
            zze(zzxvVarZzad);
            return zzxvVarZzad;
        } catch (zzaaj e2) {
            zzyg zzygVarZza = e2.zza();
            zzygVarZza.zzh(zzxvVarZzad);
            throw zzygVarZza;
        } catch (zzyg e3) {
            e = e3;
            if (e.zzl()) {
                e = new zzyg(e);
            }
            e.zzh(zzxvVarZzad);
            throw e;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzyg) {
                throw ((zzyg) e4.getCause());
            }
            zzyg zzygVar = new zzyg(e4);
            zzygVar.zzh(zzxvVarZzad);
            throw zzygVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzyg) {
                throw ((zzyg) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzxv zzaf(zzxv zzxvVar, byte[] bArr, zzxf zzxfVar) throws zzyg {
        zzxv zzxvVarZzf = zzf(zzxvVar, bArr, 0, bArr.length, zzxfVar);
        zze(zzxvVarZzf);
        return zzxvVarZzf;
    }

    protected static zzya zzag() {
        return zzxw.zzf();
    }

    protected static zzyd zzah() {
        return zzzq.zze();
    }

    protected static zzyd zzai(zzyd zzydVar) {
        int size = zzydVar.size();
        return zzydVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzaj(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zzak(zzzg zzzgVar, String str, Object[] objArr) {
        return new zzzr(zzzgVar, str, objArr);
    }

    protected static void zzan(Class cls, zzxv zzxvVar) {
        zzxvVar.zzam();
        zza.put(cls, zzxvVar);
    }

    protected static final boolean zzap(zzxv zzxvVar, boolean z2) {
        byte bByteValue = ((Byte) zzxvVar.zzb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzzp.zza().zzb(zzxvVar.getClass()).zzk(zzxvVar);
        if (z2) {
            zzxvVar.zzb(2, true != zZzk ? null : zzxvVar, null);
        }
        return zZzk;
    }

    private final int zzc(zzzt zzztVar) {
        return zzzp.zza().zzb(getClass()).zza(this);
    }

    private static zzxv zze(zzxv zzxvVar) throws zzyg {
        if (zzxvVar == null || zzxvVar.zzay()) {
            return zzxvVar;
        }
        zzyg zzygVarZza = new zzaaj(zzxvVar).zza();
        zzygVarZza.zzh(zzxvVar);
        throw zzygVarZza;
    }

    private static zzxv zzf(zzxv zzxvVar, byte[] bArr, int i2, int i3, zzxf zzxfVar) throws zzyg {
        zzxv zzxvVarZzad = zzxvVar.zzad();
        try {
            zzzt zzztVarZzb = zzzp.zza().zzb(zzxvVarZzad.getClass());
            zzztVarZzb.zzi(zzxvVarZzad, bArr, 0, i3, new zztp(zzxfVar));
            zzztVarZzb.zzf(zzxvVarZzad);
            return zzxvVarZzad;
        } catch (zzaaj e2) {
            zzyg zzygVarZza = e2.zza();
            zzygVarZza.zzh(zzxvVarZzad);
            throw zzygVarZza;
        } catch (zzyg e3) {
            e = e3;
            if (e.zzl()) {
                e = new zzyg(e);
            }
            e.zzh(zzxvVarZzad);
            throw e;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzyg) {
                throw ((zzyg) e4.getCause());
            }
            zzyg zzygVar = new zzyg(e4);
            zzygVar.zzh(zzxvVarZzad);
            throw zzygVar;
        } catch (IndexOutOfBoundsException unused) {
            zzyg zzygVarZzj = zzyg.zzj();
            zzygVarZzj.zzh(zzxvVarZzad);
            throw zzygVarZzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzzp.zza().zzb(getClass()).zzj(this, (zzxv) obj);
    }

    public final int hashCode() {
        if (zzaq()) {
            return zzW();
        }
        int i2 = this.zzb;
        if (i2 != 0) {
            return i2;
        }
        int iZzW = zzW();
        this.zzb = iZzW;
        return iZzW;
    }

    public final String toString() {
        return zzzi.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zztl
    final int zzQ(zzzt zzztVar) {
        if (zzaq()) {
            int iZza = zzztVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i2 = this.zzd & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int iZza2 = zzztVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    final int zzW() {
        return zzzp.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final int zzX() {
        int iZzc;
        if (zzaq()) {
            iZzc = zzc(null);
            if (iZzc < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iZzc);
            }
        } else {
            iZzc = this.zzd & Integer.MAX_VALUE;
            if (iZzc == Integer.MAX_VALUE) {
                iZzc = zzc(null);
                if (iZzc < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iZzc);
                }
                this.zzd = (-1) - (((-1) - ((-1) - (((-1) - this.zzd) | ((-1) - Integer.MIN_VALUE)))) & ((-1) - iZzc));
            }
        }
        return iZzc;
    }

    protected final zzxp zzY() {
        return (zzxp) zzb(5, null, null);
    }

    public final zzxp zzZ() {
        zzxp zzxpVar = (zzxp) zzb(5, null, null);
        zzxpVar.zzA(this);
        return zzxpVar;
    }

    final zzxv zzad() {
        return (zzxv) zzb(4, null, null);
    }

    protected final void zzal() {
        zzzp.zza().zzb(getClass()).zzf(this);
        zzam();
    }

    final void zzam() {
        this.zzd = (-1) - (((-1) - this.zzd) | ((-1) - Integer.MAX_VALUE));
    }

    final void zzao(int i2) {
        int i3 = (-1) - (((-1) - this.zzd) | ((-1) - Integer.MIN_VALUE));
        this.zzd = (i3 + Integer.MAX_VALUE) - (i3 & Integer.MAX_VALUE);
    }

    final boolean zzaq() {
        return (-1) - (((-1) - this.zzd) | ((-1) - Integer.MIN_VALUE)) != 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final /* synthetic */ zzzf zzau() {
        return (zzxp) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final /* synthetic */ zzzf zzav() {
        zzxp zzxpVar = (zzxp) zzb(5, null, null);
        zzxpVar.zzA(this);
        return zzxpVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzaw(zzuq zzuqVar) throws IOException {
        zzzp.zza().zzb(getClass()).zzm(this, zzur.zza(zzuqVar));
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final /* synthetic */ zzzg zzax() {
        return (zzxv) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final boolean zzay() {
        return zzap(this, Boolean.TRUE.booleanValue());
    }

    protected abstract Object zzb(int i2, Object obj, Object obj2);
}
