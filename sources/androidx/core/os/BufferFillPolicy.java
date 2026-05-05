package androidx.core.os;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: Profiling.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4F\u0007\"B\u0012\u007f\u0007|jAӄJ\u001b^\u008cpXZ\u000f\u001azl%`*x\u0004H[\u001c\u000e&\u0017Ofg\u0016oН^\u000bQ\u0011V(\u0007jDI\u0004y4܉\u0011̓FuG\u074ceqC<nxȅ\u0004 :+ة}\u000f"}, d2 = {"\u001a`]1e6BR,Hxh9|R9sI\u0005\fA\u0002\u0017$(s\u0015Ca/<]{4\r", "", "D`[BX", "", "uH\u0018#", "5dc#T3NSW|\u0005k,v\u0016/l\u007f$\n@", "u(8", "\u0011n\\=T5B]\"", "\u0012hb0T9=", " h]45<?T\u0019\f", "\u001a`]1e6BR,Hxh9|R9sI\u0005\fA\u0002\u0017$(s\u0015Ca/<]{4uL\u001a<K?Hj\n", "\u001a`]1e6BR,Hxh9|R9sI\u0005\fA\u0002\u0017$(s\u0015Ca/<]{4uZ\u001a7O Kl5\u001e\">", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class BufferFillPolicy {
    public static final Companion Companion = new Companion(null);
    public static final BufferFillPolicy DISCARD = new Discard();
    public static final BufferFillPolicy RING_BUFFER = new RingBuffer();
    private final int value;

    public /* synthetic */ BufferFillPolicy(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    private BufferFillPolicy(int i2) {
        this.value = i2;
    }

    /* JADX INFO: compiled from: Profiling.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00052i%\nCiWP\u0002xޣQɁkgvϺ+\u0019Q\u0012\u001e\u0016'lbM,ޔ_ܫ\u00132JģЩ7Q"}, d2 = {"\u001a`]1e6BR,Hxh9|R9sI\u0005\fA\u0002\u0017$(s\u0015Ca/<]{4uK 6X?Do>'j", "", "u(E", "\u0012HB\u00104\u0019\u001d", "\u001a`]1e6BR,Hxh9|R9sI\u0005\fA\u0002\u0017$(s\u0015Ca/<]{4\r", " H=\u0014R\t.4y^g", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final int getValue$core_release() {
        return this.value;
    }

    /* JADX INFO: compiled from: Profiling.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0004G\u0006Fé^B-!l\u0015է\u000bfx9ӭHf"}, d2 = {"\u001a`]1e6BR,Hxh9|R9sI\u0005\fA\u0002\u0017$(s\u0015Ca/<]{4uL\u001a<K?Hj\n", "\u001a`]1e6BR,Hxh9|R9sI\u0005\fA\u0002\u0017$(s\u0015Ca/<]{4\r", "u(E", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Discard extends BufferFillPolicy {
        public Discard() {
            super(1, null);
        }
    }

    /* JADX INFO: compiled from: Profiling.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0004G\u0006Fé^B-!l\u0015է\u000bfx9ӭHf"}, d2 = {"\u001a`]1e6BR,Hxh9|R9sI\u0005\fA\u0002\u0017$(s\u0015Ca/<]{4uZ\u001a7O Kl5\u001e\">", "\u001a`]1e6BR,Hxh9|R9sI\u0005\fA\u0002\u0017$(s\u0015Ca/<]{4\r", "u(E", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class RingBuffer extends BufferFillPolicy {
        public RingBuffer() {
            super(2, null);
        }
    }
}
