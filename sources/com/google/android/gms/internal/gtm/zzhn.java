package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhn {
    static final Map zza = new HashMap();
    private static String zzb = null;

    public static String zza(String str, String str2) {
        if (str2 != null) {
            return Uri.parse("http://hostname/?".concat(String.valueOf(str))).getQueryParameter(str2);
        }
        if (str.length() > 0) {
            return str;
        }
        return null;
    }

    public static String zzb(Context context, String str) {
        if (zzb == null) {
            synchronized (zzhn.class) {
                if (zzb == null) {
                    Object[] objArr = {hg.Vd("AME6?CGG3=<.@220<;-9", (short) (FB.Xd() ^ 29221), (short) (FB.Xd() ^ 11873)), 0};
                    Method method = Class.forName(C1561oA.ud("LXMZVOI\u0012FQOTDLQ\n\u001eIGL<NI", (short) (C1499aX.Xd() ^ (-19248)))).getMethod(C1561oA.Yd("QP`@VPbVVCfZ\\\\j^h^ap", (short) (ZN.Xd() ^ 5665)), Class.forName(C1561oA.yd("UMcO\u001d\\R`J\u00128ZYQWQ", (short) (C1607wl.Xd() ^ 2786))), Integer.TYPE);
                    try {
                        method.setAccessible(true);
                        SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
                        if (sharedPreferences != null) {
                            zzb = sharedPreferences.getString(Xg.qd("vjllz{o}", (short) (Od.Xd() ^ (-28043)), (short) (Od.Xd() ^ (-4102))), "");
                        } else {
                            zzb = "";
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        }
        return zza(zzb, str);
    }
}
