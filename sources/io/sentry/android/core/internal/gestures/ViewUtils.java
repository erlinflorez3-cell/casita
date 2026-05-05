package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.GestureTargetLocator;
import io.sentry.internal.gestures.UiElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public final class ViewUtils {
    private static final int[] coordinates = new int[2];

    static UiElement findTarget(SentryAndroidOptions sentryAndroidOptions, View view, float f2, float f3, UiElement.Type type) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        UiElement uiElement = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (touchWithinBounds(view2, f2, f3)) {
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        linkedList.add(viewGroup.getChildAt(i2));
                    }
                }
                Iterator<GestureTargetLocator> it = sentryAndroidOptions.getGestureTargetLocators().iterator();
                while (it.hasNext()) {
                    UiElement uiElementLocate = it.next().locate(view2, f2, f3, type);
                    if (uiElementLocate != null) {
                        if (type == UiElement.Type.CLICKABLE) {
                            uiElement = uiElementLocate;
                        } else if (type == UiElement.Type.SCROLLABLE) {
                            return uiElementLocate;
                        }
                    }
                }
            }
        }
        return uiElement;
    }

    public static String getResourceId(View view) throws Throwable {
        int id = view.getId();
        if (id == -1 || isViewIdGenerated(id)) {
            throw new Resources.NotFoundException();
        }
        Context context = view.getContext();
        short sXd = (short) (FB.Xd() ^ 5198);
        int[] iArr = new int["CQHWUPL\u0017MZZaS]d\u001f5bbi[ol".length()];
        QB qb = new QB("CQHWUPL\u0017MZZaS]d\u001f5bbi[ol");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Xg.qd("=<L+?NKRPBET", (short) (C1607wl.Xd() ^ 12560), (short) (C1607wl.Xd() ^ 4201)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            return resources != null ? resources.getResourceEntryName(id) : "";
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static String getResourceIdWithFallback(View view) {
        try {
            return getResourceId(view);
        } catch (Resources.NotFoundException unused) {
            return "0x" + Integer.toString(view.getId(), 16);
        }
    }

    private static boolean isViewIdGenerated(int i2) {
        return (ViewCompat.MEASURED_STATE_MASK + i2) - ((-16777216) | i2) == 0 && (i2 & ViewCompat.MEASURED_SIZE_MASK) != 0;
    }

    private static boolean touchWithinBounds(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        int[] iArr = coordinates;
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        return f2 >= ((float) i2) && f2 <= ((float) (i2 + view.getWidth())) && f3 >= ((float) i3) && f3 <= ((float) (i3 + view.getHeight()));
    }
}
