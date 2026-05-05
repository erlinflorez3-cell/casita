package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import java.util.List;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: WebSourceRegistrationRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004O$8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.X_2\u000fy\u0005<$a$yCI[\"Ԃ*\t]ZogtJ`\u0010YƤ6\u0016'idHp9'\"\u0019@B\bECO\u007f=gb#7\u0015$@%Py3\u0005*2N\u0010\u0005\u007f[M\"\u0011^F\u0001BX\r[\f2\u0014\u001c=N\u0005.dmNDP\u0005_P.Q\u0007yJT'm9\u0015O#E\u0003+˼za,5\tHC)=S1\u001c\u0003aM\u0019WsS\u0004\u0017&mǹI<]Do\u0018\u0014CC\u0016!&x4u\u001dQ\u000f&m? tYW&*\u000ey*\u0011ʀ\b\u0014\u000eΩ`03%t\u0014^D\u0003wkBf\u0001\rHȸ~g>Ѝ=\u000298G)7`o>1Ne\u007f˿\u0011$+Ч\u0007#ac\u001cle,b\u0001i3g?kLݳ\u000e_EЧ\u001crh\u00128\u0010\u0001X\u000e7\u0014\u0013D\u0016S;٦=))ǽ\u001aJJx\u0005\u00111}aijNP$~\u0016e,7\rʑHj\rߘhV^>\u001f`ɥX#"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D:X<iPr*\u0014\u0014^\u001c]8\t\u0014]K-[DC/\b:XW", "", "EdQ b<KQ\u0019ivk(\u0005\u0017", "", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D:X<iPr(\u0010\u001fV\u0016\\\u0001", "Bn_\u001ce0@W\"n\bb", "\u001a`]1e6BRb\bzmul\u00163;", "7m_Bg\fOS\"\u000e", "\u001a`]1e6BRb\u0010~^>Fl8p\u00107[Q\u0001 &\u001d", "/o_\u0011X:MW\"z\nb6\u0006", "EdQ\u0011X:MW\"z\nb6\u0006", "Dda6Y0>Rw~\tm0\u0006\u0005>i\n1", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f$\u0005?\u000e!\u001bF9\u0017<\u0006n%f\u0002u\u001ei\u001f-ZM?j}/\u0019hs\u0003jl7^\u0006\u0007XLW;29nF\u0013\u001fd\u0012Mt\u0016\u0005h\u000b\u0014{H\r\u0006\u00045H\u000fEl\u007fU\u001f\u000eD4`OZe.u\u001etN3lE#hyV\u000b5o.:OP", "5dc\u000ec7\u001dS'\u000e~g(\f\r9n", "u(;.a+K]\u001d}Dg,\fR\u001fr\u0004}", "5dc\u0016a7Nbx\u0010zg;", "u(;.a+K]\u001d}Do0|\u001bxI\t3\fO`(\u0017P~c", "5dc!b7(`\u001d\u0001~g\u001c\n\r", "5dc#X9BT\u001d~y=,\u000b\u00183n{7\u007fJ\n", "5dc$X)\u001dS'\u000e~g(\f\r9n", "5dc$X),])\fx^\u0017x\u0016+m\u000e", "u(;7T=:\u001d)\u000e~euc\r=tU", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "\u0010tX9W,K", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WebSourceRegistrationRequest {
    private final Uri appDestination;
    private final InputEvent inputEvent;
    private final Uri topOriginUri;
    private final Uri verifiedDestination;
    private final Uri webDestination;
    private final List<WebSourceParams> webSourceParams;

    public WebSourceRegistrationRequest(List<WebSourceParams> webSourceParams, Uri topOriginUri, InputEvent inputEvent, Uri uri, Uri uri2, Uri uri3) {
        Intrinsics.checkNotNullParameter(webSourceParams, "webSourceParams");
        Intrinsics.checkNotNullParameter(topOriginUri, "topOriginUri");
        this.webSourceParams = webSourceParams;
        this.topOriginUri = topOriginUri;
        this.inputEvent = inputEvent;
        this.appDestination = uri;
        this.webDestination = uri2;
        this.verifiedDestination = uri3;
    }

    public /* synthetic */ WebSourceRegistrationRequest(List list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, uri, (i2 + 4) - (4 | i2) != 0 ? null : inputEvent, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : uri2, (i2 + 16) - (16 | i2) != 0 ? null : uri3, (-1) - (((-1) - i2) | ((-1) - 32)) == 0 ? uri4 : null);
    }

    public final List<WebSourceParams> getWebSourceParams() {
        return this.webSourceParams;
    }

    public final Uri getTopOriginUri() {
        return this.topOriginUri;
    }

    public final InputEvent getInputEvent() {
        return this.inputEvent;
    }

    public final Uri getAppDestination() {
        return this.appDestination;
    }

    public final Uri getWebDestination() {
        return this.webDestination;
    }

    public final Uri getVerifiedDestination() {
        return this.verifiedDestination;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSourceRegistrationRequest)) {
            return false;
        }
        WebSourceRegistrationRequest webSourceRegistrationRequest = (WebSourceRegistrationRequest) obj;
        return Intrinsics.areEqual(this.webSourceParams, webSourceRegistrationRequest.webSourceParams) && Intrinsics.areEqual(this.webDestination, webSourceRegistrationRequest.webDestination) && Intrinsics.areEqual(this.appDestination, webSourceRegistrationRequest.appDestination) && Intrinsics.areEqual(this.topOriginUri, webSourceRegistrationRequest.topOriginUri) && Intrinsics.areEqual(this.inputEvent, webSourceRegistrationRequest.inputEvent) && Intrinsics.areEqual(this.verifiedDestination, webSourceRegistrationRequest.verifiedDestination);
    }

    public int hashCode() {
        int iHashCode = (this.webSourceParams.hashCode() * 31) + this.topOriginUri.hashCode();
        InputEvent inputEvent = this.inputEvent;
        if (inputEvent != null) {
            iHashCode = (iHashCode * 31) + inputEvent.hashCode();
        }
        Uri uri = this.appDestination;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.webDestination;
        if (uri2 != null) {
            iHashCode = (iHashCode * 31) + uri2.hashCode();
        }
        int iHashCode2 = (iHashCode * 31) + this.topOriginUri.hashCode();
        InputEvent inputEvent2 = this.inputEvent;
        if (inputEvent2 != null) {
            iHashCode2 = (iHashCode2 * 31) + inputEvent2.hashCode();
        }
        Uri uri3 = this.verifiedDestination;
        return uri3 != null ? (iHashCode2 * 31) + uri3.hashCode() : iHashCode2;
    }

    public String toString() {
        return "WebSourceRegistrationRequest { " + ("WebSourceParams=[" + this.webSourceParams + "], TopOriginUri=" + this.topOriginUri + ", InputEvent=" + this.inputEvent + ", AppDestination=" + this.appDestination + ", WebDestination=" + this.webDestination + ", VerifiedDestination=" + this.verifiedDestination) + " }";
    }

    /* JADX INFO: compiled from: WebSourceRegistrationRequest.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004O$8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?1Le^.ZS0\u0010s{J$c$wFQ٥J}P\b\u0010gwq|Jr\u0011S\u0011\u0016\u0016'lZJe|k\u0015'2psУ7M}B\u0002d\u0003A\u001d `.\u0001\b\u0013\u000e2*vƵ'\u0001QQ$\u0014F?\u001f>\u001b\u0019[\u00132\u00124̄P\u0005,c\u007fNdP5kH>;\u0003\u0018ĩ~-m9\u0015O#E\u0003+U\u0005o.C@eߎE+a\r\u001fTq>1CBK\u0013n?)AH\"[\rݜ\fЏ\u0019+WՕ.\u00014c\u001dSv\u000bU3&ҭWח\u0012(\u007f\u07beL\u0019J\u0007&\u0006UL\u0005Ʃ\u001cǴ\f\u000e;οCaNY\u001a`X~)e\rА1ő7+Aӕ7_oE1PMz3\u0011tŃ\rͼ%[\\ו1')T\u0010WASP=vP8Z\u0014Ъ\u0006Ͳf\u00022ʶΫK\u0011"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D:X<iPr*\u0014\u0014^\u001c]8\t\u0014]K-[DC/\b:X@\u0018x\u0005\u0013\u0015\u000eB@", "", "EdQ b<KQ\u0019ivk(\u0005\u0017", "", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D:X<iPr(\u0010\u001fV\u0016\\\u0001", "Bn_\u001ce0@W\"n\bb", "\u001a`]1e6BRb\bzmul\u00163;", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f$\u0005?\u000e!\u001bF9\u0017<\u0006n%f\u0002uz^", "/o_\u0011X:MW\"z\nb6\u0006", "7m_Bg\fOS\"\u000e", "\u001a`]1e6BRb\u0010~^>Fl8p\u00107[Q\u0001 &\u001d", "Dda6Y0>Rw~\tm0\u0006\u0005>i\n1", "EdQ\u0011X:MW\"z\nb6\u0006", "0tX9W", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rCk0,%uaA\u0007l;\u0018h'D:X<iPr*\u0014\u0014^\u001c]8\t\u0014]K-[DC/\b:XW", "Adc\u000ec7\u001dS'\u000e~g(\f\r9n", "Adc\u0016a7Nbx\u0010zg;", "Adc#X9BT\u001d~y=,\u000b\u00183n{7\u007fJ\n", "Adc$X)\u001dS'\u000e~g(\f\r9n", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private Uri appDestination;
        private InputEvent inputEvent;
        private final Uri topOriginUri;
        private Uri verifiedDestination;
        private Uri webDestination;
        private final List<WebSourceParams> webSourceParams;

        public Builder(List<WebSourceParams> webSourceParams, Uri topOriginUri) {
            Intrinsics.checkNotNullParameter(webSourceParams, "webSourceParams");
            Intrinsics.checkNotNullParameter(topOriginUri, "topOriginUri");
            this.webSourceParams = webSourceParams;
            this.topOriginUri = topOriginUri;
        }

        public final Builder setInputEvent(InputEvent inputEvent) {
            Intrinsics.checkNotNullParameter(inputEvent, "inputEvent");
            this.inputEvent = inputEvent;
            return this;
        }

        public final Builder setAppDestination(Uri uri) {
            this.appDestination = uri;
            return this;
        }

        public final Builder setWebDestination(Uri uri) {
            this.webDestination = uri;
            return this;
        }

        public final Builder setVerifiedDestination(Uri uri) {
            this.verifiedDestination = uri;
            return this;
        }

        public final WebSourceRegistrationRequest build() {
            return new WebSourceRegistrationRequest(this.webSourceParams, this.topOriginUri, this.inputEvent, this.appDestination, this.webDestination, this.verifiedDestination);
        }
    }
}
