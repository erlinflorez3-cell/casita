package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
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
/* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\":\u0017\u007fјnjO0LeN4ZS8\u0018sڔ<$iҕyّCU(\u0004*ޛWNusvϺb\u000bQ\u000f\u000e\u0016~j4Ikxe܈\u0015˱H\u0006ЀcS\u007f?I`#63\u001frUH\u0006\u0013\u000222X\u0012\u0007zqN\"\u0011^B\u0001F`\u0011e\r*\u0014\u0016>N\u00064[\u0016PFTzcR73\u0005yB|*u/+OϘJT5\u0014?p,3X?E\u00175S1\nhZm\u0005\u0006ѿ>Mw50CQ\u0004YFX.\u0019+*}\u000f$Ĺ'%\u0014_j$/;QsK~\u0011>v)}Sʠ\u0005VC5SF-HǑ8\u001c9t\u0001TXX\u0012`R\u007f)dL\u0016S\u0002c9?\u001btUyC)PG{3\u00124\"/pQiZ\u000en\u001b3\\\bSAQn@^M8[\u0004Ѯ\u00039h\u00106\u001c0u\u007fu\u0010Y?%2O[g1Qq\u0010W\\i\r\u0004\u000fx\u001a\u05f6S\u0011G0\u007f.7X\u001bR˅C-\fyclXZ%\u0014ʓSO\f\u0016(8\\&RQ)\u001eegh\u0018j\u0014qR/=~OY\u001d\u00026WgwyI\"w\u001ebj~$ALb3[|A\u0002\u000e1٥*ϒ6HrݘH\u0010RT$\u001bBA\u0002\u001cb/G\u0018\u000b\u0017\u001fҔ նE|\u0011ݠ+|\u001e\u0003l;4\u0005y$#\u000e\u0017O\u000brF\u03a2zͅ0|hõγEk"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;*\u007f+OH],@arEs\u0019Z\u0016N4\u001cZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;*\u007f+OH]0f[`H\u0014\u0010hvX*\rZ", "4`S2<5,^\u0019|", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "", ">kP0X4>\\(l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "4`S2B<MA$~x", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0018q\u001f2\\C\u0017t8&\u0011weC\u0010Q7Nt|.HW+i\\v<'[X\u0018V6\u0017\u0013Y\u000b wH?\u001b\u00170S\u000b\u0005f\u000b\u0019\u0016W\u0016nyFe\u0010#\u0003\u0019}=8lPbM\u0005G?\u001bI&m\u000bl'`9Mm\u0012{!&r^.Sw\\\u0015zN\tkqPbxB1>7<JNsd<P0#Sw\u0007\u0016<ab6t+Yw\u001b", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "1qT.g,", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyLayoutAnimateItemElement extends ModifierNodeElement<LazyLayoutAnimationSpecsNode> {
    public static final int $stable = 0;
    private final FiniteAnimationSpec<Float> fadeInSpec;
    private final FiniteAnimationSpec<Float> fadeOutSpec;
    private final FiniteAnimationSpec<IntOffset> placementSpec;

    private final FiniteAnimationSpec<Float> component1() {
        return this.fadeInSpec;
    }

    private final FiniteAnimationSpec<IntOffset> component2() {
        return this.placementSpec;
    }

    private final FiniteAnimationSpec<Float> component3() {
        return this.fadeOutSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LazyLayoutAnimateItemElement copy$default(LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            finiteAnimationSpec = lazyLayoutAnimateItemElement.fadeInSpec;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            finiteAnimationSpec2 = lazyLayoutAnimateItemElement.placementSpec;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            finiteAnimationSpec3 = lazyLayoutAnimateItemElement.fadeOutSpec;
        }
        return lazyLayoutAnimateItemElement.copy(finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
    }

    public final LazyLayoutAnimateItemElement copy(FiniteAnimationSpec<Float> finiteAnimationSpec, FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, FiniteAnimationSpec<Float> finiteAnimationSpec3) {
        return new LazyLayoutAnimateItemElement(finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return Intrinsics.areEqual(this.fadeInSpec, lazyLayoutAnimateItemElement.fadeInSpec) && Intrinsics.areEqual(this.placementSpec, lazyLayoutAnimateItemElement.placementSpec) && Intrinsics.areEqual(this.fadeOutSpec, lazyLayoutAnimateItemElement.fadeOutSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.fadeInSpec;
        int iHashCode = (finiteAnimationSpec == null ? 0 : finiteAnimationSpec.hashCode()) * 31;
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec2 = this.placementSpec;
        int iHashCode2 = (iHashCode + (finiteAnimationSpec2 == null ? 0 : finiteAnimationSpec2.hashCode())) * 31;
        FiniteAnimationSpec<Float> finiteAnimationSpec3 = this.fadeOutSpec;
        return iHashCode2 + (finiteAnimationSpec3 != null ? finiteAnimationSpec3.hashCode() : 0);
    }

    public String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.fadeInSpec + ", placementSpec=" + this.placementSpec + ", fadeOutSpec=" + this.fadeOutSpec + ')';
    }

    public LazyLayoutAnimateItemElement(FiniteAnimationSpec<Float> finiteAnimationSpec, FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, FiniteAnimationSpec<Float> finiteAnimationSpec3) {
        this.fadeInSpec = finiteAnimationSpec;
        this.placementSpec = finiteAnimationSpec2;
        this.fadeOutSpec = finiteAnimationSpec3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LazyLayoutAnimationSpecsNode create() {
        return new LazyLayoutAnimationSpecsNode(this.fadeInSpec, this.placementSpec, this.fadeOutSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNode) {
        lazyLayoutAnimationSpecsNode.setFadeInSpec(this.fadeInSpec);
        lazyLayoutAnimationSpecsNode.setPlacementSpec(this.placementSpec);
        lazyLayoutAnimationSpecsNode.setFadeOutSpec(this.fadeOutSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateItem");
        inspectorInfo.getProperties().set("fadeInSpec", this.fadeInSpec);
        inspectorInfo.getProperties().set("placementSpec", this.placementSpec);
        inspectorInfo.getProperties().set("fadeOutSpec", this.fadeOutSpec);
    }
}
