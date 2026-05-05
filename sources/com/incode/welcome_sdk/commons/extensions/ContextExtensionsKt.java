package com.incode.welcome_sdk.commons.extensions;

import android.content.Context;
import android.content.Intent;
import com.incode.welcome_sdk.ui.BaseActivity;
import kotlin.jvm.internal.Intrinsics;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public final class ContextExtensionsKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5090b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5091e = 0;

    public static final void startActivityChained(Context context, Intent intent) throws Exception {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        if (!(context instanceof BaseActivity)) {
            CX.ud();
            context.startActivity(intent);
            return;
        }
        int i3 = f5091e + 21;
        f5090b = i3 % 128;
        int i4 = i3 % 2;
        ((BaseActivity) context).startActivityChained(intent);
        int i5 = f5090b + 41;
        f5091e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
    }
}
