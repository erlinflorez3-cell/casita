package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzev<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>> extends zzdq<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzha zzc = zzha.zza();

    static zzev zzb(Class cls) {
        Map map = zzb;
        zzev zzevVar = (zzev) map.get(cls);
        if (zzevVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzevVar = (zzev) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzevVar == null) {
            zzevVar = (zzev) ((zzev) zzhj.zze(cls)).zzn(6, null, null);
            if (zzevVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzevVar);
        }
        return zzevVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r2 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static com.google.android.gms.internal.auth.zzev zzd(com.google.android.gms.internal.auth.zzev r5, byte[] r6) throws com.google.android.gms.internal.auth.zzfb {
        /*
            int r2 = r6.length
            com.google.android.gms.internal.auth.zzel r1 = com.google.android.gms.internal.auth.zzel.zza
            r0 = 0
            com.google.android.gms.internal.auth.zzev r6 = zzo(r5, r6, r0, r2, r1)
            if (r6 == 0) goto L1e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r5 = r0.booleanValue()
            r4 = 1
            r3 = 0
            java.lang.Object r0 = r6.zzn(r4, r3, r3)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            if (r0 != r4) goto L1f
        L1e:
            return r6
        L1f:
            if (r0 == 0) goto L3f
            java.lang.Class r1 = r6.getClass()
            com.google.android.gms.internal.auth.zzgf r0 = com.google.android.gms.internal.auth.zzgf.zza()
            com.google.android.gms.internal.auth.zzgi r0 = r0.zzb(r1)
            boolean r2 = r0.zzi(r6)
            if (r5 == 0) goto L3a
            if (r4 == r2) goto L3d
            r1 = r3
        L36:
            r0 = 2
            r6.zzn(r0, r1, r3)
        L3a:
            if (r2 == 0) goto L3f
            goto L1e
        L3d:
            r1 = r6
            goto L36
        L3f:
            com.google.android.gms.internal.auth.zzgy r0 = new com.google.android.gms.internal.auth.zzgy
            r0.<init>(r6)
            com.google.android.gms.internal.auth.zzfb r0 = r0.zza()
            r0.zze(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzev.zzd(com.google.android.gms.internal.auth.zzev, byte[]):com.google.android.gms.internal.auth.zzev");
    }

    protected static zzez zzf() {
        return zzgg.zze();
    }

    static Object zzg(Method method, Object obj, Object... objArr) {
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

    protected static Object zzh(zzfx zzfxVar, String str, Object[] objArr) {
        return new zzgh(zzfxVar, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    protected static void zzk(Class cls, zzev zzevVar) {
        zzevVar.zzj();
        zzb.put(cls, zzevVar);
    }

    private static zzev zzo(zzev zzevVar, byte[] bArr, int i2, int i3, zzel zzelVar) throws zzfb {
        zzev zzevVarZzc = zzevVar.zzc();
        try {
            zzgi zzgiVarZzb = zzgf.zza().zzb(zzevVarZzc.getClass());
            zzgiVarZzb.zzg(zzevVarZzc, bArr, 0, i3, new zzdt(zzelVar));
            zzgiVarZzb.zze(zzevVarZzc);
            return zzevVarZzc;
        } catch (zzfb e2) {
            e2.zze(zzevVarZzc);
            throw e2;
        } catch (zzgy e3) {
            zzfb zzfbVarZza = e3.zza();
            zzfbVarZza.zze(zzevVarZzc);
            throw zzfbVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzfb) {
                throw ((zzfb) e4.getCause());
            }
            zzfb zzfbVar = new zzfb(e4);
            zzfbVar.zze(zzevVarZzc);
            throw zzfbVar;
        } catch (IndexOutOfBoundsException unused) {
            zzfb zzfbVarZzf = zzfb.zzf();
            zzfbVarZzf.zze(zzevVarZzc);
            throw zzfbVarZzf;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgf.zza().zzb(getClass()).zzh(this, (zzev) obj);
    }

    public final int hashCode() {
        if (zzm()) {
            return zza();
        }
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int iZza = zza();
        this.zza = iZza;
        return iZza;
    }

    public final String toString() {
        return zzfz.zza(this, super.toString());
    }

    final int zza() {
        return zzgf.zza().zzb(getClass()).zza(this);
    }

    final zzev zzc() {
        return (zzev) zzn(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* synthetic */ zzfx zze() {
        return (zzev) zzn(6, null, null);
    }

    protected final void zzi() {
        zzgf.zza().zzb(getClass()).zze(this);
        zzj();
    }

    final void zzj() {
        this.zzd = (-1) - (((-1) - this.zzd) | ((-1) - Integer.MAX_VALUE));
    }

    final void zzl(int i2) {
        this.zzd = (-1) - (((-1) - ((-1) - (((-1) - this.zzd) | ((-1) - Integer.MIN_VALUE)))) & ((-1) - Integer.MAX_VALUE));
    }

    final boolean zzm() {
        return (-1) - (((-1) - this.zzd) | ((-1) - Integer.MIN_VALUE)) != 0;
    }

    protected abstract Object zzn(int i2, Object obj, Object obj2);
}
