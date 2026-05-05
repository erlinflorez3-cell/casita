package com.biocatch.client.android.sdk.backend;

import com.biocatch.android.commonsdk.backend.IBackendEventListener;
import com.biocatch.android.commonsdk.backend.IBackendService;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.backend.communication.LogAddressUpdateService;
import com.biocatch.client.android.sdk.backend.communication.WupServerClient;
import com.biocatch.client.android.sdk.backend.communication.http.HttpCommunicator;
import com.biocatch.client.android.sdk.core.exceptions.SDKException;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a$yCIa\"}(\nWNugvϺb\u000bY\u000f\u000e\u0016~o4Ic\u0015e\u0012%2JoE=SڎSʠ\u0011td\u0004`a2<\b\u0005\u0019\u001aXI z\tEc\f@3PxHV%Q\u0015\u001a\u0018\u0007l%\u0011\"jmf6vsm>=+\u001bipWϮc0\u000bWUTb6%v\u0010.[DEF-%\u0002\u0015Mf$K\u0011R\n=3xW+9]\fWddH\u0018#@g\r\f\u0003nj\u0013gx\fU;\u007fgYa&(&\rB!\u0005\b\u001c\u001d?H\\=bx\u0016&Kt!cpZ\u0010wZ\u0006\u000bcF\u0017S\u001baE\u00025tmy;G^g\u0006\u0013&6)\u0011p1[\u0003)\u000f/KX\u0006nIQnI\u0011Z\u0018wUm2\u0001\u0013\u00068#HG.;D\u001d<7=7\nIS%y#`D\u0016\u0003Mdvu\u0002RvPj|$ZB\t:jtj\u0013\u0010hVn+?YdX\u0015# \u0013Nl@J/K(N}x\u001ap[\u0002\"'Eeee?w\u001cYQ^a8(Ҳ\u0012уVv\u001c̳\rn\u0013^~B\u0002\u00131٥*ϒ6HrݘH\fRR$\u0017B?w\u001db1\bǌ^ČL\u0003&Փ\u0012\t\u0017grh>\b+՟&ғm$|էQaj{\bi\u000fHZ\t\u0017fέEUM\u001b,b0v\u0005\t1\u0007\u0017s.H>չIƥp\u0016}ɝޑ$="}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8tc9_z%G\"", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u001fH0\u001c\u001bhj8tc9_z%G\"", "Et_ X9OS&\\\u0002b,\u0006\u0018", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011>^7JR\u007fN\u0014\u001f8\u0015R+\u0016\u0014/", "0`R8X5=3*~\u0004m\u001a|\u0016@i}(", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8ft,W\u0006\u0015GY_0ZRH", ":nV\u0011\\:IO(|}^9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005J0-\u0011GeG\u0012_;Ly'T\"", ":nV\u000eW+KS'\rji+x\u0018/S\u007f5\rD~\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00113X.8QqJ\u0014 h}Y*\t\u0014Y/${U;\u001d\b\u0002", ":nV\u0015g;I1#\u0007\u0003n5\u0001\u0007+t\n5", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011O];g\u001cUL#\u001d8\u0018V3\u001d\u000e]? }NDt", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i4i\u00144ML:52(\u001dpqB\u000ba(]z1P\u0016@<g@rJ%\u0012gkU/\r\u000eh\u0017\u000blN?h\u00050S\u007f7w~\u000f_\f<npKeYC\u0003\u0014\u0003K-g\u0010g^\u007f\u0011>A`0d\u0015^f968*\u0014z\u0018zyP7\u0019iS\u001e\u0004Vwg=.\u0017\u0005@m;qeDA~S?>%&O{\u0001!{T}*\u00027\b3sDc\u000b\u0015d\u0014<dx\u001e+& #52\u001b\u0017MV_\u0005jA\u000eutH\u0006\u0018j~.\u001doc_W\r\n'\u0015b9ah\u0010\u0001N\u000f=Vy\u0019&\u0010\rAaC\u0012\u0005\u0005*mnH\r\u0019^\t\"\u0001M&]\r\u0012\u0007p!e\u0015 ?5\u000eg7_E[\u0003\u0014g4\u001b{GC\"\u0002L\u000em!YYawm3|\u001bG\u001dBI?@PJs\u0010\u001fCJ\u0007\b\u001c\u0001sFx\u007f!$+\u0007V4`f/\u0014f\u001d #o@,(1/}aDxgA*$\r\u00192_$lI\u0016\f;IYs&:_Z\u000fI0\u0016\u0001", "Adb@\\6G7w", "", "5dc X:LW#\b^=", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "/cS\u0012i,Gb\u007f\u0003\tm,\u0006\t<", "", "0`R8X5=3*~\u0004m\u0013\u0001\u0017>e\t(\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u001fH0\u001c\u001bhj8ft,W\u0006\u000eKZ],eR\u007f\u0013", "1gP;Z,\u001c]\"\u000ezq;", "1n]AX?M<\u0015\u0007z", ">`d@X\u000bBa$z\n\\/|\u0016=", "@d\\<i,\u001ed\u0019\b\nE0\u000b\u0018/n\u007f5", "@dbB`,\u001dW'\nvm*\u007f\t<s", "Ad]17(MO", "2`c.", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005J0-\u0011Lp9\u000f9", "Ad]193Na\u001c]vm(", "4kd@[\u001aHc&|z", "Adc\u000fe(GR", "0qP;W", "Adc _(OS\n~\bl0\u0007\u0012", "AkPCX\u001d>`'\u0003\u0005g", "AsP?g\u000bBa$z\n\\/|\u0016=", "AsP?g\u0015>e\u0007~\tl0\u0007\u0012", "1rX1", "As^=70L^\u0015\u000exa,\n\u0017", "CoS.g,\u001ca\u001d}", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class BackendService implements IBackendService {
    private final BackendEventService backendEventService;
    private final LogAddressUpdateService logAddressUpdateService;
    private final DataDispatcher<?> logDispatcher;
    private final HttpCommunicator logHttpCommunicator;
    private final WupServerClient wupServerClient;

    public BackendService(WupServerClient wupServerClient, BackendEventService backendEventService, DataDispatcher<?> logDispatcher, LogAddressUpdateService logAddressUpdateService, HttpCommunicator logHttpCommunicator) {
        Intrinsics.checkNotNullParameter(wupServerClient, "wupServerClient");
        Intrinsics.checkNotNullParameter(backendEventService, "backendEventService");
        Intrinsics.checkNotNullParameter(logDispatcher, "logDispatcher");
        Intrinsics.checkNotNullParameter(logAddressUpdateService, "logAddressUpdateService");
        Intrinsics.checkNotNullParameter(logHttpCommunicator, "logHttpCommunicator");
        this.wupServerClient = wupServerClient;
        this.backendEventService = backendEventService;
        this.logDispatcher = logDispatcher;
        this.logAddressUpdateService = logAddressUpdateService;
        this.logHttpCommunicator = logHttpCommunicator;
    }

    @Override // com.biocatch.android.commonsdk.backend.IBackendService
    public void addEventListener(IBackendEventListener backendEventListener) throws SDKException {
        Intrinsics.checkNotNullParameter(backendEventListener, "backendEventListener");
        this.backendEventService.subscribe(backendEventListener);
    }

    public final void changeContext(String contextName) {
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        this.wupServerClient.changeContext(contextName);
    }

    public final String getSessionID() {
        return this.wupServerClient.getSessionID();
    }

    public final void pauseDispatchers() {
        this.logDispatcher.pause();
    }

    @Override // com.biocatch.android.commonsdk.backend.IBackendService
    public void removeEventListener(IBackendEventListener backendEventListener) throws SDKException {
        Intrinsics.checkNotNullParameter(backendEventListener, "backendEventListener");
        this.backendEventService.unsubscribe(backendEventListener);
    }

    public final void resumeDispatchers() {
        this.logDispatcher.resume();
    }

    public final void sendData(Collection<DataItem> data) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        this.wupServerClient.sendData2(data);
    }

    public final void sendFlushData(Collection<DataItem> data, String flushSource) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(flushSource, "flushSource");
        this.wupServerClient.sendFlushData(data, flushSource);
    }

    public final void setBrand(String brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.wupServerClient.setBrand(brand);
    }

    public final void setSlaveVersion(String slaveVersion) {
        Intrinsics.checkNotNullParameter(slaveVersion, "slaveVersion");
        this.wupServerClient.setSlaveVersion(slaveVersion);
    }

    public final void startDispatchers() {
        this.logDispatcher.start();
    }

    public final void startNewSession(String str) {
        this.wupServerClient.startNewSession(str);
    }

    public final void stopDispatchers() {
        this.logDispatcher.stop();
    }

    public final void updateCsid(String str) {
        this.wupServerClient.updateCsid(str);
        try {
            this.logHttpCommunicator.setUrl(this.logAddressUpdateService.resolveLogAddress());
        } catch (Exception e2) {
            Log logger = Log.Companion.getLogger();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("Failed updating the log server url. %s", Arrays.copyOf(new Object[]{e2.getMessage()}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            logger.critical(str2);
        }
    }
}
