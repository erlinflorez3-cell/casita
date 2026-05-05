package com.dynatrace.android.compose.pullrefresh;

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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV:ZS0\u0010s{B$cҕyCQU\"Ԃ(\beȞ\u0018g\u001dI\u001b2S\u0013\u0014\u0016\u0011jZJe|k\u0014'2prO7[sU9\u000fyF\u000b.8::\u0010\u0004/!ݵL\u0012|\u0003QTT$>J\t:\u0001\u0018}\u000f(\u001e\u001eD0\u0003.\\\u0016YdU=iH/;\u0003\u0018C%ώa݁\u0001M\u0015Ͽ%3\u001bxy\u001eYC\u000eߑ\u0017ȏW\u0003\u000fѸ,K\u0011C\n=3m}ݓ-ʁwW>ݙP\"#1g\u000fsqTc[ĬbВ++WҪ\u05c8T\u001c"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~d\u000e'>z\u0016/ZCIn}\t%oh&\u0007d9N\u0005*#J]0f[_=\u0012\u001cg\rN8b", "", ";dP@h9>[\u0019\b\nI9\u0007\u001a3d\u007f5", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@-5U\f0Dm\u001e.VR\u0005S4\u001a#xn9\u000fc5]a4Q]R+\\_H", "CrT?4*MW#\b[Z*\f\u0013<y", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`'Uo\u001b8t49c\u0007i'{\u0016;)AJo>'ud_H\u0011p@$", ">t[9E,?`\u0019\r}B5}\u0013", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~d\u000e'>z\u0016/ZCIn}\t%oh&\u0007d9N\u0005*+UO62", "Ad\\.a;BQ'gvf,", "", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\t'\tJ\u0005\u0016`Cq\u000eE\u0006n=Yy.Gz\u00166MLJ5\u001c\u001e\u0011vqF\u0007k,W\u0006\u0012TV_0[R\u007f\u0013z\u0010d\u0016\u0018*!\u000eUP1jB7h\u00045H\u000fEl\u007fU&\u001c5wl@e\u0014Q\u0003^eO)u\"Wn}QJ&^(s\u0016l12!8.\u001c;\u0018/qL=\u0017wQ\u0011<N\u0003ftQ\u001dy\u0002\"HufPSo\u001fG\u0005.&X{x\u001f2fwt_=\u000b;\u00176e\u0012Ku\u001b\"gy\u001f\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]QS", "@dR<e+\u001aQ(\u0003\u0005g", "", "=mA2Y9>a\u001c", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class PullRefreshActionRecorder {
    public static final int $stable = 8;
    private final MeasurementProvider measurementProvider;
    private final PullRefreshInfo pullRefreshInfo;
    private final String semanticsName;
    private final UserActionFactory userActionFactory;

    public PullRefreshActionRecorder(MeasurementProvider measurementProvider, UserActionFactory userActionFactory, PullRefreshInfo pullRefreshInfo, String str) {
        Intrinsics.checkNotNullParameter(measurementProvider, "measurementProvider");
        Intrinsics.checkNotNullParameter(userActionFactory, "userActionFactory");
        Intrinsics.checkNotNullParameter(pullRefreshInfo, "pullRefreshInfo");
        this.measurementProvider = measurementProvider;
        this.userActionFactory = userActionFactory;
        this.pullRefreshInfo = pullRefreshInfo;
        this.semanticsName = str;
    }

    public final void recordAction(Function0<Unit> onRefresh) {
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        UserAction userActionCreateUserAction = this.userActionFactory.createUserAction(ClassBasedActionNameGeneratorKt.generateActionName(this.pullRefreshInfo, this.semanticsName), this.measurementProvider.measure());
        userActionCreateUserAction.reportValue(SentryStackFrame.JsonKeys.FUNCTION, this.pullRefreshInfo.getOnRefresh().getClass().getName());
        userActionCreateUserAction.reportValue("type", "pull refresh");
        onRefresh.invoke();
        userActionCreateUserAction.startTimer();
    }
}
