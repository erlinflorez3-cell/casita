package androidx.appcompat.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
public class AllCapsTransformationMethod implements TransformationMethod {
    private Locale mLocale;

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i2, Rect rect) {
    }

    public AllCapsTransformationMethod(Context context) throws Throwable {
        short sXd = (short) (OY.Xd() ^ 25529);
        short sXd2 = (short) (OY.Xd() ^ 7651);
        int[] iArr = new int["\u000bG/\rlT\">uQ#7lH`I!{-E\u0019[i".length()];
        QB qb = new QB("\u000bG/\rlT\">uQ#7lH`I!{-E\u0019[i");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("Ns\u0015&\f\u001a\u0017:\u0015sb&", (short) (FB.Xd() ^ 30082), (short) (FB.Xd() ^ 5865)), new Class[0]);
        try {
            method.setAccessible(true);
            this.mLocale = ((Resources) method.invoke(context, objArr)).getConfiguration().locale;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.mLocale);
        }
        return null;
    }
}
