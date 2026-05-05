package com.ts.coresdk.crypto.api;

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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000ePLcz\u0012I\u0006>é6B\r+4\u0012}\u0007njG6LeN1Xݿ0%ӆ,4Rkd\u0011S?c%\u0016\"7N^muzb\\!B=\u0005&|x9aU'\\ܫ\u00134H\bML\u0016}KAxtd\u0004fލ#أ}\u0007\u0007\"8KX\u0007\tLc\u000e(/no\u0001ŭ\u000ê\t\u001c\u0018\u000fL#I,jqf6vk$ǅ0ݭ\u0007kHX5bx+[\u001b^TU˙'g$+NBM\u0015SR3\u000fX[M\u000fWsS\u0004\u0017&W1OseCp\u007fB\u0014qͅ\fǁv(b\u0013_oT?9a{K~\u001fX}\t\u0007%>\u001a\r47\u000fΪ.բj\n\u0014E\u0003\u0006\u001cN^\u0017vB.\u000f(پ\u0016Ӿ\u000451N)|\u001aoI0f7*\u0004Sͬ\"ъr#ak\u001cce3bwi1\u007f?sM%˫[ǀq\u000exd\b*\u00121_\u00025}\u001f1g?E_Q%7j0GzlMݛbĈWsZJF&|\u0017O,\u000f\u0011hG5\u001dyVlXZ\u0010\u0004!+ͽ\u007fݔ\u0017*dyB'3\u0011fQnpxP"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\"v9 U\u0002-%q\u00187*GEs4-\"l_$\u0014m4Y\u0006\u0016G_]:2", "", "<dV.g0OSu\u000f\nm6\u0006", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u001bX.:b\u001d\u0010z;<\f\u00189n", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "AtQ!\\;ES", "5dc h)-W(\u0006z", "Bhc9X", "5dc!\\;ES", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", ">/", ">0", ">1", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d\u00105*fZ<L\"[X\u0018[+\u001b\u0004_\u000b\"{XB.\u0012uE\r?2f\f*x1n}0Z\u0012PV\u0019\u007fI)wS]]dTKMm9S\fr,j\u0010", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d\u0010?"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class KeyPairSignBiometricPromptTexts {
    private final String negativeButton;
    private final String subTitle;
    private final String title;

    public KeyPairSignBiometricPromptTexts(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.subTitle = str2;
        this.negativeButton = str3;
    }

    public static /* synthetic */ KeyPairSignBiometricPromptTexts copy$default(KeyPairSignBiometricPromptTexts keyPairSignBiometricPromptTexts, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = keyPairSignBiometricPromptTexts.title;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = keyPairSignBiometricPromptTexts.subTitle;
        }
        if ((i2 & 4) != 0) {
            str3 = keyPairSignBiometricPromptTexts.negativeButton;
        }
        return keyPairSignBiometricPromptTexts.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subTitle;
    }

    public final String component3() {
        return this.negativeButton;
    }

    public final KeyPairSignBiometricPromptTexts copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new KeyPairSignBiometricPromptTexts(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyPairSignBiometricPromptTexts)) {
            return false;
        }
        KeyPairSignBiometricPromptTexts keyPairSignBiometricPromptTexts = (KeyPairSignBiometricPromptTexts) obj;
        return Intrinsics.areEqual(this.title, keyPairSignBiometricPromptTexts.title) && Intrinsics.areEqual(this.subTitle, keyPairSignBiometricPromptTexts.subTitle) && Intrinsics.areEqual(this.negativeButton, keyPairSignBiometricPromptTexts.negativeButton);
    }

    public final String getNegativeButton() {
        return this.negativeButton;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subTitle;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.negativeButton.hashCode();
    }

    public String toString() {
        return "KeyPairSignBiometricPromptTexts(title=" + this.title + ", subTitle=" + this.subTitle + ", negativeButton=" + this.negativeButton + ")";
    }
}
