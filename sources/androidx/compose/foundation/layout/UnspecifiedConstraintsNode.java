package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u001a\u007f\u0007tpA0ZeP\u008cZS@\u000fs{:&c$\bCCU0}*\teNo˧vJp\u000bK\u000f\f\u0019~jBկ\u0006x\f\u0011?2po\u007fJ]uC9nuN\u0005N42>\u007f\u0005\u000f\u001dBH>xټGK\u001a\u0016xZ~Fj\r{\u0012B\u00124LP\u0005,k\u007fNdX\u001daH@;\u0003\u0018O\u0015;(J\u000b_%F\u000345v\u0010,[DED-%\u0002\u00137ViR\u001b? JK|oK9]\fWdm(\u0014CA\u007f\u0011k\u0002>\\3h\u0011\u00105CgcyiT<ĴyԈɁ@\u0006\u0014 5cvG(\u0003 \u000ea\u0002\u001bSn^2bP\u000f\u0013ad'U\u0004A<Q\u001b\u0015^(OahE\u0019\u001d\rL0)nOi\u0005\u0012n$3T&aaUNP`N8f\u0004\u0002T\u0011p\u0005B\u0004^IV\u0082\bö-Ϗğ6Zޠ'/s\u0002VM\u007fx\u000bevY\nTNG0vfW8\n$Zrf[ߟ\\ղW\u008cԃL\u001bΤ\u000b\f\u0010\u0013.e\u0010>'/\u001eTojou[e܆%8n:_ˆ\b<VA^9TɊg."}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00067[N;i8\u001f\u0019h`\u0017\u0011l:]\u0004#KU]:E\\q=i", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", ";h]$\\+MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ";h]\u0015X0@V(", "uE5\u0019^6MZ\u001d\bDc=\u0005R3n\u000f(\tI|\u001e`&o\u000f8\u0007,D7\b)E|#>KREx\u001c\u001a\"naF\\'\u001d", "5dc\u001a\\5!S\u001d\u0001}ms[\\\u000fjO)c", "u(5", "Adc\u001a\\5!S\u001d\u0001}msGY\u00020\u0005\"J", "uE\u0018#", "\u0014", "5dc\u001a\\50W\u0018\u000e}&\u000bPh45\u0001\u0010", "Adc\u001a\\50W\u0018\u000e}&vM[yjyv", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    private float minHeight;
    private float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3);
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float f2, float f3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? Dp.Companion.m6658getUnspecifiedD9Ej5fM() : f2, (i2 & 2) != 0 ? Dp.Companion.m6658getUnspecifiedD9Ej5fM() : f3, null);
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1083getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    /* JADX INFO: renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m1085setMinWidth0680j_4(float f2) {
        this.minWidth = f2;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1082getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* JADX INFO: renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m1084setMinHeight0680j_4(float f2) {
        this.minHeight = f2;
    }

    private UnspecifiedConstraintsNode(float f2, float f3) {
        this.minWidth = f2;
        this.minHeight = f3;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo428measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        int iM6593getMinWidthimpl;
        int iM6592getMinHeightimpl;
        if (!Dp.m6643equalsimpl0(this.minWidth, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) && Constraints.m6593getMinWidthimpl(j2) == 0) {
            iM6593getMinWidthimpl = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(measureScope.mo704roundToPx0680j_4(this.minWidth), Constraints.m6591getMaxWidthimpl(j2)), 0);
        } else {
            iM6593getMinWidthimpl = Constraints.m6593getMinWidthimpl(j2);
        }
        int iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2);
        if (!Dp.m6643equalsimpl0(this.minHeight, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) && Constraints.m6592getMinHeightimpl(j2) == 0) {
            iM6592getMinHeightimpl = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(measureScope.mo704roundToPx0680j_4(this.minHeight), Constraints.m6590getMaxHeightimpl(j2)), 0);
        } else {
            iM6592getMinHeightimpl = Constraints.m6592getMinHeightimpl(j2);
        }
        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(ConstraintsKt.Constraints(iM6593getMinWidthimpl, iM6591getMaxWidthimpl, iM6592getMinHeightimpl, Constraints.m6590getMaxHeightimpl(j2)));
        return MeasureScope.layout$default(measureScope, placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return RangesKt.coerceAtLeast(intrinsicMeasurable.minIntrinsicWidth(i2), !Dp.m6643equalsimpl0(this.minWidth, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo704roundToPx0680j_4(this.minWidth) : 0);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return RangesKt.coerceAtLeast(intrinsicMeasurable.maxIntrinsicWidth(i2), !Dp.m6643equalsimpl0(this.minWidth, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo704roundToPx0680j_4(this.minWidth) : 0);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return RangesKt.coerceAtLeast(intrinsicMeasurable.minIntrinsicHeight(i2), !Dp.m6643equalsimpl0(this.minHeight, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo704roundToPx0680j_4(this.minHeight) : 0);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return RangesKt.coerceAtLeast(intrinsicMeasurable.maxIntrinsicHeight(i2), !Dp.m6643equalsimpl0(this.minHeight, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo704roundToPx0680j_4(this.minHeight) : 0);
    }
}
