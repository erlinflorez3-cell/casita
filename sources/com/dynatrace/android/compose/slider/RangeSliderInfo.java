package com.dynatrace.android.compose.slider;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4B\u0007\"B\u0012\u007f\u0007|jA0ReP.XY2\u000fy\b<řa#\bّkUH|b8_Rug\u0007J\t\fS\u0013\u0014\u0018\u0011jZJe\u000fk\u0015'DRwO9]qM9\u000fud\n0428(\u000b/\u001eݵL\u0012|\u0002QST\u0018>N\t:\u0001\u001c\u0014\u0019j!\u0014>8\u0001L]ʄR<PǍu<5,\u0011s\u0013]5aH|{\u000eТX-\u0015Ǹy 1KE?eFa\u0006\u001fdkG\u0013E\u0002?\u0015hU(YN\u0004YFX.\u001aC/̠\u0011cz̦t\u0007Wl\u001a4ˬSs"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w:?Dm4\f\u001cl`9\u0014G5O\u0001|", "", "AsP?g\u0017NQ\u001fi\u0005l0\f\r9n", "", "3mS\u001dh*D>#\r~m0\u0007\u0012", "And?V,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?a\u001e!C~\u0012Ex\u0010?]\u0007/$i\u001f0M\u0019", "", "\nh]6g\u0005", "uE5\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1\u0007", "5dc g(Kb\u0004\u000fxd\u0017\u0007\u00173t\u00042\u0005", "u(5", "5dc\u0012a+)c\u0017\u0005eh:\u0001\u00183o\t", "5dc b<KQ\u0019", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "BnBAe0GU", "", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class RangeSliderInfo {
    public static final int $stable = 0;
    private final float endPuckPosition;
    private final Function1<ClosedFloatingPointRange<Float>, Unit> source;
    private final float startPuckPosition;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderInfo(float f2, float f3, Function1<? super ClosedFloatingPointRange<Float>, Unit> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.startPuckPosition = f2;
        this.endPuckPosition = f3;
        this.source = source;
    }

    public final float getEndPuckPosition() {
        return this.endPuckPosition;
    }

    public final Function1<ClosedFloatingPointRange<Float>, Unit> getSource() {
        return this.source;
    }

    public final float getStartPuckPosition() {
        return this.startPuckPosition;
    }

    public String toString() {
        return "RangeSliderInfo{startPuckPosition=" + this.startPuckPosition + ", endPuckPosition=" + this.endPuckPosition + ", source=" + this.source.getClass().getName() + AbstractJsonLexerKt.END_OBJ;
    }
}
