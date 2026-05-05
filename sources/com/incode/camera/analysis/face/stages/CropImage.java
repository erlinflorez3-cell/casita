package com.incode.camera.analysis.face.stages;

import android.graphics.Bitmap;
import com.incode.camera.analysis.Stage;
import com.incode.camera.analysis.face.FaceAnalysisEvent;
import com.incode.camera.analysis.face.FaceStageInput;
import com.incode.camera.commons.utils.FaceMetadata;
import io.sentry.SentryEvent;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011H\u0016¨\u0006\u0014"}, d2 = {"Lcom/incode/camera/analysis/face/stages/CropImage;", "Lcom/incode/camera/analysis/face/stages/FaceStage;", "()V", "cropImage", "Landroid/graphics/Bitmap;", "bitmap", "x", "", "y", "width", "height", "perform", "Lcom/incode/camera/analysis/Stage$Result;", "Lcom/incode/camera/analysis/face/FaceAnalysisEvent;", "input", "Lcom/incode/camera/analysis/face/FaceStageInput;", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CropImage extends FaceStage {
    private static int IncodeCamera = 0;
    private static int getAvailableCameraInternals = 1;

    @Override // com.incode.camera.analysis.Stage
    public final /* bridge */ /* synthetic */ Stage.Result<FaceAnalysisEvent> perform(FaceStageInput faceStageInput, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 5;
        getAvailableCameraInternals = i3 % 128;
        int i4 = i3 % 2;
        Stage.Result<FaceAnalysisEvent> resultPerform2 = perform2(faceStageInput, (Function1<? super String, Unit>) function1);
        int i5 = IncodeCamera + 103;
        getAvailableCameraInternals = i5 % 128;
        int i6 = i5 % 2;
        return resultPerform2;
    }

    /* JADX INFO: renamed from: perform, reason: avoid collision after fix types in other method */
    public final Stage.Result<FaceAnalysisEvent> perform2(FaceStageInput input, Function1<? super String, Unit> logger) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        FaceMetadata faceMetadata$core_light_release = input.getFaceMetadata$core_light_release();
        Stage.Result.Proceed proceed = new Stage.Result.Proceed(new FaceAnalysisEvent.Crop(e1(input.getBitmap(), (int) faceMetadata$core_light_release.getNfx(), (int) faceMetadata$core_light_release.getNfy(), (int) faceMetadata$core_light_release.getNfw(), (int) faceMetadata$core_light_release.getNfh())));
        int i3 = getAvailableCameraInternals + 43;
        IncodeCamera = i3 % 128;
        if (i3 % 2 == 0) {
            return proceed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static Bitmap e1(Bitmap bitmap, int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        int i7 = getAvailableCameraInternals + 123;
        IncodeCamera = i7 % 128;
        int i8 = i7 % 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, bitmap.getConfig());
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        int iAbs = Math.abs(RangesKt.coerceAtMost(0, i2));
        int iAbs2 = i4 - Math.abs(RangesKt.coerceAtMost(0, bitmap.getWidth() - (i2 + i4)));
        int iAbs3 = i5 - Math.abs(RangesKt.coerceAtMost(0, bitmap.getHeight() - (i3 + i5)));
        if (iAbs2 > 0) {
            int i9 = IncodeCamera + 115;
            getAvailableCameraInternals = i9 % 128;
            int i10 = i9 % 2;
            if (iAbs3 > 0) {
                int[] iArr = new int[bitmapCreateBitmap.getWidth() * bitmapCreateBitmap.getHeight()];
                Arrays.fill(iArr, -2147483647);
                bitmap.getPixels(iArr, iAbs, bitmapCreateBitmap.getWidth(), i2, i3, iAbs2, iAbs3);
                bitmapCreateBitmap.setPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            }
        }
        return bitmapCreateBitmap;
    }
}
