package com.incode.camera;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.lifecycle.ProcessCameraProviderExtensionsKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.IncodeCamera;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0002\u0010\u001aJ$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J#\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b'J8\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0003J\b\u0010,\u001a\u00020-H\u0007J\b\u0010.\u001a\u00020-H\u0007J3\u0010/\u001a\u0002002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0012\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u00020302\"\u000203H\u0001¢\u0006\u0004\b4\u00105J,\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015H\u0002J\b\u00108\u001a\u00020-H\u0007J\b\u00109\u001a\u00020-H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006:"}, d2 = {"Lcom/incode/camera/IncodeCameraConfigurator;", "", "()V", "IDEAL_MAX_FRAME_RATE", "", "IDEAL_MIN_FRAME_RATE", "RATIO_16_9", "", "RATIO_4_3", "RATIO_TOLERANCE", "UPPER_RESOLUTION_BOUND_1080P", "UPPER_RESOLUTION_BOUND_720P", "analysisUpTo720pUsingPreviewRatioResolutionFilter", "Landroidx/camera/core/resolutionselector/ResolutionFilter;", "exactly720pResolutionFilter", "idCaptureResolutionFilter", "previewRatio", "previewUpTo720p16x9Or4x3ResolutionFilter", "getPreviewUpTo720p16x9Or4x3ResolutionFilter$core_light_release", "()Landroidx/camera/core/resolutionselector/ResolutionFilter;", "determineClosestRangeToConstraints", "Landroid/util/Range;", "closestLowerBound", "cameraInfo", "Landroidx/camera/core/impl/CameraInfoInternal;", "closestUpperBound", "(Ljava/lang/Integer;Landroidx/camera/core/impl/CameraInfoInternal;Ljava/lang/Integer;)Landroid/util/Range;", "filterAndSortByAspectRatioMax720p", "", "Landroid/util/Size;", "sizes", "targetRatio", "getAllCamerasFacingConfiguredDirection", "Landroidx/camera/core/impl/CameraInternal;", "config", "Lcom/incode/camera/IncodeCamera$Config;", "processCameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "getOptimalFrameRateRange", "getOptimalFrameRateRange$core_light_release", "getOptimalFrameRateRangeForTheseConstraints", "currentOptimalRange", "upperBound", "lowerBound", "idCaptureAnalysisResolutionSelector", "Landroidx/camera/core/resolutionselector/ResolutionSelector;", "idCapturePreviewResolutionSelector", "isUseCaseCombinationSupported", "", "useCases", "", "Landroidx/camera/core/UseCase;", "isUseCaseCombinationSupported$core_light_release", "(Lcom/incode/camera/IncodeCamera$Config;Landroidx/camera/lifecycle/ProcessCameraProvider;[Landroidx/camera/core/UseCase;)Z", "saveResultWithWiderRange", "currentBestRange", "selfieAnalysisResolutionSelector", "selfiePreviewResolutionSelector", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IncodeCameraConfigurator {

    /* JADX INFO: renamed from: e1 */
    private static int f3565e1 = 0;
    private static int getConfig = 0;
    private static int getPreviewView = 1;
    private static int setConfig = 1;
    public static final IncodeCameraConfigurator INSTANCE = new IncodeCameraConfigurator();
    private static float CameraConstants = 1.7777778f;
    private static final ResolutionFilter ProcessCameraProviderExtensionsKt = new ResolutionFilter() { // from class: com.incode.camera.IncodeCameraConfigurator$$ExternalSyntheticLambda0
        @Override // androidx.camera.core.resolutionselector.ResolutionFilter
        public final List filter(List list, int i2) {
            return IncodeCameraConfigurator.ProcessCameraProviderExtensionsKt(list, i2);
        }
    };
    private static final ResolutionFilter IncodeCamera = new ResolutionFilter() { // from class: com.incode.camera.IncodeCameraConfigurator$$ExternalSyntheticLambda1
        @Override // androidx.camera.core.resolutionselector.ResolutionFilter
        public final List filter(List list, int i2) {
            return IncodeCameraConfigurator.e1(list, i2);
        }
    };
    private static final ResolutionFilter getAvailableCameraInternals = new ResolutionFilter() { // from class: com.incode.camera.IncodeCameraConfigurator$$ExternalSyntheticLambda2
        @Override // androidx.camera.core.resolutionselector.ResolutionFilter
        public final List filter(List list, int i2) {
            return IncodeCameraConfigurator.IncodeCamera(list, i2);
        }
    };

    private IncodeCameraConfigurator() {
    }

    static {
        int i2 = getConfig + 9;
        setConfig = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final List ProcessCameraProviderExtensionsKt(List list, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        List list2 = list;
        Timber.Forest.d("Supported camera resolutions: " + CollectionsKt.joinToString$default(list2, ", ", null, null, 0, null, null, 62, null), new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            Size size = (Size) obj;
            int iMax = Math.max(size.getHeight(), size.getWidth());
            if (Math.abs(1.7777778f - (iMax / Math.min(size.getHeight(), size.getWidth()))) < 0.1f) {
                int i4 = f3565e1 + 89;
                int i5 = i4 % 128;
                getPreviewView = i5;
                int i6 = i4 % 2;
                if (iMax <= 1920) {
                    int i7 = i5 + 97;
                    f3565e1 = i7 % 128;
                    if (i7 % 2 == 0) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.incode.camera.IncodeCameraConfigurator$idCaptureResolutionFilter$lambda$3$$inlined$sortedByDescending$1
            private static int IncodeCamera = 1;
            private static int getAvailableCameraInternals = 0;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                Integer numValueOf;
                int width;
                int i8 = 2 % 2;
                int i9 = getAvailableCameraInternals + 95;
                IncodeCamera = i9 % 128;
                Size size2 = (Size) t3;
                if (i9 % 2 == 0) {
                    numValueOf = Integer.valueOf(size2.getWidth() * size2.getHeight());
                    Size size3 = (Size) t2;
                    width = size3.getWidth() * size3.getHeight();
                } else {
                    numValueOf = Integer.valueOf(size2.getWidth() + size2.getHeight());
                    Size size4 = (Size) t2;
                    width = size4.getWidth() + size4.getHeight();
                }
                return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(width));
            }
        });
        Timber.Forest.d("Requested camera resolutions: " + CollectionsKt.joinToString$default(listSortedWith, ", ", null, null, 0, null, null, 62, null), new Object[0]);
        return listSortedWith;
    }

    private static final boolean IncodeCamera(float f2, float f3) {
        int i2 = 2 % 2;
        int i3 = getPreviewView + 81;
        f3565e1 = i3 % 128;
        if (i3 % 2 != 0) {
            if (Math.abs(f2 % f3) < 0.1f) {
                return true;
            }
        } else if (Math.abs(f2 - f3) < 0.1f) {
            return true;
        }
        int i4 = getPreviewView + 11;
        f3565e1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private static List<Size> e1(List<Size> list, float f2) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (!(!it.hasNext())) {
            Object next = it.next();
            Size size = (Size) next;
            int iMax = Math.max(size.getWidth(), size.getHeight());
            if (IncodeCamera(iMax / Math.min(size.getWidth(), size.getHeight()), f2)) {
                int i3 = getPreviewView + 61;
                f3565e1 = i3 % 128;
                int i4 = i3 % 2;
                if (iMax <= 1280) {
                    arrayList.add(next);
                }
            }
            int i5 = f3565e1 + 65;
            getPreviewView = i5 % 128;
            int i6 = i5 % 2;
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.incode.camera.IncodeCameraConfigurator$filterAndSortByAspectRatioMax720p$$inlined$sortedByDescending$1
            private static int CameraConstants = 0;

            /* JADX INFO: renamed from: e1, reason: collision with root package name */
            private static int f3566e1 = 1;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                Integer numValueOf;
                int width;
                int i7 = 2 % 2;
                int i8 = CameraConstants + 89;
                f3566e1 = i8 % 128;
                Size size2 = (Size) t3;
                if (i8 % 2 == 0) {
                    numValueOf = Integer.valueOf(size2.getWidth() >> size2.getHeight());
                    Size size3 = (Size) t2;
                    width = size3.getWidth() - size3.getHeight();
                } else {
                    numValueOf = Integer.valueOf(size2.getWidth() + size2.getHeight());
                    Size size4 = (Size) t2;
                    width = size4.getWidth() + size4.getHeight();
                }
                int iCompareValues = ComparisonsKt.compareValues(numValueOf, Integer.valueOf(width));
                int i9 = CameraConstants + 117;
                f3566e1 = i9 % 128;
                if (i9 % 2 != 0) {
                    return iCompareValues;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    public final ResolutionFilter getPreviewUpTo720p16x9Or4x3ResolutionFilter$core_light_release() {
        int i2 = 2 % 2;
        int i3 = getPreviewView;
        int i4 = i3 + 65;
        f3565e1 = i4 % 128;
        int i5 = i4 % 2;
        ResolutionFilter resolutionFilter = IncodeCamera;
        int i6 = i3 + 97;
        f3565e1 = i6 % 128;
        if (i6 % 2 == 0) {
            return resolutionFilter;
        }
        throw null;
    }

    public static final List e1(List list, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Timber.Forest.d("Supported camera resolutions: " + CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, null, 62, null), new Object[0]);
        List<Size> listE1 = e1((List<Size>) list, 1.7777778f);
        if (!(!listE1.isEmpty())) {
            List<Size> listE12 = e1((List<Size>) list, 1.3333334f);
            CameraConstants = 1.3333334f;
            Timber.Forest.d("Fallback 4:3 camera resolutions: " + CollectionsKt.joinToString$default(listE12, ", ", null, null, 0, null, null, 62, null), new Object[0]);
            return listE12;
        }
        int i4 = f3565e1;
        int i5 = i4 + 3;
        getPreviewView = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 77;
        getPreviewView = i7 % 128;
        int i8 = i7 % 2;
        Timber.Forest.d("Picked 16:9 camera resolutions: " + CollectionsKt.joinToString$default(listE1, ", ", null, null, 0, null, null, 62, null), new Object[0]);
        return listE1;
    }

    public static final List IncodeCamera(List list, int i2) {
        int i3 = 2 % 2;
        int i4 = f3565e1 + 13;
        getPreviewView = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Timber.Forest.d("Supported camera resolutions: " + CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, null, 62, null), new Object[0]);
        List<Size> listE1 = e1((List<Size>) list, CameraConstants);
        Timber.Forest.d("Requested camera resolutions: " + CollectionsKt.joinToString$default(listE1, ", ", null, null, 0, null, null, 62, null), new Object[0]);
        int i6 = getPreviewView + 97;
        f3565e1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 69 / 0;
        }
        return listE1;
    }

    @JvmStatic
    public static final ResolutionSelector idCapturePreviewResolutionSelector() {
        int i2 = 2 % 2;
        ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setAspectRatioStrategy(AspectRatioStrategy.RATIO_16_9_FALLBACK_AUTO_STRATEGY).setAllowedResolutionMode(1).build();
        Intrinsics.checkNotNullExpressionValue(resolutionSelectorBuild, "");
        int i3 = f3565e1 + 39;
        getPreviewView = i3 % 128;
        int i4 = i3 % 2;
        return resolutionSelectorBuild;
    }

    @JvmStatic
    public static final ResolutionSelector idCaptureAnalysisResolutionSelector() {
        int i2 = 2 % 2;
        ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setResolutionFilter(ProcessCameraProviderExtensionsKt).build();
        Intrinsics.checkNotNullExpressionValue(resolutionSelectorBuild, "");
        int i3 = f3565e1 + 95;
        getPreviewView = i3 % 128;
        if (i3 % 2 != 0) {
            return resolutionSelectorBuild;
        }
        throw null;
    }

    @JvmStatic
    public static final ResolutionSelector selfiePreviewResolutionSelector() {
        int i2 = 2 % 2;
        ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setResolutionFilter(IncodeCamera).build();
        Intrinsics.checkNotNullExpressionValue(resolutionSelectorBuild, "");
        int i3 = f3565e1 + 15;
        getPreviewView = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 12 / 0;
        }
        return resolutionSelectorBuild;
    }

    @JvmStatic
    public static final ResolutionSelector selfieAnalysisResolutionSelector() {
        int i2 = 2 % 2;
        ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setResolutionFilter(getAvailableCameraInternals).build();
        Intrinsics.checkNotNullExpressionValue(resolutionSelectorBuild, "");
        int i3 = getPreviewView + 103;
        f3565e1 = i3 % 128;
        int i4 = i3 % 2;
        return resolutionSelectorBuild;
    }

    @JvmStatic
    public static final boolean isUseCaseCombinationSupported$core_light_release(IncodeCamera.Config config, ProcessCameraProvider processCameraProvider, UseCase... useCases) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(config, "");
        Intrinsics.checkNotNullParameter(processCameraProvider, "");
        Intrinsics.checkNotNullParameter(useCases, "");
        Iterator<CameraInternal> it = CameraConstants(config, processCameraProvider).iterator();
        while (it.hasNext()) {
            int i3 = f3565e1 + 61;
            getPreviewView = i3 % 128;
            int i4 = i3 % 2;
            if (it.next().isUseCasesCombinationSupported((UseCase[]) Arrays.copyOf(useCases, useCases.length))) {
                int i5 = getPreviewView + 41;
                f3565e1 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        int i7 = getPreviewView + 91;
        f3565e1 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    private static List<CameraInternal> CameraConstants(IncodeCamera.Config config, ProcessCameraProvider processCameraProvider) {
        int i2 = 2 % 2;
        List<CameraInternal> availableCameraInternals = ProcessCameraProviderExtensionsKt.getAvailableCameraInternals(processCameraProvider);
        ArrayList arrayList = new ArrayList();
        int i3 = f3565e1 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        getPreviewView = i3 % 128;
        int i4 = i3 % 2;
        for (CameraInternal cameraInternal : availableCameraInternals) {
            int i5 = getPreviewView + 23;
            f3565e1 = i5 % 128;
            int i6 = i5 % 2;
            if (cameraInternal.getCameraInfo().getLensFacing() == config.getCameraSelector().camXLensFacing()) {
                arrayList.add(cameraInternal);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x00ac  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.util.Range<java.lang.Integer> getOptimalFrameRateRange$core_light_release(com.incode.camera.IncodeCamera.Config r15, androidx.camera.lifecycle.ProcessCameraProvider r16) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.camera.IncodeCameraConfigurator.getOptimalFrameRateRange$core_light_release(com.incode.camera.IncodeCamera$Config, androidx.camera.lifecycle.ProcessCameraProvider):android.util.Range");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0040, code lost:
    
        if (r2.intValue() == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Range<java.lang.Integer> IncodeCamera(android.util.Range<java.lang.Integer> r5, androidx.camera.core.impl.CameraInfoInternal r6, int r7, int r8) {
        /*
            r4 = 2
            int r0 = r4 % r4
            if (r5 == 0) goto L63
            java.lang.Object r1 = r6.getCameraCharacteristics()
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)
            android.hardware.camera2.CameraCharacteristics r1 = (android.hardware.camera2.CameraCharacteristics) r1
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r2 = r1.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L33
            int r0 = com.incode.camera.IncodeCameraConfigurator.getPreviewView
            int r1 = r0 + 29
            int r0 = r1 % 128
            com.incode.camera.IncodeCameraConfigurator.f3565e1 = r0
            int r1 = r1 % r4
        L23:
            if (r2 != 0) goto L3b
            int r0 = com.incode.camera.IncodeCameraConfigurator.f3565e1
            int r1 = r0 + 45
            int r0 = r1 % 128
            com.incode.camera.IncodeCameraConfigurator.getPreviewView = r0
            int r1 = r1 % r4
        L2e:
            android.util.Range r5 = ProcessCameraProviderExtensionsKt(r7, r8, r5)
        L32:
            return r5
        L33:
            int r1 = r2.intValue()
            r0 = 1
            if (r1 == r0) goto L42
            goto L23
        L3b:
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L2e
        L42:
            java.lang.Comparable r0 = r5.getUpper()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 >= r7) goto L79
            android.util.Range r5 = new android.util.Range
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            r5.<init>(r1, r0)
            goto L32
        L63:
            android.util.Range r5 = new android.util.Range
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            r5.<init>(r1, r0)
            int r0 = com.incode.camera.IncodeCameraConfigurator.f3565e1
            int r1 = r0 + 101
            goto L8c
        L79:
            java.lang.Comparable r0 = r5.getUpper()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L92
            int r2 = com.incode.camera.IncodeCameraConfigurator.f3565e1
            int r1 = r2 + 3
            int r0 = r1 % 128
            com.incode.camera.IncodeCameraConfigurator.getPreviewView = r0
            int r1 = r1 % r4
            int r1 = r2 + 71
        L8c:
            int r0 = r1 % 128
            com.incode.camera.IncodeCameraConfigurator.getPreviewView = r0
            int r1 = r1 % r4
            goto L32
        L92:
            int r0 = r0.intValue()
            if (r0 != r7) goto L32
            android.util.Range r5 = ProcessCameraProviderExtensionsKt(r7, r8, r5)
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.camera.IncodeCameraConfigurator.IncodeCamera(android.util.Range, androidx.camera.core.impl.CameraInfoInternal, int, int):android.util.Range");
    }

    private static Range<Integer> e1(Integer num, CameraInfoInternal cameraInfoInternal, Integer num2) {
        int i2 = 2 % 2;
        int i3 = getPreviewView + 125;
        f3565e1 = i3 % 128;
        int i4 = i3 % 2;
        if (num != null) {
            Iterator<Range<Integer>> it = cameraInfoInternal.getSupportedFrameRateRanges().iterator();
            int i5 = getPreviewView + 71;
            f3565e1 = i5 % 128;
            int i6 = i5 % 2;
            int iIntValue = Integer.MAX_VALUE;
            while (!(!it.hasNext())) {
                Range<Integer> next = it.next();
                if (Intrinsics.areEqual(next.getLower(), num)) {
                    int i7 = f3565e1 + 125;
                    getPreviewView = i7 % 128;
                    int i8 = i7 % 2;
                    Object upper = next.getUpper();
                    Intrinsics.checkNotNullExpressionValue(upper, "");
                    if (iIntValue > ((Number) upper).intValue()) {
                        Object upper2 = next.getUpper();
                        Intrinsics.checkNotNullExpressionValue(upper2, "");
                        iIntValue = ((Number) upper2).intValue();
                    }
                }
            }
            return new Range<>(num, Integer.valueOf(iIntValue));
        }
        if (num2 == null) {
            return new Range<>((Comparable) 0, (Comparable) 0);
        }
        int iIntValue2 = -2147483647;
        for (Range<Integer> range : cameraInfoInternal.getSupportedFrameRateRanges()) {
            if (Intrinsics.areEqual(range.getUpper(), num2)) {
                Object lower = range.getLower();
                Intrinsics.checkNotNullExpressionValue(lower, "");
                if (iIntValue2 < ((Number) lower).intValue()) {
                    int i9 = getPreviewView + 23;
                    f3565e1 = i9 % 128;
                    if (i9 % 2 != 0) {
                        Object lower2 = range.getLower();
                        Intrinsics.checkNotNullExpressionValue(lower2, "");
                        ((Number) lower2).intValue();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object lower3 = range.getLower();
                    Intrinsics.checkNotNullExpressionValue(lower3, "");
                    iIntValue2 = ((Number) lower3).intValue();
                } else {
                    continue;
                }
            }
        }
        return new Range<>(Integer.valueOf(iIntValue2), num2);
    }

    private static Range<Integer> ProcessCameraProviderExtensionsKt(int i2, int i3, Range<Integer> range) {
        int i4 = 2 % 2;
        int i5 = getPreviewView + 113;
        f3565e1 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 - i3;
        int iIntValue = ((Number) range.getUpper()).intValue();
        Object lower = range.getLower();
        Intrinsics.checkNotNullExpressionValue(lower, "");
        if (i7 <= iIntValue - ((Number) lower).intValue()) {
            return range;
        }
        Range<Integer> range2 = new Range<>(Integer.valueOf(i3), Integer.valueOf(i2));
        int i8 = getPreviewView + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f3565e1 = i8 % 128;
        int i9 = i8 % 2;
        return range2;
    }
}
