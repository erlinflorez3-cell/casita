package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DeviceStats {
    public static final int $stable = 0;
    private final Status motionStatus;

    public DeviceStats() {
        this(null, 1, null);
    }

    public static /* synthetic */ DeviceStats copy$default(DeviceStats deviceStats, Status status, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            status = deviceStats.motionStatus;
        }
        return deviceStats.copy(status);
    }

    public final Status component1() {
        return this.motionStatus;
    }

    public final DeviceStats copy(Status motionStatus) {
        Intrinsics.checkNotNullParameter(motionStatus, "motionStatus");
        return new DeviceStats(motionStatus);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceStats) && this.motionStatus == ((DeviceStats) obj).motionStatus;
    }

    public final int hashCode() {
        return this.motionStatus.hashCode();
    }

    public final String toString() {
        return "DeviceStats(motionStatus=" + this.motionStatus + ")";
    }

    public DeviceStats(Status motionStatus) {
        Intrinsics.checkNotNullParameter(motionStatus, "motionStatus");
        this.motionStatus = motionStatus;
    }

    public /* synthetic */ DeviceStats(Status status, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Status.UNCLEAR : status);
    }

    public final Status getMotionStatus() {
        return this.motionStatus;
    }
}
