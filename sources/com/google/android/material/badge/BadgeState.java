package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class BadgeState {
    private static final String BADGE_RESOURCE_TAG = "badge";
    final float badgeHeight;
    final float badgeRadius;
    final float badgeWidth;
    final float badgeWithTextHeight;
    final float badgeWithTextRadius;
    final float badgeWithTextWidth;
    private final State currentState;
    final int horizontalInset;
    final int horizontalInsetWithText;
    int offsetAlignmentMode;
    private final State overridingState;

    public static final class State implements Parcelable {
        private static final int BADGE_NUMBER_NONE = -1;
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.google.android.material.badge.BadgeState.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public State[] newArray(int i2) {
                return new State[i2];
            }
        };
        private static final int NOT_SET = -2;
        private Integer additionalHorizontalOffset;
        private Integer additionalVerticalOffset;
        private int alpha;
        private Boolean autoAdjustToWithinGrandparentBounds;
        private Integer backgroundColor;
        private Integer badgeGravity;
        private Integer badgeHorizontalPadding;
        private int badgeResId;
        private Integer badgeShapeAppearanceOverlayResId;
        private Integer badgeShapeAppearanceResId;
        private Integer badgeTextAppearanceResId;
        private Integer badgeTextColor;
        private Integer badgeVerticalPadding;
        private Integer badgeWithTextShapeAppearanceOverlayResId;
        private Integer badgeWithTextShapeAppearanceResId;
        private int contentDescriptionExceedsMaxBadgeNumberRes;
        private CharSequence contentDescriptionForText;
        private CharSequence contentDescriptionNumberless;
        private int contentDescriptionQuantityStrings;
        private Integer horizontalOffsetWithText;
        private Integer horizontalOffsetWithoutText;
        private Boolean isVisible;
        private Integer largeFontVerticalOffsetAdjustment;
        private int maxCharacterCount;
        private int maxNumber;
        private int number;
        private Locale numberLocale;
        private String text;
        private Integer verticalOffsetWithText;
        private Integer verticalOffsetWithoutText;

        public State() {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.maxNumber = -2;
            this.isVisible = true;
        }

        State(Parcel parcel) {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.maxNumber = -2;
            this.isVisible = true;
            this.badgeResId = parcel.readInt();
            this.backgroundColor = (Integer) parcel.readSerializable();
            this.badgeTextColor = (Integer) parcel.readSerializable();
            this.badgeTextAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeShapeAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeShapeAppearanceOverlayResId = (Integer) parcel.readSerializable();
            this.badgeWithTextShapeAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeWithTextShapeAppearanceOverlayResId = (Integer) parcel.readSerializable();
            this.alpha = parcel.readInt();
            this.text = parcel.readString();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.maxNumber = parcel.readInt();
            this.contentDescriptionForText = parcel.readString();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = (Integer) parcel.readSerializable();
            this.badgeHorizontalPadding = (Integer) parcel.readSerializable();
            this.badgeVerticalPadding = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithText = (Integer) parcel.readSerializable();
            this.largeFontVerticalOffsetAdjustment = (Integer) parcel.readSerializable();
            this.additionalHorizontalOffset = (Integer) parcel.readSerializable();
            this.additionalVerticalOffset = (Integer) parcel.readSerializable();
            this.isVisible = (Boolean) parcel.readSerializable();
            this.numberLocale = (Locale) parcel.readSerializable();
            this.autoAdjustToWithinGrandparentBounds = (Boolean) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.badgeResId);
            parcel.writeSerializable(this.backgroundColor);
            parcel.writeSerializable(this.badgeTextColor);
            parcel.writeSerializable(this.badgeTextAppearanceResId);
            parcel.writeSerializable(this.badgeShapeAppearanceResId);
            parcel.writeSerializable(this.badgeShapeAppearanceOverlayResId);
            parcel.writeSerializable(this.badgeWithTextShapeAppearanceResId);
            parcel.writeSerializable(this.badgeWithTextShapeAppearanceOverlayResId);
            parcel.writeInt(this.alpha);
            parcel.writeString(this.text);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            parcel.writeInt(this.maxNumber);
            CharSequence charSequence = this.contentDescriptionForText;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.contentDescriptionNumberless;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeSerializable(this.badgeGravity);
            parcel.writeSerializable(this.badgeHorizontalPadding);
            parcel.writeSerializable(this.badgeVerticalPadding);
            parcel.writeSerializable(this.horizontalOffsetWithoutText);
            parcel.writeSerializable(this.verticalOffsetWithoutText);
            parcel.writeSerializable(this.horizontalOffsetWithText);
            parcel.writeSerializable(this.verticalOffsetWithText);
            parcel.writeSerializable(this.largeFontVerticalOffsetAdjustment);
            parcel.writeSerializable(this.additionalHorizontalOffset);
            parcel.writeSerializable(this.additionalVerticalOffset);
            parcel.writeSerializable(this.isVisible);
            parcel.writeSerializable(this.numberLocale);
            parcel.writeSerializable(this.autoAdjustToWithinGrandparentBounds);
        }
    }

    BadgeState(Context context, int i2, int i3, int i4, State state) throws Throwable {
        CharSequence charSequence;
        State state2 = state;
        State state3 = new State();
        this.currentState = state3;
        state2 = state2 == null ? new State() : state2;
        if (i2 != 0) {
            state2.badgeResId = i2;
        }
        TypedArray typedArrayGenerateTypedArray = generateTypedArray(context, state2.badgeResId, i3, i4);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("T\u0002\u001bJl\u0006\u0006mGt\u0017\u001e4\\\u000bd|Kn\u0014*[[", (short) (FB.Xd() ^ 20354), (short) (FB.Xd() ^ 14368))).getMethod(ZO.xd("\u0007uu+\n\u0005EnFb,w", (short) (ZN.Xd() ^ 16593), (short) (ZN.Xd() ^ 6916)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            this.badgeRadius = typedArrayGenerateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeRadius, -1);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1626yg.Ud("meB :\u001d\\:\u000b2$&\u0018W@e(\u0017\u0002\u0004?Hc", (short) (FB.Xd() ^ 22713), (short) (FB.Xd() ^ 5372))).getMethod(Ig.wd("\u0017GR\u000emWm\u0001K\u001eIm", (short) (ZN.Xd() ^ 8838)), new Class[0]);
            try {
                method2.setAccessible(true);
                this.horizontalInset = ((Resources) method2.invoke(context, objArr2)).getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(EO.Od("]3zl1h\u0004tea^Ffy\b^9[2\u0014@+I", (short) (C1580rY.Xd() ^ (-2136)))).getMethod(C1561oA.Qd("PM[8JWRWSCDQ", (short) (C1607wl.Xd() ^ 20386)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    this.horizontalInsetWithText = ((Resources) method3.invoke(context, objArr3)).getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
                    this.badgeWithTextRadius = typedArrayGenerateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWithTextRadius, -1);
                    this.badgeWidth = typedArrayGenerateTypedArray.getDimension(R.styleable.Badge_badgeWidth, resources.getDimension(R.dimen.m3_badge_size));
                    this.badgeWithTextWidth = typedArrayGenerateTypedArray.getDimension(R.styleable.Badge_badgeWithTextWidth, resources.getDimension(R.dimen.m3_badge_with_text_size));
                    this.badgeHeight = typedArrayGenerateTypedArray.getDimension(R.styleable.Badge_badgeHeight, resources.getDimension(R.dimen.m3_badge_size));
                    this.badgeWithTextHeight = typedArrayGenerateTypedArray.getDimension(R.styleable.Badge_badgeWithTextHeight, resources.getDimension(R.dimen.m3_badge_with_text_size));
                    boolean z2 = true;
                    this.offsetAlignmentMode = typedArrayGenerateTypedArray.getInt(R.styleable.Badge_offsetAlignmentMode, 1);
                    state3.alpha = state2.alpha == -2 ? 255 : state2.alpha;
                    if (state2.number != -2) {
                        state3.number = state2.number;
                    } else if (typedArrayGenerateTypedArray.hasValue(R.styleable.Badge_number)) {
                        state3.number = typedArrayGenerateTypedArray.getInt(R.styleable.Badge_number, 0);
                    } else {
                        state3.number = -1;
                    }
                    if (state2.text != null) {
                        state3.text = state2.text;
                    } else if (typedArrayGenerateTypedArray.hasValue(R.styleable.Badge_badgeText)) {
                        state3.text = typedArrayGenerateTypedArray.getString(R.styleable.Badge_badgeText);
                    }
                    state3.contentDescriptionForText = state2.contentDescriptionForText;
                    if (state2.contentDescriptionNumberless == null) {
                        int i5 = R.string.mtrl_badge_numberless_content_description;
                        Class<?> cls = Class.forName(C1593ug.zd("\u001a(\u001f.,'#m$118*4;u\f99@2FC", (short) (C1580rY.Xd() ^ (-30025)), (short) (C1580rY.Xd() ^ (-12880))));
                        Class<?>[] clsArr = {Integer.TYPE};
                        Object[] objArr4 = {Integer.valueOf(i5)};
                        Method method4 = cls.getMethod(C1561oA.od("ur\u0001^~{qum", (short) (C1580rY.Xd() ^ (-14593))), clsArr);
                        try {
                            method4.setAccessible(true);
                            charSequence = (String) method4.invoke(context, objArr4);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } else {
                        charSequence = state2.contentDescriptionNumberless;
                    }
                    state3.contentDescriptionNumberless = charSequence;
                    state3.contentDescriptionQuantityStrings = state2.contentDescriptionQuantityStrings == 0 ? R.plurals.mtrl_badge_content_description : state2.contentDescriptionQuantityStrings;
                    state3.contentDescriptionExceedsMaxBadgeNumberRes = state2.contentDescriptionExceedsMaxBadgeNumberRes == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : state2.contentDescriptionExceedsMaxBadgeNumberRes;
                    if (state2.isVisible != null && !state2.isVisible.booleanValue()) {
                        z2 = false;
                    }
                    state3.isVisible = Boolean.valueOf(z2);
                    state3.maxCharacterCount = state2.maxCharacterCount == -2 ? typedArrayGenerateTypedArray.getInt(R.styleable.Badge_maxCharacterCount, -2) : state2.maxCharacterCount;
                    state3.maxNumber = state2.maxNumber == -2 ? typedArrayGenerateTypedArray.getInt(R.styleable.Badge_maxNumber, -2) : state2.maxNumber;
                    state3.badgeShapeAppearanceResId = Integer.valueOf(state2.badgeShapeAppearanceResId == null ? typedArrayGenerateTypedArray.getResourceId(R.styleable.Badge_badgeShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state2.badgeShapeAppearanceResId.intValue());
                    state3.badgeShapeAppearanceOverlayResId = Integer.valueOf(state2.badgeShapeAppearanceOverlayResId == null ? typedArrayGenerateTypedArray.getResourceId(R.styleable.Badge_badgeShapeAppearanceOverlay, 0) : state2.badgeShapeAppearanceOverlayResId.intValue());
                    state3.badgeWithTextShapeAppearanceResId = Integer.valueOf(state2.badgeWithTextShapeAppearanceResId == null ? typedArrayGenerateTypedArray.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state2.badgeWithTextShapeAppearanceResId.intValue());
                    state3.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(state2.badgeWithTextShapeAppearanceOverlayResId == null ? typedArrayGenerateTypedArray.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0) : state2.badgeWithTextShapeAppearanceOverlayResId.intValue());
                    state3.backgroundColor = Integer.valueOf(state2.backgroundColor == null ? readColorFromAttributes(context, typedArrayGenerateTypedArray, R.styleable.Badge_backgroundColor) : state2.backgroundColor.intValue());
                    state3.badgeTextAppearanceResId = Integer.valueOf(state2.badgeTextAppearanceResId == null ? typedArrayGenerateTypedArray.getResourceId(R.styleable.Badge_badgeTextAppearance, R.style.TextAppearance_MaterialComponents_Badge) : state2.badgeTextAppearanceResId.intValue());
                    if (state2.badgeTextColor != null) {
                        state3.badgeTextColor = state2.badgeTextColor;
                    } else if (typedArrayGenerateTypedArray.hasValue(R.styleable.Badge_badgeTextColor)) {
                        state3.badgeTextColor = Integer.valueOf(readColorFromAttributes(context, typedArrayGenerateTypedArray, R.styleable.Badge_badgeTextColor));
                    } else {
                        state3.badgeTextColor = Integer.valueOf(new TextAppearance(context, state3.badgeTextAppearanceResId.intValue()).getTextColor().getDefaultColor());
                    }
                    state3.badgeGravity = Integer.valueOf(state2.badgeGravity == null ? typedArrayGenerateTypedArray.getInt(R.styleable.Badge_badgeGravity, 8388661) : state2.badgeGravity.intValue());
                    state3.badgeHorizontalPadding = Integer.valueOf(state2.badgeHorizontalPadding == null ? typedArrayGenerateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : state2.badgeHorizontalPadding.intValue());
                    state3.badgeVerticalPadding = Integer.valueOf(state2.badgeVerticalPadding == null ? typedArrayGenerateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : state2.badgeVerticalPadding.intValue());
                    state3.horizontalOffsetWithoutText = Integer.valueOf(state2.horizontalOffsetWithoutText == null ? typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0) : state2.horizontalOffsetWithoutText.intValue());
                    state3.verticalOffsetWithoutText = Integer.valueOf(state2.verticalOffsetWithoutText == null ? typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0) : state2.verticalOffsetWithoutText.intValue());
                    state3.horizontalOffsetWithText = Integer.valueOf(state2.horizontalOffsetWithText == null ? typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, state3.horizontalOffsetWithoutText.intValue()) : state2.horizontalOffsetWithText.intValue());
                    state3.verticalOffsetWithText = Integer.valueOf(state2.verticalOffsetWithText == null ? typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_verticalOffsetWithText, state3.verticalOffsetWithoutText.intValue()) : state2.verticalOffsetWithText.intValue());
                    state3.largeFontVerticalOffsetAdjustment = Integer.valueOf(state2.largeFontVerticalOffsetAdjustment == null ? typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_largeFontVerticalOffsetAdjustment, 0) : state2.largeFontVerticalOffsetAdjustment.intValue());
                    state3.additionalHorizontalOffset = Integer.valueOf(state2.additionalHorizontalOffset == null ? 0 : state2.additionalHorizontalOffset.intValue());
                    state3.additionalVerticalOffset = Integer.valueOf(state2.additionalVerticalOffset == null ? 0 : state2.additionalVerticalOffset.intValue());
                    state3.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(state2.autoAdjustToWithinGrandparentBounds == null ? typedArrayGenerateTypedArray.getBoolean(R.styleable.Badge_autoAdjustToWithinGrandparentBounds, false) : state2.autoAdjustToWithinGrandparentBounds.booleanValue());
                    typedArrayGenerateTypedArray.recycle();
                    if (state2.numberLocale == null) {
                        state3.numberLocale = Locale.getDefault(Locale.Category.FORMAT);
                    } else {
                        state3.numberLocale = state2.numberLocale;
                    }
                    this.overridingState = state2;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private TypedArray generateTypedArray(Context context, int i2, int i3, int i4) {
        AttributeSet drawableXml;
        int styleAttribute;
        int i5 = i4;
        if (i2 != 0) {
            drawableXml = DrawableUtils.parseDrawableXml(context, i2, BADGE_RESOURCE_TAG);
            styleAttribute = drawableXml.getStyleAttribute();
        } else {
            drawableXml = null;
            styleAttribute = 0;
        }
        if (styleAttribute != 0) {
            i5 = styleAttribute;
        }
        return ThemeEnforcement.obtainStyledAttributes(context, drawableXml, R.styleable.Badge, i3, i5, new int[0]);
    }

    private static int readColorFromAttributes(Context context, TypedArray typedArray, int i2) {
        return MaterialResources.getColorStateList(context, typedArray, i2).getDefaultColor();
    }

    void clearNumber() {
        setNumber(-1);
    }

    void clearText() {
        setText(null);
    }

    int getAdditionalHorizontalOffset() {
        return this.currentState.additionalHorizontalOffset.intValue();
    }

    int getAdditionalVerticalOffset() {
        return this.currentState.additionalVerticalOffset.intValue();
    }

    int getAlpha() {
        return this.currentState.alpha;
    }

    int getBackgroundColor() {
        return this.currentState.backgroundColor.intValue();
    }

    int getBadgeGravity() {
        return this.currentState.badgeGravity.intValue();
    }

    int getBadgeHorizontalPadding() {
        return this.currentState.badgeHorizontalPadding.intValue();
    }

    int getBadgeShapeAppearanceOverlayResId() {
        return this.currentState.badgeShapeAppearanceOverlayResId.intValue();
    }

    int getBadgeShapeAppearanceResId() {
        return this.currentState.badgeShapeAppearanceResId.intValue();
    }

    int getBadgeTextColor() {
        return this.currentState.badgeTextColor.intValue();
    }

    int getBadgeVerticalPadding() {
        return this.currentState.badgeVerticalPadding.intValue();
    }

    int getBadgeWithTextShapeAppearanceOverlayResId() {
        return this.currentState.badgeWithTextShapeAppearanceOverlayResId.intValue();
    }

    int getBadgeWithTextShapeAppearanceResId() {
        return this.currentState.badgeWithTextShapeAppearanceResId.intValue();
    }

    int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
        return this.currentState.contentDescriptionExceedsMaxBadgeNumberRes;
    }

    CharSequence getContentDescriptionForText() {
        return this.currentState.contentDescriptionForText;
    }

    CharSequence getContentDescriptionNumberless() {
        return this.currentState.contentDescriptionNumberless;
    }

    int getContentDescriptionQuantityStrings() {
        return this.currentState.contentDescriptionQuantityStrings;
    }

    int getHorizontalOffsetWithText() {
        return this.currentState.horizontalOffsetWithText.intValue();
    }

    int getHorizontalOffsetWithoutText() {
        return this.currentState.horizontalOffsetWithoutText.intValue();
    }

    int getLargeFontVerticalOffsetAdjustment() {
        return this.currentState.largeFontVerticalOffsetAdjustment.intValue();
    }

    int getMaxCharacterCount() {
        return this.currentState.maxCharacterCount;
    }

    int getMaxNumber() {
        return this.currentState.maxNumber;
    }

    int getNumber() {
        return this.currentState.number;
    }

    Locale getNumberLocale() {
        return this.currentState.numberLocale;
    }

    State getOverridingState() {
        return this.overridingState;
    }

    String getText() {
        return this.currentState.text;
    }

    int getTextAppearanceResId() {
        return this.currentState.badgeTextAppearanceResId.intValue();
    }

    int getVerticalOffsetWithText() {
        return this.currentState.verticalOffsetWithText.intValue();
    }

    int getVerticalOffsetWithoutText() {
        return this.currentState.verticalOffsetWithoutText.intValue();
    }

    boolean hasNumber() {
        return this.currentState.number != -1;
    }

    boolean hasText() {
        return this.currentState.text != null;
    }

    boolean isAutoAdjustedToGrandparentBounds() {
        return this.currentState.autoAdjustToWithinGrandparentBounds.booleanValue();
    }

    boolean isVisible() {
        return this.currentState.isVisible.booleanValue();
    }

    void setAdditionalHorizontalOffset(int i2) {
        this.overridingState.additionalHorizontalOffset = Integer.valueOf(i2);
        this.currentState.additionalHorizontalOffset = Integer.valueOf(i2);
    }

    void setAdditionalVerticalOffset(int i2) {
        this.overridingState.additionalVerticalOffset = Integer.valueOf(i2);
        this.currentState.additionalVerticalOffset = Integer.valueOf(i2);
    }

    void setAlpha(int i2) {
        this.overridingState.alpha = i2;
        this.currentState.alpha = i2;
    }

    void setAutoAdjustToGrandparentBounds(boolean z2) {
        this.overridingState.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(z2);
        this.currentState.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(z2);
    }

    void setBackgroundColor(int i2) {
        this.overridingState.backgroundColor = Integer.valueOf(i2);
        this.currentState.backgroundColor = Integer.valueOf(i2);
    }

    void setBadgeGravity(int i2) {
        this.overridingState.badgeGravity = Integer.valueOf(i2);
        this.currentState.badgeGravity = Integer.valueOf(i2);
    }

    void setBadgeHorizontalPadding(int i2) {
        this.overridingState.badgeHorizontalPadding = Integer.valueOf(i2);
        this.currentState.badgeHorizontalPadding = Integer.valueOf(i2);
    }

    void setBadgeShapeAppearanceOverlayResId(int i2) {
        this.overridingState.badgeShapeAppearanceOverlayResId = Integer.valueOf(i2);
        this.currentState.badgeShapeAppearanceOverlayResId = Integer.valueOf(i2);
    }

    void setBadgeShapeAppearanceResId(int i2) {
        this.overridingState.badgeShapeAppearanceResId = Integer.valueOf(i2);
        this.currentState.badgeShapeAppearanceResId = Integer.valueOf(i2);
    }

    void setBadgeTextColor(int i2) {
        this.overridingState.badgeTextColor = Integer.valueOf(i2);
        this.currentState.badgeTextColor = Integer.valueOf(i2);
    }

    void setBadgeVerticalPadding(int i2) {
        this.overridingState.badgeVerticalPadding = Integer.valueOf(i2);
        this.currentState.badgeVerticalPadding = Integer.valueOf(i2);
    }

    void setBadgeWithTextShapeAppearanceOverlayResId(int i2) {
        this.overridingState.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(i2);
        this.currentState.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(i2);
    }

    void setBadgeWithTextShapeAppearanceResId(int i2) {
        this.overridingState.badgeWithTextShapeAppearanceResId = Integer.valueOf(i2);
        this.currentState.badgeWithTextShapeAppearanceResId = Integer.valueOf(i2);
    }

    void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i2) {
        this.overridingState.contentDescriptionExceedsMaxBadgeNumberRes = i2;
        this.currentState.contentDescriptionExceedsMaxBadgeNumberRes = i2;
    }

    void setContentDescriptionForText(CharSequence charSequence) {
        this.overridingState.contentDescriptionForText = charSequence;
        this.currentState.contentDescriptionForText = charSequence;
    }

    void setContentDescriptionNumberless(CharSequence charSequence) {
        this.overridingState.contentDescriptionNumberless = charSequence;
        this.currentState.contentDescriptionNumberless = charSequence;
    }

    void setContentDescriptionQuantityStringsResource(int i2) {
        this.overridingState.contentDescriptionQuantityStrings = i2;
        this.currentState.contentDescriptionQuantityStrings = i2;
    }

    void setHorizontalOffsetWithText(int i2) {
        this.overridingState.horizontalOffsetWithText = Integer.valueOf(i2);
        this.currentState.horizontalOffsetWithText = Integer.valueOf(i2);
    }

    void setHorizontalOffsetWithoutText(int i2) {
        this.overridingState.horizontalOffsetWithoutText = Integer.valueOf(i2);
        this.currentState.horizontalOffsetWithoutText = Integer.valueOf(i2);
    }

    void setLargeFontVerticalOffsetAdjustment(int i2) {
        this.overridingState.largeFontVerticalOffsetAdjustment = Integer.valueOf(i2);
        this.currentState.largeFontVerticalOffsetAdjustment = Integer.valueOf(i2);
    }

    void setMaxCharacterCount(int i2) {
        this.overridingState.maxCharacterCount = i2;
        this.currentState.maxCharacterCount = i2;
    }

    void setMaxNumber(int i2) {
        this.overridingState.maxNumber = i2;
        this.currentState.maxNumber = i2;
    }

    void setNumber(int i2) {
        this.overridingState.number = i2;
        this.currentState.number = i2;
    }

    void setNumberLocale(Locale locale) {
        this.overridingState.numberLocale = locale;
        this.currentState.numberLocale = locale;
    }

    void setText(String str) {
        this.overridingState.text = str;
        this.currentState.text = str;
    }

    void setTextAppearanceResId(int i2) {
        this.overridingState.badgeTextAppearanceResId = Integer.valueOf(i2);
        this.currentState.badgeTextAppearanceResId = Integer.valueOf(i2);
    }

    void setVerticalOffsetWithText(int i2) {
        this.overridingState.verticalOffsetWithText = Integer.valueOf(i2);
        this.currentState.verticalOffsetWithText = Integer.valueOf(i2);
    }

    void setVerticalOffsetWithoutText(int i2) {
        this.overridingState.verticalOffsetWithoutText = Integer.valueOf(i2);
        this.currentState.verticalOffsetWithoutText = Integer.valueOf(i2);
    }

    void setVisible(boolean z2) {
        this.overridingState.isVisible = Boolean.valueOf(z2);
        this.currentState.isVisible = Boolean.valueOf(z2);
    }
}
