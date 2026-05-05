package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b<G\u0007\"2\u0012\u007f\u0007tsA0JjP.`_2şq\u0001Jř\f$ B{~*\b0\tgTwi~J\t\rq\u0010\u0016 \u0007mDOezm\u0012=4ppO9SoK=xtd\nڶ6\"F\u007fM\u0007(6`\u0010%\b\n_\\'>C\t@b\u000f]\u0005H\u00144?ŋ\u0005$dɡf8NskB\u007f2\u0011mZNUd݁\u0001S\u0015Ͽl)\u0013\u007fo({UE5-+c\u0005\u0017R\nA1@џA\u000bpѧ?-O~e>ނ\u0004\""}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G{-At\u001d\n`GIX0'\u0017h7", "", "D`[BX", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", ";`g#T3NS", "@de2e:>A\u0017\f\u0005e3\u0001\u00121", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d\\0\u0003\u0012\u001c", "5dc\u001aT?/O \u000fz", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "5dc\u001fX=>`'~h\\9\u0007\u00106i\t*", "u(I", "5dc#T3NS", "BnBAe0GU", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScrollAxisRange {
    public static final int $stable = 0;
    private final Function0<Float> maxValue;
    private final boolean reverseScrolling;
    private final Function0<Float> value;

    public ScrollAxisRange(Function0<Float> function0, Function0<Float> function02, boolean z2) {
        this.value = function0;
        this.maxValue = function02;
        this.reverseScrolling = z2;
    }

    public /* synthetic */ ScrollAxisRange(Function0 function0, Function0 function02, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? false : z2);
    }

    public final Function0<Float> getValue() {
        return this.value;
    }

    public final Function0<Float> getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.value.invoke().floatValue() + ", maxValue=" + this.maxValue.invoke().floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }
}
