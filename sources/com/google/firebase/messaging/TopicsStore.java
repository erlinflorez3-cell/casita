package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import yg.C1499aX;
import yg.C1580rY;
import yg.C1626yg;
import yg.Jg;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
final class TopicsStore {
    private static final String DIVIDER_QUEUE_OPERATIONS = ",";
    static final String KEY_TOPIC_OPERATIONS_QUEUE = "topic_operation_queue";
    static final String PREFERENCES = "com.google.android.gms.appid";
    private static WeakReference<TopicsStore> topicsStoreWeakReference = null;
    private final SharedPreferences sharedPreferences;
    private final Executor syncExecutor;
    private SharedPreferencesQueue topicOperationsQueue;

    private TopicsStore(SharedPreferences sharedPreferences, Executor executor) {
        this.syncExecutor = executor;
        this.sharedPreferences = sharedPreferences;
    }

    static synchronized void clearCaches() {
        WeakReference<TopicsStore> weakReference = topicsStoreWeakReference;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public static synchronized TopicsStore getInstance(Context context, Executor executor) {
        TopicsStore topicsStore;
        WeakReference<TopicsStore> weakReference = topicsStoreWeakReference;
        topicsStore = weakReference != null ? weakReference.get() : null;
        if (topicsStore == null) {
            Object[] objArr = {Xg.qd("Yfe'ajkdjd.bpgvtok6pw~:n~\u007fyu", (short) (C1580rY.Xd() ^ (-30902)), (short) (C1580rY.Xd() ^ (-12763))), 0};
            Method method = Class.forName(Jg.Wd("_]\u0005D4\u001fKHnk\u001eU7+bMUr#Z>Bo", (short) (C1499aX.Xd() ^ (-28027)), (short) (C1499aX.Xd() ^ (-15164)))).getMethod(C1626yg.Ud("<6%mE myds\u0013K|\u0012UE?\u0013-Z", (short) (C1580rY.Xd() ^ (-24353)), (short) (C1580rY.Xd() ^ (-20782))), Class.forName(ZO.xd("\u001e\u0005~F[\u0013LaVeC\u0002-61F", (short) (C1499aX.Xd() ^ (-504)), (short) (C1499aX.Xd() ^ (-26024)))), Integer.TYPE);
            try {
                method.setAccessible(true);
                topicsStore = new TopicsStore((SharedPreferences) method.invoke(context, objArr), executor);
                topicsStore.initStore();
                topicsStoreWeakReference = new WeakReference<>(topicsStore);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return topicsStore;
    }

    private synchronized void initStore() {
        this.topicOperationsQueue = SharedPreferencesQueue.createInstance(this.sharedPreferences, KEY_TOPIC_OPERATIONS_QUEUE, DIVIDER_QUEUE_OPERATIONS, this.syncExecutor);
    }

    synchronized boolean addTopicOperation(TopicOperation topicOperation) {
        return this.topicOperationsQueue.add(topicOperation.serialize());
    }

    synchronized void clearTopicOperations() {
        this.topicOperationsQueue.clear();
    }

    synchronized TopicOperation getNextTopicOperation() {
        return TopicOperation.from(this.topicOperationsQueue.peek());
    }

    synchronized List<TopicOperation> getOperations() {
        ArrayList arrayList;
        List<String> list = this.topicOperationsQueue.toList();
        arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(TopicOperation.from(it.next()));
        }
        return arrayList;
    }

    synchronized TopicOperation pollTopicOperation() {
        try {
        } catch (NoSuchElementException unused) {
            return null;
        }
        return TopicOperation.from(this.topicOperationsQueue.remove());
    }

    synchronized boolean removeTopicOperation(TopicOperation topicOperation) {
        return this.topicOperationsQueue.remove(topicOperation.serialize());
    }
}
