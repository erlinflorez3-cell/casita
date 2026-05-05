package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;

/* JADX INFO: loaded from: classes3.dex */
class ReactTextInputSelectionEvent extends Event<ReactTextInputSelectionEvent> {
    private static final String EVENT_NAME = "topSelectionChange";
    private int mSelectionEnd;
    private int mSelectionStart;

    @Deprecated
    public ReactTextInputSelectionEvent(int i2, int i3, int i4) {
        this(-1, i2, i3, i4);
    }

    public ReactTextInputSelectionEvent(int i2, int i3, int i4, int i5) {
        super(i2, i3);
        this.mSelectionStart = i4;
        this.mSelectionEnd = i5;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt(ViewProps.END, this.mSelectionEnd);
        writableMapCreateMap2.putInt(ViewProps.START, this.mSelectionStart);
        writableMapCreateMap.putMap("selection", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }
}
