package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: StylusHandwriting.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\":\u001b\u007f\u0007lpA0R͜P\u008cZS8\u0015sڔ<$i0yّCU(}*\tUNog\u0005JbŏIƧ\f,ю\u001b2YW\t]@\u000f`A0PCW}>Qf\u00058\u0015 `%f{ڱ\u0005\u001a8LX\u0004\tJc\u0012\"2PphU;OK\u074c\u0013NU.\t6\\\u0016ޮfTr]H0;\tyD^'\u000e3+OSцSo\u0013\u0005j6+n7{)md\u0011\u0011j[m\u0006owK\u0010\u0001)=*w\u007f\u001e\u0383YH\u001b#8g\r\f\u0001lٯ\u0004\u001ag\u001a6CO\u0012[\u0017̂'@\t\n\u001eT\u0004<\u0018WL<@2f6\u000ey\t;]Nd\u001a^p\u0012#ad,k\u0014\u0004@G\u001c~Wq=)Ne~3\u000f̷'\u0007vďsV\u0014e#!ǁ{g"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri:i\u001f-_P?z8'\u00172OH\u001bj<\\Y#PK`9`avF\u0016qa\u000eV+\u0016\u0014KE3q-7!\u0004;M\u0013;S|\u000b\u0015\u0012>lF", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri:i\u001f-_P?z8'\u00172OH\u001bj<\\Y#PK`9`avF\u0016zd\rN\u001d\u0011\u0014\\*$p@F#\u0019,4}:g\u0005\u0015\u0018c", "=m7.a+P`\u001d\u000e~g.j\u00109p_;y@\u0001\u0016\u0017F", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "5dc\u001ca\u000f:\\\u0018\u0011\bb;\u0001\u00121S\u00072\u0007 \u0014\u0015\u0017Gn\u000e;", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "1n\\=b5>\\(J", "1n_F", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class StylusHandwritingElementWithNegativePadding extends ModifierNodeElement<StylusHandwritingNodeWithNegativePadding> {
    private final Function0<Boolean> onHandwritingSlopExceeded;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StylusHandwritingElementWithNegativePadding copy$default(StylusHandwritingElementWithNegativePadding stylusHandwritingElementWithNegativePadding, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            function0 = stylusHandwritingElementWithNegativePadding.onHandwritingSlopExceeded;
        }
        return stylusHandwritingElementWithNegativePadding.copy(function0);
    }

    public final Function0<Boolean> component1() {
        return this.onHandwritingSlopExceeded;
    }

    public final StylusHandwritingElementWithNegativePadding copy(Function0<Boolean> function0) {
        return new StylusHandwritingElementWithNegativePadding(function0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && Intrinsics.areEqual(this.onHandwritingSlopExceeded, ((StylusHandwritingElementWithNegativePadding) obj).onHandwritingSlopExceeded);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onHandwritingSlopExceeded.hashCode();
    }

    public String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.onHandwritingSlopExceeded + ')';
    }

    public final Function0<Boolean> getOnHandwritingSlopExceeded() {
        return this.onHandwritingSlopExceeded;
    }

    public StylusHandwritingElementWithNegativePadding(Function0<Boolean> function0) {
        this.onHandwritingSlopExceeded = function0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public StylusHandwritingNodeWithNegativePadding create() {
        return new StylusHandwritingNodeWithNegativePadding(this.onHandwritingSlopExceeded);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(StylusHandwritingNodeWithNegativePadding stylusHandwritingNodeWithNegativePadding) {
        stylusHandwritingNodeWithNegativePadding.setOnHandwritingSlopExceeded(this.onHandwritingSlopExceeded);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("stylusHandwriting");
        inspectorInfo.getProperties().set("onHandwritingSlopExceeded", this.onHandwritingSlopExceeded);
    }
}
