package com.incode.welcome_sdk.ui.permission_onboarding.view;

/* JADX INFO: loaded from: classes5.dex */
public final class ImageText {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f16663c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f16664d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16666b;

    public ImageText(int i2, int i3) {
        this.f16666b = i2;
        this.f16665a = i3;
    }

    public final int getImage() {
        int i2 = 2 % 2;
        int i3 = f16664d + 121;
        f16663c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f16666b;
        }
        throw null;
    }

    public final int getText() {
        int i2 = 2 % 2;
        int i3 = f16664d + 37;
        int i4 = i3 % 128;
        f16663c = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = this.f16665a;
        int i6 = i4 + 23;
        f16664d = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f16664d;
        int i4 = i3 + 75;
        int i5 = i4 % 128;
        f16663c = i5;
        if (i4 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageText)) {
            return false;
        }
        ImageText imageText = (ImageText) obj;
        if (this.f16666b != imageText.f16666b) {
            int i6 = i5 + 3;
            f16664d = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.f16665a == imageText.f16665a) {
            return true;
        }
        int i8 = i3 + 9;
        f16663c = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f16664d + 11;
        f16663c = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Integer.hashCode(this.f16666b);
        return i4 != 0 ? (iHashCode >>> 13) >>> Integer.hashCode(this.f16665a) : (iHashCode * 31) + Integer.hashCode(this.f16665a);
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f16664d + 65;
        f16663c = i3 % 128;
        if (i3 % 2 == 0) {
            return "ImageText(image=" + this.f16666b + ", text=" + this.f16665a + ")";
        }
        int i4 = 31 / 0;
        return "ImageText(image=" + this.f16666b + ", text=" + this.f16665a + ")";
    }

    public static /* synthetic */ ImageText copy$default(ImageText imageText, int i2, int i3, int i4, Object obj) {
        int i5 = 2 % 2;
        int i6 = f16664d;
        int i7 = i6 + 3;
        f16663c = i7 % 128;
        if (i7 % 2 == 0 && (i4 & 1) != 0) {
            int i8 = i6 + 81;
            f16663c = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = imageText.f16666b;
                throw null;
            }
            i2 = imageText.f16666b;
        }
        if ((i4 & 2) != 0) {
            i3 = imageText.f16665a;
            int i10 = f16663c + 105;
            f16664d = i10 % 128;
            int i11 = i10 % 2;
        }
        return imageText.copy(i2, i3);
    }

    public final ImageText copy(int i2, int i3) {
        int i4 = 2 % 2;
        ImageText imageText = new ImageText(i2, i3);
        int i5 = f16663c + 49;
        f16664d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return imageText;
    }

    public final int component2() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f16664d;
        int i5 = i4 + 19;
        f16663c = i5 % 128;
        if (i5 % 2 != 0) {
            i2 = this.f16665a;
            int i6 = 14 / 0;
        } else {
            i2 = this.f16665a;
        }
        int i7 = i4 + 9;
        f16663c = i7 % 128;
        if (i7 % 2 == 0) {
            return i2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component1() {
        int i2 = 2 % 2;
        int i3 = f16664d + 69;
        f16663c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f16666b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
