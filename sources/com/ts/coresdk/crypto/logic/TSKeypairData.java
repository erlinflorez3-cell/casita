package com.ts.coresdk.crypto.logic;

import com.ts.coresdk.crypto.Encryptor;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000ePLcz\u0006I\u0006F\u000b6B\u0005*4\u0012\u0006јnjG9LeN.ZS8\u0015s{:'aҝwYП\u0006\u001a,1Id^kuybZ9B\u001f\n$\u0005\u0003,wYޯa\u0014\u0015IP\b\bA[xU9\u000fs|Ԕ!ݨ&:\u007f\u000e\u000f\u001drV\u001e\u0001\u0013Cy\u0010XٛA¤>T\u0013W\u0013\"Z(L-\u0019\u001e\u000bɡ~<NlkEG#1hrT-_>\te\rtXm̡uҐ\"-FDC#mk\u0011\u0018j[m\u0013owK\u0010\u0001)=*w\u0003\u001e\u0383Yÿ\u0018\u00171`\u001bo;4j\u0019i`::q֩bׂT\u0010.\f\t\u0011UJ\u0012$\u001e'v-s֗eڿ\u00125z\taC!\u001alB\u0018z\u00105M*Vę-ݰ\u001fpYcA\u0019\\8\u0014\u0007\u0013 1\u0004?9iY&`C\u001f\u000b|(ŀS͘ARV\f_B{\n\td\b1\u00128"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\u0014#?}4Bi\u001a;,?Jg\n", "", "9dh!T.", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0018X@-O\u001b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`vPm\u001bP\u00024?f<\u000bGj\u001d2K);\u007f\u0013\u001a$d7", ">tQ9\\*$S-]vm(", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`vPm\u001bP\u00024?f<\u000bGj\u001d2K);\u007f\u0013\u001a$d7", "5dc\u001dh)EW\u0017dzr\u000bx\u0018+", "u(;0b4\bb'Hxh9|\u0017.kI&\tT\f&!\u0011O\u0017:\u00049@h\b-uX&+TG9Q42sdp5\\", "1n\\=b5>\\(J", "1n\\=b5>\\(K", ">/", ">0", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`V}W:\u000125g|&\u0001k#BXRE5\u0014'\u0013uuD\u0016m9\ra7DSR*BR\u0007\u001c\u0010!Vc\u0012\u0012\u000b\u000fa\u000b3|\u000e5)\u0015,W\u0001A2~\u0019*\u0019Dt:I`\u0012Kw^d/\u000fhZd[}T Aq&:", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`V}W:\u000125g|&\u0001k#BXRE5\u0014'\u0013uuD\u0016m9\ra7DSR*BR\u0007\u001c\u0010!Vc\u0012\u001c"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSKeypairData {
    private final String keyTag;
    private final Encryptor.PublicKeyData publicKeyData;

    public TSKeypairData(String str, Encryptor.PublicKeyData publicKeyData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(publicKeyData, "");
        this.keyTag = str;
        this.publicKeyData = publicKeyData;
    }

    public static /* synthetic */ TSKeypairData copy$default(TSKeypairData tSKeypairData, String str, Encryptor.PublicKeyData publicKeyData, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = tSKeypairData.keyTag;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            publicKeyData = tSKeypairData.publicKeyData;
        }
        return tSKeypairData.copy(str, publicKeyData);
    }

    public final String component1() {
        return this.keyTag;
    }

    public final Encryptor.PublicKeyData component2() {
        return this.publicKeyData;
    }

    public final TSKeypairData copy(String str, Encryptor.PublicKeyData publicKeyData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(publicKeyData, "");
        return new TSKeypairData(str, publicKeyData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TSKeypairData)) {
            return false;
        }
        TSKeypairData tSKeypairData = (TSKeypairData) obj;
        return Intrinsics.areEqual(this.keyTag, tSKeypairData.keyTag) && Intrinsics.areEqual(this.publicKeyData, tSKeypairData.publicKeyData);
    }

    public final String getKeyTag() {
        return this.keyTag;
    }

    public final Encryptor.PublicKeyData getPublicKeyData() {
        return this.publicKeyData;
    }

    public int hashCode() {
        return (this.keyTag.hashCode() * 31) + this.publicKeyData.hashCode();
    }

    public String toString() {
        return "TSKeypairData(keyTag=" + this.keyTag + ", publicKeyData=" + this.publicKeyData + ")";
    }
}
