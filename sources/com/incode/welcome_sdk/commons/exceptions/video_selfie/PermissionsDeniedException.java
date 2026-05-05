package com.incode.welcome_sdk.commons.exceptions.video_selfie;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public class PermissionsDeniedException extends VideoSelfieException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5076c = 3 % 128;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5077e = 0;

    public PermissionsDeniedException(String str) {
        super(str);
    }

    public /* synthetic */ PermissionsDeniedException(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "User denied mandatory permissions" : str);
    }

    static {
        int i2 = 3 % 2;
    }

    public PermissionsDeniedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
