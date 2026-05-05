package com.dynatrace.agent.events;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface EventModifier {
    JSONObject modifyEvent(JSONObject event, Object[] eventContext);
}
