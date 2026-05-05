package com.google.android.material.color;

/* JADX INFO: loaded from: classes8.dex */
public class ColorContrastOptions {
    private final int highContrastThemeOverlayResourceId;
    private final int mediumContrastThemeOverlayResourceId;

    public static class Builder {
        private int highContrastThemeOverlayResourceId;
        private int mediumContrastThemeOverlayResourceId;

        public ColorContrastOptions build() {
            return new ColorContrastOptions(this);
        }

        public Builder setHighContrastThemeOverlay(int i2) {
            this.highContrastThemeOverlayResourceId = i2;
            return this;
        }

        public Builder setMediumContrastThemeOverlay(int i2) {
            this.mediumContrastThemeOverlayResourceId = i2;
            return this;
        }
    }

    private ColorContrastOptions(Builder builder) {
        this.mediumContrastThemeOverlayResourceId = builder.mediumContrastThemeOverlayResourceId;
        this.highContrastThemeOverlayResourceId = builder.highContrastThemeOverlayResourceId;
    }

    public int getHighContrastThemeOverlay() {
        return this.highContrastThemeOverlayResourceId;
    }

    public int getMediumContrastThemeOverlay() {
        return this.mediumContrastThemeOverlayResourceId;
    }
}
