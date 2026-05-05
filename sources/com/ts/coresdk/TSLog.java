package com.ts.coresdk;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007tjA0JeP.`T2\u000fq\u0002<$iҕwڙ;kڼ.\"7`\u000fnmnН^\rI\u001e\u0014&A\u0010:Omx\f\u0017?6PoW3{nm=nvN\u0005N3R<\b\t\u0019\u001aXKV{ټGM\u0012\u0018>G9k`\u0017e\u0005H\u00176B.\u00016\\\u0016MfLz_R/Q\u0004\u001aF\\+w0+P=NZ'\u001b\u007fy A?e=[*٨\u0007\tXeM\u000e\b\u0017K\u0011\u0001'U0ywe6p\u007fB\u0014[S\u001b_\u000b&\u000b\u0006\u0002d\u001a+CO\u0012N\u0017\u0013߭{|\u0002\u0019J\u000bV+5UF-Hk8\u0012At\u000bSnO2bP\u0002\u0013ad\u0018U\u0004A/Q\u001b\u0015T(@ϭR9\u0002\u0012\u001b%k&|/sT<eE\u001fbwi1\u007f?mL\\\fq=\u001c\u0005!f\u0010.\u001c0u\u0003u\u0001 2\u0019+Ei@"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u000f\u0006BV", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", ">0", "", ">1", "", ExifInterface.GPS_MEASUREMENT_2D, "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D\b(", "", ">2", ExifInterface.GPS_MEASUREMENT_3D, "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D+<\u001b\u0019(\u0013\t7q\u0003U\u0005\u0011Bt\u0003>S\u0017GOXf", "7", "D", ExifInterface.LONGITUDE_EAST, "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSLog {
    public static final TSLog INSTANCE = new TSLog();

    private TSLog() {
    }

    @JvmStatic
    public static final void d(Context context, ITSModuleInfo iTSModuleInfo, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        com.ts.coresdk.logger.a.a.INSTANCE.f(context, iTSModuleInfo, str);
    }

    @JvmStatic
    public static final void e(Context context, ITSModuleInfo iTSModuleInfo, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        com.ts.coresdk.logger.a.a.INSTANCE.a(context, iTSModuleInfo, str, th);
    }

    public static /* synthetic */ void e$default(Context context, ITSModuleInfo iTSModuleInfo, String str, Throwable th, int i2, Object obj) {
        if ((i2 + 8) - (i2 | 8) != 0) {
            th = null;
        }
        e(context, iTSModuleInfo, str, th);
    }

    @JvmStatic
    public static final void i(Context context, ITSModuleInfo iTSModuleInfo, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        com.ts.coresdk.logger.a.a.INSTANCE.j(context, iTSModuleInfo, str);
    }

    @JvmStatic
    public static final void v(Context context, ITSModuleInfo iTSModuleInfo, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        com.ts.coresdk.logger.a.a.INSTANCE.g(context, iTSModuleInfo, str);
    }

    @JvmStatic
    public static final void w(Context context, ITSModuleInfo iTSModuleInfo, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        com.ts.coresdk.logger.a.a.INSTANCE.h(context, iTSModuleInfo, str);
    }
}
