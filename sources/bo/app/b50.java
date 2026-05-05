package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class b50 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f243a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b50(String str) {
        super(0);
        this.f243a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Stored user ID is longer than 997 bytes. Truncating. Original user ID: " + this.f243a;
    }
}
