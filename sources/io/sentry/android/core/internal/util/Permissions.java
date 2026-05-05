package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;
import io.sentry.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;

/* JADX INFO: loaded from: classes6.dex */
public final class Permissions {
    private Permissions() {
    }

    public static boolean hasPermission(Context context, String str) throws Throwable {
        Objects.requireNonNull(context, C1626yg.Ud("WL/W?ZU~\u001c\\f7I+A%Ct8+\u001dm\u001c'NWO$\u007f~7T\u0017G\u0010w", (short) (FB.Xd() ^ 15787), (short) (FB.Xd() ^ 3611)));
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        Class<?> cls = Class.forName(Ig.wd("d\u001b\u0001q%y\u000brp[VDJ[O,t5YY\u0014\\x", (short) (C1499aX.Xd() ^ (-16424))));
        Class<?>[] clsArr = {Class.forName(EO.Od("tB[dkN%\u001dH1-4\u0002j_>", (short) (OY.Xd() ^ 5971))), Integer.TYPE, Integer.TYPE};
        Object[] objArr = {str, Integer.valueOf(iMyPid), Integer.valueOf(iMyUid)};
        Method method = cls.getMethod(C1561oA.Qd("RVROV:NZTOXWLQO", (short) (Od.Xd() ^ (-21144))), clsArr);
        try {
            method.setAccessible(true);
            return ((Integer) method.invoke(context, objArr)).intValue() == 0;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
