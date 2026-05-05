package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzkt implements ObjectEncoder {
    static final zzkt zza = new zzkt();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("languageOption");
        zzby zzbyVar = new zzby();
        zzbyVar.zza(3);
        builder.withProperty(zzbyVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isUsingLegacyApi");
        zzby zzbyVar2 = new zzby();
        zzbyVar2.zza(4);
        builder2.withProperty(zzbyVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("sdkVersion");
        zzby zzbyVar3 = new zzby();
        zzbyVar3.zza(5);
        builder3.withProperty(zzbyVar3.zzb()).build();
    }

    private zzkt() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
