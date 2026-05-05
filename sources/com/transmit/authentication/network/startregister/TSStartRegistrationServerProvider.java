package com.transmit.authentication.network.startregister;

import android.content.Context;
import com.transmit.authentication.gen.WebAuthnPocModule;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.TSCall;
import com.ts.coresdk.TSCallback;
import com.ts.coresdk.TSLog;
import com.ts.coresdk.TSNetworkManager;
import com.ts.coresdk.TSNetworkResponse;
import com.ts.coresdk.controllers.TSDataSyncServer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG<LeN2ZS8\u000fsڔ<$iByCAU\"}8\tWȞog\u0005Jb\u000bI\u0013\u001cǝ)v<Kex\f\u0012\u001f4Rom4{nu9w\rv\u0018060:\u0012\u0005/\u001d:L\u001ez\u0013Cy\u0011ܘ4@~@\u001b3[\u00102\u00124JP\u000b,i\u007fTFJ|]h/Q\u0011\u001aH\\6w2\u0013L;G\u0005+\u001b\u0007y\u001eYQ}I]Sa\u000e\u001fR\nK3I\u007fJ\u001dn7);I\"Wdf0\u001a#=g\u000fsqTo5Wn\u001b?-ebyQ>,\u0006\u000b\u0014\rj\u0015V&5SF-Hr8\u0012A\t\u000bSnP2dP\u0015\u0013cL\u0016S\u0001c/G1~Q\u0010L_b\b\u000b\u0013\u000f6#/qĲ_Z\u0016֫-\u001dZ~_9\"OKLf\n\bBъ\bvj̣B\u00066P\u000e9ɮ\u0015G"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu=d\u0015VH[;IRtA\"!g\n]/\u0017\u000eGA1\u007fDD\n\u00156Z\u0006:h\u000ea", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\n1\u000bM\u000b\u001e\u001eG|\u001c\u0006e\u0013\u0014U\r\u001c%\u0002\u001f,;CH|4+j", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu=d\u0015VH[;IRtA\"!g\n]/\u0017\u000eGA1\u007fDD\n\u00156Z\u0006:h\u000eJy|#X\u007f>c\u001f4y\u0017yO8hSG_\u0007XAR@&k\u0013\\\u0019Z@\u0010", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "AdaCX9.` ", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6sXY", "5dc\u0010b5MS,\u000e", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "5dc X9OS&n\be", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Ad]17(MO\b\th^9\u000e\t<", "", "2`c.?0Lb", "", "1`[9U(<Y", ";nSB_,\"\\\u001a\t", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", ">`h9b(=", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", ">/", ">0", ">1", "\u0017SB g(Kb\u0006~|b:\f\t<S\u007f5\r@\u000et\u0013Nv\u000b8t+", "\"RBAT9M/)\u000e}:7\u0001v/r\u0011,y@", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class TSStartRegistrationServerProvider implements TSDataSyncServer<JSONObject, ITSStartRegisterServerCallback> {
    private final Context context;
    private final String serverUrl;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4\u0012}\u0007njG<LeN.ZS@\u000fsڔ:\tqҕ\"CiTb\u00100\tgN\u0016h\u001fRh\r[\u0013\u0016\u0016~kZL\u001c\u001d&6\u001d6Zom4}uK>xvL\u0004N8R>\b\f\u0019\u001c@G>|+IY\u0014*2Voh[Sqő\u001e\u001c"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu=d\u0015VH[;IRtA\"!g\n]/\u0017\u000eGA1\u007fDD\n\u00156Z\u0006:h\u000eJy|#X\u007f>c\u001f4y\u0017yO8hSG_\u0007XAR@&k\u0013\\\u0019Z@\u0010", "", "=m4?e6K", "", "@db=b5LS", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}u", "=mBBV*>a'", "0h]1\\5@B#\u0005z", "", "EdQ\u000eh;A\\\u0007~\tl0\u0007\u0012\u0013D", "1qT1X5MW\u0015\u0006Xk,x\u00183o\t\u0012\u0007O\u0005! U", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu,\u0004'FLW;`Ny\u001b!\u0012V\u001dR5\u0016ndP(xMEt", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public interface ITSStartRegisterServerCallback {
        void onError(TSNetworkResponse<?> tSNetworkResponse);

        void onSuccess(String str, String str2, CredentialCreationOptions credentialCreationOptions);
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑ?\u0010Z͜x.\u0001Rr%y{L*k&\u0002CiWH~R\u000fUMuj\u0007J\t\u000f\n4َ\u001a}"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu=d\u0015VH[;IRtA\"!g\n]/\u0017\u000eGA1\u007fDD\n\u00156Z\u0006:h\u000eJ\u0005{#ylOekW\t\u0018QL-VFfp}EA\u001b", "", "Ad]1F;:`(kz`0\u000b\u0018<a\u000f,\u0006I", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0006wG\bl", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu=d\u0015VH[;IRtA\"!g\n]/\u0017\u000eFA2yN@-\b\u0002", ">`h9b(=", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu<\u0006#T[;,^V\u0001L!\u000ei\u0012X4w\u0001mH.jC\r", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public interface TSStartAuthApiService {
        @InterfaceC1492Gx
        @Headers({"KVX]IQZ\u0012TXRF\u0016z?Mhcc\\Ug_d^\u001e\\d[Y"})
        @POST("\u0016\u001b(b%^_\u00110.%j.\u001b\u001b\u001986-2m0&'4=A19t<<4DI")
        TSCall<TSStartRegistrationResponse> sendStartRegistration(@Body StartRegistrationPayload startRegistrationPayload);
    }

    public TSStartRegistrationServerProvider(Context context, String serverUrl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        this.context = context;
        this.serverUrl = serverUrl;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getServerUrl() {
        return this.serverUrl;
    }

    @Override // com.ts.coresdk.controllers.TSDataSyncServer
    public void sendDataToServer(List<? extends JSONObject> dataList, ITSStartRegisterServerCallback iTSStartRegisterServerCallback, ITSModuleInfo moduleInfo) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(moduleInfo, "moduleInfo");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public final void sendDataToServer(List<? extends JSONObject> dataList, Object obj, final ITSStartRegisterServerCallback iTSStartRegisterServerCallback, ITSModuleInfo moduleInfo) {
        TSCall<TSStartRegistrationResponse> tSCallSendStartRegistration;
        Unit unit;
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(moduleInfo, "moduleInfo");
        try {
            TSStartAuthApiService tSStartAuthApiService = (TSStartAuthApiService) TSNetworkManager.create$default(TSNetworkManager.INSTANCE, this.context, new WebAuthnPocModule(), this.serverUrl, null, TSStartAuthApiService.class, false, null, 64, null);
            if (tSStartAuthApiService == null) {
                tSCallSendStartRegistration = null;
            } else {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.transmit.authentication.network.startregister.StartRegistrationPayload");
                }
                tSCallSendStartRegistration = tSStartAuthApiService.sendStartRegistration((StartRegistrationPayload) obj);
            }
            if (tSCallSendStartRegistration == null) {
                unit = null;
            } else {
                tSCallSendStartRegistration.enqueue(new TSCallback<TSStartRegistrationResponse>() { // from class: com.transmit.authentication.network.startregister.TSStartRegistrationServerProvider.sendDataToServer.1
                    @Override // com.ts.coresdk.TSCallback
                    public void error(TSNetworkResponse response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        TSLog.e$default(TSStartRegistrationServerProvider.this.getContext(), new WebAuthnPocModule(), "@@@ Server response: " + response, null, 8, null);
                        ITSStartRegisterServerCallback iTSStartRegisterServerCallback2 = iTSStartRegisterServerCallback;
                        if (iTSStartRegisterServerCallback2 == null) {
                            return;
                        }
                        iTSStartRegisterServerCallback2.onError(response);
                    }

                    @Override // com.ts.coresdk.TSCallback
                    public void success(TSNetworkResponse<? extends TSStartRegistrationResponse> response) {
                        List<String> list;
                        Intrinsics.checkNotNullParameter(response, "response");
                        TSLog.d(TSStartRegistrationServerProvider.this.getContext(), new WebAuthnPocModule(), "@@@ Server response: " + response);
                        if (!(response instanceof TSNetworkResponse.Success)) {
                            ITSStartRegisterServerCallback iTSStartRegisterServerCallback2 = iTSStartRegisterServerCallback;
                            if (iTSStartRegisterServerCallback2 == null) {
                                return;
                            }
                            iTSStartRegisterServerCallback2.onError(response);
                            return;
                        }
                        TSNetworkResponse.Success success = (TSNetworkResponse.Success) response;
                        Map<String, List<String>> responseHeaders = success.getResponseHeaders();
                        String str = (responseHeaders == null || (list = responseHeaders.get("set-device-binding-token")) == null) ? null : list.get(0);
                        ITSStartRegisterServerCallback iTSStartRegisterServerCallback3 = iTSStartRegisterServerCallback;
                        if (iTSStartRegisterServerCallback3 == null) {
                            return;
                        }
                        TSStartRegistrationResponse tSStartRegistrationResponse = (TSStartRegistrationResponse) success.getBody();
                        String webauthn_session_id = tSStartRegistrationResponse == null ? null : tSStartRegistrationResponse.getWebauthn_session_id();
                        TSStartRegistrationResponse tSStartRegistrationResponse2 = (TSStartRegistrationResponse) success.getBody();
                        iTSStartRegisterServerCallback3.onSuccess(str, webauthn_session_id, tSStartRegistrationResponse2 != null ? tSStartRegistrationResponse2.getCredential_creation_options() : null);
                    }
                });
                unit = Unit.INSTANCE;
            }
            if (unit != null || iTSStartRegisterServerCallback == null) {
                return;
            }
            iTSStartRegisterServerCallback.onError(new TSNetworkResponse.UnknownError(null, new Exception("Internal error")));
        } catch (Throwable th) {
            if (iTSStartRegisterServerCallback == null) {
                return;
            }
            iTSStartRegisterServerCallback.onError(new TSNetworkResponse.UnknownError(null, th));
        }
    }

    @Override // com.ts.coresdk.controllers.TSDataSyncServer
    public void sendDataToServer(JSONObject p02, ITSStartRegisterServerCallback iTSStartRegisterServerCallback, ITSModuleInfo p2) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p2, "p2");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
