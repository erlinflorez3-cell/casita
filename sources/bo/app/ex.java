package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ex implements f00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f00 f595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v00 f596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f597c;

    public ex(pc0 storage, vw eventPublisher) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        this.f595a = storage;
        this.f596b = eventPublisher;
    }

    @Override // bo.app.f00
    public final Collection a() {
        if (this.f597c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) xw.f2246a, 6, (Object) null);
            return SetsKt.emptySet();
        }
        try {
            return this.f595a.a();
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) yw.f2332a, 4, (Object) null);
            a(e2);
            return SetsKt.emptySet();
        }
    }

    @Override // bo.app.f00
    public final void a(e00 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = "add event " + event;
        ww wwVar = new ww(this, event);
        if (this.f597c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ax(str), 6, (Object) null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new cx(wwVar, this, str, null), 3, null);
        }
    }

    public final void a(Exception exc) {
        try {
            ((vw) this.f596b).b(uc0.class, new uc0("A storage exception has occurred!", exc));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) dx.f527a, 4, (Object) null);
        }
    }

    @Override // bo.app.f00
    public final void a(Set events) {
        Intrinsics.checkNotNullParameter(events, "events");
        String str = "delete events " + events;
        zw zwVar = new zw(this, events);
        if (this.f597c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ax(str), 6, (Object) null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new cx(zwVar, this, str, null), 3, null);
        }
    }

    @Override // bo.app.f00
    public final void close() {
        this.f597c = true;
    }
}
