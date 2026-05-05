package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class hk extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double f836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f837b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(double d2, double d3) {
        super(0);
        this.f836a = d2;
        this.f837b = d3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Cannot set custom location attribute due with invalid latitude '" + this.f836a + " and longitude '" + this.f837b + '\'';
    }
}
