package com.rnmaps.maps;

import android.content.Context;
import com.facebook.react.views.view.ReactViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public class MapCallout extends ReactViewGroup {
    public int height;
    private boolean tooltip;
    public int width;

    public MapCallout(Context context) {
        super(context);
        this.tooltip = false;
    }

    public boolean getTooltip() {
        return this.tooltip;
    }

    public void setTooltip(boolean z2) {
        this.tooltip = z2;
    }
}
