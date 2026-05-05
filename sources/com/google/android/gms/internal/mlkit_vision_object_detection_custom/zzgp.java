package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import io.sentry.SentryEvent;
import io.sentry.protocol.Device;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzgp implements ObjectEncoder {
    static final zzgp zza = new zzgp();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("sdkVersion");
        zzby zzbyVar = new zzby();
        zzbyVar.zza(1);
        builder.withProperty(zzbyVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("osBuild");
        zzby zzbyVar2 = new zzby();
        zzbyVar2.zza(2);
        builder2.withProperty(zzbyVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(Device.JsonKeys.BRAND);
        zzby zzbyVar3 = new zzby();
        zzbyVar3.zza(3);
        builder3.withProperty(zzbyVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder(Device.TYPE);
        zzby zzbyVar4 = new zzby();
        zzbyVar4.zza(4);
        builder4.withProperty(zzbyVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hardware");
        zzby zzbyVar5 = new zzby();
        zzbyVar5.zza(5);
        builder5.withProperty(zzbyVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder(Device.JsonKeys.MANUFACTURER);
        zzby zzbyVar6 = new zzby();
        zzbyVar6.zza(6);
        builder6.withProperty(zzbyVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder(Device.JsonKeys.MODEL);
        zzby zzbyVar7 = new zzby();
        zzbyVar7.zza(7);
        builder7.withProperty(zzbyVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("product");
        zzby zzbyVar8 = new zzby();
        zzbyVar8.zza(8);
        builder8.withProperty(zzbyVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("soc");
        zzby zzbyVar9 = new zzby();
        zzbyVar9.zza(9);
        builder9.withProperty(zzbyVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("socMetaBuildId");
        zzby zzbyVar10 = new zzby();
        zzbyVar10.zza(10);
        builder10.withProperty(zzbyVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder(SentryEvent.JsonKeys.FINGERPRINT);
        zzby zzbyVar11 = new zzby();
        zzbyVar11.zza(11);
        builder11.withProperty(zzbyVar11.zzb()).build();
    }

    private zzgp() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
