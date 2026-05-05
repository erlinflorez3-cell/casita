package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.FilterProperties;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
class FeBlendView extends FilterPrimitiveView {
    String mIn1;
    String mIn2;
    FilterProperties.FeBlendMode mMode;

    /* JADX INFO: renamed from: com.horcrux.svg.FeBlendView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode;

        static {
            int[] iArr = new int[FilterProperties.FeBlendMode.values().length];
            $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode = iArr;
            try {
                iArr[FilterProperties.FeBlendMode.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[FilterProperties.FeBlendMode.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[FilterProperties.FeBlendMode.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[FilterProperties.FeBlendMode.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[FilterProperties.FeBlendMode.DARKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[FilterProperties.FeBlendMode.MULTIPLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public FeBlendView(ReactContext reactContext) {
        super(reactContext);
        this.mFilterSubregion.mX = new SVGLength(0.0d);
        this.mFilterSubregion.mY = new SVGLength(0.0d);
        this.mFilterSubregion.mW = new SVGLength("100%");
        this.mFilterSubregion.mH = new SVGLength("100%");
    }

    static /* synthetic */ float[] lambda$applyFilter$0(float[] fArr, float[] fArr2) {
        float f2 = fArr[0];
        float f3 = fArr2[0];
        float f4 = fArr[1];
        float f5 = fArr2[1];
        float f6 = (f4 * f2 * (1.0f - f3)) + (f5 * f3 * (1.0f - f2)) + (f4 * f2 * f5 * f3);
        float f7 = fArr[2];
        float f8 = fArr2[2];
        float f9 = (f7 * f2 * (1.0f - f3)) + (f8 * f3 * (1.0f - f2)) + (f7 * f2 * f8 * f3);
        float f10 = fArr[3];
        float f11 = fArr2[3];
        return new float[]{1.0f - ((1.0f - f2) * (1.0f - f3)), f6, f9, (f10 * f2 * (1.0f - f3)) + (f11 * f3 * (1.0f - f2)) + (f10 * f2 * f11 * f3)};
    }

    @Override // com.horcrux.svg.FilterPrimitiveView
    public Bitmap applyFilter(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap source = getSource(map, bitmap, this.mIn1);
        Bitmap source2 = getSource(map, bitmap, this.mIn2);
        if (this.mMode == FilterProperties.FeBlendMode.MULTIPLY) {
            return CustomFilter.apply(source, source2, new CustomFilterFunction() { // from class: com.horcrux.svg.FeBlendView$$ExternalSyntheticLambda0
                @Override // com.horcrux.svg.CustomFilterFunction
                public final float[] execute(float[] fArr, float[] fArr2) {
                    return FeBlendView.lambda$applyFilter$0(fArr, fArr2);
                }
            });
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(source, 0.0f, 0.0f, paint);
        int i2 = AnonymousClass1.$SwitchMap$com$horcrux$svg$FilterProperties$FeBlendMode[this.mMode.ordinal()];
        if (i2 == 1 || i2 == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (i2 == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (i2 == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        } else if (i2 == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        }
        canvas.drawBitmap(source2, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public void setIn1(String str) {
        this.mIn1 = str;
        invalidate();
    }

    public void setIn2(String str) {
        this.mIn2 = str;
        invalidate();
    }

    public void setMode(String str) {
        this.mMode = FilterProperties.FeBlendMode.getEnum(str);
        invalidate();
    }
}
