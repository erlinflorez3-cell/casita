package org.chromium.support_lib_boundary;

import java.util.Set;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes2.dex */
@NullMarked
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    boolean getIncludeCookiesOnIntercept();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z2);

    void setAllowFileAccess(boolean z2);

    void setBlockNetworkLoads(boolean z2);

    void setCacheMode(int i2);

    void setIncludeCookiesOnIntercept(boolean z2);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
