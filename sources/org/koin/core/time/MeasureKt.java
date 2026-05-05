package org.koin.core.time;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.koin.mp.KoinPlatformTimeTools;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d̉=!,m\bDZc|İI\u0006F\u000b6B\r\"4ߚ\u007f\u0007|jA0Jg`J`ݷB\u0013\u001az\u001d$:$\"MIV2\u00042\u000b_N\u0016j\u001dL!ŖIȝ\u0005ǝ\u0011\u0019:Mm\tm\u0014\u001f2\tuO9]sk8It\u0015\u0005N7B:\u007fڎ\u000f ZR\u001ew\u0013I[\u000e\"0\u0007vhTS˦\u000bݾ\u0011ßVN\u000f%tw^8Xl$@?)\u0013mpM\u0010_\u000f|{\u0012fV-˙\u0005gN5N8M\u001b5U\u0013\u0007\u0019am\u0005\u0006уCߔgѧO3W{w6\u0007~D\u0015YN\u0558]w._\u000bŃ\u0011:&ˬSl"}, d2 = {";dP@h9>2)\fvm0\u0007\u0012", "", "\u001ana4\"2HW\"Hxh9|R>i\b(E/\u0005\u001f\u0017+xu@},9gS", "1nS2", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", ";dP@h9>2)\fvm0\u0007\u0012\u0010o\r\u0015{N\u0011\u001e&", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\"", ";dP@h9>B\u001d\u0007z]\u001dx\u0010?e", "\"h\\2<5&W \u0006~l", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MeasureKt {
    public static final double measureDuration(Function0<Unit> code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return ((Number) new Pair(code.invoke(), Double.valueOf((KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds() - KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds()) / 1000000.0d)).getSecond()).doubleValue();
    }

    public static final <T> Pair<T, Double> measureDurationForResult(Function0<? extends T> code) {
        Intrinsics.checkNotNullParameter(code, "code");
        Pair pair = new Pair(code.invoke(), Double.valueOf((KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds() - KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds()) / 1000000.0d));
        return new Pair<>(pair.component1(), Double.valueOf(((Number) pair.component2()).doubleValue()));
    }

    public static final <T> Pair<T, Double> measureTimedValue(Function0<? extends T> code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new Pair<>(code.invoke(), Double.valueOf((KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds() - KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds()) / 1000000.0d));
    }
}
