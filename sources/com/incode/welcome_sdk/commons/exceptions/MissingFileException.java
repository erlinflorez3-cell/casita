package com.incode.welcome_sdk.commons.exceptions;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class MissingFileException extends Exception {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5042a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5043c = 1;

    public MissingFileException(Throwable th) {
        super("File or file path is missing.", th);
    }

    public /* synthetic */ MissingFileException(Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : th);
    }

    static {
        int i2 = 1 + 69;
        f5042a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public MissingFileException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
