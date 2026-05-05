package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zziu implements ObjectEncoder {
    static final zziu zza = new zziu();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzby zzbyVar = new zzby();
        zzbyVar.zza(1);
        builder.withProperty(zzbyVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RRWebOptionsEvent.EVENT_TAG);
        zzby zzbyVar2 = new zzby();
        zzbyVar2.zza(2);
        builder2.withProperty(zzbyVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzby zzbyVar3 = new zzby();
        zzbyVar3.zza(3);
        builder3.withProperty(zzbyVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("documentPresenceConfidence");
        zzby zzbyVar4 = new zzby();
        zzbyVar4.zza(4);
        builder4.withProperty(zzbyVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("documentCornerConfidence");
        zzby zzbyVar5 = new zzby();
        zzbyVar5.zza(5);
        builder5.withProperty(zzbyVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("documentRotationSuggestionDegrees");
        zzby zzbyVar6 = new zzby();
        zzbyVar6.zza(6);
        builder6.withProperty(zzbyVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("documentRotationSuggestionConfidence");
        zzby zzbyVar7 = new zzby();
        zzbyVar7.zza(7);
        builder7.withProperty(zzbyVar7.zzb()).build();
    }

    private zziu() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
