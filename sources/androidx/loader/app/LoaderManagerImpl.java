package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import androidx.collection.SparseArrayCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
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
class LoaderManagerImpl extends LoaderManager {
    static boolean DEBUG = false;
    private static final String TAG = "LoaderManager";
    private final LifecycleOwner mLifecycleOwner;
    private final LoaderViewModel mLoaderViewModel;

    public static class LoaderInfo<D> extends MutableLiveData<D> implements Loader.OnLoadCompleteListener<D> {
        private final Bundle mArgs;
        private final int mId;
        private LifecycleOwner mLifecycleOwner;
        private final Loader<D> mLoader;
        private LoaderObserver<D> mObserver;
        private Loader<D> mPriorLoader;

        LoaderInfo(int i2, Bundle bundle, Loader<D> loader, Loader<D> loader2) {
            this.mId = i2;
            this.mArgs = bundle;
            this.mLoader = loader;
            this.mPriorLoader = loader2;
            loader.registerListener(i2, this);
        }

        Loader<D> getLoader() {
            return this.mLoader;
        }

        @Override // androidx.lifecycle.LiveData
        protected void onActive() {
            if (LoaderManagerImpl.DEBUG) {
                String str = "  Starting: " + this;
            }
            this.mLoader.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        protected void onInactive() {
            if (LoaderManagerImpl.DEBUG) {
                String str = "  Stopping: " + this;
            }
            this.mLoader.stopLoading();
        }

        Loader<D> setCallback(LifecycleOwner lifecycleOwner, LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
            LoaderObserver<D> loaderObserver = new LoaderObserver<>(this.mLoader, loaderCallbacks);
            observe(lifecycleOwner, loaderObserver);
            LoaderObserver<D> loaderObserver2 = this.mObserver;
            if (loaderObserver2 != null) {
                removeObserver(loaderObserver2);
            }
            this.mLifecycleOwner = lifecycleOwner;
            this.mObserver = loaderObserver;
            return this.mLoader;
        }

        void markForRedelivery() {
            LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            LoaderObserver<D> loaderObserver = this.mObserver;
            if (lifecycleOwner == null || loaderObserver == null) {
                return;
            }
            super.removeObserver(loaderObserver);
            observe(lifecycleOwner, loaderObserver);
        }

        boolean isCallbackWaitingForData() {
            LoaderObserver<D> loaderObserver;
            return (!hasActiveObservers() || (loaderObserver = this.mObserver) == null || loaderObserver.hasDeliveredData()) ? false : true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void removeObserver(Observer<? super D> observer) {
            super.removeObserver(observer);
            this.mLifecycleOwner = null;
            this.mObserver = null;
        }

        Loader<D> destroy(boolean z2) {
            if (LoaderManagerImpl.DEBUG) {
                String str = "  Destroying: " + this;
            }
            this.mLoader.cancelLoad();
            this.mLoader.abandon();
            LoaderObserver<D> loaderObserver = this.mObserver;
            if (loaderObserver != null) {
                removeObserver(loaderObserver);
                if (z2) {
                    loaderObserver.reset();
                }
            }
            this.mLoader.unregisterListener(this);
            if ((loaderObserver != null && !loaderObserver.hasDeliveredData()) || z2) {
                this.mLoader.reset();
                return this.mPriorLoader;
            }
            return this.mLoader;
        }

        @Override // androidx.loader.content.Loader.OnLoadCompleteListener
        public void onLoadComplete(Loader<D> loader, D d2) throws Throwable {
            boolean z2 = LoaderManagerImpl.DEBUG;
            C1561oA.Kd("1UHLN\\8M[OVUc", (short) (Od.Xd() ^ (-25142)));
            if (z2) {
                String str = Wg.Zd("Y(AR\fLVB\u0006t.v)W{?", (short) (ZN.Xd() ^ 30324), (short) (ZN.Xd() ^ 15429)) + this;
            }
            Looper looperMyLooper = Looper.myLooper();
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.Xd("?MDSQLH\u0013UZ\u00165YZ\\R`", (short) (OY.Xd() ^ 10610))).getDeclaredMethod(Wg.vd(",)7\u000f*15\u0012<;;/C", (short) (C1499aX.Xd() ^ (-14832))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                    setValue(d2);
                    return;
                }
                if (LoaderManagerImpl.DEBUG) {
                    Qg.kd("\u001a\u0018t\u0017\b\ng\u0013\u0010\u0012\r\u0005\u0013\u0003<\u0013{\r8\u0001\u0005x\u0004\u0006\u0005vs\u0004z\u0007,nkutlj%sq\"b a_`gblhmeZ\u0015h[dVQS", (short) (OY.Xd() ^ 1333), (short) (OY.Xd() ^ 32348));
                }
                postValue(d2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(D d2) {
            super.setValue(d2);
            Loader<D> loader = this.mPriorLoader;
            if (loader != null) {
                loader.reset();
                this.mPriorLoader = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.mId);
            sb.append(" : ");
            Class<?> cls = this.mLoader.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.mId);
            printWriter.print(" mArgs=");
            printWriter.println(this.mArgs);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.mLoader);
            this.mLoader.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.mObserver != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.mObserver);
                this.mObserver.dump(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(getLoader().dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }
    }

    static class LoaderObserver<D> implements Observer<D> {
        private final LoaderManager.LoaderCallbacks<D> mCallback;
        private boolean mDeliveredData = false;
        private final Loader<D> mLoader;

        LoaderObserver(Loader<D> loader, LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
            this.mLoader = loader;
            this.mCallback = loaderCallbacks;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(D d2) {
            if (LoaderManagerImpl.DEBUG) {
                String str = "  onLoadFinished in " + this.mLoader + ": " + this.mLoader.dataToString(d2);
            }
            this.mDeliveredData = true;
            this.mCallback.onLoadFinished(this.mLoader, d2);
        }

        boolean hasDeliveredData() {
            return this.mDeliveredData;
        }

        void reset() {
            if (this.mDeliveredData) {
                if (LoaderManagerImpl.DEBUG) {
                    String str = "  Resetting: " + this.mLoader;
                }
                this.mCallback.onLoaderReset(this.mLoader);
            }
        }

        public String toString() {
            return this.mCallback.toString();
        }

        public void dump(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.mDeliveredData);
        }
    }

    static class LoaderViewModel extends ViewModel {
        private static final ViewModelProvider.Factory FACTORY = new ViewModelProvider.Factory() { // from class: androidx.loader.app.LoaderManagerImpl.LoaderViewModel.1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> cls) {
                return new LoaderViewModel();
            }
        };
        private SparseArrayCompat<LoaderInfo> mLoaders = new SparseArrayCompat<>();
        private boolean mCreatingLoader = false;

        LoaderViewModel() {
        }

        static LoaderViewModel getInstance(ViewModelStore viewModelStore) {
            return (LoaderViewModel) new ViewModelProvider(viewModelStore, FACTORY).get(LoaderViewModel.class);
        }

        void startCreatingLoader() {
            this.mCreatingLoader = true;
        }

        boolean isCreatingLoader() {
            return this.mCreatingLoader;
        }

        void finishCreatingLoader() {
            this.mCreatingLoader = false;
        }

        void putLoader(int i2, LoaderInfo loaderInfo) {
            this.mLoaders.put(i2, loaderInfo);
        }

        <D> LoaderInfo<D> getLoader(int i2) {
            return this.mLoaders.get(i2);
        }

        void removeLoader(int i2) {
            this.mLoaders.remove(i2);
        }

        boolean hasRunningLoaders() {
            int size = this.mLoaders.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.mLoaders.valueAt(i2).isCallbackWaitingForData()) {
                    return true;
                }
            }
            return false;
        }

        void markForRedelivery() {
            int size = this.mLoaders.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mLoaders.valueAt(i2).markForRedelivery();
            }
        }

        @Override // androidx.lifecycle.ViewModel
        protected void onCleared() {
            super.onCleared();
            int size = this.mLoaders.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mLoaders.valueAt(i2).destroy(true);
            }
            this.mLoaders.clear();
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.mLoaders.size() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.mLoaders.size(); i2++) {
                    LoaderInfo loaderInfoValueAt = this.mLoaders.valueAt(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.mLoaders.keyAt(i2));
                    printWriter.print(": ");
                    printWriter.println(loaderInfoValueAt.toString());
                    loaderInfoValueAt.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    LoaderManagerImpl(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.mLifecycleOwner = lifecycleOwner;
        this.mLoaderViewModel = LoaderViewModel.getInstance(viewModelStore);
    }

    private <D> Loader<D> createAndInstallLoader(int i2, Bundle bundle, LoaderManager.LoaderCallbacks<D> loaderCallbacks, Loader<D> loader) {
        try {
            this.mLoaderViewModel.startCreatingLoader();
            Loader<D> loaderOnCreateLoader = loaderCallbacks.onCreateLoader(i2, bundle);
            if (loaderOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (loaderOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(loaderOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + loaderOnCreateLoader);
            }
            LoaderInfo loaderInfo = new LoaderInfo(i2, bundle, loaderOnCreateLoader, loader);
            if (DEBUG) {
                String str = "  Created new loader " + loaderInfo;
            }
            this.mLoaderViewModel.putLoader(i2, loaderInfo);
            this.mLoaderViewModel.finishCreatingLoader();
            return loaderInfo.setCallback(this.mLifecycleOwner, loaderCallbacks);
        } catch (Throwable th) {
            this.mLoaderViewModel.finishCreatingLoader();
            throw th;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> Loader<D> initLoader(int i2, Bundle bundle, LoaderManager.LoaderCallbacks<D> loaderCallbacks) throws Throwable {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            short sXd = (short) (Od.Xd() ^ (-3961));
            short sXd2 = (short) (Od.Xd() ^ (-30843));
            int[] iArr = new int["&or\n{\u0013I5\u001e72FyQWbV\u0006r\u000f|Myp\u0015P\u0016T.r".length()];
            QB qb = new QB("&or\n{\u0013I5\u001e72FyQWbV\u0006r\u000f|Myp\u0015P\u0016T.r");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i3++;
            }
            throw new IllegalStateException(new String(iArr, 0, i3));
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1626yg.Ud("cFT_\r\u001e\u0005V\u001c\u0003Hf\u001eXB\t=", (short) (C1499aX.Xd() ^ (-30542)), (short) (C1499aX.Xd() ^ (-24056)))).getDeclaredMethod(Ig.wd("%|Y\nf\"C@5twN-", (short) (FB.Xd() ^ 18138)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (((Looper) declaredMethod.invoke(null, objArr)) != Looper.myLooper()) {
                throw new IllegalStateException(C1561oA.Kd("[a]iBfY]_m\u001cjsrt!dh$hgstnn+{{.\u0004xv2\u0001u~\u00057\r\u0002\r\u0001}\u0002", (short) (OY.Xd() ^ 11843)));
            }
            LoaderInfo<D> loader = this.mLoaderViewModel.getLoader(i2);
            boolean z2 = DEBUG;
            EO.Od("ZN\u0012t\u0015_V\nR)-\tE", (short) (C1607wl.Xd() ^ 1043));
            if (z2) {
                String str = C1561oA.Qd("\u007f\u0004}\b^\u0001qss\u007f,tx)", (short) (OY.Xd() ^ 22633)) + this + C1593ug.zd("M4v\t~\fV", (short) (C1633zX.Xd() ^ (-11704)), (short) (C1633zX.Xd() ^ (-31094))) + bundle;
            }
            if (loader == null) {
                return createAndInstallLoader(i2, bundle, loaderCallbacks, null);
            }
            if (DEBUG) {
                short sXd3 = (short) (C1580rY.Xd() ^ (-28197));
                int[] iArr2 = new int["?>o\u0002H\u0010\r\u0002\u0006}5y\f{\u0005\u0005x|t,wyjllx%".length()];
                QB qb2 = new QB("?>o\u0002H\u0010\r\u0002\u0006}5y\f{\u0005\u0005x|t,wyjllx%");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK(sXd3 + sXd3 + i4 + xuXd2.CK(iKK2));
                    i4++;
                }
                String str2 = new String(iArr2, 0, i4) + loader;
            }
            return loader.setCallback(this.mLifecycleOwner, loaderCallbacks);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> Loader<D> restartLoader(int i2, Bundle bundle, LoaderManager.LoaderCallbacks<D> loaderCallbacks) throws Throwable {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new IllegalStateException(C1561oA.Yd("\u00110<=77sL>@D>y>NB?SIOI\u0003E\u0005RVIMO]", (short) (ZN.Xd() ^ 6279)));
        }
        Class<?> cls = Class.forName(C1561oA.Xd("_mdsqlh3uz6Uyz|r\u0001", (short) (C1633zX.Xd() ^ (-3732))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 11627);
        int[] iArr = new int["\n\u0007\u0015l\u007f\u0007\u000bg\u001a\u0019\u0019\r\u0019".length()];
        QB qb = new QB("\n\u0007\u0015l\u007f\u0007\u000bg\u001a\u0019\u0019\r\u0019");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            if (((Looper) declaredMethod.invoke(null, objArr)) != Looper.myLooper()) {
                throw new IllegalStateException(C1561oA.yd("I;HH4DE\u001cN?AAMyFM::d&(a$!;:20j97gk^Z\u0014`SZ^\u001fren`[]", (short) (ZN.Xd() ^ 16423)));
            }
            if (DEBUG) {
                String str = Qg.kd("\u001e\u0010\u001d\u001d\t\u0019\u001ap\u0013\u0004\u0006\u0006\u0012>\u0007\u000b;", (short) (C1607wl.Xd() ^ 24883), (short) (C1607wl.Xd() ^ 20654)) + this + hg.Vd("#\bHXLW ", (short) (ZN.Xd() ^ 18501), (short) (ZN.Xd() ^ 5229)) + bundle;
                C1561oA.ud("n\u0011\u0002\u0004\u0004\u0010i|\tz\u007f|\t", (short) (OY.Xd() ^ 3515));
            }
            LoaderInfo<D> loader = this.mLoaderViewModel.getLoader(i2);
            return createAndInstallLoader(i2, bundle, loaderCallbacks, loader != null ? loader.destroy(false) : null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public void destroyLoader(int i2) throws Throwable {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new IllegalStateException(ZO.xd("[A\u0019R4Aj\u0005\biz\u0016\u0012\t\u0012\u001eA|$+\u0005xd~?'C5\"\u0018", (short) (FB.Xd() ^ 17776), (short) (FB.Xd() ^ 10942)));
        }
        Class<?> cls = Class.forName(hg.Vd("XdYfb[U\u001e^a\u001b8ZYYMY", (short) (C1607wl.Xd() ^ 30303), (short) (C1607wl.Xd() ^ 16715)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-27851));
        int[] iArr = new int[" \u001d+\u0003\u0016\u001d!} \u001f\u001f\u0013\u001f".length()];
        QB qb = new QB(" \u001d+\u0003\u0016\u001d!} \u001f\u001f\u0013\u001f");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            if (((Looper) declaredMethod.invoke(null, objArr)) != Looper.myLooper()) {
                throw new IllegalStateException(Jg.Wd("fL\u001es6\u0017\u001a\u0011h~F[p\u0003\u0005p$\t<\u0014Z92SG\fh\\<Pg]\u0007> OD}\u001ab)\u0002]\u001ds4\f", (short) (FB.Xd() ^ 31723), (short) (FB.Xd() ^ 792)));
            }
            if (DEBUG) {
                String str = C1561oA.yd("\u000e\u0010\u001f!\u0018\u0016!t\u0011\u0004\b\n\u0010>\t\u000f9", (short) (ZN.Xd() ^ 27404)) + this + C1561oA.Yd(";\f\u0004>", (short) (C1580rY.Xd() ^ (-22174))) + i2;
                Xg.qd(";_RVXfBWeY`_m", (short) (C1499aX.Xd() ^ (-6522)), (short) (C1499aX.Xd() ^ (-22283)));
            }
            LoaderInfo loader = this.mLoaderViewModel.getLoader(i2);
            if (loader != null) {
                loader.destroy(true);
                this.mLoaderViewModel.removeLoader(i2);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> Loader<D> getLoader(int i2) {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo<D> loader = this.mLoaderViewModel.getLoader(i2);
        if (loader != null) {
            return loader.getLoader();
        }
        return null;
    }

    @Override // androidx.loader.app.LoaderManager
    public void markForRedelivery() {
        this.mLoaderViewModel.markForRedelivery();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.mLifecycleOwner.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.loader.app.LoaderManager
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.mLoaderViewModel.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.LoaderManager
    public boolean hasRunningLoaders() {
        return this.mLoaderViewModel.hasRunningLoaders();
    }
}
