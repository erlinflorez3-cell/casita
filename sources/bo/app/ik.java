package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ik extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(String str, double d2, double d3) {
        super(0);
        this.f920a = str;
        this.f921b = d2;
        this.f922c = d3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to set custom location attribute with key '" + this.f920a + "' and latitude '" + this.f921b + "' and longitude '" + this.f922c + '\'';
    }
}
