package com.biocatch.client.android.sdk.backend.communication.messaging.wupMessages;

import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.backend.communication.ITransmissionResultListener;
import com.biocatch.client.android.sdk.backend.communication.ServerSession;
import com.biocatch.client.android.sdk.backend.communication.messaging.Message;
import com.biocatch.client.android.sdk.core.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLш|\u0004O\r8é6B\r.4\u0012}\bnjO0LeN/ZS@\u000fs{:$c$\bCCU ~*\t]WogtLb\u000bQ\u000f\u000e\u0016~j4Icތe\u0012\u00152H\u000eU\u074c}ok8!>F\t.2:8(\u0006\u0011\u001e8J(v)F[\u0012 4XrPQ;P\u0015  \u000bV\"\u0017\u001d\u000bj^:Vru:]*\u0013oPV?aF{{\u0010VX5\u0016\u000faL.P;C\u001f=S1\u0012қ_?\u0011K:C\u0013}?'YL:k~s\u000e*-+}$\u000ev4t\u001dQ\u000f\u000fW/]|cP<B>\u07beԫ\u0011<\n)V3V;E\u001a\u0015\u0016dޚvɤW@X\u061c/Q\u000e\u0001y6E,ő71Aӕ~SgJ'^\b\u000e\u0013\u001e6#/\u0001wƓ\u0017\u05f8d\u001b#Ƙ\u0010S7dNQ˙R&"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$ ^6t\u0005gO pDEhy<Ti;v\u000f\b\u0018\u000e\u000b", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$uN9\u001b\u0001[Ay", "7c", "", "2de6V,,])\fx^", "", ";tX1", "1n]AX?M<\u0015\u0007z", "AdaCX9,S'\r~h5", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011:N9mR\u007f+\u0014 h\u0012X4b", "1rX1", "/fT;g\u0010=", "@dbB_;!O\"}\u0002^9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00110=9X[\u0001E\u0018 h\u0012X4y\u0005gQ+}+;-\u0017,R\u0002H>", "uI;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PQ;[z0I\"5*fZ<:\u0018\u001cX\n])\u0010NWH(nMFh\u00045H\u000fEl\u007fU$\r;4m>T\u0016G\u0003\u0014??3pNih}E=Tf4mUM\u001diK:1\u0002q')lZ7_bX\r\u0004NCncP\u001bD&3KqdH\u001bVZ8\u0006#hRw\u0001\u0014{F\u00048x6\u0006\n\u00114n\r\u0015d\u001cH\\t$*_\u000b%-:<\u001cN\u0015_~kK\u0018l\u001e+\u0016\rh~.\u0015ckcQ\u000eP[!c=qh\u00055N\u0015BSx^\u000b5\f>d\b\u001d\r\u00152qoR0\u001bb\u0011!\u007f+&m \u0003\ff%qq\u0007", "8r^;B)CS\u0017\u000e", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "5dc X9OS&lzl:\u0001\u00138", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001j\u0012,SCDj}\u001c\u001fpiI\u0010g*J\u0006+QU\u0018\u001a\\_\u0004=!\u007fZ\u001c\\/\u0017\u000e/", "Adc X9OS&l\nZ;|s+r{0{O\u0001$%", "", "5dc X;,S&\u0010zk\u001a\f\u0005>ej$\t<\t\u0017&G|\u001c", "u(I", "5dc\u0013b9FO(\u000ez]", "Adc\u001dT9:[", "", "9dh", "D`[BX", "", "Adc\u001dT9:[W\ryd&J\u0003|_J\"O\u000eQ\u0011$Gv\u000e8\u0005%", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class WupMessage extends Message {
    private final JSONObject jsonObject;
    private final ServerSession serverSession;
    private final boolean setServerStateParameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WupMessage(long j2, String deviceSource, String str, String str2, ServerSession serverSession, String str3, String agentId, ITransmissionResultListener resultHandler) {
        super(resultHandler);
        Intrinsics.checkNotNullParameter(deviceSource, "deviceSource");
        Intrinsics.checkNotNullParameter(serverSession, "serverSession");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        this.serverSession = serverSession;
        this.jsonObject = new JSONObject();
        this.setServerStateParameters = true;
        setParam$sdk_3_3_0_936_release(Constants.REQUEST_ID_META_FIELD, Long.valueOf(j2));
        setParam$sdk_3_3_0_936_release(Constants.DEVICE_SOURCE_META_FIELD, deviceSource);
        if (str != null) {
            setParam$sdk_3_3_0_936_release(Constants.MUID, str);
        }
        if (str2 != null) {
            setParam$sdk_3_3_0_936_release(Constants.CONTEXT_NAME_META_FIELD, str2);
        }
        if (str3 != null) {
            setParam$sdk_3_3_0_936_release(Constants.CSID, str3);
        }
        setParam$sdk_3_3_0_936_release(Constants.AGENT_TYPE, agentId);
    }

    @Override // com.biocatch.client.android.sdk.backend.communication.messaging.Message
    public String getFormatted() {
        if (getSetServerStateParameters()) {
            String sid = this.serverSession.getSid();
            if (sid != null) {
                setParam$sdk_3_3_0_936_release(Constants.SID, sid);
            }
            String sts = this.serverSession.getSts();
            if (sts != null) {
                setParam$sdk_3_3_0_936_release(Constants.STATIC_SERVER_STATE, sts);
            }
            String std = this.serverSession.getStd();
            if (std != null) {
                setParam$sdk_3_3_0_936_release(Constants.DYNAMIC_SERVER_STATE, std);
            }
            String ott = this.serverSession.getOtt();
            if (ott != null) {
                setParam$sdk_3_3_0_936_release(Constants.OTT, ott);
            }
            String agentId = this.serverSession.getAgentId();
            if (agentId != null) {
                setParam$sdk_3_3_0_936_release(Constants.AGENT_ID, agentId);
            }
        }
        String string = this.jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "this.jsonObject.toString()");
        return string;
    }

    public final ServerSession getServerSession() {
        return this.serverSession;
    }

    public boolean getSetServerStateParameters() {
        return this.setServerStateParameters;
    }

    public final void setParam$sdk_3_3_0_936_release(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            this.jsonObject.putOpt(key, value);
        } catch (JSONException unused) {
            Log logger = Log.Companion.getLogger();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("error adding field %s to wup", Arrays.copyOf(new Object[]{key}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            logger.error(str);
        }
    }
}
