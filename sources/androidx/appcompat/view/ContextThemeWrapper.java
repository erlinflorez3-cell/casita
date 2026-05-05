package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.appcompat.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public class ContextThemeWrapper extends ContextWrapper {
    private static Configuration sEmptyConfig = null;
    private LayoutInflater mInflater;
    private Configuration mOverrideConfiguration;
    private Resources mResources;
    private Resources.Theme mTheme;
    private int mThemeResource;

    public ContextThemeWrapper() {
        super(null);
    }

    public ContextThemeWrapper(Context context, int i2) {
        super(context);
        this.mThemeResource = i2;
    }

    public ContextThemeWrapper(Context context, Resources.Theme theme) {
        super(context);
        this.mTheme = theme;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public void applyOverrideConfiguration(Configuration configuration) {
        if (this.mResources != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.mOverrideConfiguration != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.mOverrideConfiguration = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return getResourcesInternal();
    }

    private Resources getResourcesInternal() throws Throwable {
        if (this.mResources == null) {
            if (this.mOverrideConfiguration == null || isEmptyConfiguration(this.mOverrideConfiguration)) {
                this.mResources = super.getResources();
            } else {
                Context contextCreateConfigurationContext = createConfigurationContext(this.mOverrideConfiguration);
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Xd("\u000e\u001c\u0013\" \u001b\u0017a\u0018%%,\u001e(/i\u007f--4&:7", (short) (OY.Xd() ^ 27786))).getMethod(Wg.vd("B?M*DQLQE56C", (short) (Od.Xd() ^ (-5135))), new Class[0]);
                try {
                    method.setAccessible(true);
                    this.mResources = (Resources) method.invoke(contextCreateConfigurationContext, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        return this.mResources;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) throws Throwable {
        if (this.mThemeResource != i2) {
            this.mThemeResource = i2;
            initializeTheme();
        }
    }

    public int getThemeResId() {
        return this.mThemeResource;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() throws Throwable {
        Resources.Theme theme = this.mTheme;
        if (theme != null) {
            return theme;
        }
        if (this.mThemeResource == 0) {
            this.mThemeResource = R.style.Theme_AppCompat_Light;
        }
        initializeTheme();
        return this.mTheme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) throws Throwable {
        if (C1561oA.ud(", 7,1/\u0019\"&\u001d\"\u0016(\u0018$", (short) (C1633zX.Xd() ^ (-8450))).equals(str)) {
            if (this.mInflater == null) {
                this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.mInflater;
        }
        Context baseContext = getBaseContext();
        Class<?> cls = Class.forName(C1561oA.yd("jxkztog2t\u0002}\u0005r|\u007f:<ielZng", (short) (FB.Xd() ^ 17925)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1580rY.Xd() ^ (-27728));
        int[] iArr = new int["5-C/|<2@:\u0002(JIAGA".length()];
        QB qb = new QB("5-C/|<2@:\u0002(JIAGA");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {str};
        Method method = cls.getMethod(Xg.qd("\u0012\u0011!\u0001(#%\u0017 \u0007\u001a(-!\u001c\u001f", (short) (C1499aX.Xd() ^ (-11645)), (short) (C1499aX.Xd() ^ (-18964))), clsArr);
        try {
            method.setAccessible(true);
            return method.invoke(baseContext, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected void onApplyThemeResource(Resources.Theme theme, int i2, boolean z2) {
        theme.applyStyle(i2, true);
    }

    private void initializeTheme() throws Throwable {
        boolean z2 = this.mTheme == null;
        if (z2) {
            this.mTheme = getResources().newTheme();
            Context baseContext = getBaseContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("Q]R_[TN\u0017KVTYIQV\u000f#NLQASN", (short) (FB.Xd() ^ 18303), (short) (FB.Xd() ^ 5287))).getMethod(hg.Vd(";8F%84;2", (short) (C1607wl.Xd() ^ 24297), (short) (C1607wl.Xd() ^ 870)), new Class[0]);
            try {
                method.setAccessible(true);
                Resources.Theme theme = (Resources.Theme) method.invoke(baseContext, objArr);
                if (theme != null) {
                    this.mTheme.setTo(theme);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        onApplyThemeResource(this.mTheme, this.mThemeResource, z2);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    private static boolean isEmptyConfiguration(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (sEmptyConfig == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            sEmptyConfig = configuration2;
        }
        return configuration.equals(sEmptyConfig);
    }
}
