package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface Text {
    Rect getBoundingBox();

    List<? extends Text> getComponents();

    Point[] getCornerPoints();

    String getLanguage();

    String getValue();
}
