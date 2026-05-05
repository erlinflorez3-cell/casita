package com.facebook.react.interfaces;

import java.util.concurrent.TimeUnit;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&˛\bDRш|İI\u0006F\u000b6B\u0015\"4\u0012}\bnjG9LeN/ZS8\u000fsڔ<$i+yّCU0}*ޛU3}˧\u0017L`ŏQ\u000e6\u0016'jtWcyu\u001a%1pq(5cn\u001c<'\u0019~\u0012.6::\u0010\u00047ɝplǘzzQPT\u0018>F\t:\u0001\u0014\u0014)b\u0018\u0014F8\u0001Lc.r~NzfR/Q\n0f\u0017-m:\u0015M;Q\u001bKU\u000fo(C@e<E)a\u000f\u001fR\nL3E\u007fK\u001dj=&YX:{ΥWÜϯ\u0015/W\u000fc\u0012T[ԍUpа+*"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Hy.=Q\u001f=MP<g2\u001ej", "\"QT@h3M", "", "5dc\u0012e9H`", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "5dc\u001fX:NZ(", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "7r2.a*>Z ~y", "", "7r2<`7ES(~y", "7r5.h3MS\u0018", "E`XA96K1#\u0007\u0006e,\f\r9n", "", "2ta.g0H\\", "", "Bh\\2H5Bb", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface TaskInterface<TResult> {
    Exception getError();

    TResult getResult();

    boolean isCancelled();

    boolean isCompleted();

    boolean isFaulted();

    void waitForCompletion() throws InterruptedException;

    boolean waitForCompletion(long j2, TimeUnit timeUnit) throws InterruptedException;
}
