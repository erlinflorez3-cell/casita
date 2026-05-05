package com.biocatch.client.android.sdk.contract.externalCollectors.onDemandCollectors.latestAccessPoints;

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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r.4\u0012}\u0011njG9LeN0Xݾ0%ӆ,4RZd\rS?c\u001a\u0016\"7P^kupbZ9F\u001f\n$|\u0003,wXޯa\u0012\u001d7\u000bvM>eok:'ӡ7M'@.Py3\u0004`ޙIX}\tPc\f@3\u0007È;\u001b2[\u00132\u00124̄P\u0007$\\uNNH\u001b^j5)\u0003wDf'\u000e3-S\u0013Fb+%v\u0010!qï6}&3b\u001b\u0007\u0001ko\tM\u0003U\u0007~&U*\u0010\u05ecX~_\u000e&-+}\u000e$ō%%\f_s$'YR*\u05f6O^7\u0006~\u0014\rj\u0007؝\n-P͓E\u001cl\u000e\u001c:E\u0002a@h\u0002\rCȸ~g>Ѝ=\u000293G$7`o=1Ne~˿\u0011$+Ч\u0007#a^\u001cgڦ\u001fh"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<G\u001dpZ\u0016J4\fbcH+nBF)\u0015:\u0013\t7w\u0001\u001a%i3hpPdzQ}\u001e\u0005OrDDW_\bU,Of3ssi\u001c\\A\u001a7i", "", ":de2_", "", "ArX1", "", "0rb6W", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "5dc\u000ff:BR", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0019X=>Z", "u(8", "5dc f0=", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class AccessPointModelEx {
    private final String bssid;
    private final int level;
    private final String ssid;

    public AccessPointModelEx(int i2, String ssid, String bssid) {
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        Intrinsics.checkNotNullParameter(bssid, "bssid");
        this.level = i2;
        this.ssid = ssid;
        this.bssid = bssid;
    }

    public static /* synthetic */ AccessPointModelEx copy$default(AccessPointModelEx accessPointModelEx, int i2, String str, String str2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = accessPointModelEx.level;
        }
        if ((2 & i3) != 0) {
            str = accessPointModelEx.ssid;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            str2 = accessPointModelEx.bssid;
        }
        return accessPointModelEx.copy(i2, str, str2);
    }

    public final int component1() {
        return this.level;
    }

    public final String component2() {
        return this.ssid;
    }

    public final String component3() {
        return this.bssid;
    }

    public final AccessPointModelEx copy(int i2, String ssid, String bssid) {
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        Intrinsics.checkNotNullParameter(bssid, "bssid");
        return new AccessPointModelEx(i2, ssid, bssid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessPointModelEx)) {
            return false;
        }
        AccessPointModelEx accessPointModelEx = (AccessPointModelEx) obj;
        return this.level == accessPointModelEx.level && Intrinsics.areEqual(this.ssid, accessPointModelEx.ssid) && Intrinsics.areEqual(this.bssid, accessPointModelEx.bssid);
    }

    public final String getBssid() {
        return this.bssid;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getSsid() {
        return this.ssid;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.level) * 31) + this.ssid.hashCode()) * 31) + this.bssid.hashCode();
    }

    public String toString() {
        return "AccessPointModelEx(level=" + this.level + ", ssid=" + this.ssid + ", bssid=" + this.bssid + ')';
    }
}
