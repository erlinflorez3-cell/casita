package androidx.appcompat.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarPolicy {
    private Context mContext;

    public boolean showsOverflowMenuButton() {
        return true;
    }

    public static ActionBarPolicy get(Context context) {
        return new ActionBarPolicy(context);
    }

    private ActionBarPolicy(Context context) {
        this.mContext = context;
    }

    public int getMaxActionButtons() throws Throwable {
        Context context = this.mContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("frgtpic,`kin^fk$8cafVhc", (short) (C1633zX.Xd() ^ (-26965)))).getMethod(Qg.kd("GDR/ANINJ:;H", (short) (C1633zX.Xd() ^ (-14358)), (short) (C1633zX.Xd() ^ (-3165))), new Class[0]);
        try {
            method.setAccessible(true);
            Configuration configuration = ((Resources) method.invoke(context, objArr)).getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
                return 5;
            }
            if (i2 > 960 && i3 > 720) {
                return 5;
            }
            if (i2 > 720 && i3 > 960) {
                return 5;
            }
            if (i2 >= 500) {
                return 4;
            }
            if (i2 > 640 && i3 > 480) {
                return 4;
            }
            if (i2 <= 480 || i3 <= 640) {
                return i2 >= 360 ? 3 : 2;
            }
            return 4;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public int getEmbeddedMenuWidthLimit() throws Throwable {
        Context context = this.mContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("\u001a\u007fM2vI\u001c<9\u001etQ\nkIY6:\u0012o'\u0012f", (short) (ZN.Xd() ^ 16055), (short) (ZN.Xd() ^ 23186))).getMethod(C1561oA.Xd("\u0013\u0012\"\u0001\u0015$!(&\u0018\u001b*", (short) (FB.Xd() ^ 32052)), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getDisplayMetrics().widthPixels / 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public boolean hasEmbeddedTabs() throws Throwable {
        Context context = this.mContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("\u001emW\u00011\u0012\u000f\u0018\u0015R\u001e\u0018\u0001`\u001dNa]\u0016RV}p", (short) (FB.Xd() ^ 20141), (short) (FB.Xd() ^ 21928))).getMethod(Ig.wd("\u001fn\u0010\rh\"\nw2BJv", (short) (Od.Xd() ^ (-20502))), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getBoolean(R.bool.abc_action_bar_embed_tabs);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public int getTabContainerHeight() throws Throwable {
        Context context = this.mContext;
        int[] iArr = R.styleable.ActionBar;
        int i2 = R.attr.actionBarStyle;
        Class<?> cls = Class.forName(C1561oA.yd("[g`mmfd-eprwks|5-XZ_Sed", (short) (C1499aX.Xd() ^ (-9443))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Yd("\u0001\u000f\u0006\u0015\u0013\u000e\nT\u001d\u001d\u0013\u0017Ym\"#\"\u001a\u0014((\u001a\t\u001c,", (short) (Od.Xd() ^ (-16160)))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {null, iArr, Integer.valueOf(i2), 0};
        short sXd = (short) (ZN.Xd() ^ 17241);
        short sXd2 = (short) (ZN.Xd() ^ 13247);
        int[] iArr2 = new int[", 3!*0\u00168>2,,\n>?>60DD6E".length()];
        QB qb = new QB(", 3!*0\u00168>2,,\n>?>60DD6E");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int layoutDimension = typedArray.getLayoutDimension(R.styleable.ActionBar_height, 0);
            Context context2 = this.mContext;
            short sXd3 = (short) (C1607wl.Xd() ^ 1974);
            short sXd4 = (short) (C1607wl.Xd() ^ 16932);
            int[] iArr3 = new int["v\rfO0%\u0004(AhJ,\u007f\u0005m\u0003z\u0003eF\u001b)\t".length()];
            QB qb2 = new QB("v\rfO0%\u0004(AhJ,\u007f\u0005m\u0003z\u0003eF\u001b)\t");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr3[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd4) ^ sXd3));
                i4++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr3, 0, i4)).getMethod(ZO.xd("_~:#f@\u00066\u0004%{Y", (short) (OY.Xd() ^ 8524), (short) (OY.Xd() ^ 18823)), new Class[0]);
            try {
                method2.setAccessible(true);
                Resources resources = (Resources) method2.invoke(context2, objArr2);
                if (!hasEmbeddedTabs()) {
                    layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
                }
                typedArray.recycle();
                return layoutDimension;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public boolean enableHomeButtonByDefault() throws Throwable {
        Object obj;
        Context context = this.mContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[o\u001b\u0019\u001e\u000e \u001b", (short) (C1580rY.Xd() ^ (-4674)))).getMethod(C1593ug.zd("\u000f\u000e\u001ek\u001c\u001d\u001a\u0018\u0013\u0012&\u001c##~%\u001e(", (short) (FB.Xd() ^ 10238), (short) (FB.Xd() ^ 23534)), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strOd = C1561oA.od("(4)62+%m\"-+0 (-e'#bt#\"\u001d\u0019\u0012\u000f!\u0015\u001a\u0018q\u0016\r\u0015", (short) (ZN.Xd() ^ 1175));
            String strKd = C1561oA.Kd("N<NDCS3EM9IWYPWW", (short) (C1633zX.Xd() ^ (-28142)));
            try {
                Class<?> cls = Class.forName(strOd);
                Field field = 1 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            return ((Integer) obj).intValue() < 14;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public int getStackedTabMaxWidth() throws Throwable {
        Context context = this.mContext;
        Class<?> cls = Class.forName(hg.Vd("7C8EA:4|1<:?/7<t\t427'94", (short) (C1633zX.Xd() ^ (-23995)), (short) (C1633zX.Xd() ^ (-24597))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-21179));
        int[] iArr = new int["52@\u001d/<7<8()6".length()];
        QB qb = new QB("52@\u001d/<7<8()6");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
