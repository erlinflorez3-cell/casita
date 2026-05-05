package com.dynatrace.agent.api;

import com.dynatrace.agent.communication.api.ServerDataListener;
import com.dynatrace.agent.storage.memory.DynamicConfigDataSource;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.android.agent.communication.ServerConfigurationListener;
import com.dynatrace.android.agent.conf.ConfigurationPublisher;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0010s{B$cҕyCQU\"Ԃ*\teNogtKb\u000bY\u000f\u000e\u0016~j2կkތ\u000e\u0012=1\u0003\u0015O7[oU9\u000fuF\t.4:8(\b\u0011\u001e8L(v)H[\u0010 6XphYҫQ\u0007 \u001a\u0014Gh\u001d,f\u007fNdS\u001daH;;\u0003\u0018O~+m>\u0015M;U\u001bܢKțe\u001e9P\u007fI#6k\u00035]\fC\u0011Q\n=3{mݧiʁwWDlP #+g\r\fs|؛\u0007Ōd\f/˃ oYR&(&}Rȡ>Ǭ\u0012\u0006/Ξ~9(j \u000eayIԢBг\u0006^JȕKmD\u001d=\u007fa2\u0010ӘhЂe;!\u05cb҂\u007f\u001a"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011]\u000eI\b%B8y/3T\u001a<\\CDkA\u0002\u001dsh\u000f", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u00171;xE\u001e\"G]H\u0003J0\\\u0006'PL[\u0002", ":dV.V@,S&\u0010zk\n\u0007\u00120i\u00028\t<\u0010\u001b!PV\u0012J\u0006%>Y\u000b", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?a\u00060@q\u0014*\\GEt}\f\u0015ur9\u0014A6Ww+I\\[(kV|Fz\u0016h\u001dN4\r\u0012/", "AdaCX9\u001c]\"\u007f~`<\n\u0005>i\n1Z<\u0010\u0013\u0005Q\u007f\u001b:v", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6e1nL\u0010\u007fd\u001e[)\rZ", "2x].`0<1#\b{b.[\u0005>am2\fM~\u0017", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@-5a\b-K7tBV?Co2{\u001fqb=\tB(]r\u0015Q\\[*\\(", "1n]3\\.N`\u0015\u000e~h5g\u0019,l\u00046~@\u000e", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i\u0015w\u001f/QEKx0-\u0019rj$\u0017`3R\u0005*GY$", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\t'\tJ\u0005\u0016`Cq\u000eE\u0006n3c\u0006(Gv\u001a,IR?u=g\u0003hnJ\u0007p\nX\u007f(KN^9XavG\u001dx^\u001c]+\u0016\u0005f\u0017\u000blN?h\u0007@R}Ju|\n\u0016W1lpKeYU\t\u001f\u0003=+h\u0010dlyHARb3b\f)\u000b\\GK$!O#$iT0\u001a\tO v\\\u0003FcV\u0015hB4Kk[\u001c,m_D>&3Tw\u0007\u001f.Vttp/\u0004=9\u007fr\u0014Ut\u0014@^B\u001d,dK4:\u007f\u001b'HGkyj\u001c\u0018q e\nl^D-\u0007oupF\u000f\\D\u0015e=+^\u0015@N\u0015KEm\u0015pB\bAh\u0004\u0019\bP oeRRdR\u000b#q\u000e\u007fi\u001a\u0004\u0007h()*%Ac\u0018S:\\>Q!\fhEa?J", "=m2<a-BU)\fvm0\u0007\u0012\u001fp~$\u000b@", "", "/fT;g\u001aMO(~", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u0017\u001f=k=-\u0003w]H\u00079", "1n]3\\.N`\u0015\u000e~h5mW", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6eCA\u0013", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u00129Q\r\u0017m4'$Vp5\u0016c\u00025t1O\u0016M@eN\u0002J\u0010\u0010ZWJ-\r\u000eh\u000b2}ND\u001b\n,\u0013\rHh\u0002\f#\u000e>hp\fD\u0010T\u000b\u0015\u0003\u001f3qG]a\nT=Tf4m|.rC@D3\u001bu\"dfZ;\u0014\fb\u0015{R\b1EQ\"\n<-NijJOx+\u007f[,\u001b\\wA\u0019.avt^*\t4(E:", "=m2<a-BU)\fvm0\u0007\u0012 3o3z<\u0010\u0017", "1n]3\\.N`\u0015\u000e~h5mV", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i%m#?MP\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "uKR<`u=g\"z\nk(z\txa\t'\tJ\u0005\u0016`Cq\u000eE\u0006n3c\u0007!\u0001[\u0016;^CHI>'\u0016lcI\u0014_;R\u00010\u001d3T6kYvF]\u0010d\u001bX;\u001c\tbA28\"A(\u00170R\u00127w\u0005\u0016\u001fcxQu>g\f\u0011\u0001\u0011~CrRC^_wV\u0017", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ServerDataListenerImpl implements ServerDataListener {
    private final ConfigurationPublisher configurationPublisher;
    private final DynamicConfigDataSource dynamicConfigDataSource;
    private final ServerConfigurationListener legacyServerConfigurationListener;
    private final ServerConfigurationDataSource serverConfigurationDataSource;

    /* JADX INFO: renamed from: com.dynatrace.agent.api.ServerDataListenerImpl$onConfigurationUpdate$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ServerDataListenerImpl.this.onConfigurationUpdate(null, null, this);
        }
    }

    public ServerDataListenerImpl(ServerConfigurationListener legacyServerConfigurationListener, ServerConfigurationDataSource serverConfigurationDataSource, DynamicConfigDataSource dynamicConfigDataSource, ConfigurationPublisher configurationPublisher) {
        Intrinsics.checkNotNullParameter(legacyServerConfigurationListener, "legacyServerConfigurationListener");
        Intrinsics.checkNotNullParameter(serverConfigurationDataSource, "serverConfigurationDataSource");
        Intrinsics.checkNotNullParameter(dynamicConfigDataSource, "dynamicConfigDataSource");
        Intrinsics.checkNotNullParameter(configurationPublisher, "configurationPublisher");
        this.legacyServerConfigurationListener = legacyServerConfigurationListener;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
        this.dynamicConfigDataSource = dynamicConfigDataSource;
        this.configurationPublisher = configurationPublisher;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    @Override // com.dynatrace.agent.communication.api.ServerDataListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object onConfigurationUpdate(com.dynatrace.agent.communication.api.AgentState r6, com.dynatrace.agent.storage.preference.ServerConfigurationV4 r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.dynatrace.agent.api.ServerDataListenerImpl.AnonymousClass1
            if (r0 == 0) goto L66
            r4 = r8
            com.dynatrace.agent.api.ServerDataListenerImpl$onConfigurationUpdate$1 r4 = (com.dynatrace.agent.api.ServerDataListenerImpl.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L66
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L16:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L48
            if (r0 != r1) goto L6c
            java.lang.Object r7 = r4.L$1
            com.dynatrace.agent.storage.preference.ServerConfigurationV4 r7 = (com.dynatrace.agent.storage.preference.ServerConfigurationV4) r7
            java.lang.Object r0 = r4.L$0
            com.dynatrace.agent.api.ServerDataListenerImpl r0 = (com.dynatrace.agent.api.ServerDataListenerImpl) r0
            kotlin.ResultKt.throwOnFailure(r3)
        L2e:
            com.dynatrace.android.agent.conf.ConfigurationPublisher r2 = r0.configurationPublisher
            com.dynatrace.android.agent.conf.ConfigurationPublisher$ConfigChange r1 = com.dynatrace.android.agent.conf.ConfigurationPublisher.ConfigChange.IS_TOUCHES_ENABLED
            boolean r0 = r7.isTouchUserInteractionEnabled()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r1, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            r2.notify(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L48:
            kotlin.ResultKt.throwOnFailure(r3)
            com.dynatrace.android.agent.communication.ServerConfigurationListener r0 = r5.legacyServerConfigurationListener
            r0.onAgentStateChanged(r6)
            com.dynatrace.agent.storage.memory.DynamicConfigDataSource r0 = r5.dynamicConfigDataSource
            r0.setAgentState(r6)
            com.dynatrace.agent.storage.preference.ServerConfigurationDataSource r0 = r5.serverConfigurationDataSource
            r4.L$0 = r5
            r4.L$1 = r7
            r4.label = r1
            java.lang.Object r0 = r0.setServerConfiguration(r7, r4)
            if (r0 != r2) goto L64
            return r2
        L64:
            r0 = r5
            goto L2e
        L66:
            com.dynatrace.agent.api.ServerDataListenerImpl$onConfigurationUpdate$1 r4 = new com.dynatrace.agent.api.ServerDataListenerImpl$onConfigurationUpdate$1
            r4.<init>(r8)
            goto L16
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.api.ServerDataListenerImpl.onConfigurationUpdate(com.dynatrace.agent.communication.api.AgentState, com.dynatrace.agent.storage.preference.ServerConfigurationV4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.dynatrace.agent.communication.api.ServerDataListener
    public Object onConfigurationV3Update(ServerConfiguration serverConfiguration, Continuation<? super Unit> continuation) {
        this.legacyServerConfigurationListener.onServerConfigurationChanged(serverConfiguration);
        return Unit.INSTANCE;
    }
}
