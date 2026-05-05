package com.ts.coresdk;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
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
@Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000ePLcz\nI\u0006>é4ɘ~8ܥBw5n+@6DͿL0XY8\u00164\u001cB&s&\bBq٥:\u0002(ޛ]O}f\u001fNh\u000b[\u000f4\u0015?̚2֒Yzc\u0014\u001d5\u000b\u0010M7eqS8\u000fsV\t&݅09\u0010\u00041\u001e8H(v1ŏ\u0012Ï\u0018ضDr@V\u001bR"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxJ\u000e2\u0005.\u0010$\u001bPqkF\u007f65f\r*DC", "", ">/", "\"", "1n]CX9M8'\t\u0004L;\n\r8gn2cJ\u007f\u0017\u001e", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "1n]CX9M;#}ze\u001b\u0007m=o\t\u0016\u000bM\u0005 \u0019", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class JsonStringConvertor {
    public static final JsonStringConvertor INSTANCE = new JsonStringConvertor();

    private JsonStringConvertor() {
    }

    public final /* synthetic */ <T> T convertJsonStringToModel(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Gson gson = new Gson();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) gson.fromJson(str, (Class) Object.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final /* synthetic */ <T> String convertModelToJsonString(T t2) {
        try {
            return new Gson().toJson(t2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
