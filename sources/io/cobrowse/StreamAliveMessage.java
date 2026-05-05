package io.cobrowse;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class StreamAliveMessage extends StreamMessage {
    private static final String MESSAGE_KEY = "alive";

    public StreamAliveMessage(Map<String, Object> map) {
        super(MESSAGE_KEY, map);
    }
}
