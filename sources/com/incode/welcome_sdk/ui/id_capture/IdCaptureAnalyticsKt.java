package com.incode.welcome_sdk.ui.id_capture;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureAnalyticsKt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f14751c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14752e = 0;

    public static final /* synthetic */ void access$isChanged(boolean z2, boolean z3, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = f14751c + 81;
        f14752e = i3 % 128;
        int i4 = i3 % 2;
        a(z2, z3, function1);
        if (i4 != 0) {
            int i5 = 52 / 0;
        }
        int i6 = f14751c + 45;
        f14752e = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$isShown(InfoModel infoModel, InfoModel infoModel2, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = f14751c + 91;
        f14752e = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        b(infoModel, infoModel2, function1);
        if (i4 != 0) {
            throw null;
        }
        int i5 = f14752e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14751c = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$isShown(SuggestionBoxModel suggestionBoxModel, SuggestionBoxModel suggestionBoxModel2, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = f14752e + 67;
        f14751c = i3 % 128;
        int i4 = i3 % 2;
        e(suggestionBoxModel, suggestionBoxModel2, function1);
        int i5 = f14752e + 81;
        f14751c = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$isShown(boolean z2, boolean z3, Function0 function0) {
        int i2 = 2 % 2;
        int i3 = f14751c + 121;
        f14752e = i3 % 128;
        int i4 = i3 % 2;
        c(z2, z3, function0);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f14751c + 111;
        f14752e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
    }

    public static final /* synthetic */ ScreenName access$toScreenName(DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = f14751c + 81;
        f14752e = i3 % 128;
        int i4 = i3 % 2;
        ScreenName screenNameD = d(documentType);
        if (i4 != 0) {
            int i5 = 0 / 0;
        }
        return screenNameD;
    }

    private static final void a(boolean z2, boolean z3, Function1<? super Boolean, Unit> function1) {
        int i2 = 2 % 2;
        int i3 = f14752e + 13;
        int i4 = i3 % 128;
        f14751c = i4;
        int i5 = i3 % 2;
        if (z2 != z3) {
            int i6 = i4 + 17;
            f14752e = i6 % 128;
            int i7 = i6 % 2;
            function1.invoke(Boolean.valueOf(z2));
        }
        int i8 = f14751c + 83;
        f14752e = i8 % 128;
        int i9 = i8 % 2;
    }

    private static final void c(boolean z2, boolean z3, Function0<Unit> function0) {
        int i2 = 2 % 2;
        int i3 = f14751c;
        int i4 = i3 + 67;
        f14752e = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z2 && (!z3)) {
            int i5 = i3 + 33;
            f14752e = i5 % 128;
            int i6 = i5 % 2;
            function0.invoke();
            if (i6 != 0) {
                int i7 = 70 / 0;
            }
        }
    }

    private static final void e(SuggestionBoxModel suggestionBoxModel, SuggestionBoxModel suggestionBoxModel2, Function1<? super SuggestionBoxModel, Unit> function1) {
        int i2 = 2 % 2;
        if (suggestionBoxModel != null) {
            int i3 = f14752e + 81;
            f14751c = i3 % 128;
            int i4 = i3 % 2;
            if (!Intrinsics.areEqual(suggestionBoxModel, suggestionBoxModel2)) {
                function1.invoke(suggestionBoxModel);
            }
        }
        int i5 = f14751c + 3;
        f14752e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
    }

    private static final void b(InfoModel infoModel, InfoModel infoModel2, Function1<? super InfoModel, Unit> function1) {
        int i2 = 2 % 2;
        int i3 = f14751c;
        int i4 = i3 + 5;
        f14752e = i4 % 128;
        int i5 = i4 % 2;
        if (infoModel != null) {
            int i6 = i3 + 107;
            f14752e = i6 % 128;
            int i7 = i6 % 2;
            if (Intrinsics.areEqual(infoModel, infoModel2)) {
                return;
            }
            int i8 = f14752e + 125;
            f14751c = i8 % 128;
            int i9 = i8 % 2;
            function1.invoke(infoModel);
            if (i9 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return com.incode.welcome_sdk.ScreenName.BACK_ID_CAMERA_CAPTURE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r1 != 3) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        return com.incode.welcome_sdk.ScreenName.VALIDATION;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final com.incode.welcome_sdk.ScreenName d(com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r5) {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalyticsKt.f14751c
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalyticsKt.f14752e = r0
            int r1 = r1 % r4
            r3 = 3
            r2 = 1
            if (r1 == 0) goto L25
            int[] r1 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalyticsKt.WhenMappings.f14753b
            int r0 = r5.ordinal()
            r1 = r1[r0]
            r0 = 71
            int r0 = r0 / 0
            if (r1 == r2) goto L4a
            if (r1 == r4) goto L37
            if (r1 == r3) goto L34
        L22:
            com.incode.welcome_sdk.ScreenName r0 = com.incode.welcome_sdk.ScreenName.VALIDATION
            return r0
        L25:
            int[] r1 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalyticsKt.WhenMappings.f14753b
            int r0 = r5.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L4a
            if (r0 == r4) goto L37
            if (r0 == r3) goto L34
            goto L22
        L34:
            com.incode.welcome_sdk.ScreenName r0 = com.incode.welcome_sdk.ScreenName.BACK_ID_CAMERA_CAPTURE
            return r0
        L37:
            com.incode.welcome_sdk.ScreenName r2 = com.incode.welcome_sdk.ScreenName.PASSPORT_CAMERA_CAPTURE
            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalyticsKt.f14751c
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalyticsKt.f14752e = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L45
            return r2
        L45:
            r0 = 0
            r0.hashCode()
            throw r0
        L4a:
            com.incode.welcome_sdk.ScreenName r0 = com.incode.welcome_sdk.ScreenName.FRONT_ID_CAMERA_CAPTURE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureAnalyticsKt.d(com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType):com.incode.welcome_sdk.ScreenName");
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14754c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14755d = 0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.FRONT_ID.ordinal()] = 1;
                int i2 = f14754c + 97;
                f14755d = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 2;
                int i4 = f14754c + 7;
                f14755d = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.BACK_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14753b = iArr;
        }
    }
}
