package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import io.sentry.SentryBaseEvent;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzii implements ObjectEncoder {
    static final zzii zza = new zzii();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(SentryBaseEvent.JsonKeys.REQUEST);
        zzby zzbyVar = new zzby();
        zzbyVar.zza(1);
        builder.withProperty(zzbyVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("result");
        zzby zzbyVar2 = new zzby();
        zzbyVar2.zza(2);
        builder2.withProperty(zzbyVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("durationMs");
        zzby zzbyVar3 = new zzby();
        zzbyVar3.zza(3);
        builder3.withProperty(zzbyVar3.zzb()).build();
    }

    private zzii() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
