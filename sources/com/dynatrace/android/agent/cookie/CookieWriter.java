package com.dynatrace.android.agent.cookie;

import android.webkit.CookieManager;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
class CookieWriter {
    private static final String LOG_TAG = Global.LOG_PREFIX + "CookieWriter";
    private CookieManager cookieManager;

    CookieWriter(boolean z2) {
        init(z2);
    }

    private void init(boolean z2) {
        if (z2) {
            try {
                CookieManager.setAcceptFileSchemeCookies(true);
            } catch (Exception e2) {
                if (Global.DEBUG) {
                    Utility.zlogE(LOG_TAG, "unable to access CookieManager", e2);
                    return;
                }
                return;
            }
        }
        if (!CookieManager.getInstance().acceptCookie()) {
            CookieManager.getInstance().setAcceptCookie(true);
        }
        this.cookieManager = CookieManager.getInstance();
    }

    void removeCookies(Set<String> set, Collection<String> collection) {
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next() + "=; Max-Age=-1");
            }
        }
        this.cookieManager.flush();
        writeCookies(set, arrayList, false);
    }

    void writeCookies(Set<String> set, Collection<String> collection, boolean z2) {
        if (this.cookieManager == null) {
            return;
        }
        if (Global.DEBUG) {
            String str = LOG_TAG;
            Utility.zlogD(str, "domains: " + set.toString());
            Utility.zlogD(str, "cookies: " + collection.toString());
        }
        for (String str2 : set) {
            for (String str3 : collection) {
                CookieManager cookieManager = this.cookieManager;
                if (z2) {
                    str3 = str3 + "; secure";
                }
                cookieManager.setCookie(str2, str3);
            }
        }
        this.cookieManager.flush();
    }
}
