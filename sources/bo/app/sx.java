package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class sx extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1794b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx(String str, Object obj) {
        super(0);
        this.f1793a = str;
        this.f1794b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Property is not of type " + this.f1793a + ". It is " + this.f1794b + '.';
    }
}
