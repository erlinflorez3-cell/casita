package com.facebook.react.views.textinput;

import android.R;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.util.Predicate;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.facebook.react.views.text.TextAttributes;
import com.facebook.react.views.text.TextLayoutManager;
import com.facebook.react.views.text.internal.span.CustomLetterSpacingSpan;
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan;
import com.facebook.react.views.text.internal.span.CustomStyleSpan;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactSpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.facebook.react.views.view.ReactViewBackgroundManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class ReactEditText extends AppCompatEditText {
    public static final boolean DEBUG_MODE;
    private static final KeyListener sKeyListener;
    private final String TAG;
    private boolean mAutoFocus;
    protected boolean mContainsImages;
    private ContentSizeWatcher mContentSizeWatcher;
    private boolean mContextMenuHidden;
    private final int mDefaultGravityHorizontal;
    private final int mDefaultGravityVertical;
    private boolean mDetectScrollMovement;
    private boolean mDidAttachToWindow;
    private boolean mDisableFullscreen;
    protected boolean mDisableTextDiffing;
    private EventDispatcher mEventDispatcher;
    private String mFontFamily;
    private int mFontStyle;
    private int mFontWeight;
    private final InputMethodManager mInputMethodManager;
    protected boolean mIsSettingTextFromJS;
    protected boolean mIsSettingTextFromState;
    private InternalKeyListener mKeyListener;
    private ArrayList<TextWatcher> mListeners;
    protected int mNativeEventCount;
    private boolean mOnKeyPress;
    private Overflow mOverflow;
    private String mPlaceholder;
    private final ReactViewBackgroundManager mReactBackgroundManager;
    private String mReturnKeyType;
    private ScrollWatcher mScrollWatcher;
    private boolean mSelectTextOnFocus;
    private SelectionWatcher mSelectionWatcher;
    private int mStagedInputType;
    private StateWrapper mStateWrapper;
    private String mSubmitBehavior;
    private TextAttributes mTextAttributes;
    private TextWatcherDelegator mTextWatcherDelegator;
    private boolean mTypefaceDirty;

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.ReactEditText$1 */
    class AnonymousClass1 extends ReactAccessibilityDelegate {
        AnonymousClass1(View view, boolean z2, int i2) {
            super(view, z2, i2);
        }

        @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            if (i2 != 16) {
                return super.performAccessibilityAction(view, i2, bundle);
            }
            int length = ReactEditText.this.getText().length();
            if (length > 0) {
                ReactEditText.this.setSelection(length);
            }
            return ReactEditText.this.requestFocusInternal();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.ReactEditText$2 */
    class AnonymousClass2 implements ActionMode.Callback {
        AnonymousClass2() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            if (ReactEditText.this.mContextMenuHidden) {
                return false;
            }
            menu.removeItem(R.id.pasteAsPlainText);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return true;
        }
    }

    private static class InternalKeyListener implements KeyListener {
        private int mInputType = 0;

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable editable, int i2) {
            ReactEditText.sKeyListener.clearMetaKeyState(view, editable, i2);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.mInputType;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyDown(view, editable, i2, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyUp(view, editable, i2, keyEvent);
        }

        public void setInputType(int i2) {
            this.mInputType = i2;
        }
    }

    private class TextWatcherDelegator implements TextWatcher {
        private TextWatcherDelegator() {
        }

        /* synthetic */ TextWatcherDelegator(ReactEditText reactEditText, TextWatcherDelegatorIA textWatcherDelegatorIA) {
            this();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (ReactEditText.this.mIsSettingTextFromJS || ReactEditText.this.mListeners == null) {
                return;
            }
            Iterator it = ReactEditText.this.mListeners.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            if (ReactEditText.this.mIsSettingTextFromJS || ReactEditText.this.mListeners == null) {
                return;
            }
            Iterator it = ReactEditText.this.mListeners.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i2, i3, i4);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) throws Throwable {
            if (ReactEditText.DEBUG_MODE) {
                FLog.e(ReactEditText.this.TAG, "onTextChanged[" + ReactEditText.this.getId() + "]: " + ((Object) charSequence) + Global.BLANK + i2 + Global.BLANK + i3 + Global.BLANK + i4);
            }
            if (!ReactEditText.this.mIsSettingTextFromJS && ReactEditText.this.mListeners != null) {
                Iterator it = ReactEditText.this.mListeners.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i2, i3, i4);
                }
            }
            ReactEditText.this.updateCachedSpannable();
            ReactEditText.this.onContentSizeChange();
        }
    }

    static {
        boolean z2 = ReactBuildConfig.DEBUG;
        DEBUG_MODE = false;
        sKeyListener = QwertyKeyListener.getInstanceForFullKeyboard();
    }

    public ReactEditText(Context context) throws Throwable {
        super(context);
        this.TAG = ZO.xd("\u000fy\u0003\u000fkk&z,\u0011(\u0002\u0014", (short) (ZN.Xd() ^ 3239), (short) (ZN.Xd() ^ 20536));
        this.mSubmitBehavior = null;
        this.mDetectScrollMovement = false;
        this.mOnKeyPress = false;
        this.mTypefaceDirty = false;
        this.mFontFamily = null;
        this.mFontWeight = -1;
        this.mFontStyle = -1;
        this.mAutoFocus = false;
        this.mContextMenuHidden = false;
        this.mDidAttachToWindow = false;
        this.mSelectTextOnFocus = false;
        this.mPlaceholder = null;
        this.mOverflow = Overflow.VISIBLE;
        this.mStateWrapper = null;
        this.mDisableTextDiffing = false;
        this.mIsSettingTextFromState = false;
        setFocusableInTouchMode(false);
        this.mReactBackgroundManager = new ReactViewBackgroundManager(this);
        String strUd = C1626yg.Ud("vvn_rRg\u0013~\u0012V]", (short) (Od.Xd() ^ (-10268)), (short) (Od.Xd() ^ (-17098)));
        short sXd = (short) (FB.Xd() ^ 30934);
        int[] iArr = new int["vN\u0012\u0010\u0014IXa@LE\u0015Wn<WDb)W\u0002lF".length()];
        QB qb = new QB("vN\u0012\u0010\u0014IXa@LE\u0015Wn<WDb)W\u0002lF");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Object[] objArr = {strUd};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("VSa?d]]MT9JVYKDE", (short) (C1633zX.Xd() ^ (-25367))), Class.forName(EO.Od("i/X\\jV\u00198{!FG\u0014\u0007\u0002[", (short) (ZN.Xd() ^ 28653))));
        try {
            method.setAccessible(true);
            this.mInputMethodManager = (InputMethodManager) Assertions.assertNotNull(method.invoke(context, objArr));
            int gravity = getGravity();
            this.mDefaultGravityHorizontal = (gravity + GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) - (gravity | GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK);
            this.mDefaultGravityVertical = (-1) - (((-1) - getGravity()) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            this.mNativeEventCount = 0;
            this.mIsSettingTextFromJS = false;
            this.mDisableFullscreen = false;
            this.mListeners = null;
            this.mTextWatcherDelegator = null;
            this.mStagedInputType = getInputType();
            if (this.mKeyListener == null) {
                this.mKeyListener = new InternalKeyListener();
            }
            this.mScrollWatcher = null;
            this.mTextAttributes = new TextAttributes();
            applyTextAttributes();
            if (Build.VERSION.SDK_INT <= 27) {
                setLayerType(1, null);
            }
            ViewCompat.setAccessibilityDelegate(this, new ReactAccessibilityDelegate(this, isFocusable(), getImportantForAccessibility()) { // from class: com.facebook.react.views.textinput.ReactEditText.1
                AnonymousClass1(View this, boolean z2, int i22) {
                    super(this, z2, i22);
                }

                @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
                public boolean performAccessibilityAction(View view, int i22, Bundle bundle) {
                    if (i22 != 16) {
                        return super.performAccessibilityAction(view, i22, bundle);
                    }
                    int length = ReactEditText.this.getText().length();
                    if (length > 0) {
                        ReactEditText.this.setSelection(length);
                    }
                    return ReactEditText.this.requestFocusInternal();
                }
            });
            AnonymousClass2 anonymousClass2 = new ActionMode.Callback() { // from class: com.facebook.react.views.textinput.ReactEditText.2
                AnonymousClass2() {
                }

                @Override // android.view.ActionMode.Callback
                public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                    return false;
                }

                @Override // android.view.ActionMode.Callback
                public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                    if (ReactEditText.this.mContextMenuHidden) {
                        return false;
                    }
                    menu.removeItem(R.id.pasteAsPlainText);
                    return true;
                }

                @Override // android.view.ActionMode.Callback
                public void onDestroyActionMode(ActionMode actionMode) {
                }

                @Override // android.view.ActionMode.Callback
                public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                    return true;
                }
            };
            setCustomSelectionActionModeCallback(anonymousClass2);
            setCustomInsertionActionModeCallback(anonymousClass2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void addSpansFromStyleAttributes(SpannableStringBuilder spannableStringBuilder) throws Throwable {
        spannableStringBuilder.setSpan(new ReactAbsoluteSizeSpan(this.mTextAttributes.getEffectiveFontSize()), 0, spannableStringBuilder.length(), 16711698);
        spannableStringBuilder.setSpan(new ReactForegroundColorSpan(getCurrentTextColor()), 0, spannableStringBuilder.length(), 16711698);
        int backgroundColor = this.mReactBackgroundManager.getBackgroundColor();
        if (backgroundColor != 0) {
            spannableStringBuilder.setSpan(new ReactBackgroundColorSpan(backgroundColor), 0, spannableStringBuilder.length(), 16711698);
        }
        int paintFlags = getPaintFlags();
        if ((paintFlags + 16) - (paintFlags | 16) != 0) {
            spannableStringBuilder.setSpan(new ReactStrikethroughSpan(), 0, spannableStringBuilder.length(), 16711698);
        }
        int paintFlags2 = getPaintFlags();
        if ((paintFlags2 + 8) - (paintFlags2 | 8) != 0) {
            spannableStringBuilder.setSpan(new ReactUnderlineSpan(), 0, spannableStringBuilder.length(), 16711698);
        }
        float effectiveLetterSpacing = this.mTextAttributes.getEffectiveLetterSpacing();
        if (!Float.isNaN(effectiveLetterSpacing)) {
            spannableStringBuilder.setSpan(new CustomLetterSpacingSpan(effectiveLetterSpacing), 0, spannableStringBuilder.length(), 16711698);
        }
        if (this.mFontStyle != -1 || this.mFontWeight != -1 || this.mFontFamily != null || getFontFeatureSettings() != null) {
            int i2 = this.mFontStyle;
            int i3 = this.mFontWeight;
            String fontFeatureSettings = getFontFeatureSettings();
            String str = this.mFontFamily;
            Context context = getContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1593ug.zd("\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\u0010\u001d\u001d$\u0016 'aw%%,\u001e2/", (short) (OY.Xd() ^ 19236), (short) (OY.Xd() ^ 19106))).getMethod(C1561oA.od("\u0012\u000f\u001dh\u001a\u0019\n\u0018\u0016", (short) (C1499aX.Xd() ^ (-27720))), new Class[0]);
            try {
                method.setAccessible(true);
                spannableStringBuilder.setSpan(new CustomStyleSpan(i2, i3, fontFeatureSettings, str, (AssetManager) method.invoke(context, objArr)), 0, spannableStringBuilder.length(), 16711698);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        float effectiveLineHeight = this.mTextAttributes.getEffectiveLineHeight();
        if (Float.isNaN(effectiveLineHeight)) {
            return;
        }
        spannableStringBuilder.setSpan(new CustomLineHeightSpan(effectiveLineHeight), 0, spannableStringBuilder.length(), 16711698);
    }

    private int clampToTextLength(int i2) {
        return Math.max(0, Math.min(i2, getText() == null ? 0 : getText().length()));
    }

    private TextWatcherDelegator getTextWatcherDelegator() {
        if (this.mTextWatcherDelegator == null) {
            this.mTextWatcherDelegator = new TextWatcherDelegator();
        }
        return this.mTextWatcherDelegator;
    }

    private boolean isSecureText() {
        return (-1) - (((-1) - getInputType()) | ((-1) - 144)) != 0;
    }

    public /* synthetic */ boolean lambda$stripStyleEquivalentSpans$0(ReactAbsoluteSizeSpan reactAbsoluteSizeSpan) {
        return reactAbsoluteSizeSpan.getSize() == this.mTextAttributes.getEffectiveFontSize();
    }

    public /* synthetic */ boolean lambda$stripStyleEquivalentSpans$1(ReactBackgroundColorSpan reactBackgroundColorSpan) {
        return reactBackgroundColorSpan.getBackgroundColor() == this.mReactBackgroundManager.getBackgroundColor();
    }

    public /* synthetic */ boolean lambda$stripStyleEquivalentSpans$2(ReactForegroundColorSpan reactForegroundColorSpan) {
        return reactForegroundColorSpan.getForegroundColor() == getCurrentTextColor();
    }

    public /* synthetic */ boolean lambda$stripStyleEquivalentSpans$3(ReactStrikethroughSpan reactStrikethroughSpan) {
        int paintFlags = getPaintFlags();
        return (paintFlags + 16) - (paintFlags | 16) != 0;
    }

    public /* synthetic */ boolean lambda$stripStyleEquivalentSpans$4(ReactUnderlineSpan reactUnderlineSpan) {
        return (-1) - (((-1) - getPaintFlags()) | ((-1) - 8)) != 0;
    }

    public /* synthetic */ boolean lambda$stripStyleEquivalentSpans$5(CustomLetterSpacingSpan customLetterSpacingSpan) {
        return customLetterSpacingSpan.getSpacing() == this.mTextAttributes.getEffectiveLetterSpacing();
    }

    public /* synthetic */ boolean lambda$stripStyleEquivalentSpans$6(CustomStyleSpan customStyleSpan) {
        return customStyleSpan.getStyle() == this.mFontStyle && Objects.equals(customStyleSpan.getFontFamily(), this.mFontFamily) && customStyleSpan.getWeight() == this.mFontWeight && Objects.equals(customStyleSpan.getFontFeatureSettings(), getFontFeatureSettings());
    }

    private void manageSpans(SpannableStringBuilder spannableStringBuilder) {
        for (Object obj : getText().getSpans(0, length(), Object.class)) {
            int spanFlags = getText().getSpanFlags(obj);
            boolean z2 = (-1) - (((-1) - spanFlags) | ((-1) - 33)) == 33;
            if (obj instanceof ReactSpan) {
                getText().removeSpan(obj);
            }
            if (z2) {
                int spanStart = getText().getSpanStart(obj);
                int spanEnd = getText().getSpanEnd(obj);
                getText().removeSpan(obj);
                if (sameTextForSpan(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    public void onContentSizeChange() {
        ContentSizeWatcher contentSizeWatcher = this.mContentSizeWatcher;
        if (contentSizeWatcher != null) {
            contentSizeWatcher.onLayout();
        }
        setIntrinsicContentSize();
    }

    public boolean requestFocusInternal() {
        setFocusableInTouchMode(true);
        boolean zRequestFocus = super.requestFocus(130, null);
        if (getShowSoftInputOnFocus()) {
            showSoftKeyboard();
        }
        return zRequestFocus;
    }

    private static boolean sameTextForSpan(Editable editable, SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
        if (i2 > spannableStringBuilder.length() || i3 > spannableStringBuilder.length()) {
            return false;
        }
        while (i2 < i3) {
            if (editable.charAt(i2) != spannableStringBuilder.charAt(i2)) {
                return false;
            }
            i2++;
        }
        return true;
    }

    private void setIntrinsicContentSize() {
        ReactContext reactContext = UIManagerHelper.getReactContext(this);
        if (this.mStateWrapper != null || reactContext.isBridgeless()) {
            return;
        }
        ReactTextInputLocalData reactTextInputLocalData = new ReactTextInputLocalData(this);
        UIManagerModule uIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), reactTextInputLocalData);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void stripSpansOfKind(SpannableStringBuilder spannableStringBuilder, Class<T> cls, Predicate<T> predicate) {
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls)) {
            if (predicate.test(obj)) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
    }

    private void stripStyleEquivalentSpans(SpannableStringBuilder spannableStringBuilder) {
        stripSpansOfKind(spannableStringBuilder, ReactAbsoluteSizeSpan.class, new Predicate() { // from class: com.facebook.react.views.textinput.ReactEditText$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f$0.lambda$stripStyleEquivalentSpans$0((ReactAbsoluteSizeSpan) obj);
            }
        });
        stripSpansOfKind(spannableStringBuilder, ReactBackgroundColorSpan.class, new Predicate() { // from class: com.facebook.react.views.textinput.ReactEditText$$ExternalSyntheticLambda1
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f$0.lambda$stripStyleEquivalentSpans$1((ReactBackgroundColorSpan) obj);
            }
        });
        stripSpansOfKind(spannableStringBuilder, ReactForegroundColorSpan.class, new Predicate() { // from class: com.facebook.react.views.textinput.ReactEditText$$ExternalSyntheticLambda2
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f$0.lambda$stripStyleEquivalentSpans$2((ReactForegroundColorSpan) obj);
            }
        });
        stripSpansOfKind(spannableStringBuilder, ReactStrikethroughSpan.class, new Predicate() { // from class: com.facebook.react.views.textinput.ReactEditText$$ExternalSyntheticLambda3
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f$0.lambda$stripStyleEquivalentSpans$3((ReactStrikethroughSpan) obj);
            }
        });
        stripSpansOfKind(spannableStringBuilder, ReactUnderlineSpan.class, new Predicate() { // from class: com.facebook.react.views.textinput.ReactEditText$$ExternalSyntheticLambda4
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f$0.lambda$stripStyleEquivalentSpans$4((ReactUnderlineSpan) obj);
            }
        });
        stripSpansOfKind(spannableStringBuilder, CustomLetterSpacingSpan.class, new Predicate() { // from class: com.facebook.react.views.textinput.ReactEditText$$ExternalSyntheticLambda5
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f$0.lambda$stripStyleEquivalentSpans$5((CustomLetterSpacingSpan) obj);
            }
        });
        stripSpansOfKind(spannableStringBuilder, CustomStyleSpan.class, new Predicate() { // from class: com.facebook.react.views.textinput.ReactEditText$$ExternalSyntheticLambda6
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f$0.lambda$stripStyleEquivalentSpans$6((CustomStyleSpan) obj);
            }
        });
    }

    public void updateCachedSpannable() throws Throwable {
        if (this.mStateWrapper == null || getId() == -1) {
            return;
        }
        Editable text = getText();
        boolean z2 = text != null && text.length() > 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z2) {
            try {
                spannableStringBuilder.append(text.subSequence(0, text.length()));
            } catch (IndexOutOfBoundsException e2) {
                ReactSoftExceptionLogger.logSoftException(this.TAG, e2);
            }
        }
        if (!z2) {
            if (getHint() == null || getHint().length() <= 0) {
                spannableStringBuilder.append("I");
            } else {
                spannableStringBuilder.append(getHint());
            }
        }
        addSpansFromStyleAttributes(spannableStringBuilder);
        TextLayoutManager.setCachedSpannableForTag(getId(), spannableStringBuilder);
    }

    private void updateImeOptions() {
        String str = this.mReturnKeyType;
        int i2 = 6;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "previous":
                    i2 = 7;
                    break;
                case "search":
                    i2 = 3;
                    break;
                case "go":
                    i2 = 2;
                    break;
                case "next":
                    i2 = 5;
                    break;
                case "none":
                    i2 = 1;
                    break;
                case "send":
                    i2 = 4;
                    break;
            }
        }
        if (this.mDisableFullscreen) {
            setImeOptions((-1) - (((-1) - 33554432) & ((-1) - i2)));
        } else {
            setImeOptions(i2);
        }
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.mListeners.add(textWatcher);
    }

    protected void applyTextAttributes() {
        setTextSize(0, this.mTextAttributes.getEffectiveFontSize());
        float effectiveLetterSpacing = this.mTextAttributes.getEffectiveLetterSpacing();
        if (Float.isNaN(effectiveLetterSpacing)) {
            return;
        }
        setLetterSpacing(effectiveLetterSpacing);
    }

    public boolean canUpdateWithEventCount(int i2) {
        return i2 >= this.mNativeEventCount;
    }

    @Override // android.view.View
    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        hideSoftKeyboard();
    }

    void clearFocusFromJS() {
        clearFocus();
    }

    void commitStagedInputType() {
        if (getInputType() != this.mStagedInputType) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.mStagedInputType);
            setSelection(selectionStart, selectionEnd);
        }
    }

    protected void finalize() {
        if (DEBUG_MODE) {
            FLog.e(this.TAG, "finalize[" + getId() + "] delete cached spannable");
        }
        TextLayoutManager.deleteCachedSpannableForTag(getId());
    }

    public int getBorderColor(int i2) {
        if (!ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            return this.mReactBackgroundManager.getBorderColor(i2);
        }
        Integer borderColor = BackgroundStyleApplicator.getBorderColor(this, LogicalEdge.values()[i2]);
        if (borderColor == null) {
            return 0;
        }
        return borderColor.intValue();
    }

    public boolean getDisableFullscreenUI() {
        return this.mDisableFullscreen;
    }

    int getGravityHorizontal() {
        return getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
    }

    public String getReturnKeyType() {
        return this.mReturnKeyType;
    }

    int getStagedInputType() {
        return this.mStagedInputType;
    }

    public StateWrapper getStateWrapper() {
        return this.mStateWrapper;
    }

    public String getSubmitBehavior() {
        return this.mSubmitBehavior;
    }

    protected void hideSoftKeyboard() {
        this.mInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public int incrementAndGetEventCounter() {
        int i2 = this.mNativeEventCount + 1;
        this.mNativeEventCount = i2;
        return i2;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                if (textInlineImageSpan.getDrawable() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    boolean isMultiline() {
        return (-1) - (((-1) - getInputType()) | ((-1) - 131072)) != 0;
    }

    public void maybeSetSelection(int i2, int i3, int i4) {
        if (!canUpdateWithEventCount(i2) || i3 == -1 || i4 == -1) {
            return;
        }
        setSelection(clampToTextLength(i3), clampToTextLength(i4));
    }

    public void maybeSetText(ReactTextUpdate reactTextUpdate) throws Throwable {
        if (!(isSecureText() && TextUtils.equals(getText(), reactTextUpdate.getText())) && canUpdateWithEventCount(reactTextUpdate.getJsEventCounter())) {
            if (DEBUG_MODE) {
                FLog.e(this.TAG, "maybeSetText[" + getId() + "]: current text: " + ((Object) getText()) + " update: " + ((Object) reactTextUpdate.getText()));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(reactTextUpdate.getText());
            manageSpans(spannableStringBuilder);
            stripStyleEquivalentSpans(spannableStringBuilder);
            this.mContainsImages = reactTextUpdate.containsImages();
            this.mDisableTextDiffing = true;
            if (reactTextUpdate.getText().length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.mDisableTextDiffing = false;
            if (getBreakStrategy() != reactTextUpdate.getTextBreakStrategy()) {
                setBreakStrategy(reactTextUpdate.getTextBreakStrategy());
            }
            updateCachedSpannable();
        }
    }

    public void maybeSetTextFromJS(ReactTextUpdate reactTextUpdate) throws Throwable {
        this.mIsSettingTextFromJS = true;
        maybeSetText(reactTextUpdate);
        this.mIsSettingTextFromJS = false;
    }

    public void maybeSetTextFromState(ReactTextUpdate reactTextUpdate) throws Throwable {
        this.mIsSettingTextFromState = true;
        maybeSetText(reactTextUpdate);
        this.mIsSettingTextFromState = false;
    }

    public void maybeUpdateTypeface() throws Throwable {
        if (this.mTypefaceDirty) {
            this.mTypefaceDirty = false;
            Typeface typeface = getTypeface();
            int i2 = this.mFontStyle;
            int i3 = this.mFontWeight;
            String str = this.mFontFamily;
            Context context = getContext();
            short sXd = (short) (Od.Xd() ^ (-2115));
            int[] iArr = new int["DRIXVQM\u0018N[[bT^e 6ccj\\pm".length()];
            QB qb = new QB("DRIXVQM\u0018N[[bT^e 6ccj\\pm");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i4));
                i4++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i4)).getMethod(Wg.Zd("OA\u0004F, CFj", (short) (OY.Xd() ^ 2175), (short) (OY.Xd() ^ 14041)), new Class[0]);
            try {
                method.setAccessible(true);
                setTypeface(ReactTypefaceUtils.applyStyles(typeface, i2, i3, str, (AssetManager) method.invoke(context, objArr)));
                if (this.mFontStyle == -1 && this.mFontWeight == -1 && this.mFontFamily == null && getFontFeatureSettings() == null) {
                    setPaintFlags((-1) - (((-1) - getPaintFlags()) | ((-1) - (-129))));
                } else {
                    setPaintFlags((-1) - (((-1) - getPaintFlags()) & ((-1) - 128)));
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        super.setTextIsSelectable(true);
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onAttachedToWindow();
            }
        }
        if (this.mAutoFocus && !this.mDidAttachToWindow) {
            requestFocusInternal();
        }
        this.mDidAttachToWindow = true;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext reactContext = UIManagerHelper.getReactContext(this);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && this.mOnKeyPress) {
            inputConnectionOnCreateInputConnection = new ReactEditTextInputConnectionWrapper(inputConnectionOnCreateInputConnection, reactContext, this, this.mEventDispatcher);
        }
        if (isMultiline() && (shouldBlurOnReturn() || shouldSubmitOnReturn())) {
            editorInfo.imeOptions &= -1073741825;
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public void onDetachedFromWindow() throws Throwable {
        super.onDetachedFromWindow();
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onDetachedFromWindow();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            this.mReactBackgroundManager.maybeClipToPaddingBox(canvas);
        } else if (this.mOverflow != Overflow.VISIBLE) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onFinishTemporaryDetach();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z2, int i2, Rect rect) {
        SelectionWatcher selectionWatcher;
        super.onFocusChanged(z2, i2, rect);
        if (!z2 || (selectionWatcher = this.mSelectionWatcher) == null) {
            return;
        }
        selectionWatcher.onSelectionChanged(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 66 || isMultiline()) {
            return super.onKeyUp(i2, keyEvent);
        }
        hideSoftKeyboard();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        onContentSizeChange();
        if (this.mSelectTextOnFocus && isFocused()) {
            selectAll();
            this.mSelectTextOnFocus = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        ScrollWatcher scrollWatcher = this.mScrollWatcher;
        if (scrollWatcher != null) {
            scrollWatcher.onScrollChanged(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i2, int i3) {
        if (DEBUG_MODE) {
            FLog.e(this.TAG, "onSelectionChanged[" + getId() + "]: " + i2 + Global.BLANK + i3);
        }
        super.onSelectionChanged(i2, i3);
        if (this.mSelectionWatcher == null || !hasFocus()) {
            return;
        }
        this.mSelectionWatcher.onSelectionChanged(i2, i3);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onStartTemporaryDetach();
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i2) {
        if (i2 == 16908322) {
            i2 = R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(i2);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDetectScrollMovement = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.mDetectScrollMovement) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.mDetectScrollMovement = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList<TextWatcher> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.mListeners.isEmpty()) {
                this.mListeners = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        return isFocused();
    }

    public void requestFocusFromJS() {
        requestFocusInternal();
    }

    public void setAllowFontScaling(boolean z2) {
        if (this.mTextAttributes.getAllowFontScaling() != z2) {
            this.mTextAttributes.setAllowFontScaling(z2);
            applyTextAttributes();
        }
    }

    public void setAutoFocus(boolean z2) {
        this.mAutoFocus = z2;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(i2));
        } else {
            this.mReactBackgroundManager.setBackgroundColor(i2);
        }
    }

    public void setBorderColor(int i2, Integer num) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.values()[i2], num);
        } else {
            this.mReactBackgroundManager.setBorderColor(i2, num);
        }
    }

    public void setBorderRadius(float f2) {
        setBorderRadius(f2, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    public void setBorderRadius(float f2, int i2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i2], Float.isNaN(f2) ? null : new LengthPercentage(PixelUtil.toDIPFromPixel(f2), LengthPercentageType.POINT));
        } else {
            this.mReactBackgroundManager.setBorderRadius(f2, i2);
        }
    }

    public void setBorderStyle(String str) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderStyle(this, str == null ? null : BorderStyle.fromString(str));
        } else {
            this.mReactBackgroundManager.setBorderStyle(str);
        }
    }

    public void setBorderWidth(int i2, float f2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.values()[i2], Float.valueOf(PixelUtil.toDIPFromPixel(f2)));
        } else {
            this.mReactBackgroundManager.setBorderWidth(i2, f2);
        }
    }

    public void setContentSizeWatcher(ContentSizeWatcher contentSizeWatcher) {
        this.mContentSizeWatcher = contentSizeWatcher;
    }

    public void setContextMenuHidden(boolean z2) {
        this.mContextMenuHidden = z2;
    }

    public void setDisableFullscreenUI(boolean z2) {
        this.mDisableFullscreen = z2;
        updateImeOptions();
    }

    void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.mEventDispatcher = eventDispatcher;
    }

    public void setFontFamily(String str) {
        this.mFontFamily = str;
        this.mTypefaceDirty = true;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(String str) {
        if (Objects.equals(str, getFontFeatureSettings())) {
            return;
        }
        super.setFontFeatureSettings(str);
        this.mTypefaceDirty = true;
    }

    public void setFontSize(float f2) {
        this.mTextAttributes.setFontSize(f2);
        applyTextAttributes();
    }

    public void setFontStyle(String str) {
        int fontStyle = ReactTypefaceUtils.parseFontStyle(str);
        if (fontStyle != this.mFontStyle) {
            this.mFontStyle = fontStyle;
            this.mTypefaceDirty = true;
        }
    }

    public void setFontWeight(String str) {
        int fontWeight = ReactTypefaceUtils.parseFontWeight(str);
        if (fontWeight != this.mFontWeight) {
            this.mFontWeight = fontWeight;
            this.mTypefaceDirty = true;
        }
    }

    void setGravityHorizontal(int i2) {
        if (i2 == 0) {
            i2 = this.mDefaultGravityHorizontal;
        }
        int gravity = (-1) - (((-1) - getGravity()) | ((-1) - (-8388616)));
        setGravity((i2 + gravity) - (i2 & gravity));
    }

    void setGravityVertical(int i2) {
        if (i2 == 0) {
            i2 = this.mDefaultGravityVertical;
        }
        setGravity((-1) - (((-1) - i2) & ((-1) - (getGravity() & (-113)))));
    }

    @Override // android.widget.TextView
    public void setInputType(int i2) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i2);
        this.mStagedInputType = i2;
        super.setTypeface(typeface);
        if (isMultiline()) {
            setSingleLine(false);
        }
        if (this.mKeyListener == null) {
            this.mKeyListener = new InternalKeyListener();
        }
        this.mKeyListener.setInputType(i2);
        setKeyListener(this.mKeyListener);
    }

    public void setLetterSpacingPt(float f2) {
        this.mTextAttributes.setLetterSpacing(f2);
        applyTextAttributes();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        this.mTextAttributes.setLineHeight(i2);
    }

    public void setMaxFontSizeMultiplier(float f2) {
        if (f2 != this.mTextAttributes.getMaxFontSizeMultiplier()) {
            this.mTextAttributes.setMaxFontSizeMultiplier(f2);
            applyTextAttributes();
        }
    }

    public void setOnKeyPress(boolean z2) {
        this.mOnKeyPress = z2;
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.mOverflow = Overflow.VISIBLE;
        } else {
            Overflow overflowFromString = Overflow.fromString(str);
            if (overflowFromString == null) {
                overflowFromString = Overflow.VISIBLE;
            }
            this.mOverflow = overflowFromString;
        }
        this.mReactBackgroundManager.setOverflow(str);
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (Objects.equals(str, this.mPlaceholder)) {
            return;
        }
        this.mPlaceholder = str;
        setHint(str);
    }

    public void setReturnKeyType(String str) {
        this.mReturnKeyType = str;
        updateImeOptions();
    }

    public void setScrollWatcher(ScrollWatcher scrollWatcher) {
        this.mScrollWatcher = scrollWatcher;
    }

    public void setSelectTextOnFocus(boolean z2) {
        super.setSelectAllOnFocus(z2);
        this.mSelectTextOnFocus = z2;
    }

    @Override // android.widget.EditText
    public void setSelection(int i2, int i3) {
        if (DEBUG_MODE) {
            FLog.e(this.TAG, "setSelection[" + getId() + "]: " + i2 + Global.BLANK + i3);
        }
        super.setSelection(i2, i3);
    }

    public void setSelectionWatcher(SelectionWatcher selectionWatcher) {
        this.mSelectionWatcher = selectionWatcher;
    }

    void setStagedInputType(int i2) {
        this.mStagedInputType = i2;
    }

    public void setStateWrapper(StateWrapper stateWrapper) {
        this.mStateWrapper = stateWrapper;
    }

    public void setSubmitBehavior(String str) {
        this.mSubmitBehavior = str;
    }

    public boolean shouldBlurOnReturn() {
        String submitBehavior = getSubmitBehavior();
        return submitBehavior == null ? !isMultiline() : submitBehavior.equals("blurAndSubmit");
    }

    public boolean shouldSubmitOnReturn() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior == null) {
            if (isMultiline()) {
                return false;
            }
        } else if (!submitBehavior.equals("submit") && !submitBehavior.equals("blurAndSubmit")) {
            return false;
        }
        return true;
    }

    protected boolean showSoftKeyboard() {
        return this.mInputMethodManager.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                if (textInlineImageSpan.getDrawable() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
