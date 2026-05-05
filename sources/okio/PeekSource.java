package okio;

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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG9L͜P.`Y2şs{J$cҕyCI\\\"Ԃ*\t]NogtLb\u000bY\u000f\u000eǝ~̓Bկ\u0006x\f\u0011O=RsM3eok:žx6\u0013\"z(F\u0007\u001d\u0001H8\u000f$?\u0011QZ$\u0012^L!>`\u001de\u0005H\u00166B.\u00126\\\u0016Z|\\5cHA;\u0003\u0018U\u0015;0<\u000bP%F\u0003+cǻcӿ/@?ߎe1a\b\u001fR\nEYӍ}ݘ\th/ݐ{U\u0002^NX.\u001ckۃ[ոar.ؘU_n\u0015?-ebyZdߍ\u0004ߡ\u007f\rDǉ^\u00125SF-Hr^ԇ?ϢvSHАRjP\u007f\u0013ad\u0018{ı5ڢ=\u001bnϟŎ?-"}, d2 = {"\u001anZ6bu)S\u0019\u0005hh<\n\u0007/;", "\u001anZ6bu,])\fx^\u0002", "CobAe,:[", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "uK^8\\6\b0)\u007f{^9|\b\u001do\u00105y@VZ\b", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "1k^@X+", "", "3w_2V;>R\u0004\t\t", "", "3w_2V;>R\u0007~|f,\u0006\u0018", "\u001anZ6bu,S\u001b\u0007zg;R", ">nb", "", "1k^@X", "", "@dP1", "Ah]8", "0xc266N\\(", "Bh\\2b<M", "\u001anZ6bu-W!~\u0005n;R", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class PeekSource implements Source {
    private final Buffer buffer;
    private boolean closed;
    private int expectedPos;
    private Segment expectedSegment;
    private long pos;
    private final BufferedSource upstream;

    public PeekSource(BufferedSource upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.upstream = upstream;
        Buffer buffer = upstream.getBuffer();
        this.buffer = buffer;
        this.expectedSegment = buffer.head;
        Segment segment = buffer.head;
        this.expectedPos = segment != null ? segment.pos : -1;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r1 == r0.pos) goto L12;
     */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long read(okio.Buffer r11, long r12) {
        /*
            r10 = this;
            java.lang.String r0 = "sink"
            r5 = r11
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r3 = 0
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 < 0) goto L87
            boolean r0 = r10.closed
            if (r0 != 0) goto L7b
            okio.Segment r1 = r10.expectedSegment
            if (r1 == 0) goto L27
            okio.Buffer r0 = r10.buffer
            okio.Segment r0 = r0.head
            if (r1 != r0) goto L6f
            int r1 = r10.expectedPos
            okio.Buffer r0 = r10.buffer
            okio.Segment r0 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.pos
            if (r1 != r0) goto L6f
        L27:
            if (r2 != 0) goto L2a
            return r3
        L2a:
            okio.BufferedSource r4 = r10.upstream
            long r2 = r10.pos
            r0 = 1
            long r2 = r2 + r0
            boolean r0 = r4.request(r2)
            if (r0 != 0) goto L3a
            r0 = -1
            return r0
        L3a:
            okio.Segment r0 = r10.expectedSegment
            if (r0 != 0) goto L55
            okio.Buffer r0 = r10.buffer
            okio.Segment r0 = r0.head
            if (r0 == 0) goto L55
            okio.Buffer r0 = r10.buffer
            okio.Segment r0 = r0.head
            r10.expectedSegment = r0
            okio.Buffer r0 = r10.buffer
            okio.Segment r0 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.pos
            r10.expectedPos = r0
        L55:
            okio.Buffer r0 = r10.buffer
            long r2 = r0.size()
            long r0 = r10.pos
            long r2 = r2 - r0
            long r8 = java.lang.Math.min(r12, r2)
            okio.Buffer r4 = r10.buffer
            long r6 = r10.pos
            r4.copyTo(r5, r6, r8)
            long r0 = r10.pos
            long r0 = r0 + r8
            r10.pos = r0
            return r8
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Peek source is invalid because upstream source was used"
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L87:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount < 0: "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.PeekSource.read(okio.Buffer, long):long");
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.upstream.timeout();
    }
}
