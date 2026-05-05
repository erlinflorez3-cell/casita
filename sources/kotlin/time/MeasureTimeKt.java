package kotlin.time;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource;
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
@Metadata(bv = {}, d1 = {"Я*\u001d̉=!4i\bӵLc\u000b\u0004I\u0006>\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:$sN\u007fّSUH|R\u0013]N\u007fm~Lj\u000bq\u00114\u0017?̛2רTތص\u0012\u0017:Hu>CM}<W_ҽ:\u0005.5:i\b\t\u0019 :J vAIy\u001122F\u0081HX=W\u0013\u001a*\fN\"\u0011\u001e#m|7\u000fǕcǶ.݊ɈiJV-e/\rM\u001bEr&%%oӜC@e4=%\u0002\n7\\i?\u001bE\u0002?\u0015hU)YJ:ɖ<ߒ~ϬƆ+W\u0015cx%l\u0005__*&˦ScYX&V\u0006\u07be\u0014\rj\u00036\u0006UQ^7(f \u0014Cv\u0003SnR0_\tȝ\u0001̡5ЍӞ\u007f;3?!eaaI\u0018l6߉\t\r,-\u0019$/_l\u0014p\u0017+T>W_V`?Nݐ\u0018_em2w\u0013\f8\u0004HM\u00101\f\u0011t\u001dS8\"ޅ)ޢjȵ҉Do~\u000bfgci`G^!\u0007KE.!\u0012jFt\u00052V\u0003]L\u0013Sȼb\r&\bA)\r\u0002J!=\u0016^Qxi1S\f\u000bkÌlǶXʤ\u008b\u000e_Ad94ac\u001e`puܠ?Aj\b^ڂr\u0002\u000bɀ`3"}, d2 = {";dP@h9>B\u001d\u0007z", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc\u001c", ";dP@h9>B\u001d\u0007z]\u001dx\u0010?e", "\u001aj^A_0G\u001d(\u0003\u0003^uk\r7e~\u0019wG\u0011\u0017l", "\"", "\u001aj^A_0G\u001d(\u0003\u0003^uk\r7em2\fM~\u0017l", "uKZ<g3B\\b\u000e~f,Fw3m\u007f\u0016\u0006P\u000e\u0015\u0017\u001dV\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u0017$oA", "\u001aj^A_0G\u001d(\u0003\u0003^uk\r7em2\fM~\u0017U/y\u0017F\u0006/>]{u", "uKZ<g3B\\b\u000e~f,Fw3m\u007f\u0016\u0006P\u000e\u0015\u0017\u0006W\u0018E\u00014?b\u0002\u001e\rT\u001c8\\J?t}#&p+:\u0017l*]z1PZ\u0018\rl[pL\u0018\u001ccX$nq", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MeasureTimeKt {
    public static final long measureTime(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long jM10445markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m10445markNowz9LOYto();
        block.invoke();
        return TimeSource.Monotonic.ValueTimeMark.m10450elapsedNowUwyO8pc(jM10445markNowz9LOYto);
    }

    public static final long measureTime(TimeSource.Monotonic monotonic, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(monotonic, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        long jM10445markNowz9LOYto = monotonic.m10445markNowz9LOYto();
        block.invoke();
        return TimeSource.Monotonic.ValueTimeMark.m10450elapsedNowUwyO8pc(jM10445markNowz9LOYto);
    }

    public static final long measureTime(TimeSource timeSource, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(timeSource, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        TimeMark timeMarkMarkNow = timeSource.markNow();
        block.invoke();
        return timeMarkMarkNow.mo10296elapsedNowUwyO8pc();
    }

    public static final <T> TimedValue<T> measureTimedValue(Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new TimedValue<>(block.invoke(), TimeSource.Monotonic.ValueTimeMark.m10450elapsedNowUwyO8pc(TimeSource.Monotonic.INSTANCE.m10445markNowz9LOYto()), null);
    }

    public static final <T> TimedValue<T> measureTimedValue(TimeSource.Monotonic monotonic, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(monotonic, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new TimedValue<>(block.invoke(), TimeSource.Monotonic.ValueTimeMark.m10450elapsedNowUwyO8pc(monotonic.m10445markNowz9LOYto()), null);
    }

    public static final <T> TimedValue<T> measureTimedValue(TimeSource timeSource, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(timeSource, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new TimedValue<>(block.invoke(), timeSource.markNow().mo10296elapsedNowUwyO8pc(), null);
    }
}
