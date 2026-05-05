package io.cobrowse;

import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.inspector.WindowInspector;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class Windows {
    Windows() {
    }

    static List<View> getAll() {
        return Build.VERSION.SDK_INT >= 29 ? getAllV29() : getAllV19();
    }

    static List<View> getAll(Display display) {
        if (display == null) {
            return getAll();
        }
        ArrayList arrayList = new ArrayList();
        for (View view : getAll()) {
            Display display2 = view.getDisplay();
            if (display2 != null && display2.getDisplayId() == display.getDisplayId()) {
                arrayList.add(view);
            }
        }
        return arrayList;
    }

    private static List<View> getAllV19() {
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            return viewsFromWM(cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (Exception e2) {
            return new ArrayList();
        }
    }

    private static List<View> getAllV29() {
        return WindowInspector.getGlobalWindowViews();
    }

    static View getFocused(Display display) {
        for (View view : getAll(display)) {
            if (view.hasWindowFocus()) {
                return view;
            }
        }
        return null;
    }

    private static List<View> viewsFromWM(Class cls, Object obj) throws Exception {
        Field declaredField = cls.getDeclaredField("mViews");
        declaredField.setAccessible(true);
        Object obj2 = declaredField.get(obj);
        return obj2 instanceof List ? (List) declaredField.get(obj) : obj2 instanceof View[] ? Arrays.asList((View[]) declaredField.get(obj)) : new ArrayList();
    }
}
