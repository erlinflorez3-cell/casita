package androidx.compose.material3;

import android.content.res.Configuration;
import android.view.View;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
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
/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d̉=!4i\bDJc|\u0004O\u00068é6B\r+4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$q$yCQU\"}(\nWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0012\u00172PuG\u074cUoS9ht<\u0007(288\u0002ڎ\t\u001a8T\u0018v\u0001DS\f(0Hp@S\u0015M\u001b\u001a\u001a\u0006D#\u0019mjhf6vn\u000e>=&\u001bipRWo>\u0002e\u0019VV7\r%e.-P7c\u0017SY3\rX[M\nWqk\r\u0019A54a\ng8h\u007fB\u001f;Q\u001d]!(\u000b\u000bŌd\f-6յgKV\u001an|ߡ\u007f\rJ\u0011&/5VF-Hh8\u0012A\u0004\u000bSn`2bP\u0011\u0013ad)U\nA>Q!vSq;GPe\u0010K\u000e̷'\u0001|6st\u001cv-\u001b\u0003\u000f\u00025_XUH|#\nC{\u001e\td\u0018)2Iw\u0004=\u0017).E<}[Qw/\b\u001aHro\u001f\u0005\u000fp\u0004m`KX\"\u001d\u001ag4\u0017\u0011rJt\u0007{P\u0003ZZ%} b$\u0016\bA>\r{J@=\u0010|o\u0019mxnu\nSO\u0017;g\u0011\u0004\u000e\u0006Y\u000f9Ct{\u0012wQ%8\u0006<Ѯ\u0004֚ڋFU\u0012\u007fjN:>V\u0012(w*]v\u000e)1m\u001ab4D;'\u0006-H17jA+\u0019&Z\t\u001e\rԞK$1hzڒ\u000bɹT^xoux̥,\u0002h%3ۭmc\u0018ňYL\u05ee8\u000712\u0017u\u0016F\u0016t\u001eƍ̍\u0016¡Y\u0004.B29\u007fF\u0014ЪÐ~Ȯ6\n;rdr\u0014h$ɇ،z"}, d2 = {"\u0013w_<f,=2&\t\u0006]6\u000f\u0012\u0017e\t8_O\u0001\u001fyQ|\u0012Q\u0001.DU\u0005\u000b3l\u00152VE", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0013w_<f,=2&\t\u0006]6\u000f\u0012\u0017e\t8XJ\u0014", "", "3w_.a+>R", "", "=m4Ec(GR\u0019}Xa(\u0006\u000b/", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006V8@c\f 6L#8XBE}=\u0006\u0015qq\u0016\u0011v\u001aL\u00012G\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gA\u0014X:\u0014\tb\u000b)\u007fL\u0001 \u00185G\u0011?r\n\u001a_nEsnQZ\u001aPGj\\=2gSccxZ\u000bCl2o\u0016m\u001d&GJ-#u!\u001b2.8\u0012\u0007]\u001fr_OKK\u000b\n", "!nUA>,RP#z\b]\u0013\u0001\u0017>e\t(\t", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "=m:2l)HO&}kb:\u0001\u00063l\u00047\u0010\u001e\u0004\u0013 Io", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016w]G\u0005{=\"$2@9\u0010q0]\u000b|.RX;cV{\u0007\u0019#bWO;\u0016\u0003hE.wR\u0001\u007f\u00185G\u0011?r\nVkt1soO`\u0014F\r^sK1sPg_CTQNq.l\f)zfBE.\"q&pL\u0014\u001f", "1`[0h3:b\u0019fvq\u000f|\r1h\u000f", "", "Eh]1b>\u001b])\byl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "/mR5b9\u001b])\byl", "DdaA\\*:Z\u0001z\b`0\u0006", "3w_.a+:P ~", "/mR5b9-g$~", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^%>iY)5p ;<WFk\n", "3w_.a+>Rw~\t\\9\u0001\u0014>i\n1", "", "1n[9T7LS\u0018]zl*\n\r:t\u00042\u0005", "BnV4_,\u001dS'|\bb7\f\r9n", "9dh/b(KRv\t\u0004m9\u0007\u00106e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#c~/Ii#.3COh>\u001a\"g?C\u0010r9X}.GY$", "3w_.a+:P ~B@8Nw\fQN", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000bNd&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F^gA\u0013J<\tN`=-p\u000e%.\u00150R\u0004\u0011O\u0006\b'\n~qlKXY5\t\"yJ+>-^[\u000bC\u000bL^3fUM,i>C&iX\u001e\u0017yLw\u0011w\\\u0013<@\ttkP\u001bP\u001f GlhPInh\u0006r1'V\u0006\u0006\u0012{hxt\u007f4\u007fC+@q\r\u0015U\"?m\u000b\u00119\\'':3F\u000fLJA\u007fuM\u001br&h\b\u001b8x\u0018\u0015ndpR\u0013\u0006p`Y?ij\u000bERONM9|1E\u0003C_y\"^", "5dc\u000ea*A]&[\u0005n5{\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "5dc$\\5=]+[\u0005n5{\u0017", ";`c2e0:Zfx\b^3|\u0005=e", "/mR5b9\u001c]#\fyb5x\u0018/s", "/mR5b90W\u0018\u000e}", ";d]B@(Q6\u0019\u0003|a;"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ExposedDropdownMenu_androidKt {
    private static final float ExposedDropdownMenuItemHorizontalPadding = Dp.m6638constructorimpl(16);

    /* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$6 */
    /* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass6 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function3<ExposedDropdownMenuBoxScope, Composer, Integer, Unit> $content;
        final /* synthetic */ boolean $expanded;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Boolean, Unit> $onExpandedChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass6(boolean z2, Function1<? super Boolean, Unit> function1, Modifier modifier, Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            z = z2;
            function1 = function1;
            modifier = modifier;
            function3 = function3;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(z, function1, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$2 */
    /* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Density $density;
        final /* synthetic */ Function0<Unit> $onKeyboardVisibilityChange;
        final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(View view, Density density, Function0<Unit> function0, int i2) {
            super(2);
            view = view;
            density = density;
            function0 = function0;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ExposedDropdownMenu_androidKt.SoftKeyboardListener(view, density, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    public static final void ExposedDropdownMenuBox(final boolean z2, Function1<? super Boolean, Unit> function1, Modifier modifier, Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        int i4;
        FocusRequester focusRequester;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(2067579792);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ExposedDropdownMenuBox)P(1,3,2)140@6498L7,141@6531L7,142@6570L7,146@6683L53,147@6760L33,148@6819L33,150@6879L29,151@6970L7,152@7008L31,153@7071L32,154@7132L37,155@7196L62,158@7284L2210,200@9543L361,199@9500L442,225@10317L47,225@10306L58,229@10529L27,229@10497L59:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        final Function1<? super Boolean, Unit> function12 = function1;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
            i4 = (i4 + i5) - (i4 & i5);
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i6 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 1171)) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2067579792, i4, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.android.kt:139)");
            }
            ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localConfiguration);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Object obj = (Configuration) objConsume;
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final View view = (View) objConsume2;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density = (Density) objConsume3;
            final int iMo704roundToPx0680j_4 = density.mo704roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 426259219, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 426261663, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 426263551, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 426265467, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final FocusRequester focusRequester2 = (FocusRequester) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume4 = composerStartRestartGroup.consume(localSoftwareKeyboardController);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) objConsume4;
            Strings.Companion companion2 = Strings.Companion;
            final String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_dropdown_menu_expanded), composerStartRestartGroup, 0);
            Strings.Companion companion3 = Strings.Companion;
            final String strM2993getString2EP1pXo2 = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_dropdown_menu_collapsed), composerStartRestartGroup, 0);
            Strings.Companion companion4 = Strings.Companion;
            final String strM2993getString2EP1pXo3 = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_dropdown_menu_toggle), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 426275644, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MenuAnchorType.m2235boximpl(MenuAnchorType.Companion.m2243getPrimaryNotEditableMg6Rgbw()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 426280608, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            int i8 = (-1) - (((-1) - i4) | ((-1) - 14));
            int i9 = i8 == 4 ? 1 : 0;
            int i10 = (-1) - (((-1) - i4) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i11 = i9 | (i10 == 32 ? 1 : 0);
            boolean zChanged = composerStartRestartGroup.changed(obj);
            int i12 = (-1) - (((-1) - (((zChanged ? 1 : 0) + i11) - ((zChanged ? 1 : 0) & i11))) & ((-1) - (composerStartRestartGroup.changed(view) ? 1 : 0))) != 1 ? 0 : 1;
            boolean zChanged2 = composerStartRestartGroup.changed(density);
            boolean z3 = (i12 + (zChanged2 ? 1 : 0)) - (i12 & (zChanged2 ? 1 : 0)) == 1;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = obj;
                focusRequester = focusRequester2;
                function12 = function12;
                Object obj2 = new ExposedDropdownMenuBoxScopeImpl() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1
                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    /* JADX INFO: renamed from: menuAnchor-fsE2BvY */
                    public Modifier mo2101menuAnchorfsE2BvY(Modifier modifier2, final String str, boolean z4) {
                        Modifier.Companion companionM2110expandableGq7TBQ4;
                        Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifier2, focusRequester2);
                        if (!z4) {
                            companionM2110expandableGq7TBQ4 = Modifier.Companion;
                        } else {
                            Modifier.Companion companion5 = Modifier.Companion;
                            boolean z5 = z2;
                            final MutableState<MenuAnchorType> mutableState3 = mutableState2;
                            final Function1<Boolean, Unit> function13 = function12;
                            final boolean z6 = z2;
                            companionM2110expandableGq7TBQ4 = ExposedDropdownMenu_androidKt.m2110expandableGq7TBQ4(companion5, z5, new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    mutableState3.setValue(MenuAnchorType.m2235boximpl(str));
                                    function13.invoke(Boolean.valueOf(!z6));
                                }
                            }, str, strM2993getString2EP1pXo, strM2993getString2EP1pXo2, strM2993getString2EP1pXo3, softwareKeyboardController);
                        }
                        return modifierFocusRequester.then(companionM2110expandableGq7TBQ4);
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    /* JADX INFO: renamed from: getAnchorType-Mg6Rgbw$material3_release */
                    public String mo2100getAnchorTypeMg6Rgbw$material3_release() {
                        return mutableState2.getValue().m2241unboximpl();
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    public Modifier exposedDropdownSize(Modifier modifier2, final boolean z4) {
                        final MutableIntState mutableIntState3 = mutableIntState;
                        final MutableIntState mutableIntState4 = mutableIntState2;
                        return LayoutModifierKt.layout(modifier2, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                return m2111invoke3p2s80s(measureScope, measurable, constraints.m6597unboximpl());
                            }

                            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                            public final MeasureResult m2111invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                                int iM6608constrainWidthK40F9xA = ConstraintsKt.m6608constrainWidthK40F9xA(j2, ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$5(mutableIntState3));
                                int iM6607constrainHeightK40F9xA = ConstraintsKt.m6607constrainHeightK40F9xA(j2, ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$8(mutableIntState4));
                                int iM6593getMinWidthimpl = z4 ? iM6608constrainWidthK40F9xA : Constraints.m6593getMinWidthimpl(j2);
                                if (!z4) {
                                    iM6608constrainWidthK40F9xA = Constraints.m6591getMaxWidthimpl(j2);
                                }
                                final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j2, iM6593getMinWidthimpl, iM6608constrainWidthK40F9xA, 0, iM6607constrainHeightK40F9xA, 4, null));
                                return MeasureScope.layout$default(measureScope, placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1.1
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
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo5514measureBRTryo0, 0, 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        });
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                focusRequester = focusRequester2;
            }
            ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 = (ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 426351047, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(view);
            boolean zChanged3 = composerStartRestartGroup.changed(iMo704roundToPx0680j_4);
            boolean z4 = ((zChangedInstance ? 1 : 0) + (zChanged3 ? 1 : 0)) - ((zChangedInstance ? 1 : 0) & (zChanged3 ? 1 : 0)) == 1;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1
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
                        mutableState.setValue(layoutCoordinates);
                        mutableIntState.setIntValue(IntSize.m6808getWidthimpl(layoutCoordinates.mo5522getSizeYbymL2g()));
                        mutableIntState2.setIntValue(ExposedDropdownMenu_androidKt.calculateMaxHeight(ExposedDropdownMenu_androidKt.getWindowBounds(view.getRootView()), ExposedDropdownMenu_androidKt.getAnchorBounds(ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$2(mutableState)), iMo704roundToPx0680j_4));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue7);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -615130921, "C211@9927L9:ExposedDropdownMenu.android.kt#uh7d8r");
            function3.invoke(exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1, composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - (i4 >> 6)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(426363998);
            ComposerKt.sourceInformation(composerStartRestartGroup, "215@10008L286,215@9972L322");
            if (z2) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 426365852, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(view) | composerStartRestartGroup.changed(iMo704roundToPx0680j_4);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                    objRememberedValue8 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            mutableIntState2.setIntValue(ExposedDropdownMenu_androidKt.calculateMaxHeight(ExposedDropdownMenu_androidKt.getWindowBounds(view.getRootView()), ExposedDropdownMenu_androidKt.getAnchorBounds(ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$2(mutableState)), iMo704roundToPx0680j_4));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                SoftKeyboardListener(view, density, (Function0) objRememberedValue8, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 426375501, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            boolean z5 = i8 == 4;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                final FocusRequester focusRequester3 = focusRequester;
                objRememberedValue9 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        if (z2) {
                            focusRequester3.requestFocus();
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.SideEffect((Function0) objRememberedValue9, composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 426382265, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            boolean z6 = i10 == 32;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                final Function1<? super Boolean, Unit> function13 = function12;
                objRememberedValue10 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        function13.invoke(false);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            BackHandlerKt.BackHandler(z2, (Function0) objRememberedValue10, composerStartRestartGroup, i8, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox.6
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function3<ExposedDropdownMenuBoxScope, Composer, Integer, Unit> $content;
                final /* synthetic */ boolean $expanded;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function1<Boolean, Unit> $onExpandedChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass6(final boolean z22, final Function1<? super Boolean, Unit> function122, Modifier companion5, Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> function32, int i22, int i32) {
                    super(2);
                    z = z22;
                    function1 = function122;
                    modifier = companion5;
                    function3 = function32;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(z, function1, modifier, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    public static final LayoutCoordinates ExposedDropdownMenuBox$lambda$2(MutableState<LayoutCoordinates> mutableState) {
        return mutableState.getValue();
    }

    public static final int ExposedDropdownMenuBox$lambda$5(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final int ExposedDropdownMenuBox$lambda$8(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final void SoftKeyboardListener(final View view, Density density, final Function0<Unit> function0, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1319522472);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SoftKeyboardListener)P(2)240@10912L1420,240@10880L1452:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(view) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((48 & i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(density) ? 32 : 16)));
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1319522472, i3, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:237)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1935200244, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(view) | ((i3 + 896) - (896 | i3) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 = new ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(view, function0);
                        return new DisposableEffectResult() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1.dispose();
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.DisposableEffect(view, density, (Function1) objRememberedValue, composerStartRestartGroup, (-1) - (((-1) - i3) | ((-1) - 126)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt.SoftKeyboardListener.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ Density $density;
                final /* synthetic */ Function0<Unit> $onKeyboardVisibilityChange;
                final /* synthetic */ View $view;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(final View view2, Density density2, final Function0<Unit> function02, int i22) {
                    super(2);
                    view = view2;
                    density = density2;
                    function0 = function02;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    ExposedDropdownMenu_androidKt.SoftKeyboardListener(view, density, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: renamed from: expandable-Gq7TBQ4 */
    public static final Modifier m2110expandableGq7TBQ4(Modifier modifier, final boolean z2, final Function0<Unit> function0, final String str, final String str2, final String str3, final String str4, final SoftwareKeyboardController softwareKeyboardController) {
        return SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifier, function0, new ExposedDropdownMenu_androidKt$expandable$1(str, function0, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (MenuAnchorType.m2238equalsimpl0(str, MenuAnchorType.Companion.m2244getSecondaryEditableMg6Rgbw())) {
                    SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5933getButtono7Vup1c());
                    SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, z2 ? str2 : str3);
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str4);
                } else {
                    SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5935getDropdownListo7Vup1c());
                }
                final Function0<Unit> function02 = function0;
                final String str5 = str;
                final SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        SoftwareKeyboardController softwareKeyboardController3;
                        function02.invoke();
                        if (MenuAnchorType.m2238equalsimpl0(str5, MenuAnchorType.Companion.m2242getPrimaryEditableMg6Rgbw()) && (softwareKeyboardController3 = softwareKeyboardController2) != null) {
                            softwareKeyboardController3.show();
                        }
                        return true;
                    }
                }, 1, null);
            }
        }, 1, null);
    }

    public static final int calculateMaxHeight(Rect rect, Rect rect2, int i2) {
        int iRoundToInt;
        if (rect2 == null) {
            return 0;
        }
        float f2 = i2;
        float top = rect.getTop() + f2;
        float bottom = rect.getBottom() - f2;
        if (rect2.getTop() > rect.getBottom() || rect2.getBottom() < rect.getTop()) {
            iRoundToInt = MathKt.roundToInt(bottom - top);
        } else {
            iRoundToInt = MathKt.roundToInt(Math.max(rect2.getTop() - top, bottom - rect2.getBottom()));
        }
        return Math.max(iRoundToInt, 0);
    }

    public static final Rect getWindowBounds(View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return RectHelper_androidKt.toComposeRect(rect);
    }

    public static final Rect getAnchorBounds(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates == null ? Rect.Companion.getZero() : RectKt.m3977Recttz77jQw(LayoutCoordinatesKt.positionInWindow(layoutCoordinates), IntSizeKt.m6820toSizeozmzZPI(layoutCoordinates.mo5522getSizeYbymL2g()));
    }
}
