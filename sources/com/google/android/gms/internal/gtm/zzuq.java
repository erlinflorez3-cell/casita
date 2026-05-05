package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzuq extends zztt {
    private static final Logger zza = Logger.getLogger(zzuq.class.getName());
    private static final boolean zzb = zzaau.zzx();
    public static final /* synthetic */ int zzf = 0;
    zzur zze;

    private zzuq() {
    }

    /* synthetic */ zzuq(zzup zzupVar) {
    }

    public static int zzA(zzzg zzzgVar) {
        int iZzX = zzzgVar.zzX();
        return zzD(iZzX) + iZzX;
    }

    static int zzB(zzzg zzzgVar, zzzt zzztVar) {
        int iZzQ = ((zztl) zzzgVar).zzQ(zzztVar);
        return zzD(iZzQ) + iZzQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int zzC(String str) {
        int length;
        try {
            str = zzaaz.zzc(str);
            length = str;
        } catch (zzaay unused) {
            length = str.getBytes(zzye.zzb).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i2) {
        if (((-128) & i2) == 0) {
            return 1;
        }
        if ((-1) - (((-1) - i2) | ((-1) - (-16384))) == 0) {
            return 2;
        }
        if ((-1) - (((-1) - (-2097152)) | ((-1) - i2)) == 0) {
            return 3;
        }
        return (-1) - (((-1) - i2) | ((-1) - (-268435456))) == 0 ? 4 : 5;
    }

    public static int zzE(long j2) {
        int i2;
        if (((-128) + j2) - ((-128) | j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if ((-1) - (((-1) - (-34359738368L)) | ((-1) - j2)) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            j2 >>>= 14;
            i2 += 2;
        }
        return (j2 + (-16384)) - (j2 | (-16384)) != 0 ? i2 + 1 : i2;
    }

    @Deprecated
    static int zzy(int i2, zzzg zzzgVar, zzzt zzztVar) {
        int iZzQ = ((zztl) zzzgVar).zzQ(zzztVar);
        int iZzD = zzD(i2 << 3);
        return iZzD + iZzD + iZzQ;
    }

    public static int zzz(int i2) {
        if (i2 >= 0) {
            return zzD(i2);
        }
        return 10;
    }

    final void zzF(String str, zzaay zzaayVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzaayVar);
        byte[] bytes = str.getBytes(zzye.zzb);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzun(e2);
        }
    }

    public abstract void zzJ() throws IOException;

    public abstract void zzK(byte b2) throws IOException;

    public abstract void zzL(int i2, boolean z2) throws IOException;

    public abstract void zzM(int i2, zzud zzudVar) throws IOException;

    @Override // com.google.android.gms.internal.gtm.zztt
    public abstract void zza(byte[] bArr, int i2, int i3) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i2, int i3) throws IOException;

    public abstract void zzi(int i2) throws IOException;

    public abstract void zzj(int i2, long j2) throws IOException;

    public abstract void zzk(long j2) throws IOException;

    public abstract void zzl(int i2, int i3) throws IOException;

    public abstract void zzm(int i2) throws IOException;

    abstract void zzn(int i2, zzzg zzzgVar, zzzt zzztVar) throws IOException;

    public abstract void zzo(int i2, zzzg zzzgVar) throws IOException;

    public abstract void zzp(int i2, zzud zzudVar) throws IOException;

    public abstract void zzq(int i2, String str) throws IOException;

    public abstract void zzs(int i2, int i3) throws IOException;

    public abstract void zzt(int i2, int i3) throws IOException;

    public abstract void zzu(int i2) throws IOException;

    public abstract void zzv(int i2, long j2) throws IOException;

    public abstract void zzw(long j2) throws IOException;
}
