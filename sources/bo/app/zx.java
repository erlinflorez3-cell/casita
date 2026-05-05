package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class zx extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2443a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(String str) {
        super(0);
        this.f2443a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Not logging a Feature Flag impression for Feature Flag with id "), this.f2443a, ". The Feature Flag was not part of any matching campaign");
    }
}
