package com.ts.coresdk.crypto.biometrcis;

import androidx.fragment.app.FragmentActivity;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.crypto.Encryptor;
import com.ts.coresdk.crypto.SignatureAuthenticator;
import com.ts.coresdk.crypto.TSKeyPair;
import com.ts.coresdk.crypto.api.CryptographyBiometricSignResult;
import com.ts.coresdk.crypto.api.ICryptographyBiometricSignCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012}\u0007njO0L͜P.`_2şs{J$c$wECU(}*\tUPog|ZbŏK\u000f\u001c\u0016\u0001̓2Nkތ\u000e$\u001f4Rom3]qM9\u000fuF\u000702P:(\u0004A=:L\u001ey\u0013Cy\f\"4NtRR;R\u0015\u001e \fV /%lk\\>`l\fCǥ'\u0003wL\u0017=m=\u0015M;T\u0005+\u001b\u0006y\u001eYAg9#5k\u00035T\"QK]\u007fN\u001dhU5[M\u0002[NX.\u0019E/]\u001furTo5Un\u001c?+}e\u0012dV8\u0006\u000f\u0014\u000fR\u0003<\u001bWL<=2f6\u0010y\u0007CbNT\u001a^p\u0005ѐe<\u001fӛ\u001851D)rЈeQ"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi&[r2WK;zA\"\u0013NaMq_0[L", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u00065U\u000ePa!9fS", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D5{/;~\u001a=a\u0019", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7tg.Wc'U\\U;2", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW T2Id\r*9z\u00129PW\u0018o>&\u0015wn=\u0005Q0P\u007f\u0005CSU)XPx\u0013", "1n]AX?M", ";nSB_,\"\\\u001a\t", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", "9dh!T.", "", ">tQ9\\*$S-]vm(", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`vPm\u001bP\u00024?f<\u000bGj\u001d2K);\u007f\u0013\u001a$d7", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`(|\n>~%>hY\u001eFq'2\\W\u0011R2(\u001d2pGPa6[v5FR\u0018\u0010K@ZG\u0013\"a\u000e24\u000e\u000f/()jU3h\u000f(R\u0004\u0005V\u0010\u0019\u001a\u00177@W@`\u0018\u0011\t#??3uFg^\u007f\u0011?Rv5s\u0016)|e8G8\u001f\u0001#(';>\u0007\u0003W\u000fXR\u000eFcV\u0015P{\u0015", "5dc\u001ab+NZ\u0019b\u0004_6", "u(;0b4\bb'Hxh9|\u0017.kI\fj.h!\u0016Wv\u000e \u007f&?/", "@dcBe5,W\u001b\bg^:\r\u0010>", "", "@dbB_;", ":hbAX5>`", "AhV;", "2`c.G6,W\u001b\b", "", "AhV;T;N`\u0019Z\u000bm/|\u0012>i}$\u000bJ\u000e", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\">", "1na2 (GR&\t~]s\u000b\b5_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSBiometricKeyPair extends TSKeyPair<FragmentActivity, CryptographyBiometricSignResult, ICryptographyBiometricSignCallback> {
    private final ITSModuleInfo moduleInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TSBiometricKeyPair(FragmentActivity fragmentActivity, ITSModuleInfo iTSModuleInfo, String str, Encryptor.PublicKeyData publicKeyData) {
        super(fragmentActivity, iTSModuleInfo, str, publicKeyData);
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(publicKeyData, "");
        this.moduleInfo = iTSModuleInfo;
    }

    public final ITSModuleInfo getModuleInfo() {
        return this.moduleInfo;
    }

    @Override // com.ts.coresdk.crypto.TSKeyPair
    public void returnSignResult(CryptographyBiometricSignResult cryptographyBiometricSignResult, ICryptographyBiometricSignCallback iCryptographyBiometricSignCallback) {
        Intrinsics.checkNotNullParameter(cryptographyBiometricSignResult, "");
        Intrinsics.checkNotNullParameter(iCryptographyBiometricSignCallback, "");
        iCryptographyBiometricSignCallback.onResult(cryptographyBiometricSignResult);
    }

    @Override // com.ts.coresdk.crypto.TSKeyPair
    public void sign(ITSModuleInfo iTSModuleInfo, byte[] bArr, ICryptographyBiometricSignCallback iCryptographyBiometricSignCallback) {
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(iCryptographyBiometricSignCallback, "");
        super.sign(iTSModuleInfo, bArr, iCryptographyBiometricSignCallback);
    }

    @Override // com.ts.coresdk.crypto.TSKeyPair
    public SignatureAuthenticator signatureAuthenticator(ICryptographyBiometricSignCallback iCryptographyBiometricSignCallback) {
        Intrinsics.checkNotNullParameter(iCryptographyBiometricSignCallback, "");
        return new TSBiometricProviderApi23AndAbove(getContext(), iCryptographyBiometricSignCallback.getKeyPairSignBiometricPromptTexts());
    }
}
