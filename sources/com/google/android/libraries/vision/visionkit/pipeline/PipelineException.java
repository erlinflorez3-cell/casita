package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdv;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzki;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzko;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzkz;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
public class PipelineException extends Exception {
    private static final String ROOT_CAUSE_DELIMITER = "#vk ";
    private final zzch statusCode;
    private final String statusMessage;
    private final zzex visionkitStatus;

    public PipelineException(int i2, String str) {
        super(zzch.values()[i2].zza() + ": " + str);
        this.statusCode = zzch.values()[i2];
        this.statusMessage = str;
        this.visionkitStatus = null;
    }

    private PipelineException(zzex zzexVar) {
        super(zzch.values()[zzexVar.zza()].zza() + ": " + zzexVar.zze());
        this.statusCode = zzch.values()[zzexVar.zza()];
        this.statusMessage = zzexVar.zze();
        this.visionkitStatus = zzexVar;
    }

    PipelineException(byte[] bArr) throws zzbew {
        this(zzex.zzd(bArr, zzbdv.zza()));
    }

    public List<zzag> getComponentStatuses() {
        zzex zzexVar = this.visionkitStatus;
        return zzexVar != null ? zzexVar.zzf() : zzkz.zzh();
    }

    public zzki<String> getRootCauseMessage() {
        Object next;
        if (!this.statusMessage.contains(ROOT_CAUSE_DELIMITER)) {
            return zzki.zzd();
        }
        List listZzb = zzko.zza(ROOT_CAUSE_DELIMITER).zzb(this.statusMessage);
        if (!(listZzb instanceof List)) {
            Iterator it = listZzb.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
        } else {
            if (listZzb.isEmpty()) {
                throw new NoSuchElementException();
            }
            next = listZzb.get(listZzb.size() - 1);
        }
        return zzki.zze((String) next);
    }

    public zzch getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }
}
