package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.FilterProperties;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
class FeColorMatrixView extends FilterPrimitiveView {
    String mIn1;
    FilterProperties.FeColorMatrixType mType;
    ReadableArray mValues;

    /* JADX INFO: renamed from: com.horcrux.svg.FeColorMatrixView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$FilterProperties$FeColorMatrixType;

        static {
            int[] iArr = new int[FilterProperties.FeColorMatrixType.values().length];
            $SwitchMap$com$horcrux$svg$FilterProperties$FeColorMatrixType = iArr;
            try {
                iArr[FilterProperties.FeColorMatrixType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeColorMatrixType[FilterProperties.FeColorMatrixType.SATURATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeColorMatrixType[FilterProperties.FeColorMatrixType.HUE_ROTATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeColorMatrixType[FilterProperties.FeColorMatrixType.LUMINANCE_TO_ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FeColorMatrixView(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.FilterPrimitiveView
    public Bitmap applyFilter(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap source = getSource(map, bitmap, this.mIn1);
        ColorMatrix colorMatrix = new ColorMatrix();
        int i2 = AnonymousClass1.$SwitchMap$com$horcrux$svg$FilterProperties$FeColorMatrixType[this.mType.ordinal()];
        if (i2 == 1) {
            if (this.mValues.size() < 20) {
                return source;
            }
            float[] fArr = new float[this.mValues.size()];
            for (int i3 = 0; i3 < this.mValues.size(); i3++) {
                fArr[i3] = ((float) this.mValues.getDouble(i3)) * (i3 % 5 == 4 ? 255 : 1);
            }
            colorMatrix.set(fArr);
        } else if (i2 == 2) {
            if (this.mValues.size() != 1) {
                return source;
            }
            colorMatrix.setSaturation((float) this.mValues.getDouble(0));
        } else if (i2 == 3) {
            if (this.mValues.size() != 1) {
                return source;
            }
            double d2 = (((double) ((float) this.mValues.getDouble(0))) * 3.141592653589793d) / 180.0d;
            float fCos = (float) Math.cos(d2);
            float fSin = (float) Math.sin(d2);
            float f2 = 0.715f - (fCos * 0.715f);
            float f3 = fSin * 0.715f;
            float f4 = 0.072f - (fCos * 0.072f);
            float f5 = 0.213f - (fCos * 0.213f);
            colorMatrix.set(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f2 - f3, f4 + (fSin * 0.928f), 0.0f, 0.0f, f5 + (0.143f * fSin), (0.285f * fCos) + 0.715f + (0.14f * fSin), f4 - (0.283f * fSin), 0.0f, 0.0f, f5 - (0.787f * fSin), f2 + f3, (fCos * 0.928f) + 0.072f + (fSin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        } else if (i2 == 4) {
            colorMatrix.set(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f});
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, source);
    }

    public void setIn1(String str) {
        this.mIn1 = str;
        invalidate();
    }

    public void setType(String str) {
        this.mType = FilterProperties.FeColorMatrixType.getEnum(str);
        invalidate();
    }

    public void setValues(ReadableArray readableArray) {
        this.mValues = readableArray;
        invalidate();
    }
}
