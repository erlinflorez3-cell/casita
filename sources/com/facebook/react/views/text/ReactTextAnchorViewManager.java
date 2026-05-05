package com.facebook.react.views.text;

import android.text.TextUtils;
import android.view.View;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import io.sentry.ProfilingTraceData;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReactTextAnchorViewManager<T extends View, C extends ReactBaseTextShadowNode> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};
    private static final String TAG = "ReactTextAnchorViewManager";

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Rb~\u000f;\u0017zb;")
    public void setAccessible(ReactTextView reactTextView, boolean z2) {
        reactTextView.setFocusable(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Si\u000f\u000f<!^eDD\tjy`1\u001ajU\u001c")
    public void setAdjustFontSizeToFit(ReactTextView reactTextView, boolean z2) {
        reactTextView.setAdjustFontSizeToFit(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002]c\f\u000b1\u0012w^O@\u001efm\\Q\u0014\u0014ZmY \u001a\u001aiR%p")
    public void setAndroidHyphenationFrequency(ReactTextView reactTextView, String str) {
        if (str == null || str.equals("none")) {
            reactTextView.setHyphenationFrequency(0);
            return;
        }
        if (str.equals("full")) {
            reactTextView.setHyphenationFrequency(2);
        } else if (str.equals(ProfilingTraceData.TRUNCATION_REASON_NORMAL)) {
            reactTextView.setHyphenationFrequency(1);
        } else {
            FLog.w(ReactConstants.TAG, "Invalid android_hyphenationFrequency: " + str);
            reactTextView.setHyphenationFrequency(0);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBackgroundColor(T t2, int i2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBackgroundColor(t2, Integer.valueOf(i2));
        } else {
            super.setBackgroundColor(t2, i2);
        }
    }

    @ReactPropGroup(customType = "\u0014?;=?", names = {"t\u0003\u0007y{\n[\t\u0007\u000b\u000f", "t\u0003\u0007y{\nd~\u0001\u0010_\r\u000b\u000f\u0013", "t\u0003\u0007y{\nj\u0003\u0002\u0004\u0011`\u000e\f\u0010\u0014", "t\u0003\u0007y{\nl\t\u000b^\f\n\u000e\u0012", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000ba\u000f\r\u0011\u0015"})
    @InterfaceC1492Gx
    public void setBorderColor(ReactTextView reactTextView, int i2, Integer num) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderColor(reactTextView, LogicalEdge.ALL, num);
        } else {
            reactTextView.setBorderColor(SPACING_TYPES[i2], num);
        }
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", defaultFloat = Float.NaN, names = {"t\u0003\u0007y{\njz~\u0005\u0012\u0011", "t\u0003\u0007y{\nl\t\u000bg\u0002\u0004\u0013q\u0002\u0006\f\u0019\u0018", "t\u0003\u0007y{\nl\t\u000bm\u0006\u0005\u0007\u0014r\u0003\u0007\r\u001a\u0019", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bp\t\b\n\u0017u\u0006\n\u0010\u001d\u001c", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bj\u0005\u0007\u0016t\u0005\t\u000f\u001c\u001b"})
    @InterfaceC1492Gx
    public void setBorderRadius(ReactTextView reactTextView, int i2, float f2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderRadius(reactTextView, BorderRadiusProp.values()[i2], Float.isNaN(f2) ? null : new LengthPercentage(f2, LengthPercentageType.POINT));
            return;
        }
        if (!Float.isNaN(f2)) {
            f2 = PixelUtil.toPixelFromDIP(f2);
        }
        if (i2 == 0) {
            reactTextView.setBorderRadius(f2);
        } else {
            reactTextView.setBorderRadius(f2, i2 - 1);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003^q}\u0001:\u0001\roB5")
    public void setBorderStyle(ReactTextView reactTextView, String str) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderStyle(reactTextView, str == null ? null : BorderStyle.fromString(str));
        } else {
            reactTextView.setBorderStyle(str);
        }
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", defaultFloat = Float.NaN, names = {"t\u0003\u0007y{\no\u0003~\u0010\u0005", "t\u0003\u0007y{\nd~\u0001\u0010s\u0007\u0003\u0014\t", "t\u0003\u0007y{\nj\u0003\u0002\u0004\u0011t\b\u0004\u0015\n", "t\u0003\u0007y{\nl\t\u000br\u0006\u0002\u0013\b", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bu\t\u0005\u0016\u000b", "t\u0003\u0007y{\nk\u000e{\u000e\u0011t\b\u0004\u0015\n", "t\u0003\u0007y{\n]\b~r\u0006\u0002\u0013\b"})
    @InterfaceC1492Gx
    public void setBorderWidth(ReactTextView reactTextView, int i2, float f2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderWidth(reactTextView, LogicalEdge.values()[i2], Float.valueOf(f2));
            return;
        }
        if (!Float.isNaN(f2)) {
            f2 = PixelUtil.toPixelFromDIP(f2);
        }
        reactTextView.setBorderWidth(SPACING_TYPES[i2], f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "!\u0001{/KgNA~", name = "\u0003^wl\u0004)\u0012\bm")
    public void setBoxShadow(ReactTextView reactTextView, ReadableArray readableArray) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBoxShadow(reactTextView, readableArray);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Psz_-\"}YJ?(UxkB")
    public void setDataDetectorType(ReactTextView reactTextView, String str) {
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "phoneNumber":
                    reactTextView.setLinkifyMask(4);
                    break;
                case "all":
                    reactTextView.setLinkifyMask(15);
                    break;
                case "link":
                    reactTextView.setLinkifyMask(1);
                    break;
                case "email":
                    reactTextView.setLinkifyMask(2);
                    break;
            }
        }
        reactTextView.setLinkifyMask(0);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0005Xrz}4\u0013|")
    public void setDisabled(ReactTextView reactTextView, boolean z2) {
        reactTextView.setEnabled(!z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0006[k\u0003\f;\u0017\u0013[#?\u001af")
    public void setEllipsizeMode(ReactTextView reactTextView, String str) {
        if (str == null || str.equals("tail")) {
            reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.END);
            return;
        }
        if (str.equals("head")) {
            reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.START);
            return;
        }
        if (str.equals("middle")) {
            reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
        } else if (str.equals("clip")) {
            reactTextView.setEllipsizeLocation(null);
        } else {
            FLog.w(ReactConstants.TAG, "Invalid ellipsizeMode: " + str);
            reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.END);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000en1(}")
    public void setFontSize(ReactTextView reactTextView, float f2) {
        reactTextView.setFontSize(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = true, name = "\n]b\u0006\u0011,\u0013^eDD\u0006bc_F\u0019\f")
    public void setIncludeFontPadding(ReactTextView reactTextView, boolean z2) {
        reactTextView.setIncludeFontPadding(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 0.0f, name = "\rTs\u000e\u0001:\u0001\tW99$h")
    public void setLetterSpacing(ReactTextView reactTextView, float f2) {
        reactTextView.setLetterSpacing(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]H\b\b1\u001c}L?5-M`tL \u0019")
    public void setNotifyOnInlineViewLayout(ReactTextView reactTextView, boolean z2) {
        reactTextView.setNotifyOnInlineViewLayout(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = Integer.MAX_VALUE, name = "\u000fdl{\u0001:|~B?>\u001bt")
    public void setNumberOfLines(ReactTextView reactTextView, int i2) {
        reactTextView.setNumberOfLines(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Tk~~<\u000fzb;")
    public void setSelectable(ReactTextView reactTextView, boolean z2) {
        reactTextView.setTextIsSelectable(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0014Tk~~<\u0017\bd\u0019?\"pq")
    public void setSelectionColor(ReactTextView reactTextView, Integer num) {
        if (num == null) {
            reactTextView.setHighlightColor(DefaultStyleValuesUtil.getDefaultTextColorHighlight(reactTextView.getContext()));
        } else {
            reactTextView.setHighlightColor(num.intValue());
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Tw\u000e\\4\u0017\u007fd,5(uh^>\u0017")
    public void setTextAlignVertical(ReactTextView reactTextView, String str) {
        if (str == null || "auto".equals(str)) {
            reactTextView.setGravityVertical(0);
            return;
        }
        if ("top".equals(str)) {
            reactTextView.setGravityVertical(48);
            return;
        }
        if (ViewProps.BOTTOM.equals(str)) {
            reactTextView.setGravityVertical(80);
        } else if ("center".equals(str)) {
            reactTextView.setGravityVertical(16);
        } else {
            FLog.w(ReactConstants.TAG, "Invalid textAlignVertical: " + str);
            reactTextView.setGravityVertical(0);
        }
    }
}
