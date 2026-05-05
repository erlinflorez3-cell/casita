package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class df extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf f487a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(tf tfVar) {
        super(0);
        this.f487a = tfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Completed the openSession call. Starting or continuing session " + this.f487a.f1840c.d();
    }
}
