package com.incode.welcome_sdk.ui.id_capture.view;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BlurKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.IncodeCamera;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.analysis.document.DocumentAnalyzer;
import com.incode.welcome_sdk.DisplayMode;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.CloseButtonPosition;
import com.incode.welcome_sdk.commons.HelpButtonPosition;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.ui.BaseView;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.composables.DrawWithLayerKt;
import com.incode.welcome_sdk.ui.composables.ShadowCustomKt;
import com.incode.welcome_sdk.ui.ekyb.EKYBActivity;
import com.incode.welcome_sdk.ui.id_capture.AcceptedDocumentsUiState;
import com.incode.welcome_sdk.ui.id_capture.AnalyzingDocumentModel;
import com.incode.welcome_sdk.ui.id_capture.AudioPermissionHandler;
import com.incode.welcome_sdk.ui.id_capture.BorderStyle;
import com.incode.welcome_sdk.ui.id_capture.CaptureUiState;
import com.incode.welcome_sdk.ui.id_capture.SuggestionBoxModel;
import com.incode.welcome_sdk.ui.id_capture.event.IdCaptureUiEvent;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.InitIdCaptureViewModel;
import com.valid.vssh_bio_validation_library.utils.BioValidationConstants;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlowKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureScreenKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f15277b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f15278c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f15280e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f15281i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f15276a = Dp.m6638constructorimpl(4.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ProvidableCompositionLocal<Float> f15279d = CompositionLocalKt.compositionLocalOf$default(null, ar.f15406d, 1, null);

    /* JADX INFO: renamed from: access$AllPhotosAreEncrypted-uFdPcIQ, reason: not valid java name */
    public static final /* synthetic */ void m8490access$AllPhotosAreEncrypteduFdPcIQ(BoxScope boxScope, float f2, boolean z2, Composer composer, int i2, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = f15278c + 71;
        f15277b = i5 % 128;
        int i6 = i5 % 2;
        a(boxScope, f2, z2, composer, i2, i3);
        int i7 = f15278c + 11;
        f15277b = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final /* synthetic */ void access$AnalyzingDocument$lambda$24(MutableFloatState mutableFloatState, float f2) {
        int i2 = 2 % 2;
        int i3 = f15277b + 51;
        f15278c = i3 % 128;
        int i4 = i3 % 2;
        b(mutableFloatState, f2);
        if (i4 != 0) {
            int i5 = 71 / 0;
        }
    }

    public static final /* synthetic */ float access$AnalyzingDocument$lambda$25(State state) {
        int i2 = 2 % 2;
        int i3 = f15277b + 85;
        f15278c = i3 % 128;
        if (i3 % 2 != 0) {
            e((State<Float>) state);
            throw null;
        }
        float fE = e((State<Float>) state);
        int i4 = f15278c + 117;
        f15277b = i4 % 128;
        int i5 = i4 % 2;
        return fE;
    }

    public static final /* synthetic */ LottieComposition access$AnimateLaserOverCapture$lambda$44(LottieCompositionResult lottieCompositionResult) {
        int i2 = 2 % 2;
        int i3 = f15278c + 107;
        f15277b = i3 % 128;
        int i4 = i3 % 2;
        LottieComposition lottieCompositionC = c(lottieCompositionResult);
        if (i4 == 0) {
            int i5 = 16 / 0;
        }
        return lottieCompositionC;
    }

    public static final /* synthetic */ float access$AnimateLaserOverCapture$lambda$45(LottieAnimationState lottieAnimationState) {
        int i2 = 2 % 2;
        int i3 = f15278c + 43;
        f15277b = i3 % 128;
        if (i3 % 2 == 0) {
            a(lottieAnimationState);
            throw null;
        }
        float fA = a(lottieAnimationState);
        int i4 = f15277b + 69;
        f15278c = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return fA;
    }

    public static final /* synthetic */ void access$BottomButton(BoxScope boxScope, Function1 function1, CaptureUiState.BottomButton bottomButton, boolean z2, Function1 function12, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15278c + 97;
        f15277b = i4 % 128;
        int i5 = i4 % 2;
        a(boxScope, (Function1<? super IdCaptureUiEvent, Unit>) function1, bottomButton, z2, (Function1<? super LayoutCoordinates, Unit>) function12, composer, i2);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: access$CameraCaptureFrame-XaN-1jA, reason: not valid java name */
    public static final /* synthetic */ void m8491access$CameraCaptureFrameXaN1jA(BorderStyle borderStyle, long j2, long j3, Composer composer, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f15278c + 115;
        f15277b = i5 % 128;
        int i6 = i5 % 2;
        c(borderStyle, j2, j3, composer, i2, i3);
        int i7 = f15277b + 79;
        f15278c = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final /* synthetic */ float access$CameraCaptureFrame_XaN_1jA$lambda$57(MutableFloatState mutableFloatState) {
        int i2 = 2 % 2;
        int i3 = f15277b + 5;
        f15278c = i3 % 128;
        int i4 = i3 % 2;
        float fE = e(mutableFloatState);
        if (i4 != 0) {
            int i5 = 23 / 0;
        }
        return fE;
    }

    public static final /* synthetic */ void access$CameraCaptureFrame_XaN_1jA$lambda$58(MutableFloatState mutableFloatState, float f2) {
        int i2 = 2 % 2;
        int i3 = f15277b + 67;
        f15278c = i3 % 128;
        int i4 = i3 % 2;
        e(mutableFloatState, f2);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float access$CameraCaptureFrame_XaN_1jA$lambda$60(MutableFloatState mutableFloatState) {
        int i2 = 2 % 2;
        int i3 = f15278c + 85;
        f15277b = i3 % 128;
        if (i3 % 2 != 0) {
            return b(mutableFloatState);
        }
        b(mutableFloatState);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$CameraCaptureFrame_XaN_1jA$lambda$61(MutableFloatState mutableFloatState, float f2) {
        int i2 = 2 % 2;
        int i3 = f15277b + 111;
        f15278c = i3 % 128;
        int i4 = i3 % 2;
        a(mutableFloatState, f2);
        int i5 = f15278c + 107;
        f15277b = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$CameraPreviewWithOverlay(View view, CaptureUiState captureUiState, Function1 function1, Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f15278c + 85;
        f15277b = i4 % 128;
        int i5 = i4 % 2;
        b(view, captureUiState, (Function1<? super IdCaptureUiEvent, Unit>) function1, composer, i2);
        int i6 = f15278c + 9;
        f15277b = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$CaptureHintBox(String str, String str2, int i2, Composer composer, int i3) {
        int i4 = 2 % 2;
        int i5 = f15277b + 91;
        f15278c = i5 % 128;
        int i6 = i5 % 2;
        b(str, str2, i2, composer, i3);
        if (i6 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float access$CaptureHintBox$lambda$78$lambda$77$lambda$76$lambda$74(LottieAnimationState lottieAnimationState) {
        int i2 = 2 % 2;
        int i3 = f15277b + 43;
        f15278c = i3 % 128;
        int i4 = i3 % 2;
        float fE = e(lottieAnimationState);
        if (i4 != 0) {
            int i5 = 18 / 0;
        }
        return fE;
    }

    public static final /* synthetic */ void access$CaptureScreenContent$lambda$7(MutableFloatState mutableFloatState, float f2) {
        int i2 = 2 % 2;
        int i3 = f15277b + 65;
        f15278c = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        c(mutableFloatState, f2);
        if (i4 != 0) {
            throw null;
        }
        int i5 = f15277b + 31;
        f15278c = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$FillTheFrameHint(CaptureUiState.CaptureFrameSpec captureFrameSpec, boolean z2, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15277b + 23;
        f15278c = i4 % 128;
        int i5 = i4 % 2;
        c(captureFrameSpec, z2, composer, i2);
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$FillTheFrameHint$lambda$52(MutableFloatState mutableFloatState, float f2) {
        int i2 = 2 % 2;
        int i3 = f15278c + 103;
        f15277b = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {mutableFloatState, Float.valueOf(f2)};
        c(-1834639572, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), 1834639578, objArr, EKYBActivity.e.e());
        int i5 = f15278c + 99;
        f15277b = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$HelpScreen(Function0 function0, Function0 function02, Function0 function03, Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f15278c + 55;
        f15277b = i4 % 128;
        int i5 = i4 % 2;
        e((Function0<Unit>) function0, (Function0<Unit>) function02, (Function0<Unit>) function03, composer, i2);
        if (i5 == 0) {
            int i6 = 34 / 0;
        }
        int i7 = f15278c + 57;
        f15277b = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$ManualCaptureButton(BoxScope boxScope, Function1 function1, boolean z2, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15277b + 33;
        f15278c = i4 % 128;
        int i5 = i4 % 2;
        e(boxScope, (Function1<? super IdCaptureUiEvent, Unit>) function1, z2, composer, i2);
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$PreviewCaptureScreenSmallEstate(Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f15277b + 113;
        f15278c = i4 % 128;
        int i5 = i4 % 2;
        d(composer, i2);
        int i6 = f15278c + 1;
        f15277b = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$PreviewHelpScreen(Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f15277b + 49;
        f15278c = i4 % 128;
        int i5 = i4 % 2;
        e(composer, i2);
        int i6 = f15278c + 47;
        f15277b = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$PreviewTooltipBubble(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15277b + 31;
        f15278c = i4 % 128;
        int i5 = i4 % 2;
        h(composer, i2);
        int i6 = f15277b + 3;
        f15278c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 64 / 0;
        }
    }

    public static final /* synthetic */ void access$PreviewTooltipBubbleDarkMode(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15277b + 7;
        f15278c = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {composer, Integer.valueOf(i2)};
        int iE = EKYBActivity.e.e();
        int iE2 = EKYBActivity.e.e();
        int iE3 = EKYBActivity.e.e();
        int iE4 = EKYBActivity.e.e();
        if (i5 != 0) {
            c(-1287691853, iE3, iE, iE2, 1287691854, objArr, iE4);
            int i6 = 92 / 0;
        } else {
            c(-1287691853, iE3, iE, iE2, 1287691854, objArr, iE4);
        }
        int i7 = f15277b + 123;
        f15278c = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$PreviewTopInfo(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15277b + 33;
        f15278c = i4 % 128;
        int i5 = i4 % 2;
        b(composer, i2);
        int i6 = f15277b + 71;
        f15278c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 68 / 0;
        }
    }

    /* JADX INFO: renamed from: access$ShooterCounter-x_KDEd0, reason: not valid java name */
    public static final /* synthetic */ void m8492access$ShooterCounterx_KDEd0(int i2, long j2, Composer composer, int i3) {
        int i4 = 2 % 2;
        int i5 = f15277b + 35;
        f15278c = i5 % 128;
        int i6 = i5 % 2;
        Integer numValueOf = Integer.valueOf(i2);
        Long lValueOf = Long.valueOf(j2);
        Integer numValueOf2 = Integer.valueOf(i3);
        if (i6 != 0) {
            Object[] objArr = {numValueOf, lValueOf, composer, numValueOf2};
            c(1958958604, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), -1958958597, objArr, EKYBActivity.e.e());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iE = EKYBActivity.e.e();
        int iE2 = EKYBActivity.e.e();
        c(1958958604, EKYBActivity.e.e(), iE, iE2, -1958958597, new Object[]{numValueOf, lValueOf, composer, numValueOf2}, EKYBActivity.e.e());
        int i7 = f15278c + 95;
        f15277b = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 81 / 0;
        }
    }

    public static final /* synthetic */ void access$TooltipBubble(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15278c + 57;
        f15277b = i4 % 128;
        int i5 = i4 % 2;
        c(composer, i2);
        if (i5 == 0) {
            int i6 = 40 / 0;
        }
        int i7 = f15278c + 125;
        f15277b = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX INFO: renamed from: access$TopInfo-xqIIw2o, reason: not valid java name */
    public static final /* synthetic */ void m8493access$TopInfoxqIIw2o(String str, String str2, Integer num, Color color, boolean z2, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15278c + 83;
        f15277b = i4 % 128;
        if (i4 % 2 != 0) {
            Object[] objArr = {str, str2, num, color, Boolean.valueOf(z2), composer, Integer.valueOf(i2)};
            c(148263441, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), -148263441, objArr, EKYBActivity.e.e());
            return;
        }
        Object[] objArr2 = {str, str2, num, color, Boolean.valueOf(z2), composer, Integer.valueOf(i2)};
        c(148263441, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), -148263441, objArr2, EKYBActivity.e.e());
        int i5 = 45 / 0;
    }

    public static final /* synthetic */ void access$TransitionToBackId(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15277b + 67;
        f15278c = i4 % 128;
        int i5 = i4 % 2;
        a(composer, i2);
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float access$TransitionToBackId$lambda$21$lambda$19(LottieAnimationState lottieAnimationState) {
        int i2 = 2 % 2;
        int i3 = f15278c + 57;
        f15277b = i3 % 128;
        if (i3 % 2 != 0) {
            return c(lottieAnimationState);
        }
        c(lottieAnimationState);
        throw null;
    }

    /* JADX INFO: renamed from: access$checkScreenSizeAndEmitIfNeeded-txvA7gs, reason: not valid java name */
    public static final /* synthetic */ void m8494access$checkScreenSizeAndEmitIfNeededtxvA7gs(long j2, long j3, CaptureUiState.CaptureFrameSpec captureFrameSpec, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = f15278c + 67;
        f15277b = i3 % 128;
        int i4 = i3 % 2;
        c(j2, j3, captureFrameSpec, (Function1<? super IdCaptureUiEvent, Unit>) function1);
        int i5 = f15278c + 95;
        f15277b = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ long access$deriveCaptureFrameSize(CaptureUiState.CaptureFrameSpec captureFrameSpec, float f2) {
        int i2 = 2 % 2;
        int i3 = f15278c + 91;
        f15277b = i3 % 128;
        if (i3 % 2 == 0) {
            b(captureFrameSpec, f2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jB = b(captureFrameSpec, f2);
        int i4 = f15278c + 85;
        f15277b = i4 % 128;
        int i5 = i4 % 2;
        return jB;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object c(int r58, int r59, int r60, int r61, int r62, java.lang.Object[] r63, int r64) {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.c(int, int, int, int, int, java.lang.Object[], int):java.lang.Object");
    }

    static final class ar extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15403a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15404b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15405c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ar f15406d = new ar();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15407e = 0;

        private static Float d() {
            int i2 = 2 % 2;
            int i3 = f15407e + 59;
            f15403a = i3 % 128;
            int i4 = i3 % 2;
            Float fValueOf = Float.valueOf(3.6f);
            int i5 = f15407e + 87;
            f15403a = i5 % 128;
            if (i5 % 2 != 0) {
                return fValueOf;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Float invoke() {
            int i2 = 2 % 2;
            int i3 = f15403a + 15;
            f15407e = i3 % 128;
            int i4 = i3 % 2;
            Float fD = d();
            int i5 = f15407e + 23;
            f15403a = i5 % 128;
            if (i5 % 2 != 0) {
                return fD;
            }
            throw null;
        }

        static {
            int i2 = f15404b + 3;
            f15405c = i2 % 128;
            int i3 = i2 % 2;
        }

        ar() {
            super(0);
        }
    }

    static final class al extends Lambda implements Function0<DocumentAnalyzer.DocumentSizeConstraint> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15373a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15374c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ MutableState<DocumentAnalyzer.DocumentSizeConstraint> f15375e;

        private DocumentAnalyzer.DocumentSizeConstraint e() {
            int i2 = 2 % 2;
            int i3 = f15374c + 113;
            f15373a = i3 % 128;
            int i4 = i3 % 2;
            DocumentAnalyzer.DocumentSizeConstraint value = this.f15375e.getValue();
            int i5 = f15374c + 57;
            f15373a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 72 / 0;
            }
            return value;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ DocumentAnalyzer.DocumentSizeConstraint invoke() {
            int i2 = 2 % 2;
            int i3 = f15374c + 29;
            f15373a = i3 % 128;
            int i4 = i3 % 2;
            DocumentAnalyzer.DocumentSizeConstraint documentSizeConstraintE = e();
            int i5 = f15374c + 99;
            f15373a = i5 % 128;
            int i6 = i5 % 2;
            return documentSizeConstraintE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        al(MutableState<DocumentAnalyzer.DocumentSizeConstraint> mutableState) {
            super(0);
            this.f15375e = mutableState;
        }
    }

    static final class aj extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15361c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15362d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ DocumentAnalyzer.Config f15363e;

        private ParametersHolder c() {
            int i2 = 2 % 2;
            int i3 = f15361c + 105;
            f15362d = i3 % 128;
            int i4 = i3 % 2;
            ParametersHolder parametersHolderParametersOf = ParametersHolderKt.parametersOf(this.f15363e);
            int i5 = f15362d + 91;
            f15361c = i5 % 128;
            int i6 = i5 % 2;
            return parametersHolderParametersOf;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ ParametersHolder invoke() {
            int i2 = 2 % 2;
            int i3 = f15361c + 69;
            f15362d = i3 % 128;
            int i4 = i3 % 2;
            ParametersHolder parametersHolderC = c();
            int i5 = f15362d + 1;
            f15361c = i5 % 128;
            int i6 = i5 % 2;
            return parametersHolderC;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        aj(DocumentAnalyzer.Config config) {
            super(0);
            this.f15363e = config;
        }
    }

    static final class an extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15386c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15387d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LifecycleOwner f15388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Context f15389b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ DocumentAnalyzer f15390e;

        private ParametersHolder b() {
            int i2 = 2 % 2;
            int i3 = f15386c + 81;
            f15387d = i3 % 128;
            if (i3 % 2 != 0) {
                return ParametersHolderKt.parametersOf(this.f15389b.getApplicationContext(), this.f15388a, this.f15390e);
            }
            Object[] objArr = new Object[5];
            objArr[1] = this.f15389b.getApplicationContext();
            objArr[1] = this.f15388a;
            objArr[3] = this.f15390e;
            return ParametersHolderKt.parametersOf(objArr);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ ParametersHolder invoke() {
            int i2 = 2 % 2;
            int i3 = f15386c + 57;
            f15387d = i3 % 128;
            int i4 = i3 % 2;
            ParametersHolder parametersHolderB = b();
            int i5 = f15387d + 49;
            f15386c = i5 % 128;
            int i6 = i5 % 2;
            return parametersHolderB;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        an(Context context, LifecycleOwner lifecycleOwner, DocumentAnalyzer documentAnalyzer) {
            super(0);
            this.f15389b = context;
            this.f15388a = lifecycleOwner;
            this.f15390e = documentAnalyzer;
        }
    }

    static final class am extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f15376g = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f15377j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.commons.n f15378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ IncodeCamera<DocumentAnalysisEvent> f15379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.commons.o f15380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ InitIdCaptureViewModel f15381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ IdScan.IdType f15382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ DocumentAnalyzer.Config f15383f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.commons.b f15384h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ AudioPermissionHandler f15385i;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ ParametersHolder invoke() {
            int i2 = 2 % 2;
            int i3 = f15377j + 79;
            f15376g = i3 % 128;
            if (i3 % 2 == 0) {
                d();
                throw null;
            }
            ParametersHolder parametersHolderD = d();
            int i4 = f15376g + 63;
            f15377j = i4 % 128;
            int i5 = i4 % 2;
            return parametersHolderD;
        }

        private ParametersHolder d() {
            int i2 = 2 % 2;
            int i3 = f15376g + 21;
            f15377j = i3 % 128;
            int i4 = i3 % 2;
            ParametersHolder parametersHolderParametersOf = ParametersHolderKt.parametersOf(this.f15381d.getIdScan(), this.f15380c, this.f15378a, this.f15381d, this.f15379b, this.f15382e, this.f15384h, this.f15383f, this.f15385i);
            int i5 = f15377j + 63;
            f15376g = i5 % 128;
            if (i5 % 2 != 0) {
                return parametersHolderParametersOf;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        am(InitIdCaptureViewModel initIdCaptureViewModel, com.incode.welcome_sdk.commons.o oVar, com.incode.welcome_sdk.commons.n nVar, IncodeCamera<DocumentAnalysisEvent> incodeCamera, IdScan.IdType idType, com.incode.welcome_sdk.commons.b bVar, DocumentAnalyzer.Config config, AudioPermissionHandler audioPermissionHandler) {
            super(0);
            this.f15381d = initIdCaptureViewModel;
            this.f15380c = oVar;
            this.f15378a = nVar;
            this.f15379b = incodeCamera;
            this.f15382e = idType;
            this.f15384h = bVar;
            this.f15383f = config;
            this.f15385i = audioPermissionHandler;
        }
    }

    static final class ag extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15335b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15336e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ State<CaptureUiState> f15337a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f15338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ MutableState<DocumentAnalyzer.DocumentSizeConstraint> f15339d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f15339d.setValue(new DocumentAnalyzer.DocumentSizeConstraint(0.73f, 0.98f, this.f15337a.getValue().getCaptureFrameSpec().getMultiplier()));
            Unit unit = Unit.INSTANCE;
            int i3 = f15335b + 57;
            f15336e = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15335b + 113;
            f15336e = i3 % 128;
            int i4 = i3 % 2;
            Object objB = b(coroutineScope, continuation);
            if (i4 == 0) {
                int i5 = 40 / 0;
            }
            int i6 = f15336e + 81;
            f15335b = i6 % 128;
            int i7 = i6 % 2;
            return objB;
        }

        private Object b(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15336e + 37;
            f15335b = i3 % 128;
            int i4 = i3 % 2;
            ag agVar = (ag) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                agVar.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = agVar.invokeSuspend(unit);
            int i5 = f15335b + 125;
            f15336e = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            ag agVar = new ag(this.f15337a, this.f15339d, continuation);
            int i3 = f15336e + 13;
            f15335b = i3 % 128;
            int i4 = i3 % 2;
            return agVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ag(State<CaptureUiState> state, MutableState<DocumentAnalyzer.DocumentSizeConstraint> mutableState, Continuation<? super ag> continuation) {
            super(2, continuation);
            this.f15337a = state;
            this.f15339d = mutableState;
        }
    }

    static final class ai extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15354a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15355d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ IncodeCamera<DocumentAnalysisEvent> f15356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ State<CaptureUiState> f15357c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ IdCaptureViewModel f15358e;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$ai$3, reason: invalid class name */
        /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<IdCaptureUiEvent, Unit> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f15359c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f15360e = 0;

            private void c(IdCaptureUiEvent idCaptureUiEvent) {
                int i2 = 2 % 2;
                int i3 = f15359c + 49;
                f15360e = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(idCaptureUiEvent, "");
                ((IdCaptureViewModel) this.receiver).onEvent(idCaptureUiEvent);
                int i5 = f15360e + 123;
                f15359c = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(IdCaptureUiEvent idCaptureUiEvent) {
                int i2 = 2 % 2;
                int i3 = f15360e + 23;
                f15359c = i3 % 128;
                int i4 = i3 % 2;
                c(idCaptureUiEvent);
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    int i5 = 76 / 0;
                }
                int i6 = f15360e + 47;
                f15359c = i6 % 128;
                int i7 = i6 % 2;
                return unit;
            }

            AnonymousClass3(Object obj) {
                super(1, obj, IdCaptureViewModel.class, "onEvent", "onEvent(Lcom/incode/welcome_sdk/ui/id_capture/event/IdCaptureUiEvent;)V", 0);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15355d + 1;
            f15354a = i3 % 128;
            int i4 = i3 % 2;
            d(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void d(Composer composer, int i2) throws Throwable {
            int i3 = 2 % 2;
            if ((i2 & 11) == 2) {
                int i4 = f15354a + 115;
                f15355d = i4 % 128;
                if (i4 % 2 == 0) {
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                } else {
                    composer.getSkipping();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1311464614, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreen.<anonymous> (IdCaptureScreen.kt:217)");
            }
            IdCaptureScreenKt.CaptureScreenContent(this.f15357c, new AnonymousClass3(this.f15358e), this.f15356b.getPreviewView(), composer, 512);
            if (ComposerKt.isTraceInProgress()) {
                int i5 = f15354a + 3;
                f15355d = i5 % 128;
                int i6 = i5 % 2;
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ai(State<CaptureUiState> state, IdCaptureViewModel idCaptureViewModel, IncodeCamera<DocumentAnalysisEvent> incodeCamera) {
            super(2);
            this.f15357c = state;
            this.f15358e = idCaptureViewModel;
            this.f15356b = incodeCamera;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x016f  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IdCaptureScreen(com.incode.welcome_sdk.commons.n r26, com.incode.welcome_sdk.commons.o r27, com.incode.welcome_sdk.ui.id_capture.viewmodel.InitIdCaptureViewModel r28, com.incode.welcome_sdk.modules.IdScan.IdType r29, com.incode.welcome_sdk.commons.b r30, com.incode.welcome_sdk.ui.id_capture.AudioPermissionHandler r31, androidx.compose.runtime.Composer r32, int r33) {
        /*
            Method dump skipped, instruction units count: 847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.IdCaptureScreen(com.incode.welcome_sdk.commons.n, com.incode.welcome_sdk.commons.o, com.incode.welcome_sdk.ui.id_capture.viewmodel.InitIdCaptureViewModel, com.incode.welcome_sdk.modules.IdScan$IdType, com.incode.welcome_sdk.commons.b, com.incode.welcome_sdk.ui.id_capture.AudioPermissionHandler, androidx.compose.runtime.Composer, int):void");
    }

    public static final float pxToDp(float f2, Composer composer, int i2) {
        int i3 = 2 % 2;
        composer.startReplaceableGroup(979070117);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(979070117, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.pxToDp (IdCaptureScreen.kt:223)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float fMo706toDpu2uoSUM = ((Density) objConsume).mo706toDpu2uoSUM(f2);
        if (ComposerKt.isTraceInProgress()) {
            int i4 = f15278c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f15277b = i4 % 128;
            int i5 = i4 % 2;
            ComposerKt.traceEventEnd();
            if (i5 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        composer.endReplaceableGroup();
        int i6 = f15277b + 115;
        f15278c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 57 / 0;
        }
        return fMo706toDpu2uoSUM;
    }

    private static final float a(MutableFloatState mutableFloatState) {
        float floatValue;
        int i2 = 2 % 2;
        int i3 = f15277b + 33;
        f15278c = i3 % 128;
        MutableFloatState mutableFloatState2 = mutableFloatState;
        if (i3 % 2 != 0) {
            floatValue = mutableFloatState2.getFloatValue();
            int i4 = 67 / 0;
        } else {
            floatValue = mutableFloatState2.getFloatValue();
        }
        int i5 = f15278c + 75;
        f15277b = i5 % 128;
        int i6 = i5 % 2;
        return floatValue;
    }

    private static final void c(MutableFloatState mutableFloatState, float f2) {
        int i2 = 2 % 2;
        int i3 = f15278c + 5;
        f15277b = i3 % 128;
        if (i3 % 2 != 0) {
            mutableFloatState.setFloatValue(f2);
            int i4 = f15278c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f15277b = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        mutableFloatState.setFloatValue(f2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class v extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15615a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15616b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function1<IdCaptureUiEvent, Unit> f15617c;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f15615a + 53;
            f15616b = i3 % 128;
            int i4 = i3 % 2;
            e();
            if (i4 != 0) {
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i5 = f15615a + 31;
            f15616b = i5 % 128;
            int i6 = i5 % 2;
            return unit2;
        }

        private void e() {
            int i2 = 2 % 2;
            int i3 = f15615a + 125;
            f15616b = i3 % 128;
            if (i3 % 2 == 0) {
                this.f15617c.invoke(IdCaptureUiEvent.CloseClicked.f15000d);
                int i4 = f15615a + 49;
                f15616b = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.f15617c.invoke(IdCaptureUiEvent.CloseClicked.f15000d);
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        v(Function1<? super IdCaptureUiEvent, Unit> function1) {
            super(0);
            this.f15617c = function1;
        }
    }

    static final class u extends Lambda implements Function1<AnimatedContentTransitionScope<SuggestionBoxModel>, ContentTransform> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15600a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15601b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15602c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final u f15603d = new u();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15604e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ContentTransform invoke(AnimatedContentTransitionScope<SuggestionBoxModel> animatedContentTransitionScope) {
            int i2 = 2 % 2;
            int i3 = f15604e + 55;
            f15601b = i3 % 128;
            int i4 = i3 % 2;
            ContentTransform contentTransformE = e(animatedContentTransitionScope);
            if (i4 == 0) {
                int i5 = 53 / 0;
            }
            int i6 = f15601b + 9;
            f15604e = i6 % 128;
            int i7 = i6 % 2;
            return contentTransformE;
        }

        private static ContentTransform e(AnimatedContentTransitionScope<SuggestionBoxModel> animatedContentTransitionScope) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "");
            ContentTransform contentTransform = new ContentTransform(EnterExitTransitionKt.slideInVertically$default(null, new Function1<Integer, Integer>() { // from class: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.u.3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f15610a = 1;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f15611b = 1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f15613d = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f15614e = 0;

                private static Integer b(int i3) {
                    int i4 = 2 % 2;
                    int i5 = f15613d + 33;
                    f15611b = i5 % 128;
                    int i6 = -i3;
                    Integer numValueOf = Integer.valueOf(i5 % 2 == 0 ? i6 >>> 25 : i6 / 10);
                    int i7 = f15611b + 81;
                    f15613d = i7 % 128;
                    if (i7 % 2 == 0) {
                        return numValueOf;
                    }
                    throw null;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Integer invoke(Integer num) {
                    int i3 = 2 % 2;
                    int i4 = f15611b + 17;
                    f15613d = i4 % 128;
                    int i5 = i4 % 2;
                    int iIntValue = num.intValue();
                    if (i5 == 0) {
                        return b(iIntValue);
                    }
                    b(iIntValue);
                    throw null;
                }

                static {
                    int i3 = f15614e + 83;
                    f15610a = i3 % 128;
                    int i4 = i3 % 2;
                }
            }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutVertically$default(null, new Function1<Integer, Integer>() { // from class: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.u.2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f15606b = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f15607c = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f15608d = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f15609e = 1;

                private static Integer e(int i3) {
                    int i4 = 2 % 2;
                    int i5 = f15607c + 27;
                    f15606b = i5 % 128;
                    int i6 = -i3;
                    return Integer.valueOf(i5 % 2 == 0 ? i6 >>> 110 : i6 / 10);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Integer invoke(Integer num) {
                    int i3 = 2 % 2;
                    int i4 = f15607c + 3;
                    f15606b = i4 % 128;
                    int i5 = i4 % 2;
                    Integer numE = e(num.intValue());
                    int i6 = f15607c + 79;
                    f15606b = i6 % 128;
                    if (i6 % 2 != 0) {
                        return numE;
                    }
                    throw null;
                }

                static {
                    int i3 = f15609e + 111;
                    f15608d = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 90 / 0;
                    }
                }
            }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), 0.0f, null, 4, null);
            int i3 = f15604e + 49;
            f15601b = i3 % 128;
            int i4 = i3 % 2;
            return contentTransform;
        }

        static {
            int i2 = f15600a + 115;
            f15602c = i2 % 128;
            int i3 = i2 % 2;
        }

        u() {
            super(1);
        }
    }

    static final class aa extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15300a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15301d = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ MutableFloatState f15302b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            int i2 = 2 % 2;
            int i3 = f15300a + 11;
            f15301d = i3 % 128;
            int i4 = i3 % 2;
            d(layoutCoordinates);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void d(LayoutCoordinates layoutCoordinates) {
            int i2 = 2 % 2;
            int i3 = f15300a + 65;
            f15301d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(layoutCoordinates, "");
            IdCaptureScreenKt.access$CaptureScreenContent$lambda$7(this.f15302b, Offset.m3938getYimpl(LayoutCoordinatesKt.positionInParent(layoutCoordinates)));
            int i5 = f15301d + 77;
            f15300a = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        aa(MutableFloatState mutableFloatState) {
            super(1);
            this.f15302b = mutableFloatState;
        }
    }

    static final class ac extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15309a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15310e = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<IdCaptureUiEvent, Unit> f15311b;

        private void b() {
            int i2 = 2 % 2;
            int i3 = f15309a + 19;
            f15310e = i3 % 128;
            if (i3 % 2 == 0) {
                this.f15311b.invoke(IdCaptureUiEvent.HelpClicked.f15006e);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.f15311b.invoke(IdCaptureUiEvent.HelpClicked.f15006e);
            int i4 = f15310e + 91;
            f15309a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 0 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f15310e + 57;
            f15309a = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            b();
            if (i4 != 0) {
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i5 = f15310e + 43;
            f15309a = i5 % 128;
            if (i5 % 2 == 0) {
                return unit2;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        ac(Function1<? super IdCaptureUiEvent, Unit> function1) {
            super(0);
            this.f15311b = function1;
        }
    }

    static final class ad extends Lambda implements Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15312a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15313c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function1<IdCaptureUiEvent, Unit> f15314d;

        @Override // kotlin.jvm.functions.Function4
        public final /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15313c + 55;
            f15312a = i3 % 128;
            int i4 = i3 % 2;
            c(animatedContentScope, bool.booleanValue(), composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        static final class b extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f15318c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f15319d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ Function1<IdCaptureUiEvent, Unit> f15320e;

            private void e() {
                int i2 = 2 % 2;
                int i3 = f15318c + 43;
                f15319d = i3 % 128;
                int i4 = i3 % 2;
                Function1<IdCaptureUiEvent, Unit> function1 = this.f15320e;
                if (i4 == 0) {
                    function1.invoke(IdCaptureUiEvent.HelpCloseClicked.f15007b);
                } else {
                    function1.invoke(IdCaptureUiEvent.HelpCloseClicked.f15007b);
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i2 = 2 % 2;
                int i3 = f15318c + 43;
                f15319d = i3 % 128;
                int i4 = i3 % 2;
                e();
                Unit unit = Unit.INSTANCE;
                int i5 = f15318c + 49;
                f15319d = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function1<? super IdCaptureUiEvent, Unit> function1) {
                super(0);
                this.f15320e = function1;
            }
        }

        static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f15315b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f15316c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ Function1<IdCaptureUiEvent, Unit> f15317d;

            private void c() {
                int i2 = 2 % 2;
                int i3 = f15316c + 71;
                f15315b = i3 % 128;
                int i4 = i3 % 2;
                Function1<IdCaptureUiEvent, Unit> function1 = this.f15317d;
                if (i4 != 0) {
                    function1.invoke(IdCaptureUiEvent.HelpManualScanClicked.f15011d);
                } else {
                    function1.invoke(IdCaptureUiEvent.HelpManualScanClicked.f15011d);
                    int i5 = 54 / 0;
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i2 = 2 % 2;
                int i3 = f15316c + 51;
                f15315b = i3 % 128;
                int i4 = i3 % 2;
                c();
                Unit unit = Unit.INSTANCE;
                int i5 = f15316c + 41;
                f15315b = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 75 / 0;
                }
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super IdCaptureUiEvent, Unit> function1) {
                super(0);
                this.f15317d = function1;
            }
        }

        static final class d extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f15321c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f15322d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ Function1<IdCaptureUiEvent, Unit> f15323e;

            private void e() {
                int i2 = 2 % 2;
                int i3 = f15321c + 55;
                f15322d = i3 % 128;
                if (i3 % 2 == 0) {
                    this.f15323e.invoke(IdCaptureUiEvent.HelpScanClicked.f15013a);
                    throw null;
                }
                this.f15323e.invoke(IdCaptureUiEvent.HelpScanClicked.f15013a);
                int i4 = f15321c + 95;
                f15322d = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i2 = 2 % 2;
                int i3 = f15322d + 61;
                f15321c = i3 % 128;
                int i4 = i3 % 2;
                e();
                Unit unit = Unit.INSTANCE;
                int i5 = f15321c + 49;
                f15322d = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(Function1<? super IdCaptureUiEvent, Unit> function1) {
                super(0);
                this.f15323e = function1;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void c(androidx.compose.animation.AnimatedContentScope r9, boolean r10, androidx.compose.runtime.Composer r11, int r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.ad.c(androidx.compose.animation.AnimatedContentScope, boolean, androidx.compose.runtime.Composer, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        ad(Function1<? super IdCaptureUiEvent, Unit> function1) {
            super(4);
            this.f15314d = function1;
        }
    }

    static final class z extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15632a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15633b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15634c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15635d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final z f15636e = new z();

        private static void c(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            int i2 = 2 % 2;
            int i3 = f15634c + 49;
            f15632a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
            SemanticsPropertiesKt.invisibleToUser(semanticsPropertyReceiver);
            int i5 = f15634c + 27;
            f15632a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 17 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            int i2 = 2 % 2;
            int i3 = f15634c + 121;
            f15632a = i3 % 128;
            int i4 = i3 % 2;
            c(semanticsPropertyReceiver);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f15634c + 125;
            f15632a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f15635d + 11;
            f15633b = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 83 / 0;
            }
        }

        z() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CaptureScreenContent(androidx.compose.runtime.State<com.incode.welcome_sdk.ui.id_capture.CaptureUiState> r21, kotlin.jvm.functions.Function1<? super com.incode.welcome_sdk.ui.id_capture.event.IdCaptureUiEvent, kotlin.Unit> r22, android.view.View r23, androidx.compose.runtime.Composer r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.CaptureScreenContent(androidx.compose.runtime.State, kotlin.jvm.functions.Function1, android.view.View, androidx.compose.runtime.Composer, int):void");
    }

    private static final LottieComposition d(LottieCompositionResult lottieCompositionResult) {
        int i2 = 2 % 2;
        int i3 = f15278c + 13;
        f15277b = i3 % 128;
        int i4 = i3 % 2;
        LottieComposition lottieComposition = (LottieComposition) ((State) lottieCompositionResult).getValue();
        int i5 = f15278c + 91;
        f15277b = i5 % 128;
        int i6 = i5 % 2;
        return lottieComposition;
    }

    private static final float c(LottieAnimationState lottieAnimationState) {
        int i2 = 2 % 2;
        int i3 = f15277b + 35;
        f15278c = i3 % 128;
        Object obj = null;
        State state = (State) lottieAnimationState;
        if (i3 % 2 == 0) {
            float fFloatValue = ((Number) state.getValue()).floatValue();
            int i4 = f15278c + 65;
            f15277b = i4 % 128;
            if (i4 % 2 != 0) {
                return fFloatValue;
            }
            obj.hashCode();
            throw null;
        }
        ((Number) state.getValue()).floatValue();
        obj.hashCode();
        throw null;
    }

    static final class bh extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15470a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15471d = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ LottieAnimationState f15472c;

        private Float e() {
            int i2 = 2 % 2;
            int i3 = f15470a + 63;
            f15471d = i3 % 128;
            int i4 = i3 % 2;
            float fAccess$TransitionToBackId$lambda$21$lambda$19 = IdCaptureScreenKt.access$TransitionToBackId$lambda$21$lambda$19(this.f15472c);
            if (i4 != 0) {
                return Float.valueOf(fAccess$TransitionToBackId$lambda$21$lambda$19);
            }
            Float.valueOf(fAccess$TransitionToBackId$lambda$21$lambda$19);
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Float invoke() {
            int i2 = 2 % 2;
            int i3 = f15470a + 47;
            f15471d = i3 % 128;
            if (i3 % 2 == 0) {
                e();
                throw null;
            }
            Float fE = e();
            int i4 = f15470a + 51;
            f15471d = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 36 / 0;
            }
            return fE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        bh(LottieAnimationState lottieAnimationState) {
            super(0);
            this.f15472c = lottieAnimationState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void a(androidx.compose.runtime.Composer r35, int r36) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.a(androidx.compose.runtime.Composer, int):void");
    }

    private static final void b(MutableFloatState mutableFloatState, float f2) {
        int i2 = 2 % 2;
        int i3 = f15277b + 63;
        f15278c = i3 % 128;
        int i4 = i3 % 2;
        mutableFloatState.setFloatValue(f2);
        int i5 = f15278c + 35;
        f15277b = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final float d(MutableFloatState mutableFloatState) {
        int i2 = 2 % 2;
        int i3 = f15277b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f15278c = i3 % 128;
        int i4 = i3 % 2;
        float floatValue = mutableFloatState.getFloatValue();
        int i5 = f15277b + 69;
        f15278c = i5 % 128;
        int i6 = i5 % 2;
        return floatValue;
    }

    private static final float e(State<Float> state) {
        int i2 = 2 % 2;
        int i3 = f15277b + 113;
        f15278c = i3 % 128;
        if (i3 % 2 != 0) {
            state.getValue().floatValue();
            throw null;
        }
        return state.getValue().floatValue();
    }

    static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15473b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15474e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f15475a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ AnalyzingDocumentModel f15476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ MutableFloatState f15477d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f15473b + 69;
            f15474e = i3 % 128;
            if (i3 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                IdCaptureScreenKt.access$AnalyzingDocument$lambda$24(this.f15477d, this.f15476c.getProgress());
                return Unit.INSTANCE;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IdCaptureScreenKt.access$AnalyzingDocument$lambda$24(this.f15477d, this.f15476c.getProgress());
            Unit unit = Unit.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15474e + 109;
            f15473b = i3 % 128;
            int i4 = i3 % 2;
            Object objB = b(coroutineScope, continuation);
            int i5 = f15474e + 69;
            f15473b = i5 % 128;
            int i6 = i5 % 2;
            return objB;
        }

        private Object b(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15474e + 81;
            f15473b = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f15473b + 49;
            f15474e = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            c cVar = new c(this.f15476c, this.f15477d, continuation);
            int i3 = f15473b + 101;
            f15474e = i3 % 128;
            int i4 = i3 % 2;
            return cVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AnalyzingDocumentModel analyzingDocumentModel, MutableFloatState mutableFloatState, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f15476c = analyzingDocumentModel;
            this.f15477d = mutableFloatState;
        }
    }

    static final class i extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15504a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15505b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15506c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f15507d = new i();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15508e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(DrawScope drawScope) {
            int i2 = 2 % 2;
            int i3 = f15506c + 11;
            f15508e = i3 % 128;
            int i4 = i3 % 2;
            a(drawScope);
            Unit unit = Unit.INSTANCE;
            int i5 = f15506c + 17;
            f15508e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void a(DrawScope drawScope) {
            int i2 = 2 % 2;
            int i3 = f15506c + 53;
            f15508e = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(drawScope, "");
                int i4 = 80 / 0;
            } else {
                Intrinsics.checkNotNullParameter(drawScope, "");
            }
            int i5 = f15508e + 107;
            f15506c = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        static {
            int i2 = f15504a + 109;
            f15505b = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        i() {
            super(1);
        }
    }

    static final class b extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15443a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15444d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ State<Float> f15445c;

        private Float b() {
            int i2 = 2 % 2;
            int i3 = f15444d + 107;
            f15443a = i3 % 128;
            int i4 = i3 % 2;
            Float fValueOf = Float.valueOf(IdCaptureScreenKt.access$AnalyzingDocument$lambda$25(this.f15445c));
            int i5 = f15443a + 49;
            f15444d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 45 / 0;
            }
            return fValueOf;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Float invoke() {
            int i2 = 2 % 2;
            int i3 = f15444d + 67;
            f15443a = i3 % 128;
            if (i3 % 2 != 0) {
                return b();
            }
            b();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(State<Float> state) {
            super(0);
            this.f15445c = state;
        }
    }

    static final class f extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15491a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15492b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15493c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15494d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final f f15495e = new f();

        private static void e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            int i2 = 2 % 2;
            int i3 = f15491a + 9;
            f15492b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
            SemanticsPropertiesKt.invisibleToUser(semanticsPropertyReceiver);
            int i5 = f15491a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f15492b = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            int i2 = 2 % 2;
            int i3 = f15491a + 59;
            f15492b = i3 % 128;
            int i4 = i3 % 2;
            e(semanticsPropertyReceiver);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f15491a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f15492b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 77 / 0;
            }
            return unit;
        }

        static {
            int i2 = f15493c + 79;
            f15494d = i2 % 128;
            int i3 = i2 % 2;
        }

        f() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnalyzingDocument(com.incode.welcome_sdk.ui.id_capture.AnalyzingDocumentModel r30, androidx.compose.runtime.Composer r31, int r32) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.AnalyzingDocument(com.incode.welcome_sdk.ui.id_capture.AnalyzingDocumentModel, androidx.compose.runtime.Composer, int):void");
    }

    static final class n extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15559a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15560c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ IdCaptureUiEvent f15561b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function1<IdCaptureUiEvent, Unit> f15562e;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f15559a + 113;
            f15560c = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            int i5 = f15559a + 55;
            f15560c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c() {
            int i2 = 2 % 2;
            int i3 = f15560c + 95;
            f15559a = i3 % 128;
            int i4 = i3 % 2;
            this.f15562e.invoke(this.f15561b);
            int i5 = f15559a + 73;
            f15560c = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(Function1<? super IdCaptureUiEvent, Unit> function1, IdCaptureUiEvent idCaptureUiEvent) {
            super(0);
            this.f15562e = function1;
            this.f15561b = idCaptureUiEvent;
        }
    }

    private static final void a(BoxScope boxScope, Function1<? super IdCaptureUiEvent, Unit> function1, CaptureUiState.BottomButton bottomButton, boolean z2, Function1<? super LayoutCoordinates, Unit> function12, Composer composer, int i2) {
        int i3;
        Pair pair;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2125438071);
        if ((i2 & 14) == 0) {
            if (composerStartRestartGroup.changed(boxScope)) {
                int i8 = f15278c + 17;
                f15277b = i8 % 128;
                int i9 = i8 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 0) {
            int i10 = f15278c + 1;
            f15277b = i10 % 128;
            if (i10 % 2 == 0) {
                composerStartRestartGroup.changedInstance(function1);
                throw null;
            }
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= !composerStartRestartGroup.changed(bottomButton) ? 128 : 256;
        }
        if ((i2 & 7168) == 0) {
            int i11 = f15277b + 21;
            f15278c = i11 % 128;
            if (i11 % 2 != 0) {
                composerStartRestartGroup.changed(z2);
                throw null;
            }
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 57344) == 0) {
            int i12 = f15277b + 49;
            f15278c = i12 % 128;
            int i13 = i12 % 2;
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((46811 & i3) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2125438071, i3, -1, "com.incode.welcome_sdk.ui.id_capture.view.BottomButton (IdCaptureScreen.kt:412)");
            }
            if (bottomButton == CaptureUiState.BottomButton.f14603c) {
                int i14 = f15278c + 111;
                f15277b = i14 % 128;
                if (i14 % 2 == 0) {
                    composerStartRestartGroup.startReplaceableGroup(1818683801);
                    i4 = i3 & 123;
                    i5 = (i3 >>> 2) & 19720;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1818683801);
                    i4 = i3 & 126;
                    i5 = (i3 >> 3) & 896;
                }
                e(boxScope, function1, z2, composerStartRestartGroup, i4 | i5);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(1818683860);
                int i15 = WhenMappings.f15294c[bottomButton.ordinal()];
                if (i15 == 1) {
                    pair = TuplesKt.to(IdCaptureUiEvent.ScanTheBackClicked.f15027c, Integer.valueOf(R.string.onboard_sdk_id_capture_scan_the_back));
                } else if (i15 == 2) {
                    pair = TuplesKt.to(IdCaptureUiEvent.ContinueClicked.f15002d, Integer.valueOf(R.string.onboard_sdk_btn_continue));
                } else if (i15 == 3) {
                    pair = TuplesKt.to(IdCaptureUiEvent.RetakeScanClicked.f15019b, Integer.valueOf(R.string.onboard_sdk_id_capture_retake_scan));
                } else if (i15 == 4) {
                    pair = TuplesKt.to(IdCaptureUiEvent.ScanTheFrontClicked.f15029b, Integer.valueOf(R.string.onboard_sdk_id_capture_scan_the_front));
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(("Handle missing case: " + bottomButton).toString());
                    }
                    pair = TuplesKt.to(IdCaptureUiEvent.RetryClicked.f15024e, Integer.valueOf(R.string.onboard_sdk_no_network_snackbar_action_text));
                }
                com.incode.welcome_sdk.views.b.e.e(OnGloballyPositionedModifierKt.onGloballyPositioned(WindowInsetsPadding_androidKt.navigationBarsPadding(boxScope.align(PaddingKt.m1022paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m6638constructorimpl(50.0f), 7, null), Alignment.Companion.getBottomCenter())), function12), new n(function1, (IdCaptureUiEvent) pair.component1()), StringResources_androidKt.stringResource(((Number) pair.component2()).intValue(), composerStartRestartGroup, 0), null, z2, 0.0f, composerStartRestartGroup, (i3 << 3) & 57344, 40);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            int i16 = f15278c + 109;
            f15277b = i16 % 128;
            int i17 = i16 % 2;
        } else {
            scopeUpdateScopeEndRestartGroup.updateScope(new o(boxScope, function1, bottomButton, z2, function12, i2));
            int i18 = f15277b + 95;
            f15278c = i18 % 128;
            int i19 = i18 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void e(kotlin.jvm.functions.Function0<kotlin.Unit> r82, kotlin.jvm.functions.Function0<kotlin.Unit> r83, kotlin.jvm.functions.Function0<kotlin.Unit> r84, androidx.compose.runtime.Composer r85, int r86) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.e(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    static final class aq extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15399b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15400d = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function1<IdCaptureUiEvent, Unit> f15401c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ boolean f15402e;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f15400d + 91;
            f15399b = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            int i5 = f15400d + 65;
            f15399b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c() {
            int i2 = 2 % 2;
            int i3 = f15399b + 17;
            f15400d = i3 % 128;
            int i4 = i3 % 2;
            if (!(!this.f15402e)) {
                this.f15401c.invoke(IdCaptureUiEvent.ManualCaptureClicked.f15016b);
                int i5 = f15400d + 121;
                f15399b = i5 % 128;
                int i6 = i5 % 2;
            }
            int i7 = f15399b + 35;
            f15400d = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        aq(boolean z2, Function1<? super IdCaptureUiEvent, Unit> function1) {
            super(0);
            this.f15402e = z2;
            this.f15401c = function1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void e(androidx.compose.foundation.layout.BoxScope r25, kotlin.jvm.functions.Function1<? super com.incode.welcome_sdk.ui.id_capture.event.IdCaptureUiEvent, kotlin.Unit> r26, boolean r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.e(androidx.compose.foundation.layout.BoxScope, kotlin.jvm.functions.Function1, boolean, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(androidx.compose.runtime.Composer r35, int r36) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.c(androidx.compose.runtime.Composer, int):void");
    }

    static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f15592i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f15593j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ long f15594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ MutableState<Size> f15595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ float f15596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f15597d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ CaptureUiState f15598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Function1<IdCaptureUiEvent, Unit> f15599f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f15592i + 9;
            f15593j = i3 % 128;
            int i4 = i3 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f15595b.setValue(Size.m3994boximpl(IdCaptureScreenKt.access$deriveCaptureFrameSize(this.f15598e.getCaptureFrameSpec(), this.f15596c)));
            IdCaptureScreenKt.m8494access$checkScreenSizeAndEmitIfNeededtxvA7gs(this.f15594a, this.f15595b.getValue().m4011unboximpl(), this.f15598e.getCaptureFrameSpec(), this.f15599f);
            Unit unit = Unit.INSTANCE;
            int i5 = f15592i + 43;
            f15593j = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15592i + 69;
            f15593j = i3 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 != 0) {
                c(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objC = c(coroutineScope2, continuation2);
            int i4 = f15593j + 5;
            f15592i = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 1 / 0;
            }
            return objC;
        }

        private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15592i + 55;
            f15593j = i3 % 128;
            int i4 = i3 % 2;
            t tVar = (t) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                tVar.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = tVar.invokeSuspend(unit);
            int i5 = f15593j + 17;
            f15592i = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            t tVar = new t(this.f15595b, this.f15598e, this.f15596c, this.f15594a, this.f15599f, continuation);
            int i3 = f15592i + 29;
            f15593j = i3 % 128;
            if (i3 % 2 == 0) {
                return tVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(MutableState<Size> mutableState, CaptureUiState captureUiState, float f2, long j2, Function1<? super IdCaptureUiEvent, Unit> function1, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f15595b = mutableState;
            this.f15598e = captureUiState;
            this.f15596c = f2;
            this.f15594a = j2;
            this.f15599f = function1;
        }
    }

    static final class q extends Lambda implements Function1<Context, View> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15576b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15577d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ View f15578e;

        private View a(Context context) {
            int i2 = 2 % 2;
            int i3 = f15576b + 41;
            f15577d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                return this.f15578e;
            }
            Intrinsics.checkNotNullParameter(context, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ View invoke(Context context) {
            int i2 = 2 % 2;
            int i3 = f15577d + 65;
            f15576b = i3 % 128;
            int i4 = i3 % 2;
            View viewA = a(context);
            int i5 = f15576b + 125;
            f15577d = i5 % 128;
            int i6 = i5 % 2;
            return viewA;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(View view) {
            super(1);
            this.f15578e = view;
        }
    }

    static final class p extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15571a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15572e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ float f15573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ BorderStyle f15574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ float f15575d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(DrawScope drawScope) {
            int i2 = 2 % 2;
            int i3 = f15571a + 21;
            f15572e = i3 % 128;
            int i4 = i3 % 2;
            b(drawScope);
            Unit unit = Unit.INSTANCE;
            int i5 = f15572e + 63;
            f15571a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void b(DrawScope drawScope) {
            int i2 = 2 % 2;
            int i3 = f15572e + 111;
            f15571a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(drawScope, "");
            float f2 = drawScope.mo710toPx0680j_4(this.f15573b);
            float f3 = f2 / 2.0f;
            long jSize = SizeKt.Size(Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()) - f2, Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()) - f2);
            long jOffset = OffsetKt.Offset(f3, f3);
            BorderStyle borderStyle = this.f15574c;
            if (borderStyle instanceof BorderStyle.Solid) {
                DrawScope.m4730drawRoundRectuAw5IA$default(drawScope, ((BorderStyle.Solid) borderStyle).m8482getColor0d7_KjU(), jOffset, jSize, CornerRadiusKt.CornerRadius$default(drawScope.mo710toPx0680j_4(this.f15575d), 0.0f, 2, null), new Stroke(f2, 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY, null);
                return;
            }
            if (borderStyle instanceof BorderStyle.Gradient) {
                DrawScope.m4729drawRoundRectZuiqVtQ$default(drawScope, Brush.Companion.m4129linearGradientmHitzGk$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m4168boximpl(((BorderStyle.Gradient) this.f15574c).m8478getStartColor0d7_KjU()), Color.m4168boximpl(((BorderStyle.Gradient) this.f15574c).m8477getEndColor0d7_KjU())}), OffsetKt.Offset(0.0f, Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc())), OffsetKt.Offset(Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()), 0.0f), 0, 8, (Object) null), jOffset, jSize, CornerRadiusKt.CornerRadius$default(drawScope.mo710toPx0680j_4(this.f15575d), 0.0f, 2, null), 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, 208, null);
            }
            int i5 = f15571a + 85;
            f15572e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 81 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(float f2, BorderStyle borderStyle, float f3) {
            super(1);
            this.f15573b = f2;
            this.f15574c = borderStyle;
            this.f15575d = f3;
        }
    }

    private static final void b(View view, CaptureUiState captureUiState, Function1<? super IdCaptureUiEvent, Unit> function1, Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1730337918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1730337918, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.CameraPreviewWithOverlay (IdCaptureScreen.kt:586)");
        }
        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localView);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        float width = ((View) objConsume).getWidth() * 0.88f;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m3994boximpl(access$deriveCaptureFrameSize(captureUiState.getCaptureFrameSpec(), width)), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        MutableState mutableState = (MutableState) objRememberedValue;
        ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composerStartRestartGroup.consume(localView2);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        View view2 = (View) objConsume2;
        EffectsKt.LaunchedEffect(captureUiState.getCaptureFrameSpec(), Float.valueOf(width), new t(mutableState, captureUiState, width, SizeKt.Size(view2.getWidth(), view2.getHeight()), function1, null), composerStartRestartGroup, 512);
        Modifier modifierFillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            int i4 = f15277b + 101;
            f15278c = i4 % 128;
            int i5 = i4 % 2;
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
        composerStartRestartGroup.startReplaceableGroup(-145906764);
        if (captureUiState.getShowCameraPreview()) {
            AndroidView_androidKt.AndroidView(new q(view), androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, composerStartRestartGroup, 48, 4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        if (captureUiState.getCaptureFrameImage() != null) {
            composerStartRestartGroup.startReplaceableGroup(-145906591);
            BorderStyle borderStyle = captureUiState.getCaptureFrameBorderColor().toBorderStyle(composerStartRestartGroup, 0);
            float fM6638constructorimpl = Dp.m6638constructorimpl(4.0f);
            float fM6638constructorimpl2 = Dp.m6638constructorimpl(10.0f);
            Modifier modifierClip = ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1049height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1068width3ABfNKs(androidx.compose.foundation.layout.OffsetKt.m979offsetVpY3zN4$default(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getTopCenter()), 0.0f, ((Float) c(-1895987405, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), 1895987407, new Object[]{composerStartRestartGroup}, EKYBActivity.e.e())).floatValue(), 1, null), pxToDp(Size.m4006getWidthimpl(((Size) mutableState.getValue()).m4011unboximpl()), composerStartRestartGroup, 0)), pxToDp(Size.m4003getHeightimpl(((Size) mutableState.getValue()).m4011unboximpl()), composerStartRestartGroup, 0)), RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(fM6638constructorimpl2));
            composerStartRestartGroup.startReplaceableGroup(2007071448);
            boolean zChanged = composerStartRestartGroup.changed(fM6638constructorimpl) | composerStartRestartGroup.changed(borderStyle) | composerStartRestartGroup.changed(fM6638constructorimpl2);
            p pVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || pVarRememberedValue == Composer.Companion.getEmpty()) {
                pVarRememberedValue = new p(fM6638constructorimpl, borderStyle, fM6638constructorimpl2);
                composerStartRestartGroup.updateRememberedValue(pVarRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(new BitmapPainter(captureUiState.getCaptureFrameImage(), 0L, 0L, 6, null), (String) null, DrawModifierKt.drawBehind(modifierClip, (Function1) pVarRememberedValue).then(captureUiState.getShowImageAsBlurred() ? BlurKt.m3813blur1fqSgw$default(Modifier.Companion, Dp.m6638constructorimpl(5.0f), Dp.m6638constructorimpl(5.0f), null, 4, null) : Modifier.Companion), (Alignment) null, ContentScale.Companion.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            a(boxScopeInstance, b(((Size) mutableState.getValue()).m4011unboximpl(), composerStartRestartGroup), false, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (captureUiState.getShowCaptureFrame()) {
            composerStartRestartGroup.startReplaceableGroup(-145903695);
            c(captureUiState.getCaptureFrameBorderColor().toBorderStyle(composerStartRestartGroup, 0), ((Size) mutableState.getValue()).m4011unboximpl(), 0L, composerStartRestartGroup, 0, 4);
            a(boxScopeInstance, b(((Size) mutableState.getValue()).m4011unboximpl(), composerStartRestartGroup), true, composerStartRestartGroup, 390, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-145903483);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.startReplaceableGroup(-145903470);
        if (captureUiState.getPreviewFrameImage() != null) {
            ImageKt.Image(new BitmapPainter(captureUiState.getPreviewFrameImage(), 0L, 0L, 6, null), (String) null, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, BioValidationConstants.SC_EXPIRED_SESSION_CORE, 120);
            BorderStyle borderStyle2 = captureUiState.getCaptureFrameBorderColor().toBorderStyle(composerStartRestartGroup, 0);
            long jM4011unboximpl = ((Size) mutableState.getValue()).m4011unboximpl();
            com.incode.welcome_sdk.commons.theme.h hVar = com.incode.welcome_sdk.commons.theme.h.f5694b;
            c(borderStyle2, jM4011unboximpl, com.incode.welcome_sdk.commons.theme.h.a(composerStartRestartGroup).m8045getSurfaceNeutralLight0d7_KjU(), composerStartRestartGroup, 0, 0);
            a(boxScopeInstance, b(((Size) mutableState.getValue()).m4011unboximpl(), composerStartRestartGroup), false, composerStartRestartGroup, 6, 2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-145902884);
        if (captureUiState.getShowLaserAnimation()) {
            AnimateLaserOverCapture(captureUiState.getCaptureFrameSpec(), composerStartRestartGroup, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-145902773);
        if (captureUiState.getShowFillTheFrameAnimation()) {
            c(captureUiState.getCaptureFrameSpec(), captureUiState.getDelayFillTheFrameAnimation(), composerStartRestartGroup, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-145902634);
        if (captureUiState.getShowCaptureFrameFlash()) {
            int i6 = f15278c + 17;
            f15277b = i6 % 128;
            int i7 = i6 % 2;
            Modifier modifierM1068width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1068width3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1049height3ABfNKs(androidx.compose.foundation.layout.OffsetKt.m979offsetVpY3zN4$default(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getTopCenter()), 0.0f, ((Float) c(-1895987405, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), 1895987407, new Object[]{composerStartRestartGroup}, EKYBActivity.e.e())).floatValue(), 1, null), pxToDp(Size.m4003getHeightimpl(((Size) mutableState.getValue()).m4011unboximpl()), composerStartRestartGroup, 0)), pxToDp(Size.m4006getWidthimpl(((Size) mutableState.getValue()).m4011unboximpl()), composerStartRestartGroup, 0));
            com.incode.welcome_sdk.commons.theme.h hVar2 = com.incode.welcome_sdk.commons.theme.h.f5694b;
            Modifier modifierClip2 = ClipKt.clip(ShadowCustomKt.m8429shadowCustomaBf7M2Q$default(modifierM1068width3ABfNKs, com.incode.welcome_sdk.commons.theme.h.a(composerStartRestartGroup).m8045getSurfaceNeutralLight0d7_KjU(), 0.0f, 0.0f, Dp.m6638constructorimpl(20.0f), 6, null), RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(10.0f)));
            com.incode.welcome_sdk.commons.theme.h hVar3 = com.incode.welcome_sdk.commons.theme.h.f5694b;
            BoxKt.Box(BackgroundKt.m573backgroundbw27NRU$default(modifierClip2, com.incode.welcome_sdk.commons.theme.h.a(composerStartRestartGroup).m8045getSurfaceNeutralLight0d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Integer shooterCounterValue = captureUiState.getShooterCounterValue();
        composerStartRestartGroup.startReplaceableGroup(-867827289);
        if (shooterCounterValue == null) {
            int i8 = f15278c + 47;
            f15277b = i8 % 128;
            int i9 = i8 % 2;
        } else {
            c(1958958604, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), -1958958597, new Object[]{Integer.valueOf(shooterCounterValue.intValue()), Long.valueOf(((Size) mutableState.getValue()).m4011unboximpl()), composerStartRestartGroup, 0}, EKYBActivity.e.e());
        }
        composerStartRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
            int i10 = f15278c + 123;
            f15277b = i10 % 128;
            int i11 = i10 % 2;
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new r(view, captureUiState, function1, i2));
        }
    }

    private static final void c(long j2, long j3, CaptureUiState.CaptureFrameSpec captureFrameSpec, Function1<? super IdCaptureUiEvent, Unit> function1) {
        float f2;
        int i2 = 2 % 2;
        int i3 = f15278c + 85;
        f15277b = i3 % 128;
        if (i3 % 2 == 0) {
            captureFrameSpec.getVertical();
            throw null;
        }
        if (!(!captureFrameSpec.getVertical())) {
            int i4 = f15278c + 121;
            f15277b = i4 % 128;
            int i5 = i4 % 2;
            f2 = 1.0f;
        } else {
            f2 = 1.25f;
        }
        if (Size.m4004getMaxDimensionimpl(j2) / (Size.m4004getMaxDimensionimpl(j3) * f2) < 1.9d) {
            int i6 = f15278c + 83;
            f15277b = i6 % 128;
            if (i6 % 2 != 0) {
                function1.invoke(IdCaptureUiEvent.SmallScreenDeviceDetected.f15033e);
            } else {
                function1.invoke(IdCaptureUiEvent.SmallScreenDeviceDetected.f15033e);
                throw null;
            }
        }
    }

    private static final long b(CaptureUiState.CaptureFrameSpec captureFrameSpec, float f2) {
        float f3;
        int i2 = 2 % 2;
        float multiplier = f2 * captureFrameSpec.getMultiplier();
        float ratio = multiplier / captureFrameSpec.getRatio();
        if (captureFrameSpec.getVertical()) {
            f3 = ratio;
        } else {
            int i3 = f15278c + 63;
            f15277b = i3 % 128;
            int i4 = i3 % 2;
            f3 = multiplier;
        }
        if (!(!captureFrameSpec.getVertical())) {
            int i5 = f15278c + 115;
            f15277b = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = f15277b + 79;
            f15278c = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            multiplier = ratio;
        }
        return SizeKt.Size(f3, multiplier);
    }

    private static final LottieComposition c(LottieCompositionResult lottieCompositionResult) {
        int i2 = 2 % 2;
        int i3 = f15278c + 63;
        f15277b = i3 % 128;
        State state = (State) lottieCompositionResult;
        if (i3 % 2 != 0) {
            LottieComposition lottieComposition = (LottieComposition) state.getValue();
            int i4 = f15278c + 111;
            f15277b = i4 % 128;
            if (i4 % 2 != 0) {
                return lottieComposition;
            }
            throw null;
        }
        throw null;
    }

    private static final float a(LottieAnimationState lottieAnimationState) {
        int i2 = 2 % 2;
        int i3 = f15277b + 61;
        f15278c = i3 % 128;
        int i4 = i3 % 2;
        float fFloatValue = ((Number) ((State) lottieAnimationState).getValue()).floatValue();
        int i5 = f15278c + 29;
        f15277b = i5 % 128;
        if (i5 % 2 != 0) {
            return fFloatValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class g extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15496a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15497e = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ LottieCompositionResult f15498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f15499c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ MutableFloatState f15500d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            int i2 = 2 % 2;
            int i3 = f15496a + 75;
            f15497e = i3 % 128;
            int i4 = i3 % 2;
            b(layoutCoordinates);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 30 / 0;
            }
            int i6 = f15497e + 31;
            f15496a = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[PHI: r3 r4
  0x0059: PHI (r3v1 float) = (r3v0 float), (r3v4 float), (r3v5 float) binds: [B:13:0x0056, B:7:0x0028, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r4v1 androidx.compose.runtime.MutableFloatState) = 
  (r4v0 androidx.compose.runtime.MutableFloatState)
  (r4v3 androidx.compose.runtime.MutableFloatState)
  (r4v4 androidx.compose.runtime.MutableFloatState)
 binds: [B:13:0x0056, B:7:0x0028, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0024 A[PHI: r1 r3 r4
  0x0024: PHI (r1v5 com.airbnb.lottie.LottieComposition) = (r1v2 com.airbnb.lottie.LottieComposition), (r1v8 com.airbnb.lottie.LottieComposition) binds: [B:13:0x0056, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0024: PHI (r3v4 float) = (r3v0 float), (r3v5 float) binds: [B:13:0x0056, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0024: PHI (r4v3 androidx.compose.runtime.MutableFloatState) = (r4v0 androidx.compose.runtime.MutableFloatState), (r4v4 androidx.compose.runtime.MutableFloatState) binds: [B:13:0x0056, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(androidx.compose.ui.layout.LayoutCoordinates r7) {
            /*
                r6 = this;
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.g.f15496a
                int r1 = r0 + 27
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.g.f15497e = r0
                int r1 = r1 % r5
                java.lang.String r0 = ""
                if (r1 != 0) goto L48
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                androidx.compose.runtime.MutableFloatState r4 = r6.f15500d
                int r0 = r6.f15499c
                float r3 = (float) r0
                com.airbnb.lottie.compose.LottieCompositionResult r0 = r6.f15498b
                com.airbnb.lottie.LottieComposition r1 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.access$AnimateLaserOverCapture$lambda$44(r0)
                r0 = 56
                int r0 = r0 / 0
                if (r1 == 0) goto L59
            L24:
                android.graphics.Rect r0 = r1.getBounds()
                if (r0 == 0) goto L59
                int r0 = r0.width()
                float r2 = (float) r0
                int r0 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.g.f15496a
                int r1 = r0 + 15
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.g.f15497e = r0
                int r1 = r1 % r5
            L38:
                float r3 = r3 / r2
                r4.setFloatValue(r3)
                int r0 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.g.f15496a
                int r1 = r0 + 11
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.g.f15497e = r0
                int r1 = r1 % r5
                if (r1 == 0) goto L5c
                return
            L48:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                androidx.compose.runtime.MutableFloatState r4 = r6.f15500d
                int r0 = r6.f15499c
                float r3 = (float) r0
                com.airbnb.lottie.compose.LottieCompositionResult r0 = r6.f15498b
                com.airbnb.lottie.LottieComposition r1 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.access$AnimateLaserOverCapture$lambda$44(r0)
                if (r1 == 0) goto L59
                goto L24
            L59:
                r2 = 1065353216(0x3f800000, float:1.0)
                goto L38
            L5c:
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.g.b(androidx.compose.ui.layout.LayoutCoordinates):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(MutableFloatState mutableFloatState, int i2, LottieCompositionResult lottieCompositionResult) {
            super(1);
            this.f15500d = mutableFloatState;
            this.f15499c = i2;
            this.f15498b = lottieCompositionResult;
        }
    }

    static final class h extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15501a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15502c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ LottieAnimationState f15503e;

        private Float d() {
            int i2 = 2 % 2;
            int i3 = f15501a + 19;
            f15502c = i3 % 128;
            int i4 = i3 % 2;
            Float fValueOf = Float.valueOf(IdCaptureScreenKt.access$AnimateLaserOverCapture$lambda$45(this.f15503e));
            int i5 = f15501a + 39;
            f15502c = i5 % 128;
            int i6 = i5 % 2;
            return fValueOf;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Float invoke() {
            int i2 = 2 % 2;
            int i3 = f15502c + 15;
            f15501a = i3 % 128;
            if (i3 % 2 == 0) {
                d();
                throw null;
            }
            Float fD = d();
            int i4 = f15501a + 29;
            f15502c = i4 % 128;
            if (i4 % 2 == 0) {
                return fD;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(LottieAnimationState lottieAnimationState) {
            super(0);
            this.f15503e = lottieAnimationState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AnimateLaserOverCapture(com.incode.welcome_sdk.ui.id_capture.CaptureUiState.CaptureFrameSpec r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.AnimateLaserOverCapture(com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec, androidx.compose.runtime.Composer, int):void");
    }

    static final class ah extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f15340f = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f15341h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f15342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ float f15343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ float f15344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ boolean f15345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f15346e;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ MutableFloatState f15347j;

        /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b7 -> B:10:0x001f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.ah.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15340f + 93;
            f15341h = i3 % 128;
            int i4 = i3 % 2;
            Object objD = d(coroutineScope, continuation);
            if (i4 != 0) {
                int i5 = 18 / 0;
            }
            int i6 = f15341h + 105;
            f15340f = i6 % 128;
            int i7 = i6 % 2;
            return objD;
        }

        private Object d(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15340f + 87;
            f15341h = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((ah) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i4 != 0) {
                int i5 = 99 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            ah ahVar = new ah(this.f15345d, this.f15343b, this.f15344c, this.f15347j, continuation);
            int i3 = f15341h + 93;
            f15340f = i3 % 128;
            int i4 = i3 % 2;
            return ahVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ah(boolean z2, float f2, float f3, MutableFloatState mutableFloatState, Continuation<? super ah> continuation) {
            super(2, continuation);
            this.f15345d = z2;
            this.f15343b = f2;
            this.f15344c = f3;
            this.f15347j = mutableFloatState;
        }
    }

    private static final float c(MutableFloatState mutableFloatState) {
        int i2 = 2 % 2;
        int i3 = f15278c + 51;
        f15277b = i3 % 128;
        int i4 = i3 % 2;
        float floatValue = mutableFloatState.getFloatValue();
        int i5 = f15278c + 61;
        f15277b = i5 % 128;
        int i6 = i5 % 2;
        return floatValue;
    }

    private static /* synthetic */ Object f(Object[] objArr) {
        MutableFloatState mutableFloatState = (MutableFloatState) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i2 = 2 % 2;
        int i3 = f15277b + 121;
        f15278c = i3 % 128;
        if (i3 % 2 != 0) {
            mutableFloatState.setFloatValue(fFloatValue);
            int i4 = 62 / 0;
            return null;
        }
        mutableFloatState.setFloatValue(fFloatValue);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(com.incode.welcome_sdk.ui.id_capture.CaptureUiState.CaptureFrameSpec r19, boolean r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.c(com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec, boolean, androidx.compose.runtime.Composer, int):void");
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        Composer composer = (Composer) objArr[0];
        int i2 = 2 % 2;
        int i3 = f15277b + 65;
        f15278c = i3 % 128;
        if (i3 % 2 != 0) {
            composer.startReplaceableGroup(836389777);
            ComposerKt.isTraceInProgress();
            throw null;
        }
        composer.startReplaceableGroup(836389777);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(836389777, 0, -1, "com.incode.welcome_sdk.ui.id_capture.view.getCaptureFrameYInDp (IdCaptureScreen.kt:857)");
            int i4 = f15278c + 103;
            f15277b = i4 % 128;
            int i5 = i4 % 2;
        }
        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localView);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float height = ((View) objConsume).getHeight();
        ProvidableCompositionLocal<Float> providableCompositionLocal = f15279d;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float fPxToDp = pxToDp(height / ((Number) objConsume2).floatValue(), composer, 0);
        if (!(!ComposerKt.isTraceInProgress())) {
            int i6 = f15277b + 63;
            f15278c = i6 % 128;
            int i7 = i6 % 2;
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return Float.valueOf(fPxToDp);
    }

    private static final float b(long j2, Composer composer) {
        int i2 = 2 % 2;
        composer.startReplaceableGroup(-1922829656);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1922829656, 0, -1, "com.incode.welcome_sdk.ui.id_capture.view.getEncryptedDisclaimerYInDp (IdCaptureScreen.kt:860)");
        }
        int iE = EKYBActivity.e.e();
        int iE2 = EKYBActivity.e.e();
        float fM6638constructorimpl = Dp.m6638constructorimpl(Dp.m6638constructorimpl(((Float) c(-1895987405, EKYBActivity.e.e(), iE, iE2, 1895987407, new Object[]{composer}, EKYBActivity.e.e())).floatValue() + pxToDp(Size.m4003getHeightimpl(j2), composer, 0)) + Dp.m6638constructorimpl(12.0f));
        if (ComposerKt.isTraceInProgress()) {
            int i3 = f15278c + 89;
            f15277b = i3 % 128;
            int i4 = i3 % 2;
            ComposerKt.traceEventEnd();
            int i5 = f15278c + 15;
            f15277b = i5 % 128;
            int i6 = i5 % 2;
        }
        composer.endReplaceableGroup();
        return fM6638constructorimpl;
    }

    private static final float e(MutableFloatState mutableFloatState) {
        int i2 = 2 % 2;
        int i3 = f15278c + 89;
        f15277b = i3 % 128;
        int i4 = i3 % 2;
        float floatValue = mutableFloatState.getFloatValue();
        int i5 = f15277b + 41;
        f15278c = i5 % 128;
        int i6 = i5 % 2;
        return floatValue;
    }

    private static final void e(MutableFloatState mutableFloatState, float f2) {
        int i2 = 2 % 2;
        int i3 = f15278c + 107;
        f15277b = i3 % 128;
        int i4 = i3 % 2;
        mutableFloatState.setFloatValue(f2);
        int i5 = f15278c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f15277b = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void a(MutableFloatState mutableFloatState, float f2) {
        int i2 = 2 % 2;
        int i3 = f15277b + 93;
        f15278c = i3 % 128;
        int i4 = i3 % 2;
        mutableFloatState.setFloatValue(f2);
        int i5 = f15277b + 111;
        f15278c = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final float b(MutableFloatState mutableFloatState) {
        int i2 = 2 % 2;
        int i3 = f15278c + 51;
        f15277b = i3 % 128;
        int i4 = i3 % 2;
        float floatValue = mutableFloatState.getFloatValue();
        int i5 = f15277b + 83;
        f15278c = i5 % 128;
        int i6 = i5 % 2;
        return floatValue;
    }

    static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f15513f = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f15514h = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Animatable<Float, AnimationVector1D> f15515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f15516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ long f15517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ MutableFloatState f15518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f15519e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ MutableFloatState f15520g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Animatable<Float, AnimationVector1D> f15521i;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$k$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f15532i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f15533j = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ SpringSpec<Float> f15534a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f15535b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Animatable<Float, AnimationVector1D> f15536c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ long f15537d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ MutableFloatState f15538e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                int i3 = f15532i + 29;
                f15533j = i3 % 128;
                if (i3 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.f15535b;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable<Float, AnimationVector1D> animatable = this.f15536c;
                    Float fBoxFloat = Boxing.boxFloat(Size.m4006getWidthimpl(this.f15537d));
                    SpringSpec<Float> springSpec = this.f15534a;
                    final MutableFloatState mutableFloatState = this.f15538e;
                    this.f15535b = 1;
                    if (Animatable.animateTo$default(animatable, fBoxFloat, springSpec, null, new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.k.4.3

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private static int f15539c = 0;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static int f15540d = 1;

                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable2) {
                            int i5 = 2 % 2;
                            int i6 = f15539c + 65;
                            f15540d = i6 % 128;
                            int i7 = i6 % 2;
                            b(animatable2);
                            Unit unit = Unit.INSTANCE;
                            if (i7 != 0) {
                                return unit;
                            }
                            throw null;
                        }

                        private void b(Animatable<Float, AnimationVector1D> animatable2) {
                            int i5 = 2 % 2;
                            int i6 = f15540d + 69;
                            f15539c = i6 % 128;
                            if (i6 % 2 != 0) {
                                Intrinsics.checkNotNullParameter(animatable2, "");
                                IdCaptureScreenKt.access$CameraCaptureFrame_XaN_1jA$lambda$61(mutableFloatState, animatable2.getValue().floatValue());
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            Intrinsics.checkNotNullParameter(animatable2, "");
                            IdCaptureScreenKt.access$CameraCaptureFrame_XaN_1jA$lambda$61(mutableFloatState, animatable2.getValue().floatValue());
                            int i7 = f15540d + 73;
                            f15539c = i7 % 128;
                            int i8 = i7 % 2;
                        }

                        {
                            super(1);
                        }
                    }, this, 4, null) == coroutine_suspended) {
                        int i5 = f15533j + 1;
                        f15532i = i5 % 128;
                        if (i5 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Unit unit = Unit.INSTANCE;
                int i6 = f15532i + 3;
                f15533j = i6 % 128;
                int i7 = i6 % 2;
                return unit;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f15533j + 71;
                f15532i = i3 % 128;
                int i4 = i3 % 2;
                Object objA = a(coroutineScope, continuation);
                if (i4 != 0) {
                    int i5 = 57 / 0;
                }
                int i6 = f15533j + 61;
                f15532i = i6 % 128;
                if (i6 % 2 == 0) {
                    return objA;
                }
                throw null;
            }

            private Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f15532i + 55;
                f15533j = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i5 = f15533j + 107;
                f15532i = i5 % 128;
                if (i5 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.f15536c, this.f15537d, this.f15534a, this.f15538e, continuation);
                int i3 = f15532i + 101;
                f15533j = i3 % 128;
                int i4 = i3 % 2;
                return anonymousClass4;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Animatable<Float, AnimationVector1D> animatable, long j2, SpringSpec<Float> springSpec, MutableFloatState mutableFloatState, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.f15536c = animatable;
                this.f15537d = j2;
                this.f15534a = springSpec;
                this.f15538e = mutableFloatState;
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$k$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static int f15522h = 1;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f15523j = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f15524a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ long f15525b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ MutableFloatState f15526c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ SpringSpec<Float> f15527d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ Animatable<Float, AnimationVector1D> f15528e;

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
            
                if (r0 == 1) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
            
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
            
                if (r1 == 1) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
            
                kotlin.ResultKt.throwOnFailure(r14);
                r1 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.k.AnonymousClass1.f15522h + 63;
                com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.k.AnonymousClass1.f15523j = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    r4 = 2
                    int r0 = r4 % r4
                    int r0 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.k.AnonymousClass1.f15523j
                    int r1 = r0 + 37
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.k.AnonymousClass1.f15522h = r0
                    int r1 = r1 % r4
                    r3 = 1
                    if (r1 != 0) goto L2c
                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r13.f15524a
                    r0 = 10
                    int r0 = r0 / 0
                    if (r1 == 0) goto L37
                    if (r1 != r3) goto L6b
                L1d:
                    kotlin.ResultKt.throwOnFailure(r14)
                    int r0 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.k.AnonymousClass1.f15522h
                    int r1 = r0 + 63
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.k.AnonymousClass1.f15523j = r0
                    int r1 = r1 % r4
                L29:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L2c:
                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r13.f15524a
                    if (r0 == 0) goto L37
                    if (r0 != r3) goto L6b
                    goto L1d
                L37:
                    kotlin.ResultKt.throwOnFailure(r14)
                    androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r5 = r13.f15528e
                    long r0 = r13.f15525b
                    float r0 = androidx.compose.ui.geometry.Size.m4003getHeightimpl(r0)
                    java.lang.Float r6 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r0)
                    androidx.compose.animation.core.SpringSpec<java.lang.Float> r7 = r13.f15527d
                    androidx.compose.animation.core.AnimationSpec r7 = (androidx.compose.animation.core.AnimationSpec) r7
                    com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$k$1$4 r9 = new com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$k$1$4
                    androidx.compose.runtime.MutableFloatState r0 = r13.f15526c
                    r9.<init>()
                    kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
                    r10 = r13
                    kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
                    r13.f15524a = r3
                    r8 = 0
                    r11 = 4
                    r12 = 0
                    java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, r8, r9, r10, r11, r12)
                    if (r0 != r2) goto L29
                    int r0 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.k.AnonymousClass1.f15523j
                    int r1 = r0 + 51
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.k.AnonymousClass1.f15522h = r0
                    int r1 = r1 % r4
                    return r2
                L6b:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.k.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f15523j + 85;
                f15522h = i3 % 128;
                int i4 = i3 % 2;
                Object objB = b(coroutineScope, continuation);
                int i5 = f15522h + 85;
                f15523j = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 82 / 0;
                }
                return objB;
            }

            private Object b(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f15522h + 55;
                f15523j = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                if (i4 != 0) {
                    int i5 = 35 / 0;
                }
                int i6 = f15523j + 77;
                f15522h = i6 % 128;
                if (i6 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15528e, this.f15525b, this.f15527d, this.f15526c, continuation);
                int i3 = f15522h + 27;
                f15523j = i3 % 128;
                if (i3 % 2 == 0) {
                    return anonymousClass1;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, long j2, SpringSpec<Float> springSpec, MutableFloatState mutableFloatState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.f15528e = animatable;
                this.f15525b = j2;
                this.f15527d = springSpec;
                this.f15526c = mutableFloatState;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f15519e;
            SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.75f, 200.0f, null, 4, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(this.f15515a, this.f15517c, springSpecSpring$default, this.f15518d, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.f15521i, this.f15517c, springSpecSpring$default, this.f15520g, null), 3, null);
            Unit unit = Unit.INSTANCE;
            int i3 = f15514h + 25;
            f15513f = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15514h + 85;
            f15513f = i3 % 128;
            int i4 = i3 % 2;
            Object objA = a(coroutineScope, continuation);
            int i5 = f15514h + 71;
            f15513f = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 34 / 0;
            }
            return objA;
        }

        private Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f15514h + 123;
            f15513f = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f15513f + 23;
            f15514h = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            k kVar = new k(this.f15515a, this.f15517c, this.f15518d, this.f15521i, this.f15520g, continuation);
            kVar.f15519e = obj;
            k kVar2 = kVar;
            int i3 = f15513f + 23;
            f15514h = i3 % 128;
            int i4 = i3 % 2;
            return kVar2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Animatable<Float, AnimationVector1D> animatable, long j2, MutableFloatState mutableFloatState, Animatable<Float, AnimationVector1D> animatable2, MutableFloatState mutableFloatState2, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f15515a = animatable;
            this.f15517c = j2;
            this.f15518d = mutableFloatState;
            this.f15521i = animatable2;
            this.f15520g = mutableFloatState2;
        }
    }

    static final class m extends Lambda implements Function1<ContentDrawScope, Unit> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f15546g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f15547h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ long f15548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ float f15549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ BorderStyle f15550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Animatable<Float, AnimationVector1D> f15551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Animatable<Float, AnimationVector1D> f15552e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
            int i2 = 2 % 2;
            int i3 = f15546g + 13;
            f15547h = i3 % 128;
            int i4 = i3 % 2;
            b(contentDrawScope);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void b(ContentDrawScope contentDrawScope) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(contentDrawScope, "");
            contentDrawScope.drawContent();
            final long jSize = SizeKt.Size(this.f15552e.getValue().floatValue(), this.f15551d.getValue().floatValue());
            final float f2 = contentDrawScope.mo710toPx0680j_4(Dp.m6638constructorimpl(10.0f));
            final long jOffset = OffsetKt.Offset((Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) - this.f15552e.getValue().floatValue()) / 2.0f, Size.m4003getHeightimpl(contentDrawScope.mo4734getSizeNHjbRc()) / this.f15549b);
            ContentDrawScope contentDrawScope2 = contentDrawScope;
            final long j2 = this.f15548a;
            DrawWithLayerKt.drawWithLayer(contentDrawScope2, new Function1<DrawScope, Unit>() { // from class: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.m.3

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f15553d = 0;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private static int f15554g = 1;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(DrawScope drawScope) {
                    int i3 = 2 % 2;
                    int i4 = f15553d + 101;
                    f15554g = i4 % 128;
                    int i5 = i4 % 2;
                    b(drawScope);
                    Unit unit = Unit.INSTANCE;
                    if (i5 == 0) {
                        throw null;
                    }
                    int i6 = f15554g + 89;
                    f15553d = i6 % 128;
                    int i7 = i6 % 2;
                    return unit;
                }

                private void b(DrawScope drawScope) {
                    int i3 = 2 % 2;
                    int i4 = f15554g + 11;
                    f15553d = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.checkNotNullParameter(drawScope, "");
                    DrawScope.m4728drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, 0.0f, null, null, 0, 126, null);
                    long jCornerRadius$default = CornerRadiusKt.CornerRadius$default(f2, 0.0f, 2, null);
                    DrawScope.m4730drawRoundRectuAw5IA$default(drawScope, Color.Companion.m4213getTransparent0d7_KjU(), jOffset, jSize, jCornerRadius$default, null, 0.0f, null, BlendMode.Companion.m4118getSrcIn0nO6VwU(), PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, null);
                    int i6 = f15554g + 29;
                    f15553d = i6 % 128;
                    int i7 = i6 % 2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            float f3 = contentDrawScope.mo710toPx0680j_4(Dp.m6638constructorimpl(4.0f));
            float f4 = f3 / 2.0f;
            long jOffset2 = OffsetKt.Offset(((Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) - this.f15552e.getValue().floatValue()) / 2.0f) + f4, (Size.m4003getHeightimpl(contentDrawScope.mo4734getSizeNHjbRc()) / this.f15549b) + f4);
            long jSize2 = SizeKt.Size(this.f15552e.getValue().floatValue() - f3, this.f15551d.getValue().floatValue() - f3);
            float f5 = f2 - f4;
            BorderStyle borderStyle = this.f15550c;
            if (borderStyle instanceof BorderStyle.Solid) {
                DrawScope.m4730drawRoundRectuAw5IA$default(contentDrawScope2, ((BorderStyle.Solid) borderStyle).m8482getColor0d7_KjU(), jOffset2, jSize2, CornerRadiusKt.CornerRadius$default(f5, 0.0f, 2, null), new Stroke(f3, 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY, null);
            } else if (borderStyle instanceof BorderStyle.Gradient) {
                DrawScope.m4729drawRoundRectZuiqVtQ$default(contentDrawScope2, Brush.Companion.m4129linearGradientmHitzGk$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m4168boximpl(((BorderStyle.Gradient) this.f15550c).m8478getStartColor0d7_KjU()), Color.m4168boximpl(((BorderStyle.Gradient) this.f15550c).m8477getEndColor0d7_KjU())}), OffsetKt.Offset(Offset.m3937getXimpl(jOffset2), Offset.m3938getYimpl(jOffset2) + Size.m4003getHeightimpl(jSize2)), OffsetKt.Offset(Offset.m3937getXimpl(jOffset2) + Size.m4006getWidthimpl(jSize2), Offset.m3938getYimpl(jOffset2)), 0, 8, (Object) null), jOffset2, jSize2, CornerRadiusKt.CornerRadius$default(f5, 0.0f, 2, null), 0.0f, new Stroke(f3, 0.0f, 0, 0, null, 30, null), null, 0, 208, null);
                int i3 = f15547h + 47;
                f15546g = i3 % 128;
                int i4 = i3 % 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, float f2, BorderStyle borderStyle, long j2) {
            super(1);
            this.f15552e = animatable;
            this.f15551d = animatable2;
            this.f15549b = f2;
            this.f15550c = borderStyle;
            this.f15548a = j2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(com.incode.welcome_sdk.ui.id_capture.BorderStyle r19, long r20, long r22, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.c(com.incode.welcome_sdk.ui.id_capture.BorderStyle, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    static final class az extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15438a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15439b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15440c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15441d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final az f15442e = new az();

        private static void e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            int i2 = 2 % 2;
            int i3 = f15439b + 3;
            f15441d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
            SemanticsPropertiesKt.m5951setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m5924getAssertive0phEisY());
            int i5 = f15441d + 83;
            f15439b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            int i2 = 2 % 2;
            int i3 = f15439b + 55;
            f15441d = i3 % 128;
            int i4 = i3 % 2;
            e(semanticsPropertyReceiver);
            Unit unit = Unit.INSTANCE;
            int i5 = f15439b + 3;
            f15441d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f15438a + 109;
            f15440c = i2 % 128;
            int i3 = i2 % 2;
        }

        az() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r41) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.b(java.lang.Object[]):java.lang.Object");
    }

    static final class a extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15297a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15298d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ AcceptedDocumentsUiState f15299b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
            int i2 = 2 % 2;
            int i3 = f15298d + 71;
            f15297a = i3 % 128;
            int i4 = i3 % 2;
            c(lazyListScope);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private void c(LazyListScope lazyListScope) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(lazyListScope, "");
            final List<com.incode.welcome_sdk.data.remote.beans.c> acceptedDocuments = this.f15299b.getAcceptedDocuments();
            final AcceptedDocumentsUiState acceptedDocumentsUiState = this.f15299b;
            lazyListScope.items(acceptedDocuments.size(), null, new Function1<Integer, Object>() { // from class: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$AcceptedDocuments$1$2$1$invoke$$inlined$itemsIndexed$default$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f15286b = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f15287c = 0;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Integer num) {
                    int i3 = 2 % 2;
                    int i4 = f15286b + 57;
                    f15287c = i4 % 128;
                    int i5 = i4 % 2;
                    Object objInvoke = invoke(num.intValue());
                    int i6 = f15286b + 87;
                    f15287c = i6 % 128;
                    int i7 = i6 % 2;
                    return objInvoke;
                }

                public final Object invoke(int i3) {
                    int i4 = 2 % 2;
                    int i5 = f15287c + 125;
                    f15286b = i5 % 128;
                    int i6 = i5 % 2;
                    acceptedDocuments.get(i3);
                    int i7 = f15287c + 89;
                    f15286b = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 50 / 0;
                    }
                    return null;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$AcceptedDocuments$1$2$1$invoke$$inlined$itemsIndexed$default$3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f15289a = 1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f15290d = 0;

                @Override // kotlin.jvm.functions.Function4
                public final /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    int i3 = 2 % 2;
                    int i4 = f15290d + 97;
                    f15289a = i4 % 128;
                    int i5 = i4 % 2;
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    Unit unit = Unit.INSTANCE;
                    if (i5 != 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x011e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke(androidx.compose.foundation.lazy.LazyItemScope r42, int r43, androidx.compose.runtime.Composer r44, int r45) {
                    /*
                        Method dump skipped, instruction units count: 613
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$AcceptedDocuments$1$2$1$invoke$$inlined$itemsIndexed$default$3.invoke(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }
            }));
            int i3 = f15298d + 43;
            f15297a = i3 % 128;
            int i4 = i3 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AcceptedDocumentsUiState acceptedDocumentsUiState) {
            super(1);
            this.f15299b = acceptedDocumentsUiState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03ed  */
    /* JADX INFO: renamed from: AcceptedDocuments-TDGSqEk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m8489AcceptedDocumentsTDGSqEk(androidx.compose.foundation.layout.BoxScope r39, com.incode.welcome_sdk.ui.id_capture.AcceptedDocumentsUiState r40, float r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.m8489AcceptedDocumentsTDGSqEk(androidx.compose.foundation.layout.BoxScope, com.incode.welcome_sdk.ui.id_capture.AcceptedDocumentsUiState, float, androidx.compose.runtime.Composer, int):void");
    }

    static final class y extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15627a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final y f15628b = new y();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15629c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15630d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15631e = 1;

        private static void a(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            int i2 = 2 % 2;
            int i3 = f15631e + 121;
            f15627a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
            SemanticsPropertiesKt.m5951setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m5924getAssertive0phEisY());
            int i5 = f15627a + 121;
            f15631e = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            int i2 = 2 % 2;
            int i3 = f15627a + 7;
            f15631e = i3 % 128;
            int i4 = i3 % 2;
            a(semanticsPropertyReceiver);
            Unit unit = Unit.INSTANCE;
            int i5 = f15631e + 97;
            f15627a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 97 / 0;
            }
            return unit;
        }

        static {
            int i2 = f15629c + 73;
            f15630d = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 16 / 0;
            }
        }

        y() {
            super(1);
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        State state = (LottieCompositionResult) objArr[0];
        int i2 = 2 % 2;
        int i3 = f15277b + 33;
        f15278c = i3 % 128;
        State state2 = state;
        if (i3 % 2 == 0) {
            return (LottieComposition) state2.getValue();
        }
        int i4 = 56 / 0;
        return (LottieComposition) state2.getValue();
    }

    private static final float e(LottieAnimationState lottieAnimationState) {
        int i2 = 2 % 2;
        int i3 = f15277b + 83;
        f15278c = i3 % 128;
        int i4 = i3 % 2;
        float fFloatValue = ((Number) ((State) lottieAnimationState).getValue()).floatValue();
        int i5 = f15278c + 73;
        f15277b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return fFloatValue;
    }

    static final class w extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15618a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15619d = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ LottieAnimationState f15620c;

        private Float d() {
            int i2 = 2 % 2;
            int i3 = f15619d + 33;
            f15618a = i3 % 128;
            int i4 = i3 % 2;
            Float fValueOf = Float.valueOf(IdCaptureScreenKt.access$CaptureHintBox$lambda$78$lambda$77$lambda$76$lambda$74(this.f15620c));
            int i5 = f15618a + 39;
            f15619d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
            }
            return fValueOf;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Float invoke() {
            int i2 = 2 % 2;
            int i3 = f15618a + 35;
            f15619d = i3 % 128;
            int i4 = i3 % 2;
            Float fD = d();
            int i5 = f15619d + 49;
            f15618a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 57 / 0;
            }
            return fD;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(LottieAnimationState lottieAnimationState) {
            super(0);
            this.f15620c = lottieAnimationState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0672  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void b(java.lang.String r37, java.lang.String r38, int r39, androidx.compose.runtime.Composer r40, int r41) {
        /*
            Method dump skipped, instruction units count: 1727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.b(java.lang.String, java.lang.String, int, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void a(androidx.compose.foundation.layout.BoxScope r59, float r60, boolean r61, androidx.compose.runtime.Composer r62, int r63, int r64) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.a(androidx.compose.foundation.layout.BoxScope, float, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    private static /* synthetic */ Object h(Object[] objArr) {
        Composer composer = (Composer) objArr[0];
        int i2 = 2 % 2;
        int i3 = f15277b + 49;
        f15278c = i3 % 128;
        int i4 = i3 % 2;
        composer.startReplaceableGroup(397769920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(397769920, 0, -1, "com.incode.welcome_sdk.ui.id_capture.view.feedbackTitleStyle (IdCaptureScreen.kt:1237)");
        }
        com.incode.welcome_sdk.commons.theme.h hVar = com.incode.welcome_sdk.commons.theme.h.f5694b;
        TextStyle textStyle = (TextStyle) com.incode.welcome_sdk.commons.theme.j.c(-212839610, new Object[]{com.incode.welcome_sdk.commons.theme.h.d(composer)}, BaseView.DefaultImpls.e(), 212839610, BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e());
        com.incode.welcome_sdk.commons.theme.h hVar2 = com.incode.welcome_sdk.commons.theme.h.f5694b;
        TextStyle textStyleM6136copyp1EtxEg$default = TextStyle.m6136copyp1EtxEg$default(textStyle, com.incode.welcome_sdk.commons.theme.h.b(composer).m7957getGray00d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
            int i5 = f15277b + 1;
            f15278c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 5;
            }
        }
        composer.endReplaceableGroup();
        int i7 = f15278c + 43;
        f15277b = i7 % 128;
        if (i7 % 2 != 0) {
            return textStyleM6136copyp1EtxEg$default;
        }
        throw null;
    }

    private static final TextStyle b(Composer composer) {
        int i2 = 2 % 2;
        int i3 = f15277b + 117;
        f15278c = i3 % 128;
        int i4 = i3 % 2;
        composer.startReplaceableGroup(1696914310);
        if (ComposerKt.isTraceInProgress()) {
            int i5 = f15277b + 3;
            f15278c = i5 % 128;
            int i6 = i5 % 2;
            ComposerKt.traceEventStart(1696914310, 0, -1, "com.incode.welcome_sdk.ui.id_capture.view.feedbackSubtitleStyle (IdCaptureScreen.kt:1241)");
        }
        com.incode.welcome_sdk.commons.theme.h hVar = com.incode.welcome_sdk.commons.theme.h.f5694b;
        TextStyle textStyleG = com.incode.welcome_sdk.commons.theme.h.d(composer).g();
        com.incode.welcome_sdk.commons.theme.h hVar2 = com.incode.welcome_sdk.commons.theme.h.f5694b;
        TextStyle textStyleM6136copyp1EtxEg$default = TextStyle.m6136copyp1EtxEg$default(textStyleG, com.incode.welcome_sdk.commons.theme.h.b(composer).m7960getGray3000d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
            int i7 = f15277b + 123;
            f15278c = i7 % 128;
            int i8 = i7 % 2;
        }
        composer.endReplaceableGroup();
        return textStyleM6136copyp1EtxEg$default;
    }

    private static final TextStyle b(boolean z2, Composer composer, int i2) {
        TextStyle textStyleM6136copyp1EtxEg$default;
        int i3 = 2 % 2;
        composer.startReplaceableGroup(-1303575239);
        if (ComposerKt.isTraceInProgress()) {
            int i4 = f15278c + 121;
            f15277b = i4 % 128;
            int i5 = i4 % 2;
            ComposerKt.traceEventStart(-1303575239, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.infoTitleStyle (IdCaptureScreen.kt:1244)");
            if (i5 == 0) {
                int i6 = 63 / 0;
            }
        }
        if (z2) {
            composer.startReplaceableGroup(32086136);
            com.incode.welcome_sdk.commons.theme.h hVar = com.incode.welcome_sdk.commons.theme.h.f5694b;
            TextStyle textStyle = (TextStyle) com.incode.welcome_sdk.commons.theme.j.c(-212839610, new Object[]{com.incode.welcome_sdk.commons.theme.h.d(composer)}, BaseView.DefaultImpls.e(), 212839610, BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e());
            com.incode.welcome_sdk.commons.theme.h hVar2 = com.incode.welcome_sdk.commons.theme.h.f5694b;
            textStyleM6136copyp1EtxEg$default = TextStyle.m6136copyp1EtxEg$default(textStyle, com.incode.welcome_sdk.commons.theme.h.b(composer).m7957getGray00d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(32086220);
            com.incode.welcome_sdk.commons.theme.h hVar3 = com.incode.welcome_sdk.commons.theme.h.f5694b;
            textStyleM6136copyp1EtxEg$default = (TextStyle) com.incode.welcome_sdk.commons.theme.j.c(-212839610, new Object[]{com.incode.welcome_sdk.commons.theme.h.d(composer)}, BaseView.DefaultImpls.e(), 212839610, BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e());
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            int i7 = f15277b + 19;
            f15278c = i7 % 128;
            int i8 = i7 % 2;
            ComposerKt.traceEventEnd();
            if (i8 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        composer.endReplaceableGroup();
        int i9 = f15277b + 25;
        f15278c = i9 % 128;
        int i10 = i9 % 2;
        return textStyleM6136copyp1EtxEg$default;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        TextStyle textStyleG;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        Composer composer = (Composer) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = f15277b + 109;
        f15278c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            composer.startReplaceableGroup(-27022527);
            ComposerKt.isTraceInProgress();
            obj.hashCode();
            throw null;
        }
        composer.startReplaceableGroup(-27022527);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-27022527, iIntValue, -1, "com.incode.welcome_sdk.ui.id_capture.view.infoSubtitleStyle (IdCaptureScreen.kt:1252)");
        }
        if (zBooleanValue) {
            composer.startReplaceableGroup(-10004164);
            com.incode.welcome_sdk.commons.theme.h hVar = com.incode.welcome_sdk.commons.theme.h.f5694b;
            TextStyle textStyleG2 = com.incode.welcome_sdk.commons.theme.h.d(composer).g();
            com.incode.welcome_sdk.commons.theme.h hVar2 = com.incode.welcome_sdk.commons.theme.h.f5694b;
            textStyleG = TextStyle.m6136copyp1EtxEg$default(textStyleG2, com.incode.welcome_sdk.commons.theme.h.b(composer).m7960getGray3000d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-10004070);
            com.incode.welcome_sdk.commons.theme.h hVar3 = com.incode.welcome_sdk.commons.theme.h.f5694b;
            textStyleG = com.incode.welcome_sdk.commons.theme.h.d(composer).g();
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            int i4 = f15277b + 123;
            f15278c = i4 % 128;
            int i5 = i4 % 2;
            ComposerKt.traceEventEnd();
            if (i5 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        composer.endReplaceableGroup();
        int i6 = f15278c + 53;
        f15277b = i6 % 128;
        int i7 = i6 % 2;
        return textStyleG;
    }

    static final class ap extends Lambda implements Function1<IdCaptureUiEvent, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15394a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15395b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15396c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ap f15397d = new ap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15398e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(IdCaptureUiEvent idCaptureUiEvent) {
            int i2 = 2 % 2;
            int i3 = f15395b + 69;
            f15394a = i3 % 128;
            int i4 = i3 % 2;
            c(idCaptureUiEvent);
            Unit unit = Unit.INSTANCE;
            int i5 = f15395b + 103;
            f15394a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void c(IdCaptureUiEvent idCaptureUiEvent) {
            int i2 = 2 % 2;
            int i3 = f15394a + 71;
            f15395b = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(idCaptureUiEvent, "");
            } else {
                Intrinsics.checkNotNullParameter(idCaptureUiEvent, "");
                int i4 = 36 / 0;
            }
        }

        static {
            int i2 = f15398e + 71;
            f15396c = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        ap() {
            super(1);
        }
    }

    private static final void d(Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f15278c + 107;
        f15277b = i4 % 128;
        int i5 = i4 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(364769673);
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(364769673, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.PreviewCaptureScreenSmallEstate (IdCaptureScreen.kt:1260)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(StateFlowKt.MutableStateFlow(CaptureUiState.f14575e.Loading(new CaptureUiState(false, null, null, null, false, false, null, null, false, null, null, false, false, false, null, false, null, false, false, false, false, null, false, null, null, null, 67108863, null), null, true, CloseButtonPosition.TOP_LEFT, HelpButtonPosition.BOTTOM_RIGHT)), null, composerStartRestartGroup, 8, 1);
            ap apVar = ap.f15397d;
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CaptureScreenContent(stateCollectAsState, apVar, (View) objConsume, composerStartRestartGroup, 560);
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f15277b + 61;
                f15278c = i6 % 128;
                int i7 = i6 % 2;
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ao(i2));
            int i8 = f15278c + 23;
            f15277b = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i9 = f15278c + 85;
        f15277b = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 51 / 0;
        }
    }

    static final class at extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final at f15414a = new at();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15415b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15416c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15417d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15418e = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f15415b + 83;
            f15417d = i3 % 128;
            int i4 = i3 % 2;
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        static {
            int i2 = f15416c + 51;
            f15418e = i2 % 128;
            int i3 = i2 % 2;
        }

        at() {
            super(0);
        }
    }

    static final class au extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15419a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final au f15420b = new au();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15421c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15422d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15423e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f15422d + 91;
            f15419a = i3 % 128;
            int i4 = i3 % 2;
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        static {
            int i2 = f15421c + 7;
            f15423e = i2 % 128;
            int i3 = i2 % 2;
        }

        au() {
            super(0);
        }
    }

    static final class av extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15424a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15425b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15426c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15427d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final av f15428e = new av();

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f15427d + 51;
            f15424a = i3 % 128;
            int i4 = i3 % 2;
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f15425b + 57;
            f15426c = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        av() {
            super(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void e(androidx.compose.runtime.Composer r4, int r5) throws java.lang.Throwable {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15277b
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15278c = r0
            int r1 = r1 % r3
            r2 = 970321813(0x39d5ef95, float:4.0805028E-4)
            if (r1 != 0) goto L74
            androidx.compose.runtime.Composer r4 = r4.startRestartGroup(r2)
            if (r5 != 0) goto L27
            int r0 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15278c
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15277b = r0
            int r1 = r1 % r3
            boolean r1 = r4.getSkipping()
            r0 = 1
            if (r1 == r0) goto L67
        L27:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L3c
            int r0 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15277b
            int r1 = r0 + 55
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15278c = r0
            int r1 = r1 % r3
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.id_capture.view.PreviewHelpScreen (IdCaptureScreen.kt:1277)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r5, r1, r0)
        L3c:
            com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$au r3 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.au.f15420b
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$av r2 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.av.f15428e
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$at r1 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.at.f15414a
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r0 = 438(0x1b6, float:6.14E-43)
            e(r3, r2, r1, r4, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L56
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L56:
            androidx.compose.runtime.ScopeUpdateScope r1 = r4.endRestartGroup()
            if (r1 == 0) goto L66
            com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$ax r0 = new com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$ax
            r0.<init>(r5)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L66:
            return
        L67:
            r4.skipToGroupEnd()
            int r0 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15277b
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15278c = r0
            int r1 = r1 % r3
            goto L56
        L74:
            r4.startRestartGroup(r2)
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.e(androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void b(androidx.compose.runtime.Composer r19, int r20) {
        /*
            r7 = 2
            int r0 = r7 % r7
            r5 = -267809417(0xfffffffff0098d77, float:-1.7028187E29)
            r0 = r19
            androidx.compose.runtime.Composer r13 = r0.startRestartGroup(r5)
            r6 = 0
            r4 = 0
            r1 = r20
            if (r1 != 0) goto L26
            int r0 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15277b
            int r2 = r0 + 101
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15278c = r0
            int r2 = r2 % r7
            if (r2 == 0) goto La4
            boolean r2 = r13.getSkipping()
            r0 = 76
            int r0 = r0 / r4
            if (r2 != 0) goto Lac
        L26:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L3d
            int r0 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15277b
            int r3 = r0 + 17
            int r0 = r3 % 128
            com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15278c = r0
            int r3 = r3 % r7
            java.lang.String r2 = "com.incode.welcome_sdk.ui.id_capture.view.PreviewTopInfo (IdCaptureScreen.kt:1283)"
            r0 = -1
            if (r3 != 0) goto Lbd
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r1, r0, r2)
        L3d:
            int r0 = com.incode.welcome_sdk.R.drawable.onboard_sdk_check_badge
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            com.incode.welcome_sdk.commons.theme.h r0 = com.incode.welcome_sdk.commons.theme.h.f5694b
            com.incode.welcome_sdk.commons.theme.IncodeColorScheme r0 = com.incode.welcome_sdk.commons.theme.h.a(r13)
            long r2 = r0.m7985getBrand0d7_KjU()
            androidx.compose.ui.graphics.Color r11 = androidx.compose.ui.graphics.Color.m4168boximpl(r2)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            r0 = 24630(0x6036, float:3.4514E-41)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            java.lang.String r8 = "Title"
            java.lang.String r9 = "Subtitle"
            java.lang.Object[] r19 = new java.lang.Object[]{r8, r9, r10, r11, r12, r13, r14}
            int r16 = com.incode.welcome_sdk.ui.ekyb.EKYBActivity.e.e()
            int r17 = com.incode.welcome_sdk.ui.ekyb.EKYBActivity.e.e()
            int r15 = com.incode.welcome_sdk.ui.ekyb.EKYBActivity.e.e()
            int r20 = com.incode.welcome_sdk.ui.ekyb.EKYBActivity.e.e()
            r14 = 148263441(0x8d65211, float:1.289895E-33)
            r18 = -148263441(0xfffffffff729adef, float:-3.4415077E33)
            c(r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L85
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L85:
            androidx.compose.runtime.ScopeUpdateScope r2 = r13.endRestartGroup()
            if (r2 == 0) goto Lb0
            com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$ba r0 = new com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt$ba
            r0.<init>(r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r2.updateScope(r0)
            int r0 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15278c
            int r1 = r0 + 29
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15277b = r0
            int r1 = r1 % r7
            if (r1 != 0) goto La3
            r0 = 34
            int r0 = r0 / r4
        La3:
            return
        La4:
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto Lac
            goto L26
        Lac:
            r13.skipToGroupEnd()
            goto L85
        Lb0:
            int r0 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15278c
            int r1 = r0 + 123
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.f15277b = r0
            int r1 = r1 % r7
            if (r1 == 0) goto Lbc
            return
        Lbc:
            throw r6
        Lbd:
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r1, r0, r2)
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt.b(androidx.compose.runtime.Composer, int):void");
    }

    private static final void h(Composer composer, int i2) {
        int i3 = 2 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(470337987);
        Object obj = null;
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                int i4 = f15278c + 99;
                f15277b = i4 % 128;
                int i5 = i4 % 2;
                ComposerKt.traceEventStart(470337987, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.PreviewTooltipBubble (IdCaptureScreen.kt:1289)");
            }
            c(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f15277b + 109;
                f15278c = i6 % 128;
                if (i6 % 2 != 0) {
                    ComposerKt.traceEventEnd();
                    throw null;
                }
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new aw(i2));
            int i7 = f15278c + 111;
            f15277b = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        Composer composer = (Composer) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i2 = 2 % 2;
        int i3 = f15278c + 55;
        f15277b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Composer composerStartRestartGroup = composer.startRestartGroup(-1982163556);
            if (iIntValue != 0 || !composerStartRestartGroup.getSkipping()) {
                if (!(!ComposerKt.isTraceInProgress())) {
                    ComposerKt.traceEventStart(-1982163556, iIntValue, -1, "com.incode.welcome_sdk.ui.id_capture.view.PreviewTooltipBubbleDarkMode (IdCaptureScreen.kt:1295)");
                }
                com.incode.welcome_sdk.commons.theme.h.f5694b.d(DisplayMode.DARK, ComposableSingletons$IdCaptureScreenKt.f15122d.m8487getLambda2$onboard_release(), composerStartRestartGroup, 438, 0);
                if (ComposerKt.isTraceInProgress()) {
                    int i4 = f15278c + 23;
                    f15277b = i4 % 128;
                    int i5 = i4 % 2;
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new ay(iIntValue));
            }
            return null;
        }
        composer.startRestartGroup(-1982163556);
        obj.hashCode();
        throw null;
    }

    static {
        int i2 = f15280e + 7;
        f15281i = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final LottieComposition e(LottieCompositionResult lottieCompositionResult) {
        int iE = EKYBActivity.e.e();
        int iE2 = EKYBActivity.e.e();
        return (LottieComposition) c(-2120567135, EKYBActivity.e.e(), iE, iE2, 2120567138, new Object[]{lottieCompositionResult}, EKYBActivity.e.e());
    }

    private static final void d(MutableFloatState mutableFloatState, float f2) {
        Object[] objArr = {mutableFloatState, Float.valueOf(f2)};
        c(-1834639572, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), 1834639578, objArr, EKYBActivity.e.e());
    }

    public static final class bg extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f15465a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f15466b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15467c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15468e = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f15469d;

        public static int d() {
            int i2 = f15465a;
            int i3 = i2 % 8758509;
            f15465a = i2 + 1;
            if (i3 != 0) {
                return f15466b;
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            f15466b = iFreeMemory;
            return iFreeMemory;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15467c + 113;
            f15468e = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15467c + 25;
            f15468e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
            }
            return unit;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15468e + 107;
            f15467c = i3 % 128;
            IdCaptureScreenKt.access$TransitionToBackId(composer, RecomposeScopeImplKt.updateChangedFlags(i3 % 2 != 0 ? this.f15469d : this.f15469d | 1));
            int i4 = f15468e + 79;
            f15467c = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 99 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        bg(int i2) {
            super(2);
            this.f15469d = i2;
        }
    }

    private static final void i(Composer composer, int i2) {
        Object[] objArr = {composer, Integer.valueOf(i2)};
        c(-1287691853, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), 1287691854, objArr, EKYBActivity.e.e());
    }

    private static final TextStyle a(boolean z2, Composer composer, int i2) {
        Object[] objArr = {Boolean.valueOf(z2), composer, Integer.valueOf(i2)};
        return (TextStyle) c(1163875192, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), -1163875188, objArr, EKYBActivity.e.e());
    }

    static final class ab extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15303e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f15304f = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ State<CaptureUiState> f15305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ View f15306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f15307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function1<IdCaptureUiEvent, Unit> f15308d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15304f + 117;
            f15303e = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        private void e(Composer composer) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15304f + 63;
            f15303e = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.CaptureScreenContent(this.f15305a, this.f15308d, this.f15306b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15307c | 1));
            int i5 = f15303e + 1;
            f15304f = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        ab(State<CaptureUiState> state, Function1<? super IdCaptureUiEvent, Unit> function1, View view, int i2) {
            super(2);
            this.f15305a = state;
            this.f15308d = function1;
            this.f15306b = view;
            this.f15307c = i2;
        }
    }

    static final class ae extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15324c = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f15325j = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f15326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f15327b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f15328d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f15329e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15325j + 39;
            f15324c = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15325j + 19;
            f15324c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Composer composer) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15325j + 23;
            f15324c = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.access$HelpScreen(this.f15326a, this.f15328d, this.f15327b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15329e | 1));
            int i5 = f15325j + 115;
            f15324c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 65 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ae(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i2) {
            super(2);
            this.f15326a = function0;
            this.f15328d = function02;
            this.f15327b = function03;
            this.f15329e = i2;
        }
    }

    static final class af extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15330a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15331e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ boolean f15332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f15333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ CaptureUiState.CaptureFrameSpec f15334d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15331e + 99;
            f15330a = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15331e + 93;
            f15330a = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15331e + 113;
            f15330a = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.access$FillTheFrameHint(this.f15334d, this.f15332b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15333c | 1));
            int i5 = f15330a + 55;
            f15331e = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        af(CaptureUiState.CaptureFrameSpec captureFrameSpec, boolean z2, int i2) {
            super(2);
            this.f15334d = captureFrameSpec;
            this.f15332b = z2;
            this.f15333c = i2;
        }
    }

    static final class ak extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f15364f = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f15365h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.commons.n f15366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.commons.b f15367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.commons.o f15368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ InitIdCaptureViewModel f15369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ IdScan.IdType f15370e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ AudioPermissionHandler f15371g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ int f15372j;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15364f + 125;
            f15365h = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15364f + 43;
            f15365h = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void b(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15365h + 105;
            f15364f = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.IdCaptureScreen(this.f15366a, this.f15368c, this.f15369d, this.f15370e, this.f15367b, this.f15371g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15372j | 1));
            int i5 = f15364f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f15365h = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ak(com.incode.welcome_sdk.commons.n nVar, com.incode.welcome_sdk.commons.o oVar, InitIdCaptureViewModel initIdCaptureViewModel, IdScan.IdType idType, com.incode.welcome_sdk.commons.b bVar, AudioPermissionHandler audioPermissionHandler, int i2) {
            super(2);
            this.f15366a = nVar;
            this.f15368c = oVar;
            this.f15369d = initIdCaptureViewModel;
            this.f15370e = idType;
            this.f15367b = bVar;
            this.f15371g = audioPermissionHandler;
            this.f15372j = i2;
        }
    }

    static final class ao extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15391b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15392d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f15393a;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15392d + 53;
            f15391b = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15392d + 69;
            f15391b = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void b(Composer composer) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15392d + 7;
            f15391b = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.access$PreviewCaptureScreenSmallEstate(composer, RecomposeScopeImplKt.updateChangedFlags(this.f15393a | 1));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ao(int i2) {
            super(2);
            this.f15393a = i2;
        }
    }

    static final class as extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15408b = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f15409j = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ BoxScope f15410a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ boolean f15411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Function1<IdCaptureUiEvent, Unit> f15412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f15413e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15408b + 77;
            f15409j = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15408b + 27;
            f15409j = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Composer composer) {
            BoxScope boxScope;
            Function1<IdCaptureUiEvent, Unit> function1;
            boolean z2;
            int i2;
            int i3 = 2 % 2;
            int i4 = f15409j + 125;
            f15408b = i4 % 128;
            if (i4 % 2 != 0) {
                boxScope = this.f15410a;
                function1 = this.f15412d;
                z2 = this.f15411c;
                i2 = this.f15413e;
            } else {
                boxScope = this.f15410a;
                function1 = this.f15412d;
                z2 = this.f15411c;
                i2 = this.f15413e | 1;
            }
            IdCaptureScreenKt.access$ManualCaptureButton(boxScope, function1, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i2));
            int i5 = f15408b + 97;
            f15409j = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        as(BoxScope boxScope, Function1<? super IdCaptureUiEvent, Unit> function1, boolean z2, int i2) {
            super(2);
            this.f15410a = boxScope;
            this.f15412d = function1;
            this.f15411c = z2;
            this.f15413e = i2;
        }
    }

    static final class aw extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15429b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15430e = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f15431d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15429b + 33;
            f15430e = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15429b + 99;
            f15430e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15430e + 75;
            f15429b = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.access$PreviewTooltipBubble(composer, RecomposeScopeImplKt.updateChangedFlags(this.f15431d | 1));
            int i5 = f15430e + 21;
            f15429b = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        aw(int i2) {
            super(2);
            this.f15431d = i2;
        }
    }

    static final class ax extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15432a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15433e = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f15434c;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15433e + 39;
            f15432a = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 61 / 0;
            }
            return unit;
        }

        private void c(Composer composer) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15433e + 21;
            f15432a = i3 % 128;
            IdCaptureScreenKt.access$PreviewHelpScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i3 % 2 == 0 ? this.f15434c : this.f15434c | 1));
            int i4 = f15433e + 35;
            f15432a = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ax(int i2) {
            super(2);
            this.f15434c = i2;
        }
    }

    static final class ay extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15435a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15436b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f15437c;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15436b + 47;
            f15435a = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15436b + 9;
            f15435a = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.access$PreviewTooltipBubbleDarkMode(composer, RecomposeScopeImplKt.updateChangedFlags(this.f15437c | 1));
            int i5 = f15436b + 57;
            f15435a = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ay(int i2) {
            super(2);
            this.f15437c = i2;
        }
    }

    static final class ba extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15446d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15447e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f15448a;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15446d + 59;
            f15447e = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f15447e + 109;
            f15446d = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15446d + 7;
            f15447e = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.access$PreviewTopInfo(composer, RecomposeScopeImplKt.updateChangedFlags(this.f15448a | 1));
            int i5 = f15447e + 91;
            f15446d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 47 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ba(int i2) {
            super(2);
            this.f15448a = i2;
        }
    }

    static final class bb extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15449a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15450c = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ int f15451b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ long f15452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f15453e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15449a + 31;
            f15450c = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15450c + 21;
            f15449a = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.m8492access$ShooterCounterx_KDEd0(this.f15453e, this.f15452d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15451b | 1));
            int i5 = f15450c + 75;
            f15449a = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        bb(int i2, long j2, int i3) {
            super(2);
            this.f15453e = i2;
            this.f15452d = j2;
            this.f15451b = i3;
        }
    }

    static final class bc extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15454b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15455c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f15456e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15454b + 81;
            f15455c = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15454b + 77;
            f15455c = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.access$TooltipBubble(composer, RecomposeScopeImplKt.updateChangedFlags(this.f15456e | 1));
            int i5 = f15455c + 51;
            f15454b = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        bc(int i2) {
            super(2);
            this.f15456e = i2;
        }
    }

    static final class bf extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f15457f = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f15458j = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Integer f15459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ String f15460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Color f15461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ boolean f15462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ String f15463e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ int f15464i;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15457f + 111;
            f15458j = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15458j + 85;
            f15457f = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15457f + 125;
            f15458j = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.m8493access$TopInfoxqIIw2o(this.f15463e, this.f15460b, this.f15459a, this.f15461c, this.f15462d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15464i | 1));
            int i5 = f15458j + 105;
            f15457f = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        bf(String str, String str2, Integer num, Color color, boolean z2, int i2) {
            super(2);
            this.f15463e = str;
            this.f15460b = str2;
            this.f15459a = num;
            this.f15461c = color;
            this.f15462d = z2;
            this.f15464i = i2;
        }
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f15478g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f15479h = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ float f15480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ int f15481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f15482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ boolean f15483d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ BoxScope f15484e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15478g + 87;
            f15479h = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f15478g + 91;
            f15479h = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 75 / 0;
            }
            return unit;
        }

        private void d(Composer composer) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15478g + 25;
            f15479h = i3 % 128;
            if (i3 % 2 == 0) {
                IdCaptureScreenKt.m8490access$AllPhotosAreEncrypteduFdPcIQ(this.f15484e, this.f15480a, this.f15483d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15481b), this.f15482c);
            } else {
                IdCaptureScreenKt.m8490access$AllPhotosAreEncrypteduFdPcIQ(this.f15484e, this.f15480a, this.f15483d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15481b | 1), this.f15482c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(BoxScope boxScope, float f2, boolean z2, int i2, int i3) {
            super(2);
            this.f15484e = boxScope;
            this.f15480a = f2;
            this.f15483d = z2;
            this.f15481b = i2;
            this.f15482c = i3;
        }
    }

    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15485d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f15486f = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f15487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ AcceptedDocumentsUiState f15488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ BoxScope f15489c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ float f15490e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15486f + 13;
            f15485d = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15486f + 81;
            f15485d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15486f + 121;
            f15485d = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.m8489AcceptedDocumentsTDGSqEk(this.f15489c, this.f15488b, this.f15490e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15487a | 1));
            int i5 = f15485d + 53;
            f15486f = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 55 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(BoxScope boxScope, AcceptedDocumentsUiState acceptedDocumentsUiState, float f2, int i2) {
            super(2);
            this.f15489c = boxScope;
            this.f15488b = acceptedDocumentsUiState;
            this.f15490e = f2;
            this.f15487a = i2;
        }
    }

    static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15509a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15510b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f15511c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ AnalyzingDocumentModel f15512e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15510b + 7;
            f15509a = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f15509a + 91;
            f15510b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15510b + 37;
            f15509a = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.AnalyzingDocument(this.f15512e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15511c | 1));
            int i5 = f15510b + 115;
            f15509a = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(AnalyzingDocumentModel analyzingDocumentModel, int i2) {
            super(2);
            this.f15512e = analyzingDocumentModel;
            this.f15511c = i2;
        }
    }

    static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15542b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15543e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f15544a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ CaptureUiState.CaptureFrameSpec f15545c;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15543e + 9;
            f15542b = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 41 / 0;
            }
            return unit;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15543e + 17;
            f15542b = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.AnimateLaserOverCapture(this.f15545c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15544a | 1));
            int i5 = f15542b + 5;
            f15543e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 14 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(CaptureUiState.CaptureFrameSpec captureFrameSpec, int i2) {
            super(2);
            this.f15545c = captureFrameSpec;
            this.f15544a = i2;
        }
    }

    static final class o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f15563g = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f15564j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ CaptureUiState.BottomButton f15565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ BoxScope f15566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function1<IdCaptureUiEvent, Unit> f15567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ boolean f15568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function1<LayoutCoordinates, Unit> f15569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ int f15570f;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15564j + 25;
            f15563g = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 6 / 0;
            }
            int i6 = f15564j + 89;
            f15563g = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15563g + 35;
            f15564j = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.access$BottomButton(this.f15566b, this.f15567c, this.f15565a, this.f15568d, this.f15569e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15570f | 1));
            int i5 = f15563g + 49;
            f15564j = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(BoxScope boxScope, Function1<? super IdCaptureUiEvent, Unit> function1, CaptureUiState.BottomButton bottomButton, boolean z2, Function1<? super LayoutCoordinates, Unit> function12, int i2) {
            super(2);
            this.f15566b = boxScope;
            this.f15567c = function1;
            this.f15565a = bottomButton;
            this.f15568d = z2;
            this.f15569e = function12;
            this.f15570f = i2;
        }
    }

    static final class r extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15579b = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f15580i = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ CaptureUiState f15581a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function1<IdCaptureUiEvent, Unit> f15582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f15583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ View f15584e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15579b + 21;
            f15580i = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void e(Composer composer) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15579b + 105;
            f15580i = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.access$CameraPreviewWithOverlay(this.f15584e, this.f15581a, this.f15582c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15583d | 1));
            int i5 = f15579b + 113;
            f15580i = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(View view, CaptureUiState captureUiState, Function1<? super IdCaptureUiEvent, Unit> function1, int i2) {
            super(2);
            this.f15584e = view;
            this.f15581a = captureUiState;
            this.f15582c = function1;
            this.f15583d = i2;
        }
    }

    static final class s extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f15585h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f15586i = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f15587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ int f15588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ long f15589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ BorderStyle f15590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ long f15591e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15586i + 73;
            f15585h = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15586i + 3;
            f15585h = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15586i + 105;
            f15585h = i3 % 128;
            if (i3 % 2 == 0) {
                IdCaptureScreenKt.m8491access$CameraCaptureFrameXaN1jA(this.f15590d, this.f15591e, this.f15589c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15587a), this.f15588b);
            } else {
                IdCaptureScreenKt.m8491access$CameraCaptureFrameXaN1jA(this.f15590d, this.f15591e, this.f15589c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15587a | 1), this.f15588b);
            }
            int i4 = f15586i + 25;
            f15585h = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(BorderStyle borderStyle, long j2, long j3, int i2, int i3) {
            super(2);
            this.f15590d = borderStyle;
            this.f15591e = j2;
            this.f15589c = j3;
            this.f15587a = i2;
            this.f15588b = i3;
        }
    }

    static final class x extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15621e = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f15622i = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f15623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ String f15624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ String f15625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f15626d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15622i + 73;
            f15621e = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15621e + 117;
            f15622i = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureScreenKt.access$CaptureHintBox(this.f15625c, this.f15624b, this.f15626d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15623a | 1));
            int i5 = f15621e + 19;
            f15622i = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str, String str2, int i2, int i3) {
            super(2);
            this.f15625c = str;
            this.f15624b = str2;
            this.f15626d = i2;
            this.f15623a = i3;
        }
    }

    private static final TextStyle d(Composer composer) {
        int iE = EKYBActivity.e.e();
        int iE2 = EKYBActivity.e.e();
        return (TextStyle) c(-832764816, EKYBActivity.e.e(), iE, iE2, 832764821, new Object[]{composer}, EKYBActivity.e.e());
    }

    private static final void a(String str, String str2, Integer num, Color color, boolean z2, Composer composer, int i2) {
        Object[] objArr = {str, str2, num, color, Boolean.valueOf(z2), composer, Integer.valueOf(i2)};
        c(148263441, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), -148263441, objArr, EKYBActivity.e.e());
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f15293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f15294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15295d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15296e = 0;

        static {
            int[] iArr = new int[CaptureUiState.BottomButton.values().length];
            try {
                iArr[CaptureUiState.BottomButton.f14601a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CaptureUiState.BottomButton.f14605e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CaptureUiState.BottomButton.f14602b.ordinal()] = 3;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CaptureUiState.BottomButton.f14608h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CaptureUiState.BottomButton.f14604d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f15294c = iArr;
            int[] iArr2 = new int[DocumentType.values().length];
            try {
                iArr2[DocumentType.FRONT_ID.ordinal()] = 1;
                int i3 = f15296e + 11;
                f15295d = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DocumentType.BACK_ID.ordinal()] = 2;
                int i5 = f15295d + 79;
                f15296e = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DocumentType.PASSPORT.ordinal()] = 3;
                int i8 = f15296e + 125;
                f15295d = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused8) {
            }
            f15293b = iArr2;
        }
    }

    private static final float c(Composer composer) {
        int iE = EKYBActivity.e.e();
        int iE2 = EKYBActivity.e.e();
        return ((Float) c(-1895987405, EKYBActivity.e.e(), iE, iE2, 1895987407, new Object[]{composer}, EKYBActivity.e.e())).floatValue();
    }

    private static final void b(int i2, long j2, Composer composer, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Long.valueOf(j2), composer, Integer.valueOf(i3)};
        c(1958958604, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), -1958958597, objArr, EKYBActivity.e.e());
    }
}
