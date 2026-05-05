package com.incode.camera.analysis.document;

import android.graphics.Bitmap;
import androidx.exifinterface.media.ExifInterface;
import com.braze.models.FeatureFlag;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.analysis.AnalysisEvent;
import com.incode.camera.commons.utils.IdentityDocumentExtractor;
import com.incode.camera.commons.utils.Side;
import io.sentry.SentryEvent;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eJ\b\u0010\u0002\u001a\u00020\u0003H\u0016\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "Lcom/incode/camera/analysis/AnalysisEvent;", "isClassified", "", "AnalysisAbortEvent", "Blur", "BoundsDetected", "CaptureCandidateGenerated", "Error", "Glare", "IdTypeExtracted", "NoDocumentDetected", "NotAligned", ExifInterface.TAG_ORIENTATION, "TooDark", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$AnalysisAbortEvent;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$BoundsDetected;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$CaptureCandidateGenerated;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$IdTypeExtracted;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$Orientation;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DocumentAnalysisEvent extends AnalysisEvent {
    boolean isClassified();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int IncodeCamera = 0;
        private static int getAvailableCameraInternals = 1;

        public static boolean isClassified(DocumentAnalysisEvent documentAnalysisEvent) {
            Boolean boolIsClassified;
            int i2 = 2 % 2;
            if (documentAnalysisEvent instanceof AnalysisAbortEvent) {
                int i3 = getAvailableCameraInternals + 83;
                IncodeCamera = i3 % 128;
                int i4 = i3 % 2;
                boolIsClassified = ((AnalysisAbortEvent) documentAnalysisEvent).getCaptureInfo().isClassified();
            } else if (documentAnalysisEvent instanceof CaptureCandidateGenerated) {
                int i5 = IncodeCamera + 59;
                getAvailableCameraInternals = i5 % 128;
                int i6 = i5 % 2;
                boolIsClassified = ((CaptureCandidateGenerated) documentAnalysisEvent).getCaptureInfo().isClassified();
            } else {
                boolIsClassified = null;
            }
            return Intrinsics.areEqual(boolIsClassified, Boolean.TRUE);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$AnalysisAbortEvent;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "captureInfo", "Lcom/incode/camera/analysis/document/CaptureInfo;", "getCaptureInfo", "()Lcom/incode/camera/analysis/document/CaptureInfo;", "description", "", "getDescription", "()Ljava/lang/String;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface AnalysisAbortEvent extends DocumentAnalysisEvent {
        CaptureInfo getCaptureInfo();

        String getDescription();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            private static int IncodeCamera = 0;
            private static int getAvailableCameraInternals = 1;

            public static boolean isClassified(AnalysisAbortEvent analysisAbortEvent) {
                int i2 = 2 % 2;
                int i3 = IncodeCamera + 73;
                getAvailableCameraInternals = i3 % 128;
                if (i3 % 2 != 0) {
                    boolean zIsClassified = DefaultImpls.isClassified(analysisAbortEvent);
                    int i4 = IncodeCamera + 23;
                    getAvailableCameraInternals = i4 % 128;
                    if (i4 % 2 != 0) {
                        return zIsClassified;
                    }
                    throw null;
                }
                DefaultImpls.isClassified(analysisAbortEvent);
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$NoDocumentDetected;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$AnalysisAbortEvent;", "captureInfo", "Lcom/incode/camera/analysis/document/CaptureInfo;", "(Lcom/incode/camera/analysis/document/CaptureInfo;)V", "getCaptureInfo", "()Lcom/incode/camera/analysis/document/CaptureInfo;", "description", "", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoDocumentDetected implements AnalysisAbortEvent {

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static int f3585e1 = 1;
        private static int getAvailableCameraInternals = 0;
        private final CaptureInfo IncodeCamera;
        private final String ProcessCameraProviderExtensionsKt;

        public NoDocumentDetected(CaptureInfo captureInfo) {
            Intrinsics.checkNotNullParameter(captureInfo, "");
            this.IncodeCamera = captureInfo;
            this.ProcessCameraProviderExtensionsKt = "noIdDetected";
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
        public final CaptureInfo getCaptureInfo() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 77;
            int i4 = i3 % 128;
            f3585e1 = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            CaptureInfo captureInfo = this.IncodeCamera;
            int i5 = i4 + 43;
            getAvailableCameraInternals = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 10 / 0;
            }
            return captureInfo;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent
        public final boolean isClassified() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 107;
            f3585e1 = i3 % 128;
            if (i3 % 2 != 0) {
                return AnalysisAbortEvent.DefaultImpls.isClassified(this);
            }
            AnalysisAbortEvent.DefaultImpls.isClassified(this);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
        public final String getDescription() {
            int i2 = 2 % 2;
            int i3 = f3585e1;
            int i4 = i3 + 109;
            getAvailableCameraInternals = i4 % 128;
            int i5 = i4 % 2;
            String str = this.ProcessCameraProviderExtensionsKt;
            int i6 = i3 + 5;
            getAvailableCameraInternals = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public final boolean equals(Object other) {
            int i2 = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoDocumentDetected)) {
                return false;
            }
            if (Intrinsics.areEqual(this.IncodeCamera, ((NoDocumentDetected) other).IncodeCamera)) {
                return true;
            }
            int i3 = getAvailableCameraInternals + 125;
            int i4 = i3 % 128;
            f3585e1 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 85;
            getAvailableCameraInternals = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 19;
            f3585e1 = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = this.IncodeCamera.hashCode();
            int i5 = f3585e1 + 73;
            getAvailableCameraInternals = i5 % 128;
            if (i5 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f3585e1 + 39;
            getAvailableCameraInternals = i3 % 128;
            int i4 = i3 % 2;
            String str = "NoDocumentDetected(captureInfo=" + this.IncodeCamera + ")";
            int i5 = getAvailableCameraInternals + 109;
            f3585e1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 19 / 0;
            }
            return str;
        }

        public static /* synthetic */ NoDocumentDetected copy$default(NoDocumentDetected noDocumentDetected, CaptureInfo captureInfo, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = getAvailableCameraInternals;
            int i5 = i4 + 107;
            f3585e1 = i5 % 128;
            if (i5 % 2 != 0 && (i2 & 1) != 0) {
                int i6 = i4 + 25;
                f3585e1 = i6 % 128;
                int i7 = i6 % 2;
                captureInfo = noDocumentDetected.IncodeCamera;
                if (i7 == 0) {
                    int i8 = 3 / 0;
                }
            }
            return noDocumentDetected.copy(captureInfo);
        }

        public final NoDocumentDetected copy(CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureInfo, "");
            NoDocumentDetected noDocumentDetected = new NoDocumentDetected(captureInfo);
            int i3 = f3585e1 + 61;
            getAvailableCameraInternals = i3 % 128;
            if (i3 % 2 == 0) {
                return noDocumentDetected;
            }
            throw null;
        }

        public final CaptureInfo component1() {
            int i2 = 2 % 2;
            int i3 = f3585e1;
            int i4 = i3 + 5;
            getAvailableCameraInternals = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CaptureInfo captureInfo = this.IncodeCamera;
            int i5 = i3 + 71;
            getAvailableCameraInternals = i5 % 128;
            int i6 = i5 % 2;
            return captureInfo;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$NotAligned;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$AnalysisAbortEvent;", "PartiallyVisible", "TooLarge", "TooSmall", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$NotAligned$PartiallyVisible;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$NotAligned$TooLarge;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$NotAligned$TooSmall;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface NotAligned extends AnalysisAbortEvent {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$NotAligned$TooSmall;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$NotAligned;", "captureInfo", "Lcom/incode/camera/analysis/document/CaptureInfo;", "(Lcom/incode/camera/analysis/document/CaptureInfo;)V", "getCaptureInfo", "()Lcom/incode/camera/analysis/document/CaptureInfo;", "description", "", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TooSmall implements NotAligned {
            private static int CameraConstants = 1;
            private static int getAvailableCameraInternals = 0;
            private final CaptureInfo IncodeCamera;
            private final String ProcessCameraProviderExtensionsKt;

            public TooSmall(CaptureInfo captureInfo) {
                Intrinsics.checkNotNullParameter(captureInfo, "");
                this.IncodeCamera = captureInfo;
                this.ProcessCameraProviderExtensionsKt = "tooSmall";
            }

            @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
            public final CaptureInfo getCaptureInfo() {
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals + 17;
                CameraConstants = i3 % 128;
                if (i3 % 2 != 0) {
                    return this.IncodeCamera;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent
            public final boolean isClassified() {
                boolean zIsClassified;
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals + 9;
                CameraConstants = i3 % 128;
                if (i3 % 2 == 0) {
                    zIsClassified = DefaultImpls.isClassified(this);
                    int i4 = 44 / 0;
                } else {
                    zIsClassified = DefaultImpls.isClassified(this);
                }
                int i5 = CameraConstants + 35;
                getAvailableCameraInternals = i5 % 128;
                int i6 = i5 % 2;
                return zIsClassified;
            }

            @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
            public final String getDescription() {
                String str;
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals;
                int i4 = i3 + 91;
                CameraConstants = i4 % 128;
                if (i4 % 2 == 0) {
                    str = this.ProcessCameraProviderExtensionsKt;
                    int i5 = 59 / 0;
                } else {
                    str = this.ProcessCameraProviderExtensionsKt;
                }
                int i6 = i3 + 33;
                CameraConstants = i6 % 128;
                if (i6 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            public final boolean equals(Object other) {
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals;
                int i4 = i3 + 25;
                CameraConstants = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    throw null;
                }
                if (this == other) {
                    int i5 = i3 + 11;
                    CameraConstants = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (!(other instanceof TooSmall)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.IncodeCamera, ((TooSmall) other).IncodeCamera)) {
                    return true;
                }
                int i7 = getAvailableCameraInternals + 87;
                CameraConstants = i7 % 128;
                if (i7 % 2 != 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }

            public final int hashCode() {
                int i2 = 2 % 2;
                int i3 = CameraConstants + 121;
                getAvailableCameraInternals = i3 % 128;
                int i4 = i3 % 2;
                int iHashCode = this.IncodeCamera.hashCode();
                if (i4 != 0) {
                    int i5 = 14 / 0;
                }
                return iHashCode;
            }

            public final String toString() {
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals + 3;
                CameraConstants = i3 % 128;
                int i4 = i3 % 2;
                String str = "TooSmall(captureInfo=" + this.IncodeCamera + ")";
                int i5 = CameraConstants + 29;
                getAvailableCameraInternals = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public static /* synthetic */ TooSmall copy$default(TooSmall tooSmall, CaptureInfo captureInfo, int i2, Object obj) {
                int i3 = 2 % 2;
                int i4 = getAvailableCameraInternals;
                int i5 = i4 + 47;
                CameraConstants = i5 % 128;
                int i6 = i5 % 2;
                if ((i2 & 1) != 0) {
                    int i7 = i4 + 69;
                    int i8 = i7 % 128;
                    CameraConstants = i8;
                    int i9 = i7 % 2;
                    captureInfo = tooSmall.IncodeCamera;
                    int i10 = i8 + 63;
                    getAvailableCameraInternals = i10 % 128;
                    int i11 = i10 % 2;
                }
                return tooSmall.copy(captureInfo);
            }

            public final TooSmall copy(CaptureInfo captureInfo) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(captureInfo, "");
                TooSmall tooSmall = new TooSmall(captureInfo);
                int i3 = getAvailableCameraInternals + 39;
                CameraConstants = i3 % 128;
                int i4 = i3 % 2;
                return tooSmall;
            }

            public final CaptureInfo component1() {
                int i2 = 2 % 2;
                int i3 = CameraConstants;
                int i4 = i3 + 89;
                getAvailableCameraInternals = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                CaptureInfo captureInfo = this.IncodeCamera;
                int i5 = i3 + 23;
                getAvailableCameraInternals = i5 % 128;
                int i6 = i5 % 2;
                return captureInfo;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$NotAligned$TooLarge;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$NotAligned;", "captureInfo", "Lcom/incode/camera/analysis/document/CaptureInfo;", "(Lcom/incode/camera/analysis/document/CaptureInfo;)V", "getCaptureInfo", "()Lcom/incode/camera/analysis/document/CaptureInfo;", "description", "", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TooLarge implements NotAligned {
            private static int ProcessCameraProviderExtensionsKt = 0;
            private static int getAvailableCameraInternals = 1;
            private final CaptureInfo IncodeCamera;

            /* JADX INFO: renamed from: e1, reason: collision with root package name */
            private final String f3587e1;

            public TooLarge(CaptureInfo captureInfo) {
                Intrinsics.checkNotNullParameter(captureInfo, "");
                this.IncodeCamera = captureInfo;
                this.f3587e1 = "tooLarge";
            }

            @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
            public final CaptureInfo getCaptureInfo() {
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals + 47;
                int i4 = i3 % 128;
                ProcessCameraProviderExtensionsKt = i4;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CaptureInfo captureInfo = this.IncodeCamera;
                int i5 = i4 + 85;
                getAvailableCameraInternals = i5 % 128;
                int i6 = i5 % 2;
                return captureInfo;
            }

            @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent
            public final boolean isClassified() {
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals + 1;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                int i4 = i3 % 2;
                boolean zIsClassified = DefaultImpls.isClassified(this);
                int i5 = getAvailableCameraInternals + 51;
                ProcessCameraProviderExtensionsKt = i5 % 128;
                int i6 = i5 % 2;
                return zIsClassified;
            }

            @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
            public final String getDescription() {
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals + 123;
                int i4 = i3 % 128;
                ProcessCameraProviderExtensionsKt = i4;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                String str = this.f3587e1;
                int i5 = i4 + 93;
                getAvailableCameraInternals = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final boolean equals(Object other) {
                int i2 = 2 % 2;
                int i3 = ProcessCameraProviderExtensionsKt;
                int i4 = i3 + 105;
                getAvailableCameraInternals = i4 % 128;
                int i5 = i4 % 2;
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TooLarge)) {
                    int i6 = i3 + 85;
                    getAvailableCameraInternals = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.IncodeCamera, ((TooLarge) other).IncodeCamera)) {
                    return true;
                }
                int i8 = getAvailableCameraInternals + 89;
                ProcessCameraProviderExtensionsKt = i8 % 128;
                return i8 % 2 != 0;
            }

            public final int hashCode() {
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals + 49;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                int i4 = i3 % 2;
                CaptureInfo captureInfo = this.IncodeCamera;
                if (i4 == 0) {
                    return captureInfo.hashCode();
                }
                captureInfo.hashCode();
                throw null;
            }

            public final String toString() {
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals + 9;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                if (i3 % 2 == 0) {
                    return "TooLarge(captureInfo=" + this.IncodeCamera + ")";
                }
                int i4 = 50 / 0;
                return "TooLarge(captureInfo=" + this.IncodeCamera + ")";
            }

            public static /* synthetic */ TooLarge copy$default(TooLarge tooLarge, CaptureInfo captureInfo, int i2, Object obj) {
                int i3 = 2 % 2;
                int i4 = getAvailableCameraInternals;
                int i5 = i4 + 111;
                ProcessCameraProviderExtensionsKt = i5 % 128;
                if (i5 % 2 == 0 && (i2 & 1) != 0) {
                    captureInfo = tooLarge.IncodeCamera;
                    int i6 = i4 + 111;
                    ProcessCameraProviderExtensionsKt = i6 % 128;
                    int i7 = i6 % 2;
                }
                TooLarge tooLargeCopy = tooLarge.copy(captureInfo);
                int i8 = ProcessCameraProviderExtensionsKt + 11;
                getAvailableCameraInternals = i8 % 128;
                if (i8 % 2 != 0) {
                    return tooLargeCopy;
                }
                throw null;
            }

            public final TooLarge copy(CaptureInfo captureInfo) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(captureInfo, "");
                TooLarge tooLarge = new TooLarge(captureInfo);
                int i3 = getAvailableCameraInternals + 77;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                if (i3 % 2 == 0) {
                    return tooLarge;
                }
                throw null;
            }

            public final CaptureInfo component1() {
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals + 31;
                int i4 = i3 % 128;
                ProcessCameraProviderExtensionsKt = i4;
                int i5 = i3 % 2;
                CaptureInfo captureInfo = this.IncodeCamera;
                int i6 = i4 + 81;
                getAvailableCameraInternals = i6 % 128;
                if (i6 % 2 != 0) {
                    return captureInfo;
                }
                throw null;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$NotAligned$PartiallyVisible;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$NotAligned;", "captureInfo", "Lcom/incode/camera/analysis/document/CaptureInfo;", "(Lcom/incode/camera/analysis/document/CaptureInfo;)V", "getCaptureInfo", "()Lcom/incode/camera/analysis/document/CaptureInfo;", "description", "", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PartiallyVisible implements NotAligned {

            /* JADX INFO: renamed from: e1, reason: collision with root package name */
            private static int f3586e1 = 0;
            private static int getAvailableCameraInternals = 1;
            private final String CameraConstants;
            private final CaptureInfo ProcessCameraProviderExtensionsKt;

            public PartiallyVisible(CaptureInfo captureInfo) {
                Intrinsics.checkNotNullParameter(captureInfo, "");
                this.ProcessCameraProviderExtensionsKt = captureInfo;
                this.CameraConstants = "partiallyVisibleClassified";
            }

            @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
            public final CaptureInfo getCaptureInfo() {
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals;
                int i4 = i3 + 9;
                f3586e1 = i4 % 128;
                int i5 = i4 % 2;
                CaptureInfo captureInfo = this.ProcessCameraProviderExtensionsKt;
                int i6 = i3 + 45;
                f3586e1 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 29 / 0;
                }
                return captureInfo;
            }

            @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent
            public final boolean isClassified() {
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals + 75;
                f3586e1 = i3 % 128;
                int i4 = i3 % 2;
                boolean zIsClassified = DefaultImpls.isClassified(this);
                int i5 = getAvailableCameraInternals + 109;
                f3586e1 = i5 % 128;
                int i6 = i5 % 2;
                return zIsClassified;
            }

            @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
            public final String getDescription() {
                int i2 = 2 % 2;
                int i3 = f3586e1 + 79;
                int i4 = i3 % 128;
                getAvailableCameraInternals = i4;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                String str = this.CameraConstants;
                int i5 = i4 + 33;
                f3586e1 = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final boolean equals(Object other) {
                int i2 = 2 % 2;
                if (this == other) {
                    int i3 = f3586e1 + 107;
                    getAvailableCameraInternals = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
                if (!(other instanceof PartiallyVisible)) {
                    int i5 = f3586e1 + 39;
                    getAvailableCameraInternals = i5 % 128;
                    return i5 % 2 == 0;
                }
                if (!(!Intrinsics.areEqual(this.ProcessCameraProviderExtensionsKt, ((PartiallyVisible) other).ProcessCameraProviderExtensionsKt))) {
                    return true;
                }
                int i6 = f3586e1 + 63;
                getAvailableCameraInternals = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }

            public final int hashCode() {
                int i2 = 2 % 2;
                int i3 = f3586e1 + 7;
                getAvailableCameraInternals = i3 % 128;
                int i4 = i3 % 2;
                int iHashCode = this.ProcessCameraProviderExtensionsKt.hashCode();
                int i5 = f3586e1 + 69;
                getAvailableCameraInternals = i5 % 128;
                if (i5 % 2 != 0) {
                    return iHashCode;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String toString() {
                int i2 = 2 % 2;
                int i3 = getAvailableCameraInternals + 5;
                f3586e1 = i3 % 128;
                int i4 = i3 % 2;
                String str = "PartiallyVisible(captureInfo=" + this.ProcessCameraProviderExtensionsKt + ")";
                int i5 = getAvailableCameraInternals + 35;
                f3586e1 = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public static /* synthetic */ PartiallyVisible copy$default(PartiallyVisible partiallyVisible, CaptureInfo captureInfo, int i2, Object obj) {
                int i3 = 2 % 2;
                int i4 = f3586e1 + 99;
                int i5 = i4 % 128;
                getAvailableCameraInternals = i5;
                int i6 = i2 & 1;
                if (i4 % 2 != 0 ? i6 != 0 : i6 != 0) {
                    captureInfo = partiallyVisible.ProcessCameraProviderExtensionsKt;
                    int i7 = i5 + 13;
                    f3586e1 = i7 % 128;
                    int i8 = i7 % 2;
                }
                return partiallyVisible.copy(captureInfo);
            }

            public final PartiallyVisible copy(CaptureInfo captureInfo) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(captureInfo, "");
                PartiallyVisible partiallyVisible = new PartiallyVisible(captureInfo);
                int i3 = f3586e1 + 29;
                getAvailableCameraInternals = i3 % 128;
                if (i3 % 2 != 0) {
                    return partiallyVisible;
                }
                throw null;
            }

            public final CaptureInfo component1() {
                int i2 = 2 % 2;
                int i3 = f3586e1;
                int i4 = i3 + 43;
                getAvailableCameraInternals = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                CaptureInfo captureInfo = this.ProcessCameraProviderExtensionsKt;
                int i5 = i3 + 31;
                getAvailableCameraInternals = i5 % 128;
                if (i5 % 2 != 0) {
                    return captureInfo;
                }
                throw null;
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            private static int CameraConstants = 1;
            private static int ProcessCameraProviderExtensionsKt = 0;

            public static boolean isClassified(NotAligned notAligned) {
                int i2 = 2 % 2;
                int i3 = ProcessCameraProviderExtensionsKt + 5;
                CameraConstants = i3 % 128;
                int i4 = i3 % 2;
                boolean zIsClassified = AnalysisAbortEvent.DefaultImpls.isClassified(notAligned);
                int i5 = ProcessCameraProviderExtensionsKt + 59;
                CameraConstants = i5 % 128;
                if (i5 % 2 != 0) {
                    return zIsClassified;
                }
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$TooDark;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$AnalysisAbortEvent;", "captureInfo", "Lcom/incode/camera/analysis/document/CaptureInfo;", "(Lcom/incode/camera/analysis/document/CaptureInfo;)V", "getCaptureInfo", "()Lcom/incode/camera/analysis/document/CaptureInfo;", "description", "", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TooDark implements AnalysisAbortEvent {
        private static int IncodeCamera = 0;
        private static int ProcessCameraProviderExtensionsKt = 1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private final CaptureInfo f3589e1;
        private final String getAvailableCameraInternals;

        public TooDark(CaptureInfo captureInfo) {
            Intrinsics.checkNotNullParameter(captureInfo, "");
            this.f3589e1 = captureInfo;
            this.getAvailableCameraInternals = "tooDark";
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
        public final CaptureInfo getCaptureInfo() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 73;
            int i4 = i3 % 128;
            IncodeCamera = i4;
            int i5 = i3 % 2;
            CaptureInfo captureInfo = this.f3589e1;
            int i6 = i4 + 45;
            ProcessCameraProviderExtensionsKt = i6 % 128;
            int i7 = i6 % 2;
            return captureInfo;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent
        public final boolean isClassified() {
            boolean zIsClassified;
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 71;
            IncodeCamera = i3 % 128;
            if (i3 % 2 != 0) {
                zIsClassified = AnalysisAbortEvent.DefaultImpls.isClassified(this);
                int i4 = 82 / 0;
            } else {
                zIsClassified = AnalysisAbortEvent.DefaultImpls.isClassified(this);
            }
            int i5 = IncodeCamera + 95;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 82 / 0;
            }
            return zIsClassified;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
        public final String getDescription() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera;
            int i4 = i3 + 79;
            ProcessCameraProviderExtensionsKt = i4 % 128;
            int i5 = i4 % 2;
            String str = this.getAvailableCameraInternals;
            int i6 = i3 + 55;
            ProcessCameraProviderExtensionsKt = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public final boolean equals(Object other) {
            int i2 = 2 % 2;
            if (this == other) {
                int i3 = IncodeCamera + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                return i3 % 2 != 0;
            }
            if (!(other instanceof TooDark)) {
                int i4 = IncodeCamera + 47;
                ProcessCameraProviderExtensionsKt = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.f3589e1, ((TooDark) other).f3589e1)) {
                int i6 = ProcessCameraProviderExtensionsKt + 73;
                IncodeCamera = i6 % 128;
                return i6 % 2 != 0;
            }
            int i7 = IncodeCamera + 81;
            ProcessCameraProviderExtensionsKt = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 121;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            CaptureInfo captureInfo = this.f3589e1;
            if (i4 == 0) {
                return captureInfo.hashCode();
            }
            captureInfo.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 47;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            String str = "TooDark(captureInfo=" + this.f3589e1 + ")";
            int i5 = ProcessCameraProviderExtensionsKt + 107;
            IncodeCamera = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public static /* synthetic */ TooDark copy$default(TooDark tooDark, CaptureInfo captureInfo, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = IncodeCamera;
            int i5 = i4 + 41;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            int i6 = i5 % 2;
            if ((i2 & 1) != 0) {
                int i7 = i4 + 9;
                ProcessCameraProviderExtensionsKt = i7 % 128;
                int i8 = i7 % 2;
                captureInfo = tooDark.f3589e1;
            }
            return tooDark.copy(captureInfo);
        }

        public final TooDark copy(CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureInfo, "");
            TooDark tooDark = new TooDark(captureInfo);
            int i3 = IncodeCamera + 111;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 41 / 0;
            }
            return tooDark;
        }

        public final CaptureInfo component1() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 17;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f3589e1;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$Glare;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$AnalysisAbortEvent;", "captureInfo", "Lcom/incode/camera/analysis/document/CaptureInfo;", "(Lcom/incode/camera/analysis/document/CaptureInfo;)V", "getCaptureInfo", "()Lcom/incode/camera/analysis/document/CaptureInfo;", "description", "", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Glare implements AnalysisAbortEvent {
        private static int IncodeCamera = 1;
        private static int getAvailableCameraInternals = 0;
        private final String CameraConstants;
        private final CaptureInfo ProcessCameraProviderExtensionsKt;

        public Glare(CaptureInfo captureInfo) {
            Intrinsics.checkNotNullParameter(captureInfo, "");
            this.ProcessCameraProviderExtensionsKt = captureInfo;
            this.CameraConstants = "glareDetected";
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
        public final CaptureInfo getCaptureInfo() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera;
            int i4 = i3 + 43;
            getAvailableCameraInternals = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CaptureInfo captureInfo = this.ProcessCameraProviderExtensionsKt;
            int i5 = i3 + 25;
            getAvailableCameraInternals = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 47 / 0;
            }
            return captureInfo;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent
        public final boolean isClassified() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 103;
            getAvailableCameraInternals = i3 % 128;
            if (i3 % 2 == 0) {
                return AnalysisAbortEvent.DefaultImpls.isClassified(this);
            }
            AnalysisAbortEvent.DefaultImpls.isClassified(this);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
        public final String getDescription() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 121;
            int i4 = i3 % 128;
            getAvailableCameraInternals = i4;
            int i5 = i3 % 2;
            String str = this.CameraConstants;
            int i6 = i4 + 17;
            IncodeCamera = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 47 / 0;
            }
            return str;
        }

        public final boolean equals(Object other) {
            int i2 = 2 % 2;
            if (this == other) {
                int i3 = IncodeCamera + 103;
                getAvailableCameraInternals = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            if (!(other instanceof Glare)) {
                int i5 = IncodeCamera + 63;
                getAvailableCameraInternals = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.ProcessCameraProviderExtensionsKt, ((Glare) other).ProcessCameraProviderExtensionsKt)) {
                return true;
            }
            int i7 = IncodeCamera + 55;
            getAvailableCameraInternals = i7 % 128;
            return i7 % 2 != 0;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 111;
            IncodeCamera = i3 % 128;
            if (i3 % 2 == 0) {
                this.ProcessCameraProviderExtensionsKt.hashCode();
                throw null;
            }
            int iHashCode = this.ProcessCameraProviderExtensionsKt.hashCode();
            int i4 = IncodeCamera + 5;
            getAvailableCameraInternals = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 93;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            String str = "Glare(captureInfo=" + this.ProcessCameraProviderExtensionsKt + ")";
            int i5 = IncodeCamera + 125;
            getAvailableCameraInternals = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Glare copy$default(Glare glare, CaptureInfo captureInfo, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = getAvailableCameraInternals + 19;
            int i5 = i4 % 128;
            IncodeCamera = i5;
            if (i4 % 2 != 0 && (i2 & 1) != 0) {
                int i6 = i5 + 125;
                getAvailableCameraInternals = i6 % 128;
                if (i6 % 2 != 0) {
                    CaptureInfo captureInfo2 = glare.ProcessCameraProviderExtensionsKt;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                captureInfo = glare.ProcessCameraProviderExtensionsKt;
            }
            return glare.copy(captureInfo);
        }

        public final Glare copy(CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureInfo, "");
            Glare glare = new Glare(captureInfo);
            int i3 = IncodeCamera + 13;
            getAvailableCameraInternals = i3 % 128;
            int i4 = i3 % 2;
            return glare;
        }

        public final CaptureInfo component1() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera;
            int i4 = i3 + 81;
            getAvailableCameraInternals = i4 % 128;
            int i5 = i4 % 2;
            CaptureInfo captureInfo = this.ProcessCameraProviderExtensionsKt;
            int i6 = i3 + 69;
            getAvailableCameraInternals = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 0;
            }
            return captureInfo;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$Blur;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$AnalysisAbortEvent;", "captureInfo", "Lcom/incode/camera/analysis/document/CaptureInfo;", "(Lcom/incode/camera/analysis/document/CaptureInfo;)V", "getCaptureInfo", "()Lcom/incode/camera/analysis/document/CaptureInfo;", "description", "", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Blur implements AnalysisAbortEvent {

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static int f3581e1 = 0;
        private static int getAvailableCameraInternals = 1;
        private final String CameraConstants;
        private final CaptureInfo ProcessCameraProviderExtensionsKt;

        public Blur(CaptureInfo captureInfo) {
            Intrinsics.checkNotNullParameter(captureInfo, "");
            this.ProcessCameraProviderExtensionsKt = captureInfo;
            this.CameraConstants = "blurred";
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
        public final CaptureInfo getCaptureInfo() {
            int i2 = 2 % 2;
            int i3 = f3581e1 + 99;
            int i4 = i3 % 128;
            getAvailableCameraInternals = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CaptureInfo captureInfo = this.ProcessCameraProviderExtensionsKt;
            int i5 = i4 + 3;
            f3581e1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 24 / 0;
            }
            return captureInfo;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent
        public final boolean isClassified() {
            int i2 = 2 % 2;
            int i3 = f3581e1 + 1;
            getAvailableCameraInternals = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                AnalysisAbortEvent.DefaultImpls.isClassified(this);
                obj.hashCode();
                throw null;
            }
            boolean zIsClassified = AnalysisAbortEvent.DefaultImpls.isClassified(this);
            int i4 = f3581e1 + 49;
            getAvailableCameraInternals = i4 % 128;
            if (i4 % 2 != 0) {
                return zIsClassified;
            }
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
        public final String getDescription() {
            int i2 = 2 % 2;
            int i3 = f3581e1;
            int i4 = i3 + 17;
            getAvailableCameraInternals = i4 % 128;
            int i5 = i4 % 2;
            String str = this.CameraConstants;
            int i6 = i3 + 3;
            getAvailableCameraInternals = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public final boolean equals(Object other) {
            int i2 = 2 % 2;
            int i3 = f3581e1 + 55;
            int i4 = i3 % 128;
            getAvailableCameraInternals = i4;
            int i5 = i3 % 2;
            if (this == other) {
                int i6 = i4 + 71;
                f3581e1 = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (other instanceof Blur) {
                return Intrinsics.areEqual(this.ProcessCameraProviderExtensionsKt, ((Blur) other).ProcessCameraProviderExtensionsKt);
            }
            int i8 = i4 + 81;
            f3581e1 = i8 % 128;
            return i8 % 2 != 0;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f3581e1 + 11;
            getAvailableCameraInternals = i3 % 128;
            if (i3 % 2 == 0) {
                this.ProcessCameraProviderExtensionsKt.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.ProcessCameraProviderExtensionsKt.hashCode();
            int i4 = getAvailableCameraInternals + 13;
            f3581e1 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f3581e1 + 27;
            getAvailableCameraInternals = i3 % 128;
            int i4 = i3 % 2;
            String str = "Blur(captureInfo=" + this.ProcessCameraProviderExtensionsKt + ")";
            int i5 = getAvailableCameraInternals + 43;
            f3581e1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 84 / 0;
            }
            return str;
        }

        public static /* synthetic */ Blur copy$default(Blur blur, CaptureInfo captureInfo, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = getAvailableCameraInternals;
            int i5 = i4 + 125;
            f3581e1 = i5 % 128;
            int i6 = i5 % 2;
            if ((i2 & 1) != 0) {
                int i7 = i4 + 75;
                f3581e1 = i7 % 128;
                if (i7 % 2 != 0) {
                    CaptureInfo captureInfo2 = blur.ProcessCameraProviderExtensionsKt;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                captureInfo = blur.ProcessCameraProviderExtensionsKt;
                int i8 = i4 + 79;
                f3581e1 = i8 % 128;
                int i9 = i8 % 2;
            }
            return blur.copy(captureInfo);
        }

        public final Blur copy(CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(captureInfo, "");
            Blur blur = new Blur(captureInfo);
            int i3 = f3581e1 + 27;
            getAvailableCameraInternals = i3 % 128;
            int i4 = i3 % 2;
            return blur;
        }

        public final CaptureInfo component1() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals;
            int i4 = i3 + 33;
            f3581e1 = i4 % 128;
            int i5 = i4 % 2;
            CaptureInfo captureInfo = this.ProcessCameraProviderExtensionsKt;
            int i6 = i3 + 33;
            f3581e1 = i6 % 128;
            int i7 = i6 % 2;
            return captureInfo;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u000bHÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$Error;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$AnalysisAbortEvent;", SentryEvent.JsonKeys.EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "captureInfo", "Lcom/incode/camera/analysis/document/CaptureInfo;", "(Ljava/lang/Exception;Lcom/incode/camera/analysis/document/CaptureInfo;)V", "getCaptureInfo", "()Lcom/incode/camera/analysis/document/CaptureInfo;", "description", "", "getDescription", "()Ljava/lang/String;", "getException", "()Ljava/lang/Exception;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements AnalysisAbortEvent {
        private static int IncodeCamera = 0;
        private static int ProcessCameraProviderExtensionsKt = 1;
        private final Exception CameraConstants;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private final CaptureInfo f3584e1;
        private final String getAvailableCameraInternals;

        public Error(Exception exc, CaptureInfo captureInfo) {
            Intrinsics.checkNotNullParameter(exc, "");
            Intrinsics.checkNotNullParameter(captureInfo, "");
            this.CameraConstants = exc;
            this.f3584e1 = captureInfo;
            String message = exc.getMessage();
            this.getAvailableCameraInternals = message == null ? "Unknown error" : message;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
        public final CaptureInfo getCaptureInfo() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera;
            int i4 = i3 + 59;
            ProcessCameraProviderExtensionsKt = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            CaptureInfo captureInfo = this.f3584e1;
            int i5 = i3 + 97;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            if (i5 % 2 != 0) {
                return captureInfo;
            }
            throw null;
        }

        public final Exception getException() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 1;
            int i4 = i3 % 128;
            IncodeCamera = i4;
            int i5 = i3 % 2;
            Exception exc = this.CameraConstants;
            int i6 = i4 + 37;
            ProcessCameraProviderExtensionsKt = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 56 / 0;
            }
            return exc;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent
        public final boolean isClassified() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 11;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            boolean zIsClassified = AnalysisAbortEvent.DefaultImpls.isClassified(this);
            int i5 = IncodeCamera + 61;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            if (i5 % 2 != 0) {
                return zIsClassified;
            }
            throw null;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent.AnalysisAbortEvent
        public final String getDescription() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 79;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            String str = this.getAvailableCameraInternals;
            if (i4 == 0) {
                int i5 = 66 / 0;
            }
            return str;
        }

        public final boolean equals(Object other) {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 91;
            IncodeCamera = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            if (Intrinsics.areEqual(this.CameraConstants, error.CameraConstants)) {
                return Intrinsics.areEqual(this.f3584e1, error.f3584e1);
            }
            int i4 = ProcessCameraProviderExtensionsKt + 53;
            IncodeCamera = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 73;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int iHashCode = (i3 % 2 == 0 ? this.CameraConstants.hashCode() + 32 : this.CameraConstants.hashCode() * 31) + this.f3584e1.hashCode();
            int i4 = ProcessCameraProviderExtensionsKt + 69;
            IncodeCamera = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 1;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            if (i3 % 2 != 0) {
                return "Error(exception=" + this.CameraConstants + ", captureInfo=" + this.f3584e1 + ")";
            }
            int i4 = 33 / 0;
            return "Error(exception=" + this.CameraConstants + ", captureInfo=" + this.f3584e1 + ")";
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, CaptureInfo captureInfo, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = IncodeCamera + 29;
            int i5 = i4 % 128;
            ProcessCameraProviderExtensionsKt = i5;
            if (i4 % 2 != 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
                exc = error.CameraConstants;
            }
            if ((i2 & 2) != 0) {
                int i6 = i5 + 69;
                IncodeCamera = i6 % 128;
                int i7 = i6 % 2;
                captureInfo = error.f3584e1;
            }
            return error.copy(exc, captureInfo);
        }

        public final Error copy(Exception exception, CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(exception, "");
            Intrinsics.checkNotNullParameter(captureInfo, "");
            Error error = new Error(exception, captureInfo);
            int i3 = ProcessCameraProviderExtensionsKt + 115;
            IncodeCamera = i3 % 128;
            if (i3 % 2 == 0) {
                return error;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final CaptureInfo component2() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 13;
            int i4 = i3 % 128;
            ProcessCameraProviderExtensionsKt = i4;
            int i5 = i3 % 2;
            CaptureInfo captureInfo = this.f3584e1;
            int i6 = i4 + 61;
            IncodeCamera = i6 % 128;
            int i7 = i6 % 2;
            return captureInfo;
        }

        public final Exception component1() {
            Exception exc;
            int i2 = 2 % 2;
            int i3 = IncodeCamera;
            int i4 = i3 + 3;
            ProcessCameraProviderExtensionsKt = i4 % 128;
            if (i4 % 2 == 0) {
                exc = this.CameraConstants;
                int i5 = 62 / 0;
            } else {
                exc = this.CameraConstants;
            }
            int i6 = i3 + 73;
            ProcessCameraProviderExtensionsKt = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 8 / 0;
            }
            return exc;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$Orientation;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "isVertical", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Orientation implements DocumentAnalysisEvent {
        private static int IncodeCamera = 0;
        private static int ProcessCameraProviderExtensionsKt = 1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private final boolean f3588e1;

        public Orientation(boolean z2) {
            this.f3588e1 = z2;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent
        public final boolean isClassified() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 31;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            boolean zIsClassified = DefaultImpls.isClassified(this);
            int i5 = ProcessCameraProviderExtensionsKt + 73;
            IncodeCamera = i5 % 128;
            int i6 = i5 % 2;
            return zIsClassified;
        }

        public final boolean isVertical() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 113;
            int i4 = i3 % 128;
            ProcessCameraProviderExtensionsKt = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f3588e1;
            int i6 = i4 + 43;
            IncodeCamera = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final boolean equals(Object other) {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt;
            int i4 = i3 + 65;
            IncodeCamera = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof Orientation) {
                return this.f3588e1 == ((Orientation) other).f3588e1;
            }
            int i5 = i3 + 75;
            IncodeCamera = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 35;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = Boolean.hashCode(this.f3588e1);
            if (i4 == 0) {
                int i5 = 99 / 0;
            }
            return iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 23;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            String str = "Orientation(isVertical=" + this.f3588e1 + ")";
            int i5 = IncodeCamera + 47;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public static /* synthetic */ Orientation copy$default(Orientation orientation, boolean z2, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = IncodeCamera;
            int i5 = i4 + 83;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            int i6 = i5 % 2;
            if ((i2 & 1) != 0) {
                z2 = orientation.f3588e1;
                int i7 = i4 + 79;
                ProcessCameraProviderExtensionsKt = i7 % 128;
                int i8 = i7 % 2;
            }
            return orientation.copy(z2);
        }

        public final Orientation copy(boolean isVertical) {
            int i2 = 2 % 2;
            Orientation orientation = new Orientation(isVertical);
            int i3 = IncodeCamera + 61;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            return orientation;
        }

        public final boolean component1() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 71;
            int i4 = i3 % 128;
            IncodeCamera = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            boolean z2 = this.f3588e1;
            int i5 = i4 + 29;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            int i6 = i5 % 2;
            return z2;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$IdTypeExtracted;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "idType", "", "side", "Lcom/incode/camera/commons/utils/Side;", "(Ljava/lang/String;Lcom/incode/camera/commons/utils/Side;)V", "getIdType", "()Ljava/lang/String;", "getSide", "()Lcom/incode/camera/commons/utils/Side;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IdTypeExtracted implements DocumentAnalysisEvent {
        private static int ProcessCameraProviderExtensionsKt = 1;
        private static int getAvailableCameraInternals = 0;
        private final String CameraConstants;
        private final Side IncodeCamera;

        public IdTypeExtracted(String str, Side side) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(side, "");
            this.CameraConstants = str;
            this.IncodeCamera = side;
        }

        public final String getIdType() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 83;
            int i4 = i3 % 128;
            ProcessCameraProviderExtensionsKt = i4;
            int i5 = i3 % 2;
            String str = this.CameraConstants;
            int i6 = i4 + 35;
            getAvailableCameraInternals = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final Side getSide() {
            Side side;
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals;
            int i4 = i3 + 45;
            ProcessCameraProviderExtensionsKt = i4 % 128;
            if (i4 % 2 == 0) {
                side = this.IncodeCamera;
                int i5 = 93 / 0;
            } else {
                side = this.IncodeCamera;
            }
            int i6 = i3 + 95;
            ProcessCameraProviderExtensionsKt = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 73 / 0;
            }
            return side;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent
        public final boolean isClassified() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 47;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                DefaultImpls.isClassified(this);
                obj.hashCode();
                throw null;
            }
            boolean zIsClassified = DefaultImpls.isClassified(this);
            int i4 = ProcessCameraProviderExtensionsKt + 25;
            getAvailableCameraInternals = i4 % 128;
            if (i4 % 2 == 0) {
                return zIsClassified;
            }
            throw null;
        }

        public final boolean equals(Object other) {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 1;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdTypeExtracted)) {
                return false;
            }
            IdTypeExtracted idTypeExtracted = (IdTypeExtracted) other;
            if (!Intrinsics.areEqual(this.CameraConstants, idTypeExtracted.CameraConstants)) {
                int i5 = ProcessCameraProviderExtensionsKt + 87;
                getAvailableCameraInternals = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (this.IncodeCamera == idTypeExtracted.IncodeCamera) {
                return true;
            }
            int i7 = getAvailableCameraInternals + 113;
            ProcessCameraProviderExtensionsKt = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 85;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = this.CameraConstants.hashCode();
            return i4 == 0 ? (iHashCode - 45) >>> this.IncodeCamera.hashCode() : (iHashCode * 31) + this.IncodeCamera.hashCode();
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 39;
            getAvailableCameraInternals = i3 % 128;
            if (i3 % 2 == 0) {
                return "IdTypeExtracted(idType=" + this.CameraConstants + ", side=" + this.IncodeCamera + ")";
            }
            int i4 = 78 / 0;
            return "IdTypeExtracted(idType=" + this.CameraConstants + ", side=" + this.IncodeCamera + ")";
        }

        public static /* synthetic */ IdTypeExtracted copy$default(IdTypeExtracted idTypeExtracted, String str, Side side, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = getAvailableCameraInternals + 87;
            ProcessCameraProviderExtensionsKt = i4 % 128;
            int i5 = i4 % 2;
            if ((i2 & 1) != 0) {
                str = idTypeExtracted.CameraConstants;
            }
            if ((i2 & 2) != 0) {
                side = idTypeExtracted.IncodeCamera;
            }
            IdTypeExtracted idTypeExtractedCopy = idTypeExtracted.copy(str, side);
            int i6 = ProcessCameraProviderExtensionsKt + 99;
            getAvailableCameraInternals = i6 % 128;
            int i7 = i6 % 2;
            return idTypeExtractedCopy;
        }

        public final IdTypeExtracted copy(String idType, Side side) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(idType, "");
            Intrinsics.checkNotNullParameter(side, "");
            IdTypeExtracted idTypeExtracted = new IdTypeExtracted(idType, side);
            int i3 = ProcessCameraProviderExtensionsKt + 41;
            getAvailableCameraInternals = i3 % 128;
            if (i3 % 2 == 0) {
                return idTypeExtracted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Side component2() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt;
            int i4 = i3 + 97;
            getAvailableCameraInternals = i4 % 128;
            int i5 = i4 % 2;
            Side side = this.IncodeCamera;
            int i6 = i3 + 39;
            getAvailableCameraInternals = i6 % 128;
            int i7 = i6 % 2;
            return side;
        }

        public final String component1() {
            int i2 = 2 % 2;
            int i3 = getAvailableCameraInternals + 101;
            int i4 = i3 % 128;
            ProcessCameraProviderExtensionsKt = i4;
            int i5 = i3 % 2;
            String str = this.CameraConstants;
            int i6 = i4 + 79;
            getAvailableCameraInternals = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 30 / 0;
            }
            return str;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$BoundsDetected;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", "documentSide", "Lcom/incode/camera/commons/utils/Side;", "(Lcom/incode/camera/commons/utils/Side;)V", "getDocumentSide", "()Lcom/incode/camera/commons/utils/Side;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BoundsDetected implements DocumentAnalysisEvent {
        private static int IncodeCamera = 1;
        private static int ProcessCameraProviderExtensionsKt = 0;
        private final Side getAvailableCameraInternals;

        public BoundsDetected(Side side) {
            Intrinsics.checkNotNullParameter(side, "");
            this.getAvailableCameraInternals = side;
        }

        public final Side getDocumentSide() {
            Side side;
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 13;
            int i4 = i3 % 128;
            ProcessCameraProviderExtensionsKt = i4;
            if (i3 % 2 != 0) {
                side = this.getAvailableCameraInternals;
                int i5 = 75 / 0;
            } else {
                side = this.getAvailableCameraInternals;
            }
            int i6 = i4 + 97;
            IncodeCamera = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 1 / 0;
            }
            return side;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent
        public final boolean isClassified() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 15;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            boolean zIsClassified = DefaultImpls.isClassified(this);
            if (i4 == 0) {
                int i5 = 21 / 0;
            }
            return zIsClassified;
        }

        public final boolean equals(Object other) {
            int i2 = 2 % 2;
            if (this == other) {
                int i3 = IncodeCamera + 17;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 62 / 0;
                }
                return true;
            }
            if (!(other instanceof BoundsDetected)) {
                return false;
            }
            if (this.getAvailableCameraInternals != ((BoundsDetected) other).getAvailableCameraInternals) {
                int i5 = ProcessCameraProviderExtensionsKt + 79;
                IncodeCamera = i5 % 128;
                return i5 % 2 == 0;
            }
            int i6 = ProcessCameraProviderExtensionsKt + 35;
            IncodeCamera = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 80 / 0;
            }
            return true;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 117;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = this.getAvailableCameraInternals.hashCode();
            if (i4 == 0) {
                int i5 = 56 / 0;
            }
            return iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 79;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            if (i3 % 2 == 0) {
                return "BoundsDetected(documentSide=" + this.getAvailableCameraInternals + ")";
            }
            int i4 = 30 / 0;
            return "BoundsDetected(documentSide=" + this.getAvailableCameraInternals + ")";
        }

        public static /* synthetic */ BoundsDetected copy$default(BoundsDetected boundsDetected, Side side, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = IncodeCamera + 101;
            ProcessCameraProviderExtensionsKt = i4 % 128;
            int i5 = i2 & 1;
            if (i4 % 2 == 0 ? i5 != 0 : i5 != 0) {
                side = boundsDetected.getAvailableCameraInternals;
            }
            BoundsDetected boundsDetectedCopy = boundsDetected.copy(side);
            int i6 = IncodeCamera + 87;
            ProcessCameraProviderExtensionsKt = i6 % 128;
            int i7 = i6 % 2;
            return boundsDetectedCopy;
        }

        public final BoundsDetected copy(Side documentSide) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(documentSide, "");
            BoundsDetected boundsDetected = new BoundsDetected(documentSide);
            int i3 = ProcessCameraProviderExtensionsKt + 29;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            return boundsDetected;
        }

        public final Side component1() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera;
            int i4 = i3 + 65;
            ProcessCameraProviderExtensionsKt = i4 % 128;
            int i5 = i4 % 2;
            Side side = this.getAvailableCameraInternals;
            int i6 = i3 + 49;
            ProcessCameraProviderExtensionsKt = i6 % 128;
            if (i6 % 2 == 0) {
                return side;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/incode/camera/analysis/document/DocumentAnalysisEvent$CaptureCandidateGenerated;", "Lcom/incode/camera/analysis/document/DocumentAnalysisEvent;", FeatureFlag.PROPERTIES_TYPE_IMAGE, "Landroid/graphics/Bitmap;", "captureInfo", "Lcom/incode/camera/analysis/document/CaptureInfo;", "(Landroid/graphics/Bitmap;Lcom/incode/camera/analysis/document/CaptureInfo;)V", "getCaptureInfo", "()Lcom/incode/camera/analysis/document/CaptureInfo;", "croppedDocumentImage", "getCroppedDocumentImage", "()Landroid/graphics/Bitmap;", "croppedDocumentImage$delegate", "Lkotlin/Lazy;", "getImage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CaptureCandidateGenerated implements DocumentAnalysisEvent {
        private static int IncodeCamera = 0;
        private static int ProcessCameraProviderExtensionsKt = 1;
        private final Bitmap CameraConstants;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private final CaptureInfo f3582e1;
        private final Lazy getAvailableCameraInternals;

        public CaptureCandidateGenerated(Bitmap bitmap, CaptureInfo captureInfo) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            Intrinsics.checkNotNullParameter(captureInfo, "");
            this.CameraConstants = bitmap;
            this.f3582e1 = captureInfo;
            this.getAvailableCameraInternals = LazyKt.lazy(new Function0<Bitmap>() { // from class: com.incode.camera.analysis.document.DocumentAnalysisEvent$CaptureCandidateGenerated$croppedDocumentImage$2

                /* JADX INFO: renamed from: e1, reason: collision with root package name */
                private static int f3583e1 = 0;
                private static int getAvailableCameraInternals = 1;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Bitmap invoke() {
                    int i2 = 2 % 2;
                    int i3 = getAvailableCameraInternals + 3;
                    f3583e1 = i3 % 128;
                    int i4 = i3 % 2;
                    Bitmap bitmapExtract = IdentityDocumentExtractor.INSTANCE.extract(this.CameraConstants.getCaptureInfo().getQuad(), this.CameraConstants.getImage());
                    int i5 = f3583e1 + 67;
                    getAvailableCameraInternals = i5 % 128;
                    int i6 = i5 % 2;
                    return bitmapExtract;
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Bitmap invoke() {
                    int i2 = 2 % 2;
                    int i3 = getAvailableCameraInternals + 49;
                    f3583e1 = i3 % 128;
                    if (i3 % 2 == 0) {
                        return invoke();
                    }
                    invoke();
                    throw null;
                }

                {
                    super(0);
                }
            });
        }

        public final CaptureInfo getCaptureInfo() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 93;
            int i4 = i3 % 128;
            ProcessCameraProviderExtensionsKt = i4;
            int i5 = i3 % 2;
            CaptureInfo captureInfo = this.f3582e1;
            int i6 = i4 + 69;
            IncodeCamera = i6 % 128;
            int i7 = i6 % 2;
            return captureInfo;
        }

        public final Bitmap getImage() {
            Bitmap bitmap;
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 85;
            int i4 = i3 % 128;
            IncodeCamera = i4;
            if (i3 % 2 != 0) {
                bitmap = this.CameraConstants;
                int i5 = 26 / 0;
            } else {
                bitmap = this.CameraConstants;
            }
            int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            ProcessCameraProviderExtensionsKt = i6 % 128;
            int i7 = i6 % 2;
            return bitmap;
        }

        @Override // com.incode.camera.analysis.document.DocumentAnalysisEvent
        public final boolean isClassified() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 73;
            IncodeCamera = i3 % 128;
            if (i3 % 2 != 0) {
                DefaultImpls.isClassified(this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean zIsClassified = DefaultImpls.isClassified(this);
            int i4 = IncodeCamera + 39;
            ProcessCameraProviderExtensionsKt = i4 % 128;
            int i5 = i4 % 2;
            return zIsClassified;
        }

        public final Bitmap getCroppedDocumentImage() {
            Bitmap bitmap;
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 97;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            if (i3 % 2 == 0) {
                bitmap = (Bitmap) this.getAvailableCameraInternals.getValue();
                int i4 = 13 / 0;
            } else {
                bitmap = (Bitmap) this.getAvailableCameraInternals.getValue();
            }
            int i5 = IncodeCamera + 47;
            ProcessCameraProviderExtensionsKt = i5 % 128;
            if (i5 % 2 != 0) {
                return bitmap;
            }
            throw null;
        }

        public final boolean equals(Object other) {
            int i2 = 2 % 2;
            if (this == other) {
                int i3 = IncodeCamera + 25;
                ProcessCameraProviderExtensionsKt = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            if (other instanceof CaptureCandidateGenerated) {
                CaptureCandidateGenerated captureCandidateGenerated = (CaptureCandidateGenerated) other;
                return Intrinsics.areEqual(this.CameraConstants, captureCandidateGenerated.CameraConstants) && Intrinsics.areEqual(this.f3582e1, captureCandidateGenerated.f3582e1);
            }
            int i5 = IncodeCamera;
            int i6 = i5 + 51;
            ProcessCameraProviderExtensionsKt = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 49;
            ProcessCameraProviderExtensionsKt = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 43 / 0;
            }
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 9;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = (this.CameraConstants.hashCode() * 31) + this.f3582e1.hashCode();
            int i5 = ProcessCameraProviderExtensionsKt + 107;
            IncodeCamera = i5 % 128;
            int i6 = i5 % 2;
            return iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 35;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            String str = "CaptureCandidateGenerated(image=" + this.CameraConstants + ", captureInfo=" + this.f3582e1 + ")";
            int i5 = ProcessCameraProviderExtensionsKt + 3;
            IncodeCamera = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static /* synthetic */ CaptureCandidateGenerated copy$default(CaptureCandidateGenerated captureCandidateGenerated, Bitmap bitmap, CaptureInfo captureInfo, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = ProcessCameraProviderExtensionsKt;
            int i5 = i4 + 81;
            IncodeCamera = i5 % 128;
            int i6 = i5 % 2;
            if ((i2 & 1) != 0) {
                int i7 = i4 + 69;
                int i8 = i7 % 128;
                IncodeCamera = i8;
                int i9 = i7 % 2;
                bitmap = captureCandidateGenerated.CameraConstants;
                int i10 = i8 + 113;
                ProcessCameraProviderExtensionsKt = i10 % 128;
                int i11 = i10 % 2;
            }
            if ((i2 & 2) != 0) {
                int i12 = IncodeCamera;
                int i13 = i12 + 91;
                ProcessCameraProviderExtensionsKt = i13 % 128;
                if (i13 % 2 == 0) {
                    CaptureInfo captureInfo2 = captureCandidateGenerated.f3582e1;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                captureInfo = captureCandidateGenerated.f3582e1;
                int i14 = i12 + 37;
                ProcessCameraProviderExtensionsKt = i14 % 128;
                int i15 = i14 % 2;
            }
            CaptureCandidateGenerated captureCandidateGeneratedCopy = captureCandidateGenerated.copy(bitmap, captureInfo);
            int i16 = IncodeCamera + 29;
            ProcessCameraProviderExtensionsKt = i16 % 128;
            int i17 = i16 % 2;
            return captureCandidateGeneratedCopy;
        }

        public final CaptureCandidateGenerated copy(Bitmap image, CaptureInfo captureInfo) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(image, "");
            Intrinsics.checkNotNullParameter(captureInfo, "");
            CaptureCandidateGenerated captureCandidateGenerated = new CaptureCandidateGenerated(image, captureInfo);
            int i3 = ProcessCameraProviderExtensionsKt + 109;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            return captureCandidateGenerated;
        }

        public final CaptureInfo component2() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 21;
            int i4 = i3 % 128;
            IncodeCamera = i4;
            int i5 = i3 % 2;
            CaptureInfo captureInfo = this.f3582e1;
            int i6 = i4 + 113;
            ProcessCameraProviderExtensionsKt = i6 % 128;
            if (i6 % 2 != 0) {
                return captureInfo;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Bitmap component1() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt;
            int i4 = i3 + 53;
            IncodeCamera = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            Bitmap bitmap = this.CameraConstants;
            int i5 = i3 + 13;
            IncodeCamera = i5 % 128;
            if (i5 % 2 == 0) {
                return bitmap;
            }
            throw null;
        }
    }
}
