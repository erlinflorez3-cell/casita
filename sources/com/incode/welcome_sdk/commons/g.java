package com.incode.welcome_sdk.commons;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import io.sentry.protocol.SentryStackFrame;
import kotlin.jvm.internal.Intrinsics;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5151b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5152c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Activity f5153d;

    public g(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.f5153d = activity;
    }

    public final Activity e() throws Exception {
        int i2 = 2 % 2;
        Activity activity = this.f5153d;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, this.f5153d.getPackageName(), null));
        CX.ud();
        activity.startActivityForResult(intent, 0);
        int i3 = f5151b + 49;
        f5152c = i3 % 128;
        if (i3 % 2 == 0) {
            return activity;
        }
        throw null;
    }
}
