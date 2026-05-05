package com.biocatch.client.android.sdk.backend.communication;

import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.android.commonsdk.wrappers.JsonFactory;
import com.biocatch.client.android.sdk.backend.communication.messaging.wupMessages.WupMessage;
import com.biocatch.client.android.sdk.backend.events.BackendConfigurationLoadedEvent;
import com.biocatch.client.android.sdk.backend.events.BackendNewSessionStartedEvent;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{B$cҕyCIa\"Ԃ*\teNo˧vJh\u0014KƤ\fǝ\u000f̓\\I\u0004w\u001e5\u001f6PoW3{pM=nvN\u0005N52<\b\t\u0019\u001aXM z\tIc\f@7Ϯt:`\u0015\u0016!(\u001b\u001e>N\u000bN`uYNH\u001bij31\u0010\u0002B|5\u00104\u000b\\%F\u00037]\u0003o\u001eC@e6kǯUΫ\u000bRcΪSK\u007fC\u001dhU.\u0002ɡuɱ:X\bϬe7]\u000furT_[ĬbВ++WҪ\u001c\\\u001c,\u0010z*\u0012\u0013ǌ\u0010Ν+H6Ʀըj\u0019"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011>^7IR\u0001H\u001e\u001bh\u000e98\u0017\u0003YO2xQ\r", "", "1kX2a;,S'\r~h5j\u0018+t\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011*U0\\[\u0002+\u0014 h\u0012X4z\u0014UP$D", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "8r^;9(<b#\f\u000f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0010-3x!.ZQ\u0005PB(\u001eI]7\u0016m9bL", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i4i\u00144ML:52(\u001dpqB\u000ba(]z1P\u0016,3`R{L\u0002\u0012h\u001cR5\u0016rh=3n\u001a\u001e\u001d\u00124\u0013~?r~\b%\f84lKU\u001dQ}\u0014??3pNch\bFG\u000fq*b\u000fh!Z6A\u0012\u0014~*\u001ffP<S{d\u0011{a\b1GX\u0019\u0004G\u0001N{IFR\u0001Y:t|\u0006I\u0006\u007f[/\\~)p<\u00027s2m\u0004Xq\u001c=(v\u001f4dK045B\\QX_\u0001w>\u001bvhF\u0016\u0018k\u0016-\u0017top\\dm[!c~^c\u000b5N\u0015<L9\u00110E\fL_x^\u0007\u0011,uoRQ\u001aZJ\u0018zM#c\u0013\u0013\u0010b' 8\u001f\u00077\u0019q+c9] \u0005w<\u0016\u0005FC zV\u0014|U\u007fo-3\u0015", ">q^0X:L", "", "@db=b5LS", "", "Et_\u001aX:LO\u001b~", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$ ^6t\u0005gO pDEhy<Ti;v\u000f\b\u0018\u000e\u000b", ">q^0X:L1#\b{b.\r\u0016+t\u00042\u0005N", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WupResponseProcessor {
    private final ClientSessionState clientSessionState;
    private final ConfigurationRepository configurationRepository;
    private final EventBusService eventBusService;
    private final JsonFactory jsonFactory;

    public WupResponseProcessor(ClientSessionState clientSessionState, EventBusService eventBusService, JsonFactory jsonFactory, ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(clientSessionState, "clientSessionState");
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.clientSessionState = clientSessionState;
        this.eventBusService = eventBusService;
        this.jsonFactory = jsonFactory;
        this.configurationRepository = configurationRepository;
    }

    public final void process(String response, WupMessage wupMessage, boolean z2) {
        Log logger;
        String str;
        boolean z3;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(wupMessage, "wupMessage");
        try {
            JSONObject json = this.jsonFactory.parseJson(response);
            boolean z4 = true;
            if (z2) {
                try {
                    this.configurationRepository.mergeWithNativeConfigurations(response);
                    this.clientSessionState.markConfigurationReceived();
                    z3 = true;
                } catch (Exception e2) {
                    e = e2;
                    logger = Log.Companion.getLogger();
                    str = "Failed to process configurations from server.";
                    logger.error(str, e);
                    return;
                }
            } else {
                z3 = false;
            }
            String strOptString = json.optString(com.biocatch.client.android.sdk.core.Constants.STATIC_SERVER_STATE);
            if (strOptString != "") {
                wupMessage.getServerSession().setSts(strOptString);
            }
            String strOptString2 = json.optString(com.biocatch.client.android.sdk.core.Constants.DYNAMIC_SERVER_STATE);
            if (strOptString2 != "") {
                wupMessage.getServerSession().setStd(strOptString2);
            }
            ServerSession serverSession = wupMessage.getServerSession();
            String strOptString3 = json.optString(com.biocatch.client.android.sdk.core.Constants.OTT);
            if (strOptString3.length() == 0) {
                strOptString3 = null;
            }
            serverSession.setOtt(strOptString3);
            String strOptString4 = json.optString(com.biocatch.client.android.sdk.core.Constants.AGENT_ID);
            String str2 = strOptString4.length() != 0 ? strOptString4 : null;
            if (str2 != null) {
                wupMessage.getServerSession().setAgentId(str2);
            }
            String newSid = json.optString("new_sid");
            if (newSid != "") {
                wupMessage.getServerSession().setSid(newSid);
            } else {
                z4 = false;
            }
            if (json.has(ConfigurationFields.nextWupInterval)) {
                int iOptInt = json.optInt(ConfigurationFields.nextWupInterval);
                if (iOptInt > 0) {
                    this.configurationRepository.set(ConfigurationFields.dataHarvesterInterval, iOptInt);
                } else {
                    Log.Companion.getLogger().warning("Wup dispatch rate of " + iOptInt + " is invalid. Ignoring update");
                }
            }
            if (z3) {
                this.eventBusService.publish(new BackendConfigurationLoadedEvent());
            }
            if (z4) {
                EventBusService eventBusService = this.eventBusService;
                Intrinsics.checkNotNullExpressionValue(newSid, "newSid");
                eventBusService.publish(new BackendNewSessionStartedEvent(newSid));
            }
        } catch (JSONException e3) {
            e = e3;
            logger = Log.Companion.getLogger();
            str = "Failed to parse message from server.";
        }
    }
}
