package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: SwipeToDismissBox.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d̉=!4i\bDJc|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0ZeP.hS2\u000f\u0002{<řc$\bCC٥\"}0\u0012WNmkvJp\u000bK\u000f\f\u0016\u0001j:N]xs\u0012\u00172HqW+[pU9\u000fvf\t.5:8(\t148M(\r\u000bE[\f@7PrJR;O3 Ū\n>&\tɉ`gT?xrc:=-\u001bipYWe6|[\u0019^TU\u001a'g$+NEM\u0015S`3\rX[M\u0012Wqk\u0012\u0019A5;a\ng8h\u007fB\u001c;Q\u001d]!(\u000b\u000bŌd\f-3յgKV\u0017n|ߡ\u007f\rJ\u0015&V5ZF-Hj8\u00149t\u0001fXP0rr\u0012\u0001aD,=\fC-I\u001b\u0015eq=)Ne\t3\u0013ND\u0007n/ql)p&+c&hśUJC`^\u0010_V}\u0006vh(D\u00142W\u007f]\u0013?4]*ھ_91<\f\u0010Vֳ\u007fv3_?\u05c8kʐLB*n$7Ґ\r("}, d2 = {"\u0012hb:\\:LD\u0019\u0006\u0005\\0\f\u001d\u001eh\r(\nC\u000b\u001e\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "!vX=X\u001bH2\u001d\r\u0003b:\u000be9x", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d79d}\u000fAL\u001a<UGIy\u0011((Vp5\u0016c\u0002", "0`R8Z9Hc\"}Xh5\f\t8t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_19u?\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,\u001dW'\u0007~l:]\u00169mm7wM\u0010\u0006!'x\r", "", "3mP/_,\u001dW'\u0007~l:]\u00169m_1z/\u000b\u0005&C|\u001d", "5dbAh9>ax\bv[3|\b", "1n]AX5M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0013G]\t &wt2[K?yBz\u001f{OH\u0003r,$]-Q[U0e\u001cwN\u001c[[\u001eW)\u001c\tcJ28%G(\u0006;M\fD6Vr\u0012\u00174wzFU#\u0011w\u001f}L3vF#o}\u0011)Oa.e\u0010_*2//\u0019zw#*oT7S\u0001d\u0019<S\npeV\u001d\u0005A2\bNkOC~YF}tt2w\u0001\u0011?bx*\bv\u0002>2An\u0013K1%Ng\b\u00194\\\u000b\u00050>G\u001dMKpKP\"QY", "@d\\2`)>`\u0007\u0011~i,k\u0013\u000ei\u000e0\u007fN\u000fs!Z]\u001d8\u0006%", "7mXA\\(ED\u0015\u0006\u000b^", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d79d}\u000fAL\u001a<UGIy\u0011((Y]@\u0017c\u0002", "1n]3\\9FD\u0015\u0006\u000b^\n\u007f\u00058g\u007f", ">nb6g0H\\\u0015\u0006ia9|\u00172o\u0007'", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Bnc._\u000bBa(z\u0004\\,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0013G]\t &wt2[K?yBz\u001f{R5\u000es,$]-Q[U0e\u001cwN\u001c[[\u001eW)\u001c\tcJ28%G(\u0006;M\fD4Vr\u001c\u0018DqtK \u0015X\u0002^vQ2fU]i\u0003U\u000b&r3b\u001bc'e\u0006\u0010\u000b\u0010z\u0018(rT-\u001dEQ\u001bz]\u0004ug\u0011&\u000bA3Bu[\u0010#y]G~5\u001fXQ[uu?p4s:\u000e8)I.\u0003Uo#Hlx^4XP'3:8\u001a\r\u0015Q\bpI\u000eW)@\f\u001cj9?'Bov6\u001e\u0003l\u00171", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SwipeToDismissBoxKt {
    private static final float DismissVelocityThreshold = Dp.m6638constructorimpl(125);

    /* JADX INFO: renamed from: androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$2 */
    /* JADX INFO: compiled from: SwipeToDismissBox.kt */
    /* JADX INFO: loaded from: classes.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $backgroundContent;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ boolean $enableDismissFromEndToStart;
        final /* synthetic */ boolean $enableDismissFromStartToEnd;
        final /* synthetic */ boolean $gesturesEnabled;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, boolean z2, boolean z3, boolean z4, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, int i2, int i3) {
            super(2);
            function3 = function3;
            modifier = modifier;
            z = z2;
            z = z3;
            z = z4;
            function3 = function32;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            SwipeToDismissBoxKt.SwipeToDismissBox(swipeToDismissBoxState, function3, modifier, z, z, z, function3, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$1 */
    /* JADX INFO: compiled from: SwipeToDismissBox.kt */
    /* JADX INFO: loaded from: classes.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<SwipeToDismissBoxValue, Boolean> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(SwipeToDismissBoxValue swipeToDismissBoxValue) {
            return true;
        }
    }

    public static final SwipeToDismissBoxState rememberSwipeToDismissBoxState(final SwipeToDismissBoxValue swipeToDismissBoxValue, final Function1<? super SwipeToDismissBoxValue, Boolean> function1, final Function1<? super Float, Float> function12, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -246335487, "C(rememberSwipeToDismissBoxState)P(1)185@7607L19,187@7687L7,195@7929L102,188@7706L325:SwipeToDismissBox.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            swipeToDismissBoxValue = SwipeToDismissBoxValue.Settled;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            function1 = AnonymousClass1.INSTANCE;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            function12 = SwipeToDismissBoxDefaults.INSTANCE.getPositionalThreshold(composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-246335487, i2, -1, "androidx.compose.material3.rememberSwipeToDismissBoxState (SwipeToDismissBox.kt:186)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) objConsume;
        Object[] objArr = new Object[0];
        Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> Saver = SwipeToDismissBoxState.Companion.Saver(function1, function12, density);
        ComposerKt.sourceInformationMarkerStart(composer, -1333458863, "CC(remember):SwipeToDismissBox.kt#9igjgp");
        int i4 = (-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - ((((6 ^ ((i2 + 14) - (14 | i2))) <= 4 || !composer.changed(swipeToDismissBoxValue)) && (6 & i2) != 4) ? 0 : 1)) & ((-1) - (composer.changed(density) ? 1 : 0))))) & ((-1) - ((((((i2 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i2)) ^ 48) <= 32 || !composer.changed(function1)) && (i2 + 48) - (48 | i2) != 32) ? 0 : 1))))) & ((-1) - ((((((i2 + 896) - (896 | i2)) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(function12)) || (i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256) ? 1 : 0)));
        Object objRememberedValue = composer.rememberedValue();
        if (i4 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Function0) new Function0<SwipeToDismissBoxState>() { // from class: androidx.compose.material3.SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final SwipeToDismissBoxState invoke() {
                    return new SwipeToDismissBoxState(swipeToDismissBoxValue, density, function1, function12);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SwipeToDismissBoxState swipeToDismissBoxState = (SwipeToDismissBoxState) RememberSaveableKt.m3764rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return swipeToDismissBoxState;
    }

    public static final void SwipeToDismissBox(final SwipeToDismissBoxState swipeToDismissBoxState, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, boolean z2, boolean z3, boolean z4, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, int i2, int i3) {
        int i4;
        boolean z5 = z4;
        final boolean z6 = z2;
        final boolean z7 = z3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-402577235);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SwipeToDismissBox)P(6!1,5,3,2,4)225@9211L7,227@9247L1205:SwipeToDismissBox.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i5 = composerStartRestartGroup.changed(swipeToDismissBoxState) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i4 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i6 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (i3 + 8) - (i3 | 8);
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z6) ? 2048 : 1024)));
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 |= composerStartRestartGroup.changed(z7) ? 16384 : 8192;
        }
        int i10 = i3 & 32;
        if (i10 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i11 = composerStartRestartGroup.changed(z5) ? 131072 : 65536;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            i4 |= 1572864;
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            int i12 = composerStartRestartGroup.changedInstance(function32) ? 1048576 : 524288;
            i4 = (i4 + i12) - (i4 & i12);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 599187)) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (i8 != 0) {
                z6 = true;
            }
            if (i9 != 0) {
                z7 = true;
            }
            if (i10 != 0) {
                z5 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-402577235, i4, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:224)");
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final boolean z8 = objConsume == LayoutDirection.Rtl;
            Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(companion, swipeToDismissBoxState.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, z5 && swipeToDismissBoxState.getCurrentValue() == SwipeToDismissBoxValue.Settled, false, null, 24, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAnchoredDraggable$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -586717200, "C235@9549L71,239@9784L652,236@9629L817:SwipeToDismissBox.kt#uh7d8r");
            Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(Modifier.Companion);
            int i13 = (-1) - (((-1) - (i4 << 6)) | ((-1) - 7168));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierMatchParentSize);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            function3.invoke(RowScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - ((-1) - (((-1) - (i13 >> 6)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) & ((-1) - 6))));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier.Companion companion2 = Modifier.Companion;
            AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableState$material3_release = swipeToDismissBoxState.getAnchoredDraggableState$material3_release();
            Orientation orientation = Orientation.Horizontal;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 396722910, "CC(remember):SwipeToDismissBox.kt#9igjgp");
            int i14 = (-1) - (((-1) - (((-1) - (((-1) - (composerStartRestartGroup.changed(z8) ? 1 : 0)) & ((-1) - ((-1) - (((-1) - i4) | ((-1) - 7168)) == 2048 ? 1 : 0)))) | ((-1) - (((-1) - 57344) | ((-1) - i4)) == 16384 ? 1 : 0))) & ((-1) - ((i4 & 14) == 4 ? 1 : 0)));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i14 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function2) new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SwipeToDismissBoxValue>, ? extends SwipeToDismissBoxValue>>() { // from class: androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SwipeToDismissBoxValue>, ? extends SwipeToDismissBoxValue> invoke(IntSize intSize, Constraints constraints) {
                        return m2570invokeGpV2Q24(intSize.m6812unboximpl(), constraints.m6597unboximpl());
                    }

                    /* JADX INFO: renamed from: invoke-GpV2Q24, reason: not valid java name */
                    public final Pair<DraggableAnchors<SwipeToDismissBoxValue>, SwipeToDismissBoxValue> m2570invokeGpV2Q24(long j2, long j3) {
                        final float fM6808getWidthimpl = IntSize.m6808getWidthimpl(j2);
                        final boolean z9 = z6;
                        final boolean z10 = z8;
                        final boolean z11 = z7;
                        return TuplesKt.to(AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SwipeToDismissBoxValue>, Unit>() { // from class: androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$1$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SwipeToDismissBoxValue> draggableAnchorsConfig) {
                                invoke2(draggableAnchorsConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DraggableAnchorsConfig<SwipeToDismissBoxValue> draggableAnchorsConfig) {
                                draggableAnchorsConfig.at(SwipeToDismissBoxValue.Settled, 0.0f);
                                if (z9) {
                                    draggableAnchorsConfig.at(SwipeToDismissBoxValue.StartToEnd, z10 ? -fM6808getWidthimpl : fM6808getWidthimpl);
                                }
                                if (z11) {
                                    draggableAnchorsConfig.at(SwipeToDismissBoxValue.EndToStart, z10 ? fM6808getWidthimpl : -fM6808getWidthimpl);
                                }
                            }
                        }), swipeToDismissBoxState.getTargetValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierDraggableAnchors = AnchoredDraggableKt.draggableAnchors(companion2, anchoredDraggableState$material3_release, orientation, (Function2) objRememberedValue);
            int i15 = (i4 >> 9) & 7168;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierDraggableAnchors);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl3 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3671constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3671constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3678setimpl(composerM3671constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i16 = (-1) - (((-1) - (i15 >> 6)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            function32.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf((i16 + 6) - (i16 & 6)));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SwipeToDismissBoxKt.SwipeToDismissBox.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $backgroundContent;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                final /* synthetic */ boolean $enableDismissFromEndToStart;
                final /* synthetic */ boolean $enableDismissFromStartToEnd;
                final /* synthetic */ boolean $gesturesEnabled;
                final /* synthetic */ Modifier $modifier;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33, Modifier companion3, final boolean z62, final boolean z72, boolean z52, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function322, int i22, int i32) {
                    super(2);
                    function3 = function33;
                    modifier = companion3;
                    z = z62;
                    z = z72;
                    z = z52;
                    function3 = function322;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    SwipeToDismissBoxKt.SwipeToDismissBox(swipeToDismissBoxState, function3, modifier, z, z, z, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }
}
