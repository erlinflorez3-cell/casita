package com.valid.vssh_bio_validation_library.manager.derive;

import com.valid.communication.events.BaseErrorEvent;
import com.valid.communication.events.BaseSuccessEvent;
import com.valid.communication.managers.communicationmanager.CommunicationManager;
import com.valid.communication.managers.communicationmanager.CommunicationManagerCallback;
import com.valid.communication.models.BaseModelResponse;
import com.valid.communication.models.ErrorData;
import com.valid.vssh_bio_validation_library.utils.model.VsshCommunicationRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я!\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jAӄld߉4Ziճ?k*3li2q[;\u0004\u001b.&\u0017Qfg\u0016q\u0011ZSS\u001d\n.x\u0019-y[\u0007a*\u0011HA\u001eBya8MGe\r63!b(F~\u001d\u00030)v\u0016=\u000fŸO\u0013ܮ4ϋ"}, d2 = {"1n\\{i(EW\u0018H\fl:\u007f\u0003,i\n\"\r<\b\u001b\u0016C~\u0012F\u007f\u001f<]z-3z*wU?Dg6\u001e\"2`9\u0014g=N@\u0006GYR=\\:nF\u0010\u0014Z\u001b23\u0018CWK-|T?\u001fx:W\u0005)h\u000e\u001d\u001a\f5)<\u0001T\fN\u0001\u0012q?/'\u0012", "\u001ab^:\"=:Z\u001d}D\\6\u0005\u0011?n\u0004&wO\u0005! \u0011w\nEr'5f\fi5w\u001e6]L?i0-\u0019rjA\u0003l(Pv4\u0011*X4db{A\u0012\u000ei\u0012X4t\u0001b=&nQ\u0015\u001b\u000f3F}9nV", "1`[98?<V\u0015\b|^\u0012|\u001d", "", "3uT;g", "\u001ab^:\"=:Z\u001d}D\\6\u0005\u0011?n\u0004&wO\u0005! \u0011o\u001f<\u007f4C#Z\u001cEmu;ZMHKE\u001e\u001ew7", "3qa<e\fOS\"\u000e", "AtR0X:L3*~\u0004m", "\u001ab^:\"=:Z\u001d}D\\6\u0005\u0011?n\u0004&wO\u0005! \u0011o\u001f<\u007f4C#Z\u001cEm\u0004>KA;yB}&hjH\\", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1 implements CommunicationManagerCallback {
    final /* synthetic */ Function1 $error$inlined;
    final /* synthetic */ Function1 $onHeadersResponse$inlined;
    final /* synthetic */ VsshCommunicationRequest $request$inlined;
    final /* synthetic */ Function1 $response$inlined;
    final /* synthetic */ Class $responseType$inlined;
    final /* synthetic */ DeriveManagerImp this$0;

    DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1(DeriveManagerImp deriveManagerImp, VsshCommunicationRequest vsshCommunicationRequest, Function1 function1, Function1 function12, Class cls, Function1 function13) {
        this.this$0 = deriveManagerImp;
        this.$request$inlined = vsshCommunicationRequest;
        this.$onHeadersResponse$inlined = function1;
        this.$response$inlined = function12;
        this.$responseType$inlined = cls;
        this.$error$inlined = function13;
    }

    private final void callExchangeKey(final BaseErrorEvent baseErrorEvent) {
        DeriveManagerImp.extExchangeKey$default(this.this$0, new Function1<BaseSuccessEvent, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.derive.DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BaseSuccessEvent baseSuccessEvent) {
                invoke2(baseSuccessEvent);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BaseSuccessEvent baseSuccessEvent) {
                Intrinsics.checkParameterIsNotNull(baseSuccessEvent, Xg.qd("\\h", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (456145629 ^ (-716773124)))), (short) (C1607wl.Xd() ^ ((768991171 ^ 2075399174) ^ 1449232292))));
                CommunicationManager communicationManager = DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.this.this$0.communicationManager;
                communicationManager.setEnableRequestWithSSLPinning(DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.this.$request$inlined.getSslPinning());
                communicationManager.isResponseEncrypted(DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.this.$request$inlined.getResponseEncrypted());
                communicationManager.disableSecureRequest(!DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.this.$request$inlined.getSecureRequest());
                communicationManager.addSessionIdInEncryptedData(DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.this.$request$inlined.getAddSessionIdToRequest());
                communicationManager.setCallback(new CommunicationManagerCallback() { // from class: com.valid.vssh_bio_validation_library.manager.derive.DeriveManagerImp$consumeVsshService$.inlined.with.lambda.1.1.1
                    @Override // com.valid.communication.managers.communicationmanager.CommunicationManagerCallback
                    public void errorEvent(BaseErrorEvent baseErrorEvent2) {
                        if (baseErrorEvent2 != null) {
                        }
                    }

                    @Override // com.valid.communication.managers.communicationmanager.CommunicationManagerCallback
                    public void successEvent(BaseSuccessEvent baseSuccessEvent2) {
                        if (baseSuccessEvent2 != null) {
                            Function1 function1 = DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.this.$onHeadersResponse$inlined;
                            if (function1 != null) {
                                JSONObject header = baseSuccessEvent2.getHeader();
                                Intrinsics.checkExpressionValueIsNotNull(header, C1561oA.yd("UeW_h!^ZY[_k", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831081016)))));
                            }
                            Function1 function12 = DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.this.$response$inlined;
                            BaseModelResponse baseResponseModel = baseSuccessEvent2.getBaseResponseModel(DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.this.$responseType$inlined);
                            Intrinsics.checkExpressionValueIsNotNull(baseResponseModel, C1561oA.Yd("=O?IP\u000bEDT#CVI7KZXXX^Q:]SU]\u001aeYhfffl_Oumc(", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951467013)))));
                            function12.invoke(baseResponseModel);
                        }
                    }
                });
                communicationManager.consumeVsshService(DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.this.$request$inlined.getMethod().ordinal(), DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.this.$request$inlined.getPath(), DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.this.$request$inlined.getHeaders(), DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.this.$request$inlined.getBody());
            }
        }, new Function1<BaseErrorEvent, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.derive.DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BaseErrorEvent baseErrorEvent2) {
                invoke2(baseErrorEvent2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BaseErrorEvent baseErrorEvent2) {
                Intrinsics.checkParameterIsNotNull(baseErrorEvent2, Jg.Wd("\u0004\u001f", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (-864697899))), (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (2076303292 ^ 261142646)))));
                DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1.this.$error$inlined.invoke(baseErrorEvent);
            }
        }, null, (1137096135 ^ 690042626) ^ 1793557185, null);
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManagerCallback
    public void errorEvent(BaseErrorEvent baseErrorEvent) {
        if (baseErrorEvent != null) {
            ErrorData errorData = baseErrorEvent.getErrorData();
            Intrinsics.checkExpressionValueIsNotNull(errorData, ZO.xd("\u007f\u0012T\u0017+fY)\f~=\u000fY1I", (short) (Od.Xd() ^ ((1844295543 ^ 1155112205) ^ (-691278757))), (short) (Od.Xd() ^ (545144875 ^ (-545138369)))));
            Integer errorType = errorData.getErrorType();
            int i2 = 1849578453 ^ 1849578461;
            if (errorType != null && errorType.intValue() == i2) {
                callExchangeKey(baseErrorEvent);
                return;
            }
            int httpStatusCode = baseErrorEvent.getHttpStatusCode();
            if (httpStatusCode == i2 || httpStatusCode == ((472408869 ^ 2078144494) ^ 1744147827)) {
                callExchangeKey(baseErrorEvent);
            } else {
                this.$error$inlined.invoke(baseErrorEvent);
            }
        }
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManagerCallback
    public void successEvent(BaseSuccessEvent baseSuccessEvent) {
        if (baseSuccessEvent != null) {
            Function1 function1 = this.$onHeadersResponse$inlined;
            if (function1 != null) {
                JSONObject header = baseSuccessEvent.getHeader();
                Intrinsics.checkExpressionValueIsNotNull(header, C1626yg.Ud("UJf\f=+\u0012CbS\u001ae3*o>@XM", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (1377101844 ^ (-1011936759)))), (short) (C1499aX.Xd() ^ (1475548289 ^ (-1475573544)))));
            }
            Function1 function12 = this.$response$inlined;
            BaseModelResponse baseResponseModel = baseSuccessEvent.getBaseResponseModel(this.$responseType$inlined);
            Intrinsics.checkExpressionValueIsNotNull(baseResponseModel, Ig.wd("\u0006D^{\u0013tN]@%.\u0014~<LC8w?GuB$7{tY\u0017Vh7\"z\u0016v1\u001ds\u001e\u0006\u0003\r0k%.i", (short) (Od.Xd() ^ (ZN.Xd() ^ (-864700676)))));
            function12.invoke(baseResponseModel);
        }
    }
}
