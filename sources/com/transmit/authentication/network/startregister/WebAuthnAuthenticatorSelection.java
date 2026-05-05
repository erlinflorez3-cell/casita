package com.transmit.authentication.network.startregister;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4C\u0007\":\u001b\u007f\u0007lyA0RkP.XS0Ŧq\u0012éT[Rp\u0004fe\u001e\f\"!O|hwtX\\#E%\u0005Dyz2WX\u0011_(\u000e`C\u007fG9M}AQb\u000b53%ݨ&8\b\u000bI!8V(v)D\u0012ď\u0013xI~Ij\u000fc\u0004H\u0013L͋!I'jwf8^k\f;uޑ\u00042P\\8w2\u0013L;K\u001bݒ\u000ețe\u001e9J\u007fo#7k\u00035Ѹ\fE\t?\u007f=\u001dhU([QyWDZ\u0018\u0016+*}\u000e\u000ez,\\\u0013Tx\u000e=*}d{X\u0014(\u0006~\u0014\u000fR\u0003<\u000bmϥ-ǉ\u001ef\u0016!{\u0006\u0001gXP0cr\u0006\tvN\u0019;~a*\u007fԬg\u001ahI/f7*\u001cSͫ\"Iu/sl\u000e\u000f\u0016aǯv\"@_@UH|\u000bՒAs\f͏z\u00040\u000b>OPB\n\u0015F\u0019;6\n>؝%s\nHRr\u000f\u0007fqas#YN%\u0007\u0018M)7\rʑHj\rߘhV^8\u001fUle\u0015\u007f \u00156[&=Ƽ)\u0016Vи\u0001kpZk\u0012ʁ3\u007f"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu@v$#\\]/e.\u0003L\u0017\u0012c\u001dR)\t\u0014cN\u0012nK7\u001d\u00170S\u000b\u0011", "", "/tc5X5MW\u0017z\nh9X\u0018>a}+\u0004@\n&", "", "CrT?I,KW\u001a\u0003xZ;\u0001\u00138", "@db6W,Gb~~\u000f", "@d`B\\9>@\u0019\r~],\u0006\u0018\u0015e\u0014", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W+5\u0017\fY=-D\b(", "5dc\u000eh;AS\"\u000e~\\(\f\u0013<A\u000f7w>\u0004\u001f\u0017P~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001fX8NW&~g^:\u0001\b/n\u000f\u000e{T", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "5dc\u001fX:BR\u0019\b\nD,\u0011", "5dc\"f,KD\u0019\f~_0z\u0005>i\n1", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W+5\u0017\fY=-D\b\u001e\u001d\u00124\u0013\u0011Hd\n\u001a\u001e\u0012D4lRe\u0013G\u0003$y?%wJchCPATt4q\u0012)+k6G3!q\u001b\u001fv_.\u0017EE\u0011o.\nvjPt\u000bG'>vjJCkdF\u0002\u0015\u001fR{u!6b}\u0001", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class WebAuthnAuthenticatorSelection {
    private final String authenticatorAttachment;
    private final Boolean requireResidentKey;
    private final String residentKey;
    private final String userVerification;

    public WebAuthnAuthenticatorSelection(String authenticatorAttachment, String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(authenticatorAttachment, "authenticatorAttachment");
        this.authenticatorAttachment = authenticatorAttachment;
        this.userVerification = str;
        this.residentKey = str2;
        this.requireResidentKey = bool;
    }

    public /* synthetic */ WebAuthnAuthenticatorSelection(String str, String str2, String str3, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : bool);
    }

    public static /* synthetic */ WebAuthnAuthenticatorSelection copy$default(WebAuthnAuthenticatorSelection webAuthnAuthenticatorSelection, String str, String str2, String str3, Boolean bool, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = webAuthnAuthenticatorSelection.authenticatorAttachment;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            str2 = webAuthnAuthenticatorSelection.userVerification;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            str3 = webAuthnAuthenticatorSelection.residentKey;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            bool = webAuthnAuthenticatorSelection.requireResidentKey;
        }
        return webAuthnAuthenticatorSelection.copy(str, str2, str3, bool);
    }

    public final String component1() {
        return this.authenticatorAttachment;
    }

    public final String component2() {
        return this.userVerification;
    }

    public final String component3() {
        return this.residentKey;
    }

    public final Boolean component4() {
        return this.requireResidentKey;
    }

    public final WebAuthnAuthenticatorSelection copy(String authenticatorAttachment, String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(authenticatorAttachment, "authenticatorAttachment");
        return new WebAuthnAuthenticatorSelection(authenticatorAttachment, str, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebAuthnAuthenticatorSelection)) {
            return false;
        }
        WebAuthnAuthenticatorSelection webAuthnAuthenticatorSelection = (WebAuthnAuthenticatorSelection) obj;
        return Intrinsics.areEqual(this.authenticatorAttachment, webAuthnAuthenticatorSelection.authenticatorAttachment) && Intrinsics.areEqual(this.userVerification, webAuthnAuthenticatorSelection.userVerification) && Intrinsics.areEqual(this.residentKey, webAuthnAuthenticatorSelection.residentKey) && Intrinsics.areEqual(this.requireResidentKey, webAuthnAuthenticatorSelection.requireResidentKey);
    }

    public final String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    public final Boolean getRequireResidentKey() {
        return this.requireResidentKey;
    }

    public final String getResidentKey() {
        return this.residentKey;
    }

    public final String getUserVerification() {
        return this.userVerification;
    }

    public int hashCode() {
        int iHashCode = this.authenticatorAttachment.hashCode() * 31;
        String str = this.userVerification;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.residentKey;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.requireResidentKey;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "WebAuthnAuthenticatorSelection(authenticatorAttachment=" + this.authenticatorAttachment + ", userVerification=" + this.userVerification + ", residentKey=" + this.residentKey + ", requireResidentKey=" + this.requireResidentKey + ")";
    }
}
