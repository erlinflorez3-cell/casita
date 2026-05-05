package com.valid.vssh_bio_validation_library.utils.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4I\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Ŧq\u0012éT[Rp\u0004Ne\u001e\f\"!O|hwrX\\#C=\u0007Ȁ|j:L\u001e\u007fk\u0019'2pp\u0006ޓN8DGh\r63!xŹ9B \u000f#BH>͌+IQ\f 0XphS=S\u000b\u001a \bV /\u001f#ʨM~YzgR/Q\u000e\u001aH\\3w2\u0013L;E\u001bݢ\u000e?h,8X7c#kڜ\u0002OYiN\u001b? >K٩&w?Wso6\u0007\u0001J\u0019\u0002̅\u000fǁv,dӤib\u0012+9T4_^\u0010@w)|C@Z\u0602\bόL45Կ~\n\u00149\u0003wՈD`"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju-v4K]N\u0014fQrD\u0001\u0012h\u0019X4\u001b\u0005/", "", "2da6i,", "", "6`b57,KW*z\n^\u0012|\u001d", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "5dc\u0011X9Bd\u0019", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0015T:A2\u0019\f~o(\f\t\u0015e\u0014", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class DeriveModelResponse {

    @SerializedName(alternate = {}, value = "\u000b\u000b\u0017\r\u0019\u0003\u0015\t\u0015\u0003g\u0001\u0014")
    @InterfaceC1492Gx
    private final String derive;

    @SerializedName(alternate = {}, value = "\u000f\u0007\u0018\ff\u0007\u0013\t\u0015~\u0011\u0001\u0006~\u0012")
    @InterfaceC1492Gx
    private final String hashDerivateKey;

    public DeriveModelResponse(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, C1593ug.zd("?AOGUE", (short) (C1499aX.Xd() ^ ((1020270369 ^ 726315907) ^ (-396005635))), (short) (C1499aX.Xd() ^ (1662731480 ^ (-1662717424)))));
        Intrinsics.checkParameterIsNotNull(str2, C1561oA.od("/'8,\u0007'3)5\u001f1!\u0006\u001f2", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (1839345845 ^ (-775509763))))));
        this.derive = str;
        this.hashDerivateKey = str2;
    }

    public static /* synthetic */ DeriveModelResponse copy$default(DeriveModelResponse deriveModelResponse, String str, String str2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            str = deriveModelResponse.derive;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            str2 = deriveModelResponse.hashDerivateKey;
        }
        return deriveModelResponse.copy(str, str2);
    }

    public final String component1() {
        return this.derive;
    }

    public final String component2() {
        return this.hashDerivateKey;
    }

    public final DeriveModelResponse copy(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, C1561oA.Kd("HJXP^N", (short) (C1633zX.Xd() ^ ((1303569886 ^ 263241279) ^ (-1107451644)))));
        int iXd = C1580rY.Xd() ^ (1484356380 ^ (-1777349121));
        Intrinsics.checkParameterIsNotNull(str2, Wg.Zd("VQC\u0017uvb<I\u0013\tY>;/", (short) (OY.Xd() ^ ((1978783939 ^ 2096143155) ^ 151071961)), (short) (OY.Xd() ^ iXd)));
        return new DeriveModelResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeriveModelResponse)) {
            return false;
        }
        DeriveModelResponse deriveModelResponse = (DeriveModelResponse) obj;
        return Intrinsics.areEqual(this.derive, deriveModelResponse.derive) && Intrinsics.areEqual(this.hashDerivateKey, deriveModelResponse.hashDerivateKey);
    }

    public final String getDerive() {
        return this.derive;
    }

    public final String getHashDerivateKey() {
        return this.hashDerivateKey;
    }

    public int hashCode() {
        String str = this.derive;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.hashDerivateKey;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbAppend = new StringBuilder(C1561oA.Xd("Pr\u0001x\u0007v_\u0003xz\u0003i}\r\u000b\u000b\u000b\u0011\u0004G\u0005\u0007\u0015\r\u001b\u000bc", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (1929910733 ^ 491535389))))).append(this.derive);
        short sXd = (short) (Od.Xd() ^ (ZN.Xd() ^ (1079064589 ^ (-1943750524))));
        int[] iArr = new int["+\u001ee]vjEeyo{e\u007foTmh+".length()];
        QB qb = new QB("+\u001ee]vjEeyo{e\u007foTmh+");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        return sbAppend.append(new String(iArr, 0, i2)).append(this.hashDerivateKey).append(Qg.kd("9", (short) (C1607wl.Xd() ^ ((83782855 ^ 282910629) ^ 337820952)), (short) (C1607wl.Xd() ^ (595073669 ^ 595074658)))).toString();
    }
}
