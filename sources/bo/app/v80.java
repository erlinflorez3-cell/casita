package bo.app;

import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class v80 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f2008n = BrazeLogger.getBrazeLogTag((Class<?>) v80.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f2009o = TimeUnit.HOURS.toMillis(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f2010p = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cs f2011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c10 f2012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f2015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Job f2016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f2017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i90 f2018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f2020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f2021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rd0 f2022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z40 f2023m;

    public v80(cs dispatchDataProvider, y70 requestExecutor, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        this.f2011a = dispatchDataProvider;
        this.f2012b = requestExecutor;
        this.f2013c = z2;
        this.f2014d = z3;
        this.f2015e = new LinkedHashMap();
        this.f2017g = new ReentrantLock();
        this.f2019i = -1L;
        this.f2020j = -1L;
        this.f2021k = new AtomicInteger(0);
        this.f2022l = new rd0(dispatchDataProvider.b().i(), dispatchDataProvider.b().j(), pd0.a(dispatchDataProvider));
        this.f2023m = z40.GOOD;
        a().c(new IEventSubscriber() { // from class: bo.app.v80$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                v80.a(this.f$0, (tr) obj);
            }
        }, tr.class);
        a().c(new IEventSubscriber() { // from class: bo.app.v80$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                v80.a(this.f$0, (a50) obj);
            }
        }, a50.class);
    }

    public static void a(v80 v80Var) {
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        ReentrantLock reentrantLock = v80Var.f2017g;
        reentrantLock.lock();
        try {
            if (!v80Var.a(jNowInMilliseconds)) {
                Iterator it = v80Var.f2015e.entrySet().iterator();
                while (it.hasNext()) {
                    v80Var.a(jNowInMilliseconds, (uu) ((Map.Entry) it.next()).getValue());
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void a(v80 this$0, a50 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f2008n, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z70(it), 14, (Object) null);
        this$0.f2023m = it.f173b;
    }

    public static final void a(v80 this$0, tr trVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(trVar, "<name for destructuring parameter 0>");
        int i2 = trVar.f1885a;
        l00 l00Var = trVar.f1888d;
        ReentrantLock reentrantLock = this$0.f2017g;
        reentrantLock.lock();
        try {
            if (b80.f251a[gc0.a(i2)] == 1 && l00Var != null) {
                this$0.a(l00Var);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static boolean a(v80 v80Var, long j2, l00 l00Var, z80 z80Var, a80 a80Var) {
        v80Var.getClass();
        boolean z2 = l00Var.a() || v80Var.f2013c;
        c10 c10Var = z2 ? ((ci0) v80Var.f2011a.f430a).C : v80Var.f2012b;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) v80Var, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new c80(z2, z80Var, j2), 3, (Object) null);
        c10Var.a(z80Var, a80Var, false);
        return z2;
    }

    public final vw a() {
        return this.f2011a.a();
    }

    public final void a(long j2, uu queue) throws Throwable {
        a90 a90Var;
        int i2;
        Intrinsics.checkNotNullParameter(queue, "queue");
        if (j2 <= queue.f1974g) {
            return;
        }
        queue.a(j2);
        ArrayList arrayList = queue.f1973f;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((z80) obj).f2366d == a90.BATCHED) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int i3 = ((z80) it.next()).f2370h;
            loop1: while (true) {
                i2 = i3;
                while (it.hasNext()) {
                    i3 = ((z80) it.next()).f2370h;
                    if (i2 < i3) {
                        break;
                    }
                }
            }
            ArrayList arrayList3 = queue.f1973f;
            ArrayList<z80> arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                a90 a90Var2 = ((z80) obj2).f2366d;
                if (a90Var2 == a90.PENDING_START || a90Var2 == a90.PENDING_RETRY) {
                    arrayList4.add(obj2);
                }
            }
            for (z80 z80Var : arrayList4) {
                z80Var.f2370h = i2;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, queue, (BrazeLogger.Priority) null, (Throwable) null, queue.d(), new lu(z80Var, j2, i2), 3, (Object) null);
            }
        }
        ArrayList<z80> arrayList5 = new ArrayList();
        ArrayList arrayList6 = queue.f1973f;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : arrayList6) {
            a90 a90Var3 = ((z80) obj3).f2366d;
            if (a90Var3 == a90.BATCHED || a90Var3 == a90.COMPLETE) {
                arrayList7.add(obj3);
            }
        }
        arrayList5.addAll(arrayList7);
        ArrayList arrayList8 = queue.f1973f;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj4 : arrayList8) {
            z80 z80Var2 = (z80) obj4;
            if (z80Var2.f2370h >= 15 && ((a90Var = z80Var2.f2366d) == a90.PENDING_RETRY || a90Var == a90.PENDING_START)) {
                arrayList9.add(obj4);
            }
        }
        arrayList5.addAll(arrayList9);
        for (z80 z80Var3 : arrayList5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, uu.f1967k, (BrazeLogger.Priority) null, (Throwable) null, queue.d(), (Function0) new mu(j2, z80Var3), 6, (Object) null);
            z80Var3.f2363a.a((v00) queue.f1969b.a());
        }
        queue.f1973f.removeAll(arrayList5);
        ArrayList arrayList10 = queue.f1973f;
        ArrayList<z80> arrayList11 = new ArrayList();
        for (Object obj5 : arrayList10) {
            z80 z80Var4 = (z80) obj5;
            a90 a90Var4 = z80Var4.f2366d;
            if (a90Var4 == a90.PENDING_START || a90Var4 == a90.PENDING_RETRY) {
                if (j2 >= z80Var4.f2364b) {
                    arrayList11.add(obj5);
                }
            }
        }
        for (z80 requestInfo : arrayList11) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, queue.d(), new m80(j2, requestInfo), 3, (Object) null);
            if (b(j2)) {
                rd0 rd0VarB = queue.b();
                if (rd0VarB != null && rd0VarB.a(j2) < 1.0d) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) o80.f1427a, 7, (Object) null);
                    rd0 rd0VarB2 = queue.b();
                    requestInfo.f2364b = (rd0VarB2 != null ? rd0VarB2.c() : 0L) + j2;
                } else {
                    l00 l00VarA = this.f2011a.a(requestInfo.f2363a);
                    Intrinsics.checkNotNullParameter(queue, "queue");
                    Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
                    g80 g80Var = new g80(this, requestInfo, queue);
                    requestInfo.a(j2, a90.IN_FLIGHT);
                    rd0 rd0VarB3 = queue.b();
                    requestInfo.f2368f = (rd0VarB3 == null ? null : Integer.valueOf((int) rd0VarB3.a(j2))) != null ? Integer.valueOf(RangesKt.coerceAtLeast(r4.intValue() - 1, 0)) : null;
                    requestInfo.f2367e = RangesKt.coerceAtLeast(((int) this.f2022l.a(j2)) - 1, 0);
                    if (!a(this, j2, l00VarA, requestInfo, g80Var)) {
                        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
                        this.f2022l.b();
                        if (!b(j2)) {
                            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new k80(requestInfo, j2, this.f2022l.c(), this), 7, (Object) null);
                        }
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new l80(this, j2), 3, (Object) null);
                        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
                        rd0 rd0VarB4 = queue.b();
                        if (rd0VarB4 != null) {
                            rd0VarB4.b();
                            rd0 rd0VarB5 = queue.b();
                            if (rd0VarB5 != null && rd0VarB5.a(j2) < 1.0d) {
                                BrazeLogger.brazelog$default(brazeLogger, queue, (BrazeLogger.Priority) null, (Throwable) null, queue.d(), new pu(requestInfo, j2, rd0VarB4.c(), rd0VarB4), 3, (Object) null);
                            }
                            BrazeLogger.brazelog$default(brazeLogger, (Object) queue, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qu(j2, queue), 7, (Object) null);
                        }
                    }
                }
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) n80.f1348a, 7, (Object) null);
            }
        }
    }

    public final void a(l00 request) {
        uu bmVar;
        Intrinsics.checkNotNullParameter(request, "request");
        k00 k00VarC = request.c();
        if (this.f2015e.containsKey(k00VarC)) {
            bmVar = (uu) this.f2015e.get(k00VarC);
        } else {
            int iOrdinal = k00VarC.ordinal();
            if (iOrdinal == 0) {
                bmVar = new bm(this.f2011a);
            } else if (iOrdinal == 1) {
                bmVar = new tx(this.f2011a);
            } else if (iOrdinal == 2) {
                bmVar = new eo(this.f2011a);
            } else if (iOrdinal != 3) {
                switch (iOrdinal) {
                    case 8:
                        bmVar = new y90(this.f2011a);
                        break;
                    case 9:
                        bmVar = new da0(this.f2011a);
                        break;
                    case 10:
                        bmVar = new fs(this.f2011a);
                        break;
                    default:
                        bmVar = new iq(k00VarC, this.f2011a);
                        break;
                }
            } else {
                bmVar = new ed0(this.f2011a);
            }
            this.f2015e.put(k00VarC, bmVar);
        }
        if (bmVar == null) {
            return;
        }
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        Intrinsics.checkNotNullParameter(request, "request");
        request.a(bmVar.f1969b.a());
        bmVar.f1973f.add(new z80(request, jNowInMilliseconds + bmVar.f1975h, jNowInMilliseconds, a90.PENDING_START, 0, null));
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, bmVar, (BrazeLogger.Priority) null, (Throwable) null, bmVar.d(), new ku(jNowInMilliseconds, bmVar), 3, (Object) null);
    }

    public final boolean a(long j2) {
        if (this.f2014d && this.f2023m == z40.NONE) {
            return true;
        }
        i90 i90Var = this.f2018h;
        if (i90Var != null && j2 < this.f2020j) {
            if (Intrinsics.areEqual(((ci0) this.f2011a.f430a).f399r.f1092d.getString("auth_signature", null), ((tg) i90Var.f887a).f1867i)) {
                return true;
            }
        }
        return !b(j2);
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f2008n, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) p80.f1495a, 14, (Object) null);
        Job job = this.f2016f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        cp cpVar = new cp(this.f2011a.b(), ((ci0) this.f2011a.f430a).f383b.getBaseUrlForRequests(), new k50(null, null, null, null));
        this.f2011a.a(cpVar);
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        a(this, jNowInMilliseconds, cpVar, new z80(cpVar, jNowInMilliseconds, jNowInMilliseconds, a90.PENDING_START, 0, null), new s80());
    }

    public final boolean b(long j2) {
        return !this.f2011a.b().C() || this.f2022l.a(j2) >= 1.0d;
    }
}
