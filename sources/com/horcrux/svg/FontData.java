package com.horcrux.svg;

import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import com.horcrux.svg.TextProperties;

/* JADX INFO: loaded from: classes7.dex */
class FontData {
    static final double DEFAULT_FONT_SIZE = 12.0d;
    private static final double DEFAULT_KERNING = 0.0d;
    private static final double DEFAULT_LETTER_SPACING = 0.0d;
    private static final double DEFAULT_WORD_SPACING = 0.0d;
    static final FontData Defaults = new FontData();
    private static final String FONT_DATA = "fontData";
    private static final String FONT_FEATURE_SETTINGS = "fontFeatureSettings";
    private static final String FONT_VARIANT_LIGATURES = "fontVariantLigatures";
    private static final String FONT_VARIATION_SETTINGS = "fontVariationSettings";
    private static final String KERNING = "kerning";
    private static final String LETTER_SPACING = "letterSpacing";
    private static final String TEXT_ANCHOR = "textAnchor";
    private static final String TEXT_DECORATION = "textDecoration";
    private static final String WORD_SPACING = "wordSpacing";
    int absoluteFontWeight;
    final ReadableMap fontData;
    final String fontFamily;
    final String fontFeatureSettings;
    final double fontSize;
    final TextProperties.FontStyle fontStyle;
    final TextProperties.FontVariantLigatures fontVariantLigatures;
    final String fontVariationSettings;
    TextProperties.FontWeight fontWeight;
    final double kerning;
    final double letterSpacing;
    final boolean manualKerning;
    final TextProperties.TextAnchor textAnchor;
    private final TextProperties.TextDecoration textDecoration;
    final double wordSpacing;

    static class AbsoluteFontWeight {
        private static final TextProperties.FontWeight[] WEIGHTS = {TextProperties.FontWeight.w100, TextProperties.FontWeight.w100, TextProperties.FontWeight.w200, TextProperties.FontWeight.w300, TextProperties.FontWeight.Normal, TextProperties.FontWeight.w500, TextProperties.FontWeight.w600, TextProperties.FontWeight.Bold, TextProperties.FontWeight.w800, TextProperties.FontWeight.w900, TextProperties.FontWeight.w900};
        private static final int[] absoluteFontWeights = {400, 700, 100, 200, 300, 400, 500, 600, 700, LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE, 900};
        static final int normal = 400;

        AbsoluteFontWeight() {
        }

        private static int bolder(int i2) {
            if (i2 < 350) {
                return 400;
            }
            if (i2 < 550) {
                return 700;
            }
            if (i2 < 900) {
                return 900;
            }
            return i2;
        }

        static int from(TextProperties.FontWeight fontWeight, FontData fontData) {
            return fontWeight == TextProperties.FontWeight.Bolder ? bolder(fontData.absoluteFontWeight) : fontWeight == TextProperties.FontWeight.Lighter ? lighter(fontData.absoluteFontWeight) : absoluteFontWeights[fontWeight.ordinal()];
        }

        private static int lighter(int i2) {
            if (i2 < 100) {
                return i2;
            }
            if (i2 < 550) {
                return 100;
            }
            return i2 < 750 ? 400 : 700;
        }

        static TextProperties.FontWeight nearestFontWeight(int i2) {
            return WEIGHTS[Math.round(i2 / 100.0f)];
        }
    }

    private FontData() {
        this.fontData = null;
        this.fontFamily = "";
        this.fontStyle = TextProperties.FontStyle.normal;
        this.fontWeight = TextProperties.FontWeight.Normal;
        this.absoluteFontWeight = 400;
        this.fontFeatureSettings = "";
        this.fontVariationSettings = "";
        this.fontVariantLigatures = TextProperties.FontVariantLigatures.normal;
        this.textAnchor = TextProperties.TextAnchor.start;
        this.textDecoration = TextProperties.TextDecoration.None;
        this.manualKerning = false;
        this.kerning = 0.0d;
        this.fontSize = DEFAULT_FONT_SIZE;
        this.wordSpacing = 0.0d;
        this.letterSpacing = 0.0d;
    }

    FontData(ReadableMap readableMap, FontData fontData, double d2) {
        double absolute;
        double absolute2;
        double d3 = fontData.fontSize;
        ReadableMap readableMap2 = readableMap;
        if (readableMap2.hasKey(ViewProps.FONT_SIZE)) {
            this.fontSize = toAbsolute(readableMap2, ViewProps.FONT_SIZE, 1.0d, d3, d3);
        } else {
            this.fontSize = d3;
        }
        if (!readableMap2.hasKey(ViewProps.FONT_WEIGHT)) {
            setInheritedWeight(fontData);
        } else if (readableMap2.getType(ViewProps.FONT_WEIGHT) == ReadableType.Number) {
            handleNumericWeight(fontData, readableMap2.getDouble(ViewProps.FONT_WEIGHT));
        } else {
            String string = readableMap2.getString(ViewProps.FONT_WEIGHT);
            if (TextProperties.FontWeight.hasEnum(string)) {
                int iFrom = AbsoluteFontWeight.from(TextProperties.FontWeight.get(string), fontData);
                this.absoluteFontWeight = iFrom;
                this.fontWeight = AbsoluteFontWeight.nearestFontWeight(iFrom);
            } else if (string != null) {
                handleNumericWeight(fontData, Double.parseDouble(string));
            } else {
                setInheritedWeight(fontData);
            }
        }
        this.fontData = readableMap2.hasKey(FONT_DATA) ? readableMap2.getMap(FONT_DATA) : fontData.fontData;
        this.fontFamily = readableMap2.hasKey(ViewProps.FONT_FAMILY) ? readableMap2.getString(ViewProps.FONT_FAMILY) : fontData.fontFamily;
        this.fontStyle = readableMap2.hasKey(ViewProps.FONT_STYLE) ? TextProperties.FontStyle.valueOf(readableMap2.getString(ViewProps.FONT_STYLE)) : fontData.fontStyle;
        this.fontFeatureSettings = readableMap2.hasKey(FONT_FEATURE_SETTINGS) ? readableMap2.getString(FONT_FEATURE_SETTINGS) : fontData.fontFeatureSettings;
        this.fontVariationSettings = readableMap2.hasKey(FONT_VARIATION_SETTINGS) ? readableMap2.getString(FONT_VARIATION_SETTINGS) : fontData.fontVariationSettings;
        this.fontVariantLigatures = readableMap2.hasKey(FONT_VARIANT_LIGATURES) ? TextProperties.FontVariantLigatures.valueOf(readableMap2.getString(FONT_VARIANT_LIGATURES)) : fontData.fontVariantLigatures;
        this.textAnchor = readableMap2.hasKey(TEXT_ANCHOR) ? TextProperties.TextAnchor.valueOf(readableMap2.getString(TEXT_ANCHOR)) : fontData.textAnchor;
        this.textDecoration = readableMap2.hasKey(TEXT_DECORATION) ? TextProperties.TextDecoration.getEnum(readableMap2.getString(TEXT_DECORATION)) : fontData.textDecoration;
        boolean zHasKey = readableMap2.hasKey(KERNING);
        this.manualKerning = zHasKey || fontData.manualKerning;
        if (zHasKey) {
            readableMap2 = readableMap2;
            absolute = toAbsolute(readableMap2, KERNING, d2, this.fontSize, 0.0d);
        } else {
            absolute = fontData.kerning;
        }
        this.kerning = absolute;
        if (readableMap2.hasKey(WORD_SPACING)) {
            readableMap2 = readableMap2;
            absolute2 = toAbsolute(readableMap2, WORD_SPACING, d2, this.fontSize, 0.0d);
        } else {
            absolute2 = fontData.wordSpacing;
        }
        this.wordSpacing = absolute2;
        this.letterSpacing = readableMap2.hasKey("letterSpacing") ? toAbsolute(readableMap2, "letterSpacing", d2, this.fontSize, 0.0d) : fontData.letterSpacing;
    }

    private void handleNumericWeight(FontData fontData, double d2) {
        long jRound = Math.round(d2);
        if (jRound < 1 || jRound > 1000) {
            setInheritedWeight(fontData);
            return;
        }
        int i2 = (int) jRound;
        this.absoluteFontWeight = i2;
        this.fontWeight = AbsoluteFontWeight.nearestFontWeight(i2);
    }

    private void setInheritedWeight(FontData fontData) {
        this.absoluteFontWeight = fontData.absoluteFontWeight;
        this.fontWeight = fontData.fontWeight;
    }

    private double toAbsolute(ReadableMap readableMap, String str, double d2, double d3, double d4) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) : PropHelper.fromRelative(readableMap.getString(str), d4, d2, d3);
    }
}
