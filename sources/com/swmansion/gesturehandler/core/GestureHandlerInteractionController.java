package com.swmansion.gesturehandler.core;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4\u0012}\nlOOӄtev-\u001bq8\u000f\u0004{b%\f,\u007fESY*}(\n}Q\u0018o|Nr\u000fS\u000f\f\u0017'mrm\u001e\u0017k\u0017'2ppo;[qU=pt<\u0006N5R@\b\t\u0019\u001e:H\u0016w)F\u00120ZNNvRR;N5\" \bV$\u0011\u001ebh|9xtk>G'\u0013iHOUbv!\u0016+T[?\r%bN3N9M\u00195S\t\b\u0001^o\u000bMuU\tx'-,wv\u001eZނ\u0004\u001c"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u0014G5]v4CJ]0f[PG\u001d!g\u0018U2\r\u0012/", "", "Ag^B_+!O\"}\u0002^9Y\t\ra\t&{G\b\u0017\u0016$\u0004", "", "6`]1_,K", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "=sW2e\u000f:\\\u0018\u0006zk", "Ag^B_++S\u0017\t|g0\u0012\t\u001di\b8\u0003O| \u0017Q\u007f\u001cC\u000b", "Ag^B_++S%\u000f~k,_\u00058d\u0007(\t/\u000b\t\u0013K~nF\u0004\u00061]\u00050Dm", "Ag^B_+0O\u001d\u000e[h9_\u00058d\u0007(\t!|\u001b\u001eW|\u000e", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface GestureHandlerInteractionController {
    boolean shouldHandlerBeCancelledBy(GestureHandler<?> gestureHandler, GestureHandler<?> gestureHandler2);

    boolean shouldRecognizeSimultaneously(GestureHandler<?> gestureHandler, GestureHandler<?> gestureHandler2);

    boolean shouldRequireHandlerToWaitForFailure(GestureHandler<?> gestureHandler, GestureHandler<?> gestureHandler2);

    boolean shouldWaitForHandlerFailure(GestureHandler<?> gestureHandler, GestureHandler<?> gestureHandler2);
}
