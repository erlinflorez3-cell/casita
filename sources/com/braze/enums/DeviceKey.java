package com.braze.enums;

import io.sentry.protocol.Device;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\u00128\u000b4O\u0005Ӵ+(Մ7lz;@D\u0014߉\\Q\u00147\u0015k\f82[<qq<ڈ\u001e}0\u000b ]ug\u0007J\t\fß\u0013\f\u001eю\u0003.OX\u0007az\u000f8GX?9SX=?g]6\u000b(\u001b\">\u0003m\u0001 41\u0010|\u0006,K\u0012\u001e\u0019@vG;\rS\u0013\u0003\u0012\fMő\u0005."}, d2 = {"\u001ab^:\")KO.~D^5\r\u0011=/^(\rD~\u0017|G\u0004c", "", "9dh", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "5dc\u0018X@", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u000fM3\u001fB\u0010\u001dM\n^gL\u0010fq", "\u0011@A\u001f<\f+", "\u0010Q0\u001b7", "\u001bN3\u0012?", " DB\u001c?\u001c-7\u0003g", "\u001aN2\u000e?\f", "\"H<\u0012M\u0016'3", "\u001cNC\u00169\u0010\u001c/\bbdG\u001avh\u0018A\\\u000f[\u001f", "\u0017RN\u000f4\n$5\u0006hjG\u000bvu\u000fSn\u0015_\u001eovu", "\u0015N>\u0014?\f8/woZK\u001b`v\u0013Na\"_\u001f", "\u000fCN!E\b\u001c9|g\\X\fed\fL_\u0007", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public enum DeviceKey {
    ANDROID_VERSION("os_version"),
    CARRIER("carrier"),
    BRAND(Device.JsonKeys.BRAND),
    MODEL(Device.JsonKeys.MODEL),
    RESOLUTION("resolution"),
    LOCALE("locale"),
    TIMEZONE("time_zone"),
    NOTIFICATIONS_ENABLED("remote_notification_enabled"),
    IS_BACKGROUND_RESTRICTED("android_is_background_restricted"),
    GOOGLE_ADVERTISING_ID("google_ad_id"),
    AD_TRACKING_ENABLED("ad_tracking_enabled");

    private final String key;

    DeviceKey(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
