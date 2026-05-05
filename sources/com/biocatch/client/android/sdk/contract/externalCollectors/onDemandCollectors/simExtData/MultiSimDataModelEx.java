package com.biocatch.client.android.sdk.contract.externalCollectors.onDemandCollectors.simExtData;

import com.biocatch.client.android.sdk.collection.collectors.simData.SimType;
import com.biocatch.client.android.sdk.contract.externalCollectors.onDemandCollectors.simData.SimDataModelEx;
import java.util.ArrayList;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\rA4\u0012\u000e\u0007nj?7LeV7ZS0\u000fs{B*cҕyCIa\"Ԃ(ޢUdʴ\u0018nxYK^\u001f\n$x\u0003,wV\ti\u0018\u000f@D\bECO\u007f=gd#9ӯ$20=B\f\u000f$BH>wAƖLT\u001f>K\t@b\u000f]\u0005H\u00164AfӼ\u001f%\t\\B`l\fŽ_)\tiPN?_^}}\u0019LT5\u000f\u000fg.-P7c\u0019SVIߞQ$P\u0011L\n=3vW-9X\fYLW.\u0013[ܗPUd\u00016t\u0005\u007fqR̃*\u0018jYb&(&\u000eBɵ;T#\u0014)`4=\u001cv\b<7#uՂDV\nމZ\u0002\u0001gD\u001eu\u000fA+Q\u001b\u0015Rň?\u001fVљ\u0014\u0007\u0013&1\n\u0382%o"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<G\u001dpZ\u0016J4\fbcH+nBF)\u0015:\u0013\u0010?p`\u001f%l1yl\f> N\t\u0019cE1GBh[aQ@Ei\nwa", "", "Ah\\!l7>", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0016=?\u0018\u0005/", "Ah\\\u0011T;::\u001d\r\n", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<G\u001dpZ\u0016J4\fbcH+nBF)\u0015:\u0013\u0010?p_\b%\n~XtJ5\fVu|\u007f@)o&l5", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016\\0d1nL\u0010[H\u0012V\u001a!\u0010Y\u0017\u000bs@H\u001bQ<X\u0006B2g\u0010$\u001d\u000b.a", "5dc \\4\u001dO(zab:\f", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc \\4-g$~", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 5TC9z8(\u001e2_C\u000ej,L\u00061TZ\u0018:`ZQ9#\u000e${R3{\u0019dAy", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class MultiSimDataModelEx {
    private final List<SimDataModelEx> simDataList;
    private final SimType simType;

    public MultiSimDataModelEx(SimType simType, List<SimDataModelEx> simDataList) {
        Intrinsics.checkNotNullParameter(simType, "simType");
        Intrinsics.checkNotNullParameter(simDataList, "simDataList");
        this.simType = simType;
        this.simDataList = simDataList;
    }

    public /* synthetic */ MultiSimDataModelEx(SimType simType, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(simType, (i2 & 2) != 0 ? new ArrayList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiSimDataModelEx copy$default(MultiSimDataModelEx multiSimDataModelEx, SimType simType, List list, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            simType = multiSimDataModelEx.simType;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            list = multiSimDataModelEx.simDataList;
        }
        return multiSimDataModelEx.copy(simType, list);
    }

    public final SimType component1() {
        return this.simType;
    }

    public final List<SimDataModelEx> component2() {
        return this.simDataList;
    }

    public final MultiSimDataModelEx copy(SimType simType, List<SimDataModelEx> simDataList) {
        Intrinsics.checkNotNullParameter(simType, "simType");
        Intrinsics.checkNotNullParameter(simDataList, "simDataList");
        return new MultiSimDataModelEx(simType, simDataList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiSimDataModelEx)) {
            return false;
        }
        MultiSimDataModelEx multiSimDataModelEx = (MultiSimDataModelEx) obj;
        return this.simType == multiSimDataModelEx.simType && Intrinsics.areEqual(this.simDataList, multiSimDataModelEx.simDataList);
    }

    public final List<SimDataModelEx> getSimDataList() {
        return this.simDataList;
    }

    public final SimType getSimType() {
        return this.simType;
    }

    public int hashCode() {
        return (this.simType.hashCode() * 31) + this.simDataList.hashCode();
    }

    public String toString() {
        return "MultiSimDataModelEx(simType=" + this.simType + ", simDataList=" + this.simDataList + ')';
    }
}
