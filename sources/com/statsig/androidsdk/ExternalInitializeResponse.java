package com.statsig.androidsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4\u0012}\n|ʑW7tev-\u000bR1O\u0001\f:2[<sY:\u0004\u001b\u000e&\u0017Qfg\u0016qН^\u000bQ\u0013N\u001a\u0007oDI\u0004{&\u0018\u001d8ZqU2{p\u000eEnvN\u0005N5x\u0603{ڱ\u0005\u001a2Ϻ`\u0005\tCc\u000e(/nq\u0011Ĩ\u000f̂\t\u001a\u001aß̭$\t"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u001d<\u0004.1`a);|\u001a*TGPk!\u001e#skB\u0015c\u0002", "", "D`[BX:", "", "3uP9h(MW#\bY^;x\r6s", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)\u0016m%*QJIA", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}}&dhI\u0003r0X\u007f\u0006G[J0c`H\u0001\u0005", "5dc\u0012i(Ec\u0015\u000e~h5[\t>a\u0004/\n", "5dc\u0016a0MW\u0015\u0006~s,i\t=p\n1\n@e\u0005\u00010", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class ExternalInitializeResponse {
    public static final Companion Companion = new Companion(null);
    private final EvaluationDetails evaluationDetails;
    private final String values;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӭ-(Մ7f\u00198pIkH¯VS8\u000f4\u007fB%s$ EшY\u001d"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u001d<\u0004.1`a);|\u001a*TGPk!\u001e#skB\u0015cj,\u0001/RHW0f[H", "", "u(E", "5dc\"a0GW(\u0003ve0\u0012\t.", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u001d<\u0004.1`a);|\u001a*TGPk!\u001e#skB\u0015c\u0002", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExternalInitializeResponse getUninitialized() {
            return new ExternalInitializeResponse(null, new EvaluationDetails(EvaluationReason.Uninitialized, 0L, 0L, 2, null));
        }
    }

    public ExternalInitializeResponse(String str, EvaluationDetails evaluationDetails) {
        Intrinsics.checkNotNullParameter(evaluationDetails, "evaluationDetails");
        this.values = str;
        this.evaluationDetails = evaluationDetails;
    }

    public final EvaluationDetails getEvaluationDetails() {
        return EvaluationDetails.copy$default(this.evaluationDetails, null, 0L, 0L, 7, null);
    }

    public final String getInitializeResponseJSON() {
        return this.values;
    }
}
