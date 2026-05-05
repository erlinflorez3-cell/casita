package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cv implements e10 {

    /* JADX INFO: renamed from: a */
    public final e10 f435a;

    /* JADX INFO: renamed from: b */
    public final v00 f436b;

    public cv(tc0 sessionStorageManager, vw eventPublisher) {
        Intrinsics.checkNotNullParameter(sessionStorageManager, "sessionStorageManager");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        this.f435a = sessionStorageManager;
        this.f436b = eventPublisher;
    }

    @Override // bo.app.e10
    public final zb0 a() {
        try {
            return this.f435a.a();
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) av.f225a, 4, (Object) null);
            a(this.f436b, e2);
            return null;
        }
    }

    public final void a(v00 eventPublisher, Exception throwable) {
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            ((vw) eventPublisher).b(uc0.class, new uc0("A storage exception has occurred. Please view the stack trace for more details.", throwable));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) zu.f2439a, 4, (Object) null);
        }
    }

    @Override // bo.app.e10
    public final void a(w40 session) {
        Intrinsics.checkNotNullParameter(session, "session");
        try {
            this.f435a.a(session);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) bv.f301a, 4, (Object) null);
            a(this.f436b, e2);
        }
    }

    @Override // bo.app.e10
    public final void a(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        try {
            this.f435a.a(sessionId);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) yu.f2330a, 4, (Object) null);
            a(this.f436b, e2);
        }
    }
}
