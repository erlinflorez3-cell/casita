package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes8.dex */
final class zzee {
    private final String info;
    private int position = 0;

    zzee(String str) {
        this.info = str;
    }

    final boolean hasNext() {
        return this.position < this.info.length();
    }

    final int next() {
        String str = this.info;
        int i2 = this.position;
        this.position = i2 + 1;
        char cCharAt = str.charAt(i2);
        if (cCharAt < 55296) {
            return cCharAt;
        }
        int i3 = (cCharAt + 8191) - (cCharAt | 8191);
        int i4 = 13;
        while (true) {
            String str2 = this.info;
            int i5 = this.position;
            this.position = i5 + 1;
            char cCharAt2 = str2.charAt(i5);
            if (cCharAt2 < 55296) {
                return i3 | (cCharAt2 << i4);
            }
            i3 = (-1) - (((-1) - i3) & ((-1) - (((cCharAt2 + 8191) - (cCharAt2 | 8191)) << i4)));
            i4 += 13;
        }
    }
}
