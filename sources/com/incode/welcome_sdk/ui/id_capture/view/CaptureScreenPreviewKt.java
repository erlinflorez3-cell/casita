package com.incode.welcome_sdk.ui.id_capture.view;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import com.incode.welcome_sdk.ui.id_capture.CaptureUiState;
import com.incode.welcome_sdk.ui.id_capture.event.IdCaptureUiEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptureScreenPreviewKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f15046a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f15047d = 0;

    public static final /* synthetic */ void access$PreviewCaptureScreen(CaptureUiState captureUiState, Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f15047d + 1;
        f15046a = i4 % 128;
        int i5 = i4 % 2;
        e(captureUiState, composer, i2);
        int i6 = f15046a + 29;
        f15047d = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$PreviewCaptureScreenWithState(CaptureUiState captureUiState, Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f15046a + 41;
        f15047d = i4 % 128;
        int i5 = i4 % 2;
        d(captureUiState, composer, i2);
        int i6 = f15046a + 109;
        f15047d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 39 / 0;
        }
    }

    private static final void e(@PreviewParameter(provider = com.incode.welcome_sdk.ui.id_capture.view.c.class) CaptureUiState captureUiState, Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f15047d + 91;
        f15046a = i4 % 128;
        if (i4 % 2 == 0) {
            composer.startRestartGroup(-505662734);
            ComposerKt.isTraceInProgress();
            throw null;
        }
        Composer composerStartRestartGroup = composer.startRestartGroup(-505662734);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-505662734, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.PreviewCaptureScreen (CaptureScreenPreview.kt:56)");
            int i5 = f15047d + 59;
            f15046a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 2;
            }
        }
        d(captureUiState, composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e(captureUiState, i2));
            return;
        }
        int i7 = f15046a + 65;
        f15047d = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    static final class c extends Lambda implements Function1<IdCaptureUiEvent, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15052a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15053b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15054c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f15055d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f15056e = new c();

        private static void a(IdCaptureUiEvent idCaptureUiEvent) {
            int i2 = 2 % 2;
            int i3 = f15055d + 39;
            f15052a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(idCaptureUiEvent, "");
            int i5 = f15055d + 109;
            f15052a = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(IdCaptureUiEvent idCaptureUiEvent) {
            int i2 = 2 % 2;
            int i3 = f15052a + 49;
            f15055d = i3 % 128;
            int i4 = i3 % 2;
            a(idCaptureUiEvent);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f15055d + 43;
            f15052a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f15053b + 111;
            f15054c = i2 % 128;
            int i3 = i2 % 2;
        }

        c() {
            super(1);
        }
    }

    private static final void d(CaptureUiState captureUiState, Composer composer, int i2) throws Throwable {
        int i3 = 2 % 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(785995127);
        Object obj = null;
        if (ComposerKt.isTraceInProgress()) {
            int i4 = f15046a + 125;
            f15047d = i4 % 128;
            if (i4 % 2 != 0) {
                ComposerKt.traceEventStart(785995127, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.PreviewCaptureScreenWithState (CaptureScreenPreview.kt:61)");
                obj.hashCode();
                throw null;
            }
            ComposerKt.traceEventStart(785995127, i2, -1, "com.incode.welcome_sdk.ui.id_capture.view.PreviewCaptureScreenWithState (CaptureScreenPreview.kt:61)");
        }
        State stateCollectAsState = SnapshotStateKt.collectAsState(StateFlowKt.MutableStateFlow(captureUiState), null, composerStartRestartGroup, 8, 1);
        c cVar = c.f15056e;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        IdCaptureScreenKt.CaptureScreenContent(stateCollectAsState, cVar, new View((Context) objConsume), composerStartRestartGroup, 560);
        if (!(!ComposerKt.isTraceInProgress())) {
            int i5 = f15046a + 83;
            f15047d = i5 % 128;
            if (i5 % 2 != 0) {
                ComposerKt.traceEventEnd();
                obj.hashCode();
                throw null;
            }
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(captureUiState, i2));
            return;
        }
        int i6 = f15047d + 91;
        f15046a = i6 % 128;
        int i7 = i6 % 2;
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f15048b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f15049c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f15050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ CaptureUiState f15051e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15049c + 99;
            f15048b = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15049c + 7;
            f15048b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Composer composer) throws Throwable {
            CaptureUiState captureUiState;
            int i2;
            int i3 = 2 % 2;
            int i4 = f15049c + 115;
            f15048b = i4 % 128;
            if (i4 % 2 == 0) {
                captureUiState = this.f15051e;
                i2 = this.f15050d;
            } else {
                captureUiState = this.f15051e;
                i2 = this.f15050d | 1;
            }
            CaptureScreenPreviewKt.access$PreviewCaptureScreenWithState(captureUiState, composer, RecomposeScopeImplKt.updateChangedFlags(i2));
            int i5 = f15049c + 9;
            f15048b = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CaptureUiState captureUiState, int i2) {
            super(2);
            this.f15051e = captureUiState;
            this.f15050d = i2;
        }
    }

    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f15057a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f15058e = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f15059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ CaptureUiState f15060d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15058e + 35;
            f15057a = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private void a(Composer composer) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f15058e + 95;
            f15057a = i3 % 128;
            int i4 = i3 % 2;
            CaptureScreenPreviewKt.access$PreviewCaptureScreen(this.f15060d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15059c | 1));
            int i5 = f15057a + 69;
            f15058e = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CaptureUiState captureUiState, int i2) {
            super(2);
            this.f15060d = captureUiState;
            this.f15059c = i2;
        }
    }
}
