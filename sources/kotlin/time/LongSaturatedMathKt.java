package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
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
@Metadata(bv = {}, d1 = {"Я\"\u001d̉=!,p\bDJc|\u0004W\u00068\u000b4G\u0007\"B\u0012\u007f\u0007lwA0RnP\u008cjx8ş\u0004{b#\f(\u007fCSUH|R\r]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'irIǤ|_\u0018\u0013@G\bRAS\b=gb%:\u0013 J\"fxK\u0001ʀ.H\u001e}\u0013hY\u0014*0nojV\u001bM\u001d\u001a@\u0005n$\u000f'tg|@xpk;G#1k\t÷Ϯc2\u0003X\u001bRlL\u001b\u0004y\u001eY?g9#%k\u00035Q\fC\u0011H\n=3rW+9J\fWdZF\u0014Ʀ/Q\u0013k\u00012t(_o$'YQ\u0014O^\u001e@w)z=@\u0012\u001f\u001e'v-]\u001et\u0011&3#|\u001aóг\u0006^P\u0012\u0013\u0005D*=\u007fa-i\u001ftey;GMg\u007f\u0013\"6#/mQ_b\u0017x\u0015I^>QśU@KZf-gS\u0006\u0004\u001fd2.\u0012G_\u007f]zA2%=O[g\"Qo\u0010Q\\g%\u000f'åרmRVR:y$PB\t:tld3j\u0017Ӻ^µ\u0015h"}, d2 = {"1gT0^\u0010GT\u001d\b~m,j\u00197D\u007f)\u007fI\u0001\u0016", "", "D`[BX", "2ta.g0H\\", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "2ta.g0H\\|\bjg0\f", "1gT0^\u0010GT\u001d\b~m,j\u00197D\u007f)\u007fI\u0001\u0016^2t\u001e\u001e\u0007\"\u0004", "uI9\u0017\u001c\u0011", "7mU6a0Mg\u0003\u007fhb.\u0006", "uI\u0018\u0017", "A`cBe(MW\"\u0001V]+", "CmXA", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006Ip \u001bVE", "A`cBe(MW\"\u0001V]+Dq?f\u0007\u000fIJ", "uI;8b;EW\"H\nb4|R\u000eu\r$\u000bD\u000b \u0007Ps\u001d\u0012[h\u001a", "A`cBe(MW\"\u0001V]+`\u0012\u0012a\u00079{N", "A`cBe(MW\"\u0001V]+`\u0012\u0012a\u00079{NH\u007f'Hvt\n\u0001", "A`cBe(MW\"\u0001Yb-}", "D`[BX\u0015L", "=qX4\\5", "uI9\u0019^6MZ\u001d\bDm0\u0005\txD\u00105wO\u0005! 7x\u0012KLh\u001a", "A`cBe(MW\"\u0001[b5\u0001\u0018/D\u0004)|", "D`[BXw", "D`[BXx", "A`cBe(MW\"\u0001dk0~\r8s^,|A", "=qX4\\5\n", "=qX4\\5\u000b", "7rB.g<KO(~y", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class LongSaturatedMathKt {
    /* JADX INFO: renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m10434checkInfiniteSumDefinedPjuGub4(long j2, long j3, long j4) {
        if (!Duration.m10338isInfiniteimpl(j3) || (j2 ^ j4) >= 0) {
            return j2;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long infinityOfSign(long j2) {
        return j2 < 0 ? Duration.Companion.m10408getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.Companion.m10407getINFINITEUwyO8pc();
    }

    public static final boolean isSaturated(long j2) {
        return ((j2 - 1) | 1) == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m10435saturatingAddNuflL3o(long j2, DurationUnit unit, long j3) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long jM10352toLongimpl = Duration.m10352toLongimpl(j3, unit);
        long j4 = j2 - 1;
        if ((j4 + 1) - (j4 & 1) == Long.MAX_VALUE) {
            return m10434checkInfiniteSumDefinedPjuGub4(j2, j3, jM10352toLongimpl);
        }
        if ((-1) - (((-1) - 1) & ((-1) - (jM10352toLongimpl - 1))) == Long.MAX_VALUE) {
            return m10436saturatingAddInHalvesNuflL3o(j2, unit, j3);
        }
        long j5 = j2 + jM10352toLongimpl;
        long j6 = j2 ^ j5;
        long j7 = jM10352toLongimpl ^ j5;
        return (j6 + j7) - (j6 | j7) < 0 ? j2 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j5;
    }

    /* JADX INFO: renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m10436saturatingAddInHalvesNuflL3o(long j2, DurationUnit durationUnit, long j3) {
        long jM10309divUwyO8pc = Duration.m10309divUwyO8pc(j3, 2);
        long jM10352toLongimpl = Duration.m10352toLongimpl(jM10309divUwyO8pc, durationUnit);
        return (-1) - (((-1) - 1) & ((-1) - (jM10352toLongimpl - 1))) == Long.MAX_VALUE ? jM10352toLongimpl : m10435saturatingAddNuflL3o(m10435saturatingAddNuflL3o(j2, durationUnit, jM10309divUwyO8pc), durationUnit, Duration.m10341minusLRDsOJo(j3, jM10309divUwyO8pc));
    }

    public static final long saturatingDiff(long j2, long j3, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (-1) - (((-1) - 1) & ((-1) - (j3 - 1))) == Long.MAX_VALUE ? Duration.m10359unaryMinusUwyO8pc(infinityOfSign(j3)) : saturatingFiniteDiff(j2, j3, unit);
    }

    private static final long saturatingFiniteDiff(long j2, long j3, DurationUnit durationUnit) {
        long j4 = j2 - j3;
        if ((-1) - (((-1) - (j4 ^ j2)) | ((-1) - (~(j4 ^ j3)))) >= 0) {
            return DurationKt.toDuration(j4, durationUnit);
        }
        if (durationUnit.compareTo(DurationUnit.MILLISECONDS) >= 0) {
            return Duration.m10359unaryMinusUwyO8pc(infinityOfSign(j4));
        }
        long jConvertDurationUnit = DurationUnitKt.convertDurationUnit(1L, DurationUnit.MILLISECONDS, durationUnit);
        long j5 = (j2 / jConvertDurationUnit) - (j3 / jConvertDurationUnit);
        Duration.Companion companion = Duration.Companion;
        return Duration.m10342plusLRDsOJo(DurationKt.toDuration(j5, DurationUnit.MILLISECONDS), DurationKt.toDuration((j2 % jConvertDurationUnit) - (j3 % jConvertDurationUnit), durationUnit));
    }

    public static final long saturatingOriginsDiff(long j2, long j3, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long j4 = j3 - 1;
        if ((j4 + 1) - (j4 & 1) == Long.MAX_VALUE) {
            return j2 == j3 ? Duration.Companion.m10409getZEROUwyO8pc() : Duration.m10359unaryMinusUwyO8pc(infinityOfSign(j3));
        }
        long j5 = j2 - 1;
        return (1 + j5) - (1 & j5) == Long.MAX_VALUE ? infinityOfSign(j2) : saturatingFiniteDiff(j2, j3, unit);
    }
}
