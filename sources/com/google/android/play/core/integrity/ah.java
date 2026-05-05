package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes9.dex */
final class ah extends y {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ai f3339a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ai aiVar, String str, long j2) {
        super(str, j2);
        this.f3339a = aiVar;
    }

    @Override // com.google.android.play.core.integrity.y
    final Task b(Activity activity, Bundle bundle) {
        return this.f3339a.f3340a.b(activity, bundle);
    }
}
