package com.incode.camera.analysis.document;

import android.graphics.Bitmap;
import com.incode.camera.analysis.StageInput;
import com.incode.camera.analysis.document.DocumentAnalyzer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0010\u001a\u00020\u00112\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0002\b\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentStageInput;", "Lcom/incode/camera/analysis/StageInput;", "config", "Lcom/incode/camera/analysis/document/DocumentAnalyzer$Config;", "bitmap", "Landroid/graphics/Bitmap;", "(Lcom/incode/camera/analysis/document/DocumentAnalyzer$Config;Landroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "<set-?>", "Lcom/incode/camera/analysis/document/CaptureInfo;", "captureInfo", "getCaptureInfo", "()Lcom/incode/camera/analysis/document/CaptureInfo;", "getConfig", "()Lcom/incode/camera/analysis/document/DocumentAnalyzer$Config;", "updateCaptureInfo", "", "update", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentStageInput implements StageInput {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3596e1 = 1;
    private static int getAvailableCameraInternals = 0;
    private final Bitmap CameraConstants;
    private final DocumentAnalyzer.Config IncodeCamera;
    private CaptureInfo ProcessCameraProviderExtensionsKt;

    public DocumentStageInput(DocumentAnalyzer.Config config, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(config, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        this.IncodeCamera = config;
        this.CameraConstants = bitmap;
        this.ProcessCameraProviderExtensionsKt = new CaptureInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public final DocumentAnalyzer.Config getConfig() {
        int i2 = 2 % 2;
        int i3 = f3596e1 + 111;
        getAvailableCameraInternals = i3 % 128;
        if (i3 % 2 == 0) {
            return this.IncodeCamera;
        }
        throw null;
    }

    public final Bitmap getBitmap() {
        int i2 = 2 % 2;
        int i3 = getAvailableCameraInternals + 79;
        f3596e1 = i3 % 128;
        int i4 = i3 % 2;
        Bitmap bitmap = this.CameraConstants;
        if (i4 == 0) {
            int i5 = 12 / 0;
        }
        return bitmap;
    }

    public final CaptureInfo getCaptureInfo() {
        int i2 = 2 % 2;
        int i3 = getAvailableCameraInternals + 65;
        f3596e1 = i3 % 128;
        int i4 = i3 % 2;
        CaptureInfo captureInfo = this.ProcessCameraProviderExtensionsKt;
        if (i4 == 0) {
            int i5 = 36 / 0;
        }
        return captureInfo;
    }

    public final void updateCaptureInfo(Function1<? super CaptureInfo, CaptureInfo> update) {
        int i2 = 2 % 2;
        int i3 = getAvailableCameraInternals + 43;
        f3596e1 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(update, "");
        this.ProcessCameraProviderExtensionsKt = update.invoke(this.ProcessCameraProviderExtensionsKt);
        int i5 = f3596e1 + 121;
        getAvailableCameraInternals = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
