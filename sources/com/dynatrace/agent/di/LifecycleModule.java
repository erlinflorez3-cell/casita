package com.dynatrace.agent.di;

import android.app.Application;
import com.dynatrace.agent.OneAgentStartupEventDispatcher;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.lifecycle.AppStartupManagerImpl;
import com.dynatrace.agent.lifecycle.OneAgentLifecycleManager;
import com.dynatrace.agent.lifecycle.VisibilityManagerImpl;
import com.dynatrace.agent.lifecycle.util.AppStartupLogger;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a%yCQU\"Ԃ(ޛeȞ\u0018g\u001dI\u001b8S\u0013\u0014\u0016\u0011jZJe|k\u0014'2prO7[sU9\u000fyF\t.8:8(\f\u0011\u001e8P(v)Lƚ\u0010\u00146J~E\u001b\u0011[\u00112\u00124Kp\r,\\\u007fNdICҚ<ǥ'\u0003qĩ\u001f3m2\u0015M;I+\u070e\u000fțe\u001e3¨\bA#)k\u00035W2έ\u0005ӭu=\rؒw39O\fWd_Vϯ\u0017ۣS\reövh\u0013Yx\fU4&ҭMח\u0012(\u007f\u07beԱ\u0011J"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`.s\u000f<t93`}\bAl&5M\u0019", "", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "@t\\\u0012i,Gbw\u0003\ti(\f\u00072e\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nm'\u001f'\u0001\u000eE\u0006\u00049g\t\u001cFk\u0019.Z\u0019", "@t\\ g(Kb)\nZo,\u0006\u0018\u000ei\u000e3wO~\u001a\u0017T", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0013DU\u000b/Gxu?MLJJ8, dp7\nc9$", "Adb@\\6G7\"\u007f\u0005k4x\u00183o\t\u0013\tJ\u0012\u001b\u0016G|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u007f\u001b`5o\u001cJz/>=\u0007!Az\u001e*\\GEt\u001f+\u001fye8\u0007p\u0002", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u0018E@49a}i&q\u001e.8PE|8\u001d\u0015u7 \u0003l+[\u0001+F\u0016J7g\u001cNH\u001f\u0019^\fJ:\u0011\u000fb\u0017\u000blN?h\u0007@R}Ju|\n\u0016W1lpKeY4\n\u001dUR)qU8c\bR=T`-d\u00195\u0004ZDBm\u0013\u0006\"\u0017w]*\b{\u001d\rtR\u0003v11\"z\u0014&>vj4TkbK\u00052~\\{\u0001!\u0011\\\u00036p<\u00027*C:kIq \b]\r\u001e(kN#$6\u0006\u000fAKl\u00056=\u00122\ra\u0016\u001cf?:|nfmU\u0017\u0003l\u001be>Ll\u000bHV\u0005>VEX\u0018", ">q^C\\+>:\u001d\u007fz\\@z\u0010/M{1wB\u0001$", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~C\u0007 \u0013o\u00167\\*?l4\u001c)fh9n_5Jx'T\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class LifecycleModule {
    private final Application application;
    private final RumEventDispatcher rumEventDispatcher;
    private final OneAgentStartupEventDispatcher rumStartupEventDispatcher;
    private final SessionInformationProvider sessionInformationProvider;
    private final TimeProvider timeProvider;

    public LifecycleModule(TimeProvider timeProvider, Application application, RumEventDispatcher rumEventDispatcher, OneAgentStartupEventDispatcher rumStartupEventDispatcher, SessionInformationProvider sessionInformationProvider) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.checkNotNullParameter(rumStartupEventDispatcher, "rumStartupEventDispatcher");
        Intrinsics.checkNotNullParameter(sessionInformationProvider, "sessionInformationProvider");
        this.timeProvider = timeProvider;
        this.application = application;
        this.rumEventDispatcher = rumEventDispatcher;
        this.rumStartupEventDispatcher = rumStartupEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
    }

    public final OneAgentLifecycleManager provideLifecycleManager() {
        final VisibilityManagerImpl visibilityManagerImpl = new VisibilityManagerImpl(this.timeProvider, this.rumEventDispatcher, this.sessionInformationProvider);
        return new OneAgentLifecycleManager(new AppStartupManagerImpl(this.timeProvider, new AppStartupLogger(), this.rumStartupEventDispatcher, this.sessionInformationProvider, new Function0() { // from class: com.dynatrace.agent.di.LifecycleModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return visibilityManagerImpl.getVisibilityStatus();
            }
        }), visibilityManagerImpl, this.application);
    }
}
