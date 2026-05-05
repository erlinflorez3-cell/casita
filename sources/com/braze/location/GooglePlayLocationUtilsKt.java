package com.braze.location;

import com.braze.models.BrazeGeofence;
import com.google.android.gms.location.Geofence;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!4i\bDZc|İY\u000e>éFB-!T\u0012&\u0007§n:"}, d2 = {"Bn62b->\\\u0017~", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Ny\f8\u0006)?bG\u00027w\u0017.VA;A", "\u001ab^:\")KO.~Df6{\t6sI\u0005\t<\u0016\u0017xGy\u000f<\u007f#5/", "/mS?b0=\u001b'}\u0001&3\u0007\u0007+t\u00042\u0005:\u000e\u0017\u001eGk\u001c<"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class GooglePlayLocationUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public static final Geofence toGeofence(BrazeGeofence brazeGeofence) {
        Intrinsics.checkNotNullParameter(brazeGeofence, "<this>");
        Geofence.Builder builder = new Geofence.Builder();
        builder.setRequestId(brazeGeofence.getId()).setCircularRegion(brazeGeofence.getLatitude(), brazeGeofence.getLongitude(), brazeGeofence.getRadiusMeter()).setNotificationResponsiveness(brazeGeofence.getNotificationResponsivenessMs()).setExpirationDuration(-1L);
        ?? enterEvents = brazeGeofence.getEnterEvents();
        int i2 = enterEvents;
        if (brazeGeofence.getExitEvents()) {
            i2 = (-1) - (((-1) - enterEvents) & ((-1) - 2));
        }
        builder.setTransitionTypes(i2);
        Geofence geofenceBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(geofenceBuild, "builder.build()");
        return geofenceBuild;
    }
}
