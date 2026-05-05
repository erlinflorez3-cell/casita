package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import com.dynatrace.android.agent.Global;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class CameraConfigurationUtils {
    private static final int AREA_PER_1000 = 400;
    private static final float MAX_EXPOSURE_COMPENSATION = 1.5f;
    private static final int MAX_FPS = 20;
    private static final float MIN_EXPOSURE_COMPENSATION = 0.0f;
    private static final int MIN_FPS = 10;
    private static final Pattern SEMICOLON = Pattern.compile(Global.SEMICOLON);
    private static final String TAG = "CameraConfiguration";

    private CameraConfigurationUtils() {
    }

    private static List<Camera.Area> buildMiddleArea(int i2) {
        int i3 = -i2;
        return Collections.singletonList(new Camera.Area(new Rect(i3, i3, i2, i2), 1));
    }

    public static String collectStats(Camera.Parameters parameters) {
        return collectStats(parameters.flatten());
    }

    public static String collectStats(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("BOARD=").append(Build.BOARD).append("\nBRAND=");
        sb.append(Build.BRAND).append("\nCPU_ABI=");
        sb.append(Build.CPU_ABI).append("\nDEVICE=");
        sb.append(Build.DEVICE).append("\nDISPLAY=");
        sb.append(Build.DISPLAY).append("\nFINGERPRINT=");
        sb.append(Build.FINGERPRINT).append("\nHOST=");
        sb.append(Build.HOST).append("\nID=");
        sb.append(Build.ID).append("\nMANUFACTURER=");
        sb.append(Build.MANUFACTURER).append("\nMODEL=");
        sb.append(Build.MODEL).append("\nPRODUCT=");
        sb.append(Build.PRODUCT).append("\nTAGS=");
        sb.append(Build.TAGS).append("\nTIME=");
        sb.append(Build.TIME).append("\nTYPE=");
        sb.append(Build.TYPE).append("\nUSER=");
        sb.append(Build.USER).append("\nVERSION.CODENAME=");
        sb.append(Build.VERSION.CODENAME).append("\nVERSION.INCREMENTAL=");
        sb.append(Build.VERSION.INCREMENTAL).append("\nVERSION.RELEASE=");
        sb.append(Build.VERSION.RELEASE).append("\nVERSION.SDK_INT=");
        sb.append(Build.VERSION.SDK_INT).append('\n');
        if (charSequence != null) {
            String[] strArrSplit = SEMICOLON.split(charSequence);
            Arrays.sort(strArrSplit);
            for (String str : strArrSplit) {
                sb.append(str).append('\n');
            }
        }
        return sb.toString();
    }

    private static String findSettableValue(String str, Collection<String> collection, String... strArr) {
        String str2 = "Requesting " + str + " value from among: " + Arrays.toString(strArr);
        String str3 = "Supported " + str + " values: " + collection;
        if (collection != null) {
            for (String str4 : strArr) {
                if (collection.contains(str4)) {
                    String str5 = "Can set " + str + " to: " + str4;
                    return str4;
                }
            }
        }
        return null;
    }

    private static Integer indexOfClosestZoom(Camera.Parameters parameters, double d2) {
        List<Integer> zoomRatios = parameters.getZoomRatios();
        String str = "Zoom ratios: " + zoomRatios;
        int maxZoom = parameters.getMaxZoom();
        if (zoomRatios == null || zoomRatios.isEmpty() || zoomRatios.size() != maxZoom + 1) {
            return null;
        }
        double d3 = d2 * 100.0d;
        double d4 = Double.POSITIVE_INFINITY;
        int i2 = 0;
        for (int i3 = 0; i3 < zoomRatios.size(); i3++) {
            double dAbs = Math.abs(((double) zoomRatios.get(i3).intValue()) - d3);
            if (dAbs < d4) {
                i2 = i3;
                d4 = dAbs;
            }
        }
        String str2 = "Chose zoom ratio of " + (((double) zoomRatios.get(i2).intValue()) / 100.0d);
        return Integer.valueOf(i2);
    }

    public static void setBarcodeSceneMode(Camera.Parameters parameters) {
        String strFindSettableValue;
        if (OptionalModuleUtils.BARCODE.equals(parameters.getSceneMode()) || (strFindSettableValue = findSettableValue("scene mode", parameters.getSupportedSceneModes(), OptionalModuleUtils.BARCODE)) == null) {
            return;
        }
        parameters.setSceneMode(strFindSettableValue);
    }

    public static void setBestExposure(Camera.Parameters parameters, boolean z2) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            if (exposureCompensationStep > 0.0f) {
                int iRound = Math.round((z2 ? 0.0f : MAX_EXPOSURE_COMPENSATION) / exposureCompensationStep);
                float f2 = exposureCompensationStep * iRound;
                int iMax = Math.max(Math.min(iRound, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == iMax) {
                    String str = "Exposure compensation already set to " + iMax + " / " + f2;
                } else {
                    String str2 = "Setting exposure compensation to " + iMax + " / " + f2;
                    parameters.setExposureCompensation(iMax);
                }
            }
        }
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters) {
        setBestPreviewFPS(parameters, 10, 20);
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters, int i2, int i3) {
        int[] next;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        String str = "Supported FPS ranges: " + toString((Collection<int[]>) supportedPreviewFpsRange);
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
            return;
        }
        Iterator<int[]> it = supportedPreviewFpsRange.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i4 = next[0];
            int i5 = next[1];
            if (i4 >= i2 * 1000 && i5 <= i3 * 1000) {
                break;
            }
        }
        if (next == null) {
            return;
        }
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        if (Arrays.equals(iArr, next)) {
            String str2 = "FPS range already set to " + Arrays.toString(next);
        } else {
            String str3 = "Setting FPS range to " + Arrays.toString(next);
            parameters.setPreviewFpsRange(next[0], next[1]);
        }
    }

    public static void setFocus(Camera.Parameters parameters, CameraSettings.FocusMode focusMode, boolean z2) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String strFindSettableValue = (z2 || focusMode == CameraSettings.FocusMode.AUTO) ? findSettableValue("focus mode", supportedFocusModes, "auto") : focusMode == CameraSettings.FocusMode.CONTINUOUS ? findSettableValue("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto") : focusMode == CameraSettings.FocusMode.INFINITY ? findSettableValue("focus mode", supportedFocusModes, "infinity") : focusMode == CameraSettings.FocusMode.MACRO ? findSettableValue("focus mode", supportedFocusModes, "macro") : null;
        if (!z2 && strFindSettableValue == null) {
            strFindSettableValue = findSettableValue("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (strFindSettableValue != null) {
            if (strFindSettableValue.equals(parameters.getFocusMode())) {
                String str = "Focus mode already set to " + strFindSettableValue;
            } else {
                parameters.setFocusMode(strFindSettableValue);
            }
        }
    }

    public static void setFocusArea(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            String str = "Old focus areas: " + toString((Iterable<Camera.Area>) parameters.getFocusAreas());
            List<Camera.Area> listBuildMiddleArea = buildMiddleArea(400);
            String str2 = "Setting focus area to : " + toString((Iterable<Camera.Area>) listBuildMiddleArea);
            parameters.setFocusAreas(listBuildMiddleArea);
        }
    }

    public static void setInvertColor(Camera.Parameters parameters) {
        String strFindSettableValue;
        if ("negative".equals(parameters.getColorEffect()) || (strFindSettableValue = findSettableValue("color effect", parameters.getSupportedColorEffects(), "negative")) == null) {
            return;
        }
        parameters.setColorEffect(strFindSettableValue);
    }

    public static void setMetering(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            String str = "Old metering areas: " + parameters.getMeteringAreas();
            List<Camera.Area> listBuildMiddleArea = buildMiddleArea(400);
            String str2 = "Setting metering area to : " + toString((Iterable<Camera.Area>) listBuildMiddleArea);
            parameters.setMeteringAreas(listBuildMiddleArea);
        }
    }

    public static void setTorch(Camera.Parameters parameters, boolean z2) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String strFindSettableValue = z2 ? findSettableValue("flash mode", supportedFlashModes, "torch", "on") : findSettableValue("flash mode", supportedFlashModes, DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        if (strFindSettableValue != null) {
            if (strFindSettableValue.equals(parameters.getFlashMode())) {
                String str = "Flash mode already set to " + strFindSettableValue;
            } else {
                String str2 = "Setting flash mode to " + strFindSettableValue;
                parameters.setFlashMode(strFindSettableValue);
            }
        }
    }

    public static void setVideoStabilization(Camera.Parameters parameters) {
        if (parameters.isVideoStabilizationSupported() && !parameters.getVideoStabilization()) {
            parameters.setVideoStabilization(true);
        }
    }

    public static void setZoom(Camera.Parameters parameters, double d2) {
        Integer numIndexOfClosestZoom;
        if (!parameters.isZoomSupported() || (numIndexOfClosestZoom = indexOfClosestZoom(parameters, d2)) == null) {
            return;
        }
        if (parameters.getZoom() == numIndexOfClosestZoom.intValue()) {
            String str = "Zoom is already set to " + numIndexOfClosestZoom;
        } else {
            String str2 = "Setting zoom to " + numIndexOfClosestZoom;
            parameters.setZoom(numIndexOfClosestZoom.intValue());
        }
    }

    private static String toString(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb.append(area.rect).append(AbstractJsonLexerKt.COLON).append(area.weight).append(TokenParser.SP);
        }
        return sb.toString();
    }

    private static String toString(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
