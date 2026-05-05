package com.incode.welcome_sdk.commons.exceptions;

/* JADX INFO: loaded from: classes5.dex */
public final class InsufficientDiskSpaceException extends RuntimeException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5034b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5035c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5036d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5037e = 87 % 128;
    private final double availableSpaceMB;
    private final double requiredSpaceMB;
    private final double totalDiskSpaceMB;

    public final double getAvailableSpaceMB() {
        int i2 = 2 % 2;
        int i3 = f5034b + 67;
        int i4 = i3 % 128;
        f5036d = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        double d2 = this.availableSpaceMB;
        int i5 = i4 + 25;
        f5034b = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final double getRequiredSpaceMB() {
        int i2 = 2 % 2;
        int i3 = f5036d + 49;
        f5034b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.requiredSpaceMB;
        }
        throw null;
    }

    public final double getTotalDiskSpaceMB() {
        int i2 = 2 % 2;
        int i3 = f5034b + 71;
        int i4 = i3 % 128;
        f5036d = i4;
        int i5 = i3 % 2;
        double d2 = this.totalDiskSpaceMB;
        if (i5 == 0) {
            int i6 = 68 / 0;
        }
        int i7 = i4 + 111;
        f5034b = i7 % 128;
        if (i7 % 2 == 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public InsufficientDiskSpaceException(double d2, double d3, double d4) {
        super("Not enough disk space to store ML models. Available: " + d2 + " MB, Required: " + d3 + " MB, Total: " + d4 + " MB.");
        this.availableSpaceMB = d2;
        this.requiredSpaceMB = d3;
        this.totalDiskSpaceMB = d4;
    }

    static {
        int i2 = 87 % 2;
    }
}
