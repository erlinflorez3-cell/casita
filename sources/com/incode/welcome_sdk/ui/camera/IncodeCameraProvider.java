package com.incode.welcome_sdk.ui.camera;

import android.content.Context;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.LifecycleOwner;
import com.incode.camera.IncodeCamera;
import com.incode.camera.analysis.FrameAnalyzerWrapper;
import com.incode.camera.analysis.StubAnalysisEvent;
import com.incode.camera.analysis.StubFrameAnalyzer;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.camera.analysis.document.DocumentAnalyzer;
import com.incode.welcome_sdk.commons.exceptions.MissingCameraDependencyException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeCameraProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f11482a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11483b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11484c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final IncodeCameraProvider f11485d = new IncodeCameraProvider();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11486e = 0;

    private IncodeCameraProvider() {
    }

    @JvmStatic
    public static final boolean doesCameraDependencyExist() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f11483b + 123;
        f11484c = i3 % 128;
        int i4 = i3 % 2;
        try {
            Class.forName("com.incode.camera.IncodeCamera");
            Class.forName("com.incode.camera.analysis.document.DocumentAnalyzer");
            z2 = true;
        } catch (ClassNotFoundException unused) {
            z2 = false;
            Timber.Forest.w(new MissingCameraDependencyException().getMessage(), new Object[0]);
        }
        int i5 = f11483b + 21;
        f11484c = i5 % 128;
        if (i5 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IncodeCamera<DocumentAnalysisEvent> generateIncodeCameraForDocumentCapture(Context context, LifecycleOwner lifecycleOwner, DocumentAnalyzer documentAnalyzer) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(documentAnalyzer, "");
        PreviewView previewView = new PreviewView(context);
        IncodeCamera<DocumentAnalysisEvent> incodeCamera = new IncodeCamera<>(context, lifecycleOwner, previewView, new FrameAnalyzerWrapper(documentAnalyzer, new e(previewView)), false, 16, null);
        int i3 = f11484c + 49;
        f11483b = i3 % 128;
        if (i3 % 2 != 0) {
            return incodeCamera;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class e extends Lambda implements Function0<Pair<? extends Integer, ? extends Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11490c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11491e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ PreviewView f11492a;

        private Pair<Integer, Integer> e() {
            int i2 = 2 % 2;
            int i3 = f11491e + 15;
            f11490c = i3 % 128;
            if (i3 % 2 == 0) {
                TuplesKt.to(Integer.valueOf(this.f11492a.getHeight()), Integer.valueOf(this.f11492a.getWidth()));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Pair<Integer, Integer> pair = TuplesKt.to(Integer.valueOf(this.f11492a.getHeight()), Integer.valueOf(this.f11492a.getWidth()));
            int i4 = f11491e + 99;
            f11490c = i4 % 128;
            int i5 = i4 % 2;
            return pair;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke() {
            int i2 = 2 % 2;
            int i3 = f11491e + 29;
            f11490c = i3 % 128;
            int i4 = i3 % 2;
            Pair<Integer, Integer> pairE = e();
            int i5 = f11491e + 121;
            f11490c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 57 / 0;
            }
            return pairE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(PreviewView previewView) {
            super(0);
            this.f11492a = previewView;
        }
    }

    public final IncodeCamera<StubAnalysisEvent> generateIncodeCameraForSelfieCapture(Context context, LifecycleOwner lifecycleOwner, StubFrameAnalyzer stubFrameAnalyzer, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(stubFrameAnalyzer, "");
        PreviewView previewView = new PreviewView(context);
        IncodeCamera<StubAnalysisEvent> incodeCamera = new IncodeCamera<>(context, lifecycleOwner, previewView, new FrameAnalyzerWrapper(stubFrameAnalyzer, new a(previewView)), z2);
        int i3 = f11483b + 61;
        f11484c = i3 % 128;
        if (i3 % 2 == 0) {
            return incodeCamera;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class a extends Lambda implements Function0<Pair<? extends Integer, ? extends Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11487c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11488d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ PreviewView f11489e;

        private Pair<Integer, Integer> c() {
            int i2 = 2 % 2;
            int i3 = f11488d + 11;
            f11487c = i3 % 128;
            int i4 = i3 % 2;
            Pair<Integer, Integer> pair = TuplesKt.to(Integer.valueOf(this.f11489e.getHeight()), Integer.valueOf(this.f11489e.getWidth()));
            int i5 = f11488d + 105;
            f11487c = i5 % 128;
            int i6 = i5 % 2;
            return pair;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke() {
            int i2 = 2 % 2;
            int i3 = f11488d + 55;
            f11487c = i3 % 128;
            if (i3 % 2 != 0) {
                return c();
            }
            c();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(PreviewView previewView) {
            super(0);
            this.f11489e = previewView;
        }
    }

    static {
        int i2 = f11482a + 53;
        f11486e = i2 % 128;
        int i3 = i2 % 2;
    }
}
