package com.incode.welcome_sdk.c;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Activity> f4503c = new ArrayList();

    @Override // com.incode.welcome_sdk.c.c, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityCreated(activity, bundle);
        this.f4503c.add(activity);
    }

    @Override // com.incode.welcome_sdk.c.c, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityDestroyed(activity);
        this.f4503c.remove(activity);
    }

    public final boolean a() {
        boolean z2 = false;
        if (this.f4503c.size() > 0) {
            for (Activity activity : CollectionsKt.reversed(this.f4503c)) {
                if (!activity.isFinishing()) {
                    activity.finish();
                    z2 = true;
                }
            }
            this.f4503c.clear();
        }
        return z2;
    }
}
