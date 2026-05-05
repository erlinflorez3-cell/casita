package androidx.appcompat.widget;

import android.content.Context;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
final class AppCompatTextClassifierHelper {
    private TextClassifier mTextClassifier;
    private TextView mTextView;

    AppCompatTextClassifierHelper(TextView textView) {
        this.mTextView = (TextView) Preconditions.checkNotNull(textView);
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        this.mTextClassifier = textClassifier;
    }

    public TextClassifier getTextClassifier() {
        TextClassifier textClassifier = this.mTextClassifier;
        return textClassifier == null ? Api26Impl.getTextClassifier(this.mTextView) : textClassifier;
    }

    private static final class Api26Impl {
        private Api26Impl() {
        }

        static TextClassifier getTextClassifier(TextView textView) throws Throwable {
            Context context = textView.getContext();
            Class<?> cls = Class.forName(C1561oA.ud(" ,!.*#\u001de\u001a%#(\u0018 %]q\u001d\u001b \u0010\"\u001d", (short) (C1499aX.Xd() ^ (-20929))));
            Class<?>[] clsArr = {Class.forName(C1561oA.yd("4*>(s1%1)n\u0003+\u001f0/", (short) (ZN.Xd() ^ 4639)))};
            Object[] objArr = {TextClassificationManager.class};
            short sXd = (short) (OY.Xd() ^ 18623);
            int[] iArr = new int["qp\u0001`\b\u0003\u0005v\u007ffy\b\r\u0001{~".length()];
            QB qb = new QB("qp\u0001`\b\u0003\u0005v\u007ffy\b\r\u0001{~");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                TextClassificationManager textClassificationManager = (TextClassificationManager) method.invoke(context, objArr);
                if (textClassificationManager != null) {
                    return textClassificationManager.getTextClassifier();
                }
                return TextClassifier.NO_OP;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
