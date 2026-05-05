package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import io.sentry.protocol.Device;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzig implements ObjectEncoder {
    static final zzig zza = new zzig();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("status");
        zzby zzbyVar = new zzby();
        zzbyVar.zza(1);
        builder.withProperty(zzbyVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RRWebOptionsEvent.EVENT_TAG);
        zzby zzbyVar2 = new zzby();
        zzbyVar2.zza(2);
        builder2.withProperty(zzbyVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(Device.JsonKeys.MODEL);
        zzby zzbyVar3 = new zzby();
        zzbyVar3.zza(3);
        builder3.withProperty(zzbyVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder(Device.JsonKeys.LANGUAGE);
        zzby zzbyVar4 = new zzby();
        zzbyVar4.zza(4);
        builder4.withProperty(zzbyVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("segmentationRequest");
        zzby zzbyVar5 = new zzby();
        zzbyVar5.zza(5);
        builder5.withProperty(zzbyVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("segmentationResult");
        zzby zzbyVar6 = new zzby();
        zzbyVar6.zza(6);
        builder6.withProperty(zzbyVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("aggregatedSegmentations");
        zzby zzbyVar7 = new zzby();
        zzbyVar7.zza(7);
        builder7.withProperty(zzbyVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("durationMs");
        zzby zzbyVar8 = new zzby();
        zzbyVar8.zza(8);
        builder8.withProperty(zzbyVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("nativeSegmentationException");
        zzby zzbyVar9 = new zzby();
        zzbyVar9.zza(9);
        builder9.withProperty(zzbyVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("downloadErrorCodes");
        zzby zzbyVar10 = new zzby();
        zzbyVar10.zza(10);
        builder10.withProperty(zzbyVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder(ClientCookie.DOMAIN_ATTR);
        zzby zzbyVar11 = new zzby();
        zzbyVar11.zza(11);
        builder11.withProperty(zzbyVar11.zzb()).build();
    }

    private zzig() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
