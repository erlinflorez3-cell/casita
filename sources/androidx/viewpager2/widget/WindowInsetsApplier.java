package androidx.viewpager2.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public final class WindowInsetsApplier implements OnApplyWindowInsetsListener {
    private WindowInsetsApplier() {
    }

    public static boolean install(ViewPager2 viewPager2) throws Throwable {
        Object obj;
        Context context = viewPager2.getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("\u001b'\u001c)%\u001e\u0018`\u0015 \u001e#\u0013\u001b Xl\u0018\u0016\u001b\u000b\u001d\u0018", (short) (C1607wl.Xd() ^ 24449), (short) (C1607wl.Xd() ^ 19015))).getMethod(C1561oA.ud("hes?mlgc\\Yk_db<`W_", (short) (ZN.Xd() ^ 25656)), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            if (Build.VERSION.SDK_INT >= 30) {
                String strYd = C1561oA.yd("`lanrke.Zech`hm&_[\u001b-cb]YJGYMZX2V\u0006\u000e", (short) (FB.Xd() ^ 7720));
                String strYd2 = C1561oA.Yd(")\u0017)\u001f\u001e.\u000e (\u0014$24+22", (short) (C1607wl.Xd() ^ 7314));
                try {
                    Class<?> cls = Class.forName(strYd);
                    Field field = 1 != 0 ? cls.getField(strYd2) : cls.getDeclaredField(strYd2);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj = null;
                }
                if (((Integer) obj).intValue() >= 30) {
                    return false;
                }
            }
            ViewCompat.setOnApplyWindowInsetsListener(viewPager2, new WindowInsetsApplier());
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(viewPager2, windowInsetsCompat);
        if (windowInsetsCompatOnApplyWindowInsets.isConsumed()) {
            return windowInsetsCompatOnApplyWindowInsets;
        }
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ViewCompat.dispatchApplyWindowInsets(recyclerView.getChildAt(i2), new WindowInsetsCompat(windowInsetsCompatOnApplyWindowInsets));
        }
        return consumeAllInsets(windowInsetsCompatOnApplyWindowInsets);
    }

    private WindowInsetsCompat consumeAllInsets(WindowInsetsCompat windowInsetsCompat) {
        if (WindowInsetsCompat.CONSUMED.toWindowInsets() != null) {
            return WindowInsetsCompat.CONSUMED;
        }
        return windowInsetsCompat.consumeSystemWindowInsets().consumeStableInsets();
    }
}
