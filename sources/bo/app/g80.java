package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g80 implements a80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v80 f725a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z80 f726b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uu f727c;

    public g80(v80 v80Var, z80 z80Var, uu uuVar) {
        this.f725a = v80Var;
        this.f726b = z80Var;
        this.f727c = uuVar;
    }

    @Override // bo.app.a80
    public final void a(n apiResponse) {
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        v80 v80Var = this.f725a;
        ReentrantLock reentrantLock = v80Var.f2017g;
        z80 z80Var = this.f726b;
        uu uuVar = this.f727c;
        reentrantLock.lock();
        try {
            long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
            s50 s50Var = apiResponse instanceof s50 ? (s50) apiResponse : null;
            d10 d10Var = s50Var != null ? s50Var.f1730d : null;
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, v80.f2008n, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d80(z80Var, jNowInMilliseconds, d10Var), 14, (Object) null);
            z80Var.a(jNowInMilliseconds, a90.PENDING_RETRY);
            uuVar.a(jNowInMilliseconds, z80Var, apiResponse);
            if (d10Var instanceof i90) {
                v80Var.f2019i = jNowInMilliseconds;
                v80Var.f2018h = (i90) d10Var;
                v80Var.f2020j = jNowInMilliseconds + v80.f2009o;
            }
            if (d10Var instanceof x30) {
                v80Var.f2021k.incrementAndGet();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e80(v80Var), 7, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.a80
    public final void a(s50 apiResponse) {
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        ReentrantLock reentrantLock = this.f725a.f2017g;
        z80 z80Var = this.f726b;
        uu uuVar = this.f727c;
        reentrantLock.lock();
        try {
            long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, v80.f2008n, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new f80(jNowInMilliseconds, z80Var), 6, (Object) null);
            z80Var.a(jNowInMilliseconds, a90.COMPLETE);
            uuVar.a(jNowInMilliseconds, z80Var, apiResponse);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
