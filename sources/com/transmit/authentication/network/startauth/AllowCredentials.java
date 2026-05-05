package com.transmit.authentication.network.startauth;

import java.util.Arrays;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":!\u007f\u0007luA0RnP.XS2\u000fy\u0002<$a$w٘Akڼ.\"7N\u000f\u000fwtXZ#E%\u0005Dyz2WW\u0011_(\u000e`C\u007fKAP\bEIb\u000563!H!f}ڱ\u0005\u001a8MX\u007f\tOc\u000e(/nq\u0001Ŭ\u000e\u0016\u000e(\u001f\u001e@6\u007fL].ߵ7\u0011\u0001kHG+\u0013kRNU`F{{\u0011\rĝ(˼za,4\tmC$=S1ޗ\u0003cE\u0003MqU\u0007~&U,y{]6f\u0002,\u0017AN;^#4b\u0005_c$/;QsK~\u000f>v)\u007fSʤ\u0003؝\n'V>u+t\u0019&3#\u0005\u0004F^\u0015vD\u0016y\u00105]Բ\u0001{2G/~Q\u0010P_آ6D\f\u001b4;\u0001\u001d\"\"ہ\r1&)V\u0010SGPn>˓R\u0010aƝ\u0006\u0006vh\u00101TIU\u0003G\u0004!0'%e\\O\"OoɘLLov\u0013j\u0001UoZVIr\u007f$7B\u000b\"YreʰoV\\АD\u0013S'b\u000eċ\f*"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?Hz0.$k+\u0015\u000ej6`T4GKN5kVnD\"g", "", "Bx_2", "", "7c", "BqP;f7H`(\r", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok$4H7|0g\u001cdj;PQ;[z0I\"\u0012\u001d", "5dc\u0016W", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!e(Ga$\t\bm:", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "5dc!l7>", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok$4H7|0g\u001cdj;PQ;[z0I\"\u0012\u0013Z\\z\u0007#\u001fV\u0017\\3\u0011\u0014#=4}G7(\u00170G}Jl\u000b\u0015_\u00175y\u0003Lc\u0016\u0011\b$qN8dVhbC#HLl<B\u0019_\u001c\\CI(\u0010x'p", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class AllowCredentials {
    private final String id;
    private final String[] transports;
    private final String type;

    public AllowCredentials(String str, String str2, String[] strArr) {
        this.type = str;
        this.id = str2;
        this.transports = strArr;
    }

    public static /* synthetic */ AllowCredentials copy$default(AllowCredentials allowCredentials, String str, String str2, String[] strArr, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = allowCredentials.type;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = allowCredentials.id;
        }
        if ((i2 & 4) != 0) {
            strArr = allowCredentials.transports;
        }
        return allowCredentials.copy(str, str2, strArr);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.id;
    }

    public final String[] component3() {
        return this.transports;
    }

    public final AllowCredentials copy(String str, String str2, String[] strArr) {
        return new AllowCredentials(str, str2, strArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllowCredentials)) {
            return false;
        }
        AllowCredentials allowCredentials = (AllowCredentials) obj;
        return Intrinsics.areEqual(this.type, allowCredentials.type) && Intrinsics.areEqual(this.id, allowCredentials.id) && Intrinsics.areEqual(this.transports, allowCredentials.transports);
    }

    public final String getId() {
        return this.id;
    }

    public final String[] getTransports() {
        return this.transports;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String[] strArr = this.transports;
        return iHashCode2 + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public String toString() {
        return "AllowCredentials(type=" + this.type + ", id=" + this.id + ", transports=" + Arrays.toString(this.transports) + ")";
    }
}
