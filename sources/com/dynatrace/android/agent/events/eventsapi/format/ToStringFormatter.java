package com.dynatrace.android.agent.events.eventsapi.format;

/* JADX INFO: loaded from: classes3.dex */
public class ToStringFormatter<T> implements Formatter<T, String> {
    @Override // com.dynatrace.android.agent.events.eventsapi.format.Formatter
    public String format(T t2) {
        if (t2 == null) {
            return null;
        }
        return String.valueOf(t2);
    }
}
