package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzmc implements ObjectEncoder {
    static final zzmc zza = new zzmc();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RRWebOptionsEvent.EVENT_TAG);
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        builder.withProperty(zzfaVar.zzb()).build();
    }

    private zzmc() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
