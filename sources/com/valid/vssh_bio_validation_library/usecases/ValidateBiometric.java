package com.valid.vssh_bio_validation_library.usecases;

import com.valid.vssh_bio_validation_library.utils.EnumBioAuthenticationResult;
import kotlin.Metadata;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000f\u0002{<$q$yCAU0ԂR\t}M(jĔNZ\u0019CW=$y\u0003,wW)a \u0012JB\u001eCcQ}BQ`#<5?@)P\u0015\u0015\u0012*9v\u0019ͯ~MQ\u0016\"6F{JT\u0013S+!\"\bN / \u000boߗ:T"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SIk2\u001a#ho\u0003w_3Ru#VL+0fZrL!\u0016Xc", "", "u(E", "D`[6W(MS{z\b]>x\u0016/B\u00042\u0004@\u0010$\u001bE", "", "0h^#T3BR\u0015\u000e~h5X\u0019>hl(\u0007J\u000f\u001b&Q|\"", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017P;v>,\u0019wkF\u001b-\tR\u0001\u0018CSR+XavG\u001dmj\u001dQ\u0018\r\u0010cO(}ND3]", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "@db=b5LS", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017KEj4%^Y]@\u000bb(]v\nCYM>X_r%\u001e\u0011Z\u0015$", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class ValidateBiometric {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 1}, pn = "", xs = "")
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumBioAuthenticationResult.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[EnumBioAuthenticationResult.BIOMETRIC_SUCCESS.ordinal()] = 1;
            iArr[EnumBioAuthenticationResult.BIOMETRIC_ERROR_NO_HARDWARE.ordinal()] = 2;
            iArr[EnumBioAuthenticationResult.BIOMETRIC_ERROR_HW_UNAVAILABLE.ordinal()] = 3;
            iArr[EnumBioAuthenticationResult.BIOMETRIC_ERROR_NONE_ENROLLED.ordinal()] = 4;
            iArr[EnumBioAuthenticationResult.BIOMETRIC_STATUS_UNKNOWN.ordinal()] = 5;
            iArr[EnumBioAuthenticationResult.BIOMETRIC_ERROR_UNSUPPORTED.ordinal()] = 6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void validateHardwareBiometric(com.valid.vssh_bio_validation_library.repository.BioValidationAuthRepository r13, android.content.Context r14, kotlin.jvm.functions.Function1<? super com.valid.vssh_bio_validation_library.model.ValidateHardwareModel, kotlin.Unit> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valid.vssh_bio_validation_library.usecases.ValidateBiometric.validateHardwareBiometric(com.valid.vssh_bio_validation_library.repository.BioValidationAuthRepository, android.content.Context, kotlin.jvm.functions.Function1):void");
    }
}
