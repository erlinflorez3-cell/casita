package com.incode.camera.analysis.face;

import android.graphics.Bitmap;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.analysis.face.FaceAnalyzer;
import com.incode.camera.commons.utils.FaceLandmarks;
import com.incode.camera.commons.utils.FaceMetadata;
import com.incode.recogkitandroid.Face;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020\u001a8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b#\u0010\u001c¨\u0006%"}, d2 = {"Lcom/incode/camera/analysis/face/FaceStageInput;", "", "config", "Lcom/incode/camera/analysis/face/FaceAnalyzer$Config;", "bitmap", "Landroid/graphics/Bitmap;", "(Lcom/incode/camera/analysis/face/FaceAnalyzer$Config;Landroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getConfig", "()Lcom/incode/camera/analysis/face/FaceAnalyzer$Config;", "faceMetadata", "Lcom/incode/camera/commons/utils/FaceMetadata;", "getFaceMetadata$core_light_release", "()Lcom/incode/camera/commons/utils/FaceMetadata;", "faceMetadata$delegate", "Lkotlin/Lazy;", "faces", "Ljava/util/ArrayList;", "Lcom/incode/recogkitandroid/Face;", "Lkotlin/collections/ArrayList;", "getFaces", "()Ljava/util/ArrayList;", "setFaces", "(Ljava/util/ArrayList;)V", "landmarks", "Lcom/incode/camera/commons/utils/FaceLandmarks;", "getLandmarks$core_light_release", "()Lcom/incode/camera/commons/utils/FaceLandmarks;", "landmarks$delegate", "requireFace", "getRequireFace", "()Lcom/incode/recogkitandroid/Face;", "requireFace$delegate", "requireLandmarks", "getRequireLandmarks$core_light_release", "requireLandmarks$delegate", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceStageInput {
    private static int getContext = 1;
    private static int setConfig = 0;
    private final Lazy CameraConstants;
    private final Bitmap IncodeCamera;
    private final FaceAnalyzer.Config ProcessCameraProviderExtensionsKt;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private final Lazy f3623e1;
    public ArrayList<Face> faces;
    private final Lazy getAvailableCameraInternals;
    private final Lazy getFrameAnalyzerWrapper;

    public FaceStageInput(FaceAnalyzer.Config config, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(config, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        this.ProcessCameraProviderExtensionsKt = config;
        this.IncodeCamera = bitmap;
        this.getAvailableCameraInternals = LazyKt.lazy(new e1());
        this.f3623e1 = LazyKt.lazy(new ProcessCameraProviderExtensionsKt());
        this.CameraConstants = LazyKt.lazy(new getAvailableCameraInternals());
        this.getFrameAnalyzerWrapper = LazyKt.lazy(new CameraConstants());
    }

    public final FaceAnalyzer.Config getConfig() {
        FaceAnalyzer.Config config;
        int i2 = 2 % 2;
        int i3 = setConfig + 113;
        int i4 = i3 % 128;
        getContext = i4;
        if (i3 % 2 == 0) {
            config = this.ProcessCameraProviderExtensionsKt;
            int i5 = 52 / 0;
        } else {
            config = this.ProcessCameraProviderExtensionsKt;
        }
        int i6 = i4 + 97;
        setConfig = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 74 / 0;
        }
        return config;
    }

    public final Bitmap getBitmap() {
        int i2 = 2 % 2;
        int i3 = getContext;
        int i4 = i3 + 121;
        setConfig = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        Bitmap bitmap = this.IncodeCamera;
        int i5 = i3 + 71;
        setConfig = i5 % 128;
        int i6 = i5 % 2;
        return bitmap;
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/incode/recogkitandroid/Face;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e1 extends Lambda implements Function0<Face> {
        private static int CameraConstants = 1;
        private static int getAvailableCameraInternals = 0;

        private Face CameraConstants() {
            int i2 = 2 % 2;
            int i3 = CameraConstants + 85;
            getAvailableCameraInternals = i3 % 128;
            int i4 = i3 % 2;
            Face face = FaceStageInput.this.getFaces().get(0);
            Intrinsics.checkNotNullExpressionValue(face, "");
            Face face2 = face;
            int i5 = CameraConstants + 7;
            getAvailableCameraInternals = i5 % 128;
            int i6 = i5 % 2;
            return face2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Face invoke() {
            int i2 = 2 % 2;
            int i3 = CameraConstants + 109;
            getAvailableCameraInternals = i3 % 128;
            int i4 = i3 % 2;
            Face faceCameraConstants = CameraConstants();
            int i5 = getAvailableCameraInternals + 115;
            CameraConstants = i5 % 128;
            int i6 = i5 % 2;
            return faceCameraConstants;
        }

        e1() {
            super(0);
        }
    }

    public final ArrayList<Face> getFaces() {
        int i2 = 2 % 2;
        int i3 = getContext;
        int i4 = i3 + 17;
        setConfig = i4 % 128;
        int i5 = i4 % 2;
        ArrayList<Face> arrayList = this.faces;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i6 = i3 + 105;
        setConfig = i6 % 128;
        int i7 = i6 % 2;
        return arrayList;
    }

    public final void setFaces(ArrayList<Face> arrayList) {
        int i2 = 2 % 2;
        int i3 = setConfig + 97;
        getContext = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.faces = arrayList;
        int i5 = setConfig + 1;
        getContext = i5 % 128;
        int i6 = i5 % 2;
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/incode/camera/commons/utils/FaceMetadata;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class ProcessCameraProviderExtensionsKt extends Lambda implements Function0<FaceMetadata> {
        private static int ProcessCameraProviderExtensionsKt = 1;
        private static int getAvailableCameraInternals = 0;

        private FaceMetadata e1() {
            int i2 = 2 % 2;
            FaceMetadata faceMetadata = new FaceMetadata(FaceStageInput.this.getRequireLandmarks$core_light_release(), FaceStageInput.this.getBitmap());
            int i3 = ProcessCameraProviderExtensionsKt + 15;
            getAvailableCameraInternals = i3 % 128;
            if (i3 % 2 == 0) {
                return faceMetadata;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ FaceMetadata invoke() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 9;
            getAvailableCameraInternals = i3 % 128;
            int i4 = i3 % 2;
            FaceMetadata faceMetadataE1 = e1();
            if (i4 != 0) {
                int i5 = 66 / 0;
            }
            return faceMetadataE1;
        }

        ProcessCameraProviderExtensionsKt() {
            super(0);
        }
    }

    public final Face getRequireFace() {
        int i2 = 2 % 2;
        int i3 = setConfig + 57;
        getContext = i3 % 128;
        int i4 = i3 % 2;
        Face face = (Face) this.getAvailableCameraInternals.getValue();
        int i5 = setConfig + 103;
        getContext = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return face;
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/incode/camera/commons/utils/FaceLandmarks;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class getAvailableCameraInternals extends Lambda implements Function0<FaceLandmarks> {
        private static int ProcessCameraProviderExtensionsKt = 1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static int f3625e1 = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ FaceLandmarks invoke() {
            int i2 = 2 % 2;
            int i3 = f3625e1 + 33;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            FaceLandmarks faceLandmarksIncodeCamera = IncodeCamera();
            int i5 = ProcessCameraProviderExtensionsKt + 99;
            f3625e1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 24 / 0;
            }
            return faceLandmarksIncodeCamera;
        }

        private FaceLandmarks IncodeCamera() {
            int i2 = 2 % 2;
            int i3 = f3625e1 + 55;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            Face face = (Face) CollectionsKt.getOrNull(FaceStageInput.this.getFaces(), 0);
            if (face == null) {
                return null;
            }
            FaceLandmarks faceLandmarksFrom = FaceLandmarks.INSTANCE.from(face);
            int i5 = ProcessCameraProviderExtensionsKt + 43;
            f3625e1 = i5 % 128;
            int i6 = i5 % 2;
            return faceLandmarksFrom;
        }

        getAvailableCameraInternals() {
            super(0);
        }
    }

    public final FaceMetadata getFaceMetadata$core_light_release() {
        int i2 = 2 % 2;
        int i3 = setConfig + 17;
        getContext = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FaceMetadata faceMetadata = (FaceMetadata) this.f3623e1.getValue();
        int i4 = getContext + 19;
        setConfig = i4 % 128;
        int i5 = i4 % 2;
        return faceMetadata;
    }

    public final FaceLandmarks getLandmarks$core_light_release() {
        FaceLandmarks faceLandmarks;
        int i2 = 2 % 2;
        int i3 = getContext + 39;
        setConfig = i3 % 128;
        if (i3 % 2 != 0) {
            faceLandmarks = (FaceLandmarks) this.CameraConstants.getValue();
            int i4 = 13 / 0;
        } else {
            faceLandmarks = (FaceLandmarks) this.CameraConstants.getValue();
        }
        int i5 = getContext + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        setConfig = i5 % 128;
        int i6 = i5 % 2;
        return faceLandmarks;
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/incode/camera/commons/utils/FaceLandmarks;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class CameraConstants extends Lambda implements Function0<FaceLandmarks> {
        private static int ProcessCameraProviderExtensionsKt = 0;
        private static int getAvailableCameraInternals = 1;

        private FaceLandmarks ProcessCameraProviderExtensionsKt() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 63;
            getAvailableCameraInternals = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNull(FaceStageInput.this.getLandmarks$core_light_release());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            FaceLandmarks landmarks$core_light_release = FaceStageInput.this.getLandmarks$core_light_release();
            Intrinsics.checkNotNull(landmarks$core_light_release);
            int i4 = ProcessCameraProviderExtensionsKt + 3;
            getAvailableCameraInternals = i4 % 128;
            int i5 = i4 % 2;
            return landmarks$core_light_release;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ FaceLandmarks invoke() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 75;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            FaceLandmarks faceLandmarksProcessCameraProviderExtensionsKt = ProcessCameraProviderExtensionsKt();
            int i5 = getAvailableCameraInternals + 17;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 97 / 0;
            }
            return faceLandmarksProcessCameraProviderExtensionsKt;
        }

        CameraConstants() {
            super(0);
        }
    }

    public final FaceLandmarks getRequireLandmarks$core_light_release() {
        FaceLandmarks faceLandmarks;
        int i2 = 2 % 2;
        int i3 = setConfig + 13;
        getContext = i3 % 128;
        if (i3 % 2 == 0) {
            faceLandmarks = (FaceLandmarks) this.getFrameAnalyzerWrapper.getValue();
            int i4 = 26 / 0;
        } else {
            faceLandmarks = (FaceLandmarks) this.getFrameAnalyzerWrapper.getValue();
        }
        int i5 = getContext + 13;
        setConfig = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return faceLandmarks;
    }
}
