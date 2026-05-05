package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.FusibleFlow;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&˛\bDZc|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JfP.hS2şs{J$cҕyCI[\"Ԃ*\teNo˧vJh\nKƤ\u000e\u0016\u000fj4կ]xk0\u0017˰HoU\u074cuqCʠnsf\u000b0428@\u0004/\u001aZN x\u000bC\u0012\u000b@1pvJT\u001dMK\u0019@\b~=\u0011(jjf<Xnm:e݊1iRT5cH~c\ftYܮ\u0011xg$9G\u007fY#-k\t\u0017Tk?9ӊ F5l51CI\"bf\\\u000e -+}\u001a\u000ev4j\u001dQ\u000f\u001bm?\u0018xY`&(&\f,\u0017J\u0016&\f7J>-PǑ6!yϖ2$N^\u0006vD\u0016y\u0010;mӞ\u0002Ĵ/9#Ƙ\"nI-f=\f\u0007\u001d\u001eYЧ\u001d62ځ\u0011ה\u00191"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011\\\u000e8u/>`\u0012\u000e:i#.L$BuFs", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u00118\u0004%4:\u0005*IC", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011M\nEt%<`y\u001d>mv5WU\u0011", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011s\u0017Kv2>U\u0005i\u0018}$2JJ;L;('>", "4k^D", "8nQ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9{?r25X^'A\u007fk\u0015SMJr8'(2_C\u0014m<]z0GZ\u0018\u0011fOH\u0001\u0005", "4tb2", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1`_.V0Mg", "", "=m1BY->`\u0003\u0010zk-\u0004\u0013A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ DW'.ZDBuFs", "1n[9X*M", "", "1n[9X*M]&", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "@d_9T@\u001cO\u0017\u0002z", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class ReadonlySharedFlow<T> implements SharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private final /* synthetic */ SharedFlow<T> $$delegate_0;
    private final Job job;

    /* JADX WARN: Multi-variable type inference failed */
    public ReadonlySharedFlow(SharedFlow<? extends T> sharedFlow, Job job) {
        this.$$delegate_0 = sharedFlow;
        this.job = job;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) {
        return this.$$delegate_0.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return this.$$delegate_0.getReplayCache();
    }
}
