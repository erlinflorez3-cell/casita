package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import defpackage.Architecture;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
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
/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яz\u001d̉=!,i\bDJd|\u0004W\u00068é6B\u0015\"4\u0012\u000e\u0007njO0Le^.Zݷ2\u000f\u0002{<řc$\u007fOC٥\"}8\tWȞog|ϺbŏK\u000f\u001c\u0016\u0001jBI]xs\u0012\u00172HoG3coEʠhtD\u000e(݅*8\u0010\u0005\t\u001a0H\u0018v\u0011CS\f(0Hp@R\u0015M\u001b\u001a\u001aßF \u0017\u001edgT6`Ȃ\\Hǂ;\u0003\u0018An)eܞ\u000bM=Jb(%v(\u001e[F=5#'k\u00035U\f\\\t?\u007fA\u001d\u007f7/;O\u0004YFXF\u0014C1_\u000fmrTc3Vԃ\u0010'1W\u0014QV\u000e6\u0001\u0013{;F4\u0014\f'V9E\u001a\u0015\u0014>VzraMh\u001fnS\u0010\n(6а)\n99I!l`q=\u001fT]|\u0015\u0011.%\u0017mOk\u0003\u0013\u0011D)e\u0010|ASP=va\u001ajM|JpĊ\u00064\n>W\u00065\u000b!0\u001d+]\\I%1k0GryЛ\t`ngׂVHF*5\u001b֖.\t\u001ao\\3\u0013\u0002hT\u0007CAS\"T\u0015\u0016 \u0013Nu(x'%\u001ehg\u001fy{]l8@çjA_|{\u0014]Hn5;W\n,qc\u0007#mWИ\tblPc\u0012`k8$8N\u0011-\b\u0004TT\u001c\u0015B? 7bJ_+tĖG\u0011ٜZA+\b\u007f\\nɭ\rT[*\u0013k4tO\u0001~{!umxW.\u0015`P0qn;\u00194Y:\u007fD\u00053\r\u000fu\u0010G.LuR|\u0018\u0006U*'D\u001f\u07fcU/C\u001b?\u0005/2\u00106]L!o\u0002p\u0018'\t\n\u0012,Ky>vNjҔ0jpX_Z\u001d1\u0007`x).e\u0010}qH\u0011F\u0012d9`nx\u0001\u0014qg^:\r\u0005M15\u0012\u007f1C5ԩG1#$\b\u001a5$q_ouTzr\u00116t\u0014\u0003Zu݁sbWqщ?8OaECѐ(l\u0011b`}\u0006)Z\tb\u0014[Ho\u0007!ZFp#/,\u000bMԴ\u000f\tii_+o,;V_X\u0016s\u0002\"\u0002[%?q\u001aܒoߗO\u0003"}, d2 = {"\u000fmX:T;>Rv\t\u0004m,\u0006\u0018", "", "!", "B`a4X;,b\u0015\u000ez", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "BqP;f0MW#\bhi,z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7ls8VR;tC\r\"djG\u000br0X\u007f\u0015EVY,2", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006T/>h})F\\#*VQ<uA&j", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1n]AX5M/ \u0003|g4|\u0012>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", ":`Q2_", "", "1n]AX5M9\u0019\u0013", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7ls8VR;tC\f\u0013rl9\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\r#u3\"\u0016laF\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0015W\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArxJ#;\u0001KCNj*m\u001b5\u0004a6K ]x\u0015$j\u001a\u001c\u0019\tW\u001at(`mqV ~AmC~c\u0010F\u007f^:\u0004+)T\nArBar:x7\r\u007f\u007f\u001dj\u000fZn\u001cG(}&4&B7/4K\u0017ITq?MN\u0017f.e\u0012\u00171\u000b\u0018\u0015ndpR\u0013\u0006p`Y?ij\u000bEROKYx$+N~\f9\u0004\u001d\u0014\u00112mr\u001f'~\u0018q", "!hi2G9:\\'\u007f\u0005k4", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d)JYl-3v$/WPCA", "1kX=", "", "Ahi245B[\u0015\u000e~h5j\u0014/c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "7mXA\\(EA\u001d\u0014z", "B`a4X;,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W65\f\tZE${\u001a\u001e%\u0012;P\u0006D2\u0006\u001d\u001eW6zy@e\u0014Q\u0003#?\"9qDhc\u0004P\r\u001bI&m\u000bl'`9Mm\u0012{!&r^.S\fWZNY}ipO\u0019\u0004Gy%seULs^\u0006y8'\u0015|\b\u001b0gx5};M\u0015:?b\u0014Oq!\n4_\u001b6kH+/\u007fA$G\u0015d\u0006u<\u001dl)j\u0016WCE:\u0017timQ]\\D\u0013d4ni\u00056eO<Sw 1T~\fh\n\u001e\u0018\u000b,m/'M#_\u000b(pQwCtFs", "BnV2g/>`\u000b\u0003\na", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u000fDi\u001f<QR?u=s", "3wXA", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V89hl-3v$2\\GEt\n", "Ehc5", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimatedContentKt {

    /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2 */
    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2<S> extends Lambda implements Function1<S, S> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final S invoke(S s2) {
            return s2;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3 */
    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function4<AnimatedContentScope, S, Composer, Integer, Unit> $content;
        final /* synthetic */ Alignment $contentAlignment;
        final /* synthetic */ Function1<S, Object> $contentKey;
        final /* synthetic */ String $label;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Function1<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(S s2, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, String str, Function1<? super S, ? extends Object> function12, Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, int i2, int i3) {
            super(2);
            s = s2;
            modifier = modifier;
            function1 = function1;
            alignment = alignment;
            str = str;
            function1 = function12;
            function4 = function4;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedContentKt.AnimatedContent(s, modifier, function1, alignment, str, function1, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5 */
    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass5<S> extends Lambda implements Function1<S, S> {
        public static final AnonymousClass5 INSTANCE = ;

        AnonymousClass5() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final S invoke(S s2) {
            return s2;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9 */
    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass9 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function4<AnimatedContentScope, S, Composer, Integer, Unit> $content;
        final /* synthetic */ Alignment $contentAlignment;
        final /* synthetic */ Function1<S, Object> $contentKey;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Transition<S> $this_AnimatedContent;
        final /* synthetic */ Function1<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass9(Transition<S> transition, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, Function1<? super S, ? extends Object> function12, Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, int i2, int i3) {
            super(2);
            transition = transition;
            modifier = modifier;
            function1 = function1;
            alignment = alignment;
            function1 = function12;
            function4 = function4;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedContentKt.AnimatedContent(transition, modifier, function1, alignment, function1, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1 */
    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1<S> extends Lambda implements Function1<AnimatedContentTransitionScope<S>, ContentTransform> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final ContentTransform invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m411scaleInL8ZKhE$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    public static final <S> void AnimatedContent(S s2, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, String str, Function1<? super S, ? extends Object> function12, Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, Composer composer, int i2, int i3) {
        int i4;
        AnonymousClass2 anonymousClass2 = function12;
        String str2 = str;
        Alignment topStart = alignment;
        AnonymousClass1 anonymousClass1 = function1;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(2132720749);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AnimatedContent)P(5,4,6,1,3,2)141@7507L58,142@7581L136:AnimatedContent.kt#xbi5r1");
        if ((i3 & 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i5 = (i2 & 8) == 0 ? composerStartRestartGroup.changed(s2) : composerStartRestartGroup.changedInstance(s2) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = (i3 + 2) - (i3 | 2);
        if (i6 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 & 48) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (i3 + 4) - (i3 | 4);
        if (i8 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(anonymousClass1) ? 256 : 128)));
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i10 = composerStartRestartGroup.changed(topStart) ? 2048 : 1024;
            i4 = (i4 + i10) - (i4 & i10);
        }
        int i11 = (i3 + 16) - (i3 | 16);
        if (i11 != 0) {
            i4 |= 24576;
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(str2) ? 16384 : 8192)));
        }
        int i12 = (i3 + 32) - (i3 | 32);
        if (i12 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((196608 & i2) == 0) {
            int i13 = composerStartRestartGroup.changedInstance(anonymousClass2) ? 131072 : 65536;
            i4 = (i4 + i13) - (i4 & i13);
        }
        if ((i3 & 64) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function4) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 599187)) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (i8 != 0) {
                anonymousClass1 = AnonymousClass1.INSTANCE;
            }
            if (i9 != 0) {
                topStart = Alignment.Companion.getTopStart();
            }
            if (i11 != 0) {
                str2 = "AnimatedContent";
            }
            if (i12 != 0) {
                anonymousClass2 = AnonymousClass2.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2132720749, i4, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
            }
            int i14 = i4 & 14;
            int i15 = (-1) - (((-1) - (i4 >> 9)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            Transition transitionUpdateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(s2, str2, composerStartRestartGroup, (i14 + i15) - (i14 & i15), 0);
            int i16 = (i4 + 8176) - (8176 | i4);
            int i17 = i4 >> 3;
            AnimatedContent(transitionUpdateTransition, companion, anonymousClass1, topStart, anonymousClass2, function4, composerStartRestartGroup, (-1) - (((-1) - (i16 | ((-1) - (((-1) - 57344) | ((-1) - i17))))) & ((-1) - ((i17 + 458752) - (i17 | 458752)))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function13 = anonymousClass1;
            Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function4<AnimatedContentScope, S, Composer, Integer, Unit> $content;
                final /* synthetic */ Alignment $contentAlignment;
                final /* synthetic */ Function1<S, Object> $contentKey;
                final /* synthetic */ String $label;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ S $targetState;
                final /* synthetic */ Function1<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(S s22, Modifier modifier22, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function132, Alignment topStart2, String str22, Function1<? super S, ? extends Object> anonymousClass22, Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function42, int i22, int i32) {
                    super(2);
                    s = s22;
                    modifier = modifier22;
                    function1 = function132;
                    alignment = topStart2;
                    str = str22;
                    function1 = anonymousClass22;
                    function4 = function42;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    AnimatedContentKt.AnimatedContent(s, modifier, function1, alignment, str, function1, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentKt$SizeTransform$1 */
    /* JADX INFO: compiled from: AnimatedContent.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bDZc|\u0004G\b>éFH\u000f$<\u0012&\u0007\u0015ii4Rf`.\u0001SZ\u0013y}L$\n$8KтY\u001c\u0004%\u0017S"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eBz\u001a7O1Fk2s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzKo", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzLo", "7me<^,\u0006B\u0019\u0007e+=h", "uI9u?(GR&\t~]?F\u00079m\u000b2\n@J\u0013 Kw\nKz/>#{*Dm_\u001cXP?t6\f h_\u000f"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C03741 extends Lambda implements Function2<IntSize, IntSize, SpringSpec<IntSize>> {
        public static final C03741 INSTANCE = ;

        C03741() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
            return m374invokeTemP2vQ(intSize.m6812unboximpl(), intSize2.m6812unboximpl());
        }

        /* JADX INFO: renamed from: invoke-TemP2vQ */
        public final SpringSpec<IntSize> m374invokeTemP2vQ(long j2, long j3) {
            return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6800boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z2, Function2 function2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            z2 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function2 = C03741.INSTANCE;
        }
        return SizeTransform(z2, function2);
    }

    public static final SizeTransform SizeTransform(boolean z2, Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> function2) {
        return new SizeTransformImpl(z2, function2);
    }

    public static final ContentTransform togetherWith(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    @Deprecated(message = "\fT\u0002>\n4\u001blf\u0007\r\td\u001a>BnM\u0017:\u000e|\u0015a\u0005\u0014\u0006sb|kK\u0001Ux6_]vLO2<I \u001f\f\u0002#k\b=jCBQ\u001eL\"E({8A\u0007\u001b/K+R\u0003\u0010e'\u001arQ$G", replaceWith = @ReplaceWith(expression = "togetherWith(exit)", imports = {}))
    @InterfaceC1492Gx
    public static final ContentTransform with(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4 */
    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4<S> extends Lambda implements Function1<AnimatedContentTransitionScope<S>, ContentTransform> {
        public static final AnonymousClass4 INSTANCE = ;

        AnonymousClass4() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final ContentTransform invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m411scaleInL8ZKhE$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    public static final <S> void AnimatedContent(Transition<S> transition, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, Function1<? super S, ? extends Object> function12, final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Modifier.Companion companion = modifier;
        AnonymousClass5 anonymousClass5 = function12;
        Alignment topStart = alignment;
        AnonymousClass4 anonymousClass4 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-114689412);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AnimatedContent)P(3,4,1,2)714@34537L7,715@34565L106,719@34759L51,720@34832L69,808@39387L58,809@39479L45,819@39798L52,810@39529L327:AnimatedContent.kt#xbi5r1");
        final Transition<S> transition2 = transition;
        if ((-1) - (((-1) - i3) | ((-1) - Integer.MIN_VALUE)) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changed(transition2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = (i3 + 1) - (i3 | 1);
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(anonymousClass4) ? 256 : 128)));
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 |= composerStartRestartGroup.changed(topStart) ? 2048 : 1024;
        }
        int i10 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i10 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(anonymousClass5) ? 16384 : 8192)));
        }
        if ((i3 & 16) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
        }
        if ((74899 + i4) - (74899 | i4) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (i8 != 0) {
                anonymousClass4 = AnonymousClass4.INSTANCE;
            }
            if (i9 != 0) {
                topStart = Alignment.Companion.getTopStart();
            }
            if (i10 != 0) {
                anonymousClass5 = AnonymousClass5.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-114689412, i4, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:713)");
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) objConsume;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801903883, "CC(remember):AnimatedContent.kt#9igjgp");
            int i11 = (-1) - (((-1) - i4) | ((-1) - 14));
            boolean z2 = i11 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new AnimatedContentTransitionScopeImpl(transition2, topStart, layoutDirection);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801897730, "CC(remember):AnimatedContent.kt#9igjgp");
            boolean z3 = i11 == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateListOf(transition2.getCurrentState());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801895376, "CC(remember):AnimatedContent.kt#9igjgp");
            boolean z4 = i11 == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = ScatterMapKt.mutableScatterMapOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableScatterMap mutableScatterMap = (MutableScatterMap) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (!snapshotStateList.contains(transition2.getCurrentState())) {
                snapshotStateList.clear();
                snapshotStateList.add(transition2.getCurrentState());
            }
            if (Intrinsics.areEqual(transition2.getCurrentState(), transition2.getTargetState())) {
                if (snapshotStateList.size() != 1 || !Intrinsics.areEqual(snapshotStateList.get(0), transition2.getCurrentState())) {
                    snapshotStateList.clear();
                    snapshotStateList.add(transition2.getCurrentState());
                }
                if (mutableScatterMap.getSize() != 1 || mutableScatterMap.containsKey(transition2.getCurrentState())) {
                    mutableScatterMap.clear();
                }
                animatedContentTransitionScopeImpl.setContentAlignment(topStart);
                animatedContentTransitionScopeImpl.setLayoutDirection$animation_release(layoutDirection);
            }
            if (!Intrinsics.areEqual(transition2.getCurrentState(), transition2.getTargetState()) && !snapshotStateList.contains(transition2.getTargetState())) {
                Iterator<T> it = snapshotStateList.iterator();
                int i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                        i12 = -1;
                        break;
                    } else {
                        if (Intrinsics.areEqual(anonymousClass5.invoke((Object) it.next()), anonymousClass5.invoke(transition2.getTargetState()))) {
                            i5 = -1;
                            break;
                        }
                        i12++;
                    }
                }
                if (i12 == i5) {
                    snapshotStateList.add(transition2.getTargetState());
                } else {
                    snapshotStateList.set(i12, transition2.getTargetState());
                }
            }
            if (mutableScatterMap.containsKey(transition2.getTargetState()) && mutableScatterMap.containsKey(transition2.getCurrentState())) {
                composerStartRestartGroup.startReplaceGroup(915535767);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(912931457);
                ComposerKt.sourceInformation(composerStartRestartGroup, "*756@36778L2565");
                mutableScatterMap.clear();
                SnapshotStateList snapshotStateList2 = snapshotStateList;
                int size = snapshotStateList2.size();
                int i13 = 0;
                while (i13 < size) {
                    final T t2 = snapshotStateList2.get(i13);
                    transition2 = transition2;
                    final Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function13 = anonymousClass4;
                    mutableScatterMap.set(t2, ComposableLambdaKt.rememberComposableLambda(885640742, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
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

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        public final void invoke(Composer composer2, int i14) {
                            ComposerKt.sourceInformation(composer2, "C757@36814L38,761@37028L323,768@37384L125,779@37953L328,775@37761L25,786@38417L233,791@38669L660,773@37692L1637:AnimatedContent.kt#xbi5r1");
                            if ((i14 + 3) - (3 | i14) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(885640742, i14, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:757)");
                            }
                            ComposerKt.sourceInformationMarkerStart(composer2, 1908224079, "CC(remember):AnimatedContent.kt#9igjgp");
                            Function1<AnimatedContentTransitionScope<S>, ContentTransform> function14 = function13;
                            Object obj = animatedContentTransitionScopeImpl;
                            ContentTransform contentTransformRememberedValue = composer2.rememberedValue();
                            if (contentTransformRememberedValue == Composer.Companion.getEmpty()) {
                                contentTransformRememberedValue = function14.invoke(obj);
                                composer2.updateRememberedValue(contentTransformRememberedValue);
                            }
                            final ContentTransform contentTransform = (ContentTransform) contentTransformRememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            boolean zAreEqual = Intrinsics.areEqual(transition2.getSegment().getTargetState(), t2);
                            ComposerKt.sourceInformationMarkerStart(composer2, 1908231212, "CC(remember):AnimatedContent.kt#9igjgp");
                            boolean zChanged = composer2.changed(zAreEqual);
                            Transition<S> transition3 = transition2;
                            S s2 = t2;
                            Function1<AnimatedContentTransitionScope<S>, ContentTransform> function15 = function13;
                            Object obj2 = animatedContentTransitionScopeImpl;
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue4 == Composer.Companion.getEmpty()) {
                                if (Intrinsics.areEqual(transition3.getSegment().getTargetState(), s2)) {
                                    objRememberedValue4 = ExitTransition.Companion.getNone();
                                } else {
                                    objRememberedValue4 = function15.invoke(obj2).getInitialContentExit();
                                }
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            final ExitTransition exitTransition = (ExitTransition) objRememberedValue4;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerStart(composer2, 1908242406, "CC(remember):AnimatedContent.kt#9igjgp");
                            S s3 = t2;
                            Transition<S> transition4 = transition2;
                            Object objRememberedValue5 = composer2.rememberedValue();
                            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                                objRememberedValue5 = new AnimatedContentTransitionScopeImpl.ChildData(Intrinsics.areEqual(s3, transition4.getTargetState()));
                                composer2.updateRememberedValue(objRememberedValue5);
                            }
                            AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) objRememberedValue5;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
                            Modifier.Companion companion2 = Modifier.Companion;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1908260817, "CC(remember):AnimatedContent.kt#9igjgp");
                            boolean zChangedInstance = composer2.changedInstance(contentTransform);
                            Object objRememberedValue6 = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue6 == Composer.Companion.getEmpty()) {
                                objRememberedValue6 = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                        return m373invoke3p2s80s(measureScope, measurable, constraints.m6597unboximpl());
                                    }

                                    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                                    public final MeasureResult m373invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                                        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(j2);
                                        int width = placeableMo5514measureBRTryo0.getWidth();
                                        int height = placeableMo5514measureBRTryo0.getHeight();
                                        final ContentTransform contentTransform2 = contentTransform;
                                        return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
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
                                                placementScope.place(placeableMo5514measureBRTryo0, 0, 0, contentTransform2.getTargetContentZIndex());
                                            }
                                        }, 4, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue6);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Modifier modifierLayout = LayoutModifierKt.layout(companion2, (Function3) objRememberedValue6);
                            childData.setTarget(Intrinsics.areEqual(t2, transition2.getTargetState()));
                            Modifier modifierThen = modifierLayout.then(childData);
                            Transition<S> transition5 = transition2;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1908254370, "CC(remember):AnimatedContent.kt#9igjgp");
                            boolean zChangedInstance2 = composer2.changedInstance(t2);
                            final S s4 = t2;
                            Object objRememberedValue7 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                                objRememberedValue7 = (Function1) new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Boolean invoke(S s5) {
                                        return Boolean.valueOf(Intrinsics.areEqual(s5, s4));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue7);
                            }
                            Function1 function16 = (Function1) objRememberedValue7;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerStart(composer2, 1908275570, "CC(remember):AnimatedContent.kt#9igjgp");
                            boolean zChanged2 = composer2.changed(exitTransition);
                            Object objRememberedValue8 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                                objRememberedValue8 = (Function2) new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                        return Boolean.valueOf(enterExitState == EnterExitState.PostExit && enterExitState2 == EnterExitState.PostExit && !exitTransition.getData$animation_release().getHold());
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue8);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            final SnapshotStateList<S> snapshotStateList3 = snapshotStateList;
                            final S s5 = t2;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            final Function4<AnimatedContentScope, S, Composer, Integer, Unit> function42 = function4;
                            AnimatedVisibilityKt.AnimatedEnterExitImpl(transition5, function16, modifierThen, targetContentEnter, exitTransition, (Function2) objRememberedValue8, null, ComposableLambdaKt.rememberComposableLambda(-616195562, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                    invoke(animatedVisibilityScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i15) {
                                    ComposerKt.sourceInformation(composer3, "C793@38802L230,793@38779L253,*801@39194L43,802@39265L24:AnimatedContent.kt#xbi5r1");
                                    if ((6 & i15) == 0) {
                                        int i16 = (8 & i15) == 0 ? composer3.changed(animatedVisibilityScope) : composer3.changedInstance(animatedVisibilityScope) ? 4 : 2;
                                        i15 = (i15 + i16) - (i15 & i16);
                                    }
                                    if ((i15 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-616195562, i15, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:793)");
                                    }
                                    ComposerKt.sourceInformationMarkerStart(composer3, 641996302, "CC(remember):AnimatedContent.kt#9igjgp");
                                    boolean zChangedInstance3 = ((-1) - (((-1) - (composer3.changed(snapshotStateList3) ? 1 : 0)) & ((-1) - (composer3.changedInstance(s5) ? 1 : 0))) == 1) | composer3.changedInstance(animatedContentTransitionScopeImpl2);
                                    final SnapshotStateList<S> snapshotStateList4 = snapshotStateList3;
                                    final S s6 = s5;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
                                    Object objRememberedValue9 = composer3.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                                        objRememberedValue9 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                final SnapshotStateList<S> snapshotStateList5 = snapshotStateList4;
                                                final S s7 = s6;
                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl3;
                                                return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        snapshotStateList5.remove(s7);
                                                        animatedContentTransitionScopeImpl4.getTargetSizeMap$animation_release().remove(s7);
                                                    }
                                                };
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue9);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    EffectsKt.DisposableEffect(animatedVisibilityScope, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue9, composer3, i15 & 14);
                                    MutableScatterMap targetSizeMap$animation_release = animatedContentTransitionScopeImpl2.getTargetSizeMap$animation_release();
                                    S s7 = s5;
                                    Intrinsics.checkNotNull(animatedVisibilityScope, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                    targetSizeMap$animation_release.set(s7, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize$animation_release());
                                    ComposerKt.sourceInformationMarkerStart(composer3, 642008659, "CC(remember):AnimatedContent.kt#9igjgp");
                                    Object objRememberedValue10 = composer3.rememberedValue();
                                    if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                                        objRememberedValue10 = new AnimatedContentScopeImpl(animatedVisibilityScope);
                                        composer3.updateRememberedValue(objRememberedValue10);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    function42.invoke((AnimatedContentScopeImpl) objRememberedValue10, s5, composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 12582912, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54));
                    i13++;
                    anonymousClass4 = anonymousClass4;
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            Transition.Segment<S> segment = transition2.getSegment();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801749627, "CC(remember):AnimatedContent.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(segment) | composerStartRestartGroup.changed(animatedContentTransitionScopeImpl);
            ContentTransform contentTransformRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || contentTransformRememberedValue == Composer.Companion.getEmpty()) {
                contentTransformRememberedValue = anonymousClass4.invoke(animatedContentTransitionScopeImpl);
                composerStartRestartGroup.updateRememberedValue(contentTransformRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierThen = companion.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((ContentTransform) contentTransformRememberedValue, composerStartRestartGroup, 0));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801736481, "CC(remember):AnimatedContent.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
            Updater.m3678setimpl(composerM3671constructorimpl, animatedContentMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1023567688, "C:AnimatedContent.kt#xbi5r1");
            composerStartRestartGroup.startReplaceGroup(-1491001814);
            ComposerKt.sourceInformation(composerStartRestartGroup, "");
            SnapshotStateList snapshotStateList3 = snapshotStateList;
            int size2 = snapshotStateList3.size();
            for (int i14 = 0; i14 < size2; i14++) {
                Architecture architecture = (Object) snapshotStateList3.get(i14);
                composerStartRestartGroup.startMovableGroup(1908315325, anonymousClass5.invoke(architecture));
                ComposerKt.sourceInformation(composerStartRestartGroup, "");
                Function2 function2 = (Function2) mutableScatterMap.get(architecture);
                if (function2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-971711888);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1908317105);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "815@39722L8");
                    function2.invoke(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endMovableGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.9
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function4<AnimatedContentScope, S, Composer, Integer, Unit> $content;
                final /* synthetic */ Alignment $contentAlignment;
                final /* synthetic */ Function1<S, Object> $contentKey;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Transition<S> $this_AnimatedContent;
                final /* synthetic */ Function1<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass9(final Transition<S> transition22, Modifier companion2, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> anonymousClass42, Alignment topStart2, Function1<? super S, ? extends Object> anonymousClass52, final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function42, int i22, int i32) {
                    super(2);
                    transition = transition22;
                    modifier = companion2;
                    function1 = anonymousClass42;
                    alignment = topStart2;
                    function1 = anonymousClass52;
                    function4 = function42;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    AnimatedContentKt.AnimatedContent(transition, modifier, function1, alignment, function1, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }
}
