package com.incode.welcome_sdk.ui.id_capture.view;

import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class HelpCarouselItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f15208a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f15209b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Painter f15210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15212e;

    public HelpCarouselItem(Painter painter, String str, String str2) {
        Intrinsics.checkNotNullParameter(painter, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f15210c = painter;
        this.f15212e = str;
        this.f15211d = str2;
    }

    public final Painter getImage() {
        int i2 = 2 % 2;
        int i3 = f15208a;
        int i4 = i3 + 39;
        f15209b = i4 % 128;
        int i5 = i4 % 2;
        Painter painter = this.f15210c;
        int i6 = i3 + 55;
        f15209b = i6 % 128;
        if (i6 % 2 != 0) {
            return painter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSubtitle() {
        int i2 = 2 % 2;
        int i3 = f15208a;
        int i4 = i3 + 47;
        f15209b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f15211d;
        int i6 = i3 + 1;
        f15209b = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getTitle() {
        int i2 = 2 % 2;
        int i3 = f15208a + 117;
        int i4 = i3 % 128;
        f15209b = i4;
        int i5 = i3 % 2;
        String str = this.f15212e;
        int i6 = i4 + 63;
        f15208a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 60 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f15208a + 57;
            f15209b = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof HelpCarouselItem)) {
            int i5 = f15209b + 63;
            f15208a = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        HelpCarouselItem helpCarouselItem = (HelpCarouselItem) obj;
        if (!Intrinsics.areEqual(this.f15210c, helpCarouselItem.f15210c) || !Intrinsics.areEqual(this.f15212e, helpCarouselItem.f15212e) || !Intrinsics.areEqual(this.f15211d, helpCarouselItem.f15211d)) {
            return false;
        }
        int i7 = f15209b + 111;
        f15208a = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f15209b + 65;
        f15208a = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((this.f15210c.hashCode() * 31) + this.f15212e.hashCode()) * 31) + this.f15211d.hashCode();
        int i5 = f15209b + 73;
        f15208a = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f15208a + 115;
        f15209b = i3 % 128;
        if (i3 % 2 != 0) {
            return "HelpCarouselItem(image=" + this.f15210c + ", title=" + this.f15212e + ", subtitle=" + this.f15211d + ")";
        }
        int i4 = 53 / 0;
        return "HelpCarouselItem(image=" + this.f15210c + ", title=" + this.f15212e + ", subtitle=" + this.f15211d + ")";
    }

    public static /* synthetic */ HelpCarouselItem copy$default(HelpCarouselItem helpCarouselItem, Painter painter, String str, String str2, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            painter = helpCarouselItem.f15210c;
        }
        Object obj2 = null;
        if ((i2 & 2) != 0) {
            int i4 = f15208a + 27;
            int i5 = i4 % 128;
            f15209b = i5;
            if (i4 % 2 == 0) {
                String str3 = helpCarouselItem.f15212e;
                obj2.hashCode();
                throw null;
            }
            str = helpCarouselItem.f15212e;
            int i6 = i5 + 77;
            f15208a = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i2 & 4) != 0) {
            int i8 = f15208a;
            int i9 = i8 + 23;
            f15209b = i9 % 128;
            if (i9 % 2 == 0) {
                String str4 = helpCarouselItem.f15211d;
                obj2.hashCode();
                throw null;
            }
            str2 = helpCarouselItem.f15211d;
            int i10 = i8 + 107;
            f15209b = i10 % 128;
            int i11 = i10 % 2;
        }
        return helpCarouselItem.copy(painter, str, str2);
    }

    public final HelpCarouselItem copy(Painter painter, String str, String str2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(painter, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        HelpCarouselItem helpCarouselItem = new HelpCarouselItem(painter, str, str2);
        int i3 = f15208a + 33;
        f15209b = i3 % 128;
        if (i3 % 2 != 0) {
            return helpCarouselItem;
        }
        throw null;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f15209b + 89;
        int i4 = i3 % 128;
        f15208a = i4;
        int i5 = i3 % 2;
        String str = this.f15211d;
        int i6 = i4 + 3;
        f15209b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 84 / 0;
        }
        return str;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f15208a + 37;
        int i4 = i3 % 128;
        f15209b = i4;
        int i5 = i3 % 2;
        String str = this.f15212e;
        int i6 = i4 + 27;
        f15208a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final Painter component1() {
        int i2 = 2 % 2;
        int i3 = f15208a + 33;
        int i4 = i3 % 128;
        f15209b = i4;
        int i5 = i3 % 2;
        Painter painter = this.f15210c;
        int i6 = i4 + 5;
        f15208a = i6 % 128;
        int i7 = i6 % 2;
        return painter;
    }
}
