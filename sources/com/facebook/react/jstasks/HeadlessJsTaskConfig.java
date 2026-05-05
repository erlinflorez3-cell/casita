package com.facebook.react.jstasks;

import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes3.dex */
public class HeadlessJsTaskConfig {
    private final boolean mAllowedInForeground;
    private final WritableMap mData;
    private final HeadlessJsTaskRetryPolicy mRetryPolicy;
    private final String mTaskKey;
    private final long mTimeout;

    public HeadlessJsTaskConfig(HeadlessJsTaskConfig headlessJsTaskConfig) {
        this.mTaskKey = headlessJsTaskConfig.mTaskKey;
        this.mData = headlessJsTaskConfig.mData.copy();
        this.mTimeout = headlessJsTaskConfig.mTimeout;
        this.mAllowedInForeground = headlessJsTaskConfig.mAllowedInForeground;
        HeadlessJsTaskRetryPolicy headlessJsTaskRetryPolicy = headlessJsTaskConfig.mRetryPolicy;
        if (headlessJsTaskRetryPolicy != null) {
            this.mRetryPolicy = headlessJsTaskRetryPolicy.copy();
        } else {
            this.mRetryPolicy = null;
        }
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap) {
        this(str, writableMap, 0L, false);
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap, long j2) {
        this(str, writableMap, j2, false);
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap, long j2, boolean z2) {
        this(str, writableMap, j2, z2, NoRetryPolicy.INSTANCE);
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap, long j2, boolean z2, HeadlessJsTaskRetryPolicy headlessJsTaskRetryPolicy) {
        this.mTaskKey = str;
        this.mData = writableMap;
        this.mTimeout = j2;
        this.mAllowedInForeground = z2;
        this.mRetryPolicy = headlessJsTaskRetryPolicy;
    }

    WritableMap getData() {
        return this.mData;
    }

    HeadlessJsTaskRetryPolicy getRetryPolicy() {
        return this.mRetryPolicy;
    }

    String getTaskKey() {
        return this.mTaskKey;
    }

    long getTimeout() {
        return this.mTimeout;
    }

    boolean isAllowedInForeground() {
        return this.mAllowedInForeground;
    }
}
