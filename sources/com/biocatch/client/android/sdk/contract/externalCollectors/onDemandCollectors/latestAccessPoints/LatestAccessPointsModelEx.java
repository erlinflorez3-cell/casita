package com.biocatch.client.android.sdk.contract.externalCollectors.onDemandCollectors.latestAccessPoints;

import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O$8\u000bDB\u0007\"2\u0016\u007f\u0007tsA0JeP.`Y2şs{B0cҕw٘Akڼ.\"7N\u000fxwxXZ#I\u001f\b&x\u0019.wVޯa\u0012\u001d5\u000b|M9euM;ptd\u0007N3hهzM\u0018(1`\u0010%ٙsW\u0012\u0012>@\t@b\u000f]\u0005H\u00144?fӼ\u001d%x\\>`l\fC_)\u0011sZP=^^{\u0014ЌG\u001d.\u001b\u0002y\u001eYL}¤\u0014mZ\u0011\u0014j[m\u0011\u0006ғ<U}5'CO\u0004YFX.\u0016C,̠\u0011cz̦t\u0007Wd\u001a,ˬSr"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<G\u001dpZ\u0016J4\fbcH+nBF)\u0015:\u0013\t7w\u0001\u001a%i3hpPdzQ}\u001e\u0005OrOBh_\bV\u001dC`*r\u001aJ'`CI2{{\u0018\u001bo0A_", "", "/bR2f:)]\u001d\b\nl\u0013\u0001\u0017>", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<G\u001dpZ\u0016J4\fbcH+nBF)\u0015:\u0013\t7w\u0001\u001a%i3hpPdzQ}\u001e\u0005OrDDW_\bU,Of3ssi\u001c\\A\u001a7i", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\u000eV*>a'i\u0005b5\f\u0017\u0016i\u000e7", "u(;7T=:\u001d)\u000e~euc\r=tU", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LatestAccessPointsModelEx {
    private final List<AccessPointModelEx> accessPointsList;

    public LatestAccessPointsModelEx(List<AccessPointModelEx> accessPointsList) {
        Intrinsics.checkNotNullParameter(accessPointsList, "accessPointsList");
        this.accessPointsList = accessPointsList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LatestAccessPointsModelEx copy$default(LatestAccessPointsModelEx latestAccessPointsModelEx, List list, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            list = latestAccessPointsModelEx.accessPointsList;
        }
        return latestAccessPointsModelEx.copy(list);
    }

    public final List<AccessPointModelEx> component1() {
        return this.accessPointsList;
    }

    public final LatestAccessPointsModelEx copy(List<AccessPointModelEx> accessPointsList) {
        Intrinsics.checkNotNullParameter(accessPointsList, "accessPointsList");
        return new LatestAccessPointsModelEx(accessPointsList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LatestAccessPointsModelEx) && Intrinsics.areEqual(this.accessPointsList, ((LatestAccessPointsModelEx) obj).accessPointsList);
    }

    public final List<AccessPointModelEx> getAccessPointsList() {
        return this.accessPointsList;
    }

    public int hashCode() {
        return this.accessPointsList.hashCode();
    }

    public String toString() {
        return "LatestAccessPointsModelEx(accessPointsList=" + this.accessPointsList + ')';
    }
}
