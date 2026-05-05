package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zziv implements ObjectEncoder {
    static final zziv zza = new zziv();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzby zzbyVar = new zzby();
        zzbyVar.zza(1);
        builder.withProperty(zzbyVar.zzb()).build();
    }

    private zziv() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
