package androidx.camera.extensions;

import android.content.Context;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.extensions.ExtensionsConfig;
import androidx.camera.extensions.internal.AdvancedVendorExtender;
import androidx.camera.extensions.internal.BasicVendorExtender;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory;
import androidx.camera.extensions.internal.VendorExtender;
import androidx.camera.extensions.internal.Version;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ExtensionsInfo {
    private static final String EXTENDED_CAMERA_CONFIG_PROVIDER_ID_PREFIX = ":camera:camera-extensions-";
    private final CameraProvider mCameraProvider;
    private VendorExtenderFactory mVendorExtenderFactory = new VendorExtenderFactory() { // from class: androidx.camera.extensions.ExtensionsInfo$$ExternalSyntheticLambda0
        @Override // androidx.camera.extensions.VendorExtenderFactory
        public final VendorExtender createVendorExtender(int i2) {
            return ExtensionsInfo.getVendorExtender(i2);
        }
    };

    ExtensionsInfo(CameraProvider cameraProvider) {
        this.mCameraProvider = cameraProvider;
    }

    CameraSelector getExtensionCameraSelectorAndInjectCameraConfig(CameraSelector cameraSelector, int i2) {
        if (!isExtensionAvailable(cameraSelector, i2)) {
            throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        Iterator<CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof ExtensionCameraFilter) {
                throw new IllegalArgumentException("An extension is already applied to the base CameraSelector.");
            }
        }
        injectExtensionCameraConfig(i2);
        CameraSelector.Builder builderFromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
        builderFromSelector.addCameraFilter(getFilter(i2));
        return builderFromSelector.build();
    }

    boolean isExtensionAvailable(CameraSelector cameraSelector, int i2) {
        CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i2));
        return !r1.build().filter(this.mCameraProvider.getAvailableCameraInfos()).isEmpty();
    }

    Range<Long> getEstimatedCaptureLatencyRange(CameraSelector cameraSelector, int i2, Size size) {
        List<CameraInfo> listFilter = CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i2)).build().filter(this.mCameraProvider.getAvailableCameraInfos());
        if (listFilter.isEmpty()) {
            return null;
        }
        CameraInfo cameraInfo = listFilter.get(0);
        if (ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_2) < 0) {
            return null;
        }
        try {
            VendorExtender vendorExtenderCreateVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i2);
            vendorExtenderCreateVendorExtender.init(cameraInfo);
            return vendorExtenderCreateVendorExtender.getEstimatedCaptureLatencyRange(size);
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }

    boolean isImageAnalysisSupported(CameraSelector cameraSelector, int i2) {
        List<CameraInfo> listFilter = CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i2)).build().filter(this.mCameraProvider.getAvailableCameraInfos());
        if (listFilter.isEmpty()) {
            return false;
        }
        CameraInfo cameraInfo = listFilter.get(0);
        VendorExtender vendorExtenderCreateVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i2);
        vendorExtenderCreateVendorExtender.init(cameraInfo);
        Size[] supportedYuvAnalysisResolutions = vendorExtenderCreateVendorExtender.getSupportedYuvAnalysisResolutions();
        return supportedYuvAnalysisResolutions != null && supportedYuvAnalysisResolutions.length > 0;
    }

    void setVendorExtenderFactory(VendorExtenderFactory vendorExtenderFactory) {
        this.mVendorExtenderFactory = vendorExtenderFactory;
    }

    private CameraFilter getFilter(int i2) {
        return new ExtensionCameraFilter(getExtendedCameraConfigProviderId(i2), this.mVendorExtenderFactory.createVendorExtender(i2));
    }

    private void injectExtensionCameraConfig(final int i2) {
        final Identifier identifierCreate = Identifier.create(getExtendedCameraConfigProviderId(i2));
        if (ExtendedCameraConfigProviderStore.getConfigProvider(identifierCreate) == CameraConfigProvider.EMPTY) {
            ExtendedCameraConfigProviderStore.addConfig(identifierCreate, new CameraConfigProvider() { // from class: androidx.camera.extensions.ExtensionsInfo$$ExternalSyntheticLambda1
                @Override // androidx.camera.core.impl.CameraConfigProvider
                public final CameraConfig getConfig(CameraInfo cameraInfo, Context context) {
                    return this.f$0.m252x1215eb78(i2, identifierCreate, cameraInfo, context);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$injectExtensionCameraConfig$1$androidx-camera-extensions-ExtensionsInfo, reason: not valid java name */
    /* synthetic */ CameraConfig m252x1215eb78(int i2, Identifier identifier, CameraInfo cameraInfo, Context context) {
        VendorExtender vendorExtenderCreateVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i2);
        vendorExtenderCreateVendorExtender.init(cameraInfo);
        ExtensionsConfig.Builder useCaseCombinationRequiredRule = new ExtensionsConfig.Builder().setExtensionMode(i2).setUseCaseConfigFactory((UseCaseConfigFactory) new ExtensionsUseCaseConfigFactory(vendorExtenderCreateVendorExtender)).setCompatibilityId(identifier).setZslDisabled(true).setPostviewSupported(vendorExtenderCreateVendorExtender.isPostviewAvailable()).setCaptureProcessProgressSupported(vendorExtenderCreateVendorExtender.isCaptureProcessProgressAvailable()).setUseCaseCombinationRequiredRule(1);
        SessionProcessor sessionProcessorCreateSessionProcessor = vendorExtenderCreateVendorExtender.createSessionProcessor(context);
        if (sessionProcessorCreateSessionProcessor != null) {
            useCaseCombinationRequiredRule.setSessionProcessor(sessionProcessorCreateSessionProcessor);
        }
        return useCaseCombinationRequiredRule.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static VendorExtender getVendorExtender(int i2) {
        return isAdvancedExtenderSupported() ? new AdvancedVendorExtender(i2) : new BasicVendorExtender(i2);
    }

    /* JADX INFO: renamed from: androidx.camera.extensions.ExtensionsInfo$1, reason: invalid class name */
    class AnonymousClass1 implements VendorExtender {
        AnonymousClass1() {
        }
    }

    private static boolean isAdvancedExtenderSupported() {
        if (ClientVersion.isMaximumCompatibleVersion(Version.VERSION_1_1) || ExtensionVersion.isMaximumCompatibleVersion(Version.VERSION_1_1)) {
            return false;
        }
        return ExtensionVersion.isAdvancedExtenderSupported();
    }

    private static String getExtendedCameraConfigProviderId(int i2) {
        if (i2 == 0) {
            return ":camera:camera-extensions-EXTENSION_MODE_NONE";
        }
        if (i2 == 1) {
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        if (i2 == 2) {
            return ":camera:camera-extensions-EXTENSION_MODE_HDR";
        }
        if (i2 == 3) {
            return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
        }
        if (i2 == 4) {
            return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
        }
        if (i2 == 5) {
            return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
        }
        throw new IllegalArgumentException("Invalid extension mode!");
    }
}
