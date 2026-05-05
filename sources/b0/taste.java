package b0;

import j.slide;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlinx.coroutines.CoroutineScope;
import t.misplace;

/* JADX INFO: loaded from: classes4.dex */
public final class taste {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final slide f142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0.apparatus f143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final misplace f144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Pair f147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f148g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f149h = new LinkedHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f150i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f151j = new LinkedHashMap();

    public taste(slide slideVar, r0.apparatus apparatusVar, misplace misplaceVar, CoroutineScope coroutineScope) {
        this.f142a = slideVar;
        this.f143b = apparatusVar;
        this.f144c = misplaceVar;
        this.f145d = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(b0.taste r5, android.app.Activity r6, boolean r7) {
        /*
            r2 = 0
            if (r7 == 0) goto Ld
            r5.f146e = r2
            java.util.LinkedHashMap r1 = r5.f149h
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.put(r6, r0)
            return r2
        Ld:
            java.util.LinkedHashMap r1 = r5.f149h
            boolean r0 = r1.isEmpty()
            r4 = 1
            if (r0 == 0) goto L77
        L16:
            r3 = r2
        L17:
            java.util.LinkedHashMap r1 = r5.f149h
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.put(r6, r0)
            if (r3 == 0) goto L30
            java.util.LinkedHashMap r1 = r5.f149h
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L56
        L28:
            java.util.LinkedHashMap r1 = r5.f148g
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L31
        L30:
            return r2
        L31:
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L39:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L39
            boolean r0 = r5.f146e
            if (r0 != 0) goto L30
            return r4
        L56:
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L5e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5e
            goto L30
        L77:
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L7f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7f
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.taste.a(b0.taste, android.app.Activity, boolean):boolean");
    }
}
