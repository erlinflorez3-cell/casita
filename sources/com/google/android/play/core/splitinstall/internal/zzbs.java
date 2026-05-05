package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.LocaleList;
import com.dynatrace.android.agent.Global;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import yg.C1607wl;
import yg.C1626yg;
import yg.Ig;

/* JADX INFO: loaded from: classes9.dex */
public final class zzbs {
    private final Context zza;

    public zzbs(Context context) {
        this.zza = context;
    }

    private static String zzb(Locale locale) {
        return String.valueOf(locale.getLanguage()).concat(locale.getCountry().isEmpty() ? "" : Global.UNDERSCORE.concat(String.valueOf(locale.getCountry())));
    }

    public final List zza() throws Throwable {
        Context context = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("D\u0017~\u001a{@\u0006j]\u0017DY)^C46*>O\u0007\u001f6", (short) (C1607wl.Xd() ^ 9913), (short) (C1607wl.Xd() ^ 32620))).getMethod(Ig.wd("\u001fn\u000e\u0005n0\u0002} B@v", (short) (C1607wl.Xd() ^ 27289)), new Class[0]);
        try {
            method.setAccessible(true);
            LocaleList locales = ((Resources) method.invoke(context, objArr)).getConfiguration().getLocales();
            ArrayList arrayList = new ArrayList(locales.size());
            for (int i2 = 0; i2 < locales.size(); i2++) {
                arrayList.add(zzb(locales.get(i2)));
            }
            return arrayList;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
