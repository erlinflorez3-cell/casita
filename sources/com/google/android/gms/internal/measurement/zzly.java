package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorT] */
/* JADX INFO: loaded from: classes8.dex */
final class zzly<FieldDescriptorT> extends zzlv<FieldDescriptorT, Object> {
    zzly() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.zzlv
    public final void zzd() {
        if (!zze()) {
            for (int i2 = 0; i2 < zza(); i2++) {
                Map.Entry<FieldDescriptorT, Object> entryZza = zza(i2);
                if (((zzjo) entryZza.getKey()).zze()) {
                    entryZza.setValue(Collections.unmodifiableList((List) entryZza.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorT, Object> entry : zzb()) {
                if (((zzjo) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzd();
    }
}
