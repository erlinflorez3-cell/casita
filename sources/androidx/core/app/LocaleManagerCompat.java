package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.os.LocaleListCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import yg.C1561oA;
import yg.C1593ug;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class LocaleManagerCompat {
    private LocaleManagerCompat() {
    }

    public static LocaleListCompat getSystemLocales(Context context) throws Throwable {
        LocaleListCompat emptyLocaleList = LocaleListCompat.getEmptyLocaleList();
        if (Build.VERSION.SDK_INT < 33) {
            return getConfigurationLocales(Resources.getSystem().getConfiguration());
        }
        Object localeManagerForApplication = getLocaleManagerForApplication(context);
        if (localeManagerForApplication != null) {
            return LocaleListCompat.wrap(Api33Impl.localeManagerGetSystemLocales(localeManagerForApplication));
        }
        return emptyLocaleList;
    }

    public static LocaleListCompat getApplicationLocales(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            Object localeManagerForApplication = getLocaleManagerForApplication(context);
            if (localeManagerForApplication != null) {
                return LocaleListCompat.wrap(Api33Impl.localeManagerGetApplicationLocales(localeManagerForApplication));
            }
            return LocaleListCompat.getEmptyLocaleList();
        }
        return LocaleListCompat.forLanguageTags(AppLocalesStorageHelper.readLocales(context));
    }

    private static Object getLocaleManagerForApplication(Context context) throws Throwable {
        Object[] objArr = {EO.Od(",\u007f7\u0019rA", (short) (OY.Xd() ^ 14551))};
        Method method = Class.forName(C1561oA.Qd("5A6C?82z/:8=-5:r\u0007205%72", (short) (ZN.Xd() ^ 22554))).getMethod(C1561oA.od("\u0012\u000f\u001dz \u0019\u0019\t\u0010t\u0006\u0012\u0015\u0007\u007f\u0001", (short) (FB.Xd() ^ 23116)), Class.forName(C1593ug.zd("LDZF\u0014SIWQ\u0019?a`X^X", (short) (OY.Xd() ^ 15872), (short) (OY.Xd() ^ 6923))));
        try {
            method.setAccessible(true);
            return method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static LocaleListCompat getConfigurationLocales(Configuration configuration) {
        return Api24Impl.getLocales(configuration);
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static String toLanguageTag(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static LocaleListCompat getLocales(Configuration configuration) {
            return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static LocaleList localeManagerGetSystemLocales(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }

        static LocaleList localeManagerGetApplicationLocales(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }
}
