package com.dynatrace.android.compose.slider;

import com.dynatrace.android.agent.measurement.MeasurementProvider;
import com.dynatrace.android.compose.ClassBasedActionNameGeneratorKt;
import com.dynatrace.android.useraction.UserAction;
import com.dynatrace.android.useraction.UserActionFactory;
import io.sentry.protocol.SentryStackFrame;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV:Zݷ2\u000fy\u0005<$a%yCIU\"Ԃ*\teNo˧tIpŏs\u000f4\u00159\u001a<Mcxu\u0012=3RsM5eok<pxD\t82P=\n\u000b\u000f BJ&u)J[\u0010 8Xph[ҫQ\u0007 \u001c\u0014Ih\u0015,h\u007fNdU\u001diH=;\u000byD^'\u000e=\u0013L;U%3\u001bvy\u001eYA\u000eߑ\u0017ȏW\u0003\u000fѸ,K\u0011A\n=3k}ݓ-ʁwW>ݙP #/g\r\fw|؛\u0007Ōd\f/˃ qYV&*\u000ey*\u0014\u0013ǌ\u0010Ν+H6Ʀjr\u0016\u0016Kt!\\\u0017Г\u0004ެF\u007f\u0003ʨِ\u001b5"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w;J?j4+pfp=\u0011l\u0019Nt1TKN92", "", ";dP@h9>[\u0019\b\nI9\u0007\u001a3d\u007f5", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@-5U\f0Dm\u001e.VR\u0005S4\u001a#xn9\u000fc5]a4Q]R+\\_H", "CrT?4*MW#\b[Z*\f\u0013<y", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`'Uo\u001b8t49c\u0007i'{\u0016;)AJo>'ud_H\u0011p@$", "AkX1X9\"\\\u001a\t", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w;J?j4+xqbC\\", "Ad\\.a;BQ'gvf,", "", "CrT X4:\\(\u0003xl", "", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\t'\tJ\u0005\u0016`Cq\u000eE\u0006n=Yy.Gz\u00166MLJ5\u001c\u001e\u0011vqF\u0007k,W\u0006\u0012TV_0[R\u007f\u0013z\u0010d\u0016\u0018*!\u000eUP1jB7h\u00045H\u000fEl\u007fU&\u001c5wl@e\u0014Q\u0003^eO)u\"Wn}QJ&^(s\u0016l12!8.\u001c;\u0018/qL=\u0017wQ\u0011<N\u0003ftQ\u001dy\u0002\"HufPSo\u001fJ{+\u001eK\tA\u007f9\\s+\u0002\u0011\r54\fK\nGx\u0014\bet\u001e.&/63:E\u0015\u0015@'f", "@dR<e+\u001aQ(\u0003\u0005g", "", "=mE._<>1\u001cz\u0004`,]\r8i\u000e+{?", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SliderActionRecorder {
    public static final int $stable = 8;
    private final MeasurementProvider measurementProvider;
    private final String semanticsName;
    private final SliderInfo sliderInfo;
    private final boolean useSemantics;
    private final UserActionFactory userActionFactory;

    public SliderActionRecorder(MeasurementProvider measurementProvider, UserActionFactory userActionFactory, SliderInfo sliderInfo, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(measurementProvider, "measurementProvider");
        Intrinsics.checkNotNullParameter(userActionFactory, "userActionFactory");
        Intrinsics.checkNotNullParameter(sliderInfo, "sliderInfo");
        this.measurementProvider = measurementProvider;
        this.userActionFactory = userActionFactory;
        this.sliderInfo = sliderInfo;
        this.semanticsName = str;
        this.useSemantics = z2;
    }

    public final void recordAction(Function0<Unit> function0) {
        UserAction userActionCreateUserAction = this.userActionFactory.createUserAction(ClassBasedActionNameGeneratorKt.generateActionName(this.sliderInfo, this.semanticsName, !this.useSemantics), this.measurementProvider.measure());
        userActionCreateUserAction.reportValue(SentryStackFrame.JsonKeys.FUNCTION, this.sliderInfo.getSource().getClass().getName());
        userActionCreateUserAction.reportValue("toState", String.valueOf(this.sliderInfo.getPuckPosition()));
        userActionCreateUserAction.reportValue("type", "slide");
        if (function0 != null) {
            function0.invoke();
        }
        userActionCreateUserAction.startTimer();
    }
}
