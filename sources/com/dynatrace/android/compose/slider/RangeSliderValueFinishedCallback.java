package com.dynatrace.android.compose.slider;

import androidx.compose.ui.Modifier;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.compose.SemanticsManager;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLc\u0003\u0004Iي8\u000bDB\u0007\"B\u0012\u007f\u0007toAӄLe^.ZS0\u000fs{B-c$wDCU(\n*\tUSmf\u0005Ϻ\u000b\u0011S\u0011\u0016\u0016'jZH\u0016<m(\u001d3Z\u0002O;]uM;ptd\tN52:\n\u0005/\u001aXJ |\tHc\u000e(/nvJ`\u0013M\u0013!*\u000eN\"\u0011\u001e\u000bgd5vkm>=+\u001bipWϮc2\u0003W\u001bQ\u001d.\u001b\ny\u001eY@}ߥ\u0015uq\u0011\bjmO\u000bOwM\u0007x'U/wvg8h\u007fB\u0015YQcơt͉`\u0005YӠ\\59T{Mf\rV}Qԋ\u000fʀ\b\u000e\u000eΩ\u0019B;!~\u0010\u001e5\u0005r\u0002@f\u0001\rAVаcي\u001b%\bđ{E)niai\"%ќ}˿\u0011\u001e+Ч?-i`&`C(+ȰSśU@Eʰ\u001f(gK\u0006\n\u0001d\u0012*24u\u0003\u0006Ɍ\u001dѧ\u001b1?كQ%'z\u0010Xdi|\u0016nz\u05eemf"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w:?Dm4\f\u001cl`9\u0014T(U\u0007'(PW0jUr<q\u000ea\u0015K'\u000b\u000b/", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "=mE._<>1\u001cz\u0004`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?a\u001e!C~\u0012Ex\u0010?]\u0007/$i\u001f0M\u0019", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "=mE._<>1\u001cz\u0004`,]\r8i\u000e+{?", "CrT X4:\\(\u0003xl", "", "\nh]6g\u0005", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0012O\n92", "B`V", "", ">tR8C6LW(\u0003\u0005g:", "5dc\u001dh*D>#\r~m0\u0007\u0012=", "u(;8b;EW\"H\bZ5~\t=/]/\u0006N\u0001\u0016wNy\nKz.7D\b$@|\u0003*VE;A", "Adc\u001dh*D>#\r~m0\u0007\u0012=", "uKZ<g3B\\b\fvg.|\u0017xC\u00072\n@\u007fw\u001eQk\u001d@\u007f' c\u0002)FZ\u00127OC\u0011/%", "7me<^,", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class RangeSliderValueFinishedCallback implements Function0<Unit> {
    public static final int $stable = 8;
    private final Modifier modifier;
    private final Function1<ClosedFloatingPointRange<Float>, Unit> onValueChange;
    private final Function0<Unit> onValueChangeFinished;
    private ClosedFloatingPointRange<Float> puckPositions;
    private final String tag;
    private final boolean useSemantics;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderValueFinishedCallback(Function1<? super ClosedFloatingPointRange<Float>, Unit> onValueChange, Modifier modifier, Function0<Unit> function0, boolean z2) {
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        this.onValueChange = onValueChange;
        this.modifier = modifier;
        this.onValueChangeFinished = function0;
        this.useSemantics = z2;
        this.tag = Global.LOG_PREFIX + "RangeSliderValueFinishedCallback";
        this.puckPositions = RangesKt.rangeTo(0.0f, 1.0f);
    }

    public /* synthetic */ RangeSliderValueFinishedCallback(Function1 function1, Modifier modifier, Function0 function0, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, modifier, (i2 + 4) - (i2 | 4) != 0 ? null : function0, z2);
    }

    public final ClosedFloatingPointRange<Float> getPuckPositions() {
        return this.puckPositions;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2() {
        if (!Global.isAlive.get()) {
            Function0<Unit> function0 = this.onValueChangeFinished;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
        RangeSliderInfo rangeSliderInfo = new RangeSliderInfo(this.puckPositions.getStart().floatValue(), this.puckPositions.getEndInclusive().floatValue(), this.onValueChange);
        if (Global.DEBUG) {
            Utility.zlogD(this.tag, "onUA: " + rangeSliderInfo);
        }
        new RangeSliderActionRecorder(measurementProviderImpl, userActionFactoryImpl, rangeSliderInfo, SemanticsManager.INSTANCE.fetchSemanticsNameFromModifier(this.modifier), this.useSemantics).recordAction(this.onValueChangeFinished);
    }

    public final void setPuckPositions(ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        Intrinsics.checkNotNullParameter(closedFloatingPointRange, "<set-?>");
        this.puckPositions = closedFloatingPointRange;
    }
}
