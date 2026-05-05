package io.cobrowse;

import io.sentry.protocol.SentryThread;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class KeyEvent extends AgentEvent {
    final String code;
    final String key;
    final String state;

    KeyEvent(Map<String, Object> map) throws SerializationError {
        super(map);
        this.key = (String) TypeUtils.checkNonNull(map.get("key"), String.class);
        this.code = (String) TypeUtils.checkNonNull(map.get("code"), String.class);
        this.state = (String) TypeUtils.checkNonNull(map.get(SentryThread.JsonKeys.STATE), String.class);
    }

    public boolean isKeyDown() {
        return this.state.equalsIgnoreCase("keydown");
    }

    public boolean isKeyUp() {
        return this.state.equalsIgnoreCase("keyup");
    }
}
