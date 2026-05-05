package k;

import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
public final class civilian implements j.superior {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final apparatus f19811d = new apparatus();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pair f19812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final superior f19813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tongue f19814c;

    public civilian(Application application) {
        pair pairVar = new pair(application);
        superior superiorVar = new superior(application);
        tongue tongueVar = new tongue(application);
        this.f19812a = pairVar;
        this.f19813b = superiorVar;
        this.f19814c = tongueVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0026 A[SYNTHETIC] */
    @Override // j.superior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList a(java.util.ArrayList r13) throws java.lang.Throwable {
        /*
            r12 = this;
            k.pair r0 = r12.f19812a
            android.app.Application r0 = r0.f19819a
            java.util.List r0 = i1.muscle.b(r0)
            java.util.Set r7 = kotlin.collections.CollectionsKt.toSet(r0)
            k.superior r0 = r12.f19813b
            android.app.Application r0 = r0.f19827a
            java.util.Set r6 = androidx.core.app.NotificationManagerCompat.getEnabledListenerPackages(r0)
            k.tongue r0 = r12.f19814c
            java.lang.Object r5 = r0.invoke()
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r3 = r13.size()
            r2 = 0
        L26:
            if (r2 >= r3) goto Lbd
            java.lang.Object r1 = r13.get(r2)
            int r2 = r2 + 1
            r9 = r1
            e0.pair r9 = (e0.pair) r9
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L92
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L92
        L3b:
            e0.tongue r8 = r9.f18470n
            e0.tongue r0 = e0.tongue.f18481b
            if (r8 != r0) goto L26
            java.util.List r8 = r9.f18467k
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L4e
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L4e
            goto L26
        L4e:
            java.util.Iterator r11 = r8.iterator()
        L52:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r9 = r11.next()
            e0.civilian r9 = (e0.civilian) r9
            java.lang.String r8 = r9.f18454b
            java.lang.String r0 = "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r0)
            if (r0 == 0) goto L52
            java.lang.String r8 = r9.f18455c
            java.lang.String r10 = r9.f18453a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r0 = "/"
            java.lang.StringBuilder r0 = r8.append(r0)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r0 = r0.toString()
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto Lb8
            java.lang.String r0 = r9.f18455c
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L52
            goto Lb8
        L92:
            java.util.Iterator r11 = r5.iterator()
        L96:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r10 = r11.next()
            android.content.pm.ResolveInfo r10 = (android.content.pm.ResolveInfo) r10
            java.lang.String r8 = r10.resolvePackageName
            java.lang.String r0 = r9.f18457a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r0)
            if (r0 != 0) goto Lb8
            android.content.pm.ActivityInfo r0 = r10.activityInfo
            java.lang.String r8 = r0.packageName
            java.lang.String r0 = r9.f18457a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r0)
            if (r0 == 0) goto L96
        Lb8:
            r4.add(r1)
            goto L26
        Lbd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k.civilian.a(java.util.ArrayList):java.util.ArrayList");
    }
}
