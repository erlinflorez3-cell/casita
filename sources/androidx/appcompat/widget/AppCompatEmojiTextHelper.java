package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiTextHelper {
    private final EmojiTextViewHelper mEmojiTextViewHelper;
    private final TextView mView;

    AppCompatEmojiTextHelper(TextView textView) {
        this.mView = textView;
        this.mEmojiTextViewHelper = new EmojiTextViewHelper(textView, false);
    }

    void loadFromAttributes(AttributeSet attributeSet, int i2) {
        Context context = this.mView.getContext();
        int[] iArr = R.styleable.AppCompatTextView;
        Class<?> cls = Class.forName(ZO.xd("$T\u007fG\u0001}\u0019%[V6\u000fU#@\u001c?[\u0017;\n\u0001 ", (short) (FB.Xd() ^ 24599), (short) (FB.Xd() ^ 14104)));
        Class<?>[] clsArr = new Class[4];
        short sXd = (short) (Od.Xd() ^ (-3229));
        short sXd2 = (short) (Od.Xd() ^ (-23931));
        int[] iArr2 = new int["Upw-#\t\u0001\u0016s7,N!C4x!r\u000f6q\u0006}uj".length()];
        QB qb = new QB("Upw-#\t\u0001\u0016s7,N!C4x!r\u000f6q\u0006}uj");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        clsArr[1] = int[].class;
        clsArr[2] = Integer.TYPE;
        clsArr[3] = Integer.TYPE;
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), 0};
        short sXd3 = (short) (C1633zX.Xd() ^ (-2120));
        int[] iArr3 = new int["=ac.\\5,b-\u0006z]\b\f\u0018<i|8\u000b@\u000f".length()];
        QB qb2 = new QB("=ac.\\5,b-\u0006z]\b\f\u0018<i|8\u000b@\u000f");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr3[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd3 + i4)));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
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

    void setEnabled(boolean z2) {
        this.mEmojiTextViewHelper.setEnabled(z2);
    }

    public boolean isEnabled() {
        return this.mEmojiTextViewHelper.isEnabled();
    }

    InputFilter[] getFilters(InputFilter[] inputFilterArr) {
        return this.mEmojiTextViewHelper.getFilters(inputFilterArr);
    }

    void setAllCaps(boolean z2) {
        this.mEmojiTextViewHelper.setAllCaps(z2);
    }

    public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
        return this.mEmojiTextViewHelper.wrapTransformationMethod(transformationMethod);
    }
}
