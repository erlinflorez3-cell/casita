package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯC\u001d̉=!$j\bDRc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007|jA0ZeP.hS2\u000f\u0002{<$a$yCQU\"}(\tWN}gvϺb\u000bQ\u0015\u000eǝ!i+a\n\u0007^*\u000f`D E9M}@Q`#:5;@'P\u0011\u0015\u0003**v\u0017\u0007|SK:\u001a@B\u0001:\u0001\u0016{\u000bܨ\u0016\u0006D*G#֔kNDS\u0005\u001aH0;\u0003\u0018D~+m<\u0015M;S\u0005-\u0013vo!C@e9E@a\b\u001fikA\u0013? D\u0015j7'YQ\u0004YFX.\u001dC1̠\u0011]x0#\nŌd\f59goY_&(&\u000b,\u0011J\u0015&\u0006UZN;(Ǒ \u000easIԢBг\u0006`J\u007f\taِ\u001b8"}, d2 = {" dd@X+,Z#\u000e^]", "/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EG|+!W~W*\u0007\"3c\u0006+A{\u0016\u0015IWE{C\u0004$'N9\u0017q,Md.Q[2+\u001b\u001e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.4?OuD-zw &\u0007s:Nu\u0015NV]\u0010[\u0011>\u0013", "!tQ0b4I]'~aZ@\u0007\u0019>", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", ";dP@h9>>#\u0006~\\@", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.5C7yD+\u0015V_C\u0012c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\nixV\u0017M8\u0017\tXTmlN?*\u0012:IKHx\n\u001b\u001a\u001654NL^\u001bQ\b\u0015\u0003\u0017\rL\nJ", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.4?OuD-\u0003w]H\u00079", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0013EV{*?x <M*7\u007f>.$Vp5\u0016c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b\fxC; \f,VW\"n\u000b\u001b\u001d\u0012>4uS^YH\n\u001esP-rOg)ZWJCq.n\u0015,rC6C#!{\u001d\u001a{\u001a,\u0014\u0004^\u001b\u0001RCtwP(~@$\bKeNPyc<\u0002|\u0003/?h", "!tQ0b4I]'~he6\fu/u\u000e(fJ\b\u001b\u0015[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.;JEz!\u001e%va$\u0011j0L\u000b|", ";`g _6Ma\b\tg^;x\r8F\n5h@\u0011%\u0017", "", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SubcomposeLayoutKt {
    private static final SubcomposeLayoutKt$ReusedSlotId$1 ReusedSlotId = new Object() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$ReusedSlotId$1
        public String toString() {
            return "ReusedSlotId";
        }
    };

    /* JADX INFO: renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2 */
    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<SubcomposeMeasureScope, Constraints, MeasureResult> $measurePolicy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2, int i2, int i3) {
            super(2);
            function2 = function2;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            SubcomposeLayoutKt.SubcomposeLayout(modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5 */
    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass5 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<SubcomposeMeasureScope, Constraints, MeasureResult> $measurePolicy;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(Modifier modifier, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2, int i2, int i3) {
            super(2);
            modifier = modifier;
            function2 = function2;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    public static final void SubcomposeLayout(Modifier modifier, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2, Composer composer, int i2, int i3) {
        int i4;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1298353104);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SubcomposeLayout)P(1)80@3810L36,79@3776L144:SubcomposeLayout.kt#80mrfh");
        int i5 = (-1) - (((-1) - i3) | ((-1) - 1));
        if (i5 != 0) {
            i4 = (i2 + 6) - (6 & i2);
        } else if ((i2 + 6) - (6 | i2) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(companion) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 + 48) - (48 | i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i4 + 19) - (19 | i4) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1298353104, i4, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:78)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1663495477, "CC(remember):SubcomposeLayout.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new SubcomposeLayoutState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            SubcomposeLayout((SubcomposeLayoutState) objRememberedValue, companion, function2, composerStartRestartGroup, (i4 << 3) & 1008, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function2<SubcomposeMeasureScope, Constraints, MeasureResult> $measurePolicy;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function22, int i22, int i32) {
                    super(2);
                    function2 = function22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    SubcomposeLayoutKt.SubcomposeLayout(modifier, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    public static final void SubcomposeLayout(final SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2, Composer composer, int i2, int i3) {
        int i4;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-511989831);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SubcomposeLayout)P(2,1)113@5266L23,114@5319L28,117@5475L487:SubcomposeLayout.kt#80mrfh");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (6 | i2) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(subcomposeLayoutState) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((48 & i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        if ((i3 + 4) - (4 | i3) != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 256 : 128)));
        }
        if ((i4 + 147) - (147 | i4) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-511989831, i4, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:112)");
            }
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<LayoutNode> constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor$ui_release);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, subcomposeLayoutState, subcomposeLayoutState.getSetRoot$ui_release());
            Updater.m3678setimpl(composerM3671constructorimpl, compositionContextRememberCompositionContext, subcomposeLayoutState.getSetCompositionContext$ui_release());
            Updater.m3678setimpl(composerM3671constructorimpl, function2, subcomposeLayoutState.getSetMeasurePolicy$ui_release());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (!composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startReplaceGroup(-26580342);
                ComposerKt.sourceInformation(composerStartRestartGroup, "130@6019L54,130@6008L65");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1663424771, "CC(remember):SubcomposeLayout.kt#9igjgp");
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomposeLayoutState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            subcomposeLayoutState.forceRecomposeChildren$ui_release();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-26502501);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout.5
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function2<SubcomposeMeasureScope, Constraints, MeasureResult> $measurePolicy;
                final /* synthetic */ Modifier $modifier;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass5(Modifier companion2, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function22, int i22, int i32) {
                    super(2);
                    modifier = companion2;
                    function2 = function22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier, function2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    public static final SubcomposeSlotReusePolicy SubcomposeSlotReusePolicy(int i2) {
        return new FixedCountSubcomposeSlotReusePolicy(i2);
    }
}
