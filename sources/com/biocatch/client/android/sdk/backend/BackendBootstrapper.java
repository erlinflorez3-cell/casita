package com.biocatch.client.android.sdk.backend;

import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.ServerLogClient;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.android.commonsdk.wrappers.JsonFactory;
import com.biocatch.client.android.sdk.backend.communication.ClientSessionState;
import com.biocatch.client.android.sdk.backend.communication.LogAddressUpdateService;
import com.biocatch.client.android.sdk.backend.communication.LogServerClient;
import com.biocatch.client.android.sdk.backend.communication.RetransmitHandler;
import com.biocatch.client.android.sdk.backend.communication.TransmissionConfigUtils;
import com.biocatch.client.android.sdk.backend.communication.TransmissionQueue;
import com.biocatch.client.android.sdk.backend.communication.Transmitter;
import com.biocatch.client.android.sdk.backend.communication.WupJsonAppender;
import com.biocatch.client.android.sdk.backend.communication.WupResponseProcessor;
import com.biocatch.client.android.sdk.backend.communication.WupServerClient;
import com.biocatch.client.android.sdk.backend.communication.http.HttpClientFactory;
import com.biocatch.client.android.sdk.backend.communication.http.HttpClientFactoryStrategy;
import com.biocatch.client.android.sdk.backend.communication.http.HttpCommunicator;
import com.biocatch.client.android.sdk.backend.communication.http.URLFactory;
import com.biocatch.client.android.sdk.backend.communication.messaging.Compressor;
import com.biocatch.client.android.sdk.backend.communication.messaging.DataSerializer;
import com.biocatch.client.android.sdk.backend.communication.messaging.JsonToMsgPack;
import com.biocatch.client.android.sdk.backend.communication.messaging.LogMessage;
import com.biocatch.client.android.sdk.backend.communication.messaging.LogMessageBuilder;
import com.biocatch.client.android.sdk.backend.communication.messaging.WupMessageBuilder;
import com.biocatch.client.android.sdk.backend.communication.messaging.dataWupMessageFactory.DataWupMessageFactory;
import com.biocatch.client.android.sdk.backend.communication.messaging.wupMessages.WupMessage;
import com.biocatch.client.android.sdk.backend.events.BackendConfigurationLoadedEventHandler;
import com.biocatch.client.android.sdk.backend.events.BackendNewSessionStartedEventHandler;
import com.biocatch.client.android.sdk.backend.events.BackendWupInfoEventHandler;
import com.biocatch.client.android.sdk.core.CidCache;
import com.biocatch.client.android.sdk.core.Constants;
import com.biocatch.client.android.sdk.core.ExtendedOptions;
import com.biocatch.client.android.sdk.core.hash.HashService;
import com.biocatch.client.android.sdk.techicalServices.SingleThreadExecutor;
import com.biocatch.client.android.sdk.wrappers.Base64;
import com.biocatch.client.android.sdk.wrappers.DeflaterFactory;
import com.biocatch.client.android.sdk.wrappers.MessagePackFactory;
import com.biocatch.client.android.sdk.wrappers.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONArray;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
@Metadata(bv = {}, d1 = {"Яė\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[*\u0015k\u00044:[,ڎK;k\u001a\u0006\"\u000fPVg}nRҙ\u0013C%\u0006\u001eюr,_U\u0001ز\u001a\u000fHBwЀ;M\u0006=Aś|6\u001b :\"Ny\rЏ\"*^\u0010~ٙKK\"\u00128ϋx:h\rU\u00050\u0012\u000e>&\u0002&\\}N>ԟt]H/+\u0003oBV'm<\u0005M\u0013G\\'#vi\u001e1@=ߎ+Ǭ\u0004\u00035Q\u001cb\u0013C\u007f=\u001dhU(;M\u0002YNX.\u0017%/]\u0011urTa\u0015Un\u0012?+}jׂT\u000e6\u007fC\u007f\u001bc\u001c\u000e4O\u0011\\;C~\b<[%vajh\u0002\rm0\u0001ob/'\u00162YdKj_\u000fS\u0019|b,\t\u001bL;\u0001\u001dP\fX\u001c\u0011-\u001b\u0003#\"=_IUH|\u00140Ơoձtb\nÏT?U\u000bG{?:ϲ)=cݽ;#q\u000fVR8\u0003\u0013o\u0001S\u0018b\u001fؚ$å\u001a72\u009e\\fRu\u001dk~f/\u008f\u0013ܖ T\u000fâX\u001f.o\u0010<O9fʝQŹmjUΪZ1=fOY\u001dldæ;ӷ75Yү`m`\f,?jx[֝h͞W\fb٢x.@_\u0003\u0010&\u0014\u001b\u008b\u000eƱ6?yʉ\u0005>?2t\u001bX\u0005.Bo\u00187y1ӓ\u0012њX3,Ѱ:0\u0003%\u0019P\u000b\u000eF\u03a2zͅ0|hõ}M_S1&\u0004A?ؗ~ɠ\u000b~{Ò\u0018yZgdr&we{N8HZ(Ȁ?т\u0013~1ɅR9SN\u000be\u007fPh\u0600|܃}\u000fCÜ~s\u0016\u000e\t,\u000f\b!֥VЂ&vfаs\u0014r$\u0012at\u001a\u001eύVߏ_>QͿSkJsP\u0003\u0015!.%/\u0016P\u001e\fԉEے!\u0016\u007fҡڕ\u0019\u0013"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8cm6]\u00056THY7\\_H", "", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "AdaCX9%]\u001b\\\u0002b,\u0006\u0018", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r)kA/\u0015uHC\tA3Rv0V\"", "6`b5F,Kd\u001d|z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wP?In}\u0001\u0011vd'\u0007p=Rt'\u001d", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAv\u00172OSHgC\"\u001fq+\u0017\u0011l-Rx7TH]0f[_=\u001f\u001ch\u0012]5\u001a\u0019/(\"xL\u0001\u001c\f6G}Jf\u0004U\u0012\u00174wzFUYE\u0004\u001d}K2vE_)wQNE,\u001as\u0010f+2!8.\u001c;\u0016\u001frN*\u0019yVZn[xtqK\u0018D6.FueOSn[\u0006{1!M\u007f\u0001\u0014{Ft8\u0006-\u0011\u001b48B\fOg!M4_\u00136d\u000b$*@:\u000fNIf?jE\u0012h(pQ\nk4>#id-V\u000e\r'\u0015eBa)\u00043`\t\b,k#*4~Ol}\u0013\t\\g^", "0`R8X5=3*~\u0004m\u001a|\u0016@i}(", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8ft,W\u0006\u0015GY_0ZRH", "0`R8X5=A\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8tc9_z%G\"", "5dc\u000fT*DS\"}h^9\u000e\r-e", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001j\u0012,SCDj}z\u0011fg9\u0010b\u001aN\u00048KJN\u0002", "0`b2)z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u0011\u001a#h2\b\\", "1hS\u0010T*AS", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w+G:I0\u001c\u0018h7", "1kX2a;,S'\r~h5j\u0018+t\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011*U0\\[\u0002+\u0014 h\u0012X4z\u0014UP$D", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", ":nV\u000eW+KS'\rji+x\u0018/S\u007f5\rD~\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00113X.8QqJ\u0014 h}Y*\t\u0014Y/${U;\u001d\b\u0002", ":nV\u0011\\:IO(|}^9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005J0-\u0011GeG\u0012_;Ly'T\"", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", ":nV\u0015g;I1#\u0007\u0003n5\u0001\u0007+t\n5", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001d8\u0018V3\u001d\u000e]? }NDt", ":nV\u001fX;KO\"\r\u0003b;_\u00058d\u0007(\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00119N;iN{K\u001c\u0016ipJ4\f\fYNy", ":nV!e(Ga!\u0003\nm,\n", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011;[(e`zA#!Z\u001b$", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$tX-t\u0005gO pD\r", "Et_\u0015g;I1#\u0007\u0003n5\u0001\u0007+t\n5", "Et_\u001fX;KO\"\r\u0003b;_\u00058d\u0007(\t", "Et_!e(Ga!\u0003\nm,\n", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$ ^6t\u0005gO pDEhy<Ti;v\u000f\b\u0018\u000e\u000b", "2dbAe6R", "", "AsP?g", "Et_ X9OS&n\be", "", ":nV X9OS&_~q,{x<l", "1hS", "3wc2a+>R\u0003\n\nb6\u0006\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w-VJk=\u001d\u0015gKD\u0016g6W\u0005|", ";tX1", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class BackendBootstrapper {
    private final BackendEventService backendEventService;
    private final BackendService backendService;
    private final Base64 base64;
    private final CidCache cidCache;
    private final ClientSessionState clientSessionState;
    private final ConfigurationRepository configurationRepository;
    private final EventBusService eventBusService;
    private final LogAddressUpdateService logAddressUpdateService;
    private final DataDispatcher<JSONArray> logDispatcher;
    private final HttpCommunicator logHttpCommunicator;
    private final RetransmitHandler logRetransmitHandler;
    private final Transmitter<LogMessage> logTransmitter;
    private final Utils utils;
    private final HttpCommunicator wupHttpCommunicator;
    private final RetransmitHandler wupRetransmitHandler;
    private final Transmitter<WupMessage> wupTransmitter;

    public BackendBootstrapper(ConfigurationRepository configurationRepository, Utils utils, ServerLogClient serverLogClient, HashService hashService) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(serverLogClient, "serverLogClient");
        Intrinsics.checkNotNullParameter(hashService, "hashService");
        this.configurationRepository = configurationRepository;
        this.utils = utils;
        EventBusService eventBusService = new EventBusService(new EventBus());
        this.eventBusService = eventBusService;
        CidCache cidCache = new CidCache();
        this.cidCache = cidCache;
        ClientSessionState clientSessionState = new ClientSessionState(null, 1, null);
        this.clientSessionState = clientSessionState;
        Base64 base64 = new Base64();
        this.base64 = base64;
        Compressor compressor = new Compressor(base64, new JsonToMsgPack(new MessagePackFactory()), new DeflaterFactory());
        JsonFactory jsonFactory = new JsonFactory();
        WupMessageBuilder wupMessageBuilder = new WupMessageBuilder(clientSessionState, new DataWupMessageFactory(compressor, clientSessionState, new WupJsonAppender(jsonFactory), new DataSerializer(jsonFactory)));
        WupResponseProcessor wupResponseProcessor = new WupResponseProcessor(clientSessionState, eventBusService, jsonFactory, configurationRepository);
        TransmissionQueue transmissionQueue = new TransmissionQueue(configurationRepository.getInt(ConfigurationFields.wupCommunicationBufferCapacity));
        int i2 = configurationRepository.getInt(ConfigurationFields.logCommunicationBufferCapacity);
        int i3 = configurationRepository.getInt(ConfigurationFields.wupResponseTimeout);
        HttpCommunicator httpCommunicator = new HttpCommunicator(i3, i3, Constants.WUP_CONTENT_TYPE, hashService, configurationRepository.getBoolean(ConfigurationFields.enableWupMessagesHashing));
        this.wupHttpCommunicator = httpCommunicator;
        TransmissionConfigUtils.Companion companion = TransmissionConfigUtils.Companion;
        RetransmitHandler retransmitHandler = new RetransmitHandler(companion.readWupTransmitterSetting(configurationRepository));
        this.wupRetransmitHandler = retransmitHandler;
        Transmitter<WupMessage> transmitter = new Transmitter<>(BackendBootstrapperKt.WUP_TRANSMITTER_THREAD, transmissionQueue, httpCommunicator, retransmitHandler, eventBusService);
        this.wupTransmitter = transmitter;
        WupServerClient wupServerClient = new WupServerClient(wupMessageBuilder, transmitter, wupResponseProcessor, clientSessionState);
        HttpCommunicator httpCommunicator2 = new HttpCommunicator(i3, i3, Constants.LOG_CONTENT_TYPE, null, false, 24, null);
        this.logHttpCommunicator = httpCommunicator2;
        TransmissionQueue transmissionQueue2 = new TransmissionQueue(i2);
        LogMessageBuilder logMessageBuilder = new LogMessageBuilder(compressor);
        RetransmitHandler retransmitHandler2 = new RetransmitHandler(companion.readLogTransmitterSettings$sdk_3_3_0_936_release(configurationRepository));
        this.logRetransmitHandler = retransmitHandler2;
        Transmitter<LogMessage> transmitter2 = new Transmitter<>(BackendBootstrapperKt.LOG_TRANSMITTER_THREAD, transmissionQueue2, httpCommunicator2, retransmitHandler2, eventBusService);
        this.logTransmitter = transmitter2;
        LogServerClient logServerClient = new LogServerClient(logMessageBuilder, transmitter2);
        LogAggregator logAggregator = new LogAggregator(serverLogClient);
        LogAddressUpdateService logAddressUpdateService = new LogAddressUpdateService(configurationRepository, cidCache, clientSessionState);
        this.logAddressUpdateService = logAddressUpdateService;
        DataDispatcher<JSONArray> dataDispatcher = new DataDispatcher<>(new SingleThreadExecutor("BC_LogDispatcherThread"), logAggregator, logServerClient, configurationRepository.getLong(ConfigurationFields.logMessageDispatchRateMsec));
        this.logDispatcher = dataDispatcher;
        BackendEventService backendEventService = new BackendEventService();
        this.backendEventService = backendEventService;
        this.backendService = new BackendService(wupServerClient, backendEventService, dataDispatcher, logAddressUpdateService, httpCommunicator2);
    }

    public final void destroy() throws InterruptedException {
        this.backendService.stopDispatchers();
        this.wupTransmitter.stop();
        this.logTransmitter.stop();
    }

    public final BackendService getBackendService() {
        return this.backendService;
    }

    public final void start(String wupServerUrl, String str, String cid, ExtendedOptions extendedOptions, String muid) throws BackendException {
        Intrinsics.checkNotNullParameter(wupServerUrl, "wupServerUrl");
        Intrinsics.checkNotNullParameter(cid, "cid");
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        Intrinsics.checkNotNullParameter(muid, "muid");
        try {
            HttpClientFactoryStrategy httpClientFactoryStrategy = new HttpClientFactoryStrategy(new HttpClientFactory(this.utils, new URLFactory(), null, 4, null), extendedOptions.getExternalHttpClientFactory());
            this.wupHttpCommunicator.setHttpClient(httpClientFactoryStrategy.create());
            this.logHttpCommunicator.setHttpClient(httpClientFactoryStrategy.create());
            this.cidCache.set(cid);
            this.clientSessionState.setMuid(muid);
            this.clientSessionState.setAgentType(extendedOptions.getAgentType().getType());
            this.wupHttpCommunicator.setUrl(new URL(wupServerUrl));
            if (str != null) {
                this.logAddressUpdateService.setFixedUrl(str);
                this.logHttpCommunicator.setUrl(this.logAddressUpdateService.resolveLogAddress());
            }
            this.wupTransmitter.start();
            this.logTransmitter.start();
            this.eventBusService.subscribe(new BackendConfigurationLoadedEventHandler(this.backendEventService, this.logAddressUpdateService, this.logHttpCommunicator, this.configurationRepository, this.wupTransmitter, this.logTransmitter, this.logDispatcher, this.wupHttpCommunicator));
            this.eventBusService.subscribe(new BackendNewSessionStartedEventHandler(this.backendEventService));
            this.eventBusService.subscribe(new BackendWupInfoEventHandler(this.backendEventService));
        } catch (Exception e2) {
            throw new BackendException("Error bootstrapping the backend.", e2);
        }
    }
}
