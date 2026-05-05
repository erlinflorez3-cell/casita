package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.Size;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class LegacyPreviewScalingStrategy extends PreviewScalingStrategy {
    private static final String TAG = "LegacyPreviewScalingStrategy";

    public static Size scale(Size size, Size size2) {
        Size sizeScale;
        if (size2.fitsIn(size)) {
            while (true) {
                sizeScale = size.scale(2, 3);
                Size sizeScale2 = size.scale(1, 2);
                if (!size2.fitsIn(sizeScale2)) {
                    break;
                }
                size = sizeScale2;
            }
            return size2.fitsIn(sizeScale) ? sizeScale : size;
        }
        do {
            Size sizeScale3 = size.scale(3, 2);
            size = size.scale(2, 1);
            if (size2.fitsIn(sizeScale3)) {
                return sizeScale3;
            }
        } while (!size2.fitsIn(size));
        return size;
    }

    @Override // com.journeyapps.barcodescanner.camera.PreviewScalingStrategy
    public Size getBestPreviewSize(List<Size> list, final Size size) {
        if (size == null) {
            return list.get(0);
        }
        Collections.sort(list, new Comparator<Size>() { // from class: com.journeyapps.barcodescanner.camera.LegacyPreviewScalingStrategy.1
            @Override // java.util.Comparator
            public int compare(Size size2, Size size3) {
                int i2 = LegacyPreviewScalingStrategy.scale(size2, size).width - size2.width;
                int i3 = LegacyPreviewScalingStrategy.scale(size3, size).width - size3.width;
                if (i2 == 0 && i3 == 0) {
                    return size2.compareTo(size3);
                }
                if (i2 == 0) {
                    return -1;
                }
                if (i3 == 0) {
                    return 1;
                }
                return (i2 >= 0 || i3 >= 0) ? (i2 <= 0 || i3 <= 0) ? i2 < 0 ? -1 : 1 : -size2.compareTo(size3) : size2.compareTo(size3);
            }
        });
        String str = TAG;
        String str2 = "Viewfinder size: " + size;
        String str3 = "Preview in order of preference: " + list;
        return list.get(0);
    }

    @Override // com.journeyapps.barcodescanner.camera.PreviewScalingStrategy
    public Rect scalePreview(Size size, Size size2) {
        Size sizeScale = scale(size, size2);
        String str = TAG;
        String str2 = "Preview: " + size + "; Scaled: " + sizeScale + "; Want: " + size2;
        int i2 = (sizeScale.width - size2.width) / 2;
        int i3 = (sizeScale.height - size2.height) / 2;
        return new Rect(-i2, -i3, sizeScale.width - i2, sizeScale.height - i3);
    }
}
