package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1477b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(String str, String str2) {
        super(0);
        this.f1476a = str;
        this.f1477b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to update ContentCard storage provider with single card update. User id: " + this.f1476a + " Serialized json: " + this.f1477b;
    }
}
