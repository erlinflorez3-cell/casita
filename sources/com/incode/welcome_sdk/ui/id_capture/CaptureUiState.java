package com.incode.welcome_sdk.ui.id_capture;

import androidx.compose.ui.graphics.ImageBitmap;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.CloseButtonPosition;
import com.incode.welcome_sdk.commons.HelpButtonPosition;
import com.incode.welcome_sdk.data.local.a;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError;
import com.incode.welcome_sdk.ui.id_capture.InfoModel;
import com.incode.welcome_sdk.ui.id_capture.SuggestionBoxModel;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptureUiState {
    private static int B = 1;
    private static int D = 0;
    private static int E = 1;

    /* JADX INFO: renamed from: e */
    public static final Companion f14575e = new Companion(null);

    /* JADX INFO: renamed from: z */
    private static int f14576z = 0;
    private final HelpButtonPosition A;
    private final CloseButtonPosition C;

    /* JADX INFO: renamed from: a */
    private final SuggestionBoxModel f14577a;

    /* JADX INFO: renamed from: b */
    private final boolean f14578b;

    /* JADX INFO: renamed from: c */
    private final InfoModel f14579c;

    /* JADX INFO: renamed from: d */
    private final AnalyzingDocumentModel f14580d;

    /* JADX INFO: renamed from: f */
    private final boolean f14581f;

    /* JADX INFO: renamed from: g */
    private final CaptureFrameSpec f14582g;

    /* JADX INFO: renamed from: h */
    private final boolean f14583h;

    /* JADX INFO: renamed from: i */
    private final boolean f14584i;

    /* JADX INFO: renamed from: j */
    private final StatusColor f14585j;

    /* JADX INFO: renamed from: k */
    private final boolean f14586k;

    /* JADX INFO: renamed from: l */
    private final boolean f14587l;

    /* JADX INFO: renamed from: m */
    private final ImageBitmap f14588m;

    /* JADX INFO: renamed from: n */
    private final ImageBitmap f14589n;

    /* JADX INFO: renamed from: o */
    private final boolean f14590o;

    /* JADX INFO: renamed from: p */
    private final boolean f14591p;

    /* JADX INFO: renamed from: q */
    private final boolean f14592q;

    /* JADX INFO: renamed from: r */
    private final Integer f14593r;

    /* JADX INFO: renamed from: s */
    private final BottomButton f14594s;

    /* JADX INFO: renamed from: t */
    private final boolean f14595t;

    /* JADX INFO: renamed from: u */
    private final boolean f14596u;

    /* JADX INFO: renamed from: v */
    private final AcceptedDocumentsUiState f14597v;

    /* JADX INFO: renamed from: w */
    private final boolean f14598w;

    /* JADX INFO: renamed from: x */
    private final boolean f14599x;

    /* JADX INFO: renamed from: y */
    private final IconTintType f14600y;

    public CaptureUiState(boolean z2, SuggestionBoxModel suggestionBoxModel, InfoModel infoModel, AnalyzingDocumentModel analyzingDocumentModel, boolean z3, boolean z4, CaptureFrameSpec captureFrameSpec, StatusColor statusColor, boolean z5, ImageBitmap imageBitmap, ImageBitmap imageBitmap2, boolean z6, boolean z7, boolean z8, Integer num, boolean z9, BottomButton bottomButton, boolean z10, boolean z11, boolean z12, boolean z13, IconTintType iconTintType, boolean z14, AcceptedDocumentsUiState acceptedDocumentsUiState, CloseButtonPosition closeButtonPosition, HelpButtonPosition helpButtonPosition) {
        Intrinsics.checkNotNullParameter(captureFrameSpec, "");
        Intrinsics.checkNotNullParameter(statusColor, "");
        Intrinsics.checkNotNullParameter(iconTintType, "");
        Intrinsics.checkNotNullParameter(closeButtonPosition, "");
        Intrinsics.checkNotNullParameter(helpButtonPosition, "");
        this.f14578b = z2;
        this.f14577a = suggestionBoxModel;
        this.f14579c = infoModel;
        this.f14580d = analyzingDocumentModel;
        this.f14581f = z3;
        this.f14584i = z4;
        this.f14582g = captureFrameSpec;
        this.f14585j = statusColor;
        this.f14583h = z5;
        this.f14588m = imageBitmap;
        this.f14589n = imageBitmap2;
        this.f14587l = z6;
        this.f14586k = z7;
        this.f14590o = z8;
        this.f14593r = num;
        this.f14592q = z9;
        this.f14594s = bottomButton;
        this.f14595t = z10;
        this.f14591p = z11;
        this.f14598w = z12;
        this.f14596u = z13;
        this.f14600y = iconTintType;
        this.f14599x = z14;
        this.f14597v = acceptedDocumentsUiState;
        this.C = closeButtonPosition;
        this.A = helpButtonPosition;
    }

    public final boolean getShowLoader() {
        int i2 = 2 % 2;
        int i3 = f14576z;
        int i4 = i3 + 25;
        B = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f14578b;
        int i6 = i3 + 123;
        B = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SuggestionBoxModel getSuggestionBoxModel() {
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 39;
        f14576z = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SuggestionBoxModel suggestionBoxModel = this.f14577a;
        int i5 = i3 + 91;
        f14576z = i5 % 128;
        if (i5 % 2 == 0) {
            return suggestionBoxModel;
        }
        throw null;
    }

    public final InfoModel getInfoModel() {
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 27;
        f14576z = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        InfoModel infoModel = this.f14579c;
        int i5 = i3 + 25;
        f14576z = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return infoModel;
    }

    public final AnalyzingDocumentModel getAnalyzingDocumentModel() {
        int i2 = 2 % 2;
        int i3 = f14576z + 43;
        int i4 = i3 % 128;
        B = i4;
        int i5 = i3 % 2;
        AnalyzingDocumentModel analyzingDocumentModel = this.f14580d;
        int i6 = i4 + 103;
        f14576z = i6 % 128;
        int i7 = i6 % 2;
        return analyzingDocumentModel;
    }

    public final boolean getShowCameraPreview() {
        int i2 = 2 % 2;
        int i3 = B + 75;
        int i4 = i3 % 128;
        f14576z = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f14581f;
        int i6 = i4 + 49;
        B = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 62 / 0;
        }
        return z2;
    }

    public final boolean getShowCaptureFrame() {
        int i2 = 2 % 2;
        int i3 = f14576z;
        int i4 = i3 + 73;
        B = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f14584i;
        int i6 = i3 + 107;
        B = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public /* synthetic */ CaptureUiState(boolean z2, SuggestionBoxModel suggestionBoxModel, InfoModel infoModel, AnalyzingDocumentModel analyzingDocumentModel, boolean z3, boolean z4, CaptureFrameSpec captureFrameSpec, StatusColor statusColor, boolean z5, ImageBitmap imageBitmap, ImageBitmap imageBitmap2, boolean z6, boolean z7, boolean z8, Integer num, boolean z9, BottomButton bottomButton, boolean z10, boolean z11, boolean z12, boolean z13, IconTintType iconTintType, boolean z14, AcceptedDocumentsUiState acceptedDocumentsUiState, CloseButtonPosition closeButtonPosition, HelpButtonPosition helpButtonPosition, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? null : suggestionBoxModel, (i2 & 4) != 0 ? null : infoModel, (i2 & 8) != 0 ? null : analyzingDocumentModel, (i2 & 16) != 0 ? true : z3, (i2 & 32) != 0 ? true : z4, (i2 & 64) != 0 ? CaptureFrameSpec.Companion.from$default(CaptureFrameSpec.f14613b, DocumentType.FRONT_ID, false, false, null, 12, null) : captureFrameSpec, (i2 & 128) != 0 ? StatusColor.f14903b : statusColor, (i2 & 256) != 0 ? false : z5, (i2 & 512) != 0 ? null : imageBitmap, (i2 & 1024) != 0 ? null : imageBitmap2, (i2 & 2048) != 0 ? false : z6, (i2 & 4096) != 0 ? false : z7, (i2 & 8192) != 0 ? false : z8, (i2 & 16384) != 0 ? null : num, (32768 & i2) != 0 ? false : z9, (65536 & i2) != 0 ? null : bottomButton, (131072 & i2) != 0 ? true : z10, (262144 & i2) != 0 ? false : z11, (524288 & i2) != 0 ? true : z12, (1048576 & i2) != 0 ? false : z13, (2097152 & i2) != 0 ? IconTintType.f14646e : iconTintType, (4194304 & i2) != 0 ? false : z14, (8388608 & i2) != 0 ? null : acceptedDocumentsUiState, (16777216 & i2) != 0 ? CloseButtonPosition.TOP_LEFT : closeButtonPosition, (i2 & 33554432) != 0 ? HelpButtonPosition.BOTTOM_RIGHT : helpButtonPosition);
    }

    public final CaptureFrameSpec getCaptureFrameSpec() {
        int i2 = 2 % 2;
        int i3 = B + 11;
        f14576z = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f14582g;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StatusColor getCaptureFrameBorderColor() {
        int i2 = 2 % 2;
        int i3 = B + 51;
        int i4 = i3 % 128;
        f14576z = i4;
        int i5 = i3 % 2;
        StatusColor statusColor = this.f14585j;
        int i6 = i4 + 77;
        B = i6 % 128;
        if (i6 % 2 != 0) {
            return statusColor;
        }
        throw null;
    }

    public final boolean getShowCaptureFrameFlash() {
        int i2 = 2 % 2;
        int i3 = B + 79;
        int i4 = i3 % 128;
        f14576z = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f14583h;
        int i6 = i4 + 55;
        B = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final ImageBitmap getCaptureFrameImage() {
        int i2 = 2 % 2;
        int i3 = B + 7;
        int i4 = i3 % 128;
        f14576z = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ImageBitmap imageBitmap = this.f14588m;
        int i5 = i4 + 9;
        B = i5 % 128;
        int i6 = i5 % 2;
        return imageBitmap;
    }

    public final ImageBitmap getPreviewFrameImage() {
        int i2 = 2 % 2;
        int i3 = B + 85;
        int i4 = i3 % 128;
        f14576z = i4;
        int i5 = i3 % 2;
        ImageBitmap imageBitmap = this.f14589n;
        int i6 = i4 + 101;
        B = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 27 / 0;
        }
        return imageBitmap;
    }

    public final boolean getShowLaserAnimation() {
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 61;
        f14576z = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f14587l;
        int i6 = i3 + 75;
        f14576z = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean getShowFillTheFrameAnimation() {
        int i2 = 2 % 2;
        int i3 = B + 37;
        f14576z = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f14586k;
        if (i4 != 0) {
            int i5 = 61 / 0;
        }
        return z2;
    }

    public final boolean getDelayFillTheFrameAnimation() {
        int i2 = 2 % 2;
        int i3 = f14576z;
        int i4 = i3 + 35;
        B = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f14590o;
        int i5 = i3 + 55;
        B = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final Integer getShooterCounterValue() {
        int i2 = 2 % 2;
        int i3 = B + 67;
        int i4 = i3 % 128;
        f14576z = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.f14593r;
        int i5 = i4 + 1;
        B = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final boolean getTransitionToBackIdShown() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f14576z + 83;
        int i4 = i3 % 128;
        B = i4;
        if (i3 % 2 == 0) {
            z2 = this.f14592q;
            int i5 = 99 / 0;
        } else {
            z2 = this.f14592q;
        }
        int i6 = i4 + 55;
        f14576z = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BottomButton getBottomButton() {
        BottomButton bottomButton;
        int i2 = 2 % 2;
        int i3 = f14576z + 95;
        int i4 = i3 % 128;
        B = i4;
        if (i3 % 2 == 0) {
            bottomButton = this.f14594s;
            int i5 = 38 / 0;
        } else {
            bottomButton = this.f14594s;
        }
        int i6 = i4 + 115;
        f14576z = i6 % 128;
        if (i6 % 2 == 0) {
            return bottomButton;
        }
        throw null;
    }

    public final boolean getBottomButtonEnabled() {
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 85;
        f14576z = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f14595t;
        int i5 = i3 + 59;
        f14576z = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final boolean getShowHelpDialog() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f14576z + 37;
        int i4 = i3 % 128;
        B = i4;
        if (i3 % 2 == 0) {
            z2 = this.f14591p;
            int i5 = 12 / 0;
        } else {
            z2 = this.f14591p;
        }
        int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14576z = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean getShowHelpButton() {
        int i2 = 2 % 2;
        int i3 = B + 49;
        int i4 = i3 % 128;
        f14576z = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f14598w;
        int i6 = i4 + 83;
        B = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getShowCloseButton() {
        int i2 = 2 % 2;
        int i3 = f14576z + 59;
        B = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f14596u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IconTintType getIconTintType() {
        int i2 = 2 % 2;
        int i3 = f14576z + 73;
        B = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f14600y;
        }
        throw null;
    }

    public final boolean getShowImageAsBlurred() {
        int i2 = 2 % 2;
        int i3 = f14576z + 9;
        int i4 = i3 % 128;
        B = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f14599x;
        int i6 = i4 + 3;
        f14576z = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AcceptedDocumentsUiState getAcceptedDocuments() {
        int i2 = 2 % 2;
        int i3 = B + 101;
        int i4 = i3 % 128;
        f14576z = i4;
        int i5 = i3 % 2;
        AcceptedDocumentsUiState acceptedDocumentsUiState = this.f14597v;
        int i6 = i4 + 47;
        B = i6 % 128;
        int i7 = i6 % 2;
        return acceptedDocumentsUiState;
    }

    public final CloseButtonPosition getCloseButtonPosition() {
        int i2 = 2 % 2;
        int i3 = f14576z;
        int i4 = i3 + 95;
        B = i4 % 128;
        int i5 = i4 % 2;
        CloseButtonPosition closeButtonPosition = this.C;
        int i6 = i3 + 107;
        B = i6 % 128;
        int i7 = i6 % 2;
        return closeButtonPosition;
    }

    public final HelpButtonPosition getHelpButtonPosition() {
        int i2 = 2 % 2;
        int i3 = f14576z;
        int i4 = i3 + 69;
        B = i4 % 128;
        int i5 = i4 % 2;
        HelpButtonPosition helpButtonPosition = this.A;
        int i6 = i3 + 47;
        B = i6 % 128;
        int i7 = i6 % 2;
        return helpButtonPosition;
    }

    public static final class BottomButton extends Enum<BottomButton> {

        /* JADX INFO: renamed from: f */
        private static int f14606f = 1;

        /* JADX INFO: renamed from: g */
        private static int f14607g = 0;

        /* JADX INFO: renamed from: i */
        private static final /* synthetic */ BottomButton[] f14609i;

        /* JADX INFO: renamed from: j */
        private static final /* synthetic */ EnumEntries f14610j;

        /* JADX INFO: renamed from: k */
        private static int f14611k = 0;

        /* JADX INFO: renamed from: m */
        private static int f14612m = 1;

        /* JADX INFO: renamed from: c */
        public static final BottomButton f14603c = new BottomButton("ManualCapture", 0);

        /* JADX INFO: renamed from: e */
        public static final BottomButton f14605e = new BottomButton("Continue", 1);

        /* JADX INFO: renamed from: d */
        public static final BottomButton f14604d = new BottomButton("Retry", 2);

        /* JADX INFO: renamed from: b */
        public static final BottomButton f14602b = new BottomButton("RetakeScan", 3);

        /* JADX INFO: renamed from: a */
        public static final BottomButton f14601a = new BottomButton("ScanTheBack", 4);

        /* JADX INFO: renamed from: h */
        public static final BottomButton f14608h = new BottomButton("ScanTheFront", 5);

        private BottomButton(String str, int i2) {
            super(str, i2);
        }

        static {
            BottomButton[] bottomButtonArrE = e();
            f14609i = bottomButtonArrE;
            f14610j = EnumEntriesKt.enumEntries(bottomButtonArrE);
            int i2 = f14612m + 21;
            f14611k = i2 % 128;
            int i3 = i2 % 2;
        }

        private static final /* synthetic */ BottomButton[] e() {
            int i2 = 2 % 2;
            int i3 = f14606f + 21;
            int i4 = i3 % 128;
            f14607g = i4;
            int i5 = i3 % 2;
            BottomButton[] bottomButtonArr = {f14603c, f14605e, f14604d, f14602b, f14601a, f14608h};
            int i6 = i4 + 49;
            f14606f = i6 % 128;
            if (i6 % 2 != 0) {
                return bottomButtonArr;
            }
            throw null;
        }

        public static EnumEntries<BottomButton> getEntries() {
            int i2 = 2 % 2;
            int i3 = f14607g + 101;
            int i4 = i3 % 128;
            f14606f = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            EnumEntries<BottomButton> enumEntries = f14610j;
            int i5 = i4 + 113;
            f14607g = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static BottomButton valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f14606f + 57;
            f14607g = i3 % 128;
            int i4 = i3 % 2;
            BottomButton bottomButton = (BottomButton) Enum.valueOf(BottomButton.class, str);
            if (i4 == 0) {
                return bottomButton;
            }
            throw null;
        }

        public static BottomButton[] values() {
            int i2 = 2 % 2;
            int i3 = f14606f + 89;
            f14607g = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            BottomButton[] bottomButtonArr = (BottomButton[]) f14609i.clone();
            int i4 = f14607g + 43;
            f14606f = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 19 / 0;
            }
            return bottomButtonArr;
        }
    }

    public static final class CaptureFrameSpec {

        /* JADX INFO: renamed from: b */
        public static final Companion f14613b = new Companion(null);

        /* JADX INFO: renamed from: f */
        private static int f14614f = 0;

        /* JADX INFO: renamed from: h */
        private static int f14615h = 1;

        /* JADX INFO: renamed from: i */
        private static int f14616i = 0;

        /* JADX INFO: renamed from: j */
        private static int f14617j = 1;

        /* JADX INFO: renamed from: a */
        private final float f14618a;

        /* JADX INFO: renamed from: c */
        private final DocumentType f14619c;

        /* JADX INFO: renamed from: d */
        private final boolean f14620d;

        /* JADX INFO: renamed from: e */
        private final float f14621e;

        /* JADX INFO: renamed from: g */
        private final boolean f14622g;

        public CaptureFrameSpec(boolean z2, float f2, float f3, DocumentType documentType, boolean z3) {
            Intrinsics.checkNotNullParameter(documentType, "");
            this.f14620d = z2;
            this.f14621e = f2;
            this.f14618a = f3;
            this.f14619c = documentType;
            this.f14622g = z3;
        }

        public /* synthetic */ CaptureFrameSpec(boolean z2, float f2, float f3, DocumentType documentType, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z2, f2, f3, documentType, (i2 & 16) == 0 ? z3 : false);
        }

        public final boolean getVertical() {
            int i2 = 2 % 2;
            int i3 = f14615h + 47;
            int i4 = i3 % 128;
            f14616i = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f14620d;
            int i6 = i4 + 111;
            f14615h = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final float getMultiplier() {
            int i2 = 2 % 2;
            int i3 = f14615h + 59;
            int i4 = i3 % 128;
            f14616i = i4;
            int i5 = i3 % 2;
            float f2 = this.f14621e;
            int i6 = i4 + 117;
            f14615h = i6 % 128;
            int i7 = i6 % 2;
            return f2;
        }

        public final float getRatio() {
            int i2 = 2 % 2;
            int i3 = f14616i;
            int i4 = i3 + 91;
            f14615h = i4 % 128;
            int i5 = i4 % 2;
            float f2 = this.f14618a;
            int i6 = i3 + 111;
            f14615h = i6 % 128;
            int i7 = i6 % 2;
            return f2;
        }

        public final DocumentType getDocumentType() {
            int i2 = 2 % 2;
            int i3 = f14615h;
            int i4 = i3 + 19;
            f14616i = i4 % 128;
            int i5 = i4 % 2;
            DocumentType documentType = this.f14619c;
            int i6 = i3 + 109;
            f14616i = i6 % 128;
            int i7 = i6 % 2;
            return documentType;
        }

        public final boolean getCondensedLayout() {
            int i2 = 2 % 2;
            int i3 = f14615h + 13;
            f14616i = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f14622g;
            }
            throw null;
        }

        public static final class Companion {

            /* JADX INFO: renamed from: b */
            private static int f14623b = 0;

            /* JADX INFO: renamed from: d */
            private static int f14624d = 1;

            private Companion() {
            }

            public static /* synthetic */ CaptureFrameSpec from$default(Companion companion, DocumentType documentType, boolean z2, boolean z3, Float f2, int i2, Object obj) {
                int i3 = 2 % 2;
                int i4 = f14624d;
                int i5 = i4 + 29;
                f14623b = i5 % 128;
                if (i5 % 2 == 0 ? (i2 & 4) != 0 : (i2 & 4) != 0) {
                    z3 = false;
                }
                if ((i2 & 8) != 0) {
                    int i6 = i4 + 103;
                    f14623b = i6 % 128;
                    int i7 = i6 % 2;
                    f2 = null;
                }
                CaptureFrameSpec captureFrameSpecFrom = companion.from(documentType, z2, z3, f2);
                int i8 = f14624d + 51;
                f14623b = i8 % 128;
                int i9 = i8 % 2;
                return captureFrameSpecFrom;
            }

            public final CaptureFrameSpec from(DocumentType documentType, boolean z2, boolean z3, Float f2) {
                float f3;
                float fFloatValue;
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(documentType, "");
                if (documentType == DocumentType.PASSPORT) {
                    int i3 = f14623b + 69;
                    f14624d = i3 % 128;
                    f3 = 1.36f;
                    if (i3 % 2 == 0) {
                        int i4 = 85 / 0;
                    }
                } else {
                    f3 = 1.59f;
                }
                if (f2 != null) {
                    int i5 = f14624d + 17;
                    f14623b = i5 % 128;
                    if (i5 % 2 != 0) {
                        f2.floatValue();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    fFloatValue = f2.floatValue();
                } else if (!z2) {
                    fFloatValue = 1.0f;
                } else {
                    int i6 = f14624d + 33;
                    f14623b = i6 % 128;
                    int i7 = i6 % 2;
                    fFloatValue = 1.25f;
                }
                return new CaptureFrameSpec(z2, fFloatValue, f3, documentType, z3);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            int i2 = f14617j + 73;
            f14614f = i2 % 128;
            int i3 = i2 % 2;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f14616i;
            int i4 = i3 + 23;
            int i5 = i4 % 128;
            f14615h = i5;
            int i6 = i4 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CaptureFrameSpec)) {
                int i7 = i5 + 59;
                f14616i = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            CaptureFrameSpec captureFrameSpec = (CaptureFrameSpec) obj;
            if (this.f14620d != captureFrameSpec.f14620d) {
                int i9 = i3 + 81;
                f14615h = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (Float.compare(this.f14621e, captureFrameSpec.f14621e) == 0) {
                return Float.compare(this.f14618a, captureFrameSpec.f14618a) == 0 && this.f14619c == captureFrameSpec.f14619c && this.f14622g == captureFrameSpec.f14622g;
            }
            int i11 = f14615h + 31;
            f14616i = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f14615h + 37;
            f14616i = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = (((((((Boolean.hashCode(this.f14620d) * 31) + Float.hashCode(this.f14621e)) * 31) + Float.hashCode(this.f14618a)) * 31) + this.f14619c.hashCode()) * 31) + Boolean.hashCode(this.f14622g);
            int i5 = f14615h + 51;
            f14616i = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 30 / 0;
            }
            return iHashCode;
        }

        public final String toString() {
            String str;
            int i2 = 2 % 2;
            int i3 = f14615h + 71;
            f14616i = i3 % 128;
            if (i3 % 2 != 0) {
                str = "CaptureFrameSpec(vertical=" + this.f14620d + ", multiplier=" + this.f14621e + ", ratio=" + this.f14618a + ", documentType=" + this.f14619c + ", condensedLayout=" + this.f14622g + ")";
                int i4 = 56 / 0;
            } else {
                str = "CaptureFrameSpec(vertical=" + this.f14620d + ", multiplier=" + this.f14621e + ", ratio=" + this.f14618a + ", documentType=" + this.f14619c + ", condensedLayout=" + this.f14622g + ")";
            }
            int i5 = f14616i + 51;
            f14615h = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ CaptureFrameSpec copy$default(CaptureFrameSpec captureFrameSpec, boolean z2, float f2, float f3, DocumentType documentType, boolean z3, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f14616i + 101;
            int i5 = i4 % 128;
            f14615h = i5;
            if (i4 % 2 != 0 && (i2 & 1) != 0) {
                z2 = captureFrameSpec.f14620d;
            }
            if ((i2 & 2) != 0) {
                int i6 = i5 + 125;
                f14616i = i6 % 128;
                int i7 = i6 % 2;
                f2 = captureFrameSpec.f14621e;
            }
            if ((i2 & 4) != 0) {
                f3 = captureFrameSpec.f14618a;
            }
            if ((i2 & 8) != 0) {
                documentType = captureFrameSpec.f14619c;
            }
            if ((i2 & 16) != 0) {
                z3 = captureFrameSpec.f14622g;
            }
            return captureFrameSpec.copy(z2, f2, f3, documentType, z3);
        }

        public final CaptureFrameSpec copy(boolean z2, float f2, float f3, DocumentType documentType, boolean z3) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(documentType, "");
            CaptureFrameSpec captureFrameSpec = new CaptureFrameSpec(z2, f2, f3, documentType, z3);
            int i3 = f14615h + 67;
            f14616i = i3 % 128;
            int i4 = i3 % 2;
            return captureFrameSpec;
        }

        public final boolean component5() {
            int i2 = 2 % 2;
            int i3 = f14615h + 107;
            f14616i = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f14622g;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final DocumentType component4() {
            int i2 = 2 % 2;
            int i3 = f14616i + 75;
            int i4 = i3 % 128;
            f14615h = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            DocumentType documentType = this.f14619c;
            int i5 = i4 + 37;
            f14616i = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 96 / 0;
            }
            return documentType;
        }

        public final float component3() {
            int i2 = 2 % 2;
            int i3 = f14615h + 99;
            f14616i = i3 % 128;
            int i4 = i3 % 2;
            float f2 = this.f14618a;
            if (i4 != 0) {
                int i5 = 90 / 0;
            }
            return f2;
        }

        public final float component2() {
            int i2 = 2 % 2;
            int i3 = f14616i + 93;
            f14615h = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f14621e;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean component1() {
            int i2 = 2 % 2;
            int i3 = f14616i;
            int i4 = i3 + 49;
            f14615h = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.f14620d;
            int i6 = i3 + 35;
            f14615h = i6 % 128;
            if (i6 % 2 != 0) {
                return z2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: c */
        private static int f14625c = 1;

        /* JADX INFO: renamed from: d */
        private static int f14626d = 0;

        private Companion() {
        }

        public final CaptureUiState Loading(CaptureUiState captureUiState, CaptureFrameSpec captureFrameSpec, boolean z2, CloseButtonPosition closeButtonPosition, HelpButtonPosition helpButtonPosition) {
            CaptureFrameSpec captureFrameSpec2 = captureFrameSpec;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            Intrinsics.checkNotNullParameter(closeButtonPosition, "");
            Intrinsics.checkNotNullParameter(helpButtonPosition, "");
            if (captureFrameSpec2 == null) {
                int i3 = f14625c + 83;
                f14626d = i3 % 128;
                int i4 = i3 % 2;
                captureFrameSpec2 = captureUiState.getCaptureFrameSpec();
            }
            CaptureUiState captureUiState2 = new CaptureUiState(true, null, null, null, true, false, captureFrameSpec2, null, false, null, null, false, false, false, null, false, null, false, false, false, z2, null, false, null, closeButtonPosition, helpButtonPosition, 15204238, null);
            int i5 = f14626d + 107;
            f14625c = i5 % 128;
            int i6 = i5 % 2;
            return captureUiState2;
        }

        public static /* synthetic */ CaptureUiState PreInit$default(Companion companion, CaptureUiState captureUiState, CaptureFrameSpec captureFrameSpec, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f14625c + 23;
            int i5 = i4 % 128;
            f14626d = i5;
            int i6 = i4 % 2;
            if ((i2 & 1) != 0) {
                int i7 = i5 + 1;
                f14625c = i7 % 128;
                int i8 = i7 % 2;
                captureFrameSpec = null;
            }
            return companion.PreInit(captureUiState, captureFrameSpec);
        }

        public final CaptureUiState PreInit(CaptureUiState captureUiState, CaptureFrameSpec captureFrameSpec) {
            CaptureFrameSpec captureFrameSpecFrom$default = captureFrameSpec;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            if (captureFrameSpecFrom$default == null) {
                captureFrameSpecFrom$default = CaptureFrameSpec.Companion.from$default(CaptureFrameSpec.f14613b, captureUiState.getCaptureFrameSpec().getDocumentType(), captureUiState.getCaptureFrameSpec().getVertical(), false, null, 12, null);
            }
            return new CaptureUiState(false, null, null, null, false, false, captureFrameSpecFrom$default, null, false, null, null, false, false, false, null, false, null, false, false, false, captureUiState.getShowCloseButton(), null, false, null, captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition(), 15204287, null);
        }

        public static /* synthetic */ CaptureUiState Init$default(Companion companion, CaptureUiState captureUiState, CaptureFrameSpec captureFrameSpec, boolean z2, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f14625c;
            int i5 = i4 + 111;
            f14626d = i5 % 128;
            int i6 = i2 & 1;
            if (i5 % 2 == 0 ? i6 != 0 : i6 != 0) {
                int i7 = i4 + 17;
                f14626d = i7 % 128;
                int i8 = i7 % 2;
                captureFrameSpec = null;
            }
            return companion.Init(captureUiState, captureFrameSpec, z2);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.incode.welcome_sdk.ui.id_capture.CaptureUiState Init(com.incode.welcome_sdk.ui.id_capture.CaptureUiState r30, com.incode.welcome_sdk.ui.id_capture.CaptureUiState.CaptureFrameSpec r31, boolean r32) {
            /*
                r29 = this;
                r4 = 2
                int r0 = r4 % r4
                java.lang.String r0 = ""
                r2 = r30
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                if (r31 != 0) goto L7f
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec$Companion r5 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.CaptureFrameSpec.f14613b
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec r0 = r2.getCaptureFrameSpec()
                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r6 = r0.getDocumentType()
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec r0 = r2.getCaptureFrameSpec()
                boolean r7 = r0.getVertical()
                r10 = 12
                r11 = 0
                r8 = 0
                r9 = 0
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec r7 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.CaptureFrameSpec.Companion.from$default(r5, r6, r7, r8, r9, r10, r11)
            L27:
                if (r31 == 0) goto L38
                int r0 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14626d
                int r1 = r0 + 43
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14625c = r0
                int r1 = r1 % r4
                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r3 = r31.getDocumentType()
                if (r3 != 0) goto L49
            L38:
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec r0 = r2.getCaptureFrameSpec()
                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r3 = r0.getDocumentType()
                int r0 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14626d
                int r1 = r0 + 55
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14625c = r0
                int r1 = r1 % r4
            L49:
                com.incode.welcome_sdk.ui.id_capture.InfoModel r3 = com.incode.welcome_sdk.ui.id_capture.CaptureUiStateKt.e(r3)
                com.incode.welcome_sdk.commons.CloseButtonPosition r25 = r2.getCloseButtonPosition()
                com.incode.welcome_sdk.commons.HelpButtonPosition r26 = r2.getHelpButtonPosition()
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState r0 = new com.incode.welcome_sdk.ui.id_capture.CaptureUiState
                r27 = 15728571(0xefffbb, float:2.2040422E-38)
                r28 = 0
                r1 = 0
                r2 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r21 = r32
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                return r0
            L7f:
                r7 = r31
                goto L27
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.Init(com.incode.welcome_sdk.ui.id_capture.CaptureUiState, com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec, boolean):com.incode.welcome_sdk.ui.id_capture.CaptureUiState");
        }

        public final CaptureUiState HelpScreen(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f14626d + 29;
            f14625c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateCopy$default = CaptureUiState.copy$default(captureUiState, false, null, null, null, false, false, null, null, false, null, null, false, false, false, null, false, null, false, true, false, false, null, false, null, captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition(), 14872553, null);
            int i5 = f14625c + 45;
            f14626d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 96 / 0;
            }
            return captureUiStateCopy$default;
        }

        public static /* synthetic */ CaptureUiState CloseHelpScreen$default(Companion companion, CaptureUiState captureUiState, BottomButton bottomButton, boolean z2, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f14626d + 47;
            int i5 = i4 % 128;
            f14625c = i5;
            if (i4 % 2 != 0 && (i2 & 1) != 0) {
                int i6 = i5 + 83;
                f14626d = i6 % 128;
                int i7 = i6 % 2;
                bottomButton = null;
            }
            return companion.CloseHelpScreen(captureUiState, bottomButton, z2);
        }

        public final CaptureUiState CloseHelpScreen(CaptureUiState captureUiState, BottomButton bottomButton, boolean z2) {
            int i2 = 2 % 2;
            int i3 = f14625c + 5;
            f14626d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateCopy$default = CaptureUiState.copy$default(captureUiState, false, null, null, null, true, false, null, null, false, null, null, false, false, false, null, false, bottomButton, false, false, true, z2, null, false, null, captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition(), 14876655, null);
            int i5 = f14626d + 123;
            f14625c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 96 / 0;
            }
            return captureUiStateCopy$default;
        }

        public static /* synthetic */ CaptureUiState TakePhotoManually$default(Companion companion, CaptureUiState captureUiState, CaptureFrameSpec captureFrameSpec, boolean z2, boolean z3, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f14625c;
            int i5 = i4 + 47;
            f14626d = i5 % 128;
            int i6 = i5 % 2;
            if ((i2 & 1) != 0) {
                int i7 = i4 + 23;
                f14626d = i7 % 128;
                int i8 = i7 % 2;
                captureFrameSpec = null;
            }
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            if ((i2 & 4) != 0) {
                int i9 = f14626d + 65;
                f14625c = i9 % 128;
                int i10 = i9 % 2;
                z3 = false;
            }
            return companion.TakePhotoManually(captureUiState, captureFrameSpec, z2, z3);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.incode.welcome_sdk.ui.id_capture.CaptureUiState TakePhotoManually(com.incode.welcome_sdk.ui.id_capture.CaptureUiState r30, com.incode.welcome_sdk.ui.id_capture.CaptureUiState.CaptureFrameSpec r31, boolean r32, boolean r33) {
            /*
                r29 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14626d
                int r1 = r0 + 31
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14625c = r0
                int r1 = r1 % r3
                java.lang.String r0 = ""
                r2 = r30
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                if (r31 != 0) goto L7f
                int r0 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14625c
                int r1 = r0 + 47
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14626d = r0
                int r1 = r1 % r3
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec r7 = r2.getCaptureFrameSpec()
            L22:
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState$BottomButton r17 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.BottomButton.f14603c
                if (r31 == 0) goto L3b
                int r0 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14625c
                int r1 = r0 + 43
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14626d = r0
                int r1 = r1 % r3
                if (r1 == 0) goto L78
                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = r31.getDocumentType()
                r0 = 68
                int r0 = r0 / 0
                if (r1 != 0) goto L43
            L3b:
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec r0 = r2.getCaptureFrameSpec()
                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = r0.getDocumentType()
            L43:
                r0 = 1
                com.incode.welcome_sdk.ui.id_capture.InfoModel r3 = com.incode.welcome_sdk.ui.id_capture.CaptureUiStateKt.access$generateInfoModel(r1, r0)
                com.incode.welcome_sdk.commons.CloseButtonPosition r25 = r2.getCloseButtonPosition()
                com.incode.welcome_sdk.commons.HelpButtonPosition r26 = r2.getHelpButtonPosition()
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState r0 = new com.incode.welcome_sdk.ui.id_capture.CaptureUiState
                r27 = 15531947(0xecffab, float:2.1764893E-38)
                r28 = 0
                r1 = 0
                r2 = 0
                r4 = 0
                r5 = 1
                r6 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r19 = 0
                r20 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r21 = r33
                r18 = r32
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                return r0
            L78:
                com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = r31.getDocumentType()
                if (r1 != 0) goto L43
                goto L3b
            L7f:
                r7 = r31
                goto L22
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.TakePhotoManually(com.incode.welcome_sdk.ui.id_capture.CaptureUiState, com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec, boolean, boolean):com.incode.welcome_sdk.ui.id_capture.CaptureUiState");
        }

        public static /* synthetic */ CaptureUiState TakingPhoto$default(Companion companion, CaptureUiState captureUiState, Integer num, int i2, Object obj) {
            int i3 = 2 % 2;
            Object obj2 = null;
            if ((i2 & 1) != 0) {
                int i4 = f14625c + 29;
                f14626d = i4 % 128;
                int i5 = i4 % 2;
                num = null;
            }
            CaptureUiState captureUiStateTakingPhoto = companion.TakingPhoto(captureUiState, num);
            int i6 = f14626d + 93;
            f14625c = i6 % 128;
            if (i6 % 2 != 0) {
                return captureUiStateTakingPhoto;
            }
            obj2.hashCode();
            throw null;
        }

        public final CaptureUiState TakingPhoto(CaptureUiState captureUiState, Integer num) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiState2 = new CaptureUiState(false, null, new InfoModel(InfoModel.InfoModelType.f14892a, R.string.onboard_sdk_id_capture_hint_taking_photo, Integer.valueOf(R.string.onboard_sdk_id_capture_hint_do_not_move), null, null, false, 56, null), null, false, false, captureUiState.getCaptureFrameSpec(), StatusColor.f14902a, false, null, null, false, false, false, num, false, null, false, false, false, captureUiState.getShowCloseButton(), null, false, null, captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition(), 15712059, null);
            int i3 = f14626d + 105;
            f14625c = i3 % 128;
            int i4 = i3 % 2;
            return captureUiState2;
        }

        public final CaptureUiState TakingPhotoFlash(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiState2 = new CaptureUiState(false, null, null, null, false, false, captureUiState.getCaptureFrameSpec(), StatusColor.f14905d, true, null, null, false, false, false, null, false, null, false, false, false, captureUiState.getShowCloseButton(), null, false, null, captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition(), 15728191, null);
            int i3 = f14626d + 37;
            f14625c = i3 % 128;
            int i4 = i3 % 2;
            return captureUiState2;
        }

        public static /* synthetic */ CaptureUiState AnalyzingDocument$default(Companion companion, CaptureUiState captureUiState, float f2, ImageBitmap imageBitmap, boolean z2, boolean z3, int i2, Object obj) {
            boolean z4 = z2;
            ImageBitmap imageBitmap2 = imageBitmap;
            float f3 = f2;
            int i3 = 2 % 2;
            int i4 = f14626d;
            int i5 = i4 + 83;
            f14625c = i5 % 128;
            int i6 = i5 % 2;
            if ((i2 & 1) != 0) {
                f3 = 0.0f;
            }
            if ((i2 & 2) != 0) {
                imageBitmap2 = null;
            }
            boolean z5 = false;
            if ((i2 & 4) != 0) {
                z4 = false;
            }
            if ((i2 & 8) != 0) {
                int i7 = i4 + 83;
                f14625c = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 / 2;
                }
            } else {
                z5 = z3;
            }
            return companion.AnalyzingDocument(captureUiState, f3, imageBitmap2, z4, z5);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x002e A[PHI: r7
  0x002e: PHI (r7v3 com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec) = 
  (r7v0 com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec)
  (r7v4 com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec)
 binds: [B:33:0x009d, B:23:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[PHI: r7
  0x00a0: PHI (r7v1 com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec) = 
  (r7v0 com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec)
  (r7v4 com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec)
 binds: [B:33:0x009d, B:23:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.incode.welcome_sdk.ui.id_capture.CaptureUiState AnalyzingDocument(com.incode.welcome_sdk.ui.id_capture.CaptureUiState r30, float r31, androidx.compose.ui.graphics.ImageBitmap r32, boolean r33, boolean r34) {
            /*
                r29 = this;
                r11 = r32
                r4 = 2
                int r0 = r4 % r4
                int r0 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14625c
                int r2 = r0 + 7
                int r0 = r2 % 128
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14626d = r0
                int r2 = r2 % r4
                java.lang.String r1 = ""
                r3 = 0
                r0 = r30
                if (r2 == 0) goto L87
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec r12 = r0.getCaptureFrameSpec()
                r18 = 76
                r19 = 0
                r13 = 0
                r14 = 1073741824(0x40000000, float:2.0)
                r15 = 0
                r16 = 0
                r17 = 1
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec r7 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.CaptureFrameSpec.copy$default(r12, r13, r14, r15, r16, r17, r18, r19)
                if (r33 == 0) goto La0
            L2e:
                int r1 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14626d
                int r2 = r1 + 5
                int r1 = r2 % 128
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14625c = r1
                int r2 = r2 % r4
                if (r2 != 0) goto L3d
                r1 = 35
                int r1 = r1 / 0
            L3d:
                r10 = r3
            L3e:
                if (r33 == 0) goto L7c
            L40:
                com.incode.welcome_sdk.ui.id_capture.StatusColor r8 = com.incode.welcome_sdk.ui.id_capture.StatusColor.f14905d
                com.incode.welcome_sdk.ui.id_capture.AnalyzingDocumentModel r4 = new com.incode.welcome_sdk.ui.id_capture.AnalyzingDocumentModel
                int r1 = com.incode.welcome_sdk.R.string.onboard_sdk_id_capture_analyzing
                r2 = r31
                r4.<init>(r1, r2)
                boolean r21 = r0.getShowCloseButton()
                com.incode.welcome_sdk.ui.id_capture.IconTintType r22 = com.incode.welcome_sdk.ui.id_capture.IconTintType.f14643b
                com.incode.welcome_sdk.commons.CloseButtonPosition r25 = r0.getCloseButtonPosition()
                com.incode.welcome_sdk.commons.HelpButtonPosition r26 = r0.getHelpButtonPosition()
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState r0 = new com.incode.welcome_sdk.ui.id_capture.CaptureUiState
                r27 = 8909063(0x87f107, float:1.2484256E-38)
                r28 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r5 = 0
                r6 = 0
                r9 = 0
                r12 = 1
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r24 = 0
                r23 = r34
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                return r0
            L7c:
                int r1 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14626d
                int r2 = r1 + 105
                int r1 = r2 % 128
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.f14625c = r1
                int r2 = r2 % r4
                r11 = r3
                goto L40
            L87:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec r12 = r0.getCaptureFrameSpec()
                r18 = 15
                r19 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                com.incode.welcome_sdk.ui.id_capture.CaptureUiState$CaptureFrameSpec r7 = com.incode.welcome_sdk.ui.id_capture.CaptureUiState.CaptureFrameSpec.copy$default(r12, r13, r14, r15, r16, r17, r18, r19)
                if (r33 == 0) goto La0
                goto L2e
            La0:
                r10 = r11
                goto L3e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.CaptureUiState.Companion.AnalyzingDocument(com.incode.welcome_sdk.ui.id_capture.CaptureUiState, float, androidx.compose.ui.graphics.ImageBitmap, boolean, boolean):com.incode.welcome_sdk.ui.id_capture.CaptureUiState");
        }

        private static /* synthetic */ CaptureUiState b(CaptureUiState captureUiState, BottomButton bottomButton, boolean z2, DocumentType documentType, int i2) {
            int i3 = 2 % 2;
            int i4 = f14626d + 45;
            f14625c = i4 % 128;
            if (i4 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 5) != 0) {
                documentType = null;
            }
            CaptureUiState captureUiStateB = b(captureUiState, bottomButton, z2, documentType, false);
            int i5 = f14626d + 25;
            f14625c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 14 / 0;
            }
            return captureUiStateB;
        }

        private static CaptureUiState b(CaptureUiState captureUiState, BottomButton bottomButton, boolean z2, DocumentType documentType, boolean z3) {
            int i2;
            DocumentType documentType2 = documentType;
            InfoModel.InfoModelType infoModelType = InfoModel.InfoModelType.f14895d;
            int i3 = R.string.onboard_sdk_id_capture_successfully_processed;
            int i4 = WhenMappings.f14628c[bottomButton.ordinal()];
            if (i4 == 1) {
                i2 = R.string.onboard_sdk_id_capture_now_capture_front;
            } else if (i4 == 2) {
                i2 = R.string.onboard_sdk_id_capture_now_capture_back;
            } else {
                i2 = R.string.onboard_sdk_id_capture_now_capture_continue;
            }
            InfoModel infoModel = new InfoModel(infoModelType, i3, Integer.valueOf(i2), Integer.valueOf(R.drawable.onboard_sdk_is_success_oval), StatusColor.f14905d, false);
            CaptureFrameSpec captureFrameSpec = captureUiState.getCaptureFrameSpec();
            if (documentType2 == null) {
                documentType2 = captureUiState.getCaptureFrameSpec().getDocumentType();
            }
            return new CaptureUiState(false, null, infoModel, null, false, false, CaptureFrameSpec.copy$default(captureFrameSpec, false, 0.0f, 0.0f, documentType2, false, 23, null), StatusColor.f14905d, false, captureUiState.getCaptureFrameImage(), captureUiState.getPreviewFrameImage(), false, false, false, null, false, bottomButton, false, false, false, z2, IconTintType.f14643b, false, null, captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition(), 8845579, null);
        }

        public final CaptureUiState SuccessfullyProcessedContinue(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f14626d + 113;
            f14625c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateB = b(captureUiState, BottomButton.f14605e, captureUiState.getShowCloseButton(), (DocumentType) null, 12);
            int i5 = f14626d + 1;
            f14625c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 90 / 0;
            }
            return captureUiStateB;
        }

        public final CaptureUiState SuccessfullyProcessedScanBack(CaptureUiState captureUiState) {
            BottomButton bottomButton;
            boolean showCloseButton;
            DocumentType documentType;
            int i2;
            int i3 = 2 % 2;
            int i4 = f14626d + 67;
            f14625c = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.checkNotNullParameter(captureUiState, "");
                bottomButton = BottomButton.f14601a;
                showCloseButton = captureUiState.getShowCloseButton();
                documentType = DocumentType.BACK_ID;
                i2 = 52;
            } else {
                Intrinsics.checkNotNullParameter(captureUiState, "");
                bottomButton = BottomButton.f14601a;
                showCloseButton = captureUiState.getShowCloseButton();
                documentType = DocumentType.BACK_ID;
                i2 = 8;
            }
            CaptureUiState captureUiStateB = b(captureUiState, bottomButton, showCloseButton, documentType, i2);
            int i5 = f14625c + 57;
            f14626d = i5 % 128;
            if (i5 % 2 == 0) {
                return captureUiStateB;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final CaptureUiState SuccessfullyProcessedScanFront(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            int i3 = f14626d + 47;
            f14625c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateB = b(captureUiState, BottomButton.f14608h, captureUiState.getShowCloseButton(), DocumentType.FRONT_ID, 8);
            int i5 = f14625c + 19;
            f14626d = i5 % 128;
            int i6 = i5 % 2;
            return captureUiStateB;
        }

        public final CaptureUiState ShowTheBackOfYourId(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiState2 = new CaptureUiState(false, null, null, null, false, false, captureUiState.getCaptureFrameSpec(), null, false, null, null, false, false, false, null, true, null, false, false, false, false, null, false, null, captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition(), 15171471, null);
            int i3 = f14625c + 103;
            f14626d = i3 % 128;
            int i4 = i3 % 2;
            return captureUiState2;
        }

        public final CaptureUiState ChangeDocumentType(CaptureUiState captureUiState, DocumentType documentType) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            Intrinsics.checkNotNullParameter(documentType, "");
            CaptureUiState captureUiState2 = new CaptureUiState(false, null, null, null, false, false, CaptureFrameSpec.Companion.from$default(CaptureFrameSpec.f14613b, documentType, captureUiState.getCaptureFrameSpec().getVertical(), false, null, 12, null), null, false, null, null, false, false, false, null, false, null, false, false, false, false, null, false, null, null, null, 67108799, null);
            int i3 = f14626d + 7;
            f14625c = i3 % 128;
            if (i3 % 2 != 0) {
                return captureUiState2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static CaptureUiState b(SuggestionBoxModel suggestionBoxModel, CaptureFrameSpec captureFrameSpec, boolean z2, CloseButtonPosition closeButtonPosition, HelpButtonPosition helpButtonPosition) {
            int i2 = 2 % 2;
            CaptureUiState captureUiState = new CaptureUiState(false, suggestionBoxModel, null, null, false, false, captureFrameSpec, StatusColor.f14906e, false, null, null, false, false, false, null, false, null, false, false, false, z2, null, false, null, closeButtonPosition, helpButtonPosition, 15728445, null);
            int i3 = f14625c + 85;
            f14626d = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 35 / 0;
            }
            return captureUiState;
        }

        public final CaptureUiState ErrorFillTheFrame(CaptureUiState captureUiState, boolean z2) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiState2 = new CaptureUiState(false, null, CaptureUiStateKt.e(captureUiState.getCaptureFrameSpec().getDocumentType()), null, false, false, captureUiState.getCaptureFrameSpec(), null, false, null, null, false, true, z2, null, false, null, false, false, false, captureUiState.getShowCloseButton(), null, false, null, captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition(), 15716283, null);
            int i3 = f14626d + 97;
            f14625c = i3 % 128;
            if (i3 % 2 != 0) {
                return captureUiState2;
            }
            throw null;
        }

        public final CaptureUiState ErrorMisalignedId(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateB = b(new SuggestionBoxModel(SuggestionBoxModel.SuggestionType.f14923c, R.string.onboard_sdk_id_capture_box_hint_id_not_aligned, R.string.onboard_sdk_id_capture_box_hint_id_not_aligned_subtitle, R.raw.onboard_sdk_id_capture_align), captureUiState.getCaptureFrameSpec(), captureUiState.getShowCloseButton(), captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition());
            int i3 = f14626d + 115;
            f14625c = i3 % 128;
            int i4 = i3 % 2;
            return captureUiStateB;
        }

        public final CaptureUiState ErrorBlurryId(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateB = b(new SuggestionBoxModel(SuggestionBoxModel.SuggestionType.f14921a, R.string.onboard_sdk_id_capture_box_hint_id_blurry, R.string.onboard_sdk_id_capture_box_hint_id_blurry_subtitle, R.raw.onboard_sdk_id_capture_blur), captureUiState.getCaptureFrameSpec(), captureUiState.getShowCloseButton(), captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition());
            int i3 = f14625c + 67;
            f14626d = i3 % 128;
            if (i3 % 2 == 0) {
                return captureUiStateB;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final CaptureUiState ErrorTooDark(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateB = b(new SuggestionBoxModel(SuggestionBoxModel.SuggestionType.f14924d, R.string.onboard_sdk_id_capture_box_hint_id_too_dark, R.string.onboard_sdk_id_capture_box_hint_id_too_dark_subtitle, R.raw.onboard_sdk_id_capture_too_dark), captureUiState.getCaptureFrameSpec(), captureUiState.getShowCloseButton(), captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition());
            int i3 = f14626d + 121;
            f14625c = i3 % 128;
            int i4 = i3 % 2;
            return captureUiStateB;
        }

        public final CaptureUiState ErrorGlareId(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateB = b(new SuggestionBoxModel(SuggestionBoxModel.SuggestionType.f14925e, R.string.onboard_sdk_id_capture_box_hint_id_glare, R.string.onboard_sdk_id_capture_box_hint_id_glare_subtitle, R.raw.onboard_sdk_id_capture_glare), captureUiState.getCaptureFrameSpec(), captureUiState.getShowCloseButton(), captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition());
            int i3 = f14626d + 121;
            f14625c = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 37 / 0;
            }
            return captureUiStateB;
        }

        public final CaptureUiState ErrorWrongIdSideFront(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateB = b(new SuggestionBoxModel(SuggestionBoxModel.SuggestionType.f14922b, R.string.onboard_sdk_id_capture_box_hint_wrong_id_side_front, R.string.onboard_sdk_id_capture_box_hint_wrong_id_side_front_subtitle, R.raw.onboard_sdk_id_capture_wrong_id_side_front), captureUiState.getCaptureFrameSpec(), captureUiState.getShowCloseButton(), captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition());
            int i3 = f14625c + 1;
            f14626d = i3 % 128;
            int i4 = i3 % 2;
            return captureUiStateB;
        }

        public final CaptureUiState ErrorWrongIdSideBack(CaptureUiState captureUiState) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            CaptureUiState captureUiStateB = b(new SuggestionBoxModel(SuggestionBoxModel.SuggestionType.f14922b, R.string.onboard_sdk_id_capture_box_hint_wrong_id_side_back, R.string.onboard_sdk_id_capture_box_hint_wrong_id_side_back_subtitle, R.raw.onboard_sdk_id_capture_wrong_id_side_back), captureUiState.getCaptureFrameSpec(), captureUiState.getShowCloseButton(), captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition());
            int i3 = f14625c + 3;
            f14626d = i3 % 128;
            int i4 = i3 % 2;
            return captureUiStateB;
        }

        public final CaptureUiState ErrorThereWasAProblem(CaptureUiState captureUiState, IdCapturePresentableError idCapturePresentableError, CaptureFrameSpec captureFrameSpec) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            Intrinsics.checkNotNullParameter(idCapturePresentableError, "");
            Intrinsics.checkNotNullParameter(captureFrameSpec, "");
            CaptureUiState captureUiState2 = new CaptureUiState(false, null, new InfoModel(InfoModel.InfoModelType.f14896e, idCapturePresentableError.getTitle(), Integer.valueOf(idCapturePresentableError.getSubtitle()), Integer.valueOf(R.drawable.onboard_sdk_back_id_transparent), StatusColor.f14906e, false), null, false, false, captureFrameSpec, StatusColor.f14906e, false, captureUiState.getCaptureFrameImage(), captureUiState.getPreviewFrameImage(), false, false, false, null, false, idCapturePresentableError.getActionButton(), false, false, false, captureUiState.getShowCloseButton(), IconTintType.f14643b, false, null, captureUiState.getCloseButtonPosition(), captureUiState.getHelpButtonPosition(), 13039915, null);
            int i3 = f14626d + 35;
            f14625c = i3 % 128;
            int i4 = i3 % 2;
            return captureUiState2;
        }

        public final CaptureUiState ErrorUnacceptableId(CaptureUiState captureUiState, IdCapturePresentableError idCapturePresentableError, CaptureFrameSpec captureFrameSpec, a aVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureUiState, "");
            Intrinsics.checkNotNullParameter(idCapturePresentableError, "");
            Intrinsics.checkNotNullParameter(captureFrameSpec, "");
            BottomButton actionButton = idCapturePresentableError.getActionButton();
            boolean showCloseButton = captureUiState.getShowCloseButton();
            CloseButtonPosition closeButtonPosition = captureUiState.getCloseButtonPosition();
            HelpButtonPosition helpButtonPosition = captureUiState.getHelpButtonPosition();
            InfoModel infoModel = new InfoModel(InfoModel.InfoModelType.f14896e, idCapturePresentableError.getTitle(), Integer.valueOf(idCapturePresentableError.getSubtitle()), Integer.valueOf(R.drawable.onboard_sdk_id_capture_fail_neutral), StatusColor.f14906e, false);
            AcceptedDocumentsUiState acceptedDocumentsUiStateAccess$generateAcceptedDocumentsUiState = null;
            if (idCapturePresentableError.getCause() instanceof IdCaptureUploadError.UnacceptableId) {
                int i3 = f14625c + 91;
                f14626d = i3 % 128;
                if (i3 % 2 != 0) {
                    CaptureUiStateKt.access$generateAcceptedDocumentsUiState((IdCaptureUploadError.UnacceptableId) idCapturePresentableError.getCause(), aVar);
                    throw null;
                }
                acceptedDocumentsUiStateAccess$generateAcceptedDocumentsUiState = CaptureUiStateKt.access$generateAcceptedDocumentsUiState((IdCaptureUploadError.UnacceptableId) idCapturePresentableError.getCause(), aVar);
            }
            CaptureUiState captureUiState2 = new CaptureUiState(false, null, infoModel, null, false, false, captureFrameSpec, null, false, null, null, false, false, false, null, false, actionButton, false, false, false, showCloseButton, null, false, acceptedDocumentsUiStateAccess$generateAcceptedDocumentsUiState, closeButtonPosition, helpButtonPosition, 6750091, null);
            int i4 = f14625c + 79;
            f14626d = i4 % 128;
            int i5 = i4 % 2;
            return captureUiState2;
        }

        public /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a */
            private static int f14627a = 1;

            /* JADX INFO: renamed from: c */
            public static final /* synthetic */ int[] f14628c;

            /* JADX INFO: renamed from: d */
            private static int f14629d = 0;

            static {
                int[] iArr = new int[BottomButton.values().length];
                try {
                    iArr[BottomButton.f14608h.ordinal()] = 1;
                    int i2 = f14629d + 107;
                    f14627a = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BottomButton.f14601a.ordinal()] = 2;
                    int i5 = f14629d + 113;
                    f14627a = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                f14628c = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = E + 97;
        D = i2 % 128;
        int i3 = i2 % 2;
    }

    public CaptureUiState() {
        this(false, null, null, null, false, false, null, null, false, null, null, false, false, false, null, false, null, false, false, false, false, null, false, null, null, null, 67108863, null);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = B + 65;
            f14576z = i3 % 128;
            return i3 % 2 == 0;
        }
        if (!(obj instanceof CaptureUiState)) {
            int i4 = f14576z + 55;
            B = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        CaptureUiState captureUiState = (CaptureUiState) obj;
        if (this.f14578b != captureUiState.f14578b) {
            int i6 = B + 37;
            f14576z = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.f14577a, captureUiState.f14577a) || !Intrinsics.areEqual(this.f14579c, captureUiState.f14579c)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f14580d, captureUiState.f14580d)) {
            int i7 = f14576z + 61;
            B = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.f14581f != captureUiState.f14581f || this.f14584i != captureUiState.f14584i || !Intrinsics.areEqual(this.f14582g, captureUiState.f14582g)) {
            return false;
        }
        if (this.f14585j != captureUiState.f14585j) {
            int i9 = f14576z + 123;
            B = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.f14583h != captureUiState.f14583h) {
            int i11 = f14576z + 31;
            B = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f14588m, captureUiState.f14588m)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f14589n, captureUiState.f14589n)) {
            int i13 = B + 111;
            f14576z = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 89 / 0;
            }
            return false;
        }
        if (this.f14587l != captureUiState.f14587l || this.f14586k != captureUiState.f14586k || this.f14590o != captureUiState.f14590o || !Intrinsics.areEqual(this.f14593r, captureUiState.f14593r) || this.f14592q != captureUiState.f14592q || this.f14594s != captureUiState.f14594s) {
            return false;
        }
        if (this.f14595t != captureUiState.f14595t) {
            int i15 = B + 39;
            f14576z = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (this.f14591p != captureUiState.f14591p || this.f14598w != captureUiState.f14598w || this.f14596u != captureUiState.f14596u || this.f14600y != captureUiState.f14600y || this.f14599x != captureUiState.f14599x || !Intrinsics.areEqual(this.f14597v, captureUiState.f14597v)) {
            return false;
        }
        if (this.C == captureUiState.C) {
            return this.A == captureUiState.A;
        }
        int i17 = f14576z + 77;
        B = i17 % 128;
        return i17 % 2 == 0;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i2 = 2 % 2;
        int iHashCode3 = Boolean.hashCode(this.f14578b) * 31;
        SuggestionBoxModel suggestionBoxModel = this.f14577a;
        int iHashCode4 = 0;
        int iHashCode5 = (iHashCode3 + (suggestionBoxModel == null ? 0 : suggestionBoxModel.hashCode())) * 31;
        InfoModel infoModel = this.f14579c;
        int iHashCode6 = (iHashCode5 + (infoModel == null ? 0 : infoModel.hashCode())) * 31;
        AnalyzingDocumentModel analyzingDocumentModel = this.f14580d;
        int iHashCode7 = (((((((((((iHashCode6 + (analyzingDocumentModel == null ? 0 : analyzingDocumentModel.hashCode())) * 31) + Boolean.hashCode(this.f14581f)) * 31) + Boolean.hashCode(this.f14584i)) * 31) + this.f14582g.hashCode()) * 31) + this.f14585j.hashCode()) * 31) + Boolean.hashCode(this.f14583h)) * 31;
        ImageBitmap imageBitmap = this.f14588m;
        int iHashCode8 = (iHashCode7 + (imageBitmap == null ? 0 : imageBitmap.hashCode())) * 31;
        ImageBitmap imageBitmap2 = this.f14589n;
        if (imageBitmap2 == null) {
            int i3 = f14576z + 115;
            B = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = imageBitmap2.hashCode();
        }
        int iHashCode9 = (((((((iHashCode8 + iHashCode) * 31) + Boolean.hashCode(this.f14587l)) * 31) + Boolean.hashCode(this.f14586k)) * 31) + Boolean.hashCode(this.f14590o)) * 31;
        Integer num = this.f14593r;
        int iHashCode10 = (((iHashCode9 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f14592q)) * 31;
        BottomButton bottomButton = this.f14594s;
        if (bottomButton == null) {
            int i5 = f14576z + 3;
            B = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = bottomButton.hashCode();
        }
        int iHashCode11 = (((((((((((((iHashCode10 + iHashCode2) * 31) + Boolean.hashCode(this.f14595t)) * 31) + Boolean.hashCode(this.f14591p)) * 31) + Boolean.hashCode(this.f14598w)) * 31) + Boolean.hashCode(this.f14596u)) * 31) + this.f14600y.hashCode()) * 31) + Boolean.hashCode(this.f14599x)) * 31;
        AcceptedDocumentsUiState acceptedDocumentsUiState = this.f14597v;
        if (acceptedDocumentsUiState == null) {
            int i7 = B + 85;
            f14576z = i7 % 128;
            int i8 = i7 % 2;
        } else {
            iHashCode4 = acceptedDocumentsUiState.hashCode();
        }
        return ((((iHashCode11 + iHashCode4) * 31) + this.C.hashCode()) * 31) + this.A.hashCode();
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = B + 49;
        f14576z = i3 % 128;
        int i4 = i3 % 2;
        String str = "CaptureUiState(showLoader=" + this.f14578b + ", suggestionBoxModel=" + this.f14577a + ", infoModel=" + this.f14579c + ", analyzingDocumentModel=" + this.f14580d + ", showCameraPreview=" + this.f14581f + ", showCaptureFrame=" + this.f14584i + ", captureFrameSpec=" + this.f14582g + ", captureFrameBorderColor=" + this.f14585j + ", showCaptureFrameFlash=" + this.f14583h + ", captureFrameImage=" + this.f14588m + ", previewFrameImage=" + this.f14589n + ", showLaserAnimation=" + this.f14587l + ", showFillTheFrameAnimation=" + this.f14586k + ", delayFillTheFrameAnimation=" + this.f14590o + ", shooterCounterValue=" + this.f14593r + ", transitionToBackIdShown=" + this.f14592q + ", bottomButton=" + this.f14594s + ", bottomButtonEnabled=" + this.f14595t + ", showHelpDialog=" + this.f14591p + ", showHelpButton=" + this.f14598w + ", showCloseButton=" + this.f14596u + ", iconTintType=" + this.f14600y + ", showImageAsBlurred=" + this.f14599x + ", acceptedDocuments=" + this.f14597v + ", closeButtonPosition=" + this.C + ", helpButtonPosition=" + this.A + ")";
        int i5 = B + 103;
        f14576z = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ CaptureUiState copy$default(CaptureUiState captureUiState, boolean z2, SuggestionBoxModel suggestionBoxModel, InfoModel infoModel, AnalyzingDocumentModel analyzingDocumentModel, boolean z3, boolean z4, CaptureFrameSpec captureFrameSpec, StatusColor statusColor, boolean z5, ImageBitmap imageBitmap, ImageBitmap imageBitmap2, boolean z6, boolean z7, boolean z8, Integer num, boolean z9, BottomButton bottomButton, boolean z10, boolean z11, boolean z12, boolean z13, IconTintType iconTintType, boolean z14, AcceptedDocumentsUiState acceptedDocumentsUiState, CloseButtonPosition closeButtonPosition, HelpButtonPosition helpButtonPosition, int i2, Object obj) {
        AnalyzingDocumentModel analyzingDocumentModel2 = analyzingDocumentModel;
        boolean z15 = z5;
        boolean z16 = z4;
        ImageBitmap imageBitmap3 = imageBitmap2;
        InfoModel infoModel2 = infoModel;
        StatusColor statusColor2 = statusColor;
        ImageBitmap imageBitmap4 = imageBitmap;
        SuggestionBoxModel suggestionBoxModel2 = suggestionBoxModel;
        CaptureFrameSpec captureFrameSpec2 = captureFrameSpec;
        boolean z17 = z3;
        boolean z18 = z2;
        HelpButtonPosition helpButtonPosition2 = helpButtonPosition;
        CloseButtonPosition closeButtonPosition2 = closeButtonPosition;
        AcceptedDocumentsUiState acceptedDocumentsUiState2 = acceptedDocumentsUiState;
        boolean z19 = z8;
        boolean z20 = z13;
        boolean z21 = z12;
        Integer num2 = num;
        boolean z22 = z10;
        IconTintType iconTintType2 = iconTintType;
        BottomButton bottomButton2 = bottomButton;
        boolean z23 = z6;
        boolean z24 = z9;
        boolean z25 = z14;
        boolean z26 = z11;
        boolean z27 = z7;
        int i3 = 2 % 2;
        Object obj2 = null;
        if ((i2 & 1) != 0) {
            int i4 = f14576z + 113;
            B = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z28 = captureUiState.f14578b;
                obj2.hashCode();
                throw null;
            }
            z18 = captureUiState.f14578b;
        }
        if ((i2 & 2) != 0) {
            suggestionBoxModel2 = captureUiState.f14577a;
        }
        if ((i2 & 4) != 0) {
            int i5 = B + 111;
            f14576z = i5 % 128;
            if (i5 % 2 != 0) {
                InfoModel infoModel3 = captureUiState.f14579c;
                throw null;
            }
            infoModel2 = captureUiState.f14579c;
        }
        if ((i2 & 8) != 0) {
            analyzingDocumentModel2 = captureUiState.f14580d;
        }
        if ((i2 & 16) != 0) {
            int i6 = f14576z + 91;
            B = i6 % 128;
            int i7 = i6 % 2;
            z17 = captureUiState.f14581f;
        }
        if ((i2 & 32) != 0) {
            z16 = captureUiState.f14584i;
        }
        if ((i2 & 64) != 0) {
            int i8 = B + 35;
            f14576z = i8 % 128;
            int i9 = i8 % 2;
            captureFrameSpec2 = captureUiState.f14582g;
        }
        if ((i2 & 128) != 0) {
            int i10 = B + 31;
            f14576z = i10 % 128;
            if (i10 % 2 != 0) {
                StatusColor statusColor3 = captureUiState.f14585j;
                obj2.hashCode();
                throw null;
            }
            statusColor2 = captureUiState.f14585j;
        }
        if ((i2 & 256) != 0) {
            z15 = captureUiState.f14583h;
        }
        if ((i2 & 512) != 0) {
            imageBitmap4 = captureUiState.f14588m;
        }
        if ((i2 & 1024) != 0) {
            int i11 = B + 63;
            f14576z = i11 % 128;
            if (i11 % 2 != 0) {
                ImageBitmap imageBitmap5 = captureUiState.f14589n;
                obj2.hashCode();
                throw null;
            }
            imageBitmap3 = captureUiState.f14589n;
        }
        if ((i2 & 2048) != 0) {
            z23 = captureUiState.f14587l;
        }
        if ((i2 & 4096) != 0) {
            z27 = captureUiState.f14586k;
        }
        if ((i2 & 8192) != 0) {
            z19 = captureUiState.f14590o;
        }
        if ((i2 & 16384) != 0) {
            num2 = captureUiState.f14593r;
        }
        if ((32768 & i2) != 0) {
            z24 = captureUiState.f14592q;
        }
        if ((65536 & i2) != 0) {
            int i12 = f14576z + 25;
            B = i12 % 128;
            int i13 = i12 % 2;
            bottomButton2 = captureUiState.f14594s;
        }
        if ((131072 & i2) != 0) {
            int i14 = B + 93;
            f14576z = i14 % 128;
            if (i14 % 2 != 0) {
                boolean z29 = captureUiState.f14595t;
                throw null;
            }
            z22 = captureUiState.f14595t;
        }
        if ((262144 & i2) != 0) {
            z26 = captureUiState.f14591p;
        }
        if ((524288 & i2) != 0) {
            int i15 = f14576z + 123;
            B = i15 % 128;
            int i16 = i15 % 2;
            z21 = captureUiState.f14598w;
            if (i16 == 0) {
                int i17 = 6 / 0;
            }
        }
        if ((1048576 & i2) != 0) {
            z20 = captureUiState.f14596u;
        }
        if ((2097152 & i2) != 0) {
            iconTintType2 = captureUiState.f14600y;
        }
        if ((4194304 & i2) != 0) {
            z25 = captureUiState.f14599x;
        }
        if ((8388608 & i2) != 0) {
            acceptedDocumentsUiState2 = captureUiState.f14597v;
        }
        if ((16777216 & i2) != 0) {
            int i18 = f14576z + 55;
            B = i18 % 128;
            int i19 = i18 % 2;
            closeButtonPosition2 = captureUiState.C;
        }
        if ((i2 & 33554432) != 0) {
            helpButtonPosition2 = captureUiState.A;
        }
        return captureUiState.copy(z18, suggestionBoxModel2, infoModel2, analyzingDocumentModel2, z17, z16, captureFrameSpec2, statusColor2, z15, imageBitmap4, imageBitmap3, z23, z27, z19, num2, z24, bottomButton2, z22, z26, z21, z20, iconTintType2, z25, acceptedDocumentsUiState2, closeButtonPosition2, helpButtonPosition2);
    }

    public final CaptureUiState copy(boolean z2, SuggestionBoxModel suggestionBoxModel, InfoModel infoModel, AnalyzingDocumentModel analyzingDocumentModel, boolean z3, boolean z4, CaptureFrameSpec captureFrameSpec, StatusColor statusColor, boolean z5, ImageBitmap imageBitmap, ImageBitmap imageBitmap2, boolean z6, boolean z7, boolean z8, Integer num, boolean z9, BottomButton bottomButton, boolean z10, boolean z11, boolean z12, boolean z13, IconTintType iconTintType, boolean z14, AcceptedDocumentsUiState acceptedDocumentsUiState, CloseButtonPosition closeButtonPosition, HelpButtonPosition helpButtonPosition) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(captureFrameSpec, "");
        Intrinsics.checkNotNullParameter(statusColor, "");
        Intrinsics.checkNotNullParameter(iconTintType, "");
        Intrinsics.checkNotNullParameter(closeButtonPosition, "");
        Intrinsics.checkNotNullParameter(helpButtonPosition, "");
        CaptureUiState captureUiState = new CaptureUiState(z2, suggestionBoxModel, infoModel, analyzingDocumentModel, z3, z4, captureFrameSpec, statusColor, z5, imageBitmap, imageBitmap2, z6, z7, z8, num, z9, bottomButton, z10, z11, z12, z13, iconTintType, z14, acceptedDocumentsUiState, closeButtonPosition, helpButtonPosition);
        int i3 = B + 9;
        f14576z = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 80 / 0;
        }
        return captureUiState;
    }

    public final HelpButtonPosition component26() {
        int i2 = 2 % 2;
        int i3 = B + 69;
        f14576z = i3 % 128;
        if (i3 % 2 == 0) {
            return this.A;
        }
        throw null;
    }

    public final CloseButtonPosition component25() {
        int i2 = 2 % 2;
        int i3 = B + 1;
        int i4 = i3 % 128;
        f14576z = i4;
        int i5 = i3 % 2;
        CloseButtonPosition closeButtonPosition = this.C;
        int i6 = i4 + 29;
        B = i6 % 128;
        int i7 = i6 % 2;
        return closeButtonPosition;
    }

    public final AcceptedDocumentsUiState component24() {
        AcceptedDocumentsUiState acceptedDocumentsUiState;
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 39;
        f14576z = i4 % 128;
        if (i4 % 2 != 0) {
            acceptedDocumentsUiState = this.f14597v;
            int i5 = 30 / 0;
        } else {
            acceptedDocumentsUiState = this.f14597v;
        }
        int i6 = i3 + 15;
        f14576z = i6 % 128;
        int i7 = i6 % 2;
        return acceptedDocumentsUiState;
    }

    public final boolean component23() {
        int i2 = 2 % 2;
        int i3 = B + 115;
        int i4 = i3 % 128;
        f14576z = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f14599x;
        int i6 = i4 + 85;
        B = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final IconTintType component22() {
        IconTintType iconTintType;
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 45;
        f14576z = i4 % 128;
        if (i4 % 2 != 0) {
            iconTintType = this.f14600y;
            int i5 = 91 / 0;
        } else {
            iconTintType = this.f14600y;
        }
        int i6 = i3 + 35;
        f14576z = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 31 / 0;
        }
        return iconTintType;
    }

    public final boolean component21() {
        int i2 = 2 % 2;
        int i3 = f14576z + 1;
        int i4 = i3 % 128;
        B = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f14596u;
        int i6 = i4 + 45;
        f14576z = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean component20() {
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 23;
        f14576z = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f14598w;
        int i6 = i3 + 49;
        f14576z = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean component19() {
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 47;
        f14576z = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f14591p;
        int i6 = i3 + 3;
        f14576z = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean component18() {
        int i2 = 2 % 2;
        int i3 = f14576z + 101;
        int i4 = i3 % 128;
        B = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f14595t;
        int i6 = i4 + 73;
        f14576z = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final BottomButton component17() {
        int i2 = 2 % 2;
        int i3 = f14576z + 33;
        int i4 = i3 % 128;
        B = i4;
        int i5 = i3 % 2;
        BottomButton bottomButton = this.f14594s;
        int i6 = i4 + 81;
        f14576z = i6 % 128;
        if (i6 % 2 == 0) {
            return bottomButton;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component16() {
        int i2 = 2 % 2;
        int i3 = f14576z + 21;
        B = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f14592q;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component15() {
        int i2 = 2 % 2;
        int i3 = B + 31;
        int i4 = i3 % 128;
        f14576z = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        Integer num = this.f14593r;
        int i5 = i4 + 1;
        B = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final boolean component14() {
        int i2 = 2 % 2;
        int i3 = f14576z + 51;
        B = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f14590o;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component13() {
        int i2 = 2 % 2;
        int i3 = B + 31;
        int i4 = i3 % 128;
        f14576z = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f14586k;
        int i6 = i4 + 103;
        B = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean component12() {
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 11;
        f14576z = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f14587l;
        int i6 = i3 + 3;
        f14576z = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 6 / 0;
        }
        return z2;
    }

    public final ImageBitmap component11() {
        int i2 = 2 % 2;
        int i3 = B + 5;
        int i4 = i3 % 128;
        f14576z = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ImageBitmap imageBitmap = this.f14589n;
        int i5 = i4 + 21;
        B = i5 % 128;
        if (i5 % 2 != 0) {
            return imageBitmap;
        }
        obj.hashCode();
        throw null;
    }

    public final ImageBitmap component10() {
        int i2 = 2 % 2;
        int i3 = B + 43;
        f14576z = i3 % 128;
        int i4 = i3 % 2;
        ImageBitmap imageBitmap = this.f14588m;
        if (i4 != 0) {
            int i5 = 11 / 0;
        }
        return imageBitmap;
    }

    public final boolean component9() {
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 121;
        f14576z = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.f14583h;
        int i5 = i3 + 67;
        f14576z = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final StatusColor component8() {
        int i2 = 2 % 2;
        int i3 = f14576z + 45;
        int i4 = i3 % 128;
        B = i4;
        int i5 = i3 % 2;
        StatusColor statusColor = this.f14585j;
        int i6 = i4 + 9;
        f14576z = i6 % 128;
        if (i6 % 2 == 0) {
            return statusColor;
        }
        throw null;
    }

    public final CaptureFrameSpec component7() {
        int i2 = 2 % 2;
        int i3 = f14576z + 13;
        B = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f14582g;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component6() {
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 117;
        f14576z = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f14584i;
        int i6 = i3 + 13;
        f14576z = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean component5() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f14576z + 99;
        int i4 = i3 % 128;
        B = i4;
        if (i3 % 2 == 0) {
            z2 = this.f14581f;
            int i5 = 98 / 0;
        } else {
            z2 = this.f14581f;
        }
        int i6 = i4 + 15;
        f14576z = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final AnalyzingDocumentModel component4() {
        int i2 = 2 % 2;
        int i3 = B + 45;
        int i4 = i3 % 128;
        f14576z = i4;
        int i5 = i3 % 2;
        AnalyzingDocumentModel analyzingDocumentModel = this.f14580d;
        int i6 = i4 + 91;
        B = i6 % 128;
        if (i6 % 2 != 0) {
            return analyzingDocumentModel;
        }
        throw null;
    }

    public final InfoModel component3() {
        int i2 = 2 % 2;
        int i3 = f14576z + 71;
        int i4 = i3 % 128;
        B = i4;
        int i5 = i3 % 2;
        InfoModel infoModel = this.f14579c;
        int i6 = i4 + 81;
        f14576z = i6 % 128;
        int i7 = i6 % 2;
        return infoModel;
    }

    public final SuggestionBoxModel component2() {
        int i2 = 2 % 2;
        int i3 = B;
        int i4 = i3 + 51;
        f14576z = i4 % 128;
        int i5 = i4 % 2;
        SuggestionBoxModel suggestionBoxModel = this.f14577a;
        int i6 = i3 + 11;
        f14576z = i6 % 128;
        int i7 = i6 % 2;
        return suggestionBoxModel;
    }

    public final boolean component1() {
        int i2 = 2 % 2;
        int i3 = f14576z + 3;
        int i4 = i3 % 128;
        B = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f14578b;
        int i5 = i4 + 29;
        f14576z = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }
}
