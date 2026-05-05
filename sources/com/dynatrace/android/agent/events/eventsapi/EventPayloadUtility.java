package com.dynatrace.android.agent.events.eventsapi;

import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
public final class EventPayloadUtility {
    private static final String KEY_URL_ENCODED = Utility.urlEncode("\"dt.send_timestamp\":");
    private static final String SEND_NOW_MACRO = "%%SEND_NOW%%";

    private EventPayloadUtility() {
    }

    public static String replaceMacroWithTime(String str, long j2) {
        StringBuilder sb = new StringBuilder();
        String str2 = KEY_URL_ENCODED;
        return str.replaceAll(sb.append(str2).append(SEND_NOW_MACRO).toString(), str2 + j2);
    }

    public static String replacePlaceholderWithMacro(String str) {
        StringBuilder sb = new StringBuilder();
        String str2 = KEY_URL_ENCODED;
        return str.replaceFirst(sb.append(str2).append(EnrichmentAttributesGenerator.SEND_NOW_PLACEHOLDER).toString(), str2 + SEND_NOW_MACRO);
    }
}
