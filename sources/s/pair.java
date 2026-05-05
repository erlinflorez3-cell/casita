package s;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pair extends FunctionReferenceImpl implements Function0 {
    public pair() {
        super(0, misplace.f28282a, misplace.class, "getMac", "getMac()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((misplace) this.receiver).getClass();
        return misplace.a();
    }
}
