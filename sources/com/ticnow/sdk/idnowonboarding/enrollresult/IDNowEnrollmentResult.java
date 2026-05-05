package com.ticnow.sdk.idnowonboarding.enrollresult;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я&\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u0005%4\u0012\u000e\u0007nj?3Le^.ZS0\u001c\u0002ڔd$\n#2FтY\u001a\f\"QS\\\u0004\u007fnx\\[[\u001d\u0007.x\u0019. ǈ%ٕ\u0016\u001b:ԏ\bA9P}AYbz;\u0013&\u0003:F\u0001\u001d\u0001H2\u001fƼ#ټGW\u0014۵HBvC`\u0017m\u0007 \u001d\u0014Jp\u0019,i\u007fNdVCҞfǥ'\u000fqĩf)e?\u000b]-HZ8\u001b\t269SO5C'*Ώ3қ_K\u000bӊ\n?\u000b|5+KKylD^P,#Ag\r\ft|؟1Ōd\u0018/˃geQg\u001c,\u0018|\u0002%J\n^\u001e5aF-Hh^ԋ_Ϣv_HА\u001a`H\u001a\teV\u0019+\u001bA1ݶ\u001f\u0004"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#})Dw\u001d5ZCI{;-^L@\"\u0011u\fW\u00041NSV,ea_=\"\"a\u001d$", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "u(E", "0`R875B>\u0015\u000e}", "", "5dc\u000fT*D2\"\u0003eZ;\u007f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fT*D2\"\u0003eZ;\u007f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "3ma<_3&O$", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#})Dw\u001d5ZCI{;-^L@\u0019\u0010p6U}\u000fCW$", "5dc\u0012a9HZ fvi", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi7v#8TJHkB.\u001cw+\u001deC5[\u0001.N4J72", "Adc\u0012a9HZ fvi", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G @z 5TP;yD%$2E\u0018fl9X}./HY\u0002 C", "3ma<_3FS\"\u000ehm(\f\u0019=", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#})Dw\u001d5ZCI{;-^L@\u0019\u0010p6U}/GU]\u001akN\u0002M\"g", "5dc\u0012a9HZ \u0007zg;j\u0018+t\u00106", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi7v#8TJHkB.\u001cw+\u001deC5[\u0001.NTN5k@\u00029#\"hc", "Adc\u0012a9HZ \u0007zg;j\u0018+t\u00106", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G @z 5TP;yD%$2E\u0018fl9X}.OLW;JanL$ 0Q?", "4q^;g\u000bGW\u0004z\na", "5dc\u0013e6Gbw\b~I(\f\f", "Adc\u0013e6Gbw\b~I(\f\f", "AdT1", "5dc X,=", "Adc X,=", "CtX1G9:\\'zxm0\u0007\u0012", "5dc\"h0=B&z\u0004l(z\u00183o\t", "Adc\"h0=B&z\u0004l(z\u00183o\t", "Bn9@b5", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDNowEnrollmentResult implements Serializable {
    public String backDniPath;
    public IDEnrollMap enrollMap;
    public IDEnrollmentStatus enrollmentStatus;
    public String frontDniPath;
    public String seed;
    public String uuidTransaction;

    public final String getBackDniPath() {
        String str = this.backDniPath;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backDniPath");
        }
        return str;
    }

    public final IDEnrollMap getEnrollMap() {
        IDEnrollMap iDEnrollMap = this.enrollMap;
        if (iDEnrollMap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("enrollMap");
        }
        return iDEnrollMap;
    }

    public final IDEnrollmentStatus getEnrollmentStatus() {
        IDEnrollmentStatus iDEnrollmentStatus = this.enrollmentStatus;
        if (iDEnrollmentStatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("enrollmentStatus");
        }
        return iDEnrollmentStatus;
    }

    public final String getFrontDniPath() {
        String str = this.frontDniPath;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("frontDniPath");
        }
        return str;
    }

    public final String getSeed() {
        String str = this.seed;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seed");
        }
        return str;
    }

    public final String getUuidTransaction() {
        String str = this.uuidTransaction;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uuidTransaction");
        }
        return str;
    }

    public final void setBackDniPath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.backDniPath = str;
    }

    public final void setEnrollMap(IDEnrollMap iDEnrollMap) {
        Intrinsics.checkParameterIsNotNull(iDEnrollMap, "<set-?>");
        this.enrollMap = iDEnrollMap;
    }

    public final void setEnrollmentStatus(IDEnrollmentStatus iDEnrollmentStatus) {
        Intrinsics.checkParameterIsNotNull(iDEnrollmentStatus, "<set-?>");
        this.enrollmentStatus = iDEnrollmentStatus;
    }

    public final void setFrontDniPath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.frontDniPath = str;
    }

    public final void setSeed(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.seed = str;
    }

    public final void setUuidTransaction(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.uuidTransaction = str;
    }

    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        return json;
    }
}
