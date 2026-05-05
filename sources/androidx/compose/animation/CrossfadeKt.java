package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: Crossfade.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!,i\bDJd|\u0004W\u00068é6B\u0015\"4\u0012\u0006\fnʑA0ZeP.hS2\u000fq{<$i0yّCU0}*ޛWN}gvϺb\u000bQƤ\u000e\u0016~kD\u0016cތu\u0012=1bqE\u074c[om=nuN\u0005f2R>\u007f\u0005\u000f\u001cBH>y+OQ\f 4XvJT\u001dM3 @\u000bn5\u000f%tx^8Xl$:?%\u0013ipMUg݁\u0001M\u0013O\u001b,˼za,5X\u000eCՖ=S1\u0006r]EšMqm\tv(?+\u0010s\b<^\u007f\"\u0017CO;`#2b\u0005_d$-;QsK~\u0014V|+\u0002\u0013<\u0012\u0019\u001e'v:]/t\u000f&D\u0005tc@\u0017\u0002nD\u0010z\u00105E-ő7+?$-Vň?\u0019\\D\u0014ˣ\f,ŀ\u0019nOZt\u0010fٽ)T WASP=\u000fN8gms\npp\u0004B\u0004^J0;\u0002\u0011<\u001b==k;3!\u001a\bvI\u0018\u001a\u000b`vb\u0002oXQ2}\\7Ҋ\r\u0016`Tt\u000bqadZ2\u0017s\u001dd\u000b\u000e\n)\u001f\u000b\nj)U4\\V\u0001\nz^m\u0019k/Ϭ;ct{\u001e]?oC7Wi6bbx$?ja3`ڋFS\u0012c#-ϒ6Hx#ȗ\u007fX»\u0010!@T\n\u001cb2Q\u001bbéV\u0003t՞ˋ|"}, d2 = {"\u0011q^@f-:R\u0019", "", "\"", "B`a4X;,b\u0015\u000ez", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\r#u3\"\u0016laF\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018'\u0016\ta=3rN@h\u00066V\u0002\u0005I\u0005\u0015\u001a\u001d5FyF^\fV}\u001f~/4hD/F\u007fQPLf3.\u0011p%&;J-\u0012\u0001\u001d%q^wj\f\\\u000f\u0002V\u0004p5\u001d\u007fvA#Kw_EX9SF|2)Y{A\u001fBa\u0004/|-M\u00124>o\u000fYg%\u0014B\\X\u001d", ":`Q2_", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\r#u3\"\u0016laF\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018'\u0016\ta=3rN@h\u00066V\u0002\u0005I\u0005\u0015\u001a\u001d5FyF^\fV}\u001f~/4hD/F~CRA,1`\u0015afJIG(\u001dsn\u0002nZ=\u0011\u007f\\Zwc\u00021hW\"xG(Hvi\u0010&\u007f^:\u0004+)TIMx.as8~1\u0003Gs4n\rVq&>(\u0006%5kE/&\u007f\u001a\u001dGVm\u0004lKcL\u0003%x", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "1n]AX5M9\u0019\u0013", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W65\f\tZE${\u001a\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYC\u0003\u0019}=8lPb)wQNE,\u000bh\u0015c,\\\u0016C(\u001cm(\u001frY\u001c\u0015{QfYX\u0004vnK\"D=5F7\\VNmd@~0-\u0015\\\b\u001b0gx5}xY\u001b0@s\fOpaCo\u0001^-lJ%5:F\u001cM\u0015D\u0006u<\u001dl)jUcI1:\u0018rogG\"P[!c@km\u0001\u0001_\u0016GXs\u001d'\u0010\\Lc\u0005\u001f\u0017\u00071CI-\u0007\f", "/mX:T;B]\"x\b^3|\u0005=e", "/k_5T"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CrossfadeKt {

    /* JADX INFO: renamed from: androidx.compose.animation.CrossfadeKt$Crossfade$1 */
    /* JADX INFO: compiled from: Crossfade.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
        final /* synthetic */ Function3<T, Composer, Integer, Unit> $content;
        final /* synthetic */ String $label;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ T $targetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(T t2, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, String str, Function3<? super T, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            t = t2;
            modifier = modifier;
            finiteAnimationSpec = finiteAnimationSpec;
            str = str;
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
            CrossfadeKt.Crossfade(t, modifier, finiteAnimationSpec, str, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.CrossfadeKt$Crossfade$2 */
    /* JADX INFO: compiled from: Crossfade.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
        final /* synthetic */ Function3<T, Composer, Integer, Unit> $content;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ T $targetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(T t2, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, Function3<? super T, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            t = t2;
            modifier = modifier;
            finiteAnimationSpec = finiteAnimationSpec;
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
            CrossfadeKt.Crossfade(t, modifier, finiteAnimationSpec, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.CrossfadeKt$Crossfade$3 */
    /* JADX INFO: compiled from: Crossfade.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3<T> extends Lambda implements Function1<T, T> {
        public static final AnonymousClass3 INSTANCE = ;

        AnonymousClass3() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t2) {
            return t2;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.CrossfadeKt$Crossfade$7 */
    /* JADX INFO: compiled from: Crossfade.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass7 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
        final /* synthetic */ Function3<T, Composer, Integer, Unit> $content;
        final /* synthetic */ Function1<T, Object> $contentKey;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Transition<T> $this_Crossfade;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass7(Transition<T> transition, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, Function1<? super T, ? extends Object> function1, Function3<? super T, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            transition = transition;
            modifier = modifier;
            finiteAnimationSpec = finiteAnimationSpec;
            function1 = function1;
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
            Transition<T> transition = transition;
            Modifier modifier = modifier;
            FiniteAnimationSpec<Float> finiteAnimationSpec = finiteAnimationSpec;
            Function1<T, Object> function1 = function1;
            Function3<T, Composer, Integer, Unit> function3 = function3;
            int i3 = i;
            CrossfadeKt.Crossfade(transition, modifier, finiteAnimationSpec, function1, function3, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    public static final <T> void Crossfade(T t2, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, String str, Function3<? super T, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        int i4;
        String str2 = str;
        TweenSpec tweenSpecTween$default = finiteAnimationSpec;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-310686752);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Crossfade)P(4,3!1,2)56@2327L36,57@2379L53:Crossfade.kt#xbi5r1");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (-1) - (((-1) - ((i2 & 8) == 0 ? composerStartRestartGroup.changed(t2) : composerStartRestartGroup.changedInstance(t2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i6 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(tweenSpecTween$default) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(str2) ? 2048 : 1024)));
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            i4 |= 24576;
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((i4 + 9363) - (9363 | i4) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (i6 != 0) {
                tweenSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            if (i7 != 0) {
                str2 = "Crossfade";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-310686752, i4, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
            }
            int i8 = (i4 + 14) - (14 | i4);
            int i9 = (i4 >> 6) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t2, str2, composerStartRestartGroup, (i8 + i9) - (i8 & i9), 0), companion, tweenSpecTween$default, (Function1) null, function3, composerStartRestartGroup, (-1) - (((-1) - i4) | ((-1) - 58352)), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
                final /* synthetic */ Function3<T, Composer, Integer, Unit> $content;
                final /* synthetic */ String $label;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ T $targetState;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(T t22, Modifier companion2, FiniteAnimationSpec<Float> tweenSpecTween$default2, String str22, Function3<? super T, ? super Composer, ? super Integer, Unit> function32, int i22, int i32) {
                    super(2);
                    t = t22;
                    modifier = companion2;
                    finiteAnimationSpec = tweenSpecTween$default2;
                    str = str22;
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
                    CrossfadeKt.Crossfade(t, modifier, finiteAnimationSpec, str, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0006X\u000bH\u0005z\u0016[]\u0007\tj9T:]s\f\u0011(\u0018(\r\u0012\u0005K\u0006*Zu&kt\ftC_]u>Z#Ey\u0013ZP~&&")
    @InterfaceC1492Gx
    public static final /* synthetic */ void Crossfade(Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function3 function3, Composer composer, int i2, int i3) {
        int i4;
        TweenSpec tweenSpecTween$default = finiteAnimationSpec;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(523603005);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Crossfade)P(3,2)72@2790L29,73@2835L53:Crossfade.kt#xbi5r1");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? composerStartRestartGroup.changed(obj) : composerStartRestartGroup.changedInstance(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(tweenSpecTween$default) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            i4 |= 3072;
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 1171)) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (i6 != 0) {
                tweenSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523603005, i4, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:71)");
            }
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(obj, (String) null, composerStartRestartGroup, (-1) - (((-1) - i4) | ((-1) - 14)), 2), companion, (FiniteAnimationSpec<Float>) tweenSpecTween$default, (Function1) null, function3, composerStartRestartGroup, (-1) - (((-1) - ((i4 + 1008) - (1008 | i4))) & ((-1) - ((-1) - (((-1) - (i4 << 3)) | ((-1) - 57344))))), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
                final /* synthetic */ Function3<T, Composer, Integer, Unit> $content;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ T $targetState;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(T obj2, Modifier companion2, FiniteAnimationSpec<Float> tweenSpecTween$default2, Function3<? super T, ? super Composer, ? super Integer, Unit> function32, int i22, int i32) {
                    super(2);
                    t = obj2;
                    modifier = companion2;
                    finiteAnimationSpec = tweenSpecTween$default2;
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
                    CrossfadeKt.Crossfade(t, modifier, finiteAnimationSpec, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    public static final <T> void Crossfade(final Transition<T> transition, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, Function1<? super T, ? extends Object> function1, Function3<? super T, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        AnonymousClass3 anonymousClass3 = function1;
        TweenSpec tweenSpecTween$default = finiteAnimationSpec;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(679005231);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Crossfade)P(3!1,2)104@4422L64,105@4508L61,137@5785L159:Crossfade.kt#xbi5r1");
        if ((i3 - Integer.MIN_VALUE) - (i3 | Integer.MIN_VALUE) != 0) {
            i4 = i2 | 6;
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(transition) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 1));
        if (i6 != 0) {
            i4 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (i3 + 2) - (i3 | 2);
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(tweenSpecTween$default) ? 256 : 128;
            i4 = (i4 + i9) - (i4 & i9);
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 |= 3072;
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i11 = composerStartRestartGroup.changedInstance(anonymousClass3) ? 2048 : 1024;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((i3 & 8) != 0) {
            i4 |= 24576;
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((i4 + 9363) - (9363 | i4) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (i8 != 0) {
                tweenSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            if (i10 != 0) {
                anonymousClass3 = AnonymousClass3.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(679005231, i4, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1274683025, "CC(remember):Crossfade.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                SnapshotStateList snapshotStateListMutableStateListOf = SnapshotStateKt.mutableStateListOf();
                snapshotStateListMutableStateListOf.add(transition.getCurrentState());
                composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf);
                obj = snapshotStateListMutableStateListOf;
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1274685774, "CC(remember):Crossfade.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = ScatterMapKt.mutableScatterMapOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableScatterMap mutableScatterMap = (MutableScatterMap) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                composerStartRestartGroup.startReplaceGroup(860660313);
                ComposerKt.sourceInformation(composerStartRestartGroup, "");
                if (snapshotStateList.size() == 1 && Intrinsics.areEqual(snapshotStateList.get(0), transition.getTargetState())) {
                    composerStartRestartGroup.startReplaceGroup(860984945);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(860794667);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "110@4883L21");
                    SnapshotStateList snapshotStateList2 = snapshotStateList;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1274697734, "CC(remember):Crossfade.kt#9igjgp");
                    boolean z2 = (i4 + 14) - (i4 | 14) == 4;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = (Function1) new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(T t2) {
                                return Boolean.valueOf(!Intrinsics.areEqual(t2, transition.getTargetState()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    CollectionsKt.removeAll((List) snapshotStateList2, (Function1) objRememberedValue3);
                    mutableScatterMap.clear();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(860990897);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (mutableScatterMap.contains(transition.getTargetState())) {
                composerStartRestartGroup.startReplaceGroup(861812273);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(861052122);
                ComposerKt.sourceInformation(composerStartRestartGroup, "*126@5458L305");
                SnapshotStateList snapshotStateList3 = snapshotStateList;
                Iterator<T> it = snapshotStateList3.iterator();
                int i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                        i12 = -1;
                        break;
                    } else {
                        if (Intrinsics.areEqual(anonymousClass3.invoke(it.next()), anonymousClass3.invoke(transition.getTargetState()))) {
                            i5 = -1;
                            break;
                        }
                        i12++;
                    }
                }
                if (i12 == i5) {
                    snapshotStateList.add(transition.getTargetState());
                } else {
                    snapshotStateList.set(i12, transition.getTargetState());
                }
                mutableScatterMap.clear();
                int size = snapshotStateList3.size();
                for (int i13 = 0; i13 < size; i13++) {
                    T t2 = snapshotStateList3.get(i13);
                    mutableScatterMap.set(t2, ComposableLambdaKt.rememberComposableLambda(-1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, tweenSpecTween$default, t2, function3), composerStartRestartGroup, 54));
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1517004430, "C:Crossfade.kt#xbi5r1");
            composerStartRestartGroup.startReplaceGroup(-187482432);
            ComposerKt.sourceInformation(composerStartRestartGroup, "");
            SnapshotStateList snapshotStateList4 = snapshotStateList;
            int size2 = snapshotStateList4.size();
            for (int i14 = 0; i14 < size2; i14++) {
                T t3 = snapshotStateList4.get(i14);
                composerStartRestartGroup.startMovableGroup(-1081873445, anonymousClass3.invoke(t3));
                ComposerKt.sourceInformation(composerStartRestartGroup, "");
                Function2 function2 = (Function2) mutableScatterMap.get(t3);
                if (function2 == null) {
                    composerStartRestartGroup.startReplaceGroup(821713034);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1081871785);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "140@5906L8");
                    function2.invoke(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endMovableGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.7
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
                final /* synthetic */ Function3<T, Composer, Integer, Unit> $content;
                final /* synthetic */ Function1<T, Object> $contentKey;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Transition<T> $this_Crossfade;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass7(final Transition<T> transition2, Modifier companion2, FiniteAnimationSpec<Float> tweenSpecTween$default2, Function1<? super T, ? extends Object> anonymousClass32, Function3<? super T, ? super Composer, ? super Integer, Unit> function32, int i22, int i32) {
                    super(2);
                    transition = transition2;
                    modifier = companion2;
                    finiteAnimationSpec = tweenSpecTween$default2;
                    function1 = anonymousClass32;
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
                    Transition<T> transition2 = transition;
                    Modifier modifier2 = modifier;
                    FiniteAnimationSpec<Float> finiteAnimationSpec2 = finiteAnimationSpec;
                    Function1<T, Object> function12 = function1;
                    Function3<T, Composer, Integer, Unit> function32 = function3;
                    int i32 = i;
                    CrossfadeKt.Crossfade(transition2, modifier2, finiteAnimationSpec2, function12, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }
}
