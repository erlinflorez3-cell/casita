package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1989b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, String str2) {
        super(0);
        this.f1988a = str;
        this.f1989b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Error while retrieving disk for key " + this.f1988a + " diskKey " + this.f1989b;
    }
}
