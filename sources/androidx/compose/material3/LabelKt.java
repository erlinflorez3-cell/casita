package androidx.compose.material3;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.material3.internal.BasicTooltip_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.PopupPositionProvider;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: Label.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!,i\bӵLc\u0003\rIي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?1Le^.ZS@\u000fs{J$c$\bCC٥\"}8\tWNmgvJp\u000bK\u000f\f\u0016\u0011\u000e:կmx\f\u0011?6PoW3{pm=nvN\u0005N5R<\b\t\u0019\u001aXMVwټGK\u001a\u0018H\u001d~Aj\r{\u0004J,\u0014F8\u0017.^wNdR|_J/Q\u0002\u0018KĚ+_6\b֔\u0011FZ3=|g\u001e9MO5C3\u0004\u000b\rRiC\u001bA\b<3mW-1I\u0002fNX.\u0015E:]\u001du}6^\u0015Q\u000f\u000bU<յgKV\u0019n|ߡ\u007f\rJ\u0016أ\n:"}, d2 = {"\u0016`]1_,\"\\(~\bZ*\f\r9n\u000e", "", "3mP/_,=", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/?`\r$B[%*\\C\u0011", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn$c\b'Fq!\u001c\\?Jk\n\u0005\u0011q`F\u0011g+a@%QTY6jR<>\u001e\"c\rJ:\u0011\u000fb\u000b(wS7,\u0004*X\u0006EqJs&\u001d1gwB:\u0019Vy\"q?8lPbM\u0004WNCb\u007fK\bh\u001ciD>#';\u0017%p[8\u0018{\u001d\u001e\u0003[\tkoGbXB,IwiFRE9\u007fe", "\u001a`Q2_", ":`Q2_", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/?`\r$B[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7r?2e:Ba(~\u0004m", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJixV\u0017M8\u0017\tXTmlN?*\u0012:IK<r\u0011\u0015\u0015\nDnzK \u0014P\t\u0015\u0003='wJchC/QT^'k\fC&k:G \u0012\u0001\u001d%q>8\u001a\tQ\u0011HG`mqV ~AmC~c\u0010F\u007f^:\u0004+)T\nArBar:x7\r\u0001\u007f\u001d`\u000eJt\"B]\f^*fI20D<\\L[l\u0005pF\u000e2|k\u0010\u0019lC1&;IG\f\u007f", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LabelKt {
    /* JADX WARN: Type inference failed for: r12v4, types: [T, androidx.compose.runtime.MutableState] */
    public static final void Label(final Function3<? super TooltipScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        LabelStateImpl labelStateImplRememberBasicTooltipState;
        Modifier.Companion companion = modifier;
        boolean z3 = z2;
        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
        Composer composerStartRestartGroup = composer.startRestartGroup(-544399326);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Label)P(3,4,1,2)74@3254L38,79@3493L33,80@3543L52,82@3646L103,88@3835L17,86@3755L249,95@4009L127:Label.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function3) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i7 = (i3 + 4) - (i3 | 4);
        if (i7 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource3) ? 256 : 128;
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i8 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((i4 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (i7 != 0) {
                mutableInteractionSource3 = null;
            }
            if (i8 != 0) {
                z3 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-544399326, i4, -1, "androidx.compose.material3.Label (Label.kt:70)");
            }
            composerStartRestartGroup.startReplaceGroup(519104973);
            ComposerKt.sourceInformation(composerStartRestartGroup, "72@3116L39");
            if (mutableInteractionSource3 == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 519105624, "CC(remember):Label.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                mutableInteractionSource2 = mutableInteractionSource3;
            }
            composerStartRestartGroup.endReplaceGroup();
            PopupPositionProvider popupPositionProviderM2859rememberPlainTooltipPositionProviderkHDZbjc = TooltipDefaults.INSTANCE.m2859rememberPlainTooltipPositionProviderkHDZbjc(0.0f, composerStartRestartGroup, 48, 1);
            if (z3) {
                composerStartRestartGroup.startReplaceGroup(-1087377900);
                ComposerKt.sourceInformation(composerStartRestartGroup, "76@3335L29");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 519112622, "CC(remember):Label.kt#9igjgp");
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new LabelStateImpl(false, false, 3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
                labelStateImplRememberBasicTooltipState = (LabelStateImpl) objRememberedValue2;
            } else {
                composerStartRestartGroup.startReplaceGroup(519114025);
                ComposerKt.sourceInformation(composerStartRestartGroup, "77@3378L56");
                labelStateImplRememberBasicTooltipState = BasicTooltipKt.rememberBasicTooltipState(false, false, new MutatorMutex(), composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.endReplaceGroup();
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 519117682, "CC(remember):Label.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            objectRef.element = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 519119301, "CC(remember):Label.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new TooltipScopeImpl(new Function0<LayoutCoordinates>() { // from class: androidx.compose.material3.LabelKt$Label$scope$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final LayoutCoordinates invoke() {
                        return objectRef.element.getValue();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final TooltipScopeImpl tooltipScopeImpl = (TooltipScopeImpl) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            BasicTooltip_androidKt.BasicTooltipBox(popupPositionProviderM2859rememberPlainTooltipPositionProviderkHDZbjc, ComposableLambdaKt.rememberComposableLambda(784196780, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.LabelKt.Label.1
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

                public final void invoke(Composer composer2, int i9) {
                    ComposerKt.sourceInformation(composer2, "C88@3843L7:Label.kt#uh7d8r");
                    if ((-1) - (((-1) - i9) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(784196780, i9, -1, "androidx.compose.material3.Label.<anonymous> (Label.kt:88)");
                    }
                    function3.invoke(tooltipScopeImpl, composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), labelStateImplRememberBasicTooltipState, companion, false, false, ComposableLambdaKt.rememberComposableLambda(1950723216, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.LabelKt$Label$wrappedContent$1
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

                public final void invoke(Composer composer2, int i9) {
                    ComposerKt.sourceInformation(composer2, "C83@3656L87:Label.kt#uh7d8r");
                    if ((i9 + 3) - (3 | i9) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1950723216, i9, -1, "androidx.compose.material3.Label.<anonymous> (Label.kt:83)");
                    }
                    Modifier.Companion companion2 = Modifier.Companion;
                    final Ref.ObjectRef<MutableState<LayoutCoordinates>> objectRef2 = objectRef;
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.LabelKt$Label$wrappedContent$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                            invoke2(layoutCoordinates);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutCoordinates layoutCoordinates) {
                            objectRef2.element.setValue(layoutCoordinates);
                        }
                    });
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierOnGloballyPositioned);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -90340533, "C83@3732L9:Label.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ((i4 << 6) & 7168)) & ((-1) - 1794096)), 0);
            HandleInteractions(!z3, labelStateImplRememberBasicTooltipState, mutableInteractionSource2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
            final boolean z4 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.LabelKt.Label.2
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

                public final void invoke(Composer composer2, int i9) {
                    LabelKt.Label(function3, modifier2, mutableInteractionSource4, z4, function2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HandleInteractions(final boolean z2, final TooltipState tooltipState, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-627258109);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HandleInteractions)P(!1,2)110@4384L587,110@4350L621:Label.kt#uh7d8r");
        if ((6 & i2) == 0) {
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (48 | i2) == 0) {
            int i4 = (64 & i2) == 0 ? composerStartRestartGroup.changed(tooltipState) : composerStartRestartGroup.changedInstance(tooltipState) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((384 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 147)) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-627258109, i3, -1, "androidx.compose.material3.HandleInteractions (Label.kt:108)");
            }
            if (z2) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 354570583, "CC(remember):Label.kt#9igjgp");
                int i5 = 1;
                int i6 = (896 & i3) == 256 ? 1 : 0;
                if ((i3 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i3) != 32 && ((i3 + 64) - (64 | i3) == 0 || !composerStartRestartGroup.changedInstance(tooltipState))) {
                    i5 = 0;
                }
                int i7 = (-1) - (((-1) - i6) & ((-1) - i5));
                LabelKt$HandleInteractions$1$1 labelKt$HandleInteractions$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (i7 != 0 || labelKt$HandleInteractions$1$1RememberedValue == Composer.Companion.getEmpty()) {
                    labelKt$HandleInteractions$1$1RememberedValue = new LabelKt$HandleInteractions$1$1(mutableInteractionSource, tooltipState, null);
                    composerStartRestartGroup.updateRememberedValue(labelKt$HandleInteractions$1$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) labelKt$HandleInteractions$1$1RememberedValue, composerStartRestartGroup, (-1) - (((-1) - (i3 >> 6)) | ((-1) - 14)));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.LabelKt.HandleInteractions.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    boolean z3 = z2;
                    TooltipState tooltipState2 = tooltipState;
                    MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                    int i9 = i2;
                    LabelKt.HandleInteractions(z3, tooltipState2, mutableInteractionSource2, composer2, RecomposeScopeImplKt.updateChangedFlags((i9 + 1) - (i9 & 1)));
                }
            });
        }
    }
}
