package org.koin.core.time;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.koin.mp.KoinPlatformTimeTools;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005(4\u0012\u0006\u000bnj?1LeV.ZS0\u000f\u0002ڔR4\f$ BsT*>%\u07beSNug7Nh\u0015[\u000f4!An:Umx\f\u001dW6P|W3{z\u0006=n\u0003N\u0005NAr\\\b\b\u0019\u001aXJ@z\tDc\f@2~1\u0011Ĭ\u0019͘\u0004܅ǀ\u0005=ŋ\u0005&dg\\<`nc>=(S\u0001PU?_^~ת\fϿŏ&\fțe&3@E;-'Y\u000b\u0015W,S\u0011H\n=3j}ݓ7˗rɎΥW~Џ\u0019-W\rkx̩\\\u000eYc\u0012ˎG}bSP\u0014Gä~\r"}, d2 = {"\u001ana4\"2HW\"Hxh9|R>i\b(E/\u0005\u001f\u0017TE", "", "u(E", "\nrTA \u0006\u0017", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "3mS", "5dc\u0012a+\u0006C+\u0013d17z", "u(9", "\u0018", "AsP?g", "5dc g(Kb`n\rr\u0016O\u0014-", "Bh\\2", "5dc!\\4>7\"f~e3\u0001\u0017", "", "5dc!\\4>7\"gvg6\u000b", "5dc!\\4>7\"lz\\6\u0006\b=", "As^=", "", "\u0011n\\=T5B]\"", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Timer {
    public static final Companion Companion = new Companion(null);
    public static final double NANO_TO_MILLI = 1000000.0d;
    private final long start = DurationKt.toDuration(KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds(), DurationUnit.NANOSECONDS);
    private long end = Duration.Companion.m10409getZEROUwyO8pc();
    private long time = Duration.Companion.m10409getZEROUwyO8pc();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000f6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:GIX2}P\r Zuh\u0007J\t\r\u001aƫXȀ|j4կǪ|b"}, d2 = {"\u001ana4\"2HW\"Hxh9|R>i\b(E/\u0005\u001f\u0017T.kF~01b\u0002*@C", "", "u(E", "\u001c@=\u001cR\u001b(M\u0001baE\u0010", "", "AsP?g", "\u001ana4\"2HW\"Hxh9|R>i\b(E/\u0005\u001f\u0017TE", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Timer start() {
            return new Timer();
        }
    }

    /* JADX INFO: renamed from: getEnd-UwyO8pc, reason: not valid java name */
    public final long m10848getEndUwyO8pc() {
        return this.end;
    }

    /* JADX INFO: renamed from: getStart-UwyO8pc, reason: not valid java name */
    public final long m10849getStartUwyO8pc() {
        return this.start;
    }

    public final double getTimeInMillis() {
        return Duration.m10349toDoubleimpl(this.time, DurationUnit.MILLISECONDS);
    }

    public final double getTimeInNanos() {
        return Duration.m10349toDoubleimpl(this.time, DurationUnit.NANOSECONDS);
    }

    public final double getTimeInSeconds() {
        return Duration.m10349toDoubleimpl(this.time, DurationUnit.SECONDS);
    }

    public final void stop() {
        if (Duration.m10311equalsimpl0(this.end, Duration.Companion.m10409getZEROUwyO8pc())) {
            long duration = DurationKt.toDuration(KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds(), DurationUnit.NANOSECONDS);
            this.end = duration;
            this.time = Duration.m10341minusLRDsOJo(duration, this.start);
        }
    }
}
