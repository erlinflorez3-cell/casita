package com.facebook.react.views.text;

import android.text.TextUtils;
import androidx.room.FtsOptions;
import com.dynatrace.android.agent.Global;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ViewProps;
import com.google.common.base.Ascii;
import io.sentry.ProfilingTraceData;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class TextAttributeProps {
    private static final int DEFAULT_BREAK_STRATEGY = 1;
    private static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    private static final int DEFAULT_JUSTIFICATION_MODE = 0;
    private static final int DEFAULT_TEXT_SHADOW_COLOR = 1426063360;
    private static final String PROP_SHADOW_COLOR = "textShadowColor";
    private static final String PROP_SHADOW_OFFSET = "textShadowOffset";
    private static final String PROP_SHADOW_OFFSET_HEIGHT = "height";
    private static final String PROP_SHADOW_OFFSET_WIDTH = "width";
    private static final String PROP_SHADOW_RADIUS = "textShadowRadius";
    private static final String PROP_TEXT_TRANSFORM = "textTransform";
    public static final short TA_KEY_ACCESSIBILITY_ROLE = 24;
    public static final short TA_KEY_ALIGNMENT = 12;
    public static final short TA_KEY_ALLOW_FONT_SCALING = 9;
    public static final short TA_KEY_BACKGROUND_COLOR = 1;
    public static final short TA_KEY_BEST_WRITING_DIRECTION = 13;
    public static final short TA_KEY_FONT_FAMILY = 3;
    public static final short TA_KEY_FONT_SIZE = 4;
    public static final short TA_KEY_FONT_SIZE_MULTIPLIER = 5;
    public static final short TA_KEY_FONT_STYLE = 7;
    public static final short TA_KEY_FONT_VARIANT = 8;
    public static final short TA_KEY_FONT_WEIGHT = 6;
    public static final short TA_KEY_FOREGROUND_COLOR = 0;
    public static final short TA_KEY_IS_HIGHLIGHTED = 22;
    public static final short TA_KEY_LAYOUT_DIRECTION = 23;
    public static final short TA_KEY_LETTER_SPACING = 10;
    public static final short TA_KEY_LINE_BREAK_STRATEGY = 25;
    public static final short TA_KEY_LINE_HEIGHT = 11;
    public static final short TA_KEY_MAX_FONT_SIZE_MULTIPLIER = 29;
    public static final short TA_KEY_OPACITY = 2;
    public static final short TA_KEY_ROLE = 26;
    public static final short TA_KEY_TEXT_DECORATION_COLOR = 14;
    public static final short TA_KEY_TEXT_DECORATION_LINE = 15;
    public static final short TA_KEY_TEXT_DECORATION_STYLE = 16;
    public static final short TA_KEY_TEXT_SHADOW_COLOR = 19;
    public static final short TA_KEY_TEXT_SHADOW_OFFSET_DX = 20;
    public static final short TA_KEY_TEXT_SHADOW_OFFSET_DY = 21;
    public static final short TA_KEY_TEXT_SHADOW_RADIUS = 18;
    public static final short TA_KEY_TEXT_TRANSFORM = 27;
    public static final int UNSET = -1;
    protected int mBackgroundColor;
    protected int mColor;
    protected float mLineHeight = Float.NaN;
    protected boolean mIsColorSet = false;
    protected boolean mAllowFontScaling = true;
    protected float mMaxFontSizeMultiplier = Float.NaN;
    protected boolean mIsBackgroundColorSet = false;
    protected float mOpacity = Float.NaN;
    protected int mNumberOfLines = -1;
    protected int mFontSize = -1;
    protected float mFontSizeInput = -1.0f;
    protected float mLineHeightInput = -1.0f;
    protected float mLetterSpacingInput = Float.NaN;
    protected int mTextAlign = 0;
    protected int mLayoutDirection = -1;
    protected TextTransform mTextTransform = TextTransform.NONE;
    protected float mTextShadowOffsetDx = 0.0f;
    protected float mTextShadowOffsetDy = 0.0f;
    protected float mTextShadowRadius = 0.0f;
    protected int mTextShadowColor = 1426063360;
    protected boolean mIsUnderlineTextDecorationSet = false;
    protected boolean mIsLineThroughTextDecorationSet = false;
    protected boolean mIncludeFontPadding = true;
    protected ReactAccessibilityDelegate.AccessibilityRole mAccessibilityRole = null;
    protected ReactAccessibilityDelegate.Role mRole = null;
    protected int mFontStyle = -1;
    protected int mFontWeight = -1;
    protected String mFontFamily = null;
    protected String mFontFeatureSettings = null;
    protected boolean mContainsImages = false;
    protected float mHeightOfTallestInlineImage = Float.NaN;

    private TextAttributeProps() {
    }

    public static TextAttributeProps fromMapBuffer(MapBuffer mapBuffer) {
        TextAttributeProps textAttributeProps = new TextAttributeProps();
        for (MapBuffer.Entry entry : mapBuffer) {
            switch (entry.getKey()) {
                case 0:
                    textAttributeProps.setColor(Integer.valueOf(entry.getIntValue()));
                    break;
                case 1:
                    textAttributeProps.setBackgroundColor(Integer.valueOf(entry.getIntValue()));
                    break;
                case 2:
                    textAttributeProps.setOpacity((float) entry.getDoubleValue());
                    break;
                case 3:
                    textAttributeProps.setFontFamily(entry.getStringValue());
                    break;
                case 4:
                    textAttributeProps.setFontSize((float) entry.getDoubleValue());
                    break;
                case 6:
                    textAttributeProps.setFontWeight(entry.getStringValue());
                    break;
                case 7:
                    textAttributeProps.setFontStyle(entry.getStringValue());
                    break;
                case 8:
                    textAttributeProps.setFontVariant(entry.getMapBufferValue());
                    break;
                case 9:
                    textAttributeProps.setAllowFontScaling(entry.getBooleanValue());
                    break;
                case 10:
                    textAttributeProps.setLetterSpacing((float) entry.getDoubleValue());
                    break;
                case 11:
                    textAttributeProps.setLineHeight((float) entry.getDoubleValue());
                    break;
                case 15:
                    textAttributeProps.setTextDecorationLine(entry.getStringValue());
                    break;
                case 18:
                    textAttributeProps.setTextShadowRadius((float) entry.getDoubleValue());
                    break;
                case 19:
                    textAttributeProps.setTextShadowColor(entry.getIntValue());
                    break;
                case 20:
                    textAttributeProps.setTextShadowOffsetDx((float) entry.getDoubleValue());
                    break;
                case 21:
                    textAttributeProps.setTextShadowOffsetDy((float) entry.getDoubleValue());
                    break;
                case 23:
                    textAttributeProps.setLayoutDirection(entry.getStringValue());
                    break;
                case 24:
                    textAttributeProps.setAccessibilityRole(entry.getStringValue());
                    break;
                case 26:
                    textAttributeProps.setRole(ReactAccessibilityDelegate.Role.values()[entry.getIntValue()]);
                    break;
                case 27:
                    textAttributeProps.setTextTransform(entry.getStringValue());
                    break;
                case 29:
                    textAttributeProps.setMaxFontSizeMultiplier((float) entry.getDoubleValue());
                    break;
            }
        }
        return textAttributeProps;
    }

    public static TextAttributeProps fromReadableMap(ReactStylesDiffMap reactStylesDiffMap) {
        TextAttributeProps textAttributeProps = new TextAttributeProps();
        textAttributeProps.setNumberOfLines(getIntProp(reactStylesDiffMap, ViewProps.NUMBER_OF_LINES, -1));
        textAttributeProps.setLineHeight(getFloatProp(reactStylesDiffMap, ViewProps.LINE_HEIGHT, -1.0f));
        textAttributeProps.setLetterSpacing(getFloatProp(reactStylesDiffMap, ViewProps.LETTER_SPACING, Float.NaN));
        textAttributeProps.setAllowFontScaling(getBooleanProp(reactStylesDiffMap, ViewProps.ALLOW_FONT_SCALING, true));
        textAttributeProps.setMaxFontSizeMultiplier(getFloatProp(reactStylesDiffMap, ViewProps.MAX_FONT_SIZE_MULTIPLIER, Float.NaN));
        textAttributeProps.setFontSize(getFloatProp(reactStylesDiffMap, ViewProps.FONT_SIZE, -1.0f));
        textAttributeProps.setColor(reactStylesDiffMap.hasKey("color") ? Integer.valueOf(reactStylesDiffMap.getInt("color", 0)) : null);
        textAttributeProps.setColor(reactStylesDiffMap.hasKey(ViewProps.FOREGROUND_COLOR) ? Integer.valueOf(reactStylesDiffMap.getInt(ViewProps.FOREGROUND_COLOR, 0)) : null);
        textAttributeProps.setBackgroundColor(reactStylesDiffMap.hasKey(ViewProps.BACKGROUND_COLOR) ? Integer.valueOf(reactStylesDiffMap.getInt(ViewProps.BACKGROUND_COLOR, 0)) : null);
        textAttributeProps.setOpacity(getFloatProp(reactStylesDiffMap, ViewProps.OPACITY, Float.NaN));
        textAttributeProps.setFontFamily(getStringProp(reactStylesDiffMap, ViewProps.FONT_FAMILY));
        textAttributeProps.setFontWeight(getStringProp(reactStylesDiffMap, ViewProps.FONT_WEIGHT));
        textAttributeProps.setFontStyle(getStringProp(reactStylesDiffMap, ViewProps.FONT_STYLE));
        textAttributeProps.setFontVariant(getArrayProp(reactStylesDiffMap, ViewProps.FONT_VARIANT));
        textAttributeProps.setIncludeFontPadding(getBooleanProp(reactStylesDiffMap, ViewProps.INCLUDE_FONT_PADDING, true));
        textAttributeProps.setTextDecorationLine(getStringProp(reactStylesDiffMap, ViewProps.TEXT_DECORATION_LINE));
        textAttributeProps.setTextShadowOffset(reactStylesDiffMap.hasKey("textShadowOffset") ? reactStylesDiffMap.getMap("textShadowOffset") : null);
        textAttributeProps.setTextShadowRadius(getFloatProp(reactStylesDiffMap, "textShadowRadius", 1.0f));
        textAttributeProps.setTextShadowColor(getIntProp(reactStylesDiffMap, "textShadowColor", 1426063360));
        textAttributeProps.setTextTransform(getStringProp(reactStylesDiffMap, "textTransform"));
        textAttributeProps.setLayoutDirection(getStringProp(reactStylesDiffMap, ViewProps.LAYOUT_DIRECTION));
        textAttributeProps.setAccessibilityRole(getStringProp(reactStylesDiffMap, ViewProps.ACCESSIBILITY_ROLE));
        textAttributeProps.setRole(getStringProp(reactStylesDiffMap, ViewProps.ROLE));
        return textAttributeProps;
    }

    private static ReadableArray getArrayProp(ReactStylesDiffMap reactStylesDiffMap, String str) {
        if (reactStylesDiffMap.hasKey(str)) {
            return reactStylesDiffMap.getArray(str);
        }
        return null;
    }

    private static boolean getBooleanProp(ReactStylesDiffMap reactStylesDiffMap, String str, boolean z2) {
        return reactStylesDiffMap.hasKey(str) ? reactStylesDiffMap.getBoolean(str, z2) : z2;
    }

    private static float getFloatProp(ReactStylesDiffMap reactStylesDiffMap, String str, float f2) {
        return reactStylesDiffMap.hasKey(str) ? reactStylesDiffMap.getFloat(str, f2) : f2;
    }

    public static int getHyphenationFrequency(String str) {
        if (str == null) {
            return 0;
        }
        str.hashCode();
        if (str.equals(ProfilingTraceData.TRUNCATION_REASON_NORMAL)) {
            return 1;
        }
        return !str.equals("none") ? 2 : 0;
    }

    private static int getIntProp(ReactStylesDiffMap reactStylesDiffMap, String str, int i2) {
        return reactStylesDiffMap.hasKey(str) ? reactStylesDiffMap.getInt(str, i2) : i2;
    }

    public static int getJustificationMode(ReactStylesDiffMap reactStylesDiffMap, int i2) {
        if (!reactStylesDiffMap.hasKey(ViewProps.TEXT_ALIGN)) {
            return i2;
        }
        if ("justify".equals(reactStylesDiffMap.getString(ViewProps.TEXT_ALIGN))) {
            return 1;
        }
        return DEFAULT_JUSTIFICATION_MODE;
    }

    public static int getLayoutDirection(String str) {
        if (str == null || "undefined".equals(str)) {
            return -1;
        }
        if ("rtl".equals(str)) {
            return 1;
        }
        if ("ltr".equals(str)) {
            return 0;
        }
        FLog.w(ReactConstants.TAG, "Invalid layoutDirection: " + str);
        return -1;
    }

    private static String getStringProp(ReactStylesDiffMap reactStylesDiffMap, String str) {
        if (reactStylesDiffMap.hasKey(str)) {
            return reactStylesDiffMap.getString(str);
        }
        return null;
    }

    public static int getTextAlignment(ReactStylesDiffMap reactStylesDiffMap, boolean z2, int i2) {
        if (!reactStylesDiffMap.hasKey(ViewProps.TEXT_ALIGN)) {
            return i2;
        }
        String string = reactStylesDiffMap.getString(ViewProps.TEXT_ALIGN);
        if ("justify".equals(string)) {
            return 3;
        }
        if (string != null && !"auto".equals(string)) {
            if ("left".equals(string)) {
                return z2 ? 5 : 3;
            }
            if (ViewProps.RIGHT.equals(string)) {
                return z2 ? 3 : 5;
            }
            if ("center".equals(string)) {
                return 1;
            }
            FLog.w(ReactConstants.TAG, "Invalid textAlign: " + string);
        }
        return 0;
    }

    public static int getTextBreakStrategy(String str) {
        if (str == null) {
            return 1;
        }
        str.hashCode();
        if (str.equals("balanced")) {
            return 2;
        }
        return !str.equals(FtsOptions.TOKENIZER_SIMPLE) ? 1 : 0;
    }

    private void setAccessibilityRole(String str) {
        if (str == null) {
            this.mAccessibilityRole = null;
        } else {
            this.mAccessibilityRole = ReactAccessibilityDelegate.AccessibilityRole.fromValue(str);
        }
    }

    private void setAllowFontScaling(boolean z2) {
        if (z2 != this.mAllowFontScaling) {
            this.mAllowFontScaling = z2;
            setFontSize(this.mFontSizeInput);
            setLineHeight(this.mLineHeightInput);
        }
    }

    private void setBackgroundColor(Integer num) {
        boolean z2 = num != null;
        this.mIsBackgroundColorSet = z2;
        if (z2) {
            this.mBackgroundColor = num.intValue();
        }
    }

    private void setColor(Integer num) {
        boolean z2 = num != null;
        this.mIsColorSet = z2;
        if (z2) {
            this.mColor = num.intValue();
        }
    }

    private void setFontFamily(String str) {
        this.mFontFamily = str;
    }

    private void setFontSize(float f2) {
        this.mFontSizeInput = f2;
        if (f2 != -1.0f) {
            f2 = (float) (this.mAllowFontScaling ? Math.ceil(PixelUtil.toPixelFromSP(f2, this.mMaxFontSizeMultiplier)) : Math.ceil(PixelUtil.toPixelFromDIP(f2)));
        }
        this.mFontSize = (int) f2;
    }

    private void setFontStyle(String str) {
        this.mFontStyle = ReactTypefaceUtils.parseFontStyle(str);
    }

    private void setFontVariant(ReadableArray readableArray) {
        this.mFontFeatureSettings = ReactTypefaceUtils.parseFontVariant(readableArray);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void setFontVariant(MapBuffer mapBuffer) {
        if (mapBuffer == null || mapBuffer.getCount() == 0) {
            this.mFontFeatureSettings = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MapBuffer.Entry> it = mapBuffer.iterator();
        while (it.hasNext()) {
            String stringValue = it.next().getStringValue();
            if (stringValue != null) {
                stringValue.hashCode();
                byte b2 = -1;
                switch (stringValue.hashCode()) {
                    case -1983120972:
                        if (stringValue.equals("stylistic-thirteen")) {
                            b2 = 0;
                        }
                        break;
                    case -1933522176:
                        if (stringValue.equals("stylistic-fifteen")) {
                            b2 = 1;
                        }
                        break;
                    case -1534462052:
                        if (stringValue.equals("stylistic-eighteen")) {
                            b2 = 2;
                        }
                        break;
                    case -1195362251:
                        if (stringValue.equals("proportional-nums")) {
                            b2 = 3;
                        }
                        break;
                    case -1061392823:
                        if (stringValue.equals("lining-nums")) {
                            b2 = 4;
                        }
                        break;
                    case -771984547:
                        if (stringValue.equals("tabular-nums")) {
                            b2 = 5;
                        }
                        break;
                    case -659678800:
                        if (stringValue.equals("oldstyle-nums")) {
                            b2 = 6;
                        }
                        break;
                    case 296506098:
                        if (stringValue.equals("stylistic-eight")) {
                            b2 = 7;
                        }
                        break;
                    case 309330544:
                        if (stringValue.equals("stylistic-seven")) {
                            b2 = 8;
                        }
                        break;
                    case 310339585:
                        if (stringValue.equals("stylistic-three")) {
                            b2 = 9;
                        }
                        break;
                    case 604478526:
                        if (stringValue.equals("stylistic-eleven")) {
                            b2 = 10;
                        }
                        break;
                    case 979426287:
                        if (stringValue.equals("stylistic-five")) {
                            b2 = Ascii.VT;
                        }
                        break;
                    case 979432035:
                        if (stringValue.equals("stylistic-four")) {
                            b2 = Ascii.FF;
                        }
                        break;
                    case 979664367:
                        if (stringValue.equals("stylistic-nine")) {
                            b2 = Ascii.CR;
                        }
                        break;
                    case 1001434505:
                        if (stringValue.equals("stylistic-one")) {
                            b2 = Ascii.SO;
                        }
                        break;
                    case 1001438213:
                        if (stringValue.equals("stylistic-six")) {
                            b2 = Ascii.SI;
                        }
                        break;
                    case 1001439040:
                        if (stringValue.equals("stylistic-ten")) {
                            b2 = 16;
                        }
                        break;
                    case 1001439599:
                        if (stringValue.equals("stylistic-two")) {
                            b2 = 17;
                        }
                        break;
                    case 1030714463:
                        if (stringValue.equals("stylistic-sixteen")) {
                            b2 = Ascii.DC2;
                        }
                        break;
                    case 1044065430:
                        if (stringValue.equals("stylistic-twelve")) {
                            b2 = 19;
                        }
                        break;
                    case 1044067310:
                        if (stringValue.equals("stylistic-twenty")) {
                            b2 = Ascii.DC4;
                        }
                        break;
                    case 1183323111:
                        if (stringValue.equals("small-caps")) {
                            b2 = Ascii.NAK;
                        }
                        break;
                    case 1463562569:
                        if (stringValue.equals("stylistic-nineteen")) {
                            b2 = Ascii.SYN;
                        }
                        break;
                    case 1648446397:
                        if (stringValue.equals("stylistic-fourteen")) {
                            b2 = Ascii.ETB;
                        }
                        break;
                    case 2097122634:
                        if (stringValue.equals("stylistic-seventeen")) {
                            b2 = Ascii.CAN;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        arrayList.add("'ss13'");
                        break;
                    case 1:
                        arrayList.add("'ss15'");
                        break;
                    case 2:
                        arrayList.add("'ss18'");
                        break;
                    case 3:
                        arrayList.add("'pnum'");
                        break;
                    case 4:
                        arrayList.add("'lnum'");
                        break;
                    case 5:
                        arrayList.add("'tnum'");
                        break;
                    case 6:
                        arrayList.add("'onum'");
                        break;
                    case 7:
                        arrayList.add("'ss08'");
                        break;
                    case 8:
                        arrayList.add("'ss07'");
                        break;
                    case 9:
                        arrayList.add("'ss03'");
                        break;
                    case 10:
                        arrayList.add("'ss11'");
                        break;
                    case 11:
                        arrayList.add("'ss05'");
                        break;
                    case 12:
                        arrayList.add("'ss04'");
                        break;
                    case 13:
                        arrayList.add("'ss09'");
                        break;
                    case 14:
                        arrayList.add("'ss01'");
                        break;
                    case 15:
                        arrayList.add("'ss06'");
                        break;
                    case 16:
                        arrayList.add("'ss10'");
                        break;
                    case 17:
                        arrayList.add("'ss02'");
                        break;
                    case 18:
                        arrayList.add("'ss16'");
                        break;
                    case 19:
                        arrayList.add("'ss12'");
                        break;
                    case 20:
                        arrayList.add("'ss20'");
                        break;
                    case 21:
                        arrayList.add("'smcp'");
                        break;
                    case 22:
                        arrayList.add("'ss19'");
                        break;
                    case 23:
                        arrayList.add("'ss14'");
                        break;
                    case 24:
                        arrayList.add("'ss17'");
                        break;
                }
            }
        }
        this.mFontFeatureSettings = TextUtils.join(", ", arrayList);
    }

    private void setFontWeight(String str) {
        this.mFontWeight = ReactTypefaceUtils.parseFontWeight(str);
    }

    private void setIncludeFontPadding(boolean z2) {
        this.mIncludeFontPadding = z2;
    }

    private void setLayoutDirection(String str) {
        this.mLayoutDirection = getLayoutDirection(str);
    }

    private void setLetterSpacing(float f2) {
        this.mLetterSpacingInput = f2;
    }

    private void setLineHeight(float f2) {
        this.mLineHeightInput = f2;
        if (f2 == -1.0f) {
            this.mLineHeight = Float.NaN;
        } else {
            this.mLineHeight = this.mAllowFontScaling ? PixelUtil.toPixelFromSP(f2) : PixelUtil.toPixelFromDIP(f2);
        }
    }

    private void setMaxFontSizeMultiplier(float f2) {
        if (f2 != this.mMaxFontSizeMultiplier) {
            this.mMaxFontSizeMultiplier = f2;
            setFontSize(this.mFontSizeInput);
            setLineHeight(this.mLineHeightInput);
        }
    }

    private void setNumberOfLines(int i2) {
        if (i2 == 0) {
            i2 = -1;
        }
        this.mNumberOfLines = i2;
    }

    private void setOpacity(float f2) {
        this.mOpacity = f2;
    }

    private void setRole(ReactAccessibilityDelegate.Role role) {
        this.mRole = role;
    }

    private void setRole(String str) {
        if (str == null) {
            this.mRole = null;
        } else {
            this.mRole = ReactAccessibilityDelegate.Role.fromValue(str);
        }
    }

    private void setTextDecorationLine(String str) {
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        if (str != null) {
            for (String str2 : str.split(Global.HYPHEN)) {
                if ("underline".equals(str2)) {
                    this.mIsUnderlineTextDecorationSet = true;
                } else if ("strikethrough".equals(str2)) {
                    this.mIsLineThroughTextDecorationSet = true;
                }
            }
        }
    }

    private void setTextShadowColor(int i2) {
        if (i2 != this.mTextShadowColor) {
            this.mTextShadowColor = i2;
        }
    }

    private void setTextShadowOffset(ReadableMap readableMap) {
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.mTextShadowOffsetDx = PixelUtil.toPixelFromDIP(readableMap.getDouble("width"));
            }
            if (!readableMap.hasKey("height") || readableMap.isNull("height")) {
                return;
            }
            this.mTextShadowOffsetDy = PixelUtil.toPixelFromDIP(readableMap.getDouble("height"));
        }
    }

    private void setTextShadowOffsetDx(float f2) {
        this.mTextShadowOffsetDx = PixelUtil.toPixelFromDIP(f2);
    }

    private void setTextShadowOffsetDy(float f2) {
        this.mTextShadowOffsetDy = PixelUtil.toPixelFromDIP(f2);
    }

    private void setTextShadowRadius(float f2) {
        if (f2 != this.mTextShadowRadius) {
            this.mTextShadowRadius = f2;
        }
    }

    private void setTextTransform(String str) {
        if (str == null || "none".equals(str)) {
            this.mTextTransform = TextTransform.NONE;
            return;
        }
        if ("uppercase".equals(str)) {
            this.mTextTransform = TextTransform.UPPERCASE;
            return;
        }
        if ("lowercase".equals(str)) {
            this.mTextTransform = TextTransform.LOWERCASE;
        } else if ("capitalize".equals(str)) {
            this.mTextTransform = TextTransform.CAPITALIZE;
        } else {
            FLog.w(ReactConstants.TAG, "Invalid textTransform: " + str);
            this.mTextTransform = TextTransform.NONE;
        }
    }

    public ReactAccessibilityDelegate.AccessibilityRole getAccessibilityRole() {
        return this.mAccessibilityRole;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getColor() {
        return this.mColor;
    }

    public int getEffectiveFontSize() {
        return this.mFontSize;
    }

    public float getEffectiveLetterSpacing() {
        return getLetterSpacing();
    }

    public float getEffectiveLineHeight() {
        if (!Float.isNaN(this.mLineHeight) && !Float.isNaN(this.mHeightOfTallestInlineImage)) {
            float f2 = this.mHeightOfTallestInlineImage;
            if (f2 > this.mLineHeight) {
                return f2;
            }
        }
        return this.mLineHeight;
    }

    public String getFontFamily() {
        return this.mFontFamily;
    }

    public String getFontFeatureSettings() {
        return this.mFontFeatureSettings;
    }

    public int getFontStyle() {
        return this.mFontStyle;
    }

    public int getFontWeight() {
        return this.mFontWeight;
    }

    public float getLetterSpacing() {
        float pixelFromSP = this.mAllowFontScaling ? PixelUtil.toPixelFromSP(this.mLetterSpacingInput) : PixelUtil.toPixelFromDIP(this.mLetterSpacingInput);
        int i2 = this.mFontSize;
        if (i2 > 0) {
            return pixelFromSP / i2;
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.mFontSize);
    }

    public float getOpacity() {
        return this.mOpacity;
    }

    public ReactAccessibilityDelegate.Role getRole() {
        return this.mRole;
    }

    public int getTextShadowColor() {
        return this.mTextShadowColor;
    }

    public float getTextShadowOffsetDx() {
        return this.mTextShadowOffsetDx;
    }

    public float getTextShadowOffsetDy() {
        return this.mTextShadowOffsetDy;
    }

    public float getTextShadowRadius() {
        return this.mTextShadowRadius;
    }

    public TextTransform getTextTransform() {
        return this.mTextTransform;
    }

    public boolean isBackgroundColorSet() {
        return this.mIsBackgroundColorSet;
    }

    public boolean isColorSet() {
        return this.mIsColorSet;
    }

    public boolean isLineThroughTextDecorationSet() {
        return this.mIsLineThroughTextDecorationSet;
    }

    public boolean isUnderlineTextDecorationSet() {
        return this.mIsUnderlineTextDecorationSet;
    }
}
