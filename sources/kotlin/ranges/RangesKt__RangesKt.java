package kotlin.ranges;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d̉=!,i\bӵLc\u0003\rIي8\u000b<D\u0007\"2\u0012\u007f\u0007tʑAӄLe^.ZS8)s{:$c$\bCCU }*\t][ogtJb\u000bY\u000f\u000e\u0016\u0007n4Ic}e\u0012\u00153Z\u0006M\u074ceok8\u0011xD\u000582P9*\t\u000f\u001cBH>yAŏcJ 4XphS-S\u000b܅ \u000bf /$|}T5Vs\u0006@?%\u0013i\tSUgX\u0003]\u000fVTm\u0012%jF+\u0007>e\u001b3]\u001b\thZ\u0006\b\u0006фEݾl'56a2e:p\u007fB\u0016KU\u0013ƞ\u0001+\u0005\u0005\u007ff,=1NqRx\u00148y\u000b{SA2\u001a.-X0=\u001a-\r<<\u001dr\u001aG\u0001\blL\u0018|w5]*Fę3ݰ\u001ff_nSG\\E\u0014\u000b\u001d 3\u00015&\n\\.l\u001bÑb|y7aBMH\u0015\u000f\bL\u0016\u00047g2.\u0012@_\u007fu\u0001Wы\u0017É;[G49\u0005\u0010V\\m\u0007\u0007ph\u0002|\u0001Zh\"\u001d)g.\u0017\u001crD\u0013\u00182´TpE\u001f[4Z\u0017\u007f\u0018\u0013Np&NI%>b\u007flwze]89uϑ7q\u001dy#o?n5EQ*\u0015\u0010^\u0017 Eֺp\n\u0001lRU\u001cZ#-PApjV|,H\\\u001c+2\u0006vbف,֞\u001d\\#^\u001b7PV\u0015\u000fo\\x\u0010-ga0+iR\b9\u0005^l\to\u0016\f\u0010؛|x;;Vi;)(e\"\u0017H+//~\"\u0014wkZWdlD\n\u001cݰ گ\u001eP"}, d2 = {"1gT0^\u001aMS$b\tI6\u000b\r>i\u0011(", "", "7r?<f0MW*~", "", "AsT=", "", "1n]AT0Ga", "\"", "", Global.BLANK, "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?m\u0013 Ioc", "", "3kT:X5M", "uKZ<g3B\\b\fvg.|\u0017xC\u00072\n@\u007f\u0004\u0013Pq\u000e\u0012]*1jyi>i\u001f0\u0017-8p4\u001c$>%.", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0019p\u007f1[I\u007f\u0004\u0013Pq\u000e\u0012", "uKZ<g3B\\b\fvg.|\u0017xO\u000b(\u0005 \n\u0016\u0004Cx\u0010<L\f:U\u000f\u001c\u0001t\u00127O\r%h9\u001e\u0013w7|{", "@`]4X\u001bH", "", "BgPA", "uKY.i(\bZ\u0015\b|(\n\u0007\u0011:a\r$xG\u0001l}Lk\u001f8@,1b\u007fi\u0015w\u001e9IP7h;\u001ej,H?\u0011r3R\u007fpTHW.\\`<\u001b\u001b\u001ch\u000eM\u0018\t\u000e[Ay", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?a\u001e!C~\u0012Ex\u0010?]\u0007/$i\u001f0M\u0019", "", "", "@`]4X\u001cGb\u001d\u0006", "uKY.i(\bZ\u0015\b|(\n\u0007\u0011:a\r$xG\u0001l}Lk\u001f8@,1b\u007fi\u0015w\u001e9IP7h;\u001ej,H?\u0011r3R\u007fpTHW.\\`<'\u001f\u0012cmW*y\u0001bC$D", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{>,80-:t\u0017%1)&3\n2")
public class RangesKt__RangesKt {
    public static final void checkStepIsPositive(boolean z2, Number step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (!z2) {
            throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
        }
    }

    private static final boolean contains(ClosedRange closedRange, Object obj) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return obj != null && closedRange.contains((Comparable) obj);
    }

    private static final boolean contains(OpenEndRange openEndRange, Object obj) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return obj != null && openEndRange.contains((Comparable) obj);
    }

    public static final ClosedFloatingPointRange<Double> rangeTo(double d2, double d3) {
        return new ClosedDoubleRange(d2, d3);
    }

    public static final ClosedFloatingPointRange<Float> rangeTo(float f2, float f3) {
        return new ClosedFloatRange(f2, f3);
    }

    public static final <T extends Comparable<? super T>> ClosedRange<T> rangeTo(T t2, T that) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return new ComparableRange(t2, that);
    }

    public static final OpenEndRange<Double> rangeUntil(double d2, double d3) {
        return new OpenEndDoubleRange(d2, d3);
    }

    public static final OpenEndRange<Float> rangeUntil(float f2, float f3) {
        return new OpenEndFloatRange(f2, f3);
    }

    public static final <T extends Comparable<? super T>> OpenEndRange<T> rangeUntil(T t2, T that) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return new ComparableOpenEndRange(t2, that);
    }
}
