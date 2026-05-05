package com.dynatrace.agent.communication.network.datasource;

import com.dynatrace.agent.common.connectivity.NetworkConnectivityChecker;
import com.dynatrace.agent.communication.LocalServerData;
import com.dynatrace.agent.communication.api.ServerDataUpdate;
import com.dynatrace.agent.communication.network.request.ConfigRequestFactory;
import com.dynatrace.agent.communication.network.request.DataRequestFactory;
import com.dynatrace.agent.communication.network.response.ConfigurationsParser;
import com.dynatrace.agent.communication.network.response.ResponseResult;
import com.dynatrace.agent.communication.network.response.ResponseResultKt;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
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
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a%yCQU\"Ԃ*\teNogtJb\u000bY\u000f\u000e\u0016~k4Ikxe܈\u00172XoG\u074cUoS9hҚ<ӌ6݅R8(\u0004AG:L\u001ev\u0013Cy\r\"4NrRR;P\u0015\u001e \nV /#lk\\<`l\fA?'\u0011qZNUh݁\u0001O\u0013Pb2U\u000bo*C@eBE)a\u0011\u001fR\nNIӡ0ݘ\th57s]\u0002hNX.!E/]\u001burTnKŀ\u001fВ++]v\u0014n\u001c<\u0010z*\u001al\b\u001c\u001b?H\\CJj\u0016%Kt!kpT\u0010wZ\u007f){|\u0017u\fA+Q\u001b\u0015R8ݥ\u001b\u05ee;{\rټn/\u000fp9[\u0003\u00117ڀ\u001dƻ{Q9҅\u0011IVR\"YkrZ͒d͆.\u00048ϚP;\n\u0017F\u0017S>2ހ%\u074co\u0002Pֳ8\u0003\u0013h\u0001S\u0018[\u001fؚ$å\u001a72\u009eɚ^_"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}\u001d\u0011w]G\u0011s9Lvp0L]>f_x\u001c\u0010!V{X;\u001a\u0003Y%,yK\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}\u001d\u0011w]G\u0011s9Lvp0L]>f_x\u001c\u0010!V{X;\u001a\u0003Y\u0017", "1kX2a;", "\u001anZ5g;I!b\\ve3;i+c\u000f2\tTV", "1n]3\\.+S%\u000fzl;]\u0005-t\n5\u0010", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015tq9\u0015ru,\u00010HPP\u0019\\^\u0003=\"!;\nL:\u0017\u0012m\u0017", "2`c.E,Jc\u0019\r\n?(z\u00189r\u0014", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015tq9\u0015ru-r6C9N8lR\u0001Lt\u000eX\u001dX8!Z", "1n]3\\.N`\u0015\u000e~h5\u000bs+r\u000e(\t", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018T1PMR.l_nL\u0018\u001cc\u001c9'\u001a\u0013YNy", "1n];X*MW*\u0003\nr\n\u007f\t-k\u007f5", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006t/>b}\u001eFq'2\\W\u0005T4-'rn?dm5Wv%VP_0kfP@\u0014\u0010`\u000e[\u0001", "\nh]6g\u0005", "uK^8[;M^fHXZ3\u0004G\u0010a}7\u0006M\u0015l}Ey\u0016\u0006u9>U\r-3k\u0016wIE;tCg\u0013riA\u0017l0Lr6KVWueR\u0002O\u001e\u001f`W[+\u0019\u0015YO38\"A(\t0Kn;t\u0011\f$\u001d\u0016fnQ`\u001d[O{sK12EmhuVNA`*.\ba\u001deI\u0004\"\u001ey!+qT,\u0006\u000bW\u001b{\u001c\u0003gvY#\b>mKmgVE}d\u0006S#.Ghw\u001eBX\u0003:U)\u0002C4CxZ2e\"F(w)5XP4\"4<\\;Mc~{\b\fr'i\u0018\u0017f3-(iol\u0012\u0018\u0007l)eBg)\u000e7`\u0011HR}\u0015p$\tK\\}\u0017\u0019\u0014 |iSL)?|'~D/5w\u0001\rna\u001bB\u001f9h\u001cd(_\u0001I\u0015\tqGUycK\u001dzQYkU{dWm3:\n\u0015X5|4<\u0006dM|\u0016s>\n\u0014~\u001b\u0003mS}E'\u0003(=W>bm\u0005NX", "3wT0h;>2\u0015\u000evK,\t\u0019/s\u000f", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018c'UWX5jR_=\"\"a\u001d$", "@d`BX:M", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}\u001d\u0011w]G\u0011s9Lvp&H](IR~M\u0014 ic", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u001f.\\UEx:g\u0014dp5\u0015m<[t'\u0011+J;X?rI$\u0012h\u001d$\u0012\u0013\u000fhH(w\u000e5)\u00156Y\u0011?q\u0001\u001a_k?s\u007fF_ C\t\u0019\u007fJ~,-^[\u000bC\u000bL^3fUI\u001aa:83i", "3wT0h;>1#\b{b.i\t;u\u007f6\u000b", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}\u001d\u0011w]G\u0011s9Lvp%VW-`T_= \"Z\u001c]\u0001", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u001f.\\UEx:g\u0014dp5\u0015m<[t'\u0011*X5]Vt*\u0014\u001ej\u000e\\:bk_K3uH@h\u00066V\fKw\u0005\u0015\u0016\u001c~HzKe\u0014P\n\u0011\u0005E3q\u001c\u001dF~CRA,1`\u0015afF7?$\u0012\u0001n", "6`]1_,+S'\n\u0005g:|", "@db=b5LS", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "1ta?X5MA\u0019\f\f^9[\u0005>a", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001T ,IJ)kA/\u0015u@5\u0016_\u0002", "3mS\u001db0Gb|\b{h", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class NetworkDataSourceImpl implements NetworkDataSource {
    private final Call.Factory client;
    private final ConfigRequestFactory configRequestFactory;
    private final ConfigurationsParser configurationsParser;
    private final NetworkConnectivityChecker connectivityChecker;
    private final DataRequestFactory dataRequestFactory;

    public NetworkDataSourceImpl(Call.Factory client, ConfigRequestFactory configRequestFactory, DataRequestFactory dataRequestFactory, ConfigurationsParser configurationsParser, NetworkConnectivityChecker connectivityChecker) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(configRequestFactory, "configRequestFactory");
        Intrinsics.checkNotNullParameter(dataRequestFactory, "dataRequestFactory");
        Intrinsics.checkNotNullParameter(configurationsParser, "configurationsParser");
        Intrinsics.checkNotNullParameter(connectivityChecker, "connectivityChecker");
        this.client = client;
        this.configRequestFactory = configRequestFactory;
        this.dataRequestFactory = dataRequestFactory;
        this.configurationsParser = configurationsParser;
        this.connectivityChecker = connectivityChecker;
    }

    private final ResponseResult handleResponse(Response response, LocalServerData localServerData, EndPointInfo endPointInfo) {
        long duration;
        if (ResponseResultKt.isTooManyRequest(response)) {
            String str = response.headers().get("Retry-After");
            Long longOrNull = str != null ? StringsKt.toLongOrNull(str) : null;
            if (longOrNull != null) {
                Duration.Companion companion = Duration.Companion;
                duration = DurationKt.toDuration(longOrNull.longValue(), DurationUnit.SECONDS);
            } else {
                duration = NetworkDataSourceImplKt.TOO_MANY_REQUESTS_DEFAULT_DELAY;
            }
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "erroneous response: too many requests; retry-after: " + longOrNull);
            return new ResponseResult.TooManyRequests(duration, null);
        }
        if (ResponseResultKt.isUnexpectedError(response)) {
            ResponseBody responseBodyBody = response.body();
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "erroneous response: unexpected response code: " + response.code() + "; body: " + (responseBodyBody != null ? responseBodyBody.string() : null));
            return ResponseResult.UnexpectedError.INSTANCE;
        }
        ResponseBody responseBodyBody2 = response.body();
        String strString = responseBodyBody2 != null ? responseBodyBody2.string() : null;
        if (strString == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "erroneous response: no body; response code: " + response.code());
            return ResponseResult.UnexpectedError.INSTANCE;
        }
        ServerDataUpdate serverDataUpdate = this.configurationsParser.parse$com_dynatrace_agent_release(strString, localServerData, endPointInfo);
        if (serverDataUpdate == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "erroneous config received: parsing error; response code: " + response.code() + "; body: " + strString);
            return ResponseResult.UnexpectedError.INSTANCE;
        }
        if (ResponseResultKt.isSuccess(response)) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "successful response: " + strString);
            return new ResponseResult.Success(serverDataUpdate);
        }
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "retrying due to erroneous response code: " + response.code() + "; body: " + strString);
        return new ResponseResult.Retry(String.valueOf(response.code()), serverDataUpdate);
    }

    @Override // com.dynatrace.agent.communication.network.datasource.NetworkDataSource
    public Object executeConfigRequest(ConfigRequest configRequest, Continuation<? super ResponseResult> continuation) {
        ResponseResult.RetryExecution retryExecution;
        try {
            if (this.connectivityChecker.currentNetworkState().isConnected()) {
                Call.Factory factory = this.client;
                Request requestCreateRequest = this.configRequestFactory.createRequest(configRequest);
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config request: " + requestCreateRequest);
                retryExecution = handleResponse(factory.newCall(requestCreateRequest).execute(), configRequest.getServerData(), configRequest.getEndPointInfo());
            } else {
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config request failed: no connectivity");
                retryExecution = new ResponseResult.RetryExecution("No internet connection");
            }
            return retryExecution;
        } catch (Exception e2) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config request failed with exception:", e2);
            return new ResponseResult.RetryExecution("unknown_error");
        }
    }

    @Override // com.dynatrace.agent.communication.network.datasource.NetworkDataSource
    public Object executeDataRequest(DataRequest dataRequest, Continuation<? super ResponseResult> continuation) {
        ResponseResult.RetryExecution retryExecution;
        try {
            if (this.connectivityChecker.currentNetworkState().isConnected()) {
                Call.Factory factory = this.client;
                Request requestCreateRequest = this.dataRequestFactory.createRequest(dataRequest);
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "data request: " + requestCreateRequest);
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "data request body: " + dataRequest.getBody());
                retryExecution = handleResponse(factory.newCall(requestCreateRequest).execute(), dataRequest.getServerData(), dataRequest.getEndPointInfo());
            } else {
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "data request failed: no connectivity");
                retryExecution = new ResponseResult.RetryExecution("No internet connection");
            }
            return retryExecution;
        } catch (Exception e2) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "data request failed with exception:", e2);
            return new ResponseResult.RetryExecution("unknown_error");
        }
    }
}
