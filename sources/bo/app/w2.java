package bo.app;

import com.braze.Braze;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class w2 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f2096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2097b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(Braze braze, String str) {
        super(0);
        this.f2096a = braze;
        this.f2097b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((ci0) this.f2096a.getUdm$android_sdk_base_release()).f407z.a(this.f2097b);
        return Unit.INSTANCE;
    }
}
