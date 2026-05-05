package bo.app;

import com.braze.events.IFireOnceEventSubscriber;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class kw {
    public static final HashSet a(ConcurrentHashMap concurrentHashMap, Class cls, ReentrantLock reentrantLock) {
        HashSet hashSet;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(cls);
            if (copyOnWriteArraySet == null) {
                hashSet = new HashSet();
            } else {
                hashSet = new HashSet(copyOnWriteArraySet);
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArraySet) {
                    if (obj instanceof IFireOnceEventSubscriber) {
                        arrayList.add(obj);
                    }
                }
                copyOnWriteArraySet.removeAll(CollectionsKt.toSet(arrayList));
                concurrentHashMap.put(cls, copyOnWriteArraySet);
            }
            return hashSet;
        } finally {
            reentrantLock.unlock();
        }
    }
}
