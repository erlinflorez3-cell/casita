package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public class TypefaceCompatApi29Impl extends TypefaceCompatBaseImpl {
    private static final String TAG = "TypefaceCompatApi29Impl";

    private static int getMatchScore(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    private Font findBaseFont(FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 + 1) - (1 | i2) != 0 ? 700 : 400, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int matchScore = getMatchScore(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int matchScore2 = getMatchScore(fontStyle, font2.getStyle());
            if (matchScore2 < matchScore) {
                font = font2;
                matchScore = matchScore2;
            }
        }
        return font;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected FontsContractCompat.FontInfo findBestInfo(FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected Typeface createFromInputStream(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("kwlyunh1epnsckp)=hfk[mh", (short) (C1580rY.Xd() ^ (-5821)))).getMethod(C1593ug.zd("EDT$QQXJT[:N]ZXcSa", (short) (Od.Xd() ^ (-5357)), (short) (Od.Xd() ^ (-12197))), new Class[0]);
        try {
            method.setAccessible(true);
            try {
                FontFamily fontFamily = getFontFamily(cancellationSignal, fontInfoArr, (ContentResolver) method.invoke(context, objArr));
                if (fontFamily == null) {
                    return null;
                }
                return new Typeface.CustomFallbackBuilder(fontFamily).setStyle(findBaseFont(fontFamily, i2).getStyle()).build();
            } catch (Exception e2) {
                C1561oA.od("X|rff`ab?jgiYk7e]%+:]_Z", (short) (C1499aX.Xd() ^ (-21900)));
                C1561oA.Kd("\u000e88?k9=04p84=A;;", (short) (ZN.Xd() ^ 30624));
                return null;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static FontFamily getFontFamily(CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(fontInfo.getUri(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(fontInfo.getWeight()).setSlant(fontInfo.isItalic() ? 1 : 0).setTtcIndex(fontInfo.getTtcIndex()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                    } catch (Throwable th) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } else if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
            } catch (IOException e2) {
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromFontInfoWithFallback(Context context, CancellationSignal cancellationSignal, List<FontsContractCompat.FontInfo[]> list, int i2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("\u0014<Ajv{\u0006Z\u001fFTeez dx@Noo}\u0019", (short) (C1607wl.Xd() ^ 4124), (short) (C1607wl.Xd() ^ 18207))).getMethod(C1561oA.Xd("\t\b\u0018g\u0015\u0015\u001c\u000e\u0018\u001f}\u0012!\u001e\u001c'\u0017%", (short) (FB.Xd() ^ 8503)), new Class[0]);
        try {
            method.setAccessible(true);
            ContentResolver contentResolver = (ContentResolver) method.invoke(context, objArr);
            try {
                FontFamily fontFamily = getFontFamily(cancellationSignal, list.get(0), contentResolver);
                if (fontFamily == null) {
                    return null;
                }
                Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamily);
                for (int i3 = 1; i3 < list.size(); i3++) {
                    FontFamily fontFamily2 = getFontFamily(cancellationSignal, list.get(i3), contentResolver);
                    if (fontFamily2 != null) {
                        customFallbackBuilder.addCustomFallback(fontFamily2);
                    }
                }
                return customFallbackBuilder.setStyle(findBaseFont(fontFamily, i2).getStyle()).build();
            } catch (Exception e2) {
                Wg.vd("7]QGMIHK.[VZPd.^<\u0006\n\u001bDHA", (short) (C1607wl.Xd() ^ 9335));
                Qg.kd("\u000e649c/1\"$^$\u001e%'\u001f\u001d", (short) (FB.Xd() ^ 7627), (short) (FB.Xd() ^ 31311));
                return null;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        try {
            FontFamily.Builder builder = null;
            for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
                try {
                    Font fontBuild = new Font.Builder(resources, fontFileResourceEntry.getResourceId()).setWeight(fontFileResourceEntry.getWeight()).setSlant(fontFileResourceEntry.isItalic() ? 1 : 0).setTtcIndex(fontFileResourceEntry.getTtcIndex()).setFontVariationSettings(fontFileResourceEntry.getVariationSettings()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(findBaseFont(fontFamilyBuild, i2).getStyle()).build();
        } catch (Exception e2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font fontBuild = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    Typeface createWeightStyle(Context context, Typeface typeface, int i2, boolean z2) {
        return Typeface.create(typeface, i2, z2);
    }
}
