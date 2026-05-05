package androidx.camera.camera2.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector;
import androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraMode;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
final class SupportedSurfaceCombination {
    private static final String TAG = "SupportedSurfaceCombination";
    private final CamcorderProfileHelper mCamcorderProfileHelper;
    private final String mCameraId;
    private final CameraCharacteristicsCompat mCharacteristics;
    private final DisplayInfoManager mDisplayInfoManager;
    private final DynamicRangeResolver mDynamicRangeResolver;
    private final ExtraSupportedSurfaceCombinationsContainer mExtraSupportedSurfaceCombinationsContainer;
    private final int mHardwareLevel;
    private boolean mIsBurstCaptureSupported;
    private boolean mIsConcurrentCameraModeSupported;
    private boolean mIsPreviewStabilizationSupported;
    private boolean mIsRawSupported;
    private boolean mIsStreamUseCaseSupported;
    private boolean mIsUltraHighResolutionSensorSupported;
    SurfaceSizeDefinition mSurfaceSizeDefinition;
    private final List<SurfaceCombination> mSurfaceCombinations = new ArrayList();
    private final List<SurfaceCombination> mUltraHighSurfaceCombinations = new ArrayList();
    private final List<SurfaceCombination> mConcurrentSurfaceCombinations = new ArrayList();
    private final List<SurfaceCombination> mPreviewStabilizationSurfaceCombinations = new ArrayList();
    private final Map<FeatureSettings, List<SurfaceCombination>> mFeatureSettingsToSupportedCombinationsMap = new HashMap();
    private final List<SurfaceCombination> mSurfaceCombinations10Bit = new ArrayList();
    private final List<SurfaceCombination> mSurfaceCombinationsUltraHdr = new ArrayList();
    private final List<SurfaceCombination> mSurfaceCombinationsStreamUseCase = new ArrayList();
    List<Integer> mSurfaceSizeDefinitionFormats = new ArrayList();
    private final TargetAspectRatio mTargetAspectRatio = new TargetAspectRatio();
    private final ResolutionCorrector mResolutionCorrector = new ResolutionCorrector();

    private void checkCustomization() {
    }

    SupportedSurfaceCombination(Context context, String str, CameraManagerCompat cameraManagerCompat, CamcorderProfileHelper camcorderProfileHelper) throws Throwable {
        this.mIsRawSupported = false;
        this.mIsBurstCaptureSupported = false;
        this.mIsConcurrentCameraModeSupported = false;
        this.mIsStreamUseCaseSupported = false;
        this.mIsUltraHighResolutionSensorSupported = false;
        this.mIsPreviewStabilizationSupported = false;
        String str2 = (String) Preconditions.checkNotNull(str);
        this.mCameraId = str2;
        this.mCamcorderProfileHelper = (CamcorderProfileHelper) Preconditions.checkNotNull(camcorderProfileHelper);
        this.mExtraSupportedSurfaceCombinationsContainer = new ExtraSupportedSurfaceCombinationsContainer();
        this.mDisplayInfoManager = DisplayInfoManager.getInstance(context);
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str2);
            this.mCharacteristics = cameraCharacteristicsCompat;
            Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.mHardwareLevel = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i2 == 3) {
                        this.mIsRawSupported = true;
                    } else if (i2 == 6) {
                        this.mIsBurstCaptureSupported = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i2 == 16) {
                        this.mIsUltraHighResolutionSensorSupported = true;
                    }
                }
            }
            DynamicRangeResolver dynamicRangeResolver = new DynamicRangeResolver(this.mCharacteristics);
            this.mDynamicRangeResolver = dynamicRangeResolver;
            generateSupportedCombinationList();
            if (this.mIsUltraHighResolutionSensorSupported) {
                generateUltraHighSupportedCombinationList();
            }
            Class<?> cls = Class.forName(Ig.wd("x6X\r\u0018T1YSqp\u0017XU5O\u001fOt\u00016oK", (short) (ZN.Xd() ^ 31970)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1633zX.Xd() ^ (-27974));
            int[] iArr2 = new int["_\rNF(\u0007n%\u0006\u0014y0\f\t\u00173d".length()];
            QB qb = new QB("_\rNF(\u0007n%\u0006\u0014y0\f\t\u00173d");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = {C1561oA.Qd("[g\\ie^X!ZRbSeN^P\u0018LITKWE\u0011EPNBSON@HM", (short) (C1633zX.Xd() ^ (-15612)))};
                Method method2 = Class.forName(C1593ug.zd("bpgvtok6lyy\u0001r|\u0004>\u0002\u007fAdvy\u0003y\u0001\u007fh}\f\u007f\u0007\u0006\u0014", (short) (Od.Xd() ^ (-9599)), (short) (Od.Xd() ^ (-32)))).getMethod(C1561oA.Kd("GAT5\\WYKT.NK_a_S", (short) (C1580rY.Xd() ^ (-20795))), Class.forName(C1561oA.od("7-A+v4(4,q\u001663)-%", (short) (C1580rY.Xd() ^ (-19642)))));
                try {
                    method2.setAccessible(true);
                    boolean zBooleanValue = ((Boolean) method2.invoke(packageManager, objArr2)).booleanValue();
                    this.mIsConcurrentCameraModeSupported = zBooleanValue;
                    if (zBooleanValue) {
                        generateConcurrentSupportedCombinationList();
                    }
                    if (dynamicRangeResolver.is10BitDynamicRangeSupported()) {
                        generate10BitSupportedCombinationList();
                    }
                    if (isUltraHdrSupported()) {
                        generateUltraHdrSupportedCombinationList();
                    }
                    boolean zIsStreamUseCaseSupported = StreamUseCaseUtil.isStreamUseCaseSupported(this.mCharacteristics);
                    this.mIsStreamUseCaseSupported = zIsStreamUseCaseSupported;
                    if (zIsStreamUseCaseSupported) {
                        generateStreamUseCaseSupportedCombinationList();
                    }
                    boolean zIsPreviewStabilizationSupported = VideoStabilizationUtil.isPreviewStabilizationSupported(this.mCharacteristics);
                    this.mIsPreviewStabilizationSupported = zIsPreviewStabilizationSupported;
                    if (zIsPreviewStabilizationSupported) {
                        generatePreviewStabilizationSupportedCombinationList();
                    }
                    generateSurfaceSizeDefinition();
                    checkCustomization();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (CameraAccessExceptionCompat e4) {
            throw CameraUnavailableExceptionHelper.createFrom(e4);
        }
    }

    String getCameraId() {
        return this.mCameraId;
    }

    boolean isRawSupported() {
        return this.mIsRawSupported;
    }

    boolean isBurstCaptureSupported() {
        return this.mIsBurstCaptureSupported;
    }

    private boolean isUltraHdrSupported() {
        int[] outputFormats = this.mCharacteristics.getStreamConfigurationMapCompat().getOutputFormats();
        if (outputFormats == null) {
            return false;
        }
        for (int i2 : outputFormats) {
            if (i2 == 4101) {
                return true;
            }
        }
        return false;
    }

    boolean checkSupported(FeatureSettings featureSettings, List<SurfaceConfig> list) {
        Iterator<SurfaceCombination> it = getSurfaceCombinationsByFeatureSettings(featureSettings).iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 = it.next().getOrderedSupportedSurfaceConfigList(list) != null;
            if (z2) {
                break;
            }
        }
        return z2;
    }

    List<SurfaceConfig> getOrderedSupportedStreamUseCaseSurfaceConfigList(FeatureSettings featureSettings, List<SurfaceConfig> list) {
        if (!StreamUseCaseUtil.shouldUseStreamUseCase(featureSettings)) {
            return null;
        }
        Iterator<SurfaceCombination> it = this.mSurfaceCombinationsStreamUseCase.iterator();
        while (it.hasNext()) {
            List<SurfaceConfig> orderedSupportedSurfaceConfigList = it.next().getOrderedSupportedSurfaceConfigList(list);
            if (orderedSupportedSurfaceConfigList != null) {
                return orderedSupportedSurfaceConfigList;
            }
        }
        return null;
    }

    private List<SurfaceCombination> getSurfaceCombinationsByFeatureSettings(FeatureSettings featureSettings) {
        if (this.mFeatureSettingsToSupportedCombinationsMap.containsKey(featureSettings)) {
            return this.mFeatureSettingsToSupportedCombinationsMap.get(featureSettings);
        }
        List<SurfaceCombination> arrayList = new ArrayList<>();
        if (featureSettings.isUltraHdrOn()) {
            if (featureSettings.getCameraMode() == 0) {
                arrayList.addAll(this.mSurfaceCombinationsUltraHdr);
            }
        } else if (featureSettings.getRequiredMaxBitDepth() == 8) {
            int cameraMode = featureSettings.getCameraMode();
            if (cameraMode == 1) {
                arrayList = this.mConcurrentSurfaceCombinations;
            } else if (cameraMode == 2) {
                arrayList.addAll(this.mUltraHighSurfaceCombinations);
                arrayList.addAll(this.mSurfaceCombinations);
            } else {
                arrayList.addAll(featureSettings.isPreviewStabilizationOn() ? this.mPreviewStabilizationSurfaceCombinations : this.mSurfaceCombinations);
            }
        } else if (featureSettings.getRequiredMaxBitDepth() == 10 && featureSettings.getCameraMode() == 0) {
            arrayList.addAll(this.mSurfaceCombinations10Bit);
        }
        this.mFeatureSettingsToSupportedCombinationsMap.put(featureSettings, arrayList);
        return arrayList;
    }

    SurfaceConfig transformSurfaceConfig(int i2, int i3, Size size) {
        return SurfaceConfig.transformSurfaceConfig(i2, i3, size, getUpdatedSurfaceSizeDefinitionByFormat(i3));
    }

    static int getMaxFrameRate(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i2, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) cameraCharacteristicsCompat.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i2, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    private static int getRangeLength(Range<Integer> range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    private static int getRangeDistance(Range<Integer> range, Range<Integer> range2) {
        Preconditions.checkState((range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true, "Ranges must not intersect");
        if (((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue()) {
            return ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue();
        }
        return ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    private static Range<Integer> compareIntersectingRanges(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        double rangeLength = getRangeLength(range2.intersect(range));
        double rangeLength2 = getRangeLength(range3.intersect(range));
        double rangeLength3 = rangeLength2 / ((double) getRangeLength(range3));
        double rangeLength4 = rangeLength / ((double) getRangeLength(range2));
        if (rangeLength2 > rangeLength) {
            if (rangeLength3 >= 0.5d || rangeLength3 >= rangeLength4) {
                return range3;
            }
        } else if (rangeLength2 == rangeLength) {
            if (rangeLength3 > rangeLength4) {
                return range3;
            }
            if (rangeLength3 == rangeLength4 && ((Integer) range3.getLower()).intValue() > ((Integer) range2.getLower()).intValue()) {
                return range3;
            }
        } else if (rangeLength4 < 0.5d && rangeLength3 > rangeLength4) {
            return range3;
        }
        return range2;
    }

    private Range<Integer> getClosestSupportedDeviceFrameRate(Range<Integer> range, int i2) {
        if (range == null || range.equals(StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            return StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        }
        Range<Integer>[] rangeArr = (Range[]) this.mCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr == null) {
            return StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        }
        Range range2 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i2)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i2)));
        Range<Integer> rangeCompareIntersectingRanges = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        int rangeLength = 0;
        for (Range<Integer> range3 : rangeArr) {
            if (i2 >= ((Integer) range3.getLower()).intValue()) {
                if (rangeCompareIntersectingRanges.equals(StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                    rangeCompareIntersectingRanges = range3;
                }
                if (range3.equals(range2)) {
                    return range3;
                }
                try {
                    int rangeLength2 = getRangeLength(range3.intersect(range2));
                    if (rangeLength == 0) {
                        rangeLength = rangeLength2;
                    } else {
                        if (rangeLength2 >= rangeLength) {
                            rangeCompareIntersectingRanges = compareIntersectingRanges(range2, rangeCompareIntersectingRanges, range3);
                            rangeLength = getRangeLength(range2.intersect(rangeCompareIntersectingRanges));
                        }
                        range3 = rangeCompareIntersectingRanges;
                    }
                } catch (IllegalArgumentException unused) {
                    if (rangeLength != 0 || (getRangeDistance(range3, range2) >= getRangeDistance(rangeCompareIntersectingRanges, range2) && (getRangeDistance(range3, range2) != getRangeDistance(rangeCompareIntersectingRanges, range2) || (((Integer) range3.getLower()).intValue() <= ((Integer) rangeCompareIntersectingRanges.getUpper()).intValue() && getRangeLength(range3) >= getRangeLength(rangeCompareIntersectingRanges))))) {
                    }
                }
                rangeCompareIntersectingRanges = range3;
            }
        }
        return rangeCompareIntersectingRanges;
    }

    private Range<Integer> getUpdatedTargetFramerate(Range<Integer> range, Range<Integer> range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    private int getUpdatedMaximumFps(int i2, int i3, Size size) {
        return Math.min(i2, getMaxFrameRate(this.mCharacteristics, i3, size));
    }

    Pair<Map<UseCaseConfig<?>, StreamSpec>, Map<AttachedSurfaceInfo, StreamSpec>> getSuggestedStreamSpecifications(int i2, List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map, boolean z2, boolean z3) {
        List<Integer> list2;
        int i3;
        List<SurfaceConfig> orderedSupportedStreamUseCaseSurfaceConfigList;
        int i4;
        refreshPreviewSize();
        ArrayList arrayList = new ArrayList(map.keySet());
        List<Integer> useCasesPriorityOrder = getUseCasesPriorityOrder(arrayList);
        Map<UseCaseConfig<?>, DynamicRange> mapResolveAndValidateDynamicRanges = this.mDynamicRangeResolver.resolveAndValidateDynamicRanges(list, arrayList, useCasesPriorityOrder);
        int i5 = i2;
        FeatureSettings featureSettingsCreateFeatureSettings = createFeatureSettings(i5, mapResolveAndValidateDynamicRanges, z2, isUltraHdrOn(list, map));
        boolean zIsUseCasesCombinationSupported = isUseCasesCombinationSupported(featureSettingsCreateFeatureSettings, list, map);
        if (!zIsUseCasesCombinationSupported) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.mCameraId + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        Range<Integer> targetFpsRange = getTargetFpsRange(list, arrayList, useCasesPriorityOrder);
        Map<UseCaseConfig<?>, List<Size>> mapFilterSupportedSizes = filterSupportedSizes(map, featureSettingsCreateFeatureSettings, targetFpsRange);
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = useCasesPriorityOrder.iterator();
        while (it.hasNext()) {
            UseCaseConfig<?> useCaseConfig = arrayList.get(it.next().intValue());
            arrayList2.add(applyResolutionSelectionOrderRelatedWorkarounds(mapFilterSupportedSizes.get(useCaseConfig), useCaseConfig.getInputFormat()));
        }
        List<List<Size>> allPossibleSizeArrangements = getAllPossibleSizeArrangements(arrayList2);
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        boolean zContainsZslUseCase = StreamUseCaseUtil.containsZslUseCase(list, arrayList);
        int maxSupportedFpsFromAttachedSurfaces = getMaxSupportedFpsFromAttachedSurfaces(list);
        if (this.mIsStreamUseCaseSupported && !zContainsZslUseCase) {
            Iterator<List<Size>> it2 = allPossibleSizeArrangements.iterator();
            orderedSupportedStreamUseCaseSurfaceConfigList = null;
            while (true) {
                if (!it2.hasNext()) {
                    list2 = useCasesPriorityOrder;
                    i3 = maxSupportedFpsFromAttachedSurfaces;
                    break;
                }
                i3 = maxSupportedFpsFromAttachedSurfaces;
                list2 = useCasesPriorityOrder;
                i5 = i5;
                orderedSupportedStreamUseCaseSurfaceConfigList = getOrderedSupportedStreamUseCaseSurfaceConfigList(featureSettingsCreateFeatureSettings, (List) getSurfaceConfigListAndFpsCeiling(i5, list, it2.next(), arrayList, useCasesPriorityOrder, i3, map4, map5).first);
                if (orderedSupportedStreamUseCaseSurfaceConfigList != null && !StreamUseCaseUtil.areCaptureTypesEligible(map4, map5, orderedSupportedStreamUseCaseSurfaceConfigList)) {
                    orderedSupportedStreamUseCaseSurfaceConfigList = null;
                }
                if (orderedSupportedStreamUseCaseSurfaceConfigList != null) {
                    if (StreamUseCaseUtil.areStreamUseCasesAvailableForSurfaceConfigs(this.mCharacteristics, orderedSupportedStreamUseCaseSurfaceConfigList)) {
                        break;
                    }
                    orderedSupportedStreamUseCaseSurfaceConfigList = null;
                }
                map4.clear();
                map5.clear();
                maxSupportedFpsFromAttachedSurfaces = i3;
                useCasesPriorityOrder = list2;
            }
            if (orderedSupportedStreamUseCaseSurfaceConfigList == null && !zIsUseCasesCombinationSupported) {
                throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.mCameraId + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
            }
        } else {
            list2 = useCasesPriorityOrder;
            i3 = maxSupportedFpsFromAttachedSurfaces;
            orderedSupportedStreamUseCaseSurfaceConfigList = null;
        }
        Iterator<List<Size>> it3 = allPossibleSizeArrangements.iterator();
        int i6 = 0;
        int i7 = Integer.MAX_VALUE;
        int iIntValue = Integer.MAX_VALUE;
        boolean z4 = false;
        boolean z5 = false;
        List<Size> list3 = null;
        List<Size> list4 = null;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            List<Size> next = it3.next();
            int i8 = iIntValue;
            i5 = i5;
            i3 = i3;
            Pair<List<SurfaceConfig>, Integer> surfaceConfigListAndFpsCeiling = getSurfaceConfigListAndFpsCeiling(i5, list, next, arrayList, list2, i3, null, null);
            List<SurfaceConfig> list5 = (List) surfaceConfigListAndFpsCeiling.first;
            iIntValue = ((Integer) surfaceConfigListAndFpsCeiling.second).intValue();
            boolean z6 = targetFpsRange == null || i3 <= iIntValue || iIntValue >= ((Integer) targetFpsRange.getLower()).intValue();
            if (z4 || !checkSupported(featureSettingsCreateFeatureSettings, list5)) {
                i4 = Integer.MAX_VALUE;
            } else {
                i4 = Integer.MAX_VALUE;
                if (i8 == Integer.MAX_VALUE || i8 < iIntValue) {
                    i8 = iIntValue;
                    list3 = next;
                }
                if (z6) {
                    if (z5) {
                        list3 = next;
                        break;
                    }
                    z4 = true;
                    i8 = iIntValue;
                    list3 = next;
                }
            }
            if (orderedSupportedStreamUseCaseSurfaceConfigList != null && !z5 && getOrderedSupportedStreamUseCaseSurfaceConfigList(featureSettingsCreateFeatureSettings, list5) != null) {
                if (i7 == i4 || i7 < iIntValue) {
                    i7 = iIntValue;
                    list4 = next;
                }
                if (!z6) {
                    continue;
                } else {
                    if (z4) {
                        i7 = iIntValue;
                        iIntValue = i8;
                        list4 = next;
                        break;
                    }
                    z5 = true;
                    i7 = iIntValue;
                    list4 = next;
                }
            }
            iIntValue = i8;
        }
        if (list3 != null) {
            Range<Integer> closestSupportedDeviceFrameRate = targetFpsRange != null ? getClosestSupportedDeviceFrameRate(targetFpsRange, iIntValue) : null;
            for (UseCaseConfig<?> useCaseConfig2 : arrayList) {
                StreamSpec.Builder zslDisabled = StreamSpec.builder(list3.get(list2.indexOf(Integer.valueOf(arrayList.indexOf(useCaseConfig2))))).setDynamicRange((DynamicRange) Preconditions.checkNotNull(mapResolveAndValidateDynamicRanges.get(useCaseConfig2))).setImplementationOptions(StreamUseCaseUtil.getStreamSpecImplementationOptions(useCaseConfig2)).setZslDisabled(z3);
                if (closestSupportedDeviceFrameRate != null) {
                    zslDisabled.setExpectedFrameRateRange(closestSupportedDeviceFrameRate);
                }
                map3.put(useCaseConfig2, zslDisabled.build());
            }
            if (orderedSupportedStreamUseCaseSurfaceConfigList != null && iIntValue == i7 && list3.size() == list4.size()) {
                while (true) {
                    if (i6 < list3.size()) {
                        if (!list3.get(i6).equals(list4.get(i6))) {
                            break;
                        }
                        i6++;
                    } else if (!StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithInteropOverride(this.mCharacteristics, list, map3, map2)) {
                        StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(map3, map2, map4, map5, orderedSupportedStreamUseCaseSurfaceConfigList);
                    }
                }
            }
            return new Pair<>(map3, map2);
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.mCameraId + " and Hardware level: " + this.mHardwareLevel + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + arrayList);
    }

    private static boolean isUltraHdrOn(List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map) {
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getImageFormat() == 4101) {
                return true;
            }
        }
        Iterator<UseCaseConfig<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getInputFormat() == 4101) {
                return true;
            }
        }
        return false;
    }

    private FeatureSettings createFeatureSettings(int i2, Map<UseCaseConfig<?>, DynamicRange> map, boolean z2, boolean z3) {
        int requiredMaxBitDepth = getRequiredMaxBitDepth(map);
        if (i2 == 0 || !z3) {
            if (i2 != 0 && requiredMaxBitDepth == 10) {
                throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.mCameraId, CameraMode.toLabelString(i2)));
            }
            return FeatureSettings.of(i2, requiredMaxBitDepth, z2, z3);
        }
        throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.mCameraId, CameraMode.toLabelString(i2)));
    }

    private boolean isUseCasesCombinationSupported(FeatureSettings featureSettings, List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSurfaceConfig());
        }
        CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
        for (UseCaseConfig<?> useCaseConfig : map.keySet()) {
            List<Size> list2 = map.get(useCaseConfig);
            Preconditions.checkArgument((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + useCaseConfig + ".");
            Size size = (Size) Collections.min(list2, compareSizesByArea);
            int inputFormat = useCaseConfig.getInputFormat();
            arrayList.add(SurfaceConfig.transformSurfaceConfig(featureSettings.getCameraMode(), inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat)));
        }
        return checkSupported(featureSettings, arrayList);
    }

    private Range<Integer> getTargetFpsRange(List<AttachedSurfaceInfo> list, List<UseCaseConfig<?>> list2, List<Integer> list3) {
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        Range<Integer> updatedTargetFramerate = null;
        while (it.hasNext()) {
            updatedTargetFramerate = getUpdatedTargetFramerate(it.next().getTargetFrameRate(), updatedTargetFramerate);
        }
        Iterator<Integer> it2 = list3.iterator();
        while (it2.hasNext()) {
            updatedTargetFramerate = getUpdatedTargetFramerate(list2.get(it2.next().intValue()).getTargetFrameRate(null), updatedTargetFramerate);
        }
        return updatedTargetFramerate;
    }

    private int getMaxSupportedFpsFromAttachedSurfaces(List<AttachedSurfaceInfo> list) {
        int updatedMaximumFps = Integer.MAX_VALUE;
        for (AttachedSurfaceInfo attachedSurfaceInfo : list) {
            updatedMaximumFps = getUpdatedMaximumFps(updatedMaximumFps, attachedSurfaceInfo.getImageFormat(), attachedSurfaceInfo.getSize());
        }
        return updatedMaximumFps;
    }

    private Map<UseCaseConfig<?>, List<Size>> filterSupportedSizes(Map<UseCaseConfig<?>, List<Size>> map, FeatureSettings featureSettings, Range<Integer> range) {
        HashMap map2 = new HashMap();
        for (UseCaseConfig<?> useCaseConfig : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap map3 = new HashMap();
            for (Size size : map.get(useCaseConfig)) {
                int inputFormat = useCaseConfig.getInputFormat();
                SurfaceConfig.ConfigSize configSize = SurfaceConfig.transformSurfaceConfig(featureSettings.getCameraMode(), inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat)).getConfigSize();
                int maxFrameRate = range != null ? getMaxFrameRate(this.mCharacteristics, inputFormat, size) : Integer.MAX_VALUE;
                Set hashSet = (Set) map3.get(configSize);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map3.put(configSize, hashSet);
                }
                if (!hashSet.contains(Integer.valueOf(maxFrameRate))) {
                    arrayList.add(size);
                    hashSet.add(Integer.valueOf(maxFrameRate));
                }
            }
            map2.put(useCaseConfig, arrayList);
        }
        return map2;
    }

    private Pair<List<SurfaceConfig>, Integer> getSurfaceConfigListAndFpsCeiling(int i2, List<AttachedSurfaceInfo> list, List<Size> list2, List<UseCaseConfig<?>> list3, List<Integer> list4, int i3, Map<Integer, AttachedSurfaceInfo> map, Map<Integer, UseCaseConfig<?>> map2) {
        ArrayList arrayList = new ArrayList();
        for (AttachedSurfaceInfo attachedSurfaceInfo : list) {
            arrayList.add(attachedSurfaceInfo.getSurfaceConfig());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), attachedSurfaceInfo);
            }
        }
        for (int i4 = 0; i4 < list2.size(); i4++) {
            Size size = list2.get(i4);
            UseCaseConfig<?> useCaseConfig = list3.get(list4.get(i4).intValue());
            int inputFormat = useCaseConfig.getInputFormat();
            arrayList.add(SurfaceConfig.transformSurfaceConfig(i2, inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), useCaseConfig);
            }
            i3 = getUpdatedMaximumFps(i3, useCaseConfig.getInputFormat(), size);
        }
        return new Pair<>(arrayList, Integer.valueOf(i3));
    }

    List<Size> applyResolutionSelectionOrderRelatedWorkarounds(List<Size> list, int i2) {
        Rational rational;
        int i3 = this.mTargetAspectRatio.get(this.mCameraId, this.mCharacteristics);
        if (i3 == 0) {
            rational = AspectRatioUtil.ASPECT_RATIO_4_3;
        } else if (i3 == 1) {
            rational = AspectRatioUtil.ASPECT_RATIO_16_9;
        } else if (i3 != 2) {
            rational = null;
        } else {
            Size maximumSize = getUpdatedSurfaceSizeDefinitionByFormat(256).getMaximumSize(256);
            rational = new Rational(maximumSize.getWidth(), maximumSize.getHeight());
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : list) {
                if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.mResolutionCorrector.insertOrPrioritize(SurfaceConfig.getConfigType(i2), list);
    }

    private static int getRequiredMaxBitDepth(Map<UseCaseConfig<?>, DynamicRange> map) {
        Iterator<DynamicRange> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().getBitDepth() == 10) {
                return 10;
            }
        }
        return 8;
    }

    private static List<Integer> getUseCasesPriorityOrder(List<UseCaseConfig<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<UseCaseConfig<?>> it = list.iterator();
        while (it.hasNext()) {
            int surfaceOccupancyPriority = it.next().getSurfaceOccupancyPriority(0);
            if (!arrayList2.contains(Integer.valueOf(surfaceOccupancyPriority))) {
                arrayList2.add(Integer.valueOf(surfaceOccupancyPriority));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            for (UseCaseConfig<?> useCaseConfig : list) {
                if (iIntValue == useCaseConfig.getSurfaceOccupancyPriority(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(useCaseConfig)));
                }
            }
        }
        return arrayList;
    }

    private List<List<Size>> getAllPossibleSizeArrangements(List<List<Size>> list) {
        Iterator<List<Size>> it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= it.next().size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / list.get(0).size();
        int i3 = size;
        for (int i4 = 0; i4 < list.size(); i4++) {
            List<Size> list2 = list.get(i4);
            for (int i5 = 0; i5 < size; i5++) {
                ((List) arrayList.get(i5)).add(list2.get((i5 % i3) / size2));
            }
            if (i4 < list.size() - 1) {
                i3 = size2;
                size2 /= list.get(i4 + 1).size();
            }
        }
        return arrayList;
    }

    private Size getMaxOutputSizeByFormat(StreamConfigurationMap streamConfigurationMap, int i2, boolean z2) {
        Size[] outputSizes;
        Size[] highResolutionOutputSizes;
        if (i2 == 34) {
            outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(i2);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
            Size size = (Size) Collections.max(Arrays.asList(outputSizes), compareSizesByArea);
            Size size2 = SizeUtil.RESOLUTION_ZERO;
            if (z2 && (highResolutionOutputSizes = Api23Impl.getHighResolutionOutputSizes(streamConfigurationMap, i2)) != null && highResolutionOutputSizes.length > 0) {
                size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), compareSizesByArea);
            }
            return (Size) Collections.max(Arrays.asList(size, size2), compareSizesByArea);
        }
        return null;
    }

    private void generateSupportedCombinationList() {
        this.mSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.generateSupportedCombinationList(this.mHardwareLevel, this.mIsRawSupported, this.mIsBurstCaptureSupported));
        this.mSurfaceCombinations.addAll(this.mExtraSupportedSurfaceCombinationsContainer.get(this.mCameraId));
    }

    private void generateUltraHighSupportedCombinationList() {
        this.mUltraHighSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getUltraHighResolutionSupportedCombinationList());
    }

    private void generateConcurrentSupportedCombinationList() {
        this.mConcurrentSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getConcurrentSupportedCombinationList());
    }

    private void generate10BitSupportedCombinationList() {
        this.mSurfaceCombinations10Bit.addAll(GuaranteedConfigurationsUtil.get10BitSupportedCombinationList());
    }

    private void generateUltraHdrSupportedCombinationList() {
        this.mSurfaceCombinationsUltraHdr.addAll(GuaranteedConfigurationsUtil.getUltraHdrSupportedCombinationList());
    }

    private void generateStreamUseCaseSupportedCombinationList() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.mSurfaceCombinationsStreamUseCase.addAll(GuaranteedConfigurationsUtil.getStreamUseCaseSupportedCombinationList());
        }
    }

    private void generatePreviewStabilizationSupportedCombinationList() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.mPreviewStabilizationSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getPreviewStabilizationSupportedCombinationList());
        }
    }

    private void generateSurfaceSizeDefinition() {
        this.mSurfaceSizeDefinition = SurfaceSizeDefinition.create(SizeUtil.RESOLUTION_VGA, new HashMap(), this.mDisplayInfoManager.getPreviewSize(), new HashMap(), getRecordSize(), new HashMap(), new HashMap());
    }

    SurfaceSizeDefinition getUpdatedSurfaceSizeDefinitionByFormat(int i2) {
        if (!this.mSurfaceSizeDefinitionFormats.contains(Integer.valueOf(i2))) {
            updateS720pOrS1440pSizeByFormat(this.mSurfaceSizeDefinition.getS720pSizeMap(), SizeUtil.RESOLUTION_720P, i2);
            updateS720pOrS1440pSizeByFormat(this.mSurfaceSizeDefinition.getS1440pSizeMap(), SizeUtil.RESOLUTION_1440P, i2);
            updateMaximumSizeByFormat(this.mSurfaceSizeDefinition.getMaximumSizeMap(), i2);
            updateUltraMaximumSizeByFormat(this.mSurfaceSizeDefinition.getUltraMaximumSizeMap(), i2);
            this.mSurfaceSizeDefinitionFormats.add(Integer.valueOf(i2));
        }
        return this.mSurfaceSizeDefinition;
    }

    private void updateS720pOrS1440pSizeByFormat(Map<Integer, Size> map, Size size, int i2) {
        if (this.mIsConcurrentCameraModeSupported) {
            Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap(), i2, false);
            Integer numValueOf = Integer.valueOf(i2);
            if (maxOutputSizeByFormat != null) {
                size = (Size) Collections.min(Arrays.asList(size, maxOutputSizeByFormat), new CompareSizesByArea());
            }
            map.put(numValueOf, size);
        }
    }

    private void updateMaximumSizeByFormat(Map<Integer, Size> map, int i2) {
        Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap(), i2, true);
        if (maxOutputSizeByFormat != null) {
            map.put(Integer.valueOf(i2), maxOutputSizeByFormat);
        }
    }

    private void updateUltraMaximumSizeByFormat(Map<Integer, Size> map, int i2) {
        StreamConfigurationMap streamConfigurationMap;
        if (Build.VERSION.SDK_INT < 31 || !this.mIsUltraHighResolutionSensorSupported || (streamConfigurationMap = (StreamConfigurationMap) this.mCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null) {
            return;
        }
        map.put(Integer.valueOf(i2), getMaxOutputSizeByFormat(streamConfigurationMap, i2, true));
    }

    private void refreshPreviewSize() {
        this.mDisplayInfoManager.refresh();
        if (this.mSurfaceSizeDefinition == null) {
            generateSurfaceSizeDefinition();
        } else {
            this.mSurfaceSizeDefinition = SurfaceSizeDefinition.create(this.mSurfaceSizeDefinition.getAnalysisSize(), this.mSurfaceSizeDefinition.getS720pSizeMap(), this.mDisplayInfoManager.getPreviewSize(), this.mSurfaceSizeDefinition.getS1440pSizeMap(), this.mSurfaceSizeDefinition.getRecordSize(), this.mSurfaceSizeDefinition.getMaximumSizeMap(), this.mSurfaceSizeDefinition.getUltraMaximumSizeMap());
        }
    }

    private Size getRecordSize() {
        try {
            int i2 = Integer.parseInt(this.mCameraId);
            CamcorderProfile camcorderProfile = this.mCamcorderProfileHelper.hasProfile(i2, 1) ? this.mCamcorderProfileHelper.get(i2, 1) : null;
            if (camcorderProfile != null) {
                return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
            return getRecordSizeByHasProfile(i2);
        } catch (NumberFormatException unused) {
            return getRecordSizeFromStreamConfigurationMap();
        }
    }

    private Size getRecordSizeFromStreamConfigurationMap() {
        Size[] outputSizes = this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return SizeUtil.RESOLUTION_480P;
        }
        Arrays.sort(outputSizes, new CompareSizesByArea(true));
        for (Size size : outputSizes) {
            if (size.getWidth() <= SizeUtil.RESOLUTION_1080P.getWidth() && size.getHeight() <= SizeUtil.RESOLUTION_1080P.getHeight()) {
                return size;
            }
        }
        return SizeUtil.RESOLUTION_480P;
    }

    private Size getRecordSizeByHasProfile(int i2) {
        CamcorderProfile camcorderProfile;
        Size size = SizeUtil.RESOLUTION_480P;
        if (this.mCamcorderProfileHelper.hasProfile(i2, 10)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i2, 10);
        } else if (this.mCamcorderProfileHelper.hasProfile(i2, 8)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i2, 8);
        } else if (this.mCamcorderProfileHelper.hasProfile(i2, 12)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i2, 12);
        } else if (this.mCamcorderProfileHelper.hasProfile(i2, 6)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i2, 6);
        } else if (this.mCamcorderProfileHelper.hasProfile(i2, 5)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i2, 5);
        } else {
            camcorderProfile = this.mCamcorderProfileHelper.hasProfile(i2, 4) ? this.mCamcorderProfileHelper.get(i2, 4) : null;
        }
        return camcorderProfile != null ? new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : size;
    }

    /* JADX INFO: loaded from: classes.dex */
    static class Api23Impl {
        private Api23Impl() {
        }

        static Size[] getHighResolutionOutputSizes(StreamConfigurationMap streamConfigurationMap, int i2) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i2);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    static abstract class FeatureSettings {
        abstract int getCameraMode();

        abstract int getRequiredMaxBitDepth();

        abstract boolean isPreviewStabilizationOn();

        abstract boolean isUltraHdrOn();

        FeatureSettings() {
        }

        static FeatureSettings of(int i2, int i3, boolean z2, boolean z3) {
            return new AutoValue_SupportedSurfaceCombination_FeatureSettings(i2, i3, z2, z3);
        }
    }
}
