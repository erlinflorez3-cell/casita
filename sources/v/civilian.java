package v;

import com.cleafy.mobile.detection.agent.configuration.CleafyConfiguration;
import f.misplace;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes2.dex */
public final class civilian {

    /* JADX INFO: renamed from: a */
    public final CleafyConfiguration f28337a;

    /* JADX INFO: renamed from: b */
    public final r0.apparatus f28338b;

    /* JADX INFO: renamed from: c */
    public final misplace f28339c;

    /* JADX INFO: renamed from: d */
    public final t.misplace f28340d;

    /* JADX INFO: renamed from: e */
    public final CoroutineScope f28341e;

    /* JADX INFO: renamed from: f */
    public final Lazy f28342f = LazyKt.lazy(new apparatus(this));

    /* JADX INFO: renamed from: g */
    public final Lazy f28343g = LazyKt.lazy(new tongue(this));

    /* JADX INFO: renamed from: h */
    public final Lazy f28344h = LazyKt.lazy(new superior(this));

    public civilian(CleafyConfiguration cleafyConfiguration, r0.apparatus apparatusVar, misplace misplaceVar, t.misplace misplaceVar2, CoroutineScope coroutineScope) {
        this.f28337a = cleafyConfiguration;
        this.f28338b = apparatusVar;
        this.f28339c = misplaceVar;
        this.f28340d = misplaceVar2;
        this.f28341e = coroutineScope;
    }

    public final i0.civilian a() {
        r0.apparatus apparatusVar = this.f28338b;
        return new i0.civilian(apparatusVar.f28262d, apparatusVar.f28261c, apparatusVar.f28264f, apparatusVar.f28259a, this.f28337a.f2790b);
    }

    public final void a(HttpResponse httpResponse, HttpContext httpContext) {
        BuildersKt__Builders_commonKt.launch$default(this.f28341e, null, null, new pair(this, new f.pair(httpResponse, httpContext), null), 3, null);
    }
}
