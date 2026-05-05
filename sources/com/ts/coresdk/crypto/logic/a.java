package com.ts.coresdk.crypto.logic;

import android.content.Context;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.crypto.Encryptor;
import com.ts.coresdk.crypto.SignatureAuthenticator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
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
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\u0015\"4\u0012}\tnjG9LeN.ZS@\u000fsڔ<$i$yCAU\"}8\tWNmgvJp\u000bK\u000f\u0014&\u0001jBI]xc\u0012\u00172PģE\u0019cڎm9\u000f\r~,.7::\u0010\u0004/\u001bZL\u001ev\u0013Cy\u000bB4NrRR;N5\u001e \nV /!#\rߑ:JrbH5k*wIf)u/+N=Jb'%v\u0010\u001d[DE7-%\u0002\u00047ViC\u001b? @K\u000eҊ+-Oze<!=\"#CO;j#*j\u0005i`:&[SqMh\u000eVz+\u007f\u001b@\u001c\u000e4(x2;#~\b<;%vaJh\u0002\rC0~oB/%.>q]ӸjSgI']\u007f#\u0013\u001e6%\u0017mOk\u0005\u0012n\u00153T&PaUN?`N8\\mq\u0012tz\u0002X\u0005vlĬ3}\u0017?%7\u007f\u0017G99k0]tk\u0005\u0005xh\u0002h\u0003LN$\u0007\u0016e-9\u0012hH|\u0007\u0002O\u0003k\\\u0015[%l\u0007,\tC$j\u0002T!S$\u0015Ѡ'ʂiܔύ\u000e'5|Epʧk\u0010_9dJ"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@!\u000b", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "", ">0", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", ">1", "2dR?l7M", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{fkAPr:\u0018t1TL\\+b\u001cV,\u0002yd\r^2\rhbB.D\b\u001e$\u0004=EKBd\n\u000e_{DwtKXe", "3mR?l7M", "", ">2", ">3", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`vPm\u001bP\u00024?f<\u00027v\u0016;IR;Q42#OeG\u0016c5N\u0004|", ">4", "", "5d]2e(MS~~\u000fl", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D9\u001e$\u0004=EKBd\n\u000e_{DwtKXe.w\u001f}\u000b8v\u0010Wi\u0007GODhsb\u0019s(kD\u0004\u0004\u001do&/s_8\u0017:5\u0011{R\u0007cvG~zL2%qiUExUIJj\u0010", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\u0014#?}4Bi\u001a;,?Jg\n", "1", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D\b\u001e\u001d\u00124\u0013\u0011I2~\u0016#\u000eCiv\fT\u001d[\u0005$\u007f\u000b0rH]]C6/+b>o\bc*;6I i", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\">", "", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\u00139[\u0007\u0012;|\u0019\u0014MW(kB.\u001cw7", RemoteSettings.FORWARD_SLASH_STRING, "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"5*fZ<L\"[X\u0018[+\u001b\u0004_\u000b\"{XB.\u0012u7\u0006=q|\u001b&\u001b5F\u0001QY\u0010P\t\u0019s=8rS/F~CRA,1`\u0015afJIG(\u001dsn\u0011E74\u0014\u000bZ\u0015{\u001cwqtQ)\n<->{%$Oxd@}7\u001bZ\u007f\u0002\u001b\b\u001c[0p>\u007f}12m\u0007\u0015Q\u0015C^v$\u0002", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public interface a {
    Object a(Context context, ITSModuleInfo iTSModuleInfo, SignatureAuthenticator signatureAuthenticator, String str, byte[] bArr, Continuation<? super SignWithKeyResult> continuation);

    TSKeypairData c(Context context, ITSModuleInfo iTSModuleInfo, String str) throws Exception;

    String decrypt(Context context, String str, ITSModuleInfo iTSModuleInfo);

    String encrypt(Context context, String str, ITSModuleInfo iTSModuleInfo);

    void generateKeys(Context context, ITSModuleInfo iTSModuleInfo, String str, boolean z2, String str2, Encryptor.GenerateKeysListener generateKeysListener);
}
