package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes8.dex */
final class zzmg extends IllegalArgumentException {
    zzmg(int i2, int i3) {
        super(new StringBuilder(54).append("Unpaired surrogate at index ").append(i2).append(" of ").append(i3).toString());
    }
}
