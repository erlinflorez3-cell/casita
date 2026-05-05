package androidx.compose.runtime;

import com.dynatrace.android.agent.Global;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLш|\u0004O\u000f8\u000b4D\u0007\":\u0012\u007f\u0007lmA0ZeP.hS2\u000fq~<$i*yCAW\"}8\tWNmgvJh)K\u000f\u001c\u0016\u0001jBI]xc\u0013\u00172P\u0010G3[ڎE9fy>\u000562*\u0600\u007fy\u0017ɝZH>uCIY\u0011*0nv\u0001vUS\u0013!*\u0006l&GB%m\\>`l\f@uGKoPW?_^\u0003\u00141\u000fr5\u0017\u000faL1pFC =^\u0013\tb[m\tm}ݘ\th-4qmָ[6f\u000e\\F9^%]96|\u0007WӠ\u001a7[Uq\\h\u0010>v)Ԉ=@\u0012 \u001e'vA]$t\u001c&9\u0005tc@\u0017\u0012\rNF\u001fˋ:\u00173\u0015{9G1~Q\u0010AIRE\u0013\u001d\rL;G\u0014i}b'x\u0015IZ(i?kXQX^\u001agMo\u0014p\u0011\u001f:\b@I\u0016.*.\\3SR\"^k'y `D\u0016|K\u00051gwq`@PoFA8)$`Tf\u0015k~v\u0007MWqdh\u0015! \u0013Nb(F/9(T_jyj{c81u\u000b\u007f_|\u0010&Wg_yY\u001aw\u001e\u0007jvBEll\u0013x~Hc\u000ej\\VD`i14@\nRt$\u0013`E\" BSI\u0019\u000b7\u000f'fPO%!_\tn@\u0003bZ<\u0003\u0018F;-IVj\u001a\bg'Or\"12;Ai5G',ɏjط\u0001'\u001f\u0001y\u0002Uj\u001dWZp.u\u0004|vڭ\u001c\u07fcU3U\u0015\u0015\u000375ċ,Dvɢdʸ˪\u0012+\u0003~\u007f.igהk3Ͽt+"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF\u007f4Bc\u0005'7ls8UNEy8-\u0019rj\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0004", "6`b\u001dX5=W\"\u0001Xa(\u0006\u000b/s", "", "5dc\u0015T:)S\"}~g.Z\f+n\u0002(\n", "u(I", "7r2<`7Ha\u001d\b|", "/aP;W6G1\u001cz\u0004`,\u000b", "", "/o_9l\nAO\"\u0001zl", "/o_9l\u0013:b\u0019\\}Z5~\t=", "1gP;Z,L/$\n\u0002b,{", "1n\\=b:>1#\b\n^5\f", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "2d[2Z(MS|\b\fZ3\u0001\b+t\u00042\u0005N", Global.BLANK, "Bn", "5q^Bc\u0010GR\u0019\u0012", "", "0k^0^", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001.Df\b'>m\u0015\fWKFuB\"$lkB\\G\u0013T\u00016NPWuacz\u0007\u0015\"c\f]/\u0017\u000eg\u000b\u0005~M5.\f6RL\u0011,g\u0011\u0012\u001f14w>_\u0012\u0011c\u0012zA'w\u001c", "2hb=b:>C\"\u000f\t^+d\u0013@a|/{\u001e\u000b &Gx\u001d", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015>", "7mb2e;&]*zwe,Z\u00138t\u007f1\u000b", "@dU2e,GQ\u0019\r", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015Ua:\u0007p,Wt'\u001d", "7me._0=O(~Ve3", "=ab2e=>at\b\u000fH-", "D`[BX:", "", "", ">qT=T9>1#\u0007\u0006h:|", "@dR<`7Ha\u0019", "@dR<e+&]\u0018\u0003{b*x\u00183o\t6eA", "@dR<e++S\u0015}d_", "D`[BX", "@dR<e+0`\u001d\u000ezH-", "Dda6Y@\u001c]\"\r~l;|\u0012>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0012UNBA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface ControlledComposition extends Composition {
    void abandonChanges();

    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(Function2<? super Composer, ? super Integer, Unit> function2);

    <R> R delegateInvalidations(ControlledComposition controlledComposition, int i2, Function0<? extends R> function0);

    void disposeUnusedMovableContent(MovableContentState movableContentState);

    boolean getHasPendingChanges();

    void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> list);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(Set<? extends Object> set);

    void prepareCompose(Function0<Unit> function0);

    boolean recompose();

    void recordModificationsOf(Set<? extends Object> set);

    void recordReadOf(Object obj);

    void recordWriteOf(Object obj);

    void verifyConsistent();
}
