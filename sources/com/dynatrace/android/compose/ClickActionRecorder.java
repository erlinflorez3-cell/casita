package com.dynatrace.android.compose;

import com.dynatrace.android.agent.measurement.MeasurementProvider;
import com.dynatrace.android.useraction.UserAction;
import com.dynatrace.android.useraction.UserActionFactory;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.protocol.SentryStackFrame;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV:ZS0\u0011s{J$cҕwBQ٥J}P\b\u0010uwk|Jr\u000bq\u0010\u0016\u001a\u0007lDI\u0004{m\u0016\u001d6Zom8]uK?xvL\u0004N9ŕ<{\u000b\t(3\u0011&\u0005\u0005[M\"\u0011^?!F`\u0018e\r*\u0016\u0016@6\u007fL[\u0016Z\u0007Tz]R/Q\u0004@ĬPϮc0\u0005ձ]Rb)%v\u0010!\u0002«9߱\u0019%[ΈW^iC\u001b? B[ؕ)ݳ/I{Ɏ\u0007f\u000e\u001a--e\f\fy|؛\u0007Ōd\f/˃ջgX"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~7\u0005$5sq,\\GEt!\u001e\u0013rn8\u0007p\u0002", "", ";dP@h9>[\u0019\b\nI9\u0007\u001a3d\u007f5", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@-5U\f0Dm\u001e.VR\u0005S4\u001a#xn9\u000fc5]a4Q]R+\\_H", "CrT?4*MW#\b[Z*\f\u0013<y", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`'Uo\u001b8t49c\u0007i'{\u0016;)AJo>'ud_H\u0011p@$", "1kX0^(;Z\u0019b\u0004_6", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~7\u0005$5s\u0012+TC\u001ft5(j", "Ad\\.a;BQ'gvf,", "", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\t'\tJ\u0005\u0016`Cq\u000eE\u0006n=Yy.Gz\u00166MLJ5\u001c\u001e\u0011vqF\u0007k,W\u0006\u0012TV_0[R\u007f\u0013z\u0010d\u0016\u0018*!\u000eUP1jB7h\u00045H\u000fEl\u007fU&\u001c5wl@e\u0014Q\u0003^eO)u\"Wn}QJ&^(s\u0016l12!8.\u001c;\u0018/qL=\u0017wQ\u0011<N\u0003ftQ\u001dy\u0002\"HufPSo\u001f\u001a{+\u001dQwt\u00192<},~\u0003j9&G`NRc!@(f$9`J){y-", "@dR<e+\u001aQ(\u0003\u0005g", "1kX0^(;Z\u0019_\u000bg*\f\r9n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ClickActionRecorder {
    public static final int $stable = 8;
    private final ClickableInfo clickableInfo;
    private final MeasurementProvider measurementProvider;
    private final String semanticsName;
    private final UserActionFactory userActionFactory;

    public ClickActionRecorder(MeasurementProvider measurementProvider, UserActionFactory userActionFactory, ClickableInfo clickableInfo, String str) {
        Intrinsics.checkNotNullParameter(measurementProvider, "measurementProvider");
        Intrinsics.checkNotNullParameter(userActionFactory, "userActionFactory");
        Intrinsics.checkNotNullParameter(clickableInfo, "clickableInfo");
        this.measurementProvider = measurementProvider;
        this.userActionFactory = userActionFactory;
        this.clickableInfo = clickableInfo;
        this.semanticsName = str;
    }

    public final Object recordAction(Function0<? extends Object> clickableFunction) {
        Intrinsics.checkNotNullParameter(clickableFunction, "clickableFunction");
        UserAction userActionCreateUserAction = this.userActionFactory.createUserAction(ClassBasedActionNameGeneratorKt.generateActionName(this.clickableInfo, this.semanticsName), this.measurementProvider.measure());
        userActionCreateUserAction.reportValue(ViewProps.ROLE, String.valueOf(this.clickableInfo.m7131getRoleRLKlGQI()));
        userActionCreateUserAction.reportValue(SentryStackFrame.JsonKeys.FUNCTION, this.clickableInfo.getFunction().getClass().getName());
        userActionCreateUserAction.reportValue("type", this.clickableInfo.getInteractionType());
        Object objInvoke = clickableFunction.invoke();
        userActionCreateUserAction.startTimer();
        return objInvoke;
    }
}
