package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.content.IntentCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public class AppLaunchChecker {
    private static final String KEY_STARTED_FROM_LAUNCHER = "startedFromLauncher";
    private static final String SHARED_PREFS_NAME = "android.support.AppLaunchChecker";

    public static boolean hasStartedFromLauncher(Context context) throws Throwable {
        Object[] objArr = {C1561oA.Qd("u\u0002v\u0004\u007fxr;\u007f\u0001zywyz3EsrMatl`d>b^[b[g", (short) (ZN.Xd() ^ 22410)), 0};
        Method method = Class.forName(C1593ug.zd("\"0'64/+u,99@2<C}\u0014AAH:NK", (short) (FB.Xd() ^ 2996), (short) (FB.Xd() ^ 25828))).getMethod(C1561oA.Kd("DCS3ICUII6YMOO]Q[QTc", (short) (C1499aX.Xd() ^ (-12563))), Class.forName(C1561oA.od("si}g3pdph.Rroeia", (short) (C1580rY.Xd() ^ (-9801)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            short sXd = (short) (C1607wl.Xd() ^ 12799);
            short sXd2 = (short) (C1607wl.Xd() ^ 8787);
            int[] iArr = new int["\n!'D(/75\"5Lx.WZ,1K+".length()];
            QB qb = new QB("\n!'D(/75\"5Lx.WZ,1K+");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            return sharedPreferences.getBoolean(new String(iArr, 0, i2), false);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void onActivityCreate(Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(SHARED_PREFS_NAME, 0);
        if (sharedPreferences.getBoolean(KEY_STARTED_FROM_LAUNCHER, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(IntentCompat.CATEGORY_LEANBACK_LAUNCHER)) {
            sharedPreferences.edit().putBoolean(KEY_STARTED_FROM_LAUNCHER, true).apply();
        }
    }

    @Deprecated
    public AppLaunchChecker() {
    }
}
