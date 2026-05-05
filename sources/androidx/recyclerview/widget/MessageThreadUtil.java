package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
class MessageThreadUtil<T> implements ThreadUtil<T> {
    MessageThreadUtil() {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.MessageThreadUtil$1, reason: invalid class name */
    class AnonymousClass1 implements ThreadUtil.MainThreadCallback<T> {
        static final int ADD_TILE = 2;
        static final int REMOVE_TILE = 3;
        static final int UPDATE_ITEM_COUNT = 1;
        private final Handler mMainThreadHandler;
        private Runnable mMainThreadRunnable;
        final MessageQueue mQueue = new MessageQueue();
        final /* synthetic */ ThreadUtil.MainThreadCallback val$callback;

        AnonymousClass1(ThreadUtil.MainThreadCallback mainThreadCallback) throws Throwable {
            this.val$callback = mainThreadCallback;
            short sXd = (short) (ZN.Xd() ^ 8793);
            int[] iArr = new int["~\u000b\u007f\r\t\u0002{D\u0005\bA^\u0001\u007f\u007fs\u007f".length()];
            QB qb = new QB("~\u000b\u007f\r\t\u0002{D\u0005\bA^\u0001\u007f\u007fs\u007f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.yd("\n\u0007\u0015l\u007f\u0007\u000bg\n\t\t|\t", (short) (C1580rY.Xd() ^ (-15698))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                this.mMainThreadHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                this.mMainThreadRunnable = new Runnable() { // from class: androidx.recyclerview.widget.MessageThreadUtil.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SyncQueueItem next = AnonymousClass1.this.mQueue.next();
                        while (next != null) {
                            int i3 = next.what;
                            if (i3 == 1) {
                                AnonymousClass1.this.val$callback.updateItemCount(next.arg1, next.arg2);
                            } else if (i3 == 2) {
                                AnonymousClass1.this.val$callback.addTile(next.arg1, (TileList.Tile) next.data);
                            } else if (i3 == 3) {
                                AnonymousClass1.this.val$callback.removeTile(next.arg1, next.arg2);
                            } else {
                                String str = "Unsupported message, what=" + next.what;
                            }
                            next = AnonymousClass1.this.mQueue.next();
                        }
                    }
                };
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int i2, int i3) throws Throwable {
            sendMessage(SyncQueueItem.obtainMessage(1, i2, i3));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int i2, TileList.Tile<T> tile) throws Throwable {
            sendMessage(SyncQueueItem.obtainMessage(2, i2, tile));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int i2, int i3) throws Throwable {
            sendMessage(SyncQueueItem.obtainMessage(3, i2, i3));
        }

        private void sendMessage(SyncQueueItem syncQueueItem) throws Throwable {
            this.mQueue.sendMessage(syncQueueItem);
            Handler handler = this.mMainThreadHandler;
            Runnable runnable = this.mMainThreadRunnable;
            Class<?> cls = Class.forName(C1561oA.Yd("\u000b\u0019\u0010\u001f\u001d\u0018\u0014^!&a|\u0017%\u001c%\u001f-", (short) (OY.Xd() ^ 32035)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1607wl.Xd() ^ 20866);
            short sXd2 = (short) (C1607wl.Xd() ^ 5190);
            int[] iArr = new int["\u001d\u0015+\u0017d$\u001a(\"i\u000f3-.\"$/)".length()];
            QB qb = new QB("\u001d\u0015+\u0017d$\u001a(\"i\u000f3-.\"$/)");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {runnable};
            Method method = cls.getMethod(Jg.Wd(">mB0", (short) (C1633zX.Xd() ^ (-32048)), (short) (C1633zX.Xd() ^ (-8302))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public ThreadUtil.MainThreadCallback<T> getMainThreadProxy(ThreadUtil.MainThreadCallback<T> mainThreadCallback) {
        return new AnonymousClass1(mainThreadCallback);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.MessageThreadUtil$2, reason: invalid class name */
    class AnonymousClass2 implements ThreadUtil.BackgroundCallback<T> {
        static final int LOAD_TILE = 3;
        static final int RECYCLE_TILE = 4;
        static final int REFRESH = 1;
        static final int UPDATE_RANGE = 2;
        final /* synthetic */ ThreadUtil.BackgroundCallback val$callback;
        final MessageQueue mQueue = new MessageQueue();
        private final Executor mExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
        AtomicBoolean mBackgroundRunning = new AtomicBoolean(false);
        private Runnable mBackgroundRunnable = new Runnable() { // from class: androidx.recyclerview.widget.MessageThreadUtil.2.1
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    SyncQueueItem next = AnonymousClass2.this.mQueue.next();
                    if (next != null) {
                        int i2 = next.what;
                        if (i2 == 1) {
                            AnonymousClass2.this.mQueue.removeMessages(1);
                            AnonymousClass2.this.val$callback.refresh(next.arg1);
                        } else if (i2 == 2) {
                            AnonymousClass2.this.mQueue.removeMessages(2);
                            AnonymousClass2.this.mQueue.removeMessages(3);
                            AnonymousClass2.this.val$callback.updateRange(next.arg1, next.arg2, next.arg3, next.arg4, next.arg5);
                        } else if (i2 == 3) {
                            AnonymousClass2.this.val$callback.loadTile(next.arg1, next.arg2);
                        } else if (i2 == 4) {
                            AnonymousClass2.this.val$callback.recycleTile((TileList.Tile) next.data);
                        } else {
                            String str = "Unsupported message, what=" + next.what;
                        }
                    } else {
                        AnonymousClass2.this.mBackgroundRunning.set(false);
                        return;
                    }
                }
            }
        };

        AnonymousClass2(ThreadUtil.BackgroundCallback backgroundCallback) {
            this.val$callback = backgroundCallback;
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int i2) {
            sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(1, i2, (Object) null));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int i2, int i3, int i4, int i5, int i6) {
            sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(2, i2, i3, i4, i5, i6, null));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int i2, int i3) {
            sendMessage(SyncQueueItem.obtainMessage(3, i2, i3));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(TileList.Tile<T> tile) {
            sendMessage(SyncQueueItem.obtainMessage(4, 0, tile));
        }

        private void sendMessage(SyncQueueItem syncQueueItem) {
            this.mQueue.sendMessage(syncQueueItem);
            maybeExecuteBackgroundRunnable();
        }

        private void sendMessageAtFrontOfQueue(SyncQueueItem syncQueueItem) {
            this.mQueue.sendMessageAtFrontOfQueue(syncQueueItem);
            maybeExecuteBackgroundRunnable();
        }

        private void maybeExecuteBackgroundRunnable() {
            if (this.mBackgroundRunning.compareAndSet(false, true)) {
                this.mExecutor.execute(this.mBackgroundRunnable);
            }
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public ThreadUtil.BackgroundCallback<T> getBackgroundProxy(ThreadUtil.BackgroundCallback<T> backgroundCallback) {
        return new AnonymousClass2(backgroundCallback);
    }

    static class SyncQueueItem {
        private static SyncQueueItem sPool = null;
        private static final Object sPoolLock = new Object();
        public int arg1;
        public int arg2;
        public int arg3;
        public int arg4;
        public int arg5;
        public Object data;
        SyncQueueItem next;
        public int what;

        SyncQueueItem() {
        }

        void recycle() {
            this.next = null;
            this.arg5 = 0;
            this.arg4 = 0;
            this.arg3 = 0;
            this.arg2 = 0;
            this.arg1 = 0;
            this.what = 0;
            this.data = null;
            synchronized (sPoolLock) {
                SyncQueueItem syncQueueItem = sPool;
                if (syncQueueItem != null) {
                    this.next = syncQueueItem;
                }
                sPool = this;
            }
        }

        static SyncQueueItem obtainMessage(int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
            SyncQueueItem syncQueueItem;
            synchronized (sPoolLock) {
                syncQueueItem = sPool;
                if (syncQueueItem == null) {
                    syncQueueItem = new SyncQueueItem();
                } else {
                    sPool = syncQueueItem.next;
                    syncQueueItem.next = null;
                }
                syncQueueItem.what = i2;
                syncQueueItem.arg1 = i3;
                syncQueueItem.arg2 = i4;
                syncQueueItem.arg3 = i5;
                syncQueueItem.arg4 = i6;
                syncQueueItem.arg5 = i7;
                syncQueueItem.data = obj;
            }
            return syncQueueItem;
        }

        static SyncQueueItem obtainMessage(int i2, int i3, int i4) {
            return obtainMessage(i2, i3, i4, 0, 0, 0, null);
        }

        static SyncQueueItem obtainMessage(int i2, int i3, Object obj) {
            return obtainMessage(i2, i3, 0, 0, 0, 0, obj);
        }
    }

    static class MessageQueue {
        private final Object mLock = new Object();
        private SyncQueueItem mRoot;

        MessageQueue() {
        }

        SyncQueueItem next() {
            synchronized (this.mLock) {
                SyncQueueItem syncQueueItem = this.mRoot;
                if (syncQueueItem == null) {
                    return null;
                }
                this.mRoot = syncQueueItem.next;
                return syncQueueItem;
            }
        }

        void sendMessageAtFrontOfQueue(SyncQueueItem syncQueueItem) {
            synchronized (this.mLock) {
                syncQueueItem.next = this.mRoot;
                this.mRoot = syncQueueItem;
            }
        }

        void sendMessage(SyncQueueItem syncQueueItem) {
            synchronized (this.mLock) {
                SyncQueueItem syncQueueItem2 = this.mRoot;
                if (syncQueueItem2 == null) {
                    this.mRoot = syncQueueItem;
                    return;
                }
                while (syncQueueItem2.next != null) {
                    syncQueueItem2 = syncQueueItem2.next;
                }
                syncQueueItem2.next = syncQueueItem;
            }
        }

        void removeMessages(int i2) {
            synchronized (this.mLock) {
                while (true) {
                    SyncQueueItem syncQueueItem = this.mRoot;
                    if (syncQueueItem == null || syncQueueItem.what != i2) {
                        break;
                    }
                    SyncQueueItem syncQueueItem2 = this.mRoot;
                    this.mRoot = syncQueueItem2.next;
                    syncQueueItem2.recycle();
                }
                SyncQueueItem syncQueueItem3 = this.mRoot;
                if (syncQueueItem3 != null) {
                    SyncQueueItem syncQueueItem4 = syncQueueItem3.next;
                    while (syncQueueItem4 != null) {
                        SyncQueueItem syncQueueItem5 = syncQueueItem4.next;
                        if (syncQueueItem4.what == i2) {
                            syncQueueItem3.next = syncQueueItem5;
                            syncQueueItem4.recycle();
                        } else {
                            syncQueueItem3 = syncQueueItem4;
                        }
                        syncQueueItem4 = syncQueueItem5;
                    }
                }
            }
        }
    }
}
