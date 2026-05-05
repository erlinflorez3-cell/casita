package androidx.privacysandbox.ads.adservices.topics;

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
/* JADX INFO: compiled from: GetTopicsRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r+4\u0012}\fnjG6LeN/hݷZ\u000f\u001azl#hd\tSA[\u001a\f\"!O|hwtPZ\u0019E'\u0006D{̶0Ic|&#\u001d:Zom6}uKBxvL\u0004N1hؗyM\u0007(4`\u0010%\u0006\n_T\u0018>L\t:\u0001\u000e\u0014\u0019j!\u0014>8\u0001L]ʄR<PǍu<5(\u0011o\u0013_5aH|{\u0010|Yܮ\u0011|iӜCB=7#,ٮ\u0007\u0015"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rJu?\"\u0013v+\u001b\u0007r\u001bX\u0002+EZ;,hbrK#g", "", "/cb W2'O!~", "", "Ag^B_++S\u0017\t\b]\u0016y\u0017/r\u0011$\u000bD\u000b ", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p\u0004q", "5dc\u000eW:,R\u001fgvf,", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "u(I", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0010tX9W,K", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class GetTopicsRequest {
    private final String adsSdkName;
    private final boolean shouldRecordObservation;

    public GetTopicsRequest() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public GetTopicsRequest(String adsSdkName, boolean z2) {
        Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
        this.adsSdkName = adsSdkName;
        this.shouldRecordObservation = z2;
    }

    public /* synthetic */ GetTopicsRequest(String str, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? "" : str, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? false : z2);
    }

    public final String getAdsSdkName() {
        return this.adsSdkName;
    }

    public final boolean shouldRecordObservation() {
        return this.shouldRecordObservation;
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.adsSdkName + ", shouldRecordObservation=" + this.shouldRecordObservation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsRequest)) {
            return false;
        }
        GetTopicsRequest getTopicsRequest = (GetTopicsRequest) obj;
        return Intrinsics.areEqual(this.adsSdkName, getTopicsRequest.adsSdkName) && this.shouldRecordObservation == getTopicsRequest.shouldRecordObservation;
    }

    public int hashCode() {
        return (this.adsSdkName.hashCode() * 31) + Boolean.hashCode(this.shouldRecordObservation);
    }

    /* JADX INFO: compiled from: GetTopicsRequest.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u001b\u007fјnjO0LeN/hݷZ\u000f\u001azt'Ӯ(qQ;\u001e\u001e\f'!O|m0zXa#C=إF|x-aU'_Z\u001b@J\b?aݹ AGc\r63$\u0003.Fz\u001d\u0001H,\u001fƸ\u0003ټGK\u0014۵\u0001L~=j\r{\tpŊ\u0012̧$\u0001&ձʊR?"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rJu?\"\u0013v+\u001b\u0007r\u001bX\u0002+EZ;,hbrK#P7\u001eR2\f\u0005f\u0017", "", "u(E", "/cb W2'O!~", "", "Ag^B_++S\u0017\t\b]\u0016y\u0017/r\u0011$\u000bD\u000b ", "", "0tX9W", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rJu?\"\u0013v+\u001b\u0007r\u001bX\u0002+EZ;,hbrK#g", "Adc\u000eW:,R\u001fgvf,", "Adc [6NZ\u0018kz\\6\n\b\u0019b\u000e(\tQ|&\u001bQx", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private String adsSdkName = "";
        private boolean shouldRecordObservation = true;

        public final Builder setAdsSdkName(String adsSdkName) {
            Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
            this.adsSdkName = adsSdkName;
            return this;
        }

        public final Builder setShouldRecordObservation(boolean z2) {
            this.shouldRecordObservation = z2;
            return this;
        }

        public final GetTopicsRequest build() {
            if (this.adsSdkName.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set".toString());
            }
            return new GetTopicsRequest(this.adsSdkName, this.shouldRecordObservation);
        }
    }
}
