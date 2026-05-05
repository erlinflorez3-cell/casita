package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzxp;
import com.google.android.gms.internal.gtm.zzxv;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class zzxp<MessageType extends zzxv<MessageType, BuilderType>, BuilderType extends zzxp<MessageType, BuilderType>> extends zztk<MessageType, BuilderType> {
    protected zzxv zza;
    private final zzxv zzb;

    protected zzxp(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaq()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzad();
    }

    private static void zza(Object obj, Object obj2) {
        zzzp.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    public final zzxp zzA(zzxv zzxvVar) {
        if (!this.zzb.equals(zzxvVar)) {
            if (!this.zza.zzaq()) {
                zzH();
            }
            zza(this.zza, zzxvVar);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.gtm.zzzf
    /* JADX INFO: renamed from: zzB */
    public final MessageType zzD() {
        MessageType messagetype = (MessageType) zzE();
        if (messagetype.zzay()) {
            return messagetype;
        }
        throw new zzaaj(messagetype);
    }

    @Override // com.google.android.gms.internal.gtm.zzzf
    /* JADX INFO: renamed from: zzC */
    public MessageType zzE() {
        if (!this.zza.zzaq()) {
            return (MessageType) this.zza;
        }
        this.zza.zzal();
        return (MessageType) this.zza;
    }

    protected final void zzG() {
        if (this.zza.zzaq()) {
            return;
        }
        zzH();
    }

    protected void zzH() {
        zzxv zzxvVarZzad = this.zzb.zzad();
        zza(zzxvVarZzad, this.zza);
        this.zza = zzxvVarZzad;
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final /* synthetic */ zzzg zzax() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final boolean zzay() {
        return zzxv.zzap(this.zza, false);
    }

    @Override // com.google.android.gms.internal.gtm.zztk
    protected final /* synthetic */ zztk zzw(zztl zztlVar) {
        zzA((zzxv) zztlVar);
        return this;
    }

    @Override // com.google.android.gms.internal.gtm.zztk, com.google.android.gms.internal.gtm.zzzf
    public final /* bridge */ /* synthetic */ zzzf zzy(zzuj zzujVar, zzxf zzxfVar) throws IOException {
        if (!this.zza.zzaq()) {
            zzH();
        }
        try {
            zzzp.zza().zzb(this.zza.getClass()).zzh(this.zza, zzuk.zzq(zzujVar), zzxfVar);
            return this;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof IOException) {
                throw ((IOException) e2.getCause());
            }
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zztk
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzxp zzv() {
        zzxp zzxpVar = (zzxp) this.zzb.zzb(5, null, null);
        zzxpVar.zza = zzE();
        return zzxpVar;
    }
}
