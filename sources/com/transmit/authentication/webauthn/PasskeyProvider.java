package com.transmit.authentication.webauthn;

import android.content.Context;
import com.transmit.authentication.TSAuthCallback;
import com.transmit.authentication.TSWebAuthnAuthenticationError;
import com.transmit.authentication.TSWebAuthnRegistrationError;
import com.transmit.authentication.network.completeauth.TSPublicKeyCredential;
import com.transmit.authentication.network.completereg.TSRegPublicKeyCredential;
import com.transmit.authentication.network.startauth.CredentialRequestOptions;
import com.transmit.authentication.network.startregister.CredentialCreationOptions;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS@\u000fs{J$c$wCCU0}*\teNog\u0005JbŏK\u000f\u0014\u001f\u0001̓2.kތ\u000e\u0012=1\u000b\u001aM3eok:\u0011xD\u000782P;*\t\u000f\u001eBH>{+SY\u0012*<PrJR;U\u0015\u001c\"\u0006l)/%#\f\u0017`Vvu:]$3mPP?_^\u007f}\u0011T_?\r%mN;N=M!5U\u0013\u0007\u0001hO\u0005Oqk\u0013\u0017.mO\u0012yeEp\u007fB%qsվa\u0004"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@75Vy0Fp\u001fw8?Iy:\u001e)SnC\u0018g+N\u0004|", "", "3wT0h;>E\u0019{vn;\u007f\u0012\u000bu\u000f+{I\u0010\u001b\u0015C~\u0012F\u007f", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1qT1X5MW\u0015\u0006g^8\r\t=ti3\u000bD\u000b %", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?Hz0.$k+\u0017\u0014c+N\u007f6KHU\u0019\\^\u0003=\"!D\u0019]/\u0017\u000eg\u0017", "1`[9U(<Y", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#5\u000e/:K\u00125T@7i:s", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015dqH\n-\u001b<a7DSR*BR\u0007\u001b!\u0012Y\u000eW:\u0011\u0001`\u0017", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", "3wT0h;>E\u0019{vn;\u007f\u0012\u001ce\u0002,\nO\u000e\u0013&Ky\u0017", "1qT1X5MW\u0015\u0006Xk,x\u00183o\t\u0012\u0007O\u0005! U", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu,\u0004'FLW;`Ny\u001b!\u0012V\u001dR5\u0016ndP(xMEt", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015ua;PR\u001a;v)2\\K3`PX=(og\u000eM+\u0016\u0014]=+D", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", "7rF2U\bNb\u001c\bhn7\b\u0013<t\u007f'", "", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public interface PasskeyProvider {
    void executeWebauthnAuthentication(Context context, CredentialRequestOptions credentialRequestOptions, TSAuthCallback<TSPublicKeyCredential, TSWebAuthnAuthenticationError> tSAuthCallback);

    void executeWebauthnRegistration(Context context, CredentialCreationOptions credentialCreationOptions, TSAuthCallback<TSRegPublicKeyCredential, TSWebAuthnRegistrationError> tSAuthCallback);

    boolean isWebAuthnSupported();
}
