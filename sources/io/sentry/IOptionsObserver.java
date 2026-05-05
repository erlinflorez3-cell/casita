package io.sentry;

import io.sentry.protocol.SdkVersion;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface IOptionsObserver {
    void setDist(String str);

    void setEnvironment(String str);

    void setProguardUuid(String str);

    void setRelease(String str);

    void setReplayErrorSampleRate(Double d2);

    void setSdkVersion(SdkVersion sdkVersion);

    void setTags(Map<String, String> map);
}
