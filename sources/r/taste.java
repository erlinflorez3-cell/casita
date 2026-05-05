package r;

import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class taste extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final taste f28257a = new taste();

    public taste() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objM8980constructorimpl;
        File file = (File) obj;
        try {
            Result.Companion companion = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(Boolean.valueOf(file.exists()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8983exceptionOrNullimpl(objM8980constructorimpl) != null) {
            objM8980constructorimpl = Boolean.FALSE;
        }
        return (Boolean) objM8980constructorimpl;
    }
}
