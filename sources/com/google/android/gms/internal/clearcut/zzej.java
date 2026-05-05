package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* JADX INFO: loaded from: classes8.dex */
final class zzej<FieldDescriptorType> extends zzei<FieldDescriptorType, Object> {
    zzej(int i2) {
        super(i2, null);
    }

    @Override // com.google.android.gms.internal.clearcut.zzei
    public final void zzv() {
        if (!isImmutable()) {
            for (int i2 = 0; i2 < zzdr(); i2++) {
                Map.Entry<FieldDescriptorType, Object> entryZzak = zzak(i2);
                if (((zzca) entryZzak.getKey()).zzaw()) {
                    entryZzak.setValue(Collections.unmodifiableList((List) entryZzak.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : zzds()) {
                if (((zzca) entry.getKey()).zzaw()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzv();
    }
}
