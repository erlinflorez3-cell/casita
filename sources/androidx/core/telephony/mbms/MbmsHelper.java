package androidx.core.telephony.mbms;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.mbms.ServiceInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import yg.C1580rY;
import yg.OY;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes4.dex */
public final class MbmsHelper {
    private MbmsHelper() {
    }

    public static CharSequence getBestNameForService(Context context, ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getBestNameForService(context, serviceInfo);
        }
        return null;
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static CharSequence getBestNameForService(Context context, ServiceInfo serviceInfo) throws Throwable {
            Set<Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            Iterator<Locale> it = serviceInfo.getNamedContentLocales().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                strArr[i2] = it.next().toLanguageTag();
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("8F9HJE=\bBOKRHRU\u0010*WSZPd]", (short) (C1580rY.Xd() ^ (-4612)))).getMethod(Qg.kd(">;I&8E@EA12?", (short) (OY.Xd() ^ 6289), (short) (OY.Xd() ^ 26617)), new Class[0]);
            try {
                method.setAccessible(true);
                Locale firstMatch = ((Resources) method.invoke(context, objArr)).getConfiguration().getLocales().getFirstMatch(strArr);
                if (firstMatch == null) {
                    return null;
                }
                return serviceInfo.getNameForLocale(firstMatch);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
