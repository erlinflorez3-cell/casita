package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ReactFontManager {
    private static ReactFontManager sReactFontManagerInstance = null;
    private final com.facebook.react.common.assets.ReactFontManager mDelegate;

    private ReactFontManager(com.facebook.react.common.assets.ReactFontManager reactFontManager) {
        this.mDelegate = reactFontManager;
    }

    public static ReactFontManager getInstance() {
        if (sReactFontManagerInstance == null) {
            sReactFontManagerInstance = new ReactFontManager(com.facebook.react.common.assets.ReactFontManager.getInstance());
        }
        return sReactFontManagerInstance;
    }

    public void addCustomFont(Context context, String str, int i2) {
        this.mDelegate.addCustomFont(context, str, i2);
    }

    public void addCustomFont(String str, Typeface typeface) {
        this.mDelegate.addCustomFont(str, typeface);
    }

    public Typeface getTypeface(String str, int i2, int i3, AssetManager assetManager) {
        return this.mDelegate.getTypeface(str, i2, i3, assetManager);
    }

    public Typeface getTypeface(String str, int i2, AssetManager assetManager) {
        return this.mDelegate.getTypeface(str, i2, assetManager);
    }

    public Typeface getTypeface(String str, int i2, boolean z2, AssetManager assetManager) {
        return this.mDelegate.getTypeface(str, i2, z2, assetManager);
    }

    public void setTypeface(String str, int i2, Typeface typeface) {
        this.mDelegate.setTypeface(str, i2, typeface);
    }
}
