package com.valid.vssh_bio_validation_library.utils.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.hg;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007tpA0JwP.`\\2\u000fq}:Ša:ڎs;\u0004\u0019>I\u0019WTgunb\\!B=\u0007&\u0001p,WW\u0011_(\u000e`E\u007fG9M}AQb\u000b53%ݨ&8\b\u000bI#8\\(x\u0011By\rXٚA9C`\"e\u00070\u00114AfӼ\u001f%u\\L`ns9](IފCĚ+_>\r\u0016=Tk?\r%ѭN3F7C\u0015=U\u0019\u0006\u0001\\o\u000bEqK\u0007\u0001)=*wv\b>^\u007f\"\u0019CQ#\\!+#ԫPԃ\u0010'9g,\\^'@w)\u0016=B\u0012)\u001e)^-[\u0019-۳\u000f{{\u0001oXP0c\tɬy*=%B\u00183Y<aǯP2Y'PO}\u001b\fL&7r__+םlڠ\u001f`\u007f\u0383ISFDVV*[Cv\u0012z3 8\u0004HI\u0016.*\u0012d\u001bc;2ޅ/\u074co\u000ePֳ\u007fx\u000bkv_\nTNM0|fW8\r$\\Zc3p\u0007X\u00170gۻ(Τ\u000b\f\u0010\u0013.o\u0010>'4\u001e^ojo{[oܬ)M"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju.\u00044QY66[Ry*\u0014 e\u0018W9\rZ", "", "3qa<e\u001bR^\u0019", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju.\u007f7O,[9f_aQ\u001f\u00120", "3qa<e\u0014>a'z|^", "", "7mc2e5:Zx\f\bh9Z\u0013.e", "", "uKR<`uOO \u0003y(=\u000b\u00172_|,\u0006:\u0012\u0013\u001eKn\nKz/>S\u0005$4z\u0012;a\rKz8%#2iC\u0006c3\u0018V0WT.9i\\\u007f,(\u001dZc50\t\u0016U\u000b+jM9hu;V\u0006DjVr\u001b\nFf:IR\u0019ICx~P)jFf5=8", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`\u0001~\tl(~\t", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0012e9H`\b\u0013\u0006^", "u(;0b4\bd\u0015\u0006~]u\u000e\u0017=hy%\u007fJz(\u0013Ns\r8\u0006)?bw';j#*ZW\u0005{C\"\u001cv+A\u0011b,U@\u0007P\\V\fi_|J\u0003&e\u000e$", "Adc\u0012e9H`\b\u0013\u0006^", "uKR<`uOO \u0003y(=\u000b\u00172_|,\u0006:\u0012\u0013\u001eKn\nKz/>S\u0005$4z\u0012;a\rKz8%#2iC\u0006c3\u0018V0WT.9i\\\u007f,(\u001dZc\u0012\u001c", "5dc\u0016a;>`\"z\u0002>9\n\u0013<C\n'{", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u0016a;>`\"z\u0002>9\n\u0013<C\n'{", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "uKR<`uOO \u0003y(=\u000b\u00172_|,\u0006:\u0012\u0013\u001eKn\nKz/>S\u0005$4z\u0012;a\rKz8%#2iC\u0006c3\u0018V0WT.9i\\\u007f,(\u001dZc50\t\u0016U\u000b+jM9hu;V\u0006DjVr\u001b\nFf:IR\u0019ICx~P)jFf5=.?Ojsu\bf![\u0004K2\"t\u0013\u0018lZ(\u001bwZ\u0015qN\tkqP\u0013\u0002<!KihZ\u000f\u007fd@{5hS\u0006v\u00129\"T8\u00027\u0011\u001c45d\f8g&Ih\u0002#,2", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class ErrorModelResponse {

    @SerializedName(alternate = {}, value = "\f\u0018\u0017\u0013\u0015n\u0006\u0013\u0012~\u0004\u0001")
    @InterfaceC1492Gx
    private String errorMessage;

    @SerializedName(alternate = {}, value = "\f\u0018\u0017\u0013\u0015u\u001a\u0010\u0004")
    @InterfaceC1492Gx
    private EnumErrorType errorType;

    @SerializedName(alternate = {}, value = "\u0010\u0014\u0019\t\u0015\u0010\u0002\fc\u0010\u000f\u000b\r\\\b{{")
    @InterfaceC1492Gx
    private Integer internalErrorCode;

    public ErrorModelResponse() {
        this(null, null, null, 828769973 ^ 828769970, null);
    }

    public ErrorModelResponse(EnumErrorType enumErrorType, String str, Integer num) {
        this.errorType = enumErrorType;
        this.errorMessage = str;
        this.internalErrorCode = num;
    }

    public /* synthetic */ ErrorModelResponse(EnumErrorType enumErrorType, String str, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? EnumErrorType.CUSTOM : enumErrorType, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : num);
    }

    public static /* synthetic */ ErrorModelResponse copy$default(ErrorModelResponse errorModelResponse, EnumErrorType enumErrorType, String str, Integer num, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            enumErrorType = errorModelResponse.errorType;
        }
        if ((2 & i2) != 0) {
            str = errorModelResponse.errorMessage;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            num = errorModelResponse.internalErrorCode;
        }
        return errorModelResponse.copy(enumErrorType, str, num);
    }

    public final EnumErrorType component1() {
        return this.errorType;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final Integer component3() {
        return this.internalErrorCode;
    }

    public final ErrorModelResponse copy(EnumErrorType enumErrorType, String str, Integer num) {
        return new ErrorModelResponse(enumErrorType, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorModelResponse)) {
            return false;
        }
        ErrorModelResponse errorModelResponse = (ErrorModelResponse) obj;
        return Intrinsics.areEqual(this.errorType, errorModelResponse.errorType) && Intrinsics.areEqual(this.errorMessage, errorModelResponse.errorMessage) && Intrinsics.areEqual(this.internalErrorCode, errorModelResponse.internalErrorCode);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final EnumErrorType getErrorType() {
        return this.errorType;
    }

    public final Integer getInternalErrorCode() {
        return this.internalErrorCode;
    }

    public int hashCode() {
        EnumErrorType enumErrorType = this.errorType;
        int iHashCode = (enumErrorType != null ? enumErrorType.hashCode() : 0) * 31;
        String str = this.errorMessage;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.internalErrorCode;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setErrorType(EnumErrorType enumErrorType) {
        this.errorType = enumErrorType;
    }

    public final void setInternalErrorCode(Integer num) {
        this.internalErrorCode = num;
    }

    public String toString() {
        StringBuilder sbAppend = new StringBuilder(hg.Vd("e\u0012\u0011\r\u000fh\n}}\u0004hz\b\u0004\u0002\u007f\u0004t6r~}y{\\\u0001vjA", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207805634))), (short) (C1633zX.Xd() ^ (OY.Xd() ^ (365413086 ^ (-300713920)))))).append(this.errorType).append(C1561oA.ud("\u0018\u000bO[ZVX2IVUBGD\u001b", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (1016559732 ^ (-220080616)))))).append(this.errorMessage);
        short sXd = (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69954309)));
        int[] iArr = new int["\u0014\tSY`R`]AM'UVTX*G=?\u0018".length()];
        QB qb = new QB("\u0014\tSY`R`]AM'UVTX*G=?\u0018");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        return sbAppend.append(new String(iArr, 0, i2)).append(this.internalErrorCode).append(C1561oA.Yd("\n", (short) (Od.Xd() ^ (1892615515 ^ (-1892627481))))).toString();
    }
}
