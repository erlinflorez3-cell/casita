package com.google.android.material.resources;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class TextAppearanceConfig {
    private static boolean shouldLoadFontSynchronously = false;

    public static void setShouldLoadFontSynchronously(boolean z2) {
        shouldLoadFontSynchronously = z2;
    }

    public static boolean shouldLoadFontSynchronously() {
        return shouldLoadFontSynchronously;
    }
}
