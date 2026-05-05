package androidx.autofill.inline.common;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.autofill.inline.common.ViewStyle;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewStyle extends ViewStyle {
    private static final String KEY_TEXT_COLOR = "text_color";
    private static final String KEY_TEXT_FONT_FAMILY = "text_font_family";
    private static final String KEY_TEXT_FONT_STYLE = "text_font_style";
    private static final String KEY_TEXT_SIZE = "text_size";
    private static final String KEY_TEXT_SIZE_UNIT = "text_size_unit";
    private static final String KEY_TEXT_VIEW_STYLE = "text_view_style";

    public TextViewStyle(Bundle bundle) {
        super(bundle);
    }

    public void applyStyleOnTextViewIfValid(TextView textView) {
        if (isValid()) {
            super.applyStyleOnViewIfValid(textView);
            if (this.mBundle.containsKey("text_color")) {
                textView.setTextColor(this.mBundle.getInt("text_color"));
            }
            if (this.mBundle.containsKey(KEY_TEXT_SIZE)) {
                textView.setTextSize(this.mBundle.containsKey(KEY_TEXT_SIZE_UNIT) ? this.mBundle.getInt(KEY_TEXT_SIZE_UNIT) : 2, this.mBundle.getFloat(KEY_TEXT_SIZE));
            }
            if (this.mBundle.containsKey(KEY_TEXT_FONT_FAMILY)) {
                String string = this.mBundle.getString(KEY_TEXT_FONT_FAMILY);
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                textView.setTypeface(Typeface.create(string, this.mBundle.getInt(KEY_TEXT_FONT_STYLE)));
            }
        }
    }

    @Override // androidx.autofill.inline.common.ViewStyle, androidx.autofill.inline.common.BundledStyle
    protected String getStyleKey() {
        return KEY_TEXT_VIEW_STYLE;
    }

    public static final class Builder extends ViewStyle.BaseBuilder<TextViewStyle, Builder> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.autofill.inline.common.ViewStyle.BaseBuilder
        public Builder getThis() {
            return this;
        }

        public Builder() {
            super(TextViewStyle.KEY_TEXT_VIEW_STYLE);
        }

        public Builder setTextSize(float f2) {
            this.mBundle.putFloat(TextViewStyle.KEY_TEXT_SIZE, f2);
            return this;
        }

        public Builder setTextSize(int i2, float f2) {
            this.mBundle.putInt(TextViewStyle.KEY_TEXT_SIZE_UNIT, i2);
            this.mBundle.putFloat(TextViewStyle.KEY_TEXT_SIZE, f2);
            return this;
        }

        public Builder setTextColor(int i2) {
            this.mBundle.putInt("text_color", i2);
            return this;
        }

        public Builder setTypeface(String str, int i2) {
            Preconditions.checkNotNull(str, "fontFamily should not be null");
            this.mBundle.putString(TextViewStyle.KEY_TEXT_FONT_FAMILY, str);
            this.mBundle.putInt(TextViewStyle.KEY_TEXT_FONT_STYLE, i2);
            return this;
        }

        @Override // androidx.autofill.inline.common.BundledStyle.Builder
        public TextViewStyle build() {
            return new TextViewStyle(this.mBundle);
        }
    }
}
