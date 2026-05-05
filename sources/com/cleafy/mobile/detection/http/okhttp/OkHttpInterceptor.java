package com.cleafy.mobile.detection.http.okhttp;

import com.cleafy.mobile.detection.agent.Cleafy;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import okhttp3.Interceptor;
import okhttp3.Response;
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
@Deprecated(level = DeprecationLevel.WARNING, message = "\u0018Y\u0001tT\u0001\u001aX^`u\n[|@bl5\u0017;\nz\u000fW\u0007Z}|\u000e<\u000fu|XmP\u0016\u001cwK\u0006\u0001??\u0013\\eG)]\\*p&H&\u001c0\"X \t7\u0007\u0003 ~Ic\u0014=CG#\u001e|\u0011", replaceWith = @ReplaceWith(expression = "com.cleafy.mobile.detection.agent.Cleafy.okHttpInterceptor", imports = {"com.cleafy.mobile.detection.agent.Cleafy"}))
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u0016DLшzŸA\u001cֶ;.p}ԕ0\u0012"}, d2 = {"\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@(Dh\tiAs\u0019=\\N\u0005U:\u0001$wl\u001d\u0010r,[t'R[X92", "\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t\u0016", "/fT;g&KS ~vl,"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class OkHttpInterceptor implements Interceptor {
    public static final OkHttpInterceptor INSTANCE = new OkHttpInterceptor();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        return Cleafy.getOkHttpInterceptor().intercept(chain);
    }
}
