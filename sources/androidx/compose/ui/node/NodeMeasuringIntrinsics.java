package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachIntrinsicMeasureScope;
import androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.IntrinsicsMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: LayoutModifierNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq{<$q$yCQU\"}(\u0015Uɟg}ñzZ9BG\n*\u000e\u0001Can9b\u0018\u000f̓FoM3\u0016\u001bK:xtd\u0007P60;\u0012\u0005/\u001eZL\u001e{\u0013Cy\u0012B4NwRR;U5\u001e \u000fV / #ɡߑ:Hrg\u0003Z1\u0004\u0002B|)\u00104\u000bP%F\u00032=zo#C@eAE)a\n\u001fR\nG3C\u007fF\u001dhU)qɞָ[6^\n\\@9\\%]!(\r\t_c$'YS\u0014O^\u0013@w)\u0002=@\u0012\u0015\u001e'v6]\u001et\u0016&3#t\u001aóг\u0006^H\u000fC\rD$=\u007fa-i\u001ftTy;GYg\u007f\u0013\u00126#/zQ_b\u0015x\u0015I\\(U?_X=vPPԯǀq\u0004vqJU\u0012@_\u007f]}A2%(O[g'Qo\u0010M\\g%\u000b\u0011lapjHn*\u001f\u001aE3!\f\tF+ʍ\u07fbTT^=Yx*d\u001f}6\u0015P`\u0006?9%>Y\u007flwoe]81_jE`\u0007k<_ibA>ic>c\u0019Θ݀C<h\u0016!\u0012Pe$Z\u000b*R6Vm(w*H~\u0010!7WqJ:\\5'c-H1&rE\u000b\u0017wZ\u0017\u0012EԞտ(\u0003o7=4\u000fbtp\u001ei)M:\u007fx\"[L\u00029'+m\"\u0017@-'\u0015\u0006\f\u007fuo|KZz.u\u0004}fچ׀=Q5Pш\u0013\u0019"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001dYy.Gz\u001a7O'DzA\"\u001eve7\u00159", "", "u(E", ";`g\u0015X0@V(", "", ";dP@h9>0 \txd", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001dYy.Gz\u001a7O'DzA\"\u001eve7\u0015\"\bY\u00024QHL/DRnK$\u001fZjU5\u000b\u000b/", "7mc?\\5LW\u0017fzZ:\r\u0016/S}2\u0007@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5py7\\P?tB\"\u0013Pa5\u0015s9Nd%QWN\u0002", "7mc?\\5LW\u0017fzZ:\r\u0016+b\u0007(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", ExifInterface.LONGITUDE_EAST, ";`g\u0015X0@V(=\u000bb&\n\t6e{6{", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001dYy.Gz\u001a7O'DzA\"\u001eve7\u0015\"\u0014Nr5WYN\tc\\pCi", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";`g$\\+MV", "6", ";`g$\\+MVW\u000f~X9|\u0010/a\u000e(", ";h]\u0015X0@V(", ";h]\u0015X0@V(=\u000bb&\n\t6e{6{", ";h]$\\+MV", ";h]$\\+MVW\u000f~X9|\u0010/a\u000e(", "\u000fo_?b(<V\u0001~vl<\n\t\fl\n&\u0002", "\u0012dU.h3M7\"\u000e\bb5\u000b\r-M\u007f$\nP\u000e\u0013\u0014No", "\u0013l_Al\u0017EO\u0017~v[3|", "\u0017mc?\\5LW\u0017f~g\u0014x\u001c", "\u0017mc?\\5LW\u0017p~];\u007fk/i\u0002+\u000b", "\u001bdP@h9>0 \txd", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NodeMeasuringIntrinsics {
    public static final int $stable = 0;
    public static final NodeMeasuringIntrinsics INSTANCE = new NodeMeasuringIntrinsics();

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XT0ǀӇzJř\f$ B\u0004y(}:\t}O\u0010g\u001dL\u000b\u000fQ\u0012\u001e\u0016'n\\Mc}u\u0012=8\t\u0014ѹ2ݹڱA;f{D\r܌1!\u0603y\u0010\t\u001d0М,%yKM\u00121^?ª>[ӉQ\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001dYy.Gz\u001a7O'DzA\"\u001eve7\u0015\"\bY\u00024QHL/DRnK$\u001fZjU5\u000b\u000b/", "", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5p}.IQKx4\f\u0013rl9\\", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0001@d\u000b*3k\u0019\u0016M?I{A\u001e\u0003fkD\u00079\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001d\t#H \u0003NG.Q\u0014I}Ix\u000e\b\u0013\u00155@U\u0006=\fPx\"\u007fE({\u0010Wi\u0002RKSbst\u0010)$XND4#;\u0001\u001bd^>\u0017{@\u0011\u0001b\u0001v=", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface ApproachMeasureBlock {
        /* JADX INFO: renamed from: measure-3p2s80s */
        MeasureResult mo5490measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2);
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0006Gٍ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wEшY\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001dYy.Gz\u001a7O'DzA\"\u001eve7\u0015\"\u0010W\u00064KU\\0Z:vF{\u000emc", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001bh]", "\u001b`g", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private enum IntrinsicMinMax {
        Min,
        Max
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0006Gٍ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wEшY\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001dYy.Gz\u001a7O'DzA\"\u001eve7\u0015\"\u0010W\u00064KU\\0ZDv<#\u0015=\u000eR-\u0010\u0014/", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "%hSA[", "\u0016dX4[;", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private enum IntrinsicWidthHeight {
        Width,
        Height
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XT0ǀӇzJř\f$ B\u0004y(}:\t}O\u0010g\u001dL\u000b\u000fQ\u0012\u001e\u0016'n\\Mc}u\u0012=8\t\u0014ѹ2ݹڱA;f{D\r܌1!\u0603y\u0010\t\u001d0М,%yKM\u00121^?ª>[ӉQ\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001dYy.Gz\u001a7O'DzA\"\u001eve7\u0015\"\u0014Nr5WYN\tc\\pCi", "", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface MeasureBlock {
        /* JADX INFO: renamed from: measure-3p2s80s */
        MeasureResult mo5659measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2);
    }

    private NodeMeasuringIntrinsics() {
    }

    public final int minWidth$ui_release(ApproachMeasureBlock approachMeasureBlock, ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return approachMeasureBlock.mo5490measure3p2s80s(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope, approachIntrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null)).getWidth();
    }

    public final int minHeight$ui_release(ApproachMeasureBlock approachMeasureBlock, ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return approachMeasureBlock.mo5490measure3p2s80s(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope, approachIntrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth$ui_release(ApproachMeasureBlock approachMeasureBlock, ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return approachMeasureBlock.mo5490measure3p2s80s(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope, approachIntrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null)).getWidth();
    }

    public final int maxHeight$ui_release(ApproachMeasureBlock approachMeasureBlock, ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return approachMeasureBlock.mo5490measure3p2s80s(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope, approachIntrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null)).getHeight();
    }

    public final int minWidth$ui_release(MeasureBlock measureBlock, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return measureBlock.mo5659measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null)).getWidth();
    }

    public final int minHeight$ui_release(MeasureBlock measureBlock, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return measureBlock.mo5659measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth$ui_release(MeasureBlock measureBlock, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return measureBlock.mo5659measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null)).getWidth();
    }

    public final int maxHeight$ui_release(MeasureBlock measureBlock, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return measureBlock.mo5659measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null)).getHeight();
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JiP.`ݷ2\u000fq~<$i*yCAW\"}8\tWȞog\u0005Jb\u000bI\u0012\f\u0016\u000f̓\\I\u0004w\u001e-\u001f6PoW3{pM=nvN\u0005N52<\b\t\u0019\u001aXMǘzzQQT >Q\t:\u0001\u001f}\t(%\u001e>N\u0013dp0\\D\\\u0005]hAS\u0007wWf'\u000eBCaU^b=%v\u00105[DEM-%\u0002\u001cMfĲ>šӭu?\u000b\u00035BsW\u0002sNX.&E/] urTnKe)\u001a5Hgcyb>,\u0006\u0010\u0014\rj\u0016T\u001awW<-2f6\u000f\u07baxx[óh\u0004dI\u000e\u00032E%'\u00183Y<ӸjWiݢ1P=\u0005\u0013\u0017n7\u000fy9]j\r\u000f!Q)NΚ3ҨDA`P\u0010fK{T\u007fp\u0006B\u0004^LĬ3\u0002\u0019ф/'=jG3ܬk\u0007PGmК!\u000fg\u05eemp"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001dYy.Gz\u001a7O'DzA\"\u001eve7\u0015\"\u000bNw#WS]\u0010ea\u007fA\u001d ^\f6+\t\u0013iN kK7t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", ";h]\u001aT?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001dYy.Gz\u001a7O'DzA\"\u001eve7\u0015\"\u0010W\u00064KU\\0Z:vF{\u000emc", "EhSA[\u000f>W\u001b\u0002\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001dYy.Gz\u001a7O'DzA\"\u001eve7\u0015\"\u0010W\u00064KU\\0ZDv<#\u0015=\u000eR-\u0010\u0014/", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\t>h\u000b$@{\u001a,5C7yD+\u0011eh9\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011NbK#n\u000e )\u0007,1\u00027v\u0011\u0019\u001a\u00177NyQc\u0014P\b\u0019sOgLOhl}POI`\u0012h\u0015G\u0019o\u0010! \u001dp&%lOASy]\u0019}\\\bg1W\u001dDA.=m%/OnU$t#-[\t{\u001b4<}:\u00021\rB.4rC/p'Kb\u0002#0Z3+%E?u?Oex{\u0014QY", "5dc\u001aX(Lc&zwe,", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u0019b\r-;v$2K+;gB.\"d^@\u00079", "5dc\u001a\\5&O,", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006_/4Ye 3{&;QL=O=-\"ljG\u000ba:\rZ0VYR5jVp%\u0018\u001bB\na\u0001", ">`a2a;\u001dO(z", "", "5dc\u001dT9>\\(]vm(", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc$\\+MV{~~`/\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006_/4Ye 3{&;QL=O=-\"ljG\u000ba:\rZ0VYR5jVp/\u0018\u0011i\u00111+\u0011\u0007\\Py", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bukik@\u0007S", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Nk\"F\u00074~D\u0005\u001c5m\u0012+TC\u0011", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class DefaultIntrinsicMeasurable implements Measurable {
        private final IntrinsicMeasurable measurable;
        private final IntrinsicMinMax minMax;
        private final IntrinsicWidthHeight widthHeight;

        public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
            this.measurable = intrinsicMeasurable;
            this.minMax = intrinsicMinMax;
            this.widthHeight = intrinsicWidthHeight;
        }

        public final IntrinsicMeasurable getMeasurable() {
            return this.measurable;
        }

        public final IntrinsicMinMax getMinMax() {
            return this.minMax;
        }

        public final IntrinsicWidthHeight getWidthHeight() {
            return this.widthHeight;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.measurable.getParentData();
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public Placeable mo5514measureBRTryo0(long j2) {
            int iMinIntrinsicHeight;
            int iMinIntrinsicWidth;
            IntrinsicWidthHeight intrinsicWidthHeight = this.widthHeight;
            IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.Width;
            int iM6591getMaxWidthimpl = LayoutKt.LargeDimension;
            if (intrinsicWidthHeight == intrinsicWidthHeight2) {
                if (this.minMax == IntrinsicMinMax.Max) {
                    iMinIntrinsicWidth = this.measurable.maxIntrinsicWidth(Constraints.m6590getMaxHeightimpl(j2));
                } else {
                    iMinIntrinsicWidth = this.measurable.minIntrinsicWidth(Constraints.m6590getMaxHeightimpl(j2));
                }
                if (Constraints.m6586getHasBoundedHeightimpl(j2)) {
                    iM6591getMaxWidthimpl = Constraints.m6590getMaxHeightimpl(j2);
                }
                return new EmptyPlaceable(iMinIntrinsicWidth, iM6591getMaxWidthimpl);
            }
            if (this.minMax == IntrinsicMinMax.Max) {
                iMinIntrinsicHeight = this.measurable.maxIntrinsicHeight(Constraints.m6591getMaxWidthimpl(j2));
            } else {
                iMinIntrinsicHeight = this.measurable.minIntrinsicHeight(Constraints.m6591getMaxWidthimpl(j2));
            }
            if (Constraints.m6587getHasBoundedWidthimpl(j2)) {
                iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2);
            }
            return new EmptyPlaceable(iM6591getMaxWidthimpl, iMinIntrinsicHeight);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i2) {
            return this.measurable.minIntrinsicWidth(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i2) {
            return this.measurable.maxIntrinsicWidth(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i2) {
            return this.measurable.minIntrinsicHeight(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i2) {
            return this.measurable.maxIntrinsicHeight(i2);
        }
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4D\u0007\"B\u0012\u007fјnjG0L͜P.hS2şs{B)cҕyCQU\"}8\tWN}gvJ`\fI\u000f\u001cǝ)jZH\u0016\fm\u0016\u001d2Zom4]sK;xtd\u0006ڶ6\"F|M\u0010(.`\u0010%{sO\u001a\u0017H@\u001f@\u0019ҟMMU \rV /&\rk\\?`l\fD_'\u0011tZNUk`\u0014[\u001a^g7\u000f\u0007aL:P9E\u0015S[\u0019\u0006\u0001iύ\u0007?wMKzӠ&ǢʁwY<i\u000e&Ɔ+T\u0015`x͈x3Pԉ\u0010:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001dYy.Gz\u001a7O'DzA\"\u001eve7\u0015\"\fV\u00026[7U(ZRn:\u001b\u00120", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "EhSA[", "", "6dX4[;", "uH8uI", "5dc", "/kX4a4>\\(e~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", ">kP0X\bM", "", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "HH]1X?", "", ":`h2e\tE]\u0017\u0005", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">kP0X\bM\u001b\u001aQ\u000eO\u000e\u0006\u0013", "uI5\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1\u0007", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class EmptyPlaceable extends Placeable {
        @Override // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            return Integer.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* JADX INFO: renamed from: placeAt-f8xVGno */
        public void mo5515placeAtf8xVGno(long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
        }

        public EmptyPlaceable(int i2, int i3) {
            m5576setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i2, i3));
        }
    }
}
