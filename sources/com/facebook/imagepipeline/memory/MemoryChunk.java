package com.facebook.imagepipeline.memory;

import java.nio.ByteBuffer;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\":\u0019\u007f\u0007lkA0RkP.XV2\u000fy{<$a(yCI^\"Ԃ*\t]QogtJb\u000bQ\u001f\u000e\u0016~k2.kތ\u000e\u0012=1\u000buMAeokH'\u0019~+.B:8(\u00141\u001e8Y(v)L{\u0010 BXphĥ=Q\u0013-*\u0006l)1\"j{f6vu$^w)\u0011~ZNUuv!\u0016\u001bTk?\r%yN/NHM\u0015S\\I+\u001b\u0002M\u001aWqk\u000e\u0019+5Das\u0006?\t\u0004\"/CO;x#*j!i`:0[Sq_h\u000eV\u0001A Ub\u0012+\u001e'v7]\u001et!&3#{\u0004D^\u001cvB.\u0016\u0012:%A\u00183YBKj_uS\u0019|@B)]01\u0001\u0007#qS<akøVɐU5iBCJ\\\r*O{\b\tb0/:\u0015\u001eİ1ɨ\u00152/'=aG*q{\u0010P\\g%\u000e7ČUׂVLX$t E5Y\u001chP|\u0005\u001aU+з.ҭQ l\t\u0004\u0015!'Ϩ{Z"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001U\u00166WPOI7.\u001en7", "", "0xc25<?T\u0019\f", "\u001aiPCTuGW#HWr;|e?f\u0001(\t\u0016", "5dc\u000fl;>0)\u007f{^9", "u(;7T=:\u001d\"\u0003\u0005(\t\u0011\u0018/B\u0010)|@\u000el", "<`c6i,)b&", "", "5dc\u001bT;Bd\u0019i\nk", "u(9", "Ahi2", "", "5dc \\A>", "u(8", "CmX>h,\"R", "5dc\"a0Jc\u0019by", "1k^@X", "", "1n_F", "=eU@X;", "=sW2e", "=sW2e\u0016?T'~\n", "1nd;g", "7r29b:>R", "", "@dP1", "", ";d\\<e@(T\u001a\rzm", "0xc249KO-", "", "0xc249KO-h{_:|\u0018", "EqXAX", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface MemoryChunk {
    void close();

    void copy(int i2, MemoryChunk memoryChunk, int i3, int i4);

    ByteBuffer getByteBuffer();

    long getNativePtr() throws UnsupportedOperationException;

    int getSize();

    long getUniqueId();

    boolean isClosed();

    byte read(int i2);

    int read(int i2, byte[] bArr, int i3, int i4);

    int write(int i2, byte[] bArr, int i3, int i4);
}
