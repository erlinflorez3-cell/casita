package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.StandaloneActionMode;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.ViewUtils;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.PopupWindowCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.drew.metadata.bmp.BmpReader;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.Callback, LayoutInflater.Factory2 {
    static final String EXCEPTION_HANDLER_MESSAGE_SUFFIX = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    private static boolean sInstalledExceptionHandler = false;
    ActionBar mActionBar;
    private ActionMenuPresenterCallback mActionMenuPresenterCallback;
    ActionMode mActionMode;
    PopupWindow mActionModePopup;
    ActionBarContextView mActionModeView;
    private int mActivityHandlesConfigFlags;
    private boolean mActivityHandlesConfigFlagsChecked;
    final AppCompatCallback mAppCompatCallback;
    private AppCompatViewInflater mAppCompatViewInflater;
    private AppCompatWindowCallback mAppCompatWindowCallback;
    private AutoNightModeManager mAutoBatteryNightModeManager;
    private AutoNightModeManager mAutoTimeNightModeManager;
    private OnBackInvokedCallback mBackCallback;
    private boolean mBaseContextAttached;
    private boolean mClosingActionMenu;
    final Context mContext;
    private boolean mCreated;
    private DecorContentParent mDecorContentParent;
    boolean mDestroyed;
    private OnBackInvokedDispatcher mDispatcher;
    private Configuration mEffectiveConfiguration;
    private boolean mEnableDefaultActionBarUp;
    ViewPropertyAnimatorCompat mFadeAnim;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private boolean mHandleNativeActionModes;
    boolean mHasActionBar;
    final Object mHost;
    int mInvalidatePanelMenuFeatures;
    boolean mInvalidatePanelMenuPosted;
    private final Runnable mInvalidatePanelMenuRunnable;
    boolean mIsFloating;
    private LayoutIncludeDetector mLayoutIncludeDetector;
    private int mLocalNightMode;
    private boolean mLongPressBackDown;
    MenuInflater mMenuInflater;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private PanelFeatureState[] mPanels;
    private PanelFeatureState mPreparedPanel;
    Runnable mShowActionModePopup;
    private View mStatusGuard;
    ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private int mThemeResId;
    private CharSequence mTitle;
    private TextView mTitleView;
    Window mWindow;
    boolean mWindowNoTitle;
    private static final SimpleArrayMap<String, Integer> sLocalNightModes = new SimpleArrayMap<>();
    private static final boolean IS_PRE_LOLLIPOP = false;
    private static final int[] sWindowBackgroundStyleable = {R.attr.windowBackground};
    private static final boolean sCanReturnDifferentContext = !"robolectric".equals(Build.FINGERPRINT);

    interface ActionBarMenuCallback {
        View onCreatePanelView(int i2);

        boolean onPreparePanel(int i2);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onSaveInstanceState(Bundle bundle) {
    }

    void onSubDecorInstalled(ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$1, reason: invalid class name */
    class AnonymousClass1 implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Thread.UncaughtExceptionHandler val$defHandler;

        AnonymousClass1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.val$defHandler = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (shouldWrapException(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + AppCompatDelegateImpl.EXCEPTION_HANDLER_MESSAGE_SUFFIX);
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.val$defHandler.uncaughtException(thread, notFoundException);
                return;
            }
            this.val$defHandler.uncaughtException(thread, th);
        }

        private boolean shouldWrapException(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }
    }

    AppCompatDelegateImpl(Activity activity, AppCompatCallback appCompatCallback) {
        this(activity, null, appCompatCallback, activity);
    }

    AppCompatDelegateImpl(Dialog dialog, AppCompatCallback appCompatCallback) {
        this(dialog.getContext(), dialog.getWindow(), appCompatCallback, dialog);
    }

    AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback) {
        this(context, window, appCompatCallback, context);
    }

    AppCompatDelegateImpl(Context context, Activity activity, AppCompatCallback appCompatCallback) {
        this(context, null, appCompatCallback, activity);
    }

    private AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        SimpleArrayMap<String, Integer> simpleArrayMap;
        Integer num;
        AppCompatActivity appCompatActivityTryUnwrapContext;
        this.mFadeAnim = null;
        this.mHandleNativeActionModes = true;
        this.mLocalNightMode = -100;
        this.mInvalidatePanelMenuRunnable = new Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.2
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                if ((AppCompatDelegateImpl.this.mInvalidatePanelMenuFeatures & 1) != 0) {
                    AppCompatDelegateImpl.this.doInvalidatePanelMenu(0);
                }
                int i2 = AppCompatDelegateImpl.this.mInvalidatePanelMenuFeatures;
                if ((i2 + 4096) - (i2 | 4096) != 0) {
                    AppCompatDelegateImpl.this.doInvalidatePanelMenu(108);
                }
                AppCompatDelegateImpl.this.mInvalidatePanelMenuPosted = false;
                AppCompatDelegateImpl.this.mInvalidatePanelMenuFeatures = 0;
            }
        };
        this.mContext = context;
        this.mAppCompatCallback = appCompatCallback;
        this.mHost = obj;
        if (this.mLocalNightMode == -100 && (obj instanceof Dialog) && (appCompatActivityTryUnwrapContext = tryUnwrapContext()) != null) {
            this.mLocalNightMode = appCompatActivityTryUnwrapContext.getDelegate().getLocalNightMode();
        }
        if (this.mLocalNightMode == -100 && (num = (simpleArrayMap = sLocalNightModes).get(obj.getClass().getName())) != null) {
            this.mLocalNightMode = num.intValue();
            simpleArrayMap.remove(obj.getClass().getName());
        }
        if (window != null) {
            attachToWindow(window);
        }
        AppCompatDrawableManager.preload();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.setOnBackInvokedDispatcher(r3)
            android.window.OnBackInvokedDispatcher r1 = r2.mDispatcher
            if (r1 == 0) goto L11
            android.window.OnBackInvokedCallback r0 = r2.mBackCallback
            if (r0 == 0) goto L11
            androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.unregisterOnBackInvokedCallback(r1, r0)
            r0 = 0
            r2.mBackCallback = r0
        L11:
            if (r3 != 0) goto L2f
            java.lang.Object r1 = r2.mHost
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L2f
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.Window r0 = r1.getWindow()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.mHost
            android.app.Activity r0 = (android.app.Activity) r0
            android.window.OnBackInvokedDispatcher r0 = androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.getOnBackInvokedDispatcher(r0)
            r2.mDispatcher = r0
        L2b:
            r2.updateBackInvokedCallbackState()
            return
        L2f:
            r2.mDispatcher = r3
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher):void");
    }

    void updateBackInvokedCallbackState() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zShouldRegisterBackInvokedCallback = shouldRegisterBackInvokedCallback();
            if (!zShouldRegisterBackInvokedCallback || this.mBackCallback != null) {
                if (!zShouldRegisterBackInvokedCallback && (onBackInvokedCallback = this.mBackCallback) != null) {
                    Api33Impl.unregisterOnBackInvokedCallback(this.mDispatcher, onBackInvokedCallback);
                    this.mBackCallback = null;
                    return;
                }
                return;
            }
            this.mBackCallback = Api33Impl.registerOnBackPressedCallback(this.mDispatcher, this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public Context attachBaseContext2(Context context) throws Throwable {
        Object[] objArr;
        Method method;
        this.mBaseContextAttached = true;
        int iMapNightMode = mapNightMode(context, calculateNightMode());
        if (isAutoStorageOptedIn(context)) {
            syncRequestedAndStoredLocales(context);
        }
        LocaleListCompat localeListCompatCalculateApplicationLocales = calculateApplicationLocales(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(createOverrideAppConfiguration(context, iMapNightMode, localeListCompatCalculateApplicationLocales, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.ContextThemeWrapper) {
            try {
                ((androidx.appcompat.view.ContextThemeWrapper) context).applyOverrideConfiguration(createOverrideAppConfiguration(context, iMapNightMode, localeListCompatCalculateApplicationLocales, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!sCanReturnDifferentContext) {
            return super.attachBaseContext2(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Object[] objArr2 = {configuration};
        Method method2 = Class.forName(Ig.wd("&\u000e\u00107j\bp(~<;e\b\u0005\u001d]Jb'\u0017I\"F", (short) (ZN.Xd() ^ 32689))).getMethod(C1561oA.Qd("\u0017%\u0017\u0012$\u0014p\u001c\u001a\u0011\u0013\u0010\u001d\u0019\u0007\u0019\r\u0012\u0010c\u000f\r\u0012\u0002\u0014\u000f", (short) (C1607wl.Xd() ^ 7689)), Class.forName(EO.Od("|_Y\u0005\u001d<\u0019L5b:$c`t\u0017 \u0003[[3.\u0011\u0007LTGpG/\u0006rC", (short) (ZN.Xd() ^ 13675))));
        try {
            method2.setAccessible(true);
            Context context2 = (Context) method2.invoke(context, objArr2);
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(C1593ug.zd("\u001b) /-($n%229+5<v\r::A3GD", (short) (C1633zX.Xd() ^ (-21651)), (short) (C1633zX.Xd() ^ (-3180)))).getMethod(C1561oA.od("41?\u001c.;6;7'(5", (short) (C1580rY.Xd() ^ (-8434))), new Class[0]);
            try {
                method3.setAccessible(true);
                Configuration configuration2 = ((Resources) method3.invoke(context2, objArr3)).getConfiguration();
                Object[] objArr4 = new Object[0];
                Method method4 = Class.forName(C1561oA.Kd("<JAPNIE\u0010FSSZLV]\u0018.[[bThe", (short) (C1499aX.Xd() ^ (-1143)))).getMethod(Wg.Zd("\u0014@(vk[ \u0004eC#\u001f", (short) (C1607wl.Xd() ^ 1279), (short) (C1607wl.Xd() ^ 10935)), new Class[0]);
                try {
                    method4.setAccessible(true);
                    Configuration configuration3 = ((Resources) method4.invoke(context, objArr4)).getConfiguration();
                    configuration2.uiMode = configuration3.uiMode;
                    Configuration configurationCreateOverrideAppConfiguration = createOverrideAppConfiguration(context, iMapNightMode, localeListCompatCalculateApplicationLocales, !configuration2.equals(configuration3) ? generateConfigDelta(configuration2, configuration3) : null, true);
                    androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(context, androidx.appcompat.R.style.Theme_AppCompat_Empty);
                    contextThemeWrapper.applyOverrideConfiguration(configurationCreateOverrideAppConfiguration);
                    try {
                        objArr = new Object[0];
                        method = Class.forName(C1561oA.Xd("\u001d+\"1/*&p'44;-7>x\u000f<<C5IF", (short) (C1633zX.Xd() ^ (-8731)))).getMethod(Wg.vd("qp|]nlqj", (short) (C1499aX.Xd() ^ (-2699))), new Class[0]);
                    } catch (NullPointerException unused3) {
                    }
                    try {
                        method.setAccessible(true);
                        if (((Resources.Theme) method.invoke(context, objArr)) != null) {
                            ResourcesCompat.ThemeCompat.rebase(contextThemeWrapper.getTheme());
                        }
                        return super.attachBaseContext2(contextThemeWrapper);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onCreate(Bundle bundle) throws Throwable {
        String parentActivityName;
        this.mBaseContextAttached = true;
        applyApplicationSpecificConfig(false);
        ensureWindow();
        Object obj = this.mHost;
        if (obj instanceof Activity) {
            try {
                parentActivityName = NavUtils.getParentActivityName((Activity) obj);
            } catch (IllegalArgumentException unused) {
                parentActivityName = null;
            }
            if (parentActivityName != null) {
                ActionBar actionBarPeekSupportActionBar = peekSupportActionBar();
                if (actionBarPeekSupportActionBar == null) {
                    this.mEnableDefaultActionBarUp = true;
                } else {
                    actionBarPeekSupportActionBar.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            addActiveDelegate(this);
        }
        Context context = this.mContext;
        short sXd = (short) (OY.Xd() ^ 14977);
        short sXd2 = (short) (OY.Xd() ^ 733);
        int[] iArr = new int["0<4CbLZ4mx\u0014(\f7\u007fy!\u001eOe3t\u0005".length()];
        QB qb = new QB("0<4CbLZ4mx\u0014(\f7\u007fy!\u001eOe3t\u0005");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("x\u001a}GkZ;-\"\u0019hd", (short) (Od.Xd() ^ (-27689)), (short) (Od.Xd() ^ (-10733))), new Class[0]);
        try {
            method.setAccessible(true);
            this.mEffectiveConfiguration = new Configuration(((Resources) method.invoke(context, objArr)).getConfiguration());
            this.mCreated = true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostCreate(Bundle bundle) throws Throwable {
        ensureSubDecor();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionBar getSupportActionBar() throws Throwable {
        initWindowDecorActionBar();
        return this.mActionBar;
    }

    final ActionBar peekSupportActionBar() {
        return this.mActionBar;
    }

    final Window.Callback getWindowCallback() {
        return this.mWindow.getCallback();
    }

    private void initWindowDecorActionBar() throws Throwable {
        ensureSubDecor();
        if (this.mHasActionBar && this.mActionBar == null) {
            Object obj = this.mHost;
            if (obj instanceof Activity) {
                this.mActionBar = new WindowDecorActionBar((Activity) this.mHost, this.mOverlayActionBar);
            } else if (obj instanceof Dialog) {
                this.mActionBar = new WindowDecorActionBar((Dialog) this.mHost);
            }
            ActionBar actionBar = this.mActionBar;
            if (actionBar != null) {
                actionBar.setDefaultDisplayHomeAsUpEnabled(this.mEnableDefaultActionBarUp);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setSupportActionBar(Toolbar toolbar) throws Throwable {
        if (this.mHost instanceof Activity) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar instanceof WindowDecorActionBar) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.mMenuInflater = null;
            if (supportActionBar != null) {
                supportActionBar.onDestroy();
            }
            this.mActionBar = null;
            if (toolbar != null) {
                ToolbarActionBar toolbarActionBar = new ToolbarActionBar(toolbar, getTitle(), this.mAppCompatWindowCallback);
                this.mActionBar = toolbarActionBar;
                this.mAppCompatWindowCallback.setActionBarCallback(toolbarActionBar.mMenuCallback);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.mAppCompatWindowCallback.setActionBarCallback(null);
            }
            invalidateOptionsMenu();
        }
    }

    final Context getActionBarThemedContext() throws Throwable {
        ActionBar supportActionBar = getSupportActionBar();
        Context themedContext = supportActionBar != null ? supportActionBar.getThemedContext() : null;
        return themedContext == null ? this.mContext : themedContext;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public MenuInflater getMenuInflater() throws Throwable {
        if (this.mMenuInflater == null) {
            initWindowDecorActionBar();
            ActionBar actionBar = this.mActionBar;
            this.mMenuInflater = new SupportMenuInflater(actionBar != null ? actionBar.getThemedContext() : this.mContext);
        }
        return this.mMenuInflater;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public <T extends View> T findViewById(int i2) throws Throwable {
        ensureSubDecor();
        return (T) this.mWindow.findViewById(i2);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onConfigurationChanged(Configuration configuration) throws Throwable {
        ActionBar supportActionBar;
        if (this.mHasActionBar && this.mSubDecorInstalled && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.onConfigurationChanged(configuration);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.mContext);
        Context context = this.mContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("?MDSQLH\u0013IVV]OY`\u001b1^^eWkh", (short) (Od.Xd() ^ (-31814)))).getMethod(Xg.qd("\u0014\u0013#\u0002\u0016%\")'\u0019\u001c+", (short) (Od.Xd() ^ (-9304)), (short) (Od.Xd() ^ (-3971))), new Class[0]);
        try {
            method.setAccessible(true);
            this.mEffectiveConfiguration = new Configuration(((Resources) method.invoke(context, objArr)).getConfiguration());
            applyApplicationSpecificConfig(false, false);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStart() throws Throwable {
        applyApplicationSpecificConfig(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStop() throws Throwable {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostResume() throws Throwable {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(View view) throws Throwable {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(int i2) throws Throwable {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.mContext).inflate(i2, viewGroup);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) throws Throwable {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws Throwable {
        ensureSubDecor();
        ((ViewGroup) this.mSubDecor.findViewById(R.id.content)).addView(view, layoutParams);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroy() throws java.lang.Throwable {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mHost
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            removeActivityDelegate(r3)
        L9:
            boolean r0 = r3.mInvalidatePanelMenuPosted
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.mWindow
            android.view.View r1 = r0.getDecorView()
            java.lang.Runnable r0 = r3.mInvalidatePanelMenuRunnable
            r1.removeCallbacks(r0)
        L18:
            r0 = 1
            r3.mDestroyed = r0
            int r1 = r3.mLocalNightMode
            r0 = -100
            if (r1 == r0) goto L4f
            java.lang.Object r1 = r3.mHost
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L4f
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isChangingConfigurations()
            if (r0 == 0) goto L4f
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r2 = androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Object r0 = r3.mHost
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getName()
            int r0 = r3.mLocalNightMode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r0)
        L44:
            androidx.appcompat.app.ActionBar r0 = r3.mActionBar
            if (r0 == 0) goto L4b
            r0.onDestroy()
        L4b:
            r3.cleanupAutoManagers()
            return
        L4f:
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r1 = androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Object r0 = r3.mHost
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.onDestroy():void");
    }

    private void cleanupAutoManagers() throws Throwable {
        AutoNightModeManager autoNightModeManager = this.mAutoTimeNightModeManager;
        if (autoNightModeManager != null) {
            autoNightModeManager.cleanup();
        }
        AutoNightModeManager autoNightModeManager2 = this.mAutoBatteryNightModeManager;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.cleanup();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setTheme(int i2) {
        this.mThemeResId = i2;
    }

    private void ensureWindow() {
        if (this.mWindow == null) {
            Object obj = this.mHost;
            if (obj instanceof Activity) {
                attachToWindow(((Activity) obj).getWindow());
            }
        }
        if (this.mWindow == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private void attachToWindow(Window window) {
        if (this.mWindow != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof AppCompatWindowCallback) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        AppCompatWindowCallback appCompatWindowCallback = new AppCompatWindowCallback(callback);
        this.mAppCompatWindowCallback = appCompatWindowCallback;
        window.setCallback(appCompatWindowCallback);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mContext, (AttributeSet) null, sWindowBackgroundStyleable);
        Drawable drawableIfKnown = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            window.setBackgroundDrawable(drawableIfKnown);
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        this.mWindow = window;
        if (Build.VERSION.SDK_INT < 33 || this.mDispatcher != null) {
            return;
        }
        setOnBackInvokedDispatcher(null);
    }

    private void ensureSubDecor() throws Throwable {
        if (this.mSubDecorInstalled) {
            return;
        }
        this.mSubDecor = createSubDecor();
        CharSequence title = getTitle();
        if (!TextUtils.isEmpty(title)) {
            DecorContentParent decorContentParent = this.mDecorContentParent;
            if (decorContentParent != null) {
                decorContentParent.setWindowTitle(title);
            } else if (peekSupportActionBar() != null) {
                peekSupportActionBar().setWindowTitle(title);
            } else {
                TextView textView = this.mTitleView;
                if (textView != null) {
                    textView.setText(title);
                }
            }
        }
        applyFixedSizeWindow();
        onSubDecorInstalled(this.mSubDecor);
        this.mSubDecorInstalled = true;
        PanelFeatureState panelState = getPanelState(0, false);
        if (this.mDestroyed) {
            return;
        }
        if (panelState == null || panelState.menu == null) {
            invalidatePanelMenu(108);
        }
    }

    private ViewGroup createSubDecor() throws Throwable {
        ViewGroup viewGroup;
        Context contextThemeWrapper;
        Context context = this.mContext;
        int[] iArr = androidx.appcompat.R.styleable.AppCompatTheme;
        short sXd = (short) (C1607wl.Xd() ^ 19138);
        int[] iArr2 = new int["JVKXTMG\u0010DOMRBJO\b\u001cGEJ:LG".length()];
        QB qb = new QB("JVKXTMG\u0010DOMRBJO\b\u001cGEJ:LG");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {iArr};
        Method method = Class.forName(new String(iArr2, 0, i2)).getMethod(C1561oA.Kd("\u0018\f\u001f\r\u0016\u001c\u0002$*\u001e\u0018\u0018u*+*\"\u001c00\"1", (short) (C1580rY.Xd() ^ (-14033))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            if (!typedArray.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar)) {
                typedArray.recycle();
                throw new IllegalStateException(Xg.qd("\u0003\u001a!L\u001c\u0014\u0015\u0015Q'#T+*\u001dX\u001bZ\u0010%#,%n\u000334\b548*>j@53<5pyBFt:<K<?I@>LS\t\u0001YLXM\u0006[PR]\u000bMPbXfZfl\"", (short) (Od.Xd() ^ (-28930)), (short) (Od.Xd() ^ (-4459))));
            }
            if (typedArray.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowNoTitle, false)) {
                requestWindowFeature(1);
            } else if (typedArray.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar, false)) {
                requestWindowFeature(108);
            }
            if (typedArray.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                requestWindowFeature(109);
            }
            if (typedArray.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                requestWindowFeature(10);
            }
            this.mIsFloating = typedArray.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating, false);
            typedArray.recycle();
            ensureWindow();
            this.mWindow.getDecorView();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.mContext);
            if (!this.mWindowNoTitle) {
                if (this.mIsFloating) {
                    viewGroup = (ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.mOverlayActionBar = false;
                    this.mHasActionBar = false;
                } else if (this.mHasActionBar) {
                    TypedValue typedValue = new TypedValue();
                    Context context2 = this.mContext;
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Wg.Zd("T\u0001\u0018=[~\u0019\u0004R}\u0006+=_\u0005g\u001ei\u0002'!Up", (short) (Od.Xd() ^ (-28201)), (short) (Od.Xd() ^ (-9083)))).getMethod(C1561oA.Xd("\u001e\u001d-\u000e#!*#", (short) (FB.Xd() ^ 3649)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        ((Resources.Theme) method2.invoke(context2, objArr2)).resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(this.mContext, typedValue.resourceId);
                        } else {
                            contextThemeWrapper = this.mContext;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(androidx.appcompat.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(androidx.appcompat.R.id.decor_content_parent);
                        this.mDecorContentParent = decorContentParent;
                        decorContentParent.setWindowCallback(getWindowCallback());
                        if (this.mOverlayActionBar) {
                            this.mDecorContentParent.initFeature(109);
                        }
                        if (this.mFeatureProgress) {
                            this.mDecorContentParent.initFeature(2);
                        }
                        if (this.mFeatureIndeterminateProgress) {
                            this.mDecorContentParent.initFeature(5);
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.mOverlayActionMode ? (ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.abc_screen_simple, (ViewGroup) null);
            }
            if (viewGroup == null) {
                StringBuilder sbAppend = new StringBuilder(Wg.vd("5ef:gfj\\p\u001dbnet\"qsy&z}yzz~\u0002.\u0004xv2v\n\b\t|\u0007\u000e:\u0010\u0005\u0003\f\u0005@\b\b\u0005\u0019\u001b\u0019\r\u001ccJ'L%\u0018\u001e\u0015!*t\u0018* ''{\u001c.v]", (short) (FB.Xd() ^ 10956))).append(this.mHasActionBar).append(Qg.kd("\u001d\u0010fW[PZa*K[OTR%CS/UCOH<S\u0013w", (short) (C1580rY.Xd() ^ (-3654)), (short) (C1580rY.Xd() ^ (-7410)))).append(this.mOverlayActionBar).append(hg.Vd("ZM\u000e\u001a\u000f\u001c\u0018\u0011\u000b_\u001c\r\u0011\u0006\u0010\u0017g\u0011b\b\nz\r\u0001\u0005|N3", (short) (C1633zX.Xd() ^ (-18936)), (short) (C1633zX.Xd() ^ (-28862)))).append(this.mIsFloating);
                short sXd2 = (short) (C1499aX.Xd() ^ (-17802));
                int[] iArr3 = new int["L?\u0016\u0007\u000b\u007f\n\u0011Yz\u000b~\u0004\u0002_\u0001tt]\u0004q}vj\u0002A&".length()];
                QB qb2 = new QB("L?\u0016\u0007\u000b\u007f\n\u0011Yz\u000b~\u0004\u0002_\u0001tt]\u0004q}vj\u0002A&");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr3[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                throw new IllegalArgumentException(sbAppend.append(new String(iArr3, 0, i3)).append(this.mOverlayActionMode).append(C1561oA.yd("\u0016\u000bcV\\S_h@bH^jc]3y", (short) (C1633zX.Xd() ^ (-2085)))).append(this.mWindowNoTitle).append(C1561oA.Yd("S2", (short) (OY.Xd() ^ 19821))).toString());
            }
            ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.3
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
                    int iUpdateStatusGuard = AppCompatDelegateImpl.this.updateStatusGuard(windowInsetsCompat, null);
                    if (systemWindowInsetTop != iUpdateStatusGuard) {
                        windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), iUpdateStatusGuard, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                    }
                    return ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                }
            });
            if (this.mDecorContentParent == null) {
                this.mTitleView = (TextView) viewGroup.findViewById(androidx.appcompat.R.id.title);
            }
            ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(androidx.appcompat.R.id.action_bar_activity_content);
            ViewGroup viewGroup2 = (ViewGroup) this.mWindow.findViewById(R.id.content);
            if (viewGroup2 != null) {
                while (viewGroup2.getChildCount() > 0) {
                    View childAt = viewGroup2.getChildAt(0);
                    viewGroup2.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                }
                viewGroup2.setId(-1);
                contentFrameLayout.setId(R.id.content);
                if (viewGroup2 instanceof FrameLayout) {
                    ((FrameLayout) viewGroup2).setForeground(null);
                }
            }
            this.mWindow.setContentView(viewGroup);
            contentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.5
                @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
                public void onAttachedFromWindow() {
                }

                @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
                public void onDetachedFromWindow() {
                    AppCompatDelegateImpl.this.dismissPopups();
                }
            });
            return viewGroup;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$4, reason: invalid class name */
    class AnonymousClass4 implements FitWindowsViewGroup.OnFitSystemWindowsListener {
        AnonymousClass4() {
        }

        @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
        public void onFitSystemWindows(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.updateStatusGuard(null, rect);
        }
    }

    private void applyFixedSizeWindow() throws Throwable {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.mSubDecor.findViewById(R.id.content);
        View decorView = this.mWindow.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        Context context = this.mContext;
        int[] iArr = androidx.appcompat.R.styleable.AppCompatTheme;
        Class<?> cls = Class.forName(ZO.xd("scV-:3LGq\u0004\n\u001f>q4Q!\u001f+eSrH", (short) (C1580rY.Xd() ^ (-27711)), (short) (C1580rY.Xd() ^ (-6787))));
        Class<?>[] clsArr = {int[].class};
        Object[] objArr = {iArr};
        short sXd = (short) (C1499aX.Xd() ^ (-29786));
        short sXd2 = (short) (C1499aX.Xd() ^ (-22824));
        int[] iArr2 = new int["\u000ex\u0015fE&zjK\fs%y%R/C\u0004<&\u0003-".length()];
        QB qb = new QB("\u000ex\u0015fE&zjK\fs%y%R/C\u0004<&\u0003-");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            typedArray.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
            typedArray.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
            if (typedArray.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
                typedArray.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
            }
            if (typedArray.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
                typedArray.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
            }
            if (typedArray.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
                typedArray.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
            }
            if (typedArray.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
                typedArray.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
            }
            typedArray.recycle();
            contentFrameLayout.requestLayout();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean requestWindowFeature(int i2) {
        int iSanitizeWindowFeatureId = sanitizeWindowFeatureId(i2);
        if (this.mWindowNoTitle && iSanitizeWindowFeatureId == 108) {
            return false;
        }
        if (this.mHasActionBar && iSanitizeWindowFeatureId == 1) {
            this.mHasActionBar = false;
        }
        if (iSanitizeWindowFeatureId == 1) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mWindowNoTitle = true;
            return true;
        }
        if (iSanitizeWindowFeatureId == 2) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mFeatureProgress = true;
            return true;
        }
        if (iSanitizeWindowFeatureId == 5) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mFeatureIndeterminateProgress = true;
            return true;
        }
        if (iSanitizeWindowFeatureId == 10) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mOverlayActionMode = true;
            return true;
        }
        if (iSanitizeWindowFeatureId == 108) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mHasActionBar = true;
            return true;
        }
        if (iSanitizeWindowFeatureId == 109) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mOverlayActionBar = true;
            return true;
        }
        return this.mWindow.requestFeature(iSanitizeWindowFeatureId);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean hasWindowFeature(int i2) {
        boolean z2;
        int iSanitizeWindowFeatureId = sanitizeWindowFeatureId(i2);
        if (iSanitizeWindowFeatureId == 1) {
            z2 = this.mWindowNoTitle;
        } else if (iSanitizeWindowFeatureId == 2) {
            z2 = this.mFeatureProgress;
        } else if (iSanitizeWindowFeatureId == 5) {
            z2 = this.mFeatureIndeterminateProgress;
        } else if (iSanitizeWindowFeatureId == 10) {
            z2 = this.mOverlayActionMode;
        } else if (iSanitizeWindowFeatureId == 108) {
            z2 = this.mHasActionBar;
        } else {
            z2 = iSanitizeWindowFeatureId != 109 ? false : this.mOverlayActionBar;
        }
        return z2 || this.mWindow.hasFeature(i2);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        if (peekSupportActionBar() != null) {
            peekSupportActionBar().setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    final CharSequence getTitle() {
        Object obj = this.mHost;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.mTitle;
    }

    void onPanelClosed(int i2) throws Throwable {
        if (i2 == 108) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            PanelFeatureState panelState = getPanelState(i2, true);
            if (panelState.isOpen) {
                closePanel(panelState, false);
            }
        }
    }

    void onMenuOpened(int i2) {
        ActionBar supportActionBar;
        if (i2 != 108 || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.dispatchMenuVisibilityChanged(true);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState panelFeatureStateFindMenuPanel;
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback == null || this.mDestroyed || (panelFeatureStateFindMenuPanel = findMenuPanel(menuBuilder.getRootMenu())) == null) {
            return false;
        }
        return windowCallback.onMenuItemSelected(panelFeatureStateFindMenuPanel.featureId, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(MenuBuilder menuBuilder) throws Throwable {
        reopenMenu(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionMode startSupportActionMode(ActionMode.Callback callback) throws Throwable {
        AppCompatCallback appCompatCallback;
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        ActionMode actionMode = this.mActionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = new ActionModeCallbackWrapperV9(callback);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            ActionMode actionModeStartActionMode = supportActionBar.startActionMode(actionModeCallbackWrapperV9);
            this.mActionMode = actionModeStartActionMode;
            if (actionModeStartActionMode != null && (appCompatCallback = this.mAppCompatCallback) != null) {
                appCompatCallback.onSupportActionModeStarted(actionModeStartActionMode);
            }
        }
        if (this.mActionMode == null) {
            this.mActionMode = startSupportActionModeFromWindow(actionModeCallbackWrapperV9);
        }
        updateBackInvokedCallbackState();
        return this.mActionMode;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void invalidateOptionsMenu() {
        if (peekSupportActionBar() == null || getSupportActionBar().invalidateOptionsMenu()) {
            return;
        }
        invalidatePanelMenu(0);
    }

    ActionMode startSupportActionModeFromWindow(ActionMode.Callback callback) throws Throwable {
        ActionMode actionModeOnWindowStartingSupportActionMode;
        Context contextThemeWrapper;
        AppCompatCallback appCompatCallback;
        endOnGoingFadeAnimation();
        ActionMode actionMode = this.mActionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        if (!(callback instanceof ActionModeCallbackWrapperV9)) {
            callback = new ActionModeCallbackWrapperV9(callback);
        }
        AppCompatCallback appCompatCallback2 = this.mAppCompatCallback;
        if (appCompatCallback2 == null || this.mDestroyed) {
            actionModeOnWindowStartingSupportActionMode = null;
        } else {
            try {
                actionModeOnWindowStartingSupportActionMode = appCompatCallback2.onWindowStartingSupportActionMode(callback);
            } catch (AbstractMethodError unused) {
                actionModeOnWindowStartingSupportActionMode = null;
            }
        }
        if (actionModeOnWindowStartingSupportActionMode != null) {
            this.mActionMode = actionModeOnWindowStartingSupportActionMode;
        } else {
            if (this.mActionModeView == null) {
                if (this.mIsFloating) {
                    TypedValue typedValue = new TypedValue();
                    Context context = this.mContext;
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(C1626yg.Ud("\u0015UB+g(K\u001a\u001flrQ\u0012\u0015\u001f4\u0013m]+X\u0014-", (short) (OY.Xd() ^ 13888), (short) (OY.Xd() ^ 22487))).getMethod(Ig.wd("0\u0001[\u001e_~-c", (short) (OY.Xd() ^ 7114)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        Resources.Theme theme = (Resources.Theme) method.invoke(context, objArr);
                        theme.resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Context context2 = this.mContext;
                            Object[] objArr2 = new Object[0];
                            Method method2 = Class.forName(EO.Od("\u000er8 \bW0KHqt\u0017Sd<\u0011\u0004(pP\u0019aq", (short) (Od.Xd() ^ (-1701)))).getMethod(C1561oA.Qd("/,:\u0017)6162\"#0", (short) (FB.Xd() ^ 8620)), new Class[0]);
                            try {
                                method2.setAccessible(true);
                                Resources.Theme themeNewTheme = ((Resources) method2.invoke(context2, objArr2)).newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(this.mContext, 0);
                                Object[] objArr3 = new Object[0];
                                Method method3 = Class.forName(C1593ug.zd("\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h~,,3%96", (short) (C1633zX.Xd() ^ (-28285)), (short) (C1633zX.Xd() ^ (-25977)))).getMethod(C1561oA.od("\u000f\f\u001ax\f\b\u000f\u0006", (short) (C1633zX.Xd() ^ (-7072))), new Class[0]);
                                try {
                                    method3.setAccessible(true);
                                    ((Resources.Theme) method3.invoke(contextThemeWrapper, objArr3)).setTo(themeNewTheme);
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        } else {
                            contextThemeWrapper = this.mContext;
                        }
                        this.mActionModeView = new ActionBarContextView(contextThemeWrapper);
                        PopupWindow popupWindow = new PopupWindow(contextThemeWrapper, (AttributeSet) null, androidx.appcompat.R.attr.actionModePopupWindowStyle);
                        this.mActionModePopup = popupWindow;
                        PopupWindowCompat.setWindowLayoutType(popupWindow, 2);
                        this.mActionModePopup.setContentView(this.mActionModeView);
                        this.mActionModePopup.setWidth(-1);
                        Object[] objArr4 = new Object[0];
                        Method method4 = Class.forName(C1561oA.Kd("^lcrpkg2huu|nx\u007f:P}}\u0005v\u000b\b", (short) (FB.Xd() ^ OlympusMakernoteDirectory.TAG_ZOOM))).getMethod(Wg.Zd("4\u0019j\r\u001a}I\u0006", (short) (ZN.Xd() ^ 22931), (short) (ZN.Xd() ^ 22745)), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            ((Resources.Theme) method4.invoke(contextThemeWrapper, objArr4)).resolveAttribute(androidx.appcompat.R.attr.actionBarSize, typedValue, true);
                            int i2 = typedValue.data;
                            short sXd = (short) (ZN.Xd() ^ 8300);
                            int[] iArr = new int[";I@OMHD\u000fERRYKU\\\u0017-ZZaSgd".length()];
                            QB qb = new QB(";I@OMHD\u000fERRYKU\\\u0017-ZZaSgd");
                            int i3 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
                                i3++;
                            }
                            Object[] objArr5 = new Object[0];
                            Method method5 = Class.forName(new String(iArr, 0, i3)).getMethod(Wg.vd("~{\nfx\u0006\u0001\u0006\u0012\u0002\u0003\u0010", (short) (C1633zX.Xd() ^ (-17437))), new Class[0]);
                            try {
                                method5.setAccessible(true);
                                this.mActionModeView.setContentHeight(TypedValue.complexToDimensionPixelSize(i2, ((Resources) method5.invoke(contextThemeWrapper, objArr5)).getDisplayMetrics()));
                                this.mActionModePopup.setHeight(-2);
                                this.mShowActionModePopup = new Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.6
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        AppCompatDelegateImpl.this.mActionModePopup.showAtLocation(AppCompatDelegateImpl.this.mActionModeView, 55, 0, 0);
                                        AppCompatDelegateImpl.this.endOnGoingFadeAnimation();
                                        if (AppCompatDelegateImpl.this.shouldAnimateActionModeView()) {
                                            AppCompatDelegateImpl.this.mActionModeView.setAlpha(0.0f);
                                            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                                            appCompatDelegateImpl.mFadeAnim = ViewCompat.animate(appCompatDelegateImpl.mActionModeView).alpha(1.0f);
                                            AppCompatDelegateImpl.this.mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.6.1
                                                @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                                public void onAnimationStart(View view) {
                                                    AppCompatDelegateImpl.this.mActionModeView.setVisibility(0);
                                                }

                                                @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                                public void onAnimationEnd(View view) {
                                                    AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                                                    AppCompatDelegateImpl.this.mFadeAnim.setListener(null);
                                                    AppCompatDelegateImpl.this.mFadeAnim = null;
                                                }
                                            });
                                            return;
                                        }
                                        AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                                        AppCompatDelegateImpl.this.mActionModeView.setVisibility(0);
                                    }
                                };
                            } catch (InvocationTargetException e4) {
                                throw e4.getCause();
                            }
                        } catch (InvocationTargetException e5) {
                            throw e5.getCause();
                        }
                    } catch (InvocationTargetException e6) {
                        throw e6.getCause();
                    }
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.mSubDecor.findViewById(androidx.appcompat.R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(getActionBarThemedContext()));
                        this.mActionModeView = (ActionBarContextView) viewStubCompat.inflate();
                    }
                }
            }
            if (this.mActionModeView != null) {
                endOnGoingFadeAnimation();
                this.mActionModeView.killMode();
                StandaloneActionMode standaloneActionMode = new StandaloneActionMode(this.mActionModeView.getContext(), this.mActionModeView, callback, this.mActionModePopup == null);
                if (callback.onCreateActionMode(standaloneActionMode, standaloneActionMode.getMenu())) {
                    standaloneActionMode.invalidate();
                    this.mActionModeView.initForMode(standaloneActionMode);
                    this.mActionMode = standaloneActionMode;
                    if (shouldAnimateActionModeView()) {
                        this.mActionModeView.setAlpha(0.0f);
                        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha = ViewCompat.animate(this.mActionModeView).alpha(1.0f);
                        this.mFadeAnim = viewPropertyAnimatorCompatAlpha;
                        viewPropertyAnimatorCompatAlpha.setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.7
                            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                            public void onAnimationStart(View view) {
                                AppCompatDelegateImpl.this.mActionModeView.setVisibility(0);
                                if (AppCompatDelegateImpl.this.mActionModeView.getParent() instanceof View) {
                                    ViewCompat.requestApplyInsets((View) AppCompatDelegateImpl.this.mActionModeView.getParent());
                                }
                            }

                            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                            public void onAnimationEnd(View view) {
                                AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                                AppCompatDelegateImpl.this.mFadeAnim.setListener(null);
                                AppCompatDelegateImpl.this.mFadeAnim = null;
                            }
                        });
                    } else {
                        this.mActionModeView.setAlpha(1.0f);
                        this.mActionModeView.setVisibility(0);
                        if (this.mActionModeView.getParent() instanceof View) {
                            ViewCompat.requestApplyInsets((View) this.mActionModeView.getParent());
                        }
                    }
                    if (this.mActionModePopup != null) {
                        this.mWindow.getDecorView().post(this.mShowActionModePopup);
                    }
                } else {
                    this.mActionMode = null;
                }
            }
        }
        ActionMode actionMode2 = this.mActionMode;
        if (actionMode2 != null && (appCompatCallback = this.mAppCompatCallback) != null) {
            appCompatCallback.onSupportActionModeStarted(actionMode2);
        }
        updateBackInvokedCallbackState();
        return this.mActionMode;
    }

    final boolean shouldAnimateActionModeView() {
        ViewGroup viewGroup;
        return this.mSubDecorInstalled && (viewGroup = this.mSubDecor) != null && viewGroup.isLaidOut();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setHandleNativeActionModesEnabled(boolean z2) {
        this.mHandleNativeActionModes = z2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean isHandleNativeActionModesEnabled() {
        return this.mHandleNativeActionModes;
    }

    void endOnGoingFadeAnimation() {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mFadeAnim;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
    }

    boolean shouldRegisterBackInvokedCallback() {
        if (this.mDispatcher == null) {
            return false;
        }
        PanelFeatureState panelState = getPanelState(0, false);
        return (panelState != null && panelState.isOpen) || this.mActionMode != null;
    }

    boolean onBackPressed() throws Throwable {
        boolean z2 = this.mLongPressBackDown;
        this.mLongPressBackDown = false;
        PanelFeatureState panelState = getPanelState(0, false);
        if (panelState != null && panelState.isOpen) {
            if (!z2) {
                closePanel(panelState, true);
            }
            return true;
        }
        ActionMode actionMode = this.mActionMode;
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        return supportActionBar != null && supportActionBar.collapseActionView();
    }

    boolean onKeyShortcut(int i2, KeyEvent keyEvent) throws Throwable {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null && supportActionBar.onKeyShortcut(i2, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.mPreparedPanel;
        if (panelFeatureState != null && performPanelShortcut(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.mPreparedPanel;
            if (panelFeatureState2 != null) {
                panelFeatureState2.isHandled = true;
            }
            return true;
        }
        if (this.mPreparedPanel == null) {
            PanelFeatureState panelState = getPanelState(0, true);
            preparePanel(panelState, keyEvent);
            boolean zPerformPanelShortcut = performPanelShortcut(panelState, keyEvent.getKeyCode(), keyEvent, 1);
            panelState.isPrepared = false;
            if (zPerformPanelShortcut) {
                return true;
            }
        }
        return false;
    }

    boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.mHost;
        if (((obj instanceof KeyEventDispatcher.Component) || (obj instanceof AppCompatDialog)) && (decorView = this.mWindow.getDecorView()) != null && KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.mAppCompatWindowCallback.bypassDispatchKeyEvent(this.mWindow.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
    }

    boolean onKeyUp(int i2, KeyEvent keyEvent) throws Throwable {
        if (i2 != 4) {
            if (i2 == 82) {
                onKeyUpPanel(0, keyEvent);
                return true;
            }
        } else if (onBackPressed()) {
            return true;
        }
        return false;
    }

    boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            int flags = keyEvent.getFlags();
            this.mLongPressBackDown = (flags + 128) - (flags | 128) != 0;
        } else if (i2 == 82) {
            onKeyDownPanel(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.AppCompatDelegate
    public View createView(View view, String str, Context context, AttributeSet attributeSet) throws Throwable {
        boolean z2;
        boolean zShouldInheritContext = false;
        if (this.mAppCompatViewInflater == null) {
            Context context2 = this.mContext;
            Object[] objArr = {androidx.appcompat.R.styleable.AppCompatTheme};
            Method method = Class.forName(C1626yg.Ud("Kif#@Mz6xH#pR*j\u00127{\u0012_`\u0013\\", (short) (C1580rY.Xd() ^ (-18770)), (short) (C1580rY.Xd() ^ (-4268)))).getMethod(Ig.wd("\u0013<@\t\bP]}T\u0017\u0016n!FZ6\u0011\u0016Ox*^", (short) (ZN.Xd() ^ 26112)), int[].class);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context2, objArr);
                String string = typedArray.getString(androidx.appcompat.R.styleable.AppCompatTheme_viewInflaterClass);
                typedArray.recycle();
                if (string == null) {
                    this.mAppCompatViewInflater = new AppCompatViewInflater();
                } else {
                    try {
                        Context context3 = this.mContext;
                        short sXd = (short) (C1633zX.Xd() ^ (-26853));
                        int[] iArr = new int["\u000eBf\u001c\u0002Y(QVun\u0017Sj<\u0017i,b`\u0011[q".length()];
                        QB qb = new QB("\u000eBf\u001c\u0002Y(QVun\u0017Sj<\u0017i,b`\u0011[q");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                            i2++;
                        }
                        Class<?> cls = Class.forName(new String(iArr, 0, i2));
                        Object[] objArr2 = new Object[0];
                        Method method2 = cls.getMethod(C1561oA.Qd("\u001a\u0017%r\u001b\u000f \u001fv\u0019\n\f\f\u0018", (short) (OY.Xd() ^ 19921)), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            this.mAppCompatViewInflater = (AppCompatViewInflater) ((ClassLoader) method2.invoke(context3, objArr2)).loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (Throwable th) {
                        String str2 = C1593ug.zd("Tpy}ww4\n\u00067\u0002\b\u000e\u0010}\f\u0013\t\u0002\u0016\bC\b\u001b\u001a\u001c\u0018\u0017J\"\u0016\u0013&O\u001a \u0019 \u0016*\u001c*X", (short) (C1607wl.Xd() ^ 31382), (short) (C1607wl.Xd() ^ 30924)) + string + C1561oA.od("`Qv\u0011\u001b\u001a\u0016\u001a\u0012I\u000b\t\n\u0011D\u0018\u0012A\u0005\u0005\u0005~\u0012\b\u000fG", (short) (C1499aX.Xd() ^ (-6524)));
                        C1561oA.Kd("e\u0016\u0017j\u0018\u0017\u001b\r!q\u0014\u001c\u0016\u0019\u0014(\u001a", (short) (ZN.Xd() ^ 3648));
                        this.mAppCompatViewInflater = new AppCompatViewInflater();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        boolean z3 = IS_PRE_LOLLIPOP;
        if (z3) {
            if (this.mLayoutIncludeDetector == null) {
                this.mLayoutIncludeDetector = new LayoutIncludeDetector();
            }
            z2 = true;
            if (!this.mLayoutIncludeDetector.detect(attributeSet)) {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zShouldInheritContext = shouldInheritContext((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zShouldInheritContext = true;
                }
                z2 = zShouldInheritContext;
            }
        } else {
            z2 = zShouldInheritContext;
        }
        return this.mAppCompatViewInflater.createView(view, str, context, attributeSet, z2, z3, true, VectorEnabledTintResources.shouldBeUsed());
    }

    private boolean shouldInheritContext(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.mWindow.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void installViewFactory() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.mContext);
        if (layoutInflaterFrom.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(layoutInflaterFrom, this);
        } else if (!(layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl)) {
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return createView(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private AppCompatActivity tryUnwrapContext() {
        for (Context baseContext = this.mContext; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AppCompatActivity) {
                return (AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void openPanel(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r13, android.view.KeyEvent r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.openPanel(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    private boolean initializePanelDecor(PanelFeatureState panelFeatureState) throws Throwable {
        panelFeatureState.setStyle(getActionBarThemedContext());
        panelFeatureState.decorView = new ListMenuDecorView(panelFeatureState.listPresenterContext);
        panelFeatureState.gravity = 81;
        return true;
    }

    private void reopenMenu(boolean z2) throws Throwable {
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null && decorContentParent.canShowOverflowMenu() && (!ViewConfiguration.get(this.mContext).hasPermanentMenuKey() || this.mDecorContentParent.isOverflowMenuShowPending())) {
            Window.Callback windowCallback = getWindowCallback();
            if (this.mDecorContentParent.isOverflowMenuShowing() && z2) {
                this.mDecorContentParent.hideOverflowMenu();
                if (this.mDestroyed) {
                    return;
                }
                windowCallback.onPanelClosed(108, getPanelState(0, true).menu);
                return;
            }
            if (windowCallback == null || this.mDestroyed) {
                return;
            }
            if (this.mInvalidatePanelMenuPosted && (this.mInvalidatePanelMenuFeatures & 1) != 0) {
                this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
                this.mInvalidatePanelMenuRunnable.run();
            }
            PanelFeatureState panelState = getPanelState(0, true);
            if (panelState.menu == null || panelState.refreshMenuContent || !windowCallback.onPreparePanel(0, panelState.createdPanelView, panelState.menu)) {
                return;
            }
            windowCallback.onMenuOpened(108, panelState.menu);
            this.mDecorContentParent.showOverflowMenu();
            return;
        }
        PanelFeatureState panelState2 = getPanelState(0, true);
        panelState2.refreshDecorView = true;
        closePanel(panelState2, false);
        openPanel(panelState2, null);
    }

    private boolean initializePanelMenu(PanelFeatureState panelFeatureState) throws Throwable {
        Resources.Theme themeNewTheme;
        Context context = this.mContext;
        if ((panelFeatureState.featureId == 0 || panelFeatureState.featureId == 108) && this.mDecorContentParent != null) {
            TypedValue typedValue = new TypedValue();
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("Q]R_[TN\u0017KVTYIQV\u000f#NLQASN", (short) (OY.Xd() ^ 16413))).getMethod(C1561oA.Kd(";:J+@>G@", (short) (ZN.Xd() ^ 22502)), new Class[0]);
            try {
                method.setAccessible(true);
                Resources.Theme theme = (Resources.Theme) method.invoke(context, objArr);
                theme.resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Wg.Zd("'ILp\u000b\u0011aH\u0014m\t$b\n%j\u0015\u001fk\u0007\u0014<F", (short) (OY.Xd() ^ 9526), (short) (OY.Xd() ^ 17876))).getMethod(C1561oA.Xd("\u0007\u0006\u0016t\t\u0018\u0015\u001c\u001a\f\u000f\u001e", (short) (C1499aX.Xd() ^ (-25611))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        themeNewTheme = ((Resources) method2.invoke(context, objArr2)).newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else {
                    theme.resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
                    themeNewTheme = null;
                }
                if (typedValue.resourceId != 0) {
                    if (themeNewTheme == null) {
                        short sXd = (short) (C1499aX.Xd() ^ (-20760));
                        int[] iArr = new int["p|q~\u0003{u>jusxpx}6Bmkphzu".length()];
                        QB qb = new QB("p|q~\u0003{u>jusxpx}6Bmkphzu");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                            i2++;
                        }
                        Object[] objArr3 = new Object[0];
                        Method method3 = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("HES0BOJOK;<I", (short) (FB.Xd() ^ 12648), (short) (FB.Xd() ^ 26712)), new Class[0]);
                        try {
                            method3.setAccessible(true);
                            themeNewTheme = ((Resources) method3.invoke(context, objArr3)).newTheme();
                            themeNewTheme.setTo(theme);
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    themeNewTheme.applyStyle(typedValue.resourceId, true);
                }
                if (themeNewTheme != null) {
                    androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(context, 0);
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(hg.Vd("jvkxtmg0domrbjo(<gejZlg", (short) (C1607wl.Xd() ^ 18289), (short) (C1607wl.Xd() ^ 35))).getMethod(C1561oA.ud("xu\u0004buqxo", (short) (Od.Xd() ^ (-12563))), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        ((Resources.Theme) method4.invoke(contextThemeWrapper, objArr4)).setTo(themeNewTheme);
                        context = contextThemeWrapper;
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.setCallback(this);
        panelFeatureState.setMenu(menuBuilder);
        return true;
    }

    private boolean initializePanelContent(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.createdPanelView != null) {
            panelFeatureState.shownPanelView = panelFeatureState.createdPanelView;
            return true;
        }
        if (panelFeatureState.menu == null) {
            return false;
        }
        if (this.mPanelMenuPresenterCallback == null) {
            this.mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
        }
        panelFeatureState.shownPanelView = (View) panelFeatureState.getListMenuView(this.mPanelMenuPresenterCallback);
        return panelFeatureState.shownPanelView != null;
    }

    private boolean preparePanel(PanelFeatureState panelFeatureState, KeyEvent keyEvent) throws Throwable {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        if (this.mDestroyed) {
            return false;
        }
        if (panelFeatureState.isPrepared) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.mPreparedPanel;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            closePanel(panelFeatureState2, false);
        }
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null) {
            panelFeatureState.createdPanelView = windowCallback.onCreatePanelView(panelFeatureState.featureId);
        }
        boolean z2 = panelFeatureState.featureId == 0 || panelFeatureState.featureId == 108;
        if (z2 && (decorContentParent3 = this.mDecorContentParent) != null) {
            decorContentParent3.setMenuPrepared();
        }
        if (panelFeatureState.createdPanelView == null && (!z2 || !(peekSupportActionBar() instanceof ToolbarActionBar))) {
            if (panelFeatureState.menu == null || panelFeatureState.refreshMenuContent) {
                if (panelFeatureState.menu == null && (!initializePanelMenu(panelFeatureState) || panelFeatureState.menu == null)) {
                    return false;
                }
                if (z2 && this.mDecorContentParent != null) {
                    if (this.mActionMenuPresenterCallback == null) {
                        this.mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
                    }
                    this.mDecorContentParent.setMenu(panelFeatureState.menu, this.mActionMenuPresenterCallback);
                }
                panelFeatureState.menu.stopDispatchingItemsChanged();
                if (!windowCallback.onCreatePanelMenu(panelFeatureState.featureId, panelFeatureState.menu)) {
                    panelFeatureState.setMenu(null);
                    if (z2 && (decorContentParent = this.mDecorContentParent) != null) {
                        decorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                    }
                    return false;
                }
                panelFeatureState.refreshMenuContent = false;
            }
            panelFeatureState.menu.stopDispatchingItemsChanged();
            if (panelFeatureState.frozenActionViewState != null) {
                panelFeatureState.menu.restoreActionViewStates(panelFeatureState.frozenActionViewState);
                panelFeatureState.frozenActionViewState = null;
            }
            if (!windowCallback.onPreparePanel(0, panelFeatureState.createdPanelView, panelFeatureState.menu)) {
                if (z2 && (decorContentParent2 = this.mDecorContentParent) != null) {
                    decorContentParent2.setMenu(null, this.mActionMenuPresenterCallback);
                }
                panelFeatureState.menu.startDispatchingItemsChanged();
                return false;
            }
            panelFeatureState.qwertyMode = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.menu.setQwertyMode(panelFeatureState.qwertyMode);
            panelFeatureState.menu.startDispatchingItemsChanged();
        }
        panelFeatureState.isPrepared = true;
        panelFeatureState.isHandled = false;
        this.mPreparedPanel = panelFeatureState;
        return true;
    }

    void checkCloseActionMenu(MenuBuilder menuBuilder) {
        if (this.mClosingActionMenu) {
            return;
        }
        this.mClosingActionMenu = true;
        this.mDecorContentParent.dismissPopups();
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null && !this.mDestroyed) {
            windowCallback.onPanelClosed(108, menuBuilder);
        }
        this.mClosingActionMenu = false;
    }

    void closePanel(int i2) throws Throwable {
        closePanel(getPanelState(i2, true), true);
    }

    void closePanel(PanelFeatureState panelFeatureState, boolean z2) throws Throwable {
        DecorContentParent decorContentParent;
        if (z2 && panelFeatureState.featureId == 0 && (decorContentParent = this.mDecorContentParent) != null && decorContentParent.isOverflowMenuShowing()) {
            checkCloseActionMenu(panelFeatureState.menu);
            return;
        }
        Context context = this.mContext;
        short sXd = (short) (OY.Xd() ^ 25567);
        int[] iArr = new int["%\u0018\u001e\u0015!*".length()];
        QB qb = new QB("%\u0018\u001e\u0015!*");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2)};
        Method method = Class.forName(Xg.qd("\u0017%\u001c+)$ j!..5'18r\t66=/C@", (short) (C1499aX.Xd() ^ (-5032)), (short) (C1499aX.Xd() ^ (-17848)))).getMethod(ZO.xd("eXo]\u000f\u001cO{.E!Z\u001cD$1", (short) (ZN.Xd() ^ 4821), (short) (ZN.Xd() ^ 27895)), Class.forName(Jg.Wd("<Kv\u0004n?8_nW\u0013L\u0011\u001a=X", (short) (C1633zX.Xd() ^ (-3664)), (short) (C1633zX.Xd() ^ (-9565)))));
        try {
            method.setAccessible(true);
            WindowManager windowManager = (WindowManager) method.invoke(context, objArr);
            if (windowManager != null && panelFeatureState.isOpen && panelFeatureState.decorView != null) {
                windowManager.removeView(panelFeatureState.decorView);
                if (z2) {
                    callOnPanelClosed(panelFeatureState.featureId, panelFeatureState, null);
                }
            }
            panelFeatureState.isPrepared = false;
            panelFeatureState.isHandled = false;
            panelFeatureState.isOpen = false;
            panelFeatureState.shownPanelView = null;
            panelFeatureState.refreshDecorView = true;
            if (this.mPreparedPanel == panelFeatureState) {
                this.mPreparedPanel = null;
            }
            if (panelFeatureState.featureId == 0) {
                updateBackInvokedCallbackState();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private boolean onKeyDownPanel(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState panelState = getPanelState(i2, true);
        if (panelState.isOpen) {
            return false;
        }
        return preparePanel(panelState, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean onKeyUpPanel(int r17, android.view.KeyEvent r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.onKeyUpPanel(int, android.view.KeyEvent):boolean");
    }

    void callOnPanelClosed(int i2, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i2 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.mPanels;
                if (i2 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i2];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.menu;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.isOpen) && !this.mDestroyed) {
            this.mAppCompatWindowCallback.bypassOnPanelClosed(this.mWindow.getCallback(), i2, menu);
        }
    }

    PanelFeatureState findMenuPanel(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.menu == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    protected PanelFeatureState getPanelState(int i2, boolean z2) {
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i2) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i2 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.mPanels = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i2);
        panelFeatureStateArr[i2] = panelFeatureState2;
        return panelFeatureState2;
    }

    private boolean performPanelShortcut(PanelFeatureState panelFeatureState, int i2, KeyEvent keyEvent, int i3) throws Throwable {
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.isPrepared || preparePanel(panelFeatureState, keyEvent)) && panelFeatureState.menu != null) {
            zPerformShortcut = panelFeatureState.menu.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 + 1) - (i3 | 1) == 0 && this.mDecorContentParent == null) {
            closePanel(panelFeatureState, true);
        }
        return zPerformShortcut;
    }

    private void invalidatePanelMenu(int i2) {
        this.mInvalidatePanelMenuFeatures = (-1) - (((-1) - (1 << i2)) & ((-1) - this.mInvalidatePanelMenuFeatures));
        if (this.mInvalidatePanelMenuPosted) {
            return;
        }
        ViewCompat.postOnAnimation(this.mWindow.getDecorView(), this.mInvalidatePanelMenuRunnable);
        this.mInvalidatePanelMenuPosted = true;
    }

    void doInvalidatePanelMenu(int i2) throws Throwable {
        PanelFeatureState panelState;
        PanelFeatureState panelState2 = getPanelState(i2, true);
        if (panelState2.menu != null) {
            Bundle bundle = new Bundle();
            panelState2.menu.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                panelState2.frozenActionViewState = bundle;
            }
            panelState2.menu.stopDispatchingItemsChanged();
            panelState2.menu.clear();
        }
        panelState2.refreshMenuContent = true;
        panelState2.refreshDecorView = true;
        if ((i2 != 108 && i2 != 0) || this.mDecorContentParent == null || (panelState = getPanelState(0, false)) == null) {
            return;
        }
        panelState.isPrepared = false;
        preparePanel(panelState, null);
    }

    final int updateStatusGuard(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        int systemWindowInsetTop;
        boolean z2;
        boolean z3;
        if (windowInsetsCompat != null) {
            systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        } else {
            systemWindowInsetTop = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.mActionModeView;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mActionModeView.getLayoutParams();
            if (this.mActionModeView.isShown()) {
                if (this.mTempRect1 == null) {
                    this.mTempRect1 = new Rect();
                    this.mTempRect2 = new Rect();
                }
                Rect rect2 = this.mTempRect1;
                Rect rect3 = this.mTempRect2;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                }
                ViewUtils.computeFitSystemWindows(this.mSubDecor, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this.mSubDecor);
                int systemWindowInsetLeft = rootWindowInsets == null ? 0 : rootWindowInsets.getSystemWindowInsetLeft();
                int systemWindowInsetRight = rootWindowInsets == null ? 0 : rootWindowInsets.getSystemWindowInsetRight();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z3 = true;
                }
                if (i2 > 0 && this.mStatusGuard == null) {
                    View view = new View(this.mContext);
                    this.mStatusGuard = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = systemWindowInsetLeft;
                    layoutParams.rightMargin = systemWindowInsetRight;
                    this.mSubDecor.addView(this.mStatusGuard, -1, layoutParams);
                } else {
                    View view2 = this.mStatusGuard;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                            marginLayoutParams2.rightMargin = systemWindowInsetRight;
                            this.mStatusGuard.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.mStatusGuard;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    updateStatusGuardColor(this.mStatusGuard);
                }
                if (!this.mOverlayActionMode && z) {
                    systemWindowInsetTop = 0;
                }
                z2 = z;
                z = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z = false;
            }
            if (z) {
                this.mActionModeView.setLayoutParams(marginLayoutParams);
            }
        } else {
            z2 = false;
        }
        View view4 = this.mStatusGuard;
        if (view4 != null) {
            view4.setVisibility(z2 ? 0 : 8);
        }
        return systemWindowInsetTop;
    }

    private void updateStatusGuardColor(View view) {
        int color;
        int windowSystemUiVisibility = ViewCompat.getWindowSystemUiVisibility(view);
        if ((windowSystemUiVisibility + 8192) - (windowSystemUiVisibility | 8192) != 0) {
            color = ContextCompat.getColor(this.mContext, androidx.appcompat.R.color.abc_decor_view_status_guard_light);
        } else {
            color = ContextCompat.getColor(this.mContext, androidx.appcompat.R.color.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(color);
    }

    private void throwFeatureRequestIfSubDecorInstalled() {
        if (this.mSubDecorInstalled) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private int sanitizeWindowFeatureId(int i2) {
        if (i2 == 8) {
            return 108;
        }
        if (i2 == 9) {
            return 109;
        }
        return i2;
    }

    ViewGroup getSubDecor() {
        return this.mSubDecor;
    }

    void dismissPopups() {
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.mActionModePopup != null) {
            this.mWindow.getDecorView().removeCallbacks(this.mShowActionModePopup);
            if (this.mActionModePopup.isShowing()) {
                try {
                    this.mActionModePopup.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.mActionModePopup = null;
        }
        endOnGoingFadeAnimation();
        PanelFeatureState panelState = getPanelState(0, false);
        if (panelState == null || panelState.menu == null) {
            return;
        }
        panelState.menu.close();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public Context getContextForDelegate() {
        return this.mContext;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean applyDayNight() {
        return applyApplicationSpecificConfig(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    boolean applyAppLocales() {
        if (isAutoStorageOptedIn(this.mContext) && getRequestedAppLocales() != null && !getRequestedAppLocales().equals(getStoredAppLocales())) {
            asyncExecuteSyncRequestedAndStoredLocales(this.mContext);
        }
        return applyApplicationSpecificConfig(true);
    }

    private boolean applyApplicationSpecificConfig(boolean z2) {
        return applyApplicationSpecificConfig(z2, true);
    }

    private boolean applyApplicationSpecificConfig(boolean z2, boolean z3) throws Throwable {
        if (this.mDestroyed) {
            return false;
        }
        int iCalculateNightMode = calculateNightMode();
        int iMapNightMode = mapNightMode(this.mContext, iCalculateNightMode);
        LocaleListCompat localeListCompatCalculateApplicationLocales = Build.VERSION.SDK_INT < 33 ? calculateApplicationLocales(this.mContext) : null;
        if (!z3 && localeListCompatCalculateApplicationLocales != null) {
            Context context = this.mContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Xg.qd("\u001d+\"1/*&p'44;-7>x\u000f<<C5IF", (short) (C1580rY.Xd() ^ (-20136)), (short) (C1580rY.Xd() ^ (-4794)))).getMethod(Jg.Wd("/\u000bH\u0011m.\u0019f\u0010c1i", (short) (C1607wl.Xd() ^ 31663), (short) (C1607wl.Xd() ^ 18053)), new Class[0]);
            try {
                method.setAccessible(true);
                localeListCompatCalculateApplicationLocales = getConfigurationLocales(((Resources) method.invoke(context, objArr)).getConfiguration());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        boolean zUpdateAppConfiguration = updateAppConfiguration(iMapNightMode, localeListCompatCalculateApplicationLocales, z2);
        if (iCalculateNightMode == 0) {
            getAutoTimeNightModeManager(this.mContext).setup();
        } else {
            AutoNightModeManager autoNightModeManager = this.mAutoTimeNightModeManager;
            if (autoNightModeManager != null) {
                autoNightModeManager.cleanup();
            }
        }
        if (iCalculateNightMode == 3) {
            getAutoBatteryNightModeManager(this.mContext).setup();
        } else {
            AutoNightModeManager autoNightModeManager2 = this.mAutoBatteryNightModeManager;
            if (autoNightModeManager2 != null) {
                autoNightModeManager2.cleanup();
            }
        }
        return zUpdateAppConfiguration;
    }

    LocaleListCompat calculateApplicationLocales(Context context) throws Throwable {
        LocaleListCompat requestedAppLocales;
        if (Build.VERSION.SDK_INT >= 33 || (requestedAppLocales = getRequestedAppLocales()) == null) {
            return null;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("\n\u0016\u000b\u0018\u0014\r\u0007O\u0004\u000f\r\u0012\u0002\n\u000fG[\u0007\u0005\ny\f\u0007", (short) (C1633zX.Xd() ^ (-7174)), (short) (C1633zX.Xd() ^ (-29482)))).getMethod(hg.Vd("]Zh4ba\\XQN`TYW+VTYI[V", (short) (ZN.Xd() ^ 31461), (short) (ZN.Xd() ^ 4089)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            short sXd = (short) (C1580rY.Xd() ^ (-4206));
            int[] iArr = new int["eqfsohb+_jhm]ej#7b`eUgb".length()];
            QB qb = new QB("eqfsohb+_jhm]ej#7b`eUgb");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd2 = (short) (C1499aX.Xd() ^ (-12560));
            int[] iArr2 = new int["10@\u001f+:7>4&)8".length()];
            QB qb2 = new QB("10@\u001f+:7>4&)8");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                i3++;
            }
            Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method2.setAccessible(true);
                LocaleListCompat configurationLocales = getConfigurationLocales(((Resources) method2.invoke(context2, objArr2)).getConfiguration());
                LocaleListCompat localeListCompatCombineLocalesIfOverlayExists = LocaleOverlayHelper.combineLocalesIfOverlayExists(requestedAppLocales, configurationLocales);
                return localeListCompatCombineLocalesIfOverlayExists.isEmpty() ? configurationLocales : localeListCompatCombineLocalesIfOverlayExists;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setLocalNightMode(int i2) {
        if (this.mLocalNightMode != i2) {
            this.mLocalNightMode = i2;
            if (this.mBaseContextAttached) {
                applyDayNight();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public int getLocalNightMode() {
        return this.mLocalNightMode;
    }

    int mapNightMode(Context context, int i2) throws Throwable {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                short sXd = (short) (Od.Xd() ^ (-16205));
                int[] iArr = new int["r\u0001w\u0007\u0005\u007f{F|\n\n\u0011\u0003\r\u0014Nd\u0012\u0012\u0019\u000b\u001f\u001c".length()];
                QB qb = new QB("r\u0001w\u0007\u0005\u007f{F|\n\n\u0011\u0003\r\u0014Nd\u0012\u0012\u0019\u000b\u001f\u001c");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
                    i3++;
                }
                Object[] objArr = new Object[0];
                Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Wg.vd("[Zj8hifd_^rhooErryk\u007f|", (short) (C1633zX.Xd() ^ (-16908))), new Class[0]);
                try {
                    method.setAccessible(true);
                    Context context2 = (Context) method.invoke(context, objArr);
                    String strKd = Qg.kd("(\u001b\u001e\u001f\u0013\u0013", (short) (ZN.Xd() ^ 8676), (short) (ZN.Xd() ^ 26529));
                    short sXd2 = (short) (C1580rY.Xd() ^ (-28598));
                    short sXd3 = (short) (C1580rY.Xd() ^ (-21933));
                    int[] iArr2 = new int["\u0007\u0013\b\u0015\u0011\n\u0004L\u0001\f\n\u000f~\u0007\fDX\u0004\u0002\u0007v\t\u0004".length()];
                    QB qb2 = new QB("\u0007\u0013\b\u0015\u0011\n\u0004L\u0001\f\n\u000f~\u0007\fDX\u0004\u0002\u0007v\t\u0004");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(sXd2 + i4 + xuXd2.CK(iKK2) + sXd3);
                        i4++;
                    }
                    Object[] objArr2 = {strKd};
                    Method method2 = Class.forName(new String(iArr2, 0, i4)).getMethod(C1561oA.yd("%\"4\u0012;48(3\u0018-9@2/0", (short) (C1580rY.Xd() ^ (-6720))), Class.forName(C1561oA.ud("\u0014\n\u001e\bS\u0011\u0005\u0011\tNr\u0013\u0010\u0006\n\u0002", (short) (Od.Xd() ^ (-12938)))));
                    try {
                        method2.setAccessible(true);
                        if (((UiModeManager) method2.invoke(context2, objArr2)).getNightMode() == 0) {
                            return -1;
                        }
                        return getAutoTimeNightModeManager(context).getApplyableNightMode();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return getAutoBatteryNightModeManager(context).getApplyableNightMode();
                }
                throw new IllegalStateException(Wg.Zd("m\u000b+S\b2\rcm\u001aG4Y7-B\u00076\u001eU\u0006N\t.W\u0016M\"Zy\u001aD9'\u0005Ln\tP&\u0002\u001bOd\u0003s%A\u001fp\u001bzr\b8Q,y\u00184=W{\u0015B\u001aQAW\u0011E\u000fHB/\\\rnG\fl0h7f\r#\u001b\u001e\u0001+I\u0002U\u00142'", (short) (C1499aX.Xd() ^ (-10848)), (short) (C1499aX.Xd() ^ (-31262))));
            }
        }
        return i2;
    }

    private int calculateNightMode() {
        int i2 = this.mLocalNightMode;
        return i2 != -100 ? i2 : getDefaultNightMode();
    }

    void setConfigurationLocales(Configuration configuration, LocaleListCompat localeListCompat) {
        Api24Impl.setLocales(configuration, localeListCompat);
    }

    LocaleListCompat getConfigurationLocales(Configuration configuration) {
        return Api24Impl.getLocales(configuration);
    }

    void setDefaultLocalesForLocaleList(LocaleListCompat localeListCompat) {
        Api24Impl.setDefaultLocales(localeListCompat);
    }

    private Configuration createOverrideAppConfiguration(Context context, int i2, LocaleListCompat localeListCompat, Configuration configuration, boolean z2) throws Throwable {
        int i3;
        if (i2 == 1) {
            i3 = 16;
        } else if (i2 == 2) {
            i3 = 32;
        } else if (z2) {
            i3 = 0;
        } else {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("\u007fD(\u000f\u0014PwQG45\u001d^]C\u0007S\u001a@~1{\u001e", (short) (ZN.Xd() ^ 19265))).getMethod(EO.Od("W%w(G\u001d1M\u000bhqP&'K]2.V&e", (short) (ZN.Xd() ^ 6863)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Qd("Q]R_[TN\u0017KVTYIQV\u000f#NLQASN", (short) (FB.Xd() ^ 13328))).getMethod(C1593ug.zd("\u0001\u007f\u0010n\u0003\u0012\u000f\u0016\u0014\u0006\t\u0018", (short) (C1607wl.Xd() ^ 30737), (short) (C1607wl.Xd() ^ 12064)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    int i4 = ((Resources) method2.invoke(context2, objArr2)).getConfiguration().uiMode;
                    i3 = (i4 + 48) - (i4 | 48);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        int i5 = configuration2.uiMode;
        int i6 = (i5 - 49) - (i5 | (-49));
        configuration2.uiMode = (i3 + i6) - (i3 & i6);
        if (localeListCompat != null) {
            setConfigurationLocales(configuration2, localeListCompat);
        }
        return configuration2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean updateAppConfiguration(int r15, androidx.core.os.LocaleListCompat r16, boolean r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.updateAppConfiguration(int, androidx.core.os.LocaleListCompat, boolean):boolean");
    }

    private void updateResourcesConfiguration(int i2, LocaleListCompat localeListCompat, boolean z2, Configuration configuration) throws Throwable {
        Context context = this.mContext;
        short sXd = (short) (C1499aX.Xd() ^ (-30734));
        int[] iArr = new int[">L?NHC;\u00068EAH6@C}\u0010=9@.B;".length()];
        QB qb = new QB(">L?NHC;\u00068EAH6@C}\u0010=9@.B;");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(C1561oA.Yd(" \u001f/\u000e\"1.53%(7", (short) (OY.Xd() ^ 15165)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            if (configuration != null) {
                configuration2.updateFrom(configuration);
            }
            int i4 = resources.getConfiguration().uiMode;
            configuration2.uiMode = i2 | ((i4 - 49) - (i4 | (-49)));
            if (localeListCompat != null) {
                setConfigurationLocales(configuration2, localeListCompat);
            }
            resources.updateConfiguration(configuration2, null);
            int i5 = this.mThemeResId;
            if (i5 != 0) {
                Context context2 = this.mContext;
                short sXd2 = (short) (OY.Xd() ^ 22966);
                short sXd3 = (short) (OY.Xd() ^ 9680);
                int[] iArr2 = new int["P^Udb]Y$Zggn`jq,Boovh|y".length()];
                QB qb2 = new QB("P^Udb]Y$Zggn`jq,Boovh|y");
                int i6 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i6] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i6)) + sXd3);
                    i6++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i6));
                Class<?>[] clsArr = {Integer.TYPE};
                Object[] objArr2 = {Integer.valueOf(i5)};
                Method method2 = cls.getMethod(Jg.Wd("\u001an\u0015W\"\u0002!\u007f", (short) (FB.Xd() ^ 5149), (short) (FB.Xd() ^ 9531)), clsArr);
                try {
                    method2.setAccessible(true);
                    method2.invoke(context2, objArr2);
                    Context context3 = this.mContext;
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(ZO.xd("\u0003{\u0015c34y,\u0006]4t\u0010\u0010\u0010{<\u0013BH\u0018\u0010X", (short) (C1607wl.Xd() ^ 29960), (short) (C1607wl.Xd() ^ 15847))).getMethod(C1626yg.Ud("o\"hmx&=R", (short) (FB.Xd() ^ 32491), (short) (FB.Xd() ^ 424)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        ((Resources.Theme) method3.invoke(context3, objArr3)).applyStyle(this.mThemeResId, true);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            if (z2 && (this.mHost instanceof Activity)) {
                updateActivityConfiguration(configuration2);
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateActivityConfiguration(Configuration configuration) {
        Activity activity = (Activity) this.mHost;
        if (activity instanceof LifecycleOwner) {
            if (((LifecycleOwner) activity).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.mCreated || this.mDestroyed) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    final AutoNightModeManager getAutoTimeNightModeManager() {
        return getAutoTimeNightModeManager(this.mContext);
    }

    private AutoNightModeManager getAutoTimeNightModeManager(Context context) {
        if (this.mAutoTimeNightModeManager == null) {
            this.mAutoTimeNightModeManager = new AutoTimeNightModeManager(TwilightManager.getInstance(context));
        }
        return this.mAutoTimeNightModeManager;
    }

    private AutoNightModeManager getAutoBatteryNightModeManager(Context context) {
        if (this.mAutoBatteryNightModeManager == null) {
            this.mAutoBatteryNightModeManager = new AutoBatteryNightModeManager(context);
        }
        return this.mAutoBatteryNightModeManager;
    }

    private int getActivityHandlesConfigChangesFlags(Context context) throws Throwable {
        if (!this.mActivityHandlesConfigFlagsChecked && (this.mHost instanceof Activity)) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("AJ\u0006\u0012PP!4_\u0011\u0010s*9p8#pu9.~X", (short) (FB.Xd() ^ 5720), (short) (FB.Xd() ^ 14272))).getMethod(ZO.xd("]j\u0017s\u0018ukiF\u0019faEV\u0016FI", (short) (C1607wl.Xd() ^ 6712), (short) (C1607wl.Xd() ^ 30534)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                if (packageManager == null) {
                    return 0;
                }
                try {
                    int i2 = Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432;
                    ComponentName componentName = new ComponentName(context, this.mHost.getClass());
                    short sXd = (short) (FB.Xd() ^ BmpReader.OS2_BITMAP_ARRAY);
                    short sXd2 = (short) (FB.Xd() ^ 4561);
                    int[] iArr = new int["D(m,Hc\"&XBgdD6\u0018i\u0003\u001bQ\u0018\u000em~?\"Y\u001b\u0001\u0011sxn/".length()];
                    QB qb = new QB("D(m,Hc\"&XBgdD6\u0018i\u0003\u001bQ\u0018\u000em~?\"Y\u001b\u0001\u0011sxn/");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
                        i3++;
                    }
                    Class<?> cls = Class.forName(new String(iArr, 0, i3));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(Ig.wd("{OW\n\u000fS.HVro\u0018]`B\"y\u001crI1lMZIj`\u001f\u0005", (short) (C1499aX.Xd() ^ (-8608))));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr2 = {componentName, Integer.valueOf(i2)};
                    Method method2 = cls.getMethod(EO.Od("Q'\u00061>s\u0013BkYb\n\u001a\n\u0005", (short) (C1607wl.Xd() ^ 31856)), clsArr);
                    try {
                        method2.setAccessible(true);
                        ActivityInfo activityInfo = (ActivityInfo) method2.invoke(packageManager, objArr2);
                        if (activityInfo != null) {
                            this.mActivityHandlesConfigFlags = activityInfo.configChanges;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    C1561oA.Qd("\u0013A@\u0012=:<,>\r-3+,%7'", (short) (ZN.Xd() ^ 29109));
                    C1593ug.zd("2fRUaf\\cc\u0016n`bf`\u001cdcstjpj$Fi{q\u007fs\u007f\u0006V|u\u007f", (short) (C1607wl.Xd() ^ 17052), (short) (C1607wl.Xd() ^ 6709));
                    this.mActivityHandlesConfigFlags = 0;
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
        this.mActivityHandlesConfigFlagsChecked = true;
        return this.mActivityHandlesConfigFlags;
    }

    class ActionModeCallbackWrapperV9 implements ActionMode.Callback {
        private ActionMode.Callback mWrapped;

        public ActionModeCallbackWrapperV9(ActionMode.Callback callback) {
            this.mWrapped = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.mWrapped.onCreateActionMode(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            ViewCompat.requestApplyInsets(AppCompatDelegateImpl.this.mSubDecor);
            return this.mWrapped.onPrepareActionMode(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.mWrapped.onActionItemClicked(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.mWrapped.onDestroyActionMode(actionMode);
            if (AppCompatDelegateImpl.this.mActionModePopup != null) {
                AppCompatDelegateImpl.this.mWindow.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.mShowActionModePopup);
            }
            if (AppCompatDelegateImpl.this.mActionModeView != null) {
                AppCompatDelegateImpl.this.endOnGoingFadeAnimation();
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.mFadeAnim = ViewCompat.animate(appCompatDelegateImpl.mActionModeView).alpha(0.0f);
                AppCompatDelegateImpl.this.mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9.1
                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                    public void onAnimationEnd(View view) {
                        AppCompatDelegateImpl.this.mActionModeView.setVisibility(8);
                        if (AppCompatDelegateImpl.this.mActionModePopup != null) {
                            AppCompatDelegateImpl.this.mActionModePopup.dismiss();
                        } else if (AppCompatDelegateImpl.this.mActionModeView.getParent() instanceof View) {
                            ViewCompat.requestApplyInsets((View) AppCompatDelegateImpl.this.mActionModeView.getParent());
                        }
                        AppCompatDelegateImpl.this.mActionModeView.killMode();
                        AppCompatDelegateImpl.this.mFadeAnim.setListener(null);
                        AppCompatDelegateImpl.this.mFadeAnim = null;
                        ViewCompat.requestApplyInsets(AppCompatDelegateImpl.this.mSubDecor);
                    }
                });
            }
            if (AppCompatDelegateImpl.this.mAppCompatCallback != null) {
                AppCompatDelegateImpl.this.mAppCompatCallback.onSupportActionModeFinished(AppCompatDelegateImpl.this.mActionMode);
            }
            AppCompatDelegateImpl.this.mActionMode = null;
            ViewCompat.requestApplyInsets(AppCompatDelegateImpl.this.mSubDecor);
            AppCompatDelegateImpl.this.updateBackInvokedCallbackState();
        }
    }

    private final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        PanelMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z2) throws Throwable {
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            boolean z3 = rootMenu != menuBuilder;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z3) {
                menuBuilder = rootMenu;
            }
            PanelFeatureState panelFeatureStateFindMenuPanel = appCompatDelegateImpl.findMenuPanel(menuBuilder);
            if (panelFeatureStateFindMenuPanel != null) {
                if (z3) {
                    AppCompatDelegateImpl.this.callOnPanelClosed(panelFeatureStateFindMenuPanel.featureId, panelFeatureStateFindMenuPanel, rootMenu);
                    AppCompatDelegateImpl.this.closePanel(panelFeatureStateFindMenuPanel, true);
                } else {
                    AppCompatDelegateImpl.this.closePanel(panelFeatureStateFindMenuPanel, z2);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback windowCallback;
            if (menuBuilder != menuBuilder.getRootMenu() || !AppCompatDelegateImpl.this.mHasActionBar || (windowCallback = AppCompatDelegateImpl.this.getWindowCallback()) == null || AppCompatDelegateImpl.this.mDestroyed) {
                return true;
            }
            windowCallback.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    private final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback windowCallback = AppCompatDelegateImpl.this.getWindowCallback();
            if (windowCallback == null) {
                return true;
            }
            windowCallback.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
            AppCompatDelegateImpl.this.checkCloseActionMenu(menuBuilder);
        }
    }

    protected static final class PanelFeatureState {
        int background;
        View createdPanelView;
        ViewGroup decorView;
        int featureId;
        Bundle frozenActionViewState;
        Bundle frozenMenuState;
        int gravity;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        ListMenuPresenter listMenuPresenter;
        Context listPresenterContext;
        MenuBuilder menu;
        public boolean qwertyMode;
        boolean refreshDecorView = false;
        boolean refreshMenuContent;
        View shownPanelView;
        boolean wasLastOpen;
        int windowAnimations;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f93x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f94y;

        PanelFeatureState(int i2) {
            this.featureId = i2;
        }

        public boolean hasPanelItems() {
            if (this.shownPanelView == null) {
                return false;
            }
            return this.createdPanelView != null || this.listMenuPresenter.getAdapter().getCount() > 0;
        }

        public void clearMenuPresenters() {
            MenuBuilder menuBuilder = this.menu;
            if (menuBuilder != null) {
                menuBuilder.removeMenuPresenter(this.listMenuPresenter);
            }
            this.listMenuPresenter = null;
        }

        void setStyle(Context context) throws Throwable {
            TypedValue typedValue = new TypedValue();
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("\t\u0015\n\u0017\u0013\f\u0006N\u0003\u000e\f\u0011\u0001\t\u000eFZ\u0006\u0004\tx\u000b\u0006", (short) (OY.Xd() ^ 29198), (short) (OY.Xd() ^ 27611))).getMethod(C1561oA.ud("\u0017\u0014\"~\u0011\u001e\u0019\u001e\u001a\n\u000b\u0018", (short) (FB.Xd() ^ 10354)), new Class[0]);
            try {
                method.setAccessible(true);
                Resources.Theme themeNewTheme = ((Resources) method.invoke(context, objArr)).newTheme();
                Class<?> cls = Class.forName(C1561oA.yd("t\u0003y\t~yu@n{{\u0003lv}8f\u0014\u0014\u001b\u0005\u0019\u0016", (short) (C1580rY.Xd() ^ (-10035))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (C1633zX.Xd() ^ (-8663));
                int[] iArr = new int["43C$97@9".length()];
                QB qb = new QB("43C$97@9");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    themeNewTheme.setTo((Resources.Theme) method2.invoke(context, objArr2));
                    themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.actionBarPopupTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                    }
                    themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.panelMenuListTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                    } else {
                        themeNewTheme.applyStyle(androidx.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
                    }
                    androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(context, 0);
                    Class<?> cls2 = Class.forName(Xg.qd("\u0005\u0013\n\u0019\u0017\u0012\u000eX\u000f\u001c\u001c#\u0015\u001f&`v$$+\u001d1.", (short) (OY.Xd() ^ 2510), (short) (OY.Xd() ^ 12903)));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd2 = (short) (ZN.Xd() ^ 10170);
                    short sXd3 = (short) (ZN.Xd() ^ 24347);
                    int[] iArr2 = new int["dyI]\u0013,d\u007f".length()];
                    QB qb2 = new QB("dyI]\u0013,d\u007f");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                        i3++;
                    }
                    Method method3 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                    try {
                        method3.setAccessible(true);
                        ((Resources.Theme) method3.invoke(contextThemeWrapper, objArr3)).setTo(themeNewTheme);
                        this.listPresenterContext = contextThemeWrapper;
                        int[] iArr3 = androidx.appcompat.R.styleable.AppCompatTheme;
                        short sXd4 = (short) (ZN.Xd() ^ 1095);
                        short sXd5 = (short) (ZN.Xd() ^ 19071);
                        int[] iArr4 = new int["\u000f`_\u0011(WZ\u007f}\u0004=\u007f\u0019[fO<\u000f\u0011y3Rv".length()];
                        QB qb3 = new QB("\u000f`_\u0011(WZ\u007f}\u0004=\u007f\u0019[fO<\u000f\u0011y3Rv");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr4[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                            i4++;
                        }
                        Object[] objArr4 = {iArr3};
                        Method method4 = Class.forName(new String(iArr4, 0, i4)).getMethod(C1626yg.Ud("jX,fp\u0014+yw%t>\u0017\u001ca6<%RJzh", (short) (C1633zX.Xd() ^ (-25996)), (short) (C1633zX.Xd() ^ (-28297))), int[].class);
                        try {
                            method4.setAccessible(true);
                            TypedArray typedArray = (TypedArray) method4.invoke(contextThemeWrapper, objArr4);
                            this.background = typedArray.getResourceId(androidx.appcompat.R.styleable.AppCompatTheme_panelBackground, 0);
                            this.windowAnimations = typedArray.getResourceId(androidx.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
                            typedArray.recycle();
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }

        void setMenu(MenuBuilder menuBuilder) {
            ListMenuPresenter listMenuPresenter;
            MenuBuilder menuBuilder2 = this.menu;
            if (menuBuilder == menuBuilder2) {
                return;
            }
            if (menuBuilder2 != null) {
                menuBuilder2.removeMenuPresenter(this.listMenuPresenter);
            }
            this.menu = menuBuilder;
            if (menuBuilder == null || (listMenuPresenter = this.listMenuPresenter) == null) {
                return;
            }
            menuBuilder.addMenuPresenter(listMenuPresenter);
        }

        MenuView getListMenuView(MenuPresenter.Callback callback) {
            if (this.menu == null) {
                return null;
            }
            if (this.listMenuPresenter == null) {
                ListMenuPresenter listMenuPresenter = new ListMenuPresenter(this.listPresenterContext, androidx.appcompat.R.layout.abc_list_menu_item_layout);
                this.listMenuPresenter = listMenuPresenter;
                listMenuPresenter.setCallback(callback);
                this.menu.addMenuPresenter(this.listMenuPresenter);
            }
            return this.listMenuPresenter.getMenuView(this.decorView);
        }

        Parcelable onSaveInstanceState() {
            SavedState savedState = new SavedState();
            savedState.featureId = this.featureId;
            savedState.isOpen = this.isOpen;
            if (this.menu != null) {
                savedState.menuState = new Bundle();
                this.menu.savePresenterStates(savedState.menuState);
            }
            return savedState;
        }

        void onRestoreInstanceState(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.featureId = savedState.featureId;
            this.wasLastOpen = savedState.isOpen;
            this.frozenMenuState = savedState.menuState;
            this.shownPanelView = null;
            this.decorView = null;
        }

        void applyFrozenState() {
            Bundle bundle;
            MenuBuilder menuBuilder = this.menu;
            if (menuBuilder == null || (bundle = this.frozenMenuState) == null) {
                return;
            }
            menuBuilder.restorePresenterStates(bundle);
            this.frozenMenuState = null;
        }

        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.readFromParcel(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.readFromParcel(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public SavedState[] newArray(int i2) {
                    return new SavedState[i2];
                }
            };
            int featureId;
            boolean isOpen;
            Bundle menuState;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            SavedState() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.featureId);
                parcel.writeInt(this.isOpen ? 1 : 0);
                if (this.isOpen) {
                    parcel.writeBundle(this.menuState);
                }
            }

            static SavedState readFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.featureId = parcel.readInt();
                boolean z2 = parcel.readInt() == 1;
                savedState.isOpen = z2;
                if (z2) {
                    savedState.menuState = parcel.readBundle(classLoader);
                }
                return savedState;
            }
        }
    }

    private class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Throwable {
            if (motionEvent.getAction() == 0 && isOutOfBounds((int) motionEvent.getX(), (int) motionEvent.getY())) {
                AppCompatDelegateImpl.this.closePanel(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), i2));
        }

        private boolean isOutOfBounds(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }
    }

    class AppCompatWindowCallback extends WindowCallbackWrapper {
        private ActionBarMenuCallback mActionBarCallback;
        private boolean mDispatchKeyEventBypassEnabled;
        private boolean mOnContentChangedBypassEnabled;
        private boolean mOnPanelClosedBypassEnabled;

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        AppCompatWindowCallback(Window.Callback callback) {
            super(callback);
        }

        void setActionBarCallback(ActionBarMenuCallback actionBarMenuCallback) {
            this.mActionBarCallback = actionBarMenuCallback;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.mDispatchKeyEventBypassEnabled) {
                return getWrapped().dispatchKeyEvent(keyEvent);
            }
            return AppCompatDelegateImpl.this.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.onKeyShortcut(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public View onCreatePanelView(int i2) {
            View viewOnCreatePanelView;
            ActionBarMenuCallback actionBarMenuCallback = this.mActionBarCallback;
            return (actionBarMenuCallback == null || (viewOnCreatePanelView = actionBarMenuCallback.onCreatePanelView(i2)) == null) ? super.onCreatePanelView(i2) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
            if (this.mOnContentChangedBypassEnabled) {
                getWrapped().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i2 == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(true);
            }
            ActionBarMenuCallback actionBarMenuCallback = this.mActionBarCallback;
            boolean zOnPreparePanel = actionBarMenuCallback != null && actionBarMenuCallback.onPreparePanel(i2);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i2, view, menu);
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            AppCompatDelegateImpl.this.onMenuOpened(i2);
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) throws Throwable {
            if (this.mOnPanelClosedBypassEnabled) {
                getWrapped().onPanelClosed(i2, menu);
            } else {
                super.onPanelClosed(i2, menu);
                AppCompatDelegateImpl.this.onPanelClosed(i2);
            }
        }

        final android.view.ActionMode startAsSupportActionMode(ActionMode.Callback callback) throws Throwable {
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(AppCompatDelegateImpl.this.mContext, callback);
            androidx.appcompat.view.ActionMode actionModeStartSupportActionMode = AppCompatDelegateImpl.this.startSupportActionMode(callbackWrapper);
            if (actionModeStartSupportActionMode != null) {
                return callbackWrapper.getActionModeWrapper(actionModeStartSupportActionMode);
            }
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            if (AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled() && i2 == 0) {
                return startAsSupportActionMode(callback);
            }
            return super.onWindowStartingActionMode(callback, i2);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            PanelFeatureState panelState = AppCompatDelegateImpl.this.getPanelState(0, true);
            if (panelState != null && panelState.menu != null) {
                super.onProvideKeyboardShortcuts(list, panelState.menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            }
        }

        public void bypassOnContentChanged(Window.Callback callback) {
            try {
                this.mOnContentChangedBypassEnabled = true;
                callback.onContentChanged();
            } finally {
                this.mOnContentChangedBypassEnabled = false;
            }
        }

        public boolean bypassDispatchKeyEvent(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.mDispatchKeyEventBypassEnabled = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.mDispatchKeyEventBypassEnabled = false;
            }
        }

        public void bypassOnPanelClosed(Window.Callback callback, int i2, Menu menu) {
            try {
                this.mOnPanelClosedBypassEnabled = true;
                callback.onPanelClosed(i2, menu);
            } finally {
                this.mOnPanelClosedBypassEnabled = false;
            }
        }
    }

    abstract class AutoNightModeManager {
        private BroadcastReceiver mReceiver;

        abstract IntentFilter createIntentFilterForBroadcastReceiver();

        abstract int getApplyableNightMode();

        abstract void onChange();

        AutoNightModeManager() {
        }

        void setup() throws Throwable {
            cleanup();
            IntentFilter intentFilterCreateIntentFilterForBroadcastReceiver = createIntentFilterForBroadcastReceiver();
            if (intentFilterCreateIntentFilterForBroadcastReceiver != null && intentFilterCreateIntentFilterForBroadcastReceiver.countActions() != 0) {
                if (this.mReceiver == null) {
                    this.mReceiver = new BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.1
                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            AutoNightModeManager.this.onChange();
                        }
                    };
                }
                Context context = AppCompatDelegateImpl.this.mContext;
                Object[] objArr = {this.mReceiver, intentFilterCreateIntentFilterForBroadcastReceiver};
                Method method = Class.forName(Wg.vd("(4-::31y2=?D8@I\u0002y%', 21", (short) (ZN.Xd() ^ 19006))).getMethod(C1561oA.ud("*\u001c\u001d\u001e''\u0017#\u0002\u0014\u0011\u0012\u0015!\u000f\u001b", (short) (C1499aX.Xd() ^ (-20809))), Class.forName(Qg.kd("eqfsohb+_jhm]ej#6eaRTRO``=OLMP\\JV", (short) (OY.Xd() ^ 8677), (short) (OY.Xd() ^ 5315))), Class.forName(hg.Vd("u\u0002v\u0004\u007fxr;ozx}muz3MqvfnsDfho_k", (short) (C1633zX.Xd() ^ (-14170)), (short) (C1633zX.Xd() ^ (-2883)))));
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }

        void cleanup() throws Throwable {
            if (this.mReceiver != null) {
                try {
                    Context context = AppCompatDelegateImpl.this.mContext;
                    BroadcastReceiver broadcastReceiver = this.mReceiver;
                    Class<?> cls = Class.forName(C1561oA.Kd("\u0010\u001e\u0015$\"\u001d\u0019c\u001a''. *1k\u0002//6(<9", (short) (C1607wl.Xd() ^ 6879)));
                    Class<?>[] clsArr = new Class[1];
                    short sXd = (short) (ZN.Xd() ^ 7353);
                    short sXd2 = (short) (ZN.Xd() ^ 13711);
                    int[] iArr = new int["SeC>\u001b\u0001b\u0018=&\r~NC2W[\u0007kI-\u0018}zk%!\u000bk[P,)".length()];
                    QB qb = new QB("SeC>\u001b\u0001b\u0018=&\r~NC2W[\u0007kI-\u0018}zk%!\u000bk[P,)");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                        i2++;
                    }
                    clsArr[0] = Class.forName(new String(iArr, 0, i2));
                    Object[] objArr = {broadcastReceiver};
                    Method method = cls.getMethod(C1561oA.Xd("MGL@CFQSES4HGJO]M[", (short) (C1580rY.Xd() ^ (-5968))), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(context, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (IllegalArgumentException unused) {
                }
                this.mReceiver = null;
            }
        }

        boolean isListening() {
            return this.mReceiver != null;
        }
    }

    private class AutoTimeNightModeManager extends AutoNightModeManager {
        private final TwilightManager mTwilightManager;

        AutoTimeNightModeManager(TwilightManager twilightManager) {
            super();
            this.mTwilightManager = twilightManager;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getApplyableNightMode() {
            return this.mTwilightManager.isNight() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void onChange() {
            AppCompatDelegateImpl.this.applyDayNight();
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        IntentFilter createIntentFilterForBroadcastReceiver() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }
    }

    private class AutoBatteryNightModeManager extends AutoNightModeManager {
        private final PowerManager mPowerManager;

        AutoBatteryNightModeManager(Context context) throws Throwable {
            super();
            Class<?> cls = Class.forName(C1561oA.od("P\\Q^ZSM\u0016JUSXHPU\u000e\"MKP@RM", (short) (Od.Xd() ^ (-12601))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (FB.Xd() ^ 11568);
            int[] iArr = new int["wv\u0007T\u0005\u0006\u0003\u0001{z\u000f\u0005\f\fa\u000f\u000f\u0016\b\u001c\u0019".length()];
            QB qb = new QB("wv\u0007T\u0005\u0006\u0003\u0001{z\u000f\u0005\f\fa\u000f\u000f\u0016\b\u001c\u0019");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                String strZd = Wg.Zd("sMP\u001d%", (short) (Od.Xd() ^ (-11589)), (short) (Od.Xd() ^ (-28506)));
                Class<?> cls2 = Class.forName(C1561oA.Xd("BPGVTOK\u0016LYY`R\\c\u001e4aahZnk", (short) (OY.Xd() ^ 15519)));
                Class<?>[] clsArr2 = {Class.forName(Wg.vd("OE]G\u0017TLXT\u001aBbcYaY", (short) (C1607wl.Xd() ^ 28228)))};
                Object[] objArr2 = {strZd};
                short sXd2 = (short) (C1499aX.Xd() ^ (-2749));
                short sXd3 = (short) (C1499aX.Xd() ^ (-28597));
                int[] iArr2 = new int["\u0014\u0011\u001f|\"\u001b\u001b\u000b\u0012v\b\u0014\u0017\t\u0002\u0003".length()];
                QB qb2 = new QB("\u0014\u0011\u001f|\"\u001b\u001b\u000b\u0012v\b\u0014\u0017\t\u0002\u0003");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                    i3++;
                }
                Method method2 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                try {
                    method2.setAccessible(true);
                    this.mPowerManager = (PowerManager) method2.invoke(context2, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getApplyableNightMode() {
            return Api21Impl.isPowerSaveMode(this.mPowerManager) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void onChange() {
            AppCompatDelegateImpl.this.applyDayNight();
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        IntentFilter createIntentFilterForBroadcastReceiver() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return new ActionBarDrawableToggleImpl();
    }

    /* JADX INFO: loaded from: classes2.dex */
    private class ActionBarDrawableToggleImpl implements ActionBarDrawerToggle.Delegate {
        ActionBarDrawableToggleImpl() {
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Drawable getThemeUpIndicator() {
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), (AttributeSet) null, new int[]{androidx.appcompat.R.attr.homeAsUpIndicator});
            Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(0);
            tintTypedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            return AppCompatDelegateImpl.this.getActionBarThemedContext();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() throws Throwable {
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            return (supportActionBar == null || (supportActionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i2) throws Throwable {
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeAsUpIndicator(drawable);
                supportActionBar.setHomeActionContentDescription(i2);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i2) throws Throwable {
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeActionContentDescription(i2);
            }
        }
    }

    private static Configuration generateConfigDelta(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            if (configuration.fontScale != configuration2.fontScale) {
                configuration3.fontScale = configuration2.fontScale;
            }
            if (configuration.mcc != configuration2.mcc) {
                configuration3.mcc = configuration2.mcc;
            }
            if (configuration.mnc != configuration2.mnc) {
                configuration3.mnc = configuration2.mnc;
            }
            Api24Impl.generateConfigDelta_locale(configuration, configuration2, configuration3);
            if (configuration.touchscreen != configuration2.touchscreen) {
                configuration3.touchscreen = configuration2.touchscreen;
            }
            if (configuration.keyboard != configuration2.keyboard) {
                configuration3.keyboard = configuration2.keyboard;
            }
            if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                configuration3.keyboardHidden = configuration2.keyboardHidden;
            }
            if (configuration.navigation != configuration2.navigation) {
                configuration3.navigation = configuration2.navigation;
            }
            if (configuration.navigationHidden != configuration2.navigationHidden) {
                configuration3.navigationHidden = configuration2.navigationHidden;
            }
            if (configuration.orientation != configuration2.orientation) {
                configuration3.orientation = configuration2.orientation;
            }
            if ((-1) - (((-1) - configuration.screenLayout) | ((-1) - 15)) != (-1) - (((-1) - configuration2.screenLayout) | ((-1) - 15))) {
                int i2 = configuration3.screenLayout;
                int i3 = configuration2.screenLayout;
                int i4 = (i3 + 15) - (i3 | 15);
                configuration3.screenLayout = (i2 + i4) - (i2 & i4);
            }
            int i5 = configuration.screenLayout;
            int i6 = (i5 + 192) - (i5 | 192);
            int i7 = configuration2.screenLayout;
            if (i6 != (i7 + 192) - (i7 | 192)) {
                configuration3.screenLayout |= (-1) - (((-1) - configuration2.screenLayout) | ((-1) - 192));
            }
            if ((-1) - (((-1) - configuration.screenLayout) | ((-1) - 48)) != (-1) - (((-1) - configuration2.screenLayout) | ((-1) - 48))) {
                configuration3.screenLayout |= configuration2.screenLayout & 48;
            }
            int i8 = (-1) - (((-1) - configuration.screenLayout) | ((-1) - 768));
            int i9 = configuration2.screenLayout;
            if (i8 != (i9 + 768) - (i9 | 768)) {
                int i10 = configuration3.screenLayout;
                int i11 = (-1) - (((-1) - configuration2.screenLayout) | ((-1) - 768));
                configuration3.screenLayout = (i10 + i11) - (i10 & i11);
            }
            Api26Impl.generateConfigDelta_colorMode(configuration, configuration2, configuration3);
            if ((-1) - (((-1) - configuration.uiMode) | ((-1) - 15)) != (-1) - (((-1) - configuration2.uiMode) | ((-1) - 15))) {
                configuration3.uiMode |= configuration2.uiMode & 15;
            }
            if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                configuration3.uiMode |= configuration2.uiMode & 48;
            }
            if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                configuration3.screenWidthDp = configuration2.screenWidthDp;
            }
            if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                configuration3.screenHeightDp = configuration2.screenHeightDp;
            }
            if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                configuration3.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
            }
            if (configuration.densityDpi != configuration2.densityDpi) {
                configuration3.densityDpi = configuration2.densityDpi;
            }
        }
        return configuration3;
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static boolean isPowerSaveMode(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String toLanguageTag(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void generateConfigDelta_locale(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static LocaleListCompat getLocales(Configuration configuration) {
            return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }

        static void setLocales(Configuration configuration, LocaleListCompat localeListCompat) {
            configuration.setLocales(LocaleList.forLanguageTags(localeListCompat.toLanguageTags()));
        }

        public static void setDefaultLocales(LocaleListCompat localeListCompat) {
            LocaleList.setDefault(LocaleList.forLanguageTags(localeListCompat.toLanguageTags()));
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static void generateConfigDelta_colorMode(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.colorMode;
            if ((i2 + 3) - (i2 | 3) != (-1) - (((-1) - configuration2.colorMode) | ((-1) - 3))) {
                configuration3.colorMode |= (-1) - (((-1) - configuration2.colorMode) | ((-1) - 3));
            }
            int i3 = (-1) - (((-1) - configuration.colorMode) | ((-1) - 12));
            int i4 = configuration2.colorMode;
            if (i3 != (i4 + 12) - (i4 | 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static OnBackInvokedCallback registerOnBackPressedCallback(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticLambda0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() throws Throwable {
                    appCompatDelegateImpl.onBackPressed();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void unregisterOnBackInvokedCallback(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }

        static OnBackInvokedDispatcher getOnBackInvokedDispatcher(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }
}
