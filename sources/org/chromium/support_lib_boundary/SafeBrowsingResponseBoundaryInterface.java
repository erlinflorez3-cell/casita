package org.chromium.support_lib_boundary;

import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes2.dex */
@NullMarked
public interface SafeBrowsingResponseBoundaryInterface {
    void backToSafety(boolean z2);

    void proceed(boolean z2);

    void showInterstitial(boolean z2);
}
