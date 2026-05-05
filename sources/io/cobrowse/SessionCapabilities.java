package io.cobrowse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class SessionCapabilities {
    private final Map<String, Boolean> capabilities = new HashMap();

    SessionCapabilities(String[] strArr) {
        fill(strArr);
    }

    static boolean isForbidden(String[] strArr, String str) {
        return !Arrays.asList(strArr).contains(str);
    }

    Map<String, Boolean> all() {
        return this.capabilities;
    }

    void fill(String[] strArr) {
        this.capabilities.clear();
        for (String str : strArr) {
            this.capabilities.put(str, true);
        }
    }

    String[] toArray() {
        HashSet hashSet = new HashSet();
        for (String str : this.capabilities.keySet()) {
            if (Boolean.TRUE.equals(this.capabilities.get(str))) {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    void toggle(String str, boolean z2) {
        if (this.capabilities.containsKey(str)) {
            this.capabilities.put(str, Boolean.valueOf(z2));
        }
    }

    void toggle(String[] strArr, boolean z2) {
        for (String str : strArr) {
            toggle(str, z2);
        }
    }
}
