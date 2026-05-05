package bo.app;

import com.braze.support.BrazeLogger;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class fu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f686b = BrazeLogger.getBrazeLogTag((Class<?>) fu.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Job f687a;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(bo.app.fu r13, kotlin.coroutines.Continuation r14) {
        /*
            r13.getClass()
            boolean r0 = r14 instanceof bo.app.ht
            if (r0 == 0) goto L66
            r3 = r14
            bo.app.ht r3 = (bo.app.ht) r3
            int r2 = r3.f854d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r3.f854d = r2
        L15:
            java.lang.Object r5 = r3.f852b
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.f854d
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 == r1) goto L54
            if (r0 != r4) goto L6c
            bo.app.fu r13 = r3.f851a
            kotlin.ResultKt.throwOnFailure(r5)
        L2a:
            r0 = 0
            r13.f687a = r0
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L2f:
            return r2
        L30:
            kotlin.ResultKt.throwOnFailure(r5)
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r6 = bo.app.fu.f686b
            bo.app.jt r10 = new bo.app.jt
            r10.<init>(r13)
            r11 = 14
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.Job r0 = r13.f687a
            if (r0 == 0) goto L2a
            r3.f851a = r13
            r3.f854d = r1
            java.lang.Object r0 = kotlinx.coroutines.JobKt.cancelAndJoin(r0, r3)
            if (r0 != r2) goto L59
            goto L2f
        L54:
            bo.app.fu r13 = r3.f851a
            kotlin.ResultKt.throwOnFailure(r5)
        L59:
            r3.f851a = r13
            r3.f854d = r4
            r0 = 50
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r3)
            if (r0 != r2) goto L2a
            goto L2f
        L66:
            bo.app.ht r3 = new bo.app.ht
            r3.<init>(r13, r14)
            goto L15
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.fu.a(bo.app.fu, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e3  */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v18, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b2 -> B:11:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(bo.app.fu r18, kotlinx.coroutines.CoroutineScope r19, kotlinx.coroutines.channels.ReceiveChannel r20, kotlin.jvm.functions.Function1 r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.fu.a(bo.app.fu, kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
