package androidx.compose.foundation;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
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
/* JADX INFO: compiled from: AndroidExternalSurface.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<K\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{J$c$\bCCU \u007f*\teNogtLb\u000bY\u000f\u000e\u0016~j4Ikxe\u0012\u00152ZCM\u074ceok8\u0011z<\u0005.2:8(\u00061 0H\u001ex\u0013Cy\u000fB6FpHV%M3\u001fB\u000eD \u000f$tid5vs\u000eO=+\u001bzRP7_^\u0007]\u000fVTU\f%jӿ/@=@[*ھ\u0002ޗқ_A\tK\u007fJ\u001dD55CI\"Vf^\u0006\u0014#+g\r\fsVb\u000bQn\u000e?+}f{V\u0014(\u0006~\u0014\rj\t>\f-H<<2f6\u001eczxSNa\u001a^p\u0003+vD\u001f=\u0011C-I\u001b\u0015[q=)Nez3\u0016̷'\u0001t,\"Yَ_ٽôXyWC_SUS\\\u001eq=\u001c\u00197c͆.\u0004>]\u0018:\n(F\u0017SO\":؝%k\u0010aֶg{\rcnק\u0006\u0001Gـ&\t"}, d2 = {"\u000fmS?b0=3!{z]+|\b\u000fx\u000f(\tI|\u001e\u0005W|\u000f8t%", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7r>=T8NS", "", "Ata3T*>A\u001d\u0014z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "BqP;f-H`!", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "=m8;\\;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0001>X\u000b*;luA\\CHt0%\u0003xn:\u0003a,<t1RL$", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u000fmS?b0=3!{z]+|\b\u000fx\u000f(\tI|\u001e\u0005W|\u000f8t%|g\u000fp g\u0017\"", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000bNb\u0016\u0018T\u001c8\\J?t}#&p+:\u0017l*]z1PZ\u0018\rl[pL\u0018\u001ccY$\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U#\u001e>ytJVY%\u0004\u001d\u0001K7hS/C]\u000b2", "\u000fmS?b0=3,\u000ezk5x\u0010\u001du\r)w>\u0001", "HNa1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0001>X\u000b*;luA\\CHt0%\u0003xn:\u0003a,C`4FL[\u0002", "7rB2V<KS", "\u000fmS?b0=3,\u000ezk5x\u0010\u001du\r)w>\u0001^f\u001aPn$y\u0001", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000bNb\u0004,T\u001c8\\J?t}#&p+:\u0017l*]z1PZ\u0018\rl[pL\u0018\u001ccY$\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U#\u001e>ytJVY%\u0004\u001d\u0001K7hS/C]\u000b2", "@d\\2`)>`t\byk6\u0001\b\u000fm|(z?\u0001\u0016vZ~\u000eI\u007f!<G\u000e-8i\u0014.;R7z4", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0001>X\u000b*;lu6JC:j4\u001dt{p9\u0014l(Ud7TMJ*\\@\u00029#\u00120", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016O6l[q9#\u0016d\u0017\u0018\u0007\u0016\u0004fK(m$?\u001c\b+H\u0002:H\u0014\u001b\u0016\u001b>fw0f\u001dHu\u0013u/8dUY5", "@d\\2`)>`t\byk6\u0001\b\u000fx\u000f(\tI|\u001e\u0005W|\u000f8t%#hy/7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0001>X\u000b*;luA\\CHt0%\u0003xn:\u0003a,<\u0006#VL$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016O6l[q9#\u0016d\u0017\u0018\u0007\u0016\u0004fK(m$J.\b9R}BV\u0011\u0019\u0017\n3j^QR\u001fGO", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidExternalSurface_androidKt {
    private static final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -873615933, "C(rememberAndroidExternalSurfaceState)190@7150L24,191@7186L47:AndroidExternalSurface.android.kt#71ulvw");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-873615933, i2, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:189)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(composer, -954367824, "CC(remember):Effects.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1983762950, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new AndroidExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(objRememberedValue2);
        }
        AndroidExternalSurfaceState androidExternalSurfaceState = (AndroidExternalSurfaceState) objRememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return androidExternalSurfaceState;
    }

    /* JADX INFO: renamed from: AndroidExternalSurface-58FFMhA, reason: not valid java name */
    public static final void m571AndroidExternalSurface58FFMhA(Modifier modifier, boolean z2, long j2, int i2, boolean z3, final Function1<? super AndroidExternalSurfaceScope, Unit> function1, Composer composer, final int i3, final int i4) {
        int i5;
        int iM567getBehindB_4ceCc = i2;
        long jM6813getZeroYbymL2g = j2;
        boolean z4 = z2;
        boolean z5 = z3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(640888974);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AndroidExternalSurface)P(2!1,4:c#ui.unit.IntSize,5:c#foundation.AndroidExternalSurfaceZOrder)288@12167L37,291@12241L150,299@12462L774,290@12210L1032:AndroidExternalSurface.android.kt#71ulvw");
        int i6 = (i4 + 1) - (i4 | 1);
        if (i6 != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            i5 = (composerStartRestartGroup.changed(companion) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i4 & 2;
        if (i7 != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(z4) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i8 = ((i4 + 4) - (i4 | 4) == 0 && composerStartRestartGroup.changed(jM6813getZeroYbymL2g)) ? 256 : 128;
            i5 = (i5 + i8) - (i5 & i8);
        }
        int i9 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i9 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((i3 & 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(iM567getBehindB_4ceCc) ? 2048 : 1024)));
        }
        int i10 = (i4 + 16) - (i4 | 16);
        if (i10 != 0) {
            i5 |= 24576;
        } else if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
            int i11 = composerStartRestartGroup.changed(z5) ? 16384 : 8192;
            i5 = (i5 + i11) - (i5 & i11);
        }
        if ((i4 + 32) - (i4 | 32) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536)));
        }
        if ((i5 + 74899) - (74899 | i5) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z4 = true;
                }
                if ((i4 & 4) != 0) {
                    jM6813getZeroYbymL2g = IntSize.Companion.m6813getZeroYbymL2g();
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if (i9 != 0) {
                    iM567getBehindB_4ceCc = AndroidExternalSurfaceZOrder.Companion.m567getBehindB_4ceCc();
                }
                if (i10 != 0) {
                    z5 = false;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 4) != 0) {
                    i5 &= -897;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(640888974, i5, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
            }
            final AndroidExternalSurfaceState androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1356109309, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
            boolean zChangedInstance = ((458752 + i5) - (458752 | i5) == 131072) | composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final SurfaceView invoke(Context context) {
                        SurfaceView surfaceView = new SurfaceView(context);
                        Function1<AndroidExternalSurfaceScope, Unit> function12 = function1;
                        AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                        function12.invoke(androidExternalSurfaceState);
                        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                        return surfaceView;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$2 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SurfaceView surfaceView) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                    invoke2(surfaceView);
                    return Unit.INSTANCE;
                }
            };
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1356101613, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
            int i12 = (-1) - (((-1) - (((((896 & i5) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composerStartRestartGroup.changed(jM6813getZeroYbymL2g)) && (-1) - (((-1) - i5) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) != 256) ? 0 : 1)) & ((-1) - ((-1) - (((-1) - i5) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) == 32 ? 1 : 0)));
            int i13 = (i5 & 7168) == 2048 ? 1 : 0;
            int i14 = (i12 + i13) - (i12 & i13);
            int i15 = (-1) - (((-1) - 57344) | ((-1) - i5)) == 16384 ? 1 : 0;
            int i16 = (i14 + i15) - (i14 & i15);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i16 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                final long j3 = jM6813getZeroYbymL2g;
                final boolean z6 = z4;
                final int i17 = iM567getBehindB_4ceCc;
                final boolean z7 = z5;
                objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                        if (!IntSize.m6806equalsimpl0(j3, IntSize.Companion.m6813getZeroYbymL2g())) {
                            surfaceView.getHolder().setFixedSize(IntSize.m6808getWidthimpl(j3), IntSize.m6807getHeightimpl(j3));
                        } else {
                            surfaceView.getHolder().setSizeFromLayout();
                        }
                        surfaceView.getHolder().setFormat(z6 ? -1 : -3);
                        int i18 = i17;
                        if (AndroidExternalSurfaceZOrder.m563equalsimpl0(i18, AndroidExternalSurfaceZOrder.Companion.m567getBehindB_4ceCc())) {
                            surfaceView.setZOrderOnTop(false);
                        } else if (AndroidExternalSurfaceZOrder.m563equalsimpl0(i18, AndroidExternalSurfaceZOrder.Companion.m568getMediaOverlayB_4ceCc())) {
                            surfaceView.setZOrderMediaOverlay(true);
                        } else if (AndroidExternalSurfaceZOrder.m563equalsimpl0(i18, AndroidExternalSurfaceZOrder.Companion.m569getOnTopB_4ceCc())) {
                            surfaceView.setZOrderOnTop(true);
                        }
                        surfaceView.setSecure(z7);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            AndroidView_androidKt.AndroidView(function12, companion, androidExternalSurface_androidKt$AndroidExternalSurface$2, null, (Function1) objRememberedValue2, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - (i5 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z8 = z5;
            final long j4 = jM6813getZeroYbymL2g;
            final int i18 = iM567getBehindB_4ceCc;
            final Modifier modifier2 = companion;
            final boolean z9 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
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

                public final void invoke(Composer composer2, int i19) {
                    Modifier modifier3 = modifier2;
                    boolean z10 = z9;
                    long j5 = j4;
                    int i20 = i18;
                    boolean z11 = z8;
                    Function1<AndroidExternalSurfaceScope, Unit> function13 = function1;
                    int i21 = i3;
                    AndroidExternalSurface_androidKt.m571AndroidExternalSurface58FFMhA(modifier3, z10, j5, i20, z11, function13, composer2, RecomposeScopeImplKt.updateChangedFlags((i21 + 1) - (i21 & 1)), i4);
                }
            });
        }
    }

    private static final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1057437053, "C(rememberAndroidEmbeddedExternalSurfaceState)384@15036L24,385@15072L55:AndroidExternalSurface.android.kt#71ulvw");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1057437053, i2, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:383)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(composer, -954367824, "CC(remember):Effects.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1142294264, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new AndroidEmbeddedExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(objRememberedValue2);
        }
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = (AndroidEmbeddedExternalSurfaceState) objRememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return androidEmbeddedExternalSurfaceState;
    }

    /* JADX INFO: renamed from: AndroidEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    public static final void m570AndroidEmbeddedExternalSurfacesv6N_fY(Modifier modifier, boolean z2, long j2, float[] fArr, final Function1<? super AndroidExternalSurfaceScope, Unit> function1, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier.Companion companion = modifier;
        final float[] fArr2 = fArr;
        long jM6813getZeroYbymL2g = j2;
        boolean z3 = z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(217541314);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AndroidEmbeddedExternalSurface)P(1!1,3:c#ui.unit.IntSize,4:c#ui.graphics.Matrix)455@18917L45,461@19089L639,457@18968L766:AndroidExternalSurface.android.kt#71ulvw");
        int i5 = (-1) - (((-1) - i3) | ((-1) - 1));
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(companion) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = (i3 + 2) - (i3 | 2);
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z3) ? 32 : 16)));
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 4)) == 0 && composerStartRestartGroup.changed(jM6813getZeroYbymL2g)) ? 256 : 128)));
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 & 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(fArr2 != null ? Matrix.m4407boximpl(fArr2) : null) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 9363)) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                if ((i3 & 4) != 0) {
                    jM6813getZeroYbymL2g = IntSize.Companion.m6813getZeroYbymL2g();
                    i4 = (i4 - 897) - (i4 | (-897));
                }
                if (i7 != 0) {
                    fArr2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    i4 = (i4 - 897) - (i4 | (-897));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(217541314, i4, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:454)");
            }
            final AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState = rememberAndroidEmbeddedExternalSurfaceState(composerStartRestartGroup, 0);
            AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1 androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1 = new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1
                @Override // kotlin.jvm.functions.Function1
                public final TextureView invoke(Context context) {
                    return new TextureView(context);
                }
            };
            AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 = new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TextureView textureView) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                    invoke2(textureView);
                    return Unit.INSTANCE;
                }
            };
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 184054658, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
            int i8 = ((-1) - (((-1) - ((-1) - (((-1) - ((((((-1) - (((-1) - i4) | ((-1) - 896))) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composerStartRestartGroup.changed(jM6813getZeroYbymL2g)) && (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i4) != 256) ? 0 : 1)) & ((-1) - (composerStartRestartGroup.changedInstance(androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState) ? 1 : 0))))) & ((-1) - ((57344 + i4) - (57344 | i4) == 16384 ? 1 : 0)))) | ((i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i4) == 32 ? 1 : 0) | (composerStartRestartGroup.changedInstance(fArr2 != null ? Matrix.m4407boximpl(fArr2) : null) ? 1 : 0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i8 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                final long j3 = jM6813getZeroYbymL2g;
                final boolean z4 = z3;
                fArr2 = fArr2;
                objRememberedValue = (Function1) new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                        invoke2(textureView);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextureView textureView) {
                        android.graphics.Matrix matrix;
                        SurfaceTexture surfaceTexture;
                        if (!IntSize.m6806equalsimpl0(j3, IntSize.Companion.m6813getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                            surfaceTexture.setDefaultBufferSize(IntSize.m6808getWidthimpl(j3), IntSize.m6807getHeightimpl(j3));
                        }
                        androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.m559setSurfaceSizeozmzZPI(j3);
                        TextureView.SurfaceTextureListener surfaceTextureListener = textureView.getSurfaceTextureListener();
                        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState;
                        if (surfaceTextureListener != androidEmbeddedExternalSurfaceState) {
                            function1.invoke(androidEmbeddedExternalSurfaceState);
                            textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState);
                        }
                        textureView.setOpaque(z4);
                        float[] fArr3 = fArr2;
                        if (fArr3 != null) {
                            matrix = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.getMatrix();
                            AndroidMatrixConversions_androidKt.m4048setFromEL8BTi8(matrix, fArr3);
                        } else {
                            matrix = null;
                        }
                        textureView.setTransform(matrix);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            AndroidView_androidKt.AndroidView(androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1, companion, androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2, null, (Function1) objRememberedValue, composerStartRestartGroup, ((-1) - (((-1) - (i4 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) | 390, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final boolean z5 = z3;
            final long j4 = jM6813getZeroYbymL2g;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4
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
                    Modifier modifier3 = modifier2;
                    boolean z6 = z5;
                    long j5 = j4;
                    float[] fArr3 = fArr2;
                    Function1<AndroidExternalSurfaceScope, Unit> function12 = function1;
                    int i10 = i2;
                    AndroidExternalSurface_androidKt.m570AndroidEmbeddedExternalSurfacesv6N_fY(modifier3, z6, j5, fArr3, function12, composer2, RecomposeScopeImplKt.updateChangedFlags((i10 + 1) - (i10 & 1)), i3);
                }
            });
        }
    }
}
