package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzic implements ObjectEncoder {
    static final zzic zza = new zzic();
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final FieldDescriptor zzd;
    private static final FieldDescriptor zze;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("category");
        zzby zzbyVar = new zzby();
        zzbyVar.zza(1);
        zzb = builder.withProperty(zzbyVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("classificationConfidence");
        zzby zzbyVar2 = new zzby();
        zzbyVar2.zza(2);
        zzc = builder2.withProperty(zzbyVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("trackingId");
        zzby zzbyVar3 = new zzby();
        zzbyVar3.zza(3);
        zzd = builder3.withProperty(zzbyVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("labelCount");
        zzby zzbyVar4 = new zzby();
        zzbyVar4.zza(4);
        zze = builder4.withProperty(zzbyVar4.zzb()).build();
    }

    private zzic() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzos zzosVar = (zzos) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, (Object) null);
        objectEncoderContext2.add(zzc, zzosVar.zza());
        objectEncoderContext2.add(zzd, zzosVar.zzc());
        objectEncoderContext2.add(zze, zzosVar.zzb());
    }
}
