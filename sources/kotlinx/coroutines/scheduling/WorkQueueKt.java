package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!,o\bDJd|\u0004O\r8\u000b4C\u0007\"B\u0012\u007f\u0007llA0ZeP.XTJ\u001byڔL$\n#Hْ\u000eڈ\u001e}*ޛoZug\u0007J\t\n\u001aƥXȀ|j4կu\u0005k\u0013'2pn\u0016ݍ ڱA9hҚV\u0011.4:8(\bWɞ|Н\u0014v\u0003ŏk\u0018 4XphUcˠWܨ\u0016\u0006FĨ!0jmf:vkF:\u000e*Y݄\u0015Ě+a8|[\u0015ff5\u0016\u000feL*)7\u0014\u001c{نU\u07baV]G\u0003My]\u0017v1?/wr@67\u0007jƄ}̠\u0011_z&j\rqw\u001a2CO\u0012Jx\u000eV\u00041Չ\r\u0013Ǌ\u0010Ν+LF/ s\u0016\u001c[~xԟNU\"^p~+ad\u0016Ԅ\u0004B"}, d2 = {"\u0010T5\u00138\u001981tiV<\u0010k|)B[\u0016[", "", "\u0010T5\u00138\u001981tiV<\u0010k|", "\u001b@B\u0018", "\"@B\u0018R\u001a-=\u007f^c", "", "\u001cNC\u0015<\u0015 M\bhtL\u001b\\d\u0016", "!sT._0GU\u0001\ty^", "!S4\u000e?&\u001a<\r", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~G\r 3t\u001a7O+Ej4s", "\u0017", "!S4\u000e?&\u001c>\txdG\u0013p", "!S4\u000e?&\u001b:\u0003\\`B\u0015^\u0003\u0019Nf\u001c", ";`b896KA(~ve0\u0006\u000b\u0017o~(", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~Hy.=C", "5dc\u001aT:D4#\fhm,x\u00103n\u0002\u0010\u0006?\u0001", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f\u0015\u001aGn\u001eCz.7#l\u001cEskq1", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class WorkQueueKt {
    public static final int BUFFER_CAPACITY = 128;
    public static final int BUFFER_CAPACITY_BASE = 7;
    public static final int MASK = 127;
    public static final long NOTHING_TO_STEAL = -2;
    public static final int STEAL_ANY = 3;
    public static final int STEAL_BLOCKING_ONLY = 1;
    public static final int STEAL_CPU_ONLY = 2;
    public static final long TASK_STOLEN = -1;

    public static final int getMaskForStealingMode(Task task) {
        return task.taskContext ? 1 : 2;
    }
}
