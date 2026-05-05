package com.ts.coresdk.errors;

import com.ts.coresdk.errors.TransmitSecurityError;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP.XU2\u000f\u0002{<$a&yCI٥ Չ\"\u001fѧ~g\u0016\u007f\u000ba\u0011CǇ\n\u0018~y:Y\u001e\u0006k\u0012'2pn\u00068ޜs??`\u00037M5@'Py3\u0005J.V\u0013\u000fzqMR\u0017ضDr@W\u001bSM/ \u000eV /%\rk\\9`l\f<u(ɨmDT/m9EZ\u001bPl';}(#ҋD9;\u001f3^K\u001c`hW\u0003m}m\tv*?+wu\u001e;ݼ\u0004\u0016\u001b8]\u001b"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u00065O\u001bI\u00012\u0016U{/Az*\u0004", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+SFkB\u0010c*]z1P,[9f_H", "1qT.g,\u001c]\"\bz\\;\u0001\u00138E\r5\u0006M", "u(;0b4\bb'Hxh9|\u0017.kI(\tM\u000b$%\u0011^\u001b8\u007f3=]\r\u000e7k&;QROKA+\u001fu \u0017\u0011l5Nt6KVW\fi_|Ji", "", ">/", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+SGeG\u0003`3Nu|", "1qT.g,\u001dW'zwe,{h<r\n5", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0016;ZMHy}\r\"djG\u000fg;<v%WYR;p2\u007fJ\u001e\u001f\u0019lR9\t\u0002`A#D", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+SLjH\u0007p5J}\u0007TYX92", "1qT.g,\"\\\u001d\u000e~Z3\u0001\u001e/E\r5\u0006M", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0016;ZMHy}\r\"djG\u000fg;<v%WYR;p2\u007fJ\u001e\u001f\u0019qW:\r\u0012b=+NQD)\u0015\u0002", "1qT.g,\"\\(~\bg(\u0004h<r\n5", "u(;0b4\bb'Hxh9|\u0017.kI(\tM\u000b$%\u0011^\u001b8\u007f3=]\r\u000e7k&;QROKA+\u001fu \u001d\u0010r,[\u007f#N,[9f_H", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxe\r5\u0006M\u000f`\u0006Tk\u0017J~)DG}\u001eGz\u001a=a#Hx>+SQkHts7Y\u00014VLM\bZavG\u001dqg\u001bX8b", "1qT.g,'](l\u000bi7\u0007\u0016>e~\u0004yO\u0005! '|\u001bF\u0004", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0016;ZMHy}\r\"djG\u000fg;<v%WYR;p2\u007fJ\u001e\u001f\u0019vX:z\u0015dL.{S7\u001ec*X\u0006Eq`\u0019#\u0018B@", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSErrorFactory {
    public static final TSErrorFactory INSTANCE = new TSErrorFactory();

    private TSErrorFactory() {
    }

    public final TransmitSecurityError.ConnectionError createConnectionError() {
        return new TransmitSecurityError.ConnectionError("CONNECTION ERROR");
    }

    public final TransmitSecurityError.Disabled createDisabledError(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%s IS DISABLED", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return new TransmitSecurityError.Disabled(str2);
    }

    public final TransmitSecurityError.InternalError createInitializeError(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%s IS NOT INITIALIZED", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return new TransmitSecurityError.InternalError(str2);
    }

    public final TransmitSecurityError.InternalError createInternalError() {
        return new TransmitSecurityError.InternalError("INTERNAL ERROR");
    }

    public final TransmitSecurityError.NotSupportedActionError createNotSupportedActionError(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%s IS NOT SUPPORTED", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return new TransmitSecurityError.NotSupportedActionError(str2);
    }
}
