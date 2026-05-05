package r;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class apparatus extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final apparatus f28245a = new apparatus();

    public apparatus() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objM8980constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(System.getenv("PATH"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8986isFailureimpl(objM8980constructorimpl)) {
            objM8980constructorimpl = null;
        }
        String str = (String) objM8980constructorimpl;
        return str == null ? "" : str;
    }
}
