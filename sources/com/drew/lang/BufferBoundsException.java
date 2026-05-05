package com.drew.lang;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class BufferBoundsException extends IOException {
    private static final long serialVersionUID = 2911102837808946396L;

    public BufferBoundsException(int i2, int i3, long j2) {
        super(getMessage(i2, i3, j2));
    }

    public BufferBoundsException(String str) {
        super(str);
    }

    private static String getMessage(int i2, int i3, long j2) {
        return i2 < 0 ? String.format("Attempt to read from buffer using a negative index (%d)", Integer.valueOf(i2)) : i3 < 0 ? String.format("Number of requested bytes cannot be negative (%d)", Integer.valueOf(i3)) : (((long) i2) + ((long) i3)) - 1 > 2147483647L ? String.format("Number of requested bytes summed with starting index exceed maximum range of signed 32 bit integers (requested index: %d, requested count: %d)", Integer.valueOf(i2), Integer.valueOf(i3)) : String.format("Attempt to read from beyond end of underlying data source (requested index: %d, requested count: %d, max index: %d)", Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j2 - 1));
    }
}
