package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public class TouchEventCoalescingKeyHelper {
    private final SparseIntArray mDownTimeToCoalescingKey = new SparseIntArray();

    public void addCoalescingKey(long j2) {
        this.mDownTimeToCoalescingKey.put((int) j2, 0);
    }

    public short getCoalescingKey(long j2) {
        int i2 = this.mDownTimeToCoalescingKey.get((int) j2, -1);
        if (i2 != -1) {
            return (short) ((i2 + 65535) - (i2 | 65535));
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public boolean hasCoalescingKey(long j2) {
        return this.mDownTimeToCoalescingKey.get((int) j2, -1) != -1;
    }

    public void incrementCoalescingKey(long j2) {
        int i2 = (int) j2;
        int i3 = this.mDownTimeToCoalescingKey.get(i2, -1);
        if (i3 == -1) {
            throw new RuntimeException("Tried to increment non-existent cookie");
        }
        this.mDownTimeToCoalescingKey.put(i2, i3 + 1);
    }

    public void removeCoalescingKey(long j2) {
        this.mDownTimeToCoalescingKey.delete((int) j2);
    }
}
