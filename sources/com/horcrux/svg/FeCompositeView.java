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
class FeCompositeView extends FilterPrimitiveView {
    String mIn1;
    String mIn2;
    float mK1;
    float mK2;
    float mK3;
    float mK4;
    FilterProperties.FeCompositeOperator mOperator;

    /* JADX INFO: renamed from: com.horcrux.svg.FeCompositeView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator;

        static {
            int[] iArr = new int[FilterProperties.FeCompositeOperator.values().length];
            $SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator = iArr;
            try {
                iArr[FilterProperties.FeCompositeOperator.OVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator[FilterProperties.FeCompositeOperator.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator[FilterProperties.FeCompositeOperator.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator[FilterProperties.FeCompositeOperator.ATOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator[FilterProperties.FeCompositeOperator.XOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator[FilterProperties.FeCompositeOperator.ARITHMETIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public FeCompositeView(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.FilterPrimitiveView
    public Bitmap applyFilter(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap source = getSource(map, bitmap, this.mIn1);
        Bitmap source2 = getSource(map, bitmap, this.mIn2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(source, 0.0f, 0.0f, paint);
        switch (AnonymousClass1.$SwitchMap$com$horcrux$svg$FilterProperties$FeCompositeOperator[this.mOperator.ordinal()]) {
            case 1:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                break;
            case 2:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                break;
            case 3:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                break;
            case 4:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                break;
            case 5:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                break;
            case 6:
                int width = bitmapCreateBitmap.getWidth() * bitmapCreateBitmap.getHeight();
                int[] iArr = new int[width];
                int[] iArr2 = new int[width];
                bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                source2 = source2;
                source2.getPixels(iArr2, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                for (int i2 = 0; i2 < width; i2++) {
                    int i3 = iArr[i2];
                    int i4 = iArr2[i2];
                    int i5 = (i3 >> 16) & 255;
                    int i6 = (-1) - (((-1) - (i3 >> 8)) | ((-1) - 255));
                    int i7 = (i3 + 255) - (255 | i3);
                    int i8 = i3 >>> 24;
                    int i9 = i4 >> 8;
                    int i10 = (i9 + 255) - (i9 | 255);
                    int i11 = (-1) - (((-1) - i4) | ((-1) - 255));
                    int i12 = i4 >>> 24;
                    float f2 = this.mK1;
                    float f3 = i5;
                    float f4 = (i4 >> 16) & 255;
                    float f5 = this.mK2;
                    float f6 = this.mK3;
                    float f7 = (f2 * f3 * f4) + (f3 * f5) + (f4 * f6);
                    float f8 = this.mK4;
                    float f9 = i6;
                    float f10 = i10;
                    int i13 = (int) ((f2 * f9 * f10) + (f9 * f5) + (f10 * f6) + f8);
                    float f11 = i7;
                    float f12 = i11;
                    int i14 = (int) ((f2 * f11 * f12) + (f11 * f5) + (f12 * f6) + f8);
                    float f13 = i8;
                    float f14 = i12;
                    int iMin = Math.min(255, Math.max(0, (int) (f7 + f8)));
                    int iMin2 = Math.min(255, Math.max(0, i13));
                    int iMin3 = Math.min(255, Math.max(0, i14));
                    int iMin4 = Math.min(255, Math.max(0, (int) (((((f2 * f13) * f14) + (f5 * f13)) + (f6 * f14)) + f8))) << 24;
                    int i15 = iMin << 16;
                    int i16 = (iMin4 + i15) - (iMin4 & i15);
                    int i17 = iMin2 << 8;
                    iArr[i2] = ((i16 + i17) - (i16 & i17)) | iMin3;
                }
                bitmapCreateBitmap.setPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                break;
        }
        if (this.mOperator != FilterProperties.FeCompositeOperator.ARITHMETIC) {
            canvas.drawBitmap(source2, 0.0f, 0.0f, paint);
        }
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

    public void setK1(Float f2) {
        this.mK1 = f2.floatValue();
        invalidate();
    }

    public void setK2(Float f2) {
        this.mK2 = f2.floatValue();
        invalidate();
    }

    public void setK3(Float f2) {
        this.mK3 = f2.floatValue();
        invalidate();
    }

    public void setK4(Float f2) {
        this.mK4 = f2.floatValue();
        invalidate();
    }

    public void setOperator(String str) {
        this.mOperator = FilterProperties.FeCompositeOperator.getEnum(str);
        invalidate();
    }
}
