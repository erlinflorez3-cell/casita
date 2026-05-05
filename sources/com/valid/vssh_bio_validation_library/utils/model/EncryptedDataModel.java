package com.valid.vssh_bio_validation_library.utils.model;

import androidx.webkit.ProxyConfig;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.ZO;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u00168\u000b4I\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ša:ڎs;\u0004\u0019>5\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019-֒Yxk\u0015W9PvW3{p\u0004˧a==\u0013(J\"fzKі\u001brc\u001e\u007f\u0013CyÈB6FpHR%M3\u001bB\fD \u000f tg|7\u000fȔ\\\u0003@1\r\u0002B|2\u00106\u000bY%Hj&;u(Գ,\t>C\"=S1\u0015\u0019Đ>KF\u007fL\u001dhU7qʵr(Ef\u007f,\u0015YPոax.ؘ\u001dSf\u001050 rYR&(&{ԫ\u0011B\f\u05fa\u001e)N4;\u001fǺ\f\u001f"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju.\u007f%T`Y;\\QQ9#\u000eB\u0018M+\u0014Z", "", "1h_5X9-S,\u000e", "", "7mXA\\(EW.z\nb6\u0006y/c\u000f2\t", "uZ1(5o/", "5dc\u0010\\7AS&mzq;", "u(J\u000f", "5dc\u0016a0MW\u0015\u0006~s(\f\r9np(yO\u000b$", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class EncryptedDataModel {
    private final byte[] cipherText;
    private final byte[] initializationVector;

    public EncryptedDataModel(byte[] bArr, byte[] bArr2) {
        Intrinsics.checkParameterIsNotNull(bArr, hg.Vd("AFLC?K,<NI", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (-864706315))), (short) (C1499aX.Xd() ^ ((289200181 ^ 99583242) ^ (-349391851)))));
        Intrinsics.checkParameterIsNotNull(bArr2, C1561oA.ud("593=1(2.>$6*/-\u0014\"\u001f/)+", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134261308)))));
        this.cipherText = bArr;
        this.initializationVector = bArr2;
    }

    public static /* synthetic */ EncryptedDataModel copy$default(EncryptedDataModel encryptedDataModel, byte[] bArr, byte[] bArr2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            bArr = encryptedDataModel.cipherText;
        }
        if ((i2 & 2) != 0) {
            bArr2 = encryptedDataModel.initializationVector;
        }
        return encryptedDataModel.copy(bArr, bArr2);
    }

    public final byte[] component1() {
        return this.cipherText;
    }

    public final byte[] component2() {
        return this.initializationVector;
    }

    public final EncryptedDataModel copy(byte[] bArr, byte[] bArr2) {
        Intrinsics.checkParameterIsNotNull(bArr, C1561oA.yd("\u001b *!\u0019%\n\u001a(#", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207813351)))));
        Intrinsics.checkParameterIsNotNull(bArr2, C1561oA.Yd("V\\XdZS_]oWkahhQa`rnr", (short) (C1633zX.Xd() ^ ((2040970727 ^ 1977092692) ^ (-209649613)))));
        return new EncryptedDataModel(bArr, bArr2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptedDataModel)) {
            return false;
        }
        EncryptedDataModel encryptedDataModel = (EncryptedDataModel) obj;
        return Intrinsics.areEqual(this.cipherText, encryptedDataModel.cipherText) && Intrinsics.areEqual(this.initializationVector, encryptedDataModel.initializationVector);
    }

    public final byte[] getCipherText() {
        return this.cipherText;
    }

    public final byte[] getInitializationVector() {
        return this.initializationVector;
    }

    public int hashCode() {
        byte[] bArr = this.cipherText;
        int iHashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        byte[] bArr2 = this.initializationVector;
        return iHashCode + (bArr2 != null ? Arrays.hashCode(bArr2) : 0);
    }

    public String toString() {
        return Xg.qd("t\u001f\u0015%-%*\u001c\u001c|\u001b/\u001d\n-#%-i&-5.,:\u001d/C@\n", (short) (OY.Xd() ^ ((1798348667 ^ 840639581) ^ 1496052631)), (short) (OY.Xd() ^ (FB.Xd() ^ (2108612080 ^ 574728994)))) + Arrays.toString(this.cipherText) + Jg.Wd(">xFQh:21'+\u007f|\u001c\u0017`W9PP9?I\u0007", (short) (C1607wl.Xd() ^ (2095202080 ^ 2095200032)), (short) (C1607wl.Xd() ^ ((2145649751 ^ 1800258763) ^ 346669663))) + Arrays.toString(this.initializationVector) + ZO.xd(ProxyConfig.MATCH_ALL_SCHEMES, (short) (C1633zX.Xd() ^ (Od.Xd() ^ (1680756414 ^ (-601076031)))), (short) (C1633zX.Xd() ^ (102973368 ^ (-102964117))));
    }
}
