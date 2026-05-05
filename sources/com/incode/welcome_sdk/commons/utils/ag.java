package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionConfig;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import com.incode.welcome_sdk.IncodeWelcome;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6378a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6379b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6380c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ag f6381d = new ag();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6382e = 0;

    private ag() {
    }

    @JvmStatic
    public static final Intent d(Context context) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
        if (mediaProjectionManager != null) {
            int i3 = f6382e + 15;
            f6379b = i3 % 128;
            int i4 = i3 % 2;
            return Build.VERSION.SDK_INT >= 34 ? mediaProjectionManager.createScreenCaptureIntent(MediaProjectionConfig.createConfigForDefaultDisplay()) : mediaProjectionManager.createScreenCaptureIntent();
        }
        int i5 = f6382e + 73;
        f6379b = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static boolean b() {
        int i2 = 2 % 2;
        int i3 = f6379b + 45;
        f6382e = i3 % 128;
        if (i3 % 2 == 0) {
            IncodeWelcome.RecordingPermissionData recordingPermissionData = IncodeWelcome.recordingPermissionData;
            if (recordingPermissionData == null || recordingPermissionData.getResultCode() != -1) {
                return false;
            }
            int i4 = f6379b + 9;
            f6382e = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            throw null;
        }
        IncodeWelcome.RecordingPermissionData recordingPermissionData2 = IncodeWelcome.recordingPermissionData;
        throw null;
    }

    static {
        int i2 = f6378a + 21;
        f6380c = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
    }
}
