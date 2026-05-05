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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: AspectRatio.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<G\u0007Ӭ4\u0012\u0006\u0010nj?8Le^.ZS@\u000fs{:%c$\u007fICU0}*ޛWN}gvJ`\rK\u000f\u001c\u0016\u0001jBI]xs\u0012\u00172H}E3cڎm9\u000fsf\u0005N2bK\n\t\u000f\u001bBH>x\u000bGY\u000f*0ntĐV\r[\nb&\u0014L8\u0001Lk\u0010NdX3]Ƕ.݊ɨmDT8mBEg\u001bYl';\u000b\n\u001eYUg9#;k\u00035i\fC\u0011W\n=3|m;sc\u0002pNX.(=+}\"\u000ev4r\u001dQ\u000f#W/]}cP<<>\u000fD1J\u001f&\u0006UdV-H\u00048\u0012A\u000b\u000bSnn2bP\u001f\u0013ad'k\u0014Ɗ*ݍӸjSg['o\u007f\u0016\u0013/6#/\u0003I[\u0003#\u0011\u0019)j\u0010Q_hpAVf\"Yk\u0002J\u0005+\u001c8'HG.C$\u0011\\,U;iO;!\u001a\u0019xHu\u0011\u001d`\u0017g0f\u0011^0\u0013.7X\u00184Zrt5qVTfQ)MJXM}ު\u0012\u05feϢ{>'K\u001eu\u0018\u0007w\u0013e]84Wfei\u001fq\u0014WG\u0004K5\u007fgVa٥uܝ͖@d\u000b\u0002ti\u001c*h\u0007@\"`W\u0013\u0010&\ftT\u0012\u0013@d\n\u001cb0w\u0019ě\u0014ǽҴ\"DG(\u0017\u0007#\u0007\u001e+l3R\u0012\u0012$#\u00191Vbp}\r\u0011IZ\u0001'\"Ѓ@ٛڤ\u001d([Ov[M;\u0015\u007f\f\u007fui#܈X̡\u001a\u0002]ݨ8\u0018 ?_6]\u0015\u0015\u00077;RESO\u000be\u007fQh\u0604\u0007܃}\u001bCÜFi\u000et~7\u0001lP[b$Ǵvcz&\u000e\u070f\u001c(`è~u"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q<XC9z!\u001a$lk\"\u0011b,$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "/r_2V;+O(\u0003\u0005", "", ";`c0[\u000f>W\u001b\u0002\n<6\u0006\u0017>r{,\u0005O\u000fw\u001bT}\u001d", "", "uEIuI", "5dc\u000ef7>Q(kvm0\u0007", "u(5", "Adc\u000ef7>Q(kvm0\u0007", "uE\u0018#", "5dc\u001aT;<V{~~`/\ff9n\u000e7\t<\u0005 &UP\u0012I\u00054", "u(I", "Adc\u001aT;<V{~~`/\ff9n\u000e7\t<\u0005 &UP\u0012I\u00054", "uY\u0018#", "4h]1F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "4h]1F0SS`m\u0005Q/\fpA", "uI\u0018\u0017", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "Bqh\u001aT?!S\u001d\u0001}m", "3mU<e*>1#\b\tm9x\r8t\u000e", "Bqh\u001aT?!S\u001d\u0001}msaqv0[\u0005}", "uIIu=", "Bqh\u001aT?0W\u0018\u000e}", "Bqh\u001aT?0W\u0018\u000e}&\u0011ePyA\\*", "Bqh\u001a\\5!S\u001d\u0001}m", "Bqh\u001a\\5!S\u001d\u0001}msaqv0[\u0005}", "Bqh\u001a\\50W\u0018\u000e}", "Bqh\u001a\\50W\u0018\u000e}&\u0011ePyA\\*", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final void setAspectRatio(float f2) {
        this.aspectRatio = f2;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public final void setMatchHeightConstraintsFirst(boolean z2) {
        this.matchHeightConstraintsFirst = z2;
    }

    public AspectRatioNode(float f2, boolean z2) {
        this.aspectRatio = f2;
        this.matchHeightConstraintsFirst = z2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo428measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        long jM6601fixedJhjzzOo = j2;
        long jM915findSizeToXhtMw = m915findSizeToXhtMw(jM6601fixedJhjzzOo);
        if (!IntSize.m6806equalsimpl0(jM915findSizeToXhtMw, IntSize.Companion.m6813getZeroYbymL2g())) {
            jM6601fixedJhjzzOo = Constraints.Companion.m6601fixedJhjzzOo(IntSize.m6808getWidthimpl(jM915findSizeToXhtMw), IntSize.m6807getHeightimpl(jM915findSizeToXhtMw));
        }
        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(jM6601fixedJhjzzOo);
        return MeasureScope.layout$default(measureScope, placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
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
        return i2 != Integer.MAX_VALUE ? Math.round(i2 * this.aspectRatio) : intrinsicMeasurable.minIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return i2 != Integer.MAX_VALUE ? Math.round(i2 * this.aspectRatio) : intrinsicMeasurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return i2 != Integer.MAX_VALUE ? Math.round(i2 / this.aspectRatio) : intrinsicMeasurable.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return i2 != Integer.MAX_VALUE ? Math.round(i2 / this.aspectRatio) : intrinsicMeasurable.maxIntrinsicHeight(i2);
    }

    /* JADX INFO: renamed from: findSize-ToXhtMw */
    private final long m915findSizeToXhtMw(long j2) {
        if (!this.matchHeightConstraintsFirst) {
            long jM919tryMaxWidthJN0ABg$default = m919tryMaxWidthJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m6806equalsimpl0(jM919tryMaxWidthJN0ABg$default, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM919tryMaxWidthJN0ABg$default;
            }
            long jM917tryMaxHeightJN0ABg$default = m917tryMaxHeightJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m6806equalsimpl0(jM917tryMaxHeightJN0ABg$default, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM917tryMaxHeightJN0ABg$default;
            }
            long jM923tryMinWidthJN0ABg$default = m923tryMinWidthJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m6806equalsimpl0(jM923tryMinWidthJN0ABg$default, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM923tryMinWidthJN0ABg$default;
            }
            long jM921tryMinHeightJN0ABg$default = m921tryMinHeightJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m6806equalsimpl0(jM921tryMinHeightJN0ABg$default, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM921tryMinHeightJN0ABg$default;
            }
            long jM918tryMaxWidthJN0ABg = m918tryMaxWidthJN0ABg(j2, false);
            if (!IntSize.m6806equalsimpl0(jM918tryMaxWidthJN0ABg, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM918tryMaxWidthJN0ABg;
            }
            long jM916tryMaxHeightJN0ABg = m916tryMaxHeightJN0ABg(j2, false);
            if (!IntSize.m6806equalsimpl0(jM916tryMaxHeightJN0ABg, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM916tryMaxHeightJN0ABg;
            }
            long jM922tryMinWidthJN0ABg = m922tryMinWidthJN0ABg(j2, false);
            if (!IntSize.m6806equalsimpl0(jM922tryMinWidthJN0ABg, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM922tryMinWidthJN0ABg;
            }
            long jM920tryMinHeightJN0ABg = m920tryMinHeightJN0ABg(j2, false);
            if (!IntSize.m6806equalsimpl0(jM920tryMinHeightJN0ABg, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM920tryMinHeightJN0ABg;
            }
        } else {
            long jM917tryMaxHeightJN0ABg$default2 = m917tryMaxHeightJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m6806equalsimpl0(jM917tryMaxHeightJN0ABg$default2, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM917tryMaxHeightJN0ABg$default2;
            }
            long jM919tryMaxWidthJN0ABg$default2 = m919tryMaxWidthJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m6806equalsimpl0(jM919tryMaxWidthJN0ABg$default2, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM919tryMaxWidthJN0ABg$default2;
            }
            long jM921tryMinHeightJN0ABg$default2 = m921tryMinHeightJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m6806equalsimpl0(jM921tryMinHeightJN0ABg$default2, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM921tryMinHeightJN0ABg$default2;
            }
            long jM923tryMinWidthJN0ABg$default2 = m923tryMinWidthJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m6806equalsimpl0(jM923tryMinWidthJN0ABg$default2, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM923tryMinWidthJN0ABg$default2;
            }
            long jM916tryMaxHeightJN0ABg2 = m916tryMaxHeightJN0ABg(j2, false);
            if (!IntSize.m6806equalsimpl0(jM916tryMaxHeightJN0ABg2, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM916tryMaxHeightJN0ABg2;
            }
            long jM918tryMaxWidthJN0ABg2 = m918tryMaxWidthJN0ABg(j2, false);
            if (!IntSize.m6806equalsimpl0(jM918tryMaxWidthJN0ABg2, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM918tryMaxWidthJN0ABg2;
            }
            long jM920tryMinHeightJN0ABg2 = m920tryMinHeightJN0ABg(j2, false);
            if (!IntSize.m6806equalsimpl0(jM920tryMinHeightJN0ABg2, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM920tryMinHeightJN0ABg2;
            }
            long jM922tryMinWidthJN0ABg2 = m922tryMinWidthJN0ABg(j2, false);
            if (!IntSize.m6806equalsimpl0(jM922tryMinWidthJN0ABg2, IntSize.Companion.m6813getZeroYbymL2g())) {
                return jM922tryMinWidthJN0ABg2;
            }
        }
        return IntSize.Companion.m6813getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg$default */
    static /* synthetic */ long m919tryMaxWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j2, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return aspectRatioNode.m918tryMaxWidthJN0ABg(j2, z2);
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg */
    private final long m918tryMaxWidthJN0ABg(long j2, boolean z2) {
        int iRound;
        int iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2);
        if (iM6591getMaxWidthimpl != Integer.MAX_VALUE && (iRound = Math.round(iM6591getMaxWidthimpl / this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iM6591getMaxWidthimpl, iRound);
            if (!z2 || ConstraintsKt.m6609isSatisfiedBy4WqzIAM(j2, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.Companion.m6813getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg$default */
    static /* synthetic */ long m917tryMaxHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j2, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = true;
        }
        return aspectRatioNode.m916tryMaxHeightJN0ABg(j2, z2);
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg */
    private final long m916tryMaxHeightJN0ABg(long j2, boolean z2) {
        int iRound;
        int iM6590getMaxHeightimpl = Constraints.m6590getMaxHeightimpl(j2);
        if (iM6590getMaxHeightimpl != Integer.MAX_VALUE && (iRound = Math.round(iM6590getMaxHeightimpl * this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iRound, iM6590getMaxHeightimpl);
            if (!z2 || ConstraintsKt.m6609isSatisfiedBy4WqzIAM(j2, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.Companion.m6813getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg$default */
    static /* synthetic */ long m923tryMinWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j2, boolean z2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = true;
        }
        return aspectRatioNode.m922tryMinWidthJN0ABg(j2, z2);
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg */
    private final long m922tryMinWidthJN0ABg(long j2, boolean z2) {
        int iM6593getMinWidthimpl = Constraints.m6593getMinWidthimpl(j2);
        int iRound = Math.round(iM6593getMinWidthimpl / this.aspectRatio);
        if (iRound > 0) {
            long jIntSize = IntSizeKt.IntSize(iM6593getMinWidthimpl, iRound);
            if (!z2 || ConstraintsKt.m6609isSatisfiedBy4WqzIAM(j2, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.Companion.m6813getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg$default */
    static /* synthetic */ long m921tryMinHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j2, boolean z2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = true;
        }
        return aspectRatioNode.m920tryMinHeightJN0ABg(j2, z2);
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg */
    private final long m920tryMinHeightJN0ABg(long j2, boolean z2) {
        int iM6592getMinHeightimpl = Constraints.m6592getMinHeightimpl(j2);
        int iRound = Math.round(iM6592getMinHeightimpl * this.aspectRatio);
        if (iRound > 0) {
            long jIntSize = IntSizeKt.IntSize(iRound, iM6592getMinHeightimpl);
            if (!z2 || ConstraintsKt.m6609isSatisfiedBy4WqzIAM(j2, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.Companion.m6813getZeroYbymL2g();
    }
}
