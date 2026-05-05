package com.google.zxing;

import cz.msebera.android.httpclient.message.TokenParser;

/* JADX INFO: loaded from: classes7.dex */
public abstract class LuminanceSource {
    private final int height;
    private final int width;

    protected LuminanceSource(int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }

    public LuminanceSource crop(int i2, int i3, int i4, int i5) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public final int getHeight() {
        return this.height;
    }

    public abstract byte[] getMatrix();

    public abstract byte[] getRow(int i2, byte[] bArr);

    public final int getWidth() {
        return this.width;
    }

    public LuminanceSource invert() {
        return new InvertedLuminanceSource(this);
    }

    public boolean isCropSupported() {
        return false;
    }

    public boolean isRotateSupported() {
        return false;
    }

    public LuminanceSource rotateCounterClockwise() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public LuminanceSource rotateCounterClockwise45() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        byte[] row = new byte[this.width];
        StringBuilder sb = new StringBuilder(this.height * (this.width + 1));
        for (int i2 = 0; i2 < this.height; i2++) {
            row = getRow(i2, row);
            for (int i3 = 0; i3 < this.width; i3++) {
                byte b2 = row[i3];
                int i4 = (b2 + 255) - (b2 | 255);
                sb.append(i4 < 64 ? '#' : i4 < 128 ? '+' : i4 < 192 ? '.' : TokenParser.SP);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
