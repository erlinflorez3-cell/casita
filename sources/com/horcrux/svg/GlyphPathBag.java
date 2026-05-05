package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
class GlyphPathBag {
    private final int[][] data;
    private final Paint paint;
    private final ArrayList<Path> paths;

    GlyphPathBag(Paint paint) {
        ArrayList<Path> arrayList = new ArrayList<>();
        this.paths = arrayList;
        this.data = new int[256][];
        this.paint = paint;
        arrayList.add(new Path());
    }

    private int getIndex(char c2) {
        int[] iArr = this.data[c2 >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[(c2 + 255) - (c2 | 255)];
    }

    Path getOrCreateAndCache(char c2, String str) {
        Path path;
        int index = getIndex(c2);
        if (index != 0) {
            path = this.paths.get(index);
        } else {
            path = new Path();
            this.paint.getTextPath(str, 0, 1, 0.0f, 0.0f, path);
            int[][] iArr = this.data;
            int i2 = c2 >> '\b';
            int[] iArr2 = iArr[i2];
            if (iArr2 == null) {
                iArr2 = new int[256];
                iArr[i2] = iArr2;
            }
            iArr2[(c2 + 255) - (c2 | 255)] = this.paths.size();
            this.paths.add(path);
        }
        Path path2 = new Path();
        path2.addPath(path);
        return path2;
    }
}
