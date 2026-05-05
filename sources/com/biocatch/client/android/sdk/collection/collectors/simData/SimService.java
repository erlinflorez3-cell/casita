package com.biocatch.client.android.sdk.collection.collectors.simData;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007f\u0007llA0RnP.XU2\u000f\u0002{<řc$\u007fICU }(ޛeȞ\u0018g\u001dI\u001b\u000eß\u0013\u0006$x3ZWV\u0011]@\u0011bF}BKM\u001eAid\u0003;\u001d `&h}\u0013\u00072*v\u0014'~QR$\u0012^D!@X\r[\r2\u00124Gh\u000f,f\u007fNdL\u001dcH:;\u0005\u007fA|+(>\u000bY%F\u0003+=|o)CBM4C)\u001c\u0017\u0015_s?1M\"A\u0013w?'YY$[Di\u0018\u0014C;̦\u0011o"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0016<+\u001a\u0016]?$D", "", "u(E", "0tX9W\u001aB[wz\nZ\u0014\u0007\b/l", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0016-'\u001c\u0001AK#nK\r", "=oT?T;H`\u0002z\u0003^", "", "7r^", ";bR", ";mR", "0tX9W\u001aMO(\u0003x", "", "5dc\u001aV*", "=oT?T;H`", "5dc\u001aa*", "5dc \\4\u001cO&}ir7|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0016=?\u0018\u0005/", "Bnc._\u001aB[", "", "/uP6_(;Z\u0019l~f", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class SimService {
    public static /* synthetic */ SimDataModel buildSimDataModel$default(SimService simService, String str, String str2, String str3, String str4, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            z2 = true;
        }
        return simService.buildSimDataModel(str, str2, str3, str4, z2);
    }

    public final SimDataModel buildSimDataModel(String operatorName, String iso, String mcc, String mnc, boolean z2) {
        Intrinsics.checkNotNullParameter(operatorName, "operatorName");
        Intrinsics.checkNotNullParameter(iso, "iso");
        Intrinsics.checkNotNullParameter(mcc, "mcc");
        Intrinsics.checkNotNullParameter(mnc, "mnc");
        return new SimDataModel(operatorName, iso, Integer.parseInt(mcc), Integer.parseInt(mnc), z2, null, 32, null);
    }

    public final String getMcc(String str) {
        if (str == null || str.length() == 0) {
            return "-1";
        }
        String strSubstring = str.substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String getMnc(String str) {
        if (str == null || str.length() == 0) {
            return "-1";
        }
        String strSubstring = str.substring(3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final SimType getSimCardType(int i2, int i3) {
        if (i2 == 0) {
            return SimType.NO_SIM;
        }
        if (i2 == 1) {
            return i3 == 0 ? SimType.SINGLE_SIM_INACTIVE : SimType.SINGLE_SIM_ACTIVE;
        }
        if (2 <= i2 && i2 < 4) {
            if (i2 == i3) {
                return SimType.MULTI_SIM_ALL_ACTIVE;
            }
            if (i3 == 0) {
                return SimType.MULTI_SIM_INACTIVE;
            }
            if (i3 == 1) {
                return SimType.MULTI_SIM_SINGLE_ACTIVE;
            }
            if (i3 == 2) {
                return SimType.MULTI_SIM_DOUBLE_ACTIVE;
            }
        }
        return SimType.MULTI_SIM_NOT_SUPPORTED;
    }
}
