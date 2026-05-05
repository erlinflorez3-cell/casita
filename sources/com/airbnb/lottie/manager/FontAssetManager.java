package com.airbnb.lottie.manager;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.MutablePair;
import com.airbnb.lottie.utils.Logger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.EO;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class FontAssetManager {
    private final AssetManager assetManager;
    private FontAssetDelegate delegate;
    private final MutablePair<String> tempPair = new MutablePair<>();
    private final Map<MutablePair<String>, Typeface> fontMap = new HashMap();
    private final Map<String, Typeface> fontFamilies = new HashMap();
    private String defaultFontFileExtension = C1626yg.Ud("\"&p@", (short) (C1499aX.Xd() ^ (-28132)), (short) (C1499aX.Xd() ^ (-3107)));

    public FontAssetManager(Drawable.Callback callback, FontAssetDelegate fontAssetDelegate) throws Throwable {
        this.delegate = fontAssetDelegate;
        if (!(callback instanceof View)) {
            short sXd = (short) (C1580rY.Xd() ^ (-9554));
            int[] iArr = new int["~]\u0013,o7\u0004o<SAb:+[D\u0014:`VV\u0003!hW:\f2#)f;N\u007f\u0004\u0016jLauB)}\u000b\u0010\u0006B{e\\yxWp\u0001\u0019\u00169,".length()];
            QB qb = new QB("~]\u0013,o7\u0004o<SAb:+[D\u0014:`VV\u0003!hW:\f2#)f;N\u007f\u0004\u0016jLauB)}\u000b\u0010\u0006B{e\\yxWp\u0001\u0019\u00169,");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Logger.warning(new String(iArr, 0, i2));
            this.assetManager = null;
            return;
        }
        Context context = ((View) callback).getContext();
        Class<?> cls = Class.forName(EO.Od("}2X\b\u0010W8SH\u0002|'CL\\9{(P`\u0011Iq", (short) (C1499aX.Xd() ^ (-2312))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (ZN.Xd() ^ 15467);
        int[] iArr2 = new int["\u0007\u0004\u0012]\u000f\u000e~\r\u000b".length()];
        QB qb2 = new QB("\u0007\u0004\u0012]\u000f\u000e~\r\u000b");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            this.assetManager = (AssetManager) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private Typeface getFontFamily(Font font) {
        Typeface typefaceCreateFromAsset;
        String family = font.getFamily();
        Typeface typeface = this.fontFamilies.get(family);
        if (typeface != null) {
            return typeface;
        }
        String style = font.getStyle();
        String name = font.getName();
        FontAssetDelegate fontAssetDelegate = this.delegate;
        if (fontAssetDelegate != null) {
            typefaceCreateFromAsset = fontAssetDelegate.fetchFont(family, style, name);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.delegate.fetchFont(family);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        FontAssetDelegate fontAssetDelegate2 = this.delegate;
        if (fontAssetDelegate2 != null && typefaceCreateFromAsset == null) {
            String fontPath = fontAssetDelegate2.getFontPath(family, style, name);
            if (fontPath == null) {
                fontPath = this.delegate.getFontPath(family);
            }
            if (fontPath != null) {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.assetManager, fontPath);
            }
        }
        if (font.getTypeface() != null) {
            return font.getTypeface();
        }
        if (typefaceCreateFromAsset == null) {
            typefaceCreateFromAsset = Typeface.createFromAsset(this.assetManager, "fonts/" + family + this.defaultFontFileExtension);
        }
        this.fontFamilies.put(family, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    private Typeface typefaceForStyle(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i2 = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i2 ? typeface : Typeface.create(typeface, i2);
    }

    public Typeface getTypeface(Font font) {
        this.tempPair.set(font.getFamily(), font.getStyle());
        Typeface typeface = this.fontMap.get(this.tempPair);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceTypefaceForStyle = typefaceForStyle(getFontFamily(font), font.getStyle());
        this.fontMap.put(this.tempPair, typefaceTypefaceForStyle);
        return typefaceTypefaceForStyle;
    }

    public void setDefaultFontFileExtension(String str) {
        this.defaultFontFileExtension = str;
    }

    public void setDelegate(FontAssetDelegate fontAssetDelegate) {
        this.delegate = fontAssetDelegate;
    }
}
