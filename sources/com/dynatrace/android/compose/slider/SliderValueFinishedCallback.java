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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLc\u0003\u0004Iي8\u000bDB\u0007\":\u0017\u007fјnjO0LeN.ZS8\u0018s{:%c$\u007fOCU \u0003(\beȞ\u0018m~Lj\u000bq\u000f4\u00159(<Ycyu\u001e\u001f4Rom6]qM9\u000ftd\u0007080<\u0012\u0007\u0017\u0019XM \u0005\u0001CY\u0012*8PrJR;M\u001b\u0019@\u0005N$\u000f%tg|>Ղp_@81\r2I\\9w0+MSЖTw%\u0005b67P9E\u0015SV\u0013\tb[m\u0003ms\u0014ݞjҊ++Q֕(Df\u0004,\u0017AN;bI̩^ԇU`\u0014ʬ{cqQh\u00168y\u000b{;<\u001a\r4&\u001f͖/բj\b\u0016ޗE~aGh\u0002\rJVаcي\u001b%\bđ{E)qiai%%ќ}˿\u0011\u001e+Ч?9ia&`C\u001e+ȴ]śULEʰf\f_K{\u0013\u0011d\b:\u0012AЃ\u0004B"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w;J?j4+\u0006dhI\u0007D0Wz5JLM\nXYy:\u0010\u0010`c", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "=mE._<>1\u001cz\u0004`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "=mE._<>1\u001cz\u0004`,]\r8i\u000e+{?", "CrT X4:\\(\u0003xl", "", "\nh]6g\u0005", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0012O\n92", "B`V", "", ">tR8C6LW(\u0003\u0005g", "5dc\u001dh*D>#\r~m0\u0007\u0012", "u(5", "Adc\u001dh*D>#\r~m0\u0007\u0012", "uE\u0018#", "7me<^,", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SliderValueFinishedCallback implements Function0<Unit> {
    public static final int $stable = 8;
    private final Modifier modifier;
    private final Function1<Float, Unit> onValueChange;
    private final Function0<Unit> onValueChangeFinished;
    private float puckPosition;
    private final String tag;
    private final boolean useSemantics;

    /* JADX WARN: Multi-variable type inference failed */
    public SliderValueFinishedCallback(Function1<? super Float, Unit> onValueChange, Modifier modifier, Function0<Unit> function0, boolean z2) {
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        this.onValueChange = onValueChange;
        this.modifier = modifier;
        this.onValueChangeFinished = function0;
        this.useSemantics = z2;
        this.tag = Global.LOG_PREFIX + "SliderValueFinishedCallback";
    }

    public /* synthetic */ SliderValueFinishedCallback(Function1 function1, Modifier modifier, Function0 function0, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, modifier, (i2 & 4) != 0 ? null : function0, z2);
    }

    public final float getPuckPosition() {
        return this.puckPosition;
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
        SliderInfo sliderInfo = new SliderInfo(this.puckPosition, this.onValueChange);
        if (Global.DEBUG) {
            Utility.zlogD(this.tag, "onUA: " + sliderInfo);
        }
        new SliderActionRecorder(measurementProviderImpl, userActionFactoryImpl, sliderInfo, SemanticsManager.INSTANCE.fetchSemanticsNameFromModifier(this.modifier), this.useSemantics).recordAction(this.onValueChangeFinished);
    }

    public final void setPuckPosition(float f2) {
        this.puckPosition = f2;
    }
}
