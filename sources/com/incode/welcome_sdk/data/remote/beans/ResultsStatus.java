package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public enum ResultsStatus {
    OK(R.drawable.onboard_sdk_results_status_ok, R.drawable.onboard_sdk_avatar_status_passed, R.color.onboard_sdk_state_success),
    WARN(R.drawable.onboard_sdk_results_status_warn, R.drawable.onboard_sdk_avatar_status_failed, R.color.onboard_sdk_state_warn),
    FAIL(R.drawable.onboard_sdk_results_status_fail, R.drawable.onboard_sdk_avatar_status_failed, R.color.onboard_sdk_state_destructive),
    UNKNOWN(R.drawable.onboard_sdk_results_status_unknown, R.drawable.onboard_sdk_avatar_status_failed, R.color.onboard_sdk_state_unknown),
    MANUAL(R.drawable.onboard_sdk_ine_error_small, R.drawable.onboard_sdk_avatar_status_failed, R.color.onboard_sdk_state_warn);

    private int avatarIconResId;
    private int colorResId;
    private int iconResId;

    ResultsStatus(int i2, int i3, int i4) {
        this.iconResId = i2;
        this.avatarIconResId = i3;
        this.colorResId = i4;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final int getAvatarIconResId() {
        return this.avatarIconResId;
    }

    public final int getColorResId() {
        return this.colorResId;
    }

    public final boolean isPositive() {
        return equals(OK);
    }

    public final boolean isManualCheckNeeded() {
        return equals(MANUAL);
    }
}
