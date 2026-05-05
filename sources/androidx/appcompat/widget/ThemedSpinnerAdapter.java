package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.ContextThemeWrapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
public interface ThemedSpinnerAdapter extends SpinnerAdapter {
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(Resources.Theme theme);

    public static final class Helper {
        private final Context mContext;
        private LayoutInflater mDropDownInflater;
        private final LayoutInflater mInflater;

        public Helper(Context context) {
            this.mContext = context;
            this.mInflater = LayoutInflater.from(context);
        }

        public void setDropDownViewTheme(Resources.Theme theme) throws Throwable {
            if (theme == null) {
                this.mDropDownInflater = null;
                return;
            }
            Context context = this.mContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("=}$PT!m\u000e\b:5_\u001dui\bS\u001cA=rD\u0018", (short) (Od.Xd() ^ (-20410)))).getMethod(EO.Od("l\u0010SU$}c&", (short) (C1580rY.Xd() ^ (-4656))), new Class[0]);
            try {
                method.setAccessible(true);
                if (theme.equals((Resources.Theme) method.invoke(context, objArr))) {
                    this.mDropDownInflater = this.mInflater;
                } else {
                    this.mDropDownInflater = LayoutInflater.from(new ContextThemeWrapper(this.mContext, theme));
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public Resources.Theme getDropDownViewTheme() throws Throwable {
            LayoutInflater layoutInflater = this.mDropDownInflater;
            if (layoutInflater == null) {
                return null;
            }
            Context context = layoutInflater.getContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("\u001d\u007f:)\u0015l-sl#cB}+\"\u0014b\u0002\u0002IC\u0016\u000f", (short) (FB.Xd() ^ 32552), (short) (FB.Xd() ^ 5812))).getMethod(C1626yg.Ud("\u0006?-|v\u0019?g", (short) (C1633zX.Xd() ^ (-20914)), (short) (C1633zX.Xd() ^ (-30968))), new Class[0]);
            try {
                method.setAccessible(true);
                return (Resources.Theme) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public LayoutInflater getDropDownViewInflater() {
            LayoutInflater layoutInflater = this.mDropDownInflater;
            return layoutInflater != null ? layoutInflater : this.mInflater;
        }
    }
}
