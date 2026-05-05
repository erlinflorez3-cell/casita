package r0;

import i1.close;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tongue extends FunctionReferenceImpl implements Function1 {
    public tongue() {
        super(1, close.f19714a, close.class, "stringToMD5", "stringToMD5(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((close) this.receiver).getClass();
        return close.c((String) obj);
    }
}
