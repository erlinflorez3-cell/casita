package i1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class fabricate extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fabricate f19715a = new fabricate();

    public fabricate() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Integer.toString(((-1) - (((-1) - ((Number) obj).byteValue()) | ((-1) - 255))) | 256, CharsKt.checkRadix(16)).substring(1);
    }
}
