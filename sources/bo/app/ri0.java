package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ri0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1696b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri0(String str, String str2) {
        super(0);
        this.f1695a = str;
        this.f1696b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Starting download of url: " + this.f1695a + " to " + this.f1696b;
    }
}
