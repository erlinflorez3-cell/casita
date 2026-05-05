package com.dynatrace.android.compose.slider;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>\u00106B\r\"4\u0012}\u0007njO0LeN1XR@ş\u001c\u000eD,k*\u0002EKUH~P\t_Pwg\u001dL\t\n\u00046\u0016,\u0007mD[e\u0001m\u0018\u001f4Rom4{oM;ptd\u0007N12<\b\t\u0019\u001aXMǘz|IQ\u001a\u0019xU~Bj\r{\u0007J\u001c\u0014G8\u0007.^wNdI\u001b]\u0001Ǚ#S\bPQ?q@\u0005]\u0013VV7\r%bL+P9E\u0015SU1\u0006)¼AƄCqEݛ935/as\u0006;/ß\u0016Ʀ/O\u0015ƞğ*f"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w:?Dm4\f\u001cl`9\u0014T(U\u0007'%OJ5^Rq\u001b\u0010\u0019a\u000bJ)\u0013Z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?a\u001e!C~\u0012Ex\u0010?]\u0007/$i\u001f0M\u0019", "", "", "=mE._<>1\u001cz\u0004`,", "=mE._<>1\u001cz\u0004`,]\r8i\u000e+{?", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w:?Dm4\f\u001cl`9\u0014T(U\u0007'(PW0jUr<q\u000ea\u0015K'\u000b\u000b/", "\nh]6g\u0005", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u00075w\u001ewLWDgC+\u0011fa\u0003\u0003l+[\u0001+F\u0016L6d]|K\u0014[h\u0015R*\r\u0012#. wF7\r\u000f0H\u0002HY|\u0013&\u000e\u0016nyFd\u0013GxrqH0eBWeO\u000b2", "7me<^,", "D`[BX", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class RangeSliderValueChangedCallback implements Function1<ClosedFloatingPointRange<Float>, Unit> {
    public static final int $stable = 8;
    private final Function1<ClosedFloatingPointRange<Float>, Unit> onValueChange;
    private final RangeSliderValueFinishedCallback onValueChangeFinished;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderValueChangedCallback(Function1<? super ClosedFloatingPointRange<Float>, Unit> onValueChange, RangeSliderValueFinishedCallback onValueChangeFinished) {
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(onValueChangeFinished, "onValueChangeFinished");
        this.onValueChange = onValueChange;
        this.onValueChangeFinished = onValueChangeFinished;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        invoke2(closedFloatingPointRange);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(ClosedFloatingPointRange<Float> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.onValueChangeFinished.setPuckPositions(value);
        this.onValueChange.invoke(value);
    }
}
