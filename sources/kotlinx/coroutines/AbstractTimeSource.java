package kotlinx.coroutines;

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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00126B\u0005\"4\u0012\u000e\u0007njO0LeN/ZS8\u000fs{:*c$\bCC٥ \u001c8ޛ\u007fN\u0016f/OҼ\u000fE\u0015\u0006$y32WW\u0011]@\u0012xf8EAQ\b=gc;ZM;@'P}3\b\u0003*'\u0016'\u0003QS$\u0016^GY:1\u0013\u0014)ܨ\u0016\u0006L)I$jqf6vw$^w)\u0011uZNUjv!\u0016\u0013Ta?\r%ldO\t=C#=S1\u0012\u0019\u007f\b\u0019M\u0001U\u0005\u00172W/W\u0004o6\u0007~D\u00199`%]!)#)\u001an\u001a9CO\u0012V\u0001\u00126\u000b\u0013{;PJ2Σ+]"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c}%&Tk\fKe)=Yk*Gz\u0014.#", "", "\nh]6g\u0005", "u(E", "1ta?X5MB\u001d\u0007zF0\u0004\u00103s", "", "<`]<G0FS", "EqP=G(LY", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "0k^0^", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016D}\u001cC\u0001\n\u0006}!>[G\rGv\u001f*JJ;A", "BqP0^\u001b:a\u001f", "", "CmC?T*DB\u0015\r\u0001", "@dV6f;>`\b\u0003\u0003^\u0013\u0007\u0013:T\u00035{<\u007f", "Cma2Z0Lb\u0019\fib4|o9o\u000b\u0017~M\u0001\u0013\u0016", ">`a8A(G]'", "0k^0^,K", "<`]<f", "Cm_.e2", "Bga2T+", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class AbstractTimeSource {
    public abstract long currentTimeMillis();

    public abstract long nanoTime();

    public abstract void parkNanos(Object obj, long j2);

    public abstract void registerTimeLoopThread();

    public abstract void trackTask();

    public abstract void unTrackTask();

    public abstract void unpark(Thread thread);

    public abstract void unregisterTimeLoopThread();

    public abstract Runnable wrapTask(Runnable runnable);
}
