package com.biocatch.client.android.sdk.contract.externalCollectors.onDemandCollectors.simData;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4O\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Ŧq\u0012éT[Rp\u0004be \f\"!Qdf\u0016oZ`\u0019E'\b,w\u0019-YY\u0007`*\u000f`C\u007fCAQ\b=gaҽ:\u0005.7jA\b\u0010\u0019\u001c@G>wAƖLT\u001b>L\t<h\f{\u0006`Ǝ\u0007\u0007'\u000f+tg|7\u000fȔ^\u000361\u0011\u0002B|(&ݥ}\u0016@Tc?\r%ѭN3F7C\u0015=U\u0019\u0006\u0001\\o\u000bEqK\u0007\u0001)=*wt\b<^\u007f\"\u0018CO;^#,b\u0005_d$'YP*צOV9\u0006\u000b\u0014\rj\u0015>\f5ZF/0e6\ryЖs\u001cG^\u0015vB.\u000f(پ\u0016m\u0007A@Q\u001b\u0015R(\u07b9\u0018\u001fH\n\u0005% 9\u007f\u001d\"ƟX\u0014hٽ3V}W?X\u0011NVP\"[Sl2qĊ\u00060\f\u0382_\u00025\u0004\u001f5g4E^Q#OlɘLJoϸ\u001dbn\\wY\u0019O0r.7X\nɔ^Jlʍ\u0004RZb:\u0018ܜ j"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<G\u001dpZ\u0016J4\fbcH+nBF)\u0015:\u0013\u0010?p_\b%\n~XtJ5\fVu|\u007f@)o&l5", "", "1`a?\\,K<\u0015\u0007z", "", "7r^\u0010b<Gb&\u0013Xh+|", ";nQ6_,\u001c])\b\nk@Z\u0013.e", ";nQ6_,'S(\u0011\u0005k2Z\u0013.e", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCy25", "5dc\u0010T9KW\u0019\fcZ4|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0016f6\u001c])\b\nk@Z\u0013.e", "5dc\u001ab)BZ\u0019\\\u0005n5\f\u0016CC\n'{", "5dc\u001ab)BZ\u0019gzm>\u0007\u00165C\n'{", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class SimDataModelEx {
    private final String carrierName;
    private final String isoCountryCode;
    private final String mobileCountryCode;
    private final String mobileNetworkCode;

    public SimDataModelEx(String str, String str2, String mobileCountryCode, String mobileNetworkCode) {
        Intrinsics.checkNotNullParameter(mobileCountryCode, "mobileCountryCode");
        Intrinsics.checkNotNullParameter(mobileNetworkCode, "mobileNetworkCode");
        this.carrierName = str;
        this.isoCountryCode = str2;
        this.mobileCountryCode = mobileCountryCode;
        this.mobileNetworkCode = mobileNetworkCode;
    }

    public static /* synthetic */ SimDataModelEx copy$default(SimDataModelEx simDataModelEx, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = simDataModelEx.carrierName;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = simDataModelEx.isoCountryCode;
        }
        if ((4 & i2) != 0) {
            str3 = simDataModelEx.mobileCountryCode;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            str4 = simDataModelEx.mobileNetworkCode;
        }
        return simDataModelEx.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.carrierName;
    }

    public final String component2() {
        return this.isoCountryCode;
    }

    public final String component3() {
        return this.mobileCountryCode;
    }

    public final String component4() {
        return this.mobileNetworkCode;
    }

    public final SimDataModelEx copy(String str, String str2, String mobileCountryCode, String mobileNetworkCode) {
        Intrinsics.checkNotNullParameter(mobileCountryCode, "mobileCountryCode");
        Intrinsics.checkNotNullParameter(mobileNetworkCode, "mobileNetworkCode");
        return new SimDataModelEx(str, str2, mobileCountryCode, mobileNetworkCode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimDataModelEx)) {
            return false;
        }
        SimDataModelEx simDataModelEx = (SimDataModelEx) obj;
        return Intrinsics.areEqual(this.carrierName, simDataModelEx.carrierName) && Intrinsics.areEqual(this.isoCountryCode, simDataModelEx.isoCountryCode) && Intrinsics.areEqual(this.mobileCountryCode, simDataModelEx.mobileCountryCode) && Intrinsics.areEqual(this.mobileNetworkCode, simDataModelEx.mobileNetworkCode);
    }

    public final String getCarrierName() {
        return this.carrierName;
    }

    public final String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    public final String getMobileCountryCode() {
        return this.mobileCountryCode;
    }

    public final String getMobileNetworkCode() {
        return this.mobileNetworkCode;
    }

    public int hashCode() {
        String str = this.carrierName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.isoCountryCode;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.mobileCountryCode.hashCode()) * 31) + this.mobileNetworkCode.hashCode();
    }

    public String toString() {
        return "SimDataModelEx(carrierName=" + this.carrierName + ", isoCountryCode=" + this.isoCountryCode + ", mobileCountryCode=" + this.mobileCountryCode + ", mobileNetworkCode=" + this.mobileNetworkCode + ')';
    }
}
