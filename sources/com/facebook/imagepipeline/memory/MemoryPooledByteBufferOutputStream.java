package com.facebook.imagepipeline.memory;

import com.facebook.common.memory.PooledByteBufferOutputStream;
import com.facebook.common.references.CloseableReference;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r(4\u0012}\u0007njO0Le^.ZS0\u000fs{B$c$wFCU0}*\tUNog|Zb\u000bI\u0011\f\u001b\u000f̓\\I\u0004w\u0016\u0011%rYuDCQ}=Q`#7\u0015&8\"F{\u001d\u0001H-Н\u0014v\tG\u0014\u0012 9Xph\\SaM  \u0011V /(#g\u0017DVxu:]-3mP[?_^\u007f\u0014\u0012\u000fZ5\u001b\u000faL.\u0007K}\u001b3b\u001b\u0007\u0001k\u0006\u0017\b\u0010K\u0016\u0001'U5yweHp\u007fB([S\u001bq\u000b&\u000b\b\u0002d\u001a/CO\u0012N\u0017\"p\u0006\t\r%<2\u00186+VCE\u001a\u0015\u000bTGE\u0007aEh\nnD\u0010z\u0010=-$.9\u0002ݐ'ƻUaCϊ\u001fC\n\r%\u001eQ\u0004EĒgڍ\u0012`\u001dÑ%\u0004_1i@kI%˦[ǀq\u0004xç͌.\u001b"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001U\u00166WPOV>(\u001ch`\u0016\u001br,+\u0007(HL[\u0016la}M#\u007fi\u001bN'\u0015Z", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+~xpD\u0017r\u001a]\u0004'CT$", ">n^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001U\u00166WPOI7.\u001enLC\u0011j\u0002", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@-5a\b-K7}.UMH\u007f\u0012!%qg$\u0011m3$Zj8", "0tU\u001fX-", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001U\u00166WPOI7.\u001en7", "1nd;g", "1k^@X", "", "3mbBe,/O \u0003y", "@dP9_6<", "<df\u0019X5@b\u001c", "Ahi2", "Bn1Fg,\u001bc\u001a\u007fzk", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001U\u00166WPOV>(\u001ch`\u0016\u001br,+\u0007(HL[\u0002", "EqXAX", "0tU3X9", "", "=eU@X;", "=mT\u000fl;>", "\u0017me._0=A(\fzZ4\\\u001c-e\u000b7\u007fJ\n", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MemoryPooledByteBufferOutputStream extends PooledByteBufferOutputStream {
    private CloseableReference<MemoryChunk> bufRef;
    private int count;
    private final MemoryChunkPool pool;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000bDȐ/&Z\u0011`\u0007Ejy3ǲiH<Sޠ.\u0011"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001U\u00166WPOV>(\u001ch`\u0016\u001br,+\u0007(HL[\u0016la}M#\u007fi\u001bN'\u0015C=J5jK;\u001eu;V\u00027p`\u001f\u0014\u000e@ytL_e", "\u001aiPCTuEO\"\u0001DK<\u0006\u00183m\u007f\b\u000f>\u0001\"&Ky\u0017\u0012", "\u001aj^A_0G\u001d\u0006\u000f\u0004m0\u0005\t\u000fx}(\u0007O\u0005! \u001d", "u(E", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MemoryPooledByteBufferOutputStream(MemoryChunkPool pool) {
        this(pool, 0, 2, null);
        Intrinsics.checkNotNullParameter(pool, "pool");
    }

    public MemoryPooledByteBufferOutputStream(MemoryChunkPool pool, int i2) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        if (i2 <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.pool = pool;
        this.count = 0;
        this.bufRef = CloseableReference.of(pool.get(i2), pool);
    }

    public /* synthetic */ MemoryPooledByteBufferOutputStream(MemoryChunkPool memoryChunkPool, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(memoryChunkPool, (i3 & 2) != 0 ? memoryChunkPool.getMinBufferSize() : i2);
    }

    private final void ensureValid() {
        if (!CloseableReference.isValid(this.bufRef)) {
            throw new InvalidStreamException();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBufferOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        CloseableReference.closeSafely(this.bufRef);
        this.bufRef = null;
        this.count = -1;
        super.close();
    }

    public final void realloc(int i2) {
        ensureValid();
        CloseableReference<MemoryChunk> closeableReference = this.bufRef;
        if (closeableReference == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.checkNotNull(closeableReference);
        if (i2 <= closeableReference.get().getSize()) {
            return;
        }
        MemoryChunk memoryChunk = this.pool.get(i2);
        Intrinsics.checkNotNullExpressionValue(memoryChunk, "this.pool[newLength]");
        MemoryChunk memoryChunk2 = memoryChunk;
        CloseableReference<MemoryChunk> closeableReference2 = this.bufRef;
        if (closeableReference2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.checkNotNull(closeableReference2);
        closeableReference2.get().copy(0, memoryChunk2, 0, this.count);
        CloseableReference<MemoryChunk> closeableReference3 = this.bufRef;
        Intrinsics.checkNotNull(closeableReference3);
        closeableReference3.close();
        this.bufRef = CloseableReference.of(memoryChunk2, this.pool);
    }

    @Override // com.facebook.common.memory.PooledByteBufferOutputStream
    public int size() {
        return this.count;
    }

    @Override // com.facebook.common.memory.PooledByteBufferOutputStream
    public MemoryPooledByteBuffer toByteBuffer() {
        ensureValid();
        CloseableReference<MemoryChunk> closeableReference = this.bufRef;
        if (closeableReference != null) {
            return new MemoryPooledByteBuffer(closeableReference, this.count);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        write(new byte[]{(byte) i2});
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i2, int i3) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (i2 < 0 || i3 < 0 || i2 + i3 > buffer.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + buffer.length + "; regionStart=" + i2 + "; regionLength=" + i3);
        }
        ensureValid();
        realloc(this.count + i3);
        CloseableReference<MemoryChunk> closeableReference = this.bufRef;
        if (closeableReference == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        closeableReference.get().write(this.count, buffer, i2, i3);
        this.count += i3;
    }
}
