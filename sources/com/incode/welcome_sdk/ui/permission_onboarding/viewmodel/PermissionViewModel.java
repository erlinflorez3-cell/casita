package com.incode.welcome_sdk.ui.permission_onboarding.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.CloseButtonPosition;
import com.incode.welcome_sdk.commons.b;
import com.incode.welcome_sdk.commons.g;
import com.incode.welcome_sdk.commons.h;
import com.incode.welcome_sdk.commons.n;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics;
import com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent;
import com.incode.welcome_sdk.ui.permission_onboarding.viewmodel.PermissionOnboardingStep;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes5.dex */
public final class PermissionViewModel extends ViewModel {

    /* JADX INFO: renamed from: f */
    private static int f16853f = 0;

    /* JADX INFO: renamed from: i */
    private static int f16854i = 1;

    /* JADX INFO: renamed from: a */
    private final g f16855a;

    /* JADX INFO: renamed from: b */
    private final n f16856b;

    /* JADX INFO: renamed from: c */
    private final IdCaptureAnalytics f16857c;

    /* JADX INFO: renamed from: d */
    private final b f16858d;

    /* JADX INFO: renamed from: e */
    private final h f16859e;

    /* JADX INFO: renamed from: g */
    private final MutableStateFlow<State> f16860g;

    /* JADX INFO: renamed from: h */
    private final StateFlow<State> f16861h;

    public static final /* synthetic */ b access$getActionsHandler$p(PermissionViewModel permissionViewModel) {
        int i2 = 2 % 2;
        int i3 = f16853f;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f16854i = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        b bVar = permissionViewModel.f16858d;
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 103;
        f16854i = i6 % 128;
        if (i6 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    public static final /* synthetic */ IdCaptureAnalytics access$getIdCaptureAnalytics$p(PermissionViewModel permissionViewModel) {
        int i2 = 2 % 2;
        int i3 = f16854i + 81;
        int i4 = i3 % 128;
        f16853f = i4;
        int i5 = i3 % 2;
        IdCaptureAnalytics idCaptureAnalytics = permissionViewModel.f16857c;
        if (i5 != 0) {
            int i6 = 97 / 0;
        }
        int i7 = i4 + 121;
        f16854i = i7 % 128;
        int i8 = i7 % 2;
        return idCaptureAnalytics;
    }

    public static final /* synthetic */ void access$handleAllowPermissionClicked(PermissionViewModel permissionViewModel) {
        int i2 = 2 % 2;
        int i3 = f16854i + 77;
        f16853f = i3 % 128;
        int i4 = i3 % 2;
        permissionViewModel.e();
        int i5 = f16853f + 13;
        f16854i = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$handleDoNotAllowPermissionClicked(PermissionViewModel permissionViewModel) {
        int i2 = 2 % 2;
        int i3 = f16853f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f16854i = i3 % 128;
        int i4 = i3 % 2;
        permissionViewModel.d();
        int i5 = f16853f + 21;
        f16854i = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$handleLearnMoreClicked(PermissionViewModel permissionViewModel) {
        int i2 = 2 % 2;
        int i3 = f16854i + 75;
        f16853f = i3 % 128;
        int i4 = i3 % 2;
        permissionViewModel.a();
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$handleOpenSystemSettingsClicked(PermissionViewModel permissionViewModel) throws Exception {
        int i2 = 2 % 2;
        int i3 = f16854i + 85;
        f16853f = i3 % 128;
        int i4 = i3 % 2;
        permissionViewModel.c();
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$handlePermissionResult(PermissionViewModel permissionViewModel, PermissionOnboardingEvent.OnPermissionResult onPermissionResult) {
        int i2 = 2 % 2;
        int i3 = f16853f + 55;
        f16854i = i3 % 128;
        int i4 = i3 % 2;
        permissionViewModel.e(onPermissionResult);
        int i5 = f16853f + 29;
        f16854i = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PermissionViewModel(g gVar, IdCaptureAnalytics idCaptureAnalytics, n nVar, b bVar, h hVar, IncodeWelcome incodeWelcome) {
        PermissionOnboardingStep.Intro intro;
        Intrinsics.checkNotNullParameter(gVar, "");
        Intrinsics.checkNotNullParameter(idCaptureAnalytics, "");
        Intrinsics.checkNotNullParameter(nVar, "");
        Intrinsics.checkNotNullParameter(bVar, "");
        Intrinsics.checkNotNullParameter(hVar, "");
        Intrinsics.checkNotNullParameter(incodeWelcome, "");
        this.f16855a = gVar;
        this.f16857c = idCaptureAnalytics;
        this.f16856b = nVar;
        this.f16858d = bVar;
        this.f16859e = hVar;
        if (hVar.a()) {
            intro = PermissionOnboardingStep.OpenSettingsFallback.f16848b;
        } else {
            intro = PermissionOnboardingStep.Intro.f16843d;
        }
        MutableStateFlow<State> MutableStateFlow = StateFlowKt.MutableStateFlow(new State(intro, incodeWelcome.getInternalConfig().getUxConfig().getCloseButtonPosition(), incodeWelcome.getInternalConfig().isShowCloseButton()));
        this.f16860g = MutableStateFlow;
        this.f16861h = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final StateFlow<State> getState() {
        int i2 = 2 % 2;
        int i3 = f16854i + 31;
        int i4 = i3 % 128;
        f16853f = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        StateFlow<State> stateFlow = this.f16861h;
        int i5 = i4 + 47;
        f16854i = i5 % 128;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        throw null;
    }

    public static final class State {

        /* JADX INFO: renamed from: b */
        private static int f16862b = 0;

        /* JADX INFO: renamed from: e */
        private static int f16863e = 1;

        /* JADX INFO: renamed from: a */
        private final PermissionOnboardingStep f16864a;

        /* JADX INFO: renamed from: c */
        private final boolean f16865c;

        /* JADX INFO: renamed from: d */
        private final CloseButtonPosition f16866d;

        public State(PermissionOnboardingStep permissionOnboardingStep, CloseButtonPosition closeButtonPosition, boolean z2) {
            Intrinsics.checkNotNullParameter(permissionOnboardingStep, "");
            Intrinsics.checkNotNullParameter(closeButtonPosition, "");
            this.f16864a = permissionOnboardingStep;
            this.f16866d = closeButtonPosition;
            this.f16865c = z2;
        }

        public final PermissionOnboardingStep getPermissionStep() {
            int i2 = 2 % 2;
            int i3 = f16862b;
            int i4 = i3 + 49;
            f16863e = i4 % 128;
            int i5 = i4 % 2;
            PermissionOnboardingStep permissionOnboardingStep = this.f16864a;
            int i6 = i3 + 61;
            f16863e = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 61 / 0;
            }
            return permissionOnboardingStep;
        }

        public final CloseButtonPosition getCloseButtonPosition() {
            int i2 = 2 % 2;
            int i3 = f16862b + 19;
            int i4 = i3 % 128;
            f16863e = i4;
            int i5 = i3 % 2;
            CloseButtonPosition closeButtonPosition = this.f16866d;
            int i6 = i4 + 107;
            f16862b = i6 % 128;
            int i7 = i6 % 2;
            return closeButtonPosition;
        }

        public final boolean getShowCloseButton() {
            int i2 = 2 % 2;
            int i3 = f16863e + 35;
            f16862b = i3 % 128;
            int i4 = i3 % 2;
            boolean z2 = this.f16865c;
            if (i4 != 0) {
                int i5 = 27 / 0;
            }
            return z2;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f16862b + 63;
            int i4 = i3 % 128;
            f16863e = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                int i5 = i4 + 19;
                f16862b = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (obj instanceof State) {
                State state = (State) obj;
                return Intrinsics.areEqual(this.f16864a, state.f16864a) && this.f16866d == state.f16866d && this.f16865c == state.f16865c;
            }
            int i7 = i4 + 125;
            f16862b = i7 % 128;
            return i7 % 2 != 0;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f16862b + 101;
            f16863e = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = (((this.f16864a.hashCode() * 31) + this.f16866d.hashCode()) * 31) + Boolean.hashCode(this.f16865c);
            int i5 = f16862b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f16863e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 39 / 0;
            }
            return iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f16863e + 81;
            f16862b = i3 % 128;
            int i4 = i3 % 2;
            String str = "State(permissionStep=" + this.f16864a + ", closeButtonPosition=" + this.f16866d + ", showCloseButton=" + this.f16865c + ")";
            int i5 = f16863e + 59;
            f16862b = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public static /* synthetic */ State copy$default(State state, PermissionOnboardingStep permissionOnboardingStep, CloseButtonPosition closeButtonPosition, boolean z2, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f16863e + 93;
            int i5 = i4 % 128;
            f16862b = i5;
            int i6 = i4 % 2;
            if ((i2 & 1) != 0) {
                int i7 = i5 + 95;
                f16863e = i7 % 128;
                int i8 = i7 % 2;
                permissionOnboardingStep = state.f16864a;
            }
            if ((i2 & 2) != 0) {
                closeButtonPosition = state.f16866d;
                int i9 = f16863e + 123;
                f16862b = i9 % 128;
                int i10 = i9 % 2;
            }
            if ((i2 & 4) != 0) {
                z2 = state.f16865c;
            }
            return state.copy(permissionOnboardingStep, closeButtonPosition, z2);
        }

        public final State copy(PermissionOnboardingStep permissionOnboardingStep, CloseButtonPosition closeButtonPosition, boolean z2) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(permissionOnboardingStep, "");
            Intrinsics.checkNotNullParameter(closeButtonPosition, "");
            State state = new State(permissionOnboardingStep, closeButtonPosition, z2);
            int i3 = f16862b + 49;
            f16863e = i3 % 128;
            if (i3 % 2 != 0) {
                return state;
            }
            throw null;
        }

        public final boolean component3() {
            int i2 = 2 % 2;
            int i3 = f16863e + 91;
            int i4 = i3 % 128;
            f16862b = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f16865c;
            int i6 = i4 + 55;
            f16863e = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final CloseButtonPosition component2() {
            int i2 = 2 % 2;
            int i3 = f16862b;
            int i4 = i3 + 1;
            f16863e = i4 % 128;
            int i5 = i4 % 2;
            CloseButtonPosition closeButtonPosition = this.f16866d;
            int i6 = i3 + 5;
            f16863e = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 86 / 0;
            }
            return closeButtonPosition;
        }

        public final PermissionOnboardingStep component1() {
            int i2 = 2 % 2;
            int i3 = f16863e + 55;
            int i4 = i3 % 128;
            f16862b = i4;
            int i5 = i3 % 2;
            PermissionOnboardingStep permissionOnboardingStep = this.f16864a;
            int i6 = i4 + 11;
            f16863e = i6 % 128;
            int i7 = i6 % 2;
            return permissionOnboardingStep;
        }
    }

    static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        private static int f16867a = 0;

        /* JADX INFO: renamed from: b */
        private static int f16868b = 1;

        /* JADX INFO: renamed from: d */
        private int f16870d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ PermissionOnboardingEvent f16871e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            boolean zAreEqual;
            int i2 = 2 % 2;
            int i3 = f16868b + 13;
            f16867a = i3 % 128;
            int i4 = i3 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            PermissionViewModel.access$getIdCaptureAnalytics$p(PermissionViewModel.this).handlePermissionOnboardingEvent(this.f16871e);
            PermissionOnboardingEvent permissionOnboardingEvent = this.f16871e;
            if (Intrinsics.areEqual(permissionOnboardingEvent, PermissionOnboardingEvent.OnIntroAllowPermissionClicked.f16506a)) {
                int i5 = f16868b + 7;
                int i6 = i5 % 128;
                f16867a = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 121;
                f16868b = i8 % 128;
                if (!(i8 % 2 != 0)) {
                    int i9 = 3 / 4;
                }
                zAreEqual = true;
            } else {
                zAreEqual = Intrinsics.areEqual(permissionOnboardingEvent, PermissionOnboardingEvent.OnLearnMoreAllowPermissionClicked.f16516d);
            }
            if (zAreEqual) {
                PermissionViewModel.access$handleAllowPermissionClicked(PermissionViewModel.this);
            } else if (Intrinsics.areEqual(permissionOnboardingEvent, PermissionOnboardingEvent.OnIntroDoNotAllowPermissionClicked.f16511c)) {
                PermissionViewModel.access$handleDoNotAllowPermissionClicked(PermissionViewModel.this);
            } else if (Intrinsics.areEqual(permissionOnboardingEvent, PermissionOnboardingEvent.OnIntroLearnMoreClicked.f16512b)) {
                PermissionViewModel.access$handleLearnMoreClicked(PermissionViewModel.this);
            } else if (Intrinsics.areEqual(permissionOnboardingEvent, PermissionOnboardingEvent.OnOpenSystemSettingsClicked.f16519b)) {
                PermissionViewModel.access$handleOpenSystemSettingsClicked(PermissionViewModel.this);
            } else if (!(!(permissionOnboardingEvent instanceof PermissionOnboardingEvent.OnPermissionResult))) {
                PermissionViewModel.access$handlePermissionResult(PermissionViewModel.this, (PermissionOnboardingEvent.OnPermissionResult) this.f16871e);
                int i10 = f16868b + 35;
                f16867a = i10 % 128;
                int i11 = i10 % 2;
            } else if (Intrinsics.areEqual(permissionOnboardingEvent, PermissionOnboardingEvent.OnQuitClicked.f16526e)) {
                PermissionViewModel.access$getActionsHandler$p(PermissionViewModel.this).getModuleQuitAttempt().invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Exception {
            int i2 = 2 % 2;
            int i3 = f16868b + 33;
            f16867a = i3 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 != 0) {
                b(coroutineScope2, continuation2);
                throw null;
            }
            Object objB = b(coroutineScope2, continuation2);
            int i4 = f16867a + 21;
            f16868b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
            }
            return objB;
        }

        private Object b(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Exception {
            int i2 = 2 % 2;
            int i3 = f16867a + 79;
            f16868b = i3 % 128;
            int i4 = i3 % 2;
            a aVar = (a) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return aVar.invokeSuspend(unit);
            }
            aVar.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            a aVar = PermissionViewModel.this.new a(this.f16871e, continuation);
            int i3 = f16867a + 91;
            f16868b = i3 % 128;
            if (i3 % 2 != 0) {
                return aVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(PermissionOnboardingEvent permissionOnboardingEvent, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f16871e = permissionOnboardingEvent;
        }
    }

    public final void onEvent(PermissionOnboardingEvent permissionOnboardingEvent) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(permissionOnboardingEvent, null), 3, null);
        int i3 = f16854i + 21;
        f16853f = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void e(PermissionOnboardingEvent.OnPermissionResult onPermissionResult) {
        State value;
        int i2 = 2 % 2;
        int i3 = f16853f + 61;
        f16854i = i3 % 128;
        int i4 = i3 % 2;
        this.f16859e.c();
        if (onPermissionResult.getGranted()) {
            return;
        }
        int i5 = f16853f;
        int i6 = i5 + 51;
        f16854i = i6 % 128;
        int i7 = i6 % 2;
        MutableStateFlow<State> mutableStateFlow = this.f16860g;
        int i8 = i5 + 69;
        f16854i = i8 % 128;
        int i9 = i8 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, State.copy$default(value, PermissionOnboardingStep.DoNotAllowRealPermission.f16840e, null, false, 6, null)));
    }

    private final void c() throws Exception {
        int i2 = 2 % 2;
        int i3 = f16853f + 57;
        f16854i = i3 % 128;
        int i4 = i3 % 2;
        this.f16855a.e();
        int i5 = f16854i + 111;
        f16853f = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void a() {
        State value;
        int i2 = 2 % 2;
        MutableStateFlow<State> mutableStateFlow = this.f16860g;
        int i3 = f16853f + 87;
        f16854i = i3 % 128;
        int i4 = i3 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, State.copy$default(value, PermissionOnboardingStep.LearnMore.f16846d, null, false, 6, null)));
        int i5 = f16853f + 99;
        f16854i = i5 % 128;
        int i6 = i5 % 2;
        this.f16856b.e(ScreenName.FAKE_PERMISSION_DECLINE);
    }

    private final void e() {
        State value;
        int i2 = 2 % 2;
        int i3 = f16853f + 123;
        f16854i = i3 % 128;
        if (i3 % 2 != 0) {
            MutableStateFlow<State> mutableStateFlow = this.f16860g;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, State.copy$default(value, PermissionOnboardingStep.AskForRealPermission.f16834e, null, false, 6, null)));
            int i4 = f16853f + 1;
            f16854i = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        throw null;
    }

    private final void d() {
        State value;
        int i2 = 2 % 2;
        int i3 = f16854i + 29;
        f16853f = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<State> mutableStateFlow = this.f16860g;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, State.copy$default(value, PermissionOnboardingStep.DoNotAllow.f16835a, null, false, 6, null)));
        int i5 = f16853f + 7;
        f16854i = i5 % 128;
        int i6 = i5 % 2;
    }
}
