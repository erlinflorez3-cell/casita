package com.valid.vssh_bio_validation_library.executors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.ZO;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4G\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Ŧq\u0012éT[Rp\u0004Fe\u001e\f\"!O|h̊rJh\r\f\u0016\u0014\u001c\u0011jZJ\u001cߓ^Z @I\b?aݹ C?`\u00036\u001d `#~ҍ\u0004I+8P(v)L{\u0012 :XrPQ;LKݜ\u0013NE.\f6\\\u0016Z|նk&A=0\u001bipOmܖ/Me\u001bFl';w8ӣ7Ë;A\u001dǬk\u0005\rUiC#AwB\u0013jҐ+9"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017CNk2.$rnGP@0Xg#NPM(kV|Ft\u000e^\u0015N*b", "", "3qa<e\u0014>a'z|^", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`\u0001~\tl(~\t", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class BioValidationFailed {
    private String errorMessage;

    public BioValidationFailed(String str) {
        Intrinsics.checkParameterIsNotNull(str, ZO.xd(".S\u0002\u0004;J^{S.L.", (short) (C1499aX.Xd() ^ (632734593 ^ (-632747448))), (short) (C1499aX.Xd() ^ (484758443 ^ (-484740419)))));
        this.errorMessage = str;
    }

    public static /* synthetic */ BioValidationFailed copy$default(BioValidationFailed bioValidationFailed, String str, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = bioValidationFailed.errorMessage;
        }
        return bioValidationFailed.copy(str);
    }

    public final String component1() {
        return this.errorMessage;
    }

    public final BioValidationFailed copy(String str) {
        Intrinsics.checkParameterIsNotNull(str, C1626yg.Ud("o,\u0012g>m.L#]}M", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (15173313 ^ (-80516049)))), (short) (C1580rY.Xd() ^ (983133419 ^ (-983121142)))));
        return new BioValidationFailed(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BioValidationFailed) && Intrinsics.areEqual(this.errorMessage, ((BioValidationFailed) obj).errorMessage);
        }
        return true;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        String str = this.errorMessage;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void setErrorMessage(String str) {
        Intrinsics.checkParameterIsNotNull(str, Ig.wd(">NP|j0\t", (short) (Od.Xd() ^ ((2129269654 ^ 942375936) ^ (-1187094645)))));
        this.errorMessage = str;
    }

    public String toString() {
        return EO.Od("LL\u0016V\u001bKn\u0013C4\u0001/}IR\u0002J/wef=e`fg#b\u0007\b4YC", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134232515)))) + this.errorMessage + C1561oA.Qd("\u0002", (short) (FB.Xd() ^ (1850415876 ^ 1850413430)));
    }
}
