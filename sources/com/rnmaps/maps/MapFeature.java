package com.rnmaps.maps;

import android.content.Context;
import com.facebook.react.views.view.ReactViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MapFeature extends ReactViewGroup {
    public MapFeature(Context context) {
        super(context);
    }

    public abstract void addToMap(Object obj);

    public abstract Object getFeature();

    public abstract void removeFromMap(Object obj);
}
