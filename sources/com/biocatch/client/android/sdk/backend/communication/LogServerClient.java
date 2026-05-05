package com.biocatch.client.android.sdk.backend.communication;

import com.biocatch.client.android.sdk.backend.communication.messaging.LogMessage;
import com.biocatch.client.android.sdk.backend.communication.messaging.LogMessageBuilder;
import com.biocatch.client.android.sdk.backend.communication.messaging.Message;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njO0LeN.ZS8\u000fs{:%aҕ\bّk[*\u007f2\t}N\u0016f'IdK\\\u001f\n$y\u0003,wW\tg \u0012JH\u007fACM\u001eBgdҽ:\u0005.8jF\b\f\u0019\u001aXP@z\tLc\f@0\u0007\u0005\u000b^\u001bN\u001d\u001a@\b\u0015ī\u0003ɉ`gVȤ\u0019~k=G)\u0013kRNUd^\u0001$θHù+\r~ѭԅ/K"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00113X.JR\u007fN\u0014\u001f8\u0015R+\u0016\u0014/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00110-(kN`=\u001d\u0011Z\u001b$", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", ":nV\u001aX:LO\u001b~Wn0\u0004\b/r", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$tX-t\u0005gO pD\u0014/\f3H\u0002H>", "BqP;f4Bb(~\b", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011;[(e`zA#!Z\u001b$", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$tX-t\u0005gO pD\r", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i4i\u00144ML:52(\u001dpqB\u000ba(]z1P\u0016V,j`n?\u0018\u001b\\W55\u000flYO2jF7{\u00180P\u0001;uVr\u0014\u0018=4mF`\u000eC\t\u0013x\u000b'oJYh\t\u0011=Na7n\u0010^fj9@m\u0011m\u0017!hY-Sy]\u0019zb\u0003keC(~B-\b\\hBN}]@\u00046\u001fXQ;\u0003", "Ad]17(MO", "", "2`c.", "\u001anV!e(Ga!\u0003\tl0\u0007\u0012\u001ce\u000e3\u0006I\u000f\u0017}K}\u001d<\u007f%B", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LogServerClient implements IDataSender<JSONArray> {
    private final LogMessageBuilder logMessageBuilder;
    private final Transmitter<LogMessage> transmitter;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\":\u001e\u007f\u0007lkA0ZeP\u008cXݺ,%ӆ,4RZdtٴ?U(}j\u0017]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'nr]\u001e\u000fk\u0017'2pqo7[uU9\u000fxf\t.9:8(\rG.ݻL\u0019"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00113X.JR\u007fN\u0014\u001f8\u0015R+\u0016\u0014\u0018(.p3D\u001b\u0011:Q\u0006Iv\u0005\u0016\u001fz5x{L_\u001eG`\u0019\u0004P)qFf5", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00110=9X[\u0001E\u0018 h\u0012X4y\u0005gQ+}+;-\u0017,R\u0002H>", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i4i\u00144ML:52(\u001dpqB\u000ba(]z1P\u001656^@rJ%\u0012gkU/\r\u000eh\u0017g_", "=m4?e6K", "", "3qa<e", "", "=mBBV*>a'", "@db=b5LS", ";db@T.>", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$uN9\u001b\u0001[Ay", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    private final class LogTransmissionResponseListener implements ITransmissionResultListener {
        public LogTransmissionResponseListener() {
        }

        @Override // com.biocatch.client.android.sdk.backend.communication.ITransmissionResultListener
        public void onError(String error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.biocatch.client.android.sdk.backend.communication.ITransmissionResultListener
        public void onSuccess(String response, Message message) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public LogServerClient(LogMessageBuilder logMessageBuilder, Transmitter<LogMessage> transmitter) {
        Intrinsics.checkNotNullParameter(logMessageBuilder, "logMessageBuilder");
        Intrinsics.checkNotNullParameter(transmitter, "transmitter");
        this.logMessageBuilder = logMessageBuilder;
        this.transmitter = transmitter;
    }

    @Override // com.biocatch.client.android.sdk.backend.communication.IDataSender
    public void sendData(JSONArray data) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length() == 0) {
            throw new InvalidOperationException("Json Object contains no data. Unable to send logs data.");
        }
        this.transmitter.enqueue(this.logMessageBuilder.build(new LogTransmissionResponseListener(), data));
    }
}
