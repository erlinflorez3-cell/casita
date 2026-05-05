package com.dynatrace.agent.communication.di;

import com.dynatrace.agent.common.connectivity.NetworkConnectivityChecker;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.communication.CommunicationManager;
import com.dynatrace.agent.communication.CommunicationManagerImpl;
import com.dynatrace.agent.communication.ResponseProcessorImpl;
import com.dynatrace.agent.communication.api.ServerDataListener;
import com.dynatrace.agent.communication.network.DynatraceOkHttpClientFactory;
import com.dynatrace.agent.communication.network.datasource.NetworkDataSourceImpl;
import com.dynatrace.agent.communication.network.request.ConfigRequestFactory;
import com.dynatrace.agent.communication.network.request.DataRequestFactory;
import com.dynatrace.agent.communication.network.response.ConfigurationsParser;
import com.dynatrace.agent.communication.network.response.ServerConfigurationManagerV4;
import com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider;
import com.dynatrace.agent.communication.protocol.EventRequestEnvelope;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.db.EventDatabaseDataSource;
import com.dynatrace.android.agent.conf.ServerConfigurationManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Call;
import okhttp3.OkHttpClient;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tvAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWȞog\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4կ[ތs܈?2pn\u007fz]uK9xvL\u0004N32<\b\u0007\u0019\u001aXK z\tGc\f@5PtHX%M3!\"\nL(\u0019\u001e\u000bp^:Vvu:].\u0013mPZ?_^\n]\u0011Tb?\r%pӿ/B=E#6\u001c\u0007\u0015ds?1RBK\u0013h?)AH\"X\rݜ\u0002Џ\u0019+WՕ.~4^\u001dQ\u000f\u000f}ˆQӍOP\u0016ߊH\u0007\n\u0011T\u0004<\u000b}Ρ0ǉ\u001ef\u0010Ԅ\u0004\u0001\u0001YXP0e\u0019Ș|ˋ:\u0017-Į\u00047G#~Q\u0010Do\u05ce9߉\t\r&ŀQz/el\u000e\u000f qƛyΦ5QH׀\u0019Z\u0018eUm2}9̦,˙4G\b\u07fcL\u001d<%=7\nHyܬmɘLDoϸݼd|"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001l\u001aw+MCsD'\u0019f]H\u000bm56\u0001&WSN\u0002", "", "6sc=9(<b#\f\u000f", "\u001anZ5g;I!b\\ve3;i+c\u000f2\tTV", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", "Dda@\\6G", "", "2`c.5(LSwz\nZ\u001a\u0007\u0019<c\u007f", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\rIR7h0,\u0015G]H\u0003Q6^\u0004%G\"", "/bc6i,\u001e\\\u0018\n\u0005b5\f", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", "AdaCX9\u001dO(zab:\f\t8e\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u00171;xE\u001e\"G]H\u0003J0\\\u0006'PL[\u0002", "3wc2e5:Z\u0007|\u0005i,", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n];X*MW*\u0003\nr\n\u007f\t-k\u007f5", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006t/>b}\u001eFq'2\\W\u0005T4-'rn?dm5Wv%VP_0kfP@\u0014\u0010`\u000e[\u0001", "\nh]6g\u0005", "uK^8[;M^fHXZ3\u0004G\u0010a}7\u0006M\u0015l}Ey\u0016\u0006u9>U\r-3k\u0016wIE;tCg\u0013riA\u0011lu]z/G\u0016=0dR]J\u001e#^\rN8bk^=5j\u000e>\u001b\u0011.\u0013oJu\u0005\u0015\u0018c\u001chzJ \u000f[\u0003\u0011\u0005N%fF#[{GJT,8s\u0016l\u0019^:\u0004#\u0011;x,hY=hwb\roN\bgFC(v&.NzYF\u001bVSF|p\u001e_\u0005s!?Tr+>)\u000643E.\u0013Zq%:`x^+Y\u000b\u0007/5'\u001dCTrYu?\u0018>\u0006_\u0012\u0016,4E\"atpD\r\u0007'\u0013]5jnJ5\\\u000eFYx\u0019%B\u000eFe\u0003^\u0005\u0012(7SIP,T\u000exlS\u001eF\u0015\u0011\u0012f!\u001c;k$_\u0019w1c@`\\\u0007rE\u0016\fhG\u001epVYKU\u007feg~(?x~G+>K\u0012]PMwY\u0015H\n\u0007\u000e*ogBC2\u0015%.L#6lh7\u0015p\u001d #pA\u001c\u001d<5\u0013VO\u0003(`'$\u0010\u0018u\u0003rgGA\u00021PM{&Kw)\b<XX\u00109#X ", ">q^C\\+>1#\u0007\u0003n5\u0001\u0007+t\u00042\u0005(| \u0013Io\u001b", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBn_5Jx'T\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class CommunicationModule {
    private final EndPointInfo activeEndpoint;
    private final NetworkConnectivityChecker connectivityChecker;
    private final EventDatabaseDataSource dataBaseDataSource;
    private final CoroutineScope externalScope;
    private final Call.Factory httpFactory;
    private final ServerDataListener serverDataListener;
    private final TimeProvider timeProvider;
    private final String version;

    public CommunicationModule(Call.Factory factory, TimeProvider timeProvider, String version, EventDatabaseDataSource dataBaseDataSource, EndPointInfo activeEndpoint, ServerDataListener serverDataListener, CoroutineScope externalScope, NetworkConnectivityChecker connectivityChecker) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(dataBaseDataSource, "dataBaseDataSource");
        Intrinsics.checkNotNullParameter(activeEndpoint, "activeEndpoint");
        Intrinsics.checkNotNullParameter(serverDataListener, "serverDataListener");
        Intrinsics.checkNotNullParameter(externalScope, "externalScope");
        Intrinsics.checkNotNullParameter(connectivityChecker, "connectivityChecker");
        this.httpFactory = factory;
        this.timeProvider = timeProvider;
        this.version = version;
        this.dataBaseDataSource = dataBaseDataSource;
        this.activeEndpoint = activeEndpoint;
        this.serverDataListener = serverDataListener;
        this.externalScope = externalScope;
        this.connectivityChecker = connectivityChecker;
    }

    public final CommunicationManager provideCommunicationManager() {
        OkHttpClient okHttpClientBuild = this.httpFactory;
        if (okHttpClientBuild == null) {
            okHttpClientBuild = DynatraceOkHttpClientFactory.INSTANCE.createOkHttpClientBuilder().build();
        }
        NetworkDataSourceImpl networkDataSourceImpl = new NetworkDataSourceImpl(okHttpClientBuild, new ConfigRequestFactory(this.version), new DataRequestFactory(this.version, new CommunicationModule$provideCommunicationManager$networkDataSource$1(this.timeProvider), true), new ConfigurationsParser(new ServerConfigurationManager(this.activeEndpoint.getApplicationId()), new ServerConfigurationManagerV4()), this.connectivityChecker);
        return new CommunicationManagerImpl(networkDataSourceImpl, new DispatchableDataProvider(this.activeEndpoint, this.dataBaseDataSource, EventRequestEnvelope.INSTANCE.calculateEnvelopeSize(1), this.timeProvider), new ResponseProcessorImpl(this.dataBaseDataSource, this.timeProvider), this.serverDataListener, this.externalScope, this.connectivityChecker);
    }
}
