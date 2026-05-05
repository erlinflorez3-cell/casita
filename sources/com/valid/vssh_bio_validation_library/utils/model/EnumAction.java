package com.valid.vssh_bio_validation_library.utils.model;

import kotlin.Metadata;
import yg.C1499aX;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Xu;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\tGّ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tURPgtOӂ\u000fI"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju.\u007f7O(L;`\\{\u0013", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "$@;\u00167\b-3\u0013aVK\u000bnd\u001cE", "!@E\u0012R\u000b\u001aBtxh:\r\\o#", "$@;\u00167\b-3\u0013^mB\u001ak\u0003\u001dE]\u0018h zur6K", "\u0015DC,7\b-/\u0013lV?\fc|", "\u0012D;\u0012G\f82tmVX\u001aXi\u000fLs", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class EnumAction {
    private static final /* synthetic */ EnumAction[] $VALUES;
    public static final EnumAction DELETE_DATA_SAFELY;
    public static final EnumAction GET_DATA_SAFELY;
    public static final EnumAction SAVE_DATA_SAFELY;
    public static final EnumAction VALIDATE_EXIST_SECURE_DATA;
    public static final EnumAction VALIDATE_HARDWARE;

    static {
        EnumAction enumAction = new EnumAction(C1626yg.Ud("\u001949\u0010%w^\u001e`@\u0017(.`\u0013]\f", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134254015))), (short) (FB.Xd() ^ (C1607wl.Xd() ^ (693681294 ^ 1193056815)))), 0);
        VALIDATE_HARDWARE = enumAction;
        EnumAction enumAction2 = new EnumAction(Ig.wd("Dad71i\u0019\u001b<xl~47h\u0016", (short) (OY.Xd() ^ (OY.Xd() ^ (493814780 ^ 423901446)))), 1);
        SAVE_DATA_SAFELY = enumAction2;
        EnumAction enumAction3 = new EnumAction(EO.Od("\u0001\u001b\u0014u`\u0012En/\u0006\u001bi\u001e%T#QQ\f5>\u001d\u0018\u0019B_", (short) (OY.Xd() ^ (C1607wl.Xd() ^ (1496123378 ^ 929636006)))), (1482520523 ^ 968500558) ^ 1642549895);
        VALIDATE_EXIST_SECURE_DATA = enumAction3;
        short sXd = (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (1212325023 ^ (-2043404876))));
        int[] iArr = new int[";8FP40B.K>+/-3?".length()];
        QB qb = new QB(";8FP40B.K>+/-3?");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        EnumAction enumAction4 = new EnumAction(new String(iArr, 0, i2), 1205599021 ^ 1205599022);
        GET_DATA_SAFELY = enumAction4;
        EnumAction enumAction5 = new EnumAction(C1593ug.zd("tv~x\tz\u0016{y\u000e{\u001b\u0010~\u0005\u0005\r\u001b", (short) (C1499aX.Xd() ^ ((292856511 ^ 308789338) ^ (-51600996))), (short) (C1499aX.Xd() ^ (388415433 ^ (-388412370)))), 776828656 ^ 776828660);
        DELETE_DATA_SAFELY = enumAction5;
        $VALUES = new EnumAction[]{enumAction, enumAction2, enumAction3, enumAction4, enumAction5};
    }

    private EnumAction(String str, int i2) {
    }

    public static EnumAction valueOf(String str) {
        return (EnumAction) Enum.valueOf(EnumAction.class, str);
    }

    public static EnumAction[] values() {
        return (EnumAction[]) $VALUES.clone();
    }
}
