package io.cobrowse;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class StreamMessage extends HashMap<String, Object> {
    private final String messageKey;

    protected StreamMessage(String str) {
        this.messageKey = str;
        put("timestamp", UTCDate.now());
    }

    protected StreamMessage(String str, Map<String, Object> map) {
        super(map);
        this.messageKey = str;
    }

    public String getMessageKey() {
        return this.messageKey;
    }
}
