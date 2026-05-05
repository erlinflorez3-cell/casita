package com.dynatrace.android.compose.slider;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLc\u0003\tI\u0006>\u000b6B\u0005\"4\u0012\u000e\u0007nj?3Jd^\u008c\u0003_:\u0011{{b$k&\u0002CiVH|b*_^ui\u0007Vj\rS\u000f4\u0016\tl<I\u0004y\f\u0011\u001f6PrW3{sެ=bz;\u0013&z1F\u0001\u001d\u0001H+x\u0014\u0005\u0003[K:\u0012vϢp\u000bj\u001bO\u001d&\"\bN /\u001eli^6vm\f9\u0006ݍ\u0005ݦFN/ڿ\u0001\t[\u0010^TU\u0011MѰ ҋD7=ՖȕW\f"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w;J?j4+\u0006dhI\u0007A/J\u007f)GK,(cYo9\u0012\u00180", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "=mE._<>1\u001cz\u0004`,", "=mE._<>1\u001cz\u0004`,]\r8i\u000e+{?", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w;J?j4+\u0006dhI\u0007D0Wz5JLM\nXYy:\u0010\u0010`c", "\nh]6g\u0005", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u00075w\u001ewLWDgC+\u0011fa\u0003\u0003l+[\u0001+F\u0016L6d]|K\u0014[h\u0015R*\r\u0012#/+rC7,x(P\u0012;I\u0005\u0015\u001a\u001c8jo R\u0017Nv\u0011sG~,7", "7me<^,", "D`[BX", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SliderValueChangedCallback implements Function1<Float, Unit> {
    public static final int $stable = 8;
    private final Function1<Float, Unit> onValueChange;
    private final SliderValueFinishedCallback onValueChangeFinished;

    /* JADX WARN: Multi-variable type inference failed */
    public SliderValueChangedCallback(Function1<? super Float, Unit> onValueChange, SliderValueFinishedCallback onValueChangeFinished) {
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(onValueChangeFinished, "onValueChangeFinished");
        this.onValueChange = onValueChange;
        this.onValueChangeFinished = onValueChangeFinished;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
        invoke(f2.floatValue());
        return Unit.INSTANCE;
    }

    public void invoke(float f2) {
        this.onValueChangeFinished.setPuckPosition(f2);
        this.onValueChange.invoke(Float.valueOf(f2));
    }
}
