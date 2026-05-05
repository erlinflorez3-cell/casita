package com.dynatrace.agent.userinteraction.handler;

import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.agent.userinteraction.handler.UserInteractionHandler;
import com.dynatrace.agent.userinteraction.model.TouchUserInteractionGenerator;
import com.dynatrace.agent.userinteraction.util.UserInteractionLogger;
import com.dynatrace.agent.userinteraction.util.UserInteractionTracker;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a%yCQU\"}(\fWNu\nvJp\u000bK\u000f\u001c\u0016\u0001jBI]xc\u0013\u0015˰Xģo3{n}fpxD\u000582P9\n\t\u000f\u001cBH>y\u000bGY\u0010*0nuJV\u001bS\u001d\u001a@\rN$\u000f&tg|?Ղp_@91\u000e2P\\>w0+c=Jb?%v\u00102qT\bA#%k\u00035S2έ\u0005ӭu=\rؒw39K\fWd[Vϯ\u0017ۣS\reövh\u0013Ux\fU0&ҭMח\u0012(\u007f\u07beL\u0019J\n&\u0006UO\u0005Ʃ\u001cǴ\f\u000e;οC_NX\u001a^p\tQʫ8а)\u007f;ٿ\n4t]y;G[m<[ٿ̙#ъr+cV\u0014p#,lyW?_O\u000ef\\\u001cqO}\u0006\u0001b0>\u00148W\u0006?}!.E;epg6wȀ\u0004ҩHg~ݓÄll"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_1IL:r4+^Xo9\u0014G5]v4CJ]0f[U9\u001d\u0011a\u000e[\f\t\u0003hK1\u0003(?*\u000f\u0002", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_1IL:r4+^Xo9\u0014G5]v4CJ]0f[U9\u001d\u0011a\u000e[\f\t\u0003hK1\u0003\u001a", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "CrT?<5MS&zxm0\u0007\u0012\u0016o\u0002*{M", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_>\\GB5$,\u0015uEB\u0016c9Jt6KVW\u0013fTt=!g", "CrT?<5MS&zxm0\u0007\u0012\u001er{&\u0002@\u000e", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_>\\GB5$,\u0015uEB\u0016c9Jt6KVW\u001biNpC\u0014\u001f0", "Bnd0[\u001cLS&b\u0004m,\n\u0005-t\u00042\u0005\"\u0001 \u0017Tk\u001dF\u0004", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dsZ\u0017N8\t\u0014cNy", "AdaCX9\u001c]\"\u007f~`<\n\u0005>i\n1Z<\u0010\u0013\u0005Q\u007f\u001b:v", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6e1nL\u0010\u007fd\u001e[)\rZ", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|,WK\u0005jH'\u0011wn5\u0005cuJx'P[\u0018<jR\u007fA\u001d!Z\u001bJ)\u001c\tcJm~S;&Q\u001cW\u0002HL\n\u001b\u0016\u001b1h\u007fF`\u0019.\u0004\u0017wA6>-Wi\u0002\u0011@Yk&s\u0019[\u001b\\\u00046&\u0014z(dx^.\u0017\u007f\\ r_uevK#\u0004\u00024Mqb\u00105}UIX0.K\ts\u0010A\\~4c:\u007f206qZ2e\"F(w)5XP4\"4<\\;Mc~{\b\u001ev\u001fn\f\u0017q5>\u0015ctgR\u0018Pe!Z5h)oAb\u0004A9}\u00154*\bQ[\u0007\u0011\u0007\u0016(wn+C$T\u000e\u0016\u007fN/5w\u0001\rna\u001bB\u001f9h\u001cd(_\u0001I\u0015\tqGU\nhM\"lJ\u00107V\u007f[Xo16\u0002\u000fIj!KI\bRPM\u001a\u001f5\u0005\r\u000f*oxF\u0004?q!49GBrm-\u000b=\u0017\u0013", "Bnd0[\u001cLS&b\u0004m,\n\u0005-t\u00042\u0005#| \u0016No\u001b", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_1IL:r4+^WkI\u0005f\u001c\\v4+U],iNpL\u0018\u001ccpJ4\f\fYNy", "5dc!b<<V\t\rzk\u0010\u0006\u0018/r{&\u000bD\u000b yCx\rCv2", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`'Uo\u001b@\u007f45fy\u001eFq 7\u0017F7t3%\u0015u+(\u0011s*Qf5GY25kR\u007f9\u0012!^\u0018W\u000e\t\u000eXH${\u001a", "Bnd0[\u001cLS&b\u0004m,\n\u0005-t\u00042\u0005#| \u0016No\u001bzu%<Y\u007f\u001cFm", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "6`]1_,K1&~vm6\n\u0017", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_1IL:r4+^Xo9\u0014G5]v4CJ]0f[U9\u001d\u0011a\u000e[i{\u0019dAy", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_1IL:r4+^Xo9\u0014G5]v4CJ]0f[U9\u001d\u0011a\u000e[\u0001", "1qT.g,", "6`]1_,KB-\nz", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class UserInteractionHandlerFactoryImpl implements UserInteractionHandlerFactory {
    private final CoroutineScope coroutineScope;
    private final Map<UserInteractionHandler.Type, Function0<UserInteractionHandler>> handlerCreators;
    private final ServerConfigurationDataSource serverConfigurationDataSource;
    private final TouchUserInteractionGenerator touchUserInteractionGenerator;
    private final Lazy touchUserInteractionHandler$delegate;
    private final UserInteractionLogger userInteractionLogger;
    private final UserInteractionTracker userInteractionTracker;

    public UserInteractionHandlerFactoryImpl(CoroutineScope coroutineScope, UserInteractionLogger userInteractionLogger, UserInteractionTracker userInteractionTracker, TouchUserInteractionGenerator touchUserInteractionGenerator, ServerConfigurationDataSource serverConfigurationDataSource) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(userInteractionLogger, "userInteractionLogger");
        Intrinsics.checkNotNullParameter(userInteractionTracker, "userInteractionTracker");
        Intrinsics.checkNotNullParameter(touchUserInteractionGenerator, "touchUserInteractionGenerator");
        Intrinsics.checkNotNullParameter(serverConfigurationDataSource, "serverConfigurationDataSource");
        this.coroutineScope = coroutineScope;
        this.userInteractionLogger = userInteractionLogger;
        this.userInteractionTracker = userInteractionTracker;
        this.touchUserInteractionGenerator = touchUserInteractionGenerator;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
        this.touchUserInteractionHandler$delegate = LazyKt.lazy(new Function0() { // from class: com.dynatrace.agent.userinteraction.handler.UserInteractionHandlerFactoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserInteractionHandlerFactoryImpl.touchUserInteractionHandler_delegate$lambda$0(this.f$0);
            }
        });
        this.handlerCreators = MapsKt.mapOf(TuplesKt.to(UserInteractionHandler.Type.TOUCH, new Function0() { // from class: com.dynatrace.agent.userinteraction.handler.UserInteractionHandlerFactoryImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getTouchUserInteractionHandler();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TouchUserInteractionHandler getTouchUserInteractionHandler() {
        return (TouchUserInteractionHandler) this.touchUserInteractionHandler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TouchUserInteractionHandler touchUserInteractionHandler_delegate$lambda$0(UserInteractionHandlerFactoryImpl userInteractionHandlerFactoryImpl) {
        return new TouchUserInteractionHandler(userInteractionHandlerFactoryImpl.coroutineScope, userInteractionHandlerFactoryImpl.userInteractionLogger, userInteractionHandlerFactoryImpl.userInteractionTracker, userInteractionHandlerFactoryImpl.touchUserInteractionGenerator, userInteractionHandlerFactoryImpl.serverConfigurationDataSource);
    }

    @Override // com.dynatrace.agent.userinteraction.handler.UserInteractionHandlerFactory
    public UserInteractionHandler create(UserInteractionHandler.Type handlerType) {
        UserInteractionHandler userInteractionHandlerInvoke;
        Intrinsics.checkNotNullParameter(handlerType, "handlerType");
        Function0<UserInteractionHandler> function0 = this.handlerCreators.get(handlerType);
        if (function0 == null || (userInteractionHandlerInvoke = function0.invoke()) == null) {
            throw new IllegalArgumentException("Unknown handler type: " + handlerType);
        }
        return userInteractionHandlerInvoke;
    }
}
