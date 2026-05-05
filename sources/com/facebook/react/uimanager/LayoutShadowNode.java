package com.facebook.react.uimanager;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaWrap;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes3.dex */
public class LayoutShadowNode extends ReactShadowNodeImpl {
    boolean mCollapsable;
    private final MutableYogaValue mTempYogaValue = new MutableYogaValue();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.LayoutShadowNode$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaUnit;

        static {
            int[] iArr = new int[YogaUnit.values().length];
            $SwitchMap$com$facebook$yoga$YogaUnit = iArr;
            try {
                iArr[YogaUnit.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.UNDEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class MutableYogaValue {
        YogaUnit unit;
        float value;

        private MutableYogaValue() {
        }

        /* synthetic */ MutableYogaValue(MutableYogaValueIA mutableYogaValueIA) {
            this();
        }

        private MutableYogaValue(MutableYogaValue mutableYogaValue) {
            this.value = mutableYogaValue.value;
            this.unit = mutableYogaValue.unit;
        }

        void setFromDynamic(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.unit = YogaUnit.UNDEFINED;
                this.value = Float.NaN;
                return;
            }
            if (dynamic.getType() != ReadableType.String) {
                if (dynamic.getType() == ReadableType.Number) {
                    this.unit = YogaUnit.POINT;
                    this.value = PixelUtil.toPixelFromDIP(dynamic.asDouble());
                    return;
                } else {
                    this.unit = YogaUnit.UNDEFINED;
                    this.value = Float.NaN;
                    return;
                }
            }
            String strAsString = dynamic.asString();
            if (strAsString.equals("auto")) {
                this.unit = YogaUnit.AUTO;
                this.value = Float.NaN;
            } else if (strAsString.endsWith("%")) {
                this.unit = YogaUnit.PERCENT;
                this.value = Float.parseFloat(strAsString.substring(0, strAsString.length() - 1));
            } else {
                FLog.w(ReactConstants.TAG, "Unknown value: " + strAsString);
                this.unit = YogaUnit.UNDEFINED;
                this.value = Float.NaN;
            }
        }
    }

    private int maybeTransformLeftRightToStartEnd(int i2) {
        if (!I18nUtil.getInstance().doLeftAndRightSwapInRTL(getThemedContext())) {
            return i2;
        }
        if (i2 == 0) {
            return 4;
        }
        if (i2 != 2) {
            return i2;
        }
        return 5;
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002[h\u0001\n\u000b\u001d\u0007j;>*")
    public void setAlignContent(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignContent(YogaAlign.FLEX_START);
            return;
        }
        str.hashCode();
        switch (str) {
            case "stretch":
                setAlignContent(YogaAlign.STRETCH);
                break;
            case "baseline":
                setAlignContent(YogaAlign.BASELINE);
                break;
            case "center":
                setAlignContent(YogaAlign.CENTER);
                break;
            case "flex-start":
                setAlignContent(YogaAlign.FLEX_START);
                break;
            case "auto":
                setAlignContent(YogaAlign.AUTO);
                break;
            case "space-between":
                setAlignContent(YogaAlign.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignContent(YogaAlign.FLEX_END);
                break;
            case "space-around":
                setAlignContent(YogaAlign.SPACE_AROUND);
                break;
            case "space-evenly":
                setAlignContent(YogaAlign.SPACE_EVENLY);
                break;
            default:
                FLog.w(ReactConstants.TAG, "invalid value for alignContent: " + str);
                setAlignContent(YogaAlign.FLEX_START);
                break;
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002[h\u0001\n\u0011\"}cI")
    public void setAlignItems(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignItems(YogaAlign.STRETCH);
            return;
        }
        str.hashCode();
        switch (str) {
            case "stretch":
                setAlignItems(YogaAlign.STRETCH);
                break;
            case "baseline":
                setAlignItems(YogaAlign.BASELINE);
                break;
            case "center":
                setAlignItems(YogaAlign.CENTER);
                break;
            case "flex-start":
                setAlignItems(YogaAlign.FLEX_START);
                break;
            case "auto":
                setAlignItems(YogaAlign.AUTO);
                break;
            case "space-between":
                setAlignItems(YogaAlign.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignItems(YogaAlign.FLEX_END);
                break;
            case "space-around":
                setAlignItems(YogaAlign.SPACE_AROUND);
                break;
            default:
                FLog.w(ReactConstants.TAG, "invalid value for alignItems: " + str);
                setAlignItems(YogaAlign.STRETCH);
                break;
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002[h\u0001\n\u001b\u0013\u0005\\")
    public void setAlignSelf(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignSelf(YogaAlign.AUTO);
            return;
        }
        str.hashCode();
        switch (str) {
            case "stretch":
                setAlignSelf(YogaAlign.STRETCH);
                break;
            case "baseline":
                setAlignSelf(YogaAlign.BASELINE);
                break;
            case "center":
                setAlignSelf(YogaAlign.CENTER);
                break;
            case "flex-start":
                setAlignSelf(YogaAlign.FLEX_START);
                break;
            case "auto":
                setAlignSelf(YogaAlign.AUTO);
                break;
            case "space-between":
                setAlignSelf(YogaAlign.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignSelf(YogaAlign.FLEX_END);
                break;
            case "space-around":
                setAlignSelf(YogaAlign.SPACE_AROUND);
                break;
            default:
                FLog.w(ReactConstants.TAG, "invalid value for alignSelf: " + str);
                setAlignSelf(YogaAlign.AUTO);
                break;
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = Float.NaN, name = "\u0002bo~~<\u007fyj??")
    public void setAspectRatio(float f2) {
        setStyleAspectRatio(f2);
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", defaultFloat = Float.NaN, names = {"t\u0003\u0007y{\no\u0003~\u0010\u0005", "t\u0003\u0007y{\nk\u000e{\u000e\u0011t\b\u0004\u0015\n", "t\u0003\u0007y{\n]\b~r\u0006\u0002\u0013\b", "t\u0003\u0007y{\nl\t\u000br\u0006\u0002\u0013\b", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bu\t\u0005\u0016\u000b", "t\u0003\u0007y{\nd~\u0001\u0010s\u0007\u0003\u0014\t", "t\u0003\u0007y{\nj\u0003\u0002\u0004\u0011t\b\u0004\u0015\n"})
    @InterfaceC1492Gx
    public void setBorderWidths(int i2, float f2) {
        if (isVirtual()) {
            return;
        }
        setBorder(maybeTransformLeftRightToStartEnd(ViewProps.BORDER_SPACING_TYPES[i2]), PixelUtil.toPixelFromDIP(f2));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004^k\u0006|8!yXB5")
    public void setCollapsable(boolean z2) {
        this.mCollapsable = z2;
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004^k\u0006|8!yXB5xihgA\u001d\nZ")
    public void setCollapsableChildren(boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004^k\u000f\t6tyf")
    public void setColumnGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            setColumnGap(this.mTempYogaValue.value);
        } else if (i2 == 4) {
            setColumnGapPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
    public void setDisplay(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setDisplay(YogaDisplay.FLEX);
            return;
        }
        str.hashCode();
        if (str.equals(ViewProps.FLEX)) {
            setDisplay(YogaDisplay.FLEX);
        } else if (str.equals("none")) {
            setDisplay(YogaDisplay.NONE);
        } else {
            FLog.w(ReactConstants.TAG, "invalid value for display: " + str);
            setDisplay(YogaDisplay.FLEX);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 0.0f, name = "\u0007[d\u0012")
    public void setFlex(float f2) {
        if (isVirtual()) {
            return;
        }
        super.setFlex(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007[d\u0012])!\u0002i")
    public void setFlexBasis(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i2 == 1 || i2 == 2) {
            setFlexBasis(this.mTempYogaValue.value);
        } else if (i2 == 3) {
            setFlexBasisAuto();
        } else if (i2 == 4) {
            setFlexBasisPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007[d\u0012_1 }YJ9%o")
    public void setFlexDirection(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setFlexDirection(YogaFlexDirection.COLUMN);
            return;
        }
        str.hashCode();
        switch (str) {
            case "row-reverse":
                setFlexDirection(YogaFlexDirection.ROW_REVERSE);
                break;
            case "column":
                setFlexDirection(YogaFlexDirection.COLUMN);
                break;
            case "row":
                setFlexDirection(YogaFlexDirection.ROW);
                break;
            case "column-reverse":
                setFlexDirection(YogaFlexDirection.COLUMN_REVERSE);
                break;
            default:
                FLog.w(ReactConstants.TAG, "invalid value for flexDirection: " + str);
                setFlexDirection(YogaFlexDirection.COLUMN);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 0.0f, name = "\u0007[d\u0012b:\u001d\u0010")
    public void setFlexGrow(float f2) {
        if (isVirtual()) {
            return;
        }
        super.setFlexGrow(f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 0.0f, name = "\u0007[d\u0012n0 \u0002dA")
    public void setFlexShrink(float f2) {
        if (isVirtual()) {
            return;
        }
        super.setFlexShrink(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007[d\u0012r:\u000f\t")
    public void setFlexWrap(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setFlexWrap(YogaWrap.NO_WRAP);
            return;
        }
        str.hashCode();
        switch (str) {
            case "nowrap":
                setFlexWrap(YogaWrap.NO_WRAP);
                break;
            case "wrap-reverse":
                setFlexWrap(YogaWrap.WRAP_REVERSE);
                break;
            case "wrap":
                setFlexWrap(YogaWrap.WRAP);
                break;
            default:
                FLog.w(ReactConstants.TAG, "invalid value for flexWrap: " + str);
                setFlexWrap(YogaWrap.NO_WRAP);
                break;
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\bPo")
    public void setGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            setGap(this.mTempYogaValue.value);
        } else if (i2 == 4) {
            setGapPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
    public void setHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i2 == 1 || i2 == 2) {
            setStyleHeight(this.mTempYogaValue.value);
        } else if (i2 == 3) {
            setStyleHeightAuto();
        } else if (i2 == 4) {
            setStyleHeightPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]r~\u0010")
    public void setInset(Dynamic dynamic) {
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", names = {"{\u0002\bz\u000bY\u0005\t}\u0007", "{\u0002\bz\u000bY\u0005\t}\u0007a\f\u0003", "{\u0002\bz\u000bY\u0005\t}\u0007o\u0012\u007f\u0012\u0015"})
    @InterfaceC1492Gx
    public void setInsetBlock(int i2, Dynamic dynamic) {
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", names = {"{\u0002\bz\u000b`\u0007\u0006\u0004\n\u0002", "{\u0002\bz\u000b`\u0007\u0006\u0004\n\u0002b\r\u0004", "{\u0002\bz\u000b`\u0007\u0006\u0004\n\u0002p\u0013\u0001\u0013\u0016"})
    @InterfaceC1492Gx
    public void setInsetInline(int i2, Dynamic dynamic) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000bdr\u000e\u0005.'[eDD\u001bos")
    public void setJustifyContent(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setJustifyContent(YogaJustify.FLEX_START);
            return;
        }
        str.hashCode();
        switch (str) {
            case "center":
                setJustifyContent(YogaJustify.CENTER);
                break;
            case "flex-start":
                setJustifyContent(YogaJustify.FLEX_START);
                break;
            case "space-between":
                setJustifyContent(YogaJustify.SPACE_BETWEEN);
                break;
            case "flex-end":
                setJustifyContent(YogaJustify.FLEX_END);
                break;
            case "space-around":
                setJustifyContent(YogaJustify.SPACE_AROUND);
                break;
            case "space-evenly":
                setJustifyContent(YogaJustify.SPACE_EVENLY);
                break;
            default:
                FLog.w(ReactConstants.TAG, "invalid value for justifyContent: " + str);
                setJustifyContent(YogaJustify.FLEX_START);
                break;
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0006go~\u000e1\u001b}dJ1\"`k\\V\u001a\u001a`jV)\u000f\u0014vQ#eT$")
    public void setLayoutConformance(String str) {
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", names = {"\u007ft\u0007|\u007f\u0006Z\u0006\n~\b", "\u007ft\u0007|\u007f\u0006Z\u0006\n~\bb\r\u0004", "\u007ft\u0007|\u007f\u0006Z\u0006\n~\bp\u0013\u0001\u0013\u0016"})
    @InterfaceC1492Gx
    public void setMarginBlock(int i2, Dynamic dynamic) {
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", names = {"\u007ft\u0007|\u007f\u0006a\b\u0007\u0005\u000b\u0003", "\u007ft\u0007|\u007f\u0006a\b\u0007\u0005\u000b\u0003c\u000e\u0005", "\u007ft\u0007|\u007f\u0006a\b\u0007\u0005\u000b\u0003q\u0014\u0002\u0014\u0017"})
    @InterfaceC1492Gx
    public void setMarginInline(int i2, Dynamic dynamic) {
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", names = {"\u007ft\u0007|\u007f\u0006", "\u007ft\u0007|\u007f\u0006n~\r\u0010\u0006\u0001\u007f\f", "\u007ft\u0007|\u007f\u0006`\t\r\u0005\u0017\r\r\u0014\u0002\u000e", "\u007ft\u0007|\u007f\u0006k\u000e{\u000e\u0011", "\u007ft\u0007|\u007f\u0006]\b~", "\u007ft\u0007|\u007f\u0006l\t\u000b", "\u007ft\u0007|\u007f\u0006Z\t\u000f\u0010\f\u000b", "\u007ft\u0007|\u007f\u0006d~\u0001\u0010", "\u007ft\u0007|\u007f\u0006j\u0003\u0002\u0004\u0011"})
    @InterfaceC1492Gx
    public void setMargins(int i2, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(ViewProps.PADDING_MARGIN_SPACING_TYPES[i2]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i3 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i3 == 1 || i3 == 2) {
            setMargin(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        } else if (i3 == 3) {
            setMarginAuto(iMaybeTransformLeftRightToStartEnd);
        } else if (i3 == 4) {
            setMarginPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePwa\u00011\u0015\u0001j")
    public void setMaxHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i2 == 1 || i2 == 2) {
            setStyleMaxHeight(this.mTempYogaValue.value);
        } else if (i2 == 4) {
            setStyleMaxHeightPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePwp\u0005,\"\u0001")
    public void setMaxWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i2 == 1 || i2 == 2) {
            setStyleMaxWidth(this.mTempYogaValue.value);
        } else if (i2 == 4) {
            setStyleMaxWidthPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eXma\u00011\u0015\u0001j")
    public void setMinHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i2 == 1 || i2 == 2) {
            setStyleMinHeight(this.mTempYogaValue.value);
        } else if (i2 == 4) {
            setStyleMinHeightPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eXmp\u0005,\"\u0001")
    public void setMinWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i2 == 1 || i2 == 2) {
            setStyleMinWidth(this.mTempYogaValue.value);
        } else if (i2 == 4) {
            setStyleMinWidthPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010ed\f\u00024\u001d\u0010")
    public void setOverflow(String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setOverflow(YogaOverflow.VISIBLE);
            return;
        }
        str.hashCode();
        switch (str) {
            case "hidden":
                setOverflow(YogaOverflow.HIDDEN);
                break;
            case "scroll":
                setOverflow(YogaOverflow.SCROLL);
                break;
            case "visible":
                setOverflow(YogaOverflow.VISIBLE);
                break;
            default:
                FLog.w(ReactConstants.TAG, "invalid value for overflow: " + str);
                setOverflow(YogaOverflow.VISIBLE);
                break;
        }
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", names = {"\u0003txy\u007f\u0006\u007f[\u0007\u000b\u007f\t", "\u0003txy\u007f\u0006\u007f[\u0007\u000b\u007f\tc\u000e\u0005", "\u0003txy\u007f\u0006\u007f[\u0007\u000b\u007f\tq\u0014\u0002\u0014\u0017"})
    @InterfaceC1492Gx
    public void setPaddingBlock(int i2, Dynamic dynamic) {
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", names = {"\u0003txy\u007f\u0006\u007fb\t\b\u0006\f\u0004", "\u0003txy\u007f\u0006\u007fb\t\b\u0006\f\u0004d\u000f\u0006", "\u0003txy\u007f\u0006\u007fb\t\b\u0006\f\u0004r\u0015\u0003\u0015\u0018"})
    @InterfaceC1492Gx
    public void setPaddingInline(int i2, Dynamic dynamic) {
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", names = {"\u0003txy\u007f\u0006\u007f", "\u0003txy\u007f\u0006\u007fo\u007f\u000e\u0011\u0007\u0002\u0001\r", "\u0003txy\u007f\u0006\u007fa\n\u000e\u0006\u0018\u000e\u000e\u0015\u0003\u000f", "\u0003txy\u007f\u0006\u007fl\u000f|\u000f\u0012", "\u0003txy\u007f\u0006\u007f^\t\u007f", "\u0003txy\u007f\u0006\u007fm\n\f", "\u0003txy\u007f\u0006\u007f[\n\u0010\u0011\r\f", "\u0003txy\u007f\u0006\u007fe\u007f\u0002\u0011", "\u0003txy\u007f\u0006\u007fk\u0004\u0003\u0005\u0012"})
    @InterfaceC1492Gx
    public void setPaddings(int i2, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(ViewProps.PADDING_MARGIN_SPACING_TYPES[i2]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i3 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i3 == 1 || i3 == 2) {
            setPadding(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        } else if (i3 == 4) {
            setPaddingPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^r\u0003\u00101\u001d\u0007")
    public void setPosition(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setPositionType(YogaPositionType.RELATIVE);
            return;
        }
        str.hashCode();
        if (str.equals("relative")) {
            setPositionType(YogaPositionType.RELATIVE);
        } else if (str.equals("absolute")) {
            setPositionType(YogaPositionType.ABSOLUTE);
        } else {
            FLog.w(ReactConstants.TAG, "invalid value for position: " + str);
            setPositionType(YogaPositionType.RELATIVE);
        }
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", names = {"\u0006\bu\b\u000b", "w\u0002x", "~xz\n", "\u0005|{}\u000b", "\u0007\u0003\u0005", "t\u0003\t\n\u0006\u0005"})
    @InterfaceC1492Gx
    public void setPositionValues(int i2, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(new int[]{4, 5, 0, 2, 1, 3}[i2]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i3 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i3 == 1 || i3 == 2) {
            setPosition(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        } else if (i3 == 4) {
            setPositionPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013^v`|8")
    public void setRowGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            setRowGap(this.mTempYogaValue.value);
        } else if (i2 == 4) {
            setRowGapPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]Kz\u00157#\r")
    public void setShouldNotifyOnLayout(boolean z2) {
        super.setShouldNotifyOnLayout(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]O\t\u00056\"}h\u001b>*fq")
    public void setShouldNotifyPointerEnter(boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]O\t\u00056\"}h\"5\u0017wd")
    public void setShouldNotifyPointerLeave(boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]O\t\u00056\"}h#?,f")
    public void setShouldNotifyPointerMove(boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
    public void setWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i2 == 1 || i2 == 2) {
            setStyleWidth(this.mTempYogaValue.value);
        } else if (i2 == 3) {
            setStyleWidthAuto();
        } else if (i2 == 4) {
            setStyleWidthPercent(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }
}
