package bo.app;

import android.app.Activity;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f1243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f1244b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(Activity activity, Braze braze) {
        super(0);
        this.f1243a = activity;
        this.f1244b = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f1243a == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f1244b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) l1.f1153a, 6, (Object) null);
        } else {
            tf tfVar = ((ci0) this.f1244b.getUdm$android_sdk_base_release()).f403v;
            Activity activity = this.f1243a;
            tfVar.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (tfVar.f1846i.f1095a.getBoolean("appboy_sdk_disabled", false)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) tfVar, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) le.f1190a, 6, (Object) null);
            } else if (tfVar.f1858u == null || Intrinsics.areEqual(activity.getClass(), tfVar.f1858u)) {
                tfVar.f1845h.a();
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) tfVar, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new me(activity), 6, (Object) null);
                ci ciVar = tfVar.f1840c;
                ReentrantLock reentrantLock = ciVar.f377h;
                reentrantLock.lock();
                try {
                    ciVar.c();
                    w40 w40Var = ciVar.f381l;
                    if (w40Var != null) {
                        w40Var.f2377c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                        ciVar.f371b.a(w40Var);
                        Job.DefaultImpls.cancel$default(ciVar.f380k, (CancellationException) null, 1, (Object) null);
                        ciVar.f380k = BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new ai(ciVar, null), 3, null);
                        ciVar.b();
                        ((vw) ciVar.f372c).b(hc0.class, hc0.f822a);
                        BrazeLogger.brazelog$default(brazeLogger, (Object) ciVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new bi(w40Var), 7, (Object) null);
                        Unit unit = Unit.INSTANCE;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
