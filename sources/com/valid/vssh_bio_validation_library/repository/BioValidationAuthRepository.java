package com.valid.vssh_bio_validation_library.repository;

import android.content.Context;
import androidx.biometric.BiometricManager;
import com.valid.vssh_bio_validation_library.utils.EnumBioAuthenticationResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.ZN;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG6L͜^\u008c\u0003SX\u000e,~Č([2q\fQc\u001b\u0016\"7Q~kuqbZ9G?\f\u001cxx1aU'cܱ\u00139"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017P;v>,\u0019wkF\u001b-\tR\u0001\u0018CSR+XavG\u001dmj\u001dQ\u0018\r\u0010cO(}ND3]", "", "u(E", "D`[6W(MW#\b]Z9{\u001b+r\u007f\u0005\u007fJ\t\u0017&Ts\f", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^HjI\u000f@0XR7VON5kVp9#\u0016d\u0017;+\u001b\u0015`Py", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/tc5X5MW\u0017z\nh9\u000b", "", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class BioValidationAuthRepository {
    public static /* synthetic */ EnumBioAuthenticationResult validationHardwareBiometric$default(BioValidationAuthRepository bioValidationAuthRepository, Context context, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = FB.Xd() ^ (1927788193 ^ 755554717);
        }
        return bioValidationAuthRepository.validationHardwareBiometric(context, i2);
    }

    public final EnumBioAuthenticationResult validationHardwareBiometric(Context context, int i2) {
        Intrinsics.checkParameterIsNotNull(context, C1561oA.Qd("5@>C3E@", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69956841)))));
        BiometricManager biometricManagerFrom = BiometricManager.from(context);
        Intrinsics.checkExpressionValueIsNotNull(biometricManagerFrom, C1593ug.zd("[\u0004\u000b\n\u0003\u0013\u0012\n\u0005o\u0005\u0013\u0007\u000e\r\u001bW\u0011\u001e\u001c\u001bV\u0013  '\u0019-*_", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134244219))), (short) (ZN.Xd() ^ ((1202223221 ^ 1382372921) ^ 365763624))));
        int iXd = C1633zX.Xd() ^ (612662906 ^ (-1356143170));
        if (i2 != iXd && i2 != (FB.Xd() ^ (301457289 ^ 1310240837)) && i2 != ((1685391937 ^ 447784344) ^ 2126852057)) {
            return EnumBioAuthenticationResult.BIOMETRIC_ERROR_HW_UNAVAILABLE;
        }
        int iCanAuthenticate = biometricManagerFrom.canAuthenticate(i2);
        return iCanAuthenticate != ((1325229169 ^ 451773803) ^ (-1410392348)) ? iCanAuthenticate != iXd ? iCanAuthenticate != 0 ? iCanAuthenticate != 1 ? iCanAuthenticate != (C1499aX.Xd() ^ (-1134257945)) ? iCanAuthenticate != (OY.Xd() ^ (708669730 ^ 773224902)) ? EnumBioAuthenticationResult.BIOMETRIC_ERROR_HW_UNAVAILABLE : EnumBioAuthenticationResult.BIOMETRIC_ERROR_NO_HARDWARE : EnumBioAuthenticationResult.BIOMETRIC_ERROR_NONE_ENROLLED : EnumBioAuthenticationResult.BIOMETRIC_ERROR_HW_UNAVAILABLE : EnumBioAuthenticationResult.BIOMETRIC_SUCCESS : EnumBioAuthenticationResult.BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED : EnumBioAuthenticationResult.BIOMETRIC_ERROR_UNSUPPORTED;
    }
}
