package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawableDecoderCompat {
    private static volatile boolean shouldCallAppCompatResources = true;

    private DrawableDecoderCompat() {
    }

    public static Drawable getDrawable(Context context, int i2, Resources.Theme theme) {
        return getDrawable(context, context, i2, theme);
    }

    public static Drawable getDrawable(Context context, Context context2, int i2) {
        return getDrawable(context, context2, i2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.res.Resources$Theme] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v65, types: [android.graphics.drawable.Drawable] */
    private static Drawable getDrawable(Context context, Context context2, int i2, Resources.Theme theme) throws Throwable {
        Resources.Theme themeLoadDrawableV7 = theme;
        try {
            if (shouldCallAppCompatResources) {
                themeLoadDrawableV7 = loadDrawableV7(context2, i2, themeLoadDrawableV7);
                return themeLoadDrawableV7;
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            Class<?> cls = Class.forName(Jg.Wd("v;T8X\u001cjKb\u0016Z(:\u000bTG0\u0002D\u00046\u0005>", (short) (C1580rY.Xd() ^ (-20630)), (short) (C1580rY.Xd() ^ (-22313))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1499aX.Xd() ^ (-26640));
            short sXd2 = (short) (C1499aX.Xd() ^ (-30650));
            int[] iArr = new int["\"5qo>(ZY@*B<Fz".length()];
            QB qb = new QB("\"5qo>(ZY@*B<Fz");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                String str = (String) method.invoke(context, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1626yg.Ud(",vqs\u00018\u000by77\u000bh]JR3BSS\b*Q>", (short) (C1499aX.Xd() ^ (-2670)), (short) (C1499aX.Xd() ^ (-2589)))).getMethod(Ig.wd("\u001ek\r\u0004m#zh\u0014E,a\u001b%", (short) (OY.Xd() ^ 28715)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    if (str.equals((String) method2.invoke(context2, objArr2))) {
                        throw e2;
                    }
                    return ContextCompat.getDrawable(context2, i2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (NoClassDefFoundError unused2) {
            shouldCallAppCompatResources = false;
        }
        if (themeLoadDrawableV7 == 0) {
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(EO.Od("M\u0014waF\u00061y\u0007RS7sr-@\u00039o\"J\u0001b", (short) (C1633zX.Xd() ^ (-1911)))).getMethod(C1561oA.Qd("olzYlhof", (short) (C1499aX.Xd() ^ (-32308))), new Class[0]);
            try {
                method3.setAccessible(true);
                themeLoadDrawableV7 = (Resources.Theme) method3.invoke(context2, objArr3);
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        return loadDrawableV4(context2, i2, themeLoadDrawableV7);
    }

    private static Drawable loadDrawableV4(Context context, int i2, Resources.Theme theme) throws Throwable {
        Class<?> cls = Class.forName(C1593ug.zd("y\b~\u000e\f\u0007\u0003M\u0004\u0011\u0011\u0018\n\u0014\u001bUk\u0019\u0019 \u0012&#", (short) (C1607wl.Xd() ^ 25338), (short) (C1607wl.Xd() ^ PhotoshopDirectory.TAG_AUTO_SAVE_FILE_PATH)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 28192);
        int[] iArr = new int["\u0002~\ri{\t\u0004\t\u0005tu\u0003".length()];
        QB qb = new QB("\u0002~\ri{\t\u0004\t\u0005tu\u0003");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            return ResourcesCompat.getDrawable((Resources) method.invoke(context, objArr), i2, theme);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static Drawable loadDrawableV7(Context context, int i2, Resources.Theme theme) {
        if (theme != null) {
            context = new ContextThemeWrapper(context, theme);
        }
        return AppCompatResources.getDrawable(context, i2);
    }
}
