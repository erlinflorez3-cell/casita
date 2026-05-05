package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzhv implements ObjectEncoder {
    static final zzhv zza = new zzhv();
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final FieldDescriptor zzd;
    private static final FieldDescriptor zze;
    private static final FieldDescriptor zzf;
    private static final FieldDescriptor zzg;
    private static final FieldDescriptor zzh;
    private static final FieldDescriptor zzi;
    private static final FieldDescriptor zzj;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("name");
        zzby zzbyVar = new zzby();
        zzbyVar.zza(1);
        zzb = builder.withProperty(zzbyVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("version");
        zzby zzbyVar2 = new zzby();
        zzbyVar2.zza(2);
        zzc = builder2.withProperty(zzbyVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("source");
        zzby zzbyVar3 = new zzby();
        zzbyVar3.zza(3);
        zzd = builder3.withProperty(zzbyVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("uri");
        zzby zzbyVar4 = new zzby();
        zzbyVar4.zza(4);
        zze = builder4.withProperty(zzbyVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hash");
        zzby zzbyVar5 = new zzby();
        zzbyVar5.zza(5);
        zzf = builder5.withProperty(zzbyVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("modelType");
        zzby zzbyVar6 = new zzby();
        zzbyVar6.zza(6);
        zzg = builder6.withProperty(zzbyVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder(RRWebVideoEvent.JsonKeys.SIZE);
        zzby zzbyVar7 = new zzby();
        zzbyVar7.zza(7);
        zzh = builder7.withProperty(zzbyVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("hasLabelMap");
        zzby zzbyVar8 = new zzby();
        zzbyVar8.zza(8);
        zzi = builder8.withProperty(zzbyVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("isManifestModel");
        zzby zzbyVar9 = new zzby();
        zzbyVar9.zza(9);
        zzj = builder9.withProperty(zzbyVar9.zzb()).build();
    }

    private zzhv() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzoj zzojVar = (zzoj) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, (Object) null);
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, zzojVar.zzb());
        objectEncoderContext2.add(zze, (Object) null);
        objectEncoderContext2.add(zzf, zzojVar.zze());
        objectEncoderContext2.add(zzg, zzojVar.zza());
        objectEncoderContext2.add(zzh, zzojVar.zzd());
        objectEncoderContext2.add(zzi, (Object) null);
        objectEncoderContext2.add(zzj, zzojVar.zzc());
    }
}
