package com.incode.welcome_sdk.ui.document_scan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.ui.BottomSheetDialogFragmentWithListener;
import com.incode.welcome_sdk.d.aj;
import com.incode.welcome_sdk.views.IncodeTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class BottomSheetDocumentValidationOptions extends BottomSheetDialogFragmentWithListener<DocumentScanOptionsListener> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f13218a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f13219d = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f13220e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f13221h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f13222i = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private aj f13224c;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$onViewCreated$-Landroid-view-View-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8440xf64d23e6(BottomSheetDocumentValidationOptions bottomSheetDocumentValidationOptions, View view) {
        Callback.onClick_enter(view);
        try {
            e(bottomSheetDocumentValidationOptions, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$onViewCreated$-Landroid-view-View-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8441x1be12ce7(BottomSheetDocumentValidationOptions bottomSheetDocumentValidationOptions, View view) {
        Callback.onClick_enter(view);
        try {
            d(bottomSheetDocumentValidationOptions, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$onViewCreated$-Landroid-view-View-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8442x417535e8(BottomSheetDocumentValidationOptions bottomSheetDocumentValidationOptions, View view) {
        Callback.onClick_enter(view);
        try {
            c(bottomSheetDocumentValidationOptions, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    private final aj c() {
        int i2 = 2 % 2;
        int i3 = f13220e + 57;
        f13218a = i3 % 128;
        int i4 = i3 % 2;
        aj ajVar = this.f13224c;
        Intrinsics.checkNotNull(ajVar);
        int i5 = f13220e + 87;
        f13218a = i5 % 128;
        int i6 = i5 % 2;
        return ajVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f13218a + 43;
        f13220e = i3 % 128;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i5 = f13220e + 25;
            f13218a = i5 % 128;
            if (i5 % 2 != 0) {
                this.f13223b = arguments.getBoolean("argBrowseSupported");
                throw null;
            }
            this.f13223b = arguments.getBoolean("argBrowseSupported");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f13218a + 111;
        f13220e = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            this.f13224c = aj.e(layoutInflater, viewGroup);
            Intrinsics.checkNotNullExpressionValue(c().a(), "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.f13224c = aj.e(layoutInflater, viewGroup);
        ConstraintLayout constraintLayoutA = c().a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "");
        ConstraintLayout constraintLayout = constraintLayoutA;
        int i4 = f13220e + 35;
        f13218a = i4 % 128;
        if (i4 % 2 == 0) {
            return constraintLayout;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i2 = 2 % 2;
        int i3 = f13218a + 15;
        f13220e = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f13224c = null;
            super.onDestroyView();
            int i4 = f13218a + 75;
            f13220e = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f13224c = null;
        super.onDestroyView();
        obj.hashCode();
        throw null;
    }

    private static final void e(BottomSheetDocumentValidationOptions bottomSheetDocumentValidationOptions, View view) {
        int i2 = 2 % 2;
        int i3 = f13218a + 35;
        f13220e = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bottomSheetDocumentValidationOptions, "");
            bottomSheetDocumentValidationOptions.d();
        } else {
            Intrinsics.checkNotNullParameter(bottomSheetDocumentValidationOptions, "");
            bottomSheetDocumentValidationOptions.d();
            int i4 = 81 / 0;
        }
    }

    private static final void d(BottomSheetDocumentValidationOptions bottomSheetDocumentValidationOptions, View view) {
        int i2 = 2 % 2;
        int i3 = f13218a + 117;
        f13220e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(bottomSheetDocumentValidationOptions, "");
        bottomSheetDocumentValidationOptions.e();
        int i5 = f13218a + 95;
        f13220e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
    }

    private static final void c(BottomSheetDocumentValidationOptions bottomSheetDocumentValidationOptions, View view) {
        int i2 = 2 % 2;
        int i3 = f13220e + 19;
        f13218a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(bottomSheetDocumentValidationOptions, "");
        bottomSheetDocumentValidationOptions.a();
        int i5 = f13220e + 123;
        f13218a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[PHI: r2
  0x0063: PHI (r2v1 com.incode.welcome_sdk.views.IncodeTextView) = (r2v0 com.incode.welcome_sdk.views.IncodeTextView), (r2v3 com.incode.welcome_sdk.views.IncodeTextView) binds: [B:9:0x0060, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.document_scan.BottomSheetDocumentValidationOptions.f13220e
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.document_scan.BottomSheetDocumentValidationOptions.f13218a = r0
            int r1 = r1 % r4
            r3 = 0
            java.lang.String r0 = ""
            if (r1 == 0) goto L52
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            super.onViewCreated(r6, r7)
            com.incode.welcome_sdk.d.aj r0 = r5.c()
            com.incode.welcome_sdk.views.IncodeTextView r2 = r0.f6870a
            boolean r1 = r5.f13223b
            r0 = 68
            int r0 = r0 / r3
            if (r1 == 0) goto L63
        L24:
            r2.setVisibility(r3)
            com.incode.welcome_sdk.d.aj r0 = r5.c()
            com.incode.welcome_sdk.views.IncodeTextView r1 = r0.f6873e
            com.incode.welcome_sdk.ui.document_scan.BottomSheetDocumentValidationOptions$$ExternalSyntheticLambda0 r0 = new com.incode.welcome_sdk.ui.document_scan.BottomSheetDocumentValidationOptions$$ExternalSyntheticLambda0
            r0.<init>()
            r1.setOnClickListener(r0)
            com.incode.welcome_sdk.d.aj r0 = r5.c()
            com.incode.welcome_sdk.views.IncodeTextView r1 = r0.f6871b
            com.incode.welcome_sdk.ui.document_scan.BottomSheetDocumentValidationOptions$$ExternalSyntheticLambda1 r0 = new com.incode.welcome_sdk.ui.document_scan.BottomSheetDocumentValidationOptions$$ExternalSyntheticLambda1
            r0.<init>()
            r1.setOnClickListener(r0)
            com.incode.welcome_sdk.d.aj r0 = r5.c()
            com.incode.welcome_sdk.views.IncodeTextView r1 = r0.f6870a
            com.incode.welcome_sdk.ui.document_scan.BottomSheetDocumentValidationOptions$$ExternalSyntheticLambda2 r0 = new com.incode.welcome_sdk.ui.document_scan.BottomSheetDocumentValidationOptions$$ExternalSyntheticLambda2
            r0.<init>()
            r1.setOnClickListener(r0)
            return
        L52:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            super.onViewCreated(r6, r7)
            com.incode.welcome_sdk.d.aj r0 = r5.c()
            com.incode.welcome_sdk.views.IncodeTextView r2 = r0.f6870a
            boolean r0 = r5.f13223b
            if (r0 == 0) goto L63
            goto L24
        L63:
            int r0 = com.incode.welcome_sdk.ui.document_scan.BottomSheetDocumentValidationOptions.f13220e
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.document_scan.BottomSheetDocumentValidationOptions.f13218a = r0
            int r1 = r1 % r4
            r3 = 8
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.document_scan.BottomSheetDocumentValidationOptions.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void d() {
        int i2 = 2 % 2;
        int i3 = f13218a + 79;
        f13220e = i3 % 128;
        if (i3 % 2 != 0) {
            IncodeTextView incodeTextView = c().f6873e;
            Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
            ViewExtensionsKt.preventDoubleClick(incodeTextView);
            getListener().onBtnPhotoLibrary();
            dismiss();
            int i4 = f13220e + 43;
            f13218a = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        IncodeTextView incodeTextView2 = c().f6873e;
        Intrinsics.checkNotNullExpressionValue(incodeTextView2, "");
        ViewExtensionsKt.preventDoubleClick(incodeTextView2);
        getListener().onBtnPhotoLibrary();
        dismiss();
        throw null;
    }

    private final void e() {
        int i2 = 2 % 2;
        int i3 = f13218a + 77;
        f13220e = i3 % 128;
        int i4 = i3 % 2;
        IncodeTextView incodeTextView = c().f6871b;
        Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
        ViewExtensionsKt.preventDoubleClick(incodeTextView);
        getListener().onBtnTakePhoto();
        dismiss();
        int i5 = f13220e + 105;
        f13218a = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void a() {
        int i2 = 2 % 2;
        int i3 = f13220e + 23;
        f13218a = i3 % 128;
        int i4 = i3 % 2;
        IncodeTextView incodeTextView = c().f6870a;
        Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
        ViewExtensionsKt.preventDoubleClick(incodeTextView);
        getListener().onBtnBrowse();
        dismiss();
        int i5 = f13220e + 91;
        f13218a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13225a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13226d = 0;

        private Companion() {
        }

        public final BottomSheetDocumentValidationOptions newInstance(boolean z2) {
            int i2 = 2 % 2;
            BottomSheetDocumentValidationOptions bottomSheetDocumentValidationOptions = new BottomSheetDocumentValidationOptions();
            Bundle bundle = new Bundle();
            bundle.putBoolean("argBrowseSupported", z2);
            bottomSheetDocumentValidationOptions.setArguments(bundle);
            int i3 = f13226d + 1;
            f13225a = i3 % 128;
            int i4 = i3 % 2;
            return bottomSheetDocumentValidationOptions;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f13221h + 107;
        f13222i = i2 % 128;
        int i3 = i2 % 2;
    }
}
