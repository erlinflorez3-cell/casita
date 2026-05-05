package bo.app;

import android.content.Context;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class w90 {

    /* JADX INFO: renamed from: k */
    public static final q90 f2113k = new q90();

    /* JADX INFO: renamed from: a */
    public final vb0 f2114a;

    /* JADX INFO: renamed from: b */
    public final v00 f2115b;

    /* JADX INFO: renamed from: c */
    public r90 f2116c;

    /* JADX INFO: renamed from: d */
    public long f2117d;

    /* JADX INFO: renamed from: e */
    public int f2118e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f2119f;

    /* JADX INFO: renamed from: g */
    public int f2120g;

    /* JADX INFO: renamed from: h */
    public final ReentrantLock f2121h;

    /* JADX INFO: renamed from: i */
    public Job f2122i;

    /* JADX INFO: renamed from: j */
    public final AtomicInteger f2123j;

    public w90(Context context, vw internalPublisher, vb0 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2114a = serverConfigStorageProvider;
        this.f2115b = internalPublisher;
        this.f2116c = new r90();
        this.f2117d = DateTimeUtils.nowInSeconds();
        this.f2119f = new ArrayList();
        this.f2121h = new ReentrantLock();
        this.f2123j = new AtomicInteger(0);
        if (c()) {
            b();
        }
        internalPublisher.c(new IEventSubscriber() { // from class: bo.app.w90$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                w90.a(this.f$0, (v70) obj);
            }
        }, v70.class);
        internalPublisher.c(new IEventSubscriber() { // from class: bo.app.w90$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                w90.a(this.f$0, (x90) obj);
            }
        }, x90.class);
    }

    public static final void a(w90 this$0, v70 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f2006a instanceof ha0) {
            this$0.f2123j.decrementAndGet();
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new l90(this$0, null), 3, null);
        }
    }

    public static final void a(w90 this$0, x90 newConfig) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m90(newConfig), 7, (Object) null);
        r90 r90Var = this$0.f2116c;
        r90 r90Var2 = newConfig.f2196a;
        if (r90Var2.f1656b == null) {
            r90Var2.f1656b = r90Var.f1656b;
        }
        if (r90Var2.f1657c == null) {
            r90Var2.f1657c = r90Var.f1657c;
        }
        this$0.f2116c = r90Var2;
        this$0.f2114a.a(r90Var2);
        boolean z2 = r90Var.f1655a;
        if (!z2 && this$0.f2116c.f1655a) {
            this$0.b();
        } else {
            if (!z2 || this$0.f2116c.f1655a) {
                return;
            }
            this$0.d();
        }
    }

    public final Unit a() {
        Long l2;
        r90 r90Var = this.f2116c;
        if (!r90Var.f1655a || r90Var.f1657c == null || (l2 = r90Var.f1656b) == null || l2.longValue() == 0 || this.f2123j.get() > 0) {
            return Unit.INSTANCE;
        }
        Long l3 = this.f2116c.f1656b;
        if (l3 != null) {
            if (DateTimeUtils.nowInSeconds() > l3.longValue()) {
                d();
                return Unit.INSTANCE;
            }
        }
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        long j2 = this.f2117d;
        r90 r90Var2 = this.f2116c;
        long j3 = j2 + r90Var2.f1659e;
        if (jNowInSeconds > j3 || this.f2120g > r90Var2.f1658d) {
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = this.f2121h;
            reentrantLock.lock();
            try {
                int length = 0;
                int length2 = 0;
                for (ea0 ea0Var : this.f2119f) {
                    if (this.f2118e != 0) {
                        String log = "Removed " + this.f2118e + " logs due to buffer overflow";
                        Intrinsics.checkNotNullParameter(log, "log");
                        arrayList.add(new ea0(log, DateTimeUtils.nowInMilliseconds()));
                        this.f2118e = 0;
                        length2 += log.length();
                    }
                    int length3 = ea0Var.f558a.length() + length2;
                    if (length3 <= this.f2116c.f1660f) {
                        arrayList.add(ea0Var);
                        length2 = length3;
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f2119f.remove((ea0) it.next());
                }
                Iterator it2 = this.f2119f.iterator();
                while (it2.hasNext()) {
                    length += ((ea0) it2.next()).f558a.length();
                }
                this.f2120g = length;
                this.f2117d = DateTimeUtils.nowInSeconds();
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                Job job = this.f2122i;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.f2122i = null;
                if (!arrayList.isEmpty()) {
                    this.f2123j.incrementAndGet();
                    ((vw) this.f2115b).b(ia0.class, new ia0(arrayList));
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } else if (this.f2122i == null) {
            this.f2122i = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Boxing.boxLong(TimeUnit.SECONDS.toMillis(j3 - DateTimeUtils.nowInSeconds())), null, new s90(this, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    public final void a(String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        ea0 ea0Var = new ea0(log, DateTimeUtils.nowInMilliseconds());
        ReentrantLock reentrantLock = this.f2121h;
        reentrantLock.lock();
        try {
            this.f2119f.add(ea0Var);
            int length = this.f2120g + log.length();
            this.f2120g = length;
            if (length > 1048576) {
                while (this.f2120g > 838860) {
                    this.f2120g -= ((ea0) this.f2119f.remove(0)).f558a.length();
                    this.f2118e++;
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b() {
        BrazeLogger.INSTANCE.setSdkDebuggerCallback$android_sdk_base_release(new t90(this));
        ((vw) this.f2115b).b(ca0.class, new ca0());
    }

    public final boolean c() {
        this.f2116c.f1655a = this.f2114a.E();
        r90 r90Var = this.f2116c;
        if (r90Var.f1655a) {
            r90Var.f1657c = this.f2114a.r();
            this.f2116c.f1658d = this.f2114a.t();
            this.f2116c.f1659e = this.f2114a.u();
            this.f2116c.f1660f = this.f2114a.v();
            this.f2116c.f1656b = Long.valueOf(this.f2114a.s());
        }
        Long l2 = this.f2116c.f1656b;
        if (l2 != null) {
            if (DateTimeUtils.nowInSeconds() > l2.longValue()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) u90.f1926a, 7, (Object) null);
                this.f2116c = new r90();
            }
        }
        return this.f2116c.f1655a;
    }

    public final void d() {
        BrazeLogger.INSTANCE.setSdkDebuggerCallback$android_sdk_base_release(null);
        this.f2116c = new r90();
        ReentrantLock reentrantLock = this.f2121h;
        reentrantLock.lock();
        try {
            this.f2119f.clear();
            this.f2120g = 0;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
