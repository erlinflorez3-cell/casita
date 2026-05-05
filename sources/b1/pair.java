package b1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import y0.survey;

/* JADX INFO: loaded from: classes4.dex */
public final class pair extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pair f156a = new pair();

    public pair() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return survey.d().a(System.currentTimeMillis());
    }
}
