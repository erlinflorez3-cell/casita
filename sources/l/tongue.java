package l;

import o.taste;

/* JADX INFO: loaded from: classes6.dex */
public final class tongue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q.superior f19853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p.tongue f19854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final taste f19855c;

    public tongue(q.superior superiorVar, p.tongue tongueVar, taste tasteVar) {
        this.f19853a = superiorVar;
        this.f19854b = tongueVar;
        this.f19855c = tasteVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r0 == r7) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof l.superior
            if (r0 == 0) goto L95
            r6 = r11
            l.superior r6 = (l.superior) r6
            int r3 = r6.f19852e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r3
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L95
            int r3 = r3 - r2
            r6.f19852e = r3
        L17:
            java.lang.Object r0 = r6.f19850c
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f19852e
            r8 = 2
            r2 = 1
            r5 = 0
            if (r1 == 0) goto L3c
            if (r1 == r2) goto L6e
            if (r1 != r8) goto L9c
            java.lang.Object r4 = r6.f19849b
            j0.pair r4 = (j0.pair) r4
            java.lang.Object r3 = r6.f19848a
            o0.pair r3 = (o0.pair) r3
            kotlin.ResultKt.throwOnFailure(r0)
        L33:
            r5 = r0
            h0.pair r5 = (h0.pair) r5
        L36:
            f0.superior r0 = new f0.superior
            r0.<init>(r3, r4, r5)
            return r0
        L3c:
            kotlin.ResultKt.throwOnFailure(r0)
            q.superior r1 = r9.f19853a
            if (r1 != 0) goto L4e
            p.tongue r0 = r9.f19854b
            if (r0 != 0) goto L4e
            o.taste r0 = r9.f19855c
            if (r0 != 0) goto L4e
            f0.pair r0 = f0.pair.f18517a
            return r0
        L4e:
            if (r1 == 0) goto L67
            o0.pair r3 = r1.a()
        L54:
            if (r10 == 0) goto L6b
            p.tongue r0 = r9.f19854b
            if (r0 == 0) goto L6b
            r6.f19848a = r9
            r6.f19849b = r3
            r6.f19852e = r2
            java.lang.Object r0 = r0.a(r6)
            if (r0 != r7) goto L69
            goto L93
        L67:
            r3 = r5
            goto L54
        L69:
            r1 = r9
            goto L79
        L6b:
            r1 = r9
            r4 = r5
            goto L7c
        L6e:
            java.lang.Object r3 = r6.f19849b
            o0.pair r3 = (o0.pair) r3
            java.lang.Object r1 = r6.f19848a
            l.tongue r1 = (l.tongue) r1
            kotlin.ResultKt.throwOnFailure(r0)
        L79:
            j0.pair r0 = (j0.pair) r0
            r4 = r0
        L7c:
            o.taste r2 = r1.f19855c
            if (r2 == 0) goto L36
            r6.f19848a = r3
            r6.f19849b = r4
            r6.f19852e = r8
            kotlinx.coroutines.MainCoroutineDispatcher r1 = r2.f26833b
            o.civilian r0 = new o.civilian
            r0.<init>(r2, r5)
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r1, r0, r6)
            if (r0 != r7) goto L94
        L93:
            return r7
        L94:
            goto L33
        L95:
            l.superior r6 = new l.superior
            r6.<init>(r9, r11)
            goto L17
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.tongue.a(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
