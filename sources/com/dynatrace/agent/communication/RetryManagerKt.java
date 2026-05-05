package com.dynatrace.agent.communication;

import com.dynatrace.agent.communication.network.model.RetryInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!4i\bDJi|\u0004O\f8é6B\r+4\u0012\u000e\u0007nj?1\\oV7jSX\u0019\u0014{b/\"ҕ\nRIa2}P\bwN\u0016r5ϺҼ\u000fC\u001d\u00136\rxߚaU'\\hƂ4ԲsG;M}?Qbz6\u0013!R6F|\u001d\u0001H)\u001fƶxټGS\u0014\u0012>B\t<X\u0011[\u0006:&\u0014C8\u0001L[>ޯ8ՂpeB/1\u0005\u0002DT-m1\u001dY\u001bMl';~8ӟ}Ë;5\u001dǬٮ\u0007\u0015"}, d2 = {"\u0014HA G&+3\bknX\u001aZk\u000fDo\u000f_)b\u0011\u0006+Wm", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "5dc\u0013<\u0019,B\u0013kZM\u0019p\u0003\u001dCb\bZ0gz\u007f)i| ^\u0005", "u(9", "\u0018", "!D2\u001cA\u000b8@xmgR&jf\u0012E^\u0018b$ix\u00116Su\u001c", "5dc 8\n(<wxg>\u001bi|)S]\u000b[\u001fp}z0Q\b+Z\r\u0015", "\u0012HB\u000e5\u0013\u001eMt`ZG\u001bvw\u0013M_", "5dc\u0011<\u001a\u001a0\u007f^t:\u000e\\q\u001e_n\fc ", "\u001b@G,E\f-@\rxVM\u001b\\p\u001aT", "", "7r<.k\u0019>b&\u0013Vm;|\u0011:t", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}&\u001fga@PP,]\u0004;+UO62", "5dc\u000ef:HQ\u001dz\n^+i\t>r\u0014\u0017\u007fH\u0001", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u001f.\\UEx:g\u001dr`9\u000e-\u0019N\u00064[0W-f(6\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class RetryManagerKt {
    private static final long DISABLE_AGENT_TIME;
    private static final long FIRST_RETRY_SCHEDULING_TIME;
    private static final int MAX_RETRY_ATTEMPT = 3;
    private static final long SECOND_RETRY_SCHEDULING_TIME;

    static {
        Duration.Companion companion = Duration.Companion;
        FIRST_RETRY_SCHEDULING_TIME = DurationKt.toDuration(30L, DurationUnit.SECONDS);
        Duration.Companion companion2 = Duration.Companion;
        SECOND_RETRY_SCHEDULING_TIME = DurationKt.toDuration(60L, DurationUnit.SECONDS);
        Duration.Companion companion3 = Duration.Companion;
        DISABLE_AGENT_TIME = DurationKt.toDuration(2, DurationUnit.HOURS);
    }

    public static final long getAssociatedRetryTime(RetryInfo retryInfo) {
        Intrinsics.checkNotNullParameter(retryInfo, "<this>");
        int count = retryInfo.getCount();
        return count != 1 ? count != 2 ? DISABLE_AGENT_TIME : SECOND_RETRY_SCHEDULING_TIME : FIRST_RETRY_SCHEDULING_TIME;
    }

    public static final long getDISABLE_AGENT_TIME() {
        return DISABLE_AGENT_TIME;
    }

    public static final long getFIRST_RETRY_SCHEDULING_TIME() {
        return FIRST_RETRY_SCHEDULING_TIME;
    }

    public static final long getSECOND_RETRY_SCHEDULING_TIME() {
        return SECOND_RETRY_SCHEDULING_TIME;
    }

    public static final boolean isMaxRetryAttempt(RetryInfo retryInfo) {
        Intrinsics.checkNotNullParameter(retryInfo, "<this>");
        return retryInfo.getCount() == 3;
    }
}
