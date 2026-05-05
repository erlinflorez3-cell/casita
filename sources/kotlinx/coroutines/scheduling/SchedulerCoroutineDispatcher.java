package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
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
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4B\u0007\":\u0019\u007fјnjG<LeN/ZS@\u000fs{:%c$\bCCU }*\t]No˧vJp\u000bKƤ\u000e\u0016\u000fj4Ikxe\u0012\u00153JoU3UoKBht<\u000f&@8\u0600*\u0005/\u0019ju |\u0001CY\f*0nqJX\u0013M\u0013\u001c*\u0006l!\u0011$bg\\9`l\f>?)\tiPS?_^\u0003֔\u0011HZ.\u001b~*$9OO5C3\u001a\u0003OqiO\u001b? N5l59CI\"jf`\u000e(-/}#Fr\u0005qKeԃ\u0010'9f,j^&@w)\r=@\u0012 \u001e'vA]\"t\u001c&7#\t<@/\u0017%Vȸ~aD.m-ADQ\u001b\u0015b\u0012C'bO\u007f3#\u0007#_\u0004Qcb x\u0019Io`Q\u0010kpAVj\"Yk\tJ͏Ċ\u0006,\nMU\u001ew\u0002\u001fM/%el\u007f7iv\u0010h\\g%\u0016'åרmRNaj\u0002$YB\t:kth\u0013\u000fhT\u00070W۳ɟX\u0007\u0004,[+j\u001dT!S!\u0015иŹmjS\u0004Z1=fOY\u001dldæ;ӷ75Yү`m`x,?jc[֝h͞W\fb٢x.@K\u0003\u0010&\u007f\u001b\u008b\u000eƱ6?yʉ\u00058?\u001et\u0015v\ttՖCҴ\r_bӐ`\u0011b<<\u0003\u0018.+]W˝^ʼsk\u0011K2\bn.}M_B1&\u00040?ؗ\tɠ\u000b~{Òġks"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~G{#7l&5MP\u0019uA(%weB\u0007B0\\\u0002#VJQ,i(", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0014\u0017\u0015W~\u0018IT/Bc\u000e/;v\u0016\rQQFgC\u001c\u0018hn\u000f", "1na2C6HZ\u0007\u0003\u0010^", "", ";`g\u001db6EA\u001d\u0014z", "7c[2J6KY\u0019\f`^,\bd6i\u0011(dN", "", "AbW2W<ES&gvf,", "", "\nh]6g\u0005", "uH8\u0017?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BVZ\b", "3wT0h;H`", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "5dc\u0012k,<c(\t\b", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`'\u0003\u000e:\u00074?fS", "1na<h;B\\\u0019lxa,{\u00196e\r", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~7\b-A}%2VC)i7\u001e\u0014xh9\u00149", "1qT.g,,Q\u001c~yn3|\u0016", "2hb=T;<V", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "0k^0^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015R?Lg}%\u0011qc\u0003ss5Wr$NL$oM", "2hb=T;<V\r\u0003ze+", "2hb=T;<V\u000b\u0003\na\n\u0007\u0012>e\u00137", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~Hy.=K 7\\CNz\n", "", "B`X970L^\u0015\u000exa", "2hb=T;<V\u000b\u0003\na\n\u0007\u0012>e\u00137:F\u000b&\u001eKx!6t/Bc\u000e/;v\u0016<GAEx4", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016u\fZ8", "1k^@X", "CrT\u001de0OO(~h\\/|\b?l\u007f5", "CrT\u001de0OO(~h\\/|\b?l\u007f5:F\u000b&\u001eKx!6t/Bc\u000e/;v\u0016<GAEx4", "AgdAW6P\\", "Bh\\2b<M", "AgdAW6P\\W\u0005\u0005m3\u0001\u0012B_}2\tJ\u0011&\u001bPo\u001c6t/BY", "@dbAb9>", "@dbAb9>\u0012\u001f\t\ne0\u0006\u001c)c\n5\u0006P\u0010\u001b G}\b:\u000125", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public class SchedulerCoroutineDispatcher extends ExecutorCoroutineDispatcher {
    private final int corePoolSize;
    private CoroutineScheduler coroutineScheduler;
    private final long idleWorkerKeepAliveNs;
    private final int maxPoolSize;
    private final String schedulerName;

    public SchedulerCoroutineDispatcher() {
        this(0, 0, 0L, null, 15, null);
    }

    public SchedulerCoroutineDispatcher(int i2, int i3, long j2, String str) {
        this.corePoolSize = i2;
        this.maxPoolSize = i3;
        this.idleWorkerKeepAliveNs = j2;
        this.schedulerName = str;
        this.coroutineScheduler = createScheduler();
    }

    public /* synthetic */ SchedulerCoroutineDispatcher(int i2, int i3, long j2, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i4) != 0 ? TasksKt.CORE_POOL_SIZE : i2, (2 & i4) != 0 ? TasksKt.MAX_POOL_SIZE : i3, (4 & i4) != 0 ? TasksKt.IDLE_WORKER_KEEP_ALIVE_NS : j2, (i4 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    private final CoroutineScheduler createScheduler() {
        return new CoroutineScheduler(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.coroutineScheduler.close();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo10550dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.dispatch$default(this.coroutineScheduler, runnable, false, false, 6, null);
    }

    public final void dispatchWithContext$kotlinx_coroutines_core(Runnable runnable, boolean z2, boolean z3) {
        this.coroutineScheduler.dispatch(runnable, z2, z3);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.dispatch$default(this.coroutineScheduler, runnable, false, true, 2, null);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor getExecutor() {
        return this.coroutineScheduler;
    }

    public final void restore$kotlinx_coroutines_core() {
        usePrivateScheduler$kotlinx_coroutines_core();
    }

    public final synchronized void shutdown$kotlinx_coroutines_core(long j2) {
        this.coroutineScheduler.shutdown(j2);
    }

    public final synchronized void usePrivateScheduler$kotlinx_coroutines_core() {
        this.coroutineScheduler.shutdown(1000L);
        this.coroutineScheduler = createScheduler();
    }
}
