package com.incode.welcome_sdk.ui.id_capture.view;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.incode.welcome_sdk.commons.b;
import com.incode.welcome_sdk.commons.o;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.ui.composables.AnimateContentKt;
import com.incode.welcome_sdk.ui.id_capture.AudioPermissionHandler;
import com.incode.welcome_sdk.ui.id_capture.event.InitIdCaptureUiEvent;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.InitIdCaptureViewModel;
import com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt;
import com.incode.welcome_sdk.ui.permission_onboarding.viewmodel.PermissionViewModel;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.androidx.compose.ViewModelInternalsKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureModuleScreenKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f15245a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f15246e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class e extends Lambda implements Function4<AnimatedContentScope, InitIdCaptureViewModel.IdCaptureStep, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f15256f = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f15257j = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ State<InitIdCaptureViewModel.IdCaptureState> f15258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ AudioPermissionHandler f15259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ o f15260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ b f15261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ InitIdCaptureViewModel f15262e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Activity f15263g;

        @Override // kotlin.jvm.functions.Function4
        public final /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, InitIdCaptureViewModel.IdCaptureStep idCaptureStep, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15257j + 37;
            f15256f = i3 % 128;
            int i4 = i3 % 2;
            d(animatedContentScope, idCaptureStep, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f15256f + 121;
            f15257j = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt$e$5, reason: invalid class name */
        /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<InitIdCaptureUiEvent, Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f15274b = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f15275e = 0;

            private void c(InitIdCaptureUiEvent initIdCaptureUiEvent) {
                int i2 = 2 % 2;
                int i3 = f15274b + 91;
                f15275e = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(initIdCaptureUiEvent, "");
                    ((InitIdCaptureViewModel) this.receiver).onEvent(initIdCaptureUiEvent);
                } else {
                    Intrinsics.checkNotNullParameter(initIdCaptureUiEvent, "");
                    ((InitIdCaptureViewModel) this.receiver).onEvent(initIdCaptureUiEvent);
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(InitIdCaptureUiEvent initIdCaptureUiEvent) {
                int i2 = 2 % 2;
                int i3 = f15274b + 61;
                f15275e = i3 % 128;
                int i4 = i3 % 2;
                c(initIdCaptureUiEvent);
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    int i5 = 75 / 0;
                }
                return unit;
            }

            AnonymousClass5(Object obj) {
                super(1, obj, InitIdCaptureViewModel.class, "onEvent", "onEvent(Lcom/incode/welcome_sdk/ui/id_capture/event/InitIdCaptureUiEvent;)V", 0);
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt$e$3, reason: invalid class name */
        /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<InitIdCaptureUiEvent, Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f15272b = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f15273e = 1;

            private void e(InitIdCaptureUiEvent initIdCaptureUiEvent) {
                int i2 = 2 % 2;
                int i3 = f15273e + 71;
                f15272b = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(initIdCaptureUiEvent, "");
                    ((InitIdCaptureViewModel) this.receiver).onEvent(initIdCaptureUiEvent);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(initIdCaptureUiEvent, "");
                ((InitIdCaptureViewModel) this.receiver).onEvent(initIdCaptureUiEvent);
                int i4 = f15272b + 67;
                f15273e = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(InitIdCaptureUiEvent initIdCaptureUiEvent) {
                int i2 = 2 % 2;
                int i3 = f15273e + 47;
                f15272b = i3 % 128;
                int i4 = i3 % 2;
                e(initIdCaptureUiEvent);
                Unit unit = Unit.INSTANCE;
                int i5 = f15273e + 59;
                f15272b = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            AnonymousClass3(Object obj) {
                super(1, obj, InitIdCaptureViewModel.class, "onEvent", "onEvent(Lcom/incode/welcome_sdk/ui/id_capture/event/InitIdCaptureUiEvent;)V", 0);
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt$e$2, reason: invalid class name */
        public static final class AnonymousClass2 extends Lambda implements Function0<ParametersHolder> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static int f15267a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f15268b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f15269c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static int f15270e = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ Activity f15271d;

            private ParametersHolder e() {
                int i2 = 2 % 2;
                int i3 = f15269c + 63;
                f15268b = i3 % 128;
                if (i3 % 2 == 0) {
                    return ParametersHolderKt.parametersOf(this.f15271d);
                }
                Object[] objArr = new Object[0];
                objArr[1] = this.f15271d;
                return ParametersHolderKt.parametersOf(objArr);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ParametersHolder invoke() {
                int i2 = 2 % 2;
                int i3 = f15269c + 21;
                f15268b = i3 % 128;
                int i4 = i3 % 2;
                ParametersHolder parametersHolderE = e();
                int i5 = f15269c + 37;
                f15268b = i5 % 128;
                if (i5 % 2 == 0) {
                    return parametersHolderE;
                }
                throw null;
            }

            public static int c() {
                int i2 = f15267a;
                int i3 = i2 % 5838265;
                f15267a = i2 + 1;
                if (i3 != 0) {
                    return f15270e;
                }
                int iMyTid = Process.myTid();
                f15270e = iMyTid;
                return iMyTid;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Activity activity) {
                super(0);
                this.f15271d = activity;
            }
        }

        private void d(AnimatedContentScope animatedContentScope, InitIdCaptureViewModel.IdCaptureStep idCaptureStep, Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f15257j + 71;
            f15256f = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(animatedContentScope, "");
            Intrinsics.checkNotNullParameter(idCaptureStep, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1335527582, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreen.<anonymous> (IdCaptureModuleScreen.kt:36)");
            }
            if (idCaptureStep instanceof InitIdCaptureViewModel.IdCaptureStep.DocumentSelection) {
                composer.startReplaceableGroup(1576401184);
                DocumentSelectionScreenKt.DocumentSelectionScreen(new AnonymousClass5(this.f15262e), this.f15261d.closeButtonHandlerOrNull(), this.f15258a.getValue().getShowFooter(), composer, 0);
                composer.endReplaceableGroup();
            } else if (idCaptureStep instanceof InitIdCaptureViewModel.IdCaptureStep.IdCaptureTutorial) {
                composer.startReplaceableGroup(1576401444);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f15262e);
                Function0<Unit> function0CloseButtonHandlerOrNull = this.f15261d.closeButtonHandlerOrNull();
                IdScan.IdType selectedDocument = this.f15262e.getState().getValue().getSelectedDocument();
                if (selectedDocument == null) {
                    selectedDocument = IdScan.IdType.ID;
                }
                CaptureTutorialScreenKt.CaptureTutorialScreen(anonymousClass3, function0CloseButtonHandlerOrNull, selectedDocument, this.f15258a.getValue().getShowFooter(), composer, 0);
                composer.endReplaceableGroup();
            } else if (idCaptureStep instanceof InitIdCaptureViewModel.IdCaptureStep.PermissionOnboarding) {
                composer.startReplaceableGroup(1576401781);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f15263g);
                composer.startReplaceableGroup(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModelResolveViewModel = GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(PermissionViewModel.class), current.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(current, composer, 8), null, KoinApplicationKt.currentKoinScope(composer, 0), anonymousClass2);
                composer.endReplaceableGroup();
                final InitIdCaptureViewModel initIdCaptureViewModel = this.f15262e;
                PermissionOnboardingEntryPointKt.PermissionOnboardingEntryPoint((PermissionViewModel) viewModelResolveViewModel, new Function0<Unit>() { // from class: com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.e.1

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f15264d = 0;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static int f15265e = 1;

                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Unit invoke() {
                        int i6 = 2 % 2;
                        int i7 = f15264d + 29;
                        f15265e = i7 % 128;
                        int i8 = i7 % 2;
                        c();
                        Unit unit = Unit.INSTANCE;
                        int i9 = f15264d + 75;
                        f15265e = i9 % 128;
                        if (i9 % 2 != 0) {
                            return unit;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    private void c() {
                        int i6 = 2 % 2;
                        int i7 = f15264d + 49;
                        f15265e = i7 % 128;
                        int i8 = i7 % 2;
                        InitIdCaptureViewModel initIdCaptureViewModel2 = initIdCaptureViewModel;
                        if (i8 != 0) {
                            initIdCaptureViewModel2.onEvent(InitIdCaptureUiEvent.PermissionGranted.f15044b);
                            return;
                        }
                        initIdCaptureViewModel2.onEvent(InitIdCaptureUiEvent.PermissionGranted.f15044b);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    {
                        super(0);
                    }
                }, composer, 8);
                composer.endReplaceableGroup();
            } else if (idCaptureStep instanceof InitIdCaptureViewModel.IdCaptureStep.Capture) {
                composer.startReplaceableGroup(1576402010);
                IdCaptureScreenKt.IdCaptureScreen(this.f15262e.getScreenNameHolder(), this.f15260c, this.f15262e, ((InitIdCaptureViewModel.IdCaptureStep.Capture) idCaptureStep).getSelectedIdType(), this.f15261d, this.f15259b, composer, 584);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1576402281);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                int i6 = f15257j + 13;
                f15256f = i6 % 128;
                int i7 = i6 % 2;
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InitIdCaptureViewModel initIdCaptureViewModel, b bVar, State<InitIdCaptureViewModel.IdCaptureState> state, o oVar, AudioPermissionHandler audioPermissionHandler, Activity activity) {
            super(4);
            this.f15262e = initIdCaptureViewModel;
            this.f15261d = bVar;
            this.f15258a = state;
            this.f15260c = oVar;
            this.f15259b = audioPermissionHandler;
            this.f15263g = activity;
        }
    }

    public static final void IdCaptureModuleScreen(o oVar, InitIdCaptureViewModel initIdCaptureViewModel, b bVar, AudioPermissionHandler audioPermissionHandler, Composer composer, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(oVar, "");
        Intrinsics.checkNotNullParameter(initIdCaptureViewModel, "");
        Intrinsics.checkNotNullParameter(bVar, "");
        Intrinsics.checkNotNullParameter(audioPermissionHandler, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1940186468);
        Object obj = null;
        if (ComposerKt.isTraceInProgress()) {
            int i4 = f15245a + 19;
            f15246e = i4 % 128;
            if (i4 % 2 != 0) {
                ComposerKt.traceEventStart(-1940186468, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreen (IdCaptureModuleScreen.kt:28)");
                obj.hashCode();
                throw null;
            }
            ComposerKt.traceEventStart(-1940186468, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreen (IdCaptureModuleScreen.kt:28)");
        }
        State stateCollectAsState = SnapshotStateKt.collectAsState(initIdCaptureViewModel.getState(), null, composerStartRestartGroup, 8, 1);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Intrinsics.checkNotNull(objConsume, "");
        AnimateContentKt.AnimateContent(((InitIdCaptureViewModel.IdCaptureState) stateCollectAsState.getValue()).getIdCaptureStep(), AnimateContentKt.slideInSlideOut(0, composerStartRestartGroup, 0, 1), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1335527582, true, new e(initIdCaptureViewModel, bVar, stateCollectAsState, oVar, audioPermissionHandler, (Activity) objConsume)), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        if (ComposerKt.isTraceInProgress()) {
            int i5 = f15245a + 103;
            f15246e = i5 % 128;
            if (i5 % 2 != 0) {
                ComposerKt.traceEventEnd();
                throw null;
            }
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d(oVar, initIdCaptureViewModel, bVar, audioPermissionHandler, i2));
        }
    }

    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f15247a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f15248e = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f15249h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f15250i = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ InitIdCaptureViewModel f15251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ b f15252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ o f15253d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ int f15254f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ AudioPermissionHandler f15255j;

        public static int a() {
            int i2 = f15247a;
            int i3 = i2 % 7454717;
            f15247a = i2 + 1;
            if (i3 != 0) {
                return f15248e;
            }
            int iNextInt = new Random().nextInt();
            f15248e = iNextInt;
            return iNextInt;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15249h + 113;
            f15250i = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15249h + 75;
            f15250i = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 91 / 0;
            }
            return unit;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15250i + 57;
            f15249h = i3 % 128;
            if (i3 % 2 != 0) {
                IdCaptureModuleScreenKt.IdCaptureModuleScreen(this.f15253d, this.f15251b, this.f15252c, this.f15255j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15254f));
            } else {
                IdCaptureModuleScreenKt.IdCaptureModuleScreen(this.f15253d, this.f15251b, this.f15252c, this.f15255j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15254f | 1));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o oVar, InitIdCaptureViewModel initIdCaptureViewModel, b bVar, AudioPermissionHandler audioPermissionHandler, int i2) {
            super(2);
            this.f15253d = oVar;
            this.f15251b = initIdCaptureViewModel;
            this.f15252c = bVar;
            this.f15255j = audioPermissionHandler;
            this.f15254f = i2;
        }
    }
}
