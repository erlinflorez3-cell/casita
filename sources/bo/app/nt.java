package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class nt extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1397b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(String str, String str2) {
        super(0);
        this.f1396a = str;
        this.f1397b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return h1.a(new StringBuilder("Not handling event: '").append(this.f1396a).append("' and data: '"), this.f1397b, '\'');
    }
}
