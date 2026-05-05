package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u0010nʑA0ZeP.Xc2\u000fyڔ<řc$\u007fIC٥\"}0\u0015WȞog|Jb\u000bI\u000f\u000e\u0016\u000fj4կ[ޏc(ƁbH\u007fACM\u001e=g_5c\u0015$@#Py3\u0003*.V\u0013\u000fzqO\u001c\u0018>E\t<h\f{\u000b*\u0016\u0014E8\u0001L`wRDP\u0005]h3ݭ\u0007iPWof>\re\rtVm̠w*%9QO5C)\u001aϏ\b\u001bdM\u0015WsS\u0004\u0017-mȩJ<^Dk\u0018\u0014C/\u0016֜^;-j\u0019i`:+q֙d\u0014\f\u001c=\u0010z*Ȟl\n\u0014\u00065IF-Hh8\u00149t\u0001VXP0br\b\u0001aD\u001c=\u0002I*g!\u0017Wg;'UO{3\u0011N)\u0007n/cl\u000e\u000f\u0019aǟv\u001a7_VUH|\n Q6\u0015~y\u001a*24w\u0006=\u0014)0-$et\u007fّ\"4\tV^\u007fv3{/\u061ch\u001bON>\u0007\u0016eGOʈY\rr\u0013\nhT\u0007KAQ*t\u001f}6\u0013fp@F/F(N}\b\u0012j{\u007fP9\u007fwE^\u0007m$Vgdۋ9Wk߄yT|\u001eMG3\u0014fmZS:^څ,(:ʋ\u0003\u0012}\u0003RZ\\\"@G\n\u001cb0֞\u001db\u001dǽ\u001b HI\u000b\u00150iv\u0013\u0017Ta(ғm*|է\u0019Rb}}sIX:}x\"[Cپ9\u001f.Ş:j:\u000b1\u0016ґw#"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00133f\b'>[\u00166ILJo2,toaA\u0007l;$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00133f\b'>[\u00166ILJo2,|r`=\bg,[_1FL$", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00133f\b'>[%*\\C\u0011", "@de2e:>A\u0017\f\u0005e3\u0001\u00121", "", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w.J?t6z\u0015k]J\u000bm9$", "7rB0e6EZ\u0015{\u0002^", "7rE2e;BQ\u0015\u0006", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn#W\u000b*>t\u0004=IR;A)\u0005\u0011q`F\u0011g+a@%QTY6jR<>\u001e\"c\rJ:\u0011\u000fb\u000b&nRF/\u0015,WK\u001co\u0005\u0015\u0018j5mlSZ\u001aTO\nj\u0005\u001a", "5dc\u0013_0GUu~}Z=\u0001\u0013<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r\u001cr8'\u0017Ea<\u0003t0X\u0004|", "u(I", "5dc\u001fX=>`'~h\\9\u0007\u00106i\t*", "5dc g(MS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~G{-At\u001d\u001c\\?Jk\n", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n_F", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class ScrollSemanticsElement extends ModifierNodeElement<ScrollSemanticsModifierNode> {
    private final FlingBehavior flingBehavior;
    private final boolean isScrollable;
    private final boolean isVertical;
    private final boolean reverseScrolling;
    private final ScrollState state;

    public static /* synthetic */ ScrollSemanticsElement copy$default(ScrollSemanticsElement scrollSemanticsElement, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, boolean z4, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            scrollState = scrollSemanticsElement.state;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = scrollSemanticsElement.reverseScrolling;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            flingBehavior = scrollSemanticsElement.flingBehavior;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            z3 = scrollSemanticsElement.isScrollable;
        }
        if ((i2 & 16) != 0) {
            z4 = scrollSemanticsElement.isVertical;
        }
        return scrollSemanticsElement.copy(scrollState, z2, flingBehavior, z3, z4);
    }

    public final ScrollState component1() {
        return this.state;
    }

    public final boolean component2() {
        return this.reverseScrolling;
    }

    public final FlingBehavior component3() {
        return this.flingBehavior;
    }

    public final boolean component4() {
        return this.isScrollable;
    }

    public final boolean component5() {
        return this.isVertical;
    }

    public final ScrollSemanticsElement copy(ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, boolean z4) {
        return new ScrollSemanticsElement(scrollState, z2, flingBehavior, z3, z4);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
        return Intrinsics.areEqual(this.state, scrollSemanticsElement.state) && this.reverseScrolling == scrollSemanticsElement.reverseScrolling && Intrinsics.areEqual(this.flingBehavior, scrollSemanticsElement.flingBehavior) && this.isScrollable == scrollSemanticsElement.isScrollable && this.isVertical == scrollSemanticsElement.isVertical;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + Boolean.hashCode(this.reverseScrolling)) * 31;
        FlingBehavior flingBehavior = this.flingBehavior;
        return ((((iHashCode + (flingBehavior == null ? 0 : flingBehavior.hashCode())) * 31) + Boolean.hashCode(this.isScrollable)) * 31) + Boolean.hashCode(this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "ScrollSemanticsElement(state=" + this.state + ", reverseScrolling=" + this.reverseScrolling + ", flingBehavior=" + this.flingBehavior + ", isScrollable=" + this.isScrollable + ", isVertical=" + this.isVertical + ')';
    }

    public final ScrollState getState() {
        return this.state;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    public final boolean isScrollable() {
        return this.isScrollable;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public ScrollSemanticsElement(ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, boolean z4) {
        this.state = scrollState;
        this.reverseScrolling = z2;
        this.flingBehavior = flingBehavior;
        this.isScrollable = z3;
        this.isVertical = z4;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ScrollSemanticsModifierNode create() {
        return new ScrollSemanticsModifierNode(this.state, this.reverseScrolling, this.flingBehavior, this.isScrollable, this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ScrollSemanticsModifierNode scrollSemanticsModifierNode) {
        scrollSemanticsModifierNode.setState(this.state);
        scrollSemanticsModifierNode.setReverseScrolling(this.reverseScrolling);
        scrollSemanticsModifierNode.setFlingBehavior(this.flingBehavior);
        scrollSemanticsModifierNode.setScrollable(this.isScrollable);
        scrollSemanticsModifierNode.setVertical(this.isVertical);
    }
}
