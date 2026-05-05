package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1607wl;
import yg.C1626yg;
import yg.Jg;
import yg.Od;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiEditTextHelper {
    private final EmojiEditTextHelper mEmojiEditTextHelper;
    private final EditText mView;

    AppCompatEmojiEditTextHelper(EditText editText) {
        this.mView = editText;
        this.mEmojiEditTextHelper = new EmojiEditTextHelper(editText, false);
    }

    void loadFromAttributes(AttributeSet attributeSet, int i2) {
        Context context = this.mView.getContext();
        int[] iArr = R.styleable.AppCompatTextView;
        Class<?> cls = Class.forName(Jg.Wd("h,h-p1\u0003\u0013\u000fQvS\u000bZ\u0017\u0017ru;W\u000fh;", (short) (ZN.Xd() ^ 14599), (short) (ZN.Xd() ^ 20973)));
        Class<?>[] clsArr = {Class.forName(ZO.xd("{~1\u007f\n\u0014\u001e`8,\nvlfJP\u001c\u0015#-\u001e\u0006MJ:", (short) (C1607wl.Xd() ^ 685), (short) (C1607wl.Xd() ^ 32272))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), 0};
        Method method = cls.getMethod(C1626yg.Ud("\"p\r)P!W6d?:b\u001bND;h>\u007fh\u0010f", (short) (Od.Xd() ^ (-28536)), (short) (Od.Xd() ^ (-5847))), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            try {
                boolean z2 = typedArray.hasValue(R.styleable.AppCompatTextView_emojiCompatEnabled) ? typedArray.getBoolean(R.styleable.AppCompatTextView_emojiCompatEnabled, true) : true;
                typedArray.recycle();
                setEnabled(z2);
            } catch (Throwable th) {
                typedArray.recycle();
                throw th;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    boolean isEmojiCapableKeyListener(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void setEnabled(boolean z2) {
        this.mEmojiEditTextHelper.setEnabled(z2);
    }

    boolean isEnabled() {
        return this.mEmojiEditTextHelper.isEnabled();
    }

    KeyListener getKeyListener(KeyListener keyListener) {
        return isEmojiCapableKeyListener(keyListener) ? this.mEmojiEditTextHelper.getKeyListener(keyListener) : keyListener;
    }

    InputConnection onCreateInputConnection(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.mEmojiEditTextHelper.onCreateInputConnection(inputConnection, editorInfo);
    }
}
