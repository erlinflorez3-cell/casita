package com.statsig.androidsdk;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\rA4ߚ\u007f\u0007tqA0JuP.`\\2\u000fq{<$i*yCAU ԉ(\u001fѧ~g\u0016m\u000b\u0002\u001bK\u0015\u0006$x\u0003._T'^\"\u001b8B}AKS\u007f?I`#73#B&F}\u001d\u0001H/Н\u0014v\tI\u0014\u0015 CXrPQ;NK\u074c\u0013NK.\u00156bwPFH\u001b^h2iʌj\u000bU5tH|{\u0012\rĝ(U$o4C@eߎE-Y\u0003\u0015RsA\u0019> >5t-'9K\f]FZ\u0010\u0014C,}\u0010\u000ex,\\\u0013Ux\fU0\u0016ӱJ\u0019\u001f6\u000f\u0013{;T4\u0014\u0014@`0C\u0019\u0015\u0007T߮u;ZNj\u001a^p\u001bA˿5_,\u000eOC9Ig\u0018ż:ifE\u007f\u001d\rL(W͠-ƟX\u001ahٽ3V}X?Y`?NW\u0018c\u000e\f\u0012rz\b:\u0006@G.0*\u0014\u0005ϖ1ھ_E+ܩ\u0004\u0004NOu\u0003%bn`w`\u0019Z0n.9@\b:[\u001bߦ\u0011\u07fbT``\u008c)O\"c\u0015\u000e(\u0015&m\u0006Nǂ)-"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`(k\u0015Cs!3_a)8wu7\\POA", "", "Cq[", "", ">qTC\\6Na", "", "3w_6e@-W!~", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n\u001c]\f/\rRY\u001f", "5dc\u0012k7B`-m~f,", "u(9", "Adc\u0012k7B`-m~f,", "uI\u0018#", "5dc\u001de,OW#\u000f\t", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u001de,OW#\u000f\t", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\"e3", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\"e3", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class FallbackInfoEntry {
    private long expiryTime;
    private List<String> previous;
    private String url;

    public FallbackInfoEntry(String str, List<String> previous, long j2) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        this.url = str;
        this.previous = previous;
        this.expiryTime = j2;
    }

    public /* synthetic */ FallbackInfoEntry(String str, ArrayList arrayList, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? null : str, (i2 + 2) - (i2 | 2) != 0 ? new ArrayList() : arrayList, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FallbackInfoEntry copy$default(FallbackInfoEntry fallbackInfoEntry, String str, List list, long j2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = fallbackInfoEntry.url;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            list = fallbackInfoEntry.previous;
        }
        if ((i2 & 4) != 0) {
            j2 = fallbackInfoEntry.expiryTime;
        }
        return fallbackInfoEntry.copy(str, list, j2);
    }

    public final String component1() {
        return this.url;
    }

    public final List<String> component2() {
        return this.previous;
    }

    public final long component3() {
        return this.expiryTime;
    }

    public final FallbackInfoEntry copy(String str, List<String> previous, long j2) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        return new FallbackInfoEntry(str, previous, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FallbackInfoEntry)) {
            return false;
        }
        FallbackInfoEntry fallbackInfoEntry = (FallbackInfoEntry) obj;
        return Intrinsics.areEqual(this.url, fallbackInfoEntry.url) && Intrinsics.areEqual(this.previous, fallbackInfoEntry.previous) && this.expiryTime == fallbackInfoEntry.expiryTime;
    }

    public final long getExpiryTime() {
        return this.expiryTime;
    }

    public final List<String> getPrevious() {
        return this.previous;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.previous.hashCode()) * 31) + Long.hashCode(this.expiryTime);
    }

    public final void setExpiryTime(long j2) {
        this.expiryTime = j2;
    }

    public final void setPrevious(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.previous = list;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "FallbackInfoEntry(url=" + ((Object) this.url) + ", previous=" + this.previous + ", expiryTime=" + this.expiryTime + ')';
    }
}
