package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzkd implements ObjectEncoder {
    static final zzkd zza = new zzkd();
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final FieldDescriptor zzd;
    private static final FieldDescriptor zze;
    private static final FieldDescriptor zzf;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzby zzbyVar = new zzby();
        zzbyVar.zza(1);
        zzb = builder.withProperty(zzbyVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzby zzbyVar2 = new zzby();
        zzbyVar2.zza(2);
        zzc = builder2.withProperty(zzbyVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("totalInitializationMs");
        zzby zzbyVar3 = new zzby();
        zzbyVar3.zza(3);
        zzd = builder3.withProperty(zzbyVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("loggingInitializationMs");
        zzby zzbyVar4 = new zzby();
        zzbyVar4.zza(4);
        zze = builder4.withProperty(zzbyVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("otherErrors");
        zzby zzbyVar5 = new zzby();
        zzbyVar5.zza(5);
        zzf = builder5.withProperty(zzbyVar5.zzb()).build();
    }

    private zzkd() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzrc zzrcVar = (zzrc) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzrcVar.zzc());
        objectEncoderContext2.add(zzc, zzrcVar.zzb());
        objectEncoderContext2.add(zzd, zzrcVar.zze());
        objectEncoderContext2.add(zze, zzrcVar.zzd());
        objectEncoderContext2.add(zzf, zzrcVar.zza());
    }
}
