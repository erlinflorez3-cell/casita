package com.ts.coresdk.controllers;

import androidx.work.Worker;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000ePLcz\u0006I\u0006F\u000b6B\u0015\"4\u0012}\u000fnjGӄLeV7ZS0\u000fs{B*c$wFA٭ \u0014̝9O|w(\u000eZf\u0019O'\u000e&|p+YU'b@\u0013BH}LKO\u0006<g_ҽ:\u0007&J0QB\u001b\u000f$BP z\u0001B[\f@5nt\u0001ŭ\u000ê\t\u001c\u0018\u0010L)I.jrf8^k\f9uޒ\u0004ݦFP-j>\u007f\u00169Tb?\r%ѭN9F7C!=[\u0013\u000bXZO\u0003mvk\t\u0019/-+W\u0001o8n~B\u0014qͅ\fǁv(b\u0013_oT?9a{K~\u001fX}\t\b%>\u001a\r47\u000fΪ.բj\n\u0014E\u0003\u0006\u001cN^\u0017vB.\u000f(پ\u0016Ӿ\u000451N)|\u001aoI0f7*\u0004Sͬ\"ъr#ak\u001cce5bwi3g?kG\u0005\u000f0ƥoձtl\n,\n0U\u0001G}\u00170%(\b{G)9s\u0012LJf\u0007\u0005\u000fm\u0002m\tM\u0017̖pގ;4\u0011\u000e`Jr\f\u0004RZ`:\u001a"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\n1\u000bM\u000b\u001e\u001eG|\u001c\u0006e\u0013#Y\u0007\u001f\u0016i%*?MHq4+xqbC\\", "", "9dh\u0013b90]&\u0005zk", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0018X@\u001f]&p\u0005k2|\u0016", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001a`]1e6BR,H\rh9\u0003R!o\r.{MV", "Ena8X9", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc$b9DS&", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "1n\\=b5>\\(J", "1n\\=b5>\\(K", ">/", ">0", "1n_F", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000f\u0001<\u0012\u0013`Nk\u0017>@\u0013Df\u0002)9CY\u0015KMC5C,^fkF\u0007q+T@%QU]9fYy=! $|<\u0019\r\u000eX  }@))\u00152I\u000f\u001fq\u0002\u0016k", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sU\u000f\u0001<\u0012\u0013`Nk\u0017>@\u0013Df\u0002)9CY\u001f"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSSendDataWorkerInfo {
    private final String keyForWorker;
    private final Class<? extends Worker> worker;

    public TSSendDataWorkerInfo(Class<? extends Worker> cls, String str) {
        Intrinsics.checkNotNullParameter(cls, "");
        this.worker = cls;
        this.keyForWorker = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TSSendDataWorkerInfo copy$default(TSSendDataWorkerInfo tSSendDataWorkerInfo, Class cls, String str, int i2, Object obj) {
        if ((1 & i2) != 0) {
            cls = tSSendDataWorkerInfo.worker;
        }
        if ((i2 & 2) != 0) {
            str = tSSendDataWorkerInfo.keyForWorker;
        }
        return tSSendDataWorkerInfo.copy(cls, str);
    }

    public final Class<? extends Worker> component1() {
        return this.worker;
    }

    public final String component2() {
        return this.keyForWorker;
    }

    public final TSSendDataWorkerInfo copy(Class<? extends Worker> cls, String str) {
        Intrinsics.checkNotNullParameter(cls, "");
        return new TSSendDataWorkerInfo(cls, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TSSendDataWorkerInfo)) {
            return false;
        }
        TSSendDataWorkerInfo tSSendDataWorkerInfo = (TSSendDataWorkerInfo) obj;
        return Intrinsics.areEqual(this.worker, tSSendDataWorkerInfo.worker) && Intrinsics.areEqual(this.keyForWorker, tSSendDataWorkerInfo.keyForWorker);
    }

    public final String getKeyForWorker() {
        return this.keyForWorker;
    }

    public final Class<? extends Worker> getWorker() {
        return this.worker;
    }

    public int hashCode() {
        int iHashCode = this.worker.hashCode() * 31;
        String str = this.keyForWorker;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TSSendDataWorkerInfo(worker=" + this.worker + ", keyForWorker=" + this.keyForWorker + ")";
    }
}
