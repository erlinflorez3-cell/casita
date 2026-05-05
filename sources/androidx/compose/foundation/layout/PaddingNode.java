package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0014\u007f\u0007tsA0JtP.hS2\u000f\u0002{<řc$\bCC٥\"}8\tWNmhtJpŏs\u000f4\u0015)jZI\u0016,m\u0018\u00152PpW3{qM?ftD\b82P:\n\u000b\u0007\u001a8L(v)E[\u0012\u00180NuRR;O\u0015\u001e \fV /%֔kNDP5\u0002HG;\u0003\u0018[v'\u000eJ-Q\u001bal';\u0013\u0012\"9]O5CC\u001a\u0017\u008fQ¹ύ\u0007Aw\\\u0013\twG9N\fWdZVϳ!ܹNՕȗq%ػ\t_h\f58geQY\u001c2\u0018|\u0002\u0018J\u0010^&5LF-Hh^ԋ?иqԟŬO\u0001ެF\u000e\u0003aD$=\u000299G%\u0007SgJ'Z\b\u0014\u0013\u00136#/uwƃ`\u05f8d!#Ƙ\u0010S7aNNhP\u0010kK\u0001T\u0011p\u0003B\u0004^IV\u0082\bö-Ϗğ6Zޠ'/s\u0002VQ\u007fx\u000btv]\nTNU0zfW8\f$Zrf[ߟ\\ղW\u008cԃL\u001bΤ\u000b\f\u0010\u0013.i\u0010>';\u001eXojo\u0002[i܆%8n:_ˆ\b<VA^9TɊg1"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u0007\u001fga\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "AsP?g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "Bn_", "3mS", "0ncAb4", "@s[\u000ej(KS", "", "uE5\u00139!%Y#\u000e\u0002b5F\u000e@mI,\u0005O\u0001$ CvW\u001bv&1i\u0005/\u0015w\u001f<\\PKiC(\"P]F\rc9$:\u0018", "5dc\u000fb;M]!FY2\f\u0002X0M", "u(5", "Adc\u000fb;M]!FE/~G\u000e)4", "uE\u0018#", "\u0014", "5dc\u0012a+\u00062l^\u007f.-d", "Adc\u0012a+\u0006\u001eiQEc&K", "5dc\u001fg3\u001ae\u0015\fz", "u(I", "Adc\u001fg3\u001ae\u0015\fz", "uY\u0018#", "5dc g(Kb`]N>1L\n\u0017", "Adc g(Kb`IK1v\u0002\u0003}", "5dc!b7\u00062l^\u007f.-d", "Adc!b7\u0006\u001eiQEc&K", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class PaddingNode extends Modifier.Node implements LayoutModifierNode {
    private float bottom;
    private float end;
    private boolean rtlAware;
    private float start;
    private float top;

    public /* synthetic */ PaddingNode(float f2, float f3, float f4, float f5, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, z2);
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m1025getStartD9Ej5fM() {
        return this.start;
    }

    /* JADX INFO: renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m1029setStart0680j_4(float f2) {
        this.start = f2;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m1026getTopD9Ej5fM() {
        return this.top;
    }

    /* JADX INFO: renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m1030setTop0680j_4(float f2) {
        this.top = f2;
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m1024getEndD9Ej5fM() {
        return this.end;
    }

    /* JADX INFO: renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m1028setEnd0680j_4(float f2) {
        this.end = f2;
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m1023getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m1027setBottom0680j_4(float f2) {
        this.bottom = f2;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    public final void setRtlAware(boolean z2) {
        this.rtlAware = z2;
    }

    private PaddingNode(float f2, float f3, float f4, float f5, boolean z2) {
        this.start = f2;
        this.top = f3;
        this.end = f4;
        this.bottom = f5;
        this.rtlAware = z2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo428measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j2) {
        int i2 = measureScope.mo704roundToPx0680j_4(this.start) + measureScope.mo704roundToPx0680j_4(this.end);
        int i3 = measureScope.mo704roundToPx0680j_4(this.top) + measureScope.mo704roundToPx0680j_4(this.bottom);
        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(ConstraintsKt.m6610offsetNN6EwU(j2, -i2, -i3));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m6608constrainWidthK40F9xA(j2, placeableMo5514measureBRTryo0.getWidth() + i2), ConstraintsKt.m6607constrainHeightK40F9xA(j2, placeableMo5514measureBRTryo0.getHeight() + i3), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.PaddingNode$measure$1
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
                if (this.this$0.getRtlAware()) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo0, measureScope.mo704roundToPx0680j_4(this.this$0.m1025getStartD9Ej5fM()), measureScope.mo704roundToPx0680j_4(this.this$0.m1026getTopD9Ej5fM()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo5514measureBRTryo0, measureScope.mo704roundToPx0680j_4(this.this$0.m1025getStartD9Ej5fM()), measureScope.mo704roundToPx0680j_4(this.this$0.m1026getTopD9Ej5fM()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    public /* synthetic */ PaddingNode(float f2, float f3, float f4, float f5, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? Dp.m6638constructorimpl(0) : f2, (i2 + 2) - (2 | i2) != 0 ? Dp.m6638constructorimpl(0) : f3, (4 & i2) != 0 ? Dp.m6638constructorimpl(0) : f4, (i2 + 8) - (i2 | 8) != 0 ? Dp.m6638constructorimpl(0) : f5, z2, null);
    }
}
