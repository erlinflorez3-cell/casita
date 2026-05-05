package com.incode.welcome_sdk.ui.id_capture;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.commons.utils.Side;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.n;
import com.incode.welcome_sdk.commons.statsig.StatsigManager;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.o;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCapture;
import com.incode.welcome_sdk.ui.camera.id_validation.base.SwitchCaptureKt;
import com.incode.welcome_sdk.ui.id_capture.InfoModel;
import com.incode.welcome_sdk.ui.id_capture.event.IdCaptureUiEvent;
import com.incode.welcome_sdk.ui.id_capture.event.InitIdCaptureUiEvent;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureAnalytics {

    /* JADX INFO: renamed from: i */
    private static int f14720i = 0;

    /* JADX INFO: renamed from: j */
    private static int f14721j = 1;

    /* JADX INFO: renamed from: a */
    private final IncodeWelcomeRepository f14722a;

    /* JADX INFO: renamed from: b */
    private DocumentType f14723b;

    /* JADX INFO: renamed from: c */
    private final o f14724c;

    /* JADX INFO: renamed from: d */
    private final n f14725d;

    /* JADX INFO: renamed from: e */
    private boolean f14726e;

    /* JADX INFO: renamed from: f */
    private final LinkedList<String> f14727f;

    public IdCaptureAnalytics(IncodeWelcomeRepository incodeWelcomeRepository, n nVar) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(nVar, "");
        this.f14722a = incodeWelcomeRepository;
        this.f14725d = nVar;
        this.f14723b = DocumentType.FRONT_ID;
        this.f14724c = new o(incodeWelcomeRepository, nVar, Modules.ID);
        this.f14727f = new LinkedList<>();
    }

    public static final /* synthetic */ DocumentType access$getLastDocumentType$p(IdCaptureAnalytics idCaptureAnalytics) {
        int i2 = 2 % 2;
        int i3 = f14721j + 17;
        int i4 = i3 % 128;
        f14720i = i4;
        int i5 = i3 % 2;
        DocumentType documentType = idCaptureAnalytics.f14723b;
        int i6 = i4 + 45;
        f14721j = i6 % 128;
        int i7 = i6 % 2;
        return documentType;
    }

    public static final /* synthetic */ LinkedList access$getManualCaptureEventValues$p(IdCaptureAnalytics idCaptureAnalytics) {
        int i2 = 2 % 2;
        int i3 = f14721j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f14720i = i4;
        int i5 = i3 % 2;
        LinkedList<String> linkedList = idCaptureAnalytics.f14727f;
        int i6 = i4 + 21;
        f14721j = i6 % 128;
        int i7 = i6 % 2;
        return linkedList;
    }

    public static final /* synthetic */ n access$getScreenNameHolder$p(IdCaptureAnalytics idCaptureAnalytics) {
        int i2 = 2 % 2;
        int i3 = f14720i;
        int i4 = i3 + 115;
        f14721j = i4 % 128;
        int i5 = i4 % 2;
        n nVar = idCaptureAnalytics.f14725d;
        int i6 = i3 + 109;
        f14721j = i6 % 128;
        int i7 = i6 % 2;
        return nVar;
    }

    public static final /* synthetic */ void access$sendCorrectionFeedbackEvent(IdCaptureAnalytics idCaptureAnalytics, SuggestionBoxModel suggestionBoxModel) {
        int i2 = 2 % 2;
        int i3 = f14721j + 73;
        f14720i = i3 % 128;
        int i4 = i3 % 2;
        idCaptureAnalytics.e(suggestionBoxModel);
        int i5 = f14721j + 51;
        f14720i = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$sendIdShowHint(IdCaptureAnalytics idCaptureAnalytics) {
        int i2 = 2 % 2;
        int i3 = f14721j + 35;
        f14720i = i3 % 128;
        int i4 = i3 % 2;
        idCaptureAnalytics.a();
        int i5 = f14721j + 73;
        f14720i = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$trackOrientationChange(IdCaptureAnalytics idCaptureAnalytics, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f14720i + 85;
        f14721j = i3 % 128;
        int i4 = i3 % 2;
        idCaptureAnalytics.b(z2);
        if (i4 == 0) {
            throw null;
        }
    }

    public final void storeEventValue(String str) {
        int i2 = 2 % 2;
        int i3 = f14720i + 67;
        f14721j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.f14727f.addLast(str);
            if (this.f14727f.size() <= 88) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.f14727f.addLast(str);
            if (this.f14727f.size() <= 30) {
                return;
            }
        }
        this.f14727f.removeFirst();
        int i4 = f14721j + 109;
        f14720i = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 4;
        }
    }

    public final void clearEventValues() {
        int i2 = 2 % 2;
        int i3 = f14721j + 45;
        f14720i = i3 % 128;
        if (i3 % 2 != 0) {
            this.f14727f.clear();
            int i4 = 36 / 0;
        } else {
            this.f14727f.clear();
        }
        int i5 = f14720i + 31;
        f14721j = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void sendSwitchToManualEvent(DocumentType documentType, IdCategory idCategory, IdScan.IdType idType) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(documentType, "");
        Intrinsics.checkNotNullParameter(idCategory, "");
        Intrinsics.checkNotNullParameter(idType, "");
        StatsigManager.logEvent(com.incode.welcome_sdk.commons.statsig.c.f5429e);
        SwitchCapture switchCaptureSwitchCaptureOf = SwitchCaptureKt.switchCaptureOf(DocumentTypeExtensionsKt.toValidationPhase(documentType), idCategory, idType);
        HashMap<String, Object> map = switchCaptureSwitchCaptureOf.toMap();
        map.put(EventValues.ERROR_STATES.getValue(), new JSONArray((Collection) this.f14727f));
        EventUtils.supportSendEvent(this.f14722a, switchCaptureSwitchCaptureOf.getEventValue(), Modules.ID, map);
        int i3 = f14720i + 83;
        f14721j = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void sendCaptureFrameDetected(DocumentAnalysisEvent.BoundsDetected boundsDetected) {
        Event event;
        int i2 = 2 % 2;
        int i3 = f14721j + 107;
        f14720i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(boundsDetected, "");
        int i5 = WhenMappings.f14728b[boundsDetected.getDocumentSide().ordinal()];
        if (i5 == 1) {
            event = Event.FRONT_ID_DETECTED;
        } else if (i5 != 2) {
            event = null;
        } else {
            event = Event.BACK_ID_DETECTED;
            int i6 = f14720i + 89;
            f14721j = i6 % 128;
            int i7 = i6 % 2;
        }
        if (event != null) {
            this.f14724c.c(event);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x001f A[PHI: r2
  0x001f: PHI (r2v3 com.incode.welcome_sdk.commons.utils.o) = (r2v0 com.incode.welcome_sdk.commons.utils.o), (r2v4 com.incode.welcome_sdk.commons.utils.o) binds: [B:23:0x003c, B:18:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f A[PHI: r2
  0x003f: PHI (r2v1 com.incode.welcome_sdk.commons.utils.o) = (r2v0 com.incode.welcome_sdk.commons.utils.o), (r2v4 com.incode.welcome_sdk.commons.utils.o) binds: [B:23:0x003c, B:18:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void sendUploadComplete(com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14720i
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14721j = r0
            int r1 = r1 % r3
            java.lang.String r0 = ""
            if (r1 != 0) goto L2e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.incode.welcome_sdk.commons.utils.o r2 = r4.f14724c
            int[] r1 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.WhenMappings.f14729c
            int r0 = r5.ordinal()
            r0 = r1[r0]
            if (r0 != 0) goto L3f
        L1f:
            com.incode.welcome_sdk.data.Event r0 = com.incode.welcome_sdk.data.Event.BACK_ID_UPLOAD_SUCCEEDED
        L21:
            r2.c(r0)
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14721j
            int r1 = r0 + 35
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14720i = r0
            int r1 = r1 % r3
            return
        L2e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.incode.welcome_sdk.commons.utils.o r2 = r4.f14724c
            int[] r1 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.WhenMappings.f14729c
            int r0 = r5.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 != r0) goto L3f
            goto L1f
        L3f:
            com.incode.welcome_sdk.data.Event r0 = com.incode.welcome_sdk.data.Event.FRONT_ID_UPLOAD_SUCCEEDED
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.sendUploadComplete(com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType):void");
    }

    static final class c extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f14738c = 1;

        /* JADX INFO: renamed from: d */
        private static int f14739d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f14739d + 93;
            f14738c = i3 % 128;
            int i4 = i3 % 2;
            b(bool.booleanValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f14738c + 121;
            f14739d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void b(boolean z2) {
            String value;
            int i2 = 2 % 2;
            IdCaptureAnalytics.access$trackOrientationChange(IdCaptureAnalytics.this, z2);
            LinkedList linkedListAccess$getManualCaptureEventValues$p = IdCaptureAnalytics.access$getManualCaptureEventValues$p(IdCaptureAnalytics.this);
            if (z2) {
                int i3 = f14738c + 71;
                f14739d = i3 % 128;
                if (i3 % 2 != 0) {
                    value = EventValues.VERTICAL_ID_DETECTED.getValue();
                    int i4 = 69 / 0;
                } else {
                    value = EventValues.VERTICAL_ID_DETECTED.getValue();
                }
            } else {
                value = EventValues.HORIZONTAL_ID_DETECTED.getValue();
            }
            linkedListAccess$getManualCaptureEventValues$p.add(value);
            int i5 = f14738c + 41;
            f14739d = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        c() {
            super(1);
        }
    }

    static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: d */
        private static int f14735d = 1;

        /* JADX INFO: renamed from: e */
        private static int f14736e = 0;

        private void d() {
            int i2 = 2 % 2;
            int i3 = f14736e + 11;
            f14735d = i3 % 128;
            if (i3 % 2 == 0) {
                IdCaptureAnalytics.access$sendIdShowHint(IdCaptureAnalytics.this);
                throw null;
            }
            IdCaptureAnalytics.access$sendIdShowHint(IdCaptureAnalytics.this);
            int i4 = f14736e + 101;
            f14735d = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f14735d + 21;
            f14736e = i3 % 128;
            int i4 = i3 % 2;
            d();
            Unit unit = Unit.INSTANCE;
            int i5 = f14735d + 7;
            f14736e = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        b() {
            super(0);
        }
    }

    static final class a extends Lambda implements Function1<SuggestionBoxModel, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f14732c = 0;

        /* JADX INFO: renamed from: e */
        private static int f14733e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(SuggestionBoxModel suggestionBoxModel) {
            int i2 = 2 % 2;
            int i3 = f14733e + 113;
            f14732c = i3 % 128;
            int i4 = i3 % 2;
            b(suggestionBoxModel);
            Unit unit = Unit.INSTANCE;
            int i5 = f14733e + 25;
            f14732c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void b(SuggestionBoxModel suggestionBoxModel) {
            int i2 = 2 % 2;
            int i3 = f14733e + 109;
            f14732c = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(suggestionBoxModel, "");
                IdCaptureAnalytics.access$sendCorrectionFeedbackEvent(IdCaptureAnalytics.this, suggestionBoxModel);
                throw null;
            }
            Intrinsics.checkNotNullParameter(suggestionBoxModel, "");
            IdCaptureAnalytics.access$sendCorrectionFeedbackEvent(IdCaptureAnalytics.this, suggestionBoxModel);
            int i4 = f14733e + 121;
            f14732c = i4 % 128;
            int i5 = i4 % 2;
        }

        a() {
            super(1);
        }
    }

    static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        private static int f14741b = 0;

        /* JADX INFO: renamed from: c */
        private static int f14742c = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f14742c + 95;
            f14741b = i3 % 128;
            int i4 = i3 % 2;
            e();
            Unit unit = Unit.INSTANCE;
            int i5 = f14741b + 33;
            f14742c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 45 / 0;
            }
            return unit;
        }

        private void e() {
            ScreenName screenName;
            int i2 = 2 % 2;
            int i3 = f14742c + 111;
            f14741b = i3 % 128;
            int i4 = i3 % 2;
            n nVarAccess$getScreenNameHolder$p = IdCaptureAnalytics.access$getScreenNameHolder$p(IdCaptureAnalytics.this);
            if (IdCaptureAnalytics.access$getLastDocumentType$p(IdCaptureAnalytics.this) != DocumentType.FRONT_ID) {
                screenName = ScreenName.BACK_ID_HELP;
            } else {
                int i5 = f14742c + 23;
                f14741b = i5 % 128;
                if (i5 % 2 == 0) {
                    screenName = ScreenName.FRONT_ID_HELP;
                } else {
                    ScreenName screenName2 = ScreenName.FRONT_ID_HELP;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            nVarAccess$getScreenNameHolder$p.e(screenName);
        }

        d() {
            super(0);
        }
    }

    public final void trackUIStateUpdateIfNeeded(CaptureUiState captureUiState, CaptureUiState captureUiState2) {
        int i2 = 2 % 2;
        int i3 = f14720i + 59;
        f14721j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(captureUiState, "");
            Intrinsics.checkNotNullParameter(captureUiState2, "");
            captureUiState2.getCaptureFrameSpec().getDocumentType();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(captureUiState, "");
        Intrinsics.checkNotNullParameter(captureUiState2, "");
        final DocumentType documentType = captureUiState2.getCaptureFrameSpec().getDocumentType();
        if (this.f14723b != documentType) {
            this.f14723b = documentType;
            this.f14726e = false;
            this.f14725d.e(IdCaptureAnalyticsKt.access$toScreenName(documentType));
        }
        IdCaptureAnalyticsKt.access$isChanged(captureUiState2.getCaptureFrameSpec().getVertical(), captureUiState.getCaptureFrameSpec().getVertical(), new c());
        IdCaptureAnalyticsKt.access$isShown(captureUiState2.getShowFillTheFrameAnimation(), captureUiState.getShowFillTheFrameAnimation(), new b());
        SuggestionBoxModel suggestionBoxModel = captureUiState2.getSuggestionBoxModel();
        if (suggestionBoxModel != null) {
            IdCaptureAnalyticsKt.access$isShown(suggestionBoxModel, captureUiState.getSuggestionBoxModel(), new a());
        }
        IdCaptureAnalyticsKt.access$isShown(captureUiState2.getInfoModel(), captureUiState.getInfoModel(), new Function1<InfoModel, Unit>() { // from class: com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics$trackUIStateUpdateIfNeeded$1$4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f14744b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f14745d = 1;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(InfoModel infoModel) {
                int i4 = 2 % 2;
                int i5 = f14745d + 125;
                f14744b = i5 % 128;
                int i6 = i5 % 2;
                e(infoModel);
                Unit unit = Unit.INSTANCE;
                int i7 = f14745d + 63;
                f14744b = i7 % 128;
                if (i7 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void e(com.incode.welcome_sdk.ui.id_capture.InfoModel r5) {
                /*
                    r4 = this;
                    r3 = 2
                    int r0 = r3 % r3
                    java.lang.String r0 = ""
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    com.incode.welcome_sdk.ui.id_capture.InfoModel$InfoModelType r0 = r5.getType()
                    int[] r1 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics$trackUIStateUpdateIfNeeded$1$4.WhenMappings.f14749c
                    int r0 = r0.ordinal()
                    r1 = r1[r0]
                    r0 = 1
                    if (r1 == r0) goto L38
                    if (r1 == r3) goto L43
                    r0 = 3
                    if (r1 == r0) goto L35
                    r0 = 4
                    if (r1 != r0) goto L4f
                    r2 = 0
                L20:
                    if (r2 == 0) goto L34
                    int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics$trackUIStateUpdateIfNeeded$1$4.f14745d
                    int r1 = r0 + 5
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics$trackUIStateUpdateIfNeeded$1$4.f14744b = r0
                    int r1 = r1 % r3
                    com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics r0 = r3
                    com.incode.welcome_sdk.commons.n r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.access$getScreenNameHolder$p(r0)
                    r0.e(r2)
                L34:
                    return
                L35:
                    com.incode.welcome_sdk.ScreenName r2 = com.incode.welcome_sdk.ScreenName.DOCUMENT_SCAN_SUCCESS
                    goto L20
                L38:
                    com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = r2
                    com.incode.welcome_sdk.ScreenName r2 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalyticsKt.access$toScreenName(r0)
                    int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics$trackUIStateUpdateIfNeeded$1$4.f14744b
                    int r1 = r0 + 17
                    goto L49
                L43:
                    com.incode.welcome_sdk.ScreenName r2 = com.incode.welcome_sdk.ScreenName.DOCUMENT_SCAN_PROBLEM
                    int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics$trackUIStateUpdateIfNeeded$1$4.f14744b
                    int r1 = r0 + 87
                L49:
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics$trackUIStateUpdateIfNeeded$1$4.f14745d = r0
                    int r1 = r1 % r3
                    goto L20
                L4f:
                    kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                    r0.<init>()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics$trackUIStateUpdateIfNeeded$1$4.e(com.incode.welcome_sdk.ui.id_capture.InfoModel):void");
            }

            public /* synthetic */ class WhenMappings {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f14748a = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ int[] f14749c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f14750d = 1;

                static {
                    int[] iArr = new int[InfoModel.InfoModelType.values().length];
                    try {
                        iArr[InfoModel.InfoModelType.f14893b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[InfoModel.InfoModelType.f14896e.ordinal()] = 2;
                        int i2 = f14748a + 35;
                        f14750d = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 2 % 2;
                        }
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[InfoModel.InfoModelType.f14895d.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[InfoModel.InfoModelType.f14892a.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f14749c = iArr;
                    int i4 = f14750d + 87;
                    f14748a = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        IdCaptureAnalyticsKt.access$isShown(captureUiState2.getShowHelpDialog(), captureUiState.getShowHelpDialog(), new d());
        int i4 = f14720i + 79;
        f14721j = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(boolean r8) {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14721j
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14720i = r0
            int r1 = r1 % r6
            r5 = 0
            if (r1 == 0) goto L3a
            r0 = 1
            int r0 = r0 / r5
            if (r8 == 0) goto L3d
        L13:
            com.incode.welcome_sdk.data.EventValues r4 = com.incode.welcome_sdk.data.EventValues.VERTICAL
        L15:
            com.incode.welcome_sdk.commons.utils.o r3 = r7.f14724c
            com.incode.welcome_sdk.data.Event r2 = com.incode.welcome_sdk.data.Event.SWITCHED_ORIENTATION
            r0 = 1
            kotlin.Pair[] r1 = new kotlin.Pair[r0]
            java.lang.String r0 = "NEW_ORIENTATION"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r4)
            r1[r5] = r0
            java.util.HashMap r0 = kotlin.collections.MapsKt.hashMapOf(r1)
            r3.c(r2, r0)
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14721j
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14720i = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L39
            r0 = 36
            int r0 = r0 / r5
        L39:
            return
        L3a:
            if (r8 == 0) goto L3d
            goto L13
        L3d:
            com.incode.welcome_sdk.data.EventValues r4 = com.incode.welcome_sdk.data.EventValues.HORIZONTAL
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.b(boolean):void");
    }

    private final void a() {
        int i2 = 2 % 2;
        if (!this.f14726e) {
            int i3 = f14720i + 123;
            f14721j = i3 % 128;
            int i4 = i3 % 2;
            this.f14724c.c(Event.HINT_SHOWED);
            int i5 = f14721j + 115;
            f14720i = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f14726e = true;
    }

    private final void e(SuggestionBoxModel suggestionBoxModel) {
        o oVar;
        Event event;
        HashMap<String, Object> mapHashMapOf;
        int i2 = 2 % 2;
        int i3 = f14721j + 43;
        f14720i = i3 % 128;
        if (i3 % 2 != 0) {
            oVar = this.f14724c;
            event = Event.CORRECTION_FEEDBACK;
            Pair[] pairArr = new Pair[1];
            pairArr[1] = TuplesKt.to(EventValues.FEEDBACK.getValue(), suggestionBoxModel.getType().name());
            mapHashMapOf = MapsKt.hashMapOf(pairArr);
        } else {
            oVar = this.f14724c;
            event = Event.CORRECTION_FEEDBACK;
            mapHashMapOf = MapsKt.hashMapOf(TuplesKt.to(EventValues.FEEDBACK.getValue(), suggestionBoxModel.getType().name()));
        }
        oVar.c(event, mapHashMapOf);
    }

    public final void handleCaptureUiEvent(IdCaptureUiEvent idCaptureUiEvent) {
        Event event;
        boolean zAreEqual;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(idCaptureUiEvent, "");
        Object obj = null;
        if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.RetakeScanClicked.f15019b)) {
            event = Event.SCAN_RETAKE_CLICKED;
        } else if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.ScanTheBackClicked.f15027c)) {
            event = Event.SCAN_BACK_CLICKED;
        } else if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.ScanTheFrontClicked.f15029b)) {
            event = Event.SCAN_FRONT_CLICKED;
        } else if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.ContinueClicked.f15002d)) {
            int i3 = f14720i + 77;
            f14721j = i3 % 128;
            int i4 = i3 % 2;
            event = Event.CONTINUE_CLICKED;
        } else if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.ManualCaptureClicked.f15016b)) {
            int i5 = f14721j + 107;
            f14720i = i5 % 128;
            int i6 = i5 % 2;
            event = Event.MANUAL_CAPTURE_SCAN;
        } else if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.HelpManualScanClicked.f15011d)) {
            event = Event.CLICK_MANUAL_SCAN;
        } else {
            if (!(!Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.HelpScanClicked.f15013a))) {
                int i7 = f14721j + 107;
                f14720i = i7 % 128;
                int i8 = i7 % 2;
                event = Event.CLICK_SCAN;
            } else if (Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.RetryClicked.f15024e)) {
                event = Event.SCAN_UPLOAD_RETRY_CLICKED;
            } else {
                if ((Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.CloseClicked.f15000d) ? true : Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.HelpCloseClicked.f15007b) ? 'J' : '\f') != 'J') {
                    zAreEqual = Intrinsics.areEqual(idCaptureUiEvent, IdCaptureUiEvent.HelpClicked.f15006e);
                    int i9 = f14721j + 77;
                    f14720i = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    int i11 = f14720i + 15;
                    f14721j = i11 % 128;
                    int i12 = i11 % 2;
                    zAreEqual = true;
                }
                if (!(zAreEqual ? true : idCaptureUiEvent instanceof IdCaptureUiEvent.SmallScreenDeviceDetected)) {
                    throw new NoWhenBranchMatchedException();
                }
                event = null;
            }
        }
        if (event != null) {
            int i13 = f14720i + 57;
            f14721j = i13 % 128;
            int i14 = i13 % 2;
            this.f14724c.c(event);
            int i15 = f14720i + 109;
            f14721j = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = f14720i + 87;
        f14721j = i17 % 128;
        if (i17 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void handleInitIdCaptureUiEvent(InitIdCaptureUiEvent initIdCaptureUiEvent) {
        Event event;
        int i2 = 2 % 2;
        int i3 = f14721j + 77;
        f14720i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(initIdCaptureUiEvent, "");
        if (Intrinsics.areEqual(initIdCaptureUiEvent, InitIdCaptureUiEvent.DocumentSelectionUiEventInit.PassportSelected.f15041d)) {
            int i5 = f14720i + 71;
            f14721j = i5 % 128;
            int i6 = i5 % 2;
            event = Event.PASSPORT_CLICKED;
        } else if (Intrinsics.areEqual(initIdCaptureUiEvent, InitIdCaptureUiEvent.DocumentSelectionUiEventInit.IdentityCardSelected.f15039d)) {
            event = Event.ID_CLICKED;
        } else if (Intrinsics.areEqual(initIdCaptureUiEvent, InitIdCaptureUiEvent.ContinueFromTutorial.f15036e)) {
            event = Event.CLICK_SCAN;
        } else {
            if (!Intrinsics.areEqual(initIdCaptureUiEvent, InitIdCaptureUiEvent.PermissionGranted.f15044b)) {
                throw new NoWhenBranchMatchedException();
            }
            int i7 = f14721j + 1;
            f14720i = i7 % 128;
            event = null;
            if (i7 % 2 != 0) {
                event.hashCode();
                throw null;
            }
        }
        if (event != null) {
            int i8 = f14721j + 69;
            f14720i = i8 % 128;
            int i9 = i8 % 2;
            this.f14724c.c(event);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handlePermissionOnboardingEvent(com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14720i
            int r2 = r0 + 21
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14721j = r0
            int r2 = r2 % r3
            java.lang.String r0 = ""
            r1 = 0
            if (r2 == 0) goto L94
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent$OnIntroAllowPermissionClicked r0 = com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent.OnIntroAllowPermissionClicked.f16506a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            if (r0 == 0) goto L2f
            com.incode.welcome_sdk.data.Event r1 = com.incode.welcome_sdk.data.Event.CLICKED_ALLOW
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14721j
            int r2 = r0 + 69
        L22:
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14720i = r0
            int r2 = r2 % r3
        L27:
            if (r1 == 0) goto L2e
            com.incode.welcome_sdk.commons.utils.o r0 = r4.f14724c
            r0.c(r1)
        L2e:
            return
        L2f:
            com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent$OnLearnMoreAllowPermissionClicked r0 = com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent.OnLearnMoreAllowPermissionClicked.f16516d
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            if (r0 == 0) goto L45
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14720i
            int r2 = r0 + 79
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14721j = r0
            int r2 = r2 % r3
            if (r2 == 0) goto L8b
            com.incode.welcome_sdk.data.Event r1 = com.incode.welcome_sdk.data.Event.CLICKED_ALLOW
            goto L27
        L45:
            com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent$OnIntroLearnMoreClicked r0 = com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent.OnIntroLearnMoreClicked.f16512b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            if (r0 == 0) goto L53
            r0 = 1
        L4e:
            if (r0 == 0) goto L5a
            com.incode.welcome_sdk.data.Event r1 = com.incode.welcome_sdk.data.Event.CLICKED_DONT_ALLOW
            goto L27
        L53:
            com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent$OnIntroDoNotAllowPermissionClicked r0 = com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent.OnIntroDoNotAllowPermissionClicked.f16511c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            goto L4e
        L5a:
            com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent$OnOpenSystemSettingsClicked r0 = com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent.OnOpenSystemSettingsClicked.f16519b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            if (r0 == 0) goto L6e
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14720i
            int r1 = r0 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14721j = r0
            int r1 = r1 % r3
            com.incode.welcome_sdk.data.Event r1 = com.incode.welcome_sdk.data.Event.CLICKED_OPEN_SETTINGS
            goto L27
        L6e:
            com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent$OnQuitClicked r0 = com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent.OnQuitClicked.f16526e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            if (r0 == 0) goto L82
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14721j
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14720i = r0
            int r1 = r1 % r3
            com.incode.welcome_sdk.data.Event r1 = com.incode.welcome_sdk.data.Event.CLICKED_QUIT
            goto L27
        L82:
            boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent.OnPermissionResult
            if (r0 == 0) goto L8e
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.f14721j
            int r2 = r0 + 31
            goto L22
        L8b:
            com.incode.welcome_sdk.data.Event r0 = com.incode.welcome_sdk.data.Event.CLICKED_ALLOW
            throw r1
        L8e:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L94:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent$OnIntroAllowPermissionClicked r0 = com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent.OnIntroAllowPermissionClicked.f16506a
            kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalytics.handlePermissionOnboardingEvent(com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent):void");
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f14728b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f14729c;

        /* JADX INFO: renamed from: d */
        private static int f14730d = 1;

        /* JADX INFO: renamed from: e */
        private static int f14731e = 0;

        static {
            int[] iArr = new int[Side.values().length];
            try {
                iArr[Side.FRONT.ordinal()] = 1;
                int i2 = f14730d + 13;
                f14731e = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 5 / 4;
                } else {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Side.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14728b = iArr;
            int[] iArr2 = new int[DocumentType.values().length];
            try {
                iArr2[DocumentType.BACK_ID.ordinal()] = 1;
                int i5 = f14730d + 25;
                f14731e = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            f14729c = iArr2;
        }
    }
}
