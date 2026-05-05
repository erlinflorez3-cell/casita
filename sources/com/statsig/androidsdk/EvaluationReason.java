package com.statsig.androidsdk;

import java.util.Arrays;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eRLcz\u0004I\u0006>\u00176B\u0005-2ߡv\u001d߿\u001b?@FuH\\ɟ\u0002)Op\u00024ż_$\u007fC\u0004[(~:\t}P.{WJ`\u000e,\u000f\f\u001aaj2N>xc\u0018w2Hv(3Sw&9f}\u001f\u0005&<\u000b8\u007f\u0010i\u001a0Txv\u0001P4\f\u0018>ϴtI"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)$m\u0012<WL\u0011", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "BnBAe0GU", "", "\u001cdcDb9D", "\u0011`R5X", "!sX0^@", "\u001anR._\u0016OS&\f~],", "#ma2V6@\\\u001d\u0014z]", "#mX;\\;BO \u0003\u0010^+", "\u0010n^Af;KO$", "\u001dm32i0<Sx\u0010ve\b{\u0005:t\u007f5XJ\u000b&%V|\nGc%3c\u007f);\u0003\u0016-", "\u001dm32i0<Sx\u0010ve\b{\u0005:t\u007f5XJ\u000b&%V|\nGf.BY{*9v\u001aCMB", "\u0017me._0=0#\t\nl;\n\u0005:", "\u001cdcDb9D<#\u000ebh+\u0001\n3e~", "\u0013qa<e", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public enum EvaluationReason {
    Network,
    Cache,
    Sticky,
    LocalOverride,
    Unrecognized,
    Uninitialized,
    Bootstrap,
    OnDeviceEvalAdapterBootstrapRecognized,
    OnDeviceEvalAdapterBootstrapUnrecognized,
    InvalidBootstrap,
    NetworkNotModified,
    Error;

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EvaluationReason.valuesCustom().length];
            iArr[EvaluationReason.OnDeviceEvalAdapterBootstrapRecognized.ordinal()] = 1;
            iArr[EvaluationReason.OnDeviceEvalAdapterBootstrapUnrecognized.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EvaluationReason[] valuesCustom() {
        EvaluationReason[] evaluationReasonArrValuesCustom = values();
        return (EvaluationReason[]) Arrays.copyOf(evaluationReasonArrValuesCustom, evaluationReasonArrValuesCustom.length);
    }

    @Override // java.lang.Enum
    public String toString() {
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        return i2 != 1 ? i2 != 2 ? name() : "[OnDevice]Bootstrap:Unrecognized" : "[OnDevice]Bootstrap:Recognized";
    }
}
