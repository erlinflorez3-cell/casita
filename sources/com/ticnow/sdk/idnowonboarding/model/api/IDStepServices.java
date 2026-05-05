package com.ticnow.sdk.idnowonboarding.model.api;

import android.app.Activity;
import android.content.Context;
import com.ticnow.sdk.idnowonboarding.model.api.IDStepServicesImpl;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import com.ticnow.sdk.idnowsecurity.http.request.CommonParamsRequest;
import com.ticnow.sdk.idnowsecurity.http.request.CommonUserDataRequest;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"ЯV\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\b<$a%yCQU\"}8\tWN}gvϺb\u000bY\u000f\u000e\u0016~m4Ikxe܈\u00172XoG\u074cUoS9ht<\u0005&\u00178\u0600*\u0005/\u0019r\u001b\u001ev\u0013Cy\rB4NrRR;P5\u001e \nV /#\rk\\<`l\fA_'\u0011qZNUh`\u0001[\u0017^TU\u0016'e,6X7c\u001eUk\u0011\u0013joO\u0005Oqk\u0013~&U82{g8h\u007fB#ANkl9J%o_p$'Y`\u0014O^\u0010@w)~=@\u0012\u0012\u001e'v3]\u001et\u000e&3#y\u0004D^\nvB.\u0004\u0012:%/\u00183YBKj_sS\u0019|@,\t\u001b1;\u0001\u001d*\fX\u001ct-\u001b\u0003\u0001\u00025_UUH|\u0013\nU{\u0010\tv\u0012,\u00140u\u000eEz?;\u007f-G]I#Oy\u0018G#v=))Sa\u007fjHn9\u001f\u001aE,!\f\tG\u0015\tyTlXZ\u0016} b\r\u0016\bA'\r{J)=\u0010|X\u0019mxWu\nS8\u0017;g\u0001\u0004\u000e\u0006B\u000f7Cd{\u0010\u0010['\u0018MPz\u0005\u0007orW\u001aot(P;x\u0003\u001e\u0004\u0014X^\u000e#2m\u007f23Z>\u0002d%J\u0013\u001epO\u0013\b>i/4G?A<\u001biR\u000e9\u0005^^\to\u0016{y0\u000bd:-oVe\u001d4[:hb\u0004S\u000b\r\u000e\u0018G\u0016gwPz\u001e\u000eU*)F\u001eG[G=A\u0018/=@\u001eEU\\tuQ{ U\be\u007f\u001f=x.\u0016\u0016I\u007f\\xxVgh'$\u0007^!1\u001ec.\u0007JN\u000bIsT9iTHQ\u0012 `ҧ<\u001a"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ$", "", "5d]2e(MSt\bve0\u0012\t\u000en\u0004\u0015{L\u0011\u0017%V", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ24gY1\u001f\u0014\u001bZ\u001bJ:\r`b=+rY7}\u001106\u0002Gx\u0001\u001a%z5x\u0001Iee", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "1n\\:b5)O&z\u0003l\u0019|\u0015?e\u000e7", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010N([r/U9N8lR\u0001Li", ">`c5<+", "", "CtX17,OW\u0017~", "1nd;g9R", "/cS6g0H\\\u0015\u0006]^({\t<s", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5d]2e(MS\u0001z\n\\/\\\u0012<o\u0007/\\<~\u0017\u0004G{\u001e<\u00054", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ24gY1\u001f\u0014\u001bZ\u001bJ:\rlUP\"q$@,\u00123Pb7f\u0001x\u0016\u001aEj~QC\u0010U\n\u001c\u0005\u0017", "4`R2@(I", "Adb@\\6G7\u0018", ":he29(<S", "4`R24<=W(", "5d]2e(MS\u0001z\n\\/]\u0005-el(\bP\u0001%&", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ24gY1\u001f\u0014\u001bZ\u001bJ:\rlUP\"q%3\u001d\b\u0019I\u000eKh\u000f\u001b\u0003\u000eCzwQ,", "5d]2e(MS\u0006~|b:\f\t<P\u00032\u0005@m\u0017#Wo\u001cK", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwIN?5\u0018|\u0003waDtc9_z%GZ24gY1\u001f\u0014\u001bZ\u001bJ:\rqYC(|S7,r/S\u000b;U\u0001\u0018&\u000eCy]Bd N\tj", "1n\\:b5.a\u0019\fYZ;xu/q\u0010(\nO", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010S:N\u0004\u0006C[J\u0019\\^\u0003=\"!0", "BqP;f(<b\u001d\t\u0004=(\f\u0005", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public interface IDStepServices {
    IDStepServicesImpl.GenerateAnalizeDniRequestResult generateAnalizeDniRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, String str, String str2, String str3, ArrayList<KeyValue> arrayList);

    IDStepServicesImpl.GenerateMatchEnrollFaceRequestResult generateMatchEnrollFaceRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, String str, String str2, String str3, String str4, String str5, String str6, ArrayList<KeyValue> arrayList);

    IDStepServicesImpl.GenerateMatchFaceRequestResult generateMatchFaceRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, String str, String str2, String str3, String str4, String str5, String str6, ArrayList<KeyValue> arrayList);

    IDStepServicesImpl.GenerateRegisterPhoneRequestResult generateRegisterPhoneRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, String str, String str2, ArrayList<KeyValue> arrayList, ArrayList<KeyValue> arrayList2);
}
