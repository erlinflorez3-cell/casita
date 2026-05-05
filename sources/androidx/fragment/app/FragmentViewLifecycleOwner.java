package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
class FragmentViewLifecycleOwner implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {
    private ViewModelProvider.Factory mDefaultFactory;
    private final Fragment mFragment;
    private final Runnable mRestoreViewSavedStateRunnable;
    private final ViewModelStore mViewModelStore;
    private LifecycleRegistry mLifecycleRegistry = null;
    private SavedStateRegistryController mSavedStateRegistryController = null;

    FragmentViewLifecycleOwner(Fragment fragment, ViewModelStore viewModelStore, Runnable runnable) {
        this.mFragment = fragment;
        this.mViewModelStore = viewModelStore;
        this.mRestoreViewSavedStateRunnable = runnable;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        initialize();
        return this.mViewModelStore;
    }

    void initialize() {
        if (this.mLifecycleRegistry == null) {
            this.mLifecycleRegistry = new LifecycleRegistry(this);
            SavedStateRegistryController savedStateRegistryControllerCreate = SavedStateRegistryController.create(this);
            this.mSavedStateRegistryController = savedStateRegistryControllerCreate;
            savedStateRegistryControllerCreate.performAttach();
            this.mRestoreViewSavedStateRunnable.run();
        }
    }

    boolean isInitialized() {
        return this.mLifecycleRegistry != null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        initialize();
        return this.mLifecycleRegistry;
    }

    void setCurrentState(Lifecycle.State state) {
        this.mLifecycleRegistry.setCurrentState(state);
    }

    void handleLifecycleEvent(Lifecycle.Event event) {
        this.mLifecycleRegistry.handleLifecycleEvent(event);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() throws Throwable {
        Application application;
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.mFragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.mFragment.mDefaultFactory)) {
            this.mDefaultFactory = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.mDefaultFactory == null) {
            Context contextRequireContext = this.mFragment.requireContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("!_\u0004=j@\u000b,+ZS_\u0002\u0019\u0007\"n9_*T#x", (short) (C1607wl.Xd() ^ 9999))).getMethod(EO.Od("Q\u0001}.M\u0003\u001fStbwJ{\u0001y\u007f<D\\\u001c/", (short) (ZN.Xd() ^ 7350)), new Class[0]);
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
                Fragment fragment = this.mFragment;
                this.mDefaultFactory = new SavedStateViewModelFactory(application, fragment, fragment.getArguments());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() throws Throwable {
        Application application;
        Context contextRequireContext = this.mFragment.requireContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("io\u0013R\u0013\u0002\u0011v>\u0001\u0004<!r)h&j-\u001a4DV", (short) (OY.Xd() ^ 17667), (short) (OY.Xd() ^ 30862))).getMethod(C1626yg.Ud("\u0018PW/G/O\u0003*5\u000e11  N.\u0014p^Z", (short) (C1633zX.Xd() ^ (-31264)), (short) (C1633zX.Xd() ^ (-4382))), new Class[0]);
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
            MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
            if (application != null) {
                mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
            }
            mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this.mFragment);
            mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
            if (this.mFragment.getArguments() != null) {
                mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, this.mFragment.getArguments());
            }
            return mutableCreationExtras;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        initialize();
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    void performRestore(Bundle bundle) {
        this.mSavedStateRegistryController.performRestore(bundle);
    }

    void performSave(Bundle bundle) {
        this.mSavedStateRegistryController.performSave(bundle);
    }
}
