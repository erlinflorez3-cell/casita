package com.dynatrace.agent.events;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface EventFieldsProvider {
    JSONObject get() throws JSONException;
}
