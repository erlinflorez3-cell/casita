package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: SharedContentNode.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яđ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aՄ\u000ff\u000198DkH6Ri*\u0017k\u00025,[:qK;[\u001c\u0006\"\u001fOVgmoRZ!C\u0017\u0006\u001c{r,_U\u0001]\u0018\u0013:B}H;ݹw=O`|6\u000b!:\"Fy\r\u0001 ,P\u0010\rzKK\"\u00128ϋx:h\rUĨ\"\u0012\u001c>(\u0001$]oNLHtҗB/9\u0003qBT)g0\u0013M\u0015FZ'\u0013ǸwӜ[@e4E%\u0002\u00037R\n@3? ?Es7+9L\fWd\\ÿ\u0018\u00159TUu\u0001Ft\u0005\u007f\u0002<+9q{K~1n\f¶zȞʀ\b\u0010\fKVSu t.&3#\u001a\u001aT\u0019\blj\u0018z\u0010]]9H99b3f\u007f\t\u0002-\u0017=\n/%\u001eQ\u00155!$x\u001c\f-\u001b\u0003$y1\u007fmmL\\8q=\u001c3!f\u0010Z\u001c0u1u\u0010ö-ϏÉ;]?U/\u001fJRR\u001c\u000f\u0005\u000f\u0010{i\u0001}\u000767:E`!\f\tp\r\u0005\u001a\b\u0005\\:?e\u001c\u00036.\f!PtwjRk$̓NŖȬnOcB3h/Ig)\u0004\u000e\u0006e\u00073c\t\u0014\u0014o\u000e\u000f\u0014mx)\u0005!pP\u0011$Z\u000bOJ2v~VwLV\\\u0012+2mxRt\u0003վ\u001bÅ\u0019L\u001b HI\u000b\u00120zv\u001c\u0017VI#1tTz\u0017\u000bh^\u0007n\u0016\u0004\blSʣ.έEW=ӧFW(uB\u000bs\u0019\r\u0003\u0018G\u0016\\\u001eƙnטy[\u0004\u008d.\u001c?b=Oc!\r<J\u0002[Y\u00033<ʻOɟ+~\u0015{\u0015PvD8\u001ax\bD`\u0019^\u0006\u0015mǴx݈v' f\u0006\u0012o\\KYqm#[lc)C0ߥP̞\u0001\t7 +\u001c}>MW;F?\u001dD{D3#kui\u001e28!eյ\u0001Ф\b8kܞ\bdWz@YXK_\u001eL'ؽl\bJKp͍$p\bΒ\u0011q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0014w&7LQ$u3\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5p|*aMKz\u001c(\u0014lb=\u0007p\u0015Xu'\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9lIr7\u001dc|$8q\u0016;6M:k\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001dc|$8q\u0016;4M9g;\u0006\u001fge:\u000bc97\u0001&G\"", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0017t\u00166MLJO=-\u0015uj5\u000eQ;J\u0006'\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6M\u001d.UCDz\u0018'$hnB\u0003j\u001a]r6G\"\u0012\u001d", "0nd;W:\u001a\\\u001d\u0007vm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006S/Eb|.\u0013v\u001a6IR?u=s", "5dc\u000fb<GR'Z\u0004b4x\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn\u0012c\u000e)6{q7QK7z8(\u001e>", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", ":`h2e", "Adc\u0019T@>`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~`y47z_\u0010Z?Fn8\u001c#O]M\u0007p\u0002\u0012g", ">q^C\\+>R\nz\u0002n,\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001dc|$8q\u0016;4M9g;\u0006\u0011s7", "5dc\u001de6OW\u0018~yO(\u0004\u0019/s", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001fQn\u0012=z%B#e*6q\u00172MP\"u2\u001a\u001cP]D\\", "@n^A66H`\u0018\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "5dc\u001fb6M1#\t\b]:", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "@n^A?6HY\u0015\u0002zZ+Z\u00139r~6", "5dc\u001fb6M:#\t\u0001Z/|\u0005.C\n2\t?\u000f", "AgP?X+\u001eZ\u0019\u0007zg;", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0017t\u00166MLJA", "5dc [(KS\u0018^\u0002^4|\u0012>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7lu5MK;tCs", "5dc g(MS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7lu5MK;tC\u0002\u001ewaF\u0010_3<\u0006#VL$", "Adc g(MSWz\u0004b4x\u00183o\t\"\t@\b\u0017\u0013Uo", "7r<2T:N`\u0019\u0007zg;X\u0014:r\n$yCd \u0002Ty\u0010Iv3C", "", ":n^8T/>O\u0018l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "7r<2T:N`\u0019\u0007zg;X\u0014:r\n$yCd \u0002Ty\u0010Iv3C!\b5?\u0003\u000b\u00191", "uI\u0018'", "=m0Ag(<V", "", "=m32g(<V", "=mA2f,M", "@d`B\\9>:#\t\u0001Z/|\u0005.L{<\u0006P\u0010t!Q|\r@\u007f!DY\f", "/o_?b(<V\u0001~vl<\n\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5p}.IQKx4\f\u0013rl9\\", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "/o_?b(<V\u0001~vl<\n\tv3\u000bt\n\u0013K%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0001@d\u000b*3k\u0019\u0016M?I{A\u001e\u0003fkD\u00079\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001d\t#H \u0003NG.Q\u0014I}Ix\u000e\b\u0013\u00155@U\u0006=\fPx\"\u007fE({\u0010Wi\u0002RKSbst\u0010)$XND4#;\u0001\u001bd^>\u0017{@\u0011\u0001b\u0001v=", "2qPD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", ">kP0X", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "CoS.g,\u001cc&\fzg;Y\u0013?n~6", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;
    private GraphicsLayer layer;
    private final ModifierLocalMap providedValues;
    private SharedElementInternalState state;

    public SharedBoundsNode(SharedElementInternalState sharedElementInternalState) {
        this.state = sharedElementInternalState;
        this.layer = sharedElementInternalState.getLayer();
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.to(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementInternalState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getRootCoords() {
        return getSharedElement().getScope().getRoot$animation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getRootLookaheadCoords() {
        return getSharedElement().getScope().getLookaheadRoot$animation_release();
    }

    public final SharedElementInternalState getState() {
        return this.state;
    }

    public final void setState$animation_release(SharedElementInternalState sharedElementInternalState) {
        if (Intrinsics.areEqual(sharedElementInternalState, this.state)) {
            return;
        }
        this.state = sharedElementInternalState;
        if (isAttached()) {
            provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementInternalState);
            this.state.setParentState((SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
            this.state.setLayer(this.layer);
            this.state.setLookaheadCoords(new Function0<LayoutCoordinates>() { // from class: androidx.compose.animation.SharedBoundsNode$state$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final LayoutCoordinates invoke() {
                    return this.this$0.requireLookaheadLayoutCoordinates();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates requireLookaheadLayoutCoordinates() {
        return this.state.getSharedElement().getScope().toLookaheadCoordinates(DelegatableNodeKt.requireLayoutCoordinates(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BoundsAnimation getBoundsAnimation() {
        return this.state.getBoundsAnimation();
    }

    private final void setLayer(GraphicsLayer graphicsLayer) {
        if (graphicsLayer == null) {
            GraphicsLayer graphicsLayer2 = this.layer;
            if (graphicsLayer2 != null) {
                DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer2);
            }
        } else {
            this.state.setLayer(graphicsLayer);
        }
        this.layer = graphicsLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElement getSharedElement() {
        return this.state.getSharedElement();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), this.state);
        this.state.setParentState((SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
        setLayer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
        this.state.setLookaheadCoords(new Function0<LayoutCoordinates>() { // from class: androidx.compose.animation.SharedBoundsNode.onAttach.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LayoutCoordinates invoke() {
                return SharedBoundsNode.this.requireLookaheadLayoutCoordinates();
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        setLayer(null);
        this.state.setParentState(null);
        this.state.setLookaheadCoords(new Function0() { // from class: androidx.compose.animation.SharedBoundsNode.onDetach.1
            @Override // kotlin.jvm.functions.Function0
            public final Void invoke() {
                return null;
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null) {
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer);
        }
        setLayer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode, androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo428measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(j2);
        final long jSize = SizeKt.Size(placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight());
        return MeasureScope.layout$default(measureScope, placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SharedBoundsNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Offset offsetM3926boximpl;
                LayoutCoordinates coordinates = placementScope.getCoordinates();
                if (coordinates != null) {
                    SharedBoundsNode sharedBoundsNode = this;
                    long j3 = jSize;
                    long jMo5523localPositionOfR5De75A = sharedBoundsNode.getRootLookaheadCoords().mo5523localPositionOfR5De75A(coordinates, Offset.Companion.m3953getZeroF1C5BW0());
                    if (sharedBoundsNode.getSharedElement().getCurrentBounds() == null) {
                        sharedBoundsNode.getSharedElement().setCurrentBounds(RectKt.m3977Recttz77jQw(jMo5523localPositionOfR5De75A, j3));
                    }
                    offsetM3926boximpl = Offset.m3926boximpl(jMo5523localPositionOfR5De75A);
                } else {
                    offsetM3926boximpl = null;
                }
                Placeable.PlacementScope.place$default(placementScope, placeableMo5514measureBRTryo0, 0, 0, 0.0f, 4, null);
                if (offsetM3926boximpl != null) {
                    SharedBoundsNode sharedBoundsNode2 = this;
                    sharedBoundsNode2.getSharedElement().m442onLookaheadResultv_w8tDc(sharedBoundsNode2.getState(), jSize, offsetM3926boximpl.m3947unboximpl());
                }
            }
        }, 4, null);
    }

    private final MeasureResult place(MeasureScope measureScope, final Placeable placeable) {
        long jMo445calculateSizeJyjRU_E = this.state.getPlaceHolderSize().mo445calculateSizeJyjRU_E(requireLookaheadLayoutCoordinates().mo5522getSizeYbymL2g(), IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()));
        return MeasureScope.layout$default(measureScope, IntSize.m6808getWidthimpl(jMo445calculateSizeJyjRU_E), IntSize.m6807getHeightimpl(jMo445calculateSizeJyjRU_E), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SharedBoundsNode.place.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Offset offsetM3926boximpl;
                long jM3972getTopLeftF1C5BW0;
                LayoutCoordinates coordinates;
                if (SharedBoundsNode.this.getSharedElement().getFoundMatch()) {
                    if (SharedBoundsNode.this.getSharedElement().getTargetBounds() != null) {
                        BoundsAnimation boundsAnimation = SharedBoundsNode.this.getBoundsAnimation();
                        Rect currentBounds = SharedBoundsNode.this.getSharedElement().getCurrentBounds();
                        Intrinsics.checkNotNull(currentBounds);
                        Rect targetBounds = SharedBoundsNode.this.getSharedElement().getTargetBounds();
                        Intrinsics.checkNotNull(targetBounds);
                        boundsAnimation.animate(currentBounds, targetBounds);
                    }
                    Rect value = SharedBoundsNode.this.getBoundsAnimation().getValue();
                    LayoutCoordinates coordinates2 = placementScope.getCoordinates();
                    if (coordinates2 != null) {
                        offsetM3926boximpl = Offset.m3926boximpl(SharedBoundsNode.this.getRootCoords().mo5523localPositionOfR5De75A(coordinates2, Offset.Companion.m3953getZeroF1C5BW0()));
                    } else {
                        offsetM3926boximpl = null;
                    }
                    if (value != null) {
                        if (SharedBoundsNode.this.getBoundsAnimation().getTarget()) {
                            SharedBoundsNode.this.getSharedElement().setCurrentBounds(value);
                        }
                        jM3972getTopLeftF1C5BW0 = value.m3972getTopLeftF1C5BW0();
                    } else {
                        if (SharedBoundsNode.this.getBoundsAnimation().getTarget() && (coordinates = placementScope.getCoordinates()) != null) {
                            SharedBoundsNode.this.updateCurrentBounds(coordinates);
                        }
                        Rect currentBounds2 = SharedBoundsNode.this.getSharedElement().getCurrentBounds();
                        Intrinsics.checkNotNull(currentBounds2);
                        jM3972getTopLeftF1C5BW0 = currentBounds2.m3972getTopLeftF1C5BW0();
                    }
                    long jM3941minusMKHz9U = offsetM3926boximpl != null ? Offset.m3941minusMKHz9U(jM3972getTopLeftF1C5BW0, offsetM3926boximpl.m3947unboximpl()) : Offset.Companion.m3953getZeroF1C5BW0();
                    Placeable.PlacementScope.place$default(placementScope, placeable, Math.round(Offset.m3937getXimpl(jM3941minusMKHz9U)), Math.round(Offset.m3938getYimpl(jM3941minusMKHz9U)), 0.0f, 4, null);
                    return;
                }
                LayoutCoordinates coordinates3 = placementScope.getCoordinates();
                if (coordinates3 != null) {
                    SharedBoundsNode.this.updateCurrentBounds(coordinates3);
                }
                Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* JADX INFO: renamed from: isMeasurementApproachInProgress-ozmzZPI, reason: not valid java name */
    public boolean mo441isMeasurementApproachInProgressozmzZPI(long j2) {
        return getSharedElement().getFoundMatch() && this.state.getSharedElement().getScope().isTransitionActive();
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* JADX INFO: renamed from: approachMeasure-3p2s80s, reason: not valid java name */
    public MeasureResult mo440approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
        if (getSharedElement().getFoundMatch()) {
            Rect value = getBoundsAnimation().getValue();
            if (value == null) {
                value = getSharedElement().getCurrentBounds();
            }
            if (value != null) {
                long jM6816roundToIntSizeuvyYCjk = IntSizeKt.m6816roundToIntSizeuvyYCjk(value.m3970getSizeNHjbRc());
                int iM6808getWidthimpl = IntSize.m6808getWidthimpl(jM6816roundToIntSizeuvyYCjk);
                int iM6807getHeightimpl = IntSize.m6807getHeightimpl(jM6816roundToIntSizeuvyYCjk);
                if (iM6808getWidthimpl == Integer.MAX_VALUE || iM6807getHeightimpl == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + getBoundsAnimation().getValue() + ", current bounds: " + getSharedElement().getCurrentBounds()).toString());
                }
                j2 = Constraints.Companion.m6601fixedJhjzzOo(RangesKt.coerceAtLeast(iM6808getWidthimpl, 0), RangesKt.coerceAtLeast(iM6807getHeightimpl, 0));
            }
        }
        return place(approachMeasureScope, measurable.mo5514measureBRTryo0(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCurrentBounds(LayoutCoordinates layoutCoordinates) {
        getSharedElement().setCurrentBounds(RectKt.m3977Recttz77jQw(getRootCoords().mo5523localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m3953getZeroF1C5BW0()), SizeKt.Size(IntSize.m6808getWidthimpl(layoutCoordinates.mo5522getSizeYbymL2g()), IntSize.m6807getHeightimpl(layoutCoordinates.mo5522getSizeYbymL2g()))));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(final ContentDrawScope contentDrawScope) {
        SharedElementInternalState sharedElementInternalState = this.state;
        SharedTransitionScope.OverlayClip overlayClip = sharedElementInternalState.getOverlayClip();
        SharedTransitionScope.SharedContentState userState = this.state.getUserState();
        Rect currentBounds = getSharedElement().getCurrentBounds();
        Intrinsics.checkNotNull(currentBounds);
        sharedElementInternalState.setClipPathInOverlay$animation_release(overlayClip.getClipPath(userState, currentBounds, contentDrawScope.getLayoutDirection(), DelegatableNodeKt.requireDensity(this)));
        GraphicsLayer layer = this.state.getLayer();
        if (layer == null) {
            throw new IllegalArgumentException(("Error: Layer is null when accessed for shared bounds/element : " + getSharedElement().getKey() + ",target: " + this.state.getBoundsAnimation().getTarget() + ", is attached: " + isAttached()).toString());
        }
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        DrawScope.m4732recordJVtK1S4$default(contentDrawScope2, layer, 0L, new Function1<DrawScope, Unit>() { // from class: androidx.compose.animation.SharedBoundsNode.draw.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                contentDrawScope.drawContent();
            }
        }, 1, null);
        if (this.state.getShouldRenderInPlace()) {
            GraphicsLayerKt.drawLayer(contentDrawScope2, layer);
        }
    }
}
