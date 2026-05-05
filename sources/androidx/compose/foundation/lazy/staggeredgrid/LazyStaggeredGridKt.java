package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: LazyStaggeredGrid.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$i-yّCU0}*\tUNog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4Ikxe\u0012%2JoE4eژ<Gś\r63\u001fb&Fy\u001d\u0001H+x\u0014\u0005|[K:\u0015`D~>j\r{\nJ\u0018\f>.\u00076\\\u0016UfNr]H7;\u0003\u0018K~-e0\u000bW%F\u00032=|g\u001e9LO5C2\u0004\t\rRiM\u001b? H5n-'9X\fWdh0\u001a\u001b+]\u001eurTl5fn\u001e?<_e[P<<\b|\f\rj\u0003<\u0019όL.3/-\u0007ս2οɤWBV\u0018lYȘzf>\u001a+ŐOY8Ӿji"}, d2 = {"\u001a`iFF;:U\u001b~\b^+^\u00163d", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{]'\u001c\u0005/", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_AbX4KK<;XTt=!\u0012Yo[/\fr`K3|/D)\u00190H\u0002H>", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "@de2e:>:\u0015\u0013\u0005n;", "", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w.J?t6z\u0015k]J\u000bm9$", "CrT?F*K] \u0006Zg(y\u0010/d", ";`X;4?Ba\u0007\nv\\0\u0006\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1q^@f\bQW'l\u0006Z*\u0001\u00121", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{L5\u0018\u0005/", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001a`iFF;:U\u001b~\b^+^\u00163dG\u000f`2c\nr\u001a", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PJ(c\u000b\u0015VHP.\\_r<u\u001f^\r<:\t\u0014Y\u0017\u000bjM6,\u00120H\u0015\u0005f\u000b\u0014!\u0018Cj:C` Px\u0011\u0005E3q\u0010[_\bVQRb8.ul!\\CI #u#$>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7\\PUxT8\u0004+)TE~\u000eGl>9\u0004)\u00066*Cd\u0004Mt\u001c=(_\u0011Ap#4*5*\";Meuy>\rJ,e\u0007{i?@'PrmY\u0013\u0006]$1\u001c]h\u007fD\\\n=\\9\u00131N\nLiy^\u0019\u000bmUoHG\u001cX\u0001'F+\u001eh\u0010\u0010\rj\u0017/w\u0014Ga\u001ar8_\u0001N\u001d\u0019q7\b\u000b]M\u001e:O\f\u0002U\u0003j!Z 5w\u0015R#$GC\u0007RQE\u0005|0\n\n\f'whUC4\u001d-0Gg8,a9\u001bpR\u001e(kB%h/1\u0010aP{^\u0006pu\u0005\u0012q~q]A4\u00137KV@\u0017\u001dD2\u000bFiY\u00145\u0017\u001a@h>\u0017RdqDNx\u0017\u000eM\f\t\u001c\u001a;*\u007fPj=\u0002+o\u000b\u0019\u0014s\u001cBd~bV!W!n\u0012U*\u0007j3\r\u0010k$r\u001dW\u000b7CG$,Z\u0003vx", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyStaggeredGridKt {
    /* JADX INFO: renamed from: LazyStaggeredGrid-LJWHXA8, reason: not valid java name */
    public static final void m1219LazyStaggeredGridLJWHXA8(final LazyStaggeredGridState lazyStaggeredGridState, final Orientation orientation, final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, Modifier modifier, PaddingValues paddingValues, boolean z2, FlingBehavior flingBehavior, boolean z3, float f2, float f3, final Function1<? super LazyStaggeredGridScope, Unit> function1, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        boolean z4;
        int i7;
        Composer composer2;
        boolean z5 = z2;
        float fM6638constructorimpl = f3;
        boolean z6 = z3;
        FlingBehavior flingBehavior2 = flingBehavior;
        PaddingValues paddingValuesM1011PaddingValues0680j_4 = paddingValues;
        float fM6638constructorimpl2 = f2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(288295126);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LazyStaggeredGrid)P(9,6,8,5,1,7,3,10,4:c#ui.unit.Dp,2:c#ui.unit.Dp)51@2370L15,61@2769L55,62@2850L24,63@2922L7,64@2954L266,76@3245L60,82@3456L278,90@3804L57,93@4024L7,89@3748L385,98@4194L316,78@3311L1332:LazyStaggeredGrid.kt#fzvcnm");
        if ((i4 + 1) - (i4 | 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(lazyStaggeredGridState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i8 = composerStartRestartGroup.changed(orientation) ? 32 : 16;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((i4 & 4) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ((i2 & 512) == 0 ? composerStartRestartGroup.changed(lazyGridStaggeredGridSlotsProvider) : composerStartRestartGroup.changedInstance(lazyGridStaggeredGridSlotsProvider) ? 256 : 128)));
        }
        int i9 = i4 & 8;
        if (i9 != 0) {
            i5 = (i5 + 3072) - (i5 & 3072);
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(companion) ? 2048 : 1024)));
        }
        int i10 = (-1) - (((-1) - i4) | ((-1) - 16));
        if (i10 != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i11 = composerStartRestartGroup.changed(paddingValuesM1011PaddingValues0680j_4) ? 16384 : 8192;
            i5 = (i5 + i11) - (i5 & i11);
        }
        int i12 = (i4 + 32) - (i4 | 32);
        if (i12 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(z5) ? 131072 : 65536)));
        }
        if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i5 |= ((i4 + 64) - (i4 | 64) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
        }
        int i13 = (-1) - (((-1) - i4) | ((-1) - 128));
        if (i13 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 12582912));
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(z6) ? 8388608 : 4194304)));
        }
        int i14 = (-1) - (((-1) - i4) | ((-1) - 256));
        if (i14 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 100663296));
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(fM6638constructorimpl2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i15 = (-1) - (((-1) - i4) | ((-1) - 512));
        if (i15 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 805306368));
        } else if ((i2 & 805306368) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(fM6638constructorimpl) ? 536870912 : 268435456)));
        }
        if ((i4 + 1024) - (i4 | 1024) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            int i16 = composerStartRestartGroup.changedInstance(function1) ? 4 : 2;
            i6 = (i3 + i16) - (i3 & i16);
        } else {
            i6 = i3;
        }
        if ((i5 + 306783379) - (306783379 | i5) == 306783378 && (i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i9 != 0) {
                    companion = Modifier.Companion;
                }
                if (i10 != 0) {
                    paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                }
                z4 = i12 == 0 ? z5 : false;
                if ((i4 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-3670017)));
                }
                if (i13 != 0) {
                    z6 = true;
                }
                if (i14 != 0) {
                    i7 = 0;
                    fM6638constructorimpl2 = Dp.m6638constructorimpl(0);
                } else {
                    i7 = 0;
                }
                if (i15 != 0) {
                    fM6638constructorimpl = Dp.m6638constructorimpl(i7);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    i5 = (i5 - 3670017) - (i5 | (-3670017));
                }
                z4 = z5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(288295126, i5, i6, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:60)");
            }
            int i17 = (-1) - (((-1) - i5) | ((-1) - 14));
            int i18 = (i6 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            Function0<LazyStaggeredGridItemProvider> function0RememberStaggeredGridItemProviderLambda = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, composerStartRestartGroup, (i18 + i17) - (i18 & i17));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidableCompositionLocal<GraphicsContext> localGraphicsContext = CompositionLocalsKt.getLocalGraphicsContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localGraphicsContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i19 = i5 >> 6;
            int i20 = (-1) - (((-1) - i19) | ((-1) - 7168));
            int i21 = i5 >> 9;
            int i22 = ((-1) - (((-1) - ((i19 + 896) - (i19 | 896))) & ((-1) - i17))) | i20 | ((-1) - (((-1) - (i5 << 9)) | ((-1) - 57344))) | ((i21 + 458752) - (i21 | 458752));
            int i23 = (i21 + 3670016) - (i21 | 3670016);
            int i24 = (i22 + i23) - (i22 & i23);
            int i25 = (-1) - (((-1) - (i5 << 18)) | ((-1) - 234881024));
            int i26 = (i24 + i25) - (i24 & i25);
            z5 = z4;
            Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2M1230rememberStaggeredGridMeasurePolicyqKj4JfE = LazyStaggeredGridMeasurePolicyKt.m1230rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, function0RememberStaggeredGridItemProviderLambda, paddingValuesM1011PaddingValues0680j_4, z4, orientation, fM6638constructorimpl2, fM6638constructorimpl, coroutineScope, lazyGridStaggeredGridSlotsProvider, (GraphicsContext) objConsume, composerStartRestartGroup, i26);
            int i27 = i5 >> 12;
            int i28 = (i5 << 6) & 7168;
            int i29 = (-1) - (((-1) - i21) | ((-1) - 57344));
            int i30 = (i28 + i29) - (i28 & i29);
            int i31 = i5 & 458752;
            Modifier modifierLazyLayoutSemantics = LazyLayoutSemanticsKt.lazyLayoutSemantics(companion.then(lazyStaggeredGridState.getRemeasurementModifier$foundation_release()).then(lazyStaggeredGridState.getAwaitLayoutModifier$foundation_release()), function0RememberStaggeredGridItemProviderLambda, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z5, composerStartRestartGroup, (-1) - (((-1) - ((i27 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i27 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) & ((-1) - i17))), orientation, z6, z5, composerStartRestartGroup, (i30 + i31) - (i30 & i31));
            LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsStateRememberLazyStaggeredGridBeyondBoundsState = LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, composerStartRestartGroup, i17);
            LazyLayoutBeyondBoundsInfo beyondBoundsInfo$foundation_release = lazyStaggeredGridState.getBeyondBoundsInfo$foundation_release();
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i32 = (-1) - (((-1) - (MutableVector.$stable << 6)) & ((-1) - i20));
            int i33 = i5 << 12;
            int i34 = (i33 + 458752) - (i33 | 458752);
            int i35 = (i32 + i34) - (i32 & i34);
            int i36 = i5 >> 3;
            int i37 = (-1) - (((-1) - 3670016) | ((-1) - i36));
            int i38 = (-1) - (((-1) - (((-1) - (((-1) - (i5 << 3)) | ((-1) - 1008))) | (i27 & 7168))) & ((-1) - ((i36 + 57344) - (i36 | 57344))));
            int i39 = (-1) - (((-1) - i36) | ((-1) - 458752));
            composer2 = composerStartRestartGroup;
            LazyLayoutKt.LazyLayout(function0RememberStaggeredGridItemProviderLambda, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(modifierLazyLayoutSemantics, lazyLayoutBeyondBoundsStateRememberLazyStaggeredGridBeyondBoundsState, beyondBoundsInfo$foundation_release, z5, (LayoutDirection) objConsume2, orientation, z6, composerStartRestartGroup, (i35 + i37) - (i35 & i37)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z6, z5, flingBehavior2, lazyStaggeredGridState.getMutableInteractionSource$foundation_release(), null, composerStartRestartGroup, (i38 + i39) - (i38 & i39), 64), lazyStaggeredGridState.getPrefetchState$foundation_release(), function2M1230rememberStaggeredGridMeasurePolicyqKj4JfE, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z7 = z5;
            final FlingBehavior flingBehavior3 = flingBehavior2;
            final boolean z8 = z6;
            final float f4 = fM6638constructorimpl2;
            final float f5 = fM6638constructorimpl;
            final Modifier modifier2 = companion;
            final PaddingValues paddingValues2 = paddingValuesM1011PaddingValues0680j_4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i40) {
                    LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                    Orientation orientation2 = orientation;
                    LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider2 = lazyGridStaggeredGridSlotsProvider;
                    Modifier modifier3 = modifier2;
                    PaddingValues paddingValues3 = paddingValues2;
                    boolean z9 = z7;
                    FlingBehavior flingBehavior4 = flingBehavior3;
                    boolean z10 = z8;
                    float f6 = f4;
                    float f7 = f5;
                    Function1<LazyStaggeredGridScope, Unit> function12 = function1;
                    int i41 = i2;
                    LazyStaggeredGridKt.m1219LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, orientation2, lazyGridStaggeredGridSlotsProvider2, modifier3, paddingValues3, z9, flingBehavior4, z10, f6, f7, function12, composer3, RecomposeScopeImplKt.updateChangedFlags((i41 + 1) - (i41 & 1)), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }
}
