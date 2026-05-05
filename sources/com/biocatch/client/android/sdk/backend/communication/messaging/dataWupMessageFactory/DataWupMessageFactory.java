package com.biocatch.client.android.sdk.backend.communication.messaging.dataWupMessageFactory;

import com.biocatch.android.commonsdk.collection.Group;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.backend.DataItem;
import com.biocatch.client.android.sdk.backend.communication.ClientSessionState;
import com.biocatch.client.android.sdk.backend.communication.ITransmissionResultListener;
import com.biocatch.client.android.sdk.backend.communication.WupJsonAppender;
import com.biocatch.client.android.sdk.backend.communication.messaging.Compressor;
import com.biocatch.client.android.sdk.backend.communication.messaging.DataSerializer;
import com.biocatch.client.android.sdk.backend.communication.messaging.wupMessages.ClientFlushDataWupMessage;
import com.biocatch.client.android.sdk.backend.communication.messaging.wupMessages.DataWupMessage;
import com.biocatch.client.android.sdk.backend.communication.messaging.wupMessages.SDKFlushDataWupMessage;
import com.biocatch.client.android.sdk.core.Constants;
import io.sentry.protocol.Device;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bKƤ\u000e\u0016\u0007\u00074Ikxe܈\u00172P{G\u074cUoK@hҚ<ӌ6݅R8(\u0004A=:L\u001ev\u0013Cy\r\"4NrRR;P\u0015\u001e \nV /#lk\\<`l\fAǥ'\u0003wJ\u0017Sm9\u0015M;P\u0005+\u001b\u0002y\u001eYLg9#2k\u00035`\fC\u0011N\n=3xW19Z\f]FZ\u0010\u0014C>}\u001f$\u0007nx\u0013ex\fU@\u007fmYa&.\b|\f\rj\u0017<\u0018WL<C2f6%ytC_NR\u001a^p\u0003Qʫ8а)\u007f;ٿ\n'tQy;GO\u000eީ\u0007ڟ\"#\t͙qgb\u0014x\u0015I[NΆ3ҨD=PݐZeKq\u001cp\u0011\u0007\u0001ʹ2Ͻ\u0004/\u0004߾ѭ\u001b="}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$\rJ:\tviL\fnRE\u001b\n,*}9w\u000b\u0019*W\u0014f\u007f>H Ra\u0015\u0004O%jF:[wVKRv\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$\rJ:\tviL\fnRE\u001b\n,*}9w\u000b\u0019*W\u0019IlQR\u0002W\u0005|uO7dHY@uEPOo>:", "1n\\=e,La#\f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$kX3\u0018\u0012YO2xQ\r", "1kX2a;,S'\r~h5j\u0018+t\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011*U0\\[\u0002+\u0014 h\u0012X4z\u0014UP$D", "Et_\u0017f6G/$\nzg+|\u0016", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011>^7A`|Fo\u001de\u000eW*\r\u0012/", "2`c.F,KW\u0015\u0006~s,\n", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$lJ:\trYN(jK;4\b9\u001f", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i4i\u00144ML:52(\u001dpqB\u000ba(]z1P\u0016V,j`n?\u0018\u001b\\W,5\u0015\u0010fA2|NDtn*S\n\u0005e\u0005\u0016\u0014\nDhs\fT\u0017Ky\u001e\u0005\u000b%qEfi}F\u000bSa0.\t[\u001bb:C#]o##p`7\u000eyO v\\\u00031EN\u001dzA3,miTIy^*\u0004#.KQ^\u0010<`>(x7\u0002094gNIn\u001c>g\b^(e@40:;\\MJi?i:\fn\u001fj\u0007W`?9!ungF\u000b\u0016a!d~So\f\u001c`\u0010G%z 'O}BhO{\u0007\u0011,7bMM\u0019P\u0010\u0018s\u000e f\u0015\u0003\fua\u00187\u0015Jc\u0013gsm6S\\\u0006d6\u0012{bB^nR\u0018u[{_Uk3:\u0003\u001a\u0013)3YJrTGx\u0012_\u0013|\u001az\u000bsvFu=\u0017:%J/{S", "1qT.g,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$ ^6t\u0005gO pDEhf(X}-x\fs\u0016\u001cCfrB,", "2`c.J<I;\u0019\r\tZ.|wCp\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$\rJ:\tviL\fnRE\u001b\n,*}9w\u000b\u0019*W\u0014f\u007f>H Ra\u0015\u0004O%jFHs\u0005G\u0017", "2`c.J<I;\u0019\r\tZ.|v?bn<\u0007@", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$\rJ:\tviL\fnRE\u001b\n,*}9w\u000b\u0019*W\u0019IlQR\u0002W\u0005|uO7dHYM\nD0Ym*:", "@dbB_;!O\"}\u0002^9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00110=9X[\u0001E\u0018 h\u0012X4y\u0005gQ+}+;-\u0017,R\u0002H>", "2`c.", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005J0-\u0011Lp9\u000f9", "5dc\u0010b4I`\u0019\r\t^+n\u0019:D{7w", "", "@d`BX:M7w", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DataWupMessageFactory implements IDataWupMessageFactory {
    private final ClientSessionState clientSessionState;
    private final Compressor compressor;
    private final DataSerializer dataSerializer;
    private final WupJsonAppender wupJsonAppender;

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataWupMessageType.values().length];
            iArr[DataWupMessageType.DATA_WUP_MESSAGE.ordinal()] = 1;
            iArr[DataWupMessageType.FLUSH_DATA_WUP_MESSAGE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DataWupMessageFactory(Compressor compressor, ClientSessionState clientSessionState, WupJsonAppender wupJsonAppender, DataSerializer dataSerializer) {
        Intrinsics.checkNotNullParameter(compressor, "compressor");
        Intrinsics.checkNotNullParameter(clientSessionState, "clientSessionState");
        Intrinsics.checkNotNullParameter(wupJsonAppender, "wupJsonAppender");
        Intrinsics.checkNotNullParameter(dataSerializer, "dataSerializer");
        this.compressor = compressor;
        this.clientSessionState = clientSessionState;
        this.wupJsonAppender = wupJsonAppender;
        this.dataSerializer = dataSerializer;
    }

    private final String getCompressedWupData(Collection<DataItem> collection, long j2) throws JSONException {
        JSONObject jSONObjectSerialize = this.dataSerializer.serialize(collection);
        this.wupJsonAppender.appendData(jSONObjectSerialize, "requestID", Long.valueOf(j2), Group.STATIC);
        Log.Companion.getLogger().debug("Appending brand to static data");
        this.wupJsonAppender.appendData(jSONObjectSerialize, Device.JsonKeys.BRAND, this.clientSessionState.getBrand(), Group.STATIC);
        this.wupJsonAppender.appendData(jSONObjectSerialize, Constants.LEAN_VERSION, this.clientSessionState.getLeanVersion(), Group.STATIC);
        return this.compressor.compressToString(jSONObjectSerialize);
    }

    @Override // com.biocatch.client.android.sdk.backend.communication.messaging.dataWupMessageFactory.IDataWupMessageFactory
    public DataWupMessage create(DataWupMessageType dataWupMessageType, IDataWupMessageSubType dataWupMessageSubType, ITransmissionResultListener resultHandler, Collection<DataItem> data) throws JSONException {
        Intrinsics.checkNotNullParameter(dataWupMessageType, "dataWupMessageType");
        Intrinsics.checkNotNullParameter(dataWupMessageSubType, "dataWupMessageSubType");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        Intrinsics.checkNotNullParameter(data, "data");
        long andIncrementRequestID = this.clientSessionState.getAndIncrementRequestID();
        String compressedWupData = getCompressedWupData(data, andIncrementRequestID);
        String muid = this.clientSessionState.getMuid();
        String csid = this.clientSessionState.getCsid();
        String agentType = this.clientSessionState.getAgentType();
        int i2 = WhenMappings.$EnumSwitchMapping$0[dataWupMessageType.ordinal()];
        if (i2 == 1) {
            return new DataWupMessage(andIncrementRequestID, "android", muid, this.clientSessionState.getContextName(), this.clientSessionState.getServerSession(), csid, agentType, compressedWupData, resultHandler, false, 512, null);
        }
        if (i2 == 2) {
            return dataWupMessageSubType == FlushDataWupMessageSubType.SDK_FLUSH_DATA_WUP_MESSAGE ? new SDKFlushDataWupMessage(andIncrementRequestID, "android", this.clientSessionState.getMuid(), this.clientSessionState.getContextName(), this.clientSessionState.getServerSession(), this.clientSessionState.getCsid(), this.clientSessionState.getAgentType(), compressedWupData, resultHandler) : new ClientFlushDataWupMessage(andIncrementRequestID, "android", this.clientSessionState.getMuid(), this.clientSessionState.getContextName(), this.clientSessionState.getServerSession(), this.clientSessionState.getCsid(), this.clientSessionState.getAgentType(), compressedWupData, resultHandler);
        }
        throw new NoWhenBranchMatchedException();
    }
}
