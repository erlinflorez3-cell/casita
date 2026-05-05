package androidx.autofill.inline.v1;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.autofill.R;
import androidx.autofill.inline.UiVersions;
import androidx.autofill.inline.common.BundledStyle;
import androidx.autofill.inline.common.ImageViewStyle;
import androidx.autofill.inline.common.SlicedContent;
import androidx.autofill.inline.common.TextViewStyle;
import androidx.autofill.inline.common.ViewStyle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import yg.C1580rY;
import yg.C1633zX;
import yg.Jg;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
public final class InlineSuggestionUi {
    private static final String TAG = "InlineSuggestionUi";

    public static Content.Builder newContentBuilder(PendingIntent pendingIntent) {
        return new Content.Builder(pendingIntent);
    }

    public static Style.Builder newStyleBuilder() {
        return new Style.Builder();
    }

    public static Content fromSlice(Slice slice) {
        Content content = new Content(slice);
        if (content.isValid()) {
            return content;
        }
        return null;
    }

    public static Style fromBundle(Bundle bundle) {
        Style style = new Style(bundle);
        if (style.isValid()) {
            return style;
        }
        return null;
    }

    public static View render(Context context, Content content, Style style) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getDefaultContextThemeWrapper(context)).inflate(R.layout.autofill_inline_suggestion, (ViewGroup) null);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.autofill_inline_suggestion_start_icon);
        TextView textView = (TextView) viewGroup.findViewById(R.id.autofill_inline_suggestion_title);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.autofill_inline_suggestion_subtitle);
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.autofill_inline_suggestion_end_icon);
        CharSequence title = content.getTitle();
        if (title != null) {
            textView.setText(title);
            textView.setVisibility(0);
        }
        CharSequence subtitle = content.getSubtitle();
        if (subtitle != null) {
            textView2.setText(subtitle);
            textView2.setVisibility(0);
        }
        Icon startIcon = content.getStartIcon();
        if (startIcon != null) {
            imageView.setImageIcon(startIcon);
            imageView.setVisibility(0);
        }
        Icon endIcon = content.getEndIcon();
        if (endIcon != null) {
            imageView2.setImageIcon(endIcon);
            imageView2.setVisibility(0);
        }
        CharSequence contentDescription = content.getContentDescription();
        if (!TextUtils.isEmpty(contentDescription)) {
            viewGroup.setContentDescription(contentDescription);
        }
        if (style.isValid()) {
            if (!content.isSingleIconOnly()) {
                style.applyStyle(viewGroup, imageView, textView, textView2, imageView2);
            } else {
                style.applyStyle(viewGroup, imageView);
            }
        }
        return viewGroup;
    }

    public static PendingIntent getAttributionIntent(Content content) {
        return content.getAttributionIntent();
    }

    private static Context getDefaultContextThemeWrapper(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("\u0011+\u000f\rs f\u001eA=e=\u001a\u0011\u0005nmkVJfk1", (short) (C1633zX.Xd() ^ (-29883)), (short) (C1633zX.Xd() ^ (-14490)))).getMethod(ZO.xd("\u0013$]]Xj\u0006%|\u0017\f~", (short) (C1580rY.Xd() ^ (-19445)), (short) (C1580rY.Xd() ^ (-25283))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources.Theme themeNewTheme = ((Resources) method.invoke(context, objArr)).newTheme();
            themeNewTheme.applyStyle(R.style.Theme_AutofillInlineSuggestion, true);
            return new ContextThemeWrapper(context, themeNewTheme);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private InlineSuggestionUi() {
    }

    public static final class Style extends BundledStyle implements UiVersions.Style {
        private static final String KEY_CHIP_STYLE = "chip_style";
        private static final String KEY_END_ICON_STYLE = "end_icon_style";
        private static final String KEY_LAYOUT_DIRECTION = "layout_direction";
        private static final String KEY_SINGLE_ICON_CHIP_ICON_STYLE = "single_icon_chip_icon_style";
        private static final String KEY_SINGLE_ICON_CHIP_STYLE = "single_icon_chip_style";
        private static final String KEY_START_ICON_STYLE = "start_icon_style";
        private static final String KEY_STYLE_V1 = "style_v1";
        private static final String KEY_SUBTITLE_STYLE = "subtitle_style";
        private static final String KEY_TITLE_STYLE = "title_style";

        Style(Bundle bundle) {
            super(bundle);
        }

        @Override // androidx.autofill.inline.common.BundledStyle
        protected String getStyleKey() {
            return KEY_STYLE_V1;
        }

        public void applyStyle(View view, ImageView imageView) {
            if (isValid()) {
                view.setLayoutDirection(getLayoutDirection());
                if (imageView.getVisibility() != 8) {
                    ImageViewStyle singleIconChipIconStyle = getSingleIconChipIconStyle();
                    if (singleIconChipIconStyle == null) {
                        singleIconChipIconStyle = getStartIconStyle();
                    }
                    if (singleIconChipIconStyle != null) {
                        singleIconChipIconStyle.applyStyleOnImageViewIfValid(imageView);
                    }
                }
                ViewStyle singleIconChipStyle = getSingleIconChipStyle();
                if (singleIconChipStyle == null) {
                    singleIconChipStyle = getChipStyle();
                }
                if (singleIconChipStyle != null) {
                    singleIconChipStyle.applyStyleOnViewIfValid(view);
                }
            }
        }

        public void applyStyle(View view, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
            ImageViewStyle endIconStyle;
            TextViewStyle subtitleStyle;
            TextViewStyle titleStyle;
            ImageViewStyle startIconStyle;
            if (isValid()) {
                view.setLayoutDirection(getLayoutDirection());
                if (imageView.getVisibility() != 8 && (startIconStyle = getStartIconStyle()) != null) {
                    startIconStyle.applyStyleOnImageViewIfValid(imageView);
                }
                if (textView.getVisibility() != 8 && (titleStyle = getTitleStyle()) != null) {
                    titleStyle.applyStyleOnTextViewIfValid(textView);
                }
                if (textView2.getVisibility() != 8 && (subtitleStyle = getSubtitleStyle()) != null) {
                    subtitleStyle.applyStyleOnTextViewIfValid(textView2);
                }
                if (imageView2.getVisibility() != 8 && (endIconStyle = getEndIconStyle()) != null) {
                    endIconStyle.applyStyleOnImageViewIfValid(imageView2);
                }
                ViewStyle chipStyle = getChipStyle();
                if (chipStyle != null) {
                    chipStyle.applyStyleOnViewIfValid(view);
                }
            }
        }

        @Override // androidx.autofill.inline.UiVersions.Style
        public String getVersion() {
            return UiVersions.INLINE_UI_VERSION_1;
        }

        public int getLayoutDirection() {
            int i2 = this.mBundle.getInt(KEY_LAYOUT_DIRECTION, 0);
            if (i2 == 0 || i2 == 1) {
                return i2;
            }
            return 0;
        }

        public ViewStyle getChipStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_CHIP_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ViewStyle(bundle);
        }

        public TextViewStyle getTitleStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_TITLE_STYLE);
            if (bundle == null) {
                return null;
            }
            return new TextViewStyle(bundle);
        }

        public TextViewStyle getSubtitleStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_SUBTITLE_STYLE);
            if (bundle == null) {
                return null;
            }
            return new TextViewStyle(bundle);
        }

        public ImageViewStyle getStartIconStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_START_ICON_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ImageViewStyle(bundle);
        }

        public ImageViewStyle getEndIconStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_END_ICON_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ImageViewStyle(bundle);
        }

        public ViewStyle getSingleIconChipStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_SINGLE_ICON_CHIP_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ViewStyle(bundle);
        }

        public ImageViewStyle getSingleIconChipIconStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_SINGLE_ICON_CHIP_ICON_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ImageViewStyle(bundle);
        }

        public static final class Builder extends BundledStyle.Builder<Style> {
            Builder() {
                super(Style.KEY_STYLE_V1);
            }

            public Builder setLayoutDirection(int i2) {
                this.mBundle.putInt(Style.KEY_LAYOUT_DIRECTION, i2);
                return this;
            }

            public Builder setChipStyle(ViewStyle viewStyle) {
                viewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_CHIP_STYLE, viewStyle.getBundle());
                return this;
            }

            public Builder setTitleStyle(TextViewStyle textViewStyle) {
                textViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_TITLE_STYLE, textViewStyle.getBundle());
                return this;
            }

            public Builder setSubtitleStyle(TextViewStyle textViewStyle) {
                textViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_SUBTITLE_STYLE, textViewStyle.getBundle());
                return this;
            }

            public Builder setStartIconStyle(ImageViewStyle imageViewStyle) {
                imageViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_START_ICON_STYLE, imageViewStyle.getBundle());
                return this;
            }

            public Builder setEndIconStyle(ImageViewStyle imageViewStyle) {
                imageViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_END_ICON_STYLE, imageViewStyle.getBundle());
                return this;
            }

            public Builder setSingleIconChipStyle(ViewStyle viewStyle) {
                viewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_SINGLE_ICON_CHIP_STYLE, viewStyle.getBundle());
                return this;
            }

            public Builder setSingleIconChipIconStyle(ImageViewStyle imageViewStyle) {
                imageViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_SINGLE_ICON_CHIP_ICON_STYLE, imageViewStyle.getBundle());
                return this;
            }

            @Override // androidx.autofill.inline.common.BundledStyle.Builder
            public Style build() {
                return new Style(this.mBundle);
            }
        }
    }

    public static final class Content extends SlicedContent {
        static final String HINT_INLINE_ATTRIBUTION_INTENT = "inline_attribution";
        static final String HINT_INLINE_CONTENT_DESCRIPTION = "inline_content_description";
        static final String HINT_INLINE_END_ICON = "inline_end_icon";
        static final String HINT_INLINE_START_ICON = "inline_start_icon";
        static final String HINT_INLINE_SUBTITLE = "inline_subtitle";
        static final String HINT_INLINE_TITLE = "inline_title";
        private PendingIntent mAttributionIntent;
        private CharSequence mContentDescription;
        private Icon mEndIcon;
        private Icon mStartIcon;
        private CharSequence mSubtitle;
        private CharSequence mTitle;

        Content(Slice slice) {
            super(slice);
            for (SliceItem sliceItem : slice.getItems()) {
                String strItemType = itemType(sliceItem);
                if (strItemType != null) {
                    strItemType.hashCode();
                    switch (strItemType) {
                        case "inline_subtitle":
                            this.mSubtitle = sliceItem.getText().toString();
                            break;
                        case "inline_content_description":
                            this.mContentDescription = sliceItem.getText();
                            break;
                        case "inline_start_icon":
                            this.mStartIcon = sliceItem.getIcon();
                            break;
                        case "inline_title":
                            this.mTitle = sliceItem.getText().toString();
                            break;
                        case "inline_attribution":
                            this.mAttributionIntent = sliceItem.getAction();
                            break;
                        case "inline_end_icon":
                            this.mEndIcon = sliceItem.getIcon();
                            break;
                    }
                }
            }
        }

        boolean isSingleIconOnly() {
            return this.mStartIcon != null && this.mTitle == null && this.mSubtitle == null && this.mEndIcon == null;
        }

        public CharSequence getTitle() {
            return this.mTitle;
        }

        public CharSequence getSubtitle() {
            return this.mSubtitle;
        }

        public Icon getStartIcon() {
            return this.mStartIcon;
        }

        public Icon getEndIcon() {
            return this.mEndIcon;
        }

        public CharSequence getContentDescription() {
            return this.mContentDescription;
        }

        @Override // androidx.autofill.inline.common.SlicedContent
        public PendingIntent getAttributionIntent() {
            return this.mAttributionIntent;
        }

        @Override // androidx.autofill.inline.common.SlicedContent
        public boolean isValid() {
            return UiVersions.INLINE_UI_VERSION_1.equals(SlicedContent.getVersion(this.mSlice));
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00a3 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String itemType(android.app.slice.SliceItem r3) {
            /*
                java.lang.String r2 = r3.getFormat()
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -1422950858: goto L14;
                    case 3556653: goto L1f;
                    case 100313435: goto L2b;
                    default: goto Lf;
                }
            Lf:
                r2 = 0
                switch(r1) {
                    case 0: goto L37;
                    case 1: goto L4b;
                    case 2: goto L80;
                    default: goto L13;
                }
            L13:
                return r2
            L14:
                java.lang.String r0 = "action"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L1d
                goto Lf
            L1d:
                r1 = 0
                goto Lf
            L1f:
                java.lang.String r0 = "text"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L29
                goto Lf
            L29:
                r1 = 1
                goto Lf
            L2b:
                java.lang.String r0 = "image"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L35
                goto Lf
            L35:
                r1 = 2
                goto Lf
            L37:
                android.app.PendingIntent r0 = r3.getAction()
                if (r0 == 0) goto La3
                java.util.List r0 = r3.getHints()
                java.lang.String r1 = "inline_attribution"
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto La3
                return r1
            L4b:
                java.lang.CharSequence r0 = r3.getText()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L56
                return r2
            L56:
                java.util.List r0 = r3.getHints()
                java.lang.String r1 = "inline_title"
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L64
                return r1
            L64:
                java.util.List r0 = r3.getHints()
                java.lang.String r1 = "inline_subtitle"
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L72
                return r1
            L72:
                java.util.List r0 = r3.getHints()
                java.lang.String r1 = "inline_content_description"
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto La3
                return r1
            L80:
                android.graphics.drawable.Icon r0 = r3.getIcon()
                if (r0 != 0) goto L87
                return r2
            L87:
                java.util.List r0 = r3.getHints()
                java.lang.String r1 = "inline_start_icon"
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L95
                return r1
            L95:
                java.util.List r0 = r3.getHints()
                java.lang.String r1 = "inline_end_icon"
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto La3
                return r1
            La3:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.autofill.inline.v1.InlineSuggestionUi.Content.itemType(android.app.slice.SliceItem):java.lang.String");
        }

        public static final class Builder extends SlicedContent.Builder<Content> {
            private final PendingIntent mAttributionIntent;
            private CharSequence mContentDescription;
            private Icon mEndIcon;
            private List<String> mHints;
            private Icon mStartIcon;
            private CharSequence mSubtitle;
            private CharSequence mTitle;

            Builder(PendingIntent pendingIntent) {
                super(UiVersions.INLINE_UI_VERSION_1);
                this.mAttributionIntent = pendingIntent;
            }

            public Builder setTitle(CharSequence charSequence) {
                this.mTitle = charSequence;
                return this;
            }

            public Builder setSubtitle(CharSequence charSequence) {
                this.mSubtitle = charSequence;
                return this;
            }

            public Builder setStartIcon(Icon icon) {
                this.mStartIcon = icon;
                return this;
            }

            public Builder setEndIcon(Icon icon) {
                this.mEndIcon = icon;
                return this;
            }

            public Builder setContentDescription(CharSequence charSequence) {
                this.mContentDescription = charSequence;
                return this;
            }

            public Builder setHints(List<String> list) {
                this.mHints = list;
                return this;
            }

            @Override // androidx.autofill.inline.common.SlicedContent.Builder
            public Content build() {
                CharSequence charSequence = this.mTitle;
                if (charSequence != null || this.mStartIcon != null || this.mEndIcon != null || this.mSubtitle != null) {
                    if (charSequence == null && this.mSubtitle != null) {
                        throw new IllegalStateException("Cannot set the subtitle without setting the title.");
                    }
                    if (this.mAttributionIntent == null) {
                        throw new IllegalStateException("Attribution intent cannot be null.");
                    }
                    if (this.mStartIcon != null) {
                        this.mSliceBuilder.addIcon(this.mStartIcon, null, Collections.singletonList(Content.HINT_INLINE_START_ICON));
                    }
                    if (this.mTitle != null) {
                        this.mSliceBuilder.addText(this.mTitle, null, Collections.singletonList(Content.HINT_INLINE_TITLE));
                    }
                    if (this.mSubtitle != null) {
                        this.mSliceBuilder.addText(this.mSubtitle, null, Collections.singletonList(Content.HINT_INLINE_SUBTITLE));
                    }
                    if (this.mEndIcon != null) {
                        this.mSliceBuilder.addIcon(this.mEndIcon, null, Collections.singletonList(Content.HINT_INLINE_END_ICON));
                    }
                    if (this.mAttributionIntent != null) {
                        this.mSliceBuilder.addAction(this.mAttributionIntent, new Slice.Builder(this.mSliceBuilder).addHints(Collections.singletonList(Content.HINT_INLINE_ATTRIBUTION_INTENT)).build(), null);
                    }
                    if (this.mContentDescription != null) {
                        this.mSliceBuilder.addText(this.mContentDescription, null, Collections.singletonList(Content.HINT_INLINE_CONTENT_DESCRIPTION));
                    }
                    if (this.mHints != null) {
                        this.mSliceBuilder.addHints(this.mHints);
                    }
                    return new Content(this.mSliceBuilder.build());
                }
                throw new IllegalStateException("Title, subtitle, start icon, end icon are all null. Please set value for at least one of them");
            }
        }
    }
}
