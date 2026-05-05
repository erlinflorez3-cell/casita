package com.biocatch.client.android.sdk.backend.communication;

import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.backend.DataItem;
import com.biocatch.client.android.sdk.backend.communication.messaging.Message;
import com.biocatch.client.android.sdk.backend.communication.messaging.WupMessageBuilder;
import com.biocatch.client.android.sdk.backend.communication.messaging.wupMessages.DataWupMessage;
import com.biocatch.client.android.sdk.backend.communication.messaging.wupMessages.WupMessage;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLc\u0003 I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0Le^.Zݷ2\u000f\u0002{<řc$\bCCU }*\t]ZogtKb\u000bQ\u000f\u000e\u0016~v2կkތ\u000e\u001e\u001f:RuO5]ok:\u000ftd\u0004X1@x#\u0015\u0005(,`\u0010%}SU\u001a\u0016HF\u0001<b\r{\u000bH\u0017\u0016B.\b6\\\u0016VFLzfR/Q\rݦFN5jx\t[\u001d^TU\u001e'e,=X7c\"mg\u0011\u001aj[m\u0014o{K\u0019\u0001-7-Ys\u00067\u0007\u007fZ)si\u001br\u000b&\u000b\u0016\u0002j\u001a;CUsM`\u000eVx){=@\u0012$\u001e'v;u&t\u001f&3#\u0004\u0004D^\u001avB.\b*B%>\u00183YJKj_{S\u0019|DD\u0013\u001b9;\u0001\u001d2\fZ\u001c|-\u001djv\u007f>\u001aNKef\n\bN\u001e\n~~\u001a,\u001a/u\r\u007f\b\u001f7/%ee\u0010\u05fd#Ƞ\u0006HLϙG\u0016ntkkhGn/%Z֖.\r$\\Jr\u0013z!ff0)S,V\u0017}6\u0019NaN˖#ٚ\u0014NWŖ:v[_\"%]i\u000eխp«\u0012WAӔ\u0004A_j(a\u0001~j̶>И\tXn̻Ζ\u0010y"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011>^7JR\u007fN\u0014\u001f8\u0015R+\u0016\u0014/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00110-(kN`=\u001d\u0011Z\u001b$", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005J0-\u0011Lp9\u000f9", "Et_\u001aX:LO\u001b~Wn0\u0004\b/r", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$\u007f^6t\u0005gO pD\u0014/\f3H\u0002H>", "BqP;f4Bb(~\b", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011;[(e`zA#!Z\u001b$", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$ ^6t\u0005gO pDEhy<Ti;v\u000f\b\u0018\u000e\u000b", "Et_\u001fX:I]\"\rzI9\u0007\u0007/s\u000e2\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011>^7IR\u0001H\u001e\u001bh\u000e98\u0017\u0003YO2xQ\r", "1kX2a;,S'\r~h5j\u0018+t\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011*U0\\[\u0002+\u0014 h\u0012X4z\u0014UP$D", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i4i\u00144ML:52(\u001dpqB\u000ba(]z1P\u0016V,j`n?\u0018\u001b\\W@;\u0018lYO2jF7{\u00180P\u0001;uVr\u0014\u0018=4mF`\u000eC\t\u0013x\u000b'oJYh\t\u0011=Na7n\u0010^fj9@m\u0011m\u0017!hY-Sy]\u0019zb\u0003keC(~B-\b\\hBN}]@\u00046\u001fXQ^\u0010<`>(x7\u0002094gNIn\u001c>g\b^(e@40:;\\MJi?i:\fn\u001fj\u0007W`?9!ungF\u000b\u0016a!d~So\f$R\u0014ISx#'1\fLYy#\u0017\u00111CLGM#\u001e}\u001ezB\u001en\u000f\u0006Ld\u001f .\u001fL#\u000bq)lAQ\u0012Rv7\u0012EV?\u0013vH\u0019l\u0015pe_w4?|\u000fE07UE@0Js\u0010\u001fCn\u000b\r+wsKgE\u000f4%\u0013\u001d)", "Adb@\\6G7w", "", "5dc X:LW#\b^=", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1gP;Z,\u001c]\"\u000ezq;", "", "1n]AX?M<\u0015\u0007z", "Ad]17(MO", "2`c.", "Ad]193Na\u001c]vm(", "4kd@[\u001aHc&|z", "Adc\u000fe(GR", "0qP;W", "Adc _(OS\n~\bl0\u0007\u0012", "AkPCX\u001d>`'\u0003\u0005g", "AsP?g\u0015>e\u0007~\tl0\u0007\u0012", "1rX1", "CoS.g,\u001ca\u001d}", "%t_!e(Ga!\u0003\tl0\u0007\u0012\u001ce\u000e3\u0006I\u000f\u0017}K}\u001d<\u007f%B", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WupServerClient implements IDataSender<Collection<? extends DataItem>> {
    private final ClientSessionState clientSessionState;
    private final Transmitter<WupMessage> transmitter;
    private final WupMessageBuilder wupMessageBuilder;
    private final WupResponseProcessor wupResponseProcessor;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\u000f8\u000b4B\u0007\":\u0012\u007fјnjG<LeN/ZS@\u000fsڔ:Ŝ]:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Ax:Lmx\f\u0016?6PtW3{u\u0004M)\u000bD\f82P<*\t\u000f\"BH>|+GY\u0015*0nz\u0001f]Y\u0013\u001a*\u0006l!Wȩ^ʄR6PǍӀ>:"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011>^7JR\u007fN\u0014\u001f8\u0015R+\u0016\u0014\u001834y3D\u001b\u0011:Q\u0006Iv\u0005\u0016\u001fz5x{L_\u001eG`\u0019\u0004P)qFf5", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00110=9X[\u0001E\u0018 h\u0012X4y\u0005gQ+}+;-\u0017,R\u0002H>", "3w_2V;\u001c]\"\u007f~`<\n\u0005>i\n1", "", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i4i\u00144ML:52(\u001dpqB\u000ba(]z1P\u0016@<g@rJ%\u0012gkU/\r\u000eh\u0017\u001925", "=m4?e6K", "", "3qa<e", "", "=mBBV*>a'", "@db=b5LS", ";db@T.>", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$uN9\u001b\u0001[Ay", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    private final class WupTransmissionResponseListener implements ITransmissionResultListener {
        private final boolean expectConfiguration;

        public WupTransmissionResponseListener(boolean z2) {
            this.expectConfiguration = z2;
        }

        @Override // com.biocatch.client.android.sdk.backend.communication.ITransmissionResultListener
        public void onError(String error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.biocatch.client.android.sdk.backend.communication.ITransmissionResultListener
        public void onSuccess(String response, Message message) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(message, "message");
            WupServerClient.this.wupResponseProcessor.process(response, (WupMessage) message, this.expectConfiguration);
        }
    }

    public WupServerClient(WupMessageBuilder wupMessageBuilder, Transmitter<WupMessage> transmitter, WupResponseProcessor wupResponseProcessor, ClientSessionState clientSessionState) {
        Intrinsics.checkNotNullParameter(wupMessageBuilder, "wupMessageBuilder");
        Intrinsics.checkNotNullParameter(transmitter, "transmitter");
        Intrinsics.checkNotNullParameter(wupResponseProcessor, "wupResponseProcessor");
        Intrinsics.checkNotNullParameter(clientSessionState, "clientSessionState");
        this.wupMessageBuilder = wupMessageBuilder;
        this.transmitter = transmitter;
        this.wupResponseProcessor = wupResponseProcessor;
        this.clientSessionState = clientSessionState;
    }

    public final void changeContext(String contextName) {
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        this.clientSessionState.setContextName(contextName);
    }

    public final String getSessionID() {
        return this.clientSessionState.getServerSession().getSid();
    }

    @Override // com.biocatch.client.android.sdk.backend.communication.IDataSender
    public /* bridge */ /* synthetic */ void sendData(Collection<? extends DataItem> collection) throws JSONException, IOException {
        sendData2((Collection<DataItem>) collection);
    }

    /* JADX INFO: renamed from: sendData */
    public void sendData2(Collection<DataItem> data) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.isEmpty()) {
            throw new InvalidOperationException("Illegal data send. Data collection is empty.");
        }
        DataWupMessage dataWupMessageBuildDataMessage = this.wupMessageBuilder.buildDataMessage(new WupTransmissionResponseListener(false), data);
        Log.Companion.getLogger().debug("Sending a message to the server");
        this.transmitter.enqueue(dataWupMessageBuildDataMessage);
    }

    public final void sendFlushData(Collection<DataItem> data, String flushSource) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(flushSource, "flushSource");
        if (data.isEmpty()) {
            throw new InvalidOperationException("Illegal flush data send. Data collection is empty.");
        }
        DataWupMessage dataWupMessageBuildFlushDataMessage = this.wupMessageBuilder.buildFlushDataMessage(new WupTransmissionResponseListener(false), data, flushSource);
        Log.Companion.getLogger().debug("Sending a flush message to the server");
        this.transmitter.enqueue(dataWupMessageBuildFlushDataMessage);
    }

    public final void setBrand(String brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        if (this.clientSessionState.getBrand() == null) {
            this.clientSessionState.setBrand(brand);
        } else {
            Log.Companion.getLogger().warning("Brand can be set only once in a session");
        }
    }

    public final void setSlaveVersion(String slaveVersion) {
        Intrinsics.checkNotNullParameter(slaveVersion, "slaveVersion");
        this.clientSessionState.setLeanVersion(slaveVersion);
    }

    public final void startNewSession(String str) {
        if (str != null && this.clientSessionState.getCsid() != null && Intrinsics.areEqual(str, this.clientSessionState.getCsid())) {
            Log logger = Log.Companion.getLogger();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("Received a request to start a new session with csid %s which was linked to the previous session.", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            logger.warning(str2);
        }
        this.clientSessionState.startNewServerSession();
        this.clientSessionState.setCsid(str);
        boolean z2 = (this.clientSessionState.getHasConfiguration() || this.clientSessionState.getHasPendingConfigurationRequest()) ? false : true;
        if (z2) {
            this.clientSessionState.markConfigurationRequested();
        }
        this.transmitter.enqueue(this.wupMessageBuilder.buildStartNewSessionMessage(new WupTransmissionResponseListener(z2), this.clientSessionState.getServerSession(), z2));
    }

    public final void updateCsid(String str) {
        this.clientSessionState.setCsid(str);
        this.transmitter.enqueue(this.wupMessageBuilder.buildUpdateCsidMessage(new WupTransmissionResponseListener(false)));
    }
}
