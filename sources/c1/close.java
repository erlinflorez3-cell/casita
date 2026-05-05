package c1;

import java.io.FileInputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class close extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ skate f2492a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public close(skate skateVar) {
        super(1);
        this.f2492a = skateVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objM8980constructorimpl;
        i1.sea seaVar = (i1.sea) obj;
        skate skateVar = this.f2492a;
        skateVar.getClass();
        try {
            Result.Companion companion = Result.Companion;
            i1.stain stainVar = (i1.stain) seaVar;
            stainVar.getClass();
            FileInputStream fileInputStream = new FileInputStream(stainVar.f19724a);
            try {
                y0.fabricate fabricateVar = (y0.fabricate) y0.fabricate.a().b(((i1.stain) seaVar).f19724a.getName()).a((String) skateVar.f2511e.invoke(fileInputStream)).build();
                CloseableKt.closeFinally(fileInputStream, null);
                objM8980constructorimpl = Result.m8980constructorimpl(fabricateVar);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        return (y0.fabricate) (Result.m8986isFailureimpl(objM8980constructorimpl) ? null : objM8980constructorimpl);
    }
}
