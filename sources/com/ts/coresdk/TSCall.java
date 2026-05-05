package com.ts.coresdk;

import kotlin.Metadata;
import okhttp3.Request;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eDLcz\u0006I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?0LeV7ZS0\u0010s{J$c$wCCU(Ԃ*ޛU4}˧\u0017L`ŏQ\"6\u0016'|tVcxu\u0012=1\t\u0014У7Ou=Ga=I\u0013\"J(H{\u0015\u0001PݒvƵ= ŲO\u000e\u00182Ns\u0003m\u001bS\u001d\u001a@\u0005n*\u000f#tm^8Xl\u0014Ž]'I\u000eŌR)e6\u000bTUYb0%|q ;@mߎC-\u001a(\u07baV]E\fM{\u0006\u0012v3?+w~\u001eZݼ\u0004\u0016\u001b7]\u001a&\u007f4j\u001dQ\u000f\u0017mOյgMV\u001c6\u0005C\t\u001bL\u001c\u000e46\u000fSǉ\u001eh\u000e\u001eA\u0006"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0006wG\bl", "", "1`]0X3", "u(E", "1k^;X", "u(;0b4\bb'Hxh9|\u0017.kI\u0017i\u001e|\u001e\u001e\u001d", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0006wG\b\u0014\u0013Euc", ">/", "3m`BX<>", "uKR<`uMab|\u0005k,\u000b\b5/n\u0016Y<\b\u001e\u0014Cm\u0014\u0012:\u0016", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}u", "3wT0h;>", "u(;0b4\bb'Hxh9|\u0017.kI\u0017i)\u0001&)Q|\u0014)v3@c\u0007.7C", "", "7r2.a*>Z\u0019}", "u(I", "7r4EX*Nb\u0019}", "\u001anZ5g;I!bkzj<|\u0017>;", "@d`BX:M", "u(;<^/Mb$LDK,\t\u0019/s\u000f}", "", "\""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public interface TSCall<T> {
    void cancel();

    TSCall<T> clone();

    void enqueue(TSCallback<T> tSCallback);

    TSNetworkResponse<T> execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();
}
