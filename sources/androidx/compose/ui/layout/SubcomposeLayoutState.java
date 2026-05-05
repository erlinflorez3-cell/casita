package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u000e\u0007nj?0Le^.Zݷ2\u000f\u0002{<$q$yCQU\"}0\tWN}gvJ`\fK\u000f\u001c\u0016\u0001jBI]xs\u0012\u00172HvG3coE9ft>\u000562*8\u0010\u0005\t\u001a0I\u0016{\u0011ŏ{\f@/xo^\u0013\u0012S\u0019ܨ\u0016\u0006L A+b|^:Vmu:]%ɨmB\\* ;\rQ\u001bJl';{Ґ\"+N=} 3n\u001b\u0007\u0001h\u0006šӭu=\u000b\u0005oM9f\fWdv0\u001a#Jg\u000fsqT[5`n,?6_e[P<5&\u001cԫ\u0011<\n0Ν+H<Pjt\u0016\u0015Kv\tRnXXތNȸ~a>Ѝu)A4Q2vSq;GYG}\u0015\rL/\u0011p1[\u0003\u001b\u000f\u001fôXwW?(̶?˓R\u0010aƝ\u0006\u0006vq\u0010:TpU\u0011G*!0'%efI<1\u0003\u0012JTg%\u0017pjci\u0001[P$~\u0016e>7\u0016ʑHd\u000by`Vh,?ZJ^Θ\u0002\b\u0019.3ɽ>Ƽ)\u0016Vи\u0001kpbk\u001auXtMq\u0006{\u0010g9\r>ESs\u0010\u0010\u05ec\u0007\u0016O<\u0011\u0012\u0007p͞W\f`j~ΰ4ʮn\u0016\u007fӻ\\P\u0012*@OB(B0I\u0019\u000b\u001a\u001fҔ նE|\u0011ݠ+z\u001e\u0017l3R\u000b dKժ\u0003˩`t\bi~b:\u0017ˉ&R"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.4?OuD-\u0003w]H\u00079", "", "u(E", ";`g _6Ma\b\tg^;x\r8F\n5h@\u0011%\u0017", "", "uH\u0018#", "Ak^AE,Na\u0019i\u0005e0z\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.;JEz!\u001e%va$\u0011j0L\u000b|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0013EV{*?x <M1BuC\u000b\u0015xo9qm3Rt;\u001d\u0010?", "-rc.g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/ w\u0015.;S8i>& ro=\u0016g6W\u0005\u0015VH],2", "Adc\u0010b4I]'\u0003\nb6\u0006f9n\u000f(\u000fO", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc X;\u001c]!\n\u0005l0\f\r9n]2\u0005O\u0001*&\u0006\u007f\u00126\u0004%<Yy.7", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "Adc\u001aX(Lc&~eh3\u0001\u0007C", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.5C7yD+\u0015V_C\u0012c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "5dc X;&S\u0015\r\u000bk,g\u00136i}<:P\u0005\u0011$Gv\u000e8\u0005%", "Adc\u001fb6M", "5dc X;+]#\u000e9n0v\u0016/l\u007f$\n@", "AsPAX", "5dc g(MS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|~8LC){1\u001c\u001fplC\u0015g;R\u00010U:](kRH", "4na0X\u0019>Q#\u0007\u0006h:|f2i\u0007'\t@\n", "4na0X\u0019>Q#\u0007\u0006h:|f2i\u0007'\t@\nU'Ki\u001b<}%1g}", ">qT0b4I]'~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.4?OuD-\u0003w]H\u0007\"\u0017[v%QTY6jRq+\u001b\u001cipJ4\f\fY\u0017", "Ak^A<+", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNiEmu@K)\u0018;\u0013oKe~\u0016\u001e\u0019?xp)R$Q\n$cP%wF\u0018J\u0007G?Oj5n\u001a_\u001cJAD3vm\"\u001aoP\u0004", "\u001eqT0b4I]'~yL3\u0007\u0018\u0012a\t'\u0003@", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SubcomposeLayoutState {
    public static final int $stable = 8;
    private LayoutNodeSubcompositionsState _state;
    private final Function2<LayoutNode, CompositionContext, Unit> setCompositionContext;
    private final Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> setMeasurePolicy;
    private final Function2<LayoutNode, SubcomposeLayoutState, Unit> setRoot;
    private final SubcomposeSlotReusePolicy slotReusePolicy;

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u0012\u007f\u0007lkA0ZeP.XV2\u000f\u0002{<$q$yCQU\"Ԃ(meȞ\u0018g\u001dI#\u0011Q\u0013\u001e\u0016'orm\u001e\u0019k\u0018'2pto7[vU9\u000fuf\t.::8(\u000eG.ߋGƵͯ~EQ\u0016 ;\t\u0015H^%M3\u001fB\fL-\u0019 rf|5x|kHG/\u0013kRNUo@~]\rteU\u001c=un=N7M\u0015ST9[)ÐAƄCuU\u0007n)5.˗rV̯X\u000b\u001c\u00181̟)\fq.^\u000bp\u000f\u000b˕/aӫOO"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.4?OuD-\u0003w]H\u0007\"\u0017[v%QTY6jRq+\u001b\u001cipJ4\f\fY\u0017", "", ">kP0X(;Z\u0019\rXh<\u0006\u0018", "", "5dc\u001d_(<S\u0015{\u0002^:Z\u0013?n\u000f", "u(8", "2hb=b:>", "", ">qT:X(Lc&~", "7mS2k", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ">qT:X(Lc&~B)2c\u0015\fq\u0012", "uH9uI", "BqPCX9LSw~\t\\,\u0006\b+n\u000f6", "9dh", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;*\u0012(\u001ds]B\u000bm5\re4C]N9jRQ=\"\u0010Z\u0017M'\u0016\u0014g\u001d\"}HA(]", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface PrecomposedSlotHandle {
        void dispose();

        default int getPlaceablesCount() {
            return 0;
        }

        /* JADX INFO: renamed from: premeasure-0kLqBqw */
        default void mo5540premeasure0kLqBqw(int i2, long j2) {
        }

        default void traverseDescendants(Object obj, Function1<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> function1) {
        }
    }

    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        this.setRoot = new Function2<LayoutNode, SubcomposeLayoutState, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
                invoke2(layoutNode, subcomposeLayoutState);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
                SubcomposeLayoutState subcomposeLayoutState2 = this.this$0;
                LayoutNodeSubcompositionsState subcompositionsState$ui_release = layoutNode.getSubcompositionsState$ui_release();
                if (subcompositionsState$ui_release == null) {
                    subcompositionsState$ui_release = new LayoutNodeSubcompositionsState(layoutNode, this.this$0.slotReusePolicy);
                    layoutNode.setSubcompositionsState$ui_release(subcompositionsState$ui_release);
                }
                subcomposeLayoutState2._state = subcompositionsState$ui_release;
                this.this$0.getState().makeSureStateIsConsistent();
                this.this$0.getState().setSlotReusePolicy(this.this$0.slotReusePolicy);
            }
        };
        this.setCompositionContext = new Function2<LayoutNode, CompositionContext, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, CompositionContext compositionContext) {
                invoke2(layoutNode, compositionContext);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode layoutNode, CompositionContext compositionContext) {
                this.this$0.getState().setCompositionContext(compositionContext);
            }
        };
        this.setMeasurePolicy = new Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2) {
                invoke2(layoutNode, function2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode layoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2) {
                layoutNode.setMeasurePolicy(this.this$0.getState().createMeasurePolicy(function2));
            }
        };
    }

    public SubcomposeLayoutState() {
        this(NoOpSubcomposeSlotReusePolicy.INSTANCE);
    }

    @Deprecated(message = "\u0017N\u0005H1w$ek[:\u0010S);`\u001cU\u001cf\tm\u001cd{Io~Sx", replaceWith = @ReplaceWith(expression = "SubcomposeLayoutState(SubcomposeSlotReusePolicy(maxSlotsToRetainForReuse))", imports = {"androidx.compose.ui.layout.SubcomposeSlotReusePolicy"}))
    @InterfaceC1492Gx
    public SubcomposeLayoutState(int i2) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState getState() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final Function2<LayoutNode, SubcomposeLayoutState, Unit> getSetRoot$ui_release() {
        return this.setRoot;
    }

    public final Function2<LayoutNode, CompositionContext, Unit> getSetCompositionContext$ui_release() {
        return this.setCompositionContext;
    }

    public final Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> getSetMeasurePolicy$ui_release() {
        return this.setMeasurePolicy;
    }

    public final PrecomposedSlotHandle precompose(Object obj, Function2<? super Composer, ? super Integer, Unit> function2) {
        return getState().precompose(obj, function2);
    }

    public final void forceRecomposeChildren$ui_release() {
        getState().forceRecomposeChildren();
    }
}
