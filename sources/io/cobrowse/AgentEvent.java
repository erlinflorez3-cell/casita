package io.cobrowse;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class AgentEvent {
    final String display;

    AgentEvent(String str) {
        this.display = str;
    }

    AgentEvent(Map<String, Object> map) throws SerializationError {
        this.display = (String) TypeUtils.checkNonNull(map.get("display"), String.class);
    }
}
