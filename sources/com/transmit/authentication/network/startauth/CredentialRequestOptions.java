package com.transmit.authentication.network.startauth;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4C\u0007\"B\u0012\u007fјnjG?Le^.ZS0\u000fs{B(c$w\\CU(\u0007*\tUNog|Pb\u000bI\u000f\fǤ~\u0001ߚyU'\\RhBH}?KO\u0006<ga\u0005<\u0013\"J$Nx3\u0002*0V\u0013\u000f|YJ:\u0013@F~>j\u000fc\u0004H\u0017\u0016J.\u00076dwPFH\u001beP.Q\nyH\\0w2\u0013L;Gd-\u001b\u0001y A?e@%+a\u000f\u001fTq>1@џA\u0005v4o4W\u0010o8n~B\u0016q̈́\u000e&{4y\u001dSv\u000bU,\u0016ӱL\u0019\u00176\u0016\u0013}#;2\u000fLϰIv6(\u0006 \u0010Is!X\u0007ї\u0003'V\u000e\u001by>''\u00103YA1e\u007fh\u0002БOѼ\u007f\u0005\u001b-k\n|BsV$_C\u001c\u001bɴRy_N_`P XkxJΖc͆.\u0004>`H8\n4F\u0019;6\n:iݰlJ;R\f\u000f\u0005\u000få\u0004qXHN\"\u0007\u0018M)7\r\u000bLj\u0005yRlZB\u0010{\u001d\u0005\u000f\u0004\b!#tyR S\u0011~WnixQu\f;.\u0015<\n|q\u000ee?v;ESs\u0010\u0010Z\r\u0013mC\u0013\r^fP\\$\\r'P3xr\u0016w\nNf\u000e)1m|L<21'h-J\u0019\u001dpBCɈ^˖l\u0010\ry{5\u0011\u0010<t7(\u0001b~\u0018\u007fz_++_hϡB\u001a<'Om\"\u0017^Cʔ\u0006Gz\u000er\u007fLuM3،t&\u0015.\u001c2Aa1M\u0013=\u0007?104։PzmQ[\"?|\u0003\b\u001dJ9?u\u0014\u0003rB_\u0019KׅX\u001d*Ԯvt)\u0019r\u0012JrTz_ej\n\n?ϗv\taߢf:\u0003\u0018-0u\u0012}&\u00157CBU\"ə{\u001a7֒y_o\u0004<\u000f3 4v}\u0006BbDp͈Uc:ծPK_\u0015L4t}\u0011K`l\u000e\u0007p\nΌ\u00119PШ|r\\O[\u001d\u007f\u0011t\u0011D\u000f\u0007U\nE݇s\u0006<.mD\fE\u0004,l\\u\"[V\u007fo\u0004J\u000b\fΊ\u0013\u0010\u0013֊Ip\u00187K2ݱ[\u000f"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?Hz0.$k+\u0017\u0014c+N\u007f6KHU\u0019\\^\u0003=\"!D\u0019]/\u0017\u000eg\u0017", "", "1gP9_,GU\u0019", "", "@`f\u0010[(EZ\u0019\b|^", "CrT?I,KW\u001a\u0003xZ;\u0001\u00138", "3wc2a:B]\"\r", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "/k[<j\nKS\u0018~\u0004m0x\u0010=", "", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?Hz0.$k+\u0015\u000ej6`T4GKN5kVnD\"g", "@o81", "Bh\\2b<M", "", "/sc2f;:b\u001d\t\u0004", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3X9^\u001cwK\u001e\u001b$r<\u0015unVF$lS\r\u0015n*S\n\u0005w\u000e\b\u001f\u001c=n\u007f\fR V|\u0015~P-fBhc\u0004P\u000bNb9v\u0016l#&HI !\u0001\u0015+wSwe\u0003Z\u001b\u00050\u0007gfG\"\n< E{1-Jkf8>.\u001bT}A\u007fAex4v\u0003j9&G`NRc!@(W\u001f<YH'{\u001dA\u000fPG-|hG\u00102\rp\u0015\u0012k7\u0007\\V", "5dc\u000e_3Hev\fz],\u0006\u00183a\u00076", "u(J\u0019V6F\u001d(\fvg:\u0005\r>/{8\u000bC\u0001 &Km\nKz/>#\u0007 F\u007f ;S\rIz0+$dqH\n-\bU}1Y*[,[R{L\u0018\u000ea\u001c$", ")KR<`uM`\u0015\b\tf0\fR+u\u000f+{I\u0010\u001b\u0015C~\u0012F\u007fn>Y\r2Az\u001cw[R7xC\u001a%wd\u0003bj3X\t\u0005TLM,eav9\u001b 0", "5dc\u000eg;>a(z\nb6\u0006", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010[(EZ\u0019\b|^", "5dc\u0012k;>\\'\u0003\u0005g:", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "5dc\u001fT>\u001cV\u0015\u0006\u0002^5~\t", "5dc\u001fc\u0010=", "5dc!\\4>])\u000e", "u(;7T=:\u001d z\u0004`u[\u0013?b\u0007(Q", "\u001aiPCTuEO\"\u0001D=6\r\u00066eU", "5dc\"f,KD\u0019\f~_0z\u0005>i\n1", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3X9^\u001cwK\u001e\u001b$r<\u0015unVF$lS\r\u0015n*S\n\u0005w\u000e\b\u001f\u001c=n\u007f\fR V|\u0015~P-fBhc\u0004P\u000bNb9v\u0016l#&HI !\u0001\u0015+wSwe\u0003Z\u001b\u00050\u0007gfG\"\n< E{1-Jkf8>.\u001bT}A\u007fAex4v\u0003j9&G`NRc!@(W\u001f<YH'{\u001dA\u000fPG-|hG\u00102\rp\u0015\u0012k7\u0007\\LcmPX\u0016j\u0013dCic\u0010\u0001N\u0016MLo\u001e6J|>j}\u001f\u0012P-mt[M(ZJ(\u007f@/n\r\u0013\u0012iay;\u0016<Y\u0018w.[>:\u0013\u0015x8\u001a\u000bCN$tR\u0019{!", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class CredentialRequestOptions {
    private final AllowCredentials[] allowCredentials;
    private final String attestation;
    private final String challenge;
    private final JSONObject extensions;
    private final String rawChallenge;
    private final String rpId;
    private final Double timeout;
    private final String userVerification;

    public CredentialRequestOptions(String str, String str2, String str3, JSONObject jSONObject, AllowCredentials[] allowCredentialsArr, String str4, Double d2, String str5) {
        this.challenge = str;
        this.rawChallenge = str2;
        this.userVerification = str3;
        this.extensions = jSONObject;
        this.allowCredentials = allowCredentialsArr;
        this.rpId = str4;
        this.timeout = d2;
        this.attestation = str5;
    }

    public static /* synthetic */ CredentialRequestOptions copy$default(CredentialRequestOptions credentialRequestOptions, String str, String str2, String str3, JSONObject jSONObject, AllowCredentials[] allowCredentialsArr, String str4, Double d2, String str5, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = credentialRequestOptions.challenge;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = credentialRequestOptions.rawChallenge;
        }
        if ((4 & i2) != 0) {
            str3 = credentialRequestOptions.userVerification;
        }
        if ((8 & i2) != 0) {
            jSONObject = credentialRequestOptions.extensions;
        }
        if ((16 & i2) != 0) {
            allowCredentialsArr = credentialRequestOptions.allowCredentials;
        }
        if ((32 & i2) != 0) {
            str4 = credentialRequestOptions.rpId;
        }
        if ((i2 + 64) - (64 | i2) != 0) {
            d2 = credentialRequestOptions.timeout;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            str5 = credentialRequestOptions.attestation;
        }
        return credentialRequestOptions.copy(str, str2, str3, jSONObject, allowCredentialsArr, str4, d2, str5);
    }

    public final String component1() {
        return this.challenge;
    }

    public final String component2() {
        return this.rawChallenge;
    }

    public final String component3() {
        return this.userVerification;
    }

    public final JSONObject component4() {
        return this.extensions;
    }

    public final AllowCredentials[] component5() {
        return this.allowCredentials;
    }

    public final String component6() {
        return this.rpId;
    }

    public final Double component7() {
        return this.timeout;
    }

    public final String component8() {
        return this.attestation;
    }

    public final CredentialRequestOptions copy(String str, String str2, String str3, JSONObject jSONObject, AllowCredentials[] allowCredentialsArr, String str4, Double d2, String str5) {
        return new CredentialRequestOptions(str, str2, str3, jSONObject, allowCredentialsArr, str4, d2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialRequestOptions)) {
            return false;
        }
        CredentialRequestOptions credentialRequestOptions = (CredentialRequestOptions) obj;
        return Intrinsics.areEqual(this.challenge, credentialRequestOptions.challenge) && Intrinsics.areEqual(this.rawChallenge, credentialRequestOptions.rawChallenge) && Intrinsics.areEqual(this.userVerification, credentialRequestOptions.userVerification) && Intrinsics.areEqual(this.extensions, credentialRequestOptions.extensions) && Intrinsics.areEqual(this.allowCredentials, credentialRequestOptions.allowCredentials) && Intrinsics.areEqual(this.rpId, credentialRequestOptions.rpId) && Intrinsics.areEqual((Object) this.timeout, (Object) credentialRequestOptions.timeout) && Intrinsics.areEqual(this.attestation, credentialRequestOptions.attestation);
    }

    public final AllowCredentials[] getAllowCredentials() {
        return this.allowCredentials;
    }

    public final String getAttestation() {
        return this.attestation;
    }

    public final String getChallenge() {
        return this.challenge;
    }

    public final JSONObject getExtensions() {
        return this.extensions;
    }

    public final String getRawChallenge() {
        return this.rawChallenge;
    }

    public final String getRpId() {
        return this.rpId;
    }

    public final Double getTimeout() {
        return this.timeout;
    }

    public final String getUserVerification() {
        return this.userVerification;
    }

    public int hashCode() {
        String str = this.challenge;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rawChallenge;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userVerification;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        JSONObject jSONObject = this.extensions;
        int iHashCode4 = (iHashCode3 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        AllowCredentials[] allowCredentialsArr = this.allowCredentials;
        int iHashCode5 = (iHashCode4 + (allowCredentialsArr == null ? 0 : Arrays.hashCode(allowCredentialsArr))) * 31;
        String str4 = this.rpId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d2 = this.timeout;
        int iHashCode7 = (iHashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str5 = this.attestation;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "CredentialRequestOptions(challenge=" + this.challenge + ", rawChallenge=" + this.rawChallenge + ", userVerification=" + this.userVerification + ", extensions=" + this.extensions + ", allowCredentials=" + Arrays.toString(this.allowCredentials) + ", rpId=" + this.rpId + ", timeout=" + this.timeout + ", attestation=" + this.attestation + ")";
    }
}
