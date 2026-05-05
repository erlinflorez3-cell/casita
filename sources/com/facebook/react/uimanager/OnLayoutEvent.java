package com.facebook.react.uimanager;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes3.dex */
public class OnLayoutEvent extends Event<OnLayoutEvent> {
    private static final Pools.SynchronizedPool<OnLayoutEvent> EVENTS_POOL = new Pools.SynchronizedPool<>(20);
    private int mHeight;
    private int mWidth;
    private int mX;
    private int mY;

    private OnLayoutEvent() {
    }

    @Deprecated
    public static OnLayoutEvent obtain(int i2, int i3, int i4, int i5, int i6) {
        return obtain(-1, i2, i3, i4, i5, i6);
    }

    public static OnLayoutEvent obtain(int i2, int i3, int i4, int i5, int i6, int i7) {
        OnLayoutEvent onLayoutEventAcquire = EVENTS_POOL.acquire();
        if (onLayoutEventAcquire == null) {
            onLayoutEventAcquire = new OnLayoutEvent();
        }
        onLayoutEventAcquire.init(i2, i3, i4, i5, i6, i7);
        return onLayoutEventAcquire;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", PixelUtil.toDIPFromPixel(this.mX));
        writableMapCreateMap.putDouble("y", PixelUtil.toDIPFromPixel(this.mY));
        writableMapCreateMap.putDouble("width", PixelUtil.toDIPFromPixel(this.mWidth));
        writableMapCreateMap.putDouble("height", PixelUtil.toDIPFromPixel(this.mHeight));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("layout", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topLayout";
    }

    @Deprecated
    protected void init(int i2, int i3, int i4, int i5, int i6) {
        init(-1, i2, i3, i4, i5, i6);
    }

    protected void init(int i2, int i3, int i4, int i5, int i6, int i7) {
        super.init(i2, i3);
        this.mX = i4;
        this.mY = i5;
        this.mWidth = i6;
        this.mHeight = i7;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        EVENTS_POOL.release(this);
    }
}
