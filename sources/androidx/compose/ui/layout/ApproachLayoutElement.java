package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: LookaheadScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007f\u0007|jA0ZeP.XS2\u000f\u0002{<řc$\bCCU0}*ޛWN}gvJp\u000bK\u000f\u0014\u001f\u0001̓4Ikxe\u0012%2JoU3UoCDhtDӌ(݅*8\b\u000b\tɝ2H\u001e\u0003\u0003ŏS\f 0Hp@R\u0015M\u001b\u001a\u001aßDī\u00074ձ\u0018TFJ|]h/Q\u0002*ĶM7\u001f>}eHVV7\r%d.<PFc\u0019ȏW\r\rWkE\tE\u0002?\u000bnM.;Z\u0004fd`ÿ\u0018\u001f1T\u001dcx,l\u0007Wf20;QsK~\u0018Vyߡ\u007f\rB\u000f\u001e\u00165TF9*h\u0018\u000ea\u0003\u0003UPP0mp\r\u000b\u000e<\u00173\u0010KQI\u001dvQ\u0010M)_G\u000b3 ̷'\u000bt&kZ\u0014f%\u001dZ}wEaBMH|\u0019\bNъ\bph\rò\b0U\u0015w>\u001fH/`G]I#On\u0012YTv%\t¾l]oWXF(t&90\u000f2aTu\u0015z~\\г0\u001bS!d\r\u0004\u000e#\"b}b*5\u0012^O\u0017s\u0019Oύ\u000e%5q}ֱo4!eTv?ESs\u0010\u0010`\u0007\u0016O<\u0011\u0014\u0007s\tδ\r#\n6>Jnz\u0012\b{r`\u001c$BN /ٜ0;\u001fa%N\t$RC\u0003\u000f\u0006nx\u0012\u000fTa31z˨x\t\u0007[#ˠp0փH:\u001ax\"[ۋ\u0002v\u001f&c#\u0001o\r%\u0017~\"\u0003Wx\\Vzpטy_\u0002%& ?W??\u0019\u0015%0B\u0013=TzzϯUW\u0018,\u000b\u0003\u007f\u0015Kj4m.s\u0001.pjxY\u0003\u0019Ȕz^x.8v\u0006yoR\u0013SsV\u001b[lW\u0003\u0005i<|G+\u0012OJ+\u0001}2\u0015[=E7\u001dD\n$@%p\f|ܓ2\u0004h\u00146zk\n<e\u001cu\tem4K8wh-Oѐ(l\tM\u000fܺvPH\u0017R%3vA+\u0005\u001fI[*G}\u0015\u0016\\\u0013~vs<)n,Ut˕+<J\f6vCS4\u0014Рf6tY\u0001#J=/Qס07 *c8V\u0006\n94\u0014\u001c06o;)\u0019\u0005\u00132]D<62kT\u00180V\u000fP\u0011m\u0010/mRuKV<W\tmfW3d҇d+0\u0006\u000f\u00159$\t77\u000b\u0014Md@sA/[\u009b\r%pT\u000fl+1TV?!Na\u0011\rU]qS08\u0086K)svƴ\u0010> ӽ5D\u001e1Ghaz\u0005<v\u0017ef^d% vT^\"W\u000e)\nɽ@\u0010\u0017ԥ1Qx{pE\u001d\u0004\u0006G[@\u0011\u0019T)5\u001e\rtV*[\u0019\u05f91GOo$-\u0002]c=\u0004\u000eF47\u0006\u0005!\u000bf<wŭa\u001b@!ޭ\u001ah\nƁ+R&\u0014<cƼv5"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5p|*aMKz\u0014%\u0015paB\u00169", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5p|*aMKz\u001c(\u0014lb=\u0007p\u0015Xu'+TY32", "/o_?b(<V\u0001~vl<\n\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5p}.IQKx4\f\u0013rl9\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "7r<2T:N`\u0019\u0007zg;X\u0014:r\n$yCd \u0002Ty\u0010Iv3C", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "", "7r?9T*>[\u0019\b\n:7\b\u00169a}+_Ik$!I|\u000eJ\u0005", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", ":n^8T/>O\u0018\\\u0005h9{\r8a\u000f(\n", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003aK\u0005\u001a", "5dc\u000ec7K]\u0015|}F,x\u0017?r\u007f", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bKu", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "1qT.g,", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class ApproachLayoutElement extends ModifierNodeElement<ApproachLayoutModifierNodeImpl> {
    private final Function3<ApproachMeasureScope, Measurable, Constraints, MeasureResult> approachMeasure;
    private final Function1<IntSize, Boolean> isMeasurementApproachInProgress;
    private final Function2<Placeable.PlacementScope, LayoutCoordinates, Boolean> isPlacementApproachInProgress;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApproachLayoutElement copy$default(ApproachLayoutElement approachLayoutElement, Function3 function3, Function1 function1, Function2 function2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            function3 = approachLayoutElement.approachMeasure;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = approachLayoutElement.isMeasurementApproachInProgress;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function2 = approachLayoutElement.isPlacementApproachInProgress;
        }
        return approachLayoutElement.copy(function3, function1, function2);
    }

    public final Function3<ApproachMeasureScope, Measurable, Constraints, MeasureResult> component1() {
        return this.approachMeasure;
    }

    public final Function1<IntSize, Boolean> component2() {
        return this.isMeasurementApproachInProgress;
    }

    public final Function2<Placeable.PlacementScope, LayoutCoordinates, Boolean> component3() {
        return this.isPlacementApproachInProgress;
    }

    public final ApproachLayoutElement copy(Function3<? super ApproachMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> function3, Function1<? super IntSize, Boolean> function1, Function2<? super Placeable.PlacementScope, ? super LayoutCoordinates, Boolean> function2) {
        return new ApproachLayoutElement(function3, function1, function2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproachLayoutElement)) {
            return false;
        }
        ApproachLayoutElement approachLayoutElement = (ApproachLayoutElement) obj;
        return Intrinsics.areEqual(this.approachMeasure, approachLayoutElement.approachMeasure) && Intrinsics.areEqual(this.isMeasurementApproachInProgress, approachLayoutElement.isMeasurementApproachInProgress) && Intrinsics.areEqual(this.isPlacementApproachInProgress, approachLayoutElement.isPlacementApproachInProgress);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.approachMeasure.hashCode() * 31) + this.isMeasurementApproachInProgress.hashCode()) * 31) + this.isPlacementApproachInProgress.hashCode();
    }

    public String toString() {
        return "ApproachLayoutElement(approachMeasure=" + this.approachMeasure + ", isMeasurementApproachInProgress=" + this.isMeasurementApproachInProgress + ", isPlacementApproachInProgress=" + this.isPlacementApproachInProgress + ')';
    }

    public final Function3<ApproachMeasureScope, Measurable, Constraints, MeasureResult> getApproachMeasure() {
        return this.approachMeasure;
    }

    public final Function1<IntSize, Boolean> isMeasurementApproachInProgress() {
        return this.isMeasurementApproachInProgress;
    }

    public final Function2<Placeable.PlacementScope, LayoutCoordinates, Boolean> isPlacementApproachInProgress() {
        return this.isPlacementApproachInProgress;
    }

    public /* synthetic */ ApproachLayoutElement(Function3 function3, Function1 function1, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function3, function1, (i2 & 4) != 0 ? LookaheadScopeKt.defaultPlacementApproachInProgress : function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApproachLayoutElement(Function3<? super ApproachMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> function3, Function1<? super IntSize, Boolean> function1, Function2<? super Placeable.PlacementScope, ? super LayoutCoordinates, Boolean> function2) {
        this.approachMeasure = function3;
        this.isMeasurementApproachInProgress = function1;
        this.isPlacementApproachInProgress = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ApproachLayoutModifierNodeImpl create() {
        return new ApproachLayoutModifierNodeImpl(this.approachMeasure, this.isMeasurementApproachInProgress, this.isPlacementApproachInProgress);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ApproachLayoutModifierNodeImpl approachLayoutModifierNodeImpl) {
        approachLayoutModifierNodeImpl.setMeasureBlock(this.approachMeasure);
        approachLayoutModifierNodeImpl.setMeasurementApproachInProgress(this.isMeasurementApproachInProgress);
        approachLayoutModifierNodeImpl.setPlacementApproachInProgress(this.isPlacementApproachInProgress);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("approachLayout");
        inspectorInfo.getProperties().set("approachMeasure", this.approachMeasure);
        inspectorInfo.getProperties().set("isMeasurementApproachInProgress", this.isMeasurementApproachInProgress);
        inspectorInfo.getProperties().set("isPlacementApproachInProgress", this.isPlacementApproachInProgress);
    }
}
