package com.davivienda.daviviendaapp.bridges.gpay;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.ZN;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,y\bӵLc\u0003\u0010IيH\u0019<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f.ʈW,"}, d2 = {"6dg!b\tRb\u0019Z\bk(\u0011", "", "6dg", "", "/o_,e,ES\u0015\rz"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AntelopWalletModuleKt {
    private static final byte[] hexToByteArray(String str) {
        String strReplace = new Regex(hg.Vd("9\nQ", (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69956506)), (short) (C1607wl.Xd() ^ ((1534252000 ^ 118324648) ^ 1551876514)))).replace(str, "");
        if (!new Regex(C1561oA.ud("2.\u0002}\t\u0010z\u0013-w0&qj", (short) (ZN.Xd() ^ ((939821646 ^ 2094913129) ^ 1155091608)))).matches(strReplace) || strReplace.length() % 2 != 0) {
            throw new IllegalArgumentException(C1561oA.Yd(",J^\u0007[]\\TZT\u000eX^gļ_]Ye1\u0018", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609527726)))) + str);
        }
        int length = strReplace.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            String strSubstring = strReplace.substring(i3, i3 + 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, C1561oA.yd("-.\u001a*2/%))hmlsm", (short) (C1633zX.Xd() ^ ((717427036 ^ 565628072) ^ (-192271268)))));
            bArr[i2] = (byte) Integer.parseInt(strSubstring, CharsKt.checkRadix(C1580rY.Xd() ^ (967156181 ^ (-137147868))));
        }
        return bArr;
    }
}
