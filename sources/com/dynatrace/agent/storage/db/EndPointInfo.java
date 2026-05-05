package com.dynatrace.agent.storage.db;

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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4J\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Šq\u0012éT[Rp\u0004Pe\u001e\f\"!O|hwrX\\#C=\u0007Ȁ|l2Lc|&\u0019\u001d:Zom4\u0014ە>\u0002g\u0003?\u001d `#~ҍ\u0006I58R(v)ŏ{\u0012\u00180NpRR;N5 \u0018\u0006L\"\u0019\u001e\u000bh\u0015ɫG5nH:;\u0003\u0018N~-m=\u0015O#E\u0003&Sɏbf2NEM\u0015SbI߮Q$F\u0011O\n=3imާ*\u001a\u0003e6p\u007fB\u0016ۣS\u0013eö>^\u000bVn\u0012w:]ecP<)Þ~\u0002\u0015ɝ\u001c\u0010\f.V4Ǐ\u001ew"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", "", "/o_9\\*:b\u001d\t\u0004B+", "", "Cq[", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "5dc\u000ec7EW\u0017z\nb6\u0006l.", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\"e3", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EndPointInfo {
    private final String applicationId;
    private final String url;

    public EndPointInfo(String applicationId, String url) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(url, "url");
        this.applicationId = applicationId;
        this.url = url;
    }

    public static /* synthetic */ EndPointInfo copy$default(EndPointInfo endPointInfo, String str, String str2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = endPointInfo.applicationId;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            str2 = endPointInfo.url;
        }
        return endPointInfo.copy(str, str2);
    }

    public final String component1() {
        return this.applicationId;
    }

    public final String component2() {
        return this.url;
    }

    public final EndPointInfo copy(String applicationId, String url) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(url, "url");
        return new EndPointInfo(applicationId, url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndPointInfo)) {
            return false;
        }
        EndPointInfo endPointInfo = (EndPointInfo) obj;
        return Intrinsics.areEqual(this.applicationId, endPointInfo.applicationId) && Intrinsics.areEqual(this.url, endPointInfo.url);
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.applicationId.hashCode() * 31) + this.url.hashCode();
    }

    public String toString() {
        return "EndPointInfo(applicationId=" + this.applicationId + ", url=" + this.url + ')';
    }
}
