package com.ticnow.sdk.idnowsecurity.http.request;

import com.google.gson.Gson;
import java.io.Serializable;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u0016\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u0005ABߚ(\u0007\u0015iy3ǲiH<R\u001c.\u001d\u000e\u00144R]t\nQ<m\u001a,$_ѮZ˗kzRҙ#E\u0015\t$|\u000b.OZ\u0007cb'@I\b?aOFސEžxB\rړJ$>\u0002\u0013\u0005:,N\u0019\u0005\u0001\u0014c\u001a\u001cH@\u001f<)ҏYŋ\u001e\u001e\u000ē8\u0003$guRVJriH5s\u001bwOf'\u000e2Sո\u0019ТX3\u0015Ǹy 1NE95'Y\u0012\u0015X,W\u0011O\n=3j}ݗ7ʁwc>ݙ\u0018\u0016\u001b<]\u0011}t,n\u0013W1$5>gcyRdߑ\u0004ߡ\u007f\u0019Dǉ&\b-\\<1:h\u000e#AzCkNf\u001a^p\u0002QʯBа)\f;ٿQ\u001dlho?9P=\u0014\u0013\u0013n;\u000f\b9[\u0003\u00107ڄ'ƻ{]9҅X?Nh\u0018]]o\n\fp\bz\u001c>c\u0018/*\u0013\u0005ϖ1ھ_E+ܩ\u0004\u0004Nauz%bnqwX\u0019X0\u000e.7X\u000bbɵP\u0081\twXӹp.\u0017m*X'\u007f\u000e4.bʥ@D"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}\u000e#hn\u0018\u0003r(;v3WL\\;2", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "u(E", "3lP6_", "", "5dc\u0012`(BZ", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012`(BZ", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "3mc2e7KW'~Xh+|", "5dc\u0012a;>`$\f~l,Z\u0013.e", "Adc\u0012a;>`$\f~l,Z\u0013.e", "4ha@g\u0013:a(gvf,", "5dc\u0013\\9Lb\u007fz\tm\u0015x\u0011/", "Adc\u0013\\9Lb\u007fz\tm\u0015x\u0011/", "4ha@g\u0015:[\u0019", "5dc\u0013\\9Lb\u0002z\u0003^", "Adc\u0013\\9Lb\u0002z\u0003^", "7cT;g0Mg\u0007~\bb(\u0004q?m|(\t", "5dc\u0016W,Gb\u001d\u000e\u000fL,\n\r+lh8\u0004=\u0001$", "Adc\u0016W,Gb\u001d\u000e\u000fL,\n\r+lh8\u0004=\u0001$", "7cT;g0Mg\b\u0013\u0006^", "5dc\u0016W,Gb\u001d\u000e\u000fM@\b\t", "Adc\u0016W,Gb\u001d\u000e\u000fM@\b\t", ">da@b5-g$~", "5dc\u001dX9L]\"m\u000fi,", "Adc\u001dX9L]\"m\u000fi,", "AdR<a+%O'\u000ecZ4|", "5dc X*H\\\u0018evl;e\u00057e", "Adc X*H\\\u0018evl;e\u00057e", "AdR<a+'O!~", "5dc X*H\\\u0018gvf,", "Adc X*H\\\u0018gvf,", "AdV:X5M", "5dc X.FS\"\u000e", "Adc X.FS\"\u000e", "Bn9@b5", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class UserDataRequest implements Serializable {
    private String secondLastName = "";
    private String firstLastName = "";
    private String secondName = "";
    private String firstName = "";
    private String identitySerialNumber = "";
    private String identityType = "";
    private String personType = "";
    private String email = "";
    private String segment = "";
    private String enterpriseCode = "";

    public final String getEmail() {
        return this.email;
    }

    public final String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public final String getFirstLastName() {
        return this.firstLastName;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getIdentitySerialNumber() {
        return this.identitySerialNumber;
    }

    public final String getIdentityType() {
        return this.identityType;
    }

    public final String getPersonType() {
        return this.personType;
    }

    public final String getSecondLastName() {
        return this.secondLastName;
    }

    public final String getSecondName() {
        return this.secondName;
    }

    public final String getSegment() {
        return this.segment;
    }

    public final void setEmail(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.email = str;
    }

    public final void setEnterpriseCode(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.enterpriseCode = str;
    }

    public final void setFirstLastName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.firstLastName = str;
    }

    public final void setFirstName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.firstName = str;
    }

    public final void setIdentitySerialNumber(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.identitySerialNumber = str;
    }

    public final void setIdentityType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.identityType = str;
    }

    public final void setPersonType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.personType = str;
    }

    public final void setSecondLastName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.secondLastName = str;
    }

    public final void setSecondName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.secondName = str;
    }

    public final void setSegment(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.segment = str;
    }

    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        return json;
    }
}
