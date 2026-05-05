package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f159b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj, boolean z2) {
        super(0);
        this.f158a = obj;
        this.f159b = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Tried to confirm outboundObject [" + this.f158a + "] with success [" + this.f159b + "], but the cache wasn't locked, so not doing anything.";
    }
}
