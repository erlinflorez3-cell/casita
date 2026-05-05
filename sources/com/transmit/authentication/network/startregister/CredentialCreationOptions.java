package com.transmit.authentication.network.startregister;

import java.util.Arrays;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tvAӄLeV=ZS@\u000fsڔ<$i(yّCU0}*\tUfog|Sb\u000bI\u000f\u000e\u0016\u0007p4I[xc\u070f\u0015Hԏ ?aL0~Id\u00036\u001d `#H}\u0013\u00032*v\u0013\u0007~QO$\u0012^E\u0001D`\u0013e\u000b*\u0014\u0016>N\tLcwRDQ\u0005]h93\u0007wMf'\u000e<\rQ\u001bSl';{Ґ\"+NE}\u001c3p\u001b\u0007\u0001\\\u0006ƨ@:D\u0013\u0007?'YL:ʕ7!\u0007\"4CO;b9ͭ]Mcn,?1_e[P<0&\u0002Bɥ=Ǭ\u0012\u00065]v4(\b \u000ea~9զA\u0019\tld\u0018z\u0010B]Ԣ\u0001{2G>~Q\u0010@_ؒ8D]\u001bB;\u0001\u001dď\fZ\u0014`#\u001blw\u007f2\u0002FCH\\\fq=\u001c\u0007!h\b*\u00124_\u007f]\u0001A:\u001d%EaQ)1m\u0012Hro%\f\u0011nYi`QX\"\u001d g0\u000f\fhO|\u0005\u001a\\\u0005^2\u0011[)l\u0007,\rYم[ʟ@!35\u0017`v\u0010\u0003M\f1U5t_qp\u0002\r\u00068%ۿ6\u001aj\u001e\u000bjvBi\u0003ь\u0004!mP~$Z\u000b-hŌG;\u001f\u0006\t\\N:\u0018\u0558Cw$عD3\u001fk#XS-PL\u0015\t\u000efӳ\u0014\u0005\\՜<\u0005o5\u0003\u001bQ_jt\bg'Nض\u0001f*ΊYS;,4er\u007fB\u0003;\r\u000fu\u0010G\u0016TuS̡\u001a}]{.,2;WCK(_\u000e72\u001a-sMȌiWUȼ?|\u0003\u0011\u001dS9=u\u0011\u0003pZjʧNU\\ϟ:xd\f1\"5\u000f\bc^zufӝ\u000faFδ\u000b\u0005_W\\Tٱ\tK"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu,\u0004'FLW;`Ny\u001b!\u0012V\u001dR5\u0016ndP(xMEt", "", "@o", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu@v$#\\]/e?}\u0013", "CrT?", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu@v$#\\]/eB\u0001=!g", "1gP9_,GU\u0019", "", ">tQ\u0018X@\u001c`\u0019}eZ9x\u0011=", "", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu@v$#\\]/e0\u007f=\u0013|V\u001bJ3\u001bZ", "Bh\\2b<M", "", "/tc5X5MW\u0017z\nh9j\t6e}7\u007fJ\n", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu@v$#\\]/e.\u0003L\u0017\u0012c\u001dR)\t\u0014cN\u0012nK7\u001d\u00170S\u000b\u0011", "/sc2f;:b\u001d\t\u0004", "uKR<`uM`\u0015\b\tf0\fR+u\u000f+{I\u0010\u001b\u0015C~\u0012F\u007fn>Y\r2Az\u001cw[R7xC+\u0015jeG\u0016c9\u0018h'D(^;_[_HixX\u0018Vt\u001c\u0012UJ2vHFh\u0004<X\u0005;q\u0010\u0010\u0014\nDnzK \u0019G\t'\u007fN/2Th[\u0007VNEd.r\u001b_*&,:!o\u0002(\u001eq@<\n\t)wwN\u000bc1N\u0015\u0004:m,|hJNq+2[%)SE\u0007\u001f.a\u00033x<M0:Eg\u0005Tv\u001c<Z\b\u00196e\u000b0&EN\u001dLQ-\u0004{:\u001bw,a\n\u0012pD1&/WcEj\u0017l\u001ad\u0013n_\u007f\"N\u0013:Q}j\u0006-|LcC$\u0016\u0003-{mMRdP\u0011)sD+n\u0015\u0001~u\u001c&7_FY\u001ez4l=\u0017!\u0018dE\u001b\tYE\u0019~W\u0010z\u0015d[TK4E{\u001a%1BN<\u007faGm\f%>\u000ex~$sgQ}@\u001cz\fBUI^*6\u0007pUk\u0007vE (/\u0007EC", "5dc\u000eg;>a(z\nb6\u0006", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u000eh;AS\"\u000e~\\(\f\u0013<S\u007f/{>\u0010\u001b!P", "u(;0b4\bb&z\u0004l4\u0001\u0018xa\u00107~@\n&\u001bEk\u001d@\u0001.~b}/Iw#4\u0017QJgA-\"hc=\u0015r,[@\u0019GI*<kU{\u0019$!]\u000eW:\u0011\u0003UP.{27&\b*X\u0006EqV", "5dc\u0010[(EZ\u0019\b|^", "5dc\u001dh)$S-\\\b^+g\u0005<a\b6", "u(J\u0019V6F\u001d(\fvg:\u0005\r>/{8\u000bC\u0001 &Km\nKz/>#\u0007 F\u007f ;S\rIz0+$ua;\u000bq;N\u0004p9LK\blauFq\u001fZ\r9'\u001a\u0001aOy", ")KR<`uM`\u0015\b\tf0\fR+u\u000f+{I\u0010\u001b\u0015C~\u0012F\u007fn>Y\r2Az\u001cw[R7xC+\u0015jeG\u0016c9\u0018h'D(^;_[PJ\u0014\u0011E\n['\u0015\u0013/", "5dc\u001fc", "u(;0b4\bb&z\u0004l4\u0001\u0018xa\u00107~@\n&\u001bEk\u001d@\u0001.~b}/Iw#4\u0017QJgA-\"hc=\u0015r,[@\u0019GI*<kU{*\u001fg", "5dc!\\4>])\u000e", "u(3", "5dc\"f,K", "u(;0b4\bb&z\u0004l4\u0001\u0018xa\u00107~@\n&\u001bEk\u001d@\u0001.~b}/Iw#4\u0017QJgA-\"hc=\u0015r,[@\u0019GI*<kU{-\"\u0012gc", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n_F", "uKR<`uM`\u0015\b\tf0\fR+u\u000f+{I\u0010\u001b\u0015C~\u0012F\u007fn>Y\r2Az\u001cw[R7xC+\u0015jeG\u0016c9\u0018h'D(^;_[_HixX\u0018Vt\u001c\u0012UJ2vHFh\u0004<X\u0005;q\u0010\u0010\u0014\nDnzK \u0019G\t'\u007fN/2Th[\u0007VNEd.r\u001b_*&,:!o\u0002(\u001eq@<\n\t)wwN\u000bc1N\u0015\u0004:m,|hJNq+2[%)SE\u0007\u001f.a\u00033x<M0:Eg\u0005Tv\u001c<Z\b\u00196e\u000b0&EN\u001dLQ-\u0004{:\u001bw,a\n\u0012pD1&/WcEj\u0017l\u001ad\u0013n_\u007f\"N\u0013:Q}j\u0006-|LcC$\u0016\u0003-{mMRdP\u0011)sD+n\u0015\u0001~u\u001c&7_FY\u001ez4l=\u0017!\u0018dE\u001b\tYE\u0019~W\u0010z\u0015d[TK4E{\u001a%1BN<\u007faGm\f%>\u000ex~$sgQ}@\u001cz\fBUI^*6\u0007pUk\u0007vE (/\u0007E9>xfA6\"y\u0017v\u0005\u0019l\b4\u0012BDIs1@aG\u0014@d[Y5M$Aj\u0002\u001c\fi\u00031W}\u001b\u007f\u0006/\u0007\"\u001c9oST\u001ff\u001b8u\u0010\b\u0011M*/\u0017\u0010\\X\u001f7\u001e}LR#\f1", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class CredentialCreationOptions {
    private final String attestation;
    private final WebAuthnAuthenticatorSelection authenticatorSelection;
    private final String challenge;
    private final WebAuthnCredParams[] pubKeyCredParams;
    private final WebAuthnRp rp;
    private final double timeout;
    private final WebAuthnUser user;

    public CredentialCreationOptions(WebAuthnRp rp, WebAuthnUser user, String challenge, WebAuthnCredParams[] pubKeyCredParams, double d2, WebAuthnAuthenticatorSelection authenticatorSelection, String attestation) {
        Intrinsics.checkNotNullParameter(rp, "rp");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(pubKeyCredParams, "pubKeyCredParams");
        Intrinsics.checkNotNullParameter(authenticatorSelection, "authenticatorSelection");
        Intrinsics.checkNotNullParameter(attestation, "attestation");
        this.rp = rp;
        this.user = user;
        this.challenge = challenge;
        this.pubKeyCredParams = pubKeyCredParams;
        this.timeout = d2;
        this.authenticatorSelection = authenticatorSelection;
        this.attestation = attestation;
    }

    public static /* synthetic */ CredentialCreationOptions copy$default(CredentialCreationOptions credentialCreationOptions, WebAuthnRp webAuthnRp, WebAuthnUser webAuthnUser, String str, WebAuthnCredParams[] webAuthnCredParamsArr, double d2, WebAuthnAuthenticatorSelection webAuthnAuthenticatorSelection, String str2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            webAuthnRp = credentialCreationOptions.rp;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            webAuthnUser = credentialCreationOptions.user;
        }
        if ((4 & i2) != 0) {
            str = credentialCreationOptions.challenge;
        }
        if ((8 & i2) != 0) {
            webAuthnCredParamsArr = credentialCreationOptions.pubKeyCredParams;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            d2 = credentialCreationOptions.timeout;
        }
        if ((i2 + 32) - (32 | i2) != 0) {
            webAuthnAuthenticatorSelection = credentialCreationOptions.authenticatorSelection;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            str2 = credentialCreationOptions.attestation;
        }
        return credentialCreationOptions.copy(webAuthnRp, webAuthnUser, str, webAuthnCredParamsArr, d2, webAuthnAuthenticatorSelection, str2);
    }

    public final WebAuthnRp component1() {
        return this.rp;
    }

    public final WebAuthnUser component2() {
        return this.user;
    }

    public final String component3() {
        return this.challenge;
    }

    public final WebAuthnCredParams[] component4() {
        return this.pubKeyCredParams;
    }

    public final double component5() {
        return this.timeout;
    }

    public final WebAuthnAuthenticatorSelection component6() {
        return this.authenticatorSelection;
    }

    public final String component7() {
        return this.attestation;
    }

    public final CredentialCreationOptions copy(WebAuthnRp rp, WebAuthnUser user, String challenge, WebAuthnCredParams[] pubKeyCredParams, double d2, WebAuthnAuthenticatorSelection authenticatorSelection, String attestation) {
        Intrinsics.checkNotNullParameter(rp, "rp");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(pubKeyCredParams, "pubKeyCredParams");
        Intrinsics.checkNotNullParameter(authenticatorSelection, "authenticatorSelection");
        Intrinsics.checkNotNullParameter(attestation, "attestation");
        return new CredentialCreationOptions(rp, user, challenge, pubKeyCredParams, d2, authenticatorSelection, attestation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialCreationOptions)) {
            return false;
        }
        CredentialCreationOptions credentialCreationOptions = (CredentialCreationOptions) obj;
        return Intrinsics.areEqual(this.rp, credentialCreationOptions.rp) && Intrinsics.areEqual(this.user, credentialCreationOptions.user) && Intrinsics.areEqual(this.challenge, credentialCreationOptions.challenge) && Intrinsics.areEqual(this.pubKeyCredParams, credentialCreationOptions.pubKeyCredParams) && Intrinsics.areEqual((Object) Double.valueOf(this.timeout), (Object) Double.valueOf(credentialCreationOptions.timeout)) && Intrinsics.areEqual(this.authenticatorSelection, credentialCreationOptions.authenticatorSelection) && Intrinsics.areEqual(this.attestation, credentialCreationOptions.attestation);
    }

    public final String getAttestation() {
        return this.attestation;
    }

    public final WebAuthnAuthenticatorSelection getAuthenticatorSelection() {
        return this.authenticatorSelection;
    }

    public final String getChallenge() {
        return this.challenge;
    }

    public final WebAuthnCredParams[] getPubKeyCredParams() {
        return this.pubKeyCredParams;
    }

    public final WebAuthnRp getRp() {
        return this.rp;
    }

    public final double getTimeout() {
        return this.timeout;
    }

    public final WebAuthnUser getUser() {
        return this.user;
    }

    public int hashCode() {
        return (((((((((((this.rp.hashCode() * 31) + this.user.hashCode()) * 31) + this.challenge.hashCode()) * 31) + Arrays.hashCode(this.pubKeyCredParams)) * 31) + Double.hashCode(this.timeout)) * 31) + this.authenticatorSelection.hashCode()) * 31) + this.attestation.hashCode();
    }

    public String toString() {
        return "CredentialCreationOptions(rp=" + this.rp + ", user=" + this.user + ", challenge=" + this.challenge + ", pubKeyCredParams=" + Arrays.toString(this.pubKeyCredParams) + ", timeout=" + this.timeout + ", authenticatorSelection=" + this.authenticatorSelection + ", attestation=" + this.attestation + ")";
    }
}
