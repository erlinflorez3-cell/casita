package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class uc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f1931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(Ref.IntRef intRef, long j2, long j3) {
        super(0);
        this.f1931a = intRef;
        this.f1932b = j2;
        this.f1933c = j3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Using image sample size of " + this.f1931a.element + ". Image will be scaled to width: " + (this.f1932b / ((long) this.f1931a.element)) + " and height: " + (this.f1933c / ((long) this.f1931a.element));
    }
}
