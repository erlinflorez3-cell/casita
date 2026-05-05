package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes8.dex */
final class zzfi extends IllegalArgumentException {
    zzfi(int i2, int i3) {
        super(new StringBuilder(54).append("Unpaired surrogate at index ").append(i2).append(" of ").append(i3).toString());
    }
}
