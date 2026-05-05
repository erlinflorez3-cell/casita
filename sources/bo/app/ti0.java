package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ti0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1875b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti0(String str, String str2) {
        super(0);
        this.f1874a = str;
        this.f1875b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Html content zip downloaded. " + this.f1874a + " to " + this.f1875b;
    }
}
