package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: LookaheadScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яl\u001d̉=!4i\bDZc|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007tsA0ZeP\u008cZS8\u000fsڔ<$q$yCQU\"}8\tWN}gvJ`\u000bK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u00153JoU3UoS9htL\u0005(݅*8\u0010\u0005\tɝ2H&v\u0003ŏS\f(0Hp@W%{\u0013!*\u0006l(1=jpfQXnm:].\u0013kRNUg^\u0007֔\u0011FZ3˼za$8Ë;5\u001b+\u001a\b\u07baV[M\u0011Wѝ<\u0013w?'YY\u001cWdh03#<g(m\u00046k3cԃ\u001011QsQV\u00118y\u0001\u00023O\u0014\u0010\u0016'v3[$\u00174\u00143\u0003\u0007kf`\u0004nB.zqG'4.4ڢ=%lSqA\u001fQG}\u000b\u0013D'\u0011p1[\u0003\u0013\u000f\u0014ôXwW7\u0002\u007fK]fEi?}\u0004\u001fy\u0012;\u0014?u\u0018\u009e\u007f\u001b4\u00195=a<3#q\bn]w\b\u0015o\u0017mׂVRF$~\u001c=-\u0019\u000e`J\u000b {RdXZ-{2Τ\u000b}\u000e\u00198\u0011\u0006Y9%>lwh\u0018u}a\u0018DGfeZ\u001fo\u001cwQ^a6\u0002g\u001e\u0003jvB]lf\u0013z~B\u0002\u0011!٢Ξ!õʮn\u0012}\u001fRr,E@ŭ\nBD.A\u0019\u000b\u0015X\u0014.Qo}Ȥcdn\u0012\u000fZ9'\u0013k*z/\u0005`^\u0001o\u0016}w+ʬd\"3G(ڄ\u001błY\"pؔí#\f\u0007v\u0006Ě\u0004zFƫp;"}, d2 = {"2dU.h3M> zx^4|\u0012>A\u000b3\tJ|\u0015\u001a+xxI\u0001'BY\f.", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", ":n^8T/>O\u0018\\\u0005h9{\r8a\u000f(\n", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001an^8T/>O\u0018lxh7|", "", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]/?_y#7i\u0015\u001cKMFk\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\np\u001btQw\u0019F\u0005!2`}u", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pHJ", "/o_?b(<V\u007fz\u000fh<\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7r<2T:N`\u0019\u0007zg;X\u0014:r\n$yCd \u0002Ty\u0010Iv3C", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", ":n^8T/>O\u0018l~s,", "7r?9T*>[\u0019\b\n:7\b\u00169a}+_Ik$!I|\u000eJ\u0005", "/o_?b(<V\u0001~vl<\n\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5p}.IQKx4\f\u0013rl9\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", ":nR._\u0013H]\u001fz}^({s9s\u00047\u007fJ\n\u0001\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "1n^?W0GO(~\t", "And?V,\u001c]#\fyb5x\u0018/s", "@d[.g0OS\b\thh<\n\u0007/", "7mR9h+>;#\u000e~h5]\u0016+m\u007f\u0012|-\u0001\u0018\u0017To\u0017:v", ":nR._\u0013H]\u001fz}^({s9s\u00047\u007fJ\n\u0001\u0018\u000fP\u0010KE\u000b\u0004E", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f?c\u0004\u001c:m\u0012-;AEv4s{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u0015J?\u0017\u0015h\u000b\u000bjXA/\u0017\nS\fHg\u0005\u0015\u0012\u001d5xF)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUf\u0019pDJ3]X\u0015/r`=g\u0006]\u001eqV\u0003cvG'P\u001d\u0019\u0002R", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LookaheadScopeKt {
    private static final Function2<Placeable.PlacementScope, LayoutCoordinates, Boolean> defaultPlacementApproachInProgress = new Function2<Placeable.PlacementScope, LayoutCoordinates, Boolean>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$defaultPlacementApproachInProgress$1
        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
            return false;
        }
    };

    public static final void LookaheadScope(final Function3<? super LookaheadScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1078066484);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LookaheadScope)51@2069L33,52@2107L484:LookaheadScope.kt#80mrfh");
        if ((i2 + 6) - (6 | i2) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 + 3) - (3 | i3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1078066484, i3, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:50)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2062858814, "CC(remember):LookaheadScope.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LookaheadScopeImpl(null, 1, 0 == true ? 1 : 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LookaheadScopeImpl lookaheadScopeImpl = (LookaheadScopeImpl) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            AnonymousClass1 anonymousClass1 = new Function0<LayoutNode>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt.LookaheadScope.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final LayoutNode invoke() {
                    return new LayoutNode(true, 0, 2, null);
                }
            };
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(anonymousClass1);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3675initimpl(composerM3671constructorimpl, new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                    invoke2(layoutNode);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutNode layoutNode) {
                    layoutNode.setVirtualLookaheadRoot$ui_release(true);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, lookaheadScopeImpl, new Function2<LayoutNode, LookaheadScopeImpl, Unit>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl2) {
                    invoke2(layoutNode, lookaheadScopeImpl2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(final LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl2) {
                    lookaheadScopeImpl2.setScopeCoordinates(new Function0<LayoutCoordinates>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final LayoutCoordinates invoke() {
                            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                            Intrinsics.checkNotNull(parent$ui_release);
                            return parent$ui_release.getInnerCoordinator$ui_release().getCoordinates();
                        }
                    });
                }
            });
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1405016920, "C64@2566L9:LookaheadScope.kt#80mrfh");
            int i4 = i3 << 3;
            function3.invoke(lookaheadScopeImpl, composerStartRestartGroup, Integer.valueOf((i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i4 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LookaheadScopeKt.LookaheadScope.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    LookaheadScopeKt.LookaheadScope(function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    public static /* synthetic */ Modifier approachLayout$default(Modifier modifier, Function1 function1, Function2 function2, Function3 function3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = defaultPlacementApproachInProgress;
        }
        return approachLayout(modifier, function1, function2, function3);
    }

    public static final Modifier approachLayout(Modifier modifier, Function1<? super IntSize, Boolean> function1, Function2<? super Placeable.PlacementScope, ? super LayoutCoordinates, Boolean> function2, Function3<? super ApproachMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> function3) {
        return modifier.then(new ApproachLayoutElement(function3, function1, function2));
    }

    /* JADX INFO: renamed from: localLookaheadPositionOf-Fgt4K4Q, reason: not valid java name */
    public static final long m5543localLookaheadPositionOfFgt4K4Q(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z2) {
        LayoutCoordinates lookaheadCoordinates = lookaheadScope.toLookaheadCoordinates(layoutCoordinates);
        LayoutCoordinates lookaheadCoordinates2 = lookaheadScope.toLookaheadCoordinates(layoutCoordinates2);
        if (lookaheadCoordinates instanceof LookaheadLayoutCoordinates) {
            return lookaheadCoordinates.mo5524localPositionOfS_NoaFU(lookaheadCoordinates2, j2, z2);
        }
        if (lookaheadCoordinates2 instanceof LookaheadLayoutCoordinates) {
            return Offset.m3946unaryMinusF1C5BW0(lookaheadCoordinates2.mo5524localPositionOfS_NoaFU(lookaheadCoordinates, j2, z2));
        }
        return lookaheadCoordinates.mo5524localPositionOfS_NoaFU(lookaheadCoordinates, j2, z2);
    }
}
