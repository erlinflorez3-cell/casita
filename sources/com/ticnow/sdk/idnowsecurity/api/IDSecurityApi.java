package com.ticnow.sdk.idnowsecurity.api;

import android.app.Activity;
import android.content.Context;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.nodes.IDBaseUrl;
import com.ticnow.sdk.idnowsecurity.http.nodes.IDCredentials;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import com.ticnow.sdk.idnowsecurity.http.request.CommonParamsRequest;
import com.ticnow.sdk.idnowsecurity.http.request.CommonUserDataRequest;
import com.ticnow.sdk.idnowsecurity.http.request.DeviceDataRequest;
import com.ticnow.sdk.idnowsecurity.http.request.UpdateNotificationIdRequest;
import com.ticnow.sdk.idnowsecurity.http.request.UserDataRequest;
import com.ticnow.sdk.idnowsecurity.http.response.FinishEnrollmentResponse;
import com.ticnow.sdk.idnowsecurity.http.response.IdNowCommonResponse;
import com.ticnow.sdk.idnowsecurity.http.response.InitEnrollmentResponse;
import com.ticnow.sdk.idnowsecurity.http.response.PushMessageResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"ЯŇ\u0014D57\u001eq\u007fR܀kŞ\fA\u00140\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmH<[[ճ\u0017k\u00124,Ӌ,qQK]\u001a\u0004%\u0011O\\soñRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?IMw=O`|6\u001b :\">y\r\u00010*P\u0010|zKK\"\u00128ϋx:h\rU\u0005 \u0013\u000e>6\u0001&ձoNLHtҗB/9\u0003qBT'g0\u0013M\u0015Ͽ\\'#vi\u001e1@?5+%[Έ\u000fRq?\u000bӊy=\u001bh/'1L{WLX\bϬ\u001d+e\rer,\\\rQv\f/˃WcaP\u0016(}\u0002\u0002qRǉ>\u0006UGvC(f \u000eau#WNR\u001a^p\u0003+eD\u001b=\u007fa0\u007f?/goA1Ne\u00035\u0011,%\u0019nO^\u0005\u0012n\u00193T&Vwu\tUVV\"[Sl2y\u0013\u00068\u0006HG.2,\u0015<\u001b=7\n>iE4\"VN\u007fx\u001b_\u0017^\u001aVVB:nD:Z\r\u001a^\\d3p\u0001Xf8)MJ_M\"P3.i\u0010>7$>Y\u007flwle]8(_jE]\u0007k<\\ibAAic>l\u0019\u001b\\_Jp\u001dZ|A\u0002\u0017\u000b`6$JH\u0019\u0013(\u007fRR$\u0013`D\" B8I\u0019\u000b \u000f'fbO\f!apg>\n\u000572\u0005\u0002$#\f1Tjt\bg'N\\\u0001n.EA\u007f@_J\u001eBvD\u0015%\u001d}\"\u0011wkZIdlDx\u0006\u007f.\u001a29\u007f4m\u0017\u001d\u000bA20>\fp;,__*')\u0010*\u0013IjFg6m!0nnbO\u0003\u001cRzl\u0007;\b\u0013\u0015*eT\u0011_c\u0003\"\fRW\u000b\u001biLPH|39L>iu2~E-qA{1(\u0018=1y]\u0018\u0001t\u001e+E4\u0012}\u0004Z\u0002FspSu2i;y]\rB:$\u001b\brLx\f B7I=7VW|p\u0005O}\u0017=\u001d~\u000f<\u000f\u0001V\nT)n,Mt\u0004r6Q\u001e,^qFAQai\u0006my_;N\u001d\u000e#{_sB K4nW\u0011\u001e`\n\u0002.NAiy5T\u0017CL@L\n\u001bC\u0003\u0004\u001c\u000f)\u0019/g\u001f\u0019BB\"Ul\r3\u0014#z\u0011Wngx!X$/\u0013A \u00115_\b\u001eJb3{2/XM\r)~g~\u0015:[HbO3(\u0007\u0018;Ikga\u0002d\u0015w-{\u0011\b\ff)-5P73Ma\u0013ov^x!T\u0013gM~\"hbNPC\u0015y[)\u0003.Wq'u\u000bo\u0011T|R\u00069[\u001a/\u001at-\u0015\u0010\u0015ct ]\nCAUI\u0019)W\u007feiS}67P-\u0012\u001d9^m\r\u00153\u000e!H@\n\u0018x\u00017>\u0001$\u0012Zbt!\u001b^\fDs\u001a30$\u000fqy\u00179T7-|\u0006pe~w8|Uk~W\u001b\u0003\u0015KlxMH\u0017AQU[[+X\thAW.Z)\u007fB\u0018V#D\fz)>T\u0014l~\u007fg[;@_o8wI0\u00015.#\b\u0012\u001c*\u00039[_\u001fmL\u0014!^\u0003A\u0006>\u000fn6f\r\fW\u0017-\u0003Vb)\u0013bK#\"r[O\u0019MlSk)\u001f\u0012va(70\u0001PK;@\r\b(%\u00143>px\u0018*p\u000e9$0D;xl?0&\bW\u001eh\u0011(cEfE80\u001f\u0012)/\t=fb%2*oi5W\u0018?6E<\u0014q\u001f\u0019cm\u0002W3.\u0019|/\u0012\u0006\u001ey\fH*Ot9.='K[t==5\u0014OW\u0010\u0010ib~{h\u0007\u0013oda5s/@y\t&\u0018X<$4vS\u0004S3`*\u000e_pZ\u0002[\u001c&X;\u001fH1\u0002\u0005x\"=\\m&/|[\u0010i\b\u001f\\7RzB-\u001bDuQv{#D;HD;\u001d\nA3E\u0002@S\u007f~CI!\ru\u0001&Z!4\u001c:`\u001ff}UBq*40BXqn\u0003m\u007fd@< K%\u0004&p\u0019\u0005H~+Y?K%\tf`\u0007OYb9C?(l2Z\f9\u000bF2VZ\u001a}x%[7{e\u0002\u0007_\u0012\u0005>Q!\u001f]=\u0006Sj\u001bKMY\nXk>c\u000f{\u000ep5\u0014!Kyicrq-\u0002\u0001*\\P\u0007B(,p\u0006<H\u0015L\u001eH\u0011DVrvTxh\r\"[_\u0017\u001bMF\u0006\u0019s\u0001Jbe^\u0015\u00159;on\u0001ZiQA\u001a\u0011XY\u001b)\nL\\i61u%1l~8`WY\u0015mw\u0015I\u0006\u00139=OW1WJ\u001b_\u0016C'YW~:#W(\u0014\u0017<b\u0016\u001802j}\u0011\u0017NVWI{]\u001fhZj=}%\u0010<\u0010PU4B6\u0015pgM;\u000eQrR9'U\u001c\u0003{Xl j\u0003[eEYxIB?u)c}dDr_(p>EhldȦ\u0006g"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u000f", "", "/u^6W\u0013>U\u0015|\u000fL0~\u0012", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "1gT0^\u001d\n'\u0007\u0003|g", "", "1kT.e\fG`#\u0006\u0002f,\u0006\u0018", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gxgJC\u0019A6V~1P9N:g\\{K\u0014g", "2dR?l7M2\u0015\u000ev", "", "2`c.", "2d]0e@Ibwz\nZ\u0010\u0006\r>", "3mR?l7M2\u0015\u000ev", "3mR?l7M2\u0015\u000evB5\u0001\u0018", "3mR?l7MA(\f~g.", "", "5d]2e(MSv\t\u0003f0\fj/n\u007f5\u007f>n&\u0017R\\\u000eH\u0007%Ch", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rT1OTR;>R{=!\u0016X{]+\u0018qYM4nRF\f\b:Y\tJ>", "1n\\:b5)O&z\u0003l\u0019|\u0015?e\u000e7", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010N([r/U9N8lR\u0001Li", "1n\\:b5.a\u0019\fYZ;xu/q\u0010(\nO", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010S:N\u0004\u0006C[J\u0019\\^\u0003=\"!0", "D`[BX:", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", ">`c5<+", "5d]2e(MSw~\fb*|v>a\u000f8\n-\u0001#'G}\u001d", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kRQ=%\u0016X\u000e<:\t\u0014iO\u0011nPG\u001f\u0016;6\u0002Ix\b\u001bk", "/cS6g0H\\\u0015\u0006]^({\t<s", "5d]2e(MSy\u0003\u0004b:\u007fh8r\n/\u0003H\u0001 &4o\u001aLv3D", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kRSA\u001d\u0016h\u0011.4\u001a\u000f`H,nMF\f\b8Y\u0002Iwm\f$\u001e<yF", "5d]2e(MSz~\nK,~\r=t\u007f5f<\u0010\u001a\u0004G{\u001e<\u00054", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kRT=#~Z\u0010R9\u001c\u0005f, }G$\u001f\u0014<I\u0010JU\u0001\u001a&\u0015D@", "3ma<_3FS\"\u000eir7|", "AdV:X5M", "5d]2e(MS|\b~m\f\u0006\u00169l\u00070{I\u0010\u0004\u0017S\u007f\u000eJ\u0006", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kRVF\u0018!:\u0017[5\u0014\faA-}17+\u0018,W\u0011(h\u000f\u001c\u001d\u001d\u000b", "CrT?7(MO\u0006~\u0007n,\u000b\u0018", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}\u000e#hn\u0018\u0003r(;v3WL\\;2", "2de6V,\u001dO(zg^8\r\t=t", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}|\u0015ye7\u0007B(]r\u0014GX^,jaH", "<nc6Y0<O(\u0003\u0005g\u0010{", "5d]2e(MS\u0003\u0007\u0003b;\f\r8g_1\tJ\b\u001e\u0005Vo\u0019)v1EY\f/", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kR\\E\u001c\u0016i\u001dR4\u000fdbN.uK%.\b76\u0002Gx\u0001\u001a%z5x\u0001Iee", "5d]2e(MS\t\nyZ;|q9t\u0004)\u007f>|&\u001bQxq;c%Ai}.F", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}\u000e g]H\u0007L6]z(KJJ;`\\{!\u0013~Z\u001a^+\u001b\u0014/", "5dc\u0011X=BQ\u0019njB\u000b", "5dc\u0016W\u0015Hev\fz],\u0006\u00183a\u00076", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005O\u0013{\"h`9\u0010r0J}5\u001d", "5dc\u0016W\u0015He{\t\tm", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005O\u0013z\u0011va)\u0014j\u0002", "5dc\u001aX:LO\u001b~", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4g\u007fxo<nc:\\r)G9N:g\\{K\u0014g", ";rV", "7mXAF\u000b$", "1qT1X5MW\u0015\u0006\t", "6nbA", ">q^0X:L4\u001d\b~l/\\\u0012<o\u0007/\u0004@\n&\u0004G}\u0019F\u007f35", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\ra4QJN:j3vF\u0018 ]mW8\u0017\f`I$wS$\u001f\u00167S\u000bIhm\f$\u001e<yF", "4h]6f/\u001e\\&\t\u0002e4|\u0012>R\u007f6\u0007J\n%\u0017", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gulj=\u0015f\fW\u00041NSV,ea_=\"\u001dd\u0017\\+b", ">q^0X:L4\u001d\b~l/\\\u0012<o\u0007/\u0004@\n&\u0004G}\u0019F\u007f35B]}", ">q^0X:L7\"\u0003\n>5\n\u00136l\b(\u0005Om\u0017%Ry\u0017Jv", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\ra4QJN:j6{A#qc\u001bX2\u0014\rYJ3[DE*\u00125W\u0002(h\u000f\u001c\u001d\u001d\u000b", "7mXA85K] \u0006\u0003^5\fu/s\u000b2\u0005N\u0001", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gxqeHfl9X}.OLW;IR\u0001H\u001e\u001bh\u000e$", ">q^0X:L7\"\u0003\n>5\n\u00136l\b(\u0005Om\u0017%Ry\u0017Jv\u000e?9\u00071", "@db2g\fGd\u001d\f\u0005g4|\u0012>P{5wH\u000f", "@db2g\u001a!A\u0004\u000f\ta", "@db2g\u001a!A\u0007\u0003|g", "@db2g\u001cNW\u0018", "AdRBe,)W\"", ">h]", "D`[6W(MS\u0004\u0003\u0004", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public interface IDSecurityApi {
    void avoidLegacySign(Context context, Activity activity);

    boolean checkV19Sign(Context context, Activity activity);

    IdNowCommonResponse clearEnrollment(Context context, Activity activity);

    byte[] decryptData(Context context, Activity activity, byte[] bArr);

    byte[] dencryptDataInit(Context context, Activity activity, byte[] bArr);

    byte[] encryptData(Context context, Activity activity, byte[] bArr);

    byte[] encryptDataInit(Context context, Activity activity, byte[] bArr);

    String encryptString(Context context, Activity activity, String str);

    IDSecurityApiImpl.CommitGenericStepRequestResult generateCommitGenericStepRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, ArrayList<KeyValue> arrayList, String str);

    IDSecurityApiImpl.GenerateDeviceStatusRequestResult generateDeviceStatusRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, ArrayList<KeyValue> arrayList);

    IDSecurityApiImpl.GenerateFinishEnrollmentRequestResult generateFinishEnrollmentRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, ArrayList<KeyValue> arrayList);

    IDSecurityApiImpl.GenerateGetRegisterPathRequestResult generateGetRegisterPathRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, String str, String str2, ArrayList<KeyValue> arrayList);

    IDSecurityApiImpl.GenerateInitEnrollmentRequestResult generateInitEnrollmentRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, UserDataRequest userDataRequest, DeviceDataRequest deviceDataRequest, String str, String str2, ArrayList<KeyValue> arrayList);

    IDSecurityApiImpl.GenerateOmmittingEnrollStepRequestResult generateOmmittingEnrollStepRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, String str);

    UpdateNotificationIdRequest generateUpdateNotificationIdRequest(Context context, Activity activity, String str);

    String getDeviceUUID(Context context, Activity activity);

    IDCredentials getIdNowCredentials(Context context, Activity activity);

    IDBaseUrl getIdNowHost(Context context, Activity activity);

    PushMessageResponse getMessage(Context context, Activity activity, String str);

    void initSDK(Context context, Activity activity, IDCredentials iDCredentials, IDBaseUrl iDBaseUrl);

    IDSecurityApiImpl.ProcessFinishEnrollmentResponseResult processFinishEnrollmentResponse(Context context, Activity activity, FinishEnrollmentResponse finishEnrollmentResponse);

    IDSecurityApiImpl.ProcessFinishEnrollmentResponseResult processFinishEnrollmentResponseNEC(Context context, Activity activity, FinishEnrollmentResponse finishEnrollmentResponse);

    IDSecurityApiImpl.ProcessInitEnrollmentResponseResult processInitEnrollmentResponse(Context context, Activity activity, InitEnrollmentResponse initEnrollmentResponse);

    IDSecurityApiImpl.ProcessInitEnrollmentResponseResult processInitEnrollmentResponseNoEnv(Context context, Activity activity, InitEnrollmentResponse initEnrollmentResponse);

    IdNowCommonResponse resetEnvironmentParams(Context context, Activity activity);

    IdNowCommonResponse resetSHSPush(Context context, Activity activity);

    IdNowCommonResponse resetSHSSign(Context context, Activity activity);

    IdNowCommonResponse resetUuid(Context context, Activity activity);

    void securePin(Context context, Activity activity, String str);

    boolean validatePin(Context context, Activity activity, String str);
}
