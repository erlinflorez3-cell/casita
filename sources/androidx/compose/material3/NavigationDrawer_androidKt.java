package androidx.compose.material3;

import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: NavigationDrawer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d̉=!4i\bDJi|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0ZeP.hS2\u000fq{LPi+\nCi]J\u00020\u0012gN\u0016q\u001f_h\u0016[ \u0016\u0018\tjZVezm\u0012=:p{У7MuK\u007f_ҽ:\u0005.ABL\bڎ\u0019\u001aXGf͍|ŲO\u0014\u001a0NrRT\u0013M\u0013\u001b2\u001aL#\u0019\u001e\u000bf%ȥJǰaB7#\u0011kZP-c>}m!TY?\r%`tѩB˝9\u001d-S\u0011\tj]E\tMrݞ\tx"}, d2 = {"\u001eqT1\\*MW*~WZ*\u0003g<a\u0012(\t(|*\u0005Ek\u0015<i\u00049g\r\u001c@k\u0016\u0010ZMM", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u001de,=W\u0017\u000e~o,Y\u0005-k^5wR\u0001$~C\u0003{:r,5L\\$E|\u00127KC\u001dx>0", "u(5", "\u0014", "\u001eqT1\\*MW*~WZ*\u0003g<a\u0012(\t(|*\u0005Ek\u0015<i\u00049g\r\u001c@k\u0016\u001cPP?t:", "5dc\u001de,=W\u0017\u000e~o,Y\u0005-k^5wR\u0001$~C\u0003{:r,5L\\$E|\u00127KC)nA\"\u001en", "\u001eqT1\\*MW*~WZ*\u0003g<a\u0012(\t(|*\u0005Ek\u0015<j\u00049g\r\u001c@k\u0016", "5dc\u001de,=W\u0017\u000e~o,Y\u0005-k^5wR\u0001$~C\u0003{:r,5M\\$E|\u00127KC", "\u0012qPDX9)`\u0019}~\\;\u0001\u001a/B{&\u0002#| \u0016No\u001b", "", "2qPDX9,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U21k}-%|\u0012=M\u0019", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U21k}-\"z\u0016-QAJoE\u001eqd_?tr(]v|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0004BU\u0010 D[%*\\C\u0011R:($oeBPh=V@(WUL;`\\{K]rj\u0017L:\u0011\u000fb\u000fyU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\fc P\t\u0019}ArFPaj\u0004UAR8\u000e(|", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NavigationDrawer_androidKt {
    private static final float PredictiveBackDrawerMaxScaleXDistanceGrow = Dp.m6638constructorimpl(12);
    private static final float PredictiveBackDrawerMaxScaleXDistanceShrink = Dp.m6638constructorimpl(24);
    private static final float PredictiveBackDrawerMaxScaleYDistance = Dp.m6638constructorimpl(48);

    public static final void DrawerPredictiveBackHandler(final DrawerState drawerState, final Function3<? super DrawerPredictiveBackState, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2) {
        int i3;
        int i4;
        DrawerPredictiveBackState drawerPredictiveBackState;
        Composer composerStartRestartGroup = composer.startRestartGroup(1444817207);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DrawerPredictiveBackHandler)P(1)45@1743L40,46@1800L24,47@1862L7,*51@2024L7,57@2337L1264,57@2285L1316,89@3644L99,89@3607L136,95@3749L34:NavigationDrawer.android.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            i3 = (composerStartRestartGroup.changed(drawerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1444817207, i3, -1, "androidx.compose.material3.DrawerPredictiveBackHandler (NavigationDrawer.android.kt:44)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 228403032, "CC(remember):NavigationDrawer.android.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new DrawerPredictiveBackState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DrawerPredictiveBackState drawerPredictiveBackState2 = (DrawerPredictiveBackState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            boolean z2 = objConsume == LayoutDirection.Rtl;
            Ref.FloatRef floatRef = new Ref.FloatRef();
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Ref.FloatRef floatRef3 = new Ref.FloatRef();
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density = (Density) objConsume2;
            floatRef.element = density.mo710toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceGrow);
            floatRef2.element = density.mo710toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceShrink);
            floatRef3.element = density.mo710toPx0680j_4(PredictiveBackDrawerMaxScaleYDistance);
            boolean zIsOpen = drawerState.isOpen();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 228423264, "CC(remember):NavigationDrawer.android.kt#9igjgp");
            int i5 = (composerStartRestartGroup.changed(z2) ? 1 : 0) | (composerStartRestartGroup.changed(floatRef.element) ? 1 : 0);
            boolean zChanged = composerStartRestartGroup.changed(floatRef2.element);
            int i6 = (i5 + (zChanged ? 1 : 0)) - (i5 & (zChanged ? 1 : 0)) != 1 ? 0 : 1;
            boolean zChanged2 = composerStartRestartGroup.changed(floatRef3.element);
            int i7 = ((i6 + (zChanged2 ? 1 : 0)) - (i6 & (zChanged2 ? 1 : 0)) != 1 ? 0 : 1) | (composerStartRestartGroup.changedInstance(coroutineScope) ? 1 : 0);
            int i8 = (i3 + 14) - (i3 | 14);
            int i9 = i8 == 4 ? 1 : 0;
            int i10 = (i7 + i9) - (i7 & i9);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i10 != 0 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                i4 = 0;
                drawerPredictiveBackState = drawerPredictiveBackState2;
                objRememberedValue3 = (Function2) new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(drawerPredictiveBackState, coroutineScope, drawerState, z2, floatRef, floatRef2, floatRef3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                drawerPredictiveBackState = drawerPredictiveBackState2;
                i4 = 0;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            PredictiveBackHandlerKt.PredictiveBackHandler(zIsOpen, (Function2) objRememberedValue3, composerStartRestartGroup, i4, i4);
            Boolean boolValueOf = Boolean.valueOf(drawerState.isClosed());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 228463923, "CC(remember):NavigationDrawer.android.kt#9igjgp");
            int i11 = i8 != 4 ? i4 : 1;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i11 != 0 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (Function2) new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1(drawerState, drawerPredictiveBackState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i4);
            function3.invoke(drawerPredictiveBackState, composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - ((i3 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i3 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) & ((-1) - 6))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawer_androidKt.DrawerPredictiveBackHandler.4
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

                public final void invoke(Composer composer2, int i12) {
                    DrawerState drawerState2 = drawerState;
                    Function3<DrawerPredictiveBackState, Composer, Integer, Unit> function32 = function3;
                    int i13 = i2;
                    NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState2, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i13 + 1) - (i13 & 1)));
                }
            });
        }
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceGrow() {
        return PredictiveBackDrawerMaxScaleXDistanceGrow;
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceShrink() {
        return PredictiveBackDrawerMaxScaleXDistanceShrink;
    }

    public static final float getPredictiveBackDrawerMaxScaleYDistance() {
        return PredictiveBackDrawerMaxScaleYDistance;
    }
}
