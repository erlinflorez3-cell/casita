package com.valid.vssh_bio_validation_library.utils;

import kotlin.Metadata;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0010Gّ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tURPgtOC\u000bI\u0015n\u0016~q\u0015I[\u0001F\u0012\u0015;+oE=6oCDIt<\u0011ڼ6/"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^HjI\u000f@0XR7VON5kVp9#\u0016d\u0017;+\u001b\u0015`Py", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0010H>\u001a8\u001b+7vxhN\nZh\u001dS", "\u0010H>\u001a8\u001b+7vxZK\u0019fu)Ni\"^\u001cmu\t#\\m", "\u0010H>\u001a8\u001b+7vxZK\u0019fu)Hq\"k)\\\br+Vi\u0019]\u0005", "\u0010H>\u001a8\u001b+7vxZK\u0019fu)Ni\u0011[:`\u007f\u00041Vt\u001cU", "\u0010H>\u001a8\u001b+7vxhM\bkx\u001d_o\u0011a)j\t\u007f", "\u0010H>\u001a8\u001b+7vxZK\u0019fu)Uh\u0016k+k\u0001\u00046Ol", "\u0010H>\u001a8\u001b+7vxZK\u0019fu)S_\u0006k-d\u0006\u000bA_x\u001bR\u0014\u0015Sj\u007f#]y\u001b-\"", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u0006W)^v}'N", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u000bm:i\u0001\u0006AZz\u001cd\u0005\u001eH", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u000bm:p\u007fr8Kq#R\u0002\u001c9", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u000fe\u001ef\u0001\u00076", "\u0014H=\u00148\u0019)@|giX\fiu\u0019Ry\u0011e:az\u007f)Oz'c\t\u001eHk", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class EnumBioAuthenticationResult {
    private static final /* synthetic */ EnumBioAuthenticationResult[] $VALUES;
    public static final EnumBioAuthenticationResult BIOMETRIC_ERROR_HW_UNAVAILABLE;
    public static final EnumBioAuthenticationResult BIOMETRIC_ERROR_NONE_ENROLLED;
    public static final EnumBioAuthenticationResult BIOMETRIC_ERROR_NO_HARDWARE;
    public static final EnumBioAuthenticationResult BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED;
    public static final EnumBioAuthenticationResult BIOMETRIC_ERROR_UNSUPPORTED;
    public static final EnumBioAuthenticationResult BIOMETRIC_STATUS_UNKNOWN;
    public static final EnumBioAuthenticationResult BIOMETRIC_SUCCESS;
    public static final EnumBioAuthenticationResult FINGERPRINT_ERROR_CANCELED;
    public static final EnumBioAuthenticationResult FINGERPRINT_ERROR_HW_NOT_PRESENT;
    public static final EnumBioAuthenticationResult FINGERPRINT_ERROR_HW_UNAVAILABLE;
    public static final EnumBioAuthenticationResult FINGERPRINT_ERROR_LOCKOUT;
    public static final EnumBioAuthenticationResult FINGERPRINT_ERROR_NO_FINGERPRINTS;

    static {
        EnumBioAuthenticationResult enumBioAuthenticationResult = new EnumBioAuthenticationResult(C1593ug.zd("?GNMFVUMHeZ]LMP_`", (short) (Od.Xd() ^ (FB.Xd() ^ (-1609526389))), (short) (Od.Xd() ^ (C1580rY.Xd() ^ (313737373 ^ 591005409)))), 0);
        BIOMETRIC_SUCCESS = enumBioAuthenticationResult;
        EnumBioAuthenticationResult enumBioAuthenticationResult2 = new EnumBioAuthenticationResult(C1561oA.od("\u0019\u001f$!\u0018&#\u0019\u0012-\u0012\u001e\u001d\u0019\u001b'\u0015\u0015$\f\u0004\u0014\u0005\u0017\u007f\u0010\u0002", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (2100168350 ^ 325716900)))), 1);
        BIOMETRIC_ERROR_NO_HARDWARE = enumBioAuthenticationResult2;
        EnumBioAuthenticationResult enumBioAuthenticationResult3 = new EnumBioAuthenticationResult(C1561oA.Kd("Zbihaqphc\u0001guvtx\u0007p\u0001\n\u0001zn\u0005py}su\u0001z", (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609507749))), C1499aX.Xd() ^ (-1134257938));
        BIOMETRIC_ERROR_HW_UNAVAILABLE = enumBioAuthenticationResult3;
        EnumBioAuthenticationResult enumBioAuthenticationResult4 = new EnumBioAuthenticationResult(Wg.Zd("ow];\u0013\u0014\u0002H\"@\u0006rR?4\u0011__8\u001f\tNW=\nvfQ ", (short) (Od.Xd() ^ (OY.Xd() ^ (-69945030))), (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951478147))), 770770516 ^ 770770519);
        BIOMETRIC_ERROR_NONE_ENROLLED = enumBioAuthenticationResult4;
        EnumBioAuthenticationResult enumBioAuthenticationResult5 = new EnumBioAuthenticationResult(C1561oA.Xd("_gnmfvumh\u0006z|j~\u0001\u007f\r\u0004}{\u007f\u0002\u000b\u0003", (short) (FB.Xd() ^ ((1426776320 ^ 829310769) ^ 1684324750))), 870042929 ^ 870042933);
        BIOMETRIC_STATUS_UNKNOWN = enumBioAuthenticationResult5;
        EnumBioAuthenticationResult enumBioAuthenticationResult6 = new EnumBioAuthenticationResult(Wg.vd("\u0015\u001b$!\u001c*+!\u000e)\u0012\u001e!\u001d#/\u0018\u0010\u0018\u0019\u0017\u0016\u0018\u001a\u000f~\u0001", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (1340394508 ^ (-209686706))))), 1942358418 ^ 1942358423);
        BIOMETRIC_ERROR_UNSUPPORTED = enumBioAuthenticationResult6;
        int iXd = C1580rY.Xd() ^ (1472163131 ^ 1714817279);
        short sXd = (short) (Od.Xd() ^ (195105909 ^ (-195127102)));
        short sXd2 = (short) (Od.Xd() ^ iXd);
        int[] iArr = new int["SY^[R`]SLgLXWSUaTEBSOEOSXMG:6H8QC5@C6>0.".length()];
        QB qb = new QB("SY^[R`]SLgLXWSUaTEBSOEOSXMG:6H8QC5@C6>0.");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        EnumBioAuthenticationResult enumBioAuthenticationResult7 = new EnumBioAuthenticationResult(new String(iArr, 0, i2), C1499aX.Xd() ^ (557977478 ^ (-1658415252)));
        BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = enumBioAuthenticationResult7;
        short sXd3 = (short) (FB.Xd() ^ (889214958 ^ 889207804));
        short sXd4 = (short) (FB.Xd() ^ ((842149293 ^ 1585655749) ^ 1823550420));
        int[] iArr2 = new int["\u0002\u0004\b\u007f|\t\u0006\u0007|\u0001\u0006\u0010t\u0001\u007f{}\nliuijphf".length()];
        QB qb2 = new QB("\u0002\u0004\b\u007f|\t\u0006\u0007|\u0001\u0006\u0010t\u0001\u007f{}\nliuijphf");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
            i3++;
        }
        EnumBioAuthenticationResult enumBioAuthenticationResult8 = new EnumBioAuthenticationResult(new String(iArr2, 0, i3), FB.Xd() ^ 1609527092);
        FINGERPRINT_ERROR_CANCELED = enumBioAuthenticationResult8;
        EnumBioAuthenticationResult enumBioAuthenticationResult9 = new EnumBioAuthenticationResult(C1561oA.ud("\u0002\u0004\b\u007f|\t\u0006\u0007|\u0001\u0006\u0010t\u0001\u007f{}\nq\u007f\u0007ttx\u0003rserckp", (short) (OY.Xd() ^ (1816087278 ^ 1816083401))), (709322059 ^ 548322117) ^ 183098886);
        FINGERPRINT_ERROR_HW_NOT_PRESENT = enumBioAuthenticationResult9;
        EnumBioAuthenticationResult enumBioAuthenticationResult10 = new EnumBioAuthenticationResult(C1561oA.yd("\u0012\u0014\u0018\u0010\u0015!\u001e\u001f\u001d!&0\u001d)($.:\"0?4,\u001e:$+-))2*", (short) (C1499aX.Xd() ^ ((60853787 ^ 2073652882) ^ (-2017055802)))), FB.Xd() ^ (1623670918 ^ 1059598268));
        FINGERPRINT_ERROR_HW_UNAVAILABLE = enumBioAuthenticationResult10;
        EnumBioAuthenticationResult enumBioAuthenticationResult11 = new EnumBioAuthenticationResult(C1561oA.Yd("\r\u0011\u0017\u0011\u0010\u001e\u001d \u0018\u001e%1\u0018&'%)7%)\u001e',33", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (-1849955657)))), (107573912 ^ 1062626673) ^ 960436195);
        FINGERPRINT_ERROR_LOCKOUT = enumBioAuthenticationResult11;
        EnumBioAuthenticationResult enumBioAuthenticationResult12 = new EnumBioAuthenticationResult(Xg.qd("MQWQP^]`X^eqXfgeiwgizbflfesrumszz", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (1774179680 ^ (-707045615)))), (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864701985))), 720439947 ^ 720439936);
        FINGERPRINT_ERROR_NO_FINGERPRINTS = enumBioAuthenticationResult12;
        $VALUES = new EnumBioAuthenticationResult[]{enumBioAuthenticationResult, enumBioAuthenticationResult2, enumBioAuthenticationResult3, enumBioAuthenticationResult4, enumBioAuthenticationResult5, enumBioAuthenticationResult6, enumBioAuthenticationResult7, enumBioAuthenticationResult8, enumBioAuthenticationResult9, enumBioAuthenticationResult10, enumBioAuthenticationResult11, enumBioAuthenticationResult12};
    }

    private EnumBioAuthenticationResult(String str, int i2) {
    }

    public static EnumBioAuthenticationResult valueOf(String str) {
        return (EnumBioAuthenticationResult) Enum.valueOf(EnumBioAuthenticationResult.class, str);
    }

    public static EnumBioAuthenticationResult[] values() {
        return (EnumBioAuthenticationResult[]) $VALUES.clone();
    }
}
