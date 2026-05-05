package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.core.util.Preconditions;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public final class IntentCompat {
    public static final String ACTION_CREATE_REMINDER = "android.intent.action.CREATE_REMINDER";
    public static final String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
    public static final String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";
    public static final String EXTRA_TIME = "android.intent.extra.TIME";

    private IntentCompat() {
    }

    public static Intent makeMainSelectorActivity(String str, String str2) {
        return Intent.makeMainSelectorActivity(str, str2);
    }

    public static Intent createManageUnusedAppRestrictionsIntent(Context context, String str) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("t6#\n\u0004!b77E,Wy\u001c\u0006lp4&9T1o", (short) (Od.Xd() ^ (-26424)), (short) (Od.Xd() ^ (-23720)))).getMethod(Ig.wd("\\-LE,q[\u0017r\u0006i\"|oStI", (short) (C1499aX.Xd() ^ (-13145))), new Class[0]);
        try {
            method.setAccessible(true);
            if (!PackageManagerCompat.areUnusedAppRestrictionsAvailable((PackageManager) method.invoke(context, objArr))) {
                throw new UnsupportedOperationException(Wg.Zd("Y)x7_\u001d`\u0001h)\u001f\b\u001c2q&]^/[i'\u0011W\u001cWc%(R \u0014U\u001f\u000f\u0011!Y$\u0010\t]\u0010W\u0012E\u0010Y\b\nZ\u0010A]\u0011ISF\u0002B\u001d\u000e>\u0001", (short) (C1499aX.Xd() ^ (-19124)), (short) (C1499aX.Xd() ^ (-13815))));
            }
            int i2 = Build.VERSION.SDK_INT;
            String strOd = EO.Od("\u001cBh\u000e~:\n", (short) (C1499aX.Xd() ^ (-28293)));
            if (i2 >= 31) {
                return new Intent(C1561oA.Qd("\n\u0016\u000b\u0018\u0014\r\u0007O\u0014\u0005\u0013\u0012\u0006\n\u0002\rFXfe`\\URdX][kOO]IPRXcVGUTHLDO", (short) (FB.Xd() ^ 9136))).setData(Uri.fromParts(strOd, str, null));
            }
            Intent data = new Intent(C1593ug.zd("gul{ytp;w}\u0005v\u0001\bBvy\f\u0002\t\tI]rrn\u007fsgyspk\u0007xn|xu\u0001\u0002x\u007f\u007f\u0006", (short) (Od.Xd() ^ (-27710)), (short) (Od.Xd() ^ (-28025)))).setData(Uri.fromParts(strOd, str, null));
            if (Build.VERSION.SDK_INT >= 30) {
                return data;
            }
            Class<?> cls = Class.forName(C1561oA.od("\f\u0018\r\u001a\u0016\u000f\tQ\u0006\u0011\u000f\u0014\u0004\f\u0011I]\t\u0007\f{\u000e\t", (short) (C1580rY.Xd() ^ (-21187))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd = (short) (Od.Xd() ^ (-27600));
            int[] iArr = new int["32B\u001f14=4;:#8F:A@N".length()];
            QB qb = new QB("32B\u001f14=4;:#8F:A@N");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
                i3++;
            }
            Method method2 = cls.getMethod(new String(iArr, 0, i3), clsArr);
            try {
                method2.setAccessible(true);
                return data.setPackage((String) Preconditions.checkNotNull(PackageManagerCompat.getPermissionRevocationVerifierApp((PackageManager) method2.invoke(context, objArr2))));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static <T> T getParcelableExtra(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) Api33Impl.getParcelableExtra(intent, str, cls);
        }
        T t2 = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t2)) {
            return t2;
        }
        return null;
    }

    public static Parcelable[] getParcelableArrayExtra(Intent intent, String str, Class<? extends Parcelable> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (Parcelable[]) Api33Impl.getParcelableArrayExtra(intent, str, cls);
        }
        return intent.getParcelableArrayExtra(str);
    }

    public static <T> ArrayList<T> getParcelableArrayListExtra(Intent intent, String str, Class<? extends T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.getParcelableArrayListExtra(intent, str, cls);
        }
        return intent.getParcelableArrayListExtra(str);
    }

    public static <T extends Serializable> T getSerializableExtra(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) Api33Impl.getSerializableExtra(intent, str, cls);
        }
        T t2 = (T) intent.getSerializableExtra(str);
        if (cls.isInstance(t2)) {
            return t2;
        }
        return null;
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static <T> T getParcelableExtra(Intent intent, String str, Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }

        static <T> T[] getParcelableArrayExtra(Intent intent, String str, Class<T> cls) {
            return (T[]) intent.getParcelableArrayExtra(str, cls);
        }

        static <T> ArrayList<T> getParcelableArrayListExtra(Intent intent, String str, Class<? extends T> cls) {
            return intent.getParcelableArrayListExtra(str, cls);
        }

        static <T extends Serializable> T getSerializableExtra(Intent intent, String str, Class<T> cls) {
            return (T) intent.getSerializableExtra(str, cls);
        }
    }
}
