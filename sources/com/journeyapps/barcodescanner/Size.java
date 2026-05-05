package com.journeyapps.barcodescanner;

/* JADX INFO: loaded from: classes5.dex */
public class Size implements Comparable<Size> {
    public final int height;
    public final int width;

    public Size(int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }

    @Override // java.lang.Comparable
    public int compareTo(Size size) {
        int i2 = this.height * this.width;
        int i3 = size.height * size.width;
        if (i3 < i2) {
            return 1;
        }
        return i3 > i2 ? -1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Size size = (Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public boolean fitsIn(Size size) {
        return this.width <= size.width && this.height <= size.height;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public Size rotate() {
        return new Size(this.height, this.width);
    }

    public Size scale(int i2, int i3) {
        return new Size((this.width * i2) / i3, (this.height * i2) / i3);
    }

    public Size scaleCrop(Size size) {
        int i2 = this.width;
        int i3 = size.height;
        int i4 = i2 * i3;
        int i5 = size.width;
        int i6 = this.height;
        return i4 <= i5 * i6 ? new Size(i5, (i6 * i5) / i2) : new Size((i2 * i3) / i6, i3);
    }

    public Size scaleFit(Size size) {
        int i2 = this.width;
        int i3 = size.height;
        int i4 = i2 * i3;
        int i5 = size.width;
        int i6 = this.height;
        return i4 >= i5 * i6 ? new Size(i5, (i6 * i5) / i2) : new Size((i2 * i3) / i6, i3);
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
