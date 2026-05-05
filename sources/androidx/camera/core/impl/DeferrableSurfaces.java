package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class DeferrableSurfaces {
    private DeferrableSurfaces() {
    }

    public static ListenableFuture<List<Surface>> surfaceListWithTimeout(final Collection<DeferrableSurface> collection, final boolean z2, long j2, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Futures.nonCancellationPropagating(it.next().getSurface()));
        }
        final ListenableFuture listenableFutureMakeTimeoutFuture = Futures.makeTimeoutFuture(j2, scheduledExecutorService, Futures.successfulAsList(arrayList));
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.DeferrableSurfaces$$ExternalSyntheticLambda1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DeferrableSurfaces.lambda$surfaceListWithTimeout$1(listenableFutureMakeTimeoutFuture, executor, z2, collection, completer);
            }
        });
    }

    static /* synthetic */ Object lambda$surfaceListWithTimeout$1(final ListenableFuture listenableFuture, Executor executor, final boolean z2, Collection collection, final CallbackToFutureAdapter.Completer completer) throws Exception {
        completer.addCancellationListener(new Runnable() { // from class: androidx.camera.core.impl.DeferrableSurfaces$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                listenableFuture.cancel(true);
            }
        }, executor);
        Futures.addCallback(listenableFuture, new FutureCallback<List<Surface>>() { // from class: androidx.camera.core.impl.DeferrableSurfaces.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(List<Surface> list) {
                Preconditions.checkNotNull(list);
                ArrayList arrayList = new ArrayList(list);
                if (z2) {
                    arrayList.removeAll(Collections.singleton(null));
                }
                completer.set(arrayList);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                if (th instanceof TimeoutException) {
                    completer.setException(th);
                } else {
                    completer.set(Collections.emptyList());
                }
            }
        }, executor);
        return "surfaceList[" + collection + "]";
    }

    public static boolean tryIncrementAll(List<DeferrableSurface> list) {
        try {
            incrementAll(list);
            return true;
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            return false;
        }
    }

    public static void incrementAll(List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (!list.isEmpty()) {
            int i2 = 0;
            do {
                try {
                    list.get(i2).incrementUseCount();
                    i2++;
                } catch (DeferrableSurface.SurfaceClosedException e2) {
                    for (int i3 = i2 - 1; i3 >= 0; i3--) {
                        list.get(i3).decrementUseCount();
                    }
                    throw e2;
                }
            } while (i2 < list.size());
        }
    }

    public static void decrementAll(List<DeferrableSurface> list) {
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().decrementUseCount();
        }
    }
}
