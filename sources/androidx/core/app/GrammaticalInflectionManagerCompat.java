package androidx.core.app;

import android.app.GrammaticalInflectionManager;
import android.content.Context;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1580rY;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.Od;

/* JADX INFO: loaded from: classes4.dex */
public final class GrammaticalInflectionManagerCompat {
    public static final int GRAMMATICAL_GENDER_FEMININE = 2;
    public static final int GRAMMATICAL_GENDER_MASCULINE = 3;
    public static final int GRAMMATICAL_GENDER_NEUTRAL = 1;
    public static final int GRAMMATICAL_GENDER_NOT_SPECIFIED = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GrammaticalGender {
    }

    private GrammaticalInflectionManagerCompat() {
    }

    public static int getApplicationGrammaticalGender(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getApplicationGrammaticalGender(context);
        }
        return 0;
    }

    public static void setRequestedApplicationGrammaticalGender(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setRequestedApplicationGrammaticalGender(context, i2);
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static int getApplicationGrammaticalGender(Context context) {
            return getGrammaticalInflectionManager(context).getApplicationGrammaticalGender();
        }

        static void setRequestedApplicationGrammaticalGender(Context context, int i2) {
            getGrammaticalInflectionManager(context).setRequestedApplicationGrammaticalGender(i2);
        }

        private static GrammaticalInflectionManager getGrammaticalInflectionManager(Context context) throws Throwable {
            Object[] objArr = {GrammaticalInflectionManager.class};
            Method method = Class.forName(C1626yg.Ud("7er~)\nP.6\u001eD2 \u000e9\n mW\b#F\u0019", (short) (C1499aX.Xd() ^ (-11504)), (short) (C1499aX.Xd() ^ (-10342)))).getMethod(EO.Od("\t7vo\u0018nE\u0011gKY\u000bY\\0V", (short) (Od.Xd() ^ (-21659))), Class.forName(Ig.wd("5v[)\u001b$?Z,ARc-75", (short) (C1580rY.Xd() ^ (-6963)))));
            try {
                method.setAccessible(true);
                return (GrammaticalInflectionManager) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
