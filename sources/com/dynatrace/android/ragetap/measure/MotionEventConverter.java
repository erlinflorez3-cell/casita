package com.dynatrace.android.ragetap.measure;

import android.view.MotionEvent;
import com.dynatrace.android.ragetap.detection.TapEventData;

/* JADX INFO: loaded from: classes3.dex */
public class MotionEventConverter {
    private final float inverseDensity;

    public MotionEventConverter(float f2) {
        float f3 = 1.0f / f2;
        this.inverseDensity = f3;
        if (Float.isNaN(f3) || Float.isInfinite(f3)) {
            throw new ArithmeticException("invalid value");
        }
    }

    public TapEventData convertToTapEvent(MotionEvent motionEvent, long j2) {
        int actionIndex = motionEvent.getActionIndex();
        return new TapEventData(this.inverseDensity * motionEvent.getX(actionIndex), motionEvent.getY(actionIndex) * this.inverseDensity, j2, motionEvent.getEventTime());
    }
}
