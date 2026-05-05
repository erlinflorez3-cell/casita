package com.biocatch.client.android.sdk.backend.events;

import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.backend.BackendEventService;
import com.biocatch.client.android.sdk.backend.DataDispatcher;
import com.biocatch.client.android.sdk.backend.communication.LogAddressUpdateService;
import com.biocatch.client.android.sdk.backend.communication.TransmissionConfigUtils;
import com.biocatch.client.android.sdk.backend.communication.Transmitter;
import com.biocatch.client.android.sdk.backend.communication.http.HttpCommunicator;
import com.biocatch.client.android.sdk.backend.communication.messaging.LogMessage;
import com.biocatch.client.android.sdk.backend.communication.messaging.wupMessages.WupMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$q$yّCU0}*ޛWN}gvJ`\fK\u000f\u0014\u0016\u0001̓4Ikxe܈\u0015˰Xģo3{n}\rpxD\u000582P9\n\t\u000f\u001cBH>y\u000bGY\u0010*0nuJV\u001bS\u001d\u001a@\rN*\u000f&tm^8Xl\fD],\u0013sPY?e@~]\rt`U\u0016\u0007i,8X;E\u0015+T1\u0015b_M\u0012Wqk\nص+'9Y<eDi\u0018\u0014C=\u007f\u0011k\u0006>\\3e'\u0011w7]ccP<)N߁}Ɂ@\u0004\u0016ͺwT<32f6\u0015\nςtՂDP\nމ\u0013\f\tcN\u0017S\u0003\nڂ;ӸjQiݢi^E\t\u001d\u0011.#\u0007oOi+טbڠ\u001fT\u007f\u0383\u0002]NA`N8^\u0014Ъ\u0006Ͳf\u00022ʶ\u0001Y\u000e:\u0014\u0017>\u001957\nEQ*BȸJזkv\r\u009b9_wa`@Pslն,Á\u0010ZLߟU}^\\p2!O,T5\b6\u001cvςy˶%%\u0018ʚѡl~"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005kE\u001e\u001ewo\u0003c_*Tv0F*X5]VtM!\u000ei\u0012X4s\u000fU@$m$H\u001f\u0011;,}Dg\b\f#c", "", "0`R8X5=3*~\u0004m\u001a|\u0016@i}(", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8ft,W\u0006\u0015GY_0ZRH", ":nV\u000eW+KS'\rji+x\u0018/S\u007f5\rD~\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00113X.8QqJ\u0014 h}Y*\t\u0014Y/${U;\u001d\b\u0002", ":nV\u0015g;I1#\u0007\u0003n5\u0001\u0007+t\n5", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001d8\u0018V3\u001d\u000e]? }NDt", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "Et_!e(Ga!\u0003\nm,\n", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011;[(e`zA#!Z\u001b$", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$ ^6t\u0005gO pDEhy<Ti;v\u000f\b\u0018\u000e\u000b", ":nV!e(Ga!\u0003\nm,\n", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$tX-t\u0005gO pD\r", ":nV\u0011\\:IO(|}^9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005J0-\u0011GeG\u0012_;Ly'T\"", "Et_\u0015g;I1#\u0007\u0003n5\u0001\u0007+t\n5", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i4i\u00144ML:5\u0011\u001a\u0013naB\u0006C=N\u007f65L[=`Pr\u0013z\u0010d\u0016\u0018(\u0011\u000fW=3lG\u0001\u001d\u000f0I\u000bJ2|\u0015\u0015\u001b?no\fd\u000fMC\u0012q?/hOX)wQIMr3h\n[,`DCmz{\u001bvgO;\n\na\u0001}Quvg5\u0019\bI(<m1-Cy]\u0006q+)Iw\u0007\u00105\"r2x-\rCs2m\u0004Xq\u001c=(\u0007\u00142&>#$<<\u001c>\u0015a\u007ftF\u001eq#_\u0004\u001df?:bhtrSXil&f\u0013kg\tG[\n<E~\u001f4\u001ce@e\u0002^\u0006\u000b.kaXA\u001e\u001e|#oQ,c\u0010L\u0001p $8\u001fKX\u00152(i@N\u0017\u000bxE\b\u000b]M\u001e:&\u001avLv]g| E|\u001bR\u000e3VF\u0005VRy\u001d*\ng\t\t%=fF\u00044\u000f4#@#6id/\u0014v\u001d\u001e\"fE&#,z\u0010QF8[s%\u001b}\u0017gF\u0013gF@\u0012<EGf1@mTN+gN\u0019:U\u0019>ot#\u0018Bq?R8\u000b\u0004\u000e)t\"\u001a/osN#g$>0\b\u0015\t|'3\u001aJfM\u001c\u0017\u0010jFN\u001a\u0007Zx\u0003\u001a*Nx\u001eP~%R>XQ@\u000e@\u0004\u0007b\u000e6gFyp\u0010a\u001f+I[\u0003\fZ\u0005\u001bT\u0019^_w~pN8p\u001b\u001e\u0015scI\u001aM\u0005#7&c}QC{k\fS.h|;\u0012Z=|}\u000bK2]u*\u0007]*sO1jz+:\b7Q\u0001d3wl$\u000fv0n}Q\u0011\u001a/8z\tEB\u001c\u001b<K-|}[w(.\fSS\"\u00024n,!Sz]A\u0004\u00162\u0011F\u0019P~uB[MUf.\u001e\u0017\u0016i\u0014\u000f!\u001f", "6`]1_,", "", "0`R8X5=1#\b{b.\r\u0016+t\u00042\u0005'\u000b\u0013\u0016GnmMv.D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005kE\u001e\u001ewo\u0003c_*Tv0F*X5]VtM!\u000ei\u0012X4s\u000fU@$m$H\u001f\u0011;\u001f", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class BackendConfigurationLoadedEventHandler {
    private final BackendEventService backendEventService;
    private final ConfigurationRepository configurationRepository;
    private final LogAddressUpdateService logAddressUpdateService;
    private final DataDispatcher<?> logDispatcher;
    private final HttpCommunicator logHttpCommunicator;
    private final Transmitter<LogMessage> logTransmitter;
    private final HttpCommunicator wupHttpCommunicator;
    private final Transmitter<WupMessage> wupTransmitter;

    public BackendConfigurationLoadedEventHandler(BackendEventService backendEventService, LogAddressUpdateService logAddressUpdateService, HttpCommunicator logHttpCommunicator, ConfigurationRepository configurationRepository, Transmitter<WupMessage> wupTransmitter, Transmitter<LogMessage> logTransmitter, DataDispatcher<?> logDispatcher, HttpCommunicator wupHttpCommunicator) {
        Intrinsics.checkNotNullParameter(backendEventService, "backendEventService");
        Intrinsics.checkNotNullParameter(logAddressUpdateService, "logAddressUpdateService");
        Intrinsics.checkNotNullParameter(logHttpCommunicator, "logHttpCommunicator");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(wupTransmitter, "wupTransmitter");
        Intrinsics.checkNotNullParameter(logTransmitter, "logTransmitter");
        Intrinsics.checkNotNullParameter(logDispatcher, "logDispatcher");
        Intrinsics.checkNotNullParameter(wupHttpCommunicator, "wupHttpCommunicator");
        this.backendEventService = backendEventService;
        this.logAddressUpdateService = logAddressUpdateService;
        this.logHttpCommunicator = logHttpCommunicator;
        this.configurationRepository = configurationRepository;
        this.wupTransmitter = wupTransmitter;
        this.logTransmitter = logTransmitter;
        this.logDispatcher = logDispatcher;
        this.wupHttpCommunicator = wupHttpCommunicator;
    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public final void handle(BackendConfigurationLoadedEvent backendConfigurationLoadedEvent) {
        Intrinsics.checkNotNullParameter(backendConfigurationLoadedEvent, "backendConfigurationLoadedEvent");
        boolean z2 = this.configurationRepository.getBoolean(ConfigurationFields.isEnabled, true);
        if (z2) {
            try {
                this.logHttpCommunicator.setUrl(this.logAddressUpdateService.resolveLogAddress());
            } catch (Exception e2) {
                Log.Companion.getLogger().critical("Unable to create log server url address. " + e2.getMessage());
            }
            Log.Companion.getLogger().configure(this.configurationRepository);
            this.logDispatcher.setDispatchRate(this.configurationRepository.getLong(ConfigurationFields.logMessageDispatchRateMsec));
            Transmitter<WupMessage> transmitter = this.wupTransmitter;
            TransmissionConfigUtils.Companion companion = TransmissionConfigUtils.Companion;
            transmitter.configure(companion.readWupTransmitterSetting(this.configurationRepository));
            this.logTransmitter.configure(companion.readLogTransmitterSettings$sdk_3_3_0_936_release(this.configurationRepository));
            this.wupHttpCommunicator.configure(this.configurationRepository.getBoolean(ConfigurationFields.enableWupMessagesHashing));
        }
        this.backendEventService.publishConfigurationLoaded(z2);
    }
}
