package com.dynatrace.android.agent.useraction;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.layout.LayoutInfo;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface OneAgentUserInteractionManagerBridge {
    void onComposeHit(LayoutInfo hitArea, List<LayoutInfo> overlappedAreas, List<List<String>> sequentialList);

    void onMotionEvent(View rootView, MotionEvent event);

    void onViewClick(View view);
}
