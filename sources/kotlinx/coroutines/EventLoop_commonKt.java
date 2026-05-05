package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;
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
@Metadata(bv = {}, d1 = {"Я \u001d̉=!4i\bӵLc\u0003\nI\u00066\f6B\r)4\u0012}\u000enjO0L͜`<`[B\u000f\u001a\u0001d(i-\nCiZ`Ԃ:\u0017]X\u007fg\u001dO\u000b\u000fQ\u001a\u001e\u0016'orկu\u0005k܈'2pn\u0016ݏOڱA9hҚV\u0011.2:8(\u0006Wɠ|Н\u0014v\u0003ŏk\u0018 2XphScˢWܨ\u0016\u0006FĨ!*jjf6vm4ƀ\u0002ݭ\u0007iJ÷Gk>\u0001e\rtY}˜IҐ\"+HʺU!3Y\u001b\u0007\u0001`\u0016Ť\u0012џA\u0005pѧG7Wzo6\u0007\u0005jƆ}̠\u0011]z̦|\u0011_l$'YN:֢Rˎ,w\u0003Ԉ5X\n\u000e\u00144`03Կt\u0016.9\u0005tc@\u0017\u0010\rQ0\u0001q8'%FAYHӾja"}, d2 = {"\u0012HB\u001dB\u001a\u001e2\u0013mVL\u0012", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013Iaz*>C", "!B7\u00127\u001c%3\u0013h`", "", "!B7\u00127\u001c%3\u0013\\dF\u0017ch\u001eE^", "!B7\u00127\u001c%3\u0013]^L\u0017fv\u000fD", "\u001bRN!B&'A", "", "\u001b@G,@\u001a", "\u001b@G,7\f%/\rxcL", "2d[.l\u001bH<\u0015\b\u0005l", "Bh\\2@0EZ\u001d\r", "2d[.l\u0015:\\#\rih\u0014\u0001\u00106i\u000e", "Bh\\2A(G]'", "\u0011K> 8\u000b83\u0001iiR", "\u001ftTBX", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\f?W\u0004\u0001Dm\u0016\u001dIQAWD\u001e%h?C\u0014c\u0002", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EventLoop_commonKt {
    private static final long MAX_DELAY_NS = 4611686018427387903L;
    private static final long MAX_MS = 9223372036854L;
    private static final long MS_TO_NS = 1000000;
    private static final int SCHEDULE_COMPLETED = 1;
    private static final int SCHEDULE_DISPOSED = 2;
    private static final int SCHEDULE_OK = 0;
    private static final Symbol DISPOSED_TASK = new Symbol("REMOVED_TASK");
    private static final Symbol CLOSED_EMPTY = new Symbol("CLOSED_EMPTY");

    public static final long delayNanosToMillis(long j2) {
        return j2 / 1000000;
    }

    public static final long delayToNanos(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        if (j2 >= MAX_MS) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j2;
    }
}
