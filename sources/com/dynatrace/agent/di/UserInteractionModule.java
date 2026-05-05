package com.dynatrace.agent.di;

import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.agent.userinteraction.OneAgentUserInteractionManager;
import com.dynatrace.agent.userinteraction.OneAgentUserInteractionManagerImpl;
import com.dynatrace.agent.userinteraction.handler.UserInteractionHandlerFactoryImpl;
import com.dynatrace.agent.userinteraction.model.TouchUserInteractionComposeGenerator;
import com.dynatrace.agent.userinteraction.model.TouchUserInteractionGeneratorImpl;
import com.dynatrace.agent.userinteraction.model.TouchUserInteractionNativeGenerator;
import com.dynatrace.agent.userinteraction.util.UserInteractionLogger;
import com.dynatrace.agent.userinteraction.util.UserInteractionMaskingValidator;
import com.dynatrace.agent.userinteraction.util.UserInteractionTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a%yCQU\"Ԃ(ޛeȞ\u0018g\u001dI\u001b8S\u0013\u0014\u0016\u0011jZJe|k\u0014'2prO7[sU9\u000fyF\t.8:8(\f\u0011\u001e8P(v)Lƚ\u0010\u00146J~E\u001b\u0011[\u00112\u00124Kp\r,\\\u007fNdICҚ<ǥ'\u0003qĩ\u001f3m2\u0015M;I+\u070e\u000fțe\u001e3¨\bA#)k\u00035W2έ\u0005ӭu=\rؒw39O\fWd_Vϯ\u0017ۣS\reövh\u0013Yx\fU4&ҭMח\u0012(\u007f\u07beԱ\u0011J"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`7}\u000eIZ.DY\u000b\u001c5|\u001a8V+EjD%\u0015>", "", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", "@t\\\u0012i,Gbw\u0003\ti(\f\u00072e\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nm'\u001f'\u0001\u000eE\u0006\u00049g\t\u001cFk\u0019.Z\u0019", "Adb@\\6G7\"\u007f\u0005k4x\u00183o\t\u0013\tJ\u0012\u001b\u0016G|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\u001cJz/>=\u0007!Az\u001e*\\GEt\u001f+\u001fye8\u0007p\u0002", "AdaCX9\u001c]\"\u007f~`<\n\u0005>i\n1Z<\u0010\u0013\u0005Q\u007f\u001b:v", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6e1nL\u0010\u007fd\u001e[)\rZ", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|,WK\u0005jH'\u0011wn5\u0005cuJx'P[\u0018*fZzG\u001d[i\u0012V+Vs]I$YQA0\f+I\u000f\u0011O~\u0016\u001eW4~y>e\u001dCw\u0015?=+hOh)fWI%s*m\u001b>!jE63\u0012t\u0019(>7,\u0014\u0004\u001d\u0010\u0007[uvtC\u0017z\u0002 @mdU\u000fnY\u0006b'-Y\u007f\u0002\u001b\u0016au5\u00025\u007fC.@moXq)B]x\"\u0002C?1.\u007f;'HGr\u0003h<\u000e2\u001bc\b\u0017q~?(or_J\u000fPh$[6al\u0001@P\u0006\b7o\"8F\f e\u0003\u0016\r\t4zaXG%]_\u0016\u007f@\u0010i!\u0010\u0001fm_\u001f", ">q^C\\+>C'~\bB5\f\t<a}7\u007fJ\n~\u0013Pk\u0010<\u0004", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_\u0018VC\u0017m4'$Xo9\u0014G5]v4CJ]0f[Z9\u001d\u000e\\\u000e[\u0001", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class UserInteractionModule {
    private final CoroutineScope coroutineScope;
    private final RumEventDispatcher rumEventDispatcher;
    private final ServerConfigurationDataSource serverConfigurationDataSource;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;

    public UserInteractionModule(CoroutineScope coroutineScope, TimeProvider timeProvider, RumEventDispatcher rumEventDispatcher, SessionInformationProvider sessionInformationProvider, ServerConfigurationDataSource serverConfigurationDataSource) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.checkNotNullParameter(sessionInformationProvider, "sessionInformationProvider");
        Intrinsics.checkNotNullParameter(serverConfigurationDataSource, "serverConfigurationDataSource");
        this.coroutineScope = coroutineScope;
        this.timeProvider = timeProvider;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
    }

    public final OneAgentUserInteractionManager provideUserInteractionManager() {
        return new OneAgentUserInteractionManagerImpl(new UserInteractionHandlerFactoryImpl(this.coroutineScope, new UserInteractionLogger(), new UserInteractionTracker(this.rumEventDispatcher, this.sessionInformationProvider, this.timeProvider), new TouchUserInteractionGeneratorImpl(new TouchUserInteractionNativeGenerator(new UserInteractionMaskingValidator()), new TouchUserInteractionComposeGenerator()), this.serverConfigurationDataSource));
    }
}
