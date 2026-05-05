package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.support.BrazeLogger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: loaded from: classes4.dex */
public final class vw implements v00 {

    /* JADX INFO: renamed from: i */
    public static final kw f2073i = new kw();

    /* JADX INFO: renamed from: a */
    public final ka0 f2074a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f2075b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f2076c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f2077d;

    /* JADX INFO: renamed from: e */
    public final ReentrantLock f2078e;

    /* JADX INFO: renamed from: f */
    public final ReentrantLock f2079f;

    /* JADX INFO: renamed from: g */
    public final ReentrantLock f2080g;

    /* JADX INFO: renamed from: h */
    public boolean f2081h;

    public /* synthetic */ vw(ka0 ka0Var) {
        this(ka0Var, false);
    }

    public vw(ka0 sdkEnablementProvider, boolean z2) {
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        this.f2074a = sdkEnablementProvider;
        this.f2075b = new ConcurrentHashMap();
        this.f2076c = new ConcurrentHashMap();
        this.f2077d = new ConcurrentHashMap();
        this.f2078e = new ReentrantLock();
        this.f2079f = new ReentrantLock();
        this.f2080g = new ReentrantLock();
        this.f2081h = !z2;
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f2078e;
        reentrantLock.lock();
        try {
            this.f2075b.clear();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.f2079f;
            reentrantLock2.lock();
            try {
                this.f2076c.clear();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void a(Class cls) {
        if (!this.f2081h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mw(cls), 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.f2080g;
        reentrantLock.lock();
        try {
            if (this.f2077d.containsKey(cls)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new nw(cls), 6, (Object) null);
                Object objRemove = this.f2077d.remove(cls);
                Intrinsics.checkNotNull(objRemove, "null cannot be cast to non-null type kotlin.collections.List<T of com.braze.events.EventMessenger.attemptPublishFromCache$lambda$13>");
                Iterator it = ((List) objRemove).iterator();
                while (it.hasNext()) {
                    b(cls, it.next());
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(Class cls, Object obj) {
        List list;
        ReentrantLock reentrantLock = this.f2080g;
        reentrantLock.lock();
        if (obj == null) {
            return;
        }
        try {
            if (!this.f2077d.containsKey(cls) || (list = (List) this.f2077d.get(cls)) == null) {
                this.f2077d.put(cls, CollectionsKt.mutableListOf(obj));
            } else {
                list.add(obj);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean a(IEventSubscriber subscriber, Class eventClass) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f2078e;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f2075b.get(eventClass);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(subscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(Class eventClass, Object obj) {
        l00 l00Var;
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        boolean z2 = true;
        if (!(obj instanceof ca0) && !(obj instanceof ia0) && ((!(obj instanceof tr) || (l00Var = ((tr) obj).f1888d) == null || !((tg) l00Var).e().f256d) && ((!(obj instanceof w70) || !((tg) ((w70) obj).f2109a).e().f256d) && ((!(obj instanceof v70) || !((tg) ((v70) obj).f2006a).e().f256d) && (!(obj instanceof es) || !((tg) ((es) obj).f589a).e().f256d))))) {
            z2 = false;
        }
        if (this.f2074a.f1095a.getBoolean("appboy_sdk_disabled", false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z2, new ow(eventClass, obj), 3, (Object) null);
            return;
        }
        if (obj == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z2, new pw(eventClass), 3, (Object) null);
            return;
        }
        if (!this.f2081h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z2, new qw(eventClass, obj), 3, (Object) null);
            a(eventClass, obj);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, z2, new rw(eventClass, obj), 3, (Object) null);
        HashSet hashSetA = kw.a(this.f2075b, eventClass, this.f2078e);
        kw kwVar = f2073i;
        Intrinsics.checkNotNull(hashSetA, "null cannot be cast to non-null type kotlin.collections.Set<com.braze.events.IEventSubscriber<T of com.braze.events.EventMessenger.Companion.getCastSubscriberSet>>");
        BrazeLogger.brazelog$default(brazeLogger, (Object) kwVar, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new jw(eventClass, hashSetA), 3, (Object) null);
        Iterator it = hashSetA.iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new sw((IEventSubscriber) it.next(), obj, null), 3, null);
        }
        HashSet hashSetA2 = kw.a(this.f2076c, eventClass, this.f2079f);
        kw kwVar2 = f2073i;
        Intrinsics.checkNotNull(hashSetA2, "null cannot be cast to non-null type kotlin.collections.Set<com.braze.events.IEventSubscriber<T of com.braze.events.EventMessenger.Companion.getCastSubscriberSet>>");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) kwVar2, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new jw(eventClass, hashSetA2), 3, (Object) null);
        Iterator it2 = hashSetA2.iterator();
        while (it2.hasNext()) {
            ((IEventSubscriber) it2.next()).trigger(obj);
        }
        if (hashSetA2.isEmpty() && hashSetA.isEmpty()) {
            if (Intrinsics.areEqual(eventClass, NoMatchingTriggerEvent.class)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, z2, new tw(eventClass, this), 2, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, z2, new uw(eventClass, this), 2, (Object) null);
                a(eventClass, obj);
            }
        }
    }

    public final boolean b(IEventSubscriber subscriber, Class eventClass) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f2079f;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f2076c.get(eventClass);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(subscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean c(IEventSubscriber subscriber, Class eventClass) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f2079f;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.f2076c;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(eventClass);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(eventClass, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            boolean zAdd = copyOnWriteArraySet.add(subscriber);
            a(eventClass);
            return zAdd;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(IEventSubscriber subscriber, Class eventClass) {
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f2078e;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.f2075b;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(eventClass);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(eventClass, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            copyOnWriteArraySet.add(subscriber);
            a(eventClass);
        } finally {
            reentrantLock.unlock();
        }
    }
}
