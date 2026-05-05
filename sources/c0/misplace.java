package c0;

import j.slide;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import s.gregarious;

/* JADX INFO: loaded from: classes4.dex */
public final class misplace {

    /* JADX INFO: renamed from: a */
    public final r0.apparatus f2466a;

    /* JADX INFO: renamed from: b */
    public final slide f2467b;

    /* JADX INFO: renamed from: c */
    public final slide f2468c;

    /* JADX INFO: renamed from: d */
    public final g.tongue f2469d;

    /* JADX INFO: renamed from: e */
    public final m.superior f2470e;

    /* JADX INFO: renamed from: f */
    public final r.misplace f2471f;

    /* JADX INFO: renamed from: g */
    public final gregarious f2472g;

    /* JADX INFO: renamed from: h */
    public final n.taste f2473h;

    /* JADX INFO: renamed from: i */
    public final n.apparatus f2474i;

    /* JADX INFO: renamed from: j */
    public final l.tongue f2475j;

    /* JADX INFO: renamed from: k */
    public final h.superior f2476k;

    /* JADX INFO: renamed from: l */
    public final i.superior f2477l;

    /* JADX INFO: renamed from: m */
    public final t.misplace f2478m;

    /* JADX INFO: renamed from: n */
    public final CoroutineScope f2479n;

    /* JADX INFO: renamed from: o */
    public Job f2480o;

    public misplace(r0.apparatus apparatusVar, slide slideVar, slide slideVar2, g.tongue tongueVar, m.superior superiorVar, r.misplace misplaceVar, gregarious gregariousVar, n.taste tasteVar, n.apparatus apparatusVar2, l.tongue tongueVar2, h.superior superiorVar2, i.superior superiorVar3, t.misplace misplaceVar2, CoroutineScope coroutineScope) {
        this.f2466a = apparatusVar;
        this.f2467b = slideVar;
        this.f2468c = slideVar2;
        this.f2469d = tongueVar;
        this.f2470e = superiorVar;
        this.f2471f = misplaceVar;
        this.f2472g = gregariousVar;
        this.f2473h = tasteVar;
        this.f2474i = apparatusVar2;
        this.f2475j = tongueVar2;
        this.f2476k = superiorVar2;
        this.f2477l = superiorVar3;
        this.f2478m = misplaceVar2;
        this.f2479n = coroutineScope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f0, code lost:
    
        if (r7 == r8) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f7  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(c0.misplace r16, k0.pair r17, d0.apparatus r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.misplace.a(c0.misplace, k0.pair, d0.apparatus, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Job a(k0.pair pairVar) {
        Job job = this.f2480o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.f2479n, null, null, new taste(this, pairVar, null), 3, null);
        this.f2480o = jobLaunch$default;
        return jobLaunch$default;
    }
}
