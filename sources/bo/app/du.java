package bo.app;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class du extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Ref.ObjectRef f518a;

    /* JADX INFO: renamed from: b */
    public Ref.ObjectRef f519b;

    /* JADX INFO: renamed from: c */
    public int f520c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f521d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fu f522e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Function1 f523f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f524g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du(fu fuVar, Function1 function1, String str, Continuation continuation) {
        super(2, continuation);
        this.f522e = fuVar;
        this.f523f = function1;
        this.f524g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        du duVar = new du(this.f522e, this.f523f, this.f524g, continuation);
        duVar.f521d = obj;
        return duVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((du) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00fe A[Catch: all -> 0x0159, TryCatch #4 {all -> 0x0159, blocks: (B:104:0x00da, B:105:0x00dd, B:115:0x00f8, B:117:0x00fe, B:118:0x010e, B:87:0x0053), top: B:141:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x010e A[Catch: all -> 0x0159, TRY_LEAVE, TryCatch #4 {all -> 0x0159, blocks: (B:104:0x00da, B:105:0x00dd, B:115:0x00f8, B:117:0x00fe, B:118:0x010e, B:87:0x0053), top: B:141:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0144 A[PHI: r0
  0x0144: PHI (r0v9 java.net.HttpURLConnection) = (r0v6 java.net.HttpURLConnection), (r0v11 java.net.HttpURLConnection) binds: [B:120:0x0130, B:123:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a4 A[Catch: all -> 0x00f2, Exception -> 0x00f4, TryCatch #1 {all -> 0x00f2, blocks: (B:91:0x006e, B:93:0x007c, B:95:0x00a4, B:98:0x00c5, B:100:0x00cf, B:96:0x00a7), top: B:135:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a7 A[Catch: all -> 0x00f2, Exception -> 0x00f4, TRY_LEAVE, TryCatch #1 {all -> 0x00f2, blocks: (B:91:0x006e, B:93:0x007c, B:95:0x00a4, B:98:0x00c5, B:100:0x00cf, B:96:0x00a7), top: B:135:0x006e }] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, java.net.HttpURLConnection] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.du.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
