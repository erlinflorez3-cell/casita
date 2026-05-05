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
import androidx.compose.ui.unit.Density;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0014\u007f\u0007tsA0JtP.hS2\u000f\u0002{<$a%yCI[\"}8\tWȞog\u0005Jb\u000bI\u0011\u000e\u0016\u000fj4Ikxe\u0012%2JoE7SoSʠ\u0011td\u0004P2P8:8\u0011 0H\u001ew\u0013Cy\u000e\"6FpHU%M3\u001c\"\fD \u000f\"tg|8Xrc:=(\u001bipP7c>\u0003e\rt[ܮ\u0011vo&sZER-%\u0002!/R\n^3C\u007f]\u001dhUH[M\u0002yNX.2[?\u0018'k\u0016>\\3o\t\fUJ\u007fgYp&(&\u001c,\u0011J(&\u0006UftAb\u000b\u00163Kt!yhP0\u0006r\u0004\t\u0002N\u0017S(c/GD~Q\u0010T_bӒz˜ڟ\"%\u0007\u0019/\u0007\u001d(nA3T&oYQn\\xR\u0018yUm2\u0012\u0013\u00068&HG.MB%v13ds9Q?\u0014\u0002vc\u0018z\u0013\u0001\u0001S\u0018sxD0\u0013.7X'Rn\u0015|\u0013qhT\u00073gۺ(Τ\u000b\n\u0010ʶ8^}E//0PUswv\u001e}\u0018*Gfe[E\u008f\u001aŜ8Ӕܡ4PӒ\u0014oZv\"PTd\u000betPs\u000e`k62\u0003hx\u0014\u0010{rPbƕ>Ǧpʉڲ+0Ǭ`#P\u0003,SY~\u000fqhv0\u0001ZF2\u0013:D\u0003\f\u0019P\u000brFΦ\u0005Λ+ʉ̙!,ۮUC!&c3\u00016\u00037\u0015\r\u0014\u0002M|ZW\u001d\r$vm{N\u0018pߠ]ɶ<Пĺ}(ɨ\u0006;ML\u0001viO\u0018=\t\u000b\u001a\u0011A\u007f<wX\u0007~Dxjxh|\u0017P\u0011\u00153yΫfҹxӓĸyFϭX\u000fs@O\u000e\u0011uߥNA\u0005\b%ǩA/n*|;Lϧ+K"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00042bC$u3\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", ";h]$\\+MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ";h]\u0015X0@V(", ";`g$\\+MV", ";`g\u0015X0@V(", "3mU<e*>7\"|\u0005f0\u0006\u000b", "", "uE5\u00139!%Y#\u000e\u0002b5F\u000e@mI,\u0005O\u0001$ CvW\u001bv&1i\u0005/\u0015w\u001f<\\PKiC(\"P]F\rc9$:\u0018", "5dc\u0012a-H`\u0017~^g*\u0007\u00113n\u0002", "u(I", "Adc\u0012a-H`\u0017~^g*\u0007\u00113n\u0002", "uY\u0018#", "5dc\u001aT?!S\u001d\u0001}ms[\\\u000fjO)c", "u(5", "Adc\u001aT?!S\u001d\u0001}msGY\u00020\u0005\"J", "uE\u0018#", "\u0014", "5dc\u001aT?0W\u0018\u000e}&\u000bPh45\u0001\u0010", "Adc\u001aT?0W\u0018\u000e}&vM[yjyv", "5dc\u001a\\5!S\u001d\u0001}ms[\\\u000fjO)c", "Adc\u001a\\5!S\u001d\u0001}msGY\u00020\u0005\"J", "5dc\u001a\\50W\u0018\u000e}&\u000bPh45\u0001\u0010", "Adc\u001a\\50W\u0018\u000e}&vM[yjyv", "B`a4X;\u001c]\"\r\nk(\u0001\u0012>s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "5dc!T9@S(\\\u0005g:\f\u0016+i\t7\n\bj\u0017 'KZJ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1z", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f2, float f3, float f4, float f5, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, z2);
    }

    public /* synthetic */ SizeNode(float f2, float f3, float f4, float f5, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? Dp.Companion.m6658getUnspecifiedD9Ej5fM() : f2, (i2 + 2) - (2 | i2) != 0 ? Dp.Companion.m6658getUnspecifiedD9Ej5fM() : f3, (4 & i2) != 0 ? Dp.Companion.m6658getUnspecifiedD9Ej5fM() : f4, (i2 & 8) != 0 ? Dp.Companion.m6658getUnspecifiedD9Ej5fM() : f5, z2, null);
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1075getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    /* JADX INFO: renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m1079setMinWidth0680j_4(float f2) {
        this.minWidth = f2;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1074getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* JADX INFO: renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m1078setMinHeight0680j_4(float f2) {
        this.minHeight = f2;
    }

    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m1073getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    /* JADX INFO: renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m1077setMaxWidth0680j_4(float f2) {
        this.maxWidth = f2;
    }

    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    public final float m1072getMaxHeightD9Ej5fM() {
        return this.maxHeight;
    }

    /* JADX INFO: renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m1076setMaxHeight0680j_4(float f2) {
        this.maxHeight = f2;
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public final void setEnforceIncoming(boolean z2) {
        this.enforceIncoming = z2;
    }

    private SizeNode(float f2, float f3, float f4, float f5, boolean z2) {
        this.minWidth = f2;
        this.minHeight = f3;
        this.maxWidth = f4;
        this.maxHeight = f5;
        this.enforceIncoming = z2;
    }

    /* JADX INFO: renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    private final long m1071getTargetConstraintsOenEA2s(Density density) {
        int iCoerceAtLeast;
        int iCoerceAtLeast2;
        int i2 = 0;
        int iCoerceAtLeast3 = !Dp.m6643equalsimpl0(this.maxWidth, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) ? RangesKt.coerceAtLeast(density.mo704roundToPx0680j_4(this.maxWidth), 0) : Integer.MAX_VALUE;
        int iCoerceAtLeast4 = !Dp.m6643equalsimpl0(this.maxHeight, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) ? RangesKt.coerceAtLeast(density.mo704roundToPx0680j_4(this.maxHeight), 0) : Integer.MAX_VALUE;
        if (Dp.m6643equalsimpl0(this.minWidth, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) || (iCoerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(density.mo704roundToPx0680j_4(this.minWidth), iCoerceAtLeast3), 0)) == Integer.MAX_VALUE) {
            iCoerceAtLeast = 0;
        }
        if (!Dp.m6643equalsimpl0(this.minHeight, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) && (iCoerceAtLeast2 = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(density.mo704roundToPx0680j_4(this.minHeight), iCoerceAtLeast4), 0)) != Integer.MAX_VALUE) {
            i2 = iCoerceAtLeast2;
        }
        return ConstraintsKt.Constraints(iCoerceAtLeast, iCoerceAtLeast3, i2, iCoerceAtLeast4);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo428measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        int iCoerceAtMost;
        int iCoerceAtLeast;
        int iCoerceAtMost2;
        int iCoerceAtLeast2;
        long jConstraints;
        long jM1071getTargetConstraintsOenEA2s = m1071getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            jConstraints = ConstraintsKt.m6606constrainN9IONVI(j2, jM1071getTargetConstraintsOenEA2s);
        } else {
            if (!Dp.m6643equalsimpl0(this.minWidth, Dp.Companion.m6658getUnspecifiedD9Ej5fM())) {
                iCoerceAtMost = Constraints.m6593getMinWidthimpl(jM1071getTargetConstraintsOenEA2s);
            } else {
                iCoerceAtMost = RangesKt.coerceAtMost(Constraints.m6593getMinWidthimpl(j2), Constraints.m6591getMaxWidthimpl(jM1071getTargetConstraintsOenEA2s));
            }
            if (!Dp.m6643equalsimpl0(this.maxWidth, Dp.Companion.m6658getUnspecifiedD9Ej5fM())) {
                iCoerceAtLeast = Constraints.m6591getMaxWidthimpl(jM1071getTargetConstraintsOenEA2s);
            } else {
                iCoerceAtLeast = RangesKt.coerceAtLeast(Constraints.m6591getMaxWidthimpl(j2), Constraints.m6593getMinWidthimpl(jM1071getTargetConstraintsOenEA2s));
            }
            if (!Dp.m6643equalsimpl0(this.minHeight, Dp.Companion.m6658getUnspecifiedD9Ej5fM())) {
                iCoerceAtMost2 = Constraints.m6592getMinHeightimpl(jM1071getTargetConstraintsOenEA2s);
            } else {
                iCoerceAtMost2 = RangesKt.coerceAtMost(Constraints.m6592getMinHeightimpl(j2), Constraints.m6590getMaxHeightimpl(jM1071getTargetConstraintsOenEA2s));
            }
            if (!Dp.m6643equalsimpl0(this.maxHeight, Dp.Companion.m6658getUnspecifiedD9Ej5fM())) {
                iCoerceAtLeast2 = Constraints.m6590getMaxHeightimpl(jM1071getTargetConstraintsOenEA2s);
            } else {
                iCoerceAtLeast2 = RangesKt.coerceAtLeast(Constraints.m6590getMaxHeightimpl(j2), Constraints.m6592getMinHeightimpl(jM1071getTargetConstraintsOenEA2s));
            }
            jConstraints = ConstraintsKt.Constraints(iCoerceAtMost, iCoerceAtLeast, iCoerceAtMost2, iCoerceAtLeast2);
        }
        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(jConstraints);
        return MeasureScope.layout$default(measureScope, placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
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
        long jM1071getTargetConstraintsOenEA2s = m1071getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m6589getHasFixedWidthimpl(jM1071getTargetConstraintsOenEA2s) ? Constraints.m6591getMaxWidthimpl(jM1071getTargetConstraintsOenEA2s) : ConstraintsKt.m6608constrainWidthK40F9xA(jM1071getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long jM1071getTargetConstraintsOenEA2s = m1071getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m6588getHasFixedHeightimpl(jM1071getTargetConstraintsOenEA2s) ? Constraints.m6590getMaxHeightimpl(jM1071getTargetConstraintsOenEA2s) : ConstraintsKt.m6607constrainHeightK40F9xA(jM1071getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long jM1071getTargetConstraintsOenEA2s = m1071getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m6589getHasFixedWidthimpl(jM1071getTargetConstraintsOenEA2s) ? Constraints.m6591getMaxWidthimpl(jM1071getTargetConstraintsOenEA2s) : ConstraintsKt.m6608constrainWidthK40F9xA(jM1071getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long jM1071getTargetConstraintsOenEA2s = m1071getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m6588getHasFixedHeightimpl(jM1071getTargetConstraintsOenEA2s) ? Constraints.m6590getMaxHeightimpl(jM1071getTargetConstraintsOenEA2s) : ConstraintsKt.m6607constrainHeightK40F9xA(jM1071getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i2));
    }
}
