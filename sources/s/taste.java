package s;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class taste extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final taste f28287a = new taste();

    public taste() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        return Integer.toString((bByteValue + 255) - (bByteValue | 255), CharsKt.checkRadix(16));
    }
}
