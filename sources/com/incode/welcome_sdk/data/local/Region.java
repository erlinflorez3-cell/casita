package com.incode.welcome_sdk.data.local;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class Region {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7685a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7686c = 0;
    private final String code;
    private final String emoji;
    private final String label;

    public Region(String str, String str2, String str3) {
        this.label = str;
        this.code = str2;
        this.emoji = str3;
    }

    public String getLabel() {
        int i2 = 2 % 2;
        int i3 = f7685a + 29;
        f7686c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.label;
        }
        throw null;
    }

    public String getCode() {
        int i2 = 2 % 2;
        int i3 = f7685a + 21;
        int i4 = i3 % 128;
        f7686c = i4;
        int i5 = i3 % 2;
        String str = this.code;
        int i6 = i4 + 99;
        f7685a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getEmoji() {
        int i2 = 2 % 2;
        int i3 = f7686c + 93;
        int i4 = i3 % 128;
        f7685a = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.emoji;
        int i5 = i4 + 79;
        f7686c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("Region{label='").append(this.label).append("', code='").append(this.code).append("', emoji='").append(this.emoji).append("'}").toString();
        int i3 = f7685a + 29;
        f7686c = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static Region findByIsoCode(List<Region> list, String str) {
        int i2 = 2 % 2;
        int i3 = f7685a + 91;
        f7686c = i3 % 128;
        int i4 = i3 % 2;
        for (Region region : list) {
            int i5 = f7686c + 79;
            f7685a = i5 % 128;
            int i6 = i5 % 2;
            if (str.equals(region.code)) {
                return region;
            }
        }
        return null;
    }

    public static Region findByIsoCode(List<Region> list, String str, Region region) {
        int i2 = 2 % 2;
        for (Region region2 : list) {
            if (str.equals(region2.code)) {
                int i3 = f7685a + 75;
                f7686c = i3 % 128;
                int i4 = i3 % 2;
                return region2;
            }
            int i5 = f7686c + 15;
            f7685a = i5 % 128;
            int i6 = i5 % 2;
        }
        return region;
    }
}
