package com.valid.vssh_bio_validation_library.utils.model;

import kotlin.Metadata;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\nGّ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tURPgtOC\u000bI\u0015َ\u001a\u007f"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju.\u007f7O,[9f_aQ\u001f\u00120", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0016SC\u001d", "\u0011TB!B\u0014", "\u001e@A 8\u0019", "#R4\u001fR\u0013(1~^Y", "%Q>\u001b:&)/\u0007llH\u0019[", "\u001cNN\u001b8\u001b0=\u0006d", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class EnumErrorType {
    private static final /* synthetic */ EnumErrorType[] $VALUES;
    public static final EnumErrorType CUSTOM;
    public static final EnumErrorType HTTP;
    public static final EnumErrorType NO_NETWORK;
    public static final EnumErrorType PARSER;
    public static final EnumErrorType USER_LOCKED;
    public static final EnumErrorType WRONG_PASSWORD;

    static {
        EnumErrorType enumErrorType = new EnumErrorType(C1561oA.od("\"-,'", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (1362039658 ^ (-1621493522))))), 0);
        HTTP = enumErrorType;
        short sXd = (short) (Od.Xd() ^ ((213786685 ^ 1509726089) ^ (-1430437615)));
        int[] iArr = new int["2EDFBA".length()];
        QB qb = new QB("2EDFBA");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        EnumErrorType enumErrorType2 = new EnumErrorType(new String(iArr, 0, i2), 1);
        CUSTOM = enumErrorType2;
        EnumErrorType enumErrorType3 = new EnumErrorType(Wg.Zd("Mez\u007f}n", (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ (793598581 ^ 1528574810))), (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ (1674431821 ^ 1380246308)))), 1350303298 ^ 1350303296);
        PARSER = enumErrorType3;
        EnumErrorType enumErrorType4 = new EnumErrorType(C1561oA.Xd("WVIWeSWLUPP", (short) (ZN.Xd() ^ ((233190625 ^ 41622717) ^ 261951459))), (1365161634 ^ 638177049) ^ 2002221496);
        USER_LOCKED = enumErrorType4;
        EnumErrorType enumErrorType5 = new EnumErrorType(Wg.vd("qmkke~pbuv{txk", (short) (Od.Xd() ^ (C1633zX.Xd() ^ (819470142 ^ 1149837919)))), (491932527 ^ 1924953761) ^ 1877884362);
        WRONG_PASSWORD = enumErrorType5;
        int iXd = C1580rY.Xd() ^ (1369329660 ^ 1612129631);
        EnumErrorType enumErrorType6 = new EnumErrorType(Qg.kd("zz\nwm{}tvn", (short) (C1499aX.Xd() ^ ((1734683816 ^ 1268701033) ^ (-754688364))), (short) (C1499aX.Xd() ^ iXd)), C1607wl.Xd() ^ (1371910792 ^ 1065460055));
        NO_NETWORK = enumErrorType6;
        $VALUES = new EnumErrorType[]{enumErrorType, enumErrorType2, enumErrorType3, enumErrorType4, enumErrorType5, enumErrorType6};
    }

    private EnumErrorType(String str, int i2) {
    }

    public static EnumErrorType valueOf(String str) {
        return (EnumErrorType) Enum.valueOf(EnumErrorType.class, str);
    }

    public static EnumErrorType[] values() {
        return (EnumErrorType[]) $VALUES.clone();
    }
}
