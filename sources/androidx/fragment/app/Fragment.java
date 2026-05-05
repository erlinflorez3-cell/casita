package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.arch.core.util.Function;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.LayoutInflaterCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.dynatrace.android.agent.Global;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
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

/* JADX INFO: loaded from: classes4.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ActivityResultCaller {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    AnimationInfo mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    ViewModelProvider.Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    FragmentHostCallback<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    LifecycleRegistry mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<OnPreAttachedListener> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final OnPreAttachedListener mSavedStateAttachListener;
    SavedStateRegistryController mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    FragmentViewLifecycleOwner mViewLifecycleOwner;
    MutableLiveData<LifecycleOwner> mViewLifecycleOwnerLiveData;
    String mWho;

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i2, boolean z2, int i3) {
        return null;
    }

    public Animator onCreateAnimator(int i2, boolean z2, int i3) {
        return null;
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onHiddenChanged(boolean z2) {
    }

    public void onMultiWindowModeChanged(boolean z2) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z2) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z2) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$1 */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    private static abstract class OnPreAttachedListener {
        abstract void onPreAttached();

        private OnPreAttachedListener() {
        }

        /* synthetic */ OnPreAttachedListener(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$2 */
    class AnonymousClass2 extends OnPreAttachedListener {
        AnonymousClass2() {
        }

        @Override // androidx.fragment.app.Fragment.OnPreAttachedListener
        void onPreAttached() {
            Fragment.this.mSavedStateRegistryController.performAttach();
            SavedStateHandleSupport.enableSavedStateHandles(Fragment.this);
            Fragment.this.mSavedStateRegistryController.performRestore(Fragment.this.mSavedFragmentState != null ? Fragment.this.mSavedFragmentState.getBundle("registryState") : null);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public LifecycleOwner getViewLifecycleOwner() {
        FragmentViewLifecycleOwner fragmentViewLifecycleOwner = this.mViewLifecycleOwner;
        if (fragmentViewLifecycleOwner != null) {
            return fragmentViewLifecycleOwner;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == Lifecycle.State.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        return this.mFragmentManager.getViewModelStore(this);
    }

    private int getMinimumMaxLifecycleState() {
        if (this.mMaxState == Lifecycle.State.INITIALIZED || this.mParentFragment == null) {
            return this.mMaxState.ordinal();
        }
        return Math.min(this.mMaxState.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() throws Throwable {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException(ZO.xd("\\\u0014R.T\u000b9QY\u001d\u007f.:\u0013pD7q(S2rP+C\n\u00151,\u0010ny\u0001LWL\u0014\u001b\u0016\\~z\u000bV\\0", (short) (Od.Xd() ^ (-20326)), (short) (Od.Xd() ^ (-30144))));
        }
        if (this.mDefaultFactory == null) {
            Context contextRequireContext = requireContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("\n\u0016\u000b\u0018\u0014\r\u0007O\u0004\u000f\r\u0012\u0002\n\u000fG[\u0007\u0005\ny\f\u0007", (short) (FB.Xd() ^ 24135), (short) (FB.Xd() ^ 21175))).getMethod(hg.Vd("*'5\u0001/.)%\u001e\u001b-!&$w#!&\u0016(#", (short) (C1607wl.Xd() ^ 22606), (short) (C1607wl.Xd() ^ 24944)), new Class[0]);
            try {
                method.setAccessible(true);
                Context baseContext = (Context) method.invoke(contextRequireContext, objArr);
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    }
                    if (baseContext instanceof Application) {
                        application = (Application) baseContext;
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
                if (application == null && FragmentManager.isLoggingEnabled(3)) {
                    StringBuilder sb = new StringBuilder(C1561oA.ud("\\\b\r\u0003y4\u0002\u0002\u00060uw{p+Kyxsohewkpn\u001fgkoo[g[\\\u0016[fb_\u00113^\\aQc^\t", (short) (FB.Xd() ^ 11118)));
                    Context contextRequireContext2 = requireContext();
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.yd("v\u0003{\t\t\u0002\u007fHp{}\u0003v~\b@Hsuzn\u0001\u007f", (short) (C1499aX.Xd() ^ (-2603)))).getMethod(C1561oA.Yd("\u0017\u0016&s$%\" \u001b\u001a.$++\u0001..5';8", (short) (ZN.Xd() ^ 7426)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        sb.append((Context) method2.invoke(contextRequireContext2, objArr2)).append(Xg.qd("#\u0018rip\u001ctgkl!phii&Jznk\u007fu||T\t\u0006\u0005t\b5\u000b\u00078\u000f\u000e\u0001<^\r\u0004\u0013\u0011\f\bz\u000f\f\u001fu\u0019\u000f\u0011\u0019M&\u0019%\u001aR(\u001d\u001bV\u001c\u001e \u001c1)2^\u0016*':\u00114*,4\u0019<:B624B~\u001847IEIQ", (short) (C1580rY.Xd() ^ (-27037)), (short) (C1580rY.Xd() ^ (-23788)))).toString();
                        Jg.Wd("(g\u00196 x\u0007b\u001eE\u0006\u000exHX", (short) (FB.Xd() ^ 13466), (short) (FB.Xd() ^ 4071));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                this.mDefaultFactory = new SavedStateViewModelFactory(application, this, getArguments());
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() throws Throwable {
        Application application;
        Context contextRequireContext = requireContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("IUJWSLF\u000fCNLQAIN\u0007\u001bFDI9KF", (short) (C1580rY.Xd() ^ (-20176)))).getMethod(C1593ug.zd("\u0015\u0014$q\"# \u001e\u0019\u0018,\"))~,,3%96", (short) (C1499aX.Xd() ^ (-20043)), (short) (C1499aX.Xd() ^ (-16221))), new Class[0]);
        try {
            method.setAccessible(true);
            Context baseContext = (Context) method.invoke(contextRequireContext, objArr);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (baseContext instanceof Application) {
                    application = (Application) baseContext;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (application == null && FragmentManager.isLoggingEnabled(3)) {
                StringBuilder sb = new StringBuilder(C1561oA.od("\u0017BG=4n<<@j026+e\u000643.*# 2&+)Y\"&**\u0016\"\u0016\u0017P\u0016!\u001d\u001aKm\u0019\u0017\u001c\f\u001e\u0019C", (short) (C1499aX.Xd() ^ (-28051))));
                Context contextRequireContext2 = requireContext();
                short sXd = (short) (Od.Xd() ^ (-6744));
                int[] iArr = new int["'5,;940z1>>E7AH\u0003\u0019FFM?SP".length()];
                QB qb = new QB("'5,;940z1>>E7AH\u0003\u0019FFM?SP");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                    i2++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.Zd(",\u0010\u0004r\u00177Zwf\u0007~UPo+wk\u0015*\u001eP", (short) (ZN.Xd() ^ 3625), (short) (ZN.Xd() ^ 22154)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    sb.append((Context) method2.invoke(contextRequireContext2, objArr2)).append(C1561oA.Xd("\u0011\u0006`W^\nbUYZ\u000f^`f\u0013VZ\u0016XZe_\u001bpl\u001etsf\"Drixvqm`tq\u0005[~tv~3\f~\u000b\u007f8\u000e\u0003\u0001<\u0002\u0004\u0006\u0002\u0017\u000f\u0018D{\u0010\r v\u001a\u0010\u0012\u001a~\" (\u001c\u0018\u001a(d}\u001a\u001d/+/7", (short) (C1607wl.Xd() ^ 5054))).toString();
                    Wg.vd("\u00050\u001e#0'/4\u0004\u0017#\u0015\"\u001f+", (short) (C1633zX.Xd() ^ (-6641)));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
            if (application != null) {
                mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
            }
            mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
            mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
            if (getArguments() != null) {
                mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, getArguments());
            }
            return mutableCreationExtras;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.fragment.app.Fragment.SavedState.1
            AnonymousClass1() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };
        final Bundle mState;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        SavedState(Bundle bundle) {
            this.mState = bundle;
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.mState = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeBundle(this.mState);
        }

        /* JADX INFO: renamed from: androidx.fragment.app.Fragment$SavedState$1 */
        class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            AnonymousClass1() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }
    }

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new Runnable() { // from class: androidx.fragment.app.Fragment.1
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                Fragment.this.startPostponedEnterTransition();
            }
        };
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new MutableLiveData<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new OnPreAttachedListener() { // from class: androidx.fragment.app.Fragment.2
            AnonymousClass2() {
            }

            @Override // androidx.fragment.app.Fragment.OnPreAttachedListener
            void onPreAttached() {
                Fragment.this.mSavedStateRegistryController.performAttach();
                SavedStateHandleSupport.enableSavedStateHandles(Fragment.this);
                Fragment.this.mSavedStateRegistryController.performRestore(Fragment.this.mSavedFragmentState != null ? Fragment.this.mSavedFragmentState.getBundle("registryState") : null);
            }
        };
        initLifecycle();
    }

    public Fragment(int i2) {
        this();
        this.mContentLayoutId = i2;
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = SavedStateRegistryController.create(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) throws Throwable {
        String strUd = C1561oA.ud("; l_ha\u001bmnj\\\u0016X`Ted\u0010]OZQ\u000bOaQZZX\u0010\u0003KT\u007fOS?HD=\u0005w8D9s;3Do0<l18:=Af)426635\"2,.Z.!\u0019+U\u001e'R\"&\u0012\u001b\u0017\u0010", (short) (OY.Xd() ^ 17295));
        String strYd = C1561oA.yd("\u0014.\"$/)d:6g28>@.<C92F8s;H8?F?IP|", (short) (FB.Xd() ^ ExifDirectoryBase.TAG_SAMPLE_FORMAT));
        short sXd = (short) (C1499aX.Xd() ^ (-29816));
        int[] iArr = new int["\u0003\u0011\b\u0017\u0015\u0010\fV\r\u001a\u001a!\u0013\u001d$^t\"\")\u001b/,".length()];
        QB qb = new QB("\u0003\u0011\b\u0017\u0015\u0010\fV\r\u001a\u001a!\u0013\u001d$^t\"\")\u001b/,");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Xg.qd("\u0018\u0017'v!\u0017*+\u0005)\u001c \"0", (short) (ZN.Xd() ^ 22176), (short) (ZN.Xd() ^ 11937)), new Class[0]);
            try {
                method.setAccessible(true);
                Fragment fragmentNewInstance = FragmentFactory.loadFragmentClass((ClassLoader) method.invoke(context, objArr), str).getConstructor(new Class[0]).newInstance(new Object[0]);
                if (bundle != null) {
                    bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                    fragmentNewInstance.setArguments(bundle);
                }
                return fragmentNewInstance;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalAccessException e3) {
            throw new InstantiationException(strYd + str + strUd, e3);
        } catch (java.lang.InstantiationException e4) {
            throw new InstantiationException(strYd + str + strUd, e4);
        } catch (NoSuchMethodException e5) {
            StringBuilder sbAppend = new StringBuilder(strYd).append(str);
            short sXd2 = (short) (ZN.Xd() ^ 28817);
            short sXd3 = (short) (ZN.Xd() ^ 6411);
            int[] iArr2 = new int["9\u0013PV\u0011ssb*<\u0002Bc\u001bt\u0018z/ZT'u\u0002[\fq+WGR.\u001a\u0012XW@a".length()];
            QB qb2 = new QB("9\u0013PV\u0011ssb*<\u0002Bc\u001bt\u0018z/ZT'u\u0002[\fq+WGR.\u001a\u0012XW@a");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                i3++;
            }
            throw new InstantiationException(sbAppend.append(new String(iArr2, 0, i3)).toString(), e5);
        } catch (InvocationTargetException e6) {
            StringBuilder sbAppend2 = new StringBuilder(strYd).append(str);
            short sXd4 = (short) (FB.Xd() ^ 20828);
            short sXd5 = (short) (FB.Xd() ^ 6667);
            int[] iArr3 = new int["'\u000f.qXV5wT\t\r|GQ5hWYfgOT5sSR&rKR[b>N0_@y\u0017iv@/U=D&^@C".length()];
            QB qb3 = new QB("'\u000f.qXV5wT\t\r|GQ5hWYfgOT5sSR&rKR[b>N0_@y\u0017iv@/U=D&^@C");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd5) ^ sXd4));
                i4++;
            }
            throw new InstantiationException(sbAppend2.append(new String(iArr3, 0, i4)).toString(), e6);
        }
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        }
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final String getTag() {
        return this.mTag;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.isStateSaved();
    }

    public void setInitialSavedState(SavedState savedState) {
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        this.mSavedFragmentState = (savedState == null || savedState.mState == null) ? null : savedState.mState;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i2) {
        if (fragment != null) {
            FragmentStrictMode.onSetTargetFragmentUsage(this, fragment, i2);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
                if (targetFragment.equals(this)) {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            } else {
                this.mTargetWho = null;
                this.mTarget = fragment;
            }
            this.mTargetRequestCode = i2;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    private Fragment getTargetFragment(boolean z2) {
        String str;
        if (z2) {
            FragmentStrictMode.onGetTargetFragmentUsage(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.findActiveFragment(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.onGetTargetFragmentRequestCodeUsage(this);
        return this.mTargetRequestCode;
    }

    public Context getContext() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.getContext();
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final FragmentActivity getActivity() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return (FragmentActivity) fragmentHostCallback.getActivity();
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Object getHost() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.onGetHost();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Resources getResources() throws Throwable {
        Context contextRequireContext = requireContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("\"Xv;|>(!H\tcfad7B9\u0003\u000f\u0014fVk", (short) (C1580rY.Xd() ^ (-24684)), (short) (C1580rY.Xd() ^ (-32463)))).getMethod(Ig.wd("6\u0007&\u001dN(\nU,\u001a\u0018N", (short) (C1499aX.Xd() ^ (-26208))), new Class[0]);
        try {
            method.setAccessible(true);
            return (Resources) method.invoke(contextRequireContext, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final CharSequence getText(int i2) {
        return getResources().getText(i2);
    }

    public final String getString(int i2) {
        return getResources().getString(i2);
    }

    public final String getString(int i2, Object... objArr) {
        return getResources().getString(i2, objArr);
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
        }
        return this.mChildFragmentManager;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        return this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.isParentHidden(this.mParentFragment));
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.isParentMenuVisible(this.mParentFragment));
    }

    @Deprecated
    public void setRetainInstance(boolean z2) {
        FragmentStrictMode.onSetRetainInstanceUsage(this);
        this.mRetainInstance = z2;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z2) {
            fragmentManager.addRetainedFragment(this);
        } else {
            fragmentManager.removeRetainedFragment(this);
        }
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.onGetRetainInstanceUsage(this);
        return this.mRetainInstance;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z2) {
        if (this.mHasMenu != z2) {
            this.mHasMenu = z2;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.onSupportInvalidateOptionsMenu();
        }
    }

    public void setMenuVisibility(boolean z2) {
        if (this.mMenuVisible != z2) {
            this.mMenuVisible = z2;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.onSupportInvalidateOptionsMenu();
            }
        }
    }

    @Deprecated
    public void setUserVisibleHint(boolean z2) {
        FragmentStrictMode.onSetUserVisibleHint(this, z2);
        if (!this.mUserVisibleHint && z2 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.performPendingDeferredStart(fragmentManager.createOrGetFragmentStateManager(this));
        }
        this.mUserVisibleHint = z2;
        this.mDeferStart = this.mState < 5 && !z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z2);
        }
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Deprecated
    public LoaderManager getLoaderManager() {
        return LoaderManager.getInstance(this);
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        fragmentHostCallback.onStartActivityFromFragment(this, intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2) {
        startActivityForResult(intent, i2, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        getParentFragmentManager().launchStartActivityForResult(this, intent, i2, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            String str = "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i2 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle;
        }
        getParentFragmentManager().launchStartIntentSenderForResult(this, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (FragmentManager.isLoggingEnabled(2)) {
            String str = "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent;
        }
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i2) {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        getParentFragmentManager().launchRequestPermissions(this, strArr, i2);
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            return fragmentHostCallback.onShouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater = fragmentHostCallback.onGetLayoutInflater();
        LayoutInflaterCompat.setFactory2(layoutInflaterOnGetLayoutInflater, this.mChildFragmentManager.getLayoutInflaterFactory());
        return layoutInflaterOnGetLayoutInflater;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        Activity activity = fragmentHostCallback == null ? null : fragmentHostCallback.getActivity();
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        Activity activity = fragmentHostCallback == null ? null : fragmentHostCallback.getActivity();
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (this.mChildFragmentManager.isStateAtLeast(1)) {
            return;
        }
        this.mChildFragmentManager.dispatchCreate();
    }

    void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.restoreSaveStateInternal(bundle);
        this.mChildFragmentManager.dispatchCreate();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    public View getView() {
        return this.mView;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().mEnterTransitionCallback = sharedElementCallback;
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().mExitTransitionCallback = sharedElementCallback;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().mEnterTransition = obj;
    }

    public Object getEnterTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mEnterTransition;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().mReturnTransition = obj;
    }

    public Object getReturnTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mReturnTransition == USE_DEFAULT_TRANSITION ? getEnterTransition() : this.mAnimationInfo.mReturnTransition;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().mExitTransition = obj;
    }

    public Object getExitTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mExitTransition;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().mReenterTransition = obj;
    }

    public Object getReenterTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mReenterTransition == USE_DEFAULT_TRANSITION ? getExitTransition() : this.mAnimationInfo.mReenterTransition;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().mSharedElementEnterTransition = obj;
    }

    public Object getSharedElementEnterTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mSharedElementEnterTransition;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().mSharedElementReturnTransition = obj;
    }

    public Object getSharedElementReturnTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mSharedElementReturnTransition == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : this.mAnimationInfo.mSharedElementReturnTransition;
    }

    public void setAllowEnterTransitionOverlap(boolean z2) {
        ensureAnimationInfo().mAllowEnterTransitionOverlap = Boolean.valueOf(z2);
    }

    public boolean getAllowEnterTransitionOverlap() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null || animationInfo.mAllowEnterTransitionOverlap == null) {
            return true;
        }
        return this.mAnimationInfo.mAllowEnterTransitionOverlap.booleanValue();
    }

    public void setAllowReturnTransitionOverlap(boolean z2) {
        ensureAnimationInfo().mAllowReturnTransitionOverlap = Boolean.valueOf(z2);
    }

    public boolean getAllowReturnTransitionOverlap() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null || animationInfo.mAllowReturnTransitionOverlap == null) {
            return true;
        }
        return this.mAnimationInfo.mAllowReturnTransitionOverlap.booleanValue();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().mEnterTransitionPostponed = true;
    }

    public final void postponeEnterTransition(long j2, TimeUnit timeUnit) throws Throwable {
        ensureAnimationInfo().mEnterTransitionPostponed = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.getHost().getHandler();
        } else {
            short sXd = (short) (C1580rY.Xd() ^ (-15838));
            int[] iArr = new int["3yQ?d$C\u0014)\u0001QU(\u001a;\u0016H".length()];
            QB qb = new QB("3yQ?d$C\u0014)\u0001QU(\u001a;\u0016H");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Qd("\r\n\u0018o\u0003\n\u000ej\r\f\f\u007f\f", (short) (C1633zX.Xd() ^ (-18403))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                this.mPostponedHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        Handler handler2 = this.mPostponedHandler;
        Runnable runnable = this.mPostponedDurationRunnable;
        long millis = timeUnit.toMillis(j2);
        short sXd2 = (short) (OY.Xd() ^ 21461);
        short sXd3 = (short) (OY.Xd() ^ 22931);
        int[] iArr2 = new int["u\u0004z\n\b\u0003~I\f\u0011Lg\u0002\u0010\u0007\u0010\n\u0018".length()];
        QB qb2 = new QB("u\u0004z\n\b\u0003~I\f\u0011Lg\u0002\u0010\u0007\u0010\n\u0018");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = {Class.forName(C1561oA.od("aWkU!^R^V\u001c?aYXJJSK", (short) (C1633zX.Xd() ^ (-23283)))), Long.TYPE};
        Object[] objArr2 = {runnable, Long.valueOf(millis)};
        Method method = cls.getMethod(C1561oA.Kd("**/1\u0002$,\";((", (short) (C1580rY.Xd() ^ (-30603))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler2, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public void startPostponedEnterTransition() throws Throwable {
        if (this.mAnimationInfo != null && ensureAnimationInfo().mEnterTransitionPostponed) {
            if (this.mHost == null) {
                ensureAnimationInfo().mEnterTransitionPostponed = false;
                return;
            }
            if (Looper.myLooper() != this.mHost.getHandler().getLooper()) {
                Handler handler = this.mHost.getHandler();
                Object[] objArr = {new Runnable() { // from class: androidx.fragment.app.Fragment.3
                    AnonymousClass3() {
                    }

                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        Fragment.this.callStartTransitionListener(false);
                    }
                }};
                Method method = Class.forName(Wg.Zd("r\u0015\u0012gkl/}F\u0012S\u0005Sgr22F", (short) (ZN.Xd() ^ 3447), (short) (ZN.Xd() ^ 31645))).getMethod(Wg.vd("!\u001f&&m t (&/\t\u001b\u0005,\u001b6%", (short) (Od.Xd() ^ (-593))), Class.forName(C1561oA.Xd("\u0001x\u000fzH\b}\f\u0006Mr\u0017\u0011\u0012\u0006\b\u0013\r", (short) (C1607wl.Xd() ^ 10231))));
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            callStartTransitionListener(true);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$3 */
    class AnonymousClass3 implements Runnable {
        AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    void callStartTransitionListener(boolean z2) throws Throwable {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo != null) {
            animationInfo.mEnterTransitionPostponed = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        SpecialEffectsController orCreateController = SpecialEffectsController.getOrCreateController(viewGroup, fragmentManager);
        orCreateController.markPostponedState();
        if (z2) {
            Handler handler = this.mHost.getHandler();
            AnonymousClass4 anonymousClass4 = new Runnable() { // from class: androidx.fragment.app.Fragment.4
                final /* synthetic */ SpecialEffectsController val$controller;

                AnonymousClass4(SpecialEffectsController orCreateController2) {
                    specialEffectsController = orCreateController2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    specialEffectsController.executePendingOperations();
                }
            };
            short sXd = (short) (C1633zX.Xd() ^ (-24074));
            short sXd2 = (short) (C1633zX.Xd() ^ (-30733));
            int[] iArr = new int["|_v9Wq\u0018fDtyIbqN-\u001d.".length()];
            QB qb = new QB("|_v9Wq\u0018fDtyIbqN-\u001d.");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = {anonymousClass4};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(EO.Od("\u001dsy\u0016", (short) (C1499aX.Xd() ^ (-27229))), Class.forName(Ig.wd("o afizM\u0019B{ 'PT9#Sh", (short) (FB.Xd() ^ 6698))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            orCreateController2.executePendingOperations();
        }
        Handler handler2 = this.mPostponedHandler;
        if (handler2 != null) {
            handler2.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$4 */
    class AnonymousClass4 implements Runnable {
        final /* synthetic */ SpecialEffectsController val$controller;

        AnonymousClass4(SpecialEffectsController orCreateController2) {
            specialEffectsController = orCreateController2;
        }

        @Override // java.lang.Runnable
        public void run() {
            specialEffectsController.executePendingOperations();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            LoaderManager.getInstance(this).dump(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + Global.COLON);
        this.mChildFragmentManager.dump(str + "  ", fileDescriptor, printWriter, strArr);
    }

    Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.findFragmentByWho(str);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$5 */
    class AnonymousClass5 extends FragmentContainer {
        AnonymousClass5() {
        }

        @Override // androidx.fragment.app.FragmentContainer
        public View onFindViewById(int i2) {
            if (Fragment.this.mView == null) {
                throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
            }
            return Fragment.this.mView.findViewById(i2);
        }

        @Override // androidx.fragment.app.FragmentContainer
        public boolean onHasView() {
            return Fragment.this.mView != null;
        }
    }

    FragmentContainer createFragmentContainer() {
        return new FragmentContainer() { // from class: androidx.fragment.app.Fragment.5
            AnonymousClass5() {
            }

            @Override // androidx.fragment.app.FragmentContainer
            public View onFindViewById(int i2) {
                if (Fragment.this.mView == null) {
                    throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
                }
                return Fragment.this.mView.findViewById(i2);
            }

            @Override // androidx.fragment.app.FragmentContainer
            public boolean onHasView() {
                return Fragment.this.mView != null;
            }
        };
    }

    void performAttach() {
        Iterator<OnPreAttachedListener> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().onPreAttached();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.attachController(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.getContext());
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onAttach()");
        }
        this.mFragmentManager.dispatchOnAttachFragment(this);
        this.mChildFragmentManager.dispatchAttach();
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new LifecycleEventObserver() { // from class: androidx.fragment.app.Fragment.6
            AnonymousClass6() {
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event != Lifecycle.Event.ON_STOP || Fragment.this.mView == null) {
                    return;
                }
                Api19Impl.cancelPendingInputEvents(Fragment.this.mView);
            }
        });
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onCreate()");
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$6 */
    class AnonymousClass6 implements LifecycleEventObserver {
        AnonymousClass6() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event != Lifecycle.Event.ON_STOP || Fragment.this.mView == null) {
                return;
            }
            Api19Impl.cancelPendingInputEvents(Fragment.this.mView);
        }
    }

    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new FragmentViewLifecycleOwner(this, getViewModelStore(), new Runnable() { // from class: androidx.fragment.app.Fragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m6943lambda$performCreateView$0$androidxfragmentappFragment();
            }
        });
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView != null) {
            this.mViewLifecycleOwner.initialize();
            if (FragmentManager.isLoggingEnabled(3)) {
                String str = "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this;
            }
            ViewTreeLifecycleOwner.set(this.mView, this.mViewLifecycleOwner);
            ViewTreeViewModelStoreOwner.set(this.mView, this.mViewLifecycleOwner);
            ViewTreeSavedStateRegistryOwner.set(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.isInitialized()) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.mViewLifecycleOwner = null;
    }

    /* JADX INFO: renamed from: lambda$performCreateView$0$androidx-fragment-app-Fragment */
    /* synthetic */ void m6943lambda$performCreateView$0$androidxfragmentappFragment() {
        this.mViewLifecycleOwner.performRestore(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.dispatchViewCreated();
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
        restoreViewState();
        this.mChildFragmentManager.dispatchActivityCreated();
    }

    private void restoreViewState() {
        if (FragmentManager.isLoggingEnabled(3)) {
            String str = "moveto RESTORE_VIEW_STATE: " + this;
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    void performStart() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStart()");
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_START);
        }
        this.mChildFragmentManager.dispatchStart();
    }

    void performResume() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onResume()");
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
        this.mChildFragmentManager.dispatchResume();
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.noteStateNotSaved();
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zIsPrimaryNavigation = this.mFragmentManager.isPrimaryNavigation(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zIsPrimaryNavigation) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zIsPrimaryNavigation);
            onPrimaryNavigationFragmentChanged(zIsPrimaryNavigation);
            this.mChildFragmentManager.dispatchPrimaryNavigationFragmentChanged();
        }
    }

    void performMultiWindowModeChanged(boolean z2) {
        onMultiWindowModeChanged(z2);
    }

    void performPictureInPictureModeChanged(boolean z2) {
        onPictureInPictureModeChanged(z2);
    }

    void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    void performLowMemory() {
        onLowMemory();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        int i2 = 0;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            i2 = 1;
        }
        return (-1) - (((-1) - i2) & ((-1) - (this.mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuInflater) ? 1 : 0)));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    boolean performPrepareOptionsMenu(Menu menu) {
        int i2 = 0;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            i2 = 1;
        }
        boolean zDispatchPrepareOptionsMenu = this.mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
        return (i2 + (zDispatchPrepareOptionsMenu ? 1 : 0)) - (i2 & (zDispatchPrepareOptionsMenu ? 1 : 0));
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.dispatchOptionsItemSelected(menuItem);
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.dispatchContextItemSelected(menuItem);
    }

    void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.dispatchOptionsMenuClosed(menu);
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    void performPause() {
        this.mChildFragmentManager.dispatchPause();
        if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    void performStop() {
        this.mChildFragmentManager.dispatchStop();
        if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    void performDestroyView() {
        this.mChildFragmentManager.dispatchDestroyView();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            this.mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        LoaderManager.getInstance(this).markForRedelivery();
        this.mPerformedCreateView = false;
    }

    void performDestroy() {
        this.mChildFragmentManager.dispatchDestroy();
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDetach()");
        }
        if (this.mChildFragmentManager.isDestroyed()) {
            return;
        }
        this.mChildFragmentManager.dispatchDestroy();
        this.mChildFragmentManager = new FragmentManagerImpl();
    }

    private AnimationInfo ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new AnimationInfo();
        }
        return this.mAnimationInfo;
    }

    void setAnimations(int i2, int i3, int i4, int i5) {
        if (this.mAnimationInfo == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        ensureAnimationInfo().mEnterAnim = i2;
        ensureAnimationInfo().mExitAnim = i3;
        ensureAnimationInfo().mPopEnterAnim = i4;
        ensureAnimationInfo().mPopExitAnim = i5;
    }

    int getEnterAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mEnterAnim;
    }

    int getExitAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mExitAnim;
    }

    int getPopEnterAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mPopEnterAnim;
    }

    int getPopExitAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mPopExitAnim;
    }

    boolean getPopDirection() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return false;
        }
        return animationInfo.mIsPop;
    }

    void setPopDirection(boolean z2) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().mIsPop = z2;
    }

    int getNextTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.mNextTransition;
    }

    void setNextTransition(int i2) {
        if (this.mAnimationInfo == null && i2 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.mNextTransition = i2;
    }

    ArrayList<String> getSharedElementSourceNames() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null || animationInfo.mSharedElementSourceNames == null) {
            return new ArrayList<>();
        }
        return this.mAnimationInfo.mSharedElementSourceNames;
    }

    ArrayList<String> getSharedElementTargetNames() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null || animationInfo.mSharedElementTargetNames == null) {
            return new ArrayList<>();
        }
        return this.mAnimationInfo.mSharedElementTargetNames;
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        this.mAnimationInfo.mSharedElementSourceNames = arrayList;
        this.mAnimationInfo.mSharedElementTargetNames = arrayList2;
    }

    SharedElementCallback getEnterTransitionCallback() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mEnterTransitionCallback;
    }

    SharedElementCallback getExitTransitionCallback() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mExitTransitionCallback;
    }

    View getAnimatingAway() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mAnimatingAway;
    }

    void setPostOnViewCreatedAlpha(float f2) {
        ensureAnimationInfo().mPostOnViewCreatedAlpha = f2;
    }

    float getPostOnViewCreatedAlpha() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 1.0f;
        }
        return animationInfo.mPostOnViewCreatedAlpha;
    }

    void setFocusedView(View view) {
        ensureAnimationInfo().mFocusedView = view;
    }

    View getFocusedView() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.mFocusedView;
    }

    boolean isPostponed() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return false;
        }
        return animationInfo.mEnterTransitionPostponed;
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$7 */
    class AnonymousClass7 implements Function<Void, ActivityResultRegistry> {
        AnonymousClass7() {
        }

        @Override // androidx.arch.core.util.Function
        public ActivityResultRegistry apply(Void r2) {
            if (Fragment.this.mHost instanceof ActivityResultRegistryOwner) {
                return ((ActivityResultRegistryOwner) Fragment.this.mHost).getActivityResultRegistry();
            }
            return Fragment.this.requireActivity().getActivityResultRegistry();
        }
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback) {
        return prepareCallInternal(activityResultContract, new Function<Void, ActivityResultRegistry>() { // from class: androidx.fragment.app.Fragment.7
            AnonymousClass7() {
            }

            @Override // androidx.arch.core.util.Function
            public ActivityResultRegistry apply(Void r2) {
                if (Fragment.this.mHost instanceof ActivityResultRegistryOwner) {
                    return ((ActivityResultRegistryOwner) Fragment.this.mHost).getActivityResultRegistry();
                }
                return Fragment.this.requireActivity().getActivityResultRegistry();
            }
        }, activityResultCallback);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$8 */
    class AnonymousClass8 implements Function<Void, ActivityResultRegistry> {
        final /* synthetic */ ActivityResultRegistry val$registry;

        AnonymousClass8(ActivityResultRegistry activityResultRegistry) {
            activityResultRegistry = activityResultRegistry;
        }

        @Override // androidx.arch.core.util.Function
        public ActivityResultRegistry apply(Void r2) {
            return activityResultRegistry;
        }
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultRegistry activityResultRegistry, ActivityResultCallback<O> activityResultCallback) {
        return prepareCallInternal(activityResultContract, new Function<Void, ActivityResultRegistry>() { // from class: androidx.fragment.app.Fragment.8
            final /* synthetic */ ActivityResultRegistry val$registry;

            AnonymousClass8(ActivityResultRegistry activityResultRegistry2) {
                activityResultRegistry = activityResultRegistry2;
            }

            @Override // androidx.arch.core.util.Function
            public ActivityResultRegistry apply(Void r2) {
                return activityResultRegistry;
            }
        }, activityResultCallback);
    }

    private <I, O> ActivityResultLauncher<I> prepareCallInternal(ActivityResultContract<I, O> activityResultContract, Function<Void, ActivityResultRegistry> function, ActivityResultCallback<O> activityResultCallback) {
        if (this.mState > 1) {
            throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new OnPreAttachedListener() { // from class: androidx.fragment.app.Fragment.9
            final /* synthetic */ ActivityResultCallback val$callback;
            final /* synthetic */ ActivityResultContract val$contract;
            final /* synthetic */ AtomicReference val$ref;
            final /* synthetic */ Function val$registryProvider;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(Function function2, AtomicReference atomicReference2, ActivityResultContract activityResultContract2, ActivityResultCallback activityResultCallback2) {
                super();
                function = function2;
                atomicReference = atomicReference2;
                activityResultContract = activityResultContract2;
                activityResultCallback = activityResultCallback2;
            }

            @Override // androidx.fragment.app.Fragment.OnPreAttachedListener
            void onPreAttached() {
                String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
                atomicReference.set(((ActivityResultRegistry) function.apply(null)).register(strGenerateActivityResultKey, Fragment.this, activityResultContract, activityResultCallback));
            }
        });
        return new ActivityResultLauncher<I>() { // from class: androidx.fragment.app.Fragment.10
            final /* synthetic */ ActivityResultContract val$contract;
            final /* synthetic */ AtomicReference val$ref;

            AnonymousClass10(AtomicReference atomicReference2, ActivityResultContract activityResultContract2) {
                atomicReference = atomicReference2;
                activityResultContract = activityResultContract2;
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i2, ActivityOptionsCompat activityOptionsCompat) {
                ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) atomicReference.get();
                if (activityResultLauncher == null) {
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }
                activityResultLauncher.launch(i2, activityOptionsCompat);
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) atomicReference.getAndSet(null);
                if (activityResultLauncher != null) {
                    activityResultLauncher.unregister();
                }
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public ActivityResultContract<I, ?> getContract() {
                return activityResultContract;
            }
        };
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$9 */
    class AnonymousClass9 extends OnPreAttachedListener {
        final /* synthetic */ ActivityResultCallback val$callback;
        final /* synthetic */ ActivityResultContract val$contract;
        final /* synthetic */ AtomicReference val$ref;
        final /* synthetic */ Function val$registryProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(Function function2, AtomicReference atomicReference2, ActivityResultContract activityResultContract2, ActivityResultCallback activityResultCallback2) {
            super();
            function = function2;
            atomicReference = atomicReference2;
            activityResultContract = activityResultContract2;
            activityResultCallback = activityResultCallback2;
        }

        @Override // androidx.fragment.app.Fragment.OnPreAttachedListener
        void onPreAttached() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            atomicReference.set(((ActivityResultRegistry) function.apply(null)).register(strGenerateActivityResultKey, Fragment.this, activityResultContract, activityResultCallback));
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$10 */
    class AnonymousClass10<I> extends ActivityResultLauncher<I> {
        final /* synthetic */ ActivityResultContract val$contract;
        final /* synthetic */ AtomicReference val$ref;

        AnonymousClass10(AtomicReference atomicReference2, ActivityResultContract activityResultContract2) {
            atomicReference = atomicReference2;
            activityResultContract = activityResultContract2;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public void launch(I i2, ActivityOptionsCompat activityOptionsCompat) {
            ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) atomicReference.get();
            if (activityResultLauncher == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            activityResultLauncher.launch(i2, activityOptionsCompat);
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public void unregister() {
            ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) atomicReference.getAndSet(null);
            if (activityResultLauncher != null) {
                activityResultLauncher.unregister();
            }
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public ActivityResultContract<I, ?> getContract() {
            return activityResultContract;
        }
    }

    private void registerOnPreAttachListener(OnPreAttachedListener onPreAttachedListener) {
        if (this.mState >= 0) {
            onPreAttachedListener.onPreAttached();
        } else {
            this.mOnPreAttachedListeners.add(onPreAttachedListener);
        }
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    static class AnimationInfo {
        Boolean mAllowEnterTransitionOverlap;
        Boolean mAllowReturnTransitionOverlap;
        View mAnimatingAway;
        int mEnterAnim;
        boolean mEnterTransitionPostponed;
        int mExitAnim;
        boolean mIsPop;
        int mNextTransition;
        int mPopEnterAnim;
        int mPopExitAnim;
        ArrayList<String> mSharedElementSourceNames;
        ArrayList<String> mSharedElementTargetNames;
        Object mEnterTransition = null;
        Object mReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
        Object mExitTransition = null;
        Object mReenterTransition = Fragment.USE_DEFAULT_TRANSITION;
        Object mSharedElementEnterTransition = null;
        Object mSharedElementReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
        SharedElementCallback mEnterTransitionCallback = null;
        SharedElementCallback mExitTransitionCallback = null;
        float mPostOnViewCreatedAlpha = 1.0f;
        View mFocusedView = null;

        AnimationInfo() {
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static void cancelPendingInputEvents(View view) {
            view.cancelPendingInputEvents();
        }
    }
}
