package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!,r\bDZc|\u0004G\u00078\u000bDB\u0007\"B\u0012\u007f\u0007ljA0ZeP.XS2\u000f\u0002{<řc$\bCCU ~*\teNogtJb\u000bY\u000f\u000e\u0016~rD\u0006c{u\u0012=6jom8}sK?xtd\u0005P60?\u0012\u0005/\"ZL\u001e\u007f\u0013Cy\u0014B4NzRR;X5\u001e \u0012V /+#g¦5ԟǰa<51\u0011xZ~5oH|{\u001enTU\u001e'e,1X7c\u0015UY\t\u0007`bW\u0003mym\u000bn'54as\u0006>\u001f\u0005ѥ\u0014ۀ̠\u0011_x8j\u0018i\u0011\u001a7CO\u0012\\x\u000eV\t+\u007f\u001bB\u001c\u000e4'x43\u001at\u000f&3#\u0007\u0004FV\u0002lK\u0018z\u0010J]*Ƨ2ٿݰ\u001fhWvI/f_\n\u001c%\u001eQ\u0012\u0017!\ne>f\u001b\u001bb\u0010i1\u007fHmNT\ngV\u0006\u0004\u001fjH/̯/ϚĬ3}\u0017H%@O\u0004G:9k0Ylg%\u0016\u0011nYi``X\"\u001d*g0\u000f\fh]|\u0005\u001ad\u001b]ą\u0010۳ɟX\t\u0004$!=|\u000eJƙ=\u0010|N\u0011i\u0019M\u0014J{ÇhƠ]r\u0004\u0010]:l5̓Qh\u0018dXκ0m;О\tv"}, d2 = {"6na6m6Gb\u0015\u0006", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "5dc\u0015b9Bh#\b\nZ3", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0001<]\u007f)?m\u001f=4GDk\na\n", "/kX4a4>\\(e~g,f\n0s\u007f7c@|%'To", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "/kX4a4>\\(e~g,", "0dU<e,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "/ec2e", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "/kX4a4>\\(e~g,f\n0s\u007f7c@|%'ToUK{1Ane{", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cN5H(pM?\u001f\u0011;0\u0006DhVlvt1soO`\u0014F\r^sK1sPg_CWE\u000fi&x\u0016o,&\": \"\u0002&\u0017eW._`\u0017wn[xtqK\u0018\u000e\u0002\"HufPSo\u001fLxp&G\u0010\u0002\"A\"\\+p;\u0014A*#d\u0013[n'\u0014", ">`S1\\5@4&\t\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", ">`S1\\5@4&\t\u0003&z\u0002Y\fHlr", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Ps0\u0018}#[V^;&.yA\u0016\u001bb\u000eW:s\tbAyO%z\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\n\u0019?)3gJZcyT\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", ">`S1\\5@4&\t\u0003& v\u0016yBK&", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Ps0\u0018}#[V^;&.yA\u0016\u001bb\u000eW:s\tbAyS)z\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\n\u0019?)3gJZcyT\u0017", ">`S1\\5@4&\t\u0003;(\u000b\t6i\t(", "Bn_", "0ncAb4", ">`S1\\5@4&\t\u0003;(\u000b\t6i\t(C1\f\u000bd\\X\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:^c\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!g", ">`S1\\5@4&\t\u0003;(\u000b\t6i\t(CR^+\u001cZnq", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b>bc\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!g", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AlignmentLineKt {
    /* JADX INFO: renamed from: paddingFrom-4j6BHR0$default */
    public static /* synthetic */ Modifier m869paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f2, float f3, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            f2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f3 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        return m868paddingFrom4j6BHR0(modifier, alignmentLine, f2, f3);
    }

    /* JADX INFO: renamed from: paddingFrom-4j6BHR0 */
    public static final Modifier m868paddingFrom4j6BHR0(Modifier modifier, final AlignmentLine alignmentLine, final float f2, final float f3) {
        return modifier.then(new AlignmentLineOffsetDpElement(alignmentLine, f2, f3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                inspectorInfo.getProperties().set("before", Dp.m6636boximpl(f2));
                inspectorInfo.getProperties().set("after", Dp.m6636boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: paddingFrom-Y_r0B1c$default */
    public static /* synthetic */ Modifier m871paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j2, long j3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
        }
        if ((i2 & 4) != 0) {
            j3 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
        }
        return m870paddingFromY_r0B1c(modifier, alignmentLine, j2, j3);
    }

    /* JADX INFO: renamed from: paddingFrom-Y_r0B1c */
    public static final Modifier m870paddingFromY_r0B1c(Modifier modifier, final AlignmentLine alignmentLine, final long j2, final long j3) {
        return modifier.then(new AlignmentLineOffsetTextUnitElement(alignmentLine, j2, j3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", alignmentLine);
                inspectorInfo.getProperties().set("before", TextUnit.m6821boximpl(j2));
                inspectorInfo.getProperties().set("after", TextUnit.m6821boximpl(j3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: paddingFromBaseline-VpY3zN4$default */
    public static /* synthetic */ Modifier m873paddingFromBaselineVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        return m872paddingFromBaselineVpY3zN4(modifier, f2, f3);
    }

    /* JADX INFO: renamed from: paddingFromBaseline-VpY3zN4 */
    public static final Modifier m872paddingFromBaselineVpY3zN4(Modifier modifier, float f2, float f3) {
        Modifier.Companion companionM869paddingFrom4j6BHR0$default;
        Modifier.Companion companionM869paddingFrom4j6BHR0$default2;
        if (!Dp.m6643equalsimpl0(f2, Dp.Companion.m6658getUnspecifiedD9Ej5fM())) {
            companionM869paddingFrom4j6BHR0$default = m869paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f2, 0.0f, 4, null);
        } else {
            companionM869paddingFrom4j6BHR0$default = Modifier.Companion;
        }
        Modifier modifierThen = modifier.then(companionM869paddingFrom4j6BHR0$default);
        if (!Dp.m6643equalsimpl0(f3, Dp.Companion.m6658getUnspecifiedD9Ej5fM())) {
            companionM869paddingFrom4j6BHR0$default2 = m869paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f3, 2, null);
        } else {
            companionM869paddingFrom4j6BHR0$default2 = Modifier.Companion;
        }
        return modifierThen.then(companionM869paddingFrom4j6BHR0$default2);
    }

    /* JADX INFO: renamed from: paddingFromBaseline-wCyjxdI$default */
    public static /* synthetic */ Modifier m875paddingFromBaselinewCyjxdI$default(Modifier modifier, long j2, long j3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j2 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j3 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
        }
        return m874paddingFromBaselinewCyjxdI(modifier, j2, j3);
    }

    /* JADX INFO: renamed from: paddingFromBaseline-wCyjxdI */
    public static final Modifier m874paddingFromBaselinewCyjxdI(Modifier modifier, long j2, long j3) {
        return modifier.then(!TextUnitKt.m6849isUnspecifiedR2X_6o(j2) ? m871paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j2, 0L, 4, null) : Modifier.Companion).then(!TextUnitKt.m6849isUnspecifiedR2X_6o(j3) ? m871paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j3, 2, null) : Modifier.Companion);
    }

    /* JADX INFO: renamed from: alignmentLineOffsetMeasure-tjqqzMA */
    public static final MeasureResult m867alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f2, float f3, Measurable measurable, long j2) {
        final int iMax;
        final int height;
        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m6582copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null) : Constraints.m6582copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
        int i2 = placeableMo5514measureBRTryo0.get(alignmentLine);
        if (i2 == Integer.MIN_VALUE) {
            i2 = 0;
        }
        int height2 = getHorizontal(alignmentLine) ? placeableMo5514measureBRTryo0.getHeight() : placeableMo5514measureBRTryo0.getWidth();
        int iM6590getMaxHeightimpl = (getHorizontal(alignmentLine) ? Constraints.m6590getMaxHeightimpl(j2) : Constraints.m6591getMaxWidthimpl(j2)) - height2;
        final int iCoerceIn = RangesKt.coerceIn((!Dp.m6643equalsimpl0(f2, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) ? measureScope.mo704roundToPx0680j_4(f2) : 0) - i2, 0, iM6590getMaxHeightimpl);
        final int iCoerceIn2 = RangesKt.coerceIn(((!Dp.m6643equalsimpl0(f3, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) ? measureScope.mo704roundToPx0680j_4(f3) : 0) - height2) + i2, 0, iM6590getMaxHeightimpl - iCoerceIn);
        if (getHorizontal(alignmentLine)) {
            iMax = placeableMo5514measureBRTryo0.getWidth();
        } else {
            iMax = Math.max(placeableMo5514measureBRTryo0.getWidth() + iCoerceIn + iCoerceIn2, Constraints.m6593getMinWidthimpl(j2));
        }
        if (getHorizontal(alignmentLine)) {
            height = Math.max(placeableMo5514measureBRTryo0.getHeight() + iCoerceIn + iCoerceIn2, Constraints.m6592getMinHeightimpl(j2));
        } else {
            height = placeableMo5514measureBRTryo0.getHeight();
        }
        return MeasureScope.layout$default(measureScope, iMax, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                int width;
                int height3 = 0;
                if (AlignmentLineKt.getHorizontal(alignmentLine)) {
                    width = 0;
                } else {
                    width = !Dp.m6643equalsimpl0(f2, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) ? iCoerceIn : (iMax - iCoerceIn2) - placeableMo5514measureBRTryo0.getWidth();
                }
                if (AlignmentLineKt.getHorizontal(alignmentLine)) {
                    height3 = !Dp.m6643equalsimpl0(f2, Dp.Companion.m6658getUnspecifiedD9Ej5fM()) ? iCoerceIn : (height - iCoerceIn2) - placeableMo5514measureBRTryo0.getHeight();
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo0, width, height3, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }
}
