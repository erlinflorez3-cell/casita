package com.incode.welcome_sdk.ui.id_capture.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.h;
import com.incode.welcome_sdk.commons.n;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics;
import com.incode.welcome_sdk.ui.id_capture.event.InitIdCaptureUiEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes5.dex */
public final class InitIdCaptureViewModel extends ViewModel {

    /* JADX INFO: renamed from: h */
    private static int f16264h = 0;

    /* JADX INFO: renamed from: j */
    private static int f16265j = 1;

    /* JADX INFO: renamed from: a */
    private final IncodeWelcomeRepository f16266a;

    /* JADX INFO: renamed from: b */
    private final n f16267b;

    /* JADX INFO: renamed from: c */
    private final h f16268c;

    /* JADX INFO: renamed from: d */
    private final IdCaptureAnalytics f16269d;

    /* JADX INFO: renamed from: e */
    private final IncodeWelcome f16270e;

    /* JADX INFO: renamed from: f */
    private final IdScan f16271f;

    /* JADX INFO: renamed from: g */
    private final MutableStateFlow<IdCaptureState> f16272g;

    /* JADX INFO: renamed from: i */
    private final StateFlow<IdCaptureState> f16273i;

    public static final /* synthetic */ void access$handleDocumentSelected(InitIdCaptureViewModel initIdCaptureViewModel, IdScan.IdType idType) {
        int i2 = 2 % 2;
        int i3 = f16265j + 81;
        f16264h = i3 % 128;
        int i4 = i3 % 2;
        initIdCaptureViewModel.e(idType);
        int i5 = f16264h + 109;
        f16265j = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$handlePermissionGranted(InitIdCaptureViewModel initIdCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = f16265j + 117;
        f16264h = i3 % 128;
        int i4 = i3 % 2;
        initIdCaptureViewModel.e();
        int i5 = f16264h + 121;
        f16265j = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$handleTutorialContinueClicked(InitIdCaptureViewModel initIdCaptureViewModel) {
        int i2 = 2 % 2;
        int i3 = f16264h + 69;
        f16265j = i3 % 128;
        int i4 = i3 % 2;
        initIdCaptureViewModel.a();
        if (i4 == 0) {
            throw null;
        }
        int i5 = f16265j + 33;
        f16264h = i5 % 128;
        int i6 = i5 % 2;
    }

    public final n getScreenNameHolder() {
        int i2 = 2 % 2;
        int i3 = f16264h + 117;
        f16265j = i3 % 128;
        int i4 = i3 % 2;
        n nVar = this.f16267b;
        if (i4 == 0) {
            int i5 = 61 / 0;
        }
        return nVar;
    }

    public final IdScan getIdScan() {
        int i2 = 2 % 2;
        int i3 = f16265j;
        int i4 = i3 + 51;
        f16264h = i4 % 128;
        int i5 = i4 % 2;
        IdScan idScan = this.f16271f;
        int i6 = i3 + 85;
        f16264h = i6 % 128;
        int i7 = i6 % 2;
        return idScan;
    }

    public InitIdCaptureViewModel(h hVar, IdCaptureAnalytics idCaptureAnalytics, IncodeWelcomeRepository incodeWelcomeRepository, IncodeWelcome incodeWelcome, n nVar, IdScan idScan) {
        IdCaptureState value;
        IdCaptureState idCaptureStateE;
        Intrinsics.checkNotNullParameter(hVar, "");
        Intrinsics.checkNotNullParameter(idCaptureAnalytics, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(incodeWelcome, "");
        Intrinsics.checkNotNullParameter(nVar, "");
        Intrinsics.checkNotNullParameter(idScan, "");
        this.f16268c = hVar;
        this.f16269d = idCaptureAnalytics;
        this.f16266a = incodeWelcomeRepository;
        this.f16270e = incodeWelcome;
        this.f16267b = nVar;
        this.f16271f = idScan;
        MutableStateFlow<IdCaptureState> MutableStateFlow = StateFlowKt.MutableStateFlow(new IdCaptureState(null, null, false, 7, null));
        this.f16272g = MutableStateFlow;
        this.f16273i = MutableStateFlow;
        do {
            value = MutableStateFlow.getValue();
            IdCaptureState idCaptureState = value;
            IdScan.IdType idType = this.f16266a.getIdType(this.f16271f.getIdCategory());
            boolean z2 = this.f16271f.getScanStep() == IdScan.ScanStep.BACK;
            if (idType != null && z2) {
                idCaptureStateE = e(idCaptureState, idType);
            } else {
                boolean showFooter = this.f16270e.getInternalConfig().getUxConfig().getShowFooter();
                if ((this.f16271f.isShowIdTypeChooser() && !z2) || this.f16271f.getIdType() == null) {
                    this.f16267b.e(ScreenName.ID_TYPE_CHOOSER);
                    idCaptureStateE = idCaptureState.copy(null, IdCaptureStep.DocumentSelection.f16282a, showFooter);
                } else if (this.f16271f.isShowIdTutorials()) {
                    this.f16267b.e(ScreenName.ID_CAPTURE_TUTORIAL);
                    idCaptureStateE = idCaptureState.copy(this.f16271f.getIdType(), IdCaptureStep.IdCaptureTutorial.f16285a, showFooter);
                } else {
                    idCaptureStateE = e(idCaptureState, this.f16271f.getIdType());
                }
            }
        } while (!MutableStateFlow.compareAndSet(value, idCaptureStateE));
    }

    public interface IdCaptureStep {

        public static final class DocumentSelection implements IdCaptureStep {

            /* JADX INFO: renamed from: a */
            public static final DocumentSelection f16282a = new DocumentSelection();

            /* JADX INFO: renamed from: c */
            private static int f16283c = 0;

            /* JADX INFO: renamed from: e */
            private static int f16284e = 1;

            private DocumentSelection() {
            }

            static {
                int i2 = f16283c + 27;
                f16284e = i2 % 128;
                int i3 = i2 % 2;
            }
        }

        public static final class IdCaptureTutorial implements IdCaptureStep {

            /* JADX INFO: renamed from: a */
            public static final IdCaptureTutorial f16285a = new IdCaptureTutorial();

            /* JADX INFO: renamed from: c */
            private static int f16286c = 1;

            /* JADX INFO: renamed from: d */
            private static int f16287d = 0;

            private IdCaptureTutorial() {
            }

            static {
                int i2 = f16286c + 123;
                f16287d = i2 % 128;
                int i3 = i2 % 2;
            }
        }

        public static final class PermissionOnboarding implements IdCaptureStep {

            /* JADX INFO: renamed from: a */
            private static int f16288a = 0;

            /* JADX INFO: renamed from: c */
            private static int f16289c = 1;

            /* JADX INFO: renamed from: d */
            public static final PermissionOnboarding f16290d = new PermissionOnboarding();

            private PermissionOnboarding() {
            }

            static {
                int i2 = f16289c + 37;
                f16288a = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }
        }

        public static final class Capture implements IdCaptureStep {

            /* JADX INFO: renamed from: c */
            private static int f16279c = 1;

            /* JADX INFO: renamed from: e */
            private static int f16280e = 0;

            /* JADX INFO: renamed from: a */
            private final IdScan.IdType f16281a;

            public Capture(IdScan.IdType idType) {
                Intrinsics.checkNotNullParameter(idType, "");
                this.f16281a = idType;
            }

            public final IdScan.IdType getSelectedIdType() {
                int i2 = 2 % 2;
                int i3 = f16279c;
                int i4 = i3 + 61;
                f16280e = i4 % 128;
                int i5 = i4 % 2;
                IdScan.IdType idType = this.f16281a;
                int i6 = i3 + 83;
                f16280e = i6 % 128;
                if (i6 % 2 == 0) {
                    return idType;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final boolean equals(Object obj) {
                int i2 = 2 % 2;
                if (this == obj) {
                    int i3 = f16279c + 105;
                    f16280e = i3 % 128;
                    return i3 % 2 == 0;
                }
                if (!(obj instanceof Capture)) {
                    return false;
                }
                if (this.f16281a != ((Capture) obj).f16281a) {
                    int i4 = f16280e + 57;
                    f16279c = i4 % 128;
                    return i4 % 2 == 0;
                }
                int i5 = f16279c + 9;
                f16280e = i5 % 128;
                if (i5 % 2 == 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public final int hashCode() {
                int i2 = 2 % 2;
                int i3 = f16280e + 13;
                f16279c = i3 % 128;
                int i4 = i3 % 2;
                IdScan.IdType idType = this.f16281a;
                if (i4 != 0) {
                    return idType.hashCode();
                }
                idType.hashCode();
                throw null;
            }

            public final String toString() {
                int i2 = 2 % 2;
                int i3 = f16280e + 107;
                f16279c = i3 % 128;
                int i4 = i3 % 2;
                String str = "Capture(selectedIdType=" + this.f16281a + ")";
                int i5 = f16279c + 79;
                f16280e = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public static /* synthetic */ Capture copy$default(Capture capture, IdScan.IdType idType, int i2, Object obj) {
                int i3 = 2 % 2;
                int i4 = f16280e + 63;
                int i5 = i4 % 128;
                f16279c = i5;
                int i6 = i4 % 2;
                if ((i2 & 1) != 0) {
                    int i7 = i5 + 75;
                    f16280e = i7 % 128;
                    if (i7 % 2 != 0) {
                        IdScan.IdType idType2 = capture.f16281a;
                        throw null;
                    }
                    idType = capture.f16281a;
                }
                return capture.copy(idType);
            }

            public final Capture copy(IdScan.IdType idType) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(idType, "");
                Capture capture = new Capture(idType);
                int i3 = f16280e + 77;
                f16279c = i3 % 128;
                if (i3 % 2 != 0) {
                    return capture;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final IdScan.IdType component1() {
                int i2 = 2 % 2;
                int i3 = f16280e;
                int i4 = i3 + 89;
                f16279c = i4 % 128;
                int i5 = i4 % 2;
                IdScan.IdType idType = this.f16281a;
                int i6 = i3 + 53;
                f16279c = i6 % 128;
                int i7 = i6 % 2;
                return idType;
            }
        }
    }

    public static final class IdCaptureState {

        /* JADX INFO: renamed from: b */
        private static int f16274b = 0;

        /* JADX INFO: renamed from: d */
        private static int f16275d = 1;

        /* JADX INFO: renamed from: a */
        private final IdCaptureStep f16276a;

        /* JADX INFO: renamed from: c */
        private final boolean f16277c;

        /* JADX INFO: renamed from: e */
        private final IdScan.IdType f16278e;

        public IdCaptureState(IdScan.IdType idType, IdCaptureStep idCaptureStep, boolean z2) {
            Intrinsics.checkNotNullParameter(idCaptureStep, "");
            this.f16278e = idType;
            this.f16276a = idCaptureStep;
            this.f16277c = z2;
        }

        public final IdScan.IdType getSelectedDocument() {
            int i2 = 2 % 2;
            int i3 = f16274b + 105;
            int i4 = i3 % 128;
            f16275d = i4;
            int i5 = i3 % 2;
            IdScan.IdType idType = this.f16278e;
            int i6 = i4 + 11;
            f16274b = i6 % 128;
            if (i6 % 2 == 0) {
                return idType;
            }
            throw null;
        }

        public /* synthetic */ IdCaptureState(IdScan.IdType idType, IdCaptureStep.DocumentSelection documentSelection, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : idType, (i2 & 2) != 0 ? IdCaptureStep.DocumentSelection.f16282a : documentSelection, (i2 & 4) != 0 ? false : z2);
        }

        public final IdCaptureStep getIdCaptureStep() {
            IdCaptureStep idCaptureStep;
            int i2 = 2 % 2;
            int i3 = f16275d + 121;
            int i4 = i3 % 128;
            f16274b = i4;
            if (i3 % 2 != 0) {
                idCaptureStep = this.f16276a;
                int i5 = 62 / 0;
            } else {
                idCaptureStep = this.f16276a;
            }
            int i6 = i4 + 95;
            f16275d = i6 % 128;
            int i7 = i6 % 2;
            return idCaptureStep;
        }

        public final boolean getShowFooter() {
            int i2 = 2 % 2;
            int i3 = f16274b + 99;
            int i4 = i3 % 128;
            f16275d = i4;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            boolean z2 = this.f16277c;
            int i5 = i4 + 5;
            f16274b = i5 % 128;
            if (i5 % 2 == 0) {
                return z2;
            }
            throw null;
        }

        public IdCaptureState() {
            this(null, null, false, 7, null);
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f16275d;
            int i4 = i3 + 9;
            int i5 = i4 % 128;
            f16274b = i5;
            int i6 = i4 % 2;
            if (this == obj) {
                int i7 = i5 + 101;
                f16275d = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
            if (!(obj instanceof IdCaptureState)) {
                int i9 = i3 + 89;
                f16274b = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            IdCaptureState idCaptureState = (IdCaptureState) obj;
            if (this.f16278e != idCaptureState.f16278e || !Intrinsics.areEqual(this.f16276a, idCaptureState.f16276a)) {
                return false;
            }
            if (this.f16277c == idCaptureState.f16277c) {
                return true;
            }
            int i11 = f16275d + 113;
            f16274b = i11 % 128;
            return i11 % 2 != 0;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f16274b + 65;
            f16275d = i3 % 128;
            int i4 = i3 % 2;
            IdScan.IdType idType = this.f16278e;
            int iHashCode = ((((idType == null ? 0 : idType.hashCode()) * 31) + this.f16276a.hashCode()) * 31) + Boolean.hashCode(this.f16277c);
            int i5 = f16275d + 59;
            f16274b = i5 % 128;
            if (i5 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f16275d + 91;
            f16274b = i3 % 128;
            int i4 = i3 % 2;
            String str = "IdCaptureState(selectedDocument=" + this.f16278e + ", idCaptureStep=" + this.f16276a + ", showFooter=" + this.f16277c + ")";
            int i5 = f16274b + 47;
            f16275d = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ IdCaptureState copy$default(IdCaptureState idCaptureState, IdScan.IdType idType, IdCaptureStep idCaptureStep, boolean z2, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f16275d + 9;
            int i5 = i4 % 128;
            f16274b = i5;
            if (i4 % 2 == 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
                idType = idCaptureState.f16278e;
            }
            if ((i2 & 2) != 0) {
                int i6 = i5 + 87;
                f16275d = i6 % 128;
                if (i6 % 2 == 0) {
                    IdCaptureStep idCaptureStep2 = idCaptureState.f16276a;
                    throw null;
                }
                idCaptureStep = idCaptureState.f16276a;
            }
            if ((i2 & 4) != 0) {
                z2 = idCaptureState.f16277c;
            }
            return idCaptureState.copy(idType, idCaptureStep, z2);
        }

        public final IdCaptureState copy(IdScan.IdType idType, IdCaptureStep idCaptureStep, boolean z2) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(idCaptureStep, "");
            IdCaptureState idCaptureState = new IdCaptureState(idType, idCaptureStep, z2);
            int i3 = f16274b + 125;
            f16275d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 96 / 0;
            }
            return idCaptureState;
        }

        public final boolean component3() {
            int i2 = 2 % 2;
            int i3 = f16275d + 75;
            int i4 = i3 % 128;
            f16274b = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f16277c;
            int i6 = i4 + 35;
            f16275d = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 36 / 0;
            }
            return z2;
        }

        public final IdCaptureStep component2() {
            int i2 = 2 % 2;
            int i3 = f16274b + 43;
            f16275d = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureStep idCaptureStep = this.f16276a;
            if (i4 == 0) {
                int i5 = 50 / 0;
            }
            return idCaptureStep;
        }

        public final IdScan.IdType component1() {
            int i2 = 2 % 2;
            int i3 = f16275d;
            int i4 = i3 + 105;
            f16274b = i4 % 128;
            int i5 = i4 % 2;
            IdScan.IdType idType = this.f16278e;
            int i6 = i3 + 17;
            f16274b = i6 % 128;
            if (i6 % 2 == 0) {
                return idType;
            }
            throw null;
        }
    }

    public final StateFlow<IdCaptureState> getState() {
        int i2 = 2 % 2;
        int i3 = f16264h + 59;
        f16265j = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f16273i;
        }
        throw null;
    }

    static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        private static int f16291a = 1;

        /* JADX INFO: renamed from: b */
        private static int f16292b = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ InitIdCaptureViewModel f16293c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ InitIdCaptureUiEvent f16294d;

        /* JADX INFO: renamed from: e */
        private int f16295e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            InitIdCaptureUiEvent initIdCaptureUiEvent = this.f16294d;
            if (Intrinsics.areEqual(initIdCaptureUiEvent, InitIdCaptureUiEvent.DocumentSelectionUiEventInit.IdentityCardSelected.f15039d)) {
                int i3 = f16292b + 17;
                f16291a = i3 % 128;
                int i4 = i3 % 2;
                InitIdCaptureViewModel.access$handleDocumentSelected(this.f16293c, IdScan.IdType.ID);
            } else if (Intrinsics.areEqual(initIdCaptureUiEvent, InitIdCaptureUiEvent.DocumentSelectionUiEventInit.PassportSelected.f15041d)) {
                InitIdCaptureViewModel.access$handleDocumentSelected(this.f16293c, IdScan.IdType.PASSPORT);
            } else if (Intrinsics.areEqual(initIdCaptureUiEvent, InitIdCaptureUiEvent.ContinueFromTutorial.f15036e)) {
                InitIdCaptureViewModel.access$handleTutorialContinueClicked(this.f16293c);
            } else if (Intrinsics.areEqual(initIdCaptureUiEvent, InitIdCaptureUiEvent.PermissionGranted.f15044b)) {
                int i5 = f16291a + 51;
                f16292b = i5 % 128;
                int i6 = i5 % 2;
                InitIdCaptureViewModel.access$handlePermissionGranted(this.f16293c);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16292b + 57;
            f16291a = i3 % 128;
            int i4 = i3 % 2;
            Object objE = e(coroutineScope, continuation);
            int i5 = f16291a + 65;
            f16292b = i5 % 128;
            if (i5 % 2 == 0) {
                return objE;
            }
            throw null;
        }

        private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16291a + 49;
            f16292b = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                cVar.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = cVar.invokeSuspend(unit);
            int i5 = f16291a + 23;
            f16292b = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            c cVar = new c(this.f16294d, this.f16293c, continuation);
            int i3 = f16291a + 97;
            f16292b = i3 % 128;
            if (i3 % 2 == 0) {
                return cVar;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InitIdCaptureUiEvent initIdCaptureUiEvent, InitIdCaptureViewModel initIdCaptureViewModel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f16294d = initIdCaptureUiEvent;
            this.f16293c = initIdCaptureViewModel;
        }
    }

    public final void onEvent(InitIdCaptureUiEvent initIdCaptureUiEvent) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(initIdCaptureUiEvent, "");
        this.f16269d.handleInitIdCaptureUiEvent(initIdCaptureUiEvent);
        Object obj = null;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(initIdCaptureUiEvent, this, null), 3, null);
        int i3 = f16265j + 63;
        f16264h = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void e() {
        IdCaptureState value;
        IdScan.IdType selectedDocument;
        int i2 = 2 % 2;
        int i3 = f16264h + 37;
        f16265j = i3 % 128;
        if (i3 % 2 != 0) {
            MutableStateFlow<IdCaptureState> mutableStateFlow = this.f16272g;
            do {
                value = mutableStateFlow.getValue();
                selectedDocument = this.f16273i.getValue().getSelectedDocument();
                Intrinsics.checkNotNull(selectedDocument);
            } while (!mutableStateFlow.compareAndSet(value, IdCaptureState.copy$default(value, null, new IdCaptureStep.Capture(selectedDocument), false, 5, null)));
            return;
        }
        throw null;
    }

    private final void e(IdScan.IdType idType) {
        IdCaptureState value;
        IdCaptureState value2;
        int i2 = 2 % 2;
        int i3 = f16265j + 61;
        f16264h = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        MutableStateFlow<IdCaptureState> mutableStateFlow = this.f16272g;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, IdCaptureState.copy$default(value, idType, null, false, 6, null)));
        int i4 = f16265j + 77;
        f16264h = i4 % 128;
        int i5 = i4 % 2;
        if (!this.f16271f.isShowIdTutorials()) {
            c();
            return;
        }
        int i6 = f16265j + 111;
        f16264h = i6 % 128;
        if (i6 % 2 != 0) {
            this.f16267b.e(ScreenName.ID_CAPTURE_TUTORIAL);
            obj.hashCode();
            throw null;
        }
        this.f16267b.e(ScreenName.ID_CAPTURE_TUTORIAL);
        MutableStateFlow<IdCaptureState> mutableStateFlow2 = this.f16272g;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, IdCaptureState.copy$default(value2, null, IdCaptureStep.IdCaptureTutorial.f16285a, false, 5, null)));
        int i7 = f16264h + 45;
        f16265j = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void a() {
        int i2 = 2 % 2;
        int i3 = f16265j + 35;
        f16264h = i3 % 128;
        int i4 = i3 % 2;
        c();
        int i5 = f16265j + 97;
        f16264h = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final void c() {
        IdCaptureState value;
        IdCaptureState idCaptureState;
        IdScan.IdType selectedDocument;
        int i2 = 2 % 2;
        int i3 = f16265j + 37;
        f16264h = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<IdCaptureState> mutableStateFlow = this.f16272g;
        do {
            value = mutableStateFlow.getValue();
            idCaptureState = value;
            selectedDocument = idCaptureState.getSelectedDocument();
            Intrinsics.checkNotNull(selectedDocument);
        } while (!mutableStateFlow.compareAndSet(value, e(idCaptureState, selectedDocument)));
        int i5 = f16264h + 111;
        f16265j = i5 % 128;
        int i6 = i5 % 2;
    }

    private final IdCaptureState e(IdCaptureState idCaptureState, IdScan.IdType idType) {
        int i2 = 2 % 2;
        int i3 = f16265j + 103;
        f16264h = i3 % 128;
        int i4 = i3 % 2;
        if (this.f16268c.e(h.c.f5163d)) {
            this.f16267b.e(d());
            return IdCaptureState.copy$default(idCaptureState, null, new IdCaptureStep.Capture(idType), false, 5, null);
        }
        this.f16267b.e(ScreenName.FAKE_PERMISSION);
        IdCaptureState idCaptureStateCopy$default = IdCaptureState.copy$default(idCaptureState, idType, IdCaptureStep.PermissionOnboarding.f16290d, false, 4, null);
        int i5 = f16264h + 33;
        f16265j = i5 % 128;
        if (i5 % 2 != 0) {
            return idCaptureStateCopy$default;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final ScreenName d() {
        int i2 = 2 % 2;
        int i3 = f16265j + 57;
        f16264h = i3 % 128;
        if (i3 % 2 != 0) {
            this.f16271f.getIdType();
            IdScan.IdType idType = IdScan.IdType.PASSPORT;
            throw null;
        }
        if (this.f16271f.getIdType() == IdScan.IdType.PASSPORT) {
            return ScreenName.PASSPORT_CAMERA_CAPTURE;
        }
        ScreenName screenName = ScreenName.FRONT_ID_CAMERA_CAPTURE;
        int i4 = f16264h + 49;
        f16265j = i4 % 128;
        int i5 = i4 % 2;
        return screenName;
    }
}
