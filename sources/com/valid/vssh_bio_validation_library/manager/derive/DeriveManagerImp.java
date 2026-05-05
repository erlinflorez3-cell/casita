package com.valid.vssh_bio_validation_library.manager.derive;

import android.content.Context;
import com.dynatrace.android.agent.Global;
import com.valid.communication.events.BaseErrorEvent;
import com.valid.communication.events.BaseSuccessEvent;
import com.valid.communication.helpers.CommunicationConstants;
import com.valid.communication.managers.communicationmanager.CommunicationManager;
import com.valid.communication.managers.communicationmanager.CommunicationManagerCallback;
import com.valid.communication.models.BaseModelResponse;
import com.valid.communication.models.ErrorData;
import com.valid.communication.models.ExchangeRequestData;
import com.valid.security.helpers.KeyHelper;
import com.valid.vssh_bio_validation_library.keyphone.UniqueKeyPhone;
import com.valid.vssh_bio_validation_library.manager.IBioValidationManager;
import com.valid.vssh_bio_validation_library.utils.InstanceBioValidationManager;
import com.valid.vssh_bio_validation_library.utils.StateUserInit;
import com.valid.vssh_bio_validation_library.utils.helpers.SecurityHelper;
import com.valid.vssh_bio_validation_library.utils.model.DeriveModelResponse;
import com.valid.vssh_bio_validation_library.utils.model.EnumErrorType;
import com.valid.vssh_bio_validation_library.utils.model.ErrorModelResponse;
import com.valid.vssh_bio_validation_library.utils.model.MethodType;
import com.valid.vssh_bio_validation_library.utils.model.VsshCommunicationRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Яj\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.`S2şs{BřcҕyCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u00153JoU3UoC:htL\u0005(2(:\u0002\u0005\u0017\u001a2H\u0016x\u0003CY\u0018\u001a0FrPĥ=M3\u0019R\u0019N$\u000f\u001etg|7Xpk<G#1lŌR'm4E<\u001bMl';~\u0002$1¨E>=%\u0002\r7ViJ\u001b? I5r54CO\u0004YFXF\u001dC9\u007f%k\u0002>p\u0015[p\u00147/UҪ[PT1&\f\f\u000fL\u0004<\u000eUX^=(x \u001aCv\u0003Snc\u0012`R\u007f)id'U\u00149+G/~_q=)Ne\u0006\u0015\u000f.#/v7Z\u0003\u001e'\u0017c)\u0006fIQnExR\u0018YUm2q\u0013!8\u001aHb\u0010@\f \\\u001dÉ;e?:1q\b`Ti|\u000b\u0007\u0002ckbHn*\u001d&gI\u0017&r_t\u0016{_\u0003s¯\u0015W\"k\u0017\u0004\u000e+0^}BG> P_h\u0018r{mP%wvEu\u0007k<_idARie&`\u0001\nZS\u0005#\u0013v~B\u0002\u0014\u000bp.\"@g\u0003\u001e\b}TN:3BA\u0002\u001cb4G\u0018\u000b%x\u0017$BO\u001e!mjj ~\u0003F4\u0005y$#\u0011\u0017O\u000b\u0001 o~I:\u001fx$C@\u007f4a*cE\u00014++O\u000f\u0002$_ibFz\u0012Fyc{8\u0016H:\u0018/\u0006\u0017\u001d%A20R\u000e\\\u0001\riM@/+\u0003\b7SjDf6\u000b7@1vXQl\u0017Py5г/ϋh\u007f\u0002ӓ\u0017\u0007Ucl\u000b\n? \u0382\u000fʾ@N@وU+,*\u0019oP\u0003\fԉoے!\u0016\u007fҡڕ\u0019\u000b"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017K7t0 \u0015u+8\u0007p0_vp&L[0mRZ9\u001d\u000e\\\u000e[\u000f\u0015\u0010/", "\u001ab^:\"=:Z\u001d}D\\6\u0005\u0011?n\u0004&wO\u0005! \u0011w\nEr'5f\fi5w\u001e6]L?i0-\u0019rjA\u0003l(Pv4\u0011*X4db{A\u0012\u000ei\u0012X4t\u0001b=&nQ\u0015\u001b\u000f3F}9nV", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1n\\:h5BQ\u0015\u000e~h5d\u00058a\u0002(\t", "\u001ab^:\"=:Z\u001d}D\\6\u0005\u0011?n\u0004&wO\u0005! \u0011w\nEr'5f\fi5w\u001e6]L?i0-\u0019rjA\u0003l(Pv4\u0011*X4db{A\u0012\u000ei\u0012X4t\u0001b=&nQ\r", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~jy';l_,WKC{=\"\u0013dp=\u0011luVr0CNN9j\u001cpG\u001c\u001aj\u0017R)\t\u0014]K-v@@\u001b\n,VK\u0019r\t\u0014&\u00179hlQZ\u001aPa\u0011~=+hS/#j", "2da6i,$S-", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju-v4K]N\u0014fQrD\u0001\u0012h\u0019X4\u001b\u0005/", "1n]@h4>D'\r}L,\n\u001a3c\u007f", "", Global.BLANK, "", "@d`BX:M", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju?\u00055J*X4db{A\u0012\u000ei\u0012X4y\u0005eQ$|S\r", "@db=b5LS\b\u0013\u0006^", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "@db=b5LS", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\"=:Z\u001d}D\\6\u0005\u0011?n\u0004&wO\u0005! \u0011w\u0018;v,C#Z\u001cEm}8LCBX4, rjG\u00079", "3qa<e", "\u001ab^:\"=:Z\u001d}D\\6\u0005\u0011?n\u0004&wO\u0005! \u0011o\u001f<\u007f4C#Z\u001cEmu;ZMHKE\u001e\u001ew7", "=m72T+>`'kzl7\u0007\u0012=e", "2da6i,$S-_v\\,k\u0013?c\u0003\fz", "2da6i,+S'\n\u0005g:|", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "D`[BX", "3qa<e\u0019>a$\t\u0004l,", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju.\u00044QY66[Ry*\u0014 e\u0018W9\rZ", "3qa<e\fOS\"\u000e", "0`b289K]&^\f^5\f", "3wc\u0012k*AO\"\u0001zD,\u0011", "=mBBV*>a'", "\u001ab^:\"=:Z\u001d}D\\6\u0005\u0011?n\u0004&wO\u0005! \u0011o\u001f<\u007f4C#Z\u001cEm\u0004>KA;yB}&hjH\\", "=m4?e6K", "1`[9U(<Y", "5d]2e(MSw~\bb=|n/y", "5d]2e(MS\t\b~j<|n/yj+\u0006I\u0001", "", "5dc\u0011X9Bd\u0019dzr\u0019|\u0017?l\u000f", "AtR0X:L3*~\u0004m", "0`b2F<<Q\u0019\r\t>=|\u0012>", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class DeriveManagerImp implements CommunicationManagerCallback {
    private CommunicationManager communicationManager;
    private Context context;
    private DeriveModelResponse deriveKey;

    public DeriveManagerImp(Context context, CommunicationManager communicationManager) {
        Intrinsics.checkParameterIsNotNull(context, hg.Vd("t\u007f}\u0003r\u0005\u007f", (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849982214)), (short) (OY.Xd() ^ (FB.Xd() ^ 1609515642))));
        short sXd = (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (60762141 ^ 840330733)));
        int[] iArr = new int["fqnmtlf_\\nbgeCVbTYVb".length()];
        QB qb = new QB("fqnmtlf_\\nbgeCVbTYVb");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(communicationManager, new String(iArr, 0, i2));
        this.context = context;
        this.communicationManager = communicationManager;
    }

    public static final /* synthetic */ DeriveModelResponse access$getDeriveKey$p(DeriveManagerImp deriveManagerImp) {
        DeriveModelResponse deriveModelResponse = deriveManagerImp.deriveKey;
        if (deriveModelResponse == null) {
            short sXd = (short) (Od.Xd() ^ (Od.Xd() ^ (1004066361 ^ (-2082800490))));
            int[] iArr = new int["iiukweJcv".length()];
            QB qb = new QB("iiukweJcv");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Intrinsics.throwUninitializedPropertyAccessException(new String(iArr, 0, i2));
        }
        return deriveModelResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void consumeVsshService$default(DeriveManagerImp deriveManagerImp, VsshCommunicationRequest vsshCommunicationRequest, Class cls, Function1 function1, Function1 function12, Function1 function13, int i2, Object obj) {
        if ((i2 + 16) - (i2 | 16) != 0) {
            function13 = null;
        }
        deriveManagerImp.consumeVsshService(vsshCommunicationRequest, cls, function1, function12, function13);
    }

    private final void deriveKeyFaceTouchId(Context context, final Function1<? super DeriveModelResponse, Unit> function1, final Function1<? super ErrorModelResponse, Unit> function12) {
        Pair[] pairArr = new Pair[2143123832 ^ 2143123835];
        pairArr[0] = TuplesKt.to(C1561oA.Yd(" %4\r(=", (short) (FB.Xd() ^ (ZN.Xd() ^ 864705258))), Xg.qd("afu\u0003UW^", (short) (FB.Xd() ^ ((1638456781 ^ 804261709) ^ 1314442808)), (short) (FB.Xd() ^ (2000581572 ^ 2000583167))));
        pairArr[1] = TuplesKt.to(Jg.Wd("t\u0016\b9)4fl\u0015/ 'GP\u0004", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (437802523 ^ (-1501769643)))), (short) (ZN.Xd() ^ (378830389 ^ 378827753))), ZO.xd("ajP>\u000fmk;SC", (short) (ZN.Xd() ^ (FB.Xd() ^ 1609517172)), (short) (ZN.Xd() ^ (Od.Xd() ^ (729226598 ^ 1821034282)))));
        int iXd = ZN.Xd() ^ 864691138;
        pairArr[762109037 ^ 762109039] = TuplesKt.to(C1626yg.Ud("r>\\G79M]d>qe}K", (short) (FB.Xd() ^ ((1449013943 ^ 1614412357) ^ 912760519)), (short) (FB.Xd() ^ iXd)), KeyHelper.getFingerPrint(context));
        Map mapMapOf = MapsKt.mapOf(pairArr);
        consumeVsshService$default(this, new VsshCommunicationRequest(MethodType.POST, Ig.wd("q_N3_\u0006qd\u0011w<P\u0013\u0011\f>\u001ch\u0012\u0014O\u00189HV$\nOK\u000f,Hk\u0016\u0015\u0010bO!@/l4fDgT%a`Fg\u001d\r}", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (1321339134 ^ 545679208)))), null, mapMapOf, true, true, true, true), DeriveModelResponse.class, new Function1<BaseModelResponse<? super DeriveModelResponse>, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.derive.DeriveManagerImp.deriveKeyFaceTouchId.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BaseModelResponse<? super DeriveModelResponse> baseModelResponse) {
                invoke2(baseModelResponse);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BaseModelResponse<? super DeriveModelResponse> baseModelResponse) {
                Intrinsics.checkParameterIsNotNull(baseModelResponse, EO.Od("N\b", (short) (ZN.Xd() ^ ((380225283 ^ 438746645) ^ 210705269))));
                if (!Intrinsics.areEqual(baseModelResponse.getStatusCode(), CommunicationConstants.STATUS_CODE_SUCCESS)) {
                    function12.invoke(new ErrorModelResponse(EnumErrorType.CUSTOM, baseModelResponse.getMessage(), null, (682652392 ^ 1339711439) ^ 1735011619, null));
                    return;
                }
                Function1 function13 = function1;
                DeriveModelResponse response = baseModelResponse.getResponse();
                if (response != null) {
                    function13.invoke(response);
                } else {
                    throw new TypeCastException(C1561oA.Qd("z\u0001vu(jgsrrv!bd\u001e`]nn\u0019lf\u0016cca\u001f_e[Z\r`dZN\bJUR\u0012YCMIC\fSONB8:@E4J4>:40B6;9)51)8&6<o64(*0i()\u001d\u001d#cx\u0019%\u001b'\u0015{\u001d\u0011\u0011\u0017{\u000e\u001b\u0017\u0015\u0013\u0017\b", (short) (ZN.Xd() ^ ((119820271 ^ 1734320757) ^ 1618738890))));
                }
            }
        }, new Function1<BaseErrorEvent, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.derive.DeriveManagerImp.deriveKeyFaceTouchId.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BaseErrorEvent baseErrorEvent) {
                invoke2(baseErrorEvent);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BaseErrorEvent baseErrorEvent) {
                Intrinsics.checkParameterIsNotNull(baseErrorEvent, C1593ug.zd("3?", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864685377)), (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (1365804655 ^ (-1625410464))))));
                Function1 function13 = function12;
                EnumErrorType enumErrorType = EnumErrorType.HTTP;
                ErrorData errorData = baseErrorEvent.getErrorData();
                short sXd = (short) (C1633zX.Xd() ^ ((1860900591 ^ 1772879511) ^ (-121668253)));
                int[] iArr = new int["\u000e\u0018P\u0007\u0013\u0012\u000e\u0010`|\u000fz".length()];
                QB qb = new QB("\u000e\u0018P\u0007\u0013\u0012\u000e\u0010`|\u000fz");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Intrinsics.checkExpressionValueIsNotNull(errorData, new String(iArr, 0, i2));
                function13.invoke(new ErrorModelResponse(enumErrorType, errorData.getMessage(), null, C1633zX.Xd() ^ (749203781 ^ (-1492555126)), null));
            }
        }, null, (191879999 ^ 2049436619) ^ 1900556516, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void extExchangeKey$default(DeriveManagerImp deriveManagerImp, Function1 function1, Function1 function12, CommunicationManagerCallback communicationManagerCallback, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            function1 = null;
        }
        if ((2 & i2) != 0) {
            function12 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            communicationManagerCallback = null;
        }
        deriveManagerImp.extExchangeKey(function1, function12, communicationManagerCallback);
    }

    private final String generateUniqueKeyPhone(Context context) {
        return new UniqueKeyPhone().getUniqueKeyPhone(context);
    }

    protected final <R> void consumeVsshService(VsshCommunicationRequest vsshCommunicationRequest, Class<R> cls, Function1<? super BaseModelResponse<? super R>, Unit> function1, Function1<? super BaseErrorEvent, Unit> function12, Function1<Object, Unit> function13) {
        short sXd = (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134259097));
        int[] iArr = new int["\u000fQq\u0013\u0006Q,".length()];
        QB qb = new QB("\u000fQq\u0013\u0006Q,");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(vsshCommunicationRequest, new String(iArr, 0, i2));
        Intrinsics.checkParameterIsNotNull(cls, C1561oA.Qd("8*731/3$\u00126, ", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951489818)))));
        Intrinsics.checkParameterIsNotNull(function1, C1593ug.zd("\u001b\u000f\u001e\u001c\u001c\u001c\"\u0015", (short) (FB.Xd() ^ (275980435 ^ 275972683)), (short) (FB.Xd() ^ (1303200948 ^ 1303188138))));
        Intrinsics.checkParameterIsNotNull(function12, C1561oA.od("R^]Y[", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849952094))));
        CommunicationManager communicationManager = this.communicationManager;
        communicationManager.setEnableRequestWithSSLPinning(vsshCommunicationRequest.getSslPinning());
        communicationManager.isResponseEncrypted(vsshCommunicationRequest.getResponseEncrypted());
        communicationManager.disableSecureRequest(!vsshCommunicationRequest.getSecureRequest());
        communicationManager.addSessionIdInEncryptedData(vsshCommunicationRequest.getAddSessionIdToRequest());
        communicationManager.setCallback(new DeriveManagerImp$consumeVsshService$$inlined$with$lambda$1(this, vsshCommunicationRequest, function13, function1, cls, function12));
        communicationManager.consumeVsshService(vsshCommunicationRequest.getMethod().ordinal(), vsshCommunicationRequest.getPath(), vsshCommunicationRequest.getHeaders(), vsshCommunicationRequest.getBody());
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManagerCallback
    public void errorEvent(BaseErrorEvent baseErrorEvent) {
        if (baseErrorEvent == null || baseErrorEvent.getErrorData() == null) {
            return;
        }
        StateUserInit.Companion.updateStateInitValidation(false);
    }

    public final void extExchangeKey(final Function1<? super BaseSuccessEvent, Unit> function1, final Function1<? super BaseErrorEvent, Unit> function12, CommunicationManagerCallback communicationManagerCallback) {
        CommunicationManagerCallback communicationManagerCallback2 = communicationManagerCallback;
        CommunicationManagerCallback communicationManagerCallback3 = new CommunicationManagerCallback() { // from class: com.valid.vssh_bio_validation_library.manager.derive.DeriveManagerImp$extExchangeKey$mCallback$1
            /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
            @Override // com.valid.communication.managers.communicationmanager.CommunicationManagerCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void errorEvent(com.valid.communication.events.BaseErrorEvent r6) {
                /*
                    r5 = this;
                    r3 = 0
                    if (r6 == 0) goto L71
                    com.valid.communication.models.ErrorData r0 = r6.getErrorData()
                    if (r0 == 0) goto L71
                    java.lang.Integer r1 = r0.getErrorType()
                Ld:
                    r4 = 226738716(0xd83c21c, float:8.120228E-31)
                    r0 = 1198808466(0x47745d92, float:62557.57)
                    r4 = r4 ^ r0
                    r0 = 1257741878(0x4af79e36, float:8113947.0)
                    r4 = r4 ^ r0
                    if (r1 != 0) goto L63
                L1a:
                    if (r6 == 0) goto L24
                    int r0 = r6.getHttpStatusCode()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                L24:
                    java.lang.Integer r0 = com.valid.communication.helpers.CommunicationConstants.STATUS_CODE_SUCCESS
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
                    if (r0 == 0) goto L57
                L2c:
                    com.valid.communication.events.BaseErrorEvent r6 = new com.valid.communication.events.BaseErrorEvent
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                    java.lang.String r2 = "m\bG\u0018\r \u001e\u001f\u0017\u0013\u001fP'!S\u001a()'+Y$*\"1/%3#'3"
                    int r1 = yg.OY.Xd()
                    r0 = 69950338(0x42b5b82, float:2.0142972E-36)
                    r1 = r1 ^ r0
                    int r0 = yg.FB.Xd()
                    r0 = r0 ^ r1
                    short r0 = (short) r0
                    java.lang.String r0 = yg.C1561oA.Kd(r2, r0)
                    r6.<init>(r0, r3)
                    r6.setHttpStatusCode(r4)
                L4c:
                    kotlin.jvm.functions.Function1 r0 = r2
                    if (r0 == 0) goto L56
                    java.lang.Object r0 = r0.invoke(r6)
                    kotlin.Unit r0 = (kotlin.Unit) r0
                L56:
                    return
                L57:
                    if (r6 == 0) goto L5a
                    goto L4c
                L5a:
                    com.valid.communication.events.BaseErrorEvent r6 = new com.valid.communication.events.BaseErrorEvent
                    r6.<init>()
                    r6.setHttpStatusCode(r4)
                    goto L4c
                L63:
                    int r2 = r1.intValue()
                    r1 = 1668828732(0x63784e3c, float:4.58043E21)
                    r0 = 1668828724(0x63784e34, float:4.5804277E21)
                    r1 = r1 ^ r0
                    if (r2 == r1) goto L2c
                    goto L1a
                L71:
                    r1 = r3
                    goto Ld
                */
                throw new UnsupportedOperationException("Method not decompiled: com.valid.vssh_bio_validation_library.manager.derive.DeriveManagerImp$extExchangeKey$mCallback$1.errorEvent(com.valid.communication.events.BaseErrorEvent):void");
            }

            @Override // com.valid.communication.managers.communicationmanager.CommunicationManagerCallback
            public void successEvent(BaseSuccessEvent baseSuccessEvent) {
                Function1 function13 = function1;
                if (function13 != null) {
                    if (baseSuccessEvent == null) {
                        baseSuccessEvent = new BaseSuccessEvent();
                        baseSuccessEvent.setHttpStatusCode((1612633873 ^ 455627964) ^ 2067169881);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        };
        String strGenerateUniqueKeyPhone = generateUniqueKeyPhone(this.context);
        String strKd = C1561oA.Kd(" \u001d\u001e\u0018 B\u001a(\u001dCHOGKJ)\u001c[\u0015((9.0,-<10A)3@=>8:_D=<MB?wDIz;z{5l[\u0003_YY\u0005X\\w|xLE~\u0010bH\b~c\u0005v\bkc\u0006\u000bn\u001e\u001dU\rw^\u0010\u0019\u001f{uZ#\bs\u0001)|\u0019&\n|\u0015\u0006$1\"\u0011&x\u0005r\r\fz\u0010\r8,%\u001b@\u0005\u0014*9HA;GCG!& A3)44TO2O=)\u001a2\u001c=5W!aZ7W+^:B)@=qgt@UC@PHSTUh;nu{5\u0006\u00038dGt`bmm\u0010ehY\f\t\u0012\u0016\u000b\u0007Tvk\u0014y\u0012\u001dt\u001a]|\u0001 #\u0002\u0013ze\u0002\u0016\u0015h}\u0003~0!p$0\u0004\u0013\u0006r\u0014/\u001a\u0016\n\u0018vs\u001b9\u001a/707G)=C6\u0001\nK\u001bQ\r\r(5Y3Y\u0014\\R*/H\u0019X=]AW=EH3=eVC+]B_\\eeb_T10SZzozi]4b\u0002=Az?@fE\u0001WI{bzK~bj\u000bP\u0017\b\u0010\u0005\u001e\\\u000eh\u001d\u0003`\u0019b\u001bft'|\u0002\u0005\r+\b\u001d! \fr\u000f\u0004*i.-3\u0015:{'\n.\u001f4\u001b\u0013\u00132;7FE\u0019D\u0019CN!\u001d\u001b,\u001d\u001f", (short) (ZN.Xd() ^ ((1352947139 ^ 1167510327) ^ 355642000)));
        String strEncryptRSA = strGenerateUniqueKeyPhone != null ? SecurityHelper.INSTANCE.encryptRSA(strGenerateUniqueKeyPhone, strKd) : null;
        Pair[] pairArr = new Pair[(722972468 ^ 1612938227) ^ 1261753541];
        int iXd = C1633zX.Xd() ^ (589837754 ^ 1467563917);
        short sXd = (short) (C1580rY.Xd() ^ ((108934573 ^ 2069313631) ^ (-2099857796)));
        short sXd2 = (short) (C1580rY.Xd() ^ iXd);
        int[] iArr = new int["b\"G5".length()];
        QB qb = new QB("b\"G5");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        pairArr[0] = TuplesKt.to(new String(iArr, 0, i2), strEncryptRSA);
        short sXd3 = (short) (C1499aX.Xd() ^ ((1580265452 ^ 35361025) ^ (-1546351023)));
        int[] iArr2 = new int["\u0004\t\u0018p\f!".length()];
        QB qb2 = new QB("\u0004\t\u0018p\f!");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
            i3++;
        }
        pairArr[1] = TuplesKt.to(new String(iArr2, 0, i3), Wg.vd("\u0004\t\u0014!wy|", (short) (ZN.Xd() ^ ((1099043013 ^ 354310438) ^ 1419527366))));
        Map<String, Object> mapMapOf = MapsKt.mapOf(pairArr);
        ExchangeRequestData exchangeRequestData = new ExchangeRequestData();
        exchangeRequestData.setPublicKey(strKd);
        CommunicationManager communicationManager = this.communicationManager;
        communicationManager.setEnableRequestWithSSLPinning(false);
        communicationManager.isResponseEncrypted(false);
        communicationManager.disableSecureRequest(false);
        communicationManager.addSessionIdInEncryptedData(false);
        if (communicationManagerCallback2 == null) {
            communicationManagerCallback2 = communicationManagerCallback3;
        }
        communicationManager.setCallback(communicationManagerCallback2);
        String strKd2 = Qg.kd("\u001dN\\[\u0017\\MY\\NGHU", (short) (FB.Xd() ^ ((1907271011 ^ 1379739609) ^ 596883802)), (short) (FB.Xd() ^ (FB.Xd() ^ 1609529211)));
        short sXd4 = (short) (C1607wl.Xd() ^ (1336784215 ^ 1336802764));
        short sXd5 = (short) (C1607wl.Xd() ^ ((931392195 ^ 692368201) ^ 516371488));
        int[] iArr3 = new int["Gx\f\n|Bw\nswo{spUn\u0002".length()];
        QB qb3 = new QB("Gx\f\n|Bw\nswo{spUn\u0002");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
            i4++;
        }
        communicationManager.initExchangeKey(strKd2, new String(iArr3, 0, i4), exchangeRequestData, mapMapOf, null);
    }

    public final void generateDeriveKey() {
        deriveKeyFaceTouchId(this.context, new Function1<DeriveModelResponse, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.derive.DeriveManagerImp.generateDeriveKey.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DeriveModelResponse deriveModelResponse) {
                invoke2(deriveModelResponse);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DeriveModelResponse deriveModelResponse) {
                short sXd = (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (1318797720 ^ (-551507870))));
                short sXd2 = (short) (C1499aX.Xd() ^ ((1880263286 ^ 1351337795) ^ (-546929684)));
                int[] iArr = new int["V\u0011".length()];
                QB qb = new QB("V\u0011");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                    i2++;
                }
                Intrinsics.checkParameterIsNotNull(deriveModelResponse, new String(iArr, 0, i2));
                if (deriveModelResponse.getDerive().length() > 0) {
                    DeriveManagerImp.this.deriveKey = deriveModelResponse;
                }
                InstanceBioValidationManager.INSTANCE.getIMethodsBioValidation().generateDeriveKey(0, C1561oA.Xd("k\u000b\u0015\r\u001b\u000b\u001f\u0011L\u0012\u0014\"\u001a(\u0018~\u001a/V+.\u001d\u001e!01", (short) (Od.Xd() ^ (C1633zX.Xd() ^ (1751480542 ^ 473189485)))));
            }
        }, new Function1<ErrorModelResponse, Unit>() { // from class: com.valid.vssh_bio_validation_library.manager.derive.DeriveManagerImp.generateDeriveKey.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ErrorModelResponse errorModelResponse) {
                invoke2(errorModelResponse);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ErrorModelResponse errorModelResponse) {
                Intrinsics.checkParameterIsNotNull(errorModelResponse, Wg.vd("bl", (short) (C1607wl.Xd() ^ (Od.Xd() ^ 1207801833))));
                IBioValidationManager iMethodsBioValidation = InstanceBioValidationManager.INSTANCE.getIMethodsBioValidation();
                String errorMessage = errorModelResponse.getErrorMessage();
                if (errorMessage == null) {
                    Intrinsics.throwNpe();
                }
                iMethodsBioValidation.generateDeriveKey(1, errorMessage);
                String.valueOf(errorModelResponse.getErrorMessage());
                Qg.kd("\u0006\u0012\u0011\r\u000f\u001b~~\u000b\u0001\rz\u0014~w\u000b", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (1121880619 ^ (-86190556)))), (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951484195)));
                String.valueOf(errorModelResponse.getErrorType());
            }
        });
    }

    public final String getDeriveKeyResult() {
        DeriveModelResponse deriveModelResponse = this.deriveKey;
        if (deriveModelResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException(C1561oA.ud("\u0015\u0015!\u0017#\u0011u\u000f\"", (short) (ZN.Xd() ^ (FB.Xd() ^ 1609504888))));
        }
        return deriveModelResponse.getHashDerivateKey();
    }

    @Override // com.valid.communication.managers.communicationmanager.CommunicationManagerCallback
    public void successEvent(BaseSuccessEvent baseSuccessEvent) {
        if (baseSuccessEvent != null && baseSuccessEvent.getResponse() != null) {
            String response = baseSuccessEvent.getResponse();
            Intrinsics.checkExpressionValueIsNotNull(response, C1561oA.yd("\t\u0007\u001c\ru\u0017\b\u0007\u0014!$t!\u000f\u001b d(\u001e+#!#'$", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (850844646 ^ (-916302038))))));
            if (response.length() != 0) {
                BaseModelResponse baseModelResponse = (BaseModelResponse) baseSuccessEvent.getTypedResponse(BaseModelResponse.class);
                Intrinsics.checkExpressionValueIsNotNull(baseModelResponse, C1561oA.Yd("ntlbbQetrrrxk", (short) (C1607wl.Xd() ^ ((1164109712 ^ 344730868) ^ 1374614296))));
                if (!Intrinsics.areEqual(baseModelResponse.getStatusCode(), CommunicationConstants.STATUS_CODE_SUCCESS)) {
                    StateUserInit.Companion.updateStateInitValidation(false);
                    return;
                }
                String serviceName = baseModelResponse.getServiceName();
                if (serviceName != null && serviceName.hashCode() == ((1582336609 ^ 2067464633) ^ (-1307620636))) {
                    if (serviceName.equals(Xg.qd("\u0019-\u0019\u001f\u0019'! \u0007\"7", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951466027)), (short) (Od.Xd() ^ (Od.Xd() ^ (-1207802924)))))) {
                        StateUserInit.Companion.updateStateInitValidation(true);
                        return;
                    }
                }
                StateUserInit.Companion.updateStateInitValidation(false);
                return;
            }
        }
        StateUserInit.Companion.updateStateInitValidation(false);
    }
}
