package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000f\u0002{<$a%yCIU\"}(\u0014WNupvϺb\u000bQƤ\u000eǝ\u0001j:O]ތe\u0012\u001d>JoE4UoS9hҚ<ӏ&HĲh\u007f\u0015\u0003**v\u0010%y\u0004\u001f\u001c\u001c>A\t@b\u000f]\u0005H\u00154@0\u0005,`\u007fNdM|\u0014H5;5yS^6\u000e3ƊQ\u0017L\\7\u0013|j.-F=[\u001f5d\u0013\u0016\u0001^ύ\u0007IwE\u0015n-0;Ky]\\c\u0010\u0016%+}\u0019sqTcԇU`\u001a4s\\q_h\u00148y\u000b{;?2\u0010LϰIv4({ \u000eay9զA\u0019;lX\u0018-qG'4.6ڢ=%lYqA\u001fWG}\u000b\u0013D-\u0011\u007f1j\u0003\u0011\u05ce\u0019%Z\u007fa7WIMJT\u0010\u007fH}\u0006\u0001b06\u001a/u\u0007uʌ\u0012vt3Ns9Qܩ\u001c\u000eNDuw\u001dfxUyRvCPpF=0\t\u001a^\\d3p\u0001\r^,\u001fS4\u0007\u0017\u000f\u0018\"N_ʟ@++\u0018^UnrzOc\u0010K9vHi}\u001a\u0011Ć=h9=ai\u0016jbx\u001aEbm\u0015ZvB\u0002\u0018p[V)x˒iX}\n\\f\fA2\u0006\u0006dE:J1\\Cb3$P\\\u0015\u000buY\u0017,Eյ4l\nwA\r\t/n#˰n0\u007fWK\u0015`PM\bڲ4a4cC\u00014+/7\u0003\u0002\"_gzG\u0013\u0001^\u007fc\u001f8\u0016HEy/k7U\u0013yA\u00101]L!j˛Q\u0018/ϕ\u0015{\u0015Iv=8\u001dxqDfzL_TE%%`ѓ'\u000elр\u0012cL\u000bUt%LiDa%\u0013jL]f\u007fġ#(+\t\u007f(\u0003>=E-#<\u0002$@%p\flܓ2\u0004h\u00176zk\r<e\u001cu\t\\m4K8we\u0015=P+к\u0007HP۳\u0010\nH\u001bB βLf"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d)JYY);u\u0012=QMDS>\u001d\u0019ie9\u0014C3N~'P[$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d)JYY);u\u0012=QMDS>\u001d\u0019ie9\u0014L6Mv|", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "4h]6f/>R\u007f\u0003\tm,\u0006\t<", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0018q\u001f2\\C\u0017t8&\u0011weC\u0010Q7Nt|.HW+i\\v<'[X\u0018V6\u0017\u0013Y\u000b4r\u000e\u0013&\f.R\n;q\u0010a|\u0014?ywF_YL\u000b\u001d?B9qDhc\u0004PO\u000fC:m\nn!fC\u0007yWb", "5dc\u000e_0@\\!~\u0004m", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>hS", "5dc\u000ea0FO(\u0003\u0005g\u001a\b\t-", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001N\u001a7QR;G=\"\u001ddp=\u0011l\u001aYv%\u001d", "5dc\u0013\\5Ba\u001c~yE0\u000b\u0018/n\u007f5", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "1qT.g,", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class SizeAnimationModifierElement extends ModifierNodeElement<SizeAnimationModifierNode> {
    private final Alignment alignment;
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final Function2<IntSize, IntSize, Unit> finishedListener;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SizeAnimationModifierElement copy$default(SizeAnimationModifierElement sizeAnimationModifierElement, FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, Function2 function2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            finiteAnimationSpec = sizeAnimationModifierElement.animationSpec;
        }
        if ((2 & i2) != 0) {
            alignment = sizeAnimationModifierElement.alignment;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function2 = sizeAnimationModifierElement.finishedListener;
        }
        return sizeAnimationModifierElement.copy(finiteAnimationSpec, alignment, function2);
    }

    public final FiniteAnimationSpec<IntSize> component1() {
        return this.animationSpec;
    }

    public final Alignment component2() {
        return this.alignment;
    }

    public final Function2<IntSize, IntSize, Unit> component3() {
        return this.finishedListener;
    }

    public final SizeAnimationModifierElement copy(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, Function2<? super IntSize, ? super IntSize, Unit> function2) {
        return new SizeAnimationModifierElement(finiteAnimationSpec, alignment, function2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return Intrinsics.areEqual(this.animationSpec, sizeAnimationModifierElement.animationSpec) && Intrinsics.areEqual(this.alignment, sizeAnimationModifierElement.alignment) && Intrinsics.areEqual(this.finishedListener, sizeAnimationModifierElement.finishedListener);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((this.animationSpec.hashCode() * 31) + this.alignment.hashCode()) * 31;
        Function2<IntSize, IntSize, Unit> function2 = this.finishedListener;
        return iHashCode + (function2 == null ? 0 : function2.hashCode());
    }

    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.animationSpec + ", alignment=" + this.alignment + ", finishedListener=" + this.finishedListener + ')';
    }

    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final Function2<IntSize, IntSize, Unit> getFinishedListener() {
        return this.finishedListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SizeAnimationModifierElement(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, Function2<? super IntSize, ? super IntSize, Unit> function2) {
        this.animationSpec = finiteAnimationSpec;
        this.alignment = alignment;
        this.finishedListener = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SizeAnimationModifierNode create() {
        return new SizeAnimationModifierNode(this.animationSpec, this.alignment, this.finishedListener);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SizeAnimationModifierNode sizeAnimationModifierNode) {
        sizeAnimationModifierNode.setAnimationSpec(this.animationSpec);
        sizeAnimationModifierNode.setListener(this.finishedListener);
        sizeAnimationModifierNode.setAlignment(this.alignment);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateContentSize");
        inspectorInfo.getProperties().set("animationSpec", this.animationSpec);
        inspectorInfo.getProperties().set("alignment", this.alignment);
        inspectorInfo.getProperties().set("finishedListener", this.finishedListener);
    }
}
