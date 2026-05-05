package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!,u\bӵLc\u0003\u000bIي8\u000b<H\u0007\"2\u0013\u007f\u0007|jAӄLeV7ZS0\u000fs{J$c$wFCU0}*\tUNog\u0005Jb\u000bY\u000f\u000e\u0016~kD`c\u0003u\u0012=1rwM>eskBIt\u0015\u0011f2ŕ<y\u0013\u000e2QV$\u000fzq]4\u0016^VY:1\"}\t()\u001e>N\u0002NduYNL\u001bf#/\u0002\u000f0ĩĚ+_>\u0015m\u001bTÖ?\r%`TѨ\u0017ʼ7չ)S\u000bޗriM\u0003Wqk\u0006\u001fѧ}ǤKָ[6`Ü4#9Q%]!)\u0013Ӥ(Ӣ\u000eˏ/Ok֟p\u001c6{\u0013{;?:\u05fa\\ΫJͶ1\u001anڜ.A\u0003wk@~\u0003\u0015ۍVЯcي\u001b%\bđKI)liai \u0005љ:˜c̖/ъr!c٪.r#)l{\u007f::@\u001cT%ˤ,ǀq\u0006xb\u00109$BU\u0010G\u007f?7\u007f%\u0016g\u0010\u05fbsȠ\u0006JLg\u0005\u0014\u0001\u0004azjLn+W\u0016\u001661\f\tV\u001bˎk'ӺZ¯\u0015Q4V\r\u000f\u0016&Hf}˓/-0N}q\u001aj{fܬ)H"}, d2 = {"\u0012D5\u000eH\u0013-M\u0007\\]>\u000blo\u000fRy\u0011W(`", "", "%NA\u0018R\u001a-3te^G\u000evw\u0013M_\"h n\u0001}7^q&_\u001f\u001eG", "", "\u0011NA\u0012R\u0017(=\u007fxhB!\\", "", "\u001b@G,C\u0016(:\u0013l^S\f", "\u0017C;\u0012R\u001e(@~^gX\u0012\\h\u001a_[\u000f_1`\u0011\u007f5", "AbW2W<ES&m~f,j\u0013?r}(", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~G{#7l&5MP*o<\u001e\u0003rqF\u0005c\u0002", "\"`b866Gb\u0019\u0012\n", "", "B`b866Gb\u0019\u0012\nL;\n\r8g", "B`b866Gb\u0019\u0012\n", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~Hy.=K 7\\CNz\n", "uY\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u001cn]\u000f_6<Y\u001d\b|<6\u0006\u0018/x\u000f", "(", "\u0010k^0^0GUv\t\u0004m,\u0010\u0018", "7r19b*DW\"\u0001", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~Hy.=C", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f\u0015\u001aGn\u001eCz.7#l\u001cEskqB", "/rC.f2", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "AtQ:\\:LW#\bib4|", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016e\fZ.u\u0018K})>lG\u001eAz >\\GDkBg#fd9\u0006s3R\u007f)\u0011;J:b(", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TasksKt {
    public static final boolean BlockingContext = true;
    public static final boolean NonBlockingContext = false;
    public static final String DEFAULT_SCHEDULER_NAME = SystemPropsKt.systemProp("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long WORK_STEALING_TIME_RESOLUTION_NS = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, (Object) null);
    public static final int CORE_POOL_SIZE = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.core.pool.size", RangesKt.coerceAtLeast(SystemPropsKt.getAVAILABLE_PROCESSORS(), 2), 1, 0, 8, (Object) null);
    public static final int MAX_POOL_SIZE = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.max.pool.size", CoroutineScheduler.MAX_SUPPORTED_POOL_SIZE, 0, CoroutineScheduler.MAX_SUPPORTED_POOL_SIZE, 4, (Object) null);
    public static final long IDLE_WORKER_KEEP_ALIVE_NS = TimeUnit.SECONDS.toNanos(SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, (Object) null));
    public static SchedulerTimeSource schedulerTimeSource = NanoTimeSource.INSTANCE;

    public static final Task asTask(Runnable runnable, long j2, boolean z2) {
        return new TaskImpl(runnable, j2, z2);
    }

    public static final boolean isBlocking(Task task) {
        return task.taskContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String taskContextString(boolean z2) {
        return z2 ? "Blocking" : "Non-blocking";
    }
}
