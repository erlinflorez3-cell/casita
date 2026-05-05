package com.facebook.react.uimanager;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;

/* JADX INFO: loaded from: classes3.dex */
public class TransformHelper {
    private static ThreadLocal<double[]> sHelperMatrix = new ThreadLocal<double[]>() { // from class: com.facebook.react.uimanager.TransformHelper.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public double[] initialValue() {
            return new double[16];
        }
    };

    /* JADX INFO: renamed from: com.facebook.react.uimanager.TransformHelper$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static double convertToRadians(ReadableMap readableMap, String str) {
        double d2;
        boolean z2 = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z2 = false;
            }
            d2 = Float.parseFloat(string);
        } else {
            d2 = readableMap.getDouble(str);
        }
        return z2 ? d2 : MatrixMathHelper.degreesToRadians(d2);
    }

    private static float[] getTranslateForTransformOrigin(float f2, float f3, ReadableArray readableArray, boolean z2) {
        if (readableArray == null) {
            return null;
        }
        if (f3 == 0.0f && f2 == 0.0f) {
            return null;
        }
        float f4 = f2 / 2.0f;
        float f5 = f3 / 2.0f;
        float[] fArr = new float[3];
        fArr[0] = f4;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        int i2 = 0;
        while (i2 < readableArray.size() && i2 < 3) {
            int i3 = AnonymousClass2.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i2).ordinal()];
            if (i3 == 1) {
                fArr[i2] = (float) readableArray.getDouble(i2);
            } else if (i3 == 2 && z2) {
                String string = readableArray.getString(i2);
                if (string.endsWith("%")) {
                    fArr[i2] = ((i2 == 0 ? f2 : f3) * Float.parseFloat(string.substring(0, string.length() - 1))) / 100.0f;
                }
            }
            i2++;
        }
        return new float[]{(-f4) + fArr[0], (-f5) + fArr[1], fArr[2]};
    }

    private static double parseTranslateValue(String str, double d2) {
        try {
            return str.endsWith("%") ? (Double.parseDouble(str.substring(0, str.length() - 1)) * d2) / 100.0d : Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            FLog.w(ReactConstants.TAG, "Invalid translate value: " + str);
            return 0.0d;
        }
    }

    @Deprecated(forRemoval = true, since = "0.75")
    public static void processTransform(ReadableArray readableArray, double[] dArr) {
        processTransform(readableArray, dArr, 0.0f, 0.0f, null, false);
    }

    @Deprecated(forRemoval = true, since = "0.75")
    public static void processTransform(ReadableArray readableArray, double[] dArr, float f2, float f3, ReadableArray readableArray2) {
        processTransform(readableArray, dArr, f2, f3, readableArray2, false);
    }

    public static void processTransform(ReadableArray readableArray, double[] dArr, float f2, float f3, ReadableArray readableArray2, boolean z2) {
        double[] dArr2 = sHelperMatrix.get();
        MatrixMathHelper.resetIdentityMatrix(dArr);
        float[] translateForTransformOrigin = getTranslateForTransformOrigin(f2, f3, readableArray2, z2);
        if (translateForTransformOrigin != null) {
            MatrixMathHelper.resetIdentityMatrix(dArr2);
            MatrixMathHelper.applyTranslate3D(dArr2, translateForTransformOrigin[0], translateForTransformOrigin[1], translateForTransformOrigin[2]);
            MatrixMathHelper.multiplyInto(dArr, dArr, dArr2);
        }
        int i2 = 16;
        if (readableArray.size() == 16 && readableArray.getType(0) == ReadableType.Number) {
            MatrixMathHelper.resetIdentityMatrix(dArr2);
            for (int i3 = 0; i3 < readableArray.size(); i3++) {
                dArr2[i3] = readableArray.getDouble(i3);
            }
            MatrixMathHelper.multiplyInto(dArr, dArr, dArr2);
        } else {
            int size = readableArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                ReadableMap map = readableArray.getMap(i4);
                String strNextKey = map.keySetIterator().nextKey();
                MatrixMathHelper.resetIdentityMatrix(dArr2);
                if ("matrix".equals(strNextKey)) {
                    ReadableArray array = map.getArray(strNextKey);
                    for (int i5 = 0; i5 < i2; i5++) {
                        dArr2[i5] = array.getDouble(i5);
                    }
                } else if ("perspective".equals(strNextKey)) {
                    MatrixMathHelper.applyPerspective(dArr2, map.getDouble(strNextKey));
                } else if ("rotateX".equals(strNextKey)) {
                    MatrixMathHelper.applyRotateX(dArr2, convertToRadians(map, strNextKey));
                } else if ("rotateY".equals(strNextKey)) {
                    MatrixMathHelper.applyRotateY(dArr2, convertToRadians(map, strNextKey));
                } else if ("rotate".equals(strNextKey) || "rotateZ".equals(strNextKey)) {
                    MatrixMathHelper.applyRotateZ(dArr2, convertToRadians(map, strNextKey));
                } else if ("scale".equals(strNextKey)) {
                    double d2 = map.getDouble(strNextKey);
                    MatrixMathHelper.applyScaleX(dArr2, d2);
                    MatrixMathHelper.applyScaleY(dArr2, d2);
                } else if ("scaleX".equals(strNextKey)) {
                    MatrixMathHelper.applyScaleX(dArr2, map.getDouble(strNextKey));
                } else if ("scaleY".equals(strNextKey)) {
                    MatrixMathHelper.applyScaleY(dArr2, map.getDouble(strNextKey));
                } else if ("translate".equals(strNextKey)) {
                    ReadableArray array2 = map.getArray(strNextKey);
                    i2 = 16;
                    MatrixMathHelper.applyTranslate3D(dArr2, (array2.getType(0) == ReadableType.String && z2) ? parseTranslateValue(array2.getString(0), f2) : array2.getDouble(0), (array2.getType(1) == ReadableType.String && z2) ? parseTranslateValue(array2.getString(1), f3) : array2.getDouble(1), array2.size() > 2 ? array2.getDouble(2) : 0.0d);
                } else {
                    i2 = 16;
                    if (ViewProps.TRANSLATE_X.equals(strNextKey)) {
                        MatrixMathHelper.applyTranslate2D(dArr2, (map.getType(strNextKey) == ReadableType.String && z2) ? parseTranslateValue(map.getString(strNextKey), f2) : map.getDouble(strNextKey), 0.0d);
                    } else if (ViewProps.TRANSLATE_Y.equals(strNextKey)) {
                        MatrixMathHelper.applyTranslate2D(dArr2, 0.0d, (map.getType(strNextKey) == ReadableType.String && z2) ? parseTranslateValue(map.getString(strNextKey), f3) : map.getDouble(strNextKey));
                    } else if ("skewX".equals(strNextKey)) {
                        MatrixMathHelper.applySkewX(dArr2, convertToRadians(map, strNextKey));
                    } else if ("skewY".equals(strNextKey)) {
                        MatrixMathHelper.applySkewY(dArr2, convertToRadians(map, strNextKey));
                    } else {
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + strNextKey);
                    }
                }
                MatrixMathHelper.multiplyInto(dArr, dArr, dArr2);
            }
        }
        if (translateForTransformOrigin != null) {
            MatrixMathHelper.resetIdentityMatrix(dArr2);
            MatrixMathHelper.applyTranslate3D(dArr2, -translateForTransformOrigin[0], -translateForTransformOrigin[1], -translateForTransformOrigin[2]);
            MatrixMathHelper.multiplyInto(dArr, dArr, dArr2);
        }
    }
}
