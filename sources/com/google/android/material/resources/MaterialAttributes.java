package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.R;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.getface.controllers.IDGetFaceController;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialAttributes {
    public static TypedValue resolve(Context context, int i2) throws Throwable {
        TypedValue typedValue = new TypedValue();
        Class<?> cls = Class.forName(C1561oA.yd("u\u0002z\b\u007fxv?\u007f\u000b\r\u0012}\u0006\u000fGg\u0013\u0015\u001a\u0006\u0018\u0017", (short) (OY.Xd() ^ 28205)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 7135);
        int[] iArr = new int["UTdEZXaZ".length()];
        QB qb = new QB("UTdEZXaZ");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            if (((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(i2, typedValue, true)) {
                return typedValue;
            }
            return null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean resolveBoolean(Context context, int i2, boolean z2) throws Throwable {
        TypedValue typedValueResolve = resolve(context, i2);
        return (typedValueResolve == null || typedValueResolve.type != 18) ? z2 : typedValueResolve.data != 0;
    }

    public static boolean resolveBooleanOrThrow(Context context, int i2, String str) {
        return resolveOrThrow(context, i2, str) != 0;
    }

    public static int resolveDimension(Context context, int i2, int i3) throws Throwable {
        float dimension;
        TypedValue typedValueResolve = resolve(context, i2);
        if (typedValueResolve == null || typedValueResolve.type != 5) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("`m z~s\u00014mxC^.9}\"j\u001dSTl\u000b5", (short) (Od.Xd() ^ (-19740)), (short) (Od.Xd() ^ (-8254)))).getMethod(C1626yg.Ud("_wT\r 5wrVjn]", (short) (Od.Xd() ^ (-24244)), (short) (Od.Xd() ^ (-30512))), new Class[0]);
            try {
                method.setAccessible(true);
                dimension = ((Resources) method.invoke(context, objArr)).getDimension(i3);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Xg.qd("lzq\u0001~yu@v\u0004\u0004\u000b|\u0007\u000eH^\f\f\u0013\u0005\u0019\u0016", (short) (Od.Xd() ^ (-447)), (short) (Od.Xd() ^ (-17579)))).getMethod(Jg.Wd("@4I\u001d8k]kNU~\u0003", (short) (OY.Xd() ^ IDGetFaceController.FACE_DATA_RESULT_MAX_REINTENTS), (short) (OY.Xd() ^ 7045)), new Class[0]);
            try {
                method2.setAccessible(true);
                dimension = typedValueResolve.getDimension(((Resources) method2.invoke(context, objArr2)).getDisplayMetrics());
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return (int) dimension;
    }

    public static int resolveInteger(Context context, int i2, int i3) throws Throwable {
        TypedValue typedValueResolve = resolve(context, i2);
        return (typedValueResolve == null || typedValueResolve.type != 16) ? i3 : typedValueResolve.data;
    }

    public static int resolveMinimumAccessibleTouchTarget(Context context) {
        return resolveDimension(context, R.attr.minTouchTargetSize, R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(Context context, int i2, String str) {
        return resolveTypedValueOrThrow(context, i2, str).data;
    }

    public static int resolveOrThrow(View view, int i2) {
        return resolveTypedValueOrThrow(view, i2).data;
    }

    public static TypedValue resolveTypedValueOrThrow(Context context, int i2, String str) throws Throwable {
        TypedValue typedValueResolve = resolve(context, i2);
        if (typedValueResolve != null) {
            return typedValueResolve;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("\"aE;h\u000el\u001e\r81a\u0004\u000b\u0019s0f\u001d\u001bE J", (short) (C1633zX.Xd() ^ (-25994)))).getMethod(EO.Od("q7\u001a^\u001cV\\=\u0005\b\n4", (short) (C1607wl.Xd() ^ 13687)), new Class[0]);
        try {
            method.setAccessible(true);
            Object[] objArr2 = {str, ((Resources) method.invoke(context, objArr)).getResourceName(i2)};
            short sXd = (short) (C1607wl.Xd() ^ 771);
            int[] iArr = new int["4?1\u007f+|ny|owiv\"b u_iq`\u001a_gi\u0016i\\X\u0012\u0016\"\u0013a\rM_^[QI[YI\u0003VP\u007fAC|O@NxAEuNCHDp1?>l@3/6-te\u001e38a$!-]\"%/\"\u001e*V)\u001a(R&\u0019\u0015N\u000f! \u001d\u0013\u000b\u001d\u001b\u000bD\r\u0011A\u001a\u000f\u0014\u0010<\u0010\u0003~\u0006|6\u0005\u00073\b\u0002tp\u0003r,\u0005y~z'zmipg!tn\u001efjc_kak\u0016[fb_\u0011DWSZQ\u00197J\\LXNEO%PMOMKAINLw~EGs4q55B12:/+7<os".length()];
            QB qb = new QB("4?1\u007f+|ny|owiv\"b u_iq`\u001a_gi\u0016i\\X\u0012\u0016\"\u0013a\rM_^[QI[YI\u0003VP\u007fAC|O@NxAEuNCHDp1?>l@3/6-te\u001e38a$!-]\"%/\"\u001e*V)\u001a(R&\u0019\u0015N\u000f! \u001d\u0013\u000b\u001d\u001b\u000bD\r\u0011A\u001a\u000f\u0014\u0010<\u0010\u0003~\u0006|6\u0005\u00073\b\u0002tp\u0003r,\u0005y~z'zmipg!tn\u001efjc_kak\u0016[fb_\u0011DWSZQ\u00197J\\LXNEO%PMOMKAINLw~EGs4q55B12:/+7<os");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
                i3++;
            }
            throw new IllegalArgumentException(String.format(new String(iArr, 0, i3), objArr2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static TypedValue resolveTypedValueOrThrow(View view, int i2) {
        return resolveTypedValueOrThrow(view.getContext(), i2, view.getClass().getCanonicalName());
    }
}
