package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzll implements ObjectEncoder {
    static final zzll zza = new zzll();
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final FieldDescriptor zzd;
    private static final FieldDescriptor zze;
    private static final FieldDescriptor zzf;
    private static final FieldDescriptor zzg;
    private static final FieldDescriptor zzh;
    private static final FieldDescriptor zzi;
    private static final FieldDescriptor zzj;
    private static final FieldDescriptor zzk;
    private static final FieldDescriptor zzl;
    private static final FieldDescriptor zzm;
    private static final FieldDescriptor zzn;
    private static final FieldDescriptor zzo;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("appId");
        zzby zzbyVar = new zzby();
        zzbyVar.zza(1);
        zzb = builder.withProperty(zzbyVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("appVersion");
        zzby zzbyVar2 = new zzby();
        zzbyVar2.zza(2);
        zzc = builder2.withProperty(zzbyVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("firebaseProjectId");
        zzby zzbyVar3 = new zzby();
        zzbyVar3.zza(3);
        zzd = builder3.withProperty(zzbyVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("mlSdkVersion");
        zzby zzbyVar4 = new zzby();
        zzbyVar4.zza(4);
        zze = builder4.withProperty(zzbyVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tfliteSchemaVersion");
        zzby zzbyVar5 = new zzby();
        zzbyVar5.zza(5);
        zzf = builder5.withProperty(zzbyVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("gcmSenderId");
        zzby zzbyVar6 = new zzby();
        zzbyVar6.zza(6);
        zzg = builder6.withProperty(zzbyVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("apiKey");
        zzby zzbyVar7 = new zzby();
        zzbyVar7.zza(7);
        zzh = builder7.withProperty(zzbyVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("languages");
        zzby zzbyVar8 = new zzby();
        zzbyVar8.zza(8);
        zzi = builder8.withProperty(zzbyVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("mlSdkInstanceId");
        zzby zzbyVar9 = new zzby();
        zzbyVar9.zza(9);
        zzj = builder9.withProperty(zzbyVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isClearcutClient");
        zzby zzbyVar10 = new zzby();
        zzbyVar10.zza(10);
        zzk = builder10.withProperty(zzbyVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("isStandaloneMlkit");
        zzby zzbyVar11 = new zzby();
        zzbyVar11.zza(11);
        zzl = builder11.withProperty(zzbyVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("isJsonLogging");
        zzby zzbyVar12 = new zzby();
        zzbyVar12.zza(12);
        zzm = builder12.withProperty(zzbyVar12.zzb()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("buildLevel");
        zzby zzbyVar13 = new zzby();
        zzbyVar13.zza(13);
        zzn = builder13.withProperty(zzbyVar13.zzb()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("optionalModuleVersion");
        zzby zzbyVar14 = new zzby();
        zzbyVar14.zza(14);
        zzo = builder14.withProperty(zzbyVar14.zzb()).build();
    }

    private zzll() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzsl zzslVar = (zzsl) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzslVar.zzg());
        objectEncoderContext2.add(zzc, zzslVar.zzh());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, zzslVar.zzj());
        objectEncoderContext2.add(zzf, zzslVar.zzk());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, zzslVar.zza());
        objectEncoderContext2.add(zzj, zzslVar.zzi());
        objectEncoderContext2.add(zzk, zzslVar.zzb());
        objectEncoderContext2.add(zzl, zzslVar.zzd());
        objectEncoderContext2.add(zzm, zzslVar.zzc());
        objectEncoderContext2.add(zzn, zzslVar.zze());
        objectEncoderContext2.add(zzo, zzslVar.zzf());
    }
}
