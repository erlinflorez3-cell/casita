package com.incode.welcome_sdk.listeners;

import com.incode.welcome_sdk.data.local.Region;
import java.util.List;
import kotlin.Deprecated;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "This interface is deprecated as the region is no longer necessary in the onboarding flow.")
public interface FetchRegionsListener {
    void onError(Throwable th);

    void onRegionsFetched(List<Region> list);
}
