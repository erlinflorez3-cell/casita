package com.incode.welcome_sdk.results;

import com.incode.welcome_sdk.data.Event;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class EventResult {
    public static final int $stable = 8;
    private final Event event;
    private final HashMap<String, Object> eventData;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventResult copy$default(EventResult eventResult, Event event, HashMap map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            event = eventResult.event;
        }
        if ((i2 & 2) != 0) {
            map = eventResult.eventData;
        }
        return eventResult.copy(event, map);
    }

    public final Event component1() {
        return this.event;
    }

    public final HashMap<String, Object> component2() {
        return this.eventData;
    }

    public final EventResult copy(Event event, HashMap<String, Object> map) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new EventResult(event, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventResult)) {
            return false;
        }
        EventResult eventResult = (EventResult) obj;
        return this.event == eventResult.event && Intrinsics.areEqual(this.eventData, eventResult.eventData);
    }

    public final int hashCode() {
        int iHashCode = this.event.hashCode() * 31;
        HashMap<String, Object> map = this.eventData;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "EventResult(event=" + this.event + ", eventData=" + this.eventData + ")";
    }

    public EventResult(Event event, HashMap<String, Object> map) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.event = event;
        this.eventData = map;
    }

    public final Event getEvent() {
        return this.event;
    }

    public final HashMap<String, Object> getEventData() {
        return this.eventData;
    }
}
