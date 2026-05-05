package x0;

import i1.close;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineDispatcher;
import w0.fling;
import w0.profile;
import w0.skate;
import w0.stain;

/* JADX INFO: loaded from: classes2.dex */
public final class abundant {

    /* JADX INFO: renamed from: a */
    public final fling f28422a;

    /* JADX INFO: renamed from: b */
    public final boolean f28423b;

    /* JADX INFO: renamed from: c */
    public final String f28424c;

    /* JADX INFO: renamed from: d */
    public final String f28425d;

    /* JADX INFO: renamed from: e */
    public final String f28426e;

    /* JADX INFO: renamed from: f */
    public final f1.apparatus f28427f;

    /* JADX INFO: renamed from: g */
    public final CoroutineDispatcher f28428g;

    /* JADX INFO: renamed from: h */
    public final Function1 f28429h;

    /* JADX INFO: renamed from: i */
    public final String f28430i;

    /* JADX INFO: renamed from: j */
    public final String f28431j;

    public abundant(fling flingVar, boolean z2, String str, String str2, String str3, f1.apparatus apparatusVar, CoroutineDispatcher coroutineDispatcher, Function1 function1) {
        this.f28422a = flingVar;
        this.f28423b = z2;
        this.f28424c = str;
        this.f28425d = str2;
        this.f28426e = str3;
        this.f28427f = apparatusVar;
        this.f28428g = coroutineDispatcher;
        this.f28429h = function1;
        this.f28430i = str3 + "/in/" + close.a() + "/9/" + close.a();
        this.f28431j = str3 + "/in/g";
    }

    public static Object a(stain stainVar) {
        if (!(stainVar instanceof skate)) {
            Result.Companion companion = Result.Companion;
            return Result.m8980constructorimpl((profile) stainVar);
        }
        if (stainVar instanceof w0.abundant) {
            Result.Companion companion2 = Result.Companion;
            return Result.m8980constructorimpl(ResultKt.createFailure(((w0.abundant) stainVar).f28374b));
        }
        if (!(stainVar instanceof w0.close)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Companion companion3 = Result.Companion;
        return Result.m8980constructorimpl(ResultKt.createFailure(new tongue("Request failed with code " + stainVar.f28403a)));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(k0.pair r12, d0.pair r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.abundant.a(k0.pair, d0.pair, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(k0.pair r12, y0.absolute r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.abundant.a(k0.pair, y0.absolute, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof x0.apparatus
            if (r0 == 0) goto L57
            r5 = r7
            x0.apparatus r5 = (x0.apparatus) r5
            int r3 = r5.f28436e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r3
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L57
            int r3 = r3 - r2
            r5.f28436e = r3
        L17:
            java.lang.Object r1 = r5.f28434c
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.f28436e
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 != r3) goto Lba
            x0.abundant r0 = r5.f28433b
            x0.abundant r2 = r5.f28432a
            kotlin.ResultKt.throwOnFailure(r1)
        L2b:
            w0.stain r1 = (w0.stain) r1
            r0.getClass()
            java.lang.Object r1 = a(r1)
            boolean r0 = kotlin.Result.m8987isSuccessimpl(r1)
            if (r0 == 0) goto Lb5
            goto L5d
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            w0.fling r2 = r6.f28422a
            java.lang.String r1 = r6.f28430i
            x0.civilian r0 = new x0.civilian
            r0.<init>(r6)
            r5.f28432a = r6
            r5.f28433b = r6
            r5.f28436e = r3
            java.lang.Object r1 = r2.a(r1, r0, r5)
            if (r1 != r4) goto L54
            return r4
        L54:
            r2 = r6
            r0 = r2
            goto L2b
        L57:
            x0.apparatus r5 = new x0.apparatus
            r5.<init>(r6, r7)
            goto L17
        L5d:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La9
            w0.profile r1 = (w0.profile) r1     // Catch: java.lang.Throwable -> La9
            boolean r0 = r1 instanceof w0.proposal     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L93
            kotlin.jvm.functions.Function1 r2 = r2.f28429h     // Catch: java.lang.Throwable -> La9
            w0.proposal r1 = (w0.proposal) r1     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = r1.f28397b     // Catch: java.lang.Throwable -> La9
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> La9
            byte[] r0 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> La9
            java.lang.Object r0 = r2.invoke(r0)     // Catch: java.lang.Throwable -> La9
            kotlin.Result r0 = (kotlin.Result) r0     // Catch: java.lang.Throwable -> La9
            java.lang.Object r2 = r0.m8989unboximpl()     // Catch: java.lang.Throwable -> La9
            boolean r0 = kotlin.Result.m8987isSuccessimpl(r2)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L9b
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L91
            q0.pair r1 = new q0.pair     // Catch: java.lang.Throwable -> L91
            y0.lifestyle r0 = y0.lifestyle.a(r2)     // Catch: java.lang.Throwable -> L91
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L91
            java.lang.Object r0 = kotlin.Result.m8980constructorimpl(r1)     // Catch: java.lang.Throwable -> L91
            goto L9f
        L91:
            r1 = move-exception
            goto L95
        L93:
            r0 = 0
            goto La4
        L95:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La9
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r1)     // Catch: java.lang.Throwable -> La9
        L9b:
            java.lang.Object r0 = kotlin.Result.m8980constructorimpl(r2)     // Catch: java.lang.Throwable -> La9
        L9f:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> La9
            q0.pair r0 = (q0.pair) r0     // Catch: java.lang.Throwable -> La9
        La4:
            java.lang.Object r0 = kotlin.Result.m8980constructorimpl(r0)     // Catch: java.lang.Throwable -> La9
            goto Lb4
        La9:
            r1 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r0 = kotlin.Result.m8980constructorimpl(r0)
        Lb4:
            return r0
        Lb5:
            java.lang.Object r0 = kotlin.Result.m8980constructorimpl(r1)
            return r0
        Lba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.abundant.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
